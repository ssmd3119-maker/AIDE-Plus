package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.widget.Toast;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.engine.Modification;
import com.aide.engine.service.IRefactoringListener;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.u;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = -1401858080030435915L, container = -1401858080030435915L, user = true)
/* loaded from: classes.dex */
public class RefactoringService {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -1843262927778643384L, container = -1401858080030435915L, user = true)
    class a extends IRefactoringListener.Sub {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @cy(clazz = -3937147665546404295L, container = -1401858080030435915L, user = true)
        /* renamed from: com.aide.ui.services.RefactoringService$a$a, reason: collision with other inner class name */
        class RunnableC0090a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 1677203012555499865L)
            final /* synthetic */ Map WB;

            @dy(field = -239380005667824956L)
            final /* synthetic */ String mb;

            static {
                iy.Zo(RunnableC0090a.class);
            }

            @ey(method = -377852335060867360L)
            public RunnableC0090a(Map map, String str) {
                this.WB = map;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -1541392253138727820L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(1084821237590194671L, this);
                    }
                    Map map = this.WB;
                    ArrayList arrayList = new ArrayList(map.keySet());
                    Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
                    a.this.sy(this.mb, arrayList, 0, map, new Hashtable());
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, 1084821237590194671L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -3937278752732137280L, container = -1401858080030435915L, user = true)
        class b implements ValueRunnable<String> {

            @fy
            private static /* synthetic */ boolean gn;

            @gy
            private static /* synthetic */ boolean u7;

            @dy(field = -456120081173511433L)
            final /* synthetic */ String DW;

            @dy(field = 701923387689241641L)
            final /* synthetic */ int FH;

            @dy(field = 1332885980355329152L)
            final /* synthetic */ List Hw;

            @dy(field = -2364276601409444064L)
            final /* synthetic */ Map Zo;

            @dy(field = 1049834703568991472L)
            final /* synthetic */ Hashtable j6;

            @dy(field = -2924559374956223968L)
            final /* synthetic */ String v5;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 7188725133048563832L)
            public b(Hashtable hashtable, String str, int i, List list, String str2, Map map) {
                this.j6 = hashtable;
                this.DW = str;
                this.FH = i;
                this.Hw = list;
                this.v5 = str2;
                this.Zo = map;
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 429728324462115000L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(String str) {
                try {
                    if (gn) {
                        iy.tp(7128175550827276800L, this, str);
                    }
                    this.j6.put(this.DW, str);
                    int i = this.FH + 1;
                    if (i < this.Hw.size()) {
                        a.this.sy(this.v5, this.Hw, i, this.Zo, this.j6);
                    } else {
                        ServiceContainer.getMainActivity().w9();
                        ServiceContainer.getEngineService().yS(this.v5, this.j6);
                    }
                } catch (Throwable th) {
                    if (u7) {
                        iy.j3(th, 7128175550827276800L, this, str);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -3937409839913806971L, container = -1401858080030435915L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -2883568995536327373L)
            final /* synthetic */ String WB;

            @dy(field = 1557861635194019625L)
            final /* synthetic */ String mb;

            @cy(clazz = 2661985348891020880L, container = -1401858080030435915L, user = true)
            /* renamed from: com.aide.ui.services.RefactoringService$a$c$a, reason: collision with other inner class name */
            class C0091a implements ValueRunnable<String> {

                @gy
                private static /* synthetic */ boolean DW;

                @fy
                private static /* synthetic */ boolean j6;

                static {
                    iy.Zo(C0091a.class);
                }

                @ey(method = -268755623345226808L)
                public C0091a(c cVar) {
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = 1336004436475751295L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(String str) {
                    try {
                        if (j6) {
                            iy.tp(-728993597096454739L, this, str);
                        }
                        ServiceContainer.getMainActivity().w9();
                        ServiceContainer.getEngineService().J8(str);
                    } catch (Throwable th) {
                        if (DW) {
                            iy.j3(th, -728993597096454739L, this, str);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(c.class);
            }

            @ey(method = -747535458000192153L)
            public c(a aVar, String str, String str2) {
                this.WB = str;
                this.mb = str2;
            }

            @Override // java.lang.Runnable
            @ey(method = -659094337682861868L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(1088152125538164360L, this);
                    }
                    ServiceContainer.getMainActivity().j3();
                    MessageBox.aM(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.dialog_rename_title, new Object[0]), ServiceContainer.KD(u.dialog_rename_message_for, this.WB), this.mb, new C0091a(this));
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1088152125538164360L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -3937540927091413368L, container = -1401858080030435915L, user = true)
        class d implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = -1354115318864466851L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 2871494047092750695L)
            public d(a aVar, String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = 2019226825112370624L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(1091483497678959139L, this);
                    }
                    ServiceContainer.getMainActivity().j3();
                    MessageBox.BT(ServiceContainer.getMainActivity(), "Refactor", this.WB);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 1091483497678959139L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -3937672014264956471L, container = -1401858080030435915L, user = true)
        class e implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2142046687207932099L)
            final /* synthetic */ List WB;

            static {
                iy.Zo(e.class);
            }

            @ey(method = -3094835863319906000L)
            public e(List list) {
                this.WB = list;
            }

            @Override // java.lang.Runnable
            @ey(method = 2298711208537732235L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(1094815354012579008L, this);
                    }
                    ServiceContainer.getMainActivity().j3();
                    RefactoringService.this.DW(this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1094815354012579008L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -3937803101434436280L, container = -1401858080030435915L, user = true)
        class f implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2021863173415006060L)
            final /* synthetic */ String WB;

            @dy(field = 4332563050715830931L)
            final /* synthetic */ List mb;

            static {
                iy.Zo(f.class);
            }

            @ey(method = -302398565009514441L)
            public f(a aVar, String str, List list) {
                this.WB = str;
                this.mb = list;
            }

            @Override // java.lang.Runnable
            @ey(method = 879167025931061248L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(1098147694539023967L, this);
                    }
                    AppPreferences.Sf(this.WB, this.mb);
                    ServiceContainer.getMainActivity().IS(2);
                    Toast.makeText(ServiceContainer.getContext(), "Code Style settings have been updated", 0).show();
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1098147694539023967L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 15984265184850784L)
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 327425250657977199L)
        public void sy(String str, List<String> list, int i, Map<String, String[]> map, Hashtable<String, String> hashtable) throws Throwable {
            try {
                if (fY) {
                    iy.J8(-6334106186303027253L, this, str, list, new Integer(i), map, hashtable);
                }
                ServiceContainer.getMainActivity().j3();
                String str2 = list.get(i);
                try {
                    MessageBox.VH(ServiceContainer.getMainActivity(), "Which '" + str2 + "' to import ?", Arrays.asList(map.get(str2)), new b(hashtable, str2, i, list, str, map));
                } catch (Throwable th) {
                    th = th;
                    if (qp) {
                        iy.lg(th, -6334106186303027253L, this, str, list, new Integer(i), map, hashtable);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.aide.engine.service.IRefactoringListener
        @ey(method = 2410758434146158000L)
        public void Bw(String str, List list) {
            try {
                if (fY) {
                    iy.EQ(8108049436606065800L, this, str, list);
                }
                ServiceContainer.aj(new f(this, str, list));
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, 8108049436606065800L, this, str, list);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IRefactoringListener
        @ey(method = -4060821599791763189L)
        public void cl(List list) {
            try {
                if (fY) {
                    iy.tp(3680365787739530089L, this, list);
                }
                ServiceContainer.aj(new e(list));
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 3680365787739530089L, this, list);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IRefactoringListener
        @ey(method = -5283219844683102465L)
        public void d5(String str, String str2) {
            try {
                if (fY) {
                    iy.EQ(-6616527445164681073L, this, str, str2);
                }
                ServiceContainer.aj(new c(this, str, str2));
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, -6616527445164681073L, this, str, str2);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IRefactoringListener
        @ey(method = 580538649519671304L)
        public void j2(String str) {
            try {
                if (fY) {
                    iy.tp(384104253852905952L, this, str);
                }
                ServiceContainer.aj(new d(this, str));
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 384104253852905952L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IRefactoringListener
        @ey(method = -2606433890603901493L)
        public void tn(String str, Map map) {
            try {
                if (fY) {
                    iy.EQ(-7074291593662496235L, this, str, map);
                }
                ServiceContainer.aj(new RunnableC0090a(map, str));
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, -7074291593662496235L, this, str, map);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1843347375838441935L, container = -1401858080030435915L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -1141087855104224515L)
        final /* synthetic */ List WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -4160344044536464012L)
        public b(List list) {
            this.WB = list;
        }

        @Override // java.lang.Runnable
        @ey(method = 1678521097545554337L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-330408303518875392L, this);
                }
                RefactoringService.this.FH(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -330408303518875392L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(RefactoringService.class);
    }

    @ey(method = 2173504365794248239L)
    public RefactoringService() {
        try {
            if (j6) {
                iy.gn(3074699047031413017L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3074699047031413017L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 52244996607952165L)
    public void FH(List<Modification> list) {
        EngineService engineService;
        try {
            if (j6) {
                iy.tp(8759941853249604240L, this, list);
            }
            try {
                ServiceContainer.getEngineService().kQ();
                boolean z = false;
                for (int i = 0; i < list.size(); i++) {
                    Modification modification = list.get(i);
                    int iTp = modification.tp();
                    if (iTp == 0) {
                        try {
                            ServiceContainer.getOpenFileService().openFile(modification.v5()).cb(modification.u7(), modification.gn(), modification.Hw(), modification.FH(), modification.VH(), modification.EQ(), modification.v5().equals(ServiceContainer.getOpenFileService().u7()));
                        } catch (IOException e) {
                            MessageBox.P8(ServiceContainer.getMainActivity(), "Modify Files", e);
                        }
                    } else if (iTp == 1) {
                        try {
                            String strV5 = modification.v5();
                            String str = FileSystem.getParent(strV5) + File.separator + modification.VH();
                            FileSystem.x9(strV5, str);
                            ServiceContainer.getOpenFileService().vy(strV5, str);
                            ServiceContainer.EQ().ef(FileSystem.getParent(strV5));
                            z = true;
                        } catch (IOException e2) {
                            MessageBox.P8(ServiceContainer.getMainActivity(), "Modify Files", e2);
                        }
                    } else if (iTp == 2) {
                        ServiceContainer.getEngineService().ef();
                        List<Modification> listV5 = ServiceContainer.getEngineService().v5(modification.v5(), modification.u7(), modification.Hw(), AppPreferences.sy());
                        if (listV5 != null) {
                            for (int size = listV5.size() - 1; size >= 0; size--) {
                                list.add(i + 1, listV5.get(size));
                            }
                        }
                        ServiceContainer.getEngineService().kQ();
                    } else if (iTp == 3) {
                        try {
                            ServiceContainer.getOpenFileService().openFile(modification.v5()).BT(modification.u7(), modification.gn(), modification.Hw(), modification.FH(), modification.DW(), modification.j6());
                        } catch (IOException e3) {
                            MessageBox.P8(ServiceContainer.getMainActivity(), "Modify Files", e3);
                        }
                    } else if (iTp == 7) {
                        try {
                            ServiceContainer.getOpenFileService().openFile(modification.v5()).ro(modification.u7(), modification.gn(), modification.Hw(), modification.FH(), modification.DW(), modification.j6());
                        } catch (IOException e4) {
                            MessageBox.P8(ServiceContainer.getMainActivity(), "Modify Files", e4);
                        }
                    } else if (iTp == 8) {
                        ServiceContainer.getMainActivity().FN(new FileSpan(modification.v5(), modification.u7(), modification.gn(), modification.Hw(), modification.FH()), false);
                    } else if (iTp == 11) {
                        try {
                            ServiceContainer.getOpenFileService().openFile(modification.v5()).Hw(modification.u7(), modification.Zo());
                        } catch (IOException e5) {
                            MessageBox.P8(ServiceContainer.getMainActivity(), "Modify Files", e5);
                        }
                    } else if (iTp == 12) {
                        try {
                            FileSystem.g3(FileSystem.getParent(modification.v5()));
                            FileSystem.v5(modification.v5(), modification.VH());
                            ServiceContainer.getOpenFileService().openFile(modification.v5());
                        } catch (IOException e6) {
                            MessageBox.P8(ServiceContainer.getMainActivity(), "Modify Files", e6);
                        }
                    }
                }
                try {
                    ServiceContainer.getOpenFileService().ro();
                } catch (IOException e7) {
                    MessageBox.P8(ServiceContainer.getMainActivity(), "Modify Files", e7);
                }
                if (z) {
                    ServiceContainer.getProjectService().wc();
                    ServiceContainer.getFileBrowserService().v5();
                }
                ServiceContainer.getEngineService().ei();
                engineService = ServiceContainer.getEngineService();
            } catch (Throwable th) {
                try {
                    AppLog.j6(th);
                    engineService = ServiceContainer.getEngineService();
                } catch (Throwable th2) {
                    ServiceContainer.getEngineService().ef();
                    throw th2;
                }
            }
            engineService.ef();
        } catch (Throwable th3) {
            if (DW) {
                iy.j3(th3, 8759941853249604240L, this, list);
            }
            throw th3;
        }
    }

    @ey(method = 1689997347854943552L)
    public void DW(List<Modification> list) {
        try {
            if (j6) {
                iy.tp(-4627938854537139501L, this, list);
            }
            ServiceContainer.getMainActivity().j3();
            if (list == null) {
                return;
            }
            HashSet hashSet = new HashSet();
            boolean z = false;
            for (Modification modification : list) {
                int iTp = modification.tp();
                if (iTp == 0 || iTp == 3 || iTp == 7 || iTp == 11 || iTp == 12) {
                    hashSet.add(modification.v5());
                    if (!modification.v5().equals(ServiceContainer.getOpenFileService().u7())) {
                        z = true;
                    }
                }
            }
            if (!z) {
                FH(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(FileSystem.getName((String) it.next()));
            }
            MessageBox.lg(ServiceContainer.getMainActivity(), u.dialog_modify_title, u.dialog_modify_message, arrayList, new b(list), null);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4627938854537139501L, this, list);
            }
            throw th;
        }
    }

    @ey(method = 3107926297768438683L)
    public void Hw() {
        try {
            if (j6) {
                iy.gn(-3705311679461573176L, this);
            }
            ServiceContainer.getEngineService().sy(new a());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3705311679461573176L, this);
            }
            throw th;
        }
    }
}
