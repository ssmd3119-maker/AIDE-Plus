package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.services.TemplateService;
import com.aide.ui.u;
import java.util.Arrays;
import java.util.List;

@cy(clazz = -6708075855096698041L, container = -6708075855096698041L, user = true)
/* loaded from: classes.dex */
public class gd extends MessageBox {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = -2616101381234931405L)
    private ValueRunnable<String> AL;

    @dy(field = 2835879965997661440L)
    private String k2;

    @dy(field = 350847242812094845L)
    private TemplateService.TemplateGroup zh;

    @cy(clazz = -290547596187184592L, container = -6708075855096698041L, user = true)
    class a implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -398582202969510000L)
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -161262339737887481L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(4030826228596889831L, this, dialogInterface, new Integer(i));
                }
                gd.this.Sf((AlertDialog) dialogInterface);
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 4030826228596889831L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -290684639754567993L, container = -6708075855096698041L, user = true)
    class b implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 305429823200495400L)
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -868422523987040843L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(5309248098472877240L, this, dialogInterface, new Integer(i));
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                gd.this.Sf(alertDialog);
                alertDialog.dismiss();
                gd.this.vJ(gd.this.g3(), gd.this.ca(alertDialog), gd.this.I(alertDialog), gd.this.x9(alertDialog));
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 5309248098472877240L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -290821683317888100L, container = -6708075855096698041L, user = true)
    class c implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -538459536120956957L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 2516450647865455728L)
        public c(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = 825773492779316972L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(149689369450846269L, this, editable);
                }
                gd.this.sy(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 149689369450846269L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -5383095741095598369L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(4921222468420800L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 4921222468420800L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 8219165281126568909L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-2803039282365789152L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -2803039282365789152L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -290958726877144913L, container = -6708075855096698041L, user = true)
    class d implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3736599609850565220L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -7569442854457062923L)
        public d(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = 4172535662330986353L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(130263754308303120L, this, editable);
                }
                gd.this.sy(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 130263754308303120L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 197415851642883944L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-526098228043975971L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -526098228043975971L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 5750998182946979844L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-3920738923271737657L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -3920738923271737657L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -291095770432338432L, container = -6708075855096698041L, user = true)
    class e implements Runnable {

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = -3638506441887810625L)
        final /* synthetic */ String WB;

        @dy(field = 3826565139921396160L)
        final /* synthetic */ TemplateService.TemplateGroup fY;

        @dy(field = -5777214196431546528L)
        final /* synthetic */ String jw;

        @dy(field = 4232141395391050665L)
        final /* synthetic */ String mb;

        @cy(clazz = 361117421082573375L, container = -6708075855096698041L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -4633477012220804845L)
            final /* synthetic */ List WB;

            @dy(field = -3602599501042868477L)
            final /* synthetic */ String mb;

            @cy(clazz = 209484110154447900L, container = -6708075855096698041L, user = true)
            /* renamed from: abcd.gd$e$a$a, reason: collision with other inner class name */
            class RunnableC0005a implements Runnable {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                static {
                    iy.Zo(RunnableC0005a.class);
                }

                @ey(method = -6838652428328999936L)
                public RunnableC0005a() {
                }

                @Override // java.lang.Runnable
                @ey(method = -1604616484233296160L)
                public void run() {
                    try {
                        if (mb) {
                            iy.gn(6597588957349062715L, this);
                        }
                        if (gd.this.AL != null) {
                            gd.this.AL.j6(a.this.mb);
                        }
                    } catch (Throwable th) {
                        if (jw) {
                            iy.aM(th, 6597588957349062715L, this);
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(a.class);
            }

            @ey(method = 1777877666404536624L)
            public a(List list, String str) {
                this.WB = list;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            @ey(method = 2020553949778599060L)
            public void run() {
                String str;
                try {
                    if (fY) {
                        iy.gn(6593264978836293168L, this);
                    }
                    if (e.this.fY.Zo.Zo) {
                        ServiceContainer.getOpenFileService().er(this.WB);
                        if (this.mb != null) {
                            ServiceContainer.getFileBrowserService().Hw(this.mb);
                        }
                        if (gd.this.AL != null) {
                            gd.this.AL.j6(this.mb);
                            return;
                        }
                        return;
                    }
                    if (e.this.fY.Hw == null) {
                        str = this.mb;
                    } else {
                        str = this.mb + "/" + e.this.fY.Hw;
                    }
                    if (str != null) {
                        ServiceContainer.getFileBrowserService().Hw(str);
                    }
                    ServiceContainer.getMainActivity().Ws(false);
                    ServiceContainer.getProjectService().XX(str);
                    ServiceContainer.getProjectService().sy("created");
                    ServiceContainer.getOpenFileService().er(this.WB);
                    if (!ServiceContainer.QX().Mz(this.mb) && AppPreferences.gn()) {
                        ServiceContainer.QX().rN(this.mb, "Initial commit", Arrays.asList("bin/", "gen/", "obj/", "libs/*/*.so", ""), new RunnableC0005a());
                    } else if (gd.this.AL != null) {
                        gd.this.AL.j6(this.mb);
                    }
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, 6593264978836293168L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        @ey(method = 526745694754358145L)
        public e(String str, String str2, String str3, TemplateService.TemplateGroup templateGroup) {
            this.WB = str;
            this.mb = str2;
            this.jw = str3;
            this.fY = templateGroup;
        }

        @Override // java.lang.Runnable
        @ey(method = -2494128121454285757L)
        public void run() {
            try {
                if (k2) {
                    iy.gn(6588941484516348711L, this);
                }
                ServiceContainer.aj(new a(ServiceContainer.getTemplateService().j6(this.WB, this.mb, this.jw, "", this.fY), ServiceContainer.getTemplateService().Hw(this.WB, this.mb)));
            } catch (Throwable th) {
                if (zh) {
                    iy.aM(th, 6588941484516348711L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(gd.class);
    }

    @ey(method = 2936802459213088567L)
    public gd(String str, TemplateService.TemplateGroup templateGroup, ValueRunnable<String> valueRunnable) {
        try {
            if (w9) {
                iy.we(-4768031261897654016L, null, str, templateGroup, valueRunnable);
            }
            this.k2 = str;
            this.zh = templateGroup;
            this.AL = valueRunnable;
        } catch (Throwable th) {
            if (hK) {
                iy.U2(th, -4768031261897654016L, null, str, templateGroup, valueRunnable);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4870430126161092880L)
    public String I(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(-1056562570325263709L, this, alertDialog);
            }
            return Qq(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -1056562570325263709L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 166425984905716105L)
    private EditText Mz(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(1120008048066885672L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createprojectName);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 1120008048066885672L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -5847703862577192000L)
    private EditText Qq(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(-5365622781750731913L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createprojectPackage);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -5365622781750731913L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -6793158347887233617L)
    public void Sf(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(806167629204849048L, this, alertDialog);
            }
            InputMethodManager inputMethodManager = (InputMethodManager) alertDialog.getContext().getSystemService("input_method");
            inputMethodManager.hideSoftInputFromWindow(Mz(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(Qq(alertDialog).getWindowToken(), 0);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 806167629204849048L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1353771980219784915L)
    public String ca(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(5552500925898615840L, this, alertDialog);
            }
            return Mz(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 5552500925898615840L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4130268463357126509L)
    public String g3() {
        try {
            if (w9) {
                iy.gn(1004085119242810440L, this);
            }
            return this.k2;
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 1004085119242810440L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 230893290840044767L)
    public void vJ(String str, String str2, String str3, TemplateService.TemplateGroup templateGroup) {
        try {
            if (w9) {
                iy.J0(-1562694632264115200L, this, str, str2, str3, templateGroup);
            }
            ServiceContainer.sy(ServiceContainer.getMainActivity(), "Creating Project ...", new e(str, str2, str3, templateGroup), null);
        } catch (Throwable th) {
            if (hK) {
                iy.a8(th, -1562694632264115200L, this, str, str2, str3, templateGroup);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1559185266629294585L)
    public TemplateService.TemplateGroup x9(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(-356061789385027632L, this, alertDialog);
            }
            return this.zh;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -356061789385027632L, this, alertDialog);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = -608308182077754123L)
    public Dialog Hw(Activity activity) {
        try {
            if (w9) {
                iy.tp(379690877862374400L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.createproject, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(u.dialog_create_project_title).setView(viewInflate).setCancelable(true).setPositiveButton(u.dialog_create_project_create, new b()).setNegativeButton(2131559870, new a());
            AlertDialog alertDialogCreate = builder.create();
            int i = 0;
            ((TextView) viewInflate.findViewById(q.createprojectType)).setText(activity.getResources().getString(u.dialog_create_project_new, this.zh.j6));
            ((TextView) viewInflate.findViewById(q.createprojectLocation)).setText(activity.getResources().getString(u.dialog_create_project_in, this.k2));
            EditText editText = (EditText) viewInflate.findViewById(q.createprojectName);
            String strEQ = ServiceContainer.getTemplateService().EQ(this.k2, this.zh.Zo.Hw);
            editText.setText(strEQ);
            editText.addTextChangedListener(new c(alertDialogCreate));
            EditText editText2 = (EditText) viewInflate.findViewById(q.createprojectPackage);
            editText2.setText(ServiceContainer.getTemplateService().tp(strEQ));
            editText2.addTextChangedListener(new d(alertDialogCreate));
            editText2.setVisibility(this.zh.Zo.v5 ? 0 : 8);
            TextView textView = (TextView) viewInflate.findViewById(q.createprojectPackageLabel);
            if (!this.zh.Zo.v5) {
                i = 8;
            }
            textView.setVisibility(i);
            alertDialogCreate.getWindow().setSoftInputMode(2);
            return alertDialogCreate;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 379690877862374400L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = 3387883876671061100L)
    public void sy(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(3976031841413833775L, this, alertDialog);
            }
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                button.setEnabled(ServiceContainer.getTemplateService().gn(g3(), I(alertDialog)) && ServiceContainer.getTemplateService().u7(g3(), ca(alertDialog)));
            }
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 3976031841413833775L, this, alertDialog);
            }
            throw th;
        }
    }
}
