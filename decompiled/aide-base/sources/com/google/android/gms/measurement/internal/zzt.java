package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzt extends zzfn {
    private static final String[] zzagz = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    private static final String[] zzaha = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzahb = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"};
    private static final String[] zzahc = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzahd = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzahe = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzw zzahf;
    private final zzfj zzahg;

    zzt(zzfo zzfoVar) {
        super(zzfoVar);
        this.zzahg = new zzfj(zzbx());
        this.zzahf = new zzw(this, getContext(), "google_app_measurement.db");
    }

    private final long zza(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = getWritableDatabase().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean zzip() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    public final void beginTransaction() {
        zzcl();
        getWritableDatabase().beginTransaction();
    }

    public final void endTransaction() {
        zzcl();
        getWritableDatabase().endTransaction();
    }

    final SQLiteDatabase getWritableDatabase() {
        zzaf();
        try {
            return this.zzahf.getWritableDatabase();
        } catch (SQLiteException e) {
            zzgt().zzjj().zzg("Error opening database", e);
            throw e;
        }
    }

    public final void setTransactionSuccessful() {
        zzcl();
        getWritableDatabase().setTransactionSuccessful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzad(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4.zzaf()
            r4.zzcl()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.zzas r6 = r4.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzau r6 = r6.zzjo()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zzby(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.zzas r1 = r4.zzgt()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzau r1 = r1.zzjg()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.zzg(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzad(long):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        zzgt().zzjg().zzg("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzfx> zzb(java.lang.String r22, java.lang.String r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzfx> zzbl(java.lang.String r23) throws java.lang.Throwable {
        /*
            r22 = this;
            com.google.android.gms.common.internal.p.v5(r23)
            r22.zzaf()
            r22.zzcl()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.getWritableDatabase()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r6[r11] = r23     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L48
            if (r2 == 0) goto L47
            r2.close()
        L47:
            return r0
        L48:
            java.lang.String r18 = r2.getString(r11)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L54
            java.lang.String r3 = ""
        L54:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            r3 = r22
            java.lang.Object r21 = r3.zza(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r21 != 0) goto L74
            com.google.android.gms.measurement.internal.zzas r4 = r22.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzau r4 = r4.zzjg()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzas.zzbw(r23)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r4.zzg(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            goto L7f
        L74:
            com.google.android.gms.measurement.internal.zzfx r4 = new com.google.android.gms.measurement.internal.zzfx     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r0.add(r4)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
        L7f:
            boolean r4 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r4 != 0) goto L48
            if (r2 == 0) goto L8a
            r2.close()
        L8a:
            return r0
        L8b:
            r0 = move-exception
            goto L9d
        L8d:
            r0 = move-exception
            r3 = r22
            goto Lb5
        L91:
            r0 = move-exception
            r3 = r22
            goto L9d
        L95:
            r0 = move-exception
            r3 = r22
            goto Lb6
        L99:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L9d:
            com.google.android.gms.measurement.internal.zzas r4 = r22.zzgt()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzau r4 = r4.zzjg()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzas.zzbw(r23)     // Catch: java.lang.Throwable -> Lb4
            r4.zze(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb3
            r2.close()
        Lb3:
            return r1
        Lb4:
            r0 = move-exception
        Lb5:
            r1 = r2
        Lb6:
            if (r1 == 0) goto Lbb
            r1.close()
        Lbb:
            goto Lbd
        Lbc:
            throw r0
        Lbd:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzbl(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzg zzbm(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzbm(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    public final long zzbn(String str) {
        p.v5(str);
        zzaf();
        zzcl();
        try {
            return getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zzgv().zzb(str, zzai.zzajj))))});
        } catch (SQLiteException e) {
            zzgt().zzjg().zze("Error deleting over the limit events. appId", zzas.zzbw(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zzbo(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.p.v5(r12)
            r11.zzaf()
            r11.zzcl()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.getWritableDatabase()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r6[r9] = r12     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r2 != 0) goto L37
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r3 == 0) goto L52
            com.google.android.gms.measurement.internal.zzas r3 = r11.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzau r3 = r3.zzjg()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzas.zzbw(r12)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            r3.zzg(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
        L52:
            if (r1 == 0) goto L57
            r1.close()
        L57:
            return r2
        L58:
            r2 = move-exception
            goto L5e
        L5a:
            r12 = move-exception
            goto L77
        L5c:
            r2 = move-exception
            r1 = r0
        L5e:
            com.google.android.gms.measurement.internal.zzas r3 = r11.zzgt()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzau r3 = r3.zzjg()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzas.zzbw(r12)     // Catch: java.lang.Throwable -> L75
            r3.zze(r4, r12, r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L74
            r1.close()
        L74:
            return r0
        L75:
            r12 = move-exception
            r0 = r1
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzbo(java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.j1> zzbp(java.lang.String r12) {
        /*
            r11 = this;
            r11.zzcl()
            r11.zzaf()
            com.google.android.gms.common.internal.p.v5(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.getWritableDatabase()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            r4[r9] = r12     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            if (r1 != 0) goto L36
            if (r0 == 0) goto L35
            r0.close()
        L35:
            return r8
        L36:
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
        L3b:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            int r4 = r3.length     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            com.google.android.gms.internal.measurement.q7 r3 = com.google.android.gms.internal.measurement.q7.EQ(r3, r9, r4)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            com.google.android.gms.internal.measurement.j1 r4 = new com.google.android.gms.internal.measurement.j1     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            r4.j6(r3)     // Catch: java.io.IOException -> L58 android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            r1.put(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            goto L6e
        L58:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzas r4 = r11.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            com.google.android.gms.measurement.internal.zzau r4 = r4.zzjg()     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzas.zzbw(r12)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            r4.zzd(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
        L6e:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7a java.lang.Throwable -> L97
            if (r2 != 0) goto L3b
            if (r0 == 0) goto L79
            r0.close()
        L79:
            return r1
        L7a:
            r1 = move-exception
            goto L80
        L7c:
            r12 = move-exception
            goto L99
        L7e:
            r1 = move-exception
            r0 = r8
        L80:
            com.google.android.gms.measurement.internal.zzas r2 = r11.zzgt()     // Catch: java.lang.Throwable -> L97
            com.google.android.gms.measurement.internal.zzau r2 = r2.zzjg()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzas.zzbw(r12)     // Catch: java.lang.Throwable -> L97
            r2.zze(r3, r12, r1)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L96
            r0.close()
        L96:
            return r8
        L97:
            r12 = move-exception
            r8 = r0
        L99:
            if (r8 == 0) goto L9e
            r8.close()
        L9e:
            goto La0
        L9f:
            throw r12
        La0:
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzbp(java.lang.String):java.util.Map");
    }

    public final long zzbq(String str) {
        p.v5(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final List<zzo> zzc(String str, String str2, String str3) {
        p.v5(str);
        zzaf();
        zzcl();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzb(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0138: MOVE (r16 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:62:0x0138 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac zzg(java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzg(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    @Override // com.google.android.gms.measurement.internal.zzfn
    protected final boolean zzgy() {
        return false;
    }

    public final void zzh(String str, String str2) {
        p.v5(str);
        p.v5(str2);
        zzaf();
        zzcl();
        try {
            zzgt().zzjo().zzg("Deleted user attribute rows", Integer.valueOf(getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzgt().zzjg().zzd("Error deleting user attribute. appId", zzas.zzbw(str), zzgq().zzbv(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzfx zzi(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.p.v5(r19)
            com.google.android.gms.common.internal.p.v5(r20)
            r18.zzaf()
            r18.zzcl()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r1] = r19     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r2] = r8     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            if (r0 != 0) goto L44
            if (r10 == 0) goto L43
            r10.close()
        L43:
            return r9
        L44:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            r11 = r18
            java.lang.Object r7 = r11.zza(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzfx r0 = new com.google.android.gms.measurement.internal.zzfx     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.zzas r1 = r18.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzau r1 = r1.zzjg()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzas.zzbw(r19)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1.zzg(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
        L73:
            if (r10 == 0) goto L78
            r10.close()
        L78:
            return r0
        L79:
            r0 = move-exception
            goto L8b
        L7b:
            r0 = move-exception
            r11 = r18
            goto Lab
        L7f:
            r0 = move-exception
            r11 = r18
            goto L8b
        L83:
            r0 = move-exception
            r11 = r18
            goto Lac
        L87:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L8b:
            com.google.android.gms.measurement.internal.zzas r1 = r18.zzgt()     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzau r1 = r1.zzjg()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzas.zzbw(r19)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzaq r4 = r18.zzgq()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r4.zzbv(r8)     // Catch: java.lang.Throwable -> Laa
            r1.zzd(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto La9
            r10.close()
        La9:
            return r9
        Laa:
            r0 = move-exception
        Lab:
            r9 = r10
        Lac:
            if (r9 == 0) goto Lb1
            r9.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzi(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzfx");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzih() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.zzas r3 = r6.zzgt()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.zzau r3 = r3.zzjg()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzg(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzih():java.lang.String");
    }

    public final boolean zzii() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    final void zzij() {
        int iDelete;
        zzaf();
        zzcl();
        if (zzip()) {
            long j = zzgu().zzand.get();
            long jDW = zzbx().DW();
            if (Math.abs(jDW - j) > zzai.zzajs.get().longValue()) {
                zzgu().zzand.set(jDW);
                zzaf();
                zzcl();
                if (!zzip() || (iDelete = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzbx().j6()), String.valueOf(zzq.zzib())})) <= 0) {
                    return;
                }
                zzgt().zzjo().zzg("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final long zzik() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long zzil() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final boolean zzim() {
        return zza("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzin() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long zzio() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return -1L;
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzgt().zzjg().zzg("Error querying raw events", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzo zzj(java.lang.String r33, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzj(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzo");
    }

    public final int zzk(String str, String str2) {
        p.v5(str);
        p.v5(str2);
        zzaf();
        zzcl();
        try {
            return getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzgt().zzjg().zzd("Error deleting conditional property", zzas.zzbw(str), zzgq().zzbv(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.v0>> zzl(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzcl()
            r12.zzaf()
            com.google.android.gms.common.internal.p.v5(r13)
            com.google.android.gms.common.internal.p.v5(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            r6[r10] = r13     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            r6[r11] = r14     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            int r2 = r1.length     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            com.google.android.gms.internal.measurement.q7 r1 = com.google.android.gms.internal.measurement.q7.EQ(r1, r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            com.google.android.gms.internal.measurement.v0 r2 = new com.google.android.gms.internal.measurement.v0     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r2.j6(r1)     // Catch: java.io.IOException -> L79 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            int r1 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r3 != 0) goto L75
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r0.put(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
        L75:
            r3.add(r2)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            goto L8b
        L79:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzas r2 = r12.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzau r2 = r2.zzjg()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzas.zzbw(r13)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r2.zze(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
        L8b:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r1 != 0) goto L48
            if (r14 == 0) goto L96
            r14.close()
        L96:
            return r0
        L97:
            r0 = move-exception
            goto L9d
        L99:
            r13 = move-exception
            goto Lb6
        L9b:
            r0 = move-exception
            r14 = r9
        L9d:
            com.google.android.gms.measurement.internal.zzas r1 = r12.zzgt()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzau r1 = r1.zzjg()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzas.zzbw(r13)     // Catch: java.lang.Throwable -> Lb4
            r1.zze(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r14 == 0) goto Lb3
            r14.close()
        Lb3:
            return r9
        Lb4:
            r13 = move-exception
            r9 = r14
        Lb6:
            if (r9 == 0) goto Lbb
            r9.close()
        Lbb:
            goto Lbd
        Lbc:
            throw r13
        Lbd:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzl(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.y0>> zzm(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzcl()
            r12.zzaf()
            com.google.android.gms.common.internal.p.v5(r13)
            com.google.android.gms.common.internal.p.v5(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            r6[r10] = r13     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            r6[r11] = r14     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9b
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            int r2 = r1.length     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            com.google.android.gms.internal.measurement.q7 r1 = com.google.android.gms.internal.measurement.q7.EQ(r1, r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            com.google.android.gms.internal.measurement.y0 r2 = new com.google.android.gms.internal.measurement.y0     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r2.j6(r1)     // Catch: java.io.IOException -> L79 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            int r1 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r3 != 0) goto L75
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r0.put(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
        L75:
            r3.add(r2)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            goto L8b
        L79:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzas r2 = r12.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzau r2 = r2.zzjg()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzas.zzbw(r13)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            r2.zze(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
        L8b:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Lb4
            if (r1 != 0) goto L48
            if (r14 == 0) goto L96
            r14.close()
        L96:
            return r0
        L97:
            r0 = move-exception
            goto L9d
        L99:
            r13 = move-exception
            goto Lb6
        L9b:
            r0 = move-exception
            r14 = r9
        L9d:
            com.google.android.gms.measurement.internal.zzas r1 = r12.zzgt()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzau r1 = r1.zzjg()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzas.zzbw(r13)     // Catch: java.lang.Throwable -> Lb4
            r1.zze(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r14 == 0) goto Lb3
            r14.close()
        Lb3:
            return r9
        Lb4:
            r13 = move-exception
            r9 = r14
        Lb6:
            if (r9 == 0) goto Lbb
            r9.close()
        Lbb:
            goto Lbd
        Lbc:
            throw r13
        Lbd:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzm(java.lang.String, java.lang.String):java.util.Map");
    }

    protected final long zzn(String str, String str2) throws Throwable {
        long jZza;
        p.v5(str);
        p.v5(str2);
        zzaf();
        zzcl();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    jZza = zza(sb.toString(), new String[]{str}, -1L);
                    if (jZza == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (writableDatabase.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzgt().zzjg().zze("Failed to insert column (got -1). appId", zzas.zzbw(str), str2);
                            writableDatabase.endTransaction();
                            return -1L;
                        }
                        jZza = 0;
                    }
                } catch (SQLiteException e) {
                    e = e;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + jZza));
                    if (writableDatabase.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzgt().zzjg().zze("Failed to update column (got 0). appId", zzas.zzbw(str), str2);
                        writableDatabase.endTransaction();
                        return -1L;
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return jZza;
                } catch (SQLiteException e2) {
                    e = e2;
                    j = jZza;
                    zzgt().zzjg().zzd("Error inserting column. appId", zzas.zzbw(str), str2, e);
                    writableDatabase.endTransaction();
                    return j;
                }
            } catch (Throwable th) {
                th = th;
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getWritableDatabase().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    return cursorRawQuery.getLong(0);
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    final void zzc(List<Long> list) throws SQLException {
        zzaf();
        zzcl();
        p.u7(list);
        p.EQ(list.size());
        if (zzip()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zza(sb2.toString(), (String[]) null) > 0) {
                zzgt().zzjj().zzby("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                writableDatabase.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                zzgt().zzjg().zzg("Error incrementing retry count. error", e);
            }
        }
    }

    public final void zza(zzac zzacVar) {
        p.u7(zzacVar);
        zzaf();
        zzcl();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzacVar.zztt);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzacVar.name);
        contentValues.put("lifetime_count", Long.valueOf(zzacVar.zzahv));
        contentValues.put("current_bundle_count", Long.valueOf(zzacVar.zzahw));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzacVar.zzahx));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzacVar.zzahy));
        contentValues.put("last_bundled_day", zzacVar.zzahz);
        contentValues.put("last_sampled_complex_event_id", zzacVar.zzaia);
        contentValues.put("last_sampling_rate", zzacVar.zzaib);
        Boolean bool = zzacVar.zzaic;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (getWritableDatabase().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzgt().zzjg().zzg("Failed to insert/update event aggregates (got -1). appId", zzas.zzbw(zzacVar.zztt));
            }
        } catch (SQLiteException e) {
            zzgt().zzjg().zze("Error storing event aggregates. appId", zzas.zzbw(zzacVar.zztt), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        zzgt().zzjg().zzg("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzo> zzb(java.lang.String r40, java.lang.String[] r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zzb(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final boolean zza(zzfx zzfxVar) {
        p.u7(zzfxVar);
        zzaf();
        zzcl();
        if (zzi(zzfxVar.zztt, zzfxVar.name) == null) {
            if (zzfy.zzct(zzfxVar.name)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzfxVar.zztt}) >= 25) {
                    return false;
                }
            } else if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzfxVar.zztt, zzfxVar.origin}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzfxVar.zztt);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzfxVar.origin);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzfxVar.name);
        contentValues.put("set_timestamp", Long.valueOf(zzfxVar.zzauk));
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzfxVar.value);
        try {
            if (getWritableDatabase().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzgt().zzjg().zzg("Failed to insert/update user property (got -1). appId", zzas.zzbw(zzfxVar.zztt));
            }
        } catch (SQLiteException e) {
            zzgt().zzjg().zze("Error storing user property. appId", zzas.zzbw(zzfxVar.zztt), e);
        }
        return true;
    }

    public final boolean zza(zzo zzoVar) {
        p.u7(zzoVar);
        zzaf();
        zzcl();
        if (zzi(zzoVar.packageName, zzoVar.zzags.name) == null && zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzoVar.packageName}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzoVar.packageName);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzoVar.origin);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzoVar.zzags.name);
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzoVar.zzags.getValue());
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzoVar.active));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzoVar.triggerEventName);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzoVar.triggerTimeout));
        zzgr();
        contentValues.put("timed_out_event", zzfy.zza(zzoVar.zzagt));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzoVar.creationTimestamp));
        zzgr();
        contentValues.put("triggered_event", zzfy.zza(zzoVar.zzagu));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzoVar.zzags.zzauk));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzoVar.timeToLive));
        zzgr();
        contentValues.put("expired_event", zzfy.zza(zzoVar.zzagv));
        try {
            if (getWritableDatabase().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzgt().zzjg().zzg("Failed to insert/update conditional user property (got -1)", zzas.zzbw(zzoVar.packageName));
            }
        } catch (SQLiteException e) {
            zzgt().zzjg().zze("Error storing conditional user property", zzas.zzbw(zzoVar.packageName), e);
        }
        return true;
    }

    public final List<Pair<i1, Long>> zzb(String str, int i, int i2) {
        byte[] bArrZza;
        zzaf();
        zzcl();
        p.j6(i > 0);
        p.j6(i2 > 0);
        p.v5(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = getWritableDatabase().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<i1, Long>> listEmptyList = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                do {
                    long j = cursorQuery.getLong(0);
                    try {
                        bArrZza = zzjr().zza(cursorQuery.getBlob(1));
                    } catch (IOException e) {
                        zzgt().zzjg().zze("Failed to unzip queued bundle. appId", zzas.zzbw(str), e);
                    }
                    if (!arrayList.isEmpty() && bArrZza.length + length > i2) {
                        break;
                    }
                    q7 q7VarEQ = q7.EQ(bArrZza, 0, bArrZza.length);
                    i1 i1Var = new i1();
                    try {
                        i1Var.j6(q7VarEQ);
                        if (!cursorQuery.isNull(2)) {
                            i1Var.dx = Integer.valueOf(cursorQuery.getInt(2));
                        }
                        length += bArrZza.length;
                        arrayList.add(Pair.create(i1Var, Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzgt().zzjg().zze("Failed to merge queued bundle. appId", zzas.zzbw(str), e2);
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                } while (length <= i2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzgt().zzjg().zze("Error querying bundles. appId", zzas.zzbw(str), e3);
                List<Pair<i1, Long>> listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zza(zzg zzgVar) {
        p.u7(zzgVar);
        zzaf();
        zzcl();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzal());
        contentValues.put("app_instance_id", zzgVar.getAppInstanceId());
        contentValues.put("gmp_app_id", zzgVar.getGmpAppId());
        contentValues.put("resettable_device_id_hash", zzgVar.zzhc());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzhj()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzhd()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzhe()));
        contentValues.put("app_version", zzgVar.zzak());
        contentValues.put("app_store", zzgVar.zzhg());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzhh()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzhi()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.isMeasurementEnabled()));
        contentValues.put("day", Long.valueOf(zzgVar.zzhn()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzho()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzhp()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzhq()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzhk()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzhl()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzhf()));
        contentValues.put("firebase_instance_id", zzgVar.getFirebaseInstanceId());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zzhs()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzhr()));
        contentValues.put("health_monitor_sample", zzgVar.zzht());
        contentValues.put("android_id", Long.valueOf(zzgVar.zzhv()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzhw()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzgVar.zzhx()));
        contentValues.put("admob_app_id", zzgVar.zzhb());
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase.update("apps", contentValues, "app_id = ?", new String[]{zzgVar.zzal()}) == 0 && writableDatabase.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzgt().zzjg().zzg("Failed to insert/update app (got -1). appId", zzas.zzbw(zzgVar.zzal()));
            }
        } catch (SQLiteException e) {
            zzgt().zzjg().zze("Error storing app. appId", zzas.zzbw(zzgVar.zzal()), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzu zza(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzu");
    }

    public final boolean zza(i1 i1Var, boolean z) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        zzaf();
        zzcl();
        p.u7(i1Var);
        p.v5(i1Var.XL);
        p.u7(i1Var.gn);
        zzij();
        long jJ6 = zzbx().j6();
        if (i1Var.gn.longValue() < jJ6 - zzq.zzib() || i1Var.gn.longValue() > zzq.zzib() + jJ6) {
            zzgt().zzjj().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzas.zzbw(i1Var.XL), Long.valueOf(jJ6), i1Var.gn);
        }
        try {
            int iHw = i1Var.Hw();
            byte[] bArr = new byte[iHw];
            r7 r7VarYS = r7.yS(bArr, 0, iHw);
            i1Var.DW(r7VarYS);
            r7VarYS.P8();
            byte[] bArrZzb = zzjr().zzb(bArr);
            zzgt().zzjo().zzg("Saving bundle, size", Integer.valueOf(bArrZzb.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i1Var.XL);
            contentValues.put("bundle_end_timestamp", i1Var.gn);
            contentValues.put("data", bArrZzb);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            Integer num = i1Var.dx;
            if (num != null) {
                contentValues.put("retry_count", num);
            }
            try {
                if (getWritableDatabase().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzgt().zzjg().zzg("Failed to insert bundle (got -1). appId", zzas.zzbw(i1Var.XL));
                return false;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Error storing bundle. appId", zzas.zzbw(i1Var.XL), e);
                return false;
            }
        } catch (IOException e2) {
            zzgt().zzjg().zze("Data loss. Failed to serialize bundle. appId", zzas.zzbw(i1Var.XL), e2);
            return false;
        }
    }

    final void zza(String str, u0[] u0VarArr) {
        boolean z;
        zzcl();
        zzaf();
        p.v5(str);
        p.u7(u0VarArr);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            zzcl();
            zzaf();
            p.v5(str);
            SQLiteDatabase writableDatabase2 = getWritableDatabase();
            writableDatabase2.delete("property_filters", "app_id=?", new String[]{str});
            writableDatabase2.delete("event_filters", "app_id=?", new String[]{str});
            for (u0 u0Var : u0VarArr) {
                zzcl();
                zzaf();
                p.v5(str);
                p.u7(u0Var);
                p.u7(u0Var.v5);
                p.u7(u0Var.Hw);
                if (u0Var.FH == null) {
                    zzgt().zzjj().zzg("Audience with no ID. appId", zzas.zzbw(str));
                } else {
                    int iIntValue = u0Var.FH.intValue();
                    v0[] v0VarArr = u0Var.v5;
                    int length = v0VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (v0VarArr[i].FH == null) {
                                zzgt().zzjj().zze("Event filter with no ID. Audience definition ignored. appId, audienceId", zzas.zzbw(str), u0Var.FH);
                                break;
                            }
                            i++;
                        } else {
                            y0[] y0VarArr = u0Var.Hw;
                            int length2 = y0VarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    if (y0VarArr[i2].FH == null) {
                                        zzgt().zzjj().zze("Property filter with no ID. Audience definition ignored. appId, audienceId", zzas.zzbw(str), u0Var.FH);
                                        break;
                                    }
                                    i2++;
                                } else {
                                    v0[] v0VarArr2 = u0Var.v5;
                                    int length3 = v0VarArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length3) {
                                            z = true;
                                            break;
                                        } else {
                                            if (!zza(str, iIntValue, v0VarArr2[i3])) {
                                                z = false;
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                    if (z) {
                                        y0[] y0VarArr2 = u0Var.Hw;
                                        int length4 = y0VarArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length4) {
                                                break;
                                            }
                                            if (!zza(str, iIntValue, y0VarArr2[i4])) {
                                                z = false;
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    if (!z) {
                                        zzcl();
                                        zzaf();
                                        p.v5(str);
                                        SQLiteDatabase writableDatabase3 = getWritableDatabase();
                                        writableDatabase3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iIntValue)});
                                        writableDatabase3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iIntValue)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (u0 u0Var2 : u0VarArr) {
                arrayList.add(u0Var2.FH);
            }
            zza(str, arrayList);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    private final boolean zza(String str, int i, v0 v0Var) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        zzcl();
        zzaf();
        p.v5(str);
        p.u7(v0Var);
        if (TextUtils.isEmpty(v0Var.Hw)) {
            zzgt().zzjj().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzas.zzbw(str), Integer.valueOf(i), String.valueOf(v0Var.FH));
            return false;
        }
        try {
            int iHw = v0Var.Hw();
            byte[] bArr = new byte[iHw];
            r7 r7VarYS = r7.yS(bArr, 0, iHw);
            v0Var.DW(r7VarYS);
            r7VarYS.P8();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", v0Var.FH);
            contentValues.put("event_name", v0Var.Hw);
            contentValues.put("data", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                zzgt().zzjg().zzg("Failed to insert event filter (got -1). appId", zzas.zzbw(str));
                return true;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Error storing event filter. appId", zzas.zzbw(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzgt().zzjg().zze("Configuration loss. Failed to serialize event filter. appId", zzas.zzbw(str), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i, y0 y0Var) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        zzcl();
        zzaf();
        p.v5(str);
        p.u7(y0Var);
        if (TextUtils.isEmpty(y0Var.Hw)) {
            zzgt().zzjj().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzas.zzbw(str), Integer.valueOf(i), String.valueOf(y0Var.FH));
            return false;
        }
        try {
            int iHw = y0Var.Hw();
            byte[] bArr = new byte[iHw];
            r7 r7VarYS = r7.yS(bArr, 0, iHw);
            y0Var.DW(r7VarYS);
            r7VarYS.P8();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", y0Var.FH);
            contentValues.put("property_name", y0Var.Hw);
            contentValues.put("data", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                zzgt().zzjg().zzg("Failed to insert property filter (got -1). appId", zzas.zzbw(str));
                return false;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Error storing property filter. appId", zzas.zzbw(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzgt().zzjg().zze("Configuration loss. Failed to serialize property filter. appId", zzas.zzbw(str), e2);
            return false;
        }
    }

    private final boolean zza(String str, List<Integer> list) {
        p.v5(str);
        zzcl();
        zzaf();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long jZza = zza("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, zzgv().zzb(str, zzai.zzajz)));
            if (jZza <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 140);
            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(string);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return writableDatabase.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e) {
            zzgt().zzjg().zze("Database error querying filters. appId", zzas.zzbw(str), e);
            return false;
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        p.v5(str);
        p.u7(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzgt().zzjg().zzby("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            zzgt().zzjg().zzg("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzgt().zzjg().zzby("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final long zza(i1 i1Var) throws NoSuchAlgorithmException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        long jZzc;
        zzaf();
        zzcl();
        p.u7(i1Var);
        p.v5(i1Var.XL);
        try {
            int iHw = i1Var.Hw();
            byte[] bArr = new byte[iHw];
            r7 r7VarYS = r7.yS(bArr, 0, iHw);
            i1Var.DW(r7VarYS);
            r7VarYS.P8();
            zzfu zzfuVarZzjr = zzjr();
            p.u7(bArr);
            zzfuVarZzjr.zzgr().zzaf();
            MessageDigest messageDigest = zzfy.getMessageDigest();
            if (messageDigest == null) {
                zzfuVarZzjr.zzgt().zzjg().zzby("Failed to get MD5");
                jZzc = 0;
            } else {
                jZzc = zzfy.zzc(messageDigest.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i1Var.XL);
            contentValues.put("metadata_fingerprint", Long.valueOf(jZzc));
            contentValues.put("metadata", bArr);
            try {
                getWritableDatabase().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return jZzc;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Error storing raw event metadata. appId", zzas.zzbw(i1Var.XL), e);
                throw e;
            }
        } catch (IOException e2) {
            zzgt().zzjg().zze("Data loss. Failed to serialize event metadata. appId", zzas.zzbw(i1Var.XL), e2);
            throw e2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x008c */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.f1, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzaf()
            r7.zzcl()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.zzas r8 = r7.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            com.google.android.gms.measurement.internal.zzau r8 = r8.zzjo()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            java.lang.String r9 = "Main event not found"
            r8.zzby(r9)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            long r5 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            int r5 = r2.length     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            com.google.android.gms.internal.measurement.q7 r2 = com.google.android.gms.internal.measurement.q7.EQ(r2, r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            com.google.android.gms.internal.measurement.f1 r4 = new com.google.android.gms.internal.measurement.f1     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            r4.j6(r2)     // Catch: java.io.IOException -> L5a android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            if (r1 == 0) goto L59
            r1.close()
        L59:
            return r8
        L5a:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzas r3 = r7.zzgt()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            com.google.android.gms.measurement.internal.zzau r3 = r3.zzjg()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzas.zzbw(r8)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            r3.zzd(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8b
            if (r1 == 0) goto L71
            r1.close()
        L71:
            return r0
        L72:
            r8 = move-exception
            goto L78
        L74:
            r8 = move-exception
            goto L8d
        L76:
            r8 = move-exception
            r1 = r0
        L78:
            com.google.android.gms.measurement.internal.zzas r9 = r7.zzgt()     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.measurement.internal.zzau r9 = r9.zzjg()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "Error selecting main event"
            r9.zzg(r2, r8)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L8a
            r1.close()
        L8a:
            return r0
        L8b:
            r8 = move-exception
            r0 = r1
        L8d:
            if (r0 == 0) goto L92
            r0.close()
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean zza(String str, Long l, long j, f1 f1Var) {
        zzaf();
        zzcl();
        p.u7(f1Var);
        p.v5(str);
        p.u7(l);
        try {
            int iHw = f1Var.Hw();
            byte[] bArr = new byte[iHw];
            r7 r7VarYS = r7.yS(bArr, 0, iHw);
            f1Var.DW(r7VarYS);
            r7VarYS.P8();
            zzgt().zzjo().zze("Saving complex main event, appId, data size", zzgq().zzbt(str), Integer.valueOf(iHw));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                zzgt().zzjg().zzg("Failed to insert complex main event (got -1). appId", zzas.zzbw(str));
                return false;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Error storing complex main event. appId", zzas.zzbw(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzgt().zzjg().zzd("Data loss. Failed to serialize event params/data. appId, eventId", zzas.zzbw(str), l, e2);
            return false;
        }
    }

    public final boolean zza(zzab zzabVar, long j, boolean z) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        zzaf();
        zzcl();
        p.u7(zzabVar);
        p.v5(zzabVar.zztt);
        f1 f1Var = new f1();
        f1Var.Zo = Long.valueOf(zzabVar.zzaht);
        f1Var.FH = new g1[zzabVar.zzahu.size()];
        Iterator<String> it = zzabVar.zzahu.iterator();
        int i = 0;
        while (it.hasNext()) {
            String next = it.next();
            g1 g1Var = new g1();
            int i2 = i + 1;
            f1Var.FH[i] = g1Var;
            g1Var.FH = next;
            zzjr().zza(g1Var, zzabVar.zzahu.get(next));
            i = i2;
        }
        try {
            int iHw = f1Var.Hw();
            byte[] bArr = new byte[iHw];
            r7 r7VarYS = r7.yS(bArr, 0, iHw);
            f1Var.DW(r7VarYS);
            r7VarYS.P8();
            zzgt().zzjo().zze("Saving event, name, data size", zzgq().zzbt(zzabVar.name), Integer.valueOf(iHw));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzabVar.zztt);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzabVar.name);
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(zzabVar.timestamp));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (getWritableDatabase().insert("raw_events", null, contentValues) != -1) {
                    return true;
                }
                zzgt().zzjg().zzg("Failed to insert raw event (got -1). appId", zzas.zzbw(zzabVar.zztt));
                return false;
            } catch (SQLiteException e) {
                zzgt().zzjg().zze("Error storing raw event. appId", zzas.zzbw(zzabVar.zztt), e);
                return false;
            }
        } catch (IOException e2) {
            zzgt().zzjg().zze("Data loss. Failed to serialize event params/data. appId", zzas.zzbw(zzabVar.zztt), e2);
            return false;
        }
    }
}
