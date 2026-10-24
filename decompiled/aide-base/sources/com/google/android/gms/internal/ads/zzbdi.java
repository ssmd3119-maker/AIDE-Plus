package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@jg
@TargetApi(14)
/* loaded from: classes.dex */
public abstract class zzbdi extends TextureView implements xs {
    protected final ms WB;
    protected final ws mb;

    public zzbdi(Context context) {
        super(context);
        this.WB = new ms();
        this.mb = new ws(context, this);
    }

    public abstract void EQ(cs csVar);

    public abstract void Hw();

    public void J0(int i) {
    }

    public void J8(int i) {
    }

    public void QX(int i) {
    }

    public void Ws(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void gn(int i);

    public abstract void j6();

    public abstract void setVideoPath(String str);

    public abstract void tp(float f, float f2);

    public abstract void u7();

    public abstract void v5();

    public abstract String we();
}
