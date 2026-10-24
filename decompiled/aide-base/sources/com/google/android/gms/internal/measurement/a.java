package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes.dex */
public final class a {
    private static final Method DW = FH();
    private static final Method FH = Hw();
    private static volatile c Hw = b.j6;
    private final JobScheduler j6;

    private a(JobScheduler jobScheduler) {
        this.j6 = jobScheduler;
    }

    public static int DW(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (DW != null && Hw.j6() && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) ? new a(jobScheduler).j6(jobInfo, str, v5(), str2) : jobScheduler.schedule(jobInfo);
    }

    private static Method FH() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    private static Method Hw() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    static final /* synthetic */ boolean Zo() {
        return false;
    }

    private final int j6(JobInfo jobInfo, String str, int i, String str2) {
        Method method = DW;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.j6, jobInfo, str, Integer.valueOf(i), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.j6.schedule(jobInfo);
    }

    private static int v5() {
        Method method = FH;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }
}
