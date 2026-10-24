package org.codehaus.groovy.ast.expr;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.groovy.ast.ClassHelper;

/* loaded from: classes.dex */
public class MapExpression extends Expression {
    private final List<MapEntryExpression> zh;

    public MapExpression() {
        this(new ArrayList());
    }

    public String toString() {
        return super.toString() + this.zh;
    }

    public MapExpression(List<MapEntryExpression> list) {
        this.zh = list;
        aM(ClassHelper.gn);
    }
}
