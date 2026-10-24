package abcd;

import abcd.n70;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class j10 extends m10<List<String>> {
    private static /* synthetic */ int[] v5;
    private final Set<String> FH;
    private boolean Hw;

    public j10(p70 p70Var) {
        super(p70Var);
        this.FH = new HashSet();
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

    public j10 Zo(String... strArr) {
        j6();
        this.FH.clear();
        for (String str : strArr) {
            this.FH.add(str);
        }
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public List<String> call() throws f20, t20 {
        k70 k70VarJ8;
        j6();
        ArrayList arrayList = new ArrayList();
        if (this.FH.isEmpty()) {
            return arrayList;
        }
        try {
            String strEQ = this.j6.EQ();
            if (!this.Hw) {
                t90 t90Var = new t90(this.j6);
                k90 k90VarCa = t90Var.ca(this.j6.ro("HEAD"));
                for (String str : this.FH) {
                    if (str != null && this.j6.J8(str) != null && !t90Var.P8(t90Var.ca(this.j6.ro(str)), k90VarCa)) {
                        throw new t20();
                    }
                }
            }
            FH(false);
            for (String str2 : this.FH) {
                if (str2 != null && (k70VarJ8 = this.j6.J8(str2)) != null) {
                    String name = k70VarJ8.getName();
                    if (name.equals(strEQ)) {
                        throw new f20(MessageFormat.format(JGitText.DW().cannotDeleteCheckedOutBranch, str2));
                    }
                    n70 n70VarEf = this.j6.ef(name);
                    n70VarEf.BT("branch deleted", false);
                    n70VarEf.rN(true);
                    n70.c cVarJ6 = n70VarEf.j6();
                    int i = Hw()[cVarJ6.ordinal()];
                    if (!((i == 2 || i == 7 || i == 9) ? false : true)) {
                        throw new o20(MessageFormat.format(JGitText.DW().deleteBranchUnexpectedResult, cVarJ6.name()));
                    }
                    arrayList.add(name);
                    if (name.startsWith("refs/heads/")) {
                        String strSubstring = name.substring(11);
                        t70 t70VarGn = this.j6.gn();
                        t70VarGn.sG("branch", strSubstring);
                        t70VarGn.ef();
                    }
                }
            }
            return arrayList;
        } catch (IOException e) {
            throw new o20(e.getMessage(), e);
        }
    }
}
