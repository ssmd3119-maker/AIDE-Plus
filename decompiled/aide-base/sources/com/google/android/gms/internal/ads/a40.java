package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.a40;
import com.google.android.gms.internal.ads.z30;

/* loaded from: classes.dex */
public abstract class a40<MessageType extends z30<MessageType, BuilderType>, BuilderType extends a40<MessageType, BuilderType>> implements a70 {
    protected abstract BuilderType tp(MessageType messagetype);

    @Override // com.google.android.gms.internal.ads.a70
    public final /* synthetic */ a70 vy(z60 z60Var) {
        if (!Zo().getClass().isInstance(z60Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        tp((z30) z60Var);
        return this;
    }
}
