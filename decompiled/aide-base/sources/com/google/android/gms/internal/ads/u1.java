package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class u1 extends k2 implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, z1 {
    private static final String[] cT = {"2011", "1009", "3010"};
    private View fY;
    private FrameLayout jw;
    private View k2;
    private final FrameLayout mb;
    private h1 zh;
    private final Object WB = new Object();
    private Map<String, WeakReference<View>> qp = Collections.synchronizedMap(new HashMap());
    private Point AL = new Point();
    private Point w9 = new Point();
    private WeakReference<fr0> hK = new WeakReference<>(null);

    @TargetApi(21)
    public u1(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.mb = frameLayout;
        this.jw = frameLayout2;
        com.google.android.gms.ads.internal.w0.P8();
        nr.j6(this.mb, this);
        com.google.android.gms.ads.internal.w0.P8();
        nr.DW(this.mb, this);
        this.mb.setOnTouchListener(this);
        this.mb.setOnClickListener(this);
        if (frameLayout2 != null && com.google.android.gms.common.util.o.gn()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        p.j6(this.mb.getContext());
    }

    private final void CO(View view) {
        h1 h1VarGW = this.zh;
        if (h1VarGW != null) {
            if (h1VarGW instanceof g1) {
                h1VarGW = ((g1) h1VarGW).gW();
            }
            if (h1VarGW != null) {
                h1VarGW.sT(view);
            }
        }
    }

    private final int k6(int i) {
        cw0.j6();
        return mp.J0(this.zh.getContext(), i);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final View AR() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void St(String str, abcd.wu wuVar) {
        View view = (View) abcd.xu.g3(wuVar);
        synchronized (this.WB) {
            if (this.qp == null) {
                return;
            }
            if (view != null) {
                this.qp.put(str, new WeakReference<>(view));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view.setOnTouchListener(this);
                    view.setClickable(true);
                    view.setOnClickListener(this);
                }
                return;
            }
            this.qp.remove(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void TG(abcd.wu wuVar, int i) {
        WeakReference<fr0> weakReference;
        fr0 fr0Var;
        if (!com.google.android.gms.ads.internal.w0.ei().U2(this.mb.getContext()) || (weakReference = this.hK) == null || (fr0Var = weakReference.get()) == null) {
            return;
        }
        fr0Var.EQ();
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void Za(abcd.wu wuVar) {
        this.zh.Of((View) abcd.xu.g3(wuVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[Catch: all -> 0x0214, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:10:0x0016, B:12:0x001c, B:13:0x0025, B:15:0x002c, B:17:0x0032, B:19:0x0038, B:21:0x0048, B:23:0x004e, B:24:0x0051, B:27:0x005d, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:36:0x0084, B:38:0x0088, B:40:0x008a, B:42:0x009b, B:44:0x009f, B:46:0x00ad, B:48:0x00b9, B:51:0x00c4, B:53:0x00c8, B:59:0x00d2, B:61:0x00db, B:63:0x00df, B:65:0x00ef, B:66:0x00f8, B:68:0x0112, B:69:0x0117, B:71:0x0126, B:72:0x013b, B:74:0x0145, B:75:0x014c, B:84:0x0169, B:86:0x016d, B:87:0x0176, B:88:0x0178, B:106:0x01b4, B:108:0x01ce, B:110:0x01d4, B:112:0x01da, B:114:0x01ea, B:116:0x01f4, B:117:0x0208, B:118:0x020f, B:122:0x0213, B:78:0x0152, B:80:0x015b, B:81:0x0161, B:49:0x00c0, B:33:0x0078, B:35:0x007e, B:89:0x0179, B:91:0x0182, B:93:0x0187, B:95:0x0193, B:96:0x019a, B:97:0x019d, B:99:0x01a1, B:101:0x01a3, B:103:0x01ac, B:105:0x01b3, B:104:0x01b0), top: B:129:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db A[Catch: all -> 0x0214, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:10:0x0016, B:12:0x001c, B:13:0x0025, B:15:0x002c, B:17:0x0032, B:19:0x0038, B:21:0x0048, B:23:0x004e, B:24:0x0051, B:27:0x005d, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:36:0x0084, B:38:0x0088, B:40:0x008a, B:42:0x009b, B:44:0x009f, B:46:0x00ad, B:48:0x00b9, B:51:0x00c4, B:53:0x00c8, B:59:0x00d2, B:61:0x00db, B:63:0x00df, B:65:0x00ef, B:66:0x00f8, B:68:0x0112, B:69:0x0117, B:71:0x0126, B:72:0x013b, B:74:0x0145, B:75:0x014c, B:84:0x0169, B:86:0x016d, B:87:0x0176, B:88:0x0178, B:106:0x01b4, B:108:0x01ce, B:110:0x01d4, B:112:0x01da, B:114:0x01ea, B:116:0x01f4, B:117:0x0208, B:118:0x020f, B:122:0x0213, B:78:0x0152, B:80:0x015b, B:81:0x0161, B:49:0x00c0, B:33:0x0078, B:35:0x007e, B:89:0x0179, B:91:0x0182, B:93:0x0187, B:95:0x0193, B:96:0x019a, B:97:0x019d, B:99:0x01a1, B:101:0x01a3, B:103:0x01ac, B:105:0x01b3, B:104:0x01b0), top: B:129:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[Catch: all -> 0x0214, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:10:0x0016, B:12:0x001c, B:13:0x0025, B:15:0x002c, B:17:0x0032, B:19:0x0038, B:21:0x0048, B:23:0x004e, B:24:0x0051, B:27:0x005d, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:36:0x0084, B:38:0x0088, B:40:0x008a, B:42:0x009b, B:44:0x009f, B:46:0x00ad, B:48:0x00b9, B:51:0x00c4, B:53:0x00c8, B:59:0x00d2, B:61:0x00db, B:63:0x00df, B:65:0x00ef, B:66:0x00f8, B:68:0x0112, B:69:0x0117, B:71:0x0126, B:72:0x013b, B:74:0x0145, B:75:0x014c, B:84:0x0169, B:86:0x016d, B:87:0x0176, B:88:0x0178, B:106:0x01b4, B:108:0x01ce, B:110:0x01d4, B:112:0x01da, B:114:0x01ea, B:116:0x01f4, B:117:0x0208, B:118:0x020f, B:122:0x0213, B:78:0x0152, B:80:0x015b, B:81:0x0161, B:49:0x00c0, B:33:0x0078, B:35:0x007e, B:89:0x0179, B:91:0x0182, B:93:0x0187, B:95:0x0193, B:96:0x019a, B:97:0x019d, B:99:0x01a1, B:101:0x01a3, B:103:0x01ac, B:105:0x01b3, B:104:0x01b0), top: B:129:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:10:0x0016, B:12:0x001c, B:13:0x0025, B:15:0x002c, B:17:0x0032, B:19:0x0038, B:21:0x0048, B:23:0x004e, B:24:0x0051, B:27:0x005d, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:36:0x0084, B:38:0x0088, B:40:0x008a, B:42:0x009b, B:44:0x009f, B:46:0x00ad, B:48:0x00b9, B:51:0x00c4, B:53:0x00c8, B:59:0x00d2, B:61:0x00db, B:63:0x00df, B:65:0x00ef, B:66:0x00f8, B:68:0x0112, B:69:0x0117, B:71:0x0126, B:72:0x013b, B:74:0x0145, B:75:0x014c, B:84:0x0169, B:86:0x016d, B:87:0x0176, B:88:0x0178, B:106:0x01b4, B:108:0x01ce, B:110:0x01d4, B:112:0x01da, B:114:0x01ea, B:116:0x01f4, B:117:0x0208, B:118:0x020f, B:122:0x0213, B:78:0x0152, B:80:0x015b, B:81:0x0161, B:49:0x00c0, B:33:0x0078, B:35:0x007e, B:89:0x0179, B:91:0x0182, B:93:0x0187, B:95:0x0193, B:96:0x019a, B:97:0x019d, B:99:0x01a1, B:101:0x01a3, B:103:0x01ac, B:105:0x01b3, B:104:0x01b0), top: B:129:0x0004, inners: #0, #2 }] */
    @Override // com.google.android.gms.internal.ads.j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aX(abcd.wu r11) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u1.aX(abcd.wu):void");
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void destroy() {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.removeAllViews();
            }
            this.jw = null;
            this.qp = null;
            this.k2 = null;
            this.zh = null;
            this.AL = null;
            this.w9 = null;
            this.hK = null;
            this.fY = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final abcd.wu ik(String str) {
        synchronized (this.WB) {
            View view = null;
            if (this.qp == null) {
                return null;
            }
            WeakReference<View> weakReference = this.qp.get(str);
            if (weakReference != null) {
                view = weakReference.get();
            }
            return abcd.xu.sy(view);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        synchronized (this.WB) {
            if (this.zh == null) {
                return;
            }
            this.zh.XG();
            Bundle bundle = new Bundle();
            bundle.putFloat("x", k6(this.AL.x));
            bundle.putFloat("y", k6(this.AL.y));
            bundle.putFloat("start_x", k6(this.w9.x));
            bundle.putFloat("start_y", k6(this.w9.y));
            if (this.k2 == null || !this.k2.equals(view)) {
                this.zh.oa(view, this.qp, bundle, this.mb);
            } else if (!(this.zh instanceof g1)) {
                this.zh.AR(view, "1007", bundle, this.qp, this.mb, false);
            } else if (((g1) this.zh).gW() != null) {
                ((g1) this.zh).gW().AR(view, "1007", bundle, this.qp, this.mb, false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized (this.WB) {
            if (this.zh != null) {
                this.zh.xg(this.mb, this.qp);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized (this.WB) {
            if (this.zh != null) {
                this.zh.xg(this.mb, this.qp);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.WB) {
            if (this.zh == null) {
                return false;
            }
            this.mb.getLocationOnScreen(new int[2]);
            Point point = new Point((int) (motionEvent.getRawX() - r0[0]), (int) (motionEvent.getRawY() - r0[1]));
            this.AL = point;
            if (motionEvent.getAction() == 0) {
                this.w9 = point;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(point.x, point.y);
            this.zh.Fd(motionEventObtain);
            motionEventObtain.recycle();
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final synchronized Map<String, WeakReference<View>> uD() {
        return this.qp;
    }
}
