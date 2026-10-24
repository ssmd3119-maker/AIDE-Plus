package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.u10;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class qy<P> {
    private static final Charset FH = Charset.forName("UTF-8");
    private sy<P> DW;
    private ConcurrentMap<String, List<sy<P>>> j6 = new ConcurrentHashMap();

    protected final void DW(sy<P> syVar) {
        this.DW = syVar;
    }

    public final sy<P> FH() {
        return this.DW;
    }

    public final Collection<List<sy<P>>> Hw() {
        return this.j6.values();
    }

    protected final sy<P> j6(P p, u10.b bVar) throws GeneralSecurityException {
        byte[] bArrArray;
        int i = hy.j6[bVar.P8().ordinal()];
        if (i == 1 || i == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.BT()).array();
        } else if (i == 3) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.BT()).array();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = gy.j6;
        }
        sy<P> syVar = new sy<>(p, bArrArray, bVar.gW(), bVar.P8());
        ArrayList arrayList = new ArrayList();
        arrayList.add(syVar);
        String str = new String(syVar.DW(), FH);
        List<sy<P>> listPut = this.j6.put(str, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(syVar);
            this.j6.put(str, Collections.unmodifiableList(arrayList2));
        }
        return syVar;
    }
}
