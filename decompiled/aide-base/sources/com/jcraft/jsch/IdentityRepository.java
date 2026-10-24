package com.jcraft.jsch;

import java.util.Vector;

/* loaded from: classes.dex */
public interface IdentityRepository {

    public static class Wrapper implements IdentityRepository {
        private Vector DW;
        private boolean FH;
        private IdentityRepository j6;

        Wrapper(IdentityRepository identityRepository) {
            this(identityRepository, false);
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public boolean DW(byte[] bArr) {
            return this.j6.DW(bArr);
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public boolean FH(byte[] bArr) {
            return this.j6.FH(bArr);
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public void Hw() {
            this.DW.removeAllElements();
            this.j6.Hw();
        }

        void Zo() {
            if (this.DW.size() > 0) {
                for (Object obj : this.DW.toArray()) {
                    Identity identity = (Identity) obj;
                    this.DW.removeElement(identity);
                    v5(identity);
                }
            }
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public Vector j6() {
            Vector vector = new Vector();
            for (int i = 0; i < this.DW.size(); i++) {
                vector.add((Identity) this.DW.elementAt(i));
            }
            Vector vectorJ6 = this.j6.j6();
            for (int i2 = 0; i2 < vectorJ6.size(); i2++) {
                vector.add(vectorJ6.elementAt(i2));
            }
            return vector;
        }

        void v5(Identity identity) {
            if (this.FH || identity.DW() || !(identity instanceof IdentityFile)) {
                this.DW.addElement(identity);
            } else {
                try {
                    this.j6.DW(((IdentityFile) identity).Zo().VH());
                } catch (JSchException unused) {
                }
            }
        }

        Wrapper(IdentityRepository identityRepository, boolean z) {
            this.DW = new Vector();
            this.FH = false;
            this.j6 = identityRepository;
            this.FH = z;
        }
    }

    boolean DW(byte[] bArr);

    boolean FH(byte[] bArr);

    void Hw();

    Vector j6();
}
