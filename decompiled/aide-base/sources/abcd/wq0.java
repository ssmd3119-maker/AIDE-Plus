package abcd;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class wq0 extends SimpleDateFormat {
    public wq0() {
        super("yyy-MM-dd'T'HH:mm:ss'Z'");
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
