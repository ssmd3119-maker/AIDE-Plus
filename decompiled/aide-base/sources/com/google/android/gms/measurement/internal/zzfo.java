package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.wrappers.b;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class zzfo implements zzct {
    private static volatile zzfo zzatg;
    private final zzbw zzada;
    private zzbq zzath;
    private zzaw zzati;
    private zzt zzatj;
    private zzbb zzatk;
    private zzfk zzatl;
    private zzm zzatm;
    private final zzfu zzatn;
    private zzdv zzato;
    private boolean zzatp;
    private boolean zzatq;
    private long zzatr;
    private List<Runnable> zzats;
    private int zzatt;
    private int zzatu;
    private boolean zzatv;
    private boolean zzatw;
    private boolean zzatx;
    private FileLock zzaty;
    private FileChannel zzatz;
    private List<Long> zzaua;
    private List<Long> zzaub;
    private long zzauc;
    private boolean zzvz;

    class zza implements zzv {
        i1 zzaug;
        List<Long> zzauh;
        List<f1> zzaui;
        private long zzauj;

        private zza() {
        }

        @Override // com.google.android.gms.measurement.internal.zzv
        public final boolean zza(long j, f1 f1Var) {
            p.u7(f1Var);
            if (this.zzaui == null) {
                this.zzaui = new ArrayList();
            }
            if (this.zzauh == null) {
                this.zzauh = new ArrayList();
            }
            if (this.zzaui.size() > 0 && zza(this.zzaui.get(0)) != zza(f1Var)) {
                return false;
            }
            long jHw = this.zzauj + f1Var.Hw();
            if (jHw >= Math.max(0, zzai.zzajc.get().intValue())) {
                return false;
            }
            this.zzauj = jHw;
            this.zzaui.add(f1Var);
            this.zzauh.add(Long.valueOf(j));
            return this.zzaui.size() < Math.max(1, zzai.zzajd.get().intValue());
        }

        @Override // com.google.android.gms.measurement.internal.zzv
        public final void zzb(i1 i1Var) {
            p.u7(i1Var);
            this.zzaug = i1Var;
        }

        /* synthetic */ zza(zzfo zzfoVar, zzfp zzfpVar) {
            this();
        }

        private static long zza(f1 f1Var) {
            return ((f1Var.v5.longValue() / 1000) / 60) / 60;
        }
    }

    private zzfo(zzft zzftVar) {
        this(zzftVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzft zzftVar) {
        this.zzada.zzgs().zzaf();
        zzt zztVar = new zzt(this);
        zztVar.zzq();
        this.zzatj = zztVar;
        this.zzada.zzgv().zza(this.zzath);
        zzm zzmVar = new zzm(this);
        zzmVar.zzq();
        this.zzatm = zzmVar;
        zzdv zzdvVar = new zzdv(this);
        zzdvVar.zzq();
        this.zzato = zzdvVar;
        zzfk zzfkVar = new zzfk(this);
        zzfkVar.zzq();
        this.zzatl = zzfkVar;
        this.zzatk = new zzbb(this);
        if (this.zzatt != this.zzatu) {
            this.zzada.zzgt().zzjg().zze("Not all upload components initialized", Integer.valueOf(this.zzatt), Integer.valueOf(this.zzatu));
        }
        this.zzvz = true;
    }

    private final void zzaf() {
        this.zzada.zzgs().zzaf();
    }

    private final void zzb(zzg zzgVar) {
        ArrayMap arrayMap;
        zzaf();
        if (TextUtils.isEmpty(zzgVar.getGmpAppId()) && (!zzq.zzig() || TextUtils.isEmpty(zzgVar.zzhb()))) {
            zzb(zzgVar.zzal(), 204, null, null, null);
            return;
        }
        zzq zzqVarZzgv = this.zzada.zzgv();
        Uri.Builder builder = new Uri.Builder();
        String gmpAppId = zzgVar.getGmpAppId();
        if (TextUtils.isEmpty(gmpAppId) && zzq.zzig()) {
            gmpAppId = zzgVar.zzhb();
        }
        Uri.Builder builderEncodedAuthority = builder.scheme(zzai.zzaiy.get()).encodedAuthority(zzai.zzaiz.get());
        String strValueOf = String.valueOf(gmpAppId);
        builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", zzgVar.getAppInstanceId()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(zzqVarZzgv.zzhh()));
        String string = builder.build().toString();
        try {
            URL url = new URL(string);
            this.zzada.zzgt().zzjo().zzg("Fetching remote configuration", zzgVar.zzal());
            b1 b1VarZzcg = zzls().zzcg(zzgVar.zzal());
            String strZzch = zzls().zzch(zzgVar.zzal());
            if (b1VarZzcg == null || TextUtils.isEmpty(strZzch)) {
                arrayMap = null;
            } else {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put("If-Modified-Since", strZzch);
                arrayMap = arrayMap2;
            }
            this.zzatv = true;
            zzaw zzawVarZzlt = zzlt();
            String strZzal = zzgVar.zzal();
            zzfr zzfrVar = new zzfr(this);
            zzawVarZzlt.zzaf();
            zzawVarZzlt.zzcl();
            p.u7(url);
            p.u7(zzfrVar);
            zzawVarZzlt.zzgs().zzd(new zzba(zzawVarZzlt, strZzal, url, null, arrayMap, zzfrVar));
        } catch (MalformedURLException unused) {
            this.zzada.zzgt().zzjg().zze("Failed to parse config URL. Not fetching. appId", zzas.zzbw(zzgVar.zzal()), string);
        }
    }

    private final zzk zzcr(String str) {
        zzg zzgVarZzbm = zzjt().zzbm(str);
        if (zzgVarZzbm == null || TextUtils.isEmpty(zzgVarZzbm.zzak())) {
            this.zzada.zzgt().zzjn().zzg("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzc = zzc(zzgVarZzbm);
        if (boolZzc == null || boolZzc.booleanValue()) {
            return new zzk(str, zzgVarZzbm.getGmpAppId(), zzgVarZzbm.zzak(), zzgVarZzbm.zzhf(), zzgVarZzbm.zzhg(), zzgVarZzbm.zzhh(), zzgVarZzbm.zzhi(), (String) null, zzgVarZzbm.isMeasurementEnabled(), false, zzgVarZzbm.getFirebaseInstanceId(), zzgVarZzbm.zzhv(), 0L, 0, zzgVarZzbm.zzhw(), zzgVarZzbm.zzhx(), false, zzgVarZzbm.zzhb());
        }
        this.zzada.zzgt().zzjg().zzg("App version does not match; dropping. appId", zzas.zzbw(str));
        return null;
    }

    private final zzbq zzls() {
        zza(this.zzath);
        return this.zzath;
    }

    private final zzbb zzlu() {
        zzbb zzbbVar = this.zzatk;
        if (zzbbVar != null) {
            return zzbbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzfk zzlv() {
        zza(this.zzatl);
        return this.zzatl;
    }

    private final long zzly() {
        long jJ6 = this.zzada.zzbx().j6();
        zzbd zzbdVarZzgu = this.zzada.zzgu();
        zzbdVarZzgu.zzcl();
        zzbdVarZzgu.zzaf();
        long jNextInt = zzbdVarZzgu.zzane.get();
        if (jNextInt == 0) {
            jNextInt = 1 + zzbdVarZzgu.zzgr().zzmk().nextInt(86400000);
            zzbdVarZzgu.zzane.set(jNextInt);
        }
        return ((((jJ6 + jNextInt) / 1000) / 60) / 60) / 24;
    }

    private final boolean zzma() {
        zzaf();
        zzlx();
        return zzjt().zzim() || !TextUtils.isEmpty(zzjt().zzih());
    }

    private final void zzmb() {
        long jMax;
        long jMax2;
        zzaf();
        zzlx();
        if (zzmf() || this.zzada.zzgv().zza(zzai.zzald)) {
            if (this.zzatr > 0) {
                long jAbs = 3600000 - Math.abs(this.zzada.zzbx().DW() - this.zzatr);
                if (jAbs > 0) {
                    this.zzada.zzgt().zzjo().zzg("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                    zzlu().unregister();
                    zzlv().cancel();
                    return;
                }
                this.zzatr = 0L;
            }
            if (!this.zzada.zzkv() || !zzma()) {
                this.zzada.zzgt().zzjo().zzby("Nothing to upload or uploading impossible");
                zzlu().unregister();
                zzlv().cancel();
                return;
            }
            long jJ6 = this.zzada.zzbx().j6();
            long jMax3 = Math.max(0L, zzai.zzaju.get().longValue());
            boolean z = zzjt().zzin() || zzjt().zzii();
            if (z) {
                String strZzid = this.zzada.zzgv().zzid();
                jMax = (TextUtils.isEmpty(strZzid) || ".none.".equals(strZzid)) ? Math.max(0L, zzai.zzajo.get().longValue()) : Math.max(0L, zzai.zzajp.get().longValue());
            } else {
                jMax = Math.max(0L, zzai.zzajn.get().longValue());
            }
            long j = this.zzada.zzgu().zzana.get();
            long j2 = this.zzada.zzgu().zzanb.get();
            long j3 = jMax;
            long jMax4 = Math.max(zzjt().zzik(), zzjt().zzil());
            if (jMax4 == 0) {
                jMax2 = 0;
            } else {
                long jAbs2 = jJ6 - Math.abs(jMax4 - jJ6);
                long jAbs3 = jJ6 - Math.abs(j - jJ6);
                long jAbs4 = jJ6 - Math.abs(j2 - jJ6);
                long jMax5 = Math.max(jAbs3, jAbs4);
                jMax2 = jAbs2 + jMax3;
                if (z && jMax5 > 0) {
                    jMax2 = Math.min(jAbs2, jMax5) + j3;
                }
                if (!zzjr().zzb(jMax5, j3)) {
                    jMax2 = jMax5 + j3;
                }
                if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                    for (int i = 0; i < Math.min(20, Math.max(0, zzai.zzajw.get().intValue())); i++) {
                        jMax2 += Math.max(0L, zzai.zzajv.get().longValue()) * (1 << i);
                        if (jMax2 > jAbs4) {
                            break;
                        }
                    }
                    jMax2 = 0;
                }
            }
            if (jMax2 == 0) {
                this.zzada.zzgt().zzjo().zzby("Next upload time is 0");
                zzlu().unregister();
                zzlv().cancel();
                return;
            }
            if (!zzlt().zzfb()) {
                this.zzada.zzgt().zzjo().zzby("No network");
                zzlu().zzey();
                zzlv().cancel();
                return;
            }
            long j4 = this.zzada.zzgu().zzanc.get();
            long jMax6 = Math.max(0L, zzai.zzajl.get().longValue());
            if (!zzjr().zzb(j4, jMax6)) {
                jMax2 = Math.max(jMax2, j4 + jMax6);
            }
            zzlu().unregister();
            long jJ62 = jMax2 - this.zzada.zzbx().j6();
            if (jJ62 <= 0) {
                jJ62 = Math.max(0L, zzai.zzajq.get().longValue());
                this.zzada.zzgu().zzana.set(this.zzada.zzbx().j6());
            }
            this.zzada.zzgt().zzjo().zzg("Upload scheduled in approximately ms", Long.valueOf(jJ62));
            zzlv().zzh(jJ62);
        }
    }

    private final void zzmc() {
        zzaf();
        if (this.zzatv || this.zzatw || this.zzatx) {
            this.zzada.zzgt().zzjo().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzatv), Boolean.valueOf(this.zzatw), Boolean.valueOf(this.zzatx));
            return;
        }
        this.zzada.zzgt().zzjo().zzby("Stopping uploading service(s)");
        List<Runnable> list = this.zzats;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.zzats.clear();
    }

    private final boolean zzmd() throws IOException {
        zzaf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzada.getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzatz = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzaty = fileLockTryLock;
            if (fileLockTryLock != null) {
                this.zzada.zzgt().zzjo().zzby("Storage concurrent access okay");
                return true;
            }
            this.zzada.zzgt().zzjg().zzby("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.zzada.zzgt().zzjg().zzg("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            this.zzada.zzgt().zzjg().zzg("Failed to access storage lock file", e2);
            return false;
        }
    }

    private final boolean zzmf() {
        zzaf();
        zzlx();
        return this.zzatp;
    }

    public static zzfo zzn(Context context) {
        p.u7(context);
        p.u7(context.getApplicationContext());
        if (zzatg == null) {
            synchronized (zzfo.class) {
                if (zzatg == null) {
                    zzatg = new zzfo(new zzft(context));
                }
            }
        }
        return zzatg;
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final Context getContext() {
        return this.zzada.getContext();
    }

    protected final void start() {
        this.zzada.zzgs().zzaf();
        zzjt().zzij();
        if (this.zzada.zzgu().zzana.get() == 0) {
            this.zzada.zzgu().zzana.set(this.zzada.zzbx().j6());
        }
        zzmb();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final e zzbx() {
        return this.zzada.zzbx();
    }

    final void zzc(zzag zzagVar, zzk zzkVar) throws NoSuchAlgorithmException {
        List<zzo> listZzb;
        List<zzo> listZzb2;
        List<zzo> listZzb3;
        p.u7(zzkVar);
        p.v5(zzkVar.packageName);
        zzaf();
        zzlx();
        String str = zzkVar.packageName;
        long j = zzagVar.zzaig;
        if (zzjr().zze(zzagVar, zzkVar)) {
            if (!zzkVar.zzafr) {
                zzg(zzkVar);
                return;
            }
            zzjt().beginTransaction();
            try {
                zzt zztVarZzjt = zzjt();
                p.v5(str);
                zztVarZzjt.zzaf();
                zztVarZzjt.zzcl();
                if (j < 0) {
                    zztVarZzjt.zzgt().zzjj().zze("Invalid time querying timed out conditional properties", zzas.zzbw(str), Long.valueOf(j));
                    listZzb = Collections.emptyList();
                } else {
                    listZzb = zztVarZzjt.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzo zzoVar : listZzb) {
                    if (zzoVar != null) {
                        this.zzada.zzgt().zzjn().zzd("User property timed out", zzoVar.packageName, this.zzada.zzgq().zzbv(zzoVar.zzags.name), zzoVar.zzags.getValue());
                        if (zzoVar.zzagt != null) {
                            zzd(new zzag(zzoVar.zzagt, j), zzkVar);
                        }
                        zzjt().zzk(str, zzoVar.zzags.name);
                    }
                }
                zzt zztVarZzjt2 = zzjt();
                p.v5(str);
                zztVarZzjt2.zzaf();
                zztVarZzjt2.zzcl();
                if (j < 0) {
                    zztVarZzjt2.zzgt().zzjj().zze("Invalid time querying expired conditional properties", zzas.zzbw(str), Long.valueOf(j));
                    listZzb2 = Collections.emptyList();
                } else {
                    listZzb2 = zztVarZzjt2.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzb2.size());
                for (zzo zzoVar2 : listZzb2) {
                    if (zzoVar2 != null) {
                        this.zzada.zzgt().zzjn().zzd("User property expired", zzoVar2.packageName, this.zzada.zzgq().zzbv(zzoVar2.zzags.name), zzoVar2.zzags.getValue());
                        zzjt().zzh(str, zzoVar2.zzags.name);
                        if (zzoVar2.zzagv != null) {
                            arrayList.add(zzoVar2.zzagv);
                        }
                        zzjt().zzk(str, zzoVar2.zzags.name);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zzd(new zzag((zzag) obj, j), zzkVar);
                }
                zzt zztVarZzjt3 = zzjt();
                String str2 = zzagVar.name;
                p.v5(str);
                p.v5(str2);
                zztVarZzjt3.zzaf();
                zztVarZzjt3.zzcl();
                if (j < 0) {
                    zztVarZzjt3.zzgt().zzjj().zzd("Invalid time querying triggered conditional properties", zzas.zzbw(str), zztVarZzjt3.zzgq().zzbt(str2), Long.valueOf(j));
                    listZzb3 = Collections.emptyList();
                } else {
                    listZzb3 = zztVarZzjt3.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzb3.size());
                for (zzo zzoVar3 : listZzb3) {
                    if (zzoVar3 != null) {
                        zzfv zzfvVar = zzoVar3.zzags;
                        zzfx zzfxVar = new zzfx(zzoVar3.packageName, zzoVar3.origin, zzfvVar.name, j, zzfvVar.getValue());
                        if (zzjt().zza(zzfxVar)) {
                            this.zzada.zzgt().zzjn().zzd("User property triggered", zzoVar3.packageName, this.zzada.zzgq().zzbv(zzfxVar.name), zzfxVar.value);
                        } else {
                            this.zzada.zzgt().zzjg().zzd("Too many active user properties, ignoring", zzas.zzbw(zzoVar3.packageName), this.zzada.zzgq().zzbv(zzfxVar.name), zzfxVar.value);
                        }
                        if (zzoVar3.zzagu != null) {
                            arrayList2.add(zzoVar3.zzagu);
                        }
                        zzoVar3.zzags = new zzfv(zzfxVar);
                        zzoVar3.active = true;
                        zzjt().zza(zzoVar3);
                    }
                }
                zzd(zzagVar, zzkVar);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    zzd(new zzag((zzag) obj2, j), zzkVar);
                }
                zzjt().setTransactionSuccessful();
            } finally {
                zzjt().endTransaction();
            }
        }
    }

    final void zzd(zzag zzagVar, String str) throws NoSuchAlgorithmException {
        zzg zzgVarZzbm = zzjt().zzbm(str);
        if (zzgVarZzbm == null || TextUtils.isEmpty(zzgVarZzbm.zzak())) {
            this.zzada.zzgt().zzjn().zzg("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzc = zzc(zzgVarZzbm);
        if (boolZzc == null) {
            if (!"_ui".equals(zzagVar.name)) {
                this.zzada.zzgt().zzjj().zzg("Could not find package. appId", zzas.zzbw(str));
            }
        } else if (!boolZzc.booleanValue()) {
            this.zzada.zzgt().zzjg().zzg("App version does not match; dropping event. appId", zzas.zzbw(str));
            return;
        }
        zzc(zzagVar, new zzk(str, zzgVarZzbm.getGmpAppId(), zzgVarZzbm.zzak(), zzgVarZzbm.zzhf(), zzgVarZzbm.zzhg(), zzgVarZzbm.zzhh(), zzgVarZzbm.zzhi(), (String) null, zzgVarZzbm.isMeasurementEnabled(), false, zzgVarZzbm.getFirebaseInstanceId(), zzgVarZzbm.zzhv(), 0L, 0, zzgVarZzbm.zzhw(), zzgVarZzbm.zzhx(), false, zzgVarZzbm.zzhb()));
    }

    final void zze(zzk zzkVar) throws NoSuchAlgorithmException {
        zzaf();
        zzlx();
        p.v5(zzkVar.packageName);
        zzg(zzkVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:145|77|78|(2:149|79)|(1:99)(5:89|(1:91)(1:92)|93|(1:95)(1:96)|97)|147|100|(4:105|(1:107)|108|(1:110))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0321, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0322, code lost:
    
        r22.zzada.zzgt().zzjg().zze("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzas.zzbw(r23.packageName), r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x033a A[Catch: all -> 0x0451, TryCatch #1 {all -> 0x0451, blocks: (B:26:0x00a0, B:28:0x00ac, B:30:0x00c3, B:31:0x00eb, B:33:0x0135, B:36:0x0148, B:39:0x015c, B:42:0x0169, B:44:0x0173, B:51:0x01cd, B:53:0x01d2, B:58:0x01f1, B:61:0x0207, B:63:0x0233, B:64:0x0241, B:66:0x026e, B:68:0x0276, B:70:0x0284, B:72:0x0288, B:73:0x028b, B:75:0x0297, B:111:0x034c, B:113:0x0367, B:114:0x036a, B:126:0x03e3, B:128:0x03f3, B:130:0x0409, B:131:0x040e, B:135:0x0442, B:77:0x02ae, B:79:0x02bb, B:87:0x02dc, B:89:0x02e4, B:91:0x02ec, B:93:0x02f2, B:97:0x02fc, B:100:0x0310, B:105:0x033a, B:107:0x0340, B:108:0x0343, B:110:0x0349, B:103:0x0322, B:85:0x02c4, B:117:0x0385, B:119:0x03b7, B:120:0x03ba, B:122:0x03c8, B:124:0x03cc, B:125:0x03cf, B:132:0x0423, B:134:0x0429, B:55:0x01e1, B:45:0x0196, B:47:0x019e, B:49:0x01aa), top: B:143:0x00a0, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0367 A[Catch: all -> 0x0451, TryCatch #1 {all -> 0x0451, blocks: (B:26:0x00a0, B:28:0x00ac, B:30:0x00c3, B:31:0x00eb, B:33:0x0135, B:36:0x0148, B:39:0x015c, B:42:0x0169, B:44:0x0173, B:51:0x01cd, B:53:0x01d2, B:58:0x01f1, B:61:0x0207, B:63:0x0233, B:64:0x0241, B:66:0x026e, B:68:0x0276, B:70:0x0284, B:72:0x0288, B:73:0x028b, B:75:0x0297, B:111:0x034c, B:113:0x0367, B:114:0x036a, B:126:0x03e3, B:128:0x03f3, B:130:0x0409, B:131:0x040e, B:135:0x0442, B:77:0x02ae, B:79:0x02bb, B:87:0x02dc, B:89:0x02e4, B:91:0x02ec, B:93:0x02f2, B:97:0x02fc, B:100:0x0310, B:105:0x033a, B:107:0x0340, B:108:0x0343, B:110:0x0349, B:103:0x0322, B:85:0x02c4, B:117:0x0385, B:119:0x03b7, B:120:0x03ba, B:122:0x03c8, B:124:0x03cc, B:125:0x03cf, B:132:0x0423, B:134:0x0429, B:55:0x01e1, B:45:0x0196, B:47:0x019e, B:49:0x01aa), top: B:143:0x00a0, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f3 A[Catch: all -> 0x0451, TryCatch #1 {all -> 0x0451, blocks: (B:26:0x00a0, B:28:0x00ac, B:30:0x00c3, B:31:0x00eb, B:33:0x0135, B:36:0x0148, B:39:0x015c, B:42:0x0169, B:44:0x0173, B:51:0x01cd, B:53:0x01d2, B:58:0x01f1, B:61:0x0207, B:63:0x0233, B:64:0x0241, B:66:0x026e, B:68:0x0276, B:70:0x0284, B:72:0x0288, B:73:0x028b, B:75:0x0297, B:111:0x034c, B:113:0x0367, B:114:0x036a, B:126:0x03e3, B:128:0x03f3, B:130:0x0409, B:131:0x040e, B:135:0x0442, B:77:0x02ae, B:79:0x02bb, B:87:0x02dc, B:89:0x02e4, B:91:0x02ec, B:93:0x02f2, B:97:0x02fc, B:100:0x0310, B:105:0x033a, B:107:0x0340, B:108:0x0343, B:110:0x0349, B:103:0x0322, B:85:0x02c4, B:117:0x0385, B:119:0x03b7, B:120:0x03ba, B:122:0x03c8, B:124:0x03cc, B:125:0x03cf, B:132:0x0423, B:134:0x0429, B:55:0x01e1, B:45:0x0196, B:47:0x019e, B:49:0x01aa), top: B:143:0x00a0, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zzf(com.google.android.gms.measurement.internal.zzk r23) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zzf(com.google.android.gms.measurement.internal.zzk):void");
    }

    final void zzg(Runnable runnable) {
        zzaf();
        if (this.zzats == null) {
            this.zzats = new ArrayList();
        }
        this.zzats.add(runnable);
    }

    public final zzaq zzgq() {
        return this.zzada.zzgq();
    }

    public final zzfy zzgr() {
        return this.zzada.zzgr();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final zzbr zzgs() {
        return this.zzada.zzgs();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final zzas zzgt() {
        return this.zzada.zzgt();
    }

    public final zzq zzgv() {
        return this.zzada.zzgv();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final zzn zzgw() {
        return this.zzada.zzgw();
    }

    final String zzh(zzk zzkVar) {
        try {
            return (String) this.zzada.zzgs().zzb(new zzfs(this, zzkVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzada.zzgt().zzjg().zze("Failed to get app instance id. appId", zzas.zzbw(zzkVar.packageName), e);
            return null;
        }
    }

    public final zzfu zzjr() {
        zza(this.zzatn);
        return this.zzatn;
    }

    public final zzm zzjs() {
        zza(this.zzatm);
        return this.zzatm;
    }

    public final zzt zzjt() {
        zza(this.zzatj);
        return this.zzatj;
    }

    public final zzaw zzlt() {
        zza(this.zzati);
        return this.zzati;
    }

    public final zzdv zzlw() {
        zza(this.zzato);
        return this.zzato;
    }

    final void zzlx() {
        if (!this.zzvz) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzlz() {
        zzg zzgVarZzbm;
        String str;
        zzaf();
        zzlx();
        this.zzatx = true;
        try {
            this.zzada.zzgw();
            Boolean boolZzli = this.zzada.zzgl().zzli();
            if (boolZzli == null) {
                this.zzada.zzgt().zzjj().zzby("Upload data called on the client side before use of service was decided");
                return;
            }
            if (boolZzli.booleanValue()) {
                this.zzada.zzgt().zzjg().zzby("Upload called in the client side when service should be used");
                return;
            }
            if (this.zzatr > 0) {
                zzmb();
                return;
            }
            zzaf();
            if (this.zzaua != null) {
                this.zzada.zzgt().zzjo().zzby("Uploading requested multiple times");
                return;
            }
            if (!zzlt().zzfb()) {
                this.zzada.zzgt().zzjo().zzby("Network not connected, ignoring upload request");
                zzmb();
                return;
            }
            long jJ6 = this.zzada.zzbx().j6();
            zzd((String) null, jJ6 - zzq.zzic());
            long j = this.zzada.zzgu().zzana.get();
            if (j != 0) {
                this.zzada.zzgt().zzjn().zzg("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jJ6 - j)));
            }
            String strZzih = zzjt().zzih();
            if (TextUtils.isEmpty(strZzih)) {
                this.zzauc = -1L;
                String strZzad = zzjt().zzad(jJ6 - zzq.zzic());
                if (!TextUtils.isEmpty(strZzad) && (zzgVarZzbm = zzjt().zzbm(strZzad)) != null) {
                    zzb(zzgVarZzbm);
                }
            } else {
                if (this.zzauc == -1) {
                    this.zzauc = zzjt().zzio();
                }
                List<Pair<i1, Long>> listZzb = zzjt().zzb(strZzih, this.zzada.zzgv().zzb(strZzih, zzai.zzaja), Math.max(0, this.zzada.zzgv().zzb(strZzih, zzai.zzajb)));
                if (!listZzb.isEmpty()) {
                    Iterator<Pair<i1, Long>> it = listZzb.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = null;
                            break;
                        }
                        i1 i1Var = (i1) it.next().first;
                        if (!TextUtils.isEmpty(i1Var.U2)) {
                            str = i1Var.U2;
                            break;
                        }
                    }
                    if (str != null) {
                        int i = 0;
                        while (true) {
                            if (i >= listZzb.size()) {
                                break;
                            }
                            i1 i1Var2 = (i1) listZzb.get(i).first;
                            if (!TextUtils.isEmpty(i1Var2.U2) && !i1Var2.U2.equals(str)) {
                                listZzb = listZzb.subList(0, i);
                                break;
                            }
                            i++;
                        }
                    }
                    h1 h1Var = new h1();
                    h1Var.FH = new i1[listZzb.size()];
                    ArrayList arrayList = new ArrayList(listZzb.size());
                    boolean z = zzq.zzie() && this.zzada.zzgv().zzas(strZzih);
                    for (int i2 = 0; i2 < h1Var.FH.length; i2++) {
                        h1Var.FH[i2] = (i1) listZzb.get(i2).first;
                        arrayList.add((Long) listZzb.get(i2).second);
                        h1Var.FH[i2].Mr = Long.valueOf(this.zzada.zzgv().zzhh());
                        h1Var.FH[i2].Zo = Long.valueOf(jJ6);
                        i1 i1Var3 = h1Var.FH[i2];
                        this.zzada.zzgw();
                        i1Var3.BT = Boolean.FALSE;
                        if (!z) {
                            h1Var.FH[i2].sh = null;
                        }
                    }
                    String strZzb = this.zzada.zzgt().isLoggable(2) ? zzjr().zzb(h1Var) : null;
                    byte[] bArrZza = zzjr().zza(h1Var);
                    String str2 = zzai.zzajk.get();
                    try {
                        URL url = new URL(str2);
                        p.j6(!arrayList.isEmpty());
                        if (this.zzaua != null) {
                            this.zzada.zzgt().zzjg().zzby("Set uploading progress before finishing the previous upload");
                        } else {
                            this.zzaua = new ArrayList(arrayList);
                        }
                        this.zzada.zzgu().zzanb.set(jJ6);
                        this.zzada.zzgt().zzjo().zzd("Uploading data. app, uncompressed size, data", h1Var.FH.length > 0 ? h1Var.FH[0].XL : "?", Integer.valueOf(bArrZza.length), strZzb);
                        this.zzatw = true;
                        zzaw zzawVarZzlt = zzlt();
                        zzfq zzfqVar = new zzfq(this, strZzih);
                        zzawVarZzlt.zzaf();
                        zzawVarZzlt.zzcl();
                        p.u7(url);
                        p.u7(bArrZza);
                        p.u7(zzfqVar);
                        zzawVarZzlt.zzgs().zzd(new zzba(zzawVarZzlt, strZzih, url, bArrZza, null, zzfqVar));
                    } catch (MalformedURLException unused) {
                        this.zzada.zzgt().zzjg().zze("Failed to parse upload URL. Not uploading. appId", zzas.zzbw(strZzih), str2);
                    }
                }
            }
        } finally {
            this.zzatx = false;
            zzmc();
        }
    }

    final void zzm(boolean z) {
        zzmb();
    }

    final void zzme() {
        zzaf();
        zzlx();
        if (!this.zzatq) {
            this.zzatq = true;
            zzaf();
            zzlx();
            if ((this.zzada.zzgv().zza(zzai.zzald) || zzmf()) && zzmd()) {
                int iZza = zza(this.zzatz);
                int iZzjd = this.zzada.zzgk().zzjd();
                zzaf();
                if (iZza > iZzjd) {
                    this.zzada.zzgt().zzjg().zze("Panic: can't downgrade version. Previous, current version", Integer.valueOf(iZza), Integer.valueOf(iZzjd));
                } else if (iZza < iZzjd) {
                    if (zza(iZzjd, this.zzatz)) {
                        this.zzada.zzgt().zzjo().zze("Storage version upgraded. Previous, current version", Integer.valueOf(iZza), Integer.valueOf(iZzjd));
                    } else {
                        this.zzada.zzgt().zzjg().zze("Storage version upgrade failed. Previous, current version", Integer.valueOf(iZza), Integer.valueOf(iZzjd));
                    }
                }
            }
        }
        if (this.zzatp || this.zzada.zzgv().zza(zzai.zzald)) {
            return;
        }
        this.zzada.zzgt().zzjm().zzby("This instance being marked as an uploader");
        this.zzatp = true;
        zzmb();
    }

    final void zzmg() {
        this.zzatu++;
    }

    final zzbw zzmh() {
        return this.zzada;
    }

    private zzfo(zzft zzftVar, zzbw zzbwVar) {
        this.zzvz = false;
        p.u7(zzftVar);
        this.zzada = zzbw.zza(zzftVar.zzri, (zzan) null);
        this.zzauc = -1L;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.zzq();
        this.zzatn = zzfuVar;
        zzaw zzawVar = new zzaw(this);
        zzawVar.zzq();
        this.zzati = zzawVar;
        zzbq zzbqVar = new zzbq(this);
        zzbqVar.zzq();
        this.zzath = zzbqVar;
        this.zzada.zzgs().zzc(new zzfp(this, zzftVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzg zzg(com.google.android.gms.measurement.internal.zzk r9) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zzg(com.google.android.gms.measurement.internal.zzk):com.google.android.gms.measurement.internal.zzg");
    }

    final void zze(zzo zzoVar) throws NoSuchAlgorithmException {
        zzk zzkVarZzcr = zzcr(zzoVar.packageName);
        if (zzkVarZzcr != null) {
            zzb(zzoVar, zzkVarZzcr);
        }
    }

    private static void zza(zzfn zzfnVar) {
        if (zzfnVar != null) {
            if (zzfnVar.isInitialized()) {
                return;
            }
            String strValueOf = String.valueOf(zzfnVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Upload Component not created");
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0791 A[Catch: all -> 0x0803, TryCatch #0 {all -> 0x0803, blocks: (B:31:0x0106, B:34:0x0115, B:81:0x02ab, B:83:0x02e9, B:85:0x02ee, B:86:0x0307, B:90:0x0318, B:92:0x032e, B:94:0x0333, B:95:0x034e, B:101:0x0375, B:105:0x039b, B:106:0x03b4, B:110:0x03c4, B:113:0x03e7, B:114:0x0403, B:116:0x0411, B:118:0x041b, B:120:0x0427, B:122:0x042d, B:123:0x0438, B:125:0x0444, B:126:0x045b, B:128:0x0482, B:131:0x0492, B:134:0x04ce, B:136:0x04f6, B:140:0x0547, B:144:0x0569, B:146:0x057b, B:147:0x0585, B:149:0x0593, B:151:0x059d, B:153:0x05a1, B:165:0x060b, B:167:0x065a, B:169:0x0660, B:170:0x0662, B:172:0x066e, B:173:0x06d0, B:174:0x06ef, B:176:0x06f5, B:178:0x0728, B:179:0x0730, B:181:0x0738, B:182:0x073e, B:184:0x0744, B:193:0x078b, B:195:0x0791, B:198:0x07aa, B:200:0x07be, B:187:0x0752, B:189:0x0776, B:197:0x0795, B:154:0x05ae, B:156:0x05c0, B:158:0x05c4, B:160:0x05d6, B:164:0x0609, B:161:0x05ee, B:163:0x05f4, B:143:0x0563, B:139:0x0540, B:135:0x04e8, B:38:0x0124, B:41:0x0136, B:43:0x014d, B:49:0x0169, B:52:0x0195, B:54:0x019b, B:56:0x01a9, B:58:0x01b5, B:60:0x01bf, B:62:0x01ca, B:65:0x01d1, B:72:0x025a, B:74:0x0264, B:78:0x029c, B:66:0x01fb, B:67:0x021a, B:71:0x0243, B:70:0x0232, B:59:0x01ba, B:50:0x016e, B:51:0x018b), top: B:207:0x0106, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029c A[Catch: all -> 0x0803, TRY_LEAVE, TryCatch #0 {all -> 0x0803, blocks: (B:31:0x0106, B:34:0x0115, B:81:0x02ab, B:83:0x02e9, B:85:0x02ee, B:86:0x0307, B:90:0x0318, B:92:0x032e, B:94:0x0333, B:95:0x034e, B:101:0x0375, B:105:0x039b, B:106:0x03b4, B:110:0x03c4, B:113:0x03e7, B:114:0x0403, B:116:0x0411, B:118:0x041b, B:120:0x0427, B:122:0x042d, B:123:0x0438, B:125:0x0444, B:126:0x045b, B:128:0x0482, B:131:0x0492, B:134:0x04ce, B:136:0x04f6, B:140:0x0547, B:144:0x0569, B:146:0x057b, B:147:0x0585, B:149:0x0593, B:151:0x059d, B:153:0x05a1, B:165:0x060b, B:167:0x065a, B:169:0x0660, B:170:0x0662, B:172:0x066e, B:173:0x06d0, B:174:0x06ef, B:176:0x06f5, B:178:0x0728, B:179:0x0730, B:181:0x0738, B:182:0x073e, B:184:0x0744, B:193:0x078b, B:195:0x0791, B:198:0x07aa, B:200:0x07be, B:187:0x0752, B:189:0x0776, B:197:0x0795, B:154:0x05ae, B:156:0x05c0, B:158:0x05c4, B:160:0x05d6, B:164:0x0609, B:161:0x05ee, B:163:0x05f4, B:143:0x0563, B:139:0x0540, B:135:0x04e8, B:38:0x0124, B:41:0x0136, B:43:0x014d, B:49:0x0169, B:52:0x0195, B:54:0x019b, B:56:0x01a9, B:58:0x01b5, B:60:0x01bf, B:62:0x01ca, B:65:0x01d1, B:72:0x025a, B:74:0x0264, B:78:0x029c, B:66:0x01fb, B:67:0x021a, B:71:0x0243, B:70:0x0232, B:59:0x01ba, B:50:0x016e, B:51:0x018b), top: B:207:0x0106, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzd(com.google.android.gms.measurement.internal.zzag r27, com.google.android.gms.measurement.internal.zzk r28) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zzd(com.google.android.gms.measurement.internal.zzag, com.google.android.gms.measurement.internal.zzk):void");
    }

    private final boolean zza(f1 f1Var, f1 f1Var2) {
        Long l;
        p.j6("_e".equals(f1Var.Hw));
        zzjr();
        g1 g1VarZza = zzfu.zza(f1Var, "_sc");
        String str = g1VarZza == null ? null : g1VarZza.Hw;
        zzjr();
        g1 g1VarZza2 = zzfu.zza(f1Var2, "_pc");
        String str2 = g1VarZza2 != null ? g1VarZza2.Hw : null;
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        zzjr();
        g1 g1VarZza3 = zzfu.zza(f1Var, "_et");
        Long l2 = g1VarZza3.v5;
        if (l2 != null && l2.longValue() > 0) {
            long jLongValue = g1VarZza3.v5.longValue();
            zzjr();
            g1 g1VarZza4 = zzfu.zza(f1Var2, "_et");
            if (g1VarZza4 != null && (l = g1VarZza4.v5) != null && l.longValue() > 0) {
                jLongValue += g1VarZza4.v5.longValue();
            }
            zzjr();
            f1Var2.FH = zzfu.zza(f1Var2.FH, "_et", Long.valueOf(jLongValue));
            zzjr();
            f1Var.FH = zzfu.zza(f1Var.FH, "_fr", (Object) 1L);
        }
        return true;
    }

    final void zzb(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        zzaf();
        zzlx();
        p.v5(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzatv = false;
                zzmc();
            }
        }
        this.zzada.zzgt().zzjo().zzg("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        zzjt().beginTransaction();
        try {
            zzg zzgVarZzbm = zzjt().zzbm(str);
            boolean z = true;
            boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
            if (zzgVarZzbm == null) {
                this.zzada.zzgt().zzjj().zzg("App does not exist in onConfigFetched. appId", zzas.zzbw(str));
            } else if (!z2 && i != 404) {
                zzgVarZzbm.zzv(this.zzada.zzbx().j6());
                zzjt().zza(zzgVarZzbm);
                this.zzada.zzgt().zzjo().zze("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzls().zzci(str);
                this.zzada.zzgu().zzanb.set(this.zzada.zzbx().j6());
                if (i != 503 && i != 429) {
                    z = false;
                }
                if (z) {
                    this.zzada.zzgu().zzanc.set(this.zzada.zzbx().j6());
                }
                zzmb();
            } else {
                List<String> list = map != null ? map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i != 404 && i != 304) {
                    if (!zzls().zza(str, bArr, str2)) {
                        return;
                    }
                } else if (zzls().zzcg(str) == null && !zzls().zza(str, null, null)) {
                    return;
                }
                zzgVarZzbm.zzu(this.zzada.zzbx().j6());
                zzjt().zza(zzgVarZzbm);
                if (i == 404) {
                    this.zzada.zzgt().zzjl().zzg("Config not found. Using empty config. appId", str);
                } else {
                    this.zzada.zzgt().zzjo().zze("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (zzlt().zzfb() && zzma()) {
                    zzlz();
                } else {
                    zzmb();
                }
            }
            zzjt().setTransactionSuccessful();
        } finally {
            zzjt().endTransaction();
        }
    }

    private static g1[] zza(g1[] g1VarArr, String str) {
        int i = 0;
        while (true) {
            if (i >= g1VarArr.length) {
                i = -1;
                break;
            }
            if (str.equals(g1VarArr[i].FH)) {
                break;
            }
            i++;
        }
        return i < 0 ? g1VarArr : zza(g1VarArr, i);
    }

    private static g1[] zza(g1[] g1VarArr, int i) {
        int length = g1VarArr.length - 1;
        g1[] g1VarArr2 = new g1[length];
        if (i > 0) {
            System.arraycopy(g1VarArr, 0, g1VarArr2, 0, i);
        }
        if (i < length) {
            System.arraycopy(g1VarArr, i + 1, g1VarArr2, i, length - i);
        }
        return g1VarArr2;
    }

    private static g1[] zza(g1[] g1VarArr, int i, String str) {
        for (g1 g1Var : g1VarArr) {
            if ("_err".equals(g1Var.FH)) {
                return g1VarArr;
            }
        }
        int length = g1VarArr.length + 2;
        g1[] g1VarArr2 = new g1[length];
        System.arraycopy(g1VarArr, 0, g1VarArr2, 0, g1VarArr.length);
        g1 g1Var2 = new g1();
        g1Var2.FH = "_err";
        g1Var2.v5 = Long.valueOf(i);
        g1 g1Var3 = new g1();
        g1Var3.FH = "_ev";
        g1Var3.Hw = str;
        g1VarArr2[length - 2] = g1Var2;
        g1VarArr2[length - 1] = g1Var3;
        return g1VarArr2;
    }

    final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzt zztVarZzjt;
        long jLongValue;
        zzaf();
        zzlx();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzatw = false;
                zzmc();
            }
        }
        List<Long> list = this.zzaua;
        this.zzaua = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.zzada.zzgu().zzana.set(this.zzada.zzbx().j6());
                this.zzada.zzgu().zzanb.set(0L);
                zzmb();
                this.zzada.zzgt().zzjo().zze("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzjt().beginTransaction();
                try {
                    for (Long l : list) {
                        try {
                            zztVarZzjt = zzjt();
                            jLongValue = l.longValue();
                            zztVarZzjt.zzaf();
                            zztVarZzjt.zzcl();
                            try {
                            } catch (SQLiteException e) {
                                zztVarZzjt.zzgt().zzjg().zzg("Failed to delete a bundle in a queue table", e);
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            if (this.zzaub == null || !this.zzaub.contains(l)) {
                                throw e2;
                            }
                        }
                        if (zztVarZzjt.getWritableDatabase().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    zzjt().setTransactionSuccessful();
                    zzjt().endTransaction();
                    this.zzaub = null;
                    if (zzlt().zzfb() && zzma()) {
                        zzlz();
                    } else {
                        this.zzauc = -1L;
                        zzmb();
                    }
                    this.zzatr = 0L;
                } catch (Throwable th2) {
                    zzjt().endTransaction();
                    throw th2;
                }
            } catch (SQLiteException e3) {
                this.zzada.zzgt().zzjg().zzg("Database error while trying to delete uploaded bundles", e3);
                this.zzatr = this.zzada.zzbx().DW();
                this.zzada.zzgt().zzjo().zzg("Disable upload, time", Long.valueOf(this.zzatr));
            }
        } else {
            this.zzada.zzgt().zzjo().zze("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzada.zzgu().zzanb.set(this.zzada.zzbx().j6());
            if (i != 503 && i != 429) {
                z = false;
            }
            if (z) {
                this.zzada.zzgu().zzanc.set(this.zzada.zzbx().j6());
            }
            if (this.zzada.zzgv().zzaw(str)) {
                zzjt().zzc(list);
            }
            zzmb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zzb(com.google.android.gms.measurement.internal.zzfv r13, com.google.android.gms.measurement.internal.zzk r14) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zzb(com.google.android.gms.measurement.internal.zzfv, com.google.android.gms.measurement.internal.zzk):void");
    }

    private final Boolean zzc(zzg zzgVar) {
        try {
            if (zzgVar.zzhf() != -2147483648L) {
                if (zzgVar.zzhf() == b.j6(this.zzada.getContext()).v5(zzgVar.zzal(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = b.j6(this.zzada.getContext()).v5(zzgVar.zzal(), 0).versionName;
                if (zzgVar.zzak() != null && zzgVar.zzak().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    final void zzc(zzfv zzfvVar, zzk zzkVar) throws NoSuchAlgorithmException {
        zzaf();
        zzlx();
        if (TextUtils.isEmpty(zzkVar.zzafi) && TextUtils.isEmpty(zzkVar.zzafv)) {
            return;
        }
        if (!zzkVar.zzafr) {
            zzg(zzkVar);
            return;
        }
        this.zzada.zzgt().zzjn().zzg("Removing user property", this.zzada.zzgq().zzbv(zzfvVar.name));
        zzjt().beginTransaction();
        try {
            zzg(zzkVar);
            zzjt().zzh(zzkVar.packageName, zzfvVar.name);
            zzjt().setTransactionSuccessful();
            this.zzada.zzgt().zzjn().zzg("User property removed", this.zzada.zzgq().zzbv(zzfvVar.name));
        } finally {
            zzjt().endTransaction();
        }
    }

    private final int zza(FileChannel fileChannel) throws IOException {
        zzaf();
        if (fileChannel != null && fileChannel.isOpen()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i = fileChannel.read(byteBufferAllocate);
                if (i == 4) {
                    byteBufferAllocate.flip();
                    return byteBufferAllocate.getInt();
                }
                if (i != -1) {
                    this.zzada.zzgt().zzjj().zzg("Unexpected data length. Bytes read", Integer.valueOf(i));
                }
                return 0;
            } catch (IOException e) {
                this.zzada.zzgt().zzjg().zzg("Failed to read from channel", e);
                return 0;
            }
        }
        this.zzada.zzgt().zzjg().zzby("Bad channel to read from");
        return 0;
    }

    final void zzc(zzo zzoVar, zzk zzkVar) throws NoSuchAlgorithmException {
        p.u7(zzoVar);
        p.v5(zzoVar.packageName);
        p.u7(zzoVar.zzags);
        p.v5(zzoVar.zzags.name);
        zzaf();
        zzlx();
        if (TextUtils.isEmpty(zzkVar.zzafi) && TextUtils.isEmpty(zzkVar.zzafv)) {
            return;
        }
        if (!zzkVar.zzafr) {
            zzg(zzkVar);
            return;
        }
        zzjt().beginTransaction();
        try {
            zzg(zzkVar);
            zzo zzoVarZzj = zzjt().zzj(zzoVar.packageName, zzoVar.zzags.name);
            if (zzoVarZzj != null) {
                this.zzada.zzgt().zzjn().zze("Removing conditional user property", zzoVar.packageName, this.zzada.zzgq().zzbv(zzoVar.zzags.name));
                zzjt().zzk(zzoVar.packageName, zzoVar.zzags.name);
                if (zzoVarZzj.active) {
                    zzjt().zzh(zzoVar.packageName, zzoVar.zzags.name);
                }
                if (zzoVar.zzagv != null) {
                    zzd(this.zzada.zzgr().zza(zzoVar.packageName, zzoVar.zzagv.name, zzoVar.zzagv.zzahu != null ? zzoVar.zzagv.zzahu.zziy() : null, zzoVarZzj.origin, zzoVar.zzagv.zzaig, true, false), zzkVar);
                }
            } else {
                this.zzada.zzgt().zzjj().zze("Conditional user property doesn't exist", zzas.zzbw(zzoVar.packageName), this.zzada.zzgq().zzbv(zzoVar.zzags.name));
            }
            zzjt().setTransactionSuccessful();
        } finally {
            zzjt().endTransaction();
        }
    }

    private final boolean zza(int i, FileChannel fileChannel) throws IOException {
        zzaf();
        if (fileChannel != null && fileChannel.isOpen()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.flip();
            try {
                fileChannel.truncate(0L);
                fileChannel.write(byteBufferAllocate);
                fileChannel.force(true);
                if (fileChannel.size() != 4) {
                    this.zzada.zzgt().zzjg().zzg("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
                }
                return true;
            } catch (IOException e) {
                this.zzada.zzgt().zzjg().zzg("Failed to write to channel", e);
                return false;
            }
        }
        this.zzada.zzgt().zzjg().zzby("Bad channel to read from");
        return false;
    }

    private final zzk zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String installerPackageName;
        int i;
        String str4;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.zzada.zzgt().zzjg().zzby("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            installerPackageName = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.zzada.zzgt().zzjg().zzg("Error retrieving installer package name. appId", zzas.zzbw(str));
            installerPackageName = "Unknown";
        }
        if (installerPackageName == null) {
            installerPackageName = "manual_install";
        } else if ("com.android.vending".equals(installerPackageName)) {
            installerPackageName = "";
        }
        String str5 = installerPackageName;
        try {
            PackageInfo packageInfoV5 = b.j6(context).v5(str, 0);
            if (packageInfoV5 != null) {
                CharSequence charSequenceHw = b.j6(context).Hw(str);
                if (!TextUtils.isEmpty(charSequenceHw)) {
                    charSequenceHw.toString();
                }
                String str6 = packageInfoV5.versionName;
                i = packageInfoV5.versionCode;
                str4 = str6;
            } else {
                i = Integer.MIN_VALUE;
                str4 = "Unknown";
            }
            this.zzada.zzgw();
            return new zzk(str, str2, str4, i, str5, this.zzada.zzgv().zzhh(), this.zzada.zzgr().zzd(context, str), (String) null, z, false, "", 0L, this.zzada.zzgv().zzbc(str) ? j : 0L, 0, z2, z3, false, str3);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.zzada.zzgt().zzjg().zze("Error retrieving newly installed package info. appId, appName", zzas.zzbw(str), "Unknown");
            return null;
        }
    }

    final void zzf(zzo zzoVar) throws NoSuchAlgorithmException {
        zzk zzkVarZzcr = zzcr(zzoVar.packageName);
        if (zzkVarZzcr != null) {
            zzc(zzoVar, zzkVarZzcr);
        }
    }

    final void zzb(zzfn zzfnVar) {
        this.zzatt++;
    }

    final void zzb(zzo zzoVar, zzk zzkVar) throws NoSuchAlgorithmException {
        p.u7(zzoVar);
        p.v5(zzoVar.packageName);
        p.u7(zzoVar.origin);
        p.u7(zzoVar.zzags);
        p.v5(zzoVar.zzags.name);
        zzaf();
        zzlx();
        if (TextUtils.isEmpty(zzkVar.zzafi) && TextUtils.isEmpty(zzkVar.zzafv)) {
            return;
        }
        if (!zzkVar.zzafr) {
            zzg(zzkVar);
            return;
        }
        zzo zzoVar2 = new zzo(zzoVar);
        boolean z = false;
        zzoVar2.active = false;
        zzjt().beginTransaction();
        try {
            zzo zzoVarZzj = zzjt().zzj(zzoVar2.packageName, zzoVar2.zzags.name);
            if (zzoVarZzj != null && !zzoVarZzj.origin.equals(zzoVar2.origin)) {
                this.zzada.zzgt().zzjj().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzada.zzgq().zzbv(zzoVar2.zzags.name), zzoVar2.origin, zzoVarZzj.origin);
            }
            if (zzoVarZzj != null && zzoVarZzj.active) {
                zzoVar2.origin = zzoVarZzj.origin;
                zzoVar2.creationTimestamp = zzoVarZzj.creationTimestamp;
                zzoVar2.triggerTimeout = zzoVarZzj.triggerTimeout;
                zzoVar2.triggerEventName = zzoVarZzj.triggerEventName;
                zzoVar2.zzagu = zzoVarZzj.zzagu;
                zzoVar2.active = zzoVarZzj.active;
                zzoVar2.zzags = new zzfv(zzoVar2.zzags.name, zzoVarZzj.zzags.zzauk, zzoVar2.zzags.getValue(), zzoVarZzj.zzags.origin);
            } else if (TextUtils.isEmpty(zzoVar2.triggerEventName)) {
                zzoVar2.zzags = new zzfv(zzoVar2.zzags.name, zzoVar2.creationTimestamp, zzoVar2.zzags.getValue(), zzoVar2.zzags.origin);
                zzoVar2.active = true;
                z = true;
            }
            if (zzoVar2.active) {
                zzfv zzfvVar = zzoVar2.zzags;
                zzfx zzfxVar = new zzfx(zzoVar2.packageName, zzoVar2.origin, zzfvVar.name, zzfvVar.zzauk, zzfvVar.getValue());
                if (zzjt().zza(zzfxVar)) {
                    this.zzada.zzgt().zzjn().zzd("User property updated immediately", zzoVar2.packageName, this.zzada.zzgq().zzbv(zzfxVar.name), zzfxVar.value);
                } else {
                    this.zzada.zzgt().zzjg().zzd("(2)Too many active user properties, ignoring", zzas.zzbw(zzoVar2.packageName), this.zzada.zzgq().zzbv(zzfxVar.name), zzfxVar.value);
                }
                if (z && zzoVar2.zzagu != null) {
                    zzd(new zzag(zzoVar2.zzagu, zzoVar2.creationTimestamp), zzkVar);
                }
            }
            if (zzjt().zza(zzoVar2)) {
                this.zzada.zzgt().zzjn().zzd("Conditional property added", zzoVar2.packageName, this.zzada.zzgq().zzbv(zzoVar2.zzags.name), zzoVar2.zzags.getValue());
            } else {
                this.zzada.zzgt().zzjg().zzd("Too many conditional properties, ignoring", zzas.zzbw(zzoVar2.packageName), this.zzada.zzgq().zzbv(zzoVar2.zzags.name), zzoVar2.zzags.getValue());
            }
            zzjt().setTransactionSuccessful();
        } finally {
            zzjt().endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0266 A[Catch: all -> 0x0d8e, TRY_ENTER, TryCatch #7 {all -> 0x0d8e, blocks: (B:3:0x000b, B:26:0x0088, B:106:0x0269, B:108:0x026d, B:114:0x027b, B:115:0x02aa, B:118:0x02ba, B:121:0x02da, B:123:0x030b, B:129:0x031f, B:131:0x0327, B:307:0x0739, B:133:0x034b, B:136:0x035f, B:164:0x03b9, B:166:0x03bd, B:167:0x03c2, B:172:0x03d3, B:174:0x03df, B:178:0x03f7, B:175:0x03e7, B:177:0x03ef, B:181:0x0402, B:183:0x0440, B:184:0x047c, B:187:0x04b1, B:189:0x04b6, B:191:0x04c2, B:193:0x04cb, B:195:0x04d3, B:196:0x04db, B:197:0x04de, B:199:0x04e3, B:202:0x04ed, B:204:0x0520, B:206:0x053f, B:212:0x0556, B:209:0x054d, B:215:0x055f, B:217:0x0572, B:218:0x057d, B:219:0x0594, B:222:0x05a6, B:223:0x05ab, B:226:0x05b2, B:232:0x05c9, B:229:0x05be, B:235:0x05cf, B:237:0x05d5, B:239:0x05db, B:260:0x062c, B:261:0x0649, B:263:0x064d, B:265:0x065f, B:267:0x066b, B:270:0x0676, B:272:0x068c, B:294:0x06db, B:296:0x06e3, B:298:0x06e7, B:301:0x06ed, B:303:0x06f8, B:304:0x0710, B:305:0x0717, B:306:0x072e, B:278:0x069a, B:280:0x06a5, B:283:0x06b0, B:285:0x06c7, B:244:0x0600, B:246:0x0606, B:250:0x060f, B:252:0x0615, B:255:0x0620, B:143:0x037f, B:146:0x0389, B:149:0x0393, B:312:0x0758, B:314:0x0764, B:316:0x076d, B:325:0x079e, B:318:0x0781, B:320:0x078a, B:322:0x078e, B:324:0x0798, B:326:0x07a1, B:328:0x07a9, B:330:0x07b5, B:332:0x07c3, B:335:0x07c8, B:337:0x080a, B:338:0x0828, B:340:0x082d, B:342:0x0839, B:346:0x0845, B:349:0x0863, B:343:0x083f, B:336:0x07ed, B:350:0x087b, B:357:0x08c9, B:359:0x08dc, B:361:0x08f0, B:363:0x08f4, B:365:0x08fe, B:366:0x090b, B:368:0x090f, B:370:0x0917, B:371:0x0926, B:382:0x0970, B:384:0x0978, B:386:0x0986, B:388:0x098a, B:403:0x09ba, B:406:0x09cc, B:410:0x09f5, B:412:0x0a05, B:421:0x0a58, B:423:0x0a60, B:425:0x0a64, B:427:0x0a68, B:429:0x0a6c, B:433:0x0a7e, B:435:0x0a9b, B:436:0x0aa4, B:443:0x0acc, B:390:0x0992, B:392:0x0996, B:394:0x099e, B:396:0x09a2, B:399:0x09ac, B:52:0x0131, B:68:0x01cc, B:76:0x0200, B:84:0x0220, B:90:0x0239, B:105:0x0266, B:44:0x00e3, B:55:0x0144), top: B:555:0x000b, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026d A[Catch: all -> 0x0d8e, TryCatch #7 {all -> 0x0d8e, blocks: (B:3:0x000b, B:26:0x0088, B:106:0x0269, B:108:0x026d, B:114:0x027b, B:115:0x02aa, B:118:0x02ba, B:121:0x02da, B:123:0x030b, B:129:0x031f, B:131:0x0327, B:307:0x0739, B:133:0x034b, B:136:0x035f, B:164:0x03b9, B:166:0x03bd, B:167:0x03c2, B:172:0x03d3, B:174:0x03df, B:178:0x03f7, B:175:0x03e7, B:177:0x03ef, B:181:0x0402, B:183:0x0440, B:184:0x047c, B:187:0x04b1, B:189:0x04b6, B:191:0x04c2, B:193:0x04cb, B:195:0x04d3, B:196:0x04db, B:197:0x04de, B:199:0x04e3, B:202:0x04ed, B:204:0x0520, B:206:0x053f, B:212:0x0556, B:209:0x054d, B:215:0x055f, B:217:0x0572, B:218:0x057d, B:219:0x0594, B:222:0x05a6, B:223:0x05ab, B:226:0x05b2, B:232:0x05c9, B:229:0x05be, B:235:0x05cf, B:237:0x05d5, B:239:0x05db, B:260:0x062c, B:261:0x0649, B:263:0x064d, B:265:0x065f, B:267:0x066b, B:270:0x0676, B:272:0x068c, B:294:0x06db, B:296:0x06e3, B:298:0x06e7, B:301:0x06ed, B:303:0x06f8, B:304:0x0710, B:305:0x0717, B:306:0x072e, B:278:0x069a, B:280:0x06a5, B:283:0x06b0, B:285:0x06c7, B:244:0x0600, B:246:0x0606, B:250:0x060f, B:252:0x0615, B:255:0x0620, B:143:0x037f, B:146:0x0389, B:149:0x0393, B:312:0x0758, B:314:0x0764, B:316:0x076d, B:325:0x079e, B:318:0x0781, B:320:0x078a, B:322:0x078e, B:324:0x0798, B:326:0x07a1, B:328:0x07a9, B:330:0x07b5, B:332:0x07c3, B:335:0x07c8, B:337:0x080a, B:338:0x0828, B:340:0x082d, B:342:0x0839, B:346:0x0845, B:349:0x0863, B:343:0x083f, B:336:0x07ed, B:350:0x087b, B:357:0x08c9, B:359:0x08dc, B:361:0x08f0, B:363:0x08f4, B:365:0x08fe, B:366:0x090b, B:368:0x090f, B:370:0x0917, B:371:0x0926, B:382:0x0970, B:384:0x0978, B:386:0x0986, B:388:0x098a, B:403:0x09ba, B:406:0x09cc, B:410:0x09f5, B:412:0x0a05, B:421:0x0a58, B:423:0x0a60, B:425:0x0a64, B:427:0x0a68, B:429:0x0a6c, B:433:0x0a7e, B:435:0x0a9b, B:436:0x0aa4, B:443:0x0acc, B:390:0x0992, B:392:0x0996, B:394:0x099e, B:396:0x09a2, B:399:0x09ac, B:52:0x0131, B:68:0x01cc, B:76:0x0200, B:84:0x0220, B:90:0x0239, B:105:0x0266, B:44:0x00e3, B:55:0x0144), top: B:555:0x000b, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027b A[Catch: all -> 0x0d8e, TryCatch #7 {all -> 0x0d8e, blocks: (B:3:0x000b, B:26:0x0088, B:106:0x0269, B:108:0x026d, B:114:0x027b, B:115:0x02aa, B:118:0x02ba, B:121:0x02da, B:123:0x030b, B:129:0x031f, B:131:0x0327, B:307:0x0739, B:133:0x034b, B:136:0x035f, B:164:0x03b9, B:166:0x03bd, B:167:0x03c2, B:172:0x03d3, B:174:0x03df, B:178:0x03f7, B:175:0x03e7, B:177:0x03ef, B:181:0x0402, B:183:0x0440, B:184:0x047c, B:187:0x04b1, B:189:0x04b6, B:191:0x04c2, B:193:0x04cb, B:195:0x04d3, B:196:0x04db, B:197:0x04de, B:199:0x04e3, B:202:0x04ed, B:204:0x0520, B:206:0x053f, B:212:0x0556, B:209:0x054d, B:215:0x055f, B:217:0x0572, B:218:0x057d, B:219:0x0594, B:222:0x05a6, B:223:0x05ab, B:226:0x05b2, B:232:0x05c9, B:229:0x05be, B:235:0x05cf, B:237:0x05d5, B:239:0x05db, B:260:0x062c, B:261:0x0649, B:263:0x064d, B:265:0x065f, B:267:0x066b, B:270:0x0676, B:272:0x068c, B:294:0x06db, B:296:0x06e3, B:298:0x06e7, B:301:0x06ed, B:303:0x06f8, B:304:0x0710, B:305:0x0717, B:306:0x072e, B:278:0x069a, B:280:0x06a5, B:283:0x06b0, B:285:0x06c7, B:244:0x0600, B:246:0x0606, B:250:0x060f, B:252:0x0615, B:255:0x0620, B:143:0x037f, B:146:0x0389, B:149:0x0393, B:312:0x0758, B:314:0x0764, B:316:0x076d, B:325:0x079e, B:318:0x0781, B:320:0x078a, B:322:0x078e, B:324:0x0798, B:326:0x07a1, B:328:0x07a9, B:330:0x07b5, B:332:0x07c3, B:335:0x07c8, B:337:0x080a, B:338:0x0828, B:340:0x082d, B:342:0x0839, B:346:0x0845, B:349:0x0863, B:343:0x083f, B:336:0x07ed, B:350:0x087b, B:357:0x08c9, B:359:0x08dc, B:361:0x08f0, B:363:0x08f4, B:365:0x08fe, B:366:0x090b, B:368:0x090f, B:370:0x0917, B:371:0x0926, B:382:0x0970, B:384:0x0978, B:386:0x0986, B:388:0x098a, B:403:0x09ba, B:406:0x09cc, B:410:0x09f5, B:412:0x0a05, B:421:0x0a58, B:423:0x0a60, B:425:0x0a64, B:427:0x0a68, B:429:0x0a6c, B:433:0x0a7e, B:435:0x0a9b, B:436:0x0aa4, B:443:0x0acc, B:390:0x0992, B:392:0x0996, B:394:0x099e, B:396:0x09a2, B:399:0x09ac, B:52:0x0131, B:68:0x01cc, B:76:0x0200, B:84:0x0220, B:90:0x0239, B:105:0x0266, B:44:0x00e3, B:55:0x0144), top: B:555:0x000b, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x065f A[Catch: all -> 0x0d8e, TryCatch #7 {all -> 0x0d8e, blocks: (B:3:0x000b, B:26:0x0088, B:106:0x0269, B:108:0x026d, B:114:0x027b, B:115:0x02aa, B:118:0x02ba, B:121:0x02da, B:123:0x030b, B:129:0x031f, B:131:0x0327, B:307:0x0739, B:133:0x034b, B:136:0x035f, B:164:0x03b9, B:166:0x03bd, B:167:0x03c2, B:172:0x03d3, B:174:0x03df, B:178:0x03f7, B:175:0x03e7, B:177:0x03ef, B:181:0x0402, B:183:0x0440, B:184:0x047c, B:187:0x04b1, B:189:0x04b6, B:191:0x04c2, B:193:0x04cb, B:195:0x04d3, B:196:0x04db, B:197:0x04de, B:199:0x04e3, B:202:0x04ed, B:204:0x0520, B:206:0x053f, B:212:0x0556, B:209:0x054d, B:215:0x055f, B:217:0x0572, B:218:0x057d, B:219:0x0594, B:222:0x05a6, B:223:0x05ab, B:226:0x05b2, B:232:0x05c9, B:229:0x05be, B:235:0x05cf, B:237:0x05d5, B:239:0x05db, B:260:0x062c, B:261:0x0649, B:263:0x064d, B:265:0x065f, B:267:0x066b, B:270:0x0676, B:272:0x068c, B:294:0x06db, B:296:0x06e3, B:298:0x06e7, B:301:0x06ed, B:303:0x06f8, B:304:0x0710, B:305:0x0717, B:306:0x072e, B:278:0x069a, B:280:0x06a5, B:283:0x06b0, B:285:0x06c7, B:244:0x0600, B:246:0x0606, B:250:0x060f, B:252:0x0615, B:255:0x0620, B:143:0x037f, B:146:0x0389, B:149:0x0393, B:312:0x0758, B:314:0x0764, B:316:0x076d, B:325:0x079e, B:318:0x0781, B:320:0x078a, B:322:0x078e, B:324:0x0798, B:326:0x07a1, B:328:0x07a9, B:330:0x07b5, B:332:0x07c3, B:335:0x07c8, B:337:0x080a, B:338:0x0828, B:340:0x082d, B:342:0x0839, B:346:0x0845, B:349:0x0863, B:343:0x083f, B:336:0x07ed, B:350:0x087b, B:357:0x08c9, B:359:0x08dc, B:361:0x08f0, B:363:0x08f4, B:365:0x08fe, B:366:0x090b, B:368:0x090f, B:370:0x0917, B:371:0x0926, B:382:0x0970, B:384:0x0978, B:386:0x0986, B:388:0x098a, B:403:0x09ba, B:406:0x09cc, B:410:0x09f5, B:412:0x0a05, B:421:0x0a58, B:423:0x0a60, B:425:0x0a64, B:427:0x0a68, B:429:0x0a6c, B:433:0x0a7e, B:435:0x0a9b, B:436:0x0aa4, B:443:0x0acc, B:390:0x0992, B:392:0x0996, B:394:0x099e, B:396:0x09a2, B:399:0x09ac, B:52:0x0131, B:68:0x01cc, B:76:0x0200, B:84:0x0220, B:90:0x0239, B:105:0x0266, B:44:0x00e3, B:55:0x0144), top: B:555:0x000b, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0717 A[Catch: all -> 0x0d8e, TryCatch #7 {all -> 0x0d8e, blocks: (B:3:0x000b, B:26:0x0088, B:106:0x0269, B:108:0x026d, B:114:0x027b, B:115:0x02aa, B:118:0x02ba, B:121:0x02da, B:123:0x030b, B:129:0x031f, B:131:0x0327, B:307:0x0739, B:133:0x034b, B:136:0x035f, B:164:0x03b9, B:166:0x03bd, B:167:0x03c2, B:172:0x03d3, B:174:0x03df, B:178:0x03f7, B:175:0x03e7, B:177:0x03ef, B:181:0x0402, B:183:0x0440, B:184:0x047c, B:187:0x04b1, B:189:0x04b6, B:191:0x04c2, B:193:0x04cb, B:195:0x04d3, B:196:0x04db, B:197:0x04de, B:199:0x04e3, B:202:0x04ed, B:204:0x0520, B:206:0x053f, B:212:0x0556, B:209:0x054d, B:215:0x055f, B:217:0x0572, B:218:0x057d, B:219:0x0594, B:222:0x05a6, B:223:0x05ab, B:226:0x05b2, B:232:0x05c9, B:229:0x05be, B:235:0x05cf, B:237:0x05d5, B:239:0x05db, B:260:0x062c, B:261:0x0649, B:263:0x064d, B:265:0x065f, B:267:0x066b, B:270:0x0676, B:272:0x068c, B:294:0x06db, B:296:0x06e3, B:298:0x06e7, B:301:0x06ed, B:303:0x06f8, B:304:0x0710, B:305:0x0717, B:306:0x072e, B:278:0x069a, B:280:0x06a5, B:283:0x06b0, B:285:0x06c7, B:244:0x0600, B:246:0x0606, B:250:0x060f, B:252:0x0615, B:255:0x0620, B:143:0x037f, B:146:0x0389, B:149:0x0393, B:312:0x0758, B:314:0x0764, B:316:0x076d, B:325:0x079e, B:318:0x0781, B:320:0x078a, B:322:0x078e, B:324:0x0798, B:326:0x07a1, B:328:0x07a9, B:330:0x07b5, B:332:0x07c3, B:335:0x07c8, B:337:0x080a, B:338:0x0828, B:340:0x082d, B:342:0x0839, B:346:0x0845, B:349:0x0863, B:343:0x083f, B:336:0x07ed, B:350:0x087b, B:357:0x08c9, B:359:0x08dc, B:361:0x08f0, B:363:0x08f4, B:365:0x08fe, B:366:0x090b, B:368:0x090f, B:370:0x0917, B:371:0x0926, B:382:0x0970, B:384:0x0978, B:386:0x0986, B:388:0x098a, B:403:0x09ba, B:406:0x09cc, B:410:0x09f5, B:412:0x0a05, B:421:0x0a58, B:423:0x0a60, B:425:0x0a64, B:427:0x0a68, B:429:0x0a6c, B:433:0x0a7e, B:435:0x0a9b, B:436:0x0aa4, B:443:0x0acc, B:390:0x0992, B:392:0x0996, B:394:0x099e, B:396:0x09a2, B:399:0x09ac, B:52:0x0131, B:68:0x01cc, B:76:0x0200, B:84:0x0220, B:90:0x0239, B:105:0x0266, B:44:0x00e3, B:55:0x0144), top: B:555:0x000b, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e A[Catch: all -> 0x023d, SQLiteException -> 0x0241, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0241, all -> 0x023d, blocks: (B:48:0x00f2, B:50:0x011e, B:54:0x0136, B:55:0x0144, B:56:0x0147, B:58:0x014d, B:59:0x015e, B:61:0x016a, B:63:0x018c, B:62:0x017f, B:88:0x0226), top: B:566:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0d88 A[Catch: all -> 0x0d8c, TRY_ENTER, TryCatch #4 {all -> 0x0d8c, blocks: (B:483:0x0c01, B:499:0x0c77, B:501:0x0c7c, B:503:0x0c8f, B:506:0x0c94, B:511:0x0cc3, B:507:0x0c99, B:509:0x0ca3, B:510:0x0cac, B:512:0x0ccc, B:513:0x0ce3, B:516:0x0ceb, B:517:0x0cf0, B:518:0x0d00, B:520:0x0d1a, B:521:0x0d33, B:522:0x0d3b, B:527:0x0d5d, B:526:0x0d4c, B:484:0x0c19, B:486:0x0c20, B:488:0x0c2a, B:490:0x0c30, B:496:0x0c42, B:498:0x0c48, B:533:0x0d72, B:539:0x0d88, B:540:0x0d8b), top: B:551:0x0025, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136 A[Catch: all -> 0x023d, SQLiteException -> 0x0241, TRY_ENTER, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0241, all -> 0x023d, blocks: (B:48:0x00f2, B:50:0x011e, B:54:0x0136, B:55:0x0144, B:56:0x0147, B:58:0x014d, B:59:0x015e, B:61:0x016a, B:63:0x018c, B:62:0x017f, B:88:0x0226), top: B:566:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:613:? A[Catch: all -> 0x0d8c, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x0d8c, blocks: (B:483:0x0c01, B:499:0x0c77, B:501:0x0c7c, B:503:0x0c8f, B:506:0x0c94, B:511:0x0cc3, B:507:0x0c99, B:509:0x0ca3, B:510:0x0cac, B:512:0x0ccc, B:513:0x0ce3, B:516:0x0ceb, B:517:0x0cf0, B:518:0x0d00, B:520:0x0d1a, B:521:0x0d33, B:522:0x0d3b, B:527:0x0d5d, B:526:0x0d4c, B:484:0x0c19, B:486:0x0c20, B:488:0x0c2a, B:490:0x0c30, B:496:0x0c42, B:498:0x0c48, B:533:0x0d72, B:539:0x0d88, B:540:0x0d8b), top: B:551:0x0025, inners: #9 }] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v45, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r7v99, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzd(java.lang.String r45, long r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zzd(java.lang.String, long):boolean");
    }

    final void zzd(zzk zzkVar) throws NoSuchAlgorithmException {
        if (this.zzaua != null) {
            ArrayList arrayList = new ArrayList();
            this.zzaub = arrayList;
            arrayList.addAll(this.zzaua);
        }
        zzt zztVarZzjt = zzjt();
        String str = zzkVar.packageName;
        p.v5(str);
        zztVarZzjt.zzaf();
        zztVarZzjt.zzcl();
        try {
            SQLiteDatabase writableDatabase = zztVarZzjt.getWritableDatabase();
            String[] strArr = {str};
            int iDelete = writableDatabase.delete("apps", "app_id=?", strArr) + 0 + writableDatabase.delete("events", "app_id=?", strArr) + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("queue", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr) + writableDatabase.delete("main_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                zztVarZzjt.zzgt().zzjo().zze("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zztVarZzjt.zzgt().zzjg().zze("Error resetting analytics data. appId, error", zzas.zzbw(str), e);
        }
        zzk zzkVarZza = zza(this.zzada.getContext(), zzkVar.packageName, zzkVar.zzafi, zzkVar.zzafr, zzkVar.zzaft, zzkVar.zzafu, zzkVar.zzago, zzkVar.zzafv);
        if (!this.zzada.zzgv().zzba(zzkVar.packageName) || zzkVar.zzafr) {
            zzf(zzkVarZza);
        }
    }
}
