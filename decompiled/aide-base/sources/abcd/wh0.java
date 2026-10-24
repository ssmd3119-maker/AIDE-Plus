package abcd;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class wh0 extends ai0 implements xh0 {
    byte[] WB;

    public wh0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.WB = bArr;
    }

    public static wh0 J8(Object obj) {
        if (obj == null || (obj instanceof wh0)) {
            return (wh0) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return J8(ai0.tp((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof mh0) {
            ai0 ai0VarDW = ((mh0) obj).DW();
            if (ai0VarDW instanceof wh0) {
                return (wh0) ai0VarDW;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // abcd.dk0
    public ai0 Hw() {
        DW();
        return this;
    }

    @Override // abcd.ai0
    public ai0 J0() {
        return new kj0(this.WB);
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof wh0) {
            return dq0.j6(this.WB, ((wh0) ai0Var).WB);
        }
        return false;
    }

    public byte[] Ws() {
        return this.WB;
    }

    @Override // abcd.uh0
    public int hashCode() {
        return dq0.Hw(Ws());
    }

    @Override // abcd.xh0
    public InputStream j6() {
        return new ByteArrayInputStream(this.WB);
    }

    public String toString() {
        return "#" + new String(kq0.DW(this.WB));
    }

    @Override // abcd.ai0
    public ai0 we() {
        return new kj0(this.WB);
    }
}
