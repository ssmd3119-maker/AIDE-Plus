package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class fu implements com.google.android.gms.common.api.i {
    protected Context WB;
    protected WeakReference<ss> jw;
    protected String mb;

    public fu(ss ssVar) {
        this.WB = ssVar.getContext();
        this.mb = com.google.android.gms.ads.internal.w0.v5().Eq(this.WB, ssVar.sy().WB);
        this.jw = new WeakReference<>(ssVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J8(String str, Map<String, String> map) {
        ss ssVar = this.jw.get();
        if (ssVar != null) {
            ssVar.v5(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String lg(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1947652542: goto L7d;
                case -1396664534: goto L72;
                case -1347010958: goto L68;
                case -918817863: goto L5d;
                case -659376217: goto L53;
                case -642208130: goto L49;
                case -354048396: goto L3e;
                case -32082395: goto L33;
                case 3387234: goto L29;
                case 96784904: goto L1f;
                case 580119100: goto L14;
                case 725497484: goto L9;
                default: goto L7;
            }
        L7:
            goto L87
        L9:
            java.lang.String r0 = "noCacheDir"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 7
            goto L88
        L14:
            java.lang.String r0 = "expireFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 6
            goto L88
        L1f:
            java.lang.String r0 = "error"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 1
            goto L88
        L29:
            java.lang.String r0 = "noop"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 4
            goto L88
        L33:
            java.lang.String r0 = "externalAbort"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 10
            goto L88
        L3e:
            java.lang.String r0 = "sizeExceeded"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 11
            goto L88
        L49:
            java.lang.String r0 = "playerFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 5
            goto L88
        L53:
            java.lang.String r0 = "contentLengthMissing"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 0
            goto L88
        L5d:
            java.lang.String r0 = "downloadTimeout"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 9
            goto L88
        L68:
            java.lang.String r0 = "inProgress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 2
            goto L88
        L72:
            java.lang.String r0 = "badUrl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 8
            goto L88
        L7d:
            java.lang.String r0 = "interrupted"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L87
            r1 = 3
            goto L88
        L87:
            r1 = -1
        L88:
            java.lang.String r0 = "internal"
            switch(r1) {
                case 0: goto L96;
                case 1: goto L96;
                case 2: goto L96;
                case 3: goto L96;
                case 4: goto L96;
                case 5: goto L96;
                case 6: goto L94;
                case 7: goto L94;
                case 8: goto L91;
                case 9: goto L91;
                case 10: goto L8e;
                case 11: goto L8e;
                default: goto L8d;
            }
        L8d:
            goto L96
        L8e:
            java.lang.String r0 = "policy"
            goto L96
        L91:
            java.lang.String r0 = "network"
            goto L96
        L94:
            java.lang.String r0 = "io"
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fu.lg(java.lang.String):java.lang.String");
    }

    protected final void EQ(String str, String str2, int i) {
        mp.j6.post(new iu(this, str, str2, i));
    }

    public final void J0(String str, String str2, String str3, String str4) {
        mp.j6.post(new ku(this, str, str2, str3, str4));
    }

    protected void Mr(int i) {
    }

    protected void QX(int i) {
    }

    public abstract boolean U2(String str);

    public final void Ws(String str, String str2, long j) {
        mp.j6.post(new ju(this, str, str2, j));
    }

    protected String a8(String str) {
        cw0.j6();
        return mp.lg(str);
    }

    protected void aM(int i) {
    }

    public abstract void gn();

    protected void j3(int i) {
    }

    @Override // com.google.android.gms.common.api.i
    public void j6() {
    }

    public final void we(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        mp.j6.post(new hu(this, str, str2, j, j2, z, i, i2));
    }
}
