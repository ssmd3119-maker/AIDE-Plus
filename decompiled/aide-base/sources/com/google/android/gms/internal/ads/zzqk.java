package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.aide.uidesigner.ProxyTextView;

@TargetApi(ProxyTextView.INPUTTYPE_textUri)
/* loaded from: classes.dex */
public final class zzqk extends Surface {
    private static boolean fY;
    private static boolean jw;
    private final op0 WB;
    private boolean mb;

    private zzqk(op0 op0Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.WB = op0Var;
    }

    public static zzqk DW(Context context, boolean z) {
        if (ip0.j6 < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        ro0.Hw(!z || j6(context));
        return new op0().DW(z);
    }

    public static synchronized boolean j6(Context context) {
        if (!fY) {
            if (ip0.j6 >= 17) {
                boolean z = false;
                String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (strEglQueryString != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
                    if (!(ip0.j6 == 24 && (ip0.Hw.startsWith("SM-G950") || ip0.Hw.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                        z = true;
                    }
                }
                jw = z;
            }
            fY = true;
        }
        return jw;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.WB) {
            if (!this.mb) {
                this.WB.j6();
                this.mb = true;
            }
        }
    }
}
