package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@jg
@TargetApi(14)
/* loaded from: classes.dex */
public final class zzbdx extends Thread implements SurfaceTexture.OnFrameAvailableListener, qs {
    private static final float[] oy = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private final float[] AL;
    private volatile boolean Cz;
    private EGLSurface Gj;
    private int Jl;
    private SurfaceTexture Q6;
    private final os WB;
    private int Z1;
    private float cT;
    private final CountDownLatch e3;
    private FloatBuffer eU;
    private EGLContext fN;
    private final float[] fY;
    private float hK;
    private int iW;
    private final float[] jw;
    private final float[] k2;
    private int kf;
    private final float[] mb;
    private SurfaceTexture n5;
    private volatile boolean pN;
    private EGLDisplay pO;
    private int q7;
    private final float[] qp;
    private final Object sE;
    private EGL10 sg;
    private float w9;
    private final float[] zh;

    public zzbdx(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(oy.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.eU = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(oy).position(0);
        this.mb = new float[9];
        this.jw = new float[9];
        this.fY = new float[9];
        this.qp = new float[9];
        this.k2 = new float[9];
        this.zh = new float[9];
        this.AL = new float[9];
        this.w9 = Float.NaN;
        os osVar = new os(context);
        this.WB = osVar;
        osVar.FH(this);
        this.e3 = new CountDownLatch(1);
        this.sE = new Object();
    }

    private static void EQ(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static void FH(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void Hw(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void J0(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private final boolean u7() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.Gj;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.sg.eglDestroySurface(this.pO, this.Gj) | this.sg.eglMakeCurrent(this.pO, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.Gj = null;
        }
        EGLContext eGLContext = this.fN;
        if (eGLContext != null) {
            zEglDestroyContext |= this.sg.eglDestroyContext(this.pO, eGLContext);
            this.fN = null;
        }
        EGLDisplay eGLDisplay = this.pO;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = zEglDestroyContext | this.sg.eglTerminate(eGLDisplay);
        this.pO = null;
        return zEglTerminate;
    }

    private static int we(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        J0("createShader");
        if (iGlCreateShader == 0) {
            return iGlCreateShader;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        J0("shaderSource");
        GLES20.glCompileShader(iGlCreateShader);
        J0("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        J0("getShaderiv");
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        J0("deleteShader");
        return 0;
    }

    public final void DW(SurfaceTexture surfaceTexture, int i, int i2) {
        this.Z1 = i;
        this.q7 = i2;
        this.Q6 = surfaceTexture;
    }

    public final void J8(int i, int i2) {
        synchronized (this.sE) {
            this.Z1 = i;
            this.q7 = i2;
            this.Cz = true;
            this.sE.notifyAll();
        }
    }

    public final void VH() {
        synchronized (this.sE) {
            this.pN = true;
            this.Q6 = null;
            this.sE.notifyAll();
        }
    }

    public final SurfaceTexture gn() throws InterruptedException {
        if (this.Q6 == null) {
            return null;
        }
        try {
            this.e3.await();
        } catch (InterruptedException unused) {
        }
        return this.n5;
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void j6() {
        synchronized (this.sE) {
            this.sE.notifyAll();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.iW++;
        synchronized (this.sE) {
            this.sE.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdx.run():void");
    }

    public final void tp(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.Z1;
        int i2 = this.q7;
        if (i > i2) {
            f3 = (f * 1.7453293f) / i;
            f4 = f2 * 1.7453293f;
            f5 = i;
        } else {
            f3 = (f * 1.7453293f) / i2;
            f4 = f2 * 1.7453293f;
            f5 = i2;
        }
        this.hK -= f3;
        float f6 = this.cT - (f4 / f5);
        this.cT = f6;
        if (f6 < -1.5707964f) {
            this.cT = -1.5707964f;
        }
        if (this.cT > 1.5707964f) {
            this.cT = 1.5707964f;
        }
    }
}
