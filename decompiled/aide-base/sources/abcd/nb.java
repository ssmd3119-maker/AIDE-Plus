package abcd;

import com.aide.common.MessageBox;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.u;

@cy(clazz = -1190281173621753128L, container = -1190281173621753128L, user = true)
/* loaded from: classes.dex */
public class nb implements tf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 2694179269054365581L, container = -1190281173621753128L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -231503948555214351L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 8396316340871205957L)
        public a(nb nbVar, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 1205914294742455500L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-511882028391170087L, this);
                }
                ServiceContainer.getOpenFileService().KD(false, false);
                ServiceContainer.getProjectService().yO(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -511882028391170087L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2694307442871912296L, container = -1190281173621753128L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 2871731885290934371L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 6129824132232109407L)
        public b(nb nbVar, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 981809465564403168L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-511893790282933068L, this);
                }
                ServiceContainer.getProjectService().yO(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -511893790282933068L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(nb.class);
    }

    @ey(method = 224325951161843456L)
    public nb() {
        try {
            if (j6) {
                iy.gn(3180787111569725985L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3180787111569725985L, null);
            }
            throw th;
        }
    }

    @ey(method = -5396488992656185360L)
    private void u7(String str) {
        try {
            if (j6) {
                iy.tp(1222204451262130793L, this, str);
            }
            if (ServiceContainer.getOpenFileService().U2()) {
                MessageBox.a8(ServiceContainer.getMainActivity(), u.dialog_save_files_title, u.dialog_save_files_message, new a(this, str), new b(this, str));
            } else {
                ServiceContainer.getProjectService().yO(str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1222204451262130793L, this, str);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -107748899651494215L)
    public int VH() {
        try {
            if (!j6) {
                return R$drawable.project_open;
            }
            iy.gn(-3476290094914613852L, this);
            return R$drawable.project_open;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3476290094914613852L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = -698507040643562325L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(726024713292933120L, this, z);
            }
            String strJ6 = ServiceContainer.getFileBrowserService().j6();
            if (ServiceContainer.getProjectService().Mz(strJ6)) {
                if (!strJ6.equals(ServiceContainer.getProjectService().getCurrentAppHome())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 726024713292933120L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 946505528008808760L)
    public int j6() {
        try {
            if (j6) {
                iy.gn(1887549290019663435L, this);
            }
            return ServiceContainer.getProjectService().ro(ServiceContainer.getFileBrowserService().j6());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1887549290019663435L, this);
            }
            throw th;
        }
    }

    @Override // abcd.tf
    @ey(method = 95384088273986343L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-2346519617592191664L, this);
            }
            u7(ServiceContainer.getFileBrowserService().j6());
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2346519617592191664L, this);
            }
            throw th;
        }
    }
}
