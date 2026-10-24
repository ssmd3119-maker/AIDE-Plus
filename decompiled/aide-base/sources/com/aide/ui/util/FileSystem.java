package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.os.Environment;
import androidx.core.content.ContextCompat;
import com.aide.codemodel.language.classfile.ClassFilePreProcessor;
import com.aide.common.StreamUtilities;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@cy(clazz = 1736030230469303457L, container = 1736030230469303457L, user = true)
/* loaded from: classes.dex */
public class FileSystem {

    @dy(field = -536732734201478387L)
    private static Context DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 5423035936608927923L)
    private static ClassFilePreProcessor j6;

    @cy(clazz = -1911016727548804344L, container = 1736030230469303457L, user = true)
    static class a extends Reader {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 1866861208145981619L)
        final /* synthetic */ Reader WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -8364928668560405180L)
        public a(Reader reader) {
            this.WB = reader;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        @ey(method = 2867503885742482952L)
        public void close() {
            try {
                if (mb) {
                    iy.gn(-1215302715870174967L, this);
                }
                FileSystem.j6.VH();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -1215302715870174967L, this);
                }
                throw th;
            }
        }

        @Override // java.io.Reader
        @ey(method = -96422478427136920L)
        public int read(char[] cArr, int i, int i2) {
            try {
                if (mb) {
                    iy.we(1255739182504994635L, this, cArr, new Integer(i), new Integer(i2));
                }
                return this.WB.read(cArr, i, i2);
            } catch (Throwable th) {
                if (jw) {
                    iy.U2(th, 1255739182504994635L, this, cArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(FileSystem.class);
            if (FH) {
                iy.gn(-34971939147887744L, null);
            }
            j6 = new ClassFilePreProcessor();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -34971939147887744L, null);
            }
            throw th;
        }
    }

    @ey(method = -3037487955418492997L)
    public FileSystem() {
        try {
            if (FH) {
                iy.gn(-215856102185202381L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -215856102185202381L, null);
            }
            throw th;
        }
    }

    @ey(method = 4987485041909975216L)
    public static String BT(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(2555070330157146741L, null, str, str2);
            }
            return str.equals(str2) ? "" : str2.substring(str.length() + 1, str2.length());
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2555070330157146741L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2141468342543933056L)
    public static boolean DW(long j, long j2) {
        try {
            if (FH) {
                iy.EQ(-1542902813803950633L, null, new Long(j), new Long(j2));
            }
            long jAbs = Math.abs(j - j2);
            if (jAbs <= 1000) {
                return true;
            }
            return jAbs % 3600000 <= 0 ? jAbs <= 46800000 : (jAbs - 1000) % 3600000 == 0 ? jAbs <= 46800000 : (1000 + jAbs) % 3600000 == 0 && jAbs <= 46800000;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1542902813803950633L, null, new Long(j), new Long(j2));
            }
            throw th;
        }
    }

    @ey(method = -1486820347988611416L)
    public static String EQ(File file) {
        try {
            if (FH) {
                iy.tp(81175897695934767L, null, file);
            }
            ArrayList<String> arrayList = new ArrayList();
            String absolutePath = file.getAbsolutePath();
            for (String str : absolutePath.split("/|\\\\")) {
                if (str.length() != 0 && !".".equals(str)) {
                    if (!"..".equals(str)) {
                        arrayList.add(str);
                    } else {
                        if (arrayList.isEmpty()) {
                            return absolutePath;
                        }
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : arrayList) {
                sb.append("/");
                sb.append(str2);
            }
            if (absolutePath.endsWith("/")) {
                sb.append("/");
            }
            return sb.toString();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 81175897695934767L, null, file);
            }
            throw th;
        }
    }

    @ey(method = 2307785648589149712L)
    public static void FH(String str) {
        try {
            if (FH) {
                iy.tp(-723687878665901797L, null, str);
            }
            if (new File(str).mkdir()) {
                return;
            }
            throw new IOException(str + " could not be created");
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -723687878665901797L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2584090322261348515L)
    public static void Hw(String str) {
        try {
            if (FH) {
                iy.tp(1483811229604750224L, null, str);
            }
            if (!new File(str).exists()) {
                new File(str).createNewFile();
                return;
            }
            throw new IOException(str + " already exists");
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1483811229604750224L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 745073248543157313L)
    public static String I(Reader reader) {
        try {
            if (FH) {
                iy.tp(-404394288049635744L, null, reader);
            }
            char[] cArr = new char[4096];
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i = reader.read(cArr);
                if (i <= 0) {
                    return stringBuffer.toString();
                }
                stringBuffer.append(cArr, 0, i);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -404394288049635744L, null, reader);
            }
            throw th;
        }
    }

    @ey(method = -672953394152762379L)
    public static List<String> J0(String str) {
        String str2 = "/";
        try {
            if (FH) {
                iy.tp(-2383992720345998160L, null, str);
            }
            if (sh(str)) {
                List<String> listJ8 = j6.J8(QX(str), a8(str));
                return listJ8 == null ? new ArrayList() : listJ8;
            }
            String[] list = new File(str).list();
            if (list != null) {
                int length = list.length;
                String[] strArr = new String[length];
                if (!str.equals("/")) {
                    str2 = str + File.separator;
                }
                for (int i = 0; i < length; i++) {
                    strArr[i] = str2 + list[i];
                }
                return Arrays.asList(strArr);
            }
            String strEQ = EQ(new File(str));
            if (!strEQ.endsWith(File.separator)) {
                strEQ = strEQ + File.separator;
            }
            String[] strArr2 = {vy()};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 1; i2++) {
                String strEQ2 = EQ(new File(strArr2[i2]));
                if (strEQ2.startsWith(strEQ) && !strEQ2.equals(strEQ)) {
                    int iIndexOf = strEQ2.indexOf(File.separator, strEQ.length() + 1);
                    if (iIndexOf < 0) {
                        iIndexOf = strEQ2.length();
                    }
                    arrayList.add(strEQ2.substring(0, iIndexOf));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2383992720345998160L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 792379722599165052L)
    public static int J8(String str, int i, String... strArr) {
        try {
            if (FH) {
                iy.we(9414144586089529L, null, str, new Integer(i), strArr);
            }
            int iJ8 = 0;
            if (isDirectory(str)) {
                try {
                    Iterator<String> it = J0(str).iterator();
                    while (it.hasNext() && (iJ8 = iJ8 + J8(it.next(), i, strArr)) < i) {
                    }
                } catch (IOException unused) {
                }
                return iJ8;
            }
            if (isFileAndNotZip(str)) {
                for (String str2 : strArr) {
                    if (str.endsWith(str2)) {
                        return 1;
                    }
                }
            }
            return 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 9414144586089529L, null, str, new Integer(i), strArr);
            }
            throw th;
        }
    }

    @ey(method = -529528492483413345L)
    public static boolean KD(String str) {
        try {
            if (FH) {
                iy.tp(-9012159671588932488L, null, str);
            }
            if (isFileAndNotZip(str) || cb(str)) {
                if (!isJarOrZipFile(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -9012159671588932488L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2273039501077335200L)
    public static String Mr(String str, String str2, String str3) {
        try {
            if (FH) {
                iy.we(-3197553558419385989L, null, str, str2, str3);
            }
            return str3 + str.substring(str2.length(), str.length());
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -3197553558419385989L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -1128740869296853565L)
    public static Reader Mz(String str) {
        try {
            if (FH) {
                iy.tp(-728787099937647160L, null, str);
            }
            if (isFileAndNotZip(str)) {
                return new FileReader(str);
            }
            if (cb(str)) {
                return ca(str);
            }
            throw new IOException();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -728787099937647160L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2071108728997548432L)
    public static void OW(String str, Reader reader) {
        try {
            if (FH) {
                iy.EQ(-15941858901400005L, null, str, reader);
            }
            FileWriter fileWriter = new FileWriter(str, false);
            fileWriter.append((CharSequence) I(reader));
            fileWriter.close();
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -15941858901400005L, null, str, reader);
            }
            throw th;
        }
    }

    @ey(method = 6001381656079324380L)
    public static void P8(Context context) {
        try {
            if (FH) {
                iy.tp(-2011097585176329125L, null, context);
            }
            DW = context;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2011097585176329125L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -4515002782207948224L)
    private static String QX(String str) {
        try {
            if (FH) {
                iy.tp(5013616696742686395L, null, str);
            }
            if (isJarOrZipFile(str)) {
                return str;
            }
            String parent = str;
            do {
                parent = getParent(parent);
                if (parent == null) {
                    return null;
                }
            } while (!isJarOrZipFile(parent));
            return parent;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 5013616696742686395L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1495068851827020260L)
    public static String Qq(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(-2450947388167519769L, null, str, str2);
            }
            return sy(str, str2);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2450947388167519769L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1490674029853515452L)
    public static boolean SI(String str) {
        try {
            if (FH) {
                iy.tp(-129217535771189385L, null, str);
            }
            if (!isDirectory(str)) {
                if (!cn(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -129217535771189385L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 585262217444082357L)
    public static boolean Sf(String str) {
        try {
            if (FH) {
                iy.tp(52699472292212800L, null, str);
            }
            return str.equals("/");
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 52699472292212800L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3947665982489880832L)
    public static String U2() {
        try {
            if (FH) {
                iy.gn(1600707000363707025L, null);
            }
            return DW.getFilesDir().getPath();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1600707000363707025L, null);
            }
            throw th;
        }
    }

    @ey(method = 454728881192187272L)
    public static void VH(String str) {
        try {
            if (FH) {
                iy.tp(18369231772589555L, null, str);
            }
            Zo(new File(str));
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 18369231772589555L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3708871586916712944L)
    public static String Ws(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(-5135200951586704995L, null, str, str2);
            }
            str = getParent(str);
            while (str != null) {
                if (getName(str).equals(str2)) {
                    return str;
                }
                str = getParent(str);
            }
            return null;
        } catch (Throwable th) {
            String str3 = str;
            if (Hw) {
                iy.Mr(th, -5135200951586704995L, null, str3, str2);
            }
            throw th;
        }
    }

    @ey(method = -4307057087495817824L)
    public static String XL(String str) {
        try {
            if (FH) {
                iy.tp(777233767327094583L, null, str);
            }
            String name = getName(str);
            int iLastIndexOf = name.lastIndexOf(46);
            return iLastIndexOf < 0 ? "" : name.substring(iLastIndexOf + 1, name.length());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 777233767327094583L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1541882398594178841L)
    private static void Zo(File file) {
        String[] list;
        try {
            if (FH) {
                iy.tp(-252711464193231680L, null, file);
            }
            if (file.isDirectory() && (list = file.list()) != null) {
                for (String str : list) {
                    Zo(new File(file, str));
                }
            }
            if (file.delete()) {
                return;
            }
            throw new IOException(file.getPath() + " could not be deleted");
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -252711464193231680L, null, file);
            }
            throw th;
        }
    }

    @ey(method = -2600256375630916405L)
    private static String a8(String str) {
        try {
            if (FH) {
                iy.tp(3537424169481326592L, null, str);
            }
            String strQX = QX(str);
            return strQX.length() == str.length() ? "" : str.substring(strQX.length() + 1, str.length());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3537424169481326592L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 225647776204272744L)
    public static String aM() {
        try {
            if (FH) {
                iy.gn(-4757022740826299475L, null);
            }
            File externalCacheDir = DW.getExternalCacheDir();
            if (externalCacheDir == null) {
                externalCacheDir = DW.getCacheDir();
            }
            return externalCacheDir.getPath();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -4757022740826299475L, null);
            }
            throw th;
        }
    }

    @ey(method = 17875185654455976L)
    public static void aj(String str) {
        try {
            if (FH) {
                iy.tp(3567576755361035985L, null, str);
            }
            File file = new File(str);
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                long length = randomAccessFile.length();
                randomAccessFile.setLength(1 + length);
                randomAccessFile.setLength(length);
                randomAccessFile.close();
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } catch (Throwable th2) {
            if (Hw) {
                iy.j3(th2, 3567576755361035985L, null, str);
            }
            throw th2;
        }
    }

    @ey(method = 6298653007269346464L)
    private static Reader ca(String str) {
        try {
            if (FH) {
                iy.tp(3229512865657389337L, null, str);
            }
            return new a(j6.QX(QX(str), a8(str), null));
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3229512865657389337L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 794644856306492560L)
    public static boolean cb(String str) {
        try {
            if (FH) {
                iy.tp(-3556820254293970915L, null, str);
            }
            if (QX(str) != null) {
                if (j6.Mr(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3556820254293970915L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -6914832699025468625L)
    public static boolean cn(String str) {
        try {
            if (FH) {
                iy.tp(-4633359068939577120L, null, str);
            }
            if (QX(str) != null) {
                if (!j6.Mr(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4633359068939577120L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2695884835606479376L)
    public static boolean ef(String str, String str2) {
        String line;
        try {
            if (FH) {
                iy.EQ(-5476940013961158979L, null, str, str2);
            }
            try {
                Pattern patternCompile = Pattern.compile(str);
                Reader readerMz = Mz(str2);
                try {
                    BufferedReader bufferedReader = new BufferedReader(readerMz);
                    do {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            return false;
                        }
                    } while (!patternCompile.matcher(line).find());
                    return true;
                } finally {
                    readerMz.close();
                }
            } catch (IOException unused) {
                return false;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -5476940013961158979L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1773201392315770484L)
    public static boolean ei(String str) {
        try {
            if (FH) {
                iy.tp(1084099894898311057L, null, str);
            }
            if (cb(str)) {
                return false;
            }
            long length = new File(str).length();
            int i = 8000 < length ? 8000 : (int) length;
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[i];
                    new DataInputStream(fileInputStream).readFully(bArr);
                    for (int i2 = 0; i2 < i; i2++) {
                        if (bArr[i2] == 0) {
                            fileInputStream.close();
                            return true;
                        }
                    }
                    return false;
                } finally {
                    fileInputStream.close();
                }
            } catch (IOException unused) {
                return false;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1084099894898311057L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 473257072118725029L)
    public static boolean exists(String str) {
        try {
            if (FH) {
                iy.tp(86298649490941376L, null, str);
            }
            if (!new File(str).exists()) {
                if (!cb(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 86298649490941376L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -27874790677022961L)
    public static boolean g3(String str) {
        try {
            if (FH) {
                iy.tp(-14207538927135840L, null, str);
            }
            return new File(str).mkdirs();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -14207538927135840L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2288812631571144L)
    public static String getName(String str) {
        try {
            if (FH) {
                iy.tp(-482240675072262407L, null, str);
            }
            return str.substring(str.lastIndexOf(47) + 1);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -482240675072262407L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3047932490540589625L)
    public static String getParent(String str) {
        try {
            if (FH) {
                iy.tp(288844778091542652L, null, str);
            }
            if (str.length() == 0 || str.equals("/")) {
                return null;
            }
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf == 0) {
                return "/";
            }
            if (iLastIndexOf == -1) {
                return null;
            }
            return str.substring(0, iLastIndexOf);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 288844778091542652L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -4969067739806741869L)
    public static boolean isDirectory(String str) {
        try {
            if (FH) {
                iy.tp(-6265010126763345620L, null, str);
            }
            return new File(str).isDirectory();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -6265010126763345620L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2965826803485045016L)
    public static boolean isFileAndNotZip(String str) {
        try {
            if (FH) {
                iy.tp(1701458594852363739L, null, str);
            }
            if (new File(str).isFile()) {
                if (!isJarOrZipFile(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1701458594852363739L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 50649138316466872L)
    private static boolean isJarOrZipFile(String str) {
        try {
            if (FH) {
                iy.tp(-8064278559476058399L, null, str);
            }
            if (new File(str).isFile()) {
                if (!str.endsWith(".jar")) {
                    if (str.endsWith(".zip")) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -8064278559476058399L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 508160804472262835L)
    public static String j3() {
        try {
            if (FH) {
                iy.gn(281068964592893352L, null);
            }
            return DW.getPackageName() + ".fileprovider";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 281068964592893352L, null);
            }
            throw th;
        }
    }

    @ey(method = -1423056133597251440L)
    public static long lg(String str) {
        try {
            if (FH) {
                iy.tp(-3038342380781504439L, null, str);
            }
            return new File(str).lastModified();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3038342380781504439L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3569497232992924772L)
    public static String lp(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(1277790635005095079L, null, str, str2);
            }
            return nw(str, str2) ? str2.substring(str.length() + 1, str2.length()) : str2;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1277790635005095079L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -91179065158319636L)
    public static boolean nw(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(-3593682895902197605L, null, str, str2);
            }
            if (str2 != null) {
                if (!str2.equals(str)) {
                    if (str2.startsWith(str + "/")) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -3593682895902197605L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -104748157580057392L)
    public static long rN(String str) {
        try {
            if (FH) {
                iy.tp(-2464643554325931693L, null, str);
            }
            return new File(str).length();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2464643554325931693L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1517969994520135968L)
    public static boolean sh(String str) {
        try {
            if (FH) {
                iy.tp(-2157979276541302775L, null, str);
            }
            return QX(str) != null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2157979276541302775L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 197188509315324520L)
    private static String sy(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(5017540230360799131L, null, str, str2);
            }
            String strReplace = str2.replace("\\\\", "/").replace("\\", "/");
            if (!strReplace.contains("/")) {
                return str + "/" + strReplace;
            }
            if (strReplace.startsWith("/")) {
                strReplace = ".." + strReplace;
            }
            String strEQ = EQ(new File(str, strReplace));
            return new File(strEQ).exists() ? strEQ : str2;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 5017540230360799131L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2379234946978192651L)
    public static String tp() {
        try {
            if (FH) {
                iy.gn(-4207137317683362816L, null);
            }
            return DW.getCacheDir().getPath();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -4207137317683362816L, null);
            }
            throw th;
        }
    }

    @ey(method = 295304701189170015L)
    public static void u7(InputStream inputStream, String str, boolean z) {
        try {
            if (FH) {
                iy.we(-295414839780222864L, null, inputStream, str, new Boolean(z));
            }
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return;
                }
                String str2 = str + File.separator + nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    new File(str2).mkdirs();
                } else if (z || !new File(str2).isFile()) {
                    new File(str2).getParentFile().mkdirs();
                    FileOutputStream fileOutputStream = new FileOutputStream(str2);
                    StreamUtilities.VH(zipInputStream, fileOutputStream, false);
                    fileOutputStream.close();
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -295414839780222864L, null, inputStream, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 784672126219654591L)
    public static void v5(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(2025472790921070648L, null, str, str2);
            }
            if (new File(str).exists()) {
                throw new IOException(str + " already exists");
            }
            FileWriter fileWriter = new FileWriter(str);
            fileWriter.write(str2);
            fileWriter.close();
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2025472790921070648L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2741897337198481612L)
    public static boolean vJ(String str) {
        try {
            if (FH) {
                iy.tp(-4151694166275401025L, null, str);
            }
            if (str.startsWith("/")) {
                if (isDirectory(getParent(str))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -4151694166275401025L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1820819324069741025L)
    public static String vy() {
        String path = null;
        try {
            if (FH) {
                iy.gn(-3558726583697401800L, null);
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!externalStorageDirectory.exists()) {
                return "/mnt/sdcard";
            }
            path = externalStorageDirectory.getPath();
            return path;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3558726583697401800L, path);
            }
            throw th;
        }
    }

    @ey(method = 8470407095848392336L)
    public static List<String> we(String str) {
        try {
            if (FH) {
                iy.tp(-6943778665509984075L, null, str);
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : J0(str)) {
                if (SI(str2)) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -6943778665509984075L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 855361253429822645L)
    public static void x9(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(57658662308545600L, null, str, str2);
            }
            File file = new File(str2);
            if (file.exists()) {
                throw new IOException(str2 + " already exists");
            }
            if (new File(str).renameTo(file)) {
                return;
            }
            throw new IOException(str + " could not be renamed");
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 57658662308545600L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -20814206660421723L)
    public static String yS() {
        try {
            if (FH) {
                iy.gn(8935315508610390168L, null);
            }
            return ContextCompat.getNoBackupFilesDir(DW).getPath();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 8935315508610390168L, null);
            }
            throw th;
        }
    }
}
