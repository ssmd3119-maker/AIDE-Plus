package com.aide.ui.views;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.aide.common.AndroidHelper;

@cy(clazz = 786228931312646151L, container = 786228931312646151L, user = true)
/* loaded from: classes.dex */
public class SplitView extends ViewGroup {

    @fy
    private static /* synthetic */ boolean $ON_ENTER_TOGGLE;

    @gy
    private static /* synthetic */ boolean $ON_THROW_TOGGLE;

    @dy(field = 305945481744851643L)
    private int animationPosition;

    @dy(field = -2220986906469670848L)
    private float dividerSpeed;

    @dy(field = 4376198832526380827L)
    private int dividerTouchSize;

    @dy(field = -2458900430770018197L)
    private int dragPosition;

    @dy(field = 6275994694731359941L)
    private float horizontalSplitRatio;

    @dy(field = -193356825386921805L)
    private boolean isDragging;

    @dy(field = 2965806935283339056L)
    private boolean isHorizontal;

    @dy(field = 1123020794462061216L)
    private boolean isSplit;

    @dy(field = -5477289533579244069L)
    private boolean isSwipeEnabled;

    @dy(field = 1306040584426626732L)
    private OnSplitChangeListener listener;

    @dy(field = -371747001152055781L)
    private float verticalSplitRatio;

    @cy(clazz = -7441840995916439816L, container = -7441840995916439816L, user = true)
    public interface OnSplitChangeListener {
        @ey(method = -4405051816229758980L)
        void j6(boolean z);
    }

    @cy(clazz = 5732171316550764988L, container = 786228931312646151L, user = true)
    class a extends AnimatorListenerAdapter {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @cy(clazz = -4332419942084826417L, container = 786228931312646151L, user = true)
        /* renamed from: com.aide.ui.views.SplitView$a$a, reason: collision with other inner class name */
        class RunnableC0097a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(RunnableC0097a.class);
            }

