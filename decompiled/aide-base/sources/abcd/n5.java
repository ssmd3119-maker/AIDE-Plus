package abcd;

import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.SetOfInt;

@cy(clazz = -4824969858174400423L, container = -4824969858174400423L, user = true)
/* loaded from: classes.dex */
public class n5 {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -14181939743088720L)
    private MapOfIntInt DW;

    @dy(field = 2768892227132251320L)
    private Model FH;

    @dy(field = 1231036416167752247L)
    private SyntaxTree Hw;

    @dy(field = -1952248671998190995L)
    private SetOfInt VH;

    @dy(field = -4599701738280178376L)
    private SetOfInt Zo;

    @dy(field = 799504269386109448L)
    private SetOfInt gn;

    @dy(field = 759324399432698424L)
    private MapOfIntInt j6;

    @dy(field = 6875320688193702472L)
    private SetOfInt u7;

    @dy(field = -331361641607488876L)
    private boolean v5;

    static {
        iy.Zo(n5.class);
    }

    @ey(method = 636953480584053805L)
    public n5(Model model, SyntaxTree syntaxTree, boolean z) {
        try {
            if (tp) {
                iy.we(-2450192038152172047L, null, model, syntaxTree, new Boolean(z));
            }
            this.j6 = new MapOfIntInt();
            this.DW = new MapOfIntInt();
            this.Zo = new SetOfInt();
            this.VH = new SetOfInt();
            this.gn = new SetOfInt();
            this.u7 = new SetOfInt();
            this.FH = model;
            this.Hw = syntaxTree;
            this.v5 = z;
            VH();
            this.Hw = null;
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -2450192038152172047L, null, model, syntaxTree, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 59858185374727808L)
    private void Hw(int i) {
        try {
            if (tp) {
                iy.u7(1316027706430708131L, this, i);
            }
            MapOfIntInt.b bVarZo = this.j6.Zo();
            bVarZo.FH(i);
            while (bVarZo.j6()) {
                int iV5 = bVarZo.v5();
                if (!this.VH.contains(iV5) || this.u7.contains(iV5)) {
                    this.u7.put(iV5);
                } else {
                    this.u7.put(iV5);
                    Hw(iV5);
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 1316027706430708131L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -284918171558250637L)
    private void VH() {
        try {
            if (tp) {
                iy.gn(-1704804056173760120L, this);
            }
            u7(this.Hw.getRootNode());
            this.j6.j6.DW();
            SetOfInt setOfInt = new SetOfInt();
            while (this.j6.j6.j6()) {
                this.gn.put(this.j6.j6.Hw());
                setOfInt.put(this.j6.j6.v5());
            }
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                this.gn.u7(setOfInt.default_Iterator.nextKey());
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1704804056173760120L, this);
            }
            throw th;
        }
    }

    @ey(method = -1486760513972870720L)
    private void Zo(int i) {
        try {
            if (tp) {
                iy.u7(5824006445260565853L, this, i);
            }
            if (this.Hw.getSyntaxTag(i) == 30) {
                this.Zo.put(this.Hw.getIdentifier(i));
                return;
            }
            for (int i2 = 0; i2 < this.Hw.getChildCount(i); i2++) {
                Zo(this.Hw.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 5824006445260565853L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2694342475324193856L)
    private void gn(int i) {
        try {
            if (tp) {
                iy.u7(4043785369233353535L, this, i);
            }
            if (this.Hw.getSyntaxTag(i) != 30) {
                for (int i2 = 0; i2 < this.Hw.getChildCount(i); i2++) {
                    gn(this.Hw.getChildNode(i, i2));
                }
                return;
            }
            this.Zo.default_Iterator.init();
            while (this.Zo.default_Iterator.hasMoreElements()) {
                int iNextKey = this.Zo.default_Iterator.nextKey();
                if (this.v5) {
                    this.j6.J0(iNextKey, this.Hw.getIdentifier(i));
                } else {
                    this.j6.J0(this.FH.identifierSpace.QX(iNextKey), this.FH.identifierSpace.QX(this.Hw.getIdentifier(i)));
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 4043785369233353535L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -551929521470691608L)
    private void u7(int i) {
        try {
            if (tp) {
                iy.u7(-6051313422990057267L, this, i);
            }
            int syntaxTag = this.Hw.getSyntaxTag(i);
            if (syntaxTag == 207) {
                this.Zo.clear();
                Zo(this.Hw.getChildNode(i, 1));
                v5(this.Hw.getChildNode(i, 2));
            } else if (syntaxTag == 208) {
                this.Zo.clear();
                Zo(this.Hw.getChildNode(i, 1));
                v5(this.Hw.getChildNode(i, 4));
                if (this.Hw.getChildCount(i) > 6) {
                    int syntaxTag2 = this.Hw.getSyntaxTag(this.Hw.getChildNode(i, this.Hw.getChildCount(i) - 3));
                    if (syntaxTag2 == 22) {
                        gn(this.Hw.getChildNode(i, this.Hw.getChildCount(i) - 2));
                    } else if (syntaxTag2 == 37) {
                        v5(this.Hw.getChildNode(i, this.Hw.getChildCount(i) - 2));
                    }
                }
                if (this.Hw.getSyntaxTag(this.Hw.getChildNode(i, 2)) == 30 && this.Hw.getSyntaxTag(this.Hw.getChildNode(i, 3)) == 30) {
                    if (this.v5) {
                        this.VH.VH(this.Zo);
                    } else {
                        this.Zo.default_Iterator.init();
                        while (this.Zo.default_Iterator.hasMoreElements()) {
                            this.VH.put(this.FH.identifierSpace.QX(this.Zo.default_Iterator.nextKey()));
                        }
                    }
                }
            } else if (syntaxTag == 215) {
                this.Zo.clear();
                Zo(this.Hw.getChildNode(i, 1));
                for (int i2 = 2; i2 < this.Hw.getChildCount(i) - 1; i2++) {
                    int identifier = this.Hw.getIdentifier(this.Hw.getChildNode(this.Hw.getChildNode(i, i2), 0));
                    this.Zo.default_Iterator.init();
                    while (this.Zo.default_Iterator.hasMoreElements()) {
                        int iNextKey = this.Zo.default_Iterator.nextKey();
                        if (this.v5) {
                            this.DW.gn(iNextKey, identifier);
                        } else {
                            this.DW.gn(this.FH.identifierSpace.QX(iNextKey), this.FH.identifierSpace.QX(identifier));
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < this.Hw.getChildCount(i); i3++) {
                u7(this.Hw.getChildNode(i, i3));
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -6051313422990057267L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1051869774436925973L)
    private void v5(int i) {
        try {
            if (tp) {
                iy.u7(-971053237683708732L, this, i);
            }
            if (this.Hw.getSyntaxTag(i) != 30) {
                for (int i2 = 0; i2 < this.Hw.getChildCount(i); i2++) {
                    v5(this.Hw.getChildNode(i, i2));
                }
                return;
            }
            this.Zo.default_Iterator.init();
            while (this.Zo.default_Iterator.hasMoreElements()) {
                int iNextKey = this.Zo.default_Iterator.nextKey();
                if (this.v5) {
                    this.j6.gn(iNextKey, this.Hw.getIdentifier(i));
                } else {
                    this.j6.gn(this.FH.identifierSpace.QX(iNextKey), this.FH.identifierSpace.QX(this.Hw.getIdentifier(i)));
                }
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -971053237683708732L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 258803647562819216L)
    public void DW(SetOfInt setOfInt) {
        try {
            if (tp) {
                iy.tp(826482329816650587L, this, setOfInt);
            }
            this.u7.clear();
            this.u7.VH(this.gn);
            this.gn.default_Iterator.init();
            while (this.gn.default_Iterator.hasMoreElements()) {
                int iNextKey = this.gn.default_Iterator.nextKey();
                if (this.VH.contains(iNextKey)) {
                    Hw(iNextKey);
                }
            }
            if (this.v5) {
                return;
            }
            this.u7.default_Iterator.init();
            while (this.u7.default_Iterator.hasMoreElements()) {
                setOfInt.put(this.FH.identifierSpace.Ws(this.u7.default_Iterator.nextKey()));
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 826482329816650587L, this, setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -391527865054612075L)
    public void FH(int i, SetOfInt setOfInt) {
        try {
            if (tp) {
                iy.EQ(-7185447965249401048L, this, new Integer(i), setOfInt);
            }
            this.u7.clear();
            Hw(this.v5 ? i : this.FH.identifierSpace.QX(i));
            if (this.v5 || i == this.FH.identifierSpace.QX(i)) {
                setOfInt.VH(this.u7);
                return;
            }
            this.u7.default_Iterator.init();
            while (this.u7.default_Iterator.hasMoreElements()) {
                setOfInt.put(this.FH.identifierSpace.Ws(this.u7.default_Iterator.nextKey()));
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -7185447965249401048L, this, new Integer(i), setOfInt);
            }
            throw th;
        }
    }

    @ey(method = -4427638767600704905L)
    public void j6(int i, SetOfInt setOfInt) {
        try {
            if (tp) {
                iy.EQ(3293717134596977920L, this, new Integer(i), setOfInt);
            }
            this.u7.clear();
            MapOfIntInt.b bVarZo = this.DW.Zo();
            bVarZo.FH(this.v5 ? i : this.FH.identifierSpace.QX(i));
            while (bVarZo.j6()) {
                this.u7.put(bVarZo.v5());
            }
            if (this.v5 || i == this.FH.identifierSpace.QX(i)) {
                setOfInt.VH(this.u7);
                return;
            }
            this.u7.default_Iterator.init();
            while (this.u7.default_Iterator.hasMoreElements()) {
                setOfInt.put(this.FH.identifierSpace.Ws(this.u7.default_Iterator.nextKey()));
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 3293717134596977920L, this, new Integer(i), setOfInt);
            }
            throw th;
        }
    }
}
