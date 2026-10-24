package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.d;
import java.util.Collections;

/* loaded from: classes.dex */
public class e<O extends a.d> {
    private final a<O> DW;
    private final O FH;
    private final e0<O> Hw;
    private final Context j6;
    private final int v5;

    public final int DW() {
        return this.v5;
    }

    public a.f FH(Looper looper, b.a<O> aVar) {
        return this.DW.DW().j6(this.j6, looper, j6().DW(), this.FH, aVar, aVar);
    }

    public w Hw(Context context, Handler handler) {
        return new w(context, handler, j6().DW());
    }

    protected d.a j6() {
        Account accountN5;
        GoogleSignInAccount googleSignInAccountDW;
        GoogleSignInAccount googleSignInAccountDW2;
        d.a aVar = new d.a();
        O o = this.FH;
        if (!(o instanceof a.d.b) || (googleSignInAccountDW2 = ((a.d.b) o).DW()) == null) {
            O o2 = this.FH;
            accountN5 = o2 instanceof a.d.InterfaceC0108a ? ((a.d.InterfaceC0108a) o2).n5() : null;
        } else {
            accountN5 = googleSignInAccountDW2.n5();
        }
        aVar.FH(accountN5);
        O o3 = this.FH;
        aVar.j6((!(o3 instanceof a.d.b) || (googleSignInAccountDW = ((a.d.b) o3).DW()) == null) ? Collections.emptySet() : googleSignInAccountDW.Mr());
        aVar.Hw(this.j6.getClass().getName());
        aVar.v5(this.j6.getPackageName());
        return aVar;
    }

    public final e0<O> v5() {
        return this.Hw;
    }
}
