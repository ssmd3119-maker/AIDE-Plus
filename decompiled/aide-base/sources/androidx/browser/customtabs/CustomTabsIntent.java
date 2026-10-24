package androidx.browser.customtabs;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CustomTabsIntent {
    public final Bundle DW;
    public final Intent intent;

    public static final class Builder {
        private ArrayList<Bundle> DW;
        private Bundle FH;
        private ArrayList<Bundle> Hw;
        private final Intent j6;
        private boolean v5;

        public Builder() {
            this(null);
        }

        public CustomTabsIntent build() {
            ArrayList<Bundle> arrayList = this.DW;
            if (arrayList != null) {
                this.j6.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.Hw;
            if (arrayList2 != null) {
                this.j6.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.j6.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.v5);
            return new CustomTabsIntent(this.j6, this.FH);
        }

        public Builder(CustomTabsSession customTabsSession) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.j6 = intent;
            this.DW = null;
            this.FH = null;
            this.Hw = null;
            this.v5 = true;
            if (customTabsSession != null) {
                intent.setPackage(customTabsSession.DW().getPackageName());
            }
            Bundle bundle = new Bundle();
            g.DW(bundle, "android.support.customtabs.extra.SESSION", customTabsSession != null ? customTabsSession.j6() : null);
            this.j6.putExtras(bundle);
        }
    }

    private CustomTabsIntent(Intent intent, Bundle bundle) {
        this.intent = intent;
        this.DW = bundle;
    }
}
