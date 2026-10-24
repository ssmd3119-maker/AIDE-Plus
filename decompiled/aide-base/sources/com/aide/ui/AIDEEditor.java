package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hg;
import abcd.hy;
import abcd.iy;
import abcd.jg;
import abcd.of;
import abcd.pf;
import abcd.qf;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.common.AndroidHelper;
import com.aide.common.KeyStroke;
import com.aide.common.KeyStrokeDetector;
import com.aide.common.MessageBox;
import com.aide.common.SerializeHelper;
import com.aide.common.StreamUtilities;
import com.aide.engine.Modification;
import com.aide.engine.OpenFile;
import com.aide.engine.SyntaxError;
import com.aide.engine.service.CodeModelFactory;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.services.ErrorService;
import com.aide.ui.services.OpenFileService;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;
import com.aide.ui.views.CodeEditText;
import com.aide.ui.views.CodeEditTextScrollView;
import com.aide.ui.views.editor.CaretMoveListener;
import com.aide.ui.views.editor.EditorModel;
import com.aide.ui.views.editor.Model;
import com.aide.ui.views.editor.ModelListener;
import com.aide.ui.views.editor.OConsole;
import com.aide.ui.views.editor.Position;
import com.aide.ui.views.editor.SelectedRegion;
import com.aide.ui.views.editor.SelectionListener;
import com.aide.ui.views.editor.UndoStack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -728009048092214384L, container = -728009048092214384L, user = true)
/* loaded from: classes.dex */
public class AIDEEditor extends CodeEditText implements ErrorService.ErrorListener {

    @gy
    private static /* synthetic */ boolean Gj;

    @fy
    private static /* synthetic */ boolean fN;

    @dy(field = 2942990791956631908L)
    private String Jl;

    @dy(field = -2152996482150182760L)
    private String Q6;

    @dy(field = 4420765401868346436L)
    private AIDEEditorCompletion Z1;

    @dy(field = -2966726132095212032L)
    private boolean e3;

    @dy(field = -5725634366770165575L)
    private int eU;

    @dy(field = 220712904003454536L)
    private String iW;

    @dy(field = -2064076440954499625L)
    private String kf;

    @dy(field = -2062575272927123048L)
    private String n5;

    @dy(field = 849081249564709560L)
    private boolean pO;

    @dy(field = -6630819537962422329L)
    private boolean sE;

    @dy(field = 384540321120366840L)
    private AnimatorSet sg;

