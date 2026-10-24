package abcd;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class id0 {
    StringBuilder FH;
    Map<String, k70> j6 = Collections.emptyMap();
    final SortedMap<String, je0> DW = new TreeMap();

    public void DW(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        if (this.FH == null) {
            this.FH = new StringBuilder();
        }
        this.FH.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        this.FH.append('\n');
    }

    public final k70 FH(String str) {
        return this.j6.get(str);
    }

    public Collection<k70> Hw() {
        return Collections.unmodifiableCollection(this.j6.values());
    }

    public void Zo(ue0 ue0Var, Map<String, k70> map) {
        this.j6 = map;
    }

    public void j6(je0 je0Var) {
        this.DW.put(je0Var.DW(), je0Var);
    }

    public String v5() {
        StringBuilder sb = this.FH;
        return sb != null ? sb.toString() : "";
    }
}
