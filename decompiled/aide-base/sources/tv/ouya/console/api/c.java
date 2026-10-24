package tv.ouya.console.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public class c {
    private static int[] VH = {0, 1, 11, 14, 17, 18};
    private static final Uri gn = Uri.parse("content://tv.ouya.controllerdata/");
    static final c[] tp = new c[4];
    private static Context u7;
    private InputDevice DW;
    private String FH;
    private int j6;
    private SparseArray<Float> Hw = new SparseArray<>();
    private SparseBooleanArray v5 = new SparseBooleanArray();
    private SparseIntArray Zo = new SparseIntArray();

    static class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!intent.getAction().equals("tv.ouya.controller.added")) {
                if (intent.getAction().equals("tv.ouya.controller.removed")) {
                    int intExtra = intent.getIntExtra("DEVICE_ID", -1);
                    for (int i = 0; i < 4; i++) {
                        c cVar = c.tp[i];
                        if (cVar != null && cVar.v5() == intExtra) {
                            c.tp[i] = null;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int intExtra2 = intent.getIntExtra("DEVICE_ID", -1);
            int intExtra3 = intent.getIntExtra("PLAYER_NUM", -1);
            if (intExtra3 < 0 || intExtra3 >= 4) {
                return;
            }
            if (c.tp[intExtra3] != null) {
                Log.e("OuyaController", "Controller already exists for player " + intExtra3 + "(new device id " + intExtra2 + ", prev device id " + c.tp[intExtra3].v5() + ")");
            }
            c.tp[intExtra3] = new c(intExtra2);
        }
    }

    c(int i) {
        InputDevice inputDevice;
        this.j6 = i;
        this.DW = InputDevice.getDevice(i);
        String strJ6 = j6(i);
        this.FH = strJ6;
        if ((strJ6 == null || strJ6.isEmpty()) && (inputDevice = this.DW) != null) {
            this.FH = inputDevice.getName();
        }
    }

    public static c DW(int i) {
        for (c cVar : tp) {
            if (cVar != null && cVar.v5() == i) {
                return cVar;
            }
        }
        return null;
    }

    private static int EQ(int i) {
        Context context = u7;
        if (context == null) {
            return -1;
        }
        Cursor cursorQuery = context.getContentResolver().query(gn, new String[]{"player_num"}, "input_device_id = ?", new String[]{String.valueOf(i)}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    return cursorQuery.getInt(0);
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return -1;
    }

    public static c FH(int i) {
        if (i < 0 || i >= 4) {
            return null;
        }
        return tp[i];
    }

    public static boolean J0(MotionEvent motionEvent) {
        c cVarGn;
        if ((motionEvent.getSource() & 16) == 0 || motionEvent.getAction() != 2 || (cVarGn = gn(motionEvent.getDeviceId())) == null) {
            return false;
        }
        for (int i : VH) {
            Float f = cVarGn.Hw.get(i);
            float axisValue = motionEvent.getAxisValue(i);
            if (f == null || f.floatValue() != axisValue) {
                cVarGn.Hw.put(i, Float.valueOf(axisValue));
            }
        }
        return true;
    }

    public static boolean J8(int i, KeyEvent keyEvent) {
        return Ws(i, keyEvent);
    }

    public static boolean QX(int i, KeyEvent keyEvent) {
        return Ws(i, keyEvent);
    }

    private static boolean Ws(int i, KeyEvent keyEvent) {
        c cVarGn = gn(keyEvent.getDeviceId());
        if (cVarGn == null) {
            return false;
        }
        int action = keyEvent.getAction();
        boolean z = action == 0 || (action != 1 && action == 2);
        int keyCode = keyEvent.getKeyCode();
        if (cVarGn.v5.indexOfKey(keyCode) < 0 || cVarGn.v5.get(keyCode) != z) {
            cVarGn.Zo.put(keyCode, cVarGn.Zo.get(keyCode, 0) | (z ? 1 : 2));
        }
        cVarGn.v5.put(keyCode, z);
        return true;
    }

    private static int Zo(int i) {
        Cursor cursorQuery = u7.getContentResolver().query(gn, new String[]{"input_device_id"}, "player_num = ?", new String[]{String.valueOf(i)}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    int i2 = cursorQuery.getInt(0);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return i2;
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }

    private static c gn(int i) {
        c cVarDW = DW(i);
        if (cVarDW != null) {
            return cVarDW;
        }
        int iEQ = EQ(i);
        if (iEQ < 0 || iEQ >= 4) {
            return null;
        }
        c[] cVarArr = tp;
        if (cVarArr[iEQ] == null) {
            cVarArr[iEQ] = new c(i);
            return tp[iEQ];
        }
        Log.e("OuyaController", "Controller for player " + iEQ + " already found, but doesn't match device id (expected " + i + " got " + tp[iEQ].v5() + ")");
        return tp[iEQ];
    }

    private static String j6(int i) {
        Context context = u7;
        String string = null;
        if (context == null) {
            return null;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(gn, new String[]{"bt_name"}, "input_device_id = ?", new String[]{String.valueOf(i)}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        string = cursorQuery.getString(0);
                    }
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        } catch (SQLiteException unused) {
        } catch (Exception e) {
            Log.d("OuyaController", "Exception: " + e.getMessage());
        }
        return string;
    }

    public static int tp(int i) {
        c cVarGn = gn(i);
        if (cVarGn == null) {
            return -1;
        }
        return cVarGn.u7();
    }

    public static void we(Context context) {
        if (u7 != null) {
            return;
        }
        u7 = context.getApplicationContext();
        for (int i = 0; i < 4; i++) {
            int iZo = Zo(i);
            if (iZo != -1) {
                gn(iZo);
            }
        }
        a aVar = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("tv.ouya.controller.added");
        intentFilter.addAction("tv.ouya.controller.removed");
        u7.registerReceiver(aVar, intentFilter);
    }

    public InputDevice Hw() {
        return this.DW;
    }

    public String VH() {
        return this.FH;
    }

    public int u7() {
        for (int i = 0; i < 4; i++) {
            if (tp[i] == this) {
                return i;
            }
        }
        return -1;
    }

    public int v5() {
        return this.j6;
    }
}
