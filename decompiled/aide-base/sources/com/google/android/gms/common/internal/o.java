package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    public static final class a {
        private final Object DW;
        private final List<String> j6;

        private a(Object obj) {
            p.u7(obj);
            this.DW = obj;
            this.j6 = new ArrayList();
        }

        public final a j6(String str, Object obj) {
            List<String> list = this.j6;
            p.u7(str);
            String str2 = str;
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(strValueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(strValueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.DW.getClass().getSimpleName());
            sb.append('{');
            int size = this.j6.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.j6.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static int DW(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a FH(Object obj) {
        return new a(obj);
    }

    public static boolean j6(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
