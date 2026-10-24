package abcd;

import abcd.oo;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class no {
    private int DW;
    private final oo j6 = new oo();
    private final List<b> FH = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static int J8(int i) {
        return (i + 3) & (-4);
    }

    private void Mr() {
        b bVarDW = DW(this.j6.gn, ((this.FH.size() + 1) * 12) + 4, 1);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.FH.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j6);
        }
        this.j6.DW(bVarDW, arrayList);
    }

    private void Zo() throws NoSuchAlgorithmException {
        byte[] bArrGn = gn();
        b bVar = this.FH.get(0);
        bVar.FH = 12;
        bVar.write(bArrGn);
        int iVH = VH();
        bVar.FH = 8;
        bVar.writeInt(iVH);
    }

    private void j3() {
        oo ooVar = this.j6;
        int i = this.DW;
        ooVar.U2 = i - ooVar.a8;
        ooVar.Mr = i;
        ooVar.j6(QX(ooVar.j6));
    }

    private void tp(oo.a aVar) {
        for (int i = 0; i < this.FH.size(); i++) {
            if (this.FH.get(i).j6 == aVar) {
                throw new IllegalArgumentException("TOC section already added");
            }
        }
    }

    private void u7() {
        if (this.FH.isEmpty()) {
            return;
        }
        if (this.FH.get(r0.size() - 1).BT()) {
            if (this.FH.get(r0.size() - 1).gW()) {
                return;
            }
        }
        throw new IllegalArgumentException("Can not append section when size of last section is still unknown or not placed");
    }

    public b DW(oo.a aVar, int i, int i2) {
        u7();
        tp(aVar);
        int iJ8 = J8(i);
        int i3 = this.DW;
        aVar.jw = i3;
        aVar.mb = i2;
        b bVar = new b(aVar, i3, iJ8);
        this.DW += iJ8;
        this.FH.add(bVar);
        return bVar;
    }

    public void EQ() throws NoSuchAlgorithmException {
        Mr();
        j3();
        Zo();
    }

    public b FH(oo.a aVar, byte[] bArr, int i, int i2) {
        u7();
        tp(aVar);
        int iJ8 = J8(i);
        int i3 = this.DW;
        aVar.jw = i3;
        aVar.mb = i2;
        b bVar = new b(aVar, i3, iJ8, bArr);
        this.DW += iJ8;
        this.FH.add(bVar);
        return bVar;
    }

    public b Hw(oo.a aVar) {
        u7();
        tp(aVar);
        b bVar = new b(aVar, this.DW);
        this.FH.add(bVar);
        return bVar;
    }

    public void J0(int i) {
        if (this.FH.size() < 2) {
            throw new IllegalStateException("Less than two sections present");
        }
        int size = this.FH.size() - 2;
        b bVar = this.FH.get(size);
        if (bVar.BT()) {
            throw new IllegalStateException("Second-to-last section already finished");
        }
        int iA8 = bVar.a8();
        if (iA8 == 0 && i == 0) {
            this.FH.remove(size);
            return;
        }
        bVar.j6.jw = this.DW;
        bVar.j6.mb = i;
        this.DW += iA8;
    }

    public b QX(oo.a aVar) {
        for (int i = 0; i < this.FH.size(); i++) {
            b bVar = this.FH.get(i);
            if (bVar.j6 == aVar) {
                return bVar;
            }
        }
        throw new IllegalArgumentException("TOC section not present");
    }

    public void U2(OutputStream outputStream) throws IOException {
        for (b bVar : this.FH) {
            if (bVar.Hw > 0) {
                outputStream.write(bVar.v5, 0, bVar.Hw);
            }
        }
    }

    public int VH() {
        Adler32 adler32 = new Adler32();
        b bVar = this.FH.get(0);
        adler32.update(bVar.v5, 12, bVar.Hw - 12);
        for (int i = 1; i < this.FH.size(); i++) {
            b bVar2 = this.FH.get(i);
            if (bVar2.Hw > 0) {
                adler32.update(bVar2.v5, 0, bVar2.Hw);
            }
        }
        return (int) adler32.getValue();
    }

    public int Ws() {
        return this.DW;
    }

    public oo XL() {
        return this.j6;
    }

    public int aM(int i) {
        if (this.FH.size() == 0) {
            throw new IllegalStateException("No sections present");
        }
        int size = this.FH.size() - 1;
        b bVar = this.FH.get(size);
        if (bVar.BT()) {
            throw new IllegalStateException("Last section already finished");
        }
        if (bVar.gW()) {
            throw new IllegalStateException("Last section already placed");
        }
        int iA8 = bVar.a8();
        if (iA8 == 0 && i == 0) {
            this.FH.remove(size);
            return 0;
        }
        bVar.DW = this.DW;
        bVar.j6.jw = this.DW;
        bVar.j6.mb = i;
        this.DW += iA8;
        return bVar.DW;
    }

    public byte[] gn() throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            b bVar = this.FH.get(0);
            messageDigest.update(bVar.v5, 32, bVar.Hw - 32);
            for (int i = 1; i < this.FH.size(); i++) {
                b bVar2 = this.FH.get(i);
                if (bVar2.Hw > 0) {
                    messageDigest.update(bVar2.v5, 0, bVar2.Hw);
                }
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public b v5(oo.a aVar) {
        tp(aVar);
        b bVar = new b(aVar);
        this.FH.add(bVar);
        return bVar;
    }

    public void we(int i) {
        if (this.FH.size() == 0) {
            throw new IllegalStateException("No sections present");
        }
        int size = this.FH.size() - 1;
        b bVar = this.FH.get(size);
        if (bVar.BT()) {
            throw new IllegalStateException("Last section already finished");
        }
        int iA8 = bVar.a8();
        if (iA8 == 0 && i == 0) {
            this.FH.remove(size);
            return;
        }
        bVar.j6.jw = this.DW;
        bVar.j6.mb = i;
        this.DW += iA8;
    }

    public final class b implements ss {
        private int DW;
        private int FH;
        private int Hw;
        private oo.a j6;
        private byte[] v5;

        private void U2(int i) {
            int i2 = this.Hw;
            if (i2 != Integer.MAX_VALUE) {
                if (this.v5 == null) {
                    this.v5 = new byte[i2];
                }
                if (this.FH + i <= this.Hw) {
                    return;
                }
                throw new ts("Section limit " + this.Hw + " exceeded");
            }
            if (this.v5 == null) {
                this.v5 = new byte[1024];
            }
            int i3 = this.FH + i;
            byte[] bArr = this.v5;
            if (i3 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (this.FH + i > length);
                byte[] bArr2 = new byte[length];
                byte[] bArr3 = this.v5;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                this.v5 = bArr2;
            }
        }

        public boolean BT() {
            return this.Hw != Integer.MAX_VALUE;
        }

        public void KD(mo moVar) {
            short[] sArrDW = moVar.DW();
            writeInt(sArrDW.length);
            for (short s : sArrDW) {
                nw(s);
            }
            j3();
        }

        public void Mr() {
            if ((this.FH & 3) != 0) {
                throw new IllegalStateException("Not four byte aligned!");
            }
        }

        public void P8(int i) {
            this.FH += i;
        }

        public void SI(int i) {
            et.Hw(this, i);
        }

        public int a8() {
            j3();
            this.Hw = this.FH;
            if (this.v5 == null) {
                this.v5 = new byte[0];
            }
            return this.FH;
        }

        public void cn(int i) {
            ro(i + 1);
        }

        public void ei(short[] sArr) {
            for (short s : sArr) {
                nw(s);
            }
        }

        public int er() {
            return this.FH;
        }

        public boolean gW() {
            return this.DW >= 0;
        }

        public void j3() {
            int i = this.FH;
            this.FH = no.J8(i);
            while (i < this.FH) {
                this.v5[i] = 0;
                i++;
            }
        }

        public int lg() {
            int i = this.DW;
            if (i != -1) {
                return i + this.FH;
            }
            throw new ts("Can not get offset in not yet placed section");
        }

        public void nw(short s) {
            U2(2);
            byte[] bArr = this.v5;
            int i = this.FH;
            bArr[i] = (byte) s;
            bArr[i + 1] = (byte) (s >>> 8);
            this.FH = i + 2;
        }

        public int rN() {
            int i = this.DW;
            if (i != -1) {
                return i;
            }
            throw new ts("Can not get offset in not yet placed section");
        }

        public void ro(int i) {
            et.v5(this, i);
        }

        public void sh(int i) {
            short s = (short) i;
            if (i == (65535 & s)) {
                nw(s);
                return;
            }
            throw new IllegalArgumentException("Expected an unsigned short: " + i);
        }

        public void vy(int i) {
            this.FH = i;
        }

        public void write(byte[] bArr) {
            U2(bArr.length);
            System.arraycopy(bArr, 0, this.v5, this.FH, bArr.length);
            this.FH += bArr.length;
        }

        @Override // abcd.ss
        public void writeByte(int i) {
            U2(1);
            byte[] bArr = this.v5;
            int i2 = this.FH;
            this.FH = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public void writeInt(int i) {
            U2(4);
            byte[] bArr = this.v5;
            int i2 = this.FH;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >>> 8);
            bArr[i2 + 2] = (byte) (i >>> 16);
            bArr[i2 + 3] = (byte) (i >>> 24);
            this.FH = i2 + 4;
        }

        public int yS() {
            return this.FH;
        }

        private b(no noVar, oo.a aVar, int i, int i2) {
            this.j6 = aVar;
            this.DW = i;
            this.FH = 0;
            this.Hw = i2;
        }

        private b(no noVar, oo.a aVar, int i, int i2, byte[] bArr) {
            this.j6 = aVar;
            this.v5 = bArr;
            this.DW = i;
            this.FH = i2;
            this.Hw = i2;
        }

        private b(no noVar, oo.a aVar, int i) {
            this.j6 = aVar;
            this.DW = i;
            this.FH = 0;
            this.Hw = Integer.MAX_VALUE;
        }

        private b(no noVar, oo.a aVar) {
            this.j6 = aVar;
            this.DW = -1;
            this.FH = 0;
            this.Hw = Integer.MAX_VALUE;
        }
    }
}
