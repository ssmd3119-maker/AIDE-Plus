package com.aide.ui.views;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ListView;

@cy(clazz = -285407883451740000L, container = -285407883451740000L, user = true)
/* loaded from: classes.dex */
public class CustomKeysListView extends ListView {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = 1544908190932456740L)
    private OnKeyEventListener WB;

    @cy(clazz = 3317823711126157656L, container = 3317823711126157656L, user = true)
    public interface OnKeyEventListener {
        @ey(method = -443537743742380560L)
        boolean onKeyDown(int i, KeyEvent keyEvent);

        @ey(method = 6955073476216526871L)
        boolean onKeyUp(int i, KeyEvent keyEvent);
    }

    static {
        iy.Zo(CustomKeysListView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 39250702618053388L)
    public CustomKeysListView(Context context) {
        super(context);
        try {
            if (mb) {
                iy.tp(-2429505840056829768L, null, context);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -2429505840056829768L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 3141083957549299296L)
    public boolean DW(int i, KeyEvent keyEvent) {
        try {
            if (mb) {
                iy.EQ(-1464922279717604984L, this, new Integer(i), keyEvent);
            }
            return super.onKeyUp(i, keyEvent);
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -1464922279717604984L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = -5009213870086303961L)
    public boolean j6(int i, KeyEvent keyEvent) {
        try {
            if (mb) {
                iy.EQ(-1292086796923669161L, this, new Integer(i), keyEvent);
            }
            return super.onKeyDown(i, keyEvent);
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -1292086796923669161L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    @ey(method = 381656032063659257L)
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (mb) {
                iy.EQ(-912691128963686363L, this, new Integer(i), keyEvent);
            }
            if (this.WB == null || !this.WB.onKeyDown(i, keyEvent)) {
                return super.onKeyDown(i, keyEvent);
            }
            return true;
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -912691128963686363L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    @ey(method = 109809147435068828L)
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (mb) {
                iy.EQ(8270839950906617280L, this, new Integer(i), keyEvent);
            }
            if (this.WB == null || !this.WB.onKeyUp(i, keyEvent)) {
                return super.onKeyUp(i, keyEvent);
            }
            return true;
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, 8270839950906617280L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @ey(method = 797235652950538416L)
    public boolean requestFocus(int i, Rect rect) {
        try {
            if (mb) {
                iy.EQ(3449932190114844280L, this, new Integer(i), rect);
            }
            if (getFocusedChild() != null) {
                return false;
            }
            return super.requestFocus(i, rect);
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, 3449932190114844280L, this, new Integer(i), rect);
            }
            throw th;
        }
    }

    @ey(method = 139062941324123360L)
    public void setOnKeyEventListener(OnKeyEventListener onKeyEventListener) {
        try {
            if (mb) {
                iy.tp(-377468209336966572L, this, onKeyEventListener);
            }
            this.WB = onKeyEventListener;
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -377468209336966572L, this, onKeyEventListener);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 4377450378235856201L)
    public CustomKeysListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (mb) {
                iy.EQ(399867451615048543L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, 399867451615048543L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1580557330461916296L)
    public CustomKeysListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (mb) {
                iy.we(333633083686443036L, null, context, attributeSet, new Integer(i));
            }
        } catch (Throwable th) {
            if (jw) {
                iy.U2(th, 333633083686443036L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
