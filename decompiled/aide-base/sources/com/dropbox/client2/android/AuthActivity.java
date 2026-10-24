package com.dropbox.client2.android;

import abcd.iy;
import abcd.st;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class AuthActivity extends Activity {
    private static String Z1;
    private static String cT;
    private static String hK;
    private String WB;
    private String fY;
    private String jw;
    private String mb;
    private String qp = null;
    private static final String k2 = AuthActivity.class.getName();
    private static c zh = new a();
    private static final Object AL = new Object();
    public static Intent w9 = null;
    private static String q7 = "www.dropbox.com";
    private static final String[] n5 = {"308202223082018b02044bd207bd300d06092a864886f70d01010405003058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d65796572301e170d3130303432333230343930315a170d3430303431353230343930315a3058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d6579657230819f300d06092a864886f70d010101050003818d0030818902818100ac1595d0ab278a9577f0ca5a14144f96eccde75f5616f36172c562fab0e98c48ad7d64f1091c6cc11ce084a4313d522f899378d312e112a748827545146a779defa7c31d8c00c2ed73135802f6952f59798579859e0214d4e9c0554b53b26032a4d2dfc2f62540d776df2ea70e2a6152945fb53fef5bac5344251595b729d4810203010001300d06092a864886f70d01010405000381810055c425d94d036153203dc0bbeb3516f94563b102fff39c3d4ed91278db24fc4424a244c2e59f03bbfea59404512b8bf74662f2a32e37eafa2ac904c31f99cfc21c9ff375c977c432d3b6ec22776f28767d0f292144884538c3d5669b568e4254e4ed75d9054f75229ac9d4ccd0b7c3c74a34f07b7657083b2aa76225c0c56ffc", "308201e53082014ea00302010202044e17e115300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3131303730393035303331375a170d3431303730313035303331375a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d003081890281810096759fe5abea6a0757039b92adc68d672efa84732c3f959408e12efa264545c61f23141026a6d01eceeeaa13ec7087087e5894a3363da8bf5c69ed93657a6890738a80998e4ca22dc94848f30e2d0e1890000ae2cddf543b20c0c3828deca6c7944b5ecd21a9d18c988b2b3e54517dafbc34b48e801bb1321e0fa49e4d575d7f0203010001300d06092a864886f70d0101050500038181002b6d4b65bcfa6ec7bac97ae6d878064d47b3f9f8da654995b8ef4c385bc4fbfbb7a987f60783ef0348760c0708acd4b7e63f0235c35a4fbcd5ec41b3b4cb295feaa7d5c27fa562a02562b7e1f4776b85147be3e295714986c4a9a07183f48ea09ae4d3ea31b88d0016c65b93526b9c45f2967c3d28dee1aff5a5b29b9c2c8639"};

    static class a implements c {
        a() {
        }

        @Override // com.dropbox.client2.android.AuthActivity.c
        public SecureRandom j6() {
            return new SecureRandom();
        }
    }

    static class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public interface c {
        SecureRandom j6();
    }

    private void DW(Intent intent) {
        w9 = intent;
        this.qp = null;
        finish();
    }

    private void EQ(String str) {
        Locale locale = Locale.getDefault();
        j6(this, new Intent("android.intent.action.VIEW", Uri.parse(st.j6(this.jw, 1, "/connect", new String[]{"locale", locale.getLanguage() + "_" + locale.getCountry(), "k", this.WB, "s", v5(), "api", this.fY, "state", str}))));
    }

    public static boolean FH(Context context, String str, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String str2 = "db-" + str;
        intent.setData(Uri.parse(str2 + "://1/connect"));
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.size() == 0) {
            throw new IllegalStateException("URI scheme in your app's manifest is not set up correctly. You should have a " + AuthActivity.class.getName() + " with the scheme: " + str2);
        }
        if (listQueryIntentActivities.size() > 1) {
            if (z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Security alert");
                builder.setMessage("Another app on your phone may be trying to pose as the app you are currently using. The malicious app can't access your account, but linking to Dropbox has been disabled as a precaution. Please contact support@dropbox.com.");
                builder.setPositiveButton("OK", new b());
                builder.show();
            } else {
                Log.w(k2, "There are multiple apps registered for the AuthActivity URI scheme (" + str2 + ").  Another app may be trying to  impersonate this app, so authentication will be disabled.");
            }
            return false;
        }
        ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
        if (resolveInfo != null && resolveInfo.activityInfo != null && context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
            return true;
        }
        throw new IllegalStateException("There must be a " + AuthActivity.class.getName() + " within your app's package registered for your URI scheme (" + str2 + "). However, it appears that an activity in a different package is registered for that scheme instead. If you have multiple apps that all want to use the same accesstoken pair, designate one of them to do authentication and have the other apps launch it and then retrieve the token pair from it.");
    }

    private String Hw() {
        byte[] bArr = new byte[16];
        Zo().nextBytes(bArr);
        StringBuilder sb = new StringBuilder();
        if (this.mb == null) {
            sb.append("oauth2:");
        }
        for (int i = 0; i < 16; i++) {
            sb.append(String.format("%02x", Integer.valueOf(bArr[i] & 255)));
        }
        return sb.toString();
    }

    private static c VH() {
        c cVar;
        synchronized (AL) {
            cVar = zh;
        }
        return cVar;
    }

    private static SecureRandom Zo() {
        c cVarVH = VH();
        return cVarVH != null ? cVarVH.j6() : new SecureRandom();
    }

    private boolean gn(Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || 1 != listQueryIntentActivities.size() || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) == null) {
            return false;
        }
        try {
            for (Signature signature : packageManager.getPackageInfo(resolveInfoResolveActivity.activityInfo.packageName, 64).signatures) {
                for (String str : n5) {
                    if (str.equals(signature.toCharsString())) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((AuthActivity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    static void tp(String str, String str2, String str3, String str4) {
        hK = str;
        cT = str2;
        if (str3 == null) {
            str3 = "www.dropbox.com";
        }
        q7 = str3;
        Z1 = str4;
    }

    static void u7(String str, String str2) {
        tp(str, str2, null, null);
    }

    private String v5() throws NoSuchAlgorithmException {
        if (this.mb == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(this.mb.getBytes(), 0, this.mb.length());
            return String.format("%1$040X", new BigInteger(1, messageDigest.digest())).substring(32);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (bundle == null) {
            w9 = null;
            this.qp = null;
            this.WB = hK;
            this.mb = cT;
            this.jw = q7;
            this.fY = Z1;
        } else {
            this.qp = bundle.getString("SIS_KEY_AUTH_STATE_NONCE");
        }
        u7(null, null);
        setTheme(R.style.Theme.Translucent.NoTitleBar);
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onNewIntent(android.content.Intent r10) {
        /*
            r9 = this;
            abcd.iy.XL(r9, r10)
            java.lang.String r0 = r9.qp
            r1 = 0
            if (r0 != 0) goto Lc
            r9.DW(r1)
            return
        Lc:
            java.lang.String r0 = "ACCESS_TOKEN"
            boolean r2 = r10.hasExtra(r0)
            java.lang.String r3 = "UID"
            java.lang.String r4 = "ACCESS_SECRET"
            if (r2 == 0) goto L2b
            java.lang.String r2 = r10.getStringExtra(r0)
            java.lang.String r5 = r10.getStringExtra(r4)
            java.lang.String r6 = r10.getStringExtra(r3)
            java.lang.String r7 = "AUTH_STATE"
            java.lang.String r10 = r10.getStringExtra(r7)
            goto L63
        L2b:
            android.net.Uri r10 = r10.getData()
            if (r10 == 0) goto L5f
            java.lang.String r2 = r10.getPath()
            java.lang.String r5 = "/connect"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L5f
            java.lang.String r2 = "oauth_token"
            java.lang.String r2 = r10.getQueryParameter(r2)     // Catch: java.lang.UnsupportedOperationException -> L5a
            java.lang.String r5 = "oauth_token_secret"
            java.lang.String r5 = r10.getQueryParameter(r5)     // Catch: java.lang.UnsupportedOperationException -> L58
            java.lang.String r6 = "uid"
            java.lang.String r6 = r10.getQueryParameter(r6)     // Catch: java.lang.UnsupportedOperationException -> L56
            java.lang.String r7 = "state"
            java.lang.String r10 = r10.getQueryParameter(r7)     // Catch: java.lang.UnsupportedOperationException -> L5d
            goto L63
        L56:
            r6 = r1
            goto L5d
        L58:
            r5 = r1
            goto L5c
        L5a:
            r2 = r1
            r5 = r2
        L5c:
            r6 = r5
        L5d:
            r10 = r1
            goto L63
        L5f:
            r10 = r1
            r2 = r10
            r5 = r2
            r6 = r5
        L63:
            if (r2 == 0) goto L9f
            java.lang.String r7 = ""
            boolean r8 = r2.equals(r7)
            if (r8 != 0) goto L9f
            if (r5 == 0) goto L75
            boolean r8 = r5.equals(r7)
            if (r8 != 0) goto L9f
        L75:
            if (r6 == 0) goto L9f
            boolean r8 = r6.equals(r7)
            if (r8 != 0) goto L9f
            if (r10 == 0) goto L9f
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L9f
            java.lang.String r7 = r9.qp
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L91
            r9.DW(r1)
            return
        L91:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r0, r2)
            r1.putExtra(r4, r5)
            r1.putExtra(r3, r6)
        L9f:
            r9.DW(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.client2.android.AuthActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (isFinishing()) {
            return;
        }
        if (this.qp != null || this.WB == null) {
            DW(null);
            return;
        }
        w9 = null;
        String strHw = Hw();
        Intent intent = new Intent();
        intent.setPackage("com.dropbox.android");
        intent.setAction("com.dropbox.android.AUTHENTICATE_V2");
        intent.putExtra("CONSUMER_KEY", this.WB);
        intent.putExtra("CONSUMER_SIG", v5());
        intent.putExtra("CALLING_PACKAGE", getPackageName());
        intent.putExtra("CALLING_CLASS", AuthActivity.class.getName());
        intent.putExtra("AUTH_STATE", strHw);
        if (gn(intent)) {
            j6(this, intent);
        } else {
            EQ(strHw);
        }
        this.qp = strHw;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("SIS_KEY_AUTH_STATE_NONCE", this.qp);
    }
}
