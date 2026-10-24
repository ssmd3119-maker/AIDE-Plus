package com.aide.ui.views;

import abcd.cg;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.aide.common.AndroidHelper;
import com.aide.common.AppLog;
import com.aide.common.KeyStroke;
import com.aide.common.KeyStrokeDetector;
import com.aide.engine.FileHighlightings;
import com.aide.engine.StyleSpan;
import com.aide.engine.SyntaxStyleType;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.views.editor.Color;
import com.aide.ui.views.editor.EditorModel;
import com.aide.ui.views.editor.Model;
import com.aide.ui.views.editor.ModelListener;
import com.aide.ui.views.editor.OEditor;
import com.aide.ui.views.editor.SelectedRegion;
import com.aide.ui.views.editor.TextStyle;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 5616629769222192896L, container = 5616629769222192896L, user = true)
/* loaded from: classes.dex */
public class CodeEditText extends ViewGroup {

    @fy
    private static /* synthetic */ boolean cT;

    @gy
    private static /* synthetic */ boolean q7;

    @dy(field = -665619347371124267L)
    private List<d> AL;

    @dy(field = 41896542019301199L)
    private boolean WB;

    @dy(field = -3133269200228085600L)
    private List<d> fY;

    @dy(field = 280579085133287875L)
    private boolean hK;

    @dy(field = -509121157038576543L)
    private List<d> jw;

    @dy(field = 88056481339504500L)
    private List<d> k2;

    @dy(field = 1225166815802363140L)
    private List<d> mb;

    @dy(field = -1225385021968505224L)
    private List<d> qp;

    @dy(field = -2024540634765171537L)
    private List<KeyStrokeCommand> w9;

    @dy(field = -3073441632324944335L)
    private List<d> zh;

    /* JADX INFO: Access modifiers changed from: protected */
    @cy(clazz = 2358818556014640983L, container = 2358818556014640983L, user = true)
    public class EditorView extends OEditor {

        @fy
        private static /* synthetic */ boolean K3;

        @gy
        private static /* synthetic */ boolean OM;

        @dy(field = -501886841939451204L)
        private boolean BN;

        @dy(field = 3504488924049078420L)
        private float C;

        @dy(field = -4813576943496256512L)
        private KeyStrokeDetector.KeyStrokeHandler DP;

        @dy(field = -7590479512267841280L)
        private float F3;

        @dy(field = -40782220820877627L)
        private float ME;

        @dy(field = 666952268520040956L)
        private int S4;

        @dy(field = 3504598866216744619L)
        private float dH;

        @dy(field = -362822906876630043L)
        @hy
        final /* synthetic */ CodeEditText ee;

        @dy(field = 269120445409170912L)
        private Runnable gM;

        @dy(field = 1650753543501019765L)
        private float gy;

        @dy(field = 5575540644925560209L)
        private float h2;

        @dy(field = -40780534564402312L)
        private float ji;

        @dy(field = -801462853925014083L)
        private boolean jn;

        @dy(field = 15080139636182591L)
        private boolean tR;

        /* renamed from: tv, reason: collision with root package name */
        @dy(field = 4843420231646217760L)
        private int f6tv;

        @cy(clazz = 157050855361570380L, container = 2358818556014640983L, user = true)
        class a implements KeyStrokeDetector.KeyStrokeHandler {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -92443745684822824L)
            a() {
            }

