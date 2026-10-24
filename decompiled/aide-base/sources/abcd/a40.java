package abcd;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class a40 extends v30 {
    private static final Comparator<c> v5 = new a();
    private final List<c> Hw;

    class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            byte[] bArr = cVar.j6;
            byte[] bArr2 = cVar2.j6;
            return w30.v5(bArr, bArr.length, bArr2, bArr2.length);
        }
    }

    public static final class b extends c {
        public b(String str) {
            super(str);
        }

        @Override // abcd.a40.c
        public void j6(b40 b40Var) {
            throw new UnsupportedOperationException(JGitText.DW().noApplyInDelete);
        }
    }

    public static abstract class c {
        final byte[] j6;

        public c(String str) {
            this.j6 = r60.DW(str);
        }

        public abstract void j6(b40 b40Var);
    }

    public a40(w30 w30Var, int i) {
        super(w30Var, i);
        this.Hw = new ArrayList();
    }

    private void gn() {
        b40 b40VarWe;
        Collections.sort(this.Hw, v5);
        int iJ8 = this.j6.J8();
        int iU2 = 0;
        for (c cVar : this.Hw) {
            w30 w30Var = this.j6;
            byte[] bArr = cVar.j6;
            int iU7 = w30Var.u7(bArr, bArr.length);
            boolean z = iU7 < 0;
            if (iU7 < 0) {
                iU7 = -(iU7 + 1);
            }
            int iMin = Math.min(iU7, iJ8) - iU2;
            if (iMin > 0) {
                FH(iU2, iMin);
            }
            iU2 = z ? iU7 : this.j6.U2(iU7);
            if (!(cVar instanceof b)) {
                if (z) {
                    b40VarWe = new b40(cVar.j6);
                    cVar.j6(b40VarWe);
                    if (b40VarWe.EQ() == 0) {
                        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().fileModeNotSetForPath, b40VarWe.tp()));
                    }
                } else {
                    b40VarWe = this.j6.we(iU7);
                    cVar.j6(b40VarWe);
                }
                DW(b40VarWe);
            }
        }
        int i = iJ8 - iU2;
        if (i > 0) {
            FH(iU2, i);
        }
    }

    @Override // abcd.v30
    public void Hw() {
        if (this.Hw.isEmpty()) {
            return;
        }
        gn();
        Zo();
    }

    public void VH(c cVar) {
        this.Hw.add(cVar);
    }

    @Override // abcd.v30
    public boolean j6() {
        if (!this.Hw.isEmpty()) {
            return super.j6();
        }
        this.j6.P8();
        return true;
    }
}
