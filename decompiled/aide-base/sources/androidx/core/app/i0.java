package androidx.core.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class i0 {
    static Bundle[] DW(h0[] h0VarArr) {
        if (h0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[h0VarArr.length];
        for (int i = 0; i < h0VarArr.length; i++) {
            bundleArr[i] = j6(h0VarArr[i]);
        }
        return bundleArr;
    }

    static Bundle j6(h0 h0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", h0Var.Zo());
        bundle.putCharSequence("label", h0Var.v5());
        bundle.putCharSequenceArray("choices", h0Var.FH());
        bundle.putBoolean("allowFreeFormInput", h0Var.j6());
        bundle.putBundle("extras", h0Var.Hw());
        Set<String> setDW = h0Var.DW();
        if (setDW != null && !setDW.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setDW.size());
            Iterator<String> it = setDW.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }
}
