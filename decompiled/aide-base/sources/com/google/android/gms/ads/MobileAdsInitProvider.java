package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzze;

/* loaded from: classes.dex */
public class MobileAdsInitProvider extends ContentProvider {
    private final zzze WB = new zzze();

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.WB.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.WB.delete(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return this.WB.getType(uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.WB.insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return this.WB.onCreate();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.WB.query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.WB.update(uri, contentValues, str, strArr);
    }
}
