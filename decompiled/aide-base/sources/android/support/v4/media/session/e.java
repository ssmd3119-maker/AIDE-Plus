package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    static final class a {
        public static Bundle DW(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        public static int FH(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        public static CharSequence Hw(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        public static String j6(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }
    }

    public static long DW(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    public static long FH(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static List<Object> Hw(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    public static float VH(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static long Zo(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static long gn(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    public static long j6(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static int u7(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static CharSequence v5(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }
}
