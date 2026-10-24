package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.ui.util.FilePatternMatcher;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@cy(clazz = -5147424603853593465L, container = -5147424603853593465L, user = true)
/* loaded from: classes.dex */
public class EngineSolution implements Parcelable {

    @dy(field = 1641609858763802560L)
    public static final Parcelable.Creator<EngineSolution> CREATOR;

    @gy
    private static /* synthetic */ boolean k2;

    @fy
    private static /* synthetic */ boolean qp;

    @dy(field = 2063215573395878616L)
    public List<String> codeModelNames;

    @dy(field = 2885473267692104283L)
    private final String encoding;

    @dy(field = -1208618160609312432L)
    public final List<EngineSolutionProject> engineSolutionProjects;

    @dy(field = 4512509444130051504L)
    private final TreeMap<String, List<String>> modelPatternsTreeMap;

    @cy(clazz = 2415975557034833788L, container = -5147424603853593465L, user = true)
    static class a implements Parcelable.Creator<EngineSolution> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -688645220677987008L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -1281551351329241664L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public EngineSolution[] newArray(int i) {
            try {
                if (j6) {
                    iy.u7(632868433733498547L, this, i);
                }
                return new EngineSolution[i];
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, 632868433733498547L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 6152137544715173595L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public EngineSolution createFromParcel(Parcel parcel) {
            try {
                if (j6) {
                    iy.tp(-2081006838604226280L, this, parcel);
                }
                return new EngineSolution(parcel);
            } catch (Throwable th) {
                if (DW) {
                    iy.j3(th, -2081006838604226280L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(EngineSolution.class);
            if (qp) {
                iy.gn(2403266038710548903L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 2403266038710548903L, null);
            }
            throw th;
        }
    }

    @ey(method = 5783245591446097651L)
    public EngineSolution(List<EngineSolutionProject> list, String str, TreeMap<String, List<String>> treeMap, List<String> list2) {
        try {
            if (qp) {
                iy.J0(2746260029581372976L, null, list, str, treeMap, list2);
            }
            this.engineSolutionProjects = list;
            this.encoding = str;
            this.modelPatternsTreeMap = treeMap;
            this.codeModelNames = list2;
        } catch (Throwable th) {
            if (k2) {
                iy.a8(th, 2746260029581372976L, null, list, str, treeMap, list2);
            }
            throw th;
        }
    }

    @ey(method = 31939011519163875L)
    private void DW(Model model, FileEntry fileEntry, boolean z, int i, CodeModel codeModel) {
        try {
            if (qp) {
                iy.J8(-668855356256737821L, this, model, fileEntry, new Boolean(z), new Integer(i), codeModel);
            }
            if (!fileEntry.isDirectory() || fileEntry.isArchive()) {
                if (v5(fileEntry, codeModel)) {
                    model.gn(fileEntry, i, codeModel, z);
                }
            } else {
                if (fileEntry.getFullNameString().startsWith(".")) {
                    return;
                }
                int childCount = fileEntry.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    DW(model, fileEntry.getChildEntry(i2), z, i, codeModel);
                }
            }
        } catch (Throwable th) {
            if (k2) {
                iy.lg(th, -668855356256737821L, this, model, fileEntry, new Boolean(z), new Integer(i), codeModel);
            }
            throw th;
        }
    }

    @ey(method = 787144627791687249L)
    private boolean v5(FileEntry fileEntry, CodeModel codeModel) {
        try {
            if (qp) {
                iy.EQ(4110792065544809913L, this, fileEntry, codeModel);
            }
            String fullNameString = fileEntry.getFullNameString();
            String[] defaultFilePatterns = codeModel.getDefaultFilePatterns();
            String[] extendFilePatterns = codeModel.getExtendFilePatterns();
            if (defaultFilePatterns != null && FilePatternMatcher.j6() != null) {
                for (String str : defaultFilePatterns) {
                    if (FilePatternMatcher.j6().DW(fullNameString, str)) {
                        for (String str2 : extendFilePatterns) {
                            if (FilePatternMatcher.j6().DW(fullNameString, str2)) {
                                break;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (k2) {
                iy.Mr(th, 4110792065544809913L, this, fileEntry, codeModel);
            }
            throw th;
        }
    }

    @ey(method = -1369501607492022885L)
    public void FH(Model model) throws Throwable {
        long j;
        Model model2;
        HashMap map;
        int i;
        EngineSolutionProject engineSolutionProject;
        Model model3 = model;
        long j2 = 3077489901940902155L;
        try {
            if (qp) {
                iy.tp(3077489901940902155L, this, model3);
            }
            model.J0();
            HashMap map2 = new HashMap();
            for (CodeModel codeModel : model.getCodeModels()) {
                map2.put(codeModel.getName(), codeModel);
                if (this.modelPatternsTreeMap.containsKey(codeModel.getName())) {
                    model3.Zo(codeModel, this.modelPatternsTreeMap.get(codeModel.getName()));
                }
            }
            model3.VH(this.encoding);
            Iterator<EngineSolutionProject> it = this.engineSolutionProjects.iterator();
            while (it.hasNext()) {
                EngineSolutionProject next = it.next();
                int iIndexOf = this.engineSolutionProjects.indexOf(next);
                String str = next.zh;
                String str2 = str == null ? "" : str;
                String str3 = next.Q6;
                String str4 = str3 == null ? "" : str3;
                List<String> list = next.kf;
                if (list == null) {
                    list = Collections.EMPTY_LIST;
                }
                List<String> list2 = list;
                List<String> list3 = next.Jl;
                if (list3 == null) {
                    list3 = Collections.EMPTY_LIST;
                }
                List<String> list4 = list3;
                List<String> list5 = next.iW;
                if (list5 == null) {
                    list5 = Collections.EMPTY_LIST;
                }
                List<String> list6 = list5;
                String str5 = next.hK;
                try {
                    HashMap map3 = map2;
                    model.v5(iIndexOf, str2, next.projectName, next.mb, next.jw, str4, list2, list4, list6, next.AL, next.w9, str5 == null ? "" : str5, next.cT, next.q7, next.Z1, next.n5);
                    for (String str6 : next.qp) {
                        int iIndexOf2 = -1;
                        for (EngineSolutionProject engineSolutionProject2 : this.engineSolutionProjects) {
                            if (engineSolutionProject2.projectName.equals(str6)) {
                                iIndexOf2 = this.engineSolutionProjects.indexOf(engineSolutionProject2);
                            }
                        }
                        if (iIndexOf2 != -1) {
                            model3.EQ(iIndexOf, iIndexOf2);
                        }
                    }
                    for (File file : next.fY) {
                        FileEntry fileEntryLg = model3.fileSpace.lg(file.WB);
                        if (file.mb != null) {
                            map = map3;
                            if (map.containsKey(file.mb)) {
                                CodeModel codeModel2 = (CodeModel) map.get(file.mb);
                                if (codeModel2.isSupportArchiveFile()) {
                                    for (FileEntry parentDirectory = fileEntryLg; !parentDirectory.isRootDirectory() && !new java.io.File(parentDirectory.getPathString()).isDirectory(); parentDirectory = parentDirectory.getParentDirectory()) {
                                        model3.u7(parentDirectory, codeModel2);
                                    }
                                }
                            }
                        } else {
                            map = map3;
                        }
                        if (file.fY) {
                            model3.we(fileEntryLg, iIndexOf, file.jw);
                        }
                        if (file.mb == null || !map.containsKey(file.mb)) {
                            i = iIndexOf;
                            engineSolutionProject = next;
                            model2 = model3;
                        } else {
                            i = iIndexOf;
                            engineSolutionProject = next;
                            j = 3077489901940902155L;
                            model2 = model3;
                            try {
                                DW(model, fileEntryLg, next.k2, i, (CodeModel) map.get(file.mb));
                            } catch (Throwable th) {
                                th = th;
                                if (k2) {
                                    iy.j3(th, j, this, model2);
                                }
                                throw th;
                            }
                        }
                        map3 = map;
                        iIndexOf = i;
                        next = engineSolutionProject;
                        model3 = model2;
                    }
                    map2 = map3;
                    j2 = 3077489901940902155L;
                } catch (Throwable th2) {
                    th = th2;
                    model2 = model3;
                    j = 3077489901940902155L;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            j = j2;
            model2 = model3;
        }
    }

    @ey(method = -7002248927404928096L)
    public long Hw() {
        int i;
        try {
            if (qp) {
                iy.gn(-2704125139962466220L, this);
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.reset();
                if (this.encoding != null) {
                    messageDigest.update(this.encoding.getBytes());
                }
                Iterator<String> it = this.codeModelNames.iterator();
                while (it.hasNext()) {
                    messageDigest.update(it.next().getBytes());
                }
                Iterator<EngineSolutionProject> it2 = this.engineSolutionProjects.iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    EngineSolutionProject next = it2.next();
                    if (next.zh != null) {
                        messageDigest.update(next.zh.getBytes());
                    }
                    messageDigest.update(next.projectName.getBytes());
                    messageDigest.update(next.mb.getBytes());
                    messageDigest.update(next.jw.getBytes());
                    if (next.Q6 != null) {
                        messageDigest.update(next.Q6.getBytes());
                    }
                    if (next.kf != null) {
                        Iterator<String> it3 = next.kf.iterator();
                        while (it3.hasNext()) {
                            messageDigest.update(it3.next().getBytes());
                        }
                    }
                    if (!next.k2) {
                        i = 1;
                    }
                    messageDigest.update((byte) i);
                    if (next.Jl != null) {
                        Iterator<String> it4 = next.Jl.iterator();
                        while (it4.hasNext()) {
                            messageDigest.update(it4.next().getBytes());
                        }
                    }
                    if (next.hK != null) {
                        messageDigest.update(next.hK.getBytes());
                    }
                    Iterator<String> it5 = next.qp.iterator();
                    while (it5.hasNext()) {
                        messageDigest.update(it5.next().getBytes());
                    }
                    for (File file : next.fY) {
                        if (file.mb != null && file.qp) {
                            messageDigest.update(file.WB.getBytes());
                            messageDigest.update(file.mb.getBytes());
                        }
                    }
                }
                for (Map.Entry<String, List<String>> entry : this.modelPatternsTreeMap.entrySet()) {
                    messageDigest.update(entry.getKey().getBytes());
                    Iterator<String> it6 = entry.getValue().iterator();
                    while (it6.hasNext()) {
                        messageDigest.update(it6.next().getBytes());
                    }
                }
                long j = 0;
                while (i < messageDigest.digest().length) {
                    j = (j << 8) ^ r2[i];
                    i++;
                }
                return j;
            } catch (NoSuchAlgorithmException unused) {
                throw new InternalError();
            }
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -2704125139962466220L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 3748299378366654960L)
    public int describeContents() {
        try {
            if (!qp) {
                return 0;
            }
            iy.gn(-6059007693965183048L, this);
            return 0;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -6059007693965183048L, this);
            }
            throw th;
        }
    }

    @ey(method = 974103473783267009L)
    public void j6(EngineSolutionProject engineSolutionProject) {
        try {
            if (qp) {
                iy.tp(-1706030434508833875L, this, engineSolutionProject);
            }
            this.engineSolutionProjects.add(engineSolutionProject);
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -1706030434508833875L, this, engineSolutionProject);
            }
            throw th;
        }
    }

    @ey(method = -1452481025864480375L)
    public String toString() {
        try {
            if (qp) {
                iy.gn(-118687420064916427L, this);
            }
            String str = "";
            for (EngineSolutionProject engineSolutionProject : this.engineSolutionProjects) {
                String str2 = engineSolutionProject.mb != null ? str + "Assembly " + engineSolutionProject.projectName + " (" + engineSolutionProject.mb + "), checked " + engineSolutionProject.k2 + "\n" : str + "Assembly " + engineSolutionProject.projectName + ", checked " + engineSolutionProject.k2 + "\n";
                Iterator<String> it = engineSolutionProject.qp.iterator();
                while (it.hasNext()) {
                    str2 = str2 + "References " + it.next() + "\n";
                }
                for (File file : engineSolutionProject.fY) {
                    str2 = (str2 + file.WB + " " + (file.mb == null ? "(no plugin)" : file.mb) + " ") + "\n";
                }
                str = str2 + "\n";
            }
            return str;
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -118687420064916427L, this);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -697467212925490829L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (qp) {
                iy.EQ(-621781705076080373L, this, parcel, new Integer(i));
            }
            parcel.writeString(this.encoding);
            parcel.writeMap(this.modelPatternsTreeMap);
            parcel.writeList(this.codeModelNames);
        } catch (Throwable th) {
            if (k2) {
                iy.Mr(th, -621781705076080373L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }

    @cy(clazz = -3579233191020808329L, container = -3579233191020808329L, user = true)
    public static class File implements Parcelable {

        @dy(field = 3397964585828422800L)
        public static final Parcelable.Creator<File> CREATOR;

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -2656692000590085385L)
        private final String WB;

        @dy(field = -2437558712941134624L)
        private final boolean fY;

        @dy(field = 2275511206990035941L)
        private final String jw;

        @dy(field = 1576331338137298656L)
        private final String mb;

        @dy(field = -99333058633746145L)
        private final boolean qp;

        @cy(clazz = 361096508686728332L, container = -3579233191020808329L, user = true)
        static class a implements Parcelable.Creator<File> {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -447090607021869475L)
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @ey(method = -101776724335344965L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public File[] newArray(int i) {
                try {
                    if (j6) {
                        iy.u7(2051102941863510528L, this, i);
                    }
                    return new File[i];
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 2051102941863510528L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // android.os.Parcelable.Creator
            @ey(method = -3813427584658860432L)
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public File createFromParcel(Parcel parcel) {
                try {
                    if (j6) {
                        iy.tp(-1518855867139713837L, this, parcel);
                    }
                    return new File(parcel);
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -1518855867139713837L, this, parcel);
                    }
                    throw th;
                }
            }
        }

        static {
            try {
                iy.Zo(File.class);
                if (k2) {
                    iy.gn(-154502159828188648L, null);
                }
                CREATOR = new a();
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -154502159828188648L, null);
                }
                throw th;
            }
        }

        @ey(method = 7310579408595594327L)
        public File(String str, String str2, String str3, boolean z, boolean z2) {
            try {
                if (k2) {
                    iy.J8(-2728438989639039864L, null, str, str2, str3, new Boolean(z), new Boolean(z2));
                }
                this.WB = str;
                this.mb = str2;
                this.jw = str3;
                this.fY = z;
                this.qp = z2;
            } catch (Throwable th) {
                if (zh) {
                    iy.lg(th, -2728438989639039864L, null, str, str2, str3, new Boolean(z), new Boolean(z2));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable
        @ey(method = -37803078136265448L)
        public int describeContents() {
            try {
                if (!k2) {
                    return 0;
                }
                iy.gn(-870902371027684725L, this);
                return 0;
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -870902371027684725L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable
        @ey(method = -3980680061008266581L)
        public void writeToParcel(Parcel parcel, int i) {
            try {
                if (k2) {
                    iy.EQ(3758667938306483416L, this, parcel, new Integer(i));
                }
                parcel.writeString(this.WB);
                parcel.writeString(this.mb);
                parcel.writeString(this.jw);
                int i2 = 1;
                parcel.writeInt(this.fY ? 1 : 0);
                if (!this.qp) {
                    i2 = 0;
                }
                parcel.writeInt(i2);
            } catch (Throwable th) {
                if (zh) {
                    iy.Mr(th, 3758667938306483416L, this, parcel, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -20875823533158921L)
        public File(Parcel parcel) {
            try {
                if (k2) {
                    iy.tp(-644478749509622232L, null, parcel);
                }
                this.WB = parcel.readString();
                this.mb = parcel.readString();
                this.jw = parcel.readString();
                boolean z = true;
                this.fY = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                this.qp = z;
            } catch (Throwable th) {
                if (zh) {
                    iy.j3(th, -644478749509622232L, null, parcel);
                }
                throw th;
            }
        }
    }

    @ey(method = 468265635116668519L)
    public EngineSolution(Parcel parcel) {
        try {
            if (qp) {
                iy.tp(-15700115910165984L, null, parcel);
            }
            this.engineSolutionProjects = new ArrayList();
            this.encoding = parcel.readString();
            TreeMap<String, List<String>> treeMap = new TreeMap<>();
            this.modelPatternsTreeMap = treeMap;
            parcel.readMap(treeMap, getClass().getClassLoader());
            List arrayList = new ArrayList();
            this.codeModelNames = arrayList;
            parcel.readList(arrayList, getClass().getClassLoader());
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -15700115910165984L, null, parcel);
            }
            throw th;
        }
    }
}
