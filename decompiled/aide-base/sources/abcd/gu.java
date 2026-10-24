package abcd;

import java.util.Locale;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

/* loaded from: classes.dex */
public interface gu {

    public enum a {
        DROPBOX("dropbox"),
        APP_FOLDER("sandbox"),
        AUTO("auto");

        private final String WB;

        a(String str) {
            this.WB = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.WB;
        }
    }

    public static final class b {
        public final int DW;
        public final String j6;
    }

    b DW();

    boolean FH();

    HttpClient Hw();

    String VH();

    a Zo();

    void gn(HttpRequest httpRequest);

    void j6(HttpUriRequest httpUriRequest);

    Locale u7();

    String v5();
}
