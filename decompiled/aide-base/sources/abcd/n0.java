package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Language;

@cy(clazz = -5789597647932032315L, container = -5789597647932032315L, user = true)
/* loaded from: classes.dex */
public class n0 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -343622854738159964L)
    private final Model j6;

    static {
        iy.Zo(n0.class);
    }

    @ey(method = 39722526165248445L)
    public n0(Model model) {
        try {
            if (DW) {
                iy.tp(-631071523601909440L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -631071523601909440L, null, model);
            }
            throw th;
        }
    }

    @ey(method = -914339061885203695L)
    public void DW(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(3829046797111465167L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().x9(fileEntry, i, i2, i3, i4);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 3829046797111465167L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1076821064962735456L)
    public void EQ(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (DW) {
                iy.J0(2050448549426892960L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().gW(fileEntry, i, i2, member);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 2050448549426892960L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @ey(method = 550627771077896068L)
    public void FH(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(7456417034316059576L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().I(fileEntry, i, i2, i3, i4);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 7456417034316059576L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -21430916247422440L)
    public void Hw(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-2878928566989807524L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().Zo(fileEntry, i, i2);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -2878928566989807524L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 550866331014310160L)
    public void VH(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) throws Throwable {
        int i5;
        try {
            if (DW) {
                iy.QX(1335862760388672872L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                i5 = 6;
                try {
                    syntaxTreeWs.getLanguage().getTools().rN(fileEntry, fileEntry2, i, i2, i3, i4);
                } catch (Throwable th) {
                    th = th;
                    if (FH) {
                        Object[] objArr = new Object[i5];
                        objArr[0] = fileEntry;
                        objArr[1] = fileEntry2;
                        objArr[2] = new Integer(i);
                        objArr[3] = new Integer(i2);
                        objArr[4] = new Integer(i3);
                        objArr[5] = new Integer(i4);
                        iy.rN(th, 1335862760388672872L, this, objArr);
                    }
                    throw th;
                }
            } else {
                i5 = 6;
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    @ey(method = -674590455039405865L)
    public void Zo(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(368125975785454093L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().u7(fileEntry, i, i2, i3, i4);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 368125975785454093L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 1800628771856562585L)
    public void gn(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-4764089217219285389L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().P8(fileEntry, i, i2);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -4764089217219285389L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 988012249620242425L)
    public void j6(FileEntry fileEntry, String str) {
        try {
            if (DW) {
                iy.EQ(1603355071752699051L, this, fileEntry, str);
            }
            if (fileEntry.getCodeModel() != null) {
                for (Language language : fileEntry.getCodeModel().getLanguages()) {
                    if (language != null && language.getTools() != null && language.getTools().FH(str)) {
                        language.getTools().sG(fileEntry, str);
                    }
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 1603355071752699051L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @ey(method = -6426815220750652200L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(-1457993501159387168L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().SI(fileEntry, i, i2, i3, i4);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -1457993501159387168L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -887450800282237848L)
    public void u7(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-1556730536092197408L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().Mr(fileEntry, i, i2);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -1556730536092197408L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1639090864385822669L)
    public void v5(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(521978568430302539L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().VH(fileEntry);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 521978568430302539L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3003095935305940683L)
    public void we(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(-2122021433677005871L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
            if (syntaxTreeWs.getLanguage().getTools() != null) {
                syntaxTreeWs.getLanguage().getTools().tp(fileEntry, i, i2, i3, i4);
            }
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -2122021433677005871L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }
}
