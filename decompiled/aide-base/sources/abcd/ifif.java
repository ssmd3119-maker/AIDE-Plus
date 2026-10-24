package abcd;

import android.app.Activity;
import android.widget.Toast;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.common.StreamUtilities;
import com.aide.ui.ServiceContainer;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@cy(clazz = 1486310305192075776L, container = 1486310305192075776L, user = true)
/* loaded from: classes.dex */
public class ifif {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 3507201269951266239L, container = 1486310305192075776L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -3175978292982128043L)
        final /* synthetic */ Activity WB;

        @dy(field = 2397782136501517824L)
        final /* synthetic */ Runnable jw;

        @dy(field = 433024342638693216L)
        final /* synthetic */ c.k mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -410932057067379900L)
        public a(Activity activity, c.k kVar, Runnable runnable) {
            this.WB = activity;
            this.mb = kVar;
            this.jw = runnable;
        }

        @Override // java.lang.Runnable
        @ey(method = -59196156909571353L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(6372605606233010548L, this);
                }
                ifif.this.gn(this.WB, this.mb, true, this.jw);
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 6372605606233010548L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3507289534622216940L, container = 1486310305192075776L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -4338172066190857475L)
        final /* synthetic */ Activity WB;

        @dy(field = -231946784982782976L)
        final /* synthetic */ Runnable jw;

        @dy(field = 2693669883944958560L)
        final /* synthetic */ c.k mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -262480960270141932L)
        public b(Activity activity, c.k kVar, Runnable runnable) {
            this.WB = activity;
            this.mb = kVar;
            this.jw = runnable;
        }

        @Override // java.lang.Runnable
        @ey(method = -18701626836969441L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(6376254902561961009L, this);
                }
                ifif.this.gn(this.WB, this.mb, false, this.jw);
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 6376254902561961009L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3507377799297230935L, container = 1486310305192075776L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -3632909276952495696L)
        final /* synthetic */ Activity WB;

        @dy(field = 1465009314090118587L)
        final /* synthetic */ Runnable jw;

        @dy(field = 2928652900442881295L)
        final /* synthetic */ c.k mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -26474171459982075L)
        public c(Activity activity, c.k kVar, Runnable runnable) {
            this.WB = activity;
            this.mb = kVar;
            this.jw = runnable;
        }

        @Override // java.lang.Runnable
        @ey(method = -2024514272361238664L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(6379904683083736560L, this);
                }
                ifif.this.gn(this.WB, this.mb, true, this.jw);
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 6379904683083736560L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3507466063976308224L, container = 1486310305192075776L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 3982900695432777413L)
        final /* synthetic */ c.k WB;

        @dy(field = -2898165668210264439L)
        final /* synthetic */ Runnable jw;

        @dy(field = -2855630819507031905L)
        final /* synthetic */ boolean mb;

        @cy(clazz = 949627352088040887L, container = 1486310305192075776L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -3652837492245557791L)
            final /* synthetic */ String WB;

            @dy(field = -3083762189980071912L)
            final /* synthetic */ List mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 1461240659583922560L)
            public a(String str, List list) {
                this.WB = str;
                this.mb = list;
            }

            @Override // java.lang.Runnable
            @ey(method = 1793255285090191008L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(6387205696705762932L, this);
                    }
                    String str = this.WB;
                    if (d.this.WB.Zo().length() > 0) {
                        str = str + "/" + d.this.WB.Zo();
                    }
                    ServiceContainer.getProjectService().XX(str);
                    ServiceContainer.getFileBrowserService().Hw(str);
                    if (d.this.mb) {
                        ServiceContainer.getMainActivity().Ws(false);
                    } else {
                        ServiceContainer.getMainActivity().k2();
                    }
                    if (d.this.mb) {
                        ServiceContainer.getEngineService().vy();
                    }
                    if (this.mb != null) {
                        int i = 0;
                        while (i < this.mb.size()) {
                            try {
                                ServiceContainer.getOpenFileService().lg((String) this.mb.get(i), i == 0);
                            } catch (IOException unused) {
                                Toast.makeText(ServiceContainer.getContext(), ((String) this.mb.get(i)) + " could not be loaded!", 1).show();
                            }
                            i++;
                        }
                    }
                    d.this.jw.run();
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, 6387205696705762932L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = 7265674986067559763L)
        public d(c.k kVar, boolean z, Runnable runnable) {
            this.WB = kVar;
            this.mb = z;
            this.jw = runnable;
        }

        @Override // java.lang.Runnable
        @ey(method = 2758235303344599756L)
        public void run() {
            try {
                if (qp) {
                    iy.gn(6383554947798337201L, this);
                }
                String strV5 = ifif.this.v5(this.WB);
                List<String> listFH = null;
                if (this.mb) {
                    try {
                        FileSystem.VH(strV5);
                    } catch (IOException unused) {
                    }
                    try {
                        listFH = ifif.this.FH(this.WB);
                    } catch (IOException unused2) {
                    }
                }
                ServiceContainer.aj(new a(strV5, listFH));
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 6383554947798337201L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ifif.class);
    }

    @ey(method = -430707169861430900L)
    public ifif() {
        try {
            if (j6) {
                iy.gn(7539703334770653333L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 7539703334770653333L, null);
            }
            throw th;
        }
    }

    @ey(method = -1361661233544515904L)
    private void Hw(c.k kVar, List<String> list, String str) {
        try {
            if (j6) {
                iy.we(-87760768498570791L, this, kVar, list, str);
            }
            try {
                InputStream inputStreamOpen = ServiceContainer.getContext().getAssets().open(str + ".zip");
                String strV5 = v5(kVar);
                ZipInputStream zipInputStream = new ZipInputStream(inputStreamOpen);
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        inputStreamOpen.close();
                        return;
                    }
                    String name = nextEntry.getName();
                    String str2 = str + "/" + kVar.DW().v5() + "/" + kVar.Hw() + "/";
                    if (name.startsWith(str2)) {
                        String str3 = strV5 + "/" + name.substring(str2.length(), name.length());
                        AppLog.DW("Extract " + name + " to " + str3);
                        Iterator<String> it = kVar.j6().iterator();
                        while (it.hasNext()) {
                            if (str3.endsWith("/" + it.next())) {
                                list.add(str3);
                            }
                        }
                        try {
                            if (nextEntry.isDirectory()) {
                                new File(str3).mkdirs();
                            } else {
                                new File(str3).getParentFile().mkdirs();
                                String lowerCase = str3.toLowerCase(Locale.ENGLISH);
                                if (lowerCase.endsWith("build.gradle") || lowerCase.endsWith(".java") || lowerCase.endsWith(".xml") || lowerCase.endsWith(".c") || lowerCase.endsWith(".cpp") || lowerCase.endsWith(".cc") || lowerCase.endsWith(".h") || lowerCase.endsWith(".hpp") || lowerCase.endsWith(".html") || lowerCase.endsWith(".htm") || lowerCase.endsWith(".css") || lowerCase.endsWith(".js")) {
                                    String strReplace = StreamUtilities.FH(new BufferedReader(new InputStreamReader(zipInputStream))).replace("\r\n", "\n");
                                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(str3));
                                    outputStreamWriter.write(strReplace);
                                    outputStreamWriter.close();
                                } else {
                                    FileOutputStream fileOutputStream = new FileOutputStream(str3);
                                    StreamUtilities.VH(zipInputStream, fileOutputStream, false);
                                    fileOutputStream.close();
                                }
                            }
                        } catch (IOException e) {
                            AppLog.v5(e);
                        }
                    }
                }
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -87760768498570791L, this, kVar, list, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1393200438706896681L)
    public void gn(Activity activity, c.k kVar, boolean z, Runnable runnable) {
        try {
            if (j6) {
                iy.J0(-227529794135990808L, this, activity, kVar, new Boolean(z), runnable);
            }
            ServiceContainer.sy(activity, "Expanding sample...", new d(kVar, z, runnable), null);
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, -227529794135990808L, this, activity, kVar, new Boolean(z), runnable);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2911632786970837164L)
    public String v5(c.k kVar) {
        try {
            if (j6) {
                iy.tp(-2786744079914630671L, this, kVar);
            }
            return FileSystem.U2() + "/Samples/" + kVar.Hw();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2786744079914630671L, this, kVar);
            }
            throw th;
        }
    }

    @ey(method = 3580238858067612432L)
    public List<String> FH(c.k kVar) {
        try {
            if (j6) {
                iy.tp(-35471735511811273L, this, kVar);
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = {"AIDESamples", "AIDEWebSamples"};
            for (int i = 0; i < 2; i++) {
                Hw(kVar, arrayList, strArr[i]);
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -35471735511811273L, this, kVar);
            }
            throw th;
        }
    }

    @ey(method = -338428280579523120L)
    public void VH(Activity activity, c.k kVar, Runnable runnable) {
        try {
            if (j6) {
                iy.we(5716089233789182605L, this, activity, kVar, runnable);
            }
            if (Zo(kVar)) {
                MessageBox.yS(activity, kVar.gn(), activity.getResources().getString(u.trainer_sample_overwrite_message), activity.getResources().getString(u.trainer_sample_overwrite_overwrite), new a(activity, kVar, runnable), activity.getResources().getString(u.trainer_sample_overwrite_continue), new b(activity, kVar, runnable), null);
            } else {
                MessageBox.ei(activity, kVar.gn(), activity.getResources().getString(u.trainer_sample_mode_message), new c(activity, kVar, runnable));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 5716089233789182605L, this, activity, kVar, runnable);
            }
            throw th;
        }
    }

    @ey(method = -1924808979707443229L)
    public boolean Zo(c.k kVar) {
        try {
            if (j6) {
                iy.tp(1674155159137567520L, this, kVar);
            }
            return new File(v5(kVar)).isDirectory();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1674155159137567520L, this, kVar);
            }
            throw th;
        }
    }
}
