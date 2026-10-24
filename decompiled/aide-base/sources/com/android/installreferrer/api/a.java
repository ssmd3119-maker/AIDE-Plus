package com.android.installreferrer.api;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class a {

    public static final class b {
        private final Context j6;

        public a j6() {
            Context context = this.j6;
            if (context != null) {
                return new InstallReferrerClientImpl(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private b(Context context) {
            this.j6 = context;
        }
    }

    public static b FH(Context context) {
        return new b(context);
    }

    public abstract c DW();

    public abstract void Hw(com.android.installreferrer.api.b bVar);

    public abstract void j6();
}
