package org.codehaus.groovy.syntax;

import java.io.IOException;
import org.codehaus.groovy.GroovyException;

/* loaded from: classes.dex */
public class ReadException extends GroovyException {
    private final IOException WB;

    @Override // java.lang.Throwable
    public String getMessage() {
        return toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = super.getMessage();
        return (message == null || message.trim().equals("")) ? this.WB.getMessage() : message;
    }
}
