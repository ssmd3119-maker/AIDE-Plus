package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import com.google.android.gms.common.util.e;

/* loaded from: classes.dex */
public final class zzao extends zzf {
    private final zzap zzalm;
    private boolean zzaln;

    zzao(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzalm = new zzap(this, getContext(), "google_app_measurement_local.db");
    }

    private final SQLiteDatabase getWritableDatabase() {
        if (this.zzaln) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzalm.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzaln = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zza(int r18, byte[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zza(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final void resetAnalyticsData() {
        zzgg();
        zzaf();
        try {
            int iDelete = getWritableDatabase().delete("messages", null, null) + 0;
            if (iDelete > 0) {
                zzgt().zzjo().zzg("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzgt().zzjg().zzg("Error resetting local analytics data. error", e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    public final boolean zzc(zzo zzoVar) {
        zzgr();
        byte[] bArrZza = zzfy.zza(zzoVar);
        if (bArrZza.length <= 131072) {
            return zza(2, bArrZza);
        }
        zzgt().zzjj().zzby("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgf() {
        super.zzgf();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgg() {
        super.zzgg();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgh() {
        super.zzgh();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zza zzgi() {
        return super.zzgi();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzda zzgj() {
        return super.zzgj();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzam zzgk() {
        return super.zzgk();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzeb zzgl() {
        return super.zzgl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzdy zzgm() {
        return super.zzgm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzao zzgn() {
        return super.zzgn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzfd zzgo() {
        return super.zzgo();
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

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzgy() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzr(int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzao.zzr(int):java.util.List");
    }

    public final boolean zza(zzag zzagVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzagVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            zzgt().zzjj().zzby("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, bArrMarshall);
    }

    public final boolean zza(zzfv zzfvVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzfvVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            zzgt().zzjj().zzby("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, bArrMarshall);
    }
}
