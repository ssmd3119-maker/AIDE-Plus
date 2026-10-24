package groovyjarjarantlr.debug;

import java.util.EventObject;

/* loaded from: classes.dex */
public abstract class Event extends EventObject {
    private int WB;

    void DW(int i) {
        this.WB = i;
    }

    void FH(int i) {
        DW(i);
    }

    public int j6() {
        return this.WB;
    }
}
