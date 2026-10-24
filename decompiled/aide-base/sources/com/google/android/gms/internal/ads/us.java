package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.TimeUnit;

@jg
/* loaded from: classes.dex */
public final class us {
    private final String DW;
    private boolean EQ;
    private final zzbbi FH;
    private final a0 Hw;
    private boolean J0;
    private zzbdi J8;
    private boolean QX;
    private final long[] VH;
    private boolean Ws;
    private long XL;
    private final io Zo;
    private final String[] gn;
    private final Context j6;
    private boolean tp;
    private boolean u7;
    private final d0 v5;
    private boolean we;

    public us(Context context, zzbbi zzbbiVar, String str, d0 d0Var, a0 a0Var) {
        lo loVar = new lo();
        loVar.j6("min_1", Double.MIN_VALUE, 1.0d);
        loVar.j6("1_5", 1.0d, 5.0d);
        loVar.j6("5_10", 5.0d, 10.0d);
        loVar.j6("10_20", 10.0d, 20.0d);
        loVar.j6("20_30", 20.0d, 30.0d);
        loVar.j6("30_max", 30.0d, Double.MAX_VALUE);
        this.Zo = loVar.FH();
        this.u7 = false;
        this.tp = false;
        this.EQ = false;
        this.we = false;
        this.XL = -1L;
        this.j6 = context;
        this.FH = zzbbiVar;
        this.DW = str;
        this.v5 = d0Var;
        this.Hw = a0Var;
        String str2 = (String) cw0.v5().FH(p.U2);
        if (str2 == null) {
            this.gn = new String[0];
            this.VH = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        this.gn = new String[strArrSplit.length];
        this.VH = new long[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.VH[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                xp.v5("Unable to parse frame hash target time number.", e);
                this.VH[i] = -1;
            }
        }
    }

    public final void DW() {
        this.J0 = true;
        if (!this.tp || this.EQ) {
            return;
        }
        v.j6(this.v5, this.Hw, "vfp2");
        this.EQ = true;
    }

    public final void FH() {
        this.J0 = false;
    }

    public final void Hw(zzbdi zzbdiVar) {
        v.j6(this.v5, this.Hw, "vpc2");
        this.u7 = true;
        d0 d0Var = this.v5;
        if (d0Var != null) {
            d0Var.Zo("vpn", zzbdiVar.we());
        }
        this.J8 = zzbdiVar;
    }

    public final void Zo() {
        if (!this.u7 || this.tp) {
            return;
        }
        v.j6(this.v5, this.Hw, "vfr2");
        this.tp = true;
    }

    public final void j6() {
        if (!((Boolean) cw0.v5().FH(p.Mr)).booleanValue() || this.Ws) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(AppMeasurement.Param.TYPE, "native-player-metrics");
        bundle.putString("request", this.DW);
        bundle.putString("player", this.J8.we());
        for (ko koVar : this.Zo.DW()) {
            String strValueOf = String.valueOf(koVar.j6);
            bundle.putString(strValueOf.length() != 0 ? "fps_c_".concat(strValueOf) : new String("fps_c_"), Integer.toString(koVar.v5));
            String strValueOf2 = String.valueOf(koVar.j6);
            bundle.putString(strValueOf2.length() != 0 ? "fps_p_".concat(strValueOf2) : new String("fps_p_"), Double.toString(koVar.Hw));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.VH;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.w0.v5().J8(this.j6, this.FH.WB, "gmob-apps", bundle, true);
                this.Ws = true;
                return;
            }
            String str = this.gn[i];
            if (str != null) {
                String strValueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf3).length() + 3);
                sb.append("fh_");
                sb.append(strValueOf3);
                bundle.putString(sb.toString(), str);
            }
            i++;
        }
    }

    public final void v5(zzbdi zzbdiVar) {
        if (this.EQ && !this.we) {
            if (sm.J0() && !this.we) {
                sm.we("VideoMetricsMixin first frame");
            }
            v.j6(this.v5, this.Hw, "vff2");
            this.we = true;
        }
        long jFH = com.google.android.gms.ads.internal.w0.we().FH();
        if (this.J0 && this.QX && this.XL != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            double d = jFH - this.XL;
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.Zo.j6(nanos / d);
        }
        this.QX = this.J0;
        this.XL = jFH;
        long jLongValue = ((Long) cw0.v5().FH(p.a8)).longValue();
        long currentPosition = zzbdiVar.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.gn;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(currentPosition - this.VH[i])) {
                String[] strArr2 = this.gn;
                int i2 = 8;
                Bitmap bitmap = zzbdiVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
