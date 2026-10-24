package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class op0 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
    private final int[] WB;
    private Error fY;
    private SurfaceTexture jw;
    private zzqk k2;
    private Handler mb;
    private RuntimeException qp;

    public op0() {
        super("dummySurface");
        this.WB = new int[1];
    }

    public final zzqk DW(boolean z) {
        boolean z2;
        start();
        this.mb = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.mb.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.k2 == null && this.qp == null && this.fY == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.qp;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.fY;
        if (error == null) {
            return this.k2;
        }
        throw error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.jw.updateTexImage();
                    return true;
                }
                if (i != 3) {
                    return true;
                }
                try {
                    try {
                        this.jw.release();
                    } finally {
                        this.k2 = null;
                        this.jw = null;
                        GLES20.glDeleteTextures(1, this.WB, 0);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("DummySurface", "Failed to release dummy surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    ro0.v5(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr = new int[2];
                    ro0.v5(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    ro0.v5(EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                    ro0.v5(eGLContextEglCreateContext != null, "eglCreateContext failed");
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    ro0.v5(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    ro0.v5(EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.WB, 0);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.WB[0]);
                    this.jw = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.k2 = new zzqk(this, this.jw, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.fY = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (RuntimeException e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.qp = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final void j6() {
        this.mb.sendEmptyMessage(3);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mb.sendEmptyMessage(2);
    }
}
