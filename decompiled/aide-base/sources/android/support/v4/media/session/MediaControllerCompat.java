package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.c;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    private final MediaSessionCompat.Token DW;
    private final b j6;

    static class MediaControllerImplApi21 implements b {
        private IMediaSession FH;
        protected final Object j6;
        private final List<a> DW = new ArrayList();
        private HashMap<a, a> Hw = new HashMap<>();

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> WB;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21, Handler handler) {
                super(handler);
                this.WB = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.WB.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                mediaControllerImplApi21.FH = IMediaSession.Sub.asInterface(g.j6(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                mediaControllerImplApi21.Hw();
            }
        }

        private static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.IMediaControllerCallback
            public void Eq(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.IMediaControllerCallback
            public void OZ(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.IMediaControllerCallback
            public void Z1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.IMediaControllerCallback
            public void jO(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.IMediaControllerCallback
            public void q7(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.IMediaControllerCallback
            public void xS(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            Object objFH = android.support.v4.media.session.c.FH(context, token.Hw());
            this.j6 = objFH;
            if (objFH == null) {
                throw new RemoteException();
            }
            IMediaSession iMediaSessionFH = token.FH();
            this.FH = iMediaSessionFH;
            if (iMediaSessionFH == null) {
                v5();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hw() {
            if (this.FH == null) {
                return;
            }
            synchronized (this.DW) {
                for (a aVar : this.DW) {
                    a aVar2 = new a(aVar);
                    this.Hw.put(aVar, aVar2);
                    aVar.FH = true;
                    try {
                        this.FH.eN(aVar2);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.DW.clear();
            }
        }

        private void v5() {
            Zo("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this, new Handler()));
        }

        public void Zo(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.c.Hw(this.j6, str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean j6(KeyEvent keyEvent) {
            return android.support.v4.media.session.c.DW(this.j6, keyEvent);
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {
        HandlerC0024a DW;
        boolean FH;
        private final Object j6;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        private class HandlerC0024a extends Handler {
        }

        private static class b implements c.a {
            private final WeakReference<a> j6;

            b(a aVar) {
                this.j6 = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void DW(int i, int i2, int i3, int i4, int i5) {
                a aVar = this.j6.get();
                if (aVar != null) {
                    aVar.j6(new f(i, i2, i3, i4, i5));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void Eq(Bundle bundle) {
                a aVar = this.j6.get();
                if (aVar != null) {
                    aVar.DW(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void FH(Object obj) {
                a aVar = this.j6.get();
                if (aVar == null || aVar.FH) {
                    return;
                }
                aVar.Hw(PlaybackStateCompat.j6(obj));
            }

            @Override // android.support.v4.media.session.c.a
            public void Hw(String str, Bundle bundle) {
                a aVar = this.j6.get();
                if (aVar != null) {
                    if (!aVar.FH || Build.VERSION.SDK_INT >= 23) {
                        aVar.gn(str, bundle);
                    }
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void Z1() {
                a aVar = this.j6.get();
                if (aVar != null) {
                    aVar.VH();
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void j6(Object obj) {
                a aVar = this.j6.get();
                if (aVar != null) {
                    aVar.FH(MediaMetadataCompat.j6(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void jO(List<?> list) {
                a aVar = this.j6.get();
                if (aVar != null) {
                    aVar.v5(MediaSessionCompat.QueueItem.DW(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void q7(CharSequence charSequence) {
                a aVar = this.j6.get();
                if (aVar != null) {
                    aVar.Zo(charSequence);
                }
            }
        }

        private static class c extends IMediaControllerCallback.Sub {
            private final WeakReference<a> WB;

            c(a aVar) {
                this.WB = new WeakReference<>(aVar);
            }

            public void Eq(Bundle bundle) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void NG(int i) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(12, Integer.valueOf(i), null);
                }
            }

            public void OZ(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(3, mediaMetadataCompat, null);
                }
            }

            public void Z1() {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(8, null, null);
                }
            }

            public void jO(List<MediaSessionCompat.QueueItem> list) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void ji(boolean z) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(10, Boolean.valueOf(z), null);
                }
            }

            public void q7(CharSequence charSequence) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void s3(boolean z) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void ub(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void wR(String str, Bundle bundle) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(1, str, bundle);
                }
            }

            public void xS(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(4, parcelableVolumeInfo != null ? new f(parcelableVolumeInfo.WB, parcelableVolumeInfo.mb, parcelableVolumeInfo.jw, parcelableVolumeInfo.fY, parcelableVolumeInfo.qp) : null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void yG(int i) {
                a aVar = this.WB.get();
                if (aVar != null) {
                    aVar.u7(9, Integer.valueOf(i), null);
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.j6 = android.support.v4.media.session.c.j6(new b(this));
            } else {
                new c(this);
            }
        }

        public void DW(Bundle bundle) {
        }

        public void FH(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void Hw(PlaybackStateCompat playbackStateCompat) {
        }

        public void VH() {
        }

        public void Zo(CharSequence charSequence) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            VH();
        }

        public void gn(String str, Bundle bundle) {
        }

        public void j6(f fVar) {
        }

        void u7(int i, Object obj, Bundle bundle) {
            HandlerC0024a handlerC0024a = this.DW;
            if (handlerC0024a != null) {
                Message messageObtainMessage = handlerC0024a.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        public void v5(List<MediaSessionCompat.QueueItem> list) {
        }
    }

    interface b {
        boolean j6(KeyEvent keyEvent);
    }

    static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    static class d extends c {
        public d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    static class e implements b {
        private IMediaSession j6;

        public e(MediaSessionCompat.Token token) {
            this.j6 = IMediaSession.Sub.asInterface((IBinder) token.Hw());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean j6(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.j6.aW(keyEvent);
                return false;
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                return false;
            }
        }
    }

    public static final class f {
        f(int i, int i2, int i3, int i4, int i5) {
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        new HashSet();
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.DW = token;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            this.j6 = new d(context, token);
            return;
        }
        if (i >= 23) {
            this.j6 = new c(context, token);
        } else if (i >= 21) {
            this.j6 = new MediaControllerImplApi21(context, token);
        } else {
            this.j6 = new e(token);
        }
    }

    public boolean j6(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.j6.j6(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
