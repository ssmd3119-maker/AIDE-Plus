package com.aide.ui.views;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.aide.common.AndroidHelper;
import com.aide.ui.R$drawable;
import com.aide.ui.views.CodeEditText;
import com.aide.ui.views.editor.CaretMoveListener;
import com.aide.ui.views.editor.OConsole;
import com.aide.ui.views.editor.SelectionListener;
import java.util.Timer;
import java.util.TimerTask;

@cy(clazz = 1527178060401062972L, container = 1527178060401062972L, user = true)
/* loaded from: classes.dex */
public class CodeEditTextScrollView extends ScrollView {

    @dy(field = -5718815911987425780L)
    public static boolean Jl;

    @gy
    private static /* synthetic */ boolean eU;

    @fy
    private static /* synthetic */ boolean iW;

    @dy(field = -1126536632939413728L)
    private float AL;

    @dy(field = -3757216875785635533L)
    private boolean Q6;

    @dy(field = -2237586397871407791L)
    private boolean WB;

    @dy(field = 5535668685108142240L)
    private h Z1;

    @dy(field = -1630565038289436457L)
    private DragHandle cT;

    @dy(field = 3154771397394112923L)
    private float fY;

    @dy(field = -4236543069862320656L)
    private DragHandle hK;

    @dy(field = 3154677899818843200L)
    private float jw;

    @dy(field = 3984049447158979440L)
    private int k2;

    @dy(field = 719917415336857836L)
    private boolean kf;

    @dy(field = -3337821642213720061L)
    private float mb;

    @dy(field = -1750841457646237513L)
    private DragHandle[] n5;

    @dy(field = -953685225542512053L)
    private h q7;

    @dy(field = 3983969523138123831L)
    private int qp;

    @dy(field = -2491203527808381405L)
    private DragHandle w9;

    @dy(field = -1126505556916908987L)
    private float zh;

    @cy(clazz = -40137164092015200L, container = -40137164092015200L, user = true)
    private abstract class DragHandle {

        @fy
        private static /* synthetic */ boolean $ON_ENTER_TOGGLE;

        @gy
        private static /* synthetic */ boolean $ON_THROW_TOGGLE;

        @dy(field = -1359861947056505312L)
        private float bounce;

        @dy(field = 3439669473124681105L)
        private float charCenterX;

        @dy(field = 3439767233408710680L)
        private float charCenterY;

        @dy(field = 1606233866677245932L)
        private int dragDX;

        @dy(field = 1606299477946544279L)
        private int dragDY;

        @dy(field = 2551482584256951660L)
        private boolean dragIsActive;

        @dy(field = 3332585760043012893L)
        private int handleCenterX;

        @dy(field = 3332668588817875880L)
        private int handleCenterY;

        @dy(field = 2152081609858569627L)
        private int handleHeight;

        @dy(field = 2030899840882696832L)
        private int handleWidth;

        @dy(field = -2328584050361021211L)
        private Drawable icon;

        @dy(field = -3356544977261619053L)
        private Drawable iconDown;

        @dy(field = 1843574799343933744L)
        private boolean isDown;

        @dy(field = 4057134898442878032L)
        private boolean isVisible;

        @dy(field = 2864909569159359645L)
        private Timer removeTimer;

        @dy(field = -6467797550874201540L)
        private TimerTask removeTimerTask;

        @dy(field = 3271935261946978560L)
        @hy
        final /* synthetic */ CodeEditTextScrollView this$0;

        @dy(field = -503560129396832795L)
        private long timeout;

        @cy(clazz = 701969676214042275L, container = -40137164092015200L, user = true)
        class a extends TimerTask {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @cy(clazz = 774387395373054276L, container = -40137164092015200L, user = true)
            /* renamed from: com.aide.ui.views.CodeEditTextScrollView$DragHandle$a$a, reason: collision with other inner class name */
            class RunnableC0096a implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(RunnableC0096a.class);
                }

                @ey(method = -26480479352749475L)
                RunnableC0096a() {
                }

