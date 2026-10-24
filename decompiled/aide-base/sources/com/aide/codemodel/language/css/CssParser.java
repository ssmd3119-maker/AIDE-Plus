package com.aide.codemodel.language.css;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Parser;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -35527017984877453L, container = -35527017984877453L, user = true)
/* loaded from: classes.dex */
public class CssParser extends Parser {

    @fy
    private static /* synthetic */ boolean a8;

    @gy
    private static /* synthetic */ boolean lg;

    static {
        iy.Zo(CssParser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -3834884428695985785L)
    public CssParser(IdentifierSpace identifierSpace, ErrorTable errorTable, EntitySpace entitySpace, Syntax syntax) {
        super(identifierSpace, errorTable, entitySpace, syntax, 100, 0);
        try {
            if (a8) {
                iy.J0(5289362748428393763L, null, identifierSpace, errorTable, entitySpace, syntax);
            }
        } catch (Throwable th) {
            if (lg) {
                iy.a8(th, 5289362748428393763L, null, identifierSpace, errorTable, entitySpace, syntax);
            }
            throw th;
        }
    }

    @ey(method = -2760622014071098188L)
    private void BT() {
        try {
            if (a8) {
                iy.gn(1126227490517726768L, this);
            }
            int i = 4;
            we();
            rN();
            gW();
            if (this.u7 != 76) {
                throw new Parser.a();
            }
            we();
            while (this.u7 != 0 && this.u7 != 64) {
                int i2 = this.j3;
                try {
                    rN();
                    ei();
                    i++;
                } catch (Parser.a unused) {
                    this.j3 = i2;
                }
            }
            if (this.u7 == 64) {
                we();
            } else {
                gn(64);
            }
            QX(120, i);
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 1126227490517726768L, this);
            }
            throw th;
        }
    }

    @ey(method = -251585751189991875L)
    private void P8() {
        try {
            if (a8) {
                iy.gn(2230732711193913255L, this);
            }
            if (this.u7 != 2 || U2(1) != 74) {
                J8();
                throw new Parser.a();
            }
            we();
            we();
            er();
            if (this.u7 == 77) {
                we();
            } else {
                gn(77);
            }
            QX(ProxyTextView.INPUTTYPE_textPostalAddress, 4);
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 2230732711193913255L, this);
            }
            throw th;
        }
    }

    @ey(method = -1446468863627325900L)
    private void SI() {
        try {
            if (a8) {
                iy.gn(2262806336927513496L, this);
            }
            int i = 1;
            nw();
            rN();
            while (this.u7 == 68) {
                we();
                rN();
                nw();
                i += 2;
            }
            QX(111, i);
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 2262806336927513496L, this);
            }
            throw th;
        }
    }

    @ey(method = -774925528889004840L)
    private void ei() {
        try {
            if (a8) {
                iy.gn(4610748321169200L, this);
            }
            SI();
            if (this.u7 != 76) {
                throw new Parser.a();
            }
            we();
            rN();
            vy();
            if (this.u7 == 64) {
                we();
            } else {
                gn(64);
            }
            rN();
            QX(110, 4);
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 4610748321169200L, this);
            }
            throw th;
        }
    }

    @ey(method = -3527090711535205152L)
    private void er() {
        try {
            if (a8) {
                iy.gn(-1270653116071995264L, this);
            }
            QX(200, yS(77, 76, 64, 0));
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, -1270653116071995264L, this);
            }
            throw th;
        }
    }

    @ey(method = 249465315781534812L)
    private void gW() {
        try {
            if (a8) {
                iy.gn(-325168739796516416L, this);
            }
            QX(121, yS(76, 64, 0));
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, -325168739796516416L, this);
            }
            throw th;
        }
    }

    @ey(method = -2036879940253513245L)
    private void nw() {
        try {
            if (a8) {
                iy.gn(700902723543341841L, this);
            }
            int i = 0;
            while (this.u7 != 68 && this.u7 != 76 && this.u7 != 0) {
                if (this.u7 == 75 && U2(1) == 2) {
                    we();
                    we();
                    QX(151, 2);
                } else if (this.u7 != 3) {
                    we();
                } else {
                    J8();
                }
                i++;
            }
            if (i == 1 && a8() == 151) {
                return;
            }
            QX(150, i);
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 700902723543341841L, this);
            }
            throw th;
        }
    }

    @ey(method = -5711222559405290200L)
    private void rN() {
        try {
            if (a8) {
                iy.gn(1127329339544755280L, this);
            }
            while (this.u7 == 3) {
                J8();
            }
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 1127329339544755280L, this);
            }
            throw th;
        }
    }

    @ey(method = -1046178714232922781L)
    private void vy() {
        try {
            if (a8) {
                iy.gn(866435946951919545L, this);
            }
            int i = 0;
            while (this.u7 != 64 && this.u7 != 0) {
                P8();
                i++;
                rN();
            }
            QX(112, i);
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 866435946951919545L, this);
            }
            throw th;
        }
    }

    @ey(method = -869502290934957939L)
    private int yS(int... iArr) {
        try {
            if (a8) {
                iy.tp(112952985355783707L, this, iArr);
            }
            int i = 0;
            while (true) {
                int i2 = this.u7;
                for (int i3 : iArr) {
                    if (i2 == i3) {
                        return i;
                    }
                }
                if (i2 == 3) {
                    J8();
                } else {
                    we();
                    i++;
                }
            }
        } catch (Throwable th) {
            if (lg) {
                iy.j3(th, 112952985355783707L, this, iArr);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Parser
    @ey(method = -1527870343152858165L)
    public void j6() {
        try {
            if (a8) {
                iy.gn(5017299769638107541L, this);
            }
            int i = 0;
            while (this.u7 != 0) {
                int i2 = this.j3;
                try {
                    rN();
                    if (this.u7 == 23) {
                        BT();
                    } else {
                        ei();
                    }
                    i++;
                } catch (Parser.a unused) {
                    this.j3 = i2;
                }
            }
            QX(100, i);
        } catch (Throwable th) {
            if (lg) {
                iy.aM(th, 5017299769638107541L, this);
            }
            throw th;
        }
    }
}
