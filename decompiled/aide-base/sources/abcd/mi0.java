package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes.dex */
public class mi0 extends wh0 {
    private wh0[] mb;

    class a implements Enumeration {
        int j6 = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.j6 < mi0.this.mb.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            wh0[] wh0VarArr = mi0.this.mb;
            int i = this.j6;
            this.j6 = i + 1;
            return wh0VarArr[i];
        }
    }

    public mi0(byte[] bArr) {
        super(bArr);
    }

    private Vector XL() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.WB;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = i + 1000;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(this.WB, i, bArr2, 0, length);
            vector.addElement(new kj0(bArr2));
            i = i2;
        }
    }

    private static byte[] j3(wh0[] wh0VarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != wh0VarArr.length; i++) {
            try {
                byteArrayOutputStream.write(((kj0) wh0VarArr[i]).Ws());
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(String.valueOf(wh0VarArr[i].getClass().getName()) + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return true;
    }

    @Override // abcd.wh0
    public byte[] Ws() {
        return this.WB;
    }

    public Enumeration aM() {
        return this.mb == null ? XL().elements() : new a();
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        yh0Var.FH(36);
        yh0Var.FH(128);
        Enumeration enumerationAM = aM();
        while (enumerationAM.hasMoreElements()) {
            yh0Var.tp((mh0) enumerationAM.nextElement());
        }
        yh0Var.FH(0);
        yh0Var.FH(0);
    }

    @Override // abcd.ai0
    public int u7() {
        Enumeration enumerationAM = aM();
        int iU7 = 0;
        while (enumerationAM.hasMoreElements()) {
            iU7 += ((mh0) enumerationAM.nextElement()).DW().u7();
        }
        return iU7 + 2 + 2;
    }

    public mi0(wh0[] wh0VarArr) {
        super(j3(wh0VarArr));
        this.mb = wh0VarArr;
    }
}
