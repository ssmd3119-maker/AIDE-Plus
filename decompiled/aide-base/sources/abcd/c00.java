package abcd;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.probelytics.api.UserActionWidget;
import com.probelytics.api.UserActionWindow;

/* loaded from: classes.dex */
public class c00 {
    public static Rect DW(Activity activity) {
        return activity == null ? new Rect() : FH(activity.getWindow().getDecorView());
    }

    public static Rect FH(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return rect.intersect(j6()) ? rect : new Rect();
    }

    public static Rect Hw(UserActionWidget userActionWidget) {
        return userActionWidget == null ? new Rect() : userActionWidget.getItemView() != null ? FH(userActionWidget.getItemView()) : FH(userActionWidget.getView());
    }

    public static Rect j6() {
        if (Build.VERSION.SDK_INT < 17) {
            return new Rect(0, 0, iy.DW().getResources().getDisplayMetrics().widthPixels, iy.DW().getResources().getDisplayMetrics().heightPixels);
        }
        Point point = new Point();
        ((WindowManager) iy.DW().getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return new Rect(0, 0, point.x, point.y);
    }

    public static Rect v5(UserActionWindow userActionWindow) {
        return FH(userActionWindow.getWindowView());
    }
}
