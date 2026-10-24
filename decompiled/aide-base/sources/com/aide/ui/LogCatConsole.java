package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.yf;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.aide.common.KeyStroke;
import com.aide.common.KeyStrokeDetector;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.services.LogcatService;
import com.aide.ui.util.FileSpan;
import com.aide.ui.views.CodeEditText;
import com.aide.ui.views.editor.EditorModel;
import com.aide.ui.views.editor.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@cy(clazz = -3643350297993287765L, container = -3643350297993287765L, user = true)
/* loaded from: classes.dex */
public class LogCatConsole extends CodeEditText {

    @fy
    private static /* synthetic */ boolean Jl;

    @gy
    private static /* synthetic */ boolean iW;

    @dy(field = 4338252878867198361L)
    private yf<LogcatService.b> Q6;

    @dy(field = 4316204482976094932L)
    private QuickActionMenu Z1;

    @dy(field = -3109630105064670124L)
    private Handler kf;

    @dy(field = -5191424561062524288L)
    private QuickActionMenu n5;

    @cy(clazz = -3595284357750274048L, container = -3643350297993287765L, user = true)
    class a implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 136144534617752904L)
        a() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = 4366418025266196576L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(-2449561142953668516L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                LogCatConsole.this.lp(i, i2, i3, i4);
                LogCatConsole.this.kQ();
                LogCatConsole.this.gW();
                LogCatConsole.this.n5.Ws(true);
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -2449561142953668516L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3595379456126245581L, container = -3643350297993287765L, user = true)
    class b implements CodeEditText.d {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 228537528843484296L)
        b() {
        }

        @Override // com.aide.ui.views.CodeEditText.d
        @ey(method = 52016834124934820L)
        public void j6(int i, int i2, int i3, int i4) {
            try {
                if (DW) {
                    iy.J0(2843317905926363565L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                LogCatConsole.this.lp(i, i2, i, i2);
                LogCatConsole.this.cn();
                LogCatConsole.this.gW();
                LogcatService.b bVarGK = LogCatConsole.this.getLogCatModel().GK(i - 1);
                if (bVarGK != null) {
                    LogCatConsole.this.WB(bVarGK);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 2843317905926363565L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3595474554498153820L, container = -3643350297993287765L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2804131945612048984L)
        final /* synthetic */ LogcatService.b WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 3341927332237525920L)
        c(LogcatService.b bVar) {
            this.WB = bVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 1909090655777661525L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-4401853760120742387L, this);
                }
                LogCatConsole.this.getLogCatModel().Fd(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -4401853760120742387L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(LogCatConsole.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -104299375583338416L)
    public LogCatConsole(Context context) {
        super(context);
        try {
            if (Jl) {
                iy.tp(-685576631655635029L, null, context);
            }
            this.Z1 = new QuickActionMenu(ServiceContainer.getMainActivity(), s.logcatbrowser_menu);
            this.n5 = new QuickActionMenu(ServiceContainer.getMainActivity(), s.logcatbrowser_context_menu);
            this.Q6 = new yf<>(10000);
            sh();
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, -685576631655635029L, null, context);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 6716249590159796412L)
    public void WB(LogcatService.b bVar) throws NumberFormatException {
        int iIndexOf;
        String strSubstring;
        int iLastIndexOf;
        int i;
        try {
            if (Jl) {
                iy.tp(-4277607793179753088L, this, bVar);
            }
            if (ServiceContainer.getProjectService().isOpenProject() && AndroidProjectSupport.iW(ServiceContainer.getProjectService().getCurrentAppHome()) && bVar.VH.startsWith("at ") && (iIndexOf = bVar.VH.indexOf(40)) > 0 && (iLastIndexOf = (strSubstring = bVar.VH.substring(3, iIndexOf)).lastIndexOf(46)) > 0) {
                String strSubstring2 = strSubstring.substring(0, iLastIndexOf);
                int iIndexOf2 = strSubstring2.indexOf(36);
                if (iIndexOf2 > 0) {
                    strSubstring2 = strSubstring2.substring(0, iIndexOf2);
                }
                String strAj = ServiceContainer.getProjectService().aj(strSubstring2.replace('.', '/') + ".java");
                if (strAj != null) {
                    int iLastIndexOf2 = bVar.VH.lastIndexOf(58);
                    if (iLastIndexOf2 > 0) {
                        try {
                            i = Integer.parseInt(bVar.VH.substring(iLastIndexOf2 + 1, bVar.VH.length() - 1));
                        } catch (Exception unused) {
                        }
                    } else {
                        i = 1;
                    }
                    ServiceContainer.getMainActivity().aq(new FileSpan(strAj, i, 1, i, 1));
                }
            }
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, -4277607793179753088L, this, bVar);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4277866530002708876L)
    public d getLogCatModel() {
        try {
            if (Jl) {
                iy.gn(-2153899854821870176L, this);
            }
            return (d) getOEditorView().getModel();
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, -2153899854821870176L, this);
            }
            throw th;
        }
    }

    @ey(method = 65008566491412760L)
    private void setHeader(String str) {
        try {
            if (Jl) {
                iy.tp(-82111632252358800L, this, str);
            }
            ((TextView) getScrollView().getHeaderView().findViewById(q.logcatHeaderText)).setText(str);
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, -82111632252358800L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2966324543769245095L)
    private void sh() {
        try {
            if (Jl) {
                iy.gn(-1419905485765560195L, this);
            }
            this.kf = new Handler();
            getOEditorView().setModel(new d(this, null));
            getOEditorView().setHidden(false);
            getOEditorView().setEditable(false);
            J0(new a());
            aM(new b());
            aq();
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, -1419905485765560195L, this);
            }
            throw th;
        }
    }

    @ey(method = -1584977620317494004L)
    public void Eq() {
        try {
            if (Jl) {
                iy.gn(-1702557619388754272L, this);
            }
            synchronized (this.Q6) {
                this.Q6.DW();
                getLogCatModel().Lz();
            }
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, -1702557619388754272L, this);
            }
            throw th;
        }
    }

    @ey(method = -663721780820779671L)
    public void Ev() {
        try {
            if (Jl) {
                iy.gn(-3109667150796251635L, this);
            }
            getScrollView().getHeaderView().setVisibility(0);
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, -3109667150796251635L, this);
            }
            throw th;
        }
    }

    @ey(method = -1695149531278885657L)
    public void FN(String str) {
        try {
            if (Jl) {
                iy.tp(2853888219823191747L, this, str);
            }
            synchronized (this.Q6) {
                getLogCatModel().E4(str, this.Q6);
            }
            setHeader("LogCat - " + str);
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, 2853888219823191747L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -1901723705427247732L)
    public List<KeyStroke> P8(KeyStrokeCommand keyStrokeCommand) {
        try {
            if (Jl) {
                iy.tp(-810841701614928320L, this, keyStrokeCommand);
            }
            return ServiceContainer.Mr().j6(keyStrokeCommand);
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, -810841701614928320L, this, keyStrokeCommand);
            }
            throw th;
        }
    }

    @ey(method = 252924873097806784L)
    public void Xa(LogcatService.b bVar) {
        try {
            if (Jl) {
                iy.tp(710538411134095124L, this, bVar);
            }
            synchronized (this.Q6) {
                this.Q6.j6(bVar);
            }
            this.kf.post(new c(bVar));
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, 710538411134095124L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -2391228594651976599L)
    public void aq() {
        try {
            if (Jl) {
                iy.gn(607781048857928097L, this);
            }
            setIsLightTheme(AppPreferences.BT());
            getOEditorView().setTabSize(AppPreferences.sy());
            getOEditorView().setInsertTabsAsSpaces(AppPreferences.gW());
            getOEditorView().setFontSize(AppPreferences.EQ());
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, 607781048857928097L, this);
            }
            throw th;
        }
    }

    @ey(method = 2733233702169658928L)
    public List<String> getAllPriortities() {
        try {
            if (Jl) {
                iy.gn(6167495559102190200L, this);
            }
            return Arrays.asList("E", "W", "I", "D", "V");
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, 6167495559102190200L, this);
            }
            throw th;
        }
    }

    @ey(method = 5517687616021003539L)
    public List<String> getAllProcesses() {
        ArrayList arrayList;
        try {
            if (Jl) {
                iy.gn(3949294376043856407L, this);
            }
            synchronized (this.Q6) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < this.Q6.Zo(); i++) {
                    LogcatService.b bVarFH = this.Q6.FH(i);
                    if (bVarFH.Zo.length() > 0) {
                        hashSet.add(bVarFH.Zo);
                    }
                }
                arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
            }
            return arrayList;
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, 3949294376043856407L, this);
            }
            throw th;
        }
    }

    @ey(method = -4401075558467638935L)
    public List<String> getAllTags() {
        ArrayList arrayList;
        try {
            if (Jl) {
                iy.gn(2065450672828709181L, this);
            }
            synchronized (this.Q6) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < this.Q6.Zo(); i++) {
                    LogcatService.b bVarFH = this.Q6.FH(i);
                    if (bVarFH.v5.length() > 0) {
                        hashSet.add(bVarFH.v5);
                    }
                }
                arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
            }
            return arrayList;
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, 2065450672828709181L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -513283819491358263L)
    public List<KeyStrokeCommand> getCustomEditorCommands() {
        try {
            if (Jl) {
                iy.gn(-139750305018865863L, this);
            }
            return AppCommands.gn();
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, -139750305018865863L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -4410887105804847336L)
    public KeyStrokeDetector getKeyStrokeDetector() {
        try {
            if (Jl) {
                iy.gn(-1195023969372518416L, this);
            }
            return ServiceContainer.getMainActivity().vJ();
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, -1195023969372518416L, this);
            }
            throw th;
        }
    }

    @ey(method = 4099547056021400152L)
    public void hz() {
        try {
            if (Jl) {
                iy.gn(3669529684739791840L, this);
            }
            synchronized (this.Q6) {
                getLogCatModel().sT(this.Q6);
            }
            setHeader("LogCat");
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, 3669529684739791840L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = 223825901452050816L)
    protected boolean j3() {
        try {
            if (!Jl) {
                return false;
            }
            iy.gn(6640775518227927012L, this);
            return false;
        } catch (Throwable th) {
            if (iW) {
                iy.aM(th, 6640775518227927012L, this);
            }
            throw th;
        }
    }

    @ey(method = 4430296123789020660L)
    public void jO(String str) {
        try {
            if (Jl) {
                iy.tp(-6250329773944750944L, this, str);
            }
            synchronized (this.Q6) {
                getLogCatModel().xg(str, this.Q6);
            }
            setHeader("LogCat - " + str);
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, -6250329773944750944L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3425281048864431992L)
    public void ko(String str) {
        try {
            if (Jl) {
                iy.tp(345424038760917944L, this, str);
            }
            synchronized (this.Q6) {
                getLogCatModel().PH(str, this.Q6);
            }
            setHeader("LogCat - " + str);
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, 345424038760917944L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -5299123809816304281L)
    public void oY(String str) {
        try {
            if (Jl) {
                iy.tp(-2635555264285180557L, this, str);
            }
            synchronized (this.Q6) {
                getLogCatModel().hp(str, this.Q6);
            }
            setHeader("LogCat - " + str);
        } catch (Throwable th) {
            if (iW) {
                iy.j3(th, -2635555264285180557L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2248413463465041795L)
    public void ye(View view, boolean z) {
        try {
            if (Jl) {
                iy.EQ(-5495744820131307257L, this, view, new Boolean(z));
            }
            this.Z1.QX(view, z);
        } catch (Throwable th) {
            if (iW) {
                iy.Mr(th, -5495744820131307257L, this, view, new Boolean(z));
            }
            throw th;
        }
    }

    @cy(clazz = -190089136410662853L, container = -190089136410662853L, user = true)
    private class d extends EditorModel {

        @gy
        private static /* synthetic */ boolean BT;

        @fy
        private static /* synthetic */ boolean gW;

        @dy(field = 1993501496039044960L)
        private yf<CharSequence> Mr;

        @dy(field = -4619310223678231935L)
        private int U2;

        @dy(field = -488254138348913907L)
        private String a8;

        @dy(field = -2719369476068567056L)
        private String er;

        @dy(field = -2414098544799711273L)
        private yf<LogcatService.b> j3;

        @dy(field = 2721951416661405005L)
        private String lg;

        @dy(field = -2654179849536441807L)
        private String rN;

        @dy(field = 1665625570900677551L)
        @hy
        final /* synthetic */ LogCatConsole yS;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 382444491516858376L)
        private d(LogCatConsole logCatConsole) {
            try {
                if (gW) {
                    iy.tp(1767246146162564769L, null, logCatConsole);
                }
                this.yS = logCatConsole;
                this.j3 = new yf<>(200);
                this.Mr = new yf<>(200);
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, 1767246146162564769L, null, logCatConsole);
                }
                throw th;
            }
        }

        @ey(method = 1244727379411648000L)
        private void Hl(yf<LogcatService.b> yfVar) {
            try {
                if (gW) {
                    iy.tp(-800200258202867547L, this, yfVar);
                }
                synchronized (this.j3) {
                    ArrayList arrayList = new ArrayList();
                    for (int iZo = yfVar.Zo() - 1; iZo >= 0 && arrayList.size() < this.j3.Hw(); iZo--) {
                        LogcatService.b bVarFH = yfVar.FH(iZo);
                        if (GT(bVarFH)) {
                            arrayList.add(bVarFH);
                        }
                    }
                    this.j3.DW();
                    this.Mr.DW();
                    this.U2 = 10;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        LogcatService.b bVar = (LogcatService.b) arrayList.get(size);
                        this.j3.j6(bVar);
                        CharSequence charSequenceJ6 = bVar.j6();
                        this.Mr.j6(charSequenceJ6);
                        this.U2 = Math.max(this.U2, charSequenceJ6.length());
                    }
                    kQ();
                }
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, -800200258202867547L, this, yfVar);
                }
                throw th;
            }
        }

        @ey(method = -6367332142765307616L)
        private String dW() {
            try {
                if (gW) {
                    iy.gn(2226875937256018193L, this);
                }
                if (this.yS.getLogCatModel().Yi()) {
                    return "<" + this.yS.getContext().getResources().getString(u.view_logcat_no_match) + ">";
                }
                return "<" + this.yS.getContext().getResources().getString(u.view_logcat_run_app) + ">";
            } catch (Throwable th) {
                if (BT) {
                    iy.aM(th, 2226875937256018193L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -780608268084545511L)
        public int DW(int i, int i2) {
            try {
                if (gW) {
                    iy.EQ(885996928058718332L, this, new Integer(i), new Integer(i2));
                }
                synchronized (this.j3) {
                    if (i2 >= 0) {
                        if (i2 < this.j3.Zo()) {
                            LogcatService.b bVarFH = this.j3.FH(i2);
                            if (bVarFH.DW(i)) {
                                if (bVarFH.v5()) {
                                    return 5;
                                }
                                if (bVarFH.FH()) {
                                    return 7;
                                }
                                return bVarFH.Zo() ? 6 : 4;
                            }
                            if (bVarFH.v5()) {
                                return 1;
                            }
                            if (bVarFH.FH()) {
                                return 3;
                            }
                            return bVarFH.Zo() ? 2 : 0;
                        }
                    }
                    return 0;
                }
            } catch (Throwable th) {
                if (BT) {
                    iy.Mr(th, 885996928058718332L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -4147756172488890365L)
        public void E4(String str, yf<LogcatService.b> yfVar) {
            try {
                if (gW) {
                    iy.EQ(-330249648793530240L, this, str, yfVar);
                }
                this.er = str;
                this.a8 = null;
                this.lg = null;
                this.rN = null;
                Hl(yfVar);
            } catch (Throwable th) {
                if (BT) {
                    iy.Mr(th, -330249648793530240L, this, str, yfVar);
                }
                throw th;
            }
        }

        @ey(method = -1229277814819216387L)
        public void Fd(LogcatService.b bVar) {
            try {
                if (gW) {
                    iy.tp(88516656248203880L, this, bVar);
                }
                if (GT(bVar)) {
                    synchronized (this.j3) {
                        LogcatService.b bVarJ6 = this.j3.j6(bVar);
                        CharSequence charSequenceJ6 = bVar.j6();
                        this.Mr.j6(charSequenceJ6);
                        this.U2 = Math.max(this.U2, charSequenceJ6.length());
                        if (bVarJ6 != null) {
                            this.yS.getOEditorView().Jl();
                        }
                        kQ();
                    }
                }
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, 88516656248203880L, this, bVar);
                }
                throw th;
            }
        }

        @ey(method = -272153989329789575L)
        public LogcatService.b GK(int i) {
            try {
                if (gW) {
                    iy.u7(547272239235404952L, this, i);
                }
                synchronized (this.j3) {
                    if (i >= 0) {
                        if (i < this.j3.Zo()) {
                            return this.j3.FH(i);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, 547272239235404952L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -966048692930667249L)
        public boolean GT(LogcatService.b bVar) {
            try {
                if (gW) {
                    iy.tp(-505482065664382028L, this, bVar);
                }
                if ((this.lg == null || bVar.Zo.equals(this.lg)) && ((this.rN == null || bVar.v5.equals(this.rN)) && (this.a8 == null || bVar.Hw.equals(this.a8)))) {
                    if (this.er != null) {
                        if (bVar.Hw(this.er)) {
                        }
                    }
                    return true;
                }
                return false;
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, -505482065664382028L, this, bVar);
                }
                throw th;
            }
        }

        @ey(method = -1182155265343046519L)
        public void Lz() {
            try {
                if (gW) {
                    iy.gn(1126356008378719104L, this);
                }
                Hl(new yf<>(1));
            } catch (Throwable th) {
                if (BT) {
                    iy.aM(th, 1126356008378719104L, this);
                }
                throw th;
            }
        }

        @ey(method = 4883823520621563192L)
        public void PH(String str, yf<LogcatService.b> yfVar) {
            try {
                if (gW) {
                    iy.EQ(-2252435674725849835L, this, str, yfVar);
                }
                this.er = null;
                this.a8 = null;
                this.rN = str;
                this.lg = null;
                Hl(yfVar);
            } catch (Throwable th) {
                if (BT) {
                    iy.Mr(th, -2252435674725849835L, this, str, yfVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -5283798537473392912L)
        public TextStyle Ws(int i) {
            try {
                if (gW) {
                    iy.u7(2157105801270817917L, this, i);
                }
                int i2 = -16777216;
                if (i == 0) {
                    if (!this.yS.sG()) {
                        i2 = -3355444;
                    }
                    return new TextStyle(i2, 0);
                }
                if (i == 1) {
                    return new TextStyle(-16738048, 0);
                }
                if (i == 2) {
                    return new TextStyle(-48128, 0);
                }
                if (i == 3) {
                    return new TextStyle(-65536, 0);
                }
                if (i != 4) {
                    return i == 5 ? new TextStyle(-16738048, 1) : i == 6 ? new TextStyle(-48128, 1) : new TextStyle(-65536, 1);
                }
                if (!this.yS.sG()) {
                    i2 = -3355444;
                }
                return new TextStyle(i2, 1);
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, 2157105801270817917L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2756155064600250300L)
        public boolean Yi() {
            try {
                if (gW) {
                    iy.gn(1329474583749133703L, this);
                }
                if (this.a8 == null && this.lg == null) {
                    if (this.rN == null) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (BT) {
                    iy.aM(th, 1329474583749133703L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -717764823121731216L)
        public char charAtColumnLine(int i, int i2) {
            try {
                if (gW) {
                    iy.EQ(-4122406925871701597L, this, new Integer(i), new Integer(i2));
                }
                synchronized (this.j3) {
                    if (i2 >= 0) {
                        if (i2 < this.Mr.Zo()) {
                            CharSequence charSequenceFH = this.Mr.FH(i2);
                            if (i >= charSequenceFH.length()) {
                                return ' ';
                            }
                            return charSequenceFH.charAt(i);
                        }
                    }
                    return dW().charAt(i);
                }
            } catch (Throwable th) {
                if (BT) {
                    iy.Mr(th, -4122406925871701597L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = 1416570764153201960L)
        public int er() {
            try {
                if (!gW) {
                    return 8;
                }
                iy.gn(-2354106764602153899L, this);
                return 8;
            } catch (Throwable th) {
                if (BT) {
                    iy.aM(th, -2354106764602153899L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = 2462324800202266675L)
        public int getColumnCount(int i) {
            try {
                if (gW) {
                    iy.u7(-1449416696112694800L, this, i);
                }
                synchronized (this.j3) {
                    if (i >= 0) {
                        if (i < this.Mr.Zo()) {
                            return this.Mr.FH(i).length();
                        }
                    }
                    return dW().length();
                }
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, -1449416696112694800L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = 3319974157180106985L)
        public int getLineCount() {
            int iMax;
            try {
                if (gW) {
                    iy.gn(1569120911265108672L, this);
                }
                synchronized (this.j3) {
                    iMax = Math.max(1, this.j3.Zo());
                }
                return iMax;
            } catch (Throwable th) {
                if (BT) {
                    iy.aM(th, 1569120911265108672L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = 5831280427337596728L)
        public int getMaxColumnCount() {
            int i;
            try {
                if (gW) {
                    iy.gn(5355508575918082297L, this);
                }
                synchronized (this.j3) {
                    i = this.U2;
                }
                return i;
            } catch (Throwable th) {
                if (BT) {
                    iy.aM(th, 5355508575918082297L, this);
                }
                throw th;
            }
        }

        @ey(method = 570650789519121355L)
        public void hp(String str, yf<LogcatService.b> yfVar) {
            try {
                if (gW) {
                    iy.EQ(-5687070894142221012L, this, str, yfVar);
                }
                this.er = null;
                this.a8 = null;
                this.lg = str;
                this.rN = null;
                Hl(yfVar);
            } catch (Throwable th) {
                if (BT) {
                    iy.Mr(th, -5687070894142221012L, this, str, yfVar);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: all -> 0x0043, LOOP:0: B:14:0x0036->B:15:0x0038, LOOP_END, TryCatch #0 {, blocks: (B:8:0x0016, B:11:0x001f, B:13:0x002c, B:15:0x0038, B:16:0x0041, B:12:0x0028), top: B:28:0x0016, outer: #1 }] */
        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @abcd.ey(method = -2869179543573570157L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void readLineText(int r8, char[] r9) {
            /*
                r7 = this;
                boolean r0 = com.aide.ui.LogCatConsole.d.gW     // Catch: java.lang.Throwable -> L46
                if (r0 == 0) goto L11
                r0 = 1673013995458542332(0x1737bd5d67903afc, double:7.93959207581008E-197)
                java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> L46
                r2.<init>(r8)     // Catch: java.lang.Throwable -> L46
                abcd.iy.EQ(r0, r7, r2, r9)     // Catch: java.lang.Throwable -> L46
            L11:
                abcd.yf<com.aide.ui.services.LogcatService$b> r0 = r7.j3     // Catch: java.lang.Throwable -> L46
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L46
                if (r8 < 0) goto L28
                abcd.yf<java.lang.CharSequence> r1 = r7.Mr     // Catch: java.lang.Throwable -> L43
                int r1 = r1.Zo()     // Catch: java.lang.Throwable -> L43
                if (r8 < r1) goto L1f
                goto L28
            L1f:
                abcd.yf<java.lang.CharSequence> r1 = r7.Mr     // Catch: java.lang.Throwable -> L43
                java.lang.Object r1 = r1.FH(r8)     // Catch: java.lang.Throwable -> L43
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> L43
                goto L2c
            L28:
                java.lang.String r1 = r7.dW()     // Catch: java.lang.Throwable -> L43
            L2c:
                int r2 = r9.length     // Catch: java.lang.Throwable -> L43
                int r3 = r1.length()     // Catch: java.lang.Throwable -> L43
                int r2 = java.lang.Math.min(r2, r3)     // Catch: java.lang.Throwable -> L43
                r3 = 0
            L36:
                if (r3 >= r2) goto L41
                char r4 = r1.charAt(r3)     // Catch: java.lang.Throwable -> L43
                r9[r3] = r4     // Catch: java.lang.Throwable -> L43
                int r3 = r3 + 1
                goto L36
            L41:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
                return
            L43:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
                throw r1     // Catch: java.lang.Throwable -> L46
            L46:
                r0 = move-exception
                boolean r1 = com.aide.ui.LogCatConsole.d.BT
                if (r1 == 0) goto L5b
                r2 = 1673013995458542332(0x1737bd5d67903afc, double:7.93959207581008E-197)
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r8)
                r1 = r0
                r4 = r7
                r6 = r9
                abcd.iy.Mr(r1, r2, r4, r5, r6)
            L5b:
                goto L5d
            L5c:
                throw r0
            L5d:
                goto L5c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.LogCatConsole.d.readLineText(int, char[]):void");
        }

        @ey(method = -735658588128645864L)
        public void sT(yf<LogcatService.b> yfVar) {
            try {
                if (gW) {
                    iy.tp(2133783066557640713L, this, yfVar);
                }
                this.er = null;
                this.a8 = null;
                this.lg = null;
                this.rN = null;
                Hl(yfVar);
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, 2133783066557640713L, this, yfVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -1261444221839732740L)
        public boolean v5(int i) {
            try {
                if (gW) {
                    iy.u7(1997144178375150675L, this, i);
                }
                LogcatService.b bVarGK = GK(i - 1);
                LogcatService.b bVarGK2 = GK(i);
                if (bVarGK != null && bVarGK2 != null) {
                    if (bVarGK.DW != bVarGK2.DW) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (BT) {
                    iy.j3(th, 1997144178375150675L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -943875658457719256L)
        public void xg(String str, yf<LogcatService.b> yfVar) {
            try {
                if (gW) {
                    iy.EQ(-1010032137716609L, this, str, yfVar);
                }
                this.er = null;
                this.a8 = str;
                this.rN = null;
                this.lg = null;
                Hl(yfVar);
            } catch (Throwable th) {
                if (BT) {
                    iy.Mr(th, -1010032137716609L, this, str, yfVar);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 299050530743059641L)
        /* synthetic */ d(LogCatConsole logCatConsole, a aVar) {
            this(logCatConsole);
            try {
                if (gW) {
                    iy.EQ(2036567014628253632L, null, logCatConsole, aVar);
                }
            } catch (Throwable th) {
                if (BT) {
                    iy.Mr(th, 2036567014628253632L, null, logCatConsole, aVar);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -117021012354230425L)
    public LogCatConsole(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (Jl) {
                iy.EQ(-3991601548306025280L, null, context, attributeSet);
            }
            this.Z1 = new QuickActionMenu(ServiceContainer.getMainActivity(), s.logcatbrowser_menu);
            this.n5 = new QuickActionMenu(ServiceContainer.getMainActivity(), s.logcatbrowser_context_menu);
            this.Q6 = new yf<>(10000);
            sh();
        } catch (Throwable th) {
            if (iW) {
                iy.Mr(th, -3991601548306025280L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1810960031923389952L)
    public LogCatConsole(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (Jl) {
                iy.we(-73371350780186399L, null, context, attributeSet, new Integer(i));
            }
            this.Z1 = new QuickActionMenu(ServiceContainer.getMainActivity(), s.logcatbrowser_menu);
            this.n5 = new QuickActionMenu(ServiceContainer.getMainActivity(), s.logcatbrowser_context_menu);
            this.Q6 = new yf<>(10000);
            sh();
        } catch (Throwable th) {
            if (iW) {
                iy.U2(th, -73371350780186399L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
