package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Syntax;

@cy(clazz = 124169490244666167L, container = 124169490244666167L, user = true)
/* loaded from: classes.dex */
public abstract class Parser {

    @fy
    private static /* synthetic */ boolean Mr;

    @gy
    private static /* synthetic */ boolean U2;

    @dy(field = -639764972249128061L)
    protected final ErrorTable DW;

    @dy(field = 3878940098194349235L)
    protected int EQ;

    @dy(field = 4806766380864976011L)
    protected final IdentifierSpace FH;

    @dy(field = -771520953783836816L)
    private boolean Hw;

    @dy(field = 1094939260146292405L)
    protected int[] J0;

    @dy(field = -2692041844269217696L)
    protected int[] J8;

    @dy(field = 5203750808569409764L)
    protected int[] QX;

    @dy(field = 2582965753194724296L)
    protected boolean VH;

    @dy(field = -1410840465421801275L)
    protected int[] Ws;

    @dy(field = 4426913019366570801L)
    protected int[] XL;

    @dy(field = -1455695039483370907L)
    private int Zo;

    @dy(field = 3790042629748569265L)
    protected int[] aM;

    @dy(field = -1456585251406249295L)
    protected SyntaxTree gn;

    @dy(field = 4030436532707917423L)
    protected int j3;

    @dy(field = 2159239594396043268L)
    protected final Syntax j6;

    @dy(field = 2852311312572900777L)
    protected int tp;

    @dy(field = -2636719083277406208L)
    protected int u7;

    @dy(field = -3411445788856780548L)
    private int v5;

    @dy(field = 3133548740757660045L)
    protected int[] we;

