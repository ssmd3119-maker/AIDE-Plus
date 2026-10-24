package abcd;

import com.aide.ui.views.editor.Position;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

@cy(clazz = -1346967039836983963L, container = -1346967039836983963L, user = true)
/* loaded from: classes.dex */
public class jg<T> implements Serializable {

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = 1452162371666409977L)
    private Vector<c<T>> WB;

    @dy(field = 1536373186669396251L)
    private boolean mb;

    @cy(clazz = -324908256543668088L, container = -324908256543668088L, user = true)
    private static class b<T> implements Serializable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -2311046788761790928L)
        private int WB;

        @dy(field = 829435092384925L)
        private b<T> fY;

        @dy(field = -951823403675241984L)
        private T jw;

        @dy(field = 450910436096544519L)
        private int mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -626242331299134015L)
        private b() {
            try {
                if (qp) {
                    iy.gn(1410704347863937539L, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 1410704347863937539L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 5960108167425284580L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (qp) {
                    iy.tp(1578619193226963888L, null, aVar);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 1578619193226963888L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -322530346303803735L, container = -322530346303803735L, user = true)
    private static class c<T> implements Serializable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -657839985752666605L)
        private b<T> WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -1201219671393326640L)
        private c() {
            try {
                if (mb) {
                    iy.gn(2248837009656359773L, null);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 2248837009656359773L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 4028840565213146123L)
        public /* synthetic */ c(a aVar) {
            this();
            try {
                if (mb) {
                    iy.tp(-441675225156146176L, null, aVar);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -441675225156146176L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -991907825962782020L, container = -991907825962782020L, user = true)
    private static class d<T> implements Enumeration<T> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1932044346037020180L)
        private int DW;

        @dy(field = 965669470126193131L)
        private b<T> j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -150745224512099615L)
        public d(b<T> bVar, int i) {
            try {
                if (FH) {
                    iy.EQ(-3870747221350775052L, null, bVar, new Integer(i));
                }
                this.j6 = bVar;
                this.DW = i;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -3870747221350775052L, null, bVar, new Integer(i));
                }
                throw th;
            }
        }

        @Override // java.util.Enumeration
        @ey(method = -2389567688181081471L)
        public boolean hasMoreElements() {
            try {
                if (FH) {
                    iy.gn(-5111768177492935075L, this);
                }
                while (this.j6 != null) {
                    if (this.DW == -1) {
                        return true;
                    }
                    if (((b) this.j6).WB <= this.DW && ((b) this.j6).mb >= this.DW) {
                        return true;
                    }
                    this.j6 = ((b) this.j6).fY;
                }
                return false;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -5111768177492935075L, this);
                }
                throw th;
            }
        }

        @Override // java.util.Enumeration
        @ey(method = 2944149326635980496L)
        public T nextElement() {
            try {
                if (FH) {
                    iy.gn(2528813910244135500L, this);
                }
                T t = (T) ((b) this.j6).jw;
                this.j6 = ((b) this.j6).fY;
                return t;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2528813910244135500L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(jg.class);
    }

    @ey(method = 186296746843199629L)
    public jg() {
        try {
            if (jw) {
                iy.gn(2080698258708883695L, null);
            }
            this.mb = false;
            j6();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 2080698258708883695L, null);
            }
            throw th;
        }
    }

    @ey(method = -879762202959836909L)
    private void FH(int i, int i2, int i3) {
        try {
            if (jw) {
                iy.we(2565318831200731648L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            c<T> cVarElementAt = this.WB.elementAt(i);
            if (cVarElementAt == null) {
                return;
            }
            a aVar = null;
            b bVar = null;
            for (b bVar2 = ((c) cVarElementAt).WB; bVar2 != null; bVar2 = bVar2.fY) {
                if (i2 > bVar2.WB || bVar2.mb > i3) {
                    if (i2 > bVar2.WB && bVar2.mb > i3) {
                        b bVar3 = new b(aVar);
                        if (bVar == null) {
                            ((c) cVarElementAt).WB = bVar3;
                        } else {
                            bVar.fY = bVar3;
                        }
                        bVar3.fY = bVar2;
                        bVar3.jw = bVar2.jw;
                        bVar3.WB = bVar2.WB;
                        bVar3.mb = i2 - 1;
                        bVar2.WB = i3 + 1;
                    } else if (i2 <= bVar2.WB && bVar2.WB <= i3) {
                        bVar2.WB = i3 + 1;
                    } else if (i2 <= bVar2.mb && bVar2.mb <= i3) {
                        bVar2.mb = i2 - 1;
                    }
                    bVar = bVar2;
                } else if (bVar == null) {
                    ((c) cVarElementAt).WB = bVar2.fY;
                } else {
                    bVar.fY = bVar2.fY;
                }
            }
            if (((c) cVarElementAt).WB == null) {
                this.WB.setElementAt(null, i);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, 2565318831200731648L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3480258552557122524L)
    private void J0(T t, int i, int i2, int i3, boolean z) {
        try {
            if (jw) {
                iy.J8(1105617180696218705L, this, t, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            if (this.WB.size() <= i) {
                this.WB.setSize(i + 1);
            }
            c<T> cVarElementAt = this.WB.elementAt(i);
            a aVar = null;
            if (cVarElementAt == null) {
                Vector<c<T>> vector = this.WB;
                c<T> cVar = new c<>(aVar);
                vector.setElementAt(cVar, i);
                cVarElementAt = cVar;
            }
            if (!z) {
                b bVar = new b(aVar);
                bVar.WB = i2;
                bVar.mb = i3;
                bVar.jw = t;
                bVar.fY = ((c) cVarElementAt).WB;
                ((c) cVarElementAt).WB = bVar;
                return;
            }
            b bVar2 = null;
            for (b bVar3 = ((c) cVarElementAt).WB; bVar3 != null; bVar3 = bVar3.fY) {
                bVar2 = bVar3;
            }
            b bVar4 = new b(aVar);
            bVar4.WB = i2;
            bVar4.mb = i3;
            bVar4.jw = t;
            if (bVar2 == null) {
                ((c) cVarElementAt).WB = bVar4;
            } else {
                bVar2.fY = bVar4;
            }
            bVar4.fY = null;
        } catch (Throwable th) {
            if (fY) {
                iy.lg(th, 1105617180696218705L, this, t, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 908832216076192984L)
    private void QX(int i) {
        c<T> cVarElementAt;
        try {
            if (jw) {
                iy.u7(-1571437650561875799L, this, i);
            }
            if (this.WB.size() > i && (cVarElementAt = this.WB.elementAt(i)) != null) {
                c<T> cVar = new c<>(null);
                b bVar = ((c) cVarElementAt).WB;
                b bVar2 = null;
                while (bVar != null) {
                    if (bVar.mb >= 0) {
                        b bVar3 = bVar.fY;
                        while (true) {
                            if (bVar3 == null) {
                                break;
                            }
                            if (bVar.jw.equals(bVar3.jw)) {
                                if (bVar3.WB >= bVar.WB && bVar.mb >= bVar3.mb) {
                                    bVar3.mb = -1;
                                    break;
                                }
                                if (bVar3.WB <= bVar.WB && bVar.mb <= bVar3.mb) {
                                    bVar.WB = bVar3.WB;
                                    bVar.mb = bVar3.mb;
                                    bVar3.mb = -1;
                                    break;
                                }
                                if (bVar3.WB <= bVar.WB && bVar.WB <= bVar3.mb) {
                                    bVar.WB = bVar3.WB;
                                    bVar3.mb = -1;
                                    break;
                                }
                                if (bVar3.WB <= bVar.mb && bVar.mb <= bVar3.mb) {
                                    bVar.mb = bVar3.mb;
                                    bVar3.mb = -1;
                                    break;
                                } else if (bVar.mb == bVar3.WB - 1) {
                                    bVar.mb = bVar3.mb;
                                    bVar3.mb = -1;
                                    break;
                                } else if (bVar.WB == bVar3.mb + 1) {
                                    bVar.WB = bVar3.WB;
                                    bVar3.mb = -1;
                                    break;
                                }
                            }
                            bVar3 = bVar3.fY;
                        }
                        b bVar4 = bVar.fY;
                        if (bVar2 == null) {
                            ((c) cVar).WB = bVar;
                        } else {
                            bVar2.fY = bVar;
                        }
                        bVar.fY = null;
                        bVar2 = bVar;
                        bVar = bVar4;
                    } else {
                        bVar = bVar.fY;
                    }
                }
                this.WB.setElementAt(cVar, i);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -1571437650561875799L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 544009306098766824L)
    private void XL(int i, int i2) {
        try {
            if (jw) {
                iy.EQ(2379160776349066815L, this, new Integer(i), new Integer(i2));
            }
            if (i >= 0 && i < this.WB.size()) {
                if (i2 <= 0) {
                    this.WB.setElementAt(null, i);
                    return;
                }
                c<T> cVarElementAt = this.WB.elementAt(i);
                if (cVarElementAt == null) {
                    return;
                }
                b bVar = null;
                for (b bVar2 = ((c) cVarElementAt).WB; bVar2 != null; bVar2 = bVar2.fY) {
                    if (i2 > bVar2.WB) {
                        if (i2 > bVar2.WB && bVar2.mb >= i2 && bVar2.mb != Integer.MAX_VALUE) {
                            bVar2.mb = i2 - 1;
                        }
                        bVar = bVar2;
                    } else if (bVar == null) {
                        ((c) cVarElementAt).WB = bVar2.fY;
                    } else {
                        bVar.fY = bVar2.fY;
                    }
                }
                if (((c) cVarElementAt).WB == null) {
                    this.WB.setElementAt(null, i);
                }
            }
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 2379160776349066815L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4620597698434569984L)
    public final void DW(int i, int i2, int i3, int i4) {
        try {
            if (jw) {
                iy.J0(2520874130228315757L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i <= i3 && i3 >= 0) {
                if (i != i3 || i2 <= i4) {
                    if (i < 0) {
                        i = 0;
                        i2 = 0;
                    }
                    if (i3 >= this.WB.size()) {
                        i3 = this.WB.size() - 1;
                        if (i > i3) {
                            return;
                        } else {
                            i4 = Integer.MAX_VALUE;
                        }
                    }
                    if (i == i3) {
                        FH(i, i2, i4);
                        return;
                    }
                    FH(i, i2, Integer.MAX_VALUE);
                    for (int i5 = i + 1; i5 < i3; i5++) {
                        FH(i5, 0, Integer.MAX_VALUE);
                    }
                    FH(i3, 0, i4);
                }
            }
        } finally {
        }
    }

    @ey(method = -61970286389636080L)
    public final void EQ(T t, int i, int i2) {
        try {
            if (jw) {
                iy.we(-6778862011852037175L, this, t, new Integer(i), new Integer(i2));
            }
            we(t, i, i2, i, i2);
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, -6778862011852037175L, this, t, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1556211649102012659L)
    public final Enumeration<T> Hw(int i, int i2) {
        try {
            if (jw) {
                iy.EQ(5868549280046011104L, this, new Integer(i), new Integer(i2));
            }
            if (i < 0) {
                return new d(null, i2);
            }
            if (i >= this.WB.size()) {
                return new d(null, i2);
            }
            c<T> cVarElementAt = this.WB.elementAt(i);
            return cVarElementAt == null ? new d(null, i2) : new d(((c) cVarElementAt).WB, i2);
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 5868549280046011104L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2641555780006346680L)
    public final void J8(int i, int i2, int i3) {
        c<T> cVarElementAt;
        try {
            if (jw) {
                iy.we(-6416247030215280895L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (i >= 0 && i < this.WB.size() && (cVarElementAt = this.WB.elementAt(i)) != null) {
                for (b bVar = ((c) cVarElementAt).WB; bVar != null; bVar = bVar.fY) {
                    if (i2 <= bVar.WB || bVar.mb < i2) {
                        if (i2 == bVar.WB && (this.mb || (i2 == 0 && gn(bVar.jw, i - 1, Integer.MAX_VALUE)))) {
                            if (bVar.mb > Integer.MAX_VALUE - i3) {
                                bVar.mb = Integer.MAX_VALUE;
                            } else {
                                bVar.mb += i3;
                            }
                        } else if (i2 <= bVar.WB) {
                            int i4 = Integer.MAX_VALUE - i3;
                            if (bVar.WB > i4) {
                                bVar.WB = Integer.MAX_VALUE;
                            } else {
                                bVar.WB += i3;
                            }
                            if (bVar.mb > i4) {
                                bVar.mb = Integer.MAX_VALUE;
                            } else {
                                bVar.mb += i3;
                            }
                        }
                    } else if (bVar.mb > Integer.MAX_VALUE - i3) {
                        bVar.mb = Integer.MAX_VALUE;
                    } else {
                        bVar.mb += i3;
                    }
                }
            }
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, -6416247030215280895L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2357539124513372768L)
    public final void Mr(int i, int i2, int i3, int i4) {
        try {
            if (jw) {
                iy.J0(-1913771376026096885L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i == i3) {
                aM(i, i2, (i4 - i2) + 1);
                return;
            }
            int i5 = i + 1;
            for (int i6 = i5; i6 < i3; i6++) {
                if (i5 < this.WB.size()) {
                    this.WB.removeElementAt(i5);
                }
            }
            XL(i, i2);
            if (i4 >= 0) {
                aM(i5, 0, i4 + 0 + 1);
            }
            j3(i, i2);
        } catch (Throwable th) {
            if (fY) {
                iy.a8(th, -1913771376026096885L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1457376305048729728L)
    public Position VH(Position position) {
        try {
            if (jw) {
                iy.tp(-2846501720751385821L, this, position);
            }
            return Zo(position.getLine(), position.getColumn());
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -2846501720751385821L, this, position);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ey(method = -3287601697733744175L)
    public final void Ws(int i, int i2, int i3, int i4) {
        b bVar;
        int i5 = i2;
        int i6 = i4;
        try {
            if (jw) {
                iy.J0(-431940982966090528L, this, new Integer(i), new Integer(i5), new Integer(i3), new Integer(i6));
            }
            if (i == i3) {
                J8(i, i5, (i6 - i5) + 1);
                return;
            }
            int i7 = i + 1;
            if (i7 <= this.WB.size()) {
                for (int i8 = i7; i8 <= i3; i8++) {
                    this.WB.insertElementAt(null, i7);
                }
            }
            c<T> cVarElementAt = i3 < this.WB.size() ? this.WB.elementAt(i3) : null;
            int i9 = Integer.MAX_VALUE;
            if (cVarElementAt != null) {
                if (i6 + 1 > 0) {
                    for (b bVar2 = ((c) cVarElementAt).WB; bVar2 != null; bVar2 = bVar2.fY) {
                        int i10 = i6 + 1;
                        i5 += i10;
                        if (i6 != Integer.MAX_VALUE) {
                            i6 += i10;
                        }
                    }
                }
            }
            c<T> cVarElementAt2 = i < this.WB.size() ? this.WB.elementAt(i) : null;
            if (cVarElementAt2 != null) {
                b bVar3 = ((c) cVarElementAt2).WB;
                b bVar4 = null;
                while (bVar3 != null) {
                    if (bVar3.WB >= i5 || i5 > bVar3.mb) {
                        if (bVar3.WB >= i5) {
                            if (bVar3.mb == i9) {
                                bVar = bVar4;
                                J0(bVar3.jw, i3, ((i6 + 1) + bVar3.WB) - i5, Integer.MAX_VALUE, false);
                            } else {
                                bVar = bVar4;
                                int i11 = i6 + 1;
                                J0(bVar3.jw, i3, (bVar3.WB + i11) - i5, (((i11 + bVar3.WB) - i5) + bVar3.mb) - bVar3.WB, false);
                            }
                            if (bVar == null) {
                                ((c) cVarElementAt2).WB = bVar3.fY;
                            } else {
                                bVar.fY = bVar3.fY;
                            }
                        } else {
                            bVar = bVar4;
                        }
                        bVar4 = bVar;
                    } else {
                        for (int i12 = i7; i12 < i3; i12++) {
                            J0(bVar3.jw, i12, 0, Integer.MAX_VALUE, false);
                        }
                        if (bVar3.mb == i9) {
                            J0(bVar3.jw, i3, 0, Integer.MAX_VALUE, false);
                        } else {
                            J0(bVar3.jw, i3, 0, ((bVar3.mb + 0) - i5) + 1 + i6, false);
                        }
                        bVar3.mb = i9;
                        bVar4 = bVar3;
                    }
                    bVar3 = bVar3.fY;
                    i9 = Integer.MAX_VALUE;
                }
                if (((c) cVarElementAt2).WB == null) {
                    this.WB.setElementAt(null, i);
                }
            }
        } catch (Throwable th) {
            if (fY) {
                iy.a8(th, -431940982966090528L, this, new Integer(i), new Integer(i5), new Integer(i3), new Integer(i6));
            }
            throw th;
        }
    }

    @ey(method = 6113292479537880147L)
    public Position Zo(int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (jw) {
                iy.EQ(-4163004884981140768L, this, new Integer(i), new Integer(i2));
            }
            int i3 = i;
            while (i3 < this.WB.size()) {
                try {
                    c<T> cVarElementAt = this.WB.elementAt(i3);
                    if (cVarElementAt != null) {
                        int i4 = -1;
                        for (b bVar = ((c) cVarElementAt).WB; bVar != null; bVar = bVar.fY) {
                            if ((i3 != i || bVar.WB > i2) && ((i4 == -1 || i4 > bVar.WB) && (bVar.WB != 0 || i3 == 0 || !gn(bVar.jw, i3 - 1, Integer.MAX_VALUE)))) {
                                i4 = bVar.WB;
                            }
                        }
                        if (i4 != -1) {
                            return new Position(i3, i4);
                        }
                    }
                    i3++;
                    i2 = -1;
                } catch (Throwable th2) {
                    th = th2;
                    i = i3;
                    if (!fY) {
                        throw th;
                    }
                    iy.Mr(th, -4163004884981140768L, this, new Integer(i), new Integer(i2));
                    throw th;
                }
            }
            throw new hg();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = -5688472419178520565L)
    public final void aM(int i, int i2, int i3) {
        c<T> cVarElementAt;
        try {
            if (jw) {
                iy.we(6279567155743955808L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (i >= 0 && i < this.WB.size() && (cVarElementAt = this.WB.elementAt(i)) != null) {
                int i4 = (i2 + i3) - 1;
                b bVar = null;
                for (b bVar2 = ((c) cVarElementAt).WB; bVar2 != null; bVar2 = bVar2.fY) {
                    if (i2 < bVar2.WB && i4 < bVar2.WB) {
                        if (bVar2.mb != Integer.MAX_VALUE) {
                            bVar2.mb -= i3;
                        }
                        bVar2.WB -= i3;
                    } else if (i2 <= bVar2.WB && bVar2.mb <= i4) {
                        if (bVar == null) {
                            ((c) cVarElementAt).WB = bVar2.fY;
                        } else {
                            bVar.fY = bVar2.fY;
                        }
                    } else if (i2 <= bVar2.WB || bVar2.mb <= i4) {
                        if (i2 <= bVar2.WB && bVar2.WB <= i4) {
                            bVar2.WB = i2;
                            if (bVar2.mb != Integer.MAX_VALUE) {
                                bVar2.mb -= i3;
                            }
                        } else if (i2 <= bVar2.mb && bVar2.mb <= i4 && bVar2.mb != Integer.MAX_VALUE) {
                            bVar2.mb = i2 - 1;
                        }
                    } else if (bVar2.mb != Integer.MAX_VALUE) {
                        bVar2.mb -= i3;
                    }
                    bVar = bVar2;
                }
                if (((c) cVarElementAt).WB == null) {
                    this.WB.setElementAt(null, i);
                }
            }
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, 6279567155743955808L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 95118863058866383L)
    public final boolean gn(Object obj, int i, int i2) {
        c<T> cVarElementAt;
        try {
            if (jw) {
                iy.we(-173358855353457008L, this, obj, new Integer(i), new Integer(i2));
            }
            if (i < 0 || i >= this.WB.size() || (cVarElementAt = this.WB.elementAt(i)) == null) {
                return false;
            }
            for (b bVar = ((c) cVarElementAt).WB; bVar != null; bVar = bVar.fY) {
                if (bVar.WB <= i2 && i2 <= bVar.mb && bVar.jw.equals(obj)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, -173358855353457008L, this, obj, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ey(method = 2272938342843630388L)
    public final void j3(int i, int i2) {
        try {
            if (jw) {
                iy.EQ(6543496585633880921L, this, new Integer(i), new Integer(i2));
            }
            if (i2 >= 0 && i >= 0 && i < this.WB.size() - 1) {
                c<T> cVarElementAt = this.WB.elementAt(i);
                if (cVarElementAt == null) {
                    this.WB.removeElementAt(i);
                    c<T> cVarElementAt2 = this.WB.elementAt(i);
                    if (cVarElementAt2 == null) {
                        return;
                    }
                    for (b bVar = ((c) cVarElementAt2).WB; bVar != null; bVar = bVar.fY) {
                        int i3 = (Integer.MAX_VALUE - i2) + 0;
                        if (bVar.WB > i3) {
                            bVar.WB = Integer.MAX_VALUE;
                        } else {
                            bVar.WB = bVar.WB + 0 + i2;
                        }
                        if (bVar.mb > i3) {
                            bVar.mb = Integer.MAX_VALUE;
                        } else {
                            bVar.mb = bVar.mb + 0 + i2;
                        }
                    }
                    return;
                }
                int i4 = i + 1;
                c<T> cVarElementAt3 = this.WB.elementAt(i4);
                this.WB.removeElementAt(i4);
                if (cVarElementAt3 == null) {
                    return;
                }
                b bVar2 = null;
                for (b bVar3 = ((c) cVarElementAt).WB; bVar3 != null; bVar3 = bVar3.fY) {
                    if (bVar3.WB < i2 && i2 != 0) {
                        if (bVar3.mb >= i2) {
                            bVar3.mb = i2 - 1;
                        }
                        bVar2 = bVar3;
                    } else if (bVar2 == null) {
                        ((c) cVarElementAt).WB = bVar3.fY;
                    } else {
                        bVar2.fY = bVar3.fY;
                    }
                }
                for (b bVar4 = ((c) cVarElementAt3).WB; bVar4 != null; bVar4 = bVar4.fY) {
                    int i5 = (Integer.MAX_VALUE - i2) + 0;
                    J0(bVar4.jw, i, bVar4.WB > i5 ? Integer.MAX_VALUE : bVar4.WB + 0 + i2, bVar4.mb > i5 ? Integer.MAX_VALUE : bVar4.mb + 0 + i2, true);
                }
                QX(i);
            }
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 6543496585633880921L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 544154082375371776L)
    public final void j6() {
        try {
            if (jw) {
                iy.gn(-1483694213511364823L, this);
            }
            Vector<c<T>> vector = new Vector<>();
            this.WB = vector;
            vector.setSize(1);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1483694213511364823L, this);
            }
            throw th;
        }
    }

    @ey(method = -361290624372913997L)
    public String toString() {
        try {
            if (jw) {
                iy.gn(-1295510730464504928L, this);
            }
            String str = "{\n";
            for (int i = 0; i < this.WB.size(); i++) {
                String str2 = str + i + ": ";
                c<T> cVarElementAt = this.WB.elementAt(i);
                if (cVarElementAt != null) {
                    for (b bVar = ((c) cVarElementAt).WB; bVar != null; bVar = bVar.fY) {
                        str2 = str2 + "(" + bVar.WB + "|" + bVar.mb + "), ";
                    }
                }
                str = str2 + "\n";
            }
            return str + "}";
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1295510730464504928L, this);
            }
            throw th;
        }
    }

    @ey(method = 1846674400050018440L)
    public final boolean tp(int i) {
        c<T> cVarElementAt;
        try {
            if (jw) {
                iy.u7(-3702019830810117023L, this, i);
            }
            if (i >= 0 && i < this.WB.size() && (cVarElementAt = this.WB.elementAt(i)) != null) {
                return ((c) cVarElementAt).WB != null;
            }
            return false;
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -3702019830810117023L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2579512087239733101L)
    public final boolean u7(int i, int i2) {
        c<T> cVarElementAt;
        try {
            if (jw) {
                iy.EQ(1417865372434146744L, this, new Integer(i), new Integer(i2));
            }
            if (i < 0 || i >= this.WB.size() || (cVarElementAt = this.WB.elementAt(i)) == null) {
                return false;
            }
            for (b bVar = ((c) cVarElementAt).WB; bVar != null; bVar = bVar.fY) {
                if (bVar.WB <= i2 && i2 <= bVar.mb) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, 1417865372434146744L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 764925855506376804L)
    public Position v5() {
        try {
            if (jw) {
                iy.gn(79531269940336217L, this);
            }
            return Zo(0, -1);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 79531269940336217L, this);
            }
            throw th;
        }
    }

    @ey(method = -1000787474054989400L)
    public final void we(T t, int i, int i2, int i3, int i4) {
        try {
            if (jw) {
                iy.J8(5115110585235193731L, this, t, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i < 0) {
                i = 0;
            }
            if (i > i3) {
                return;
            }
            if (this.WB.size() <= i3) {
                this.WB.setSize(i3 + 1);
            }
            if (i == i3) {
                J0(t, i, i2, i4, false);
                QX(i);
                return;
            }
            J0(t, i, i2, Integer.MAX_VALUE, false);
            QX(i);
            for (int i5 = i + 1; i5 < i3; i5++) {
                J0(t, i5, 0, Integer.MAX_VALUE, false);
                QX(i5);
            }
            J0(t, i3, 0, i4, false);
            QX(i3);
        } finally {
        }
    }
}
