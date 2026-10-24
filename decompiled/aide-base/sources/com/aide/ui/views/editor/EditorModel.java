package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.common.StreamUtilities;
import com.aide.ui.views.editor.UndoStack;
import com.aide.ui.views.editor.v;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

@cy(clazz = 701484051258711375L, container = 701484051258711375L, user = true)
/* loaded from: classes.dex */
public class EditorModel extends AbstractModel implements Model {

    @fy
    private static /* synthetic */ boolean XL;

    @gy
    private static /* synthetic */ boolean aM;

    @dy(field = -3569700309703986720L)
    private long EQ;

    @dy(field = 2420816923545688976L)
    private d J0;

    @dy(field = -426780027635177700L)
    private List<com.aide.ui.views.editor.e> J8;

    @dy(field = 724830303484243968L)
    private String QX;

    @dy(field = -1536902494985414128L)
    private Vector<TextBuffer> VH;

    @dy(field = 6054785004997865047L)
    private Set<SelectedRegion> Ws;

    @dy(field = 6610845403337653512L)
    private Vector<g> Zo;

    @dy(field = -3347423500985842896L)
    private boolean gn;

    @dy(field = -4898569357168287388L)
    private boolean u7;

    @dy(field = -267594467209834320L)
    private UndoStack undoStack;

    @dy(field = 1011320175188144440L)
    private Vector<i> v5;

    @dy(field = -6140853491414537259L)
    private Set<q> we;

    @cy(clazz = 4066963683342623340L, container = 701484051258711375L, user = true)
    class a implements v.a {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = -2215796904192265353L)
        final /* synthetic */ boolean DW;

        @dy(field = -1096530431613760000L)
        final /* synthetic */ int FH;

        @dy(field = -6155448621922114483L)
        final /* synthetic */ boolean Hw;

