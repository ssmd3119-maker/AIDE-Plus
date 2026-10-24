package abcd;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class xv extends a.AbstractC0107a<com.google.android.gms.signin.internal.a, vv> {
    @Override // com.google.android.gms.common.api.a.AbstractC0107a
    public final /* synthetic */ a.f j6(Context context, Looper looper, d dVar, vv vvVar, f fVar, g gVar) {
        vv vvVar2 = vvVar;
        if (vvVar2 == null) {
            vvVar2 = vv.w9;
        }
        return new com.google.android.gms.signin.internal.a(context, looper, true, dVar, vvVar2, fVar, gVar);
    }
}
