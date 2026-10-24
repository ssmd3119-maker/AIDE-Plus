package com.aide.ui.scm;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import com.aide.common.AppLog;
import com.aide.common.KeyStrokeDetector;
import com.aide.engine.FileHighlightings;
import com.aide.engine.StyleSpan;
import com.aide.engine.SyntaxStyleType;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.scm.a;
import com.aide.ui.util.FileSystem;
import com.aide.ui.views.CodeEditText;
import com.aide.ui.views.editor.SelectedRegion;
import com.aide.ui.views.editor.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@cy(clazz = -2208139259786690749L, container = -2208139259786690749L, user = true)
/* loaded from: classes.dex */
public class DiffView extends CodeEditText {

    @gy
    private static /* synthetic */ boolean eU;

    @fy
    private static /* synthetic */ boolean iW;

    @dy(field = 2968802806890530263L)
    private KeyStrokeDetector Jl;

    @dy(field = -636136340544233200L)
    private int Q6;

    @dy(field = 3040277300493817989L)
    private b Z1;

    @dy(field = -636169269069296487L)
    private int kf;

    @dy(field = 2189486516427060765L)
    private Object n5;

    @cy(clazz = 187012877605898848L, container = -2208139259786690749L, user = true)
    class a implements v.a {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -363094948005402477L)
        final /* synthetic */ StringBuilder DW;