        @dy(field = 5179064189107514960L)
        final /* synthetic */ StringBuffer j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 4497778008480929645L)
        a(StringBuffer stringBuffer, boolean z, int i, boolean z2) {
            this.j6 = stringBuffer;
            this.DW = z;
            this.FH = i;
            this.Hw = z2;
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = 270058414691690891L)
        public boolean DW(int i, char[] cArr, int i2, int i3) {
            int i4;
            try {
                if (Zo) {
                    iy.J0(-4508556052710039960L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                this.j6.setLength(0);
                if (this.DW) {
                    int i5 = i2;
                    int i6 = 0;
                    while (true) {
                        i4 = i2 + i3;
                        if (i5 >= i4) {
                            break;
                        }
                        char c = cArr[i5];
                        if (c == '\t') {
                            int i7 = this.FH - (i6 % this.FH);
                            if (i7 == 0) {
                                i7 = this.FH;
                            }
                            i6 += i7;
                        } else {
                            if (c != ' ') {
                                break;
                            }
                            i6++;
                        }
                        i5++;
                    }
                    for (int i8 = 0; i8 < i6 / this.FH; i8++) {
                        this.j6.append('\t');
                    }
                    for (int i9 = 0; i9 < i6 % this.FH; i9++) {
                        this.j6.append(' ');
                    }
                    while (i5 < i4) {
                        if (!Character.isISOControl(cArr[i5]) || cArr[i5] == '\t') {
                            this.j6.append(cArr[i5]);
                        }
                        i5++;
                    }
                } else {
                    for (int i10 = i2; i10 < i2 + i3; i10++) {
                        if (!Character.isISOControl(cArr[i10]) || cArr[i10] == '\t') {
                            this.j6.append(cArr[i10]);
                        }
                    }
                }
                if (this.j6.length() == 0) {
                    EditorModel.this.VH.addElement(EditorModel.this.AL());
                    return true;
                }
                char[] cArr2 = new char[this.j6.length()];
                this.j6.getChars(0, this.j6.length(), cArr2, 0);
                EditorModel.this.VH.addElement(EditorModel.this.w9(cArr2));
                return true;
            } catch (Throwable th) {
                if (VH) {
                    iy.a8(th, -4508556052710039960L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = -2290258381371006509L)
        public void FH(int i, char[] cArr, int i2, int i3) {
            int i4;
            try {
                if (Zo) {
                    iy.J0(-1478195853923552896L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                this.j6.setLength(0);
                if (this.DW) {
                    int i5 = i2;
                    int i6 = 0;
                    while (true) {
                        i4 = i2 + i3;
                        if (i5 >= i4) {
                            break;
                        }
                        char c = cArr[i5];
                        if (c == '\t') {
                            int i7 = this.FH - (i6 % this.FH);
                            if (i7 == 0) {
                                i7 = this.FH;
                            }
                            i6 += i7;
                        } else if (c != ' ') {
                            break;
                        } else {
                            i6++;
                        }
                        i5++;
                    }
                    for (int i8 = 0; i8 < i6 / this.FH; i8++) {
                        this.j6.append('\t');
                    }
                    for (int i9 = 0; i9 < i6 % this.FH; i9++) {
                        this.j6.append(' ');
                    }
                    while (i5 < i4) {
                        if (!Character.isISOControl(cArr[i5]) || cArr[i5] == '\t') {
                            this.j6.append(cArr[i5]);
                        }
                        i5++;
                    }
                } else {
                    for (int i10 = i2; i10 < i2 + i3; i10++) {
                        if (!Character.isISOControl(cArr[i10]) || cArr[i10] == '\t') {
                            this.j6.append(cArr[i10]);
                        }
                    }
                }
                if (this.j6.length() == 0) {
                    EditorModel.this.VH.addElement(EditorModel.this.AL());
                    return;
                }
                char[] cArr2 = new char[this.j6.length()];
                this.j6.getChars(0, this.j6.length(), cArr2, 0);
                EditorModel.this.VH.addElement(EditorModel.this.w9(cArr2));
            } catch (Throwable th) {
                if (VH) {
                    iy.a8(th, -1478195853923552896L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = 2024488279564409327L)
        public void j6(String str) {
            try {
                if (Zo) {
                    iy.tp(-954518513574271360L, this, str);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -954518513574271360L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4067103969721571863L, container = 701484051258711375L, user = true)
    class b implements ModelListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 117613271774662813L)
        b() {
        }

        @Override // com.aide.ui.views.editor.ModelListener
        @ey(method = -11003536162427025L)
        public void DW(Model model, int i, int i2, int i3, int i4) {
            try {
                if (mb) {
                    iy.J8(-1656478273935211221L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                Iterator it = EditorModel.this.Ws.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        if (EditorModel.this.J0 != null) {
                            SelectedRegion selectedRegion = null;
                            for (SelectedRegion selectedRegion2 : EditorModel.this.J0.j6) {
                                if (EditorModel.this.J0.DW != selectedRegion2) {
                                    boolean z2 = selectedRegion2.j6(i2, i) && !(i2 == selectedRegion2.getEndLine() && i == selectedRegion2.getEndColumn());
                                    if (z2 != selectedRegion2.j6(i4, i3)) {
                                        EditorModel.this.MP(null);
                                        return;
                                    }
                                    if (z2) {
                                        if (i2 != i4) {
                                            EditorModel.this.MP(null);
                                            return;
                                        }
                                        selectedRegion = selectedRegion2;
                                    }
                                    SelectedRegion selectedRegionWe = selectedRegion2.we(i, i2, i3, i4);
                                    if (selectedRegionWe != null) {
                                        EditorModel.this.OW(selectedRegionWe, selectedRegion2);
                                    }
                                }
                            }
                            if (EditorModel.this.J0.DW != null || EditorModel.this.J0.Hw) {
                                return;
                            }
                            if (selectedRegion != null) {
                                EditorModel.this.oa(selectedRegion);
                                return;
                            } else {
                                EditorModel.this.MP(null);
                                return;
                            }
                        }
                        return;
                    }
                    SelectedRegion selectedRegion3 = (SelectedRegion) it.next();
                    if (!selectedRegion3.j6(i2, i) || (i2 == selectedRegion3.getEndLine() && i == selectedRegion3.getEndColumn())) {
                        z = false;
                    }
                    if (z != selectedRegion3.j6(i4, i3)) {
                        EditorModel.this.MP(null);
                        return;
                    }
                    selectedRegion3.we(i, i2, i3, i4);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.lg(th, -1656478273935211221L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.ModelListener
        @ey(method = -1769858912848233655L)
        public void FH(Model model, int i, int i2, int i3, int i4) {
            try {
                if (mb) {
                    iy.J8(-1368150739322153969L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                Iterator it = EditorModel.this.Ws.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    SelectedRegion selectedRegion = (SelectedRegion) it.next();
                    if (!selectedRegion.j6(i2, i) || i != 0 || selectedRegion.getStartColumn() != 0 || selectedRegion.getStartLine() != i2) {
                        z = false;
                    }
                    if (z) {
                        selectedRegion.EQ(i, i2, i3, i4);
                    } else {
                        selectedRegion.tp(i, i2, i3, i4);
                    }
                }
                if (EditorModel.this.J0 != null) {
                    SelectedRegion selectedRegion2 = null;
                    for (SelectedRegion selectedRegion3 : EditorModel.this.J0.j6) {
                        if (EditorModel.this.J0.DW != selectedRegion3) {
                            boolean zJ6 = selectedRegion3.j6(i2, i);
                            boolean z2 = zJ6 && i == 0 && selectedRegion3.getStartColumn() == 0 && selectedRegion3.getStartLine() == i2;
                            if (zJ6 && !z2) {
                                if (i2 != i4) {
                                    EditorModel.this.MP(null);
                                    return;
                                }
                                selectedRegion2 = selectedRegion3;
                            }
                            SelectedRegion selectedRegionEQ = z2 ? selectedRegion3.EQ(i, i2, i3, i4) : selectedRegion3.tp(i, i2, i3, i4);
                            if (selectedRegionEQ != null) {
                                EditorModel.this.OW(selectedRegionEQ, selectedRegion3);
                            }
                        }
                    }
                    if (EditorModel.this.J0.DW != null || EditorModel.this.J0.Hw) {
                        return;
                    }
                    if (selectedRegion2 != null) {
                        EditorModel.this.oa(selectedRegion2);
                    } else {
                        EditorModel.this.MP(null);
                    }
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.lg(th, -1368150739322153969L, this, model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.ModelListener
        @ey(method = -5322735152942983669L)
        public void Zo(Model model, int i, int i2, int i3, char[] cArr) {
            try {
                if (mb) {
                    iy.J8(-4545576030143572953L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.lg(th, -4545576030143572953L, this, model, new Integer(i), new Integer(i2), new Integer(i3), cArr);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.ModelListener
        @ey(method = 539959322668593747L)
        public void yS(Model model) {
            try {
                if (mb) {
                    iy.tp(3309131602721008141L, this, model);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 3309131602721008141L, this, model);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4067244256104583680L, container = 701484051258711375L, user = true)
    class c implements i {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 93149561878962533L)
        c() {
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = 3779234751778838355L)
        public void DW(EditorModel editorModel, boolean z) {
            try {
                if (DW) {
                    iy.EQ(2042782332949827879L, this, editorModel, new Boolean(z));
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 2042782332949827879L, this, editorModel, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = -6163918325544793540L)
        public void FH() {
            try {
                if (DW) {
                    iy.gn(2712167781765902108L, this);
                }
                if (EditorModel.this.J0 != null) {
                    EditorModel.this.J0.Hw = true;
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 2712167781765902108L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = -6099373499901546240L)
        public void Hw() {
            try {
                if (DW) {
                    iy.gn(4607465921698491600L, this);
                }
                if (EditorModel.this.J0 != null) {
                    EditorModel.this.J0.Hw = false;
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 4607465921698491600L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = 5988601879126213536L)
        public void Zo() {
            try {
                if (DW) {
                    iy.gn(-1187713279851199056L, this);
                }
                if (EditorModel.this.J0 != null) {
                    EditorModel.this.J0.Hw = false;
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1187713279851199056L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = 3816395301527111596L)
        public void j6(List<UndoStack.j> list) {
            try {
                if (DW) {
                    iy.tp(-7936137018396124748L, this, list);
                }
                if (EditorModel.this.J0 != null) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == EditorModel.this.J0.FH) {
                            EditorModel.this.MP(null);
                            return;
                        }
                    }
                    EditorModel.this.J0.Hw = true;
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -7936137018396124748L, this, list);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = -5596914752206648395L)
        public void v5(EditorModel editorModel, boolean z) {
            try {
                if (DW) {
                    iy.EQ(2484930423799543565L, this, editorModel, new Boolean(z));
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 2484930423799543565L, this, editorModel, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2790269944597238971L, container = -2790269944597238971L, user = true)
    private static class e implements UndoStack.j {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -403955265252822025L)
        private e() {
            try {
                if (j6) {
                    iy.gn(334532829900229656L, null);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.aM(th, 334532829900229656L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 150046330903677525L)
        /* synthetic */ e(a aVar) {
            this();
            try {
                if (j6) {
                    iy.tp(1848325574730334032L, null, aVar);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 1848325574730334032L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 596536669796767440L, container = 596536669796767440L, user = true)
    private class f implements v.a {

        @fy
        private static /* synthetic */ boolean gn;

        @gy
        private static /* synthetic */ boolean u7;

        @dy(field = -444030212557977389L)
        public int DW;

        @dy(field = 1443907801719764363L)
        public boolean FH;

        @dy(field = 333924652958848835L)
        private boolean Hw;

        @dy(field = 1747556327677837605L)
        @hy
        final /* synthetic */ EditorModel VH;

        @dy(field = -2317055347630197915L)
        private StringBuffer Zo;

        @dy(field = -1103030703262185321L)
        public int j6;

        @dy(field = 2472788672228795395L)
        private int v5;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 1251288513326665140L)
        public f(EditorModel editorModel, int i, int i2, boolean z, int i3) {
            try {
                if (gn) {
                    iy.J8(1766845931446844136L, null, editorModel, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3));
                }
                this.VH = editorModel;
                this.j6 = i;
                this.DW = i2;
                this.Zo = new StringBuffer();
                this.v5 = i3;
                this.Hw = z;
            } catch (Throwable th) {
                if (u7) {
                    iy.lg(th, 1766845931446844136L, null, editorModel, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = -365567515299568147L)
        public boolean DW(int i, char[] cArr, int i2, int i3) {
            try {
                if (gn) {
                    iy.J0(1853448139485647520L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                this.VH.gn = true;
                this.Zo.setLength(0);
                if (this.Hw) {
                    int i4 = 0;
                    for (int i5 = i2; i5 < i2 + i3; i5++) {
                        if (cArr[i5] == '\t') {
                            int i6 = this.v5 - (i4 % this.v5);
                            if (i6 == 0) {
                                i6 = this.v5;
                            }
                            for (int i7 = 0; i7 < i6; i7++) {
                                this.Zo.append(' ');
                            }
                            i4 += i6;
                        }
                        if (!Character.isISOControl(cArr[i5])) {
                            this.Zo.append(cArr[i5]);
                            i4++;
                        }
                    }
                } else {
                    for (int i8 = i2; i8 < i2 + i3; i8++) {
                        if (!Character.isISOControl(cArr[i8]) || cArr[i8] == '\t') {
                            this.Zo.append(cArr[i8]);
                        }
                    }
                }
                if (this.Zo.length() != 0) {
                    int length = this.Zo.length();
                    char[] cArr2 = new char[length];
                    this.Zo.getChars(0, this.Zo.length(), cArr2, 0);
                    if (this.j6 == 0) {
                        this.VH.VH.insertElementAt(new TextBuffer(cArr2), this.DW);
                    } else {
                        TextBuffer textBuffer = (TextBuffer) this.VH.VH.elementAt(this.DW);
                        textBuffer.VH(cArr2, this.j6);
                        this.j6 += length;
                        this.VH.VH.insertElementAt(this.VH.AL(), this.DW + 1);
                        char[] cArr3 = new char[textBuffer.J0() - this.j6];
                        textBuffer.Hw(this.j6, textBuffer.J0() - this.j6, cArr3, 0);
                        ((TextBuffer) this.VH.VH.elementAt(this.DW + 1)).j6(cArr3);
                        textBuffer.u7(textBuffer.J0() - this.j6, this.j6);
                    }
                } else if (this.j6 == 0) {
                    this.VH.VH.insertElementAt(this.VH.AL(), this.DW);
                } else {
                    TextBuffer textBuffer2 = (TextBuffer) this.VH.VH.elementAt(this.DW);
                    this.VH.VH.insertElementAt(this.VH.AL(), this.DW + 1);
                    char[] cArr4 = new char[textBuffer2.J0() - this.j6];
                    textBuffer2.Hw(this.j6, textBuffer2.J0() - this.j6, cArr4, 0);
                    ((TextBuffer) this.VH.VH.elementAt(this.DW + 1)).j6(cArr4);
                    textBuffer2.u7(textBuffer2.J0() - this.j6, this.j6);
                }
                this.DW++;
                this.j6 = 0;
                return true;
            } catch (Throwable th) {
                if (u7) {
                    iy.a8(th, 1853448139485647520L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = 740240209792582685L)
        public void FH(int i, char[] cArr, int i2, int i3) {
            try {
                if (gn) {
                    iy.J0(4876462194635181216L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                this.FH = true;
                this.Zo.setLength(0);
                for (int i4 = i2; i4 < i2 + i3; i4++) {
                    if (!Character.isISOControl(cArr[i4]) || cArr[i4] == '\t') {
                        this.Zo.append(cArr[i4]);
                    }
                }
                if (this.Zo.length() != 0) {
                    this.VH.gn = true;
                    char[] cArr2 = new char[this.Zo.length()];
                    this.Zo.getChars(0, this.Zo.length(), cArr2, 0);
                    ((TextBuffer) this.VH.VH.elementAt(this.DW)).VH(cArr2, this.j6);
                    this.j6 += this.Zo.length();
                }
            } catch (Throwable th) {
                if (u7) {
                    iy.a8(th, 4876462194635181216L, this, new Integer(i), cArr, new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.v.a
        @ey(method = 3385761320709361665L)
        public void j6(String str) {
            try {
                if (gn) {
                    iy.tp(-256881501346358144L, this, str);
                }
            } catch (Throwable th) {
                if (u7) {
                    iy.j3(th, -256881501346358144L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4245411797733093039L, container = 4245411797733093039L, user = true)
    public interface g {
        @ey(method = -2198490045925015728L)
        void j6(EditorModel editorModel, boolean z);
    }

    @cy(clazz = 2481800564044459095L, container = 2481800564044459095L, user = true)
    public static class h {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 2068669561470387111L)
        public int DW;

        @dy(field = 804577783862141480L)
        public long FH;

        @dy(field = 314106737699320588L)
        public char[] j6;

        static {
            iy.Zo(h.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -4273413634749472363L)
        /* synthetic */ h(char[] cArr, int i, long j, a aVar) {
            this(cArr, i, j);
            try {
                if (Hw) {
                    iy.J0(-1142407318767411960L, null, cArr, new Integer(i), new Long(j), aVar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.a8(th, -1142407318767411960L, null, cArr, new Integer(i), new Long(j), aVar);
                }
                throw th;
            }
        }

        @ey(method = 1929055566291736139L)
        private h(char[] cArr, int i, long j) {
            try {
                if (Hw) {
                    iy.we(-2081503546457335612L, null, cArr, new Integer(i), new Long(j));
                }
                this.j6 = cArr;
                this.DW = i;
                this.FH = j;
            } catch (Throwable th) {
                if (v5) {
                    iy.U2(th, -2081503546457335612L, null, cArr, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1850808990121222205L, container = -1850808990121222205L, user = true)
    public interface i {
        @ey(method = 4194169866549695439L)
        void DW(EditorModel editorModel, boolean z);

        @ey(method = 1109729878316298336L)
        void FH();

        @ey(method = 2086159897598720944L)
        void Hw();

        @ey(method = 123164592391816508L)
        void Zo();

        @ey(method = -2106735280878328960L)
        void j6(List<UndoStack.j> list);

        @ey(method = -5127815902172626107L)
        void v5(EditorModel editorModel, boolean z);
    }

    static {
        iy.Zo(EditorModel.class);
    }

    @ey(method = -940544085885537012L)
    public EditorModel() {
        try {
            if (XL) {
                iy.gn(3775562318384395823L, null);
            }
            this.v5 = new Vector<>();
            this.Zo = new Vector<>();
            this.VH = new Vector<>();
            this.we = new HashSet();
            this.J8 = new ArrayList();
            this.Ws = new HashSet();
            this.QX = System.getProperty("line.separator");
            this.EQ = System.currentTimeMillis();
            this.VH.addElement(AL());
            aX();
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 3775562318384395823L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 182765339296020635L)
    public TextBuffer AL() {
        try {
            if (XL) {
                iy.gn(-3367971499953880392L, this);
            }
            return new TextBuffer();
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -3367971499953880392L, this);
            }
            throw th;
        }
    }

    @ey(method = 1478000966443641003L)
    private void Jl() {
        try {
            if (XL) {
                iy.gn(-1753433747385932056L, this);
            }
            Iterator<i> it = this.v5.iterator();
            while (it.hasNext()) {
                it.next().Zo();
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -1753433747385932056L, this);
            }
            throw th;
        }
    }

    @ey(method = 1495021957989796567L)
    private void Q6() {
        try {
            if (XL) {
                iy.gn(-349154259929631744L, this);
            }
            br();
            Iterator<com.aide.ui.views.editor.e> it = this.J8.iterator();
            while (it.hasNext()) {
                it.next().DW(this, this.J0.j6);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -349154259929631744L, this);
            }
            throw th;
        }
    }

    @ey(method = -597742556071741605L)
    private void Z1(int i2, int i3) {
        try {
            if (XL) {
                iy.EQ(-4712978144577404876L, this, new Integer(i2), new Integer(i3));
            }
            Iterator<q> it = this.we.iterator();
            while (it.hasNext()) {
                it.next().j6(this, i2, i3);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -4712978144577404876L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -546096566764501984L)
    private void Za() {
        try {
            if (XL) {
                iy.gn(-3024685343352298129L, this);
            }
            if (this.u7 != oy()) {
                Enumeration<g> enumerationElements = this.Zo.elements();
                while (enumerationElements.hasMoreElements()) {
                    g gVarNextElement = enumerationElements.nextElement();
                    boolean zOy = oy();
                    this.u7 = zOy;
                    gVarNextElement.j6(this, zOy);
                }
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -3024685343352298129L, this);
            }
            throw th;
        }
    }

    @ey(method = 1424529994832425280L)
    private void aX() {
        try {
            if (XL) {
                iy.gn(-1798646668503184737L, this);
            }
            addModelListener(new b());
            zh(new c());
            cT(100);
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -1798646668503184737L, this);
            }
            throw th;
        }
    }

    @ey(method = 2277871039800396412L)
    private synchronized void ct() {
        try {
            if (XL) {
                iy.gn(-2252267740310457219L, this);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis <= this.EQ) {
                this.EQ++;
            } else {
                this.EQ = jCurrentTimeMillis;
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -2252267740310457219L, this);
            }
            throw th;
        }
    }

    @ey(method = 3953201403027494169L)
    private void e3() {
        try {
            if (XL) {
                iy.gn(446964072214455588L, this);
            }
            Iterator<i> it = this.v5.iterator();
            while (it.hasNext()) {
                it.next().Hw();
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 446964072214455588L, this);
            }
            throw th;
        }
    }

    @ey(method = 2586714742975009351L)
    private void iW() {
        try {
            if (XL) {
                iy.gn(3166280671476383168L, this);
            }
            Iterator<i> it = this.v5.iterator();
            while (it.hasNext()) {
                it.next().FH();
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 3166280671476383168L, this);
            }
            throw th;
        }
    }

    @ey(method = -242134997281934880L)
    private void n5() {
        try {
            if (XL) {
                iy.gn(696764327011289595L, this);
            }
            br();
            Iterator<com.aide.ui.views.editor.e> it = this.J8.iterator();
            while (it.hasNext()) {
                it.next().j6(this);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 696764327011289595L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1432305027870210984L)
    public void oa(SelectedRegion selectedRegion) {
        try {
            if (XL) {
                iy.tp(-746527390385200017L, this, selectedRegion);
            }
            StringWriter stringWriter = new StringWriter();
            try {
                StreamUtilities.gn(getSelectedRegionReader(selectedRegion.getStartColumn(), selectedRegion.getStartLine(), selectedRegion.getEndColumn() - 1, selectedRegion.getEndLine(), false), stringWriter);
                String string = stringWriter.toString();
                Of(true);
                for (SelectedRegion selectedRegion2 : this.J0.j6) {
                    if (selectedRegion2 != selectedRegion) {
                        this.J0.DW = selectedRegion2;
                        SelectedRegion selectedRegion3 = new SelectedRegion(selectedRegion2);
                        selectedRegion3.Zo(selectedRegion3.getEndColumn() - 1);
                        Bx(selectedRegion3, this);
                        Position positionA5 = a5(selectedRegion2.getStartColumn(), selectedRegion2.getStartLine(), new StringReader(string), this);
                        selectedRegion2.Zo(positionA5.getColumn());
                        selectedRegion2.VH(positionA5.getLine());
                        OW(selectedRegion3, selectedRegion2);
                        this.J0.DW = null;
                    }
                }
                Of(false);
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -746527390385200017L, this, selectedRegion);
            }
            throw th;
        }
    }

    @ey(method = -3674631762551562215L)
    private void q7() {
        try {
            if (XL) {
                iy.gn(-2631486620780498960L, this);
            }
            Iterator<q> it = this.we.iterator();
            while (it.hasNext()) {
                it.next().DW(this);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -2631486620780498960L, this);
            }
            throw th;
        }
    }

    @ey(method = -8606412387734737065L)
    private void qp(Reader reader, boolean z, int i2, boolean z2) {
        try {
            if (XL) {
                iy.J0(663945827258850480L, this, reader, new Boolean(z), new Integer(i2), new Boolean(z2));
            }
            v.j6(reader, new a(new StringBuffer(), z, i2, z2), new char[32768]);
            if (this.VH.size() == 0) {
                this.VH.addElement(AL());
            }
            reader.close();
            this.VH.trimToSize();
        } catch (Throwable th) {
            if (aM) {
                iy.a8(th, 663945827258850480L, this, reader, new Boolean(z), new Integer(i2), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 1531254069384421765L)
    private void sE(List<UndoStack.j> list) {
        try {
            if (XL) {
                iy.tp(4172984115566296320L, this, list);
            }
            Iterator<i> it = this.v5.iterator();
            while (it.hasNext()) {
                it.next().j6(list);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 4172984115566296320L, this, list);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1480680693370352260L)
    public TextBuffer w9(char[] cArr) {
        try {
            if (XL) {
                iy.tp(1477385313166866477L, this, cArr);
            }
            return new TextBuffer(cArr);
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 1477385313166866477L, this, cArr);
            }
            throw th;
        }
    }

    @ey(method = 3220429406533739400L)
    public void AE(UndoStack.j jVar) {
        try {
            if (XL) {
                iy.tp(5746368092733722025L, this, jVar);
            }
            if (this.undoStack != null) {
                this.undoStack.XL(jVar);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 5746368092733722025L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -4407666980684289811L)
    public Position AR(Object obj) {
        try {
            if (XL) {
                iy.tp(-3915169833805057800L, this, obj);
            }
            if (this.undoStack == null) {
                return null;
            }
            sE(this.undoStack.QX());
            Position positionA8 = this.undoStack.a8(this, obj);
            e3();
            return positionA8;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -3915169833805057800L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = 2787958937303963208L)
    public Position An() {
        try {
            if (XL) {
                iy.gn(2686591328050081769L, this);
            }
            if (this.undoStack == null) {
                return null;
            }
            iW();
            Position positionAM = this.undoStack.aM(this);
            Jl();
            return positionAM;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 2686591328050081769L, this);
            }
            throw th;
        }
    }

    @ey(method = -795668964594971927L)
    public boolean BR() {
        try {
            if (XL) {
                iy.gn(-4204850115276582380L, this);
            }
            if (this.undoStack != null) {
                if (this.undoStack.EQ()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -4204850115276582380L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @abcd.ey(method = -816937772701248576L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bx(com.aide.ui.views.editor.SelectedRegion r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.views.editor.EditorModel.Bx(com.aide.ui.views.editor.SelectedRegion, java.lang.Object):void");
    }

    @ey(method = -490807313233143833L)
    public synchronized long Cz() {
        try {
            if (XL) {
                iy.gn(127190277693457996L, this);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 127190277693457996L, this);
            }
            throw th;
        }
        return this.EQ;
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 1838741947151852139L)
    public int DW(int i2, int i3) {
        try {
            if (!XL) {
                return 0;
            }
            iy.EQ(-130572053887176460L, this, new Integer(i2), new Integer(i3));
            return 0;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -130572053887176460L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 2686442831847941201L)
    public int EQ() {
        try {
            if (!XL) {
                return -1;
            }
            iy.gn(544259557942434800L, this);
            return -1;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 544259557942434800L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 2262884343579780777L)
    public int FH() {
        try {
            if (!XL) {
                return -1;
            }
            iy.gn(-969822936828083900L, this);
            return -1;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -969822936828083900L, this);
            }
            throw th;
        }
    }

    @ey(method = -3913116945759152208L)
    public Reader Gj(SelectedRegion selectedRegion) {
        try {
            if (XL) {
                iy.tp(2709397780552986829L, this, selectedRegion);
            }
            return super.getSelectedRegionReader(selectedRegion, this.QX);
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 2709397780552986829L, this, selectedRegion);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 3629640981618503907L)
    public int I(int i2, int i3) {
        try {
            if (!XL) {
                return 0;
            }
            iy.EQ(-1909572530999691900L, this, new Integer(i2), new Integer(i3));
            return 0;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -1909572530999691900L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1225923423624110725L)
    public void Jm(int i2, Object obj) {
        int iJ0;
        int i3;
        try {
            if (XL) {
                iy.EQ(4167142714279021920L, this, new Integer(i2), obj);
            }
            synchronized (this) {
                TextBuffer textBufferElementAt = this.VH.elementAt(i2);
                iJ0 = textBufferElementAt.J0();
                i3 = i2 + 1;
                textBufferElementAt.j6(this.VH.elementAt(i3).v5());
                this.VH.removeElementAt(i3);
                if (this.undoStack != null) {
                    this.undoStack.Hw(i2, iJ0, this, obj);
                }
                ct();
            }
            q7();
            jJ(iJ0, i2, -1, i3);
            Za();
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 4167142714279021920L, this, new Integer(i2), obj);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -3793069082983434480L)
    public boolean KD(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(2940565636164667665L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 2940565636164667665L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1623333359311127343L)
    public void MP(List<SelectedRegion> list) {
        try {
            if (XL) {
                iy.tp(-4300588444215251940L, this, list);
            }
            if (list == null && this.J0 == null) {
                return;
            }
            a aVar = null;
            this.J0 = null;
            n5();
            if (list != null) {
                d dVar = new d(aVar);
                this.J0 = dVar;
                dVar.j6 = list;
                b1();
                this.J0.FH = new e(aVar);
                AE(this.J0.FH);
                Q6();
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -4300588444215251940L, this, list);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -5768642076908382891L)
    public boolean Mz(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(4076843259415332680L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 4076843259415332680L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1193464873809484557L)
    public boolean Nh() {
        try {
            if (XL) {
                iy.gn(-4537306389948836272L, this);
            }
            if (this.undoStack != null) {
                if (this.undoStack.tp()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -4537306389948836272L, this);
            }
            throw th;
        }
    }

    @ey(method = -1265075865750386976L)
    public void Of(boolean z) {
        try {
            if (XL) {
                iy.Ws(-6206192569977599771L, this, z);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -6206192569977599771L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 577680218817090928L)
    public SelectedRegion P8() {
        try {
            if (!XL) {
                return null;
            }
            iy.gn(3521902270260783409L, this);
            return null;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 3521902270260783409L, this);
            }
            throw th;
        }
    }

    @ey(method = -4296141683261016936L)
    public void PT() {
        try {
            if (XL) {
                iy.gn(-4307277452264729649L, this);
            }
            this.gn = false;
            if (this.undoStack != null) {
                this.undoStack.Mr();
            }
            Za();
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -4307277452264729649L, this);
            }
            throw th;
        }
    }

    @ey(method = 83564009858353047L)
    public void Pa(int i2, int i3, Object obj) {
        try {
            if (XL) {
                iy.we(-4632816123887875728L, this, new Integer(i2), new Integer(i3), obj);
            }
            this.gn = true;
            synchronized (this) {
                TextBuffer textBufferElementAt = this.VH.elementAt(i3);
                if (this.undoStack != null) {
                    this.undoStack.v5(i3, i2, textBufferElementAt.DW(i2), this, obj);
                }
                textBufferElementAt.gn(i2);
                ct();
            }
            Z1(i3, i3 + 1);
            jJ(i2, i3, i2, i3);
            Za();
        } catch (Throwable th) {
            if (aM) {
                iy.U2(th, -4632816123887875728L, this, new Integer(i2), new Integer(i3), obj);
            }
            throw th;
        }
    }

    @ey(method = 1448075340855110909L)
    public void QO(int i2, int i3, char[] cArr, Object obj) {
        try {
            if (XL) {
                iy.J0(-701893467255853320L, this, new Integer(i2), new Integer(i3), cArr, obj);
            }
            this.gn = true;
            synchronized (this) {
                this.VH.elementAt(i3).VH(cArr, i2);
                if (this.undoStack != null) {
                    this.undoStack.DW(i3, i2, i3, (cArr.length + i2) - 1, this, obj);
                }
                ct();
            }
            XG(i2, i3, (cArr.length + i2) - 1, i3);
            Za();
        } catch (Throwable th) {
            if (aM) {
                iy.a8(th, -701893467255853320L, this, new Integer(i2), new Integer(i3), cArr, obj);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -2893087230549301248L)
    public boolean QX(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(-1205239757752348735L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -1205239757752348735L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -3744614790836528037L)
    public boolean Sf(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(2882455327551907188L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 2882455327551907188L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2733679625732950895L)
    public void TI(int i2, int i3, char c2, Object obj) {
        char[] cArr;
        try {
            if (XL) {
                iy.J0(189920549290108400L, this, new Integer(i2), new Integer(i3), new Character(c2), obj);
            }
            this.gn = true;
            synchronized (this) {
                TextBuffer textBufferElementAt = this.VH.elementAt(i3);
                cArr = i2 < textBufferElementAt.J0() ? new char[]{textBufferElementAt.DW(i2)} : new char[0];
                char[] cArr2 = {c2};
                textBufferElementAt.tp(c2, i2);
                if (this.undoStack != null) {
                    this.undoStack.VH(i3, i2, cArr, cArr2, this, obj);
                }
                ct();
            }
            Z1(i3, i3 + 1);
            XX(i2, i3, 1, cArr);
            Za();
        } catch (Throwable th) {
            if (aM) {
                iy.a8(th, 189920549290108400L, this, new Integer(i2), new Integer(i3), new Character(c2), obj);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -687152548390178016L)
    public boolean U2(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(779267610003687033L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 779267610003687033L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 4271085236946723840L)
    public TextStyle Ws(int i2) {
        try {
            if (XL) {
                iy.u7(-3579882452090988975L, this, i2);
            }
            return new TextStyle(Color.BLACK, null, 0);
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -3579882452090988975L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -279603556056466112L)
    public boolean Zo(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(-914881959919862445L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -914881959919862445L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2764589820945274965L)
    public Position a5(int i2, int i3, Reader reader, Object obj) {
        try {
            if (XL) {
                iy.J0(-3577908950143489600L, this, new Integer(i2), new Integer(i3), reader, obj);
            }
            return ys(i2, i3, false, 0, reader, obj);
        } catch (Throwable th) {
            if (aM) {
                iy.a8(th, -3577908950143489600L, this, new Integer(i2), new Integer(i3), reader, obj);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 2161177467639118515L)
    public boolean a8(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(-480750234341180208L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -480750234341180208L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 2904347693909266300L)
    public boolean aj(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(-1019924064138227625L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -1019924064138227625L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -60181771048487971L)
    public void b1() {
        try {
            if (XL) {
                iy.gn(-2984429063842481200L, this);
            }
            if (this.undoStack != null) {
                this.undoStack.U2();
            }
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -2984429063842481200L, this);
            }
            throw th;
        }
    }

    @ey(method = 1899839077433140245L)
    public void cT(int i2) {
        try {
            if (XL) {
                iy.u7(-4053605570138808168L, this, i2);
            }
            if (i2 <= 0) {
                throw new IllegalArgumentException();
            }
            if (this.undoStack != null) {
                this.undoStack.j3(i2);
            } else {
                this.undoStack = new UndoStack(this, i2);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -4053605570138808168L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -4983030679403224975L)
    public void ce(int i2, int i3, int i4, Object obj) {
        try {
            if (XL) {
                iy.J0(3703218051326028000L, this, new Integer(i2), new Integer(i3), new Integer(i4), obj);
            }
            if (i4 > 0) {
                this.gn = true;
                synchronized (this) {
                    TextBuffer textBufferElementAt = this.VH.elementAt(i3);
                    if (this.undoStack != null) {
                        this.undoStack.Zo(i3, i2, i3, (i2 + i4) - 1, this, obj);
                    }
                    textBufferElementAt.u7(i4, i2);
                    ct();
                }
                Z1(i3, i3 + 1);
                jJ(i2, i3, (i2 + i4) - 1, i3);
                Za();
            }
        } catch (Throwable th) {
            if (aM) {
                iy.a8(th, 3703218051326028000L, this, new Integer(i2), new Integer(i3), new Integer(i4), obj);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 628614088364532440L)
    public char charAtColumnLine(int i2, int i3) {
        try {
            if (XL) {
                iy.EQ(1298217225943715079L, this, new Integer(i2), new Integer(i3));
            }
            return this.VH.elementAt(i3).DW(i2);
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 1298217225943715079L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -124506927097609693L)
    public boolean dx(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(61483241476394928L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 61483241476394928L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 4635780867942360619L)
    public void e9(int i2, int i3, char c2, Object obj) {
        try {
            if (XL) {
                iy.J0(-1235922568279209720L, this, new Integer(i2), new Integer(i3), new Character(c2), obj);
            }
            this.gn = true;
            synchronized (this) {
                this.VH.elementAt(i3).Zo(c2, i2);
                if (this.undoStack != null) {
                    this.undoStack.j6(i3, i2, c2, this, obj);
                }
                ct();
            }
            XG(i2, i3, i2, i3);
            Za();
        } catch (Throwable th) {
            if (aM) {
                iy.a8(th, -1235922568279209720L, this, new Integer(i2), new Integer(i3), new Character(c2), obj);
            }
            throw th;
        }
    }

    @ey(method = 4277231776341999384L)
    void eU(boolean z) {
        try {
            if (XL) {
                iy.Ws(-1732593631116455415L, this, z);
            }
            Enumeration<i> enumerationElements = this.v5.elements();
            while (enumerationElements.hasMoreElements()) {
                enumerationElements.nextElement().v5(this, z);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -1732593631116455415L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -2000858104401815232L)
    public boolean ef(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(558250198868820719L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 558250198868820719L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 3072198373333612020L)
    public int er() {
        try {
            if (!XL) {
                return 1;
            }
            iy.gn(2047612446645050257L, this);
            return 1;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 2047612446645050257L, this);
            }
            throw th;
        }
    }

    @ey(method = 1751970160308717984L)
    public char[] fN(int i2, int i3, int i4) {
        try {
            if (XL) {
                iy.we(-1056661244232195171L, this, new Integer(i2), new Integer(i3), new Integer(i4));
            }
            char[] cArr = new char[i4];
            this.VH.elementAt(i3).Hw(i2, i4, cArr, 0);
            return cArr;
        } catch (Throwable th) {
            if (aM) {
                iy.U2(th, -1056661244232195171L, this, new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1362325460427019200L)
    public void fY(com.aide.ui.views.editor.e eVar) {
        try {
            if (XL) {
                iy.tp(-714269081558083201L, this, eVar);
            }
            if (this.J8.contains(eVar)) {
                return;
            }
            this.J8.add(eVar);
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -714269081558083201L, this, eVar);
            }
            throw th;
        }
    }

    @ey(method = 2745960236196636900L)
    public boolean gG() {
        try {
            if (!XL) {
                return true;
            }
            iy.gn(1037987044176044515L, this);
            return true;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 1037987044176044515L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -3092936767127581235L)
    public int getColumnCount(int i2) {
        try {
            if (XL) {
                iy.u7(1450638094843290496L, this, i2);
            }
            if (this.VH.size() > i2 && i2 >= 0) {
                return this.VH.elementAt(i2).J0();
            }
            return 0;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 1450638094843290496L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -4064838243498106881L)
    public int getLineCount() {
        try {
            if (XL) {
                iy.gn(768635104343801552L, this);
            }
            return this.VH.size();
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 768635104343801552L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 3594643367756138764L)
    public int getMaxColumnCount() {
        try {
            if (!XL) {
                return -1;
            }
            iy.gn(-371162958922117019L, this);
            return -1;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -371162958922117019L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 1262601775393004928L)
    public SelectedRegion getSelectedRegion() {
        try {
            if (!XL) {
                return null;
            }
            iy.gn(-903826688817636771L, this);
            return null;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -903826688817636771L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.AbstractModel, com.aide.ui.views.editor.Model
    @ey(method = -943304681639745113L)
    public Reader getSelectedRegionReader(int i2, int i3, int i4, int i5, boolean z) {
        try {
            if (XL) {
                iy.J8(-1548272051940674472L, this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z));
            }
            return super.getSelectedRegionReader(i2, i3, i4, i5, z, this.QX);
        } catch (Throwable th) {
            if (aM) {
                iy.lg(th, -1548272051940674472L, this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -263351360932379976L)
    public boolean gn(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(-1063216882244064353L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -1063216882244064353L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -6350252212463469569L)
    public void hK() {
        try {
            if (XL) {
                iy.gn(831544277873003072L, this);
            }
            this.undoStack = null;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 831544277873003072L, this);
            }
            throw th;
        }
    }

    @ey(method = -1487625237148525656L)
    public void k2(g gVar) {
        try {
            if (XL) {
                iy.tp(563308193679265337L, this, gVar);
            }
            if (this.Zo.contains(gVar)) {
                return;
            }
            this.Zo.addElement(gVar);
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 563308193679265337L, this, gVar);
            }
            throw th;
        }
    }

    @ey(method = 4807912975398508800L)
    void kf(boolean z) {
        try {
            if (XL) {
                iy.Ws(-1279893575915849217L, this, z);
            }
            Enumeration<i> enumerationElements = this.v5.elements();
            while (enumerationElements.hasMoreElements()) {
                enumerationElements.nextElement().DW(this, z);
            }
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -1279893575915849217L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -196543844441035572L)
    public boolean lp(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(1333828968285814885L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 1333828968285814885L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3105750238507817193L)
    public boolean oy() {
        try {
            if (XL) {
                iy.gn(-781060162727246140L, this);
            }
            return this.undoStack == null ? this.gn : !this.undoStack.u7();
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -781060162727246140L, this);
            }
            throw th;
        }
    }

    @ey(method = 1895721782812801524L)
    public synchronized h pN(char[] cArr) {
        int i2;
        try {
            if (XL) {
                iy.tp(-94997327232740885L, this, cArr);
            }
            if (this.VH == null) {
                throw new IOException();
            }
            if (cArr == null) {
                cArr = new char[32768];
            }
            int i3 = 0;
            i2 = 0;
            while (i3 < this.VH.size()) {
                TextBuffer textBufferElementAt = this.VH.elementAt(i3);
                int iJ0 = textBufferElementAt.J0();
                int i4 = i2 + iJ0;
                int i5 = i4 + 1;
                if (i5 > cArr.length) {
                    int length = cArr.length;
                    do {
                        length *= 2;
                    } while (i5 > length);
                    char[] cArr2 = new char[length];
                    System.arraycopy(cArr, 0, cArr2, 0, i2);
                    cArr = cArr2;
                }
                if (iJ0 > 0) {
                    textBufferElementAt.Hw(0, iJ0, cArr, i2);
                    i2 = i4;
                }
                cArr[i2] = '\n';
                i3++;
                i2++;
            }
        } finally {
        }
        return new h(cArr, i2, this.EQ, null);
    }

    @ey(method = 1428518416652371720L)
    public char[] pO(int i2) {
        try {
            if (XL) {
                iy.u7(188360810656105735L, this, i2);
            }
            TextBuffer textBufferElementAt = this.VH.elementAt(i2);
            char[] cArr = new char[textBufferElementAt.J0()];
            textBufferElementAt.Hw(0, textBufferElementAt.J0(), cArr, 0);
            return cArr;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, 188360810656105735L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -5880073569467007540L)
    public void qP(Reader reader, Object obj) {
        try {
            if (XL) {
                iy.EQ(-1410040917256614929L, this, reader, obj);
            }
            b1();
            int lineCount = getLineCount() - 1;
            int columnCount = getColumnCount(lineCount) - 1;
            if (columnCount != -1 || lineCount != 0) {
                Bx(new SelectedRegion(0, 0, lineCount, columnCount), this);
            }
            char[] cArr = new char[32768];
            f fVar = new f(this, 0, 0, false, 0);
            IOException e2 = null;
            synchronized (this) {
                try {
                    v.j6(reader, fVar, cArr);
                } catch (IOException e3) {
                    e2 = e3;
                }
                try {
                    reader.close();
                } catch (IOException e4) {
                    if (e2 == null) {
                        e2 = e4;
                    }
                }
                if (fVar.DW == 0 && fVar.j6 == 0 && e2 != null) {
                    throw e2;
                }
                if (this.undoStack != null) {
                    this.undoStack.DW(0, 0, fVar.DW, fVar.j6 - 1, this, obj);
                }
                ct();
            }
            XG(0, 0, fVar.j6 - 1, fVar.DW);
            if (e2 == null && !fVar.FH && fVar.DW != 0) {
                Jm(fVar.DW - 1, obj);
            }
            PT();
            if (e2 != null) {
                throw e2;
            }
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -1410040917256614929L, this, reader, obj);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 1306011902233325679L)
    public boolean rN(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(-232420711103914864L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -232420711103914864L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -113705434124110815L)
    public void readLineText(int i2, char[] cArr) {
        try {
            if (XL) {
                iy.EQ(845413775444389956L, this, new Integer(i2), cArr);
            }
            TextBuffer textBufferElementAt = this.VH.elementAt(i2);
            textBufferElementAt.Hw(0, textBufferElementAt.J0(), cArr, 0);
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, 845413775444389956L, this, new Integer(i2), cArr);
            }
            throw th;
        }
    }

    @ey(method = -1258228186909697913L)
    public void sM(int i2, int i3, Object obj) {
        int i4;
        try {
            if (XL) {
                iy.we(1535268916816492440L, this, new Integer(i2), new Integer(i3), obj);
            }
            this.gn = true;
            synchronized (this) {
                TextBuffer textBufferElementAt = this.VH.elementAt(i3);
                i4 = i3 + 1;
                this.VH.insertElementAt(AL(), i4);
                char[] cArr = new char[textBufferElementAt.J0() - i2];
                textBufferElementAt.Hw(i2, textBufferElementAt.J0() - i2, cArr, 0);
                this.VH.elementAt(i4).j6(cArr);
                textBufferElementAt.u7(textBufferElementAt.J0() - i2, i2);
                if (this.undoStack != null) {
                    this.undoStack.FH(i3, i2, this, obj);
                }
                ct();
            }
            q7();
            XG(i2, i3, -1, i4);
            Za();
        } catch (Throwable th) {
            if (aM) {
                iy.U2(th, 1535268916816492440L, this, new Integer(i2), new Integer(i3), obj);
            }
            throw th;
        }
    }

    @ey(method = -6546838263700638365L)
    public List<SelectedRegion> sg() {
        try {
            if (XL) {
                iy.gn(2426649581875259640L, this);
            }
            return this.J0 == null ? Collections.emptyList() : this.J0.j6;
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, 2426649581875259640L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -8638514315844544032L)
    public boolean sy(int i2, int i3) {
        try {
            if (!XL) {
                return false;
            }
            iy.EQ(-3642323401298275775L, this, new Integer(i2), new Integer(i3));
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.Mr(th, -3642323401298275775L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 1823238267691146768L)
    public boolean tp(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(-3861131471242179537L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -3861131471242179537L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 4722041460499742505L)
    public boolean u7(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(-1571866042984700320L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -1571866042984700320L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 1232919587639171488L)
    public boolean v5(int i2) {
        try {
            if (!XL) {
                return false;
            }
            iy.u7(-963375941180076513L, this, i2);
            return false;
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -963375941180076513L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 2068770457131325955L)
    public List<SelectedRegion> x9() {
        try {
            if (XL) {
                iy.gn(-1709199946053214776L, this);
            }
            return sg();
        } catch (Throwable th) {
            if (aM) {
                iy.aM(th, -1709199946053214776L, this);
            }
            throw th;
        }
    }

    @ey(method = -425745219977229733L)
    public Position ys(int i2, int i3, boolean z, int i4, Reader reader, Object obj) throws Throwable {
        int i5 = 4;
        try {
            if (XL) {
                iy.QX(-684180865250764128L, this, new Object[]{new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4), reader, obj});
            }
        } catch (Throwable th) {
            th = th;
            i5 = 6;
        }
        try {
            if (i3 >= this.VH.size()) {
                throw new InternalError();
            }
            char[] cArr = new char[32768];
            f fVar = new f(this, i2, i3, z, i4);
            IOException iOException = null;
            try {
                synchronized (this) {
                    try {
                        try {
                            v.j6(reader, fVar, cArr);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                    }
                    try {
                        reader.close();
                    } catch (IOException e3) {
                        e = e3;
                        if (iOException != null) {
                        }
                    }
                    e = iOException;
                    if (i3 == fVar.DW && i2 == fVar.j6) {
                        if (e != null) {
                            throw e;
                        }
                        return new Position(fVar.DW, fVar.j6);
                    }
                    if (this.undoStack != null) {
                        this.undoStack.DW(i3, i2, fVar.DW, fVar.j6 - 1, this, obj);
                    }
                    ct();
                    XG(i2, i3, fVar.j6 - 1, fVar.DW);
                    Za();
                    if (e == null) {
                        return new Position(fVar.DW, fVar.j6);
                    }
                    throw e;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (aM) {
                Object[] objArr = new Object[i5];
                objArr[0] = new Integer(i2);
                objArr[1] = new Integer(i3);
                objArr[2] = new Boolean(z);
                objArr[3] = new Integer(i4);
                objArr[4] = reader;
                objArr[5] = obj;
                iy.rN(th, -684180865250764128L, this, objArr);
            }
            throw th;
        }
    }

    @ey(method = -6583792831018204680L)
    public void zh(i iVar) {
        try {
            if (XL) {
                iy.tp(-2359709552175202605L, this, iVar);
            }
            this.v5.addElement(iVar);
        } catch (Throwable th) {
            if (aM) {
                iy.j3(th, -2359709552175202605L, this, iVar);
            }
            throw th;
        }
    }

    @cy(clazz = 1089763027374523260L, container = 1089763027374523260L, user = true)
    private static class d {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -2673203103632246064L)
        public SelectedRegion DW;

        @dy(field = 3765753507883149175L)
        public e FH;

        @dy(field = -5422691943461937375L)
        public boolean Hw;

        @dy(field = -4941900370074075896L)
        public List<SelectedRegion> j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -55772486431492608L)
        private d() {
            a aVar = null;
            try {
                if (v5) {
                    iy.gn(-3258578167112803392L, null);
                }
                this.FH = new e(aVar);
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -3258578167112803392L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 505764633922990560L)
        /* synthetic */ d(a aVar) {
            this();
            try {
                if (v5) {
                    iy.tp(-1750070745556930560L, null, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -1750070745556930560L, null, aVar);
                }
                throw th;
            }
        }
    }

    @ey(method = 802272232739778549L)
    public EditorModel(Reader reader, boolean z, boolean z2, int i2) {
        try {
            if (XL) {
                iy.J0(7237689944805615136L, null, reader, new Boolean(z), new Boolean(z2), new Integer(i2));
            }
            this.v5 = new Vector<>();
            this.Zo = new Vector<>();
            this.VH = new Vector<>();
            this.we = new HashSet();
            this.J8 = new ArrayList();
            this.Ws = new HashSet();
            this.QX = System.getProperty("line.separator");
            this.EQ = System.currentTimeMillis();
            qp(reader, z, i2, true);
            reader.close();
            aX();
        } catch (Throwable th) {
            if (aM) {
                iy.a8(th, 7237689944805615136L, null, reader, new Boolean(z), new Boolean(z2), new Integer(i2));
            }
            throw th;
        }
    }
}
