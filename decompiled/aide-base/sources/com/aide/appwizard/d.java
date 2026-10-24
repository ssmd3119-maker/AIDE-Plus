package com.aide.appwizard;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@cy(clazz = 2080007746348708736L, container = 2080007746348708736L, user = true)
/* loaded from: classes.dex */
public class d {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(d.class);
    }

    @ey(method = -2065774699625337180L)
    public d() {
        try {
            if (j6) {
                iy.gn(592590467621090840L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 592590467621090840L, null);
            }
            throw th;
        }
    }

    @ey(method = -3064548728250880685L)
    public static String DW(String str) {
        BufferedReader bufferedReader;
        try {
            if (j6) {
                iy.tp(-2651439463917296211L, null, str);
            }
            if (str == null) {
                return "";
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), "UTF-8"));
                try {
                    char[] cArr = new char[1024];
                    while (true) {
                        int i = bufferedReader.read(cArr);
                        if (i == -1) {
                            break;
                        }
                        stringBuffer.append(String.valueOf(cArr, 0, i));
                    }
                    bufferedReader.close();
                    String string = stringBuffer.toString();
                    try {
                        bufferedReader.close();
                    } catch (Exception unused) {
                    }
                    return string;
                } catch (IOException unused2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            if (DW) {
                iy.j3(th3, -2651439463917296211L, null, str);
            }
            throw th3;
        }
    }

    @ey(method = 4378968810521669572L)
    public static String j6() {
        String path = null;
        try {
            if (j6) {
                iy.gn(-981198410316821352L, null);
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!externalStorageDirectory.exists()) {
                return "/mnt/sdcard";
            }
            path = externalStorageDirectory.getPath();
            return path;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -981198410316821352L, path);
            }
            throw th;
        }
    }
}
