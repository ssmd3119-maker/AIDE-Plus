package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.abstraction.Language;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -1312398249373355088L, container = -1312398249373355088L, user = true)
/* loaded from: classes.dex */
public class SourceEntity implements Parcelable {

    @dy(field = -3088115572369423800L)
    public static final Parcelable.Creator<SourceEntity> CREATOR;

    @gy
    private static /* synthetic */ boolean oy;

    @fy
    private static /* synthetic */ boolean pN;

    @dy(field = -707371902918837208L)
    private boolean AL;

    @dy(field = -4048976699675757765L)
    private boolean Cz;

    @dy(field = -3425412910260213145L)
    private String Gj;

    @dy(field = -2068246423507323949L)
    private String Jl;

    @dy(field = -2357708861394986620L)
    private int Q6;

    @dy(field = 1957349020293775296L)
    private b WB;

    @dy(field = -3684538001382930237L)
    private int Z1;

    @dy(field = 2636277753683923040L)
    private int cT;

    @dy(field = -4859515447131089537L)
    private boolean e3;

    @dy(field = 2092396873114920768L)
    private boolean eU;

    @dy(field = -1616322167588518400L)
    private String fN;

    @dy(field = 1959648583043512413L)
    private String fY;

    @dy(field = 1959091523153603584L)
    private int hK;

    @dy(field = -1015950153367200620L)
    private int iW;

    @dy(field = 32451126798560535L)
    private boolean jw;

    @dy(field = 2007317553720455172L)
    private String k2;

    @dy(field = 1607149220989711616L)
    private int kf;

    @dy(field = -1897066917862176L)
    private boolean mb;

    @dy(field = 514721870411288727L)
    private int n5;

    @dy(field = -3401695162001181769L)
    private String pO;

    @dy(field = 3199597601703995605L)
    private int q7;

    @dy(field = 5724554883483934040L)
    private String qp;

    @dy(field = -4493481305657251968L)
    private boolean sE;

    @dy(field = -2798750230776970952L)
    private String sg;

    @dy(field = 1846614633420150352L)
    private List<SourceEntity> w9;

    @dy(field = -1644938551828553712L)
    private String zh;

