package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -3083238532034305587L, container = -3083238532034305587L, user = true)
/* loaded from: classes.dex */
public abstract class ListAdapterBase<T> extends BaseAdapter {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 3180481086576429344L)
    private List<T> j6;

    static {
        iy.Zo(ListAdapterBase.class);
    }

    @ey(method = 2425257229587033525L)
    public ListAdapterBase() {
        try {
            if (DW) {
                iy.gn(110292199891660189L, null);
            }
            this.j6 = new ArrayList();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 110292199891660189L, null);
            }
            throw th;
        }
    }

    @ey(method = 1273381173310876281L)
    public void DW(List<T> list) {
        try {
            if (DW) {
                iy.tp(1012674603829350507L, this, list);
            }
            this.j6 = list;
            notifyDataSetChanged();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 1012674603829350507L, this, list);
            }
            throw th;
        }
    }

    @Override // android.widget.Adapter
    @ey(method = 2333051229680260176L)
    public int getCount() {
        try {
            if (DW) {
                iy.gn(3357068759467736896L, this);
            }
            return this.j6.size();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 3357068759467736896L, this);
            }
            throw th;
        }
    }

    @Override // android.widget.Adapter
    @ey(method = -192266248941842463L)
    public Object getItem(int i) {
        try {
            if (DW) {
                iy.u7(231045427725003927L, this, i);
            }
            return this.j6.get(i);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 231045427725003927L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.widget.Adapter
    @ey(method = -4232939335942240L)
    public long getItemId(int i) {
        try {
            if (DW) {
                iy.u7(98067406383910656L, this, i);
            }
            return i;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 98067406383910656L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1298583380350206720L)
    public T j6(int i) {
        try {
            if (DW) {
                iy.u7(-275818735594604896L, this, i);
            }
            return this.j6.get(i);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -275818735594604896L, this, new Integer(i));
            }
            throw th;
        }
    }
}
