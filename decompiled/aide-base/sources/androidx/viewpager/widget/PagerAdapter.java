package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class PagerAdapter {
    private DataSetObserver DW;
    private final DataSetObservable j6 = new DataSetObservable();

    @Deprecated
    public void destroyItem(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        destroyItem((View) viewGroup, i, obj);
        throw null;
    }

    @Deprecated
    public void finishUpdate(View view) {
    }

    public void finishUpdate(ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    public abstract int getCount();

    public int getItemPosition(Object obj) {
        return -1;
    }

    public CharSequence getPageTitle(int i) {
        return null;
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    @Deprecated
    public Object instantiateItem(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        instantiateItem((View) viewGroup, i);
        throw null;
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged() {
        synchronized (this) {
            if (this.DW != null) {
                this.DW.onChanged();
            }
        }
        this.j6.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.j6.registerObserver(dataSetObserver);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    @Deprecated
    public void setPrimaryItem(View view, int i, Object obj) {
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        setPrimaryItem((View) viewGroup, i, obj);
    }

    void setViewPagerObserver(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.DW = dataSetObserver;
        }
    }

    @Deprecated
    public void startUpdate(View view) {
    }

    public void startUpdate(ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.j6.unregisterObserver(dataSetObserver);
    }
}
