package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Debugger;
import com.aide.codemodel.api.callback.DebugMetadataCallback;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.uidesigner.ProxyTextView;
import java.util.StringTokenizer;

@cy(clazz = 3319984486748654459L, container = 3319984486748654459L, user = true)
/* loaded from: classes.dex */
public class JavaDebugger implements Debugger {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 1166975171290301985L)
    private final EntitySpace DW;

    @dy(field = 2623916470166258071L)
    private final IdentifierSpace FH;

    @dy(field = 911357722968408420L)
    private final Model Hw;

    @dy(field = -1989945463581339537L)
    private final CodeModel VH;

    @dy(field = -3827097946272697221L)
    private final JavaLanguage Zo;

    @dy(field = 1214499447390091032L)
    private final SyntaxTreeSpace j6;

    @dy(field = 629523180687782960L)
    private final JavaTypeSystem v5;

    static {
        iy.Zo(JavaDebugger.class);
    }

    @ey(method = 45582930700495276L)
    public JavaDebugger(Model model, JavaLanguage javaLanguage, CodeModel codeModel) {
        try {
            if (gn) {
                iy.we(66556602338993760L, null, model, javaLanguage, codeModel);
            }
            this.Hw = model;
            FileSpace fileSpace = model.fileSpace;
            this.j6 = model.syntaxTreeSpace;
            this.DW = model.entitySpace;
            this.FH = model.identifierSpace;
            this.v5 = javaLanguage.getTypeSystem();
            this.Zo = javaLanguage;
            this.VH = codeModel;
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 66556602338993760L, null, model, javaLanguage, codeModel);
            }
            throw th;
        }
    }

    @ey(method = 305231845750938365L)
    private void EQ(SyntaxTree syntaxTree, int i, ClassType classType) {
        try {
            if (gn) {
                iy.we(2551933957418132896L, this, syntaxTree, new Integer(i), classType);
            }
            ClassType classTypeXL = XL(syntaxTree, i);
            if (classType == classTypeXL) {
                this.Hw.debugMetadataCallback.j6("this");
                return;
            }
            this.Hw.debugMetadataCallback.j6("this");
            this.Hw.debugMetadataCallback.DW(false, true, v5(classTypeXL), "this$0");
            for (ClassType enclosingClassType = classTypeXL.getEnclosingClassType(); enclosingClassType != classType && !enclosingClassType.Ej(classType) && !enclosingClassType.isToplevel(); enclosingClassType = enclosingClassType.getEnclosingClassType()) {
                this.Hw.debugMetadataCallback.DW(false, true, v5(enclosingClassType), "this$0");
            }
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 2551933957418132896L, this, syntaxTree, new Integer(i), classType);
            }
            throw th;
        }
    }

    @ey(method = -4258325956556811168L)
    private void J0(Member member) {
        try {
            if (gn) {
                iy.tp(6603988159137680151L, this, member);
            }
            this.Hw.debugMetadataCallback.DW(member.gG(), member.ys(), v5(member.getEnclosingClassType()), member.getNameString());
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 6603988159137680151L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -1010929258582895151L)
    private void J8(SyntaxTree syntaxTree, int i, Member member) {
        try {
            if (gn) {
                iy.we(-88505937785853656L, this, syntaxTree, new Integer(i), member);
            }
            int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
            int childCount = (syntaxTree.getChildCount(childNode) - 1) / 2;
            member.oY();
            int i2 = 0;
            int childCount2 = syntaxTree.getChildCount(childNode);
            int i3 = 1;
            while (i3 < childCount2 - 1) {
                int childNode2 = syntaxTree.getChildNode(childNode, i3);
                Type typeQp = member.qp(i2);
                Type attrType = syntaxTree.getAttrType(childNode2);
                we(syntaxTree, childNode2);
                tp(syntaxTree.getFile(), attrType, typeQp);
                i3 += 2;
                i2++;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -88505937785853656L, this, syntaxTree, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = -4714112713251451995L)
    private void QX(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (gn) {
                iy.we(4654167917648343280L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int childNode = syntaxTree.getChildNode(i, i2);
            if (syntaxTree.sh(childNode) == 2) {
                this.Hw.debugMetadataCallback.j6(syntaxTree.getIdentifierString(childNode));
                return;
            }
            if (syntaxTree.sh(childNode) == 3) {
                ClassType classTypeXL = XL(syntaxTree, i);
                this.Hw.debugMetadataCallback.j6("this");
                this.Hw.debugMetadataCallback.DW(false, true, v5(classTypeXL), "val$" + syntaxTree.getIdentifierString(childNode));
                return;
            }
            if (i2 > 0 && syntaxTree.sh(childNode) == 27) {
                QX(syntaxTree, i, i2 - 2);
                this.Hw.debugMetadataCallback.u7();
                return;
            }
            if (syntaxTree.sh(childNode) != 16) {
                throw new e4();
            }
            Member member = (Member) syntaxTree.getAttrReferenceEntity(childNode);
            if (member.gG()) {
                this.Hw.debugMetadataCallback.FH(null);
                J0(member);
            } else if (i2 == 0) {
                EQ(syntaxTree, i, (ClassType) syntaxTree.getAttrInvocationType(childNode).x9());
                J0(member);
            } else {
                QX(syntaxTree, i, i2 - 2);
                J0(member);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 4654167917648343280L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 455023453313107245L)
    private void Ws(Member member) {
        try {
            if (gn) {
                iy.tp(1693226042065348516L, this, member);
            }
            this.Hw.debugMetadataCallback.VH(member.gG(), v5(member.getEnclosingClassType()), member.getNameString(), DW(member), member.oY());
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 1693226042065348516L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -1126292988497414400L)
    private ClassType XL(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-2661875060597402661L, this, syntaxTree, new Integer(i));
            }
            while (true) {
                int syntaxTag = syntaxTree.getSyntaxTag(i);
                if (syntaxTag != 120 && syntaxTag != 121 && syntaxTag != 128 && syntaxTag != 129 && syntaxTag != 177 && syntaxTag != 227 && syntaxTag != 228) {
                    switch (syntaxTag) {
                        case 220:
                        case 221:
                        case 222:
                            break;
                        default:
                            i = syntaxTree.getParentNode(i);
                    }
                }
            }
            return this.DW.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
        } finally {
        }
    }

    @ey(method = 1453397808148084060L)
    private Member aM(SyntaxTree syntaxTree, int i, String str, String str2, String str3, boolean z) throws Throwable {
        int i2;
        char c;
        try {
            if (gn) {
                iy.QX(-521000345655980615L, this, new Object[]{syntaxTree, new Integer(i), str, str2, str3, new Boolean(z)});
            }
            if (syntaxTree.getSyntaxTag(i) == 124) {
                try {
                    Member memberJw = this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                    ClassType enclosingClassType = memberJw.getEnclosingClassType();
                    if (j6(memberJw).equals(str2) && v5(enclosingClassType).equals(str)) {
                        if (z) {
                            if (!memberJw.gG()) {
                                String strDW = DW(memberJw);
                                if (("(L" + DW(memberJw.getEnclosingClassType()) + ";" + strDW.substring(1, strDW.length())).equals(str3)) {
                                    return memberJw;
                                }
                            } else if (DW(memberJw).equals(str3)) {
                                return memberJw;
                            }
                        } else if (DW(memberJw).equals(str3)) {
                            return memberJw;
                        }
                    }
                } catch (e4 unused) {
                }
            }
            if (syntaxTree.getSyntaxTag(i) == 123 && str2.equals("<init>")) {
                try {
                    Member memberJw2 = this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                    if (v5(memberJw2.getEnclosingClassType()).equals(str)) {
                        if (DW(memberJw2).equals(str3)) {
                            return memberJw2;
                        }
                    }
                } catch (e4 unused2) {
                }
            }
            int childCount = syntaxTree.getChildCount(i);
            int i3 = 0;
            while (i3 < childCount) {
                int i4 = i3;
                c = 1;
                i2 = 6;
                try {
                    Member memberAM = aM(syntaxTree, syntaxTree.getChildNode(i, i3), str, str2, str3, z);
                    if (memberAM != null) {
                        return memberAM;
                    }
                    i3 = i4 + 1;
                } catch (Throwable th) {
                    th = th;
                    if (u7) {
                        Object[] objArr = new Object[i2];
                        objArr[0] = syntaxTree;
                        objArr[c] = new Integer(i);
                        objArr[2] = str;
                        objArr[3] = str2;
                        objArr[4] = str3;
                        objArr[5] = new Boolean(z);
                        iy.rN(th, -521000345655980615L, this, objArr);
                    }
                    throw th;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i2 = 6;
            c = 1;
        }
    }

    @ey(method = 2455387886261311408L)
    private void tp(FileEntry fileEntry, Type type, Type type2) {
        Class cls;
        try {
            if (gn) {
                iy.we(-2684003221891669977L, this, fileEntry, type, type2);
            }
            if (type2 != type && this.v5.Jl(type) == this.v5.Jl(type2) && type.yO(fileEntry, this.Zo, type2)) {
                int semantic = type.getSemantic();
                Class cls2 = null;
                if (semantic == 3) {
                    cls = Byte.TYPE;
                } else if (semantic == 5) {
                    cls = Short.TYPE;
                } else if (semantic == 7) {
                    cls = Integer.TYPE;
                } else if (semantic != 9) {
                    switch (semantic) {
                        case 12:
                            cls = Character.TYPE;
                            break;
                        case 13:
                            cls = Float.TYPE;
                            break;
                        case 14:
                            cls = Double.TYPE;
                            break;
                        default:
                            cls = null;
                            break;
                    }
                } else {
                    cls = Long.TYPE;
                }
                int semantic2 = type2.getSemantic();
                if (semantic2 == 3) {
                    cls2 = Byte.TYPE;
                } else if (semantic2 == 5) {
                    cls2 = Short.TYPE;
                } else if (semantic2 == 7) {
                    cls2 = Integer.TYPE;
                } else if (semantic2 != 9) {
                    switch (semantic2) {
                        case 12:
                            cls2 = Character.TYPE;
                            break;
                        case 13:
                            cls2 = Float.TYPE;
                            break;
                        case 14:
                            cls2 = Double.TYPE;
                            break;
                    }
                } else {
                    cls2 = Long.TYPE;
                }
                if (cls == null || cls2 == null) {
                    return;
                }
                this.Hw.debugMetadataCallback.Zo(cls, cls2);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -2684003221891669977L, this, fileEntry, type, type2);
            }
            throw th;
        }
    }

    @ey(method = 383575278753338679L)
    private void we(SyntaxTree syntaxTree, int i) {
        Type typeRo;
        try {
            if (gn) {
                iy.EQ(-824184045490934544L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.hasAttrValue(i)) {
                int semantic = syntaxTree.getAttrType(i).getSemantic();
                if (semantic == 3) {
                    this.Hw.debugMetadataCallback.FH(new Byte((byte) this.DW.I(syntaxTree.getAttrValue(i))));
                    return;
                }
                if (semantic == 5) {
                    this.Hw.debugMetadataCallback.FH(new Short((short) this.DW.I(syntaxTree.getAttrValue(i))));
                    return;
                }
                if (semantic == 7) {
                    this.Hw.debugMetadataCallback.FH(new Integer(this.DW.I(syntaxTree.getAttrValue(i))));
                    return;
                }
                if (semantic == 9) {
                    DebugMetadataCallback debugMetadataCallback = this.Hw.debugMetadataCallback;
                    EntitySpace entitySpace = this.DW;
                    long attrValue = syntaxTree.getAttrValue(i);
                    entitySpace.ca(attrValue);
                    debugMetadataCallback.FH(new Long(attrValue));
                    return;
                }
                switch (semantic) {
                    case 11:
                        this.Hw.debugMetadataCallback.FH(new Boolean(this.DW.vJ(syntaxTree.getAttrValue(i))));
                        return;
                    case 12:
                        this.Hw.debugMetadataCallback.FH(new Character((char) this.DW.I(syntaxTree.getAttrValue(i))));
                        return;
                    case 13:
                        this.Hw.debugMetadataCallback.FH(new Float(this.DW.Mz(syntaxTree.getAttrValue(i))));
                        return;
                    case 14:
                        this.Hw.debugMetadataCallback.FH(new Double(this.DW.g3(syntaxTree.getAttrValue(i))));
                        return;
                }
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 2) {
                this.Hw.debugMetadataCallback.FH(new String(syntaxTree.getLiteralChars(i), syntaxTree.getLiteralOff(i) + 1, syntaxTree.getLiteralLen(i) - 2));
                return;
            }
            if (syntaxTag == 66) {
                this.Hw.debugMetadataCallback.FH(null);
                return;
            }
            if (syntaxTag == 159) {
                int childNode = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
                if (syntaxTree.sh(childNode) == 16) {
                    Member member = (Member) syntaxTree.getAttrReferenceEntity(childNode);
                    if (member.gG()) {
                        J0(member);
                        return;
                    } else {
                        we(syntaxTree, syntaxTree.getChildNode(i, 0));
                        J0(member);
                        return;
                    }
                }
            } else {
                if (syntaxTag == 161) {
                    QX(syntaxTree, i, syntaxTree.getChildCount(i) - 1);
                    return;
                }
                if (syntaxTag == 172) {
                    Type attrType = syntaxTree.getAttrType(i);
                    int childNode2 = syntaxTree.getChildNode(i, 0);
                    Type attrType2 = syntaxTree.getAttrType(childNode2);
                    int childNode3 = syntaxTree.getChildNode(i, 2);
                    Type attrType3 = syntaxTree.getAttrType(childNode3);
                    switch (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1))) {
                        case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                        case 35:
                            if (!this.v5.Jl(attrType2) && !this.v5.Jl(attrType3)) {
                                we(syntaxTree, childNode2);
                                we(syntaxTree, childNode3);
                                this.Hw.debugMetadataCallback.v5(syntaxTree.getLanguage().getSyntax().getString(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1))));
                                return;
                            } else {
                                Type typeTp = this.v5.tp(syntaxTree.getFile(), 9, attrType2, attrType3);
                                we(syntaxTree, childNode2);
                                tp(syntaxTree.getFile(), attrType2, typeTp);
                                we(syntaxTree, childNode3);
                                tp(syntaxTree.getFile(), attrType3, typeTp);
                                this.Hw.debugMetadataCallback.v5(syntaxTree.getLanguage().getSyntax().getString(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1))));
                                return;
                            }
                        case 19:
                        case 21:
                        case 27:
                        case 30:
                        case 32:
                        case ProxyTextView.INPUTTYPE_time /* 36 */:
                        case 38:
                        case 41:
                        case 46:
                        case 50:
                        case 51:
                            if (attrType.getSemantic() != 16) {
                                switch (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1))) {
                                    case 46:
                                    case 47:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                        typeRo = this.v5.ro();
                                        break;
                                    case 48:
                                    case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                                    default:
                                        typeRo = attrType;
                                        break;
                                }
                                we(syntaxTree, childNode2);
                                tp(syntaxTree.getFile(), attrType2, attrType);
                                we(syntaxTree, childNode3);
                                tp(syntaxTree.getFile(), attrType3, typeRo);
                                this.Hw.debugMetadataCallback.v5(syntaxTree.getLanguage().getSyntax().getString(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1))));
                                return;
                            }
                            break;
                        case 39:
                        case 42:
                            we(syntaxTree, childNode2);
                            we(syntaxTree, childNode3);
                            this.Hw.debugMetadataCallback.v5(syntaxTree.getLanguage().getSyntax().getString(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1))));
                            return;
                        case 44:
                        case 45:
                        case 48:
                        case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                            Type typeTp2 = this.v5.tp(syntaxTree.getFile(), 11, attrType2, attrType3);
                            we(syntaxTree, childNode2);
                            tp(syntaxTree.getFile(), attrType2, typeTp2);
                            we(syntaxTree, childNode3);
                            tp(syntaxTree.getFile(), attrType3, typeTp2);
                            this.Hw.debugMetadataCallback.v5(syntaxTree.getLanguage().getSyntax().getString(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1))));
                            return;
                    }
                } else if (syntaxTag == 155) {
                    int childNode4 = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 2);
                    if (syntaxTree.sh(childNode4) == 20) {
                        Member member2 = (Member) syntaxTree.getAttrReferenceEntity(childNode4);
                        if (member2.gG()) {
                            this.Hw.debugMetadataCallback.FH(null);
                            J8(syntaxTree, i, member2);
                            Ws(member2);
                            return;
                        } else {
                            we(syntaxTree, syntaxTree.getChildNode(i, 0));
                            J8(syntaxTree, i, member2);
                            Ws(member2);
                            return;
                        }
                    }
                } else if (syntaxTag == 156) {
                    int childNode5 = syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 2);
                    if (syntaxTree.sh(childNode5) == 20) {
                        Member member3 = (Member) syntaxTree.getAttrReferenceEntity(childNode5);
                        if (member3.gG()) {
                            this.Hw.debugMetadataCallback.FH(null);
                            J8(syntaxTree, i, member3);
                            Ws(member3);
                            return;
                        } else if (syntaxTree.getChildCount(i) == 2) {
                            EQ(syntaxTree, i, (ClassType) syntaxTree.getAttrInvocationType(childNode5).x9());
                            J8(syntaxTree, i, member3);
                            Ws(member3);
                            return;
                        } else {
                            QX(syntaxTree, i, syntaxTree.getChildCount(i) - 5);
                            J8(syntaxTree, i, member3);
                            Ws(member3);
                            return;
                        }
                    }
                } else {
                    if (syntaxTag == 165) {
                        we(syntaxTree, syntaxTree.getChildNode(i, 0));
                        we(syntaxTree, syntaxTree.getChildNode(i, 2));
                        tp(syntaxTree.getFile(), syntaxTree.getAttrType(syntaxTree.getChildNode(i, 2)), this.v5.ro());
                        this.Hw.debugMetadataCallback.Hw();
                        return;
                    }
                    if (syntaxTag == 166) {
                        if (syntaxTree.getChildCount(i) == 1) {
                            this.Hw.debugMetadataCallback.j6("this");
                            return;
                        } else {
                            EQ(syntaxTree, i, (ClassType) syntaxTree.getAttrType(syntaxTree.getChildNode(i, 0)));
                            return;
                        }
                    }
                    switch (syntaxTag) {
                        case 168:
                            we(syntaxTree, syntaxTree.getChildNode(i, 1));
                            return;
                        case 169:
                            we(syntaxTree, syntaxTree.getChildNode(i, 4));
                            tp(syntaxTree.getFile(), syntaxTree.getAttrType(syntaxTree.getChildNode(i, 4)), syntaxTree.getAttrType(i));
                            return;
                        case 170:
                            int syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0));
                            if (syntaxTag2 == 21 || syntaxTag2 == 24 || syntaxTag2 == 27 || syntaxTag2 == 34) {
                                we(syntaxTree, syntaxTree.getChildNode(i, 1));
                                this.Hw.debugMetadataCallback.gn(syntaxTree.getLanguage().getSyntax().getString(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0))));
                                return;
                            }
                            break;
                    }
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -824184045490934544L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = 8404603430174475921L)
    public String DW(Entity entity) {
        try {
            if (gn) {
                iy.tp(3222439621679018272L, this, entity);
            }
            return ((JavaCompiler) entity.getFile().getCodeModel().getCompiler()).pl(entity);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3222439621679018272L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = 2004925626652446897L)
    public Member FH(String str, String str2, String str3) {
        boolean z;
        try {
            if (gn) {
                iy.we(4655206476270251672L, this, str, str2, str3);
            }
            if (str.endsWith("$0$debug")) {
                str = str.substring(0, str.length() - 8);
                if (str2.endsWith("$")) {
                    str2 = str2.substring(0, str2.length() - 1);
                }
                z = true;
            } else {
                z = false;
            }
            FileEntry file = u7(str.indexOf(36) != -1 ? str.substring(0, str.indexOf(36)) : str).getFile();
            if (file.getCodeModel() == this.VH) {
                SyntaxTree syntaxTree = this.j6.getSyntaxTree(file, this.Zo);
                Member memberAM = aM(syntaxTree, syntaxTree.getRootNode(), str, str2, str3, z);
                this.j6.releaseSyntaxTree(syntaxTree);
                if (memberAM != null) {
                    return memberAM;
                }
            }
            throw new e4();
        } catch (Throwable th) {
            String str4 = str;
            String str5 = str2;
            if (u7) {
                iy.U2(th, 4655206476270251672L, this, str4, str5, str3);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = 736648013184732435L)
    public String Hw(Entity entity) {
        try {
            if (gn) {
                iy.tp(-525259428642517800L, this, entity);
            }
            return ((JavaCompiler) entity.getFile().getCodeModel().getCompiler()).PH(entity);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -525259428642517800L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = -888640556663025360L)
    public void VH(FileEntry fileEntry, int i, int i2, String str) {
        int expressionNodeAt;
        try {
            if (gn) {
                iy.J0(206907918792335795L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            SyntaxTree syntaxTreeWe = this.j6.we(fileEntry, this.Zo, i, i2, str);
            if (syntaxTreeWe == null || (expressionNodeAt = syntaxTreeWe.getExpressionNodeAt(i, i2)) == -1) {
                return;
            }
            syntaxTreeWe.getLanguage().getCodeAnalyzer().j6(syntaxTreeWe, expressionNodeAt);
            we(syntaxTreeWe, expressionNodeAt);
        } catch (Throwable th) {
            if (u7) {
                iy.a8(th, 206907918792335795L, this, fileEntry, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = -6545966752007814044L)
    public Member Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (gn) {
                iy.we(4432620269775691719L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTree = this.j6.getSyntaxTree(fileEntry, this.Zo);
            int iJl = syntaxTree.Jl(i, i2);
            if (iJl != -1) {
                try {
                    return this.DW.jw(fileEntry, this.Zo, syntaxTree.getDeclarationNumber(iJl));
                } catch (e4 unused) {
                }
            }
            this.j6.releaseSyntaxTree(syntaxTree);
            throw new e4();
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 4432620269775691719L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = -347250265754165295L)
    public String gn(Entity entity) {
        try {
            if (gn) {
                iy.tp(3996776502275884936L, this, entity);
            }
            return ((JavaCompiler) entity.getFile().getCodeModel().getCompiler()).hp(entity);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3996776502275884936L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = 3914184931473767683L)
    public String j6(Entity entity) {
        try {
            if (gn) {
                iy.tp(-939540144869582248L, this, entity);
            }
            return ((JavaCompiler) entity.getFile().getCodeModel().getCompiler()).Od(entity);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -939540144869582248L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = 2863897779455538864L)
    public ClassType u7(String str) {
        try {
            if (gn) {
                iy.tp(-1762973396037514557L, this, str);
            }
            String strSubstring = str.lastIndexOf(46) != -1 ? str.substring(0, str.lastIndexOf(46)) : "";
            if (str.indexOf(36) != -1) {
                str = str.substring(0, str.lastIndexOf(36));
            }
            Namespace rootNamespace = this.DW.getRootNamespace();
            StringTokenizer stringTokenizer = new StringTokenizer(strSubstring, ".");
            while (stringTokenizer.hasMoreTokens()) {
                rootNamespace = rootNamespace.OW(this.FH.get(stringTokenizer.nextToken()));
            }
            MapOfInt<ClassType> mapOfIntCa = rootNamespace.ca();
            mapOfIntCa.DEFAULT_ITERATOR.DW();
            while (mapOfIntCa.DEFAULT_ITERATOR.hasMoreElements()) {
                ClassType classType = (ClassType) mapOfIntCa.DEFAULT_ITERATOR.nextValue();
                if ((classType.getLanguage() instanceof JavaLanguage) && classType.getFile().getCodeModel() == this.VH && classType.getFile().getCodeModel().getDebugger() != null && v5(classType).equals(str)) {
                    return classType;
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1762973396037514557L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Debugger
    @ey(method = 3466841305470752512L)
    public String v5(ClassType classType) {
        try {
            if (gn) {
                iy.tp(-1817574347500409571L, this, classType);
            }
            return ((JavaCompiler) classType.getFile().getCodeModel().getCompiler()).GT(classType);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1817574347500409571L, this, classType);
            }
            throw th;
        }
    }
}
