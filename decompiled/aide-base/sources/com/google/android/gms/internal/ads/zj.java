package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@jg
/* loaded from: classes.dex */
public final class zj implements abcd.ou {
    private final lj j6;

    public zj(lj ljVar) {
        this.j6 = ljVar;
    }

    @Override // abcd.ou
    public final String j6() {
        lj ljVar = this.j6;
        if (ljVar == null) {
            return null;
        }
        try {
            return ljVar.j6();
        } catch (RemoteException e) {
            xp.v5("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // abcd.ou
    public final int zh() {
        lj ljVar = this.j6;
        if (ljVar == null) {
            return 0;
        }
        try {
            return ljVar.zh();
        } catch (RemoteException e) {
            xp.v5("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
