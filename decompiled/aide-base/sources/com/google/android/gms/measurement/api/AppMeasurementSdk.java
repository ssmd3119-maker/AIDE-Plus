package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.measurement.internal.zzcx;
import com.google.android.gms.measurement.internal.zzcy;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppMeasurementSdk {
    private final m zzadd;

    public static final class ConditionalUserProperty {
        public static final String ACTIVE = "active";
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final String NAME = "name";
        public static final String ORIGIN = "origin";
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final String TIME_TO_LIVE = "time_to_live";
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
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

    public AppMeasurementSdk(m mVar) {
        this.zzadd = mVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return m.j3(context, null, null, null, null).dx();
    }

    public void beginAdUnitExposure(String str) {
        this.zzadd.j6(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzadd.DW(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.zzadd.FH(str);
    }

    public long generateEventId() {
        return this.zzadd.Hw();
    }

    public String getAppIdOrigin() {
        return this.zzadd.v5();
    }

    public String getAppInstanceId() {
        return this.zzadd.ef();
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.zzadd.Zo(str, str2);
    }

    public String getCurrentScreenClass() {
        return this.zzadd.VH();
    }

    public String getCurrentScreenName() {
        return this.zzadd.gn();
    }

    public String getGmpAppId() {
        return this.zzadd.u7();
    }

    public int getMaxUserProperties(String str) {
        return this.zzadd.tp(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zzadd.EQ(str, str2, z);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        this.zzadd.we(str, str2, bundle);
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j) {
        this.zzadd.J0(str, str2, bundle, j);
    }

    public void performAction(Bundle bundle) {
        this.zzadd.XL(bundle, false);
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        return this.zzadd.XL(bundle, true);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzadd.er(onEventListener);
    }

    public void setConditionalUserProperty(Bundle bundle) {
        this.zzadd.J8(bundle);
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzadd.Ws(activity, str, str2);
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zzadd.rN(eventInterceptor);
    }

    public void setMeasurementEnabled(boolean z) {
        this.zzadd.QX(z);
    }

    public void setUserProperty(String str, String str2, Object obj) {
        this.zzadd.BT(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzadd.nw(onEventListener);
    }

    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return m.j3(context, str, str2, str3, bundle).dx();
    }
}
