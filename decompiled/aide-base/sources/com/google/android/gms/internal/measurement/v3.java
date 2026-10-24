package com.google.android.gms.internal.measurement;

import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.internal.measurement.x3;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v3<FieldDescriptorType extends x3<FieldDescriptorType>> {
    private static final v3 Hw = new v3(true);
    private boolean DW;
    private boolean FH = false;
    private final f6<FieldDescriptorType, Object> j6 = f6.VH(16);

    private v3() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void EQ(com.google.android.gms.internal.measurement.j7 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.g4.j6(r3)
            int[] r0 = com.google.android.gms.internal.measurement.w3.j6
            com.google.android.gms.internal.measurement.o7 r2 = r2.j6()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.l5
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.n4
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.h4
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.u2
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L50
        L4f:
            throw r2
        L50:
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v3.EQ(com.google.android.gms.internal.measurement.j7, java.lang.Object):void");
    }

    private static int J0(j7 j7Var, Object obj) {
        switch (w3.DW[j7Var.ordinal()]) {
            case 1:
                return k3.lp(((Double) obj).doubleValue());
            case 2:
                return k3.rN(((Float) obj).floatValue());
            case 3:
                return k3.j3(((Long) obj).longValue());
            case 4:
                return k3.Mr(((Long) obj).longValue());
            case 5:
                return k3.g3(((Integer) obj).intValue());
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return k3.a8(((Long) obj).longValue());
            case UserTouchAction.CLICK_KIND /* 7 */:
                return k3.ca(((Integer) obj).intValue());
            case 8:
                return k3.n5(((Boolean) obj).booleanValue());
            case 9:
                return k3.hz((l5) obj);
            case 10:
                return obj instanceof n4 ? k3.v5((n4) obj) : k3.XG((l5) obj);
            case 11:
                return obj instanceof u2 ? k3.vy((u2) obj) : k3.jw((String) obj);
            case 12:
                return obj instanceof u2 ? k3.vy((u2) obj) : k3.hK((byte[]) obj);
            case 13:
                return k3.Mz(((Integer) obj).intValue());
            case 14:
                return k3.x9(((Integer) obj).intValue());
            case 15:
                return k3.cb(((Long) obj).longValue());
            case 16:
                return k3.I(((Integer) obj).intValue());
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return k3.U2(((Long) obj).longValue());
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                return obj instanceof h4 ? k3.Qq(((h4) obj).J8()) : k3.Qq(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean J8(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.VH() == o7.MESSAGE) {
            if (key.nw()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((l5) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof l5)) {
                    if (value instanceof n4) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((l5) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int QX(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        return (key.VH() != o7.MESSAGE || key.nw() || key.gW()) ? we(key, value) : value instanceof n4 ? k3.gW(entry.getKey().J8(), (n4) value) : k3.Eq(entry.getKey().J8(), (l5) value);
    }

    private static Object U2(Object obj) {
        if (obj instanceof s5) {
            return ((s5) obj).v5();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object VH(FieldDescriptorType fielddescriptortype) {
        Object obj = this.j6.get(fielddescriptortype);
        if (!(obj instanceof n4)) {
            return obj;
        }
        n4.v5();
        throw null;
    }

    private final void Ws(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof n4) {
            n4.v5();
            throw null;
        }
        if (key.nw()) {
            Object objVH = VH(key);
            if (objVH == null) {
                objVH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objVH).add(U2(it.next()));
            }
            this.j6.put(key, objVH);
            return;
        }
        if (key.VH() != o7.MESSAGE) {
            this.j6.put(key, U2(value));
            return;
        }
        Object objVH2 = VH(key);
        if (objVH2 == null) {
            this.j6.put(key, U2(value));
        } else {
            this.j6.put(key, objVH2 instanceof s5 ? key.ei((s5) objVH2, (s5) value) : key.lg(((l5) objVH2).j6(), (l5) value).DW());
        }
    }

    static int Zo(j7 j7Var, int i, Object obj) {
        int iVJ = k3.vJ(i);
        if (j7Var == j7.GROUP) {
            g4.VH((l5) obj);
            iVJ <<= 1;
        }
        return iVJ + J0(j7Var, obj);
    }

    public static <T extends x3<T>> v3<T> aM() {
        return Hw;
    }

    static void gn(k3 k3Var, j7 j7Var, int i, Object obj) {
        if (j7Var == j7.GROUP) {
            l5 l5Var = (l5) obj;
            g4.VH(l5Var);
            k3Var.wc(i, 3);
            l5Var.FH(k3Var);
            k3Var.wc(i, 4);
        }
        k3Var.wc(i, j7Var.DW());
        switch (w3.DW[j7Var.ordinal()]) {
            case 1:
                k3Var.ei(((Double) obj).doubleValue());
                break;
            case 2:
                k3Var.VH(((Float) obj).floatValue());
                break;
            case 3:
                k3Var.QX(((Long) obj).longValue());
                break;
            case 4:
                k3Var.QX(((Long) obj).longValue());
                break;
            case 5:
                k3Var.lg(((Integer) obj).intValue());
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                k3Var.aM(((Long) obj).longValue());
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                k3Var.Sf(((Integer) obj).intValue());
                break;
            case 8:
                k3Var.Z1(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((l5) obj).FH(k3Var);
                break;
            case 10:
                k3Var.sh((l5) obj);
                break;
            case 11:
                if (!(obj instanceof u2)) {
                    k3Var.mb((String) obj);
                    break;
                } else {
                    k3Var.J8((u2) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof u2)) {
                    byte[] bArr = (byte[]) obj;
                    k3Var.oY(bArr, 0, bArr.length);
                    break;
                } else {
                    k3Var.J8((u2) obj);
                    break;
                }
            case 13:
                k3Var.dx(((Integer) obj).intValue());
                break;
            case 14:
                k3Var.Sf(((Integer) obj).intValue());
                break;
            case 15:
                k3Var.aM(((Long) obj).longValue());
                break;
            case 16:
                k3Var.ef(((Integer) obj).intValue());
                break;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                k3Var.XL(((Long) obj).longValue());
                break;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                if (!(obj instanceof h4)) {
                    k3Var.lg(((Integer) obj).intValue());
                    break;
                } else {
                    k3Var.lg(((h4) obj).J8());
                    break;
                }
        }
    }

    private final void tp(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.nw()) {
            EQ(fielddescriptortype.P8(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                EQ(fielddescriptortype.P8(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof n4) {
            this.FH = true;
        }
        this.j6.put(fielddescriptortype, obj);
    }

    private static int we(x3<?> x3Var, Object obj) {
        j7 j7VarP8 = x3Var.P8();
        int iJ8 = x3Var.J8();
        if (!x3Var.nw()) {
            return Zo(j7VarP8, iJ8, obj);
        }
        int iZo = 0;
        if (x3Var.gW()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iZo += J0(j7VarP8, it.next());
            }
            return k3.vJ(iJ8) + iZo + k3.aj(iZo);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iZo += Zo(j7VarP8, iJ8, it2.next());
        }
        return iZo;
    }

    final boolean DW() {
        return this.j6.isEmpty();
    }

    public final boolean FH() {
        return this.DW;
    }

    public final boolean Hw() {
        for (int i = 0; i < this.j6.J0(); i++) {
            if (!J8(this.j6.gn(i))) {
                return false;
            }
        }
        Iterator it = this.j6.J8().iterator();
        while (it.hasNext()) {
            if (!J8((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int Mr() {
        int iQX = 0;
        for (int i = 0; i < this.j6.J0(); i++) {
            iQX += QX(this.j6.gn(i));
        }
        Iterator it = this.j6.J8().iterator();
        while (it.hasNext()) {
            iQX += QX((Map.Entry) it.next());
        }
        return iQX;
    }

    public final void XL() {
        if (this.DW) {
            return;
        }
        this.j6.we();
        this.DW = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        v3 v3Var = new v3();
        for (int i = 0; i < this.j6.J0(); i++) {
            Map.Entry<K, Object> entryGn = this.j6.gn(i);
            v3Var.tp((x3) entryGn.getKey(), entryGn.getValue());
        }
        Iterator it = this.j6.J8().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            v3Var.tp((x3) entry.getKey(), entry.getValue());
        }
        v3Var.FH = this.FH;
        return v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v3) {
            return this.j6.equals(((v3) obj).j6);
        }
        return false;
    }

    public final int hashCode() {
        return this.j6.hashCode();
    }

    public final int j3() {
        int iWe = 0;
        for (int i = 0; i < this.j6.J0(); i++) {
            Map.Entry<K, Object> entryGn = this.j6.gn(i);
            iWe += we((x3) entryGn.getKey(), entryGn.getValue());
        }
        Iterator it = this.j6.J8().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iWe += we((x3) entry.getKey(), entry.getValue());
        }
        return iWe;
    }

    final Iterator<Map.Entry<FieldDescriptorType, Object>> j6() {
        return this.FH ? new r4(this.j6.Ws().iterator()) : this.j6.Ws().iterator();
    }

    public final void u7(v3<FieldDescriptorType> v3Var) {
        for (int i = 0; i < v3Var.j6.J0(); i++) {
            Ws(v3Var.j6.gn(i));
        }
        Iterator it = v3Var.j6.J8().iterator();
        while (it.hasNext()) {
            Ws((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> v5() {
        return this.FH ? new r4(this.j6.entrySet().iterator()) : this.j6.entrySet().iterator();
    }

    private v3(boolean z) {
        XL();
    }
}
