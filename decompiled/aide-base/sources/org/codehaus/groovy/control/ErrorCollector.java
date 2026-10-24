package org.codehaus.groovy.control;

import java.util.LinkedList;
import org.codehaus.groovy.control.messages.Message;

/* loaded from: classes.dex */
public class ErrorCollector {
    protected LinkedList j6 = null;

    public ErrorCollector(CompilerConfiguration compilerConfiguration) {
    }

    public void j6(Message message) {
        if (this.j6 == null) {
            this.j6 = new LinkedList();
        }
        this.j6.add(message);
    }
}
