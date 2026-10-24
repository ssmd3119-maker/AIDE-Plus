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
import android.widget.Toast;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Locale;

@cy(clazz = 294461532386472240L, container = 294461532386472240L, user = true)
/* loaded from: classes.dex */
public class md extends MessageBox {

    @gy
    private static /* synthetic */ boolean AL;

    @fy
    private static /* synthetic */ boolean zh;

    @dy(field = 3289488117011052235L)
    private String k2;

    @cy(clazz = -2596368357752936121L, container = 294461532386472240L, user = true)
    class a implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -37120648004417325L)
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 792134571568303152L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(-11430350214044300L, this, dialogInterface, new Integer(i));
                }
                md.this.sG((AlertDialog) dialogInterface);
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -11430350214044300L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2596429009759115700L, container = 294461532386472240L, user = true)
    class b implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -4314824752374746148L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 4001024401705034245L)
        public b(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = -5045051986624764133L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(-6407635121654582912L, this, editable);
                }
                md.this.I(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, -6407635121654582912L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 3071736262787866848L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(37951182274725951L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 37951182274725951L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 7310497506064733224L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-1759088855460985435L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -1759088855460985435L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2596489661761231985L, container = 294461532386472240L, user = true)
    class c implements TextWatcher {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -1528364882642404532L)
        private String WB;

        @dy(field = 4508131601204116600L)
        final /* synthetic */ EditText jw;

        @dy(field = 3643062952543173981L)
        final /* synthetic */ AlertDialog mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -1061283621741924249L)
        public c(AlertDialog alertDialog, EditText editText) {
            this.mb = alertDialog;
            this.jw = editText;
        }

        @ey(method = 5263741723339320L)
        private String j6(String str) {
            try {
                if (qp) {
                    iy.tp(11272954358467105L, this, str);
                }
                try {
                    String strGn = new ue0(str).gn();
                    if (strGn == null) {
                        return "";
                    }
                    if (strGn.endsWith("/.git")) {
                        strGn = strGn.substring(0, strGn.length() - 5);
                    } else if (strGn.endsWith(".git")) {
                        strGn = strGn.substring(0, strGn.length() - 4);
                    }
                    return new File(strGn).getName();
                } catch (URISyntaxException unused) {
                    return "";
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 11272954358467105L, this, str);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 5565291245172357972L)
        public void afterTextChanged(Editable editable) {
            try {
                if (qp) {
                    iy.tp(-6681724542663480723L, this, editable);
                }
                if (md.this.ef(this.mb).length() == 0 || md.this.ef(this.mb).equals(j6(this.WB))) {
                    String strJ6 = j6(editable.toString().trim());
                    if (!ServiceContainer.QX().I(md.this.vJ(), strJ6)) {
                        int i = 2;
                        while (true) {
                            if (i > 20) {
                                break;
                            }
                            String str = strJ6 + "-" + i;
                            if (ServiceContainer.QX().I(md.this.vJ(), str)) {
                                strJ6 = str;
                                break;
                            }
                            i++;
                        }
                    }
                    this.jw.setText(strJ6);
                }
                md.this.I(this.mb);
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -6681724542663480723L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 4259711910365958475L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (qp) {
                    iy.J0(33119910600303472L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                this.WB = charSequence.toString().trim();
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, 33119910600303472L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -1144807516135369527L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (qp) {
                    iy.J0(-2376822112171396896L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, -2376822112171396896L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2596550313759284976L, container = 294461532386472240L, user = true)
    class d implements DialogInterface.OnShowListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 595272850691841347L)
        final /* synthetic */ Activity j6;

        @cy(clazz = -5390214936315638241L, container = 294461532386472240L, user = true)
        class a implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -6203633995742277879L)
            final /* synthetic */ AlertDialog WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 7325810712818813301L)
            public a(AlertDialog alertDialog) {
                this.WB = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 396962515227020775L)
            public void onClick(View view) {
                try {
                    if (jw) {
                        iy.tp(6924461451797592976L, this, view);
                    }
                    try {
                        ue0 ue0Var = new ue0(md.this.g3(this.WB));
                        for (se0 se0Var : le0.XL()) {
                            if (se0Var.Hw().toUpperCase(Locale.US).contains("SSH") && se0Var.DW(ue0Var) && (ue0Var.we() == null || ue0Var.we().trim().length() == 0)) {
                                ue0 ue0VarJ3 = ue0Var.j3("user");
                                Toast.makeText(d.this.j6, "You must specify a username in the URL in this form: " + ue0VarJ3.toString(), 1).show();
                                return;
                            }
                        }
                        String lowerCase = ue0Var.toString().toLowerCase(Locale.US);
                        if (lowerCase.startsWith("https://github.com/") && !lowerCase.endsWith(".git")) {
                            md.this.Mz(this.WB).setText(ue0Var.toString() + ".git");
                        }
                    } catch (URISyntaxException unused) {
                    }
                    md.this.sG(this.WB);
                    this.WB.dismiss();
                    ServiceContainer.QX().a8(md.this.vJ(), md.this.ef(this.WB), md.this.g3(this.WB));
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 6924461451797592976L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = 57849735186946680L)
        public d(Activity activity) {
            this.j6 = activity;
        }

        @Override // android.content.DialogInterface.OnShowListener
        @ey(method = 314332769516968800L)
        public void onShow(DialogInterface dialogInterface) {
            try {
                if (FH) {
                    iy.tp(765323470542911712L, this, dialogInterface);
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                md.this.I(alertDialog);
                alertDialog.getButton(-1).setOnClickListener(new a(alertDialog));
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 765323470542911712L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(md.class);
    }

    @ey(method = 666818237142976191L)
    public md(String str) {
        try {
            if (zh) {
                iy.tp(-1302759957451423743L, null, str);
            }
            this.k2 = str;
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -1302759957451423743L, null, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -195978998071684413L)
    public EditText Mz(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(-6350219985223189656L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.gitclonerepositoryUrl);
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -6350219985223189656L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -3614173312527169216L)
    private EditText Sf(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(-2555099710780862995L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.gitclonerepositoryDirectoryName);
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -2555099710780862995L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4878540208062632523L)
    public String ef(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(-911990147909276436L, this, alertDialog);
            }
            return Sf(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -911990147909276436L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3534611745733543400L)
    public String g3(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(-4434289999238011625L, this, alertDialog);
            }
            return Mz(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -4434289999238011625L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4001293043147922100L)
    public void sG(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(1795971876204410507L, this, alertDialog);
            }
            InputMethodManager inputMethodManager = (InputMethodManager) alertDialog.getContext().getSystemService("input_method");
            inputMethodManager.hideSoftInputFromWindow(Sf(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(Mz(alertDialog).getWindowToken(), 0);
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, 1795971876204410507L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4975793607705188268L)
    public String vJ() {
        try {
            if (zh) {
                iy.gn(201232545820468981L, this);
            }
            return this.k2;
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 201232545820468981L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 1960161719356701120L)
    public Dialog Hw(Activity activity) {
        try {
            if (zh) {
                iy.tp(1275607209537150833L, this, activity);
            }
            String strVJ = vJ();
            View viewInflate = LayoutInflater.from(activity).inflate(r.gitclonerepository, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("Clone Git repository").setView(viewInflate).setCancelable(true).setPositiveButton("Clone", (DialogInterface.OnClickListener) null).setNegativeButton("Cancel", new a());
            AlertDialog alertDialogCreate = builder.create();
            ((TextView) viewInflate.findViewById(q.gitclonerepositoryUrl)).setText("");
            ((TextView) viewInflate.findViewById(q.gitclonerepositoryLocation)).setText(strVJ);
            EditText editText = (EditText) viewInflate.findViewById(q.gitclonerepositoryDirectoryName);
            editText.setText("");
            editText.addTextChangedListener(new b(alertDialogCreate));
            ((EditText) viewInflate.findViewById(q.gitclonerepositoryUrl)).addTextChangedListener(new c(alertDialogCreate, editText));
            alertDialogCreate.setOnShowListener(new d(activity));
            return alertDialogCreate;
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, 1275607209537150833L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = 1783523156329601489L)
    public void I(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(3442036354139500500L, this, alertDialog);
            }
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                boolean z = true;
                boolean z2 = false;
                try {
                    new ue0(g3(alertDialog));
                } catch (URISyntaxException unused) {
                    z = false;
                }
                if (ServiceContainer.QX().I(vJ(), ef(alertDialog))) {
                    z2 = z;
                }
                button.setEnabled(z2);
            }
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, 3442036354139500500L, this, alertDialog);
            }
            throw th;
        }
    }
}
