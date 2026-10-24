package abcd;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class bp0 {
    private Vector DW;
    private Hashtable j6;

    public bp0(Hashtable hashtable, Vector vector) {
        this.j6 = hashtable;
        this.DW = vector;
    }

    public Enumeration DW() {
        return this.DW.elements();
    }

    public void FH(vh0 vh0Var, mh0 mh0Var) {
        if (this.j6.containsKey(vh0Var)) {
            this.j6.put(vh0Var, mh0Var);
        } else {
            this.j6.put(vh0Var, mh0Var);
            this.DW.addElement(vh0Var);
        }
    }

    public mh0 j6(jj0 jj0Var) {
        return (mh0) this.j6.get(jj0Var);
    }

    public bp0() {
        this(new Hashtable(), new Vector());
    }
}
