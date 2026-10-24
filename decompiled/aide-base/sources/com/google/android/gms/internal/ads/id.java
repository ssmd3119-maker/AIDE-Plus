package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class id {
    private static final Object DW = new Object();

    @GuardedBy("sLock")
    private static boolean FH;

    @GuardedBy("sLock")
    private static boolean Hw;
    private sx j6;

    private final void Zo(Context context) {
        synchronized (DW) {
            if (((Boolean) cw0.v5().FH(p.gy)).booleanValue() && !Hw) {
                try {
                    Hw = true;
                    this.j6 = (sx) yp.j6(context, "com.google.android.gms.ads.omid.DynamiteOmid", jd.j6);
                } catch (aq e) {
                    xp.Zo("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final abcd.wu DW(String str, WebView webView, String str2, String str3, String str4) {
        return FH(str, webView, str2, str3, str4, "Google");
    }

    public final abcd.wu FH(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (DW) {
            try {
                try {
                    if (((Boolean) cw0.v5().FH(p.gy)).booleanValue() && FH) {
                        try {
                            return this.j6.m8(str, abcd.xu.sy(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            xp.Zo("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void Hw(abcd.wu wuVar, View view) {
        synchronized (DW) {
            if (((Boolean) cw0.v5().FH(p.gy)).booleanValue() && FH) {
                try {
                    this.j6.nn(wuVar, abcd.xu.sy(view));
                } catch (RemoteException | NullPointerException e) {
                    xp.Zo("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void VH(abcd.wu wuVar) {
        synchronized (DW) {
            if (((Boolean) cw0.v5().FH(p.gy)).booleanValue() && FH) {
                try {
                    this.j6.gM(wuVar);
                } catch (RemoteException | NullPointerException e) {
                    xp.Zo("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void gn(abcd.wu wuVar) {
        synchronized (DW) {
            if (((Boolean) cw0.v5().FH(p.gy)).booleanValue() && FH) {
                try {
                    this.j6.lZ(wuVar);
                } catch (RemoteException | NullPointerException e) {
                    xp.Zo("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final String j6(Context context) {
        if (!((Boolean) cw0.v5().FH(p.gy)).booleanValue()) {
            return null;
        }
        try {
            Zo(context);
            String strValueOf = String.valueOf(this.j6.we());
            return strValueOf.length() != 0 ? "a.".concat(strValueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            xp.Zo("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean v5(Context context) {
        synchronized (DW) {
            if (!((Boolean) cw0.v5().FH(p.gy)).booleanValue()) {
                return false;
            }
            if (FH) {
                return true;
            }
            try {
                Zo(context);
                boolean zQm = this.j6.Qm(abcd.xu.sy(context));
                FH = zQm;
                return zQm;
            } catch (RemoteException e) {
                e = e;
                xp.Zo("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                xp.Zo("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}
