package com.aide.ui.scm;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.od;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.CommitActivity;
import com.aide.ui.scm.IExternalGitService;
import com.aide.ui.scm.IExternalGitServiceListener;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@cy(clazz = 3235060073818781472L, container = 3235060073818781472L, user = true)
/* loaded from: classes.dex */
public class GitService {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -157996579209826989L)
    private ServiceConnection DW;

    @dy(field = -397780969738916992L)
    private ThreadPoolExecutor FH;

    @dy(field = 1734639079510962387L)
    private t Hw;

    @dy(field = -2459243201407438853L)
    private IExternalGitService j6;

    @dy(field = -2708227705111160448L)
    private Object v5;

    @cy(clazz = 2385233825343154479L, container = 3235060073818781472L, user = true)
    class a implements Runnable {

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -110012870553457480L)
        final /* synthetic */ String WB;

        @dy(field = 1819901731347320888L)
        final /* synthetic */ v fY;

        @dy(field = -6212081461186997268L)
        final /* synthetic */ t jw;

        @dy(field = 6617361700603276705L)
        final /* synthetic */ List mb;

        @cy(clazz = 3925628483013942700L, container = 3235060073818781472L, user = true)
        /* renamed from: com.aide.ui.scm.GitService$a$a, reason: collision with other inner class name */
        class RunnableC0075a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(RunnableC0075a.class);
            }

            @ey(method = 127823434660962240L)
            RunnableC0075a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -55254913048080621L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(2580716175956273747L, this);
                    }
                    a.this.jw.HT(a.this.fY);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 2580716175956273747L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 1454344170931968871L)
        a(String str, List list, t tVar, v vVar) {
            this.WB = str;
            this.mb = list;
            this.jw = tVar;
            this.fY = vVar;
        }

        @Override // java.lang.Runnable
        @ey(method = -293184797636944608L)
        public void run() {
            try {
                if (k2) {
                    iy.gn(2577560584568823920L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.yj(this.WB, this.mb, this.jw);
                    ServiceContainer.aj(new RunnableC0075a());
                } catch (RemoteException e) {
                    this.jw.ya(e, this.fY);
                }
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 2577560584568823920L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385289062643644380L, container = 3235060073818781472L, user = true)
    class b implements Runnable {

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -3007407361767238388L)
        final /* synthetic */ String WB;

        @dy(field = 5255644908537217260L)
        final /* synthetic */ w fY;

        @dy(field = 1259800594372399464L)
        final /* synthetic */ t jw;

        @dy(field = 4500218902127652224L)
        final /* synthetic */ String mb;

        @cy(clazz = 3925965197756883447L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -5496091945766965872L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -165038296698477888L)
            a(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = 2320659986288462280L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(1486746834357737337L, this);
                    }
                    b.this.jw.qI(b.this.fY, this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1486746834357737337L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = 3783944280746269200L)
        b(String str, String str2, t tVar, w wVar) {
            this.WB = str;
            this.mb = str2;
            this.jw = tVar;
            this.fY = wVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 2246667110566881200L)
        public void run() {
            try {
                if (k2) {
                    iy.gn(1485344822959616656L, this);
                }
                try {
                    GitService.this.ei();
                    ServiceContainer.aj(new a(GitService.this.j6.JT(this.WB, this.mb, this.jw)));
                } catch (RemoteException e) {
                    this.jw.ya(e, this.fY);
                }
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 1485344822959616656L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385344299948197575L, container = 3235060073818781472L, user = true)
    class c implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -2170769527624335120L)
        final /* synthetic */ String WB;

        @dy(field = 6265848996179840160L)
        final /* synthetic */ t mb;

        @cy(clazz = 3926301924214181632L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 499265856646612832L)
            final /* synthetic */ List WB;

            @dy(field = 2654127521491158713L)
            final /* synthetic */ String mb;

            @cy(clazz = -2293428383585696745L, container = 3235060073818781472L, user = true)
            /* renamed from: com.aide.ui.scm.GitService$c$a$a, reason: collision with other inner class name */
            class C0076a implements ValueRunnable<Integer> {

                @fy
                private static /* synthetic */ boolean FH;

                @gy
                private static /* synthetic */ boolean Hw;

                @dy(field = -1725936998953973093L)
                final /* synthetic */ List j6;

                @cy(clazz = 3823456665060605644L, container = 3235060073818781472L, user = true)
                /* renamed from: com.aide.ui.scm.GitService$c$a$a$a, reason: collision with other inner class name */
                class RunnableC0077a implements Runnable {

                    @gy
                    private static /* synthetic */ boolean fY;

                    @fy
                    private static /* synthetic */ boolean jw;

                    @dy(field = 5925370870914666489L)
                    final /* synthetic */ String WB;

                    static {
                        iy.Zo(RunnableC0077a.class);
                    }

                    @ey(method = 367430297924132920L)
                    RunnableC0077a(String str) {
                        this.WB = str;
                    }

                    @Override // java.lang.Runnable
                    @ey(method = 2138474803698871203L)
                    public void run() {
                        try {
                            if (jw) {
                                iy.gn(746551031840717285L, this);
                            }
                            GitService.this.gW(c.this.WB, this.WB);
                        } catch (Throwable th) {
                            if (fY) {
                                iy.aM(th, 746551031840717285L, this);
                            }
                            throw th;
                        }
                    }
                }

                static {
                    iy.Zo(C0076a.class);
                }

                @ey(method = -52648393438434672L)
                C0076a(List list) {
                    this.j6 = list;
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = 1086405805810785996L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(Integer num) {
                    try {
                        if (FH) {
                            iy.tp(-123928095829563900L, this, num);
                        }
                        String str = (String) this.j6.get(num.intValue());
                        if (str.endsWith(" (current)")) {
                            return;
                        }
                        MessageBox.rN(ServiceContainer.getMainActivity(), "Git", "Really delete branch '" + str + "'?", new RunnableC0077a(str), null);
                    } catch (Throwable th) {
                        if (Hw) {
                            iy.j3(th, -123928095829563900L, this, num);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = 2426766884016643299L)
            a(List list, String str) {
                this.WB = list;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -2010398754196299537L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(745620238222715232L, this);
                    }
                    if (c.this.mb.HT(null) && !this.WB.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < this.WB.size(); i++) {
                            String str = (String) this.WB.get(i);
                            if (!str.startsWith("remotes/")) {
                                if (str.equals(this.mb)) {
                                    str = str + " (current)";
                                }
                                arrayList.add(GitService.this.U2(str));
                            }
                        }
                        MessageBox.u7(ServiceContainer.getMainActivity(), "Select branch to delete", arrayList, new C0076a(arrayList));
                    }
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, 745620238222715232L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = 548190088174044183L)
        c(String str, t tVar) {
            this.WB = str;
            this.mb = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 1214716662756111620L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(744689928797538269L, this);
                }
                try {
                    GitService.this.ei();
                    String strZg = GitService.this.j6.zg(this.WB, this.mb);
                    ServiceContainer.aj(new a(strZg != null ? GitService.this.j6.cS(this.WB, this.mb) : new ArrayList<>(), strZg));
                } catch (RemoteException e) {
                    this.mb.ya(e, null);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 744689928797538269L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385399537256814064L, container = 3235060073818781472L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -4386881883937122224L)
        final /* synthetic */ String WB;

        @dy(field = -336677253821069796L)
        final /* synthetic */ t jw;

        @dy(field = -664779061824254108L)
        final /* synthetic */ String mb;

        @cy(clazz = 3926638662385837255L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 40793398778041440L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 981361581991227180L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(987015908819775744L, this);
                    }
                    d.this.jw.HT(null);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 987015908819775744L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = -4148094204943892511L)
        d(String str, String str2, t tVar) {
            this.WB = str;
            this.mb = str2;
            this.jw = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = -1821118986293715680L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(983057164578037141L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.MN(this.WB, this.mb, this.jw);
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.jw.ya(e, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 983057164578037141L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385454774569493847L, container = 3235060073818781472L, user = true)
    class e implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 679146097540182048L)
        final /* synthetic */ String WB;

        @dy(field = 4950395602678700408L)
        final /* synthetic */ t mb;

        @cy(clazz = 3926975412271850316L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -2040768618101608400L)
            final /* synthetic */ List WB;

            @dy(field = -2635574826532284685L)
            final /* synthetic */ String mb;

            @cy(clazz = -2089447991608041057L, container = 3235060073818781472L, user = true)
            /* renamed from: com.aide.ui.scm.GitService$e$a$a, reason: collision with other inner class name */
            class C0078a implements ValueRunnable<Integer> {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                static {
                    iy.Zo(C0078a.class);
                }

                @ey(method = 178403103224970067L)
                C0078a() {
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = -2556661377353206536L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(Integer num) {
                    try {
                        if (DW) {
                            iy.tp(8489094375109260825L, this, num);
                        }
                        String str = (String) a.this.WB.get(num.intValue());
                        if (str.endsWith(" (current)")) {
                            return;
                        }
                        GitService.this.ca(e.this.WB, GitService.this.U2(a.this.mb), str);
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, 8489094375109260825L, this, num);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = -769049172758579916L)
            a(List list, String str) {
                this.WB = list;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -962987568026750763L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-899113205901043552L, this);
                    }
                    if (e.this.mb.HT(null) && !this.WB.isEmpty()) {
                        for (int i = 0; i < this.WB.size(); i++) {
                            String str = (String) this.WB.get(i);
                            if (str.equals(this.mb)) {
                                str = str + " (current)";
                            }
                            this.WB.set(i, GitService.this.U2(str));
                        }
                        MessageBox.u7(ServiceContainer.getMainActivity(), "Select branch to merge", this.WB, new C0078a());
                    }
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -899113205901043552L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        @ey(method = -680527697987463067L)
        e(String str, t tVar) {
            this.WB = str;
            this.mb = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = -810995712811394880L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-899040880039612195L, this);
                }
                try {
                    GitService.this.ei();
                    String strZg = GitService.this.j6.zg(this.WB, this.mb);
                    ServiceContainer.aj(new a(strZg != null ? GitService.this.j6.cS(this.WB, this.mb) : new ArrayList<>(), strZg));
                } catch (RemoteException e) {
                    this.mb.ya(e, null);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -899040880039612195L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385510011886236924L, container = 3235060073818781472L, user = true)
    class f implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -1061721787154874351L)
        final /* synthetic */ String WB;

        @dy(field = -3528322320996386093L)
        final /* synthetic */ String mb;

        @cy(clazz = 3927312173872220815L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 223972147230834024L)
            final /* synthetic */ t WB;

            @cy(clazz = -1987429651932726720L, container = 3235060073818781472L, user = true)
            /* renamed from: com.aide.ui.scm.GitService$f$a$a, reason: collision with other inner class name */
            class RunnableC0079a implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(RunnableC0079a.class);
                }

                @ey(method = 424508485051093612L)
                RunnableC0079a() {
                }

                @Override // java.lang.Runnable
                @ey(method = 1905639910766100048L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-1971006482607071760L, this);
                        }
                        a.this.WB.HT(null);
                        GitService.this.jJ(f.this.WB);
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -1971006482607071760L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = 6101995711061906791L)
            a(t tVar) {
                this.WB = tVar;
            }

            @Override // java.lang.Runnable
            @ey(method = -2313419048946767916L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-1974190699795406767L, this);
                    }
                    try {
                        GitService.this.j6.HE(f.this.WB, f.this.mb, this.WB);
                        ServiceContainer.aj(new RunnableC0079a());
                    } catch (RemoteException e) {
                        this.WB.ya(e, null);
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1974190699795406767L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(f.class);
        }

        @ey(method = 624736876993320135L)
        f(String str, String str2) {
            this.WB = str;
            this.mb = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = -1828150135738616091L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-1977374432790916684L, this);
                }
                if (GitService.this.Qq("Git merge...", "Merging branches...", true)) {
                    ServiceContainer.getOpenFileService().KD(false, false);
                    GitService.this.FH.execute(new a(GitService.this.Hw));
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -1977374432790916684L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385565249207043295L, container = 3235060073818781472L, user = true)
    class g implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 3356243858547021327L)
        final /* synthetic */ String WB;

        @dy(field = 3435574999988452879L)
        final /* synthetic */ String jw;

        @dy(field = -1162481245932949871L)
        final /* synthetic */ t mb;

        @cy(clazz = 3927648947186948752L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 4074566417526045232L)
            final /* synthetic */ List WB;

            @dy(field = 4722672577377418565L)
            final /* synthetic */ String mb;

            @cy(clazz = -1885392549799754721L, container = 3235060073818781472L, user = true)
            /* renamed from: com.aide.ui.scm.GitService$g$a$a, reason: collision with other inner class name */
            class C0080a implements ValueRunnable<Integer> {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                @cy(clazz = -2576650937149138356L, container = 3235060073818781472L, user = true)
                /* renamed from: com.aide.ui.scm.GitService$g$a$a$a, reason: collision with other inner class name */
                class RunnableC0081a implements Runnable {

                    @fy
                    private static /* synthetic */ boolean fY;

                    @gy
                    private static /* synthetic */ boolean qp;

                    @dy(field = -969998397290845011L)
                    final /* synthetic */ String WB;

                    @dy(field = -2075639039858159024L)
                    final /* synthetic */ String mb;

                    static {
                        iy.Zo(RunnableC0081a.class);
                    }

                    @ey(method = -1394860711935320128L)
                    RunnableC0081a(String str, String str2) {
                        this.WB = str;
                        this.mb = str2;
                    }

                    @Override // java.lang.Runnable
                    @ey(method = 2175469309727490725L)
                    public void run() {
                        try {
                            if (fY) {
                                iy.gn(-5761795954647230492L, this);
                            }
                            GitService.this.er(g.this.jw, this.WB, "refs/" + this.mb);
                        } catch (Throwable th) {
                            if (qp) {
                                iy.aM(th, -5761795954647230492L, this);
                            }
                            throw th;
                        }
                    }
                }

                static {
                    iy.Zo(C0080a.class);
                }

                @ey(method = 192802977879404685L)
                C0080a() {
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = 3638687460506379152L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(Integer num) {
                    try {
                        if (DW) {
                            iy.tp(513731841903313965L, this, num);
                        }
                        String str = (String) a.this.WB.get(num.intValue());
                        if (str.endsWith(" (current)")) {
                            return;
                        }
                        if (!str.startsWith("remotes/")) {
                            GitService.this.er(g.this.jw, str, null);
                            return;
                        }
                        String strSubstring = str.substring(str.lastIndexOf(47) + 1);
                        MessageBox.rN(ServiceContainer.getMainActivity(), "Git", "Create new local branch '" + strSubstring + "' tracking '" + str + "'?", new RunnableC0081a(strSubstring, str), null);
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, 513731841903313965L, this, num);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = 781002511934326211L)
            a(List list, String str) {
                this.WB = list;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            @ey(method = 1000164886108533603L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-5765202925284935055L, this);
                    }
                    if (g.this.mb.HT(null) && !this.WB.isEmpty()) {
                        for (int i = 0; i < this.WB.size(); i++) {
                            String str = (String) this.WB.get(i);
                            if (str.equals(this.mb)) {
                                str = str + " (current)";
                            }
                            this.WB.set(i, GitService.this.U2(str));
                        }
                        MessageBox.u7(ServiceContainer.getMainActivity(), "Select branch", this.WB, new C0080a());
                    }
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -5765202925284935055L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(g.class);
        }

        @ey(method = 535666184045700624L)
        g(String str, t tVar, String str2) {
            this.WB = str;
            this.mb = tVar;
            this.jw = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = 62147823725680287L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(-5768609411729814528L, this);
                }
                try {
                    GitService.this.ei();
                    String strZg = GitService.this.j6.zg(this.WB, this.mb);
                    ServiceContainer.aj(new a(strZg != null ? GitService.this.j6.cS(this.WB, this.mb) : new ArrayList<>(), strZg));
                } catch (RemoteException e) {
                    this.mb.ya(e, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -5768609411729814528L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385620486531912960L, container = 3235060073818781472L, user = true)
    class h implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 1615029719572049088L)
        final /* synthetic */ String WB;

        @dy(field = -437244289995685128L)
        final /* synthetic */ String jw;

        @dy(field = -6184906474800988080L)
        final /* synthetic */ t mb;

        @cy(clazz = 3927985732216034127L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2370741893433625933L)
            final /* synthetic */ String WB;

            @cy(clazz = -1783336685209125060L, container = 3235060073818781472L, user = true)
            /* renamed from: com.aide.ui.scm.GitService$h$a$a, reason: collision with other inner class name */
            class C0082a implements ValueRunnable<String> {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                static {
                    iy.Zo(C0082a.class);
                }

                @ey(method = 515259288631205739L)
                C0082a() {
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = -2345062768755355440L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(String str) {
                    try {
                        if (DW) {
                            iy.tp(-1218645484676695280L, this, str);
                        }
                        if (str.length() > 0) {
                            GitService.this.lg(h.this.jw, str);
                        }
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, -1218645484676695280L, this, str);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = -10410511969081800L)
            a(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -1408735272912983301L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-574864387844430560L, this);
                    }
                    h.this.mb.HT(null);
                    MessageBox.aM(ServiceContainer.gn(), "Git", "Branch from current branch '" + GitService.this.U2(this.WB) + "'. New branch name:", "", new C0082a());
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -574864387844430560L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(h.class);
        }

        @ey(method = -6898524259382212431L)
        h(String str, t tVar, String str2) {
            this.WB = str;
            this.mb = tVar;
            this.jw = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = 2184131399769141564L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(-575309141947929075L, this);
                }
                try {
                    GitService.this.ei();
                    ServiceContainer.aj(new a(GitService.this.j6.zg(this.WB, this.mb)));
                } catch (RemoteException e) {
                    this.mb.ya(e, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -575309141947929075L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385675723860845919L, container = 3235060073818781472L, user = true)
    class i implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -832415353859524239L)
        final /* synthetic */ String WB;

        @dy(field = 287891552294326475L)
        final /* synthetic */ t jw;

        @dy(field = -4680523830559709825L)
        final /* synthetic */ String mb;

        @cy(clazz = 3928322528959476940L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -143316893865336485L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -1142919140928468345L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-4361373803546556420L, this);
                    }
                    i.this.jw.HT(null);
                    Toast.makeText(ServiceContainer.gn(), "Switched to branch '" + i.this.mb + "'", 0).show();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -4361373803546556420L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(i.class);
        }

        @ey(method = 1598807899452831768L)
        i(String str, String str2, t tVar) {
            this.WB = str;
            this.mb = str2;
            this.jw = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 1628698082208266377L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(-4364594266001072675L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.wX(this.WB, this.mb, null, this.jw);
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.jw.ya(e, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -4364594266001072675L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2385730961193842172L, container = 3235060073818781472L, user = true)
    class j implements Runnable {

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -5591538865150289296L)
        final /* synthetic */ String WB;

        @dy(field = -6308986963010910039L)
        final /* synthetic */ t fY;

        @dy(field = -21331547548260291L)
        final /* synthetic */ String jw;

        @dy(field = 413153300019142479L)
        final /* synthetic */ String mb;

        @cy(clazz = 3928659337417277191L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -36424247053898475L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -2343030335825364108L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(229518919202318325L, this);
                    }
                    j.this.fY.HT(null);
                    Toast.makeText(ServiceContainer.gn(), "Switched to branch '" + j.this.jw + "'", 0).show();
                    GitService.this.jJ(j.this.mb);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 229518919202318325L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(j.class);
        }

        @ey(method = 4647952612733032944L)
        j(String str, String str2, String str3, t tVar) {
            this.WB = str;
            this.mb = str2;
            this.jw = str3;
            this.fY = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = -983667775576707625L)
        public void run() {
            try {
                if (k2) {
                    iy.gn(228988585149537740L, this);
                }
                try {
                    GitService.this.ei();
                    if (this.WB != null) {
                        GitService.this.j6.wX(this.mb, this.jw, this.WB, this.fY);
                    } else {
                        GitService.this.j6.cz(this.mb, this.jw, this.fY);
                    }
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.fY.ya(e, null);
                }
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 228988585149537740L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1768975604672999325L, container = 3235060073818781472L, user = true)
    class k implements ServiceConnection {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(k.class);
        }

        @ey(method = 14587999476755128L)
        k() {
        }

        @Override // android.content.ServiceConnection
        @ey(method = -1189029613453358820L)
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (mb) {
                    iy.EQ(5285379731776569360L, this, componentName, iBinder);
                }
                synchronized (GitService.this.v5) {
                    GitService.this.j6 = IExternalGitService.Sub.asInterface(iBinder);
                    GitService.this.v5.notify();
                }
                AppLog.VH("External Git service connected");
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 5285379731776569360L, this, componentName, iBinder);
                }
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        @ey(method = 470234931383948256L)
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                if (mb) {
                    iy.tp(4854616178795665128L, this, componentName);
                }
                synchronized (GitService.this.v5) {
                    GitService.this.j6 = null;
                }
                AppLog.VH("External Git service disconnected");
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 4854616178795665128L, this, componentName);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769019143152504220L, container = 3235060073818781472L, user = true)
    class l implements Runnable {

        @fy
        private static /* synthetic */ boolean AL;

        @gy
        private static /* synthetic */ boolean w9;

        @dy(field = -4661683323636557120L)
        final /* synthetic */ GitConfiguration WB;

        @dy(field = 1615815144192599389L)
        final /* synthetic */ List fY;

        @dy(field = -577877477531410088L)
        final /* synthetic */ String jw;

        @dy(field = -3467474684541299288L)
        final /* synthetic */ Runnable k2;

        @dy(field = -3971954111036652000L)
        final /* synthetic */ String mb;

        @dy(field = -4327466887751227173L)
        final /* synthetic */ t qp;

        @cy(clazz = 954354348307138275L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -121380754552049157L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -960845227055650816L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(157884489467636736L, this);
                    }
                    l.this.qp.HT(null);
                    if (l.this.k2 != null) {
                        l.this.k2.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 157884489467636736L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(l.class);
        }

        @ey(method = -1014350611080155049L)
        l(GitConfiguration gitConfiguration, String str, String str2, List list, t tVar, Runnable runnable) {
            this.WB = gitConfiguration;
            this.mb = str;
            this.jw = str2;
            this.fY = list;
            this.qp = tVar;
            this.k2 = runnable;
        }

        @Override // java.lang.Runnable
        @ey(method = -739128756014698273L)
        public void run() {
            try {
                if (AL) {
                    iy.gn(157331324833667655L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.of(this.WB, this.mb, this.jw, this.fY, this.qp);
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.qp.ya(e, null);
                }
            } catch (Throwable th) {
                if (w9) {
                    iy.aM(th, 157331324833667655L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769062681627945821L, container = 3235060073818781472L, user = true)
    class m implements Runnable {

        @gy
        private static /* synthetic */ boolean AL;

        @fy
        private static /* synthetic */ boolean zh;

        @dy(field = -4853619815370668800L)
        final /* synthetic */ GitConfiguration WB;

        @dy(field = 3762458410948391761L)
        final /* synthetic */ String fY;

        @dy(field = 6306880043528687088L)
        final /* synthetic */ String jw;

        @dy(field = -4198950092954057868L)
        final /* synthetic */ String mb;

        @dy(field = -6360843721617461463L)
        final /* synthetic */ t qp;

        @cy(clazz = 954506390256943680L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -142489732832523688L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 2491578591733724064L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-191241854021338141L, this);
                    }
                    m.this.qp.HT(null);
                    ServiceContainer.getFileBrowserService().Hw(new File(m.this.mb, m.this.jw).getPath());
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -191241854021338141L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(m.class);
        }

        @ey(method = 5325273881342365184L)
        m(GitConfiguration gitConfiguration, String str, String str2, String str3, t tVar) {
            this.WB = gitConfiguration;
            this.mb = str;
            this.jw = str2;
            this.fY = str3;
            this.qp = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 252649359826234973L)
        public void run() {
            try {
                if (zh) {
                    iy.gn(-191315548579994424L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.IE(this.WB, this.mb, this.jw, this.fY, this.qp);
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.qp.ya(e, null);
                }
            } catch (Throwable th) {
                if (AL) {
                    iy.aM(th, -191315548579994424L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769106220099324128L, container = 3235060073818781472L, user = true)
    class n implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 3793563988607921660L)
        final /* synthetic */ GitConfiguration WB;

        @dy(field = 2731303794772819161L)
        final /* synthetic */ t jw;

        @dy(field = -4651675395715699261L)
        final /* synthetic */ String mb;

        @cy(clazz = 954658443921106523L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -260850669780764720L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -713363550690050048L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(4848830644801239585L, this);
                    }
                    n.this.jw.HT(null);
                    GitService.this.jJ(n.this.mb);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 4848830644801239585L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(n.class);
        }

        @ey(method = 3782367298251828000L)
        n(GitConfiguration gitConfiguration, String str, t tVar) {
            this.WB = gitConfiguration;
            this.mb = str;
            this.jw = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 1163810509199524185L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(4846130833004826304L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.wN(this.WB, this.mb, this.jw);
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.jw.ya(e, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 4846130833004826304L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769149758566639141L, container = 3235060073818781472L, user = true)
    class o implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 3076300080263215800L)
        final /* synthetic */ String WB;

        @dy(field = 922949797387077152L)
        final /* synthetic */ String jw;

        @dy(field = -1580224158771203328L)
        final /* synthetic */ t mb;

        @cy(clazz = 954810509299626804L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 5501343578434908309L)
            final /* synthetic */ String WB;

            @cy(clazz = -1598814889423874325L, container = 3235060073818781472L, user = true)
            /* renamed from: com.aide.ui.scm.GitService$o$a$a, reason: collision with other inner class name */
            class RunnableC0083a implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(RunnableC0083a.class);
                }

                @ey(method = -998445085008621840L)
                RunnableC0083a() {
                }

                @Override // java.lang.Runnable
                @ey(method = 231914209286382989L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(3691856570850638496L, this);
                        }
                        GitService.this.vy(o.this.jw);
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, 3691856570850638496L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = -586252504464475457L)
            a(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -348332744057131161L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(3689284606596760547L, this);
                    }
                    o.this.mb.HT(null);
                    MessageBox.rN(ServiceContainer.gn(), "Git", "Push branch '" + GitService.this.U2(this.WB) + "' to remote?", new RunnableC0083a(), null);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 3689284606596760547L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(o.class);
        }

        @ey(method = 6408031051096245875L)
        o(String str, t tVar, String str2) {
            this.WB = str;
            this.mb = tVar;
            this.jw = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = -922453406019825208L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(3686713126535707688L, this);
                }
                try {
                    GitService.this.ei();
                    ServiceContainer.aj(new a(GitService.this.j6.zg(this.WB, this.mb)));
                } catch (RemoteException e) {
                    this.mb.ya(e, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 3686713126535707688L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769193297029890860L, container = 3235060073818781472L, user = true)
    class p implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 1087875567953939220L)
        final /* synthetic */ GitConfiguration WB;

        @dy(field = 2739055831155622341L)
        final /* synthetic */ t jw;

        @dy(field = 4418938122174564615L)
        final /* synthetic */ String mb;

        @cy(clazz = 954962586392504523L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -119173189874703768L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -456607309903881255L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(4870141370436836583L, this);
                    }
                    p.this.jw.HT(null);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 4870141370436836583L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(p.class);
        }

        @ey(method = 2753137511198430200L)
        p(GitConfiguration gitConfiguration, String str, t tVar) {
            this.WB = gitConfiguration;
            this.mb = str;
            this.jw = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = -1453342171495434675L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(4867210265958873936L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.Cd(this.WB, this.mb, this.jw);
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.jw.ya(e, null);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 4867210265958873936L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769236835489079285L, container = 3235060073818781472L, user = true)
    class q implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(q.class);
        }

        @ey(method = -107094624042503616L)
        q(GitService gitService) {
        }

        @Override // java.lang.Runnable
        @ey(method = -1226590398236333604L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-1593538779530048589L, this);
                }
                ServiceContainer.getMainActivity().IS(5);
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1593538779530048589L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769280373944204416L, container = 3235060073818781472L, user = true)
    class r implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 4481750627762897384L)
        final /* synthetic */ String WB;

        @dy(field = 269080591726418116L)
        final /* synthetic */ t mb;

        @cy(clazz = 955266775721332275L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -2238039875058501495L)
            final /* synthetic */ GitStatus WB;

            @dy(field = -4308650197981638432L)
            final /* synthetic */ String mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 3626885915779233820L)
            a(GitStatus gitStatus, String str) {
                this.WB = gitStatus;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -2255165163545619708L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-1587011180693994913L, this);
                    }
                    if (r.this.mb.HT(null)) {
                        if (this.WB.j6()) {
                            MessageBox.ei(ServiceContainer.gn(), "Git", "No modified files found.", null);
                        } else {
                            CommitActivity.rN(ServiceContainer.getMainActivity(), this.WB, this.mb);
                        }
                    }
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -1587011180693994913L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(r.class);
        }

        @ey(method = 1609577250089387805L)
        r(String str, t tVar) {
            this.WB = str;
            this.mb = tVar;
        }

        @Override // java.lang.Runnable
        @ey(method = 284308812415222320L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-1590275222208434296L, this);
                }
                try {
                    GitService.this.ei();
                    ServiceContainer.aj(new a(GitService.this.j6.el(this.WB, this.mb), GitService.this.j6.zg(this.WB, this.mb)));
                } catch (RemoteException e) {
                    this.mb.ya(e, null);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -1590275222208434296L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1769323912395266253L, container = 3235060073818781472L, user = true)
    class s implements Runnable {

        @fy
        private static /* synthetic */ boolean AL;

        @gy
        private static /* synthetic */ boolean w9;

        @dy(field = 3198215922847166581L)
        final /* synthetic */ GitConfiguration WB;

        @dy(field = 6717566372716214829L)
        final /* synthetic */ String fY;

        @dy(field = -5522016909548354824L)
        final /* synthetic */ List jw;

        @dy(field = -3541007781519110892L)
        final /* synthetic */ v k2;

        @dy(field = 4852072526139538644L)
        final /* synthetic */ String mb;

        @dy(field = 2535703041296440200L)
        final /* synthetic */ t qp;

        @cy(clazz = 955418887957282308L, container = 3235060073818781472L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -435580305441372000L)
            a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 378913533269378128L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-2637459904948188496L, this);
                    }
                    s.this.qp.HT(s.this.k2);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -2637459904948188496L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(s.class);
        }

        @ey(method = 2230332981381394825L)
        s(GitConfiguration gitConfiguration, String str, List list, String str2, t tVar, v vVar) {
            this.WB = gitConfiguration;
            this.mb = str;
            this.jw = list;
            this.fY = str2;
            this.qp = tVar;
            this.k2 = vVar;
        }

        @Override // java.lang.Runnable
        @ey(method = -2498357166774346752L)
        public void run() {
            try {
                if (AL) {
                    iy.gn(-2640011011661918925L, this);
                }
                try {
                    GitService.this.ei();
                    GitService.this.j6.Bl(this.WB, this.mb, this.jw, this.fY, this.qp);
                    ServiceContainer.aj(new a());
                } catch (RemoteException e) {
                    this.qp.ya(e, this.k2);
                }
            } catch (Throwable th) {
                if (w9) {
                    iy.aM(th, -2640011011661918925L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1537613841967648175L, container = 1537613841967648175L, user = true)
    public interface v extends w<Void> {
    }

    @cy(clazz = 2260718033610773100L, container = 2260718033610773100L, user = true)
    public interface w<TResult> {
        @ey(method = -5696937007763117849L)
        void DW();

        @ey(method = 1117647928130974928L)
        void FH();

        @ey(method = 2983413474802508895L)
        void j6(TResult tresult);
    }

    @cy(clazz = 2479444296980806175L, container = 2479444296980806175L, user = true)
    public interface x {
        @ey(method = 4910180248466339952L)
        void DW();

        @ey(method = -4507502485493672480L)
        void j6();
    }

    static {
        iy.Zo(GitService.class);
    }

    @ey(method = -2035126556465739100L)
    public GitService() {
        try {
            if (Zo) {
                iy.gn(2344099893394054368L, null);
            }
            this.v5 = new Object();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2344099893394054368L, null);
            }
            throw th;
        }
    }

    @ey(method = -3137328010034548160L)
    private GitConfiguration KD() {
        try {
            if (Zo) {
                iy.gn(6521983009212306377L, this);
            }
            return new GitConfiguration(AppPreferences.a8(), AppPreferences.U2(), AppPreferences.j3(), AppPreferences.Mr());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 6521983009212306377L, this);
            }
            throw th;
        }
    }

    @ey(method = -210509150121895728L)
    private boolean Mr() {
        try {
            if (Zo) {
                iy.gn(-927327180180018921L, this);
            }
            if (this.FH.getActiveCount() <= 0 && this.Hw == null) {
                this.Hw = new t(this, null);
                return false;
            }
            MessageBox.BT(ServiceContainer.gn(), "Git", "Running multiple Git operations at once is not allowed");
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -927327180180018921L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3304433117831598220L)
    public void OW() {
        try {
            if (Zo) {
                iy.gn(1777682142162572751L, this);
            }
            MessageBox.gW(ServiceContainer.gn(), new od());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 1777682142162572751L, this);
            }
            throw th;
        }
    }

    @ey(method = -4378306993424970921L)
    private boolean P8() {
        try {
            if (Zo) {
                iy.gn(2029275381730979428L, this);
            }
            synchronized (this.v5) {
                if (this.j6 != null || ServiceContainer.getContext().bindService(new Intent(ServiceContainer.getContext(), (Class<?>) ExternalGitService.class), this.DW, 1)) {
                    return true;
                }
                AppLog.DW("Could not bind to Gitservice");
                return false;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2029275381730979428L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 737574306273713335L)
    public boolean Qq(String str, String str2, boolean z) {
        try {
            if (Zo) {
                iy.we(-2940977017706911168L, this, str, str2, new Boolean(z));
            }
            if (Mr() || !P8()) {
                return false;
            }
            this.Hw.fY = str;
            this.Hw.qp = str2;
            if (!z) {
                return true;
            }
            OW();
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -2940977017706911168L, this, str, str2, new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2212574703835986900L)
    public String U2(String str) {
        try {
            if (Zo) {
                iy.tp(-671888150394899967L, this, str);
            }
            return str.startsWith("refs/heads/") ? str.substring(11) : str.startsWith("refs/") ? str.substring(5) : str;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -671888150394899967L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -606775164908865004L)
    public void ca(String str, String str2, String str3) {
        try {
            if (Zo) {
                iy.we(2582819157366863893L, this, str, str2, str3);
            }
            MessageBox.rN(ServiceContainer.gn(), "Git", "Merge branch '" + str3 + "' into current branch '" + str2 + "'?", new f(str, str3), null);
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 2582819157366863893L, this, str, str2, str3);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -449081694166501500L)
    public void ei() {
        try {
            if (Zo) {
                iy.gn(980426030954320743L, this);
            }
            synchronized (this.v5) {
                if (this.j6 == null) {
                    try {
                        this.v5.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 980426030954320743L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2951189502867752195L)
    public void er(String str, String str2, String str3) {
        try {
            if (Zo) {
                iy.we(-4307066603406768432L, this, str, str2, str3);
            }
            if (Qq("Git checkout...", "Checking out branch...", true)) {
                ServiceContainer.getOpenFileService().KD(false, false);
                t tVar = this.Hw;
                this.FH.execute(new j(str3, ro(str), str2, tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -4307066603406768432L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -5999233823272817847L)
    private boolean g3(File file) {
        try {
            if (Zo) {
                iy.tp(-1760201396206643236L, this, file);
            }
            return new File(file, ".git").exists();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1760201396206643236L, this, file);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4673660281987396752L)
    public void gW(String str, String str2) {
        try {
            if (Zo) {
                iy.EQ(1497675906621817043L, this, str, str2);
            }
            if (Qq("Git delete branch...", "Deleting branch...", true)) {
                ServiceContainer.getOpenFileService().KD(false, false);
                this.FH.execute(new d(str, str2, this.Hw));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 1497675906621817043L, this, str, str2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 7877500600074697317L)
    public void jJ(String str) {
        try {
            if (Zo) {
                iy.tp(-2668279989711895248L, this, str);
            }
            if (ServiceContainer.getProjectService().isOpenProject() && FileSystem.nw(str, ServiceContainer.getProjectService().getCurrentAppHome())) {
                ServiceContainer.getProjectService().et(null, false);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2668279989711895248L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2847449286192683028L)
    public void lg(String str, String str2) {
        try {
            if (Zo) {
                iy.EQ(1991555762425790019L, this, str, str2);
            }
            if (Qq("Git branch...", "Create branch...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new i(ro(str), str2, tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 1991555762425790019L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -1985467078202346984L)
    private String ro(String str) {
        try {
            if (Zo) {
                iy.tp(-1603427792901029091L, this, str);
            }
            if (FileSystem.sh(str)) {
                return null;
            }
            for (File file = new File(str); file != null; file = file.getParentFile()) {
                if (g3(file)) {
                    str = file.getPath();
                    return str;
                }
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1603427792901029091L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 563405479931649451L)
    private boolean sG() {
        try {
            if (Zo) {
                iy.gn(-662982577010263552L, this);
            }
            if (AppPreferences.a8() != null && AppPreferences.a8().length() > 0 && AppPreferences.U2() != null) {
                if (AppPreferences.U2().indexOf(64) > 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -662982577010263552L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 266650312302414015L)
    public void vy(String str) {
        try {
            if (Zo) {
                iy.tp(-64789661453874688L, this, str);
            }
            if (Qq("Git push...", "Connecting...", true)) {
                ServiceContainer.getOpenFileService().KD(false, false);
                t tVar = this.Hw;
                String strRo = ro(str);
                this.FH.execute(new p(KD(), strRo, tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -64789661453874688L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1603842583094683632L)
    private boolean x9() {
        try {
            if (Zo) {
                iy.gn(125623489706721705L, this);
            }
            return P8();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 125623489706721705L, this);
            }
            throw th;
        }
    }

    @ey(method = 1257251652840786339L)
    public void BT(String str, List<ModifiedFile> list, v vVar) {
        try {
            if (Zo) {
                iy.we(331253429491167296L, this, str, list, vVar);
            }
            if (Qq("Git discard...", "Discarding changes...", true)) {
                this.FH.execute(new a(str, list, this.Hw, vVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 331253429491167296L, this, str, list, vVar);
            }
            throw th;
        }
    }

    @ey(method = 3030032899993094976L)
    public boolean I(String str, String str2) {
        try {
            if (Zo) {
                iy.EQ(-466828870062628199L, this, str, str2);
            }
            if (str2.length() == 0 || str2.contains(File.separator)) {
                return false;
            }
            File file = new File(str, str2);
            if (file.exists()) {
                return false;
            }
            try {
                file.getCanonicalPath();
                return true;
            } catch (IOException unused) {
                return false;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -466828870062628199L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 4815630009613222620L)
    public boolean Mz(String str) {
        try {
            if (Zo) {
                iy.tp(-5361435099959247223L, this, str);
            }
            return ro(str) != null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -5361435099959247223L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 932680755774176568L)
    public String SI() {
        try {
            if (Zo) {
                iy.gn(295470131264593505L, this);
            }
            return this.Hw == null ? "" : this.Hw.fY;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 295470131264593505L, this);
            }
            throw th;
        }
    }

    @ey(method = 1227929130024621252L)
    public boolean Sf() {
        try {
            if (Zo) {
                iy.gn(289412157551418733L, this);
            }
            return this.Hw != null;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 289412157551418733L, this);
            }
            throw th;
        }
    }

    @ey(method = -2098144029895172712L)
    public void XG(String str) {
        try {
            if (Zo) {
                iy.tp(5828489929875830265L, this, str);
            }
            if (Qq("Git merge...", "Getting branches...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new e(ro(str), tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 5828489929875830265L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -62881026960142300L)
    public void XL(x xVar) {
        try {
            if (Zo) {
                iy.tp(6921807467227680157L, this, xVar);
            }
            if (this.Hw != null) {
                this.Hw.jw.add(xVar);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 6921807467227680157L, this, xVar);
            }
            throw th;
        }
    }

    @ey(method = 1300503540643383813L)
    public void XX(String str) {
        try {
            if (Zo) {
                iy.tp(1868100275192846400L, this, str);
            }
            if (!sG()) {
                MessageBox.ei(ServiceContainer.gn(), "Git", "User name and email not set in Git Source Control Settings.", new q(this));
            } else if (Qq("Git commit...", "Getting file status...", true)) {
                ServiceContainer.getOpenFileService().KD(false, false);
                t tVar = this.Hw;
                this.FH.execute(new r(ro(str), tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1868100275192846400L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1694157078087763641L)
    public void a8(String str, String str2, String str3) {
        try {
            if (Zo) {
                iy.we(-2037419442665544164L, this, str, str2, str3);
            }
            if (Qq("Git clone...", "Connecting...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new m(KD(), str, str2, str3, tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -2037419442665544164L, this, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -410290480982306249L)
    public boolean aM(String str) {
        try {
            if (Zo) {
                iy.tp(-866040551337888448L, this, str);
            }
            if (str != null) {
                if (Mz(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -866040551337888448L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3139032783338649600L)
    public void aj(String str) {
        try {
            if (Zo) {
                iy.tp(-4802064390100597765L, this, str);
            }
            if (Qq("Git push...", "Getting branch...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new o(ro(str), tVar, str));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -4802064390100597765L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2473975201864997072L)
    public void br(String str) {
        try {
            if (Zo) {
                iy.tp(-3651313864062930675L, this, str);
            }
            if (Qq("Git checkout...", "Getting branches...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new g(ro(str), tVar, str));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3651313864062930675L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -4280280121784648175L)
    public int cb() {
        try {
            if (Zo) {
                iy.gn(-6010447738065994256L, this);
            }
            if (this.Hw == null) {
                return 0;
            }
            return this.Hw.fh();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -6010447738065994256L, this);
            }
            throw th;
        }
    }

    @ey(method = -3719595908283202472L)
    public String cn(String str) {
        try {
            if (Zo) {
                iy.tp(-5179103919165598137L, this, str);
            }
            return ro(str) + "/.git";
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -5179103919165598137L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3571945043320169516L)
    public String dx() {
        try {
            if (Zo) {
                iy.gn(-3914420855294795391L, this);
            }
            return this.Hw == null ? "" : this.Hw.qp;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3914420855294795391L, this);
            }
            throw th;
        }
    }

    @ey(method = 2320284424185010272L)
    public void ef() {
        try {
            if (Zo) {
                iy.gn(-409250682629845705L, this);
            }
            this.FH = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            this.DW = new k();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -409250682629845705L, this);
            }
            throw th;
        }
    }

    @ey(method = -2015260001275799036L)
    public void j3() {
        try {
            if (Zo) {
                iy.gn(-2338056273299764329L, this);
            }
            this.Hw.hK = true;
            try {
                this.j6.cancel();
            } catch (RemoteException e2) {
                AppLog.v5(e2);
                MessageBox.P8(ServiceContainer.gn(), "Git", e2);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2338056273299764329L, this);
            }
            throw th;
        }
    }

    @ey(method = 2140873434924719040L)
    public void kQ(String str) {
        try {
            if (Zo) {
                iy.tp(5244838344184101025L, this, str);
            }
            if (Qq("Git branch...", "Getting branch...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new h(ro(str), tVar, str));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 5244838344184101025L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -2090032338345316293L)
    public void lp(x xVar) {
        try {
            if (Zo) {
                iy.tp(1229645090341940688L, this, xVar);
            }
            if (this.Hw != null) {
                this.Hw.jw.remove(xVar);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1229645090341940688L, this, xVar);
            }
            throw th;
        }
    }

    @ey(method = -272591514121628832L)
    public void nw(String str, w<String> wVar) {
        try {
            if (Zo) {
                iy.EQ(347557501230787785L, this, str, wVar);
            }
            if (x9()) {
                t tVar = new t(this, null);
                this.FH.execute(new b(ro(str), str, tVar, wVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 347557501230787785L, this, str, wVar);
            }
            throw th;
        }
    }

    @ey(method = 6192092013779559437L)
    public void rN(String str, String str2, List<String> list, Runnable runnable) {
        try {
            if (Zo) {
                iy.J0(2232017684539958580L, this, str, str2, list, runnable);
            }
            if (Qq("Git create...", "Creating...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new l(KD(), str, str2, list, tVar, runnable));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 2232017684539958580L, this, str, str2, list, runnable);
            }
            throw th;
        }
    }

    @ey(method = 4307379701456940911L)
    public int sh() {
        try {
            if (Zo) {
                iy.gn(-5206745698944209100L, this);
            }
            if (this.Hw == null) {
                return 0;
            }
            return this.Hw.ba();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -5206745698944209100L, this);
            }
            throw th;
        }
    }

    @ey(method = -1816562192661481871L)
    public void sy(String str) {
        try {
            if (Zo) {
                iy.tp(-3577779691982046720L, this, str);
            }
            if (Qq("Git pull...", "Connecting...", true)) {
                t tVar = this.Hw;
                String strRo = ro(str);
                this.FH.execute(new n(KD(), strRo, tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3577779691982046720L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 4451878303035720125L)
    public boolean vJ(String str) {
        try {
            if (Zo) {
                iy.tp(-1299997320481734512L, this, str);
            }
            if (str != null && !ServiceContainer.getProjectService().vJ(str) && !Mz(str)) {
                if (!FileSystem.sh(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1299997320481734512L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 4584093090744684995L)
    public void yO(String str) {
        try {
            if (Zo) {
                iy.tp(-6289046156803466176L, this, str);
            }
            if (Qq("Git delete branch...", "Getting branches...", true)) {
                t tVar = this.Hw;
                this.FH.execute(new c(ro(str), tVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -6289046156803466176L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1277199234364371328L)
    public void yS(String str, List<ModifiedFile> list, String str2, v vVar) {
        try {
            if (Zo) {
                iy.J0(-711805194359255229L, this, str, list, str2, vVar);
            }
            if (Qq("Git commit...", "Committing changes...", true)) {
                ServiceContainer.EQ().I(str);
                t tVar = this.Hw;
                this.FH.execute(new s(KD(), str, list, str2, tVar, vVar));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -711805194359255229L, this, str, list, str2, vVar);
            }
            throw th;
        }
    }

    @cy(clazz = -4403730823559769985L, container = -4403730823559769985L, user = true)
    private static class u<T> implements Future<T> {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 444023204861539200L)
        private Object WB;

        @dy(field = 339581761377750905L)
        private T fY;

        @dy(field = 434214905649513515L)
        private boolean jw;

        @dy(field = -716524002392534640L)
        private boolean mb;

        static {
            iy.Zo(u.class);
        }

        @ey(method = 993964761917461736L)
        private u() {
            try {
                if (qp) {
                    iy.gn(2953290766460879169L, null);
                }
                this.WB = new Object();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 2953290766460879169L, null);
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.Future
        @ey(method = -510021786131019L)
        public boolean cancel(boolean z) {
            try {
                if (qp) {
                    iy.Ws(-18652685407335325L, this, z);
                }
                synchronized (this.WB) {
                    if (this.jw) {
                        return false;
                    }
                    this.mb = true;
                    this.WB.notifyAll();
                    return true;
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -18652685407335325L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.Future
        @ey(method = -214538380544612600L)
        public T get() {
            try {
                if (qp) {
                    iy.gn(105591002973887392L, this);
                }
                try {
                    return get(-1L, null);
                } catch (TimeoutException e) {
                    throw new IllegalStateException(e);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 105591002973887392L, this);
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.Future
        @ey(method = 4011474985617306087L)
        public boolean isCancelled() {
            boolean z;
            try {
                if (qp) {
                    iy.gn(717096261639189525L, this);
                }
                synchronized (this.WB) {
                    z = this.mb;
                }
                return z;
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 717096261639189525L, this);
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.Future
        @ey(method = -3190164184258094080L)
        public boolean isDone() {
            boolean z;
            try {
                if (qp) {
                    iy.gn(-2600867534634091920L, this);
                }
                synchronized (this.WB) {
                    z = this.jw;
                }
                return z;
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -2600867534634091920L, this);
                }
                throw th;
            }
        }

        @ey(method = 1099737662419871505L)
        public void j6(T t) {
            try {
                if (qp) {
                    iy.tp(899918432980905015L, this, t);
                }
                synchronized (this.WB) {
                    if (this.jw) {
                        throw new IllegalStateException();
                    }
                    if (this.mb) {
                        return;
                    }
                    this.jw = true;
                    this.fY = t;
                    this.WB.notifyAll();
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 899918432980905015L, this, t);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 298361674479035279L)
        /* synthetic */ u(k kVar) {
            this();
            try {
                if (qp) {
                    iy.tp(-472024554538951812L, null, kVar);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -472024554538951812L, null, kVar);
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.Future
        @ey(method = -2194265404245689532L)
        public T get(long j, TimeUnit timeUnit) {
            try {
                if (qp) {
                    iy.EQ(2566902187584534000L, this, new Long(j), timeUnit);
                }
                if (timeUnit != TimeUnit.MILLISECONDS) {
                    synchronized (this.WB) {
                        if (this.jw) {
                            return this.fY;
                        }
                        if (!this.mb) {
                            if (j < 0) {
                                this.WB.wait();
                            } else {
                                this.WB.wait(j);
                            }
                            if (this.jw) {
                                return this.fY;
                            }
                            if (this.mb) {
                                throw new CancellationException();
                            }
                            throw new IllegalStateException();
                        }
                        throw new CancellationException();
                    }
                }
                throw new IllegalArgumentException();
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 2566902187584534000L, this, new Long(j), timeUnit);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 873297534694796477L, container = 873297534694796477L, user = true)
    private class t extends IExternalGitServiceListener.Sub {

        @fy
        private static /* synthetic */ boolean Z1;

        @gy
        private static /* synthetic */ boolean n5;

        @dy(field = 1525088707052031399L)
        private int AL;

        @dy(field = 2505735815887587985L)
        private String cT;

        @dy(field = -5249511074418012283L)
        private String fY;

        @dy(field = 875563745262691457L)
        private boolean hK;

        @dy(field = -6849920078857372472L)
        private List<x> jw;

        @dy(field = -3254537673537611859L)
        private int k2;

        @dy(field = 1398630783456366992L)
        @hy
        final /* synthetic */ GitService q7;

        @dy(field = -1813377838952396523L)
        private String qp;

        @dy(field = -4403350146090729075L)
        private int w9;

        @dy(field = 4329408018914419707L)
        private int zh;

        @cy(clazz = 375787747126588860L, container = 873297534694796477L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -2796526962220020975L)
            final /* synthetic */ RemoteException WB;

            @dy(field = 8303320575803824713L)
            final /* synthetic */ w mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -251111329362323760L)
            a(RemoteException remoteException, w wVar) {
                this.WB = remoteException;
                this.mb = wVar;
            }

            @Override // java.lang.Runnable
            @ey(method = -353112561476883407L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(468725586043283037L, this);
                    }
                    t.this.zf();
                    MessageBox.P8(ServiceContainer.gn(), "Git", this.WB);
                    ServiceContainer.getFileBrowserService().v5();
                    if (this.mb != null) {
                        this.mb.DW();
                    }
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, 468725586043283037L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 375804055113406711L, container = 873297534694796477L, user = true)
        class b implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -40590796901662260L)
            b(t tVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = 1164993434889672000L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(2505225501193304129L, this);
                    }
                    Toast.makeText(ServiceContainer.getContext(), "Out-of-memory exception in Git service. Make sure your VM heap size is high enough.", 1).show();
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, 2505225501193304129L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1032692155105789464L, container = 873297534694796477L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -4486993827225485360L)
            final /* synthetic */ int WB;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -3390083070639535413L)
            c(int i) {
                this.WB = i;
            }

            @Override // java.lang.Runnable
            @ey(method = 169934930051905312L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-447257350078236488L, this);
                    }
                    t.this.zh = this.WB;
                    t.this.h2();
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -447257350078236488L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1032746071531138359L, container = 873297534694796477L, user = true)
        class d implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -180151046549330952L)
            final /* synthetic */ String WB;

            @dy(field = 4143273926645665720L)
            final /* synthetic */ int mb;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 1691968646719839423L)
            d(String str, int i) {
                this.WB = str;
                this.mb = i;
            }

            @Override // java.lang.Runnable
            @ey(method = 1662744910059815776L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-1117794967926390359L, this);
                    }
                    t.this.qp = this.WB;
                    t.this.AL = this.mb;
                    t.this.h2();
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -1117794967926390359L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1032799987952423960L, container = 873297534694796477L, user = true)
        class e implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 1849049095338508809L)
            final /* synthetic */ int WB;

            static {
                iy.Zo(e.class);
            }

            @ey(method = 7283865648784411680L)
            e(int i) {
                this.WB = i;
            }

            @Override // java.lang.Runnable
            @ey(method = 127472594771567329L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-2446222350851367613L, this);
                    }
                    t.this.w9 = this.WB;
                    t.this.h2();
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2446222350851367613L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1032853904369646267L, container = 873297534694796477L, user = true)
        class f implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(f.class);
            }

            @ey(method = -48433026284833511L)
            f() {
            }

            @Override // java.lang.Runnable
            @ey(method = 278401736259541449L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(4867927610150907477L, this);
                    }
                    t.Bx(t.this);
                    t.this.w9 = t.this.AL;
                    t.this.h2();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 4867927610150907477L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1032907820782805280L, container = 873297534694796477L, user = true)
        class g implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -3706489014361113904L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(g.class);
            }

            @ey(method = -219518375188004228L)
            g(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = 939245864147058936L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-5461767084698340465L, this);
                    }
                    t.this.cT = this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -5461767084698340465L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1032961737191900999L, container = 873297534694796477L, user = true)
        class h implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 2462806555129298951L)
            final /* synthetic */ String WB;

            @dy(field = 2183494876852304263L)
            final /* synthetic */ u mb;

            @cy(clazz = -1596191526812254376L, container = 873297534694796477L, user = true)
            class a implements ValueRunnable<String> {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                static {
                    iy.Zo(a.class);
                }

                @ey(method = 2659005539326125L)
                a() {
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = -3434779704201757977L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(String str) {
                    try {
                        if (DW) {
                            iy.tp(-3347965848602327949L, this, str);
                        }
                        h.this.mb.j6(str);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, -3347965848602327949L, this, str);
                        }
                        throw th;
                    }
                }
            }

            @cy(clazz = -1596250329097614003L, container = 873297534694796477L, user = true)
            class b implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(b.class);
                }

                @ey(method = -13948648517250909L)
                b() {
                }

                @Override // java.lang.Runnable
                @ey(method = 907472154702654911L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(3075877450908034201L, this);
                        }
                        h.this.mb.cancel(false);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, 3075877450908034201L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(h.class);
            }

            @ey(method = 1837454933035048976L)
            h(String str, u uVar) {
                this.WB = str;
                this.mb = uVar;
            }

            @Override // java.lang.Runnable
            @ey(method = -1399733370570357240L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(3071927052216237072L, this);
                    }
                    t.this.uD();
                    MessageBox.Ws(ServiceContainer.gn(), "Git", this.WB, new a(), new b());
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, 3071927052216237072L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1033015653596933424L, container = 873297534694796477L, user = true)
        class i implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -1419130356680798872L)
            final /* synthetic */ String WB;

            @dy(field = -5412741972683354624L)
            final /* synthetic */ u mb;

            @cy(clazz = -1596315142567912307L, container = 873297534694796477L, user = true)
            class a implements ValueRunnable<String> {

                @fy
                private static /* synthetic */ boolean DW;

                @gy
                private static /* synthetic */ boolean FH;

                static {
                    iy.Zo(a.class);
                }

                @ey(method = 65054157001435815L)
                a() {
                }

                @Override // com.aide.common.ValueRunnable
                @ey(method = 5891692440850792576L)
                /* renamed from: DW, reason: merged with bridge method [inline-methods] */
                public void j6(String str) {
                    try {
                        if (DW) {
                            iy.tp(-3093141341854506641L, this, str);
                        }
                        i.this.mb.j6(str);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (FH) {
                            iy.j3(th, -3093141341854506641L, this, str);
                        }
                        throw th;
                    }
                }
            }

            @cy(clazz = -1596373942894764288L, container = 873297534694796477L, user = true)
            class b implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(b.class);
                }

                @ey(method = 69647291173621568L)
                b() {
                }

                @Override // java.lang.Runnable
                @ey(method = 400906387770316495L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-4591945744532595375L, this);
                        }
                        i.this.mb.cancel(false);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -4591945744532595375L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(i.class);
            }

            @ey(method = -791769384308473907L)
            i(String str, u uVar) {
                this.WB = str;
                this.mb = uVar;
            }

            @Override // java.lang.Runnable
            @ey(method = -1479791630661606675L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-4594523430512438940L, this);
                    }
                    t.this.uD();
                    MessageBox.j3(ServiceContainer.gn(), "Git", this.WB, "", new a(), new b());
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -4594523430512438940L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1033069569997902555L, container = 873297534694796477L, user = true)
        class j implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -3869613934476570240L)
            final /* synthetic */ String WB;

            @dy(field = -380990083145434896L)
            final /* synthetic */ u mb;

            @cy(clazz = -1596438746609212800L, container = 873297534694796477L, user = true)
            class a implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(a.class);
                }

                @ey(method = 23329310771981456L)
                a() {
                }

                @Override // java.lang.Runnable
                @ey(method = -2229005935065320541L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-4300683101221521832L, this);
                        }
                        j.this.mb.j6(Boolean.TRUE);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -4300683101221521832L, this);
                        }
                        throw th;
                    }
                }
            }

            @cy(clazz = -1596497544977557135L, container = 873297534694796477L, user = true)
            class b implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(b.class);
                }

                @ey(method = -7365541715050025L)
                b() {
                }

                @Override // java.lang.Runnable
                @ey(method = -624726122781590112L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-4297894216698047193L, this);
                        }
                        j.this.mb.j6(Boolean.FALSE);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -4297894216698047193L, this);
                        }
                        throw th;
                    }
                }
            }

            @cy(clazz = -1596556343341838176L, container = 873297534694796477L, user = true)
            class c implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(c.class);
                }

                @ey(method = -43602375648799440L)
                c() {
                }

                @Override // java.lang.Runnable
                @ey(method = 1963549514364884127L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-4295104847981747464L, this);
                        }
                        j.this.mb.cancel(false);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -4295104847981747464L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(j.class);
            }

            @ey(method = 428655502126486635L)
            j(String str, u uVar) {
                this.WB = str;
                this.mb = uVar;
            }

            @Override // java.lang.Runnable
            @ey(method = 1770563213949464375L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-4303471501552171381L, this);
                    }
                    t.this.uD();
                    MessageBox.er(ServiceContainer.gn(), "Git", this.WB, new a(), new b(), new c());
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -4303471501552171381L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -1033123486394808392L, container = 873297534694796477L, user = true)
        class k implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -52192297188858888L)
            final /* synthetic */ String WB;

            @dy(field = 1483576596740026349L)
            final /* synthetic */ u mb;

            @cy(clazz = -1596562338936155855L, container = 873297534694796477L, user = true)
            class a implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(a.class);
                }

                @ey(method = -46997295785121513L)
                a() {
                }

                @Override // java.lang.Runnable
                @ey(method = 824365543879928456L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-2918787704711382000L, this);
                        }
                        k.this.mb.j6(null);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -2918787704711382000L, this);
                        }
                        throw th;
                    }
                }
            }

            @cy(clazz = -1596621135345992544L, container = 873297534694796477L, user = true)
            class b implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(b.class);
                }

                @ey(method = 8573042425853745L)
                b() {
                }

                @Override // java.lang.Runnable
                @ey(method = -464144781543068052L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-2916647807452537665L, this);
                        }
                        k.this.mb.j6(null);
                        t.this.q7.OW();
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -2916647807452537665L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(k.class);
            }

            @ey(method = 451729727211718008L)
            k(String str, u uVar) {
                this.WB = str;
                this.mb = uVar;
            }

            @Override // java.lang.Runnable
            @ey(method = -615049797003625280L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-2920927117777401245L, this);
                    }
                    t.this.uD();
                    MessageBox.nw(ServiceContainer.gn(), "Git", this.WB, new a(), new b());
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -2920927117777401245L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(t.class);
        }

        @ey(method = -5239271515161288192L)
        private t(GitService gitService) {
            try {
                if (Z1) {
                    iy.tp(1445509195948342375L, null, gitService);
                }
                this.q7 = gitService;
                this.jw = new ArrayList();
                this.fY = "";
                this.qp = "";
                this.k2 = 0;
                this.zh = 1000000;
                this.AL = 1000000;
                this.w9 = 0;
                this.hK = false;
                this.cT = null;
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 1445509195948342375L, null, gitService);
                }
                throw th;
            }
        }

        @ey(method = 78851372880149181L)
        static /* synthetic */ int Bx(t tVar) {
            int i2 = tVar.k2;
            tVar.k2 = i2 + 1;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -1616079410798564016L)
        public boolean HT(v vVar) {
            try {
                if (Z1) {
                    iy.tp(1094250918933049984L, this, vVar);
                }
                return qI(vVar, null);
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 1094250918933049984L, this, vVar);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = -5122327523427965925L)
        public void h2() {
            try {
                if (Z1) {
                    iy.gn(-2496355917869108799L, this);
                }
                Iterator<x> it = this.jw.iterator();
                while (it.hasNext()) {
                    it.next().j6();
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, -2496355917869108799L, this);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 1736567703607806888L)
        public <TResult> boolean qI(w<TResult> wVar, TResult tresult) {
            try {
                if (Z1) {
                    iy.EQ(1460396482748140220L, this, wVar, tresult);
                }
                zf();
                if (this.hK) {
                    Toast.makeText(ServiceContainer.gn(), "Git operation cancelled.", 0).show();
                    if (wVar != null) {
                        wVar.FH();
                    }
                } else if (this.cT != null) {
                    MessageBox.BT(ServiceContainer.gn(), "Git", this.cT);
                    if (wVar != null) {
                        wVar.DW();
                    }
                } else {
                    if (wVar != null) {
                        wVar.j6(tresult);
                    }
                    ServiceContainer.getMainActivity().Z1();
                }
                if (this.hK) {
                    return false;
                }
                return this.cT == null;
            } catch (Throwable th) {
                if (n5) {
                    iy.Mr(th, 1460396482748140220L, this, wVar, tresult);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 4204921172083168225L)
        public void uD() {
            try {
                if (Z1) {
                    iy.gn(-2848605383250007213L, this);
                }
                Iterator<x> it = this.jw.iterator();
                while (it.hasNext()) {
                    it.next().DW();
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, -2848605383250007213L, this);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 2028467664579615105L)
        public <T> void ya(RemoteException remoteException, w<T> wVar) {
            try {
                if (Z1) {
                    iy.EQ(1156552083269696835L, this, remoteException, wVar);
                }
                AppLog.v5(remoteException);
                ServiceContainer.aj(new a(remoteException, wVar));
            } catch (Throwable th) {
                if (n5) {
                    iy.Mr(th, 1156552083269696835L, this, remoteException, wVar);
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ey(method = 417720072660783360L)
        public void zf() {
            try {
                if (Z1) {
                    iy.gn(-7572853683535108784L, this);
                }
                if (this.q7.Hw == this) {
                    this.q7.Hw = null;
                }
                h2();
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, -7572853683535108784L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = -1705001555761093023L)
        public void AJ(int i2) {
            try {
                if (Z1) {
                    iy.u7(-2817029078831009697L, this, i2);
                }
                ServiceContainer.aj(new e(i2));
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, -2817029078831009697L, this, new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = 74704903942797128L)
        public void J1() {
            try {
                if (Z1) {
                    iy.gn(3967841198049793680L, this);
                }
                ServiceContainer.aj(new b(this));
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, 3967841198049793680L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = -2560625470839195063L)
        public String Lg(String str) {
            try {
                if (Z1) {
                    iy.tp(1516480029136655915L, this, str);
                }
                u uVar = new u(null);
                ServiceContainer.aj(new j(str, uVar));
                try {
                    return ((Boolean) uVar.get()).toString();
                } catch (InterruptedException e2) {
                    AppLog.v5(e2);
                    return null;
                } catch (CancellationException unused) {
                    return null;
                } catch (ExecutionException e3) {
                    AppLog.v5(e3);
                    return null;
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 1516480029136655915L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = -4500232817857814784L)
        public void Yd(int i2) {
            try {
                if (Z1) {
                    iy.u7(-6498099324885938856L, this, i2);
                }
                ServiceContainer.aj(new c(i2));
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, -6498099324885938856L, this, new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 1202546668269415568L)
        public int ba() {
            try {
                if (Z1) {
                    iy.gn(-4919828411811448824L, this);
                }
                if (this.zh == 0) {
                    return 0;
                }
                return (this.k2 * 100) / this.zh;
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, -4919828411811448824L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = 5495965229546416625L)
        public void d4(String str, int i2) {
            try {
                if (Z1) {
                    iy.EQ(2193178676664344187L, this, str, new Integer(i2));
                }
                ServiceContainer.aj(new d(str, i2));
            } catch (Throwable th) {
                if (n5) {
                    iy.Mr(th, 2193178676664344187L, this, str, new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = -1001590142684342400L)
        public int fh() {
            try {
                if (Z1) {
                    iy.gn(7577599310818121100L, this);
                }
                if (this.AL == 0) {
                    return 0;
                }
                return (this.w9 * 100) / this.AL;
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, 7577599310818121100L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = -1562697244317992496L)
        public void gy() {
            try {
                if (Z1) {
                    iy.gn(824270367916167060L, this);
                }
                ServiceContainer.aj(new f());
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, 824270367916167060L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = -3075468684080147544L)
        public void iE(String str) {
            try {
                if (Z1) {
                    iy.tp(2269275181319053492L, this, str);
                }
                u uVar = new u(null);
                ServiceContainer.aj(new k(str, uVar));
                try {
                    try {
                        uVar.get();
                    } catch (ExecutionException e2) {
                        AppLog.v5(e2);
                    }
                } catch (InterruptedException e3) {
                    AppLog.v5(e3);
                } catch (CancellationException unused) {
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 2269275181319053492L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = 2441678595367935280L)
        public String jB(String str) {
            try {
                if (Z1) {
                    iy.tp(2830899804864029640L, this, str);
                }
                u uVar = new u(null);
                ServiceContainer.aj(new h(str, uVar));
                try {
                    return (String) uVar.get();
                } catch (InterruptedException e2) {
                    AppLog.v5(e2);
                    return null;
                } catch (CancellationException unused) {
                    return null;
                } catch (ExecutionException e3) {
                    AppLog.v5(e3);
                    return null;
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 2830899804864029640L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = 2157607030269126396L)
        public String nV(String str) {
            try {
                if (Z1) {
                    iy.tp(585920456056882488L, this, str);
                }
                u uVar = new u(null);
                ServiceContainer.aj(new i(str, uVar));
                try {
                    return (String) uVar.get();
                } catch (InterruptedException e2) {
                    AppLog.v5(e2);
                    return null;
                } catch (CancellationException unused) {
                    return null;
                } catch (ExecutionException e3) {
                    AppLog.v5(e3);
                    return null;
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 585920456056882488L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = -4285877776401076701L)
        public void oP() {
            try {
                if (Z1) {
                    iy.gn(-1404448796327268303L, this);
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.aM(th, -1404448796327268303L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitServiceListener
        @ey(method = -1433121980510184840L)
        public void qi(String str) {
            try {
                if (Z1) {
                    iy.tp(6530143217259482368L, this, str);
                }
                ServiceContainer.aj(new g(str));
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 6530143217259482368L, this, str);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 6161393021657815301L)
        /* synthetic */ t(GitService gitService, k kVar) {
            this(gitService);
            try {
                if (Z1) {
                    iy.EQ(-488483605346805408L, null, gitService, kVar);
                }
            } catch (Throwable th) {
                if (n5) {
                    iy.Mr(th, -488483605346805408L, null, gitService, kVar);
                }
                throw th;
            }
        }
    }
}
