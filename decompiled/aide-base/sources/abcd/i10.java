package abcd;

import abcd.n70;
import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class i10 extends m10<k70> {
    private static /* synthetic */ int[] gn;
    private String FH;
    private boolean Hw;
    private k90 VH;
    private String Zo;
    private a v5;

    public enum a {
        TRACK,
        NOTRACK,
        SET_UPSTREAM;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public i10(p70 p70Var) {
        super(p70Var);
        this.Hw = false;
        this.Zo = "HEAD";
    }

    public static /* synthetic */ int[] Hw() {
        int[] iArr = gn;
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
        gn = iArr2;
        return iArr2;
    }

    private void VH() throws m20 {
        if (this.FH != null) {
            if (p70.lg("refs/heads/" + this.FH)) {
                return;
            }
        }
        String str = JGitText.DW().branchNameInvalid;
        Object[] objArr = new Object[1];
        String str2 = this.FH;
        if (str2 == null) {
            str2 = "<null>";
        }
        objArr[0] = str2;
        throw new m20(MessageFormat.format(str, objArr));
    }

    private a70 Zo() throws v20, e40 {
        k90 k90Var = this.VH;
        if (k90Var != null) {
            k90Var.sy();
            return k90Var;
        }
        try {
            a70 a70VarRo = this.j6.ro(this.Zo == null ? "HEAD" : this.Zo);
            if (a70VarRo != null) {
                return a70VarRo;
            }
            String str = JGitText.DW().refNotResolved;
            Object[] objArr = new Object[1];
            String str2 = this.Zo;
            objArr[0] = str2 != null ? str2 : "HEAD";
            throw new v20(MessageFormat.format(str, objArr));
        } catch (e40 e) {
            throw e;
        }
    }

    public i10 gn(String str) {
        j6();
        this.FH = str;
        return this;
    }

    public i10 tp(a aVar) {
        j6();
        this.v5 = aVar;
        return this;
    }

    public i10 u7(String str) {
        j6();
        this.Zo = str;
        this.VH = null;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public k70 call() throws m20 {
        String str;
        String str2;
        k70 k70VarJ8;
        j6();
        VH();
        t90 t90Var = new t90(this.j6);
        try {
            try {
                k70 k70VarJ82 = this.j6.J8(this.FH);
                boolean zStartsWith = false;
                boolean z = k70VarJ82 != null && k70VarJ82.getName().startsWith("refs/heads/");
                if (!this.Hw && z) {
                    throw new u20(MessageFormat.format(JGitText.DW().refAlreadyExists, this.FH));
                }
                a70 a70VarZo = Zo();
                String name = (this.Zo == null || (k70VarJ8 = this.j6.J8(this.Zo)) == null) ? null : k70VarJ8.getName();
                String str3 = "";
                if (name == null) {
                    String strXa = this.VH != null ? this.VH.Xa() : t90Var.ca(this.j6.ro(this.Zo)).Xa();
                    if (z) {
                        str2 = "branch: Reset start-point to commit " + strXa;
                    } else {
                        str2 = "branch: Created from commit " + strXa;
                    }
                } else if (name.startsWith("refs/heads/") || name.startsWith("refs/remotes/")) {
                    if (z) {
                        str = "branch: Reset start-point to branch " + name;
                    } else {
                        str = "branch: Created from branch " + name;
                    }
                    String str4 = str;
                    str3 = name;
                    str2 = str4;
                } else {
                    a70VarZo = t90Var.aj(t90Var.I(a70VarZo));
                    if (z) {
                        str2 = "branch: Reset start-point to tag " + name;
                    } else {
                        str2 = "branch: Created from tag " + name;
                    }
                }
                n70 n70VarEf = this.j6.ef("refs/heads/" + this.FH);
                n70VarEf.er(a70VarZo);
                n70VarEf.BT(str2, false);
                n70.c cVarVH = (z && this.Hw) ? n70VarEf.VH() : n70VarEf.ei();
                FH(false);
                int i = Hw()[cVarVH.ordinal()];
                if (i != 3) {
                    if (i == 4) {
                        z = !z;
                    } else if (i != 5 && i != 6) {
                        z = false;
                    }
                }
                if (!z) {
                    throw new o20(MessageFormat.format(JGitText.DW().createBranchUnexpectedResult, cVarVH.name()));
                }
                k70 k70VarJ83 = this.j6.J8(this.FH);
                if (k70VarJ83 == null) {
                    throw new o20(JGitText.DW().createBranchFailedUnknownReason);
                }
                if (str3.length() == 0) {
                    return k70VarJ83;
                }
                if (this.v5 != a.SET_UPSTREAM && this.v5 != a.TRACK) {
                    if (this.v5 != a.NOTRACK) {
                        String strLg = this.j6.gn().lg("branch", null, "autosetupmerge");
                        if (!"false".equals(strLg)) {
                            zStartsWith = "always".equals(strLg) ? true : str3.startsWith("refs/remotes/");
                        }
                    }
                }
                if (zStartsWith) {
                    t70 t70VarGn = this.j6.gn();
                    String[] strArrSplit = str3.split("/", 4);
                    if (strArrSplit[1].equals("remotes")) {
                        String str5 = strArrSplit[2];
                        String str6 = strArrSplit[3];
                        t70VarGn.ro("branch", this.FH, "remote", str5);
                        t70VarGn.ro("branch", this.FH, "merge", "refs/heads/" + str6);
                    } else {
                        t70VarGn.ro("branch", this.FH, "remote", ".");
                        t70VarGn.ro("branch", this.FH, "merge", str3);
                    }
                    t70VarGn.ef();
                }
                return k70VarJ83;
            } catch (IOException e) {
                throw new o20(e.getMessage(), e);
            }
        } finally {
            t90Var.lp();
        }
    }
}
