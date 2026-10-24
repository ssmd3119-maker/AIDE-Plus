package org.codehaus.groovy.util;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public class ReferenceBundle {
    private static final ReferenceBundle FH;
    private static final ReferenceBundle Hw;
    private ReferenceType DW;
    private ReferenceManager j6;

    static {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        ReferenceManager referenceManagerHw = ReferenceManager.Hw(referenceQueue, ReferenceManager.DW(referenceQueue), 5000);
        FH = new ReferenceBundle(referenceManagerHw, ReferenceType.SOFT);
        Hw = new ReferenceBundle(referenceManagerHw, ReferenceType.WEAK);
        ReferenceType referenceType = ReferenceType.PHANTOM;
        ReferenceManager.FH(null);
        ReferenceType referenceType2 = ReferenceType.HARD;
    }

    public ReferenceBundle(ReferenceManager referenceManager, ReferenceType referenceType) {
        this.j6 = referenceManager;
        this.DW = referenceType;
    }

    public static ReferenceBundle DW() {
        return FH;
    }

    public static ReferenceBundle Hw() {
        return Hw;
    }

    public ReferenceType FH() {
        return this.DW;
    }

    public ReferenceManager j6() {
        return this.j6;
    }
}
