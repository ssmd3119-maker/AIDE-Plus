package androidx.fragment.app;

import abcd.iy;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.app.e;
import androidx.core.app.f;
import androidx.core.app.j;
import androidx.core.app.k;
import androidx.core.app.n;
import androidx.core.app.t;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends f implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.c {
    SparseArrayCompat<String> Z1;
    boolean cT;
    boolean hK;
    boolean k2;
    int q7;
    boolean zh;
    final Handler fY = new a();
    final j qp = j.DW(new b());
    boolean AL = true;
    boolean w9 = true;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                FragmentActivity fragmentActivity = FragmentActivity.this;
                if (fragmentActivity.AL) {
                    fragmentActivity.VH(false);
                    return;
                }
                return;
            }
            if (i != 2) {
                super.handleMessage(message);
            } else {
                FragmentActivity.this.J0();
                FragmentActivity.this.qp.rN();
            }
        }
    }

    class b extends k<FragmentActivity> {
        public b() {
            super(FragmentActivity.this);
        }

        @Override // androidx.core.app.i
        public View DW(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.core.app.i
        public boolean FH() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.core.app.k
        public boolean Mr(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.core.app.k
        public void QX(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.app.k
        public void U2() {
            FragmentActivity.this.Ws();
        }

        public void Ws(Fragment fragment) {
            FragmentActivity.this.tp(fragment);
        }

        @Override // androidx.core.app.k
        public LayoutInflater XL() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.core.app.k
        public int aM() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.core.app.k
        public boolean j3() {
            return FragmentActivity.this.getWindow() != null;
        }
    }

    static final class c {
        n DW;
        SimpleArrayMap<String, t> FH;
        Object j6;

        c() {
        }
    }

    private static void u7(FragmentManager fragmentManager, Lifecycle.State state) {
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                fragment.oa.VH(state);
                u7(fragment.J0(), state);
            }
        }
    }

    @Override // androidx.core.app.ActivityCompat.c
    public final void DW(int i) {
        if (this.cT || i == -1) {
            return;
        }
        e.v5(i);
    }

    protected boolean EQ(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void J0() {
        this.qp.XL();
    }

    public Object J8() {
        return null;
    }

    void VH(boolean z) {
        if (this.w9) {
            if (z) {
                this.qp.U2();
                this.qp.a8(true);
                return;
            }
            return;
        }
        this.w9 = true;
        this.hK = z;
        this.fY.removeMessages(1);
        we();
    }

    @Deprecated
    public void Ws() {
        invalidateOptionsMenu();
    }

    final View Zo(View view, String str, Context context, AttributeSet attributeSet) {
        return this.qp.BT(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.k2);
        printWriter.print("mResumed=");
        printWriter.print(this.zh);
        printWriter.print(" mStopped=");
        printWriter.print(this.AL);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.w9);
        this.qp.lg(str2, fileDescriptor, printWriter, strArr);
        this.qp.yS().DW(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public FragmentManager getSupportFragmentManager() {
        return this.qp.yS();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
        this.qp.gW();
        int i3 = i >> 16;
        if (i3 == 0) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        String strVH = this.Z1.VH(i4);
        this.Z1.EQ(i4);
        if (strVH == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentEr = this.qp.er(strVH);
        if (fragmentEr != null) {
            fragmentEr.vJ(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strVH);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        FragmentManager fragmentManagerYS = this.qp.yS();
        boolean zVH = fragmentManagerYS.VH();
        if (!zVH || Build.VERSION.SDK_INT > 25) {
            if (zVH || !fragmentManagerYS.u7()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.qp.Hw(configuration);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.qp.j6(null);
        super.onCreate(bundle);
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            this.qp.ei(cVar.FH);
        }
        if (bundle != null) {
            this.qp.P8(bundle.getParcelable("android:support:fragments"), cVar != null ? cVar.DW : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.q7 = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.Z1 = new SparseArrayCompat<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.Z1.tp(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.Z1 == null) {
            this.Z1 = new SparseArrayCompat<>();
            this.q7 = 0;
        }
        this.qp.Zo();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.qp.VH(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        VH(false);
        this.qp.gn();
        this.qp.Mr();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.qp.u7();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.qp.EQ(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.qp.v5(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.qp.tp(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        iy.XL(this, intent);
        super.onNewIntent(intent);
        this.qp.gW();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.qp.we(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.zh = false;
        if (this.fY.hasMessages(2)) {
            this.fY.removeMessages(2);
            J0();
        }
        this.qp.J0();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.qp.J8(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.fY.removeMessages(2);
        J0();
        this.qp.rN();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : EQ(view, menu) | this.qp.Ws(menu);
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String strVH = this.Z1.VH(i3);
            this.Z1.EQ(i3);
            if (strVH == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentEr = this.qp.er(strVH);
            if (fragmentEr != null) {
                fragmentEr.FN(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strVH);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.fY.sendEmptyMessage(2);
        this.zh = true;
        this.qp.rN();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        if (this.AL) {
            VH(true);
        }
        Object objJ8 = J8();
        n nVarSI = this.qp.SI();
        SimpleArrayMap<String, t> simpleArrayMapNw = this.qp.nw();
        if (nVarSI == null && simpleArrayMapNw == null && objJ8 == null) {
            return null;
        }
        c cVar = new c();
        cVar.j6 = objJ8;
        cVar.DW = nVarSI;
        cVar.FH = simpleArrayMapNw;
        return cVar;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u7(getSupportFragmentManager(), Lifecycle.State.CREATED);
        Parcelable parcelableKD = this.qp.KD();
        if (parcelableKD != null) {
            bundle.putParcelable("android:support:fragments", parcelableKD);
        }
        if (this.Z1.we() > 0) {
            bundle.putInt("android:support:next_request_index", this.q7);
            int[] iArr = new int[this.Z1.we()];
            String[] strArr = new String[this.Z1.we()];
            for (int i = 0; i < this.Z1.we(); i++) {
                iArr[i] = this.Z1.u7(i);
                strArr[i] = this.Z1.J0(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.AL = false;
        this.w9 = false;
        this.fY.removeMessages(1);
        if (!this.k2) {
            this.k2 = true;
            this.qp.FH();
        }
        this.qp.gW();
        this.qp.rN();
        this.qp.U2();
        this.qp.aM();
        this.qp.vy();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.qp.gW();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.AL = true;
        u7(getSupportFragmentManager(), Lifecycle.State.CREATED);
        this.fY.sendEmptyMessage(1);
        this.qp.j3();
    }

    public void tp(Fragment fragment) {
    }

    void we() {
        this.qp.a8(this.hK);
        this.qp.QX();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!((f) this).jw && i != -1) {
            e.v5(i);
        }
        super.startActivityForResult(intent, i);
    }
}
