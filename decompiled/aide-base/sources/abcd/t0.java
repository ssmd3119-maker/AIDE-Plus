package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@cy(clazz = 340607572698323840L, container = 340607572698323840L, user = true)
/* loaded from: classes.dex */
public class t0 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1535582088253125792L)
    private List<String> DW;

    @dy(field = -1420197080429944196L)
    private final AIDEModel j6;

    @cy(clazz = -1304760401210103625L, container = 340607572698323840L, user = true)
    class a implements TemplateEvaluatorCallback {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -141460787544614340L)
        public a() {
        }

        @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
        @ey(method = 32431588288574093L)
        public void DW(Entity entity) {
            try {
                if (DW) {
                    iy.tp(5843747300076298340L, this, entity);
                }
                t0.this.DW.add(entity.getNameString());
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 5843747300076298340L, this, entity);
                }
                throw th;
            }
        }

        @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
        @ey(method = 4153834158028992321L)
        public void FH() {
            try {
                if (DW) {
                    iy.gn(-3546895911870232108L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3546895911870232108L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
        @ey(method = -3322740256380855524L)
        public void Hw(String str) {
            try {
                if (DW) {
                    iy.tp(1438973874983006175L, this, str);
                }
                t0.this.DW.add(str);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1438973874983006175L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
        @ey(method = -4593764233001891004L)
        public void j6() {
            try {
                if (DW) {
                    iy.gn(1191040061015753271L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1191040061015753271L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.codemodel.api.callback.TemplateEvaluatorCallback
        @ey(method = 1755217675734064472L)
        public void v5(Variable variable) {
            try {
                if (DW) {
                    iy.tp(-2719557777232928125L, this, variable);
                }
                t0.this.DW.add(t0.this.j6.identifierSpace.getString(variable.getIdentifier()));
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -2719557777232928125L, this, variable);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1304889476635432900L, container = 340607572698323840L, user = true)
    static /* synthetic */ class b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -4069071667463827296L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(b.class);
                if (DW) {
                    iy.gn(1133788793453881355L, null);
                }
                int[] iArr = new int[c.values().length];
                j6 = iArr;
                try {
                    iArr[c.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[c.DOLLAR_READ.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[c.DOLLAR_NUMBER_READ.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[c.DOLLAR_PAREN_READ.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1133788793453881355L, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 4820548802342387328L, container = 4820548802342387328L, user = true)
    private static final class c {

        @dy(field = 5771517785451500820L)
        public static final c DOLLAR_NUMBER_READ;

        @dy(field = 253668929672137807L)
        public static final c DOLLAR_PAREN_READ;

        @dy(field = 1318322202870435900L)
        public static final c DOLLAR_READ;

        @dy(field = -1278772349581971965L)
        public static final c START;

        @fy
        private static /* synthetic */ boolean k2;

        @dy(field = 1130916338982618093L)
        private static final /* synthetic */ c[] qp;

        @gy
        private static /* synthetic */ boolean zh;

        static {
            try {
                iy.Zo(c.class);
                if (k2) {
                    iy.gn(-440410237080866745L, null);
                }
                START = new c("START", 0);
                DOLLAR_READ = new c("DOLLAR_READ", 1);
                DOLLAR_NUMBER_READ = new c("DOLLAR_NUMBER_READ", 2);
                c cVar = new c("DOLLAR_PAREN_READ", 3);
                DOLLAR_PAREN_READ = cVar;
                qp = new c[]{START, DOLLAR_READ, DOLLAR_NUMBER_READ, cVar};
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -440410237080866745L, null);
                }
                throw th;
            }
        }

        @ey(method = -118229739546468643L)
        private c(String str, int i) {
            try {
                if (k2) {
                    iy.EQ(1298458570599949248L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (zh) {
                    iy.Mr(th, 1298458570599949248L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -764531088161789052L)
        public static c valueOf(String str) {
            try {
                if (k2) {
                    iy.tp(245931603353716811L, null, str);
                }
                return (c) Enum.valueOf(c.class, str);
            } catch (Throwable th) {
                if (zh) {
                    iy.j3(th, 245931603353716811L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 1853150766664029184L)
        public static c[] values() {
            try {
                if (k2) {
                    iy.gn(2377543822108765865L, null);
                }
                return (c[]) qp.clone();
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 2377543822108765865L, null);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(t0.class);
    }

    @ey(method = -911902861567683319L)
    public t0(AIDEModel aIDEModel) {
        try {
            if (FH) {
                iy.tp(-1779991663647602448L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1779991663647602448L, null, aIDEModel);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @abcd.ey(method = 4825787225887631723L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> FH(java.lang.String r19, int r20, java.util.Map<java.lang.String, java.lang.String> r21, com.aide.codemodel.api.FileEntry r22, int r23, int r24, com.aide.codemodel.api.abstraction.Language r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.t0.FH(java.lang.String, int, java.util.Map, com.aide.codemodel.api.FileEntry, int, int, com.aide.codemodel.api.abstraction.Language):java.util.List");
    }

    @ey(method = 335884553739459185L)
    private List<String> Hw(String str, List<String> list, FileEntry fileEntry, int i, int i2, Language language) throws Throwable {
        int i3;
        try {
            if (FH) {
                iy.QX(6723055715128127960L, this, new Object[]{str, list, fileEntry, new Integer(i), new Integer(i2), language});
            }
            this.DW = new ArrayList();
            i3 = 6;
            try {
                language.getTools().dx(new a(), fileEntry, i, i2, str, list);
                return this.DW;
            } catch (Throwable th) {
                th = th;
                if (Hw) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = str;
                    objArr[1] = list;
                    objArr[2] = fileEntry;
                    objArr[3] = new Integer(i);
                    objArr[4] = new Integer(i2);
                    objArr[5] = language;
                    iy.rN(th, 6723055715128127960L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
        }
    }

    @ey(method = -1472725045402226016L)
    private List<Integer> VH(String str) {
        try {
            if (FH) {
                iy.tp(-35370548446501285L, this, str);
            }
            ArrayList arrayList = new ArrayList();
            c cVar = c.START;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                int i2 = b.j6[cVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4 && cCharAt == ')') {
                                cVar = c.DOLLAR_NUMBER_READ;
                            }
                        } else if (cCharAt == '$') {
                            if (stringBuffer.length() > 0) {
                                try {
                                    arrayList.add(Integer.valueOf(Integer.parseInt(stringBuffer.toString())));
                                } catch (NumberFormatException unused) {
                                }
                            }
                            cVar = c.START;
                        } else if (cCharAt == '(') {
                            cVar = c.DOLLAR_PAREN_READ;
                        }
                    } else if (cCharAt == '$') {
                        if (stringBuffer.length() > 0) {
                            try {
                                arrayList.add(Integer.valueOf(Integer.parseInt(stringBuffer.toString())));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        cVar = c.START;
                    } else if (cCharAt == '(') {
                        cVar = c.DOLLAR_PAREN_READ;
                    } else if (cCharAt < '0' || cCharAt > '9') {
                        cVar = c.DOLLAR_NUMBER_READ;
                    } else {
                        stringBuffer.append(cCharAt);
                    }
                } else if (cCharAt == '$') {
                    stringBuffer.setLength(0);
                    cVar = c.DOLLAR_READ;
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -35370548446501285L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1577985851696311795L)
    private String Zo(String str) {
        try {
            if (FH) {
                iy.tp(2117559930838360020L, this, str);
            }
            return (str.startsWith("$") && str.endsWith("$")) ? str.substring(1, str.length() - 1) : "";
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2117559930838360020L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 5138338570135835075L)
    private int gn(String str) {
        try {
            if (FH) {
                iy.tp(60144035012393200L, this, str);
            }
            try {
                return str.indexOf(61) == -1 ? Integer.parseInt(str) : Integer.parseInt(str.substring(0, str.indexOf(61)));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 60144035012393200L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2914420775136453632L)
    private List<String> v5(String str, Map<String, String> map, FileEntry fileEntry, int i, int i2, Language language) throws Throwable {
        int i3;
        char c2;
        try {
            if (FH) {
                iy.QX(-4492688182664606281L, this, new Object[]{str, map, fileEntry, new Integer(i), new Integer(i2), language});
            }
            if (str.indexOf(61) == -1) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf(61) + 1, str.length());
            if (strSubstring.indexOf(40) == -1) {
                return null;
            }
            String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf(40));
            String strSubstring3 = strSubstring.substring(strSubstring.indexOf(40) + 1, strSubstring.length() - 1);
            ArrayList arrayList = new ArrayList();
            if (strSubstring3.length() > 0) {
                for (int i4 = -1; strSubstring3.indexOf(44) != i4; i4 = -1) {
                    String strSubstring4 = strSubstring3.substring(0, strSubstring3.indexOf(44));
                    if (map.containsKey(Zo(strSubstring4))) {
                        strSubstring4 = map.get(Zo(strSubstring4));
                    }
                    arrayList.add(strSubstring4);
                    strSubstring3 = strSubstring3.substring(strSubstring3.indexOf(44) + 1, strSubstring3.length());
                }
                if (map.containsKey(Zo(strSubstring3))) {
                    strSubstring3 = map.get(Zo(strSubstring3));
                }
                arrayList.add(strSubstring3);
            }
            c2 = 0;
            i3 = 6;
            try {
                return Hw(strSubstring2, arrayList, fileEntry, i, i2, language);
            } catch (Throwable th) {
                th = th;
                if (Hw) {
                    Object[] objArr = new Object[i3];
                    objArr[c2] = str;
                    objArr[1] = map;
                    objArr[2] = fileEntry;
                    objArr[3] = new Integer(i);
                    objArr[4] = new Integer(i2);
                    objArr[5] = language;
                    iy.rN(th, -4492688182664606281L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
            c2 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    @abcd.ey(method = -2944099675004927159L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int u7(java.util.Map<java.lang.String, java.lang.String> r26, java.lang.String r27, int r28, int r29, com.aide.codemodel.api.FileEntry r30, int r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.t0.u7(java.util.Map, java.lang.String, int, int, com.aide.codemodel.api.FileEntry, int, int):int");
    }
}
