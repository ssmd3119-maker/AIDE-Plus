package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();
    private static e n5 = h.Hw();
    private long AL;
    private final int WB;
    private Set<Scope> Z1 = new HashSet();
    private String cT;
    private String fY;
    private List<Scope> hK;
    private String jw;
    private Uri k2;
    private String mb;
    private String q7;
    private String qp;
    private String w9;
    private String zh;

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.WB = i;
        this.mb = str;
        this.jw = str2;
        this.fY = str3;
        this.qp = str4;
        this.k2 = uri;
        this.zh = str5;
        this.AL = j;
        this.w9 = str6;
        this.hK = list;
        this.cT = str7;
        this.q7 = str8;
    }

    private static GoogleSignInAccount er(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long jLongValue = (l == null ? Long.valueOf(n5.j6() / 1000) : l).longValue();
        p.v5(str7);
        p.u7(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, jLongValue, str7, new ArrayList(set), str5, str6);
    }

    public static GoogleSignInAccount lg(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountEr = er(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountEr.zh = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccountEr;
    }

    public String EQ() {
        return this.fY;
    }

    public String J8() {
        return this.q7;
    }

    public Set<Scope> Mr() {
        HashSet hashSet = new HashSet(this.hK);
        hashSet.addAll(this.Z1);
        return hashSet;
    }

    public String QX() {
        return this.mb;
    }

    public String Ws() {
        return this.cT;
    }

    public String a8() {
        return this.zh;
    }

    public String aM() {
        return this.jw;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.w9.equals(this.w9) && googleSignInAccount.Mr().equals(Mr());
    }

    public String gn() {
        return this.qp;
    }

    public int hashCode() {
        return ((this.w9.hashCode() + 527) * 31) + Mr().hashCode();
    }

    public Uri j3() {
        return this.k2;
    }

    public Account n5() {
        if (this.fY == null) {
            return null;
        }
        return new Account(this.fY, "com.google");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 2, QX(), false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 3, aM(), false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 4, EQ(), false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 5, gn(), false);
        com.google.android.gms.common.internal.safeparcel.b.QX(parcel, 6, j3(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 7, a8(), false);
        com.google.android.gms.common.internal.safeparcel.b.J0(parcel, 8, this.AL);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 9, this.w9, false);
        com.google.android.gms.common.internal.safeparcel.b.U2(parcel, 10, this.hK, false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 11, Ws(), false);
        com.google.android.gms.common.internal.safeparcel.b.XL(parcel, 12, J8(), false);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
    }
}
