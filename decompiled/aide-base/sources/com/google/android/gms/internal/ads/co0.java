package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class co0 {
    public final byte[] DW;
    public final Map<String, String> FH;
    public final List<yj0> Hw;
    public final int j6;
    public final boolean v5;

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public co0(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new yj0(entry.getKey(), entry.getValue()));
            }
        }
        this(i, bArr, map, arrayList, z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public co0(int i, byte[] bArr, boolean z, long j, List<yj0> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (yj0 yj0Var : list) {
                treeMap.put(yj0Var.j6(), yj0Var.DW());
            }
        }
        this(i, bArr, treeMap, list, z, j);
    }

    @Deprecated
    public co0(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private co0(int i, byte[] bArr, Map<String, String> map, List<yj0> list, boolean z, long j) {
        this.j6 = i;
        this.DW = bArr;
        this.FH = map;
        if (list == null) {
            this.Hw = null;
        } else {
            this.Hw = Collections.unmodifiableList(list);
        }
        this.v5 = z;
    }
}
