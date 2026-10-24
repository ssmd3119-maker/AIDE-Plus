package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class h {
    private int DW;
    private final ViewGroup j6;

    public h(ViewGroup viewGroup) {
        this.j6 = viewGroup;
    }

    public void DW(View view, View view2, int i) {
        FH(view, view2, i, 0);
    }

    public void FH(View view, View view2, int i, int i2) {
        this.DW = i;
    }

    public void Hw(View view) {
        v5(view, 0);
    }

    public int j6() {
        return this.DW;
    }

    public void v5(View view, int i) {
        this.DW = 0;
    }
}
