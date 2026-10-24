package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class ja0 implements ur, Closeable, Iterator<tq> {
    private static final tq zh = new ka0("eof ");
    protected un WB;
    protected ma0 mb;
    private tq jw = null;
    long fY = 0;
    long qp = 0;
    private List<tq> k2 = new ArrayList();

    static {
        sa0.DW(ja0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: gn, reason: merged with bridge method [inline-methods] */
    public final tq next() {
        tq tqVarJ6;
        tq tqVar = this.jw;
        if (tqVar != null && tqVar != zh) {
            this.jw = null;
            return tqVar;
        }
        ma0 ma0Var = this.mb;
        if (ma0Var == null || this.fY >= this.qp) {
            this.jw = zh;
            throw new NoSuchElementException();
        }
        try {
            synchronized (ma0Var) {
                this.mb.VH(this.fY);
                tqVarJ6 = this.WB.j6(this.mb, this);
                this.fY = this.mb.position();
            }
            return tqVarJ6;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void Hw(ma0 ma0Var, long j, un unVar) {
        this.mb = ma0Var;
        this.fY = ma0Var.position();
        ma0Var.VH(ma0Var.position() + j);
        this.qp = ma0Var.position();
        this.WB = unVar;
    }

    public final List<tq> Zo() {
        return (this.mb == null || this.jw == zh) ? this.k2 : new qa0(this.k2, this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mb.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        tq tqVar = this.jw;
        if (tqVar == zh) {
            return false;
        }
        if (tqVar != null) {
            return true;
        }
        try {
            this.jw = (tq) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.jw = zh;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.k2.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.k2.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
