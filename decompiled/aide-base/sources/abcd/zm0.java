package abcd;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class zm0 {
    public static final String EQ;
    public static final String J0;
    public static final String J8;
    private static final Set Mr;
    private static final String QX;
    private static final Map U2;
    public static final String VH;
    private static final String Ws;
    private static final String XL;
    private static final String aM;
    public static final String gn;
    private static final String j3;
    public static final String tp;
    public static final String u7;
    public static final String we;
    protected List DW;
    protected List FH;
    protected List Hw;
    protected final SecureRandom Zo;
    protected List j6;
    protected Map v5;

    static {
        ok0.j6.XL();
        VH = fl0.Hw.XL();
        gn = dl0.v5.XL();
        u7 = dl0.DW.XL();
        tp = dl0.FH.XL();
        EQ = dl0.Hw.XL();
        hl0.ei.XL();
        vk0.j6.XL();
        kl0.FH.XL();
        kl0.DW.XL();
        kl0.Hw.XL();
        hl0.Hw.XL();
        we = mm0.Ws.XL();
        J0 = mm0.Hw.XL();
        J8 = hl0.tp.XL();
        vk0.DW.XL();
        vk0.FH.XL();
        Ws = mm0.Hw.XL();
        QX = mm0.VH.XL();
        XL = mm0.gn.XL();
        aM = mm0.u7.XL();
        j3 = mm0.tp.XL();
        Mr = new HashSet();
        U2 = new HashMap();
        Mr.add(we);
        Mr.add(J0);
        Mr.add(Ws);
        Mr.add(QX);
        Mr.add(XL);
        Mr.add(aM);
        Mr.add(j3);
        U2.put(VH, Ws);
        U2.put(gn, QX);
        U2.put(u7, XL);
        U2.put(tp, aM);
        U2.put(EQ, j3);
    }

    public zm0() {
        this(new SecureRandom());
    }

    public void DW(gn0 gn0Var) {
        this.Hw.add(gn0Var);
    }

    public void j6(hq0 hq0Var) {
        this.j6.addAll(cn0.FH(hq0Var));
    }

    public zm0(SecureRandom secureRandom) {
        this.j6 = new ArrayList();
        this.DW = new ArrayList();
        this.FH = new ArrayList();
        this.Hw = new ArrayList();
        this.v5 = new HashMap();
        this.Zo = secureRandom;
    }
}
