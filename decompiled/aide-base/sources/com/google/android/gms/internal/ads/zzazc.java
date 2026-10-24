package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

@jg
/* loaded from: classes.dex */
public final class zzazc {
    private String DW;
    private int EQ;
    private String FH;
    private String Hw;
    private float J0;
    private float J8;
    private Handler QX;
    private float VH;
    private float Ws;
    private Runnable XL;
    private final float Zo;
    private float gn;
    private final Context j6;
    private int tp;
    private float u7;
    private String v5;
    private float we;

    public zzazc(Context context) {
        this.tp = 0;
        this.XL = new Runnable(this) { // from class: com.google.android.gms.internal.ads.xn
            private final zzazc WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.tp();
            }
        };
        this.j6 = context;
        this.Zo = context.getResources().getDisplayMetrics().density;
        this.EQ = ViewConfiguration.get(this.j6).getScaledTouchSlop();
        com.google.android.gms.ads.internal.w0.U2().DW();
        this.QX = com.google.android.gms.ads.internal.w0.U2().j6();
    }

    private static int FH(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    private final void Hw(int i, float f, float f2) {
        if (i == 0) {
            this.tp = 0;
            this.VH = f;
            this.gn = f2;
            this.u7 = f2;
            return;
        }
        int i2 = this.tp;
        if (i2 == -1) {
            return;
        }
        if (i != 2) {
            if (i == 1 && i2 == 4) {
                DW();
                return;
            }
            return;
        }
        if (f2 > this.gn) {
            this.gn = f2;
        } else if (f2 < this.u7) {
            this.u7 = f2;
        }
        if (this.gn - this.u7 > this.Zo * 30.0f) {
            this.tp = -1;
            return;
        }
        int i3 = this.tp;
        if (i3 == 0 || i3 == 2) {
            if (f - this.VH >= this.Zo * 50.0f) {
                this.VH = f;
                this.tp++;
            }
        } else if ((i3 == 1 || i3 == 3) && f - this.VH <= this.Zo * (-50.0f)) {
            this.VH = f;
            this.tp++;
        }
        int i4 = this.tp;
        if (i4 == 1 || i4 == 3) {
            if (f > this.VH) {
                this.VH = f;
            }
        } else {
            if (i4 != 2 || f >= this.VH) {
                return;
            }
            this.VH = f;
        }
    }

    private final boolean VH(float f, float f2, float f3, float f4) {
        return Math.abs(this.we - f) < ((float) this.EQ) && Math.abs(this.J0 - f2) < ((float) this.EQ) && Math.abs(this.J8 - f3) < ((float) this.EQ) && Math.abs(this.Ws - f4) < ((float) this.EQ);
    }

    public final void DW() {
        try {
            if (!(this.j6 instanceof Activity)) {
                xp.gn("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(com.google.android.gms.ads.internal.w0.Ws().FH()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = com.google.android.gms.ads.internal.w0.Ws().Hw() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            final int iFH = FH(arrayList, "Ad Information", true);
            final int iFH2 = FH(arrayList, str, true);
            final int iFH3 = FH(arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.j6, com.google.android.gms.ads.internal.w0.VH().J8());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, iFH, iFH2, iFH3) { // from class: com.google.android.gms.internal.ads.yn
                private final zzazc WB;
                private final int fY;
                private final int jw;
                private final int mb;

                {
                    this.WB = this;
                    this.mb = iFH;
                    this.jw = iFH2;
                    this.fY = iFH3;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.WB.v5(this.mb, this.jw, this.fY, dialogInterface, i);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            if (sm.J0()) {
                Log.v("Ads", "", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ(android.view.MotionEvent r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p.oT
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r0 = r1.FH(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto Lae
            int r0 = r11.getActionMasked()
            int r2 = r11.getHistorySize()
            int r3 = r11.getPointerCount()
            if (r0 != 0) goto L30
            r10.tp = r1
            float r0 = r11.getX()
            r10.we = r0
            float r11 = r11.getY()
            r10.J0 = r11
            return
        L30:
            int r4 = r10.tp
            r5 = -1
            if (r4 == r5) goto Lad
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L61
            if (r0 != r6) goto L61
            r10.tp = r6
            float r0 = r11.getX(r7)
            r10.J8 = r0
            float r11 = r11.getY(r7)
            r10.Ws = r11
            android.os.Handler r11 = r10.QX
            java.lang.Runnable r0 = r10.XL
            com.google.android.gms.internal.ads.e<java.lang.Long> r1 = com.google.android.gms.internal.ads.p.hx
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r1 = r2.FH(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L61:
            int r4 = r10.tp
            if (r4 != r6) goto Lad
            r4 = 2
            if (r3 == r4) goto L6a
        L68:
            r1 = 1
            goto La2
        L6a:
            if (r0 != r4) goto La2
            r0 = 0
            r3 = 0
        L6e:
            if (r0 >= r2) goto L8a
            float r4 = r11.getHistoricalX(r1, r0)
            float r6 = r11.getHistoricalY(r1, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.VH(r4, r6, r8, r9)
            if (r4 != 0) goto L87
            r3 = 1
        L87:
            int r0 = r0 + 1
            goto L6e
        L8a:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r2 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.VH(r0, r1, r2, r11)
            if (r11 != 0) goto La1
            goto L68
        La1:
            r1 = r3
        La2:
            if (r1 == 0) goto Lad
            r10.tp = r5
            android.os.Handler r11 = r10.QX
            java.lang.Runnable r0 = r10.XL
            r11.removeCallbacks(r0)
        Lad:
            return
        Lae:
            int r0 = r11.getHistorySize()
            r2 = 0
        Lb3:
            if (r2 >= r0) goto Lc7
            int r3 = r11.getActionMasked()
            float r4 = r11.getHistoricalX(r1, r2)
            float r5 = r11.getHistoricalY(r1, r2)
            r10.Hw(r3, r4, r5)
            int r2 = r2 + 1
            goto Lb3
        Lc7:
            int r0 = r11.getActionMasked()
            float r1 = r11.getX()
            float r11 = r11.getY()
            r10.Hw(r0, r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazc.EQ(android.view.MotionEvent):void");
    }

    public final void J0(String str) {
        this.DW = str;
    }

    public final void J8(String str) {
        this.v5 = str;
    }

    final /* synthetic */ void Zo(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.w0.v5();
        bn.EQ(this.j6, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void gn() {
        com.google.android.gms.ads.internal.w0.Ws().j6(this.j6, this.FH, this.Hw, this.v5);
    }

    public final void j6(String str) {
        this.FH = str;
    }

    final /* synthetic */ void tp() {
        this.tp = 4;
        DW();
    }

    final /* synthetic */ void u7() {
        com.google.android.gms.ads.internal.w0.Ws().gn(this.j6, this.FH, this.Hw);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void v5(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L9b
            android.content.Context r1 = r0.j6
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto Le
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.xp.gn(r1)
            return
        Le:
            java.lang.String r1 = r0.DW
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.w0.v5()
            java.util.Map r1 = com.google.android.gms.internal.ads.bn.XG(r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L3f
        L62:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            goto L73
        L71:
            java.lang.String r1 = "No debug information"
        L73:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.j6
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.zn r3 = new com.google.android.gms.internal.ads.zn
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.ao.WB
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L9b:
            if (r5 != r2) goto Lab
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.xp.VH(r1)
            com.google.android.gms.internal.ads.bo r1 = new com.google.android.gms.internal.ads.bo
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zm.DW(r1)
            return
        Lab:
            if (r5 != r3) goto Lba
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.xp.VH(r1)
            com.google.android.gms.internal.ads.co r1 = new com.google.android.gms.internal.ads.co
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zm.DW(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazc.v5(int, int, int, android.content.DialogInterface, int):void");
    }

    public final void we(String str) {
        this.Hw = str;
    }

    public zzazc(Context context, String str) {
        this(context);
        this.DW = str;
    }
}
