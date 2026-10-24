package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.ui.util.Configuration;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@cy(clazz = 839444887493871625L, container = 839444887493871625L, user = true)
/* loaded from: classes.dex */
public abstract class Configuration<T extends Configuration<?>> {

    @fy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1228273754641376112L)
    private static Map<String, Configuration<?>> configurationMap;

    @dy(field = -3344617948668254421L)
    private static Map<String, Long> lastModifiedMap;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -3170119796588202639L)
    public String configurationPath;

    static {
        try {
            iy.Zo(Configuration.class);
            if (Hw) {
                iy.gn(-3194633388059074720L, null);
            }
            configurationMap = new HashMap();
            lastModifiedMap = new HashMap();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -3194633388059074720L, null);
            }
            throw th;
        }
    }

    @ey(method = -1999850808249918015L)
    public Configuration() {
        try {
            if (Hw) {
                iy.gn(2821760026110388885L, null);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2821760026110388885L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ey(method = 4523850008405882735L)
    public T getConfiguration(String str) {
        try {
            if (Hw) {
                iy.tp(7000091445372223072L, this, str);
            }
            if (configurationMap.containsKey(str) && lastModifiedMap.containsKey(str) && new File(str).lastModified() == lastModifiedMap.get(str).longValue()) {
                return (T) configurationMap.get(str);
            }
            try {
                T t = (T) makeConfiguration(str);
                t.configurationPath = str;
                configurationMap.put(str, t);
                lastModifiedMap.put(str, Long.valueOf(new File(str).lastModified()));
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                return this;
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 7000091445372223072L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 40793320907581908L)
    public abstract T makeConfiguration(String str);
}
