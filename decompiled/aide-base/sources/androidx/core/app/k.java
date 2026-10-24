package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.collection.SimpleArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class k<E> extends i {
    final Context DW;
    private final Handler FH;
    final m Hw;
    private u VH;
    private boolean Zo;
    private boolean gn;
    private final Activity j6;
    private boolean u7;
    private SimpleArrayMap<String, t> v5;

    /* JADX INFO: Access modifiers changed from: package-private */
    protected k(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.fY, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler EQ() {
        return this.FH;
    }

    void Hw() {
        u uVar = this.VH;
        if (uVar == null) {
            return;
        }
        uVar.j6();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J0() {
        return this.Zo;
    }

    void J8(String str) {
        u uVar;
        SimpleArrayMap<String, t> simpleArrayMap = this.v5;
        if (simpleArrayMap == null || (uVar = (u) simpleArrayMap.get(str)) == null || uVar.v5) {
            return;
        }
        uVar.j6();
        this.v5.remove(str);
    }

    public abstract boolean Mr(Fragment fragment);

    public abstract void QX(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void U2();

    void VH(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.u7);
        if (this.VH != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.VH)));
            printWriter.println(":");
            this.VH.VH(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    abstract void Ws(Fragment fragment);

    public abstract LayoutInflater XL();

    void Zo(boolean z) {
        this.Zo = z;
        u uVar = this.VH;
        if (uVar != null && this.u7) {
            this.u7 = false;
            if (z) {
                uVar.Hw();
            } else {
                uVar.Zo();
            }
        }
    }

    void a8() {
        SimpleArrayMap<String, t> simpleArrayMap = this.v5;
        if (simpleArrayMap != null) {
            int size = simpleArrayMap.size();
            u[] uVarArr = new u[size];
            for (int i = size - 1; i >= 0; i--) {
                uVarArr[i] = (u) this.v5.valueAt(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                u uVar = uVarArr[i2];
                uVar.gn();
                uVar.FH();
            }
        }
    }

    public abstract int aM();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity gn() {
        return this.j6;
    }

    public abstract boolean j3();

    void lg(SimpleArrayMap<String, t> simpleArrayMap) {
        if (simpleArrayMap != null) {
            int size = simpleArrayMap.size();
            for (int i = 0; i < size; i++) {
                ((u) simpleArrayMap.valueAt(i)).EQ(this);
            }
        }
        this.v5 = simpleArrayMap;
    }

    SimpleArrayMap<String, t> rN() {
        SimpleArrayMap<String, t> simpleArrayMap = this.v5;
        int i = 0;
        if (simpleArrayMap != null) {
            int size = simpleArrayMap.size();
            u[] uVarArr = new u[size];
            for (int i2 = size - 1; i2 >= 0; i2--) {
                uVarArr[i2] = (u) this.v5.valueAt(i2);
            }
            boolean zJ0 = J0();
            int i3 = 0;
            while (i < size) {
                u uVar = uVarArr[i];
                if (!uVar.v5 && zJ0) {
                    if (!uVar.Hw) {
                        uVar.v5();
                    }
                    uVar.Hw();
                }
                if (uVar.v5) {
                    i3 = 1;
                } else {
                    uVar.j6();
                    this.v5.remove(uVar.FH);
                }
                i++;
            }
            i = i3;
        }
        if (i != 0) {
            return this.v5;
        }
        return null;
    }

    m tp() {
        return this.Hw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context u7() {
        return this.DW;
    }

    void v5() {
        if (this.u7) {
            return;
        }
        this.u7 = true;
        u uVar = this.VH;
        if (uVar != null) {
            uVar.v5();
        } else if (!this.gn) {
            u uVarWe = we("(root)", true, false);
            this.VH = uVarWe;
            if (uVarWe != null && !uVarWe.Hw) {
                uVarWe.v5();
            }
        }
        this.gn = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u we(String str, boolean z, boolean z2) {
        if (this.v5 == null) {
            this.v5 = new SimpleArrayMap<>();
        }
        u uVar = (u) this.v5.get(str);
        if (uVar == null && z2) {
            u uVar2 = new u(str, this, z);
            this.v5.put(str, uVar2);
            return uVar2;
        }
        if (!z || uVar == null || uVar.Hw) {
            return uVar;
        }
        uVar.v5();
        return uVar;
    }

    k(Activity activity, Context context, Handler handler, int i) {
        this.Hw = new m();
        this.j6 = activity;
        this.DW = context;
        this.FH = handler;
    }
}
