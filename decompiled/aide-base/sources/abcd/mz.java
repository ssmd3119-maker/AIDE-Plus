package abcd;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class mz {
    private List<my> DW = new ArrayList();
    private long FH;
    private String j6;

    public mz(String str, long j) {
        this.j6 = str;
        this.FH = j;
    }

    public List<my> DW() {
        return this.DW;
    }

    public String FH() {
        return this.j6;
    }

    public long Hw() {
        return this.FH;
    }

    public my j6() {
        my myVar = new my(this);
        this.DW.add(myVar);
        return myVar;
    }
}
