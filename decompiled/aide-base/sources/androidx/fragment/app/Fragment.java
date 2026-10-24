package androidx.fragment.app;

import abcd.iy;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.i;
import androidx.core.app.j0;
import androidx.core.app.k;
import androidx.core.app.k0;
import androidx.core.app.m;
import androidx.core.app.n;
import androidx.core.app.u;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner {
    boolean AE;
    boolean An;
    boolean BR;
    boolean Bx;
    boolean Cz;
    boolean Gj;
    boolean IS;
    m Jl;
    LayoutInflater Jm;
    u Nh;
    boolean Pa;
    boolean Q6;
    boolean QO;
    boolean Z1;
    c Za;
    View a5;
    boolean aX;
    boolean cT;
    float ce;
    n e3;
    m eU;
    String fN;
    boolean hK;
    k iW;
    SparseArray<Parcelable> jw;
    Bundle k2;
    int kf;
    int mContainerId;
    int mFragmentId;
    Bundle mb;
    boolean n5;
    boolean oy;
    boolean pN;
    boolean q7;
    String qp;
    Fragment sE;
    ViewGroup sM;
    int w9;
    View ys;
    Fragment zh;
    private static final SimpleArrayMap<String, Class<?>> qP = new SimpleArrayMap<>();
    static final Object MP = new Object();
    int WB = 0;
    int fY = -1;
    int AL = -1;
    boolean e9 = true;
    boolean gG = true;
    LifecycleRegistry oa = new LifecycleRegistry(this);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.FH();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.core.app.i
        public View DW(int i) {
            View view = Fragment.this.a5;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // androidx.core.app.i
        public boolean FH() {
            return Fragment.this.a5 != null;
        }

        @Override // androidx.core.app.i
        public Fragment j6(Context context, String str, Bundle bundle) {
            return Fragment.this.iW.j6(context, str, bundle);
        }
    }

    static class c {
        Animator DW;
        private Object EQ;
        int FH;
        int Hw;
        private Boolean J0;
        private Boolean J8;
        j0 QX;
        private Object VH = null;
        j0 Ws;
        boolean XL;
        int Zo;
        e aM;
        private Object gn;
        boolean j3;
        View j6;
        private Object tp;
        private Object u7;
        int v5;
        private Object we;

        c() {
            Object obj = Fragment.MP;
            this.gn = obj;
            this.u7 = null;
            this.tp = obj;
            this.EQ = null;
            this.we = obj;
            this.Ws = null;
            this.QX = null;
        }
    }

    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface e {
        void DW();

        void j6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FH() {
        c cVar = this.Za;
        e eVar = null;
        if (cVar != null) {
            cVar.XL = false;
            e eVar2 = cVar.aM;
            cVar.aM = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.DW();
        }
    }

    public static Fragment ei(Context context, String str, Bundle bundle) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = qP.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                qP.put(str, clsLoadClass);
            }
            Fragment fragment = (Fragment) clsLoadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e2) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean sG(Context context, String str) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = qP.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                qP.put(str, clsLoadClass);
            }
            return Fragment.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private c v5() {
        if (this.Za == null) {
            this.Za = new c();
        }
        return this.Za;
    }

    public void AE() {
        m mVar = this.Jl;
        if (mVar == null || mVar.Z1 == null) {
            v5().XL = false;
        } else if (Looper.myLooper() != this.Jl.Z1.EQ().getLooper()) {
            this.Jl.Z1.EQ().postAtFrontOfQueue(new a());
        } else {
            FH();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View AL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.sE();
        }
        this.Q6 = true;
        return lp(layoutInflater, viewGroup, bundle);
    }

    public void BR(boolean z) throws NoSuchFieldException, Resources.NotFoundException {
        if (!this.gG && z && this.WB < 4 && this.Jl != null && SI()) {
            this.Jl.sg(this);
        }
        this.gG = z;
        this.IS = this.WB < 4 && !z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int BT() {
        c cVar = this.Za;
        if (cVar == null) {
            return 0;
        }
        return cVar.FH;
    }

    public boolean CU(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Cz(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.jw;
        if (sparseArray != null) {
            this.ys.restoreHierarchyState(sparseArray);
            this.jw = null;
        }
        this.QO = false;
        WB(bundle);
        if (this.QO) {
            return;
        }
        throw new k0("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator EQ() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.DW;
    }

    public void Eq() {
        this.QO = true;
    }

    public void Ev() {
        this.QO = true;
    }

    public void FN(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Gj(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.eU == null) {
            nw();
        }
        this.eU.aX(parcelable, this.e3);
        this.e3 = null;
        this.eU.P8();
    }

    public void I(Fragment fragment) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void IS(int i, int i2) {
        if (this.Za == null && i == 0 && i2 == 0) {
            return;
        }
        v5();
        c cVar = this.Za;
        cVar.v5 = i;
        cVar.Zo = i2;
    }

    public final FragmentManager J0() throws NoSuchFieldException, Resources.NotFoundException {
        if (this.eU == null) {
            nw();
            int i = this.WB;
            if (i >= 5) {
                this.eU.kQ();
            } else if (i >= 4) {
                this.eU.yO();
            } else if (i >= 2) {
                this.eU.gW();
            } else if (i >= 1) {
                this.eU.P8();
            }
        }
        return this.eU;
    }

    public Object J8() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.VH;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Jl() {
        this.oa.v5(Lifecycle.Event.ON_PAUSE);
        m mVar = this.eU;
        if (mVar != null) {
            mVar.lp();
        }
        this.WB = 4;
        this.QO = false;
        Eq();
        if (this.QO) {
            return;
        }
        throw new k0("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean KD() {
        return this.Cz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int Mr() {
        c cVar = this.Za;
        if (cVar == null) {
            return 0;
        }
        return cVar.Hw;
    }

    public void Mz(Context context) {
        this.QO = true;
        k kVar = this.iW;
        Activity activityGn = kVar == null ? null : kVar.gn();
        if (activityGn != null) {
            this.QO = false;
            g3(activityGn);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Nh(int i) {
        v5().FH = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P8() {
        this.fY = -1;
        this.qp = null;
        this.hK = false;
        this.cT = false;
        this.q7 = false;
        this.Z1 = false;
        this.n5 = false;
        this.kf = 0;
        this.Jl = null;
        this.eU = null;
        this.iW = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.fN = null;
        this.Gj = false;
        this.Cz = false;
        this.oy = false;
        this.Nh = null;
        this.BR = false;
        this.AE = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q6(MenuItem menuItem) {
        if (this.Gj) {
            return false;
        }
        if (this.aX && this.e9 && CU(menuItem)) {
            return true;
        }
        m mVar = this.eU;
        return mVar != null && mVar.sy(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void QO(int i, Fragment fragment) {
        this.fY = i;
        if (fragment == null) {
            this.qp = "android:fragment:" + this.fY;
            return;
        }
        this.qp = fragment.qp + ":" + this.fY;
    }

    public Object QX() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.u7;
    }

    public Animation Qq(int i, boolean z, int i2) {
        return null;
    }

    public final boolean SI() {
        return this.iW != null && this.hK;
    }

    public void Sf(Bundle bundle) {
        this.QO = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int U2() {
        c cVar = this.Za;
        if (cVar == null) {
            return 0;
        }
        return cVar.v5;
    }

    public void WB(Bundle bundle) {
        this.QO = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0 Ws() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.Ws;
    }

    public void XG(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0 XL() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.QX;
    }

    public void XX() {
        this.QO = true;
    }

    public void Xa(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z1() {
        onLowMemory();
        m mVar = this.eU;
        if (mVar != null) {
            mVar.KD();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment Zo(String str) {
        if (str.equals(this.qp)) {
            return this;
        }
        m mVar = this.eU;
        if (mVar != null) {
            return mVar.Ev(str);
        }
        return null;
    }

    public void a5(boolean z) {
        if (this.e9 != z) {
            this.e9 = z;
            if (this.aX && SI() && !ro()) {
                this.iW.U2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a8() {
        c cVar = this.Za;
        if (cVar == null) {
            return 0;
        }
        return cVar.Zo;
    }

    public final FragmentManager aM() {
        return this.Jl;
    }

    public void aj(Menu menu, MenuInflater menuInflater) {
    }

    public void aq(Menu menu) {
    }

    public void br() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cT() {
        this.QO = false;
        kQ();
        this.Jm = null;
        if (!this.QO) {
            throw new k0("Fragment " + this + " did not call through to super.onDetach()");
        }
        m mVar = this.eU;
        if (mVar != null) {
            if (this.oy) {
                mVar.nw();
                this.eU = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }

    public boolean ca(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean cb() {
        c cVar = this.Za;
        if (cVar == null) {
            return false;
        }
        return cVar.XL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean cn() {
        c cVar = this.Za;
        if (cVar == null) {
            return false;
        }
        return cVar.j3;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.fN);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.WB);
        printWriter.print(" mIndex=");
        printWriter.print(this.fY);
        printWriter.print(" mWho=");
        printWriter.print(this.qp);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.kf);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.hK);
        printWriter.print(" mRemoving=");
        printWriter.print(this.cT);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.q7);
        printWriter.print(" mInLayout=");
        printWriter.println(this.Z1);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.Gj);
        printWriter.print(" mDetached=");
        printWriter.print(this.Cz);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.e9);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.aX);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.pN);
        printWriter.print(" mRetaining=");
        printWriter.print(this.oy);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.gG);
        if (this.Jl != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.Jl);
        }
        if (this.iW != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.iW);
        }
        if (this.sE != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.sE);
        }
        if (this.k2 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.k2);
        }
        if (this.mb != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mb);
        }
        if (this.jw != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.jw);
        }
        if (this.zh != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.zh);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.w9);
        }
        if (Mr() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(Mr());
        }
        if (this.sM != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.sM);
        }
        if (this.a5 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.a5);
        }
        if (this.ys != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.a5);
        }
        if (tp() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(tp());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(BT());
        }
        if (this.Nh != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.Nh.VH(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.eU != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.eU + ":");
            this.eU.DW(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean dx() {
        m mVar = this.Jl;
        if (mVar == null) {
            return false;
        }
        return mVar.VH();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e3() {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.XX();
        }
        this.WB = 2;
        if (this.BR) {
            this.BR = false;
            if (!this.AE) {
                this.AE = true;
                this.Nh = this.iW.we(this.qp, false, false);
            }
            if (this.Nh != null) {
                if (this.iW.J0()) {
                    this.Nh.Hw();
                } else {
                    this.Nh.Zo();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e9(boolean z) {
        v5().j3 = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean eU(Menu menu) {
        boolean z = false;
        if (this.Gj) {
            return false;
        }
        if (this.aX && this.e9) {
            aq(menu);
            z = true;
        }
        m mVar = this.eU;
        return mVar != null ? z | mVar.br(menu) : z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ef() {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.sE();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Object er() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.gn == MP ? J8() : this.Za.gn;
    }

    public void et(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fN() {
        this.oa.v5(Lifecycle.Event.ON_STOP);
        m mVar = this.eU;
        if (mVar != null) {
            mVar.jJ();
        }
        this.WB = 3;
        this.QO = false;
        Ev();
        if (this.QO) {
            return;
        }
        throw new k0("Fragment " + this + " did not call through to super.onStop()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fY(Configuration configuration) {
        onConfigurationChanged(configuration);
        m mVar = this.eU;
        if (mVar != null) {
            mVar.BT(configuration);
        }
    }

    @Deprecated
    public void g3(Activity activity) {
        this.QO = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void gG(e eVar) {
        v5();
        e eVar2 = this.Za.aM;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        c cVar = this.Za;
        if (cVar.XL) {
            cVar.aM = eVar;
        }
        if (eVar != null) {
            eVar.j6();
        }
    }

    public Object gW() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.we == MP ? yS() : this.Za.we;
    }

    public final FragmentActivity getActivity() {
        k kVar = this.iW;
        if (kVar == null) {
            return null;
        }
        return (FragmentActivity) kVar.gn();
    }

    public final Bundle getArguments() {
        return this.k2;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.oa;
    }

    public boolean getSupportFragmentManager() {
        c cVar = this.Za;
        if (cVar == null || cVar.J8 == null) {
            return true;
        }
        return this.Za.J8.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void hK() {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.SI();
        }
        this.WB = 1;
        this.QO = false;
        XX();
        if (this.QO) {
            u uVar = this.Nh;
            if (uVar != null) {
                uVar.DW();
            }
            this.Q6 = false;
            return;
        }
        throw new k0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void hz(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void iW(boolean z) {
        hz(z);
        m mVar = this.eU;
        if (mVar != null) {
            mVar.OW(z);
        }
    }

    @Deprecated
    public LayoutInflater j3(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException {
        k kVar = this.iW;
        if (kVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterXL = kVar.XL();
        J0();
        m mVar = this.eU;
        mVar.qp();
        androidx.core.view.c.DW(layoutInflaterXL, mVar);
        return layoutInflaterXL;
    }

    @Deprecated
    public void jJ(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.QO = true;
    }

    public void jO() {
        this.QO = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void jw(Bundle bundle) {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.sE();
        }
        this.WB = 2;
        this.QO = false;
        Sf(bundle);
        if (this.QO) {
            m mVar2 = this.eU;
            if (mVar2 != null) {
                mVar2.gW();
                return;
            }
            return;
        }
        throw new k0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k2(Bundle bundle) {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.sE();
        }
        this.WB = 1;
        this.QO = false;
        x9(bundle);
        this.Bx = true;
        if (this.QO) {
            this.oa.v5(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new k0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void kQ() {
        this.QO = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void kf(Menu menu) {
        if (this.Gj) {
            return;
        }
        if (this.aX && this.e9) {
            Xa(menu);
        }
        m mVar = this.eU;
        if (mVar != null) {
            mVar.aj(menu);
        }
    }

    public void ko() {
        this.QO = true;
        if (this.BR) {
            return;
        }
        this.BR = true;
        if (!this.AE) {
            this.AE = true;
            this.Nh = this.iW.we(this.qp, true, false);
        } else {
            u uVar = this.Nh;
            if (uVar != null) {
                uVar.v5();
            }
        }
    }

    public Object lg() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.tp == MP ? QX() : this.Za.tp;
    }

    public View lp(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentManager mb() {
        return this.eU;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n5(boolean z) {
        et(z);
        m mVar = this.eU;
        if (mVar != null) {
            mVar.ro(z);
        }
    }

    void nw() {
        if (this.iW == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        m mVar = new m();
        this.eU = mVar;
        mVar.j3(this.iW, new b(), this);
    }

    public void oY(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.QO = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onDestroy() {
        this.QO = true;
        if (!this.AE) {
            this.AE = true;
            this.Nh = this.iW.we(this.qp, this.BR, false);
        }
        u uVar = this.Nh;
        if (uVar != null) {
            uVar.j6();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.QO = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void oy(Animator animator) {
        v5().DW = animator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pN(View view) {
        v5().j6 = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pO() {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.sE();
            this.eU.hz();
        }
        this.WB = 4;
        this.QO = false;
        ko();
        if (!this.QO) {
            throw new k0("Fragment " + this + " did not call through to super.onStart()");
        }
        m mVar2 = this.eU;
        if (mVar2 != null) {
            mVar2.yO();
        }
        u uVar = this.Nh;
        if (uVar != null) {
            uVar.FH();
        }
        this.oa.v5(Lifecycle.Event.ON_START);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater q7(Bundle bundle) {
        LayoutInflater layoutInflaterYO = yO(bundle);
        this.Jm = layoutInflaterYO;
        return layoutInflaterYO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean qp(MenuItem menuItem) {
        if (this.Gj) {
            return false;
        }
        if (ca(menuItem)) {
            return true;
        }
        m mVar = this.eU;
        return mVar != null && mVar.vy(menuItem);
    }

    public final Resources rN() {
        k kVar = this.iW;
        if (kVar != null) {
            return kVar.u7().getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final boolean ro() {
        return this.Gj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sE() {
        m mVar = this.eU;
        if (mVar != null) {
            mVar.sE();
            this.eU.hz();
        }
        this.WB = 5;
        this.QO = false;
        jO();
        if (!this.QO) {
            throw new k0("Fragment " + this + " did not call through to super.onResume()");
        }
        m mVar2 = this.eU;
        if (mVar2 != null) {
            mVar2.kQ();
            this.eU.hz();
        }
        this.oa.v5(Lifecycle.Event.ON_RESUME);
    }

    public void sM(SavedState savedState) {
        Bundle bundle;
        if (this.fY >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        if (savedState == null || (bundle = savedState.WB) == null) {
            bundle = null;
        }
        this.mb = bundle;
    }

    public void setArguments(Bundle bundle) {
        if (this.fY >= 0 && dx()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.k2 = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sg(Bundle bundle) {
        Parcelable parcelableSM;
        oY(bundle);
        m mVar = this.eU;
        if (mVar == null || (parcelableSM = mVar.sM()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", parcelableSM);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sh() {
        return this.kf > 0;
    }

    public Animator sy(int i, boolean z, int i2) {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        DebugUtils.j6(this, sb);
        if (this.fY >= 0) {
            sb.append(" #");
            sb.append(this.fY);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.fN != null) {
            sb.append(" ");
            sb.append(this.fN);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View tp() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.j6;
    }

    public boolean u7() {
        c cVar = this.Za;
        if (cVar == null || cVar.J0 == null) {
            return true;
        }
        return this.Za.J0.booleanValue();
    }

    public void vJ(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
    }

    public View vy() {
        return this.a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w9() {
        this.oa.v5(Lifecycle.Event.ON_DESTROY);
        m mVar = this.eU;
        if (mVar != null) {
            mVar.nw();
        }
        this.WB = 0;
        this.QO = false;
        this.Bx = false;
        onDestroy();
        if (this.QO) {
            this.eU = null;
            return;
        }
        throw new k0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void wc(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.QO = true;
        k kVar = this.iW;
        Activity activityGn = kVar == null ? null : kVar.gn();
        if (activityGn != null) {
            this.QO = false;
            jJ(activityGn, attributeSet, bundle);
        }
    }

    public void x9(Bundle bundle) throws NoSuchFieldException, Resources.NotFoundException {
        this.QO = true;
        Gj(bundle);
        m mVar = this.eU;
        if (mVar == null || mVar.AL(1)) {
            return;
        }
        this.eU.P8();
    }

    public LayoutInflater yO(Bundle bundle) {
        return j3(bundle);
    }

    public Object yS() {
        c cVar = this.Za;
        if (cVar == null) {
            return null;
        }
        return cVar.EQ;
    }

    public void ye(View view, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ys(int i) {
        if (this.Za == null && i == 0) {
            return;
        }
        v5().Hw = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean zh(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.Gj) {
            return false;
        }
        if (this.aX && this.e9) {
            aj(menu, menuInflater);
            z = true;
        }
        m mVar = this.eU;
        return mVar != null ? z | mVar.ei(menu, menuInflater) : z;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        final Bundle WB;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Bundle bundle) {
            this.WB = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.WB);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.WB = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }
}
