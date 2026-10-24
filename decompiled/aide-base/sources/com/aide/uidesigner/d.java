package com.aide.uidesigner;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@cy(clazz = -2705139259622029791L, container = -2705139259622029791L, user = true)
/* loaded from: classes.dex */
public class d {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 5069638513269065968L, container = -2705139259622029791L, user = true)
    static class a implements Comparator<File> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 454140304546296203L)
        a() {
        }

        @Override // java.util.Comparator
        @ey(method = 16011194074055168L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            try {
                if (WB) {
                    iy.EQ(5530343609321838021L, this, file, file2);
                }
                return file.getName().compareTo(file2.getName());
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, 5530343609321838021L, this, file, file2);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(d.class);
    }

    @ey(method = 1406301630850464265L)
    public d() {
        try {
            if (j6) {
                iy.gn(1931914286760774756L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1931914286760774756L, null);
            }
            throw th;
        }
    }

    @ey(method = 2993776136243348095L)
    public static String DW(String str, String str2) {
        try {
            if (j6) {
                iy.EQ(-413584676189093376L, null, str, str2);
            }
            return FH(str, str2, "");
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -413584676189093376L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -177265186231658272L)
    public static long EQ(InputStream inputStream, OutputStream outputStream) {
        try {
            if (j6) {
                iy.EQ(-3843410740143351909L, null, inputStream, outputStream);
            }
            long j = 0;
            byte[] bArr = new byte[1000];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    inputStream.close();
                    outputStream.close();
                    return j;
                }
                j += i;
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3843410740143351909L, null, inputStream, outputStream);
            }
            throw th;
        }
    }

    @ey(method = 1123601631520456749L)
    public static String FH(String str, String str2, String str3) {
        try {
            if (j6) {
                iy.we(-484412775610803360L, null, str, str2, str3);
            }
            try {
                File file = new File(str, "layout");
                file.mkdirs();
                if (str2 == null || str2.trim().length() == 0) {
                    str2 = tp(str);
                }
                File file2 = new File(file, str2);
                if (file2.exists()) {
                    file2 = new File(file, tp(str));
                }
                FileWriter fileWriter = new FileWriter(file2);
                fileWriter.write(str3);
                fileWriter.close();
                return file2.getPath();
            } catch (IOException unused) {
                return null;
            }
        } catch (Throwable th) {
            String str4 = str2;
            if (DW) {
                iy.U2(th, -484412775610803360L, null, str, str4, str3);
            }
            throw th;
        }
    }

    @ey(method = -269470039650535639L)
    public static List<File> Hw(String str) {
        try {
            if (j6) {
                iy.tp(-5637595544212521960L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            File[] fileArrListFiles = new File(str, "layout").listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.getName().endsWith(".xml")) {
                        arrayList.add(file);
                    }
                }
            }
            Collections.sort(arrayList, new a());
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5637595544212521960L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -393577840703554245L)
    public static String VH(Context context, Uri uri) {
        try {
            if (j6) {
                iy.EQ(-6732646976338307100L, null, context, uri);
            }
            if (!"content".equals(uri.getScheme())) {
                if ("file".equals(uri.getScheme())) {
                    return uri.getPath();
                }
                return null;
            }
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
            cursorQuery.moveToFirst();
            return cursorQuery.getString(columnIndexOrThrow);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6732646976338307100L, null, context, uri);
            }
            throw th;
        }
    }

    @ey(method = 2790633882723019245L)
    public static String Zo(Context context, Uri uri) {
        try {
            if (j6) {
                iy.EQ(-759348599259927288L, null, context, uri);
            }
            String strVH = VH(context, uri);
            if (strVH == null) {
                return null;
            }
            return strVH.substring(strVH.lastIndexOf("/") + 1, strVH.length());
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -759348599259927288L, null, context, uri);
            }
            throw th;
        }
    }

    @ey(method = 1829597316155285259L)
    public static String gn() {
        String path = null;
        try {
            if (j6) {
                iy.gn(4676949321758339140L, null);
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!externalStorageDirectory.exists()) {
                return "/mnt/sdcard";
            }
            path = externalStorageDirectory.getPath();
            return path;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4676949321758339140L, path);
            }
            throw th;
        }
    }

    @ey(method = -1354310813535093095L)
    public static String j6(String str) {
        try {
            if (j6) {
                iy.tp(-1488321909622508240L, null, str);
            }
            File[] fileArrListFiles = new File(str, "layout").listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.getName().endsWith(".xml")) {
                        return file.getPath();
                    }
                }
            }
            return DW(str, tp(str));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1488321909622508240L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -596413296498349296L)
    public static String tp(String str) {
        try {
            if (j6) {
                iy.tp(-269436893562331629L, null, str);
            }
            File file = new File(str, "layout");
            file.mkdirs();
            int i = 1;
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append("layout");
                int i2 = i + 1;
                sb.append(i);
                sb.append(".xml");
                File file2 = new File(file, sb.toString());
                if (!file2.exists()) {
                    return file2.getName();
                }
                i = i2;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -269436893562331629L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -5226325944201476520L)
    public static String u7(String str) {
        BufferedReader bufferedReader;
        try {
            if (j6) {
                iy.tp(6076388906223223763L, null, str);
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
                iy.j3(th3, 6076388906223223763L, null, str);
            }
            throw th3;
        }
    }

    @ey(method = -6960280902861977100L)
    public static String v5() {
        try {
            if (j6) {
                iy.gn(764067844874393001L, null);
            }
            return gn() + "/AppProjects/UIDesigns/res";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 764067844874393001L, null);
            }
            throw th;
        }
    }
}
