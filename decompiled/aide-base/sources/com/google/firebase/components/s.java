package com.google.firebase.components;

import abcd.kx;
import abcd.nx;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class s extends i {
    private final Set<Class<?>> DW;
    private final Set<Class<?>> FH;
    private final b Hw;
    private final Set<Class<?>> j6;

    static class a implements kx {
        public a(Set<Class<?>> set, kx kxVar) {
        }
    }

    s(com.google.firebase.components.a<?> aVar, b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (e eVar : aVar.Zo()) {
            if (eVar.Hw()) {
                hashSet.add(eVar.DW());
            } else {
                hashSet2.add(eVar.DW());
            }
        }
        if (!aVar.gn().isEmpty()) {
            hashSet.add(kx.class);
        }
        this.j6 = Collections.unmodifiableSet(hashSet);
        this.DW = Collections.unmodifiableSet(hashSet2);
        this.FH = aVar.gn();
        this.Hw = bVar;
    }

    @Override // com.google.firebase.components.b
    public final <T> nx<T> DW(Class<T> cls) {
        if (this.DW.contains(cls)) {
            return this.Hw.DW(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", cls));
    }

    @Override // com.google.firebase.components.i, com.google.firebase.components.b
    public final <T> T j6(Class<T> cls) {
        if (!this.j6.contains(cls)) {
            throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", cls));
        }
        T t = (T) this.Hw.j6(cls);
        return !cls.equals(kx.class) ? t : (T) new a(this.FH, (kx) t);
    }
}
