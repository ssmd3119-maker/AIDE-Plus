package abcd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Stack;

@cy(clazz = -1460212878662313655L, container = -1460212878662313655L, user = true)
/* loaded from: classes.dex */
public class r8 implements Comparable<r8> {

    @fy
    private static /* synthetic */ boolean fY;

    @gy
    private static /* synthetic */ boolean qp;

    @dy(field = -1424376388939250705L)
    private String WB;

    @dy(field = -1931374314078176664L)
    private d jw;

    @dy(field = 3542931010070439884L)
    private String mb;

    @cy(clazz = 1533382638691418928L, container = 1533382638691418928L, user = true)
    private interface c {
        @ey(method = 1443186011438863056L)
        int Hw(c cVar);

        @ey(method = 2947283569415701557L)
        boolean VH();

        @ey(method = 179666182851090268L)
        int j6();
    }

    @cy(clazz = 747606365424800L, container = 747606365424800L, user = true)
    private static class d extends ArrayList<c> implements c {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 64427380325098992L)
        private d() {
            try {
                if (WB) {
                    iy.gn(736122560506450381L, null);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 736122560506450381L, null);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = -1002792827106607680L)
        public int Hw(c cVar) {
            int iHw;
            try {
                if (WB) {
                    iy.tp(-7207965597189450016L, this, cVar);
                }
                if (cVar == null) {
                    if (size() == 0) {
                        return 0;
                    }
                    return get(0).Hw(null);
                }
                int iJ6 = cVar.j6();
                if (iJ6 == 0) {
                    return -1;
                }
                if (iJ6 == 1) {
                    return 1;
                }
                if (iJ6 != 2) {
                    throw new RuntimeException("invalid item: " + cVar.getClass());
                }
                Iterator<c> it = iterator();
                Iterator<c> it2 = ((d) cVar).iterator();
                do {
                    if (!it.hasNext() && !it2.hasNext()) {
                        return 0;
                    }
                    c next = it.hasNext() ? it.next() : null;
                    c next2 = it2.hasNext() ? it2.next() : null;
                    iHw = next == null ? next2 == null ? 0 : next2.Hw(next) * (-1) : next.Hw(next2);
                } while (iHw == 0);
                return iHw;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -7207965597189450016L, this, cVar);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = 2293798871510534615L)
        public boolean VH() {
            try {
                if (WB) {
                    iy.gn(500720853907416625L, this);
                }
                return size() == 0;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 500720853907416625L, this);
                }
                throw th;
            }
        }

        @ey(method = -114932812940325921L)
        public void gn() {
            try {
                if (WB) {
                    iy.gn(-2719012174969671003L, this);
                }
                for (int size = size() - 1; size >= 0; size--) {
                    c cVar = get(size);
                    if (cVar.VH()) {
                        remove(size);
                    } else if (!(cVar instanceof d)) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2719012174969671003L, this);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = -117083332004640040L)
        public int j6() {
            try {
                if (!WB) {
                    return 2;
                }
                iy.gn(338142897389317332L, this);
                return 2;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 338142897389317332L, this);
                }
                throw th;
            }
        }

        @Override // java.util.AbstractCollection
        @ey(method = 3239330136003734256L)
        public String toString() {
            try {
                if (WB) {
                    iy.gn(736398819651900128L, this);
                }
                StringBuilder sb = new StringBuilder();
                Iterator<c> it = iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (sb.length() > 0) {
                        sb.append(next instanceof d ? '-' : '.');
                    }
                    sb.append(next);
                }
                return sb.toString();
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 736398819651900128L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 2587508070596995693L)
        public /* synthetic */ d(a aVar) {
            this();
            try {
                if (WB) {
                    iy.tp(-712218056732227248L, null, aVar);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -712218056732227248L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1055930869170351317L, container = -1055930869170351317L, user = true)
    private static class e implements c {

        @dy(field = 2748159092301665952L)
        private static final Properties fY;

        @dy(field = -1895846271452337884L)
        private static final List<String> jw;

        @fy
        private static /* synthetic */ boolean k2;

        @dy(field = 3317977557344360493L)
        private static final String[] mb;

        @dy(field = 3081925986686209165L)
        private static final String qp;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -268496375778969741L)
        private String WB;

        static {
            try {
                iy.Zo(e.class);
                if (k2) {
                    iy.gn(1898297870649907125L, null);
                }
                String[] strArr = {"alpha", "beta", "milestone", "rc", "snapshot", "", "sp"};
                mb = strArr;
                jw = Arrays.asList(strArr);
                Properties properties = new Properties();
                fY = properties;
                properties.put("ga", "");
                fY.put("final", "");
                fY.put("cr", "rc");
                qp = String.valueOf(jw.indexOf(""));
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 1898297870649907125L, null);
                }
                throw th;
            }
        }

        @ey(method = 44180749586908620L)
        public e(String str, boolean z) {
            try {
                if (k2) {
                    iy.EQ(2415721068422486556L, null, str, new Boolean(z));
                }
                if (z && str.length() == 1) {
                    char cCharAt = str.charAt(0);
                    if (cCharAt == 'a') {
                        str = "alpha";
                    } else if (cCharAt == 'b') {
                        str = "beta";
                    } else if (cCharAt == 'm') {
                        str = "milestone";
                    }
                }
                this.WB = fY.getProperty(str, str);
            } catch (Throwable th) {
                String str2 = str;
                if (zh) {
                    iy.Mr(th, 2415721068422486556L, null, str2, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = -5570810120012910759L)
        public static String DW(String str) {
            try {
                if (k2) {
                    iy.tp(7355471253388156591L, null, str);
                }
                int iIndexOf = jw.indexOf(str);
                if (iIndexOf != -1) {
                    return String.valueOf(iIndexOf);
                }
                return jw.size() + "-" + str;
            } catch (Throwable th) {
                if (zh) {
                    iy.j3(th, 7355471253388156591L, null, str);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = 327113364060795463L)
        public int Hw(c cVar) {
            try {
                if (k2) {
                    iy.tp(1107548100777402985L, this, cVar);
                }
                if (cVar == null) {
                    return DW(this.WB).compareTo(qp);
                }
                int iJ6 = cVar.j6();
                if (iJ6 == 0) {
                    return -1;
                }
                if (iJ6 == 1) {
                    return DW(this.WB).compareTo(DW(((e) cVar).WB));
                }
                if (iJ6 == 2) {
                    return -1;
                }
                throw new RuntimeException("invalid item: " + cVar.getClass());
            } catch (Throwable th) {
                if (zh) {
                    iy.j3(th, 1107548100777402985L, this, cVar);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = -2491144547387111400L)
        public boolean VH() {
            try {
                if (k2) {
                    iy.gn(-789190354493361024L, this);
                }
                return DW(this.WB).compareTo(qp) == 0;
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -789190354493361024L, this);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = -980946086079940443L)
        public int j6() {
            try {
                if (!k2) {
                    return 1;
                }
                iy.gn(-2627697121644318185L, this);
                return 1;
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -2627697121644318185L, this);
                }
                throw th;
            }
        }

        @ey(method = -2087509284370101571L)
        public String toString() {
            try {
                if (k2) {
                    iy.gn(-610071543723639573L, this);
                }
                return this.WB;
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -610071543723639573L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(r8.class);
    }

    @ey(method = 99941403635074233L)
    public r8(String str) {
        try {
            if (fY) {
                iy.tp(-5767460496745112985L, null, str);
            }
            FH(str);
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, -5767460496745112985L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2875617724441088292L)
    private static c DW(boolean z, String str) {
        try {
            if (fY) {
                iy.EQ(-73346663230456896L, null, new Boolean(z), str);
            }
            return z ? new b(str) : new e(str, false);
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, -73346663230456896L, null, new Boolean(z), str);
            }
            throw th;
        }
    }

    @ey(method = -2521856032504563960L)
    public final void FH(String str) {
        try {
            if (fY) {
                iy.tp(2161889048641676544L, this, str);
            }
            this.WB = str;
            a aVar = null;
            this.jw = new d(aVar);
            str = str.toLowerCase(Locale.ENGLISH);
            d dVar = this.jw;
            Stack stack = new Stack();
            stack.push(dVar);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '.') {
                    if (i2 == i) {
                        dVar.add(b.jw);
                    } else {
                        dVar.add(DW(z, str.substring(i, i2)));
                    }
                    i = i2 + 1;
                } else if (cCharAt == '-') {
                    if (i2 == i) {
                        dVar.add(b.jw);
                    } else {
                        dVar.add(DW(z, str.substring(i, i2)));
                    }
                    i = i2 + 1;
                    d dVar2 = new d(aVar);
                    dVar.add(dVar2);
                    stack.push(dVar2);
                    dVar = dVar2;
                } else if (Character.isDigit(cCharAt)) {
                    if (!z && i2 > i) {
                        dVar.add(new e(str.substring(i, i2), true));
                        d dVar3 = new d(aVar);
                        dVar.add(dVar3);
                        stack.push(dVar3);
                        dVar = dVar3;
                        i = i2;
                    }
                    z = true;
                } else {
                    if (z && i2 > i) {
                        dVar.add(DW(true, str.substring(i, i2)));
                        d dVar4 = new d(aVar);
                        dVar.add(dVar4);
                        stack.push(dVar4);
                        dVar = dVar4;
                        i = i2;
                    }
                    z = false;
                }
            }
            if (str.length() > i) {
                dVar.add(DW(z, str.substring(i)));
            }
            while (!stack.isEmpty()) {
                ((d) stack.pop()).gn();
            }
            this.mb = this.jw.toString();
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 2161889048641676544L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 690391028793898275L)
    public boolean equals(Object obj) {
        try {
            if (fY) {
                iy.tp(-134299394752996165L, this, obj);
            }
            if (obj instanceof r8) {
                if (this.mb.equals(((r8) obj).mb)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, -134299394752996165L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -624613840327296864L)
    public int hashCode() {
        try {
            if (fY) {
                iy.gn(-435553030471432412L, this);
            }
            return this.mb.hashCode();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -435553030471432412L, this);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    @ey(method = -695896645263104604L)
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compareTo(r8 r8Var) {
        try {
            if (fY) {
                iy.tp(674599437896716800L, this, r8Var);
            }
            return this.jw.Hw(r8Var.jw);
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 674599437896716800L, this, r8Var);
            }
            throw th;
        }
    }

    @ey(method = 222034039120630545L)
    public String toString() {
        try {
            if (fY) {
                iy.gn(356371423290141525L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 356371423290141525L, this);
            }
            throw th;
        }
    }

    @cy(clazz = -229905734400161776L, container = -229905734400161776L, user = true)
    private static class b implements c {

        @fy
        private static /* synthetic */ boolean fY;

        @dy(field = 736661338081977825L)
        public static final b jw;

        @dy(field = 4530311638317777295L)
        private static final BigInteger mb;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 2228017611410994912L)
        private final BigInteger WB;

        static {
            try {
                iy.Zo(b.class);
                if (fY) {
                    iy.gn(-427401817245496424L, null);
                }
                mb = new BigInteger("0");
                jw = new b();
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -427401817245496424L, null);
                }
                throw th;
            }
        }

        @ey(method = 502183691695410004L)
        private b() {
            try {
                if (fY) {
                    iy.gn(-4154892002128791045L, null);
                }
                this.WB = mb;
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -4154892002128791045L, null);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = 657500318870155200L)
        public int Hw(c cVar) {
            try {
                if (fY) {
                    iy.tp(509934663258007680L, this, cVar);
                }
                if (cVar == null) {
                    return !mb.equals(this.WB) ? 1 : 0;
                }
                int iJ6 = cVar.j6();
                if (iJ6 == 0) {
                    return this.WB.compareTo(((b) cVar).WB);
                }
                if (iJ6 == 1 || iJ6 == 2) {
                    return 1;
                }
                throw new RuntimeException("invalid item: " + cVar.getClass());
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 509934663258007680L, this, cVar);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = 2867201412280364833L)
        public boolean VH() {
            try {
                if (fY) {
                    iy.gn(-1104276537499426809L, this);
                }
                return mb.equals(this.WB);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -1104276537499426809L, this);
                }
                throw th;
            }
        }

        @Override // abcd.r8.c
        @ey(method = 354827915057752500L)
        public int j6() {
            try {
                if (!fY) {
                    return 0;
                }
                iy.gn(-2123444763669442520L, this);
                return 0;
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -2123444763669442520L, this);
                }
                throw th;
            }
        }

        @ey(method = -3684626516443193640L)
        public String toString() {
            try {
                if (fY) {
                    iy.gn(-2781154060174802196L, this);
                }
                return this.WB.toString();
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -2781154060174802196L, this);
                }
                throw th;
            }
        }

        @ey(method = -7106655838654800L)
        public b(String str) {
            try {
                if (fY) {
                    iy.tp(627397875733203317L, null, str);
                }
                this.WB = new BigInteger(str);
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 627397875733203317L, null, str);
                }
                throw th;
            }
        }
    }
}
