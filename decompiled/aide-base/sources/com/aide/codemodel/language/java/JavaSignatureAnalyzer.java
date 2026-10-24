package com.aide.codemodel.language.java;

import abcd.b4;
import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.f3;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.y1;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.MethodParameterType;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.ParameterType;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.SignatureAnalyzer;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.Stack;
import java.util.zip.CRC32;

@cy(clazz = -44742421209227520L, container = -44742421209227520L, user = true)
/* loaded from: classes.dex */
public class JavaSignatureAnalyzer implements SignatureAnalyzer {

    @fy
    private static /* synthetic */ boolean EQ;

    @dy(field = 2234508202096251807L)
    private static CRC32 gn;

    @dy(field = 1437007584002047885L)
    private static int tp;

    @dy(field = 3041280489136891165L)
    private static byte[] u7;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = 4068231616958490660L)
    private final JavaCodeAnalyzer DW;

    @dy(field = 3001199379553005963L)
    private final SyntaxTreeSpace FH;

    @dy(field = -3285169429536322035L)
    private final JavaTypeSystem Hw;

    @dy(field = 2705305200299439309L)
    private Stack<a> VH;

    @dy(field = 1990096013818232576L)
    private final JavaLanguage Zo;

    @dy(field = 2684948959920432621L)
    private final Model j6;

    @dy(field = 2949109271225880672L)
    private final EntitySpace v5;

    @cy(clazz = 1328135661568060568L, container = 1328135661568060568L, user = true)
    private static class a {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -510722662181201207L)
        private SyntaxTree DW;

        @dy(field = 249177642975191897L)
        private EntitySpace FH;

        @dy(field = 4122338315635028576L)
        private JavaTypeSystem Hw;

        @dy(field = -1962063656900539720L)
        private C0042a j6;

        @cy(clazz = 3506781404509494111L, container = 3506781404509494111L, user = true)
        /* renamed from: com.aide.codemodel.language.java.JavaSignatureAnalyzer$a$a, reason: collision with other inner class name */
        private class C0042a {

            @gy
            private static /* synthetic */ boolean QX;

            @fy
            private static /* synthetic */ boolean Ws;

            @dy(field = 4944264020244096544L)
            private ClassType DW;

            @dy(field = 5298291938817285617L)
            private ListOf<Type> EQ;

            @dy(field = -3595377576065040920L)
            private int FH;

            @dy(field = 2784760654197079989L)
            private f3<Type> Hw;

            @dy(field = 5058340922028445331L)
            private ListOfInt J0;

            @dy(field = 830180234465495256L)
            @hy
            final /* synthetic */ a J8;

            @dy(field = -6751143962123532495L)
            private ListOf<ClassType> VH;

            @dy(field = 1058726483205037257L)
            private ListOf<Namespace> Zo;

            @dy(field = -1220647896420917649L)
            private MapOfInt<Entity> gn;

            @dy(field = 6445822643321565559L)
            private Namespace j6;

            @dy(field = 3934275059057466833L)
            private ListOf<ClassType> tp;

            @dy(field = 62997566814534891L)
            private ListOf<ClassType> u7;

            @dy(field = -4184405259401402976L)
            private MapOfInt<ClassType> v5;

            @dy(field = 8033626686150082263L)
            private ListOfInt we;

            static {
                iy.Zo(C0042a.class);
            }

            @ey(method = 1361161482026479371L)
            public C0042a(a aVar, EntitySpace entitySpace) {
                try {
                    if (Ws) {
                        iy.EQ(-900155176395174915L, null, aVar, entitySpace);
                    }
                    this.J8 = aVar;
                    this.Hw = new f3<>(entitySpace);
                    this.v5 = new MapOfInt<>(entitySpace);
                    this.Zo = new ListOf<>(entitySpace);
                    this.VH = new ListOf<>(entitySpace);
                    this.gn = new MapOfInt<>(entitySpace);
                    this.u7 = new ListOf<>(entitySpace);
                    this.tp = new ListOf<>(entitySpace);
                    this.EQ = new ListOf<>(entitySpace);
                    this.we = new ListOfInt();
                    this.J0 = new ListOfInt();
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -900155176395174915L, null, aVar, entitySpace);
                    }
                    throw th;
                }
            }

            @ey(method = -6264891856401208296L)
            public void BT() {
                try {
                    if (Ws) {
                        iy.gn(2949324095759111301L, this);
                    }
                    this.we.pop();
                    this.tp.VH();
                    this.EQ.VH();
                    this.FH--;
                    rN();
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, 2949324095759111301L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -1694757031428696000L)
            public void DW(int i, ClassType classType) {
                try {
                    if (Ws) {
                        iy.EQ(6109301091382442657L, this, new Integer(i), classType);
                    }
                    if (this.Hw.DW(i, this.FH)) {
                        return;
                    }
                    this.Hw.FH(i, classType.u9(), this.FH);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 6109301091382442657L, this, new Integer(i), classType);
                    }
                    throw th;
                }
            }

            @ey(method = 3014401153779558633L)
            public void EQ() {
                try {
                    if (Ws) {
                        iy.gn(-3230286943723434344L, this);
                    }
                    v5();
                    this.tp.gn(null);
                    this.EQ.gn(null);
                    ListOfInt listOfInt = this.we;
                    int i = this.FH + 1;
                    this.FH = i;
                    listOfInt.push(i);
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -3230286943723434344L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 221014843611586905L)
            public void FH(int i, Type type) {
                try {
                    if (Ws) {
                        iy.EQ(-365131509035696312L, this, new Integer(i), type);
                    }
                    if (this.Hw.DW(i, this.FH)) {
                        return;
                    }
                    this.Hw.FH(i, type, this.FH);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -365131509035696312L, this, new Integer(i), type);
                    }
                    throw th;
                }
            }

            @ey(method = 6831662613561244228L)
            public void Hw(int i, ClassType classType) {
                try {
                    if (Ws) {
                        iy.EQ(4042811853452863029L, this, new Integer(i), classType);
                    }
                    if (this.v5.v5(i)) {
                        return;
                    }
                    this.v5.we(i, classType);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 4042811853452863029L, this, new Integer(i), classType);
                    }
                    throw th;
                }
            }

            @ey(method = 3667050680382474539L)
            public ClassType J0() {
                try {
                    if (Ws) {
                        iy.gn(763092606013320960L, this);
                    }
                    return this.DW;
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, 763092606013320960L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 1481020098942601008L)
            public Entity J8() {
                try {
                    if (Ws) {
                        iy.gn(-3550943156975618549L, this);
                    }
                    return this.DW != null ? this.DW : this.j6;
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -3550943156975618549L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -111054218808078336L)
            public void Mr(Namespace namespace) {
                try {
                    if (Ws) {
                        iy.tp(1581737304069780573L, this, namespace);
                    }
                    this.Zo.j6(namespace);
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, 1581737304069780573L, this, namespace);
                    }
                    throw th;
                }
            }

            @ey(method = -2829382934016801448L)
            public Entity QX(int i, int i2) {
                ClassType classTypeFN;
                try {
                    if (Ws) {
                        iy.EQ(879706330188382153L, this, new Integer(i), new Integer(i2));
                    }
                    int iZo = this.v5.Zo(i);
                    if (iZo == 1) {
                        return this.v5.gn(i);
                    }
                    if (iZo > 1) {
                        throw new b4();
                    }
                    if (this.gn.v5(i)) {
                        Entity entityGn = this.gn.gn(i);
                        if (entityGn.isClassType()) {
                            return entityGn;
                        }
                    }
                    if (this.j6.Mz(this.J8.DW.getFile(), this.J8.DW.getLanguage(), i, true, i2, this.j6)) {
                        try {
                            return this.j6.sG(this.J8.DW.getFile(), this.J8.DW.getLanguage(), i, true, i2, this.j6);
                        } catch (e4 unused) {
                        }
                    }
                    for (int i3 = 0; i3 < this.VH.EQ(); i3++) {
                        if (((ClassType) this.VH.v5(i3)).Z1(i, true)) {
                            try {
                                return ((ClassType) this.VH.v5(i3)).FN(i, true, i2, J8(), this.J8.DW.getFile(), this.J8.DW.getLanguage());
                            } catch (e4 unused2) {
                                continue;
                            }
                        }
                    }
                    ClassType classTypeSG = null;
                    for (int i4 = 0; i4 < this.Zo.EQ(); i4++) {
                        if (((Namespace) this.Zo.v5(i4)).Mz(this.J8.DW.getFile(), this.J8.DW.getLanguage(), i, true, i2, this.j6)) {
                            try {
                                classTypeSG = ((Namespace) this.Zo.v5(i4)).sG(this.J8.DW.getFile(), this.J8.DW.getLanguage(), i, true, i2, this.j6);
                            } catch (e4 unused3) {
                            }
                        }
                    }
                    if (classTypeSG != null) {
                        return classTypeSG;
                    }
                    try {
                        return this.J8.Hw.nw().ef(this.J8.DW.getFile(), i, true);
                    } catch (e4 unused4) {
                        for (int i5 = 0; i5 < this.u7.EQ(); i5++) {
                            try {
                                classTypeFN = ((ClassType) this.u7.v5(i5)).FN(i, true, i2, this.J8.j6.Ws(), this.J8.DW.getFile(), this.J8.DW.getLanguage());
                            } catch (b4 | e4 unused5) {
                            }
                            if (classTypeFN.pl()) {
                                return classTypeFN;
                            }
                        }
                        throw new e4();
                    }
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 879706330188382153L, this, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @ey(method = 4059485698900785981L)
            public void U2(ClassType classType) {
                try {
                    if (Ws) {
                        iy.tp(-5077022481966971840L, this, classType);
                    }
                    this.u7.j6(classType);
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -5077022481966971840L, this, classType);
                    }
                    throw th;
                }
            }

            @ey(method = -932532218833582713L)
            public void VH(int i) {
                try {
                    if (Ws) {
                        iy.u7(959826786037730400L, this, i);
                    }
                    this.J0.push(i);
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, 959826786037730400L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @ey(method = -2160438028182008013L)
            public Namespace Ws() {
                try {
                    if (Ws) {
                        iy.gn(6724187775350924816L, this);
                    }
                    return this.j6;
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, 6724187775350924816L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -33976326097704655L)
            public Entity XL(int i, int i2) {
                try {
                    if (Ws) {
                        iy.EQ(63893661930100296L, this, new Integer(i), new Integer(i2));
                    }
                    for (int iEQ = this.EQ.EQ() - 1; iEQ >= 0; iEQ--) {
                        if (((Type) this.EQ.v5(iEQ)) == null) {
                            int i3 = this.we.get(iEQ);
                            if (this.Hw.DW(i, i3)) {
                                return this.Hw.v5(i, i3);
                            }
                        } else if (((ClassType) this.tp.v5(iEQ)).Z1(i, true)) {
                            try {
                                return ((Type) this.EQ.v5(iEQ)).ef(i, true, i2, this.J8.j6.J8(), this.J8.DW.getFile(), this.J8.DW.getLanguage());
                            } catch (e4 unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    return QX(i, i2);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 63893661930100296L, this, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @ey(method = -4477772808411398496L)
            public void Zo(ClassType classType) {
                try {
                    if (Ws) {
                        iy.tp(-1021928850899176025L, this, classType);
                    }
                    this.DW = classType;
                    this.tp.gn(classType);
                    this.EQ.gn(classType.u9());
                    this.we.push(-1);
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -1021928850899176025L, this, classType);
                    }
                    throw th;
                }
            }

            @ey(method = -1152043318756898268L)
            public void a8(int i, Entity entity) {
                try {
                    if (Ws) {
                        iy.EQ(403112126032176573L, this, new Integer(i), entity);
                    }
                    if (this.gn.v5(i)) {
                        return;
                    }
                    this.gn.we(i, entity);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 403112126032176573L, this, new Integer(i), entity);
                    }
                    throw th;
                }
            }

            @ey(method = -7621820051948047076L)
            public void aM(int i, ClassType classType) {
                try {
                    if (Ws) {
                        iy.EQ(-5079375304528003941L, this, new Integer(i), classType);
                    }
                    if (this.v5.v5(i)) {
                        return;
                    }
                    this.v5.we(i, classType);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -5079375304528003941L, this, new Integer(i), classType);
                    }
                    throw th;
                }
            }

            @ey(method = -2964272564936540132L)
            public void er() {
                try {
                    if (Ws) {
                        iy.gn(3786259856409106689L, this);
                    }
                    this.we.pop();
                    this.tp.VH();
                    this.EQ.VH();
                    int iEQ = this.tp.EQ() - 1;
                    while (iEQ >= 0 && this.tp.v5(iEQ) == null) {
                        iEQ--;
                    }
                    if (iEQ >= 0) {
                        this.DW = (ClassType) this.tp.v5(iEQ);
                    } else {
                        this.DW = null;
                    }
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, 3786259856409106689L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -1251435377303092389L)
            public void gW() {
                try {
                    if (Ws) {
                        iy.gn(3392097131663972592L, this);
                    }
                    this.we.pop();
                    this.tp.VH();
                    this.EQ.VH();
                    this.FH--;
                    rN();
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, 3392097131663972592L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -3101980274208902969L)
            public void gn() {
                try {
                    if (Ws) {
                        iy.gn(-3706345888850387520L, this);
                    }
                    this.FH = 0;
                    this.DW = null;
                    this.j6 = null;
                    this.v5.Hw();
                    this.Zo.FH();
                    this.VH.FH();
                    this.gn.Hw();
                    this.u7.FH();
                    this.we.clear();
                    this.tp.FH();
                    this.EQ.FH();
                    this.J0.clear();
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -3706345888850387520L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 1453711785005633055L)
            public void j3(ClassType classType) {
                try {
                    if (Ws) {
                        iy.tp(-429602356770991872L, this, classType);
                    }
                    this.VH.j6(classType);
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -429602356770991872L, this, classType);
                    }
                    throw th;
                }
            }

            @ey(method = 815050567535072708L)
            public void j6(int i, ClassType classType) {
                try {
                    if (Ws) {
                        iy.EQ(85736779093552975L, this, new Integer(i), classType);
                    }
                    if (this.Hw.DW(i, this.FH)) {
                        return;
                    }
                    this.Hw.FH(i, classType, this.FH);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, 85736779093552975L, this, new Integer(i), classType);
                    }
                    throw th;
                }
            }

            @ey(method = -4373030203255140873L)
            public boolean lg() {
                try {
                    if (Ws) {
                        iy.gn(-2538489544656572928L, this);
                    }
                    return y1.aM(this.J0.peek());
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -2538489544656572928L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 469656140705803815L)
            public void rN() {
                try {
                    if (Ws) {
                        iy.gn(2640609548056876464L, this);
                    }
                    this.Hw.Zo();
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, 2640609548056876464L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -460137924992805245L)
            public void tp(Namespace namespace) {
                try {
                    if (Ws) {
                        iy.tp(-2981653586614029268L, this, namespace);
                    }
                    this.j6 = namespace;
                } catch (Throwable th) {
                    if (QX) {
                        iy.j3(th, -2981653586614029268L, this, namespace);
                    }
                    throw th;
                }
            }

            @ey(method = 4337744173600770688L)
            public void u7() {
                try {
                    if (Ws) {
                        iy.gn(-226561355752718505L, this);
                    }
                    v5();
                    this.tp.gn(null);
                    this.EQ.gn(null);
                    ListOfInt listOfInt = this.we;
                    int i = this.FH + 1;
                    this.FH = i;
                    listOfInt.push(i);
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -226561355752718505L, this);
                    }
                    throw th;
                }
            }

            @ey(method = 3224501001353008448L)
            public void v5() {
                try {
                    if (Ws) {
                        iy.gn(-2936527268598223545L, this);
                    }
                    this.Hw.Hw();
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -2936527268598223545L, this);
                    }
                    throw th;
                }
            }

            @ey(method = -514703061357251472L)
            public Entity we(int i, int i2) {
                try {
                    if (Ws) {
                        iy.EQ(-943510285265897991L, this, new Integer(i), new Integer(i2));
                    }
                    for (int iEQ = this.tp.EQ() - 1; iEQ >= 0; iEQ--) {
                        if (((ClassType) this.tp.v5(iEQ)) == null) {
                            int i3 = this.we.get(iEQ);
                            if (this.Hw.DW(i, i3)) {
                                return this.Hw.v5(i, i3);
                            }
                        } else if (((ClassType) this.tp.v5(iEQ)).Z1(i, true)) {
                            try {
                                return ((ClassType) this.tp.v5(iEQ)).FN(i, true, i2, J0(), this.J8.DW.getFile(), this.J8.DW.getLanguage());
                            } catch (e4 unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    return QX(i, i2);
                } catch (Throwable th) {
                    if (QX) {
                        iy.Mr(th, -943510285265897991L, this, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @ey(method = -1580550433290344175L)
            public void yS() {
                try {
                    if (Ws) {
                        iy.gn(-2325539640033896000L, this);
                    }
                    this.J0.pop();
                } catch (Throwable th) {
                    if (QX) {
                        iy.aM(th, -2325539640033896000L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -8176670205695877795L)
        public a(JavaSignatureAnalyzer javaSignatureAnalyzer, EntitySpace entitySpace) {
            try {
                if (v5) {
                    iy.EQ(-457845839623811165L, null, javaSignatureAnalyzer, entitySpace);
                }
                this.j6 = new C0042a(this, entitySpace);
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -457845839623811165L, null, javaSignatureAnalyzer, entitySpace);
                }
                throw th;
            }
        }

        @ey(method = -331510780238816400L)
        private void BT(int i) {
            try {
                if (v5) {
                    iy.u7(-237443602261747136L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    try {
                        int childNode = this.DW.getChildNode(i, i2);
                        this.FH.vy(this.FH.w9(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode)), this.DW.getStartLine(childNode), this.DW.getStartColumn(childNode), this.DW.getEndColumn(childNode));
                    } catch (e4 unused) {
                    }
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -237443602261747136L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3106430338060222833L)
        private int EQ(int i) {
            try {
                if (v5) {
                    iy.u7(1573813511687610579L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                int i2 = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    int syntaxTag = this.DW.getSyntaxTag(this.DW.getChildNode(i, i3));
                    i2 |= syntaxTag != 75 ? syntaxTag != 86 ? syntaxTag != 104 ? syntaxTag != 115 ? syntaxTag != 83 ? syntaxTag != 84 ? syntaxTag != 94 ? syntaxTag != 95 ? syntaxTag != 97 ? syntaxTag != 98 ? syntaxTag != 100 ? syntaxTag != 101 ? 0 : 4096 : 8 : 1024 : 8192 : 16384 : 4 : 1 : 524288 : 536870912 : 2048 : 64 : 896;
                }
                return i2;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 1573813511687610579L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1940303976789580752L)
        private void Hw(int i) {
            try {
                if (v5) {
                    iy.u7(4053177779478804068L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    int childNode = this.DW.getChildNode(i, i2);
                    int identifier = this.DW.getIdentifier(this.DW.getChildNode(childNode, 0));
                    try {
                        this.j6.FH(identifier, this.FH.fY(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode)));
                    } catch (e4 unused) {
                    }
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 4053177779478804068L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0030, B:14:0x0041, B:20:0x005f, B:24:0x00ad, B:26:0x00c1, B:30:0x00e8, B:29:0x00de, B:31:0x010a, B:19:0x005a, B:11:0x0033), top: B:40:0x0009 }] */
        @abcd.ey(method = -3246795407365605900L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void I(int r28) {
            /*
                Method dump skipped, instructions count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaSignatureAnalyzer.a.I(int):void");
        }

        @ey(method = -712937064985149567L)
        private int J0(int i) {
            try {
                if (v5) {
                    iy.u7(1998975352385499243L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                int i2 = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (this.DW.getSyntaxTag(this.DW.getChildNode(i, i3)) == 113) {
                        i2 = 5;
                    }
                }
                return i2;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 1998975352385499243L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2569837661060805000L)
        private int J8(int i) {
            try {
                if (v5) {
                    iy.u7(-1167353194737132720L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    int childNode = this.DW.getChildNode(i, i2);
                    int syntaxTag = this.DW.getSyntaxTag(childNode);
                    if (syntaxTag == 84 || syntaxTag == 94 || syntaxTag == 100) {
                        return childNode;
                    }
                }
                return -1;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -1167353194737132720L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -197176666088494404L)
        private void KD(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-860377289067633168L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!this.FH.canDeclareOtherSuperClasstypes() && !classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 129) {
                            this.j6.j6(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    this.FH.nw(classtype);
                    int childNode = this.DW.getChildNode(i, 4);
                    int childCount = this.DW.getChildCount(childNode);
                    if (childCount != 0) {
                        for (int i2 = 1; i2 < childCount; i2 += 2) {
                            try {
                                this.FH.declareSuperClasstype(classtype, tp(this.DW.getChildNode(childNode, i2)));
                            } catch (e4 unused) {
                                this.FH.J0(classtype);
                            }
                        }
                    }
                    try {
                        if (classtype != this.Hw.Eq(this.DW.getFile())) {
                            this.FH.declareSuperClasstype(classtype, this.Hw.Eq(this.DW.getFile()));
                        }
                    } catch (e4 unused2) {
                    }
                    this.FH.SI(classtype);
                    if (this.DW.getSyntaxTag(i) == 129) {
                        this.j6.j6(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.Zo(classtype);
                    vy(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                } catch (e4 unused3) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -860377289067633168L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -188545822526362160L)
        private void Mz(int i) {
            try {
                if (v5) {
                    iy.u7(399545536886047680L, this, i);
                }
                int iEQ = EQ(this.DW.getChildNode(i, 0)) & (-129);
                if (this.j6.J0().isInterfaceType()) {
                    iEQ |= 577;
                }
                if ((iEQ & 1) == 0 && (iEQ & 4) == 0) {
                    iEQ |= 32;
                }
                this.j6.VH(iEQ);
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 3; i2 < childCount; i2 += 2) {
                    int childNode = this.DW.getChildNode(i, i2);
                    boolean z = this.DW.getChildCount(childNode) > 2;
                    iEQ = z ? iEQ & (-257) : iEQ & (-513);
                    er(this.FH.QX(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode), this.j6.J0(), iEQ, this.DW.getIdentifier(this.DW.getChildNode(childNode, 0)), z, false, false, false), childNode);
                    ef(childNode);
                }
                this.j6.yS();
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 399545536886047680L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -641454789166420063L)
        private void OW(int i) {
            try {
                if (v5) {
                    iy.u7(2262817563778248555L, this, i);
                }
                this.j6.u7();
                Hw(this.DW.getChildNode(i, 1));
                try {
                    Member memberJw = this.FH.jw(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    int childNode = this.DW.getChildNode(i, 1);
                    int childCount = this.DW.getChildCount(childNode);
                    int i2 = 1;
                    int i3 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        int childNode2 = this.DW.getChildNode(childNode, i2);
                        try {
                            MethodParameterType methodParameterTypeFY = this.FH.fY(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode2));
                            int childCount2 = this.DW.getChildCount(childNode2);
                            for (int i4 = 2; i4 < childCount2; i4 += 2) {
                                Type typeWe = we(this.DW.getChildNode(childNode2, i4));
                                if ((typeWe.isClassType() || typeWe.isParameterizedType() || typeWe.isParameterType() || typeWe.isMethodParameterType()) && (!typeWe.isMethodParameterType() || ((MethodParameterType) typeWe).WB() != memberJw || ((MethodParameterType) typeWe).mb() < i3)) {
                                    this.FH.u7(methodParameterTypeFY, typeWe);
                                }
                            }
                        } catch (e4 unused) {
                        }
                        i2 += 2;
                        i3++;
                    }
                    int childNode3 = this.DW.getChildNode(i, 3);
                    int childCount3 = this.DW.getChildCount(childNode3);
                    if (childCount3 > 2) {
                        int i5 = 0;
                        for (int i6 = 1; i6 < childCount3 - 1; i6 += 2) {
                            int childNode4 = this.DW.getChildNode(childNode3, i6);
                            if (this.DW.getSyntaxTag(childNode4) != 16) {
                                try {
                                    this.FH.sG(memberJw, gn(gn(we(this.DW.getChildNode(childNode4, 1)), this.DW.getChildNode(childNode4, 2)), this.DW.getChildNode(childNode4, 4)), i5);
                                } catch (e4 unused2) {
                                }
                                i5++;
                            }
                        }
                    }
                    int childNode5 = this.DW.getChildNode(i, 4);
                    int childCount4 = this.DW.getChildCount(childNode5);
                    int i7 = 0;
                    for (int i8 = 1; i8 < childCount4; i8 += 2) {
                        try {
                            Type typeWe2 = we(this.DW.getChildNode(childNode5, i8));
                            if (typeWe2.isClassType() || typeWe2.isMethodParameterType() || typeWe2.isParameterType()) {
                                this.FH.Ws(memberJw, typeWe2, i7);
                            }
                        } catch (e4 unused3) {
                        }
                        i7++;
                    }
                } catch (e4 unused4) {
                }
                aj(this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                this.j6.gW();
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 2262817563778248555L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3263933917438197019L)
        private void QX(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-1797777555476483475L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 129) {
                            this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    if (this.DW.getSyntaxTag(i) == 129) {
                        this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.EQ();
                    v5(this.DW.getChildNode(i, 3));
                    if (classtype == classType) {
                        int childNode = this.DW.getChildNode(i, 3);
                        int childCount = this.DW.getChildCount(childNode);
                        int i2 = 0;
                        int i3 = 1;
                        while (i3 < childCount) {
                            try {
                                int childNode2 = this.DW.getChildNode(childNode, i3);
                                ParameterType parameterTypeW9 = this.FH.w9(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode2));
                                int childCount2 = this.DW.getChildCount(childNode2);
                                for (int i4 = 2; i4 < childCount2; i4 += 2) {
                                    Type typeWe = we(this.DW.getChildNode(childNode2, i4));
                                    if ((typeWe.isClassType() || typeWe.isParameterizedType() || typeWe.isParameterType() || typeWe.isMethodParameterType()) && (!typeWe.isParameterType() || ((ParameterType) typeWe).WB() != classtype || ((ParameterType) typeWe).mb() < i2)) {
                                        this.FH.tp(parameterTypeW9, typeWe);
                                    }
                                }
                            } catch (e4 unused) {
                            }
                            i3 += 2;
                            i2++;
                        }
                    }
                    this.j6.Zo(classtype);
                    XL(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                    this.j6.BT();
                } catch (e4 unused2) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -1797777555476483475L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -487650302892811236L)
        private void Qq(int i) throws Throwable {
            int i2;
            boolean z;
            try {
                if (v5) {
                    iy.u7(316406721248413024L, this, i);
                }
                int iEQ = EQ(this.DW.getChildNode(i, 0)) & (-769);
                if (!y1.aM(iEQ)) {
                    iEQ |= 98304;
                }
                if ((iEQ & 1) == 0 && (iEQ & 4) == 0) {
                    iEQ |= 32;
                }
                this.j6.VH(iEQ);
                if (this.j6.J0().isInterfaceType()) {
                    iEQ |= ProxyTextView.INPUTTYPE_textCapSentences;
                }
                int i3 = iEQ;
                int iJ0 = J0(this.DW.getChildNode(i, 0));
                int childCount = this.DW.getChildCount(this.DW.getChildNode(i, 7)) / 2;
                int childNode = this.DW.getChildNode(i, 5);
                int childCount2 = this.DW.getChildCount(childNode) == 2 ? 0 : (this.DW.getChildCount(childNode) - 1) / 2;
                if (this.DW.getChildCount(childNode) > 2) {
                    int childNode2 = this.DW.getChildNode(this.DW.getChildNode(childNode, this.DW.getChildCount(childNode) - 2), 2);
                    z = this.DW.getChildCount(childNode2) > 0 && this.DW.getSyntaxTag(this.DW.getChildNode(childNode2, this.DW.getChildCount(childNode2) - 1)) == 108;
                } else {
                    z = false;
                }
                int childNode3 = this.DW.getChildNode(i, 1);
                int childCount3 = this.DW.getChildCount(childNode3);
                int i4 = childNode3;
                try {
                    Member memberRN = this.FH.rN(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i), this.j6.J0(), i3, this.DW.getIdentifier(this.DW.getChildNode(i, 4)), (childCount3 - 1) / 2, childCount2, z, false, childCount);
                    this.FH.Sf(memberRN, iJ0);
                    if (this.DW.getChildCount(childNode) > 2) {
                        int childCount4 = this.DW.getChildCount(childNode);
                        int i5 = 0;
                        int i6 = 1;
                        while (i6 < childCount4) {
                            this.FH.ro(memberRN, 0, this.DW.getIdentifier(this.DW.getChildNode(this.DW.getChildNode(childNode, i6), 3)), i5);
                            i6 += 2;
                            i5++;
                        }
                    }
                    int i7 = 0;
                    int i8 = 1;
                    while (i8 < childCount3) {
                        int i9 = i4;
                        int childNode4 = this.DW.getChildNode(i9, i8);
                        if (this.DW.getChildCount(childNode4) != 3) {
                            int childCount5 = (this.DW.getChildCount(childNode4) - 1) / 2;
                        }
                        this.FH.er(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode4), memberRN, i7, this.DW.getIdentifier(this.DW.getChildNode(childNode4, 0)));
                        i7++;
                        i8 += 2;
                        i4 = i9;
                    }
                    i2 = i;
                    try {
                        ef(this.DW.getChildNode(i2, this.DW.getChildCount(i2) - 1));
                        this.j6.yS();
                        yS(memberRN, i2);
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.j3(th, 316406721248413024L, this, new Integer(i2));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i;
                }
            } catch (Throwable th3) {
                th = th3;
                i2 = i;
            }
        }

        @ey(method = 4176943353670624828L)
        private void SI(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-1648746106567315184L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!this.FH.canDeclareOtherSuperClasstypes() && !classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 222) {
                            this.j6.j6(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    this.FH.nw(classtype);
                    int childNode = this.DW.getChildNode(i, 4);
                    if (this.DW.getChildCount(childNode) == 0) {
                        try {
                            if (classtype != this.Hw.Eq(this.DW.getFile())) {
                                this.FH.declareSuperClasstype(classtype, this.Hw.Eq(this.DW.getFile()));
                            }
                        } catch (e4 unused) {
                        }
                    } else {
                        try {
                            this.FH.declareSuperClasstype(classtype, tp(this.DW.getChildNode(childNode, 1)));
                        } catch (e4 unused2) {
                            this.FH.J0(classtype);
                        }
                    }
                    int childNode2 = this.DW.getChildNode(i, 5);
                    int childCount = this.DW.getChildCount(childNode2);
                    for (int i2 = 1; i2 < childCount; i2 += 2) {
                        try {
                            this.FH.declareSuperClasstype(classtype, tp(this.DW.getChildNode(childNode2, i2)));
                        } catch (e4 unused3) {
                        }
                    }
                    this.FH.SI(classtype);
                    if (this.DW.getSyntaxTag(i) == 222) {
                        this.j6.j6(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.Zo(classtype);
                    vy(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                } catch (e4 unused4) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -1648746106567315184L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -208804164801179172L)
        private void U2(ClassType classType, int i) throws Throwable {
            try {
                if (v5) {
                    try {
                        iy.EQ(3418412738726599968L, this, classType, new Integer(i));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.Mr(th, 3418412738726599968L, this, classType, new Integer(i));
                        }
                        throw th;
                    }
                }
                this.FH.EQ(classType, this.DW.getStartLine(this.DW.getChildNode(i, 2)), this.DW.getStartColumn(this.DW.getChildNode(i, 2)), this.DW.getEndColumn(this.DW.getChildNode(i, 2)), 0, 0, 0, 0, 0, 0, 0, 0);
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = -53459540817925471L)
        private Namespace VH(int i) {
            try {
                if (v5) {
                    iy.u7(-813994073969484077L, this, i);
                }
                Namespace namespaceNw = this.Hw.nw();
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 2; i2 < childCount - 1; i2 += 2) {
                    namespaceNw = namespaceNw.OW(this.DW.getIdentifier(this.DW.getChildNode(i, i2)));
                }
                this.j6.tp(namespaceNw);
                return namespaceNw;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -813994073969484077L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1354338174193347480L)
        private void Ws(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-5029206147914737068L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 128) {
                            this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    if (this.DW.getSyntaxTag(i) == 128) {
                        this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.EQ();
                    v5(this.DW.getChildNode(i, 3));
                    if (classtype == classType) {
                        int childNode = this.DW.getChildNode(i, 3);
                        int childCount = this.DW.getChildCount(childNode);
                        int i2 = 0;
                        int i3 = 1;
                        while (i3 < childCount) {
                            try {
                                int childNode2 = this.DW.getChildNode(childNode, i3);
                                ParameterType parameterTypeW9 = this.FH.w9(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode2));
                                int childCount2 = this.DW.getChildCount(childNode2);
                                for (int i4 = 2; i4 < childCount2; i4 += 2) {
                                    Type typeWe = we(this.DW.getChildNode(childNode2, i4));
                                    if ((typeWe.isClassType() || typeWe.isParameterizedType() || typeWe.isParameterType() || typeWe.isMethodParameterType()) && (!typeWe.isParameterType() || ((ParameterType) typeWe).WB() != classtype || ((ParameterType) typeWe).mb() < i2)) {
                                        this.FH.tp(parameterTypeW9, typeWe);
                                    }
                                }
                            } catch (e4 unused) {
                            }
                            i3 += 2;
                            i2++;
                        }
                    }
                    this.j6.Zo(classtype);
                    XL(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                    this.j6.BT();
                } catch (e4 unused2) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -5029206147914737068L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -5007733629113112416L)
        private void XG(int i) {
            try {
                if (v5) {
                    iy.u7(5849940736645733284L, this, i);
                }
                int syntaxTag = this.DW.getSyntaxTag(i);
                if (syntaxTag == 213) {
                    jJ(i);
                    return;
                }
                if (syntaxTag == 214) {
                    wc(i);
                } else if (syntaxTag == 225) {
                    kQ(i);
                } else {
                    if (syntaxTag != 226) {
                        return;
                    }
                    yO(i);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 5849940736645733284L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -604061115126548373L)
        private void XL(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-1315803820425109455L, this, classType, new Integer(i));
                }
                int syntaxTag = this.DW.getSyntaxTag(i);
                if (syntaxTag != 120) {
                    if (syntaxTag != 121) {
                        int i2 = 0;
                        if (syntaxTag == 123 || syntaxTag == 124) {
                            this.j6.u7();
                            Hw(this.DW.getChildNode(i, 1));
                            int childCount = this.DW.getChildCount(i);
                            while (i2 < childCount) {
                                XL(classType, this.DW.getChildNode(i, i2));
                                i2++;
                            }
                            this.j6.gW();
                            return;
                        }
                        if (syntaxTag == 133) {
                            this.j6.v5();
                            int childCount2 = this.DW.getChildCount(i);
                            while (i2 < childCount2) {
                                XL(classType, this.DW.getChildNode(i, i2));
                                i2++;
                            }
                            this.j6.rN();
                            return;
                        }
                        if (syntaxTag == 177) {
                            try {
                                XL(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 2));
                                ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                                if (classType.hp(classtype)) {
                                    this.j6.Zo(classtype);
                                    if (this.DW.getChildCount(i) == 7) {
                                        XL(classType, this.DW.getChildNode(i, 0));
                                    }
                                    XL(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                                    this.j6.er();
                                    return;
                                }
                                return;
                            } catch (e4 unused) {
                                return;
                            }
                        }
                        if (syntaxTag != 227) {
                            if (syntaxTag != 228) {
                                switch (syntaxTag) {
                                    case 126:
                                    case 127:
                                        this.j6.u7();
                                        int childCount3 = this.DW.getChildCount(i);
                                        while (i2 < childCount3) {
                                            XL(classType, this.DW.getChildNode(i, i2));
                                            i2++;
                                        }
                                        this.j6.gW();
                                        return;
                                    case 128:
                                        break;
                                    case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                        break;
                                    default:
                                        switch (syntaxTag) {
                                            case 220:
                                            case 221:
                                            case 222:
                                                return;
                                            case 223:
                                                VH(this.DW.getChildNode(i, 0));
                                                int childCount4 = this.DW.getChildCount(i);
                                                for (int i3 = 1; i3 < childCount4; i3++) {
                                                    XG(this.DW.getChildNode(i, i3));
                                                }
                                                Zo(i);
                                                for (int i4 = 1; i4 < childCount4; i4++) {
                                                    int childNode = this.DW.getChildNode(i, i4);
                                                    if (this.DW.getSyntaxTag(childNode) == 120 || this.DW.getSyntaxTag(childNode) == 220 || this.DW.getSyntaxTag(childNode) == 121) {
                                                        XL(classType, this.DW.getChildNode(i, i4));
                                                    }
                                                }
                                                return;
                                            default:
                                                int childCount5 = this.DW.getChildCount(i);
                                                while (i2 < childCount5) {
                                                    XL(classType, this.DW.getChildNode(i, i2));
                                                    i2++;
                                                }
                                                return;
                                        }
                                }
                            }
                        }
                    }
                    QX(classType, i);
                    return;
                }
                Ws(classType, i);
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -1315803820425109455L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -786167176983573600L)
        private void XX(int i) {
            try {
                if (v5) {
                    iy.u7(-7127952963498674304L, this, i);
                }
                this.j6.u7();
                Hw(this.DW.getChildNode(i, 1));
                try {
                    Type typeGn = gn(gn(we(this.DW.getChildNode(i, 2)), this.DW.getChildNode(i, 3)), this.DW.getChildNode(i, 6));
                    Member memberJw = this.FH.jw(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    this.FH.dx(memberJw, typeGn);
                    int childNode = this.DW.getChildNode(i, 1);
                    int childCount = this.DW.getChildCount(childNode);
                    int i2 = 1;
                    int i3 = 0;
                    while (i2 < childCount) {
                        int childNode2 = this.DW.getChildNode(childNode, i2);
                        try {
                            MethodParameterType methodParameterTypeFY = this.FH.fY(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode2));
                            int childCount2 = this.DW.getChildCount(childNode2);
                            for (int i4 = 2; i4 < childCount2; i4 += 2) {
                                Type typeWe = we(this.DW.getChildNode(childNode2, i4));
                                if ((typeWe.isClassType() || typeWe.isParameterizedType() || typeWe.isParameterType() || typeWe.isMethodParameterType()) && (!typeWe.isMethodParameterType() || ((MethodParameterType) typeWe).WB() != memberJw || ((MethodParameterType) typeWe).mb() < i3)) {
                                    this.FH.u7(methodParameterTypeFY, typeWe);
                                }
                            }
                        } catch (e4 unused) {
                        }
                        i2 += 2;
                        i3++;
                    }
                    int childNode3 = this.DW.getChildNode(i, 5);
                    int childCount3 = this.DW.getChildCount(childNode3);
                    if (childCount3 > 2) {
                        int i5 = 0;
                        for (int i6 = 1; i6 < childCount3 - 1; i6 += 2) {
                            int childNode4 = this.DW.getChildNode(childNode3, i6);
                            if (this.DW.getSyntaxTag(childNode4) != 16) {
                                try {
                                    this.FH.sG(memberJw, gn(gn(we(this.DW.getChildNode(childNode4, 1)), this.DW.getChildNode(childNode4, 2)), this.DW.getChildNode(childNode4, 4)), i5);
                                } catch (e4 unused2) {
                                }
                                i5++;
                            }
                        }
                    }
                    int childNode5 = this.DW.getChildNode(i, 7);
                    int childCount4 = this.DW.getChildCount(childNode5);
                    int i7 = 0;
                    for (int i8 = 1; i8 < childCount4; i8 += 2) {
                        try {
                            Type typeWe2 = we(this.DW.getChildNode(childNode5, i8));
                            if (typeWe2.isClassType() || typeWe2.isMethodParameterType() || typeWe2.isParameterType()) {
                                this.FH.Ws(memberJw, typeWe2, i7);
                            }
                        } catch (e4 unused3) {
                        }
                        i7++;
                    }
                } catch (e4 unused4) {
                }
                aj(this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                this.j6.gW();
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -7127952963498674304L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4139517930881179293L)
        private void Zo(int i) {
            try {
                if (v5) {
                    iy.u7(439899037484711161L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    int childNode = this.DW.getChildNode(i, i2);
                    if (this.DW.getSyntaxTag(childNode) == 120 || this.DW.getSyntaxTag(childNode) == 220 || this.DW.getSyntaxTag(childNode) == 121) {
                        try {
                            this.j6.Hw(this.DW.getIdentifier(this.DW.getChildNode(childNode, 2)), this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode)));
                        } catch (e4 unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 439899037484711161L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 4368630540297922353L)
        private void a8(ClassType classType, int i) throws Throwable {
            int startColumn;
            int startLine;
            int startColumn2;
            int i2;
            try {
                if (v5) {
                    try {
                        iy.EQ(1648181664569374815L, this, classType, new Integer(i));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.Mr(th, 1648181664569374815L, this, classType, new Integer(i));
                        }
                        throw th;
                    }
                }
                int startLine2 = this.DW.getStartLine(this.DW.getChildNode(i, 2));
                int startColumn3 = this.DW.getStartColumn(this.DW.getChildNode(i, 2));
                int endColumn = this.DW.getEndColumn(this.DW.getChildNode(i, 2));
                int childNode = this.DW.getChildNode(i, 0);
                int iJ8 = J8(childNode);
                if (iJ8 != -1) {
                    int startLine3 = this.DW.getStartLine(iJ8);
                    startColumn = this.DW.getStartColumn(iJ8);
                    startLine = this.DW.getEndLine(iJ8);
                    i2 = startLine3;
                    startColumn2 = this.DW.getEndColumn(iJ8);
                } else {
                    int startLine4 = this.DW.getStartLine(childNode);
                    startColumn = this.DW.getStartColumn(childNode);
                    startLine = this.DW.getStartLine(childNode);
                    startColumn2 = this.DW.getStartColumn(childNode);
                    i2 = startLine4;
                }
                this.FH.EQ(classType, startLine2, startColumn3, endColumn, i2, startColumn, startLine, startColumn2, this.DW.hasLeftSisterNode(i) ? this.DW.getEndLine(this.DW.getLeftSisterNode(i)) : this.DW.getStartLine(i), this.DW.hasLeftSisterNode(i) ? this.DW.getEndColumn(this.DW.getLeftSisterNode(i)) : this.DW.getStartColumn(i), this.DW.getEndLine(i), this.DW.getEndColumn(i));
                BT(this.DW.getChildNode(i, 3));
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = 265246641132670208L)
        private void aj(int i) {
            try {
                if (v5) {
                    iy.u7(-713453350214033000L, this, i);
                }
                int syntaxTag = this.DW.getSyntaxTag(i);
                try {
                    if (syntaxTag != 120 && syntaxTag != 121) {
                        if (syntaxTag == 123) {
                            OW(i);
                            return;
                        }
                        if (syntaxTag == 124) {
                            XX(i);
                            return;
                        }
                        int i2 = 0;
                        if (syntaxTag == 133) {
                            this.j6.v5();
                            int childCount = this.DW.getChildCount(i);
                            while (i2 < childCount) {
                                aj(this.DW.getChildNode(i, i2));
                                i2++;
                            }
                            this.j6.rN();
                            return;
                        }
                        if (syntaxTag == 177) {
                            aj(this.DW.getChildNode(i, this.DW.getChildCount(i) - 2));
                            this.j6.Zo(this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i)));
                            if (this.DW.getChildCount(i) == 7) {
                                aj(this.DW.getChildNode(i, 0));
                            }
                            aj(this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                            this.j6.er();
                            return;
                        }
                        if (syntaxTag != 227 && syntaxTag != 228) {
                            if (syntaxTag == 245 || syntaxTag == 246) {
                                this.FH.cb(this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i)), gn(we(this.DW.getChildNode(i, 2)), this.DW.getChildNode(i, 3)));
                                return;
                            }
                            switch (syntaxTag) {
                                case 126:
                                    br(i);
                                    return;
                                case 127:
                                    this.j6.u7();
                                    int childCount2 = this.DW.getChildCount(i);
                                    while (i2 < childCount2) {
                                        aj(this.DW.getChildNode(i, i2));
                                        i2++;
                                    }
                                    this.j6.gW();
                                    return;
                                case 128:
                                case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                    break;
                                default:
                                    switch (syntaxTag) {
                                        case 220:
                                        case 221:
                                            break;
                                        case 222:
                                            break;
                                        case 223:
                                            VH(this.DW.getChildNode(i, 0));
                                            int childCount3 = this.DW.getChildCount(i);
                                            for (int i3 = 1; i3 < childCount3; i3++) {
                                                XG(this.DW.getChildNode(i, i3));
                                            }
                                            Zo(i);
                                            for (int i4 = 1; i4 < childCount3; i4++) {
                                                int childNode = this.DW.getChildNode(i, i4);
                                                if (this.DW.getSyntaxTag(childNode) == 120 || this.DW.getSyntaxTag(childNode) == 220 || this.DW.getSyntaxTag(childNode) == 245 || this.DW.getSyntaxTag(childNode) == 121) {
                                                    aj(this.DW.getChildNode(i, i4));
                                                }
                                            }
                                            return;
                                        default:
                                            int childCount4 = this.DW.getChildCount(i);
                                            while (i2 < childCount4) {
                                                aj(this.DW.getChildNode(i, i2));
                                                i2++;
                                            }
                                            return;
                                    }
                            }
                            ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                            this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            this.j6.EQ();
                            v5(this.DW.getChildNode(i, 3));
                            this.j6.Zo(classtype);
                            aj(this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                            this.j6.er();
                            this.j6.BT();
                            return;
                        }
                    }
                    ClassType classtype2 = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    this.j6.EQ();
                    v5(this.DW.getChildNode(i, 3));
                    this.j6.Zo(classtype2);
                    aj(this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                    this.j6.BT();
                } catch (e4 unused) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -713453350214033000L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -594676655242730580L)
        private void br(int i) {
            try {
                if (v5) {
                    iy.u7(-5673529924896062112L, this, i);
                }
                this.j6.u7();
                try {
                    Type typeGn = gn(we(this.DW.getChildNode(i, 1)), this.DW.getChildNode(i, 2));
                    int childCount = this.DW.getChildCount(i);
                    for (int i2 = 3; i2 < childCount; i2 += 2) {
                        int childNode = this.DW.getChildNode(i, i2);
                        try {
                            this.FH.dx(this.FH.jw(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode)), gn(typeGn, this.DW.getChildNode(childNode, 1)));
                        } catch (e4 unused) {
                        }
                        aj(childNode);
                    }
                } catch (e4 unused2) {
                }
                this.j6.gW();
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -5673529924896062112L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: all -> 0x013e, TryCatch #0 {all -> 0x013e, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0031, B:13:0x0041, B:15:0x004d, B:16:0x004f, B:18:0x005b, B:19:0x005d, B:21:0x0061, B:23:0x0065, B:24:0x0067, B:30:0x0086, B:34:0x00cc, B:36:0x00dd, B:40:0x0104, B:39:0x00fa, B:41:0x0126, B:29:0x0081, B:10:0x0033), top: B:50:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x013e, TryCatch #0 {all -> 0x013e, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0031, B:13:0x0041, B:15:0x004d, B:16:0x004f, B:18:0x005b, B:19:0x005d, B:21:0x0061, B:23:0x0065, B:24:0x0067, B:30:0x0086, B:34:0x00cc, B:36:0x00dd, B:40:0x0104, B:39:0x00fa, B:41:0x0126, B:29:0x0081, B:10:0x0033), top: B:50:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[Catch: all -> 0x013e, TryCatch #0 {all -> 0x013e, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0031, B:13:0x0041, B:15:0x004d, B:16:0x004f, B:18:0x005b, B:19:0x005d, B:21:0x0061, B:23:0x0065, B:24:0x0067, B:30:0x0086, B:34:0x00cc, B:36:0x00dd, B:40:0x0104, B:39:0x00fa, B:41:0x0126, B:29:0x0081, B:10:0x0033), top: B:50:0x0009 }] */
        @abcd.ey(method = -446807589719369085L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void ca(int r27) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaSignatureAnalyzer.a.ca(int):void");
        }

        @ey(method = 3230431542430304800L)
        private void cb(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-2052979800297444224L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 129) {
                            this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    if (this.DW.getSyntaxTag(i) == 129) {
                        this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.EQ();
                    v5(this.DW.getChildNode(i, 3));
                    if (classtype == classType) {
                        int childNode = this.DW.getChildNode(i, 4);
                        int childCount = this.DW.getChildCount(childNode);
                        if (childCount != 0) {
                            for (int i2 = 1; i2 < childCount; i2 += 2) {
                                try {
                                    this.FH.KD(classtype, we(this.DW.getChildNode(childNode, i2)));
                                } catch (e4 unused) {
                                }
                            }
                        } else if (classtype != this.Hw.Eq(this.DW.getFile())) {
                            this.FH.KD(classtype, this.Hw.Eq(this.DW.getFile()));
                        }
                    }
                    this.j6.Zo(classtype);
                    dx(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                    this.j6.BT();
                } catch (e4 unused2) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -2052979800297444224L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2595814132689803805L)
        private void cn(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(6789424825031882925L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 128) {
                            this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    if (this.DW.getSyntaxTag(i) == 128) {
                        this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.EQ();
                    v5(this.DW.getChildNode(i, 3));
                    if (classtype == classType) {
                        int childNode = this.DW.getChildNode(i, 4);
                        if (this.DW.getChildCount(childNode) != 0) {
                            try {
                                this.FH.KD(classtype, we(this.DW.getChildNode(childNode, 1)));
                            } catch (e4 unused) {
                            }
                        } else if (classtype != this.Hw.Eq(this.DW.getFile())) {
                            this.FH.KD(classtype, this.Hw.Eq(this.DW.getFile()));
                        }
                        int childNode2 = this.DW.getChildNode(i, 5);
                        int childCount = this.DW.getChildCount(childNode2);
                        for (int i2 = 1; i2 < childCount; i2 += 2) {
                            try {
                                this.FH.KD(classtype, we(this.DW.getChildNode(childNode2, i2)));
                            } catch (e4 unused2) {
                            }
                        }
                    }
                    this.j6.Zo(classtype);
                    dx(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                    this.j6.BT();
                } catch (e4 unused3) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 6789424825031882925L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1159586773064746800L)
        private void dx(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-1795032697448384184L, this, classType, new Integer(i));
                }
                int syntaxTag = this.DW.getSyntaxTag(i);
                if (syntaxTag != 120) {
                    if (syntaxTag != 121) {
                        int i2 = 0;
                        if (syntaxTag == 123 || syntaxTag == 124) {
                            this.j6.u7();
                            Hw(this.DW.getChildNode(i, 1));
                            int childCount = this.DW.getChildCount(i);
                            while (i2 < childCount) {
                                dx(classType, this.DW.getChildNode(i, i2));
                                i2++;
                            }
                            this.j6.gW();
                            return;
                        }
                        if (syntaxTag == 133) {
                            this.j6.v5();
                            int childCount2 = this.DW.getChildCount(i);
                            while (i2 < childCount2) {
                                dx(classType, this.DW.getChildNode(i, i2));
                                i2++;
                            }
                            this.j6.rN();
                            return;
                        }
                        if (syntaxTag == 177) {
                            ro(i, classType);
                            return;
                        }
                        if (syntaxTag != 227) {
                            if (syntaxTag != 228) {
                                switch (syntaxTag) {
                                    case 126:
                                    case 127:
                                        this.j6.u7();
                                        int childCount3 = this.DW.getChildCount(i);
                                        while (i2 < childCount3) {
                                            dx(classType, this.DW.getChildNode(i, i2));
                                            i2++;
                                        }
                                        this.j6.gW();
                                        return;
                                    case 128:
                                        break;
                                    case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                        break;
                                    default:
                                        switch (syntaxTag) {
                                            case 220:
                                            case 221:
                                            case 222:
                                                sh(classType, i);
                                                return;
                                            case 223:
                                                VH(this.DW.getChildNode(i, 0));
                                                int childCount4 = this.DW.getChildCount(i);
                                                for (int i3 = 1; i3 < childCount4; i3++) {
                                                    XG(this.DW.getChildNode(i, i3));
                                                }
                                                Zo(i);
                                                for (int i4 = 1; i4 < childCount4; i4++) {
                                                    int childNode = this.DW.getChildNode(i, i4);
                                                    if (this.DW.getSyntaxTag(childNode) == 120 || this.DW.getSyntaxTag(childNode) == 220 || this.DW.getSyntaxTag(childNode) == 121) {
                                                        dx(classType, this.DW.getChildNode(i, i4));
                                                    }
                                                }
                                                return;
                                            default:
                                                int childCount5 = this.DW.getChildCount(i);
                                                while (i2 < childCount5) {
                                                    dx(classType, this.DW.getChildNode(i, i2));
                                                    i2++;
                                                }
                                                return;
                                        }
                                }
                            }
                        }
                    }
                    cb(classType, i);
                    return;
                }
                cn(classType, i);
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -1795032697448384184L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2076221758508093000L)
        private void ef(int i) {
            try {
                if (v5) {
                    iy.u7(1076849830279043396L, this, i);
                }
                int syntaxTag = this.DW.getSyntaxTag(i);
                if (syntaxTag != 120 && syntaxTag != 121) {
                    if (syntaxTag == 123) {
                        g3(i);
                        return;
                    }
                    if (syntaxTag == 124) {
                        Qq(i);
                        return;
                    }
                    if (syntaxTag == 163) {
                        this.j6.VH(64);
                        ef(this.DW.getChildNode(i, 2));
                        this.j6.yS();
                        return;
                    }
                    if (syntaxTag == 164) {
                        this.j6.VH(64);
                        if (this.DW.getChildCount(i) == 4) {
                            ef(this.DW.getChildNode(i, 2));
                        } else {
                            ef(this.DW.getChildNode(i, 0));
                            ef(this.DW.getChildNode(i, 4));
                        }
                        this.j6.yS();
                        return;
                    }
                    if (syntaxTag == 177) {
                        ef(this.DW.getChildNode(i, this.DW.getChildCount(i) - 2));
                        ClassType classTypeGn = this.FH.gn(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i), this.j6.Ws(), this.j6.J0(), this.j6.lg(), true);
                        this.j6.Zo(classTypeGn);
                        U2(classTypeGn, i);
                        ef(this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                        this.j6.er();
                        return;
                    }
                    if (syntaxTag != 227 && syntaxTag != 228) {
                        if (syntaxTag == 245) {
                            sy(i);
                            return;
                        }
                        if (syntaxTag == 246) {
                            x9(i);
                            return;
                        }
                        switch (syntaxTag) {
                            case 126:
                                Mz(i);
                                return;
                            case 127:
                                this.j6.VH(EQ(this.DW.getChildNode(i, 0)));
                                ef(this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                                this.j6.yS();
                                return;
                            default:
                                switch (syntaxTag) {
                                    case 220:
                                        break;
                                    case 221:
                                        break;
                                    case 222:
                                        break;
                                    case 223:
                                        this.FH.gW(VH(this.DW.getChildNode(i, 0)), this.DW.getFile(), this.DW.getLanguage());
                                        int childCount = this.DW.getChildCount(i);
                                        for (int i2 = 1; i2 < childCount; i2++) {
                                            ef(this.DW.getChildNode(i, i2));
                                        }
                                        return;
                                    default:
                                        int childCount2 = this.DW.getChildCount(i);
                                        for (int i3 = 0; i3 < childCount2; i3++) {
                                            ef(this.DW.getChildNode(i, i3));
                                        }
                                        return;
                                }
                            case 128:
                            case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                I(i);
                                return;
                        }
                    }
                    ca(i);
                    return;
                }
                vJ(i);
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 1076849830279043396L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -6808065289881454144L)
        private void ei(int i, ClassType classType) {
            try {
                if (v5) {
                    iy.EQ(4944880074003935272L, this, new Integer(i), classType);
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (this.FH.canDeclareOtherSuperClasstypes() || classType.hp(classtype)) {
                        vy(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 2));
                        this.FH.nw(classtype);
                        try {
                            if (this.DW.getChildCount(i) != 7) {
                                ClassType classTypeTp = tp(this.DW.getChildNode(i, 2));
                                if (classTypeTp.isInterfaceType()) {
                                    this.FH.declareSuperClasstype(classtype, this.Hw.Eq(this.DW.getFile()));
                                }
                                this.FH.declareSuperClasstype(classtype, classTypeTp);
                            } else {
                                this.FH.declareSuperClasstype(classtype, this.Hw.Eq(this.DW.getFile()));
                            }
                        } catch (e4 unused) {
                            this.FH.J0(classtype);
                        }
                        this.FH.SI(classtype);
                        this.j6.Zo(classtype);
                        if (this.DW.getChildCount(i) == 7) {
                            vy(classType, this.DW.getChildNode(i, 0));
                        }
                        vy(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                        this.j6.er();
                    }
                } catch (e4 unused2) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 4944880074003935272L, this, new Integer(i), classType);
                }
                throw th;
            }
        }

        @ey(method = 7632584217622029243L)
        private void er(Member member, int i) throws Throwable {
            int startColumn;
            int startLine;
            int startColumn2;
            int i2;
            try {
                if (v5) {
                    try {
                        iy.EQ(235914662656322325L, this, member, new Integer(i));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.Mr(th, 235914662656322325L, this, member, new Integer(i));
                        }
                        throw th;
                    }
                }
                int startLine2 = this.DW.getStartLine(this.DW.getChildNode(i, 0));
                int startColumn3 = this.DW.getStartColumn(this.DW.getChildNode(i, 0));
                int endColumn = this.DW.getEndColumn(this.DW.getChildNode(i, 0));
                int childNode = this.DW.getChildNode(this.DW.getParentNode(i), 0);
                int iJ8 = J8(childNode);
                if (iJ8 != -1) {
                    int startLine3 = this.DW.getStartLine(iJ8);
                    startColumn = this.DW.getStartColumn(iJ8);
                    startLine = this.DW.getEndLine(iJ8);
                    i2 = startLine3;
                    startColumn2 = this.DW.getEndColumn(iJ8);
                } else {
                    int startLine4 = this.DW.getStartLine(childNode);
                    startColumn = this.DW.getStartColumn(childNode);
                    startLine = this.DW.getStartLine(childNode);
                    startColumn2 = this.DW.getStartColumn(childNode);
                    i2 = startLine4;
                }
                int endLine = this.DW.getEndLine(this.DW.getLeftSisterNode(this.DW.getParentNode(i)));
                int endColumn2 = this.DW.getEndColumn(this.DW.getLeftSisterNode(this.DW.getParentNode(i)));
                int endLine2 = this.DW.getEndLine(this.DW.getParentNode(i));
                int endColumn3 = this.DW.getEndColumn(this.DW.getParentNode(i));
                this.FH.lg(member, startLine2, startColumn3, endColumn, i2, startColumn, startLine, startColumn2, endLine, endColumn2, endLine2, endColumn3);
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = -5626788504907806715L)
        private Entity et(Entity entity, int i) {
            try {
                if (v5) {
                    iy.EQ(-812774475603598413L, this, entity, new Integer(i));
                }
                if (entity.isParameterizedType()) {
                    ClassType classType = ((ParameterizedType) entity).getClassType();
                    if (!classType.isToplevel() && !classType.Of()) {
                        entity = classType;
                    }
                }
                int childCount = this.DW.getChildCount(i);
                if (childCount == 0) {
                    if (!entity.isParameterizedType()) {
                        return entity;
                    }
                    ClassType classType2 = ((ParameterizedType) entity).getClassType();
                    return classType2.Pa() == 0 ? entity : classType2;
                }
                if (childCount == 2) {
                    return entity;
                }
                int i2 = (childCount - 1) / 4;
                if (!entity.isClassType() && !entity.isParameterizedType()) {
                    return entity;
                }
                ClassType classType3 = entity.isParameterizedType() ? ((ParameterizedType) entity).getClassType() : (ClassType) entity;
                if (i2 != classType3.Pa()) {
                    return entity;
                }
                Type[] typeArr = new Type[i2];
                int[] iArr = new int[i2];
                int i3 = 0;
                for (int i4 = 1; i4 < childCount; i4 += 4) {
                    try {
                        typeArr[i3] = gn(we(this.DW.getChildNode(i, i4 + 1)), this.DW.getChildNode(i, i4 + 2));
                        iArr[i3] = 0;
                        int childNode = this.DW.getChildNode(i, i4);
                        if (this.DW.getChildCount(childNode) > 0) {
                            if (this.DW.getChildCount(childNode) == 1) {
                                iArr[i3] = 1;
                                typeArr[i3] = classType3.An(i3).x9().x9();
                            } else {
                                int syntaxTag = this.DW.getSyntaxTag(this.DW.getChildNode(childNode, 1));
                                if (syntaxTag == 78) {
                                    iArr[i3] = 3;
                                    if (classType3.An(i3).x9() == typeArr[i3]) {
                                        iArr[i3] = 0;
                                    }
                                } else if (syntaxTag == 91) {
                                    iArr[i3] = 2;
                                    if (classType3.An(i3).x9() == typeArr[i3]) {
                                        iArr[i3] = 1;
                                    }
                                }
                            }
                        }
                        if (!this.Hw.iW(typeArr[i3])) {
                            return entity;
                        }
                        i3++;
                    } catch (e4 unused) {
                        return entity;
                    }
                }
                return entity.isClassType() ? ((ClassType) entity).ba(typeArr, iArr) : ((ParameterizedType) entity).ye(typeArr, iArr);
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -812774475603598413L, this, entity, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 4995044506838326751L)
        private void g3(int i) throws Throwable {
            int i2;
            boolean z;
            try {
                if (v5) {
                    iy.u7(-149821681392464463L, this, i);
                }
                int iEQ = EQ(this.DW.getChildNode(i, 0));
                if ((iEQ & 1) == 0 && (iEQ & 4) == 0) {
                    iEQ |= 32;
                }
                int i3 = iEQ;
                this.j6.VH(i3);
                int childCount = this.DW.getChildCount(this.DW.getChildNode(i, 4)) / 2;
                int childNode = this.DW.getChildNode(i, 3);
                int childCount2 = this.DW.getChildCount(childNode) == 2 ? 0 : (this.DW.getChildCount(childNode) - 1) / 2;
                if (this.DW.getChildCount(childNode) > 2) {
                    int childNode2 = this.DW.getChildNode(this.DW.getChildNode(childNode, this.DW.getChildCount(childNode) - 2), 2);
                    z = this.DW.getChildCount(childNode2) > 0 && this.DW.getSyntaxTag(this.DW.getChildNode(childNode2, this.DW.getChildCount(childNode2) - 1)) == 108;
                } else {
                    z = false;
                }
                int childNode3 = this.DW.getChildNode(i, 1);
                int childCount3 = this.DW.getChildCount(childNode3);
                try {
                    Member memberWe = this.FH.we(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i), this.j6.J0(), i3, (childCount3 - 1) / 2, childCount2, z, childCount);
                    if (this.DW.getChildCount(childNode) > 2) {
                        int childCount4 = this.DW.getChildCount(childNode);
                        int i4 = 0;
                        int i5 = 1;
                        while (i5 < childCount4) {
                            this.FH.ro(memberWe, 0, this.DW.getIdentifier(this.DW.getChildNode(this.DW.getChildNode(childNode, i5), 3)), i4);
                            i5 += 2;
                            i4++;
                        }
                    }
                    int i6 = 0;
                    for (int i7 = 1; i7 < childCount3; i7 += 2) {
                        int childNode4 = this.DW.getChildNode(childNode3, i7);
                        if (this.DW.getChildCount(childNode4) != 3) {
                            int childCount5 = (this.DW.getChildCount(childNode4) - 1) / 2;
                        }
                        this.FH.er(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode4), memberWe, i6, this.DW.getIdentifier(this.DW.getChildNode(childNode4, 0)));
                        i6++;
                    }
                    i2 = i;
                    try {
                        ef(this.DW.getChildNode(i2, this.DW.getChildCount(i2) - 1));
                        this.j6.yS();
                        lg(memberWe, i2);
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.j3(th, -149821681392464463L, this, new Integer(i2));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i;
                }
            } catch (Throwable th3) {
                th = th3;
                i2 = i;
            }
        }

        @ey(method = -5466988460352777501L)
        private void gW(int i) {
            try {
                if (v5) {
                    iy.u7(1955628520678583697L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    try {
                        int childNode = this.DW.getChildNode(i, i2);
                        this.FH.yS(this.FH.fY(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode)), this.DW.getStartLine(childNode), this.DW.getStartColumn(childNode), this.DW.getEndColumn(childNode));
                    } catch (e4 unused) {
                    }
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 1955628520678583697L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1718435109002621100L)
        private Type gn(Type type, int i) {
            try {
                if (v5) {
                    iy.EQ(2183856281979465240L, this, type, new Integer(i));
                }
                int childCount = this.DW.getChildCount(i);
                if (childCount > 0 && this.DW.getSyntaxTag(this.DW.getChildNode(i, childCount - 1)) == 108) {
                    childCount--;
                    type = this.FH.hz(type, 1);
                }
                for (int i2 = childCount - 2; i2 >= 0; i2 -= 3) {
                    type = this.FH.hz(type, this.DW.getChildCount(this.DW.getChildNode(i, i2)) + 1);
                }
                return type;
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 2183856281979465240L, this, type, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:27:0x003a. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: e4 -> 0x00ca, all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:29:0x003f, B:34:0x00ca, B:36:0x00d3, B:30:0x005b, B:31:0x0077, B:32:0x0093, B:33:0x00af), top: B:47:0x0005 }] */
        @abcd.ey(method = 3083482378821551479L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void j3(int r7) {
            /*
                r6 = this;
                r0 = 3684128940076339209(0x3320a7c06bfc9009, double:2.0243371311125656E-62)
                boolean r2 = com.aide.codemodel.language.java.JavaSignatureAnalyzer.a.v5     // Catch: java.lang.Throwable -> Le0
                if (r2 == 0) goto Lc
                abcd.iy.u7(r0, r6, r7)     // Catch: java.lang.Throwable -> Le0
            Lc:
                com.aide.codemodel.api.SyntaxTree r2 = r6.DW     // Catch: java.lang.Throwable -> Le0
                int r2 = r2.getSyntaxTag(r7)     // Catch: java.lang.Throwable -> Le0
                r3 = 120(0x78, float:1.68E-43)
                if (r2 == r3) goto Laf
                r3 = 121(0x79, float:1.7E-43)
                if (r2 == r3) goto Laf
                r3 = 123(0x7b, float:1.72E-43)
                if (r2 == r3) goto L93
                r3 = 124(0x7c, float:1.74E-43)
                if (r2 == r3) goto L77
                r3 = 128(0x80, float:1.8E-43)
                if (r2 == r3) goto Laf
                r3 = 129(0x81, float:1.81E-43)
                if (r2 == r3) goto Laf
                r3 = 177(0xb1, float:2.48E-43)
                if (r2 == r3) goto L5b
                r3 = 194(0xc2, float:2.72E-43)
                if (r2 == r3) goto L3f
                r3 = 227(0xe3, float:3.18E-43)
                if (r2 == r3) goto Laf
                r3 = 228(0xe4, float:3.2E-43)
                if (r2 == r3) goto Laf
                switch(r2) {
                    case 220: goto Laf;
                    case 221: goto Laf;
                    case 222: goto Laf;
                    default: goto L3d;
                }
            L3d:
                goto Lca
            L3f:
                com.aide.codemodel.api.EntitySpace r2 = r6.FH     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r3 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.FileEntry r3 = r3.getFile()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r4 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.abstraction.Language r4 = r4.getLanguage()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r5 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                int r5 = r5.getDeclarationNumber(r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.Member r2 = r2.jw(r3, r4, r5)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                r6.er(r2, r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                goto Lca
            L5b:
                com.aide.codemodel.api.EntitySpace r2 = r6.FH     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r3 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.FileEntry r3 = r3.getFile()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r4 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.abstraction.Language r4 = r4.getLanguage()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r5 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                int r5 = r5.getDeclarationNumber(r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.ClassType r2 = r2.getClasstype(r3, r4, r5)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                r6.U2(r2, r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                goto Lca
            L77:
                com.aide.codemodel.api.EntitySpace r2 = r6.FH     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r3 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.FileEntry r3 = r3.getFile()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r4 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.abstraction.Language r4 = r4.getLanguage()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r5 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                int r5 = r5.getDeclarationNumber(r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.Member r2 = r2.jw(r3, r4, r5)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                r6.yS(r2, r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                goto Lca
            L93:
                com.aide.codemodel.api.EntitySpace r2 = r6.FH     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r3 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.FileEntry r3 = r3.getFile()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r4 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.abstraction.Language r4 = r4.getLanguage()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r5 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                int r5 = r5.getDeclarationNumber(r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.Member r2 = r2.jw(r3, r4, r5)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                r6.lg(r2, r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                goto Lca
            Laf:
                com.aide.codemodel.api.EntitySpace r2 = r6.FH     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r3 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.FileEntry r3 = r3.getFile()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r4 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.abstraction.Language r4 = r4.getLanguage()     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.SyntaxTree r5 = r6.DW     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                int r5 = r5.getDeclarationNumber(r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                com.aide.codemodel.api.ClassType r2 = r2.getClasstype(r3, r4, r5)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
                r6.a8(r2, r7)     // Catch: abcd.e4 -> Lca java.lang.Throwable -> Le0
            Lca:
                com.aide.codemodel.api.SyntaxTree r2 = r6.DW     // Catch: java.lang.Throwable -> Le0
                int r2 = r2.getChildCount(r7)     // Catch: java.lang.Throwable -> Le0
                r3 = 0
            Ld1:
                if (r3 >= r2) goto Ldf
                com.aide.codemodel.api.SyntaxTree r4 = r6.DW     // Catch: java.lang.Throwable -> Le0
                int r4 = r4.getChildNode(r7, r3)     // Catch: java.lang.Throwable -> Le0
                r6.j3(r4)     // Catch: java.lang.Throwable -> Le0
                int r3 = r3 + 1
                goto Ld1
            Ldf:
                return
            Le0:
                r2 = move-exception
                boolean r3 = com.aide.codemodel.language.java.JavaSignatureAnalyzer.a.Zo
                if (r3 == 0) goto Led
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r7)
                abcd.iy.j3(r2, r0, r6, r3)
            Led:
                goto Lef
            Lee:
                throw r2
            Lef:
                goto Lee
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaSignatureAnalyzer.a.j3(int):void");
        }

        @ey(method = 1145168049531282603L)
        private void jJ(int i) {
            try {
                if (v5) {
                    iy.u7(168565404422498013L, this, i);
                }
                Entity entityNw = this.Hw.nw();
                int childCount = this.DW.getChildCount(i) - 2;
                for (int i2 = 2; i2 < childCount; i2 += 2) {
                    int identifier = this.DW.getIdentifier(this.DW.getChildNode(i, i2));
                    try {
                        entityNw = entityNw.isClassType() ? ((ClassType) entityNw).FN(identifier, true, 0, this.j6.Ws(), this.DW.getFile(), this.DW.getLanguage()) : ((Namespace) entityNw).dx(this.DW.getFile(), this.DW.getLanguage(), identifier, true, 0, (Namespace) entityNw);
                    } catch (b4 | e4 unused) {
                        return;
                    }
                }
                if (entityNw.isClassType()) {
                    int identifier2 = this.DW.getIdentifier(this.DW.getChildNode(i, this.DW.getChildCount(i) - 2));
                    try {
                        ClassType classTypeFN = ((ClassType) entityNw).FN(identifier2, true, 0, this.j6.Ws(), this.DW.getFile(), this.DW.getLanguage());
                        if (classTypeFN.pl()) {
                            this.j6.a8(identifier2, classTypeFN);
                        }
                    } catch (b4 | e4 unused2) {
                    }
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 168565404422498013L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -4749236237967165615L)
        private void kQ(int i) {
            try {
                if (v5) {
                    iy.u7(3071746049294282195L, this, i);
                }
                Entity entityNw = this.Hw.nw();
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    int identifier = this.DW.getIdentifier(this.DW.getChildNode(i, i2));
                    try {
                        entityNw = entityNw.isClassType() ? ((ClassType) entityNw).FN(identifier, true, 0, this.j6.Ws(), this.DW.getFile(), this.DW.getLanguage()) : ((Namespace) entityNw).dx(this.DW.getFile(), this.DW.getLanguage(), identifier, true, 0, (Namespace) entityNw);
                    } catch (b4 | e4 unused) {
                        return;
                    }
                }
                if (entityNw.isClassType()) {
                    this.j6.aM(this.DW.getIdentifier(this.DW.getChildNode(i, this.DW.getChildCount(i) - 2)), (ClassType) entityNw);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 3071746049294282195L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1107370205580200727L)
        private void lg(Member member, int i) throws Throwable {
            int startColumn;
            int startLine;
            int startColumn2;
            int i2;
            try {
                if (v5) {
                    try {
                        iy.EQ(1572368172388249223L, this, member, new Integer(i));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.Mr(th, 1572368172388249223L, this, member, new Integer(i));
                        }
                        throw th;
                    }
                }
                int startLine2 = this.DW.getStartLine(this.DW.getChildNode(i, 2));
                int startColumn3 = this.DW.getStartColumn(this.DW.getChildNode(i, 2));
                int endColumn = this.DW.getEndColumn(this.DW.getChildNode(i, 2));
                int childNode = this.DW.getChildNode(i, 0);
                int iJ8 = J8(childNode);
                if (iJ8 != -1) {
                    int startLine3 = this.DW.getStartLine(iJ8);
                    startColumn = this.DW.getStartColumn(iJ8);
                    startLine = this.DW.getEndLine(iJ8);
                    i2 = startLine3;
                    startColumn2 = this.DW.getEndColumn(iJ8);
                } else {
                    int startLine4 = this.DW.getStartLine(childNode);
                    startColumn = this.DW.getStartColumn(childNode);
                    startLine = this.DW.getStartLine(childNode);
                    startColumn2 = this.DW.getStartColumn(childNode);
                    i2 = startLine4;
                }
                this.FH.lg(member, startLine2, startColumn3, endColumn, i2, startColumn, startLine, startColumn2, this.DW.hasLeftSisterNode(i) ? this.DW.getEndLine(this.DW.getLeftSisterNode(i)) : this.DW.getStartLine(i), this.DW.hasLeftSisterNode(i) ? this.DW.getEndColumn(this.DW.getLeftSisterNode(i)) : this.DW.getStartColumn(i), this.DW.getEndLine(i), this.DW.getEndColumn(i));
                gW(this.DW.getChildNode(i, 1));
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = 4397411827645025401L)
        private void nw(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-779060889972301181L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!this.FH.canDeclareOtherSuperClasstypes() && !classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 128) {
                            this.j6.j6(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    this.FH.nw(classtype);
                    int childNode = this.DW.getChildNode(i, 4);
                    if (this.DW.getChildCount(childNode) == 0) {
                        try {
                            if (classtype != this.Hw.Eq(this.DW.getFile())) {
                                this.FH.declareSuperClasstype(classtype, this.Hw.Eq(this.DW.getFile()));
                            }
                        } catch (e4 unused) {
                        }
                    } else {
                        try {
                            this.FH.declareSuperClasstype(classtype, tp(this.DW.getChildNode(childNode, 1)));
                        } catch (e4 unused2) {
                            this.FH.J0(classtype);
                        }
                    }
                    int childNode2 = this.DW.getChildNode(i, 5);
                    int childCount = this.DW.getChildCount(childNode2);
                    for (int i2 = 1; i2 < childCount; i2 += 2) {
                        try {
                            this.FH.declareSuperClasstype(classtype, tp(this.DW.getChildNode(childNode2, i2)));
                        } catch (e4 unused3) {
                        }
                    }
                    this.FH.SI(classtype);
                    if (this.DW.getSyntaxTag(i) == 128) {
                        this.j6.j6(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.Zo(classtype);
                    vy(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                } catch (e4 unused4) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -779060889972301181L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1090818556278719768L)
        private void rN(ClassType classType, int i) throws Throwable {
            int startColumn;
            int startLine;
            int startColumn2;
            int i2;
            try {
                if (v5) {
                    try {
                        iy.EQ(-74751305308982636L, this, classType, new Integer(i));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.Mr(th, -74751305308982636L, this, classType, new Integer(i));
                        }
                        throw th;
                    }
                }
                int startLine2 = this.DW.getStartLine(this.DW.getChildNode(i, 4));
                int startColumn3 = this.DW.getStartColumn(this.DW.getChildNode(i, 4));
                int endColumn = this.DW.getEndColumn(this.DW.getChildNode(i, 4));
                int childNode = this.DW.getChildNode(i, 0);
                int iJ8 = J8(childNode);
                if (iJ8 != -1) {
                    int startLine3 = this.DW.getStartLine(iJ8);
                    startColumn = this.DW.getStartColumn(iJ8);
                    startLine = this.DW.getEndLine(iJ8);
                    i2 = startLine3;
                    startColumn2 = this.DW.getEndColumn(iJ8);
                } else {
                    int startLine4 = this.DW.getStartLine(childNode);
                    startColumn = this.DW.getStartColumn(childNode);
                    startLine = this.DW.getStartLine(childNode);
                    startColumn2 = this.DW.getStartColumn(childNode);
                    i2 = startLine4;
                }
                this.FH.EQ(classType, startLine2, startColumn3, endColumn, i2, startColumn, startLine, startColumn2, this.DW.hasLeftSisterNode(i) ? this.DW.getEndLine(this.DW.getLeftSisterNode(i)) : this.DW.getStartLine(i), this.DW.hasLeftSisterNode(i) ? this.DW.getEndColumn(this.DW.getLeftSisterNode(i)) : this.DW.getStartColumn(i), this.DW.getEndLine(i), this.DW.getEndColumn(i));
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = -316935035122202952L)
        private void ro(int i, ClassType classType) {
            try {
                if (v5) {
                    iy.EQ(-1247311511009544324L, this, new Integer(i), classType);
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (classType.hp(classtype)) {
                        dx(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 2));
                        this.j6.Zo(classtype);
                        if (classtype == classType) {
                            try {
                                if (this.DW.getChildCount(i) != 7) {
                                    Type typeWe = we(this.DW.getChildNode(i, 2));
                                    if (typeWe.isInterfaceType()) {
                                        this.FH.KD(classtype, this.Hw.Eq(this.DW.getFile()));
                                    }
                                    this.FH.KD(classtype, typeWe);
                                } else {
                                    this.FH.KD(classtype, this.Hw.Eq(this.DW.getFile()));
                                }
                            } catch (e4 unused) {
                            }
                        }
                        if (this.DW.getChildCount(i) == 7) {
                            dx(classType, this.DW.getChildNode(i, 0));
                        }
                        dx(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                        this.j6.er();
                    }
                } catch (e4 unused2) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -1247311511009544324L, this, new Integer(i), classType);
                }
                throw th;
            }
        }

        @ey(method = 1797675993496675144L)
        private void sh(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-424280099723261600L, this, classType, new Integer(i));
                }
                try {
                    ClassType classtype = this.FH.getClasstype(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i));
                    if (!classType.hp(classtype)) {
                        if (this.DW.getSyntaxTag(i) == 222) {
                            this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                            return;
                        }
                        return;
                    }
                    if (this.DW.getSyntaxTag(i) == 222) {
                        this.j6.DW(this.DW.getIdentifier(this.DW.getChildNode(i, 2)), classtype);
                    }
                    this.j6.EQ();
                    v5(this.DW.getChildNode(i, 3));
                    if (classtype == classType) {
                        int childNode = this.DW.getChildNode(i, 4);
                        if (this.DW.getChildCount(childNode) != 0) {
                            try {
                                this.FH.KD(classtype, we(this.DW.getChildNode(childNode, 1)));
                            } catch (e4 unused) {
                            }
                        } else if (classtype != this.Hw.Eq(this.DW.getFile())) {
                            this.FH.KD(classtype, this.Hw.Eq(this.DW.getFile()));
                        }
                        int childNode2 = this.DW.getChildNode(i, 5);
                        int childCount = this.DW.getChildCount(childNode2);
                        for (int i2 = 1; i2 < childCount; i2 += 2) {
                            try {
                                this.FH.KD(classtype, we(this.DW.getChildNode(childNode2, i2)));
                            } catch (e4 unused2) {
                            }
                        }
                    }
                    this.j6.Zo(classtype);
                    dx(classType, this.DW.getChildNode(i, this.DW.getChildCount(i) - 1));
                    this.j6.er();
                    this.j6.BT();
                } catch (e4 unused3) {
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -424280099723261600L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 228857100902795175L)
        private void sy(int i) {
            try {
                if (v5) {
                    iy.u7(8153173485050466709L, this, i);
                }
                rN(this.FH.sh(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i), this.j6.Ws(), 0, EQ(this.DW.getChildNode(i, 0)) | 33554432, this.DW.getIdentifier(this.DW.getChildNode(i, 4)), 0), i);
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 8153173485050466709L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 455733181239017136L)
        private ClassType tp(int i) {
            try {
                if (v5) {
                    iy.u7(-2754335424848965248L, this, i);
                }
                int identifier = this.DW.getIdentifier(this.DW.getChildNode(i, 0));
                int iMax = Math.max(0, (this.DW.getChildCount(this.DW.getChildNode(i, 1)) - 2) / 3);
                try {
                    Entity entityWe = this.j6.we(identifier, iMax);
                    int childCount = this.DW.getChildCount(i);
                    for (int i2 = 3; i2 < childCount; i2 += 3) {
                        int identifier2 = this.DW.getIdentifier(this.DW.getChildNode(i, i2));
                        this.DW.getChildNode(i, i2 + 1);
                        try {
                            entityWe = entityWe.isClassType() ? ((ClassType) entityWe).FN(identifier2, true, iMax, this.j6.J8(), this.DW.getFile(), this.DW.getLanguage()) : ((Namespace) entityWe).dx(this.DW.getFile(), this.DW.getLanguage(), identifier2, true, iMax, this.j6.Ws());
                        } catch (b4 unused) {
                            this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                            throw new e4();
                        } catch (e4 unused2) {
                            this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                            throw new e4();
                        }
                    }
                    if (entityWe.isClassType()) {
                        return (ClassType) entityWe;
                    }
                    this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                    throw new e4();
                } catch (b4 unused3) {
                    this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                    throw new e4();
                } catch (e4 unused4) {
                    this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                    throw new e4();
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -2754335424848965248L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 5369362125896099485L)
        private Type u7(int i) {
            int i2;
            Entity entityX9;
            try {
                if (v5) {
                    iy.u7(804972838065738195L, this, i);
                }
                try {
                    try {
                        Entity entityEt = et(this.j6.XL(this.DW.getIdentifier(this.DW.getChildNode(i, 0)), Math.max(0, (this.DW.getChildCount(this.DW.getChildNode(i, 1)) - 2) / 3)), this.DW.getChildNode(i, 1));
                        int childCount = this.DW.getChildCount(i);
                        for (int i3 = 3; i3 < childCount; i3 += 3) {
                            int identifier = this.DW.getIdentifier(this.DW.getChildNode(i, i3));
                            int i4 = i3 + 1;
                            int iMax = Math.max(0, (this.DW.getChildCount(this.DW.getChildNode(i, i4)) - 2) / 3);
                            try {
                                if (entityEt.isNamespace()) {
                                    i2 = i4;
                                    entityX9 = ((Namespace) entityEt).dx(this.DW.getFile(), this.DW.getLanguage(), identifier, true, iMax, this.j6.Ws());
                                } else {
                                    i2 = i4;
                                    Type typeEf = ((Type) entityEt).ef(identifier, true, iMax, this.j6.J8(), this.DW.getFile(), this.DW.getLanguage());
                                    entityX9 = (iMax == 0 && ((Type) entityEt).isClassType() && ((ClassType) entityEt).Pa() > 0) ? typeEf.x9() : typeEf;
                                }
                                entityEt = et(entityX9, this.DW.getChildNode(i, i2));
                            } catch (b4 unused) {
                                this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                                throw new e4();
                            } catch (e4 unused2) {
                                this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                                throw new e4();
                            }
                        }
                        if (!entityEt.isNamespace()) {
                            return (Type) entityEt;
                        }
                        this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                        throw new e4();
                    } catch (b4 unused3) {
                        this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                        throw new e4();
                    }
                } catch (e4 unused4) {
                    this.FH.aM(this.DW.getFile(), this.DW.getLanguage());
                    throw new e4();
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 804972838065738195L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -729818562056474557L)
        private void v5(int i) {
            try {
                if (v5) {
                    iy.u7(-89491892699568615L, this, i);
                }
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 1; i2 < childCount; i2 += 2) {
                    int childNode = this.DW.getChildNode(i, i2);
                    int identifier = this.DW.getIdentifier(this.DW.getChildNode(childNode, 0));
                    try {
                        this.j6.FH(identifier, this.FH.w9(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(childNode)));
                    } catch (e4 unused) {
                    }
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -89491892699568615L, this, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[Catch: all -> 0x011c, TryCatch #0 {all -> 0x011c, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0030, B:13:0x003f, B:15:0x0043, B:17:0x0047, B:18:0x0049, B:24:0x0068, B:28:0x00a8, B:30:0x00bc, B:34:0x00e2, B:33:0x00d8, B:35:0x0104, B:23:0x0063, B:10:0x0032), top: B:44:0x0009 }] */
        @abcd.ey(method = -708583376865541311L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void vJ(int r28) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaSignatureAnalyzer.a.vJ(int):void");
        }

        @ey(method = -2460669699637781760L)
        private void vy(ClassType classType, int i) {
            try {
                if (v5) {
                    iy.EQ(-472064890402959308L, this, classType, new Integer(i));
                }
                int syntaxTag = this.DW.getSyntaxTag(i);
                if (syntaxTag != 120) {
                    if (syntaxTag != 121) {
                        int i2 = 0;
                        if (syntaxTag != 123 && syntaxTag != 124) {
                            if (syntaxTag == 133) {
                                this.j6.v5();
                                int childCount = this.DW.getChildCount(i);
                                while (i2 < childCount) {
                                    vy(classType, this.DW.getChildNode(i, i2));
                                    i2++;
                                }
                                this.j6.rN();
                                return;
                            }
                            if (syntaxTag == 177) {
                                ei(i, classType);
                                return;
                            }
                            if (syntaxTag != 227) {
                                if (syntaxTag != 228) {
                                    switch (syntaxTag) {
                                        case 126:
                                        case 127:
                                            break;
                                        case 128:
                                            break;
                                        case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                            break;
                                        default:
                                            switch (syntaxTag) {
                                                case 220:
                                                case 221:
                                                case 222:
                                                    SI(classType, i);
                                                    return;
                                                case 223:
                                                    VH(this.DW.getChildNode(i, 0));
                                                    int childCount2 = this.DW.getChildCount(i);
                                                    for (int i3 = 1; i3 < childCount2; i3++) {
                                                        XG(this.DW.getChildNode(i, i3));
                                                    }
                                                    Zo(i);
                                                    for (int i4 = 1; i4 < childCount2; i4++) {
                                                        int childNode = this.DW.getChildNode(i, i4);
                                                        if (this.DW.getSyntaxTag(childNode) == 120 || this.DW.getSyntaxTag(childNode) == 220 || this.DW.getSyntaxTag(childNode) == 121) {
                                                            vy(classType, this.DW.getChildNode(i, i4));
                                                        }
                                                    }
                                                    return;
                                                default:
                                                    int childCount3 = this.DW.getChildCount(i);
                                                    while (i2 < childCount3) {
                                                        vy(classType, this.DW.getChildNode(i, i2));
                                                        i2++;
                                                    }
                                                    return;
                                            }
                                    }
                                }
                            }
                        }
                        this.j6.u7();
                        int childCount4 = this.DW.getChildCount(i);
                        while (i2 < childCount4) {
                            vy(classType, this.DW.getChildNode(i, i2));
                            i2++;
                        }
                        this.j6.gW();
                        return;
                    }
                    KD(classType, i);
                    return;
                }
                nw(classType, i);
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -472064890402959308L, this, classType, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2687572438967835717L)
        private void wc(int i) {
            try {
                if (v5) {
                    iy.u7(3176811033249796257L, this, i);
                }
                Entity entityNw = this.Hw.nw();
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 2; i2 < childCount - 2; i2 += 2) {
                    int identifier = this.DW.getIdentifier(this.DW.getChildNode(i, i2));
                    try {
                        entityNw = entityNw.isClassType() ? ((ClassType) entityNw).FN(identifier, true, 0, this.j6.Ws(), this.DW.getFile(), this.DW.getLanguage()) : ((Namespace) entityNw).dx(this.DW.getFile(), this.DW.getLanguage(), identifier, true, 0, (Namespace) entityNw);
                    } catch (b4 | e4 unused) {
                        return;
                    }
                }
                if (entityNw.isClassType()) {
                    this.j6.U2((ClassType) entityNw);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 3176811033249796257L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1177441604008577635L)
        private Type we(int i) {
            try {
                if (v5) {
                    iy.u7(47850241039732219L, this, i);
                }
                int syntaxTag = this.DW.getSyntaxTag(this.DW.getChildNode(i, 0));
                return syntaxTag != 57 ? syntaxTag != 60 ? syntaxTag != 62 ? syntaxTag != 65 ? syntaxTag != 69 ? syntaxTag != 81 ? syntaxTag != 89 ? syntaxTag != 114 ? syntaxTag != 76 ? syntaxTag != 77 ? u7(i) : this.Hw.jO() : this.Hw.KD() : this.Hw.ko() : this.Hw.gW() : this.Hw.SI() : this.Hw.WB() : this.Hw.CU() : this.Hw.vy() : this.Hw.BT() : this.Hw.ro();
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 47850241039732219L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 5537865865212400752L)
        private void x9(int i) {
            try {
                if (v5) {
                    iy.u7(4151675423452818712L, this, i);
                }
                rN(this.FH.a8(this.DW.getFile(), this.DW.getLanguage(), this.DW.getDeclarationNumber(i), this.j6.Ws(), 0, this.j6.J0(), EQ(this.DW.getChildNode(i, 0)) | 33554432, this.DW.getIdentifier(this.DW.getChildNode(i, 4)), 0), i);
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 4151675423452818712L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1524356277484583171L)
        private void yO(int i) {
            try {
                if (v5) {
                    iy.u7(-768923513637048525L, this, i);
                }
                Entity entityNw = this.Hw.nw();
                int childCount = this.DW.getChildCount(i);
                for (int i2 = 1; i2 < childCount - 2; i2 += 2) {
                    int identifier = this.DW.getIdentifier(this.DW.getChildNode(i, i2));
                    try {
                        entityNw = entityNw.isClassType() ? ((ClassType) entityNw).FN(identifier, true, 0, this.j6.Ws(), this.DW.getFile(), this.DW.getLanguage()) : ((Namespace) entityNw).dx(this.DW.getFile(), this.DW.getLanguage(), identifier, true, 0, (Namespace) entityNw);
                    } catch (b4 | e4 unused) {
                        return;
                    }
                }
                if (entityNw.isClassType()) {
                    this.j6.j3((ClassType) entityNw);
                } else {
                    this.j6.Mr((Namespace) entityNw);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -768923513637048525L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 286075449003289852L)
        private void yS(Member member, int i) throws Throwable {
            int startColumn;
            int startLine;
            int startColumn2;
            int i2;
            try {
                if (v5) {
                    try {
                        iy.EQ(5816761043033788808L, this, member, new Integer(i));
                    } catch (Throwable th) {
                        th = th;
                        if (Zo) {
                            iy.Mr(th, 5816761043033788808L, this, member, new Integer(i));
                        }
                        throw th;
                    }
                }
                int startLine2 = this.DW.getStartLine(this.DW.getChildNode(i, 4));
                int startColumn3 = this.DW.getStartColumn(this.DW.getChildNode(i, 4));
                int endColumn = this.DW.getEndColumn(this.DW.getChildNode(i, 4));
                int childNode = this.DW.getChildNode(i, 0);
                int iJ8 = J8(childNode);
                if (iJ8 != -1) {
                    int startLine3 = this.DW.getStartLine(iJ8);
                    startColumn = this.DW.getStartColumn(iJ8);
                    startLine = this.DW.getEndLine(iJ8);
                    i2 = startLine3;
                    startColumn2 = this.DW.getEndColumn(iJ8);
                } else {
                    int startLine4 = this.DW.getStartLine(childNode);
                    startColumn = this.DW.getStartColumn(childNode);
                    startLine = this.DW.getStartLine(childNode);
                    startColumn2 = this.DW.getStartColumn(childNode);
                    i2 = startLine4;
                }
                this.FH.lg(member, startLine2, startColumn3, endColumn, i2, startColumn, startLine, startColumn2, this.DW.hasLeftSisterNode(i) ? this.DW.getEndLine(this.DW.getLeftSisterNode(i)) : this.DW.getStartLine(i), this.DW.hasLeftSisterNode(i) ? this.DW.getEndColumn(this.DW.getLeftSisterNode(i)) : this.DW.getStartColumn(i), this.DW.getEndLine(i), this.DW.getEndColumn(i));
                gW(this.DW.getChildNode(i, 1));
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @ey(method = -1787677810218567057L)
        public void Mr(EntitySpace entitySpace, SyntaxTree syntaxTree) {
            try {
                if (v5) {
                    iy.EQ(2326563601193078317L, this, entitySpace, syntaxTree);
                }
                this.FH = entitySpace;
                this.DW = syntaxTree;
                j3(syntaxTree.getRootNode());
                this.DW = null;
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 2326563601193078317L, this, entitySpace, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = -7579246400169885045L)
        public void P8(EntitySpace entitySpace, JavaTypeSystem javaTypeSystem, ClassType classType, SyntaxTree syntaxTree) {
            try {
                if (v5) {
                    iy.J0(5034023988659469873L, this, entitySpace, javaTypeSystem, classType, syntaxTree);
                }
                this.FH = entitySpace;
                this.DW = syntaxTree;
                this.Hw = javaTypeSystem;
                this.j6.gn();
                if (syntaxTree.getRootNode() != -1) {
                    vy(classType, syntaxTree.getRootNode());
                }
                this.DW = null;
                this.j6.gn();
            } catch (Throwable th) {
                if (Zo) {
                    iy.a8(th, 5034023988659469873L, this, entitySpace, javaTypeSystem, classType, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = 1487780448067540809L)
        public void Sf(EntitySpace entitySpace, JavaTypeSystem javaTypeSystem, SyntaxTree syntaxTree) {
            try {
                if (v5) {
                    iy.we(4386492536778310983L, this, entitySpace, javaTypeSystem, syntaxTree);
                }
                this.FH = entitySpace;
                this.DW = syntaxTree;
                this.Hw = javaTypeSystem;
                this.j6.gn();
                if (!syntaxTree.isEmpty()) {
                    ef(syntaxTree.getRootNode());
                }
                this.DW = null;
                this.j6.gn();
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, 4386492536778310983L, this, entitySpace, javaTypeSystem, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = 829797919211474080L)
        public void aM(EntitySpace entitySpace, JavaTypeSystem javaTypeSystem, ClassType classType, SyntaxTree syntaxTree) {
            try {
                if (v5) {
                    iy.J0(-1177701099137549772L, this, entitySpace, javaTypeSystem, classType, syntaxTree);
                }
                this.FH = entitySpace;
                this.DW = syntaxTree;
                this.Hw = javaTypeSystem;
                this.j6.gn();
                if (!syntaxTree.isEmpty()) {
                    XL(classType, syntaxTree.getRootNode());
                }
                this.DW = null;
                this.j6.gn();
            } catch (Throwable th) {
                if (Zo) {
                    iy.a8(th, -1177701099137549772L, this, entitySpace, javaTypeSystem, classType, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = -2251432763554434361L)
        public void lp(EntitySpace entitySpace, JavaTypeSystem javaTypeSystem, SyntaxTree syntaxTree) {
            try {
                if (v5) {
                    iy.we(-684058785770853203L, this, entitySpace, javaTypeSystem, syntaxTree);
                }
                this.FH = entitySpace;
                this.Hw = javaTypeSystem;
                this.DW = syntaxTree;
                this.j6.gn();
                if (!syntaxTree.isEmpty()) {
                    aj(syntaxTree.getRootNode());
                }
                this.DW = null;
                this.j6.gn();
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, -684058785770853203L, this, entitySpace, javaTypeSystem, syntaxTree);
                }
                throw th;
            }
        }

        @ey(method = 1032972464535263593L)
        public void sG(EntitySpace entitySpace, JavaTypeSystem javaTypeSystem, ClassType classType, SyntaxTree syntaxTree) {
            try {
                if (v5) {
                    iy.J0(-1085234276896454097L, this, entitySpace, javaTypeSystem, classType, syntaxTree);
                }
                this.FH = entitySpace;
                this.DW = syntaxTree;
                this.Hw = javaTypeSystem;
                this.j6.gn();
                dx(classType, syntaxTree.getRootNode());
                this.DW = null;
                this.j6.gn();
            } catch (Throwable th) {
                if (Zo) {
                    iy.a8(th, -1085234276896454097L, this, entitySpace, javaTypeSystem, classType, syntaxTree);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(JavaSignatureAnalyzer.class);
            if (EQ) {
                iy.gn(842171544878327776L, null);
            }
            gn = new CRC32();
            u7 = new byte[1024];
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 842171544878327776L, null);
            }
            throw th;
        }
    }

    @ey(method = 2078347577304640L)
    public JavaSignatureAnalyzer(Model model, JavaLanguage javaLanguage) {
        try {
            if (EQ) {
                iy.EQ(56891630768605137L, null, model, javaLanguage);
            }
            this.VH = new Stack<>();
            this.j6 = model;
            this.v5 = model.entitySpace;
            FileSpace fileSpace = model.fileSpace;
            IdentifierSpace identifierSpace = model.identifierSpace;
            this.FH = model.syntaxTreeSpace;
            this.Hw = javaLanguage.getTypeSystem();
            this.DW = javaLanguage.getCodeAnalyzer();
            this.Zo = javaLanguage;
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 56891630768605137L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = -2145134705998607739L)
    private long Mr() {
        try {
            if (EQ) {
                iy.gn(-2171154221229601664L, this);
            }
            QX();
            return gn.getValue();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -2171154221229601664L, this);
            }
            throw th;
        }
    }

    @ey(method = 2685905680251000941L)
    private static void QX() {
        try {
            if (EQ) {
                iy.gn(843551488984873900L, null);
            }
            gn.update(u7, 0, tp);
            tp = 0;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 843551488984873900L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055 A[Catch: all -> 0x016b, TryCatch #0 {all -> 0x016b, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:29:0x004b, B:48:0x015a, B:50:0x0160, B:31:0x0050, B:32:0x0055, B:34:0x005f, B:36:0x0093, B:38:0x0099, B:40:0x00a3, B:41:0x00af, B:43:0x00b9, B:44:0x00fb, B:46:0x0105, B:47:0x0129), top: B:60:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x016b, TryCatch #0 {all -> 0x016b, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:29:0x004b, B:48:0x015a, B:50:0x0160, B:31:0x0050, B:32:0x0055, B:34:0x005f, B:36:0x0093, B:38:0x0099, B:40:0x00a3, B:41:0x00af, B:43:0x00b9, B:44:0x00fb, B:46:0x0105, B:47:0x0129), top: B:60:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129 A[Catch: all -> 0x016b, TryCatch #0 {all -> 0x016b, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:29:0x004b, B:48:0x015a, B:50:0x0160, B:31:0x0050, B:32:0x0055, B:34:0x005f, B:36:0x0093, B:38:0x0099, B:40:0x00a3, B:41:0x00af, B:43:0x00b9, B:44:0x00fb, B:46:0x0105, B:47:0x0129), top: B:60:0x0000 }] */
    @abcd.ey(method = 660680414789091496L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void U2(com.aide.codemodel.api.SyntaxTree r9, int r10) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaSignatureAnalyzer.U2(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = -330686844717815760L)
    private boolean Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (EQ) {
                iy.EQ(-711620779735990305L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i))));
            if (syntaxTag != 121 && syntaxTag != 228) {
                int childCount = syntaxTree.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i2)) == 94) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, -711620779735990305L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:30:0x007e, B:32:0x0084, B:26:0x003f, B:27:0x0043, B:29:0x0048), top: B:42:0x0000 }] */
    @abcd.ey(method = -267454393895411069L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void XL(com.aide.codemodel.api.SyntaxTree r8, int r9) {
        /*
            r7 = this;
            boolean r0 = com.aide.codemodel.language.java.JavaSignatureAnalyzer.EQ     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L11
            r0 = -1911518324843404464(0xe578ec36120f2350, double:-6.463570742515529E180)
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L8f
            abcd.iy.EQ(r0, r7, r8, r2)     // Catch: java.lang.Throwable -> L8f
        L11:
            int r0 = r8.getSyntaxTag(r9)     // Catch: java.lang.Throwable -> L8f
            r1 = 120(0x78, float:1.68E-43)
            r2 = 0
            if (r0 == r1) goto L48
            r1 = 121(0x79, float:1.7E-43)
            if (r0 == r1) goto L48
            r1 = 133(0x85, float:1.86E-43)
            if (r0 == r1) goto L47
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 == r1) goto L43
            r1 = 220(0xdc, float:3.08E-43)
            if (r0 == r1) goto L48
            r1 = 221(0xdd, float:3.1E-43)
            if (r0 == r1) goto L48
            r1 = 227(0xe3, float:3.18E-43)
            if (r0 == r1) goto L48
            r1 = 228(0xe4, float:3.2E-43)
            if (r0 == r1) goto L48
            r1 = 245(0xf5, float:3.43E-43)
            if (r0 == r1) goto L3f
            r1 = 246(0xf6, float:3.45E-43)
            if (r0 == r1) goto L3f
            goto L7e
        L3f:
            r7.aM(r8, r9)     // Catch: java.lang.Throwable -> L8f
            goto L7e
        L43:
            r7.aM(r8, r9)     // Catch: java.lang.Throwable -> L8f
            goto L7e
        L47:
            return
        L48:
            int r0 = r8.getChildNode(r9, r2)     // Catch: java.lang.Throwable -> L8f
            r7.aM(r8, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 1
            int r0 = r8.getChildNode(r9, r0)     // Catch: java.lang.Throwable -> L8f
            r7.aM(r8, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 2
            int r0 = r8.getChildNode(r9, r0)     // Catch: java.lang.Throwable -> L8f
            r7.aM(r8, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 3
            int r0 = r8.getChildNode(r9, r0)     // Catch: java.lang.Throwable -> L8f
            r7.aM(r8, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 4
            int r0 = r8.getChildNode(r9, r0)     // Catch: java.lang.Throwable -> L8f
            r7.aM(r8, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 5
            int r0 = r8.getChildNode(r9, r0)     // Catch: java.lang.Throwable -> L8f
            r7.aM(r8, r0)     // Catch: java.lang.Throwable -> L8f
            int r0 = r8.getDeclarationNumber(r9)     // Catch: java.lang.Throwable -> L8f
            yS(r0)     // Catch: java.lang.Throwable -> L8f
        L7e:
            int r0 = r8.getChildCount(r9)     // Catch: java.lang.Throwable -> L8f
        L82:
            if (r2 >= r0) goto L8e
            int r1 = r8.getChildNode(r9, r2)     // Catch: java.lang.Throwable -> L8f
            r7.XL(r8, r1)     // Catch: java.lang.Throwable -> L8f
            int r2 = r2 + 1
            goto L82
        L8e:
            return
        L8f:
            r0 = move-exception
            boolean r1 = com.aide.codemodel.language.java.JavaSignatureAnalyzer.we
            if (r1 == 0) goto La4
            r2 = -1911518324843404464(0xe578ec36120f2350, double:-6.463570742515529E180)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r1 = r0
            r4 = r7
            r5 = r8
            abcd.iy.Mr(r1, r2, r4, r5, r6)
        La4:
            goto La6
        La5:
            throw r0
        La6:
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaSignatureAnalyzer.XL(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = -1356369473049388165L)
    private a a8() {
        try {
            if (EQ) {
                iy.gn(-2576369147761420224L, this);
            }
            return this.VH.empty() ? new a(this, this.v5) : this.VH.pop();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -2576369147761420224L, this);
            }
            throw th;
        }
    }

    @ey(method = 980174154058728784L)
    private void aM(SyntaxTree syntaxTree, int i) {
        try {
            if (EQ) {
                iy.EQ(2686635156343683083L, this, syntaxTree, new Integer(i));
            }
            yS(syntaxTree.getChildCount(i));
            yS(syntaxTree.getSyntaxTag(i));
            switch (syntaxTree.getSyntaxTag(i)) {
                case 1:
                    yS(syntaxTree.getIdentifier(i));
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case UserTouchAction.CLICK_KIND /* 7 */:
                    int literalOff = syntaxTree.getLiteralOff(i);
                    int literalLen = syntaxTree.getLiteralLen(i);
                    char[] literalChars = syntaxTree.getLiteralChars(i);
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < literalLen) {
                        i3 = (i3 * 31) + literalChars[literalOff];
                        i2++;
                        literalOff++;
                    }
                    yS(i3);
                    break;
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                aM(syntaxTree, syntaxTree.getChildNode(i, i4));
            }
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 2686635156343683083L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010a A[Catch: all -> 0x013c, FALL_THROUGH, TRY_LEAVE, TryCatch #0 {all -> 0x013c, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0011, B:7:0x0019, B:8:0x0023, B:30:0x0058, B:31:0x005b, B:32:0x005e, B:34:0x0063, B:35:0x0068, B:36:0x006d, B:37:0x0072, B:38:0x0077, B:39:0x0083, B:40:0x008c, B:42:0x0093, B:43:0x009d, B:44:0x00df, B:45:0x010a), top: B:54:0x0000 }] */
    @abcd.ey(method = -4121390872480991995L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j3(com.aide.codemodel.api.SyntaxTree r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaSignatureAnalyzer.j3(com.aide.codemodel.api.SyntaxTree, int):void");
    }

    @ey(method = -2863733226073055525L)
    private static void lg() {
        try {
            if (EQ) {
                iy.gn(-3763851575571445280L, null);
            }
            gn.reset();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -3763851575571445280L, null);
            }
            throw th;
        }
    }

    @ey(method = 899126569392754068L)
    private void rN(a aVar) {
        try {
            if (EQ) {
                iy.tp(2739063344457800115L, this, aVar);
            }
            this.VH.push(aVar);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 2739063344457800115L, this, aVar);
            }
            throw th;
        }
    }

    @ey(method = -3556833240754319617L)
    private static void yS(int i) {
        try {
            if (EQ) {
                iy.u7(-1434048426280991056L, null, i);
            }
            if (tp + 4 > u7.length) {
                QX();
            }
            byte[] bArr = u7;
            int i2 = tp;
            int i3 = i2 + 1;
            tp = i3;
            bArr[i2] = (byte) (i & 255);
            byte[] bArr2 = u7;
            int i4 = i3 + 1;
            tp = i4;
            bArr2[i3] = (byte) ((i >> 8) & 255);
            byte[] bArr3 = u7;
            int i5 = i4 + 1;
            tp = i5;
            bArr3[i4] = (byte) ((i >> 16) & 255);
            byte[] bArr4 = u7;
            tp = i5 + 1;
            bArr4[i5] = (byte) ((i >> 24) & 255);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -1434048426280991056L, null, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 1060145382708687425L)
    public void DW(ClassType classType) {
        try {
            if (EQ) {
                iy.tp(-5445695198898456624L, this, classType);
            }
            SyntaxTree syntaxTree = this.FH.getSyntaxTree(classType.getFile(), this.Zo);
            a aVarA8 = a8();
            aVarA8.P8(this.v5, this.Hw, classType, syntaxTree);
            rN(aVarA8);
            this.FH.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -5445695198898456624L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -4189858313409367433L)
    public void EQ(ClassType classType) {
        try {
            if (EQ) {
                iy.tp(-683810120140564024L, this, classType);
            }
            SyntaxTree syntaxTree = this.FH.getSyntaxTree(classType.getFile(), this.Zo);
            a aVarA8 = a8();
            aVarA8.sG(this.v5, this.Hw, classType, syntaxTree);
            rN(aVarA8);
            this.FH.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -683810120140564024L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 4162423179206297064L)
    public void Hw(ClassType classType) {
        try {
            if (EQ) {
                iy.tp(-4655051014851320217L, this, classType);
            }
            SyntaxTree syntaxTree = this.FH.getSyntaxTree(classType.getFile(), this.Zo);
            a aVarA8 = a8();
            aVarA8.aM(this.v5, this.Hw, classType, syntaxTree);
            rN(aVarA8);
            this.FH.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -4655051014851320217L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -1131848723647457677L)
    public void Zo(Member member) {
        try {
            if (EQ) {
                iy.tp(2019061614440644596L, this, member);
            }
            this.DW.U2(member);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 2019061614440644596L, this, member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 5587633183183888347L)
    public void doLoadPositions(FileEntry fileEntry) {
        try {
            if (EQ) {
                iy.tp(-3593085983955051888L, this, fileEntry);
            }
            SyntaxTree syntaxTree = this.FH.getSyntaxTree(fileEntry, this.Zo);
            a aVarA8 = a8();
            aVarA8.Mr(this.v5, syntaxTree);
            rN(aVarA8);
            this.FH.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -3593085983955051888L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -3542114022804453876L)
    public void doLoadSuperClassTypes(ClassType classType) {
        try {
            if (EQ) {
                iy.tp(4653424439260335725L, this, classType);
            }
            this.v5.nw(classType);
            try {
                if (classType != this.Hw.Eq(classType.getFile())) {
                    this.v5.declareSuperClasstype(classType, this.Hw.Eq(classType.getFile()));
                }
            } catch (e4 unused) {
            }
            this.v5.SI(classType);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 4653424439260335725L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 3956515968685624080L)
    public void doLoadSyntax(FileEntry fileEntry) {
        try {
            if (EQ) {
                iy.tp(-1744781023444055513L, this, fileEntry);
            }
            SyntaxTree syntaxTreeV5 = this.FH.v5(fileEntry, this.Zo);
            a aVarA8 = a8();
            aVarA8.Sf(this.v5, this.Hw, syntaxTreeV5);
            rN(aVarA8);
            this.FH.releaseSyntaxTree(syntaxTreeV5);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -1744781023444055513L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 62480491390539936L)
    public void doLoadTypes(FileEntry fileEntry) {
        try {
            if (EQ) {
                iy.tp(714235778262435451L, this, fileEntry);
            }
            SyntaxTree syntaxTree = this.FH.getSyntaxTree(fileEntry, this.Zo);
            a aVarA8 = a8();
            aVarA8.lp(this.v5, this.Hw, syntaxTree);
            rN(aVarA8);
            this.FH.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 714235778262435451L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -3356529656004999120L)
    public void er() {
        try {
            if (EQ) {
                iy.gn(1928514329923619277L, this);
            }
            this.VH = new Stack<>();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 1928514329923619277L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 3229252412309463400L)
    public long getClassDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (EQ) {
                iy.tp(23406198400240465L, this, syntaxTree);
            }
            lg();
            XL(syntaxTree, syntaxTree.getRootNode());
            return Mr();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 23406198400240465L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 466903937388840732L)
    public long getDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (EQ) {
                iy.tp(-6547349728265042763L, this, syntaxTree);
            }
            lg();
            j3(syntaxTree, syntaxTree.getRootNode());
            return Mr();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -6547349728265042763L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 5150927088183562229L)
    public long getPublicDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (EQ) {
                iy.tp(2107901572044249500L, this, syntaxTree);
            }
            lg();
            U2(syntaxTree, syntaxTree.getRootNode());
            return Mr();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 2107901572044249500L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -356988864379610772L)
    public long j6(SyntaxTree syntaxTree) {
        try {
            if (!EQ) {
                return 0L;
            }
            iy.tp(-8448603628585543683L, this, syntaxTree);
            return 0L;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -8448603628585543683L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -4771438434621509677L)
    public void tp(FileEntry fileEntry) {
        try {
            if (EQ) {
                iy.tp(-607707095180050892L, this, fileEntry);
            }
            if (this.v5.VH(fileEntry, this.Zo)) {
                doLoadSyntax(fileEntry);
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -607707095180050892L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -108611483497152805L)
    public void v5(SyntaxTree syntaxTree) {
        try {
            if (EQ) {
                iy.tp(4647448810390954624L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 4647448810390954624L, this, syntaxTree);
            }
            throw th;
        }
    }
}
