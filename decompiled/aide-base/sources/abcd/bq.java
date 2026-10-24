package abcd;

/* loaded from: classes.dex */
public abstract class bq implements kt, Comparable<bq> {
    @Override // java.lang.Comparable
    /* renamed from: DW, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bq bqVar) {
        Class<?> cls = getClass();
        Class<?> cls2 = bqVar.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : FH(bqVar);
    }

    public abstract int FH(bq bqVar);

    public abstract String tp();

    public abstract boolean v5();
}
