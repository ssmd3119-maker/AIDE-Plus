package groovyjarjarantlr.debug;

import com.probelytics.api.UserTouchAction;
import groovyjarjarantlr.collections.impl.BitSet;
import java.util.Vector;

/* loaded from: classes.dex */
public class ParserEventSupport {
    private Vector DW;
    private ParserController EQ;
    private Vector FH;
    private ParserMatchEvent Hw;
    private SemanticPredicateEvent VH;
    private ParserTokenEvent Zo;
    private SyntacticPredicateEvent gn;
    private Vector j6;
    private NewLineEvent tp;
    private TraceEvent u7;
    private MessageEvent v5;

    public void DW(int i, ListenerBase listenerBase) {
        switch (i) {
            case 0:
                ((ParserTokenListener) listenerBase).U2(this.Zo);
                return;
            case 1:
                ((TraceListener) listenerBase).aM(this.u7);
                return;
            case 2:
                ((TraceListener) listenerBase).j3(this.u7);
                return;
            case 3:
                ((ParserTokenListener) listenerBase).vy(this.Zo);
                return;
            case 4:
                ((ParserMatchListener) listenerBase).BT(this.Hw);
                return;
            case 5:
                ((ParserMatchListener) listenerBase).we(this.Hw);
                return;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                ((ParserMatchListener) listenerBase).XL(this.Hw);
                return;
            case UserTouchAction.CLICK_KIND /* 7 */:
                ((ParserMatchListener) listenerBase).J8(this.Hw);
                return;
            case 8:
                ((MessageListener) listenerBase).gW(this.v5);
                return;
            case 9:
                ((MessageListener) listenerBase).tp(this.v5);
                return;
            case 10:
                ((SemanticPredicateListener) listenerBase).j6(this.VH);
                return;
            case 11:
                ((SyntacticPredicateListener) listenerBase).Ws(this.gn);
                return;
            case 12:
                ((SyntacticPredicateListener) listenerBase).er(this.gn);
                return;
            case 13:
                ((SyntacticPredicateListener) listenerBase).u7(this.gn);
                return;
            case 14:
                ((NewLineListener) listenerBase).Hw(this.tp);
                return;
            case 15:
                listenerBase.v5(this.u7);
                return;
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("bad type ");
                stringBuffer.append(i);
                stringBuffer.append(" for fireEvent()");
                throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public void EQ(int i, int i2, String str, int i3) {
        this.Hw.QX(ParserMatchEvent.zh, i, new Integer(i2), str, i3, true, true);
        FH(5, this.j6);
    }

    public void FH(int i, Vector vector) {
        if (vector != null) {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                DW(i, (ListenerBase) vector.elementAt(i2));
            }
        }
        ParserController parserController = this.EQ;
        if (parserController != null) {
            parserController.EQ();
        }
    }

    public void Hw(int i, int i2) {
        this.Zo.gn(ParserTokenEvent.fY, i, i2);
        FH(3, this.DW);
    }

    public void J0(char c, String str, int i) {
        this.Hw.QX(ParserMatchEvent.cT, c, str, null, i, false, true);
        FH(6, this.j6);
    }

    public void J8(int i, int i2, String str, int i3) {
        this.Hw.QX(ParserMatchEvent.zh, i, new Integer(i2), str, i3, false, false);
        FH(6, this.j6);
    }

    public void QX(String str, String str2, int i) {
        this.Hw.QX(ParserMatchEvent.hK, 0, str2, str, i, false, true);
        FH(6, this.j6);
    }

    public void VH(int i, BitSet bitSet, String str, int i2) {
        this.Hw.QX(ParserMatchEvent.AL, i, bitSet, str, i2, false, true);
        FH(4, this.j6);
    }

    public void Ws(int i, BitSet bitSet, String str, int i2) {
        this.Hw.QX(ParserMatchEvent.AL, i, bitSet, str, i2, false, true);
        FH(6, this.j6);
    }

    public void XL(char c, char c2, int i) {
        this.Hw.QX(ParserMatchEvent.w9, c, new Character(c2), null, i, true, true);
        FH(7, this.j6);
    }

    public void Zo(char c, String str, int i) {
        this.Hw.QX(ParserMatchEvent.cT, c, str, null, i, false, true);
        FH(4, this.j6);
    }

    public void aM(int i, int i2, String str, int i3) {
        this.Hw.QX(ParserMatchEvent.zh, i, new Integer(i2), str, i3, true, true);
        FH(7, this.j6);
    }

    public void gn(int i, String str, int i2) {
        this.Hw.QX(ParserMatchEvent.zh, i, new Integer(i), str, i2, false, true);
        FH(4, this.j6);
    }

    public void j3(int i) {
        this.tp.FH(i);
        FH(14, this.FH);
    }

    public void j6(int i) {
        this.Zo.gn(ParserTokenEvent.qp, 1, i);
        FH(0, this.DW);
    }

    public void tp(char c, char c2, int i) {
        this.Hw.QX(ParserMatchEvent.w9, c, new Character(c2), null, i, true, true);
        FH(5, this.j6);
    }

    public void u7(String str, int i) {
        this.Hw.QX(ParserMatchEvent.hK, 0, str, null, i, false, true);
        FH(4, this.j6);
    }

    public void v5(char c, int i) {
        this.Hw.QX(ParserMatchEvent.w9, c, new Character(c), null, i, false, true);
        FH(4, this.j6);
    }

    public void we(char c, char c2, int i) {
        this.Hw.QX(ParserMatchEvent.w9, c, new Character(c2), null, i, false, false);
        FH(6, this.j6);
    }
}
