package org.codehaus.groovy.util;

/* loaded from: classes.dex */
public class ComplexKeyHashMap {

    /* renamed from: org.codehaus.groovy.util.ComplexKeyHashMap$1, reason: invalid class name */
    public class AnonymousClass1 implements EntryIterator {
    }

    public static class Entry {
    }

    public interface EntryIterator {
    }

    public ComplexKeyHashMap() {
        j6(32);
    }

    public void j6(int i) {
        int i2 = (i * 6) / 8;
        Entry[] entryArr = new Entry[i];
    }
}
