package abcd;

import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Compiler;
import com.aide.codemodel.api.collections.MapOfIntLong;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import com.aide.ui.util.FilePatternMatcher;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

@cy(clazz = -138465097617559095L, container = -138465097617559095L, user = true)
/* loaded from: classes.dex */
public class m1 {

    @fy
    private static /* synthetic */ boolean lg;

    @gy
    private static /* synthetic */ boolean rN;

    @dy(field = -94061398654631305L)
    private final boolean DW;

    @dy(field = -3754002850997011083L)
    private int EQ;

    @dy(field = -1267249966586413280L)
    private final boolean FH;

    @dy(field = 1327982891656034292L)
    private byte[] Hw;

    @dy(field = 4326513455866360640L)
    private Hashtable<String, f> J0;

    @dy(field = 2884880485354053360L)
    private Hashtable<String, String> J8;

    @dy(field = -1246952313389204565L)
    private SetOfFileEntry Mr;

    @dy(field = -5046409195263832116L)
    private Hashtable<String, FileEntry> QX;

    @dy(field = -5414674721210049808L)
    private SetOfFileEntry U2;

    @dy(field = -1201104738636640005L)
    private CRC32 VH;

    @dy(field = 38060236732378760L)
    private Hashtable<String, Long> Ws;

    @dy(field = -4331618813037513200L)
    private Hashtable<String, Long> XL;

    @dy(field = 2245115871031974387L)
    private byte[] Zo;

    @dy(field = -2675077108102890375L)
    private boolean a8;

    @dy(field = -5215871246861597175L)
    private Hashtable<String, Long> aM;

    @dy(field = -4708691905227756663L)
    private HashMap<String, Long> gn;

    @dy(field = -6241218120019979213L)
    private MapOfIntLong j3;

    @dy(field = -806497165937754675L)
    private final Model j6;

    @dy(field = -2248918525700697664L)
    private HashSet<String> tp;

    @dy(field = -24840114487486656L)
    private HashSet<String> u7;

    @dy(field = 1327946674021598475L)
    private byte[] v5;

    @dy(field = -1993071335255836936L)
    private Hashtable<String, String> we;

    @cy(clazz = -6266770808682746200L, container = -138465097617559095L, user = true)
    class a extends g {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -2357261615585505421L)
        final /* synthetic */ String FH;

        static {
            iy.Zo(a.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -681967557836531964L)
        public a(m1 m1Var, String str) {
            super(null);
            this.FH = str;
        }

        @Override // abcd.m1.g
        @ey(method = -2704588980197683563L)
        public void DW(String str) {
            try {
                if (Hw) {
                    iy.tp(-197586489804212497L, this, str);
                }
                try {
                    new File(str).getAbsolutePath();
                    if (new File(str).getCanonicalPath().equals(this.FH)) {
                        return;
                    }
                    new File(str).delete();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -197586489804212497L, this, str);
                }
                throw th;
            }
        }

