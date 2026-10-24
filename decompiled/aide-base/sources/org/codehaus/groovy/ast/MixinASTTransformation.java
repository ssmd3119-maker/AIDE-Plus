package org.codehaus.groovy.ast;

import groovy.lang.Mixin;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.transform.AbstractASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;

@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
@Deprecated
/* loaded from: classes.dex */
public class MixinASTTransformation extends AbstractASTTransformation {
    static {
        ClassHelper.FH(Mixin.class);
    }
}
