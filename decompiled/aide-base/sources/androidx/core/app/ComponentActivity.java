package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import androidx.collection.SimpleArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements LifecycleOwner {
    private LifecycleRegistry WB;

    public ComponentActivity() {
        new SimpleArrayMap();
        this.WB = new LifecycleRegistry(this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.WB;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.v5(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.WB.VH(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
