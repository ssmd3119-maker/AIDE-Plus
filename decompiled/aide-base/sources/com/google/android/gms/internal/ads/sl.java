package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class sl implements un {
    private static Logger DW = Logger.getLogger(sl.class.getName());
    private ThreadLocal<ByteBuffer> j6 = new tm(this);

    public abstract tq DW(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.un
    public final tq j6(ma0 ma0Var, ur urVar) throws EOFException {
        int i;
        long size;
        long jPosition = ma0Var.position();
        this.j6.get().rewind().limit(8);
        do {
            i = ma0Var.read(this.j6.get());
            if (i == 8) {
                this.j6.get().rewind();
                long jDW = tp.DW(this.j6.get());
                byte[] bArr = null;
                if (jDW < 8 && jDW > 1) {
                    Logger logger = DW;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jDW);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                String strVH = tp.VH(this.j6.get());
                if (jDW == 1) {
                    this.j6.get().limit(16);
                    ma0Var.read(this.j6.get());
                    this.j6.get().position(8);
                    size = tp.Hw(this.j6.get()) - 16;
                } else {
                    size = jDW == 0 ? ma0Var.size() - ma0Var.position() : jDW - 8;
                }
                if ("uuid".equals(strVH)) {
                    this.j6.get().limit(this.j6.get().limit() + 16);
                    ma0Var.read(this.j6.get());
                    bArr = new byte[16];
                    for (int iPosition = this.j6.get().position() - 16; iPosition < this.j6.get().position(); iPosition++) {
                        bArr[iPosition - (this.j6.get().position() - 16)] = this.j6.get().get(iPosition);
                    }
                    size -= 16;
                }
                long j = size;
                tq tqVarDW = DW(strVH, bArr, urVar instanceof tq ? ((tq) urVar).j6() : "");
                tqVarDW.FH(urVar);
                this.j6.get().rewind();
                tqVarDW.DW(ma0Var, this.j6.get(), j, this);
                return tqVarDW;
            }
        } while (i >= 0);
        ma0Var.VH(jPosition);
        throw new EOFException();
    }
}
