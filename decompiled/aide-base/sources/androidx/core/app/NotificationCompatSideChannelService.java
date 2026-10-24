package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.INotificationSideChannel;

/* loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    private class a extends INotificationSideChannel.Sub {
        a() {
        }

        @Override // androidx.core.app.INotificationSideChannel
        public void T7(String str, int i, String str2, Notification notification) {
            NotificationCompatSideChannelService.this.FH(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.Hw(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // androidx.core.app.INotificationSideChannel
        public void iF(String str, int i, String str2) {
            NotificationCompatSideChannelService.this.FH(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.j6(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // androidx.core.app.INotificationSideChannel
        public void n8(String str) {
            NotificationCompatSideChannelService.this.FH(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.DW(str);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public abstract void DW(String str);

    void FH(int i, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    public abstract void Hw(String str, int i, String str2, Notification notification);

    public abstract void j6(String str, int i, String str2);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL") || Build.VERSION.SDK_INT > 19) {
            return null;
        }
        return new a();
    }
}
