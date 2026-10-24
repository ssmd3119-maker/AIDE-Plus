package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public final class r0 extends WebViewClient {
    private final /* synthetic */ q0 j6;

    r0(q0 q0Var) {
        this.j6 = q0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.j6.zh != null) {
            try {
                this.j6.zh.Gj(0);
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.j6.Dn())) {
            return false;
        }
        if (str.startsWith((String) cw0.v5().FH(com.google.android.gms.internal.ads.p.T6))) {
            if (this.j6.zh != null) {
                try {
                    this.j6.zh.Gj(3);
                } catch (RemoteException e) {
                    xp.Zo("#007 Could not call remote method.", e);
                }
            }
            this.j6.HS(0);
            return true;
        }
        if (str.startsWith((String) cw0.v5().FH(com.google.android.gms.internal.ads.p.cc))) {
            if (this.j6.zh != null) {
                try {
                    this.j6.zh.Gj(0);
                } catch (RemoteException e2) {
                    xp.Zo("#007 Could not call remote method.", e2);
                }
            }
            this.j6.HS(0);
            return true;
        }
        if (str.startsWith((String) cw0.v5().FH(com.google.android.gms.internal.ads.p.Od))) {
            if (this.j6.zh != null) {
                try {
                    this.j6.zh.k2();
                } catch (RemoteException e3) {
                    xp.Zo("#007 Could not call remote method.", e3);
                }
            }
            this.j6.HS(this.j6.UE(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        if (this.j6.zh != null) {
            try {
                this.j6.zh.mb();
            } catch (RemoteException e4) {
                xp.Zo("#007 Could not call remote method.", e4);
            }
        }
        this.j6.d7(this.j6.tc(str));
        return true;
    }
}
