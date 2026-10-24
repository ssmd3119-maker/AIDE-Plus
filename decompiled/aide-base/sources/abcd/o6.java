package abcd;

import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.java.JavaTypeSystem;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.Stack;

@cy(clazz = -699406337387828800L, container = -699406337387828800L, user = true)
/* loaded from: classes.dex */
public class o6 {

    @fy
    private static /* synthetic */ boolean aM;

    @gy
    private static /* synthetic */ boolean j3;

    @dy(field = -42230960020258041L)
    private final EntitySpace DW;

    @dy(field = -8449167060008107125L)
    private ListOfInt EQ;

    @dy(field = 1592074076257719808L)
    private final JavaTypeSystem FH;

    @dy(field = -1950204381388417303L)
    private Stack<MapOfIntInt> Hw;

    @dy(field = 3727084974672863253L)
    private int J0;

    @dy(field = -3199270150856153376L)
    private FunctionOfIntInt J8;

    @dy(field = -2101861800345370191L)
    private ListOfInt QX;

    @dy(field = -3904038697715404720L)
    private SetOfInt VH;

    @dy(field = -4114967764066394560L)
    private FunctionOfIntInt Ws;

    @dy(field = 157971488616081075L)
    private ListOfInt XL;

    @dy(field = 329799355108904980L)
    private final boolean Zo;

    @dy(field = 3715738420187489872L)
    private SetOfInt gn;

    @dy(field = -2510009628330290295L)
    private final ErrorTable j6;

    @dy(field = 7206138773084011840L)
    private ListOfInt tp;

    @dy(field = 647299077558343752L)
    private ListOfInt u7;

    @dy(field = -4713977396547679851L)
    private Type[] v5;

    @dy(field = -1564302155730653493L)
    private int we;

    static {
        iy.Zo(o6.class);
    }

