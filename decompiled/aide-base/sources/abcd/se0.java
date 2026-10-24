package abcd;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class se0 {
    private static /* synthetic */ int[] j6;

    public enum a {
        USER,
        PASS,
        HOST,
        PORT,
        PATH;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = j6;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[a.valuesCustom().length];
        try {
            iArr2[a.HOST.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[a.PASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[a.PATH.ordinal()] = 5;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a.PORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        j6 = iArr2;
        return iArr2;
    }

    public boolean DW(ue0 ue0Var) {
        return FH(ue0Var, null, null);
    }

    public boolean FH(ue0 ue0Var, p70 p70Var, String str) {
        if (!VH().isEmpty() && !VH().contains(ue0Var.EQ())) {
            return false;
        }
        Iterator<a> it = Zo().iterator();
        while (it.hasNext()) {
            int i = j6()[it.next().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5 || ue0Var.gn() == null || ue0Var.gn().length() == 0) {
                                return false;
                            }
                        } else if (ue0Var.u7() <= 0) {
                            return false;
                        }
                    } else if (ue0Var.v5() == null || ue0Var.v5().length() == 0) {
                        return false;
                    }
                } else if (ue0Var.VH() == null || ue0Var.VH().length() == 0) {
                    return false;
                }
            } else if (ue0Var.we() == null || ue0Var.we().length() == 0) {
                return false;
            }
        }
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) Zo());
        enumSetCopyOf.addAll(v5());
        if (ue0Var.we() != null && !enumSetCopyOf.contains(a.USER)) {
            return false;
        }
        if (ue0Var.VH() != null && !enumSetCopyOf.contains(a.PASS)) {
            return false;
        }
        if (ue0Var.v5() != null && !enumSetCopyOf.contains(a.HOST)) {
            return false;
        }
        if (ue0Var.u7() <= 0 || enumSetCopyOf.contains(a.PORT)) {
            return ue0Var.gn() == null || enumSetCopyOf.contains(a.PATH);
        }
        return false;
    }

    public abstract String Hw();

    public Set<String> VH() {
        return Collections.emptySet();
    }

    public Set<a> Zo() {
        return Collections.unmodifiableSet(EnumSet.of(a.PATH));
    }

    public abstract le0 gn(ue0 ue0Var, p70 p70Var, String str);

    public Set<a> v5() {
        return Collections.emptySet();
    }
}
