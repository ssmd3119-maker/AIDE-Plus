package com.google.firebase.iid;

import abcd.aw;
import abcd.gw;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class r {

    @GuardedBy("this")
    private final Map<Pair<String, String>, gw<String>> DW = new ArrayMap();
    private final Executor j6;

    r(Executor executor) {
        this.j6 = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized gw<String> DW(String str, String str2, t tVar) {
        final Pair pair = new Pair(str, str2);
        gw<String> gwVar = this.DW.get(pair);
        if (gwVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return gwVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        gw gwVarZo = tVar.j6().Zo(this.j6, new aw(this, pair) { // from class: com.google.firebase.iid.s
            private final Pair DW;
            private final r j6;

            {
                this.j6 = this;
                this.DW = pair;
            }

            @Override // abcd.aw
            public final Object j6(gw gwVar2) {
                this.j6.j6(this.DW, gwVar2);
                return gwVar2;
            }
        });
        this.DW.put(pair, gwVarZo);
        return gwVarZo;
    }

    final /* synthetic */ gw j6(Pair pair, gw gwVar) {
        synchronized (this) {
            this.DW.remove(pair);
        }
        return gwVar;
    }
}
