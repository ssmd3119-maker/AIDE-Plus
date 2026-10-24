package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    boolean Fd;
    boolean Lz;
    Dialog ct;
    boolean sT;
    int Of = 0;
    int PT = 0;
    boolean b1 = true;
    boolean AR = true;
    int TI = -1;

    public Dialog An(Bundle bundle) {
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Ev() {
        super.Ev();
        Dialog dialog = this.ct;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Mz(Context context) {
        super.Mz(context);
        if (this.sT) {
            return;
        }
        this.Lz = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void Sf(Bundle bundle) {
        Bundle bundle2;
        super.Sf(bundle);
        if (this.AR) {
            View viewVy = vy();
            if (viewVy != null) {
                if (viewVy.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.ct.setContentView(viewVy);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.ct.setOwnerActivity(activity);
            }
            this.ct.setCancelable(this.b1);
            this.ct.setOnCancelListener(this);
            this.ct.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.ct.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void XX() {
        super.XX();
        Dialog dialog = this.ct;
        if (dialog != null) {
            this.Fd = true;
            dialog.dismiss();
            this.ct = null;
        }
    }

    void Za(boolean z) {
        if (this.Lz) {
            return;
        }
        this.Lz = true;
        this.sT = false;
        Dialog dialog = this.ct;
        if (dialog != null) {
            dialog.dismiss();
            this.ct = null;
        }
        this.Fd = true;
        if (this.TI >= 0) {
            aM().gn(this.TI, 1);
            this.TI = -1;
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = aM().beginTransaction();
        fragmentTransactionBeginTransaction.tp(this);
        if (z) {
            fragmentTransactionBeginTransaction.VH();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public void ce(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void kQ() {
        super.kQ();
        if (this.sT || this.Lz) {
            return;
        }
        this.Lz = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void ko() {
        super.ko();
        Dialog dialog = this.ct;
        if (dialog != null) {
            this.Fd = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void oY(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.oY(bundle);
        Dialog dialog = this.ct;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.Of;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.PT;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.b1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.AR;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.TI;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.Fd) {
            return;
        }
        Za(true);
    }

    public void setShowsDialog(boolean z) {
        this.AR = z;
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.Lz = false;
        this.sT = true;
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.Hw(this, str);
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // androidx.fragment.app.Fragment
    public void x9(Bundle bundle) throws NoSuchFieldException, Resources.NotFoundException {
        super.x9(bundle);
        this.AR = this.mContainerId == 0;
        if (bundle != null) {
            this.Of = bundle.getInt("android:style", 0);
            this.PT = bundle.getInt("android:theme", 0);
            this.b1 = bundle.getBoolean("android:cancelable", true);
            this.AR = bundle.getBoolean("android:showsDialog", this.AR);
            this.TI = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater yO(Bundle bundle) {
        if (!this.AR) {
            return super.yO(bundle);
        }
        Dialog dialogAn = An(bundle);
        this.ct = dialogAn;
        if (dialogAn == null) {
            return (LayoutInflater) this.iW.u7().getSystemService("layout_inflater");
        }
        ce(dialogAn, this.Of);
        return (LayoutInflater) this.ct.getContext().getSystemService("layout_inflater");
    }
}