    @ey(method = 432667064702507405L)
    public o6(Model model, JavaTypeSystem javaTypeSystem, boolean z) {
        try {
            if (aM) {
                iy.we(-267499786660002223L, null, model, javaTypeSystem, new Boolean(z));
            }
            this.VH = new SetOfInt();
            this.gn = new SetOfInt();
            this.u7 = new ListOfInt();
            this.tp = new ListOfInt();
            this.EQ = new ListOfInt();
            this.J8 = new FunctionOfIntInt();
            this.Ws = new FunctionOfIntInt();
            this.QX = new ListOfInt();
            this.XL = new ListOfInt();
            this.j6 = model.errorTable;
            this.DW = model.entitySpace;
            this.FH = javaTypeSystem;
            this.Zo = z;
            this.Hw = new Stack<>();
            this.v5 = new Type[1000];
        } catch (Throwable th) {
            if (j3) {
                iy.U2(th, -267499786660002223L, null, model, javaTypeSystem, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4329191993184513140L)
    private void BT() {
        try {
            if (aM) {
                iy.gn(-2858434901373962304L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.u7.push(this.u7.get(this.u7.size() - this.we));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -2858434901373962304L, this);
            }
            throw th;
        }
    }

    @ey(method = -5518939049090031345L)
    private void DW(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(1464995043938832891L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.declareAttrTarget(i)) {
                this.VH.put(syntaxTree.getAttrTarget(i));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, 1464995043938832891L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 635439721200822473L)
    private void EQ(SyntaxTree syntaxTree, int i, MapOfIntInt mapOfIntInt) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        try {
            if (aM) {
                iy.we(2739759092726613997L, this, syntaxTree, new Integer(i7), mapOfIntInt);
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 1) {
                if (syntaxTree.sh(i) == 20) {
                    Member member = (Member) syntaxTree.getAttrReferenceEntity(i);
                    if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 156 && syntaxTree.hasLeftSisterNode(i)) {
                        int leftSisterNode = syntaxTree.getLeftSisterNode(syntaxTree.getLeftSisterNode(syntaxTree.getLeftSisterNode(i)));
                        if (syntaxTree.hasAttrType(leftSisterNode) && syntaxTree.getAttrType(leftSisterNode).isArrayType() && this.FH.hK(member)) {
                            return;
                        }
                    }
                    if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 155) {
                        i2 = 0;
                        int childNode = syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0);
                        if (syntaxTree.hasAttrType(childNode) && syntaxTree.getAttrType(childNode).isArrayType() && this.FH.hK(member)) {
                            return;
                        }
                    } else {
                        i2 = 0;
                    }
                    int iXG = member.XG();
                    for (int i8 = 0; i8 < iXG; i8++) {
                        Zo(syntaxTree, i, syntaxTree.getChildNode(syntaxTree.getParentNode(i), syntaxTree.getChildCount(syntaxTree.getParentNode(i)) - 1), mapOfIntInt, member, i8);
                    }
                } else {
                    i2 = 0;
                }
                if (syntaxTree.sh(i) == 22 || syntaxTree.sh(i) == 25 || syntaxTree.sh(i) == 24 || syntaxTree.sh(i) == 23) {
                    Member member2 = (Member) syntaxTree.getAttrReferenceEntity(i);
                    int iXG2 = member2.XG();
                    while (i2 < iXG2) {
                        Zo(syntaxTree, i, syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), syntaxTree.getChildCount(syntaxTree.getParentNode(syntaxTree.getParentNode(i))) - 1), mapOfIntInt, member2, i2);
                        i2++;
                    }
                    return;
                }
                return;
            }
            if (syntaxTag == 142) {
                int childCount = syntaxTree.getChildCount(i);
                for (int i9 = 0; i9 < childCount; i9++) {
                    EQ(syntaxTree, syntaxTree.getChildNode(i7, i9), mapOfIntInt);
                }
                if (syntaxTree.hasAttrType(syntaxTree.getChildNode(i7, 1))) {
                    v5(syntaxTree, mapOfIntInt, syntaxTree.getAttrType(syntaxTree.getChildNode(i7, 1)), i7);
                    return;
                }
                return;
            }
            if (syntaxTag == 150) {
                MapOfIntInt mapOfIntIntXL = XL();
                EQ(syntaxTree, syntaxTree.getChildNode(i7, 1), mapOfIntIntXL);
                int childCount2 = syntaxTree.getChildCount(i);
                int i10 = 2;
                while (true) {
                    i3 = 3;
                    i4 = 204;
                    if (i10 >= childCount2) {
                        break;
                    }
                    int childNode2 = syntaxTree.getChildNode(i7, i10);
                    if (syntaxTree.getSyntaxTag(childNode2) == 204) {
                        int childNode3 = syntaxTree.getChildNode(childNode2, 3);
                        int childCount3 = syntaxTree.getChildCount(childNode3);
                        int i11 = 0;
                        while (i11 < childCount3) {
                            int childNode4 = syntaxTree.getChildNode(childNode3, i11);
                            if (syntaxTree.hasAttrType(childNode4)) {
                                Type attrType = syntaxTree.getAttrType(childNode4);
                                try {
                                    i6 = childNode3;
                                    try {
                                        if (this.FH.w9(syntaxTree.getFile(), attrType) && attrType != this.FH.ca(syntaxTree.getFile()) && attrType != this.FH.XG(syntaxTree.getFile()) && !ca(syntaxTree, mapOfIntIntXL, attrType)) {
                                            this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode4), syntaxTree.getStartColumn(childNode4), syntaxTree.getEndLine(childNode4), syntaxTree.getEndColumn(childNode4), "The exception </C>" + attrType.getFullyQualifiedNameString() + "<//C> is not thrown", 12);
                                            this.j6.Ws(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode2), syntaxTree.getStartColumn(childNode2), syntaxTree.getEndLine(childNode2), syntaxTree.getEndColumn(childNode2), "", "Delete catch clause");
                                        }
                                    } catch (e4 unused) {
                                    }
                                } catch (e4 unused2) {
                                }
                            } else {
                                i6 = childNode3;
                            }
                            i11 += 2;
                            childNode3 = i6;
                        }
                    }
                    i10++;
                }
                for (int i12 = 2; i12 < childCount2; i12++) {
                    int childNode5 = syntaxTree.getChildNode(i7, i12);
                    if (syntaxTree.getSyntaxTag(childNode5) == 204) {
                        int childNode6 = syntaxTree.getChildNode(childNode5, 3);
                        int childCount4 = syntaxTree.getChildCount(childNode6);
                        for (int i13 = 0; i13 < childCount4; i13 += 2) {
                            int childNode7 = syntaxTree.getChildNode(childNode6, i13);
                            if (syntaxTree.hasAttrType(childNode7)) {
                                ei(syntaxTree, mapOfIntIntXL, syntaxTree.getAttrType(childNode7));
                            }
                        }
                    }
                }
                int i14 = 2;
                while (i14 < childCount2) {
                    try {
                        int childNode8 = syntaxTree.getChildNode(i7, i14);
                        if (syntaxTree.getSyntaxTag(childNode8) == i4) {
                            int childNode9 = syntaxTree.getChildNode(childNode8, i3);
                            int childCount5 = syntaxTree.getChildCount(childNode9);
                            int i15 = 0;
                            while (i15 < childCount5) {
                                int childNode10 = syntaxTree.getChildNode(childNode9, i15);
                                if (syntaxTree.hasAttrType(childNode10)) {
                                    Type attrType2 = syntaxTree.getAttrType(childNode10);
                                    int i16 = 2;
                                    while (i16 < i14) {
                                        int childNode11 = syntaxTree.getChildNode(i7, i16);
                                        int i17 = childNode9;
                                        int i18 = childCount5;
                                        if (syntaxTree.getSyntaxTag(childNode11) == 204) {
                                            int childNode12 = syntaxTree.getChildNode(childNode11, 3);
                                            int childCount6 = syntaxTree.getChildCount(childNode12);
                                            int i19 = 0;
                                            while (i19 < childCount6) {
                                                int i20 = childCount6;
                                                int childNode13 = syntaxTree.getChildNode(childNode12, i19);
                                                if (syntaxTree.hasAttrType(childNode13)) {
                                                    i5 = childNode12;
                                                    if (attrType2.isImplicitConvertibleTo(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getAttrType(childNode13))) {
                                                        this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode10), syntaxTree.getStartColumn(childNode10), syntaxTree.getEndLine(childNode10), syntaxTree.getEndColumn(childNode10), "The exception </C>" + attrType2.getFullyQualifiedNameString() + "<//C> has already been caught", 12);
                                                        this.j6.Ws(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode8), syntaxTree.getStartColumn(childNode8), syntaxTree.getEndLine(childNode8), syntaxTree.getEndColumn(childNode8), "", "Delete catch clause");
                                                    }
                                                } else {
                                                    i5 = childNode12;
                                                }
                                                i19 += 2;
                                                childCount6 = i20;
                                                childNode12 = i5;
                                            }
                                        }
                                        i16++;
                                        i7 = i;
                                        childNode9 = i17;
                                        childCount5 = i18;
                                    }
                                }
                                i15 += 2;
                                i7 = i;
                                childNode9 = childNode9;
                                childCount5 = childCount5;
                            }
                        }
                        i14++;
                        i7 = i;
                        i3 = 3;
                        i4 = 204;
                    } catch (Throwable th) {
                        th = th;
                        i7 = i;
                        if (j3) {
                            iy.U2(th, 2739759092726613997L, this, syntaxTree, new Integer(i7), mapOfIntInt);
                        }
                        throw th;
                    }
                }
                mapOfIntInt.u7(mapOfIntIntXL);
                P8(mapOfIntIntXL);
                for (int i21 = 2; i21 < childCount2; i21++) {
                    EQ(syntaxTree, syntaxTree.getChildNode(i, i21), mapOfIntInt);
                }
                return;
            }
            switch (syntaxTag) {
                case 122:
                    int childCount7 = syntaxTree.getChildCount(i);
                    for (int i22 = 0; i22 < childCount7; i22++) {
                        int childNode14 = syntaxTree.getChildNode(i7, i22);
                        int syntaxTag2 = syntaxTree.getSyntaxTag(childNode14);
                        if (syntaxTag2 != 126) {
                            if (syntaxTag2 != 127) {
                                EQ(syntaxTree, childNode14, mapOfIntInt);
                            } else if (syntaxTree.getChildCount(syntaxTree.getChildNode(childNode14, 0)) != 0) {
                                MapOfIntInt mapOfIntIntXL2 = XL();
                                EQ(syntaxTree, syntaxTree.getChildNode(childNode14, syntaxTree.getChildCount(childNode14) - 1), mapOfIntIntXL2);
                                mapOfIntIntXL2.j6.DW();
                                while (mapOfIntIntXL2.j6.j6()) {
                                    this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(mapOfIntIntXL2.j6.v5()), syntaxTree.getStartColumn(mapOfIntIntXL2.j6.v5()), syntaxTree.getEndLine(mapOfIntIntXL2.j6.v5()), syntaxTree.getEndColumn(mapOfIntIntXL2.j6.v5()), "The exception </C>" + this.DW.getEntity(mapOfIntIntXL2.j6.Hw()).getFullyQualifiedNameString() + "<//C> must be caught", 12);
                                    this.j6.QX(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(mapOfIntIntXL2.j6.v5()), syntaxTree.getStartColumn(mapOfIntIntXL2.j6.v5()), "Surround with try/catch");
                                }
                                P8(mapOfIntIntXL2);
                            } else {
                                EQ(syntaxTree, childNode14, mapOfIntInt);
                            }
                        }
                    }
                    return;
                case 123:
                    MapOfIntInt mapOfIntIntXL3 = XL();
                    EQ(syntaxTree, syntaxTree.getChildNode(i7, syntaxTree.getChildCount(i) - 1), mapOfIntIntXL3);
                    int parentNode = syntaxTree.getParentNode(i);
                    int childCount8 = syntaxTree.getChildCount(parentNode);
                    for (int i23 = 0; i23 < childCount8; i23++) {
                        int childNode15 = syntaxTree.getChildNode(parentNode, i23);
                        int syntaxTag3 = syntaxTree.getSyntaxTag(childNode15);
                        if (syntaxTag3 == 126 || (syntaxTag3 == 127 && syntaxTree.getChildCount(syntaxTree.getChildNode(childNode15, 0)) == 0)) {
                            EQ(syntaxTree, childNode15, mapOfIntIntXL3);
                        }
                    }
                    int childNode16 = syntaxTree.getChildNode(i7, 4);
                    int childCount9 = syntaxTree.getChildCount(childNode16);
                    for (int i24 = 1; i24 < childCount9; i24 += 2) {
                        int childNode17 = syntaxTree.getChildNode(childNode16, i24);
                        if (syntaxTree.hasAttrType(childNode17)) {
                            Type attrType3 = syntaxTree.getAttrType(childNode17);
                            try {
                                if (!ca(syntaxTree, mapOfIntIntXL3, attrType3) && this.FH.w9(syntaxTree.getFile(), attrType3) && attrType3 != this.FH.ca(syntaxTree.getFile()) && attrType3 != this.FH.XG(syntaxTree.getFile()) && this.Zo) {
                                    this.j6.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode17), syntaxTree.getStartColumn(childNode17), syntaxTree.getEndLine(childNode17), syntaxTree.getEndColumn(childNode17), "The exception </C>" + attrType3.getFullyQualifiedNameString() + "<//C> is not thrown", 50);
                                }
                            } catch (e4 unused3) {
                            }
                        }
                    }
                    for (int i25 = 1; i25 < childCount9; i25 += 2) {
                        int childNode18 = syntaxTree.getChildNode(childNode16, i25);
                        if (syntaxTree.hasAttrType(childNode18)) {
                            ei(syntaxTree, mapOfIntIntXL3, syntaxTree.getAttrType(childNode18));
                        }
                    }
                    mapOfIntIntXL3.j6.DW();
                    while (mapOfIntIntXL3.j6.j6()) {
                        String str = "The exception </C>" + this.DW.getEntity(mapOfIntIntXL3.j6.Hw()).getFullyQualifiedNameString() + "<//C> must be caught";
                        int startLine = syntaxTree.getStartLine(mapOfIntIntXL3.j6.v5());
                        int startColumn = syntaxTree.getStartColumn(mapOfIntIntXL3.j6.v5());
                        int endLine = syntaxTree.getEndLine(mapOfIntIntXL3.j6.v5());
                        int endColumn = syntaxTree.getEndColumn(mapOfIntIntXL3.j6.v5());
                        if (startLine == endLine && startColumn == endColumn) {
                            endColumn++;
                        }
                        this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), startLine, startColumn, endLine, endColumn, str, 12);
                        this.j6.QX(syntaxTree.getFile(), syntaxTree.getLanguage(), startLine, startColumn, "Surround with try/catch");
                        this.j6.v5(syntaxTree.getFile(), syntaxTree.getLanguage(), startLine, startColumn, "Add to throws clause");
                    }
                    P8(mapOfIntIntXL3);
                    return;
                case 124:
                    MapOfIntInt mapOfIntIntXL4 = XL();
                    EQ(syntaxTree, syntaxTree.getChildNode(i7, syntaxTree.getChildCount(i) - 1), mapOfIntIntXL4);
                    int childNode19 = syntaxTree.getChildNode(i7, 7);
                    int childCount10 = syntaxTree.getChildCount(childNode19);
                    try {
                        if (!this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i)).isAbstract()) {
                            for (int i26 = 1; i26 < childCount10; i26 += 2) {
                                int childNode20 = syntaxTree.getChildNode(childNode19, i26);
                                if (syntaxTree.hasAttrType(childNode20)) {
                                    Type attrType4 = syntaxTree.getAttrType(childNode20);
                                    try {
                                        if (!ca(syntaxTree, mapOfIntIntXL4, attrType4) && this.FH.w9(syntaxTree.getFile(), attrType4) && attrType4 != this.FH.ca(syntaxTree.getFile()) && attrType4 != this.FH.XG(syntaxTree.getFile()) && this.Zo) {
                                            this.j6.lg(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode20), syntaxTree.getStartColumn(childNode20), syntaxTree.getEndLine(childNode20), syntaxTree.getEndColumn(childNode20), "The exception </C>" + attrType4.getFullyQualifiedNameString() + "<//C> is not thrown", 50);
                                        }
                                    } catch (e4 unused4) {
                                    }
                                }
                            }
                        }
                    } catch (e4 unused5) {
                    }
                    for (int i27 = 1; i27 < childCount10; i27 += 2) {
                        int childNode21 = syntaxTree.getChildNode(childNode19, i27);
                        if (syntaxTree.hasAttrType(childNode21)) {
                            ei(syntaxTree, mapOfIntIntXL4, syntaxTree.getAttrType(childNode21));
                        }
                    }
                    mapOfIntIntXL4.j6.DW();
                    while (mapOfIntIntXL4.j6.j6()) {
                        String str2 = "The exception </C>" + this.DW.getEntity(mapOfIntIntXL4.j6.Hw()).getFullyQualifiedNameString() + "<//C> must be caught or declared in the throws clause";
                        int startLine2 = syntaxTree.getStartLine(mapOfIntIntXL4.j6.v5());
                        int startColumn2 = syntaxTree.getStartColumn(mapOfIntIntXL4.j6.v5());
                        this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), startLine2, startColumn2, syntaxTree.getEndLine(mapOfIntIntXL4.j6.v5()), syntaxTree.getEndColumn(mapOfIntIntXL4.j6.v5()), str2, 12);
                        this.j6.QX(syntaxTree.getFile(), syntaxTree.getLanguage(), startLine2, startColumn2, "Surround with try/catch");
                        this.j6.v5(syntaxTree.getFile(), syntaxTree.getLanguage(), startLine2, startColumn2, "Add to throws clause");
                    }
                    P8(mapOfIntIntXL4);
                    return;
                default:
                    int childCount11 = syntaxTree.getChildCount(i);
                    for (int i28 = 0; i28 < childCount11; i28++) {
                        EQ(syntaxTree, syntaxTree.getChildNode(i7, i28), mapOfIntInt);
                    }
                    return;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -2023025234262367016L)
    private void FH(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(-1842233557550518440L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.declareAttrTarget(i)) {
                int i2 = this.Ws.get(syntaxTree.getAttrTarget(i));
                for (int i3 = 0; i3 < this.we; i3++) {
                    int i4 = i2 + i3;
                    this.XL.gn(i4, this.XL.get(i4) & this.u7.get((this.u7.size() - this.we) + i3));
                }
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, -1842233557550518440L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -904436931058659429L)
    private void Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(2703916375187442147L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.declareAttrTarget(i)) {
                this.gn.put(syntaxTree.getAttrTarget(i));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, 2703916375187442147L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2723836273991095725L)
    private void I(int i) {
        try {
            if (aM) {
                iy.u7(-4865959331244461005L, this, i);
            }
            int size = (this.tp.size() - this.we) + (i / 31);
            int i2 = 1 << (i % 31);
            this.tp.gn(size, this.tp.get(size) | i2);
            this.EQ.gn(size, i2 | this.EQ.get(size));
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, -4865959331244461005L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f9 A[Catch: all -> 0x04a2, TryCatch #0 {all -> 0x04a2, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0022, B:9:0x002e, B:13:0x0078, B:23:0x0095, B:24:0x0098, B:26:0x009e, B:28:0x00a9, B:45:0x00ee, B:46:0x00f8, B:48:0x0109, B:50:0x010f, B:52:0x0115, B:54:0x011f, B:56:0x012b, B:58:0x013a, B:60:0x0140, B:62:0x0146, B:64:0x014c, B:66:0x0156, B:57:0x0133, B:74:0x0176, B:79:0x0190, B:109:0x026f, B:125:0x02bb, B:127:0x02c2, B:129:0x02cd, B:132:0x02d8, B:135:0x02de, B:137:0x02e2, B:139:0x02f3, B:141:0x02f9, B:143:0x0303, B:145:0x030f, B:147:0x031e, B:149:0x0324, B:151:0x032a, B:153:0x0334, B:146:0x0317, B:161:0x0354, B:163:0x036d, B:165:0x037c, B:166:0x0381, B:168:0x0385, B:170:0x0391, B:172:0x039f, B:174:0x03b3, B:176:0x03b9, B:178:0x03c4, B:180:0x03ce, B:182:0x03f9, B:184:0x0405, B:186:0x040b, B:188:0x0427, B:196:0x0482, B:192:0x0474, B:12:0x0034), top: B:206:0x0008 }] */
    @abcd.ey(method = 251906958129355260L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean J0(com.aide.codemodel.api.SyntaxTree r32, int r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.o6.J0(com.aide.codemodel.api.SyntaxTree, int, boolean):boolean");
    }

    @ey(method = -3942417010829058124L)
    private boolean J8(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(-3086549971054836352L, this, syntaxTree, new Integer(i));
            }
            if (this.VH.contains(i)) {
                return true;
            }
            if (this.gn.size() > 0) {
                this.gn.default_Iterator.init();
                while (this.gn.default_Iterator.hasMoreElements()) {
                    int iNextKey = this.gn.default_Iterator.nextKey();
                    if (iNextKey != i && syntaxTree.isEnclosingNode(iNextKey, i)) {
                        return true;
                    }
                    int syntaxTag = syntaxTree.getSyntaxTag(iNextKey);
                    int childNode = syntaxTag != 137 ? syntaxTag != 145 ? syntaxTag != 149 ? syntaxTag != 211 ? -1 : syntaxTree.getChildNode(syntaxTree.getChildNode(iNextKey, 4), 0) : syntaxTree.getChildNode(syntaxTree.getChildNode(iNextKey, 3), 0) : syntaxTree.getChildNode(iNextKey, 4) : syntaxTree.getChildNode(iNextKey, 2);
                    if (childNode == -1 || (syntaxTree.getSyntaxTag(childNode) != 14 && (!syntaxTree.hasAttrValue(childNode) || !syntaxTree.hasAttrType(childNode) || syntaxTree.getAttrType(childNode).getSemantic() != 11 || !this.DW.vJ(syntaxTree.getAttrValue(childNode))))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, -3086549971054836352L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1535811474898909796L)
    private void KD() {
        try {
            if (aM) {
                iy.gn(-677043635111277696L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - (this.we * 2)) + i);
                int i3 = this.tp.get((this.tp.size() - this.we) + i);
                int i4 = i2 & i3;
                int i5 = this.EQ.get((this.EQ.size() - this.we) + i) & this.EQ.get((this.EQ.size() - (this.we * 2)) + i);
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i4);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i5);
            }
            for (int i6 = 0; i6 < this.we; i6++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -677043635111277696L, this);
            }
            throw th;
        }
    }

    @ey(method = 2782903748556439728L)
    private void Mr() {
        try {
            if (aM) {
                iy.gn(3242217874148346800L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.u7.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 3242217874148346800L, this);
            }
            throw th;
        }
    }

    @ey(method = 4742427924940615872L)
    private void Mz() {
        try {
            if (aM) {
                iy.gn(-968527905770842276L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - this.we) + i);
                int i3 = this.EQ.get((this.EQ.size() - this.we) + i);
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i2);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i3);
            }
            for (int i4 = 0; i4 < this.we; i4++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -968527905770842276L, this);
            }
            throw th;
        }
    }

    @ey(method = -2918345165271138600L)
    private void P8(MapOfIntInt mapOfIntInt) {
        try {
            if (aM) {
                iy.tp(-2028275435803741264L, this, mapOfIntInt);
            }
            this.Hw.push(mapOfIntInt);
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, -2028275435803741264L, this, mapOfIntInt);
            }
            throw th;
        }
    }

    @ey(method = -214505553345936055L)
    private void QX(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(-4142579138963988899L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.sh(i) != 1 && syntaxTree.sh(i) != 32 && syntaxTree.sh(i) != 2) {
                this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), "Field </C>" + syntaxTree.getIdentifierString(i) + "<//C> might not have been initialized", 12);
                return;
            }
            this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), "Variable </C>" + syntaxTree.getIdentifierString(i) + "<//C> might not have been initialized", 12);
            if (syntaxTree.hasAttrType(i)) {
                Type attrType = syntaxTree.getAttrType(i);
                int attrReferenceNode = syntaxTree.getAttrReferenceNode(i);
                this.j6.Ws(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getEndLine(attrReferenceNode), syntaxTree.getEndColumn(attrReferenceNode), syntaxTree.getEndLine(attrReferenceNode), syntaxTree.getEndColumn(attrReferenceNode), attrType.getSemantic() == 11 ? " = false" : this.FH.Jl(attrType) ? " = 0" : " = null", "Initialize variable");
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, -4142579138963988899L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5970743223891337500L)
    private void SI() {
        try {
            if (aM) {
                iy.gn(4966982198132051072L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.EQ.get((this.EQ.size() - this.we) + i);
                this.tp.gn((this.EQ.size() - this.we) + i, i2);
                this.EQ.gn((this.EQ.size() - this.we) + i, i2);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 4966982198132051072L, this);
            }
            throw th;
        }
    }

    @ey(method = 1980945748473763271L)
    private void Sf() {
        try {
            if (aM) {
                iy.gn(-2320112290496921837L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - this.we) + i);
                int i3 = i2 & this.EQ.get((this.EQ.size() - this.we) + i) & this.EQ.get((this.EQ.size() - (this.we * 2)) + i);
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i3);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i3);
            }
            for (int i4 = 0; i4 < this.we; i4++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -2320112290496921837L, this);
            }
            throw th;
        }
    }

    @ey(method = 3298401737053620224L)
    private void U2() {
        try {
            if (aM) {
                iy.gn(-2247460175161775700L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.tp.push(this.tp.get(this.tp.size() - this.we));
                this.EQ.push(this.EQ.get(this.EQ.size() - this.we));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -2247460175161775700L, this);
            }
            throw th;
        }
    }

    @ey(method = -439163142522118880L)
    private void VH(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(-612822512837306904L, this, syntaxTree, new Integer(i));
            }
            this.J8.Zo(i, this.QX.size());
            this.Ws.Zo(i, this.XL.size());
            for (int i2 = 0; i2 < this.we; i2++) {
                this.QX.push(-1);
            }
            for (int i3 = 0; i3 < this.we; i3++) {
                this.XL.push(-1);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, -612822512837306904L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5254978793897246400L)
    private void Ws(SyntaxTree syntaxTree, int i, boolean z) {
        try {
            if (aM) {
                iy.we(4434530161671651492L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i2)) == 126) {
                    int childCount2 = syntaxTree.getChildCount(syntaxTree.getChildNode(i, i2));
                    for (int i3 = 3; i3 < childCount2; i3 += 2) {
                        int childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(i, i2), i3);
                        try {
                            if (this.DW.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(childNode)).gG() == z) {
                                int childNode2 = syntaxTree.getChildNode(childNode, 0);
                                if (syntaxTree.qP(childNode2) && !aM(syntaxTree.getAttribute(childNode2))) {
                                    this.j6.Hw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(childNode2), syntaxTree.getStartColumn(childNode2), syntaxTree.getEndLine(childNode2), syntaxTree.getEndColumn(childNode2), "This field may not be initialized", 12);
                                }
                            }
                        } catch (e4 unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (j3) {
                iy.U2(th, 4434530161671651492L, this, syntaxTree, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1653982278605545104L)
    private MapOfIntInt XL() {
        try {
            if (aM) {
                iy.gn(4214674050526289876L, this);
            }
            if (this.Hw.empty()) {
                return new MapOfIntInt();
            }
            MapOfIntInt mapOfIntIntPop = this.Hw.pop();
            mapOfIntIntPop.clear();
            return mapOfIntIntPop;
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 4214674050526289876L, this);
            }
            throw th;
        }
    }

    @ey(method = 493264373440465560L)
    private void Zo(SyntaxTree syntaxTree, int i, int i2, MapOfIntInt mapOfIntInt, Member member, int i3) throws Throwable {
        char c;
        char c2;
        int i4;
        try {
            if (aM) {
                iy.QX(1419610820476051896L, this, new Object[]{syntaxTree, new Integer(i), new Integer(i2), mapOfIntInt, member, new Integer(i3)});
            }
            try {
                Type typeXX = member.XX(i3);
                if (typeXX.isClassType()) {
                    v5(syntaxTree, mapOfIntInt, typeXX, i);
                    return;
                }
                if (typeXX.isParameterType()) {
                    if (syntaxTree.hasAttrInvocationType(i)) {
                        v5(syntaxTree, mapOfIntInt, member.kQ(i3, syntaxTree.getAttrInvocationType(i)), i);
                        return;
                    }
                    return;
                }
                if (typeXX.isMethodParameterType() && syntaxTree.hasAttrInvocationType(i)) {
                    Type attrInvocationType = syntaxTree.getAttrInvocationType(i);
                    int childCount = syntaxTree.getChildCount(i2);
                    if (childCount > 2) {
                        int i5 = 1;
                        int i6 = 0;
                        while (i5 < childCount) {
                            if (!syntaxTree.hasAttrType(syntaxTree.getChildNode(i2, i5))) {
                                return;
                            }
                            this.v5[i6] = syntaxTree.getAttrType(syntaxTree.getChildNode(i2, i5));
                            i5 += 2;
                            i6++;
                        }
                        i4 = i6;
                    } else {
                        i4 = 0;
                    }
                    c = 0;
                    c2 = 2;
                    try {
                        v5(syntaxTree, mapOfIntInt, member.yO(syntaxTree.getFile(), syntaxTree.getLanguage(), i3, attrInvocationType, this.v5, 0, i4, new Type[0], 0, 0), i);
                    } catch (Throwable th) {
                        th = th;
                        if (j3) {
                            Object[] objArr = new Object[6];
                            objArr[c] = syntaxTree;
                            objArr[1] = new Integer(i);
                            objArr[c2] = new Integer(i2);
                            objArr[3] = mapOfIntInt;
                            objArr[4] = member;
                            objArr[5] = new Integer(i3);
                            iy.rN(th, 1419610820476051896L, this, objArr);
                        }
                        throw th;
                    }
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            c = 0;
            c2 = 2;
        }
    }

    @ey(method = 1096804752857888137L)
    private void a8() {
        try {
            if (aM) {
                iy.gn(3752675648478821449L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.tp.push(-1);
                this.EQ.push(-1);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 3752675648478821449L, this);
            }
            throw th;
        }
    }

    @ey(method = -125167050571009620L)
    private boolean aM(int i) {
        try {
            if (aM) {
                iy.u7(-2663311704124757840L, this, i);
            }
            return (this.u7.get((this.u7.size() - this.we) + (i / 31)) & (1 << (i % 31))) != 0;
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, -2663311704124757840L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4799364171306969540L)
    private boolean ca(SyntaxTree syntaxTree, MapOfIntInt mapOfIntInt, Type type) {
        try {
            if (aM) {
                iy.we(3754142419477361536L, this, syntaxTree, mapOfIntInt, type);
            }
            if (mapOfIntInt.v5(type.getId())) {
                return true;
            }
            mapOfIntInt.j6.DW();
            while (mapOfIntInt.j6.j6()) {
                if (type.isImplicitConvertibleTo(syntaxTree.getFile(), syntaxTree.getLanguage(), (Type) this.DW.getEntity(mapOfIntInt.j6.Hw())) || ((Type) this.DW.getEntity(mapOfIntInt.j6.Hw())).isImplicitConvertibleTo(syntaxTree.getFile(), syntaxTree.getLanguage(), type)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (j3) {
                iy.U2(th, 3754142419477361536L, this, syntaxTree, mapOfIntInt, type);
            }
            throw th;
        }
    }

    @ey(method = -2240428477815038863L)
    private void cb() {
        try {
            if (aM) {
                iy.gn(1393407716109239509L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - this.we) + i);
                int i3 = this.EQ.get((this.EQ.size() - (this.we * 2)) + i) & this.EQ.get((this.EQ.size() - this.we) + i);
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i2);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i3);
            }
            for (int i4 = 0; i4 < this.we; i4++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 1393407716109239509L, this);
            }
            throw th;
        }
    }

    @ey(method = -1414240783914463904L)
    private void cn() {
        try {
            if (aM) {
                iy.gn(1542660407575268832L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - (this.we * 2)) + i);
                int i3 = this.tp.get((this.tp.size() - this.we) + i);
                int i4 = i2 & this.EQ.get((this.EQ.size() - (this.we * 2)) + i) & i3 & this.EQ.get((this.EQ.size() - this.we) + i);
                this.tp.gn((this.tp.size() - this.we) + i, i4);
                this.EQ.gn((this.EQ.size() - this.we) + i, i4);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 1542660407575268832L, this);
            }
            throw th;
        }
    }

    @ey(method = 327300400331773105L)
    private void dx() {
        try {
            if (aM) {
                iy.gn(-4840180205570077311L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - (this.we * 2)) + i);
                int i3 = this.tp.get((this.tp.size() - this.we) + i);
                int i4 = this.EQ.get((this.EQ.size() - this.we) + i);
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i2 & i3);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i4);
            }
            for (int i5 = 0; i5 < this.we; i5++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -4840180205570077311L, this);
            }
            throw th;
        }
    }

    @ey(method = -2544216921846534285L)
    private void ef() {
        try {
            if (aM) {
                iy.gn(1133280183427191315L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - (this.we * 2)) + i);
                int i3 = this.tp.get((this.tp.size() - this.we) + i);
                int i4 = (i2 & this.EQ.get((this.EQ.size() - (this.we * 2)) + i)) | (i3 & this.EQ.get((this.EQ.size() - this.we) + i));
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i4);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i4);
            }
            for (int i5 = 0; i5 < this.we; i5++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 1133280183427191315L, this);
            }
            throw th;
        }
    }

    @ey(method = 116265926861685120L)
    private void ei(SyntaxTree syntaxTree, MapOfIntInt mapOfIntInt, Type type) {
        try {
            if (aM) {
                iy.we(-596476287953095068L, this, syntaxTree, mapOfIntInt, type);
            }
            MapOfIntInt mapOfIntIntXL = XL();
            mapOfIntInt.j6.DW();
            while (mapOfIntInt.j6.j6()) {
                if (!((Type) this.DW.getEntity(mapOfIntInt.j6.Hw())).isImplicitConvertibleTo(syntaxTree.getFile(), syntaxTree.getLanguage(), type)) {
                    mapOfIntIntXL.gn(mapOfIntInt.j6.Hw(), mapOfIntInt.j6.v5());
                }
            }
            mapOfIntInt.clear();
            mapOfIntInt.u7(mapOfIntIntXL);
            P8(mapOfIntIntXL);
        } catch (Throwable th) {
            if (j3) {
                iy.U2(th, -596476287953095068L, this, syntaxTree, mapOfIntInt, type);
            }
            throw th;
        }
    }

    @ey(method = 4853851441781113593L)
    private void er() {
        try {
            if (aM) {
                iy.gn(-3906001912587746675L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.u7.push(this.tp.get((this.tp.size() - this.we) + i) & this.EQ.get((this.EQ.size() - this.we) + i));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -3906001912587746675L, this);
            }
            throw th;
        }
    }

    @ey(method = -4932142855252053343L)
    private void g3() {
        try {
            if (aM) {
                iy.gn(1463148845762260613L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - this.we) + i);
                this.tp.gn((this.EQ.size() - this.we) + i, this.EQ.get((this.EQ.size() - this.we) + i));
                this.EQ.gn((this.tp.size() - this.we) + i, i2);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 1463148845762260613L, this);
            }
            throw th;
        }
    }

    @ey(method = -3799905575828337976L)
    private void gW() {
        try {
            if (aM) {
                iy.gn(-840617949707530184L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.u7.push(this.tp.get((this.tp.size() - this.we) + i));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -840617949707530184L, this);
            }
            throw th;
        }
    }

    @ey(method = -232932055010985265L)
    private void j3() {
        try {
            if (aM) {
                iy.gn(2080653267750020283L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 2080653267750020283L, this);
            }
            throw th;
        }
    }

    @ey(method = 174603044867706280L)
    private void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(-259047755414385336L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.declareAttrTarget(i)) {
                int i2 = this.J8.get(syntaxTree.getAttrTarget(i));
                for (int i3 = 0; i3 < this.we; i3++) {
                    int i4 = i2 + i3;
                    this.QX.gn(i4, this.QX.get(i4) & this.u7.get((this.u7.size() - this.we) + i3));
                }
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, -259047755414385336L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6517425315548265763L)
    private void lg() {
        try {
            if (aM) {
                iy.gn(-2433127471963125021L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.tp.push(this.u7.get((this.u7.size() - this.we) + i));
                this.EQ.push(this.u7.get((this.u7.size() - this.we) + i));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -2433127471963125021L, this);
            }
            throw th;
        }
    }

    @ey(method = 3969174057768834525L)
    private void nw(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(4110034780595017413L, this, syntaxTree, new Integer(i));
            }
            this.J8.remove(i);
            this.Ws.remove(i);
            for (int i2 = 0; i2 < this.we; i2++) {
                this.XL.pop();
            }
            for (int i3 = 0; i3 < this.we; i3++) {
                this.QX.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, 4110034780595017413L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1814834780868475392L)
    private void rN(boolean z) {
        try {
            if (aM) {
                iy.Ws(-3469590687437411532L, this, z);
            }
            int i = 0;
            if (z) {
                while (i < this.we) {
                    this.tp.push(this.u7.get((this.u7.size() - this.we) + i));
                    this.EQ.push(-1);
                    i++;
                }
                return;
            }
            while (i < this.we) {
                this.tp.push(-1);
                this.EQ.push(this.u7.get((this.u7.size() - this.we) + i));
                i++;
            }
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, -3469590687437411532L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -88098861582390227L)
    private void ro(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(-2506587062058478103L, this, syntaxTree, new Integer(i));
            }
            for (int i2 = 0; i2 < this.we; i2++) {
                this.tp.gn((this.tp.size() - this.we) + i2, this.tp.get((this.tp.size() - this.we) + i2) & this.QX.get((this.QX.size() - this.we) + i2));
                this.EQ.gn((this.EQ.size() - this.we) + i2, this.EQ.get((this.EQ.size() - this.we) + i2) & this.QX.get((this.QX.size() - this.we) + i2));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, -2506587062058478103L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 30655015981490915L)
    private void sG(SyntaxTree syntaxTree, int i) {
        try {
            if (aM) {
                iy.EQ(7251384258624154695L, this, syntaxTree, new Integer(i));
            }
            for (int i2 = 0; i2 < this.we; i2++) {
                this.tp.gn((this.tp.size() - this.we) + i2, this.tp.get((this.tp.size() - this.we) + i2) & this.XL.get((this.XL.size() - this.we) + i2));
                this.EQ.gn((this.EQ.size() - this.we) + i2, this.EQ.get((this.EQ.size() - this.we) + i2) & this.XL.get((this.XL.size() - this.we) + i2));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.Mr(th, 7251384258624154695L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -766277725332780057L)
    private void sh() {
        try {
            if (aM) {
                iy.gn(801335165456691615L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - (this.we * 2)) + i);
                int i3 = this.tp.get((this.tp.size() - this.we) + i);
                int i4 = i2 & this.EQ.get((this.EQ.size() - (this.we * 2)) + i) & i3 & this.EQ.get((this.EQ.size() - this.we) + i);
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i4);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i4);
            }
            for (int i5 = 0; i5 < this.we; i5++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 801335165456691615L, this);
            }
            throw th;
        }
    }

    @ey(method = -105938034753792021L)
    private void u7(SyntaxTree syntaxTree, int i) {
        int attribute;
        int attribute2;
        try {
            if (aM) {
                iy.EQ(-6998471219290213421L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag != 66) {
                if (syntaxTag == 68) {
                    rN(true);
                    Mr();
                    return;
                }
                int i2 = 0;
                if (syntaxTag == 74) {
                    rN(false);
                    Mr();
                    return;
                }
                if (syntaxTag == 159) {
                    u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                    return;
                }
                int i3 = 3;
                if (syntaxTag == 209) {
                    BT();
                    u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                    if (syntaxTree.getChildCount(i) > 3) {
                        yS();
                        j3();
                        u7(syntaxTree, syntaxTree.getChildNode(i, 3));
                    }
                    j3();
                    lg();
                    Mr();
                    return;
                }
                if (syntaxTag != 222) {
                    if (syntaxTag == 231) {
                        return;
                    }
                    if (syntaxTag == 196) {
                        int childCount = syntaxTree.getChildCount(i);
                        for (int i4 = 1; i4 < childCount - 1; i4 += 2) {
                            u7(syntaxTree, syntaxTree.getChildNode(i, i4));
                            er();
                            j3();
                        }
                        lg();
                        Mr();
                        return;
                    }
                    if (syntaxTag == 197) {
                        int childCount2 = syntaxTree.getChildCount(i);
                        for (int i5 = 1; i5 < childCount2 - 1; i5 += 2) {
                            u7(syntaxTree, syntaxTree.getChildNode(i, i5));
                            er();
                            j3();
                        }
                        lg();
                        Mr();
                        return;
                    }
                    if (syntaxTag == 211) {
                        int i6 = this.J0;
                        BT();
                        VH(syntaxTree, i);
                        u7(syntaxTree, syntaxTree.getChildNode(i, 8));
                        int attribute3 = syntaxTree.getAttribute(syntaxTree.getChildNode(i, 5));
                        I(attribute3);
                        if (attribute3 > this.J0) {
                            this.J0 = attribute3;
                        }
                        er();
                        u7(syntaxTree, syntaxTree.getChildNode(i, 10));
                        j3();
                        ro(syntaxTree, i);
                        nw(syntaxTree, i);
                        Mr();
                        this.J0 = i6;
                        x9();
                        return;
                    }
                    int i7 = 2;
                    if (syntaxTag == 212) {
                        int childCount3 = syntaxTree.getChildCount(i);
                        while (i7 < childCount3 - 2) {
                            u7(syntaxTree, syntaxTree.getChildNode(i, i7));
                            er();
                            j3();
                            i7++;
                        }
                        u7(syntaxTree, syntaxTree.getChildNode(i, childCount3 - 1));
                        return;
                    }
                    switch (syntaxTag) {
                        default:
                            int i8 = 126;
                            switch (syntaxTag) {
                                case 122:
                                    int i9 = this.J0;
                                    int childCount4 = syntaxTree.getChildCount(i);
                                    for (int i10 = 0; i10 < childCount4; i10++) {
                                        int childNode = syntaxTree.getChildNode(i, i10);
                                        if (syntaxTree.getSyntaxTag(childNode) == 126) {
                                            int childCount5 = syntaxTree.getChildCount(childNode);
                                            for (int i11 = 3; i11 < childCount5; i11 += 2) {
                                                int childNode2 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode, i11), 0);
                                                if (syntaxTree.qP(childNode2) && (attribute = syntaxTree.getAttribute(childNode2)) > this.J0) {
                                                    this.J0 = attribute;
                                                }
                                            }
                                        }
                                    }
                                    for (int i12 = 0; i12 < childCount4; i12++) {
                                        int syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i12));
                                        if (syntaxTag2 == 126 || syntaxTag2 == 127) {
                                            u7(syntaxTree, syntaxTree.getChildNode(i, i12));
                                        }
                                    }
                                    while (i2 < childCount4) {
                                        int syntaxTag3 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i2));
                                        if (syntaxTag3 != 126 && syntaxTag3 != 127) {
                                            u7(syntaxTree, syntaxTree.getChildNode(i, i2));
                                        }
                                        i2++;
                                    }
                                    Ws(syntaxTree, i, true);
                                    this.J0 = i9;
                                    lg();
                                    x9();
                                    Mr();
                                    er();
                                    j3();
                                    return;
                                case 123:
                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 5)) == 133) {
                                        int i13 = this.J0;
                                        lg();
                                        int childNode3 = syntaxTree.getChildNode(i, 3);
                                        int childCount6 = syntaxTree.getChildCount(childNode3);
                                        for (int i14 = 1; i14 < childCount6 - 1; i14 += 2) {
                                            int childNode4 = syntaxTree.getChildNode(childNode3, i14);
                                            if (syntaxTree.getSyntaxTag(childNode4) != 16) {
                                                int attribute4 = syntaxTree.getAttribute(syntaxTree.getChildNode(childNode4, 3));
                                                if (attribute4 > this.J0) {
                                                    this.J0 = attribute4;
                                                }
                                                I(attribute4);
                                            }
                                        }
                                        er();
                                        j3();
                                        u7(syntaxTree, syntaxTree.getChildNode(i, 5));
                                        j3();
                                        this.J0 = i13;
                                        return;
                                    }
                                    return;
                                case 124:
                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 8)) == 133) {
                                        int i15 = this.J0;
                                        lg();
                                        int childNode5 = syntaxTree.getChildNode(i, 5);
                                        int childCount7 = syntaxTree.getChildCount(childNode5);
                                        for (int i16 = 1; i16 < childCount7 - 1; i16 += 2) {
                                            int childNode6 = syntaxTree.getChildNode(childNode5, i16);
                                            if (syntaxTree.getSyntaxTag(childNode6) != 16) {
                                                int attribute5 = syntaxTree.getAttribute(syntaxTree.getChildNode(childNode6, 3));
                                                if (attribute5 > this.J0) {
                                                    this.J0 = attribute5;
                                                }
                                                I(attribute5);
                                            }
                                        }
                                        er();
                                        j3();
                                        u7(syntaxTree, syntaxTree.getChildNode(i, 8));
                                        j3();
                                        this.J0 = i15;
                                        return;
                                    }
                                    return;
                                default:
                                    switch (syntaxTag) {
                                        case 126:
                                            int childCount8 = syntaxTree.getChildCount(i);
                                            for (int i17 = 3; i17 < childCount8; i17 += 2) {
                                                int childNode7 = syntaxTree.getChildNode(i, i17);
                                                int childNode8 = syntaxTree.getChildNode(childNode7, 0);
                                                if (syntaxTree.getChildCount(childNode7) > 2) {
                                                    u7(syntaxTree, syntaxTree.getChildNode(childNode7, 3));
                                                    er();
                                                    j3();
                                                }
                                                if (syntaxTree.qP(childNode8) && (attribute2 = syntaxTree.getAttribute(childNode8)) > this.J0) {
                                                    this.J0 = attribute2;
                                                }
                                            }
                                            return;
                                        case 127:
                                            u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                                            er();
                                            j3();
                                            return;
                                        case 128:
                                        case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                            break;
                                        default:
                                            switch (syntaxTag) {
                                                case 133:
                                                    int childCount9 = syntaxTree.getChildCount(i);
                                                    int i18 = this.J0;
                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 123 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)) == 146 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 0)) == 163) {
                                                        lg();
                                                        int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(i));
                                                        int childCount10 = syntaxTree.getChildCount(parentNode);
                                                        int i19 = 0;
                                                        while (i19 < childCount10) {
                                                            int childNode9 = syntaxTree.getChildNode(parentNode, i19);
                                                            int childCount11 = syntaxTree.getChildCount(childNode9);
                                                            if (syntaxTree.getSyntaxTag(childNode9) == i8) {
                                                                for (int i20 = 3; i20 < childCount11; i20 += 2) {
                                                                    int childNode10 = syntaxTree.getChildNode(syntaxTree.getChildNode(childNode9, i20), 0);
                                                                    if (syntaxTree.qP(childNode10)) {
                                                                        I(syntaxTree.getAttribute(childNode10));
                                                                    }
                                                                }
                                                            }
                                                            i19++;
                                                            i8 = 126;
                                                        }
                                                        Mr();
                                                        er();
                                                        j3();
                                                    }
                                                    for (int i21 = 1; i21 < childCount9 - 1; i21++) {
                                                        u7(syntaxTree, syntaxTree.getChildNode(i, i21));
                                                        er();
                                                        j3();
                                                    }
                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 123) {
                                                        Ws(syntaxTree, syntaxTree.getParentNode(syntaxTree.getParentNode(i)), false);
                                                    }
                                                    lg();
                                                    Mr();
                                                    this.J0 = i18;
                                                    x9();
                                                    return;
                                                case 134:
                                                    lg();
                                                    Mr();
                                                    return;
                                                case 135:
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                    gW();
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 4));
                                                    Sf();
                                                    return;
                                                case 136:
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                    yS();
                                                    gW();
                                                    j3();
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 4));
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 6));
                                                    vJ();
                                                    return;
                                                case 137:
                                                    VH(syntaxTree, i);
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                    gW();
                                                    SI();
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 4));
                                                    j3();
                                                    ro(syntaxTree, i);
                                                    nw(syntaxTree, i);
                                                    return;
                                                case 138:
                                                    j6(syntaxTree, i);
                                                    a8();
                                                    Mr();
                                                    return;
                                                case 139:
                                                    FH(syntaxTree, i);
                                                    a8();
                                                    Mr();
                                                    return;
                                                case 140:
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                    er();
                                                    j3();
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 4));
                                                    return;
                                                case 141:
                                                case 142:
                                                    if (syntaxTree.getChildCount(i) > 2) {
                                                        BT();
                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                                                        j3();
                                                    }
                                                    a8();
                                                    Mr();
                                                    return;
                                                case 143:
                                                case 144:
                                                    break;
                                                case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                                                    VH(syntaxTree, i);
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                                                    sG(syntaxTree, i);
                                                    er();
                                                    j3();
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 4));
                                                    SI();
                                                    ro(syntaxTree, i);
                                                    nw(syntaxTree, i);
                                                    return;
                                                case 146:
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                    return;
                                                case 147:
                                                    VH(syntaxTree, i);
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                    U2();
                                                    int childNode11 = syntaxTree.getChildNode(i, 4);
                                                    int childCount12 = syntaxTree.getChildCount(childNode11);
                                                    for (int i22 = 1; i22 < childCount12 - 1; i22++) {
                                                        int syntaxTag4 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode11, i22));
                                                        if (syntaxTag4 == 143) {
                                                            cn();
                                                        } else if (syntaxTag4 != 144) {
                                                            er();
                                                            j3();
                                                            u7(syntaxTree, syntaxTree.getChildNode(childNode11, i22));
                                                        } else {
                                                            cn();
                                                            i2 = 1;
                                                        }
                                                    }
                                                    if (i2 != 0) {
                                                        Mz();
                                                    } else {
                                                        j3();
                                                    }
                                                    ro(syntaxTree, i);
                                                    nw(syntaxTree, i);
                                                    return;
                                                case 148:
                                                    VH(syntaxTree, i);
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                    ro(syntaxTree, i);
                                                    nw(syntaxTree, i);
                                                    return;
                                                case 149:
                                                    int i23 = this.J0;
                                                    VH(syntaxTree, i);
                                                    BT();
                                                    int childNode12 = syntaxTree.getChildNode(i, 2);
                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode12, 0)) != 14) {
                                                        int childCount13 = syntaxTree.getChildCount(childNode12);
                                                        for (int i24 = 0; i24 < childCount13; i24 += 2) {
                                                            u7(syntaxTree, syntaxTree.getChildNode(childNode12, i24));
                                                            er();
                                                            j3();
                                                        }
                                                    }
                                                    int childNode13 = syntaxTree.getChildNode(i, 3);
                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode13, 0)) != 14) {
                                                        u7(syntaxTree, syntaxTree.getChildNode(childNode13, 0));
                                                        gW();
                                                        SI();
                                                    } else {
                                                        a8();
                                                    }
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 6));
                                                    int childNode14 = syntaxTree.getChildNode(i, 4);
                                                    if (syntaxTree.getChildCount(childNode14) > 0) {
                                                        sG(syntaxTree, i);
                                                        er();
                                                        j3();
                                                        int childCount14 = syntaxTree.getChildCount(childNode14);
                                                        while (i2 < childCount14) {
                                                            u7(syntaxTree, syntaxTree.getChildNode(childNode14, i2));
                                                            er();
                                                            j3();
                                                            i2 += 2;
                                                        }
                                                        Mr();
                                                    } else {
                                                        j3();
                                                    }
                                                    Mr();
                                                    ro(syntaxTree, i);
                                                    nw(syntaxTree, i);
                                                    this.J0 = i23;
                                                    x9();
                                                    return;
                                                case 150:
                                                    int i25 = this.J0;
                                                    BT();
                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                                                    int childCount15 = syntaxTree.getChildCount(i);
                                                    while (i7 < childCount15) {
                                                        int childNode15 = syntaxTree.getChildNode(i, i7);
                                                        if (syntaxTree.getSyntaxTag(childNode15) == 204) {
                                                            lg();
                                                            int attribute6 = syntaxTree.getAttribute(syntaxTree.getChildNode(childNode15, 4));
                                                            I(attribute6);
                                                            if (attribute6 > this.J0) {
                                                                this.J0 = attribute6;
                                                            }
                                                            er();
                                                            j3();
                                                            u7(syntaxTree, syntaxTree.getChildNode(childNode15, syntaxTree.getChildCount(childNode15) - 1));
                                                            sh();
                                                        } else {
                                                            BT();
                                                            u7(syntaxTree, syntaxTree.getChildNode(childNode15, syntaxTree.getChildCount(childNode15) - 1));
                                                            ef();
                                                        }
                                                        i7++;
                                                    }
                                                    Mr();
                                                    this.J0 = i25;
                                                    x9();
                                                    return;
                                                case 151:
                                                    int childCount16 = syntaxTree.getChildCount(i);
                                                    for (int i26 = 3; i26 < childCount16; i26 += 2) {
                                                        int childNode16 = syntaxTree.getChildNode(i, i26);
                                                        int attribute7 = syntaxTree.getAttribute(syntaxTree.getChildNode(childNode16, 0));
                                                        if (syntaxTree.getChildCount(childNode16) > 2) {
                                                            u7(syntaxTree, syntaxTree.getChildNode(childNode16, 3));
                                                            I(attribute7);
                                                            er();
                                                            j3();
                                                        }
                                                        if (attribute7 > this.J0) {
                                                            this.J0 = attribute7;
                                                        }
                                                    }
                                                    lg();
                                                    Mr();
                                                    return;
                                                default:
                                                    switch (syntaxTag) {
                                                        case 155:
                                                            u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                            er();
                                                            j3();
                                                            u7(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                                                            return;
                                                        case 156:
                                                            int childNode17 = syntaxTree.getChildNode(i, 0);
                                                            if (syntaxTree.qP(childNode17) && !aM(syntaxTree.getAttribute(childNode17))) {
                                                                QX(syntaxTree, childNode17);
                                                            }
                                                            u7(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                                                            return;
                                                        case 157:
                                                            u7(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                                                            return;
                                                        default:
                                                            switch (syntaxTag) {
                                                                case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                                                                    if (syntaxTree.hasAttrValue(i) && syntaxTree.hasAttrType(i) && syntaxTree.getAttrType(i).getSemantic() == 11) {
                                                                        rN(this.DW.vJ(syntaxTree.getAttrValue(i)));
                                                                        Mr();
                                                                        return;
                                                                    }
                                                                    int childNode18 = syntaxTree.getChildNode(i, 0);
                                                                    if (syntaxTree.qP(childNode18) && ((syntaxTree.getChildCount(i) != 1 || !syntaxTree.sT(i)) && !aM(syntaxTree.getAttribute(childNode18)))) {
                                                                        QX(syntaxTree, childNode18);
                                                                    }
                                                                    lg();
                                                                    Mr();
                                                                    return;
                                                                case 162:
                                                                case 163:
                                                                case 164:
                                                                case 166:
                                                                case 167:
                                                                    break;
                                                                case 165:
                                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                    er();
                                                                    j3();
                                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                                    return;
                                                                case 168:
                                                                    if (!syntaxTree.hasAttrValue(i) || !syntaxTree.hasAttrType(i) || syntaxTree.getAttrType(i).getSemantic() != 11) {
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                                                                        return;
                                                                    } else {
                                                                        rN(this.DW.vJ(syntaxTree.getAttrValue(i)));
                                                                        Mr();
                                                                        return;
                                                                    }
                                                                case 169:
                                                                    if (!syntaxTree.hasAttrValue(i) || !syntaxTree.hasAttrType(i) || syntaxTree.getAttrType(i).getSemantic() != 11) {
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 4));
                                                                        return;
                                                                    } else {
                                                                        rN(this.DW.vJ(syntaxTree.getAttrValue(i)));
                                                                        Mr();
                                                                        return;
                                                                    }
                                                                case 170:
                                                                    if (syntaxTree.hasAttrValue(i) && syntaxTree.hasAttrType(i) && syntaxTree.getAttrType(i).getSemantic() == 11) {
                                                                        rN(this.DW.vJ(syntaxTree.getAttrValue(i)));
                                                                        Mr();
                                                                        return;
                                                                    }
                                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0)) == 34) {
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                                                                        g3();
                                                                        return;
                                                                    }
                                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 1));
                                                                    if (syntaxTree.isChangedExpressionNode(syntaxTree.getChildNode(i, 1)) && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)) == 161 && syntaxTree.getChildCount(syntaxTree.getChildNode(i, 1)) == 1) {
                                                                        int childNode19 = syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 0);
                                                                        if (syntaxTree.qP(childNode19)) {
                                                                            I(syntaxTree.getAttribute(childNode19));
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 171:
                                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                    if (syntaxTree.isChangedExpressionNode(syntaxTree.getChildNode(i, 0)) && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0)) == 161 && syntaxTree.getChildCount(syntaxTree.getChildNode(i, 0)) == 1) {
                                                                        int childNode20 = syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 0);
                                                                        if (syntaxTree.qP(childNode20)) {
                                                                            I(syntaxTree.getAttribute(childNode20));
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 172:
                                                                    if (syntaxTree.hasAttrValue(i) && syntaxTree.hasAttrType(i) && syntaxTree.getAttrType(i).getSemantic() == 11) {
                                                                        rN(this.DW.vJ(syntaxTree.getAttrValue(i)));
                                                                        Mr();
                                                                        return;
                                                                    }
                                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)) == 42) {
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                        gW();
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                                        cb();
                                                                        return;
                                                                    }
                                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)) == 39) {
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                        yS();
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                                        dx();
                                                                        return;
                                                                    }
                                                                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 1)) != 210) {
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                        er();
                                                                        j3();
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                                        int childNode21 = syntaxTree.getChildNode(i, 0);
                                                                        if (syntaxTree.isChangedExpressionNode(childNode21)) {
                                                                            if ((syntaxTree.getSyntaxTag(childNode21) == 161 && syntaxTree.getChildCount(childNode21) == 1) || (syntaxTree.getSyntaxTag(childNode21) == 159 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode21, 0)) == 166)) {
                                                                                int childNode22 = syntaxTree.getChildNode(childNode21, syntaxTree.getChildCount(childNode21) - 1);
                                                                                if (syntaxTree.qP(childNode22)) {
                                                                                    I(syntaxTree.getAttribute(childNode22));
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    if (syntaxTree.hasAttrType(i) && syntaxTree.getAttrType(i).getSemantic() == 11) {
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                        yS();
                                                                        gW();
                                                                        j3();
                                                                        u7(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 1));
                                                                        u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                                        KD();
                                                                        return;
                                                                    }
                                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                    yS();
                                                                    gW();
                                                                    j3();
                                                                    u7(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 1));
                                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 2));
                                                                    vJ();
                                                                    return;
                                                                case 173:
                                                                    u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                    return;
                                                                default:
                                                                    switch (syntaxTag) {
                                                                        case 175:
                                                                            int childCount17 = syntaxTree.getChildCount(i);
                                                                            while (i3 < childCount17) {
                                                                                int childNode23 = syntaxTree.getChildNode(i, i3);
                                                                                if (syntaxTree.getSyntaxTag(childNode23) == 11) {
                                                                                    i3 += 2;
                                                                                } else {
                                                                                    if (syntaxTree.getSyntaxTag(childNode23) != 230) {
                                                                                        u7(syntaxTree, childNode23);
                                                                                        er();
                                                                                        j3();
                                                                                    }
                                                                                    i3 += 3;
                                                                                }
                                                                            }
                                                                            if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1)) == 196) {
                                                                                u7(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                                                                                er();
                                                                                j3();
                                                                            }
                                                                            lg();
                                                                            Mr();
                                                                            return;
                                                                        case 176:
                                                                            if (syntaxTree.getChildCount(i) <= 4) {
                                                                                u7(syntaxTree, syntaxTree.getChildNode(i, 3));
                                                                                return;
                                                                            }
                                                                            u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                            er();
                                                                            j3();
                                                                            u7(syntaxTree, syntaxTree.getChildNode(i, 5));
                                                                            return;
                                                                        case ProxyTextView.INPUTTYPE_textFilter /* 177 */:
                                                                            if (syntaxTree.getChildCount(i) <= 5) {
                                                                                u7(syntaxTree, syntaxTree.getChildNode(i, 3));
                                                                                er();
                                                                                u7(syntaxTree, syntaxTree.getChildNode(i, 4));
                                                                                Mr();
                                                                                return;
                                                                            }
                                                                            u7(syntaxTree, syntaxTree.getChildNode(i, 0));
                                                                            er();
                                                                            j3();
                                                                            u7(syntaxTree, syntaxTree.getChildNode(i, 5));
                                                                            er();
                                                                            u7(syntaxTree, syntaxTree.getChildNode(i, 6));
                                                                            Mr();
                                                                            return;
                                                                        case 178:
                                                                            break;
                                                                        default:
                                                                            int childCount18 = syntaxTree.getChildCount(i);
                                                                            while (i2 < childCount18) {
                                                                                u7(syntaxTree, syntaxTree.getChildNode(i, i2));
                                                                                i2++;
                                                                            }
                                                                            return;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        case UserTouchAction.CLICK_KIND /* 7 */:
                            lg();
                            Mr();
                    }
                }
                u7(syntaxTree, syntaxTree.getChildNode(i, 6));
                lg();
                Mr();
                return;
            }
            lg();
            Mr();
        } finally {
        }
    }

    @ey(method = 30737830246434864L)
    private void v5(SyntaxTree syntaxTree, MapOfIntInt mapOfIntInt, Type type, int i) {
        try {
            if (aM) {
                iy.J0(-4353626257859679900L, this, syntaxTree, mapOfIntInt, type, new Integer(i));
            }
            if (this.FH.w9(syntaxTree.getFile(), type)) {
                mapOfIntInt.gn(type.getId(), i);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.a8(th, -4353626257859679900L, this, syntaxTree, mapOfIntInt, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2418806593956713244L)
    private void vJ() {
        try {
            if (aM) {
                iy.gn(-2983599087857253728L, this);
            }
            for (int i = 0; i < this.we; i++) {
                int i2 = this.tp.get((this.tp.size() - (this.we * 2)) + i);
                int i3 = this.tp.get((this.tp.size() - this.we) + i);
                int i4 = i2 & this.EQ.get((this.EQ.size() - (this.we * 2)) + i) & i3 & this.EQ.get((this.EQ.size() - this.we) + i);
                this.tp.gn((this.tp.size() - (this.we * 2)) + i, i4);
                this.EQ.gn((this.EQ.size() - (this.we * 2)) + i, i4);
            }
            for (int i5 = 0; i5 < this.we; i5++) {
                this.tp.pop();
                this.EQ.pop();
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -2983599087857253728L, this);
            }
            throw th;
        }
    }

    @ey(method = 5230560152146525800L)
    private void vy() {
        try {
            if (aM) {
                iy.gn(-3585538218718978096L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.u7.push(0);
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -3585538218718978096L, this);
            }
            throw th;
        }
    }

    @ey(method = 726831897550659180L)
    private void x9() {
        try {
            if (aM) {
                iy.gn(-3437713502432803360L, this);
            }
            if (this.J0 < 0) {
                for (int iMax = Math.max(0, this.tp.size() - this.we); iMax < this.tp.size(); iMax++) {
                    this.tp.gn(iMax, 0);
                    this.EQ.gn(iMax, 0);
                }
                return;
            }
            int size = (this.tp.size() - this.we) + (this.J0 / 31);
            for (int i = size + 1; i < this.tp.size(); i++) {
                this.tp.gn(i, 0);
                this.EQ.gn(i, 0);
            }
            int i2 = (-1) >>> (31 - (this.J0 % 31));
            this.tp.gn(size, this.tp.get(size) & i2);
            this.EQ.gn(size, i2 & this.EQ.get(size));
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, -3437713502432803360L, this);
            }
            throw th;
        }
    }

    @ey(method = 415158426678421161L)
    private void yS() {
        try {
            if (aM) {
                iy.gn(5911841659148495145L, this);
            }
            for (int i = 0; i < this.we; i++) {
                this.u7.push(this.EQ.get((this.EQ.size() - this.we) + i));
            }
        } catch (Throwable th) {
            if (j3) {
                iy.aM(th, 5911841659148495145L, this);
            }
            throw th;
        }
    }

    @ey(method = 3392882029759019656L)
    public void gn(SyntaxTree syntaxTree) {
        try {
            if (aM) {
                iy.tp(2819950732953212496L, this, syntaxTree);
            }
            this.J0 = -1;
            this.we = (syntaxTree.getAttrDAIndexCount() / 31) + 1;
            this.u7.clear();
            this.tp.clear();
            this.EQ.clear();
            this.J8.clear();
            this.Ws.clear();
            this.QX.clear();
            this.XL.clear();
            vy();
            u7(syntaxTree, syntaxTree.getRootNode());
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, 2819950732953212496L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 3046594640782410641L)
    public void tp(SyntaxTree syntaxTree) {
        try {
            if (aM) {
                iy.tp(3061491024927343905L, this, syntaxTree);
            }
            MapOfIntInt mapOfIntIntXL = XL();
            EQ(syntaxTree, syntaxTree.getRootNode(), mapOfIntIntXL);
            P8(mapOfIntIntXL);
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, 3061491024927343905L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -4135206280374017220L)
    public void we(SyntaxTree syntaxTree) {
        try {
            if (aM) {
                iy.tp(6499484554753996448L, this, syntaxTree);
            }
            this.VH.clear();
            this.gn.clear();
            J0(syntaxTree, syntaxTree.getRootNode(), true);
        } catch (Throwable th) {
            if (j3) {
                iy.j3(th, 6499484554753996448L, this, syntaxTree);
            }
            throw th;
        }
    }
}
