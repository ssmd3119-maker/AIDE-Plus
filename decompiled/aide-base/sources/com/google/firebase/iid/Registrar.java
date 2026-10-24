package com.google.firebase.iid;

import abcd.cx;
import abcd.lx;
import abcd.mx;
import androidx.annotation.Keep;
import com.google.firebase.components.a;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements com.google.firebase.components.d {

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements mx {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Override // com.google.firebase.components.d
    @Keep
    public final List<com.google.firebase.components.a<?>> getComponents() {
        a.b bVarJ6 = com.google.firebase.components.a.j6(FirebaseInstanceId.class);
        bVarJ6.j6(com.google.firebase.components.e.j6(cx.class));
        bVarJ6.j6(com.google.firebase.components.e.j6(lx.class));
        bVarJ6.v5(p.j6);
        bVarJ6.DW();
        com.google.firebase.components.a aVarFH = bVarJ6.FH();
        a.b bVarJ62 = com.google.firebase.components.a.j6(mx.class);
        bVarJ62.j6(com.google.firebase.components.e.j6(FirebaseInstanceId.class));
        bVarJ62.v5(q.j6);
        return Arrays.asList(aVarFH, bVarJ62.FH());
    }
}
