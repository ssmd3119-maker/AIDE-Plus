package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.view.ViewGroup;

@cy(clazz = -4357380200993762145L, container = -4357380200993762145L, user = true)
/* loaded from: classes.dex */
public class ProxyMarginLayoutParams {

    @fy
    private static /* synthetic */ boolean $ON_ENTER_TOGGLE;

    @gy
    private static /* synthetic */ boolean $ON_THROW_TOGGLE;

    @dy(field = 1286728673468488320L)
    private ViewGroup.MarginLayoutParams params;

    static {
        iy.Zo(ProxyMarginLayoutParams.class);
    }

    @ey(method = -464793065096844576L)
    public ProxyMarginLayoutParams(Object obj) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(2088598866734157688L, null, obj);
            }
            this.params = (ViewGroup.MarginLayoutParams) obj;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2088598866734157688L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = -613168210315157280L)
    public void setMargin(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-1042662775487324376L, this, i);
            }
            this.params.setMargins(i, i, i, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1042662775487324376L, this, new Integer(i));
            }
            throw th;
        }
    }
}
