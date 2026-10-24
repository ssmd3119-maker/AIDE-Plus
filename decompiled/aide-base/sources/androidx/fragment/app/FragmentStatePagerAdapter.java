package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    private final FragmentManager FH;
    private FragmentTransaction Hw = null;
    private ArrayList<Fragment.SavedState> v5 = new ArrayList<>();
    private ArrayList<Fragment> Zo = new ArrayList<>();
    private Fragment VH = null;

    public FragmentStatePagerAdapter(FragmentManager fragmentManager) {
        this.FH = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.Hw == null) {
            this.Hw = this.FH.beginTransaction();
        }
        while (this.v5.size() <= i) {
            this.v5.add(null);
        }
        this.v5.set(i, fragment.SI() ? this.FH.EQ(fragment) : null);
        this.Zo.set(i, null);
        this.Hw.tp(fragment);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.Hw;
        if (fragmentTransaction != null) {
            fragmentTransaction.gn();
            this.Hw = null;
        }
    }

    public abstract Fragment getItem(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) throws NoSuchFieldException, Resources.NotFoundException {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.Zo.size() > i && (fragment = this.Zo.get(i)) != null) {
            return fragment;
        }
        if (this.Hw == null) {
            this.Hw = this.FH.beginTransaction();
        }
        Fragment item = getItem(i);
        if (this.v5.size() > i && (savedState = this.v5.get(i)) != null) {
            item.sM(savedState);
        }
        while (this.Zo.size() <= i) {
            this.Zo.add(null);
        }
        item.a5(false);
        item.BR(false);
        this.Zo.set(i, item);
        this.Hw.DW(viewGroup.getId(), item);
        return item;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).vy() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.v5.clear();
            this.Zo.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.v5.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    Fragment fragmentV5 = this.FH.v5(bundle, str);
                    if (fragmentV5 != null) {
                        while (this.Zo.size() <= i) {
                            this.Zo.add(null);
                        }
                        fragmentV5.a5(false);
                        this.Zo.set(i, fragmentV5);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Bundle bundle;
        if (this.v5.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.v5.size()];
            this.v5.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.Zo.size(); i++) {
            Fragment fragment = this.Zo.get(i);
            if (fragment != null && fragment.SI()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.FH.tp(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) throws NoSuchFieldException, Resources.NotFoundException {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.VH;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.a5(false);
                this.VH.BR(false);
            }
            if (fragment != null) {
                fragment.a5(true);
                fragment.BR(true);
            }
            this.VH = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
