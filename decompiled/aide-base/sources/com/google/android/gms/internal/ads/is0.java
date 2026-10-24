package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@jg
/* loaded from: classes.dex */
public final class is0 {
    private final int DW;
    private final hs0 FH = new ms0();
    private final int j6 = 6;

    public is0(int i) {
        this.DW = i;
    }

    private final String DW(String str) throws UnsupportedEncodingException {
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ks0 ks0Var = new ks0();
        PriorityQueue priorityQueue = new PriorityQueue(this.DW, new js0(this));
        for (String str2 : strArrSplit) {
            String[] strArrDW = ls0.DW(str2, false);
            if (strArrDW.length != 0) {
                os0.FH(strArrDW, this.DW, this.j6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ks0Var.j6(this.FH.j6(((ps0) it.next()).DW));
            } catch (IOException e) {
                xp.Hw("Error while writing hash to byteStream", e);
            }
        }
        return ks0Var.toString();
    }

    public final String j6(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return DW(sb.toString());
    }
}
