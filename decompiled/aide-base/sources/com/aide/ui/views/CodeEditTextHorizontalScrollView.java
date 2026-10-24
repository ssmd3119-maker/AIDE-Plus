package com.aide.ui.views;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.aide.common.AndroidHelper;
import com.aide.ui.views.CodeEditText;

@cy(clazz = -8164521817361244632L, container = -8164521817361244632L, user = true)
/* loaded from: classes.dex */
public class CodeEditTextHorizontalScrollView extends HorizontalScrollView {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(CodeEditTextHorizontalScrollView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 90644536084156525L)
    public CodeEditTextHorizontalScrollView(Context context) {
        super(context);
        try {
            if (WB) {
                iy.tp(6631163012730800L, null, context);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 6631163012730800L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 5054977137828344048L)
    private CodeEditText getCodeEditText() {
        try {
            if (WB) {
                iy.gn(4496740854563429037L, this);
            }
            return (CodeEditText) ((ViewGroup) getChildAt(0)).getChildAt(1);
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 4496740854563429037L, this);
            }
            throw th;
        }
    }

    @ey(method = 1364202018321524325L)
    private CodeEditText.EditorView getOEditorView() {
        try {
            if (WB) {
                iy.gn(-552012128676527772L, this);
            }
            return getCodeEditText().getOEditorView();
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -552012128676527772L, this);
            }
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @ey(method = -4196070719234131200L)
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        try {
            if (WB) {
                iy.tp(-6819913924421339907L, this, motionEvent);
            }
            if ((motionEvent.getSource() & 2) != 0) {
                return false;
            }
            return super.onGenericMotionEvent(motionEvent);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -6819913924421339907L, this, motionEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    @ey(method = -129141659772824400L)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (WB) {
                iy.tp(3996100703127166101L, this, motionEvent);
            }
            if (AndroidHelper.rN(motionEvent)) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 3996100703127166101L, this, motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -436866830920962972L)
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        try {
            if (WB) {
                iy.J0(624635714260995015L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            super.onScrollChanged(i, i2, i3, i4);
            getOEditorView().hp();
        } catch (Throwable th) {
            if (mb) {
                iy.a8(th, 624635714260995015L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @ey(method = -5478141937187299436L)
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            if (WB) {
                iy.J0(-505752839870897265L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            super.onSizeChanged(i, i2, i3, i4);
            getOEditorView().hp();
        } catch (Throwable th) {
            if (mb) {
                iy.a8(th, -505752839870897265L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -615258779152398081L)
    public CodeEditTextHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (WB) {
                iy.we(1024404742485124220L, null, context, attributeSet, new Integer(i));
            }
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, 1024404742485124220L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 43280932092135912L)
    public CodeEditTextHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (WB) {
                iy.EQ(-1040600814500246769L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, -1040600814500246769L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
