package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;

@jg
/* loaded from: classes.dex */
public final class fd extends gd implements com.google.android.gms.ads.internal.gmsg.b0<cv> {
    private int EQ;
    private final cv FH;
    private final Context Hw;
    private int J0;
    private int J8;
    private DisplayMetrics VH;
    private int Ws;
    private final zzzy Zo;
    private float gn;
    private int tp;
    private int u7;
    private final WindowManager v5;
    private int we;

    public fd(cv cvVar, Context context, zzzy zzzyVar) {
        super(cvVar);
        this.u7 = -1;
        this.tp = -1;
        this.we = -1;
        this.J0 = -1;
        this.J8 = -1;
        this.Ws = -1;
        this.FH = cvVar;
        this.Hw = context;
        this.Zo = zzzyVar;
        this.v5 = (WindowManager) context.getSystemService("window");
    }

    public final void VH(int i, int i2) {
        int i3 = this.Hw instanceof Activity ? com.google.android.gms.ads.internal.w0.v5().et((Activity) this.Hw)[0] : 0;
        if (this.FH.aq() == null || !this.FH.aq().v5()) {
            cw0.j6();
            this.J8 = mp.J0(this.Hw, this.FH.getWidth());
            cw0.j6();
            this.Ws = mp.J0(this.Hw, this.FH.getHeight());
        }
        FH(i, i2 - i3, this.J8, this.Ws);
        this.FH.AF().Hw(i, i2);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) throws JSONException {
        this.VH = new DisplayMetrics();
        Display defaultDisplay = this.v5.getDefaultDisplay();
        defaultDisplay.getMetrics(this.VH);
        this.gn = this.VH.density;
        this.EQ = defaultDisplay.getRotation();
        cw0.j6();
        DisplayMetrics displayMetrics = this.VH;
        this.u7 = mp.J8(displayMetrics, displayMetrics.widthPixels);
        cw0.j6();
        DisplayMetrics displayMetrics2 = this.VH;
        this.tp = mp.J8(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityDx = this.FH.dx();
        if (activityDx == null || activityDx.getWindow() == null) {
            this.we = this.u7;
            this.J0 = this.tp;
        } else {
            com.google.android.gms.ads.internal.w0.v5();
            int[] iArrJJ = bn.jJ(activityDx);
            cw0.j6();
            this.we = mp.J8(this.VH, iArrJJ[0]);
            cw0.j6();
            this.J0 = mp.J8(this.VH, iArrJJ[1]);
        }
        if (this.FH.aq().v5()) {
            this.J8 = this.u7;
            this.Ws = this.tp;
        } else {
            this.FH.measure(0, 0);
        }
        j6(this.u7, this.tp, this.we, this.J0, this.gn, this.EQ);
        ed edVar = new ed();
        edVar.tp(this.Zo.DW());
        edVar.u7(this.Zo.FH());
        edVar.DW(this.Zo.v5());
        edVar.FH(this.Zo.Hw());
        edVar.Hw(true);
        this.FH.j6("onDeviceFeaturesReceived", new cd(edVar).j6());
        int[] iArr = new int[2];
        this.FH.getLocationOnScreen(iArr);
        cw0.j6();
        int iJ0 = mp.J0(this.Hw, iArr[0]);
        cw0.j6();
        VH(iJ0, mp.J0(this.Hw, iArr[1]));
        if (xp.DW(2)) {
            xp.gn("Dispatching Ready Event.");
        }
        v5(this.FH.sy().WB);
    }
}
