package abcd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class zd0 implements Serializable {
    private he0 AL;
    private String WB;
    private List<yd0> fY;
    private int hK;
    private List<ue0> jw;
    private String k2;
    private List<ue0> mb;
    private List<yd0> qp;
    private boolean w9;
    private String zh;

    public zd0(q60 q60Var, String str) {
        this.WB = str;
        String[] strArrRN = q60Var.rN("remote", str, "url");
        this.mb = new ArrayList(strArrRN.length);
        for (String str2 : strArrRN) {
            this.mb.add(new ue0(str2));
        }
        String[] strArrRN2 = q60Var.rN("remote", this.WB, "pushurl");
        this.jw = new ArrayList(strArrRN2.length);
        for (String str3 : strArrRN2) {
            this.jw.add(new ue0(str3));
        }
        String[] strArrRN3 = q60Var.rN("remote", this.WB, "fetch");
        this.fY = new ArrayList(strArrRN3.length);
        for (String str4 : strArrRN3) {
            this.fY.add(new yd0(str4));
        }
        String[] strArrRN4 = q60Var.rN("remote", this.WB, "push");
        this.qp = new ArrayList(strArrRN4.length);
        for (String str5 : strArrRN4) {
            this.qp.add(new yd0(str5));
        }
        String strLg = q60Var.lg("remote", this.WB, "uploadpack");
        this.k2 = strLg == null ? "git-upload-pack" : strLg;
        String strLg2 = q60Var.lg("remote", this.WB, "receivepack");
        this.zh = strLg2 == null ? "git-receive-pack" : strLg2;
        this.AL = he0.j6(q60Var.lg("remote", this.WB, "tagopt"));
        this.w9 = q60Var.we("remote", this.WB, "mirror", false);
        this.hK = q60Var.XL("remote", this.WB, "timeout", 0);
    }

    private void J0(q60 q60Var, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            Ws(q60Var, str);
        } else {
            q60Var.ro("remote", Hw(), str, str2);
        }
    }

    private void J8(q60 q60Var, String str, boolean z, boolean z2) {
        if (z2 == z) {
            Ws(q60Var, str);
        } else {
            q60Var.nw("remote", Hw(), str, z);
        }
    }

    private void Ws(q60 q60Var, String str) {
        q60Var.cb("remote", Hw(), str);
    }

    private void we(q60 q60Var, String str, int i, int i2) {
        if (i2 == i) {
            Ws(q60Var, str);
        } else {
            q60Var.SI("remote", Hw(), str, i);
        }
    }

    public boolean DW(ue0 ue0Var) {
        if (this.mb.contains(ue0Var)) {
            return false;
        }
        return this.mb.add(ue0Var);
    }

    public String EQ() {
        return this.k2;
    }

    public List<yd0> FH() {
        return Collections.unmodifiableList(this.fY);
    }

    public String Hw() {
        return this.WB;
    }

    public void QX(q60 q60Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        Iterator<ue0> it = tp().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().Mr());
        }
        q60Var.cn("remote", Hw(), "url", arrayList);
        arrayList.clear();
        Iterator<ue0> it2 = Zo().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().Mr());
        }
        q60Var.cn("remote", Hw(), "pushurl", arrayList);
        arrayList.clear();
        Iterator<yd0> it3 = FH().iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().toString());
        }
        q60Var.cn("remote", Hw(), "fetch", arrayList);
        arrayList.clear();
        Iterator<yd0> it4 = v5().iterator();
        while (it4.hasNext()) {
            arrayList.add(it4.next().toString());
        }
        q60Var.cn("remote", Hw(), "push", arrayList);
        J0(q60Var, "uploadpack", EQ(), "git-upload-pack");
        J0(q60Var, "receivepack", VH(), "git-receive-pack");
        J0(q60Var, "tagopt", gn().DW(), he0.AUTO_FOLLOW.DW());
        J8(q60Var, "mirror", this.w9, false);
        we(q60Var, "timeout", this.hK, 0);
    }

    public String VH() {
        return this.zh;
    }

    public List<ue0> Zo() {
        return Collections.unmodifiableList(this.jw);
    }

    public he0 gn() {
        return this.AL;
    }

    public boolean j6(yd0 yd0Var) {
        if (this.fY.contains(yd0Var)) {
            return false;
        }
        return this.fY.add(yd0Var);
    }

    public List<ue0> tp() {
        return Collections.unmodifiableList(this.mb);
    }

    public int u7() {
        return this.hK;
    }

    public List<yd0> v5() {
        return Collections.unmodifiableList(this.qp);
    }
}
