package abcd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pz {
    private final List<m2> j6 = new ArrayList();

    static class a implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Short.valueOf((short) o2Var.J8()));
        }
    }

    static class a0 extends n2 {
        public a0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.J8() > 0;
        }
    }

    static class a1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(-o2Var.XL()));
        }
    }

    static class a2 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Character.valueOf(((char[]) o2Var.v5())[o2Var.QX()]));
        }
    }

    static class b implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Character.valueOf((char) o2Var.J8()));
        }
    }

    static class b0 extends n2 {
        public b0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.J8() <= 0;
        }
    }

    static class b1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() - o2Var.j3()));
        }
    }

    static class b2 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(((float[]) o2Var.v5())[o2Var.QX()]));
        }
    }

    static class c implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.J8()));
        }
    }

    static class c0 extends n2 {
        public c0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.v5() == o2Var.VH();
        }
    }

    static class c1 implements m2 {
        final /* synthetic */ double j6;

        public c1(double d) {
            this.j6 = d;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(this.j6));
        }
    }

    static class c2 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(((long[]) o2Var.v5())[o2Var.QX()]));
        }
    }

    static class d implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(o2Var.J8()));
        }
    }

    static class d0 extends n2 {
        public d0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.v5() != o2Var.VH();
        }
    }

    static class d1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() + o2Var.j3()));
        }
    }

    static class d2 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(((double[]) o2Var.v5())[o2Var.QX()]));
        }
    }

    static class e implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.J8()));
        }
    }

    static class e0 extends n2 {
        public e0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Ws() == o2Var.QX();
        }
    }

    static class e1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() * o2Var.j3()));
        }
    }

    static class e2 implements m2 {
        final /* synthetic */ int j6;

        public e2(int i) {
            this.j6 = i;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.U2(this.j6);
        }
    }

    static class f implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.EQ()));
        }
    }

    static class f0 extends n2 {
        public f0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Ws() >= o2Var.QX();
        }
    }

    static class f1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() / o2Var.j3()));
        }
    }

    static class f2 implements m2 {
        private boolean DW;
        final /* synthetic */ long FH;
        final /* synthetic */ String Hw;
        private Class j6;

        public f2(long j, String str) {
            this.FH = j;
            this.Hw = str;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            if (!this.DW) {
                synchronized (this) {
                    this.DW = true;
                    Class<?> clsFH = ry.FH(this.FH);
                    this.j6 = clsFH;
                    if (clsFH == null) {
                        this.j6 = a00.Zo(this.Hw);
                    }
                }
            }
            Class cls = this.j6;
            if (cls == null) {
                throw new RuntimeException("Type not found");
            }
            o2Var.Mr(cls);
        }
    }

    static class g implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf((long) o2Var.EQ()));
        }
    }

    static class g0 implements m2 {
        final /* synthetic */ int j6;

        public g0(int i) {
            this.j6 = i;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(this.j6));
        }
    }

    static class g1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() % o2Var.j3()));
        }
    }

    static class g2 implements m2 {
        private boolean DW;
        final /* synthetic */ long FH;
        final /* synthetic */ String Hw;
        private Class j6;

        public g2(long j, String str) {
            this.FH = j;
            this.Hw = str;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            if (!this.DW) {
                synchronized (this) {
                    this.DW = true;
                    Class<?> clsFH = ry.FH(this.FH);
                    this.j6 = clsFH;
                    if (clsFH == null) {
                        this.j6 = a00.Zo(this.Hw);
                    }
                }
            }
            Class cls = this.j6;
            if (cls == null) {
                throw new RuntimeException("Type not found");
            }
            o2Var.Mr(Integer.valueOf(cls.isInstance(o2Var.Hw()) ? 1 : 0));
        }
    }

    static class h implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf((int) o2Var.EQ()));
        }
    }

    static class h0 extends n2 {
        public h0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Ws() > o2Var.QX();
        }
    }

    static class h1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(-o2Var.EQ()));
        }
    }

    static class h2 implements m2 {
        private boolean DW;
        private boolean FH;
        final /* synthetic */ long Hw;
        final /* synthetic */ String Zo;
        private Field j6;
        final /* synthetic */ long v5;

        public h2(long j, long j2, String str) {
            this.Hw = j;
            this.v5 = j2;
            this.Zo = str;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            if (!this.DW) {
                synchronized (this) {
                    this.DW = true;
                    Field fieldZo = ry.Zo(this.Hw, this.v5);
                    this.j6 = fieldZo;
                    if (fieldZo == null) {
                        this.j6 = a00.FH(this.Zo);
                    }
                    this.FH = (this.j6.getModifiers() & 8) != 0;
                    this.j6.setAccessible(true);
                }
            }
            Field field = this.j6;
            if (field == null) {
                throw new RuntimeException("Field not found");
            }
            o2Var.Mr(field.get(this.FH ? null : o2Var.Hw()));
        }
    }

    static class i implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf((long) o2Var.gn()));
        }
    }

    static class i0 extends n2 {
        public i0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Ws() <= o2Var.QX();
        }
    }

    static class i1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(o2Var.we() - o2Var.J0()));
        }
    }

    static class i2 implements m2 {
        private Method DW;
        private boolean FH;
        private boolean Hw;
        final /* synthetic */ String VH;
        final /* synthetic */ long Zo;
        private Class<?>[] j6;
        final /* synthetic */ long v5;

        public i2(long j, long j2, String str) {
            this.v5 = j;
            this.Zo = j2;
            this.VH = str;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            if (!this.FH) {
                synchronized (this) {
                    boolean z = true;
                    this.FH = true;
                    Method methodVH = ry.VH(this.v5, this.Zo);
                    this.DW = methodVH;
                    if (methodVH == null) {
                        this.DW = a00.Hw(this.VH);
                    }
                    this.DW.setAccessible(true);
                    if ((this.DW.getModifiers() & 8) == 0) {
                        z = false;
                    }
                    this.Hw = z;
                    this.j6 = this.DW.getParameterTypes();
                }
            }
            if (this.DW == null) {
                throw new RuntimeException("Method not found");
            }
            o2Var.Mr(this.DW.invoke(this.Hw ? null : o2Var.Hw(), o2Var.Zo(this.j6)));
        }
    }

    static class j implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf((int) o2Var.gn()));
        }
    }

    static class j0 extends n2 {
        public j0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Ws() < o2Var.QX();
        }
    }

    static class j1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(o2Var.we() + o2Var.J0()));
        }
    }

    static class j2 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Boolean.valueOf(o2Var.J8() == 1));
        }
    }

    static class k implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.a8();
        }
    }

    static class k0 extends n2 {
        public k0(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Ws() != o2Var.QX();
        }
    }

    static class k1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(o2Var.we() * o2Var.J0()));
        }
    }

    static class k2 implements m2 {
        private Constructor DW;
        private boolean FH;
        final /* synthetic */ long Hw;
        final /* synthetic */ String Zo;
        private Class<?>[] j6;
        final /* synthetic */ long v5;

        public k2(long j, long j2, String str) {
            this.Hw = j;
            this.v5 = j2;
            this.Zo = str;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            if (!this.FH) {
                synchronized (this) {
                    this.FH = true;
                    Constructor constructorV5 = ry.v5(this.Hw, this.v5);
                    this.DW = constructorV5;
                    if (constructorV5 == null) {
                        this.DW = a00.j6(this.Zo);
                    }
                    this.DW.setAccessible(true);
                    this.j6 = this.DW.getParameterTypes();
                }
            }
            if (this.DW == null) {
                throw new RuntimeException("Constructor not found");
            }
            Object[] objArrZo = o2Var.Zo(this.j6);
            o2Var.Hw();
            o2Var.Hw();
            o2Var.Mr(this.DW.newInstance(objArrZo));
        }
    }

    static class l implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf((float) o2Var.gn()));
        }
    }

    static class l0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(o2Var.FH());
        }
    }

    static class l1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(o2Var.we() / o2Var.J0()));
        }
    }

    static class l2 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Byte.valueOf((byte) o2Var.J8()));
        }
    }

    static class m implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.XL()));
        }
    }

    static class m0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Hw();
            o2Var.lg();
        }
    }

    static class m1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(o2Var.we() % o2Var.J0()));
        }
    }

    private interface m2 {
        void j6(o2 o2Var);
    }

    static class n implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf((int) o2Var.XL()));
        }
    }

    static class n0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() | o2Var.QX()));
        }
    }

    static class n1 implements m2 {
        final /* synthetic */ float j6;

        public n1(float f) {
            this.j6 = f;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(this.j6));
        }
    }

    private static abstract class n2 implements m2 {
        private final int j6;

        public n2(JSONObject jSONObject) {
            this.j6 = jSONObject.getInt("line");
        }

        public abstract boolean DW(o2 o2Var);

        @Override // abcd.pz.m2
        public final void j6(o2 o2Var) {
            if (DW(o2Var)) {
                o2Var.DW(this.j6);
            } else {
                o2Var.lg();
            }
        }
    }

    static class o implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Float.valueOf(o2Var.XL()));
        }
    }

    static class o0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() ^ o2Var.QX()));
        }
    }

    static class o1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(-o2Var.gn()));
        }
    }

    private static class o2 {
        private Object[] FH;
        private boolean Hw;
        private Object v5;
        private int j6 = 0;
        private Stack<Object> DW = new Stack<>();

        public o2(Object[] objArr) {
            this.FH = objArr;
        }

        private float er(Object obj) {
            return ((Float) obj).floatValue();
        }

        private long gW(Object obj) {
            return ((Long) obj).longValue();
        }

        private double rN(Object obj) {
            return ((Double) obj).doubleValue();
        }

        private int yS(Object obj) {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() ? 1 : 0 : obj instanceof Byte ? ((Byte) obj).byteValue() : obj instanceof Short ? ((Short) obj).shortValue() : obj instanceof Character ? ((Character) obj).charValue() : ((Integer) obj).intValue();
        }

        public void DW(int i) {
            this.j6 = i;
        }

        public float EQ() {
            return er(Hw());
        }

        public Object FH() {
            return this.DW.peek();
        }

        public Object Hw() {
            return this.DW.pop();
        }

        public float J0() {
            float fEr = er(this.DW.pop());
            this.DW.pop();
            return fEr;
        }

        public int J8() {
            return yS(Hw());
        }

        public void Mr(Object obj) {
            this.DW.push(obj);
            this.j6++;
        }

        public int QX() {
            int iYS = yS(this.DW.pop());
            this.DW.pop();
            return iYS;
        }

        public void U2(int i) {
            this.DW.push(this.FH[i]);
            this.j6++;
        }

        public Object VH() {
            Object objPop = this.DW.pop();
            this.DW.pop();
            return objPop;
        }

        public int Ws() {
            return yS(this.DW.get(r0.size() - 2));
        }

        public long XL() {
            return gW(Hw());
        }

        public Object[] Zo(Class<?>[] clsArr) {
            Object[] objArr = new Object[clsArr.length];
            for (int length = clsArr.length - 1; length >= 0; length--) {
                objArr[length] = this.DW.pop();
                if (objArr[length] instanceof Integer) {
                    Class<?> cls = clsArr[length];
                    if (cls == Boolean.TYPE) {
                        objArr[length] = new Boolean(((Integer) objArr[length]).intValue() == 1);
                    } else if (cls == Byte.TYPE) {
                        objArr[length] = new Byte(((Integer) objArr[length]).byteValue());
                    } else if (cls == Short.TYPE) {
                        objArr[length] = new Short(((Integer) objArr[length]).shortValue());
                    } else if (cls == Character.TYPE) {
                        objArr[length] = new Character((char) ((Integer) objArr[length]).intValue());
                    }
                }
            }
            return objArr;
        }

        public void a8() {
            this.Hw = true;
            this.v5 = this.DW.pop();
        }

        public long aM() {
            return gW(this.DW.get(r0.size() - 2));
        }

        public double gn() {
            return rN(Hw());
        }

        public long j3() {
            long jGW = gW(this.DW.pop());
            this.DW.pop();
            return jGW;
        }

        public Object j6(List<m2> list) {
            for (int i = 0; i < 1000; i++) {
                m2 m2Var = list.get(this.j6);
                if (m2Var != null) {
                    m2Var.j6(this);
                    if (this.Hw) {
                        return this.v5;
                    }
                } else {
                    this.j6++;
                }
            }
            throw new RuntimeException("Infinite loop");
        }

        public void lg() {
            this.j6++;
        }

        public double tp() {
            double dRN = rN(this.DW.pop());
            this.DW.pop();
            return dRN;
        }

        public double u7() {
            return rN(this.DW.get(r0.size() - 2));
        }

        public Object v5() {
            return this.DW.get(r0.size() - 2);
        }

        public float we() {
            return er(this.DW.get(r0.size() - 2));
        }
    }

    static class p implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(((Float) o2Var.v5()).compareTo((Float) o2Var.VH())));
        }
    }

    static class p0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() & o2Var.QX()));
        }
    }

    static class p1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.u7() - o2Var.tp()));
        }
    }

    static class q implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(((Double) o2Var.v5()).compareTo((Double) o2Var.VH())));
        }
    }

    static class q0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(-o2Var.J8()));
        }
    }

    static class q1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.u7() + o2Var.tp()));
        }
    }

    static class r implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(((Long) o2Var.v5()).compareTo((Long) o2Var.VH())));
        }
    }

    static class r0 implements m2 {
        final /* synthetic */ long j6;

        public r0(long j) {
            this.j6 = j;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(this.j6));
        }
    }

    static class r1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.u7() * o2Var.tp()));
        }
    }

    static class s extends n2 {
        public s(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return true;
        }
    }

    static class s0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() - o2Var.QX()));
        }
    }

    static class s1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.u7() / o2Var.tp()));
        }
    }

    static class t extends n2 {
        public t(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Hw() == null;
        }
    }

    static class t0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() + o2Var.QX()));
        }
    }

    static class t1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Double.valueOf(o2Var.u7() % o2Var.tp()));
        }
    }

    static class u extends n2 {
        public u(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.Hw() != null;
        }
    }

    static class u0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() * o2Var.QX()));
        }
    }

    static class u1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(Array.getLength(o2Var.Hw())));
        }
    }

    static class v implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(null);
        }
    }

    static class v0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() / o2Var.QX()));
        }
    }

    static class v1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(((Object[]) o2Var.v5())[o2Var.QX()]);
        }
    }

    static class w extends n2 {
        public w(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.J8() == 0;
        }
    }

    static class w0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(o2Var.Ws() % o2Var.QX()));
        }
    }

    static class w1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Integer.valueOf(((int[]) o2Var.v5())[o2Var.QX()]));
        }
    }

    static class x extends n2 {
        public x(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.J8() != 0;
        }
    }

    static class x0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() | o2Var.j3()));
        }
    }

    static class x1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            Object objV5 = o2Var.v5();
            if (objV5 instanceof boolean[]) {
                o2Var.Mr(Boolean.valueOf(((boolean[]) objV5)[o2Var.QX()]));
            } else {
                o2Var.Mr(Byte.valueOf(((byte[]) objV5)[o2Var.QX()]));
            }
        }
    }

    static class y extends n2 {
        public y(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.J8() < 0;
        }
    }

    static class y0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() ^ o2Var.j3()));
        }
    }

    static class y1 implements m2 {
        final /* synthetic */ String j6;

        public y1(String str) {
            this.j6 = str;
        }

        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(this.j6);
        }
    }

    static class z extends n2 {
        public z(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // abcd.pz.n2
        public boolean DW(o2 o2Var) {
            return o2Var.J8() >= 0;
        }
    }

    static class z0 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Long.valueOf(o2Var.aM() & o2Var.j3()));
        }
    }

    static class z1 implements m2 {
        @Override // abcd.pz.m2
        public void j6(o2 o2Var) {
            o2Var.Mr(Short.valueOf(((short[]) o2Var.v5())[o2Var.QX()]));
        }
    }

    public pz(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                this.j6.add(j6(jSONArray.optJSONObject(i3)));
            }
        }
    }

    private static m2 j6(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        switch (jSONObject.getString("opCode")) {
            case "return":
                return new k();
            case "null":
                return new v();
            case "int":
                return new g0(Integer.parseInt(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            case "long":
                return new r0(Long.parseLong(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            case "double":
                return new c1(Double.parseDouble(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            case "float":
                return new n1(Float.parseFloat(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            case "string":
                return new y1(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            case "i2z":
                return new j2();
            case "i2b":
                return new l2();
            case "i2s":
                return new a();
            case "i2c":
                return new b();
            case "i2l":
                return new c();
            case "i2f":
                return new d();
            case "i2d":
                return new e();
            case "f2d":
                return new f();
            case "f2l":
                return new g();
            case "f2i":
                return new h();
            case "d2l":
                return new i();
            case "d2i":
                return new j();
            case "d2f":
                return new l();
            case "l2d":
                return new m();
            case "l2i":
                return new n();
            case "l2f":
                return new o();
            case "fcmpg":
            case "fcmpl":
                return new p();
            case "dcmpg":
            case "dcmpl":
                return new q();
            case "lcmp":
                return new r();
            case "goto":
                return new s(jSONObject);
            case "ifnull":
                return new t(jSONObject);
            case "ifnonnull":
                return new u(jSONObject);
            case "ifeq":
                return new w(jSONObject);
            case "ifne":
                return new x(jSONObject);
            case "iflt":
                return new y(jSONObject);
            case "ifge":
                return new z(jSONObject);
            case "ifgt":
                return new a0(jSONObject);
            case "ifle":
                return new b0(jSONObject);
            case "if_acmpeq":
                return new c0(jSONObject);
            case "if_acmpne":
                return new d0(jSONObject);
            case "if_icmpeq":
                return new e0(jSONObject);
            case "if_icmpge":
                return new f0(jSONObject);
            case "if_icmpgt":
                return new h0(jSONObject);
            case "if_icmple":
                return new i0(jSONObject);
            case "if_icmplt":
                return new j0(jSONObject);
            case "if_icmpne":
                return new k0(jSONObject);
            case "dup":
                return new l0();
            case "pop":
                return new m0();
            case "ior":
                return new n0();
            case "ixor":
                return new o0();
            case "iand":
                return new p0();
            case "ineg":
                return new q0();
            case "isub":
                return new s0();
            case "iadd":
                return new t0();
            case "imul":
                return new u0();
            case "idiv":
                return new v0();
            case "irem":
                return new w0();
            case "lor":
                return new x0();
            case "lxor":
                return new y0();
            case "land":
                return new z0();
            case "lneg":
                return new a1();
            case "lsub":
                return new b1();
            case "ladd":
                return new d1();
            case "lmul":
                return new e1();
            case "ldiv":
                return new f1();
            case "lrem":
                return new g1();
            case "fneg":
                return new h1();
            case "fsub":
                return new i1();
            case "fadd":
                return new j1();
            case "fmul":
                return new k1();
            case "fdiv":
                return new l1();
            case "frem":
                return new m1();
            case "dneg":
                return new o1();
            case "dsub":
                return new p1();
            case "dadd":
                return new q1();
            case "dmul":
                return new r1();
            case "ddiv":
                return new s1();
            case "drem":
                return new t1();
            case "alen":
                return new u1();
            case "aaload":
                return new v1();
            case "iaload":
                return new w1();
            case "baload":
                return new x1();
            case "saload":
                return new z1();
            case "caload":
                return new a2();
            case "faload":
                return new b2();
            case "laload":
                return new c2();
            case "daload":
                return new d2();
            case "load":
                return new e2(jSONObject.getInt("index"));
            case "class":
                return new f2(Long.parseLong(jSONObject.getString("classHash")), jSONObject.getString("classSpec"));
            case "instanceof":
                return new g2(Long.parseLong(jSONObject.getString("classHash")), jSONObject.getString("classSpec"));
            case "get":
                return new h2(Long.parseLong(jSONObject.getString("classHash")), Long.parseLong(jSONObject.getString("memberHash")), jSONObject.getString("memberSpec"));
            case "invoke":
                return new i2(Long.parseLong(jSONObject.getString("classHash")), Long.parseLong(jSONObject.getString("memberHash")), jSONObject.getString("memberSpec"));
            case "init":
                return new k2(Long.parseLong(jSONObject.getString("classHash")), Long.parseLong(jSONObject.getString("memberHash")), jSONObject.getString("memberSpec"));
            default:
                throw new RuntimeException("Unknown opCode " + jSONObject.getString("opCode"));
        }
    }

    public Object DW(Object[] objArr) {
        if (FH()) {
            return null;
        }
        return new o2(objArr).j6(this.j6);
    }

    public boolean FH() {
        return this.j6.size() == 0;
    }
}
