package groovyjarjarantlr.preprocessor;

import groovyjarjarantlr.collections.impl.IndexedVector;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class GrammarFile {
    protected IndexedVector DW;
    protected IndexedVector FH;
    protected String j6;

    public String toString() {
        String str = this.j6;
        if (str == null) {
            str = "";
        }
        IndexedVector indexedVector = this.DW;
        String strJ6 = indexedVector != null ? Hierarchy.j6(indexedVector) : "";
        StringBuffer stringBuffer = new StringBuffer(10000);
        stringBuffer.append(str);
        stringBuffer.append(strJ6);
        Enumeration enumerationDW = this.FH.DW();
        while (enumerationDW.hasMoreElements()) {
            stringBuffer.append(((Grammar) enumerationDW.nextElement()).toString());
        }
        return stringBuffer.toString();
    }
}
