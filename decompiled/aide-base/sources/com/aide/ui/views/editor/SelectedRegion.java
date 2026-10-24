package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.Serializable;

@cy(clazz = -4684574236020412965L, container = -4684574236020412965L, user = true)
/* loaded from: classes.dex */
public class SelectedRegion implements Serializable {

    @gy
    private static /* synthetic */ boolean k2;

    @fy
    private static /* synthetic */ boolean qp;

    @dy(field = 1697441672101180292L)
    private int endColumn;

    @dy(field = 764896927978719360L)
    private int endLine;

    @dy(field = -155006596900015773L)
    private int startColumn;

    @dy(field = -3642922607416458569L)
    private int startLine;

    static {
        iy.Zo(SelectedRegion.class);
    }

    @ey(method = 101506660896009600L)
    public SelectedRegion(SelectedRegion selectedRegion) {
        try {
            if (qp) {
                iy.tp(643429776865462080L, null, selectedRegion);
            }
            this.startLine = selectedRegion.getStartLine();
            this.startColumn = selectedRegion.getStartColumn();
            this.endLine = selectedRegion.getEndLine();
            this.endColumn = selectedRegion.getEndColumn();
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, 643429776865462080L, null, selectedRegion);
            }
            throw th;
        }
    }

    @ey(method = 471382761591479080L)
    public SelectedRegion EQ(int i, int i2, int i3, int i4) {
        try {
            if (qp) {
                iy.J0(181819741638828405L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SelectedRegion selectedRegion = null;
            if (i2 < this.startLine && i2 != i4) {
                selectedRegion = new SelectedRegion(this);
                this.startLine = (this.startLine + i4) - i2;
            } else if (i2 == this.startLine && i <= this.startColumn) {
                selectedRegion = new SelectedRegion(this);
                if (i2 == i4) {
                    this.startColumn = ((this.startColumn + i3) - i) + 1;
                } else {
                    this.startColumn = ((this.startColumn + i3) - i) + 1;
                    this.startLine = (this.startLine + i4) - i2;
                }
            }
            if (i2 < this.endLine && i2 != i4) {
                if (selectedRegion == null) {
                    selectedRegion = new SelectedRegion(this);
                }
                this.endLine = (this.endLine + i4) - i2;
            } else if (i2 == this.endLine && i < this.endColumn) {
                if (selectedRegion == null) {
                    selectedRegion = new SelectedRegion(this);
                }
                if (i2 == i4) {
                    this.endColumn = ((this.endColumn + i3) - i) + 1;
                } else {
                    this.endColumn = ((this.endColumn + i3) - i) + 1;
                    this.endLine = (this.endLine + i4) - i2;
                }
            }
            return selectedRegion;
        } catch (Throwable th) {
            if (k2) {
                iy.a8(th, 181819741638828405L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -894306356268255232L)
    public void VH(int i) {
        try {
            if (qp) {
                iy.u7(-2152391551274068755L, this, i);
            }
            this.endLine = i;
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -2152391551274068755L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1758651185408123484L)
    public void Zo(int i) {
        try {
            if (qp) {
                iy.u7(1387376827034158585L, this, i);
            }
            this.endColumn = i;
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, 1387376827034158585L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2669809481233888059L)
    public int getEndColumn() {
        try {
            if (qp) {
                iy.gn(3830738486530991700L, this);
            }
            return this.endColumn;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 3830738486530991700L, this);
            }
            throw th;
        }
    }

    @ey(method = 3104332442352485759L)
    public int getEndLine() {
        try {
            if (qp) {
                iy.gn(3355613635041208640L, this);
            }
            return this.endLine;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 3355613635041208640L, this);
            }
            throw th;
        }
    }

    @ey(method = 1813489121573760096L)
    public int getStartColumn() {
        try {
            if (qp) {
                iy.gn(349607870873988411L, this);
            }
            return this.startColumn;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 349607870873988411L, this);
            }
            throw th;
        }
    }

    @ey(method = -3939982355034892804L)
    public int getStartLine() {
        try {
            if (qp) {
                iy.gn(-2479396824533316993L, this);
            }
            return this.startLine;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -2479396824533316993L, this);
            }
            throw th;
        }
    }

    @ey(method = -2162722977213994863L)
    public void gn(int i) {
        try {
            if (qp) {
                iy.u7(-4146193455515782748L, this, i);
            }
            this.startColumn = i;
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -4146193455515782748L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2000042460191730715L)
    public boolean j6(int i, int i2) {
        try {
            if (qp) {
                iy.EQ(-522710359647944364L, this, new Integer(i), new Integer(i2));
            }
            return this.startLine == this.endLine ? i == this.startLine && i2 >= this.startColumn && i2 <= this.endColumn : i == this.startLine ? i2 >= this.startColumn : i == this.endLine ? i2 <= this.endColumn : this.startLine < i && i < this.endLine;
        } catch (Throwable th) {
            if (k2) {
                iy.Mr(th, -522710359647944364L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2593738790095843052L)
    public String toString() {
        try {
            if (qp) {
                iy.gn(600841963548378111L, this);
            }
            return (((this.startLine + ",") + this.startColumn + ",") + this.endLine + ",") + this.endColumn;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 600841963548378111L, this);
            }
            throw th;
        }
    }

    @ey(method = -3619095526449083149L)
    public SelectedRegion tp(int i, int i2, int i3, int i4) {
        try {
            if (qp) {
                iy.J0(1757170764983013120L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SelectedRegion selectedRegion = null;
            if (i2 < this.startLine && i2 != i4) {
                selectedRegion = new SelectedRegion(this);
                this.startLine = (this.startLine + i4) - i2;
            } else if (i2 == this.startLine && i < this.startColumn) {
                selectedRegion = new SelectedRegion(this);
                if (i2 == i4) {
                    this.startColumn = ((this.startColumn + i3) - i) + 1;
                } else {
                    this.startColumn = ((this.startColumn + i3) - i) + 1;
                    this.startLine = (this.startLine + i4) - i2;
                }
            }
            if (i2 < this.endLine && i2 != i4) {
                if (selectedRegion == null) {
                    selectedRegion = new SelectedRegion(this);
                }
                this.endLine = (this.endLine + i4) - i2;
            } else if (i2 == this.endLine && i <= this.endColumn) {
                if (selectedRegion == null) {
                    selectedRegion = new SelectedRegion(this);
                }
                if (i2 == i4) {
                    this.endColumn = ((this.endColumn + i3) - i) + 1;
                } else {
                    this.endColumn = ((this.endColumn + i3) - i) + 1;
                    this.endLine = (this.endLine + i4) - i2;
                }
            }
            return selectedRegion;
        } catch (Throwable th) {
            if (k2) {
                iy.a8(th, 1757170764983013120L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 217265921680069717L)
    public void u7(int i) {
        try {
            if (qp) {
                iy.u7(3246472423522508544L, this, i);
            }
            this.startLine = i;
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, 3246472423522508544L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3779242096261002345L)
    public SelectedRegion we(int i, int i2, int i3, int i4) {
        try {
            if (qp) {
                iy.J0(-2475363636159409960L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SelectedRegion selectedRegion = null;
            if (i2 == i4) {
                if (i4 == this.startLine && i < this.startColumn) {
                    selectedRegion = new SelectedRegion(this);
                    this.startColumn = Math.max(i, this.startColumn - ((i3 - i) + 1));
                }
            } else if ((this.startLine == i2 && i < this.startColumn) || ((this.startLine > i2 && this.startLine < i4) || (this.startLine == i4 && this.startColumn < i3))) {
                selectedRegion = new SelectedRegion(this);
                this.startColumn = i;
                this.startLine = i2;
            } else if (this.startLine == i4) {
                selectedRegion = new SelectedRegion(this);
                this.startColumn = ((this.startColumn + i) - i3) - 1;
            } else if (this.startLine > i4) {
                selectedRegion = new SelectedRegion(this);
                this.startLine -= i4 - i2;
            }
            if (i2 == i4) {
                if (i4 == this.endLine && i < this.endColumn) {
                    if (selectedRegion == null) {
                        selectedRegion = new SelectedRegion(this);
                    }
                    this.endColumn = Math.max(i, this.endColumn - ((i3 - i) + 1));
                }
            } else if ((this.endLine == i2 && i < this.endColumn) || ((this.endLine > i2 && this.endLine < i4) || (this.endLine == i4 && this.endColumn < i3))) {
                if (selectedRegion == null) {
                    selectedRegion = new SelectedRegion(this);
                }
                this.endColumn = i;
                this.endLine = i2;
            } else if (this.endLine == i4) {
                if (selectedRegion == null) {
                    selectedRegion = new SelectedRegion(this);
                }
                this.endColumn = ((this.endColumn + i) - i3) - 1;
            } else if (this.endLine > i4) {
                if (selectedRegion == null) {
                    selectedRegion = new SelectedRegion(this);
                }
                this.endLine -= i4 - i2;
            }
            return selectedRegion;
        } catch (Throwable th) {
            if (k2) {
                iy.a8(th, -2475363636159409960L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -581442055333236880L)
    public SelectedRegion(int i, int i2, int i3, int i4) {
        try {
            if (qp) {
                iy.J0(-3113598689316205856L, null, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.startLine = i;
            this.startColumn = i2;
            this.endLine = i3;
            this.endColumn = i4;
        } catch (Throwable th) {
            if (k2) {
                iy.a8(th, -3113598689316205856L, null, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }
}
