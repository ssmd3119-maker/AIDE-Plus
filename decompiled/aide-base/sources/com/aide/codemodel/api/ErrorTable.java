package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import java.util.Iterator;
import java.util.Vector;

@cy(clazz = -2849944008797997696L, container = -2849944008797997696L, user = true)
/* loaded from: classes.dex */
public class ErrorTable {

    @gy
    private static /* synthetic */ boolean tp;

    @fy
    private static /* synthetic */ boolean u7;

    @dy(field = 325036872660691949L)
    private final FileSpace DW;

    @dy(field = 1401865613392012769L)
    private final EntitySpace FH;

    @dy(field = 3547183644539541888L)
    private HashtableOfInt<b> Hw;

    @dy(field = 3713307967636691115L)
    private SetOfInt VH;

    @dy(field = -4707361388261661012L)
    private SetOfInt Zo;

    @dy(field = -1831749792197762025L)
    private Error gn;

    @dy(field = 1171683047538637348L)
    private final Model j6;

    @dy(field = 1526947653459450015L)
    private HashtableOfInt<d> v5;

    static {
        iy.Zo(ErrorTable.class);
    }

    @ey(method = 36897386270129759L)
    public ErrorTable(Model model) {
        try {
            if (u7) {
                iy.tp(-2687078862318057135L, null, model);
            }
            this.j6 = model;
            this.DW = model.fileSpace;
            this.FH = model.entitySpace;
            this.Zo = new SetOfInt();
            this.VH = new SetOfInt();
            this.Hw = new HashtableOfInt<>();
            this.v5 = new HashtableOfInt<>();
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -2687078862318057135L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 585711268655284920L)
    public boolean BT(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(-72111908857672320L, this, fileEntry);
            }
            this.VH.default_Iterator.init();
            while (this.VH.default_Iterator.hasMoreElements()) {
                if (this.j6.fileSpace.vy(this.VH.default_Iterator.nextKey()) == fileEntry) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -72111908857672320L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -1366006298133111200L)
    public void EQ(FileEntry fileEntry, Language language, String str) {
        try {
            if (u7) {
                iy.we(434759788626730632L, this, fileEntry, language, str);
            }
            if (this.gn != null) {
                Fix fix = new Fix(this, 11, fileEntry, str);
                if (this.gn.gn == null) {
                    this.gn.gn = new Vector<>(3);
                }
                this.gn.gn.addElement(fix);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 434759788626730632L, this, fileEntry, language, str);
            }
            throw th;
        }
    }

