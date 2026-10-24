package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;

// AIDE layouts and the manifest still use the old support library names; these
// map them to AndroidX.
public class DrawerLayout extends androidx.drawerlayout.widget.DrawerLayout {
    public DrawerLayout(Context context) {
        super(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public DrawerLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
