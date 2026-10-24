package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@jg
@TargetApi(14)
/* loaded from: classes.dex */
public final class rr extends zzbdi implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> Jl = new HashMap();
    private Uri AL;
    private int Q6;
    private zzbdx Z1;
    private int cT;
    private final boolean fY;
    private int hK;
    private final us jw;
    private int k2;
    private cs kf;
    private boolean n5;
    private int q7;
    private int qp;
    private int w9;
    private MediaPlayer zh;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            Jl.put(-1004, "MEDIA_ERROR_IO");
            Jl.put(-1007, "MEDIA_ERROR_MALFORMED");
            Jl.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            Jl.put(-110, "MEDIA_ERROR_TIMED_OUT");
            Jl.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        Jl.put(100, "MEDIA_ERROR_SERVER_DIED");
        Jl.put(1, "MEDIA_ERROR_UNKNOWN");
        Jl.put(1, "MEDIA_INFO_UNKNOWN");
        Jl.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        Jl.put(701, "MEDIA_INFO_BUFFERING_START");
        Jl.put(702, "MEDIA_INFO_BUFFERING_END");
        Jl.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        Jl.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        Jl.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            Jl.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            Jl.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public rr(Context context, boolean z, boolean z2, rs rsVar, us usVar) {
        super(context);
        this.qp = 0;
        this.k2 = 0;
        setSurfaceTextureListener(this);
        this.jw = usVar;
        this.n5 = z;
        this.fY = z2;
        usVar.Hw(this);
    }

    private final boolean Mr() {
        int i;
        return (this.zh == null || (i = this.qp) == -1 || i == 0 || i == 1) ? false : true;
    }

    private final void U2(boolean z) {
        sm.we("AdMediaPlayerView release");
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.VH();
            this.Z1 = null;
        }
        MediaPlayer mediaPlayer = this.zh;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zh.release();
            this.zh = null;
            a8(0);
            if (z) {
                this.k2 = 0;
                this.k2 = 0;
            }
        }
    }

    private final void a8(int i) {
        if (i == 3) {
            this.jw.DW();
            this.mb.Hw();
        } else if (this.qp == 3) {
            this.jw.FH();
            this.mb.v5();
        }
        this.qp = i;
    }

    private final void aM() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        sm.we("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.AL == null || surfaceTexture == null) {
            return;
        }
        U2(false);
        try {
            com.google.android.gms.ads.internal.w0.lg();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zh = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zh.setOnCompletionListener(this);
            this.zh.setOnErrorListener(this);
            this.zh.setOnInfoListener(this);
            this.zh.setOnPreparedListener(this);
            this.zh.setOnVideoSizeChangedListener(this);
            if (this.n5) {
                zzbdx zzbdxVar = new zzbdx(getContext());
                this.Z1 = zzbdxVar;
                zzbdxVar.DW(surfaceTexture, getWidth(), getHeight());
                this.Z1.start();
                SurfaceTexture surfaceTextureGn = this.Z1.gn();
                if (surfaceTextureGn != null) {
                    surfaceTexture = surfaceTextureGn;
                } else {
                    this.Z1.VH();
                    this.Z1 = null;
                }
            }
            this.zh.setDataSource(getContext(), this.AL);
            com.google.android.gms.ads.internal.w0.rN();
            this.zh.setSurface(new Surface(surfaceTexture));
            this.zh.setAudioStreamType(3);
            this.zh.setScreenOnWhilePlaying(true);
            this.zh.prepareAsync();
            a8(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String strValueOf = String.valueOf(this.AL);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(strValueOf);
            xp.v5(sb.toString(), e);
            onError(this.zh, 1, 0);
        }
    }

    private final void j3() throws IllegalStateException {
        if (this.fY && Mr() && this.zh.getCurrentPosition() > 0 && this.k2 != 3) {
            sm.we("AdMediaPlayerView nudging MediaPlayer");
            rN(0.0f);
            this.zh.start();
            int currentPosition = this.zh.getCurrentPosition();
            long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
            while (Mr() && this.zh.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.w0.we().j6() - jJ6 <= 250) {
            }
            this.zh.pause();
            j6();
        }
    }

    private final void rN(float f) {
        MediaPlayer mediaPlayer = this.zh;
        if (mediaPlayer == null) {
            xp.u7("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void EQ(cs csVar) {
        this.kf = csVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void Hw() throws IllegalStateException {
        sm.we("AdMediaPlayerView pause");
        if (Mr() && this.zh.isPlaying()) {
            this.zh.pause();
            a8(4);
            bn.gn.post(new bs(this));
        }
        this.k2 = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getCurrentPosition() {
        if (Mr()) {
            return this.zh.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getDuration() {
        if (Mr()) {
            return this.zh.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zh;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zh;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void gn(int i) throws IllegalStateException {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        sm.we(sb.toString());
        if (!Mr()) {
            this.Q6 = i;
        } else {
            this.zh.seekTo(i);
            this.Q6 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi, com.google.android.gms.internal.ads.xs
    public final void j6() {
        rN(this.mb.j6());
    }

    final /* synthetic */ void lg(int i) {
        cs csVar = this.kf;
        if (csVar != null) {
            csVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        sm.we("AdMediaPlayerView completion");
        a8(5);
        this.k2 = 5;
        bn.gn.post(new vr(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = Jl.get(Integer.valueOf(i));
        String str2 = Jl.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        xp.u7(sb.toString());
        a8(-1);
        this.k2 = -1;
        bn.gn.post(new wr(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = Jl.get(Integer.valueOf(i));
        String str2 = Jl.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sm.we(sb.toString());
        return true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) throws IllegalStateException {
        int i3;
        int defaultSize = TextureView.getDefaultSize(this.w9, i);
        int defaultSize2 = TextureView.getDefaultSize(this.hK, i2);
        if (this.w9 > 0 && this.hK > 0 && this.Z1 == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.w9;
                int i5 = i4 * size2;
                int i6 = this.hK;
                if (i5 < size * i6) {
                    defaultSize = (i4 * size2) / i6;
                    defaultSize2 = size2;
                } else {
                    if (i4 * size2 > size * i6) {
                        defaultSize2 = (i6 * size) / i4;
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i7 = (this.hK * size) / this.w9;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i8 = (this.w9 * size2) / this.hK;
                defaultSize = (mode != Integer.MIN_VALUE || i8 <= size) ? i8 : size;
                defaultSize2 = size2;
            } else {
                int i9 = this.w9;
                int i10 = this.hK;
                if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                    defaultSize2 = i10;
                } else {
                    i9 = (i9 * size2) / i10;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i9 <= size) {
                    defaultSize = i9;
                } else {
                    defaultSize2 = (this.hK * size) / this.w9;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.J8(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i11 = this.cT;
            if ((i11 > 0 && i11 != defaultSize) || ((i3 = this.q7) > 0 && i3 != defaultSize2)) {
                j3();
            }
            this.cT = defaultSize;
            this.q7 = defaultSize2;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        sm.we("AdMediaPlayerView prepared");
        a8(2);
        this.jw.Zo();
        bn.gn.post(new tr(this));
        this.w9 = mediaPlayer.getVideoWidth();
        this.hK = mediaPlayer.getVideoHeight();
        int i = this.Q6;
        if (i != 0) {
            gn(i);
        }
        j3();
        int i2 = this.w9;
        int i3 = this.hK;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        xp.gn(sb.toString());
        if (this.k2 == 3) {
            v5();
        }
        j6();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        sm.we("AdMediaPlayerView surface created");
        aM();
        bn.gn.post(new xr(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sm.we("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zh;
        if (mediaPlayer != null && this.Q6 == 0) {
            this.Q6 = mediaPlayer.getCurrentPosition();
        }
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.VH();
        }
        bn.gn.post(new zr(this));
        U2(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException {
        sm.we("AdMediaPlayerView surface changed");
        boolean z = this.k2 == 3;
        boolean z2 = this.w9 == i && this.hK == i2;
        if (this.zh != null && z && z2) {
            int i3 = this.Q6;
            if (i3 != 0) {
                gn(i3);
            }
            v5();
        }
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.J8(i, i2);
        }
        bn.gn.post(new yr(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.jw.v5(this);
        this.WB.j6(surfaceTexture, this.kf);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        sm.we(sb.toString());
        this.w9 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.hK = videoHeight;
        if (this.w9 == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        sm.we(sb.toString());
        bn.gn.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.sr
            private final rr WB;
            private final int mb;

            {
                this.WB = this;
                this.mb = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.lg(this.mb);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void setVideoPath(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        zzty zztyVarEQ = zzty.EQ(uri);
        if (zztyVarEQ != null) {
            uri = Uri.parse(zztyVarEQ.WB);
        }
        this.AL = uri;
        this.Q6 = 0;
        aM();
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final String toString() {
        String name = rr.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void tp(float f, float f2) {
        zzbdx zzbdxVar = this.Z1;
        if (zzbdxVar != null) {
            zzbdxVar.tp(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void u7() throws IllegalStateException {
        sm.we("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zh;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zh.release();
            this.zh = null;
            a8(0);
            this.k2 = 0;
        }
        this.jw.j6();
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void v5() throws IllegalStateException {
        sm.we("AdMediaPlayerView play");
        if (Mr()) {
            this.zh.start();
            a8(3);
            this.WB.DW();
            bn.gn.post(new as(this));
        }
        this.k2 = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final String we() {
        String str = this.n5 ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }
}
