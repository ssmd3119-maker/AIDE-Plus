package abcd;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class wv {
    private static final a.g<com.google.android.gms.signin.internal.a> j6 = new a.g<>();
    private static final a.g<com.google.android.gms.signin.internal.a> DW = new a.g<>();
    public static final a.AbstractC0107a<com.google.android.gms.signin.internal.a, vv> FH = new xv();
    private static final a.AbstractC0107a<com.google.android.gms.signin.internal.a, Object> Hw = new yv();

    static {
        new Scope("profile");
        new Scope("email");
        new a("SignIn.API", FH, j6);
        new a("SignIn.INTERNAL_API", Hw, DW);
    }
}
