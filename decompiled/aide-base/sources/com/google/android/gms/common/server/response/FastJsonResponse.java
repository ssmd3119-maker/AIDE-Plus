package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.a CREATOR = new com.google.android.gms.common.server.response.a();
        protected final Class<? extends FastJsonResponse> AL;
        private final int WB;
        private a<I, O> cT;
        protected final int fY;
        private zak hK;
        protected final boolean jw;
        protected final String k2;
        protected final int mb;
        protected final boolean qp;
        private final String w9;
        protected final int zh;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
            this.WB = i;
            this.mb = i2;
            this.jw = z;
            this.fY = i3;
            this.qp = z2;
            this.k2 = str;
            this.zh = i4;
            if (str2 == null) {
                this.AL = null;
                this.w9 = null;
            } else {
                this.AL = SafeParcelResponse.class;
                this.w9 = str2;
            }
            if (zaaVar == null) {
                this.cT = null;
            } else {
                this.cT = (a<I, O>) zaaVar.EQ();
            }
        }

        private final String Ws() {
            String str = this.w9;
            if (str == null) {
                return null;
            }
            return str;
        }

        private final zaa aM() {
            a<I, O> aVar = this.cT;
            if (aVar == null) {
                return null;
            }
            return zaa.gn(aVar);
        }

        public final void J8(zak zakVar) {
            this.hK = zakVar;
        }

        public final boolean QX() {
            return this.cT != null;
        }

        public int gn() {
            return this.zh;
        }

        public final Map<String, Field<?, ?>> j3() {
            p.u7(this.w9);
            p.u7(this.hK);
            return this.hK.J8(this.w9);
        }

        public final I j6(O o) {
            return this.cT.j6(o);
        }

        public String toString() {
            o.a aVarFH = o.FH(this);
            aVarFH.j6("versionCode", Integer.valueOf(this.WB));
            aVarFH.j6("typeIn", Integer.valueOf(this.mb));
            aVarFH.j6("typeInArray", Boolean.valueOf(this.jw));
            aVarFH.j6("typeOut", Integer.valueOf(this.fY));
            aVarFH.j6("typeOutArray", Boolean.valueOf(this.qp));
            aVarFH.j6("outputFieldName", this.k2);
            aVarFH.j6("safeParcelFieldId", Integer.valueOf(this.zh));
            aVarFH.j6("concreteTypeName", Ws());
            Class<? extends FastJsonResponse> cls = this.AL;
            if (cls != null) {
                aVarFH.j6("concreteType.class", cls.getCanonicalName());
            }
            a<I, O> aVar = this.cT;
            if (aVar != null) {
                aVarFH.j6("converterName", aVar.getClass().getCanonicalName());
            }
            return aVarFH.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
            com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
            com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 2, this.mb);
            com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 3, this.jw);
            com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 4, this.fY);
            com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 5, this.qp);
            com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 6, this.k2, false);
            com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 7, gn());
            com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 8, Ws(), false);
            com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 9, aM(), i, false);
            com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
        }
    }

    public interface a<I, O> {
        I j6(O o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <O, I> I Hw(Field<I, O> field, Object obj) {
        return ((Field) field).cT != null ? field.j6(obj) : obj;
    }

    protected boolean DW(Field field) {
        if (field.fY != 11) {
            FH(field.k2);
            throw null;
        }
        if (field.qp) {
            String str = field.k2;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.k2;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean FH(String str);

    public abstract Map<String, Field<?, ?>> j6();

    public String toString() {
        Map<String, Field<?, ?>> mapJ6 = j6();
        StringBuilder sb = new StringBuilder(100);
        Iterator<String> it = mapJ6.keySet().iterator();
        if (it.hasNext()) {
            DW(mapJ6.get(it.next()));
            throw null;
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
