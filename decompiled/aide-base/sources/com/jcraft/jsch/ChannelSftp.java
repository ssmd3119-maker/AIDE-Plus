package com.jcraft.jsch;

import com.jcraft.jsch.Channel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class ChannelSftp extends ChannelSession {
    private Hashtable An;
    private Packet BR;
    private String Bx;
    private Buffer IS;
    private String Jm;
    private RequestQueue MP;
    private Buffer Nh;
    private InputStream Pa;
    private boolean ce;
    private Packet gG;
    private String oa;
    private boolean qP;
    private int ys = 1;
    private int AE = 3;
    private int Za = 3;

    class Header {
        int DW;
        int FH;
        int j6;

        Header(ChannelSftp channelSftp) {
        }
    }

    public class LsEntry implements Comparable {
        private String WB;
        private SftpATTRS jw;
        private String mb;

        LsEntry(ChannelSftp channelSftp, String str, String str2, SftpATTRS sftpATTRS) {
            v5(str);
            Zo(str2);
            FH(sftpATTRS);
        }

        public String DW() {
            return this.WB;
        }

        void FH(SftpATTRS sftpATTRS) {
            this.jw = sftpATTRS;
        }

        void Zo(String str) {
            this.mb = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof LsEntry) {
                return this.WB.compareTo(((LsEntry) obj).DW());
            }
            throw new ClassCastException("a decendent of LsEntry must be given.");
        }

        public SftpATTRS j6() {
            return this.jw;
        }

        public String toString() {
            return this.mb;
        }

        void v5(String str) {
            this.WB = str;
        }
    }

    public interface LsEntrySelector {
        int j6(LsEntry lsEntry);
    }

    private class RequestQueue {
        int DW;
        int FH;
        Request[] j6;

        class OutOfOrderException extends Exception {
            long WB;

            OutOfOrderException(RequestQueue requestQueue, long j) {
                this.WB = j;
            }
        }

        class Request {
            long DW;
            long FH;
            int j6;

            Request(RequestQueue requestQueue) {
            }
        }

        RequestQueue(int i) {
            this.j6 = null;
            this.j6 = new Request[i];
            int i2 = 0;
            while (true) {
                Request[] requestArr = this.j6;
                if (i2 >= requestArr.length) {
                    Zo();
                    return;
                } else {
                    requestArr[i2] = new Request(this);
                    i2++;
                }
            }
        }

        void DW(Header header, Buffer buffer) throws IOException {
            int i = this.FH;
            for (int i2 = 0; i2 < i; i2++) {
                ChannelSftp.I(ChannelSftp.this, buffer, header);
                int i3 = header.j6;
                int i4 = 0;
                while (true) {
                    Request[] requestArr = this.j6;
                    if (i4 < requestArr.length) {
                        if (requestArr[i4].j6 == header.FH) {
                            requestArr[i4].j6 = 0;
                            break;
                        }
                        i4++;
                    }
                }
                ChannelSftp.this.Nh(i3);
            }
            Zo();
        }

        int FH() {
            return this.FH;
        }

        Request Hw(int i) throws OutOfOrderException, SftpException {
            boolean z = true;
            this.FH--;
            int i2 = this.DW;
            int i3 = i2 + 1;
            this.DW = i3;
            if (i3 == this.j6.length) {
                this.DW = 0;
            }
            Request[] requestArr = this.j6;
            if (requestArr[i2].j6 == i) {
                requestArr[i2].j6 = 0;
                return requestArr[i2];
            }
            long jV5 = v5();
            int i4 = 0;
            while (true) {
                Request[] requestArr2 = this.j6;
                if (i4 >= requestArr2.length) {
                    z = false;
                    break;
                }
                if (requestArr2[i4].j6 == i) {
                    requestArr2[i4].j6 = 0;
                    break;
                }
                i4++;
            }
            if (z) {
                throw new OutOfOrderException(this, jV5);
            }
            throw new SftpException(4, "RequestQueue: unknown request id " + i);
        }

        int VH() {
            return this.j6.length;
        }

        void Zo() {
            this.FH = 0;
            this.DW = 0;
        }

        void j6(int i, long j, int i2) {
            if (this.FH == 0) {
                this.DW = 0;
            }
            int length = this.DW + this.FH;
            Request[] requestArr = this.j6;
            if (length >= requestArr.length) {
                length -= requestArr.length;
            }
            Request[] requestArr2 = this.j6;
            requestArr2[length].j6 = i;
            requestArr2[length].DW = j;
            requestArr2[length].FH = i2;
            this.FH++;
        }

        long v5() {
            long j = Long.MAX_VALUE;
            int i = 0;
            while (true) {
                Request[] requestArr = this.j6;
                if (i >= requestArr.length) {
                    return j;
                }
                if (requestArr[i].j6 != 0 && j > requestArr[i].DW) {
                    j = requestArr[i].DW;
                }
                i++;
            }
        }
    }

    static {
        String str = File.separator;
    }

    public ChannelSftp() {
        String.valueOf(3);
        this.An = null;
        this.Pa = null;
        this.ce = false;
        this.oa = "UTF-8";
        this.qP = true;
        this.MP = new RequestQueue(16);
        vy(2097152);
        BT(2097152);
        gW(32768);
    }

    private void BR(Buffer buffer, int i) throws SftpException {
        if (this.Za >= 3 && buffer.tp() >= 4) {
            throw new SftpException(i, Util.v5(buffer.QX(), "UTF-8"));
        }
        throw new SftpException(i, "Failure");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CU(Buffer buffer, int i) throws IOException {
        buffer.gW();
        et(buffer.DW, 0, i);
        buffer.ei(i);
    }

    private void Cz(byte b, byte[] bArr, String str) throws InterruptedException, IOException, JSchException {
        this.gG.FH();
        int length = bArr.length + 9;
        if (str == null) {
            w9(b, length);
            Buffer buffer = this.IS;
            int i = this.ys;
            this.ys = i + 1;
            buffer.a8(i);
        } else {
            length += str.length() + 4;
            w9((byte) -56, length);
            Buffer buffer2 = this.IS;
            int i2 = this.ys;
            this.ys = i2 + 1;
            buffer2.a8(i2);
            this.IS.er(Util.aM(str));
        }
        this.IS.er(bArr);
        Mr().XX(this.gG, this, length + 4);
    }

    private boolean Ev(byte[] bArr) {
        int i;
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (bArr[i2] == 42 || bArr[i2] == 63) {
                return true;
            }
            if (bArr[i2] == 92 && (i = i2 + 1) < length) {
                i2 = i;
            }
            i2++;
        }
        return false;
    }

    private Vector FN(String str) throws InterruptedException, SftpException, IOException, JSchException {
        byte[] bArrJ3;
        String strV5;
        Vector vector = new Vector();
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            vector.addElement(Util.a8(str));
            return vector;
        }
        int i = 0;
        String strSubstring = str.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        String strA8 = Util.a8(strSubstring);
        byte[][] bArr = new byte[1][];
        if (!ko(strSubstring2, bArr)) {
            if (!strA8.equals("/")) {
                strA8 = String.valueOf(strA8) + "/";
            }
            vector.addElement(String.valueOf(strA8) + Util.a8(strSubstring2));
            return vector;
        }
        byte[] bArr2 = bArr[0];
        sg(Util.j3(strA8, this.oa));
        Header header = new Header(this);
        jO(this.IS, header);
        int i2 = header.j6;
        int i3 = header.DW;
        CU(this.IS, i2);
        int i4 = 4;
        int i5 = 101;
        if (i3 != 101 && i3 != 102) {
            throw new SftpException(4, "");
        }
        if (i3 == 101) {
            BR(this.IS, this.IS.u7());
            throw null;
        }
        byte[] bArrQX = this.IS.QX();
        String str2 = null;
        while (true) {
            aX(bArrQX);
            jO(this.IS, header);
            int i6 = header.j6;
            int i7 = header.DW;
            if (i7 != i5 && i7 != 104) {
                throw new SftpException(i4, "");
            }
            if (i7 == i5) {
                CU(this.IS, i6);
                if (vJ(bArrQX, header)) {
                    return vector;
                }
                return null;
            }
            this.IS.BT();
            et(this.IS.DW, i, i4);
            int i8 = i6 - 4;
            this.IS.gW();
            for (int iU7 = this.IS.u7(); iU7 > 0; iU7--) {
                if (i8 > 0) {
                    this.IS.P8();
                    Buffer buffer = this.IS;
                    byte[] bArr3 = buffer.DW;
                    int length = bArr3.length;
                    int i9 = buffer.FH;
                    int length2 = length > i9 + i8 ? i8 : bArr3.length - i9;
                    InputStream inputStream = this.Pa;
                    Buffer buffer2 = this.IS;
                    int i10 = inputStream.read(buffer2.DW, buffer2.FH, length2);
                    if (i10 <= 0) {
                        break;
                    }
                    this.IS.FH += i10;
                    i8 -= i10;
                }
                byte[] bArrQX2 = this.IS.QX();
                if (this.Za <= 3) {
                    this.IS.QX();
                }
                SftpATTRS.DW(this.IS);
                if (this.qP) {
                    bArrJ3 = bArrQX2;
                    strV5 = null;
                } else {
                    strV5 = Util.v5(bArrQX2, this.oa);
                    bArrJ3 = Util.j3(strV5, "UTF-8");
                }
                if (Util.J8(bArr2, bArrJ3)) {
                    if (strV5 == null) {
                        strV5 = Util.v5(bArrQX2, this.oa);
                    }
                    if (str2 == null) {
                        str2 = strA8.endsWith("/") ? strA8 : String.valueOf(strA8) + "/";
                    }
                    vector.addElement(String.valueOf(str2) + strV5);
                }
            }
            i = 0;
            i4 = 4;
            i5 = 101;
        }
    }

    private void Gj(byte b, byte[] bArr) throws InterruptedException, IOException, JSchException {
        Cz(b, bArr, null);
    }

    static /* synthetic */ Header I(ChannelSftp channelSftp, Buffer buffer, Header header) throws IOException {
        channelSftp.jO(buffer, header);
        return header;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int IS(byte[] bArr, long j, byte[] bArr2, int i, int i2) throws InterruptedException, IOException, JSchException {
        this.BR.FH();
        Buffer buffer = this.Nh;
        byte[] bArr3 = buffer.DW;
        int length = bArr3.length;
        int i3 = buffer.FH;
        if (length < i3 + 13 + 21 + bArr.length + i2 + 84) {
            i2 = bArr3.length - ((((i3 + 13) + 21) + bArr.length) + 84);
        }
        hK(this.Nh, (byte) 6, bArr.length + 21 + i2);
        Buffer buffer2 = this.Nh;
        int i4 = this.ys;
        this.ys = i4 + 1;
        buffer2.a8(i4);
        this.Nh.er(bArr);
        this.Nh.lg(j);
        Buffer buffer3 = this.Nh;
        if (buffer3.DW != bArr2) {
            buffer3.yS(bArr2, i, i2);
        } else {
            buffer3.a8(i2);
            this.Nh.ei(i2);
        }
        Mr().XX(this.BR, this, bArr.length + 21 + i2 + 4);
        return i2;
    }

    private void Jl() throws InterruptedException, IOException, JSchException {
        this.gG.FH();
        w9((byte) 1, 5);
        this.IS.a8(3);
        Mr().XX(this.gG, this, 9);
    }

    private SftpATTRS Mz(byte[] bArr) throws SftpException {
        try {
            ys(bArr);
            Header header = new Header(this);
            jO(this.IS, header);
            int i = header.j6;
            int i2 = header.DW;
            CU(this.IS, i);
            if (i2 == 105) {
                return SftpATTRS.DW(this.IS);
            }
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            BR(this.IS, this.IS.u7());
            throw null;
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, "", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nh(long j) throws IOException {
        while (j > 0) {
            long jSkip = this.Pa.skip(j);
            if (jSkip <= 0) {
                return;
            } else {
                j -= jSkip;
            }
        }
    }

    private void QO(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 13, bArr);
    }

    private byte[] Sf(String str) throws InterruptedException, SftpException, IOException, JSchException {
        e9(Util.j3(str, this.oa));
        Header header = new Header(this);
        jO(this.IS, header);
        int i = header.j6;
        int i2 = header.DW;
        CU(this.IS, i);
        if (i2 != 101 && i2 != 104) {
            throw new SftpException(4, "");
        }
        byte[] bArrQX = null;
        if (i2 == 101) {
            BR(this.IS, this.IS.u7());
            throw null;
        }
        int iU7 = this.IS.u7();
        while (true) {
            int i3 = iU7 - 1;
            if (iU7 <= 0) {
                return bArrQX;
            }
            bArrQX = this.IS.QX();
            if (this.Za <= 3) {
                this.IS.QX();
            }
            SftpATTRS.DW(this.IS);
            iU7 = i3;
        }
    }

    private String WB(String str) throws InterruptedException, SftpException, IOException, JSchException {
        Vector vectorFN = FN(str);
        if (vectorFN.size() == 1) {
            return (String) vectorFN.elementAt(0);
        }
        throw new SftpException(4, String.valueOf(str) + " is not unique: " + vectorFN.toString());
    }

    private void a5(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 15, bArr);
    }

    private void aX(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 12, bArr);
    }

    private void e3(byte[] bArr, int i) throws InterruptedException, IOException, JSchException {
        this.gG.FH();
        w9((byte) 3, bArr.length + 17);
        Buffer buffer = this.IS;
        int i2 = this.ys;
        this.ys = i2 + 1;
        buffer.a8(i2);
        this.IS.er(bArr);
        this.IS.a8(i);
        this.IS.a8(0);
        Mr().XX(this.gG, this, bArr.length + 17 + 4);
    }

    private void e9(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 16, bArr);
    }

    private void eU(byte[] bArr, SftpATTRS sftpATTRS) throws InterruptedException, IOException, JSchException {
        this.gG.FH();
        w9((byte) 14, bArr.length + 9 + (sftpATTRS != null ? sftpATTRS.J0() : 4));
        Buffer buffer = this.IS;
        int i = this.ys;
        this.ys = i + 1;
        buffer.a8(i);
        this.IS.er(bArr);
        if (sftpATTRS != null) {
            sftpATTRS.j6(this.IS);
        } else {
            this.IS.a8(0);
        }
        Mr().XX(this.gG, this, bArr.length + 9 + (sftpATTRS != null ? sftpATTRS.J0() : 4) + 4);
    }

    private SftpATTRS ef(String str) throws SftpException {
        try {
            iW(Util.j3(str, this.oa));
            Header header = new Header(this);
            jO(this.IS, header);
            int i = header.j6;
            int i2 = header.DW;
            CU(this.IS, i);
            if (i2 == 105) {
                return SftpATTRS.DW(this.IS);
            }
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            BR(this.IS, this.IS.u7());
            throw null;
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, "", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int et(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i;
        while (i2 > 0) {
            int i4 = this.Pa.read(bArr, i3, i2);
            if (i4 <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += i4;
            i2 -= i4;
        }
        return i3 - i;
    }

    private void fN(byte[] bArr) throws InterruptedException, IOException, JSchException {
        e3(bArr, 26);
    }

    private SftpATTRS g3(String str) {
        return Mz(Util.j3(str, this.oa));
    }

    private void gG(String str) {
        this.Jm = str;
    }

    private void hK(Buffer buffer, byte b, int i) {
        buffer.j3((byte) 94);
        buffer.a8(this.mb);
        buffer.a8(i + 4);
        buffer.a8(i);
        buffer.j3(b);
    }

    private String hz() {
        if (this.Jm == null) {
            this.Jm = aq();
        }
        return this.Jm;
    }

    private void iW(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 7, bArr);
    }

    private Header jO(Buffer buffer, Header header) throws IOException {
        buffer.BT();
        et(buffer.DW, 0, 9);
        header.j6 = buffer.u7() - 5;
        header.DW = buffer.FH() & 255;
        header.FH = buffer.u7();
        return header;
    }

    private void kf(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 4, bArr);
    }

    private boolean ko(String str, byte[][] bArr) {
        byte[] bArrJ3 = Util.j3(str, "UTF-8");
        if (bArr != null) {
            bArr[0] = bArrJ3;
        }
        return Ev(bArrJ3);
    }

    private boolean oY(String str) {
        return ko(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oy(byte[] bArr, long j, int i, RequestQueue requestQueue) throws InterruptedException, IOException, JSchException {
        this.gG.FH();
        w9((byte) 5, bArr.length + 21);
        Buffer buffer = this.IS;
        int i2 = this.ys;
        this.ys = i2 + 1;
        buffer.a8(i2);
        this.IS.er(bArr);
        this.IS.lg(j);
        this.IS.a8(i);
        Mr().XX(this.gG, this, bArr.length + 21 + 4);
        if (requestQueue != null) {
            requestQueue.j6(this.ys - 1, j, i);
        }
    }

    private void pN(byte b, byte[] bArr, byte[] bArr2, String str) throws InterruptedException, IOException, JSchException {
        this.gG.FH();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            w9(b, length);
            Buffer buffer = this.IS;
            int i = this.ys;
            this.ys = i + 1;
            buffer.a8(i);
        } else {
            length += str.length() + 4;
            w9((byte) -56, length);
            Buffer buffer2 = this.IS;
            int i2 = this.ys;
            this.ys = i2 + 1;
            buffer2.a8(i2);
            this.IS.er(Util.aM(str));
        }
        this.IS.er(bArr);
        this.IS.er(bArr2);
        Mr().XX(this.gG, this, length + 4);
    }

    private void pO(byte[] bArr) throws InterruptedException, IOException, JSchException {
        e3(bArr, 1);
    }

    private String q7(String str) {
        if (str.charAt(0) == '/') {
            return str;
        }
        String strHz = hz();
        if (strHz.endsWith("/")) {
            return String.valueOf(strHz) + str;
        }
        return String.valueOf(strHz) + "/" + str;
    }

    private void sE(byte[] bArr) throws InterruptedException, IOException, JSchException {
        e3(bArr, 10);
    }

    private void sM(byte[] bArr, byte[] bArr2) throws InterruptedException, IOException, JSchException {
        pN((byte) 18, bArr, bArr2, this.ce ? "posix-rename@openssh.com" : null);
    }

    private void sg(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 11, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vJ(byte[] bArr, Header header) throws InterruptedException, IOException, JSchException {
        kf(bArr);
        return wc(null, header);
    }

    private void w9(byte b, int i) {
        hK(this.IS, b, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean wc(int[] iArr, Header header) throws SftpException, IOException {
        jO(this.IS, header);
        int i = header.j6;
        int i2 = header.DW;
        if (iArr != null) {
            iArr[0] = header.FH;
        }
        CU(this.IS, i);
        if (i2 != 101) {
            throw new SftpException(4, "");
        }
        int iU7 = this.IS.u7();
        if (iU7 == 0) {
            return true;
        }
        BR(this.IS, iU7);
        throw null;
    }

    private boolean ye(String str) {
        try {
            ys(Util.j3(str, this.oa));
            Header header = new Header(this);
            jO(this.IS, header);
            int i = header.j6;
            int i2 = header.DW;
            CU(this.IS, i);
            if (i2 != 105) {
                return false;
            }
            return SftpATTRS.DW(this.IS).tp();
        } catch (Exception unused) {
            return false;
        }
    }

    private void ys(byte[] bArr) throws InterruptedException, IOException, JSchException {
        Gj((byte) 17, bArr);
    }

    public OutputStream AL(String str, final SftpProgressMonitor sftpProgressMonitor, int i, long j) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            String strWB = WB(q7(str));
            if (ye(strWB)) {
                throw new SftpException(4, String.valueOf(strWB) + " is a directory");
            }
            byte[] bArrJ3 = Util.j3(strWB, this.oa);
            long jGn = 0;
            if (i == 1 || i == 2) {
                try {
                    jGn = Mz(bArrJ3).gn();
                } catch (Exception unused) {
                }
            }
            if (i == 0) {
                fN(bArrJ3);
            } else {
                sE(bArrJ3);
            }
            Header header = new Header(this);
            jO(this.IS, header);
            int i2 = header.j6;
            int i3 = header.DW;
            CU(this.IS, i2);
            if (i3 != 101 && i3 != 102) {
                throw new SftpException(4, "");
            }
            if (i3 == 101) {
                BR(this.IS, this.IS.u7());
                throw null;
            }
            final byte[] bArrQX = this.IS.QX();
            if (i == 1 || i == 2) {
                j += jGn;
            }
            final long[] jArr = {j};
            return new OutputStream() { // from class: com.jcraft.jsch.ChannelSftp.1
                private Header AL;
                private boolean WB = true;
                private boolean mb = false;
                private int[] jw = new int[1];
                private int fY = 0;
                private int qp = 0;
                private int k2 = 0;
                private int zh = 0;
                byte[] w9 = new byte[1];

                {
                    this.AL = new Header(ChannelSftp.this);
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    if (this.mb) {
                        return;
                    }
                    flush();
                    SftpProgressMonitor sftpProgressMonitor2 = sftpProgressMonitor;
                    if (sftpProgressMonitor2 != null) {
                        sftpProgressMonitor2.j6();
                    }
                    try {
                        ChannelSftp.this.vJ(bArrQX, this.AL);
                        this.mb = true;
                    } catch (IOException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new IOException(e2.toString());
                    }
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    if (this.mb) {
                        throw new IOException("stream already closed");
                    }
                    if (this.WB) {
                        return;
                    }
                    while (this.zh > this.k2 && ChannelSftp.this.wc(null, this.AL)) {
                        try {
                            this.k2++;
                        } catch (SftpException e) {
                            throw new IOException(e.toString());
                        }
                    }
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr) throws SftpException, IOException {
                    write(bArr, 0, bArr.length);
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr, int i4, int i5) throws SftpException, IOException {
                    if (this.WB) {
                        this.fY = ChannelSftp.this.ys;
                        this.qp = ChannelSftp.this.ys;
                        this.WB = false;
                    }
                    if (this.mb) {
                        throw new IOException("stream already closed");
                    }
                    int i6 = i5;
                    while (i6 > 0) {
                        try {
                            int iIS = ChannelSftp.this.IS(bArrQX, jArr[0], bArr, i4, i6);
                            this.zh++;
                            long[] jArr2 = jArr;
                            jArr2[0] = jArr2[0] + iIS;
                            i4 += iIS;
                            i6 -= iIS;
                            if (ChannelSftp.this.ys - 1 == this.fY || ChannelSftp.this.Pa.available() >= 1024) {
                                while (ChannelSftp.this.Pa.available() > 0 && ChannelSftp.this.wc(this.jw, this.AL)) {
                                    int i7 = this.jw[0];
                                    this.qp = i7;
                                    if (this.fY > i7 || i7 > ChannelSftp.this.ys - 1) {
                                        throw new SftpException(4, "");
                                    }
                                    this.k2++;
                                }
                            }
                        } catch (IOException e) {
                            throw e;
                        } catch (Exception e2) {
                            throw new IOException(e2.toString());
                        }
                    }
                    if (sftpProgressMonitor != null && !sftpProgressMonitor.DW(i5)) {
                        close();
                        throw new IOException("canceled");
                    }
                }

                @Override // java.io.OutputStream
                public void write(int i4) throws SftpException, IOException {
                    byte[] bArr = this.w9;
                    bArr[0] = (byte) i4;
                    write(bArr, 0, 1);
                }
            };
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, "", e);
        }
    }

    public InputStream Eq(String str, SftpProgressMonitor sftpProgressMonitor, long j) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            String strWB = WB(q7(str));
            byte[] bArrJ3 = Util.j3(strWB, this.oa);
            SftpATTRS sftpATTRSMz = Mz(bArrJ3);
            if (sftpProgressMonitor != null) {
                sftpProgressMonitor.FH(1, strWB, "??", sftpATTRSMz.gn());
            }
            pO(bArrJ3);
            Header header = new Header(this);
            jO(this.IS, header);
            int i = header.j6;
            int i2 = header.DW;
            CU(this.IS, i);
            if (i2 != 101 && i2 != 102) {
                throw new SftpException(4, "");
            }
            if (i2 != 101) {
                byte[] bArrQX = this.IS.QX();
                this.MP.Zo();
                return new InputStream(j, sftpProgressMonitor, bArrQX) { // from class: com.jcraft.jsch.ChannelSftp.2
                    long AL;
                    long WB;
                    private final /* synthetic */ byte[] cT;
                    private final /* synthetic */ SftpProgressMonitor hK;
                    Header k2;
                    boolean mb = false;
                    int jw = 0;
                    byte[] fY = new byte[1];
                    byte[] qp = new byte[1024];
                    int zh = 1;

                    {
                        this.hK = sftpProgressMonitor;
                        this.cT = bArrQX;
                        this.WB = j;
                        this.k2 = new Header(ChannelSftp.this);
                        this.AL = this.WB;
                    }

                    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        if (this.mb) {
                            return;
                        }
                        this.mb = true;
                        SftpProgressMonitor sftpProgressMonitor2 = this.hK;
                        if (sftpProgressMonitor2 != null) {
                            sftpProgressMonitor2.j6();
                        }
                        ChannelSftp.this.MP.DW(this.k2, ChannelSftp.this.IS);
                        try {
                            ChannelSftp.this.vJ(this.cT, this.k2);
                        } catch (Exception unused) {
                            throw new IOException("error");
                        }
                    }

                    @Override // java.io.InputStream
                    public int read() {
                        if (this.mb || read(this.fY, 0, 1) == -1) {
                            return -1;
                        }
                        return this.fY[0] & 255;
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] bArr) {
                        if (this.mb) {
                            return -1;
                        }
                        return read(bArr, 0, bArr.length);
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] bArr, int i3, int i4) throws IOException {
                        int length = i4;
                        if (this.mb) {
                            return -1;
                        }
                        if (bArr == null) {
                            throw null;
                        }
                        if (i3 < 0 || length < 0 || i3 + length > bArr.length) {
                            throw new IndexOutOfBoundsException();
                        }
                        int i5 = 0;
                        if (length == 0) {
                            return 0;
                        }
                        int i6 = this.jw;
                        if (i6 <= 0) {
                            if (ChannelSftp.this.IS.DW.length - 13 < length) {
                                length = ChannelSftp.this.IS.DW.length - 13;
                            }
                            if (ChannelSftp.this.Za == 0 && length > 1024) {
                                length = 1024;
                            }
                            if (ChannelSftp.this.MP.FH() == 0) {
                                int length2 = ChannelSftp.this.Za != 0 ? ChannelSftp.this.IS.DW.length - 13 : 1024;
                                while (ChannelSftp.this.MP.FH() < this.zh) {
                                    try {
                                        ChannelSftp.this.oy(this.cT, this.AL, length2, ChannelSftp.this.MP);
                                        this.AL += length2;
                                    } catch (Exception unused) {
                                        throw new IOException("error");
                                    }
                                }
                            }
                            ChannelSftp channelSftp = ChannelSftp.this;
                            Buffer buffer = channelSftp.IS;
                            Header header2 = this.k2;
                            ChannelSftp.I(channelSftp, buffer, header2);
                            this.k2 = header2;
                            this.jw = header2.j6;
                            int i7 = header2.DW;
                            int i8 = header2.FH;
                            try {
                                RequestQueue.Request requestHw = ChannelSftp.this.MP.Hw(this.k2.FH);
                                if (i7 != 101 && i7 != 103) {
                                    throw new IOException("error");
                                }
                                if (i7 != 101) {
                                    ChannelSftp.this.IS.BT();
                                    ChannelSftp channelSftp2 = ChannelSftp.this;
                                    channelSftp2.et(channelSftp2.IS.DW, 0, 4);
                                    int iU7 = ChannelSftp.this.IS.u7();
                                    int i9 = this.jw - 4;
                                    this.jw = i9;
                                    int i10 = i9 - iU7;
                                    long j2 = iU7;
                                    this.WB += j2;
                                    if (iU7 <= 0) {
                                        return 0;
                                    }
                                    if (iU7 <= length) {
                                        length = iU7;
                                    }
                                    int i11 = ChannelSftp.this.Pa.read(bArr, i3, length);
                                    if (i11 < 0) {
                                        return -1;
                                    }
                                    int i12 = iU7 - i11;
                                    this.jw = i12;
                                    if (i12 > 0) {
                                        if (this.qp.length < i12) {
                                            this.qp = new byte[i12];
                                        }
                                        while (i12 > 0) {
                                            int i13 = ChannelSftp.this.Pa.read(this.qp, i5, i12);
                                            if (i13 <= 0) {
                                                break;
                                            }
                                            i5 += i13;
                                            i12 -= i13;
                                        }
                                    }
                                    if (i10 > 0) {
                                        ChannelSftp.this.Pa.skip(i10);
                                    }
                                    if (j2 < requestHw.FH) {
                                        ChannelSftp.this.MP.DW(this.k2, ChannelSftp.this.IS);
                                        try {
                                            ChannelSftp.this.oy(this.cT, requestHw.DW + j2, (int) (requestHw.FH - j2), ChannelSftp.this.MP);
                                            this.AL = requestHw.DW + requestHw.FH;
                                        } catch (Exception unused2) {
                                            throw new IOException("error");
                                        }
                                    }
                                    if (this.zh < ChannelSftp.this.MP.VH()) {
                                        this.zh++;
                                    }
                                    SftpProgressMonitor sftpProgressMonitor2 = this.hK;
                                    if (sftpProgressMonitor2 == null || sftpProgressMonitor2.DW(i11)) {
                                        return i11;
                                    }
                                    close();
                                    return -1;
                                }
                                ChannelSftp channelSftp3 = ChannelSftp.this;
                                channelSftp3.CU(channelSftp3.IS, this.jw);
                                int iU72 = ChannelSftp.this.IS.u7();
                                this.jw = 0;
                                if (iU72 == 1) {
                                    close();
                                    return -1;
                                }
                                throw new IOException("error");
                            } catch (RequestQueue.OutOfOrderException e) {
                                this.AL = e.WB;
                                skip(this.k2.j6);
                                ChannelSftp.this.MP.DW(this.k2, ChannelSftp.this.IS);
                                return 0;
                            } catch (SftpException e2) {
                                throw new IOException("error: " + e2.toString());
                            }
                        }
                        if (i6 <= length) {
                            length = i6;
                        }
                        System.arraycopy(this.qp, 0, bArr, i3, length);
                        int i14 = this.jw;
                        if (length != i14) {
                            byte[] bArr2 = this.qp;
                            System.arraycopy(bArr2, length, bArr2, 0, i14 - length);
                        }
                        SftpProgressMonitor sftpProgressMonitor3 = this.hK;
                        if (sftpProgressMonitor3 != null && !sftpProgressMonitor3.DW(length)) {
                            close();
                            return -1;
                        }
                        this.jw -= length;
                        return length;
                    }
                };
            }
            BR(this.IS, this.IS.u7());
            throw null;
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, "", e);
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void KD() throws SftpException, IOException, JSchException {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.w9.we(pipedOutputStream);
            this.w9.tp(new Channel.MyPipedInputStream(this, pipedOutputStream, this.AL));
            InputStream inputStream = this.w9.j6;
            this.Pa = inputStream;
            if (inputStream == null) {
                throw new JSchException("channel is down");
            }
            new RequestSftp().j6(Mr(), this);
            this.IS = new Buffer(this.k2);
            this.gG = new Packet(this.IS);
            this.Nh = new Buffer(this.AL);
            this.BR = new Packet(this.Nh);
            Jl();
            Header header = new Header(this);
            jO(this.IS, header);
            int length = header.j6;
            if (length > 262144) {
                throw new SftpException(4, "Received message is too long: " + length);
            }
            this.Za = header.FH;
            this.An = new Hashtable();
            if (length > 0) {
                CU(this.IS, length);
                while (length > 0) {
                    byte[] bArrQX = this.IS.QX();
                    int length2 = length - (bArrQX.length + 4);
                    byte[] bArrQX2 = this.IS.QX();
                    length = length2 - (bArrQX2.length + 4);
                    this.An.put(Util.DW(bArrQX), Util.DW(bArrQX2));
                }
            }
            if (this.An.get("posix-rename@openssh.com") != null && this.An.get("posix-rename@openssh.com").equals("1")) {
                this.ce = true;
            }
            if (this.An.get("statvfs@openssh.com") != null) {
                this.An.get("statvfs@openssh.com").equals("2");
            }
            if (this.An.get("hardlink@openssh.com") != null) {
                this.An.get("hardlink@openssh.com").equals("1");
            }
            new File(".").getCanonicalPath();
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException(e.toString(), e);
            }
            throw ((JSchException) e);
        }
    }

    public void Q6(String str) {
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            Vector vectorFN = FN(q7(str));
            int size = vectorFN.size();
            Header header = new Header(this);
            for (int i = 0; i < size; i++) {
                a5(Util.j3((String) vectorFN.elementAt(i), this.oa));
                jO(this.IS, header);
                int i2 = header.j6;
                int i3 = header.DW;
                CU(this.IS, i2);
                if (i3 != 101) {
                    throw new SftpException(4, "");
                }
                int iU7 = this.IS.u7();
                if (iU7 != 0) {
                    BR(this.IS, iU7);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, "", e);
            }
            throw ((SftpException) e);
        }
    }

    @Override // com.jcraft.jsch.Channel
    void U2() {
    }

    @Override // com.jcraft.jsch.Channel
    public void VH() {
        super.VH();
    }

    public InputStream Xa(String str) {
        return Eq(str, null, 0L);
    }

    public void Z1(String str, String str2) {
        String strA8;
        if (this.Za < 2) {
            throw new SftpException(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            String strQ7 = q7(str);
            String strQ72 = q7(str2);
            String strWB = WB(strQ7);
            Vector vectorFN = FN(strQ72);
            int size = vectorFN.size();
            if (size >= 2) {
                throw new SftpException(4, vectorFN.toString());
            }
            if (size == 1) {
                strA8 = (String) vectorFN.elementAt(0);
            } else {
                if (oY(strQ72)) {
                    throw new SftpException(4, strQ72);
                }
                strA8 = Util.a8(strQ72);
            }
            sM(Util.j3(strWB, this.oa), Util.j3(strA8, this.oa));
            Header header = new Header(this);
            jO(this.IS, header);
            int i = header.j6;
            int i2 = header.DW;
            CU(this.IS, i);
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            int iU7 = this.IS.u7();
            if (iU7 == 0) {
                return;
            }
            BR(this.IS, iU7);
            throw null;
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, "", e);
            }
            throw ((SftpException) e);
        }
    }

    public String aq() throws SftpException {
        if (this.Bx == null) {
            try {
                ((Channel.MyPipedInputStream) this.Pa).FH();
                this.Bx = Util.v5(Sf(""), this.oa);
            } catch (Exception e) {
                if (e instanceof SftpException) {
                    throw ((SftpException) e);
                }
                throw new SftpException(4, "", e);
            }
        }
        return this.Bx;
    }

    public String cT() {
        return hz();
    }

    public SftpATTRS fY(String str) {
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            return ef(WB(q7(str)));
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, "", e);
        }
    }

    public void jJ(String str) {
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            String strWB = WB(q7(str));
            byte[] bArrSf = Sf(strWB);
            SftpATTRS sftpATTRSMz = Mz(bArrSf);
            if ((sftpATTRSMz.FH() & 4) == 0) {
                throw new SftpException(4, "Can't change directory: " + strWB);
            }
            if (sftpATTRSMz.tp()) {
                gG(Util.v5(bArrSf, this.oa));
            } else {
                throw new SftpException(4, "Can't change directory: " + strWB);
            }
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, "", e);
            }
            throw ((SftpException) e);
        }
    }

    public void jw(String str, LsEntrySelector lsEntrySelector) throws SftpException {
        byte[] bArrLg;
        byte[] bArrJ3;
        String strV5;
        boolean zJ8;
        String strV52;
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            String strQ7 = q7(str);
            new Vector();
            int iLastIndexOf = strQ7.lastIndexOf(47);
            int i = 1;
            int i2 = 0;
            String strSubstring = strQ7.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
            String strSubstring2 = strQ7.substring(iLastIndexOf + 1);
            String strA8 = Util.a8(strSubstring);
            byte[][] bArr = new byte[1][];
            boolean zKo = ko(strSubstring2, bArr);
            if (zKo) {
                bArrLg = bArr[0];
            } else {
                String strA82 = Util.a8(strQ7);
                if (g3(strA82).tp()) {
                    strA8 = strA82;
                    bArrLg = null;
                } else {
                    bArrLg = this.qP ? Util.lg(bArr[0]) : Util.j3(Util.a8(strSubstring2), this.oa);
                }
            }
            sg(Util.j3(strA8, this.oa));
            Header header = new Header(this);
            jO(this.IS, header);
            int i3 = header.j6;
            int i4 = header.DW;
            CU(this.IS, i3);
            int i5 = 101;
            if (i4 != 101 && i4 != 102) {
                throw new SftpException(4, "");
            }
            if (i4 == 101) {
                BR(this.IS, this.IS.u7());
                throw null;
            }
            byte[] bArrQX = this.IS.QX();
            int iJ6 = 0;
            while (true) {
                if (iJ6 != 0) {
                    break;
                }
                aX(bArrQX);
                jO(this.IS, header);
                int i6 = header.j6;
                int i7 = header.DW;
                if (i7 != i5 && i7 != 104) {
                    throw new SftpException(4, "");
                }
                if (i7 == i5) {
                    CU(this.IS, i6);
                    int iU7 = this.IS.u7();
                    if (iU7 != i) {
                        BR(this.IS, iU7);
                        throw null;
                    }
                } else {
                    this.IS.BT();
                    et(this.IS.DW, i2, 4);
                    int i8 = i6 - 4;
                    int iU72 = this.IS.u7();
                    this.IS.gW();
                    while (iU72 > 0) {
                        if (i8 > 0) {
                            this.IS.P8();
                            int iEt = et(this.IS.DW, this.IS.FH, this.IS.DW.length > this.IS.FH + i8 ? i8 : this.IS.DW.length - this.IS.FH);
                            this.IS.FH += iEt;
                            i8 -= iEt;
                        }
                        byte[] bArrQX2 = this.IS.QX();
                        byte[] bArrQX3 = this.Za <= 3 ? this.IS.QX() : null;
                        SftpATTRS sftpATTRSDW = SftpATTRS.DW(this.IS);
                        if (iJ6 == i) {
                            iU72--;
                            i5 = 101;
                        } else {
                            if (bArrLg == null) {
                                strV5 = null;
                                zJ8 = true;
                            } else if (zKo) {
                                if (this.qP) {
                                    bArrJ3 = bArrQX2;
                                    strV5 = null;
                                } else {
                                    strV5 = Util.v5(bArrQX2, this.oa);
                                    bArrJ3 = Util.j3(strV5, "UTF-8");
                                }
                                zJ8 = Util.J8(bArrLg, bArrJ3);
                            } else {
                                strV5 = null;
                                zJ8 = Util.j6(bArrLg, bArrQX2);
                            }
                            if (zJ8) {
                                if (strV5 == null) {
                                    strV5 = Util.v5(bArrQX2, this.oa);
                                }
                                if (bArrQX3 == null) {
                                    strV52 = String.valueOf(sftpATTRSDW.toString()) + " " + strV5;
                                } else {
                                    strV52 = Util.v5(bArrQX3, this.oa);
                                }
                                iJ6 = lsEntrySelector.j6(new LsEntry(this, strV5, strV52, sftpATTRSDW));
                            }
                            iU72--;
                            i = 1;
                            i5 = 101;
                            i2 = 0;
                        }
                    }
                }
            }
            vJ(bArrQX, header);
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, "", e);
            }
            throw ((SftpException) e);
        }
    }

    public OutputStream k2(String str) {
        return zh(str, null, 0);
    }

    public Vector mb(String str) {
        final Vector vector = new Vector();
        jw(str, new LsEntrySelector(this) { // from class: com.jcraft.jsch.ChannelSftp.3
            @Override // com.jcraft.jsch.ChannelSftp.LsEntrySelector
            public int j6(LsEntry lsEntry) {
                vector.addElement(lsEntry);
                return 0;
            }
        });
        return vector;
    }

    public void n5(String str) {
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            Vector vectorFN = FN(q7(str));
            int size = vectorFN.size();
            Header header = new Header(this);
            for (int i = 0; i < size; i++) {
                QO(Util.j3((String) vectorFN.elementAt(i), this.oa));
                jO(this.IS, header);
                int i2 = header.j6;
                int i3 = header.DW;
                CU(this.IS, i2);
                if (i3 != 101) {
                    throw new SftpException(4, "");
                }
                int iU7 = this.IS.u7();
                if (iU7 != 0) {
                    BR(this.IS, iU7);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, "", e);
            }
            throw ((SftpException) e);
        }
    }

    public void qp(String str) {
        try {
            ((Channel.MyPipedInputStream) this.Pa).FH();
            eU(Util.j3(q7(str), this.oa), null);
            Header header = new Header(this);
            jO(this.IS, header);
            int i = header.j6;
            int i2 = header.DW;
            CU(this.IS, i);
            if (i2 != 101) {
                throw new SftpException(4, "");
            }
            int iU7 = this.IS.u7();
            if (iU7 == 0) {
                return;
            }
            BR(this.IS, iU7);
            throw null;
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, "", e);
            }
            throw ((SftpException) e);
        }
    }

    public OutputStream zh(String str, SftpProgressMonitor sftpProgressMonitor, int i) {
        return AL(str, sftpProgressMonitor, i, 0L);
    }
}
