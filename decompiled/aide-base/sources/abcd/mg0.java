package abcd;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public class mg0 extends AbstractMap<String, k70> {
    private final String WB;
    private lg0<k70> fY;
    private lg0<k70> jw;
    private boolean k2;
    private lg0<k70> mb;
    private int qp;
    private Set<Map.Entry<String, k70>> zh;

    class a extends AbstractSet<Map.Entry<String, k70>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mg0.this.mb = lg0.EQ();
            mg0.this.jw = lg0.EQ();
            mg0.this.fY = lg0.EQ();
            mg0.this.qp = 0;
            mg0.this.k2 = true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mg0.this.k2 ? mg0.this.qp == 0 : !iterator().hasNext();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<String, k70>> iterator() {
            return mg0.this.new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            if (!mg0.this.k2) {
                mg0.this.qp = 0;
                Iterator<Map.Entry<String, k70>> it = mg0.this.entrySet().iterator();
                while (it.hasNext()) {
                    mg0.this.qp++;
                    it.next();
                }
                mg0.this.k2 = true;
            }
            return mg0.this.qp;
        }
    }

    private class b implements Map.Entry<String, k70> {
        private k70 WB;

        public b(k70 k70Var) {
            this.WB = k70Var;
        }

        @Override // java.util.Map.Entry
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public k70 getValue() {
            return this.WB;
        }

        @Override // java.util.Map.Entry
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public k70 setValue(k70 k70Var) {
            k70 k70VarPut = mg0.this.put(getKey(), k70Var);
            this.WB = k70Var;
            return k70VarPut;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key instanceof String) || !(value instanceof k70)) {
                return false;
            }
            k70 k70Var = (k70) value;
            if (!k70Var.getName().equals(this.WB.getName())) {
                return false;
            }
            a70 a70VarDW = k70Var.DW();
            a70 a70VarDW2 = this.WB.DW();
            return (a70VarDW == null || a70VarDW2 == null || !j60.Mr(a70VarDW, a70VarDW2)) ? false : true;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return mg0.this.QX(this.WB);
        }

        public String toString() {
            return this.WB.toString();
        }
    }

    private class c implements Iterator<Map.Entry<String, k70>> {
        private int WB;
        private Map.Entry<String, k70> fY;
        private int jw;
        private int mb;

        public c() {
            if (mg0.this.WB.length() > 0) {
                this.WB = -(mg0.this.mb.J8(mg0.this.WB) + 1);
                this.mb = -(mg0.this.jw.J8(mg0.this.WB) + 1);
                this.jw = -(mg0.this.fY.J8(mg0.this.WB) + 1);
            }
        }

        private k70 FH(k70 k70Var) {
            if (this.jw < mg0.this.fY.size()) {
                k70 k70VarWs = mg0.this.fY.Ws(this.jw);
                int iFH = l70.FH(k70Var, k70VarWs);
                if (iFH == 0) {
                    this.jw++;
                    return k70VarWs;
                }
                if (iFH > 0) {
                    throw new IllegalStateException();
                }
            }
            return k70Var;
        }

        private b Hw(k70 k70Var) {
            if (k70Var.getName().startsWith(mg0.this.WB)) {
                return mg0.this.new b(k70Var);
            }
            this.WB = mg0.this.mb.size();
            this.mb = mg0.this.jw.size();
            this.jw = mg0.this.fY.size();
            return null;
        }

        public Map.Entry<String, k70> DW() {
            if (this.WB < mg0.this.mb.size() && this.mb < mg0.this.jw.size()) {
                k70 k70VarWs = mg0.this.mb.Ws(this.WB);
                k70 k70VarWs2 = mg0.this.jw.Ws(this.mb);
                int iFH = l70.FH(k70VarWs, k70VarWs2);
                if (iFH < 0) {
                    this.WB++;
                    return Hw(k70VarWs);
                }
                if (iFH == 0) {
                    this.WB++;
                }
                this.mb++;
                return Hw(FH(k70VarWs2));
            }
            if (this.mb < mg0.this.jw.size()) {
                lg0 lg0Var = mg0.this.jw;
                int i = this.mb;
                this.mb = i + 1;
                return Hw(FH(lg0Var.Ws(i)));
            }
            if (this.WB >= mg0.this.mb.size()) {
                return null;
            }
            lg0 lg0Var2 = mg0.this.mb;
            int i2 = this.WB;
            this.WB = i2 + 1;
            return Hw(lg0Var2.Ws(i2));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.fY == null) {
                this.fY = DW();
            }
            return this.fY != null;
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Map.Entry<String, k70> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Map.Entry<String, k70> entry = this.fY;
            this.fY = DW();
            return entry;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mg0(String str, lg0<? extends k70> lg0Var, lg0<? extends k70> lg0Var2, lg0<? extends k70> lg0Var3) {
        this.WB = str;
        this.mb = lg0Var;
        this.jw = lg0Var2;
        this.fY = lg0Var3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String QX(k70 k70Var) {
        String name = k70Var.getName();
        return this.WB.length() > 0 ? name.substring(this.WB.length()) : name;
    }

    private String XL(String str) {
        if (this.WB.length() <= 0) {
            return str;
        }
        return String.valueOf(this.WB) + str;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public k70 get(Object obj) {
        String strXL = XL((String) obj);
        k70 k70VarQX = this.fY.QX(strXL);
        if (k70VarQX == null) {
            k70VarQX = this.jw.QX(strXL);
        }
        return k70VarQX == null ? this.mb.QX(strXL) : k70VarQX;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: J8, reason: merged with bridge method [inline-methods] */
    public k70 put(String str, k70 k70Var) {
        String strXL = XL(str);
        if (!strXL.equals(k70Var.getName())) {
            throw new IllegalArgumentException();
        }
        if (!this.fY.isEmpty()) {
            Iterator<k70> it = this.fY.iterator();
            while (it.hasNext()) {
                this.jw = this.jw.aM(it.next());
            }
            this.fY = lg0.EQ();
        }
        int iJ8 = this.jw.J8(strXL);
        if (iJ8 >= 0) {
            k70 k70VarQX = this.jw.QX(strXL);
            this.jw = this.jw.Mr(iJ8, k70Var);
            return k70VarQX;
        }
        k70 k70Var2 = get(str);
        this.jw = this.jw.Hw(iJ8, k70Var);
        this.k2 = false;
        return k70Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: Ws, reason: merged with bridge method [inline-methods] */
    public k70 remove(Object obj) {
        k70 k70VarQX;
        String strXL = XL((String) obj);
        int iJ8 = this.mb.J8(strXL);
        if (iJ8 >= 0) {
            k70VarQX = this.mb.QX(strXL);
            this.mb = this.mb.j3(iJ8);
            this.k2 = false;
        } else {
            k70VarQX = null;
        }
        int iJ82 = this.jw.J8(strXL);
        if (iJ82 >= 0) {
            k70VarQX = this.jw.QX(strXL);
            this.jw = this.jw.j3(iJ82);
            this.k2 = false;
        }
        int iJ83 = this.fY.J8(strXL);
        if (iJ83 < 0) {
            return k70VarQX;
        }
        k70 k70VarQX2 = this.fY.QX(strXL);
        this.fY = this.fY.j3(iJ83);
        this.k2 = false;
        return k70VarQX2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, k70>> entrySet() {
        if (this.zh == null) {
            this.zh = new a();
        }
        return this.zh;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        for (k70 k70Var : values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(k70Var);
        }
        sb.append(']');
        return sb.toString();
    }
}
