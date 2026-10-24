package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.u1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzal extends m1 implements zzaj {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzag zzagVar, zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzagVar);
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        zza(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zzb(zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        zza(6, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final String zzc(zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
        String string = parcelTransactAndReadException.readString();
        parcelTransactAndReadException.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zzd(zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        zza(18, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzo> zze(String str, String str2, String str3) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeString(str3);
        Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
        ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(zzo.CREATOR);
        parcelTransactAndReadException.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zzb(zzo zzoVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzoVar);
        zza(13, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzfv zzfvVar, zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzfvVar);
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        zza(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        zza(4, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzag zzagVar, String str, String str2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzagVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        zza(5, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzfv> zza(zzk zzkVar, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        u1.j6(parcelObtainAndWriteInterfaceToken, z);
        Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
        ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(zzfv.CREATOR);
        parcelTransactAndReadException.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final byte[] zza(zzag zzagVar, String str) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzagVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
        byte[] bArrCreateByteArray = parcelTransactAndReadException.createByteArray();
        parcelTransactAndReadException.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(long j, String str, String str2, String str3) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeString(str3);
        zza(10, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzo zzoVar, zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzoVar);
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        zza(12, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzfv> zza(String str, String str2, boolean z, zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        u1.j6(parcelObtainAndWriteInterfaceToken, z);
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        Parcel parcelTransactAndReadException = transactAndReadException(14, parcelObtainAndWriteInterfaceToken);
        ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(zzfv.CREATOR);
        parcelTransactAndReadException.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzfv> zza(String str, String str2, String str3, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeString(str3);
        u1.j6(parcelObtainAndWriteInterfaceToken, z);
        Parcel parcelTransactAndReadException = transactAndReadException(15, parcelObtainAndWriteInterfaceToken);
        ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(zzfv.CREATOR);
        parcelTransactAndReadException.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzo> zza(String str, String str2, zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzkVar);
        Parcel parcelTransactAndReadException = transactAndReadException(16, parcelObtainAndWriteInterfaceToken);
        ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(zzo.CREATOR);
        parcelTransactAndReadException.recycle();
        return arrayListCreateTypedArrayList;
    }
}
