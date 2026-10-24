package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.TypeSystem;
import com.aide.codemodel.api.collections.SetOf;

@cy(clazz = -3550371946293241223L, container = -3550371946293241223L, user = true)
/* loaded from: classes.dex */
public class JavaScriptTypeSystem implements TypeSystem {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -3459649730819820957L)
    private int DW;

    @dy(field = -2139139780097345792L)
    private final Model j6;

    static {
        iy.Zo(JavaScriptTypeSystem.class);
    }

    @ey(method = -1917927561050471073L)
    public JavaScriptTypeSystem(Model model, JavaScriptLanguage javaScriptLanguage) {
        try {
            if (FH) {
                iy.EQ(-2949549167938367895L, null, model, javaScriptLanguage);
            }
            this.j6 = model;
            this.DW = model.identifierSpace.get("JavaScript");
            model.identifierSpace.get("JavaScriptAPI");
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2949549167938367895L, null, model, javaScriptLanguage);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 4517051242781770363L)
    public boolean DW() {
        try {
            if (!FH) {
                return false;
            }
            iy.gn(7371861239296939825L, this);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 7371861239296939825L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 775921565457304613L)
    public ClassType EQ(FileEntry fileEntry) {
        try {
            if (FH) {
                iy.tp(145224267950032279L, this, fileEntry);
            }
            throw new e4();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 145224267950032279L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 3176109081654594111L)
    public boolean FH() {
        try {
            if (!FH) {
                return false;
            }
            iy.gn(6734551556606797L, this);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 6734551556606797L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 819435117242398083L)
    public Type Hw(FileEntry fileEntry, Type type) {
        try {
            if (FH) {
                iy.EQ(2965419880296166845L, this, fileEntry, type);
            }
            return type;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2965419880296166845L, this, fileEntry, type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -4220245296553054461L)
    public boolean J0() {
        try {
            if (!FH) {
                return false;
            }
            iy.gn(-2987432060925499011L, this);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2987432060925499011L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 849245604952578141L)
    public boolean J8(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (!FH) {
                return false;
            }
            iy.we(859878868736133547L, this, fileEntry, type, type2);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 859878868736133547L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 899626443762563392L)
    public boolean VH(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (!FH) {
                return false;
            }
            iy.we(1043881752173504676L, this, fileEntry, type, type2);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1043881752173504676L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 7810755890254986196L)
    public Namespace Ws() {
        try {
            if (FH) {
                iy.gn(6639138263831220760L, this);
            }
            return this.j6.entitySpace.getRootNamespace().OW(this.DW);
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 6639138263831220760L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -320633964865453393L)
    public ClassType Zo(FileEntry fileEntry) {
        try {
            if (FH) {
                iy.tp(984829485067414653L, this, fileEntry);
            }
            throw new e4();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 984829485067414653L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 1481034562232412000L)
    public Type gn(FileEntry fileEntry, Type type, Type type2) {
        try {
            if (FH) {
                iy.we(-2970902184755943392L, this, fileEntry, type, type2);
            }
            throw new e4();
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -2970902184755943392L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -7147463345142836275L)
    public int j6(int i) {
        try {
            if (!FH) {
                return 0;
            }
            iy.u7(-6285061853871408153L, this, i);
            return 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -6285061853871408153L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -5370860291224937775L)
    public Type tp(FileEntry fileEntry, int i, Type type, Type type2) {
        try {
            if (FH) {
                iy.J0(-6921876414834969729L, this, fileEntry, new Integer(i), type, type2);
            }
            throw new e4();
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -6921876414834969729L, this, fileEntry, new Integer(i), type, type2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 72043640386655760L)
    public int u7(Namespace namespace, int i) {
        try {
            if (!FH) {
                return 0;
            }
            iy.EQ(-193717794399278996L, this, namespace, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -193717794399278996L, this, namespace, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = 466902092258818100L)
    public SetOf<Type> v5(FileEntry fileEntry, ArrayType arrayType) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(780440597847543464L, this, fileEntry, arrayType);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 780440597847543464L, this, fileEntry, arrayType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.TypeSystem
    @ey(method = -341337560497607520L)
    public boolean we() {
        try {
            if (!FH) {
                return true;
            }
            iy.gn(296402949948934352L, this);
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 296402949948934352L, this);
            }
            throw th;
        }
    }
}
