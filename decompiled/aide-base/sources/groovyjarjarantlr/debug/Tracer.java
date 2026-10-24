package groovyjarjarantlr.debug;

import java.io.PrintStream;

/* loaded from: classes.dex */
public class Tracer extends TraceAdapter implements TraceListener {
    String WB = "";

    protected void VH() {
        if (this.WB.length() < 2) {
            this.WB = "";
        } else {
            this.WB = this.WB.substring(2);
        }
    }

    @Override // groovyjarjarantlr.debug.TraceAdapter, groovyjarjarantlr.debug.TraceListener
    public void aM(TraceEvent traceEvent) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(traceEvent);
        printStream.println(stringBuffer.toString());
        gn();
    }

    protected void gn() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append("  ");
        this.WB = stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.debug.TraceAdapter, groovyjarjarantlr.debug.TraceListener
    public void j3(TraceEvent traceEvent) {
        VH();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.WB);
        stringBuffer.append(traceEvent);
        printStream.println(stringBuffer.toString());
    }
}
