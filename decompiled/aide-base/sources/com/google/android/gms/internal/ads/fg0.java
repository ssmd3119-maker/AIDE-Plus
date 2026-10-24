package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fg0 extends Exception {
    public fg0(int i) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
    }
}
