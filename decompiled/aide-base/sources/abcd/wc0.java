package abcd;

import abcd.uc0;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class wc0 implements UserInfo, UIKeyboardInteractive {
    private final vc0 DW;
    private String FH;
    private String Hw;
    private final ue0 j6;

    public wc0(Session session, vc0 vc0Var) {
        this.j6 = gn(session);
        this.DW = vc0Var;
    }

    private static ue0 gn(Session session) {
        return new ue0().aM("ssh").j3(session.yS()).J8(session.j3()).XL(session.a8());
    }

    private uc0.d u7(String str) {
        return new uc0.d(str, true);
    }

    @Override // com.jcraft.jsch.UserInfo
    public String DW() {
        return this.Hw;
    }

    @Override // com.jcraft.jsch.UserInfo
    public boolean FH(String str) {
        uc0.c cVar = new uc0.c(str);
        if (this.DW.DW(this.j6, cVar)) {
            this.FH = new String(cVar.FH());
            return true;
        }
        this.FH = null;
        return false;
    }

    @Override // com.jcraft.jsch.UserInfo
    public void Hw(String str) {
        this.DW.DW(this.j6, new uc0.b(str));
    }

    @Override // com.jcraft.jsch.UserInfo
    public boolean VH(String str) {
        uc0.f fVar = new uc0.f(str);
        return this.DW.DW(this.j6, fVar) && fVar.DW();
    }

    @Override // com.jcraft.jsch.UserInfo
    public String Zo() {
        return this.FH;
    }

    @Override // com.jcraft.jsch.UserInfo
    public boolean j6(String str) {
        uc0.d dVarU7 = u7(str);
        if (this.DW.DW(this.j6, dVarU7)) {
            this.Hw = dVarU7.DW();
            return true;
        }
        this.Hw = null;
        return false;
    }

    @Override // com.jcraft.jsch.UIKeyboardInteractive
    public String[] v5(String str, String str2, String str3, String[] strArr, boolean[] zArr) {
        int length = strArr.length;
        uc0.d[] dVarArr = new uc0.d[length];
        for (int i = 0; i < strArr.length; i++) {
            dVarArr[i] = new uc0.d(strArr[i], !zArr[i]);
        }
        ArrayList arrayList = new ArrayList();
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new uc0.b(str3));
        }
        arrayList.addAll(Arrays.asList(dVarArr));
        if (!this.DW.j6(this.j6, arrayList)) {
            return null;
        }
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr2[i2] = dVarArr[i2].DW();
        }
        return strArr2;
    }
}
