package abcd;

import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.project.JavaProjectSupport;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.io.IOException;

@cy(clazz = -1742545772353413008L, container = -1742545772353413008L, user = true)
/* loaded from: classes.dex */
public class fe {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 3916038450424841269L, container = -1742545772353413008L, user = true)
    static class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -2484672343231683192L)
        final /* synthetic */ ValueRunnable DW;

        @dy(field = -765948508641651000L)
        final /* synthetic */ String j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -194781765119017761L)
        public a(String str, ValueRunnable valueRunnable) {
            this.j6 = str;
            this.DW = valueRunnable;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = 5603436104792719131L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(288245876522591487L, this, str);
                }
                try {
                    if (str.endsWith(".java")) {
                        str = str.substring(0, str.length() - 5);
                    }
                    String str2 = this.j6 + File.separator + str + ".java";
                    String strI = JavaProjectSupport.I(ServiceContainer.getProjectService().getCurrentAppHome(), this.j6);
                    String str3 = "";
                    if (strI.length() > 0) {
                        str3 = "package " + strI + ";\n\n";
                    }
                    FileSystem.v5(str2, str3 + "public class " + str + "\n{\n}");
                    this.DW.j6(str2);
                } catch (IOException e) {
                    MessageBox.P8(ServiceContainer.getMainActivity(), "Add class", e);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 288245876522591487L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(fe.class);
    }

    @ey(method = 3063614718598525793L)
    public fe() {
        try {
            if (j6) {
                iy.gn(5381618208939273144L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5381618208939273144L, null);
            }
            throw th;
        }
    }

    @ey(method = -1123501387871549100L)
    public static void DW(String str, ValueRunnable<String> valueRunnable) {
        try {
            if (j6) {
                iy.EQ(-798767185171241619L, null, str, valueRunnable);
            }
            MessageBox.XL(ServiceContainer.getMainActivity(), u.command_files_add_new_class, u.dialog_create_message, "", new a(str, valueRunnable));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -798767185171241619L, null, str, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -5912396798536748356L)
    public static int FH(String str) {
        try {
            if (!j6) {
                return R$drawable.file_new;
            }
            iy.tp(2301041997595863873L, null, str);
            return R$drawable.file_new;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2301041997595863873L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1307727417716043675L)
    public static int Hw(String str) {
        try {
            if (!j6) {
                return u.command_files_add_new_class;
            }
            iy.tp(-1689316329523186160L, null, str);
            return u.command_files_add_new_class;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1689316329523186160L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3653397225446150175L)
    public static boolean j6(String str) {
        try {
            if (j6) {
                iy.tp(-5903945604095378800L, null, str);
            }
            return JavaProjectSupport.I(ServiceContainer.getProjectService().getCurrentAppHome(), str) != null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5903945604095378800L, null, str);
            }
            throw th;
        }
    }
}
