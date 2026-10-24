package abcd;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class mk0 {
    private Hashtable j6;

    public mk0(Hashtable hashtable) {
        this.j6 = new Hashtable();
        this.j6 = j6(hashtable);
    }

    private Hashtable j6(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    public nh0 DW() {
        nh0 nh0Var = new nh0();
        Enumeration enumerationElements = this.j6.elements();
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            if (objNextElement instanceof Vector) {
                Enumeration enumerationElements2 = ((Vector) objNextElement).elements();
                while (enumerationElements2.hasMoreElements()) {
                    nh0Var.j6(lk0.gn(enumerationElements2.nextElement()));
                }
            } else {
                nh0Var.j6(lk0.gn(objNextElement));
            }
        }
        return nh0Var;
    }
}
