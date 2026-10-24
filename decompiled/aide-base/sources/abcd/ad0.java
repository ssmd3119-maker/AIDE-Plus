package abcd;

import abcd.n70;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ad0 {
    private static /* synthetic */ int[] u7;
    private final Collection<yd0> DW;
    private yc0 gn;
    private final le0 j6;
    private final HashMap<a70, k70> FH = new HashMap<>();
    private final HashSet<a70> Hw = new HashSet<>();
    private final ArrayList<je0> v5 = new ArrayList<>();
    private final ArrayList<zc0> Zo = new ArrayList<>();
    private final ArrayList<eb0> VH = new ArrayList<>();

    public ad0(le0 le0Var, Collection<yd0> collection) {
        this.j6 = le0Var;
        this.DW = collection;
    }

    private boolean DW() throws j50 {
        try {
            g90 g90Var = new g90(this.j6.j6);
            try {
                Iterator<a70> it = this.FH.keySet().iterator();
                while (it.hasNext()) {
                    g90Var.Ev(g90Var.I(it.next()));
                }
                Iterator<k70> it2 = this.j6.j6.VH().values().iterator();
                while (it2.hasNext()) {
                    g90Var.WB(g90Var.I(it2.next().DW()));
                }
                g90Var.Eq();
                return true;
            } finally {
                g90Var.lp();
            }
        } catch (q40 unused) {
            return false;
        } catch (IOException e) {
            throw new j50(JGitText.DW().unableToCheckConnectivity, e);
        }
    }

    private void EQ(yd0 yd0Var, Set<k70> set) throws j50 {
        k70 k70VarDW = this.gn.DW(yd0Var.gn());
        if (k70VarDW == null) {
            throw new j50(MessageFormat.format(JGitText.DW().remoteDoesNotHaveSpec, yd0Var.gn()));
        }
        if (set.add(k70VarDW)) {
            Mr(k70VarDW, yd0Var);
        }
    }

    private void FH(bd0 bd0Var) {
        yc0 yc0Var = this.gn;
        if (yc0Var != null) {
            yc0Var.close();
            bd0Var.DW(this.gn.Hw());
            this.gn = null;
        }
    }

    private je0 Hw(yd0 yd0Var, a70 a70Var) {
        return new je0(this.j6.j6, yd0Var, a70Var, "fetch");
    }

    private void J0(j70 j70Var) throws j50 {
        try {
            this.gn.FH("jgit fetch " + this.j6.DW);
            this.gn.j6(j70Var, this.FH.values(), this.Hw);
            this.VH.addAll(this.gn.VH());
            if (this.j6.Mr() && !this.gn.v5() && !DW()) {
                throw new j50(this.j6.aM(), JGitText.DW().peerDidNotSupplyACompleteObjectGraph);
            }
        } catch (Throwable th) {
            this.VH.addAll(this.gn.VH());
            throw th;
        }
    }

    private static boolean J8(String str) {
        return str.startsWith("refs/tags/");
    }

    private void Mr(k70 k70Var, yd0 yd0Var) throws j50 {
        a70 a70VarDW = k70Var.DW();
        if (yd0Var.VH() != null) {
            try {
                je0 je0VarHw = Hw(yd0Var, a70VarDW);
                if (a70VarDW.aM(je0VarHw.Hw())) {
                    return;
                } else {
                    this.v5.add(je0VarHw);
                }
            } catch (IOException e) {
                throw new j50(MessageFormat.format(JGitText.DW().cannotResolveLocalTrackingRefForUpdating, yd0Var.VH()), e);
            }
        }
        this.FH.put(a70VarDW, k70Var);
        zc0 zc0Var = new zc0();
        zc0Var.j6 = a70VarDW;
        zc0Var.DW = yd0Var.VH() != null;
        zc0Var.FH = k70Var.getName();
        zc0Var.Hw = this.j6.aM();
        this.Zo.add(zc0Var);
    }

    private void QX(a70 a70Var) {
        Iterator<zc0> it = this.Zo.iterator();
        while (it.hasNext()) {
            if (it.next().j6.aM(a70Var)) {
                it.remove();
            }
        }
    }

    private void U2(k70 k70Var) throws j50 {
        Mr(k70Var, new yd0().aM(k70Var.getName()).QX(k70Var.getName()));
    }

    private static boolean Ws(k70 k70Var) {
        return J8(k70Var.getName());
    }

    private void XL(a70 a70Var) {
        Iterator<je0> it = this.v5.iterator();
        while (it.hasNext()) {
            if (it.next().FH().aM(a70Var)) {
                it.remove();
            }
        }
    }

    private void Zo(bd0 bd0Var, p70 p70Var, t90 t90Var, yd0 yd0Var, k70 k70Var) throws j50 {
        String name = k70Var.getName();
        try {
            je0 je0Var = new je0(p70Var, name, yd0Var.gn(), true, a70.ca(), "deleted");
            bd0Var.j6(je0Var);
            if (this.j6.U2()) {
                return;
            }
            je0Var.j6(t90Var);
            int i = j6()[je0Var.v5().ordinal()];
            if (i != 3 && i != 4 && i != 5 && i != 6) {
                throw new j50(this.j6.aM(), MessageFormat.format(JGitText.DW().cannotDeleteStaleTrackingRef2, name, je0Var.v5().name()));
            }
        } catch (IOException e) {
            throw new j50(this.j6.aM(), MessageFormat.format(JGitText.DW().cannotDeleteStaleTrackingRef, name), e);
        }
    }

    private void aM() {
        if (this.gn != null) {
            return;
        }
        this.gn = this.j6.nw();
        HashMap map = new HashMap();
        for (k70 k70Var : this.gn.Zo()) {
            map.put(k70Var.DW(), k70Var);
        }
        ArrayList<k70> arrayList = new ArrayList(this.FH.values());
        this.FH.clear();
        for (k70 k70Var2 : arrayList) {
            k70 k70Var3 = (k70) map.get(k70Var2.DW());
            if (k70Var3 != null) {
                this.FH.put(k70Var3.DW(), k70Var3);
            } else {
                QX(k70Var2.DW());
                XL(k70Var2.DW());
            }
        }
    }

    private void gn(j70 j70Var, bd0 bd0Var) throws j50 {
        boolean zGn;
        this.gn = this.j6.nw();
        try {
            bd0Var.Zo(this.j6.aM(), this.gn.u7());
            HashSet hashSet = new HashSet();
            for (yd0 yd0Var : this.DW) {
                if (yd0Var.gn() == null) {
                    throw new j50(MessageFormat.format(JGitText.DW().sourceRefNotSpecifiedForRefspec, yd0Var));
                }
                if (yd0Var.tp()) {
                    we(yd0Var, hashSet);
                } else {
                    EQ(yd0Var, hashSet);
                }
            }
            Collection<k70> collectionEmptyList = Collections.emptyList();
            he0 he0VarWs = this.j6.Ws();
            if (he0VarWs == he0.AUTO_FOLLOW) {
                collectionEmptyList = u7();
            } else if (he0VarWs == he0.FETCH_TAGS) {
                tp();
            }
            if (this.FH.isEmpty() || DW()) {
                zGn = false;
            } else {
                J0(j70Var);
                zGn = this.gn.gn();
                FH(bd0Var);
            }
            if (j70Var.isCancelled()) {
                return;
            }
            if (he0VarWs == he0.AUTO_FOLLOW && !collectionEmptyList.isEmpty()) {
                this.Hw.addAll(this.FH.keySet());
                this.FH.clear();
                for (k70 k70Var : collectionEmptyList) {
                    a70 a70VarFH = k70Var.FH();
                    if (a70VarFH == null) {
                        a70VarFH = k70Var.DW();
                    }
                    if (this.j6.j6.aM(a70VarFH)) {
                        U2(k70Var);
                    }
                }
                if (!this.FH.isEmpty() && (!zGn || !DW())) {
                    aM();
                    if (!this.FH.isEmpty()) {
                        J0(j70Var);
                    }
                }
            }
            FH(bd0Var);
            t90 t90Var = new t90(this.j6.j6);
            try {
                if (j70Var instanceof o60) {
                    ((o60) j70Var).tp(250L, TimeUnit.MILLISECONDS);
                }
                j70Var.j6(JGitText.DW().updatingReferences, this.v5.size());
                if (this.j6.rN()) {
                    v5(bd0Var, t90Var);
                }
                Iterator<je0> it = this.v5.iterator();
                while (it.hasNext()) {
                    je0 next = it.next();
                    try {
                        j70Var.v5(1);
                        next.Zo(t90Var);
                        bd0Var.j6(next);
                    } catch (IOException e) {
                        throw new j50(MessageFormat.format(JGitText.DW().failureUpdatingTrackingRef, next.DW(), e.getMessage()), e);
                    }
                }
                j70Var.FH();
                t90Var.lp();
                if (j70Var.isCancelled() || this.Zo.isEmpty()) {
                    return;
                }
                try {
                    j3(bd0Var);
                } catch (IOException e2) {
                    throw new j50(MessageFormat.format(JGitText.DW().failureUpdatingFETCH_HEAD, e2.getMessage()), e2);
                }
            } catch (Throwable th) {
                t90Var.lp();
                throw th;
            }
        } finally {
            FH(bd0Var);
        }
    }

    private void j3(bd0 bd0Var) {
        File fileU7 = this.j6.j6.u7();
        if (fileU7 == null) {
            return;
        }
        sa0 sa0Var = new sa0(new File(fileU7, "FETCH_HEAD"), this.j6.j6.tp());
        try {
            if (sa0Var.u7()) {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(sa0Var.gn());
                try {
                    Iterator<zc0> it = this.Zo.iterator();
                    while (it.hasNext()) {
                        zc0 next = it.next();
                        next.j6(outputStreamWriter);
                        bd0Var.VH(next);
                    }
                    outputStreamWriter.close();
                    sa0Var.Hw();
                } catch (Throwable th) {
                    outputStreamWriter.close();
                    throw th;
                }
            }
        } finally {
            sa0Var.QX();
        }
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = u7;
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
        u7 = iArr2;
        return iArr2;
    }

    private void tp() throws j50 {
        k70 k70Var;
        Map<String, k70> mapVH = this.j6.j6.VH();
        for (k70 k70Var2 : this.gn.Zo()) {
            if (Ws(k70Var2) && ((k70Var = mapVH.get(k70Var2.getName())) == null || !k70Var2.DW().aM(k70Var.DW()))) {
                U2(k70Var2);
            }
        }
    }

    private Collection<k70> u7() throws j50 {
        ArrayList arrayList = new ArrayList();
        Map<String, k70> mapVH = this.j6.j6.VH();
        for (k70 k70Var : this.gn.Zo()) {
            if (Ws(k70Var)) {
                k70 k70Var2 = mapVH.get(k70Var.getName());
                a70 a70VarDW = k70Var.DW();
                if (k70Var.FH() == null) {
                    if (k70Var2 == null || !a70VarDW.aM(k70Var2.DW())) {
                        if (this.FH.containsKey(a70VarDW) || this.j6.j6.aM(a70VarDW)) {
                            U2(k70Var);
                        } else {
                            arrayList.add(k70Var);
                        }
                    }
                } else if (k70Var2 != null) {
                    if (!a70VarDW.aM(k70Var2.DW())) {
                        U2(k70Var);
                    }
                } else if (this.FH.containsKey(k70Var.FH()) || this.j6.j6.aM(k70Var.FH())) {
                    U2(k70Var);
                } else {
                    arrayList.add(k70Var);
                }
            }
        }
        return arrayList;
    }

    private void v5(bd0 bd0Var, t90 t90Var) throws j50 {
        p70 p70Var = this.j6.j6;
        for (k70 k70Var : p70Var.VH().values()) {
            String name = k70Var.getName();
            for (yd0 yd0Var : this.DW) {
                if (yd0Var.J0(name)) {
                    yd0 yd0VarDW = yd0Var.DW(name);
                    if (bd0Var.FH(yd0VarDW.gn()) == null) {
                        Zo(bd0Var, p70Var, t90Var, yd0VarDW, k70Var);
                    }
                }
            }
        }
    }

    private void we(yd0 yd0Var, Set<k70> set) throws j50 {
        for (k70 k70Var : this.gn.Zo()) {
            if (yd0Var.Ws(k70Var) && set.add(k70Var)) {
                Mr(k70Var, yd0Var.v5(k70Var));
            }
        }
    }

    public void VH(j70 j70Var, bd0 bd0Var) throws InterruptedException, j50 {
        this.FH.clear();
        this.v5.clear();
        this.Zo.clear();
        this.VH.clear();
        try {
            gn(j70Var, bd0Var);
            try {
                Iterator<eb0> it = this.VH.iterator();
                while (it.hasNext()) {
                    it.next().DW();
                }
            } catch (IOException e) {
                throw new j50(e.getMessage(), e);
            }
        } catch (Throwable th) {
            try {
                Iterator<eb0> it2 = this.VH.iterator();
                while (it2.hasNext()) {
                    it2.next().DW();
                }
                throw th;
            } catch (IOException e2) {
                throw new j50(e2.getMessage(), e2);
            }
        }
    }
}
