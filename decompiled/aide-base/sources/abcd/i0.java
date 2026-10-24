package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfInt;

@cy(clazz = -6589829432882957220L, container = -6589829432882957220L, user = true)
/* loaded from: classes.dex */
public class i0 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 3041696473504231152L)
    private final AIDEModel j6;

    @cy(clazz = 44795688740898347L, container = 44795688740898347L, user = true)
    public class a {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = -3661426543257197220L)
        public int DW;

        @dy(field = 3054130089615463355L)
        public int FH;

        @dy(field = -3528083214502998353L)
        public int Hw;

        @dy(field = -443075023345428800L)
        public int j6;

        @dy(field = 4733430806916637059L)
        public boolean v5;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -65491917930648000L)
        public a(i0 i0Var) {
            try {
                if (Zo) {
                    iy.tp(456372603629748821L, null, i0Var);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, 456372603629748821L, null, i0Var);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(i0.class);
    }

    @ey(method = 65805404052642975L)
    public i0(AIDEModel aIDEModel) {
        try {
            if (DW) {
                iy.tp(-2778352862561940797L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -2778352862561940797L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = -4814938703253642789L)
    public Entity DW(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (DW) {
                iy.we(6052428397372612261L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (syntaxTree.jO(i, i2) != -1) {
                return FH(syntaxTree, i, i2);
            }
            int tokenNodeAt = syntaxTree.getTokenNodeAt(i, i2);
            if (tokenNodeAt == -1 || !syntaxTree.hasAttrType(syntaxTree.getParentNode(tokenNodeAt))) {
                return null;
            }
            Type attrType = syntaxTree.getAttrType(syntaxTree.getParentNode(tokenNodeAt));
            if (attrType.isClassType()) {
                return attrType;
            }
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 6052428397372612261L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -32706311318951445L)
    public boolean EQ(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (DW) {
                iy.we(3816035894271042673L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iJO = syntaxTree.jO(i, i2);
            if (iJO == -1) {
                return false;
            }
            syntaxTree.getIdentifier(iJO);
            int iSh = syntaxTree.sh(iJO);
            return iSh == 1 || iSh == 2 || iSh == 3 || iSh == 32;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 3816035894271042673L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @abcd.ey(method = 314225706445143660L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.aide.codemodel.api.Entity FH(com.aide.codemodel.api.SyntaxTree r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = abcd.i0.DW     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L18
            r1 = -655221471878032440(0xf6e82f8af78053c8, double:-6.092634464004572E264)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r11)     // Catch: java.lang.Throwable -> L2e
            r3 = r8
            r4 = r9
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2e
        L18:
            int r0 = r9.jO(r10, r11)     // Catch: java.lang.Throwable -> L2e
            r1 = -1
            if (r0 == r1) goto L2c
            int r1 = r9.sh(r0)     // Catch: java.lang.Throwable -> L2e
            switch(r1) {
                case 6: goto L27;
                case 7: goto L27;
                case 8: goto L27;
                case 9: goto L27;
                case 10: goto L27;
                case 11: goto L27;
                case 12: goto L27;
                case 13: goto L27;
                case 14: goto L27;
                case 15: goto L27;
                case 16: goto L27;
                case 17: goto L27;
                case 18: goto L26;
                case 19: goto L27;
                case 20: goto L27;
                case 21: goto L27;
                case 22: goto L27;
                case 23: goto L27;
                case 24: goto L27;
                case 25: goto L27;
                default: goto L26;
            }     // Catch: java.lang.Throwable -> L2e
        L26:
            goto L2c
        L27:
            com.aide.codemodel.api.Entity r9 = r9.getAttrReferenceEntity(r0)     // Catch: java.lang.Throwable -> L2e
            return r9
        L2c:
            r9 = 0
            return r9
        L2e:
            r0 = move-exception
            boolean r1 = abcd.i0.FH
            if (r1 == 0) goto L48
            r2 = -655221471878032440(0xf6e82f8af78053c8, double:-6.092634464004572E264)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r10)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r11)
            r1 = r0
            r4 = r8
            r5 = r9
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        L48:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.i0.FH(com.aide.codemodel.api.SyntaxTree, int, int):com.aide.codemodel.api.Entity");
    }

    @ey(method = 4171993438734685317L)
    public Variable Hw(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (DW) {
                iy.we(886308861842103615L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iJO = syntaxTree.jO(i, i2);
            if (iJO != -1) {
                int identifier = syntaxTree.getIdentifier(iJO);
                int iSh = syntaxTree.sh(iJO);
                if (iSh == 1 || iSh == 2 || iSh == 3 || iSh == 32) {
                    int attrReferenceNode = syntaxTree.getAttrReferenceNode(iJO);
                    return new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(attrReferenceNode), syntaxTree.getStartColumn(attrReferenceNode), syntaxTree.getEndColumn(attrReferenceNode), identifier, syntaxTree.hasAttrType(iJO) ? syntaxTree.getAttrType(iJO) : null);
                }
            }
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 886308861842103615L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1726537252011739320L)
    public boolean J0(SyntaxTree syntaxTree, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(792772045225108812L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            return syntaxTree.sy(i, i2, i3, i4) == -1;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 792772045225108812L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 2432146413382243984L)
    public a J8(SyntaxTree syntaxTree, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(4615733396958965344L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i2 == i4 && i == i3) {
                return new a(this);
            }
            int iNh = syntaxTree.Nh(i, i2, i3, i4);
            int blockNodeAt = syntaxTree.getBlockNodeAt(i, i2, i3, i4);
            if (iNh != -1 && iNh != blockNodeAt) {
                a aVar = new a(this);
                aVar.v5 = true;
                aVar.j6 = syntaxTree.getStartLine(iNh);
                aVar.DW = syntaxTree.getStartColumn(iNh);
                aVar.FH = syntaxTree.getEndLine(iNh);
                aVar.Hw = syntaxTree.getEndColumn(iNh);
                return aVar;
            }
            ListOfInt listOfIntQq = syntaxTree.Qq(i, i2, i3, i4);
            if (listOfIntQq == null) {
                return new a(this);
            }
            a aVar2 = new a(this);
            aVar2.v5 = true;
            aVar2.j6 = syntaxTree.getStartLine(listOfIntQq.get(0));
            aVar2.DW = syntaxTree.getStartColumn(listOfIntQq.get(0));
            aVar2.FH = syntaxTree.getEndLine(listOfIntQq.get(listOfIntQq.size() - 1));
            aVar2.Hw = syntaxTree.getEndColumn(listOfIntQq.get(listOfIntQq.size() - 1));
            return aVar2;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 4615733396958965344L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 249849121507959811L)
    public boolean VH(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (DW) {
                iy.we(6558479258776871901L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iJO = syntaxTree.jO(i, i2);
            if (iJO == -1) {
                return false;
            }
            int iSh = syntaxTree.sh(iJO);
            return iSh == 1 || iSh == 32;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 6558479258776871901L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3131395347882284800L)
    public boolean Zo(SyntaxTree syntaxTree, int i, int i2, int i3, int i4) {
        int iNh;
        try {
            if (DW) {
                iy.J8(-1210920110515087560L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i2 == i4 && i == i3 && (iNh = syntaxTree.Nh(i, i2, i3, i4)) != -1) {
                if (syntaxTree.isBlockNode(iNh)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -1210920110515087560L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -6026482236238856112L)
    public boolean gn(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (DW) {
                iy.we(-1911418741689918112L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iJO = syntaxTree.jO(i, i2);
            if (iJO == -1) {
                return false;
            }
            int iSh = syntaxTree.sh(iJO);
            if (iSh != 7 && iSh != 11 && iSh != 13 && iSh != 15 && iSh != 19 && iSh != 21) {
                if (iSh != 16) {
                    return false;
                }
                if (!this.j6.fileSpace.g3(((Member) syntaxTree.getAttrReferenceEntity(iJO)).getFile())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -1911418741689918112L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 869237819936385435L)
    public boolean j6(SyntaxTree syntaxTree, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(2090534373982380093L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            ListOfInt listOfIntN5 = syntaxTree.n5(i, i2, i3, i4);
            if (listOfIntN5 != null) {
                for (int size = listOfIntN5.size() - 1; size >= 0; size--) {
                    for (int i5 = 0; i5 < syntaxTree.getChildCount(listOfIntN5.get(size)); i5++) {
                        int childNode = syntaxTree.getChildNode(listOfIntN5.get(size), i5);
                        if (syntaxTree.isFieldDeclarationNode(childNode)) {
                            try {
                                Member memberJw = this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode));
                                if (!memberJw.sM() && !memberJw.sE()) {
                                    return true;
                                }
                            } catch (e4 unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 2090534373982380093L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1103876054390354405L)
    public boolean tp(SyntaxTree syntaxTree, int i, int i2, int i3, int i4) {
        try {
            if (DW) {
                iy.J8(-76874327176180335L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            int iKo = syntaxTree.ko(i, i2);
            int iJO = syntaxTree.jO(i3, i4);
            return (iKo == -1 || iJO == 1 || iKo != iJO) ? false : true;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -76874327176180335L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 1693624005694428720L)
    public boolean u7(SyntaxTree syntaxTree, int i, int i2, int i3, int i4) {
        int readExpressionNodeAt;
        try {
            if (DW) {
                iy.J8(-636924219514509472L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if ((i2 == i4 && i == i3) || (readExpressionNodeAt = syntaxTree.getReadExpressionNodeAt(i, i2, i3, i4)) == -1) {
                return false;
            }
            return !syntaxTree.GT(syntaxTree.getParentNode(readExpressionNodeAt));
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, -636924219514509472L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 548153869777690176L)
    public boolean v5(SyntaxTree syntaxTree, int i, int i2, int i3, int i4) {
        int iSy;
        int blockNodeAt;
        try {
            if (DW) {
                iy.J8(256959059405771324L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i2 == i4 && i == i3 && (iSy = syntaxTree.sy(i, i2, i3, i4)) != -1 && ((blockNodeAt = syntaxTree.getBlockNodeAt(i, i2, i3, i4)) == -1 || !syntaxTree.isEnclosingNode(iSy, blockNodeAt))) {
                try {
                    ClassType classtype = this.j6.entitySpace.getClasstype(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(syntaxTree.getParentNode(iSy)));
                    MapOfInt<Member> mapOfIntE3 = classtype.e3();
                    mapOfIntE3.DEFAULT_ITERATOR.DW();
                    while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                        Member member = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                        if (y1.j6(member.getModifiers()) && member.getEnclosingClassType() != classtype) {
                            return true;
                        }
                    }
                    MapOfInt<Member> mapOfIntEU = classtype.eU();
                    mapOfIntEU.DEFAULT_ITERATOR.DW();
                    while (mapOfIntEU.DEFAULT_ITERATOR.hasMoreElements()) {
                        Member member2 = (Member) mapOfIntEU.DEFAULT_ITERATOR.nextValue();
                        if (y1.j6(member2.getModifiers()) && member2.getEnclosingClassType() != classtype && (member2.sM() || member2.sE())) {
                            return true;
                        }
                    }
                } catch (e4 unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 256959059405771324L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 96024340319219171L)
    public boolean we(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (DW) {
                iy.we(835348183723670945L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iJO = syntaxTree.jO(i, i2);
            if (iJO != -1) {
                syntaxTree.getIdentifier(iJO);
                int iSh = syntaxTree.sh(iJO);
                if (iSh == 1 || iSh == 2 || iSh == 3) {
                    if (syntaxTree.sh(syntaxTree.getAttrReferenceNode(iJO)) == 1) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 835348183723670945L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
