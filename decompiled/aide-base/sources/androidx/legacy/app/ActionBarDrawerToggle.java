package androidx.legacy.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    private static final int[] we = {R.attr.homeAsUpIndicator};
    private final a DW;
    private c EQ;
    private final DrawerLayout FH;
    private boolean Hw;
    private d VH;
    private Drawable Zo;
    private final int gn;
    final Activity j6;
    private final int tp;
    private final int u7;
    private boolean v5;

    @Deprecated
    public interface a {
        Drawable DW();

        void FH(int i);

        void j6(Drawable drawable, int i);
    }

    @Deprecated
    public interface b {
        a j6();
    }

    private static class c {
        Method DW;
        ImageView FH;
        Method j6;

        c(Activity activity) {
            try {
                this.j6 = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.DW = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(R.id.home);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.FH = (ImageView) childAt;
                }
            }
        }
    }

    private class d extends InsetDrawable implements Drawable.Callback {
        private final boolean WB;
        private float fY;
        private float jw;
        private final Rect mb;

        d(Drawable drawable) {
            super(drawable, 0);
            this.WB = Build.VERSION.SDK_INT > 18;
            this.mb = new Rect();
        }

        public void DW(float f) {
            this.fY = f;
            invalidateSelf();
        }

        public void FH(float f) {
            this.jw = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            copyBounds(this.mb);
            canvas.save();
            boolean z = ViewCompat.v5(ActionBarDrawerToggle.this.j6.getWindow().getDecorView()) == 1;
            int i = z ? -1 : 1;
            float fWidth = this.mb.width();
            canvas.translate((-this.fY) * fWidth * this.jw * i, 0.0f);
            if (z && !this.WB) {
                canvas.translate(fWidth, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }

        public float j6() {
            return this.jw;
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3) {
        this(activity, drawerLayout, !v5(activity), i, i2, i3);
    }

    private Drawable Zo() {
        a aVar = this.DW;
        if (aVar != null) {
            return aVar.DW();
        }
        if (Build.VERSION.SDK_INT < 18) {
            TypedArray typedArrayObtainStyledAttributes = this.j6.obtainStyledAttributes(we);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }
        ActionBar actionBar = this.j6.getActionBar();
        TypedArray typedArrayObtainStyledAttributes2 = (actionBar != null ? actionBar.getThemedContext() : this.j6).obtainStyledAttributes(null, we, R.attr.actionBarStyle, 0);
        Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(0);
        typedArrayObtainStyledAttributes2.recycle();
        return drawable2;
    }

    private void tp(Drawable drawable, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a aVar = this.DW;
        if (aVar != null) {
            aVar.j6(drawable, i);
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.j6.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            return;
        }
        if (this.EQ == null) {
            this.EQ = new c(this.j6);
        }
        c cVar = this.EQ;
        if (cVar.j6 == null) {
            ImageView imageView = cVar.FH;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            } else {
                Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator");
                return;
            }
        }
        try {
            ActionBar actionBar2 = this.j6.getActionBar();
            this.EQ.j6.invoke(actionBar2, drawable);
            this.EQ.DW.invoke(actionBar2, Integer.valueOf(i));
        } catch (Exception e) {
            Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator via JB-MR2 API", e);
        }
    }

    private void u7(int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a aVar = this.DW;
        if (aVar != null) {
            aVar.FH(i);
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.j6.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            return;
        }
        if (this.EQ == null) {
            this.EQ = new c(this.j6);
        }
        if (this.EQ.j6 != null) {
            try {
                ActionBar actionBar2 = this.j6.getActionBar();
                this.EQ.DW.invoke(actionBar2, Integer.valueOf(i));
                actionBar2.setSubtitle(actionBar2.getSubtitle());
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggle", "Couldn't set content description via JB-MR2 API", e);
            }
        }
    }

    private static boolean v5(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21 && Build.VERSION.SDK_INT >= 21;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void DW(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.VH.FH(0.0f);
        if (this.Hw) {
            u7(this.u7);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void FH(int i) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void Hw(View view, float f) {
        float fJ6 = this.VH.j6();
        this.VH.FH(f > 0.5f ? Math.max(fJ6, Math.max(0.0f, f - 0.5f) * 2.0f) : Math.min(fJ6, f * 2.0f));
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void j6(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.VH.FH(1.0f);
        if (this.Hw) {
            u7(this.tp);
        }
    }

    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!this.v5) {
            Zo();
        }
        this.Zo = ContextCompat.getDrawable(this.j6, this.gn);
        syncState();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.Hw) {
            return false;
        }
        if (this.FH.P8(8388611)) {
            this.FH.closeDrawer(8388611);
            return true;
        }
        this.FH.openDrawer(8388611);
        return true;
    }

    public void syncState() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.FH.isDrawerOpen(8388611)) {
            this.VH.FH(1.0f);
        } else {
            this.VH.FH(0.0f);
        }
        if (this.Hw) {
            tp(this.VH, this.FH.isDrawerOpen(8388611) ? this.tp : this.u7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, boolean z, int i, int i2, int i3) {
        this.Hw = true;
        this.j6 = activity;
        if (activity instanceof b) {
            this.DW = ((b) activity).j6();
        } else {
            this.DW = null;
        }
        this.FH = drawerLayout;
        this.gn = i;
        this.u7 = i2;
        this.tp = i3;
        Zo();
        this.Zo = ContextCompat.getDrawable(activity, i);
        d dVar = new d(this.Zo);
        this.VH = dVar;
        dVar.DW(z ? 0.33333334f : 0.0f);
    }
}
