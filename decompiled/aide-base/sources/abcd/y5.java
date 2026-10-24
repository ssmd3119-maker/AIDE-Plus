package abcd;

import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.language.java.JavaLanguage;
import com.aide.codemodel.language.java.JavaSyntax;
import java.util.Comparator;
import java.util.Date;
import java.util.StringTokenizer;

@cy(clazz = -4746848808992515443L, container = -4746848808992515443L, user = true)
/* loaded from: classes.dex */
public class y5 {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -2234956636513337148L)
    private final SyntaxTreeSpace DW;

    @dy(field = -2270437352702285445L)
    private final EntitySpace FH;

    @dy(field = -424040955763033455L)
    private final IdentifierSpace Hw;

    @dy(field = -2495795038467845376L)
    private final Model j6;

    @dy(field = 337520253790545657L)
    private final JavaLanguage v5;

    @cy(clazz = 1107546728864499504L, container = -4746848808992515443L, user = true)
    class a implements Comparator<Member> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -56051411615583000L)
        public a(y5 y5Var) {
        }

        @Override // java.util.Comparator
        @ey(method = 2161850410143207715L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(Member member, Member member2) {
            try {
                if (WB) {
                    iy.EQ(-7727813904879023967L, this, member, member2);
                }
                return member.getFile() != member2.getFile() ? member.getFile().getId() - member2.getFile().getId() : member.Ws() - member2.Ws();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -7727813904879023967L, this, member, member2);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(y5.class);
    }

    @ey(method = -6584029373953032371L)
    public y5(Model model, JavaLanguage javaLanguage) {
        try {
            if (Zo) {
                iy.EQ(-3368633391966562624L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.DW = model.syntaxTreeSpace;
            this.FH = model.entitySpace;
            this.Hw = model.identifierSpace;
            FileSpace fileSpace = model.fileSpace;
            this.v5 = javaLanguage;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -3368633391966562624L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = -568284621421173129L)
    private String DW(Member member, boolean z) {
        try {
            if (Zo) {
                iy.EQ(954349246829880681L, this, member, new Boolean(z));
            }
            if (!(member.getLanguage() instanceof JavaLanguage)) {
                return "";
            }
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(member.getFile(), member.getLanguage());
            int memberDeclarationNode = syntaxTree.getMemberDeclarationNode(member.DW());
            if (memberDeclarationNode != -1 && syntaxTree.getSyntaxTag(memberDeclarationNode) == 124) {
                String strFH = FH(syntaxTree, memberDeclarationNode, z);
                this.DW.releaseSyntaxTree(syntaxTree);
                return strFH;
            }
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 954349246829880681L, this, member, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2643570351191629095L)
    private String FH(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (Zo) {
                iy.we(-1000628305600457685L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("/**\n");
            stringBuffer.append(" * Method " + syntaxTree.getIdentifierString(syntaxTree.getChildNode(i, 4)) + "\n *\n");
            int i2 = 5;
            int i3 = 3;
            if (syntaxTree.getChildCount(syntaxTree.getChildNode(i, 5)) > 2) {
                int i4 = 1;
                while (i4 < syntaxTree.getChildCount(syntaxTree.getChildNode(i, i2))) {
                    int childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(i, i2), i4);
                    stringBuffer.append(" * @param    " + lg(syntaxTree.getIdentifierString(syntaxTree.getChildNode(childNode, i3)), 20));
                    String strHz = ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).hz(syntaxTree, syntaxTree.getChildNode(childNode, 1));
                    if ("AEIOUaeiou".indexOf(strHz.charAt(0)) != -1) {
                        stringBuffer.append("an ");
                    } else {
                        stringBuffer.append("a  ");
                    }
                    stringBuffer.append(strHz);
                    stringBuffer.append(((JavaSyntax) syntaxTree.getLanguage().getSyntax()).jJ(syntaxTree, syntaxTree.getChildNode(childNode, 2)));
                    stringBuffer.append(((JavaSyntax) syntaxTree.getLanguage().getSyntax()).jJ(syntaxTree, syntaxTree.getChildNode(childNode, 4)) + "\n");
                    i4 += 2;
                    i2 = 5;
                    i3 = 3;
                }
                stringBuffer.append(" *\n");
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 2), 0)) != 69) {
                stringBuffer.append(" * @return   ");
                String strHz2 = ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).hz(syntaxTree, syntaxTree.getChildNode(i, 2));
                if ("AEIOUaeiou".indexOf(strHz2.charAt(0)) != -1) {
                    stringBuffer.append("an ");
                } else {
                    stringBuffer.append("a ");
                }
                stringBuffer.append(strHz2);
                stringBuffer.append(((JavaSyntax) syntaxTree.getLanguage().getSyntax()).jJ(syntaxTree, syntaxTree.getChildNode(i, 3)));
                stringBuffer.append(((JavaSyntax) syntaxTree.getLanguage().getSyntax()).jJ(syntaxTree, syntaxTree.getChildNode(i, 6)) + "\n * \n");
            }
            if (syntaxTree.getChildCount(syntaxTree.getChildNode(i, 7)) > 0) {
                for (int i5 = 1; i5 < syntaxTree.getChildCount(syntaxTree.getChildNode(i, 7)); i5 += 2) {
                    stringBuffer.append(" * @exception   " + ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).hz(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(i, 7), i5)) + "\n");
                }
                stringBuffer.append(" *\n");
            }
            if (z) {
                Date date = new Date();
                stringBuffer.append(" * @version  " + (date.getMonth() + 1) + "/" + date.getDate() + "/" + (date.getYear() + 1900) + "\n");
            }
            stringBuffer.append(" */");
            return stringBuffer.toString();
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -1000628305600457685L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x02d5  */
    @abcd.ey(method = -1376757190990912008L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String Hw(com.aide.codemodel.api.SyntaxTree r24, int r25, int r26, com.aide.codemodel.api.Type r27, com.aide.codemodel.api.Member r28, com.aide.codemodel.api.ClassType r29) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.y5.Hw(com.aide.codemodel.api.SyntaxTree, int, int, com.aide.codemodel.api.Type, com.aide.codemodel.api.Member, com.aide.codemodel.api.ClassType):java.lang.String");
    }

    @ey(method = -1569925499474498880L)
    private boolean Mr(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-1426013681225607936L, this, syntaxTree, new Integer(i));
            }
            int childNode = syntaxTree.getChildNode(i, 1);
            if (syntaxTree.getChildCount(childNode) == 1 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode, 0)) == 89) {
                if (syntaxTree.getChildCount(syntaxTree.getChildNode(i, 2)) == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -1426013681225607936L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -937203327506208788L)
    private static String QX(int i) {
        try {
            if (Zo) {
                iy.u7(-161350758074987320L, null, i);
            }
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = ' ';
            }
            return new String(cArr);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -161350758074987320L, null, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -157309095378364520L)
    private boolean U2(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(404557698324596580L, this, syntaxTree, new Integer(i));
            }
            int childNode = syntaxTree.getChildNode(i, 0);
            int childCount = syntaxTree.getChildCount(childNode);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode, i2)) == 75) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 404557698324596580L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3208918040428136049L)
    private int Ws(String str) {
        try {
            if (Zo) {
                iy.tp(2998019229220318381L, this, str);
            }
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) == '\n') {
                    i++;
                }
            }
            return i;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2998019229220318381L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 161169124716362376L)
    private void XL(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (Zo) {
                iy.we(-236675904177651568L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            aM(syntaxTree, i, j6(syntaxTree, i, z));
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -236675904177651568L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -589274320741190224L)
    private boolean a8(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-1159147954012871680L, this, syntaxTree, new Integer(i));
            }
            int childNode = syntaxTree.getChildNode(i, 0);
            int childCount = syntaxTree.getChildCount(childNode);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode, i2)) == 86) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -1159147954012871680L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1531044609429944339L)
    private void aM(SyntaxTree syntaxTree, int i, String str) {
        try {
            if (Zo) {
                iy.we(-4589981244969606625L, this, syntaxTree, new Integer(i), str);
            }
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), 1, syntaxTree.getStartLine(i), 1, "\n");
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), 1, syntaxTree.getStartLine(i), 1, str);
            this.j6.refactoringCallback.Sf(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartLine(i) + Ws(str));
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -4589981244969606625L, this, syntaxTree, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -991406505939720973L)
    private void gn(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (Zo) {
                iy.we(-2825955672072105307L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                gn(syntaxTree, syntaxTree.getChildNode(i, childCount), z);
            }
            try {
                if (syntaxTree.getSyntaxTag(i) != 124) {
                    if (syntaxTree.getSyntaxTag(i) != 123) {
                        return;
                    }
                    if (this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i)).FH() != null) {
                        XL(syntaxTree, i, z);
                    }
                } else if (this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i)).FH() != null) {
                    j3(syntaxTree, i, z);
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -2825955672072105307L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2619288451646224605L)
    private void j3(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (Zo) {
                iy.we(577044874632198651L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            aM(syntaxTree, i, FH(syntaxTree, i, z));
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 577044874632198651L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1855440973904712312L)
    private String j6(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (Zo) {
                iy.we(1820862093736736556L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("/**\n");
            stringBuffer.append(" * Constructor\n *\n");
            if (syntaxTree.getChildCount(syntaxTree.getChildNode(i, 3)) > 2) {
                int i2 = 1;
                for (int i3 = 3; i2 < syntaxTree.getChildCount(syntaxTree.getChildNode(i, i3)); i3 = 3) {
                    int childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(i, i3), i2);
                    stringBuffer.append(" * @param    " + lg(syntaxTree.getIdentifierString(syntaxTree.getChildNode(childNode, i3)), 20));
                    String strHz = ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).hz(syntaxTree, syntaxTree.getChildNode(childNode, 1));
                    if ("AEIOUaeiou".indexOf(strHz.charAt(0)) != -1) {
                        stringBuffer.append("an ");
                    } else {
                        stringBuffer.append("a  ");
                    }
                    stringBuffer.append(strHz);
                    stringBuffer.append(((JavaSyntax) syntaxTree.getLanguage().getSyntax()).jJ(syntaxTree, syntaxTree.getChildNode(childNode, 2)));
                    stringBuffer.append(((JavaSyntax) syntaxTree.getLanguage().getSyntax()).jJ(syntaxTree, syntaxTree.getChildNode(childNode, 4)) + "\n");
                    i2 += 2;
                }
                stringBuffer.append(" *\n");
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 2), 0)) != 69 && syntaxTree.getChildCount(syntaxTree.getChildNode(i, 4)) > 0) {
                for (int i4 = 1; i4 < syntaxTree.getChildCount(syntaxTree.getChildNode(i, 4)); i4 += 2) {
                    stringBuffer.append(" * @exception   " + ((JavaSyntax) syntaxTree.getLanguage().getSyntax()).hz(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(i, 4), i4)) + "\n");
                }
                stringBuffer.append(" *\n");
            }
            if (z) {
                Date date = new Date();
                stringBuffer.append(" * @version  " + (date.getMonth() + 1) + "/" + date.getDate() + "/" + (date.getYear() + 1900) + "\n");
            }
            stringBuffer.append(" */");
            return stringBuffer.toString();
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 1820862093736736556L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3317234421760517600L)
    private static String lg(String str, int i) {
        try {
            if (Zo) {
                iy.EQ(3353776101343363200L, null, str, new Integer(i));
            }
            if (str.length() > i) {
                return str;
            }
            return str + QX(i - str.length());
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3353776101343363200L, null, str, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v41, types: [com.aide.codemodel.api.abstraction.Tools] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.aide.codemodel.api.Entity] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.aide.codemodel.api.Type] */
    @ey(method = 515212744576498945L)
    public void EQ(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) throws Throwable {
        char c;
        String str;
        int i5 = typeArr;
        try {
            if (Zo) {
                iy.QX(-3034557905893412845L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, i5, iArr2});
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.v5);
            boolean z = this.j6.Ws().FH;
            String str2 = "\n\n" + syntaxTree.getLanguage().getCodeRenderer().getModifiersString(i3 & (-16385));
            syntaxTree.getLanguage().getCodeAnalyzer().Zo(syntaxTree);
            String str3 = ((str2 + syntaxTree.getLanguage().getTools().cb(syntaxTree, i, i2, type) + " ") + this.j6.identifierSpace.getString(i4)) + "(";
            for (int i6 = 0; i6 < i5.length; i6++) {
                if (i6 != 0) {
                    str3 = str3 + ", ";
                }
                str3 = ((str3 + syntaxTree.getLanguage().getCodeRenderer().getModifiersString(iArr[i6])) + syntaxTree.getLanguage().getTools().cb(syntaxTree, i, i2, i5[i6])) + " " + this.j6.identifierSpace.getString(iArr2[i6]);
            }
            String str4 = str3 + ")";
            if (y1.j6(i3)) {
                str = str4 + ";\n";
            } else {
                String str5 = str4 + "\n";
                str = type.getSemantic() == 1 ? str5 + "{\n // TODO: Implement this method\n}" : str5 + "{\n // TODO: Implement this method\nreturn " + syntaxTree.getLanguage().getCodeRenderer().v5(type) + ";\n}";
            }
            SetOf<? extends Type> setOf = new SetOf<>(this.j6.entitySpace);
            setOf.put(type);
            for (?? r0 : i5) {
                setOf.put(r0);
            }
            String strVJ = syntaxTree.getLanguage().getTools().vJ(syntaxTree, i, i2, setOf);
            int importEndLine = syntaxTree.getImportEndLine();
            int iWB = syntaxTree.WB();
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            this.j6.refactoringCallback.g3();
            try {
                if (strVJ.length() > 0) {
                    c = 1;
                    i5 = 9;
                    this.j6.refactoringCallback.nw(fileEntry, i, i2, i, i2, str);
                    this.j6.refactoringCallback.Sf(fileEntry, i, Ws(str) + i);
                    this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
                } else {
                    i5 = 9;
                    c = 1;
                    this.j6.refactoringCallback.nw(fileEntry, i, i2, i, i2, str);
                    this.j6.refactoringCallback.Sf(fileEntry, i, Ws(str) + i);
                }
                this.j6.refactoringCallback.ca();
            } catch (Throwable th) {
                th = th;
                if (VH) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[c] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = new Integer(i3);
                    objArr[4] = new Integer(i4);
                    objArr[5] = type;
                    objArr[6] = iArr;
                    objArr[7] = typeArr;
                    objArr[8] = iArr2;
                    iy.rN(th, -3034557905893412845L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 9;
            c = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x055d A[Catch: all -> 0x0648, TryCatch #1 {all -> 0x0648, blocks: (B:40:0x00ef, B:42:0x00f9, B:44:0x0104, B:54:0x0156, B:56:0x01cc, B:58:0x01d9, B:64:0x01fd, B:67:0x0239, B:69:0x0298, B:71:0x02b7, B:73:0x02d3, B:74:0x030b, B:76:0x0320, B:78:0x032a, B:80:0x037c, B:82:0x039b, B:84:0x03b7, B:86:0x03ef, B:88:0x0403, B:91:0x041d, B:93:0x043e, B:94:0x044d, B:96:0x0482, B:98:0x04a1, B:102:0x04b3, B:104:0x04cc, B:106:0x04f6, B:110:0x053e, B:112:0x055d, B:113:0x056c, B:115:0x0594, B:117:0x05b5, B:116:0x05a4, B:105:0x04e3, B:107:0x0511, B:97:0x0492, B:81:0x038c, B:70:0x02a8, B:61:0x01e7, B:50:0x0144, B:120:0x05fa, B:121:0x0613), top: B:139:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0594 A[Catch: all -> 0x0648, TryCatch #1 {all -> 0x0648, blocks: (B:40:0x00ef, B:42:0x00f9, B:44:0x0104, B:54:0x0156, B:56:0x01cc, B:58:0x01d9, B:64:0x01fd, B:67:0x0239, B:69:0x0298, B:71:0x02b7, B:73:0x02d3, B:74:0x030b, B:76:0x0320, B:78:0x032a, B:80:0x037c, B:82:0x039b, B:84:0x03b7, B:86:0x03ef, B:88:0x0403, B:91:0x041d, B:93:0x043e, B:94:0x044d, B:96:0x0482, B:98:0x04a1, B:102:0x04b3, B:104:0x04cc, B:106:0x04f6, B:110:0x053e, B:112:0x055d, B:113:0x056c, B:115:0x0594, B:117:0x05b5, B:116:0x05a4, B:105:0x04e3, B:107:0x0511, B:97:0x0492, B:81:0x038c, B:70:0x02a8, B:61:0x01e7, B:50:0x0144, B:120:0x05fa, B:121:0x0613), top: B:139:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05a4 A[Catch: all -> 0x0648, TryCatch #1 {all -> 0x0648, blocks: (B:40:0x00ef, B:42:0x00f9, B:44:0x0104, B:54:0x0156, B:56:0x01cc, B:58:0x01d9, B:64:0x01fd, B:67:0x0239, B:69:0x0298, B:71:0x02b7, B:73:0x02d3, B:74:0x030b, B:76:0x0320, B:78:0x032a, B:80:0x037c, B:82:0x039b, B:84:0x03b7, B:86:0x03ef, B:88:0x0403, B:91:0x041d, B:93:0x043e, B:94:0x044d, B:96:0x0482, B:98:0x04a1, B:102:0x04b3, B:104:0x04cc, B:106:0x04f6, B:110:0x053e, B:112:0x055d, B:113:0x056c, B:115:0x0594, B:117:0x05b5, B:116:0x05a4, B:105:0x04e3, B:107:0x0511, B:97:0x0492, B:81:0x038c, B:70:0x02a8, B:61:0x01e7, B:50:0x0144, B:120:0x05fa, B:121:0x0613), top: B:139:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0239 A[Catch: all -> 0x0648, TRY_ENTER, TryCatch #1 {all -> 0x0648, blocks: (B:40:0x00ef, B:42:0x00f9, B:44:0x0104, B:54:0x0156, B:56:0x01cc, B:58:0x01d9, B:64:0x01fd, B:67:0x0239, B:69:0x0298, B:71:0x02b7, B:73:0x02d3, B:74:0x030b, B:76:0x0320, B:78:0x032a, B:80:0x037c, B:82:0x039b, B:84:0x03b7, B:86:0x03ef, B:88:0x0403, B:91:0x041d, B:93:0x043e, B:94:0x044d, B:96:0x0482, B:98:0x04a1, B:102:0x04b3, B:104:0x04cc, B:106:0x04f6, B:110:0x053e, B:112:0x055d, B:113:0x056c, B:115:0x0594, B:117:0x05b5, B:116:0x05a4, B:105:0x04e3, B:107:0x0511, B:97:0x0492, B:81:0x038c, B:70:0x02a8, B:61:0x01e7, B:50:0x0144, B:120:0x05fa, B:121:0x0613), top: B:139:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032a A[Catch: all -> 0x0648, TryCatch #1 {all -> 0x0648, blocks: (B:40:0x00ef, B:42:0x00f9, B:44:0x0104, B:54:0x0156, B:56:0x01cc, B:58:0x01d9, B:64:0x01fd, B:67:0x0239, B:69:0x0298, B:71:0x02b7, B:73:0x02d3, B:74:0x030b, B:76:0x0320, B:78:0x032a, B:80:0x037c, B:82:0x039b, B:84:0x03b7, B:86:0x03ef, B:88:0x0403, B:91:0x041d, B:93:0x043e, B:94:0x044d, B:96:0x0482, B:98:0x04a1, B:102:0x04b3, B:104:0x04cc, B:106:0x04f6, B:110:0x053e, B:112:0x055d, B:113:0x056c, B:115:0x0594, B:117:0x05b5, B:116:0x05a4, B:105:0x04e3, B:107:0x0511, B:97:0x0492, B:81:0x038c, B:70:0x02a8, B:61:0x01e7, B:50:0x0144, B:120:0x05fa, B:121:0x0613), top: B:139:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041d A[Catch: all -> 0x0648, TRY_ENTER, TryCatch #1 {all -> 0x0648, blocks: (B:40:0x00ef, B:42:0x00f9, B:44:0x0104, B:54:0x0156, B:56:0x01cc, B:58:0x01d9, B:64:0x01fd, B:67:0x0239, B:69:0x0298, B:71:0x02b7, B:73:0x02d3, B:74:0x030b, B:76:0x0320, B:78:0x032a, B:80:0x037c, B:82:0x039b, B:84:0x03b7, B:86:0x03ef, B:88:0x0403, B:91:0x041d, B:93:0x043e, B:94:0x044d, B:96:0x0482, B:98:0x04a1, B:102:0x04b3, B:104:0x04cc, B:106:0x04f6, B:110:0x053e, B:112:0x055d, B:113:0x056c, B:115:0x0594, B:117:0x05b5, B:116:0x05a4, B:105:0x04e3, B:107:0x0511, B:97:0x0492, B:81:0x038c, B:70:0x02a8, B:61:0x01e7, B:50:0x0144, B:120:0x05fa, B:121:0x0613), top: B:139:0x00ef }] */
    @abcd.ey(method = -327280803511618176L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J0(com.aide.codemodel.api.FileEntry r32, int r33, int r34, int r35, int r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.y5.J0(com.aide.codemodel.api.FileEntry, int, int, int, int):void");
    }

    @ey(method = 631371955364995552L)
    public void J8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (Zo) {
                iy.J8(130736130813672664L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.v5);
            syntaxTree.getLanguage().getCodeAnalyzer().Zo(syntaxTree);
            String str = syntaxTree.getLanguage().getTools().cb(syntaxTree, i, i2, type) + " ";
            if (i3 != -1) {
                str = str + this.j6.identifierSpace.getString(i3) + " = " + syntaxTree.getLanguage().getCodeRenderer().v5(type) + ";\n";
            }
            String str2 = str;
            SetOf<? extends Type> setOf = new SetOf<>(this.j6.entitySpace);
            setOf.put(type);
            String strVJ = syntaxTree.getLanguage().getTools().vJ(syntaxTree, i, i2, setOf);
            int importEndLine = syntaxTree.getImportEndLine();
            int iWB = syntaxTree.WB();
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            this.j6.refactoringCallback.g3();
            if (strVJ.length() > 0) {
                this.j6.refactoringCallback.nw(fileEntry, i, i2, i, i2, str2);
                this.j6.refactoringCallback.Sf(fileEntry, i, i + 2);
                this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
            } else {
                this.j6.refactoringCallback.nw(fileEntry, i, i2, i, i2, str2);
                this.j6.refactoringCallback.Sf(fileEntry, i, i + 2);
            }
            this.j6.refactoringCallback.ca();
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 130736130813672664L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @ey(method = -859269292202187349L)
    public void VH(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-128917964319312063L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.v5);
            int iJl = syntaxTree.Jl(i, i2);
            if (iJl == -1) {
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.P8("Select a method to documentize.");
                return;
            }
            if (syntaxTree.getSyntaxTag(iJl) == 124) {
                j3(syntaxTree, iJl, this.j6.Ws().Hw);
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.ro();
            } else if (syntaxTree.getSyntaxTag(iJl) != 123) {
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.P8("Select a method to documentize.");
            } else {
                XL(syntaxTree, iJl, this.j6.Ws().Hw);
                this.DW.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.ro();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -128917964319312063L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 6713126943129946269L)
    public void Zo(FileEntry fileEntry) {
        try {
            if (Zo) {
                iy.tp(6073872483912586503L, this, fileEntry);
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.v5);
            gn(syntaxTree, syntaxTree.getRootNode(), this.j6.Ws().Hw);
            this.DW.releaseSyntaxTree(syntaxTree);
            this.j6.refactoringCallback.ro();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 6073872483912586503L, this, fileEntry);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    @abcd.ey(method = 1703956684789474545L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tp(com.aide.codemodel.api.FileEntry r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.y5.tp(com.aide.codemodel.api.FileEntry, int, int):void");
    }

    @ey(method = -806537920817391561L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) throws Throwable {
        int i5 = 5;
        try {
            if (Zo) {
                iy.QX(-19102488396182191L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.v5);
            String str = "\n\n" + syntaxTree.getLanguage().getCodeRenderer().getModifiersString(i3);
            syntaxTree.getLanguage().getCodeAnalyzer().Zo(syntaxTree);
            String str2 = (str + syntaxTree.getLanguage().getTools().cb(syntaxTree, i, i2, type) + " ") + this.j6.identifierSpace.getString(i4);
            if (y1.Hw(i3)) {
                str2 = str2 + " = " + syntaxTree.getLanguage().getCodeRenderer().v5(type);
            }
            String str3 = str2 + ";";
            SetOf<? extends Type> setOf = new SetOf<>(this.j6.entitySpace);
            setOf.put(type);
            String strVJ = syntaxTree.getLanguage().getTools().vJ(syntaxTree, i, i2, setOf);
            int importEndLine = syntaxTree.getImportEndLine();
            int iWB = syntaxTree.WB();
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            this.j6.refactoringCallback.g3();
            try {
                if (strVJ.length() > 0) {
                    i5 = 6;
                    this.j6.refactoringCallback.nw(fileEntry, i, i2, i, i2, str3);
                    this.j6.refactoringCallback.Sf(fileEntry, i, i + 2);
                    this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
                } else {
                    i5 = 6;
                    this.j6.refactoringCallback.nw(fileEntry, i, i2, i, i2, str3);
                    this.j6.refactoringCallback.Sf(fileEntry, i, i + 2);
                }
                this.j6.refactoringCallback.ca();
            } catch (Throwable th) {
                th = th;
                if (VH) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = new Integer(i3);
                    objArr[4] = new Integer(i4);
                    objArr[5] = type;
                    iy.rN(th, -19102488396182191L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03de  */
    @abcd.ey(method = -7614751119869656371L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v5(com.aide.codemodel.api.FileEntry r24, int r25, int r26, int r27, int r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.y5.v5(com.aide.codemodel.api.FileEntry, int, int, int, int):void");
    }

    @ey(method = 1076899355630990573L)
    public void we(FileEntry fileEntry, int i, int i2, Member member) throws Throwable {
        int i3 = i;
        try {
            if (Zo) {
                iy.J0(489632091971167635L, this, fileEntry, new Integer(i3), new Integer(i2), member);
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.DW.getSyntaxTree(fileEntry, this.v5);
            int iSy = syntaxTree.sy(i3, i2, i3, i2);
            if (iSy == -1) {
                this.j6.refactoringCallback.VH("Select a place inside a class.");
                return;
            }
            int endLine = syntaxTree.getEndLine(syntaxTree.getChildNode(iSy, 0));
            int endColumn = syntaxTree.getEndColumn(syntaxTree.getChildNode(iSy, 0));
            int childCount = syntaxTree.getChildCount(iSy);
            int i4 = endLine;
            int endColumn2 = endColumn;
            for (int i5 = 0; i5 < childCount; i5++) {
                int childNode = syntaxTree.getChildNode(iSy, i5);
                if (syntaxTree.getEndLine(childNode) < i3 || (syntaxTree.getEndLine(childNode) == i3 && syntaxTree.getEndColumn(childNode) < i2)) {
                    int endLine2 = syntaxTree.getEndLine(childNode);
                    endColumn2 = syntaxTree.getEndColumn(childNode);
                    i4 = endLine2;
                }
            }
            try {
                ClassType classtype = this.FH.getClasstype(syntaxTree.getFile(), this.v5, syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(iSy)));
                syntaxTree.getLanguage().getCodeAnalyzer().Zo(syntaxTree);
                SetOf<? extends Type> setOf = new SetOf<>(this.FH);
                String strDW = "";
                if (this.j6.Ws().DW) {
                    String strFH = member.FH();
                    if (strFH.length() > 0) {
                        String str = "/**\n";
                        StringTokenizer stringTokenizer = new StringTokenizer(strFH, "\n");
                        while (stringTokenizer.hasMoreElements()) {
                            str = str + " *" + stringTokenizer.nextToken() + "\n";
                        }
                        strDW = str + "*/";
                    }
                }
                if (this.j6.Ws().FH && strDW.length() == 0) {
                    strDW = DW(member, this.j6.Ws().Hw);
                }
                String str2 = strDW.length() > 0 ? "\n\n" + strDW + "\n" : "\n\n";
                Type typeU9 = classtype.u9();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                try {
                    sb.append(Hw(syntaxTree, i4, endColumn2, typeU9, member, classtype));
                    String string = sb.toString();
                    try {
                        if (!member.iW()) {
                            setOf.put(member.WB());
                        }
                        int iOY = member.oY();
                        for (int i6 = 0; i6 < iOY; i6++) {
                            setOf.put(member.qp(i6));
                        }
                    } catch (e4 unused) {
                    }
                    this.j6.refactoringCallback.nw(fileEntry, i4, endColumn2, i4, endColumn2, string);
                    this.j6.refactoringCallback.Sf(fileEntry, i4, Ws(string) + i4);
                    String strVJ = syntaxTree.getLanguage().getTools().vJ(syntaxTree, i, i2, setOf);
                    if (strVJ.length() > 0) {
                        int importEndLine = syntaxTree.getImportEndLine();
                        int iWB = syntaxTree.WB();
                        this.j6.refactoringCallback.nw(fileEntry, importEndLine, iWB, importEndLine, iWB, strVJ);
                    }
                    this.DW.releaseSyntaxTree(syntaxTree);
                    this.j6.refactoringCallback.j3();
                } catch (Throwable th) {
                    th = th;
                    i3 = i;
                    if (VH) {
                        iy.a8(th, 489632091971167635L, this, fileEntry, new Integer(i3), new Integer(i2), member);
                    }
                    throw th;
                }
            } catch (e4 e) {
                throw new RuntimeException(e.toString());
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
