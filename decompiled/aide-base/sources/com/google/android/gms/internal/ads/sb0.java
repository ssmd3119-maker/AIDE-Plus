package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class sb0 implements rb0 {
    protected static volatile nc0 e3;
    protected float Q6;
    protected MotionEvent WB;
    protected float Z1;
    private double cT;
    protected DisplayMetrics eU;
    protected double hK;
    protected float kf;
    protected float n5;
    private double q7;
    protected LinkedList<MotionEvent> mb = new LinkedList<>();
    protected long jw = 0;
    protected long fY = 0;
    protected long qp = 0;
    protected long k2 = 0;
    protected long zh = 0;
    protected long AL = 0;
    protected long w9 = 0;
    private boolean Jl = false;
    protected boolean iW = false;

    protected sb0(Context context) {
        try {
            if (((Boolean) cw0.v5().FH(p.Jm)).booleanValue()) {
                la0.VH();
            } else {
                sc0.j6(e3);
            }
            this.eU = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String tp(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        sz szVarU7;
        try {
            if (z) {
                szVarU7 = Zo(context, view, activity);
                this.Jl = true;
            } else {
                szVarU7 = u7(context, null);
            }
            if (szVarU7 != null && szVarU7.v5() != 0) {
                return la0.j6(szVarU7, str);
            }
            return Integer.toString(5);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return Integer.toString(7);
        } catch (Throwable unused2) {
            return Integer.toString(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final String DW(Context context) {
        if (uc0.j6()) {
            if (((Boolean) cw0.v5().FH(p.oa)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return tp(context, null, false, null, null, null);
    }

    protected abstract tc0 EQ(MotionEvent motionEvent);

    @Override // com.google.android.gms.internal.ads.rb0
    public final void Hw(int i, int i2, int i3) {
        MotionEvent motionEvent = this.WB;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        DisplayMetrics displayMetrics = this.eU;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.WB = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.WB = null;
        }
        this.iW = false;
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final void VH(MotionEvent motionEvent) {
        boolean z = false;
        if (this.Jl) {
            this.k2 = 0L;
            this.qp = 0L;
            this.fY = 0L;
            this.jw = 0L;
            this.zh = 0L;
            this.w9 = 0L;
            this.AL = 0L;
            Iterator<MotionEvent> it = this.mb.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.mb.clear();
            this.WB = null;
            this.Jl = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hK = 0.0d;
            this.cT = motionEvent.getRawX();
            this.q7 = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.cT;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.q7;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.hK += Math.sqrt((d2 * d2) + (d4 * d4));
            this.cT = rawX;
            this.q7 = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.WB = motionEventObtain;
                    this.mb.add(motionEventObtain);
                    if (this.mb.size() > 6) {
                        this.mb.remove().recycle();
                    }
                    this.qp++;
                    this.zh = v5(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.fY += motionEvent.getHistorySize() + 1;
                    tc0 tc0VarEQ = EQ(motionEvent);
                    if ((tc0VarEQ == null || tc0VarEQ.v5 == null || tc0VarEQ.gn == null) ? false : true) {
                        this.AL += tc0VarEQ.v5.longValue() + tc0VarEQ.gn.longValue();
                    }
                    if (this.eU != null && tc0VarEQ != null && tc0VarEQ.Zo != null && tc0VarEQ.u7 != null) {
                        z = true;
                    }
                    if (z) {
                        this.w9 += tc0VarEQ.Zo.longValue() + tc0VarEQ.u7.longValue();
                    }
                } else if (action2 == 3) {
                    this.k2++;
                }
            } catch (kc0 unused) {
            }
        } else {
            this.Z1 = motionEvent.getX();
            this.n5 = motionEvent.getY();
            this.Q6 = motionEvent.getRawX();
            this.kf = motionEvent.getRawY();
            this.jw++;
        }
        this.iW = true;
    }

    protected abstract sz Zo(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.rb0
    public final String gn(Context context, String str, View view, Activity activity) {
        return tp(context, str, true, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final String j6(Context context, String str, View view) {
        return gn(context, str, view, null);
    }

    protected abstract sz u7(Context context, ww wwVar);

    protected abstract long v5(StackTraceElement[] stackTraceElementArr);
}
