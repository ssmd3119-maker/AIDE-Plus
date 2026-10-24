package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassHelper;

/* loaded from: classes.dex */
public class ConstantExpression extends Expression {
    public static final ConstantExpression AL = new ConstantExpression(null);
    private Object zh;

    static {
        new ConstantExpression(Boolean.TRUE);
        new ConstantExpression(Boolean.FALSE);
        new ConstantExpression("");
        new ConstantExpression(Boolean.TRUE, true);
        new ConstantExpression(Boolean.FALSE, true);
        new ConstantExpression(Void.class);
        new ConstantExpression(null);
    }

    public ConstantExpression(Object obj) {
        this(obj, false);
    }

    public Object j3() {
        return this.zh;
    }

    public String toString() {
        return "ConstantExpression[" + this.zh + "]";
    }

    public ConstantExpression(Object obj, boolean z) {
        this.zh = obj;
        if (obj != null) {
            if (!z) {
                aM(ClassHelper.FH(obj.getClass()));
                return;
            }
            if (obj instanceof Integer) {
                aM(ClassHelper.XL);
                return;
            }
            if (obj instanceof Long) {
                aM(ClassHelper.aM);
                return;
            }
            if (obj instanceof Boolean) {
                aM(ClassHelper.J8);
                return;
            }
            if (obj instanceof Double) {
                aM(ClassHelper.Mr);
            } else if (obj instanceof Float) {
                aM(ClassHelper.U2);
            } else {
                aM(ClassHelper.FH(obj.getClass()));
            }
        }
    }
}
