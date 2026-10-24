package abcd;

import com.aide.common.KeyStroke;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.IOException;

@cy(clazz = 1339874213602474368L, container = 1339874213602474368L, user = true)
/* loaded from: classes.dex */
public class v9 implements MenuCommand, KeyStrokeCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -2704137468991119753L, container = 1339874213602474368L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 2764988409189584447L)
        final /* synthetic */ String WB;

        @cy(clazz = 934994066386181388L, container = 1339874213602474368L, user = true)
        /* renamed from: abcd.v9$a$a, reason: collision with other inner class name */
        class RunnableC0013a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @cy(clazz = 5913999907935079935L, container = 1339874213602474368L, user = true)
            /* renamed from: abcd.v9$a$a$a, reason: collision with other inner class name */
            class RunnableC0014a implements Runnable {

                @gy
                private static /* synthetic */ boolean fY;

                @fy
                private static /* synthetic */ boolean jw;

                @dy(field = -4588393392215109185L)
                final /* synthetic */ String WB;

                static {
                    iy.Zo(RunnableC0014a.class);
                }

                @ey(method = -150282116584663808L)
                public RunnableC0014a(String str) {
                    this.WB = str;
                }

                @Override // java.lang.Runnable
                @ey(method = 836462098871951555L)
                public void run() {
                    try {
                        if (jw) {
                            iy.gn(-3980642099808367496L, this);
                        }
                        ServiceContainer.getOpenFileService().BT(a.this.WB);
                        ServiceContainer.getProjectService().wc();
                        ServiceContainer.getFileBrowserService().v5();
                        ServiceContainer.EQ().ef(this.WB);
                    } catch (Throwable th) {
                        if (fY) {
                            iy.aM(th, -3980642099808367496L, this);
                        }
                        throw th;
                    }
                }
            }

            @cy(clazz = 5914107646194504448L, container = 1339874213602474368L, user = true)
            /* renamed from: abcd.v9$a$a$b */
            class b implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                @dy(field = 527257500938969280L)
                final /* synthetic */ IOException WB;

                static {
                    iy.Zo(b.class);
                }

                @ey(method = -18563097487251027L)
                public b(RunnableC0013a runnableC0013a, IOException iOException) {
                    this.WB = iOException;
                }

                @Override // java.lang.Runnable
                @ey(method = -2167588003884739236L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(-3979102096595676945L, this);
                        }
                        MessageBox.P8(ServiceContainer.getMainActivity(), "Delete", this.WB);
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, -3979102096595676945L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(RunnableC0013a.class);
            }

            @ey(method = 143592296966696185L)
            public RunnableC0013a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 797956279394617005L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-3982181618828232957L, this);
                    }
                    try {
                        String parent = FileSystem.getParent(a.this.WB);
                        FileSystem.VH(a.this.WB);
                        ServiceContainer.aj(new RunnableC0014a(parent));
                    } catch (IOException e) {
                        ServiceContainer.aj(new b(this, e));
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -3982181618828232957L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 3771897107130518752L)
        public a(v9 v9Var, String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 200135740556041115L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3983720653655273328L, this);
                }
                ServiceContainer.sy(ServiceContainer.getMainActivity(), "Deleting ...", new RunnableC0013a(), null);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3983720653655273328L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(v9.class);
    }

    @ey(method = 1956110130656134344L)
    public v9() {
        try {
            if (j6) {
                iy.gn(-7499689781004385263L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -7499689781004385263L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 2140416068509137528L)
    public KeyStroke getKeyStroke() {
        try {
            if (j6) {
                iy.gn(-4913430968191276575L, this);
            }
            return new KeyStroke(67, false, false, false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4913430968191276575L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -2203865939812895775L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.filebrowserMenuDelete;
            }
            iy.gn(3409263442654609280L, this);
            return q.filebrowserMenuDelete;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3409263442654609280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 3543902879192194575L)
    public String getName() {
        try {
            if (!j6) {
                return "Files - Delete";
            }
            iy.gn(2562260737086380160L, this);
            return "Files - Delete";
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2562260737086380160L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1510400765948540135L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(-1018223161206241524L, this);
            }
            return isVisible(false);
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1018223161206241524L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 1474246145052128805L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(-168713027486730880L, this, z);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            if (strFH != null) {
                if (!FileSystem.sh(strFH)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -168713027486730880L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -722796114850096123L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(-1974821860644820040L, this);
            }
            String strFH = ServiceContainer.getFileBrowserService().FH();
            MessageBox.rN(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.dialog_delete_file_title, new Object[0]), ServiceContainer.KD(u.dialog_delete_file_message, strFH), new a(this, strFH), null);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1974821860644820040L, this);
            }
            throw th;
        }
    }
}
