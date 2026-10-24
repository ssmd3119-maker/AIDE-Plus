package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

/* loaded from: classes.dex */
public class PostMessageService extends Service {
    private IPostMessageService.Sub WB = new a(this);

    class a extends IPostMessageService.Sub {
        a(PostMessageService postMessageService) {
        }

        @Override // android.support.customtabs.IPostMessageService
        public void HF(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            iCustomTabsCallback.vv(str, bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        public void kG(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            iCustomTabsCallback.eo(bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.WB;
    }
}
