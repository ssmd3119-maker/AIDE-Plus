package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new c();
    private final int WB;
    private final CursorWindow[] fY;
    private Bundle jw;
    private final Bundle k2;
    private final String[] mb;
    private final int qp;
    private int[] zh;
    private boolean AL = false;
    private boolean w9 = true;

    static {
        new b(new String[0], null);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.WB = i;
        this.mb = strArr;
        this.fY = cursorWindowArr;
        this.qp = i2;
        this.k2 = bundle;
    }

    public final int EQ() {
        return this.qp;
    }

    public final boolean J8() {
        boolean z;
        synchronized (this) {
            z = this.AL;
        }
        return z;
    }

    public final void Ws() {
        this.jw = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.mb;
            if (i2 >= strArr.length) {
                break;
            }
            this.jw.putInt(strArr[i2], i2);
            i2++;
        }
        this.zh = new int[this.fY.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.fY;
            if (i >= cursorWindowArr.length) {
                return;
            }
            this.zh[i] = numRows;
            numRows += this.fY[i].getNumRows() - (numRows - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.AL) {
                this.AL = true;
                for (int i = 0; i < this.fY.length; i++) {
                    this.fY[i].close();
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.w9 && this.fY.length > 0 && !J8()) {
                close();
                String string = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle gn() {
        return this.k2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ6 = com.google.android.gms.common.internal.safeparcel.b.j6(parcel);
        com.google.android.gms.common.internal.safeparcel.b.aM(parcel, 1, this.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.Mr(parcel, 2, this.fY, i, false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 3, EQ());
        com.google.android.gms.common.internal.safeparcel.b.Hw(parcel, 4, gn(), false);
        com.google.android.gms.common.internal.safeparcel.b.tp(parcel, 1000, this.WB);
        com.google.android.gms.common.internal.safeparcel.b.DW(parcel, iJ6);
        if ((i & 1) != 0) {
            close();
        }
    }

    public static class a {
        private a(String[] strArr, String str) {
            p.u7(strArr);
            new ArrayList();
            new HashMap();
        }

        /* synthetic */ a(String[] strArr, String str, b bVar) {
            this(strArr, null);
        }
    }
}
