package com.google.android.gms.common;

import abcd.iy;
import abcd.jv;
import abcd.ru;
import abcd.su;
import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public class b extends c {
    private static final Object Hw = new Object();
    private static final b v5 = new b();
    private String FH;

    @SuppressLint({"HandlerLeak"})
    private class a extends jv {
        private final Context j6;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.j6 = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int iGn = b.this.gn(this.j6);
            if (b.this.tp(iGn)) {
                b.this.XL(this.j6, iGn);
            }
        }
    }

    b() {
    }

    @TargetApi(ProxyTextView.INPUTTYPE_date)
    private final void U2(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            Mr(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strZo = com.google.android.gms.common.internal.e.Zo(context, i);
        String strV5 = com.google.android.gms.common.internal.e.v5(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setLocalOnly(true);
        builder.setAutoCancel(true);
        builder.setContentTitle(strZo);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.bigText(strV5);
        builder.setStyle(bigTextStyle);
        if (com.google.android.gms.common.util.i.Hw(context)) {
            com.google.android.gms.common.internal.p.we(com.google.android.gms.common.util.o.VH());
            builder.setSmallIcon(context.getApplicationInfo().icon);
            builder.setPriority(2);
            if (com.google.android.gms.common.util.i.v5(context)) {
                builder.addAction(ru.common_full_open_on_phone, resources.getString(su.common_open_on_phone), pendingIntent);
            } else {
                builder.setContentIntent(pendingIntent);
            }
        } else {
            builder.setSmallIcon(R.drawable.stat_sys_warning);
            builder.setTicker(resources.getString(su.common_google_play_services_notification_ticker));
            builder.setWhen(System.currentTimeMillis());
            builder.setContentIntent(pendingIntent);
            builder.setContentText(strV5);
        }
        if (com.google.android.gms.common.util.o.EQ()) {
            com.google.android.gms.common.internal.p.we(com.google.android.gms.common.util.o.EQ());
            String strLg = lg();
            if (strLg == null) {
                strLg = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strDW = com.google.android.gms.common.internal.e.DW(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strDW, 4));
                } else if (!strDW.equals(notificationChannel.getName())) {
                    notificationChannel.setName(strDW);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            builder.setChannelId(strLg);
        }
        Notification notificationBuild = builder.build();
        if (i == 1 || i == 2 || i == 3) {
            i2 = 10436;
            g.Hw.set(false);
        } else {
            i2 = 39789;
        }
        we(notificationManager, i2, notificationBuild);
    }

    public static b Ws() {
        return v5;
    }

    static Dialog aM(Context context, int i, com.google.android.gms.common.internal.f fVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.e.Hw(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strFH = com.google.android.gms.common.internal.e.FH(context, i);
        if (strFH != null) {
            builder.setPositiveButton(strFH, fVar);
        }
        String strVH = com.google.android.gms.common.internal.e.VH(context, i);
        if (strVH != null) {
            builder.setTitle(strVH);
        }
        return builder.create();
    }

    static void j3(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            j.Bx(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
        } else {
            ErrorDialogFragment.j6(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    private final String lg() {
        String str;
        synchronized (Hw) {
            str = this.FH;
        }
        return str;
    }

    private static /* synthetic */ void we(NotificationManager notificationManager, int i, Notification notification) {
        notificationManager.notify(i, notification);
        iy.gW(notificationManager, i, notification);
    }

    @Override // com.google.android.gms.common.c
    public Intent FH(Context context, int i, String str) {
        return super.FH(context, i, str);
    }

    @Override // com.google.android.gms.common.c
    public PendingIntent Hw(Context context, int i, int i2) {
        return super.Hw(context, i, i2);
    }

    public Dialog J0(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return aM(activity, i, com.google.android.gms.common.internal.f.j6(activity, FH(activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent J8(Context context, ConnectionResult connectionResult) {
        return connectionResult.Ws() ? connectionResult.J8() : Hw(context, connectionResult.gn(), 0);
    }

    final void Mr(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }

    public boolean QX(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogJ0 = J0(activity, i, i2, onCancelListener);
        if (dialogJ0 == null) {
            return false;
        }
        j3(activity, dialogJ0, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void XL(Context context, int i) {
        U2(context, i, null, v5(context, i, 0, "n"));
    }

    @Override // com.google.android.gms.common.c
    public final String Zo(int i) {
        return super.Zo(i);
    }

    public final boolean a8(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntentJ8 = J8(context, connectionResult);
        if (pendingIntentJ8 == null) {
            return false;
        }
        U2(context, connectionResult.gn(), null, GoogleApiActivity.FH(context, pendingIntentJ8, i));
        return true;
    }

    @Override // com.google.android.gms.common.c
    public int gn(Context context) {
        return super.gn(context);
    }

    @Override // com.google.android.gms.common.c
    public final boolean tp(int i) {
        return super.tp(i);
    }

    @Override // com.google.android.gms.common.c
    public int u7(Context context, int i) {
        return super.u7(context, i);
    }
}
