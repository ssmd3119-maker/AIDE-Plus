package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.os.a;
import androidx.core.os.c;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {
    String[] Mr;
    final Loader<Cursor>.a QX;
    String U2;
    Uri XL;
    Cursor a8;
    String[] aM;
    String j3;
    a lg;

    public CursorLoader(Context context) {
        super(context);
        this.QX = new Loader.a();
    }

    @Override // androidx.loader.content.Loader
    protected void QX() {
        Cursor cursor = this.a8;
        if (cursor != null) {
            v5(cursor);
        }
        if (rN() || this.a8 == null) {
            VH();
        }
    }

    @Override // androidx.loader.content.Loader
    protected void Ws() {
        super.Ws();
        XL();
        Cursor cursor = this.a8;
        if (cursor != null && !cursor.isClosed()) {
            this.a8.close();
        }
        this.a8 = null;
    }

    @Override // androidx.loader.content.Loader
    protected void XL() {
        j6();
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    public void Zo(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.Zo(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.XL);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.aM));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.j3);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.Mr));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.U2);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.a8);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.gn);
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* renamed from: cn, reason: merged with bridge method [inline-methods] */
    public Cursor nw() {
        synchronized (this) {
            if (ei()) {
                throw new c();
            }
            this.lg = new a();
        }
        try {
            Cursor cursorJ6 = androidx.core.content.a.j6(gn().getContentResolver(), this.XL, this.aM, this.j3, this.Mr, this.U2, this.lg);
            if (cursorJ6 != null) {
                try {
                    cursorJ6.getCount();
                    cursorJ6.registerContentObserver(this.QX);
                } catch (RuntimeException e) {
                    cursorJ6.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.lg = null;
            }
            return cursorJ6;
        } catch (Throwable th) {
            synchronized (this) {
                this.lg = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void gW() {
        super.gW();
        synchronized (this) {
            if (this.lg != null) {
                this.lg.j6();
            }
        }
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: ro, reason: merged with bridge method [inline-methods] */
    public void v5(Cursor cursor) {
        if (tp()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.a8;
        this.a8 = cursor;
        if (EQ()) {
            super.v5(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* renamed from: sh, reason: merged with bridge method [inline-methods] */
    public void SI(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
