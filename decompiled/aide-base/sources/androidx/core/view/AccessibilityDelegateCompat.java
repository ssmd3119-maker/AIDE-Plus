package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

/* loaded from: classes.dex */
public class AccessibilityDelegateCompat {
    private static final b DW;
    private static final View.AccessibilityDelegate FH;
    final View.AccessibilityDelegate j6 = DW.DW(this);

    static class a extends b {

        /* renamed from: androidx.core.view.AccessibilityDelegateCompat$a$a, reason: collision with other inner class name */
        class C0030a extends View.AccessibilityDelegate {
            final /* synthetic */ AccessibilityDelegateCompat j6;

            C0030a(a aVar, AccessibilityDelegateCompat accessibilityDelegateCompat) {
                this.j6 = accessibilityDelegateCompat;
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return this.j6.j6(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                AccessibilityNodeProviderCompat accessibilityNodeProviderCompatDW = this.j6.DW(view);
                if (accessibilityNodeProviderCompatDW != null) {
                    return (AccessibilityNodeProvider) accessibilityNodeProviderCompatDW.j6();
                }
                return null;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.j6.Hw(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                this.j6.v5(view, AccessibilityNodeInfoCompat.I(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.j6.Zo(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return this.j6.VH(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return this.j6.gn(view, i, bundle);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i) {
                this.j6.u7(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                this.j6.tp(view, accessibilityEvent);
            }
        }

        a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat.b
        public View.AccessibilityDelegate DW(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            return new C0030a(this, accessibilityDelegateCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat.b
        public boolean FH(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat.b
        public AccessibilityNodeProviderCompat j6(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
            }
            return null;
        }
    }

    static class b {

        class a extends View.AccessibilityDelegate {
            final /* synthetic */ AccessibilityDelegateCompat j6;

            a(b bVar, AccessibilityDelegateCompat accessibilityDelegateCompat) {
                this.j6 = accessibilityDelegateCompat;
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return this.j6.j6(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.j6.Hw(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                this.j6.v5(view, AccessibilityNodeInfoCompat.I(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.j6.Zo(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return this.j6.VH(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i) {
                this.j6.u7(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                this.j6.tp(view, accessibilityEvent);
            }
        }

        b() {
        }

        public View.AccessibilityDelegate DW(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            return new a(this, accessibilityDelegateCompat);
        }

        public boolean FH(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }

        public AccessibilityNodeProviderCompat j6(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            DW = new a();
        } else {
            DW = new b();
        }
        FH = new View.AccessibilityDelegate();
    }

    public AccessibilityNodeProviderCompat DW(View view) {
        return DW.j6(FH, view);
    }

    View.AccessibilityDelegate FH() {
        return this.j6;
    }

    public void Hw(View view, AccessibilityEvent accessibilityEvent) {
        FH.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean VH(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return FH.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void Zo(View view, AccessibilityEvent accessibilityEvent) {
        FH.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean gn(View view, int i, Bundle bundle) {
        return DW.FH(FH, view, i, bundle);
    }

    public boolean j6(View view, AccessibilityEvent accessibilityEvent) {
        return FH.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void tp(View view, AccessibilityEvent accessibilityEvent) {
        FH.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public void u7(View view, int i) {
        FH.sendAccessibilityEvent(view, i);
    }

    public void v5(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        FH.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.Mz());
    }
}
