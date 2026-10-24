package groovyjarjarantlr.collections.impl;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class LLEnumeration implements Enumeration {
    LLCell j6;

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.j6 != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        if (!hasMoreElements()) {
            throw new NoSuchElementException();
        }
        LLCell lLCell = this.j6;
        this.j6 = lLCell.DW;
        return lLCell.j6;
    }
}
