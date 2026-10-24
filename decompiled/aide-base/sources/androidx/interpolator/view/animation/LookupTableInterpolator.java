package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    private final float DW;
    private final float[] j6;

    public LookupTableInterpolator(float[] fArr) {
        this.j6 = fArr;
        this.DW = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.j6;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.DW;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.j6;
        return fArr2[iMin] + (f3 * (fArr2[iMin + 1] - fArr2[iMin]));
    }
}
