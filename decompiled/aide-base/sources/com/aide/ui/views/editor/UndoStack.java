package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.common.StreamUtilities;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@cy(clazz = 1249987746797568L, container = 1249987746797568L, user = true)
/* loaded from: classes.dex */
public class UndoStack {

    @fy
    private static /* synthetic */ boolean EQ;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = 3214872589193513607L)
    private Vector<b> DW;

    @dy(field = -4607851757110847568L)
    private int FH;

    @dy(field = 659266929026161600L)
    private int Hw;

    @dy(field = 4389503699248078125L)
    private boolean VH;

    @dy(field = 571158782468205280L)
    private Position Zo;

    @dy(field = 2733736029107475652L)
    private boolean gn;

    @dy(field = 4782722753914987092L)
    private int j6;

    @dy(field = -276805489635223500L)
    private EditorModel tp;

    @dy(field = 2724417494531810728L)
    private boolean u7;

    @dy(field = -551340116666529720L)
    private List<g> v5;

    @cy(clazz = 1438759628179638912L, container = 1438759628179638912L, user = true)
    abstract class b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -3285402068001834216L)
        private Position j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -2862603343437358320L)
        protected b(UndoStack undoStack, Position position) {
            try {
                if (DW) {
                    iy.EQ(5147859381718535244L, null, undoStack, position);
                }
                this.j6 = position;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 5147859381718535244L, null, undoStack, position);
                }
                throw th;
            }
        }

        @ey(method = -4531599948387943308L)
        public abstract boolean DW(b bVar);

        @ey(method = -249103371749412375L)
        public Position FH() {
            try {
                if (DW) {
                    iy.gn(260307237177839499L, this);
                }
                return this.j6;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 260307237177839499L, this);
                }
                throw th;
            }
        }

        @ey(method = -3943942522186301481L)
        public abstract b Hw();

        @ey(method = -57963896362501632L)
        public abstract void j6(EditorModel editorModel);
    }

    @cy(clazz = -83077752623814351L, container = -83077752623814351L, user = true)
    private static class g {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -2190255284969858304L)
        public j DW;

        @dy(field = -3456590081099932329L)
        public int j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 137722409209815303L)
        public g(int i, j jVar) {
            try {
                if (FH) {
                    iy.EQ(-520329867138845148L, null, new Integer(i), jVar);
                }
                this.j6 = i;
                this.DW = jVar;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -520329867138845148L, null, new Integer(i), jVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3526423735236682320L, container = 3526423735236682320L, user = true)
    public interface j {
    }

    static {
        iy.Zo(UndoStack.class);
    }

    @ey(method = -244459638643978960L)
    public UndoStack(EditorModel editorModel, int i2) {
        try {
            if (EQ) {
                iy.EQ(506561421172831871L, null, editorModel, new Integer(i2));
            }
            this.tp = editorModel;
            this.v5 = new ArrayList(3);
            this.DW = new Vector<>();
            this.FH = 0;
            this.Hw = 0;
            j3(i2);
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 506561421172831871L, null, editorModel, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -4656277294830632625L)
    private void J0() {
        try {
            if (EQ) {
                iy.gn(-89629596837385059L, this);
            }
            if (this.FH != this.DW.size()) {
                this.DW.setSize(this.FH);
                if (this.Hw > this.FH) {
                    this.Hw = -1;
                }
                int i2 = 0;
                while (i2 < this.v5.size()) {
                    g gVar = this.v5.get(i2);
                    if (gVar.j6 > this.FH) {
                        this.v5.remove(gVar);
                        i2--;
                    }
                    i2++;
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -89629596837385059L, this);
            }
            throw th;
        }
    }

    @ey(method = 2878018346697557281L)
    private void J8(int i2) {
        try {
            if (EQ) {
                iy.u7(-1080196837532009221L, this, i2);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = 0;
                while (i5 < this.DW.size() - 1) {
                    int i6 = i5 + 1;
                    this.DW.setElementAt(this.DW.elementAt(i6), i5);
                    i5 = i6;
                }
            }
            this.DW.setSize(this.DW.size() - i2);
            int i7 = this.Hw - i2;
            this.Hw = i7;
            if (i7 < 0) {
                this.Hw = -1;
            }
            while (i3 < this.v5.size()) {
                g gVar = this.v5.get(i3);
                int i8 = gVar.j6 - i2;
                gVar.j6 = i8;
                if (i8 < 0) {
                    this.v5.remove(gVar);
                    i3--;
                }
                i3++;
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -1080196837532009221L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 294758014376780320L)
    private Position Ws(Object obj) {
        try {
            if (EQ) {
                iy.tp(-997366918397439040L, this, obj);
            }
            if (obj instanceof OConsole) {
                return ((OConsole) obj).getCaretPosition();
            }
            return null;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -997366918397439040L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -1385882146424781576L)
    private void gn(b bVar) {
        try {
            if (EQ) {
                iy.tp(-1214181994691294336L, this, bVar);
            }
            if (!this.VH && this.DW.size() != 0) {
                b bVarLastElement = this.DW.lastElement();
                if (bVarLastElement.DW(bVar)) {
                    return;
                }
                this.DW.setElementAt(new a(this, bVarLastElement.FH(), bVarLastElement, bVar), this.DW.size() - 1);
                return;
            }
            this.VH = false;
            if (this.DW.size() >= this.j6) {
                J8((this.DW.size() - this.j6) + 1);
            }
            this.DW.addElement(bVar);
            this.FH = this.DW.size();
            we();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -1214181994691294336L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 1670376726708774168L)
    private void we() {
        try {
            if (EQ) {
                iy.gn(78474975497193780L, this);
            }
            boolean z = true;
            boolean z2 = this.FH > 0;
            if (this.gn != z2) {
                this.gn = z2;
                this.tp.eU(z2);
            }
            if (this.FH == this.DW.size()) {
                z = false;
            }
            if (this.u7 != z) {
                this.u7 = z;
                this.tp.kf(z);
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 78474975497193780L, this);
            }
            throw th;
        }
    }

    @ey(method = 1418848748119504284L)
    public void DW(int i2, int i3, int i4, int i5, EditorModel editorModel, Object obj) {
        try {
            if (EQ) {
                iy.QX(3644786495751586632L, this, new Object[]{new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), editorModel, obj});
            }
            if (obj != this) {
                J0();
                SelectedRegion selectedRegion = new SelectedRegion(i2, i3, i4, i5);
                Position positionWs = Ws(obj);
                Reader selectedRegionReader = editorModel.getSelectedRegionReader(selectedRegion);
                StringWriter stringWriter = new StringWriter();
                try {
                    StreamUtilities.gn(selectedRegionReader, stringWriter);
                    gn(new c(this, positionWs, selectedRegion, stringWriter.toString()));
                } catch (IOException unused) {
                    throw new InternalError();
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.rN(th, 3644786495751586632L, this, new Object[]{new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), editorModel, obj});
            }
            throw th;
        }
    }

    @ey(method = 3746342159260399417L)
    public boolean EQ() {
        try {
            if (EQ) {
                iy.gn(424669314176485259L, this);
            }
            return this.gn;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 424669314176485259L, this);
            }
            throw th;
        }
    }

    @ey(method = 223152234113772337L)
    public void FH(int i2, int i3, EditorModel editorModel, Object obj) {
        try {
            if (EQ) {
                iy.J0(4962723583755141015L, this, new Integer(i2), new Integer(i3), editorModel, obj);
            }
            if (obj != this) {
                J0();
                gn(new e(this, Ws(obj), i3, i2));
            }
        } catch (Throwable th) {
            if (we) {
                iy.a8(th, 4962723583755141015L, this, new Integer(i2), new Integer(i3), editorModel, obj);
            }
            throw th;
        }
    }

    @ey(method = 2442423898604941936L)
    public void Hw(int i2, int i3, EditorModel editorModel, Object obj) {
        try {
            if (EQ) {
                iy.J0(1466344142190790704L, this, new Integer(i2), new Integer(i3), editorModel, obj);
            }
            if (obj != this) {
                J0();
                gn(new f(this, Ws(obj), i3, i2));
            }
        } catch (Throwable th) {
            if (we) {
                iy.a8(th, 1466344142190790704L, this, new Integer(i2), new Integer(i3), editorModel, obj);
            }
            throw th;
        }
    }

    @ey(method = -4501870108926660760L)
    public void Mr() {
        try {
            if (EQ) {
                iy.gn(1444757833063641148L, this);
            }
            this.Hw = this.FH;
            this.VH = true;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 1444757833063641148L, this);
            }
            throw th;
        }
    }

    @ey(method = 2586496859451831615L)
    public List<j> QX() {
        try {
            if (EQ) {
                iy.gn(4457863292117528169L, this);
            }
            ArrayList arrayList = new ArrayList(1);
            for (int i2 = 0; i2 < this.v5.size(); i2++) {
                g gVar = this.v5.get(i2);
                if (gVar.j6 == this.FH) {
                    arrayList.add(gVar.DW);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 4457863292117528169L, this);
            }
            throw th;
        }
    }

    @ey(method = -67764772458230292L)
    public void U2() {
        try {
            if (EQ) {
                iy.gn(-6440806834513154480L, this);
            }
            this.VH = true;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -6440806834513154480L, this);
            }
            throw th;
        }
    }

    @ey(method = -2318306292264958424L)
    public void VH(int i2, int i3, char[] cArr, char[] cArr2, EditorModel editorModel, Object obj) throws Throwable {
        int i4;
        try {
            if (EQ) {
                iy.QX(8038012561751284320L, this, new Object[]{new Integer(i2), new Integer(i3), cArr, cArr2, editorModel, obj});
            }
            if (obj != this) {
                J0();
                i4 = 6;
                try {
                    gn(new k(this, Ws(obj), i2, i3, cArr, cArr2));
                } catch (Throwable th) {
                    th = th;
                    if (we) {
                        Object[] objArr = new Object[i4];
                        objArr[0] = new Integer(i2);
                        objArr[1] = new Integer(i3);
                        objArr[2] = cArr;
                        objArr[3] = cArr2;
                        objArr[4] = editorModel;
                        objArr[5] = obj;
                        iy.rN(th, 8038012561751284320L, this, objArr);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i4 = 6;
        }
    }

    @ey(method = -82321954061279625L)
    public void XL(j jVar) {
        try {
            if (EQ) {
                iy.tp(6767090989045130709L, this, jVar);
            }
            this.v5.add(new g(this.FH, jVar));
            this.VH = true;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 6767090989045130709L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = 4195962177499500159L)
    public void Zo(int i2, int i3, int i4, int i5, EditorModel editorModel, Object obj) {
        try {
            if (EQ) {
                iy.QX(393215811465688761L, this, new Object[]{new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), editorModel, obj});
            }
            if (obj != this) {
                J0();
                SelectedRegion selectedRegion = new SelectedRegion(i2, i3, i4, i5);
                Position positionWs = Ws(obj);
                Reader selectedRegionReader = editorModel.getSelectedRegionReader(selectedRegion);
                StringWriter stringWriter = new StringWriter();
                try {
                    StreamUtilities.gn(selectedRegionReader, stringWriter);
                    gn(new h(this, positionWs, selectedRegion, stringWriter.toString()));
                } catch (IOException unused) {
                    throw new InternalError();
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.rN(th, 393215811465688761L, this, new Object[]{new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), editorModel, obj});
            }
            throw th;
        }
    }

    @ey(method = 3901095438204233280L)
    public Position a8(EditorModel editorModel, Object obj) {
        try {
            if (EQ) {
                iy.EQ(3711016680624179280L, this, editorModel, obj);
            }
            if (!this.gn) {
                return null;
            }
            if (this.FH == this.DW.size()) {
                this.Zo = Ws(obj);
            }
            U2();
            Vector<b> vector = this.DW;
            int i2 = this.FH - 1;
            this.FH = i2;
            b bVarElementAt = vector.elementAt(i2);
            bVarElementAt.Hw().j6(editorModel);
            we();
            return bVarElementAt.FH();
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 3711016680624179280L, this, editorModel, obj);
            }
            throw th;
        }
    }

    @ey(method = -1406801274790186233L)
    public Position aM(EditorModel editorModel) {
        try {
            if (EQ) {
                iy.tp(-90557112023679683L, this, editorModel);
            }
            if (!this.u7) {
                return null;
            }
            Vector<b> vector = this.DW;
            int i2 = this.FH;
            this.FH = i2 + 1;
            vector.elementAt(i2).j6(editorModel);
            we();
            return this.FH < this.DW.size() ? this.DW.elementAt(this.FH).FH() : this.Zo;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -90557112023679683L, this, editorModel);
            }
            throw th;
        }
    }

    @ey(method = 4273343935298415000L)
    public void j3(int i2) {
        try {
            if (EQ) {
                iy.u7(1983232168136699628L, this, i2);
            }
            if (this.j6 != i2) {
                this.j6 = i2;
                if (this.DW.size() > i2) {
                    int size = this.DW.size() - i2;
                    if (size > this.FH) {
                        size = this.FH;
                    }
                    J8(size);
                    this.FH -= size;
                    if (this.DW.size() > i2) {
                        this.DW.setSize(i2);
                    }
                }
            }
            we();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 1983232168136699628L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 6548541816404984429L)
    public void j6(int i2, int i3, char c2, EditorModel editorModel, Object obj) {
        try {
            if (EQ) {
                iy.J8(1323785611154857991L, this, new Integer(i2), new Integer(i3), new Character(c2), editorModel, obj);
            }
            if (obj != this) {
                J0();
                gn(new c(this, Ws(obj), new SelectedRegion(i2, i3, i2, i3), c2));
            }
        } catch (Throwable th) {
            if (we) {
                iy.lg(th, 1323785611154857991L, this, new Integer(i2), new Integer(i3), new Character(c2), editorModel, obj);
            }
            throw th;
        }
    }

    @ey(method = 3735561600235404499L)
    public boolean tp() {
        try {
            if (EQ) {
                iy.gn(420049935388886357L, this);
            }
            return this.u7;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 420049935388886357L, this);
            }
            throw th;
        }
    }

    @ey(method = 4049461388390286075L)
    public boolean u7() {
        try {
            if (EQ) {
                iy.gn(5603120105774012713L, this);
            }
            return this.FH == this.Hw;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 5603120105774012713L, this);
            }
            throw th;
        }
    }

    @ey(method = 793844300666569500L)
    public void v5(int i2, int i3, char c2, EditorModel editorModel, Object obj) {
        try {
            if (EQ) {
                iy.J8(6463168904715778408L, this, new Integer(i2), new Integer(i3), new Character(c2), editorModel, obj);
            }
            if (obj != this) {
                J0();
                gn(new h(this, Ws(obj), new SelectedRegion(i2, i3, i2, i3), c2));
            }
        } catch (Throwable th) {
            if (we) {
                iy.lg(th, 6463168904715778408L, this, new Integer(i2), new Integer(i3), new Character(c2), editorModel, obj);
            }
            throw th;
        }
    }

    @cy(clazz = 7022508235177747195L, container = 7022508235177747195L, user = true)
    class c extends i {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = -2088325845006829064L)
        @hy
        final /* synthetic */ UndoStack gn;

        static {
            iy.Zo(c.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -536166038317035075L)
        public c(UndoStack undoStack, h hVar) {
            super(undoStack, hVar);
            try {
                if (u7) {
                    iy.EQ(-173540459434166223L, null, undoStack, hVar);
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, -173540459434166223L, null, undoStack, hVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = -5027538933730721100L)
        public boolean DW(b bVar) {
            try {
                if (u7) {
                    iy.tp(-5132148096750893621L, this, bVar);
                }
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    if (cVar.Hw.getStartLine() != this.Hw.getEndLine() || cVar.Hw.getStartColumn() != this.Hw.getEndColumn() + 1) {
                        return false;
                    }
                    this.v5.append(cVar.v5.toString());
                    this.Hw.Zo(cVar.Hw.getEndColumn());
                    this.Hw.VH(cVar.Hw.getEndLine());
                    return true;
                }
                if (!(bVar instanceof e)) {
                    return false;
                }
                e eVar = (e) bVar;
                if (eVar.Zo() != this.Hw.getEndLine() || eVar.v5() != this.Hw.getEndColumn() + 1) {
                    return false;
                }
                this.v5.append('\n');
                this.Hw.Zo(-1);
                this.Hw.VH(this.Hw.getEndLine() + 1);
                return true;
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -5132148096750893621L, this, bVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 895250687425318503L)
        public b Hw() {
            try {
                if (u7) {
                    iy.gn(-2845936977018532560L, this);
                }
                return new h(this.gn, this);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -2845936977018532560L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 349149372573636256L)
        public void j6(EditorModel editorModel) {
            try {
                if (u7) {
                    iy.tp(-6847311438842232285L, this, editorModel);
                }
                try {
                    editorModel.a5(this.Hw.getStartColumn(), this.Hw.getStartLine(), new StringReader(this.v5.toString()), this.gn);
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -6847311438842232285L, this, editorModel);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 167548313203168008L)
        public c(UndoStack undoStack, Position position, SelectedRegion selectedRegion, String str) {
            super(undoStack, position, selectedRegion, str);
            try {
                if (u7) {
                    iy.J0(-100639308205867992L, null, undoStack, position, selectedRegion, str);
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.a8(th, -100639308205867992L, null, undoStack, position, selectedRegion, str);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -89005553727077185L)
        public c(UndoStack undoStack, Position position, SelectedRegion selectedRegion, char c) {
            super(undoStack, position, selectedRegion, c);
            try {
                if (u7) {
                    iy.J0(3086671701206640467L, null, undoStack, position, selectedRegion, new Character(c));
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.a8(th, 3086671701206640467L, null, undoStack, position, selectedRegion, new Character(c));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 720871569698903160L, container = 720871569698903160L, user = true)
    class e extends d {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = 3084772606716326976L)
        @hy
        final /* synthetic */ UndoStack gn;

        static {
            iy.Zo(e.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 119500895066992636L)
        public e(UndoStack undoStack, f fVar) {
            super(undoStack, fVar);
            try {
                if (u7) {
                    iy.EQ(-3603935800505160920L, null, undoStack, fVar);
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, -3603935800505160920L, null, undoStack, fVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 1267528408855137968L)
        public boolean DW(b bVar) {
            try {
                if (!u7) {
                    return false;
                }
                iy.tp(2310197876871521472L, this, bVar);
                return false;
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 2310197876871521472L, this, bVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 2963987527596970221L)
        public b Hw() {
            try {
                if (u7) {
                    iy.gn(-3470170598383940349L, this);
                }
                return new f(this.gn, this);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -3470170598383940349L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = -66703633146907760L)
        public void j6(EditorModel editorModel) {
            try {
                if (u7) {
                    iy.tp(449974227936093820L, this, editorModel);
                }
                editorModel.sM(this.Hw, this.v5, this.gn);
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 449974227936093820L, this, editorModel);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 3091777912061465952L)
        public e(UndoStack undoStack, Position position, int i, int i2) {
            super(undoStack, position, i, i2);
            try {
                if (u7) {
                    iy.J0(-1457194715467910496L, null, undoStack, position, new Integer(i), new Integer(i2));
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.a8(th, -1457194715467910496L, null, undoStack, position, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3625794670126781997L, container = -3625794670126781997L, user = true)
    class f extends d {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = -2009517538121909435L)
        @hy
        final /* synthetic */ UndoStack gn;

        static {
            iy.Zo(f.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -6507639524783295811L)
        public f(UndoStack undoStack, e eVar) {
            super(undoStack, eVar);
            try {
                if (u7) {
                    iy.EQ(405949296224712340L, null, undoStack, eVar);
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, 405949296224712340L, null, undoStack, eVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 3565960215535500987L)
        public boolean DW(b bVar) {
            try {
                if (!u7) {
                    return false;
                }
                iy.tp(6288888247788626443L, this, bVar);
                return false;
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 6288888247788626443L, this, bVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = -2950490311044851540L)
        public b Hw() {
            try {
                if (u7) {
                    iy.gn(-3421368656480105604L, this);
                }
                return new e(this.gn, this);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -3421368656480105604L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 505850255841011515L)
        public void j6(EditorModel editorModel) {
            try {
                if (u7) {
                    iy.tp(182200450811531243L, this, editorModel);
                }
                editorModel.Jm(this.v5, this.gn);
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 182200450811531243L, this, editorModel);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -4337593137123470941L)
        public f(UndoStack undoStack, Position position, int i, int i2) {
            super(undoStack, position, i, i2);
            try {
                if (u7) {
                    iy.J0(48863946136932816L, null, undoStack, position, new Integer(i), new Integer(i2));
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.a8(th, 48863946136932816L, null, undoStack, position, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1891639545270625536L, container = 1891639545270625536L, user = true)
    class h extends i {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = -1456149025667821311L)
        @hy
        final /* synthetic */ UndoStack gn;

        static {
            iy.Zo(h.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 335673432640640080L)
        public h(UndoStack undoStack, c cVar) {
            super(undoStack, cVar);
            try {
                if (u7) {
                    iy.EQ(2375843050760863485L, null, undoStack, cVar);
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, 2375843050760863485L, null, undoStack, cVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = -120588322841947385L)
        public boolean DW(b bVar) {
            try {
                if (u7) {
                    iy.tp(-1864826273751146640L, this, bVar);
                }
                if (bVar instanceof h) {
                    h hVar = (h) bVar;
                    int startLine = this.Hw.getStartLine();
                    int startColumn = this.Hw.getStartColumn();
                    int endLine = this.Hw.getEndLine();
                    int endColumn = this.Hw.getEndColumn();
                    int startLine2 = hVar.Hw.getStartLine();
                    int startColumn2 = hVar.Hw.getStartColumn();
                    int endLine2 = hVar.Hw.getEndLine();
                    int endColumn2 = hVar.Hw.getEndColumn();
                    if (startLine2 == startLine && startColumn2 == startColumn) {
                        this.v5.append(hVar.v5.toString());
                        if (startLine2 == endLine2) {
                            this.Hw.Zo(((endColumn + endColumn2) - startColumn2) + 1);
                        } else {
                            this.Hw.Zo(endColumn2);
                            this.Hw.VH((endLine + endLine2) - startLine2);
                        }
                        return true;
                    }
                    if (endLine2 == startLine && endColumn2 == startColumn - 1) {
                        this.v5.insert(0, (Object) hVar.v5);
                        if (startLine2 == endLine2) {
                            this.Hw.gn(startColumn2);
                        } else {
                            this.Hw.gn(startColumn2);
                            this.Hw.u7(startLine2);
                        }
                        return true;
                    }
                } else if (bVar instanceof f) {
                    f fVar = (f) bVar;
                    if (fVar.Zo() == this.Hw.getStartLine() && fVar.v5() == this.Hw.getStartColumn()) {
                        this.v5.append('\n');
                        this.Hw.Zo(-1);
                        this.Hw.VH(this.Hw.getEndLine() + 1);
                        return true;
                    }
                    if (fVar.Zo() == this.Hw.getStartLine() - 1 && this.Hw.getStartColumn() == 0) {
                        this.v5.insert(0, '\n');
                        this.Hw.gn(fVar.v5());
                        this.Hw.u7(this.Hw.getStartLine() - 1);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -1864826273751146640L, this, bVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 5392667533892446260L)
        public b Hw() {
            try {
                if (u7) {
                    iy.gn(-4451837035946748975L, this);
                }
                return new c(this.gn, this);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -4451837035946748975L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 273550368559695935L)
        public void j6(EditorModel editorModel) {
            try {
                if (u7) {
                    iy.tp(7009305524007497384L, this, editorModel);
                }
                editorModel.Bx(this.Hw, this.gn);
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 7009305524007497384L, this, editorModel);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 163389587907230125L)
        public h(UndoStack undoStack, Position position, SelectedRegion selectedRegion, String str) {
            super(undoStack, position, selectedRegion, str);
            try {
                if (u7) {
                    iy.J0(-518570380147329048L, null, undoStack, position, selectedRegion, str);
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.a8(th, -518570380147329048L, null, undoStack, position, selectedRegion, str);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 3423510407587322872L)
        public h(UndoStack undoStack, Position position, SelectedRegion selectedRegion, char c) {
            super(undoStack, position, selectedRegion, c);
            try {
                if (u7) {
                    iy.J0(-3979615427603839725L, null, undoStack, position, selectedRegion, new Character(c));
                }
                this.gn = undoStack;
            } catch (Throwable th) {
                if (tp) {
                    iy.a8(th, -3979615427603839725L, null, undoStack, position, selectedRegion, new Character(c));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3620296247909045877L, container = -3620296247909045877L, user = true)
    class a extends b {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 1626050423073139917L)
        Vector<b> Hw;

        @dy(field = -2744447185212123688L)
        @hy
        final /* synthetic */ UndoStack v5;

        static {
            iy.Zo(a.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -107674805472326684L)
        public a(UndoStack undoStack, Position position) {
            super(undoStack, position);
            try {
                if (Zo) {
                    iy.EQ(4178189817492492567L, null, undoStack, position);
                }
                this.v5 = undoStack;
                this.Hw = new Vector<>();
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, 4178189817492492567L, null, undoStack, position);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 4172485550991436448L)
        public boolean DW(b bVar) {
            try {
                if (Zo) {
                    iy.tp(-7501904528002448160L, this, bVar);
                }
                if (this.Hw.size() == 0) {
                    this.Hw.addElement(bVar);
                    return true;
                }
                if (this.Hw.lastElement().DW(bVar)) {
                    return true;
                }
                this.Hw.addElement(bVar);
                return true;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -7501904528002448160L, this, bVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = -3229444395573620103L)
        public b Hw() {
            try {
                if (Zo) {
                    iy.gn(5083046418004879471L, this);
                }
                a aVar = new a(this.v5, null);
                for (int size = this.Hw.size() - 1; size >= 0; size--) {
                    aVar.Hw.addElement(this.Hw.elementAt(size).Hw());
                }
                return aVar;
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 5083046418004879471L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 209884711551030792L)
        public void j6(EditorModel editorModel) {
            try {
                if (Zo) {
                    iy.tp(-94194311398794828L, this, editorModel);
                }
                for (int i = 0; i < this.Hw.size(); i++) {
                    this.Hw.elementAt(i).j6(editorModel);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -94194311398794828L, this, editorModel);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -7805117538865500160L)
        public a(UndoStack undoStack, Position position, b bVar, b bVar2) {
            super(undoStack, position);
            try {
                if (Zo) {
                    iy.J0(282748282793739563L, null, undoStack, position, bVar, bVar2);
                }
                this.v5 = undoStack;
                Vector<b> vector = new Vector<>();
                this.Hw = vector;
                vector.addElement(bVar);
                this.Hw.addElement(bVar2);
            } catch (Throwable th) {
                if (VH) {
                    iy.a8(th, 282748282793739563L, null, undoStack, position, bVar, bVar2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4388110033657633115L, container = -4388110033657633115L, user = true)
    abstract class d extends b {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 2478488237030312208L)
        int Hw;

        @dy(field = -2094444105717284320L)
        int v5;

        static {
            iy.Zo(d.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -7316779070336628852L)
        protected d(UndoStack undoStack, Position position, int i, int i2) {
            super(undoStack, position);
            try {
                if (Zo) {
                    iy.J0(4269626593996290627L, null, undoStack, position, new Integer(i), new Integer(i2));
                }
                this.Hw = i;
                this.v5 = i2;
            } catch (Throwable th) {
                if (VH) {
                    iy.a8(th, 4269626593996290627L, null, undoStack, position, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -1242167836765822971L)
        public int Zo() {
            try {
                if (Zo) {
                    iy.gn(-189951468283070631L, this);
                }
                return this.v5;
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, -189951468283070631L, this);
                }
                throw th;
            }
        }

        @ey(method = 2761078392910007325L)
        public int v5() {
            try {
                if (Zo) {
                    iy.gn(-325302996367937863L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, -325302996367937863L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 7713430580643574267L)
        protected d(UndoStack undoStack, d dVar) {
            super(undoStack, null);
            try {
                if (Zo) {
                    iy.EQ(2957721107432743696L, null, undoStack, dVar);
                }
                this.Hw = dVar.Hw;
                this.v5 = dVar.v5;
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, 2957721107432743696L, null, undoStack, dVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4418729315096096349L, container = 4418729315096096349L, user = true)
    abstract class i extends b {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 2598188816226223383L)
        protected SelectedRegion Hw;

        @dy(field = 1720897741372063371L)
        protected StringBuffer v5;

        static {
            iy.Zo(i.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 100490803382289031L)
        protected i(UndoStack undoStack, Position position, SelectedRegion selectedRegion, String str) {
            super(undoStack, position);
            try {
                if (Zo) {
                    iy.J0(221268389970862608L, null, undoStack, position, selectedRegion, str);
                }
                this.v5 = new StringBuffer(str);
                this.Hw = selectedRegion;
            } catch (Throwable th) {
                if (VH) {
                    iy.a8(th, 221268389970862608L, null, undoStack, position, selectedRegion, str);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 3383138944805573888L)
        protected i(UndoStack undoStack, Position position, SelectedRegion selectedRegion, char c) {
            super(undoStack, position);
            try {
                if (Zo) {
                    iy.J0(227123242790577617L, null, undoStack, position, selectedRegion, new Character(c));
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(c);
                this.v5 = stringBuffer;
                this.Hw = selectedRegion;
            } catch (Throwable th) {
                if (VH) {
                    iy.a8(th, 227123242790577617L, null, undoStack, position, selectedRegion, new Character(c));
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 3729619364131743300L)
        protected i(UndoStack undoStack, i iVar) {
            super(undoStack, null);
            try {
                if (Zo) {
                    iy.EQ(-62965559946536415L, null, undoStack, iVar);
                }
                this.Hw = iVar.Hw;
                this.v5 = iVar.v5;
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, -62965559946536415L, null, undoStack, iVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5671206475259852085L, container = -5671206475259852085L, user = true)
    class k extends b {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = -1658841207464378611L)
        int Hw;

        @dy(field = 881699447245591296L)
        char[] VH;

        @dy(field = 2602186740783949125L)
        char[] Zo;

        @dy(field = 1612368013024873467L)
        @hy
        final /* synthetic */ UndoStack gn;

        @dy(field = 2585817773733203373L)
        int v5;

        static {
            iy.Zo(k.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 156147901048549568L)
        public k(UndoStack undoStack, k kVar) {
            super(undoStack, null);
            try {
                if (u7) {
                    iy.EQ(2196461760567674695L, null, undoStack, kVar);
                }
                this.gn = undoStack;
                this.Zo = kVar.VH;
                this.VH = kVar.Zo;
                this.Hw = kVar.Hw;
                this.v5 = kVar.v5;
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, 2196461760567674695L, null, undoStack, kVar);
                }
                throw th;
            }
        }

        @ey(method = -102020871097405312L)
        private char[] v5(char[] cArr, char[] cArr2) {
            try {
                if (u7) {
                    iy.EQ(2517668243924204888L, this, cArr, cArr2);
                }
                char[] cArr3 = new char[cArr.length + cArr2.length];
                if (cArr.length != 0) {
                    System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
                }
                if (cArr2.length != 0) {
                    System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
                }
                return cArr3;
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, 2517668243924204888L, this, cArr, cArr2);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = -1261825426720028965L)
        public boolean DW(b bVar) {
            try {
                if (u7) {
                    iy.tp(6333237747989675271L, this, bVar);
                }
                if (!(bVar instanceof k)) {
                    return false;
                }
                k kVar = (k) bVar;
                if (kVar.v5 != this.v5 || kVar.Hw != this.Hw + this.VH.length) {
                    return false;
                }
                this.VH = v5(this.VH, kVar.VH);
                this.Zo = v5(this.Zo, kVar.Zo);
                return true;
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 6333237747989675271L, this, bVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = 1054255145208657408L)
        public b Hw() {
            try {
                if (u7) {
                    iy.gn(-10803691794907116L, this);
                }
                return new k(this.gn, this);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -10803691794907116L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.UndoStack.b
        @ey(method = -312398544234862701L)
        public void j6(EditorModel editorModel) {
            try {
                if (u7) {
                    iy.tp(99892496812752959L, this, editorModel);
                }
                editorModel.ce(this.Hw, this.v5, this.Zo.length, this.gn);
                editorModel.QO(this.Hw, this.v5, this.VH, this.gn);
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, 99892496812752959L, this, editorModel);
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 2113605729448437007L)
        public k(UndoStack undoStack, Position position, int i, int i2, char[] cArr, char[] cArr2) {
            super(undoStack, position);
            try {
                if (u7) {
                    iy.QX(-4698393692546487120L, null, new Object[]{undoStack, position, new Integer(i), new Integer(i2), cArr, cArr2});
                }
                this.gn = undoStack;
                this.Hw = i2;
                this.v5 = i;
                this.VH = cArr2;
                this.Zo = cArr;
            } catch (Throwable th) {
                if (tp) {
                    iy.rN(th, -4698393692546487120L, null, new Object[]{undoStack, position, new Integer(i), new Integer(i2), cArr, cArr2});
                }
                throw th;
            }
        }
    }
}
