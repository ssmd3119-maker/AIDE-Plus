package com.aide.codemodel.api.abstraction;

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
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.SetOf;
import java.util.List;
import java.util.Set;

@cy(clazz = -5352777506294366535L, container = -5352777506294366535L, user = true)
/* loaded from: classes.dex */
public interface Tools {

    @cy(clazz = 251786462056345840L, container = 251786462056345840L, user = true)
    public static class a {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 173852027004644283L)
        public final boolean DW;

        @dy(field = -644320179270359784L)
        public final boolean FH;

        @dy(field = -1757282584519921173L)
        public final int Hw;

        @dy(field = 1428824996729052040L)
        public final int j6;

        @dy(field = -3564060963337837031L)
        public final Language v5;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 5766346700798856799L)
        public a(Language language, int i, boolean z, boolean z2, int i2) {
            try {
                if (Zo) {
                    iy.J8(-100374515425617048L, null, language, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2));
                }
                this.v5 = language;
                this.j6 = i;
                this.DW = z;
                this.FH = z2;
                this.Hw = i2;
            } catch (Throwable th) {
                if (VH) {
                    iy.lg(th, -100374515425617048L, null, language, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -6527558540118155680L)
        public a DW(int i) {
            try {
                if (Zo) {
                    iy.u7(-5619319870480360380L, this, i);
                }
                return new a(this.v5, this.j6 + i, this.DW, this.FH, this.Hw);
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -5619319870480360380L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -951390888425952095L)
        public a j6(a aVar, Language language) {
            try {
                if (Zo) {
                    iy.EQ(79039430538067263L, this, aVar, language);
                }
                if (aVar.FH && aVar.Hw < this.Hw) {
                    return aVar;
                }
                if (this.FH && this.Hw < aVar.Hw) {
                    return this;
                }
                if (!aVar.DW && !this.DW) {
                    return aVar.Hw > this.Hw ? this : this.Hw > aVar.Hw ? aVar : language == this.v5 ? this : language == aVar.v5 ? aVar : new a(this.v5, 0, false, true, 0);
                }
                if (aVar.DW && !this.DW) {
                    return new a(this.v5, aVar.j6 + this.j6, false, false, this.Hw);
                }
                if (!this.DW || aVar.DW) {
                    return this;
                }
                return new a(aVar.v5, aVar.j6 + this.j6, false, false, aVar.Hw);
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, 79039430538067263L, this, aVar, language);
                }
                throw th;
            }
        }
    }

    @ey(method = -2492472389996683555L)
    void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2);

    @ey(method = 1618803230991420375L)
    void DW(FileEntry fileEntry, int i, int i2);

    @ey(method = 1411478978235385185L)
    String EQ(Namespace namespace);

    @ey(method = -2654898842409420848L)
    boolean FH(String str);

    @ey(method = 898158059501523968L)
    void Hw(FileEntry fileEntry, int i, int i2, boolean z);

    @ey(method = 166146707927192320L)
    void I(FileEntry fileEntry, int i, int i2, int i3, int i4);

    @ey(method = -2635449268002789051L)
    void J0(FileEntry fileEntry, int i, int i2);

    @ey(method = 2270960716236462999L)
    void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2);

    @ey(method = -1988655726326259915L)
    String KD(Namespace namespace);

    @ey(method = 2810473252498835208L)
    void Mr(FileEntry fileEntry, int i, int i2);

    @ey(method = 721944238621843056L)
    String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf);

    @ey(method = 4039634288215062741L)
    void P8(FileEntry fileEntry, int i, int i2);

    @ey(method = 1434573305649381083L)
    boolean QX(FileEntry fileEntry, int i, int i2);

    @ey(method = -85524085937939560L)
    void SI(FileEntry fileEntry, int i, int i2, int i3, int i4);

    @ey(method = -3320221448633825355L)
    void Sf(SyntaxTree syntaxTree, int i, int i2);

    @ey(method = 1596699410217654512L)
    boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5);

    @ey(method = 3726995408847976320L)
    void VH(FileEntry fileEntry);

    @ey(method = 1103830788420203300L)
    String Ws();

    @ey(method = 438924440931001333L)
    HashtableOfInt<a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3);

    @ey(method = -510422787372564864L)
    void Zo(FileEntry fileEntry, int i, int i2);

    @ey(method = 3575900223472683728L)
    void a8(FileEntry fileEntry, int i, int i2, int i3, Type type);

    @ey(method = -3351370949160288417L)
    String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2);

    @ey(method = -2725477020607374036L)
    String ca(Namespace namespace);

    @ey(method = -235352833747204712L)
    String cb(SyntaxTree syntaxTree, int i, int i2, Type type);

    @ey(method = -2401098589074599392L)
    void cn(FileEntry fileEntry, int i, int i2);

    @ey(method = -669414403599912175L)
    void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list);

    @ey(method = -568260669342464112L)
    String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf);

    @ey(method = 208179548255762325L)
    String ei(String str, String str2);

    @ey(method = 6881452571976165880L)
    void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2);

    @ey(method = -1331504847151421095L)
    void g3(FileEntry fileEntry, int i, int i2);

    @ey(method = -41660614951025004L)
    void gW(FileEntry fileEntry, int i, int i2, Member member);

    @ey(method = 449616310575490123L)
    void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z);

    @ey(method = -4122055527892638320L)
    Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i);

    @ey(method = -6864349481468324631L)
    HashtableOfInt<a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3);

    @ey(method = 802272183646792773L)
    void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2);

    @ey(method = 2667966303518909700L)
    HashtableOfInt<a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3);

    @ey(method = 2625164436858364940L)
    void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4);

    @ey(method = -2273302964416920416L)
    void ro(FileEntry fileEntry, int i, int i2, String str, int i3);

    @ey(method = -1760381361232279543L)
    void sG(FileEntry fileEntry, String str);

    @ey(method = -771640258691813949L)
    void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type);

    @ey(method = 1077773413942987443L)
    void tp(FileEntry fileEntry, int i, int i2, int i3, int i4);

    @ey(method = 80830346353826715L)
    void u7(FileEntry fileEntry, int i, int i2, int i3, int i4);

    @ey(method = 389540847834571173L)
    int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2);

    @ey(method = -7178444990355451728L)
    String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf);

    @ey(method = -113136049521474440L)
    void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5);

    @ey(method = 169454932940584200L)
    void we(FileEntry fileEntry, int i, int i2);

    @ey(method = -151477320633925319L)
    void x9(FileEntry fileEntry, int i, int i2, int i3, int i4);

    @ey(method = -1246621559127476149L)
    void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z);
}