        @dy(field = -2144589520328694495L)
        final /* synthetic */ ArrayList j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 704839676134654264L)
        a(ArrayList arrayList, StringBuilder sb) {
            this.j6 = arrayList;
            this.DW = sb;
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = -5077784443652718779L)
        public boolean DW(int i, char[] cArr, int i2, int i3) {
            try {
                if (Hw) {
                    iy.J0(5822832530979006048L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                this.j6.add(new String(cArr, i2, i3));
                return true;
            } catch (Throwable th) {
                if (v5) {
                    iy.a8(th, 5822832530979006048L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = 214371140683706133L)
        public void FH(int i, char[] cArr, int i2, int i3) {
            try {
                if (Hw) {
                    iy.J0(5047220549151579136L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                this.j6.add(new String(cArr, i2, i3));
            } catch (Throwable th) {
                if (v5) {
                    iy.a8(th, 5047220549151579136L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = -4497839733718405071L)
        public void j6(String str) {
            try {
                if (Hw) {
                    iy.tp(-7688579964517937224L, this, str);
                }
                this.DW.append(str);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -7688579964517937224L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -858911175984304184L, container = -858911175984304184L, user = true)
    public class b extends CodeEditText.CodeEditTextHighlightingModel {

        @fy
        private static /* synthetic */ boolean cb;

        @gy
        private static /* synthetic */ boolean dx;

        @dy(field = 2546098541940689505L)
        private ArrayList<Integer> KD;

        @dy(field = 2545998618238386224L)
        private ArrayList<Integer> SI;

        @dy(field = 583692788180474280L)
        private StyleSpan cn;

        @dy(field = 1348204581343355400L)
        private List<d> ei;

        @dy(field = -880815428847654123L)
        private ArrayList<Integer> nw;

        @dy(field = 583724768663328465L)
        private StyleSpan ro;

        @dy(field = -2740480310607674583L)
        @hy
        final /* synthetic */ DiffView sh;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -3523654590348831625L)
        public b(DiffView diffView) {
            super(diffView);
            try {
                if (cb) {
                    iy.tp(-1899540583449713775L, null, diffView);
                }
                this.sh = diffView;
                this.ei = new ArrayList();
                hK();
            } catch (Throwable th) {
                if (dx) {
                    iy.j3(th, -1899540583449713775L, null, diffView);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 1349658793897232104L)
        public void N0(String str) {
            try {
                if (cb) {
                    iy.tp(1266884240733767851L, this, str);
                }
                this.ei.clear();
                wE(str);
            } catch (Throwable th) {
                if (dx) {
                    iy.j3(th, 1266884240733767851L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 2594614560312257325L)
        private void wE(String str) {
            try {
                if (cb) {
                    iy.tp(-1999544909227185920L, this, str);
                }
                int lineCount = getLineCount() - 1;
                int columnCount = getColumnCount(lineCount) - 1;
                if (columnCount != -1 || lineCount != 0) {
                    Bx(new SelectedRegion(0, 0, lineCount, columnCount), this);
                }
                try {
                    a5(0, 0, new c(str), this);
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (dx) {
                    iy.j3(th, -1999544909227185920L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -1709310150810880000L)
        public boolean QX(int i) {
            try {
                if (!cb) {
                    return false;
                }
                iy.u7(-1537978937404656435L, this, i);
                return false;
            } catch (Throwable th) {
                if (dx) {
                    iy.j3(th, -1537978937404656435L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -1727804037118216736L)
        public boolean U2(int i, int i2) {
            try {
                if (cb) {
                    iy.EQ(733658571807984289L, this, new Integer(i), new Integer(i2));
                }
                if (this.ei.size() > i2) {
                    if (this.ei.get(i2) == d.inserted) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (dx) {
                    iy.Mr(th, 733658571807984289L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -1206888967868959305L)
        public boolean a8(int i, int i2) {
            try {
                if (cb) {
                    iy.EQ(325838956882811336L, this, new Integer(i), new Integer(i2));
                }
                if (this.ei.size() > i2) {
                    if (this.ei.get(i2) == d.deleted) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (dx) {
                    iy.Mr(th, 325838956882811336L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -4156054172555650365L)
        public void d8(List<String> list, List<String> list2, List<a.b> list3) {
            try {
                if (cb) {
                    iy.we(-5607053438206852760L, this, list, list2, list3);
                }
                this.ro = null;
                this.cn = null;
                this.ei = new ArrayList();
                this.nw = new ArrayList<>();
                this.SI = new ArrayList<>();
                this.KD = new ArrayList<>();
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                int i = 0;
                int i2 = -1;
                while (i < list3.size()) {
                    a.b bVar = list3.get(i);
                    for (int iJ6 = bVar.j6() - 3; iJ6 < bVar.j6(); iJ6++) {
                        if (iJ6 >= i2 && iJ6 >= 0) {
                            printWriter.println(list2.get(iJ6));
                            this.SI.add(-1);
                            this.KD.add(Integer.valueOf(iJ6));
                            this.ei.add(d.normal);
                            this.nw.add(Integer.valueOf(iJ6));
                        }
                    }
                    for (int i3 = 0; i3 < bVar.Hw(); i3++) {
                        printWriter.println(list.get(bVar.FH() + i3));
                        this.SI.add(Integer.valueOf(bVar.FH() + i3));
                        this.KD.add(-1);
                        this.ei.add(d.deleted);
                        this.nw.add(Integer.valueOf(bVar.j6()));
                    }
                    for (int i4 = 0; i4 < bVar.DW(); i4++) {
                        printWriter.println(list2.get(bVar.j6() + i4));
                        this.SI.add(-1);
                        this.KD.add(Integer.valueOf(bVar.j6() + i4));
                        this.ei.add(d.inserted);
                        this.nw.add(Integer.valueOf(bVar.j6() + i4));
                    }
                    int i5 = i + 1;
                    int iJ62 = i5 < list3.size() ? list3.get(i5).j6() : Integer.MAX_VALUE;
                    int iJ63 = bVar.j6() + bVar.DW();
                    int i6 = iJ63 + 3;
                    while (iJ63 < i6 && iJ63 < iJ62 && iJ63 < list2.size()) {
                        printWriter.println(list2.get(iJ63));
                        this.SI.add(-1);
                        this.KD.add(Integer.valueOf(iJ63));
                        this.ei.add(d.normal);
                        this.nw.add(Integer.valueOf(iJ63));
                        iJ63++;
                    }
                    if (i6 < iJ62 - 3 && i != list3.size() - 1) {
                        printWriter.println("");
                        this.SI.add(-1);
                        this.KD.add(-1);
                        this.ei.add(d.separator);
                        this.nw.add(0);
                    }
                    i2 = i6;
                    i = i5;
                }
                printWriter.flush();
                wE(stringWriter.toString());
            } catch (Throwable th) {
                if (dx) {
                    iy.U2(th, -5607053438206852760L, this, list, list2, list3);
                }
                throw th;
            }
        }

        @ey(method = 3115463760938178829L)
        public void eN(boolean z, SyntaxStyleType[] syntaxStyleTypeArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) throws Throwable {
            int i2 = 6;
            try {
                if (cb) {
                    iy.QX(-4291566791386378392L, this, new Object[]{new Boolean(z), syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i)});
                }
                try {
                    if (z) {
                        StyleSpan styleSpan = new StyleSpan();
                        this.cn = styleSpan;
                        i2 = 7;
                        styleSpan.we(syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, i);
                    } else {
                        i2 = 7;
                        StyleSpan styleSpan2 = new StyleSpan();
                        this.ro = styleSpan2;
                        styleSpan2.we(syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, i);
                    }
                    if (this.cn == null || this.ro == null) {
                        return;
                    }
                    StyleSpan styleSpanT6 = T6();
                    styleSpanT6.j6();
                    for (int i3 = 0; i3 < this.SI.size(); i3++) {
                        int iIntValue = this.SI.get(i3).intValue();
                        if (iIntValue != -1) {
                            styleSpanT6.EQ(i3, this.cn, iIntValue);
                        }
                    }
                    for (int i4 = 0; i4 < this.KD.size(); i4++) {
                        int iIntValue2 = this.KD.get(i4).intValue();
                        if (iIntValue2 != -1) {
                            styleSpanT6.EQ(i4, this.ro, iIntValue2);
                        }
                    }
                    Ej();
                } catch (Throwable th) {
                    th = th;
                    if (dx) {
                        Object[] objArr = new Object[i2];
                        objArr[0] = new Boolean(z);
                        objArr[1] = syntaxStyleTypeArr;
                        objArr[2] = iArr;
                        objArr[3] = iArr2;
                        objArr[4] = iArr3;
                        objArr[5] = iArr4;
                        objArr[6] = new Integer(i);
                        iy.rN(th, -4291566791386378392L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = 7;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel, com.aide.ui.views.editor.Model
        @ey(method = -2156446218474115288L)
        public boolean v5(int i) {
            int i2;
            try {
                if (cb) {
                    iy.u7(3176938342339038607L, this, i);
                }
                if (i > 0 && this.ei.size() > i - 1) {
                    if (this.ei.get(i2) == d.separator) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (dx) {
                    iy.j3(th, 3176938342339038607L, this, new Integer(i));
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -643176075855783200L, container = -643176075855783200L, user = true)
    private static final class d {

        @dy(field = -3289932142681750923L)
        public static final d deleted;

        @dy(field = -3315372281895001020L)
        public static final d inserted;

        @fy
        private static /* synthetic */ boolean k2;

        @dy(field = 148399580296853895L)
        public static final d normal;

        @dy(field = 1172953944837092600L)
        private static final /* synthetic */ d[] qp;

        @dy(field = -716603339664427657L)
        public static final d separator;

        @gy
        private static /* synthetic */ boolean zh;

        static {
            try {
                iy.Zo(d.class);
                if (k2) {
                    iy.gn(2422059270640380000L, null);
                }
                deleted = new d("deleted", 0);
                inserted = new d("inserted", 1);
                normal = new d("normal", 2);
                d dVar = new d("separator", 3);
                separator = dVar;
                qp = new d[]{deleted, inserted, normal, dVar};
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 2422059270640380000L, null);
                }
                throw th;
            }
        }

        @ey(method = -109728416929794048L)
        private d(String str, int i) {
            try {
                if (k2) {
                    iy.EQ(-6331272462828957300L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (zh) {
                    iy.Mr(th, -6331272462828957300L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 650836046562999087L)
        public static d valueOf(String str) {
            try {
                if (k2) {
                    iy.tp(-205199222549346272L, null, str);
                }
                return (d) Enum.valueOf(d.class, str);
            } catch (Throwable th) {
                if (zh) {
                    iy.j3(th, -205199222549346272L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 981975102083389773L)
        public static d[] values() {
            try {
                if (k2) {
                    iy.gn(-1583076517914858000L, null);
                }
                return (d[]) qp.clone();
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -1583076517914858000L, null);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(DiffView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 24715051230861376L)
    public DiffView(Context context) {
        super(context);
        try {
            if (iW) {
                iy.tp(995507978695068615L, null, context);
            }
            this.n5 = new Object();
            sh();
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 995507978695068615L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2506261604080349775L)
    private void sh() {
        try {
            if (iW) {
                iy.gn(-1915893125802515200L, this);
            }
            this.Z1 = new b(this);
            getOEditorView().setModel(this.Z1);
            getOEditorView().setEditable(false);
            getOEditorView().setCaretVisibility(false);
            this.Jl = new KeyStrokeDetector(getContext());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -1915893125802515200L, this);
            }
            throw th;
        }
    }

    @ey(method = 6296053236678548421L)
    private List<String> wc(String str, StringBuilder sb) {
        try {
            if (iW) {
                iy.EQ(-3409178666275389900L, this, str, sb);
            }
            if (str == null || !new File(str).exists()) {
                return Collections.emptyList();
            }
            try {
                ArrayList arrayList = new ArrayList();
                Reader readerMz = FileSystem.Mz(str);
                try {
                    v.j6(readerMz, new a(arrayList, sb), new char[1024]);
                    BufferedReader bufferedReader = new BufferedReader(readerMz);
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            return arrayList;
                        }
                        arrayList.add(line);
                    }
                } finally {
                    readerMz.close();
                }
            } catch (IOException e) {
                AppLog.v5(e);
                return Collections.emptyList();
            }
        } catch (Throwable th) {
            if (eU) {
                iy.Mr(th, -3409178666275389900L, this, str, sb);
            }
            throw th;
        }
    }

    @ey(method = 6126845235860724039L)
    public void CU() {
        try {
            if (iW) {
                iy.gn(2564329294907786848L, this);
            }
            this.Z1.d8(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 2564329294907786848L, this);
            }
            throw th;
        }
    }

    @ey(method = -1552720370476978380L)
    public void Xa(FileHighlightings fileHighlightings) {
        try {
            if (iW) {
                iy.tp(-934210217849879579L, this, fileHighlightings);
            }
            synchronized (this.n5) {
                if (fileHighlightings.AL == this.Q6 || fileHighlightings.AL == this.kf) {
                    if (fileHighlightings.AL == this.Q6) {
                        this.Z1.eN(true, fileHighlightings.syntaxStyleTypes, fileHighlightings.startLines, fileHighlightings.startColumns, fileHighlightings.endLines, fileHighlightings.endColumns, fileHighlightings.size);
                    } else if (fileHighlightings.AL == this.kf) {
                        this.Z1.eN(false, fileHighlightings.syntaxStyleTypes, fileHighlightings.startLines, fileHighlightings.startColumns, fileHighlightings.endLines, fileHighlightings.endColumns, fileHighlightings.size);
                    }
                }
            }
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, -934210217849879579L, this, fileHighlightings);
            }
            throw th;
        }
    }

    @ey(method = -298011653513084640L)
    public void et(String str, String str2, String str3) {
        try {
            if (iW) {
                iy.we(-7071736865925709887L, this, str, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            List<String> listWc = wc(str, sb);
            StringBuilder sb2 = new StringBuilder();
            List<String> listWc2 = wc(str2, sb2);
            List<a.b> listJ6 = com.aide.ui.scm.a.j6(listWc, listWc2);
            if (listJ6.size() == 0 && !sb.toString().equals(sb2.toString())) {
                setInformationalContent("Only the line separators differ");
                return;
            }
            this.Z1.d8(listWc, listWc2, listJ6);
            getOEditorView().TI(0, 0);
            getOEditorView().setSoftMaxWidthRealColumn(-1);
            synchronized (this.n5) {
                if (listWc.size() != 0) {
                    this.Q6 = ServiceContainer.getEngineService().dx(str3, str);
                }
                if (listWc2.size() != 0) {
                    this.kf = ServiceContainer.getEngineService().dx(str3, str2);
                }
            }
        } catch (Throwable th) {
            if (eU) {
                iy.U2(th, -7071736865925709887L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -1395783564016398692L)
    public b getDiffViewModel() {
        try {
            if (iW) {
                iy.gn(-1843515684582880245L, this);
            }
            return this.Z1;
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, -1843515684582880245L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.CodeEditText
    @ey(method = -452695911938845936L)
    public KeyStrokeDetector getKeyStrokeDetector() {
        try {
            if (iW) {
                iy.gn(4042976247959491595L, this);
            }
            return this.Jl;
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 4042976247959491595L, this);
            }
            throw th;
        }
    }

    @ey(method = -3790074357093429269L)
    public void jJ() {
        try {
            if (iW) {
                iy.gn(387079889831802768L, this);
            }
            setIsLightTheme(AppPreferences.BT());
            getOEditorView().setTabSize(AppPreferences.sy());
            getOEditorView().setInsertTabsAsSpaces(AppPreferences.gW());
            getOEditorView().setFontSize(AppPreferences.EQ());
        } catch (Throwable th) {
            if (eU) {
                iy.aM(th, 387079889831802768L, this);
            }
            throw th;
        }
    }

    @ey(method = 1090725466661395943L)
    public void setInformationalContent(String str) {
        try {
            if (iW) {
                iy.tp(2716955397185413032L, this, str);
            }
            this.Z1.N0("\n >>> " + str + "\n");
            getOEditorView().TI(0, 0);
            getOEditorView().setSoftMaxWidthRealColumn(-1);
        } catch (Throwable th) {
            if (eU) {
                iy.j3(th, 2716955397185413032L, this, str);
            }
            throw th;
        }
    }

    @cy(clazz = 344059681158054648L, container = 344059681158054648L, user = true)
    private static class c extends Reader {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 1959472078989220112L)
        private String WB;

        @dy(field = -179639570537357472L)
        private int jw;

        @dy(field = -1236157226571306723L)
        private int mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -205402445807323376L)
        public c(String str) {
            try {
                if (fY) {
                    iy.tp(-2761510744926703464L, null, str);
                }
                j6(str);
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -2761510744926703464L, null, str);
                }
                throw th;
            }
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        @ey(method = -2829168681434493112L)
        public void close() {
            try {
                if (fY) {
                    iy.gn(-337100010472454541L, this);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -337100010472454541L, this);
                }
                throw th;
            }
        }

        @ey(method = -2131931566749880125L)
        public void j6(String str) {
            try {
                if (fY) {
                    iy.tp(1422684757358836452L, this, str);
                }
                this.WB = str;
                this.mb = str.length();
                this.jw = 0;
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 1422684757358836452L, this, str);
                }
                throw th;
            }
        }

        @Override // java.io.Reader
        @ey(method = 129735231389024460L)
        public int read() {
            try {
                if (fY) {
                    iy.gn(1188225919907983775L, this);
                }
                if (this.jw < this.mb) {
                    String str = this.WB;
                    int i = this.jw;
                    this.jw = i + 1;
                    return str.charAt(i);
                }
                if (this.jw != this.mb) {
                    return -1;
                }
                this.jw++;
                return 10;
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 1188225919907983775L, this);
                }
                throw th;
            }
        }

        @Override // java.io.Reader
        @ey(method = 1063031570219061944L)
        public int read(char[] cArr, int i, int i2) {
            int i3;
            try {
                if (fY) {
                    iy.we(4171741386555731135L, this, cArr, new Integer(i), new Integer(i2));
                }
                if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                if (i2 == 0) {
                    return 0;
                }
                if (this.jw > this.mb) {
                    return -1;
                }
                if (this.jw == this.mb) {
                    cArr[i] = '\n';
                    this.jw++;
                    return 1;
                }
                int iMin = Math.min(this.mb - this.jw, i2);
                this.WB.getChars(this.jw, this.jw + iMin, cArr, i);
                this.jw += iMin;
                return iMin;
            } catch (Throwable th) {
                if (qp) {
                    iy.U2(th, 4171741386555731135L, this, cArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 152732819819919025L)
    public DiffView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (iW) {
                iy.EQ(-426445272046881660L, null, context, attributeSet);
            }
            this.n5 = new Object();
            sh();
        } catch (Throwable th) {
            if (eU) {
                iy.Mr(th, -426445272046881660L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -649300863056230560L)
    public DiffView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (iW) {
                iy.we(3016008985590151361L, null, context, attributeSet, new Integer(i));
            }
            this.n5 = new Object();
            sh();
        } catch (Throwable th) {
            if (eU) {
                iy.U2(th, 3016008985590151361L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
