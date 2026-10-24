package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m2;
import com.google.android.gms.internal.measurement.n2;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class m2<MessageType extends m2<MessageType, BuilderType>, BuilderType extends n2<MessageType, BuilderType>> implements l5 {
    private static boolean zzbtj;
    protected int zzbti = 0;

    @Override // com.google.android.gms.internal.measurement.l5
    public final u2 Hw() {
        try {
            b3 b3VarGn = u2.gn(Zo());
            FH(b3VarGn.DW());
            return b3VarGn.j6();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    int tp() {
        throw new UnsupportedOperationException();
    }

    void u7(int i) {
        throw new UnsupportedOperationException();
    }
}
