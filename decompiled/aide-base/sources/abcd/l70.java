package abcd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class l70 implements Comparator<k70> {
    public static final l70 WB = new l70();

    public static int DW(k70 k70Var, String str) {
        return k70Var.getName().compareTo(str);
    }

    public static int FH(k70 k70Var, k70 k70Var2) {
        return k70Var.getName().compareTo(k70Var2.getName());
    }

    public static Collection<k70> Hw(Collection<k70> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, WB);
        return arrayList;
    }

    @Override // java.util.Comparator
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compare(k70 k70Var, k70 k70Var2) {
        return FH(k70Var, k70Var2);
    }
}
