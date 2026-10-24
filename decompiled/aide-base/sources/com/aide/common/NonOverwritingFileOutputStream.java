package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

@cy(clazz = -157391955206854869L, container = -157391955206854869L, user = true)
/* loaded from: classes.dex */
public class NonOverwritingFileOutputStream extends OutputStream {

    @fy
    private static /* synthetic */ boolean fY;

    @gy
    private static /* synthetic */ boolean qp;

    @dy(field = 1107234354923090988L)
    private String WB;

    @dy(field = 209312664855054373L)
    private int jw;

    @dy(field = -1942073296936951275L)
    private byte[] mb;

    static {
        iy.Zo(NonOverwritingFileOutputStream.class);
    }

    @ey(method = 295602187990541800L)
    public NonOverwritingFileOutputStream(String str) {
        try {
            if (fY) {
                iy.tp(-2159712698807232000L, null, str);
            }
            this.mb = new byte[1000];
            this.WB = str;
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, -2159712698807232000L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3341137981534712400L)
    private void j6(int i) {
        try {
            if (fY) {
                iy.u7(2569844392977721680L, this, i);
            }
            byte[] bArr = new byte[Math.max(this.mb.length * 2, i)];
            System.arraycopy(this.mb, 0, bArr, 0, this.mb.length);
            this.mb = bArr;
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 2569844392977721680L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    @ey(method = 1765222066111730060L)
    public void close() {
        boolean z;
        try {
            if (fY) {
                iy.gn(1549171073775137592L, this);
            }
            new File(this.WB).getParentFile().mkdirs();
            if (new File(this.WB).exists() && new File(this.WB).length() == this.jw) {
                FileInputStream fileInputStream = new FileInputStream(this.WB);
                int i = 0;
                while (true) {
                    int i2 = fileInputStream.read();
                    if (i2 == -1) {
                        z = false;
                        break;
                    }
                    int i3 = i + 1;
                    if (i2 != this.mb[i]) {
                        z = true;
                        break;
                    }
                    i = i3;
                }
                fileInputStream.close();
                if (!z) {
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(this.WB);
            fileOutputStream.write(this.mb, 0, this.jw);
            fileOutputStream.close();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 1549171073775137592L, this);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    @ey(method = -92569411871932784L)
    public void write(int i) {
        try {
            if (fY) {
                iy.u7(-552376840011211392L, this, i);
            }
            if (this.jw >= this.mb.length) {
                j6(this.jw + 1);
            }
            byte[] bArr = this.mb;
            int i2 = this.jw;
            this.jw = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, -552376840011211392L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    @ey(method = 2713172520582590784L)
    public void write(byte[] bArr, int i, int i2) {
        try {
            if (fY) {
                iy.we(954789037784654712L, this, bArr, new Integer(i), new Integer(i2));
            }
            if (this.jw + i2 >= this.mb.length) {
                j6(this.jw + i2);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                this.mb[this.jw + i3] = bArr[i + i3];
            }
            this.jw += i2;
        } catch (Throwable th) {
            if (qp) {
                iy.U2(th, 954789037784654712L, this, bArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
