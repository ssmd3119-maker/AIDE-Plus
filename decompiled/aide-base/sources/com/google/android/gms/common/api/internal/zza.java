package com.google.android.gms.common.api.internal;

import abcd.iy;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zza extends Fragment implements e {
    private Map<String, LifecycleCallback> WB = new ArrayMap();
    private Bundle mb;

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.WB.values().iterator();
        while (it.hasNext()) {
            it.next().j6(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
        Iterator<LifecycleCallback> it = this.WB.values().iterator();
        while (it.hasNext()) {
            it.next().DW(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mb = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.WB.entrySet()) {
            entry.getValue().FH(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<LifecycleCallback> it = this.WB.values().iterator();
        while (it.hasNext()) {
            it.next().Hw();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Iterator<LifecycleCallback> it = this.WB.values().iterator();
        while (it.hasNext()) {
            it.next().v5();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.WB.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().Zo(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Iterator<LifecycleCallback> it = this.WB.values().iterator();
        while (it.hasNext()) {
            it.next().VH();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Iterator<LifecycleCallback> it = this.WB.values().iterator();
        while (it.hasNext()) {
            it.next().gn();
        }
    }
}
