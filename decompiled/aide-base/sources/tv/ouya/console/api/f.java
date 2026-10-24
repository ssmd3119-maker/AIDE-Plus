package tv.ouya.console.api;

import android.app.Activity;
import android.hardware.input.InputManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;
import tv.ouya.console.api.b;

/* loaded from: classes.dex */
public class f {
    private static InputManager Hw = null;
    private static final String j6 = "f";
    private static final Uri DW = Uri.parse("content://tv.ouya.controllerdata/");
    private static a FH = null;
    private static boolean v5 = true;
    private static SparseArray<b.f> Zo = new SparseArray<>();
    private static List<SparseBooleanArray> VH = new ArrayList();
    private static b gn = new b();
    private static boolean u7 = false;

    static class a implements InputManager.InputDeviceListener {
        a() {
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(int i) {
            if (f.Zo.get(i) == null) {
                c cVarDW = c.DW(i);
                if (cVarDW != null) {
                    b.f fVarDW = f.gn.DW(f.gn.FH(cVarDW.VH()));
                    if (fVarDW != null) {
                        f.Zo.put(i, fVarDW);
                        return;
                    }
                    return;
                }
                Log.e(f.j6, "onInputDeviceAdded device=" + i + " not found");
            }
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(int i) {
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int i) {
            if (f.Zo.get(i) != null) {
                f.Zo.remove(i);
            }
        }
    }

    public static void EQ(boolean z) {
        v5 = z;
    }

    public static boolean Hw(Activity activity, MotionEvent motionEvent) {
        boolean z;
        int pointerCount;
        boolean zTp;
        if (!we(motionEvent)) {
            throw new RuntimeException("Don't pass events when shouldHandleInputEvent is false");
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && (currentFocus instanceof EditText)) {
            return u7(activity, motionEvent);
        }
        int iTp = c.tp(motionEvent.getDeviceId());
        if (iTp < 0) {
            Log.e(j6, "Failed to find playerNum for Controller=" + motionEvent.getDevice().getName());
            return u7(activity, motionEvent);
        }
        b.f fVarVH = VH(motionEvent.getDeviceId());
        if (fVarVH == null) {
            return u7(activity, motionEvent);
        }
        int source = motionEvent.getSource();
        Vector<b.e> vector = fVarVH.v5;
        if (vector != null) {
            boolean z2 = false;
            for (int i = 0; i < vector.size(); i++) {
                b.e eVar = vector.get(i);
                float axisValue = motionEvent.getAxisValue(eVar.j6);
                if (axisValue < eVar.FH || axisValue > eVar.DW) {
                    if (VH.get(iTp).get(eVar.Hw)) {
                        VH.get(iTp).put(eVar.Hw, false);
                        zTp = tp(activity, new KeyEvent(0L, 0L, 1, eVar.Hw, 0, 0, motionEvent.getDeviceId(), 0, 1024), true);
                        z2 |= zTp;
                    }
                } else if (!VH.get(iTp).get(eVar.Hw)) {
                    VH.get(iTp).put(eVar.Hw, true);
                    zTp = tp(activity, new KeyEvent(0L, 0L, 0, eVar.Hw, 0, 0, motionEvent.getDeviceId(), 0, 1024), true);
                    z2 |= zTp;
                }
            }
            z = z2;
        } else {
            z = false;
        }
        if (fVarVH.DW.size() > 0 && fVarVH.DW.get(source)) {
            return true;
        }
        Vector<b.c> vector2 = fVarVH.FH;
        if (vector2 == null || (pointerCount = motionEvent.getPointerCount()) <= 0 || vector2.size() <= 0) {
            return z | u7(activity, motionEvent);
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = {new MotionEvent.PointerProperties()};
        MotionEvent.PointerCoords[] pointerCoordsArr = {new MotionEvent.PointerCoords()};
        motionEvent.getPointerProperties(0, pointerPropertiesArr[0]);
        motionEvent.getPointerCoords(0, pointerCoordsArr[0]);
        for (int i2 = 0; i2 < vector2.size(); i2++) {
            b.c cVar = vector2.get(i2);
            int i3 = cVar.j6;
            if (i3 != cVar.DW) {
                pointerCoordsArr[0].setAxisValue(cVar.DW, motionEvent.getAxisValue(i3));
            }
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), 1.0f, 1.0f, motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), source, motionEvent.getFlags());
        boolean zU7 = z | u7(activity, motionEventObtain);
        motionEventObtain.recycle();
        return zU7;
    }

    public static void J0(Activity activity) {
        InputManager inputManager = Hw;
        if (inputManager != null) {
            inputManager.unregisterInputDeviceListener(FH);
        }
    }

    private static b.f VH(int i) {
        if (Zo.get(i) != null) {
            return Zo.get(i);
        }
        FH.onInputDeviceAdded(i);
        return Zo.get(i);
    }

