package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaw {
    private final Context DW;
    private final w0 FH;
    private final Map<String, x0> Hw;
    private final SharedPreferences j6;

    public zzaw(Context context) {
        this(context, new w0());
    }

    private static String DW(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    static String VH(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private final synchronized boolean j6() {
        return this.j6.getAll().isEmpty();
    }

    public final synchronized void FH(String str, String str2, String str3, String str4, String str5) {
        String strDW = x.DW(str4, str5, System.currentTimeMillis());
        if (strDW == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.j6.edit();
        editorEdit.putString(DW(str, str2, str3), strDW);
        editorEdit.commit();
    }

    public final synchronized String Hw() {
        return this.j6.getString("topic_operaion_queue", "");
    }

    public final synchronized x Zo(String str, String str2, String str3) {
        return x.FH(this.j6.getString(DW(str, str2, str3), null));
    }

    public final synchronized void gn(String str) {
        this.j6.edit().putString("topic_operaion_queue", str).apply();
    }

    public final synchronized void tp(String str) {
        String strConcat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor editorEdit = this.j6.edit();
        for (String str2 : this.j6.getAll().keySet()) {
            if (str2.startsWith(strConcat)) {
                editorEdit.remove(str2);
            }
        }
        editorEdit.commit();
    }

    public final synchronized x0 u7(String str) {
        x0 x0VarJ0;
        x0 x0Var = this.Hw.get(str);
        if (x0Var != null) {
            return x0Var;
        }
        try {
            x0VarJ0 = this.FH.EQ(this.DW, str);
        } catch (d unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.DW().er();
            x0VarJ0 = this.FH.J0(this.DW, str);
        }
        this.Hw.put(str, x0VarJ0);
        return x0VarJ0;
    }

    public final synchronized void v5() {
        this.Hw.clear();
        w0.v5(this.DW);
        this.j6.edit().clear().commit();
    }

    private zzaw(Context context, w0 w0Var) {
        this.Hw = new ArrayMap();
        this.DW = context;
        this.j6 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.FH = w0Var;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.DW), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || j6()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            v5();
            FirebaseInstanceId.DW().er();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }
}
