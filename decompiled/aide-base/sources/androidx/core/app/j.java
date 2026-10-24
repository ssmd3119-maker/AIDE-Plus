package androidx.core.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class j {
    private final k<?> j6;

    private j(k<?> kVar) {
        this.j6 = kVar;
    }

    public static final j DW(k<?> kVar) {
        return new j(kVar);
    }

    public View BT(View view, String str, Context context, AttributeSet attributeSet) {
        return this.j6.Hw.onCreateView(view, str, context, attributeSet);
    }

    public boolean EQ(MenuItem menuItem) {
        return this.j6.Hw.sy(menuItem);
    }

    public void FH() {
        this.j6.Hw.gW();
    }

    public void Hw(Configuration configuration) {
        this.j6.Hw.BT(configuration);
    }

    public void J0() {
        this.j6.Hw.lp();
    }

    public void J8(boolean z) {
        this.j6.Hw.OW(z);
    }

    public Parcelable KD() {
        return this.j6.Hw.sM();
    }

    public void Mr() {
        this.j6.Hw();
    }

    public void P8(Parcelable parcelable, n nVar) {
        this.j6.Hw.aX(parcelable, nVar);
    }

    public void QX() {
        this.j6.Hw.XX();
    }

    public n SI() {
        return this.j6.Hw.e9();
    }

    public void U2() {
        this.j6.v5();
    }

    public boolean VH(Menu menu, MenuInflater menuInflater) {
        return this.j6.Hw.ei(menu, menuInflater);
    }

    public boolean Ws(Menu menu) {
        return this.j6.Hw.br(menu);
    }

    public void XL() {
        this.j6.Hw.kQ();
    }

    public void Zo() {
        this.j6.Hw.P8();
    }

    public void a8(boolean z) {
        this.j6.Zo(z);
    }

    public void aM() {
        this.j6.Hw.yO();
    }

    public void ei(SimpleArrayMap<String, t> simpleArrayMap) {
        this.j6.lg(simpleArrayMap);
    }

    public Fragment er(String str) {
        return this.j6.Hw.Ev(str);
    }

    public void gW() {
        this.j6.Hw.sE();
    }

    public void gn() {
        this.j6.Hw.nw();
    }

    public void j3() {
        this.j6.Hw.jJ();
    }

    public void j6(Fragment fragment) {
        k<?> kVar = this.j6;
        kVar.Hw.j3(kVar, kVar, fragment);
    }

    public void lg(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.j6.VH(str, fileDescriptor, printWriter, strArr);
    }

    public SimpleArrayMap<String, t> nw() {
        return this.j6.rN();
    }

    public boolean rN() {
        return this.j6.Hw.hz();
    }

    public void tp(boolean z) {
        this.j6.Hw.ro(z);
    }

    public void u7() {
        this.j6.Hw.KD();
    }

    public boolean v5(MenuItem menuItem) {
        return this.j6.Hw.vy(menuItem);
    }

    public void vy() {
        this.j6.a8();
    }

    public void we(Menu menu) {
        this.j6.Hw.aj(menu);
    }

    public FragmentManager yS() {
        return this.j6.tp();
    }
}