    @cy(clazz = 698743185639658005L, container = -728009048092214384L, user = true)
    class a implements CaretMoveListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -115799232217613920L)
        a() {
        }

        @Override // com.aide.ui.views.editor.CaretMoveListener
        @ey(method = 80382592132992480L)
        public void j6(OConsole oConsole, int i, int i2, boolean z) {
            try {
                if (DW) {
                    iy.J0(-550662400464185040L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                AIDEEditor.this.getEditorPager().k2();
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -550662400464185040L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698765600670213904L, container = -728009048092214384L, user = true)
    class b implements SelectionListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 5168202807900000L)
        b() {
        }

        @Override // com.aide.ui.views.editor.SelectionListener
        @ey(method = -292732287545131200L)
        public void DW(OConsole oConsole) {
            try {
                if (DW) {
                    iy.tp(-2719347515270587072L, this, oConsole);
                }
                AIDEEditor.this.getEditorPager().k2();
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -2719347515270587072L, this, oConsole);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.SelectionListener
        @ey(method = 772108655715303728L)
        public void j6(OConsole oConsole, boolean z) {
            try {
                if (DW) {
                    iy.EQ(-5691054767191683232L, this, oConsole, new Boolean(z));
                }
                AIDEEditor.this.getEditorPager().k2();
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -5691054767191683232L, this, oConsole, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698788015704833097L, container = -728009048092214384L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -111418830060942584L)
        c() {
        }

        @Override // java.lang.Runnable
        @ey(method = -2526771070570164969L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2905650240896256455L, this);
                }
                AIDEEditor.this.getScrollView().EQ();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2905650240896256455L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698810430743515584L, container = -728009048092214384L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -118651369062976295L)
        d() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1613156681356937460L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(2909450831523542120L, this);
                }
                AIDEEditor.this.getScrollView().EQ();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2909450831523542120L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698832845786261365L, container = -728009048092214384L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 9352117354084736L)
        e() {
        }

        @Override // java.lang.Runnable
        @ey(method = -2327655298211137917L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(266642756984849811L, this);
                }
                AIDEEditor.this.getScrollView().ro();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 266642756984849811L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698855260833070440L, container = -728009048092214384L, user = true)
    class f implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 41705253574441784L)
        f() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 181327503206965124L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-569431765836365663L, this, view);
                }
                AIDEEditor.this.qP();
                ServiceContainer.ro().we();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -569431765836365663L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698877675883942809L, container = -728009048092214384L, user = true)
    class g implements View.OnFocusChangeListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 209935202963321495L)
        final /* synthetic */ TextView WB;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -4452202270321293103L)
        g(TextView textView) {
            this.WB = textView;
        }

        @Override // android.view.View.OnFocusChangeListener
        @ey(method = 4083108651461898452L)
        public void onFocusChange(View view, boolean z) {
            try {
                if (jw) {
                    iy.EQ(-3707458976372498505L, this, view, new Boolean(z));
                }
                if (z) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.0f, 1, 0.5f);
                    scaleAnimation.setDuration(400);
                    scaleAnimation.setFillAfter(true);
                    this.WB.startAnimation(scaleAnimation);
                    return;
                }
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.0f, 1, 0.5f);
                scaleAnimation2.setDuration(400);
                scaleAnimation2.setFillAfter(true);
                this.WB.startAnimation(scaleAnimation2);
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, -3707458976372498505L, this, view, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698900090938878472L, container = -728009048092214384L, user = true)
    class h implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 141321642584581452L)
        h() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -385291829961939120L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(418821698030830848L, this, view);
                }
                ServiceContainer.getMainActivity().oy();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 418821698030830848L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698922505997877429L, container = -728009048092214384L, user = true)
    class i extends AnimatorListenerAdapter {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(i.class);
        }

        @ey(method = -191572822159474184L)
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        @ey(method = -2950682324325344480L)
        public void onAnimationEnd(Animator animator) {
            try {
                if (DW) {
                    iy.tp(-878343644852775L, this, animator);
                }
                if (AIDEEditor.this.pO) {
                    AIDEEditor.this.sg.start();
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -878343644852775L, this, animator);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 698944921060939680L, container = -728009048092214384L, user = true)
    class j implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -41212708122816179L)
        j() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1922464899020711748L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(849497465450062764L, this);
                }
                AIDEEditor.this.getScrollView().lg();
                AIDEEditor.this.Q6();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 849497465450062764L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2089715008010025979L, container = -728009048092214384L, user = true)
    class k implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(k.class);
        }

        @ey(method = 400948209727442944L)
        k() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = 500434014609245792L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(486098128979585976L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                FireBaseLogEvent.tp("Navigate mode: Identifier click");
                ServiceContainer.SI().aM(AIDEEditor.this.getFilePath(), i, i2, i, i4, new String(AIDEEditor.this.getEditorModel().fN(i2 - 1, i - 1, i4 - i2)));
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 486098128979585976L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2089786867773742000L, container = -728009048092214384L, user = true)
    class l implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(l.class);
        }

        @ey(method = 451912858181887840L)
        l() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = -663644968772839680L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(16644063172719647L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                AIDEEditor.this.Jm(i, i2, i4);
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 16644063172719647L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2089858727533394727L, container = -728009048092214384L, user = true)
    class m implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(m.class);
        }

        @ey(method = -306997428353835405L)
        m() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = 194827113823822655L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(-458356121794369400L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                AIDEEditor.this.lp(i, i2, i3, i4);
                AIDEEditor.this.getEditorPager().Xa();
                AIDEEditor.this.gW();
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -458356121794369400L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2089930587288984160L, container = -728009048092214384L, user = true)
    class n implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(n.class);
        }

        @ey(method = -57848961575364708L)
        n() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = 260779125865594260L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(-938902425921681165L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                AIDEEditor.this.gW();
                if (!AIDEEditor.this.OW(i, i2)) {
                    AIDEEditor.this.lp(i, i2, i3, i4);
                }
                AIDEEditor.this.sM();
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -938902425921681165L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2090002447040510299L, container = -728009048092214384L, user = true)
    class o implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(o.class);
        }

        @ey(method = -418909625838607920L)
        o() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = -241618749523406656L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(-1424994849209215648L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                AIDEEditor.this.lp(i, i2, i3, i4);
                AIDEEditor.this.Pa();
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -1424994849209215648L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2090074306787973144L, container = -728009048092214384L, user = true)
    class p implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(p.class);
        }

        @ey(method = 153441145367590067L)
        p() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = -27712878828518793L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(-1916633391656972849L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                AIDEEditor.this.lp(i, i2, i3, i4);
                AIDEEditor.this.Pa();
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -1916633391656972849L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2090146166531372695L, container = -728009048092214384L, user = true)
    class q implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(q.class);
        }

        @ey(method = 143117157011721423L)
        q() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = 748447960770803475L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(1534178909568348736L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                AIDEEditor.this.Bx(i, i2);
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 1534178909568348736L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2090218026270708952L, container = -728009048092214384L, user = true)
    class r implements CaretMoveListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(r.class);
        }

        @ey(method = 299105702493151744L)
        r() {
        }

        @Override // com.aide.ui.views.editor.CaretMoveListener
        @ey(method = 1219350684251968908L)
        public void j6(OConsole oConsole, int i, int i2, boolean z) {
            try {
                if (DW) {
                    iy.J0(1398115187697645216L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                AIDEEditor.this.Z1.er(AIDEEditor.this.getOEditorView().getCaretLine() + 1, AIDEEditor.this.getOEditorView().getCaretColumn() + 1);
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 1398115187697645216L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2090289886005981915L, container = -728009048092214384L, user = true)
    class s implements CaretMoveListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(s.class);
        }

        @ey(method = -363816279270128685L)
        s() {
        }

        @Override // com.aide.ui.views.editor.CaretMoveListener
        @ey(method = 309201093510858219L)
        public void j6(OConsole oConsole, int i, int i2, boolean z) {
            try {
                if (DW) {
                    iy.J0(426499453196841447L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                ServiceContainer.getNavigateService().VH(new FileSpan(AIDEEditor.this.getFilePath(), AIDEEditor.this.getOEditorView().getCaretLine() + 1, AIDEEditor.this.getOEditorView().getCaretColumn() + 1, AIDEEditor.this.getOEditorView().getCaretLine() + 1, AIDEEditor.this.getOEditorView().getCaretColumn() + 1));
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 426499453196841447L, this, oConsole, new Integer(i), new Integer(i2), new Boolean(z));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AIDEEditor.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -179703731716641360L)
    public AIDEEditor(Context context) {
        super(context);
        try {
            if (fN) {
                iy.tp(305428288988983885L, null, context);
            }
            this.Z1 = new AIDEEditorCompletion(this);
            sh();
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, 305428288988983885L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2307427384467471727L)
    private void BR() {
        try {
            if (fN) {
                iy.gn(5597653842602170384L, this);
            }
            getOEditorView().setModel(new t(this));
            getOEditorView().setHidden(true);
            getOEditorView().setEditable(false);
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 5597653842602170384L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2672430941189996609L)
    public void Bx(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(173179136821523088L, this, new Integer(i2), new Integer(i3));
            }
            if (ServiceContainer.getMainActivity().CU()) {
                return;
            }
            if (!getOEditorView().getSelectionVisibility() || !OW(i2, i3) || !AndroidHelper.aM(ServiceContainer.getContext()) || Gj()) {
                lp(i2, i3, i2, i3);
                kQ();
                getEditorPager().Xa();
            }
            gW();
            if (getOEditorView().uC()) {
                ys();
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, 173179136821523088L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4013184603630502936L)
    public void Jm(int i2, int i3, int i4) {
        try {
            if (fN) {
                iy.we(822502663239023415L, this, new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxError syntaxErrorBT = ServiceContainer.J0().BT(getFilePath(), i2, i3, i2, i4);
            if (syntaxErrorBT != null) {
                ServiceContainer.J0().I(syntaxErrorBT);
            }
            if (!OW(i2, i3) && !OW(i2, i4)) {
                lp(i2, i3, i2, i4);
            }
            if (isInTouchMode()) {
                kQ();
                gW();
                Pa();
            } else {
                Pa();
                View viewFindViewById = ServiceContainer.getMainActivity().getWindow().getDecorView().findViewById(getResources().getIdentifier("action_bar_container", "id", "android"));
                if (viewFindViewById != null) {
                    viewFindViewById.requestFocus(17);
                }
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.U2(th, 822502663239023415L, this, new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1660912196327083824L)
    private OpenFileService.OpenFileModel Z1(String str) {
        try {
            if (fN) {
                iy.tp(-1163498855176090433L, this, str);
            }
            return new t(this, str);
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, -1163498855176090433L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 643821285826467127L)
    private boolean fN() {
        try {
            if (fN) {
                iy.gn(622281515496666696L, this);
            }
            if (AndroidHelper.U2(getContext())) {
                if (ServiceContainer.isTrainerMode()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 622281515496666696L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3351862079555713836L)
    public MainActivity getActivity() {
        try {
            if (fN) {
                iy.gn(3351074230504254345L, this);
            }
            return (MainActivity) getContext();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 3351074230504254345L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1370942484605832339L)
    public t getEditorModel() {
        try {
            if (fN) {
                iy.gn(-4186202173142481888L, this);
            }
            return (t) getOEditorView().getEditorModel();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -4186202173142481888L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -6848622323455893785L)
    public int getIndentationSize() {
        try {
            if (fN) {
                iy.gn(-6589845911118893580L, this);
            }
            String lowerCase = getFilePath().toLowerCase();
            if (lowerCase.endsWith(".java")) {
                return AppPreferences.P8();
            }
            if (lowerCase.endsWith(".js")) {
                return AppPreferences.nw();
            }
            if (!lowerCase.endsWith(".c") && !lowerCase.endsWith(".cpp") && !lowerCase.endsWith(".h") && !lowerCase.endsWith(".cc") && !lowerCase.endsWith(".hh") && !lowerCase.endsWith(".hpp")) {
                if (lowerCase.endsWith(".xml")) {
                    return AppPreferences.XX();
                }
                if (!lowerCase.endsWith(".html") && !lowerCase.endsWith(".htm")) {
                    return lowerCase.endsWith(".css") ? AppPreferences.u7() : getTabSize();
                }
                return AppPreferences.rN();
            }
            return AppPreferences.VH();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -6589845911118893580L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r0 = r0 + 1;
     */
    @abcd.ey(method = 401943890712198724L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int kf(char[] r10, int r11, int r12, java.lang.String r13) {
        /*
            r9 = this;
            boolean r0 = com.aide.ui.AIDEEditor.fN     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L19
            r1 = -6688734254017527489(0xa32cd7a2684c413f, double:-3.0274866424174754E-139)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L3e
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L3e
            r3 = r9
            r4 = r10
            r7 = r13
            abcd.iy.J0(r1, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3e
        L19:
            r0 = r11
        L1a:
            if (r0 > r12) goto L3c
            r1 = 0
        L1d:
            int r2 = r13.length()     // Catch: java.lang.Throwable -> L3e
            if (r1 >= r2) goto L3b
            char r2 = r13.charAt(r1)     // Catch: java.lang.Throwable -> L3e
            char r2 = java.lang.Character.toUpperCase(r2)     // Catch: java.lang.Throwable -> L3e
            int r3 = r0 + r1
            char r3 = r10[r3]     // Catch: java.lang.Throwable -> L3e
            char r3 = java.lang.Character.toUpperCase(r3)     // Catch: java.lang.Throwable -> L3e
            if (r2 == r3) goto L38
            int r0 = r0 + 1
            goto L1a
        L38:
            int r1 = r1 + 1
            goto L1d
        L3b:
            return r0
        L3c:
            r10 = -1
            return r10
        L3e:
            r0 = move-exception
            boolean r1 = com.aide.ui.AIDEEditor.Gj
            if (r1 == 0) goto L59
            r2 = -6688734254017527489(0xa32cd7a2684c413f, double:-3.0274866424174754E-139)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            r1 = r0
            r4 = r9
            r5 = r10
            r8 = r13
            abcd.iy.a8(r1, r2, r4, r5, r6, r7, r8)
        L59:
            goto L5b
        L5a:
            throw r0
        L5b:
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.AIDEEditor.kf(char[], int, int, java.lang.String):int");
    }

    @ey(method = 700080868006087460L)
    private void oa(TextView textView) {
        try {
            if (fN) {
                iy.tp(-1016775636267398875L, this, textView);
            }
            if (this.sg == null) {
                float f2 = getResources().getDisplayMetrics().density * 15.0f;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, f2);
                long j2 = 300;
                objectAnimatorOfFloat.setDuration(j2);
                objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "translationX", f2, 0.0f);
                objectAnimatorOfFloat2.setDuration(j2);
                objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                this.sg = animatorSet;
                animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
                this.sg.addListener(new i());
            }
            this.pO = true;
            if (this.sg.isRunning()) {
                return;
            }
            this.sg.start();
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, -1016775636267398875L, this, textView);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1809361961710492607L)
    public void oy() {
        try {
            if (fN) {
                iy.gn(5956544972459531256L, this);
            }
            getEditorModel().uC(ServiceContainer.J0().sG(getFilePath()));
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 5956544972459531256L, this);
            }
            throw th;
        }
    }

    @ey(method = -3427006376074151559L)
    private void pN() {
        try {
            if (fN) {
                iy.gn(532370262972584640L, this);
            }
            getEditorModel().hx(ServiceContainer.getDebugger().VH(getFilePath()));
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 532370262972584640L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1378633610067468464L)
    public void qP() {
        try {
            if (fN) {
                iy.gn(7573374200463264369L, this);
            }
            this.pO = false;
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 7573374200463264369L, this);
            }
            throw th;
        }
    }

    @ey(method = 2324196101329130175L)
    private void sh() {
        try {
            if (fN) {
                iy.gn(2260943339989744452L, this);
            }
            BR();
            ServiceContainer.J0().u7(this);
            we(new k());
            J0(new l());
            J8(new m());
            XL(new n());
            Ws(new o());
            QX(new p());
            aM(new q());
            getOEditorView().addCaretMoveListener(new r());
            getOEditorView().addCaretMoveListener(new s());
            getOEditorView().addCaretMoveListener(new a());
            getOEditorView().addSelectionListener(new b());
            cT();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 2260943339989744452L, this);
            }
            throw th;
        }
    }

    @ey(method = -1815043668228959500L)
    public void AE() {
        try {
            if (fN) {
                iy.gn(-2315751299049002025L, this);
            }
            if (ServiceContainer.getMainActivity().CU()) {
                return;
            }
            gW();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -2315751299049002025L, this);
            }
            throw th;
        }
    }

    @ey(method = -4140033254815317328L)
    public void An(String str, int i2, boolean z, String str2, String str3, boolean z2, String str4, String str5, int i3, boolean z3) {
        try {
            if (fN) {
                iy.QX(-130193222585299797L, this, new Object[]{str, new Integer(i2), new Boolean(z), str2, str3, new Boolean(z2), str4, str5, new Integer(i3), new Boolean(z3)});
            }
            getScrollView().lg();
            this.n5 = str2;
            this.Q6 = str;
            this.sE = z2;
            this.kf = str3;
            this.iW = str4;
            this.Jl = str5;
            this.eU = i2;
            this.e3 = z;
            Of();
            q7();
            if (i3 >= 0) {
                getEditorModel().ep(i3, z3);
            }
            postDelayed(new e(), 10L);
        } catch (Throwable th) {
            if (Gj) {
                iy.rN(th, -130193222585299797L, this, new Object[]{str, new Integer(i2), new Boolean(z), str2, str3, new Boolean(z2), str4, str5, new Integer(i3), new Boolean(z3)});
            }
            throw th;
        }
    }

    @ey(method = -7551459413089151640L)
    public boolean Cz() {
        try {
            if (fN) {
                iy.gn(-1106501707349121625L, this);
            }
            return getScrollView().er();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -1106501707349121625L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ErrorService.ErrorListener
    @ey(method = 2558661152174499263L)
    public void DW() {
        try {
            if (fN) {
                iy.gn(-703061769670197500L, this);
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -703061769670197500L, this);
            }
            throw th;
        }
    }

    @ey(method = -3529703452461785391L)
    public boolean Gj() {
        try {
            if (fN) {
                iy.gn(-4783792631858568900L, this);
            }
            return getEditorPager().jO();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -4783792631858568900L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ErrorService.ErrorListener
    @ey(method = -4499462764179535375L)
    public void Hw(String str) {
        try {
            if (fN) {
                iy.tp(-2504045107496505144L, this, str);
            }
            if (getFilePath() == null || !getFilePath().equals(str)) {
                return;
            }
            oy();
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, -2504045107496505144L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1825294020516042825L)
    public void IS(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(802558792442458944L, this, new Integer(i2), new Integer(i3));
            }
            getEditorModel().Pa(i2 - 1, i3 - 1, this);
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, 802558792442458944L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2447344916645679435L)
    public SyntaxError Jl(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(-1406410570658642016L, this, new Integer(i2), new Integer(i3));
            }
            return getEditorModel().ba(i3 - 1, i2 - 1);
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, -1406410570658642016L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1063554025049283261L)
    public void MP(int i2) {
        try {
            if (fN) {
                iy.u7(2345225983894423344L, this, i2);
            }
            if (Mr()) {
                getEditorModel().HO(i2);
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, 2345225983894423344L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 696048480904801541L)
    protected boolean Mr() {
        try {
            if (fN) {
                iy.gn(-452157734692310624L, this);
            }
            if (getFilePath() != null && getFilePath().endsWith(".java")) {
                if (!ServiceContainer.isTrainerMode()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -452157734692310624L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 5444508641220316163L)
    protected void Mz() {
        try {
            if (fN) {
                iy.gn(3245862267291523984L, this);
            }
            getEditorPager().Xa();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 3245862267291523984L, this);
            }
            throw th;
        }
    }

    @ey(method = -369691664408399013L)
    public void Nh(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(1140752951352467440L, this, new Integer(i2), new Integer(i3));
            }
            getOEditorView().TI(i3 - 1, i2 - 1);
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, 1140752951352467440L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2522556676086003375L)
    public void Of() {
        try {
            if (fN) {
                iy.gn(4234874556968195904L, this);
            }
            qP();
            View headerView = getScrollView().getHeaderView();
            if (this.Q6 == null) {
                headerView.setVisibility(0);
                headerView.findViewById(com.aide.ui.q.editorHeaderLearnHeader).setVisibility(8);
                headerView.findViewById(com.aide.ui.q.editorHeaderFileInfo).setVisibility(0);
                ((TextView) headerView.findViewById(com.aide.ui.q.editorHeaderFileName)).setText(FileSystem.getName(getFilePath()));
                ((TextView) headerView.findViewById(com.aide.ui.q.editorHeaderDirectoryName)).setText(FileSystem.getParent(getFilePath()));
                ((ImageView) headerView.findViewById(com.aide.ui.q.editorHeaderFileIcon)).setImageResource(AppFileIcons.j6(getFilePath()));
                headerView.findViewById(com.aide.ui.q.editorHeaderFileInfoInner).setOnClickListener(new h());
                return;
            }
            headerView.setVisibility(0);
            headerView.findViewById(com.aide.ui.q.editorHeaderLearnHeader).setVisibility(0);
            headerView.findViewById(com.aide.ui.q.editorHeaderFileInfo).setVisibility(8);
            TextView textView = (TextView) headerView.findViewById(com.aide.ui.q.editorHeaderLearnTaskText);
            TextView textView2 = (TextView) headerView.findViewById(com.aide.ui.q.editorHeaderLearnTaskTitle);
            TextView textView3 = (TextView) headerView.findViewById(com.aide.ui.q.editorHeaderLearnButton);
            TextView textView4 = (TextView) headerView.findViewById(com.aide.ui.q.editorHeaderLearnErrorText);
            TextView textView5 = (TextView) headerView.findViewById(com.aide.ui.q.editorHeaderLearnErrorTitle);
            ProgressBar progressBar = (ProgressBar) headerView.findViewById(com.aide.ui.q.editorHeaderLearnProgress);
            LinearLayout linearLayout = (LinearLayout) headerView.findViewById(com.aide.ui.q.editorHeaderLearnNewLayout);
            linearLayout.setVisibility(this.e3 ? 0 : 8);
            progressBar.setProgress(this.eU);
            progressBar.getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            textView2.setText(this.Q6);
            if (this.n5 != null) {
                textView.setVisibility(0);
                textView3.setVisibility(0);
                textView.setText(Html.fromHtml(this.n5));
                textView3.setText(this.kf);
            } else {
                textView.setVisibility(8);
                textView3.setVisibility(8);
            }
            if (this.Jl == null) {
                textView4.setVisibility(8);
                textView5.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView5.setVisibility(0);
                textView5.setText(this.iW);
                textView4.setText(Html.fromHtml(this.Jl));
            }
            textView2.setTextSize(AndroidHelper.we(getContext()));
            textView.setTextSize(AndroidHelper.J8(getContext()));
            textView3.setTextSize(AndroidHelper.tp(getContext()));
            textView5.setTextSize(AndroidHelper.J0(getContext()));
            textView4.setTextSize(AndroidHelper.J8(getContext()));
            View viewFindViewById = headerView.findViewById(com.aide.ui.q.editorHeaderLearnTask);
            viewFindViewById.setOnClickListener(new f());
            viewFindViewById.setOnFocusChangeListener(new g(textView3));
            if (fN()) {
                float f2 = getResources().getDisplayMetrics().density;
                int i2 = (int) (48.0f * f2);
                viewFindViewById.setPadding(i2, (int) (f2 * 27.0f), i2, 0);
            }
            textView4.getLayoutParams().width = AndroidHelper.gn(getContext());
            textView.getLayoutParams().width = AndroidHelper.gn(getContext());
            progressBar.getLayoutParams().width = AndroidHelper.gn(getContext());
            linearLayout.getLayoutParams().width = AndroidHelper.gn(getContext());
            headerView.requestLayout();
            if (this.sE) {
                oa(textView3);
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 4234874556968195904L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 1587629003174695936L)
    public List<KeyStroke> P8(KeyStrokeCommand keyStrokeCommand) {
        try {
            if (fN) {
                iy.tp(34741116076389807L, this, keyStrokeCommand);
            }
            return ServiceContainer.Mr().j6(keyStrokeCommand);
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, 34741116076389807L, this, keyStrokeCommand);
            }
            throw th;
        }
    }

    @ey(method = 7253280791464454712L)
    public void Pa() {
        try {
            if (fN) {
                iy.gn(-417471673507988887L, this);
            }
            getEditorPager().q7();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -417471673507988887L, this);
            }
            throw th;
        }
    }

    @ey(method = 1487685195011622040L)
    public void Q6() {
        try {
            if (fN) {
                iy.gn(577456884508085857L, this);
            }
            postDelayed(new c(), 100L);
            postDelayed(new d(), 300L);
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 577456884508085857L, this);
            }
            throw th;
        }
    }

    @ey(method = -8529770589447292303L)
    public void QO() {
        try {
            if (fN) {
                iy.gn(1104922286380613096L, this);
            }
            Jm(getSelectionStartLine(), getSelectionStartColumn(), getSelectionStartColumn());
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 1104922286380613096L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 6927328252232542503L)
    protected boolean U2() {
        try {
            if (fN) {
                iy.gn(-695424382273039244L, this);
            }
            if (!this.Z1.lg()) {
                return false;
            }
            this.Z1.EQ();
            return true;
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -695424382273039244L, this);
            }
            throw th;
        }
    }

    @ey(method = -599745761269516659L)
    public void Za(String str, String... strArr) {
        try {
            if (fN) {
                iy.EQ(7006025885812998400L, this, str, strArr);
            }
            getEditorModel().qU(str, strArr);
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, 7006025885812998400L, this, str, strArr);
            }
            throw th;
        }
    }

    @ey(method = -855626179753962243L)
    public OpenFileService.OpenFileModel a5(String str) {
        try {
            if (fN) {
                iy.tp(-632308139103289608L, this, str);
            }
            OpenFileService.OpenFileModel openFileModel = ServiceContainer.getOpenFileService().getOpenFileModel(str);
            if (openFileModel == null) {
                openFileModel = Z1(str);
            }
            getOEditorView().setModel((t) openFileModel);
            getOEditorView().setHidden(false);
            getOEditorView().setEditable(FileSystem.cb(str) ? false : true);
            if (!getOEditorView().uC()) {
                e3();
            }
            oy();
            pN();
            Of();
            ServiceContainer.getEngineService().ei();
            requestLayout();
            return openFileModel;
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, -632308139103289608L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 222651358638063520L)
    public void aX() {
        try {
            if (fN) {
                iy.gn(3286496960378340761L, this);
            }
            this.Z1.gW();
            getScrollView().gW();
            getOEditorView().eU();
            ServiceContainer.J0().Mz(this);
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 3286496960378340761L, this);
            }
            throw th;
        }
    }

    @ey(method = 2933175578631756003L)
    public void cT() {
        try {
            if (fN) {
                iy.gn(-1867792536966241640L, this);
            }
            setIsLightTheme(AppPreferences.BT());
            getOEditorView().setTabSize(AppPreferences.sy());
            getOEditorView().setInsertTabsAsSpaces(AppPreferences.gW());
            q7();
            if (this.Z1 != null) {
                this.Z1.we();
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -1867792536966241640L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -2787538626468799197L)
    public void ca(int i2) {
        try {
            if (fN) {
                iy.u7(-3428581039278677920L, this, i2);
            }
            MP(i2);
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, -3428581039278677920L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1978428025310518397L)
    public void ce() {
        try {
            if (fN) {
                iy.gn(-449238346909656432L, this);
            }
            this.Z1.SI();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -449238346909656432L, this);
            }
            throw th;
        }
    }

    @ey(method = -4127996036962222160L)
    public void e3() {
        try {
            if (fN) {
                iy.gn(3863134655069494683L, this);
            }
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getOEditorView().getWindowToken(), 0);
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 3863134655069494683L, this);
            }
            throw th;
        }
    }

    @ey(method = 5175809662238814291L)
    public void e9(boolean z) {
        try {
            if (fN) {
                iy.Ws(-3418011151020273924L, this, z);
            }
            this.Z1.BT(z);
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, -3418011151020273924L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3132425019376090845L)
    public String eU(int i2) {
        try {
            if (fN) {
                iy.u7(1167144925014085988L, this, i2);
            }
            return new String(getEditorModel().pO(i2 - 1));
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, 1167144925014085988L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 1590199032889348315L)
    protected int ei(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(-2704826598361931856L, this, new Integer(i2), new Integer(i3));
            }
            String lowerCase = getFilePath().toLowerCase();
            if (!lowerCase.endsWith(".htm") && !lowerCase.endsWith(".html") && !lowerCase.endsWith(".css")) {
                if (!Character.isJavaIdentifierPart(BT(i2, i3))) {
                    return -1;
                }
                while (Character.isJavaIdentifierPart(BT(i2, i3))) {
                    i3++;
                }
                return i3;
            }
            if ('-' != BT(i2, i3) && !Character.isJavaIdentifierPart(BT(i2, i3))) {
                return -1;
            }
            while (true) {
                if ('-' != BT(i2, i3) && !Character.isJavaIdentifierPart(BT(i2, i3))) {
                    return i3;
                }
                i3++;
            }
        } finally {
        }
    }

    @ey(method = -3776617197164948411L)
    public boolean gG(int i2, int i3, String str) {
        try {
            if (fN) {
                iy.we(-1216752126205359040L, this, new Integer(i2), new Integer(i3), str);
            }
            if (str.length() == 0) {
                return true;
            }
            t editorModel = getEditorModel();
            int i4 = i2;
            while (true) {
                if (i4 > editorModel.getLineCount()) {
                    return false;
                }
                int i5 = i4 - 1;
                int iKf = kf(editorModel.pO(i5), i4 == i2 ? i3 - 1 : 0, editorModel.getColumnCount(i5) - str.length(), str);
                if (iKf >= 0) {
                    int i6 = iKf + 1;
                    lp(i4, i6, i4, str.length() + i6);
                    return true;
                }
                i4++;
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.U2(th, -1216752126205359040L, this, new Integer(i2), new Integer(i3), str);
            }
            throw th;
        }
    }

    @ey(method = 3788039318051819724L)
    public FileSpan getCurrentFileSpan() {
        try {
            if (fN) {
                iy.gn(2873569192451595435L, this);
            }
            return new FileSpan(getFilePath(), getSelectionStartLine(), getSelectionStartColumn(), getSelectionEndLine(), getSelectionEndColumn());
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 2873569192451595435L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 455726307894290775L)
    public List<KeyStrokeCommand> getCustomEditorCommands() {
        try {
            if (fN) {
                iy.gn(-472952402997984L, this);
            }
            return AppCommands.v5();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -472952402997984L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 5386755318940908240L)
    public float getDefaultFontSize() {
        try {
            if (fN) {
                iy.gn(4295416898325600387L, this);
            }
            return ServiceContainer.isTrainerMode() ? AndroidHelper.EQ(getContext()) : AppPreferences.EQ();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 4295416898325600387L, this);
            }
            throw th;
        }
    }

    @ey(method = -1162640700744218675L)
    public AIDEEditorPager getEditorPager() {
        try {
            if (fN) {
                iy.gn(-4002116622669183600L, this);
            }
            return ServiceContainer.getMainActivity().sh();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -4002116622669183600L, this);
            }
            throw th;
        }
    }

    @ey(method = -240331731533157640L)
    public String getFilePath() {
        try {
            if (fN) {
                iy.gn(261444051990337563L, this);
            }
            return getModel().g3();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 261444051990337563L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -8493324644847172800L)
    public KeyStrokeDetector getKeyStrokeDetector() {
        try {
            if (fN) {
                iy.gn(1096058291009586931L, this);
            }
            return ServiceContainer.getMainActivity().vJ();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 1096058291009586931L, this);
            }
            throw th;
        }
    }

    @ey(method = -3758922143497930200L)
    public OpenFileService.OpenFileModel getModel() {
        try {
            if (fN) {
                iy.gn(18357685421443225L, this);
            }
            return (OpenFileService.OpenFileModel) getOEditorView().getModel();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 18357685421443225L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -3019683072491410115L)
    protected int getQuickKeyBarHeight() {
        try {
            if (fN) {
                iy.gn(5924857858973719512L, this);
            }
            return getActivity().Qq();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 5924857858973719512L, this);
            }
            throw th;
        }
    }

    @ey(method = 2648667853656206200L)
    public String getQuickKeys() {
        try {
            if (fN) {
                iy.gn(-604494273693328183L, this);
            }
            String str = "";
            int indentationSize = getIndentationSize();
            int i2 = 0;
            if (indentationSize % getTabSize() == 0) {
                while (i2 < indentationSize / getTabSize()) {
                    str = str + "\t";
                    i2++;
                }
            } else {
                while (i2 < indentationSize) {
                    str = str + "s";
                    i2++;
                }
            }
            String lowerCase = getFilePath().toLowerCase();
            if (!lowerCase.endsWith(".java") && !lowerCase.endsWith(".js")) {
                if (!lowerCase.endsWith(".xml") && !lowerCase.endsWith(".html") && !lowerCase.endsWith(".htm")) {
                    if (lowerCase.endsWith(".css")) {
                        return str + " { } - : . ; # % ( ) \" ' @ > = [ ] / * !";
                    }
                    return str + " { } ( ) ; , . = \" | & ! [ ] < > + - / *";
                }
                return str + " < > / = \" : @ + ( ) ; , . | & ! [ ] { } _ -";
            }
            return str + " { } ( ) ; , . = \" | & ! [ ] < > + - / * ? : _";
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -604494273693328183L, this);
            }
            throw th;
        }
    }

    @ey(method = 7679164657098090240L)
    public String getSelectionContent() {
        try {
            if (fN) {
                iy.gn(5225148308942381563L, this);
            }
            try {
                Reader selectedRegionReader = getEditorModel().getSelectedRegionReader(getOEditorView().getSelectedRegion());
                StringWriter stringWriter = new StringWriter();
                StreamUtilities.gn(selectedRegionReader, stringWriter);
                return stringWriter.toString();
            } catch (IOException unused) {
                return "";
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 5225148308942381563L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 1886338862176219472L)
    protected float getSideBarPadding() {
        try {
            if (fN) {
                iy.gn(3307461457365089235L, this);
            }
            if (fN()) {
                return getResources().getDisplayMetrics().density * 48.0f;
            }
            return 0.0f;
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 3307461457365089235L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 4276820520918719235L)
    protected int getTextPaddingRight() {
        try {
            if (fN) {
                iy.gn(2191254402361955400L, this);
            }
            return (int) (this.Q6 != null ? getResources().getDisplayMetrics().density * 100.0f : 0.0f);
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 2191254402361955400L, this);
            }
            throw th;
        }
    }

    @ey(method = -108123841504782368L)
    public int iW(int i2) {
        try {
            if (fN) {
                iy.u7(6624497080257828065L, this, i2);
            }
            return getEditorModel().Ak(i2);
        } catch (Throwable th) {
            if (Gj) {
                iy.j3(th, 6624497080257828065L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -8061895583789768445L)
    public void lp(int i2, int i3, int i4, int i5) {
        try {
            if (fN) {
                iy.J0(4144468653215293212L, this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            super.lp(i2, i3, i4, i5);
            ServiceContainer.getNavigateService().VH(getCurrentFileSpan());
        } catch (Throwable th) {
            if (Gj) {
                iy.a8(th, 4144468653215293212L, this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -6253511135159160L)
    public void n5() {
        try {
            if (fN) {
                iy.gn(-1240547819092225017L, this);
            }
            getScrollView().EQ();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -1240547819092225017L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 1815732885648807860L)
    protected int nw(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(-1396253017292813833L, this, new Integer(i2), new Integer(i3));
            }
            String lowerCase = getFilePath().toLowerCase();
            if (!lowerCase.endsWith(".htm") && !lowerCase.endsWith(".html") && !lowerCase.endsWith(".css")) {
                if (!Character.isJavaIdentifierPart(BT(i2, i3))) {
                    return -1;
                }
                while (i3 >= 1 && Character.isJavaIdentifierPart(BT(i2, i3))) {
                    i3--;
                }
                return i3 + 1;
            }
            if ('-' != BT(i2, i3) && !Character.isJavaIdentifierPart(BT(i2, i3))) {
                return -1;
            }
            while (i3 >= 1 && ('-' == BT(i2, i3) || Character.isJavaIdentifierPart(BT(i2, i3)))) {
                i3--;
            }
            return i3 + 1;
        } finally {
        }
    }

    @ey(method = -4387818277263292335L)
    public void pO(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(-2005779031716892644L, this, new Integer(i2), new Integer(i3));
            }
            getEditorModel().sM(i3 - 1, i2 - 1, this);
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, -2005779031716892644L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 7316970640379649405L)
    public void q7() {
        try {
            if (fN) {
                iy.gn(-4960589092752546012L, this);
            }
            getOEditorView().setFontSize(getDefaultFontSize());
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -4960589092752546012L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -978437269612415129L)
    protected boolean ro() {
        try {
            if (fN) {
                iy.gn(6489966150642360L, this);
            }
            return this.Z1.U2();
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 6489966150642360L, this);
            }
            throw th;
        }
    }

    @ey(method = -1269836313991017225L)
    public void sE(int i2, int i3) {
        try {
            if (fN) {
                iy.EQ(1135410249113379252L, this, new Integer(i2), new Integer(i3));
            }
            getEditorModel().nl(i2, i3);
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, 1135410249113379252L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3926082731067393193L)
    public void sM() {
        try {
            if (fN) {
                iy.gn(119436539881239408L, this);
            }
            getEditorPager().Z1(KD(getSelectionStartLine(), getSelectionStartColumn(), getSelectionStartColumn()));
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 119436539881239408L, this);
            }
            throw th;
        }
    }

    @ey(method = 4240463297087701125L)
    public void sg(int i2, int i3, char c2) {
        try {
            if (fN) {
                iy.we(4937674342774135524L, this, new Integer(i2), new Integer(i3), new Character(c2));
            }
            getEditorModel().e9(i2 - 1, i3 - 1, c2, this);
        } catch (Throwable th) {
            if (Gj) {
                iy.U2(th, 4937674342774135524L, this, new Integer(i2), new Integer(i3), new Character(c2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 1812825710479292144L)
    protected void x9(int i2, int i3, boolean z) {
        try {
            if (fN) {
                iy.we(4201896351248737985L, this, new Integer(i2), new Integer(i3), new Boolean(z));
            }
            if (z) {
                Bx(i2 + 1, i3 + 1);
            }
            ServiceContainer.ro().x9();
        } catch (Throwable th) {
            if (Gj) {
                iy.U2(th, 4201896351248737985L, this, new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -5711527336059424328L)
    protected void yO() {
        try {
            if (fN) {
                iy.gn(2691669392354723957L, this);
            }
            getScrollView().U2();
            int selectionStartLine = getSelectionStartLine();
            int selectionStartColumn = getSelectionStartColumn();
            SyntaxError syntaxErrorBT = ServiceContainer.J0().BT(getFilePath(), selectionStartLine, selectionStartColumn, selectionStartLine, selectionStartColumn);
            if (syntaxErrorBT != null && syntaxErrorBT.Hw() && syntaxErrorBT.AL != null && syntaxErrorBT.AL.length > 0) {
                ServiceContainer.J0().I(syntaxErrorBT);
                getScrollView().lg();
                getEditorPager().n5(KD(selectionStartLine, selectionStartColumn, selectionStartColumn));
            } else if (!ServiceContainer.getProjectService().J8()) {
                ys();
            } else {
                getScrollView().lg();
                getEditorPager().n5(KD(selectionStartLine, selectionStartColumn, selectionStartColumn));
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, 2691669392354723957L, this);
            }
            throw th;
        }
    }

    @ey(method = 5081530671700080880L)
    public void ys() {
        try {
            if (fN) {
                iy.gn(-209692910502782245L, this);
            }
            if (getOEditorView().uC()) {
                if ((AndroidHelper.aM(ServiceContainer.getContext()) || AppPreferences.QX()) && !Gj()) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                    inputMethodManager.restartInput(getOEditorView());
                    inputMethodManager.showSoftInput(getOEditorView(), 2);
                    if (getScrollView().er()) {
                        getScrollView().dx(getSelectionStartLine(), getSelectionStartColumn(), getDefaultFontSize(), new j());
                    } else {
                        Q6();
                    }
                }
            }
        } catch (Throwable th) {
            if (Gj) {
                iy.aM(th, -209692910502782245L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -17538762972411175L)
    public AIDEEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (fN) {
                iy.EQ(-86444012191907496L, null, context, attributeSet);
            }
            this.Z1 = new AIDEEditorCompletion(this);
            sh();
        } catch (Throwable th) {
            if (Gj) {
                iy.Mr(th, -86444012191907496L, null, context, attributeSet);
            }
            throw th;
        }
    }

    @cy(clazz = -130523947251704895L, container = -130523947251704895L, user = true)
    private class t extends CodeEditText.CodeEditTextHighlightingModel implements OpenFileService.OpenFileModel {

        @gy
        private static /* synthetic */ boolean Sf;

        @fy
        private static /* synthetic */ boolean ef;

        @dy(field = 455535540901741500L)
        private jg<SyntaxError> KD;

        @dy(field = -805578642565600525L)
        private int SI;

        @dy(field = 2042468312310433604L)
        private CodeModel cb;

        @dy(field = 3332864048313514275L)
        private jg<Boolean> cn;

        @dy(field = -2631224127420349065L)
        private String dx;

        @dy(field = -3522639723713989680L)
        private int ei;

        @dy(field = 5047817094109347968L)
        private int nw;

        @dy(field = -1618556338288149975L)
        private jg<Integer> ro;

        @dy(field = 3010469937051880496L)
        @hy
        final /* synthetic */ AIDEEditor sG;

        @dy(field = -5082402815376459175L)
        private long sh;

        @cy(clazz = 1347075732644523096L, container = -130523947251704895L, user = true)
        class a implements ModelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -8641755873049559735L)
            a() {
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = 2338694736681087285L)
            public void DW(Model model, int i, int i2, int i3, int i4) {
                try {
                    if (mb) {
                        iy.J8(-2032702829279411520L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    t.this.sG.getScrollView().lg();
                    t.this.sG.getActivity().pO();
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, -2032702829279411520L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = -4295068909245651413L)
            public void FH(Model model, int i, int i2, int i3, int i4) {
                try {
                    if (mb) {
                        iy.J8(-1819949523022990788L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    t.this.sG.getScrollView().lg();
                    t.this.sG.getActivity().pO();
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, -1819949523022990788L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = 3581617533205402197L)
            public void Zo(Model model, int i, int i2, int i3, char[] cArr) {
                try {
                    if (mb) {
                        iy.J8(-5553744912609819264L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                    }
                    t.this.sG.getScrollView().lg();
                    t.this.sG.getActivity().pO();
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, -5553744912609819264L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = -142570584314448031L)
            public void yS(Model model) {
                try {
                    if (mb) {
                        iy.tp(6256759074422185296L, this, model);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 6256759074422185296L, this, model);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1347205894645708261L, container = -130523947251704895L, user = true)
        class b implements EditorModel.g {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -350646475808777169L)
            b() {
            }

            @Override // com.aide.ui.views.editor.EditorModel.g
            @ey(method = -6280437961243990075L)
            public void j6(EditorModel editorModel, boolean z) {
                try {
                    if (DW) {
                        iy.EQ(601555019343509220L, this, editorModel, new Boolean(z));
                    }
                    t.this.sG.getActivity().q7();
                    t.this.sG.getActivity().eU();
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 601555019343509220L, this, editorModel, new Boolean(z));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1347336056650956720L, container = -130523947251704895L, user = true)
        class c implements EditorModel.i {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 526990663915601264L)
            c() {
            }

            @Override // com.aide.ui.views.editor.EditorModel.i
            @ey(method = 5444530419633701264L)
            public void DW(EditorModel editorModel, boolean z) {
                try {
                    if (DW) {
                        iy.EQ(887334674942814632L, this, editorModel, new Boolean(z));
                    }
                    t.this.sG.getActivity().q7();
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 887334674942814632L, this, editorModel, new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.EditorModel.i
            @ey(method = -2852960508379885295L)
            public void FH() {
                try {
                    if (DW) {
                        iy.gn(1879033052300743677L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 1879033052300743677L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.EditorModel.i
            @ey(method = -2898356330106455153L)
            public void Hw() {
                try {
                    if (DW) {
                        iy.gn(-37258594671574685L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -37258594671574685L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.EditorModel.i
            @ey(method = -4769499632909789743L)
            public void Zo() {
                try {
                    if (DW) {
                        iy.gn(-82905655932115247L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -82905655932115247L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.EditorModel.i
            @ey(method = 3677655856448521739L)
            public void j6(List<UndoStack.j> list) {
                try {
                    if (DW) {
                        iy.tp(-13744008617158885L, this, list);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -13744008617158885L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.EditorModel.i
            @ey(method = -3108310565670626992L)
            public void v5(EditorModel editorModel, boolean z) {
                try {
                    if (DW) {
                        iy.EQ(1358656445936640000L, this, editorModel, new Boolean(z));
                    }
                    t.this.sG.getActivity().q7();
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 1358656445936640000L, this, editorModel, new Boolean(z));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1347466218660268473L, container = -130523947251704895L, user = true)
        class d implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 624693635604268923L)
            final /* synthetic */ int WB;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 7368920881280515048L)
            d(int i) {
                this.WB = i;
            }

            @Override // java.lang.Runnable
            @ey(method = -1747019182596153312L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(3606770979995374000L, this);
                    }
                    if (ServiceContainer.getLicenseService().v5(ServiceContainer.getMainActivity())) {
                        t.this.oT(this.WB);
                        ServiceContainer.getProjectService().jO("debug-aide");
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 3606770979995374000L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1347596380673643520L, container = -130523947251704895L, user = true)
        class e implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(e.class);
            }

            @ey(method = -3378156025788057164L)
            e() {
            }

            @Override // java.lang.Runnable
            @ey(method = -1098016000103815125L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(6385947198189234173L, this);
                    }
                    t.this.wc(0, t.this.getLineCount());
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 6385947198189234173L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -22120878625770267L, container = -22120878625770267L, user = true)
        private class f implements ModelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = 25952984336660909L)
            final /* synthetic */ t WB;

            static {
                iy.Zo(f.class);
            }

            @ey(method = 80238159810742725L)
            private f(t tVar) {
                try {
                    if (mb) {
                        iy.tp(1982821823055197351L, null, tVar);
                    }
                    this.WB = tVar;
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 1982821823055197351L, null, tVar);
                    }
                    throw th;
                }
            }

            @ey(method = 2142955421279349845L)
            private void VH() {
                try {
                    if (mb) {
                        iy.gn(3728048114697245859L, this);
                    }
                    if (!ServiceContainer.getDebugger().aM() || this.WB.dx == null) {
                        return;
                    }
                    if (this.WB.dx.endsWith(".java") || this.WB.dx.endsWith(".xml")) {
                        ServiceContainer.getDebugger().ef();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 3728048114697245859L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = 5049263232695992465L)
            public void DW(Model model, int i, int i2, int i3, int i4) {
                try {
                    if (mb) {
                        iy.J8(101894744248829555L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    if (this.WB.KD != null) {
                        this.WB.KD.Mr(i2, i, i4, i3);
                    }
                    if (this.WB.ro != null) {
                        this.WB.ro.Mr(i2, i, i4, i3);
                    }
                    if (this.WB.cn != null) {
                        this.WB.cn.Mr(i2, i, i4, i3);
                        this.WB.sv();
                    }
                    VH();
                    ServiceContainer.getEngineService().ei();
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, 101894744248829555L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = 3599553918030725375L)
            public void FH(Model model, int i, int i2, int i3, int i4) {
                try {
                    if (mb) {
                        iy.J8(-2563593839728125899L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    if (this.WB.KD != null) {
                        this.WB.KD.Ws(i2, i, i4, i3);
                    }
                    if (this.WB.ro != null) {
                        this.WB.ro.Ws(i2, i, i4, i3);
                    }
                    if (this.WB.cn != null) {
                        this.WB.cn.Ws(i2, i, i4, i3);
                        this.WB.sv();
                    }
                    VH();
                    ServiceContainer.getEngineService().ei();
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, -2563593839728125899L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = -913856500954173231L)
            public void Zo(Model model, int i, int i2, int i3, char[] cArr) {
                try {
                    if (mb) {
                        iy.J8(2348196808105818799L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                    }
                    VH();
                    ServiceContainer.getEngineService().ei();
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, 2348196808105818799L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = -1129235850024852155L)
            public void yS(Model model) {
                try {
                    if (mb) {
                        iy.tp(307927377788972383L, this, model);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 307927377788972383L, this, model);
                    }
                    throw th;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            @ey(method = -7019286286513195824L)
            /* synthetic */ f(t tVar, k kVar) {
                this(tVar);
                try {
                    if (mb) {
                        iy.EQ(-3961703740090015252L, null, tVar, kVar);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -3961703740090015252L, null, tVar, kVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(t.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 503283152329373385L)
        public t(AIDEEditor aIDEEditor, String str) {
            super(aIDEEditor, FileSystem.Mz(str), aIDEEditor.getTabSize());
            try {
                if (ef) {
                    iy.EQ(2608758808681472155L, null, aIDEEditor, str);
                }
                this.sG = aIDEEditor;
                this.ei = -1;
                this.sh = FileSystem.lg(str);
                k1(str);
                fh();
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, 2608758808681472155L, null, aIDEEditor, str);
                }
                throw th;
            }
        }

        @ey(method = -794760246236795553L)
        private void HT() {
            try {
                if (ef) {
                    iy.gn(-2218656426691100184L, this);
                }
                SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("TarinerHintMaps", 0).edit();
                editorEdit.putString(g3(), SerializeHelper.DW(this.ro));
                editorEdit.commit();
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, -2218656426691100184L, this);
                }
                throw th;
            }
        }

        @ey(method = 1250614785399641064L)
        private void b(String str, String... strArr) {
            try {
                if (ef) {
                    iy.EQ(-96322779090788537L, this, str, strArr);
                }
                this.ro = new jg<>();
                String[] strArrSplit = str.split("\n");
                for (int i = 0; i < strArrSplit.length; i++) {
                    String str2 = strArrSplit[i];
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        String str3 = strArr[i2];
                        if (str2.contains(str3)) {
                            String strReplace = str2;
                            for (int i3 = 0; i3 < strArr.length; i3++) {
                                if (i2 != i3 && strReplace.contains(strArr[i3])) {
                                    strReplace = strReplace.replace(strArr[i3], "");
                                }
                            }
                            if (strReplace.indexOf(str3) >= 0) {
                                this.ro.EQ(Integer.valueOf(i2), (i + 1) - 1, (r5 + 1) - 1);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, -96322779090788537L, this, str, strArr);
                }
                throw th;
            }
        }

        @ey(method = 2362985704323607440L)
        private void fh() {
            try {
                if (ef) {
                    iy.gn(490781445062966995L, this);
                }
                this.ro = (jg) SerializeHelper.j6(ServiceContainer.getContext().getSharedPreferences("TarinerHintMaps", 0).getString(g3(), null), null);
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 490781445062966995L, this);
                }
                throw th;
            }
        }

        @ey(method = -431848288726432335L)
        private boolean iK(int i) {
            try {
                if (ef) {
                    iy.u7(-1047653053244502400L, this, i);
                }
                i--;
                if (i < 0) {
                    return false;
                }
                for (int i2 = 0; i2 < getColumnCount(i); i2++) {
                    char cCharAtColumnLine = charAtColumnLine(i2, i);
                    if (cCharAtColumnLine != '\t' && cCharAtColumnLine != ' ') {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, -1047653053244502400L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 44433830340090041L)
        private void k1(String str) {
            try {
                if (ef) {
                    iy.tp(-7512764247842763360L, this, str);
                }
                this.dx = str;
                if (str != null) {
                    this.cb = CodeModelFactory.findCodeModel(str, ServiceContainer.Hw());
                }
                addModelListener(new f(this, null));
                addModelListener(new a());
                k2(new b());
                zh(new c());
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, -7512764247842763360L, this, str);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 2974198844786798181L)
        public void oT(int i) {
            try {
                if (ef) {
                    iy.u7(-13223288390582280L, this, i);
                }
                if (this.cn == null) {
                    this.cn = new jg<>();
                }
                int i2 = i - 1;
                this.cn.EQ(Boolean.TRUE, i2, 0);
                sv();
                yO(0, i2, 0, i);
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, -13223288390582280L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -3029446951884402684L)
        public void sv() {
            try {
                if (ef) {
                    iy.gn(-560518404133858311L, this);
                }
                if (this.cn == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    Position positionV5 = this.cn.v5();
                    while (true) {
                        if (this.cn.gn(Boolean.TRUE, positionV5.getLine(), positionV5.getColumn())) {
                            arrayList.add(Integer.valueOf(positionV5.getLine() + 1));
                        }
                        positionV5 = this.cn.VH(positionV5);
                    }
                } catch (hg unused) {
                    if (arrayList.size() == 0) {
                        this.cn = null;
                    }
                    ServiceContainer.getDebugger().SI(this.dx, arrayList);
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, -560518404133858311L, this);
                }
                throw th;
            }
        }

        @ey(method = -666545595705291264L)
        private String u9(int i, int i2, int i3, int i4) {
            try {
                if (ef) {
                    iy.J0(2626250261154286135L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                Reader readerGj = Gj(new SelectedRegion(i - 1, i2 - 1, i3 - 1, i4 - 2));
                StringWriter stringWriter = new StringWriter();
                try {
                    StreamUtilities.gn(readerGj, stringWriter);
                    return stringWriter.toString();
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.a8(th, 2626250261154286135L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @ey(method = -81913612641124800L)
        public int Ak(int i) {
            try {
                if (ef) {
                    iy.u7(4683907142411168061L, this, i);
                }
                i--;
                if (i < 0) {
                    return 0;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < getColumnCount(i); i3++) {
                    char cCharAtColumnLine = charAtColumnLine(i3, i);
                    if (cCharAtColumnLine == '\t') {
                        int tabSize = this.sG.getTabSize();
                        i2 = ((i2 + tabSize) / tabSize) * tabSize;
                    } else {
                        if (cCharAtColumnLine != ' ') {
                            return i2;
                        }
                        i2++;
                    }
                }
                return i2;
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, 4683907142411168061L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -1801986779129839353L)
        public void BT(int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
            int i7;
            try {
                if (ef) {
                    iy.QX(-31426105974160768L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                }
                String strU9 = u9(i, i2, i3, i4);
                i7 = 6;
                try {
                    PH(i, i2, i3, i4, "");
                    PH(i5, i6, i5, i6, strU9);
                } catch (Throwable th) {
                    th = th;
                    if (Sf) {
                        Object[] objArr = new Object[i7];
                        objArr[0] = new Integer(i);
                        objArr[1] = new Integer(i2);
                        objArr[2] = new Integer(i3);
                        objArr[3] = new Integer(i4);
                        objArr[4] = new Integer(i5);
                        objArr[5] = new Integer(i6);
                        iy.rN(th, -31426105974160768L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i7 = 6;
            }
        }

        @Override // com.aide.ui.views.CodeEditText.CodeEditTextModel
        @ey(method = 2795176243273382829L)
        public void E4(char c2, int i, int i2) {
            boolean zJ6;
            try {
                if (ef) {
                    iy.we(330077302356528672L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                String strG3 = g3();
                String lowerCase = strG3.toLowerCase();
                boolean z = false;
                if (lowerCase.endsWith(".java") || lowerCase.endsWith(".js") || lowerCase.endsWith(".c") || lowerCase.endsWith(".cpp") || lowerCase.endsWith(".h") || lowerCase.endsWith(".cc") || lowerCase.endsWith(".hh") || lowerCase.endsWith(".hpp") || lowerCase.endsWith(".gradle")) {
                    zJ6 = pf.j6(this.sG, c2, i + 1, i2 + 1);
                } else {
                    if (!lowerCase.endsWith(".xml") && !lowerCase.endsWith(".html") && !lowerCase.endsWith(".htm")) {
                        if (lowerCase.endsWith(".css")) {
                            zJ6 = of.j6(this.sG, c2, i + 1, i2 + 1);
                        }
                        if (z || this.cb == null) {
                        }
                        Iterator<Language> it = this.cb.getLanguages().iterator();
                        while (it.hasNext()) {
                            if (it.next().isParenChar(c2)) {
                                List<Modification> listZo = ServiceContainer.getEngineService().Zo(strG3, i + 1, i2 + 1, c2, this.sG.getTabSize());
                                if (listZo == null || listZo.size() <= 0) {
                                    return;
                                }
                                ServiceContainer.ei().DW(listZo);
                                return;
                            }
                        }
                        return;
                    }
                    zJ6 = qf.j6(this.sG, c2, i + 1, i2 + 1);
                }
                z = !zJ6;
                if (z) {
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.U2(th, 330077302356528672L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditText.CodeEditTextModel
        @ey(method = -8142191474448116160L)
        public void Fd(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(-1802376244681340505L, this, new Integer(i), new Integer(i2));
                }
                ServiceContainer.ei().DW(ServiceContainer.getEngineService().v5(g3(), i + 1, i2 + 1, this.sG.getTabSize()));
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, -1802376244681340505L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditText.CodeEditTextModel
        @ey(method = -3753694109826110700L)
        public void GK(int i, int i2, int i3) {
            try {
                if (ef) {
                    iy.we(2005235877146981675L, this, new Integer(i), new Integer(i2), new Integer(i3));
                }
                if (i == this.ei && i2 == this.nw && i3 == this.SI) {
                    return;
                }
                int i4 = this.ei;
                int i5 = this.nw;
                int i6 = this.SI;
                this.nw = i2;
                this.SI = i3;
                this.ei = i;
                if (i4 != -1) {
                    yO(i5, i4, i6, i4);
                }
                yO(this.nw, this.ei, this.SI, this.ei);
            } catch (Throwable th) {
                if (Sf) {
                    iy.U2(th, 2005235877146981675L, this, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @ey(method = -2491454624867284667L)
        public void HO(int i) {
            try {
                if (ef) {
                    iy.u7(5538790248267274656L, this, i);
                }
                if (this.cn != null) {
                    int i2 = i - 1;
                    if (this.cn.tp(i2)) {
                        this.cn.DW(i2, 0, i2, Integer.MAX_VALUE);
                        sv();
                        yO(0, i2, 0, i);
                        return;
                    }
                }
                if ("debug-aide".equals(ServiceContainer.getProjectService().er())) {
                    oT(i);
                } else {
                    MessageBox.ei(ServiceContainer.getMainActivity(), this.sG.getResources().getString(u.dialog_set_breakpoint_title), this.sG.getResources().getString(u.dialog_set_breakpoint_message, "debug-aide"), new d(i));
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, 5538790248267274656L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = 107081565317212464L)
        public void Hw(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(-2126045453847336297L, this, new Integer(i), new Integer(i2));
                }
                ti(i, i2, true);
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, -2126045453847336297L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -8287389809184019968L)
        public int I(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(1170539997343577891L, this, new Integer(i), new Integer(i2));
                }
                SyntaxError syntaxErrorBa = ba(i, i2);
                if (syntaxErrorBa != null) {
                    return syntaxErrorBa.mb;
                }
                return 0;
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, 1170539997343577891L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -4494867959379619668L)
        public void J0(OpenFile openFile) {
            try {
                if (ef) {
                    iy.tp(1711795175088809191L, this, openFile);
                }
                EditorModel.h hVarPN = pN(openFile.charArray);
                openFile.FH = hVarPN.FH;
                openFile.charArray = hVarPN.j6;
                openFile.length = hVarPN.DW;
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, 1711795175088809191L, this, openFile);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditText.CodeEditTextModel
        @ey(method = 671108930927219055L)
        public void Lz(char c2, int i, int i2) {
            try {
                if (ef) {
                    iy.we(2719627599273813112L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                this.sG.Z1.yS(c2, i + 1, i2 + 1);
            } catch (Throwable th) {
                if (Sf) {
                    iy.U2(th, 2719627599273813112L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -4508372579393163000L)
        public boolean Mz(int i) {
            try {
                if (ef) {
                    iy.u7(1056988163105421665L, this, i);
                }
                if (this.cn != null) {
                    if (this.cn.tp(i)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, 1056988163105421665L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = 2303336928902717897L)
        public boolean QX(int i) {
            try {
                if (ef) {
                    iy.u7(-855157984367394956L, this, i);
                }
                return ServiceContainer.getDebugger().j3(this.dx, i + 1);
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, -855157984367394956L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = 1107967574776205496L)
        public List<String> Qq() {
            try {
                if (ef) {
                    iy.gn(3207454585829362533L, this);
                }
                ArrayList arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(getEntireDocument());
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                    } catch (IOException unused) {
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 3207454585829362533L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = 2248234559567007200L)
        public void aM() {
            try {
                if (ef) {
                    iy.gn(339418310822646885L, this);
                }
                try {
                    FileSystem.OW(g3(), getEntireDocument());
                    this.sh = FileSystem.lg(g3());
                    PT();
                    HT();
                    ServiceContainer.EQ().Mz(g3());
                } catch (IOException unused) {
                    Toast.makeText(ServiceContainer.getContext(), g3() + " could not be saved!", 1).show();
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 339418310822646885L, this);
                }
                throw th;
            }
        }

        @ey(method = -1293303740105260101L)
        public SyntaxError ba(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(1275678525370990224L, this, new Integer(i), new Integer(i2));
                }
                jg<SyntaxError> jgVar = this.KD;
                if (jgVar == null || !jgVar.u7(i2, i)) {
                    return null;
                }
                Enumeration<SyntaxError> enumerationHw = jgVar.Hw(i2, i);
                while (enumerationHw.hasMoreElements()) {
                    SyntaxError syntaxErrorNextElement = enumerationHw.nextElement();
                    if (syntaxErrorNextElement.FH()) {
                        return syntaxErrorNextElement;
                    }
                }
                return null;
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, 1275678525370990224L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = 1337901089270981856L)
        public void cb(int i, int i2, int i3, int i4, String str, boolean z, boolean z2) {
            int caretLine;
            int caretColumn;
            try {
                if (ef) {
                    iy.QX(-3048541909658159355L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Boolean(z), new Boolean(z2)});
                }
                this.sG.getKeyStrokeDetector().U2();
                if (z || !z2) {
                    caretLine = 0;
                    caretColumn = 0;
                } else {
                    caretLine = this.sG.getOEditorView().getCaretLine();
                    caretColumn = this.sG.getOEditorView().getCaretColumn();
                }
                PH(i, i2, i3, i4, str);
                if (z || !z2) {
                    return;
                }
                this.sG.getOEditorView().TI(caretColumn, caretLine);
            } catch (Throwable th) {
                if (Sf) {
                    iy.rN(th, -3048541909658159355L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Boolean(z), new Boolean(z2)});
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = 3054347080116071625L)
        public void close() {
            try {
                if (ef) {
                    iy.gn(280799943194602000L, this);
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 280799943194602000L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -3900432459355650368L)
        public boolean cn() {
            try {
                if (ef) {
                    iy.gn(5622173286029490465L, this);
                }
                return !FileSystem.DW(this.sh, FileSystem.lg(g3()));
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 5622173286029490465L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -662394117238774544L)
        public boolean dx(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(4966497562199133735L, this, new Integer(i), new Integer(i2));
                }
                jg<SyntaxError> jgVar = this.KD;
                if (jgVar == null || !jgVar.u7(i2, i)) {
                    return false;
                }
                Enumeration<SyntaxError> enumerationHw = jgVar.Hw(i2, i);
                while (enumerationHw.hasMoreElements()) {
                    if (enumerationHw.nextElement().FH()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, 4966497562199133735L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -136246807539098829L)
        public boolean ef(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(-1550619183666152088L, this, new Integer(i), new Integer(i2));
                }
                jg<SyntaxError> jgVar = this.KD;
                if (jgVar == null || !jgVar.u7(i2, i)) {
                    return false;
                }
                Enumeration<SyntaxError> enumerationHw = jgVar.Hw(i2, i);
                while (enumerationHw.hasMoreElements()) {
                    if (enumerationHw.nextElement().Zo()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, -1550619183666152088L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 3282567495599144145L)
        public void ep(int i, boolean z) {
            try {
                if (ef) {
                    iy.EQ(-1539929373830177400L, this, new Integer(i), new Boolean(z));
                }
                if (this.ro == null) {
                    return;
                }
                try {
                    Position positionV5 = this.ro.v5();
                    while (!this.ro.gn(Integer.valueOf(i), positionV5.getLine(), positionV5.getColumn())) {
                        positionV5 = this.ro.VH(positionV5);
                    }
                    boolean z2 = true;
                    int line = positionV5.getLine() + 1;
                    int column = positionV5.getColumn() + 1;
                    CodeEditTextScrollView scrollView = this.sG.getScrollView();
                    if (line < 20 || !AndroidHelper.j3(this.sG.getContext())) {
                        z2 = false;
                    }
                    scrollView.KD(line, column, z, z2);
                } catch (hg unused) {
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, -1539929373830177400L, this, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -327567771941884608L)
        public String g3() {
            try {
                if (ef) {
                    iy.gn(-1807897604319187001L, this);
                }
                return this.dx;
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, -1807897604319187001L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = 1711391963980707675L)
        public boolean gW() {
            try {
                if (ef) {
                    iy.gn(2301341372614222848L, this);
                }
                return BR();
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 2301341372614222848L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -894213177886769965L)
        public boolean gn(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(3815608394549899728L, this, new Integer(i), new Integer(i2));
                }
                jg<SyntaxError> jgVar = this.KD;
                if (jgVar == null || !jgVar.u7(i2, i)) {
                    return false;
                }
                Enumeration<SyntaxError> enumerationHw = jgVar.Hw(i2, i);
                while (enumerationHw.hasMoreElements()) {
                    if (enumerationHw.nextElement().Hw()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, 3815608394549899728L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditText.CodeEditTextModel
        @ey(method = -296619747613475552L)
        public void hp(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(1168680050765835699L, this, new Integer(i), new Integer(i2));
                }
                List<Modification> listGn = ServiceContainer.getEngineService().gn(g3(), i + 1, i2 + 1, this.sG.getTabSize());
                if (listGn == null || listGn.size() <= 0) {
                    return;
                }
                ServiceContainer.ei().DW(listGn);
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, 1168680050765835699L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -764688669909537483L)
        public void hx(List<Integer> list) {
            try {
                if (ef) {
                    iy.tp(-3316773496435637856L, this, list);
                }
                if (list.size() <= 0) {
                    if (this.cn != null) {
                        this.cn = new jg<>();
                    }
                } else {
                    jg<Boolean> jgVar = new jg<>();
                    Iterator<Integer> it = list.iterator();
                    while (it.hasNext()) {
                        jgVar.EQ(Boolean.TRUE, it.next().intValue() - 1, 0);
                    }
                    this.cn = jgVar;
                }
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, -3316773496435637856L, this, list);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -2927230436389344208L)
        public void j6() {
            try {
                if (ef) {
                    iy.gn(-1826545188763810495L, this);
                }
                int caretLine = this.sG.getOEditorView().getCaretLine();
                int caretColumn = this.sG.getOEditorView().getCaretColumn();
                jg<Integer> jgVar = this.ro;
                try {
                    this.ro = null;
                    qP(FileSystem.Mz(g3()), this);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.ro = jgVar;
                    throw th;
                }
                this.ro = jgVar;
                this.sh = FileSystem.lg(g3());
                this.sG.getOEditorView().TI(caretColumn, caretLine);
                this.sG.oy();
            } catch (Throwable th2) {
                if (Sf) {
                    iy.aM(th2, -1826545188763810495L, this);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = 1493192184605576285L)
        public boolean lp(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(-39087171747555456L, this, new Integer(i), new Integer(i2));
                }
                if (i2 == this.ei && i >= this.nw) {
                    if (i <= this.SI) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, -39087171747555456L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 43476150941213615L)
        public void nl(int i, int i2) {
            try {
                if (ef) {
                    iy.EQ(-1167958758934814340L, this, new Integer(i), new Integer(i2));
                }
                ti(i, i2, false);
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, -1167958758934814340L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -445764364942175617L)
        public void nw(String str) {
            try {
                if (ef) {
                    iy.tp(31967244523921996L, this, str);
                }
                this.dx = str;
                this.sG.Of();
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, 31967244523921996L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 390068785184554773L)
        public void qU(String str, String... strArr) {
            try {
                if (ef) {
                    iy.EQ(-6005780962840048800L, this, str, strArr);
                }
                try {
                    String strReplace = str.replace("\r\n", "\n").replace("$space$", "");
                    String strReplace2 = strReplace;
                    for (String str2 : strArr) {
                        if (strReplace2.contains(str2)) {
                            strReplace2 = strReplace2.replace(str2, "");
                        }
                    }
                    str = strReplace + "\n";
                    qP(new StringReader(strReplace2 + "\n"), this);
                    b(str, strArr);
                    aM();
                } catch (IOException unused) {
                }
                this.sh = FileSystem.lg(g3());
                this.sG.getOEditorView().TI(0, 0);
            } catch (Throwable th) {
                String str3 = str;
                if (Sf) {
                    iy.Mr(th, -6005780962840048800L, this, str3, strArr);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -925655650248610113L)
        public void ro(int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
            int i7;
            try {
                if (ef) {
                    iy.QX(167066138748091152L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                }
                i7 = 6;
                try {
                    PH(i5, i6, i5, i6, u9(i, i2, i3, i4));
                } catch (Throwable th) {
                    th = th;
                    if (Sf) {
                        Object[] objArr = new Object[i7];
                        objArr[0] = new Integer(i);
                        objArr[1] = new Integer(i2);
                        objArr[2] = new Integer(i3);
                        objArr[3] = new Integer(i4);
                        objArr[4] = new Integer(i5);
                        objArr[5] = new Integer(i6);
                        iy.rN(th, 167066138748091152L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i7 = 6;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -3623038636876244144L)
        public boolean sG() {
            try {
                if (ef) {
                    iy.gn(-1062237897848299503L, this);
                }
                return oy();
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, -1062237897848299503L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditText.CodeEditTextModel
        @ey(method = 649171517595938608L)
        public void sT() {
            try {
                if (ef) {
                    iy.gn(8177472781342588017L, this);
                }
                int i = this.ei;
                this.ei = -1;
                yO(this.nw, i, this.SI, i);
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 8177472781342588017L, this);
                }
                throw th;
            }
        }

        @ey(method = 7287359675245576584L)
        public void ti(int i, int i2, boolean z) {
            char cCharAtColumnLine;
            try {
                if (ef) {
                    iy.we(-1002136729533028113L, this, new Integer(i), new Integer(i2), new Boolean(z));
                }
                this.sG.getKeyStrokeDetector().U2();
                if (z && iK(i) && this.sG.getOEditorView().getCaretLine() + 1 != i) {
                    i2 = 0;
                }
                if (Ak(i) != i2 && i2 >= 0) {
                    i--;
                    int i3 = 0;
                    while (i3 < getColumnCount(i) && ((cCharAtColumnLine = charAtColumnLine(i3, i)) == '\t' || cCharAtColumnLine == ' ')) {
                        i3++;
                    }
                    ce(0, i, i3, this);
                    StringBuilder sb = new StringBuilder();
                    if (this.sG.dx()) {
                        for (int i4 = 0; i4 < i2; i4++) {
                            sb.append(' ');
                        }
                    } else {
                        int tabSize = i2 / this.sG.getTabSize();
                        int tabSize2 = i2 % this.sG.getTabSize();
                        for (int i5 = 0; i5 < tabSize; i5++) {
                            sb.append('\t');
                        }
                        for (int i6 = 0; i6 < tabSize2; i6++) {
                            sb.append(' ');
                        }
                    }
                    try {
                        a5(0, i, new StringReader(sb.toString()), this);
                    } catch (IOException unused) {
                    }
                }
            } finally {
            }
        }

        @ey(method = 3949753677240860741L)
        public void uC(List<SyntaxError> list) {
            try {
                if (ef) {
                    iy.tp(-2211907922895838608L, this, list);
                }
                jg<SyntaxError> jgVar = new jg<>();
                for (int size = list.size() - 1; size >= 0; size--) {
                    jgVar.we(list.get(size), list.get(size).jw - 1, list.get(size).fY - 1, list.get(size).qp - 1, list.get(size).k2 - 2);
                }
                this.KD = jgVar;
                this.sG.post(new e());
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, -2211907922895838608L, this, list);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.OpenFileService.OpenFileModel
        @ey(method = -1843307303205528033L)
        public long we() {
            try {
                if (ef) {
                    iy.gn(459352945789334928L, this);
                }
                return Cz();
            } catch (Throwable th) {
                if (Sf) {
                    iy.aM(th, 459352945789334928L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CodeEditText.CodeEditTextModel
        @ey(method = -3199225953713362179L)
        public boolean xg(int i, int i2) {
            boolean z;
            List<Modification> listVH;
            try {
                if (ef) {
                    iy.EQ(557251503083365632L, this, new Integer(i), new Integer(i2));
                }
                String strG3 = g3();
                String lowerCase = strG3.toLowerCase();
                if (lowerCase.endsWith(".java") || lowerCase.endsWith(".js") || lowerCase.endsWith(".c") || lowerCase.endsWith(".cpp") || lowerCase.endsWith(".h") || lowerCase.endsWith(".cc") || lowerCase.endsWith(".hh") || lowerCase.endsWith(".hpp") || lowerCase.endsWith(".gradle")) {
                    z = !pf.DW(this.sG, i + 1, i2 + 1, this.sG.getIndentationSize());
                    if (!z) {
                        return true;
                    }
                } else if (lowerCase.endsWith(".xml") || lowerCase.endsWith(".html") || lowerCase.endsWith(".htm")) {
                    z = !qf.DW(this.sG, i + 1, i2 + 1, this.sG.getIndentationSize());
                    if (!z) {
                        return true;
                    }
                } else if (lowerCase.endsWith(".css")) {
                    z = !of.DW(this.sG, i + 1, i2 + 1, this.sG.getIndentationSize());
                    if (!z) {
                        return true;
                    }
                } else {
                    z = false;
                }
                if (!z || (listVH = ServiceContainer.getEngineService().VH(strG3, i + 1, i2 + 1, this.sG.getTabSize())) == null || listVH.size() <= 0) {
                    return false;
                }
                ServiceContainer.ei().DW(listVH);
                return true;
            } catch (Throwable th) {
                if (Sf) {
                    iy.Mr(th, 557251503083365632L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 128194891331644311L)
        public t(AIDEEditor aIDEEditor) {
            super(aIDEEditor);
            try {
                if (ef) {
                    iy.tp(3286759246869035205L, null, aIDEEditor);
                }
                this.sG = aIDEEditor;
                this.ei = -1;
                k1(null);
            } catch (Throwable th) {
                if (Sf) {
                    iy.j3(th, 3286759246869035205L, null, aIDEEditor);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -830124613733000760L)
    public AIDEEditor(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        try {
            if (fN) {
                iy.we(86966375547369843L, null, context, attributeSet, new Integer(i2));
            }
            this.Z1 = new AIDEEditorCompletion(this);
            sh();
        } catch (Throwable th) {
            if (Gj) {
                iy.U2(th, 86966375547369843L, null, context, attributeSet, new Integer(i2));
            }
            throw th;
        }
    }
}
