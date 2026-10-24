package abcd;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class ep0 extends BasicPermission {
    private final String WB;
    private final int mb;

    public ep0(String str, String str2) {
        super(str, str2);
        this.WB = str2;
        this.mb = j6(str2);
    }

    private int j6(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(iq0.v5(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (strNextToken.equals("all")) {
                i |= 15;
            }
        }
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ep0) {
            ep0 ep0Var = (ep0) obj;
            if (this.mb == ep0Var.mb && getName().equals(ep0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.WB;
    }

    public int hashCode() {
        return getName().hashCode() + this.mb;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof ep0) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.mb;
        int i2 = ((ep0) permission).mb;
        return (i & i2) == i2;
    }
}
