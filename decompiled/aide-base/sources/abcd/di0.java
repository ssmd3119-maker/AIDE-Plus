package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes.dex */
public abstract class di0 extends ai0 {
    private Vector WB;
    private boolean mb;

    public di0() {
        this.WB = new Vector();
        this.mb = false;
    }

    private byte[] J8(mh0 mh0Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new yh0(byteArrayOutputStream).tp(mh0Var);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    private boolean Mr(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != iMin; i++) {
            if (bArr[i] != bArr2[i]) {
                return (bArr[i] & 255) < (bArr2[i] & 255);
            }
        }
        return iMin == bArr.length;
    }

    public static di0 QX(hi0 hi0Var, boolean z) {
        if (z) {
            if (hi0Var.aM()) {
                return (di0) hi0Var.Ws();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (hi0Var.aM()) {
            return hi0Var instanceof si0 ? new qi0(hi0Var.Ws()) : new ak0(hi0Var.Ws());
        }
        if (hi0Var.Ws() instanceof di0) {
            return (di0) hi0Var.Ws();
        }
        new nh0();
        if (hi0Var.Ws() instanceof bi0) {
            bi0 bi0Var = (bi0) hi0Var.Ws();
            return hi0Var instanceof si0 ? new qi0(bi0Var.Mr()) : new ak0(bi0Var.Mr());
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + hi0Var.getClass().getName());
    }

    public static di0 Ws(Object obj) {
        if (obj == null || (obj instanceof di0)) {
            return (di0) obj;
        }
        if (obj instanceof ei0) {
            return Ws(((ei0) obj).DW());
        }
        if (obj instanceof byte[]) {
            try {
                return Ws(ai0.tp((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof mh0) {
            ai0 ai0VarDW = ((mh0) obj).DW();
            if (ai0VarDW instanceof di0) {
                return (di0) ai0VarDW;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private mh0 XL(Enumeration enumeration) {
        mh0 mh0Var = (mh0) enumeration.nextElement();
        return mh0Var == null ? hj0.WB : mh0Var;
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return true;
    }

    @Override // abcd.ai0
    public ai0 J0() {
        ak0 ak0Var = new ak0();
        ak0Var.WB = this.WB;
        return ak0Var;
    }

    public int U2() {
        return this.WB.size();
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (!(ai0Var instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) ai0Var;
        if (U2() != di0Var.U2()) {
            return false;
        }
        Enumeration enumerationJ3 = j3();
        Enumeration enumerationJ32 = di0Var.j3();
        while (enumerationJ3.hasMoreElements()) {
            mh0 mh0VarXL = XL(enumerationJ3);
            mh0 mh0VarXL2 = XL(enumerationJ32);
            ai0 ai0VarDW = mh0VarXL.DW();
            ai0 ai0VarDW2 = mh0VarXL2.DW();
            if (ai0VarDW != ai0VarDW2 && !ai0VarDW.equals(ai0VarDW2)) {
                return false;
            }
        }
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void a8() {
        /*
            r9 = this;
            boolean r0 = r9.mb
            if (r0 != 0) goto L5c
            r0 = 1
            r9.mb = r0
            java.util.Vector r1 = r9.WB
            int r1 = r1.size()
            if (r1 <= r0) goto L5c
            java.util.Vector r1 = r9.WB
            int r1 = r1.size()
            int r1 = r1 - r0
            r2 = 1
        L17:
            if (r2 != 0) goto L1a
            goto L5c
        L1a:
            java.util.Vector r2 = r9.WB
            r3 = 0
            java.lang.Object r2 = r2.elementAt(r3)
            abcd.mh0 r2 = (abcd.mh0) r2
            byte[] r2 = r9.J8(r2)
            r4 = 0
            r5 = 0
        L29:
            if (r5 != r1) goto L2e
            r1 = r3
            r2 = r4
            goto L17
        L2e:
            java.util.Vector r6 = r9.WB
            int r7 = r5 + 1
            java.lang.Object r6 = r6.elementAt(r7)
            abcd.mh0 r6 = (abcd.mh0) r6
            byte[] r6 = r9.J8(r6)
            boolean r8 = r9.Mr(r2, r6)
            if (r8 == 0) goto L44
            r2 = r6
            goto L5a
        L44:
            java.util.Vector r3 = r9.WB
            java.lang.Object r3 = r3.elementAt(r5)
            java.util.Vector r4 = r9.WB
            java.lang.Object r6 = r4.elementAt(r7)
            r4.setElementAt(r6, r5)
            java.util.Vector r4 = r9.WB
            r4.setElementAt(r3, r7)
            r3 = r5
            r4 = 1
        L5a:
            r5 = r7
            goto L29
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.di0.a8():void");
    }

    public mh0 aM(int i) {
        return (mh0) this.WB.elementAt(i);
    }

    @Override // abcd.uh0
    public int hashCode() {
        Enumeration enumerationJ3 = j3();
        int iU2 = U2();
        while (enumerationJ3.hasMoreElements()) {
            iU2 = (iU2 * 17) ^ XL(enumerationJ3).hashCode();
        }
        return iU2;
    }

    public Enumeration j3() {
        return this.WB.elements();
    }

    public String toString() {
        return this.WB.toString();
    }

    @Override // abcd.ai0
    public ai0 we() {
        if (this.mb) {
            qj0 qj0Var = new qj0();
            qj0Var.WB = this.WB;
            return qj0Var;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.WB.size(); i++) {
            vector.addElement(this.WB.elementAt(i));
        }
        qj0 qj0Var2 = new qj0();
        qj0Var2.WB = vector;
        qj0Var2.a8();
        return qj0Var2;
    }

    public di0(mh0 mh0Var) {
        Vector vector = new Vector();
        this.WB = vector;
        this.mb = false;
        vector.addElement(mh0Var);
    }

    public di0(nh0 nh0Var, boolean z) {
        this.WB = new Vector();
        this.mb = false;
        for (int i = 0; i != nh0Var.FH(); i++) {
            this.WB.addElement(nh0Var.DW(i));
        }
        if (z) {
            a8();
        }
    }

    public di0(mh0[] mh0VarArr, boolean z) {
        this.WB = new Vector();
        this.mb = false;
        for (int i = 0; i != mh0VarArr.length; i++) {
            this.WB.addElement(mh0VarArr[i]);
        }
        if (z) {
            a8();
        }
    }
}
