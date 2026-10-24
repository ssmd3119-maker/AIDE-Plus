package abcd;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes.dex */
public class uk0 extends uh0 implements lh0 {
    ai0 WB;

    public uk0(Date date) throws NumberFormatException {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = String.valueOf(simpleDateFormat.format(date)) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i < 1950 || i > 2049) {
            this.WB = new ej0(str);
        } else {
            this.WB = new uj0(str.substring(2));
        }
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB;
    }
}
