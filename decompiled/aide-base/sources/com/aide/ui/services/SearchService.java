package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.widget.Toast;
import com.aide.common.AIDEHelpActivityStarter;
import com.aide.engine.FindResult;
import com.aide.engine.SourceEntity;
import com.aide.engine.service.INavigationListener;
import com.aide.engine.service.IUsageSearcherListener;
import com.aide.ui.ServiceContainer;
import com.aide.ui.util.FileSpan;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -401236586759554245L, container = -401236586759554245L, user = true)
/* loaded from: classes.dex */
public class SearchService {

    @gy
    private static /* synthetic */ boolean J0;

    @fy
    private static /* synthetic */ boolean we;

    @dy(field = -3929665307059597609L)
    private boolean DW;

    @dy(field = -3413761660257400071L)
    private d EQ;

    @dy(field = 2983126752894608768L)
    private boolean FH;

    @dy(field = -2699332450921890160L)
    private boolean Hw;

    @dy(field = -1686215764559727121L)
    private int VH;

    @dy(field = 947675270592004360L)
    private String Zo;

    @dy(field = 4249362788529679787L)
    private int gn;

    @dy(field = -1074014339816821968L)
    private List<FindResult> j6;

    @dy(field = 3668638987906411680L)
    private int tp;

    @dy(field = 727527645743019660L)
    private int u7;

    @dy(field = -1351764914835114384L)
    private boolean v5;

    @cy(clazz = 734512739559549760L, container = -401236586759554245L, user = true)
    class a extends IUsageSearcherListener.Sub {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 22556427339833825L)
        public a() {
        }

