package com.jcraft.jsch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes.dex */
public class KnownHosts implements HostKeyRepository {
    private static final byte[] Hw = {32};
    private static final byte[] v5 = Util.aM("\n");
    private Vector DW;
    private String j6 = null;
    private MAC FH = null;

    class HashedHostKey extends HostKey {
        private boolean gn;
        byte[] tp;
        byte[] u7;

        HashedHostKey(KnownHosts knownHosts, String str, byte[] bArr) {
            this(knownHosts, str, 0, bArr);
        }

        @Override // com.jcraft.jsch.HostKey
        boolean VH(String str) {
            boolean zJ6;
            if (!this.gn) {
                return super.VH(str);
            }
            MAC macEQ = KnownHosts.this.EQ();
            try {
                synchronized (macEQ) {
                    macEQ.Zo(this.u7);
                    byte[] bArrAM = Util.aM(str);
                    macEQ.j6(bArrAM, 0, bArrAM.length);
                    byte[] bArr = new byte[macEQ.FH()];
                    macEQ.Hw(bArr, 0);
                    zJ6 = Util.j6(this.tp, bArr);
                }
                return zJ6;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }

        void gn() {
            if (this.gn) {
                return;
            }
            MAC macEQ = KnownHosts.this.EQ();
            if (this.u7 == null) {
                Random random = Session.GK;
                synchronized (random) {
                    byte[] bArr = new byte[macEQ.FH()];
                    this.u7 = bArr;
                    random.j6(bArr, 0, bArr.length);
                }
            }
            try {
                synchronized (macEQ) {
                    macEQ.Zo(this.u7);
                    byte[] bArrAM = Util.aM(this.DW);
                    macEQ.j6(bArrAM, 0, bArrAM.length);
                    byte[] bArr2 = new byte[macEQ.FH()];
                    this.tp = bArr2;
                    macEQ.Hw(bArr2, 0);
                }
            } catch (Exception unused) {
            }
            StringBuilder sb = new StringBuilder("|1|");
            byte[] bArr3 = this.u7;
            sb.append(Util.DW(Util.Mr(bArr3, 0, bArr3.length)));
            sb.append("|");
            byte[] bArr4 = this.tp;
            sb.append(Util.DW(Util.Mr(bArr4, 0, bArr4.length)));
            this.DW = sb.toString();
            this.gn = true;
        }

        boolean u7() {
            return this.gn;
        }

        HashedHostKey(KnownHosts knownHosts, String str, int i, byte[] bArr) {
            this("", str, i, bArr, null);
        }

        HashedHostKey(String str, String str2, int i, byte[] bArr, String str3) throws JSchException {
            super(str, str2, i, bArr, str3);
            this.gn = false;
            this.u7 = null;
            this.tp = null;
            if (!this.DW.startsWith("|1|") || this.DW.substring(3).indexOf("|") <= 0) {
                return;
            }
            String strSubstring = this.DW.substring(3);
            String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("|"));
            String strSubstring3 = strSubstring.substring(strSubstring.indexOf("|") + 1);
            this.u7 = Util.tp(Util.aM(strSubstring2), 0, strSubstring2.length());
            byte[] bArrTp = Util.tp(Util.aM(strSubstring3), 0, strSubstring3.length());
            this.tp = bArrTp;
            if (this.u7.length == 20 && bArrTp.length == 20) {
                this.gn = true;
            } else {
                this.u7 = null;
                this.tp = null;
            }
        }
    }

