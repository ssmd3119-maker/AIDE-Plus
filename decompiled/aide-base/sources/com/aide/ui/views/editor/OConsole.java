package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.lg;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.aide.common.StreamUtilities;
import com.aide.ui.views.CodeEditTextScrollView;
import com.aide.uidesigner.ProxyTextView;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

@cy(clazz = -262237004818676723L, container = -262237004818676723L, user = true)
/* loaded from: classes.dex */
public class OConsole extends View implements ModelListener, m {

    @dy(field = 1949957752990880100L)
    private static final Typeface defaultTypeface;

    @gy
    private static /* synthetic */ boolean pn;

    @fy
    private static /* synthetic */ boolean tj;

    @dy(field = 2566385650390578352L)
    private Vector<Boolean> Ak;

    @dy(field = -4334804390215307493L)
    protected Color An;

    @dy(field = 2559911614726739205L)
    protected Color Bx;

    @dy(field = 2866910725643357888L)
    private ColorKind[] Cz;

    @dy(field = -1055669207482531299L)
    private Color[] Gj;

    @dy(field = 2738595920096690415L)
    private boolean HO;

    @dy(field = -3711519089491357188L)
    private float[] HT;

    @dy(field = -6350893267190427800L)
    protected Color Jm;

    @dy(field = -5348611157798344065L)
    private List<d> N0;

    @dy(field = -4534591611391150863L)
    protected int PH;

    @dy(field = 2132885085523181831L)
    protected Color Pa;

    @dy(field = 1571957452297604485L)
    private Color TRANSPARENT;

    @dy(field = -2925284077359749397L)
    protected Color Za;

    @dy(field = -2063794506461010000L)
    private Vector<Integer> b;

    @dy(field = 280554297434630275L)
    private Vector<Boolean> ba;

    @dy(field = -1663492045793133516L)
    private float cT;

    @dy(field = -2148399448091738920L)
    private Caret caret;

    @dy(field = 1548744586260677416L)
    private int caretColumn;

    @dy(field = 3966366223033698264L)
    private int caretLine;

    @dy(field = 2121984106365841696L)
    private boolean caretVisibility;

    @dy(field = 2150543511167590704L)
    private Icon collapsableIcon;

    @dy(field = 1100693653341352009L)
    private Icon collapsedIcon;

    @dy(field = -3565176203966502899L)
    protected int consoleMaxWidth;

    @dy(field = 117758118183070485L)
    private int curReadColumnCount;

    @dy(field = 4542834687954463500L)
    private int curReadLineCount;

    @dy(field = -1479639804923283908L)
    private char[] curReadTextChars;

    @dy(field = -133408938466399064L)
    private Vector<e> d8;

    @dy(field = 5823658983659664420L)
    private Hashtable<Color, Bitmap> dW;

    @dy(field = 958664568395999403L)
    private float deviceFontSize;

    @dy(field = 2085514660214773627L)
    private char[][] e3;

    @dy(field = 179920317194000832L)
    private float eN;

    @dy(field = 620665934069654784L)
    private Graphics ep;

    @dy(field = 2426335215216629660L)
    private Color errorColor;

    @dy(field = -228753218469168040L)
    private Color expressionDisplayColor;

    @dy(field = 2152694325029794368L)
    private Color expressionSteppingPointColor;

    @dy(field = 738652309025384449L)
    private int fN;

    @dy(field = 218171241650868912L)
    private Vector<Integer> fP;

    @dy(field = -3560388903224969360L)
    private Font[] fY;

    @dy(field = -4990390321262895280L)
    private int firstSelectedColumn;

    @dy(field = -6743654992821455436L)
    private int firstSelectedLine;

    @dy(field = 947221388533768023L)
    private String fontFamily;

    @dy(field = 2208143575096495155L)
    private float fontHeight;

    @dy(field = -3235514624129064849L)
    protected Color graphicsColor;

    @dy(field = -1075465565456543112L)
    private float hK;

    @dy(field = -3529916048535312219L)
    private boolean hidden;

    @dy(field = -4839771713173277155L)
    protected float hx;

    @dy(field = 5327153131313833680L)
    protected Color hyperlinkColor;

    @dy(field = 5996705466063952755L)
    private SyncHandler indexingLayoutTask;

    @dy(field = -7296217564961095855L)
    private boolean insertTabsAsSpaces;

    @dy(field = 928354887963218664L)
    private SyncHandler invalidateLayoutTask;

    @dy(field = 3193566615304947776L)
    private boolean k2;

    @dy(field = -7305496481026856496L)
    private int lastSelectedColumn;

    @dy(field = -6119717809379785920L)
    private int lastSelectedLine;

    @dy(field = -1709944965324164520L)
    private Model model;

    @dy(field = 3717989863900529041L)
    protected Set<SelectedRegion> nl;

    @dy(field = 2957710973265982119L)
    private float[] oT;

    @dy(field = -4412641071606729297L)
    private Icon overriddenMethodIcon;

    @dy(field = 5771023800149162976L)
    private Icon overridingMethodIcon;

    @dy(field = -3605458929852091177L)
    private boolean overwriteMode;

    @dy(field = -1555189217447950672L)
    private Color[] oy;

    @dy(field = 4863563529210251392L)
    private boolean[] pN;

    @dy(field = 1734709323903470723L)
    private int pO;

    @dy(field = -2823198857466789780L)
    private float q7;

    @dy(field = -2524999369930775073L)
    private Rect qI;

    @dy(field = 3202924177342552096L)
    private float qU;

    @dy(field = 266376064059874925L)
    private Font qp;

    @dy(field = -113473664204143464L)
    private int[] sE;

    @dy(field = -558727645588171059L)
    private Color selectedRegionTextColor;

    @dy(field = -7508259644398130520L)
    private int selectionAnchorColumn;

    @dy(field = 8069856855114365232L)
    private int selectionAnchorLine;

    @dy(field = -1703759543498941700L)
    protected Color selectionColor;

    @dy(field = 114629994465671757L)
    private Vector<SelectionListener> selectionListenerVector;

    @dy(field = 1514829557640922169L)
    private int selectionPointColumn;

    @dy(field = -1066029306922294079L)
    private int selectionPointLine;

    @dy(field = -2146909569221090779L)
    private boolean selectionVisibility;

    @dy(field = 3137013838062823403L)
    protected Color separatorColor;

    @dy(field = 2310584676857629116L)
    private Color setWarningColor;

    @dy(field = 3325429713572960L)
    private int[] sg;

    @dy(field = -3309990239486423556L)
    private Color softMaxWidthLineColor;

    @dy(field = 226898438190875973L)
    private int softMaxWidthRealColumn;

    @dy(field = 4331827438617115341L)
    private float spaceCharWidth;

    @dy(field = -1112294141927127523L)
    protected Color stepbarColor;

    @dy(field = 2361301415080735033L)
    private int tabSize;

    @dy(field = -1364671873131803157L)
    private Icon testCaseFailedIcon;

    @dy(field = 2172655386945079105L)
    private Icon testCaseFailedPreviouslyIcon;

    @dy(field = 5511665518493543380L)
    private Icon testCasePassedIcon;

    @dy(field = 1494814627440163704L)
    private Icon testCasePassedPreviouslyIcon;

    @dy(field = 1472087723205256833L)
    private TextStyle[] textStyleArray;

    @dy(field = 4985811171320282800L)
    private Set<SelectedRegion> ti;

    @dy(field = -1228660761898680064L)
    private Color todoColor;

    @dy(field = -3858282030370399875L)
    private Color traceColor;

    @dy(field = -4099474102915375968L)
    private Vector<Boolean> u9;

    @dy(field = -5420697835046893000L)
    private float uC;

    @dy(field = -980285414016640919L)
    private float w9;

    @dy(field = -8656746172400536560L)
    private Vector<CaretMoveListener> xg;

    @dy(field = -815795462048430480L)
    private boolean ys;