        @Override // com.aide.engine.service.IUsageSearcherListener
        @ey(method = 558561059612356285L)
        public void Cz() {
            try {
                if (fY) {
                    iy.gn(-1384285799974031136L, this);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -1384285799974031136L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IUsageSearcherListener
        @ey(method = -7194704036833799856L)
        public void ce(List list) {
            try {
                if (fY) {
                    iy.tp(4586329287168792899L, this, list);
                }
                SearchService.this.DW = false;
                SearchService.this.j6 = list;
                SearchService.this.QX();
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 4586329287168792899L, this, list);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IUsageSearcherListener
        @ey(method = -4504921885972580007L)
        public void hz(String str) {
            try {
                if (fY) {
                    iy.tp(-263397874878363728L, this, str);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -263397874878363728L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 734537118833445603L, container = -401236586759554245L, user = true)
    class b extends INavigationListener.Sub {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @cy(clazz = 261301897325065700L, container = -401236586759554245L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean k2;

            @gy
            private static /* synthetic */ boolean zh;

            @dy(field = -476689498592868171L)
            final /* synthetic */ SourceEntity WB;

            @dy(field = -4080708779860925532L)
            final /* synthetic */ int fY;

            @dy(field = 1137027552600069424L)
            final /* synthetic */ int jw;

            @dy(field = 306994270957850775L)
            final /* synthetic */ String mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -2519849461259803395L)
            public a(SourceEntity sourceEntity, String str, int i, int i2) {
                this.WB = sourceEntity;
                this.mb = str;
                this.jw = i;
                this.fY = i2;
            }

            @Override // java.lang.Runnable
            @ey(method = 2583730432165164029L)
            public void run() {
                try {
                    if (k2) {
                        iy.gn(3937505682889801296L, this);
                    }
                    ServiceContainer.getMainActivity().j3();
                    if (SearchService.this.FH) {
                        String strWs = this.WB.Ws();
                        ServiceContainer.getMainActivity().sh().Eq();
                        AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), strWs, com.aide.ui.activities.a.v5().toString());
                        return;
                    }
                    if (!SearchService.this.Hw && !this.WB.rN() && this.WB.u7() != null) {
                        ServiceContainer.getNavigateService().VH(new FileSpan(this.mb, SearchService.this.VH, SearchService.this.gn, SearchService.this.u7, SearchService.this.tp));
                        ServiceContainer.getMainActivity().aq(new FileSpan(this.WB.u7(), this.WB.XL(), this.WB.aM(), this.WB.XL(), this.WB.QX()));
                        return;
                    }
                    SearchService.this.er();
                    ServiceContainer.getEngineService().vJ(this.mb, this.jw, this.fY, SearchService.this.v5);
                } catch (Throwable th) {
                    if (zh) {
                        iy.aM(th, 3937505682889801296L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 261308709286701219L, container = -401236586759554245L, user = true)
        /* renamed from: com.aide.ui.services.SearchService$b$b, reason: collision with other inner class name */
        class RunnableC0092b implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 4514735904538449720L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(RunnableC0092b.class);
            }

            @ey(method = -97714316439801393L)
            public RunnableC0092b(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = 1323919716449883600L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(3940962073233995015L, this);
                    }
                    ServiceContainer.getMainActivity().j3();
                    if (!SearchService.this.FH) {
                        if (SearchService.this.Zo != null) {
                            SearchService.this.U2(SearchService.this.Zo);
                            return;
                        } else {
                            Toast.makeText(ServiceContainer.getMainActivity(), "The selected code can not be identified", 0).show();
                            return;
                        }
                    }
                    if (this.WB.toLowerCase().endsWith(".js")) {
                        ServiceContainer.getMainActivity().sh().Eq();
                        AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), null, com.aide.ui.activities.a.PHONEGAP_API.toString());
                    } else {
                        ServiceContainer.getMainActivity().sh().Eq();
                        AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), null, com.aide.ui.activities.a.v5().toString());
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 3940962073233995015L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = 323992431885811087L)
        public b() {
        }

        @Override // com.aide.engine.service.INavigationListener
        @ey(method = -259520904408550301L)
        public void FN(String str, long j, int i, int i2, SourceEntity sourceEntity) {
            try {
                if (fY) {
                    iy.J8(-676943212371502384L, this, str, new Long(j), new Integer(i), new Integer(i2), sourceEntity);
                }
                ServiceContainer.aj(new a(sourceEntity, str, i, i2));
            } catch (Throwable th) {
                if (qp) {
                    iy.lg(th, -676943212371502384L, this, str, new Long(j), new Integer(i), new Integer(i2), sourceEntity);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.INavigationListener
        @ey(method = -260283126860098132L)
        public void ct(String str, long j, int i, int i2) {
            try {
                if (fY) {
                    iy.J0(-5290269232867291451L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                ServiceContainer.aj(new RunnableC0092b(str));
            } catch (Throwable th) {
                if (qp) {
                    iy.a8(th, -5290269232867291451L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 734561498111404740L, container = -401236586759554245L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 445748313577674740L)
        public c() {
        }

        @Override // java.lang.Runnable
        @ey(method = 244530054151070079L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(644979709064516700L, this);
                }
                if (SearchService.this.EQ != null) {
                    SearchService.this.EQ.j6();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 644979709064516700L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 577176079209589641L, container = 577176079209589641L, user = true)
    public interface d {
        @ey(method = 978801367642228288L)
        void j6();
    }

    static {
        iy.Zo(SearchService.class);
    }

    @ey(method = -2104508201414093640L)
    public SearchService() {
        try {
            if (we) {
                iy.gn(943162524528792723L, null);
            }
            this.j6 = new ArrayList();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 943162524528792723L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -665385804484466045L)
    public void QX() {
        try {
            if (we) {
                iy.gn(602290304690186899L, this);
            }
            ServiceContainer.aj(new c());
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 602290304690186899L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3893593419164041488L)
    public void er() {
        try {
            if (we) {
                iy.gn(-2023513627252101024L, this);
            }
            this.DW = true;
            QX();
            ServiceContainer.getMainActivity().hK();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2023513627252101024L, this);
            }
            throw th;
        }
    }

    @ey(method = 3712063703949270008L)
    private void rN(String str, int i, int i2, int i3, int i4, String str2, boolean z, boolean z2, boolean z3) {
        try {
            if (we) {
                iy.QX(1358185863777172344L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            }
            this.FH = z2;
            this.Hw = z;
            this.v5 = z3;
            this.VH = i;
            this.gn = i2;
            this.u7 = i3;
            this.tp = i4;
            this.Zo = (str2 == null || str2.length() < 3) ? null : str2;
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().cn(str, i, i2);
        } catch (Throwable th) {
            if (J0) {
                iy.rN(th, 1358185863777172344L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            }
            throw th;
        }
    }

    @ey(method = -46033162193218680L)
    public void J8(String str, int i, int i2, int i3, int i4) {
        try {
            if (we) {
                iy.J8(5506611013244720784L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            rN(str, i, i2, i3, i4, null, true, false, true);
        } catch (Throwable th) {
            if (J0) {
                iy.lg(th, 5506611013244720784L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 3025318450854182028L)
    public boolean Mr() {
        try {
            if (we) {
                iy.gn(-2757678240363661664L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2757678240363661664L, this);
            }
            throw th;
        }
    }

    @ey(method = -44206888589462475L)
    public void U2(String str) {
        try {
            if (we) {
                iy.tp(-4706379728078244075L, this, str);
            }
            er();
            ServiceContainer.getEngineService().Sf(str);
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, -4706379728078244075L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1000090675711606621L)
    public void Ws(String str, int i, int i2, int i3, int i4) {
        try {
            if (we) {
                iy.J8(2215858010610177441L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            rN(str, i, i2, i3, i4, null, true, false, false);
        } catch (Throwable th) {
            if (J0) {
                iy.lg(th, 2215858010610177441L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -5680515551968317387L)
    public List<FindResult> XL() {
        try {
            if (we) {
                iy.gn(1631899450615509L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 1631899450615509L, this);
            }
            throw th;
        }
    }

    @ey(method = 4721012128103982553L)
    public void a8(d dVar) {
        try {
            if (we) {
                iy.tp(-1037406692596609511L, this, dVar);
            }
            this.EQ = dVar;
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, -1037406692596609511L, this, dVar);
            }
            throw th;
        }
    }

    @ey(method = -2873371885625484000L)
    public void aM(String str, int i, int i2, int i3, int i4, String str2) throws Throwable {
        int i5;
        try {
            if (we) {
                iy.QX(-2618739448797595976L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2});
            }
            i5 = 6;
            try {
                rN(str, i, i2, i3, i4, str2, false, false, true);
            } catch (Throwable th) {
                th = th;
                if (J0) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = str;
                    objArr[1] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = new Integer(i3);
                    objArr[4] = new Integer(i4);
                    objArr[5] = str2;
                    iy.rN(th, -2618739448797595976L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    @ey(method = -2344868191897008512L)
    public void j3() {
        try {
            if (we) {
                iy.gn(-2526652222906125328L, this);
            }
            ServiceContainer.getEngineService().setUsageSearcherListener(new a());
            ServiceContainer.getEngineService().setNavigationListener(new b());
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2526652222906125328L, this);
            }
            throw th;
        }
    }

    @ey(method = 971427376947084080L)
    public void lg(String str, int i, int i2, int i3, int i4) {
        try {
            if (we) {
                iy.J8(4268466649707687900L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            rN(str, i, i2, i3, i4, null, false, true, true);
        } catch (Throwable th) {
            if (J0) {
                iy.lg(th, 4268466649707687900L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }
}
