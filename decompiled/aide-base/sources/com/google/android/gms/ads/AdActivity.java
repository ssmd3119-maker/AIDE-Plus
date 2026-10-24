package com.google.android.gms.ads;

import abcd.iy;
import abcd.xu;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public class AdActivity extends Activity {
    private ld WB;

    private final void j6() {
        ld ldVar = this.WB;
        if (ldVar != null) {
            try {
                ldVar.fp();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
        try {
            this.WB.cc(i, i2, intent);
        } catch (Exception e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean zQG = true;
        try {
            if (this.WB != null) {
                zQG = this.WB.qG();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
        if (zQG) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.WB.Hn(xu.sy(configuration));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ld ldVarHw = cw0.DW().Hw(this);
        this.WB = ldVarHw;
        if (ldVarHw == null) {
            xp.Zo("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            ldVarHw.hw(bundle);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            if (this.WB != null) {
                this.WB.onDestroy();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            if (this.WB != null) {
                this.WB.onPause();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        try {
            if (this.WB != null) {
                this.WB.Dv();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            if (this.WB != null) {
                this.WB.onResume();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.WB != null) {
                this.WB.PU(bundle);
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            if (this.WB != null) {
                this.WB.b1();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            if (this.WB != null) {
                this.WB.Ae();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        j6();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        j6();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        j6();
    }
}
