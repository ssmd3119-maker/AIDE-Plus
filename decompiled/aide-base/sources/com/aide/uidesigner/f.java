package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import com.aide.common.ClickableBorder;
import com.aide.common.ValueRunnable;
import com.aide.uidesigner.h;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@cy(clazz = -706587840109084875L, container = -706587840109084875L, user = true)
/* loaded from: classes.dex */
public class f extends ClickableBorder {

    @gy
    private static /* synthetic */ boolean Q6;

    @fy
    private static /* synthetic */ boolean n5;

    @dy(field = 1728932783690474857L)
    private Element AL;

    @dy(field = -871566903097814784L)
    private int Z1;

    @dy(field = -1894959334754137872L)
    private l cT;

    @dy(field = -3556725367138142672L)
    private c hK;

    @dy(field = 2467908523754801685L)
    private f q7;

    @dy(field = 224562302322451389L)
    private c w9;

    static {
        iy.Zo(f.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1394851282182453960L)
    public f(Context context, View view, Element element, c cVar, c cVar2, f fVar, int i, l lVar) {
        super(context, view);
        try {
            if (n5) {
                iy.QX(-1628815987762237804L, null, new Object[]{context, view, element, cVar, cVar2, fVar, new Integer(i), lVar});
            }
            this.AL = element;
            this.w9 = cVar;
            this.hK = cVar2;
            this.cT = lVar;
            this.q7 = fVar;
            this.Z1 = i;
        } catch (Throwable th) {
            if (Q6) {
                iy.rN(th, -1628815987762237804L, null, new Object[]{context, view, element, cVar, cVar2, fVar, new Integer(i), lVar});
            }
            throw th;
        }
    }

    @ey(method = 111422129680084600L)
    private void VH(b bVar, h.b bVar2) {
        try {
            if (n5) {
                iy.EQ(-262745760184814144L, this, bVar, bVar2);
            }
            String viewID = getViewID();
            if (viewID == null) {
                viewID = gW();
            }
            this.cT.EQ(getParentView().AL, bVar, this.AL, bVar2, viewID);
        } catch (Throwable th) {
            if (Q6) {
                iy.Mr(th, -262745760184814144L, this, bVar, bVar2);
            }
            throw th;
        }
    }

    @ey(method = 4149385309121686447L)
    private boolean aM() {
        try {
            if (n5) {
                iy.gn(1592452833680740647L, this);
            }
            if (this.w9 != null && (this.w9.j6 instanceof ViewGroup)) {
                if (!(this.w9.j6 instanceof AdapterView)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 1592452833680740647L, this);
            }
            throw th;
        }
    }

    @ey(method = 4637823477969056625L)
    public void BT(b bVar) {
        try {
            if (n5) {
                iy.tp(-3872641062152939447L, this, bVar);
            }
            this.cT.jw(this.AL, bVar);
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, -3872641062152939447L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -184874504044830261L)
    public void EQ(b bVar) {
        try {
            if (n5) {
                iy.tp(1158415758373284875L, this, bVar);
            }
            VH(bVar, h.FH);
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 1158415758373284875L, this, bVar);
            }
            throw th;
        }
    }

