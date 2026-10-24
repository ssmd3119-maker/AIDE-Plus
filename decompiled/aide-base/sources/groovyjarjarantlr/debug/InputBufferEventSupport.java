package groovyjarjarantlr.debug;

import java.util.Vector;

/* loaded from: classes.dex */
public class InputBufferEventSupport {
    private InputBufferEvent DW;
    private Vector j6;

    public void DW(int i, ListenerBase listenerBase) {
        if (i == 0) {
            ((InputBufferListener) listenerBase).lg(this.DW);
            return;
        }
        if (i == 1) {
            ((InputBufferListener) listenerBase).J0(this.DW);
            return;
        }
        if (i == 2) {
            ((InputBufferListener) listenerBase).a8(this.DW);
            return;
        }
        if (i == 3) {
            ((InputBufferListener) listenerBase).QX(this.DW);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("bad type ");
        stringBuffer.append(i);
        stringBuffer.append(" for fireEvent()");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void FH(int i, Vector vector) {
        synchronized (this) {
            if (vector == null) {
                return;
            }
            Vector vector2 = (Vector) vector.clone();
            if (vector2 != null) {
                for (int i2 = 0; i2 < vector2.size(); i2++) {
                    DW(i, (ListenerBase) vector2.elementAt(i2));
                }
            }
        }
    }

    public void Hw(char c, int i) {
        this.DW.gn(1, c, i);
        FH(1, this.j6);
    }

    public void Zo(int i) {
        this.DW.gn(3, ' ', i);
        FH(3, this.j6);
    }

    public void j6(char c) {
        this.DW.gn(0, c, 0);
        FH(0, this.j6);
    }

    public void v5(int i) {
        this.DW.gn(2, ' ', i);
        FH(2, this.j6);
    }
}
