package com.google.android.gms.internal.measurement;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends m1 implements e {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void C1(wu wuVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(26, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void CN(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        u1.Hw(parcelObtainAndWriteInterfaceToken, bundle);
        u1.j6(parcelObtainAndWriteInterfaceToken, z);
        u1.j6(parcelObtainAndWriteInterfaceToken, z2);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void D3(wu wuVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(28, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void Dm(wu wuVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(30, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void F7(wu wuVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(29, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void HO(int i, String str, wu wuVar, wu wuVar2, wu wuVar3) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar2);
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar3);
        zza(33, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void O5(h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(21, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void PZ(wu wuVar, zzdy zzdyVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        u1.Hw(parcelObtainAndWriteInterfaceToken, zzdyVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void TK(boolean z, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.j6(parcelObtainAndWriteInterfaceToken, z);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(11, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void UX(String str, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(24, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void Uc(String str, String str2, h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(10, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void Xy(wu wuVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(25, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void Y9(String str, String str2, wu wuVar, boolean z, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        u1.j6(parcelObtainAndWriteInterfaceToken, z);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(4, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void bH(j jVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, jVar);
        zza(35, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void d8(wu wuVar, String str, String str2, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(15, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void dW(Bundle bundle, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, bundle);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(8, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void dZ(h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(16, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void jf(String str, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(23, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void lK(h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(17, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void lN(wu wuVar, Bundle bundle, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        u1.Hw(parcelObtainAndWriteInterfaceToken, bundle);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(27, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void oT(wu wuVar, h hVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, wuVar);
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(31, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void po(String str, String str2, boolean z, h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        u1.j6(parcelObtainAndWriteInterfaceToken, z);
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(5, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void pu(h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(19, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void qU(Bundle bundle, h hVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.Hw(parcelObtainAndWriteInterfaceToken, bundle);
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        zza(32, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void re(String str, h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(6, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void sg(String str, String str2, Bundle bundle) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        u1.Hw(parcelObtainAndWriteInterfaceToken, bundle);
        zza(9, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void x6(h hVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, hVar);
        zza(22, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void yU(j jVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, jVar);
        zza(34, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void zE(j jVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        u1.FH(parcelObtainAndWriteInterfaceToken, jVar);
        zza(36, parcelObtainAndWriteInterfaceToken);
    }
}
