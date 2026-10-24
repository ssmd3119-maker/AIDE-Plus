package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.wrappers.b;
import com.google.android.gms.internal.measurement.h;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class zzfy extends zzcs {
    private static final String[] zzauo = {"firebase_", "google_", "ga_"};
    private int zzado;
    private SecureRandom zzaup;
    private final AtomicLong zzauq;
    private Integer zzaur;

    zzfy(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzaur = null;
        this.zzauq = new AtomicLong(0L);
    }

    static MessageDigest getMessageDigest() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    static boolean zzc(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean zzct(String str) {
        p.v5(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static boolean zzcw(String str) {
        p.u7(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private static int zzcx(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    static boolean zzcy(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static Bundle[] zzf(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final boolean zzt(String str, String str2) {
        if (str2 == null) {
            zzgt().zzjg().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzgt().zzjg().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzgt().zzjg().zze("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzgt().zzjg().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    static boolean zzv(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final Bundle zza(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("term", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("content", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("aclid", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("cp1", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            zzgt().zzjj().zzg("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    public final void zzb(h hVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            hVar.xL(bundle);
        } catch (RemoteException e) {
            this.zzada.zzgt().zzjj().zzg("Error returning string value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    final int zzcu(String str) {
        if (!zzt("event", str)) {
            return 2;
        }
        if (zza("event", zzcu.zzaqq, str)) {
            return !zza("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int zzcv(String str) {
        if (!zzt("user property", str)) {
            return 6;
        }
        if (zza("user property", zzcw.zzaqu, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final boolean zzcz(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strZzid = zzgv().zzid();
        zzgw();
        return strZzid.equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:17:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final long zzd(android.content.Context r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            r6.zzaf()
            com.google.android.gms.common.internal.p.u7(r7)
            com.google.android.gms.common.internal.p.v5(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = getMessageDigest()
            r2 = -1
            r4 = 0
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.zzas r7 = r6.zzgt()
            com.google.android.gms.measurement.internal.zzau r7 = r7.zzjg()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.zzby(r8)
            goto L77
        L25:
            if (r0 == 0) goto L76
            boolean r8 = r6.zze(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 != 0) goto L76
            com.google.android.gms.common.wrappers.PackageManagerWrapper r7 = com.google.android.gms.common.wrappers.b.j6(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.Context r8 = r6.getContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.v5(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.pm.Signature[] r8 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 == 0) goto L5a
            android.content.pm.Signature[] r8 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r8 = r8.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 <= 0) goto L5a
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            long r2 = zzc(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L77
        L5a:
            com.google.android.gms.measurement.internal.zzas r7 = r6.zzgt()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            com.google.android.gms.measurement.internal.zzau r7 = r7.zzjj()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = "Could not get signatures"
            r7.zzby(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L77
        L68:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzas r8 = r6.zzgt()
            com.google.android.gms.measurement.internal.zzau r8 = r8.zzjg()
            java.lang.String r0 = "Package name not found"
            r8.zzg(r0, r7)
        L76:
            r2 = r4
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfy.zzd(android.content.Context, java.lang.String):long");
    }

    final Bundle zze(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objZzh = zzh(str, bundle.get(str));
                if (objZzh == null) {
                    zzgt().zzjj().zzg("Param value can't be null", zzgq().zzbu(str));
                } else {
                    zza(bundle2, str, objZzh);
                }
            }
        }
        return bundle2;
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgf() {
        super.zzgf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgg() {
        super.zzgg();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgh() {
        super.zzgh();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzaa zzgp() {
        return super.zzgp();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzaq zzgq() {
        return super.zzgq();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzfy zzgr() {
        return super.zzgr();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzbr zzgs() {
        return super.zzgs();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzgt() {
        return super.zzgt();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzbd zzgu() {
        return super.zzgu();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzq zzgv() {
        return super.zzgv();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzn zzgw() {
        return super.zzgw();
    }

    @Override // com.google.android.gms.measurement.internal.zzcs
    protected final boolean zzgy() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzcs
    protected final void zzgz() {
        zzaf();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                zzgt().zzjj().zzby("Utils falling back to Random for random id");
            }
        }
        this.zzauq.set(jNextLong);
    }

    final Object zzh(String str, Object obj) {
        if ("_ev".equals(str)) {
            return zza(256, obj, true);
        }
        return zza(zzcy(str) ? 256 : 100, obj, false);
    }

    final int zzi(String str, Object obj) {
        return "_ldl".equals(str) ? zza("user property referrer", str, zzcx(str), obj, false) : zza("user property", str, zzcx(str), obj, false) ? 0 : 7;
    }

    final Object zzj(String str, Object obj) {
        return "_ldl".equals(str) ? zza(zzcx(str), obj, true) : zza(zzcx(str), obj, false);
    }

    public final long zzmj() {
        long andIncrement;
        long j;
        if (this.zzauq.get() != 0) {
            synchronized (this.zzauq) {
                this.zzauq.compareAndSet(-1L, 1L);
                andIncrement = this.zzauq.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzauq) {
            long jNextLong = new Random(System.nanoTime() ^ zzbx().j6()).nextLong();
            int i = this.zzado + 1;
            this.zzado = i;
            j = jNextLong + i;
        }
        return j;
    }

    final SecureRandom zzmk() {
        zzaf();
        if (this.zzaup == null) {
            this.zzaup = new SecureRandom();
        }
        return this.zzaup;
    }

    public final int zzml() {
        if (this.zzaur == null) {
            this.zzaur = Integer.valueOf(c.VH().DW(getContext()) / 1000);
        }
        return this.zzaur.intValue();
    }

    final String zzmm() {
        byte[] bArr = new byte[16];
        zzmk().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final boolean zzs(String str, String str2) {
        if (str2 == null) {
            zzgt().zzjg().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzgt().zzjg().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzgt().zzjg().zze("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzgt().zzjg().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean zzu(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzcw(str)) {
                return true;
            }
            if (this.zzada.zzkn()) {
                zzgt().zzjg().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzas.zzbw(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.zzada.zzkn()) {
                zzgt().zzjg().zzby("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (zzcw(str2)) {
            return true;
        }
        zzgt().zzjg().zzg("Invalid admob_app_id. Analytics disabled.", zzas.zzbw(str2));
        return false;
    }

    final boolean zzx(String str) {
        zzaf();
        if (b.j6(getContext()).j6(str) == 0) {
            return true;
        }
        zzgt().zzjn().zzg("Permission not granted", str);
        return false;
    }

    static long zzc(byte[] bArr) {
        p.u7(bArr);
        int i = 0;
        p.we(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    private final boolean zze(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoV5 = b.j6(context).v5(str, 64);
            if (packageInfoV5 == null || packageInfoV5.signatures == null || packageInfoV5.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfoV5.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            zzgt().zzjg().zzg("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            zzgt().zzjg().zzg("Error obtaining certificate", e2);
            return true;
        }
    }

    public static Bundle zzf(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    private static boolean zzc(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static long zzc(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public static Bundle zzd(List<zzfv> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzfv zzfvVar : list) {
            String str = zzfvVar.zzaml;
            if (str != null) {
                bundle.putString(zzfvVar.name, str);
            } else {
                Long l = zzfvVar.zzaul;
                if (l != null) {
                    bundle.putLong(zzfvVar.name, l.longValue());
                } else {
                    Double d = zzfvVar.zzaun;
                    if (d != null) {
                        bundle.putDouble(zzfvVar.name, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public final int zzs(int i) {
        return c.VH().u7(getContext(), 12451000);
    }

    final boolean zza(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            zzgt().zzjg().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        p.u7(str2);
        String[] strArr2 = zzauo;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            zzgt().zzjg().zze("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            p.u7(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                }
                if (zzv(str2, strArr[i2])) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                zzgt().zzjg().zze("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    final boolean zza(String str, int i, String str2) {
        if (str2 == null) {
            zzgt().zzjg().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzgt().zzjg().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    private final boolean zza(String str, String str2, int i, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if ((obj instanceof Bundle) && z) {
                    return true;
                }
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            zzgt().zzjj().zze("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof ArrayList) || !z) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        zzgt().zzjj().zze("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                zzgt().zzjj().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    static boolean zza(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static Object zza(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zza(String.valueOf(obj), i, z);
        }
        return null;
    }

    public static String zza(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e A[PHI: r13
      0x016e: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:79:0x0131, B:81:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.os.Bundle zza(java.lang.String r19, java.lang.String r20, android.os.Bundle r21, java.util.List<java.lang.String> r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfy.zza(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    private static boolean zza(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    private static void zza(Bundle bundle, Object obj) {
        p.u7(bundle);
        if (obj != null) {
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", String.valueOf(obj).length());
            }
        }
    }

    final void zza(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str != null) {
            zzgt().zzjl().zze("Not putting event parameter. Invalid value type. name, type", zzgq().zzbu(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(int i, String str, String str2, int i2) {
        zza((String) null, i, str, str2, i2);
    }

    final void zza(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zza(bundle, i);
        if (zzgv().zze(str, zzai.zzalg)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.zzada.zzgw();
        this.zzada.zzgj().logEvent("auto", "_err", bundle);
    }

    static boolean zza(Context context, boolean z) {
        p.u7(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return zzc(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzc(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    final zzag zza(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzcu(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            return new zzag(str2, new zzad(zze(zza(str, str2, bundle2, f.DW("_o"), false, false))), str3, j);
        }
        zzgt().zzjg().zzg("Invalid conditional property event name", zzgq().zzbv(str2));
        throw new IllegalArgumentException();
    }

    static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    final void zza(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            zzgt().zzjj().zzg("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public final void zza(h hVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            hVar.xL(bundle);
        } catch (RemoteException e) {
            this.zzada.zzgt().zzjj().zzg("Error returning long value to wrapper", e);
        }
    }

    public final void zza(h hVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            hVar.xL(bundle);
        } catch (RemoteException e) {
            this.zzada.zzgt().zzjj().zzg("Error returning int value to wrapper", e);
        }
    }

    public final void zza(h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            hVar.xL(bundle);
        } catch (RemoteException e) {
            this.zzada.zzgt().zzjj().zzg("Error returning byte array to wrapper", e);
        }
    }

    public final void zza(h hVar, Bundle bundle) {
        try {
            hVar.xL(bundle);
        } catch (RemoteException e) {
            this.zzada.zzgt().zzjj().zzg("Error returning bundle value to wrapper", e);
        }
    }
}
