package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.vb0;
import com.google.android.gms.internal.ads.xp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class u0 extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ q0 j6;

    private u0(q0 q0Var) {
        this.j6 = q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            this.j6.AL = (vb0) this.j6.jw.get(((Long) cw0.v5().FH(com.google.android.gms.internal.ads.p.d8)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            xp.v5("", e);
        }
        return this.j6.is();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.j6.k2 == null || str2 == null) {
            return;
        }
        this.j6.k2.loadUrl(str2);
    }

    /* synthetic */ u0(q0 q0Var, r0 r0Var) {
        this(q0Var);
    }
}
