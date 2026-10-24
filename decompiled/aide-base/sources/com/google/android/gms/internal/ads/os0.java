package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class os0 {
    private static void DW(int i, long j, String str, int i2, PriorityQueue<ps0> priorityQueue) {
        ps0 ps0Var = new ps0(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().FH <= ps0Var.FH && priorityQueue.peek().j6 <= ps0Var.j6)) && !priorityQueue.contains(ps0Var)) {
            priorityQueue.add(ps0Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void FH(String[] strArr, int i, int i2, PriorityQueue<ps0> priorityQueue) throws UnsupportedEncodingException {
        if (strArr.length < i2) {
            DW(i, v5(strArr, 0, strArr.length), j6(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long jV5 = v5(strArr, 0, i2);
        DW(i, jV5, j6(strArr, 0, i2), i2, priorityQueue);
        long jHw = Hw(16785407L, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            jV5 = ((((((jV5 + 1073807359) - ((((ls0.j6(strArr[i3 - 1]) + 2147483647L) % 1073807359) * jHw) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((ls0.j6(strArr[(i3 + i2) - 1]) + 2147483647L) % 1073807359)) % 1073807359;
            DW(i, jV5, j6(strArr, i3, i2), strArr.length, priorityQueue);
        }
    }

    private static long Hw(long j, int i) {
        if (i == 0) {
            return 1L;
        }
        return i == 1 ? j : i % 2 == 0 ? Hw((j * j) % 1073807359, i / 2) % 1073807359 : (j * (Hw((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    private static String j6(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            xp.j6("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    private static long v5(String[] strArr, int i, int i2) {
        long jJ6 = (ls0.j6(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jJ6 = (((jJ6 * 16785407) % 1073807359) + ((ls0.j6(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jJ6;
    }
}
