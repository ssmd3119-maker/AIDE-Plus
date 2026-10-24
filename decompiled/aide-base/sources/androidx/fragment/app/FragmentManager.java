package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    public static abstract class a {
        public void DW(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void EQ(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void FH(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void Hw(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void J0(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void J8(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void VH(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void Zo(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void gn(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void j6(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void tp(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void u7(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void v5(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void we(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    public interface b {
        void j6();
    }

    public abstract void DW(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Fragment.SavedState EQ(Fragment fragment);

    public abstract boolean FH();

    public abstract Fragment Hw(String str);

    public abstract boolean VH();

    public abstract FragmentTransaction beginTransaction();

    public abstract List<Fragment> getFragments();

    public abstract void gn(int i, int i2);

    public abstract void tp(Bundle bundle, String str, Fragment fragment);

    public abstract boolean u7();

    public abstract Fragment v5(Bundle bundle, String str);
}