    private static String Zo(Activity activity) {
        Bundle bundleCall;
        try {
            bundleCall = activity.getApplicationContext().getContentResolver().call(DW, "get_button_remap_json", (String) null, (Bundle) null);
        } catch (IllegalArgumentException unused) {
            Log.e(j6, "Error querying button remapping");
            bundleCall = null;
        }
        if (bundleCall != null) {
            return bundleCall.getString("button_remap");
        }
        return null;
    }

    public static void gn(Activity activity) throws JSONException {
        c.we(activity);
        if (FH == null) {
            FH = new a();
            InputManager inputManager = (InputManager) activity.getSystemService("input");
            Hw = inputManager;
            if (inputManager != null) {
                inputManager.registerInputDeviceListener(FH, null);
            }
        }
        for (int i = 0; i < 4; i++) {
            VH.add(new SparseBooleanArray());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            c cVarFH = c.FH(i2);
            if (cVarFH != null) {
                String name = cVarFH.Hw() != null ? cVarFH.Hw().getName() : "null";
                Log.i(j6, "OUYA Controller #" + i2 + ": " + name);
            }
        }
        gn.v5(Zo(activity));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[PHI: r1
      0x0065: PHI (r1v2 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v4 boolean) binds: [B:13:0x0026, B:14:0x0028, B:21:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean tp(android.app.Activity r16, android.view.KeyEvent r17, boolean r18) {
        /*
            r0 = r17
            int r1 = r17.getKeyCode()
            int r2 = r17.getAction()
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 == r3) goto L10
            goto L1f
        L10:
            boolean r2 = tv.ouya.console.api.f.v5
            if (r2 == 0) goto L1f
            tv.ouya.console.api.c.QX(r1, r0)
            goto L1f
        L18:
            boolean r2 = tv.ouya.console.api.f.v5
            if (r2 == 0) goto L1f
            tv.ouya.console.api.c.J8(r1, r0)
        L1f:
            tv.ouya.console.api.f.u7 = r3
            boolean r1 = r16.dispatchKeyEvent(r17)
            r2 = 0
            if (r1 != 0) goto L65
            if (r18 == 0) goto L65
            int r4 = r17.getKeyCode()
            switch(r4) {
                case 96: goto L38;
                case 97: goto L35;
                case 98: goto L31;
                case 99: goto L33;
                case 100: goto L33;
                default: goto L31;
            }
        L31:
            r10 = 0
            goto L3c
        L33:
            r1 = 1
            goto L31
        L35:
            r4 = 4
            r10 = 4
            goto L3c
        L38:
            r4 = 23
            r10 = 23
        L3c:
            if (r10 == 0) goto L65
            android.view.KeyEvent r1 = new android.view.KeyEvent
            long r5 = r17.getDownTime()
            long r7 = r17.getEventTime()
            int r9 = r17.getAction()
            int r11 = r17.getRepeatCount()
            int r12 = r17.getMetaState()
            int r13 = r17.getDeviceId()
            r14 = 0
            r15 = 1024(0x400, float:1.435E-42)
            r4 = r1
            r4.<init>(r5, r7, r9, r10, r11, r12, r13, r14, r15)
            r0 = r16
            r0.dispatchKeyEvent(r1)
            goto L66
        L65:
            r3 = r1
        L66:
            tv.ouya.console.api.f.u7 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.ouya.console.api.f.tp(android.app.Activity, android.view.KeyEvent, boolean):boolean");
    }

    private static boolean u7(Activity activity, MotionEvent motionEvent) {
        if (v5) {
            c.J0(motionEvent);
        }
        u7 = true;
        boolean zDispatchGenericMotionEvent = activity.dispatchGenericMotionEvent(motionEvent);
        u7 = false;
        return zDispatchGenericMotionEvent;
    }

    public static boolean v5(Activity activity, KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (!we(keyEvent)) {
            throw new RuntimeException("Don't pass events when shouldHandleInputEvent is false");
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && (currentFocus instanceof EditText)) {
            return tp(activity, keyEvent2, false);
        }
        b.f fVarVH = VH(keyEvent.getDeviceId());
        if (fVarVH == null) {
            return tp(activity, keyEvent2, true);
        }
        int keyCode = keyEvent.getKeyCode();
        int source = keyEvent.getSource();
        b.d dVarJ6 = gn.j6(fVarVH, keyCode);
        if (dVarJ6 == null) {
            return tp(activity, keyEvent2, true);
        }
        if (dVarJ6.FH.size() > 0 && dVarJ6.FH.get(source)) {
            return true;
        }
        if (keyCode != dVarJ6.DW) {
            keyEvent2 = new KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), dVarJ6.DW, keyEvent.getRepeatCount(), keyEvent.getMetaState(), keyEvent.getDeviceId(), 0);
        }
        return tp(activity, keyEvent2, true);
    }

    public static boolean we(InputEvent inputEvent) {
        return !u7;
    }
}
