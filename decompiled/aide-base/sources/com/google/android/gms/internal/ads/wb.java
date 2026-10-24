package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class wb {
    final String DW;
    final String FH;
    final long Hw;
    final long VH;
    final long Zo;
    final List<yj0> gn;
    long j6;
    final long v5;

    private wb(String str, String str2, long j, long j2, long j3, long j4, List<yj0> list) {
        this.DW = str;
        this.FH = "".equals(str2) ? null : str2;
        this.Hw = j;
        this.v5 = j2;
        this.Zo = j3;
        this.VH = j4;
        this.gn = list;
    }

    static wb DW(vc vcVar) throws IOException {
        if (eb.EQ(vcVar) == 538247942) {
            return new wb(eb.v5(vcVar), eb.v5(vcVar), eb.J0(vcVar), eb.J0(vcVar), eb.J0(vcVar), eb.J0(vcVar), eb.we(vcVar));
        }
        throw new IOException();
    }

    final boolean j6(OutputStream outputStream) throws IOException {
        try {
            eb.Zo(outputStream, 538247942);
            eb.gn(outputStream, this.DW);
            eb.gn(outputStream, this.FH == null ? "" : this.FH);
            eb.VH(outputStream, this.Hw);
            eb.VH(outputStream, this.v5);
            eb.VH(outputStream, this.Zo);
            eb.VH(outputStream, this.VH);
            List<yj0> list = this.gn;
            if (list != null) {
                eb.Zo(outputStream, list.size());
                for (yj0 yj0Var : list) {
                    eb.gn(outputStream, yj0Var.j6());
                    eb.gn(outputStream, yj0Var.DW());
                }
            } else {
                eb.Zo(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            e4.j6("%s", e.toString());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    wb(String str, ab0 ab0Var) {
        List<yj0> list;
        String str2 = ab0Var.DW;
        long j = ab0Var.FH;
        long j2 = ab0Var.Hw;
        long j3 = ab0Var.v5;
        long j4 = ab0Var.Zo;
        List<yj0> list2 = ab0Var.gn;
        if (list2 != null) {
            list = list2;
        } else {
            Map<String, String> map = ab0Var.VH;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new yj0(entry.getKey(), entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
        this.j6 = ab0Var.j6.length;
    }
}
