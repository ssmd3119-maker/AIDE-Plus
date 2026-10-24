package android.support.v4.media.session;

import android.media.session.MediaSession;

/* loaded from: classes.dex */
public class d {

    static class a {
        public static long DW(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }

        public static Object j6(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }
    }

    public static Object j6(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
