package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class ut extends ia0 {
    private long Jl;
    private float Q6;
    private long Z1;
    private Date cT;
    private Date hK;
    private ta0 kf;
    private double n5;
    private long q7;

    public ut() {
        super("mvhd");
        this.n5 = 1.0d;
        this.Q6 = 1.0f;
        this.kf = ta0.tp;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void Zo(ByteBuffer byteBuffer) {
        gn(byteBuffer);
        if (VH() == 1) {
            this.hK = oa0.j6(tp.Hw(byteBuffer));
            this.cT = oa0.j6(tp.Hw(byteBuffer));
            this.q7 = tp.DW(byteBuffer);
            this.Z1 = tp.Hw(byteBuffer);
        } else {
            this.hK = oa0.j6(tp.DW(byteBuffer));
            this.cT = oa0.j6(tp.DW(byteBuffer));
            this.q7 = tp.DW(byteBuffer);
            this.Z1 = tp.DW(byteBuffer);
        }
        this.n5 = tp.v5(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.Q6 = ((short) ((r0[1] & 255) | ((short) (0 | ((r0[0] << 8) & 65280))))) / 256.0f;
        tp.FH(byteBuffer);
        tp.DW(byteBuffer);
        tp.DW(byteBuffer);
        this.kf = ta0.j6(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.Jl = tp.DW(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.hK + ";modificationTime=" + this.cT + ";timescale=" + this.q7 + ";duration=" + this.Z1 + ";rate=" + this.n5 + ";volume=" + this.Q6 + ";matrix=" + this.kf + ";nextTrackId=" + this.Jl + "]";
    }

    public final long tp() {
        return this.q7;
    }

    public final long u7() {
        return this.Z1;
    }
}
