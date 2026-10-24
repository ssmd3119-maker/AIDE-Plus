package org.codehaus.groovy;

/* loaded from: classes.dex */
public class GroovyBugError extends AssertionError {
    private String WB;
    private final Exception mb;

    public GroovyBugError(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.mb;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.WB != null) {
            return "BUG! " + this.WB;
        }
        return "BUG! UNCAUGHT EXCEPTION: " + this.mb.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public GroovyBugError(String str, Exception exc) {
        this.mb = exc;
        this.WB = str;
    }
}
