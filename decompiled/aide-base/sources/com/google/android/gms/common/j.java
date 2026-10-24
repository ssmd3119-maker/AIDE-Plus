package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes.dex */
public class j extends DialogFragment {
    private Dialog E4 = null;
    private DialogInterface.OnCancelListener xg = null;

    public static j Bx(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        com.google.android.gms.common.internal.p.tp(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.E4 = dialog2;
        if (onCancelListener != null) {
            jVar.xg = onCancelListener;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog An(Bundle bundle) {
        if (this.E4 == null) {
            setShowsDialog(false);
        }
        return this.E4;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.xg;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
