package com.google.android.gms.internal.ads;

import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public final class f80 {
    static String j6(i40 i40Var) {
        g80 g80Var = new g80(i40Var);
        StringBuilder sb = new StringBuilder(g80Var.size());
        for (int i = 0; i < g80Var.size(); i++) {
            byte bJ6 = g80Var.j6(i);
            if (bJ6 == 34) {
                sb.append("\\\"");
            } else if (bJ6 == 39) {
                sb.append("\\'");
            } else if (bJ6 != 92) {
                switch (bJ6) {
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bJ6 < 32 || bJ6 > 126) {
                            sb.append('\\');
                            sb.append((char) (((bJ6 >>> 6) & 3) + 48));
                            sb.append((char) (((bJ6 >>> 3) & 7) + 48));
                            sb.append((char) ((bJ6 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bJ6);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
