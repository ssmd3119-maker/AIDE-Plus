package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;

@cy(clazz = -443066808001349768L, container = -443066808001349768L, user = true)
/* loaded from: classes.dex */
public class ProgressDialogHandler {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = -1194706431140899040L)
    private final String DW;

    @dy(field = 597559973676931720L)
    private ProgressDialog FH;

    @dy(field = -433778956045767207L)
    private Handler Hw;

    @dy(field = -265548789896474136L)
    private int Zo;

    @dy(field = 838758651928592592L)
    private final Activity j6;

    @dy(field = -1024908850174466719L)
    private Runnable v5;

    @cy(clazz = 1940838690357705069L, container = -443066808001349768L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -3838742445000377365L)
        a() {
        }

        @Override // java.lang.Runnable
        @ey(method = -140283756019949745L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(3445017489989790715L, this);
                }
                ProgressDialogHandler.this.Zo();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 3445017489989790715L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1940976261388132632L, container = -443066808001349768L, user = true)
    class b implements DialogInterface.OnCancelListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -5694294346282751016L)
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @ey(method = 1116083363829508152L)
        public void onCancel(DialogInterface dialogInterface) {
            try {
                if (mb) {
                    iy.tp(-315687090912726544L, this, dialogInterface);
                }
                ProgressDialogHandler.this.FH();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -315687090912726544L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ProgressDialogHandler.class);
    }

    @ey(method = -569188556061399613L)
    public ProgressDialogHandler(Activity activity, String str) {
        try {
            if (VH) {
                iy.EQ(-2259859479713448584L, null, activity, str);
            }
            this.Hw = new Handler();
            this.j6 = activity;
            this.DW = str;
            this.Zo = 500;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -2259859479713448584L, null, activity, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4282309975616894155L)
    public void Zo() {
        try {
            if (VH) {
                iy.gn(-1183668049773131675L, this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this.j6);
            this.FH = progressDialog;
            progressDialog.setMessage(this.DW);
            this.FH.setOnCancelListener(new b());
            this.FH.getWindow().clearFlags(2);
            this.FH.show();
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -1183668049773131675L, this);
            }
            throw th;
        }
    }

    @ey(method = 2967822104937340000L)
    public void DW() {
        try {
            if (VH) {
                iy.gn(-1950676336890241184L, this);
            }
            if (this.v5 != null) {
                this.Hw.removeCallbacks(this.v5);
                this.v5 = null;
            }
            if (this.FH != null) {
                this.FH.dismiss();
                this.FH = null;
            }
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -1950676336890241184L, this);
            }
            throw th;
        }
    }

    @ey(method = -2790036783533969775L)
    protected void FH() {
        try {
            if (VH) {
                iy.gn(-2001298607835609485L, this);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -2001298607835609485L, this);
            }
            throw th;
        }
    }

    @ey(method = 3065126399694680832L)
    public void Hw() {
        try {
            if (VH) {
                iy.gn(-2273123547971387904L, this);
            }
            DW();
            Zo();
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -2273123547971387904L, this);
            }
            throw th;
        }
    }

    @ey(method = 4657139340111678400L)
    public void v5() {
        try {
            if (VH) {
                iy.gn(-6258904993486479808L, this);
            }
            DW();
            a aVar = new a();
            this.v5 = aVar;
            this.Hw.postDelayed(aVar, this.Zo);
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -6258904993486479808L, this);
            }
            throw th;
        }
    }
}
