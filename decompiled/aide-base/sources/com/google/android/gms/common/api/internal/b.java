package com.google.android.gms.common.api.internal;

import abcd.hw;
import abcd.jv;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class b implements Handler.Callback {

    @GuardedBy("lock")
    private static b kf;
    private final Map<e0<?>, a<?>> AL;
    private final Set<e0<?>> cT;
    private final Context fY;

    @GuardedBy("lock")
    private final Set<e0<?>> hK;
    private final com.google.android.gms.common.internal.i k2;
    private final Handler q7;
    private final com.google.android.gms.common.b qp;

    @GuardedBy("lock")
    private j w9;
    private final AtomicInteger zh;
    public static final Status Z1 = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status n5 = new Status(4, "The user must be signed in to make this API call.");
    private static final Object Q6 = new Object();
    private long WB = 5000;
    private long mb = 120000;
    private long jw = 10000;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
    public class a<O extends a.d> implements com.google.android.gms.common.api.f, com.google.android.gms.common.api.g {
        private final int AL;
        private final e0<O> fY;
        private boolean hK;
        private final a.b jw;
        private final a.f mb;
        private final i qp;
        private final w w9;
        private final Queue<l> WB = new LinkedList();
        private final Set<f0> k2 = new HashSet();
        private final Map<f<?>, u> zh = new HashMap();
        private final List<C0110b> cT = new ArrayList();
        private ConnectionResult q7 = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            a.f fVarFH = eVar.FH(b.this.q7.getLooper(), this);
            this.mb = fVarFH;
            if (fVarFH instanceof com.google.android.gms.common.internal.r) {
                this.jw = ((com.google.android.gms.common.internal.r) fVarFH).gn();
            } else {
                this.jw = fVarFH;
            }
            this.fY = eVar.v5();
            this.qp = new i();
            this.AL = eVar.DW();
            if (this.mb.requiresSignIn()) {
                this.w9 = eVar.Hw(b.this.fY, b.this.q7);
            } else {
                this.w9 = null;
            }
        }

        private final void BT(l lVar) {
            lVar.Hw(this.qp, Hw());
            try {
                lVar.FH(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.mb.disconnect();
            }
        }

        static /* synthetic */ boolean EQ(a aVar, boolean z) {
            return aVar.vy(false);
        }

        private final boolean KD(ConnectionResult connectionResult) {
            synchronized (b.Q6) {
                if (b.this.w9 != null && b.this.hK.contains(this.fY)) {
                    b.this.w9.u7(connectionResult, this.AL);
                    throw null;
                }
            }
            return false;
        }

        private final boolean QX(l lVar) {
            if (!(lVar instanceof v)) {
                BT(lVar);
                return true;
            }
            v vVar = (v) lVar;
            Feature featureZo = Zo(vVar.VH(this));
            if (featureZo == null) {
                BT(lVar);
                return true;
            }
            if (!vVar.gn(this)) {
                vVar.v5(new com.google.android.gms.common.api.l(featureZo));
                return false;
            }
            C0110b c0110b = new C0110b(this.fY, featureZo, null);
            int iIndexOf = this.cT.indexOf(c0110b);
            if (iIndexOf >= 0) {
                C0110b c0110b2 = this.cT.get(iIndexOf);
                b.this.q7.removeMessages(15, c0110b2);
                b.this.q7.sendMessageDelayed(Message.obtain(b.this.q7, 15, c0110b2), b.this.WB);
                return false;
            }
            this.cT.add(c0110b);
            b.this.q7.sendMessageDelayed(Message.obtain(b.this.q7, 15, c0110b), b.this.WB);
            b.this.q7.sendMessageDelayed(Message.obtain(b.this.q7, 16, c0110b), b.this.mb);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (KD(connectionResult)) {
                return false;
            }
            b.this.u7(connectionResult, this.AL);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Ws(C0110b c0110b) {
            Feature[] featureArrVH;
            if (this.cT.remove(c0110b)) {
                b.this.q7.removeMessages(15, c0110b);
                b.this.q7.removeMessages(16, c0110b);
                Feature feature = c0110b.DW;
                ArrayList arrayList = new ArrayList(this.WB.size());
                for (l lVar : this.WB) {
                    if ((lVar instanceof v) && (featureArrVH = ((v) lVar).VH(this)) != null && com.google.android.gms.common.util.b.j6(featureArrVH, feature)) {
                        arrayList.add(lVar);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    l lVar2 = (l) obj;
                    this.WB.remove(lVar2);
                    lVar2.v5(new com.google.android.gms.common.api.l(feature));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void XL() {
            a8();
            ro(ConnectionResult.qp);
            rN();
            Iterator<u> it = this.zh.values().iterator();
            while (it.hasNext()) {
                u next = it.next();
                if (Zo(next.j6.DW()) != null) {
                    it.remove();
                } else {
                    try {
                        next.j6.FH(this.jw, new hw<>());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.mb.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            j3();
            er();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Feature Zo(Feature[] featureArr) {
            if (featureArr != null && featureArr.length != 0) {
                Feature[] availableFeatures = this.mb.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    arrayMap.put(feature.gn(), Long.valueOf(feature.EQ()));
                }
                for (Feature feature2 : featureArr) {
                    if (!arrayMap.containsKey(feature2.gn()) || ((Long) arrayMap.get(feature2.gn())).longValue() < feature2.EQ()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void aM() {
            a8();
            this.hK = true;
            this.qp.Hw();
            b.this.q7.sendMessageDelayed(Message.obtain(b.this.q7, 9, this.fY), b.this.WB);
            b.this.q7.sendMessageDelayed(Message.obtain(b.this.q7, 11, this.fY), b.this.mb);
            b.this.k2.j6();
        }

        private final void er() {
            b.this.q7.removeMessages(12, this.fY);
            b.this.q7.sendMessageDelayed(b.this.q7.obtainMessage(12, this.fY), b.this.jw);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void gn(C0110b c0110b) {
            if (this.cT.contains(c0110b) && !this.hK) {
                if (this.mb.isConnected()) {
                    j3();
                } else {
                    j6();
                }
            }
        }

        private final void j3() {
            ArrayList arrayList = new ArrayList(this.WB);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l lVar = (l) obj;
                if (!this.mb.isConnected()) {
                    return;
                }
                if (QX(lVar)) {
                    this.WB.remove(lVar);
                }
            }
        }

        private final void rN() {
            if (this.hK) {
                b.this.q7.removeMessages(11, this.fY);
                b.this.q7.removeMessages(9, this.fY);
                this.hK = false;
            }
        }

        private final void ro(ConnectionResult connectionResult) {
            for (f0 f0Var : this.k2) {
                String endpointPackageName = null;
                if (com.google.android.gms.common.internal.o.j6(connectionResult, ConnectionResult.qp)) {
                    endpointPackageName = this.mb.getEndpointPackageName();
                }
                f0Var.j6(this.fY, connectionResult, endpointPackageName);
            }
            this.k2.clear();
        }

        private final boolean vy(boolean z) {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            if (!this.mb.isConnected() || this.zh.size() != 0) {
                return false;
            }
            if (!this.qp.DW()) {
                this.mb.disconnect();
                return true;
            }
            if (z) {
                er();
            }
            return false;
        }

        public final int DW() {
            return this.AL;
        }

        final boolean FH() {
            return this.mb.isConnected();
        }

        public final boolean Hw() {
            return this.mb.requiresSignIn();
        }

        public final void J0() {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            if (this.hK) {
                rN();
                gW(b.this.qp.gn(b.this.fY) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.mb.disconnect();
            }
        }

        public final void Mr() {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            gW(b.Z1);
            this.qp.FH();
            for (f fVar : (f[]) this.zh.keySet().toArray(new f[this.zh.size()])) {
                u7(new d0(fVar, new hw()));
            }
            ro(new ConnectionResult(4));
            if (this.mb.isConnected()) {
                this.mb.onUserSignOut(new p(this));
            }
        }

        public final void SI(ConnectionResult connectionResult) {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            this.mb.disconnect();
            onConnectionFailed(connectionResult);
        }

        public final Map<f<?>, u> U2() {
            return this.zh;
        }

        public final void a8() {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            this.q7 = null;
        }

        public final void gW(Status status) {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            Iterator<l> it = this.WB.iterator();
            while (it.hasNext()) {
                it.next().DW(status);
            }
            this.WB.clear();
        }

        public final void j6() {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            if (this.mb.isConnected() || this.mb.isConnecting()) {
                return;
            }
            int iDW = b.this.k2.DW(b.this.fY, this.mb);
            if (iDW != 0) {
                onConnectionFailed(new ConnectionResult(iDW, null));
                return;
            }
            c cVar = b.this.new c(this.mb, this.fY);
            if (this.mb.requiresSignIn()) {
                this.w9.sy(cVar);
            }
            this.mb.connect(cVar);
        }

        public final ConnectionResult lg() {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            return this.q7;
        }

        @Override // com.google.android.gms.common.api.f
        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == b.this.q7.getLooper()) {
                XL();
            } else {
                b.this.q7.post(new n(this));
            }
        }

        @Override // com.google.android.gms.common.api.g
        public final void onConnectionFailed(ConnectionResult connectionResult) {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            w wVar = this.w9;
            if (wVar != null) {
                wVar.CU();
            }
            a8();
            b.this.k2.j6();
            ro(connectionResult);
            if (connectionResult.gn() == 4) {
                gW(b.n5);
                return;
            }
            if (this.WB.isEmpty()) {
                this.q7 = connectionResult;
                return;
            }
            if (KD(connectionResult) || b.this.u7(connectionResult, this.AL)) {
                return;
            }
            if (connectionResult.gn() == 18) {
                this.hK = true;
            }
            if (this.hK) {
                b.this.q7.sendMessageDelayed(Message.obtain(b.this.q7, 9, this.fY), b.this.WB);
                return;
            }
            String strJ6 = this.fY.j6();
            StringBuilder sb = new StringBuilder(String.valueOf(strJ6).length() + 38);
            sb.append("API: ");
            sb.append(strJ6);
            sb.append(" is not available on this device.");
            gW(new Status(17, sb.toString()));
        }

        @Override // com.google.android.gms.common.api.f
        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == b.this.q7.getLooper()) {
                aM();
            } else {
                b.this.q7.post(new o(this));
            }
        }

        public final void tp(f0 f0Var) {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            this.k2.add(f0Var);
        }

        public final void u7(l lVar) {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            if (this.mb.isConnected()) {
                if (QX(lVar)) {
                    er();
                    return;
                } else {
                    this.WB.add(lVar);
                    return;
                }
            }
            this.WB.add(lVar);
            ConnectionResult connectionResult = this.q7;
            if (connectionResult == null || !connectionResult.Ws()) {
                j6();
            } else {
                onConnectionFailed(this.q7);
            }
        }

        public final void v5() {
            com.google.android.gms.common.internal.p.FH(b.this.q7);
            if (this.hK) {
                j6();
            }
        }

        public final a.f we() {
            return this.mb;
        }

        public final boolean yS() {
            return vy(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements z, c.InterfaceC0111c {
        private final e0<?> DW;
        private final a.f j6;
        private com.google.android.gms.common.internal.j FH = null;
        private Set<Scope> Hw = null;
        private boolean v5 = false;

        public c(a.f fVar, e0<?> e0Var) {
            this.j6 = fVar;
            this.DW = e0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void VH() {
            com.google.android.gms.common.internal.j jVar;
            if (!this.v5 || (jVar = this.FH) == null) {
                return;
            }
            this.j6.getRemoteService(jVar, this.Hw);
        }

        static /* synthetic */ boolean v5(c cVar, boolean z) {
            cVar.v5 = true;
            return true;
        }

        @Override // com.google.android.gms.common.api.internal.z
        public final void DW(com.google.android.gms.common.internal.j jVar, Set<Scope> set) {
            if (jVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                FH(new ConnectionResult(4));
            } else {
                this.FH = jVar;
                this.Hw = set;
                VH();
            }
        }

        @Override // com.google.android.gms.common.api.internal.z
        public final void FH(ConnectionResult connectionResult) {
            ((a) b.this.AL.get(this.DW)).SI(connectionResult);
        }

        @Override // com.google.android.gms.common.internal.c.InterfaceC0111c
        public final void j6(ConnectionResult connectionResult) {
            b.this.q7.post(new r(this, connectionResult));
        }
    }

    private b(Context context, Looper looper, com.google.android.gms.common.b bVar) {
        new AtomicInteger(1);
        this.zh = new AtomicInteger(0);
        this.AL = new ConcurrentHashMap(5, 0.75f, 1);
        this.w9 = null;
        this.hK = new ArraySet();
        this.cT = new ArraySet();
        this.fY = context;
        this.q7 = new jv(looper, this);
        this.qp = bVar;
        this.k2 = new com.google.android.gms.common.internal.i(bVar);
        Handler handler = this.q7;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static b Hw(Context context) {
        b bVar;
        synchronized (Q6) {
            if (kf == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                kf = new b(context.getApplicationContext(), handlerThread.getLooper(), com.google.android.gms.common.b.Ws());
            }
            bVar = kf;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v5(com.google.android.gms.common.api.e<?> eVar) {
        Object objV5 = eVar.v5();
        a<?> aVar = this.AL.get(objV5);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.AL.put(objV5, aVar);
        }
        if (aVar.Hw()) {
            this.cT.add(objV5);
        }
        aVar.j6();
    }

    public final void DW(ConnectionResult connectionResult, int i) {
        if (u7(connectionResult, i)) {
            return;
        }
        Handler handler = this.q7;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void XL() {
        Handler handler = this.q7;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        a<?> aVar = null;
        switch (i) {
            case 1:
                this.jw = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.q7.removeMessages(12);
                for (e0<?> e0Var : this.AL.keySet()) {
                    Handler handler = this.q7;
                    handler.sendMessageDelayed(handler.obtainMessage(12, e0Var), this.jw);
                }
                return true;
            case 2:
                f0 f0Var = (f0) message.obj;
                Iterator<e0<?>> it = f0Var.DW().iterator();
                while (true) {
                    if (it.hasNext()) {
                        e0<?> next = it.next();
                        a<?> aVar2 = this.AL.get(next);
                        if (aVar2 == null) {
                            f0Var.j6(next, new ConnectionResult(13), null);
                        } else if (aVar2.FH()) {
                            f0Var.j6(next, ConnectionResult.qp, aVar2.we().getEndpointPackageName());
                        } else if (aVar2.lg() != null) {
                            f0Var.j6(next, aVar2.lg(), null);
                        } else {
                            aVar2.tp(f0Var);
                            aVar2.j6();
                        }
                    }
                }
                return true;
            case 3:
                for (a<?> aVar3 : this.AL.values()) {
                    aVar3.a8();
                    aVar3.j6();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t tVar = (t) message.obj;
                a<?> aVar4 = this.AL.get(tVar.FH.v5());
                if (aVar4 == null) {
                    v5(tVar.FH);
                    aVar4 = this.AL.get(tVar.FH.v5());
                }
                if (!aVar4.Hw() || this.zh.get() == tVar.DW) {
                    aVar4.u7(tVar.j6);
                } else {
                    tVar.j6.DW(Z1);
                    aVar4.Mr();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<a<?>> it2 = this.AL.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.DW() == i2) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String strZo = this.qp.Zo(connectionResult.gn());
                    String strEQ = connectionResult.EQ();
                    StringBuilder sb = new StringBuilder(String.valueOf(strZo).length() + 69 + String.valueOf(strEQ).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(strZo);
                    sb.append(": ");
                    sb.append(strEQ);
                    aVar.gW(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                if (com.google.android.gms.common.util.o.j6() && (this.fY.getApplicationContext() instanceof Application)) {
                    com.google.android.gms.common.api.internal.a.FH((Application) this.fY.getApplicationContext());
                    com.google.android.gms.common.api.internal.a.DW().j6(new m(this));
                    if (!com.google.android.gms.common.api.internal.a.DW().Zo(true)) {
                        this.jw = 300000L;
                    }
                }
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                v5((com.google.android.gms.common.api.e) message.obj);
                return true;
            case 9:
                if (this.AL.containsKey(message.obj)) {
                    this.AL.get(message.obj).v5();
                }
                return true;
            case 10:
                Iterator<e0<?>> it3 = this.cT.iterator();
                while (it3.hasNext()) {
                    this.AL.remove(it3.next()).Mr();
                }
                this.cT.clear();
                return true;
            case 11:
                if (this.AL.containsKey(message.obj)) {
                    this.AL.get(message.obj).J0();
                }
                return true;
            case 12:
                if (this.AL.containsKey(message.obj)) {
                    this.AL.get(message.obj).yS();
                }
                return true;
            case 14:
                k kVar = (k) message.obj;
                e0<?> e0VarDW = kVar.DW();
                if (this.AL.containsKey(e0VarDW)) {
                    kVar.j6().FH(Boolean.valueOf(a.EQ(this.AL.get(e0VarDW), false)));
                } else {
                    kVar.j6().FH(Boolean.FALSE);
                }
                return true;
            case 15:
                C0110b c0110b = (C0110b) message.obj;
                if (this.AL.containsKey(c0110b.j6)) {
                    this.AL.get(c0110b.j6).gn(c0110b);
                }
                return true;
            case 16:
                C0110b c0110b2 = (C0110b) message.obj;
                if (this.AL.containsKey(c0110b2.j6)) {
                    this.AL.get(c0110b2.j6).Ws(c0110b2);
                }
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    final boolean u7(ConnectionResult connectionResult, int i) {
        return this.qp.a8(this.fY, connectionResult, i);
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$b, reason: collision with other inner class name */
    private static class C0110b {
        private final Feature DW;
        private final e0<?> j6;

        private C0110b(e0<?> e0Var, Feature feature) {
            this.j6 = e0Var;
            this.DW = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C0110b)) {
                C0110b c0110b = (C0110b) obj;
                if (com.google.android.gms.common.internal.o.j6(this.j6, c0110b.j6) && com.google.android.gms.common.internal.o.j6(this.DW, c0110b.DW)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.o.DW(this.j6, this.DW);
        }

        public final String toString() {
            o.a aVarFH = com.google.android.gms.common.internal.o.FH(this);
            aVarFH.j6("key", this.j6);
            aVarFH.j6("feature", this.DW);
            return aVarFH.toString();
        }

        /* synthetic */ C0110b(e0 e0Var, Feature feature, m mVar) {
            this(e0Var, feature);
        }
    }
}