    @ey(method = 6018372060719411412L)
    public void FH(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, int i5) throws Throwable {
        int i6 = i3;
        try {
            if (u7) {
                iy.QX(-1149060219155310160L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i6), new Integer(i4), new Integer(i5)});
            }
            try {
                if (i <= 0) {
                    this.gn = null;
                    return;
                }
                Error error = new Error(this, i, i2, i3, i4, "", 200, i5);
                int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
                if (!this.v5.Hw(fileEntryLanguageId)) {
                    this.v5.VH(fileEntryLanguageId, new d(this));
                }
                this.v5.v5(fileEntryLanguageId).j6.addElement(error);
                this.VH.put(fileEntryLanguageId);
                this.gn = error;
            } catch (Throwable th) {
                th = th;
                if (tp) {
                    Object[] objArr = new Object[i6];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = new Integer(i3);
                    objArr[5] = new Integer(i4);
                    objArr[6] = new Integer(i5);
                    iy.rN(th, -1149060219155310160L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i6 = 7;
        }
    }

    @ey(method = -4540525779191400332L)
    public void Hw(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, String str, int i5) {
        try {
            if (u7) {
                iy.QX(-3962553349291340720L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            if (i <= 0) {
                this.gn = null;
                return;
            }
            Error error = new Error(this, i, i2, i3, i4, str, i5, 0);
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (!this.v5.Hw(fileEntryLanguageId)) {
                this.v5.VH(fileEntryLanguageId, new d(this));
            }
            this.v5.v5(fileEntryLanguageId).DW.addElement(error);
            this.VH.put(fileEntryLanguageId);
            this.gn = error;
        } catch (Throwable th) {
            if (tp) {
                iy.rN(th, -3962553349291340720L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = -847024265524090873L)
    public String I(FileEntry fileEntry, int i, int i2) {
        try {
            if (u7) {
                iy.we(1314791096360195705L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            return this.Hw.v5(fileEntry.getId()).j6.elementAt(i).gn.elementAt(i2).DW;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 1314791096360195705L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2134498633781016624L)
    public void J0(FileEntry fileEntry, Language language, int i, int i2, int i3, Type type, String str) {
        try {
            if (u7) {
                iy.QX(7109346351374096280L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), type, str});
            }
        } catch (Throwable th) {
            if (tp) {
                iy.rN(th, 7109346351374096280L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), type, str});
            }
            throw th;
        }
    }

    @ey(method = -582950990672264752L)
    public void J8(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str) throws Throwable {
        try {
            if (u7) {
                iy.QX(43118429330302208L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), str});
            }
            if (this.gn != null) {
                try {
                    Fix fix = new Fix(this, 7, fileEntry, i, i2, i3, i4, i5, i6, i7, i8, str);
                    if (this.gn.gn == null) {
                        this.gn.gn = new Vector<>(3);
                    }
                    this.gn.gn.addElement(fix);
                } catch (Throwable th) {
                    th = th;
                    if (tp) {
                        iy.rN(th, 43118429330302208L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), str});
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -32500363859597508L)
    public int KD(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(-3688926833749124800L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size).Zo : this.v5.v5(fileEntryLanguageId).j6.elementAt(i).Zo;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -3688926833749124800L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3133209392793219432L)
    public void Mr(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, String str, int i5) {
        try {
            if (u7) {
                iy.QX(-3574772461374594852L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            if (i <= 0) {
                this.gn = null;
                return;
            }
            Error error = new Error(this, i, i2, i3, i4, str, i5, 0);
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (!this.v5.Hw(fileEntryLanguageId)) {
                this.v5.VH(fileEntryLanguageId, new d(this));
            }
            this.v5.v5(fileEntryLanguageId).DW.addElement(error);
            this.Zo.put(fileEntryLanguageId);
            this.VH.put(fileEntryLanguageId);
            this.gn = error;
        } catch (Throwable th) {
            if (tp) {
                iy.rN(th, -3574772461374594852L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = 2588552435120138409L)
    public int Mz(FileEntry fileEntry, int i) {
        try {
            if (u7) {
                iy.EQ(-3959667323275213485L, this, fileEntry, new Integer(i));
            }
            return this.Hw.v5(fileEntry.getId()).j6.elementAt(i).v5;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -3959667323275213485L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1994053589923556437L)
    public boolean P8(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(-20790779536680933L, this, fileEntry);
            }
            if (this.Hw.Hw(fileEntry.getId())) {
                if (this.Hw.v5(fileEntry.getId()).j6.size() > 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -20790779536680933L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 1064961763374815124L)
    public void QX(FileEntry fileEntry, Language language, int i, int i2, String str) {
        try {
            if (u7) {
                iy.J8(-1473351803043268320L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            if (this.gn != null) {
                Fix fix = new Fix(this, 8, fileEntry, language, i, i2, str);
                if (this.gn.gn == null) {
                    this.gn.gn = new Vector<>(3);
                }
                this.gn.gn.addElement(fix);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.lg(th, -1473351803043268320L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -6726468819781397376L)
    public int Qq(FileEntry fileEntry, int i) {
        try {
            if (u7) {
                iy.EQ(2231380153702873344L, this, fileEntry, new Integer(i));
            }
            return this.Hw.v5(fileEntry.getId()).j6.elementAt(i).Hw;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, 2231380153702873344L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5051146784324515959L)
    public int SI(FileEntry fileEntry, Language language) {
        try {
            if (u7) {
                iy.EQ(-804485102135062725L, this, fileEntry, language);
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (!this.v5.Hw(fileEntryLanguageId)) {
                return 0;
            }
            return this.v5.v5(fileEntryLanguageId).DW.size() + this.v5.v5(fileEntryLanguageId).j6.size();
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -804485102135062725L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = 6097110622659730440L)
    public SetOfFileEntry Sf() {
        try {
            if (u7) {
                iy.gn(589693324978808160L, this);
            }
            SetOfFileEntry setOfFileEntry = new SetOfFileEntry(this.DW);
            this.v5.j6.DW();
            while (this.v5.j6.j6()) {
                setOfFileEntry.gn(this.DW.vy(this.v5.j6.FH()));
            }
            return setOfFileEntry;
        } catch (Throwable th) {
            if (tp) {
                iy.aM(th, 589693324978808160L, this);
            }
            throw th;
        }
    }

    @ey(method = -876253787842476336L)
    public void U2(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, String str, int i5) {
        try {
            if (u7) {
                iy.QX(-1252486909455746580L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            if (i <= 0) {
                this.gn = null;
                return;
            }
            Error error = new Error(this, i, i2, i3, i4, str, i5, 0);
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (!this.v5.Hw(fileEntryLanguageId)) {
                this.v5.VH(fileEntryLanguageId, new d(this));
            }
            this.v5.v5(fileEntryLanguageId).DW.addElement(error);
            this.Zo.put(fileEntryLanguageId);
            this.gn = error;
        } catch (Throwable th) {
            if (tp) {
                iy.rN(th, -1252486909455746580L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = -837416539318148832L)
    public void VH(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, Type type, String str) throws Throwable {
        char c;
        try {
            if (u7) {
                iy.QX(170068381314268608L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, str});
            }
            if (this.gn != null) {
                Fix fix = new Fix(this, 4, fileEntry, language, i, i2, i3, i4, type, str);
                if (this.gn.gn == null) {
                    c = 3;
                    try {
                        this.gn.gn = new Vector<>(3);
                    } catch (Throwable th) {
                        th = th;
                        if (tp) {
                            Object[] objArr = new Object[8];
                            objArr[0] = fileEntry;
                            objArr[1] = language;
                            objArr[2] = new Integer(i);
                            objArr[c] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            objArr[6] = type;
                            objArr[7] = str;
                            iy.rN(th, 170068381314268608L, this, objArr);
                        }
                        throw th;
                    }
                } else {
                    c = 3;
                }
                this.gn.gn.addElement(fix);
            }
        } catch (Throwable th2) {
            th = th2;
            c = 3;
        }
    }

    @ey(method = -578870780189145120L)
    public void Ws(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, String str, String str2) throws Throwable {
        char c;
        int i5;
        try {
            if (u7) {
                iy.QX(-1090938705025922340L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, str2});
            }
            if (this.gn == null) {
                return;
            }
            i5 = 8;
            try {
                Fix fix = new Fix(this, 0, fileEntry, i, i2, i3, i4, str, str2);
                if (this.gn.gn == null) {
                    c = 3;
                    try {
                        this.gn.gn = new Vector<>(3);
                    } catch (Throwable th) {
                        th = th;
                        if (tp) {
                            Object[] objArr = new Object[i5];
                            objArr[0] = fileEntry;
                            objArr[1] = language;
                            objArr[2] = new Integer(i);
                            objArr[c] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            objArr[6] = str;
                            objArr[7] = str2;
                            iy.rN(th, -1090938705025922340L, this, objArr);
                        }
                        throw th;
                    }
                } else {
                    c = 3;
                }
                this.gn.gn.addElement(fix);
            } catch (Throwable th2) {
                th = th2;
                c = 3;
            }
        } catch (Throwable th3) {
            th = th3;
            c = 3;
            i5 = 8;
        }
    }

    @ey(method = 261392740711314975L)
    public void XL(FileEntry fileEntry, Language language, int i, int i2, int i3, Type type, String str) throws Throwable {
        char c;
        try {
            if (u7) {
                iy.QX(-1517706924952527855L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), type, str});
            }
            if (this.gn != null) {
                c = 3;
                try {
                    Fix fix = new Fix(this, 3, fileEntry, language, i, i2, i3, type, str);
                    if (this.gn.gn == null) {
                        this.gn.gn = new Vector<>(3);
                    }
                    this.gn.gn.addElement(fix);
                } catch (Throwable th) {
                    th = th;
                    if (tp) {
                        Object[] objArr = new Object[7];
                        objArr[0] = fileEntry;
                        objArr[1] = language;
                        objArr[2] = new Integer(i);
                        objArr[c] = new Integer(i2);
                        objArr[4] = new Integer(i3);
                        objArr[5] = type;
                        objArr[6] = str;
                        iy.rN(th, -1517706924952527855L, this, objArr);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c = 3;
        }
    }

    @ey(method = -1093430604124796896L)
    public void Zo(FileEntry fileEntry, Language language, FileEntry fileEntry2, int i, String str) {
        try {
            if (u7) {
                iy.J8(246276880967060952L, this, fileEntry, language, fileEntry2, new Integer(i), str);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.lg(th, 246276880967060952L, this, fileEntry, language, fileEntry2, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 1195675191981369072L)
    public void a8(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, String str, int i5) throws Throwable {
        int i6 = i3;
        try {
            if (u7) {
                iy.QX(747079718457668412L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i6), new Integer(i4), str, new Integer(i5)});
            }
            try {
                if (i <= 0) {
                    this.gn = null;
                    return;
                }
                Error error = new Error(this, i, i2, i3, i4, str, 70, i5);
                int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
                if (!this.v5.Hw(fileEntryLanguageId)) {
                    this.v5.VH(fileEntryLanguageId, new d(this));
                }
                this.v5.v5(fileEntryLanguageId).DW.addElement(error);
                this.gn = error;
            } catch (Throwable th) {
                th = th;
                if (tp) {
                    Object[] objArr = new Object[i6];
                    objArr[0] = fileEntry;
                    objArr[1] = language;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = new Integer(i3);
                    objArr[5] = new Integer(i4);
                    objArr[6] = str;
                    objArr[7] = new Integer(i5);
                    iy.rN(th, 747079718457668412L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i6 = 8;
        }
    }

    @ey(method = 832844951339862263L)
    public void aM(FileEntry fileEntry, int i, int i2, int i3, int i4, String str, int i5) throws Throwable {
        int i6;
        try {
            if (u7) {
                iy.QX(217998107360908377L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            i6 = 7;
            try {
                Error error = new Error(this, i, i2, i3, i4, "Warning: " + str, i5, 0);
                if (!this.Hw.Hw(fileEntry.getId())) {
                    this.Hw.VH(fileEntry.getId(), new b(this));
                }
                this.Hw.v5(fileEntry.getId()).j6.addElement(error);
                this.gn = error;
            } catch (Throwable th) {
                th = th;
                if (tp) {
                    Object[] objArr = new Object[i6];
                    objArr[0] = fileEntry;
                    objArr[1] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = new Integer(i3);
                    objArr[4] = new Integer(i4);
                    objArr[5] = str;
                    objArr[6] = new Integer(i5);
                    iy.rN(th, 217998107360908377L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i6 = 7;
        }
    }

    @ey(method = 1062568413296725819L)
    public String aj(FileEntry fileEntry, int i) {
        try {
            if (u7) {
                iy.EQ(1142345617958901501L, this, fileEntry, new Integer(i));
            }
            return this.Hw.v5(fileEntry.getId()).j6.elementAt(i).VH;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, 1142345617958901501L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5601867759300821976L)
    public int ca(FileEntry fileEntry, int i) {
        try {
            if (u7) {
                iy.EQ(-3151761125519650576L, this, fileEntry, new Integer(i));
            }
            Vector<Fix> vector = this.Hw.v5(fileEntry.getId()).j6.elementAt(i).gn;
            if (vector == null) {
                return 0;
            }
            return vector.size();
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -3151761125519650576L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 98658900927295287L)
    public int cb(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(402046142858139173L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size).j6 : this.v5.v5(fileEntryLanguageId).j6.elementAt(i).j6;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 402046142858139173L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1734607711212679512L)
    public String cn(FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (u7) {
                iy.J0(-679146301550478124L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return (i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size) : this.v5.v5(fileEntryLanguageId).j6.elementAt(i)).gn.elementAt(i2).DW;
        } catch (Throwable th) {
            if (tp) {
                iy.a8(th, -679146301550478124L, this, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -8365550834902967369L)
    public int dx(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(-163665259108669763L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size).Hw : this.v5.v5(fileEntryLanguageId).j6.elementAt(i).Hw;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -163665259108669763L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 137306078208461120L)
    public String ef(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(432189814234389820L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size).VH : this.v5.v5(fileEntryLanguageId).j6.elementAt(i).VH;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 432189814234389820L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3993144017117009252L)
    public boolean ei(FileEntry fileEntry, Language language) {
        try {
            if (u7) {
                iy.EQ(-768757094635108280L, this, fileEntry, language);
            }
            return this.Zo.contains(this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language));
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -768757094635108280L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = 4918109522307992745L)
    public void er(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(4801994919407291955L, this, fileEntry);
            }
            if (this.Hw.Hw(fileEntry.getId())) {
                this.Hw.v5(fileEntry.getId()).j6 = new Vector<>();
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 4801994919407291955L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 2767131323781894733L)
    public int g3(FileEntry fileEntry, int i) {
        try {
            if (u7) {
                iy.EQ(-1804692254414513397L, this, fileEntry, new Integer(i));
            }
            return this.Hw.v5(fileEntry.getId()).j6.elementAt(i).Zo;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -1804692254414513397L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5070987036612489411L)
    public void gW(FileEntry fileEntry, Language language) {
        try {
            if (u7) {
                iy.EQ(-23445010499210055L, this, fileEntry, language);
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (this.v5.Hw(fileEntryLanguageId)) {
                this.v5.v5(fileEntryLanguageId).j6 = new Vector<>();
            }
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -23445010499210055L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -2924256186855972099L)
    public void gn(FileEntry fileEntry, Language language, String str) {
        try {
            if (u7) {
                iy.we(549141843270446639L, this, fileEntry, language, str);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 549141843270446639L, this, fileEntry, language, str);
            }
            throw th;
        }
    }

    @ey(method = 262286054093373057L)
    public void j3(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, String str, int i5) {
        try {
            if (u7) {
                iy.QX(-789311507271095009L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            if (i <= 0) {
                this.gn = null;
                return;
            }
            Error error = new Error(this, i, i2, i3, i4, str, i5, 0);
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (!this.v5.Hw(fileEntryLanguageId)) {
                this.v5.VH(fileEntryLanguageId, new d(this));
            }
            this.v5.v5(fileEntryLanguageId).j6.addElement(error);
            this.VH.put(fileEntryLanguageId);
            this.gn = error;
        } catch (Throwable th) {
            if (tp) {
                iy.rN(th, -789311507271095009L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = 1604944604846193268L)
    public void lg(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, String str, int i5) {
        try {
            if (u7) {
                iy.QX(-272362925335150296L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            if (i <= 0) {
                this.gn = null;
                return;
            }
            Error error = new Error(this, i, i2, i3, i4, str, i5, 0);
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (!this.v5.Hw(fileEntryLanguageId)) {
                this.v5.VH(fileEntryLanguageId, new d(this));
            }
            this.v5.v5(fileEntryLanguageId).DW.addElement(error);
            this.gn = error;
        } catch (Throwable th) {
            if (tp) {
                iy.rN(th, -272362925335150296L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = 6371292222366532912L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (u7) {
                iy.tp(6432052236506074500L, this, storeInputStream);
            }
            this.Zo = new SetOfInt(storeInputStream);
            this.VH = new SetOfInt(storeInputStream);
            int i = storeInputStream.readInt();
            this.Hw = new HashtableOfInt<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                FileEntry fileEntry = this.DW.getFileEntry(storeInputStream.readInt());
                this.Hw.VH(fileEntry.getId(), new b(this, storeInputStream));
            }
            int i3 = storeInputStream.readInt();
            this.v5 = new HashtableOfInt<>(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                this.v5.VH(storeInputStream.readInt(), new d(this, storeInputStream));
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 6432052236506074500L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 337970560729723691L)
    public int nw(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(-3534890404647754943L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size).DW : this.v5.v5(fileEntryLanguageId).j6.elementAt(i).DW;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -3534890404647754943L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -60353642723704512L)
    public void rN(FileEntry fileEntry, Language language, boolean z, int i, int i2) {
        Fix fixElementAt;
        try {
            if (u7) {
                iy.J8(-1160010973249915640L, this, fileEntry, language, new Boolean(z), new Integer(i), new Integer(i2));
            }
            if (z) {
                fixElementAt = this.Hw.v5(fileEntry.getId()).j6.elementAt(i).gn.elementAt(i2);
            } else {
                int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
                int size = this.v5.v5(fileEntryLanguageId).j6.size();
                fixElementAt = (i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size) : this.v5.v5(fileEntryLanguageId).j6.elementAt(i)).gn.elementAt(i2);
            }
            this.j6.j6(fixElementAt);
        } catch (Throwable th) {
            if (tp) {
                iy.lg(th, -1160010973249915640L, this, fileEntry, language, new Boolean(z), new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2099245546268190240L)
    public int ro(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(-1239223231021895408L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size).v5 : this.v5.v5(fileEntryLanguageId).j6.elementAt(i).v5;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, -1239223231021895408L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4159303896380166963L)
    public int sG(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(654450803997742245L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            return i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size).FH : this.v5.v5(fileEntryLanguageId).j6.elementAt(i).FH;
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 654450803997742245L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5586173415802746639L)
    public int sh(FileEntry fileEntry, Language language, int i) {
        try {
            if (u7) {
                iy.we(1615059615588838531L, this, fileEntry, language, new Integer(i));
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            int size = this.v5.v5(fileEntryLanguageId).j6.size();
            Error errorElementAt = i >= size ? this.v5.v5(fileEntryLanguageId).DW.elementAt(i - size) : this.v5.v5(fileEntryLanguageId).j6.elementAt(i);
            if (errorElementAt.gn == null) {
                return 0;
            }
            return errorElementAt.gn.size();
        } catch (Throwable th) {
            if (tp) {
                iy.U2(th, 1615059615588838531L, this, fileEntry, language, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1363242042777667168L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (u7) {
                iy.tp(-1396862664883796880L, this, storeOutputStream);
            }
            this.Zo.store(storeOutputStream);
            this.VH.store(storeOutputStream);
            storeOutputStream.writeInt(this.Hw.EQ());
            this.Hw.j6.DW();
            while (this.Hw.j6.j6()) {
                FileEntry fileEntry = this.DW.getFileEntry(this.Hw.j6.FH());
                b bVarHw = this.Hw.j6.Hw();
                storeOutputStream.writeInt(fileEntry.getId());
                bVarHw.store(storeOutputStream);
            }
            storeOutputStream.writeInt(this.v5.EQ());
            this.v5.j6.DW();
            while (this.v5.j6.j6()) {
                int iFH = this.v5.j6.FH();
                d dVarHw = this.v5.j6.Hw();
                storeOutputStream.writeInt(iFH);
                dVarHw.store(storeOutputStream);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, -1396862664883796880L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 2784929189742919940L)
    public int sy(FileEntry fileEntry, int i) {
        try {
            if (u7) {
                iy.EQ(-1889441190399244560L, this, fileEntry, new Integer(i));
            }
            return this.Hw.v5(fileEntry.getId()).j6.elementAt(i).FH;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -1889441190399244560L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1586523697925039580L)
    public void tp(FileEntry fileEntry, Language language, ClassType classType, String str) {
        try {
            if (u7) {
                iy.J0(2017420975258476360L, this, fileEntry, language, classType, str);
            }
            if (this.gn != null) {
                Fix fix = new Fix(this, 2, fileEntry, classType, str);
                if (this.gn.gn == null) {
                    this.gn.gn = new Vector<>(3);
                }
                this.gn.gn.addElement(fix);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.a8(th, 2017420975258476360L, this, fileEntry, language, classType, str);
            }
            throw th;
        }
    }

    @ey(method = -620998579100232553L)
    public void u7(FileEntry fileEntry, Language language, int i, int i2, String str) {
        try {
            if (u7) {
                iy.J8(2970749555883238157L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            if (this.gn != null) {
                Fix fix = new Fix(this, 1, fileEntry, language, i, i2, str);
                if (this.gn.gn == null) {
                    this.gn.gn = new Vector<>(3);
                }
                this.gn.gn.addElement(fix);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.lg(th, 2970749555883238157L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -3187052119423058112L)
    public void v5(FileEntry fileEntry, Language language, int i, int i2, String str) {
        try {
            if (u7) {
                iy.J8(-299272440955699536L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            if (this.gn != null) {
                Fix fix = new Fix(this, 9, fileEntry, language, i, i2, str);
                if (this.gn.gn == null) {
                    this.gn.gn = new Vector<>(3);
                }
                this.gn.gn.addElement(fix);
            }
        } catch (Throwable th) {
            if (tp) {
                iy.lg(th, -299272440955699536L, this, fileEntry, language, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -3575686562948759784L)
    public int vJ(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(3157210806063812688L, this, fileEntry);
            }
            if (this.Hw.Hw(fileEntry.getId())) {
                return this.Hw.v5(fileEntry.getId()).j6.size();
            }
            return 0;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 3157210806063812688L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -1338764134941047473L)
    public boolean vy(FileEntry fileEntry) {
        try {
            if (u7) {
                iy.tp(2905825378063178297L, this, fileEntry);
            }
            Iterator<Language> it = fileEntry.getCodeModel().getLanguages().iterator();
            while (it.hasNext()) {
                if (this.v5.Hw(this.j6.fileSpace.getFileEntryLanguageId(fileEntry, it.next()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (tp) {
                iy.j3(th, 2905825378063178297L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2857448288452290000L)
    public void we(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2, String str) throws Throwable {
        char c;
        try {
            if (u7) {
                iy.QX(-2261535337604888408L, this, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2, str});
            }
            if (this.gn != null) {
                Fix fix = new Fix(this, 5, fileEntry, language, i, i2, i3, i4, type, iArr, typeArr, iArr2, str);
                if (this.gn.gn == null) {
                    c = 3;
                    try {
                        this.gn.gn = new Vector<>(3);
                    } catch (Throwable th) {
                        th = th;
                        if (tp) {
                            Object[] objArr = new Object[11];
                            objArr[0] = fileEntry;
                            objArr[1] = language;
                            objArr[2] = new Integer(i);
                            objArr[c] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            objArr[6] = type;
                            objArr[7] = iArr;
                            objArr[8] = typeArr;
                            objArr[9] = iArr2;
                            objArr[10] = str;
                            iy.rN(th, -2261535337604888408L, this, objArr);
                        }
                        throw th;
                    }
                } else {
                    c = 3;
                }
                this.gn.gn.addElement(fix);
            }
        } catch (Throwable th2) {
            th = th2;
            c = 3;
        }
    }

    @ey(method = 238390129163735076L)
    public int x9(FileEntry fileEntry, int i) {
        try {
            if (u7) {
                iy.EQ(135874264474740760L, this, fileEntry, new Integer(i));
            }
            return this.Hw.v5(fileEntry.getId()).j6.elementAt(i).j6;
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, 135874264474740760L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3705211691482378256L)
    public void yS(FileEntry fileEntry, Language language) {
        try {
            if (u7) {
                iy.EQ(-3003488040867036324L, this, fileEntry, language);
            }
            int fileEntryLanguageId = this.j6.fileSpace.getFileEntryLanguageId(fileEntry, language);
            if (this.v5.Hw(fileEntryLanguageId)) {
                this.v5.v5(fileEntryLanguageId).DW = new Vector<>();
            }
            this.Zo.u7(fileEntryLanguageId);
            this.VH.u7(fileEntryLanguageId);
        } catch (Throwable th) {
            if (tp) {
                iy.Mr(th, -3003488040867036324L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @cy(clazz = -1103768130879059933L, container = -1103768130879059933L, user = true)
    private class b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 4440077862298940105L)
        public Vector<Error> j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 2947788796622692035L)
        public b(ErrorTable errorTable) {
            try {
                if (DW) {
                    iy.tp(-231090385225100665L, null, errorTable);
                }
                this.j6 = new Vector<>();
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -231090385225100665L, null, errorTable);
                }
                throw th;
            }
        }

        @ey(method = 3773114680550140233L)
        public void store(StoreOutputStream storeOutputStream) {
            try {
                if (DW) {
                    iy.tp(-4894704168430910964L, this, storeOutputStream);
                }
                storeOutputStream.writeInt(this.j6.size());
                for (int i = 0; i < this.j6.size(); i++) {
                    this.j6.elementAt(i).store(storeOutputStream);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -4894704168430910964L, this, storeOutputStream);
                }
                throw th;
            }
        }

        @ey(method = 150533586329339L)
        public b(ErrorTable errorTable, StoreInputStream storeInputStream) {
            try {
                if (DW) {
                    iy.EQ(-2701457643536279601L, null, errorTable, storeInputStream);
                }
                int i = storeInputStream.readInt();
                this.j6 = new Vector<>(i);
                for (int i2 = 0; i2 < i; i2++) {
                    this.j6.addElement(new Error(errorTable, storeInputStream));
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -2701457643536279601L, null, errorTable, storeInputStream);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2721615430353691140L, container = 2721615430353691140L, user = true)
    private class d {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -5242891753863802760L)
        public Vector<Error> DW;

        @dy(field = 1192578439439077485L)
        public Vector<Error> j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -4543899245732398320L)
        public d(ErrorTable errorTable) {
            try {
                if (FH) {
                    iy.tp(429976413582531095L, null, errorTable);
                }
                this.j6 = new Vector<>();
                this.DW = new Vector<>();
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 429976413582531095L, null, errorTable);
                }
                throw th;
            }
        }

        @ey(method = -4462846250909086056L)
        public void store(StoreOutputStream storeOutputStream) {
            try {
                if (FH) {
                    iy.tp(5312347882810618223L, this, storeOutputStream);
                }
                storeOutputStream.writeInt(this.j6.size());
                for (int i = 0; i < this.j6.size(); i++) {
                    this.j6.elementAt(i).store(storeOutputStream);
                }
                storeOutputStream.writeInt(this.DW.size());
                for (int i2 = 0; i2 < this.DW.size(); i2++) {
                    this.DW.elementAt(i2).store(storeOutputStream);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 5312347882810618223L, this, storeOutputStream);
                }
                throw th;
            }
        }

        @ey(method = 3787745838964178112L)
        public d(ErrorTable errorTable, StoreInputStream storeInputStream) {
            try {
                if (FH) {
                    iy.EQ(3110580120422546303L, null, errorTable, storeInputStream);
                }
                int i = storeInputStream.readInt();
                this.j6 = new Vector<>(i);
                for (int i2 = 0; i2 < i; i2++) {
                    this.j6.addElement(new Error(errorTable, storeInputStream));
                }
                int i3 = storeInputStream.readInt();
                this.DW = new Vector<>(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    this.DW.addElement(new Error(errorTable, storeInputStream));
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 3110580120422546303L, null, errorTable, storeInputStream);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -908106137667945168L, container = -908106137667945168L, user = true)
    private class Error {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = -3618923757393552027L)
        public final int DW;

        @dy(field = 596627883517619009L)
        public final int FH;

        @dy(field = 709322747094110009L)
        public final int Hw;

        @dy(field = 621933134237704556L)
        public final String VH;

        @dy(field = -2176481011565301040L)
        public final int Zo;

        @dy(field = 2404942547767912600L)
        public Vector<Fix> gn;

        @dy(field = 244333984993877255L)
        public final int j6;

        @dy(field = 100620010494603264L)
        public final int v5;

        static {
            iy.Zo(Error.class);
        }

        @ey(method = 3053799618607972200L)
        public Error(ErrorTable errorTable, int i, int i2, int i3, int i4, String str, int i5, int i6) {
            try {
                if (u7) {
                    iy.QX(4183772935481646168L, null, new Object[]{errorTable, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5), new Integer(i6)});
                }
                this.j6 = i5;
                this.DW = i6;
                this.FH = i;
                this.Hw = i2;
                this.v5 = i3;
                this.Zo = i4;
                this.VH = str;
            } catch (Throwable th) {
                if (tp) {
                    iy.rN(th, 4183772935481646168L, null, new Object[]{errorTable, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Integer(i5), new Integer(i6)});
                }
                throw th;
            }
        }

        @ey(method = -2388810744151643136L)
        public void store(StoreOutputStream storeOutputStream) {
            try {
                if (u7) {
                    iy.tp(-4683037702048357608L, this, storeOutputStream);
                }
                storeOutputStream.writeInt(this.j6);
                storeOutputStream.writeInt(this.DW);
                storeOutputStream.writeInt(this.FH);
                storeOutputStream.writeInt(this.Hw);
                storeOutputStream.writeInt(this.v5);
                storeOutputStream.writeInt(this.Zo);
                storeOutputStream.writeUTF(this.VH);
                if (this.gn == null) {
                    storeOutputStream.writeInt(0);
                    return;
                }
                storeOutputStream.writeInt(this.gn.size());
                for (int i = 0; i < this.gn.size(); i++) {
                    this.gn.elementAt(i).store(storeOutputStream);
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.j3(th, -4683037702048357608L, this, storeOutputStream);
                }
                throw th;
            }
        }

        @ey(method = -7010967105073170192L)
        public Error(ErrorTable errorTable, StoreInputStream storeInputStream) {
            try {
                if (u7) {
                    iy.EQ(-2444973037957812240L, null, errorTable, storeInputStream);
                }
                this.j6 = storeInputStream.readInt();
                this.DW = storeInputStream.readInt();
                this.FH = storeInputStream.readInt();
                this.Hw = storeInputStream.readInt();
                this.v5 = storeInputStream.readInt();
                this.Zo = storeInputStream.readInt();
                this.VH = storeInputStream.readUTF();
                int i = storeInputStream.readInt();
                if (i > 0) {
                    this.gn = new Vector<>(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        this.gn.addElement(new Fix(errorTable, storeInputStream));
                    }
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, -2444973037957812240L, null, errorTable, storeInputStream);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -615470766706384257L, container = -615470766706384257L, user = true)
    public class Fix {

        @fy
        private static /* synthetic */ boolean U2;

        @gy
        private static /* synthetic */ boolean a8;

        @dy(field = -852346291225266999L)
        public String DW;

        @dy(field = -3582336070465315956L)
        public int EQ;

        @dy(field = 1871376940652091507L)
        public Entity FH;

        @dy(field = -2210879049244484928L)
        public FileEntry Hw;

        @dy(field = 5606960030248815L)
        public int J0;

        @dy(field = 338167511198402112L)
        public int J8;

        @dy(field = 2159581798385623956L)
        @hy
        final /* synthetic */ ErrorTable Mr;

        @dy(field = 1805836754249453351L)
        public int QX;

        @dy(field = -3666044380130292068L)
        public int[] VH;

        @dy(field = 4288388894370330040L)
        public int Ws;

        @dy(field = 188108597130943175L)
        public int XL;

        @dy(field = 38002789290132000L)
        public int Zo;

        @dy(field = 3966778894990454808L)
        public String aM;

        @dy(field = 3099780366315690933L)
        public Type[] gn;

        @dy(field = 2002573384840084680L)
        public Language j3;

        @dy(field = -2209269201298563168L)
        public int j6;

        @dy(field = 2494156544317505088L)
        public int tp;

        @dy(field = 2792077024652111640L)
        public int[] u7;

        @dy(field = -1158202067210432669L)
        public int v5;

        @dy(field = -2207910815979830325L)
        public int we;

        static {
            iy.Zo(Fix.class);
        }

        @ey(method = -769779244519776455L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, Language language, int i2, int i3, int i4, int i5, Type type, int[] iArr, Type[] typeArr, int[] iArr2, String str) {
            if (U2) {
                iy.QX(302051633785389224L, null, new Object[]{errorTable, new Integer(i), fileEntry, language, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), type, iArr, typeArr, iArr2, str});
            }
            this.Mr = errorTable;
            this.aM = "";
            this.j6 = i;
            this.DW = str;
            this.Hw = fileEntry;
            this.j3 = language;
            this.tp = i2;
            this.EQ = i3;
            this.FH = type;
            this.v5 = i5;
            this.Zo = i4;
            this.gn = typeArr;
            this.u7 = iArr2;
            this.VH = iArr;
        }

        @ey(method = 2856039503055559275L)
        public void store(StoreOutputStream storeOutputStream) {
            try {
                if (U2) {
                    iy.tp(160368865277544063L, this, storeOutputStream);
                }
                storeOutputStream.writeInt(this.j6);
                storeOutputStream.writeUTF(this.DW);
                storeOutputStream.writeInt(this.tp);
                storeOutputStream.writeInt(this.EQ);
                storeOutputStream.writeInt(this.we);
                storeOutputStream.writeInt(this.J0);
                storeOutputStream.writeInt(this.J8);
                storeOutputStream.writeInt(this.Ws);
                storeOutputStream.writeInt(this.QX);
                storeOutputStream.writeInt(this.XL);
                storeOutputStream.writeUTF(this.aM);
                storeOutputStream.writeInt(this.Mr.FH.getId(this.FH));
                storeOutputStream.writeInt(this.v5);
                storeOutputStream.writeInt(this.Mr.DW.getId(this.Hw));
                storeOutputStream.writeInt(this.Zo);
                storeOutputStream.writeBoolean(this.gn != null);
                if (this.gn != null) {
                    storeOutputStream.writeInt(this.gn.length);
                    for (int i = 0; i < this.gn.length; i++) {
                        storeOutputStream.writeInt(this.VH[i]);
                        storeOutputStream.writeInt(this.Mr.FH.getId(this.gn[i]));
                        storeOutputStream.writeInt(this.u7[i]);
                    }
                }
            } catch (Throwable th) {
                if (a8) {
                    iy.j3(th, 160368865277544063L, this, storeOutputStream);
                }
                throw th;
            }
        }

        @ey(method = -4974827302209208755L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, String str) {
            try {
                if (U2) {
                    iy.J0(1800333621863569000L, null, errorTable, new Integer(i), fileEntry, str);
                }
                this.Mr = errorTable;
                this.aM = "";
                this.j6 = i;
                this.DW = str;
                this.Hw = fileEntry;
            } catch (Throwable th) {
                if (a8) {
                    iy.a8(th, 1800333621863569000L, null, errorTable, new Integer(i), fileEntry, str);
                }
                throw th;
            }
        }

        @ey(method = 311399293615124000L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, Entity entity, String str) {
            try {
                if (U2) {
                    iy.J8(303833858884308873L, null, errorTable, new Integer(i), fileEntry, entity, str);
                }
                this.Mr = errorTable;
                this.aM = "";
                this.j6 = i;
                this.DW = str;
                this.Hw = fileEntry;
                this.FH = entity;
            } catch (Throwable th) {
                if (a8) {
                    iy.lg(th, 303833858884308873L, null, errorTable, new Integer(i), fileEntry, entity, str);
                }
                throw th;
            }
        }

        @ey(method = -2581502248558244544L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, Language language, int i2, int i3, String str) {
            try {
                if (U2) {
                    iy.QX(-3040437778321288473L, null, new Object[]{errorTable, new Integer(i), fileEntry, language, new Integer(i2), new Integer(i3), str});
                }
                this.Mr = errorTable;
                this.aM = "";
                this.j6 = i;
                this.DW = str;
                this.Hw = fileEntry;
                this.j3 = language;
                this.tp = i2;
                this.EQ = i3;
            } catch (Throwable th) {
                if (a8) {
                    iy.rN(th, -3040437778321288473L, null, new Object[]{errorTable, new Integer(i), fileEntry, language, new Integer(i2), new Integer(i3), str});
                }
                throw th;
            }
        }

        @ey(method = -1124751292353454645L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, Language language, int i2, int i3, int i4, Type type, String str) {
            try {
                if (U2) {
                    iy.QX(561424824806381388L, null, new Object[]{errorTable, new Integer(i), fileEntry, language, new Integer(i2), new Integer(i3), new Integer(i4), type, str});
                }
                this.Mr = errorTable;
                this.aM = "";
                this.j6 = i;
                this.DW = str;
                this.Hw = fileEntry;
                this.j3 = language;
                this.tp = i2;
                this.EQ = i3;
                this.FH = type;
                this.v5 = i4;
            } catch (Throwable th) {
                if (a8) {
                    iy.rN(th, 561424824806381388L, null, new Object[]{errorTable, new Integer(i), fileEntry, language, new Integer(i2), new Integer(i3), new Integer(i4), type, str});
                }
                throw th;
            }
        }

        @ey(method = -8365178284987213488L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, Language language, int i2, int i3, int i4, int i5, Type type, String str) {
            if (U2) {
                iy.QX(1596524232172017645L, null, new Object[]{errorTable, new Integer(i), fileEntry, language, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), type, str});
            }
            this.Mr = errorTable;
            this.aM = "";
            this.j6 = i;
            this.DW = str;
            this.Hw = fileEntry;
            this.j3 = language;
            this.tp = i2;
            this.EQ = i3;
            this.FH = type;
            this.v5 = i5;
            this.Zo = i4;
        }

        @ey(method = 6032771752664772583L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, int i2, int i3, int i4, int i5, String str, String str2) {
            try {
                if (U2) {
                    iy.QX(17249251777985284L, null, new Object[]{errorTable, new Integer(i), fileEntry, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), str, str2});
                }
                this.Mr = errorTable;
                this.aM = "";
                this.j6 = i;
                this.DW = str2;
                this.Hw = fileEntry;
                this.tp = i2;
                this.EQ = i3;
                this.we = i4;
                this.J0 = i5;
                this.aM = str;
            } catch (Throwable th) {
                if (a8) {
                    iy.rN(th, 17249251777985284L, null, new Object[]{errorTable, new Integer(i), fileEntry, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), str, str2});
                }
                throw th;
            }
        }

        @ey(method = -840414301972838235L)
        public Fix(ErrorTable errorTable, int i, FileEntry fileEntry, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str) {
            if (U2) {
                iy.QX(-639825117581578872L, null, new Object[]{errorTable, new Integer(i), fileEntry, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), str});
            }
            this.Mr = errorTable;
            this.aM = "";
            this.j6 = i;
            this.DW = str;
            this.Hw = fileEntry;
            this.tp = i2;
            this.EQ = i3;
            this.we = i4;
            this.J0 = i5;
            this.J8 = i6;
            this.Ws = i7;
            this.QX = i8;
            this.XL = i9;
        }

        @ey(method = -1566234003496818527L)
        public Fix(ErrorTable errorTable, StoreInputStream storeInputStream) {
            try {
                if (U2) {
                    iy.EQ(-3050854619209927200L, null, errorTable, storeInputStream);
                }
                this.Mr = errorTable;
                this.aM = "";
                this.j6 = storeInputStream.readInt();
                this.DW = storeInputStream.readUTF();
                this.tp = storeInputStream.readInt();
                this.EQ = storeInputStream.readInt();
                this.we = storeInputStream.readInt();
                this.J0 = storeInputStream.readInt();
                this.J8 = storeInputStream.readInt();
                this.Ws = storeInputStream.readInt();
                this.QX = storeInputStream.readInt();
                this.XL = storeInputStream.readInt();
                this.aM = storeInputStream.readUTF();
                this.FH = errorTable.FH.getEntity(storeInputStream.readInt());
                this.v5 = storeInputStream.readInt();
                this.Hw = errorTable.DW.getFileEntry(storeInputStream.readInt());
                this.Zo = storeInputStream.readInt();
                if (storeInputStream.readBoolean()) {
                    int i = storeInputStream.readInt();
                    this.VH = new int[i];
                    this.gn = new Type[i];
                    this.u7 = new int[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        this.VH[i2] = storeInputStream.readInt();
                        this.gn[i2] = (Type) errorTable.FH.getEntity(storeInputStream.readInt());
                        this.u7[i2] = storeInputStream.readInt();
                    }
                }
            } catch (Throwable th) {
                if (a8) {
                    iy.Mr(th, -3050854619209927200L, null, errorTable, storeInputStream);
                }
                throw th;
            }
        }
    }
}
