package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class InputBufferReporter implements InputBufferListener {
    @Override // groovyjarjarantlr.debug.InputBufferListener
    public void J0(InputBufferEvent inputBufferEvent) {
        System.out.println(inputBufferEvent);
    }

    @Override // groovyjarjarantlr.debug.InputBufferListener
    public void QX(InputBufferEvent inputBufferEvent) {
        System.out.println(inputBufferEvent);
    }

    @Override // groovyjarjarantlr.debug.InputBufferListener
    public void a8(InputBufferEvent inputBufferEvent) {
        System.out.println(inputBufferEvent);
    }

    @Override // groovyjarjarantlr.debug.InputBufferListener
    public void lg(InputBufferEvent inputBufferEvent) {
        System.out.println(inputBufferEvent);
    }

    @Override // groovyjarjarantlr.debug.ListenerBase
    public void v5(TraceEvent traceEvent) {
    }
}
