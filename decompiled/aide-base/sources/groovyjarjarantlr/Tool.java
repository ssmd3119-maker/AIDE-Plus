package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.BitSet;
import java.io.InputStreamReader;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class Tool {
    public Tool() {
        new InputStreamReader(System.in);
        new BitSet();
        new DefaultToolErrorHandler(this);
    }

    public void DW(String str, String str2, int i, int i2) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FileLineFormatter.DW().j6(str2, i, i2));
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void FH(String str) {
        System.err.println(str);
        Utils.j6(str);
        throw null;
    }

    public void Hw(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("panic: ");
        stringBuffer.append(str);
        FH(stringBuffer.toString());
        throw null;
    }

    public void Zo(String str, String str2, int i, int i2) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FileLineFormatter.DW().j6(str2, i, i2));
        stringBuffer.append("warning:");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void j6(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void v5(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("warning: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }
}
