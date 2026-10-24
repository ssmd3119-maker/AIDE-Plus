package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.probelytics.api.UserTouchAction;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class zzfu extends zzfn {
    zzfu(zzfo zzfoVar) {
        super(zzfoVar);
    }

    static Object zzb(f1 f1Var, String str) {
        g1 g1VarZza = zza(f1Var, str);
        if (g1VarZza == null) {
            return null;
        }
        String str2 = g1VarZza.Hw;
        if (str2 != null) {
            return str2;
        }
        Long l = g1VarZza.v5;
        if (l != null) {
            return l;
        }
        Double d = g1VarZza.VH;
        if (d != null) {
            return d;
        }
        return null;
    }

    static boolean zzcs(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final void zza(l1 l1Var, Object obj) {
        p.u7(obj);
        l1Var.v5 = null;
        l1Var.Zo = null;
        l1Var.gn = null;
        if (obj instanceof String) {
            l1Var.v5 = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            l1Var.Zo = (Long) obj;
        } else if (obj instanceof Double) {
            l1Var.gn = (Double) obj;
        } else {
            zzgt().zzjg().zzg("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    final boolean zze(zzag zzagVar, zzk zzkVar) {
        p.u7(zzagVar);
        p.u7(zzkVar);
        if (!TextUtils.isEmpty(zzkVar.zzafi) || !TextUtils.isEmpty(zzkVar.zzafv)) {
            return true;
        }
        zzgw();
        return false;
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

    @Override // com.google.android.gms.measurement.internal.zzfn
    protected final boolean zzgy() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzfu zzjr() {
        return super.zzjr();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzm zzjs() {
        return super.zzjs();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzt zzjt() {
        return super.zzjt();
    }

    final int[] zzmi() throws NumberFormatException {
        Map<String, String> mapZzm = zzai.zzm(this.zzamv.getContext());
        if (mapZzm == null || mapZzm.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = zzai.zzakg.get().intValue();
        for (Map.Entry<String, String> entry : mapZzm.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            zzgt().zzjj().zzg("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzgt().zzjj().zzg("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i3] = ((Integer) obj).intValue();
            i3++;
        }
        return iArr;
    }

    final String zzb(h1 h1Var) {
        i1[] i1VarArr;
        f1[] f1VarArr;
        String str;
        f1[] f1VarArr2;
        int i;
        int i2;
        String str2;
        i1[] i1VarArr2;
        String str3;
        l1[] l1VarArr;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        i1[] i1VarArr3 = h1Var.FH;
        if (i1VarArr3 != null) {
            int length = i1VarArr3.length;
            int i3 = 0;
            while (i3 < length) {
                i1 i1Var = i1VarArr3[i3];
                if (i1Var == null || i1Var == null) {
                    i1VarArr = i1VarArr3;
                } else {
                    zza(sb, 1);
                    sb.append("bundle {\n");
                    zza(sb, 1, "protocol_version", i1Var.FH);
                    zza(sb, 1, "platform", i1Var.EQ);
                    zza(sb, 1, "gmp_version", i1Var.j3);
                    zza(sb, 1, "uploading_gmp_version", i1Var.Mr);
                    zza(sb, 1, "config_version", i1Var.ro);
                    zza(sb, 1, "gmp_app_id", i1Var.gW);
                    zza(sb, 1, "admob_app_id", i1Var.sG);
                    zza(sb, 1, "app_id", i1Var.XL);
                    zza(sb, 1, "app_version", i1Var.aM);
                    zza(sb, 1, "app_version_major", i1Var.ei);
                    zza(sb, 1, "firebase_instance_id", i1Var.P8);
                    zza(sb, 1, "dev_cert_hash", i1Var.rN);
                    zza(sb, 1, "app_store", i1Var.QX);
                    zza(sb, 1, "upload_timestamp_millis", i1Var.Zo);
                    zza(sb, 1, "start_timestamp_millis", i1Var.VH);
                    zza(sb, 1, "end_timestamp_millis", i1Var.gn);
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", i1Var.u7);
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", i1Var.tp);
                    zza(sb, 1, "app_instance_id", i1Var.lg);
                    zza(sb, 1, "resettable_device_id", i1Var.U2);
                    zza(sb, 1, "device_id", i1Var.KD);
                    zza(sb, 1, "ds_id", i1Var.sh);
                    zza(sb, 1, "limited_ad_tracking", i1Var.a8);
                    zza(sb, 1, "os_version", i1Var.we);
                    zza(sb, 1, "device_model", i1Var.J0);
                    zza(sb, 1, "user_default_language", i1Var.J8);
                    zza(sb, 1, "time_zone_offset_minutes", i1Var.Ws);
                    zza(sb, 1, "bundle_sequential_index", i1Var.er);
                    zza(sb, 1, "service_upload", i1Var.BT);
                    zza(sb, 1, "health_monitor", i1Var.yS);
                    Long l = i1Var.cn;
                    if (l != null && l.longValue() != 0) {
                        zza(sb, 1, "android_id", i1Var.cn);
                    }
                    Integer num = i1Var.dx;
                    if (num != null) {
                        zza(sb, 1, "retry_counter", num);
                    }
                    l1[] l1VarArr2 = i1Var.v5;
                    String str4 = "string_value";
                    String str5 = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    int i4 = 2;
                    if (l1VarArr2 != null) {
                        int length2 = l1VarArr2.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            l1 l1Var = l1VarArr2[i5];
                            if (l1Var != null) {
                                zza(sb, 2);
                                sb.append("user_property {\n");
                                l1VarArr = l1VarArr2;
                                zza(sb, 2, "set_timestamp_millis", l1Var.FH);
                                zza(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzgq().zzbv(l1Var.Hw));
                                zza(sb, 2, "string_value", l1Var.v5);
                                zza(sb, 2, "int_value", l1Var.Zo);
                                zza(sb, 2, "double_value", l1Var.gn);
                                zza(sb, 2);
                                sb.append("}\n");
                            } else {
                                l1VarArr = l1VarArr2;
                            }
                            i5++;
                            l1VarArr2 = l1VarArr;
                        }
                    }
                    d1[] d1VarArr = i1Var.vy;
                    String str6 = i1Var.XL;
                    if (d1VarArr != null) {
                        int length3 = d1VarArr.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            d1 d1Var = d1VarArr[i6];
                            if (d1Var != null) {
                                zza(sb, i4);
                                sb.append("audience_membership {\n");
                                i = i6;
                                i2 = length3;
                                zza(sb, 2, "audience_id", d1Var.FH);
                                zza(sb, 2, "new_audience", d1Var.Zo);
                                str2 = str5;
                                i1VarArr2 = i1VarArr3;
                                str3 = str4;
                                zza(sb, 2, "current_data", d1Var.Hw, str6);
                                zza(sb, 2, "previous_data", d1Var.v5, str6);
                                zza(sb, 2);
                                sb.append("}\n");
                            } else {
                                i = i6;
                                i2 = length3;
                                str2 = str5;
                                i1VarArr2 = i1VarArr3;
                                str3 = str4;
                            }
                            i6 = i + 1;
                            str4 = str3;
                            i1VarArr3 = i1VarArr2;
                            length3 = i2;
                            str5 = str2;
                            i4 = 2;
                        }
                    }
                    String str7 = str5;
                    i1VarArr = i1VarArr3;
                    int i7 = 2;
                    String str8 = str4;
                    f1[] f1VarArr3 = i1Var.Hw;
                    if (f1VarArr3 != null) {
                        int length4 = f1VarArr3.length;
                        int i8 = 0;
                        while (i8 < length4) {
                            f1 f1Var = f1VarArr3[i8];
                            if (f1Var != null) {
                                zza(sb, i7);
                                sb.append("event {\n");
                                str = str7;
                                zza(sb, i7, str, zzgq().zzbt(f1Var.Hw));
                                zza(sb, i7, "timestamp_millis", f1Var.v5);
                                zza(sb, i7, "previous_timestamp_millis", f1Var.Zo);
                                zza(sb, i7, "count", f1Var.VH);
                                g1[] g1VarArr = f1Var.FH;
                                if (g1VarArr != null) {
                                    int length5 = g1VarArr.length;
                                    int i9 = 0;
                                    while (i9 < length5) {
                                        g1 g1Var = g1VarArr[i9];
                                        if (g1Var != null) {
                                            zza(sb, 3);
                                            sb.append("param {\n");
                                            f1VarArr2 = f1VarArr3;
                                            zza(sb, 3, str, zzgq().zzbu(g1Var.FH));
                                            zza(sb, 3, str8, g1Var.Hw);
                                            zza(sb, 3, "int_value", g1Var.v5);
                                            zza(sb, 3, "double_value", g1Var.VH);
                                            zza(sb, 3);
                                            sb.append("}\n");
                                        } else {
                                            f1VarArr2 = f1VarArr3;
                                        }
                                        i9++;
                                        f1VarArr3 = f1VarArr2;
                                        i7 = 2;
                                    }
                                }
                                f1VarArr = f1VarArr3;
                                zza(sb, i7);
                                sb.append("}\n");
                            } else {
                                f1VarArr = f1VarArr3;
                                str = str7;
                            }
                            i8++;
                            str7 = str;
                            f1VarArr3 = f1VarArr;
                        }
                    }
                    zza(sb, 1);
                    sb.append("}\n");
                }
                i3++;
                i1VarArr3 = i1VarArr;
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final void zza(g1 g1Var, Object obj) {
        p.u7(obj);
        g1Var.Hw = null;
        g1Var.v5 = null;
        g1Var.VH = null;
        if (obj instanceof String) {
            g1Var.Hw = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            g1Var.v5 = (Long) obj;
        } else if (obj instanceof Double) {
            g1Var.VH = (Double) obj;
        } else {
            zzgt().zzjg().zzg("Ignoring invalid (type) event param value", obj);
        }
    }

    final byte[] zza(h1 h1Var) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        try {
            int iHw = h1Var.Hw();
            byte[] bArr = new byte[iHw];
            r7 r7VarYS = r7.yS(bArr, 0, iHw);
            h1Var.DW(r7VarYS);
            r7VarYS.P8();
            return bArr;
        } catch (IOException e) {
            zzgt().zzjg().zzg("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    static g1 zza(f1 f1Var, String str) {
        for (g1 g1Var : f1Var.FH) {
            if (g1Var.FH.equals(str)) {
                return g1Var;
            }
        }
        return null;
    }

    static g1[] zza(g1[] g1VarArr, String str, Object obj) {
        for (g1 g1Var : g1VarArr) {
            if (str.equals(g1Var.FH)) {
                g1Var.v5 = null;
                g1Var.Hw = null;
                g1Var.VH = null;
                if (obj instanceof Long) {
                    g1Var.v5 = (Long) obj;
                } else if (obj instanceof String) {
                    g1Var.Hw = (String) obj;
                } else if (obj instanceof Double) {
                    g1Var.VH = (Double) obj;
                }
                return g1VarArr;
            }
        }
        g1[] g1VarArr2 = new g1[g1VarArr.length + 1];
        System.arraycopy(g1VarArr, 0, g1VarArr2, 0, g1VarArr.length);
        g1 g1Var2 = new g1();
        g1Var2.FH = str;
        if (obj instanceof Long) {
            g1Var2.v5 = (Long) obj;
        } else if (obj instanceof String) {
            g1Var2.Hw = (String) obj;
        } else if (obj instanceof Double) {
            g1Var2.VH = (Double) obj;
        }
        g1VarArr2[g1VarArr.length] = g1Var2;
        return g1VarArr2;
    }

    final String zza(v0 v0Var) {
        if (v0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        zza(sb, 0, "filter_id", v0Var.FH);
        zza(sb, 0, "event_name", zzgq().zzbt(v0Var.Hw));
        zza(sb, 1, "event_count_filter", v0Var.VH);
        sb.append("  filters {\n");
        for (w0 w0Var : v0Var.v5) {
            zza(sb, 2, w0Var);
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String zza(y0 y0Var) {
        if (y0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        zza(sb, 0, "filter_id", y0Var.FH);
        zza(sb, 0, "property_name", zzgq().zzbv(y0Var.Hw));
        zza(sb, 1, y0Var.v5);
        sb.append("}\n");
        return sb.toString();
    }

    private final void zza(StringBuilder sb, int i, String str, j1 j1Var, String str2) {
        if (j1Var == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (j1Var.Hw != null) {
            zza(sb, 4);
            sb.append("results: ");
            long[] jArr = j1Var.Hw;
            int length = jArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Long lValueOf = Long.valueOf(jArr[i2]);
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(lValueOf);
                i2++;
                i3 = i4;
            }
            sb.append('\n');
        }
        if (j1Var.FH != null) {
            zza(sb, 4);
            sb.append("status: ");
            long[] jArr2 = j1Var.FH;
            int length2 = jArr2.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2) {
                Long lValueOf2 = Long.valueOf(jArr2[i5]);
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(lValueOf2);
                i5++;
                i6 = i7;
            }
            sb.append('\n');
        }
        if (zzgv().zzbb(str2)) {
            if (j1Var.v5 != null) {
                zza(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                e1[] e1VarArr = j1Var.v5;
                int length3 = e1VarArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length3) {
                    e1 e1Var = e1VarArr[i8];
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(e1Var.FH);
                    sb.append(":");
                    sb.append(e1Var.Hw);
                    i8++;
                    i9 = i10;
                }
                sb.append("}\n");
            }
            if (j1Var.Zo != null) {
                zza(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                k1[] k1VarArr = j1Var.Zo;
                int length4 = k1VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length4) {
                    k1 k1Var = k1VarArr[i11];
                    int i13 = i12 + 1;
                    if (i12 != 0) {
                        sb.append(", ");
                    }
                    sb.append(k1Var.FH);
                    sb.append(": [");
                    long[] jArr3 = k1Var.Hw;
                    int length5 = jArr3.length;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length5) {
                        long j = jArr3[i14];
                        int i16 = i15 + 1;
                        if (i15 != 0) {
                            sb.append(", ");
                        }
                        sb.append(j);
                        i14++;
                        i15 = i16;
                    }
                    sb.append("]");
                    i11++;
                    i12 = i13;
                }
                sb.append("}\n");
            }
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    final boolean zzb(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzbx().j6() - j) > j2;
    }

    final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzgt().zzjg().zzg("Failed to gzip content", e);
            throw e;
        }
    }

    private final void zza(StringBuilder sb, int i, String str, x0 x0Var) {
        if (x0Var == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        Integer num = x0Var.FH;
        if (num != null) {
            int iIntValue = num.intValue();
            zza(sb, i, "comparison_type", iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? "UNKNOWN_COMPARISON_TYPE" : "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
        }
        zza(sb, i, "match_as_float", x0Var.Hw);
        zza(sb, i, "comparison_value", x0Var.v5);
        zza(sb, i, "min_comparison_value", x0Var.Zo);
        zza(sb, i, "max_comparison_value", x0Var.VH);
        zza(sb, i);
        sb.append("}\n");
    }

    private final void zza(StringBuilder sb, int i, w0 w0Var) {
        String str;
        if (w0Var == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        zza(sb, i, "complement", w0Var.v5);
        zza(sb, i, "param_name", zzgq().zzbu(w0Var.Zo));
        int i2 = i + 1;
        z0 z0Var = w0Var.FH;
        if (z0Var != null) {
            zza(sb, i2);
            sb.append("string_filter");
            sb.append(" {\n");
            Integer num = z0Var.FH;
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str = "REGEXP";
                        break;
                    case 2:
                        str = "BEGINS_WITH";
                        break;
                    case 3:
                        str = "ENDS_WITH";
                        break;
                    case 4:
                        str = "PARTIAL";
                        break;
                    case 5:
                        str = "EXACT";
                        break;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        str = "IN_LIST";
                        break;
                    default:
                        str = "UNKNOWN_MATCH_TYPE";
                        break;
                }
                zza(sb, i2, "match_type", str);
            }
            zza(sb, i2, "expression", z0Var.Hw);
            zza(sb, i2, "case_sensitive", z0Var.v5);
            if (z0Var.Zo.length > 0) {
                zza(sb, i2 + 1);
                sb.append("expression_list {\n");
                for (String str2 : z0Var.Zo) {
                    zza(sb, i2 + 2);
                    sb.append(str2);
                    sb.append("\n");
                }
                sb.append("}\n");
            }
            zza(sb, i2);
            sb.append("}\n");
        }
        zza(sb, i2, "number_filter", w0Var.Hw);
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (a.C0113a unused) {
            zzgt().zzjg().zzby("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    static boolean zza(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i / 64]) != 0;
    }

    static long[] zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        jArr[i] = jArr[i] | (1 << i2);
                    }
                }
            }
        }
        return jArr;
    }

    final byte[] zza(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzgt().zzjg().zzg("Failed to ungzip content", e);
            throw e;
        }
    }
}
