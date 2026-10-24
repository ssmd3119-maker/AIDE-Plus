package groovyjarjarantlr;

import groovyjarjarantlr.ASdebug.IASDebugStream;
import groovyjarjarantlr.collections.impl.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class TokenStreamRewriteEngine implements TokenStream, IASDebugStream {
    protected Map DW;
    protected int FH;
    protected TokenStream Hw;
    protected List j6;
    protected BitSet v5;

    /* renamed from: groovyjarjarantlr.TokenStreamRewriteEngine$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int i = ((RewriteOperation) obj).j6;
            int i2 = ((RewriteOperation) obj2).j6;
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
    }

    static class DeleteOp extends ReplaceOp {
    }

    static class InsertBeforeOp extends RewriteOperation {
        @Override // groovyjarjarantlr.TokenStreamRewriteEngine.RewriteOperation
        public int j6(StringBuffer stringBuffer) {
            stringBuffer.append(this.DW);
            return this.j6;
        }
    }

    static class ReplaceOp extends RewriteOperation {
        protected int FH;

        @Override // groovyjarjarantlr.TokenStreamRewriteEngine.RewriteOperation
        public int j6(StringBuffer stringBuffer) {
            String str = this.DW;
            if (str != null) {
                stringBuffer.append(str);
            }
            return this.FH + 1;
        }
    }

    static class RewriteOperation {
        protected String DW;
        protected int j6;

        public int j6(StringBuffer stringBuffer) {
            return this.j6;
        }

        public String toString() {
            String name = getClass().getName();
            String strSubstring = name.substring(name.indexOf(36) + 1, name.length());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strSubstring);
            stringBuffer.append("@");
            stringBuffer.append(this.j6);
            stringBuffer.append('\"');
            stringBuffer.append(this.DW);
            stringBuffer.append('\"');
            return stringBuffer.toString();
        }
    }

    public TokenWithIndex DW(int i) {
        return (TokenWithIndex) this.j6.get(i);
    }

    public int FH() {
        return this.j6.size();
    }

    public int Hw() {
        return this.j6.size();
    }

    public String VH(String str, int i, int i2) {
        List list = (List) this.DW.get(str);
        if (list == null || list.size() == 0) {
            return v5(i, i2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 0;
        while (i >= 0 && i <= i2 && i < this.j6.size()) {
            if (i3 < list.size()) {
                RewriteOperation rewriteOperation = (RewriteOperation) list.get(i3);
                while (rewriteOperation.j6 < i && i3 < list.size()) {
                    i3++;
                    if (i3 < list.size()) {
                        rewriteOperation = (RewriteOperation) list.get(i3);
                    }
                }
                while (i == rewriteOperation.j6 && i3 < list.size()) {
                    i = rewriteOperation.j6(stringBuffer);
                    i3++;
                    if (i3 < list.size()) {
                        rewriteOperation = (RewriteOperation) list.get(i3);
                    }
                }
            }
            if (i <= i2) {
                stringBuffer.append(DW(i).j6());
                i++;
            }
        }
        while (i3 < list.size()) {
            RewriteOperation rewriteOperation2 = (RewriteOperation) list.get(i3);
            if (rewriteOperation2.j6 >= Hw()) {
                rewriteOperation2.j6(stringBuffer);
            }
            i3++;
        }
        return stringBuffer.toString();
    }

    public String Zo(int i, int i2) {
        return VH("default", i, i2);
    }

    @Override // groovyjarjarantlr.TokenStream
    public Token j6() {
        TokenWithIndex tokenWithIndex;
        do {
            tokenWithIndex = (TokenWithIndex) this.Hw.j6();
            if (tokenWithIndex != null) {
                tokenWithIndex.EQ(this.FH);
                if (tokenWithIndex.Hw() != 1) {
                    this.j6.add(tokenWithIndex);
                }
                this.FH++;
            }
            if (tokenWithIndex == null) {
                break;
            }
        } while (this.v5.gn(tokenWithIndex.Hw()));
        return tokenWithIndex;
    }

    public String toString() {
        return Zo(0, FH() - 1);
    }

    public String v5(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        while (i >= 0 && i <= i2 && i < this.j6.size()) {
            stringBuffer.append(DW(i).j6());
            i++;
        }
        return stringBuffer.toString();
    }
}
