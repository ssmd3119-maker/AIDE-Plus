package abcd;

import android.graphics.Rect;

/* loaded from: classes.dex */
public class ly {
    public int DW;
    public int FH;
    public int Hw;
    public boolean VH;
    public CharSequence Zo;
    public int j6;
    public boolean v5;

    public ly(Rect rect, boolean z, CharSequence charSequence, boolean z2) {
        this.j6 = rect.left;
        this.DW = rect.top;
        this.FH = rect.width();
        this.Hw = rect.height();
        this.v5 = z;
        this.Zo = charSequence;
        this.VH = z2;
    }
}
