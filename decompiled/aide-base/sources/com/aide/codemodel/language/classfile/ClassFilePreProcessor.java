package com.aide.codemodel.language.classfile;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.probelytics.api.UserTouchAction;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@cy(clazz = -2172347156358296679L, container = -2172347156358296679L, user = true)
/* loaded from: classes.dex */
public class ClassFilePreProcessor {

    @fy
    private static /* synthetic */ boolean kQ;

    @gy
    private static /* synthetic */ boolean yO;

    @dy(field = -2609417578141604352L)
    private boolean BT;

    @dy(field = -3877098082965969499L)
    private Hashtable<String, ZipFile> DW;

    @dy(field = -6011096542762142055L)
    private int[] EQ;

    @dy(field = -4466951383421118028L)
    private Hashtable<ZipFile, List<ZipEntry>> FH;

    @dy(field = 3262023225239949100L)
    private boolean Hw;

    @dy(field = -2125202750662496820L)
    private b I;

    @dy(field = 1520738765825768925L)
    private int[] J0;

    @dy(field = 343798743211408928L)
    private float[] J8;

    @dy(field = -2880451915649613375L)
    private b KD;

    @dy(field = -2273782631130367515L)
    private char[] Mr;

    @dy(field = -2803228404994068441L)
    private b Mz;

    @dy(field = -2125849824841602881L)
    private b OW;

    @dy(field = 7067442968286205104L)
    private boolean P8;

    @dy(field = -3810315800392406025L)
    private double[] QX;

    @dy(field = -2125480068192207753L)
    private b Qq;

    @dy(field = -2880326291756142992L)
    private b SI;

    @dy(field = -2549256286939049896L)
    private b Sf;

    @dy(field = -1638697489694128845L)
    private int U2;

    @dy(field = -3681260949669673095L)
    private int VH;

    @dy(field = 4223240523432306192L)
    private long[] Ws;

    @dy(field = -2483345941009454349L)
    private int[] XL;

    @dy(field = -2579676837802691568L)
    private String[][] XX;

    @dy(field = 3174604608611964636L)
    private byte[] Zo;

    @dy(field = 840378663183116560L)
    private int a8;

    @dy(field = 838259722408057565L)
    private char[] aM;

    @dy(field = -2125664946525031905L)
    private b aj;

    @dy(field = -2125942263993793428L)
    private b br;

    @dy(field = -2125295189843130425L)
    private b ca;

    @dy(field = -2548989452652451200L)
    private b cb;

    @dy(field = -2880703163424364259L)
    private b cn;

    @dy(field = -2549056161230195815L)
    private b dx;

    @dy(field = -2549189578373495163L)
    private b ef;

    @dy(field = -580944976746770421L)
    private FunctionOfIntInt ei;

    @dy(field = 880290038704613976L)
    private int er;

    @dy(field = 177319747284987480L)
    private b g3;

    @dy(field = 2350343595544837551L)
    private boolean gW;

    @dy(field = -4365316826712586304L)
    private int gn;

    @dy(field = -2256978654345065585L)
    private int j3;

    @dy(field = 3550786066947095175L)
    private boolean j6;

    @dy(field = -1670990880377466688L)
    private String lg;

    @dy(field = -2125757385685349040L)
    private b lp;

    @dy(field = 2827567060438504244L)
    private b nw;

    @dy(field = 2948874709381180881L)
    private boolean rN;

    @dy(field = -2880577539539020464L)
    private b ro;

    @dy(field = -2549122869803877136L)
    private b sG;

    @dy(field = -275440408112376960L)
    private b sh;

    @dy(field = -2125572507360651476L)
    private b sy;

    @dy(field = -6016209467537583380L)
    private int[] tp;

    @dy(field = 1544556048759126816L)
    private int[] u7;

    @dy(field = 959298909357160016L)
    private byte[] v5;

    @dy(field = -2549322995500541335L)
    private b vJ;

    @dy(field = -2189305220892481335L)
    private boolean vy;

    @dy(field = -5850858607159852517L)
    private int[] we;

    @dy(field = -2125387629019700736L)
    private b x9;

    @dy(field = 1501754042593304333L)
    private boolean yS;

    static {
        iy.Zo(ClassFilePreProcessor.class);
    }

