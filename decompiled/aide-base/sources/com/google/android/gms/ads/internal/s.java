package com.google.android.gms.ads.internal;

import abcd.wu;
import abcd.xu;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.f2;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.lw;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.wa;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.za;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class s {
    private static String DW(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            xp.u7("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strValueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return strValueOf.length() != 0 ? "data:image/png;base64,".concat(strValueOf) : new String("data:image/png;base64,");
    }

    private static String FH(f2 f2Var) {
        if (f2Var == null) {
            xp.u7("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri uriJm = f2Var.Jm();
            if (uriJm != null) {
                return uriJm.toString();
            }
        } catch (RemoteException unused) {
            xp.u7("Unable to get image uri. Trying data uri next");
        }
        return gn(f2Var);
    }

    private static JSONObject Hw(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (bundle.containsKey(next)) {
                    if ("image".equals(jSONObject2.getString(next))) {
                        Object obj = bundle.get(next);
                        if (obj instanceof Bitmap) {
                            jSONObject.put(next, DW((Bitmap) obj));
                        } else {
                            xp.u7("Invalid type. An image type extra should return a bitmap");
                        }
                    } else if (bundle.get(next) instanceof Bitmap) {
                        xp.u7("Invalid asset type. Bitmap should be returned only for image type");
                    } else {
                        jSONObject.put(next, String.valueOf(bundle.get(next)));
                    }
                }
            }
        }
        return jSONObject;
    }

    private static f2 J0(Object obj) {
        if (obj instanceof IBinder) {
            return g2.Mt((IBinder) obj);
        }
        return null;
    }

    public static boolean VH(final cv cvVar, aa aaVar, CountDownLatch countDownLatch) {
        boolean z = false;
        try {
            View view = cvVar.getView();
            if (view == null) {
                xp.u7("AdWebView is null");
            } else {
                view.setVisibility(4);
                List<String> list = aaVar.DW.aM;
                if (list == null || list.isEmpty()) {
                    xp.u7("No template ids present in mediation response");
                } else {
                    cvVar.sh("/nativeExpressAssetsLoaded", new v(countDownLatch));
                    cvVar.sh("/nativeExpressAssetsLoadingFailed", new w(countDownLatch));
                    wa waVarSM = aaVar.FH.sM();
                    za zaVarE3 = aaVar.FH.e3();
                    if (list.contains("2") && waVarSM != null) {
                        final com.google.android.gms.internal.ads.v0 v0Var = new com.google.android.gms.internal.ads.v0(waVarSM.FH(), waVarSM.DW(), waVarSM.gn(), waVarSM.j3(), waVarSM.Zo(), waVarSM.a8(), waVarSM.yS(), waVarSM.aM(), null, waVarSM.tp(), null, waVarSM.ro() != null ? (View) xu.g3(waVarSM.ro()) : null, waVarSM.v5(), null);
                        final String str = aaVar.DW.XL;
                        cvVar.AF().J8(new lw(v0Var, str, cvVar) { // from class: com.google.android.gms.ads.internal.t
                            private final com.google.android.gms.internal.ads.v0 WB;
                            private final cv jw;
                            private final String mb;

                            {
                                this.WB = v0Var;
                                this.mb = str;
                                this.jw = cvVar;
                            }

                            @Override // com.google.android.gms.internal.ads.lw
                            public final void j6(boolean z2) throws JSONException {
                                s.v5(this.WB, this.mb, this.jw, z2);
                            }
                        });
                    } else if (!list.contains("1") || zaVarE3 == null) {
                        xp.u7("No matching template id and mapper");
                    } else {
                        final com.google.android.gms.internal.ads.x0 x0Var = new com.google.android.gms.internal.ads.x0(zaVarE3.FH(), zaVarE3.DW(), zaVarE3.gn(), zaVarE3.TI(), zaVarE3.Zo(), zaVarE3.er(), null, zaVarE3.tp(), null, zaVarE3.ro() != null ? (View) xu.g3(zaVarE3.ro()) : null, zaVarE3.v5(), null);
                        final String str2 = aaVar.DW.XL;
                        cvVar.AF().J8(new lw(x0Var, str2, cvVar) { // from class: com.google.android.gms.ads.internal.u
                            private final com.google.android.gms.internal.ads.x0 WB;
                            private final cv jw;
                            private final String mb;

                            {
                                this.WB = x0Var;
                                this.mb = str2;
                                this.jw = cvVar;
                            }

                            @Override // com.google.android.gms.internal.ads.lw
                            public final void j6(boolean z2) throws JSONException {
                                s.Zo(this.WB, this.mb, this.jw, z2);
                            }
                        });
                    }
                    String str3 = aaVar.DW.Ws;
                    String str4 = aaVar.DW.QX;
                    if (str4 != null) {
                        cvVar.loadDataWithBaseURL(str4, str3, "text/html", "UTF-8", null);
                    } else {
                        cvVar.loadData(str3, "text/html", "UTF-8");
                    }
                    z = true;
                }
            }
        } catch (RemoteException e) {
            xp.v5("Unable to invoke load assets", e);
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    static final /* synthetic */ void Zo(com.google.android.gms.internal.ads.x0 x0Var, String str, cv cvVar, boolean z) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", x0Var.FH());
            jSONObject.put("body", x0Var.gn());
            jSONObject.put("call_to_action", x0Var.Zo());
            jSONObject.put("advertiser", x0Var.er());
            jSONObject.put("logo", FH(x0Var.TI()));
            JSONArray jSONArray = new JSONArray();
            List listDW = x0Var.DW();
            if (listDW != null) {
                Iterator it = listDW.iterator();
                while (it.hasNext()) {
                    jSONArray.put(FH(J0(it.next())));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", Hw(x0Var.tp(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            cvVar.tp("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            xp.v5("Exception occurred when loading assets", e);
        }
    }

    private static String gn(f2 f2Var) {
        try {
            wu wuVarK0 = f2Var.K0();
            if (wuVarK0 == null) {
                xp.u7("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) xu.g3(wuVarK0);
            if (drawable instanceof BitmapDrawable) {
                return DW(((BitmapDrawable) drawable).getBitmap());
            }
            xp.u7("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException unused) {
            xp.u7("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    static com.google.android.gms.ads.internal.gmsg.b0<cv> j6(wa waVar, za zaVar, c cVar) {
        return new x(waVar, cVar, zaVar);
    }

    public static View tp(yl ylVar) {
        cv cvVar;
        if (ylVar == null) {
            xp.j6("AdState is null");
            return null;
        }
        if (we(ylVar) && (cvVar = ylVar.DW) != null) {
            return cvVar.getView();
        }
        try {
            wu wuVarAn = ylVar.XL != null ? ylVar.XL.An() : null;
            if (wuVarAn != null) {
                return (View) xu.g3(wuVarAn);
            }
            xp.u7("View in mediation adapter is null.");
            return null;
        } catch (RemoteException e) {
            xp.v5("Could not get View from mediation adapter.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u7(cv cvVar) {
        View.OnClickListener onClickListener = cvVar.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(cvVar.getView());
        }
    }

    static final /* synthetic */ void v5(com.google.android.gms.internal.ads.v0 v0Var, String str, cv cvVar, boolean z) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", v0Var.FH());
            jSONObject.put("body", v0Var.gn());
            jSONObject.put("call_to_action", v0Var.Zo());
            jSONObject.put("price", v0Var.aM());
            jSONObject.put("star_rating", String.valueOf(v0Var.a8()));
            jSONObject.put("store", v0Var.yS());
            jSONObject.put("icon", FH(v0Var.j3()));
            JSONArray jSONArray = new JSONArray();
            List listDW = v0Var.DW();
            if (listDW != null) {
                Iterator it = listDW.iterator();
                while (it.hasNext()) {
                    jSONArray.put(FH(J0(it.next())));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", Hw(v0Var.tp(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            cvVar.tp("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            xp.v5("Exception occurred when loading assets", e);
        }
    }

    public static boolean we(yl ylVar) {
        t9 t9Var;
        return (ylVar == null || !ylVar.Ws || (t9Var = ylVar.QX) == null || t9Var.Ws == null) ? false : true;
    }
}
