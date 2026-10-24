package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m2;
import com.google.android.gms.internal.measurement.n2;

/* loaded from: classes.dex */
public abstract class n2<MessageType extends m2<MessageType, BuilderType>, BuilderType extends n2<MessageType, BuilderType>> implements m5 {
    @Override // com.google.android.gms.internal.measurement.m5
    public final /* synthetic */ m5 aM(l5 l5Var) {
        if (!gn().getClass().isInstance(l5Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        u7((m2) l5Var);
        return this;
    }

    protected abstract BuilderType u7(MessageType messagetype);
}
