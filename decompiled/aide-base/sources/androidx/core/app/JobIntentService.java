package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    static final HashMap<ComponentName, h> zh = new HashMap<>();
    b WB;
    a jw;
    final ArrayList<d> k2;
    h mb;
    boolean fY = false;
    boolean qp = false;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            JobIntentService.this.VH();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            JobIntentService.this.VH();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarJ6 = JobIntentService.this.j6();
                if (eVarJ6 == null) {
                    return null;
                }
                JobIntentService.this.v5(eVarJ6.getIntent());
                eVarJ6.j6();
            }
        }
    }

    interface b {
        e DW();

        IBinder j6();
    }

    static final class c extends h {
        private final PowerManager.WakeLock Hw;
        boolean VH;
        boolean Zo;
        private final PowerManager.WakeLock v5;

        c(Context context, ComponentName componentName) {
            super(context, componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.Hw = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.v5 = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.h
        public void DW() {
            synchronized (this) {
                if (this.VH) {
                    if (this.Zo) {
                        this.Hw.acquire(60000L);
                    }
                    this.VH = false;
                    this.v5.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void FH() {
            synchronized (this) {
                if (!this.VH) {
                    this.VH = true;
                    this.v5.acquire(600000L);
                    this.Hw.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void Hw() {
            synchronized (this) {
                this.Zo = false;
            }
        }
    }

    final class d implements e {
        final int DW;
        final Intent j6;

        d(Intent intent, int i) {
            this.j6 = intent;
            this.DW = i;
        }

        @Override // androidx.core.app.JobIntentService.e
        public Intent getIntent() {
            return this.j6;
        }

        @Override // androidx.core.app.JobIntentService.e
        public void j6() {
            JobIntentService.this.stopSelf(this.DW);
        }
    }

    interface e {
        Intent getIntent();

        void j6();
    }

    static final class f extends JobServiceEngine implements b {
        final Object DW;
        JobParameters FH;
        final JobIntentService j6;

        final class a implements e {
            final JobWorkItem j6;

            a(JobWorkItem jobWorkItem) {
                this.j6 = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.e
            public Intent getIntent() {
                return this.j6.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.e
            public void j6() {
                synchronized (f.this.DW) {
                    if (f.this.FH != null) {
                        f.this.FH.completeWork(this.j6);
                    }
                }
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.DW = new Object();
            this.j6 = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public e DW() {
            synchronized (this.DW) {
                if (this.FH == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = this.FH.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.j6.getClassLoader());
                return new a(jobWorkItemDequeueWork);
            }
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder j6() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.FH = jobParameters;
            this.j6.FH(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zDW = this.j6.DW();
            synchronized (this.DW) {
                this.FH = null;
            }
            return zDW;
        }
    }

    static final class g extends h {
        private final JobInfo Hw;

        g(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            j6(i);
            this.Hw = new JobInfo.Builder(i, this.j6).setOverrideDeadline(0L).build();
        }
    }

    static abstract class h {
        boolean DW;
        int FH;
        final ComponentName j6;

        h(Context context, ComponentName componentName) {
            this.j6 = componentName;
        }

        public void DW() {
        }

        public void FH() {
        }

        public void Hw() {
        }

        void j6(int i) {
            if (!this.DW) {
                this.DW = true;
                this.FH = i;
            } else {
                if (this.FH == i) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.FH);
            }
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.k2 = null;
        } else {
            this.k2 = new ArrayList<>();
        }
    }

    static h Hw(Context context, ComponentName componentName, boolean z, int i) {
        h cVar;
        h hVar = zh.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i);
        }
        h hVar2 = cVar;
        zh.put(componentName, hVar2);
        return hVar2;
    }

    boolean DW() {
        a aVar = this.jw;
        if (aVar != null) {
            aVar.cancel(this.fY);
        }
        return Zo();
    }

    void FH(boolean z) {
        if (this.jw == null) {
            this.jw = new a();
            h hVar = this.mb;
            if (hVar != null && z) {
                hVar.FH();
            }
            this.jw.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    void VH() {
        ArrayList<d> arrayList = this.k2;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.jw = null;
                if (this.k2 != null && this.k2.size() > 0) {
                    FH(false);
                } else if (!this.qp) {
                    this.mb.DW();
                }
            }
        }
    }

    public boolean Zo() {
        return true;
    }

    e j6() {
        b bVar = this.WB;
        if (bVar != null) {
            return bVar.DW();
        }
        synchronized (this.k2) {
            if (this.k2.size() <= 0) {
                return null;
            }
            return this.k2.remove(0);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.WB;
        if (bVar != null) {
            return bVar.j6();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.WB = new f(this);
            this.mb = null;
        } else {
            this.WB = null;
            this.mb = Hw(this, new ComponentName(this, (Class<?>) JobIntentService.class), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.k2;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.qp = true;
                this.mb.DW();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.k2 == null) {
            return 2;
        }
        this.mb.Hw();
        synchronized (this.k2) {
            ArrayList<d> arrayList = this.k2;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i2));
            FH(true);
        }
        return 3;
    }

    protected abstract void v5(Intent intent);
}