            @ey(method = -182519146299093696L)
            private KeyStrokeCommand DW(KeyStroke keyStroke) {
                try {
                    if (DW) {
                        iy.tp(-101413971107968681L, this, keyStroke);
                    }
                    List<KeyStrokeCommand> customEditorCommands = EditorView.this.ee.getCustomEditorCommands();
                    if (customEditorCommands != null) {
                        for (KeyStrokeCommand keyStrokeCommand : customEditorCommands) {
                            List<KeyStroke> listP8 = EditorView.this.ee.P8(keyStrokeCommand);
                            if (listP8 != null) {
                                Iterator<KeyStroke> it = listP8.iterator();
                                while (it.hasNext()) {
                                    if (it.next().equalsKeyStroke(keyStroke)) {
                                        return keyStrokeCommand;
                                    }
                                }
                            }
                        }
                    }
                    for (KeyStrokeCommand keyStrokeCommand2 : EditorView.this.ee.getBasicEditorCommands()) {
                        List<KeyStroke> listP82 = EditorView.this.ee.P8(keyStrokeCommand2);
                        if (listP82 != null) {
                            Iterator<KeyStroke> it2 = listP82.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().equalsKeyStroke(keyStroke)) {
                                    return keyStrokeCommand2;
                                }
                            }
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -101413971107968681L, this, keyStroke);
                    }
                    throw th;
                }
            }

            @Override // com.aide.common.KeyStrokeDetector.KeyStrokeHandler
            @ey(method = -863256365000365000L)
            public boolean j6(KeyStroke keyStroke) {
                try {
                    if (DW) {
                        iy.tp(6512284474480749371L, this, keyStroke);
                    }
                    int keyCode = keyStroke.getKeyCode();
                    if (keyCode != 96 && keyCode != 23) {
                        KeyStrokeCommand keyStrokeCommandDW = DW(keyStroke);
                        if (keyStrokeCommandDW != null) {
                            if (keyStrokeCommandDW.isEnabled()) {
                                keyStrokeCommandDW.run();
                            }
                            return true;
                        }
                        if (keyStroke.Hw()) {
                            EditorView.this.ee.g3(keyStroke.getUnicodeChar());
                            return true;
                        }
                        if (keyStroke.getKeyCode() != 66) {
                            return EditorView.this.ee.I(keyStroke);
                        }
                        EditorView.this.ee.g3('\n');
                        return true;
                    }
                    EditorView.this.ee.yO();
                    return true;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 6512284474480749371L, this, keyStroke);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 157055811690113679L, container = 2358818556014640983L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 103028912323440136L)
            b() {
            }

            @Override // java.lang.Runnable
            @ey(method = 234803935760915021L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-1268670401927613468L, this);
                    }
                    EditorView.this.tR = true;
                    int iC = EditorView.this.C(EditorView.this.ji, EditorView.this.ME);
                    int iME = EditorView.this.ME(EditorView.this.ji, EditorView.this.ME);
                    if (iC <= 0 || iME <= 0) {
                        return;
                    }
                    EditorView.this.performHapticFeedback(0, 1);
                    EditorView.this.ee.yS(iC, EditorView.this.jn(iC, iME), iC, EditorView.this.BN(iC, iME), EditorView.this.ee.jw);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -1268670401927613468L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -765093691166681520L, container = -765093691166681520L, user = true)
        private class c implements cg {

            @gy
            private static /* synthetic */ boolean VH;

            @fy
            private static /* synthetic */ boolean Zo;

            @dy(field = 20613836992776361L)
            private KeyStroke DW;

            @dy(field = 2255771636831371108L)
            private String FH;

            @dy(field = -612436705602317332L)
            private String Hw;

            @dy(field = -5835122964226912817L)
            private OEditor.ActionType j6;

            @dy(field = -2454961025254211892L)
            final /* synthetic */ EditorView v5;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -7707241421907988320L)
            public c(EditorView editorView, String str, KeyStroke keyStroke, OEditor.ActionType actionType) {
                try {
                    if (Zo) {
                        iy.J0(2598772854397153375L, null, editorView, str, keyStroke, actionType);
                    }
                    this.v5 = editorView;
                    this.Hw = getClass().getName() + "." + actionType.name();
                    this.FH = str;
                    this.DW = keyStroke;
                    this.j6 = actionType;
                } catch (Throwable th) {
                    if (VH) {
                        iy.a8(th, 2598772854397153375L, null, editorView, str, keyStroke, actionType);
                    }
                    throw th;
                }
            }

            @Override // abcd.cg
            @ey(method = -939105804665439089L)
            public String Zo() {
                try {
                    if (Zo) {
                        iy.gn(-577364402709441613L, this);
                    }
                    return this.Hw;
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, -577364402709441613L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.command.KeyStrokeCommand
            @ey(method = -3039801133833507576L)
            public KeyStroke getKeyStroke() {
                try {
                    if (Zo) {
                        iy.gn(5936688522790744352L, this);
                    }
                    return this.DW;
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, 5936688522790744352L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.command.KeyStrokeCommand
            @ey(method = -3354167795667214773L)
            public String getName() {
                try {
                    if (Zo) {
                        iy.gn(-1434522280174864353L, this);
                    }
                    return this.FH;
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, -1434522280174864353L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.command.KeyStrokeCommand
            @ey(method = -353489431934453485L)
            public boolean isEnabled() {
                try {
                    if (!Zo) {
                        return true;
                    }
                    iy.gn(1978248492807426175L, this);
                    return true;
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, 1978248492807426175L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.command.KeyStrokeCommand
            @ey(method = -1367359642407504291L)
            public boolean run() {
                try {
                    if (Zo) {
                        iy.gn(-452876711328710735L, this);
                    }
                    this.v5.nl(this.j6).j6();
                    return true;
                } catch (Throwable th) {
                    if (VH) {
                        iy.aM(th, -452876711328710735L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(EditorView.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -228314717292045505L)
        public EditorView(CodeEditText codeEditText, Context context) {
            super(context);
            try {
                if (K3) {
                    iy.EQ(1148678691790867848L, null, codeEditText, context);
                }
                this.ee = codeEditText;
                this.jn = true;
                this.DP = new a();
                mb();
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, 1148678691790867848L, null, codeEditText, context);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -279439340473805179L)
        public int BN(int i, int i2) {
            try {
                if (K3) {
                    iy.EQ(-19239203931313833L, this, new Integer(i), new Integer(i2));
                }
                int iEi = this.ee.ei(i, i2);
                return iEi > 0 ? iEi : i2;
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, -19239203931313833L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 4246552541622586965L)
        public int C(float f, float f2) {
            try {
                if (K3) {
                    iy.EQ(2693574701721900507L, this, new Float(f), new Float(f2));
                }
                return Xa(f, f2) + 1;
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, 2693574701721900507L, this, new Float(f), new Float(f2));
                }
                throw th;
            }
        }

        @ey(method = -605379395935575040L)
        private void K3() {
            try {
                if (K3) {
                    iy.gn(-24231655759179960L, this);
                }
                if (this.gM != null) {
                    removeCallbacks(this.gM);
                    this.gM = null;
                }
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, -24231655759179960L, this);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 198978615085168845L)
        public int ME(float f, float f2) {
            try {
                if (K3) {
                    iy.EQ(830206169620249855L, this, new Float(f), new Float(f2));
                }
                return CU(f, f2) + 1;
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, 830206169620249855L, this, new Float(f), new Float(f2));
                }
                throw th;
            }
        }

        @ey(method = -7131169818336523947L)
        private void ee() {
            try {
                if (K3) {
                    iy.gn(-1521842591617452993L, this);
                }
                this.tR = false;
                if (this.gM == null) {
                    this.gM = new b();
                }
                postDelayed(this.gM, ViewConfiguration.getLongPressTimeout());
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, -1521842591617452993L, this);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -2105724280644032048L)
        public CodeEditTextModel getCodeEditTextEditorModel() {
            try {
                if (K3) {
                    iy.gn(-923924117079584892L, this);
                }
                return (CodeEditTextModel) getEditorModel();
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, -923924117079584892L, this);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -1016684412323395400L)
        public int jn(int i, int i2) {
            try {
                if (K3) {
                    iy.EQ(2475799158445886204L, this, new Integer(i), new Integer(i2));
                }
                int iNw = this.ee.nw(i, i2);
                return iNw > 0 ? iNw : i2;
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, 2475799158445886204L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -162778904625827400L)
        private void mb() {
            try {
                if (K3) {
                    iy.gn(-1308170380189615840L, this);
                }
                setFocusable(true);
                setFocusableInTouchMode(true);
                setNextFocusUpId(this.ee.getNextFocusUpId());
                setId(123412345);
                setCaretVisibility(true);
                this.ee.w9.add(new c(this, "Copy", new KeyStroke(31, false, true, false), OEditor.ActionType.copy_selection));
                this.ee.w9.add(new c(this, "Select All", new KeyStroke(29, false, true, false), OEditor.ActionType.select_all));
                this.ee.w9.add(new c(this, "Delete Character", new KeyStroke(67, false, false, false), OEditor.ActionType.remove_preceding_character));
                this.ee.w9.add(new c(this, "Delete Character Right", new KeyStroke(112, false, false, false), OEditor.ActionType.remove_current_character));
                this.ee.w9.add(new c(this, "Delete Word", new KeyStroke(67, false, true, false), OEditor.ActionType.delete_word_left));
                this.ee.w9.add(new c(this, "Insert Tab", new KeyStroke(61, false, false, false), OEditor.ActionType.insert_tab));
                this.ee.w9.add(new c(this, "Insert Newline", new KeyStroke(66, false, false, false), OEditor.ActionType.insert_line_break));
                this.ee.w9.add(new c(this, "Move to Beginning of File", new KeyStroke(19, false, true, true), OEditor.ActionType.move_caret_to_beginning_of_text));
                this.ee.w9.add(new c(this, "Move to End of File", new KeyStroke(20, false, true, true), OEditor.ActionType.move_caret_to_end_of_text));
                this.ee.w9.add(new c(this, "Move to Beginning of Line", new KeyStroke(122, false, false, false), OEditor.ActionType.move_caret_to_beginning_of_text_in_line));
                this.ee.w9.add(new c(this, "Move to End of Line", new KeyStroke(123, false, false, false), OEditor.ActionType.move_caret_to_end_of_line));
                this.ee.w9.add(new c(this, "Select to Beginning of File", new KeyStroke(19, true, true, true), OEditor.ActionType.move_caret_to_beginning_of_text_select));
                this.ee.w9.add(new c(this, "Select to End of File", new KeyStroke(20, true, true, true), OEditor.ActionType.move_caret_to_end_of_text_select));
                this.ee.w9.add(new c(this, "Select to Beginning of Line", new KeyStroke(122, true, false, false), OEditor.ActionType.move_caret_to_beginning_of_text_in_line_select));
                this.ee.w9.add(new c(this, "Select to End of Line", new KeyStroke(123, true, false, false), OEditor.ActionType.move_caret_to_end_of_line_select));
                this.ee.w9.add(new c(this, "Move Page Up", new KeyStroke(92, false, false, false), OEditor.ActionType.move_caret_page_up));
                this.ee.w9.add(new c(this, "Move Page Down", new KeyStroke(93, false, false, false), OEditor.ActionType.move_caret_page_down));
                this.ee.w9.add(new c(this, "Move Up", new KeyStroke(19, false, false, false), OEditor.ActionType.move_caret_up));
                this.ee.w9.add(new c(this, "Move Down", new KeyStroke(20, false, false, false), OEditor.ActionType.move_caret_down));
                this.ee.w9.add(new c(this, "Move Left", new KeyStroke(21, false, false, false), OEditor.ActionType.move_caret_left));
                this.ee.w9.add(new c(this, "Move Right", new KeyStroke(22, false, false, false), OEditor.ActionType.move_caret_right));
                this.ee.w9.add(new c(this, "Move Word Left", new KeyStroke(21, false, true, false), OEditor.ActionType.move_caret_word_left));
                this.ee.w9.add(new c(this, "Move Word Right", new KeyStroke(22, false, true, false), OEditor.ActionType.move_caret_word_right));
                this.ee.w9.add(new c(this, "Select Page Up", new KeyStroke(92, true, false, false), OEditor.ActionType.move_caret_page_up_select));
                this.ee.w9.add(new c(this, "Select Page Down", new KeyStroke(93, true, false, false), OEditor.ActionType.move_caret_page_down_select));
                this.ee.w9.add(new c(this, "Select Word Left", new KeyStroke(21, true, true, false), OEditor.ActionType.move_caret_word_left_select));
                this.ee.w9.add(new c(this, "Select Word Right", new KeyStroke(22, true, true, false), OEditor.ActionType.move_caret_word_right_select));
                this.ee.w9.add(new c(this, "Select Up", new KeyStroke(19, true, false, false), OEditor.ActionType.move_caret_up_select));
                this.ee.w9.add(new c(this, "Select Down", new KeyStroke(20, true, false, false), OEditor.ActionType.move_caret_down_select));
                this.ee.w9.add(new c(this, "Select Left", new KeyStroke(21, true, false, false), OEditor.ActionType.move_caret_left_select));
                this.ee.w9.add(new c(this, "Select Right", new KeyStroke(22, true, false, false), OEditor.ActionType.move_caret_right_select));
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, -1308170380189615840L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OEditor
        @ey(method = -520802578740089472L)
        public void Ak(char c2, int i, int i2) {
            try {
                if (K3) {
                    iy.we(-6655207630405245912L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                getCodeEditTextEditorModel().Lz(c2, i, i2);
            } catch (Throwable th) {
                if (OM) {
                    iy.U2(th, -6655207630405245912L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -1851103760515640976L)
        public float[] DP(float f) {
            try {
                if (K3) {
                    iy.tp(-1451303435110422320L, this, new Float(f));
                }
                if (isHidden()) {
                    return new float[]{1.0f, 1.0f};
                }
                float f2 = 7.0f / this.h2;
                float f3 = 28.0f / this.h2;
                if (f < f2) {
                    f = f2;
                }
                if (f > f3) {
                    f = f3;
                }
                setFontSize(this.h2 * f);
                return new float[]{getSpaceCharWidth() / this.F3, getFontHeight() / this.gy};
            } catch (Throwable th) {
                if (OM) {
                    iy.j3(th, -1451303435110422320L, this, new Float(f));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OConsole
        @ey(method = -946327550748139524L)
        protected boolean KD() {
            try {
                if (K3) {
                    iy.gn(476955760834570248L, this);
                }
                return this.ee.Mr();
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, 476955760834570248L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OEditor
        @ey(method = -3901719052247080455L)
        public void N0(int i, int i2) {
            try {
                if (K3) {
                    iy.EQ(-2730864670465441329L, this, new Integer(i), new Integer(i2));
                }
                getCodeEditTextEditorModel().Fd(i, i2);
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, -2730864670465441329L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 8051049397606499592L)
        public void OM(int i, int i2, int i3, int i4) {
            try {
                if (K3) {
                    iy.J0(87189558061092160L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                getEditorModel().b1();
                int i5 = i2 - 1;
                int i6 = i - 1;
                TI(i5, i6);
                boolean z = true;
                Lz(i5, i6, true);
                sT(i4 - 1, i3 - 1);
                if (i == i3 && i2 == i4) {
                    z = false;
                }
                setSelectionVisibility(z);
            } catch (Throwable th) {
                if (OM) {
                    iy.a8(th, 87189558061092160L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @ey(method = 3963991898159184051L)
        public void Qs() {
            try {
                if (K3) {
                    iy.gn(-2531104762208255167L, this);
                }
                if (isHidden()) {
                    return;
                }
                this.h2 = getFontSize();
                this.gy = getFontHeight();
                this.F3 = getSpaceCharWidth();
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, -2531104762208255167L, this);
                }
                throw th;
            }
        }

        @ey(method = 7897581068427422987L)
        public Rect dH(int i, int i2, int i3) {
            try {
                if (K3) {
                    iy.we(7013548902839098065L, this, new Integer(i), new Integer(i2), new Integer(i3));
                }
                int i4 = i - 1;
                float fEv = Ev(i4);
                float fontHeight = getFontHeight() + fEv;
                float fKo = ko(i2 - 1, i4);
                float fKo2 = ko(i3 - 1, i4);
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                return new Rect((int) (fKo + f), (int) (fEv + f2), (int) (f + fKo2), (int) (f2 + fontHeight));
            } catch (Throwable th) {
                if (OM) {
                    iy.U2(th, 7013548902839098065L, this, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OEditor
        @ey(method = 3079451026868305824L)
        public void eN(int i, int i2) {
            try {
                if (K3) {
                    iy.EQ(-92101786895355776L, this, new Integer(i), new Integer(i2));
                }
                getCodeEditTextEditorModel().hp(i, i2);
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, -92101786895355776L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 4591957819698467625L)
        public KeyStrokeDetector.KeyStrokeHandler getKeyStrokeHandler() {
            try {
                if (K3) {
                    iy.gn(7013235005099860095L, this);
                }
                return this.DP;
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, 7013235005099860095L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OConsole
        @ey(method = -6334694741011546312L)
        protected float getSideBarPaddingLeft() {
            try {
                if (K3) {
                    iy.gn(-838730645095009216L, this);
                }
                return this.ee.getSideBarPadding();
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, -838730645095009216L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OConsole
        @ey(method = 3730335361187037175L)
        protected boolean hasFocusWrapper() {
            try {
                if (K3) {
                    iy.gn(3882547160574629013L, this);
                }
                if (!super.hasFocusWrapper()) {
                    if (!this.ee.ro()) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, 3882547160574629013L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OEditor
        @ey(method = 18041800348278840L)
        public void iK(int i, int i2) {
            try {
                if (K3) {
                    iy.EQ(2554860363176106708L, this, new Integer(i), new Integer(i2));
                }
                if (getCodeEditTextEditorModel().xg(i, i2)) {
                    return;
                }
                super.iK(i, i2);
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, 2554860363176106708L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OConsole
        @ey(method = -1298471901000971496L)
        public void initColors() {
            Color color;
            try {
                if (K3) {
                    iy.gn(4440002696943163840L, this);
                }
                super.initColors();
                if (this.ee == null) {
                    return;
                }
                if (AndroidHelper.lg(getContext())) {
                    this.selectionColor = new Color(getResources().getColor(this.ee.sG() ? 2131034151 : 2131034150));
                } else {
                    this.selectionColor = new Color(getResources().getColor(this.ee.sG() ? 2131034149 : 2131034148));
                }
                this.graphicsColor = new Color(getResources().getColor(this.ee.sG() ? 2131034135 : 2131034134));
                Color color2 = null;
                if (this.jn) {
                    color = new Color(getResources().getColor(this.ee.sG() ? 2131034139 : 2131034138));
                } else {
                    color = null;
                }
                this.Za = color;
                if (this.jn) {
                    color2 = new Color(getResources().getColor(this.ee.sG() ? 2131034155 : 2131034154));
                }
                this.stepbarColor = color2;
                this.Pa = new Color(getResources().getColor(this.ee.sG() ? 2131034137 : 2131034136));
                this.separatorColor = new Color(getResources().getColor(this.ee.sG() ? 2131034153 : 2131034152));
                this.hyperlinkColor = new Color(getResources().getColor(this.ee.sG() ? 2131034145 : 2131034144));
                this.Bx = new Color(getResources().getColor(this.ee.sG() ? 2131034143 : 2131034142));
                this.Jm = new Color(getResources().getColor(this.ee.sG() ? 2131034141 : 2131034140));
                this.An = new Color(getResources().getColor(this.ee.sG() ? 2131034147 : 2131034146));
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, 4440002696943163840L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.OEditor
        @ey(method = -1215339684573743136L)
        public void k1(char c2, int i, int i2) {
            try {
                if (K3) {
                    iy.we(4668491176527269700L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                getCodeEditTextEditorModel().E4(c2, i, i2);
            } catch (Throwable th) {
                if (OM) {
                    iy.U2(th, 4668491176527269700L, this, new Character(c2), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.view.View
        @ey(method = 4236045432210564441L)
        public boolean onCheckIsTextEditor() {
            try {
                if (!K3) {
                    return true;
                }
                iy.gn(6648870067658653335L, this);
                return true;
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, 6648870067658653335L, this);
                }
                throw th;
            }
        }

        @Override // android.view.View
        @ey(method = 977280965530421160L)
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            try {
                if (K3) {
                    iy.tp(680990107870503552L, this, editorInfo);
                }
                if (AndroidHelper.a8(getContext())) {
                    editorInfo.imeOptions = 1342177281;
                    editorInfo.inputType = 131217;
                } else if (AndroidHelper.U2(getContext())) {
                    editorInfo.imeOptions = 1342177280;
                    editorInfo.inputType = 1;
                } else if (AndroidHelper.er()) {
                    editorInfo.imeOptions = 1342177281;
                    editorInfo.inputType = 1;
                } else {
                    editorInfo.imeOptions = 1342177281;
                }
                return this.ee.getKeyStrokeDetector().createInputConnection(this, this.DP);
            } catch (Throwable th) {
                if (OM) {
                    iy.j3(th, 680990107870503552L, this, editorInfo);
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
        @Override // android.view.View, android.view.KeyEvent.Callback
        @ey(method = 161711492239482900L)
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            try {
                if (K3) {
                    iy.EQ(430987089562994064L, this, new Integer(i), keyEvent);
                }
                try {
                    if (this.ee.getKeyStrokeDetector().onKeyDown(i, keyEvent, this.DP)) {
                        return true;
                    }
                    i = super.onKeyDown(i, keyEvent);
                    return i;
                } catch (Throwable th) {
                    AppLog.j6(th);
                    return true;
                }
            } catch (Throwable th2) {
                if (OM) {
                    iy.Mr(th2, 430987089562994064L, this, new Integer(i), keyEvent);
                }
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
        @Override // android.view.View, android.view.KeyEvent.Callback
        @ey(method = 12427027313809093L)
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            try {
                if (K3) {
                    iy.EQ(-6512005121637667345L, this, new Integer(i), keyEvent);
                }
                if (i == 4) {
                    try {
                        if (this.ee.U2()) {
                            return true;
                        }
                    } catch (Throwable th) {
                        AppLog.j6(th);
                        return true;
                    }
                }
                if (this.ee.getKeyStrokeDetector().onKeyUp(i, keyEvent, this.DP)) {
                    return true;
                }
                i = super.onKeyUp(i, keyEvent);
                return i;
            } catch (Throwable th2) {
                if (OM) {
                    iy.Mr(th2, -6512005121637667345L, this, new Integer(i), keyEvent);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.views.editor.OConsole, android.view.View
        @ey(method = 741847058342149745L)
        protected void onMeasure(int i, int i2) {
            try {
                if (K3) {
                    iy.EQ(-797855985508639605L, this, new Integer(i), new Integer(i2));
                }
                super.onMeasure(i, i2);
                WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
                int width = windowManager.getDefaultDisplay().getWidth();
                int height = windowManager.getDefaultDisplay().getHeight();
                int iMax = Math.max(getMeasuredWidth() + this.ee.getTextPaddingRight(), width);
                if (this.ee.j3()) {
                    setMeasuredDimension(iMax, getMeasuredHeight() + height);
                } else {
                    setMeasuredDimension(iMax, Math.max(getMeasuredHeight(), height));
                }
            } catch (Throwable th) {
                if (OM) {
                    iy.Mr(th, -797855985508639605L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.view.View
        @ey(method = 384866070323454711L)
        protected void onRestoreInstanceState(Parcelable parcelable) {
            try {
                if (K3) {
                    iy.tp(141779242700562365L, this, parcelable);
                }
                if (!(parcelable instanceof Bundle)) {
                    super.onRestoreInstanceState(parcelable);
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
                OM(bundle.getInt("selStartLine"), bundle.getInt("selStartColumn"), bundle.getInt("selEndLine"), bundle.getInt("selEndColumn"));
                setFontSize(bundle.getFloat("fontSize"));
            } catch (Throwable th) {
                if (OM) {
                    iy.j3(th, 141779242700562365L, this, parcelable);
                }
                throw th;
            }
        }

        @Override // android.view.View
        @ey(method = 1764278775877021008L)
        protected Parcelable onSaveInstanceState() {
            try {
                if (K3) {
                    iy.gn(4381377538756418420L, this);
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("instanceState", super.onSaveInstanceState());
                bundle.putInt("selStartLine", this.ee.getSelectionStartLine());
                bundle.putInt("selStartColumn", this.ee.getSelectionStartColumn());
                bundle.putInt("selEndLine", this.ee.getSelectionEndLine());
                bundle.putInt("selEndColumn", this.ee.getSelectionEndColumn());
                bundle.putFloat("fontSize", getFontSize());
                return bundle;
            } catch (Throwable th) {
                if (OM) {
                    iy.aM(th, 4381377538756418420L, this);
                }
                throw th;
            }
        }

        @Override // android.view.View
        @ey(method = -3426099783612728800L)
        public boolean onTouchEvent(MotionEvent motionEvent) {
            try {
                if (K3) {
                    iy.tp(-689802070243700040L, this, motionEvent);
                }
                try {
                    if (isHidden()) {
                        return true;
                    }
                    this.ji = motionEvent.getX();
                    this.ME = motionEvent.getY();
                    int action = motionEvent.getAction();
                    boolean zRN = AndroidHelper.rN(motionEvent);
                    boolean z = this.ee.getKeyStrokeDetector() != null && this.ee.getKeyStrokeDetector().isCtrl();
                    if (this.ji < this.hx) {
                        if (action == 1) {
                            this.ee.ca(C(this.ji, this.ME));
                        }
                        return true;
                    }
                    if (!this.ee.WB && !z) {
                        if (zRN) {
                            if (AndroidHelper.yS(motionEvent)) {
                                int iC = C(this.ji, this.ME);
                                int iME = ME(this.ji, this.ME);
                                if (iC >= 0) {
                                    this.ee.yS(iC, iME, iC, iME, this.ee.qp);
                                }
                            } else if (action == 0) {
                                this.BN = true;
                                System.currentTimeMillis();
                                this.C = this.ji;
                                this.dH = this.ME;
                                int iC2 = C(this.ji, this.ME);
                                int iME2 = ME(this.ji, this.ME);
                                if (iC2 >= 0) {
                                    this.ee.yS(iC2, iME2, iC2, iME2, this.ee.fY);
                                }
                            } else if (action == 2 && this.BN) {
                                int iC3 = C(this.ji, this.ME);
                                int iME3 = ME(this.ji, this.ME);
                                int iC4 = C(this.C, this.dH);
                                int iME4 = ME(this.C, this.dH);
                                if (iC4 >= 0 && iC3 >= 0 && (iC3 != iC4 || iME3 != iME4)) {
                                    this.ee.yS(iC3, iME3, iC4, iME4, this.ee.zh);
                                }
                            }
                        } else if (action == 0) {
                            ee();
                        } else if (action != 2) {
                            if (action == 3) {
                                K3();
                            } else if (action == 1) {
                                K3();
                                if (!this.tR) {
                                    int iC5 = C(this.ji, this.ME);
                                    int iME5 = ME(this.ji, this.ME);
                                    if (iC5 >= 0) {
                                        this.ee.getKeyStrokeDetector().U2();
                                        playSoundEffect(0);
                                        this.ee.yS(iC5, iME5, iC5, iME5, this.ee.AL);
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    int iC6 = C(this.ji, this.ME);
                    int iNw = this.ee.nw(iC6, ME(this.ji, this.ME));
                    if (action == 0) {
                        ee();
                        this.f6tv = -1;
                        this.S4 = -1;
                        if (iNw != -1) {
                            this.S4 = iNw;
                            this.f6tv = iC6;
                            getCodeEditTextEditorModel().GK(iC6 - 1, iNw - 1, this.ee.ei(iC6, iNw) - 2);
                        }
                    } else if (action == 2) {
                        if (this.S4 != -1 && (iNw != this.S4 || iC6 != this.f6tv)) {
                            this.f6tv = -1;
                            this.S4 = -1;
                            getCodeEditTextEditorModel().sT();
                        }
                    } else if (action == 3) {
                        K3();
                        if (this.S4 != -1) {
                            this.f6tv = -1;
                            this.S4 = -1;
                            getCodeEditTextEditorModel().sT();
                        }
                    } else if (action == 1) {
                        K3();
                        if (this.S4 != -1) {
                            if (!this.tR && iNw == this.S4 && iC6 == this.f6tv) {
                                playSoundEffect(0);
                                performHapticFeedback(1, 1);
                                this.ee.yS(iC6, iNw, iC6, this.ee.ei(iC6, iNw), this.ee.mb);
                            }
                            this.f6tv = -1;
                            this.S4 = -1;
                            getCodeEditTextEditorModel().sT();
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    AppLog.j6(th);
                    return true;
                }
            } catch (Throwable th2) {
                if (OM) {
                    iy.j3(th2, -689802070243700040L, this, motionEvent);
                }
                throw th2;
            }
        }

        @ey(method = -104127527575663239L)
        public void setShowCaretLine(boolean z) {
            try {
                if (K3) {
                    iy.Ws(4874245766825411335L, this, z);
                }
                this.jn = z;
                initColors();
            } catch (Throwable th) {
                if (OM) {
                    iy.j3(th, 4874245766825411335L, this, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1901630198922496251L, container = 1901630198922496251L, user = true)
    public interface d {
        @ey(method = 341428362092777320L)
        void j6(int i, int i2, int i3, int i4);
    }

    static {
        iy.Zo(CodeEditText.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -211360296040372864L)
    public CodeEditText(Context context) {
        super(context);
        try {
            if (cT) {
                iy.tp(1190311263215666487L, null, context);
            }
            this.mb = new ArrayList();
            this.jw = new ArrayList();
            this.fY = new ArrayList();
            this.qp = new ArrayList();
            this.k2 = new ArrayList();
            this.zh = new ArrayList();
            this.AL = new ArrayList();
            this.w9 = new ArrayList();
            sh();
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 1190311263215666487L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2952532014619061225L)
    private void sh() {
        try {
            if (cT) {
                iy.gn(822474894310835664L, this);
            }
            removeAllViews();
            addView(new EditorView(this, getContext()));
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 822474894310835664L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3787971007607219100L)
    public void yS(int i, int i2, int i3, int i4, List<d> list) {
        try {
            if (cT) {
                iy.J8(2580706365016814559L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), list);
            }
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                it.next().j6(i, i2, i3, i4);
            }
        } catch (Throwable th) {
            if (q7) {
                iy.lg(th, 2580706365016814559L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), list);
            }
            throw th;
        }
    }

    @ey(method = 47088064129957344L)
    public char BT(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(-252320290180900389L, this, new Integer(i), new Integer(i2));
            }
            int i3 = i - 1;
            if (i2 > getOEditorView().getEditorModel().getColumnCount(i3)) {
                return (char) 65535;
            }
            return getOEditorView().getEditorModel().charAtColumnLine(i2 - 1, i3);
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -252320290180900389L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3819767587631205305L)
    protected boolean I(KeyStroke keyStroke) {
        try {
            if (!cT) {
                return false;
            }
            iy.tp(2671673370188682544L, this, keyStroke);
            return false;
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 2671673370188682544L, this, keyStroke);
            }
            throw th;
        }
    }

    @ey(method = 696123937089121347L)
    public void J0(d dVar) {
        try {
            if (cT) {
                iy.tp(-438963717745735100L, this, dVar);
            }
            this.jw.add(dVar);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -438963717745735100L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = 656520182458968556L)
    public void J8(d dVar) {
        try {
            if (cT) {
                iy.tp(-826907231879873243L, this, dVar);
            }
            this.fY.add(dVar);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -826907231879873243L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = 100933296887171008L)
    public Rect KD(int i, int i2, int i3) {
        try {
            if (cT) {
                iy.we(-6204798826615519155L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return getOEditorView().dH(i, i2, i3);
        } catch (Throwable th) {
            if (q7) {
                iy.U2(th, -6204798826615519155L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -1311508059071757561L)
    protected boolean Mr() {
        try {
            if (!cT) {
                return false;
            }
            iy.gn(-450476594920151880L, this);
            return false;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -450476594920151880L, this);
            }
            throw th;
        }
    }

    @ey(method = 471579016598203585L)
    protected void Mz() {
        try {
            if (cT) {
                iy.gn(-1711170420478729400L, this);
            }
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -1711170420478729400L, this);
            }
            throw th;
        }
    }

    @ey(method = -1019946018739822328L)
    public boolean OW(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(-144738647171208523L, this, new Integer(i), new Integer(i2));
            }
            if (i >= getSelectionStartLine() && i <= getSelectionEndLine()) {
                return getSelectionStartLine() == getSelectionEndLine() ? i2 >= getSelectionStartColumn() && i2 <= getSelectionEndColumn() : i == getSelectionStartLine() ? i2 >= getSelectionStartColumn() : i != getSelectionEndLine() || i2 <= getSelectionEndColumn();
            }
            return false;
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -144738647171208523L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1887408112765881044L)
    public List<KeyStroke> P8(KeyStrokeCommand keyStrokeCommand) {
        try {
            if (!cT) {
                return null;
            }
            iy.tp(70572871654360175L, this, keyStrokeCommand);
            return null;
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 70572871654360175L, this, keyStrokeCommand);
            }
            throw th;
        }
    }

    @ey(method = -1044348264257154097L)
    public void QX(d dVar) {
        try {
            if (cT) {
                iy.tp(279672225184944720L, this, dVar);
            }
            this.zh.add(dVar);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 279672225184944720L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = 1076697113812247760L)
    public void Qq() {
        try {
            if (cT) {
                iy.gn(694339228241724879L, this);
            }
            getOEditorView().tj();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 694339228241724879L, this);
            }
            throw th;
        }
    }

    @ey(method = 3304858242503738560L)
    public int SI(int i) {
        try {
            if (cT) {
                iy.u7(1792824806016452285L, this, i);
            }
            return getOEditorView().getEditorModel().getColumnCount(i - 1);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 1792824806016452285L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1683887967802642360L)
    public boolean Sf(MotionEvent motionEvent) {
        try {
            if (cT) {
                iy.tp(-4239404298131428521L, this, motionEvent);
            }
            return getScrollView().yS(motionEvent);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -4239404298131428521L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = -1657458212394364479L)
    protected boolean U2() {
        try {
            if (!cT) {
                return false;
            }
            iy.gn(6590098992298214640L, this);
            return false;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 6590098992298214640L, this);
            }
            throw th;
        }
    }

    @ey(method = 1446770620042347272L)
    public void Ws(d dVar) {
        try {
            if (cT) {
                iy.tp(-1186973106305737967L, this, dVar);
            }
            this.k2.add(dVar);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -1186973106305737967L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = 2972699043896002299L)
    public void XG() {
        try {
            if (cT) {
                iy.gn(836959882630109280L, this);
            }
            getKeyStrokeDetector().U2();
            getOEditorView().uD();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 836959882630109280L, this);
            }
            throw th;
        }
    }

    @ey(method = -6248256666382198080L)
    public void XL(d dVar) {
        try {
            if (cT) {
                iy.tp(4916045371520729727L, this, dVar);
            }
            this.qp.add(dVar);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 4916045371520729727L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = -3381550452337804032L)
    public boolean XX(int i, KeyEvent keyEvent) {
        try {
            if (cT) {
                iy.EQ(-632910794410858499L, this, new Integer(i), keyEvent);
            }
            return getOEditorView().onKeyUp(i, keyEvent);
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -632910794410858499L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = 2944500093408126924L)
    public void a8() {
        try {
            if (cT) {
                iy.gn(815954208124536645L, this);
            }
            getOEditorView().fP();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 815954208124536645L, this);
            }
            throw th;
        }
    }

    @ey(method = 1479954044298907980L)
    public void aM(d dVar) {
        try {
            if (cT) {
                iy.tp(-242639034614459433L, this, dVar);
            }
            this.AL.add(dVar);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -242639034614459433L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = 79367077322393355L)
    public void aj(int i, int i2, int i3, int i4, String str) {
        try {
            if (cT) {
                iy.J8(3191567277835687008L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            getOEditorView().getEditorModel().b1();
            getOEditorView().getCodeEditTextEditorModel().PH(i, i2, i3, i4, str);
        } catch (Throwable th) {
            if (q7) {
                iy.lg(th, 3191567277835687008L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            throw th;
        }
    }

    @ey(method = 1621928069765000025L)
    public boolean br(int i, KeyEvent keyEvent) {
        try {
            if (cT) {
                iy.EQ(-2153006389908514560L, this, new Integer(i), keyEvent);
            }
            return getOEditorView().onKeyDown(i, keyEvent);
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -2153006389908514560L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = -4041606485899125295L)
    public void ca(int i) {
        try {
            if (cT) {
                iy.u7(-3798761009502748648L, this, i);
            }
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -3798761009502748648L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -76199895995588463L)
    public void cb() {
        try {
            if (cT) {
                iy.gn(-861234751480079400L, this);
            }
            getOEditorView().qU();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -861234751480079400L, this);
            }
            throw th;
        }
    }

    @ey(method = 4188868481981954076L)
    public void cn() {
        try {
            if (cT) {
                iy.gn(-305688894296610945L, this);
            }
            getScrollView().a8();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -305688894296610945L, this);
            }
            throw th;
        }
    }

    @ey(method = -308995513608201315L)
    public boolean dx() {
        try {
            if (cT) {
                iy.gn(-5805000797686823460L, this);
            }
            return getOEditorView().getInsertTabsAsSpaces();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -5805000797686823460L, this);
            }
            throw th;
        }
    }

    @ey(method = -191293248741187692L)
    public boolean ef() {
        try {
            if (cT) {
                iy.gn(-4218407434636973381L, this);
            }
            return getOEditorView().ep();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -4218407434636973381L, this);
            }
            throw th;
        }
    }

    @ey(method = -1252795497483807079L)
    protected int ei(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(699415783901134420L, this, new Integer(i), new Integer(i2));
            }
            if (!Character.isJavaIdentifierPart(BT(i, i2))) {
                return -1;
            }
            while (Character.isJavaIdentifierPart(BT(i, i2))) {
                i2++;
            }
            return i2;
        } finally {
        }
    }

    @ey(method = 362399267123272560L)
    public void er(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(-1826520106111632201L, this, new Integer(i), new Integer(i2));
            }
            getScrollView().we(i, i2);
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -1826520106111632201L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2110156640526954504L)
    public void g3(char c) {
        try {
            if (cT) {
                iy.tp(-2246321728032171927L, this, new Character(c));
            }
            getOEditorView().hx(c);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -2246321728032171927L, this, new Character(c));
            }
            throw th;
        }
    }

    @ey(method = 657618159855750377L)
    public void gW() {
        try {
            if (cT) {
                iy.gn(344071629639274240L, this);
            }
            if (getOEditorView().hasFocus()) {
                return;
            }
            getOEditorView().requestFocus();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 344071629639274240L, this);
            }
            throw th;
        }
    }

    @ey(method = -61921964299862180L)
    public List<KeyStrokeCommand> getBasicEditorCommands() {
        try {
            if (cT) {
                iy.gn(-3629971340777434851L, this);
            }
            return this.w9;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -3629971340777434851L, this);
            }
            throw th;
        }
    }

    @ey(method = 634542128173139337L)
    public List<KeyStrokeCommand> getCustomEditorCommands() {
        try {
            if (!cT) {
                return null;
            }
            iy.gn(90458215224841128L, this);
            return null;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 90458215224841128L, this);
            }
            throw th;
        }
    }

    @ey(method = 2251184183216574144L)
    public float getDefaultFontSize() {
        try {
            if (!cT) {
                return 10.0f;
            }
            iy.gn(-3462499115543001633L, this);
            return 10.0f;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -3462499115543001633L, this);
            }
            throw th;
        }
    }

    @ey(method = 358705394382591016L)
    public KeyStrokeDetector getKeyStrokeDetector() {
        try {
            if (!cT) {
                return null;
            }
            iy.gn(-7464443793482297953L, this);
            return null;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -7464443793482297953L, this);
            }
            throw th;
        }
    }

    @ey(method = -5079062387868607116L)
    public KeyStrokeDetector.KeyStrokeHandler getKeyStrokeHandler() {
        try {
            if (cT) {
                iy.gn(-6746227620621612165L, this);
            }
            return getOEditorView().getKeyStrokeHandler();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -6746227620621612165L, this);
            }
            throw th;
        }
    }

    @ey(method = 4171832764143421648L)
    public int getLineCount() {
        try {
            if (cT) {
                iy.gn(1398578311914166175L, this);
            }
            return getOEditorView().getEditorModel().getLineCount();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 1398578311914166175L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @ey(method = 3112078369267760256L)
    public EditorView getOEditorView() {
        try {
            if (cT) {
                iy.gn(-161259874223279175L, this);
            }
            return (EditorView) getChildAt(0);
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -161259874223279175L, this);
            }
            throw th;
        }
    }

    @ey(method = 5792378659744159187L)
    protected int getQuickKeyBarHeight() {
        try {
            if (!cT) {
                return 0;
            }
            iy.gn(-2478160775440565784L, this);
            return 0;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -2478160775440565784L, this);
            }
            throw th;
        }
    }

    @ey(method = 1721181749643656751L)
    public CodeEditTextScrollView getScrollView() {
        try {
            if (cT) {
                iy.gn(-2520099999628672580L, this);
            }
            if (getParent() == null) {
                return null;
            }
            return (CodeEditTextScrollView) getParent().getParent().getParent();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -2520099999628672580L, this);
            }
            throw th;
        }
    }

    @ey(method = 2150686726591430040L)
    public int getSelectionEndColumn() {
        try {
            if (cT) {
                iy.gn(-2428243152362306895L, this);
            }
            return getOEditorView().getSelectionVisibility() ? getOEditorView().getSelectedRegion().getEndColumn() + 2 : getSelectionStartColumn();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -2428243152362306895L, this);
            }
            throw th;
        }
    }

    @ey(method = -5119921260997690136L)
    public int getSelectionEndLine() {
        try {
            if (cT) {
                iy.gn(-6780795955401384503L, this);
            }
            return getOEditorView().getSelectionVisibility() ? getOEditorView().getSelectedRegion().getEndLine() + 1 : getSelectionStartLine();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -6780795955401384503L, this);
            }
            throw th;
        }
    }

    @ey(method = 300790618747113197L)
    public int getSelectionStartColumn() {
        try {
            if (cT) {
                iy.gn(44481015631802008L, this);
            }
            return getOEditorView().getSelectionVisibility() ? getOEditorView().getSelectedRegion().getStartColumn() + 1 : getOEditorView().getCaretColumn() + 1;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 44481015631802008L, this);
            }
            throw th;
        }
    }

    @ey(method = 15696913223707925L)
    public int getSelectionStartLine() {
        try {
            if (cT) {
                iy.gn(3529253748419456904L, this);
            }
            return getOEditorView().getSelectionVisibility() ? getOEditorView().getSelectedRegion().getStartLine() + 1 : getOEditorView().getCaretLine() + 1;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 3529253748419456904L, this);
            }
            throw th;
        }
    }

    @ey(method = 6507188311293484320L)
    protected float getSideBarPadding() {
        try {
            if (!cT) {
                return 0.0f;
            }
            iy.gn(3553727069247538675L, this);
            return 0.0f;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 3553727069247538675L, this);
            }
            throw th;
        }
    }

    @ey(method = 284900309212314915L)
    public int getTabSize() {
        try {
            if (cT) {
                iy.gn(-1597624003657152600L, this);
            }
            return getOEditorView().getTabSize();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -1597624003657152600L, this);
            }
            throw th;
        }
    }

    @ey(method = -753450769818524583L)
    protected int getTextPaddingRight() {
        try {
            if (!cT) {
                return 0;
            }
            iy.gn(-2840270013282964416L, this);
            return 0;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -2840270013282964416L, this);
            }
            throw th;
        }
    }

    @ey(method = 201859659481499040L)
    protected boolean j3() {
        try {
            if (!cT) {
                return true;
            }
            iy.gn(4477833587014765317L, this);
            return true;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 4477833587014765317L, this);
            }
            throw th;
        }
    }

    @ey(method = 1837598875113965313L)
    public void kQ() {
        try {
            if (cT) {
                iy.gn(-2440927919094837480L, this);
            }
            getScrollView().nw();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -2440927919094837480L, this);
            }
            throw th;
        }
    }

    @ey(method = 87561921742978719L)
    public void lg() {
        try {
            if (cT) {
                iy.gn(-271470553643901040L, this);
            }
            getOEditorView().b();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -271470553643901040L, this);
            }
            throw th;
        }
    }

    @ey(method = 7075829880143937077L)
    public void lp(int i, int i2, int i3, int i4) {
        try {
            if (cT) {
                iy.J0(6182698433716352224L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            getScrollView().J8(i, i2, i3, i4);
        } catch (Throwable th) {
            if (q7) {
                iy.a8(th, 6182698433716352224L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1502069298542088688L)
    protected int nw(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(-765476085386515205L, this, new Integer(i), new Integer(i2));
            }
            if (!Character.isJavaIdentifierPart(BT(i, i2))) {
                return -1;
            }
            while (i2 >= 1) {
                if (!Character.isJavaIdentifierPart(BT(i, i2))) {
                    break;
                }
                i2--;
            }
            return i2 + 1;
        } finally {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @ey(method = 769469023505231015L)
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            if (cT) {
                iy.J8(6485029411668415420L, this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
        } catch (Throwable th) {
            if (q7) {
                iy.lg(th, 6485029411668415420L, this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -562010905671412032L)
    protected void onMeasure(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(-671940879840174849L, this, new Integer(i), new Integer(i2));
            }
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -671940879840174849L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4677920370854755960L)
    public void rN() {
        try {
            if (cT) {
                iy.gn(2201123540229226039L, this);
            }
            getOEditorView().u9();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 2201123540229226039L, this);
            }
            throw th;
        }
    }

    @ey(method = -875515552608161675L)
    protected boolean ro() {
        try {
            if (!cT) {
                return false;
            }
            iy.gn(-136517057967135048L, this);
            return false;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -136517057967135048L, this);
            }
            throw th;
        }
    }

    @ey(method = -3270414026683670556L)
    public boolean sG() {
        try {
            if (cT) {
                iy.gn(4345501401544518945L, this);
            }
            return this.hK;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 4345501401544518945L, this);
            }
            throw th;
        }
    }

    @ey(method = 1975172546459255368L)
    public void setIdentifierClickingEnabled(boolean z) {
        try {
            if (cT) {
                iy.Ws(623060291071534257L, this, z);
            }
            this.WB = z;
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 623060291071534257L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1605316790055587827L)
    public void setIsLightTheme(boolean z) {
        try {
            if (cT) {
                iy.Ws(-796899567680130660L, this, z);
            }
            this.hK = z;
            getOEditorView().initColors();
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -796899567680130660L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2963034870044495085L)
    public void sy() {
        try {
            if (cT) {
                iy.gn(831583799202591516L, this);
            }
            getKeyStrokeDetector().U2();
            getOEditorView().x6();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 831583799202591516L, this);
            }
            throw th;
        }
    }

    @ey(method = 227007765384756280L)
    public boolean vJ() {
        try {
            if (cT) {
                iy.gn(-3861215333714865175L, this);
            }
            return getOEditorView().HO();
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -3861215333714865175L, this);
            }
            throw th;
        }
    }

    @ey(method = -5269574238784056960L)
    public String vy(int i, int i2, int i3) {
        try {
            if (cT) {
                iy.we(4099035319071165611L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return new String(getOEditorView().getEditorModel().fN(i2 - 1, i - 1, i3 - i2));
        } catch (Throwable th) {
            if (q7) {
                iy.U2(th, 4099035319071165611L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -4518178004562974856L)
    public void we(d dVar) {
        try {
            if (cT) {
                iy.tp(-4567460408920146759L, this, dVar);
            }
            this.mb.add(dVar);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -4567460408920146759L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = -5475463009225980300L)
    protected void x9(int i, int i2, boolean z) {
        try {
            if (cT) {
                iy.we(-441684430863432863L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
        } catch (Throwable th) {
            if (q7) {
                iy.U2(th, -441684430863432863L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1483173544320467068L)
    protected void yO() {
        try {
            if (cT) {
                iy.gn(-1619001099889666035L, this);
            }
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -1619001099889666035L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @cy(clazz = -1223268072130787128L, container = -1223268072130787128L, user = true)
    public class CodeEditTextModel extends EditorModel {

        @fy
        private static /* synthetic */ boolean Mr;

        @gy
        private static /* synthetic */ boolean U2;

        @dy(field = -1036819728209512845L)
        @hy
        final /* synthetic */ CodeEditText j3;

        static {
            iy.Zo(CodeEditTextModel.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 782894760433574603L)
        public CodeEditTextModel(CodeEditText codeEditText, Reader reader, int i) {
            super(reader, false, false, i);
            try {
                if (Mr) {
                    iy.we(996024335478276180L, null, codeEditText, reader, new Integer(i));
                }
                this.j3 = codeEditText;
            } catch (Throwable th) {
                if (U2) {
                    iy.U2(th, 996024335478276180L, null, codeEditText, reader, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 4532698552011401044L)
        public void E4(char c, int i, int i2) {
            try {
                if (Mr) {
                    iy.we(2277424328018211197L, this, new Character(c), new Integer(i), new Integer(i2));
                }
            } catch (Throwable th) {
                if (U2) {
                    iy.U2(th, 2277424328018211197L, this, new Character(c), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 2887940809274861655L)
        public void Fd(int i, int i2) {
            try {
                if (Mr) {
                    iy.EQ(640154681384163104L, this, new Integer(i), new Integer(i2));
                }
            } catch (Throwable th) {
                if (U2) {
                    iy.Mr(th, 640154681384163104L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -3168259797438039369L)
        public void GK(int i, int i2, int i3) {
            try {
                if (Mr) {
                    iy.we(962880769490300596L, this, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (U2) {
                    iy.U2(th, 962880769490300596L, this, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @ey(method = -694710938325719224L)
        public void Lz(char c, int i, int i2) {
            try {
                if (Mr) {
                    iy.we(-379887168407345025L, this, new Character(c), new Integer(i), new Integer(i2));
                }
            } catch (Throwable th) {
                if (U2) {
                    iy.U2(th, -379887168407345025L, this, new Character(c), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 1898740061231961175L)
        public void PH(int i, int i2, int i3, int i4, String str) {
            try {
                if (Mr) {
                    iy.J8(11618313592104432L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
                }
                int i5 = i - 1;
                int i6 = i2 - 1;
                Bx(new SelectedRegion(i5, i6, i3 - 1, i4 - 2), this);
                try {
                    a5(i6, i5, new StringReader(str), this);
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (U2) {
                    iy.lg(th, 11618313592104432L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
                }
                throw th;
            }
        }

        @ey(method = 3991190522081184111L)
        public void hp(int i, int i2) {
            try {
                if (Mr) {
                    iy.EQ(5666115686715652896L, this, new Integer(i), new Integer(i2));
                }
            } catch (Throwable th) {
                if (U2) {
                    iy.Mr(th, 5666115686715652896L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -5928654643363411L)
        public void sT() {
            try {
                if (Mr) {
                    iy.gn(-238976105340308112L, this);
                }
            } catch (Throwable th) {
                if (U2) {
                    iy.aM(th, -238976105340308112L, this);
                }
                throw th;
            }
        }

        @ey(method = 2010671128077554436L)
        public boolean xg(int i, int i2) {
            try {
                if (!Mr) {
                    return false;
                }
                iy.EQ(-752722902714548595L, this, new Integer(i), new Integer(i2));
                return false;
            } catch (Throwable th) {
                if (U2) {
                    iy.Mr(th, -752722902714548595L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -7826128677418443264L)
        public CodeEditTextModel(CodeEditText codeEditText) {
            try {
                if (Mr) {
                    iy.tp(1941560348924272065L, null, codeEditText);
                }
                this.j3 = codeEditText;
            } catch (Throwable th) {
                if (U2) {
                    iy.j3(th, 1941560348924272065L, null, codeEditText);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @cy(clazz = 1226294043232620924L, container = 1226294043232620924L, user = true)
    public class CodeEditTextHighlightingModel extends CodeEditTextModel {

        @gy
        private static /* synthetic */ boolean P8;

        @fy
        private static /* synthetic */ boolean vy;

        @dy(field = 357621627787673460L)
        @hy
        final /* synthetic */ CodeEditText BT;

        @dy(field = -3224159720656427133L)
        private Object a8;

        @dy(field = 4295620718868777417L)
        private Object er;

        @dy(field = 4289136823067058000L)
        private StyleSpan gW;

        @dy(field = -3217269220945360465L)
        private StyleSpan lg;

        @dy(field = -3217347716191154496L)
        private StyleSpan rN;

        @dy(field = 4289024047093066977L)
        private StyleSpan yS;

        @cy(clazz = 1989423584191809607L, container = 1226294043232620924L, user = true)
        class a implements ModelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 90040180491497376L)
            a() {
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = -1164289635293375667L)
            public void DW(Model model, int i, int i2, int i3, int i4) {
                try {
                    if (mb) {
                        iy.J8(-252248195080500295L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    synchronized (CodeEditTextHighlightingModel.this.a8) {
                        CodeEditTextHighlightingModel.this.lg.removeSpan(i2, i, i4, i3);
                    }
                    synchronized (CodeEditTextHighlightingModel.this.er) {
                        CodeEditTextHighlightingModel.this.yS.removeSpan(i2, i, i4, i3);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, -252248195080500295L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = 1964678235247557203L)
            public void FH(Model model, int i, int i2, int i3, int i4) {
                try {
                    if (mb) {
                        iy.J8(3757279508079383685L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    synchronized (CodeEditTextHighlightingModel.this.a8) {
                        CodeEditTextHighlightingModel.this.lg.insertSpan(i2, i, i4, i3);
                    }
                    synchronized (CodeEditTextHighlightingModel.this.er) {
                        CodeEditTextHighlightingModel.this.yS.insertSpan(i2, i, i4, i3);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, 3757279508079383685L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = -1799155123649209755L)
            public void Zo(Model model, int i, int i2, int i3, char[] cArr) {
                try {
                    if (mb) {
                        iy.J8(-401363457101515055L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.lg(th, -401363457101515055L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.views.editor.ModelListener
            @ey(method = -2827578783735097055L)
            public void yS(Model model) {
                try {
                    if (mb) {
                        iy.tp(3656750685633482383L, this, model);
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 3656750685633482383L, this, model);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1989497678522519808L, container = 1226294043232620924L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -75104306437265792L)
            b() {
            }

            @Override // java.lang.Runnable
            @ey(method = -214918913259288076L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(3266992450009721152L, this);
                    }
                    CodeEditTextHighlightingModel.this.yO(0, 0, 0, CodeEditTextHighlightingModel.this.getLineCount());
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 3266992450009721152L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1989571772857293303L, container = 1226294043232620924L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -11677668932491377L)
            c() {
            }

            @Override // java.lang.Runnable
            @ey(method = -458225936505234343L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(4247678803578653308L, this);
                    }
                    CodeEditTextHighlightingModel.this.yO(0, 0, 0, CodeEditTextHighlightingModel.this.getLineCount());
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 4247678803578653308L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(CodeEditTextHighlightingModel.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 103818117135416196L)
        public CodeEditTextHighlightingModel(CodeEditText codeEditText, Reader reader, int i) {
            super(codeEditText, reader, i);
            try {
                if (vy) {
                    iy.we(-2322090337203405780L, null, codeEditText, reader, new Integer(i));
                }
                this.BT = codeEditText;
                this.a8 = new Object();
                this.lg = new StyleSpan();
                this.rN = new StyleSpan();
                this.er = new Object();
                this.yS = new StyleSpan();
                this.gW = new StyleSpan();
                aX();
            } catch (Throwable th) {
                if (P8) {
                    iy.U2(th, -2322090337203405780L, null, codeEditText, reader, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2880868327941215843L)
        private void aX() {
            try {
                if (vy) {
                    iy.gn(-1798707378126370467L, this);
                }
                addModelListener(new a());
            } catch (Throwable th) {
                if (P8) {
                    iy.aM(th, -1798707378126370467L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -2191507519755951584L)
        public int DW(int i, int i2) {
            try {
                if (vy) {
                    iy.EQ(-75120768905740576L, this, new Integer(i), new Integer(i2));
                }
                byte style = this.yS.getStyle(i2, i);
                return style == 0 ? this.lg.getStyle(i2, i) : style;
            } catch (Throwable th) {
                if (P8) {
                    iy.Mr(th, -75120768905740576L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 1780196175913818495L)
        protected void Ej() {
            try {
                if (vy) {
                    iy.gn(-93411212262996993L, this);
                }
                synchronized (this.a8) {
                    StyleSpan styleSpan = this.lg;
                    this.lg = this.rN;
                    this.rN = styleSpan;
                }
                this.BT.post(new b());
            } catch (Throwable th) {
                if (P8) {
                    iy.aM(th, -93411212262996993L, this);
                }
                throw th;
            }
        }

        @ey(method = -5429715026937082495L)
        public void IS(FileHighlightings fileHighlightings) {
            try {
                if (vy) {
                    iy.tp(-4879941282634330367L, this, fileHighlightings);
                }
                cc(fileHighlightings.syntaxStyleTypes, fileHighlightings.startLines, fileHighlightings.startColumns, fileHighlightings.endLines, fileHighlightings.endColumns, fileHighlightings.size);
            } catch (Throwable th) {
                if (P8) {
                    iy.j3(th, -4879941282634330367L, this, fileHighlightings);
                }
                throw th;
            }
        }

        @ey(method = 1625980547818358843L)
        public void Mr(FileHighlightings fileHighlightings) {
            try {
                if (vy) {
                    iy.tp(3061252776964225851L, this, fileHighlightings);
                }
                Od(fileHighlightings.syntaxStyleTypes, fileHighlightings.startLines, fileHighlightings.startColumns, fileHighlightings.endLines, fileHighlightings.endColumns, fileHighlightings.size);
            } catch (Throwable th) {
                if (P8) {
                    iy.j3(th, 3061252776964225851L, this, fileHighlightings);
                }
                throw th;
            }
        }

        @ey(method = 694355594189241411L)
        public void Od(SyntaxStyleType[] syntaxStyleTypeArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) throws Throwable {
            int i2;
            try {
                if (vy) {
                    iy.QX(-7545225582308156925L, this, new Object[]{syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i)});
                }
                i2 = 6;
                try {
                    this.rN.we(syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, i);
                    Ej();
                } catch (Throwable th) {
                    th = th;
                    if (P8) {
                        Object[] objArr = new Object[i2];
                        objArr[0] = syntaxStyleTypeArr;
                        objArr[1] = iArr;
                        objArr[2] = iArr2;
                        objArr[3] = iArr3;
                        objArr[4] = iArr4;
                        objArr[5] = new Integer(i);
                        iy.rN(th, -7545225582308156925L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = 6;
            }
        }

        @ey(method = 7427622821223834276L)
        protected StyleSpan T6() {
            try {
                if (vy) {
                    iy.gn(1740799245948640164L, this);
                }
                return this.rN;
            } catch (Throwable th) {
                if (P8) {
                    iy.aM(th, 1740799245948640164L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = 498766633826923555L)
        public TextStyle Ws(int i) {
            try {
                if (vy) {
                    iy.u7(-3756562937547812765L, this, i);
                }
                SyntaxStyleType syntaxStyleType = SyntaxStyleType.values()[i];
                int color = syntaxStyleType.getColor(this.BT.getContext(), this.BT.sG());
                int i2 = 0;
                if (syntaxStyleType.getTypefaceStyle() == 1) {
                    i2 = 1;
                }
                return new TextStyle(color, i2);
            } catch (Throwable th) {
                if (P8) {
                    iy.j3(th, -3756562937547812765L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 804798669139084725L)
        public void cc(SyntaxStyleType[] syntaxStyleTypeArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) throws Throwable {
            int i2;
            try {
                if (vy) {
                    iy.QX(-1809935377194553227L, this, new Object[]{syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i)});
                }
                i2 = 6;
                try {
                    this.gW.we(syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, i);
                    synchronized (this.er) {
                        StyleSpan styleSpan = this.yS;
                        this.yS = this.gW;
                        this.gW = styleSpan;
                    }
                    this.BT.post(new c());
                } catch (Throwable th) {
                    th = th;
                    if (P8) {
                        Object[] objArr = new Object[i2];
                        objArr[0] = syntaxStyleTypeArr;
                        objArr[1] = iArr;
                        objArr[2] = iArr2;
                        objArr[3] = iArr3;
                        objArr[4] = iArr4;
                        objArr[5] = new Integer(i);
                        iy.rN(th, -1809935377194553227L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = 6;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -1235844295516534041L)
        public int er() {
            try {
                if (vy) {
                    iy.gn(2505584276779261223L, this);
                }
                return SyntaxStyleType.values().length;
            } catch (Throwable th) {
                if (P8) {
                    iy.aM(th, 2505584276779261223L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 13038037258150553L)
        public CodeEditTextHighlightingModel(CodeEditText codeEditText) {
            super(codeEditText);
            try {
                if (vy) {
                    iy.tp(-1609755836714957275L, null, codeEditText);
                }
                this.BT = codeEditText;
                this.a8 = new Object();
                this.lg = new StyleSpan();
                this.rN = new StyleSpan();
                this.er = new Object();
                this.yS = new StyleSpan();
                this.gW = new StyleSpan();
                aX();
            } catch (Throwable th) {
                if (P8) {
                    iy.j3(th, -1609755836714957275L, null, codeEditText);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -16008434376576729L)
    public CodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (cT) {
                iy.EQ(-3287164337045569392L, null, context, attributeSet);
            }
            this.mb = new ArrayList();
            this.jw = new ArrayList();
            this.fY = new ArrayList();
            this.qp = new ArrayList();
            this.k2 = new ArrayList();
            this.zh = new ArrayList();
            this.AL = new ArrayList();
            this.w9 = new ArrayList();
            sh();
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -3287164337045569392L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -658231255645821984L)
    public CodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (cT) {
                iy.we(-2338733607315681331L, null, context, attributeSet, new Integer(i));
            }
            this.mb = new ArrayList();
            this.jw = new ArrayList();
            this.fY = new ArrayList();
            this.qp = new ArrayList();
            this.k2 = new ArrayList();
            this.zh = new ArrayList();
            this.AL = new ArrayList();
            this.w9 = new ArrayList();
            sh();
        } catch (Throwable th) {
            if (q7) {
                iy.U2(th, -2338733607315681331L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
