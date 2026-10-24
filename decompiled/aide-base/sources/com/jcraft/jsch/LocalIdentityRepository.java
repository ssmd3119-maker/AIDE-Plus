package com.jcraft.jsch;

import java.util.Vector;

/* loaded from: classes.dex */
public class LocalIdentityRepository implements IdentityRepository {
    private JSch DW;
    private Vector j6 = new Vector();

    LocalIdentityRepository(JSch jSch) {
        this.DW = jSch;
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized boolean DW(byte[] bArr) {
        try {
            this.j6.addElement(IdentityFile.gn("from remote:", bArr, null, this.DW));
        } catch (JSchException unused) {
            return false;
        }
        return true;
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized boolean FH(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i = 0; i < this.j6.size(); i++) {
            Identity identity = (Identity) this.j6.elementAt(i);
            byte[] bArrFH = identity.FH();
            if (bArrFH != null && Util.j6(bArr, bArrFH)) {
                this.j6.removeElement(identity);
                identity.clear();
                return true;
            }
        }
        return false;
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized void Hw() {
        for (int i = 0; i < this.j6.size(); i++) {
            ((Identity) this.j6.elementAt(i)).clear();
        }
        this.j6.removeAllElements();
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized Vector j6() {
        Vector vector;
        vector = new Vector();
        for (int i = 0; i < this.j6.size(); i++) {
            vector.addElement(this.j6.elementAt(i));
        }
        return vector;
    }

    public synchronized void v5(Identity identity) {
        if (!this.j6.contains(identity)) {
            this.j6.addElement(identity);
        }
    }
}
