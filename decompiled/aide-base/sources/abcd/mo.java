package abcd;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mo implements Comparable<mo> {
    public static final mo jw = new mo(null, new short[0]);
    private final co WB;
    private final short[] mb;

    public mo(co coVar, short[] sArr) {
        this.WB = coVar;
        this.mb = sArr;
    }

    public short[] DW() {
        return this.mb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mo.class == obj.getClass() && Arrays.equals(this.mb, ((mo) obj).mb);
    }

    public int hashCode() {
        return 31 + Arrays.hashCode(this.mb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return abcd.mt.j6(r5.mb.length, r6.mb.length);
     */
    @Override // java.lang.Comparable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(abcd.mo r6) {
        /*
            r5 = this;
            r0 = 0
        L1:
            short[] r1 = r5.mb
            int r2 = r1.length
            if (r0 >= r2) goto L1d
            short[] r2 = r6.mb
            int r3 = r2.length
            if (r0 >= r3) goto L1d
            short r3 = r1[r0]
            short r4 = r2[r0]
            if (r3 == r4) goto L1a
            short r6 = r1[r0]
            short r0 = r2[r0]
            int r6 = abcd.mt.DW(r6, r0)
            return r6
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            short[] r0 = r5.mb
            int r0 = r0.length
            short[] r6 = r6.mb
            int r6 = r6.length
            int r6 = abcd.mt.j6(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.mo.compareTo(abcd.mo):int");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        int length = this.mb.length;
        for (int i = 0; i < length; i++) {
            co coVar = this.WB;
            sb.append(coVar != null ? coVar.j3().get(this.mb[i]) : Short.valueOf(this.mb[i]));
        }
        sb.append(")");
        return sb.toString();
    }
}
