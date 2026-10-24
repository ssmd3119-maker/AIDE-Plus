package abcd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.Date;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes.dex */
public class v00 implements Cloneable {
    private static h00 pO;
    private static byte[] sg = new byte[4];
    private int AL;
    private int Jl;
    private short Q6;
    private y00 WB;
    private short Z1;
    private String cT;
    private byte[] e3;
    private long eU;
    private short fY;
    private int hK;
    private int iW;
    private short jw;
    private short k2;
    private short kf;
    private short mb;
    private String n5;
    private byte[] q7;
    private short qp;
    private x00 sE;
    private int w9;
    private short zh;

    public v00(y00 y00Var) {
        this.Z1 = (short) 0;
        this.eU = -1L;
        this.e3 = null;
        this.sE = null;
        this.WB = y00Var;
    }

    public static h00 EQ() {
        if (pO == null) {
            pO = i00.j6(v00.class.getName());
        }
        return pO;
    }

    public static v00 U2(y00 y00Var) throws IOException {
        if (y00Var.VH() != 33639248) {
            y00Var.EQ(y00Var.FH() - 4);
            return null;
        }
        v00 v00Var = new v00(y00Var);
        v00Var.j6(y00Var);
        return v00Var;
    }

    private void j6(y00 y00Var) {
        boolean zJ6 = EQ().j6();
        short sGn = y00Var.gn();
        this.mb = sGn;
        if (zJ6) {
            pO.Hw(String.format("Version made by: 0x%04x", Short.valueOf(sGn)));
        }
        short sGn2 = y00Var.gn();
        this.jw = sGn2;
        if (zJ6) {
            pO.Hw(String.format("Version required: 0x%04x", Short.valueOf(sGn2)));
        }
        short sGn3 = y00Var.gn();
        this.fY = sGn3;
        if (zJ6) {
            pO.Hw(String.format("General purpose bits: 0x%04x", Short.valueOf(sGn3)));
        }
        if ((this.fY & 63473) != 0) {
            throw new IllegalStateException("Can't handle general purpose bits == " + String.format("0x%04x", Short.valueOf(this.fY)));
        }
        short sGn4 = y00Var.gn();
        this.qp = sGn4;
        if (zJ6) {
            pO.Hw(String.format("Compression: 0x%04x", Short.valueOf(sGn4)));
        }
        short sGn5 = y00Var.gn();
        this.k2 = sGn5;
        if (zJ6) {
            pO.Hw(String.format("Modification time: 0x%04x", Short.valueOf(sGn5)));
        }
        short sGn6 = y00Var.gn();
        this.zh = sGn6;
        if (zJ6) {
            pO.Hw(String.format("Modification date: 0x%04x", Short.valueOf(sGn6)));
        }
        int iVH = y00Var.VH();
        this.AL = iVH;
        if (zJ6) {
            pO.Hw(String.format("CRC-32: 0x%04x", Integer.valueOf(iVH)));
        }
        int iVH2 = y00Var.VH();
        this.w9 = iVH2;
        if (zJ6) {
            pO.Hw(String.format("Compressed size: 0x%04x", Integer.valueOf(iVH2)));
        }
        int iVH3 = y00Var.VH();
        this.hK = iVH3;
        if (zJ6) {
            pO.Hw(String.format("Size: 0x%04x", Integer.valueOf(iVH3)));
        }
        short sGn7 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("File name length: 0x%04x", Short.valueOf(sGn7)));
        }
        short sGn8 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("Extra length: 0x%04x", Short.valueOf(sGn8)));
        }
        short sGn9 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("File comment length: 0x%04x", Short.valueOf(sGn9)));
        }
        short sGn10 = y00Var.gn();
        this.Q6 = sGn10;
        if (zJ6) {
            pO.Hw(String.format("Disk number start: 0x%04x", Short.valueOf(sGn10)));
        }
        short sGn11 = y00Var.gn();
        this.kf = sGn11;
        if (zJ6) {
            pO.Hw(String.format("Internal attributes: 0x%04x", Short.valueOf(sGn11)));
        }
        int iVH4 = y00Var.VH();
        this.Jl = iVH4;
        if (zJ6) {
            pO.Hw(String.format("External attributes: 0x%08x", Integer.valueOf(iVH4)));
        }
        int iVH5 = y00Var.VH();
        this.iW = iVH5;
        if (zJ6) {
            pO.Hw(String.format("Local header offset: 0x%08x", Integer.valueOf(iVH5)));
        }
        this.cT = y00Var.u7(sGn7);
        if (zJ6) {
            pO.Hw("Filename: " + this.cT);
        }
        this.q7 = y00Var.Zo(sGn8);
        this.n5 = y00Var.u7(sGn9);
        if (zJ6) {
            pO.Hw("File comment: " + this.n5);
        }
        this.fY = (short) (this.fY & 2048);
        if (this.hK == 0) {
            this.w9 = 0;
            this.qp = (short) 0;
            this.AL = 0;
        }
    }

    public int FH() {
        return this.w9;
    }

    public short Hw() {
        return this.qp;
    }

    public OutputStream J0() {
        x00 x00Var = new x00(this.qp, new ByteArrayOutputStream());
        this.sE = x00Var;
        return x00Var;
    }

    public int J8() {
        return this.hK;
    }

    public byte[] VH() throws IOException {
        byte[] bArr = this.e3;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[this.hK];
        InputStream inputStreamU7 = u7();
        int i = 0;
        while (true) {
            int i2 = this.hK;
            if (i == i2) {
                return bArr2;
            }
            int i3 = inputStreamU7.read(bArr2, i, i2 - i);
            if (i3 < 0) {
                throw new IllegalStateException(String.format("Read failed, expecting %d bytes, got %d instead", Integer.valueOf(this.hK), Integer.valueOf(i)));
            }
            i += i3;
        }
    }

    public long Ws() {
        short s = this.zh;
        int i = ((s >> 9) & 127) + 80;
        int i2 = ((s >> 5) & 15) - 1;
        int i3 = s & 31;
        short s2 = this.k2;
        return new Date(i, i2, i3, (s2 >> 11) & 31, (s2 >> 5) & 63, (s2 << 1) & 62).getTime();
    }

    public y00 XL() {
        return this.WB;
    }

    public int Zo() {
        return this.AL;
    }

    public void er(a10 a10Var) {
        EQ().j6();
        a10Var.VH(33639248);
        a10Var.gn(this.mb);
        a10Var.gn(this.jw);
        a10Var.gn(this.fY);
        a10Var.gn(this.qp);
        a10Var.gn(this.k2);
        a10Var.gn(this.zh);
        a10Var.VH(this.AL);
        a10Var.VH(this.w9);
        a10Var.VH(this.hK);
        a10Var.gn((short) this.cT.length());
        a10Var.gn((short) (this.q7.length + this.Z1));
        a10Var.gn((short) this.n5.length());
        a10Var.gn(this.Q6);
        a10Var.gn(this.kf);
        a10Var.VH(this.Jl);
        a10Var.VH(this.iW);
        a10Var.u7(this.cT);
        a10Var.v5(this.q7);
        short s = this.Z1;
        if (s > 0) {
            a10Var.Zo(sg, 0, s);
        }
        a10Var.u7(this.n5);
    }

    public long gn() {
        return this.eU;
    }

    public boolean j3() {
        return this.cT.endsWith("/");
    }

    public void lg() {
        y00 y00Var = this.WB;
        boolean zJ6 = EQ().j6();
        y00Var.EQ(this.iW);
        if (zJ6) {
            EQ().Hw(String.format("FILE POSITION: 0x%08x", Long.valueOf(y00Var.FH())));
        }
        if (y00Var.VH() != 67324752) {
            throw new IllegalStateException(String.format("Local header not found at pos=0x%08x, file=%s", Long.valueOf(y00Var.FH()), this.cT));
        }
        short sGn = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("Version required: 0x%04x", Short.valueOf(sGn)));
        }
        short sGn2 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("General purpose bits: 0x%04x", Short.valueOf(sGn2)));
        }
        short sGn3 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("Compression: 0x%04x", Short.valueOf(sGn3)));
        }
        short sGn4 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("Modification time: 0x%04x", Short.valueOf(sGn4)));
        }
        short sGn5 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("Modification date: 0x%04x", Short.valueOf(sGn5)));
        }
        int iVH = y00Var.VH();
        if (zJ6) {
            pO.Hw(String.format("CRC-32: 0x%04x", Integer.valueOf(iVH)));
        }
        int iVH2 = y00Var.VH();
        if (zJ6) {
            pO.Hw(String.format("Compressed size: 0x%04x", Integer.valueOf(iVH2)));
        }
        int iVH3 = y00Var.VH();
        if (zJ6) {
            pO.Hw(String.format("Size: 0x%04x", Integer.valueOf(iVH3)));
        }
        short sGn6 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("File name length: 0x%04x", Short.valueOf(sGn6)));
        }
        short sGn7 = y00Var.gn();
        if (zJ6) {
            pO.Hw(String.format("Extra length: 0x%04x", Short.valueOf(sGn7)));
        }
        String strU7 = y00Var.u7(sGn6);
        if (zJ6) {
            pO.Hw("Filename: " + strU7);
        }
        y00Var.Zo(sGn7);
        long jFH = y00Var.FH();
        this.eU = jFH;
        if (zJ6) {
            pO.Hw(String.format("Data position: 0x%08x", Long.valueOf(jFH)));
        }
    }

    public void rN(long j) {
        long month = new Date(j).getYear() + 1900 < 1980 ? 2162688L : ((r3 - 1980) << 25) | ((r0.getMonth() + 1) << 21) | (r0.getDate() << 16) | (r0.getHours() << 11) | (r0.getMinutes() << 5) | (r0.getSeconds() >> 1);
        this.zh = (short) (month >> 16);
        this.k2 = (short) (65535 & month);
    }

    public InputStream tp(OutputStream outputStream) throws IOException {
        x00 x00Var = this.sE;
        if (x00Var == null) {
            w00 w00Var = new w00(this);
            if (outputStream != null) {
                w00Var.DW(outputStream);
            }
            if (this.qp == 0) {
                return w00Var;
            }
            w00Var.FH(true);
            return new InflaterInputStream(w00Var, new Inflater(true));
        }
        x00Var.close();
        this.hK = this.sE.DW();
        byte[] byteArray = ((ByteArrayOutputStream) this.sE.FH()).toByteArray();
        this.e3 = byteArray;
        this.w9 = byteArray.length;
        this.AL = this.sE.j6();
        this.sE = null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.e3);
        return this.qp == 0 ? byteArrayInputStream : new InflaterInputStream(new SequenceInputStream(byteArrayInputStream, new ByteArrayInputStream(new byte[1])), new Inflater(true));
    }

    public InputStream u7() {
        return tp(null);
    }

    public String we() {
        return this.cT;
    }

    public void yS(a10 a10Var) {
        short sDW;
        long j = 0;
        if (this.e3 == null && this.eU < 0 && this.WB != null) {
            lg();
        }
        this.iW = a10Var.DW();
        boolean zJ6 = EQ().j6();
        if (zJ6) {
            EQ().Hw(String.format("Writing local header at 0x%08x - %s", Integer.valueOf(this.iW), this.cT));
        }
        x00 x00Var = this.sE;
        if (x00Var != null) {
            x00Var.close();
            this.hK = this.sE.DW();
            byte[] byteArray = ((ByteArrayOutputStream) this.sE.FH()).toByteArray();
            this.e3 = byteArray;
            this.w9 = byteArray.length;
            this.AL = this.sE.j6();
        }
        a10Var.VH(67324752);
        a10Var.gn(this.jw);
        a10Var.gn(this.fY);
        a10Var.gn(this.qp);
        a10Var.gn(this.k2);
        a10Var.gn(this.zh);
        a10Var.VH(this.AL);
        a10Var.VH(this.w9);
        a10Var.VH(this.hK);
        a10Var.gn((short) this.cT.length());
        this.Z1 = (short) 0;
        if (this.qp == 0 && (sDW = (short) ((((a10Var.DW() + 2) + this.cT.length()) + this.q7.length) % 4)) > 0) {
            this.Z1 = (short) (4 - sDW);
        }
        a10Var.gn((short) (this.q7.length + this.Z1));
        a10Var.u7(this.cT);
        a10Var.v5(this.q7);
        short s = this.Z1;
        if (s > 0) {
            a10Var.Zo(sg, 0, s);
        }
        if (zJ6) {
            EQ().Hw(String.format("Data position 0x%08x", Integer.valueOf(a10Var.DW())));
        }
        byte[] bArr = this.e3;
        if (bArr != null) {
            a10Var.v5(bArr);
            if (zJ6) {
                EQ().Hw(String.format("Wrote %d bytes", Integer.valueOf(this.e3.length)));
                return;
            }
            return;
        }
        if (zJ6) {
            EQ().Hw(String.format("Seeking to position 0x%08x", Long.valueOf(this.eU)));
        }
        this.WB.EQ(this.eU);
        int iMin = Math.min(this.w9, 8096);
        byte[] bArr2 = new byte[iMin];
        while (true) {
            int i = this.w9;
            if (j == i) {
                return;
            }
            int i2 = this.WB.DW.read(bArr2, 0, (int) Math.min(i - j, iMin));
            if (i2 <= 0) {
                throw new IllegalStateException(String.format("EOF reached while copying %s with %d bytes left to go", this.cT, Long.valueOf(this.w9 - j)));
            }
            a10Var.Zo(bArr2, 0, i2);
            if (zJ6) {
                EQ().Hw(String.format("Wrote %d bytes", Integer.valueOf(i2)));
            }
            j += i2;
        }
    }

    public v00(String str) {
        this.Z1 = (short) 0;
        this.eU = -1L;
        this.e3 = null;
        this.sE = null;
        this.cT = str;
        this.n5 = "";
        this.qp = (short) 8;
        this.q7 = new byte[0];
        rN(System.currentTimeMillis());
    }
}