    @cy(clazz = 5154911136011082599L, container = -1312398249373355088L, user = true)
    static class a implements Parcelable.Creator<SourceEntity> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 3229141067480338143L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -517328159761627199L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public SourceEntity[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(5809895092742938879L, this, i);
                }
                return new SourceEntity[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 5809895092742938879L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 1620886512836736444L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public SourceEntity createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(553118307436281256L, this, parcel);
                }
                return new SourceEntity(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 553118307436281256L, this, parcel);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 4796058122810226020L, container = 4796058122810226020L, user = true)
    public static final class b {

        @dy(field = -2612648211045490152L)
        public static final b Class;

        @dy(field = 471591874355367163L)
        public static final b Comment;

        @dy(field = 3380055383298583220L)
        public static final b Constructor;

        @dy(field = -2524944464647928820L)
        public static final b Event;

        @dy(field = -2493681799095443040L)
        public static final b Field;

        @dy(field = 2446065938020699864L)
        public static final b File;

        @dy(field = 142061534752149184L)
        private static final /* synthetic */ b[] Jl;

        @dy(field = 2345584659886078059L)
        public static final b Keyword;

        @dy(field = -1854618276625072416L)
        public static final b Language;

        @dy(field = -2312314009439920839L)
        public static final b Method;

        @dy(field = 2701729651406521680L)
        public static final b Package;

        @dy(field = -2930782458562761921L)
        public static final b Parameter;

        @dy(field = 1825984112821021881L)
        public static final b Property;

        @dy(field = -2111505535692298080L)
        public static final b Region;

        @dy(field = 2477406192440092536L)
        public static final b Type;

        @dy(field = -6479666149357723505L)
        public static final b UnknownIdentifier;

        @dy(field = 2957631430047654500L)
        public static final b Variable;

        @gy
        private static /* synthetic */ boolean eU;

        @fy
        private static /* synthetic */ boolean iW;

        static {
            try {
                iy.Zo(b.class);
                if (iW) {
                    iy.gn(-3308560645145193165L, null);
                }
                Method = new b("Method", 0);
                Field = new b("Field", 1);
                Property = new b("Property", 2);
                Event = new b("Event", 3);
                Class = new b("Class", 4);
                Type = new b("Type", 5);
                Package = new b("Package", 6);
                Variable = new b("Variable", 7);
                Region = new b("Region", 8);
                Comment = new b("Comment", 9);
                Language = new b("Language", 10);
                Parameter = new b("Parameter", 11);
                Keyword = new b("Keyword", 12);
                UnknownIdentifier = new b("UnknownIdentifier", 13);
                Constructor = new b("Constructor", 14);
                b bVar = new b("File", 15);
                File = bVar;
                Jl = new b[]{Method, Field, Property, Event, Class, Type, Package, Variable, Region, Comment, Language, Parameter, Keyword, UnknownIdentifier, Constructor, bVar};
            } catch (Throwable th) {
                if (eU) {
                    iy.aM(th, -3308560645145193165L, null);
                }
                throw th;
            }
        }

        @ey(method = -214426508445764560L)
        private b(String str, int i) {
            try {
                if (iW) {
                    iy.EQ(947069178046389180L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (eU) {
                    iy.Mr(th, 947069178046389180L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 596682979605591675L)
        public static b valueOf(String str) {
            try {
                if (iW) {
                    iy.tp(-43743621503899977L, null, str);
                }
                return (b) Enum.valueOf(b.class, str);
            } catch (Throwable th) {
                if (eU) {
                    iy.j3(th, -43743621503899977L, null, str);
                }
                throw th;
            }
        }

        @ey(method = -2278461064810089175L)
        public static b[] values() {
            try {
                if (iW) {
                    iy.gn(-2154222551104925707L, null);
                }
                return (b[]) Jl.clone();
            } catch (Throwable th) {
                if (eU) {
                    iy.aM(th, -2154222551104925707L, null);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(SourceEntity.class);
            if (pN) {
                iy.gn(916592422100561619L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 916592422100561619L, null);
            }
            throw th;
        }
    }

    @ey(method = 6104654314093151L)
    public SourceEntity(Parcel parcel) {
        try {
            if (pN) {
                iy.tp(2122931970922772015L, null, parcel);
            }
            this.WB = b.values()[parcel.readInt()];
            boolean z = true;
            this.mb = parcel.readInt() != 0;
            this.jw = parcel.readInt() != 0;
            this.fY = parcel.readString();
            this.Gj = parcel.readString();
            this.qp = parcel.readString();
            this.k2 = parcel.readString();
            this.zh = parcel.readString();
            this.AL = parcel.readInt() != 0;
            this.Cz = parcel.readInt() != 0;
            this.hK = parcel.readInt();
            this.cT = parcel.readInt();
            this.q7 = parcel.readInt();
            this.Z1 = parcel.readInt();
            this.n5 = parcel.readInt();
            this.Q6 = parcel.readInt();
            this.kf = parcel.readInt();
            this.Jl = parcel.readString();
            this.iW = parcel.readInt();
            this.eU = parcel.readInt() != 0;
            this.e3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            this.sE = z;
            this.sg = parcel.readString();
            this.pO = parcel.readString();
            this.fN = parcel.readString();
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 2122931970922772015L, null, parcel);
            }
            throw th;
        }
    }

    @ey(method = 776199044076464727L)
    private void DW(Entity entity) {
        try {
            if (pN) {
                iy.tp(1832227168403501403L, this, entity);
            }
            this.fN = entity.EQ();
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 1832227168403501403L, this, entity);
            }
            throw th;
        }
    }

    @ey(method = 441762876420578680L)
    private String EQ(FileSpace fileSpace, EntitySpace entitySpace) {
        try {
            if (pN) {
                iy.EQ(102051399339641952L, this, fileSpace, entitySpace);
            }
            Entity entity = entitySpace.getEntity(this.iW);
            if (entity.isParameterizedType()) {
                entity = ((ParameterizedType) entity).getClassType();
            }
            String hTMLString = entity.getHTMLString();
            this.k2 = hTMLString;
            return hTMLString;
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 102051399339641952L, this, fileSpace, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = -159189164620440696L)
    private void VH(Model model, Member member) {
        try {
            if (pN) {
                iy.EQ(-2338284894556405416L, this, model, member);
            }
            this.zh = "";
            if (member.e9()) {
                this.zh += "(";
                for (int i = 0; i < member.oY(); i++) {
                    if (i > 0) {
                        this.zh += ", ";
                    }
                    try {
                        this.zh += member.qp(i).getNameString() + " ";
                    } catch (e4 unused) {
                        this.zh += "";
                    }
                    this.zh += model.identifierSpace.getString(member.CU(i));
                }
                this.zh += ")";
            }
            try {
                if (member.WB().getSemantic() != 1) {
                    this.zh += " : " + member.WB().getNameString();
                }
            } catch (e4 unused2) {
                this.zh += "";
            }
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -2338284894556405416L, this, model, member);
            }
            throw th;
        }
    }

    @ey(method = -3700978008927477292L)
    public void FH() {
        try {
            if (pN) {
                iy.gn(-3489740171466342708L, this);
            }
            this.sE = true;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3489740171466342708L, this);
            }
            throw th;
        }
    }

    @ey(method = -440079633311118444L)
    public void Hw(Model model) {
        try {
            if (pN) {
                iy.tp(7420363187724540L, this, model);
            }
            j6(model);
            this.Cz = true;
            this.eU = true;
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 7420363187724540L, this, model);
            }
            throw th;
        }
    }

    @ey(method = -4856035192604864743L)
    public String J0() {
        try {
            if (pN) {
                iy.gn(-2431051041779470443L, this);
            }
            return this.Gj != null ? this.Gj : we();
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2431051041779470443L, this);
            }
            throw th;
        }
    }

    @ey(method = 2875135853225952439L)
    public String J8() {
        try {
            if (pN) {
                iy.gn(-4034404094054586485L, this);
            }
            return this.sg;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -4034404094054586485L, this);
            }
            throw th;
        }
    }

    @ey(method = 3485645872040957241L)
    public String Mr() {
        try {
            if (pN) {
                iy.gn(-2238304174053457195L, this);
            }
            return this.fY;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2238304174053457195L, this);
            }
            throw th;
        }
    }

    @ey(method = 77120215575641073L)
    public synchronized int QX() {
        try {
            if (pN) {
                iy.gn(-5856710280193112691L, this);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5856710280193112691L, this);
            }
            throw th;
        }
        return this.q7;
    }

    @ey(method = -5816509829178499464L)
    public String U2() {
        try {
            if (pN) {
                iy.gn(-1816596100588634640L, this);
            }
            return this.pO;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1816596100588634640L, this);
            }
            throw th;
        }
    }

    @ey(method = -844220482313483165L)
    public String Ws() {
        try {
            if (pN) {
                iy.gn(1943523971409435879L, this);
            }
            if (this.fN == null) {
                return null;
            }
            if (this.fN.startsWith("java/") || this.fN.startsWith("javax/") || this.fN.startsWith("org/") || this.fN.startsWith("android/")) {
                return this.fN;
            }
            return null;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1943523971409435879L, this);
            }
            throw th;
        }
    }

    @ey(method = 4563488547365301644L)
    public synchronized int XL() {
        try {
            if (pN) {
                iy.gn(4177381733189925492L, this);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 4177381733189925492L, this);
            }
            throw th;
        }
        return this.hK;
    }

    @ey(method = 763039993172977111L)
    protected synchronized void Zo(FileSpace fileSpace, SyntaxTreeSpace syntaxTreeSpace, EntitySpace entitySpace) {
        try {
            if (pN) {
                iy.we(-1504377028070106045L, this, fileSpace, syntaxTreeSpace, entitySpace);
            }
            Entity entity = entitySpace.getEntity(this.iW);
            if (entity != null) {
                if (entity.isParameterizedType()) {
                    entity = ((ParameterizedType) entity).getClassType();
                }
                if (entity.isNamespace()) {
                    this.jw = true;
                    this.k2 = EQ(fileSpace, entitySpace);
                    this.qp = "";
                } else {
                    this.jw = true;
                    this.mb = true;
                    this.k2 = EQ(fileSpace, entitySpace);
                    this.qp = entity.u7();
                    FileEntry file = entity.getFile();
                    this.Jl = file == null ? "" : file.getPathString();
                    this.hK = entity.Ws();
                    this.cT = entity.QX();
                    this.q7 = entity.J8();
                    this.Z1 = entity.Zo();
                    this.n5 = entity.v5();
                }
            }
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, -1504377028070106045L, this, fileSpace, syntaxTreeSpace, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = 7009985925050001655L)
    public String a8() {
        try {
            if (pN) {
                iy.gn(6449925985465078323L, this);
            }
            return this.zh;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 6449925985465078323L, this);
            }
            throw th;
        }
    }

    @ey(method = 957031174774759752L)
    public synchronized int aM() {
        try {
            if (pN) {
                iy.gn(-396108393497593800L, this);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -396108393497593800L, this);
            }
            throw th;
        }
        return this.cT;
    }

    @Override // android.os.Parcelable
    @ey(method = 5473365359648337424L)
    public int describeContents() {
        try {
            if (!pN) {
                return 0;
            }
            iy.gn(-5689616711206268080L, this);
            return 0;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5689616711206268080L, this);
            }
            throw th;
        }
    }

    @ey(method = 574651655434905939L)
    public boolean equals(Object obj) {
        try {
            if (pN) {
                iy.tp(-214772627794748625L, this, obj);
            }
            if ((obj instanceof SourceEntity) && this.iW != -1) {
                if (this.iW == ((SourceEntity) obj).iW) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -214772627794748625L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -563473212602462343L)
    public boolean er() {
        try {
            if (pN) {
                iy.gn(1660750921960594565L, this);
            }
            return this.eU;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, 1660750921960594565L, this);
            }
            throw th;
        }
    }

    @ey(method = 5092172013254502528L)
    public boolean gW() {
        try {
            if (pN) {
                iy.gn(-6045820265636981520L, this);
            }
            return this.Cz;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -6045820265636981520L, this);
            }
            throw th;
        }
    }

    @ey(method = -411593962599586305L)
    protected void gn(Model model, Type type) {
        try {
            if (pN) {
                iy.EQ(1440514181831214187L, this, model, type);
            }
            Entity entity = model.entitySpace.getEntity(this.iW);
            try {
                if (entity.isMember() && ((Member) entity).Gj()) {
                    if (type.isArrayType() || type.isPointerType()) {
                        type = model.entitySpace.getRootClasstype(entity.getFile(), entity.getLanguage());
                    }
                    while (type.isMethodParameterType()) {
                        type = type.x9();
                    }
                    while (type.isParameterType()) {
                        type = type.x9();
                    }
                    return;
                }
                if (entity.isMember() && ((Member) entity).e9()) {
                    if (type.isArrayType() || type.isPointerType()) {
                        type = model.entitySpace.getRootClasstype(entity.getFile(), entity.getLanguage());
                    }
                    while (type.isMethodParameterType()) {
                        type = type.x9();
                    }
                    while (type.isParameterType()) {
                        type = type.x9();
                    }
                }
            } catch (e4 unused) {
            }
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 1440514181831214187L, this, model, type);
            }
            throw th;
        }
    }

    @ey(method = -3360662461499749045L)
    public b j3() {
        try {
            if (pN) {
                iy.gn(-2015771008032042777L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -2015771008032042777L, this);
            }
            throw th;
        }
    }

    @ey(method = -1484579230983451504L)
    protected void j6(Model model) {
        Entity namespace;
        try {
            if (pN) {
                iy.tp(752412978066761240L, this, model);
            }
            Entity entity = model.entitySpace.getEntity(this.iW);
            if (entity.isMember() && ((Member) entity).Gj()) {
                namespace = ((Member) entity).getEnclosingClassType();
            } else if (entity.isMember() && ((Member) entity).e9()) {
                if (((Member) entity).iW()) {
                    ClassType enclosingClassType = ((Member) entity).getEnclosingClassType();
                    if (enclosingClassType.isToplevel()) {
                        enclosingClassType.getNamespace();
                        return;
                    }
                    namespace = enclosingClassType.getEnclosingClassType();
                } else {
                    namespace = ((Member) entity).getEnclosingClassType();
                }
            } else if (entity.isClassType() && !((ClassType) entity).isToplevel()) {
                namespace = entity.getEnclosingClassType();
            } else if (!entity.isClassType() || !((ClassType) entity).isToplevel()) {
                return;
            } else {
                namespace = ((ClassType) entity).getNamespace();
            }
            this.sg = namespace.getFullyQualifiedNameString();
            if (namespace.getFile() == null || !namespace.getFile().getExtensionString().contains(".js")) {
                return;
            }
            this.sg = namespace.getFile().getFullNameString();
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, 752412978066761240L, this, model);
            }
            throw th;
        }
    }

    @ey(method = 1594094356814817627L)
    public boolean lg() {
        try {
            if (pN) {
                iy.gn(-3983849593057310865L, this);
            }
            return this.AL;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3983849593057310865L, this);
            }
            throw th;
        }
    }

    @ey(method = 2320151748701170688L)
    public boolean rN() {
        try {
            if (pN) {
                iy.gn(-259445476755352576L, this);
            }
            return this.e3;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -259445476755352576L, this);
            }
            throw th;
        }
    }

    @ey(method = 1972070886811414805L)
    public String toString() {
        try {
            if (pN) {
                iy.gn(-1595787802106563095L, this);
            }
            return this.fY;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1595787802106563095L, this);
            }
            throw th;
        }
    }

    @ey(method = -2774809358586933339L)
    protected int tp() {
        try {
            if (pN) {
                iy.gn(-3188298385545977319L, this);
            }
            return this.iW;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3188298385545977319L, this);
            }
            throw th;
        }
    }

    @ey(method = -1566063167746883765L)
    public synchronized String u7() {
        try {
            if (pN) {
                iy.gn(-5804322842405221625L, this);
            }
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -5804322842405221625L, this);
            }
            throw th;
        }
        return this.Jl;
    }

    @ey(method = 1132289370870656013L)
    protected void v5(Model model, Type type) {
        Type typeZh;
        try {
            if (pN) {
                iy.EQ(7776216930577253913L, this, model, type);
            }
            Entity entity = model.entitySpace.getEntity(this.iW);
            if (entity.isMember() && ((Member) entity).e9()) {
                if (type != null) {
                    try {
                        if (type.isMethodParameterType()) {
                            type = type.x9();
                        }
                        if (type.isParameterType()) {
                            type = type.x9();
                        }
                    } catch (e4 unused) {
                    }
                }
                int iOY = ((Member) entity).oY();
                this.w9 = new ArrayList(iOY);
                for (int i = ((Member) entity).fN() ? 1 : 0; i < iOY; i++) {
                    String string = model.identifierSpace.getString(((Member) entity).CU(i));
                    int iFN = ((Member) entity).FN(i);
                    if (i == iOY - 1 && ((Member) entity).Z1() && ((Member) entity).Eq() == 0) {
                        iFN |= 4194304;
                    }
                    if (type != null) {
                        try {
                            typeZh = ((Member) entity).zh(type, i);
                        } catch (e4 unused2) {
                            this.w9.add(new SourceEntity(model, string, null, 0));
                        }
                    } else {
                        typeZh = null;
                    }
                    this.w9.add(new SourceEntity(model, string, typeZh, iFN));
                }
            }
        } catch (Throwable th) {
            Type type2 = type;
            if (oy) {
                iy.Mr(th, 7776216930577253913L, this, model, type2);
            }
            throw th;
        }
    }

    @ey(method = -798900065154415296L)
    public String we() {
        try {
            if (pN) {
                iy.gn(-3119125608962076912L, this);
            }
            String strMr = Mr();
            if (j3() != b.Method) {
                return strMr;
            }
            if (lg()) {
                return strMr + "(";
            }
            return strMr + "()";
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -3119125608962076912L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 3533495969186747235L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (pN) {
                iy.EQ(-3754747998253598553L, this, parcel, new Integer(i));
            }
            parcel.writeInt(this.WB.ordinal());
            int i2 = 1;
            parcel.writeInt(this.mb ? 1 : 0);
            parcel.writeInt(this.jw ? 1 : 0);
            parcel.writeString(this.fY);
            parcel.writeString(this.Gj);
            parcel.writeString(this.qp);
            parcel.writeString(this.k2);
            parcel.writeString(this.zh);
            parcel.writeInt(this.AL ? 1 : 0);
            parcel.writeInt(this.Cz ? 1 : 0);
            parcel.writeInt(this.hK);
            parcel.writeInt(this.cT);
            parcel.writeInt(this.q7);
            parcel.writeInt(this.Z1);
            parcel.writeInt(this.n5);
            parcel.writeInt(this.Q6);
            parcel.writeInt(this.kf);
            parcel.writeString(this.Jl);
            parcel.writeInt(this.iW);
            parcel.writeInt(this.eU ? 1 : 0);
            parcel.writeInt(this.e3 ? 1 : 0);
            if (!this.sE) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.sg);
            parcel.writeString(this.pO);
            parcel.writeString(this.fN);
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -3754747998253598553L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4839638574151904693L)
    public boolean yS() {
        try {
            if (pN) {
                iy.gn(-1034803091747892591L, this);
            }
            return this.sE;
        } catch (Throwable th) {
            if (oy) {
                iy.aM(th, -1034803091747892591L, this);
            }
            throw th;
        }
    }

    @ey(method = -86114944798008387L)
    protected SourceEntity(String str) {
        try {
            if (pN) {
                iy.tp(-330700381504816443L, null, str);
            }
            this.WB = b.Keyword;
            this.fY = str;
            this.jw = true;
            this.qp = "";
            this.k2 = "<code><b><font color=\"#2A50D0\">" + str + "</font></b></code>";
        } catch (Throwable th) {
            if (oy) {
                iy.j3(th, -330700381504816443L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -202038934098617792L)
    protected SourceEntity(Model model, List<Variable> list) {
        try {
            if (pN) {
                iy.EQ(-433283644798890264L, null, model, list);
            }
            this.WB = b.Method;
            this.jw = true;
            this.qp = "";
            this.k2 = "";
            this.w9 = new ArrayList();
            Iterator<Variable> it = list.iterator();
            while (it.hasNext()) {
                this.w9.add(new SourceEntity(model, false, it.next()));
            }
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -433283644798890264L, null, model, list);
            }
            throw th;
        }
    }

    @ey(method = -2133481081304517585L)
    protected SourceEntity(Model model, Language language, List<SourceEntity> list) {
        try {
            if (pN) {
                iy.we(217871936129120895L, null, model, language, list);
            }
            this.WB = b.Language;
            this.fY = language.getName();
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, 217871936129120895L, null, model, language, list);
            }
            throw th;
        }
    }

    @ey(method = -5864512394013504L)
    protected SourceEntity(String str, boolean z) {
        try {
            if (pN) {
                iy.EQ(1480508002136880752L, null, str, new Boolean(z));
            }
            this.WB = b.UnknownIdentifier;
            this.fY = str;
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 1480508002136880752L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -66118165088599601L)
    private SourceEntity(Model model, String str, Type type, int i) {
        try {
            if (pN) {
                iy.J0(-6565776876995433849L, null, model, str, type, new Integer(i));
            }
            this.WB = b.Parameter;
            this.fY = str;
        } catch (Throwable th) {
            if (oy) {
                iy.a8(th, -6565776876995433849L, null, model, str, type, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3532622015294970080L)
    protected SourceEntity(Model model, boolean z, Variable variable) {
        String str = "";
        try {
            if (pN) {
                iy.we(-100474066830619768L, null, model, new Boolean(z), variable);
            }
            this.WB = b.Variable;
            this.e3 = z;
            this.fY = model.identifierSpace.getString(variable.getIdentifier());
            this.Jl = variable.getFile().getPathString();
            this.hK = variable.getLine();
            this.q7 = variable.getEndColumn();
            this.cT = variable.getStartColumn();
            this.mb = true;
            this.k2 = variable.getHTMLString();
            this.qp = "";
            this.jw = true;
            if (variable.getType() != null) {
                str = " : " + variable.getType().getNameString();
            }
            this.zh = str;
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, -100474066830619768L, null, model, new Boolean(z), variable);
            }
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 3028892251077112512L)
    protected SourceEntity(Model model, Entity entity, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<SourceEntity> list) {
        this(model, entity, i, i2, i3, i4, i5, i6, i7);
        if (pN) {
            iy.QX(-788556571284343456L, null, new Object[]{model, entity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), list});
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 317481303184024864L)
    protected SourceEntity(Model model, Entity entity, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(model, entity);
        try {
            if (pN) {
                iy.QX(-3656280194566152136L, null, new Object[]{model, entity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
            }
            this.mb = true;
            this.Z1 = i6;
            this.n5 = i7;
            this.Q6 = i4;
            this.kf = i5;
            this.hK = i;
            this.cT = i2;
            this.q7 = i3;
        } catch (Throwable th) {
            if (oy) {
                iy.rN(th, -3656280194566152136L, null, new Object[]{model, entity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
            }
            throw th;
        }
    }

    @ey(method = 160353790889759704L)
    protected SourceEntity(Model model, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<SourceEntity> list) {
        if (pN) {
            iy.QX(-1261026129521073792L, null, new Object[]{model, str, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), list});
        }
        if (z) {
            this.WB = b.Comment;
        } else {
            this.WB = b.Region;
        }
        this.fY = str;
        this.mb = true;
        this.Z1 = i6;
        this.n5 = i7;
        this.Q6 = i4;
        this.kf = i5;
        this.hK = i;
        this.cT = i2;
        this.q7 = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 2544506820722125504L)
    protected SourceEntity(Model model, Entity entity, boolean z) {
        this(model, entity);
        try {
            if (pN) {
                iy.we(97737713797204600L, null, model, entity, new Boolean(z));
            }
            this.eU = z;
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, 97737713797204600L, null, model, entity, new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = -1384678929099689920L)
    protected SourceEntity(Model model, boolean z, Entity entity) {
        this(model, entity);
        try {
            if (pN) {
                iy.we(-190335178738571704L, null, model, new Boolean(z), entity);
            }
            this.e3 = z;
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, -190335178738571704L, null, model, new Boolean(z), entity);
            }
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 619869536340838036L)
    protected SourceEntity(Model model, Entity entity, int i) {
        this(model, entity);
        try {
            if (pN) {
                iy.we(-57494647891193900L, null, model, entity, new Integer(i));
            }
            if (entity.isClassType()) {
                this.WB = b.Class;
                this.fY = entity.getNameString();
                if (entity.DW() == 0) {
                    return;
                }
                entity.getModifiers();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, -57494647891193900L, null, model, entity, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 1816883795658742605L)
    protected SourceEntity(Model model, Entity entity, String str) {
        this(model, entity);
        try {
            if (pN) {
                iy.we(-561862493192233299L, null, model, entity, str);
            }
            this.Gj = str;
        } catch (Throwable th) {
            if (oy) {
                iy.U2(th, -561862493192233299L, null, model, entity, str);
            }
            throw th;
        }
    }

    @ey(method = -62663252430834525L)
    protected SourceEntity(Model model, Entity entity) {
        try {
            if (pN) {
                iy.EQ(965647056534922523L, null, model, entity);
            }
            this.iW = entity.getId();
            if (entity.isMember() && ((Member) entity).Gj()) {
                if (((Member) entity).sM()) {
                    this.WB = b.Property;
                } else if (((Member) entity).sE()) {
                    this.WB = b.Event;
                } else {
                    this.WB = b.Field;
                }
                this.fY = entity.getNameString();
                entity.getModifiers();
                VH(model, (Member) entity);
                DW(entity);
                return;
            }
            if (entity.isMember() && ((Member) entity).e9()) {
                if (((Member) entity).iW()) {
                    this.WB = b.Constructor;
                } else if (((Member) entity).a5()) {
                    this.WB = b.Property;
                } else {
                    this.WB = b.Method;
                }
                this.fY = entity.getNameString();
                this.AL = ((Member) entity).oY() > 0;
                entity.getModifiers();
                VH(model, (Member) entity);
                DW(entity);
                return;
            }
            if (entity.isClassType()) {
                this.WB = b.Class;
                this.fY = ((ClassType) entity).gG();
                if (!((ClassType) entity).isToplevel()) {
                    entity.getModifiers();
                }
                if (((ClassType) entity).isToplevel()) {
                    ((ClassType) entity).getNamespace();
                }
                DW(entity);
                return;
            }
            if (entity.isParameterizedType()) {
                this.WB = b.Class;
                ClassType classType = ((ParameterizedType) entity).getClassType();
                this.fY = entity.getNameString();
                if (!classType.isToplevel()) {
                    classType.getModifiers();
                }
                if (classType.isToplevel()) {
                    classType.getNamespace();
                    return;
                }
                return;
            }
            if (entity.isNamespace()) {
                this.WB = b.Package;
                this.fY = entity.getNameString();
            } else {
                this.WB = b.Type;
                this.fY = entity.getNameString();
            }
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, 965647056534922523L, null, model, entity);
            }
            throw th;
        }
    }

    @ey(method = -401752829117207315L)
    public SourceEntity(AIDEModel aIDEModel, FileEntry fileEntry) {
        try {
            if (pN) {
                iy.EQ(-1601528672772992403L, null, aIDEModel, fileEntry);
            }
            this.WB = b.File;
            this.fY = fileEntry.getFullNameString();
            this.hK = 1;
            this.cT = 1;
            this.q7 = 1;
            this.Jl = fileEntry.getPathString();
            this.mb = true;
            this.pO = fileEntry.getParentDirectory().nw(aIDEModel.fileSpace.QX(fileEntry.gn()).getParentDirectory());
        } catch (Throwable th) {
            if (oy) {
                iy.Mr(th, -1601528672772992403L, null, aIDEModel, fileEntry);
            }
            throw th;
        }
    }
}
