package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public class StaticMethodCallExpression extends Expression implements MethodCall {
    private String AL;
    private Expression w9;
    private ClassNode zh;

    public ClassNode j3() {
        return this.zh;
    }

    public String toString() {
        return super.toString() + "[" + j3().getName() + "#" + this.AL + " arguments: " + this.w9 + "]";
    }
}
