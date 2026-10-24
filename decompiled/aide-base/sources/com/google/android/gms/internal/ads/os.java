package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.aide.uidesigner.ProxyTextView;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class os implements SensorEventListener {
    private final Display FH;
    private Handler VH;

    @GuardedBy("mSensorThreadLock")
    private float[] Zo;
    private qs gn;
    private final SensorManager j6;
    private final float[] Hw = new float[9];
    private final float[] v5 = new float[9];
    private final Object DW = new Object();

    os(Context context) {
        this.j6 = (SensorManager) context.getSystemService("sensor");
        this.FH = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void v5(int i, int i2) {
        float[] fArr = this.v5;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }

    final void DW() {
        if (this.VH == null) {
            return;
        }
        this.j6.unregisterListener(this);
        this.VH.post(new ps(this));
        this.VH = null;
    }

    final void FH(qs qsVar) {
        this.gn = qsVar;
    }

    final boolean Hw(float[] fArr) {
        synchronized (this.DW) {
            if (this.Zo == null) {
                return false;
            }
            System.arraycopy(this.Zo, 0, fArr, 0, this.Zo.length);
            return true;
        }
    }

    final void j6() {
        if (this.VH != null) {
            return;
        }
        Sensor defaultSensor = this.j6.getDefaultSensor(11);
        if (defaultSensor == null) {
            xp.j6("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.VH = handler;
        if (this.j6.registerListener(this, defaultSensor, 0, handler)) {
            return;
        }
        xp.j6("SensorManager.registerListener failed.");
        DW();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.DW) {
            if (this.Zo == null) {
                this.Zo = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.Hw, fArr);
        int rotation = this.FH.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.Hw, 2, ProxyTextView.INPUTTYPE_textPassword, this.v5);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.Hw, ProxyTextView.INPUTTYPE_textPassword, 130, this.v5);
        } else if (rotation != 3) {
            System.arraycopy(this.Hw, 0, this.v5, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.Hw, 130, 1, this.v5);
        }
        v5(1, 3);
        v5(2, 6);
        v5(5, 7);
        synchronized (this.DW) {
            System.arraycopy(this.v5, 0, this.Zo, 0, 9);
        }
        qs qsVar = this.gn;
        if (qsVar != null) {
            qsVar.j6();
        }
    }
}
