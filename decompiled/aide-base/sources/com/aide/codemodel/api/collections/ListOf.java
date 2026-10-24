package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import java.util.Comparator;

@cy(clazz = -590236061300993744L, container = -590236061300993744L, user = true)
/* loaded from: classes.dex */
public class ListOf<E extends Entity> {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 1639749535817443781L)
    private int DW;

    @dy(field = -2661030919012278916L)
    private final EntitySpace FH;

    @dy(field = -2462418778126487040L)
    private int[] j6;

    static {
        iy.Zo(ListOf.class);
    }

    @ey(method = 118865126489321287L)
    public ListOf(EntitySpace entitySpace) {
        try {
            if (Hw) {
                iy.tp(7458188591092174905L, null, entitySpace);
            }
            this.FH = entitySpace;
            this.j6 = null;
            this.DW = 0;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 7458188591092174905L, null, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = 1038523677896841705L)
    private void we(int i, int i2, Comparator<? super E> comparator) throws Throwable {
        Throwable th;
        try {
            if (Hw) {
                iy.we(151525008077568912L, this, new Integer(i), new Integer(i2), comparator);
            }
            if (i < i2) {
                Entity entity = this.FH.getEntity(this.j6[((i2 - i) / 2) + i]);
                int i3 = i;
                int i4 = i2;
                while (i3 <= i4) {
                    while (comparator.compare(this.FH.getEntity(this.j6[i3]), entity) < 0) {
                        try {
                            i3++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i3;
                            i2 = i4;
                            if (!v5) {
                                throw th;
                            }
                            iy.U2(th, 151525008077568912L, this, new Integer(i), new Integer(i2), comparator);
                            throw th;
                        }
                    }
                    while (comparator.compare(entity, this.FH.getEntity(this.j6[i4])) < 0) {
                        i4--;
                    }
                    if (i3 <= i4) {
                        int i5 = this.j6[i4];
                        this.j6[i4] = this.j6[i3];
                        this.j6[i3] = i5;
                        i3++;
                        i4--;
                    }
                }
                we(i, i4, comparator);
                we(i3, i2, comparator);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = 52166511441972949L)
    public void DW(ListOf<E> listOf) {
        try {
            if (Hw) {
                iy.tp(-5286461828474379124L, this, listOf);
            }
            for (int i = 0; i < listOf.EQ(); i++) {
                j6(listOf.v5(i));
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -5286461828474379124L, this, listOf);
            }
            throw th;
        }
    }

    @ey(method = 1955286396930959928L)
    public int EQ() {
        try {
            if (Hw) {
                iy.gn(-2372431799128813953L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2372431799128813953L, this);
            }
            throw th;
        }
    }

    @ey(method = 285622986317843952L)
    public void FH() {
        try {
            if (Hw) {
                iy.gn(-729739015684095695L, this);
            }
            this.DW = 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -729739015684095695L, this);
            }
            throw th;
        }
    }

    @ey(method = 115385114358368263L)
    public boolean Hw(Entity entity) {
        try {
            if (Hw) {
                iy.tp(-63701047587861348L, this, entity);
            }
            for (int i = 0; i < EQ(); i++) {
                if (v5(i) == entity) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -63701047587861348L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 36354648249282819L)
    public void J0(Comparator<? super E> comparator) {
        try {
            if (Hw) {
                iy.tp(5445035616165555592L, this, comparator);
            }
            we(0, this.DW - 1, comparator);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 5445035616165555592L, this, comparator);
            }
            throw th;
        }
    }

    @ey(method = 57962527074129600L)
    public E VH() {
        try {
            if (Hw) {
                iy.gn(-213689389932356811L, this);
            }
            if (this.DW == 0) {
                return null;
            }
            int[] iArr = this.j6;
            int i = this.DW - 1;
            this.DW = i;
            return (E) this.FH.getEntity(iArr[i]);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -213689389932356811L, this);
            }
            throw th;
        }
    }

    @ey(method = 1945722371547085824L)
    public E Zo() {
        try {
            if (Hw) {
                iy.gn(-2367546318435094185L, this);
            }
            if (this.DW == 0) {
                return null;
            }
            return (E) v5(this.DW - 1);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2367546318435094185L, this);
            }
            throw th;
        }
    }

    @ey(method = 1807305275979512612L)
    public void gn(E e) {
        try {
            if (Hw) {
                iy.tp(-3501770286617854221L, this, e);
            }
            j6(e);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -3501770286617854221L, this, e);
            }
            throw th;
        }
    }

    @ey(method = -2535615063415627137L)
    public void j6(E e) {
        try {
            if (Hw) {
                iy.tp(7066497354616161264L, this, e);
            }
            if (this.j6 == null) {
                this.j6 = new int[10];
            } else if (this.DW >= this.j6.length) {
                int[] iArr = new int[(this.j6.length * 2) + 1];
                System.arraycopy(this.j6, 0, iArr, 0, this.j6.length);
                this.j6 = iArr;
            }
            int[] iArr2 = this.j6;
            int i = this.DW;
            this.DW = i + 1;
            iArr2[i] = this.FH.getId(e);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 7066497354616161264L, this, e);
            }
            throw th;
        }
    }

    @ey(method = 739463775174203521L)
    public void setSize(int i) {
        try {
            if (Hw) {
                iy.u7(267850128244160196L, this, i);
            }
            this.DW = i;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 267850128244160196L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6060341123526638361L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (Hw) {
                iy.tp(234909436793188992L, this, storeOutputStream);
            }
            if (this.j6 == null) {
                storeOutputStream.writeInt(0);
                return;
            }
            storeOutputStream.writeInt(this.DW);
            for (int i = 0; i < this.DW; i++) {
                storeOutputStream.writeInt(this.j6[i]);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 234909436793188992L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -3899522140548615035L)
    public String toString() {
        try {
            if (Hw) {
                iy.gn(233149198771734912L, this);
            }
            String str = "{";
            for (int i = 0; i < this.DW; i++) {
                str = str + this.FH.getEntity(this.j6[i]).getFullyQualifiedNameString() + ", ";
            }
            return str + "}";
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 233149198771734912L, this);
            }
            throw th;
        }
    }

    @ey(method = -283827907276141587L)
    public void u7(int i, E e) {
        try {
            if (Hw) {
                iy.EQ(778392260804340104L, this, new Integer(i), e);
            }
            if (this.j6 == null) {
                this.j6 = new int[Math.max(10, i + 1)];
            } else if (i >= this.j6.length) {
                int[] iArr = new int[Math.max(i + 1, (this.j6.length * 2) + 1)];
                System.arraycopy(this.j6, 0, iArr, 0, this.j6.length);
                this.j6 = iArr;
            }
            if (i >= this.DW) {
                this.DW = i + 1;
            }
            this.j6[i] = this.FH.getId(e);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 778392260804340104L, this, new Integer(i), e);
            }
            throw th;
        }
    }

    @ey(method = -2221317556860855080L)
    public E v5(int i) {
        try {
            if (Hw) {
                iy.u7(-7400851955653872793L, this, i);
            }
            if (this.j6 == null || i >= this.j6.length || i >= this.DW) {
                return null;
            }
            return (E) this.FH.getEntity(this.j6[i]);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -7400851955653872793L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4597785603832032L)
    public ListOf(EntitySpace entitySpace, int i) {
        try {
            if (Hw) {
                iy.EQ(-1563255435942939072L, null, entitySpace, new Integer(i));
            }
            this.FH = entitySpace;
            this.j6 = new int[i];
            this.DW = i;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -1563255435942939072L, null, entitySpace, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -220023441248783241L)
    public ListOf(EntitySpace entitySpace, StoreInputStream storeInputStream) {
        try {
            if (Hw) {
                iy.EQ(6992473060679717621L, null, entitySpace, storeInputStream);
            }
            this.FH = entitySpace;
            int i = storeInputStream.readInt();
            this.DW = i;
            if (i > 0) {
                this.j6 = new int[i];
                for (int i2 = 0; i2 < this.j6.length; i2++) {
                    this.j6[i2] = storeInputStream.readInt();
                }
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 6992473060679717621L, null, entitySpace, storeInputStream);
            }
            throw th;
        }
    }
}
