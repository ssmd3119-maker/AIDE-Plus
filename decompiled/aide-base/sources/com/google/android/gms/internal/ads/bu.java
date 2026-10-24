package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class bu implements com.google.android.gms.ads.internal.gmsg.b0<ss> {
    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(ss ssVar, Map map) throws NumberFormatException {
        ss ssVar2 = ssVar;
        sv svVarCU = ssVar2.CU();
        if (svVarCU == null) {
            try {
                sv svVar = new sv(ssVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                ssVar2.Ev(svVar);
                svVarCU = svVar;
            } catch (NullPointerException | NumberFormatException e) {
                xp.Hw("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.w0.u7().v5(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        int i2 = (i < 0 || 3 < i) ? 0 : i;
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (xp.DW(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f2);
            sb.append(" , duration : ");
            sb.append(f);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i2);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            xp.VH(sb.toString());
        }
        svVarCU.k6(f2, f, i2, zEquals, f3);
    }
}
