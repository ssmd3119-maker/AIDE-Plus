package androidx.lifecycle;

import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {
    private final LifecycleOwner FH;
    private FastSafeIterableMap<Object, ObserverWithState> j6 = new FastSafeIterableMap<>();
    private int mAddingObserverCounter = 0;
    private boolean v5 = false;
    private boolean Zo = false;
    private ArrayList<Lifecycle.State> VH = new ArrayList<>();
    private Lifecycle.State DW = Lifecycle.State.INITIALIZED;

    static class ObserverWithState {
        GenericLifecycleObserver DW;
        Lifecycle.State j6;

        void j6(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State stateHw = LifecycleRegistry.Hw(event);
            this.j6 = LifecycleRegistry.gn(this.j6, stateHw);
            this.DW.j6(lifecycleOwner, event);
            this.j6 = stateHw;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] DW;
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            DW = iArr;
            try {
                iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DW[Lifecycle.State.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DW[Lifecycle.State.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DW[Lifecycle.State.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DW[Lifecycle.State.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[Lifecycle.Event.values().length];
            j6 = iArr2;
            try {
                iArr2[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                j6[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                j6[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                j6[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                j6[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                j6[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                j6[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this.FH = lifecycleOwner;
    }

    private static Lifecycle.Event DW(Lifecycle.State state) {
        int i = a.DW[state.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return Lifecycle.Event.ON_DESTROY;
        }
        if (i == 3) {
            return Lifecycle.Event.ON_STOP;
        }
        if (i == 4) {
            return Lifecycle.Event.ON_PAUSE;
        }
        if (i == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + state);
    }

    private void EQ() {
        while (!Zo()) {
            this.Zo = false;
            if (this.DW.compareTo(this.j6.Hw().getValue().j6) < 0) {
                j6();
            }
            Map.Entry<Object, ObserverWithState> entryVH = this.j6.VH();
            if (!this.Zo && entryVH != null && this.DW.compareTo(entryVH.getValue().j6) > 0) {
                FH();
            }
        }
        this.Zo = false;
    }

    private void FH() {
        SafeIterableMap<Object, ObserverWithState>.e eVarV5 = this.j6.v5();
        while (eVarV5.hasNext() && !this.Zo) {
            Map.Entry next = eVarV5.next();
            ObserverWithState observerWithState = (ObserverWithState) next.getValue();
            while (observerWithState.j6.compareTo(this.DW) < 0 && !this.Zo && this.j6.contains(next.getKey())) {
                tp(observerWithState.j6);
                observerWithState.j6(this.FH, we(observerWithState.j6));
                u7();
            }
        }
    }

    static Lifecycle.State Hw(Lifecycle.Event event) {
        switch (a.j6[event.ordinal()]) {
            case 1:
            case 2:
                return Lifecycle.State.CREATED;
            case 3:
            case 4:
                return Lifecycle.State.STARTED;
            case 5:
                return Lifecycle.State.RESUMED;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return Lifecycle.State.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    private boolean Zo() {
        if (this.j6.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.j6.Hw().getValue().j6;
        Lifecycle.State state2 = this.j6.VH().getValue().j6;
        return state == state2 && this.DW == state2;
    }

    static Lifecycle.State gn(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    private void j6() {
        Iterator<Map.Entry<Object, ObserverWithState>> itDW = this.j6.DW();
        while (itDW.hasNext() && !this.Zo) {
            Map.Entry<Object, ObserverWithState> next = itDW.next();
            ObserverWithState value = next.getValue();
            while (value.j6.compareTo(this.DW) > 0 && !this.Zo && this.j6.contains(next.getKey())) {
                Lifecycle.Event eventDW = DW(value.j6);
                tp(Hw(eventDW));
                value.j6(this.FH, eventDW);
                u7();
            }
        }
    }

    private void tp(Lifecycle.State state) {
        this.VH.add(state);
    }

    private void u7() {
        this.VH.remove(r0.size() - 1);
    }

    private static Lifecycle.Event we(Lifecycle.State state) {
        int i = a.DW[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Lifecycle.Event.ON_START;
            }
            if (i == 3) {
                return Lifecycle.Event.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
        }
        return Lifecycle.Event.ON_CREATE;
    }

    public void VH(Lifecycle.State state) {
        this.DW = state;
    }

    public void v5(Lifecycle.Event event) {
        this.DW = Hw(event);
        if (this.v5 || this.mAddingObserverCounter != 0) {
            this.Zo = true;
            return;
        }
        this.v5 = true;
        EQ();
        this.v5 = false;
    }
}
