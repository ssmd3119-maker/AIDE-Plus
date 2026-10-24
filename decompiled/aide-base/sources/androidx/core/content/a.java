package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* loaded from: classes.dex */
public final class a {
    public static Cursor j6(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, androidx.core.os.a aVar) throws Exception {
        Object objDW;
        if (Build.VERSION.SDK_INT < 16) {
            if (aVar != null) {
                aVar.Hw();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        if (aVar != null) {
            try {
                objDW = aVar.DW();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new androidx.core.os.c();
                }
                throw e;
            }
        } else {
            objDW = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) objDW);
    }
}
