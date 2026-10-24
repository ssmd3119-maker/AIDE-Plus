package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new e();
    private final int WB;
    private final zak fY;
    private final int jw;
    private int k2;
    private final Parcel mb;
    private final String qp;
    private int zh;

    SafeParcelResponse(int i, Parcel parcel, zak zakVar) {
        this.WB = i;
        p.u7(parcel);
        this.mb = parcel;
        this.jw = 2;
        this.fY = zakVar;
        if (zakVar == null) {
            this.qp = null;
        } else {
            this.qp = zakVar.EQ();
        }
        this.k2 = 2;
    }

    private final void VH(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (!field.jw) {
            v5(sb, field.mb, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            v5(sb, field.mb, arrayList.get(i));
        }
        sb.append("]");
    }

    private final void Zo(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().gn(), entry);
        }
        sb.append('{');
        int iCn = com.google.android.gms.common.internal.safeparcel.a.cn(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iCn) {
            int iBT = com.google.android.gms.common.internal.safeparcel.a.BT(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(com.google.android.gms.common.internal.safeparcel.a.a8(iBT));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field<?, ?> field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.QX()) {
                    switch (field.fY) {
                        case 0:
                            VH(sb, field, FastJsonResponse.Hw(field, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT))));
                            break;
                        case 1:
                            VH(sb, field, FastJsonResponse.Hw(field, com.google.android.gms.common.internal.safeparcel.a.FH(parcel, iBT)));
                            break;
                        case 2:
                            VH(sb, field, FastJsonResponse.Hw(field, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT))));
                            break;
                        case 3:
                            VH(sb, field, FastJsonResponse.Hw(field, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.yS(parcel, iBT))));
                            break;
                        case 4:
                            VH(sb, field, FastJsonResponse.Hw(field, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.rN(parcel, iBT))));
                            break;
                        case 5:
                            VH(sb, field, FastJsonResponse.Hw(field, com.google.android.gms.common.internal.safeparcel.a.j6(parcel, iBT)));
                            break;
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                            VH(sb, field, FastJsonResponse.Hw(field, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT))));
                            break;
                        case UserTouchAction.CLICK_KIND /* 7 */:
                            VH(sb, field, FastJsonResponse.Hw(field, com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT)));
                            break;
                        case 8:
                        case 9:
                            VH(sb, field, FastJsonResponse.Hw(field, com.google.android.gms.common.internal.safeparcel.a.VH(parcel, iBT)));
                            break;
                        case 10:
                            Bundle bundleZo = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleZo.keySet()) {
                                map2.put(str2, bundleZo.getString(str2));
                            }
                            VH(sb, field, FastJsonResponse.Hw(field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.fY;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.qp) {
                    sb.append("[");
                    switch (field.fY) {
                        case 0:
                            com.google.android.gms.common.util.b.v5(sb, com.google.android.gms.common.internal.safeparcel.a.tp(parcel, iBT));
                            break;
                        case 1:
                            com.google.android.gms.common.util.b.VH(sb, com.google.android.gms.common.internal.safeparcel.a.Hw(parcel, iBT));
                            break;
                        case 2:
                            com.google.android.gms.common.util.b.Zo(sb, com.google.android.gms.common.internal.safeparcel.a.we(parcel, iBT));
                            break;
                        case 3:
                            com.google.android.gms.common.util.b.Hw(sb, com.google.android.gms.common.internal.safeparcel.a.u7(parcel, iBT));
                            break;
                        case 4:
                            com.google.android.gms.common.util.b.FH(sb, com.google.android.gms.common.internal.safeparcel.a.gn(parcel, iBT));
                            break;
                        case 5:
                            com.google.android.gms.common.util.b.VH(sb, com.google.android.gms.common.internal.safeparcel.a.DW(parcel, iBT));
                            break;
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                            com.google.android.gms.common.util.b.gn(sb, com.google.android.gms.common.internal.safeparcel.a.v5(parcel, iBT));
                            break;
                        case UserTouchAction.CLICK_KIND /* 7 */:
                            com.google.android.gms.common.util.b.u7(sb, com.google.android.gms.common.internal.safeparcel.a.XL(parcel, iBT));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] parcelArrJ8 = com.google.android.gms.common.internal.safeparcel.a.J8(parcel, iBT);
                            int length = parcelArrJ8.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                parcelArrJ8[i2].setDataPosition(0);
                                Zo(sb, field.j3(), parcelArrJ8[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.fY) {
                        case 0:
                            sb.append(com.google.android.gms.common.internal.safeparcel.a.P8(parcel, iBT));
                            break;
                        case 1:
                            sb.append(com.google.android.gms.common.internal.safeparcel.a.FH(parcel, iBT));
                            break;
                        case 2:
                            sb.append(com.google.android.gms.common.internal.safeparcel.a.nw(parcel, iBT));
                            break;
                        case 3:
                            sb.append(com.google.android.gms.common.internal.safeparcel.a.yS(parcel, iBT));
                            break;
                        case 4:
                            sb.append(com.google.android.gms.common.internal.safeparcel.a.rN(parcel, iBT));
                            break;
                        case 5:
                            sb.append(com.google.android.gms.common.internal.safeparcel.a.j6(parcel, iBT));
                            break;
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                            sb.append(com.google.android.gms.common.internal.safeparcel.a.lg(parcel, iBT));
                            break;
                        case UserTouchAction.CLICK_KIND /* 7 */:
                            String strQX = com.google.android.gms.common.internal.safeparcel.a.QX(parcel, iBT);
                            sb.append("\"");
                            sb.append(l.j6(strQX));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrVH = com.google.android.gms.common.internal.safeparcel.a.VH(parcel, iBT);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.c.j6(bArrVH));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrVH2 = com.google.android.gms.common.internal.safeparcel.a.VH(parcel, iBT);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.c.DW(bArrVH2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleZo2 = com.google.android.gms.common.internal.safeparcel.a.Zo(parcel, iBT);
                            Set<String> setKeySet = bundleZo2.keySet();
                            setKeySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(l.j6(bundleZo2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel parcelJ0 = com.google.android.gms.common.internal.safeparcel.a.J0(parcel, iBT);
                            parcelJ0.setDataPosition(0);
                            Zo(sb, field.j3(), parcelJ0);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == iCn) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(iCn);
        throw new a.C0113a(sb3.toString(), parcel);
    }

    private final Parcel gn() {
        int i = this.k2;
        if (i != 0) {
            if (i == 1) {
            }
            return this.mb;
        }
        this.zh = com.google.android.gms.common.internal.safeparcel.b.j6(this.mb);
        com.google.android.gms.common.internal.safeparcel.b.DW(this.mb, this.zh);
        this.k2 = 2;
        return this.mb;
    }

    private static void v5(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                sb.append(obj);
                return;
            case UserTouchAction.CLICK_KIND /* 7 */:
                sb.append("\"");
                sb.append(l.j6(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.c.j6((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.c.DW((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                m.j6(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public boolean FH(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Map<String, FastJsonResponse.Field<?, ?>> j6() {
        zak zakVar = this.fY;
        if (zakVar == null) {
            return null;
        }
        return zakVar.J8(this.qp);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public String toString() {
        p.tp(this.fY, "Cannot convert to JSON on client side.");
        Parcel parcelGn = gn();
        parcelGn.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        Zo(sb, this.fY.J8(this.qp), parcelGn);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zak zakVar;
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.Ws(parcel, 2, gn(), false);
        int i2 = this.jw;
        if (i2 == 0) {
            zakVar = null;
        } else {
            if (i2 != 1 && i2 != 2) {
                int i3 = this.jw;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
            zakVar = this.fY;
        }
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, zakVar, i, false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