                @Override // java.lang.Runnable
                @ey(method = 616720526027729960L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-5479020585264629259L, this);
                        }
                        DragHandle.this.dragIsActive = false;
                        DragHandle.this.isVisible = false;
                        DragHandle.this.this$0.invalidate();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -5479020585264629259L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = -4915767461930058136L)
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            @ey(method = -1012806782771515511L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-5480919630671517760L, this);
                    }
                    DragHandle.this.this$0.post(new RunnableC0096a());
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -5480919630671517760L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(DragHandle.class);
        }

        @ey(method = 787525749766714497L)
        public DragHandle(CodeEditTextScrollView codeEditTextScrollView, Drawable drawable, Drawable drawable2, float f, float f2, float f3, float f4, long j) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.QX(3171151906848048956L, null, new Object[]{codeEditTextScrollView, drawable, drawable2, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Long(j)});
                }
                this.this$0 = codeEditTextScrollView;
                this.timeout = j;
                this.removeTimer = new Timer();
                this.icon = drawable;
                this.iconDown = drawable2;
                this.handleHeight = drawable.getIntrinsicHeight();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                this.handleWidth = intrinsicWidth;
                this.handleCenterX = (int) (intrinsicWidth * f);
                this.handleCenterY = (int) (this.handleHeight * f2);
                this.charCenterY = f4;
                this.charCenterX = f3;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.rN(th, 3171151906848048956L, null, new Object[]{codeEditTextScrollView, drawable, drawable2, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Long(j)});
                }
                throw th;
            }
        }

        @ey(method = 5088518968115297395L)
        private Rect getHandleRect(int i, int i2) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.EQ(-1184894233243669440L, this, new Integer(i), new Integer(i2));
                }
                int fontHeight = (int) this.this$0.getOEditorView().getFontHeight();
                int i3 = i2 + fontHeight;
                float f = fontHeight;
                return new Rect(i - this.handleCenterX, (int) ((i3 - this.handleCenterY) - (this.charCenterY * f)), (i - this.handleCenterX) + this.handleWidth, (int) (((i3 + this.handleHeight) - this.handleCenterY) - (this.charCenterY * f)));
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.Mr(th, -1184894233243669440L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -6487434163742256960L)
        private Rect getHandleRectInWindow() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(4822620750613890107L, this);
                }
                CodeEditText.EditorView oEditorView = this.this$0.getOEditorView();
                int iXG = oEditorView.XG(getLine());
                return getHandleRect((int) (oEditorView.jO(getColumn(), iXG) - this.this$0.getHorizontalScrollView().getScrollX()), (int) (oEditorView.Ev(iXG) + this.this$0.getHeaderHeight()));
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, 4822620750613890107L, this);
                }
                throw th;
            }
        }

        @ey(method = -278043912086731284L)
        private int getScrollPaddingBottom() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(6852079172345263541L, this);
                }
                int fontHeight = (int) (this.handleHeight / this.this$0.getOEditorView().getFontHeight());
                if (fontHeight > this.this$0.Mr(true) - 4) {
                    fontHeight = this.this$0.Mr(true) - 4;
                }
                return fontHeight + 2;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, 6852079172345263541L, this);
                }
                throw th;
            }
        }

        @ey(method = -1726108080422185305L)
        private void scheduleRemoveCaretHandle() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(131819675948830044L, this);
                }
                if (this.removeTimer == null) {
                    return;
                }
                if (this.removeTimerTask != null) {
                    this.removeTimerTask.cancel();
                }
                a aVar = new a();
                this.removeTimerTask = aVar;
                this.removeTimer.schedule(aVar, this.timeout);
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, 131819675948830044L, this);
                }
                throw th;
            }
        }

        @ey(method = -5132376812465951040L)
        public void draw(Canvas canvas) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(5989445094908789415L, this, canvas);
                }
                if (this.isVisible) {
                    Rect handleRectInWindow = getHandleRectInWindow();
                    handleRectInWindow.left = (int) (handleRectInWindow.left + this.bounce);
                    handleRectInWindow.right = (int) (handleRectInWindow.right + this.bounce);
                    if (this.isDown) {
                        this.iconDown.setBounds(handleRectInWindow);
                        this.iconDown.draw(canvas);
                    } else {
                        this.icon.setBounds(handleRectInWindow);
                        this.icon.draw(canvas);
                    }
                }
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, 5989445094908789415L, this, canvas);
                }
                throw th;
            }
        }

        @ey(method = 2767970586826502931L)
        protected abstract int getColumn();

        @ey(method = 16711343425992119L)
        protected abstract int getLine();

        @ey(method = -2046274687000955763L)
        public void hide() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(-1234924723072473348L, this);
                }
                if (this.isVisible) {
                    this.isVisible = false;
                    this.this$0.invalidate();
                    if (this.removeTimerTask != null) {
                        this.removeTimerTask.cancel();
                    }
                }
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, -1234924723072473348L, this);
                }
                throw th;
            }
        }

        @ey(method = 1843100419863894924L)
        public boolean isTouchEventInsideHandle(MotionEvent motionEvent) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(576529275846256101L, this, motionEvent);
                }
                if (!this.isVisible) {
                    return false;
                }
                int x = (int) motionEvent.getX(0);
                int y = (int) motionEvent.getY(0);
                CodeEditText.EditorView oEditorView = this.this$0.getOEditorView();
                int iXG = oEditorView.XG(getLine());
                return getHandleRect((int) (oEditorView.jO(getColumn(), iXG) - this.this$0.getHorizontalScrollView().getScrollX()), (int) (oEditorView.Ev(iXG) - this.this$0.getScrollLineY())).contains(x, y);
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, 576529275846256101L, this, motionEvent);
                }
                throw th;
            }
        }

        @ey(method = 344269935127805851L)
        public boolean isVisible() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(1935069331307891220L, this);
                }
                return this.isVisible;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, 1935069331307891220L, this);
                }
                throw th;
            }
        }

        @ey(method = -1587712464000800700L)
        protected abstract void onClick();

        @ey(method = -2261405046464348904L)
        public void onDestroy() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(-126735706075272151L, this);
                }
                if (this.removeTimer == null) {
                    return;
                }
                this.removeTimer.cancel();
                this.removeTimer = null;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, -126735706075272151L, this);
                }
                throw th;
            }
        }

        @ey(method = -546345360099021101L)
        protected abstract void onDraggedTo(int i, int i2);

        @ey(method = -167354218903133531L)
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-6590904509522344112L, this, motionEvent);
                }
                if (this.isVisible && motionEvent.getActionMasked() == 0 && motionEvent.getPointerCount() == 1) {
                    int x = (int) motionEvent.getX(0);
                    int y = (int) motionEvent.getY(0);
                    CodeEditText.EditorView oEditorView = this.this$0.getOEditorView();
                    int iXG = oEditorView.XG(getLine());
                    int column = getColumn();
                    int iEv = (int) (oEditorView.Ev(iXG) - this.this$0.getScrollLineY());
                    int iJO = (int) (oEditorView.jO(column, iXG) - this.this$0.getHorizontalScrollView().getScrollX());
                    if (getHandleRect(iJO, iEv).contains(x, y)) {
                        this.dragIsActive = true;
                        this.isDown = true;
                        if (this.removeTimerTask != null) {
                            this.removeTimerTask.cancel();
                        }
                        this.dragDX = x - (iJO + ((int) this.this$0.getOEditorView().getSpaceCharWidth()));
                        this.dragDY = y - (iEv + (((int) this.this$0.getOEditorView().getFontHeight()) / 2));
                        this.this$0.invalidate();
                    }
                }
                return this.dragIsActive;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -6590904509522344112L, this, motionEvent);
                }
                throw th;
            }
        }

        @ey(method = 2723909635789114295L)
        public boolean onTouchEvent(MotionEvent motionEvent) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(663380321676964048L, this, motionEvent);
                }
                if (!this.dragIsActive) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    this.dragIsActive = false;
                    scheduleRemoveCaretHandle();
                    this.this$0.invalidate();
                    if (this.isDown) {
                        onClick();
                        this.isDown = false;
                    }
                }
                if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX(0);
                    float scrollX = (x - this.dragDX) + this.this$0.getHorizontalScrollView().getScrollX();
                    float y = (motionEvent.getY(0) - this.dragDY) + this.this$0.getScrollLineY();
                    int iXa = this.this$0.getOEditorView().Xa(scrollX, y);
                    int iCU = this.this$0.getOEditorView().CU(scrollX, y);
                    if (iXa != getLine() || iCU != getColumn()) {
                        try {
                            this.this$0.Q6 = true;
                            onDraggedTo(iXa, iCU);
                            this.this$0.Q6 = false;
                            this.this$0.invalidate();
                            this.this$0.J0(iXa, iCU, 1, 3, getScrollPaddingBottom(), 3, true);
                        } catch (Throwable th) {
                            this.this$0.Q6 = false;
                            throw th;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th2, 663380321676964048L, this, motionEvent);
                }
                throw th2;
            }
        }

        @ey(method = -1524084196227931936L)
        public void setBounce(float f) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(693917310946914405L, this, new Float(f));
                }
                this.bounce = f;
                Rect handleRectInWindow = getHandleRectInWindow();
                handleRectInWindow.right += 100;
                this.this$0.invalidate(handleRectInWindow);
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, 693917310946914405L, this, new Float(f));
                }
                throw th;
            }
        }

        @ey(method = -2040008886390719160L)
        public void show() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(-1230711725589006885L, this);
                }
                this.isVisible = true;
                this.this$0.invalidate();
                scheduleRemoveCaretHandle();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, -1230711725589006885L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2222516706286540409L, container = 1527178060401062972L, user = true)
    class a extends DragHandle {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -6263863559754175284L)
        a(Drawable drawable, Drawable drawable2, float f, float f2, float f3, float f4, long j) {
            super(CodeEditTextScrollView.this, drawable, drawable2, f, f2, f3, f4, j);
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -1538805853135148200L)
        protected int getColumn() {
            try {
                if (DW) {
                    iy.gn(-4930989518345917780L, this);
                }
                return CodeEditTextScrollView.this.getOEditorView().getCaretColumn();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -4930989518345917780L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -1852513749532080096L)
        protected int getLine() {
            try {
                if (DW) {
                    iy.gn(2580674161697953200L, this);
                }
                return CodeEditTextScrollView.this.getOEditorView().getCaretLine();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 2580674161697953200L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -3473395108266197907L)
        protected void onClick() {
            try {
                if (DW) {
                    iy.gn(-3411034808581771019L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3411034808581771019L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -1517470144395809488L)
        protected void onDraggedTo(int i, int i2) {
            try {
                if (DW) {
                    iy.EQ(-462255535015077216L, this, new Integer(i), new Integer(i2));
                }
                CodeEditTextScrollView.this.getOEditorView().TI(i2, i);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -462255535015077216L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2222606408631091200L, container = 1527178060401062972L, user = true)
    class b extends DragHandle {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -761405048784362577L)
        b(Drawable drawable, Drawable drawable2, float f, float f2, float f3, float f4, long j) {
            super(CodeEditTextScrollView.this, drawable, drawable2, f, f2, f3, f4, j);
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -263718577421437971L)
        protected int getColumn() {
            try {
                if (DW) {
                    iy.gn(-4928206630243825435L, this);
                }
                return CodeEditTextScrollView.this.getOEditorView().getSelectionAnchorColumn();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -4928206630243825435L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = 3584180311160107341L)
        protected int getLine() {
            try {
                if (DW) {
                    iy.gn(2583682967133946529L, this);
                }
                return CodeEditTextScrollView.this.getOEditorView().getSelectionAnchorLine();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 2583682967133946529L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = 1970616584818350144L)
        protected void onClick() {
            try {
                if (DW) {
                    iy.gn(-3408550226486587488L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3408550226486587488L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -1039987260518850495L)
        protected void onDraggedTo(int i, int i2) {
            try {
                if (DW) {
                    iy.EQ(-977149516676167875L, this, new Integer(i), new Integer(i2));
                }
                CodeEditTextScrollView.this.getOEditorView().iW(i, i2, CodeEditTextScrollView.this.getOEditorView().getSelectionPointLine(), CodeEditTextScrollView.this.getOEditorView().getSelectionPointColumn());
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -977149516676167875L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2222696110971578697L, container = 1527178060401062972L, user = true)
    class c extends DragHandle {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -7447957298163603152L)
        c(Drawable drawable, Drawable drawable2, float f, float f2, float f3, float f4, long j) {
            super(CodeEditTextScrollView.this, drawable, drawable2, f, f2, f3, f4, j);
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = 21732606741443676L)
        protected int getColumn() {
            try {
                if (DW) {
                    iy.gn(-4925423257948908000L, this);
                }
                return CodeEditTextScrollView.this.getOEditorView().getSelectionPointColumn();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -4925423257948908000L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = 2406061886367154336L)
        protected int getLine() {
            try {
                if (DW) {
                    iy.gn(2586692256762764948L, this);
                }
                return CodeEditTextScrollView.this.getOEditorView().getSelectionPointLine();
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 2586692256762764948L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = 773198236962353671L)
        protected void onClick() {
            try {
                if (DW) {
                    iy.gn(-3406065160198578867L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3406065160198578867L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = 539304826565078640L)
        protected void onDraggedTo(int i, int i2) {
            try {
                if (DW) {
                    iy.EQ(-1494513585001066148L, this, new Integer(i), new Integer(i2));
                }
                CodeEditTextScrollView.this.getOEditorView().iW(CodeEditTextScrollView.this.getOEditorView().getSelectionAnchorLine(), CodeEditTextScrollView.this.getOEditorView().getSelectionAnchorColumn(), i, i2);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -1494513585001066148L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2222785813308002900L, container = 1527178060401062972L, user = true)
    class d implements CaretMoveListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 376174279483542945L)
        d() {
        }

        @Override // com.aide.ui.views.editor.CaretMoveListener
        @ey(method = 356928418884268880L)
        public void j6(OConsole oConsole, int i, int i2, boolean z) {
            try {
                if (DW) {
                    iy.J0(4979609908945788631L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                CodeEditTextScrollView.this.EQ();
                CodeEditTextScrollView.this.a8();
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 4979609908945788631L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2222875515640363809L, container = 1527178060401062972L, user = true)
    class e implements SelectionListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -119887558815254848L)
        e() {
        }

        @Override // com.aide.ui.views.editor.SelectionListener
        @ey(method = 538732395820503531L)
        public void DW(OConsole oConsole) {
            try {
                if (DW) {
                    iy.tp(4926615780009332227L, this, oConsole);
                }
                CodeEditTextScrollView.this.a8();
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 4926615780009332227L, this, oConsole);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.SelectionListener
        @ey(method = -1176566624261230395L)
        public void j6(OConsole oConsole, boolean z) {
            try {
                if (DW) {
                    iy.EQ(1483094380493583957L, this, oConsole, new Boolean(z));
                }
                CodeEditTextScrollView.this.a8();
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 1483094380493583957L, this, oConsole, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2222965217968661424L, container = 1527178060401062972L, user = true)
    class f implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 2097103416839557315L)
        final /* synthetic */ int WB;

        @dy(field = 2097043828475466528L)
        final /* synthetic */ int mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -1728150080606222052L)
        f(int i, int i2) {
            this.WB = i;
            this.mb = i2;
        }

        @Override // java.lang.Runnable
        @ey(method = 1521310037490889240L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-2066584472879788192L, this);
                }
                CodeEditTextScrollView.this.scrollTo(CodeEditTextScrollView.this.getScrollX(), this.WB);
                CodeEditTextScrollView.this.getHorizontalScrollView().scrollTo(this.mb, CodeEditTextScrollView.this.getHorizontalScrollView().getScrollY());
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -2066584472879788192L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2223054920292895745L, container = 1527178060401062972L, user = true)
    class g extends AnimatorListenerAdapter {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 1879997579009927100L)
        final /* synthetic */ Runnable j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 597684626616237848L)
        g(Runnable runnable) {
            this.j6 = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        @ey(method = -2838345783307714000L)
        public void onAnimationEnd(Animator animator) {
            try {
                if (FH) {
                    iy.tp(-843391886426008972L, this, animator);
                }
                if (this.j6 != null) {
                    this.j6.run();
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -843391886426008972L, this, animator);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1411785762941269443L, container = -1411785762941269443L, user = true)
    private class h extends DragHandle {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = 2472915610141797904L)
        private int DW;

        @dy(field = -1621487324012273096L)
        private int FH;

        @dy(field = -3742975563272392660L)
        private AnimatorSet Hw;

        @dy(field = 1506869601459583140L)
        @hy
        final /* synthetic */ CodeEditTextScrollView Zo;

        @dy(field = 2459495302557185880L)
        private final boolean j6;

        @dy(field = -3849293602864843152L)
        private boolean v5;

        @cy(clazz = -4372523855922039040L, container = -1411785762941269443L, user = true)
        class a extends AnimatorListenerAdapter {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 630867232266816867L)
            final /* synthetic */ CodeEditTextScrollView j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -8586189400675645696L)
            a(CodeEditTextScrollView codeEditTextScrollView) {
                this.j6 = codeEditTextScrollView;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            @ey(method = -3546821365743434445L)
            public void onAnimationEnd(Animator animator) {
                try {
                    if (FH) {
                        iy.tp(1866879545032684000L, this, animator);
                    }
                    if (!h.this.isVisible() || h.this.v5) {
                        return;
                    }
                    animator.start();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, 1866879545032684000L, this, animator);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -4372656609407605911L, container = -1411785762941269443L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 62327222352395307L)
            b() {
            }

            @Override // java.lang.Runnable
            @ey(method = 757606261454987264L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(3976983868377191397L, this);
                    }
                    h.this.hide();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 3976983868377191397L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(h.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -940195851864000472L)
        public h(CodeEditTextScrollView codeEditTextScrollView, int i, boolean z) {
            super(codeEditTextScrollView, codeEditTextScrollView.getResources().getDrawable(i), codeEditTextScrollView.getResources().getDrawable(R$drawable.task_arrow_down), 0.0f, 0.5f, 0.0f, 0.5f, 10000000L);
            try {
                if (VH) {
                    iy.we(-532519459922393847L, null, codeEditTextScrollView, new Integer(i), new Boolean(z));
                }
                this.Zo = codeEditTextScrollView;
                this.j6 = z;
                float f = codeEditTextScrollView.getResources().getDisplayMetrics().density * 15.0f;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "bounce", f, 0.0f);
                long j = 300;
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "bounce", 0.0f, f);
                objectAnimatorOfFloat2.setDuration(j);
                objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                this.Hw = animatorSet;
                animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
                this.Hw.addListener(new a(codeEditTextScrollView));
            } catch (Throwable th) {
                if (gn) {
                    iy.U2(th, -532519459922393847L, null, codeEditTextScrollView, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = -1735670132558355552L)
        public void DW(int i, int i2) {
            try {
                if (VH) {
                    iy.EQ(6458456293962116580L, this, new Integer(i), new Integer(i2));
                }
                this.DW = i;
                this.FH = i2;
                show();
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 6458456293962116580L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -288686819507198543L)
        protected int getColumn() {
            try {
                if (VH) {
                    iy.gn(3578817585224010459L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 3578817585224010459L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -1970210481229543095L)
        protected int getLine() {
            try {
                if (VH) {
                    iy.gn(1993853182042517823L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 1993853182042517823L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -3528468877265125024L)
        protected void onClick() {
            try {
                if (VH) {
                    iy.gn(547404701557526484L, this);
                }
                this.Zo.getCodeEditText().x9(this.DW, this.FH, this.j6);
                this.v5 = true;
                this.Zo.dx(this.DW, this.FH, this.Zo.getCodeEditText().getDefaultFontSize(), new b());
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 547404701557526484L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = -226910953330826531L)
        protected void onDraggedTo(int i, int i2) {
            try {
                if (VH) {
                    iy.EQ(415757008082571435L, this, new Integer(i), new Integer(i2));
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 415757008082571435L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditTextScrollView.DragHandle
        @ey(method = 280123017355167668L)
        public void show() {
            try {
                if (VH) {
                    iy.gn(2363674855950633088L, this);
                }
                super.show();
                this.v5 = false;
                if (this.Hw.isRunning()) {
                    return;
                }
                this.Hw.start();
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 2363674855950633088L, this);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(CodeEditTextScrollView.class);
            if (iW) {
                iy.gn(-475698478596560700L, null);
            }
            Jl = false;
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -475698478596560700L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 37505677565335892L)
    public CodeEditTextScrollView(Context context) {
        super(context);
        try {
            if (iW) {
                iy.tp(-144329535800566721L, null, context);
            }
            rN(context);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -144329535800566721L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 595984940950504320L)
    private void BT(MotionEvent motionEvent) {
        try {
            if (iW) {
                iy.tp(-241321454738952399L, this, motionEvent);
            }
            setPinchZoom(Ws(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1)) / this.mb);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -241321454738952399L, this, motionEvent);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4602188157403359000L)
    public boolean J0(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        boolean z2;
        boolean z3;
        try {
            if (iW) {
                iy.QX(299976980777671211L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Boolean(z)});
            }
            CodeEditText.EditorView oEditorView = getOEditorView();
            int iXG = oEditorView.XG(i);
            int firstVisibleLine = (getFirstVisibleLine() + i3) - 1;
            int iQX = (QX(z) - i5) + 1;
            if (iXG < firstVisibleLine) {
                firstVisibleLine = (iXG - i3) + 1;
                z2 = true;
            } else {
                z2 = false;
            }
            if (iXG > iQX) {
                firstVisibleLine = (iXG - Mr(z)) + i5;
                z2 = true;
            }
            float fJO = getOEditorView().jO(i2, iXG);
            float scrollX = getHorizontalScrollView().getScrollX();
            float spaceCharWidth = fJO - (i6 * oEditorView.getSpaceCharWidth());
            if (spaceCharWidth < getHorizontalScrollView().getScrollX()) {
                scrollX = spaceCharWidth;
                z3 = true;
            } else {
                z3 = false;
            }
            float spaceCharWidth2 = fJO + (i4 * oEditorView.getSpaceCharWidth());
            if (spaceCharWidth2 > getHorizontalScrollView().getScrollX() + getMeasuredWidth()) {
                scrollX = spaceCharWidth2 - getMeasuredWidth();
                z3 = true;
            }
            if (z3 || z2) {
                if (z2) {
                    if (firstVisibleLine < 0) {
                        firstVisibleLine = 0;
                    }
                    scrollTo(getScrollX(), (int) ((firstVisibleLine * getOEditorView().getFontHeight()) + getHeaderHeight()));
                }
                if (z3) {
                    getHorizontalScrollView().scrollTo((int) scrollX, getHorizontalScrollView().getScrollY());
                }
                if (iXG <= 0) {
                    vy();
                }
            }
            return z3 || z2;
        } catch (Throwable th) {
            if (eU) {
                iy.rN(th, 299976980777671211L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Boolean(z)});
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1528512136903595808L)
    public int Mr(boolean z) {
        try {
            if (iW) {
                iy.Ws(-5981518338966208875L, this, z);
            }
            return (int) ((getMeasuredHeight() - (z ? 0 : getQuickKeyBarHeight())) / getOEditorView().getFontHeight());
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -5981518338966208875L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 708264271801242324L)
    private void P8(int i, int i2) {
        try {
            if (iW) {
                iy.EQ(-927914807885282525L, this, new Integer(i), new Integer(i2));
            }
            scrollTo(getScrollX(), getHeaderHeight() + i2);
            getHorizontalScrollView().scrollTo(i, getScrollY());
        } catch (Throwable th) {
            if (eU) {
                iy.Mr(th, -927914807885282525L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4955096568660707061L)
    private void SI() {
        try {
            if (iW) {
                iy.gn(-7431934967343056400L, this);
            }
            this.w9.hide();
            this.hK.show();
            this.cT.show();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -7431934967343056400L, this);
            }
            throw th;
        }
    }

    @ey(method = 2610531802265983484L)
    private float Ws(float f2, float f3, float f4, float f5) {
        try {
            if (iW) {
                iy.J0(1203131895963499829L, this, new Float(f2), new Float(f3), new Float(f4), new Float(f5));
            }
            float f6 = f2 - f4;
            float f7 = f3 - f5;
            return (float) Math.sqrt((f6 * f6) + (f7 * f7));
        } catch (Throwable th) {
            if (eU) {
                iy.a8(th, 1203131895963499829L, this, new Float(f2), new Float(f3), new Float(f4), new Float(f5));
            }
            throw th;
        }
    }

    @ey(method = 651664010401631469L)
    private static Drawable XL(Context context) {
        try {
            if (iW) {
                iy.tp(300140386419170272L, null, context);
            }
            return AndroidHelper.lg(context) ? AndroidHelper.P8(context, R.attr.textSelectHandleLeft, R.attr.colorAccent) : context.getResources().getDrawable(R$drawable.text_select_handle_left);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 300140386419170272L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -987704618367579849L)
    private static Drawable aM(Context context) {
        try {
            if (iW) {
                iy.tp(-1083360095301203720L, null, context);
            }
            return AndroidHelper.lg(context) ? AndroidHelper.P8(context, R.attr.textSelectHandle, R.attr.colorAccent) : context.getResources().getDrawable(R$drawable.text_select_handle_middle);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -1083360095301203720L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -3494905909466639460L)
    private void cb(MotionEvent motionEvent) {
        try {
            if (iW) {
                iy.tp(-972316685052552699L, this, motionEvent);
            }
            this.WB = false;
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -972316685052552699L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = 581457980638784012L)
    private void cn(MotionEvent motionEvent) {
        try {
            if (iW) {
                iy.tp(1174754900676382263L, this, motionEvent);
            }
            this.WB = true;
            this.mb = Ws(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            sh((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f) - getHeaderHeight());
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 1174754900676382263L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = -5646012300035384075L)
    private void ei() {
        try {
            if (iW) {
                iy.gn(-4351332685093462596L, this);
            }
            this.w9.show();
            this.hK.hide();
            this.cT.hide();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -4351332685093462596L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5648103315095556183L)
    public CodeEditText getCodeEditText() {
        try {
            if (iW) {
                iy.gn(-5275058033570234000L, this);
            }
            return (CodeEditText) ((ViewGroup) ((ViewGroup) getChildAt(0)).getChildAt(0)).getChildAt(1);
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -5275058033570234000L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5145282606432342379L)
    public int getHeaderHeight() {
        try {
            if (iW) {
                iy.gn(5576183149537000280L, this);
            }
            return getHeaderView().getMeasuredHeight();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 5576183149537000280L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -495001565222488821L)
    public HorizontalScrollView getHorizontalScrollView() {
        try {
            if (iW) {
                iy.gn(-49818037403709800L, this);
            }
            return (HorizontalScrollView) getChildAt(0);
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -49818037403709800L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -543603598293049320L)
    public CodeEditText.EditorView getOEditorView() {
        try {
            if (iW) {
                iy.gn(-5267839568939873659L, this);
            }
            return getCodeEditText().getOEditorView();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -5267839568939873659L, this);
            }
            throw th;
        }
    }

    @ey(method = 704650270669961809L)
    private int getQuickKeyBarHeight() {
        try {
            if (iW) {
                iy.gn(4245123115382937664L, this);
            }
            return getCodeEditText().getQuickKeyBarHeight();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 4245123115382937664L, this);
            }
            throw th;
        }
    }

    @ey(method = 5350686634205572753L)
    private int getScreenLinesCount() {
        try {
            if (iW) {
                iy.gn(6507663914319915636L, this);
            }
            return (int) ((((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.content).getHeight() - getQuickKeyBarHeight()) / getOEditorView().getFontHeight());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 6507663914319915636L, this);
            }
            throw th;
        }
    }

    @ey(method = -299277202735494160L)
    private int getScrollColumnX() {
        try {
            if (iW) {
                iy.gn(3392355497451378261L, this);
            }
            return getHorizontalScrollView().getScrollX();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 3392355497451378261L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2806826514580735237L)
    public int getScrollLineY() {
        try {
            if (iW) {
                iy.gn(-2231192923430531040L, this);
            }
            return getScrollY() - getHeaderHeight();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -2231192923430531040L, this);
            }
            throw th;
        }
    }

    @ey(method = 47602948224727609L)
    private int getVisibleColumnsCount() {
        try {
            if (iW) {
                iy.gn(-5997327906327912280L, this);
            }
            return (int) (getMeasuredWidth() / getOEditorView().getSpaceCharWidth());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -5997327906327912280L, this);
            }
            throw th;
        }
    }

    @ey(method = -1301334676094462328L)
    private static Drawable j3(Context context) {
        try {
            if (iW) {
                iy.tp(893146395366562221L, null, context);
            }
            return AndroidHelper.lg(context) ? AndroidHelper.P8(context, R.attr.textSelectHandleRight, R.attr.colorAccent) : context.getResources().getDrawable(R$drawable.text_select_handle_right);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 893146395366562221L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -8312533657135587840L)
    private void rN(Context context) {
        try {
            if (iW) {
                iy.tp(-7118633949076527143L, this, context);
            }
            setFocusable(false);
            this.q7 = new h(this, R$drawable.task_arrow_edit, true);
            this.Z1 = new h(this, R$drawable.task_arrow_view, false);
            this.w9 = new a(aM(context), aM(context), 0.5f, 0.0f, 0.0f, 0.0f, 3000L);
            this.hK = new b(XL(context), XL(context), 0.8f, 0.0f, 0.0f, 0.0f, 10000000L);
            c cVar = new c(j3(context), j3(context), 0.2f, 0.0f, 0.0f, 0.0f, 10000000L);
            this.cT = cVar;
            this.n5 = new DragHandle[]{this.q7, this.Z1, this.w9, this.hK, cVar};
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -7118633949076527143L, this, context);
            }
            throw th;
        }
    }

    @ey(method = 2754547506937160649L)
    private void setPinchZoom(float f2) {
        try {
            if (iW) {
                iy.tp(-2161679105275164060L, this, new Float(f2));
            }
            float[] fArrDP = getOEditorView().DP(f2);
            float f3 = fArrDP[1];
            float f4 = ((this.qp + this.jw) * fArrDP[0]) - this.jw;
            this.zh = f4;
            float f5 = ((this.k2 + this.fY) * f3) - this.fY;
            this.AL = f5;
            P8((int) f4, (int) f5);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -2161679105275164060L, this, new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = -5169331040704775092L)
    private void sh(float f2, float f3) {
        try {
            if (iW) {
                iy.EQ(965992488433909167L, this, new Float(f2), new Float(f3));
            }
            this.jw = f2;
            this.fY = f3;
            this.qp = getScrollColumnX();
            this.k2 = getScrollLineY();
            getOEditorView().Qs();
        } catch (Throwable th) {
            if (eU) {
                iy.Mr(th, 965992488433909167L, this, new Float(f2), new Float(f3));
            }
            throw th;
        }
    }

    @ey(method = 2653967576891868907L)
    private boolean tp() {
        try {
            if (iW) {
                iy.gn(6340936740444009704L, this);
            }
            return AndroidHelper.U2(getContext());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 6340936740444009704L, this);
            }
            throw th;
        }
    }

    @ey(method = -94704231011443592L)
    private boolean u7() {
        try {
            if (iW) {
                iy.gn(110377942879655417L, this);
            }
            return isHardwareAccelerated();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 110377942879655417L, this);
            }
            throw th;
        }
    }

    @ey(method = 5627145497590440024L)
    private void vy() {
        try {
            if (iW) {
                iy.gn(342765843365982825L, this);
            }
            scrollTo(getScrollX(), 0);
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 342765843365982825L, this);
            }
            throw th;
        }
    }

    @ey(method = 5950610009969668248L)
    public boolean EQ() {
        try {
            if (iW) {
                iy.gn(-7609603819454895149L, this);
            }
            return J0(getOEditorView().getCaretLine(), getOEditorView().getCaretColumn(), 1, 1, 1, 1, false);
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -7609603819454895149L, this);
            }
            throw th;
        }
    }

    @ey(method = 2169674205417352251L)
    public void J8(int i, int i2, int i3, int i4) {
        try {
            if (iW) {
                iy.J0(762705082842473000L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            try {
                this.kf = true;
                if (this.w9.isVisible() && (i != i3 || i2 != i4)) {
                    SI();
                }
                getOEditorView().OM(i, i2, i3, i4);
                if (this.w9.isVisible() || this.hK.isVisible()) {
                    invalidate();
                }
            } finally {
                this.kf = false;
            }
        } catch (Throwable th) {
            if (eU) {
                iy.a8(th, 762705082842473000L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -231625195805211795L)
    public void KD(int i, int i2, boolean z, boolean z2) {
        try {
            if (iW) {
                iy.J0(3481636457736893200L, this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2));
            }
            if (z) {
                this.q7.DW(i - 1, i2 - 1);
            } else {
                this.Z1.DW(i - 1, i2 - 1);
            }
            if (z2) {
                getOEditorView().setFontSize(getCodeEditText().getDefaultFontSize() * 0.5f);
            }
        } catch (Throwable th) {
            if (eU) {
                iy.a8(th, 3481636457736893200L, this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 2634227170607934648L)
    public int QX(boolean z) {
        try {
            if (iW) {
                iy.Ws(3692276521024502567L, this, z);
            }
            return (getFirstVisibleLine() + Mr(z)) - 1;
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 3692276521024502567L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4999972674461969757L)
    public void U2() {
        try {
            if (iW) {
                iy.gn(1313773977119759732L, this);
            }
            if (!this.q7.isVisible() || getOEditorView().getCaretLine() == this.q7.getLine()) {
                return;
            }
            getOEditorView().TI(this.q7.getColumn(), this.q7.getLine());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 1313773977119759732L, this);
            }
            throw th;
        }
    }

    @ey(method = -258444153251121048L)
    public void a8() {
        try {
            if (iW) {
                iy.gn(600342389609366339L, this);
            }
            if (this.Q6 || this.kf) {
                return;
            }
            this.w9.hide();
            this.hK.hide();
            this.cT.hide();
            getCodeEditText().Mz();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 600342389609366339L, this);
            }
            throw th;
        }
    }

    @Override // android.widget.ScrollView
    @ey(method = -7949025709803866348L)
    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        try {
            if (iW) {
                iy.tp(-6795322529938909407L, this, rect);
            }
            if (tp()) {
                return 0;
            }
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -6795322529938909407L, this, rect);
            }
            throw th;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    @ey(method = -3074507237327310092L)
    public void draw(Canvas canvas) {
        try {
            if (iW) {
                iy.tp(322618959802127811L, this, canvas);
            }
            int iSave = canvas.save();
            super.draw(canvas);
            canvas.restoreToCount(iSave);
            for (DragHandle dragHandle : this.n5) {
                dragHandle.draw(canvas);
            }
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 322618959802127811L, this, canvas);
            }
            throw th;
        }
    }

    @ey(method = 8068741944571871455L)
    public void dx(int i, int i2, float f2, Runnable runnable) {
        try {
            if (iW) {
                iy.J0(6364552957507873392L, this, new Integer(i), new Integer(i2), new Float(f2), runnable);
            }
            if (getOEditorView().getFontSize() == f2) {
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                getOEditorView().requestFocus();
                sh(getOEditorView().jO(i2, i), getOEditorView().Ev(i) - getScrollLineY());
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "pinchZoom", 1.0f, f2 / getOEditorView().getFontSize());
                objectAnimatorOfFloat.setDuration(1000L);
                objectAnimatorOfFloat.addListener(new g(runnable));
                objectAnimatorOfFloat.start();
            }
        } catch (Throwable th) {
            if (eU) {
                iy.a8(th, 6364552957507873392L, this, new Integer(i), new Integer(i2), new Float(f2), runnable);
            }
            throw th;
        }
    }

    @ey(method = 5326832079418170024L)
    public boolean er() {
        try {
            if (iW) {
                iy.gn(6480317330394729223L, this);
            }
            if (!this.q7.isVisible()) {
                if (!this.Z1.isVisible()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 6480317330394729223L, this);
            }
            throw th;
        }
    }

    @ey(method = -3361543480084350292L)
    public void gW() {
        try {
            if (iW) {
                iy.gn(-1575342579585182947L, this);
            }
            for (DragHandle dragHandle : this.n5) {
                dragHandle.onDestroy();
            }
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -1575342579585182947L, this);
            }
            throw th;
        }
    }

    @ey(method = 3245208462995384589L)
    public int getFirstVisibleLine() {
        try {
            if (iW) {
                iy.gn(4555712326159824768L, this);
            }
            return (int) (getScrollLineY() / getOEditorView().getFontHeight());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 4555712326159824768L, this);
            }
            throw th;
        }
    }

    @ey(method = 331035298034797719L)
    public View getHeaderView() {
        try {
            if (iW) {
                iy.gn(2078912586998990448L, this);
            }
            return ((ViewGroup) ((ViewGroup) getChildAt(0)).getChildAt(0)).getChildAt(0);
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 2078912586998990448L, this);
            }
            throw th;
        }
    }

    @ey(method = 4877216751569960280L)
    public void lg() {
        try {
            if (iW) {
                iy.gn(-294737801319569007L, this);
            }
            this.Z1.hide();
            this.q7.hide();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -294737801319569007L, this);
            }
            throw th;
        }
    }

    @ey(method = -2534281584736273697L)
    public void nw() {
        try {
            if (iW) {
                iy.gn(-1485646363710203520L, this);
            }
            if (getOEditorView().getSelectionVisibility()) {
                SI();
            } else {
                ei();
            }
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -1485646363710203520L, this);
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @ey(method = 887793339723325187L)
    protected void onAttachedToWindow() {
        try {
            if (iW) {
                iy.gn(4426619718646903520L, this);
            }
            if (Jl || !u7()) {
                return;
            }
            setLayerType(1, null);
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 4426619718646903520L, this);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -202520716462318192L)
    protected void onFinishInflate() {
        try {
            if (iW) {
                iy.gn(660729739022127985L, this);
            }
            super.onFinishInflate();
            getOEditorView().addCaretMoveListener(new d());
            getOEditorView().addSelectionListener(new e());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 660729739022127985L, this);
            }
            throw th;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    @ey(method = -179710506807031041L)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (iW) {
                iy.tp(3307504760350739200L, this, motionEvent);
            }
            for (DragHandle dragHandle : this.n5) {
                if (dragHandle.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            if (AndroidHelper.rN(motionEvent)) {
                return false;
            }
            if (!this.WB && motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                cn(motionEvent);
            }
            if (this.WB) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 3307504760350739200L, this, motionEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    @ey(method = 116834787723507652L)
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            if (iW) {
                iy.tp(142038143544224161L, this, parcelable);
            }
            if (!(parcelable instanceof Bundle)) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            postDelayed(new f(bundle.getInt("scrolly"), bundle.getInt("scrollx")), 100L);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 142038143544224161L, this, parcelable);
            }
            throw th;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    @ey(method = -1187777863589655875L)
    public Parcelable onSaveInstanceState() {
        try {
            if (iW) {
                iy.gn(425598516807097920L, this);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("instanceState", super.onSaveInstanceState());
            bundle.putInt("scrollx", getScrollX());
            bundle.putInt("scrolly", getHorizontalScrollView().getScrollY());
            return bundle;
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 425598516807097920L, this);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 369465896322369485L)
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        try {
            if (iW) {
                iy.J0(57458406875011936L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            super.onScrollChanged(i, i2, i3, i4);
            getOEditorView().hp();
        } catch (Throwable th) {
            if (eU) {
                iy.a8(th, 57458406875011936L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    @ey(method = -4862720712386855475L)
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            if (iW) {
                iy.J0(3786480371555087968L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            super.onSizeChanged(i, i2, i3, i4);
            getOEditorView().hp();
        } catch (Throwable th) {
            if (eU) {
                iy.a8(th, 3786480371555087968L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    @ey(method = 2747769210361974825L)
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (iW) {
                iy.tp(1374904241774718072L, this, motionEvent);
            }
            for (DragHandle dragHandle : this.n5) {
                if (dragHandle.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
            if (!this.WB && motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                cn(motionEvent);
            }
            if (!this.WB) {
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 2) {
                BT(motionEvent);
            }
            if ((motionEvent.getAction() == 1 && motionEvent.getPointerCount() == 1) || motionEvent.getAction() == 3) {
                cb(motionEvent);
            }
            return true;
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 1374904241774718072L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = 7165025972627019344L)
    public void ro() {
        try {
            if (iW) {
                iy.gn(-5392891101809295239L, this);
            }
            getHorizontalScrollView().scrollTo(0, 0);
            scrollTo(0, getHeaderHeight());
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "scrollY", 0);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.start();
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -5392891101809295239L, this);
            }
            throw th;
        }
    }

    @ey(method = -3365787619800260304L)
    public void we(int i, int i2) {
        try {
            if (iW) {
                iy.EQ(1174195015257584511L, this, new Integer(i), new Integer(i2));
            }
            int fontHeight = (int) (i2 / getOEditorView().getFontHeight());
            if (getFirstVisibleLine() + 1 < Math.min(i, Math.max(1, ((fontHeight + i) - getScreenLinesCount()) + 2))) {
                scrollTo(getScrollX(), (int) (((r0 - 1) * getOEditorView().getFontHeight()) + getHeaderHeight()));
            }
        } catch (Throwable th) {
            if (eU) {
                iy.Mr(th, 1174195015257584511L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -5045485761540252288L)
    public boolean yS(MotionEvent motionEvent) {
        try {
            if (iW) {
                iy.tp(-4326499630303940481L, this, motionEvent);
            }
            if (!this.w9.isTouchEventInsideHandle(motionEvent) && !this.hK.isTouchEventInsideHandle(motionEvent)) {
                if (!this.cT.isTouchEventInsideHandle(motionEvent)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -4326499630303940481L, this, motionEvent);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -6562690762006451115L)
    public CodeEditTextScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (iW) {
                iy.EQ(-2654919397556896704L, null, context, attributeSet);
            }
            rN(context);
        } catch (Throwable th) {
            if (eU) {
                iy.Mr(th, -2654919397556896704L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 541930953987022896L)
    public CodeEditTextScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (iW) {
                iy.we(-527739599459916723L, null, context, attributeSet, new Integer(i));
            }
            rN(context);
        } catch (Throwable th) {
            if (eU) {
                iy.U2(th, -527739599459916723L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
