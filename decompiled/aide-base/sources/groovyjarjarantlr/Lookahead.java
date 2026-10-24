package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.BitSet;
import groovyjarjarantlr.collections.impl.Vector;

/* loaded from: classes.dex */
public class Lookahead implements Cloneable {
    BitSet WB;
    boolean fY;
    BitSet jw;
    String mb;

    public Lookahead() {
        this.fY = false;
        this.WB = new BitSet();
    }

    public static Lookahead Hw(int i) {
        Lookahead lookahead = new Lookahead();
        lookahead.WB.j6(i);
        return lookahead;
    }

    public boolean FH() {
        return this.fY;
    }

    public void VH() {
        this.fY = true;
    }

    public void Zo() {
        this.fY = false;
    }

    public Object clone() {
        try {
            Lookahead lookahead = (Lookahead) super.clone();
            lookahead.WB = (BitSet) this.WB.clone();
            lookahead.mb = this.mb;
            if (this.jw != null) {
                lookahead.jw = (BitSet) this.jw.clone();
            }
            return lookahead;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public String gn(String str, CharFormatter charFormatter) {
        String string;
        String strLg = this.WB.lg(str, charFormatter);
        String string2 = "";
        String str2 = FH() ? "+<epsilon>" : "";
        if (this.mb != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("; FOLLOW(");
            stringBuffer.append(this.mb);
            stringBuffer.append(")");
            string = stringBuffer.toString();
        } else {
            string = "";
        }
        if (this.jw != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("; depths=");
            stringBuffer2.append(this.jw.U2(","));
            string2 = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(strLg);
        stringBuffer3.append(str2);
        stringBuffer3.append(string);
        stringBuffer3.append(string2);
        return stringBuffer3.toString();
    }

    public void j6(Lookahead lookahead) {
        if (this.mb == null) {
            this.mb = lookahead.mb;
        }
        if (lookahead.FH()) {
            this.fY = true;
        }
        BitSet bitSet = this.jw;
        if (bitSet != null) {
            BitSet bitSet2 = lookahead.jw;
            if (bitSet2 != null) {
                bitSet.J0(bitSet2);
            }
        } else {
            BitSet bitSet3 = lookahead.jw;
            if (bitSet3 != null) {
                this.jw = (BitSet) bitSet3.clone();
            }
        }
        this.WB.J0(lookahead.WB);
    }

    public String toString() {
        String string;
        String strU2 = this.WB.U2(",");
        String string2 = "";
        String str = FH() ? "+<epsilon>" : "";
        if (this.mb != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("; FOLLOW(");
            stringBuffer.append(this.mb);
            stringBuffer.append(")");
            string = stringBuffer.toString();
        } else {
            string = "";
        }
        if (this.jw != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("; depths=");
            stringBuffer2.append(this.jw.U2(","));
            string2 = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(strU2);
        stringBuffer3.append(str);
        stringBuffer3.append(string);
        stringBuffer3.append(string2);
        return stringBuffer3.toString();
    }

    public String tp(String str, Vector vector) {
        String string;
        String strRN = this.WB.rN(str, vector);
        String string2 = "";
        if (this.mb != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("; FOLLOW(");
            stringBuffer.append(this.mb);
            stringBuffer.append(")");
            string = stringBuffer.toString();
        } else {
            string = "";
        }
        if (this.jw != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("; depths=");
            stringBuffer2.append(this.jw.U2(","));
            string2 = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(strRN);
        stringBuffer3.append(string);
        stringBuffer3.append(string2);
        return stringBuffer3.toString();
    }

    public String u7(String str, CharFormatter charFormatter, Grammar grammar) {
        return grammar instanceof LexerGrammar ? gn(str, charFormatter) : tp(str, grammar.Hw.Hw());
    }

    public Lookahead(BitSet bitSet) {
        this.fY = false;
        this.WB = bitSet;
    }

    public Lookahead(String str) {
        this();
        this.mb = str;
    }
}
