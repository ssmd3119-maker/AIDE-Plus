package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
public final class g6<FieldDescriptorType> extends f6<FieldDescriptorType, Object> {
    g6(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final void we() {
        if (!j6()) {
            for (int i = 0; i < J0(); i++) {
                Map.Entry<FieldDescriptorType, Object> entryGn = gn(i);
                if (((x3) entryGn.getKey()).nw()) {
                    entryGn.setValue(Collections.unmodifiableList((List) entryGn.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : J8()) {
                if (((x3) entry.getKey()).nw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.we();
    }
}
