package abcd;

import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class cr {
    public static bq j6(fr frVar) {
        switch (frVar.u7()) {
            case 1:
                return gq.mb;
            case 2:
                return hq.mb;
            case 3:
                return iq.mb;
            case 4:
                return jq.mb;
            case 5:
                return mq.mb;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return nq.fY;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return tq.mb;
            case 8:
                return xq.mb;
            case 9:
                return pq.WB;
            default:
                throw new UnsupportedOperationException("no zero for type: " + frVar.Zo());
        }
    }
}
