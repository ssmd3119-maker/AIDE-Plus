package abcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes.dex */
public class bm0 extends uh0 implements lh0 {
    ai0 WB;

    public bm0(ai0 ai0Var) {
        if (!(ai0Var instanceof uj0) && !(ai0Var instanceof ej0)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.WB = ai0Var;
    }

    public static bm0 gn(Object obj) {
        if (obj == null || (obj instanceof bm0)) {
            return (bm0) obj;
        }
        if (obj instanceof uj0) {
            return new bm0((uj0) obj);
        }
        if (obj instanceof ej0) {
            return new bm0((ej0) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB;
    }

    public Date VH() {
        try {
            return this.WB instanceof uj0 ? ((uj0) this.WB).J8() : ((ej0) this.WB).QX();
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    public String toString() {
        return u7();
    }

    public String u7() {
        ai0 ai0Var = this.WB;
        return ai0Var instanceof uj0 ? ((uj0) ai0Var).Ws() : ((ej0) ai0Var).XL();
    }

    public bm0(Date date) throws NumberFormatException {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = String.valueOf(simpleDateFormat.format(date)) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i >= 1950 && i <= 2049) {
            this.WB = new uj0(str.substring(2));
        } else {
            this.WB = new ej0(str);
        }
    }
}
