package com.aide.ui.services;

import abcd.bu;
import abcd.cu;
import abcd.cy;
import abcd.dy;
import abcd.eu;
import abcd.ey;
import abcd.fu;
import abcd.fy;
import abcd.gu;
import abcd.gy;
import abcd.id;
import abcd.iy;
import abcd.qt;
import abcd.vt;
import android.content.SharedPreferences;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.common.StreamUtilities;
import com.aide.ui.AppPreferences;
import com.aide.ui.MainActivity;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.util.FileSystem;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.InterruptibleChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 4379885248179836745L, container = 4379885248179836745L, user = true)
/* loaded from: classes.dex */
public class DropboxService {

    @dy(field = 3655427055084246708L)
    private static final gu.a a8;

    @fy
    private static /* synthetic */ boolean lg;

    @gy
    private static /* synthetic */ boolean rN;

    @dy(field = -4785800420267748L)
    private boolean DW;

    @dy(field = 3209858443873996471L)
    private g EQ;

    @dy(field = 1963502663486591827L)
    private boolean FH;

    @dy(field = -401805759172403200L)
    private boolean Hw;

    @dy(field = -365052997021224232L)
    private HashSet<j> J0;

    @dy(field = -992591115150358395L)
    private Object J8;

    @dy(field = 1382347533446207748L)
    private Object Mr;

    @dy(field = -6775353807869496707L)
    private boolean QX;

    @dy(field = -888937827295758480L)
    private boolean U2;

    @dy(field = -2362410782991529440L)
    private boolean VH;

    @dy(field = 1545850667328777524L)
    private String Ws;

    @dy(field = -2270410856584954065L)
    private int XL;

    @dy(field = -2415198250166855532L)
    private Object Zo;

    @dy(field = 614190535158426993L)
    private Object aM;

    @dy(field = 684364672607915569L)
    private Set<j> gn;

    @dy(field = -4194254541530573533L)
    private InterruptibleChannel j3;

    @dy(field = 3707950647941632295L)
    private qt<com.dropbox.client2.android.a> j6;

    @dy(field = -4423840938585048032L)
    private String tp;

    @dy(field = -2384587336799456768L)
    private String u7;

    @dy(field = 370101187628514449L)
    private boolean v5;

    @dy(field = 3445608454302445833L)
    private List<h> we;

