package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r1 implements w1 {
    private final Uri DW;
    private volatile Map<String, String> Hw;
    private final ContentResolver j6;
    static final Map<Uri, r1> Zo = new ArrayMap();
    private static final String[] VH = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};
    private final Object FH = new Object();
    private final List<v1> v5 = new ArrayList();

    private r1(ContentResolver contentResolver, Uri uri) {
        this.j6 = contentResolver;
        this.DW = uri;
        contentResolver.registerContentObserver(uri, false, new t1(this, null));
    }

    public static r1 DW(ContentResolver contentResolver, Uri uri) {
        r1 r1Var;
        synchronized (r1.class) {
            r1Var = Zo.get(uri);
            if (r1Var == null) {
                try {
                    r1 r1Var2 = new r1(contentResolver, uri);
                    try {
                        Zo.put(uri, r1Var2);
                    } catch (SecurityException unused) {
                    }
                    r1Var = r1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return r1Var;
    }

    private final Map<String, String> v5() {
        try {
            return (Map) x1.j6(new y1(this) { // from class: com.google.android.gms.internal.measurement.s1
                private final r1 j6;

                {
                    this.j6 = this;
                }

                @Override // com.google.android.gms.internal.measurement.y1
                public final Object j6() {
                    return this.j6.Zo();
                }
            });
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    public final Map<String, String> FH() {
        Map<String, String> mapV5 = this.Hw;
        if (mapV5 == null) {
            synchronized (this.FH) {
                mapV5 = this.Hw;
                if (mapV5 == null) {
                    mapV5 = v5();
                    this.Hw = mapV5;
                }
            }
        }
        return mapV5 != null ? mapV5 : Collections.emptyMap();
    }

    public final void Hw() {
        synchronized (this.FH) {
            this.Hw = null;
            d2.QX();
        }
        synchronized (this) {
            Iterator<v1> it = this.v5.iterator();
            while (it.hasNext()) {
                it.next().j6();
            }
        }
    }

    final /* synthetic */ Map Zo() {
        Cursor cursorQuery = this.j6.query(this.DW, VH, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return arrayMap;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.google.android.gms.internal.measurement.w1
    public final /* synthetic */ Object j6(String str) {
        return FH().get(str);
    }
}
