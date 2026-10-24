package abcd;

import com.aide.common.ColorPickerDialog;
import com.aide.common.MessageBox;
import com.aide.engine.SyntaxError;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.q;
import com.aide.ui.util.FileSpan;

@cy(clazz = 948594454268153085L, container = 948594454268153085L, user = true)
/* loaded from: classes.dex */
public class d9 implements MenuCommand {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -1831212165505249560L, container = 948594454268153085L, user = true)
    class a implements ColorPickerDialog.f {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -1440593715397698136L)
        final /* synthetic */ SyntaxError j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 4097210704915764792L)
        public a(d9 d9Var, SyntaxError syntaxError) {
            this.j6 = syntaxError;
        }

        @Override // com.aide.common.ColorPickerDialog.f
        @ey(method = -2534217892578675477L)
        public void j6(int i, String str) {
            try {
                if (DW) {
                    iy.EQ(1562936434249538061L, this, new Integer(i), str);
                }
                ServiceContainer.getMainActivity().sh().zh(this.j6.jw, this.j6.fY, this.j6.qp, this.j6.k2, str);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 1562936434249538061L, this, new Integer(i), str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(d9.class);
    }

    @ey(method = -1180775790964099131L)
    public d9() {
        try {
            if (j6) {
                iy.gn(1268629210669716981L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1268629210669716981L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1507974202177530080L)
    public int getMenuItemId() {
        try {
            if (!j6) {
                return q.editorMenuChooseColor;
            }
            iy.gn(-4766759747867978091L, this);
            return q.editorMenuChooseColor;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4766759747867978091L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = -1240760403168845528L)
    public boolean isEnabled() {
        try {
            if (j6) {
                iy.gn(1915832745502106471L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            if (currentFileSpan.j6 != null) {
                if (ServiceContainer.getMainActivity().sh().wc(currentFileSpan.DW, currentFileSpan.FH) != null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1915832745502106471L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuCommand
    @ey(method = 739606713118148200L)
    public boolean isVisible(boolean z) {
        try {
            if (j6) {
                iy.Ws(797539222570667157L, this, z);
            }
            return isEnabled();
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 797539222570667157L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.MenuItemCommand
    @ey(method = 1346652926879671424L)
    public boolean run() {
        try {
            if (j6) {
                iy.gn(145624849114677345L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            SyntaxError syntaxErrorWc = ServiceContainer.getMainActivity().sh().wc(currentFileSpan.DW, currentFileSpan.FH);
            MessageBox.gW(ServiceContainer.getMainActivity(), new ColorPickerDialog("Choose Color", syntaxErrorWc.mb, new a(this, syntaxErrorWc)));
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 145624849114677345L, this);
            }
            throw th;
        }
    }
}
