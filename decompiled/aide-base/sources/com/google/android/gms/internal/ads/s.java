package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class s {
    private ExecutorService DW;
    private String VH;
    private Context Zo;
    private AtomicBoolean gn;
    private File u7;
    private String v5;
    private BlockingQueue<d0> j6 = new ArrayBlockingQueue(100);
    private LinkedHashMap<String, String> FH = new LinkedHashMap<>();
    private Map<String, w> Hw = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final void VH() throws Throwable {
        FileOutputStream fileOutputStream;
        while (true) {
            try {
                d0 d0VarTake = this.j6.take();
                String strGn = d0VarTake.gn();
                if (!TextUtils.isEmpty(strGn)) {
                    Map<String, String> mapJ6 = j6(this.FH, d0VarTake.u7());
                    Uri.Builder builderBuildUpon = Uri.parse(this.v5).buildUpon();
                    for (Map.Entry<String, String> entry : mapJ6.entrySet()) {
                        builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    String str = builderBuildUpon.build().toString() + "&it=" + strGn;
                    if (this.gn.get()) {
                        File file = this.u7;
                        if (file != null) {
                            FileOutputStream fileOutputStream2 = null;
                            try {
                                try {
                                    fileOutputStream = new FileOutputStream(file, true);
                                } catch (IOException e) {
                                    e = e;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                fileOutputStream.write(str.getBytes());
                                fileOutputStream.write(10);
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    xp.v5("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                                }
                            } catch (IOException e3) {
                                e = e3;
                                fileOutputStream2 = fileOutputStream;
                                xp.v5("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e4) {
                                        xp.v5("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e5) {
                                        xp.v5("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                                    }
                                }
                                throw th;
                            }
                        } else {
                            xp.u7("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        com.google.android.gms.ads.internal.w0.v5();
                        bn.Mz(this.Zo, this.VH, str);
                    }
                }
            } catch (InterruptedException e6) {
                xp.v5("CsiReporter:reporter interrupted", e6);
                return;
            }
        }
    }

    public final void DW(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.Zo = context;
        this.VH = str;
        this.v5 = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.gn = atomicBoolean;
        atomicBoolean.set(((Boolean) cw0.v5().FH(p.dx)).booleanValue());
        if (this.gn.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.u7 = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.FH.put(entry.getKey(), entry.getValue());
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.DW = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new t(this));
        this.Hw.put("action", w.DW);
        this.Hw.put("ad_format", w.DW);
        this.Hw.put("e", w.FH);
    }

    public final boolean Hw(d0 d0Var) {
        return this.j6.offer(d0Var);
    }

    public final void Zo(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.FH.put("e", TextUtils.join(",", list));
    }

    final Map<String, String> j6(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, v5(key).j6((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final w v5(String str) {
        w wVar = this.Hw.get(str);
        return wVar != null ? wVar : w.j6;
    }
}
