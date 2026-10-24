package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    long WB;
    boolean fY;
    boolean jw;
    private final Runnable k2;
    boolean mb;
    private final Runnable qp;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.mb = false;
            contentLoadingProgressBar.WB = -1L;
            contentLoadingProgressBar.setVisibility(8);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.jw = false;
            if (contentLoadingProgressBar.fY) {
                return;
            }
            contentLoadingProgressBar.WB = System.currentTimeMillis();
            ContentLoadingProgressBar.this.setVisibility(0);
        }
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    private void j6() {
        removeCallbacks(this.qp);
        removeCallbacks(this.k2);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j6();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j6();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.fY = false;
        this.qp = new a();
        this.k2 = new b();
    }
}
