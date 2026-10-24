package org.codehaus.groovy.syntax;

import org.codehaus.groovy.GroovyException;

/* loaded from: classes.dex */
public class SyntaxException extends GroovyException {
    private final int WB;
    private final int mb;

    public SyntaxException(String str, int i, int i2, int i3, int i4) {
        super(str, false);
        this.WB = i;
        this.mb = i2;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " @ line " + this.WB + ", column " + this.mb + ".";
    }

    public void j6(String str) {
    }
}
