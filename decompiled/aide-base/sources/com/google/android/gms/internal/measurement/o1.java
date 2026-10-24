package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class o1 {
    private static Object EQ;
    private static HashMap<String, String> Zo;
    private static boolean we;
    public static final Uri j6 = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri DW = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern FH = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern Hw = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean v5 = new AtomicBoolean();
    private static final HashMap<String, Boolean> VH = new HashMap<>();
    private static final HashMap<String, Integer> gn = new HashMap<>();
    private static final HashMap<String, Long> u7 = new HashMap<>();
    private static final HashMap<String, Float> tp = new HashMap<>();
    private static String[] J0 = new String[0];

    private static Map<String, String> DW(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(DW, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return treeMap;
    }

    private static void FH(ContentResolver contentResolver) {
        if (Zo == null) {
            v5.set(false);
            Zo = new HashMap<>();
            EQ = new Object();
            we = false;
            contentResolver.registerContentObserver(j6, true, new p1(null));
            return;
        }
        if (v5.getAndSet(false)) {
            Zo.clear();
            VH.clear();
            gn.clear();
            u7.clear();
            tp.clear();
            EQ = new Object();
            we = false;
        }
    }

    private static void Hw(Object obj, String str, String str2) {
        synchronized (o1.class) {
            if (obj == EQ) {
                Zo.put(str, str2);
            }
        }
    }

    public static String j6(ContentResolver contentResolver, String str, String str2) {
        synchronized (o1.class) {
            FH(contentResolver);
            Object obj = EQ;
            if (Zo.containsKey(str)) {
                String str3 = Zo.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : J0) {
                if (str.startsWith(str4)) {
                    if (!we || Zo.isEmpty()) {
                        Zo.putAll(DW(contentResolver, J0));
                        we = true;
                        if (Zo.containsKey(str)) {
                            String str5 = Zo.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor cursorQuery = contentResolver.query(j6, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    Hw(obj, str, null);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                Hw(obj, str, string);
                String str6 = string != null ? string : null;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return str6;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }
}
