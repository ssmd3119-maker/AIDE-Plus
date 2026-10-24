package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.RelationOfIntInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 101802890610665856L, container = 101802890610665856L, user = true)
/* loaded from: classes.dex */
public class s1 {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -1367849587811187653L)
    private b DW;

    @dy(field = 401828265994081159L)
    private c FH;

    @dy(field = -7470625374628945225L)
    private HashtableOfInt<a> Hw;

    @dy(field = 1001622059578241481L)
    private final Model j6;

    @cy(clazz = -2888708063783046120L, container = -2888708063783046120L, user = true)
    private static class a {

        @gy
        private static /* synthetic */ boolean J0;

        @fy
        private static /* synthetic */ boolean we;

        @dy(field = -1510379644435624080L)
        private long DW;

        @dy(field = -2785544451656295615L)
        private MapOfInt<Member> EQ;

        @dy(field = 2063564155335993808L)
        private int[] FH;

        @dy(field = -1403845668358985845L)
        private int Hw;

        @dy(field = 2793732541146292464L)
        private FunctionOfIntInt VH;

        @dy(field = 2211964522326859572L)
        private FunctionOfIntInt Zo;

        @dy(field = 7080896478577518840L)
        private MapOfIntInt gn;

        @dy(field = 2369680599212789765L)
        private final Model j6;

        @dy(field = 142639896305096824L)
        private FunctionOfIntInt tp;

        @dy(field = 2225157441947515771L)
        private RelationOfIntInt u7;

        @dy(field = -3268872129597712140L)
        private FunctionOfIntInt v5;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -35414653998701640L)
        public a(Model model) {
            try {
                if (we) {
                    iy.tp(-4688966963115024211L, null, model);
                }
                this.FH = new int[1000];
                this.Hw = 0;
                this.v5 = new FunctionOfIntInt();
                this.Zo = new FunctionOfIntInt();
                this.VH = new FunctionOfIntInt();
                this.gn = new MapOfIntInt();
                this.u7 = new RelationOfIntInt();
                this.tp = new FunctionOfIntInt();
                this.j6 = model;
                this.EQ = new MapOfInt<>(model.entitySpace);
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -4688966963115024211L, null, model);
                }
                throw th;
            }
        }

        @ey(method = -1931073929764691511L)
        public void DW(int i, int i2, int i3, boolean z, Member member, int i4) {
            try {
                if (we) {
                    iy.QX(-825789784566415680L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), member, new Integer(i4)});
                }
                int i5 = this.Hw + 5;
                if (i5 >= this.FH.length) {
                    int[] iArr = new int[Math.max(this.FH.length * 2, i5)];
                    System.arraycopy(this.FH, 0, iArr, 0, this.FH.length);
                    this.FH = iArr;
                }
                this.v5.Zo(i, this.Hw);
                int[] iArr2 = this.FH;
                int i6 = this.Hw;
                int i7 = i6 + 1;
                this.Hw = i7;
                iArr2[i6] = i3;
                int[] iArr3 = this.FH;
                int i8 = i7 + 1;
                this.Hw = i8;
                iArr3[i7] = i2;
                int[] iArr4 = this.FH;
                this.Hw = i8 + 1;
                iArr4[i8] = z ? 1 : 0;
                int[] iArr5 = this.FH;
                int i9 = this.Hw;
                this.Hw = i9 + 1;
                iArr5[i9] = member == null ? 0 : member.getId();
                int[] iArr6 = this.FH;
                int i10 = this.Hw;
                this.Hw = i10 + 1;
                iArr6[i10] = i4;
                this.gn.gn(i4, i);
            } catch (Throwable th) {
                if (J0) {
                    iy.rN(th, -825789784566415680L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), member, new Integer(i4)});
                }
                throw th;
            }
        }

        @ey(method = -767555116252760968L)
        public int EQ(int i) {
            try {
                if (we) {
                    iy.u7(1482156673060184589L, this, i);
                }
                return this.FH[this.v5.get(i) + 4];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, 1482156673060184589L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2633673944687662120L)
        public void FH(int i, int i2, ListOfInt listOfInt, int i3) {
            try {
                if (we) {
                    iy.J0(-3745072715295731085L, this, new Integer(i), new Integer(i2), listOfInt, new Integer(i3));
                }
                int size = this.Hw + 3 + listOfInt.size();
                if (size >= this.FH.length) {
                    int[] iArr = new int[Math.max(this.FH.length * 2, size)];
                    System.arraycopy(this.FH, 0, iArr, 0, this.FH.length);
                    this.FH = iArr;
                }
                this.VH.Zo(i, this.Hw);
                int[] iArr2 = this.FH;
                int i4 = this.Hw;
                int i5 = i4 + 1;
                this.Hw = i5;
                iArr2[i4] = i2;
                int[] iArr3 = this.FH;
                int i6 = i5 + 1;
                this.Hw = i6;
                iArr3[i5] = i3;
                int[] iArr4 = this.FH;
                this.Hw = i6 + 1;
                iArr4[i6] = listOfInt.size();
                for (int i7 = 0; i7 < listOfInt.size(); i7++) {
                    int[] iArr5 = this.FH;
                    int i8 = this.Hw;
                    this.Hw = i8 + 1;
                    iArr5[i8] = listOfInt.get(i7);
                    this.gn.gn(listOfInt.get(i7), i);
                }
                if (i2 != -1) {
                    this.gn.gn(i2, i);
                }
            } catch (Throwable th) {
                if (J0) {
                    iy.a8(th, -3745072715295731085L, this, new Integer(i), new Integer(i2), listOfInt, new Integer(i3));
                }
                throw th;
            }
        }

        @ey(method = 5023656808399681203L)
        public void Hw(int i, int i2) {
            try {
                if (we) {
                    iy.EQ(-1658327652449559936L, this, new Integer(i), new Integer(i2));
                }
                if (i == -1 || i2 == -1) {
                    return;
                }
                this.u7.Hw(i, i2);
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, -1658327652449559936L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -1046126323390184685L)
        public int J0(int i) {
            try {
                if (we) {
                    iy.u7(186888142597049400L, this, i);
                }
                return this.FH[this.VH.get(i) + 2];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, 186888142597049400L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -96723445229696596L)
        public int J8(int i) {
            try {
                if (we) {
                    iy.u7(130659669482051703L, this, i);
                }
                return this.FH[this.VH.get(i)];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, 130659669482051703L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -6452810618316574549L)
        public int Mr(int i, int i2) {
            try {
                if (we) {
                    iy.EQ(1494818715955866720L, this, new Integer(i), new Integer(i2));
                }
                return this.FH[this.Zo.get(i) + 3 + i2];
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 1494818715955866720L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 3150538062992815920L)
        public RelationOfIntInt QX() {
            try {
                if (we) {
                    iy.gn(-3525530112185377023L, this);
                }
                return this.u7;
            } catch (Throwable th) {
                if (J0) {
                    iy.aM(th, -3525530112185377023L, this);
                }
                throw th;
            }
        }

        @ey(method = 333245584145143509L)
        public int U2(int i) {
            try {
                if (we) {
                    iy.u7(-211555407576106728L, this, i);
                }
                return this.FH[this.Zo.get(i) + 1];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -211555407576106728L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -174564948475501875L)
        public void VH(int i, Member member) {
            try {
                if (we) {
                    iy.EQ(-5643020369349424980L, this, new Integer(i), member);
                }
                this.EQ.we(i, member);
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, -5643020369349424980L, this, new Integer(i), member);
                }
                throw th;
            }
        }

        @ey(method = 341029351319294016L)
        public int Ws(int i) {
            try {
                if (we) {
                    iy.u7(-218527565656562187L, this, i);
                }
                return this.FH[this.VH.get(i) + 1];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -218527565656562187L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 5028567368895186903L)
        public FunctionOfIntInt XL() {
            try {
                if (we) {
                    iy.gn(6567529341907813740L, this);
                }
                return this.tp;
            } catch (Throwable th) {
                if (J0) {
                    iy.aM(th, 6567529341907813740L, this);
                }
                throw th;
            }
        }

        @ey(method = 880504036197405555L)
        public void Zo(int i, int i2, ListOfInt listOfInt, ListOfInt listOfInt2) {
            try {
                if (we) {
                    iy.J0(-1323309354890763456L, this, new Integer(i), new Integer(i2), listOfInt, listOfInt2);
                }
                int size = this.Hw + 3 + listOfInt.size() + listOfInt2.size();
                if (size >= this.FH.length) {
                    int[] iArr = new int[Math.max(this.FH.length * 2, size)];
                    System.arraycopy(this.FH, 0, iArr, 0, this.FH.length);
                    this.FH = iArr;
                }
                this.Zo.Zo(i, this.Hw);
                int[] iArr2 = this.FH;
                int i3 = this.Hw;
                int i4 = i3 + 1;
                this.Hw = i4;
                iArr2[i3] = i2;
                int[] iArr3 = this.FH;
                this.Hw = i4 + 1;
                iArr3[i4] = listOfInt.size();
                int[] iArr4 = this.FH;
                int i5 = this.Hw;
                this.Hw = i5 + 1;
                iArr4[i5] = listOfInt2.size();
                for (int i6 = 0; i6 < listOfInt.size(); i6++) {
                    int[] iArr5 = this.FH;
                    int i7 = this.Hw;
                    this.Hw = i7 + 1;
                    iArr5[i7] = listOfInt.get(i6);
                    this.gn.gn(listOfInt.get(i6), i);
                }
                for (int i8 = 0; i8 < listOfInt2.size(); i8++) {
                    int[] iArr6 = this.FH;
                    int i9 = this.Hw;
                    this.Hw = i9 + 1;
                    iArr6[i9] = listOfInt2.get(i8);
                    this.gn.gn(listOfInt2.get(i8), i);
                }
                this.gn.gn(i2, i);
            } catch (Throwable th) {
                if (J0) {
                    iy.a8(th, -1323309354890763456L, this, new Integer(i), new Integer(i2), listOfInt, listOfInt2);
                }
                throw th;
            }
        }

        @ey(method = 247009725157408800L)
        public int a8(int i, int i2) {
            try {
                if (we) {
                    iy.EQ(178869774610511005L, this, new Integer(i), new Integer(i2));
                }
                return this.FH[this.Zo.get(i) + 3 + i2 + this.FH[this.Zo.get(i) + 1]];
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 178869774610511005L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 2542399545287485964L)
        public int aM(int i) {
            try {
                if (we) {
                    iy.u7(-3682850399700485281L, this, i);
                }
                return this.FH[this.Zo.get(i)];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -3682850399700485281L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 4255936459414338369L)
        public long er() {
            try {
                if (we) {
                    iy.gn(2111570614252550152L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (J0) {
                    iy.aM(th, 2111570614252550152L, this);
                }
                throw th;
            }
        }

        @ey(method = 3894025446698674496L)
        public void gW(FunctionOfIntInt functionOfIntInt) {
            try {
                if (we) {
                    iy.tp(1491385593763992381L, this, functionOfIntInt);
                }
                this.tp.clear();
                this.tp.VH(functionOfIntInt);
                this.u7.clear();
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, 1491385593763992381L, this, functionOfIntInt);
                }
                throw th;
            }
        }

        @ey(method = -2099260025828730687L)
        public int gn(int i) {
            try {
                if (we) {
                    iy.u7(-8021828715129016632L, this, i);
                }
                if (this.v5.Hw(i)) {
                    return this.FH[this.v5.get(i)];
                }
                return -1;
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -8021828715129016632L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -1384759944869087040L)
        public MapOfInt<Member> j3() {
            try {
                if (we) {
                    iy.gn(1808673520828216011L, this);
                }
                return this.EQ;
            } catch (Throwable th) {
                if (J0) {
                    iy.aM(th, 1808673520828216011L, this);
                }
                throw th;
            }
        }

        @ey(method = -165592476891496215L)
        public void j6(long j) {
            try {
                if (we) {
                    iy.tp(-7512199455880934700L, this, new Long(j));
                }
                this.DW = j;
                this.u7.clear();
                this.tp.clear();
                this.v5.clear();
                this.Zo.clear();
                this.VH.clear();
                this.gn.clear();
                this.EQ.Hw();
                this.Hw = 0;
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -7512199455880934700L, this, new Long(j));
                }
                throw th;
            }
        }

        @ey(method = 1138098590196127960L)
        public int lg(int i) {
            try {
                if (we) {
                    iy.u7(-1248265834436201165L, this, i);
                }
                return this.FH[this.Zo.get(i) + 2];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -1248265834436201165L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -6398131233944705012L)
        public MapOfIntInt rN() {
            try {
                if (we) {
                    iy.gn(5501841195062523527L, this);
                }
                return this.gn;
            } catch (Throwable th) {
                if (J0) {
                    iy.aM(th, 5501841195062523527L, this);
                }
                throw th;
            }
        }

        @ey(method = -3969711559354815648L)
        public Member tp(int i) {
            try {
                if (we) {
                    iy.u7(2039649711553558755L, this, i);
                }
                int i2 = this.FH[this.v5.get(i) + 3];
                if (i2 == 0) {
                    return null;
                }
                return (Member) this.j6.entitySpace.getEntity(i2);
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, 2039649711553558755L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 112571784283664565L)
        public int u7(int i) {
            try {
                if (we) {
                    iy.u7(-1495261292418257616L, this, i);
                }
                return this.FH[this.v5.get(i) + 1];
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -1495261292418257616L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 583256188666586733L)
        public void v5(int i, int i2) {
            try {
                if (we) {
                    iy.EQ(386582585782760780L, this, new Integer(i), new Integer(i2));
                }
                this.tp.Zo(i, i2);
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 386582585782760780L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 421651400733670185L)
        public int we(int i, int i2) {
            try {
                if (we) {
                    iy.EQ(1672196148482678000L, this, new Integer(i), new Integer(i2));
                }
                return this.FH[this.VH.get(i) + 3 + i2];
            } catch (Throwable th) {
                if (J0) {
                    iy.Mr(th, 1672196148482678000L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 3316704329709629223L)
        public boolean yS(int i) {
            try {
                if (we) {
                    iy.u7(-1527037051677524260L, this, i);
                }
                return this.FH[this.v5.get(i) + 2] == 1;
            } catch (Throwable th) {
                if (J0) {
                    iy.j3(th, -1527037051677524260L, this, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2474610754167925065L, container = 2474610754167925065L, user = true)
    private static class b {

        @fy
        private static /* synthetic */ boolean gn;

        @gy
        private static /* synthetic */ boolean u7;

        @dy(field = 6494897310782515155L)
        private FunctionOfIntInt DW;

        @dy(field = 814530922199361728L)
        private RelationOfIntInt FH;

        @dy(field = 2185981129496092379L)
        private RelationOfIntInt Hw;

        @dy(field = -2083874741508245700L)
        private int VH;

        @dy(field = 550162018092471280L)
        private int Zo;

        @dy(field = -314169823955590720L)
        private HashtableOfInt<HashtableOfInt<ListOfInt>> j6;

        @dy(field = 4465753615856439560L)
        private int v5;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 101256077364001767L)
        public b(Model model) {
            try {
                if (gn) {
                    iy.tp(-1145118840148744073L, null, model);
                }
                this.j6 = new HashtableOfInt<>();
                this.DW = new FunctionOfIntInt();
                this.FH = new RelationOfIntInt();
                this.Hw = new RelationOfIntInt();
                this.v5 = model.identifierSpace.get("prototype");
                this.Zo = model.identifierSpace.get("()");
                this.VH = model.identifierSpace.get("function");
                model.identifierSpace.get("[]");
            } catch (Throwable th) {
                if (u7) {
                    iy.j3(th, -1145118840148744073L, null, model);
                }
                throw th;
            }
        }

        @ey(method = 2878018383981008320L)
        private void DW(HashtableOfInt<ListOfInt> hashtableOfInt, int i, int i2, a aVar) {
            ListOfInt listOfIntV5;
            ListOfInt listOfIntV52;
            ListOfInt listOfIntV53;
            ListOfInt listOfIntV54;
            ListOfInt listOfIntV55;
            try {
                if (gn) {
                    iy.J0(1931371125440583897L, this, hashtableOfInt, new Integer(i), new Integer(i2), aVar);
                }
                if (i2 != -1 && i2 != this.VH && (listOfIntV55 = hashtableOfInt.v5(i2)) != null) {
                    for (int i3 = 0; i3 < listOfIntV55.size(); i3++) {
                        this.FH.v5(aVar.EQ(i), aVar.EQ(listOfIntV55.get(i3)));
                    }
                }
                if (i2 == this.Zo && (listOfIntV54 = hashtableOfInt.v5(this.VH)) != null) {
                    for (int i4 = 0; i4 < listOfIntV54.size(); i4++) {
                        FH(listOfIntV54.get(i4), i, aVar);
                    }
                }
                if (i2 == this.VH && (listOfIntV53 = hashtableOfInt.v5(this.Zo)) != null) {
                    for (int i5 = 0; i5 < listOfIntV53.size(); i5++) {
                        FH(i, listOfIntV53.get(i5), aVar);
                    }
                }
                if (i2 == this.v5 && (listOfIntV52 = hashtableOfInt.v5(this.VH)) != null) {
                    for (int i6 = 0; i6 < listOfIntV52.size(); i6++) {
                        Hw(listOfIntV52.get(i6), i, aVar);
                    }
                }
                if (i2 != this.VH || (listOfIntV5 = hashtableOfInt.v5(this.v5)) == null) {
                    return;
                }
                for (int i7 = 0; i7 < listOfIntV5.size(); i7++) {
                    Hw(i, listOfIntV5.get(i7), aVar);
                }
            } catch (Throwable th) {
                if (u7) {
                    iy.a8(th, 1931371125440583897L, this, hashtableOfInt, new Integer(i), new Integer(i2), aVar);
                }
                throw th;
            }
        }

        @ey(method = 2417470897606978455L)
        private void FH(int i, int i2, a aVar) {
            try {
                if (gn) {
                    iy.we(3972988447634185936L, this, new Integer(i), new Integer(i2), aVar);
                }
                int iLg = aVar.lg(i);
                for (int i3 = 0; i3 < iLg; i3++) {
                    this.FH.Hw(aVar.Ws(i2), aVar.a8(i, i3));
                }
                int iMin = Math.min(aVar.U2(i), aVar.J0(i2));
                for (int i4 = 0; i4 < iMin; i4++) {
                    this.FH.Hw(aVar.Mr(i, i4), aVar.we(i2, i4));
                }
                if (aVar.J8(i2) != -1) {
                    this.FH.Hw(aVar.J8(i2), aVar.aM(i));
                }
            } catch (Throwable th) {
                if (u7) {
                    iy.U2(th, 3972988447634185936L, this, new Integer(i), new Integer(i2), aVar);
                }
                throw th;
            }
        }

        @ey(method = 445344231439637205L)
        private void Hw(int i, int i2, a aVar) {
            try {
                if (gn) {
                    iy.we(1870877358674636592L, this, new Integer(i), new Integer(i2), aVar);
                }
                this.FH.v5(aVar.aM(i), aVar.EQ(i2));
            } catch (Throwable th) {
                if (u7) {
                    iy.U2(th, 1870877358674636592L, this, new Integer(i), new Integer(i2), aVar);
                }
                throw th;
            }
        }

        @ey(method = -1963565706129720672L)
        public void j6(a aVar) {
            boolean z;
            try {
                if (gn) {
                    iy.tp(-429019998233429171L, this, aVar);
                }
                System.currentTimeMillis();
                this.FH.clear();
                this.FH.VH(aVar.QX());
                this.j6.FH();
                this.DW.clear();
                this.DW.VH(aVar.XL());
                this.DW.DEFAULT_ITERATOR.init();
                while (this.DW.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iNextValue = this.DW.DEFAULT_ITERATOR.nextValue();
                    int iNextKey = this.DW.DEFAULT_ITERATOR.nextKey();
                    if (!this.j6.Hw(iNextValue)) {
                        this.j6.VH(iNextValue, new HashtableOfInt<>());
                    }
                    HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.j6.v5(iNextValue);
                    int iGn = aVar.gn(iNextKey);
                    DW(hashtableOfIntV5, iNextKey, iGn, aVar);
                    if (!hashtableOfIntV5.Hw(iGn)) {
                        hashtableOfIntV5.VH(iGn, new ListOfInt());
                    }
                    hashtableOfIntV5.v5(iGn).add(iNextKey);
                }
                do {
                    this.Hw.clear();
                    this.Hw.VH(this.FH);
                    this.FH.clear();
                    this.Hw.j6.DW();
                    z = false;
                    while (this.Hw.j6.j6()) {
                        int i = this.DW.get(this.Hw.j6.FH());
                        int i2 = this.DW.get(this.Hw.j6.Hw());
                        if (i != i2 && i != -1 && i2 != -1) {
                            HashtableOfInt<ListOfInt> hashtableOfIntV52 = this.j6.v5(i);
                            HashtableOfInt<ListOfInt> hashtableOfIntV53 = this.j6.v5(i2);
                            hashtableOfIntV52.j6.DW();
                            while (hashtableOfIntV52.j6.j6()) {
                                int iFH = hashtableOfIntV52.j6.FH();
                                ListOfInt listOfIntHw = hashtableOfIntV52.j6.Hw();
                                for (int i3 = 0; i3 < listOfIntHw.size(); i3++) {
                                    DW(hashtableOfIntV53, listOfIntHw.get(i3), iFH, aVar);
                                }
                            }
                            hashtableOfIntV52.j6.DW();
                            while (hashtableOfIntV52.j6.j6()) {
                                int iFH2 = hashtableOfIntV52.j6.FH();
                                if (!hashtableOfIntV53.Hw(iFH2)) {
                                    hashtableOfIntV53.VH(iFH2, new ListOfInt());
                                }
                                ListOfInt listOfIntV5 = hashtableOfIntV53.v5(iFH2);
                                ListOfInt listOfIntHw2 = hashtableOfIntV52.j6.Hw();
                                for (int i4 = 0; i4 < listOfIntHw2.size(); i4++) {
                                    int i5 = listOfIntHw2.get(i4);
                                    listOfIntV5.add(i5);
                                    this.DW.Zo(i5, i2);
                                }
                            }
                            this.j6.tp(i);
                            z = true;
                        }
                    }
                } while (z);
                aVar.gW(this.DW);
            } catch (Throwable th) {
                if (u7) {
                    iy.j3(th, -429019998233429171L, this, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -235695670492011520L, container = -235695670492011520L, user = true)
    private static class c {

        @fy
        private static /* synthetic */ boolean aM;

        @gy
        private static /* synthetic */ boolean j3;

        @dy(field = -4186981845715167475L)
        private final s1 DW;

        @dy(field = -3324497677361694200L)
        private d3 EQ;

        @dy(field = -555945193965346176L)
        private HashtableOfInt<HashtableOfInt<ListOfInt>> FH;

        @dy(field = -7048369746130856455L)
        private FunctionOfIntInt Hw;

        @dy(field = 3480330960593241688L)
        private FunctionOfIntInt J0;

        @dy(field = -9999126875902560L)
        private FunctionOfIntInt J8;

        @dy(field = 2254633534329279320L)
        private int QX;

        @dy(field = 4026754963714601965L)
        private RelationOfIntInt VH;

        @dy(field = -7630785885688845740L)
        private int Ws;

        @dy(field = 6928863113749617264L)
        private int XL;

        @dy(field = -4054935250744014456L)
        private RelationOfIntInt Zo;

        @dy(field = -5966960700716518104L)
        private SetOfInt gn;

        @dy(field = 527001229574209376L)
        private final Model j6;

        @dy(field = 1334325826424669625L)
        private d3 tp;

        @dy(field = 137310527444626620L)
        private SetOfInt u7;

        @dy(field = -3006949729233651200L)
        private SetOfInt v5;

        @dy(field = 4024751018254159088L)
        private FunctionOfIntInt we;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 42453604497186475L)
        public c(Model model, s1 s1Var) {
            try {
                if (aM) {
                    iy.EQ(1926454547067083311L, null, model, s1Var);
                }
                this.FH = new HashtableOfInt<>();
                this.Hw = new FunctionOfIntInt();
                this.v5 = new SetOfInt();
                this.Zo = new RelationOfIntInt();
                this.VH = new RelationOfIntInt();
                this.gn = new SetOfInt();
                this.u7 = new SetOfInt();
                this.tp = new d3();
                this.EQ = new d3();
                this.we = new FunctionOfIntInt();
                this.J0 = new FunctionOfIntInt();
                this.J8 = new FunctionOfIntInt();
                this.j6 = model;
                this.DW = s1Var;
                this.Ws = model.identifierSpace.get("prototype");
                this.QX = model.identifierSpace.get("()");
                this.XL = model.identifierSpace.get("function");
                model.identifierSpace.get("[]");
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, 1926454547067083311L, null, model, s1Var);
                }
                throw th;
            }
        }

        @ey(method = 546399973055057319L)
        private int EQ(int i) {
            try {
                if (aM) {
                    iy.u7(-50710653382758823L, this, i);
                }
                return this.we.get(i);
            } catch (Throwable th) {
                if (j3) {
                    iy.j3(th, -50710653382758823L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2058243910716383040L)
        private int FH(FileEntry fileEntry, int i) {
            try {
                if (aM) {
                    iy.EQ(-271594387640645060L, this, fileEntry, new Integer(i));
                }
                long id = (fileEntry.getId() << 32) | i;
                if (!this.tp.DW(id)) {
                    this.tp.Hw(id, this.tp.Zo());
                }
                return this.tp.FH(id);
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, -271594387640645060L, this, fileEntry, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1017460058797262073L)
        private void QX(int i, int i2) {
            try {
                if (aM) {
                    iy.EQ(-3139108822183597493L, this, new Integer(i), new Integer(i2));
                }
                FileEntry fileEntryGn = gn(i);
                FileEntry fileEntryGn2 = gn(i2);
                Language languageU7 = u7(i);
                Language languageU72 = u7(i2);
                int iEQ = EQ(i2);
                int iEQ2 = EQ(i);
                a aVarWs = this.DW.Ws(fileEntryGn, languageU7);
                a aVarWs2 = this.DW.Ws(fileEntryGn2, languageU72);
                int iLg = aVarWs.lg(iEQ2);
                for (int i3 = 0; i3 < iLg; i3++) {
                    this.Zo.Hw(Zo(fileEntryGn2, languageU72, aVarWs2.Ws(iEQ)), Zo(fileEntryGn, languageU7, aVarWs.a8(iEQ2, i3)));
                }
                int iMin = Math.min(aVarWs.U2(iEQ2), aVarWs2.J0(iEQ));
                for (int i4 = 0; i4 < iMin; i4++) {
                    this.Zo.Hw(Zo(fileEntryGn, languageU7, aVarWs.Mr(iEQ2, i4)), Zo(fileEntryGn2, languageU72, aVarWs2.we(iEQ, i4)));
                }
                if (aVarWs2.J8(iEQ) != -1) {
                    this.Zo.Hw(Zo(fileEntryGn2, languageU72, aVarWs2.J8(iEQ)), Zo(fileEntryGn, languageU7, aVarWs.aM(iEQ2)));
                }
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, -3139108822183597493L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -1741124133682378092L)
        private void Ws(HashtableOfInt<ListOfInt> hashtableOfInt, int i, int i2) {
            ListOfInt listOfIntV5;
            ListOfInt listOfIntV52;
            ListOfInt listOfIntV53;
            ListOfInt listOfIntV54;
            ListOfInt listOfIntV55;
            try {
                if (aM) {
                    iy.we(-2492318181424769672L, this, hashtableOfInt, new Integer(i), new Integer(i2));
                }
                if (i2 != -1 && i2 != this.XL && (listOfIntV55 = hashtableOfInt.v5(i2)) != null) {
                    for (int i3 = 0; i3 < listOfIntV55.size(); i3++) {
                        FileEntry fileEntryGn = gn(i);
                        FileEntry fileEntryGn2 = gn(listOfIntV55.get(i3));
                        Language languageU7 = u7(i);
                        Language languageU72 = u7(listOfIntV55.get(i3));
                        this.Zo.v5(Zo(fileEntryGn, languageU7, this.DW.Ws(fileEntryGn, languageU7).EQ(EQ(i))), Zo(fileEntryGn2, languageU72, this.DW.Ws(fileEntryGn2, languageU72).EQ(EQ(listOfIntV55.get(i3)))));
                    }
                }
                if (i2 == this.QX && (listOfIntV54 = hashtableOfInt.v5(this.XL)) != null) {
                    for (int i4 = 0; i4 < listOfIntV54.size(); i4++) {
                        QX(listOfIntV54.get(i4), i);
                    }
                }
                if (i2 == this.XL && (listOfIntV53 = hashtableOfInt.v5(this.QX)) != null) {
                    for (int i5 = 0; i5 < listOfIntV53.size(); i5++) {
                        QX(i, listOfIntV53.get(i5));
                    }
                }
                if (i2 == this.Ws && (listOfIntV52 = hashtableOfInt.v5(this.XL)) != null) {
                    for (int i6 = 0; i6 < listOfIntV52.size(); i6++) {
                        XL(listOfIntV52.get(i6), i);
                    }
                }
                if (i2 != this.XL || (listOfIntV5 = hashtableOfInt.v5(this.Ws)) == null) {
                    return;
                }
                for (int i7 = 0; i7 < listOfIntV5.size(); i7++) {
                    XL(i, listOfIntV5.get(i7));
                }
            } catch (Throwable th) {
                if (j3) {
                    iy.U2(th, -2492318181424769672L, this, hashtableOfInt, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -1361028885299439549L)
        private void XL(int i, int i2) {
            try {
                if (aM) {
                    iy.EQ(-1481160498152354619L, this, new Integer(i), new Integer(i2));
                }
                FileEntry fileEntryGn = gn(i);
                FileEntry fileEntryGn2 = gn(i2);
                Language languageU7 = u7(i);
                Language languageU72 = u7(i2);
                this.Zo.v5(Zo(fileEntryGn, languageU7, this.DW.Ws(fileEntryGn, languageU7).aM(EQ(i))), Zo(fileEntryGn2, languageU72, this.DW.Ws(fileEntryGn2, languageU72).EQ(EQ(i2))));
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, -1481160498152354619L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -2876898075971302312L)
        private int Zo(FileEntry fileEntry, Language language, int i) {
            try {
                if (aM) {
                    iy.we(3054448858437110608L, this, fileEntry, language, new Integer(i));
                }
                int languageId = this.j6.fileSpace.getLanguageId(language);
                long id = (fileEntry.getId() << 40) | (languageId << 32) | i;
                if (!this.EQ.DW(id)) {
                    int iZo = this.EQ.Zo();
                    this.we.Zo(iZo, i);
                    this.J0.Zo(iZo, fileEntry.getId());
                    this.J8.Zo(iZo, languageId);
                    this.EQ.Hw(id, iZo);
                }
                return this.EQ.FH(id);
            } catch (Throwable th) {
                if (j3) {
                    iy.U2(th, 3054448858437110608L, this, fileEntry, language, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 912822203275385724L)
        private void aM() {
            try {
                if (aM) {
                    iy.gn(-2773922442852477552L, this);
                }
                while (true) {
                    this.u7.clear();
                    this.gn.default_Iterator.init();
                    while (this.gn.default_Iterator.hasMoreElements()) {
                        HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.FH.v5(this.gn.default_Iterator.nextKey());
                        hashtableOfIntV5.j6.DW();
                        while (hashtableOfIntV5.j6.j6()) {
                            ListOfInt listOfIntHw = hashtableOfIntV5.j6.Hw();
                            for (int i = 0; i < listOfIntHw.size(); i++) {
                                int i2 = listOfIntHw.get(i);
                                int iEQ = EQ(i2);
                                FileEntry fileEntryGn = gn(i2);
                                Language languageU7 = u7(i2);
                                MapOfIntInt mapOfIntIntRN = this.DW.Ws(fileEntryGn, languageU7).rN();
                                mapOfIntIntRN.j6.FH(iEQ);
                                while (mapOfIntIntRN.j6.j6()) {
                                    int i3 = this.Hw.get(Zo(fileEntryGn, languageU7, mapOfIntIntRN.j6.v5()));
                                    if (i3 != -1 && !this.gn.contains(i3)) {
                                        this.u7.put(i3);
                                    }
                                }
                            }
                        }
                    }
                    if (this.u7.empty()) {
                        return;
                    } else {
                        this.gn.VH(this.u7);
                    }
                }
            } catch (Throwable th) {
                if (j3) {
                    iy.aM(th, -2773922442852477552L, this);
                }
                throw th;
            }
        }

        @ey(method = -406603152438309365L)
        private FileEntry gn(int i) {
            try {
                if (aM) {
                    iy.u7(131298657246544449L, this, i);
                }
                return this.j6.fileSpace.getFileEntry(this.J0.get(i));
            } catch (Throwable th) {
                if (j3) {
                    iy.j3(th, 131298657246544449L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -292409019452733867L)
        private void j6(FileEntry fileEntry, Language language) {
            try {
                if (aM) {
                    iy.EQ(-885796261868491425L, this, fileEntry, language);
                }
                if (this.v5.contains(fileEntry.getId())) {
                    return;
                }
                SetOf setOf = new SetOf(this.j6.entitySpace);
                this.v5.put(fileEntry.getId());
                this.DW.U2(fileEntry, language);
                a aVarWs = this.DW.Ws(fileEntry, language);
                RelationOfIntInt relationOfIntIntQX = aVarWs.QX();
                relationOfIntIntQX.j6.DW();
                while (relationOfIntIntQX.j6.j6()) {
                    this.Zo.v5(Zo(fileEntry, language, relationOfIntIntQX.j6.FH()), Zo(fileEntry, language, relationOfIntIntQX.j6.Hw()));
                }
                MapOfInt<Member> mapOfIntJ3 = aVarWs.j3();
                mapOfIntJ3.DEFAULT_ITERATOR.DW();
                while (mapOfIntJ3.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iHw = mapOfIntJ3.DEFAULT_ITERATOR.Hw();
                    Member member = (Member) mapOfIntJ3.DEFAULT_ITERATOR.nextValue();
                    this.Zo.v5(Zo(fileEntry, language, iHw), Zo(member.getFile(), member.getLanguage(), member.getId() | Integer.MIN_VALUE));
                    setOf.put(member);
                }
                FunctionOfIntInt functionOfIntIntXL = aVarWs.XL();
                functionOfIntIntXL.DEFAULT_ITERATOR.init();
                while (functionOfIntIntXL.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iNextKey = functionOfIntIntXL.DEFAULT_ITERATOR.nextKey();
                    int iZo = Zo(fileEntry, language, iNextKey);
                    int iFH = FH(fileEntry, functionOfIntIntXL.DEFAULT_ITERATOR.nextValue());
                    this.Hw.Zo(iZo, iFH);
                    if (!this.FH.Hw(iFH)) {
                        this.FH.VH(iFH, new HashtableOfInt<>());
                    }
                    HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.FH.v5(iFH);
                    int iGn = aVarWs.gn(iNextKey);
                    Ws(hashtableOfIntV5, iZo, iGn);
                    if (!hashtableOfIntV5.Hw(iGn)) {
                        hashtableOfIntV5.VH(iGn, new ListOfInt());
                    }
                    hashtableOfIntV5.v5(iGn).add(iZo);
                }
                setOf.DEFAULT_ITERATOR.init();
                while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                    this.DW.U2(member2.getFile(), member2.getLanguage());
                    j6(member2.getFile(), member2.getLanguage());
                }
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, -885796261868491425L, this, fileEntry, language);
                }
                throw th;
            }
        }

        @ey(method = 285038067271356003L)
        private Language u7(int i) {
            try {
                if (aM) {
                    iy.u7(1059865928838609585L, this, i);
                }
                return this.j6.fileSpace.getLanguage(this.J8.get(i));
            } catch (Throwable th) {
                if (j3) {
                    iy.j3(th, 1059865928838609585L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 747161188510711351L)
        public void DW(FileEntry fileEntry, Language language, int i) {
            boolean z;
            try {
                if (aM) {
                    iy.we(174861003032050573L, this, fileEntry, language, new Integer(i));
                }
                System.currentTimeMillis();
                this.tp.j6();
                this.EQ.j6();
                this.J0.clear();
                this.J8.clear();
                this.we.clear();
                this.gn.clear();
                this.Zo.clear();
                this.FH.FH();
                this.Hw.clear();
                this.v5.clear();
                if (fileEntry == null) {
                    SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
                    setOfFileEntryKD.j6.init();
                    while (setOfFileEntryKD.j6.hasMoreElements()) {
                        FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                        CodeModel codeModel = fileEntryNextKey.getCodeModel();
                        if (codeModel != null) {
                            for (Language language2 : codeModel.getLanguages()) {
                                if (language2.getSignatureAnalyzer() != null) {
                                    j6(fileEntryNextKey, language2);
                                }
                            }
                        }
                    }
                } else {
                    j6(fileEntry, language);
                    this.Hw.DEFAULT_ITERATOR.init();
                    while (this.Hw.DEFAULT_ITERATOR.hasMoreElements()) {
                        int iNextKey = this.Hw.DEFAULT_ITERATOR.nextKey();
                        int iEQ = EQ(iNextKey);
                        FileEntry fileEntryGn = gn(iNextKey);
                        int iNextValue = this.Hw.DEFAULT_ITERATOR.nextValue();
                        if (fileEntryGn == fileEntry && (i == -1 || i == iEQ)) {
                            this.gn.put(iNextValue);
                        }
                    }
                }
                do {
                    this.VH.clear();
                    this.VH.VH(this.Zo);
                    this.Zo.clear();
                    if (fileEntry != null) {
                        aM();
                    }
                    this.VH.j6.DW();
                    z = false;
                    while (this.VH.j6.j6()) {
                        int iFH = this.VH.j6.FH();
                        int iHw = this.VH.j6.Hw();
                        int i2 = this.Hw.get(iFH);
                        int i3 = this.Hw.get(iHw);
                        if (i2 != i3 && i2 != -1 && i3 != -1) {
                            if (fileEntry == null || this.gn.contains(i2) || this.gn.contains(i3)) {
                                if (fileEntry != null) {
                                    j6(gn(iFH), u7(iFH));
                                }
                                if (fileEntry != null) {
                                    j6(gn(iHw), u7(iHw));
                                }
                                HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.FH.v5(i2);
                                HashtableOfInt<ListOfInt> hashtableOfIntV52 = this.FH.v5(i3);
                                hashtableOfIntV5.j6.DW();
                                while (hashtableOfIntV5.j6.j6()) {
                                    int iFH2 = hashtableOfIntV5.j6.FH();
                                    ListOfInt listOfIntHw = hashtableOfIntV5.j6.Hw();
                                    for (int i4 = 0; i4 < listOfIntHw.size(); i4++) {
                                        Ws(hashtableOfIntV52, listOfIntHw.get(i4), iFH2);
                                    }
                                }
                                hashtableOfIntV5.j6.DW();
                                while (hashtableOfIntV5.j6.j6()) {
                                    int iFH3 = hashtableOfIntV5.j6.FH();
                                    if (!hashtableOfIntV52.Hw(iFH3)) {
                                        hashtableOfIntV52.VH(iFH3, new ListOfInt());
                                    }
                                    ListOfInt listOfIntV5 = hashtableOfIntV52.v5(iFH3);
                                    ListOfInt listOfIntHw2 = hashtableOfIntV5.j6.Hw();
                                    for (int i5 = 0; i5 < listOfIntHw2.size(); i5++) {
                                        int i6 = listOfIntHw2.get(i5);
                                        listOfIntV5.add(i6);
                                        this.Hw.Zo(i6, i3);
                                    }
                                }
                                this.gn.u7(i2);
                                this.gn.put(i3);
                                this.FH.tp(i2);
                                z = true;
                            } else {
                                this.Zo.v5(iFH, iHw);
                            }
                        }
                    }
                } while (z);
            } catch (Throwable th) {
                if (j3) {
                    iy.U2(th, 174861003032050573L, this, fileEntry, language, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2519133984277328499L)
        public ListOf<Member> Hw(SyntaxTree syntaxTree, int i) {
            try {
                if (aM) {
                    iy.EQ(-730981630911377307L, this, syntaxTree, new Integer(i));
                }
                ListOf<Member> listOf = new ListOf<>(this.j6.entitySpace);
                HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.FH.v5(VH(syntaxTree.getFile(), syntaxTree.getLanguage(), i));
                if (hashtableOfIntV5 != null) {
                    hashtableOfIntV5.j6.DW();
                    while (hashtableOfIntV5.j6.j6()) {
                        ListOfInt listOfIntHw = hashtableOfIntV5.j6.Hw();
                        for (int i2 = 0; i2 < listOfIntHw.size(); i2++) {
                            int i3 = listOfIntHw.get(i2);
                            int iEQ = EQ(i3);
                            Member memberTp = this.DW.Ws(gn(i3), u7(i3)).tp(iEQ);
                            if (memberTp != null && this.DW.Ws(gn(i3), u7(i3)).gn(iEQ) != this.XL) {
                                listOf.j6(memberTp);
                            }
                        }
                    }
                }
                return listOf;
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, -730981630911377307L, this, syntaxTree, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 79886115840042400L)
        public List<List<Variable>> J0(SyntaxTree syntaxTree, int i) {
            try {
                if (aM) {
                    iy.EQ(6621038486640179976L, this, syntaxTree, new Integer(i));
                }
                FileEntry file = syntaxTree.getFile();
                Language language = syntaxTree.getLanguage();
                ArrayList arrayList = new ArrayList();
                int iVH = VH(syntaxTree.getFile(), syntaxTree.getLanguage(), i);
                ListOfInt listOfInt = new ListOfInt();
                ListOfInt listOfIntV5 = this.FH.v5(iVH).v5(this.XL);
                if (listOfIntV5 != null) {
                    for (int i2 = 0; i2 < listOfIntV5.size(); i2++) {
                        int i3 = listOfIntV5.get(i2);
                        if (this.DW.Ws(gn(i3), u7(i3)).tp(EQ(i3)) == null && gn(i3) == file) {
                            listOfInt.add(EQ(i3));
                        }
                    }
                    for (int i4 = 0; i4 < listOfInt.size(); i4++) {
                        int i5 = listOfInt.get(i4);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList.add(arrayList2);
                        int iU2 = this.DW.Ws(file, language).U2(i5);
                        for (int i6 = 0; i6 < iU2; i6++) {
                            int iMr = this.DW.Ws(file, language).Mr(i5, i6);
                            arrayList2.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(iMr), syntaxTree.getStartColumn(iMr), syntaxTree.getEndColumn(iMr), syntaxTree.getIdentifier(iMr), null));
                        }
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, 6621038486640179976L, this, syntaxTree, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 8235712990852967196L)
        public boolean J8(int i, int i2) {
            ListOfInt listOfIntV5;
            try {
                if (aM) {
                    iy.EQ(1233083162288896920L, this, new Integer(i), new Integer(i2));
                }
                HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.FH.v5(i);
                if (hashtableOfIntV5 != null && (listOfIntV5 = hashtableOfIntV5.v5(this.j6.identifierSpace.get("new"))) != null && listOfIntV5.size() != 0) {
                    ListOfInt listOfIntV52 = hashtableOfIntV5.v5(i2);
                    if (listOfIntV52 == null) {
                        return true;
                    }
                    for (int i3 = 0; i3 < listOfIntV52.size(); i3++) {
                        int i4 = listOfIntV52.get(i3);
                        if (this.DW.Ws(gn(i4), u7(i4)).yS(EQ(i4))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, 1233083162288896920L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 6941584085700999735L)
        public int VH(FileEntry fileEntry, Language language, int i) {
            try {
                if (aM) {
                    iy.we(-4373875540825530195L, this, fileEntry, language, new Integer(i));
                }
                return this.Hw.get(Zo(fileEntry, language, i));
            } catch (Throwable th) {
                if (j3) {
                    iy.U2(th, -4373875540825530195L, this, fileEntry, language, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -933174675358615008L)
        public Member tp(int i, int i2) {
            ListOfInt listOfIntV5;
            try {
                if (aM) {
                    iy.EQ(352145281689078912L, this, new Integer(i), new Integer(i2));
                }
                HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.FH.v5(i);
                if (hashtableOfIntV5 == null || (listOfIntV5 = hashtableOfIntV5.v5(i2)) == null) {
                    return null;
                }
                for (int i3 = 0; i3 < listOfIntV5.size(); i3++) {
                    int i4 = listOfIntV5.get(i3);
                    Member memberTp = this.DW.Ws(gn(i4), u7(i4)).tp(EQ(i4));
                    if (memberTp != null) {
                        return memberTp;
                    }
                }
                return null;
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, 352145281689078912L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -2512126896358869405L)
        public List<Variable> v5(SyntaxTree syntaxTree, int i) {
            try {
                if (aM) {
                    iy.EQ(-2258855346937344151L, this, syntaxTree, new Integer(i));
                }
                ArrayList arrayList = new ArrayList();
                FileEntry file = syntaxTree.getFile();
                Language language = syntaxTree.getLanguage();
                FunctionOfIntInt functionOfIntInt = new FunctionOfIntInt();
                int iVH = VH(file, language, i);
                ListOfInt listOfInt = new ListOfInt();
                HashtableOfInt<ListOfInt> hashtableOfIntV5 = this.FH.v5(iVH);
                if (hashtableOfIntV5 != null) {
                    hashtableOfIntV5.j6.DW();
                    while (hashtableOfIntV5.j6.j6()) {
                        ListOfInt listOfIntHw = hashtableOfIntV5.j6.Hw();
                        for (int i2 = 0; i2 < listOfIntHw.size(); i2++) {
                            int i3 = listOfIntHw.get(i2);
                            if (gn(i3) == file) {
                                listOfInt.add(EQ(i3));
                            }
                        }
                    }
                }
                for (int i4 = 0; i4 < listOfInt.size(); i4++) {
                    int i5 = listOfInt.get(i4);
                    if (i5 != i && this.DW.Ws(file, language).gn(i5) != -1 && this.DW.Ws(file, language).yS(i5)) {
                        functionOfIntInt.Zo(this.DW.Ws(file, language).gn(i5), this.DW.Ws(file, language).u7(i5));
                    }
                }
                for (int i6 = 0; i6 < listOfInt.size(); i6++) {
                    int i7 = listOfInt.get(i6);
                    if (i7 != i && this.DW.Ws(file, language).gn(i7) != -1 && !functionOfIntInt.Hw(this.DW.Ws(file, language).gn(i7))) {
                        functionOfIntInt.Zo(this.DW.Ws(file, language).gn(i7), this.DW.Ws(file, language).u7(i7));
                    }
                }
                functionOfIntInt.DEFAULT_ITERATOR.init();
                while (functionOfIntInt.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iNextValue = functionOfIntInt.DEFAULT_ITERATOR.nextValue();
                    if (iNextValue != -1) {
                        arrayList.add(new Variable(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getStartLine(iNextValue), syntaxTree.getStartColumn(iNextValue), syntaxTree.getEndColumn(iNextValue), syntaxTree.getIdentifier(iNextValue), null));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, -2258855346937344151L, this, syntaxTree, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 5899946866635098036L)
        public List<Member> we(SyntaxTree syntaxTree, int i) {
            try {
                if (aM) {
                    iy.EQ(-316146492409443192L, this, syntaxTree, new Integer(i));
                }
                syntaxTree.getFile();
                ArrayList arrayList = new ArrayList();
                ListOfInt listOfIntV5 = this.FH.v5(VH(syntaxTree.getFile(), syntaxTree.getLanguage(), i)).v5(this.XL);
                if (listOfIntV5 != null) {
                    for (int i2 = 0; i2 < listOfIntV5.size(); i2++) {
                        int i3 = listOfIntV5.get(i2);
                        int iEQ = EQ(i3);
                        Member memberTp = this.DW.Ws(gn(i3), u7(i3)).tp(iEQ);
                        if (memberTp != null && memberTp.e9() && this.DW.Ws(gn(i3), u7(i3)).gn(iEQ) == this.XL) {
                            arrayList.add(memberTp);
                        }
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                if (j3) {
                    iy.Mr(th, -316146492409443192L, this, syntaxTree, new Integer(i));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(s1.class);
    }

    @ey(method = 63171805099044444L)
    public s1(Model model) {
        try {
            if (v5) {
                iy.tp(627532327769573793L, null, model);
            }
            this.j6 = model;
            this.FH = new c(model, this);
            this.DW = new b(model);
            this.Hw = new HashtableOfInt<>();
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 627532327769573793L, null, model);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2432734291697440959L)
    public void U2(FileEntry fileEntry, Language language) {
        try {
            if (v5) {
                iy.EQ(623251903008515480L, this, fileEntry, language);
            }
            if (!this.Hw.Hw(fileEntry.getId())) {
                this.Hw.VH(fileEntry.getId(), new a(this.j6));
            }
            if (this.Hw.v5(fileEntry.getId()).er() != fileEntry.getVersion()) {
                this.Hw.v5(fileEntry.getId()).j6(fileEntry.getVersion());
                SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, language);
                language.getSignatureAnalyzer().v5(syntaxTree);
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                this.DW.j6(this.Hw.v5(fileEntry.getId()));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 623251903008515480L, this, fileEntry, language);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1749157868522433755L)
    public a Ws(FileEntry fileEntry, Language language) {
        try {
            if (v5) {
                iy.EQ(15171399124488032L, this, fileEntry, language);
            }
            return this.Hw.v5(fileEntry.getId());
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 15171399124488032L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -2376694966626632945L)
    public void EQ(FileEntry fileEntry, Language language, int i, int i2, int i3, boolean z, Member member, int i4) throws Throwable {
        int i5;
        try {
            if (v5) {
                iy.QX(-1617935416631164224L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), member, new Integer(i4)});
            }
            i5 = 8;
            try {
                this.Hw.v5(fileEntry.getId()).DW(i, i2, i3, z, member, i4);
            } catch (Throwable th) {
                th = th;
                if (Zo) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = new Integer(i3);
                    objArr[5] = new Boolean(z);
                    objArr[6] = member;
                    objArr[7] = new Integer(i4);
                    iy.rN(th, -1617935416631164224L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 8;
        }
    }

    @ey(method = 312924072273297380L)
    public void FH(FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (v5) {
                iy.J0(-1841483160160804511L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.Hw.v5(fileEntry.getId()).DW(i, -1, this.j6.identifierSpace.get("[]"), false, null, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, -1841483160160804511L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 89265060883633800L)
    public void Hw(FileEntry fileEntry, Language language, int i, int i2, ListOfInt listOfInt, int i3) throws Throwable {
        int i4;
        try {
            if (v5) {
                iy.QX(4297728120043160725L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), listOfInt, new Integer(i3)});
            }
            this.Hw.v5(fileEntry.getId()).FH(i, i2, listOfInt, i3);
            i4 = 6;
            try {
                this.Hw.v5(fileEntry.getId()).DW(i, -1, this.j6.identifierSpace.get("()"), false, null, i3);
            } catch (Throwable th) {
                th = th;
                if (Zo) {
                    Object[] objArr = new Object[i4];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = listOfInt;
                    objArr[5] = new Integer(i3);
                    iy.rN(th, 4297728120043160725L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i4 = 6;
        }
    }

    @ey(method = 2552679270226974552L)
    public List<Variable> J0(SyntaxTree syntaxTree, int i) {
        try {
            if (v5) {
                iy.EQ(1847804786176808337L, this, syntaxTree, new Integer(i));
            }
            return this.FH.v5(syntaxTree, i);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 1847804786176808337L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -47723162208388200L)
    public int J8(FileEntry fileEntry, Language language, int i) {
        try {
            if (v5) {
                iy.we(1730402255897237013L, this, fileEntry, language, new Integer(i));
            }
            return this.FH.VH(fileEntry, language, i);
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 1730402255897237013L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2878525444723159993L)
    public Member QX(int i, int i2) {
        try {
            if (v5) {
                iy.EQ(1036558949969892096L, this, new Integer(i), new Integer(i2));
            }
            return this.FH.tp(i, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 1036558949969892096L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -5278449396632891724L)
    public void VH(FileEntry fileEntry, Language language, int i, int i2, ListOfInt listOfInt, ListOfInt listOfInt2, Member member) throws Throwable {
        int i3;
        try {
            if (v5) {
                iy.QX(620874351616406595L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), listOfInt, listOfInt2, member});
            }
            this.Hw.v5(fileEntry.getId()).Zo(i, i2, listOfInt, listOfInt2);
            i3 = 7;
            try {
                this.Hw.v5(fileEntry.getId()).DW(i, -1, this.j6.identifierSpace.get("function"), false, member, -1);
            } catch (Throwable th) {
                th = th;
                if (Zo) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = listOfInt;
                    objArr[5] = listOfInt2;
                    objArr[6] = member;
                    iy.rN(th, 620874351616406595L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 7;
        }
    }

    @ey(method = -4214375095024685061L)
    public List<Member> XL(SyntaxTree syntaxTree, int i) {
        try {
            if (v5) {
                iy.EQ(-4548604707929681608L, this, syntaxTree, new Integer(i));
            }
            return this.FH.we(syntaxTree, i);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -4548604707929681608L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 525788044737829773L)
    public void Zo(FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (v5) {
                iy.J0(494126060538491120L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.Hw.v5(fileEntry.getId()).v5(i, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 494126060538491120L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2843255028429882848L)
    public void a8() {
        try {
            if (v5) {
                iy.gn(-713874987217292259L, this);
            }
            this.Hw.FH();
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -713874987217292259L, this);
            }
            throw th;
        }
    }

    @ey(method = -188744283365902341L)
    public List<List<Variable>> aM(SyntaxTree syntaxTree, int i) {
        try {
            if (v5) {
                iy.EQ(4251337031097987304L, this, syntaxTree, new Integer(i));
            }
            return this.FH.J0(syntaxTree, i);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 4251337031097987304L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2196332153030880379L)
    public void er(SyntaxTree syntaxTree) {
        try {
            if (v5) {
                iy.tp(494687994751735880L, this, syntaxTree);
            }
            U2(syntaxTree.getFile(), syntaxTree.getLanguage());
            this.FH.DW(syntaxTree.getFile(), syntaxTree.getLanguage(), -1);
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 494687994751735880L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 424363361227122680L)
    public void gW() {
        try {
            if (v5) {
                iy.gn(1821136738544643633L, this);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 1821136738544643633L, this);
            }
            throw th;
        }
    }

    @ey(method = -2739622177201488480L)
    public void gn(FileEntry fileEntry, Language language, Member member, int i) {
        try {
            if (v5) {
                iy.J0(224913778446445659L, this, fileEntry, language, member, new Integer(i));
            }
            int id = member.getId() | Integer.MIN_VALUE;
            Zo(fileEntry, language, id, member.getId());
            v5(fileEntry, language, id, i);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 224913778446445659L, this, fileEntry, language, member, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6580554928617734505L)
    public boolean j3(int i, int i2) {
        try {
            if (v5) {
                iy.EQ(-4183218315478808664L, this, new Integer(i), new Integer(i2));
            }
            return this.FH.J8(i, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -4183218315478808664L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1929158138654508148L)
    public void lg(SyntaxTree syntaxTree, int i) {
        try {
            if (v5) {
                iy.EQ(2273245526459624409L, this, syntaxTree, new Integer(i));
            }
            FileEntry file = syntaxTree.getFile();
            if (!this.Hw.Hw(file.getId())) {
                this.Hw.VH(file.getId(), new a(this.j6));
            }
            this.Hw.v5(file.getId()).j6(file.getVersion());
            syntaxTree.getLanguage().getSignatureAnalyzer().v5(syntaxTree);
            this.FH.DW(file, syntaxTree.getLanguage(), i);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 2273245526459624409L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4523608531484560035L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (v5) {
                iy.tp(1975525444341189792L, this, storeInputStream);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 1975525444341189792L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 43395639673268275L)
    public void rN(SyntaxTree syntaxTree) {
        try {
            if (v5) {
                iy.tp(-4153839470639028352L, this, syntaxTree);
            }
            this.Hw.v5(syntaxTree.getFile().getId()).j6(0L);
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -4153839470639028352L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -6527888657741620179L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (v5) {
                iy.tp(2142830409390325452L, this, storeOutputStream);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 2142830409390325452L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 5130790187484114744L)
    public void tp(FileEntry fileEntry, Language language, int i) {
        try {
            if (v5) {
                iy.we(-4123635890121158615L, this, fileEntry, language, new Integer(i));
            }
            this.Hw.v5(fileEntry.getId()).DW(i, -1, this.j6.identifierSpace.get("new"), false, null, -1);
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -4123635890121158615L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2491015185046377L)
    public void u7(FileEntry fileEntry, Language language, int i, Member member) {
        try {
            if (v5) {
                iy.J0(-2477776470900294144L, this, fileEntry, language, new Integer(i), member);
            }
            this.Hw.v5(fileEntry.getId()).VH(i, member);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, -2477776470900294144L, this, fileEntry, language, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = -2992223780318591225L)
    public void v5(FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (v5) {
                iy.J0(-15386304335165120L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.Hw.v5(fileEntry.getId()).Hw(i, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, -15386304335165120L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1199162004195692472L)
    public ListOf<Member> we(SyntaxTree syntaxTree, int i) {
        try {
            if (v5) {
                iy.EQ(253873916728852573L, this, syntaxTree, new Integer(i));
            }
            return this.FH.Hw(syntaxTree, i);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 253873916728852573L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }
}
