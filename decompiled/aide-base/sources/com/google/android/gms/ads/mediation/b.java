package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface b {

    public static class a {
        private int j6;

        public final a DW(int i) {
            this.j6 = 1;
            return this;
        }

        public final Bundle j6() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.j6);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
