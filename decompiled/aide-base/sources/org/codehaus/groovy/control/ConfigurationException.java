package org.codehaus.groovy.control;

import org.codehaus.groovy.GroovyExceptionInterface;

/* loaded from: classes.dex */
public class ConfigurationException extends RuntimeException implements GroovyExceptionInterface {
    protected Exception WB;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }
}
