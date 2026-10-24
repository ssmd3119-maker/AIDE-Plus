package org.codehaus.groovy.control.customizers;

import java.util.LinkedList;
import org.codehaus.groovy.control.CompilePhase;

/* loaded from: classes.dex */
public class ImportCustomizer extends CompilationCustomizer {

    /* renamed from: org.codehaus.groovy.control.customizers.ImportCustomizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[ImportType.values().length];
            j6 = iArr;
            try {
                iArr[ImportType.regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                j6[ImportType.staticImport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                j6[ImportType.staticStar.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                j6[ImportType.star.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class Import {
    }

    private enum ImportType {
        regular,
        staticImport,
        staticStar,
        star
    }

    public ImportCustomizer() {
        super(CompilePhase.CONVERSION);
        new LinkedList();
    }
}
