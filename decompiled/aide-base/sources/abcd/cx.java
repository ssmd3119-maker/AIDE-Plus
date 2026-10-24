package abcd;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.components.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class cx {
    private final String DW;
    private final dx FH;
    private final com.google.firebase.components.m Hw;
    private final AtomicBoolean gn;
    private final Context j6;
    private final List<a> u7;
    private final SharedPreferences v5;
    private static final List<String> tp = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");
    private static final List<String> EQ = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> we = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");
    private static final List<String> J0 = Arrays.asList(new String[0]);
    private static final Set<String> J8 = Collections.emptySet();
    private static final Object Ws = new Object();
    private static final Executor QX = new c(0);

    @GuardedBy("LOCK")
    static final Map<String, cx> XL = new ArrayMap();
    private final AtomicBoolean Zo = new AtomicBoolean(false);
    private final AtomicBoolean VH = new AtomicBoolean();

    public interface a {
        void j6(boolean z);
    }

    @TargetApi(14)
    static class b implements a.InterfaceC0109a {
        private static AtomicReference<b> j6 = new AtomicReference<>();

        private b() {
        }

        public static /* synthetic */ void DW(Context context) {
            if (o.j6() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (j6.get() == null) {
                    b bVar = new b();
                    if (j6.compareAndSet(null, bVar)) {
                        com.google.android.gms.common.api.internal.a.FH(application);
                        com.google.android.gms.common.api.internal.a.DW().j6(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0109a
        public final void j6(boolean z) {
            synchronized (cx.Ws) {
                Iterator it = new ArrayList(cx.XL.values()).iterator();
                while (it.hasNext()) {
                    cx cxVar = (cx) it.next();
                    if (cxVar.Zo.get()) {
                        cxVar.Ws(z);
                    }
                }
            }
        }
    }

    static class c implements Executor {
        private static final Handler j6 = new Handler(Looper.getMainLooper());

        private c() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            j6.post(runnable);
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    @TargetApi(24)
    static class d extends BroadcastReceiver {
        private static AtomicReference<d> DW = new AtomicReference<>();
        private final Context j6;

        private d(Context context) {
            this.j6 = context;
        }

        public static /* synthetic */ void j6(Context context) {
            if (DW.get() == null) {
                d dVar = new d(context);
                if (DW.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (cx.Ws) {
                Iterator<cx> it = cx.XL.values().iterator();
                while (it.hasNext()) {
                    it.next().j3();
                }
            }
            this.j6.unregisterReceiver(this);
        }
    }

    private cx(Context context, String str, dx dxVar) {
        new CopyOnWriteArrayList();
        this.u7 = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        p.u7(context);
        this.j6 = context;
        p.v5(str);
        this.DW = str;
        p.u7(dxVar);
        this.FH = dxVar;
        this.v5 = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.gn = new AtomicBoolean(XL());
        com.google.firebase.components.m mVar = new com.google.firebase.components.m(QX, a.C0115a.j6(context).DW(), com.google.firebase.components.a.FH(context, Context.class, new Class[0]), com.google.firebase.components.a.FH(this, cx.class, new Class[0]), com.google.firebase.components.a.FH(dxVar, dx.class, new Class[0]));
        this.Hw = mVar;
    }

    public static cx FH() {
        cx cxVar;
        synchronized (Ws) {
            cxVar = XL.get("[DEFAULT]");
            if (cxVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + q.j6() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void J8(Class<T> cls, T t, Iterable<String> iterable, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        for (String str : iterable) {
            if (z) {
                try {
                } catch (ClassNotFoundException unused) {
                    if (J8.contains(str)) {
                        throw new IllegalStateException(str + " is missing, but is required. Check if it has been removed by Proguard.");
                    }
                    Log.d("FirebaseApp", str + " is not linked. Skipping initialization.");
                } catch (IllegalAccessException e) {
                    Log.wtf("FirebaseApp", "Failed to initialize " + str, e);
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(str + "#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                } catch (InvocationTargetException e2) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e2);
                }
                if (J0.contains(str)) {
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, t);
            }
        }
    }

    public static cx VH(Context context, dx dxVar) {
        return gn(context, dxVar, "[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ws(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.u7.iterator();
        while (it.hasNext()) {
            it.next().j6(z);
        }
    }

    private boolean XL() {
        ApplicationInfo applicationInfo;
        if (this.v5.contains("firebase_data_collection_default_enabled")) {
            return this.v5.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.j6.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.j6.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public static cx Zo(Context context) {
        synchronized (Ws) {
            if (XL.containsKey("[DEFAULT]")) {
                return FH();
            }
            dx dxVarJ6 = dx.j6(context);
            if (dxVarJ6 == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return VH(context, dxVarJ6);
        }
    }

    private void aM() {
        p.J0(!this.VH.get(), "FirebaseApp was deleted");
    }

    public static cx gn(Context context, dx dxVar, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        cx cxVar;
        b.DW(context);
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (Ws) {
            p.J0(!XL.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            p.tp(context, "Application context cannot be null.");
            cxVar = new cx(context, strTrim, dxVar);
            XL.put(strTrim, cxVar);
        }
        cxVar.j3();
        return cxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsDeviceProtectedStorage = ContextCompat.isDeviceProtectedStorage(this.j6);
        if (zIsDeviceProtectedStorage) {
            d.j6(this.j6);
        } else {
            this.Hw.v5(tp());
        }
        J8(cx.class, this, tp, zIsDeviceProtectedStorage);
        if (tp()) {
            J8(cx.class, this, EQ, zIsDeviceProtectedStorage);
            J8(Context.class, this.j6, we, zIsDeviceProtectedStorage);
        }
    }

    public Context DW() {
        aM();
        return this.j6;
    }

    public String Hw() {
        aM();
        return this.DW;
    }

    public boolean equals(Object obj) {
        if (obj instanceof cx) {
            return this.DW.equals(((cx) obj).Hw());
        }
        return false;
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    public <T> T j6(Class<T> cls) {
        aM();
        return (T) this.Hw.j6(cls);
    }

    public String toString() {
        o.a aVarFH = com.google.android.gms.common.internal.o.FH(this);
        aVarFH.j6(AppMeasurementSdk.ConditionalUserProperty.NAME, this.DW);
        aVarFH.j6("options", this.FH);
        return aVarFH.toString();
    }

    public boolean tp() {
        return "[DEFAULT]".equals(Hw());
    }

    public boolean u7() {
        aM();
        return this.gn.get();
    }

    public dx v5() {
        aM();
        return this.FH;
    }
}
