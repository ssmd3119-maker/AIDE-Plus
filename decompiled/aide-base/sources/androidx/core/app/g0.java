package androidx.core.app;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public class g0 {
    static RemoteInput[] j6(h0[] h0VarArr) {
        if (h0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[h0VarArr.length];
        for (int i = 0; i < h0VarArr.length; i++) {
            h0 h0Var = h0VarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(h0Var.Zo()).setLabel(h0Var.v5()).setChoices(h0Var.FH()).setAllowFreeFormInput(h0Var.j6()).addExtras(h0Var.Hw()).build();
        }
        return remoteInputArr;
    }
}
