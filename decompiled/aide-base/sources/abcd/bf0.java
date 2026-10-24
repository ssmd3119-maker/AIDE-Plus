package abcd;

import abcd.ae0;
import abcd.c70;
import abcd.k70;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class bf0 extends nc0 implements rd0 {
    private final p70 Hw;
    private final le0 VH;
    private final cf0 Zo;
    private LinkedHashMap<String, String> gn;
    private Collection<ae0> tp;
    private Map<String, k70> u7;
    private final ue0 v5;

    class a extends o70 {
        public a(Collection collection) {
            super((Collection<k70>) collection);
        }

        @Override // abcd.o70
        public void j6(String str, byte[] bArr) {
            bf0.this.Zo.Ws("../" + str, bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bf0(df0 df0Var, cf0 cf0Var) {
        le0 le0Var = (le0) df0Var;
        this.VH = le0Var;
        this.Hw = le0Var.j6;
        this.v5 = le0Var.aM();
        this.Zo = cf0Var;
    }

    private void Mr(String str) {
        if (str != null) {
            try {
                this.Zo.DW(str);
            } catch (IOException unused) {
            }
        }
    }

    private void QX(List<ae0> list) throws j50 {
        try {
            this.Zo.Ws("../HEAD", r60.DW("ref: " + j3(list) + "\n"));
            try {
                this.Zo.Ws("../config", r60.DW("[core]\n\trepositoryformatversion = 0\n"));
            } catch (IOException e) {
                throw new j50(this.v5, JGitText.DW().cannotCreateConfig, e);
            }
        } catch (IOException e2) {
            throw new j50(this.v5, JGitText.DW().cannotCreateHEAD, e2);
        }
    }

    private void U2(List<ae0> list, j70 j70Var) {
        String str;
        OutputStream vg0Var;
        Throwable th;
        gc0 gc0Var = new gc0(this.VH.J8(), this.Hw.yS());
        try {
            try {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                Iterator<ae0> it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().DW());
                }
                for (k70 k70Var : Zo()) {
                    hashSet2.add(k70Var.DW());
                    if (k70Var.FH() != null) {
                        hashSet2.add(k70Var.FH());
                    }
                }
                gc0Var.j3(j70Var, hashSet, hashSet2);
                if (gc0Var.Ws() == 0) {
                    return;
                }
                this.gn = new LinkedHashMap<>();
                for (String str2 : this.Zo.Zo()) {
                    this.gn.put(str2, str2);
                }
                String str3 = "pack-" + gc0Var.gn().BT();
                String str4 = String.valueOf(str3) + ".pack";
                str = "pack/" + str4;
                try {
                    String str5 = "pack/" + str3 + ".idx";
                    if (this.gn.remove(str4) != null) {
                        this.Zo.QX(this.gn.keySet());
                        this.Zo.DW(str5);
                    }
                    String str6 = "Put " + str3.substring(0, 12);
                    OutputStream outputStreamJ8 = this.Zo.J8(str, j70Var, String.valueOf(str6) + "..pack");
                    try {
                        vg0 vg0Var2 = new vg0(outputStreamJ8);
                        try {
                            gc0Var.x9(j70Var, j70Var, vg0Var2);
                            vg0Var2.close();
                            OutputStream outputStreamJ82 = this.Zo.J8(str5, j70Var, String.valueOf(str6) + "..idx");
                            try {
                                vg0Var = new vg0(outputStreamJ82);
                                try {
                                    gc0Var.vJ(vg0Var);
                                    vg0Var.close();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(str4);
                                    arrayList.addAll(this.gn.keySet());
                                    this.Zo.QX(arrayList);
                                } catch (Throwable th2) {
                                    th = th2;
                                    vg0Var.close();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                vg0Var = outputStreamJ82;
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            outputStreamJ8 = vg0Var2;
                            outputStreamJ8.close();
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (IOException e) {
                    e = e;
                    Mr(null);
                    Mr(str);
                    throw new j50(this.v5, JGitText.DW().cannotStoreObjects, e);
                }
            } finally {
                gc0Var.a8();
            }
        } catch (IOException e2) {
            e = e2;
            str = null;
        }
    }

    private void XL(ae0 ae0Var) {
        k70 k70VarRemove = this.u7.remove(ae0Var.FH());
        if (k70VarRemove == null) {
            ae0Var.we(ae0.a.OK);
            return;
        }
        if (k70VarRemove.j6().DW()) {
            this.tp.add(ae0Var);
        }
        if (k70VarRemove.j6().j6()) {
            try {
                this.Zo.FH(ae0Var.FH());
                ae0Var.we(ae0.a.OK);
            } catch (IOException e) {
                ae0Var.we(ae0.a.REJECTED_OTHER_REASON);
                ae0Var.EQ(e.getMessage());
            }
        }
        try {
            this.Zo.Hw(ae0Var.FH());
        } catch (IOException e2) {
            ae0Var.we(ae0.a.REJECTED_OTHER_REASON);
            ae0Var.EQ(e2.getMessage());
        }
    }

    private void a8(ae0 ae0Var) {
        try {
            this.Zo.XL(ae0Var.FH(), ae0Var.DW());
            this.u7.put(ae0Var.FH(), new c70.c(k70.a.LOOSE, ae0Var.FH(), ae0Var.DW()));
            ae0Var.we(ae0.a.OK);
        } catch (IOException e) {
            ae0Var.we(ae0.a.REJECTED_OTHER_REASON);
            ae0Var.EQ(e.getMessage());
        }
    }

    private boolean aM() {
        LinkedHashMap<String, String> linkedHashMap;
        return u7().isEmpty() && (linkedHashMap = this.gn) != null && linkedHashMap.isEmpty();
    }

    private static String j3(List<ae0> list) {
        Iterator<ae0> it = list.iterator();
        while (it.hasNext()) {
            String strFH = it.next().FH();
            if (strFH.equals("refs/heads/master")) {
                return strFH;
            }
        }
        Iterator<ae0> it2 = list.iterator();
        while (it2.hasNext()) {
            String strFH2 = it2.next().FH();
            if (strFH2.startsWith("refs/heads/")) {
                return strFH2;
            }
        }
        return list.get(0).FH();
    }

    @Override // abcd.tc0
    public void close() {
        this.Zo.j6();
    }

    @Override // abcd.rd0
    public void tp(j70 j70Var, Map<String, ae0> map) throws j50 {
        J0();
        this.gn = null;
        this.u7 = new TreeMap(u7());
        this.tp = new ArrayList(map.size());
        ArrayList arrayList = new ArrayList();
        for (ae0 ae0Var : map.values()) {
            String strFH = ae0Var.FH();
            if (!strFH.startsWith("refs/") || !p70.lg(strFH)) {
                ae0Var.we(ae0.a.REJECTED_OTHER_REASON);
                ae0Var.EQ(JGitText.DW().funnyRefname);
            } else if (j60.Mr(a70.ca(), ae0Var.DW())) {
                XL(ae0Var);
            } else {
                arrayList.add(ae0Var);
            }
        }
        if (!arrayList.isEmpty()) {
            U2(arrayList, j70Var);
        }
        Iterator<ae0> it = arrayList.iterator();
        while (it.hasNext()) {
            a8(it.next());
        }
        if (!arrayList.isEmpty() && aM()) {
            QX(arrayList);
        }
        a aVar = new a(this.u7.values());
        if (!this.tp.isEmpty()) {
            try {
                aVar.FH();
                Iterator<ae0> it2 = this.tp.iterator();
                while (it2.hasNext()) {
                    it2.next().we(ae0.a.OK);
                }
            } catch (IOException e) {
                for (ae0 ae0Var2 : this.tp) {
                    ae0Var2.we(ae0.a.REJECTED_OTHER_REASON);
                    ae0Var2.EQ(e.getMessage());
                }
                throw new j50(this.v5, JGitText.DW().failedUpdatingRefs, e);
            }
        }
        try {
            aVar.DW();
        } catch (IOException e2) {
            throw new j50(this.v5, JGitText.DW().failedUpdatingRefs, e2);
        }
    }
}
