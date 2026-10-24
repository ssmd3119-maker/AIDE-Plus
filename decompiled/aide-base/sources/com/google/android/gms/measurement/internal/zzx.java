package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzx {
    static void zza(zzas zzasVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        if (zzasVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!zza(zzasVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            if (zzasVar == null) {
                throw new IllegalArgumentException("Monitor must not be null");
            }
            Set<String> setZzb = zzb(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!setZzb.remove(str4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!setZzb.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (setZzb.isEmpty()) {
                return;
            }
            zzasVar.zzjj().zze("Table has extra columns. table, columns", str, TextUtils.join(", ", setZzb));
        } catch (SQLiteException e) {
            zzasVar.zzjg().zzg("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    private static Set<String> zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    private static boolean zza(zzas zzasVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzasVar != null) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME}, "name=?", new String[]{str}, null, null, null);
                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return zMoveToFirst;
                } catch (SQLiteException e) {
                    zzasVar.zzjj().zze("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    static void zza(zzas zzasVar, SQLiteDatabase sQLiteDatabase) {
        if (zzasVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzasVar.zzjj().zzby("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzasVar.zzjj().zzby("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzasVar.zzjj().zzby("Failed to turn on database read permission for owner");
            }
            if (file.setWritable(true, true)) {
                return;
            }
            zzasVar.zzjj().zzby("Failed to turn on database write permission for owner");
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
