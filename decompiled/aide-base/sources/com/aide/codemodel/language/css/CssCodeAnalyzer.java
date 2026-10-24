package com.aide.codemodel.language.css;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.CodeAnalyzer;
import com.aide.codemodel.api.collections.SetOfInt;

@cy(clazz = -6630065245577555973L, container = -6630065245577555973L, user = true)
/* loaded from: classes.dex */
public class CssCodeAnalyzer implements CodeAnalyzer {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -2191815141332671404L)
    private CssLanguage DW;

    @dy(field = -537931305008958663L)
    private Model j6;

    static {
        iy.Zo(CssCodeAnalyzer.class);
    }

    @ey(method = 1776286840145811325L)
    public CssCodeAnalyzer(Model model, CssLanguage cssLanguage) {
        try {
            if (FH) {
                iy.EQ(-214537121300024421L, null, model, cssLanguage);
            }
            this.j6 = model;
            this.DW = cssLanguage;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -214537121300024421L, null, model, cssLanguage);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 7520777059711687212L)
    public void FH(SyntaxTree syntaxTree) {
        try {
            if (FH) {
                iy.tp(-5219376895946916632L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5219376895946916632L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 1544719820830908633L)
    public void Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(-4394579515112521605L, this, syntaxTree, new Integer(i));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -4394579515112521605L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -520497076650216897L)
    public void VH(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(-1774308373231184307L, this, syntaxTree, new Integer(i));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1774308373231184307L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -4725246111032657760L)
    public void Zo(SyntaxTree syntaxTree) {
        try {
            if (FH) {
                iy.tp(-545935706974799136L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -545935706974799136L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 5682108995399997072L)
    public void analyzeEveryIdentifiers(SyntaxTree syntaxTree, SetOfInt setOfInt) {
        try {
            if (FH) {
                iy.EQ(1660296371393619360L, this, syntaxTree, setOfInt);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1660296371393619360L, this, syntaxTree, setOfInt);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -1886223624329108907L)
    public Type analyzeTypeName(SyntaxTree syntaxTree, int i, int i2, String str) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(-833374795723982957L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -833374795723982957L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 4077376059313449099L)
    public void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(806685712166939761L, this, syntaxTree, new Integer(i));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 806685712166939761L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3859139766711899944L)
    public void u7(FileEntry fileEntry, SyntaxTreeStyles syntaxTreeStyles) throws Throwable {
        try {
            if (FH) {
                try {
                    iy.EQ(1427378926218410880L, this, fileEntry, syntaxTreeStyles);
                } catch (Throwable th) {
                    th = th;
                    if (Hw) {
                        iy.Mr(th, 1427378926218410880L, this, fileEntry, syntaxTreeStyles);
                    }
                    throw th;
                }
            }
            for (int i = 0; i < syntaxTreeStyles.size; i++) {
                if (syntaxTreeStyles.syntaxTags[i] == 80) {
                    try {
                        int i2 = syntaxTreeStyles.DW[i];
                        if (syntaxTreeStyles.v5(i2) == 9) {
                            if (syntaxTreeStyles.VH[syntaxTreeStyles.Zo(i2)] == '#') {
                                this.j6.errorTable.FH(fileEntry, this.DW, syntaxTreeStyles.startLines[i], syntaxTreeStyles.startColumns[i], syntaxTreeStyles.endLines[i], syntaxTreeStyles.endColumns[i], (int) Long.parseLong(syntaxTreeStyles.VH(i2).substring(1), 16));
                            }
                        } else if (syntaxTreeStyles.v5(i2) == 7) {
                            if (syntaxTreeStyles.VH[syntaxTreeStyles.Zo(i2)] == '#') {
                                this.j6.errorTable.FH(fileEntry, this.DW, syntaxTreeStyles.startLines[i], syntaxTreeStyles.startColumns[i], syntaxTreeStyles.endLines[i], syntaxTreeStyles.endColumns[i], ((int) Long.parseLong(syntaxTreeStyles.VH(i2).substring(1), 16)) | (-16777216));
                            }
                        } else if (syntaxTreeStyles.v5(i2) == 4 && syntaxTreeStyles.VH[syntaxTreeStyles.Zo(i2)] == '#') {
                            String strVH = syntaxTreeStyles.VH(i2);
                            int i3 = Integer.parseInt(strVH.substring(1, 2), 16);
                            int i4 = Integer.parseInt(strVH.substring(2, 3), 16);
                            int i5 = Integer.parseInt(strVH.substring(3, 4), 16);
                            this.j6.errorTable.FH(fileEntry, this.DW, syntaxTreeStyles.startLines[i], syntaxTreeStyles.startColumns[i], syntaxTreeStyles.endLines[i], syntaxTreeStyles.endColumns[i], (i4 << 8) | (i3 << 20) | (-16777216) | (i3 << 16) | (i4 << 12) | (i5 << 4) | (i5 << 0));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 2992684059067268625L)
    public void v5(SyntaxTree syntaxTree) {
        try {
            if (FH) {
                iy.tp(-684119770861686401L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -684119770861686401L, this, syntaxTree);
            }
            throw th;
        }
    }
}
