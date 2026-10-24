package com.google.android.gms.internal.ads;

import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.internal.ads.j50;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h50<FieldDescriptorType extends j50<FieldDescriptorType>> {
    private static final h50 Hw = new h50(true);
    private boolean DW;
    private boolean FH = false;
    private final u70<FieldDescriptorType, Object> j6 = u70.Ws(16);

    private h50() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void EQ(com.google.android.gms.internal.ads.z80 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.t50.j6(r3)
            int[] r0 = com.google.android.gms.internal.ads.i50.j6
            com.google.android.gms.internal.ads.e90 r2 = r2.j6()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.z60
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.b60
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.u50
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.i40
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h50.EQ(com.google.android.gms.internal.ads.z80, java.lang.Object):void");
    }

    public static <T extends j50<T>> h50<T> J0() {
        return Hw;
    }

    private static int Mr(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        return (key.EQ() != e90.MESSAGE || key.Ws() || key.j3()) ? QX(key, value) : value instanceof b60 ? x40.rN(entry.getKey().Hw(), (b60) value) : x40.I(entry.getKey().Hw(), (z60) value);
    }

    private static int QX(j50<?> j50Var, Object obj) {
        z80 z80VarGn = j50Var.gn();
        int iHw = j50Var.Hw();
        if (!j50Var.Ws()) {
            return Zo(z80VarGn, iHw, obj);
        }
        int iZo = 0;
        if (j50Var.j3()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iZo += XL(z80VarGn, it.next());
            }
            return x40.kQ(iHw) + iZo + x40.Eq(iZo);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iZo += Zo(z80VarGn, iHw, it2.next());
        }
        return iZo;
    }

    private static Object U2(Object obj) {
        if (obj instanceof g70) {
            return ((g70) obj).QX();
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
        if (!(obj instanceof b60)) {
            return obj;
        }
        b60.v5();
        throw null;
    }

    private static int XL(z80 z80Var, Object obj) {
        switch (i50.DW[z80Var.ordinal()]) {
            case 1:
                return x40.sG(((Double) obj).doubleValue());
            case 2:
                return x40.FN(((Float) obj).floatValue());
            case 3:
                return x40.nw(((Long) obj).longValue());
            case 4:
                return x40.SI(((Long) obj).longValue());
            case 5:
                return x40.yO(((Integer) obj).intValue());
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return x40.cn(((Long) obj).longValue());
            case UserTouchAction.CLICK_KIND /* 7 */:
                return x40.wc(((Integer) obj).intValue());
            case 8:
                return x40.sh(((Boolean) obj).booleanValue());
            case 9:
                return x40.oY((z60) obj);
            case 10:
                return obj instanceof b60 ? x40.v5((b60) obj) : x40.sy((z60) obj);
            case 11:
                return obj instanceof i40 ? x40.Mr((i40) obj) : x40.aq((String) obj);
            case 12:
                return obj instanceof i40 ? x40.Mr((i40) obj) : x40.cT((byte[]) obj);
            case 13:
                return x40.XG(((Integer) obj).intValue());
            case 14:
                return x40.et(((Integer) obj).intValue());
            case 15:
                return x40.cb(((Long) obj).longValue());
            case 16:
                return x40.jJ(((Integer) obj).intValue());
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return x40.KD(((Long) obj).longValue());
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                return obj instanceof u50 ? x40.CU(((u50) obj).Hw()) : x40.CU(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static int Zo(z80 z80Var, int i, Object obj) {
        int iKQ = x40.kQ(i);
        if (z80Var == z80.GROUP) {
            t50.gn((z60) obj);
            iKQ <<= 1;
        }
        return iKQ + XL(z80Var, obj);
    }

    private static boolean aM(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.EQ() == e90.MESSAGE) {
            if (key.Ws()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((z60) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof z60)) {
                    if (value instanceof b60) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((z60) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    static void gn(x40 x40Var, z80 z80Var, int i, Object obj) {
        if (z80Var == z80.GROUP) {
            z60 z60Var = (z60) obj;
            t50.gn(z60Var);
            x40Var.q7(i, 3);
            z60Var.VH(x40Var);
            x40Var.q7(i, 4);
        }
        x40Var.q7(i, z80Var.DW());
        switch (i50.DW[z80Var.ordinal()]) {
            case 1:
                x40Var.gW(((Double) obj).doubleValue());
                break;
            case 2:
                x40Var.aj(((Float) obj).floatValue());
                break;
            case 3:
                x40Var.U2(((Long) obj).longValue());
                break;
            case 4:
                x40Var.U2(((Long) obj).longValue());
                break;
            case 5:
                x40Var.Qq(((Integer) obj).intValue());
                break;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                x40Var.ei(((Long) obj).longValue());
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                x40Var.XX(((Integer) obj).intValue());
                break;
            case 8:
                x40Var.ro(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((z60) obj).VH(x40Var);
                break;
            case 10:
                x40Var.x9((z60) obj);
                break;
            case 11:
                if (!(obj instanceof i40)) {
                    x40Var.hz((String) obj);
                    break;
                } else {
                    x40Var.j3((i40) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof i40)) {
                    byte[] bArr = (byte[]) obj;
                    x40Var.jw(bArr, 0, bArr.length);
                    break;
                } else {
                    x40Var.j3((i40) obj);
                    break;
                }
            case 13:
                x40Var.OW(((Integer) obj).intValue());
                break;
            case 14:
                x40Var.XX(((Integer) obj).intValue());
                break;
            case 15:
                x40Var.ei(((Long) obj).longValue());
                break;
            case 16:
                x40Var.br(((Integer) obj).intValue());
                break;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                x40Var.a8(((Long) obj).longValue());
                break;
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                if (!(obj instanceof u50)) {
                    x40Var.Qq(((Integer) obj).intValue());
                    break;
                } else {
                    x40Var.Qq(((u50) obj).Hw());
                    break;
                }
        }
    }

    private final void j3(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b60) {
            b60.v5();
            throw null;
        }
        if (key.Ws()) {
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
        if (key.EQ() != e90.MESSAGE) {
            this.j6.put(key, U2(value));
            return;
        }
        Object objVH2 = VH(key);
        if (objVH2 == null) {
            this.j6.put(key, U2(value));
        } else {
            this.j6.put(key, objVH2 instanceof g70 ? key.er((g70) objVH2, (g70) value) : key.SI(((z60) objVH2).j6(), (z60) value).Mr());
        }
    }

    private final void tp(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.Ws()) {
            EQ(fielddescriptortype.gn(), obj);
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
                EQ(fielddescriptortype.gn(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof b60) {
            this.FH = true;
        }
        this.j6.put(fielddescriptortype, obj);
    }

    final boolean DW() {
        return this.j6.isEmpty();
    }

    public final boolean FH() {
        return this.DW;
    }

    public final boolean Hw() {
        for (int i = 0; i < this.j6.VH(); i++) {
            if (!aM(this.j6.QX(i))) {
                return false;
            }
        }
        Iterator it = this.j6.gn().iterator();
        while (it.hasNext()) {
            if (!aM((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int J8() {
        int iQX = 0;
        for (int i = 0; i < this.j6.VH(); i++) {
            Map.Entry<K, Object> entryQX = this.j6.QX(i);
            iQX += QX((j50) entryQX.getKey(), entryQX.getValue());
        }
        Iterator it = this.j6.gn().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iQX += QX((j50) entry.getKey(), entry.getValue());
        }
        return iQX;
    }

    public final int Ws() {
        int iMr = 0;
        for (int i = 0; i < this.j6.VH(); i++) {
            iMr += Mr(this.j6.QX(i));
        }
        Iterator it = this.j6.gn().iterator();
        while (it.hasNext()) {
            iMr += Mr((Map.Entry) it.next());
        }
        return iMr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        h50 h50Var = new h50();
        for (int i = 0; i < this.j6.VH(); i++) {
            Map.Entry<K, Object> entryQX = this.j6.QX(i);
            h50Var.tp((j50) entryQX.getKey(), entryQX.getValue());
        }
        Iterator it = this.j6.gn().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h50Var.tp((j50) entry.getKey(), entry.getValue());
        }
        h50Var.FH = this.FH;
        return h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h50) {
            return this.j6.equals(((h50) obj).j6);
        }
        return false;
    }

    public final int hashCode() {
        return this.j6.hashCode();
    }

    final Iterator<Map.Entry<FieldDescriptorType, Object>> j6() {
        return this.FH ? new e60(this.j6.u7().iterator()) : this.j6.u7().iterator();
    }

    public final void u7(h50<FieldDescriptorType> h50Var) {
        for (int i = 0; i < h50Var.j6.VH(); i++) {
            j3(h50Var.j6.QX(i));
        }
        Iterator it = h50Var.j6.gn().iterator();
        while (it.hasNext()) {
            j3((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> v5() {
        return this.FH ? new e60(this.j6.entrySet().iterator()) : this.j6.entrySet().iterator();
    }

    public final void we() {
        if (this.DW) {
            return;
        }
        this.j6.Zo();
        this.DW = true;
    }

    private h50(boolean z) {
        we();
    }
}