    @cy(clazz = -159569957877605768L, container = 4379885248179836745L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 511961138502304261L, container = 4379885248179836745L, user = true)
        /* renamed from: com.aide.ui.services.DropboxService$a$a, reason: collision with other inner class name */
        class RunnableC0087a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = -32031567384981305L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(RunnableC0087a.class);
            }

            @ey(method = 170272360776873600L)
            public RunnableC0087a(a aVar, String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -2111101212076591947L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-3642128195804924496L, this);
                    }
                    MessageBox.gW(ServiceContainer.getMainActivity(), new id(this.WB));
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -3642128195804924496L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 512016243023095320L, container = 4379885248179836745L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -842041718315743293L)
            final /* synthetic */ List WB;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 8724635390465821704L)
            public b(List list) {
                this.WB = list;
            }

            @Override // java.lang.Runnable
            @ey(method = 389385700488211291L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-3640328694317478057L, this);
                    }
                    DropboxService.this.EQ.j6(this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3640328694317478057L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 512071347547949673L, container = 4379885248179836745L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -2810456144655028800L)
            final /* synthetic */ vt WB;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 1458445611202386585L)
            public c(vt vtVar) {
                this.WB = vtVar;
            }

            @Override // java.lang.Runnable
            @ey(method = 195319664151968480L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-3638528708637206528L, this);
                    }
                    DropboxService.this.EQ.DW(this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3638528708637206528L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 512126452076867320L, container = 4379885248179836745L, user = true)
        class d implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(d.class);
            }

            @ey(method = -69740761751737140L)
            public d(a aVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = -1257924111279772629L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-3636728238764109909L, this);
                    }
                    ServiceContainer.getMainActivity().Cz();
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -3636728238764109909L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 512181556609848261L, container = 4379885248179836745L, user = true)
        class e implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(e.class);
            }

            @ey(method = -44221415821778751L)
            public e(a aVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = -1449058292746719368L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-3634927284698188200L, this);
                    }
                    FireBaseLogEvent.tp("Dropbox sync completed");
                    ServiceContainer.getMainActivity().Z1();
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -3634927284698188200L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 512236661146892496L, container = 4379885248179836745L, user = true)
        class f implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(f.class);
            }

            @ey(method = -57909470108045780L)
            public f(a aVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = 2193326495937772923L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-3633125846439441401L, this);
                    }
                    ServiceContainer.getMainActivity().Z1();
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -3633125846439441401L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 512291765688000025L, container = 4379885248179836745L, user = true)
        class g implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -1644317766768766613L)
            final /* synthetic */ Exception WB;

            @cy(clazz = 320211361912371960L, container = 4379885248179836745L, user = true)
            /* renamed from: com.aide.ui.services.DropboxService$a$g$a, reason: collision with other inner class name */
            class RunnableC0088a implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(RunnableC0088a.class);
                }

                @ey(method = -338709578255305257L)
                public RunnableC0088a() {
                }

                @Override // java.lang.Runnable
                @ey(method = -1281659071304709792L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-3629521517343472533L, this);
                        }
                        DropboxService.this.dx();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -3629521517343472533L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(g.class);
            }

            @ey(method = -233893976393390848L)
            public g(Exception exc) {
                this.WB = exc;
            }

            @Override // java.lang.Runnable
            @ey(method = -932161295215505813L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-3631323923987869512L, this);
                    }
                    ServiceContainer.getMainActivity().Z1();
                    if (DropboxService.this.VH) {
                        MainActivity mainActivity = ServiceContainer.getMainActivity();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error: ");
                        sb.append(this.WB.getMessage() == null ? this.WB : this.WB.getMessage());
                        MessageBox.vy(mainActivity, "Dropbox", sb.toString(), "Disconnect", new RunnableC0088a());
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3631323923987869512L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -161232482157502079L)
        public a() {
        }

        @ey(method = -810438471020312864L)
        private boolean j6() {
            try {
                if (mb) {
                    iy.gn(1957726046461692465L, this);
                }
                if (DropboxService.this.gn.size() <= 0 && DropboxService.this.u7 == null) {
                    if (DropboxService.this.tp == null) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1957726046461692465L, this);
                }
                throw th;
            }
        }

        @Override // java.lang.Runnable
        @ey(method = 143580761192065080L)
        public void run() {
            DropboxService dropboxService;
            try {
                if (mb) {
                    iy.gn(-3643927213099545845L, this);
                }
                while (true) {
                    synchronized (DropboxService.this.Zo) {
                        while (true) {
                            if (j6() && !DropboxService.this.FH) {
                                break;
                            }
                            try {
                                DropboxService.this.Zo.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                        DropboxService.this.J0.clear();
                        while (DropboxService.this.gn.size() > 0) {
                            DropboxService.this.J0.addAll(DropboxService.this.gn);
                            DropboxService.this.gn.clear();
                            try {
                                DropboxService.this.Zo.wait(100L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                    if (DropboxService.this.u7 != null) {
                        if (DropboxService.this.Mr()) {
                            String str = DropboxService.this.u7;
                            DropboxService.this.u7 = null;
                            ServiceContainer.aj(new RunnableC0087a(this, str));
                        }
                    } else if (DropboxService.this.tp == null) {
                        try {
                            if (DropboxService.this.Mr()) {
                                if (DropboxService.this.VH) {
                                    ServiceContainer.aj(new d(this));
                                }
                                try {
                                    Iterator it = DropboxService.this.J0.iterator();
                                    while (it.hasNext()) {
                                        j jVar = (j) it.next();
                                        DropboxService.this.wc(true, "Connecting...", 0.0f);
                                        DropboxService.this.XX(jVar);
                                        ServiceContainer.aj(new e(this));
                                    }
                                } catch (f unused3) {
                                    AppLog.DW("Canceled");
                                    DropboxService.this.wc(false, "Done", 100.0f);
                                    ServiceContainer.aj(new f(this));
                                } catch (Exception e2) {
                                    AppLog.v5(e2);
                                    DropboxService.this.wc(false, "Done", 100.0f);
                                    ServiceContainer.aj(new g(e2));
                                }
                                synchronized (DropboxService.this.Zo) {
                                    DropboxService.this.J0.clear();
                                }
                                dropboxService = DropboxService.this;
                            } else {
                                synchronized (DropboxService.this.Zo) {
                                    DropboxService.this.gn.addAll(DropboxService.this.J0);
                                }
                                synchronized (DropboxService.this.Zo) {
                                    DropboxService.this.J0.clear();
                                }
                                dropboxService = DropboxService.this;
                            }
                            dropboxService.wc(false, "Done", 100.0f);
                        } catch (Throwable th) {
                            synchronized (DropboxService.this.Zo) {
                                DropboxService.this.J0.clear();
                                DropboxService.this.wc(false, "Done", 100.0f);
                                throw th;
                            }
                        }
                    } else if (DropboxService.this.Mr()) {
                        try {
                            String str2 = DropboxService.this.tp;
                            DropboxService.this.tp = null;
                            ArrayList arrayList = new ArrayList();
                            qt.f fVarU7 = DropboxService.this.j6.u7(str2, 0, null, true, null);
                            if (fVarU7.Zo != null) {
                                for (qt.f fVar : fVarU7.Zo) {
                                    if (fVar.DW) {
                                        arrayList.add(fVar.FH);
                                    }
                                }
                            }
                            ServiceContainer.aj(new b(arrayList));
                        } catch (vt e3) {
                            AppLog.v5(e3);
                            ServiceContainer.aj(new c(e3));
                        }
                    }
                }
            } catch (Throwable th2) {
                if (jw) {
                    iy.aM(th2, -3643927213099545845L, this);
                }
                throw th2;
            }
        }
    }

    @cy(clazz = -159645758019341331L, container = 4379885248179836745L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 512144545144045336L, container = 4379885248179836745L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 50451720736235136L)
            public a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 929300919708195975L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(6528122677934821353L, this);
                    }
                    DropboxService.this.DW = true;
                    ((com.dropbox.client2.android.a) DropboxService.this.j6.gn()).Mr(ServiceContainer.getMainActivity());
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 6528122677934821353L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = 12034717216766048L)
        public b() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1318043948329777077L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(6524135954868366736L, this);
                }
                if (!DropboxService.this.VH) {
                    MessageBox.rN(ServiceContainer.getMainActivity(), "Dropbox", "Do you want to connect to your Dropbox?", new a(), null);
                } else {
                    DropboxService.this.DW = true;
                    ((com.dropbox.client2.android.a) DropboxService.this.j6.gn()).Mr(ServiceContainer.getMainActivity());
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 6524135954868366736L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -159721558157013600L, container = 4379885248179836745L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -4544818131510965300L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 26331550097578492L)
        public c(DropboxService dropboxService, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 747737521310586369L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(5909734510933937761L, this);
                }
                ServiceContainer.getFileBrowserService().Hw(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 5909734510933937761L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -159797358290622575L, container = 4379885248179836745L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 92693088328828807L)
        public d() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1383654197796735980L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-720885568192460928L, this);
                }
                Iterator it = DropboxService.this.we.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).j6();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -720885568192460928L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -159873158420168256L, container = 4379885248179836745L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 3044976880642434773L)
        final /* synthetic */ InterruptibleChannel WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 5972858746296526040L)
        public e(DropboxService dropboxService, InterruptibleChannel interruptibleChannel) {
            this.WB = interruptibleChannel;
        }

        @Override // java.lang.Runnable
        @ey(method = -2118055098731350821L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-755807237633406861L, this);
                }
                try {
                    this.WB.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -755807237633406861L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 12887020015080069L, container = 12887020015080069L, user = true)
    private static class f extends RuntimeException {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 2991324227051825412L)
        private f() {
            try {
                if (WB) {
                    iy.gn(2788493001166976425L, null);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2788493001166976425L, null);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 117845210060651904L)
        public /* synthetic */ f(a aVar) {
            this();
            try {
                if (WB) {
                    iy.tp(5193731779903956055L, null, aVar);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 5193731779903956055L, null, aVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2937401013598548912L, container = -2937401013598548912L, user = true)
    public interface g {
        @ey(method = -981876972082322969L)
        void DW(vt vtVar);

        @ey(method = -4593788862501241568L)
        void j6(List<String> list);
    }

    @cy(clazz = -48465650539474272L, container = -48465650539474272L, user = true)
    public interface h {
        @ey(method = 1008935620753638840L)
        void j6();
    }

    @cy(clazz = -6006263335017124093L, container = -6006263335017124093L, user = true)
    private static class j {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 6339867100570232200L)
        public String DW;

        @dy(field = -4303091915329666485L)
        public String j6;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -215775012816574272L)
        public j(String str, String str2) {
            try {
                if (FH) {
                    iy.EQ(-2839602912850028784L, null, str, str2);
                }
                this.j6 = str;
                this.DW = str2;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -2839602912850028784L, null, str, str2);
                }
                throw th;
            }
        }

        @ey(method = 484319143072123920L)
        public boolean equals(Object obj) {
            try {
                if (FH) {
                    iy.tp(93320964175643040L, this, obj);
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                j jVar = (j) obj;
                if (this.DW == null) {
                    if (jVar.DW != null) {
                        return false;
                    }
                } else if (!this.DW.equals(jVar.DW)) {
                    return false;
                }
                if (this.j6 == null) {
                    if (jVar.j6 != null) {
                        return false;
                    }
                } else if (!this.j6.equals(jVar.j6)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 93320964175643040L, this, obj);
                }
                throw th;
            }
        }

        @ey(method = -1441379765852979305L)
        public int hashCode() {
            try {
                if (FH) {
                    iy.gn(536660253447496057L, this);
                }
                int iHashCode = 0;
                int iHashCode2 = ((this.DW == null ? 0 : this.DW.hashCode()) + 31) * 31;
                if (this.j6 != null) {
                    iHashCode = this.j6.hashCode();
                }
                return iHashCode2 + iHashCode;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 536660253447496057L, this);
                }
                throw th;
            }
        }

        @ey(method = -1069155339064053221L)
        public boolean j6(j jVar) {
            try {
                if (FH) {
                    iy.tp(469247876121049989L, this, jVar);
                }
                return FileSystem.nw(this.j6, jVar.j6);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 469247876121049989L, this, jVar);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(DropboxService.class);
            if (lg) {
                iy.gn(-2923827897369810400L, null);
            }
            a8 = gu.a.DROPBOX;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2923827897369810400L, null);
            }
            throw th;
        }
    }

    @ey(method = 3249735575555394968L)
    public DropboxService() {
        try {
            if (lg) {
                iy.gn(4782408860975199471L, null);
            }
            this.DW = false;
            this.FH = false;
            this.Hw = false;
            this.v5 = false;
            this.Zo = new Object();
            this.gn = new HashSet();
            this.we = new ArrayList();
            this.J0 = new HashSet<>();
            this.J8 = new Object();
            this.aM = new Object();
            this.Mr = new Object();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 4782408860975199471L, null);
            }
            throw th;
        }
    }

    @ey(method = 2287290855751136649L)
    private boolean KD(String str) {
        try {
            if (lg) {
                iy.tp(-131108071376398575L, this, str);
            }
            return "bin".equals(FileSystem.getName(str));
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -131108071376398575L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3476692757915954980L)
    public boolean Mr() {
        com.dropbox.client2.android.a aVar;
        try {
            if (lg) {
                iy.gn(2778568017536215492L, this);
            }
            if (ServiceContainer.getContext() != null) {
                if (this.j6 == null) {
                    fu fuVar = ServiceContainer.P8.equals("com.aide.phonegap") ? new fu("2hlvmjwfmylgnjp", "99o0k7gok4ktizu") : ServiceContainer.P8.equals("com.aide.web") ? new fu("jnyrhqjnzlzatzo", "fi1pqoyzax8vktt") : new fu("fkerp7oej8u61j0", "5rqhagcf14jbzcd");
                    String[] strArrGW = gW();
                    if (strArrGW != null) {
                        aVar = new com.dropbox.client2.android.a(fuVar, a8, new eu(strArrGW[0], strArrGW[1]));
                        this.Hw = true;
                    } else {
                        aVar = new com.dropbox.client2.android.a(fuVar, a8);
                        this.Hw = false;
                    }
                    qt<com.dropbox.client2.android.a> qtVar = new qt<>(aVar);
                    this.j6 = qtVar;
                    if (this.Hw) {
                        try {
                            long j2 = qtVar.j6().mb;
                        } catch (Exception unused) {
                            this.Hw = false;
                        }
                    }
                    if (this.Hw) {
                        this.v5 = true;
                    }
                }
                if (!this.Hw && !this.FH) {
                    this.FH = true;
                    if (this.VH || !this.v5) {
                        this.v5 = true;
                        ServiceContainer.aj(new b());
                    }
                }
            }
            return this.Hw;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 2778568017536215492L, this);
            }
            throw th;
        }
    }

    @ey(method = 938869887168604872L)
    private void Qq(i iVar, String str, qt.f fVar) {
        try {
            if (lg) {
                iy.we(-23151533695287920L, this, iVar, str, fVar);
            }
            if (aM(str, fVar)) {
                AppLog.DW("Resolve conflict " + str);
                iVar.VH(str, fVar.Hw, FileSystem.lg(str));
                return;
            }
            AppLog.DW("Download conflict " + str);
            sy(str);
            lg(iVar, str, fVar);
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, -23151533695287920L, this, iVar, str, fVar);
            }
            throw th;
        }
    }

    @ey(method = 977887327726272825L)
    private boolean SI(String str) {
        try {
            if (lg) {
                iy.tp(3470716020187713L, this, str);
            }
            return FileSystem.exists(str + "/.aidedropbox");
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 3470716020187713L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2304990727136901875L)
    private void U2() {
        try {
            if (lg) {
                iy.gn(1430474090639285005L, this);
            }
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("DropBox", 0).edit();
            editorEdit.clear();
            editorEdit.commit();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 1430474090639285005L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @abcd.ey(method = -1575715331024172000L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void XG(com.aide.ui.services.DropboxService.i r28, java.lang.String r29, java.lang.String r30, float r31, float r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.DropboxService.XG(com.aide.ui.services.DropboxService$i, java.lang.String, java.lang.String, float, float):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1276024869974736000L)
    public void XX(j jVar) {
        i iVar;
        String strDW;
        try {
            if (lg) {
                iy.tp(1263566929332734312L, this, jVar);
            }
            synchronized (this.Mr) {
                this.U2 = false;
            }
            String str = jVar.j6;
            if (jVar.DW != null) {
                String str2 = jVar.j6;
                strDW = jVar.DW;
                FileSystem.g3(str2);
                qt.b bVarJ6 = this.j6.j6();
                iVar = new i(bVarJ6.mb, bVarJ6.WB, str2, strDW);
                iVar.gn();
                ServiceContainer.aj(new c(this, str2));
            } else {
                String strYS = yS(str);
                iVar = new i(strYS);
                strDW = iVar.DW(str);
                if (this.j6.j6().mb != iVar.j6) {
                    throw new IOException("Directory '" + strYS + "' was downloaded from the Dropbox of '" + iVar.DW + "'. Please login to this account.");
                }
            }
            try {
                jJ(iVar, str, strDW);
            } finally {
                iVar.gn();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 1263566929332734312L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -1183987115866263555L)
    private void a8() {
        try {
            if (lg) {
                iy.gn(-1234440270021932739L, this);
            }
            synchronized (this.Zo) {
                this.tp = null;
                this.u7 = null;
                this.gn.clear();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1234440270021932739L, this);
            }
            throw th;
        }
    }

    @ey(method = -2631529778873173448L)
    private boolean aM(String str, qt.f fVar) {
        try {
            if (lg) {
                iy.EQ(1924494695831666400L, this, str, fVar);
            }
            if (FileSystem.rN(str) != fVar.j6) {
                return false;
            }
            return StreamUtilities.j6(this.j6.v5(fVar.FH, null), new FileInputStream(str));
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, 1924494695831666400L, this, str, fVar);
            }
            throw th;
        }
    }

    @ey(method = 3396722283822546363L)
    private void br(String str, String str2) {
        try {
            if (lg) {
                iy.EQ(-1733971316874342669L, this, str, str2);
            }
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("DropBox", 0).edit();
            editorEdit.putString("ACCESS_KEY", str);
            editorEdit.putString("ACCESS_SECRET", str2);
            editorEdit.commit();
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -1733971316874342669L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 4663919145213296917L)
    private boolean cn(String str) {
        try {
            if (lg) {
                iy.tp(-2666918025632349035L, this, str);
            }
            return yS(str) != null;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -2666918025632349035L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1343204222274308264L)
    private String[] gW() {
        try {
            if (lg) {
                iy.gn(-2903546887200973552L, this);
            }
            SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences("DropBox", 0);
            String string = sharedPreferences.getString("ACCESS_KEY", null);
            String string2 = sharedPreferences.getString("ACCESS_SECRET", null);
            if (string == null || string2 == null) {
                return null;
            }
            return new String[]{string, string2};
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -2903546887200973552L, this);
            }
            throw th;
        }
    }

    @ey(method = 3035994005924986560L)
    private void jJ(i iVar, String str, String str2) {
        try {
            if (lg) {
                iy.we(5049097638478968816L, this, iVar, str, str2);
            }
            AppLog.DW("Syncing " + str);
            if (FileSystem.KD(str)) {
                yO(iVar, str, false);
            } else {
                rN(str2);
                XG(iVar, str, str2, 0.0f, 100.0f);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, 5049097638478968816L, this, iVar, str, str2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    @abcd.ey(method = -5699771468570263728L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void kQ(com.aide.ui.services.DropboxService.i r23, java.lang.String r24, com.aide.ui.services.DropboxService.i.a r25, java.lang.String r26, abcd.qt.f r27, boolean r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.DropboxService.kQ(com.aide.ui.services.DropboxService$i, java.lang.String, com.aide.ui.services.DropboxService$i$a, java.lang.String, abcd.qt$f, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0092  */
    @abcd.ey(method = -182901550625690112L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lg(com.aide.ui.services.DropboxService.i r9, java.lang.String r10, abcd.qt.f r11) {
        /*
            r8 = this;
            boolean r0 = com.aide.ui.services.DropboxService.lg     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L10
            r1 = 192078326962695872(0x2aa66387fa9aec0, double:8.07321792414751E-296)
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8d
        L10:
            abcd.qt<com.dropbox.client2.android.a> r0 = r8.j6     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = r11.FH     // Catch: java.lang.Throwable -> L8d
            r2 = 0
            abcd.qt$e r0 = r0.v5(r1, r2)     // Catch: java.lang.Throwable -> L8d
            java.nio.channels.ReadableByteChannel r1 = java.nio.channels.Channels.newChannel(r0)     // Catch: java.lang.Throwable -> L8d
            boolean r3 = r1 instanceof java.nio.channels.InterruptibleChannel     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r8.aM     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8d
            java.nio.channels.InterruptibleChannel r1 = (java.nio.channels.InterruptibleChannel) r1     // Catch: java.lang.Throwable -> L2a
            r8.j3 = r1     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r0     // Catch: java.lang.Throwable -> L8d
        L2d:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            com.aide.common.StreamUtilities.Zo(r0, r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            java.lang.Object r0 = r8.Mr     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            boolean r1 = r8.U2     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L4d
            com.aide.ui.util.FileSystem.VH(r10)     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L61
            r9.j6(r10)     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L61
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r8.aM     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L8d
            r8.j3 = r2     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r1     // Catch: java.lang.Throwable -> L8d
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r11.Hw     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            long r3 = com.aide.ui.util.FileSystem.lg(r10)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            r9.VH(r10, r0, r3)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            java.lang.Object r0 = r8.aM     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L8d
            r8.j3 = r2     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            goto L7b
        L5e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r1     // Catch: java.lang.Throwable -> L8d
        L61:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r1     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L64:
            r0 = move-exception
            goto L83
        L66:
            r0 = move-exception
            com.aide.ui.util.FileSystem.VH(r10)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L6d
            r9.j6(r10)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L6d
        L6d:
            java.lang.Object r1 = r8.Mr     // Catch: java.lang.Throwable -> L64
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L64
            boolean r3 = r8.U2     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L7f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r8.aM     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L8d
            r8.j3 = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
        L7b:
            return
        L7c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            throw r1     // Catch: java.lang.Throwable -> L8d
        L7f:
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L64
        L83:
            java.lang.Object r1 = r8.aM     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8d
            r8.j3 = r2     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r0     // Catch: java.lang.Throwable -> L8d
        L8a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r0     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            boolean r1 = com.aide.ui.services.DropboxService.rN
            if (r1 == 0) goto L9f
            r2 = 192078326962695872(0x2aa66387fa9aec0, double:8.07321792414751E-296)
            r1 = r0
            r4 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        L9f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.DropboxService.lg(com.aide.ui.services.DropboxService$i, java.lang.String, abcd.qt$f):void");
    }

    @ey(method = 3233797475486138785L)
    private void rN(String str) {
        try {
            if (lg) {
                iy.tp(2735321736769912625L, this, str);
            }
            qt.f fVar = null;
            try {
                qt.f fVarU7 = this.j6.u7(str, 0, null, false, null);
                if (!fVarU7.v5) {
                    fVar = fVarU7;
                }
            } catch (vt unused) {
            }
            if (fVar == null) {
                this.j6.FH(str);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 2735321736769912625L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1553120610711409320L)
    private boolean ro(String str) {
        try {
            if (lg) {
                iy.tp(-3368503240805962720L, this, str);
            }
            String name = FileSystem.getName(str);
            if (!".aidedropbox".equals(name)) {
                if (!name.contains(".syncconflict.")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -3368503240805962720L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 7611987644764365792L)
    private void sy(String str) {
        try {
            if (lg) {
                iy.tp(637153376327176248L, this, str);
            }
            StreamUtilities.Zo(new FileInputStream(str), new FileOutputStream(FileSystem.getParent(str) + "/" + (FileSystem.getName(str) + ".syncconflict." + FileSystem.lg(str))));
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 637153376327176248L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -6279928051244286177L)
    public void wc(boolean z, String str, float f2) {
        try {
            if (lg) {
                iy.we(2573824380392325159L, this, new Boolean(z), str, new Float(f2));
            }
            synchronized (this.J8) {
                this.QX = z;
                this.Ws = str;
                this.XL = (int) f2;
                ServiceContainer.aj(new d());
            }
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, 2573824380392325159L, this, new Boolean(z), str, new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = 3117637584245109129L)
    private void yO(i iVar, String str, boolean z) throws cu {
        qt.f fVarU7;
        try {
            if (lg) {
                iy.we(611513681654570425L, this, iVar, str, new Boolean(z));
            }
            String strDW = iVar.DW(str);
            try {
                fVarU7 = this.j6.u7(strDW, 0, null, false, null);
            } catch (bu e2) {
                if (e2.mb != 404) {
                    throw e2;
                }
                fVarU7 = null;
            }
            kQ(iVar, str, iVar.FH(str), strDW, fVarU7, z);
        } catch (Throwable th) {
            if (rN) {
                iy.U2(th, 611513681654570425L, this, iVar, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1301904660577875285L)
    private String yS(String str) {
        try {
            if (lg) {
                iy.tp(574286914810994067L, this, str);
            }
            if (FileSystem.cb(str)) {
                return null;
            }
            while (!FileSystem.Sf(str)) {
                if (SI(str)) {
                    return str;
                }
                str = FileSystem.getParent(str);
            }
            return null;
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 574286914810994067L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 6031651768310798829L)
    public int BT() {
        try {
            if (lg) {
                iy.gn(-346763692050056875L, this);
            }
            return this.XL;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -346763692050056875L, this);
            }
            throw th;
        }
    }

    @ey(method = -1573242135103904544L)
    public void I(String str) {
        try {
            if (lg) {
                iy.tp(-2469407154424096104L, this, str);
            }
            if (AppPreferences.v5() && cn(str)) {
                OW(ServiceContainer.QX().cn(str), false);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -2469407154424096104L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1711992939430600904L)
    public void Mz(String str) {
        try {
            if (lg) {
                iy.tp(-2536738266859532784L, this, str);
            }
            if (AppPreferences.v5() && cn(str)) {
                OW(str, false);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -2536738266859532784L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3572064741723974808L)
    public void OW(String str, boolean z) {
        try {
            if (lg) {
                iy.EQ(-6351812137710690160L, this, str, new Boolean(z));
            }
            if (z && sh()) {
                ServiceContainer.getMainActivity().Cz();
            }
            synchronized (this.Zo) {
                j jVar = new j(str, null);
                Iterator<j> it = this.J0.iterator();
                while (it.hasNext()) {
                    if (it.next().j6(jVar)) {
                        return;
                    }
                }
                this.VH = z;
                this.gn.add(jVar);
                this.FH = false;
                this.Zo.notifyAll();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -6351812137710690160L, this, str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -901265443002744488L)
    public String P8() {
        String str;
        try {
            if (lg) {
                iy.gn(-980992765658229440L, this);
            }
            synchronized (this.J8) {
                str = this.Ws;
            }
            return str;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -980992765658229440L, this);
            }
            throw th;
        }
    }

    @ey(method = -7055049733692240073L)
    public void Sf(List<String> list) {
        try {
            if (lg) {
                iy.tp(3051126771601974471L, this, list);
            }
            if (AppPreferences.v5()) {
                for (String str : list) {
                    if (cn(str)) {
                        OW(str, false);
                    }
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 3051126771601974471L, this, list);
            }
            throw th;
        }
    }

    @ey(method = 874774502183401873L)
    public void XL(h hVar) {
        try {
            if (lg) {
                iy.tp(-5718628617152157383L, this, hVar);
            }
            this.we.add(hVar);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -5718628617152157383L, this, hVar);
            }
            throw th;
        }
    }

    @ey(method = 1331712247078572108L)
    public void aj() {
        try {
            if (lg) {
                iy.gn(-1046768225672723460L, this);
            }
            j3();
            this.j6 = null;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1046768225672723460L, this);
            }
            throw th;
        }
    }

    @ey(method = -3734436331286040537L)
    public void ca(List<String> list) {
        try {
            if (lg) {
                iy.tp(1701231379752054039L, this, list);
            }
            if (AppPreferences.v5()) {
                for (String str : list) {
                    if (cn(str)) {
                        this.v5 = false;
                        OW(str, false);
                        if (ServiceContainer.QX().Mz(str)) {
                            OW(ServiceContainer.QX().cn(str), false);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 1701231379752054039L, this, list);
            }
            throw th;
        }
    }

    @ey(method = -6858995659876208673L)
    public boolean cb(String str) {
        try {
            if (lg) {
                iy.tp(-924108713375225609L, this, str);
            }
            return cn(str);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -924108713375225609L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2983093786831450224L)
    public void dx() {
        try {
            if (lg) {
                iy.gn(-1638219140258255336L, this);
            }
            if (sh()) {
                return;
            }
            ((com.dropbox.client2.android.a) this.j6.gn()).QX();
            U2();
            this.Hw = false;
            this.FH = false;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1638219140258255336L, this);
            }
            throw th;
        }
    }

    @ey(method = -94763316642190559L)
    public void ef(String str) {
        try {
            if (lg) {
                iy.tp(3857425695303167825L, this, str);
            }
            if (AppPreferences.v5() && cn(str)) {
                OW(str, false);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, 3857425695303167825L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3649939372479717356L)
    public void ei(String str, g gVar) {
        try {
            if (lg) {
                iy.EQ(2186705762205226548L, this, str, gVar);
            }
            synchronized (this.Zo) {
                this.VH = true;
                this.tp = str;
                this.EQ = gVar;
                this.FH = false;
                this.Zo.notifyAll();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, 2186705762205226548L, this, str, gVar);
            }
            throw th;
        }
    }

    @ey(method = -226935710610784000L)
    public String er() {
        try {
            if (!lg) {
                return "Sync with Dropbox...";
            }
            iy.gn(111802974688164608L, this);
            return "Sync with Dropbox...";
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 111802974688164608L, this);
            }
            throw th;
        }
    }

    @ey(method = 1427808106539762940L)
    public void g3(String str) {
        try {
            if (lg) {
                iy.tp(-795967955489422964L, this, str);
            }
            if (AppPreferences.v5() && cn(str) && !ServiceContainer.getProjectService().vJ(str)) {
                OW(str, false);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -795967955489422964L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3313597938596592360L)
    public void j3() {
        try {
            if (lg) {
                iy.gn(-1340978483344581920L, this);
            }
            synchronized (this.Mr) {
                this.U2 = true;
            }
            synchronized (this.aM) {
                if (this.j3 != null) {
                    new Thread(new e(this, this.j3)).start();
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1340978483344581920L, this);
            }
            throw th;
        }
    }

    @ey(method = 2774572254509301200L)
    public void lp(String str, String str2) {
        try {
            if (lg) {
                iy.EQ(-28542032868478680L, this, str, str2);
            }
            if (sh()) {
                ServiceContainer.getMainActivity().Cz();
            }
            synchronized (this.Zo) {
                this.VH = true;
                this.gn.add(new j(str, str2));
                this.FH = false;
                this.Zo.notifyAll();
            }
        } catch (Throwable th) {
            if (rN) {
                iy.Mr(th, -28542032868478680L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2371413430070076600L)
    public void nw() {
        try {
            if (lg) {
                iy.gn(-1602469395464070432L, this);
            }
            new Thread(new a()).start();
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -1602469395464070432L, this);
            }
            throw th;
        }
    }

    @ey(method = 1600525276665141585L)
    public void sG() {
        try {
            if (lg) {
                iy.gn(6076409090508112185L, this);
            }
            if (this.DW) {
                this.DW = false;
                this.FH = false;
                com.dropbox.client2.android.a aVar = (com.dropbox.client2.android.a) this.j6.gn();
                if (!aVar.aM()) {
                    a8();
                    return;
                }
                try {
                    aVar.j3();
                    eu euVarWe = aVar.we();
                    br(euVarWe.WB, euVarWe.mb);
                    synchronized (this.Zo) {
                        this.Hw = true;
                        this.Zo.notifyAll();
                    }
                } catch (IllegalStateException e2) {
                    AppLog.v5(e2);
                    a8();
                    MessageBox.BT(ServiceContainer.getMainActivity(), "Dropbox", "Couldn't authenticate with Dropbox.");
                }
            }
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 6076409090508112185L, this);
            }
            throw th;
        }
    }

    @ey(method = -826573596877293608L)
    public boolean sh() {
        boolean z;
        try {
            if (lg) {
                iy.gn(-6603381227057389488L, this);
            }
            synchronized (this.J8) {
                z = this.QX;
            }
            return z;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, -6603381227057389488L, this);
            }
            throw th;
        }
    }

    @ey(method = -218627877360375151L)
    public void vJ(String str) {
        try {
            if (lg) {
                iy.tp(-6378949989672242631L, this, str);
            }
            if (AppPreferences.v5() && cn(str)) {
                OW(str, false);
            }
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -6378949989672242631L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3638372627141878419L)
    public int vy() {
        try {
            if (!lg) {
                return 0;
            }
            iy.gn(5048167329163802067L, this);
            return 0;
        } catch (Throwable th) {
            if (rN) {
                iy.aM(th, 5048167329163802067L, this);
            }
            throw th;
        }
    }

    @ey(method = 570561183934961796L)
    public void x9(h hVar) {
        try {
            if (lg) {
                iy.tp(-351665406820918476L, this, hVar);
            }
            this.we.remove(hVar);
        } catch (Throwable th) {
            if (rN) {
                iy.j3(th, -351665406820918476L, this, hVar);
            }
            throw th;
        }
    }

    @cy(clazz = -951652799068960296L, container = -951652799068960296L, user = true)
    private static class i {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -2334104833794022272L)
        public String DW;

        @dy(field = -2094623149710148997L)
        public String FH;

        @dy(field = -2508961707903339736L)
        public String Hw;

        @dy(field = -2913266666012775936L)
        private Map<String, a> Zo;

        @dy(field = 3483761000142848096L)
        public long j6;

        @dy(field = -1387695645353379747L)
        private int v5;

        @cy(clazz = 550278312641710049L, container = 550278312641710049L, user = true)
        private static class a {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 4355903958691571388L)
            public long DW;

            @dy(field = 2451664775453806031L)
            public String j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 154753272544705968L)
            public a(String str, long j) {
                try {
                    if (FH) {
                        iy.EQ(1466509463695637937L, null, str, new Long(j));
                    }
                    this.j6 = str;
                    this.DW = j;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, 1466509463695637937L, null, str, new Long(j));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(i.class);
        }

        @ey(method = -2836090407624127668L)
        public i(long j, String str, String str2, String str3) {
            try {
                if (VH) {
                    iy.J0(2520568163681569080L, null, new Long(j), str, str2, str3);
                }
                this.Zo = new HashMap();
                this.j6 = j;
                this.DW = str;
                this.FH = str2;
                this.Hw = str3;
                this.v5 = 1;
            } catch (Throwable th) {
                if (gn) {
                    iy.a8(th, 2520568163681569080L, null, new Long(j), str, str2, str3);
                }
                throw th;
            }
        }

        @ey(method = -4447700300511854796L)
        private String Hw(String str) {
            try {
                if (VH) {
                    iy.tp(-3564603830997242289L, this, str);
                }
                return str.substring(this.FH.length(), str.length());
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -3564603830997242289L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1961250178617531896L)
        private void Zo() {
            try {
                if (VH) {
                    iy.gn(172350531299352219L, this);
                }
                int i = this.v5 + 1;
                this.v5 = i;
                if (i > 100) {
                    gn();
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 172350531299352219L, this);
                }
                throw th;
            }
        }

        @ey(method = -3516549032553163532L)
        private boolean v5(String str, String str2) {
            try {
                if (VH) {
                    iy.EQ(113309919422784783L, this, str, str2);
                }
                if (!str2.equals(str)) {
                    if (!str2.startsWith(str + "/")) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 113309919422784783L, this, str, str2);
                }
                throw th;
            }
        }

        @ey(method = -2898142499083360200L)
        public String DW(String str) {
            try {
                if (VH) {
                    iy.tp(-4946495866835924925L, this, str);
                }
                return this.Hw + str.substring(this.FH.length(), str.length());
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -4946495866835924925L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 387617937620513873L)
        public a FH(String str) {
            try {
                if (VH) {
                    iy.tp(132342996763397640L, this, str);
                }
                return this.Zo.get(Hw(str));
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 132342996763397640L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 48824555253720919L)
        public void VH(String str, String str2, long j) {
            try {
                if (VH) {
                    iy.we(-31306463945899612L, this, str, str2, new Long(j));
                }
                this.Zo.put(Hw(str), new a(str2, j));
                Zo();
            } catch (Throwable th) {
                if (gn) {
                    iy.U2(th, -31306463945899612L, this, str, str2, new Long(j));
                }
                throw th;
            }
        }

        @ey(method = -1267727485262174300L)
        public void gn() {
            try {
                if (VH) {
                    iy.gn(385205763823307399L, this);
                }
                if (this.v5 == 0) {
                    return;
                }
                this.v5 = 0;
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.FH + "/.aidedropbox"));
                dataOutputStream.writeInt(1);
                dataOutputStream.writeLong(this.j6);
                dataOutputStream.writeUTF(this.DW);
                dataOutputStream.writeUTF(this.Hw);
                dataOutputStream.writeInt(this.Zo.size());
                for (Map.Entry<String, a> entry : this.Zo.entrySet()) {
                    dataOutputStream.writeUTF(entry.getKey());
                    dataOutputStream.writeUTF(entry.getValue().j6);
                    dataOutputStream.writeLong(entry.getValue().DW);
                }
                dataOutputStream.close();
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 385205763823307399L, this);
                }
                throw th;
            }
        }

        @ey(method = 218719386980693448L)
        public void j6(String str) {
            try {
                if (VH) {
                    iy.tp(13714851061358331L, this, str);
                }
                HashSet hashSet = new HashSet();
                String strHw = Hw(str);
                for (String str2 : this.Zo.keySet()) {
                    if (v5(strHw, str2)) {
                        hashSet.add(str2);
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    this.Zo.remove((String) it.next());
                }
                Zo();
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 13714851061358331L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -102720511224845131L)
        public i(String str) {
            try {
                if (VH) {
                    iy.tp(-695522830257917125L, null, str);
                }
                this.Zo = new HashMap();
                this.FH = str;
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(str + "/.aidedropbox"));
                if (dataInputStream.readInt() == 1) {
                    try {
                        this.j6 = dataInputStream.readLong();
                        this.DW = dataInputStream.readUTF();
                        this.Hw = dataInputStream.readUTF();
                        int i = dataInputStream.readInt();
                        for (int i2 = 0; i2 < i; i2++) {
                            this.Zo.put(dataInputStream.readUTF(), new a(dataInputStream.readUTF(), dataInputStream.readLong()));
                        }
                        dataInputStream.close();
                        this.v5 = 0;
                        return;
                    } catch (IOException unused) {
                        throw new IOException("Broken AIDE dropbox sync info. Please download your folder again.");
                    }
                }
                throw new IOException("This directory was downloaded with an older version. Please download your folder again.");
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -695522830257917125L, null, str);
                }
                throw th;
            }
        }
    }
}
