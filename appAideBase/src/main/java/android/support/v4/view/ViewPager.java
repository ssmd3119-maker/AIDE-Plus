package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;

// AIDE layouts and the manifest still use the old support library names; these
// map them to AndroidX.
public class ViewPager extends androidx.viewpager.widget.ViewPager {
    public ViewPager(Context context) {
        super(context);
    }

    public ViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
