package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions Q6;
    public static final Scope Z1;
    public static final Scope cT;
    public static final Scope hK = new Scope("profile");
    public static final GoogleSignInOptions n5;
    public static final Scope q7;
    private String AL;
    private final int WB;
    private boolean fY;
    private Account jw;
    private final boolean k2;
    private final ArrayList<Scope> mb;
    private final boolean qp;
    private ArrayList<GoogleSignInOptionsExtensionParcelable> w9;
    private String zh;

    public static final class a {
        private boolean DW;
        private boolean FH;
        private boolean Hw;
        private String VH;
        private Account Zo;
        private String v5;
        private Set<Scope> j6 = new HashSet();
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> gn = new HashMap();

        public final a DW() {
            this.j6.add(GoogleSignInOptions.cT);
            return this;
        }

        public final a FH() {
            this.j6.add(GoogleSignInOptions.hK);
            return this;
        }

        public final a Hw(Scope scope, Scope... scopeArr) {
            this.j6.add(scope);
            this.j6.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public final GoogleSignInOptions j6() {
            if (this.j6.contains(GoogleSignInOptions.Z1) && this.j6.contains(GoogleSignInOptions.q7)) {
                this.j6.remove(GoogleSignInOptions.q7);
            }
            if (this.Hw && (this.Zo == null || !this.j6.isEmpty())) {
                DW();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.j6), this.Zo, this.Hw, this.DW, this.FH, this.v5, this.VH, this.gn, null);
        }
    }

    static {
        new Scope("email");
        cT = new Scope("openid");
        q7 = new Scope("https://www.googleapis.com/auth/games_lite");
        Z1 = new Scope("https://www.googleapis.com/auth/games");
        a aVarDW = new a().DW();
        aVarDW.FH();
        n5 = aVarDW.j6();
        a aVar = new a();
        aVar.Hw(q7, new Scope[0]);
        Q6 = aVar.j6();
        CREATOR = new c();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, j3(arrayList2));
    }

    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> j3(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.gn()), googleSignInOptionsExtensionParcelable);
        }
        return map;
    }

    public ArrayList<Scope> EQ() {
        return new ArrayList<>(this.mb);
    }

    public String J8() {
        return this.zh;
    }

    public boolean QX() {
        return this.fY;
    }

    public boolean Ws() {
        return this.k2;
    }

    public boolean aM() {
        return this.qp;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: ClassCastException -> 0x0085, TryCatch #0 {ClassCastException -> 0x0085, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004c, B:24:0x0054, B:29:0x006b, B:31:0x0073, B:33:0x007b, B:27:0x005f, B:20:0x0040), top: B:39:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: ClassCastException -> 0x0085, TryCatch #0 {ClassCastException -> 0x0085, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004c, B:24:0x0054, B:29:0x006b, B:31:0x0073, B:33:0x007b, B:27:0x005f, B:20:0x0040), top: B:39:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L85
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.w9     // Catch: java.lang.ClassCastException -> L85
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L85
            if (r1 > 0) goto L85
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.w9     // Catch: java.lang.ClassCastException -> L85
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L85
            if (r1 <= 0) goto L18
            goto L85
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.mb     // Catch: java.lang.ClassCastException -> L85
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L85
            java.util.ArrayList r2 = r4.EQ()     // Catch: java.lang.ClassCastException -> L85
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L85
            if (r1 != r2) goto L85
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.mb     // Catch: java.lang.ClassCastException -> L85
            java.util.ArrayList r2 = r4.EQ()     // Catch: java.lang.ClassCastException -> L85
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L85
            if (r1 != 0) goto L35
            goto L85
        L35:
            android.accounts.Account r1 = r3.jw     // Catch: java.lang.ClassCastException -> L85
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.n5()     // Catch: java.lang.ClassCastException -> L85
            if (r1 != 0) goto L85
            goto L4c
        L40:
            android.accounts.Account r1 = r3.jw     // Catch: java.lang.ClassCastException -> L85
            android.accounts.Account r2 = r4.n5()     // Catch: java.lang.ClassCastException -> L85
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L85
            if (r1 == 0) goto L85
        L4c:
            java.lang.String r1 = r3.zh     // Catch: java.lang.ClassCastException -> L85
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L85
            if (r1 == 0) goto L5f
            java.lang.String r1 = r4.J8()     // Catch: java.lang.ClassCastException -> L85
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L85
            if (r1 == 0) goto L85
            goto L6b
        L5f:
            java.lang.String r1 = r3.zh     // Catch: java.lang.ClassCastException -> L85
            java.lang.String r2 = r4.J8()     // Catch: java.lang.ClassCastException -> L85
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L85
            if (r1 == 0) goto L85
        L6b:
            boolean r1 = r3.k2     // Catch: java.lang.ClassCastException -> L85
            boolean r2 = r4.Ws()     // Catch: java.lang.ClassCastException -> L85
            if (r1 != r2) goto L85
            boolean r1 = r3.fY     // Catch: java.lang.ClassCastException -> L85
            boolean r2 = r4.QX()     // Catch: java.lang.ClassCastException -> L85
            if (r1 != r2) goto L85
            boolean r1 = r3.qp     // Catch: java.lang.ClassCastException -> L85
            boolean r4 = r4.aM()     // Catch: java.lang.ClassCastException -> L85
            if (r1 != r4) goto L85
            r4 = 1
            return r4
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public ArrayList<GoogleSignInOptionsExtensionParcelable> gn() {
        return this.w9;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.mb;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.gn());
        }
        Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.a aVar = new com.google.android.gms.auth.api.signin.internal.a();
        aVar.j6(arrayList);
        aVar.j6(this.jw);
        aVar.j6(this.zh);
        aVar.FH(this.k2);
        aVar.FH(this.fY);
        aVar.FH(this.qp);
        return aVar.DW();
    }

    public Account n5() {
        return this.jw;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.U2(parcel, 2, EQ(), false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 3, n5(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 4, QX());
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 5, aM());
        com.google.android.gms.common.internal.safeparcel.b.FH(parcel, 6, Ws());
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 7, J8(), false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 8, this.AL, false);
        com.google.android.gms.common.internal.safeparcel.b.U2(parcel, 9, gn(), false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.WB = i;
        this.mb = arrayList;
        this.jw = account;
        this.fY = z;
        this.qp = z2;
        this.k2 = z3;
        this.zh = str;
        this.AL = str2;
        this.w9 = new ArrayList<>(map.values());
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, b bVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }
}
