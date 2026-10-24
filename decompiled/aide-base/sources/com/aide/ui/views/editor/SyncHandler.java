package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Handler;

@cy(clazz = -1571460219253971400L, container = -1571460219253971400L, user = true)
/* loaded from: classes.dex */
public abstract class SyncHandler implements Runnable {

    @fy
    private static /* synthetic */ boolean fY;

    @gy
    private static /* synthetic */ boolean qp;

    @dy(field = 3537216238390021900L)
    private boolean WB;

    @dy(field = 1673673698298780416L)
    private long jw;

    @dy(field = -1757180693260834345L)
    private Handler mb;

    static {
        iy.Zo(SyncHandler.class);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = 2416047720527288484L)
    public SyncHandler() {
        this(0L);
        try {
            if (fY) {
                iy.gn(-4801445650845441675L, null);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -4801445650845441675L, null);
            }
            throw th;
        }
    }

    @ey(method = -5139066872762628555L)
    public synchronized void DW() {
        try {
            if (fY) {
                iy.gn(-3700683644491600431L, this);
            }
            if (this.WB) {
                return;
            }
            this.WB = true;
            if (this.jw == 0) {
                this.mb.post(this);
            } else {
                this.mb.postDelayed(this, this.jw);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -3700683644491600431L, this);
            }
            throw th;
        }
    }

    @ey(method = 639917171726453532L)
    public abstract void FH();

    @ey(method = -215223178228075339L)
    public synchronized boolean j6() {
        try {
            if (fY) {
                iy.gn(201566105637348565L, this);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 201566105637348565L, this);
            }
            throw th;
        }
        return this.WB;
    }

    @Override // java.lang.Runnable
    @ey(method = -2286289140470208685L)
    public void run() {
        try {
            if (fY) {
                iy.gn(-1777009534518923305L, this);
            }
            synchronized (this) {
                this.WB = false;
            }
            FH();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -1777009534518923305L, this);
            }
            throw th;
        }
    }

    @ey(method = -177871807687114011L)
    public SyncHandler(long j) {
        try {
            if (fY) {
                iy.tp(5937304788005794736L, null, new Long(j));
            }
            this.mb = new Handler();
            this.jw = j;
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 5937304788005794736L, null, new Long(j));
            }
            throw th;
        }
    }
}
