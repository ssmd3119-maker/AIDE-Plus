package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzbw;
import com.google.android.gms.measurement.internal.zzcu;
import com.google.android.gms.measurement.internal.zzcv;
import com.google.android.gms.measurement.internal.zzcw;
import com.google.android.gms.measurement.internal.zzcx;
import com.google.android.gms.measurement.internal.zzcy;
import com.google.android.gms.measurement.internal.zzdw;
import com.google.android.gms.measurement.internal.zzfv;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    public static final String FIAM_ORIGIN = "fiam";
    private final zzbw zzada;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) throws Throwable {
            p.u7(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object objZze = zzdw.zze(obj);
                this.mValue = objZze;
                if (objZze == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    public static final class Event extends zzcu {
        public static final String AD_REWARD = "_ar";
        public static final String APP_EXCEPTION = "_ae";

        private Event() {
        }
    }

    public interface EventInterceptor extends zzcx {
        @Override // com.google.android.gms.measurement.internal.zzcx
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    public interface OnEventListener extends zzcy {
        @Override // com.google.android.gms.measurement.internal.zzcy
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public static final class Param extends zzcv {
        public static final String FATAL = "fatal";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";

        private Param() {
        }
    }

    public static final class UserProperty extends zzcw {
        public static final String FIREBASE_LAST_NOTIFICATION = "_ln";

        private UserProperty() {
        }
    }

    public AppMeasurement(zzbw zzbwVar) {
        p.u7(zzbwVar);
        this.zzada = zzbwVar;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return zzbw.zza(context, (zzan) null).zzkm();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.zzada.zzgi().beginAdUnitExposure(str, this.zzada.zzbx().DW());
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzada.zzgj().clearConditionalUserProperty(str, str2, bundle);
    }

    @Keep
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.zzada.zzgj().clearConditionalUserPropertyAs(str, str2, str3, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.zzada.zzgi().endAdUnitExposure(str, this.zzada.zzbx().DW());
    }

    @Keep
    public long generateEventId() {
        return this.zzada.zzgr().zzmj();
    }

    @Keep
    public String getAppInstanceId() {
        return this.zzada.zzgj().zzgc();
    }

    public Boolean getBoolean() {
        return this.zzada.zzgj().zzkx();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.zzada.zzgj().getConditionalUserProperties(str, str2);
    }

    @Keep
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.zzada.zzgj().getConditionalUserPropertiesAs(str, str2, str3);
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.zzada.zzgj().getCurrentScreenClass();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.zzada.zzgj().getCurrentScreenName();
    }

    public Double getDouble() {
        return this.zzada.zzgj().zzlb();
    }

    @Keep
    public String getGmpAppId() {
        return this.zzada.zzgj().getGmpAppId();
    }

    public Integer getInteger() {
        return this.zzada.zzgj().zzla();
    }

    public Long getLong() {
        return this.zzada.zzgj().zzkz();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        this.zzada.zzgj();
        p.v5(str);
        return 25;
    }

    public String getString() {
        return this.zzada.zzgj().zzky();
    }

    public Map<String, Object> getUserProperties(boolean z) {
        List<zzfv> listZzk = this.zzada.zzgj().zzk(z);
        ArrayMap arrayMap = new ArrayMap(listZzk.size());
        for (zzfv zzfvVar : listZzk) {
            arrayMap.put(zzfvVar.name, zzfvVar.getValue());
        }
        return arrayMap;
    }

    @Keep
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.zzada.zzgj().getUserPropertiesAs(str, str2, str3, z);
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzada.zzgj().zza("app", str, bundle, true);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.zzada.zzgj().logEvent(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        this.zzada.zzgj().logEvent(str, str2, bundle, true, false, j);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzada.zzgj().zza(onEventListener);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.zzada.zzgj().setConditionalUserProperty(conditionalUserProperty);
    }

    @Keep
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.zzada.zzgj().setConditionalUserPropertyAs(conditionalUserProperty);
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zzada.zzgj().zza(eventInterceptor);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zzada.zzgj().setMeasurementEnabled(z);
    }

    public final void setMinimumSessionDuration(long j) {
        this.zzada.zzgj().setMinimumSessionDuration(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzada.zzgj().setSessionTimeoutDuration(j);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzada.zzgj().zzb("app", str, (Object) str2, false);
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        p.v5(str);
        this.zzada.zzgj().zzb(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzada.zzgj().zzb(onEventListener);
    }

    public final void zzd(boolean z) {
        this.zzada.zzgj().zzd(z);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zzada.zzgj().getUserProperties(str, str2, z);
    }
}
