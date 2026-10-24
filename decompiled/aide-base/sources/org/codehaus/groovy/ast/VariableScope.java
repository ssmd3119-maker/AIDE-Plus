package org.codehaus.groovy.ast;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class VariableScope {
    private Map<String, Variable> j6 = Collections.emptyMap();

    public VariableScope() {
        Collections.emptyMap();
        Collections.emptyMap();
    }

    public void DW(boolean z) {
    }

    public void j6(Variable variable) {
        if (this.j6 == Collections.EMPTY_MAP) {
            this.j6 = new HashMap();
        }
        this.j6.put(variable.getName(), variable);
    }
}