    KnownHosts(JSch jSch) {
        this.DW = null;
        this.DW = new Vector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized MAC EQ() {
        if (this.FH == null) {
            try {
                this.FH = (MAC) Class.forName(JSch.v5("hmac-sha1")).newInstance();
            } catch (Exception e) {
                System.err.println("hmacsha1: " + e);
            }
        }
        return this.FH;
    }

    private void VH(String str) {
        this.DW.addElement(new HostKey(str, 3, null));
    }

    private String u7(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length2) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                break;
            }
            if (str2.equals(str.substring(i, iIndexOf))) {
                return String.valueOf(str.substring(0, i)) + str.substring(iIndexOf + 1);
            }
            i = iIndexOf + 1;
        }
        if (str.endsWith(str2) && length2 - i == length) {
            return str.substring(0, length == length2 ? 0 : (length2 - length) - 1);
        }
        return str;
    }

    private int we(byte[] bArr) {
        if (bArr[8] == 100) {
            return 1;
        }
        return bArr[8] == 114 ? 2 : 3;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void DW(HostKey hostKey, UserInfo userInfo) {
        boolean z;
        int i = hostKey.FH;
        String strDW = hostKey.DW();
        byte[] bArr = hostKey.Hw;
        synchronized (this.DW) {
            z = false;
            for (int i2 = 0; i2 < this.DW.size(); i2++) {
                HostKey hostKey2 = (HostKey) this.DW.elementAt(i2);
                if (hostKey2.VH(strDW)) {
                    int i3 = hostKey2.FH;
                }
            }
        }
        this.DW.addElement(hostKey);
        String strJ6 = j6();
        if (strJ6 != null) {
            File file = new File(Util.VH(strJ6));
            if (file.exists()) {
                z = true;
            } else if (userInfo != null) {
                boolean zVH = userInfo.VH(String.valueOf(strJ6) + " does not exist.\nAre you sure you want to create it?");
                File parentFile = file.getParentFile();
                if (zVH && parentFile != null && !parentFile.exists()) {
                    zVH = userInfo.VH("The parent directory " + parentFile + " does not exist.\nAre you sure you want to create it?");
                    if (zVH) {
                        if (parentFile.mkdirs()) {
                            userInfo.Hw(parentFile + " has been succesfully created.\nPlease check its access permission.");
                        } else {
                            userInfo.Hw(parentFile + " has not been created.");
                            zVH = false;
                        }
                    }
                }
                if (parentFile != null) {
                    z = zVH;
                }
            }
            if (z) {
                try {
                    QX(strJ6);
                } catch (Exception e) {
                    System.err.println("sync known_hosts: " + e);
                }
            }
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public int FH(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        int iWe = we(bArr);
        synchronized (this.DW) {
            int i = 1;
            for (int i2 = 0; i2 < this.DW.size(); i2++) {
                HostKey hostKey = (HostKey) this.DW.elementAt(i2);
                if (hostKey.VH(str) && hostKey.FH == iWe) {
                    if (Util.j6(hostKey.Hw, bArr)) {
                        return 0;
                    }
                    i = 2;
                }
            }
            return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? FH(str.substring(1, str.indexOf("]:")), bArr) : i;
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void Hw(String str, String str2, byte[] bArr) {
        boolean z;
        synchronized (this.DW) {
            z = false;
            for (int i = 0; i < this.DW.size(); i++) {
                HostKey hostKey = (HostKey) this.DW.elementAt(i);
                if (str == null || (hostKey.VH(str) && (str2 == null || (hostKey.v5().equals(str2) && (bArr == null || Util.j6(bArr, hostKey.Hw)))))) {
                    String strDW = hostKey.DW();
                    if (strDW.equals(str) || ((hostKey instanceof HashedHostKey) && ((HashedHostKey) hostKey).u7())) {
                        this.DW.removeElement(hostKey);
                    } else {
                        hostKey.DW = u7(strDW, str);
                    }
                    z = true;
                }
            }
        }
        if (z) {
            try {
                Ws();
            } catch (Exception unused) {
            }
        }
    }

    void J0(InputStream inputStream) throws IOException, JSchException {
        int i;
        String string;
        String string2;
        this.DW.removeAllElements();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    byte[] bArr2 = bArr;
                    int i2 = 0;
                    while (true) {
                        int i3 = inputStream.read();
                        i = -1;
                        if (i3 == -1) {
                            if (i2 == 0) {
                                try {
                                    inputStream.close();
                                    return;
                                } catch (IOException e) {
                                    throw new JSchException(e.toString(), e);
                                }
                            }
                        } else if (i3 != 13) {
                            if (i3 == 10) {
                                break;
                            }
                            if (bArr2.length <= i2) {
                                if (i2 > 10240) {
                                    break;
                                }
                                byte[] bArr3 = new byte[bArr2.length * 2];
                                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                                bArr2 = bArr3;
                            }
                            int i4 = i2 + 1;
                            bArr2[i2] = (byte) i3;
                            i2 = i4;
                        }
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i2) {
                            break;
                        }
                        byte b = bArr2[i5];
                        if (b != 32 && b != 9) {
                            if (b == 35) {
                                VH(Util.FH(bArr2, 0, i2));
                            }
                        }
                        i5++;
                    }
                    if (i5 >= i2) {
                        VH(Util.FH(bArr2, 0, i2));
                    } else {
                        stringBuffer.setLength(0);
                        while (i5 < i2) {
                            int i6 = i5 + 1;
                            byte b2 = bArr2[i5];
                            if (b2 != 32 && b2 != 9) {
                                stringBuffer.append((char) b2);
                                i5 = i6;
                            }
                            i5 = i6;
                            break;
                        }
                        String string3 = stringBuffer.toString();
                        if (i5 >= i2 || string3.length() == 0) {
                            VH(Util.FH(bArr2, 0, i2));
                        } else {
                            while (i5 < i2) {
                                byte b3 = bArr2[i5];
                                if (b3 != 32 && b3 != 9) {
                                    break;
                                }
                                i5++;
                            }
                            if (string3.charAt(0) == '@') {
                                stringBuffer.setLength(0);
                                while (i5 < i2) {
                                    int i7 = i5 + 1;
                                    byte b4 = bArr2[i5];
                                    if (b4 != 32 && b4 != 9) {
                                        stringBuffer.append((char) b4);
                                        i5 = i7;
                                    }
                                    i5 = i7;
                                    break;
                                }
                                string = stringBuffer.toString();
                                if (i5 < i2 && string.length() != 0) {
                                    while (i5 < i2) {
                                        byte b5 = bArr2[i5];
                                        if (b5 != 32 && b5 != 9) {
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                VH(Util.FH(bArr2, 0, i2));
                            } else {
                                string = string3;
                                string3 = "";
                            }
                            stringBuffer.setLength(0);
                            while (i5 < i2) {
                                int i8 = i5 + 1;
                                byte b6 = bArr2[i5];
                                if (b6 != 32 && b6 != 9) {
                                    stringBuffer.append((char) b6);
                                    i5 = i8;
                                }
                                i5 = i8;
                                break;
                            }
                            if (stringBuffer.toString().equals("ssh-dss")) {
                                i = 1;
                            } else if (stringBuffer.toString().equals("ssh-rsa")) {
                                i = 2;
                            } else {
                                i5 = i2;
                            }
                            if (i5 >= i2) {
                                VH(Util.FH(bArr2, 0, i2));
                            } else {
                                while (i5 < i2) {
                                    byte b7 = bArr2[i5];
                                    if (b7 != 32 && b7 != 9) {
                                        break;
                                    }
                                    i5++;
                                }
                                stringBuffer.setLength(0);
                                while (i5 < i2) {
                                    int i9 = i5 + 1;
                                    byte b8 = bArr2[i5];
                                    if (b8 != 13) {
                                        if (b8 != 10 && b8 != 32 && b8 != 9) {
                                            stringBuffer.append((char) b8);
                                        }
                                        i5 = i9;
                                        break;
                                    }
                                    i5 = i9;
                                }
                                String string4 = stringBuffer.toString();
                                if (string4.length() == 0) {
                                    VH(Util.FH(bArr2, 0, i2));
                                } else {
                                    while (i5 < i2) {
                                        byte b9 = bArr2[i5];
                                        if (b9 != 32 && b9 != 9) {
                                            break;
                                        }
                                        i5++;
                                    }
                                    if (i5 < i2) {
                                        stringBuffer.setLength(0);
                                        while (i5 < i2) {
                                            int i10 = i5 + 1;
                                            byte b10 = bArr2[i5];
                                            if (b10 != 13) {
                                                if (b10 == 10) {
                                                    break;
                                                } else {
                                                    stringBuffer.append((char) b10);
                                                }
                                            }
                                            i5 = i10;
                                        }
                                        string2 = stringBuffer.toString();
                                    } else {
                                        string2 = null;
                                    }
                                    this.DW.addElement(new HashedHostKey(string3, string, i, Util.tp(Util.aM(string4), 0, string4.length()), string2));
                                }
                            }
                        }
                    }
                    bArr = bArr2;
                }
            } catch (Exception e2) {
                if (!(e2 instanceof JSchException)) {
                    throw new JSchException(e2.toString(), e2);
                }
                throw ((JSchException) e2);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e3) {
                throw new JSchException(e3.toString(), e3);
            }
        }
    }

    void J8(String str) {
        try {
            this.j6 = str;
            J0(new FileInputStream(Util.VH(str)));
        } catch (FileNotFoundException e) {
            throw new JSchException(e.toString(), e);
        }
    }

    protected synchronized void QX(String str) {
        if (str == null) {
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(Util.VH(str));
        tp(fileOutputStream);
        fileOutputStream.close();
    }

    protected void Ws() {
        String str = this.j6;
        if (str != null) {
            QX(str);
        }
    }

    HostKey gn(String str, byte[] bArr) {
        HashedHostKey hashedHostKey = new HashedHostKey(this, str, bArr);
        hashedHostKey.gn();
        return hashedHostKey;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public String j6() {
        return this.j6;
    }

    void tp(OutputStream outputStream) {
        try {
            synchronized (this.DW) {
                for (int i = 0; i < this.DW.size(); i++) {
                    HostKey hostKey = (HostKey) this.DW.elementAt(i);
                    String strHw = hostKey.Hw();
                    String strDW = hostKey.DW();
                    String strV5 = hostKey.v5();
                    String strJ6 = hostKey.j6();
                    if (strV5.equals("UNKNOWN")) {
                        outputStream.write(Util.aM(strDW));
                        outputStream.write(v5);
                    } else {
                        if (strHw.length() != 0) {
                            outputStream.write(Util.aM(strHw));
                            outputStream.write(Hw);
                        }
                        outputStream.write(Util.aM(strDW));
                        outputStream.write(Hw);
                        outputStream.write(Util.aM(strV5));
                        outputStream.write(Hw);
                        outputStream.write(Util.aM(hostKey.FH()));
                        if (strJ6 != null) {
                            outputStream.write(Hw);
                            outputStream.write(Util.aM(strJ6));
                        }
                        outputStream.write(v5);
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public HostKey[] v5(String str, String str2) {
        HostKey[] hostKeyArr;
        synchronized (this.DW) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.DW.size(); i++) {
                HostKey hostKey = (HostKey) this.DW.elementAt(i);
                if (hostKey.FH != 3 && (str == null || (hostKey.VH(str) && (str2 == null || hostKey.v5().equals(str2))))) {
                    arrayList.add(hostKey);
                }
            }
            int size = arrayList.size();
            hostKeyArr = new HostKey[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                hostKeyArr[i2] = (HostKey) arrayList.get(i2);
            }
            if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                HostKey[] hostKeyArrV5 = v5(str.substring(1, str.indexOf("]:")), str2);
                if (hostKeyArrV5.length > 0) {
                    HostKey[] hostKeyArr2 = new HostKey[hostKeyArrV5.length + size];
                    System.arraycopy(hostKeyArr, 0, hostKeyArr2, 0, size);
                    System.arraycopy(hostKeyArrV5, 0, hostKeyArr2, size, hostKeyArrV5.length);
                    hostKeyArr = hostKeyArr2;
                }
            }
        }
        return hostKeyArr;
    }
}
