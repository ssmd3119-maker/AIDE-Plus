package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.a40;
import com.google.android.gms.internal.ads.z30;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class z30<MessageType extends z30<MessageType, BuilderType>, BuilderType extends a40<MessageType, BuilderType>> implements z60 {
    private static boolean zzfky;
    protected int zzfkx = 0;

    int DW() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final i40 Hw() {
        try {
            o40 o40VarQX = i40.QX(u7());
            VH(o40VarQX.DW());
            return o40VarQX.j6();
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

    @Override // com.google.android.gms.internal.ads.z60
    public final byte[] gn() {
        try {
            byte[] bArr = new byte[u7()];
            x40 x40VarHK = x40.hK(bArr);
            VH(x40VarHK);
            x40VarHK.XL();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    void v5(int i) {
        throw new UnsupportedOperationException();
    }
}
