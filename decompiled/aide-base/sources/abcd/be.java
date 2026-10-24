package abcd;

import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.IOException;

@cy(clazz = 755909515635579200L, container = 755909515635579200L, user = true)
/* loaded from: classes.dex */
public class be {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -1727519957387978751L, container = 755909515635579200L, user = true)
    static class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -2933148589697336400L)
        final /* synthetic */ ValueRunnable DW;

        @dy(field = -2602671227693245920L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 429604125885201417L)
        public a(String str, ValueRunnable valueRunnable) {
            this.j6 = str;
            this.DW = valueRunnable;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -1962478585161919775L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(-929769320412118005L, this, str);
                }
                try {
                    if (str.endsWith(".java")) {
                        str = str.substring(0, str.length() - 5);
                    }
                    String str2 = this.j6 + File.separator + str + ".java";
                    String strEv = AndroidProjectSupport.Ev(ServiceContainer.getProjectService().getLibraryMapping(), ServiceContainer.getProjectService().getBuildVariant(), this.j6);
                    String str3 = "";
                    if (strEv.length() > 0) {
                        str3 = "package " + strEv + ";\n\n";
                    }
                    FileSystem.v5(str2, str3 + "public class " + str + "\n{\n}");
                    this.DW.j6(str2);
                } catch (IOException e) {
                    MessageBox.P8(ServiceContainer.getMainActivity(), "Add class", e);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -929769320412118005L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1727604116093845320L, container = 755909515635579200L, user = true)
    static class b implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 651790498505673920L)
        final /* synthetic */ ValueRunnable DW;

        @dy(field = 3848423865562484124L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 119532866693757795L)
        public b(String str, ValueRunnable valueRunnable) {
            this.j6 = str;
            this.DW = valueRunnable;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 2533200352658637615L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(2551585515258690416L, this, str);
                }
                try {
                    if (str.endsWith(".xml")) {
                        str = str.substring(0, str.length() - 4);
                    }
                    String str2 = this.j6 + File.separator + str + ".xml";
                    FileSystem.v5(str2, FileSystem.getName(FileSystem.getParent(str2)).startsWith("layout") ? "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n    android:layout_width=\"fill_parent\"\n    android:layout_height=\"fill_parent\"\n    android:orientation=\"vertical\">\n    \n</LinearLayout>\n" : FileSystem.getName(FileSystem.getParent(str2)).startsWith("menu") ? "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n    \n    <item\n        android:id=\"@+id/item\"\n        android:title=\"Item\"/>\n    \n</menu>\n" : "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                    this.DW.j6(str2);
                } catch (IOException e) {
                    MessageBox.P8(ServiceContainer.getMainActivity(), "Add Xml", e);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 2551585515258690416L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(be.class);
    }

    @ey(method = -2526829815265699339L)
    public be() {
        try {
            if (j6) {
                iy.gn(-4849968046917350800L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4849968046917350800L, null);
            }
            throw th;
        }
    }

    @ey(method = 652767712191074880L)
    public static void DW(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(-2085638904046239192L, null, str, valueRunnable);
            }
            if (Zo(str)) {
                MessageBox.XL(ServiceContainer.getMainActivity(), u.command_files_add_new_class, u.dialog_create_message, "", new a(str, valueRunnable));
            } else if (v5(str)) {
                MessageBox.XL(ServiceContainer.getMainActivity(), u.command_files_add_new_xml, u.dialog_create_message, "", new b(str, valueRunnable));
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2085638904046239192L, null, str, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -1790247749562022192L)
    public static int FH(String str) {
        try {
            if (!j6) {
                return R$drawable.file_new;
            }
            iy.tp(-1773351382663980352L, null, str);
            return R$drawable.file_new;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1773351382663980352L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -901972358702442895L)
    public static int Hw(String str) {
        try {
            if (j6) {
                iy.tp(-905325724686694081L, null, str);
            }
            if (Zo(str)) {
                return u.command_files_add_new_class;
            }
            if (v5(str)) {
                return u.command_files_add_new_xml;
            }
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -905325724686694081L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2901811155094191459L)
    private static boolean Zo(String str) {
        try {
            if (j6) {
                iy.tp(-54968734187994495L, null, str);
            }
            return AndroidProjectSupport.Ev(ServiceContainer.getProjectService().getLibraryMapping(), ServiceContainer.getProjectService().getBuildVariant(), str) != null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -54968734187994495L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 4646692867553445161L)
    public static boolean j6(String str) {
        try {
            if (j6) {
                iy.tp(-1383298543320063957L, null, str);
            }
            if (!Zo(str)) {
                if (!v5(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1383298543320063957L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 275471444921935416L)
    private static boolean v5(String str) {
        try {
            if (j6) {
                iy.tp(549963087383369484L, null, str);
            }
            if (FileSystem.Ws(str, "res") != null) {
                if (FileSystem.nw(ServiceContainer.getProjectService().getCurrentAppHome(), str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 549963087383369484L, null, str);
            }
            throw th;
        }
    }
}
