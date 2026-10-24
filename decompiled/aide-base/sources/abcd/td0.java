package abcd;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class td0 extends id0 {
    private Map<String, ae0> Hw = Collections.emptyMap();

    public Collection<ae0> VH() {
        return Collections.unmodifiableCollection(this.Hw.values());
    }

    public void gn(Map<String, ae0> map) {
        this.Hw = map;
    }
}