    @dy(field = -2633030407712182291L)
    private float zf;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -1664231948025490736L, container = -1664231948025490736L, user = true)
    private static final class ColorKind {

        @fy
        private static /* synthetic */ boolean AL;

        @dy(field = -2727645661163582936L)
        public static final ColorKind COLOR;

        @dy(field = -886566012967738840L)
        public static final ColorKind DEBUGGER;

        @dy(field = -2212580301447614436L)
        public static final ColorKind DEBUGGER_END;

        @dy(field = -3225989522178626609L)
        public static final ColorKind DEBUGGER_START;

        @dy(field = -2649206036634522225L)
        public static final ColorKind ERROR;

        @dy(field = -2216567238058936785L)
        public static final ColorKind PLAIN;

        @gy
        private static /* synthetic */ boolean w9;

        @dy(field = 2864001614214517083L)
        private static final /* synthetic */ ColorKind[] zh;

        static {
            try {
                iy.Zo(ColorKind.class);
                if (AL) {
                    iy.gn(-3674457083674234683L, null);
                }
                PLAIN = new ColorKind("PLAIN", 0);
                COLOR = new ColorKind("COLOR", 1);
                ERROR = new ColorKind("ERROR", 2);
                DEBUGGER = new ColorKind("DEBUGGER", 3);
                DEBUGGER_START = new ColorKind("DEBUGGER_START", 4);
                ColorKind colorKind = new ColorKind("DEBUGGER_END", 5);
                DEBUGGER_END = colorKind;
                zh = new ColorKind[]{PLAIN, COLOR, ERROR, DEBUGGER, DEBUGGER_START, colorKind};
            } catch (Throwable th) {
                if (w9) {
                    iy.aM(th, -3674457083674234683L, null);
                }
                throw th;
            }
        }

        @ey(method = 24239436997035351L)
        private ColorKind(String str, int i) {
            try {
                if (AL) {
                    iy.EQ(324149896052909835L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (w9) {
                    iy.Mr(th, 324149896052909835L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -3671164519050720L)
        public static ColorKind valueOf(String str) {
            try {
                if (AL) {
                    iy.tp(882206275583369185L, null, str);
                }
                return (ColorKind) Enum.valueOf(ColorKind.class, str);
            } catch (Throwable th) {
                if (w9) {
                    iy.j3(th, 882206275583369185L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 182085478966974800L)
        public static ColorKind[] values() {
            try {
                if (AL) {
                    iy.gn(1459742693639272431L, null);
                }
                return (ColorKind[]) zh.clone();
            } catch (Throwable th) {
                if (w9) {
                    iy.aM(th, 1459742693639272431L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3467463094141910441L, container = -262237004818676723L, user = true)
    class IndexingLayoutTask extends SyncHandler {

        @gy
        private static /* synthetic */ boolean AL;

        @fy
        private static /* synthetic */ boolean zh;

        static {
            iy.Zo(IndexingLayoutTask.class);
        }

        @ey(method = 139763982741971325L)
        IndexingLayoutTask() {
        }

        @Override // com.aide.ui.views.editor.SyncHandler
        @ey(method = -3562769134176603780L)
        public void FH() {
            try {
                if (zh) {
                    iy.gn(-5841609702304843251L, this);
                }
                OConsole.this.x9();
            } catch (Throwable th) {
                if (AL) {
                    iy.aM(th, -5841609702304843251L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3467408212391585120L, container = -262237004818676723L, user = true)
    class InvalidateLayoutTask extends SyncHandler {

        @gy
        private static /* synthetic */ boolean AL;

        @fy
        private static /* synthetic */ boolean zh;

        static {
            iy.Zo(InvalidateLayoutTask.class);
        }

        @ey(method = -218050678616562591L)
        InvalidateLayoutTask() {
        }

        @Override // com.aide.ui.views.editor.SyncHandler
        @ey(method = -3331402596227700672L)
        public void FH() {
            try {
                if (zh) {
                    iy.gn(-5843900254386291200L, this);
                }
                if (OConsole.this.isShown()) {
                    OConsole.this.requestLayout();
                    OConsole.this.ce();
                }
            } catch (Throwable th) {
                if (AL) {
                    iy.aM(th, -5843900254386291200L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3467517975896299056L, container = -262237004818676723L, user = true)
    static /* synthetic */ class c {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 1394308789888923324L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(c.class);
                if (DW) {
                    iy.gn(1968252432837905895L, null);
                }
                int[] iArr = new int[ColorKind.values().length];
                j6 = iArr;
                try {
                    iArr[ColorKind.PLAIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[ColorKind.COLOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[ColorKind.DEBUGGER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[ColorKind.DEBUGGER_START.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[ColorKind.DEBUGGER_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    j6[ColorKind.ERROR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1968252432837905895L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2678214729635462808L, container = -2678214729635462808L, user = true)
    public interface d {
        @ey(method = 1134139323943123575L)
        void j6();
    }

    @cy(clazz = 2213343099879292185L, container = 2213343099879292185L, user = true)
    public interface e {
        @ey(method = 2663521098745890263L)
        void j6(boolean z);
    }

    static {
        try {
            iy.Zo(OConsole.class);
            if (tj) {
                iy.gn(1968252432837905895L, null);
            }
            defaultTypeface = Typeface.MONOSPACE;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 1968252432837905895L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 21059401915306335L)
    public OConsole(Context context) {
        super(context);
        try {
            if (tj) {
                iy.tp(291602114348378400L, null, context);
            }
            this.tabSize = 4;
            this.softMaxWidthRealColumn = 10000;
            this.fP = new Vector<>();
            this.b = new Vector<>();
            this.ba = new Vector<>();
            this.u9 = new Vector<>();
            this.Ak = new Vector<>();
            this.curReadLineCount = -1;
            this.curReadTextChars = new char[256];
            this.HT = new float[256];
            this.oT = new float[1];
            this.ep = new Graphics(null);
            this.qI = new Rect(0, 0, 0, 0);
            init();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 291602114348378400L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1193995254370286888L)
    private void AE(Graphics graphics) {
        try {
            if (tj) {
                iy.tp(-431748881186430843L, this, graphics);
            }
            if (!this.selectionVisibility || this.ys) {
                return;
            }
            sE(graphics, this.selectionAnchorColumn, this.selectionAnchorLine, this.selectionPointColumn, this.selectionPointLine, Color.BLACK);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -431748881186430843L, this, graphics);
            }
            throw th;
        }
    }

    @ey(method = 481397427120873144L)
    private boolean AL(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-919839575448278127L, this, new Integer(i), new Integer(i2));
            }
            SelectedRegion selectedRegionP8 = this.model.P8();
            if (selectedRegionP8 == null || i2 < selectedRegionP8.getStartLine() || i2 > selectedRegionP8.getEndLine()) {
                return false;
            }
            if (selectedRegionP8.getStartLine() == selectedRegionP8.getEndLine()) {
                if (i < selectedRegionP8.getStartColumn() || i >= selectedRegionP8.getEndColumn()) {
                    return false;
                }
            } else {
                if (i2 == selectedRegionP8.getStartLine() && i < selectedRegionP8.getStartColumn()) {
                    return false;
                }
                if (i2 == selectedRegionP8.getEndLine() && i >= selectedRegionP8.getEndColumn()) {
                    return false;
                }
            }
            return this.model.getColumnCount(i2) != i;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -919839575448278127L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 6419028660705913044L)
    private void AR() {
        char c2;
        try {
            if (tj) {
                iy.gn(7323287139199664983L, this);
            }
            int caretLine = getCaretLine();
            if (n5(caretLine)) {
                while (caretLine > 0) {
                    caretLine--;
                    if (!n5(caretLine)) {
                        readLineText(caretLine);
                        int i = 0;
                        while (i < this.model.getColumnCount(caretLine) && ((c2 = this.curReadTextChars[i]) == '\t' || c2 == ' ')) {
                            i++;
                        }
                        TI(i, caretLine);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 7323287139199664983L, this);
            }
            throw th;
        }
    }

    @ey(method = 2550473919278520417L)
    private void E4() {
        try {
            if (tj) {
                iy.gn(-1353502025132475428L, this);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -1353502025132475428L, this);
            }
            throw th;
        }
    }

    @ey(method = -2203060601107501217L)
    private float FN(int i) {
        try {
            if (tj) {
                iy.u7(-4270644160004326440L, this, i);
            }
            return jO(this.model.getColumnCount(i) - 1, i);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -4270644160004326440L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2928622778456300367L)
    private boolean I(boolean z, SelectedRegion selectedRegion, int i) {
        boolean z2;
        try {
            if (tj) {
                iy.we(-425015743061099400L, this, new Boolean(z), selectedRegion, new Integer(i));
            }
            if (z) {
                z2 = selectedRegion.getStartLine() <= i && i <= selectedRegion.getEndLine();
            } else {
                if (selectedRegion.getStartLine() < i && i <= selectedRegion.getEndLine()) {
                }
            }
            if (!z2) {
                return false;
            }
            int startLine = selectedRegion.getStartLine();
            int i2 = startLine + 1;
            if (this.ba.size() <= i2) {
                this.ba.setSize(i2);
            }
            if (this.ba.get(startLine) == null) {
                return false;
            }
            this.ba.set(startLine, null);
            return true;
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, -425015743061099400L, this, new Boolean(z), selectedRegion, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2282990069802483813L)
    private void IS(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(570928668684081112L, this, graphics, new Integer(i));
            }
            readLineText(i);
            float f = this.hx;
            int i2 = 0;
            while (i2 < this.curReadColumnCount) {
                boolean z = this.selectionVisibility && this.ys && isInSelectedRegion(i2, i);
                int iDW = this.model.DW(i2, i);
                boolean z2 = i2 == 0 && this.curReadColumnCount > 0 && this.curReadTextChars[0] == '\t';
                int i3 = 1;
                for (int i4 = i2 + 1; i4 < this.curReadColumnCount; i4++) {
                    boolean z3 = this.selectionVisibility && this.ys && isInSelectedRegion(i4, i);
                    if (this.model.DW(i4, i) != iDW || z3 != z || (z2 && this.curReadTextChars[i4] != '\t')) {
                        break;
                    }
                    if (this.curReadTextChars[i4] == '\t') {
                        z2 = true;
                    }
                    i3++;
                }
                graphics.setColor(z ? this.selectedRegionTextColor : this.textStyleArray[iDW].FH());
                graphics.setFont(this.fY[iDW]);
                int i5 = i3;
                while (i5 > 0 && this.curReadTextChars[(i2 + i5) - 1] == '\t') {
                    i5--;
                }
                if (i5 > 0) {
                    graphics.drawText(this.curReadTextChars, i2, i5, f, Ev(i + 1) - this.cT);
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i2 + i6;
                    if (i7 < this.HT.length) {
                        f += this.HT[i7];
                    }
                }
                i2 += i3;
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 570928668684081112L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -415713973418848941L)
    private void Jm(float f, float f2, float f3, float f4) {
        try {
            if (tj) {
                iy.J0(2735511222061884240L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            invalidate(new Rect((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4)));
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, 2735511222061884240L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            throw th;
        }
    }

    @ey(method = 4273122886808650071L)
    private void QO(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(-3208957635199716368L, this, graphics, new Integer(i));
            }
            if (this.hx > 0.0f) {
                graphics.setFont(this.qp);
                graphics.setColor(this.An);
                StringBuilder sb = new StringBuilder();
                int i2 = i + 1;
                sb.append(i2);
                sb.append("");
                char[] charArray = sb.toString().toCharArray();
                graphics.drawText(charArray, 0, charArray.length, getSideBarPaddingLeft(), Ev(i2) - this.cT);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -3208957635199716368L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -648433596765129600L)
    private void Za(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(543355410841890481L, this, graphics, new Integer(i));
            }
            if (this.model.EQ() == i) {
                float fJO = jO(this.model.FH(), i) + 2.0f;
                float fEv = Ev(i);
                graphics.setColor(this.expressionSteppingPointColor);
                float f = this.fontHeight;
                float f2 = fJO - (this.spaceCharWidth / 2.0f);
                graphics.drawRect(f2, (this.fontHeight + fEv) - f, 2.0f, f);
                graphics.drawRect(f2, (this.fontHeight + fEv) - 2.0f, (this.spaceCharWidth * 3.0f) / 2.0f, 2.0f);
                graphics.drawRect(((this.spaceCharWidth * 3.0f) / 2.0f) + f2, (this.fontHeight + fEv) - 2.0f, 2.0f, 2.0f);
                graphics.drawRect(((this.spaceCharWidth * 4.0f) / 2.0f) + f2, (this.fontHeight + fEv) - 2.0f, 2.0f, 2.0f);
                graphics.drawRect(((this.spaceCharWidth * 5.0f) / 2.0f) + f2, (this.fontHeight + fEv) - 2.0f, 2.0f, 2.0f);
                graphics.drawRect(f2 + ((this.spaceCharWidth * 6.0f) / 2.0f), (fEv + this.fontHeight) - 2.0f, 2.0f, 2.0f);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 543355410841890481L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 241040299796674920L)
    private void a5(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(2230520194739474183L, this, graphics, new Integer(i));
            }
            graphics.setFont(this.fY[0]);
            readLineText(i);
            ro(graphics, i);
            boolean z = false;
            for (int i2 = 0; i2 < this.curReadColumnCount; i2++) {
                if (this.curReadTextChars[i2] != '\t' && this.HT[i2] > this.w9) {
                    this.w9 = this.HT[i2];
                    z = true;
                }
            }
            if (z) {
                this.invalidateLayoutTask.DW();
            }
            ys(graphics, i);
            IS(graphics, i);
            gG(graphics, i);
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 2230520194739474183L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3139539386752340739L)
    private void aX(Graphics graphics, Icon icon, int i, int i2) {
        try {
            if (tj) {
                iy.J0(1042215886688235152L, this, graphics, icon, new Integer(i), new Integer(i2));
            }
            FN(i2);
            Ev(i2);
            icon.j6();
            throw null;
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, 1042215886688235152L, this, graphics, icon, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1205148160080382240L)
    private void aj() {
        try {
            if (tj) {
                iy.gn(-75643680220215473L, this);
            }
            for (int i = 0; i < this.d8.size(); i++) {
                this.d8.elementAt(i).j6(this.overwriteMode);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -75643680220215473L, this);
            }
            throw th;
        }
    }

    @ey(method = 4535938507175491608L)
    private Bitmap aq(Color color) {
        try {
            if (tj) {
                iy.tp(1393030575020651469L, this, color);
            }
            if (this.dW.containsKey(color)) {
                return this.dW.get(color);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(4096, ((int) this.eN) + 1, Bitmap.Config.ARGB_8888);
            Graphics graphics = new Graphics(new Canvas(bitmapCreateBitmap));
            graphics.setColor(color);
            graphics.Ws(true);
            int i = 0;
            while (i < 4096) {
                float f = i;
                graphics.v5(f, 0.0f, f + this.eN, this.eN - 1.0f, this.zf);
                graphics.v5(f + this.eN, this.eN - 1.0f, f + (this.eN * 2.0f), 0.0f, this.zf);
                i = (int) (f + (this.eN * 2.0f));
            }
            this.dW.put(color, bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 1393030575020651469L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 2671219957176696840L)
    private Color br(int i, int i2, int i3, boolean z) {
        try {
            if (tj) {
                iy.J0(-1221661054938936015L, this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            Color colorJ6 = this.model.QX(i2) ? this.stepbarColor : null;
            if (this.model.a8(i, i2)) {
                colorJ6 = this.Jm;
            }
            if (this.model.U2(i, i2)) {
                colorJ6 = this.Bx;
            }
            if (this.selectionVisibility && ((!this.ys || i <= this.model.getColumnCount(i2)) && this.firstSelectedLine <= i2 && i2 <= this.lastSelectedLine)) {
                if (this.firstSelectedLine == i2) {
                    if (this.lastSelectedLine == i2) {
                        if (i >= this.firstSelectedColumn && i <= this.lastSelectedColumn) {
                            colorJ6 = this.ys ? this.selectionColor : this.Za;
                        }
                    } else if (i >= this.firstSelectedColumn) {
                        colorJ6 = this.ys ? this.selectionColor : this.Za;
                    }
                } else if (this.lastSelectedLine != i2) {
                    colorJ6 = this.ys ? this.selectionColor : this.Za;
                } else if (i <= this.lastSelectedColumn) {
                    colorJ6 = this.ys ? this.selectionColor : this.Za;
                }
            }
            if (colorJ6 == null && ((this.model.P8() != null && this.model.P8().getStartLine() <= i2 && this.model.P8().getEndLine() >= i2) || this.model.EQ() == i2)) {
                colorJ6 = this.stepbarColor;
            }
            if (colorJ6 == null && !z && i < this.model.getColumnCount(i2) && this.model.aj(i, i2)) {
                colorJ6 = this.traceColor;
            }
            if (colorJ6 == null && !getSelectionVisibility() && i2 == getCaretLine() && ((this.Za == null || this.Za.j6() != this.TRANSPARENT.j6()) && this.Za != null && getCaretLine() > 0)) {
                colorJ6 = this.Za;
                Color colorJ62 = this.textStyleArray[i3].j6();
                if (colorJ62 != null) {
                    colorJ6 = new Color((colorJ62.Hw() + (this.Za.Hw() * 1)) / 2, (colorJ62.FH() + (this.Za.FH() * 1)) / 2, (colorJ62.DW() + (this.Za.DW() * 1)) / 2);
                }
            }
            if (colorJ6 == null) {
                colorJ6 = this.textStyleArray[i3].j6();
            }
            return colorJ6 == null ? this.TRANSPARENT : colorJ6;
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, -1221661054938936015L, this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 220401640952620267L)
    private boolean cT() {
        try {
            if (!tj) {
                return false;
            }
            iy.gn(476041079106563928L, this);
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 476041079106563928L, this);
            }
            throw th;
        }
    }

    @ey(method = 3605073759495323889L)
    private void ca(int i, int i2, boolean z) {
        try {
            if (tj) {
                iy.we(-515331965643466308L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            boolean zI = false;
            if (this.nl != null) {
                Iterator<SelectedRegion> it = this.nl.iterator();
                while (it.hasNext()) {
                    zI |= I(z, it.next(), i);
                }
            }
            if (this.ti != null) {
                Iterator<SelectedRegion> it2 = this.ti.iterator();
                while (it2.hasNext()) {
                    zI |= I(z, it2.next(), i);
                }
            }
            if (zI) {
                cn();
                AR();
                ce();
                this.invalidateLayoutTask.DW();
                sy();
            }
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, -515331965643466308L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2937190624409346625L)
    private void cb() {
        try {
            if (tj) {
                iy.gn(-1167272656984943460L, this);
            }
            if (this.u9.size() != 0) {
                this.fP.setSize(this.model.getLineCount());
                this.b.clear();
                int i = 0;
                for (int i2 = 0; i2 < this.model.getLineCount(); i2++) {
                    this.fP.set(i2, Integer.valueOf(i));
                    if (!n5(i2)) {
                        this.b.add(Integer.valueOf(i2));
                        i = (int) (i + this.fontHeight);
                    }
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -1167272656984943460L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3318648235875945457L)
    public void ce() {
        try {
            if (tj) {
                iy.gn(735255933462976160L, this);
            }
            invalidate();
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 735255933462976160L, this);
            }
            throw th;
        }
    }

    @ey(method = 7915248940830272295L)
    private void cn() {
        try {
            if (tj) {
                iy.gn(-2830302942009820520L, this);
            }
            this.u9.clear();
            this.Ak.clear();
            if (this.nl != null) {
                for (SelectedRegion selectedRegion : this.nl) {
                    int startLine = selectedRegion.getStartLine();
                    int i = startLine + 1;
                    if (this.Ak.size() <= i) {
                        this.Ak.setSize(i);
                    }
                    this.Ak.set(startLine, Boolean.TRUE);
                    if (WB(startLine)) {
                        int endLine = selectedRegion.getEndLine();
                        int i2 = endLine + 1;
                        if (this.u9.size() <= i2) {
                            this.u9.setSize(i2);
                        }
                        while (i <= endLine) {
                            this.u9.set(i, Boolean.TRUE);
                            i++;
                        }
                    }
                }
            }
            if (this.ti != null) {
                for (SelectedRegion selectedRegion2 : this.ti) {
                    int startLine2 = selectedRegion2.getStartLine();
                    int i3 = startLine2 + 1;
                    if (this.Ak.size() <= i3) {
                        this.Ak.setSize(i3);
                    }
                    this.Ak.set(startLine2, Boolean.TRUE);
                    if (WB(startLine2)) {
                        int endLine2 = selectedRegion2.getEndLine();
                        int i4 = endLine2 + 1;
                        if (this.u9.size() <= i4) {
                            this.u9.setSize(i4);
                        }
                        while (i3 <= endLine2) {
                            this.u9.set(i3, Boolean.TRUE);
                            i3++;
                        }
                    }
                }
            }
            sh();
            cb();
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -2830302942009820520L, this);
            }
            throw th;
        }
    }

    @ey(method = 5671620376609540045L)
    private void ct(int i, int i2, boolean z) {
        try {
            if (tj) {
                iy.we(725889686980589208L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            if (i < 0 || i2 < 0) {
                i = 0;
                i2 = 0;
            }
            if (this.caretColumn != i || this.caretLine != i2 || this.model.getLineCount() <= this.caretLine || this.model.getColumnCount(this.caretLine) < this.caretColumn) {
                if (i2 >= this.model.getLineCount()) {
                    i2 = this.model.getLineCount() - 1;
                    i = this.model.getColumnCount(i2);
                } else if (i > this.model.getColumnCount(i2)) {
                    i = this.model.getColumnCount(i2);
                }
                int i3 = this.caretColumn;
                int i4 = this.caretLine;
                this.caretColumn = i;
                this.caretLine = i2;
                Qq(i3, i4, z);
                ca(this.caretLine, this.caretColumn, false);
                if (this.caretVisibility) {
                    this.caret.createTimer();
                }
                if (this.Za == null || this.Za.j6() != this.TRANSPARENT.j6()) {
                    MP(i4, i4);
                } else {
                    Of(i3, i4);
                }
                Bx();
                if (this.Za == null || this.Za.j6() != this.TRANSPARENT.j6()) {
                    MP(this.caretLine, this.caretLine);
                }
            }
        } finally {
        }
    }

    @ey(method = -110951253758316415L)
    private int dx(int i, int i2, int i3, int i4) {
        try {
            if (tj) {
                iy.J0(1105279010297062168L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            return lg.j6(i, i2, i3, i4);
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, 1105279010297062168L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -2447585258004916680L)
    private void e3(Graphics graphics) {
        try {
            if (tj) {
                iy.tp(-4571070474019610727L, this, graphics);
            }
            if (getModel().x9() != null) {
                for (int i = 0; i < getModel().x9().size(); i++) {
                    SelectedRegion selectedRegion = getModel().x9().get(i);
                    sE(graphics, selectedRegion.getStartColumn(), selectedRegion.getStartLine(), selectedRegion.getEndColumn(), selectedRegion.getEndLine(), Color.RED);
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -4571070474019610727L, this, graphics);
            }
            throw th;
        }
    }

    @ey(method = 111116767816053200L)
    private void e9(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(-1393087367695104453L, this, graphics, new Integer(i));
            }
            if (!q7(i)) {
                a5(graphics, i);
                return;
            }
            if (this.selectionVisibility) {
                if (i == this.selectionAnchorLine && i == this.selectionPointLine) {
                    int columnWithTabs = getColumnWithTabs(Math.min(this.selectionAnchorColumn, this.selectionPointColumn), this.selectionPointLine);
                    int columnWithTabs2 = getColumnWithTabs(Math.max(this.selectionAnchorColumn, this.selectionPointColumn), this.selectionPointLine);
                    Gj(graphics, this.pO, columnWithTabs - 1, i);
                    Gj(graphics, columnWithTabs, columnWithTabs2 - 1, i);
                    Gj(graphics, columnWithTabs2, this.fN, i);
                    return;
                }
                if (i == this.selectionAnchorLine) {
                    int columnWithTabs3 = getColumnWithTabs(this.selectionAnchorColumn, this.selectionAnchorLine);
                    Gj(graphics, this.pO, columnWithTabs3 - 1, i);
                    Gj(graphics, columnWithTabs3, this.fN, i);
                    return;
                } else if (i == this.selectionPointLine) {
                    int columnWithTabs4 = getColumnWithTabs(this.selectionPointColumn, this.selectionPointLine);
                    Gj(graphics, this.pO, columnWithTabs4 - 1, i);
                    Gj(graphics, columnWithTabs4, this.fN, i);
                    return;
                }
            }
            Gj(graphics, this.pO, this.fN, i);
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -1393087367695104453L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4343007598304834275L)
    private void gG(Graphics graphics, int i) {
        int i2;
        float f;
        try {
            if (tj) {
                iy.EQ(2891963841285092220L, this, graphics, new Integer(i));
            }
            float f2 = this.hx;
            int i3 = 0;
            while (i3 < this.curReadColumnCount + 1) {
                Color colorHz = hz(i3, i);
                ColorKind textColorKind = getTextColorKind(i3, i);
                int i4 = 1;
                for (int i5 = i3 + 1; i5 < this.curReadColumnCount + 1; i5++) {
                    Color colorHz2 = hz(i5, i);
                    ColorKind textColorKind2 = getTextColorKind(i5, i);
                    if ((colorHz == null) != (colorHz2 == null) || ((colorHz != null && colorHz2.j6() != colorHz.j6()) || textColorKind2 != textColorKind)) {
                        break;
                    }
                    i4++;
                }
                int i6 = i3;
                float f3 = 0.0f;
                while (true) {
                    i2 = i3 + i4;
                    if (i6 >= i2) {
                        break;
                    }
                    if (i6 == this.curReadColumnCount) {
                        f = this.spaceCharWidth;
                    } else {
                        try {
                            f = this.HT[i6];
                        } catch (ArrayIndexOutOfBoundsException unused) {
                        }
                    }
                    f3 += f;
                    i6++;
                }
                if (colorHz != null) {
                    Pa(graphics, f2, Ev(i) + this.hK + (this.fontHeight / 10.0f), f3, colorHz, textColorKind);
                }
                f2 += f3;
                i3 = i2;
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 2891963841285092220L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 169339796860442800L)
    private int getColumnWithTabs(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(1087549428592247569L, this, new Integer(i), new Integer(i2));
            }
            if (i > this.model.getColumnCount(i2)) {
                i = this.model.getColumnCount(i2);
            }
            readLineText(i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                i3 = this.curReadTextChars[i4] == '\t' ? i3 + (this.tabSize - (i3 % this.tabSize)) : i3 + 1;
            }
            return i3;
        } finally {
        }
    }

    @ey(method = 3038860190568991152L)
    private float getDeviceFontSize() {
        try {
            if (tj) {
                iy.gn(-4072802586000802435L, this);
            }
            return this.deviceFontSize;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -4072802586000802435L, this);
            }
            throw th;
        }
    }

    @ey(method = 890238857731187555L)
    private Size getSize() {
        try {
            if (tj) {
                iy.gn(-2047429857612020736L, this);
            }
            return new Size(getMeasuredWidth(), getMeasuredHeight());
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -2047429857612020736L, this);
            }
            throw th;
        }
    }

    @ey(method = 836565337369532100L)
    private ScrollView getSurroundingScrollView() {
        try {
            if (tj) {
                iy.gn(-489334242511602075L, this);
            }
            ViewParent parent = getParent();
            for (int i = 0; parent != null && i < 5; i++) {
                if (parent instanceof ScrollView) {
                    return (ScrollView) parent;
                }
                parent = parent.getParent();
            }
            return null;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -489334242511602075L, this);
            }
            throw th;
        }
    }

    @ey(method = -215698288258852427L)
    private ColorKind getTextColorKind(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-2320122752876238520L, this, new Integer(i), new Integer(i2));
            }
            return zh(i, i2) ? ColorKind.DEBUGGER_START : k2(i, i2) ? ColorKind.DEBUGGER_END : qp(i, i2) ? ColorKind.DEBUGGER : hK(i, i2) ? ColorKind.DEBUGGER_START : w9(i, i2) ? ColorKind.DEBUGGER_END : AL(i, i2) ? ColorKind.DEBUGGER : this.model.lp(i, i2) ? ColorKind.PLAIN : this.model.dx(i, i2) ? ColorKind.COLOR : ColorKind.ERROR;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -2320122752876238520L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 6341382303611993520L)
    private boolean hK(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-2443185448186938931L, this, new Integer(i), new Integer(i2));
            }
            SelectedRegion selectedRegionP8 = this.model.P8();
            if (selectedRegionP8 != null && i2 == selectedRegionP8.getStartLine()) {
                return i == selectedRegionP8.getStartColumn();
            }
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -2443185448186938931L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 409875957149902285L)
    private Color hz(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(2284006725150819704L, this, new Integer(i), new Integer(i2));
            }
            if (!qp(i, i2) && !k2(i, i2)) {
                if (!AL(i, i2) && !w9(i, i2)) {
                    if (this.model.lp(i, i2)) {
                        return this.hyperlinkColor;
                    }
                    if (this.model.dx(i, i2)) {
                        return new Color(this.model.I(i, i2));
                    }
                    if (this.model.gn(i, i2)) {
                        return this.errorColor;
                    }
                    if (this.model.sy(i, i2)) {
                        return this.todoColor;
                    }
                    if (this.model.ef(i, i2)) {
                        return this.setWarningColor;
                    }
                    return null;
                }
                return this.expressionSteppingPointColor;
            }
            return this.expressionDisplayColor;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 2284006725150819704L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1775177530252564592L)
    private void init() {
        try {
            if (tj) {
                iy.gn(-256726581318069725L, this);
            }
            setDensityIndependentFontSize(getDefaultFontSize());
            this.xg = new Vector<>();
            this.selectionListenerVector = new Vector<>();
            this.caret = new Caret();
            this.invalidateLayoutTask = new InvalidateLayoutTask();
            this.indexingLayoutTask = new IndexingLayoutTask();
            initColors();
            float f = getContext().getResources().getDisplayMetrics().density;
            this.eN = 10.0f * f;
            this.zf = f * 4.0f;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -256726581318069725L, this);
            }
            throw th;
        }
    }

    @ey(method = -4093689117643942711L)
    private boolean isInSelectedRegion(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-4457577610189239360L, this, new Integer(i), new Integer(i2));
            }
            if (!this.selectionVisibility || this.firstSelectedLine > i2 || i2 > this.lastSelectedLine) {
                return false;
            }
            return this.firstSelectedLine == i2 ? this.lastSelectedLine == i2 ? i >= this.firstSelectedColumn && i <= this.lastSelectedColumn : i >= this.firstSelectedColumn : this.lastSelectedLine != i2 || i <= this.lastSelectedColumn;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -4457577610189239360L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5211268100620056909L)
    private boolean k2(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(690145118705267200L, this, new Integer(i), new Integer(i2));
            }
            SelectedRegion selectedRegion = this.model.getSelectedRegion();
            if (selectedRegion != null && i2 == selectedRegion.getEndLine()) {
                return i == selectedRegion.getEndColumn();
            }
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 690145118705267200L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3338328052782550800L)
    private float oY(int i) {
        try {
            if (tj) {
                iy.u7(5202271809198905395L, this, i);
            }
            return (i * this.spaceCharWidth) + this.hx;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 5202271809198905395L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -827068718722816512L)
    private void oa(int i) {
        try {
            if (tj) {
                iy.u7(-420497569639797323L, this, i);
            }
            Jm(0.0f, Ev(i), getSize().j6, this.fontHeight);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -420497569639797323L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 69207791799537105L)
    private void oy(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(-39779742911929380L, this, graphics, new Integer(i));
            }
            if (ye(i) && WB(i)) {
                float fFN = FN(i) + 10.0f;
                if (this.model.Zo(i) && this.overridingMethodIcon != null) {
                    this.overridingMethodIcon.DW();
                    throw null;
                }
                if (this.model.rN(i) && this.overriddenMethodIcon != null) {
                    this.overriddenMethodIcon.DW();
                    throw null;
                }
                float fEv = Ev(i);
                graphics.setColor(this.separatorColor);
                graphics.drawText("...", fFN + 3.0f, (this.fontHeight + fEv) - this.cT);
                graphics.Zo(fFN, fEv, (this.spaceCharWidth * 3.0f) + 6.0f, this.fontHeight - 1.0f);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -39779742911929380L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2578712956749841968L)
    private void pO(Graphics graphics) {
        try {
            if (tj) {
                iy.tp(1912038986229168045L, this, graphics);
            }
            if (this.selectionVisibility || n5(this.caretLine) || !hasFocusWrapper()) {
                return;
            }
            this.caret.VH(graphics, jO(this.caretColumn, this.caretLine), Ev(this.caretLine), this.spaceCharWidth, this.fontHeight, getOverwriteMode() && !getSelectionVisibility(), this.Pa);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 1912038986229168045L, this, graphics);
            }
            throw th;
        }
    }

    @ey(method = 65668361922122400L)
    private boolean q7(int i) {
        try {
            if (tj) {
                iy.u7(1892053846462697073L, this, i);
            }
            if (!this.HO) {
                return false;
            }
            readLineText(i);
            int columnCount = this.model.getColumnCount(i);
            for (int i2 = 0; i2 < columnCount; i2++) {
                if (this.curReadTextChars[i2] >= 256) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 1892053846462697073L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 544048137740057625L)
    private void qP(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(4668510846735397612L, this, new Integer(i), new Integer(i2));
            }
            if (q7(i2)) {
                Jm(jO(i, i2), Ev(i2), getSize().j6, this.fontHeight);
            } else {
                oa(i2);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 4668510846735397612L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1075424610914951584L)
    private boolean qp(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(558927099666451215L, this, new Integer(i), new Integer(i2));
            }
            SelectedRegion selectedRegion = this.model.getSelectedRegion();
            if (selectedRegion == null || i2 < selectedRegion.getStartLine() || i2 > selectedRegion.getEndLine()) {
                return false;
            }
            if (selectedRegion.getStartLine() == selectedRegion.getEndLine()) {
                if (i < selectedRegion.getStartColumn() || i >= selectedRegion.getEndColumn()) {
                    return false;
                }
            } else {
                if (i2 == selectedRegion.getStartLine() && i < selectedRegion.getStartColumn()) {
                    return false;
                }
                if (i2 == selectedRegion.getEndLine() && i >= selectedRegion.getEndColumn()) {
                    return false;
                }
            }
            return this.model.getColumnCount(i2) != i;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 558927099666451215L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -689369610838505215L)
    private void readLineText(int i) {
        try {
            if (tj) {
                iy.u7(-3024043465127991712L, this, i);
            }
            if (this.curReadLineCount == i) {
                return;
            }
            this.curReadColumnCount = this.model.getColumnCount(i);
            int length = this.curReadTextChars.length;
            int i2 = length;
            while (i2 < this.curReadColumnCount) {
                i2 *= 2;
            }
            if (i2 != length) {
                this.curReadTextChars = new char[i2];
            }
            this.model.readLineText(i, this.curReadTextChars);
            this.curReadLineCount = i;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -3024043465127991712L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 79869993296150055L)
    private void ro(Graphics graphics, int i) {
        int i2;
        try {
            if (tj) {
                iy.EQ(646367229035044056L, this, graphics, new Integer(i));
            }
            System.currentTimeMillis();
            readLineText(i);
            if (this.HT.length != this.curReadTextChars.length) {
                this.HT = new float[this.curReadTextChars.length];
            }
            graphics.setFont(this.fY[0]);
            if (this.k2) {
                System.currentTimeMillis();
                graphics.getTextWidths(this.curReadTextChars, 0, this.curReadColumnCount, this.HT);
            } else {
                for (int i3 = 0; i3 < this.curReadColumnCount; i3 += i2) {
                    int typefaceStyle = this.textStyleArray[this.model.DW(i3, i)].getTypefaceStyle();
                    i2 = 1;
                    for (int i4 = i3 + 1; i4 < this.curReadColumnCount && this.textStyleArray[this.model.DW(i4, i)].getTypefaceStyle() == typefaceStyle; i4++) {
                        i2++;
                    }
                    int length = this.oT.length;
                    int i5 = length;
                    while (i5 < i2) {
                        i5 *= 2;
                    }
                    if (i5 != length) {
                        this.oT = new float[i5];
                    }
                    graphics.setFont(this.fY[this.model.DW(i3, i)]);
                    graphics.getTextWidths(this.curReadTextChars, i3, i2, this.oT);
                    System.arraycopy(this.oT, 0, this.HT, i3, i2);
                }
            }
            float f = this.hx;
            for (int i6 = 0; i6 < this.curReadColumnCount; i6++) {
                if (this.curReadTextChars[i6] == '\t') {
                    float fCeil = (((float) Math.ceil(r2 / (this.spaceCharWidth * this.tabSize))) * (this.spaceCharWidth * this.tabSize)) - (f - this.hx);
                    if (fCeil < this.spaceCharWidth) {
                        fCeil += this.spaceCharWidth * this.tabSize;
                    }
                    this.HT[i6] = fCeil;
                }
                f += this.HT[i6];
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 646367229035044056L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -14539089721398504L)
    private void sE(Graphics graphics, int i, int i2, int i3, int i4, Color color) {
        int columnWithTabs;
        int columnWithTabs2;
        Color color2 = color;
        try {
            if (tj) {
                iy.QX(2760818997902944961L, this, new Object[]{graphics, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), color2});
            }
            if (cT()) {
                int i5 = i2;
                while (i5 <= i4) {
                    if (!n5(i5)) {
                        if (i2 == i4) {
                            graphics.setColor(color2);
                            int columnWithTabs3 = getColumnWithTabs(Math.min(i, i3), i4);
                            if (columnWithTabs3 == getColumnWithTabs(Math.max(i, i3), i4)) {
                                graphics.Zo(oY(columnWithTabs3) - (this.spaceCharWidth / 4.0f), Ev(i4), this.spaceCharWidth / 2.0f, this.fontHeight - 1.0f);
                                return;
                            } else {
                                graphics.Zo(oY(columnWithTabs3), Ev(i4), ((r14 - columnWithTabs3) * this.spaceCharWidth) - 1.0f, this.fontHeight - 1.0f);
                                return;
                            }
                        }
                        int iMin = Math.min(i2, i4);
                        int iMax = Math.max(i2, i4);
                        if (i2 < i4) {
                            columnWithTabs = getColumnWithTabs(i, i2);
                            columnWithTabs2 = getColumnWithTabs(i3, i4);
                        } else {
                            columnWithTabs = getColumnWithTabs(i3, i4);
                            columnWithTabs2 = getColumnWithTabs(i, i2);
                        }
                        w wVarM0getClipBounds = graphics.m0getClipBounds();
                        float f = wVarM0getClipBounds.FH + wVarM0getClipBounds.j6;
                        graphics.setColor(color2);
                        int i6 = iMin + 1;
                        graphics.Hw(0.0f, Ev(i6) - 1.0f, oY(columnWithTabs), Ev(i6) - 1.0f);
                        graphics.Hw(oY(columnWithTabs), Ev(iMin), f, Ev(iMin));
                        if (columnWithTabs != 0) {
                            graphics.Hw(oY(columnWithTabs), Ev(iMin), oY(columnWithTabs), Ev(i6) - 1.0f);
                        }
                        graphics.Hw(f, Ev(iMax), oY(columnWithTabs2), Ev(iMax));
                        int i7 = iMax + 1;
                        graphics.Hw(oY(columnWithTabs2), Ev(i7) - 1.0f, 0.0f, Ev(i7) - 1.0f);
                        if (columnWithTabs2 != 0) {
                            graphics.Hw(oY(columnWithTabs2), Ev(iMax), oY(columnWithTabs2), Ev(i7) - 1.0f);
                            return;
                        }
                        return;
                    }
                    i5++;
                    color2 = color;
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.rN(th, 2760818997902944961L, this, new Object[]{graphics, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), color});
            }
            throw th;
        }
    }

    @ey(method = 1806854767397852535L)
    private static w sG(float f, float f2, float f3, float f4, w wVar) {
        try {
            if (tj) {
                iy.J8(-71987925575747104L, null, new Float(f), new Float(f2), new Float(f3), new Float(f4), wVar);
            }
            float f5 = f > wVar.j6 ? f : wVar.j6;
            float f6 = f + f3;
            if (f6 >= wVar.j6 + wVar.FH) {
                f6 = wVar.j6 + wVar.FH;
            }
            float f7 = f2 > wVar.DW ? f2 : wVar.DW;
            float f8 = f2 + f4;
            if (f8 >= wVar.DW + wVar.Hw) {
                f8 = wVar.DW + wVar.Hw;
            }
            wVar.j6 = f5;
            wVar.DW = f7;
            float f9 = f6 - f5;
            wVar.FH = f9;
            float f10 = f8 - f7;
            wVar.Hw = f10;
            if (f9 < 0.0f || f10 < 0.0f) {
                wVar.Hw = 0.0f;
                wVar.FH = 0.0f;
                wVar.DW = 0.0f;
                wVar.j6 = 0.0f;
            }
            return wVar;
        } catch (Throwable th) {
            if (pn) {
                iy.lg(th, -71987925575747104L, null, new Float(f), new Float(f2), new Float(f3), new Float(f4), wVar);
            }
            throw th;
        }
    }

    @ey(method = -1335640994669684123L)
    private void sM(Graphics graphics, int i) {
        int columnCount;
        try {
            if (tj) {
                iy.EQ(2948903129443746072L, this, graphics, new Integer(i));
            }
            if (i >= this.model.getLineCount() || (columnCount = this.model.getColumnCount(i)) <= 0) {
                return;
            }
            if (this.model.tp(i) && this.testCasePassedPreviouslyIcon != null) {
                aX(graphics, this.testCasePassedPreviouslyIcon, columnCount, i);
                throw null;
            }
            if (this.model.u7(i) && this.testCaseFailedPreviouslyIcon != null) {
                aX(graphics, this.testCaseFailedPreviouslyIcon, columnCount, i);
                throw null;
            }
            if (this.model.KD(i) && this.testCasePassedIcon != null) {
                aX(graphics, this.testCasePassedIcon, columnCount, i);
                throw null;
            }
            if (this.model.Sf(i) && this.testCaseFailedIcon != null) {
                aX(graphics, this.testCaseFailedIcon, columnCount, i);
                throw null;
            }
            if (!this.model.rN(i) || this.overriddenMethodIcon == null) {
                if (!this.model.Zo(i) || this.overridingMethodIcon == null) {
                    return;
                }
                graphics.DW(this.overridingMethodIcon, FN(i), Ev(i));
                return;
            }
            graphics.DW(this.overriddenMethodIcon, FN(i), Ev(i));
            if (this.model.Zo(i) && this.overridingMethodIcon != null) {
                FN(i);
                this.overriddenMethodIcon.DW();
                throw null;
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 2948903129443746072L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5051395713024520013L)
    private void setDensityIndependentFontSize(float f) {
        try {
            if (tj) {
                iy.tp(-424756201602211500L, this, new Float(f));
            }
            this.deviceFontSize = (int) (getContext().getResources().getDisplayMetrics().scaledDensity * f);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -424756201602211500L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = 992987053358561049L)
    private void sg(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(-6085742887069819508L, this, graphics, new Integer(i));
            }
            if (this.model.Mz(i)) {
                graphics.setColor(this.stepbarColor);
                graphics.gn(this.uC + (this.qU / 2.0f), Ev(i + 1) - (this.fontHeight / 2.0f), Math.min((this.qU / 2.0f) * 0.9f, this.fontHeight / 2.0f));
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -6085742887069819508L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6508368192044052304L)
    private void sh() {
        try {
            if (tj) {
                iy.gn(-4363307483484971365L, this);
            }
            this.qU = KD() ? this.q7 * 1.5f : 0.0f;
            float fMax = (this.q7 * ((int) Math.max(KD() ? 4.0d : 0.0d, Math.log10(this.model.getLineCount()) + 2.0d))) + getSideBarPaddingLeft();
            this.uC = fMax;
            this.hx = fMax + this.qU;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -4363307483484971365L, this);
            }
            throw th;
        }
    }

    @ey(method = 675809486575165303L)
    private boolean w9(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(1871437570184557440L, this, new Integer(i), new Integer(i2));
            }
            SelectedRegion selectedRegionP8 = this.model.P8();
            if (selectedRegionP8 != null && i2 == selectedRegionP8.getEndLine()) {
                return i == selectedRegionP8.getEndColumn();
            }
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 1871437570184557440L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3300679568710483904L)
    private int yO(int i) {
        try {
            if (tj) {
                iy.u7(-7040194268650046873L, this, i);
            }
            int columnCount = this.model.getColumnCount(i);
            readLineText(i);
            int i2 = 0;
            for (int i3 = 0; i3 < columnCount; i3++) {
                i2 += this.curReadTextChars[i3] == '\t' ? this.tabSize - (i2 % this.tabSize) : 1;
            }
            return i2;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -7040194268650046873L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3299911817887601964L)
    private void ys(Graphics graphics, int i) {
        int i2;
        try {
            if (tj) {
                iy.EQ(136204809001189049L, this, graphics, new Integer(i));
            }
            float f = this.hx;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= this.curReadColumnCount) {
                    graphics.setColor(br(this.curReadColumnCount, i, this.model.DW(this.curReadColumnCount, i), false));
                    graphics.drawRect(f, Ev(i), this.spaceCharWidth, this.fontHeight);
                    float f2 = f + this.spaceCharWidth;
                    graphics.setColor(br(this.curReadColumnCount + 1, i, this.model.DW(this.curReadColumnCount + 1, i), false));
                    graphics.drawRect(f2, Ev(i), getWidth() - f2, this.fontHeight);
                    return;
                }
                Color colorBr = br(i3, i, this.model.DW(i3, i), false);
                for (int i5 = i3 + 1; i5 < this.curReadColumnCount && br(i5, i, this.model.DW(i5, i), false).j6() == colorBr.j6(); i5++) {
                    i4++;
                }
                float f3 = 0.0f;
                int i6 = i3;
                while (true) {
                    i2 = i3 + i4;
                    if (i6 < i2) {
                        f3 += this.HT[i6];
                        i6++;
                    }
                }
                graphics.setColor(colorBr);
                graphics.drawRect(f, Ev(i), f3, this.fontHeight);
                f += f3;
                i3 = i2;
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 136204809001189049L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2649456943211484120L)
    private boolean zh(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(4165462153106480815L, this, new Integer(i), new Integer(i2));
            }
            SelectedRegion selectedRegion = this.model.getSelectedRegion();
            if (selectedRegion != null && i2 == selectedRegion.getStartLine()) {
                return i == selectedRegion.getStartColumn();
            }
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 4165462153106480815L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1265259413478828592L)
    protected void An(Graphics graphics, int i, int i2) {
        try {
            if (tj) {
                iy.we(2612665982113796531L, this, graphics, new Integer(i), new Integer(i2));
            }
            for (int i3 = i; i3 <= i2; i3++) {
                if (!n5(i3)) {
                    e9(graphics, i3);
                    Nh(graphics, i3);
                    sM(graphics, i3);
                    oy(graphics, i3);
                    Za(graphics, i3);
                    QO(graphics, i3);
                    sg(graphics, i3);
                }
            }
            AE(graphics);
            e3(graphics);
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, 2612665982113796531L, this, graphics, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 863108768438660681L)
    protected void BR(Graphics graphics, float f, float f2) {
        try {
            if (tj) {
                iy.we(840021162831995032L, this, graphics, new Float(f), new Float(f2));
            }
            if (!cT() || this.softMaxWidthRealColumn <= 0 || this.pO > this.softMaxWidthRealColumn || this.softMaxWidthRealColumn > this.fN) {
                return;
            }
            graphics.setColor(this.softMaxWidthLineColor);
            graphics.Hw(this.softMaxWidthRealColumn * this.spaceCharWidth, f, this.softMaxWidthRealColumn * this.spaceCharWidth, f2);
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, 840021162831995032L, this, graphics, new Float(f), new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = 4973842967288932676L)
    protected void Bx() {
        try {
            if (tj) {
                iy.gn(-2272817613754243035L, this);
            }
            if (isShown()) {
                Of(this.caretColumn, this.caretLine);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -2272817613754243035L, this);
            }
            throw th;
        }
    }

    @ey(method = -172579965571040384L)
    public int CU(float f, float f2) {
        try {
            if (tj) {
                iy.EQ(1935130664015488875L, this, new Float(f), new Float(f2));
            }
            int iWc = wc(f2);
            int iXX = XX(f, f2);
            if (iWc != -1 && iXX != -1) {
                return iWc == -2 ? this.model.getColumnCount(this.model.getLineCount() - 1) : iXX == -2 ? this.model.getColumnCount(iWc) : iXX;
            }
            return 0;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 1935130664015488875L, this, new Float(f), new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = -1093578325029456516L)
    protected void Cz(Graphics graphics, int i, int i2, int i3) {
        char c2;
        int i4;
        int i5;
        Object obj;
        try {
            if (tj) {
                iy.J0(37159726210494049L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (i > i2) {
                return;
            }
            readLineText(i3);
            int columnCount = this.model.getColumnCount(i3) - 1;
            int i6 = i2 - i;
            g3(i6 + 1);
            boolean z = false;
            for (int i7 = 0; i7 < this.pN.length; i7++) {
                this.pN[i7] = false;
            }
            Color color = this.TRANSPARENT;
            int i8 = 0;
            while (i8 <= i6) {
                for (int i9 = 0; i9 < this.pN.length; i9++) {
                    this.e3[i9][i8] = ' ';
                }
                this.Gj[i8] = null;
                this.Cz[i8] = ColorKind.ERROR;
                this.oy[i8] = color;
                i8++;
            }
            this.Gj[i8] = null;
            this.Cz[i8] = ColorKind.ERROR;
            int i10 = 0;
            boolean z2 = true;
            int i11 = 0;
            while (true) {
                c2 = '\t';
                if (i10 >= i || i11 > columnCount) {
                    break;
                }
                char c3 = this.curReadTextChars[i11];
                if (c3 == '\t') {
                    i10 += this.tabSize - (i10 % this.tabSize);
                } else if (c3 != ' ') {
                    i10++;
                    z2 = false;
                } else {
                    i10++;
                }
                i11++;
            }
            if (i10 > i) {
                i5 = i11 - 1;
                i4 = i;
            } else {
                i4 = i10;
                i5 = i11;
            }
            int i12 = columnCount + 1;
            if (i5 == i12) {
                i4 = i;
            }
            while (i5 <= columnCount && i4 <= i2) {
                char c4 = this.curReadTextChars[i5];
                int iDW = this.model.DW(i5, i3);
                if (c4 != c2) {
                    if (c4 != ' ') {
                        Color colorBr = br(i5, i3, iDW, z);
                        int i13 = i4 - i;
                        this.Gj[i13] = hz(i5, i3);
                        this.Cz[i13] = getTextColorKind(i5, i3);
                        this.oy[i13] = colorBr;
                        if (!this.pN[iDW]) {
                            this.pN[iDW] = true;
                            this.sE[iDW] = i4;
                        }
                        this.e3[iDW][i13] = c4;
                        this.sg[iDW] = i4;
                        i4++;
                        z2 = false;
                    } else {
                        Color colorBr2 = br(i5, i3, iDW, z2);
                        if (z2) {
                            this.Gj[i4 - i] = null;
                        } else {
                            int i14 = i4 - i;
                            this.Gj[i14] = hz(i5, i3);
                            this.Cz[i14] = getTextColorKind(i5, i3);
                        }
                        this.oy[i4 - i] = colorBr2;
                        i4++;
                    }
                    obj = null;
                } else {
                    Color colorBr3 = br(i5, i3, iDW, z2);
                    int i15 = this.tabSize - (i4 % this.tabSize);
                    if (i4 + i15 > i2) {
                        i15 = (i2 - i4) + 1;
                    }
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (z2) {
                            this.Gj[(i4 - i) + i16] = null;
                        } else {
                            int i17 = (i4 - i) + i16;
                            this.Gj[i17] = hz(i5, i3);
                            this.Cz[i17] = getTextColorKind(i5, i3);
                        }
                        this.oy[(i4 - i) + i16] = colorBr3;
                    }
                    obj = null;
                    i4 += i15;
                }
                i5++;
                z = false;
                c2 = '\t';
            }
            if (i5 <= i12 && i4 <= i2 && i4 >= i) {
                int i18 = i4 - i;
                this.Gj[i18] = hz(i5, i3);
                this.Cz[i18] = getTextColorKind(i5, i3);
            }
            if (i5 == i12 && i4 <= i2 && i4 >= i) {
                int iDW2 = this.model.DW(i5, i3);
                if (i4 == getColumnWithTabs(i5, i3)) {
                    this.oy[i4 - i] = br(i5, i3, iDW2, z2);
                    i4++;
                }
                Color colorBr4 = br(i5 + 1, i3, iDW2, z2);
                while (i4 <= i2) {
                    this.oy[i4 - i] = colorBr4;
                    i4++;
                }
            }
            fN(graphics, i, i2, i3);
            int i19 = i3 + 1;
            BR(graphics, Ev(i3), Ev(i19));
            for (int i20 = 0; i20 < this.pN.length; i20++) {
                if (this.pN[i20]) {
                    Color colorFH = this.textStyleArray[i20].FH();
                    if (this.selectionVisibility && this.ys && isInSelectedRegion(i11, i3)) {
                        colorFH = this.selectedRegionTextColor;
                    }
                    graphics.setColor(colorFH);
                    graphics.setFont(this.fY[i20]);
                    graphics.drawText(this.e3[i20], this.sE[i20] - i, (this.sg[i20] - this.sE[i20]) + 1, oY(this.sE[i20]), Ev(i19) - this.cT);
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, 37159726210494049L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.ModelListener
    @ey(method = 4347667817148382440L)
    public void DW(Model model, int i, int i2, int i3, int i4) {
        try {
            if (tj) {
                iy.J8(212585582203178041L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.curReadLineCount = -1;
            int i5 = i4 - i2;
            for (int i6 = 0; i6 < i5; i6++) {
                if (this.u9.size() > i2) {
                    this.u9.remove(i2);
                }
                if (this.Ak.size() > i2) {
                    this.Ak.remove(i2);
                }
                if (this.ba.size() > i2) {
                    this.ba.remove(i2);
                }
            }
            if (this.ti != null) {
                Iterator<SelectedRegion> it = this.ti.iterator();
                while (it.hasNext()) {
                    it.next().we(i, i2, i3, i4);
                }
            }
            if (this.nl != null) {
                Iterator<SelectedRegion> it2 = this.nl.iterator();
                while (it2.hasNext()) {
                    it2.next().we(i, i2, i3, i4);
                }
            }
            cb();
            sh();
            if (i2 == i4) {
                if (i4 == this.caretLine && i < this.caretColumn) {
                    ct(Math.max(i, this.caretColumn - ((i3 - i) + 1)), this.caretLine, true);
                }
            } else if ((this.caretLine == i2 && i < this.caretColumn) || ((this.caretLine > i2 && this.caretLine < i4) || (this.caretLine == i4 && this.caretColumn < i3))) {
                ct(i, i2, true);
            } else if (this.caretLine == i4) {
                ct(((this.caretColumn + i) - i3) - 1, i2, true);
            } else if (this.caretLine > i4) {
                ct(this.caretColumn, this.caretLine - i5, true);
            }
            setSelectionVisibility(false);
            if (i2 != i4) {
                MP(0, this.model.getLineCount());
                this.indexingLayoutTask.DW();
                this.invalidateLayoutTask.DW();
                return;
            }
            getSize();
            qP(i, i2);
            if (i2 == this.PH) {
                if (this.model.getLineCount() == 1) {
                    this.consoleMaxWidth = yO(i2);
                } else {
                    this.indexingLayoutTask.DW();
                    this.invalidateLayoutTask.DW();
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.lg(th, 212585582203178041L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 1663052432126619287L)
    public float Ev(int i) {
        try {
            if (tj) {
                iy.u7(1301693867240457600L, this, i);
            }
            if (this.u9.size() == 0) {
                return i * this.fontHeight;
            }
            if (this.fP.size() != 0 && i >= 0) {
                return i >= this.fP.size() ? this.fP.get(this.fP.size() - 1).intValue() + (this.fontHeight * ((i - this.fP.size()) + 1)) : this.fP.get(i).intValue();
            }
            return 0.0f;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 1301693867240457600L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.ModelListener
    @ey(method = 1486978308544876672L)
    public void FH(Model model, int i, int i2, int i3, int i4) {
        try {
            if (tj) {
                iy.J8(142932213298078039L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.curReadLineCount = -1;
            int i5 = i4 - i2;
            for (int i6 = 0; i6 < i5; i6++) {
                if (this.u9.size() > i2) {
                    this.u9.insertElementAt(null, i2);
                }
                if (this.Ak.size() > i2) {
                    this.Ak.insertElementAt(null, i2);
                }
                if (this.ba.size() > i2) {
                    this.ba.insertElementAt(null, i2);
                }
            }
            if (this.ti != null) {
                Iterator<SelectedRegion> it = this.ti.iterator();
                while (it.hasNext()) {
                    it.next().tp(i, i2, i3, i4);
                }
            }
            if (this.nl != null) {
                Iterator<SelectedRegion> it2 = this.nl.iterator();
                while (it2.hasNext()) {
                    it2.next().tp(i, i2, i3, i4);
                }
            }
            cb();
            sh();
            if (i2 < this.caretLine && i2 != i4) {
                ct(this.caretColumn, (this.caretLine + i4) - i2, true);
            } else if (i2 == this.caretLine && i <= this.caretColumn) {
                if (i2 == i4) {
                    ct(((this.caretColumn + i3) - i) + 1, this.caretLine, true);
                } else {
                    ct(((this.caretColumn + i3) - i) + 1, (this.caretLine + i4) - i2, true);
                }
            }
            setSelectionVisibility(false);
            if (i2 == i4) {
                qP(i, i2);
                int iYO = yO(i2);
                if (this.model.getLineCount() == 1) {
                    this.consoleMaxWidth = iYO;
                    return;
                } else {
                    if (this.indexingLayoutTask.j6() || iYO <= this.consoleMaxWidth) {
                        return;
                    }
                    this.PH = i2;
                    this.consoleMaxWidth = iYO;
                    this.invalidateLayoutTask.DW();
                    return;
                }
            }
            MP(0, this.model.getLineCount());
            double d2 = i5;
            double lineCount = this.model.getLineCount();
            Double.isNaN(lineCount);
            if (d2 > lineCount * 0.33d) {
                this.indexingLayoutTask.DW();
            } else if (!this.indexingLayoutTask.j6()) {
                int i7 = i2;
                while (true) {
                    if (i7 > i4) {
                        break;
                    }
                    int iYO2 = yO(i7);
                    if (iYO2 > this.consoleMaxWidth) {
                        this.PH = i2;
                        this.consoleMaxWidth = iYO2;
                        break;
                    }
                    i7++;
                }
            }
            this.invalidateLayoutTask.DW();
        } catch (Throwable th) {
            if (pn) {
                iy.lg(th, 142932213298078039L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -4206380168917577565L)
    protected void Fd(int i, int i2, int i3, int i4) {
        try {
            if (tj) {
                iy.J0(2294181294884855948L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i == this.firstSelectedColumn && i2 == this.firstSelectedLine && i3 == this.lastSelectedColumn && i4 == this.lastSelectedLine) {
                return;
            }
            int i5 = this.firstSelectedColumn;
            int i6 = this.firstSelectedLine;
            int i7 = this.lastSelectedColumn;
            int i8 = this.lastSelectedLine;
            this.firstSelectedColumn = i;
            this.firstSelectedLine = i2;
            this.lastSelectedColumn = i3;
            this.lastSelectedLine = i4;
            if (this.selectionVisibility) {
                if (i5 == i && i6 == i2) {
                    if (dx(i7, i8, i3, i4) < 0) {
                        PT(i7, i8, i3, i4);
                    } else {
                        PT(i3, i4, i7, i8);
                    }
                } else if (i7 != i3 || i8 != i4) {
                    PT(i5, i6, i7, i8);
                    PT(this.firstSelectedColumn, this.firstSelectedLine, this.lastSelectedColumn, this.lastSelectedLine);
                } else if (dx(i5, i6, i, i2) < 0) {
                    PT(i5, i6, i, i2);
                } else {
                    PT(i, i2, i5, i6);
                }
                E4();
            }
            lp();
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, 2294181294884855948L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -7100691572666336607L)
    protected void Gj(Graphics graphics, int i, int i2, int i3) {
        try {
            if (tj) {
                iy.J0(-2604879495443301384L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            Cz(graphics, i, i2, i3);
            pN(graphics, i, i2, i3);
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, -2604879495443301384L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1916578917905607401L)
    public void Jl() {
        try {
            if (tj) {
                iy.gn(2858981041645195488L, this);
            }
            if (this.caretLine > 0) {
                this.caretLine--;
            }
            this.caretColumn = 0;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 2858981041645195488L, this);
            }
            throw th;
        }
    }

    @ey(method = -1101606896221275108L)
    protected boolean KD() {
        try {
            if (!tj) {
                return false;
            }
            iy.gn(-50827651559427231L, this);
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -50827651559427231L, this);
            }
            throw th;
        }
    }

    @ey(method = -6779745769959746724L)
    public void Lz(int i, int i2, boolean z) {
        try {
            if (tj) {
                iy.we(-4905594481371364365L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            if (!cT() && !z) {
                throw new UnsupportedOperationException("Only normal selection supported with proportional fonts");
            }
            if (i < 0 || i2 < 0) {
                i = 0;
                i2 = 0;
            }
            this.ys = z;
            this.selectionAnchorColumn = i;
            this.selectionAnchorLine = i2;
            ef();
        } finally {
        }
    }

    @ey(method = 255543991423574625L)
    protected void MP(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-1037107572095599524L, this, new Integer(i), new Integer(i2));
            }
            if (i <= i2) {
                Jm(0.0f, Ev(i), getWidth(), Ev((i2 - i) + 1));
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -1037107572095599524L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.m
    @ey(method = -6680509934889739960L)
    public void Mr(Model model) {
        try {
            if (tj) {
                iy.tp(5846927099861285685L, this, model);
            }
            ce();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 5846927099861285685L, this, model);
            }
            throw th;
        }
    }

    @ey(method = 59727472198851892L)
    protected void Nh(Graphics graphics, int i) {
        try {
            if (tj) {
                iy.EQ(-1342222823885678427L, this, graphics, new Integer(i));
            }
            if (this.model.v5(i)) {
                float fEv = Ev(i);
                graphics.setColor(this.separatorColor);
                graphics.v5(0.0f, fEv, getWidth(), fEv, 1.0f);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -1342222823885678427L, this, graphics, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2516302999965969148L)
    protected void OW() {
        try {
            if (tj) {
                iy.gn(-1727397843442102787L, this);
            }
            for (int i = 0; i < this.selectionListenerVector.size(); i++) {
                this.selectionListenerVector.elementAt(i).j6(this, this.selectionVisibility);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -1727397843442102787L, this);
            }
            throw th;
        }
    }

    @ey(method = -254704394453417559L)
    protected void Of(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(1049732471764262328L, this, new Integer(i), new Integer(i2));
            }
            if (isShown()) {
                if (!q7(i2)) {
                    Jm(0.0f, Ev(i2), getWidth(), this.fontHeight);
                } else if (i <= this.model.getColumnCount(i2)) {
                    Jm(oY(getColumnWithTabs(i, i2)), Ev(i2), this.spaceCharWidth, this.fontHeight);
                } else {
                    Jm(0.0f, Ev(i2), getWidth(), this.fontHeight);
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 1049732471764262328L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3371765409272894880L)
    public void PT(int i, int i2, int i3, int i4) {
        try {
            if (tj) {
                iy.J0(3286322691364682295L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (!cT()) {
                Jm(0.0f, Ev(i2), getWidth(), Ev((i4 - i2) + 1));
                return;
            }
            if (i2 == i4) {
                Jm(oY(getColumnWithTabs(i, i2)), Ev(i2), ((getColumnWithTabs(i3, i2) - getColumnWithTabs(i, i2)) + this.tabSize) * this.spaceCharWidth, this.fontHeight);
            } else if (i2 < i4) {
                int columnWithTabs = getColumnWithTabs(i, i2);
                Jm(oY(columnWithTabs), Ev(i2), getWidth() - oY(columnWithTabs), this.fontHeight);
                int i5 = i2 + 1;
                if (i5 < i4) {
                    Jm(0.0f, Ev(i5), getWidth(), Ev((i4 - i2) - 1));
                }
                Jm(0.0f, Ev(i4), (getColumnWithTabs(i3, i4) + this.tabSize) * this.spaceCharWidth, this.fontHeight);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, 3286322691364682295L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @abcd.ey(method = 6003449005034985533L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void Pa(com.aide.ui.views.editor.Graphics r21, float r22, float r23, float r24, com.aide.ui.views.editor.Color r25, com.aide.ui.views.editor.OConsole.ColorKind r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.views.editor.OConsole.Pa(com.aide.ui.views.editor.Graphics, float, float, float, com.aide.ui.views.editor.Color, com.aide.ui.views.editor.OConsole$ColorKind):void");
    }

    @ey(method = 919155134961821989L)
    protected void Qq(int i, int i2, boolean z) {
        try {
            if (tj) {
                iy.we(-360705797802242800L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            for (int i3 = 0; i3 < this.xg.size(); i3++) {
                this.xg.elementAt(i3).j6(this, i, i2, z);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, -360705797802242800L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 68845082007968000L)
    protected void SI() {
        try {
            if (tj) {
                iy.gn(666464546161738151L, this);
            }
            this.fY = new Font[this.textStyleArray.length];
            this.pN = new boolean[this.textStyleArray.length];
            this.sE = new int[this.textStyleArray.length];
            this.sg = new int[this.textStyleArray.length];
            this.e3 = (char[][]) Array.newInstance((Class<?>) char.class, 0, 0);
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 666464546161738151L, this);
            }
            throw th;
        }
    }

    @ey(method = -118664477835530248L)
    public void TI(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(6202545971012871895L, this, new Integer(i), new Integer(i2));
            }
            ct(i, i2, false);
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 6202545971012871895L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.m
    @ey(method = -1946911996709641008L)
    public void VH(Model model, int i, int i2) {
        try {
            if (tj) {
                iy.we(4984619015222198069L, this, model, new Integer(i), new Integer(i2));
            }
            Jm(0.0f, Ev(i), getSize().j6, i2 * this.fontHeight);
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, 4984619015222198069L, this, model, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1044763577735435733L)
    public boolean WB(int i) {
        try {
            if (tj) {
                iy.u7(3304735097541048592L, this, i);
            }
            if (i >= 0 && i < this.ba.size()) {
                return this.ba.get(i) != null;
            }
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 3304735097541048592L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -337849868625857685L)
    public int XG(int i) {
        try {
            if (tj) {
                iy.u7(-1519757687183811168L, this, i);
            }
            return (int) (Ev(i) / this.fontHeight);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -1519757687183811168L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 705193154028727680L)
    public int XX(float f, float f2) {
        try {
            if (tj) {
                iy.EQ(1218623774436522501L, this, new Float(f), new Float(f2));
            }
            int iWc = wc(f2);
            if (iWc < 0) {
                return -3;
            }
            if (f2 < 0.0f) {
                return -1;
            }
            if (this.model.getColumnCount(iWc) == 0) {
                return -2;
            }
            int i = 0;
            if (q7(iWc)) {
                float f3 = (-this.spaceCharWidth) / 2.0f;
                readLineText(iWc);
                int i2 = 0;
                while (i < this.model.getColumnCount(iWc) && oY(i2) + f3 <= f) {
                    i2 = this.curReadTextChars[i] == '\t' ? i2 + (this.tabSize - (i2 % this.tabSize)) : i2 + 1;
                    i++;
                }
                if (f3 + oY(i2) > f) {
                    return i - 1;
                }
                return -2;
            }
            ro(this.ep, iWc);
            float f4 = this.hx + (this.spaceCharWidth / 2.0f);
            while (i < this.curReadColumnCount) {
                if (f <= f4) {
                    return i;
                }
                f4 += this.HT[i];
                i++;
            }
            if (i == this.curReadColumnCount) {
                return -2;
            }
            return i;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 1218623774436522501L, this, new Float(f), new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = 1942382067284110464L)
    public int Xa(float f, float f2) {
        try {
            if (tj) {
                iy.EQ(2379952254053167551L, this, new Float(f), new Float(f2));
            }
            int iWc = wc(f2);
            if (iWc == -1) {
                return 0;
            }
            return iWc == -2 ? this.model.getLineCount() - 1 : iWc;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 2379952254053167551L, this, new Float(f), new Float(f2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.ModelListener
    @ey(method = -2652500512469119236L)
    public void Zo(Model model, int i, int i2, int i3, char[] cArr) {
        try {
            if (tj) {
                iy.J8(-2342192627312874975L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
            }
            this.curReadLineCount = -1;
            setSelectionVisibility(false);
            qP(i, i2);
            if (this.indexingLayoutTask.j6()) {
                return;
            }
            int iYO = yO(i2);
            if (iYO > this.consoleMaxWidth) {
                this.PH = i2;
                this.consoleMaxWidth = iYO;
                this.invalidateLayoutTask.DW();
            } else {
                if (i2 != this.PH || yO(this.PH) >= this.consoleMaxWidth) {
                    return;
                }
                this.indexingLayoutTask.DW();
                this.invalidateLayoutTask.DW();
            }
        } catch (Throwable th) {
            if (pn) {
                iy.lg(th, -2342192627312874975L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
            }
            throw th;
        }
    }

    @ey(method = -2282844711635199087L)
    public void addCaretMoveListener(CaretMoveListener caretMoveListener) {
        try {
            if (tj) {
                iy.tp(-1104066754923809600L, this, caretMoveListener);
            }
            if (this.xg.contains(caretMoveListener)) {
                return;
            }
            this.xg.addElement(caretMoveListener);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -1104066754923809600L, this, caretMoveListener);
            }
            throw th;
        }
    }

    @ey(method = -2350505456280609244L)
    public void addSelectionListener(SelectionListener selectionListener) {
        try {
            if (tj) {
                iy.tp(-3129127601636610475L, this, selectionListener);
            }
            if (this.selectionListenerVector.contains(selectionListener)) {
                return;
            }
            this.selectionListenerVector.addElement(selectionListener);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -3129127601636610475L, this, selectionListener);
            }
            throw th;
        }
    }

    @ey(method = -6144786645395746752L)
    public void b1(SelectedRegion selectedRegion) {
        try {
            if (tj) {
                iy.tp(6146370649502410709L, this, selectedRegion);
            }
            PT(selectedRegion.getStartColumn(), selectedRegion.getStartLine(), selectedRegion.getEndColumn(), selectedRegion.getEndLine());
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 6146370649502410709L, this, selectedRegion);
            }
            throw th;
        }
    }

    @ey(method = 253514302986963025L)
    public void copySelectedText() {
        try {
            if (tj) {
                iy.gn(829980093180801280L, this);
            }
            if (getSelectionVisibility()) {
                try {
                    ArrayList arrayList = new ArrayList();
                    if (this.nl != null && !this.ba.isEmpty() && getSelectedRegion().getStartLine() < getSelectedRegion().getEndLine()) {
                        for (SelectedRegion selectedRegion : this.nl) {
                            if (getSelectedRegion().getStartLine() <= selectedRegion.getStartLine() && selectedRegion.getEndLine() < getSelectedRegion().getEndLine() && WB(selectedRegion.getStartLine())) {
                                arrayList.add(new SelectedRegion(selectedRegion.getStartLine() - getSelectedRegion().getStartLine(), 0, selectedRegion.getEndLine() - getSelectedRegion().getStartLine(), 0));
                            }
                        }
                    }
                    Reader selectedRegionReader = this.model.getSelectedRegionReader(getSelectedRegion(), "\n");
                    StringWriter stringWriter = new StringWriter();
                    StreamUtilities.gn(selectedRegionReader, stringWriter);
                    ((ClipboardManager) getContext().getSystemService("clipboard")).setText(stringWriter.toString());
                } catch (IOException e2) {
                    throw new InternalError("Exception occurred using clip board: " + e2);
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 829980093180801280L, this);
            }
            throw th;
        }
    }

    @ey(method = 3032675208297077587L)
    public void eU() {
        try {
            if (tj) {
                iy.gn(-2116187912262409776L, this);
            }
            this.caret.cancel();
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -2116187912262409776L, this);
            }
            throw th;
        }
    }

    @ey(method = 251645841598191876L)
    protected void ef() {
        try {
            if (tj) {
                iy.gn(1770756755289969247L, this);
            }
            if (dx(this.selectionAnchorColumn, this.selectionAnchorLine, this.selectionPointColumn, this.selectionPointLine) < 0) {
                Fd(this.selectionAnchorColumn, this.selectionAnchorLine, this.selectionPointColumn - 1, this.selectionPointLine);
                return;
            }
            if (dx(this.selectionAnchorColumn, this.selectionAnchorLine, this.selectionPointColumn, this.selectionPointLine) > 0) {
                Fd(this.selectionPointColumn, this.selectionPointLine, this.selectionAnchorColumn - 1, this.selectionAnchorLine);
                return;
            }
            this.firstSelectedColumn = this.caretColumn;
            this.firstSelectedLine = this.caretLine;
            this.lastSelectedColumn = this.caretColumn;
            this.lastSelectedLine = this.caretLine;
            setSelectionVisibility(false);
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 1770756755289969247L, this);
            }
            throw th;
        }
    }

    @ey(method = -2191263691952308985L)
    public int et(float f) {
        try {
            if (tj) {
                iy.tp(-1360785794483122320L, this, new Float(f));
            }
            if (this.u9.size() == 0) {
                return (int) (f / this.fontHeight);
            }
            int i = (int) (f / this.fontHeight);
            if (this.b.size() == 0) {
                return 0;
            }
            if (i < 0) {
                return -1;
            }
            return i >= this.b.size() ? (this.model.getLineCount() + i) - this.b.size() : this.b.get(i).intValue();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -1360785794483122320L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = -2238370910559740099L)
    protected void fN(Graphics graphics, int i, int i2, int i3) {
        try {
            if (tj) {
                iy.J0(-2308533256895221760L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            Color color = this.oy[0];
            int i4 = i;
            int i5 = i4;
            while (i4 <= i2) {
                int i6 = i4 - i;
                if (color.equals(this.oy[i6])) {
                    i4++;
                } else {
                    graphics.setColor(color);
                    graphics.drawRect(oY(i5), Ev(i3), (i4 - i5) * this.spaceCharWidth, this.fontHeight);
                    color = this.oy[i6];
                    i5 = i4;
                    i4++;
                }
            }
            graphics.setColor(color);
            graphics.drawRect(oY(i5), Ev(i3), (i4 - i5) * this.spaceCharWidth, this.fontHeight);
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, -2308533256895221760L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 6753003964344146280L)
    protected void g3(int i) {
        try {
            if (tj) {
                iy.u7(-3339873559114278771L, this, i);
            }
            if (this.e3.length < this.textStyleArray.length || this.e3[0].length < i) {
                this.e3 = (char[][]) Array.newInstance((Class<?>) char.class, this.textStyleArray.length, i);
            }
            if (this.Gj.length <= i) {
                this.Gj = new Color[i + 1];
            }
            if (this.Cz.length <= i) {
                this.Cz = new ColorKind[i + 1];
            }
            if (this.oy.length <= i) {
                this.oy = new Color[i];
            }
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -3339873559114278771L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3696932115492906795L)
    public int getCaretColumn() {
        try {
            if (tj) {
                iy.gn(1929424758928368080L, this);
            }
            return this.caretColumn;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 1929424758928368080L, this);
            }
            throw th;
        }
    }

    @ey(method = 1348797389545055455L)
    public int getCaretLine() {
        try {
            if (tj) {
                iy.gn(3874140754937271000L, this);
            }
            return this.caretLine;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 3874140754937271000L, this);
            }
            throw th;
        }
    }

    @ey(method = -1914572727898284096L)
    public Position getCaretPosition() {
        try {
            if (tj) {
                iy.gn(3985104255802550301L, this);
            }
            return new Position(this.caretLine, this.caretColumn);
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 3985104255802550301L, this);
            }
            throw th;
        }
    }

    @ey(method = -2125699361817654825L)
    public Icon getCollapsableIcon() {
        try {
            if (tj) {
                iy.gn(-5701870007535103584L, this);
            }
            return this.collapsableIcon;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -5701870007535103584L, this);
            }
            throw th;
        }
    }

    @ey(method = -1572580997614201904L)
    public Icon getCollapsedIcon() {
        try {
            if (tj) {
                iy.gn(4286989219947663989L, this);
            }
            return this.collapsedIcon;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 4286989219947663989L, this);
            }
            throw th;
        }
    }

    @ey(method = 4435051594270047135L)
    public int getConsoleMaxWidth() {
        try {
            if (tj) {
                iy.gn(165965741677137456L, this);
            }
            return this.consoleMaxWidth;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 165965741677137456L, this);
            }
            throw th;
        }
    }

    @ey(method = 1119302731523703265L)
    protected int getDefaultFontSize() {
        try {
            if (!tj) {
                return 14;
            }
            iy.gn(-2788751752275274560L, this);
            return 14;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -2788751752275274560L, this);
            }
            throw th;
        }
    }

    @ey(method = -1017018455469023001L)
    public Color getErrorColor() {
        try {
            if (tj) {
                iy.gn(-286817373231299820L, this);
            }
            return this.errorColor;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -286817373231299820L, this);
            }
            throw th;
        }
    }

    @ey(method = 308110861621263465L)
    public int getFirstSelectedColumn() {
        try {
            if (tj) {
                iy.gn(4981841932076380672L, this);
            }
            return this.firstSelectedColumn;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 4981841932076380672L, this);
            }
            throw th;
        }
    }

    @ey(method = -2401646531661126831L)
    public int getFirstSelectedLine() {
        try {
            if (tj) {
                iy.gn(3401053151668874940L, this);
            }
            return this.firstSelectedLine;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 3401053151668874940L, this);
            }
            throw th;
        }
    }

    @ey(method = 5102235551506259007L)
    public String getFontFamily() {
        try {
            if (tj) {
                iy.gn(-4872646946811413660L, this);
            }
            return this.fontFamily;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -4872646946811413660L, this);
            }
            throw th;
        }
    }

    @ey(method = -1267566187976876960L)
    public float getFontHeight() {
        try {
            if (tj) {
                iy.gn(-508174421139671321L, this);
            }
            return this.fontHeight;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -508174421139671321L, this);
            }
            throw th;
        }
    }

    @ey(method = -1170226142097148044L)
    public float getFontSize() {
        try {
            if (tj) {
                iy.gn(181952870451091495L, this);
            }
            return this.deviceFontSize / getContext().getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 181952870451091495L, this);
            }
            throw th;
        }
    }

    @ey(method = -1416447716380860240L)
    public boolean getInsertTabsAsSpaces() {
        try {
            if (tj) {
                iy.gn(-5087072302834916221L, this);
            }
            return this.insertTabsAsSpaces;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -5087072302834916221L, this);
            }
            throw th;
        }
    }

    @ey(method = -8194654871638427591L)
    public int getLastSelectedColumn() {
        try {
            if (tj) {
                iy.gn(-5887015566078525984L, this);
            }
            return this.lastSelectedColumn;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -5887015566078525984L, this);
            }
            throw th;
        }
    }

    @ey(method = 1818674483279390913L)
    public int getLastSelectedLine() {
        try {
            if (tj) {
                iy.gn(-6215631061965197224L, this);
            }
            return this.lastSelectedLine;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -6215631061965197224L, this);
            }
            throw th;
        }
    }

    @ey(method = -2860912278046551081L)
    public Model getModel() {
        try {
            if (tj) {
                iy.gn(-583309916635097520L, this);
            }
            return this.model;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -583309916635097520L, this);
            }
            throw th;
        }
    }

    @ey(method = 6575831743890600000L)
    public boolean getOverwriteMode() {
        try {
            if (tj) {
                iy.gn(-714608886011908509L, this);
            }
            return this.overwriteMode;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -714608886011908509L, this);
            }
            throw th;
        }
    }

    @ey(method = -574961609469487873L)
    public SelectedRegion getSelectedRegion() {
        try {
            if (tj) {
                iy.gn(5645868488241032196L, this);
            }
            return new SelectedRegion(this.firstSelectedLine, this.firstSelectedColumn, this.lastSelectedLine, this.lastSelectedColumn);
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 5645868488241032196L, this);
            }
            throw th;
        }
    }

    @ey(method = 953027719317019767L)
    public int getSelectionAnchorColumn() {
        try {
            if (tj) {
                iy.gn(-300682984867654008L, this);
            }
            return this.selectionAnchorColumn;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -300682984867654008L, this);
            }
            throw th;
        }
    }

    @ey(method = 154894326769791875L)
    public int getSelectionAnchorLine() {
        try {
            if (tj) {
                iy.gn(1476390587741334888L, this);
            }
            return this.selectionAnchorLine;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 1476390587741334888L, this);
            }
            throw th;
        }
    }

    @ey(method = 4400075521869301087L)
    public Color getSelectionColor() {
        try {
            if (tj) {
                iy.gn(-2905105062175266332L, this);
            }
            return this.selectionColor;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -2905105062175266332L, this);
            }
            throw th;
        }
    }

    @ey(method = 439602075993899880L)
    public int getSelectionPointColumn() {
        try {
            if (tj) {
                iy.gn(3725346254289557L, this);
            }
            return this.selectionPointColumn;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 3725346254289557L, this);
            }
            throw th;
        }
    }

    @ey(method = -834732557668851192L)
    public int getSelectionPointLine() {
        try {
            if (tj) {
                iy.gn(777523648282738981L, this);
            }
            return this.selectionPointLine;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 777523648282738981L, this);
            }
            throw th;
        }
    }

    @ey(method = -188201517289616520L)
    public boolean getSelectionVisibility() {
        try {
            if (tj) {
                iy.gn(-3990976827167181033L, this);
            }
            return this.selectionVisibility;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -3990976827167181033L, this);
            }
            throw th;
        }
    }

    @ey(method = -4395442635521415744L)
    public Color getSeparatorColor() {
        try {
            if (tj) {
                iy.gn(2270329347014530527L, this);
            }
            return this.separatorColor;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 2270329347014530527L, this);
            }
            throw th;
        }
    }

    @ey(method = -5774431829682125600L)
    protected float getSideBarPaddingLeft() {
        try {
            if (!tj) {
                return 0.0f;
            }
            iy.gn(-3711604915267502715L, this);
            return 0.0f;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -3711604915267502715L, this);
            }
            throw th;
        }
    }

    @ey(method = -2864240123648194952L)
    public float getSpaceCharWidth() {
        try {
            if (tj) {
                iy.gn(3565203489224377593L, this);
            }
            return this.spaceCharWidth;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 3565203489224377593L, this);
            }
            throw th;
        }
    }

    @ey(method = -3405470076997776780L)
    public int getTabSize() {
        try {
            if (tj) {
                iy.gn(-63376053275238435L, this);
            }
            return this.tabSize;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -63376053275238435L, this);
            }
            throw th;
        }
    }

    @ey(method = -5071438924236981585L)
    public Color getTodoColor() {
        try {
            if (tj) {
                iy.gn(-1704697713889731288L, this);
            }
            return this.todoColor;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -1704697713889731288L, this);
            }
            throw th;
        }
    }

    @ey(method = -1881826400635506561L)
    public Color getWarningColor() {
        try {
            if (tj) {
                iy.gn(-14963891733374620L, this);
            }
            return this.setWarningColor;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -14963891733374620L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.m
    @ey(method = 5331579407432030368L)
    public void gn(Model model, int i, int i2, int i3, int i4) {
        try {
            if (tj) {
                iy.J8(2573038167558182449L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            PT(i, i2, i3, i4);
        } catch (Throwable th) {
            if (pn) {
                iy.lg(th, 2573038167558182449L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 1362236335776288647L)
    protected boolean hasFocusWrapper() {
        try {
            if (tj) {
                iy.gn(1791474774172537760L, this);
            }
            return hasFocus();
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 1791474774172537760L, this);
            }
            throw th;
        }
    }

    @ey(method = -532780946951441139L)
    public void hp() {
        try {
            if (tj) {
                iy.gn(1845164993456786104L, this);
            }
            getLocalVisibleRect(this.qI);
            ce();
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 1845164993456786104L, this);
            }
            throw th;
        }
    }

    @ey(method = 58953648497082205L)
    public void iW(int i, int i2, int i3, int i4) {
        try {
            if (tj) {
                iy.J0(3233653916316712488L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            TI(i2, i);
            boolean z = true;
            Lz(i2, i, true);
            sT(i4, i3);
            if (i == i3 && i2 == i4) {
                z = false;
            }
            setSelectionVisibility(z);
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, 3233653916316712488L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 5961999972202375536L)
    protected void initColors() {
        try {
            if (tj) {
                iy.gn(-4578266939802740743L, this);
            }
            if (this.model != null) {
                this.textStyleArray = new TextStyle[this.model.er()];
                for (int i = 0; i < this.textStyleArray.length; i++) {
                    this.textStyleArray[i] = this.model.Ws(i);
                }
            }
            this.selectionColor = new Color(0, 153, 204);
            this.selectedRegionTextColor = Color.WHITE;
            this.separatorColor = new Color(238, 238, 238);
            this.softMaxWidthLineColor = Color.LIGHT_GRAY;
            this.stepbarColor = new Color(255, 200, 200);
            this.expressionSteppingPointColor = new Color(255, 80, 80);
            this.expressionDisplayColor = new Color(150, 150, 150);
            this.traceColor = new Color(255, ProxyTextView.INPUTTYPE_textWebPassword, ProxyTextView.INPUTTYPE_textWebPassword);
            this.setWarningColor = new Color(255, 200, 0);
            this.TRANSPARENT = Color.TRANSPARENT;
            this.graphicsColor = Color.WHITE;
            this.Za = new Color(255, 255, 220);
            this.Pa = Color.BLACK;
            this.An = Color.BLACK;
            this.errorColor = Color.RED;
            this.todoColor = Color.BLUE;
            this.hyperlinkColor = Color.BLACK;
            this.Jm = new Color(255, 202, 202);
            this.Bx = new Color(226, 240, 182);
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -4578266939802740743L, this);
            }
            throw th;
        }
    }

    @ey(method = -3406879588732826920L)
    public boolean isHidden() {
        try {
            if (tj) {
                iy.gn(-1049994125588995125L, this);
            }
            return this.hidden;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -1049994125588995125L, this);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 556332809838112225L)
    public boolean isOpaque() {
        try {
            if (!tj) {
                return true;
            }
            iy.gn(2324739958158000640L, this);
            return true;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 2324739958158000640L, this);
            }
            throw th;
        }
    }

    @ey(method = -619462928254215435L)
    public float jO(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-1744589339336713336L, this, new Integer(i), new Integer(i2));
            }
            if (i2 >= this.model.getLineCount()) {
                return this.hx;
            }
            if (q7(i2)) {
                return oY(getColumnWithTabs(i, i2));
            }
            ro(this.ep, i2);
            float f = this.hx;
            int iMin = Math.min(i, this.model.getColumnCount(i2));
            for (int i3 = 0; i3 < iMin; i3++) {
                f += this.HT[i3];
            }
            return f;
        } finally {
        }
    }

    @ey(method = 1833742329096564432L)
    public int kQ(float f, int i) {
        try {
            if (tj) {
                iy.EQ(-855316066693815831L, this, new Float(f), new Integer(i));
            }
            if (i >= 0 && i < this.model.getLineCount()) {
                int i2 = 0;
                if (!q7(i)) {
                    ro(this.ep, i);
                    float f2 = this.hx;
                    while (i2 < this.curReadColumnCount && f > f2) {
                        f2 += this.HT[i2];
                        i2++;
                    }
                    return i2;
                }
                readLineText(i);
                int i3 = 0;
                int i4 = 0;
                while (i3 < this.model.getColumnCount(i) && 0 + oY(i4) <= f) {
                    i4 = this.curReadTextChars[i3] == '\t' ? i4 + (this.tabSize - (i4 % this.tabSize)) : i4 + 1;
                    i3++;
                }
                return ((float) 0) + oY(i4) > f ? i3 - 1 : i3;
            }
            return -1;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -855316066693815831L, this, new Float(f), new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2475961836061410760L)
    public float ko(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(4529213960439594429L, this, new Integer(i), new Integer(i2));
            }
            if (i2 < this.model.getLineCount()) {
                return jO(i, i2);
            }
            return -1.0f;
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 4529213960439594429L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1681202331495587835L)
    protected void lp() {
        try {
            if (tj) {
                iy.gn(261035504387208144L, this);
            }
            for (int i = 0; i < this.selectionListenerVector.size(); i++) {
                this.selectionListenerVector.elementAt(i).DW(this);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, 261035504387208144L, this);
            }
            throw th;
        }
    }

    @ey(method = 2399969026619804275L)
    public boolean n5(int i) {
        try {
            if (tj) {
                iy.u7(1791175800879143900L, this, i);
            }
            if (i >= 0 && i < this.u9.size()) {
                return this.u9.get(i) != null;
            }
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 1791175800879143900L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 636149890492504080L)
    protected void onDraw(Canvas canvas) {
        boolean z;
        try {
            if (tj) {
                iy.tp(2612942867064901L, this, canvas);
            }
            if (isHidden() || this.model == null) {
                return;
            }
            Graphics graphics = new Graphics(canvas);
            Rect clipBounds = graphics.getClipBounds();
            if (CodeEditTextScrollView.Jl) {
                clipBounds.intersect(this.qI);
                if (clipBounds.isEmpty()) {
                    return;
                }
            }
            w wVar = new w(clipBounds);
            ((View) getParent().getParent().getParent().getParent()).getWidth();
            ((View) getParent().getParent().getParent().getParent()).getHeight();
            System.nanoTime();
            this.pO = (int) (Math.max(0.0f, wVar.j6 - this.hx) / this.spaceCharWidth);
            this.fN = (int) (((Math.max(0.0f, wVar.j6 - this.hx) + wVar.FH) - 1.0f) / this.spaceCharWidth);
            graphics.setColor(this.graphicsColor);
            graphics.drawRect(wVar.j6, wVar.DW, wVar.FH, wVar.Hw);
            int iEt = et(wVar.DW);
            boolean z2 = false;
            if (iEt < 0) {
                iEt = 0;
            }
            int iEt2 = et((wVar.DW + wVar.Hw) - 1.0f);
            if (iEt2 >= this.model.getLineCount()) {
                iEt2 = this.model.getLineCount() - 1;
                z = false;
            } else {
                z = true;
            }
            if (iEt <= iEt2) {
                An(graphics, iEt, iEt2);
                if (this.caretVisibility) {
                    pO(graphics);
                }
                z2 = z;
            }
            if (z2) {
                return;
            }
            graphics.setColor(this.graphicsColor);
            int i = iEt2 + 1;
            graphics.drawRect(wVar.j6, Ev(i), wVar.FH, (wVar.DW + wVar.Hw) - Ev(i));
            BR(graphics, Ev(i), wVar.DW + wVar.Hw);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 2612942867064901L, this, canvas);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 2585463343490448729L)
    protected void onMeasure(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-158695326444341680L, this, new Integer(i), new Integer(i2));
            }
            setMeasuredDimension((int) (((this.consoleMaxWidth + 1) * this.w9) + this.hx), (int) ((this.model == null ? 0 : this.model.getLineCount()) * this.fontHeight));
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, -158695326444341680L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 139487494708596276L)
    protected void pN(Graphics graphics, int i, int i2, int i3) {
        try {
            if (tj) {
                iy.J0(-5712048073250090665L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            float fOY = oY(i);
            int i4 = i;
            while (i4 <= i2) {
                int i5 = i4 - i;
                if (this.Gj[i5] == null) {
                    i4++;
                    fOY += this.spaceCharWidth;
                } else {
                    Color color = this.Gj[i5];
                    ColorKind colorKind = this.Cz[i5];
                    int i6 = 0;
                    int i7 = i4;
                    while (i7 <= i2 + 1) {
                        int i8 = i7 - i;
                        if (!color.equals(this.Gj[i8]) || this.Cz[i8] != colorKind) {
                            break;
                        }
                        i6 = (int) (i6 + this.spaceCharWidth);
                        i7++;
                    }
                    float f = i6;
                    Pa(graphics, fOY, Ev(i3) + this.hK + (this.fontHeight / 10.0f), f, color, colorKind);
                    fOY += f;
                    i4 = i7;
                }
            }
        } catch (Throwable th) {
            if (pn) {
                iy.a8(th, -5712048073250090665L, this, graphics, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.m
    @ey(method = 5384176315722493725L)
    public void rN(Model model, SelectedRegion selectedRegion, SelectedRegion selectedRegion2) {
        try {
            if (tj) {
                iy.we(-887511829154350140L, this, model, selectedRegion, selectedRegion2);
            }
            b1(selectedRegion);
            b1(selectedRegion2);
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, -887511829154350140L, this, model, selectedRegion, selectedRegion2);
            }
            throw th;
        }
    }

    @ey(method = -1238003238079657764L)
    public void sT(int i, int i2) {
        try {
            if (tj) {
                iy.EQ(-8742481824062749133L, this, new Integer(i), new Integer(i2));
            }
            if (i < 0 || i2 < 0) {
                i = 0;
                i2 = 0;
            }
            this.selectionPointColumn = i;
            this.selectionPointLine = i2;
            ef();
        } finally {
        }
    }

    @ey(method = 2178590425030392471L)
    public void setCaretBlinks(boolean z) {
        try {
            if (tj) {
                iy.Ws(86105434769536020L, this, z);
            }
            this.caret.setCaretBlinks(z);
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 86105434769536020L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -5144812971619551636L)
    public void setCaretVisibility(boolean z) {
        try {
            if (tj) {
                iy.Ws(-6982488078487785837L, this, z);
            }
            if (z != this.caretVisibility) {
                if (z) {
                    this.caret.setOConsole(this);
                } else {
                    this.caret.cancel();
                }
                this.caretVisibility = z;
                ce();
            }
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -6982488078487785837L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1551250054607375980L)
    public void setCollapsableIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(3984444505578992301L, this, icon);
            }
            this.collapsableIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 3984444505578992301L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = -3466694728347874989L)
    public void setCollapsedIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(-5344080016952827640L, this, icon);
            }
            this.collapsedIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -5344080016952827640L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = -458858505410389288L)
    public void setErrorColor(Color color) {
        try {
            if (tj) {
                iy.tp(-1987430393149791975L, this, color);
            }
            this.errorColor = color;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -1987430393149791975L, this, color);
            }
            throw th;
        }
    }

    @ey(method = -4426293848901519012L)
    public void setExpressionDisplayColor(Color color) {
        try {
            if (tj) {
                iy.tp(2520768664413604275L, this, color);
            }
            this.expressionDisplayColor = color;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 2520768664413604275L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 952202597175055600L)
    public void setExpressionSteppingPointColor(Color color) {
        try {
            if (tj) {
                iy.tp(5879143420331857L, this, color);
            }
            this.expressionSteppingPointColor = color;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 5879143420331857L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 1750597617240787169L)
    public void setFontFamily(String str) {
        try {
            if (tj) {
                iy.tp(-220552545209084312L, this, str);
            }
            this.fontFamily = str;
            xg(true);
            hp();
            ce();
            this.invalidateLayoutTask.DW();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -220552545209084312L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -327721270968913503L)
    public void setFontSize(float f) {
        try {
            if (tj) {
                iy.tp(-67916389480534400L, this, new Float(f));
            }
            setDensityIndependentFontSize(f);
            xg(false);
            hp();
            ce();
            this.invalidateLayoutTask.DW();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -67916389480534400L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = -2203075834600945209L)
    public void setHidden(boolean z) {
        try {
            if (tj) {
                iy.Ws(310366003371449256L, this, z);
            }
            this.hidden = z;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 310366003371449256L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 7524231512525595348L)
    public void setHyperlinkColor(Color color) {
        try {
            if (tj) {
                iy.tp(3886157330219018455L, this, color);
            }
            this.hyperlinkColor = color;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 3886157330219018455L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 679848275035988961L)
    public void setInsertTabsAsSpaces(boolean z) {
        try {
            if (tj) {
                iy.Ws(8674608509017357660L, this, z);
            }
            this.insertTabsAsSpaces = z;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 8674608509017357660L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -542021783308536240L)
    public void setModel(Model model) {
        try {
            if (tj) {
                iy.tp(-63810717653042365L, this, model);
            }
            if (this.model != null) {
                this.model.removeModelListener(this);
                this.model.XL(this);
            }
            this.curReadLineCount = -1;
            model.addModelListener(this);
            model.sh(this);
            this.model = model;
            this.fontFamily = "Monospaced";
            x9();
            initColors();
            SI();
            this.Gj = new Color[1];
            this.Cz = new ColorKind[1];
            this.oy = new Color[1];
            xg(true);
            this.dW = new Hashtable<>();
            this.d8 = new Vector<>();
            this.N0 = new ArrayList();
            sh();
            cb();
            this.invalidateLayoutTask.DW();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -63810717653042365L, this, model);
            }
            throw th;
        }
    }

    @ey(method = -3071015292894998421L)
    public void setOverriddenMethodIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(-304855709223869440L, this, icon);
            }
            this.overriddenMethodIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -304855709223869440L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = 3059801242063632400L)
    public void setOverridingMethodIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(-761668354025943419L, this, icon);
            }
            this.overridingMethodIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -761668354025943419L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = 4374805492242230265L)
    public void setOverwriteMode(boolean z) {
        try {
            if (tj) {
                iy.Ws(-5391419792685638440L, this, z);
            }
            if (z != this.overwriteMode) {
                this.overwriteMode = z;
                aj();
            }
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -5391419792685638440L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -7342406520268041040L)
    public void setSelectionColor(Color color) {
        try {
            if (tj) {
                iy.tp(5030504703665409481L, this, color);
            }
            this.selectionColor = color;
            if (this.selectionVisibility) {
                PT(this.firstSelectedColumn, this.firstSelectedLine, this.lastSelectedColumn, this.lastSelectedLine);
            }
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 5030504703665409481L, this, color);
            }
            throw th;
        }
    }

    @ey(method = -2031849883623309201L)
    public void setSelectionVisibility(boolean z) {
        try {
            if (tj) {
                iy.Ws(-376800436236542556L, this, z);
            }
            if (z != this.selectionVisibility) {
                if (!z || dx(this.selectionAnchorColumn, this.selectionAnchorLine, this.selectionPointColumn, this.selectionPointLine) != 0) {
                    this.selectionVisibility = z;
                    ce();
                    OW();
                }
                E4();
            }
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -376800436236542556L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3753283879030657701L)
    public void setSeparatorColor(Color color) {
        try {
            if (tj) {
                iy.tp(673793682172216920L, this, color);
            }
            this.separatorColor = color;
            ce();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 673793682172216920L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 1539447590896484620L)
    public void setSoftMaxWidthLineColor(Color color) {
        try {
            if (tj) {
                iy.tp(-602325594047199447L, this, color);
            }
            this.softMaxWidthLineColor = color;
            ce();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -602325594047199447L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 2856884973023456711L)
    public void setSoftMaxWidthRealColumn(int i) {
        try {
            if (tj) {
                iy.u7(204018013663241712L, this, i);
            }
            this.softMaxWidthRealColumn = i;
            ce();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 204018013663241712L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4372766547012781775L)
    public void setStepbarColor(Color color) {
        try {
            if (tj) {
                iy.tp(-4992245699657646108L, this, color);
            }
            this.stepbarColor = color;
            ce();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -4992245699657646108L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 2826343798639543065L)
    public void setTabSize(int i) {
        try {
            if (tj) {
                iy.u7(1102794218202540600L, this, i);
            }
            if (this.tabSize != i) {
                this.tabSize = i;
                ce();
                this.indexingLayoutTask.DW();
                this.invalidateLayoutTask.DW();
            }
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 1102794218202540600L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 791672337500210639L)
    public void setTestCaseFailedIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(-239596383037320540L, this, icon);
            }
            this.testCaseFailedIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -239596383037320540L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = -124209003621731175L)
    public void setTestCaseFailedPreviouslyIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(-3350134312829315280L, this, icon);
            }
            this.testCaseFailedPreviouslyIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -3350134312829315280L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = 898024634424136704L)
    public void setTestCasePassedIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(-332781532100805645L, this, icon);
            }
            this.testCasePassedIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -332781532100805645L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = -130318113373266984L)
    public void setTestCasePassedPreviouslyIcon(Icon icon) {
        try {
            if (tj) {
                iy.tp(-3299289840099783667L, this, icon);
            }
            this.testCasePassedPreviouslyIcon = icon;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -3299289840099783667L, this, icon);
            }
            throw th;
        }
    }

    @ey(method = 2877176682804405024L)
    public void setTodoColor(Color color) {
        try {
            if (tj) {
                iy.tp(3299757676177075295L, this, color);
            }
            this.todoColor = color;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 3299757676177075295L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 2512278499045134435L)
    public void setTraceColor(Color color) {
        try {
            if (tj) {
                iy.tp(392773121486627600L, this, color);
            }
            this.traceColor = color;
            ce();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 392773121486627600L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 1856389090353478992L)
    public void setWarningColor(Color color) {
        try {
            if (tj) {
                iy.tp(3964664903411715209L, this, color);
            }
            this.setWarningColor = color;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 3964664903411715209L, this, color);
            }
            throw th;
        }
    }

    @ey(method = 189750751032220147L)
    public void sy() {
        try {
            if (tj) {
                iy.gn(-3616040531644623440L, this);
            }
            Iterator<d> it = this.N0.iterator();
            while (it.hasNext()) {
                it.next().j6();
            }
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -3616040531644623440L, this);
            }
            throw th;
        }
    }

    @ey(method = -6901322771753509105L)
    public int wc(float f) {
        try {
            if (tj) {
                iy.tp(5500286993905675684L, this, new Float(f));
            }
            int iEt = et(f);
            if (f < 0.0f) {
                return -1;
            }
            if (iEt < this.model.getLineCount()) {
                return iEt;
            }
            return -2;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 5500286993905675684L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = 3684342438834962607L)
    protected void x9() {
        try {
            if (tj) {
                iy.gn(-4217175877063014944L, this);
            }
            int maxColumnCount = this.model.getMaxColumnCount();
            this.consoleMaxWidth = maxColumnCount;
            if (maxColumnCount > 0) {
                return;
            }
            int lineCount = this.model.getLineCount();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < lineCount; i3++) {
                readLineText(i3);
                int columnCount = this.model.getColumnCount(i3);
                int i4 = 0;
                for (int i5 = 0; i5 < columnCount; i5++) {
                    i4 += this.curReadTextChars[i5] == '\t' ? this.tabSize - (i4 % this.tabSize) : 1;
                }
                if (i4 > i2) {
                    i = i3;
                    i2 = i4;
                }
            }
            this.PH = i;
            this.consoleMaxWidth = i2;
        } catch (Throwable th) {
            if (pn) {
                iy.aM(th, -4217175877063014944L, this);
            }
            throw th;
        }
    }

    @ey(method = 19990925290957665L)
    protected void xg(boolean z) {
        try {
            if (tj) {
                iy.Ws(414678855745803960L, this, z);
            }
            Paint paint = new Paint();
            paint.setTypeface(defaultTypeface);
            this.k2 = Font.DW(defaultTypeface, getDeviceFontSize());
            paint.setTextSize(getDeviceFontSize());
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            paint.getTextSize();
            this.fontHeight = (int) ((-fontMetrics.top) + fontMetrics.bottom + fontMetrics.leading);
            this.spaceCharWidth = (int) paint.measureText(" ");
            this.w9 = (int) paint.measureText("M");
            this.q7 = (int) paint.measureText("8");
            this.hK = (int) (-fontMetrics.top);
            this.cT = (int) fontMetrics.bottom;
            if (z) {
                char c2 = 1;
                this.HO = true;
                while (true) {
                    if (c2 >= 256) {
                        break;
                    }
                    if (!Character.isISOControl(c2)) {
                        if (((int) paint.measureText(c2 + "")) != this.w9) {
                            this.HO = false;
                            break;
                        }
                    }
                    c2 = (char) (c2 + 1);
                }
            }
            this.w9 = (int) paint.measureText("M");
            for (int i = 0; i < this.fY.length; i++) {
                this.fY[i] = new Font(getDeviceFontSize(), defaultTypeface, this.textStyleArray[i].getTypefaceStyle());
            }
            this.qp = new Font(getDeviceFontSize(), defaultTypeface, 0);
            sh();
            cb();
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, 414678855745803960L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.ModelListener
    @ey(method = -1141939478342445552L)
    public void yS(Model model) {
        try {
            if (tj) {
                iy.tp(-642642751394288443L, this, model);
            }
            this.invalidateLayoutTask.DW();
            this.indexingLayoutTask.DW();
            sh();
            this.curReadLineCount = -1;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -642642751394288443L, this, model);
            }
            throw th;
        }
    }

    @ey(method = -2932631004415629760L)
    public boolean ye(int i) {
        try {
            if (tj) {
                iy.u7(-5019442408580461289L, this, i);
            }
            if (i >= 0 && i < this.Ak.size()) {
                return this.Ak.get(i) != null;
            }
            return false;
        } catch (Throwable th) {
            if (pn) {
                iy.j3(th, -5019442408580461289L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 5019189468793022016L)
    public OConsole(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (tj) {
                iy.EQ(68115333946096147L, null, context, attributeSet);
            }
            this.tabSize = 4;
            this.softMaxWidthRealColumn = 10000;
            this.fP = new Vector<>();
            this.b = new Vector<>();
            this.ba = new Vector<>();
            this.u9 = new Vector<>();
            this.Ak = new Vector<>();
            this.curReadLineCount = -1;
            this.curReadTextChars = new char[256];
            this.HT = new float[256];
            this.oT = new float[1];
            this.ep = new Graphics(null);
            this.qI = new Rect(0, 0, 0, 0);
            init();
        } catch (Throwable th) {
            if (pn) {
                iy.Mr(th, 68115333946096147L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 423411107679997453L)
    public OConsole(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (tj) {
                iy.we(-1434215046504414460L, null, context, attributeSet, new Integer(i));
            }
            this.tabSize = 4;
            this.softMaxWidthRealColumn = 10000;
            this.fP = new Vector<>();
            this.b = new Vector<>();
            this.ba = new Vector<>();
            this.u9 = new Vector<>();
            this.Ak = new Vector<>();
            this.curReadLineCount = -1;
            this.curReadTextChars = new char[256];
            this.HT = new float[256];
            this.oT = new float[1];
            this.ep = new Graphics(null);
            this.qI = new Rect(0, 0, 0, 0);
            init();
        } catch (Throwable th) {
            if (pn) {
                iy.U2(th, -1434215046504414460L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
