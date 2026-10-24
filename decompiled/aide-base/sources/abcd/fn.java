package abcd;

/* loaded from: classes.dex */
public abstract class fn extends wm implements Comparable<fn> {
    private final int WB;
    private int fY;
    private jn jw;
    private int mb;

    public fn(int i, int i2) {
        jn.J0(i);
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.WB = i;
        this.mb = i2;
        this.jw = null;
        this.fY = -1;
    }

    public static int J0(fn fnVar) {
        if (fnVar == null) {
            return 0;
        }
        return fnVar.we();
    }

    public void Mr(jn jnVar, int i) {
    }

    public final int QX() {
        return this.WB;
    }

    public final void U2(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.mb >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.mb = i;
    }

    public final String XL() {
        return '[' + Integer.toHexString(we()) + ']';
    }

    @Override // abcd.wm
    public final void Zo(km kmVar, ls lsVar) {
        lsVar.we(this.WB);
        try {
            if (this.mb < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            lsVar.Zo(we());
            rN(kmVar, lsVar);
        } catch (RuntimeException e) {
            throw us.DW(e, "...while writing " + this);
        }
    }

    public abstract String a8();

    public final int aM(jn jnVar, int i) {
        if (jnVar == null) {
            throw new NullPointerException("addedTo == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.jw != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.WB - 1;
        int i3 = (i + i2) & (i2 ^ (-1));
        this.jw = jnVar;
        this.fY = i3;
        Mr(jnVar, i3);
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        fn fnVar = (fn) obj;
        return DW() == fnVar.DW() && tp(fnVar) == 0;
    }

    public abstract void rN(km kmVar, ls lsVar);

    public int tp(fn fnVar) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // java.lang.Comparable
    /* renamed from: u7, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fn fnVar) {
        if (this == fnVar) {
            return 0;
        }
        xm xmVarDW = DW();
        xm xmVarDW2 = fnVar.DW();
        return xmVarDW != xmVarDW2 ? xmVarDW.compareTo(xmVarDW2) : tp(fnVar);
    }

    @Override // abcd.wm
    public final int v5() {
        int i = this.mb;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    public final int we() {
        int i = this.fY;
        if (i >= 0) {
            return this.jw.FH(i);
        }
        throw new RuntimeException("offset not yet known");
    }
}
