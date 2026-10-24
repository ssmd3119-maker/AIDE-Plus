package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfFileEntry;
import com.aide.codemodel.api.collections.SetOfInt;

@cy(clazz = -7829364389164026813L, container = -7829364389164026813L, user = true)
/* loaded from: classes.dex */
public class r0 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -1213278811939951679L)
    private final AIDEModel j6;

    static {
        iy.Zo(r0.class);
    }

    @ey(method = 74216474091849420L)
    public r0(AIDEModel aIDEModel) {
        try {
            if (DW) {
                iy.tp(1247729207385654935L, null, aIDEModel);
            }
            this.j6 = aIDEModel;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 1247729207385654935L, null, aIDEModel);
            }
            throw th;
        }
    }

    @ey(method = 330376254828807635L)
    private boolean DW(char[] cArr, int i) {
        try {
            if (DW) {
                iy.EQ(345966398250101075L, this, cArr, new Integer(i));
            }
            if (cArr.length == 0) {
                return true;
            }
            String string = this.j6.identifierSpace.getString(i);
            int length = string.length();
            if (length != cArr.length) {
                return false;
            }
            for (int i2 = 0; i2 < (length - cArr.length) + 1; i2++) {
                if (cArr[0] == Character.toUpperCase(string.charAt(i2))) {
                    for (int i3 = 1; i3 < cArr.length; i3++) {
                        if (cArr[i3] != Character.toUpperCase(string.charAt(i2 + i3))) {
                            break;
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 345966398250101075L, this, cArr, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 211311344947666800L)
    private boolean FH(char[] cArr, int i) {
        try {
            if (DW) {
                iy.EQ(-105438294653160312L, this, cArr, new Integer(i));
            }
            if (cArr.length == 0) {
                return true;
            }
            String string = this.j6.identifierSpace.getString(i);
            int length = string.length();
            if (length < cArr.length) {
                return false;
            }
            for (int i2 = 0; i2 < (length - cArr.length) + 1; i2++) {
                if (cArr[0] == Character.toUpperCase(string.charAt(i2))) {
                    for (int i3 = 1; i3 < cArr.length; i3++) {
                        if (cArr[i3] != Character.toUpperCase(string.charAt(i2 + i3))) {
                            break;
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -105438294653160312L, this, cArr, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2207441416644090803L)
    private boolean j6(FileEntry fileEntry) {
        try {
            if (DW) {
                iy.tp(-990435282023433561L, this, fileEntry);
            }
            return this.j6.fileSpace.g3(fileEntry);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -990435282023433561L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -2150155066115058375L)
    public void Hw(String str, int i) {
        try {
            if (DW) {
                iy.EQ(-1500016237776991155L, this, str, new Integer(i));
            }
            char[] charArray = str.toUpperCase().toCharArray();
            this.j6.symbolSearcherCallback.VH(str);
            MapOfInt<ClassType> mapOfIntXG = this.j6.entitySpace.XG();
            mapOfIntXG.DEFAULT_ITERATOR.DW();
            int i2 = 0;
            int i3 = 0;
            while (mapOfIntXG.DEFAULT_ITERATOR.hasMoreElements()) {
                int iHw = mapOfIntXG.DEFAULT_ITERATOR.Hw();
                ClassType classType = (ClassType) mapOfIntXG.DEFAULT_ITERATOR.nextValue();
                if (FH(charArray, iHw)) {
                    this.j6.symbolSearcherCallback.DW(classType);
                    i3++;
                    if (i3 > i) {
                        break;
                    }
                }
            }
            if (i3 > i) {
                this.j6.symbolSearcherCallback.VH(str);
                MapOfInt<ClassType> mapOfIntXG2 = this.j6.entitySpace.XG();
                mapOfIntXG2.DEFAULT_ITERATOR.DW();
                while (mapOfIntXG2.DEFAULT_ITERATOR.hasMoreElements()) {
                    int iHw2 = mapOfIntXG2.DEFAULT_ITERATOR.Hw();
                    ClassType classType2 = (ClassType) mapOfIntXG2.DEFAULT_ITERATOR.nextValue();
                    if (DW(charArray, iHw2)) {
                        this.j6.symbolSearcherCallback.DW(classType2);
                        i2++;
                        if (i2 > i) {
                            break;
                        }
                    }
                }
                i3 = i2;
                if (i3 == 0) {
                    i3 = i + 1;
                }
            }
            if (i3 > i) {
                this.j6.symbolSearcherCallback.v5();
            } else {
                this.j6.symbolSearcherCallback.Hw();
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -1500016237776991155L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5129932913465173203L)
    public void v5(String str, int i) {
        try {
            if (DW) {
                iy.EQ(1914785305150883559L, this, str, new Integer(i));
            }
            char[] charArray = str.toUpperCase().toCharArray();
            this.j6.symbolSearcherCallback.VH(str);
            SetOfFileEntry setOfFileEntryKD = this.j6.fileSpace.KD();
            setOfFileEntryKD.j6.init();
            int i2 = 0;
            int i3 = 0;
            while (setOfFileEntryKD.j6.hasMoreElements()) {
                FileEntry fileEntryNextKey = setOfFileEntryKD.j6.nextKey();
                if (fileEntryNextKey.getCodeModel() != null && fileEntryNextKey.getCodeModel().u7() && FH(charArray, fileEntryNextKey.QX())) {
                    this.j6.symbolSearcherCallback.gn(fileEntryNextKey);
                    i3++;
                    if (i3 > i) {
                        break;
                    }
                }
            }
            SetOfInt setOfInt = new SetOfInt();
            SetOfInt setOfInt2 = new SetOfInt();
            this.j6.vy.EQ(setOfInt);
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                int iNextKey = setOfInt.default_Iterator.nextKey();
                if (FH(charArray, iNextKey)) {
                    setOfInt2.put(iNextKey);
                }
            }
            this.j6.vy.Ws(setOfInt2);
            loop2: while (true) {
                FileEntry fileEntryAM = this.j6.vy.aM();
                if (fileEntryAM == null) {
                    break;
                }
                if (!j6(fileEntryAM)) {
                    SetOf<Entity> setOfFN = this.j6.entitySpace.FN(fileEntryAM);
                    setOfFN.DEFAULT_ITERATOR.init();
                    while (setOfFN.DEFAULT_ITERATOR.hasMoreElements()) {
                        if (this.j6.stopCallback.aq()) {
                            return;
                        }
                        Entity entityNextKey = setOfFN.DEFAULT_ITERATOR.nextKey();
                        if (setOfInt2.contains(this.j6.identifierSpace.QX(entityNextKey.getIdentifier())) && ((entityNextKey.isMember() && ((Member) entityNextKey).Gj()) || entityNextKey.isClassType() || (entityNextKey.isMember() && ((Member) entityNextKey).e9() && !((Member) entityNextKey).iW() && !((Member) entityNextKey).pN()))) {
                            this.j6.symbolSearcherCallback.DW(entityNextKey);
                            i3++;
                            if (i3 > i) {
                                break loop2;
                            }
                        }
                    }
                }
            }
            if (i3 > i) {
                this.j6.symbolSearcherCallback.VH(str);
                SetOfFileEntry setOfFileEntryKD2 = this.j6.fileSpace.KD();
                setOfFileEntryKD2.j6.init();
                while (setOfFileEntryKD2.j6.hasMoreElements()) {
                    FileEntry fileEntryNextKey2 = setOfFileEntryKD2.j6.nextKey();
                    if (fileEntryNextKey2.getCodeModel() != null && fileEntryNextKey2.getCodeModel().u7() && DW(charArray, fileEntryNextKey2.QX())) {
                        this.j6.symbolSearcherCallback.gn(fileEntryNextKey2);
                        i2++;
                        if (i2 > i) {
                            break;
                        }
                    }
                }
                SetOfInt setOfInt3 = new SetOfInt();
                SetOfInt setOfInt4 = new SetOfInt();
                this.j6.vy.EQ(setOfInt3);
                setOfInt3.default_Iterator.init();
                while (setOfInt3.default_Iterator.hasMoreElements()) {
                    int iNextKey2 = setOfInt3.default_Iterator.nextKey();
                    if (DW(charArray, iNextKey2)) {
                        setOfInt4.put(iNextKey2);
                    }
                }
                this.j6.vy.Ws(setOfInt4);
                loop6: while (true) {
                    FileEntry fileEntryAM2 = this.j6.vy.aM();
                    if (fileEntryAM2 == null) {
                        break;
                    }
                    if (!j6(fileEntryAM2)) {
                        SetOf<Entity> setOfFN2 = this.j6.entitySpace.FN(fileEntryAM2);
                        setOfFN2.DEFAULT_ITERATOR.init();
                        while (setOfFN2.DEFAULT_ITERATOR.hasMoreElements()) {
                            if (this.j6.stopCallback.aq()) {
                                return;
                            }
                            Entity entityNextKey2 = setOfFN2.DEFAULT_ITERATOR.nextKey();
                            if (setOfInt4.contains(this.j6.identifierSpace.QX(entityNextKey2.getIdentifier())) && ((entityNextKey2.isMember() && ((Member) entityNextKey2).Gj()) || entityNextKey2.isClassType() || (entityNextKey2.isMember() && ((Member) entityNextKey2).e9() && !((Member) entityNextKey2).iW() && !((Member) entityNextKey2).pN()))) {
                                this.j6.symbolSearcherCallback.DW(entityNextKey2);
                                i2++;
                                if (i2 > i) {
                                    break loop6;
                                }
                            }
                        }
                    }
                }
                i3 = i2;
                if (i3 == 0) {
                    i3 = i + 1;
                }
            }
            if (i3 > i) {
                this.j6.symbolSearcherCallback.Zo();
            } else {
                this.j6.symbolSearcherCallback.FH();
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 1914785305150883559L, this, str, new Integer(i));
            }
            throw th;
        }
    }
}
