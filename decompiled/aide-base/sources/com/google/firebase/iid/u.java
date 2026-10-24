package com.google.firebase.iid;

import abcd.hw;
import abcd.jw;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.firebase.iid.zzl;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class u {
    private static int VH;
    private static PendingIntent gn;
    private final Context DW;
    private final zzan FH;
    private zzl Zo;
    private Messenger v5;

    @GuardedBy("responseCallbacks")
    private final SimpleArrayMap<String, hw<Bundle>> j6 = new SimpleArrayMap<>();
    private Messenger Hw = new Messenger(new v(this, Looper.getMainLooper()));

    public u(Context context, zzan zzanVar) {
        this.DW = context;
        this.FH = zzanVar;
    }

    private final void FH(String str, Bundle bundle) {
        synchronized (this.j6) {
            hw<Bundle> hwVarRemove = this.j6.remove(str);
            if (hwVarRemove != null) {
                hwVarRemove.FH(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    private static synchronized String Hw() {
        int i;
        i = VH;
        VH = i + 1;
        return Integer.toString(i);
    }

    private final Bundle VH(Bundle bundle) throws RemoteException, IOException {
        Bundle bundleGn = gn(bundle);
        if (bundleGn == null || !bundleGn.containsKey("google.messenger")) {
            return bundleGn;
        }
        Bundle bundleGn2 = gn(bundle);
        if (bundleGn2 == null || !bundleGn2.containsKey("google.messenger")) {
            return bundleGn2;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:10)(1:11)|12|(1:14)|15|(5:(7:17|(0)(2:28|(1:30)(1:31))|65|32|33|ee|37)|65|32|33|ee)|19|66|20|(1:22)(1:23)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (android.util.Log.isLoggable("FirebaseInstanceId", r3) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        android.util.Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [abcd.hw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.concurrent.TimeUnit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d3 -> B:65:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d9 -> B:65:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle gn(android.os.Bundle r9) throws android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.u.gn(android.os.Bundle):android.os.Bundle");
    }

    private static synchronized void j6(Context context, Intent intent) {
        if (gn == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            gn = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", gn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v5(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzl.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzl) {
                        this.Zo = (zzl) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.v5 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String strValueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String strValueOf2 = String.valueOf(stringExtra);
                            Log.d("FirebaseInstanceId", strValueOf2.length() != 0 ? "Unexpected response string: ".concat(strValueOf2) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", strGroup2);
                    FH(strGroup, extras);
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf3 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf3).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf3);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf4 = String.valueOf(stringExtra2);
                    Log.d("FirebaseInstanceId", strValueOf4.length() != 0 ? "Received InstanceID error ".concat(strValueOf4) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.j6) {
                        for (int i = 0; i < this.j6.size(); i++) {
                            FH(this.j6.keyAt(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    String strValueOf5 = String.valueOf(stringExtra2);
                    Log.w("FirebaseInstanceId", strValueOf5.length() != 0 ? "Unexpected structured response ".concat(strValueOf5) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                FH(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    final Bundle Zo(Bundle bundle) {
        if (this.FH.Zo() < 12000000) {
            return VH(bundle);
        }
        try {
            return (Bundle) jw.j6(e.v5(this.DW).FH(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ((e.getCause() instanceof n) && ((n) e.getCause()).j6() == 4) {
                return VH(bundle);
            }
            return null;
        }
    }
}