    @Override // com.aide.common.ClickableBorder
    @ey(method = -2336004718696859640L)
    protected void Hw() {
        try {
            if (n5) {
                iy.gn(-1528670939420321216L, this);
            }
            this.cT.yO(this);
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -1528670939420321216L, this);
            }
            throw th;
        }
    }

    @ey(method = 427175881738520160L)
    public boolean J0() {
        try {
            if (n5) {
                iy.gn(-2917501330826488552L, this);
            }
            if (!a8()) {
                if (getParentView().U2()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2917501330826488552L, this);
            }
            throw th;
        }
    }

    @ey(method = -2212207067390245560L)
    public boolean J8() {
        try {
            if (n5) {
                iy.gn(-2873787071630574400L, this);
            }
            return !a8();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2873787071630574400L, this);
            }
            throw th;
        }
    }

    @ey(method = -1729579274555611635L)
    public void Mr(XmlLayoutDesignActivity xmlLayoutDesignActivity) {
        try {
            if (n5) {
                iy.tp(-2329136150321508339L, this, xmlLayoutDesignActivity);
            }
            xmlLayoutDesignActivity.BT(getSourceLine(), getSourceColumn());
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, -2329136150321508339L, this, xmlLayoutDesignActivity);
            }
            throw th;
        }
    }

    @ey(method = 490188495632649144L)
    public boolean QX() {
        try {
            if (n5) {
                iy.gn(-2856060604732147600L, this);
            }
            if (!a8()) {
                if (getParentView().U2()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2856060604732147600L, this);
            }
            throw th;
        }
    }

    @ey(method = 4577314709592352184L)
    public boolean U2() {
        try {
            if (n5) {
                iy.gn(5305899016871590800L, this);
            }
            if (this.w9 != null) {
                if (this.w9.j6 instanceof RelativeLayout) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 5305899016871590800L, this);
            }
            throw th;
        }
    }

    @ey(method = -2207343267910132975L)
    public boolean Ws() {
        try {
            if (n5) {
                iy.gn(-2868549134115936999L, this);
            }
            return !a8();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2868549134115936999L, this);
            }
            throw th;
        }
    }

    @ey(method = 2509553228577979725L)
    public boolean XL() {
        try {
            if (n5) {
                iy.gn(1826432615644948693L, this);
            }
            return aM();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 1826432615644948693L, this);
            }
            throw th;
        }
    }

    @ey(method = 4215556138494385280L)
    public void Zo(String str, Intent intent) {
        try {
            if (n5) {
                iy.EQ(-2363206505147598096L, this, str, intent);
            }
            this.cT.Zo(str, intent);
        } catch (Throwable th) {
            if (Q6) {
                iy.Mr(th, -2363206505147598096L, this, str, intent);
            }
            throw th;
        }
    }

    @ey(method = -912616296657982035L)
    public boolean a8() {
        try {
            if (n5) {
                iy.gn(1610904284143631925L, this);
            }
            return this.AL.getParentNode() instanceof Document;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 1610904284143631925L, this);
            }
            throw th;
        }
    }

    @ey(method = 303576794270008584L)
    public void er(ValueRunnable<f> valueRunnable) {
        try {
            if (n5) {
                iy.tp(1509307065945923040L, this, valueRunnable);
            }
            this.cT.ye(this.AL, valueRunnable);
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 1509307065945923040L, this, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 854988456640155840L)
    public String gW() {
        try {
            if (n5) {
                iy.gn(-1747891648708810256L, this);
            }
            return this.cT.mb(this.AL);
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -1747891648708810256L, this);
            }
            throw th;
        }
    }

    @ey(method = -1031327983269915175L)
    public List<String> getAllIDs() {
        try {
            if (n5) {
                iy.gn(-233750301492986935L, this);
            }
            return this.cT.U2();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -233750301492986935L, this);
            }
            throw th;
        }
    }

    @ey(method = -414310105596766785L)
    public List<String> getAllUserDrawables() {
        try {
            if (n5) {
                iy.gn(5726123150203421175L, this);
            }
            return this.cT.a8();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 5726123150203421175L, this);
            }
            throw th;
        }
    }

    @ey(method = 5176245916415062764L)
    public List<String> getAllUserStyles() {
        try {
            if (n5) {
                iy.gn(5897349360065094236L, this);
            }
            return this.cT.lg();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 5897349360065094236L, this);
            }
            throw th;
        }
    }

    @ey(method = -1598492052132479733L)
    public List<a> getAttributes() {
        try {
            if (n5) {
                iy.gn(-4175529149073282717L, this);
            }
            return this.cT.rN(this.w9, this.hK, this.AL);
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -4175529149073282717L, this);
            }
            throw th;
        }
    }

    @ey(method = 769208434700880251L)
    public int getDepth() {
        try {
            if (n5) {
                iy.gn(1013293843477500763L, this);
            }
            return this.Z1;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 1013293843477500763L, this);
            }
            throw th;
        }
    }

    @ey(method = 3924526676539126461L)
    public String getNodeName() {
        try {
            if (n5) {
                iy.gn(526405200586421405L, this);
            }
            return this.AL.getNodeName();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 526405200586421405L, this);
            }
            throw th;
        }
    }

    @ey(method = 1509365438794834117L)
    public f getParentView() {
        try {
            if (n5) {
                iy.gn(-1068956617206192667L, this);
            }
            return this.q7;
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -1068956617206192667L, this);
            }
            throw th;
        }
    }

    @ey(method = 1691556727165794027L)
    public String getPath() {
        try {
            if (n5) {
                iy.gn(-1394422998855237901L, this);
            }
            if (this.q7 == null) {
                return getNodeName();
            }
            return this.q7.getPath() + " > " + getNodeName();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -1394422998855237901L, this);
            }
            throw th;
        }
    }

    @ey(method = 4732852398947837633L)
    public int getSourceColumn() {
        try {
            if (n5) {
                iy.gn(629531352497565041L, this);
            }
            return Integer.parseInt((String) this.AL.getUserData("column"));
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 629531352497565041L, this);
            }
            throw th;
        }
    }

    @ey(method = -1105679178650015375L)
    public int getSourceLine() {
        try {
            if (n5) {
                iy.gn(-3679638924770922367L, this);
            }
            return Integer.parseInt((String) this.AL.getUserData("line"));
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -3679638924770922367L, this);
            }
            throw th;
        }
    }

    @ey(method = 1494483031474454085L)
    public String getStyle() {
        try {
            if (n5) {
                iy.gn(1737418395914239101L, this);
            }
            return this.cT.ef(this.AL);
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 1737418395914239101L, this);
            }
            throw th;
        }
    }

    @ey(method = 1352318443728396452L)
    public String getViewID() {
        try {
            if (n5) {
                iy.gn(2146379560382166228L, this);
            }
            return this.cT.g3(this.AL);
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 2146379560382166228L, this);
            }
            throw th;
        }
    }

    @ey(method = -415314117025339125L)
    public void gn(b bVar) {
        try {
            if (n5) {
                iy.tp(917907031588883819L, this, bVar);
            }
            VH(bVar, h.Hw);
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 917907031588883819L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -2473008671583236149L)
    public void j3() {
        try {
            if (n5) {
                iy.gn(-2556865680408999701L, this);
            }
            this.cT.XL(this.AL);
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, -2556865680408999701L, this);
            }
            throw th;
        }
    }

    @ey(method = -3427833437897504559L)
    public void lg(a aVar, String str) {
        try {
            if (n5) {
                iy.EQ(1117778902033477729L, this, aVar, str);
            }
            this.cT.Eq(this.AL, aVar.j6, str);
        } catch (Throwable th) {
            if (Q6) {
                iy.Mr(th, 1117778902033477729L, this, aVar, str);
            }
            throw th;
        }
    }

    @ey(method = -107078739620634045L)
    public void rN(a aVar, f fVar, String str) {
        try {
            if (n5) {
                iy.we(177431308788048107L, this, aVar, fVar, str);
            }
            this.cT.aq(this.AL, aVar.j6, fVar == null ? null : fVar.AL, str);
        } catch (Throwable th) {
            if (Q6) {
                iy.U2(th, 177431308788048107L, this, aVar, fVar, str);
            }
            throw th;
        }
    }

    @ey(method = -30215363165393605L)
    public void setStyle(String str) {
        try {
            if (n5) {
                iy.tp(971021530899392667L, this, str);
            }
            this.cT.jO(this.AL, str);
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 971021530899392667L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 558443873907597240L)
    public void setViewID(String str) {
        try {
            if (n5) {
                iy.tp(-597241802526823664L, this, str);
            }
            this.cT.oY(this.AL, str);
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, -597241802526823664L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3501161637931272000L)
    public void tp(b bVar) {
        try {
            if (n5) {
                iy.tp(-4022161658055400264L, this, bVar);
            }
            if (getParentView().U2()) {
                VH(bVar, h.j6);
            } else {
                this.cT.u7(this.AL, bVar);
            }
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, -4022161658055400264L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 1107366139133255989L)
    public void u7(b bVar) {
        try {
            if (n5) {
                iy.tp(521311967931615669L, this, bVar);
            }
            if (getParentView().U2()) {
                VH(bVar, h.DW);
            } else {
                this.cT.gn(this.AL, bVar);
            }
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 521311967931615669L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -4063961297347554352L)
    public void we(b bVar) {
        try {
            if (n5) {
                iy.tp(3675099219237646200L, this, bVar);
            }
            this.cT.tp(this.AL, bVar);
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 3675099219237646200L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -96988480342253880L)
    public String yS() {
        try {
            if (n5) {
                iy.gn(56860918993370208L, this);
            }
            return this.cT.WB();
        } catch (Throwable th) {
            if (Q6) {
                iy.aM(th, 56860918993370208L, this);
            }
            throw th;
        }
    }
}
