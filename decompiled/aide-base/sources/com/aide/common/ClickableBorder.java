package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;

@cy(clazz = 1009115569069974369L, container = 1009115569069974369L, user = true)
/* loaded from: classes.dex */
public class ClickableBorder extends LinearLayout {

    @fy
    private static /* synthetic */ boolean k2;

    @gy
    private static /* synthetic */ boolean zh;

    @dy(field = -3268455842325784176L)
    private Paint WB;

    @dy(field = -838998675012019655L)
    private boolean fY;

    @dy(field = 2239703020048878873L)
    private float jw;

    @dy(field = 3557391884467472400L)
    private Paint mb;

    @dy(field = 2502709895803738851L)
    private boolean qp;

    @cy(clazz = 4951388855041023672L, container = 1009115569069974369L, user = true)
    class a implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -183251465291173545L)
        a() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -173320673456787885L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-474995112858186816L, this, view);
                }
                ClickableBorder.this.Hw();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -474995112858186816L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4951476194642365813L, container = 1009115569069974369L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -224362958371554800L)
        b() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1761068182524048525L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1222688143799863455L, this);
                }
                if (ClickableBorder.this.fY) {
                    ClickableBorder.this.fY = false;
                    ClickableBorder.this.v5();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1222688143799863455L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ClickableBorder.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 3206848416665325840L)
    public ClickableBorder(Context context, View view) {
        super(context);
        try {
            if (k2) {
                iy.EQ(-3978720971917722628L, null, context, view);
            }
            this.qp = true;
            if (view != null) {
                addView(view, new LinearLayout.LayoutParams(-1, -1));
            }
            setWillNotDraw(false);
            setClipChildren(false);
            setEnabled(true);
            setFocusable(true);
            setOnClickListener(new a());
            Paint paint = new Paint();
            this.WB = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.WB.setColor(-5592406);
            this.WB.setStrokeWidth(1.0f);
            this.WB.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
            Paint paint2 = new Paint();
            this.mb = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.mb.setColor(-13388315);
            this.mb.setStrokeWidth(getResources().getDisplayMetrics().density * 6.0f);
            this.jw = getResources().getDisplayMetrics().density * 2.0f;
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, -3978720971917722628L, null, context, view);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -80030152899912791L)
    public void v5() {
        try {
            if (k2) {
                iy.gn(2070346168301311611L, this);
            }
            invalidate(-10, -10, getWidth() + 10, getHeight() + 10);
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 2070346168301311611L, this);
            }
            throw th;
        }
    }

    @ey(method = 2050566322915344072L)
    protected void Hw() {
        try {
            if (k2) {
                iy.gn(211254612467715664L, this);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 211254612467715664L, this);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -1731741972083717415L)
    public View focusSearch(int i) {
        try {
            if (k2) {
                iy.u7(2196498643431194143L, this, i);
            }
            if (i == 130) {
                if (getChildCount() > 0 && (getChildAt(0) instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) getChildAt(0);
                    if (viewGroup.getChildCount() > 0 && (viewGroup.getChildAt(0) instanceof ClickableBorder)) {
                        return viewGroup.getChildAt(0);
                    }
                }
            } else if (i == 33 && (getParent().getParent() instanceof ClickableBorder)) {
                ViewGroup viewGroup2 = (ViewGroup) getParent().getParent();
                if (((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0) == this) {
                    return viewGroup2;
                }
            }
            return super.focusSearch(i);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 2196498643431194143L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    @ey(method = -224902165668309216L)
    protected void onDraw(Canvas canvas) {
        try {
            if (k2) {
                iy.tp(-33554994788841888L, this, canvas);
            }
            super.onDraw(canvas);
            if (this.qp) {
                if (!this.fY && !isFocused()) {
                    canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth() - 1, getHeight() - 1), this.jw, this.jw, this.WB);
                    return;
                }
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth() - 1, getHeight() - 1), this.jw, this.jw, this.mb);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -33554994788841888L, this, canvas);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 794386187632089556L)
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            if (k2) {
                iy.we(957929081249098440L, this, new Boolean(z), new Integer(i), rect);
            }
            super.onFocusChanged(z, i, rect);
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        } catch (Throwable th) {
            if (zh) {
                iy.U2(th, 957929081249098440L, this, new Boolean(z), new Integer(i), rect);
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    @ey(method = 494725862908422712L)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (k2) {
                iy.tp(7062133595128325356L, this, motionEvent);
            }
            View childAt = getChildAt(0);
            if (childAt instanceof ViewGroup) {
                return childAt instanceof AdapterView;
            }
            return true;
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 7062133595128325356L, this, motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -2011559845858682848L)
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (k2) {
                iy.tp(2127159939489541760L, this, motionEvent);
            }
            if (isEnabled()) {
                if (motionEvent.getAction() == 0) {
                    this.fY = true;
                    v5();
                    postDelayed(new b(), 1000L);
                }
                if (motionEvent.getAction() == 1 && this.fY) {
                    this.fY = false;
                    v5();
                }
            }
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 2127159939489541760L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = 299913814835599291L)
    public void setIsVisible(boolean z) {
        try {
            if (k2) {
                iy.Ws(2502057039925426905L, this, z);
            }
            this.qp = z;
            invalidate();
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 2502057039925426905L, this, new Boolean(z));
            }
            throw th;
        }
    }
}
