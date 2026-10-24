package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ur0 {
    private final int DW;
    private final int FH;
    private final is0 Hw;
    private int J0;
    private final int j6;
    private final rs0 v5;
    private final Object Zo = new Object();
    private ArrayList<String> VH = new ArrayList<>();
    private ArrayList<String> gn = new ArrayList<>();
    private ArrayList<gs0> u7 = new ArrayList<>();
    private int tp = 0;
    private int EQ = 0;
    private int we = 0;
    private String J8 = "";
    private String Ws = "";
    private String QX = "";

    public ur0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.j6 = i;
        this.DW = i2;
        this.FH = i3;
        this.Hw = new is0(i4);
        this.v5 = new rs0(i5, i6, i7);
    }

    private static String DW(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList.get(i2);
            i2++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    private final void Zo(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.FH) {
            return;
        }
        synchronized (this.Zo) {
            this.VH.add(str);
            this.tp += str.length();
            if (z) {
                this.gn.add(str);
                this.u7.add(new gs0(f, f2, f3, f4, this.gn.size() - 1));
            }
        }
    }

    public final void EQ() {
        synchronized (this.Zo) {
            this.J0 -= 100;
        }
    }

    public final void FH(String str, boolean z, float f, float f2, float f3, float f4) {
        Zo(str, z, f, f2, f3, f4);
        synchronized (this.Zo) {
            if (this.we < 0) {
                xp.VH("ActivityContent: negative number of WebViews.");
            }
            J8();
        }
    }

    public final void Hw(String str, boolean z, float f, float f2, float f3, float f4) {
        Zo(str, z, f, f2, f3, f4);
    }

    public final void J0() {
        synchronized (this.Zo) {
            this.we++;
        }
    }

    public final void J8() {
        synchronized (this.Zo) {
            int i = (this.tp * this.j6) + (this.EQ * this.DW);
            if (i > this.J0) {
                this.J0 = i;
                if (!com.google.android.gms.ads.internal.w0.u7().a8().er()) {
                    this.J8 = this.Hw.j6(this.VH);
                    this.Ws = this.Hw.j6(this.gn);
                }
                if (!com.google.android.gms.ads.internal.w0.u7().a8().QX()) {
                    this.QX = this.v5.j6(this.gn, this.u7);
                }
            }
        }
    }

    public final boolean VH() {
        boolean z;
        synchronized (this.Zo) {
            z = this.we == 0;
        }
        return z;
    }

    final int Ws() {
        return this.tp;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ur0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((ur0) obj).J8;
        return str != null && str.equals(this.J8);
    }

    public final String gn() {
        return this.J8;
    }

    public final int hashCode() {
        return this.J8.hashCode();
    }

    public final int j6() {
        return this.J0;
    }

    public final String toString() {
        int i = this.EQ;
        int i2 = this.J0;
        int i3 = this.tp;
        String strDW = DW(this.VH, 100);
        String strDW2 = DW(this.gn, 100);
        String str = this.J8;
        String str2 = this.Ws;
        String str3 = this.QX;
        StringBuilder sb = new StringBuilder(String.valueOf(strDW).length() + 165 + String.valueOf(strDW2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(strDW);
        sb.append("\n viewableText");
        sb.append(strDW2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    public final String tp() {
        return this.QX;
    }

    public final String u7() {
        return this.Ws;
    }

    public final void v5(int i) {
        this.EQ = i;
    }

    public final void we() {
        synchronized (this.Zo) {
            this.we--;
        }
    }
}
