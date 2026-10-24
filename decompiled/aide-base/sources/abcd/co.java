package abcd;

import abcd.bo;
import abcd.zn;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UTFDataFormatException;
import java.util.AbstractList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class co {
    private static final byte[] gn = new byte[8192];
    private byte[] j6;
    private final lj DW = new lj();
    private int FH = 0;
    private final List<String> Hw = new a();
    private final List<Integer> v5 = new b();
    private final List<String> Zo = new c();
    private final List<ko> VH = new d();

    class a extends AbstractList<String> {
        public a() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            co.gn(i, co.this.DW.DW.mb);
            co coVar = co.this;
            return coVar.J0(coVar.DW.DW.jw + (i * 4)).dx();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return co.this.DW.DW.mb;
        }
    }

    class b extends AbstractList<Integer> {
        public b() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            co.gn(i, co.this.DW.FH.mb);
            co coVar = co.this;
            return Integer.valueOf(coVar.J0(coVar.DW.FH.jw + (i * 4)).nw());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return co.this.DW.FH.mb;
        }
    }

    class c extends AbstractList<String> {
        public c() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            co.gn(i, co.this.DW.FH.mb);
            return (String) co.this.Hw.get(((Integer) co.this.v5.get(i)).intValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return co.this.DW.FH.mb;
        }
    }

    class d extends AbstractList<ko> {
        public d() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public ko get(int i) {
            co.gn(i, co.this.DW.Hw.mb);
            co coVar = co.this;
            return coVar.J0(coVar.DW.Hw.jw + (i * 12)).ro();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return co.this.DW.Hw.mb;
        }
    }

    class e extends AbstractList<fo> {
        public e() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public fo get(int i) {
            co.gn(i, co.this.DW.v5.mb);
            co coVar = co.this;
            return coVar.J0(coVar.DW.v5.jw + (i * 8)).P8();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return co.this.DW.v5.mb;
        }
    }

    class f extends AbstractList<ho> {
        public f() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public ho get(int i) {
            co.gn(i, co.this.DW.Zo.mb);
            co coVar = co.this;
            return coVar.J0(coVar.DW.Zo.jw + (i * 8)).SI();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return co.this.DW.Zo.mb;
        }
    }

    public final class g implements rs, ss {
        private int DW;
        private final int FH;
        private final String j6;

        public /* synthetic */ g(co coVar, int i, a aVar) {
            this(coVar, i);
        }

        private zn.b[] KD(int i) {
            zn.b[] bVarArr = new zn.b[i];
            int iEf = 0;
            for (int i2 = 0; i2 < i; i2++) {
                iEf += ef();
                bVarArr[i2] = new zn.b(iEf, ef(), ef());
            }
            return bVarArr;
        }

        private void QX(int i) {
            if (this.DW + i <= this.FH) {
                return;
            }
            throw new ts("Section limit " + this.FH + " exceeded by " + this.j6);
        }

        private zn.a[] ei(int i) {
            zn.a[] aVarArr = new zn.a[i];
            int iEf = 0;
            for (int i2 = 0; i2 < i; i2++) {
                iEf += ef();
                aVarArr[i2] = new zn.a(iEf, ef());
            }
            return aVarArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public zn er() {
            return new zn(ei(ef()), ei(ef()), KD(ef()), KD(ef()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bo gW() {
            bo.a[] aVarArr;
            int iVJ = vJ();
            int iVJ2 = vJ();
            int iVJ3 = vJ();
            int iVJ4 = vJ();
            int iNw = nw();
            short[] sArrSh = sh(nw());
            bo.b[] bVarArr = new bo.b[iVJ4];
            bo.a[] aVarArr2 = new bo.a[0];
            if (iVJ4 > 0) {
                if (sArrSh.length % 2 == 1) {
                    cn();
                }
                for (int i = 0; i < iVJ4; i++) {
                    bVarArr[i] = new bo.b(nw(), vJ(), vJ());
                }
                int iAM = aM();
                int iEf = ef();
                bo.a[] aVarArr3 = new bo.a[iEf];
                for (int i2 = 0; i2 < iEf; i2++) {
                    aVarArr3[i2] = rN(iAM);
                }
                aVarArr = aVarArr3;
            } else {
                aVarArr = aVarArr2;
            }
            return new bo(iVJ, iVJ2, iVJ3, iNw, sArrSh, bVarArr, aVarArr);
        }

        private bo.a rN(int i) {
            int iAM = aM() - i;
            int iCb = cb();
            int iAbs = Math.abs(iCb);
            int[] iArr = new int[iAbs];
            int[] iArr2 = new int[iAbs];
            for (int i2 = 0; i2 < iAbs; i2++) {
                iArr[i2] = ef();
                iArr2[i2] = ef();
            }
            return new bo.a(iAM, iArr, iArr2, iCb <= 0 ? ef() : -1);
        }

        public dodo BT() {
            int i = this.DW;
            new eo(this).DW();
            return new dodo(co.u7(co.this.j6, i, this.DW));
        }

        public vn Mr() {
            int iNw = nw();
            int iNw2 = nw();
            int iNw3 = nw();
            int iNw4 = nw();
            int[] iArr = iNw2 == 0 ? yn.j6 : new int[iNw2];
            int[] iArr2 = iNw2 == 0 ? yn.j6 : new int[iNw2];
            for (int i = 0; i < iNw2; i++) {
                iArr[i] = nw();
                iArr2[i] = nw();
            }
            int[] iArr3 = iNw3 == 0 ? yn.j6 : new int[iNw3];
            int[] iArr4 = iNw3 == 0 ? yn.j6 : new int[iNw3];
            for (int i2 = 0; i2 < iNw3; i2++) {
                iArr3[i2] = nw();
                iArr4[i2] = nw();
            }
            int[] iArr5 = iNw4 == 0 ? yn.j6 : new int[iNw4];
            int[] iArr6 = iNw4 == 0 ? yn.j6 : new int[iNw4];
            for (int i3 = 0; i3 < iNw4; i3++) {
                iArr5[i3] = nw();
                iArr6[i3] = nw();
            }
            return new vn(iNw, iArr, iArr2, iArr3, iArr4, iArr5, iArr6);
        }

        public fo P8() {
            return new fo(co.this, vJ(), vJ(), nw());
        }

        public ho SI() {
            return new ho(co.this, vJ(), vJ(), nw());
        }

        public int Sf() {
            return et.DW(this) - 1;
        }

        public wn U2() {
            int iNw = nw();
            int[] iArr = new int[iNw];
            for (int i = 0; i < iNw; i++) {
                iArr[i] = nw();
            }
            return new wn(iArr);
        }

        public void Ws() {
            int i = this.DW;
            this.DW = co.tp(i);
            while (i < this.DW) {
                co.this.j6[i] = 0;
                i++;
            }
        }

        public byte[] XL() {
            return co.this.j6;
        }

        public xn a8() {
            int iNw = nw();
            int[] iArr = new int[iNw];
            for (int i = 0; i < iNw; i++) {
                iArr[i] = nw();
            }
            return new xn(iArr);
        }

        public int aM() {
            return this.DW;
        }

        public int cb() {
            return et.j6(this);
        }

        public short cn() {
            int i = co.this.j6[this.DW] & 255;
            byte[] bArr = co.this.j6;
            int i2 = this.DW;
            int i3 = i | ((bArr[i2 + 1] & 255) << 8);
            this.DW = i2 + 2;
            return (short) i3;
        }

        public String dx() {
            int iNw = nw();
            int i = this.DW;
            this.DW = iNw;
            try {
                try {
                    int iEf = ef();
                    String strJ6 = it.j6(this, new char[iEf]);
                    if (strJ6.length() == iEf) {
                        return strJ6;
                    }
                    throw new ts("Declared length " + iEf + " doesn't match decoded length of " + strJ6.length());
                } catch (UTFDataFormatException e) {
                    throw new ts(e);
                }
            } finally {
                this.DW = i;
            }
        }

        public int ef() {
            return et.DW(this);
        }

        public un j3() {
            byte b = readByte();
            int iEf = ef();
            int iEf2 = ef();
            int[] iArr = new int[iEf2];
            dodo[] dodoVarArr = new dodo[iEf2];
            for (int i = 0; i < iEf2; i++) {
                iArr[i] = ef();
                dodoVarArr[i] = vy();
            }
            return new un(co.this, b, iEf, iArr, dodoVarArr);
        }

        public byte[] lg(int i) {
            byte[] bArr = co.this.j6;
            int i2 = this.DW;
            byte[] bArrU7 = co.u7(bArr, i2, i2 + i);
            this.DW += i;
            return bArrU7;
        }

        public int nw() {
            int i = (co.this.j6[this.DW] & 255) | ((co.this.j6[this.DW + 1] & 255) << 8) | ((co.this.j6[this.DW + 2] & 255) << 16);
            byte[] bArr = co.this.j6;
            int i2 = this.DW;
            int i3 = i | ((bArr[i2 + 3] & 255) << 24);
            this.DW = i2 + 4;
            return i3;
        }

        @Override // abcd.rs
        public byte readByte() {
            byte[] bArr = co.this.j6;
            int i = this.DW;
            this.DW = i + 1;
            return (byte) (bArr[i] & 255);
        }

        public ko ro() {
            return new ko(co.this, nw(), nw(), nw());
        }

        public mo sG() {
            int iNw = nw();
            short[] sArr = new short[iNw];
            for (int i = 0; i < iNw; i++) {
                sArr[i] = cn();
            }
            Ws();
            return new mo(co.this, sArr);
        }

        public short[] sh(int i) {
            short[] sArr = new short[i];
            for (int i2 = 0; i2 < i; i2++) {
                sArr[i2] = cn();
            }
            return sArr;
        }

        public int vJ() {
            return cn() & 65535;
        }

        public dodo vy() {
            int i = this.DW;
            new eo(this).Hw();
            return new dodo(co.u7(co.this.j6, i, this.DW));
        }

        @Override // abcd.ss
        public void writeByte(int i) {
            QX(1);
            byte[] bArr = co.this.j6;
            int i2 = this.DW;
            this.DW = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public ao yS() {
            return new ao(co.this, aM(), nw(), nw(), nw(), nw(), nw(), nw(), nw(), nw());
        }

        private g(String str, int i, int i2) {
            this.j6 = str;
            this.DW = i;
            this.FH = i2;
        }

        private g(co coVar, int i) {
            this("section", i, coVar.j6.length);
        }
    }

    public co(InputStream inputStream, int i) throws IOException {
        new e();
        new f();
        we(inputStream, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gn(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index:" + i + ", length=" + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int tp(int i) {
        return (i + 3) & (-4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] u7(byte[] bArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, iMin);
        return bArr2;
    }

    private void we(InputStream inputStream, int i) throws IOException {
        if (i == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i2 = inputStream.read(gn);
                if (i2 == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(gn, 0, i2);
                }
            }
            this.j6 = byteArrayOutputStream.toByteArray();
        } else {
            this.j6 = new byte[i];
            new DataInputStream(inputStream).readFully(this.j6);
        }
        this.FH = this.j6.length;
        this.DW.FH(this);
    }

    public lj EQ() {
        return this.DW;
    }

    public g J0(int i) {
        if (i >= 0 && i <= this.FH) {
            return new g(this, i, null);
        }
        throw new IllegalArgumentException("position=" + i + " length=" + this.FH);
    }

    public List<ko> J8() {
        return this.VH;
    }

    public bo QX(zn.b bVar) {
        int iDW = bVar.DW();
        if (iDW != 0) {
            return J0(iDW).gW();
        }
        throw new IllegalArgumentException("offset == 0");
    }

    public zn Ws(ao aoVar) {
        int iFH = aoVar.FH();
        if (iFH != 0) {
            return J0(iFH).er();
        }
        throw new IllegalArgumentException("offset == 0");
    }

    public mo XL(int i) {
        return i == 0 ? mo.jw : J0(i).sG();
    }

    public List<String> aM() {
        return this.Hw;
    }

    public List<String> j3() {
        return this.Zo;
    }

    public co(File file) throws IOException {
        new e();
        new f();
        if (vs.j6(file.getName())) {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry("classes.dex");
            if (entry != null) {
                we(zipFile.getInputStream(entry), (int) entry.getSize());
                zipFile.close();
                return;
            } else {
                throw new ts("Expected classes.dex in " + file);
            }
        }
        if (file.getName().endsWith(".dex")) {
            we(new FileInputStream(file), (int) file.length());
            return;
        }
        throw new ts("unknown output extension: " + file);
    }
}
