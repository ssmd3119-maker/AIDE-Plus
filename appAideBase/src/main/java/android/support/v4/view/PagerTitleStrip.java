package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;

// AIDE layouts and the manifest still use the old support library names; these
// map them to AndroidX.
public class PagerTitleStrip extends androidx.viewpager.widget.PagerTitleStrip {
    public PagerTitleStrip(Context context) {
        super(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
