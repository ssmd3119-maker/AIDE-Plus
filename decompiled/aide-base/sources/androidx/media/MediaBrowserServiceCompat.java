package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.support.v4.media.f;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.util.Pair;
import com.probelytics.api.UserTouchAction;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean qp = Log.isLoggable("MBServiceCompat", 3);
    private g WB;
    MediaSessionCompat.Token fY;
    final ArrayMap<IBinder, ConnectionRecord> mb = new ArrayMap<>();
    final p jw = new p();

    private static class ConnectionRecord {
        Bundle DW;
        n FH;
        e Hw;
        String j6;
        HashMap<String, List<Pair<IBinder, Bundle>>> v5 = new HashMap<>();

        ConnectionRecord() {
        }
    }

    class a extends l<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ String VH;
        final /* synthetic */ ConnectionRecord Zo;
        final /* synthetic */ Bundle gn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, ConnectionRecord connectionRecord, String str, Bundle bundle) {
            super(obj);
            this.Zo = connectionRecord;
            this.VH = str;
            this.gn = bundle;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* renamed from: gn, reason: merged with bridge method [inline-methods] */
        public void Hw(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.mb.get(this.Zo.FH.asBinder()) != this.Zo) {
                if (MediaBrowserServiceCompat.qp) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.Zo.j6 + " id=" + this.VH);
                    return;
                }
                return;
            }
            if ((j6() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.DW(list, this.gn);
            }
            try {
                this.Zo.FH.j6(this.VH, list, this.gn);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.VH + " package=" + this.Zo.j6);
            }
        }
    }

    class b extends l<MediaBrowserCompat.MediaItem> {
        final /* synthetic */ ResultReceiver Zo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.Zo = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* renamed from: gn, reason: merged with bridge method [inline-methods] */
        public void Hw(MediaBrowserCompat.MediaItem mediaItem) {
            if ((j6() & 2) != 0) {
                this.Zo.DW(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.Zo.DW(0, bundle);
        }
    }

    class c extends l<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ ResultReceiver Zo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.Zo = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* renamed from: gn, reason: merged with bridge method [inline-methods] */
        public void Hw(List<MediaBrowserCompat.MediaItem> list) {
            if ((j6() & 4) != 0 || list == null) {
                this.Zo.DW(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.Zo.DW(0, bundle);
        }
    }

    class d extends l<Bundle> {
        final /* synthetic */ ResultReceiver Zo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.Zo = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.l
        void FH(Bundle bundle) {
            this.Zo.DW(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* renamed from: gn, reason: merged with bridge method [inline-methods] */
        public void Hw(Bundle bundle) {
            this.Zo.DW(0, bundle);
        }
    }

    public static final class e {
        public String DW() {
            throw null;
        }

        public Bundle j6() {
            throw null;
        }
    }

    interface g {
        IBinder FH(Intent intent);

        void j6();
    }

    class h implements g, d.InterfaceC0023d {
        Object DW;
        Messenger FH;
        final List<Bundle> j6 = new ArrayList();

        class a extends l<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ d.c Zo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, Object obj, d.c cVar) {
                super(obj);
                this.Zo = cVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.l
            /* renamed from: gn, reason: merged with bridge method [inline-methods] */
            public void Hw(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.Zo.DW(arrayList);
            }
        }

        h() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder FH(Intent intent) {
            return android.support.v4.media.d.DW(this.DW, intent);
        }

        @Override // android.support.v4.media.d.InterfaceC0023d
        public d.a Zo(String str, int i, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Bundle bundle2;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.FH = new Messenger(MediaBrowserServiceCompat.this.jw);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 1);
                androidx.core.app.g.DW(bundle2, "extra_messenger", this.FH.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.fY;
                if (token != null) {
                    IMediaSession iMediaSessionFH = token.FH();
                    androidx.core.app.g.DW(bundle2, "extra_session_binder", iMediaSessionFH == null ? null : iMediaSessionFH.asBinder());
                } else {
                    this.j6.add(bundle2);
                }
            }
            e eVarV5 = MediaBrowserServiceCompat.this.v5(str, i, bundle);
            if (eVarV5 == null) {
                return null;
            }
            if (bundle2 == null) {
                eVarV5.j6();
                throw null;
            }
            eVarV5.j6();
            throw null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void j6() {
            Object objJ6 = android.support.v4.media.d.j6(MediaBrowserServiceCompat.this, this);
            this.DW = objJ6;
            android.support.v4.media.d.FH(objJ6);
        }

        @Override // android.support.v4.media.d.InterfaceC0023d
        public void v5(String str, d.c<List<Parcel>> cVar) {
            MediaBrowserServiceCompat.this.Zo(str, new a(this, str, cVar));
        }
    }

    class i extends h implements e.b {

        class a extends l<MediaBrowserCompat.MediaItem> {
            final /* synthetic */ d.c Zo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, Object obj, d.c cVar) {
                super(obj);
                this.Zo = cVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.l
            /* renamed from: gn, reason: merged with bridge method [inline-methods] */
            public void Hw(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.Zo.DW(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                this.Zo.DW(parcelObtain);
            }
        }

        i() {
            super();
        }

        @Override // android.support.v4.media.e.b
        public void DW(String str, d.c<Parcel> cVar) {
            MediaBrowserServiceCompat.this.gn(str, new a(this, str, cVar));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public void j6() {
            Object objJ6 = android.support.v4.media.e.j6(MediaBrowserServiceCompat.this, this);
            this.DW = objJ6;
            android.support.v4.media.d.FH(objJ6);
        }
    }

    class j extends i implements f.c {

        class a extends l<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ f.b Zo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, Object obj, f.b bVar) {
                super(obj);
                this.Zo = bVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.l
            /* renamed from: gn, reason: merged with bridge method [inline-methods] */
            public void Hw(List<MediaBrowserCompat.MediaItem> list) throws IllegalAccessException, IllegalArgumentException {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.Zo.DW(arrayList, j6());
            }
        }

        j() {
            super();
        }

        @Override // android.support.v4.media.f.c
        public void Hw(String str, f.b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.VH(str, new a(this, str, bVar), bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.i, androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public void j6() {
            Object objDW = f.DW(MediaBrowserServiceCompat.this, this);
            this.DW = objDW;
            android.support.v4.media.d.FH(objDW);
        }
    }

    class k implements g {
        private Messenger j6;

        k() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder FH(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.j6.getBinder();
            }
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void j6() {
            this.j6 = new Messenger(MediaBrowserServiceCompat.this.jw);
        }
    }

    public static class l<T> {
        private boolean DW;
        private boolean FH;
        private boolean Hw;
        private final Object j6;
        private int v5;

        l(Object obj) {
            this.j6 = obj;
        }

        boolean DW() {
            return this.DW || this.FH || this.Hw;
        }

        void FH(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.j6);
        }

        void Hw(T t) {
            throw null;
        }

        void VH(int i) {
            this.v5 = i;
        }

        public void Zo(T t) {
            if (!this.FH && !this.Hw) {
                this.FH = true;
                Hw(t);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.j6);
            }
        }

        int j6() {
            return this.v5;
        }

        public void v5(Bundle bundle) {
            if (!this.FH && !this.Hw) {
                this.Hw = true;
                FH(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.j6);
            }
        }
    }

    private class m {

        class a implements Runnable {
            final /* synthetic */ n WB;
            final /* synthetic */ int fY;
            final /* synthetic */ Bundle jw;
            final /* synthetic */ String mb;

            a(n nVar, String str, Bundle bundle, int i) {
                this.WB = nVar;
                this.mb = str;
                this.jw = bundle;
                this.fY = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.WB.asBinder();
                MediaBrowserServiceCompat.this.mb.remove(iBinderAsBinder);
                ConnectionRecord connectionRecord = new ConnectionRecord();
                String str = this.mb;
                connectionRecord.j6 = str;
                Bundle bundle = this.jw;
                connectionRecord.DW = bundle;
                connectionRecord.FH = this.WB;
                e eVarV5 = MediaBrowserServiceCompat.this.v5(str, this.fY, bundle);
                connectionRecord.Hw = eVarV5;
                if (eVarV5 != null) {
                    try {
                        MediaBrowserServiceCompat.this.mb.put(iBinderAsBinder, connectionRecord);
                        if (MediaBrowserServiceCompat.this.fY == null) {
                            return;
                        }
                        connectionRecord.Hw.DW();
                        throw null;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.mb);
                        MediaBrowserServiceCompat.this.mb.remove(iBinderAsBinder);
                        return;
                    }
                }
                Log.i("MBServiceCompat", "No root for client " + this.mb + " from service " + a.class.getName());
                try {
                    this.WB.DW();
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.mb);
                }
            }
        }

        class b implements Runnable {
            final /* synthetic */ n WB;

            b(n nVar) {
                this.WB = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserServiceCompat.this.mb.remove(this.WB.asBinder());
            }
        }

        class c implements Runnable {
            final /* synthetic */ n WB;
            final /* synthetic */ Bundle fY;
            final /* synthetic */ IBinder jw;
            final /* synthetic */ String mb;

            c(n nVar, String str, IBinder iBinder, Bundle bundle) {
                this.WB = nVar;
                this.mb = str;
                this.jw = iBinder;
                this.fY = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mb.get(this.WB.asBinder());
                if (connectionRecord != null) {
                    MediaBrowserServiceCompat.this.j6(this.mb, connectionRecord, this.jw, this.fY);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.mb);
            }
        }

        class d implements Runnable {
            final /* synthetic */ n WB;
            final /* synthetic */ IBinder jw;
            final /* synthetic */ String mb;

            d(n nVar, String str, IBinder iBinder) {
                this.WB = nVar;
                this.mb = str;
                this.jw = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mb.get(this.WB.asBinder());
                if (connectionRecord == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.mb);
                    return;
                }
                if (MediaBrowserServiceCompat.this.J8(this.mb, connectionRecord, this.jw)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.mb + " which is not subscribed");
            }
        }

        class e implements Runnable {
            final /* synthetic */ n WB;
            final /* synthetic */ ResultReceiver jw;
            final /* synthetic */ String mb;

            e(n nVar, String str, ResultReceiver resultReceiver) {
                this.WB = nVar;
                this.mb = str;
                this.jw = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mb.get(this.WB.asBinder());
                if (connectionRecord != null) {
                    MediaBrowserServiceCompat.this.we(this.mb, connectionRecord, this.jw);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.mb);
            }
        }

        class f implements Runnable {
            final /* synthetic */ n WB;
            final /* synthetic */ Bundle mb;

            f(n nVar, Bundle bundle) {
                this.WB = nVar;
                this.mb = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.WB.asBinder();
                MediaBrowserServiceCompat.this.mb.remove(iBinderAsBinder);
                ConnectionRecord connectionRecord = new ConnectionRecord();
                connectionRecord.FH = this.WB;
                connectionRecord.DW = this.mb;
                MediaBrowserServiceCompat.this.mb.put(iBinderAsBinder, connectionRecord);
            }
        }

        class g implements Runnable {
            final /* synthetic */ n WB;

            g(n nVar) {
                this.WB = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserServiceCompat.this.mb.remove(this.WB.asBinder());
            }
        }

        class h implements Runnable {
            final /* synthetic */ n WB;
            final /* synthetic */ ResultReceiver fY;
            final /* synthetic */ Bundle jw;
            final /* synthetic */ String mb;

            h(n nVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.WB = nVar;
                this.mb = str;
                this.jw = bundle;
                this.fY = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mb.get(this.WB.asBinder());
                if (connectionRecord != null) {
                    MediaBrowserServiceCompat.this.J0(this.mb, this.jw, connectionRecord, this.fY);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.mb);
            }
        }

        class i implements Runnable {
            final /* synthetic */ n WB;
            final /* synthetic */ ResultReceiver fY;
            final /* synthetic */ Bundle jw;
            final /* synthetic */ String mb;

            i(n nVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.WB = nVar;
                this.mb = str;
                this.jw = bundle;
                this.fY = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mb.get(this.WB.asBinder());
                if (connectionRecord != null) {
                    MediaBrowserServiceCompat.this.tp(this.mb, this.jw, connectionRecord, this.fY);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.mb + ", extras=" + this.jw);
            }
        }

        m() {
        }

        public void DW(String str, int i2, Bundle bundle, n nVar) {
            if (MediaBrowserServiceCompat.this.FH(str, i2)) {
                MediaBrowserServiceCompat.this.jw.j6(new a(nVar, str, bundle, i2));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        public void FH(n nVar) {
            MediaBrowserServiceCompat.this.jw.j6(new b(nVar));
        }

        public void Hw(String str, ResultReceiver resultReceiver, n nVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.jw.j6(new e(nVar, str, resultReceiver));
        }

        public void VH(String str, Bundle bundle, ResultReceiver resultReceiver, n nVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.jw.j6(new h(nVar, str, bundle, resultReceiver));
        }

        public void Zo(String str, IBinder iBinder, n nVar) {
            MediaBrowserServiceCompat.this.jw.j6(new d(nVar, str, iBinder));
        }

        public void gn(String str, Bundle bundle, ResultReceiver resultReceiver, n nVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.jw.j6(new i(nVar, str, bundle, resultReceiver));
        }

        public void j6(String str, IBinder iBinder, Bundle bundle, n nVar) {
            MediaBrowserServiceCompat.this.jw.j6(new c(nVar, str, iBinder, bundle));
        }

        public void u7(n nVar) {
            MediaBrowserServiceCompat.this.jw.j6(new g(nVar));
        }

        public void v5(n nVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.jw.j6(new f(nVar, bundle));
        }
    }

    private interface n {
        void DW();

        IBinder asBinder();

        void j6(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle);
    }

    private static class o implements n {
        final Messenger j6;

        o(Messenger messenger) {
            this.j6 = messenger;
        }

        private void FH(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            this.j6.send(messageObtain);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.n
        public void DW() throws RemoteException {
            FH(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.n
        public IBinder asBinder() {
            return this.j6.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.n
        public void j6(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            FH(3, bundle2);
        }
    }

    private final class p extends Handler {
        private final m j6;

        p() {
            this.j6 = MediaBrowserServiceCompat.this.new m();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.j6.DW(data.getString("data_package_name"), data.getInt("data_calling_uid"), data.getBundle("data_root_hints"), new o(message.replyTo));
                    break;
                case 2:
                    this.j6.FH(new o(message.replyTo));
                    break;
                case 3:
                    this.j6.j6(data.getString("data_media_item_id"), androidx.core.app.g.j6(data, "data_callback_token"), data.getBundle("data_options"), new o(message.replyTo));
                    break;
                case 4:
                    this.j6.Zo(data.getString("data_media_item_id"), androidx.core.app.g.j6(data, "data_callback_token"), new o(message.replyTo));
                    break;
                case 5:
                    this.j6.Hw(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new o(message.replyTo));
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    this.j6.v5(new o(message.replyTo), data.getBundle("data_root_hints"));
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    this.j6.u7(new o(message.replyTo));
                    break;
                case 8:
                    this.j6.VH(data.getString("data_search_query"), data.getBundle("data_search_extras"), (ResultReceiver) data.getParcelable("data_result_receiver"), new o(message.replyTo));
                    break;
                case 9:
                    this.j6.gn(data.getString("data_custom_action"), data.getBundle("data_custom_action_extras"), (ResultReceiver) data.getParcelable("data_result_receiver"), new o(message.replyTo));
                    break;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 1\n  Client version: " + message.arg1);
                    break;
            }
        }

        public void j6(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }
    }

    List<MediaBrowserCompat.MediaItem> DW(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int size = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i4, size);
    }

    void EQ(String str, ConnectionRecord connectionRecord, Bundle bundle) {
        a aVar = new a(str, connectionRecord, str, bundle);
        if (bundle == null) {
            Zo(str, aVar);
        } else {
            VH(str, aVar, bundle);
        }
        if (aVar.DW()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connectionRecord.j6 + " id=" + str);
    }

    boolean FH(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void Hw(String str, Bundle bundle, l<Bundle> lVar) {
        lVar.v5(null);
    }

    void J0(String str, Bundle bundle, ConnectionRecord connectionRecord, ResultReceiver resultReceiver) {
        c cVar = new c(this, str, resultReceiver);
        u7(str, bundle, cVar);
        if (cVar.DW()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean J8(String str, ConnectionRecord connectionRecord, IBinder iBinder) {
        boolean z = false;
        if (iBinder == null) {
            return connectionRecord.v5.remove(str) != null;
        }
        List<Pair<IBinder, Bundle>> list = connectionRecord.v5.get(str);
        if (list != null) {
            Iterator<Pair<IBinder, Bundle>> it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == it.next().j6) {
                    it.remove();
                    z = true;
                }
            }
            if (list.size() == 0) {
                connectionRecord.v5.remove(str);
            }
        }
        return z;
    }

    public void VH(String str, l<List<MediaBrowserCompat.MediaItem>> lVar, Bundle bundle) {
        lVar.VH(1);
        Zo(str, lVar);
    }

    public abstract void Zo(String str, l<List<MediaBrowserCompat.MediaItem>> lVar);

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void gn(String str, l<MediaBrowserCompat.MediaItem> lVar) {
        lVar.VH(2);
        lVar.Zo(null);
    }

    void j6(String str, ConnectionRecord connectionRecord, IBinder iBinder, Bundle bundle) {
        List<Pair<IBinder, Bundle>> arrayList = connectionRecord.v5.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (Pair<IBinder, Bundle> pair : arrayList) {
            if (iBinder == pair.j6 && android.support.v4.media.c.j6(bundle, pair.DW)) {
                return;
            }
        }
        arrayList.add(new Pair<>(iBinder, bundle));
        connectionRecord.v5.put(str, arrayList);
        EQ(str, connectionRecord, bundle);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.WB.FH(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.WB = new j();
        } else if (i2 >= 23) {
            this.WB = new i();
        } else if (i2 >= 21) {
            this.WB = new h();
        } else {
            this.WB = new k();
        }
        this.WB.j6();
    }

    void tp(String str, Bundle bundle, ConnectionRecord connectionRecord, ResultReceiver resultReceiver) {
        d dVar = new d(this, str, resultReceiver);
        Hw(str, bundle, dVar);
        if (dVar.DW()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void u7(String str, Bundle bundle, l<List<MediaBrowserCompat.MediaItem>> lVar) {
        lVar.VH(4);
        lVar.Zo(null);
    }

    public abstract e v5(String str, int i2, Bundle bundle);

    void we(String str, ConnectionRecord connectionRecord, ResultReceiver resultReceiver) {
        b bVar = new b(this, str, resultReceiver);
        gn(str, bVar);
        if (bVar.DW()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }
}
