package tv.ouya.console.api;

import abcd.wq0;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private Receipt j6(wq0 wq0Var, JSONObject jSONObject) throws JSONException {
        Date date;
        Date date2 = jSONObject.has("purchaseDate") ? new Date(jSONObject.getLong("purchaseDate")) : wq0Var.parse(jSONObject.getString("date"));
        if (jSONObject.has("generateDate")) {
            date = new Date(jSONObject.getLong("generateDate"));
        } else {
            Date date3 = new Date();
            date3.setTime(0L);
            date = date3;
        }
        String strOptString = jSONObject.optString("identifier");
        if (strOptString.isEmpty()) {
            strOptString = jSONObject.getString("sku");
        }
        return new Receipt(strOptString, jSONObject.optInt("priceInCents", 0), date2, date, jSONObject.getString("gamer"), jSONObject.getString("uuid"), jSONObject.optDouble("localPrice", 0.0d), jSONObject.optString("currency", "USD"));
    }

    public List<Receipt> DW(JSONObject jSONObject, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (!jSONObject.has("key") || !jSONObject.has("iv") || !jSONObject.has("blob")) {
            throw new RuntimeException("Invalid response from server");
        }
        byte[] bArrDecode = Base64.decode(jSONObject.getString("key").trim(), 0);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "BC");
        cipher.init(2, publicKey);
        SecretKeySpec secretKeySpec = new SecretKeySpec(cipher.doFinal(bArrDecode), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(jSONObject.getString("iv").trim(), 0));
        byte[] bArrDecode2 = Base64.decode(jSONObject.getString("blob").trim(), 0);
        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher2.init(2, secretKeySpec, ivParameterSpec);
        return FH(new JSONObject(new String(cipher2.doFinal(bArrDecode2), "UTF-8")).getJSONArray("purchases"));
    }

    public List<Receipt> FH(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        wq0 wq0Var = new wq0();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(j6(wq0Var, jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
