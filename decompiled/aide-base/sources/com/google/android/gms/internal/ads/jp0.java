package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class jp0 implements ThreadFactory {
    private final /* synthetic */ String j6;

    jp0(String str) {
        this.j6 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.j6);
    }
}