    @cy(clazz = 2151048945341623285L, container = 2151048945341623285L, user = true)
    public static class a extends Exception {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -3392619905633933164L)
        public a() {
            try {
                if (WB) {
                    iy.gn(-4501274913595444005L, null);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -4501274913595444005L, null);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(Parser.class);
    }

    @ey(method = -2123326317762965869L)
    public Parser(IdentifierSpace identifierSpace, ErrorTable errorTable, EntitySpace entitySpace, Syntax syntax, int i, int i2) {
        try {
            if (Mr) {
                iy.QX(2556982381397340000L, null, new Object[]{identifierSpace, errorTable, entitySpace, syntax, new Integer(i), new Integer(i2)});
            }
            this.aM = new int[10000];
            this.DW = errorTable;
            this.FH = identifierSpace;
            this.j6 = syntax;
            this.v5 = i;
            this.Zo = i2;
        } catch (Throwable th) {
            if (U2) {
                iy.rN(th, 2556982381397340000L, null, new Object[]{identifierSpace, errorTable, entitySpace, syntax, new Integer(i), new Integer(i2)});
            }
            throw th;
        }
    }

    @ey(method = 1896356021634659457L)
    public void DW(String str) {
        int i;
        int i2;
        try {
            if (Mr) {
                iy.tp(-4405401829567086295L, this, str);
            }
            if (this.VH) {
                if (this.tp > 0) {
                    i = this.Ws[this.tp - 1];
                    i2 = this.XL[this.tp - 1];
                } else {
                    i = this.J8[this.tp];
                    i2 = this.QX[this.tp];
                }
                int i3 = i2 - 1;
                int i4 = i;
                this.DW.j3(this.gn.getFile(), this.gn.getLanguage(), i4, i3, i4, i3 + 2, str, 0);
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -4405401829567086295L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1472550081801976667L)
    public void EQ(int i, int i2) {
        try {
            if (Mr) {
                iy.EQ(-281104476381136211L, this, new Integer(i), new Integer(i2));
            }
            aM(i, true, i2);
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, -281104476381136211L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 863853519216458168L)
    public void FH(int i) {
        int i2;
        int i3;
        try {
            if (Mr) {
                iy.u7(-910837666801806960L, this, i);
            }
            if (this.VH) {
                if (this.tp > 0) {
                    i2 = this.Ws[this.tp - 1];
                    i3 = this.XL[this.tp - 1];
                } else {
                    i2 = this.J8[this.tp];
                    i3 = this.QX[this.tp];
                }
                int i4 = i3 - 1;
                int i5 = i4 + 2;
                String string = this.j6.getString(i);
                this.DW.j3(this.gn.getFile(), this.gn.getLanguage(), i2, i4, i2, i5, "Missing </C>" + string + "<//C>", 0);
                int i6 = i4 + 1;
                this.DW.Ws(this.gn.getFile(), this.gn.getLanguage(), i2, i6, i2, i6, string, "Insert '" + string + "'");
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -910837666801806960L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3752348428494758548L)
    public void Hw() {
        try {
            if (Mr) {
                iy.gn(-3235653410013790784L, this);
            }
            if (this.VH) {
                int i = this.J8[this.tp];
                int i2 = this.QX[this.tp];
                int i3 = this.XL[this.tp];
                String string = this.j6.getString(this.u7);
                this.DW.j3(this.gn.getFile(), this.gn.getLanguage(), i, i2, i, i3, "Unexpected </C>" + string + "<//C>", 0);
            }
        } catch (Throwable th) {
            if (U2) {
                iy.aM(th, -3235653410013790784L, this);
            }
            throw th;
        }
    }

    @ey(method = -215528572066294264L)
    public void J0(int i) {
        try {
            if (Mr) {
                iy.u7(-7749183810588027552L, this, i);
            }
            if (this.u7 != i) {
                if (this.Hw) {
                    int i2 = this.j3 + 1;
                    this.j3 = i2;
                    if (i2 >= this.aM.length) {
                        int[] iArr = new int[(this.aM.length * 2) + 1];
                        System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                        this.aM = iArr;
                    }
                    if (this.j6.I(i)) {
                        this.aM[this.j3] = this.gn.declareNode(i, true, this.J8[this.tp], this.QX[this.tp], this.Ws[this.tp], this.XL[this.tp]);
                    } else {
                        this.aM[this.j3] = this.gn.rN(i, true, this.J8[this.tp], this.QX[this.tp], this.XL[this.tp]);
                    }
                }
                FH(i);
                return;
            }
            if (this.Hw) {
                int i3 = this.j3 + 1;
                this.j3 = i3;
                if (i3 >= this.aM.length) {
                    int[] iArr2 = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr2, 0, this.aM.length);
                    this.aM = iArr2;
                }
                if (this.j6.I(this.u7)) {
                    this.aM[this.j3] = this.gn.declareNode(this.u7, false, this.J8[this.tp], this.QX[this.tp], this.Ws[this.tp], this.XL[this.tp]);
                } else {
                    this.aM[this.j3] = this.gn.rN(this.u7, false, this.J8[this.tp], this.QX[this.tp], this.XL[this.tp]);
                }
            }
            if (this.tp < this.EQ) {
                int i4 = this.tp + 1;
                this.tp = i4;
                this.u7 = this.we[i4];
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -7749183810588027552L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -757368751391587205L)
    public void J8() {
        try {
            if (Mr) {
                iy.gn(211340623713319919L, this);
            }
            if (this.tp < this.EQ) {
                int i = this.tp + 1;
                this.tp = i;
                this.u7 = this.we[i];
            }
        } catch (Throwable th) {
            if (U2) {
                iy.aM(th, 211340623713319919L, this);
            }
            throw th;
        }
    }

    @ey(method = -4063637893459125633L)
    public void Mr(int i, boolean z, int i2) {
        try {
            if (Mr) {
                iy.we(-2248176318411063717L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            if (this.Hw) {
                int iDeclareNode = this.gn.declareNode(i, z, this.aM, (this.j3 - i2) + 1, i2, this.J8[this.tp], this.QX[this.tp]);
                int i3 = (this.j3 - i2) + 1;
                this.j3 = i3;
                if (i3 >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                this.aM[this.j3] = iDeclareNode;
            }
        } catch (Throwable th) {
            if (U2) {
                iy.U2(th, -2248176318411063717L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -366642762537592224L)
    public void QX(int i, int i2) {
        try {
            if (Mr) {
                iy.EQ(-5771426013190878856L, this, new Integer(i), new Integer(i2));
            }
            aM(i, false, i2);
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, -5771426013190878856L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -195057312006026288L)
    public int U2(int i) {
        try {
            if (Mr) {
                iy.u7(-5609276059107571848L, this, i);
            }
            int i2 = this.tp + i;
            return i2 < this.EQ ? this.we[i2] : this.Zo;
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -5609276059107571848L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -108504334746612720L)
    public int VH(int i) {
        try {
            if (Mr) {
                iy.u7(-4552738793638896544L, this, i);
            }
            int i2 = this.tp + i;
            if (i2 < this.EQ) {
                return this.J0[i2];
            }
            return 0;
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -4552738793638896544L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1653945322325760596L)
    public void Ws(int i) {
        try {
            if (Mr) {
                iy.u7(-580628100788316288L, this, i);
            }
            if (this.u7 != i) {
                FH(i);
            } else if (this.tp < this.EQ) {
                int i2 = this.tp + 1;
                this.tp = i2;
                this.u7 = this.we[i2];
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -580628100788316288L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -577752007578207501L)
    public void XL(int i, int i2, int i3) {
        int i4;
        int i5;
        try {
            if (Mr) {
                iy.we(-3616143964656995205L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.Hw) {
                if (this.tp > 0) {
                    i4 = this.J8[this.tp - 1];
                    i5 = this.XL[this.tp - 1];
                } else {
                    i4 = this.J8[this.tp];
                    i5 = this.QX[this.tp];
                }
                int iDeclareNode = this.gn.declareNode(i, false, this.aM, ((this.j3 - i3) - i2) + 1, i3, i4, i5);
                System.arraycopy(this.aM, (this.j3 - i2) + 1, this.aM, ((this.j3 - i2) - i3) + 2, i2);
                int i6 = (this.j3 - i3) + 1;
                this.j3 = i6;
                if (i6 >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                this.aM[this.j3 - i2] = iDeclareNode;
            }
        } catch (Throwable th) {
            if (U2) {
                iy.U2(th, -3616143964656995205L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 577722138556150525L)
    public int Zo() {
        try {
            if (Mr) {
                iy.gn(1994884584143556105L, this);
            }
            return this.J0[this.tp];
        } catch (Throwable th) {
            if (U2) {
                iy.aM(th, 1994884584143556105L, this);
            }
            throw th;
        }
    }

    @ey(method = 1958099669883580131L)
    public int a8() {
        try {
            if (Mr) {
                iy.gn(1753937972425972563L, this);
            }
            return this.aM[this.j3];
        } catch (Throwable th) {
            if (U2) {
                iy.aM(th, 1753937972425972563L, this);
            }
            throw th;
        }
    }

    @ey(method = 1064440989616909593L)
    public void aM(int i, boolean z, int i2) {
        int i3;
        int i4;
        try {
            if (Mr) {
                iy.we(7916207218309642237L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            if (this.Hw) {
                if (this.tp > 0) {
                    i3 = this.Ws[this.tp - 1];
                    i4 = this.XL[this.tp - 1];
                } else {
                    i3 = this.J8[this.tp];
                    i4 = this.QX[this.tp];
                }
                int iDeclareNode = this.gn.declareNode(i, z, this.aM, (this.j3 - i2) + 1, i2, i3, i4);
                int i5 = (this.j3 - i2) + 1;
                this.j3 = i5;
                if (i5 >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                this.aM[this.j3] = iDeclareNode;
            }
        } catch (Throwable th) {
            if (U2) {
                iy.U2(th, 7916207218309642237L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 46468429612263600L)
    public void gn(int i) {
        try {
            if (Mr) {
                iy.u7(-6601774980360144372L, this, i);
            }
            if (this.Hw) {
                int i2 = this.j3 + 1;
                this.j3 = i2;
                if (i2 >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                this.aM[this.j3] = this.gn.rN(i, true, this.J8[this.tp], this.QX[this.tp], this.XL[this.tp]);
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -6601774980360144372L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2329444839209796720L)
    public void j3(int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        try {
            if (Mr) {
                iy.J0(-2734554676045016088L, this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3));
            }
            if (this.Hw) {
                if (this.tp > 0) {
                    i4 = this.J8[this.tp - 1];
                    i5 = this.XL[this.tp - 1];
                } else {
                    i4 = this.J8[this.tp];
                    i5 = this.QX[this.tp];
                }
                int i6 = i4;
                int i7 = i5;
                int iDeclareNode = i3 != -1 ? this.gn.declareNode(i, z, this.aM, (this.j3 - i2) + 1, i2, i6, i7, i3) : this.gn.declareNode(i, z, this.aM, (this.j3 - i2) + 1, i2, i6, i7);
                int i8 = (this.j3 - i2) + 1;
                this.j3 = i8;
                if (i8 >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                this.aM[this.j3] = iDeclareNode;
            }
        } catch (Throwable th) {
            if (U2) {
                iy.a8(th, -2734554676045016088L, this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3676875553635679725L)
    public abstract void j6();

    @ey(method = 4384934834712854128L)
    public void lg(int i) {
        int i2;
        int i3;
        try {
            if (Mr) {
                iy.u7(1678205529904752552L, this, i);
            }
            if (this.VH) {
                if (this.tp > 0) {
                    i2 = this.Ws[this.tp - 1];
                    i3 = this.XL[this.tp - 1];
                } else {
                    i2 = this.J8[this.tp];
                    i3 = this.QX[this.tp];
                }
                int i4 = i3 - 1;
                int i5 = i4 + 2;
                String string = this.j6.getString(i);
                this.DW.j3(this.gn.getFile(), this.gn.getLanguage(), i2, i4, i2, i5, "Missing </C>" + string + "<//C>", 1);
                int i6 = i4 + 1;
                this.DW.Ws(this.gn.getFile(), this.gn.getLanguage(), i2, i6, i2, i6, string, "Insert '" + string + "'");
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, 1678205529904752552L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 420587201319770496L)
    public void tp(int i, int i2) {
        int i3;
        int i4;
        try {
            if (Mr) {
                iy.EQ(2597456785602609504L, this, new Integer(i), new Integer(i2));
            }
            if (this.Hw) {
                if (this.tp > 0) {
                    i3 = this.J8[this.tp - 1];
                    i4 = this.XL[this.tp - 1];
                } else {
                    i3 = this.J8[this.tp];
                    i4 = this.QX[this.tp];
                }
                int i5 = i3;
                int i6 = i4;
                int i7 = this.j3 + 1;
                this.j3 = i7;
                if (i7 >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                this.aM[this.j3] = this.gn.declareNode(i, true, i2, i5, i6, i5, i6);
            }
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, 2597456785602609504L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 268959459321191925L)
    public void u7(int i, int i2) {
        try {
            if (Mr) {
                iy.EQ(-4494260712112960779L, this, new Integer(i), new Integer(i2));
            }
            if (this.Hw) {
                int i3 = this.j3 + 1;
                this.j3 = i3;
                if (i3 >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                this.aM[this.j3] = this.gn.declareNode(i, true, i2, this.J8[this.tp], this.QX[this.tp], this.Ws[this.tp], this.XL[this.tp]);
            }
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, -4494260712112960779L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2377902680718323939L)
    public void v5(SyntaxTreeStyles syntaxTreeStyles, FileEntry fileEntry, boolean z, SyntaxTree syntaxTree) {
        try {
            if (Mr) {
                iy.J0(-3281760867051586701L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            try {
                try {
                    syntaxTree.Fd(syntaxTreeStyles);
                    int[] iArr = syntaxTreeStyles.syntaxTags;
                    this.we = iArr;
                    this.J0 = syntaxTreeStyles.DW;
                    this.J8 = syntaxTreeStyles.startLines;
                    this.Ws = syntaxTreeStyles.endLines;
                    this.QX = syntaxTreeStyles.startColumns;
                    this.XL = syntaxTreeStyles.endColumns;
                    this.EQ = syntaxTreeStyles.size - 1;
                    this.gn = syntaxTree;
                    this.VH = z;
                    this.Hw = true;
                    this.j3 = -1;
                    this.tp = 0;
                    this.u7 = iArr[0];
                    j6();
                    syntaxTree.U2(this.aM[0]);
                } catch (a unused) {
                    syntaxTree.U2(syntaxTree.declareNode(this.v5, true, new int[0], 0, 0, 1, 1));
                    this.gn = null;
                    this.we = null;
                    this.J0 = null;
                    this.J8 = null;
                    this.Ws = null;
                    this.QX = null;
                }
                if (this.j3 != 0) {
                    throw new RuntimeException("Corrupted syntax tree " + this.j3 + "  Bottom-most syntaxtag: " + syntaxTree.getSyntaxTag(this.aM[1]));
                }
                this.gn = null;
                this.we = null;
                this.J0 = null;
                this.J8 = null;
                this.Ws = null;
                this.QX = null;
                this.XL = null;
            } catch (Throwable th) {
                this.gn = null;
                this.we = null;
                this.J0 = null;
                this.J8 = null;
                this.Ws = null;
                this.QX = null;
                this.XL = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (U2) {
                iy.a8(th2, -3281760867051586701L, this, syntaxTreeStyles, fileEntry, new Boolean(z), syntaxTree);
            }
            throw th2;
        }
    }

    @ey(method = 736691946851523505L)
    public void we() {
        try {
            if (Mr) {
                iy.gn(2118961078039041205L, this);
            }
            if (this.Hw) {
                int i = this.j3 + 1;
                this.j3 = i;
                if (i >= this.aM.length) {
                    int[] iArr = new int[(this.aM.length * 2) + 1];
                    System.arraycopy(this.aM, 0, iArr, 0, this.aM.length);
                    this.aM = iArr;
                }
                if (this.j6.isLiteral(this.u7) || this.j6.isIdentifier(this.u7)) {
                    this.aM[this.j3] = this.gn.declareNode(this.u7, false, this.J0[this.tp], this.J8[this.tp], this.QX[this.tp], this.Ws[this.tp], this.XL[this.tp]);
                } else if (this.j6.I(this.u7)) {
                    this.aM[this.j3] = this.gn.declareNode(this.u7, false, this.J8[this.tp], this.QX[this.tp], this.Ws[this.tp], this.XL[this.tp]);
                } else {
                    this.aM[this.j3] = this.gn.rN(this.u7, false, this.J8[this.tp], this.QX[this.tp], this.XL[this.tp]);
                }
            }
            if (this.tp < this.EQ) {
                int i2 = this.tp + 1;
                this.tp = i2;
                this.u7 = this.we[i2];
            }
        } catch (Throwable th) {
            if (U2) {
                iy.aM(th, 2118961078039041205L, this);
            }
            throw th;
        }
    }
}
