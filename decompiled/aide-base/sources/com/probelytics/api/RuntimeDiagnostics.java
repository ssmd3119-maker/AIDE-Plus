package com.probelytics.api;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class RuntimeDiagnostics {
    protected boolean initialProbesLoadAttempted;
    protected boolean initialProbesLoadSuccess;
    protected long initialProbesLoadTime;

    public boolean getInitialProbesLoadSuccess() {
        return this.initialProbesLoadSuccess;
    }

    public long getInitialProbesLoadTime() {
        return this.initialProbesLoadTime;
    }

    public boolean hasInitialProbesLoadAttempted() {
        return this.initialProbesLoadAttempted;
    }
}
