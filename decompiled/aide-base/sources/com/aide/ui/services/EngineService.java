package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;
import com.aide.common.AppLog;
import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.Modification;
import com.aide.engine.SourceEntity;
import com.aide.engine.SyntaxError;
import com.aide.engine.service.CodeAnalysisEngineService;
import com.aide.engine.service.IBuildListener;
import com.aide.engine.service.ICodeAnalysisEngineService;
import com.aide.engine.service.ICodeCompletionListener;
import com.aide.engine.service.IEngineErrorListener;
import com.aide.engine.service.IEngineListener;
import com.aide.engine.service.IGotoSymbolListener;
import com.aide.engine.service.IHighlightingListener;
import com.aide.engine.service.INavigationListener;
import com.aide.engine.service.IOpenFileInterface;
import com.aide.engine.service.IRefactoringListener;
import com.aide.engine.service.IUsageSearcherListener;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@cy(clazz = 945912228584590911L, container = 945912228584590911L, user = true)
/* loaded from: classes.dex */
public class EngineService {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -2465910012952102448L)
    private AtomicInteger DW;

    @dy(field = 4923425023365215380L)
    private boolean FH;

    @dy(field = 2900777154736796547L)
    private ICodeAnalysisEngineService mCodeAnalysisEngineService;

    @dy(field = 921414314714477177L)
    private ServiceConnection mServiceConnection;

    @cy(clazz = 242572303621551248L, container = 945912228584590911L, user = true)
    class EngineServiceConnection implements ServiceConnection {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(EngineServiceConnection.class);
        }

        @ey(method = -163197154584938688L)
        public EngineServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        @ey(method = 100629067069826283L)
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (mb) {
                    iy.EQ(4845300111119411456L, this, componentName, iBinder);
                }
                AppLog.VH("Engine service connected to UI");
                EngineService.this.mCodeAnalysisEngineService = ICodeAnalysisEngineService.Sub.asInterface(iBinder);
                EngineService.this.Mr();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 4845300111119411456L, this, componentName, iBinder);
                }
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        @ey(method = -1201428974069412375L)
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                if (mb) {
                    iy.tp(2896178765559868836L, this, componentName);
                }
                AppLog.VH("Engine service disconnected from UI");
                EngineService.this.mCodeAnalysisEngineService = null;
                if (EngineService.this.FH) {
                    return;
                }
                AppLog.VH("Trying to restart engine service");
                EngineService.this.bindCodeAnalysisEngineService();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 2896178765559868836L, this, componentName);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 242705149014950127L, container = 945912228584590911L, user = true)
    class b extends IEngineListener.Sub {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @cy(clazz = -1170015077243481540L, container = 945912228584590911L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 34892104875112953L)
            public a(b bVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = 751540863361688241L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-7082181102013752180L, this);
                    }
                    if (ServiceContainer.getContext() != null) {
                        Toast.makeText(ServiceContainer.getContext(), "Out-of-memory exception in code analysis process. Make sure your VM heap size is high enough.", 1).show();
                    }
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -7082181102013752180L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1170145788195472457L, container = 945912228584590911L, user = true)
        /* renamed from: com.aide.ui.services.EngineService$b$b, reason: collision with other inner class name */
        class RunnableC0089b implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(RunnableC0089b.class);
            }

            @ey(method = -98014682524377960L)
            public RunnableC0089b(b bVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = -2399365122901230176L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-7079685511484964635L, this);
                    }
                    if (ServiceContainer.getContext() != null) {
                        Toast.makeText(ServiceContainer.getContext(), "Internal exception in the code analysis process.", 0).show();
                    }
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -7079685511484964635L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = -75611920015233475L)
        public b(EngineService engineService) {
        }

        @Override // com.aide.engine.service.IEngineListener
        @ey(method = 6332967860696733975L)
        public void oa() {
            try {
                if (jw) {
                    iy.gn(-9593753416425472L, this);
                }
                ServiceContainer.aj(new a(this));
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -9593753416425472L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IEngineListener
        @ey(method = -4045037877683323485L)
        public void rJ() {
            try {
                if (jw) {
                    iy.gn(-620597905322700696L, this);
                }
                ServiceContainer.aj(new RunnableC0089b(this));
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -620597905322700696L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(EngineService.class);
    }

    @ey(method = -3186187129025815944L)
    public EngineService() {
        try {
            if (v5) {
                iy.gn(-2889609699270121015L, null);
            }
            this.DW = new AtomicInteger();
            this.FH = false;
            this.mServiceConnection = new EngineServiceConnection();
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2889609699270121015L, null);
            }
            throw th;
        }
    }

    @ey(method = -1419098051054067504L)
    public void BT(String str, int i, int i2, SourceEntity sourceEntity) {
        try {
            if (v5) {
                iy.J0(165214498690615556L, this, str, new Integer(i), new Integer(i2), sourceEntity);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.om(str, i, i2, sourceEntity);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 165214498690615556L, this, str, new Integer(i), new Integer(i2), sourceEntity);
            }
            throw th;
        }
    }

    @ey(method = -5120905262284160L)
    public void EQ() {
        try {
            if (v5) {
                iy.gn(2673465293503381264L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.TE(AppPreferences.cn(), AppPreferences.ro(), AppPreferences.er(), AppPreferences.Zo());
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 2673465293503381264L, this);
            }
            throw th;
        }
    }

    @ey(method = -185273917648456329L)
    public void FH(String str, SourceEntity sourceEntity) {
        try {
            if (v5) {
                iy.EQ(-373104628447118131L, this, str, sourceEntity);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.yw(str, sourceEntity);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -373104628447118131L, this, str, sourceEntity);
            }
            throw th;
        }
    }

    @ey(method = -3993508484595296017L)
    public void Hw(String str, int i, int i2, int i3) {
        try {
            if (v5) {
                iy.J0(1978293221733412125L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.mF(str, i, i2, i3);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 1978293221733412125L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3636158551838263807L)
    public void I(IEngineErrorListener iEngineErrorListener) {
        try {
            if (v5) {
                iy.tp(5057885969886342915L, this, iEngineErrorListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.N7(iEngineErrorListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 5057885969886342915L, this, iEngineErrorListener);
            }
            throw th;
        }
    }

    @ey(method = 51708905915940855L)
    public void J0(String str, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(-6434134055442451575L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.k1(str, i, i2, i3, i4);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -6434134055442451575L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 742642594517851405L)
    public void J8(String str) {
        try {
            if (v5) {
                iy.tp(677026833616646883L, this, str);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.Jt(str);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 677026833616646883L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1358676907063896253L)
    public void KD(String str, int i, int i2) {
        try {
            if (v5) {
                iy.we(1565777630700368895L, this, str, new Integer(i), new Integer(i2));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.lU(str, i, i2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 1565777630700368895L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1847925629247876456L)
    public void Mr() {
        try {
            if (v5) {
                iy.gn(-2187018612076732720L, this);
            }
            try {
                if (!ServiceContainer.isTrainerMode()) {
                    String str = FileSystem.tp() + "/enginecache";
                    if (!new File(str).isDirectory()) {
                        new File(str).mkdirs();
                    }
                    this.mCodeAnalysisEngineService.jn(str, 100000000);
                }
                this.mCodeAnalysisEngineService.setEngineListener(new b(this));
                EQ();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
            ServiceContainer.J0().ef();
            ServiceContainer.getOpenFileService().J0();
            ServiceContainer.getProjectService().dx();
            ServiceContainer.Zo().u7();
            ServiceContainer.ei().Hw();
            ServiceContainer.SI().j3();
            ei();
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2187018612076732720L, this);
            }
            throw th;
        }
    }

    @ey(method = 220112546096900347L)
    public void Mz(ICodeCompletionListener iCodeCompletionListener) {
        try {
            if (v5) {
                iy.tp(97246375857820269L, this, iCodeCompletionListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.setCodeCompletionListener(iCodeCompletionListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 97246375857820269L, this, iCodeCompletionListener);
            }
            throw th;
        }
    }

    @ey(method = 5937654618880843116L)
    public void OW() {
        try {
            if (v5) {
                iy.gn(1215539290691653608L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.et();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 1215539290691653608L, this);
            }
            throw th;
        }
    }

    @ey(method = -1563341964916625481L)
    public void P8() {
        try {
            if (v5) {
                iy.gn(-1932449501015560863L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.sI();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1932449501015560863L, this);
            }
            throw th;
        }
    }

    @ey(method = 2040192125294654808L)
    public void QX(String str, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(-1287078261771820144L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.yu(str, i, i2, i3, i4);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -1287078261771820144L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -2848683426474644416L)
    public void SI(String str, String str2) {
        try {
            if (v5) {
                iy.EQ(4018431304692390144L, this, str, str2);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.wa(str, str2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 4018431304692390144L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 4241741101995158804L)
    public void Sf(String str) {
        try {
            if (v5) {
                iy.tp(1874933750305263920L, this, str);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.ky(str);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 1874933750305263920L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6030445455306653892L)
    public void U2(String str, int i, int i2) {
        try {
            if (v5) {
                iy.we(-90918019728993360L, this, str, new Integer(i), new Integer(i2));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.oK(str, i, i2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -90918019728993360L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1879543710784695384L)
    public List<Modification> VH(String str, int i, int i2, int i3) {
        try {
            if (v5) {
                iy.J0(1498304393461714084L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return null;
                }
                return this.mCodeAnalysisEngineService.be(str, i, i2, i3);
            } catch (RemoteException e) {
                AppLog.v5(e);
                return null;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 1498304393461714084L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1116768423509287475L)
    public void Ws(String str, int i, int i2, int i3, int i4, String str2, String str3) throws Throwable {
        int i5;
        try {
            if (v5) {
                iy.QX(-3635546736112997043L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2, str3});
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                i5 = 7;
                try {
                    try {
                        this.mCodeAnalysisEngineService.w1(str, i, i2, i3, i4, str2, str3);
                    } catch (RemoteException e) {
                        e = e;
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (Zo) {
                        Object[] objArr = new Object[i5];
                        objArr[0] = str;
                        objArr[1] = new Integer(i);
                        objArr[2] = new Integer(i2);
                        objArr[3] = new Integer(i3);
                        objArr[4] = new Integer(i4);
                        objArr[5] = str2;
                        objArr[6] = str3;
                        iy.rN(th, -3635546736112997043L, this, objArr);
                    }
                    throw th;
                }
            } catch (RemoteException e2) {
                e = e2;
                i5 = 7;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 7;
        }
    }

    @ey(method = -5860638359824914389L)
    public void XG(String str, int i, int i2) {
        try {
            if (v5) {
                iy.we(3509149746801593445L, this, str, new Integer(i), new Integer(i2));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.uC(str, i, i2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 3509149746801593445L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -619718995920421920L)
    public void XL(String str, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(-1913658361058826392L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.Vq(str, i, i2, i3, i4);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -1913658361058826392L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1125772142454894800L)
    public void XX(String str, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(878992217777067784L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.dP(str, i, i2, i3, i4);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 878992217777067784L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 3098032473958149552L)
    public List<Modification> Zo(String str, int i, int i2, char c, int i3) {
        try {
            if (v5) {
                iy.J8(-5039162707597320852L, this, str, new Integer(i), new Integer(i2), new Character(c), new Integer(i3));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return null;
                }
                return this.mCodeAnalysisEngineService.mn(str, i, i2, c, i3);
            } catch (RemoteException e) {
                AppLog.v5(e);
                return null;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -5039162707597320852L, this, str, new Integer(i), new Integer(i2), new Character(c), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2445361669403182563L)
    public void a8(String str, int i, int i2) {
        try {
            if (v5) {
                iy.we(-1039591735739212869L, this, str, new Integer(i), new Integer(i2));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.Dt(str, i, i2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -1039591735739212869L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -330354236761209700L)
    public void aM(String str, String str2, int i, int i2, int i3, int i4) throws Throwable {
        int i5 = 5;
        try {
            if (v5) {
                iy.QX(4302949710757659752L, this, new Object[]{str, str2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                    if (Zo) {
                        Object[] objArr = new Object[i5];
                        objArr[0] = str;
                        objArr[1] = str2;
                        objArr[2] = new Integer(i);
                        objArr[3] = new Integer(i2);
                        objArr[4] = new Integer(i3);
                        objArr[5] = new Integer(i4);
                        iy.rN(th, 4302949710757659752L, this, objArr);
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                e = e;
                i5 = 6;
            }
            if (this.mCodeAnalysisEngineService == null) {
                return;
            }
            i5 = 6;
            try {
                this.mCodeAnalysisEngineService.Lq(str, str2, i, i2, i3, i4);
            } catch (RemoteException e2) {
                e = e2;
                AppLog.v5(e);
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    @ey(method = -2529832442425448552L)
    public void bindCodeAnalysisEngineService() {
        try {
            if (v5) {
                iy.gn(-4126850189537284160L, this);
            }
            if (ServiceContainer.getContext().bindService(new Intent(ServiceContainer.getContext(), (Class<?>) CodeAnalysisEngineService.class), this.mServiceConnection, 1)) {
                return;
            }
            AppLog.DW("Could not bind to engine service");
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -4126850189537284160L, this);
            }
            throw th;
        }
    }

    @ey(method = 3872100277423767760L)
    public void br() {
        try {
            if (v5) {
                iy.gn(-450961455783131784L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.ez();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -450961455783131784L, this);
            }
            throw th;
        }
    }

    @ey(method = -253624194770949728L)
    public void ca(IGotoSymbolListener iGotoSymbolListener) {
        try {
            if (v5) {
                iy.tp(-2509393134368431044L, this, iGotoSymbolListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.setGotoSymbolListener(iGotoSymbolListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -2509393134368431044L, this, iGotoSymbolListener);
            }
            throw th;
        }
    }

    @ey(method = 1140763576626220923L)
    public void cb(String str, int i) {
        try {
            if (v5) {
                iy.EQ(-3894463247622964335L, this, str, new Integer(i));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.QD(str, i);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -3894463247622964335L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4867855803425595485L)
    public void cn(String str, int i, int i2) {
        try {
            if (v5) {
                iy.we(-1507012311097261785L, this, str, new Integer(i), new Integer(i2));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.iQ(str, i, i2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -1507012311097261785L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 2502656920535443645L)
    public int dx(String str, String str2) {
        try {
            if (v5) {
                iy.EQ(1554346337265252075L, this, str, str2);
            }
            int iIncrementAndGet = this.DW.incrementAndGet();
            try {
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
            if (this.mCodeAnalysisEngineService == null) {
                return -1;
            }
            this.mCodeAnalysisEngineService.C5(str, str2, iIncrementAndGet);
            return iIncrementAndGet;
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 1554346337265252075L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2362662823881342535L)
    public void ef() {
        try {
            if (v5) {
                iy.gn(-1476487240852941581L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.XL();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1476487240852941581L, this);
            }
            throw th;
        }
    }

    @ey(method = -1531752964802879517L)
    public void ei() {
        try {
            if (v5) {
                iy.gn(-1902951025446395703L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.Xz();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1902951025446395703L, this);
            }
            throw th;
        }
    }

    @ey(method = 2997358465508498720L)
    public void er(EngineSolution engineSolution) {
        try {
            if (v5) {
                iy.tp(-84901521218320012L, this, engineSolution);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.setEngineSolution(engineSolution);
                Iterator<EngineSolutionProject> it = engineSolution.engineSolutionProjects.iterator();
                while (it.hasNext()) {
                    this.mCodeAnalysisEngineService.addEngineSolutionProject(it.next());
                }
                this.mCodeAnalysisEngineService.updateEngineSolution();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -84901521218320012L, this, engineSolution);
            }
            throw th;
        }
    }

    @ey(method = 2694202985770821252L)
    public void g3(IBuildListener iBuildListener) {
        try {
            if (v5) {
                iy.tp(3724049930498843472L, this, iBuildListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.hp(iBuildListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 3724049930498843472L, this, iBuildListener);
            }
            throw th;
        }
    }

    @ey(method = 2477679977661171968L)
    public void gW(String str, int i, int i2) {
        try {
            if (v5) {
                iy.we(-1217916193898048400L, this, str, new Integer(i), new Integer(i2));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.Wv(str, i, i2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -1217916193898048400L, this, str, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -6255925113195223819L)
    public List<Modification> gn(String str, int i, int i2, int i3) {
        try {
            if (v5) {
                iy.J0(-1937806746754411161L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return null;
                }
                return this.mCodeAnalysisEngineService.WD(str, i, i2, i3);
            } catch (RemoteException e) {
                AppLog.v5(e);
                return null;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, -1937806746754411161L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 5159495252092734660L)
    public void j3(SyntaxError syntaxError, int i) {
        try {
            if (v5) {
                iy.EQ(-4890919999282170648L, this, syntaxError, new Integer(i));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.Ss(syntaxError, i);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -4890919999282170648L, this, syntaxError, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5276975083399039395L)
    public void jJ() {
        try {
            if (v5) {
                iy.gn(3089477892616786319L, this);
            }
            try {
                ServiceContainer.getContext().unbindService(this.mServiceConnection);
            } catch (Exception e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 3089477892616786319L, this);
            }
            throw th;
        }
    }

    @ey(method = -2832410130216571232L)
    public void kQ() {
        try {
            if (v5) {
                iy.gn(-3021058225767730848L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.VD();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -3021058225767730848L, this);
            }
            throw th;
        }
    }

    @ey(method = 4214580705955838749L)
    public void lg(String str, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(-1038646530768034837L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.kw(str, i, i2, i3, i4);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -1038646530768034837L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -727333190260704000L)
    public void lp() {
        try {
            if (v5) {
                iy.gn(-1071402750037683696L, this);
            }
            try {
                this.FH = true;
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.shutdown();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1071402750037683696L, this);
            }
            throw th;
        }
    }

    @ey(method = 80309539807371384L)
    public void nw(String str, IOpenFileInterface iOpenFileInterface) {
        try {
            if (v5) {
                iy.EQ(4061903783763424356L, this, str, iOpenFileInterface);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.jA(str, iOpenFileInterface);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 4061903783763424356L, this, str, iOpenFileInterface);
            }
            throw th;
        }
    }

    @ey(method = -391894682510869917L)
    public void rN(String str, int i) {
        try {
            if (v5) {
                iy.EQ(36864585720769365L, this, str, new Integer(i));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.IM(str, i);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 36864585720769365L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -430399518806005264L)
    public void ro(SourceEntity sourceEntity) {
        try {
            if (v5) {
                iy.tp(3086015795825753340L, this, sourceEntity);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.pQ(sourceEntity);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 3086015795825753340L, this, sourceEntity);
            }
            throw th;
        }
    }

    @ey(method = -294107439403033788L)
    public void sG(String str, String str2) {
        try {
            if (v5) {
                iy.EQ(-1470195850788295424L, this, str, str2);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.lj(str, str2);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -1470195850788295424L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -463661905900792104L)
    public void setNavigationListener(INavigationListener iNavigationListener) {
        try {
            if (v5) {
                iy.tp(-302269135069418820L, this, iNavigationListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.setNavigationListener(iNavigationListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -302269135069418820L, this, iNavigationListener);
            }
            throw th;
        }
    }

    @ey(method = 1628999825186784960L)
    public void setUsageSearcherListener(IUsageSearcherListener iUsageSearcherListener) {
        try {
            if (v5) {
                iy.tp(-1343184934430353920L, this, iUsageSearcherListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.setUsageSearcherListener(iUsageSearcherListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -1343184934430353920L, this, iUsageSearcherListener);
            }
            throw th;
        }
    }

    @ey(method = -1503484438554056763L)
    public void sh(String str, int i) {
        try {
            if (v5) {
                iy.EQ(-1129603944251423697L, this, str, new Integer(i));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.wT(str, i);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -1129603944251423697L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 621133168654013003L)
    public void sy(IRefactoringListener iRefactoringListener) {
        try {
            if (v5) {
                iy.tp(-51381755213812859L, this, iRefactoringListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.df(iRefactoringListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -51381755213812859L, this, iRefactoringListener);
            }
            throw th;
        }
    }

    @ey(method = 1062712223251806368L)
    public void tp() {
        try {
            if (v5) {
                iy.gn(-894912101447093268L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.BT();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -894912101447093268L, this);
            }
            throw th;
        }
    }

    @ey(method = -541835038857424964L)
    public List<Modification> v5(String str, int i, int i2, int i3) {
        try {
            if (v5) {
                iy.J0(5498010272936997768L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return null;
                }
                return this.mCodeAnalysisEngineService.s2(str, i, i2, i3);
            } catch (RemoteException e) {
                AppLog.v5(e);
                return null;
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 5498010272936997768L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 4450475747912824713L)
    public void vJ(String str, int i, int i2, boolean z) {
        try {
            if (v5) {
                iy.J0(-1326232286074350817L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.w2(str, i, i2, z);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, -1326232286074350817L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 150570405883246545L)
    public void vy() {
        try {
            if (v5) {
                iy.gn(-445986508772519585L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.QW();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -445986508772519585L, this);
            }
            throw th;
        }
    }

    @ey(method = -319428455446004020L)
    public void wc(String str) {
        try {
            if (v5) {
                iy.tp(5108664341451681144L, this, str);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.W(str);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 5108664341451681144L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6592417048389308288L)
    public void we(String str, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(2803593601728755776L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.HG(str, i, i2, i3, i4);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 2803593601728755776L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 2098130582905483308L)
    public void x9(IHighlightingListener iHighlightingListener) {
        try {
            if (v5) {
                iy.tp(-1003405850660352528L, this, iHighlightingListener);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.RW(iHighlightingListener);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -1003405850660352528L, this, iHighlightingListener);
            }
            throw th;
        }
    }

    @ey(method = -8866543385005465455L)
    public void yO() {
        try {
            if (v5) {
                iy.gn(-50441102366823925L, this);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.fm();
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -50441102366823925L, this);
            }
            throw th;
        }
    }

    @ey(method = -243746913527599804L)
    public void yS(String str, Hashtable<String, String> hashtable) {
        try {
            if (v5) {
                iy.EQ(-5967667835536470440L, this, str, hashtable);
            }
            try {
                if (this.mCodeAnalysisEngineService == null) {
                    return;
                }
                this.mCodeAnalysisEngineService.bp(str, hashtable);
            } catch (RemoteException e) {
                AppLog.v5(e);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -5967667835536470440L, this, str, hashtable);
            }
            throw th;
        }
    }
}
