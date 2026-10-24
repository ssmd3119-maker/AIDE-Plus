package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import java.io.IOException;

@jg
@TargetApi(16)
/* loaded from: classes.dex */
public final class ru extends fu implements tt {
    private boolean AL;
    private mt fY;
    private boolean k2;
    private String qp;
    private Exception zh;

    public ru(ss ssVar, rs rsVar) {
        super(ssVar);
        mt mtVar = new mt(ssVar.getContext(), rsVar);
        this.fY = mtVar;
        mtVar.er(this);
    }

    private static String er(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void yS(String str) {
        synchronized (this) {
            this.k2 = true;
            notify();
            j6();
        }
        String str2 = this.qp;
        if (str2 != null) {
            String strA8 = a8(str2);
            Exception exc = this.zh;
            if (exc != null) {
                J0(this.qp, strA8, "badUrl", er(str, exc));
            } else {
                J0(this.qp, strA8, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void DW(final boolean z, final long j) {
        final ss ssVar = this.jw.get();
        if (ssVar != null) {
            ar.j6.execute(new Runnable(ssVar, z, j) { // from class: com.google.android.gms.internal.ads.su
                private final ss WB;
                private final long jw;
                private final boolean mb;

                {
                    this.WB = ssVar;
                    this.mb = z;
                    this.jw = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.a5(this.mb, this.jw);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void FH(int i) {
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void Mr(int i) {
        this.fY.vy().u7(i);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void QX(int i) {
        this.fY.vy().tp(i);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final boolean U2(String str) throws Throwable {
        String str2;
        long j;
        long j2;
        long j3;
        String str3;
        long j4;
        long j5;
        this.qp = str;
        String strA8 = a8(str);
        String str4 = "error";
        try {
            this.fY.a8(Uri.parse(str), this.mb);
            ss ssVar = this.jw.get();
            if (ssVar != null) {
                try {
                    ssVar.oy(strA8, this);
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                    sb.append("Failed to preload url ");
                    sb.append(str);
                    sb.append(" Exception: ");
                    sb.append(message);
                    xp.u7(sb.toString());
                    j6();
                    J0(str, strA8, str4, er(str4, e));
                    return false;
                }
            }
            com.google.android.gms.common.util.e eVarWe = com.google.android.gms.ads.internal.w0.we();
            long jJ6 = eVarWe.j6();
            long jLongValue = ((Long) cw0.v5().FH(p.aM)).longValue();
            long jLongValue2 = ((Long) cw0.v5().FH(p.XL)).longValue() * 1000;
            long jIntValue = ((Integer) cw0.v5().FH(p.QX)).intValue();
            long j6 = -1;
            while (true) {
                try {
                    synchronized (this) {
                        try {
                            if (eVarWe.j6() - jJ6 > jLongValue2) {
                                long j7 = jLongValue2;
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("Timeout reached. Limit: ");
                                sb2.append(j7);
                                sb2.append(" ms");
                                throw new IOException(sb2.toString());
                            }
                            if (this.k2) {
                                if (this.zh != null) {
                                    throw this.zh;
                                }
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                            if (!this.AL) {
                                ke0 ke0VarYS = this.fY.yS();
                                if (ke0VarYS == null) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                str2 = str4;
                                try {
                                    long jCz = ke0VarYS.Cz();
                                    if (jCz > 0) {
                                        long jSE = ke0VarYS.sE();
                                        if (jSE != j6) {
                                            j = jIntValue;
                                            j2 = jLongValue2;
                                            j4 = jLongValue;
                                            we(str, strA8, jSE, jCz, jSE > 0, mt.gW(), mt.BT());
                                            j5 = jSE;
                                        } else {
                                            j = jIntValue;
                                            j2 = jLongValue2;
                                            j4 = jLongValue;
                                            j5 = j6;
                                        }
                                        if (jSE >= jCz) {
                                            Ws(str, strA8, jCz);
                                        } else if (this.fY.j3() < j || jSE <= 0) {
                                            j3 = j4;
                                            str3 = j5;
                                        }
                                    } else {
                                        j = jIntValue;
                                        j2 = jLongValue2;
                                        j3 = jLongValue;
                                        str3 = j6;
                                    }
                                    try {
                                        try {
                                            wait(j3);
                                        } catch (Throwable th) {
                                            th = th;
                                            str4 = str3;
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = str2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    jLongValue = j3;
                    str4 = str2;
                    jIntValue = j;
                    jLongValue2 = j2;
                    j6 = str3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            return true;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void VH(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void Zo(String str, Exception exc) {
        this.zh = exc;
        xp.v5("Precache error", exc);
        yS(str);
    }

    @Override // com.google.android.gms.internal.ads.fu
    protected final String a8(String str) {
        String strValueOf = String.valueOf(super.a8(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void aM(int i) {
        this.fY.vy().EQ(i);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void gn() {
        yS(null);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void j3(int i) {
        this.fY.vy().gn(i);
    }

    @Override // com.google.android.gms.internal.ads.fu, com.google.android.gms.common.api.i
    public final void j6() {
        mt mtVar = this.fY;
        if (mtVar != null) {
            mtVar.er(null);
            this.fY.Mr();
        }
        super.j6();
    }

    public final mt rN() {
        synchronized (this) {
            this.AL = true;
            notify();
        }
        this.fY.er(null);
        mt mtVar = this.fY;
        this.fY = null;
        return mtVar;
    }
}
