package org.codehaus.groovy.control;

/* loaded from: classes.dex */
public enum CompilePhase {
    INITIALIZATION(1),
    PARSING(2),
    CONVERSION(3),
    SEMANTIC_ANALYSIS(4),
    CANONICALIZATION(5),
    INSTRUCTION_SELECTION(6),
    CLASS_GENERATION(7),
    OUTPUT(8),
    FINALIZATION(9);

    int WB;

    CompilePhase(int i) {
        this.WB = i;
    }

    public int j6() {
        return this.WB;
    }
}
