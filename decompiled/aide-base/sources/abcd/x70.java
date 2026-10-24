package abcd;

import abcd.q60;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes.dex */
public class x70 {
    public static final q60.b<x70> v5 = new a();
    private String DW;
    private String FH;
    private String Hw;
    private String j6;

    class a implements q60.b<x70> {
        @Override // abcd.q60.b
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public x70 j6(q60 q60Var) {
            return new x70(q60Var, null);
        }
    }

    private x70(q60 q60Var) {
        String strZo = Zo(q60Var, "GIT_AUTHOR_NAME");
        this.j6 = strZo;
        if (strZo == null) {
            this.j6 = Hw();
        }
        String strV5 = v5(q60Var, "GIT_AUTHOR_EMAIL");
        this.DW = strV5;
        if (strV5 == null) {
            this.DW = FH();
        }
        String strZo2 = Zo(q60Var, "GIT_COMMITTER_NAME");
        this.FH = strZo2;
        if (strZo2 == null) {
            this.FH = Hw();
        }
        String strV52 = v5(q60Var, "GIT_COMMITTER_EMAIL");
        this.Hw = strV52;
        if (strV52 == null) {
            this.Hw = FH();
        }
    }

    private static String FH() {
        return String.valueOf(Hw()) + "@" + VH().DW();
    }

    private static String Hw() {
        String strHw = VH().Hw("user.name");
        return strHw == null ? "unknown-user" : strHw;
    }

    private static og0 VH() {
        return og0.FH();
    }

    private static String Zo(q60 q60Var, String str) {
        String strLg = q60Var.lg("user", null, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return strLg == null ? VH().VH(str) : strLg;
    }

    private static String v5(q60 q60Var, String str) {
        String strLg = q60Var.lg("user", null, "email");
        return strLg == null ? VH().VH(str) : strLg;
    }

    public String DW() {
        return this.FH;
    }

    public String j6() {
        return this.Hw;
    }

    public /* synthetic */ x70(q60 q60Var, x70 x70Var) {
        this(q60Var);
    }
}
