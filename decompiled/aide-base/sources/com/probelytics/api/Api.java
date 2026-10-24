package com.probelytics.api;

import abcd.by;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class Api {
    public static String getAnonymizedText(CharSequence charSequence) {
        return by.j6().Hw(charSequence);
    }

    public static String getAppId() {
        return by.j6().a8();
    }

    public static String getAppName() {
        return by.j6().u7();
    }

    public static int getAppVersionCode() {
        return by.j6().VH();
    }

    public static String getAppVersionName() {
        return by.j6().Ws();
    }

    public static String getBuildVariantName() {
        return by.j6().Mr();
    }

    public static String getDeviceFeaturesText() {
        return by.j6().we();
    }

    public static long getDeviceTotalMemory() {
        return by.j6().tp();
    }

    public static String getDisplayMetricsText() {
        return by.j6().QX();
    }

    public static String getIdentifier(Object obj) {
        return by.j6().Zo(obj);
    }

    public static long getInstallTime() {
        return by.j6().j6();
    }

    public static long getLastUpdateTime() {
        return by.j6().lg();
    }

    public static String getProcessName() {
        return by.j6().J8();
    }

    public static String getResourceEntryName(int i) {
        return by.j6().gn(i);
    }

    public static RuntimeDiagnostics getRuntimeDiagnostics() {
        return by.j6().v5();
    }

    public static long getTimeSinceInstall() {
        return by.j6().EQ();
    }

    public static boolean hasBeenUpdated() {
        return getInstallTime() != getLastUpdateTime();
    }

    public static boolean hasChanged(String str) {
        return by.j6().U2(str);
    }

    public static boolean isFirstEvent() {
        return hasChanged((String) null);
    }

    public static boolean isMainProcess() {
        return by.j6().FH();
    }

    public static boolean isMainThread() {
        return by.j6().j3();
    }

    public static boolean isWatchDevice() {
        return by.j6().XL();
    }

    public static <T> T this_(Class<T> cls) {
        return (T) by.j6().rN(cls);
    }

    public static boolean hasChanged(long j) {
        return hasChanged(Long.toString(j));
    }

    public static boolean hasChanged(boolean z) {
        return hasChanged(Boolean.toString(z));
    }
}
