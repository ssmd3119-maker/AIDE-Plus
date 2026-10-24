package abcd;

import java.util.ArrayList;
import java.util.List;

@cy(clazz = -182018132816069600L, container = -182018132816069600L, user = true)
/* loaded from: classes.dex */
public class yf<T> {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 2084495436120020703L)
    private int DW;

    @dy(field = -3295930052936194128L)
    private int FH;

    @dy(field = -2786468747608221060L)
    private List<T> j6;

    static {
        iy.Zo(yf.class);
    }

    @ey(method = 6513236110016145L)
    public yf(int i) {
        try {
            if (Hw) {
                iy.u7(152838124851286356L, null, i);
            }
            this.j6 = new ArrayList();
            this.FH = i;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 152838124851286356L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1291722556403254725L)
    public void DW() {
        try {
            if (Hw) {
                iy.gn(-13417795374236672L, this);
            }
            this.j6.clear();
            this.DW = 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -13417795374236672L, this);
            }
            throw th;
        }
    }

    @ey(method = 4483946913849034425L)
    public T FH(int i) {
        try {
            if (Hw) {
                iy.u7(-7066572204385556580L, this, i);
            }
            int size = this.DW + i;
            if (size >= this.j6.size()) {
                size -= this.j6.size();
            }
            return this.j6.get(size);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -7066572204385556580L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 848309508037403885L)
    public int Hw() {
        try {
            if (Hw) {
                iy.gn(2950623810580464560L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2950623810580464560L, this);
            }
            throw th;
        }
    }

    @ey(method = 1608572441021904765L)
    public int Zo() {
        try {
            if (Hw) {
                iy.gn(-1396002777033900592L, this);
            }
            return this.j6.size();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1396002777033900592L, this);
            }
            throw th;
        }
    }

    @ey(method = -1302009827869652800L)
    public T j6(T t) {
        try {
            if (Hw) {
                iy.tp(6852282958301929437L, this, t);
            }
            if (this.j6.size() < this.FH) {
                this.j6.add(t);
                return null;
            }
            T t2 = this.j6.get(this.DW);
            this.j6.set(this.DW, t);
            int i = this.DW + 1;
            this.DW = i;
            if (i >= this.j6.size()) {
                this.DW = 0;
            }
            return t2;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 6852282958301929437L, this, t);
            }
            throw th;
        }
    }

    @ey(method = 1599940236098820785L)
    public T v5() {
        try {
            if (Hw) {
                iy.gn(-1394440179620893716L, this);
            }
            return FH(Zo() - 1);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1394440179620893716L, this);
            }
            throw th;
        }
    }
}
