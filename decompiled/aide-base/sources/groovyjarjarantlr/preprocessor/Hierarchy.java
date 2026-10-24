package groovyjarjarantlr.preprocessor;

import groovyjarjarantlr.collections.impl.IndexedVector;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class Hierarchy {
    public static String j6(IndexedVector indexedVector) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("options {");
        stringBuffer.append(System.getProperty("line.separator"));
        String string = stringBuffer.toString();
        Enumeration enumerationDW = indexedVector.DW();
        while (enumerationDW.hasMoreElements()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            stringBuffer2.append((Option) enumerationDW.nextElement());
            stringBuffer2.append(System.getProperty("line.separator"));
            string = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(string);
        stringBuffer3.append("}");
        stringBuffer3.append(System.getProperty("line.separator"));
        stringBuffer3.append(System.getProperty("line.separator"));
        return stringBuffer3.toString();
    }
}
