package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class Loader<D> {
    c<D> DW;
    b<D> FH;
    Context Hw;
    int j6;
    boolean v5 = false;
    boolean Zo = false;
    boolean VH = true;
    boolean gn = false;
    boolean u7 = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Loader.this.J0();
        }
    }

    public interface b<D> {
        void j6(Loader<D> loader);
    }

    public interface c<D> {
        void DW(Loader<D> loader, D d);
    }

    public Loader(Context context) {
        this.Hw = context.getApplicationContext();
    }

    public void DW() {
        this.u7 = false;
    }

    public boolean EQ() {
        return this.v5;
    }

    public String FH(D d) {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.j6(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void Hw() {
        b<D> bVar = this.FH;
        if (bVar != null) {
            bVar.j6(this);
        }
    }

    public void J0() {
        if (this.v5) {
            VH();
        } else {
            this.gn = true;
        }
    }

    protected void J8() {
    }

    public void Mr() {
        Ws();
        this.VH = true;
        this.v5 = false;
        this.Zo = false;
        this.gn = false;
        this.u7 = false;
    }

    protected void QX() {
    }

    public void U2() {
        if (this.u7) {
            J0();
        }
    }

    public void VH() {
        J8();
    }

    protected void Ws() {
    }

    protected void XL() {
    }

    public void Zo(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.j6);
        printWriter.print(" mListener=");
        printWriter.println(this.DW);
        if (this.v5 || this.gn || this.u7) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.v5);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.gn);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.u7);
        }
        if (this.Zo || this.VH) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.Zo);
            printWriter.print(" mReset=");
            printWriter.println(this.VH);
        }
    }

    public final void a8() {
        this.v5 = true;
        this.VH = false;
        this.Zo = false;
        QX();
    }

    public void aM(int i, c<D> cVar) {
        if (this.DW != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.DW = cVar;
        this.j6 = i;
    }

    public void er(c<D> cVar) {
        c<D> cVar2 = this.DW;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (cVar2 != cVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.DW = null;
    }

    public Context gn() {
        return this.Hw;
    }

    public void j3(b<D> bVar) {
        if (this.FH != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.FH = bVar;
    }

    public boolean j6() {
        return we();
    }

    public void lg() {
        this.v5 = false;
        XL();
    }

    public boolean rN() {
        boolean z = this.gn;
        this.gn = false;
        this.u7 |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.j6(this, sb);
        sb.append(" id=");
        sb.append(this.j6);
        sb.append("}");
        return sb.toString();
    }

    public boolean tp() {
        return this.VH;
    }

    public boolean u7() {
        return this.Zo;
    }

    public void v5(D d) {
        c<D> cVar = this.DW;
        if (cVar != null) {
            cVar.DW(this, d);
        }
    }

    protected boolean we() {
        return false;
    }

    public void yS(b<D> bVar) {
        b<D> bVar2 = this.FH;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.FH = null;
    }
}
