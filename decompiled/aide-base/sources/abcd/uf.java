package abcd;

import java.io.OutputStream;

@cy(clazz = 350630418671245344L, container = 350630418671245344L, user = true)
/* loaded from: classes.dex */
public class uf extends OutputStream {

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = -511362552826188901L)
    private final OutputStream WB;

    @dy(field = -511382988863066188L)
    private final OutputStream mb;

    static {
        iy.Zo(uf.class);
    }

    @ey(method = -3445361770030393857L)
    public uf(OutputStream outputStream, OutputStream outputStream2) {
        try {
            if (jw) {
                iy.EQ(425321149652825512L, null, outputStream, outputStream2);
            }
            this.WB = outputStream;
            this.mb = outputStream2;
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 425321149652825512L, null, outputStream, outputStream2);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    @ey(method = 2165854896717128525L)
    public void close() {
        try {
            if (jw) {
                iy.gn(-1647043526303603424L, this);
            }
            if (this.WB != null) {
                this.WB.close();
            }
            if (this.mb != null) {
                this.mb.close();
            }
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1647043526303603424L, this);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    @ey(method = 2290133547078247757L)
    public void flush() {
        try {
            if (jw) {
                iy.gn(-1550418596417897976L, this);
            }
            if (this.WB != null) {
                this.WB.flush();
            }
            if (this.mb != null) {
                this.mb.flush();
            }
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1550418596417897976L, this);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    @ey(method = -3920313743524210719L)
    public void write(int i) {
        try {
            if (jw) {
                iy.u7(-670904570860601360L, this, i);
            }
            if (this.WB != null) {
                this.WB.write(i);
            }
            if (this.mb != null) {
                this.mb.write(i);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -670904570860601360L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    @ey(method = -144735096234945961L)
    public void write(byte[] bArr) {
        try {
            if (jw) {
                iy.tp(875292999722787212L, this, bArr);
            }
            if (this.WB != null) {
                this.WB.write(bArr);
            }
            if (this.mb != null) {
                this.mb.write(bArr);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, 875292999722787212L, this, bArr);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    @ey(method = 1415014408438857405L)
    public void write(byte[] bArr, int i, int i2) {
        try {
            if (jw) {
                iy.we(-414479510827417000L, this, bArr, new Integer(i), new Integer(i2));
            }
            if (this.WB != null) {
                this.WB.write(bArr, i, i2);
            }
            if (this.mb != null) {
                this.mb.write(bArr, i, i2);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, -414479510827417000L, this, bArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
