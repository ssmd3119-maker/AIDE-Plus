package org.codehaus.groovy.control.messages;

import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.syntax.SyntaxException;

/* loaded from: classes.dex */
public class SyntaxErrorMessage extends Message {
    public SyntaxErrorMessage(SyntaxException syntaxException, SourceUnit sourceUnit) {
        syntaxException.j6(sourceUnit.Zo());
    }
}
