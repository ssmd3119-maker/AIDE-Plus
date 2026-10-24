package abcd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class en extends jn {
    private static final Comparator<fn> tp = new a();
    private final HashMap<fn, fn> VH;
    private final ArrayList<fn> Zo;
    private final c gn;
    private int u7;

    static class a implements Comparator<fn> {
        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(fn fnVar, fn fnVar2) {
            return fnVar.DW().compareTo(fnVar2.DW());
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[c.values().length];
            j6 = iArr;
            try {
                iArr[c.INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                j6[c.TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum c {
        NONE,
        TYPE,
        INSTANCE
    }

    public en(String str, km kmVar, int i, c cVar) {
        super(str, kmVar, i);
        this.Zo = new ArrayList<>(100);
        this.VH = new HashMap<>(100);
        this.gn = cVar;
        this.u7 = -1;
    }

    @Override // abcd.jn
    public int DW(wm wmVar) {
        return ((fn) wmVar).we();
    }

    @Override // abcd.jn
    public int J8() {
        EQ();
        return this.u7;
    }

    public void Mr(ls lsVar, xm xmVar, String str) {
        EQ();
        TreeMap treeMap = new TreeMap();
        Iterator<fn> it = this.Zo.iterator();
        while (it.hasNext()) {
            fn next = it.next();
            if (next.DW() == xmVar) {
                treeMap.put(next.a8(), next);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        lsVar.Hw(0, str);
        for (Map.Entry entry : treeMap.entrySet()) {
            lsVar.Hw(0, ((fn) entry.getValue()).XL() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // abcd.jn
    public void QX(ls lsVar) {
        boolean zEQ = lsVar.EQ();
        km kmVarV5 = v5();
        Iterator<fn> it = this.Zo.iterator();
        int iV5 = 0;
        boolean z = true;
        while (it.hasNext()) {
            fn next = it.next();
            if (zEQ) {
                if (z) {
                    z = false;
                } else {
                    lsVar.Hw(0, "\n");
                }
            }
            int iQX = next.QX() - 1;
            int i = (iQX ^ (-1)) & (iV5 + iQX);
            if (iV5 != i) {
                lsVar.v5(i - iV5);
                iV5 = i;
            }
            next.Zo(kmVarV5, lsVar);
            iV5 += next.v5();
        }
        if (iV5 != this.u7) {
            throw new RuntimeException("output size mismatch");
        }
    }

    @Override // abcd.jn
    public Collection<? extends wm> VH() {
        return this.Zo;
    }

    public void XL(fn fnVar) {
        we();
        try {
            if (fnVar.QX() > Hw()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.Zo.add(fnVar);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    public <T extends fn> T aM(T t) {
        we();
        T t2 = (T) this.VH.get(t);
        if (t2 != null) {
            return t2;
        }
        XL(t);
        this.VH.put(t, t);
        return t;
    }

    public void j3() {
        EQ();
        int i = b.j6[this.gn.ordinal()];
        if (i == 1) {
            Collections.sort(this.Zo);
        } else if (i == 2) {
            Collections.sort(this.Zo, tp);
        }
        int size = this.Zo.size();
        int iV5 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            fn fnVar = this.Zo.get(i2);
            try {
                int iAM = fnVar.aM(this, iV5);
                if (iAM < iV5) {
                    throw new RuntimeException("bogus place() result for " + fnVar);
                }
                iV5 = fnVar.v5() + iAM;
            } catch (RuntimeException e) {
                throw us.DW(e, "...while placing " + fnVar);
            }
        }
        this.u7 = iV5;
    }

    @Override // abcd.jn
    public void u7() {
        km kmVarV5 = v5();
        int i = 0;
        while (true) {
            int size = this.Zo.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                this.Zo.get(i).j6(kmVarV5);
                i++;
            }
        }
    }
}
