package org.codehaus.groovy.antlr.treewalker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class CompositeVisitor implements Visitor {
    final List DW;
    final List j6;

    public CompositeVisitor(List list) {
        this.j6 = list;
        new Stack();
        ArrayList arrayList = new ArrayList();
        this.DW = arrayList;
        arrayList.addAll(list);
        Collections.reverse(this.DW);
    }

    private Iterator p8(int i) {
        return i == 4 ? this.DW.iterator() : this.j6.iterator();
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void AE(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).AE(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void AL(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).AL(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void AR(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).AR(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ak(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Ak(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void An(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).An(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void BJ(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).BJ(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void BN(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).BN(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void BR(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).BR(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void BT(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).BT(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Bx(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Bx(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void C(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).C(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void CN(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).CN(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void CU(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).CU(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Cz(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Cz(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void DP(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).DP(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void DW(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).DW(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void DY(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).DY(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Dm(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Dm(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void E4(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).E4(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void EQ(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).EQ(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ej(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Ej(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Eq(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Eq(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ev(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Ev(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void F3(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).F3(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void FH(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).FH(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void FN(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).FN(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Fd(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Fd(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void GK(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).GK(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void GT(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).GT(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Gj(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Gj(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void HE(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).HE(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void HO(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).HO(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void HT(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).HT(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Hl(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Hl(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Hw(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Hw(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void I(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).I(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void IM(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).IM(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void IS(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).IS(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void J0(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).J0(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void J1(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).J1(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void J8(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).J8(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Jl(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Jl(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Jm(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Jm(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void K3(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).K3(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void KD(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).KD(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Lx(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Lx(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Lz(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Lz(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ME(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ME(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void MP(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).MP(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Mr(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Mr(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Mz(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Mz(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void N0(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).N0(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void N2(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).N2(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void NZ(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).NZ(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Nh(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Nh(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void OM(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).OM(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void OW(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).OW(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Od(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Od(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Of(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Of(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void P8(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).P8(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void PH(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).PH(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void PT(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).PT(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Pa(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Pa(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Q6(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Q6(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void QO(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).QO(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void QX(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).QX(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Qq(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Qq(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Qs(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Qs(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void RW(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).RW(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void S4(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).S4(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void SI(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).SI(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Sc(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Sc(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Sf(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Sf(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void T6(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).T6(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void TE(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).TE(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void TI(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).TI(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void U2(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).U2(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void UF(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).UF(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void VH(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).VH(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Vq(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Vq(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void WB() {
        Iterator it = this.j6.iterator();
        while (it.hasNext()) {
            ((Visitor) it.next()).WB();
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ws(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Ws(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void XG(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).XG(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void XL(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).XL(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void XX(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).XX(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Xa(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Xa(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Yi(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Yi(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Z1(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Z1(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Za(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Za(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void Zo(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).Zo(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void a5(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).a5(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void a8(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).a8(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void aM(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).aM(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void aX(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).aX(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void aj(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).aj(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void aq(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).aq(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void b(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).b(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void b1(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).b1(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ba(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ba(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void br(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).br(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void cT(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).cT(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void cX(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).cX(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ca(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ca(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void cb(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).cb(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void cc(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).cc(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ce(GroovySourceAST groovySourceAST) {
        Iterator it = this.j6.iterator();
        while (it.hasNext()) {
            ((Visitor) it.next()).ce(groovySourceAST);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void cn(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).cn(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ct(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ct(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void d8(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).d8(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void dH(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).dH(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void dW(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).dW(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void df(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).df(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void dx(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).dx(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void e3(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).e3(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void e9(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).e9(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void eN(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).eN(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void eQ(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).eQ(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void eU(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).eU(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ee(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ee(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ef(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ef(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ei(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ei(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ep(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ep(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void er(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).er(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void et(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).et(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void fN(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).fN(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public GroovySourceAST fP() {
        Iterator it = this.DW.iterator();
        GroovySourceAST groovySourceASTFP = null;
        while (it.hasNext()) {
            groovySourceASTFP = ((Visitor) it.next()).fP();
        }
        return groovySourceASTFP;
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void fY(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).fY(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void fd(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).fd(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void fh(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).fh(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void g0(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).g0(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void g3(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).g3(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void gG(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).gG(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void gM(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).gM(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void gW(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).gW(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void gn(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).gn(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void gy(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).gy(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void h2(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).h2(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void hG(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).hG(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void hK(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).hK(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void hp(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).hp(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void hx(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).hx(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void hz(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).hz(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void iK(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).iK(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void iW(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).iW(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ir(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ir(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void j3(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).j3(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void j6(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).j6(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void jD(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).jD(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void jJ(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).jJ(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void jO(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).jO(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void jg(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).jg(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ji(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ji(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void jn(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).jn(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void jw(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).jw(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void k1(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).k1(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void k2(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).k2(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void k4(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).k4(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void kQ(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).kQ(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void kf(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).kf(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ko(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ko(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void lg(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).lg(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void lp(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).lp(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void mb(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).mb(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void n5(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).n5(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void nl(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).nl(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void nw(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).nw(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void oC(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).oC(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void oT(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).oT(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void oY(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).oY(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void oa() {
        Iterator it = this.DW.iterator();
        while (it.hasNext()) {
            ((Visitor) it.next()).oa();
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void oh(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).oh(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void om(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).om(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void oy(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).oy(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void pN(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).pN(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void pO(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).pO(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void pl(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).pl(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void pn(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).pn(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void q7(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).q7(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void qI(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).qI(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void qP(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).qP(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void qU(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).qU(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void qp(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).qp(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void rB(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).rB(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void rN(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).rN(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void re(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).re(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ro(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ro(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void s0(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).s0(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sE(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sE(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sG(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sG(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sM(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sM(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sT(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sT(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sg(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sg(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sh(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sh(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sv(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sv(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void sy(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).sy(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void tR(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).tR(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ti(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ti(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void tj(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).tj(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void tp(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).tp(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void tv(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).tv(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void u7(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).u7(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void u9(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).u9(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).uC(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void uD(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).uD(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void v5(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).v5(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void vJ(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).vJ(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void vy(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).vy(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void w9(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).w9(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void wC(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).wC(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void wE(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).wE(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void wc(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).wc(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void we(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).we(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void x6(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).x6(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void x9(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).x9(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void xg(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).xg(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void yO(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).yO(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void yS(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).yS(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ya(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ya(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ye(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ye(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void ys(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).ys(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void zf(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).zf(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void zg(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).zg(groovySourceAST, i);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.Visitor
    public void zh(GroovySourceAST groovySourceAST, int i) {
        Iterator itP8 = p8(i);
        while (itP8.hasNext()) {
            ((Visitor) itP8.next()).zh(groovySourceAST, i);
        }
    }
}
