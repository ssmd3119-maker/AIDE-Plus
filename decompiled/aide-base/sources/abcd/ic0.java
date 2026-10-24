package abcd;

import abcd.tb0;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class ic0 extends tb0 {
    private final ReentrantLock v5;

    public ic0(ec0 ec0Var) {
        super(ec0Var);
        this.v5 = new ReentrantLock();
    }

    @Override // abcd.tb0
    public boolean DW(int i, dc0 dc0Var, dc0 dc0Var2) {
        this.v5.lock();
        try {
            return super.DW(i, dc0Var, dc0Var2);
        } finally {
            this.v5.unlock();
        }
    }

    @Override // abcd.tb0
    public void Hw(int i) {
        this.v5.lock();
        try {
            super.Hw(i);
        } finally {
            this.v5.unlock();
        }
    }

    @Override // abcd.tb0
    public tb0.a j6(byte[] bArr, int i, int i2) {
        byte[] bArrV5 = v5(bArr, i);
        this.v5.lock();
        try {
            return super.j6(bArrV5, i, i2);
        } finally {
            this.v5.unlock();
        }
    }
}
