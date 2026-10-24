package com.aide.codemodel.api.collections;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 1772296429983558735L, container = 1772296429983558735L, user = true)
/* loaded from: classes.dex */
public class ListOfInt {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -2689474325645500761L)
    private int size;

    @dy(field = -2741246541754232352L)
    private int[] values;

    static {
        iy.Zo(ListOfInt.class);
    }

    @ey(method = 1913579753561572641L)
    public ListOfInt() {
        try {
            if (FH) {
                iy.gn(1812504265671665600L, null);
            }
            this.values = null;
            this.size = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1812504265671665600L, null);
            }
            throw th;
        }
    }

    @ey(method = 8592412082527781793L)
    private void sort(int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (FH) {
                iy.EQ(6476239322047086384L, this, new Integer(i), new Integer(i2));
            }
            if (i < i2) {
                int i3 = this.values[((i2 - i) / 2) + i];
                int i4 = i;
                int i5 = i2;
                while (i4 <= i5) {
                    while (this.values[i4] < i3) {
                        try {
                            i4++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i4;
                            i2 = i5;
                            if (!Hw) {
                                throw th;
                            }
                            iy.Mr(th, 6476239322047086384L, this, new Integer(i), new Integer(i2));
                            throw th;
                        }
                    }
                    while (i3 < this.values[i5]) {
                        i5--;
                    }
                    if (i4 <= i5) {
                        int i6 = this.values[i5];
                        this.values[i5] = this.values[i4];
                        this.values[i4] = i6;
                        i4++;
                        i5--;
                    }
                }
                sort(i, i5);
                sort(i4, i2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = 92343395954286892L)
    public void VH(int i) {
        try {
            if (FH) {
                iy.u7(4447896482021548145L, this, i);
            }
            if (this.values != null && i < this.size) {
                System.arraycopy(this.values, i + 1, this.values, i, (this.size - i) - 1);
                this.size--;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 4447896482021548145L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2605133730962195451L)
    public void add(int i) {
        try {
            if (FH) {
                iy.u7(-5542839875055269188L, this, i);
            }
            if (this.values == null) {
                this.values = new int[10];
            } else if (this.size >= this.values.length) {
                int[] iArr = new int[(this.values.length * 2) + 1];
                System.arraycopy(this.values, 0, iArr, 0, this.values.length);
                this.values = iArr;
            }
            int[] iArr2 = this.values;
            int i2 = this.size;
            this.size = i2 + 1;
            iArr2[i2] = i;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5542839875055269188L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1421550935055364428L)
    public void clear() {
        try {
            if (FH) {
                iy.gn(-1412049244061192187L, this);
            }
            this.size = 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1412049244061192187L, this);
            }
            throw th;
        }
    }

    @ey(method = 911450963678669873L)
    public boolean equals(Object obj) {
        try {
            if (FH) {
                iy.tp(223935440798815320L, this, obj);
            }
            if (!(obj instanceof ListOfInt)) {
                return false;
            }
            ListOfInt listOfInt = (ListOfInt) obj;
            if (this.size != listOfInt.size) {
                return false;
            }
            for (int i = 0; i < this.size; i++) {
                if (get(i) != listOfInt.get(i)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 223935440798815320L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = 3507877438895797120L)
    public int get(int i) {
        try {
            if (FH) {
                iy.u7(-4807456511014428765L, this, i);
            }
            if (this.values != null && i < this.values.length && i < this.size) {
                return this.values[i];
            }
            return -1;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4807456511014428765L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7523490218354064853L)
    public void gn(int i, int i2) {
        try {
            if (FH) {
                iy.EQ(-2919152307333001580L, this, new Integer(i), new Integer(i2));
            }
            if (this.values == null) {
                this.values = new int[Math.max(10, i + 1)];
            } else if (i >= this.values.length) {
                int[] iArr = new int[Math.max(i + 1, (this.values.length * 2) + 1)];
                System.arraycopy(this.values, 0, iArr, 0, this.values.length);
                this.values = iArr;
            }
            if (i >= this.size) {
                this.size = i + 1;
            }
            this.values[i] = i2;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2919152307333001580L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2398053291534897808L)
    public int peek() {
        try {
            if (FH) {
                iy.gn(-838419201184654845L, this);
            }
            if (this.size == 0) {
                return -1;
            }
            return get(this.size - 1);
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -838419201184654845L, this);
            }
            throw th;
        }
    }

    @ey(method = -71414126923709972L)
    public int pop() {
        try {
            if (FH) {
                iy.gn(568608656937265713L, this);
            }
            if (this.size == 0) {
                return -1;
            }
            int[] iArr = this.values;
            int i = this.size - 1;
            this.size = i;
            return iArr[i];
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 568608656937265713L, this);
            }
            throw th;
        }
    }

    @ey(method = -7583929140897280000L)
    public void push(int i) {
        try {
            if (FH) {
                iy.u7(6169686089017505477L, this, i);
            }
            add(i);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 6169686089017505477L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2400497784325200900L)
    public int size() {
        try {
            if (FH) {
                iy.gn(-837821790407373349L, this);
            }
            return this.size;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -837821790407373349L, this);
            }
            throw th;
        }
    }

    @ey(method = -2402121210804841617L)
    public void sort() {
        try {
            if (FH) {
                iy.gn(-838415478933956000L, this);
            }
            sort(0, this.size - 1);
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -838415478933956000L, this);
            }
            throw th;
        }
    }

    @ey(method = -6394772674557117L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (FH) {
                iy.tp(-5896539441114979352L, this, storeOutputStream);
            }
            if (this.values == null) {
                storeOutputStream.writeInt(0);
                return;
            }
            storeOutputStream.writeInt(this.size);
            for (int i = 0; i < this.size; i++) {
                storeOutputStream.writeInt(this.values[i]);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5896539441114979352L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -3707423858315070509L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(-883228644126773492L, this);
            }
            String str = "{";
            for (int i = 0; i < this.size; i++) {
                str = str + this.values[i] + ", ";
            }
            return str + "}";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -883228644126773492L, this);
            }
            throw th;
        }
    }

    @ey(method = 304305665752000675L)
    public void u7(int i) {
        try {
            if (FH) {
                iy.u7(125597264603791088L, this, i);
            }
            this.size = i;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 125597264603791088L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2287215560715440L)
    public ListOfInt(int i) {
        try {
            if (FH) {
                iy.u7(44833406766386859L, null, i);
            }
            this.values = new int[i];
            this.size = i;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 44833406766386859L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 699968275412518429L)
    public ListOfInt(StoreInputStream storeInputStream) {
        try {
            if (FH) {
                iy.tp(-334798370985474000L, null, storeInputStream);
            }
            int i = storeInputStream.readInt();
            this.size = i;
            if (i > 0) {
                this.values = new int[i];
                for (int i2 = 0; i2 < this.values.length; i2++) {
                    this.values[i2] = storeInputStream.readInt();
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -334798370985474000L, null, storeInputStream);
            }
            throw th;
        }
    }
}
