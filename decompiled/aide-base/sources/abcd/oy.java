package abcd;

/* loaded from: classes.dex */
public abstract class oy implements ay {
    private my DW;
    private Object j6;

    @Override // abcd.ay
    public boolean U2(String str) {
        return rz.FH(this.DW, str);
    }

    public jy er(my myVar, Object[] objArr, ny nyVar) {
        try {
            this.DW = myVar;
            return nyVar.j6(myVar.FH(), objArr);
        } finally {
            this.DW = null;
        }
    }

    @Override // abcd.ay
    public <T> T rN(Class<T> cls) {
        return (T) ry.u7(this.j6, cls);
    }

    public jy yS(mz mzVar, Object[] objArr, Object obj, ny nyVar) {
        try {
            this.j6 = obj;
            return nyVar.j6(mzVar, objArr);
        } finally {
            this.j6 = null;
        }
    }
}