        @Override // abcd.m1.g
        @ey(method = 52700490146919312L)
        public void FH(String str) {
            try {
                if (Hw) {
                    iy.tp(89075701794184155L, this, str);
                }
                new File(str).delete();
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 89075701794184155L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -6266881370596813027L, container = -138465097617559095L, user = true)
    class b extends g {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -4196415210727080L)
        public b(m1 m1Var) {
            super(null);
        }

        @Override // abcd.m1.g
        @ey(method = 1459063639956626340L)
        public void FH(String str) {
            try {
                if (FH) {
                    iy.tp(-8092432158135002424L, this, str);
                }
                if (str.toUpperCase(Locale.US).endsWith(".CLASS") || str.toUpperCase(Locale.US).endsWith(".DEX")) {
                    new File(str).delete();
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -8092432158135002424L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -6266991932506816560L, container = -138465097617559095L, user = true)
    class c implements Comparator<String> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -62973001687631607L)
        public c(m1 m1Var) {
        }

        @Override // java.util.Comparator
        @ey(method = 949169310741728555L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            try {
                if (WB) {
                    iy.EQ(-233427564669915015L, this, str, str2);
                }
                int length = str.length() - 6;
                int length2 = str2.length() - 6;
                int i = length < length2 ? length : length2;
                for (int i2 = 0; i2 < i; i2++) {
                    char cCharAt = str.charAt(i2);
                    char cCharAt2 = str2.charAt(i2);
                    if (cCharAt == '$' && cCharAt != cCharAt2) {
                        return -1;
                    }
                    if (cCharAt2 == '$' && cCharAt != cCharAt2) {
                        return 1;
                    }
                    if (cCharAt == '+' && cCharAt != cCharAt2) {
                        return -1;
                    }
                    if (cCharAt2 == '+' && cCharAt != cCharAt2) {
                        return 1;
                    }
                    int i3 = cCharAt - cCharAt2;
                    if (i3 < 0) {
                        return -1;
                    }
                    if (i3 > 0) {
                        return 1;
                    }
                }
                if (length < length2) {
                    return -1;
                }
                return length > length2 ? 1 : 0;
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -233427564669915015L, this, str, str2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 525333686283588000L, container = 525333686283588000L, user = true)
    private class d implements f {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1409345091298352300L)
        private int DW;

        @dy(field = -347535602737157163L)
        private byte[] j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -191081838706876368L)
        private d(m1 m1Var) {
            try {
                if (FH) {
                    iy.tp(-4531011859978296121L, null, m1Var);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -4531011859978296121L, null, m1Var);
                }
                throw th;
            }
        }

        @ey(method = -1552410027816620648L)
        public void FH(byte[] bArr, int i) {
            try {
                if (FH) {
                    iy.EQ(57545605224998352L, this, bArr, new Integer(i));
                }
                if (this.j6 == null || i > this.j6.length) {
                    this.j6 = new byte[(i * 5) / 4];
                }
                System.arraycopy(bArr, 0, this.j6, 0, i);
                this.DW = i;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 57545605224998352L, this, bArr, new Integer(i));
                }
                throw th;
            }
        }

        @Override // abcd.m1.f
        @ey(method = 545980890922455416L)
        public void j6(OutputStream outputStream) {
            try {
                if (FH) {
                    iy.tp(-31053156539427904L, this, outputStream);
                }
                outputStream.write(this.j6, 0, this.DW);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -31053156539427904L, this, outputStream);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 148197689726141440L)
        public /* synthetic */ d(m1 m1Var, a aVar) {
            this(m1Var);
            try {
                if (FH) {
                    iy.EQ(3796474093479133379L, null, m1Var, aVar);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 3796474093479133379L, null, m1Var, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1591188307579312764L, container = -1591188307579312764L, user = true)
    private interface f {
        @ey(method = -1534515017349874923L)
        void j6(OutputStream outputStream);
    }

    @cy(clazz = -4503838375618442913L, container = -4503838375618442913L, user = true)
    private static class g {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -629777823490240100L)
        private g() {
            try {
                if (j6) {
                    iy.gn(3647076030398197215L, null);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.aM(th, 3647076030398197215L, null);
                }
                throw th;
            }
        }

        @ey(method = -2233799769913081780L)
        public void DW(String str) {
            try {
                if (j6) {
                    iy.tp(-1121195011469682075L, this, str);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -1121195011469682075L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 2107843403410766463L)
        public void FH(String str) {
            try {
                if (j6) {
                    iy.tp(2058758450159574780L, this, str);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 2058758450159574780L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -2777120425903458789L)
        public void Hw(String str) {
            try {
                if (j6) {
                    iy.tp(-35161170947988120L, this, str);
                }
                String strTrim = str.trim();
                if (strTrim.endsWith(":") && strTrim.indexOf("\\") == -1) {
                    str = strTrim + "\\";
                }
                File file = new File(str);
                if (file.isDirectory()) {
                    if (str != null) {
                        j6(str);
                    }
                } else if (file.isFile() && str != null) {
                    FH(str);
                }
                String[] list = file.list();
                if (list != null) {
                    for (String str2 : list) {
                        Hw(str + File.separator + str2);
                    }
                    DW(str);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -35161170947988120L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -94863622573986128L)
        public void j6(String str) {
            try {
                if (j6) {
                    iy.tp(-2538763821932889375L, this, str);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -2538763821932889375L, this, str);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -281310545495116300L)
        public /* synthetic */ g(a aVar) {
            this();
            try {
                if (j6) {
                    iy.tp(4114327490402086979L, null, aVar);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 4114327490402086979L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -144266338022448408L, container = -144266338022448408L, user = true)
    private class h implements f {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 2818332119819082768L)
        @hy
        final /* synthetic */ m1 DW;

        @dy(field = -397093843952245167L)
        final String j6;

        static {
            iy.Zo(h.class);
        }

        @ey(method = -615196118042513712L)
        public h(m1 m1Var, String str) {
            try {
                if (FH) {
                    iy.EQ(-264344965767182844L, null, m1Var, str);
                }
                this.DW = m1Var;
                this.j6 = str;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -264344965767182844L, null, m1Var, str);
                }
                throw th;
            }
        }

        @Override // abcd.m1.f
        @ey(method = 1638110349260938588L)
        public void j6(OutputStream outputStream) {
            byte[] bArr;
            try {
                if (FH) {
                    iy.tp(-861679735713209349L, this, outputStream);
                }
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.j6));
                    if (this.DW.v5 != null) {
                        bArr = this.DW.v5;
                        this.DW.v5 = null;
                    } else {
                        bArr = new byte[10000];
                    }
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            bufferedInputStream.close();
                            this.DW.v5 = bArr;
                            return;
                        }
                        outputStream.write(bArr, 0, i);
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -861679735713209349L, this, outputStream);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(m1.class);
    }

    @ey(method = 195688511785221504L)
    public m1(Model model) {
        try {
            if (lg) {
                iy.tp(-286768731129528089L, null, model);
            }
            this.Zo = new byte[10000];
            this.VH = new CRC32();
            new Deflater(1);
            new Inflater();
            new ByteArrayOutputStream();
            this.gn = new HashMap<>();
            this.u7 = new HashSet<>();
            this.tp = new HashSet<>();
            this.we = new Hashtable<>();
            this.J0 = new Hashtable<>();
            this.J8 = new Hashtable<>();
            this.Ws = new Hashtable<>();
            this.QX = new Hashtable<>();
            this.XL = new Hashtable<>();
            this.aM = new Hashtable<>();
            this.j3 = new MapOfIntLong();
            this.j6 = model;
            this.DW = false;
            this.FH = false;
            this.Mr = new SetOfFileEntry(model.fileSpace);
            this.U2 = new SetOfFileEntry(model.fileSpace);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -286768731129528089L, null, model);
            }
            throw th;
        }
    }

    @ey(method = -692871864784045560L)
    private boolean BT() {
        try {
            if (lg) {
                iy.gn(167095532846251548L, this);
            }
            Iterator<String> it = this.u7.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!new File(next).isDirectory()) {
                    return true;
                }
                if (!new File(next).exists() && next.toUpperCase(Locale.US).endsWith(".JAR")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 167095532846251548L, this);
            }
            throw th;
        }
    }

    @ey(method = -1123685315930323335L)
    private boolean Mz(boolean z) {
        ArrayList arrayList;
        boolean z2;
        ZipInputStream zipInputStream;
        ArrayList arrayList2;
        ZipInputStream zipInputStream2;
        try {
            if (lg) {
                iy.Ws(-722447748563191785L, this, z);
            }
            IOException e2 = null;
            ArrayList arrayList3 = new ArrayList();
            Enumeration<String> enumerationKeys = this.J0.keys();
            while (enumerationKeys.hasMoreElements()) {
                arrayList3.add(enumerationKeys.nextElement());
            }
            Collections.sort(arrayList3, new c(this));
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator<String> it = this.u7.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (new File(next).isDirectory() || (!new File(next).exists() && !next.toUpperCase(Locale.US).endsWith(".JAR"))) {
                    hashSet.add(next);
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (str.startsWith(next) && !this.tp.contains(str)) {
                            String str2 = this.we.get(str);
                            if (!hashSet2.contains(str2) && !new File(str2).exists()) {
                                new File(str2).mkdirs();
                            }
                            hashSet2.add(str2);
                        }
                    }
                }
            }
            Iterator<String> it3 = this.u7.iterator();
            boolean z3 = false;
            while (it3.hasNext()) {
                String next2 = it3.next();
                long j = 0;
                if (hashSet.contains(next2)) {
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        String str3 = (String) it4.next();
                        if (str3.startsWith(next2) && !this.tp.contains(str3)) {
                            try {
                                f fVar = this.J0.get(str3);
                                if (this.Ws.containsKey(str3)) {
                                    long jLongValue = this.Ws.get(str3).longValue();
                                    long diskVersion = this.QX.get(str3).getDiskVersion();
                                    if (jLongValue == 0 || jLongValue == diskVersion) {
                                        if (this.DW) {
                                            System.out.println("Writing " + str3);
                                        }
                                        FileOutputStream fileOutputStream = new FileOutputStream(str3);
                                        fVar.j6(fileOutputStream);
                                        fileOutputStream.close();
                                        z3 = true;
                                    }
                                }
                            } catch (IOException e3) {
                                e2 = e3;
                            }
                        }
                    }
                    Enumeration<String> enumerationKeys2 = this.Ws.keys();
                    while (enumerationKeys2.hasMoreElements()) {
                        String strNextElement = enumerationKeys2.nextElement();
                        if (strNextElement.startsWith(next2) && !this.tp.contains(strNextElement)) {
                            long jLongValue2 = this.Ws.get(strNextElement).longValue();
                            if (jLongValue2 != j && new File(strNextElement).exists() && new File(strNextElement).lastModified() < jLongValue2) {
                                if (this.DW) {
                                    System.out.println("Touching " + strNextElement);
                                }
                                File file = new File(strNextElement);
                                if (g4.j6() != null) {
                                    g4.j6().DW(file, jLongValue2);
                                }
                            }
                        }
                        j = 0;
                    }
                    arrayList = arrayList3;
                    z2 = z3;
                } else {
                    try {
                        if (!new File(next2).exists()) {
                            try {
                                gW(next2);
                            } catch (IOException unused) {
                            }
                        }
                        ZipInputStream zipInputStream3 = new ZipInputStream(new FileInputStream(next2));
                        while (true) {
                            try {
                                try {
                                    ZipEntry nextEntry = zipInputStream3.getNextEntry();
                                    if (nextEntry == null) {
                                        break;
                                    }
                                    arrayList = arrayList3;
                                    try {
                                        String str4 = next2 + nextEntry.getName().replace('/', File.separatorChar);
                                        if (!str4.endsWith(".class") && this.Ws.containsKey(str4) && (nextEntry.getTime() / 2000) * 2000 >= this.Ws.get(str4).longValue()) {
                                            this.J0.remove(str4);
                                        }
                                        zipInputStream3.closeEntry();
                                        arrayList3 = arrayList;
                                    } catch (Throwable th) {
                                        th = th;
                                        zipInputStream3.close();
                                        throw th;
                                    }
                                } catch (IOException e4) {
                                    e2 = e4;
                                    z2 = true;
                                    z3 = z2;
                                    arrayList3 = arrayList;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        zipInputStream3.close();
                        Enumeration<String> enumerationKeys3 = this.J0.keys();
                        while (enumerationKeys3.hasMoreElements()) {
                            if (enumerationKeys3.nextElement().startsWith(next2)) {
                                if (this.DW) {
                                    System.out.println("Creating " + next2);
                                }
                                String str5 = next2.substring(0, next2.length() - 1) + "~";
                                if (new File(str5).exists()) {
                                    new File(str5).delete();
                                }
                                ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(str5));
                                if (!z) {
                                    zipOutputStream.setLevel(0);
                                }
                                ZipInputStream zipInputStream4 = new ZipInputStream(new FileInputStream(next2));
                                while (true) {
                                    try {
                                        ZipEntry nextEntry2 = zipInputStream4.getNextEntry();
                                        if (nextEntry2 == null) {
                                            break;
                                        }
                                        ArrayList arrayList4 = arrayList3;
                                        ZipInputStream zipInputStream5 = zipInputStream4;
                                        String str6 = next2 + File.separator + nextEntry2.getName().replace('/', File.separatorChar);
                                        if (this.J0.containsKey(str6)) {
                                            zipInputStream = zipInputStream5;
                                        } else {
                                            this.J0.remove(str6);
                                            zipOutputStream.putNextEntry(nextEntry2);
                                            while (true) {
                                                zipInputStream = zipInputStream5;
                                                try {
                                                    int i = zipInputStream.read(this.Zo);
                                                    if (i == -1) {
                                                        break;
                                                    }
                                                    zipOutputStream.write(this.Zo, 0, i);
                                                    zipInputStream5 = zipInputStream;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                            zipOutputStream.closeEntry();
                                        }
                                        try {
                                            zipInputStream.closeEntry();
                                            zipInputStream4 = zipInputStream;
                                            arrayList3 = arrayList4;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        zipInputStream = zipInputStream4;
                                    }
                                    zipInputStream.close();
                                    zipOutputStream.close();
                                    throw th;
                                }
                                Enumeration<String> enumerationKeys4 = this.J0.keys();
                                while (enumerationKeys4.hasMoreElements()) {
                                    String strNextElement2 = enumerationKeys4.nextElement();
                                    if (strNextElement2.startsWith(next2) && !this.tp.contains(strNextElement2) && this.Ws.containsKey(strNextElement2)) {
                                        f fVar2 = this.J0.get(strNextElement2);
                                        zipInputStream2 = zipInputStream4;
                                        try {
                                            long jLongValue3 = this.Ws.get(strNextElement2).longValue();
                                            long diskVersion2 = this.QX.get(strNextElement2).getDiskVersion();
                                            if (jLongValue3 == 0 || jLongValue3 == diskVersion2) {
                                                if (this.DW) {
                                                    arrayList2 = arrayList3;
                                                    try {
                                                        System.out.println("Writing " + strNextElement2);
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        zipInputStream = zipInputStream2;
                                                        zipInputStream.close();
                                                        zipOutputStream.close();
                                                        throw th;
                                                    }
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                this.Ws.remove(strNextElement2);
                                                ZipEntry zipEntry = new ZipEntry(strNextElement2.substring(next2.length() + 1, strNextElement2.length()).replace(File.separatorChar, '/'));
                                                zipEntry.setTime(jLongValue3);
                                                zipOutputStream.putNextEntry(zipEntry);
                                                fVar2.j6(zipOutputStream);
                                                zipOutputStream.closeEntry();
                                            } else {
                                                arrayList2 = arrayList3;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                        zipInputStream2 = zipInputStream4;
                                    }
                                    zipInputStream4 = zipInputStream2;
                                    arrayList3 = arrayList2;
                                }
                                arrayList = arrayList3;
                                try {
                                    zipInputStream4.close();
                                    zipOutputStream.close();
                                    if (!new File(next2).delete()) {
                                        throw new IOException("Delete of " + next2 + " failed.");
                                    }
                                    if (!new File(str5).renameTo(new File(next2))) {
                                        throw new IOException("Rename from " + str5 + " to " + next2 + " failed.");
                                    }
                                    z2 = true;
                                } catch (IOException e5) {
                                    e2 = e5;
                                    z2 = true;
                                    z3 = z2;
                                    arrayList3 = arrayList;
                                }
                            }
                        }
                        z3 = true;
                    } catch (IOException e6) {
                        e2 = e6;
                        arrayList = arrayList3;
                    }
                }
                z3 = z2;
                arrayList3 = arrayList;
            }
            if (e2 == null) {
                return z3;
            }
            throw e2;
        } catch (Throwable th8) {
            if (rN) {
                iy.j3(th8, -722447748563191785L, this, new Boolean(z));
            }
            throw th8;
        }
    }

    @ey(method = -1673248239834093105L)
    private void U2(Set<String> set, Set<String> set2) {
        try {
            if (lg) {
                iy.EQ(-1056714449628297091L, this, set, set2);
            }
            ArrayList arrayList = new ArrayList(set);
            Collections.sort(arrayList);
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                if (file.exists() && file.isDirectory()) {
                    String absolutePath = file.getAbsolutePath();
                    while (true) {
                        if (!absolutePath.endsWith(File.separator + File.separator)) {
                            break;
                        } else {
                            absolutePath = absolutePath.substring(absolutePath.length());
                        }
                    }
                    if (absolutePath.length() > 1 && FilePatternMatcher.j6() != null && !FilePatternMatcher.j6().DW(absolutePath, "[A-Z]\\:\\\\?")) {
                        try {
                            new a(this, new File(absolutePath).getCanonicalPath()).Hw(absolutePath);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
            Iterator<String> it2 = set2.iterator();
            while (it2.hasNext()) {
                File file2 = new File(it2.next());
                if (file2.exists() && file2.isFile()) {
                    try {
                        file2.delete();
                        gW(file2.getPath());
                        if (g4.j6() != null) {
                            g4.j6().DW(file2, 0L);
                        }
                    } catch (IOException unused2) {
                    }
                } else if (file2.exists() && file2.isDirectory()) {
                    new b(this).Hw(file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -1056714449628297091L, this, set, set2);
            }
            throw th;
        }
    }

    @ey(method = 61924918979845335L)
    private void aM(FileEntry fileEntry, String str) {
        String str2 = "";
        try {
            if (lg) {
                iy.EQ(-6992759228960527119L, this, fileEntry, str);
            }
            String pathString = fileEntry.getPathString();
            if (!"".equals(str)) {
                str2 = str.replace('.', File.separatorChar) + File.separator;
            }
            String fullNameString = fileEntry.getFullNameString();
            HashSet<String> hashSet = new HashSet();
            hashSet.add(this.j6.fileSpace.getDebugOutputPath(fileEntry));
            hashSet.add(this.j6.fileSpace.getReleaseOutputPath(fileEntry));
            for (String str3 : hashSet) {
                String str4 = str3 + File.separator + str2 + fullNameString;
                if (new File(str3).isDirectory()) {
                    File file = new File(str4);
                    if (fileEntry.getDiskVersion() > file.lastModified() || fileEntry.getSize() != file.length()) {
                    }
                }
                this.u7.add(str3);
                this.J0.put(str4, new h(this, pathString));
                this.we.put(str4, str3 + File.separator + str2);
                this.QX.put(str4, fileEntry);
                this.Ws.put(str4, new Long(fileEntry.getDiskVersion()));
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -6992759228960527119L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @ey(method = -36224564823608224L)
    private void gW(String str) {
        try {
            if (lg) {
                iy.tp(-2732632564479041088L, this, str);
            }
            new File(new File(str).getParent()).mkdirs();
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
            zipOutputStream.putNextEntry(new ZipEntry("x.tmp"));
            zipOutputStream.closeEntry();
            zipOutputStream.close();
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -2732632564479041088L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3862728466647303397L)
    public boolean KD(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(-3185340439171505857L, this, fileEntry);
            }
            return this.U2.contains(fileEntry);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -3185340439171505857L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -1676426869864513584L)
    public void Mr() {
        try {
            if (lg) {
                iy.gn(-3656640658097760480L, this);
            }
            HashSet hashSet = new HashSet();
            SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
            setOfFileEntryKD.j6.init();
            while (setOfFileEntryKD.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                String debugOutputPath = this.j6.fileSpace.getDebugOutputPath(fileEntryNextKey);
                if (debugOutputPath != null) {
                    hashSet.add(debugOutputPath);
                }
                String releaseOutputPath = this.j6.fileSpace.getReleaseOutputPath(fileEntryNextKey);
                if (releaseOutputPath != null) {
                    hashSet.add(releaseOutputPath);
                }
            }
            U2(Collections.EMPTY_SET, hashSet);
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -3656640658097760480L, this);
            }
            throw th;
        }
    }

    @ey(method = 1484750618483790144L)
    public int P8() {
        try {
            if (lg) {
                iy.gn(-2750345087656866984L, this);
            }
            return this.EQ;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2750345087656866984L, this);
            }
            throw th;
        }
    }

    @ey(method = -570245407236301824L)
    public void SI(Set<String> set, Hashtable<String, byte[]> hashtable) {
        try {
            if (lg) {
                iy.EQ(-1674567663157420792L, this, set, hashtable);
            }
            Mz(false);
            Enumeration<String> enumerationKeys = this.J0.keys();
            while (enumerationKeys.hasMoreElements()) {
                String strNextElement = enumerationKeys.nextElement();
                long jLongValue = this.Ws.get(strNextElement).longValue();
                FileEntry fileEntry = this.QX.get(strNextElement);
                long diskVersion = fileEntry.getDiskVersion();
                if (jLongValue == 0 || jLongValue == diskVersion) {
                    f fVar = this.J0.get(strNextElement);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    fVar.j6(byteArrayOutputStream);
                    hashtable.put(this.J8.get(strNextElement), byteArrayOutputStream.toByteArray());
                    set.add(fileEntry.getPathString());
                }
            }
            if (BT()) {
                return;
            }
            a8();
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -1674567663157420792L, this, set, hashtable);
            }
            throw th;
        }
    }

    @ey(method = 70582753122968772L)
    public void Sf() {
        try {
            if (lg) {
                iy.gn(7085398679495675448L, this);
            }
            this.a8 = true;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 7085398679495675448L, this);
            }
            throw th;
        }
    }

    @ey(method = -914087949507365664L)
    public void a8() {
        try {
            if (lg) {
                iy.gn(-2431140475466207496L, this);
            }
            this.EQ = 0;
            this.J0.clear();
            this.we.clear();
            this.u7.clear();
            this.Ws.clear();
            this.QX.clear();
            this.tp.clear();
            this.XL.clear();
            this.J8.clear();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2431140475466207496L, this);
            }
            throw th;
        }
    }

    @ey(method = 3430815405357130800L)
    public boolean cb() {
        try {
            if (lg) {
                iy.gn(3107160309153036060L, this);
            }
            return this.a8;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 3107160309153036060L, this);
            }
            throw th;
        }
    }

    @ey(method = -329114225109314232L)
    public boolean cn(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(171886105769880132L, this, fileEntry);
            }
            return this.Mr.contains(fileEntry);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 171886105769880132L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 1940822050836940899L)
    public void dx(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(394762464292003269L, this, fileEntry);
            }
            Enumeration<String> enumerationKeys = this.QX.keys();
            while (enumerationKeys.hasMoreElements()) {
                String strNextElement = enumerationKeys.nextElement();
                if (this.QX.get(strNextElement) == fileEntry) {
                    this.tp.add(strNextElement);
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 394762464292003269L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2344111773078488721L)
    public void ef(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(-1984553937841878347L, this, fileEntry);
            }
            this.j3.FH();
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -1984553937841878347L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2897587810325210541L)
    public OutputStream ei(ClassType classType, String str, String str2, boolean z, boolean z2) {
        try {
            if (lg) {
                iy.J8(-1077320266954755615L, this, classType, str, str2, new Boolean(z), new Boolean(z2));
            }
            FileEntry file = classType.getFile();
            String strReplace = classType.getNamespace().getFullyQualifiedNameString().replace('.', File.separatorChar);
            if (strReplace.length() > 0) {
                strReplace = strReplace + File.separator;
            }
            return new e(this, z2 ? Collections.singleton(this.j6.fileSpace.getDebugOutputPath(file)) : Collections.singleton(this.j6.fileSpace.getReleaseOutputPath(file)), strReplace, str, file.getDiskVersion(), file, str2, z);
        } catch (Throwable th) {
            if (rN) {
                iy.lg(th, -1077320266954755615L, this, classType, str, str2, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = -252016907487934193L)
    public void er(FileEntry fileEntry, List<SyntaxTree> list, boolean z, boolean z2) {
        try {
            if (lg) {
                iy.J0(6545995280665867481L, this, fileEntry, list, new Boolean(z), new Boolean(z2));
            }
            Compiler compiler = fileEntry.getCodeModel().getCompiler();
            if (compiler == null || this.j6.fileSpace.I(fileEntry)) {
                this.U2.gn(fileEntry);
                return;
            }
            if (this.j6.errorTable.BT(fileEntry)) {
                return;
            }
            if (!z2 && !z) {
                this.Mr.gn(fileEntry);
                return;
            }
            compiler.compile(list, z);
            this.Mr.EQ(fileEntry);
        } catch (Throwable th) {
            if (rN) {
                iy.a8(th, 6545995280665867481L, this, fileEntry, list, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 1059179219611637440L)
    public void g3() {
        try {
            if (lg) {
                iy.gn(-1411577607430448400L, this);
            }
            this.aM.clear();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1411577607430448400L, this);
            }
            throw th;
        }
    }

    @ey(method = 7171118313953979056L)
    public boolean j3(boolean z) {
        try {
            if (lg) {
                iy.Ws(-4609347398155188304L, this, z);
            }
            SetOfFileEntry resourceFiles = this.j6.fileSpace.getResourceFiles();
            resourceFiles.j6.init();
            while (resourceFiles.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = resourceFiles.j6.nextKey();
                String strSh = this.j6.fileSpace.sh(fileEntryNextKey);
                if (strSh != null) {
                    aM(fileEntryNextKey, strSh);
                }
            }
            try {
                return Mz(z);
            } finally {
                Enumeration<String> enumerationKeys = this.QX.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String strNextElement = enumerationKeys.nextElement();
                    if (strNextElement.endsWith(".class") && (strNextElement.indexOf(36) == -1 || strNextElement.lastIndexOf(36) < strNextElement.lastIndexOf(File.separatorChar))) {
                        if (new File(strNextElement).isFile()) {
                            this.gn.put(strNextElement, new Long(new File(strNextElement).lastModified()));
                        }
                    }
                }
                a8();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -4609347398155188304L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1026324693230309184L)
    public void lg(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(-12370007310758600L, this, fileEntry);
            }
            this.U2.EQ(fileEntry);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -12370007310758600L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 2932324849731832947L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (lg) {
                iy.tp(8285862470239044733L, this, storeInputStream);
            }
            this.Mr = new SetOfFileEntry(this.j6.fileSpace, storeInputStream);
            this.U2 = new SetOfFileEntry(this.j6.fileSpace, storeInputStream);
            this.j3 = new MapOfIntLong(storeInputStream);
            this.a8 = storeInputStream.readBoolean();
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 8285862470239044733L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = -2258488007575342728L)
    public OutputStream nw(FileEntry fileEntry, String str, String str2, boolean z, boolean z2) throws Throwable {
        try {
            if (lg) {
                iy.J8(905316888415982048L, this, fileEntry, str, str2, new Boolean(z), new Boolean(z2));
            }
            Set setSingleton = z2 ? Collections.singleton(this.j6.fileSpace.getDebugOutputPath(fileEntry)) : Collections.singleton(this.j6.fileSpace.getReleaseOutputPath(fileEntry));
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(str2);
                sb.append(".class");
                String string = sb.toString();
                Iterator it = setSingleton.iterator();
                while (it.hasNext()) {
                    if (!this.aM.containsKey(((String) it.next()) + File.separator + str + string)) {
                        return new e(this, setSingleton, str, string, 0L, fileEntry, str2, z);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (rN) {
                    iy.lg(th, 905316888415982048L, this, fileEntry, str, str2, new Boolean(z), new Boolean(z2));
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -7917519069573278704L)
    public void rN(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(-6475166610815711424L, this, fileEntry);
            }
            this.j3.VH(fileEntry.getId(), fileEntry.getDiskVersion());
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -6475166610815711424L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -5918502103631618345L)
    public boolean ro(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(-4621163218993675575L, this, fileEntry);
            }
            if (this.j3.Hw(fileEntry.getId())) {
                return this.j3.v5(fileEntry.getId()) != fileEntry.getDiskVersion();
            }
            return true;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -4621163218993675575L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 440799769779785309L)
    public void sG(FileEntry fileEntry) {
        try {
            if (lg) {
                iy.tp(-3452986240082629525L, this, fileEntry);
            }
            if (fileEntry.getCodeModel().getCompiler() == null) {
                this.U2.gn(fileEntry);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -3452986240082629525L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 4164882449510973723L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (lg) {
                iy.tp(2443274374478356181L, this, storeOutputStream);
            }
            this.Mr.store(storeOutputStream);
            this.U2.store(storeOutputStream);
            this.j3.store(storeOutputStream);
            storeOutputStream.writeBoolean(this.a8);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 2443274374478356181L, this, storeOutputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @ey(method = -793088078239601969L)
    public void vy() {
        try {
            if (lg) {
                iy.gn(-2333550791966839155L, this);
            }
            if (BT()) {
                return;
            }
            try {
                Mz(false);
                Enumeration<String> enumerationKeys = this.QX.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String strNextElement = enumerationKeys.nextElement();
                    if (strNextElement.endsWith(".class") && (strNextElement.indexOf(36) == -1 || strNextElement.lastIndexOf(36) < strNextElement.lastIndexOf(File.separatorChar))) {
                        if (new File(strNextElement).isFile()) {
                            this.gn.put(strNextElement, new Long(new File(strNextElement).lastModified()));
                        }
                    }
                }
                a8();
            } catch (Throwable th) {
                Enumeration<String> enumerationKeys2 = this.QX.keys();
                while (enumerationKeys2.hasMoreElements()) {
                    String strNextElement2 = enumerationKeys2.nextElement();
                    if (strNextElement2.endsWith(".class") && (strNextElement2.indexOf(36) == -1 || strNextElement2.lastIndexOf(36) < strNextElement2.lastIndexOf(File.separatorChar))) {
                        if (new File(strNextElement2).isFile()) {
                            this.gn.put(strNextElement2, new Long(new File(strNextElement2).lastModified()));
                        }
                    }
                }
                a8();
                throw th;
            }
        } catch (Throwable th2) {
            if (rN) {
                iy.aM(th2, -2333550791966839155L, this);
            }
            throw th2;
        }
    }

    @ey(method = 1966086578184187124L)
    public void yS() {
        try {
            if (lg) {
                iy.gn(-279447836974500104L, this);
            }
            for (CodeModel codeModel : this.j6.fileSpace.getCodeModels()) {
                Compiler compiler = codeModel.getCompiler();
                if (compiler != null) {
                    compiler.init(codeModel);
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -279447836974500104L, this);
            }
            throw th;
        }
    }

    @cy(clazz = 5985713739450453024L, container = 5985713739450453024L, user = true)
    private class e extends OutputStream {

        @fy
        private static /* synthetic */ boolean cT;

        @gy
        private static /* synthetic */ boolean q7;

        @dy(field = -2319154225709532000L)
        private String AL;

        @dy(field = -1302387451517217933L)
        private byte[] WB;

        @dy(field = 2267126550241959648L)
        private FileEntry fY;

        @dy(field = 2815254432812757451L)
        @hy
        final /* synthetic */ m1 hK;

        @dy(field = -2140366509959116653L)
        private long jw;

        @dy(field = -3662641293498028920L)
        private String k2;

        @dy(field = 1871896980679557105L)
        private int mb;

        @dy(field = -4225979349125997201L)
        private String qp;

        @dy(field = 2665348150155063536L)
        private boolean w9;

        @dy(field = -1916656925752630453L)
        private Set<String> zh;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -363332423987341280L)
        public e(m1 m1Var, Set<String> set, String str, String str2, long j, FileEntry fileEntry, String str3, boolean z) {
            try {
                if (cT) {
                    iy.QX(-49169360890389649L, null, new Object[]{m1Var, set, str, str2, new Long(j), fileEntry, str3, new Boolean(z)});
                }
                this.hK = m1Var;
                if (m1Var.Hw != null) {
                    this.WB = m1Var.Hw;
                    m1Var.Hw = null;
                } else {
                    this.WB = new byte[10000];
                }
                this.fY = fileEntry;
                this.jw = j;
                this.qp = str;
                this.k2 = str2;
                this.zh = set;
                this.AL = str3;
                this.w9 = z;
            } catch (Throwable th) {
                if (q7) {
                    iy.rN(th, -49169360890389649L, null, new Object[]{m1Var, set, str, str2, new Long(j), fileEntry, str3, new Boolean(z)});
                }
                throw th;
            }
        }

        @ey(method = 535972326380596728L)
        private boolean j6(String str) {
            byte[] bArr;
            try {
                if (cT) {
                    iy.tp(-209911021746360268L, this, str);
                }
                String str2 = str + File.separator + this.qp + this.k2;
                if (new File(str).isDirectory() && new File(str2).exists() && new File(str2).length() == this.mb) {
                    if (this.hK.FH) {
                        System.out.println("Reading " + str2);
                    }
                    if (this.hK.v5 != null) {
                        bArr = this.hK.v5;
                        this.hK.v5 = null;
                    } else {
                        bArr = new byte[10000];
                    }
                    FileInputStream fileInputStream = new FileInputStream(str2);
                    int i = 0;
                    loop0: while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 == -1) {
                            if (i != this.mb) {
                                fileInputStream.close();
                                this.hK.v5 = bArr;
                                return false;
                            }
                            fileInputStream.close();
                            this.hK.v5 = bArr;
                            return true;
                        }
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (i > this.mb || this.WB[i] != bArr[i3]) {
                                break loop0;
                            }
                            i++;
                        }
                    }
                    fileInputStream.close();
                    this.hK.v5 = bArr;
                    return false;
                }
                return false;
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, -209911021746360268L, this, str);
                }
                throw th;
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        @ey(method = -2050052210494322944L)
        public void close() {
            try {
                if (cT) {
                    iy.gn(1060083204340321392L, this);
                }
                long value = 0;
                if (!this.w9) {
                    this.hK.VH.reset();
                    this.hK.VH.update(this.WB, 0, this.mb);
                    value = this.hK.VH.getValue();
                }
                a aVar = null;
                d dVar = null;
                for (String str : this.zh) {
                    String str2 = str + File.separator + this.qp + this.k2;
                    String str3 = str + File.separator + this.qp;
                    this.hK.Ws.put(str2, new Long(this.jw));
                    this.hK.QX.put(str2, this.fY);
                    this.hK.u7.add(str);
                    if (this.w9) {
                        if (dVar == null) {
                            f fVar = (f) this.hK.J0.get(str2);
                            if (fVar instanceof d) {
                                dVar = (d) fVar;
                            }
                            if (dVar == null) {
                                dVar = new d(this.hK, aVar);
                            }
                            dVar.FH(this.WB, this.mb);
                        }
                        this.hK.EQ += dVar.DW;
                        this.hK.J0.put(str2, dVar);
                        this.hK.J8.put(str2, this.AL);
                        this.hK.we.put(str2, str3);
                    } else if (!this.hK.aM.containsKey(str2) || value != ((Long) this.hK.aM.get(str2)).longValue()) {
                        this.hK.aM.put(str2, new Long(value));
                        if (j6(str)) {
                            this.hK.J0.remove(str2);
                            this.hK.XL.remove(str2);
                            if (str2.endsWith(".class") && (str2.indexOf(36) == -1 || str2.lastIndexOf(36) < str2.lastIndexOf(File.separatorChar))) {
                                if (new File(str2).isFile()) {
                                    this.hK.gn.put(str2, new Long(new File(str2).lastModified()));
                                }
                            }
                        } else if (!this.hK.XL.containsKey(str2) || value != ((Long) this.hK.XL.get(str2)).longValue()) {
                            if (dVar == null) {
                                f fVar2 = (f) this.hK.J0.get(str2);
                                if (fVar2 instanceof d) {
                                    dVar = (d) fVar2;
                                }
                                if (dVar == null) {
                                    dVar = new d(this.hK, aVar);
                                }
                                dVar.FH(this.WB, this.mb);
                            }
                            this.hK.EQ += dVar.DW;
                            this.hK.J0.put(str2, dVar);
                            this.hK.J8.put(str2, this.AL);
                            this.hK.we.put(str2, str3);
                            this.hK.XL.put(str2, new Long(value));
                        }
                    }
                }
                if (this.hK.Hw == null) {
                    this.hK.Hw = this.WB;
                }
                this.WB = null;
            } catch (Throwable th) {
                if (q7) {
                    iy.aM(th, 1060083204340321392L, this);
                }
                throw th;
            }
        }

        @Override // java.io.OutputStream
        @ey(method = -66059304307197344L)
        public void write(int i) {
            try {
                if (cT) {
                    iy.u7(6809956361861033700L, this, i);
                }
                int i2 = this.mb + 1;
                if (i2 > this.WB.length) {
                    byte[] bArr = new byte[Math.max(this.WB.length << 1, i2)];
                    System.arraycopy(this.WB, 0, bArr, 0, this.mb);
                    this.WB = bArr;
                }
                this.WB[this.mb] = (byte) i;
                this.mb = i2;
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, 6809956361861033700L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // java.io.OutputStream
        @ey(method = 956462655403227372L)
        public void write(byte[] bArr, int i, int i2) {
            try {
                if (cT) {
                    iy.we(81588509898573672L, this, bArr, new Integer(i), new Integer(i2));
                }
                int i3 = this.mb + i2;
                if (i3 > this.WB.length) {
                    byte[] bArr2 = new byte[Math.max(this.WB.length << 1, i3)];
                    System.arraycopy(this.WB, 0, bArr2, 0, this.mb);
                    this.WB = bArr2;
                }
                System.arraycopy(bArr, i, this.WB, this.mb, i2);
                this.mb = i3;
            } catch (Throwable th) {
                if (q7) {
                    iy.U2(th, 81588509898573672L, this, bArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }
}
