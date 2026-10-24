package com.aide.codemodel.language.cpp;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.f2;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.SetOf;
import java.util.List;
import java.util.Set;

@cy(clazz = -300638219425699155L, container = -300638219425699155L, user = true)
/* loaded from: classes.dex */
public class CppTools implements Tools {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 1702058293931378184L)
    private Model j6;

    static {
        iy.Zo(CppTools.class);
    }

    @ey(method = 138069886023139701L)
    public CppTools(Model model) {
        try {
            if (DW) {
                iy.tp(-772236353817397504L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -772236353817397504L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 936283553056129971L)
    private int Qq(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-1320273847702402192L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            int length = strMr.length() - 1;
            while (length >= 0) {
                if (!Character.isLetter(strMr.charAt(length)) && strMr.charAt(length) != '.') {
                    break;
                }
                length--;
            }
            return length + 2;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -1320273847702402192L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1042267612363063229L)
    public void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) {
        try {
            if (DW) {
                iy.QX(103812700204142916L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, 103812700204142916L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -384433150211415597L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-1026708895493850608L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -1026708895493850608L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -6049428385710877483L)
    public String EQ(Namespace namespace) {
        try {
            if (!DW) {
                return null;
            }
            iy.tp(5389460531782471760L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 5389460531782471760L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -612026493029975268L)
    public boolean FH(String str) {
        try {
            if (!DW) {
                return false;
            }
            iy.tp(763408010720035603L, this, str);
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 763408010720035603L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -6915502417612420484L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (DW) {
                iy.J0(5215218663889331449L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 5215218663889331449L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -6404605686413015180L)
    public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(-960963215909216579L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -960963215909216579L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3463608059869775723L)
    public void J0(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(4474271006492306420L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 4474271006492306420L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4865231186849512425L)
    public void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (DW) {
                iy.J0(1710250008837597216L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 1710250008837597216L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2727341190773750175L)
    public String KD(Namespace namespace) {
        try {
            if (!DW) {
                return null;
            }
            iy.tp(2224827364968139976L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 2224827364968139976L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1135702737277533120L)
    public void Mr(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(816704727882656053L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 816704727882656053L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2580088062376045536L)
    public String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf) {
        try {
            if (!DW) {
                return null;
            }
            iy.we(-2830777463767459199L, this, syntaxTree, mapOf, setOf);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -2830777463767459199L, this, syntaxTree, mapOf, setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3020906721717111537L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(271235851749264560L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 271235851749264560L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 508983459396019875L)
    public boolean QX(FileEntry fileEntry, int i, int i2) {
        try {
            if (!DW) {
                return false;
            }
            iy.we(-338898864100972032L, this, fileEntry, new Integer(i), new Integer(i2));
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -338898864100972032L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1075036678127400384L)
    public void SI(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(-2068303126470910245L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -2068303126470910245L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -7281932453609431759L)
    public void Sf(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (DW) {
                iy.we(2658294242739156000L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 2658294242739156000L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3051854423578818696L)
    public boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (DW) {
                iy.QX(-4062261365286083467L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, -4062261365286083467L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3060051651513355396L)
    public void VH(FileEntry fileEntry) {
        try {
            if (DW) {
                iy.tp(-248497899092849351L, this, fileEntry);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -248497899092849351L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 842685707869551072L)
    public String Ws() {
        try {
            if (!DW) {
                return null;
            }
            iy.gn(-241064082141918289L, this);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -241064082141918289L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 197844289609864737L)
    public HashtableOfInt<Tools.a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (!DW) {
                return null;
            }
            iy.J8(-686925841235537400L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -686925841235537400L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -7650284513406523840L)
    public void Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-7714317817328387209L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -7714317817328387209L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 336279550096281588L)
    public void a8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (DW) {
                iy.J8(118849489958043317L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 118849489958043317L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3767341838477050031L)
    public String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2) {
        try {
            if (!DW) {
                return null;
            }
            iy.J8(-1873103694657635328L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -1873103694657635328L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -92862598132242000L)
    public String ca(Namespace namespace) {
        try {
            if (!DW) {
                return null;
            }
            iy.tp(-1017193096847730861L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -1017193096847730861L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -528047000893877704L)
    public String cb(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (!DW) {
                return null;
            }
            iy.J0(238310517426886367L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 238310517426886367L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3909322194481195596L)
    public void cn(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-4928839005157293375L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -4928839005157293375L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -39495625033131915L)
    public void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) {
        try {
            if (DW) {
                iy.QX(-832768522785291960L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, -832768522785291960L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4210641885058400L)
    public String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf) {
        try {
            if (!DW) {
                return null;
            }
            iy.EQ(8657894909784641617L, this, syntaxTree, mapOf);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 8657894909784641617L, this, syntaxTree, mapOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4575839776361042619L)
    public String ei(String str, String str2) {
        try {
            if (!DW) {
                return null;
            }
            iy.EQ(-4377569778511384428L, this, str, str2);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -4377569778511384428L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 458724839393072616L)
    public void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (DW) {
                iy.J8(-4764943328852022185L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            if (!fileEntry.getPathString().endsWith(".gradle")) {
                this.j6.codeCompleterCallback.a8(fileEntry, i, i2);
                return;
            }
            this.j6.codeCompleterCallback.j6();
            this.j6.codeCompleterCallback.Zo("android {}");
            this.j6.codeCompleterCallback.Zo("compileSdkVersion");
            this.j6.codeCompleterCallback.Zo("buildToolsVersion");
            this.j6.codeCompleterCallback.Zo("useLibrary 'org.apache.http.legacy'");
            this.j6.codeCompleterCallback.Zo("dexOptions {}");
            this.j6.codeCompleterCallback.Zo("jumboMode true");
            this.j6.codeCompleterCallback.Zo("multiDexEnabled true");
            this.j6.codeCompleterCallback.Zo("defaultConfig {}");
            this.j6.codeCompleterCallback.Zo("applicationId 'com.myapp'");
            this.j6.codeCompleterCallback.Zo("versionCode");
            this.j6.codeCompleterCallback.Zo("versionName");
            this.j6.codeCompleterCallback.Zo("minSdkVersion");
            this.j6.codeCompleterCallback.Zo("targetSdkVersion");
            this.j6.codeCompleterCallback.Zo("buildTypes {}");
            this.j6.codeCompleterCallback.Zo("release {}");
            this.j6.codeCompleterCallback.Zo("debug {}");
            this.j6.codeCompleterCallback.Zo("minifyEnabled true");
            this.j6.codeCompleterCallback.Zo("proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'");
            this.j6.codeCompleterCallback.Zo("signingConfigs {}");
            this.j6.codeCompleterCallback.Zo("storeFile file('../debug.keystore')");
            this.j6.codeCompleterCallback.Zo("keyAlias");
            this.j6.codeCompleterCallback.Zo("keyPassword");
            this.j6.codeCompleterCallback.Zo("storePassword");
            this.j6.codeCompleterCallback.Zo("productFlavors {}");
            this.j6.codeCompleterCallback.Zo("dependencies {}");
            this.j6.codeCompleterCallback.Zo("compile fileTree(dir: 'libs', include: ['*.jar'])");
            this.j6.codeCompleterCallback.Zo("testCompile 'junit:junit:+'");
            this.j6.codeCompleterCallback.Zo("compile project(':project')");
            this.j6.codeCompleterCallback.Zo("compile 'com.google.android.gms:play-services:+'");
            this.j6.codeCompleterCallback.J8(fileEntry, language, i, i2, Qq(fileEntry, i, i2), false, false);
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -4764943328852022185L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1407427529850803961L)
    public void g3(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-209395616507550240L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -209395616507550240L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -438019266277307360L)
    public void gW(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (DW) {
                iy.J0(-89769369332553L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, -89769369332553L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5252474706993002125L)
    public void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) {
        try {
            if (DW) {
                iy.QX(-2797873122481939584L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, -2797873122481939584L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3546757864311652800L)
    public Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i) {
        try {
            if (!DW) {
                return null;
            }
            iy.EQ(5175218828332331919L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 5175218828332331919L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3166044430706318097L)
    public HashtableOfInt<Tools.a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (!DW) {
                return null;
            }
            iy.J8(-1240756904734319700L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -1240756904734319700L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3227385620926381077L)
    public void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (DW) {
                iy.J0(-1520961661418186380L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, -1520961661418186380L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -841328446520095360L)
    public HashtableOfInt<Tools.a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (!DW) {
                return null;
            }
            iy.J8(-773212225878150915L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -773212225878150915L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1000908347992647616L)
    public void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.QX(1027489883439161499L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, 1027489883439161499L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5709916765132077216L)
    public void ro(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (DW) {
                iy.J8(3117366886904851145L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 3117366886904851145L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2393005690826251703L)
    public void sG(FileEntry fileEntry, String str) {
        try {
            if (DW) {
                iy.EQ(-1573656097959357312L, this, fileEntry, str);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -1573656097959357312L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1805209808484505577L)
    public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) {
        try {
            if (DW) {
                iy.QX(-6705913135400820400L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, -6705913135400820400L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -421233404375961333L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(2275041312035214416L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 2275041312035214416L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 144509885461700031L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(-6238840743408142080L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -6238840743408142080L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2580990717687531825L)
    public int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (DW) {
                iy.J0(1775535789017410056L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            return new int[0];
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 1775535789017410056L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5763436358538035968L)
    public String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf) {
        try {
            if (!DW) {
                return null;
            }
            iy.J0(3546396159842917201L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 3546396159842917201L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -6736879428906078712L)
    public void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (DW) {
                iy.QX(1783632528293295303L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
        } catch (Throwable th) {
            if (FH) {
                iy.rN(th, 1783632528293295303L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -674596410506223080L)
    public void we(FileEntry fileEntry, int i, int i2) {
        try {
            if (DW) {
                iy.we(-1786651747937498487L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -1786651747937498487L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4086865304769962945L)
    public void x9(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(2316094545483062092L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 2316094545483062092L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 944499244119834171L)
    public void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (DW) {
                iy.J8(-3456191054562833700L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -3456191054562833700L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
