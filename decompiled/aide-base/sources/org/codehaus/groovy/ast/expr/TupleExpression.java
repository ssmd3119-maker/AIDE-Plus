package org.codehaus.groovy.ast.expr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class TupleExpression extends Expression implements Iterable<Expression> {
    private List<Expression> zh;

    public TupleExpression() {
        this(0);
    }

    @Override // java.lang.Iterable
    public Iterator<Expression> iterator() {
        return Collections.unmodifiableList(this.zh).iterator();
    }

    public String toString() {
        return super.toString() + this.zh;
    }

    public TupleExpression(int i) {
        this.zh = new ArrayList(i);
    }
}
