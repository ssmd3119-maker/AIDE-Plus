package com.aide.ui.browsers;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.aide.ui.debugger.DebugView;

@cy(clazz = -7952777071481453884L, container = -7952777071481453884L, user = true)
/* loaded from: classes.dex */
public class DebugBrowser extends LinearLayout implements a {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = 2542993726183447776L)
    private DebugView WB;

    static {
        iy.Zo(DebugBrowser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -2848893051204865040L)
    public DebugBrowser(Context context) {
        super(context);
        try {
            if (mb) {
                iy.tp(-3281695828500395712L, null, context);
            }
            j6();
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -3281695828500395712L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -1907980205095799575L)
    private void j6() {
        try {
            if (mb) {
                iy.gn(-2616171380868274944L, this);
            }
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            removeAllViews();
            DebugView debugView = new DebugView(getContext());
            this.WB = debugView;
            addView(debugView);
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -2616171380868274944L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = -826766099548039719L)
    public void DW() {
        try {
            if (mb) {
                iy.gn(-766701334913309432L, this);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -766701334913309432L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = 564818038797579125L)
    public void FH() {
        try {
            if (mb) {
                iy.gn(1069153245918441360L, this);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 1069153245918441360L, this);
            }
            throw th;
        }
    }

    @ey(method = -3967613506362259725L)
    public void Hw() {
        try {
            if (mb) {
                iy.gn(2940359921276748300L, this);
            }
            this.WB.Hw();
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 2940359921276748300L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1893150544323116745L)
    public DebugBrowser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (mb) {
                iy.EQ(-1696557347334413025L, null, context, attributeSet);
            }
            j6();
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -1696557347334413025L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
