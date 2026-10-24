package androidx.core.app;

import android.os.Build;
import android.util.Log;
import androidx.core.app.m;
import androidx.core.util.LogWriter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.probelytics.api.UserTouchAction;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends FragmentTransaction implements m.j {
    boolean EQ;
    int FH;
    int Hw;
    int J0;
    CharSequence J8;
    ArrayList<Runnable> Mr;
    CharSequence QX;
    int VH;
    int Ws;
    ArrayList<String> XL;
    int Zo;
    ArrayList<String> aM;
    int gn;
    final m j6;
    String tp;
    boolean u7;
    int v5;
    ArrayList<a> DW = new ArrayList<>();
    int we = -1;
    boolean j3 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a {
        Fragment DW;
        int FH;
        int Hw;
        int Zo;
        int j6;
        int v5;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        a(int i, Fragment fragment) {
            this.j6 = i;
            this.DW = fragment;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public d(m mVar) {
        this.j6 = mVar;
    }

    private void QX(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.Jl = this.j6;
        if (str != null) {
            String str2 = fragment.fN;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.fN + " now " + str);
            }
            fragment.fN = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        we(new a(i2, fragment));
    }

    private static boolean er(a aVar) {
        Fragment fragment = aVar.DW;
        return (fragment == null || !fragment.hK || fragment.a5 == null || fragment.Cz || fragment.Gj || !fragment.cb()) ? false : true;
    }

    public void BT() {
        ArrayList<Runnable> arrayList = this.Mr;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.Mr.get(i).run();
            }
            this.Mr = null;
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction DW(int i, Fragment fragment) {
        QX(i, fragment, null, 1);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction FH(int i, Fragment fragment, String str) {
        QX(i, fragment, str, 1);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction Hw(Fragment fragment, String str) {
        QX(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(int i) {
        if (this.u7) {
            if (m.e9) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.DW.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.DW.get(i2);
                Fragment fragment = aVar.DW;
                if (fragment != null) {
                    fragment.kf += i;
                    if (m.e9) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.DW + " to " + aVar.DW.kf);
                    }
                }
            }
        }
    }

    int J8(boolean z) {
        if (this.EQ) {
            throw new IllegalStateException("commit already called");
        }
        if (m.e9) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
            XL("  ", null, printWriter, null);
            printWriter.close();
        }
        this.EQ = true;
        if (this.u7) {
            this.we = this.j6.XL(this);
        } else {
            this.we = -1;
        }
        this.j6.CU(this, z);
        return this.we;
    }

    void Mr(boolean z) {
        for (int size = this.DW.size() - 1; size >= 0; size--) {
            a aVar = this.DW.get(size);
            Fragment fragment = aVar.DW;
            if (fragment != null) {
                fragment.IS(m.QO(this.VH), this.gn);
            }
            switch (aVar.j6) {
                case 1:
                    fragment.ys(aVar.Zo);
                    this.j6.Cz(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.j6);
                case 3:
                    fragment.ys(aVar.v5);
                    this.j6.QX(fragment, false);
                    break;
                case 4:
                    fragment.ys(aVar.v5);
                    this.j6.Pa(fragment);
                    break;
                case 5:
                    fragment.ys(aVar.Zo);
                    this.j6.zh(fragment);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    fragment.ys(aVar.v5);
                    this.j6.Mr(fragment);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    fragment.ys(aVar.Zo);
                    this.j6.yS(fragment);
                    break;
                case 8:
                    this.j6.AE(null);
                    break;
                case 9:
                    this.j6.AE(fragment);
                    break;
            }
            if (!this.j3 && aVar.j6 != 3 && fragment != null) {
                this.j6.Jl(fragment);
            }
        }
        if (this.j3 || !z) {
            return;
        }
        m mVar = this.j6;
        mVar.iW(mVar.q7, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment P8(java.util.ArrayList<androidx.fragment.app.Fragment> r5, androidx.fragment.app.Fragment r6) {
        /*
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.core.app.d$a> r1 = r4.DW
            int r1 = r1.size()
            if (r0 >= r1) goto L30
            java.util.ArrayList<androidx.core.app.d$a> r1 = r4.DW
            java.lang.Object r1 = r1.get(r0)
            androidx.core.app.d$a r1 = (androidx.core.app.d.a) r1
            int r2 = r1.j6
            r3 = 1
            if (r2 == r3) goto L28
            r3 = 3
            if (r2 == r3) goto L22
            switch(r2) {
                case 6: goto L22;
                case 7: goto L28;
                case 8: goto L20;
                case 9: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L2d
        L1d:
            androidx.fragment.app.Fragment r6 = r1.DW
            goto L2d
        L20:
            r6 = 0
            goto L2d
        L22:
            androidx.fragment.app.Fragment r1 = r1.DW
            r5.add(r1)
            goto L2d
        L28:
            androidx.fragment.app.Fragment r1 = r1.DW
            r5.remove(r1)
        L2d:
            int r0 = r0 + 1
            goto L1
        L30:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.d.P8(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment U2(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.core.app.d$a> r5 = r0.DW
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.core.app.d$a> r5 = r0.DW
            java.lang.Object r5 = r5.get(r4)
            androidx.core.app.d$a r5 = (androidx.core.app.d.a) r5
            int r6 = r5.j6
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.core.app.d$a> r6 = r0.DW
            androidx.core.app.d$a r7 = new androidx.core.app.d$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.DW
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.DW
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.DW
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.core.app.d$a> r3 = r0.DW
            androidx.core.app.d$a r6 = new androidx.core.app.d$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.DW
            int r9 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.core.app.d$a> r3 = r0.DW
            androidx.core.app.d$a r15 = new androidx.core.app.d$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.core.app.d$a r15 = new androidx.core.app.d$a
            r15.<init>(r10, r14)
            int r2 = r5.FH
            r15.FH = r2
            int r2 = r5.v5
            r15.v5 = r2
            int r2 = r5.Hw
            r15.Hw = r2
            int r2 = r5.Zo
            r15.Zo = r2
            java.util.ArrayList<androidx.core.app.d$a> r2 = r0.DW
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.core.app.d$a> r2 = r0.DW
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.j6 = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.DW
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.d.U2(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int VH() {
        return J8(true);
    }

    public FragmentTransaction Ws() {
        if (this.u7) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        return this;
    }

    public void XL(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aM(str, printWriter, true);
    }

    public String a8() {
        return this.tp;
    }

    public void aM(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.tp);
            printWriter.print(" mIndex=");
            printWriter.print(this.we);
            printWriter.print(" mCommitted=");
            printWriter.println(this.EQ);
            if (this.VH != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.VH));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.gn));
            }
            if (this.FH != 0 || this.Hw != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.FH));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.Hw));
            }
            if (this.v5 != 0 || this.Zo != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.v5));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.Zo));
            }
            if (this.J0 != 0 || this.J8 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.J0));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.J8);
            }
            if (this.Ws != 0 || this.QX != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.Ws));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.QX);
            }
        }
        if (this.DW.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        String str3 = str + "    ";
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.DW.get(i);
            switch (aVar.j6) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    str2 = "DETACH";
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    str2 = "cmd=" + aVar.j6;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.DW);
            if (z) {
                if (aVar.FH != 0 || aVar.Hw != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.FH));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.Hw));
                }
                if (aVar.v5 != 0 || aVar.Zo != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.v5));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.Zo));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction add(int i, Fragment fragment) {
        gW(i, fragment, null);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return J8(false);
    }

    public FragmentTransaction gW(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        QX(i, fragment, str, 2);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void gn() {
        Ws();
        this.j6.aq(this, true);
    }

    void j3() {
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.DW.get(i);
            Fragment fragment = aVar.DW;
            if (fragment != null) {
                fragment.IS(this.VH, this.gn);
            }
            switch (aVar.j6) {
                case 1:
                    fragment.ys(aVar.FH);
                    this.j6.QX(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.j6);
                case 3:
                    fragment.ys(aVar.Hw);
                    this.j6.Cz(fragment);
                    break;
                case 4:
                    fragment.ys(aVar.Hw);
                    this.j6.zh(fragment);
                    break;
                case 5:
                    fragment.ys(aVar.FH);
                    this.j6.Pa(fragment);
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    fragment.ys(aVar.Hw);
                    this.j6.yS(fragment);
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    fragment.ys(aVar.FH);
                    this.j6.Mr(fragment);
                    break;
                case 8:
                    this.j6.AE(fragment);
                    break;
                case 9:
                    this.j6.AE(null);
                    break;
            }
            if (!this.j3 && aVar.j6 != 1 && fragment != null) {
                this.j6.Jl(fragment);
            }
        }
        if (this.j3) {
            return;
        }
        m mVar = this.j6;
        mVar.iW(mVar.q7, true);
    }

    @Override // androidx.core.app.m.j
    public boolean j6(ArrayList<d> arrayList, ArrayList<Boolean> arrayList2) {
        if (m.e9) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.u7) {
            return true;
        }
        this.j6.Ws(this);
        return true;
    }

    boolean lg(int i) {
        int size = this.DW.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.DW.get(i2).DW;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    boolean rN(ArrayList<d> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.DW.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.DW.get(i4).DW;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    d dVar = arrayList.get(i6);
                    int size2 = dVar.DW.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = dVar.DW.get(i7).DW;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.we >= 0) {
            sb.append(" #");
            sb.append(this.we);
        }
        if (this.tp != null) {
            sb.append(" ");
            sb.append(this.tp);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction tp(Fragment fragment) {
        we(new a(3, fragment));
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction u7(Fragment fragment) {
        we(new a(6, fragment));
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction v5(Fragment fragment) {
        we(new a(7, fragment));
        return this;
    }

    void vy(Fragment.e eVar) {
        for (int i = 0; i < this.DW.size(); i++) {
            a aVar = this.DW.get(i);
            if (er(aVar)) {
                aVar.DW.gG(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void we(a aVar) {
        this.DW.add(aVar);
        aVar.FH = this.FH;
        aVar.Hw = this.Hw;
        aVar.v5 = this.v5;
        aVar.Zo = this.Zo;
    }

    boolean yS() {
        for (int i = 0; i < this.DW.size(); i++) {
            if (er(this.DW.get(i))) {
                return true;
            }
        }
        return false;
    }
}
