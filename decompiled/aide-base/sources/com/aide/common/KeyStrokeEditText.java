package com.aide.common;

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
import android.widget.EditText;
import com.aide.common.KeyStrokeDetector;

@cy(clazz = -2670818707938442347L, container = -2670818707938442347L, user = true)
/* loaded from: classes.dex */
public class KeyStrokeEditText extends EditText {

    @fy
    private static /* synthetic */ boolean fY;

    @gy
    private static /* synthetic */ boolean qp;

    @dy(field = -3199900292018766867L)
    private KeyStroke WB;

    @dy(field = 388758416480593952L)
    private KeyStrokeDetector.KeyStrokeHandler jw;

    @dy(field = 6443564963460235156L)
    private KeyStrokeDetector mb;

    @cy(clazz = 620407520647363400L, container = -2670818707938442347L, user = true)
    class a implements KeyStrokeDetector.KeyStrokeHandler {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -113154546464496161L)
        a() {
        }

        @Override // com.aide.common.KeyStrokeDetector.KeyStrokeHandler
        @ey(method = -2734340384647146825L)
        public boolean j6(KeyStroke keyStroke) {
            try {
                if (DW) {
                    iy.tp(2255394380938386479L, this, keyStroke);
                }
                KeyStrokeEditText.this.setKeyStroke(keyStroke);
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 2255394380938386479L, this, keyStroke);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(KeyStrokeEditText.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -135711436020604675L)
    public KeyStrokeEditText(Context context) {
        super(context);
        try {
            if (fY) {
                iy.tp(1525777556603888544L, null, context);
            }
            this.jw = new a();
            j6();
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 1525777556603888544L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -1341425219413963196L)
    private void j6() {
        try {
            if (fY) {
                iy.gn(1407998017524319795L, this);
            }
            this.mb = new KeyStrokeDetector(getContext());
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 1407998017524319795L, this);
            }
            throw th;
        }
    }

    @ey(method = 1248138609943424015L)
    public KeyStroke getKeyStroke() {
        try {
            if (fY) {
                iy.gn(-4173086052872262372L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -4173086052872262372L, this);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @ey(method = -6325757924967854029L)
    public boolean onCheckIsTextEditor() {
        try {
            if (!fY) {
                return true;
            }
            iy.gn(6228503499472035280L, this);
            return true;
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 6228503499472035280L, this);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @ey(method = 1867325680275700020L)
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        try {
            if (fY) {
                iy.tp(1329573529808750779L, this, editorInfo);
            }
            if (AndroidHelper.a8(getContext())) {
                editorInfo.imeOptions = 1073741825;
                editorInfo.inputType = 131217;
            } else {
                editorInfo.imeOptions = 1073741825;
            }
            return this.mb.createInputConnection(this, this.jw);
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 1329573529808750779L, this, editorInfo);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    @ey(method = -1659102924283500488L)
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (fY) {
                iy.EQ(356467929665310813L, this, new Integer(i), keyEvent);
            }
            if (this.mb.onKeyDown(i, keyEvent, this.jw)) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, 356467929665310813L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    @ey(method = -216717610606979097L)
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (fY) {
                iy.EQ(-1245967393128813824L, this, new Integer(i), keyEvent);
            }
            if (this.mb.onKeyUp(i, keyEvent, this.jw)) {
                return true;
            }
            return super.onKeyUp(i, keyEvent);
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, -1245967393128813824L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = 637746508449704115L)
    public void setKeyStroke(KeyStroke keyStroke) {
        try {
            if (fY) {
                iy.tp(1349775928786849280L, this, keyStroke);
            }
            this.WB = keyStroke;
            setText(keyStroke.toString());
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 1349775928786849280L, this, keyStroke);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -4160107581096548184L)
    public KeyStrokeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (fY) {
                iy.EQ(8265290387827753827L, null, context, attributeSet);
            }
            this.jw = new a();
            j6();
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, 8265290387827753827L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -214539586208129133L)
    public KeyStrokeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (fY) {
                iy.we(-670950516412742336L, null, context, attributeSet, new Integer(i));
            }
            this.jw = new a();
            j6();
        } catch (Throwable th) {
            if (qp) {
                iy.U2(th, -670950516412742336L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
