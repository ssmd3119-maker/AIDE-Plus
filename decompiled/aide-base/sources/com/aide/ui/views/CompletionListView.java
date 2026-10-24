package com.aide.ui.views;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.aide.common.AndroidHelper;
import com.aide.common.KeyStrokeDetector;

@cy(clazz = 85373884122756255L, container = 85373884122756255L, user = true)
/* loaded from: classes.dex */
public class CompletionListView extends CustomKeysListView {

    @fy
    private static /* synthetic */ boolean k2;

    @gy
    private static /* synthetic */ boolean zh;

    @dy(field = 1982564770279018035L)
    private KeyStrokeDetector fY;

    @dy(field = 2045108703843522643L)
    private KeyStrokeDetector.KeyStrokeHandler qp;

    static {
        iy.Zo(CompletionListView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 435843299789384032L)
    public CompletionListView(Context context) {
        super(context);
        try {
            if (k2) {
                iy.tp(1012263937666637019L, null, context);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 1012263937666637019L, null, context);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -5493365885133144520L)
    public boolean onCheckIsTextEditor() {
        try {
            if (k2) {
                iy.gn(5402945009408630112L, this);
            }
            return this.fY != null;
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 5402945009408630112L, this);
            }
            throw th;
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    @ey(method = -2489011331562294405L)
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        try {
            if (k2) {
                iy.tp(-507097421382997161L, this, editorInfo);
            }
            if (AndroidHelper.a8(getContext())) {
                editorInfo.imeOptions = 1073741825;
                editorInfo.inputType = 131217;
            } else {
                editorInfo.imeOptions = 1073741825;
            }
            return this.fY.createInputConnection(this, this.qp);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -507097421382997161L, this, editorInfo);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CustomKeysListView, android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    @ey(method = 1519159090770809989L)
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (k2) {
                iy.EQ(61320235065127605L, this, new Integer(i), keyEvent);
            }
            return (i == 19 || i == 20 || i == 23 || i == 66 || i == 96 || i == 92 || i == 93 || i == 122 || i == 123) ? j6(i, keyEvent) : super.onKeyDown(i, keyEvent);
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, 61320235065127605L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CustomKeysListView, android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    @ey(method = -318361734549444240L)
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (k2) {
                iy.EQ(3286524981524102004L, this, new Integer(i), keyEvent);
            }
            return (i == 19 || i == 20 || i == 23 || i == 66 || i == 96 || i == 92 || i == 93 || i == 122 || i == 123) ? DW(i, keyEvent) : super.onKeyUp(i, keyEvent);
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, 3286524981524102004L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = 17679614940489640L)
    public void setKeyStrokeDetector(KeyStrokeDetector keyStrokeDetector) {
        try {
            if (k2) {
                iy.tp(-5549793282224567904L, this, keyStrokeDetector);
            }
            this.fY = keyStrokeDetector;
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -5549793282224567904L, this, keyStrokeDetector);
            }
            throw th;
        }
    }

    @ey(method = 26821512193370760L)
    public void setKeyStrokeHandler(KeyStrokeDetector.KeyStrokeHandler keyStrokeHandler) {
        try {
            if (k2) {
                iy.tp(5792652026469602632L, this, keyStrokeHandler);
            }
            this.qp = keyStrokeHandler;
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 5792652026469602632L, this, keyStrokeHandler);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -15839785355223531L)
    public CompletionListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (k2) {
                iy.EQ(-8763854125042118644L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, -8763854125042118644L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -743068168394261112L)
    public CompletionListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (k2) {
                iy.we(-1619114962724624595L, null, context, attributeSet, new Integer(i));
            }
        } catch (Throwable th) {
            if (zh) {
                iy.U2(th, -1619114962724624595L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
