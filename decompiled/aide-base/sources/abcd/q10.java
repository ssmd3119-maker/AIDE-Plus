package abcd;

import abcd.c70;
import abcd.f80;
import abcd.k70;
import abcd.n70;
import abcd.r10;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class q10 extends m10<r10> {
    private static /* synthetic */ int[] v5;
    private d80 FH;
    private List<k70> Hw;

    public q10(p70 p70Var) {
        super(p70Var);
        this.FH = d80.Hw;
        this.Hw = new LinkedList();
    }

    public static /* synthetic */ int[] Hw() {
        int[] iArr = v5;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[n70.c.valuesCustom().length];
        try {
            iArr2[n70.c.FAST_FORWARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[n70.c.FORCED.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[n70.c.IO_FAILURE.ordinal()] = 9;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n70.c.LOCK_FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n70.c.NEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n70.c.NOT_ATTEMPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n70.c.NO_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n70.c.REJECTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[n70.c.REJECTED_CURRENT_BRANCH.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[n70.c.RENAMED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        v5 = iArr2;
        return iArr2;
    }

    private void u7(StringBuilder sb, a70 a70Var, a70 a70Var2) throws h20 {
        n70 n70VarEf = this.j6.ef("HEAD");
        n70VarEf.er(a70Var);
        n70VarEf.BT(sb.toString(), false);
        n70VarEf.lg(a70Var2);
        n70.c cVarEi = n70VarEf.ei();
        int i = Hw()[cVarEi.ordinal()];
        if (i != 2) {
            if (i == 4 || i == 6) {
                return;
            }
            if (i != 7) {
                throw new o20(MessageFormat.format(JGitText.DW().updatingRefFailed, "HEAD", a70Var.toString(), cVarEi));
            }
        }
        throw new h20(JGitText.DW().couldNotLockHEAD, n70VarEf.EQ(), cVarEi);
    }

    public q10 VH(j60 j60Var) {
        Zo(j60Var.yS(), j60Var);
        return this;
    }

    public q10 Zo(String str, j60 j60Var) {
        gn(new c70.c(k70.a.LOOSE, str, j60Var.Zo()));
        return this;
    }

    public q10 gn(k70 k70Var) {
        j6();
        this.Hw.add(k70Var);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [abcd.m10, abcd.q10] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // java.util.concurrent.Callable
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public r10 call() throws Throwable {
        IOException iOException;
        f40 f40Var;
        Throwable th;
        boolean zV5;
        List<String> listMr;
        Map<String, c80<? extends p30>> map;
        Map<String, f80.a> map2;
        j6();
        if (this.Hw.size() != 1) {
            throw new l20(this.Hw.isEmpty() ? JGitText.DW().noMergeHeadSpecified : MessageFormat.format(JGitText.DW().mergeStrategyDoesNotSupportHeads, this.FH.j6(), Integer.valueOf(this.Hw.size())));
        }
        z30 z30Var = null;
        ?? r3 = 0;
        t90 t90Var = null;
        try {
            try {
                k70 k70VarJ8 = this.j6.J8("HEAD");
                if (k70VarJ8 == null) {
                    throw new r20(JGitText.DW().commitOnRepoWithoutHEADCurrentlyNotSupported);
                }
                StringBuilder sb = new StringBuilder("merge ");
                t90 t90Var2 = new t90(this.j6);
                try {
                    try {
                        try {
                            k70 k70Var = this.Hw.get(0);
                            sb.append(k70Var.getName());
                            a70 a70VarFH = k70Var.FH();
                            if (a70VarFH == null) {
                                a70VarFH = k70Var.DW();
                            }
                            k90 k90VarRo = t90Var2.ro(a70VarFH);
                            a70 a70VarDW = k70VarJ8.DW();
                            try {
                                if (a70VarDW == null) {
                                    t90Var2.x9(k90VarRo);
                                    z30 z30Var2 = new z30(this.j6, this.j6.rN(), k90VarRo.Eq());
                                    z30Var2.j3(true);
                                    z30Var2.DW();
                                    n70 n70VarEf = this.j6.ef(k70VarJ8.VH().getName());
                                    n70VarEf.er(a70VarFH);
                                    n70VarEf.lg(null);
                                    n70VarEf.BT("initial pull", false);
                                    if (n70VarEf.ei() != n70.c.NEW) {
                                        throw new r20(JGitText.DW().commitOnRepoWithoutHEADCurrentlyNotSupported);
                                    }
                                    FH(false);
                                    a70[] a70VarArr = new a70[2];
                                    a70VarArr[1] = k90VarRo;
                                    r10 r10Var = new r10(k90VarRo, k90VarRo, a70VarArr, r10.a.WB, this.FH, null, null);
                                    t90Var2.lp();
                                    return r10Var;
                                }
                                k90 k90VarRo2 = t90Var2.ro(a70VarDW);
                                if (t90Var2.P8(k90VarRo, k90VarRo2)) {
                                    FH(false);
                                    r10 r10Var2 = new r10(k90VarRo2, k90VarRo, new a70[]{k90VarRo2, k90VarRo}, r10.a.mb, this.FH, null, null);
                                    t90Var2.lp();
                                    return r10Var2;
                                }
                                if (t90Var2.P8(k90VarRo2, k90VarRo)) {
                                    sb.append(": " + r10.a.WB);
                                    z30 z30Var3 = new z30(this.j6, k90VarRo2.Eq(), this.j6.rN(), k90VarRo.Eq());
                                    z30Var3.j3(true);
                                    z30Var3.DW();
                                    u7(sb, k90VarRo, a70VarDW);
                                    FH(false);
                                    r10 r10Var3 = new r10(k90VarRo, k90VarRo, new a70[]{k90VarRo2, k90VarRo}, r10.a.WB, this.FH, null, null);
                                    t90Var2.lp();
                                    return r10Var3;
                                }
                                String strJ6 = new b80().j6(this.Hw, k70VarJ8);
                                this.j6.Mz(strJ6);
                                this.j6.I(Arrays.asList(k70Var.DW()));
                                e80 e80VarDW = this.FH.DW(this.j6);
                                if (e80VarDW instanceof f80) {
                                    f80 f80Var = (f80) e80VarDW;
                                    f80Var.gW(new String[]{"BASE", "HEAD", k70Var.getName()});
                                    f80Var.BT(new hf0(this.j6));
                                    zV5 = e80VarDW.v5(k90VarRo2, k90VarRo);
                                    Map<String, c80<? extends p30>> mapAM = f80Var.aM();
                                    Map<String, f80.a> mapXL = f80Var.XL();
                                    listMr = f80Var.Mr();
                                    map = mapAM;
                                    map2 = mapXL;
                                } else {
                                    zV5 = e80VarDW.v5(k90VarRo2, k90VarRo);
                                    listMr = null;
                                    map = null;
                                    map2 = null;
                                }
                                sb.append(": Merge made by ");
                                sb.append(this.FH.j6());
                                sb.append('.');
                                if (zV5) {
                                    z30 z30Var4 = new z30(this.j6, k90VarRo2.Eq(), this.j6.rN(), e80VarDW.Hw());
                                    z30Var4.j3(true);
                                    z30Var4.DW();
                                    h10 h10VarGn = new l10(DW()).gn();
                                    h10VarGn.J8(sb.toString());
                                    k90 k90VarCall = h10VarGn.call();
                                    k90VarCall.sy();
                                    k90VarRo2.sy();
                                    k90VarRo.sy();
                                    r10 r10Var4 = new r10(k90VarCall, null, new a70[]{k90VarRo2, k90VarRo}, r10.a.fY, this.FH, null, null);
                                    t90Var2.lp();
                                    return r10Var4;
                                }
                                if (map2 == null) {
                                    this.j6.Mz(new b80().DW(strJ6, listMr));
                                    k90 k90VarJ6 = e80VarDW.j6(0, 1);
                                    k90VarRo2.sy();
                                    k90VarRo.sy();
                                    r10 r10Var5 = new r10(null, k90VarJ6, new a70[]{k90VarRo2, k90VarRo}, r10.a.qp, this.FH, map, null);
                                    t90Var2.lp();
                                    return r10Var5;
                                }
                                this.j6.Mz(null);
                                this.j6.I(null);
                                k90 k90VarJ62 = e80VarDW.j6(0, 1);
                                k90VarRo2.sy();
                                k90VarRo.sy();
                                r10 r10Var6 = new r10(null, k90VarJ62, new a70[]{k90VarRo2, k90VarRo}, r10.a.jw, this.FH, map, map2, null);
                                t90Var2.lp();
                                return r10Var6;
                            } catch (f40 e) {
                                e = e;
                                r3 = "HEAD";
                                f40Var = e;
                                z30Var = r3;
                                throw new g20(z30Var == null ? Collections.emptyList() : z30Var.gn(), f40Var);
                            }
                        } catch (f40 e2) {
                            e = e2;
                        }
                    } catch (IOException e3) {
                        iOException = e3;
                        throw new o20(MessageFormat.format(JGitText.DW().exceptionCaughtDuringExecutionOfMergeCommand, iOException), iOException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    t90Var = t90Var2;
                    if (t90Var == null) {
                        throw th;
                    }
                    t90Var.lp();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (f40 e4) {
            f40Var = e4;
        } catch (IOException e5) {
            iOException = e5;
        }
    }
}