    @ey(method = -1015684209210366248L)
    public ClassFilePreProcessor() {
        try {
            if (kQ) {
                iy.gn(5977954707574386627L, null);
            }
            this.DW = new Hashtable<>();
            this.FH = new Hashtable<>();
            this.Hw = true;
            this.j3 = 0;
            this.U2 = 0;
            this.XX = new String[][]{new String[]{"java/lang/Boolean", "parseBoolean", "(Ljava/lang/String;)Z"}, new String[]{"java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;"}, new String[]{"java/lang/Character", "valueOf", "(C)Ljava/lang/Character;"}, new String[]{"java/lang/Double", "valueOf", "(D)Ljava/lang/Double;"}, new String[]{"java/lang/Float", "valueOf", "(F)Ljava/lang/Float;"}, new String[]{"java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;"}, new String[]{"java/lang/Long", "valueOf", "(J)Ljava/lang/Long;"}, new String[]{"java/lang/Short", "valueOf", "(S)Ljava/lang/Short;"}, new String[]{"java/lang/String", "contains", "(Ljava/lang/String;)Z"}, new String[]{"java/lang/StringBuffer", "<init>", "(Ljava/lang/CharSequence;)V"}, new String[]{"java/lang/StringBuffer", "append", "(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;"}, new String[]{"java/lang/StringBuffer", "append", "(Ljava/lang/CharSequence;II)Ljava/lang/StringBuffer;"}, new String[]{"java/lang/StringBuffer", "insert", "(ILjava/lang/CharSequence;)Ljava/lang/StringBuffer;"}, new String[]{"java/lang/StringBuffer", "insert", "(ILjava/lang/CharSequence;II)Ljava/lang/StringBuffer;"}, new String[]{"java/lang/StringBuffer", "trimToSize", "()V"}, new String[]{"java/util/Collections", "emptyList", "()Ljava/util/List;"}, new String[]{"java/util/Collections", "emptyMap", "()Ljava/util/Map;"}, new String[]{"java/util/Collections", "emptySet", "()Ljava/util/Set;"}};
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 5977954707574386627L, null);
            }
            throw th;
        }
    }

    @ey(method = -3959301088427606032L)
    private void BT() {
        int i;
        try {
            if (kQ) {
                iy.gn(-3624265932870284340L, this);
            }
            int iDx = dx();
            int i2 = 0;
            this.vy = false;
            if (this.Hw && (iDx & 8192) != 0) {
                this.vy = true;
            }
            this.BT = false;
            this.P8 = false;
            if (this.Hw && (iDx & 16384) != 0) {
                this.BT = true;
            }
            this.yS = false;
            this.gW = true;
            this.rN = (iDx & 512) == 0;
            tp(this.we[dx() - 1]);
            this.lg = new String(this.aM, 0, this.j3);
            this.er = 0;
            this.a8 = 0;
            int i3 = 0;
            while (this.a8 < this.j3) {
                if (this.aM[this.a8] == '/') {
                    if (this.sh.EQ() == 0) {
                        this.sh.FH("package ");
                    } else {
                        this.sh.FH(".");
                    }
                    this.sh.Hw(this.aM, i3, this.a8 - i3);
                    i = this.a8;
                } else if (this.aM[this.a8] == '$' || this.aM[this.a8] == '+') {
                    this.er++;
                    i = this.a8;
                } else {
                    this.a8++;
                }
                i3 = i + 1;
                this.a8++;
            }
            if (this.sh.EQ() != 0) {
                this.sh.FH(";\n");
            }
            for (int i4 = 0; i4 < this.er; i4++) {
                this.dx.FH("    ");
            }
            FH(iDx & 3615, this.sG);
            if (this.BT) {
                this.ef.FH("enum ");
            } else if (this.vy) {
                this.ef.FH("@interface ");
            } else if (this.rN) {
                this.ef.FH("class ");
            } else {
                this.ef.FH("interface ");
            }
            this.ef.Hw(this.aM, i3, this.j3 - i3);
            this.g3.Hw(this.aM, i3, this.j3 - i3);
            this.Mz.Zo();
            for (int i5 = 0; i5 < this.er + 1; i5++) {
                this.Mz.FH("    ");
            }
            int iDx2 = dx();
            if (!this.BT && this.rN && iDx2 != 0) {
                tp(this.we[iDx2 - 1]);
                if (!u7("java/lang/Object")) {
                    this.Sf.FH(" extends ");
                    j6(this.Sf);
                }
            }
            int iDx3 = dx();
            if (iDx3 > 0) {
                if (this.rN) {
                    this.Sf.FH(" implements ");
                    while (i2 < iDx3) {
                        if (i2 != 0) {
                            this.Sf.FH(", ");
                        }
                        tp(this.we[dx() - 1]);
                        j6(this.Sf);
                        i2++;
                    }
                } else {
                    this.Sf.FH(" extends ");
                    while (i2 < iDx3) {
                        if (i2 != 0) {
                            this.Sf.FH(", ");
                        }
                        tp(this.we[dx() - 1]);
                        j6(this.Sf);
                        i2++;
                    }
                }
            }
            if (this.vy) {
                this.Sf.Zo();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -3624265932870284340L, this);
            }
            throw th;
        }
    }

    @ey(method = 1902547299469886769L)
    private void DW(b bVar) {
        try {
            if (kQ) {
                iy.tp(-671088849379829733L, this, bVar);
            }
            if (this.j3 == 1 && this.aM[0] == 'V') {
                bVar.FH("void");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'I') {
                bVar.FH("int");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'B') {
                bVar.FH("byte");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'C') {
                bVar.FH("char");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'F') {
                bVar.FH("float");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'D') {
                bVar.FH("double");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'J') {
                bVar.FH("long");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'S') {
                bVar.FH("short");
                return;
            }
            if (this.j3 == 1 && this.aM[0] == 'Z') {
                bVar.FH("boolean");
                return;
            }
            for (int i = 0; i < this.j3; i++) {
                if (this.aM[i] == '/') {
                    this.aM[i] = '.';
                }
                if (this.aM[i] == '$') {
                    this.aM[i] = '.';
                }
            }
            bVar.Hw(this.aM, 1, this.j3 - 2);
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -671088849379829733L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -2159874387672281240L)
    private void EQ(int i) {
        try {
            if (kQ) {
                iy.u7(-1725897988079565564L, this, i);
            }
            this.U2 = 0;
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            int i3 = this.EQ[i2];
            int i4 = this.tp[i2];
            if (i4 >= this.Mr.length) {
                this.Mr = new char[i4];
            }
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i3 + 1;
                byte b2 = this.Zo[i3];
                switch (b2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        i5++;
                        char[] cArr = this.Mr;
                        int i7 = this.U2;
                        this.U2 = i7 + 1;
                        cArr[i7] = (char) b2;
                        i3 = i6;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        i5++;
                        i3 = i6;
                    case 12:
                    case 13:
                        i5 += 2;
                        int i8 = i6 + 1;
                        byte b3 = this.Zo[i6];
                        char[] cArr2 = this.Mr;
                        int i9 = this.U2;
                        this.U2 = i9 + 1;
                        cArr2[i9] = (char) (((b2 & 31) << 6) | (b3 & 63));
                        i3 = i8;
                    case 14:
                        i5 += 3;
                        int i10 = i6 + 1;
                        byte b4 = this.Zo[i6];
                        int i11 = i10 + 1;
                        byte b5 = this.Zo[i10];
                        char[] cArr3 = this.Mr;
                        int i12 = this.U2;
                        this.U2 = i12 + 1;
                        cArr3[i12] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | ((b5 & 63) << 0));
                        i3 = i11;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -1725897988079565564L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6789641079524253228L)
    private void FH(int i, b bVar) {
        try {
            if (kQ) {
                iy.EQ(-1964563598414649128L, this, new Integer(i), bVar);
            }
            if ((i & 1) != 0) {
                bVar.FH("public ");
            }
            if ((i & 2) != 0) {
                bVar.FH("private ");
            }
            if ((i & 4) != 0) {
                bVar.FH("protected ");
            }
            if ((i & 8) != 0) {
                bVar.FH("static ");
            }
            if ((i & 16) != 0) {
                bVar.FH("final ");
            }
            if ((i & 64) != 0) {
                bVar.FH("volatile ");
            }
            if ((i & 32) != 0) {
                bVar.FH("synchronized ");
            }
            if ((i & 128) != 0) {
                bVar.FH("transient ");
            }
            if ((i & 256) != 0) {
                bVar.FH("native ");
            }
            if ((i & 1024) != 0) {
                bVar.FH("abstract ");
            }
            if ((i & 2048) != 0) {
                bVar.FH("strictfp ");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -1964563598414649128L, this, new Integer(i), bVar);
            }
            throw th;
        }
    }

    @ey(method = -3647394542951089216L)
    private void Hw(b bVar, b bVar2, boolean z, boolean z2) {
        try {
            if (kQ) {
                iy.J0(1546966658054343120L, this, bVar, bVar2, new Boolean(z), new Boolean(z2));
            }
            char c2 = 'J';
            char c3 = 'D';
            if (!z) {
                bVar.FH("(");
                this.a8++;
                int i = z2 ? 0 : 1;
                int i2 = 0;
                for (char c4 = ')'; this.aM[this.a8] != c4; c4 = ')') {
                    if (i2 != 0) {
                        bVar.FH(", ");
                    }
                    char c5 = this.aM[this.a8];
                    boolean z3 = c5 == 'D' || c5 == 'J';
                    v5(bVar);
                    if (this.ei.Hw(i)) {
                        bVar.FH(" ");
                        EQ(this.ei.get(i));
                        bVar.Hw(this.Mr, 0, this.U2);
                    } else {
                        bVar.FH(" p");
                        bVar.j6(i2 + 1);
                    }
                    i = z3 ? i + 2 : i + 1;
                    i2++;
                }
                this.a8++;
                return;
            }
            bVar.FH("(");
            bVar2.FH("(");
            this.a8++;
            int i3 = 0;
            int i4 = 1;
            while (this.aM[this.a8] != ')') {
                if (i3 != 0) {
                    bVar.FH(", ");
                }
                if (i3 > 1) {
                    bVar2.FH(", ");
                }
                this.lp.Zo();
                char c6 = this.aM[this.a8];
                boolean z4 = c6 == c3 || c6 == c2;
                v5(this.lp);
                bVar.DW(this.lp);
                if (i3 != 0) {
                    bVar2.DW(this.lp);
                }
                if (this.ei.Hw(i4)) {
                    bVar.FH(" ");
                    EQ(this.ei.get(i4));
                    bVar.Hw(this.Mr, 0, this.U2);
                } else {
                    bVar.FH(" p");
                    bVar.j6(i3 + 1);
                }
                if (i3 != 0) {
                    if (this.ei.Hw(i4)) {
                        bVar2.FH(" ");
                        EQ(this.ei.get(i4));
                        bVar2.Hw(this.Mr, 0, this.U2);
                    } else {
                        bVar2.FH(" p");
                        bVar2.j6(i3 + 1);
                    }
                }
                i4 = z4 ? i4 + 2 : i4 + 1;
                i3++;
                c2 = 'J';
                c3 = 'D';
            }
            this.a8++;
        } catch (Throwable th) {
            if (yO) {
                iy.a8(th, 1546966658054343120L, this, bVar, bVar2, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 1631696565114832692L)
    private void I() {
        try {
            if (kQ) {
                iy.gn(-1424602610809352880L, this);
            }
            this.gn += 4;
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -1424602610809352880L, this);
            }
            throw th;
        }
    }

    @ey(method = 691456275951884163L)
    private List<ZipEntry> J0(ZipFile zipFile) {
        try {
            if (kQ) {
                iy.tp(2489886542229981093L, this, zipFile);
            }
            if (this.FH.containsKey(zipFile)) {
                return this.FH.get(zipFile);
            }
            ArrayList arrayList = new ArrayList();
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory() && zipEntryNextElement.getName().lastIndexOf(36) != -1) {
                    arrayList.add(zipEntryNextElement);
                }
            }
            this.FH.put(zipFile, arrayList);
            return arrayList;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 2489886542229981093L, this, zipFile);
            }
            throw th;
        }
    }

    @ey(method = -3677236019811841375L)
    private double KD() {
        try {
            if (kQ) {
                iy.gn(1858859617438690031L, this);
            }
            long jCb = (cb() << 56) + (cb() << 48) + (cb() << 40) + (cb() << 32) + (cb() << 24) + (cb() << 16) + (cb() << 8) + (cb() << 0);
            if (jCb == 9218868437227405312L) {
                return Double.POSITIVE_INFINITY;
            }
            if (jCb == -4503599627370496L) {
                return Double.NEGATIVE_INFINITY;
            }
            if (jCb >= 9218868437227405312L && jCb <= Long.MAX_VALUE) {
                return Double.NaN;
            }
            if (jCb >= -4503599627370496L && jCb <= -1) {
                return Double.NaN;
            }
            int i = (jCb >> 63) == 0 ? 1 : -1;
            int i2 = (int) ((jCb >> 52) & 2047);
            long j = jCb & 4503599627370495L;
            double d = i * (i2 == 0 ? j << 1 : j | 4503599627370496L);
            double dPow = Math.pow(2.0d, i2 - 1075);
            Double.isNaN(d);
            return d * dPow;
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 1858859617438690031L, this);
            }
            throw th;
        }
    }

    @ey(method = 1631566061482423008L)
    private void Mz() {
        try {
            if (kQ) {
                iy.gn(-1424474725820149784L, this);
            }
            this.gn += 2;
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -1424474725820149784L, this);
            }
            throw th;
        }
    }

    @ey(method = 3229567186560439773L)
    private void P8(b bVar) {
        try {
            if (kQ) {
                iy.tp(1744941587059389895L, this, bVar);
            }
            int iDx = dx();
            for (int i = 0; i < iDx; i++) {
                ei(bVar);
                bVar.FH("\n");
                bVar.DW(this.Mz);
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 1744941587059389895L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 3628997256227901085L)
    private void SI(String str, String str2) {
        try {
            if (kQ) {
                iy.EQ(-2004477513775637893L, this, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            File file = new File(str + File.separator + str2);
            arrayList.add(file);
            String name = file.getName();
            if (name.lastIndexOf(46) != -1) {
                name = name.substring(0, name.lastIndexOf(46));
            }
            String str3 = name + '$';
            String path = file.getParentFile().getPath();
            String[] list = file.getParentFile().list();
            if (list != null) {
                for (String str4 : list) {
                    File file2 = new File(path + File.separatorChar + str4);
                    if (!file2.isDirectory() && str4.startsWith(str3) && str4.endsWith(".class")) {
                        int i = 0;
                        while (true) {
                            int iIndexOf = str4.indexOf(36, i);
                            if (iIndexOf != -1) {
                                i = iIndexOf + 1;
                                if (Character.isDigit(str4.charAt(i))) {
                                    break;
                                }
                            } else {
                                arrayList.add(file2);
                                break;
                            }
                        }
                    }
                }
            }
            ca(arrayList, 0, arrayList.size() - 1);
            this.gn = 0;
            this.VH = 0;
            Iterator<File> it = arrayList.iterator();
            while (it.hasNext()) {
                FileInputStream fileInputStream = new FileInputStream(it.next());
                int i2 = fileInputStream.read(this.v5);
                while (i2 != -1) {
                    if (this.VH + i2 >= this.Zo.length) {
                        byte[] bArr = new byte[(this.Zo.length * 2) + 1];
                        System.arraycopy(this.Zo, 0, bArr, 0, this.Zo.length);
                        this.Zo = bArr;
                    }
                    System.arraycopy(this.v5, 0, this.Zo, this.VH, i2);
                    this.VH += i2;
                    i2 = fileInputStream.read(this.v5);
                }
                fileInputStream.close();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2004477513775637893L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 3188789405842848228L)
    private void Sf() {
        try {
            if (kQ) {
                iy.gn(3379092152517155880L, this);
            }
            I();
            Mz();
            Mz();
            int iDx = dx() - 1;
            if (iDx >= this.tp.length) {
                this.tp = new int[iDx];
                this.EQ = new int[iDx];
                this.we = new int[iDx];
            }
            int i = 0;
            while (i < iDx) {
                int iCb = cb();
                this.u7[i] = iCb;
                switch (iCb) {
                    case 1:
                        int iDx2 = dx();
                        this.tp[i] = iDx2;
                        this.EQ[i] = this.gn;
                        this.gn += iDx2;
                        i++;
                    case 2:
                    default:
                        throw new RuntimeException("Invalid constant trees tag: " + iCb);
                    case 3:
                        this.J0[i] = cn();
                        i++;
                    case 4:
                        this.J8[i] = ro();
                        i++;
                    case 5:
                        this.Ws[i] = sh();
                        i++;
                        i++;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        this.QX[i] = KD();
                        i++;
                        i++;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        this.we[i] = dx();
                        i++;
                    case 8:
                        this.XL[i] = dx();
                        i++;
                    case 9:
                    case 10:
                    case 11:
                        Mz();
                        Mz();
                        i++;
                    case 12:
                        Mz();
                        Mz();
                        i++;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 3379092152517155880L, this);
            }
            throw th;
        }
    }

    @ey(method = 1117376581923692880L)
    private boolean U2(b bVar) {
        try {
            if (kQ) {
                iy.tp(3874172820756381280L, this, bVar);
            }
            if ("java/lang/Enum".equals(this.lg) && bVar.gn(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                if (u7("()Ljava/lang/String;")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 3874172820756381280L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -527842687681203239L)
    private void Zo(b bVar) {
        try {
            if (kQ) {
                iy.tp(1986376908131602415L, this, bVar);
            }
            this.a8++;
            int i = 0;
            bVar.FH("<");
            while (this.aM[this.a8] != '>') {
                int i2 = this.a8;
                while (this.aM[this.a8] != ':') {
                    this.a8++;
                }
                if (i > 0) {
                    bVar.FH(", ");
                }
                bVar.Hw(this.aM, i2, this.a8 - i2);
                this.a8++;
                while (this.aM[this.a8] == ':') {
                    this.a8++;
                }
                bVar.FH(" extends ");
                v5(bVar);
                while (this.aM[this.a8] == ':') {
                    this.a8++;
                    bVar.FH(" & ");
                    v5(bVar);
                }
                i++;
            }
            this.a8++;
            bVar.FH(">");
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 1986376908131602415L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 4129766520341967995L)
    private boolean a8(b bVar) {
        try {
            if (kQ) {
                iy.tp(-5454500838547406047L, this, bVar);
            }
            if (bVar.gn("valueOf")) {
                if (u7("(Ljava/lang/String;)L" + this.lg + ";")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -5454500838547406047L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -2632306736799152805L)
    private void aM(String str, String str2, Vector<String> vector) {
        try {
            if (kQ) {
                iy.we(1482252349726693089L, this, str, str2, vector);
            }
            if (str2.length() > 0) {
                str2 = str2 + File.separator;
            }
            String[] list = new File(str + File.separatorChar).list();
            if (list != null) {
                for (String str3 : list) {
                    String str4 = str + File.separatorChar + str3;
                    if (new File(str4).isDirectory()) {
                        aM(str4, str2 + str3, vector);
                    } else if (str3.lastIndexOf(36) == -1 && str3.endsWith(".class")) {
                        vector.add(str2 + str3);
                    } else if (str3.endsWith(".java")) {
                        vector.add(str2 + str3);
                    }
                }
            }
        } catch (Throwable th) {
            String str5 = str2;
            if (yO) {
                iy.U2(th, 1482252349726693089L, this, str, str5, vector);
            }
            throw th;
        }
    }

    @ey(method = -1614053005409640411L)
    private void ca(List<File> list, int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (kQ) {
                iy.we(-655266563170064937L, this, list, new Integer(i), new Integer(i2));
            }
            if (i < i2) {
                String name = list.get(((i2 - i) / 2) + i).getName();
                int i3 = i;
                int i4 = i2;
                while (i3 <= i4) {
                    while (gn(list.get(i3).getName(), name) == -1) {
                        try {
                            i3++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i3;
                            i2 = i4;
                            if (!yO) {
                                throw th;
                            }
                            iy.U2(th, -655266563170064937L, this, list, new Integer(i), new Integer(i2));
                            throw th;
                        }
                    }
                    while (gn(name, list.get(i4).getName()) == -1) {
                        i4--;
                    }
                    if (i3 <= i4) {
                        File file = list.get(i4);
                        list.set(i4, list.get(i3));
                        list.set(i3, file);
                        i3++;
                        i4--;
                    }
                }
                ca(list, i, i4);
                ca(list, i3, i2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = -117830244502626816L)
    private int cb() {
        try {
            if (kQ) {
                iy.gn(-2967163752865352516L, this);
            }
            byte[] bArr = this.Zo;
            int i = this.gn;
            this.gn = i + 1;
            byte b2 = bArr[i];
            return b2 >= 0 ? b2 : b2 + 256;
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -2967163752865352516L, this);
            }
            throw th;
        }
    }

    @ey(method = 3629796607875909625L)
    private int cn() {
        try {
            if (kQ) {
                iy.gn(1702178331731362303L, this);
            }
            return (cb() << 24) + (cb() << 16) + (cb() << 8) + (cb() << 0);
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 1702178331731362303L, this);
            }
            throw th;
        }
    }

    @ey(method = -117834922471881455L)
    private int dx() {
        try {
            if (kQ) {
                iy.gn(-2967297625145413545L, this);
            }
            return (cb() << 8) + (cb() << 0);
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -2967297625145413545L, this);
            }
            throw th;
        }
    }

    @ey(method = -5125445460734388273L)
    private void ef(String str, String str2) {
        try {
            if (kQ) {
                iy.EQ(-2777625916409283123L, this, str, str2);
            }
            ZipFile zipFileYS = yS(str);
            ZipEntry entry = zipFileYS.getEntry(str2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry);
            String name = entry.getName();
            if (name.lastIndexOf(46) != -1) {
                name = name.substring(0, name.lastIndexOf(46));
            }
            String str3 = name + '$';
            for (ZipEntry zipEntry : J0(zipFileYS)) {
                String name2 = zipEntry.getName();
                if (!zipEntry.isDirectory() && name2.startsWith(str3) && name2.endsWith(".class")) {
                    int i = 0;
                    while (true) {
                        int iIndexOf = name2.indexOf(36, i);
                        if (iIndexOf != -1) {
                            i = iIndexOf + 1;
                            if (Character.isDigit(name2.charAt(i))) {
                                break;
                            }
                        } else {
                            arrayList.add(zipEntry);
                            break;
                        }
                    }
                }
            }
            x9(arrayList, 0, arrayList.size() - 1);
            this.gn = 0;
            this.VH = 0;
            for (ZipEntry zipEntry2 : arrayList) {
                c cVar = new c(zipFileYS.getInputStream(zipEntry2), zipEntry2.getSize());
                int i2 = cVar.read(this.v5);
                while (i2 != -1) {
                    if (this.VH + i2 >= this.Zo.length) {
                        byte[] bArr = new byte[(this.Zo.length * 2) + 1];
                        System.arraycopy(this.Zo, 0, bArr, 0, this.Zo.length);
                        this.Zo = bArr;
                    }
                    System.arraycopy(this.v5, 0, this.Zo, this.VH, i2);
                    this.VH += i2;
                    i2 = cVar.read(this.v5);
                }
                cVar.close();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, -2777625916409283123L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2751615862014027036L)
    private void ei(b bVar) {
        try {
            if (kQ) {
                iy.tp(-14701590390533760L, this, bVar);
            }
            bVar.FH("@");
            tp(dx());
            DW(bVar);
            bVar.FH("(");
            int iDx = dx();
            for (int i = 0; i < iDx; i++) {
                if (i > 0) {
                    bVar.FH(",");
                }
                tp(dx());
                bVar.Hw(this.aM, 0, this.j3);
                bVar.FH("=");
                nw(bVar);
            }
            bVar.FH(")");
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -14701590390533760L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 1146048947307478737L)
    private boolean er(int i) {
        try {
            if (kQ) {
                iy.u7(5313864996469433271L, this, i);
            }
            return (i & 2) == 0;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 5313864996469433271L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7191256318984474704L)
    private void g3(int i) {
        try {
            if (kQ) {
                iy.u7(-355670187961994048L, this, i);
            }
            this.gn += i;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -355670187961994048L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3938403990559570560L)
    private void gW() {
        try {
            if (kQ) {
                iy.gn(-2240035360430725376L, this);
            }
            int iDx = dx();
            for (int i = 0; i < iDx; i++) {
                tp(dx());
                if (this.Hw && u7("RuntimeVisibleAnnotations")) {
                    sG();
                    P8(this.vJ);
                } else if (this.Hw && u7("RuntimeInvisibleAnnotations")) {
                    sG();
                    P8(this.vJ);
                } else if (this.Hw && u7("Enum")) {
                    g3(sG());
                } else if (this.Hw && u7("Signature") && this.lg.indexOf("SunJCE_") == -1) {
                    sG();
                    tp(dx());
                    this.Sf.Zo();
                    this.a8 = 0;
                    if (this.aM[0] == '<') {
                        Zo(this.Sf);
                    }
                    if (this.rN) {
                        this.Sf.FH(" extends ");
                        v5(this.Sf);
                        int i2 = 0;
                        while (this.a8 < this.j3) {
                            if (i2 == 0) {
                                this.Sf.FH(" implements ");
                            } else {
                                this.Sf.FH(", ");
                            }
                            v5(this.Sf);
                            i2++;
                        }
                    } else {
                        v5(this.I);
                        int i3 = 0;
                        while (this.a8 < this.j3) {
                            if (i3 == 0) {
                                this.Sf.FH(" extends ");
                            } else {
                                this.Sf.FH(", ");
                            }
                            v5(this.Sf);
                            i3++;
                        }
                    }
                    if (this.BT || this.vy) {
                        this.Sf.Zo();
                    }
                } else if (u7("Deprecated")) {
                    g3(sG());
                    for (int i4 = 0; i4 < this.er; i4++) {
                        this.cb.FH("    ");
                    }
                    this.cb.FH("/** @deprecated */\n");
                } else if (u7("InnerClasses")) {
                    sG();
                    int iDx2 = dx();
                    for (int i5 = 0; i5 < iDx2; i5++) {
                        int iDx3 = dx() - 1;
                        if (iDx3 != -1) {
                            tp(this.we[iDx3]);
                            String str = new String(this.aM, 0, this.j3);
                            int iDx4 = dx() - 1;
                            if (iDx4 != -1) {
                                tp(this.we[iDx4]);
                                tp(dx());
                                int iDx5 = dx();
                                if (str.equals(this.lg)) {
                                    if ((iDx5 & 8) == 0) {
                                        this.yS = true;
                                    }
                                    this.gW = er(iDx5);
                                    this.sG.Zo();
                                    FH(iDx5, this.sG);
                                }
                            } else {
                                Mz();
                                Mz();
                            }
                        } else {
                            Mz();
                            Mz();
                            Mz();
                        }
                    }
                } else {
                    g3(sG());
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -2240035360430725376L, this);
            }
            throw th;
        }
    }

    @ey(method = 840893199376670107L)
    private int gn(String str, String str2) {
        try {
            if (kQ) {
                iy.EQ(4419026447001661737L, this, str, str2);
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
            if (yO) {
                iy.Mr(th, 4419026447001661737L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -3430039342762506432L)
    private void j3() {
        try {
            if (kQ) {
                iy.gn(2136876264385512720L, this);
            }
            this.j6 = true;
            this.v5 = new byte[10000];
            this.Zo = new byte[20000];
            this.u7 = new int[10000];
            this.tp = new int[10000];
            this.EQ = new int[10000];
            this.we = new int[10000];
            this.J0 = new int[10000];
            this.J8 = new float[10000];
            this.Ws = new long[10000];
            this.QX = new double[10000];
            this.XL = new int[10000];
            this.ei = new FunctionOfIntInt();
            this.aM = new char[1000];
            this.Mr = new char[1000];
            a aVar = null;
            this.nw = new b(aVar);
            this.SI = new b(aVar);
            this.KD = new b(aVar);
            this.ro = new b(aVar);
            this.cn = new b(aVar);
            this.sh = new b(aVar);
            this.cb = new b(aVar);
            this.dx = new b(aVar);
            this.sG = new b(aVar);
            this.ef = new b(aVar);
            this.Sf = new b(aVar);
            this.vJ = new b(aVar);
            this.g3 = new b(aVar);
            this.Mz = new b(aVar);
            this.I = new b(aVar);
            this.ca = new b(aVar);
            this.x9 = new b(aVar);
            this.Qq = new b(aVar);
            this.sy = new b(aVar);
            this.aj = new b(aVar);
            this.lp = new b(aVar);
            this.OW = new b(aVar);
            this.br = new b(aVar);
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 2136876264385512720L, this);
            }
            throw th;
        }
    }

    @ey(method = -6065766188916491904L)
    private void j6(b bVar) {
        try {
            if (kQ) {
                iy.tp(1615154812691169240L, this, bVar);
            }
            int i = 0;
            this.a8 = 0;
            int i2 = 0;
            while (true) {
                if (this.a8 >= this.j3 || this.aM[this.a8] == '/' || this.aM[this.a8] == '$' || this.aM[this.a8] == '+') {
                    if (i > 0) {
                        bVar.FH(".");
                    }
                    bVar.Hw(this.aM, i2, this.a8 - i2);
                    i++;
                    i2 = this.a8 + 1;
                    this.a8 = i2;
                }
                if (this.a8 >= this.j3) {
                    return;
                } else {
                    this.a8++;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 1615154812691169240L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -4422589745765692525L)
    private boolean lg(b bVar) {
        try {
            if (kQ) {
                iy.tp(-5271829868084428003L, this, bVar);
            }
            if (bVar.gn("values")) {
                if (u7("()[L" + this.lg + ";")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -5271829868084428003L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -5883248721571178352L)
    private void nw(b bVar) {
        try {
            if (kQ) {
                iy.tp(-6577139453006157516L, this, bVar);
            }
            int iCb = cb();
            if (iCb == 64) {
                ei(bVar);
                return;
            }
            if (iCb != 70 && iCb != 83) {
                if (iCb == 99) {
                    tp(dx());
                    DW(bVar);
                    bVar.FH(".class");
                    return;
                }
                if (iCb == 101) {
                    tp(dx());
                    DW(bVar);
                    bVar.FH(".");
                    tp(dx());
                    bVar.Hw(this.aM, 0, this.j3);
                    return;
                }
                if (iCb == 115) {
                    bVar.FH("\"");
                    tp(dx());
                    bVar.v5(this.aM, 0, this.j3);
                    bVar.FH("\"");
                    return;
                }
                if (iCb != 73 && iCb != 74 && iCb != 90) {
                    if (iCb == 91) {
                        bVar.FH("{");
                        int iDx = dx();
                        for (int i = 0; i < iDx; i++) {
                            nw(bVar);
                            bVar.FH(",");
                        }
                        bVar.FH("}");
                        return;
                    }
                    switch (iCb) {
                        case 66:
                        case 67:
                        case 68:
                            break;
                        default:
                            return;
                    }
                }
            }
            int iDx2 = dx() - 1;
            int i2 = this.u7[iDx2];
            if (i2 == 3) {
                bVar.FH(Integer.toString(this.J0[iDx2]));
                return;
            }
            if (i2 == 4) {
                bVar.FH(Float.toString(this.J8[iDx2]));
                bVar.FH("f");
            } else if (i2 == 5) {
                bVar.FH(Long.toString(this.Ws[iDx2]));
                bVar.FH("l");
            } else {
                if (i2 != 6) {
                    return;
                }
                bVar.FH(Double.toString(this.QX[iDx2]));
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -6577139453006157516L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = -2559927313801528320L)
    private boolean rN(b bVar) {
        try {
            if (kQ) {
                iy.tp(-391732827715177300L, this, bVar);
            }
            for (int i = 0; i < this.XX.length; i++) {
                if (this.XX[i][0].equals(this.lg) && bVar.gn(this.XX[i][1]) && u7(this.XX[i][2])) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -391732827715177300L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 3953389824355190912L)
    private float ro() {
        try {
            if (kQ) {
                iy.gn(3724906672244381160L, this);
            }
            int iCb = (cb() << 24) + (cb() << 16) + (cb() << 8) + (cb() << 0);
            if (iCb == 2139095040) {
                return Float.POSITIVE_INFINITY;
            }
            if (iCb == -8388608) {
                return Float.NEGATIVE_INFINITY;
            }
            if (iCb >= 2139095041 && iCb <= Integer.MAX_VALUE) {
                return Float.NaN;
            }
            if (iCb >= -8388607 && iCb <= -1) {
                return Float.NaN;
            }
            int i = (iCb >> 31) == 0 ? 1 : -1;
            int i2 = (iCb >> 23) & 255;
            int i3 = iCb & 8388607;
            return i * (i2 == 0 ? i3 << 1 : i3 | 8388608) * ((float) Math.pow(2.0d, i2 - 150));
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 3724906672244381160L, this);
            }
            throw th;
        }
    }

    @ey(method = -117844278398200851L)
    private int sG() {
        try {
            if (kQ) {
                iy.gn(-2967565369693345721L, this);
            }
            return (cb() << 24) + (cb() << 16) + (cb() << 8) + (cb() << 0);
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -2967565369693345721L, this);
            }
            throw th;
        }
    }

    @ey(method = -1185975022423631436L)
    private long sh() {
        try {
            if (kQ) {
                iy.gn(-1534152531012257736L, this);
            }
            return (cb() << 56) + (cb() << 48) + (cb() << 40) + (cb() << 32) + (cb() << 24) + (cb() << 16) + (cb() << 8) + (cb() << 0);
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -1534152531012257736L, this);
            }
            throw th;
        }
    }

    @ey(method = -561252473275971344L)
    private void tp(int i) {
        try {
            if (kQ) {
                iy.u7(194587436110893072L, this, i);
            }
            this.j3 = 0;
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            int i3 = this.EQ[i2];
            int i4 = this.tp[i2];
            if (i4 >= this.aM.length) {
                this.aM = new char[i4];
            }
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i3 + 1;
                byte b2 = this.Zo[i3];
                switch (b2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        i5++;
                        char[] cArr = this.aM;
                        int i7 = this.j3;
                        this.j3 = i7 + 1;
                        cArr[i7] = (char) b2;
                        i3 = i6;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        i5++;
                        i3 = i6;
                    case 12:
                    case 13:
                        i5 += 2;
                        int i8 = i6 + 1;
                        byte b3 = this.Zo[i6];
                        char[] cArr2 = this.aM;
                        int i9 = this.j3;
                        this.j3 = i9 + 1;
                        cArr2[i9] = (char) (((b2 & 31) << 6) | (b3 & 63));
                        i3 = i8;
                    case 14:
                        i5 += 3;
                        int i10 = i6 + 1;
                        byte b4 = this.Zo[i6];
                        int i11 = i10 + 1;
                        byte b5 = this.Zo[i10];
                        char[] cArr3 = this.aM;
                        int i12 = this.j3;
                        this.j3 = i12 + 1;
                        cArr3[i12] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | ((b5 & 63) << 0));
                        i3 = i11;
                }
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 194587436110893072L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 194211244243077040L)
    private boolean u7(String str) {
        try {
            if (kQ) {
                iy.tp(517288778555361200L, this, str);
            }
            if (this.j3 != str.length()) {
                return false;
            }
            for (int i = 0; i < this.j3; i++) {
                if (this.aM[i] != str.charAt(i)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 517288778555361200L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3290344426616080332L)
    private void v5(b bVar) {
        char c2;
        try {
            if (kQ) {
                iy.tp(-4873588071510752536L, this, bVar);
            }
            int i = this.a8;
            while (this.aM[this.a8] == '[') {
                int i2 = this.a8 + 1;
                this.a8 = i2;
                char c3 = this.aM[i2];
                if (c3 == '+' || c3 == '-' || c3 == '=') {
                    this.a8++;
                }
            }
            char c4 = this.aM[this.a8];
            if (c4 != 'F') {
                char c5 = ';';
                if (c4 == 'L') {
                    int i3 = this.a8 + 1;
                    this.a8 = i3;
                    int i4 = 0;
                    while (true) {
                        char c6 = this.aM[this.a8];
                        if (c6 == '$' || c6 == '+' || c6 == '/') {
                            if (i4 != 0) {
                                bVar.FH(".");
                            }
                            bVar.Hw(this.aM, i3, this.a8 - i3);
                            i4++;
                            i3 = this.a8 + 1;
                            this.a8 = i3;
                            c5 = ';';
                        } else if (c6 == c5) {
                            if (i4 != 0) {
                                bVar.FH(".");
                            }
                            bVar.Hw(this.aM, i3, this.a8 - i3);
                            this.a8++;
                        } else if (c6 != '<') {
                            this.a8++;
                        } else {
                            if (i4 != 0) {
                                bVar.FH(".");
                            }
                            bVar.Hw(this.aM, i3, this.a8 - i3);
                            int i5 = i4 + 1;
                            this.a8++;
                            bVar.FH("<");
                            int i6 = 0;
                            while (true) {
                                c2 = '>';
                                if (this.aM[this.a8] == '>') {
                                    break;
                                }
                                if (i6 != 0) {
                                    bVar.FH(", ");
                                }
                                if (this.aM[this.a8] == '*') {
                                    bVar.FH("?");
                                    this.a8++;
                                } else {
                                    char c7 = this.aM[this.a8];
                                    if (c7 == '+') {
                                        bVar.FH("? extends ");
                                        this.a8++;
                                    } else if (c7 == '-') {
                                        bVar.FH("? super ");
                                        this.a8++;
                                    } else if (c7 == '=') {
                                        this.a8++;
                                    }
                                    v5(bVar);
                                }
                                i6++;
                            }
                            this.a8++;
                            bVar.FH(">");
                            if (this.aM[this.a8] == ';') {
                                this.a8++;
                            }
                            while (this.a8 < this.j3 && this.aM[this.a8] == '.') {
                                int i7 = this.a8 + 1;
                                this.a8 = i7;
                                while (true) {
                                    char c8 = this.aM[this.a8];
                                    if (c8 == '$' || c8 == '+') {
                                        i7 = this.a8 + 1;
                                        this.a8 = i7;
                                        c2 = '>';
                                    } else if (c8 == ';' || c8 == '<') {
                                        break;
                                    } else {
                                        this.a8++;
                                    }
                                }
                                if (i5 != 0) {
                                    bVar.FH(".");
                                }
                                bVar.Hw(this.aM, i7, this.a8 - i7);
                                if (this.aM[this.a8] == '<') {
                                    this.a8++;
                                    bVar.FH("<");
                                    int i8 = 0;
                                    while (this.aM[this.a8] != c2) {
                                        if (i8 != 0) {
                                            bVar.FH(", ");
                                        }
                                        if (this.aM[this.a8] == '*') {
                                            bVar.FH("?");
                                            this.a8++;
                                        } else {
                                            char c9 = this.aM[this.a8];
                                            if (c9 == '+') {
                                                bVar.FH("? extends ");
                                                this.a8++;
                                            } else if (c9 == '-') {
                                                bVar.FH("? super ");
                                                this.a8++;
                                            } else if (c9 == '=') {
                                                this.a8++;
                                            }
                                            v5(bVar);
                                        }
                                        i8++;
                                        c2 = '>';
                                    }
                                    this.a8++;
                                    bVar.FH(">");
                                }
                                i5 += 2;
                                c2 = '>';
                            }
                            if (this.aM[this.a8] == ';') {
                                this.a8++;
                            }
                        }
                    }
                } else if (c4 == 'V') {
                    bVar.FH("void");
                    this.a8++;
                } else if (c4 == 'Z') {
                    bVar.FH("boolean");
                    this.a8++;
                } else if (c4 == 'I') {
                    bVar.FH("int");
                    this.a8++;
                } else if (c4 == 'J') {
                    bVar.FH("long");
                    this.a8++;
                } else if (c4 == 'S') {
                    bVar.FH("short");
                    this.a8++;
                } else if (c4 != 'T') {
                    switch (c4) {
                        case 'B':
                            bVar.FH("byte");
                            this.a8++;
                            break;
                        case 'C':
                            bVar.FH("char");
                            this.a8++;
                            break;
                        case 'D':
                            bVar.FH("double");
                            this.a8++;
                            break;
                    }
                } else {
                    int i9 = this.a8 + 1;
                    this.a8 = i9;
                    while (this.aM[this.a8] != ';') {
                        this.a8++;
                    }
                    bVar.Hw(this.aM, i9, this.a8 - i9);
                    this.a8++;
                }
            } else {
                bVar.FH("float");
                this.a8++;
            }
            while (this.aM[i] == '[') {
                i++;
                char c10 = this.aM[i];
                if (c10 == '+') {
                    bVar.FH("[]");
                } else if (c10 == '-') {
                    bVar.FH("[]");
                } else if (c10 != '=') {
                    bVar.FH("[]");
                } else {
                    bVar.FH("[]");
                }
                i++;
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -4873588071510752536L, this, bVar);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0355 A[Catch: all -> 0x073f, TryCatch #0 {all -> 0x073f, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:10:0x002d, B:12:0x003c, B:16:0x0047, B:18:0x008c, B:22:0x0093, B:24:0x00a1, B:26:0x00ae, B:28:0x00b4, B:68:0x01dc, B:30:0x00c4, B:32:0x00c8, B:34:0x00ce, B:35:0x00d7, B:37:0x00df, B:49:0x0108, B:50:0x0129, B:51:0x013d, B:52:0x0158, B:53:0x0172, B:54:0x0185, B:56:0x0191, B:57:0x019b, B:59:0x01a1, B:60:0x01aa, B:62:0x01ae, B:64:0x01b4, B:66:0x01bd, B:67:0x01d5, B:73:0x01f0, B:82:0x0234, B:76:0x0211, B:78:0x021f, B:80:0x0226, B:81:0x022d, B:83:0x0265, B:84:0x0270, B:86:0x027f, B:90:0x029e, B:94:0x02a5, B:98:0x02b4, B:100:0x02f1, B:104:0x02f8, B:106:0x02fc, B:109:0x0301, B:111:0x0305, B:115:0x030c, B:120:0x0328, B:122:0x0333, B:124:0x033b, B:189:0x0517, B:126:0x0351, B:128:0x0355, B:130:0x035d, B:132:0x0373, B:134:0x0377, B:136:0x037f, B:137:0x0393, B:139:0x0397, B:141:0x039f, B:142:0x03b2, B:144:0x03b8, B:145:0x03cb, B:147:0x03d1, B:148:0x03e3, B:150:0x03e7, B:152:0x03ed, B:154:0x03f8, B:158:0x040b, B:160:0x0413, B:162:0x041b, B:164:0x042a, B:166:0x043d, B:167:0x0444, B:168:0x044e, B:170:0x0458, B:172:0x0462, B:173:0x047f, B:175:0x0487, B:178:0x048d, B:180:0x04af, B:182:0x04be, B:184:0x04c8, B:187:0x0501, B:186:0x04f4, B:188:0x050c, B:190:0x0525, B:192:0x0541, B:193:0x0544, B:195:0x0548, B:199:0x0553, B:201:0x0557, B:205:0x0566, B:207:0x0570, B:208:0x057a, B:210:0x05a0, B:212:0x05aa, B:213:0x05b5, B:215:0x05bb, B:217:0x05c5, B:219:0x05cd, B:220:0x05d4, B:223:0x05df, B:241:0x0627, B:234:0x0601, B:236:0x060f, B:238:0x0616, B:240:0x0620, B:252:0x06ba, B:254:0x06c3, B:255:0x06ca, B:257:0x06fb, B:262:0x0718, B:263:0x071e, B:246:0x069b, B:248:0x06a9, B:250:0x06b0, B:251:0x06b5), top: B:276:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0373 A[Catch: all -> 0x073f, PHI: r25
      0x0373: PHI (r25v3 java.lang.String) = (r25v2 java.lang.String), (r25v5 java.lang.String) binds: [B:127:0x0353, B:131:0x0371] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x073f, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:10:0x002d, B:12:0x003c, B:16:0x0047, B:18:0x008c, B:22:0x0093, B:24:0x00a1, B:26:0x00ae, B:28:0x00b4, B:68:0x01dc, B:30:0x00c4, B:32:0x00c8, B:34:0x00ce, B:35:0x00d7, B:37:0x00df, B:49:0x0108, B:50:0x0129, B:51:0x013d, B:52:0x0158, B:53:0x0172, B:54:0x0185, B:56:0x0191, B:57:0x019b, B:59:0x01a1, B:60:0x01aa, B:62:0x01ae, B:64:0x01b4, B:66:0x01bd, B:67:0x01d5, B:73:0x01f0, B:82:0x0234, B:76:0x0211, B:78:0x021f, B:80:0x0226, B:81:0x022d, B:83:0x0265, B:84:0x0270, B:86:0x027f, B:90:0x029e, B:94:0x02a5, B:98:0x02b4, B:100:0x02f1, B:104:0x02f8, B:106:0x02fc, B:109:0x0301, B:111:0x0305, B:115:0x030c, B:120:0x0328, B:122:0x0333, B:124:0x033b, B:189:0x0517, B:126:0x0351, B:128:0x0355, B:130:0x035d, B:132:0x0373, B:134:0x0377, B:136:0x037f, B:137:0x0393, B:139:0x0397, B:141:0x039f, B:142:0x03b2, B:144:0x03b8, B:145:0x03cb, B:147:0x03d1, B:148:0x03e3, B:150:0x03e7, B:152:0x03ed, B:154:0x03f8, B:158:0x040b, B:160:0x0413, B:162:0x041b, B:164:0x042a, B:166:0x043d, B:167:0x0444, B:168:0x044e, B:170:0x0458, B:172:0x0462, B:173:0x047f, B:175:0x0487, B:178:0x048d, B:180:0x04af, B:182:0x04be, B:184:0x04c8, B:187:0x0501, B:186:0x04f4, B:188:0x050c, B:190:0x0525, B:192:0x0541, B:193:0x0544, B:195:0x0548, B:199:0x0553, B:201:0x0557, B:205:0x0566, B:207:0x0570, B:208:0x057a, B:210:0x05a0, B:212:0x05aa, B:213:0x05b5, B:215:0x05bb, B:217:0x05c5, B:219:0x05cd, B:220:0x05d4, B:223:0x05df, B:241:0x0627, B:234:0x0601, B:236:0x060f, B:238:0x0616, B:240:0x0620, B:252:0x06ba, B:254:0x06c3, B:255:0x06ca, B:257:0x06fb, B:262:0x0718, B:263:0x071e, B:246:0x069b, B:248:0x06a9, B:250:0x06b0, B:251:0x06b5), top: B:276:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0393 A[Catch: all -> 0x073f, TryCatch #0 {all -> 0x073f, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:10:0x002d, B:12:0x003c, B:16:0x0047, B:18:0x008c, B:22:0x0093, B:24:0x00a1, B:26:0x00ae, B:28:0x00b4, B:68:0x01dc, B:30:0x00c4, B:32:0x00c8, B:34:0x00ce, B:35:0x00d7, B:37:0x00df, B:49:0x0108, B:50:0x0129, B:51:0x013d, B:52:0x0158, B:53:0x0172, B:54:0x0185, B:56:0x0191, B:57:0x019b, B:59:0x01a1, B:60:0x01aa, B:62:0x01ae, B:64:0x01b4, B:66:0x01bd, B:67:0x01d5, B:73:0x01f0, B:82:0x0234, B:76:0x0211, B:78:0x021f, B:80:0x0226, B:81:0x022d, B:83:0x0265, B:84:0x0270, B:86:0x027f, B:90:0x029e, B:94:0x02a5, B:98:0x02b4, B:100:0x02f1, B:104:0x02f8, B:106:0x02fc, B:109:0x0301, B:111:0x0305, B:115:0x030c, B:120:0x0328, B:122:0x0333, B:124:0x033b, B:189:0x0517, B:126:0x0351, B:128:0x0355, B:130:0x035d, B:132:0x0373, B:134:0x0377, B:136:0x037f, B:137:0x0393, B:139:0x0397, B:141:0x039f, B:142:0x03b2, B:144:0x03b8, B:145:0x03cb, B:147:0x03d1, B:148:0x03e3, B:150:0x03e7, B:152:0x03ed, B:154:0x03f8, B:158:0x040b, B:160:0x0413, B:162:0x041b, B:164:0x042a, B:166:0x043d, B:167:0x0444, B:168:0x044e, B:170:0x0458, B:172:0x0462, B:173:0x047f, B:175:0x0487, B:178:0x048d, B:180:0x04af, B:182:0x04be, B:184:0x04c8, B:187:0x0501, B:186:0x04f4, B:188:0x050c, B:190:0x0525, B:192:0x0541, B:193:0x0544, B:195:0x0548, B:199:0x0553, B:201:0x0557, B:205:0x0566, B:207:0x0570, B:208:0x057a, B:210:0x05a0, B:212:0x05aa, B:213:0x05b5, B:215:0x05bb, B:217:0x05c5, B:219:0x05cd, B:220:0x05d4, B:223:0x05df, B:241:0x0627, B:234:0x0601, B:236:0x060f, B:238:0x0616, B:240:0x0620, B:252:0x06ba, B:254:0x06c3, B:255:0x06ca, B:257:0x06fb, B:262:0x0718, B:263:0x071e, B:246:0x069b, B:248:0x06a9, B:250:0x06b0, B:251:0x06b5), top: B:276:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b2 A[Catch: all -> 0x073f, TryCatch #0 {all -> 0x073f, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:10:0x002d, B:12:0x003c, B:16:0x0047, B:18:0x008c, B:22:0x0093, B:24:0x00a1, B:26:0x00ae, B:28:0x00b4, B:68:0x01dc, B:30:0x00c4, B:32:0x00c8, B:34:0x00ce, B:35:0x00d7, B:37:0x00df, B:49:0x0108, B:50:0x0129, B:51:0x013d, B:52:0x0158, B:53:0x0172, B:54:0x0185, B:56:0x0191, B:57:0x019b, B:59:0x01a1, B:60:0x01aa, B:62:0x01ae, B:64:0x01b4, B:66:0x01bd, B:67:0x01d5, B:73:0x01f0, B:82:0x0234, B:76:0x0211, B:78:0x021f, B:80:0x0226, B:81:0x022d, B:83:0x0265, B:84:0x0270, B:86:0x027f, B:90:0x029e, B:94:0x02a5, B:98:0x02b4, B:100:0x02f1, B:104:0x02f8, B:106:0x02fc, B:109:0x0301, B:111:0x0305, B:115:0x030c, B:120:0x0328, B:122:0x0333, B:124:0x033b, B:189:0x0517, B:126:0x0351, B:128:0x0355, B:130:0x035d, B:132:0x0373, B:134:0x0377, B:136:0x037f, B:137:0x0393, B:139:0x0397, B:141:0x039f, B:142:0x03b2, B:144:0x03b8, B:145:0x03cb, B:147:0x03d1, B:148:0x03e3, B:150:0x03e7, B:152:0x03ed, B:154:0x03f8, B:158:0x040b, B:160:0x0413, B:162:0x041b, B:164:0x042a, B:166:0x043d, B:167:0x0444, B:168:0x044e, B:170:0x0458, B:172:0x0462, B:173:0x047f, B:175:0x0487, B:178:0x048d, B:180:0x04af, B:182:0x04be, B:184:0x04c8, B:187:0x0501, B:186:0x04f4, B:188:0x050c, B:190:0x0525, B:192:0x0541, B:193:0x0544, B:195:0x0548, B:199:0x0553, B:201:0x0557, B:205:0x0566, B:207:0x0570, B:208:0x057a, B:210:0x05a0, B:212:0x05aa, B:213:0x05b5, B:215:0x05bb, B:217:0x05c5, B:219:0x05cd, B:220:0x05d4, B:223:0x05df, B:241:0x0627, B:234:0x0601, B:236:0x060f, B:238:0x0616, B:240:0x0620, B:252:0x06ba, B:254:0x06c3, B:255:0x06ca, B:257:0x06fb, B:262:0x0718, B:263:0x071e, B:246:0x069b, B:248:0x06a9, B:250:0x06b0, B:251:0x06b5), top: B:276:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b8 A[Catch: all -> 0x073f, TryCatch #0 {all -> 0x073f, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:10:0x002d, B:12:0x003c, B:16:0x0047, B:18:0x008c, B:22:0x0093, B:24:0x00a1, B:26:0x00ae, B:28:0x00b4, B:68:0x01dc, B:30:0x00c4, B:32:0x00c8, B:34:0x00ce, B:35:0x00d7, B:37:0x00df, B:49:0x0108, B:50:0x0129, B:51:0x013d, B:52:0x0158, B:53:0x0172, B:54:0x0185, B:56:0x0191, B:57:0x019b, B:59:0x01a1, B:60:0x01aa, B:62:0x01ae, B:64:0x01b4, B:66:0x01bd, B:67:0x01d5, B:73:0x01f0, B:82:0x0234, B:76:0x0211, B:78:0x021f, B:80:0x0226, B:81:0x022d, B:83:0x0265, B:84:0x0270, B:86:0x027f, B:90:0x029e, B:94:0x02a5, B:98:0x02b4, B:100:0x02f1, B:104:0x02f8, B:106:0x02fc, B:109:0x0301, B:111:0x0305, B:115:0x030c, B:120:0x0328, B:122:0x0333, B:124:0x033b, B:189:0x0517, B:126:0x0351, B:128:0x0355, B:130:0x035d, B:132:0x0373, B:134:0x0377, B:136:0x037f, B:137:0x0393, B:139:0x0397, B:141:0x039f, B:142:0x03b2, B:144:0x03b8, B:145:0x03cb, B:147:0x03d1, B:148:0x03e3, B:150:0x03e7, B:152:0x03ed, B:154:0x03f8, B:158:0x040b, B:160:0x0413, B:162:0x041b, B:164:0x042a, B:166:0x043d, B:167:0x0444, B:168:0x044e, B:170:0x0458, B:172:0x0462, B:173:0x047f, B:175:0x0487, B:178:0x048d, B:180:0x04af, B:182:0x04be, B:184:0x04c8, B:187:0x0501, B:186:0x04f4, B:188:0x050c, B:190:0x0525, B:192:0x0541, B:193:0x0544, B:195:0x0548, B:199:0x0553, B:201:0x0557, B:205:0x0566, B:207:0x0570, B:208:0x057a, B:210:0x05a0, B:212:0x05aa, B:213:0x05b5, B:215:0x05bb, B:217:0x05c5, B:219:0x05cd, B:220:0x05d4, B:223:0x05df, B:241:0x0627, B:234:0x0601, B:236:0x060f, B:238:0x0616, B:240:0x0620, B:252:0x06ba, B:254:0x06c3, B:255:0x06ca, B:257:0x06fb, B:262:0x0718, B:263:0x071e, B:246:0x069b, B:248:0x06a9, B:250:0x06b0, B:251:0x06b5), top: B:276:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03cb A[Catch: all -> 0x073f, TryCatch #0 {all -> 0x073f, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:10:0x002d, B:12:0x003c, B:16:0x0047, B:18:0x008c, B:22:0x0093, B:24:0x00a1, B:26:0x00ae, B:28:0x00b4, B:68:0x01dc, B:30:0x00c4, B:32:0x00c8, B:34:0x00ce, B:35:0x00d7, B:37:0x00df, B:49:0x0108, B:50:0x0129, B:51:0x013d, B:52:0x0158, B:53:0x0172, B:54:0x0185, B:56:0x0191, B:57:0x019b, B:59:0x01a1, B:60:0x01aa, B:62:0x01ae, B:64:0x01b4, B:66:0x01bd, B:67:0x01d5, B:73:0x01f0, B:82:0x0234, B:76:0x0211, B:78:0x021f, B:80:0x0226, B:81:0x022d, B:83:0x0265, B:84:0x0270, B:86:0x027f, B:90:0x029e, B:94:0x02a5, B:98:0x02b4, B:100:0x02f1, B:104:0x02f8, B:106:0x02fc, B:109:0x0301, B:111:0x0305, B:115:0x030c, B:120:0x0328, B:122:0x0333, B:124:0x033b, B:189:0x0517, B:126:0x0351, B:128:0x0355, B:130:0x035d, B:132:0x0373, B:134:0x0377, B:136:0x037f, B:137:0x0393, B:139:0x0397, B:141:0x039f, B:142:0x03b2, B:144:0x03b8, B:145:0x03cb, B:147:0x03d1, B:148:0x03e3, B:150:0x03e7, B:152:0x03ed, B:154:0x03f8, B:158:0x040b, B:160:0x0413, B:162:0x041b, B:164:0x042a, B:166:0x043d, B:167:0x0444, B:168:0x044e, B:170:0x0458, B:172:0x0462, B:173:0x047f, B:175:0x0487, B:178:0x048d, B:180:0x04af, B:182:0x04be, B:184:0x04c8, B:187:0x0501, B:186:0x04f4, B:188:0x050c, B:190:0x0525, B:192:0x0541, B:193:0x0544, B:195:0x0548, B:199:0x0553, B:201:0x0557, B:205:0x0566, B:207:0x0570, B:208:0x057a, B:210:0x05a0, B:212:0x05aa, B:213:0x05b5, B:215:0x05bb, B:217:0x05c5, B:219:0x05cd, B:220:0x05d4, B:223:0x05df, B:241:0x0627, B:234:0x0601, B:236:0x060f, B:238:0x0616, B:240:0x0620, B:252:0x06ba, B:254:0x06c3, B:255:0x06ca, B:257:0x06fb, B:262:0x0718, B:263:0x071e, B:246:0x069b, B:248:0x06a9, B:250:0x06b0, B:251:0x06b5), top: B:276:0x0007 }] */
    @abcd.ey(method = 1276248629709790200L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void vy() {
        /*
            Method dump skipped, instructions count: 1871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.classfile.ClassFilePreProcessor.vy():void");
    }

    @ey(method = -1937693786911451163L)
    private void we(String str) {
        try {
            if (kQ) {
                iy.tp(-1172025338369159625L, this, str);
            }
            this.nw.Zo();
            this.er = -1;
            int i = 0;
            while (this.gn < this.VH) {
                Sf();
                this.sh.Zo();
                this.cb.Zo();
                this.dx.Zo();
                this.sG.Zo();
                this.ef.Zo();
                this.Sf.Zo();
                this.vJ.Zo();
                this.g3.Zo();
                this.SI.Zo();
                this.KD.Zo();
                this.ro.Zo();
                this.cn.Zo();
                int i2 = this.er;
                BT();
                vy();
                gW();
                if (!this.gW || this.er > i + 1) {
                    this.er = i2;
                } else {
                    i = this.er;
                    if (this.nw.EQ() == 0) {
                        this.nw.DW(this.sh);
                    }
                    while (i2 >= this.er) {
                        for (int i3 = 0; i3 < i2; i3++) {
                            this.nw.FH("    ");
                        }
                        this.nw.FH("}\n\n");
                        i2--;
                    }
                    this.nw.FH("\n");
                    this.nw.DW(this.cb);
                    this.nw.DW(this.dx);
                    this.nw.DW(this.vJ);
                    this.nw.DW(this.sG);
                    this.nw.DW(this.ef);
                    this.nw.DW(this.Sf);
                    this.nw.FH("\n");
                    for (int i4 = 0; i4 < this.er; i4++) {
                        this.nw.FH("    ");
                    }
                    this.nw.FH("{\n");
                    if (this.BT) {
                        this.nw.DW(this.cn);
                        this.nw.DW(this.Mz);
                        this.nw.FH(";\n\n");
                    }
                    if (!this.P8 && "java/lang/Enum".equals(this.lg)) {
                        this.SI.DW(this.Mz);
                        this.SI.FH("public final String name() {}\n\n");
                        this.SI.DW(this.Mz);
                        this.SI.FH("public final int ordinal() {}\n\n");
                    }
                    this.nw.DW(this.SI);
                    if (this.yS) {
                        this.nw.DW(this.ro);
                    } else {
                        this.nw.DW(this.KD);
                    }
                }
            }
            for (int i5 = this.er; i5 >= 0; i5--) {
                for (int i6 = 0; i6 < i5; i6++) {
                    this.nw.FH("    ");
                }
                this.nw.FH("}\n\n");
            }
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -1172025338369159625L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2829125249572431667L)
    private void x9(List<ZipEntry> list, int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (kQ) {
                iy.we(1704523482640934085L, this, list, new Integer(i), new Integer(i2));
            }
            if (i < i2) {
                String name = list.get(((i2 - i) / 2) + i).getName();
                int i3 = i;
                int i4 = i2;
                while (i3 <= i4) {
                    while (gn(list.get(i3).getName(), name) == -1) {
                        try {
                            i3++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i3;
                            i2 = i4;
                            if (!yO) {
                                throw th;
                            }
                            iy.U2(th, 1704523482640934085L, this, list, new Integer(i), new Integer(i2));
                            throw th;
                        }
                    }
                    while (gn(name, list.get(i4).getName()) == -1) {
                        i4--;
                    }
                    if (i3 <= i4) {
                        ZipEntry zipEntry = list.get(i4);
                        list.set(i4, list.get(i3));
                        list.set(i3, zipEntry);
                        i3++;
                        i4--;
                    }
                }
                x9(list, i, i4);
                x9(list, i3, i2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = 2601335254500539103L)
    private ZipFile yS(String str) {
        try {
            if (kQ) {
                iy.tp(3206113333674914653L, this, str);
            }
            if (str.endsWith(File.separator)) {
                str = str.substring(0, str.length() - 1);
            }
            if (this.DW.containsKey(str)) {
                return this.DW.get(str);
            }
            ZipFile zipFile = new ZipFile(str);
            this.DW.put(str, zipFile);
            return zipFile;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 3206113333674914653L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2191367555966405573L)
    public List<String> J8(String str, String str2) {
        try {
            if (kQ) {
                iy.EQ(2754660575868274299L, this, str, str2);
            }
            ArrayList arrayList = new ArrayList();
            Enumeration<? extends ZipEntry> enumerationEntries = yS(str).entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (name.endsWith("/")) {
                    name = name.substring(0, name.length() - 1);
                }
                if (name.startsWith(str2) && !name.equals(str2) && name.indexOf(47, str2.length() + 1) == -1) {
                    if (zipEntryNextElement.isDirectory()) {
                        arrayList.add(str + '/' + name);
                    } else if (!zipEntryNextElement.isDirectory() && name.lastIndexOf(36) == -1 && name.endsWith(".class")) {
                        arrayList.add(str + '/' + name);
                    } else if (!zipEntryNextElement.isDirectory() && name.endsWith(".java")) {
                        if (name.startsWith("src/") || name.startsWith("src\\")) {
                            name = name.substring(4, name.length());
                        }
                        arrayList.add(str + '/' + name);
                    }
                }
            }
            VH();
            return arrayList;
        } catch (Throwable th) {
            if (yO) {
                iy.Mr(th, 2754660575868274299L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 577016414861833360L)
    public boolean Mr(String str) {
        try {
            if (kQ) {
                iy.tp(7431393726456139008L, this, str);
            }
            if (!str.endsWith(".class")) {
                if (!str.endsWith(".java")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, 7431393726456139008L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -5014858585812032705L)
    public Reader QX(String str, String str2, String str3) {
        try {
            if (kQ) {
                iy.we(571816610118071265L, this, str, str2, str3);
            }
            if (!this.j6) {
                j3();
            }
            try {
                if (str.toUpperCase().endsWith(".CLASS")) {
                    SI(str.lastIndexOf(File.separator) == -1 ? str : str.substring(0, str.lastIndexOf(File.separator) + 1), str.lastIndexOf(File.separator) == -1 ? str : str.substring(str.lastIndexOf(File.separator) + 1, str.length()));
                    we(str);
                    return this.nw.u7();
                }
                if (new File(str).isDirectory()) {
                    if (!str2.endsWith(".java")) {
                        SI(str, str2);
                        we(str);
                        return this.nw.u7();
                    }
                    FileInputStream fileInputStream = new FileInputStream(str + File.separator + str2);
                    return str3 == null ? new InputStreamReader(fileInputStream) : new InputStreamReader(fileInputStream, str3);
                }
                if (!str2.endsWith(".java")) {
                    ef(str, str2);
                    we(str);
                    return this.nw.u7();
                }
                ZipFile zipFileYS = yS(str);
                ZipEntry entry = zipFileYS.getEntry(str2);
                if (entry == null) {
                    entry = zipFileYS.getEntry("src/" + str2);
                }
                if (entry == null) {
                    entry = zipFileYS.getEntry("src\\" + str2);
                }
                c cVar = new c(zipFileYS.getInputStream(entry), entry.getSize());
                return str3 == null ? new InputStreamReader(cVar) : new InputStreamReader(cVar, str3);
            } catch (Throwable th) {
                System.out.println(th);
                th.printStackTrace(System.out);
                throw new RuntimeException(th.toString() + " " + str + " " + str2, th);
            }
        } catch (Throwable th2) {
            if (yO) {
                iy.U2(th2, 571816610118071265L, this, str, str2, str3);
            }
            throw th2;
        }
    }

    @ey(method = 3705339424299730300L)
    public void VH() {
        try {
            if (kQ) {
                iy.gn(1960567304129024832L, this);
            }
            if (this.j6) {
                Iterator<Map.Entry<String, ZipFile>> it = this.DW.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().getValue().close();
                    } catch (IOException unused) {
                    }
                }
                this.DW.clear();
                this.FH.clear();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, 1960567304129024832L, this);
            }
            throw th;
        }
    }

    @ey(method = -2595787805720771688L)
    public String[] Ws(String str) {
        try {
            if (kQ) {
                iy.tp(-3562128489154576608L, this, str);
            }
            if (!this.j6) {
                j3();
            }
            Vector<String> vector = new Vector<>();
            try {
                if (str.toUpperCase().endsWith(".CLASS")) {
                    String strSubstring = str.lastIndexOf(File.separator) == -1 ? str : str.substring(str.lastIndexOf(File.separator) + 1, str.length());
                    if (strSubstring.indexOf("$") == -1) {
                        vector.add(strSubstring);
                    }
                } else if (new File(str).isDirectory()) {
                    aM(str, "", vector);
                } else {
                    Enumeration<? extends ZipEntry> enumerationEntries = yS(str).entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        String name = zipEntryNextElement.getName();
                        if (!zipEntryNextElement.isDirectory() && name.lastIndexOf(36) == -1 && name.endsWith(".class")) {
                            vector.add(name);
                        } else if (!zipEntryNextElement.isDirectory() && name.endsWith(".java")) {
                            if (name.startsWith("src/") || name.startsWith("src\\")) {
                                name = name.substring(4, name.length());
                            }
                            vector.add(name);
                        }
                    }
                }
            } catch (IOException unused) {
            }
            String[] strArr = new String[vector.size()];
            vector.copyInto(strArr);
            return strArr;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -3562128489154576608L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6683548245762089160L)
    public long XL(String str) {
        try {
            if (kQ) {
                iy.tp(-7274330840030633088L, this, str);
            }
            if (!this.j6) {
                j3();
            }
            if (!new File(str).isDirectory()) {
                return new File(str).lastModified();
            }
            Vector<String> vector = new Vector<>();
            aM(str, "", vector);
            long jLastModified = 0;
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                jLastModified = (jLastModified * 37) ^ new File(str + File.separator + it.next()).lastModified();
            }
            return jLastModified;
        } catch (Throwable th) {
            if (yO) {
                iy.j3(th, -7274330840030633088L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1510475277158722751L)
    public void vJ() {
        try {
            if (kQ) {
                iy.gn(-1545313541743188967L, this);
            }
            if (this.j6) {
                j3();
            }
        } catch (Throwable th) {
            if (yO) {
                iy.aM(th, -1545313541743188967L, this);
            }
            throw th;
        }
    }

    @cy(clazz = -3564145035213858511L, container = -3564145035213858511L, user = true)
    private static class c extends InputStream {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -2077355982265143561L)
        private InputStream WB;

        @dy(field = -2545884443991383715L)
        private long jw;

        @dy(field = -2553238611904753584L)
        private long mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 8213848252471785560L)
        public c(InputStream inputStream, long j) {
            try {
                if (fY) {
                    iy.EQ(101533658017104873L, null, inputStream, new Long(j));
                }
                this.WB = inputStream;
                this.mb = j;
                this.jw = 0L;
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, 101533658017104873L, null, inputStream, new Long(j));
                }
                throw th;
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        @ey(method = -2358645629435364480L)
        public void close() {
            try {
                if (fY) {
                    iy.gn(-2786439596301904543L, this);
                }
                if (this.WB != null) {
                    this.WB.close();
                }
                this.WB = null;
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -2786439596301904543L, this);
                }
                throw th;
            }
        }

        @Override // java.io.InputStream
        @ey(method = 842808140088471804L)
        public int read() {
            try {
                if (fY) {
                    iy.gn(-742566410026339591L, this);
                }
                byte[] bArr = new byte[1];
                if (read(bArr) == -1) {
                    return -1;
                }
                return bArr[0];
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -742566410026339591L, this);
                }
                throw th;
            }
        }

        @Override // java.io.InputStream
        @ey(method = 4915565304894425307L)
        public int read(byte[] bArr) {
            try {
                if (fY) {
                    iy.tp(-3496144885423160952L, this, bArr);
                }
                return read(bArr, 0, bArr.length);
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -3496144885423160952L, this, bArr);
                }
                throw th;
            }
        }

        @Override // java.io.InputStream
        @ey(method = -358652132191570455L)
        public int read(byte[] bArr, int i, int i2) {
            int i3;
            try {
                if (fY) {
                    iy.we(-166343669782956164L, this, bArr, new Integer(i), new Integer(i2));
                }
                if (this.jw >= this.mb || (i3 = this.WB.read(bArr, i, i2)) == -1) {
                    return -1;
                }
                this.jw += i3;
                return i3;
            } catch (Throwable th) {
                if (qp) {
                    iy.U2(th, -166343669782956164L, this, bArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2983375389992113701L, container = -2983375389992113701L, user = true)
    private static class b {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3955236192145174325L)
        private int DW;

        @dy(field = 2837667510268962689L)
        private char[] j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 1626975899692890071L)
        private b() {
            try {
                if (FH) {
                    iy.gn(1078215077158603605L, null);
                }
                this.j6 = new char[100];
                this.DW = 0;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1078215077158603605L, null);
                }
                throw th;
            }
        }

        @ey(method = 495885052959908976L)
        public void DW(b bVar) {
            try {
                if (FH) {
                    iy.tp(22379854703738980L, this, bVar);
                }
                int i = this.DW + bVar.DW;
                if (this.j6.length <= i) {
                    char[] cArr = new char[Math.max(this.DW * 2, i)];
                    System.arraycopy(this.j6, 0, cArr, 0, this.DW);
                    this.j6 = cArr;
                }
                System.arraycopy(bVar.j6, 0, this.j6, this.DW, bVar.DW);
                this.DW += bVar.DW;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 22379854703738980L, this, bVar);
                }
                throw th;
            }
        }

        @ey(method = -558435355197338592L)
        public int EQ() {
            try {
                if (FH) {
                    iy.gn(2312757970472859520L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2312757970472859520L, this);
                }
                throw th;
            }
        }

        @ey(method = 807405076654038835L)
        public void FH(String str) {
            try {
                if (FH) {
                    iy.tp(63553320230143875L, this, str);
                }
                int length = this.DW + str.length();
                if (this.j6.length <= length) {
                    char[] cArr = new char[Math.max(this.DW * 2, length)];
                    System.arraycopy(this.j6, 0, cArr, 0, this.DW);
                    this.j6 = cArr;
                }
                for (int i = 0; i < str.length(); i++) {
                    char[] cArr2 = this.j6;
                    int i2 = this.DW;
                    this.DW = i2 + 1;
                    cArr2[i2] = str.charAt(i);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 63553320230143875L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1528551910876610679L)
        public void Hw(char[] cArr, int i, int i2) {
            try {
                if (FH) {
                    iy.we(-11763316288354175L, this, cArr, new Integer(i), new Integer(i2));
                }
                int i3 = this.DW + i2;
                if (this.j6.length <= i3) {
                    char[] cArr2 = new char[Math.max(this.DW * 2, i3)];
                    System.arraycopy(this.j6, 0, cArr2, 0, this.DW);
                    this.j6 = cArr2;
                }
                for (int i4 = i; i4 < i + i2; i4++) {
                    char[] cArr3 = this.j6;
                    int i5 = this.DW;
                    this.DW = i5 + 1;
                    cArr3[i5] = cArr[i4];
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.U2(th, -11763316288354175L, this, cArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 153827340946893480L)
        public boolean VH() {
            try {
                if (FH) {
                    iy.gn(1437925255521686712L, this);
                }
                return this.DW == 0;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1437925255521686712L, this);
                }
                throw th;
            }
        }

        @ey(method = 65039193015496200L)
        public void Zo() {
            try {
                if (FH) {
                    iy.gn(1352266166634559176L, this);
                }
                this.DW = 0;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1352266166634559176L, this);
                }
                throw th;
            }
        }

        @ey(method = -1259357218234340841L)
        public boolean gn(String str) {
            try {
                if (FH) {
                    iy.tp(1076066812830458979L, this, str);
                }
                if (str.length() != this.DW) {
                    return false;
                }
                for (int i = 0; i < this.DW; i++) {
                    if (this.j6[i] != str.charAt(i)) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1076066812830458979L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 433688895192096280L)
        public void j6(int i) {
            try {
                if (FH) {
                    iy.u7(9766351497915760L, this, i);
                }
                FH(Integer.toString(i));
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 9766351497915760L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -676537875000641879L)
        public String toString() {
            try {
                if (FH) {
                    iy.gn(2131799660711263517L, this);
                }
                return new String(this.j6, 0, this.DW);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2131799660711263517L, this);
                }
                throw th;
            }
        }

        @ey(method = -4717286420459308171L)
        public void tp() {
            try {
                if (FH) {
                    iy.gn(1940126245604542453L, this);
                }
                for (int i = this.DW - 1; i >= 0; i--) {
                    if (this.j6[i] == '[') {
                        this.j6[i] = '.';
                        this.j6[i + 1] = '.';
                        this.j6[i + 2] = '.';
                        return;
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1940126245604542453L, this);
                }
                throw th;
            }
        }

        @ey(method = -4224807718177588272L)
        public Reader u7() {
            try {
                if (FH) {
                    iy.gn(-431710566681134736L, this);
                }
                return new CharArrayReader(this.j6, 0, this.DW);
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -431710566681134736L, this);
                }
                throw th;
            }
        }

        @ey(method = 1773810424760309600L)
        public void v5(char[] cArr, int i, int i2) {
            try {
                if (FH) {
                    iy.we(-2718543737242581900L, this, cArr, new Integer(i), new Integer(i2));
                }
                int i3 = this.DW + (i2 * 6);
                if (this.j6.length <= i3) {
                    char[] cArr2 = new char[Math.max(this.DW * 2, i3)];
                    System.arraycopy(this.j6, 0, cArr2, 0, this.DW);
                    this.j6 = cArr2;
                }
                for (int i4 = i; i4 < i + i2; i4++) {
                    char c = cArr[i4];
                    if (c == '\t') {
                        char[] cArr3 = this.j6;
                        int i5 = this.DW;
                        int i6 = i5 + 1;
                        this.DW = i6;
                        cArr3[i5] = '\\';
                        char[] cArr4 = this.j6;
                        this.DW = i6 + 1;
                        cArr4[i6] = 't';
                    } else if (c == '\n') {
                        char[] cArr5 = this.j6;
                        int i7 = this.DW;
                        int i8 = i7 + 1;
                        this.DW = i8;
                        cArr5[i7] = '\\';
                        char[] cArr6 = this.j6;
                        this.DW = i8 + 1;
                        cArr6[i8] = 'n';
                    } else if (c == '\r') {
                        char[] cArr7 = this.j6;
                        int i9 = this.DW;
                        int i10 = i9 + 1;
                        this.DW = i10;
                        cArr7[i9] = '\\';
                        char[] cArr8 = this.j6;
                        this.DW = i10 + 1;
                        cArr8[i10] = 'r';
                    } else if (c == '\"') {
                        char[] cArr9 = this.j6;
                        int i11 = this.DW;
                        int i12 = i11 + 1;
                        this.DW = i12;
                        cArr9[i11] = '\\';
                        char[] cArr10 = this.j6;
                        this.DW = i12 + 1;
                        cArr10[i12] = '\"';
                    } else if (Character.isISOControl(c)) {
                        String hexString = Integer.toHexString(c);
                        if (hexString.length() == 1) {
                            hexString = "000" + hexString;
                        } else if (hexString.length() == 2) {
                            hexString = "00" + hexString;
                        } else if (hexString.length() == 3) {
                            hexString = "0" + hexString;
                        }
                        char[] cArr11 = this.j6;
                        int i13 = this.DW;
                        int i14 = i13 + 1;
                        this.DW = i14;
                        cArr11[i13] = '\\';
                        char[] cArr12 = this.j6;
                        int i15 = i14 + 1;
                        this.DW = i15;
                        cArr12[i14] = 'u';
                        char[] cArr13 = this.j6;
                        this.DW = i15 + 1;
                        cArr13[i15] = hexString.charAt(0);
                        char[] cArr14 = this.j6;
                        int i16 = this.DW;
                        this.DW = i16 + 1;
                        cArr14[i16] = hexString.charAt(1);
                        char[] cArr15 = this.j6;
                        int i17 = this.DW;
                        this.DW = i17 + 1;
                        cArr15[i17] = hexString.charAt(2);
                        char[] cArr16 = this.j6;
                        int i18 = this.DW;
                        this.DW = i18 + 1;
                        cArr16[i18] = hexString.charAt(3);
                    } else {
                        char[] cArr17 = this.j6;
                        int i19 = this.DW;
                        this.DW = i19 + 1;
                        cArr17[i19] = c;
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.U2(th, -2718543737242581900L, this, cArr, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 325905411139153560L)
        public /* synthetic */ b(a aVar) {
            this();
            try {
                if (FH) {
                    iy.tp(1454556303561309780L, null, aVar);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1454556303561309780L, null, aVar);
                }
                throw th;
            }
        }
    }
}
