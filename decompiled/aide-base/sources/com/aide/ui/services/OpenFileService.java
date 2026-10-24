package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.aide.common.AppLog;
import com.aide.engine.FileHighlightings;
import com.aide.engine.OpenFile;
import com.aide.engine.service.CharArray;
import com.aide.engine.service.IHighlightingListener;
import com.aide.engine.service.IOpenFileInterface;
import com.aide.ui.ServiceContainer;
import com.aide.ui.util.FileSystem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@cy(clazz = -87904726456966265L, container = -87904726456966265L, user = true)
/* loaded from: classes.dex */
public class OpenFileService {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 4284879620496039600L)
    private List<FileHighlightingsCallback> fileHighlightingsCallbacks;

    @dy(field = -4058998535535812919L)
    private String lastOpenFile;

    @dy(field = -1878127403064568543L)
    private Map<String, Long> loadedTimeMap;

    @dy(field = 3341818493184479973L)
    private Map<String, OpenFileModel> openFileModelMap;

    @dy(field = -1689585117634895104L)
    private OpenFileSupport openFileSupport;

    @cy(clazz = 3487382253650770587L, container = 3487382253650770587L, user = true)
    public interface FileHighlightingsCallback {
        @ey(method = 3499385146968607632L)
        void accept(FileHighlightings fileHighlightings);
    }

    @cy(clazz = 2869334960745628044L, container = 2869334960745628044L, user = true)
    public interface OpenFileModel {
        @ey(method = -82256725933723287L)
        void BT(int i, int i2, int i3, int i4, int i5, int i6);

        @ey(method = -1405892366128979200L)
        void Hw(int i, int i2);

        @ey(method = -5140144503519022935L)
        void IS(FileHighlightings fileHighlightings);

        @ey(method = 4121210467465807640L)
        void J0(OpenFile openFile);

        @ey(method = -3229083326078604893L)
        void Mr(FileHighlightings fileHighlightings);

        @ey(method = -2468156023929432192L)
        List<String> Qq();

        @ey(method = -886982485565288640L)
        void aM();

        @ey(method = -2403214791432891264L)
        void cb(int i, int i2, int i3, int i4, String str, boolean z, boolean z2);

        @ey(method = -120738776279898321L)
        void close();

        @ey(method = 8223017443690136724L)
        boolean cn();

        @ey(method = 4541138408438013340L)
        String g3();

        @ey(method = -2841867659354601427L)
        boolean gW();

        @ey(method = 2870543733371807408L)
        void j6();

        @ey(method = 240792674885184741L)
        void nw(String str);

        @ey(method = 549544528107989785L)
        void ro(int i, int i2, int i3, int i4, int i5, int i6);

        @ey(method = 3888507071572318132L)
        boolean sG();

        @ey(method = -3318221199660220487L)
        long we();
    }

    @cy(clazz = -5501362314978419643L, container = -5501362314978419643L, user = true)
    public interface OpenFileSupport {
        @ey(method = 875108763581857255L)
        void closeFile(String str);

        @ey(method = 4899054856096615825L)
        String getVisibleFile();

        @ey(method = 1623758294499353361L)
        OpenFileModel openFile(String str);

        @ey(method = 7026828658127417040L)
        void visibleFile(String str);
    }

    @cy(clazz = 554937690635364480L, container = -87904726456966265L, user = true)
    class a extends IHighlightingListener.Sub {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -123807193581482112L)
        public a() {
        }

        @Override // com.aide.engine.service.IHighlightingListener
        @ey(method = 792450795134967057L)
        public void IS(FileHighlightings fileHighlightings) {
            try {
                if (fY) {
                    iy.tp(5853831219500207107L, this, fileHighlightings);
                }
                OpenFileModel openFileModel = OpenFileService.this.getOpenFileModel(fileHighlightings.filePath);
                if (openFileModel != null) {
                    openFileModel.IS(fileHighlightings);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 5853831219500207107L, this, fileHighlightings);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IHighlightingListener
        @ey(method = 2297041829484256296L)
        public void kQ(FileHighlightings fileHighlightings) {
            try {
                if (fY) {
                    iy.tp(-1837750657338508176L, this, fileHighlightings);
                }
                if (fileHighlightings.AL > 0) {
                    Iterator it = OpenFileService.this.fileHighlightingsCallbacks.iterator();
                    while (it.hasNext()) {
                        ((FileHighlightingsCallback) it.next()).accept(fileHighlightings);
                    }
                } else {
                    OpenFileModel openFileModel = OpenFileService.this.getOpenFileModel(fileHighlightings.filePath);
                    if (openFileModel != null) {
                        openFileModel.Mr(fileHighlightings);
                    }
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -1837750657338508176L, this, fileHighlightings);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 555058604179105996L, container = -87904726456966265L, user = true)
    class b extends IOpenFileInterface.Sub {

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = 3695741989182360977L)
        final /* synthetic */ OpenFileModel qp;

        @dy(field = 98836575055614671L)
        private OpenFile jw = new OpenFile();

        @dy(field = -393744849814177100L)
        private CharArray fY = new CharArray(10000);

        static {
            iy.Zo(b.class);
        }

        @ey(method = -4671780895798902176L)
        public b(OpenFileService openFileService, OpenFileModel openFileModel) {
            this.qp = openFileModel;
        }

        @Override // com.aide.engine.service.IOpenFileInterface
        @ey(method = 2210754340865682671L)
        public int GQ() {
            try {
                if (k2) {
                    iy.gn(1245703052780377183L, this);
                }
                return this.jw.length;
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 1245703052780377183L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IOpenFileInterface
        @ey(method = 2235608365559036496L)
        public CharArray W3(int i) throws Throwable {
            try {
                if (k2) {
                    iy.u7(-1061154994333155840L, this, i);
                }
                char[] cArr = this.jw.charArray;
                char[] cArr2 = this.fY.data;
                int i2 = this.jw.length;
                int length = cArr2.length;
                int i3 = 0;
                while (i < i2 && i3 < length) {
                    int i4 = i3 + 1;
                    int i5 = i + 1;
                    try {
                        cArr2[i3] = cArr[i];
                        i3 = i4;
                        i = i5;
                    } catch (Throwable th) {
                        th = th;
                        i = i5;
                        if (zh) {
                            iy.j3(th, -1061154994333155840L, this, new Integer(i));
                        }
                        throw th;
                    }
                }
                this.fY.mb = i3;
                return this.fY;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.aide.engine.service.IOpenFileInterface
        @ey(method = -1667774281767890280L)
        public long we() {
            try {
                if (k2) {
                    iy.gn(1635135770701214400L, this);
                }
                return this.qp.we();
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 1635135770701214400L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IOpenFileInterface
        @ey(method = 4312686639289931136L)
        public long yA() {
            try {
                if (k2) {
                    iy.gn(-96783880885932968L, this);
                }
                try {
                    this.qp.J0(this.jw);
                    this.jw.charArray = this.jw.charArray;
                    this.jw.length = this.jw.length;
                    this.jw.FH = this.jw.FH;
                } catch (IOException e) {
                    AppLog.v5(e);
                    this.jw.length = 0;
                }
                return this.jw.FH;
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -96783880885932968L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(OpenFileService.class);
    }

    @ey(method = -668346200913231456L)
    public OpenFileService() {
        try {
            if (Zo) {
                iy.gn(-1338968642929473196L, null);
            }
            this.openFileModelMap = new LinkedHashMap();
            this.loadedTimeMap = new HashMap();
            this.fileHighlightingsCallbacks = new ArrayList();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1338968642929473196L, null);
            }
            throw th;
        }
    }

    @ey(method = -21142779532829293L)
    private void DW(String str, OpenFileModel openFileModel) {
        try {
            if (Zo) {
                iy.EQ(5124669159317979600L, this, str, openFileModel);
            }
            this.openFileModelMap.put(str, openFileModel);
            P8(str, openFileModel);
            while (this.openFileModelMap.size() > 10 && v5(str)) {
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 5124669159317979600L, this, str, openFileModel);
            }
            throw th;
        }
    }

    @ey(method = -1203837560873770563L)
    private boolean J8(String str) {
        try {
            if (Zo) {
                iy.tp(5085031610605026512L, this, str);
            }
            String lowerCase = str.toLowerCase();
            if (!lowerCase.endsWith(".java") && !lowerCase.endsWith(".class") && !lowerCase.endsWith(".xml") && !lowerCase.endsWith(".c") && !lowerCase.endsWith(".cpp") && !lowerCase.endsWith(".cc") && !lowerCase.endsWith(".h") && !lowerCase.endsWith(".hh") && !lowerCase.endsWith(".hpp") && !lowerCase.endsWith(".html") && !lowerCase.endsWith(".htm") && !lowerCase.endsWith(".css")) {
                if (!lowerCase.endsWith(".js")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 5085031610605026512L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1778526216650971260L)
    private void P8(String str, OpenFileModel openFileModel) {
        try {
            if (Zo) {
                iy.EQ(1352180520473043677L, this, str, openFileModel);
            }
            ServiceContainer.getEngineService().nw(str, new b(this, openFileModel));
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 1352180520473043677L, this, str, openFileModel);
            }
            throw th;
        }
    }

    @ey(method = -1576652306346077805L)
    private long getLoadedTime(String str) {
        try {
            if (Zo) {
                iy.tp(-382766286572144000L, this, str);
            }
            if (this.loadedTimeMap.containsKey(str)) {
                return this.loadedTimeMap.get(str).longValue();
            }
            return 0L;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -382766286572144000L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 922088855067616243L)
    private OpenFileModel getVisibleOpenFileModel() {
        try {
            if (Zo) {
                iy.gn(-2756931129524890112L, this);
            }
            return this.openFileModelMap.get(this.openFileSupport.getVisibleFile());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2756931129524890112L, this);
            }
            throw th;
        }
    }

    @ey(method = 1494067517719136712L)
    private void nw() {
        try {
            if (Zo) {
                iy.gn(4002116798050869483L, this);
            }
            String str = "";
            for (String str2 : this.openFileModelMap.keySet()) {
                if (str.length() > 0) {
                    str = str + ";";
                }
                str = str + str2;
            }
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("OpenFileService", 0).edit();
            editorEdit.putString("CurrentFiles", str);
            editorEdit.commit();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 4002116798050869483L, this);
            }
            throw th;
        }
    }

    @ey(method = -7147144284661230064L)
    private void rN(String str) {
        try {
            if (Zo) {
                iy.tp(-197953105390214241L, this, str);
            }
            if (a8(str)) {
                return;
            }
            DW(str, this.openFileSupport.openFile(str));
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -197953105390214241L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 82251575639683184L)
    private boolean v5(String str) {
        try {
            if (Zo) {
                iy.tp(6381402056394372825L, this, str);
            }
            String str2 = null;
            for (Map.Entry<String, OpenFileModel> entry : this.openFileModelMap.entrySet()) {
                String key = entry.getKey();
                OpenFileModel value = entry.getValue();
                if (!key.equals(str) && !value.sG() && !value.gW() && (str2 == null || getLoadedTime(str2) > getLoadedTime(key))) {
                    str2 = key;
                }
            }
            if (str2 == null) {
                for (Map.Entry<String, OpenFileModel> entry2 : this.openFileModelMap.entrySet()) {
                    String key2 = entry2.getKey();
                    OpenFileModel value2 = entry2.getValue();
                    if (!key2.equals(str) && !value2.sG() && (str2 == null || getLoadedTime(str2) > getLoadedTime(key2))) {
                        str2 = key2;
                    }
                }
            }
            if (str2 == null) {
                return false;
            }
            Hw(str2);
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 6381402056394372825L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3510523215668886344L)
    public void BT(String str) {
        try {
            if (Zo) {
                iy.tp(-5343616341563854331L, this, str);
            }
            HashSet hashSet = new HashSet();
            Iterator<Map.Entry<String, OpenFileModel>> it = this.openFileModelMap.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (FileSystem.nw(str, key)) {
                    hashSet.add(key);
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                Hw((String) it2.next());
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -5343616341563854331L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1881146956694600824L)
    public long EQ() {
        try {
            if (Zo) {
                iy.gn(-4887642519519075669L, this);
            }
            return getVisibleOpenFileModel().we();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -4887642519519075669L, this);
            }
            throw th;
        }
    }

    @ey(method = 6634629141239548732L)
    public void FH(FileHighlightingsCallback fileHighlightingsCallback) {
        try {
            if (Zo) {
                iy.tp(-6231401113002562809L, this, fileHighlightingsCallback);
            }
            this.fileHighlightingsCallbacks.add(fileHighlightingsCallback);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -6231401113002562809L, this, fileHighlightingsCallback);
            }
            throw th;
        }
    }

    @ey(method = 108950434663617360L)
    public void Hw(String str) {
        try {
            if (Zo) {
                iy.tp(-6692914938708381609L, this, str);
            }
            this.openFileModelMap.get(str).close();
            this.openFileModelMap.remove(str);
            ServiceContainer.getEngineService().wc(str);
            this.openFileSupport.closeFile(str);
            ServiceContainer.getEngineService().ei();
            nw();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -6692914938708381609L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1287166786632189360L)
    public void J0() {
        try {
            if (Zo) {
                iy.gn(2627275423547542415L, this);
            }
            for (Map.Entry<String, OpenFileModel> entry : this.openFileModelMap.entrySet()) {
                P8(entry.getKey(), entry.getValue());
            }
            ServiceContainer.getEngineService().x9(new a());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2627275423547542415L, this);
            }
            throw th;
        }
    }

    @ey(method = -5801821723264021936L)
    public void KD(boolean z, boolean z2) {
        try {
            if (Zo) {
                iy.EQ(-1984351752503026935L, this, new Boolean(z), new Boolean(z2));
            }
            cb(z, z2);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -1984351752503026935L, this, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = -6750680117419217893L)
    public boolean Mr() {
        try {
            if (Zo) {
                iy.gn(5859948262588820232L, this);
            }
            if (!ServiceContainer.getProjectService().isPremium()) {
                return false;
            }
            for (Map.Entry<String, OpenFileModel> entry : this.openFileModelMap.entrySet()) {
                entry.getKey();
                if (entry.getValue().sG()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 5859948262588820232L, this);
            }
            throw th;
        }
    }

    @ey(method = 1805660968862256172L)
    public boolean QX() {
        try {
            if (Zo) {
                iy.gn(-31092515674709195L, this);
            }
            if (j3() && u7().toLowerCase().endsWith(".java")) {
                if (ServiceContainer.getProjectService().isOpenProject()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -31092515674709195L, this);
            }
            throw th;
        }
    }

    @ey(method = 1054231785885552081L)
    public void SI(FileHighlightingsCallback fileHighlightingsCallback) {
        try {
            if (Zo) {
                iy.tp(125863297883366576L, this, fileHighlightingsCallback);
            }
            this.fileHighlightingsCallbacks.remove(fileHighlightingsCallback);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 125863297883366576L, this, fileHighlightingsCallback);
            }
            throw th;
        }
    }

    @ey(method = 4086424358669999925L)
    public boolean U2() {
        try {
            if (Zo) {
                iy.gn(-1302760480657514416L, this);
            }
            Iterator<OpenFileModel> it = this.openFileModelMap.values().iterator();
            while (it.hasNext()) {
                if (it.next().sG()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1302760480657514416L, this);
            }
            throw th;
        }
    }

    @ey(method = 241473647587646243L)
    public boolean Ws() {
        try {
            if (Zo) {
                iy.gn(-601302454056802264L, this);
            }
            if (j3() && J8(u7())) {
                if (ServiceContainer.getProjectService().isOpenProject()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -601302454056802264L, this);
            }
            throw th;
        }
    }

    @ey(method = 8243882200354719000L)
    public boolean XL() {
        try {
            if (Zo) {
                iy.gn(4036160922200731011L, this);
            }
            if (u7() != null) {
                if (!FileSystem.sh(u7())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 4036160922200731011L, this);
            }
            throw th;
        }
    }

    @ey(method = -1666598869827987073L)
    public void Zo() {
        try {
            if (Zo) {
                iy.gn(2373430768077397904L, this);
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry<String, OpenFileModel> entry : this.openFileModelMap.entrySet()) {
                if (!entry.getValue().sG()) {
                    hashSet.add(entry.getKey());
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Hw((String) it.next());
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2373430768077397904L, this);
            }
            throw th;
        }
    }

    @ey(method = 559534731199110784L)
    public boolean a8(String str) {
        try {
            if (Zo) {
                iy.tp(1947299949793172135L, this, str);
            }
            return this.openFileModelMap.containsKey(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1947299949793172135L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -995188733161922000L)
    public boolean aM() {
        try {
            if (Zo) {
                iy.gn(2841200173454170325L, this);
            }
            return !this.openFileModelMap.isEmpty();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2841200173454170325L, this);
            }
            throw th;
        }
    }

    @ey(method = 88231999029303243L)
    public boolean cb(boolean z, boolean z2) {
        try {
            if (Zo) {
                iy.EQ(5473762685545180000L, this, new Boolean(z), new Boolean(z2));
            }
            boolean zIsPremium = ServiceContainer.getProjectService().isPremium();
            boolean z3 = true;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, OpenFileModel> entry : this.openFileModelMap.entrySet()) {
                String key = entry.getKey();
                OpenFileModel value = entry.getValue();
                if (value.sG()) {
                    if (zIsPremium) {
                        z3 = false;
                    } else {
                        if (z) {
                            arrayList.add(key);
                        }
                        value.aM();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                ServiceContainer.getProjectService().et(arrayList, z2);
            }
            return z3;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 5473762685545180000L, this, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 1538069650075800276L)
    public void cn(OpenFileSupport openFileSupport) {
        try {
            if (Zo) {
                iy.tp(-392602682715779349L, this, openFileSupport);
            }
            this.openFileSupport = openFileSupport;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -392602682715779349L, this, openFileSupport);
            }
            throw th;
        }
    }

    @ey(method = -2345962177439264776L)
    public void ei(boolean z) {
        try {
            if (Zo) {
                iy.Ws(-510165287874117215L, this, z);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, OpenFileModel> entry : this.openFileModelMap.entrySet()) {
                String key = entry.getKey();
                OpenFileModel value = entry.getValue();
                if (value.cn()) {
                    value.j6();
                    arrayList.add(key);
                }
            }
            if (arrayList.isEmpty() || !z) {
                return;
            }
            ServiceContainer.getProjectService().et(arrayList, false);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -510165287874117215L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1080353077996835385L)
    public void er(List<String> list) {
        try {
            if (Zo) {
                iy.tp(-581308408511950144L, this, list);
            }
            int i = 0;
            while (i < list.size()) {
                try {
                    lg(list.get(i), i == 0);
                } catch (IOException unused) {
                    Toast.makeText(ServiceContainer.getContext(), list.get(i) + " could not be loaded!", 1).show();
                }
                i++;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -581308408511950144L, this, list);
            }
            throw th;
        }
    }

    @ey(method = -3163396658726539785L)
    public OpenFileModel getOpenFileModel(String str) {
        try {
            if (Zo) {
                iy.tp(2839078665596249356L, this, str);
            }
            return this.openFileModelMap.get(str);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2839078665596249356L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3894485389268610240L)
    public boolean j3() {
        try {
            if (Zo) {
                iy.gn(4231070054278013269L, this);
            }
            return u7() != null;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 4231070054278013269L, this);
            }
            throw th;
        }
    }

    @ey(method = 2504189976209374225L)
    public void lg(String str, boolean z) {
        try {
            if (Zo) {
                iy.EQ(-106975686406521920L, this, str, new Boolean(z));
            }
            if (str.equals(u7())) {
                return;
            }
            boolean zA8 = a8(str);
            rN(str);
            if (a8(str)) {
                if (!zA8) {
                    ServiceContainer.EQ().g3(str);
                }
                if (z) {
                    this.openFileSupport.visibleFile(str);
                }
                this.loadedTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
                nw();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -106975686406521920L, this, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3551084097076412835L)
    public OpenFileModel openFile(String str) {
        try {
            if (Zo) {
                iy.tp(5049133857911600640L, this, str);
            }
            OpenFileModel openFileModel = getOpenFileModel(str);
            if (openFileModel != null) {
                return openFileModel;
            }
            ro();
            this.lastOpenFile = str;
            OpenFileModel openFileModelOpenFile = this.openFileSupport.openFile(str);
            DW(str, openFileModelOpenFile);
            return openFileModelOpenFile;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 5049133857911600640L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2665456214952796365L)
    public void ro() {
        try {
            if (Zo) {
                iy.gn(-2613001169087778920L, this);
            }
            if (this.lastOpenFile != null) {
                this.openFileModelMap.get(this.lastOpenFile).aM();
                this.lastOpenFile = null;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2613001169087778920L, this);
            }
            throw th;
        }
    }

    @ey(method = -3040893391667015655L)
    public void sh(String str) {
        try {
            if (Zo) {
                iy.tp(-2253935147280698560L, this, str);
            }
            if (a8(str)) {
                this.openFileSupport.visibleFile(str);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2253935147280698560L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1549887291517917616L)
    public String u7() {
        try {
            if (Zo) {
                iy.gn(2053160169550986925L, this);
            }
            return this.openFileSupport.getVisibleFile();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2053160169550986925L, this);
            }
            throw th;
        }
    }

    @ey(method = -1541043584752258559L)
    public void vy(String str, String str2) {
        try {
            if (Zo) {
                iy.EQ(-1216992331299820640L, this, str, str2);
            }
            HashMap map = new HashMap();
            Iterator<Map.Entry<String, OpenFileModel>> it = this.openFileModelMap.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (FileSystem.nw(str, key)) {
                    map.put(key, FileSystem.Mr(key, str, str2));
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                ServiceContainer.getEngineService().sG(str3, str4);
                this.openFileModelMap.get(str3).nw(str4);
                this.openFileModelMap.put(str4, this.openFileModelMap.get(str3));
                this.openFileModelMap.remove(str3);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -1216992331299820640L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 883029123832978996L)
    public void we() {
        try {
            if (Zo) {
                iy.gn(-2115440843655470981L, this);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2115440843655470981L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    @abcd.ey(method = -395904413518019872L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void yS(java.lang.String r12) {
        /*
            r11 = this;
            r0 = -5779111451015901571(0xafcc78c11cce0e7d, double:-1.9209872768193405E-78)
            boolean r2 = com.aide.ui.services.OpenFileService.Zo     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto Lc
            abcd.iy.tp(r0, r11, r12)     // Catch: java.lang.Throwable -> L9a
        Lc:
            boolean r2 = com.aide.ui.ServiceContainer.isTrainerMode()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L14
            goto L99
        L14:
            com.aide.ui.MainActivity r2 = com.aide.ui.ServiceContainer.getMainActivity()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r2 = r2.checkSelfPermission(r3)     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto L21
            return
        L21:
            java.lang.String r2 = " could not be loaded!"
            r3 = 1
            if (r12 == 0) goto L45
            r11.rN(r12)     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L9a
            goto L99
        L2a:
            android.content.Context r4 = com.aide.ui.ServiceContainer.getContext()     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r5.<init>()     // Catch: java.lang.Throwable -> L9a
            r5.append(r12)     // Catch: java.lang.Throwable -> L9a
            r5.append(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L9a
            android.widget.Toast r2 = android.widget.Toast.makeText(r4, r2, r3)     // Catch: java.lang.Throwable -> L9a
            r2.show()     // Catch: java.lang.Throwable -> L9a
            goto L99
        L45:
            android.content.Context r4 = com.aide.ui.ServiceContainer.getContext()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "OpenFileService"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "CurrentFiles"
            r7 = 0
            java.lang.String r4 = r4.getString(r5, r7)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L99
            java.lang.String r5 = ";"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Throwable -> L9a
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Throwable -> L9a
            r5.<init>()     // Catch: java.lang.Throwable -> L9a
            int r7 = r4.length     // Catch: java.lang.Throwable -> L9a
        L65:
            if (r6 >= r7) goto L99
            r8 = r4[r6]     // Catch: java.lang.Throwable -> L9a
            boolean r9 = com.aide.ui.util.FileSystem.exists(r8)     // Catch: java.lang.Throwable -> L9a
            if (r9 == 0) goto L96
            boolean r9 = r5.contains(r8)     // Catch: java.lang.Throwable -> L9a
            if (r9 != 0) goto L96
            r5.add(r8)     // Catch: java.lang.Throwable -> L9a
            r11.rN(r8)     // Catch: java.io.IOException -> L7c java.lang.Throwable -> L9a
            goto L96
        L7c:
            android.content.Context r9 = com.aide.ui.ServiceContainer.getContext()     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r10.<init>()     // Catch: java.lang.Throwable -> L9a
            r10.append(r8)     // Catch: java.lang.Throwable -> L9a
            r10.append(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L9a
            android.widget.Toast r8 = android.widget.Toast.makeText(r9, r8, r3)     // Catch: java.lang.Throwable -> L9a
            r8.show()     // Catch: java.lang.Throwable -> L9a
        L96:
            int r6 = r6 + 1
            goto L65
        L99:
            return
        L9a:
            r2 = move-exception
            boolean r3 = com.aide.ui.services.OpenFileService.VH
            if (r3 == 0) goto La2
            abcd.iy.j3(r2, r0, r11, r12)
        La2:
            goto La4
        La3:
            throw r2
        La4:
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.OpenFileService.yS(java.lang.String):void");
    }
}
