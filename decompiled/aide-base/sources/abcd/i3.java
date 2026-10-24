package abcd;

@cy(clazz = -3349069187241974240L, container = -3349069187241974240L, user = true)
/* loaded from: classes.dex */
public class i3 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -2467269698413904613L)
    private int DW;

    @dy(field = -2651427494889758640L)
    private byte[] j6;

    static {
        iy.Zo(i3.class);
    }

    @ey(method = 1576583322985104323L)
    public i3() {
        try {
            if (FH) {
                iy.gn(-1751609472981479907L, null);
            }
            this.j6 = null;
            this.DW = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1751609472981479907L, null);
            }
            throw th;
        }
    }

    @ey(method = 2648059829438877104L)
    public void DW() {
        try {
            if (FH) {
                iy.gn(599327288808253981L, this);
            }
            this.DW = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 599327288808253981L, this);
            }
            throw th;
        }
    }

    @ey(method = 2653067417511244136L)
    public byte FH(int i) {
        try {
            if (FH) {
                iy.u7(6996295454910378435L, this, i);
            }
            if (this.j6 != null && i < this.j6.length && i < this.DW) {
                return this.j6[i];
            }
            return (byte) -1;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 6996295454910378435L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1019033619329811176L)
    public int Hw() {
        try {
            if (FH) {
                iy.gn(-135701201584273917L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -135701201584273917L, this);
            }
            throw th;
        }
    }

    @ey(method = 309324531364612632L)
    public void j6(byte b) {
        try {
            if (FH) {
                iy.tp(4703055853686906183L, this, new Byte(b));
            }
            if (this.j6 == null) {
                this.j6 = new byte[10];
            } else if (this.DW >= this.j6.length) {
                byte[] bArr = new byte[(this.j6.length * 2) + 1];
                System.arraycopy(this.j6, 0, bArr, 0, this.j6.length);
                this.j6 = bArr;
            }
            byte[] bArr2 = this.j6;
            int i = this.DW;
            this.DW = i + 1;
            bArr2[i] = b;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 4703055853686906183L, this, new Byte(b));
            }
            throw th;
        }
    }

    @ey(method = 2477026435988484965L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(-3474877270558346880L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW; i++) {
                str = str + ((int) this.j6[i]) + ", ";
            }
            return str + "}";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3474877270558346880L, this);
            }
            throw th;
        }
    }
}
