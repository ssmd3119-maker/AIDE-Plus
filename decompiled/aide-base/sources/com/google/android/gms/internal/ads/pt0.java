package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class pt0 {

    @GuardedBy("this")
    private final dv0 DW;
    private final boolean FH;
    private final zzur j6;

    public pt0(zzur zzurVar) {
        this.j6 = zzurVar;
        this.FH = ((Boolean) cw0.v5().FH(p.RW)).booleanValue();
        this.DW = new dv0();
        VH();
    }

    private final synchronized void FH(rt0 rt0Var) {
        this.DW.gn = gn();
        vt0 vt0VarJ6 = this.j6.j6(p90.VH(this.DW));
        vt0VarJ6.FH(rt0Var.Hw());
        vt0VarJ6.j6();
        String strValueOf = String.valueOf(Integer.toString(rt0Var.Hw(), 10));
        sm.we(strValueOf.length() != 0 ? "Logging Event with event code : ".concat(strValueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void Hw(rt0 rt0Var) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(v5(rt0Var).getBytes());
                    fileOutputStream.write(10);
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        sm.we("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                sm.we("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    sm.we("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            sm.we("Could not find file for Clearcut");
        }
    }

    private final synchronized void VH() {
        this.DW.we = new zu0();
        this.DW.we.Zo = new av0();
        this.DW.u7 = new bv0();
    }

    public static pt0 Zo() {
        return new pt0();
    }

    private static long[] gn() {
        int i;
        List<String> listHw = p.Hw();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listHw.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] strArrSplit = it.next().split(",");
            int length = strArrSplit.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(strArrSplit[i]));
                } catch (NumberFormatException unused) {
                    sm.we("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }

    private final synchronized String v5(rt0 rt0Var) {
        return String.format("id=%s,timestamp=%s,event=%s", this.DW.Hw, Long.valueOf(com.google.android.gms.ads.internal.w0.we().DW()), Integer.valueOf(rt0Var.Hw()));
    }

    public final synchronized void DW(rt0 rt0Var) {
        if (this.FH) {
            if (((Boolean) cw0.v5().FH(p.Vq)).booleanValue()) {
                Hw(rt0Var);
            } else {
                FH(rt0Var);
            }
        }
    }

    public final synchronized void j6(qt0 qt0Var) {
        if (this.FH) {
            try {
                qt0Var.j6(this.DW);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.w0.u7().v5(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private pt0() {
        this.FH = false;
        this.j6 = new zzur();
        this.DW = new dv0();
        VH();
    }
}
