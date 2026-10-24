package androidx.core.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.app.t;
import androidx.core.util.DebugUtils;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public class u extends t {
    static boolean VH;
    final String FH;
    boolean Hw;
    k Zo;
    boolean v5;
    final SparseArrayCompat<a> j6 = new SparseArrayCompat<>();
    final SparseArrayCompat<a> DW = new SparseArrayCompat<>();

    final class a implements Loader.c<Object>, Loader.b<Object> {
        final Bundle DW;
        boolean EQ;
        t.a<Object> FH;
        Loader<Object> Hw;
        boolean J0;
        a J8;
        Object VH;
        final /* synthetic */ u Ws;
        boolean Zo;
        boolean gn;
        final int j6;
        boolean tp;
        boolean u7;
        boolean v5;
        boolean we;

        @Override // androidx.loader.content.Loader.c
        public void DW(Loader<Object> loader, Object obj) throws NoSuchFieldException, Resources.NotFoundException {
            if (u.VH) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (this.we) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
                    return;
                }
                return;
            }
            if (this.Ws.j6.VH(this.j6) != this) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Ignoring load complete -- not active");
                    return;
                }
                return;
            }
            a aVar = this.J8;
            if (aVar != null) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Switching to pending loader: " + aVar);
                }
                this.J8 = null;
                this.Ws.j6.tp(this.j6, null);
                Hw();
                this.Ws.tp(aVar);
                return;
            }
            if (this.VH != obj || !this.v5) {
                this.VH = obj;
                this.v5 = true;
                if (this.gn) {
                    FH(loader, obj);
                }
            }
            a aVarVH = this.Ws.DW.VH(this.j6);
            if (aVarVH != null && aVarVH != this) {
                aVarVH.Zo = false;
                aVarVH.Hw();
                this.Ws.DW.EQ(this.j6);
            }
            u uVar = this.Ws;
            if (uVar.Zo == null || uVar.u7()) {
                return;
            }
            this.Ws.Zo.Hw.ce();
        }

        void FH(Loader<Object> loader, Object obj) {
            if (this.FH != null) {
                String str = null;
                k kVar = this.Ws.Zo;
                if (kVar != null) {
                    m mVar = kVar.Hw;
                    String str2 = mVar.e3;
                    mVar.e3 = "onLoadFinished";
                    str = str2;
                }
                try {
                    if (u.VH) {
                        Log.v("LoaderManager", "  onLoadFinished in " + loader + ": " + loader.FH(obj));
                    }
                    this.FH.FH(loader, obj);
                    this.Zo = true;
                } finally {
                    k kVar2 = this.Ws.Zo;
                    if (kVar2 != null) {
                        kVar2.Hw.e3 = str;
                    }
                }
            }
        }

        void Hw() {
            String str;
            if (u.VH) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.we = true;
            boolean z = this.Zo;
            this.Zo = false;
            if (this.FH != null && this.Hw != null && this.v5 && z) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Resetting: " + this);
                }
                k kVar = this.Ws.Zo;
                if (kVar != null) {
                    m mVar = kVar.Hw;
                    str = mVar.e3;
                    mVar.e3 = "onLoaderReset";
                } else {
                    str = null;
                }
                try {
                    this.FH.j6(this.Hw);
                } finally {
                    k kVar2 = this.Ws.Zo;
                    if (kVar2 != null) {
                        kVar2.Hw.e3 = str;
                    }
                }
            }
            this.FH = null;
            this.VH = null;
            this.v5 = false;
            Loader<Object> loader = this.Hw;
            if (loader != null) {
                if (this.J0) {
                    this.J0 = false;
                    loader.er(this);
                    this.Hw.yS(this);
                }
                this.Hw.Mr();
            }
            a aVar = this.J8;
            if (aVar != null) {
                aVar.Hw();
            }
        }

        void VH() {
            if (this.gn && this.EQ) {
                this.EQ = false;
                if (!this.v5 || this.u7) {
                    return;
                }
                FH(this.Hw, this.VH);
            }
        }

        void Zo() {
            if (this.u7) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.u7 = false;
                boolean z = this.gn;
                if (z != this.tp && !z) {
                    tp();
                }
            }
            if (this.gn && this.v5 && !this.EQ) {
                FH(this.Hw, this.VH);
            }
        }

        void gn() {
            if (u.VH) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.u7 = true;
            this.tp = this.gn;
            this.gn = false;
            this.FH = null;
        }

        @Override // androidx.loader.content.Loader.b
        public void j6(Loader<Object> loader) {
            if (u.VH) {
                Log.v("LoaderManager", "onLoadCanceled: " + this);
            }
            if (this.we) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
                    return;
                }
                return;
            }
            if (this.Ws.j6.VH(this.j6) != this) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Ignoring load canceled -- not active");
                    return;
                }
                return;
            }
            a aVar = this.J8;
            if (aVar != null) {
                if (u.VH) {
                    Log.v("LoaderManager", "  Switching to pending loader: " + aVar);
                }
                this.J8 = null;
                this.Ws.j6.tp(this.j6, null);
                Hw();
                this.Ws.tp(aVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j6);
            sb.append(" : ");
            DebugUtils.j6(this.Hw, sb);
            sb.append("}}");
            return sb.toString();
        }

        void tp() {
            Loader<Object> loader;
            if (u.VH) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.gn = false;
            if (this.u7 || (loader = this.Hw) == null || !this.J0) {
                return;
            }
            this.J0 = false;
            loader.er(this);
            this.Hw.yS(this);
            this.Hw.lg();
        }

        void u7() {
            t.a<Object> aVar;
            if (this.u7 && this.tp) {
                this.gn = true;
                return;
            }
            if (this.gn) {
                return;
            }
            this.gn = true;
            if (u.VH) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            if (this.Hw == null && (aVar = this.FH) != null) {
                this.Hw = aVar.DW(this.j6, this.DW);
            }
            Loader<Object> loader = this.Hw;
            if (loader != null) {
                if (loader.getClass().isMemberClass() && !Modifier.isStatic(this.Hw.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.Hw);
                }
                if (!this.J0) {
                    this.Hw.aM(this.j6, this);
                    this.Hw.j3(this);
                    this.J0 = true;
                }
                this.Hw.a8();
            }
        }

        public void v5(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j6);
            printWriter.print(" mArgs=");
            printWriter.println(this.DW);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.FH);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.Hw);
            Loader<Object> loader = this.Hw;
            if (loader != null) {
                loader.Zo(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.v5 || this.Zo) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.v5);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.Zo);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.VH);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.gn);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.EQ);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.we);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.u7);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.tp);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.J0);
            if (this.J8 != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.J8);
                printWriter.println(":");
                this.J8.v5(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }
    }

    u(String str, k kVar, boolean z) {
        this.FH = str;
        this.Zo = kVar;
        this.Hw = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void DW() {
        for (int iWe = this.j6.we() - 1; iWe >= 0; iWe--) {
            this.j6.J0(iWe).EQ = true;
        }
    }

    void EQ(k kVar) {
        this.Zo = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void FH() {
        for (int iWe = this.j6.we() - 1; iWe >= 0; iWe--) {
            this.j6.J0(iWe).VH();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Hw() {
        if (VH) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.Hw) {
            this.v5 = true;
            this.Hw = false;
            for (int iWe = this.j6.we() - 1; iWe >= 0; iWe--) {
                this.j6.J0(iWe).gn();
            }
            return;
        }
        RuntimeException runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    public void VH(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.j6.we() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.j6.we(); i++) {
                a aVarJ0 = this.j6.J0(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.j6.u7(i));
                printWriter.print(": ");
                printWriter.println(aVarJ0.toString());
                aVarJ0.v5(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.DW.we() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.DW.we(); i2++) {
                a aVarJ02 = this.DW.J0(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.DW.u7(i2));
                printWriter.print(": ");
                printWriter.println(aVarJ02.toString());
                aVarJ02.v5(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Zo() {
        if (VH) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.Hw) {
            for (int iWe = this.j6.we() - 1; iWe >= 0; iWe--) {
                this.j6.J0(iWe).tp();
            }
            this.Hw = false;
            return;
        }
        RuntimeException runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    void gn() {
        if (this.v5) {
            if (VH) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.v5 = false;
            for (int iWe = this.j6.we() - 1; iWe >= 0; iWe--) {
                this.j6.J0(iWe).Zo();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j6() {
        if (!this.v5) {
            if (VH) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int iWe = this.j6.we() - 1; iWe >= 0; iWe--) {
                this.j6.J0(iWe).Hw();
            }
            this.j6.j6();
        }
        if (VH) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int iWe2 = this.DW.we() - 1; iWe2 >= 0; iWe2--) {
            this.DW.J0(iWe2).Hw();
        }
        this.DW.j6();
        this.Zo = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.j6(this.Zo, sb);
        sb.append("}}");
        return sb.toString();
    }

    void tp(a aVar) {
        this.j6.tp(aVar.j6, aVar);
        if (this.Hw) {
            aVar.u7();
        }
    }

    public boolean u7() {
        int iWe = this.j6.we();
        boolean z = false;
        for (int i = 0; i < iWe; i++) {
            a aVarJ0 = this.j6.J0(i);
            z |= aVarJ0.gn && !aVarJ0.Zo;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v5() {
        if (VH) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (!this.Hw) {
            this.Hw = true;
            for (int iWe = this.j6.we() - 1; iWe >= 0; iWe--) {
                this.j6.J0(iWe).u7();
            }
            return;
        }
        RuntimeException runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
    }
}
