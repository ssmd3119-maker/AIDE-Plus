package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
public final class v70<FieldDescriptorType> extends u70<FieldDescriptorType, Object> {
    v70(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.u70
    public final void Zo() {
        if (!j6()) {
            for (int i = 0; i < VH(); i++) {
                Map.Entry<FieldDescriptorType, Object> entryQX = QX(i);
                if (((j50) entryQX.getKey()).Ws()) {
                    entryQX.setValue(Collections.unmodifiableList((List) entryQX.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : gn()) {
                if (((j50) entry.getKey()).Ws()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.Zo();
    }
}
