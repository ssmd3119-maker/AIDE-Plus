package org.codehaus.groovy.util;

import org.codehaus.groovy.util.AbstractConcurrentMapBase;

/* loaded from: classes.dex */
public abstract class AbstractConcurrentDoubleKeyMap<K1, K2, V> extends AbstractConcurrentMapBase {

    interface Entry<K1, K2, V> extends AbstractConcurrentMapBase.Entry<V> {
    }

    static abstract class Segment<K1, K2, V> extends AbstractConcurrentMapBase.Segment {
        Segment(int i) {
            super(i);
        }
    }
}