            @ey(method = 182562633559125117L)
            RunnableC0097a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 497031124202852932L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(1575529387595675208L, this);
                    }
                    if (SplitView.this.listener != null) {
                        SplitView.this.listener.j6(SplitView.this.isSplit);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 1575529387595675208L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -63356229370120995L)
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        @ey(method = -4667583895997088085L)
        public void onAnimationEnd(Animator animator) {
            try {
                if (DW) {
                    iy.tp(2834547301221155835L, this, animator);
                }
                SplitView.this.animationPosition = -1;
                SplitView.this.postDelayed(new RunnableC0097a(), 50L);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 2834547301221155835L, this, animator);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5732301071884813023L, container = 786228931312646151L, user = true)
    class b extends AnimatorListenerAdapter {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 6461842635937364640L)
        final /* synthetic */ Runnable j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 169013414260532424L)
        b(Runnable runnable) {
            this.j6 = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        @ey(method = 3731465117122560333L)
        public void onAnimationEnd(Animator animator) {
            try {
                if (FH) {
                    iy.tp(-2777247055128298063L, this, animator);
                }
                SplitView.this.isSplit = false;
                SplitView.this.updateChildVisibilities();
                if (SplitView.this.listener != null) {
                    SplitView.this.listener.j6(SplitView.this.isSplit);
                }
                if (this.j6 != null) {
                    this.j6.run();
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -2777247055128298063L, this, animator);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5732430827222924352L, container = 786228931312646151L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -474051457541855100L)
        final /* synthetic */ boolean WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 8232864211741918035L)
        c(boolean z) {
            this.WB = z;
        }

        @Override // java.lang.Runnable
        @ey(method = 2167800954766248385L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-738479633260704200L, this);
                }
                SplitView.this.openSplit(this.WB, true);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -738479633260704200L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(SplitView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 163700602726473956L)
    public SplitView(Context context) {
        super(context);
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-925898668235461107L, null, context);
            }
            this.horizontalSplitRatio = 0.33f;
            this.verticalSplitRatio = 0.5f;
            this.dividerTouchSize = 30;
            this.dividerSpeed = 1.0f;
            this.isSplit = false;
            this.isHorizontal = false;
            this.isSwipeEnabled = false;
            this.isDragging = false;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -925898668235461107L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 987808508495265381L)
    private long getAnimationDuration(int i, int i2) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(128590937060478525L, this, new Integer(i), new Integer(i2));
            }
            return (long) ((Math.abs(i - i2) / getResources().getDisplayMetrics().density) / this.dividerSpeed);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, 128590937060478525L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -140033884680318960L)
    private int getCurrentDividerPosition(int i, int i2) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-2808768746050506200L, this, new Integer(i), new Integer(i2));
            }
            return this.isDragging ? getDragPosition() : this.animationPosition < 0 ? getDividerPosition(i, i2) : this.animationPosition;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -2808768746050506200L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4219343850436738947L)
    private int getDividerPosition() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(6295251823001664303L, this);
            }
            return getDividerPosition(getWidth(), getHeight());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 6295251823001664303L, this);
            }
            throw th;
        }
    }

    @ey(method = 4185842995686126528L)
    private int getDragDistance() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-2558393295404739768L, this);
            }
            return this.isSplit ? getDividerPosition() - getDragPosition() : getDragPosition();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -2558393295404739768L, this);
            }
            throw th;
        }
    }

    @ey(method = -4388231017573430796L)
    private int getDragPosition() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(894821514458755392L, this);
            }
            if (this.isDragging) {
                return Math.min(this.dragPosition, getDividerPosition());
            }
            if (this.isSplit) {
                return getDividerPosition();
            }
            return 0;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 894821514458755392L, this);
            }
            throw th;
        }
    }

    @ey(method = -320713910353111059L)
    private Boolean getDragStartOrientation(MotionEvent motionEvent) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(185548597573864433L, this, motionEvent);
            }
            if (this.isSwipeEnabled && !this.isSplit && motionEvent.getAction() == 0 && motionEvent.getPointerCount() == 1 && motionEvent.getX() < this.dividerTouchSize * getResources().getDisplayMetrics().density && splitHorizontalByDefault()) {
                return Boolean.TRUE;
            }
            if (this.isSwipeEnabled && this.isSplit && this.isHorizontal && motionEvent.getAction() == 0 && motionEvent.getPointerCount() == 1 && motionEvent.getY() > getResources().getDisplayMetrics().density * 50.0f && motionEvent.getY() < getHeight() - (getResources().getDisplayMetrics().density * 50.0f) && Math.abs(motionEvent.getX() - (getWidth() * this.horizontalSplitRatio)) < this.dividerTouchSize * getResources().getDisplayMetrics().density) {
                return Boolean.TRUE;
            }
            if (this.isSwipeEnabled && !this.isSplit && motionEvent.getAction() == 0 && motionEvent.getPointerCount() == 1 && motionEvent.getY() > getHeight() - (this.dividerTouchSize * getResources().getDisplayMetrics().density) && getHeight() > getResources().getDisplayMetrics().density * 150.0f) {
                return Boolean.FALSE;
            }
            if (!this.isSwipeEnabled || !this.isSplit || this.isHorizontal || motionEvent.getAction() != 0 || motionEvent.getPointerCount() != 1 || motionEvent.getX() >= getWidth() - (getResources().getDisplayMetrics().density * 50.0f) || motionEvent.getX() <= getResources().getDisplayMetrics().density * 50.0f || Math.abs(motionEvent.getY() - (getHeight() * this.verticalSplitRatio)) >= this.dividerTouchSize * getResources().getDisplayMetrics().density) {
                return null;
            }
            return Boolean.FALSE;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 185548597573864433L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = 2712575223900577881L)
    private boolean isVertical() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-2334371885580039855L, this);
            }
            return !isHorizontal();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -2334371885580039855L, this);
            }
            throw th;
        }
    }

    @ey(method = 20996127316406067L)
    private void setOrientation(boolean z, boolean z2) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-1108527125298237265L, this, new Boolean(z), new Boolean(z2));
            }
            if (this.isHorizontal != z) {
                if (z2 && this.isSplit) {
                    closeSplit(true, new c(z));
                    return;
                }
                this.isHorizontal = z;
                requestLayout();
                if (this.listener != null) {
                    this.listener.j6(this.isSplit);
                }
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -1108527125298237265L, this, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 59528643349521097L)
    private void startDragging(MotionEvent motionEvent, boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-2940602194762988511L, this, motionEvent, new Boolean(z));
            }
            this.isHorizontal = z;
            this.isDragging = true;
            updateDragging(motionEvent);
            updateChildVisibilities();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -2940602194762988511L, this, motionEvent, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 62443640925067936L)
    private void stopDragging(MotionEvent motionEvent) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(2117892044483915360L, this, motionEvent);
            }
            if (this.isSplit == (((float) getDragDistance()) > ((float) (this.dividerTouchSize * 2)) * getResources().getDisplayMetrics().density)) {
                closeSplit(true);
            } else {
                openSplit(true);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2117892044483915360L, this, motionEvent);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 683790646653810332L)
    public void updateChildVisibilities() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-2097690489952031744L, this);
            }
            getBottomView().setVisibility((this.isSplit || this.isDragging) ? 0 : 8);
            getSeparatorView().setVisibility((this.isSplit || this.isDragging) ? 0 : 8);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -2097690489952031744L, this);
            }
            throw th;
        }
    }

    @ey(method = 3333066494597236835L)
    private void updateDragging(MotionEvent motionEvent) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-2804852302916838417L, this, motionEvent);
            }
            this.dragPosition = (int) (this.isHorizontal ? motionEvent.getX() : getHeight() - motionEvent.getY());
            requestLayout();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -2804852302916838417L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = -2381534891843495040L)
    public void closeSplit(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(968042982553192624L, this, z);
            }
            closeSplit(z, null);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 968042982553192624L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -642955514937731687L)
    public View getBottomView() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(3029476977813278245L, this);
            }
            return getChildAt(2);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 3029476977813278245L, this);
            }
            throw th;
        }
    }

    @ey(method = 2789002013931635931L)
    public View getSeparatorView() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-5047942160362723881L, this);
            }
            return getChildAt(1);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -5047942160362723881L, this);
            }
            throw th;
        }
    }

    @ey(method = -3575717506630563651L)
    public View getTopView() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(3608116232558045L, this);
            }
            return getChildAt(0);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 3608116232558045L, this);
            }
            throw th;
        }
    }

    @ey(method = -2846282870190851245L)
    public boolean isHorizontal() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(2587155244619108495L, this);
            }
            return this.isHorizontal;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 2587155244619108495L, this);
            }
            throw th;
        }
    }

    @ey(method = -1870698770610914005L)
    public boolean isSplit() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(2883988019731561075L, this);
            }
            return this.isSplit;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 2883988019731561075L, this);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 1942620603747824000L)
    protected void onFinishInflate() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-4557718513056722196L, this);
            }
            super.onFinishInflate();
            updateChildVisibilities();
            this.isHorizontal = splitHorizontalByDefault();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -4557718513056722196L, this);
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    @ey(method = 276105453155317863L)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(649268344929859375L, this, motionEvent);
            }
            if (getDragStartOrientation(motionEvent) != null) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 649268344929859375L, this, motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @ey(method = -21662492513362371L)
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.J8(5593874413716271585L, this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            View topView = getTopView();
            View bottomView = getBottomView();
            View separatorView = getSeparatorView();
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (bottomView.getVisibility() == 8) {
                topView.layout(0, 0, i5, i6);
                return;
            }
            if (this.isHorizontal) {
                int measuredWidth = bottomView.getMeasuredWidth();
                int measuredWidth2 = separatorView.getMeasuredWidth() + measuredWidth;
                topView.layout(measuredWidth2, 0, i5, i6);
                separatorView.layout(measuredWidth, 0, measuredWidth2, i6);
                bottomView.layout(0, 0, measuredWidth, i6);
                return;
            }
            int measuredHeight = topView.getMeasuredHeight();
            int measuredHeight2 = separatorView.getMeasuredHeight();
            topView.layout(0, 0, i5, measuredHeight);
            int i7 = measuredHeight2 + measuredHeight;
            separatorView.layout(0, measuredHeight, i5, i7);
            bottomView.layout(0, i7, i5, i6);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.lg(th, 5593874413716271585L, this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -186701376388399184L)
    protected void onMeasure(int i, int i2) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-671097678420622040L, this, new Integer(i), new Integer(i2));
            }
            View topView = getTopView();
            View bottomView = getBottomView();
            View separatorView = getSeparatorView();
            View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            View.MeasureSpec.getMode(i);
            int size2 = View.MeasureSpec.getSize(i);
            if (bottomView.getVisibility() == 8) {
                topView.measure(i, i2);
            } else if (this.isHorizontal) {
                bottomView.measure(View.MeasureSpec.makeMeasureSpec(getCurrentDividerPosition(size2, size), 1073741824), i2);
                topView.measure(View.MeasureSpec.makeMeasureSpec(size2 - bottomView.getMeasuredWidth(), 1073741824), i2);
                separatorView.measure(-2, i2);
            } else {
                bottomView.measure(i, View.MeasureSpec.makeMeasureSpec(getCurrentDividerPosition(size2, size), 1073741824));
                topView.measure(i, View.MeasureSpec.makeMeasureSpec(size - bottomView.getMeasuredHeight(), 1073741824));
                separatorView.measure(i, -2);
            }
            setMeasuredDimension(size2, size);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -671097678420622040L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 2651246011277822161L)
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-840158422541240879L, this, motionEvent);
            }
            Boolean dragStartOrientation = getDragStartOrientation(motionEvent);
            if (dragStartOrientation != null) {
                startDragging(motionEvent, dragStartOrientation.booleanValue());
                return true;
            }
            if (!this.isDragging) {
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 2) {
                updateDragging(motionEvent);
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                stopDragging(motionEvent);
            }
            return true;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -840158422541240879L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = -1079946772150698240L)
    public void openSplit(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(358859342192411260L, this, z);
            }
            openSplit(this.isHorizontal, z);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 358859342192411260L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 333832417433422243L)
    public void setAnimationPosition(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(2570423811308575491L, this, i);
            }
            this.animationPosition = i;
            requestLayout();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2570423811308575491L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1553163190409137824L)
    public void setOnSplitChangeListener(OnSplitChangeListener onSplitChangeListener) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(917475200364158936L, this, onSplitChangeListener);
            }
            this.listener = onSplitChangeListener;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 917475200364158936L, this, onSplitChangeListener);
            }
            throw th;
        }
    }

    @ey(method = 1305585270480455093L)
    public void setSwipeEnabled(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(2189167081104311109L, this, z);
            }
            this.isSwipeEnabled = z;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2189167081104311109L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -848274205684272483L)
    public boolean splitHorizontalByDefault() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(38948533111501629L, this);
            }
            return AndroidHelper.u7(getContext()) >= 650.0f;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 38948533111501629L, this);
            }
            throw th;
        }
    }

    @ey(method = -1289467701661104872L)
    public void toggleSplit(Runnable runnable) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(1919999326490340728L, this, runnable);
            }
            if (isSplit() && isVertical()) {
                closeSplit(true, runnable);
            } else if (isSplit() && isHorizontal()) {
                setOrientation(false, true);
            } else {
                openSplit(splitHorizontalByDefault(), true);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 1919999326490340728L, this, runnable);
            }
            throw th;
        }
    }

    @ey(method = 284855949205714341L)
    private int getDividerPosition(int i, int i2) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-75201145323663275L, this, new Integer(i), new Integer(i2));
            }
            return this.isHorizontal ? (int) (this.horizontalSplitRatio * i) : (int) (this.verticalSplitRatio * i2);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -75201145323663275L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2605912877066793741L)
    public void closeSplit(boolean z, Runnable runnable) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(2445538997323889139L, this, new Boolean(z), runnable);
            }
            if (z) {
                if (this.isSplit || this.isDragging) {
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "animationPosition", getDragPosition(), 0);
                    objectAnimatorOfInt.setDuration(getAnimationDuration(getDragPosition(), 0));
                    objectAnimatorOfInt.start();
                    objectAnimatorOfInt.addListener(new b(runnable));
                }
            } else if (this.isSplit) {
                this.isSplit = false;
                updateChildVisibilities();
                if (this.listener != null) {
                    this.listener.j6(this.isSplit);
                }
            }
            this.isDragging = false;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, 2445538997323889139L, this, new Boolean(z), runnable);
            }
            throw th;
        }
    }

    @ey(method = 1702312692845994207L)
    public void openSplit(boolean z, boolean z2) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(210353214876976479L, this, new Boolean(z), new Boolean(z2));
            }
            this.isHorizontal = z;
            if (z2) {
                if (!this.isSplit || this.isDragging) {
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "animationPosition", getDragPosition(), getDividerPosition());
                    objectAnimatorOfInt.setDuration(getAnimationDuration(getDragPosition(), getDividerPosition()));
                    objectAnimatorOfInt.start();
                    objectAnimatorOfInt.addListener(new a());
                    this.isSplit = true;
                    updateChildVisibilities();
                }
            } else if (!this.isSplit) {
                this.isSplit = true;
                this.animationPosition = -1;
                updateChildVisibilities();
                if (this.listener != null) {
                    this.listener.j6(this.isSplit);
                }
            }
            this.isDragging = false;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, 210353214876976479L, this, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 5339179473640172877L)
    public SplitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-163071011633314080L, null, context, attributeSet);
            }
            this.horizontalSplitRatio = 0.33f;
            this.verticalSplitRatio = 0.5f;
            this.dividerTouchSize = 30;
            this.dividerSpeed = 1.0f;
            this.isSplit = false;
            this.isHorizontal = false;
            this.isSwipeEnabled = false;
            this.isDragging = false;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -163071011633314080L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -713207606263632184L)
    public SplitView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.we(-873886956513167781L, null, context, attributeSet, new Integer(i));
            }
            this.horizontalSplitRatio = 0.33f;
            this.verticalSplitRatio = 0.5f;
            this.dividerTouchSize = 30;
            this.dividerSpeed = 1.0f;
            this.isSplit = false;
            this.isHorizontal = false;
            this.isSwipeEnabled = false;
            this.isDragging = false;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.U2(th, -873886956513167781L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
