package abcd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class o10 extends m10<List<k70>> {
    private b FH;

    class a implements Comparator<k70> {
        public a(o10 o10Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(k70 k70Var, k70 k70Var2) {
            return k70Var.getName().compareTo(k70Var2.getName());
        }
    }

    public enum b {
        ALL,
        REMOTE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            int length = bVarArrValuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    public o10(p70 p70Var) {
        super(p70Var);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public List<k70> call() {
        Map<String, k70> map;
        j6();
        try {
            if (this.FH == null) {
                map = this.j6.Ws().Hw("refs/heads/");
            } else if (this.FH == b.REMOTE) {
                map = this.j6.Ws().Hw("refs/remotes/");
            } else {
                map = new HashMap<>(this.j6.Ws().Hw("refs/heads/"));
                map.putAll(this.j6.Ws().Hw("refs/remotes/"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(map.values());
            Collections.sort(arrayList, new a(this));
            FH(false);
            return arrayList;
        } catch (IOException e) {
            throw new o20(e.getMessage(), e);
        }
    }

    public o10 v5(b bVar) {
        j6();
        this.FH = bVar;
        return this;
    }
}
