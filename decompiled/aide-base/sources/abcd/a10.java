package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class a10 {
    static h00 v5;
    int DW = 0;
    List<v00> FH = new LinkedList();
    Set<String> Hw = new HashSet();
    OutputStream j6;

    public a10(OutputStream outputStream) {
        this.j6 = null;
        this.j6 = outputStream;
    }

    private static h00 FH() {
        if (v5 == null) {
            v5 = i00.j6(a10.class.getName());
        }
        return v5;
    }

    public int DW() {
        return this.DW;
    }

    public void Hw(v00 v00Var) {
        String strWe = v00Var.we();
        if (this.Hw.contains(strWe)) {
            FH().v5("Skipping duplicate file in output: " + strWe);
            return;
        }
        v00Var.yS(this);
        this.FH.add(v00Var);
        this.Hw.add(strWe);
        if (FH().j6()) {
            z00.j6(FH(), v00Var);
        }
    }

    public void VH(int i) throws IOException {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i & 255);
            i >>= 8;
        }
        this.j6.write(bArr);
        this.DW += 4;
    }

    public void Zo(byte[] bArr, int i, int i2) throws IOException {
        this.j6.write(bArr, i, i2);
        this.DW += i2;
    }

    public void gn(short s) throws IOException {
        byte[] bArr = new byte[2];
        for (int i = 0; i < 2; i++) {
            bArr[i] = (byte) (s & 255);
            s = (short) (s >> 8);
        }
        this.j6.write(bArr);
        this.DW += 2;
    }

    public void j6() {
        u00 u00Var = new u00();
        u00Var.VH = DW();
        short size = (short) this.FH.size();
        u00Var.v5 = size;
        u00Var.Hw = size;
        Iterator<v00> it = this.FH.iterator();
        while (it.hasNext()) {
            it.next().er(this);
        }
        u00Var.Zo = DW() - u00Var.VH;
        u00Var.gn = "";
        u00Var.Hw(this);
        OutputStream outputStream = this.j6;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public void u7(String str) throws IOException {
        byte[] bytes = str.getBytes();
        this.j6.write(bytes);
        this.DW += bytes.length;
    }

    public void v5(byte[] bArr) throws IOException {
        this.j6.write(bArr);
        this.DW += bArr.length;
    }
}
