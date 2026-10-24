package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Build;
import android.view.View;

@cy(clazz = 232054640984430660L, container = 232054640984430660L, user = true)
/* loaded from: classes.dex */
public class ProxyViewPaddings {

    @fy
    private static /* synthetic */ boolean $ON_ENTER_TOGGLE;

    @gy
    private static /* synthetic */ boolean $ON_THROW_TOGGLE;

    @dy(field = 1283934071954100160L)
    private int padding;

    @dy(field = 2502059665285126269L)
    private int paddingBottom;

    @dy(field = -941965546655400267L)
    private int paddingEnd;

    @dy(field = -3138892354802734225L)
    private int paddingLeft;

    @dy(field = -3093936463656996900L)
    private int paddingRight;

    @dy(field = -3007477963878563320L)
    private int paddingStart;

    @dy(field = -942836894611569765L)
    private int paddingTop;

    @dy(field = 583791923828363040L)
    private View view;

    static {
        iy.Zo(ProxyViewPaddings.class);
    }

    @ey(method = 119232343853179327L)
    public ProxyViewPaddings(Object obj) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-1541985154764514020L, null, obj);
            }
            this.view = (View) obj;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1541985154764514020L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = -1906919809088034468L)
    private void updatePadding() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(4071297115228859836L, this);
            }
            if (this.padding > 0) {
                this.view.setPadding(this.padding, this.padding, this.padding, this.padding);
                return;
            }
            if (this.paddingStart <= 0 && this.paddingEnd <= 0) {
                if (this.paddingLeft > 0 || this.paddingRight > 0 || this.paddingTop > 0 || this.paddingBottom > 0) {
                    this.view.setPadding(this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom);
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                this.view.setPaddingRelative(this.paddingStart, this.paddingTop, this.paddingEnd, this.paddingBottom);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 4071297115228859836L, this);
            }
            throw th;
        }
    }

    @ey(method = 1585590419183488480L)
    public void setPadding(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-633694578456592928L, this, i);
            }
            this.padding = i;
            updatePadding();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -633694578456592928L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4279360732535106043L)
    public void setPaddingBottom(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(1493921854605055659L, this, i);
            }
            this.paddingBottom = i;
            updatePadding();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 1493921854605055659L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2104963297473766071L)
    public void setPaddingEnd(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(2588808217676287737L, this, i);
            }
            this.paddingEnd = i;
            updatePadding();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2588808217676287737L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4483937289866336991L)
    public void setPaddingLeft(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-2955563154388918191L, this, i);
            }
            this.paddingLeft = i;
            updatePadding();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -2955563154388918191L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1743731056094194440L)
    public void setPaddingRight(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(302511640466470520L, this, i);
            }
            this.paddingRight = i;
            updatePadding();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 302511640466470520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3350458374137764604L)
    public void setPaddingStart(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-977041310190241500L, this, i);
            }
            this.paddingStart = i;
            updatePadding();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -977041310190241500L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1903002579121354515L)
    public void setPaddingTop(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-890816286062971485L, this, i);
            }
            this.paddingTop = i;
            updatePadding();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -890816286062971485L, this, new Integer(i));
            }
            throw th;
        }
    }
}
