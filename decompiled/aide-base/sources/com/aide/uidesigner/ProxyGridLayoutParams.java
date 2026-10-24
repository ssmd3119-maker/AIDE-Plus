package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.widget.GridLayout;
import java.lang.reflect.Field;

@cy(clazz = -2193318701393846241L, container = -2193318701393846241L, user = true)
/* loaded from: classes.dex */
public class ProxyGridLayoutParams {

    @fy
    private static /* synthetic */ boolean $ON_ENTER_TOGGLE;

    @gy
    private static /* synthetic */ boolean $ON_THROW_TOGGLE;

    @dy(field = -640223411509054965L)
    private int column;

    @dy(field = -2671813512724193285L)
    private int columnSpan;

    @dy(field = 1056228196367979055L)
    private int gravity;

    @dy(field = 3259080872989361193L)
    private GridLayout.LayoutParams params;

    @dy(field = -2045049457975934011L)
    private int row;

    @dy(field = 934012362398310305L)
    private int rowSpan;

    static {
        iy.Zo(ProxyGridLayoutParams.class);
    }

    @ey(method = 364621802343618693L)
    public ProxyGridLayoutParams(Object obj) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-987499445710607329L, null, obj);
            }
            this.column = 0;
            this.row = 0;
            this.columnSpan = 1;
            this.rowSpan = 1;
            this.gravity = 0;
            this.params = (GridLayout.LayoutParams) obj;
            updateSpecs();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -987499445710607329L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = -2955670765779420141L)
    private static GridLayout.Alignment getAlignment(int i, boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-4201092629835051187L, null, new Integer(i), new Boolean(z));
            }
            int i2 = ((z ? 7 : 112) & i) >> (z ? 0 : 4);
            if (i2 == 1) {
                return GridLayout.CENTER;
            }
            if (i2 == 3) {
                return z ? GridLayout.LEFT : GridLayout.TOP;
            }
            if (i2 == 5) {
                return z ? GridLayout.RIGHT : GridLayout.BOTTOM;
            }
            if (i2 == 7) {
                return GridLayout.FILL;
            }
            try {
                Field declaredField = GridLayout.class.getDeclaredField("UNDEFINED_ALIGNMENT");
                declaredField.setAccessible(true);
                return (GridLayout.Alignment) declaredField.get(null);
            } catch (Throwable unused) {
                return GridLayout.CENTER;
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -4201092629835051187L, null, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3049136925501491865L)
    private void updateSpecs() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(2587538496136358523L, this);
            }
            this.params.columnSpec = GridLayout.spec(this.column, this.columnSpan, getAlignment(this.gravity, true));
            this.params.rowSpec = GridLayout.spec(this.row, this.rowSpan, getAlignment(this.gravity, false));
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 2587538496136358523L, this);
            }
            throw th;
        }
    }

    @ey(method = -432516008417289617L)
    public void setColumn(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-541604021149905175L, this, i);
            }
            this.column = i;
            updateSpecs();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -541604021149905175L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3321173645116647045L)
    public void setColumnSpan(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(215497799183866665L, this, i);
            }
            this.columnSpan = i;
            updateSpecs();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 215497799183866665L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 555291821473890637L)
    public void setGravity(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-2292289876693872069L, this, i);
            }
            this.gravity = i;
            updateSpecs();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -2292289876693872069L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -62004430307197593L)
    public void setRow(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-45032572400686827L, this, i);
            }
            this.row = i;
            updateSpecs();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -45032572400686827L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -257582662893516877L)
    public void setRowSpan(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(1723409251806024133L, this, i);
            }
            this.rowSpan = i;
            updateSpecs();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 1723409251806024133L, this, new Integer(i));
            }
            throw th;
        }
    }
}
