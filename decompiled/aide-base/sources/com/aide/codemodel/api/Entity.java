package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.y1;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;

@cy(clazz = 3091211355621814035L, container = 3091211355621814035L, user = true)
/* loaded from: classes.dex */
public abstract class Entity {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -3016463939925410483L)
    private final FileSpace DW;

    @dy(field = -1812272055819256440L)
    private int FH;

    @dy(field = 44520228824574177L)
    private final EntitySpace j6;

    static {
        iy.Zo(Entity.class);
    }

    @ey(method = 16694052775425824L)
    public Entity(FileSpace fileSpace, EntitySpace entitySpace) {
        try {
            if (Hw) {
                iy.EQ(-5945430865859731317L, null, fileSpace, entitySpace);
            }
            this.j6 = entitySpace;
            this.DW = fileSpace;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -5945430865859731317L, null, fileSpace, entitySpace);
            }
            throw th;
        }
    }

    @ey(method = 6751602609300519495L)
    public int DW() {
        try {
            if (!Hw) {
                return -1;
            }
            iy.gn(130865449371280995L, this);
            return -1;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 130865449371280995L, this);
            }
            throw th;
        }
    }

    @ey(method = -521169359838122408L)
    public String EQ() {
        try {
            if (!Hw) {
                return null;
            }
            iy.gn(-30816168344222400L, this);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -30816168344222400L, this);
            }
            throw th;
        }
    }

    @ey(method = 81109495823984545L)
    public String FH() {
        try {
            if (Hw) {
                iy.gn(7026474921549569761L, this);
            }
            return this.j6.oY(this);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 7026474921549569761L, this);
            }
            throw th;
        }
    }

    @ey(method = 18517519516292416L)
    public int J8() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(5360656096701397836L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 5360656096701397836L, this);
            }
            throw th;
        }
    }

    @ey(method = -118456727465926157L)
    public int Mr() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(5346620395120324635L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 5346620395120324635L, this);
            }
            throw th;
        }
    }

    @ey(method = -579586445436202845L)
    public int QX() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(-86332603077239865L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -86332603077239865L, this);
            }
            throw th;
        }
    }

    @ey(method = -560783250569747796L)
    public int U2() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(4821502408814776384L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 4821502408814776384L, this);
            }
            throw th;
        }
    }

    @ey(method = 5394654051462749027L)
    public int Ws() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(-2469560169562506733L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2469560169562506733L, this);
            }
            throw th;
        }
    }

    @ey(method = -4219530798603819645L)
    public int Zo() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(-3349419743437400857L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -3349419743437400857L, this);
            }
            throw th;
        }
    }

    @ey(method = 5548653913743928960L)
    public int a8() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(463451198947209300L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 463451198947209300L, this);
            }
            throw th;
        }
    }

    @ey(method = 6432923593295154192L)
    public ClassType getEnclosingClassType() {
        try {
            if (!Hw) {
                return null;
            }
            iy.gn(1284381904473755928L, this);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1284381904473755928L, this);
            }
            throw th;
        }
    }

    @ey(method = -2426836698110522800L)
    public FileEntry getFile() {
        try {
            if (!Hw) {
                return null;
            }
            iy.gn(-2075445635947343760L, this);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2075445635947343760L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = 1508873296460697600L)
    public String getFullyQualifiedNameString() {
        long fullyQualifiedNameString = -1873808331444597780;
        try {
            if (Hw) {
                iy.gn(-1873808331444597780L, this);
            }
            if (getLanguage().getCodeRenderer() == null) {
                return "";
            }
            fullyQualifiedNameString = getLanguage().getCodeRenderer().getFullyQualifiedNameString(this);
            return fullyQualifiedNameString;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, fullyQualifiedNameString, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = -3353053921920835608L)
    public String getHTMLString() {
        long hTMLString = 2941961060510501136;
        try {
            if (Hw) {
                iy.gn(2941961060510501136L, this);
            }
            if (getLanguage().getCodeRenderer() == null) {
                return "";
            }
            hTMLString = getLanguage().getCodeRenderer().getHTMLString(this);
            return hTMLString;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, hTMLString, this);
            }
            throw th;
        }
    }

    @ey(method = -146765808602228625L)
    public int getId() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(229355711983395855L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 229355711983395855L, this);
            }
            throw th;
        }
    }

    @ey(method = -251613867323323337L)
    public int getIdentifier() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(-4055204696803213281L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -4055204696803213281L, this);
            }
            throw th;
        }
    }

    @ey(method = 2155474218958402056L)
    public Language getLanguage() {
        try {
            if (Hw) {
                iy.gn(-572083171358031864L, this);
            }
            return this.DW.getLanguage(this.FH);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -572083171358031864L, this);
            }
            throw th;
        }
    }

    @ey(method = 3396772635003047856L)
    public int getModifiers() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(2362449499358597880L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2362449499358597880L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = 2841471542541870528L)
    public String getNameString() {
        long nameString = -1238879461921243856;
        try {
            if (Hw) {
                iy.gn(-1238879461921243856L, this);
            }
            if (getLanguage().getCodeRenderer() == null) {
                return "";
            }
            nameString = getLanguage().getCodeRenderer().getNameString(this);
            return nameString;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, nameString, this);
            }
            throw th;
        }
    }

    @ey(method = 985270712077084455L)
    public boolean isArrayType() {
        try {
            if (Hw) {
                iy.gn(-1644828627261769225L, this);
            }
            return this instanceof ArrayType;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1644828627261769225L, this);
            }
            throw th;
        }
    }

    @ey(method = 3038412350622506000L)
    public boolean isClassType() {
        try {
            if (Hw) {
                iy.gn(212609930446551900L, this);
            }
            return this instanceof ClassType;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 212609930446551900L, this);
            }
            throw th;
        }
    }

    @ey(method = 2887932362793920088L)
    public boolean isMember() {
        try {
            if (Hw) {
                iy.gn(-1806588453531639592L, this);
            }
            return this instanceof Member;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1806588453531639592L, this);
            }
            throw th;
        }
    }

    @ey(method = -6728168123415617440L)
    public boolean isMethodParameterType() {
        try {
            if (Hw) {
                iy.gn(5506123317957703508L, this);
            }
            return this instanceof MethodParameterType;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 5506123317957703508L, this);
            }
            throw th;
        }
    }

    @ey(method = -2190867534294283040L)
    public boolean isMethodParameterTypeVariable() {
        try {
            if (Hw) {
                iy.gn(438098811500716032L, this);
            }
            return this instanceof MethodParameterTypeVariable;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 438098811500716032L, this);
            }
            throw th;
        }
    }

    @ey(method = 3995272968759412323L)
    public boolean isNamespace() {
        try {
            if (Hw) {
                iy.gn(1082929037224904043L, this);
            }
            return this instanceof Namespace;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1082929037224904043L, this);
            }
            throw th;
        }
    }

    @ey(method = -1046331526619699379L)
    public boolean isParameterType() {
        try {
            if (Hw) {
                iy.gn(4718209407422905609L, this);
            }
            return this instanceof ParameterType;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 4718209407422905609L, this);
            }
            throw th;
        }
    }

    @ey(method = 1445386844379206529L)
    public boolean isParameterizedType() {
        try {
            if (Hw) {
                iy.gn(6858308041257987237L, this);
            }
            return this instanceof ParameterizedType;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 6858308041257987237L, this);
            }
            throw th;
        }
    }

    @ey(method = 2059393310025176257L)
    public boolean isPointerType() {
        try {
            if (Hw) {
                iy.gn(-1997850885849529707L, this);
            }
            return this instanceof PointerType;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1997850885849529707L, this);
            }
            throw th;
        }
    }

    @ey(method = 3739523302686271443L)
    public boolean isPrimitiveType() {
        try {
            if (Hw) {
                iy.gn(-2387113772941119165L, this);
            }
            return this instanceof PrimitiveType;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2387113772941119165L, this);
            }
            throw th;
        }
    }

    @ey(method = -1666269195328741476L)
    public boolean isType() {
        try {
            if (Hw) {
                iy.gn(-904117650879194528L, this);
            }
            return this instanceof Type;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -904117650879194528L, this);
            }
            throw th;
        }
    }

    @ey(method = -737434650310758281L)
    public int j3() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(-5355673430291792289L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -5355673430291792289L, this);
            }
            throw th;
        }
    }

    @ey(method = 1577315443035425921L)
    public void j6(Language language) {
        try {
            if (Hw) {
                iy.tp(-572014759548391831L, this, language);
            }
            this.FH = this.DW.getLanguageId(language);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -572014759548391831L, this, language);
            }
            throw th;
        }
    }

    @ey(method = 3636350109401213020L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (Hw) {
                iy.tp(6019967505924994336L, this, storeInputStream);
            }
            this.FH = storeInputStream.readInt();
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 6019967505924994336L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = -3601621185611735083L)
    public boolean ro() {
        try {
            if (Hw) {
                iy.gn(-2489643244220016863L, this);
            }
            if (!y1.gn(getModifiers())) {
                if (!y1.FH(getModifiers())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2489643244220016863L, this);
            }
            throw th;
        }
    }

    @ey(method = -2634842377108876544L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (Hw) {
                iy.tp(-7046726584844572120L, this, storeOutputStream);
            }
            storeOutputStream.writeInt(this.FH);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -7046726584844572120L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 1339210555396636440L)
    public String u7() {
        try {
            if (Hw) {
                iy.gn(-810787462930310400L, this);
            }
            return this.j6.Ev(this);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -810787462930310400L, this);
            }
            throw th;
        }
    }

    @ey(method = 3329294474807079239L)
    public int v5() {
        try {
            if (!Hw) {
                return 0;
            }
            iy.gn(2304186534256667555L, this);
            return 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2304186534256667555L, this);
            }
            throw th;
        }
    }

    @ey(method = 708862848684156345L)
    public boolean yS() {
        try {
            if (Hw) {
                iy.gn(-3173610091232860931L, this);
            }
            return ro();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -3173610091232860931L, this);
            }
            throw th;
        }
    }
}
