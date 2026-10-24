package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface j extends IInterface {
    void onEvent(String str, String str2, Bundle bundle, long j);

    int ph();
}
