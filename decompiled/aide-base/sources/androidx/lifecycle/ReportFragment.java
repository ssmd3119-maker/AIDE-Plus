package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class ReportFragment extends Fragment {
    private a WB;

    interface a {
        void b1();

        void j6();

        void onResume();
    }

    private void DW(a aVar) {
        if (aVar != null) {
            aVar.j6();
        }
    }

    private void FH(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void Hw(a aVar) {
        if (aVar != null) {
            aVar.b1();
        }
    }

    private void j6(Lifecycle.Event event) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof d) {
            ((d) activity).getLifecycle().v5(event);
        } else if (activity instanceof LifecycleOwner) {
            Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof LifecycleRegistry) {
                ((LifecycleRegistry) lifecycle).v5(event);
            }
        }
    }

    public static void v5(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DW(this.WB);
        j6(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        j6(Lifecycle.Event.ON_DESTROY);
        this.WB = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        j6(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        FH(this.WB);
        j6(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        Hw(this.WB);
        j6(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        j6(Lifecycle.Event.ON_STOP);
    }
}
