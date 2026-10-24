package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    public interface a {
        void DW(int i, int i2, int i3, int i4, int i5);

        void Eq(Bundle bundle);

        void FH(Object obj);

        void Hw(String str, Bundle bundle);

        void Z1();

        void j6(Object obj);

        void jO(List<?> list);

        void q7(CharSequence charSequence);
    }

    static class b<T extends a> extends MediaController.Callback {
        protected final T j6;

        public b(T t) {
            this.j6 = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.j6.DW(playbackInfo.getPlaybackType(), C0025c.DW(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            this.j6.Eq(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.j6.j6(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.j6.FH(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.j6.jO(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.j6.q7(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.j6.Z1();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            this.j6.Hw(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c, reason: collision with other inner class name */
    public static class C0025c {
        public static int DW(Object obj) {
            return FH(j6(obj));
        }

        private static int FH(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                case 9:
                case 10:
                    return 5;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    return 2;
                default:
                    return 3;
            }
        }

        public static AudioAttributes j6(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }
    }

    public static boolean DW(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    public static Object FH(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    public static void Hw(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    public static Object j6(a aVar) {
        return new b(aVar);
    }
}
