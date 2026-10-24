package abcd;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y00 {
    static h00 VH;
    RandomAccessFile DW;
    long FH;
    u00 Zo;
    public String j6;
    int Hw = 0;
    Map<String, v00> v5 = new LinkedHashMap();

    public y00(String str) {
        this.DW = null;
        this.j6 = str;
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.j6), "r");
        this.DW = randomAccessFile;
        this.FH = randomAccessFile.length();
    }

    private static h00 Hw() {
        if (VH == null) {
            VH = i00.j6(y00.class.getName());
        }
        return VH;
    }

    private void j6() {
        try {
            this.DW.seek(tp(256));
            this.Zo = u00.FH(this);
            boolean zJ6 = Hw().j6();
            if (zJ6) {
                Hw().Hw(String.format("EOCD found in %d iterations", Integer.valueOf(this.Hw)));
                Hw().Hw(String.format("Directory entries=%d, size=%d, offset=%d/0x%08x", Short.valueOf(this.Zo.v5), Integer.valueOf(this.Zo.Zo), Integer.valueOf(this.Zo.VH), Integer.valueOf(this.Zo.VH)));
                z00.DW(Hw());
            }
            this.DW.seek(this.Zo.VH);
            for (int i = 0; i < this.Zo.v5; i++) {
                v00 v00VarU2 = v00.U2(this);
                this.v5.put(v00VarU2.we(), v00VarU2);
                if (zJ6) {
                    z00.j6(Hw(), v00VarU2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static y00 v5(String str) {
        y00 y00Var = new y00(str);
        y00Var.j6();
        return y00Var;
    }

    public Map<String, v00> DW() {
        return this.v5;
    }

    public void EQ(long j) throws IOException {
        this.DW.seek(j);
    }

    public long FH() {
        return this.DW.getFilePointer();
    }

    public int VH() {
        int unsignedByte = 0;
        for (int i = 0; i < 4; i++) {
            unsignedByte |= this.DW.readUnsignedByte() << (i * 8);
        }
        return unsignedByte;
    }

    public byte[] Zo(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = this.DW.readByte();
        }
        return bArr;
    }

    public short gn() {
        short unsignedByte = 0;
        for (int i = 0; i < 2; i++) {
            unsignedByte = (short) (unsignedByte | (this.DW.readUnsignedByte() << (i * 8)));
        }
        return unsignedByte;
    }

    public long tp(int i) throws IOException {
        long j = i;
        long j2 = this.FH;
        if (j > j2 || i > 65536) {
            throw new IllegalStateException("End of central directory not found in " + this.j6);
        }
        int iMin = (int) Math.min(j2, j);
        byte[] bArr = new byte[iMin];
        long j3 = iMin;
        this.DW.seek(this.FH - j3);
        this.DW.readFully(bArr);
        for (int i2 = iMin - 22; i2 >= 0; i2--) {
            this.Hw++;
            if (bArr[i2] == 80 && bArr[i2 + 1] == 75 && bArr[i2 + 2] == 5 && bArr[i2 + 3] == 6) {
                return (this.FH - j3) + i2;
            }
        }
        return tp(i * 2);
    }

    public String u7(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = this.DW.readByte();
        }
        return new String(bArr);
    }
}
