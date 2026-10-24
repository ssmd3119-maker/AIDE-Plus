package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.util.Timer;
import java.util.TimerTask;

@cy(clazz = 108167760189617513L, container = 108167760189617513L, user = true)
/* loaded from: classes.dex */
public class Caret {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -808073286918699120L)
    private boolean FH;

    @dy(field = 1358268596901866496L)
    private boolean caretBlinks;

    @dy(field = -1393634085644501664L)
    private Timer caretTimer;

    @dy(field = 1649463631844912792L)
    private OConsole mOConsole;

    @dy(field = -2777933818021222731L)
    private int v5;

    @cy(clazz = 1091102422121593416L, container = 108167760189617513L, user = true)
    class a extends TimerTask {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 1635417434939622789L, container = 108167760189617513L, user = true)
        /* renamed from: com.aide.ui.views.editor.Caret$a$a, reason: collision with other inner class name */
        class RunnableC0098a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(RunnableC0098a.class);
            }

            @ey(method = -7581441113706421689L)
            RunnableC0098a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 672147658939171872L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-932288929788236391L, this);
                    }
                    Caret.this.mOConsole.Bx();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -932288929788236391L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -6795051419715919920L)
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        @ey(method = 2355089538838750640L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-934748103707175580L, this);
                }
                if (Caret.this.caretBlinks) {
                    Caret.this.FH = !Caret.this.FH;
                    Caret.this.mOConsole.post(new RunnableC0098a());
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -934748103707175580L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(Caret.class);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = -646006006769337160L)
    public Caret() {
        this(500);
        try {
            if (Zo) {
                iy.gn(3887315777533480359L, null);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 3887315777533480359L, null);
            }
            throw th;
        }
    }

    @ey(method = -264780036828410455L)
    public void VH(Graphics graphics, float f, float f2, float f3, float f4, boolean z, Color color) {
        try {
            if (Zo) {
                iy.QX(2282581153751480824L, this, new Object[]{graphics, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Boolean(z), color});
            }
            if (this.FH && graphics.m0getClipBounds() != null && !z) {
                Color colorWe = graphics.we();
                graphics.setColor(color);
                graphics.drawRect(f, f2, this.mOConsole.getFontHeight() / 20.0f, f4);
                graphics.setColor(colorWe);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, 2282581153751480824L, this, new Object[]{graphics, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Boolean(z), color});
            }
            throw th;
        }
    }

    @ey(method = -2457099648030637680L)
    public void cancel() {
        try {
            if (Zo) {
                iy.gn(2983281144138703763L, this);
            }
            if (this.caretTimer != null) {
                this.caretTimer.cancel();
                this.caretTimer = null;
            }
            this.FH = false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2983281144138703763L, this);
            }
            throw th;
        }
    }

    @ey(method = -911291759234897655L)
    public void createTimer() {
        try {
            if (Zo) {
                iy.gn(-1570498758634184064L, this);
            }
            cancel();
            this.FH = true;
            Timer timer = new Timer("Caret", true);
            this.caretTimer = timer;
            timer.scheduleAtFixedRate(new a(), 1000L, this.v5);
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1570498758634184064L, this);
            }
            throw th;
        }
    }

    @ey(method = -1474812910699673636L)
    public void setCaretBlinks(boolean z) {
        try {
            if (Zo) {
                iy.Ws(471271574312139995L, this, z);
            }
            this.caretBlinks = z;
            this.FH = true;
            if (this.mOConsole.isShown()) {
                this.mOConsole.Bx();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 471271574312139995L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 388003711075294644L)
    public void setOConsole(OConsole oConsole) {
        try {
            if (Zo) {
                iy.tp(8777876193714367L, this, oConsole);
            }
            this.mOConsole = oConsole;
            createTimer();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 8777876193714367L, this, oConsole);
            }
            throw th;
        }
    }

    @ey(method = 3247075298004196095L)
    public Caret(int i) {
        try {
            if (Zo) {
                iy.u7(333024907548941836L, null, i);
            }
            this.FH = true;
            this.caretBlinks = true;
            this.v5 = i;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 333024907548941836L, null, new Integer(i));
            }
            throw th;
        }
    }
}
