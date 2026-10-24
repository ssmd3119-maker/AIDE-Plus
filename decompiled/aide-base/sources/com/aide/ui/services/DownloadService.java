package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.jd;
import abcd.wf;
import abcd.xf;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.StatFs;
import android.system.Os;
import android.widget.Toast;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.common.StreamUtilities;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.android.m;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.util.BuildGradle;
import com.aide.ui.util.FileSystem;
import com.aide.ui.util.MavenMetadataXml;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@cy(clazz = 144659656370786727L, container = 144659656370786727L, user = true)
/* loaded from: classes.dex */
public class DownloadService {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -4202060075032220128L)
    private static final String[] u7;

    @dy(field = -4738582443023003125L)
    private int Hw;

    @dy(field = 742594865030139220L)
    private String VH;

    @dy(field = 2804031065431800971L)
    private final ExecutorService executorService;

    @dy(field = 989806457798188968L)
    private long gn;

    @dy(field = 4433282344342142808L)
    private List<t> j6;

    @dy(field = 4562881294852079121L)
    private Task task;

    @dy(field = 8011871614383065288L)
    private String taskTitle;

    @dy(field = 2903019151407850277L)
    private int v5;

    @cy(clazz = -1312253098124156100L, container = 144659656370786727L, user = true)
    class DocsRunnable implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2139492581324251925L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(DocsRunnable.class);
        }

        @ey(method = 90582154857917127L)
        public DocsRunnable(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = 433204217483470209L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-396890463138729084L, this);
                }
                DownloadService.this.sG(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -396890463138729084L, this);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @cy(clazz = 1775716618827084105L, container = 1775716618827084105L, user = true)
    class DownloadMavenLibraries implements Callable<Void> {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 811756249331064113L)
        private Activity activity;

        @dy(field = 2048489441362397260L)
        private Runnable callbackRunnable;

        @dy(field = 2229073179026132600L)
        @hy
        final /* synthetic */ DownloadService downloadService;

        @dy(field = 896385643373546748L)
        private List<BuildGradle.MavenDependency> mavenDependencyList;

        @dy(field = 4132327847824836064L)
        private List<BuildGradle.RemoteRepository> remoteRepositoryList;

        static {
            iy.Zo(DownloadMavenLibraries.class);
        }

        @ey(method = 1636572046011079667L)
        public DownloadMavenLibraries(DownloadService downloadService, Activity activity, List<BuildGradle.MavenDependency> list, List<BuildGradle.RemoteRepository> list2, Runnable runnable) {
            try {
                if (Zo) {
                    iy.J8(730983366186194460L, null, downloadService, activity, list, list2, runnable);
                }
                this.downloadService = downloadService;
                this.activity = activity;
                this.callbackRunnable = runnable;
                this.mavenDependencyList = list;
                this.remoteRepositoryList = list2;
            } catch (Throwable th) {
                if (VH) {
                    iy.lg(th, 730983366186194460L, null, downloadService, activity, list, list2, runnable);
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.Callable
        @ey(method = 2363662118935744157L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Void call() {
            String str;
            String str2;
            String str3;
            ArrayList arrayList;
            Iterator<BuildGradle.MavenDependency> it;
            String metadataPath;
            String version;
            String artifactPath;
            String artifactUrl;
            String artifactPath2;
            String str4 = ".jar";
            String str5 = ".aar";
            String str6 = ".pom";
            try {
                if (Zo) {
                    iy.gn(-1470332521460336188L, this);
                }
                ArrayList arrayList2 = new ArrayList();
                for (BuildGradle.RemoteRepository remoteRepository : this.remoteRepositoryList) {
                    if (!arrayList2.contains(remoteRepository)) {
                        arrayList2.add(remoteRepository);
                    }
                }
                Iterator<BuildGradle.MavenDependency> it2 = this.mavenDependencyList.iterator();
                boolean z = false;
                final boolean z2 = false;
                int i = 0;
                while (it2.hasNext()) {
                    BuildGradle.MavenDependency next = it2.next();
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            BuildGradle.RemoteRepository remoteRepository2 = (BuildGradle.RemoteRepository) it3.next();
                            try {
                                String metadataUrl = MavenService.getMetadataUrl(remoteRepository2, next);
                                metadataPath = MavenService.getMetadataPath(remoteRepository2, next);
                                this.downloadService.rN(metadataUrl, metadataPath, z);
                            } catch (IOException unused) {
                            }
                            if (!new File(metadataPath).exists() || (version = new MavenMetadataXml().getConfiguration(metadataPath).getVersion(next.version)) == null) {
                                str = str4;
                                str2 = str5;
                                str3 = str6;
                            } else {
                                String artifactUrl2 = MavenService.getArtifactUrl(remoteRepository2, next, version, str6);
                                String artifactPath3 = MavenService.getArtifactPath(remoteRepository2, next, version, str6);
                                String artifactUrl3 = MavenService.getArtifactUrl(remoteRepository2, next, version, str5);
                                str3 = str6;
                                try {
                                    artifactPath = MavenService.getArtifactPath(remoteRepository2, next, version, str5);
                                    str2 = str5;
                                    try {
                                        artifactUrl = MavenService.getArtifactUrl(remoteRepository2, next, version, str4);
                                        artifactPath2 = MavenService.getArtifactPath(remoteRepository2, next, version, str4);
                                        str = str4;
                                    } catch (IOException unused2) {
                                        str = str4;
                                    }
                                } catch (IOException unused3) {
                                    str = str4;
                                    str2 = str5;
                                }
                                if ((!new File(artifactPath2).exists() && !new File(artifactPath).exists()) || !new File(artifactPath3).exists()) {
                                    DownloadService downloadService = this.downloadService;
                                    arrayList = arrayList2;
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        it = it2;
                                        try {
                                            sb.append(next.groupId);
                                            sb.append(":");
                                            sb.append(next.artifactId);
                                            sb.append(":");
                                            sb.append(version);
                                            String string = sb.toString();
                                            int i2 = i + 1;
                                            try {
                                                try {
                                                    downloadService.dx(string, (i * 100) / this.mavenDependencyList.size(), 0);
                                                    try {
                                                        this.downloadService.rN(artifactUrl2, artifactPath3, true);
                                                        try {
                                                            this.downloadService.rN(artifactUrl3, artifactPath, true);
                                                        } catch (IOException unused4) {
                                                        }
                                                        try {
                                                            try {
                                                                this.downloadService.rN(artifactUrl, artifactPath2, true);
                                                            } catch (IOException unused5) {
                                                            }
                                                        } catch (IOException unused6) {
                                                        }
                                                        if ((new File(artifactPath2).exists() || new File(artifactPath).exists()) && new File(artifactPath3).exists()) {
                                                            i = i2;
                                                            str6 = str3;
                                                            str5 = str2;
                                                            str4 = str;
                                                            arrayList2 = arrayList;
                                                            it2 = it;
                                                            z = false;
                                                            z2 = true;
                                                            break;
                                                        }
                                                    } catch (IOException unused7) {
                                                    }
                                                } catch (IOException unused8) {
                                                }
                                            } catch (IOException unused9) {
                                            }
                                            i = i2;
                                        } catch (IOException unused10) {
                                        }
                                    } catch (IOException unused11) {
                                    }
                                    str6 = str3;
                                    str5 = str2;
                                    str4 = str;
                                    arrayList2 = arrayList;
                                    it2 = it;
                                    z = false;
                                }
                                it = it2;
                                str6 = str3;
                                str5 = str2;
                                str4 = str;
                                arrayList2 = arrayList;
                                it2 = it;
                                z = false;
                            }
                            arrayList = arrayList2;
                            it = it2;
                            str6 = str3;
                            str5 = str2;
                            str4 = str;
                            arrayList2 = arrayList;
                            it2 = it;
                            z = false;
                        } else {
                            String str7 = str4;
                            String str8 = str5;
                            String str9 = str6;
                            ArrayList arrayList3 = arrayList2;
                            Iterator<BuildGradle.MavenDependency> it4 = it2;
                            if (Thread.interrupted()) {
                                throw new InterruptedException();
                            }
                            str6 = str9;
                            str5 = str8;
                            str4 = str7;
                            arrayList2 = arrayList3;
                            it2 = it4;
                            z = false;
                        }
                    }
                }
                ServiceContainer.aj(new Runnable() { // from class: com.aide.ui.services.DownloadService$MavenLibrariesCallable$Callback

                    @gy
                    private static /* synthetic */ boolean fY;

                    @fy
                    private static /* synthetic */ boolean jw;

                    static {
                        iy.Zo(DownloadService$MavenLibrariesCallable$Callback.class);
                    }

                    @Override // java.lang.Runnable
                    @ey(method = 194803595361618025L)
                    public void run() {
                        try {
                            if (jw) {
                                iy.gn(3576049162732019421L, this);
                            }
                            this.mb.downloadService.ro();
                            if (z2) {
                                this.mb.callbackRunnable.run();
                            }
                        } catch (Throwable th) {
                            if (fY) {
                                iy.aM(th, 3576049162732019421L, this);
                            }
                            throw th;
                        }
                    }
                });
                return null;
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, -1470332521460336188L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1312795053850221636L, container = 144659656370786727L, user = true)
    class MavenLibrariesRunnable implements Runnable {

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -3631598827787280440L)
        final /* synthetic */ Activity activity;

        @dy(field = -1242694269629408673L)
        final /* synthetic */ Runnable callbackRunnable;

        @dy(field = -4836367936406491227L)
        final /* synthetic */ List mavenDependencyList;

        @dy(field = -1120156847769609125L)
        final /* synthetic */ List remoteRepositoryList;

        static {
            iy.Zo(MavenLibrariesRunnable.class);
        }

        @ey(method = -5619486065488299441L)
        public MavenLibrariesRunnable(Activity activity, List list, List list2, Runnable runnable) {
            this.activity = activity;
            this.mavenDependencyList = list;
            this.remoteRepositoryList = list2;
            this.callbackRunnable = runnable;
        }

        @Override // java.lang.Runnable
        @ey(method = -372912922969434016L)
        public void run() {
            try {
                if (k2) {
                    iy.gn(-513541491045090960L, this);
                }
                if (DownloadService.this.task != null) {
                    MessageBox.gW(this.activity, new jd());
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = new HashSet(this.mavenDependencyList).iterator();
                while (it.hasNext()) {
                    arrayList.add((BuildGradle.MavenDependency) it.next());
                }
                DownloadService.this.task = new Task(DownloadService.this, this.activity, new DownloadMavenLibraries(DownloadService.this, this.activity, arrayList, this.remoteRepositoryList, this.callbackRunnable));
                DownloadService.this.taskTitle = "Downloading Maven Libraries";
                DownloadService.this.executorService.execute(DownloadService.this.task);
                MessageBox.gW(this.activity, new jd());
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, -513541491045090960L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5884104101721941200L, container = 5884104101721941200L, user = true)
    private class Task extends FutureTask<Void> {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2880281372734206215L)
        private Activity WB;

        @dy(field = -1169351099329746684L)
        @hy
        final /* synthetic */ DownloadService mb;

        @cy(clazz = 303068683987507281L, container = 5884104101721941200L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -36402089843410656L)
            public a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 2518656817458446949L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-2974048390518603420L, this);
                    }
                    if (Task.this.mb.task == Task.this) {
                        Task.this.mb.ro();
                        Task.this.mb.task = null;
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -2974048390518603420L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 303195281865669880L, container = 5884104101721941200L, user = true)
        class b implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2809990824511027320L)
            final /* synthetic */ InterruptedException WB;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 117249803466179601L)
            public b(InterruptedException interruptedException) {
                this.WB = interruptedException;
            }

            @Override // java.lang.Runnable
            @ey(method = 23148496856725308L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-2972259244106023527L, this);
                    }
                    if (Task.this.mb.task == Task.this) {
                        Task.this.mb.ro();
                        Task.this.mb.task = null;
                        MessageBox.P8(Task.this.WB, "Download error", this.WB);
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2972259244106023527L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 303321879747895773L, container = 5884104101721941200L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 1530030532924590984L)
            final /* synthetic */ ExecutionException WB;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -53479571057090304L)
            public c(ExecutionException executionException) {
                this.WB = executionException;
            }

            @Override // java.lang.Runnable
            @ey(method = 749762464940034000L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-2970469613500618544L, this);
                    }
                    if (Task.this.mb.task == Task.this) {
                        Task.this.mb.ro();
                        Task.this.mb.task = null;
                        if (!(this.WB.getCause() instanceof UnknownHostException) || this.WB.getCause().getMessage().contains(" ")) {
                            MessageBox.P8(Task.this.WB, "Download error", this.WB.getCause());
                            return;
                        }
                        MessageBox.BT(Task.this.WB, "Download error", "Host not found: " + this.WB.getCause().getMessage());
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2970469613500618544L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 303448477634184960L, container = 5884104101721941200L, user = true)
        class d implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 7834158992503056L)
            public d() {
            }

            @Override // java.lang.Runnable
            @ey(method = -2191758840502088329L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-2968679498702388471L, this);
                    }
                    if (Task.this.mb.task == Task.this) {
                        Task.this.mb.ro();
                        Task.this.mb.task = null;
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -2968679498702388471L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Task.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 292195037055316836L)
        public Task(DownloadService downloadService, Activity activity, Callable<Void> callable) {
            super(callable);
            try {
                if (jw) {
                    iy.we(-1596322257627964476L, null, downloadService, activity, callable);
                }
                this.mb = downloadService;
                this.WB = activity;
            } catch (Throwable th) {
                if (fY) {
                    iy.U2(th, -1596322257627964476L, null, downloadService, activity, callable);
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.FutureTask
        @ey(method = -2305601103037444791L)
        public void done() {
            try {
                if (jw) {
                    iy.gn(-1387865085839080236L, this);
                }
                if (isCancelled()) {
                    ServiceContainer.aj(new d());
                    return;
                }
                try {
                    try {
                        get();
                        ServiceContainer.aj(new a());
                    } catch (InterruptedException e) {
                        AppLog.v5(e);
                        ServiceContainer.aj(new b(e));
                    }
                } catch (ExecutionException e2) {
                    AppLog.v5(e2);
                    ServiceContainer.aj(new c(e2));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -1387865085839080236L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 288295980702322944L, container = 144659656370786727L, user = true)
    class a implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -197190898558543775L)
        public a(DownloadService downloadService) {
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((Activity) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // java.lang.Runnable
        @ey(method = -685545490027866244L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(806684139913369740L, this);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, ServiceContainer.P8, "aideOutdated")));
                intent.setFlags(1074266112);
                try {
                    j6(ServiceContainer.gn(), intent);
                } catch (ActivityNotFoundException unused) {
                    MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 806684139913369740L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 288317430184919457L, container = 144659656370786727L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -4697435487422770400L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -271637711177370408L)
        public b(DownloadService downloadService, Activity activity) {
            this.WB = activity;
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((Context) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // java.lang.Runnable
        @ey(method = 611527625102561464L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(808118469667349445L, this);
                }
                Intent launchIntentForPackage = this.WB.getPackageManager().getLaunchIntentForPackage("com.aide.ndk");
                if (launchIntentForPackage != null) {
                    j6(ServiceContainer.getContext(), launchIntentForPackage);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 808118469667349445L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 288338879671579264L, container = 144659656370786727L, user = true)
    class c implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 3960307596879801629L)
        final /* synthetic */ Activity WB;

        @dy(field = 237250230965252409L)
        final /* synthetic */ File mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 1112915658986606784L)
        public c(Activity activity, File file) {
            this.WB = activity;
            this.mb = file;
        }

        @Override // java.lang.Runnable
        @ey(method = -739274325783699537L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-5753072197656716016L, this);
                }
                DownloadService.this.I(this.WB, this.mb);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -5753072197656716016L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 288360329162302365L, container = 144659656370786727L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -4626036496895108775L)
        final /* synthetic */ int WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -5704006089026197131L)
        public d(int i) {
            this.WB = i;
        }

        @Override // java.lang.Runnable
        @ey(method = 1553904364036515447L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(87876525700315845L, this);
                }
                DownloadService.this.v5 = this.WB;
                DownloadService.this.cn();
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 87876525700315845L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 288381778657088760L, container = 144659656370786727L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -3194705546114369991L)
        final /* synthetic */ String WB;

        @dy(field = 5768936798028696096L)
        final /* synthetic */ int jw;

        @dy(field = 6464513109986500640L)
        final /* synthetic */ int mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 357124964389799607L)
        public e(String str, int i, int i2) {
            this.WB = str;
            this.mb = i;
            this.jw = i2;
        }

        @Override // java.lang.Runnable
        @ey(method = -2261081655959705640L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(-572253849773162640L, this);
                }
                DownloadService.this.VH = this.WB;
                DownloadService.this.Hw = this.mb;
                DownloadService.this.v5 = this.jw;
                DownloadService.this.cn();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -572253849773162640L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 288403228155938449L, container = 144659656370786727L, user = true)
    static /* synthetic */ class f {

        @dy(field = -177992788202894399L)
        static final /* synthetic */ int[] DW;

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 7944815469170499080L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(f.class);
                if (FH) {
                    iy.gn(-1734812296278077355L, null);
                }
                int[] iArr = new int[m.b.values().length];
                DW = iArr;
                try {
                    iArr[m.b.NOT_INSTALLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    DW[m.b.OUTDATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    DW[m.b.AIDE_OUTDATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    DW[m.b.EXPANSION_FILE_MISSING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    DW[m.b.INSTALLED_OK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                int[] iArr2 = new int[m.a.values().length];
                j6 = iArr2;
                try {
                    iArr2[m.a.NOT_INSTALLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    j6[m.a.OUTDATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -1734812296278077355L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1312388587061767425L, container = 144659656370786727L, user = true)
    class h implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -4790441995242122967L)
        final /* synthetic */ Activity WB;

        @dy(field = -398259101707764159L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 1237434801404170735L)
        public h(Activity activity, String str) {
            this.WB = activity;
            this.mb = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 781486597590120875L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(1601017098487986949L, this);
                }
                DownloadService.this.Sf(this.WB, this.mb);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 1601017098487986949L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1312524075995315456L, container = 144659656370786727L, user = true)
    class i implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(i.class);
        }

        @ey(method = -12835940762896893L)
        public i(DownloadService downloadService) {
        }

        @Override // java.lang.Runnable
        @ey(method = -1291325250005525096L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(-1373007535937820244L, this);
                }
                FireBaseLogEvent.tp("Offline docs installed");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1373007535937820244L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1312659564924800193L, container = 144659656370786727L, user = true)
    class j implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -4632871118512176024L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -182030336555960088L)
        public j(DownloadService downloadService, Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = -1273753349337581736L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(6741353871077771280L, this);
                }
                try {
                    FileSystem.VH(com.aide.ui.build.android.m.we().getPath());
                    Toast.makeText(ServiceContainer.getContext(), "Uninstalled support for native code.", 0).show();
                } catch (IOException e) {
                    MessageBox.P8(this.WB, "Uninstallation failed", e.getCause());
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 6741353871077771280L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1312930542771579785L, container = 144659656370786727L, user = true)
    class l implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(l.class);
        }

        @ey(method = -10967645885652936L)
        public l(DownloadService downloadService) {
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((Activity) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // java.lang.Runnable
        @ey(method = -153496552988152675L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(800951662825701820L, this);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, "com.aide.ndk29", "aideInstallNdkBinaries")));
                intent.setFlags(1074266112);
                try {
                    j6(ServiceContainer.gn(), intent);
                } catch (ActivityNotFoundException unused) {
                    MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 800951662825701820L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1313066031688874640L, container = 144659656370786727L, user = true)
    class m implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(m.class);
        }

        @ey(method = 76800360060231035L)
        public m(DownloadService downloadService) {
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((Activity) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // java.lang.Runnable
        @ey(method = -830712137248872144L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(802384055808381165L, this);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, "com.aide.ndk29", "aideInstallNdkSupport")));
                intent.setFlags(1074266112);
                try {
                    j6(ServiceContainer.gn(), intent);
                } catch (ActivityNotFoundException unused) {
                    MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 802384055808381165L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1313201520602106201L, container = 144659656370786727L, user = true)
    class n implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(n.class);
        }

        @ey(method = -9289621709003348L)
        public n(DownloadService downloadService) {
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((Activity) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // java.lang.Runnable
        @ey(method = -1460262752200186965L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(803816932983885600L, this);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, "com.aide.ndk", "aideInstallNdkSupport")));
                intent.setFlags(1074266112);
                try {
                    j6(ServiceContainer.gn(), intent);
                } catch (ActivityNotFoundException unused) {
                    MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 803816932983885600L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1313337009511274468L, container = 144659656370786727L, user = true)
    class o implements Runnable {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(o.class);
        }

        @ey(method = -248582180642315375L)
        public o(DownloadService downloadService) {
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((Activity) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // java.lang.Runnable
        @ey(method = -360048726026702832L)
        public void run() {
            try {
                if (WB) {
                    iy.gn(805250294352215125L, this);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, "com.aide.ndk", "aideInstallNdkSupport")));
                intent.setFlags(1074266112);
                try {
                    j6(ServiceContainer.gn(), intent);
                } catch (ActivityNotFoundException unused) {
                    MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 805250294352215125L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3145251390647306304L, container = -3145251390647306304L, user = true)
    private class p implements Callable<Void> {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        @dy(field = -2358735417931783149L)
        private final String DW;

        @dy(field = -1070877179123963525L)
        private final List<String> FH;

        @dy(field = -3600953705733070375L)
        private final List<String> Hw;

        @dy(field = -1086624133356398643L)
        private Runnable VH;

        @dy(field = -2377537357297047651L)
        private final List<Boolean> Zo;

        @dy(field = 3144640023032334131L)
        @hy
        final /* synthetic */ DownloadService gn;

        @dy(field = 3082869889477183360L)
        private Activity j6;

        @dy(field = 2198247884211197952L)
        private final List<Boolean> v5;

        @cy(clazz = -122792110765583071L, container = -3145251390647306304L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 2656578151117773409L)
            public a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -397668735862720560L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-3318727222986178887L, this);
                    }
                    p.this.gn.ro();
                    p.this.VH.run();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -3318727222986178887L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(p.class);
        }

        @ey(method = 24453236163896040L)
        public p(DownloadService downloadService, Activity activity, List<String> list, List<String> list2, List<Boolean> list3, List<Boolean> list4, String str, Runnable runnable) {
            try {
                if (u7) {
                    iy.QX(1974883876875097528L, null, new Object[]{downloadService, activity, list, list2, list3, list4, str, runnable});
                }
                this.gn = downloadService;
                this.FH = list;
                this.Hw = list2;
                this.v5 = list3;
                this.Zo = list4;
                this.DW = str;
                this.j6 = activity;
                this.VH = runnable;
            } catch (Throwable th) {
                if (tp) {
                    iy.rN(th, 1974883876875097528L, null, new Object[]{downloadService, activity, list, list2, list3, list4, str, runnable});
                }
                throw th;
            }
        }

        @ey(method = -4271541019289853188L)
        private void FH(String str, String str2) {
            try {
                if (u7) {
                    iy.EQ(-3941310768045594229L, this, str, str2);
                }
                new File(str, str2).getParentFile().mkdirs();
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, -3941310768045594229L, this, str, str2);
                }
                throw th;
            }
        }

        @ey(method = -84815219172732432L)
        private void Zo(String str, String str2) {
            try {
                if (u7) {
                    iy.EQ(1322617374622443525L, this, str, str2);
                }
                String str3 = "";
                String[] strArr = DownloadService.u7;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str4 = strArr[i];
                    if (str2.contains(str4)) {
                        str3 = str4;
                        break;
                    }
                    i++;
                }
                if (str3.isEmpty()) {
                    return;
                }
                for (String str5 : FileSystem.we(str)) {
                    if (str5.contains(str3) && !str5.contains(str2)) {
                        FileSystem.VH(str5);
                    }
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.Mr(th, 1322617374622443525L, this, str, str2);
                }
                throw th;
            }
        }

        @ey(method = 1669136765763900083L)
        private void v5(String str, String str2) {
            try {
                if (u7) {
                    iy.EQ(6163114749508265008L, this, str, str2);
                }
                ZipFile zipFile = new ZipFile(str2);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    ArrayList arrayList = new ArrayList();
                    while (enumerationEntries.hasMoreElements()) {
                        arrayList.add(enumerationEntries.nextElement());
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                        ZipEntry zipEntry = (ZipEntry) arrayList.get(i);
                        File file = new File(str, zipEntry.getName());
                        if (zipEntry.isDirectory()) {
                            file.mkdirs();
                        } else if (file.exists() && zipEntry.getSize() != -1 && file.length() == zipEntry.getSize()) {
                            continue;
                        } else {
                            FH(str, zipEntry.getName());
                            InputStream inputStream = zipFile.getInputStream(zipEntry);
                            try {
                                try {
                                    StreamUtilities.VH(inputStream, new FileOutputStream(file), false);
                                } finally {
                                }
                            } finally {
                                inputStream.close();
                            }
                        }
                        this.gn.cb((i * 100) / arrayList.size());
                    }
                    zipFile.close();
                    new File(str2).delete();
                } catch (Throwable th) {
                    zipFile.close();
                    throw th;
                }
            } catch (Throwable th2) {
                if (tp) {
                    iy.Mr(th2, 6163114749508265008L, this, str, str2);
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.Callable
        @ey(method = 2343864346493592160L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                if (u7) {
                    iy.gn(2173232752141261023L, this);
                }
                Hw();
                return null;
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, 2173232752141261023L, this);
                }
                throw th;
            }
        }

        @ey(method = 1428980225888223099L)
        public void Hw() {
            try {
                if (u7) {
                    iy.gn(1172204763922790700L, this);
                }
                if (!new File(this.DW).isDirectory() && !new File(this.DW).mkdirs()) {
                    throw new IOException("Could not create directory: " + this.DW);
                }
                IOException e = null;
                for (int i = 0; i < this.FH.size(); i++) {
                    try {
                        String str = this.FH.get(i);
                        String str2 = this.Hw.get(i);
                        boolean z = true;
                        boolean z2 = this.v5 != null && this.v5.get(i).booleanValue();
                        if (this.Zo == null || !this.Zo.get(i).booleanValue()) {
                            z = false;
                        }
                        File file = new File(new File(this.DW, str2).getPath() + ".tmp");
                        int i2 = i * 100;
                        this.gn.dx("Downloading " + str2, i2 / this.FH.size(), 0);
                        this.gn.rN(str, file.getPath(), z2);
                        if (z) {
                            this.gn.dx("Extracting " + str2, i2 / this.FH.size(), 0);
                            v5(this.DW + "/" + str2, file.getPath());
                            file.delete();
                            this.gn.dx("Removing old libraries", i2 / this.FH.size(), 50);
                            Zo(this.DW, str2);
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
                ServiceContainer.aj(new a());
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, 1172204763922790700L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -765257841527394565L, container = -765257841527394565L, user = true)
    private class r implements Callable<Void> {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 2031208876039285137L)
        private Activity DW;

        @dy(field = -1755860065172599344L)
        @hy
        final /* synthetic */ DownloadService FH;

        @dy(field = 2925924587991985125L)
        private final File j6;

        @cy(clazz = 1560133901322668256L, container = -765257841527394565L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 771581420635803568L)
            final /* synthetic */ String WB;

            @cy(clazz = 60122131467165859L, container = -765257841527394565L, user = true)
            /* renamed from: com.aide.ui.services.DownloadService$r$a$a, reason: collision with other inner class name */
            class RunnableC0086a implements Runnable {

                @fy
                private static /* synthetic */ boolean WB;

                @gy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(RunnableC0086a.class);
                }

                @ey(method = -157167170056800585L)
                public RunnableC0086a(a aVar) {
                }

                private static /* synthetic */ void j6(Object obj, Intent intent) {
                    ((Activity) obj).startActivity(intent);
                    iy.BT(obj, intent);
                }

                @Override // java.lang.Runnable
                @ey(method = 161702194652645793L)
                public void run() {
                    try {
                        if (WB) {
                            iy.gn(4063295283200855729L, this);
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, "com.aide.ndk", "aideuninstallNdkSupport")));
                        intent.setFlags(1074266112);
                        try {
                            j6(ServiceContainer.gn(), intent);
                        } catch (ActivityNotFoundException unused) {
                            MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
                        }
                    } catch (Throwable th) {
                        if (mb) {
                            iy.aM(th, 4063295283200855729L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = 580640927004743324L)
            public a(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -1444985886774545472L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(4060688088002713200L, this);
                    }
                    r.this.FH.ro();
                    FireBaseLogEvent.tp("NDK installed");
                    MessageBox.rN(r.this.DW, "NDK Support package can be uninstalled", this.WB, new RunnableC0086a(this), null);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 4060688088002713200L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(r.class);
        }

        @ey(method = 1847457920836429425L)
        public r(DownloadService downloadService, Activity activity, File file) {
            try {
                if (Hw) {
                    iy.we(7756105238798265680L, null, downloadService, activity, file);
                }
                this.FH = downloadService;
                this.j6 = file;
                this.DW = activity;
            } catch (Throwable th) {
                if (v5) {
                    iy.U2(th, 7756105238798265680L, null, downloadService, activity, file);
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.Callable
        @ey(method = -1936327786269343235L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                if (Hw) {
                    iy.gn(2129064633578234068L, this);
                }
                File fileFH = com.aide.ui.build.android.m.FH();
                if (!fileFH.isDirectory() && !fileFH.mkdirs()) {
                    throw new IOException("Could not create directory: " + fileFH.getPath());
                }
                this.FH.dx("Installing NDK support (might take several minutes)", 0, 0);
                String path = new File(fileFH, "busybox").getPath();
                if (Build.VERSION.SDK_INT >= 29) {
                    if (new File(path).exists() && !new File(path).delete()) {
                        throw new IOException("Could not delete " + path);
                    }
                    String str = ServiceContainer.getContext().getPackageManager().getApplicationInfo("com.aide.ndk29", 0).nativeLibraryDir;
                    AppLog.DW("Symlinking " + str + "/libbusybox.so to " + path);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("/libbusybox.so");
                    Os.symlink(sb.toString(), path);
                } else {
                    DownloadService.yS(this.DW, "busybox", path);
                }
                File file = new File(this.j6, "ndkinstall.sh");
                DownloadService.yS(this.DW, "ndkinstall.sh", file.getPath());
                this.FH.lg(path);
                List listAsList = Arrays.asList(path, "ash", file.getPath(), com.aide.ui.build.android.m.EQ());
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                wf wfVarJ6 = xf.j6(listAsList, fileFH.getPath(), null, true, null, null);
                if (wfVarJ6.DW() != 0) {
                    throw new IOException(this.FH.BT(wfVarJ6.j6(), wfVarJ6.DW()));
                }
                file.delete();
                com.aide.ui.build.android.m.U2();
                String str2 = "The NDK has been integrated into AIDE and the AIDE NDK Support package can now be safely uninstalled. Open Play Store to uninstall?";
                if (Build.VERSION.SDK_INT >= 29) {
                    str2 = "The NDK has been integrated into AIDE and the AIDE NDK Support package can now be safely uninstalled. Open Play Store to uninstall? The AIDE NDK Binaries (for Android 10+) package must remain on the device.";
                }
                ServiceContainer.aj(new a(str2));
                return null;
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 2129064633578234068L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1525146739908369424L, container = 1525146739908369424L, user = true)
    public interface t {
        @ey(method = 3702938930193966504L)
        void DW();

        @ey(method = -4009598089728222200L)
        void j6();
    }

    static {
        try {
            iy.Zo(DownloadService.class);
            if (tp) {
                iy.gn(-1734812296278077355L, null);
            }
            u7 = new String[]{"google_m2repository", "android_m2repository"};
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1734812296278077355L, null);
            }
            throw th;
        }
    }

    @ey(method = 2972143453638966745L)
    public DownloadService() {
        try {
            if (tp) {
                iy.gn(3401377218976517560L, null);
            }
            this.j6 = new ArrayList();
            this.executorService = Executors.newSingleThreadExecutor();
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 3401377218976517560L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -7689254782209305136L)
    public String BT(byte[] bArr, int i2) {
        try {
            if (tp) {
                iy.EQ(4582069672216390136L, this, bArr, new Integer(i2));
            }
            String strFH = "";
            try {
                strFH = StreamUtilities.FH(new InputStreamReader(new ByteArrayInputStream(bArr)));
            } catch (IOException unused) {
            }
            String strTrim = strFH.trim();
            if (strTrim.length() != 0) {
                strTrim = strTrim + '\n';
            }
            return strTrim + " ### binary exited with code " + i2;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 4582069672216390136L, this, bArr, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3431680285534130799L)
    public void I(Activity activity, File file) {
        try {
            if (tp) {
                iy.EQ(-436815280658991083L, this, activity, file);
            }
            if (this.task != null) {
                this.task.cancel(true);
                this.task = null;
            }
            Task task = new Task(this, activity, new r(this, activity, file));
            this.task = task;
            this.taskTitle = "Installing support for native code (C/C++)";
            this.executorService.execute(task);
            MessageBox.gW(activity, new jd());
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -436815280658991083L, this, activity, file);
            }
            throw th;
        }
    }

    @ey(method = -7154755893037973880L)
    private void Mz(Activity activity) {
        try {
            if (tp) {
                iy.tp(1581038918728490352L, this, activity);
            }
            com.aide.ui.build.android.m.DW();
            File file = new File(FileSystem.aM());
            if (er(FileSystem.yS(), 750000000L)) {
                I(activity, file);
                return;
            }
            MessageBox.rN(activity, "Download support for native code (C/C++)", "There does not seem to be enough space on internal storage. At least 200MB are required. Continue anyway?", new c(activity, file), null);
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 1581038918728490352L, this, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1035600556512919824L)
    public void Sf(Activity activity, String str) {
        try {
            if (tp) {
                iy.EQ(-635227546968661536L, this, activity, str);
            }
            AppPreferences.ca(str);
            if (this.task != null) {
                this.task.cancel(true);
                this.task = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (com.aide.ui.activities.a aVar : com.aide.ui.activities.a.QX()) {
                if (aVar.DW() != null && !arrayList.contains(aVar.FH())) {
                    arrayList.add(aVar.FH());
                    arrayList2.add(aVar.DW());
                    arrayList3.add(Boolean.valueOf(aVar.j6()));
                }
            }
            Task task = new Task(this, activity, new p(this, activity, arrayList, arrayList2, arrayList3, null, str, new i(this)));
            this.task = task;
            this.taskTitle = "Installing Docs";
            this.executorService.execute(task);
            MessageBox.gW(activity, new jd());
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -635227546968661536L, this, activity, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -103294737400022979L)
    public void cb(int i2) {
        try {
            if (tp) {
                iy.u7(-2857012969847673951L, this, i2);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.gn < 1000) {
                return;
            }
            this.gn = jCurrentTimeMillis;
            ServiceContainer.aj(new d(i2));
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -2857012969847673951L, this, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -6429436051174786783L)
    public void cn() {
        try {
            if (tp) {
                iy.gn(5745705053264358605L, this);
            }
            Iterator<t> it = this.j6.iterator();
            while (it.hasNext()) {
                it.next().j6();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 5745705053264358605L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3718113849926677885L)
    public void dx(String str, int i2, int i3) {
        try {
            if (tp) {
                iy.we(-2508467732859247959L, this, str, new Integer(i2), new Integer(i3));
            }
            this.gn = System.currentTimeMillis();
            ServiceContainer.aj(new e(str, i2, i3));
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -2508467732859247959L, this, str, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 628017763248795663L)
    private void ef(Activity activity, String str) {
        try {
            if (tp) {
                iy.EQ(-938275142224642797L, this, activity, str);
            }
            File file = new File(str);
            if (file.isAbsolute()) {
                while (file != null && !file.exists()) {
                    file = file.getParentFile();
                }
                if (file == null) {
                    return;
                }
                if (er(file.getPath(), com.aide.ui.activities.a.tp())) {
                    Sf(activity, str);
                    return;
                }
                MessageBox.rN(activity, "Download Docs", "There does not seem to be enough space on that filesystem. At least " + ((com.aide.ui.activities.a.tp() / 1000) / 1000) + "MB are temporarily required. Continue anyway?", new h(activity, str), null);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -938275142224642797L, this, activity, str);
            }
            throw th;
        }
    }

    @ey(method = -5956746909814501608L)
    private boolean er(String str, long j2) {
        try {
            if (tp) {
                iy.EQ(5421331127921477760L, this, str, new Long(j2));
            }
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > j2;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 5421331127921477760L, this, str, new Long(j2));
            }
            throw th;
        }
    }

    @ey(method = 2760131776093308360L)
    private void g3(Activity activity) {
        try {
            if (tp) {
                iy.tp(-1149880843046871000L, this, activity);
            }
            runTask(activity, "Download Docs", new DocsRunnable(activity));
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -1149880843046871000L, this, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1993651585384904421L)
    public void lg(String str) {
        try {
            if (tp) {
                iy.tp(-2514308002856759921L, this, str);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return;
            }
            try {
                wf wfVarJ6 = xf.j6(Arrays.asList("/system/bin/chmod", "755", str), null, null, true, null, null);
                if (wfVarJ6.DW() == 0) {
                    return;
                }
                throw new IOException("Could not make " + str + " executable - exit code " + wfVarJ6.DW());
            } catch (IOException unused) {
                wf wfVarJ62 = xf.j6(Arrays.asList("/system/xbin/chmod", "755", str), null, null, true, null, null);
                if (wfVarJ62.DW() == 0) {
                    return;
                }
                throw new IOException("Could not make " + str + " executable - exit code " + wfVarJ62.DW());
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -2514308002856759921L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 62385971052779160L)
    private boolean nw(int i2) {
        try {
            if (tp) {
                iy.u7(1102941307242553368L, this, i2);
            }
            return i2 >= 200 && i2 < 300;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 1102941307242553368L, this, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f9 A[Catch: all -> 0x021e, TRY_LEAVE, TryCatch #11 {all -> 0x021e, blocks: (B:104:0x01f1, B:105:0x01f4, B:97:0x01e3, B:108:0x01f9), top: B:152:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @abcd.ey(method = -3874464954827275745L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void rN(java.lang.String r30, java.lang.String r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.services.DownloadService.rN(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4575825327920922467L)
    public void ro() {
        try {
            if (tp) {
                iy.gn(3106041240484178775L, this);
            }
            Iterator<t> it = this.j6.iterator();
            while (it.hasNext()) {
                it.next().DW();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 3106041240484178775L, this);
            }
            throw th;
        }
    }

    @ey(method = -490872077590993365L)
    private void runTask(Activity activity, String str, Runnable runnable) {
        try {
            if (tp) {
                iy.we(1911670666599768663L, this, activity, str, runnable);
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                if (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 7 || activeNetworkInfo.getType() == 9) {
                    runnable.run();
                    return;
                } else {
                    MessageBox.rN(activity, str, "Do you really want to continue your download over mobile internet?", runnable, null);
                    return;
                }
            }
            MessageBox.rN(activity, str, "There seems to be no active network connection. Continue anyway?", runnable, null);
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, 1911670666599768663L, this, activity, str, runnable);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1347762535711949480L)
    public void sG(Activity activity) {
        try {
            if (tp) {
                iy.tp(94216401131110128L, this, activity);
            }
            if (this.task != null) {
                MessageBox.gW(activity, new jd());
                return;
            }
            ef(activity, FileSystem.yS() + "/docs");
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 94216401131110128L, this, activity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5229319481629725800L)
    @SuppressLint({"NewApi"})
    public static void yS(Context context, String str, String str2) {
        try {
            if (tp) {
                iy.we(-359937338776396056L, null, context, str, str2);
            }
            InputStream inputStreamOpen = context.createPackageContext("com.aide.ndk", 0).getAssets().open(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                try {
                    StreamUtilities.Zo(inputStreamOpen, fileOutputStream);
                    fileOutputStream.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -359937338776396056L, null, context, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -2392764584507845456L)
    public void Mr(t tVar) {
        try {
            if (tp) {
                iy.tp(-4764645981434530240L, this, tVar);
            }
            this.j6.add(tVar);
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -4764645981434530240L, this, tVar);
            }
            throw th;
        }
    }

    @ey(method = 3919190742319738880L)
    public int P8() {
        try {
            if (tp) {
                iy.gn(-3945926478657840480L, this);
            }
            return this.v5;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -3945926478657840480L, this);
            }
            throw th;
        }
    }

    @ey(method = -24671399635101440L)
    public boolean SI() {
        try {
            if (tp) {
                iy.gn(-319444074868741328L, this);
            }
            return this.task != null;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -319444074868741328L, this);
            }
            throw th;
        }
    }

    @ey(method = 3033258890975269001L)
    public void U2() {
        try {
            if (tp) {
                iy.gn(-1028873464844655003L, this);
            }
            this.task.cancel(true);
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1028873464844655003L, this);
            }
            throw th;
        }
    }

    @ey(method = -1608783678614650861L)
    public void a8(Activity activity, List<BuildGradle.MavenDependency> list, List<BuildGradle.RemoteRepository> list2, Runnable runnable) {
        try {
            if (tp) {
                iy.J0(-139018920714890249L, this, activity, list, list2, runnable);
            }
            runTask(activity, "Download Maven Libraries", new MavenLibrariesRunnable(activity, list, list2, runnable));
        } catch (Throwable th) {
            if (EQ) {
                iy.a8(th, -139018920714890249L, this, activity, list, list2, runnable);
            }
            throw th;
        }
    }

    @ey(method = 4707184316304631323L)
    public void ca(Activity activity, String str) {
        try {
            if (tp) {
                iy.EQ(-2159692624017865617L, this, activity, str);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                if (ServiceContainer.Sf()) {
                    MessageBox.BT(activity, "Native development (C/C++)", str + "\n\nNative development is not supported on X86 devices running Android 10 and above.");
                    return;
                }
                int i2 = f.j6[com.aide.ui.build.android.m.v5(activity).ordinal()];
                if (i2 == 1) {
                    MessageBox.rN(activity, "Install binaries for native code (C/C++)", str + "After installing the AIDE NDK Binaries (for Android 10+) package and the AIDE NDK Support package you can build apps using native-code languages such as C and C++. \n\nDownload the AIDE NDK Binaries (for Android 10+) package now?", new l(this), null);
                    return;
                }
                if (i2 == 2) {
                    MessageBox.rN(activity, "AIDE NDK Binaries package is outdated", str + "\n\nThe  AIDE NDK Binaries (for Android 10+) package is outdated. Open Play Store to update?", new m(this), null);
                    return;
                }
            }
            int i3 = f.DW[com.aide.ui.build.android.m.Ws(activity).ordinal()];
            if (i3 == 2) {
                MessageBox.rN(activity, "NDK Support package is outdated", str + "\n\nThe AIDE NDK Support package is outdated. Open Play Store to update?", new o(this), null);
                return;
            }
            if (i3 == 3) {
                MessageBox.rN(activity, "AIDE is outdated", str + "\n\nYour version of AIDE is outdated and does not support the updated AIDE NDK Support package. Open Play Store to update?", new a(this), null);
                return;
            }
            if (i3 == 4) {
                MessageBox.rN(activity, "Install support for native code (C/C++)", str + "\n\nThe AIDE NDK Support Package has not been completely installed. Open AIDE NDK Support Package to download expansion file?", new b(this, activity), null);
                return;
            }
            if (i3 == 5) {
                Mz(activity);
                return;
            }
            MessageBox.rN(activity, "Install support for native code (C/C++)", str + "\n\nAfter installing support for native code you can build apps using native-code languages such as C and C++. The native code support takes about 750MB of space on internal storage space once installed.\n\nDownload native code support package now?", new n(this), null);
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -2159692624017865617L, this, activity, str);
            }
            throw th;
        }
    }

    @ey(method = 1703126249704941720L)
    public void downloadDocs(Activity activity) {
        try {
            if (tp) {
                iy.tp(216170759644784888L, this, activity);
            }
            if (ServiceContainer.getLicenseService().VH(activity, "offline_docs")) {
                g3(activity);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 216170759644784888L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = -739434652624283265L)
    public String ei() {
        try {
            if (tp) {
                iy.gn(889241999412804771L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 889241999412804771L, this);
            }
            throw th;
        }
    }

    @ey(method = 211576240180982895L)
    public String getTaskTitle() {
        try {
            if (tp) {
                iy.gn(-258467314333153413L, this);
            }
            return this.taskTitle;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -258467314333153413L, this);
            }
            throw th;
        }
    }

    @ey(method = 1186793470320103173L)
    public void sh(t tVar) {
        try {
            if (tp) {
                iy.tp(-117280532438165727L, this, tVar);
            }
            this.j6.remove(tVar);
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -117280532438165727L, this, tVar);
            }
            throw th;
        }
    }

    @ey(method = -3057035550210770440L)
    public int vy() {
        try {
            if (tp) {
                iy.gn(-4719786361984446696L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -4719786361984446696L, this);
            }
            throw th;
        }
    }

    @ey(method = 697575629567039236L)
    public void x9(Activity activity) {
        try {
            if (tp) {
                iy.tp(3009125045795206316L, this, activity);
            }
            if (com.aide.ui.build.android.m.Mr()) {
                MessageBox.rN(activity, "Support for native code (C/C++)", "Uninstall support for native code?", new j(this, activity), null);
            } else {
                ca(activity, "");
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 3009125045795206316L, this, activity);
            }
            throw th;
        }
    }
}
