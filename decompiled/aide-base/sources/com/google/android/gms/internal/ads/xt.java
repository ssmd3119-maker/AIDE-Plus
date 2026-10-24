package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

@jg
/* loaded from: classes.dex */
public final class xt {
    private long j6;

    public final long j6(ByteBuffer byteBuffer) {
        ut utVar;
        ts tsVar;
        long j = this.j6;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator<tq> it = new uo(new wt(byteBufferDuplicate), zt.FH).Zo().iterator();
            while (true) {
                utVar = null;
                if (!it.hasNext()) {
                    tsVar = null;
                    break;
                }
                tq next = it.next();
                if (next instanceof ts) {
                    tsVar = (ts) next;
                    break;
                }
            }
            Iterator<tq> it2 = tsVar.Zo().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                tq next2 = it2.next();
                if (next2 instanceof ut) {
                    utVar = (ut) next2;
                    break;
                }
            }
            long jU7 = (utVar.u7() * 1000) / utVar.tp();
            this.j6 = jU7;
            return jU7;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
