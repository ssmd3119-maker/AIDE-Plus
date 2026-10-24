package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList<a> WB;
    private int fY;
    private FragmentManager jw;
    private a k2;
    private Context mb;
    private TabHost.OnTabChangeListener qp;
    private boolean zh;

    static class DummyTabFactory implements TabHost.TabContentFactory {
        private final Context j6;

        public DummyTabFactory(Context context) {
            this.j6 = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.j6);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String WB;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.WB + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.WB);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.WB = parcel.readString();
        }
    }

    static final class a {
        final Class<?> DW;
        final Bundle FH;
        Fragment Hw;
        final String j6;
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        this.WB = new ArrayList<>();
        FH(context, null);
    }

    private a DW(String str) {
        int size = this.WB.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.WB.get(i);
            if (aVar.j6.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private void FH(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.fY = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    private FragmentTransaction j6(String str, FragmentTransaction fragmentTransaction) throws ClassNotFoundException {
        Fragment fragment;
        a aVarDW = DW(str);
        if (this.k2 != aVarDW) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.jw.beginTransaction();
            }
            a aVar = this.k2;
            if (aVar != null && (fragment = aVar.Hw) != null) {
                fragmentTransaction.u7(fragment);
            }
            if (aVarDW != null) {
                Fragment fragment2 = aVarDW.Hw;
                if (fragment2 == null) {
                    Fragment fragmentEi = Fragment.ei(this.mb, aVarDW.DW.getName(), aVarDW.FH);
                    aVarDW.Hw = fragmentEi;
                    fragmentTransaction.FH(this.fY, fragmentEi, aVarDW.j6);
                } else {
                    fragmentTransaction.v5(fragment2);
                }
            }
            this.k2 = aVarDW;
        }
        return fragmentTransaction;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws ClassNotFoundException {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.WB.size();
        FragmentTransaction fragmentTransactionBeginTransaction = null;
        for (int i = 0; i < size; i++) {
            a aVar = this.WB.get(i);
            Fragment fragmentHw = this.jw.Hw(aVar.j6);
            aVar.Hw = fragmentHw;
            if (fragmentHw != null && !fragmentHw.KD()) {
                if (aVar.j6.equals(currentTabTag)) {
                    this.k2 = aVar;
                } else {
                    if (fragmentTransactionBeginTransaction == null) {
                        fragmentTransactionBeginTransaction = this.jw.beginTransaction();
                    }
                    fragmentTransactionBeginTransaction.u7(aVar.Hw);
                }
            }
        }
        this.zh = true;
        FragmentTransaction fragmentTransactionJ6 = j6(currentTabTag, fragmentTransactionBeginTransaction);
        if (fragmentTransactionJ6 != null) {
            fragmentTransactionJ6.commit();
            this.jw.FH();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.zh = false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.WB);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.WB = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        FragmentTransaction fragmentTransactionJ6;
        if (this.zh && (fragmentTransactionJ6 = j6(str, null)) != null) {
            fragmentTransactionJ6.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.qp;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.qp = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.WB = new ArrayList<>();
        FH(context, attributeSet);
    }
}
