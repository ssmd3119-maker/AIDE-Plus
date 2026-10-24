package abcd;

import abcd.p30;
import abcd.z70;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c80<S extends p30> implements Iterable<z70> {
    private static final z70.a[] fY = z70.a.valuesCustom();
    private final List<S> WB;
    private final fg0 mb = new fg0();
    private boolean jw = false;

    class a implements Iterator<z70> {
        int WB;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.WB < c80.this.mb.VH();
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public z70 next() {
            z70.a[] aVarArr = c80.fY;
            fg0 fg0Var = c80.this.mb;
            int i = this.WB;
            this.WB = i + 1;
            z70.a aVar = aVarArr[fg0Var.Hw(i)];
            fg0 fg0Var2 = c80.this.mb;
            int i2 = this.WB;
            this.WB = i2 + 1;
            int iHw = fg0Var2.Hw(i2);
            fg0 fg0Var3 = c80.this.mb;
            int i3 = this.WB;
            this.WB = i3 + 1;
            int iHw2 = fg0Var3.Hw(i3);
            fg0 fg0Var4 = c80.this.mb;
            int i4 = this.WB;
            this.WB = i4 + 1;
            return new z70(iHw, iHw2, fg0Var4.Hw(i4), aVar);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public c80(List<S> list) {
        this.WB = list;
    }

    public void Hw(int i, int i2, int i3, z70.a aVar) {
        this.mb.j6(aVar.ordinal());
        this.mb.j6(i);
        this.mb.j6(i2);
        this.mb.j6(i3);
        if (aVar != z70.a.NO_CONFLICT) {
            this.jw = true;
        }
    }

    public List<S> VH() {
        return this.WB;
    }

    @Override // java.lang.Iterable
    public Iterator<z70> iterator() {
        return new a();
    }

    public boolean v5() {
        return this.jw;
    }
}
