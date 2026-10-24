package abcd;

import abcd.a40;
import abcd.n70;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class h10 extends m10<k90> {
    private static /* synthetic */ int[] J0;
    private List<a70> EQ;
    private i70 FH;
    private i70 Hw;
    private List<String> VH;
    private boolean Zo;
    private boolean[] gn;
    private boolean tp;
    private boolean u7;
    private String v5;
    private String we;

    class a extends a40.c {
        private final /* synthetic */ b40 DW;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h10 h10Var, String str, b40 b40Var) {
            super(str);
            this.DW = b40Var;
        }

        @Override // abcd.a40.c
        public void j6(b40 b40Var) {
            b40Var.j6(this.DW);
        }
    }

    public h10(p70 p70Var) {
        super(p70Var);
        this.VH = new ArrayList();
        this.EQ = new LinkedList();
    }

    public static /* synthetic */ int[] Hw() {
        int[] iArr = J0;
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
        J0 = iArr2;
        return iArr2;
    }

    private void VH(a70 a70Var) {
        a70 a70VarDW = vf0.DW(a70Var, !this.EQ.isEmpty() ? this.EQ.get(0) : null, this.FH, this.Hw, this.v5);
        String strFH = vf0.FH(this.v5, a70VarDW);
        this.v5 = strFH;
        if (a70VarDW != null) {
            this.v5 = strFH.replaceAll("\nChange-Id: I" + a70.ca().yS() + "\n", "\nChange-Id: I" + a70VarDW.yS() + "\n");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016f A[PHI: r4 r12 r18 r19 r20
      0x016f: PHI (r4v5 abcd.y30) = (r4v1 abcd.y30), (r4v9 abcd.y30), (r4v9 abcd.y30), (r4v9 abcd.y30) binds: [B:69:0x016d, B:58:0x0145, B:60:0x014b, B:62:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r12v4 abcd.e70) = (r12v1 abcd.e70), (r12v7 abcd.e70), (r12v7 abcd.e70), (r12v7 abcd.e70) binds: [B:69:0x016d, B:58:0x0145, B:60:0x014b, B:62:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r18v4 abcd.jf0) = (r18v2 abcd.jf0), (r18v5 abcd.jf0), (r18v5 abcd.jf0), (r18v5 abcd.jf0) binds: [B:69:0x016d, B:58:0x0145, B:60:0x014b, B:62:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r19v4 int) = (r19v2 int), (r19v5 int), (r19v5 int), (r19v5 int) binds: [B:69:0x016d, B:58:0x0145, B:60:0x014b, B:62:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r20v4 abcd.w30) = (r20v2 abcd.w30), (r20v5 abcd.w30), (r20v5 abcd.w30), (r20v5 abcd.w30) binds: [B:69:0x016d, B:58:0x0145, B:60:0x014b, B:62:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private abcd.w30 Zo(abcd.a70 r23, abcd.w30 r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.h10.Zo(abcd.a70, abcd.w30):abcd.w30");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int gn(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<java.lang.String> r0 = r7.VH
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L8:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L10
            r8 = -1
            return r8
        L10:
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r8
        L17:
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L1e
            return r2
        L1e:
            java.lang.String r5 = "/"
            int r5 = r4.lastIndexOf(r5)
            r6 = 1
            if (r5 >= r6) goto L2a
            int r2 = r2 + 1
            goto L8
        L2a:
            java.lang.String r4 = r4.substring(r1, r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.h10.gn(java.lang.String):int");
    }

    private void u7(s70 s70Var) throws s20 {
        if (this.Hw == null) {
            this.Hw = new i70(this.j6);
        }
        if (this.FH == null) {
            this.FH = this.Hw;
        }
        if (s70Var == s70.MERGING_RESOLVED) {
            try {
                this.EQ = this.j6.KD();
                if (this.v5 == null) {
                    try {
                        this.v5 = this.j6.SI();
                    } catch (IOException e) {
                        throw new o20(MessageFormat.format(JGitText.DW().exceptionOccurredDuringReadingOfGIT_DIR, "MERGE_MSG", e), e);
                    }
                }
            } catch (IOException e2) {
                throw new o20(MessageFormat.format(JGitText.DW().exceptionOccurredDuringReadingOfGIT_DIR, "MERGE_HEAD", e2), e2);
            }
        }
        if (this.v5 == null) {
            throw new s20(JGitText.DW().commitMessageNotSpecified);
        }
    }

    public h10 EQ(i70 i70Var) {
        j6();
        this.FH = i70Var;
        return this;
    }

    public h10 J0(String str) {
        j6();
        if (this.Zo) {
            throw new o20(MessageFormat.format(JGitText.DW().illegalCombinationOfArguments, "--only", "--all"));
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (!this.VH.contains(str)) {
            this.VH.add(str);
        }
        return this;
    }

    public h10 J8(String str) {
        this.we = str;
        return this;
    }

    public h10 tp(boolean z) {
        j6();
        if (!this.VH.isEmpty()) {
            throw new o20(MessageFormat.format(JGitText.DW().illegalCombinationOfArguments, "--all", "--only"));
        }
        this.Zo = z;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public k90 call() throws Throwable {
        j6();
        s70 s70VarQX = this.j6.QX();
        if (!s70VarQX.j6()) {
            throw new x20(MessageFormat.format(JGitText.DW().cannotCommitOnARepoWithState, s70VarQX.name()));
        }
        u7(s70VarQX);
        try {
            if (this.Zo && !this.j6.U2() && this.j6.XL() != null) {
                try {
                    b10 b10VarJ6 = new l10(this.j6).j6();
                    b10VarJ6.Hw(".");
                    b10VarJ6.Zo(true);
                    b10VarJ6.call();
                } catch (q20 e) {
                    throw new o20(e.getMessage(), e);
                }
            }
            if (this.j6.J8("HEAD") == null) {
                throw new r20(JGitText.DW().commitOnRepoWithoutHEADCurrentlyNotSupported);
            }
            a70 a70VarRo = this.j6.ro("HEAD^{commit}");
            if (a70VarRo != null) {
                if (this.u7) {
                    for (k90 k90Var : new t90(this.j6).ca(a70VarRo).CU()) {
                        List<a70> list = this.EQ;
                        k90Var.sy();
                        list.add(0, k90Var);
                    }
                } else {
                    this.EQ.add(0, a70VarRo);
                }
            }
            w30 w30VarRN = this.j6.rN();
            try {
                if (!this.VH.isEmpty()) {
                    w30VarRN = Zo(a70VarRo, w30VarRN);
                }
                e70 e70VarEr = this.j6.er();
                try {
                    a70 a70VarSI = w30VarRN.SI(e70VarEr);
                    if (this.tp) {
                        VH(a70VarSI);
                    }
                    p60 p60Var = new p60();
                    p60Var.u7(this.Hw);
                    p60Var.gn(this.FH);
                    p60Var.tp(this.v5);
                    p60Var.EQ(this.EQ);
                    p60Var.we(a70VarSI);
                    a70 a70VarU7 = e70VarEr.u7(p60Var);
                    e70VarEr.FH();
                    t90 t90Var = new t90(this.j6);
                    try {
                        k90 k90VarCa = t90Var.ca(a70VarU7);
                        n70 n70VarEf = this.j6.ef("HEAD");
                        n70VarEf.er(a70VarU7);
                        if (this.we != null) {
                            n70VarEf.BT(this.we, false);
                        } else {
                            n70VarEf.BT((this.u7 ? "commit (amend): " : "commit: ") + k90VarCa.Xa(), false);
                        }
                        if (a70VarRo != null) {
                            n70VarEf.lg(a70VarRo);
                        } else {
                            n70VarEf.lg(a70.ca());
                        }
                        n70.c cVarVH = n70VarEf.VH();
                        int i = Hw()[cVarVH.ordinal()];
                        if (i != 2) {
                            if (i == 4 || i == 5 || i == 6) {
                                FH(false);
                                if (s70VarQX == s70.MERGING_RESOLVED) {
                                    this.j6.Mz(null);
                                    this.j6.I(null);
                                } else if (s70VarQX == s70.CHERRY_PICKING_RESOLVED) {
                                    this.j6.Mz(null);
                                    this.j6.vJ(null);
                                }
                                return k90VarCa;
                            }
                            if (i != 7) {
                                throw new o20(MessageFormat.format(JGitText.DW().updatingRefFailed, "HEAD", a70VarU7.toString(), cVarVH));
                            }
                        }
                        throw new h20(JGitText.DW().couldNotLockHEAD, n70VarEf.EQ(), cVarVH);
                    } finally {
                        t90Var.lp();
                    }
                } finally {
                    e70VarEr.we();
                }
            } finally {
                w30VarRN.P8();
            }
        } catch (k50 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfCommitCommand, e3);
        }
    }

    public h10 we(String str) {
        j6();
        this.v5 = str;
        return this;
    }
}
