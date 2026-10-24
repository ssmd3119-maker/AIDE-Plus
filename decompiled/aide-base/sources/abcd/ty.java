package abcd;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.util.Base64;
import com.android.vending.billing.IInAppBillingService;
import com.google.android.gms.measurement.AppMeasurement;
import com.probelytics.api.InAppProduct;
import com.probelytics.api.Market;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ty {
    private static IntentSender DW;
    private static String FH;
    private static IInAppBillingService Hw;
    private static ServiceConnection VH;
    private static ThreadPoolExecutor Zo;
    private static Map<String, e> j6 = new HashMap();
    private static Object v5 = new Object();

    static class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (ty.v5) {
                try {
                    IInAppBillingService unused = ty.Hw = IInAppBillingService.Sub.asInterface(iBinder);
                } catch (Throwable unused2) {
                    b00.j6("InAppBilling", "Failed to initialize");
                }
            }
            ty.j3();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (ty.v5) {
                IInAppBillingService unused = ty.Hw = null;
            }
        }
    }

    static class b implements Runnable {
        private void DW(String str) {
            try {
                synchronized (ty.v5) {
                    if (ty.Hw == null) {
                        return;
                    }
                    j6(ty.Hw.nf(3, iy.DW().getPackageName(), str, null), "subs".equals(str));
                }
            } catch (DeadObjectException e) {
                b00.DW("InAppBilling", "Dead object", e);
            } catch (Exception e2) {
                b00.VH("InAppBilling", e2);
            }
        }

        private void j6(Bundle bundle, boolean z) {
            if (d.DW(bundle.getInt("RESPONSE_CODE")) != d.RESULT_OK || ty.gn()) {
                return;
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            for (int i = 0; i < stringArrayList.size(); i++) {
                ty.XL(stringArrayList.get(i), stringArrayList2.get(i), z);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            DW("inapp");
            DW("subs");
        }
    }

    private static class c {
        public long DW;
        public String j6;

        public c(String str, String str2, String str3, long j, String str4, String str5) {
            this.j6 = str3;
            this.DW = j;
        }
    }

    private enum d {
        RESULT_OK,
        RESULT_USER_CANCELED,
        RESULT_SERVICE_UNAVAILABLE,
        RESULT_BILLING_UNAVAILABLE,
        RESULT_ITEM_UNAVAILABLE,
        RESULT_DEVELOPER_ERROR,
        RESULT_ERROR,
        RESULT_ITEM_ALREADY_OWNED,
        RESULT_ITEM_NOT_OWNED;

        /* JADX INFO: Access modifiers changed from: private */
        public static d DW(int i) {
            d[] dVarArrValues = values();
            return (i < 0 || i >= dVarArrValues.length) ? RESULT_ERROR : dVarArrValues[i];
        }
    }

    private static class e {
        public final long DW;
        public final String FH;
        public final String j6;

        public e(String str, String str2, String str3, String str4, String str5, long j, String str6) {
            this.j6 = str;
            this.DW = j;
            this.FH = str6;
        }
    }

    public static void EQ(Object obj, int i, int i2, Intent intent) {
        if ((obj instanceof Activity) && intent != null && intent.hasExtra("RESPONSE_CODE") && intent.hasExtra("INAPP_PURCHASE_DATA") && intent.hasExtra("INAPP_DATA_SIGNATURE")) {
            d dVarDW = d.DW(intent.getIntExtra("RESPONSE_CODE", 0));
            b00.j6("InAppBilling", "onActivityResult " + dVarDW);
            if (dVarDW == d.RESULT_OK) {
                String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
                String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
                if (gn()) {
                    return;
                }
                XL(stringExtra, stringExtra2, false);
            }
        }
    }

    private static void J0(Activity activity, IntentSender intentSender, int i) {
        if (intentSender == null || !intentSender.equals(DW)) {
            return;
        }
        py.U2(u7(System.currentTimeMillis(), FH, false));
    }

    public static void J8(Bundle bundle, Object obj, int i, String str, String str2, String str3, String str4) {
        if (d.DW(bundle.getInt("RESPONSE_CODE")) == d.RESULT_OK) {
            DW = ((PendingIntent) bundle.getParcelable("BUY_INTENT")).getIntentSender();
            FH = str2;
        }
    }

    public static void QX(Object obj, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (obj instanceof Activity) {
            J0((Activity) obj, intentSender, i);
        }
    }

    private static void VH(Bundle bundle) throws JSONException {
        ArrayList<String> stringArrayList;
        try {
            if (d.DW(bundle.getInt("RESPONSE_CODE")) != d.RESULT_OK || (stringArrayList = bundle.getStringArrayList("DETAILS_LIST")) == null) {
                return;
            }
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject(it.next());
                String string = jSONObject.getString(AppMeasurement.Param.TYPE);
                String string2 = jSONObject.getString("productId");
                j6.put(string2, new e(string, string2, jSONObject.getString("title"), jSONObject.getString("description"), jSONObject.getString("price"), jSONObject.getLong("price_amount_micros"), jSONObject.getString("price_currency_code")));
            }
        } catch (JSONException unused) {
        }
    }

    public static void Ws(Bundle bundle, Object obj, int i, String str, String str2, Bundle bundle2) throws JSONException {
        VH(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void XL(String str, String str2, boolean z) {
        c cVarTp = tp(str);
        if (cVarTp != null) {
            py.a8(cVarTp.DW, u7(cVarTp.DW, cVarTp.j6, z));
        }
    }

    public static void aM() {
        j3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean gn() {
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(iy.DW().getPackageManager().getPackageInfo(iy.DW().getPackageName(), 64).signatures[0].toByteArray()))).getPublicKey();
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update("xxx".getBytes());
            return signature.verify(Base64.decode("xxx", 0));
        } catch (Throwable th) {
            b00.VH("Verify check error", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j3() {
        try {
            if (Zo != null) {
                Zo.execute(new b());
            }
        } catch (Throwable th) {
            b00.VH("InAppBilling", th);
        }
    }

    private static c tp(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.getInt("purchaseState");
            String string = jSONObject.getString("productId");
            String string2 = jSONObject.getString("packageName");
            long j = jSONObject.getLong("purchaseTime");
            return new c(jSONObject.optString("orderId"), string2, string, j, jSONObject.optString("developerPayload", null), jSONObject.getString("purchaseToken"));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static InAppProduct u7(long j, String str, boolean z) {
        e eVar = j6.get(str);
        return (eVar == null || j <= System.currentTimeMillis() - 86400000) ? new InAppProduct(new Market("com.android.vending"), str, z, 0L, null) : new InAppProduct(new Market("com.android.vending"), str, "subs".equals(eVar.j6), eVar.DW, eVar.FH);
    }

    public static void we() {
        if (by.j6().FH()) {
            try {
                Zo = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                VH = new a();
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                iy.DW().bindService(intent, VH, 1);
            } catch (Throwable unused) {
                b00.j6("InAppBilling", "Failed to initialize");
            }
        }
    }
}
