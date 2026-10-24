package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ai0 extends uh0 {
    public static ai0 tp(byte[] bArr) throws IOException {
        try {
            return new rh0(bArr).we();
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this;
    }

    public abstract boolean EQ();

    public ai0 J0() {
        return this;
    }

    public abstract boolean VH(ai0 ai0Var);

    @Override // abcd.uh0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh0) && VH(((mh0) obj).DW());
    }

    public abstract void gn(yh0 yh0Var);

    public abstract int u7();

    public ai0 we() {
        return this;
    }
}
