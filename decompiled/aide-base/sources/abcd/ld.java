package abcd;

import abcd.ed;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
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
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildServiceCollect;
import com.aide.ui.project.AndroidProjectSupport;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.util.FileSystem;

@cy(clazz = 4518137094473097045L, container = 4518137094473097045L, user = true)
/* loaded from: classes.dex */
public class ld extends MessageBox {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = -2350192644063101112L)
    private String AL;

    @dy(field = -2635689681807066136L)
    private String k2;

    @dy(field = 2039735921507585539L)
    private String zh;

    @cy(clazz = 275001021024250136L, container = 4518137094473097045L, user = true)
    class a implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 161007706226642339L)
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -277856506411452360L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(4539968155737117075L, this, dialogInterface, new Integer(i));
                }
                ld.this.ef((AlertDialog) dialogInterface);
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 4539968155737117075L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 275064306853505841L, container = 4518137094473097045L, user = true)
    class b implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2372311128650371753L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 156018111377373000L)
        public b(Activity activity) {
            this.WB = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -245041285058999904L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (jw) {
                    iy.EQ(-5273463928502553904L, this, dialogInterface, new Integer(i));
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                ld.this.ef(alertDialog);
                alertDialog.dismiss();
                ld.this.Sf(this.WB, ld.this.vJ(alertDialog), ld.this.Mz(alertDialog));
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, -5273463928502553904L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 275127592686824840L, container = 4518137094473097045L, user = true)
    class c implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 98680712956481075L)
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 37973033637540624L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(-4124766788349791857L, this, dialogInterface, new Integer(i));
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                ld.this.ef(alertDialog);
                alertDialog.dismiss();
                ld.this.x9(ld.this.vJ(alertDialog), ld.this.Mz(alertDialog));
                BuildServiceCollect.androidProjectBuildService.I(ld.this.AL, ld.this.vJ(alertDialog), ld.this.Mz(alertDialog));
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -4124766788349791857L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 275190878524207133L, container = 4518137094473097045L, user = true)
    class d implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -1708757911128485280L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 5811874852674845689L)
        public d(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = -4049602498583525145L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(32561115964374529L, this, editable);
                }
                ld.this.ca(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 32561115964374529L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -3453644568292718900L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(190838533775794516L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 190838533775794516L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -3919527213295438656L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(2259552954681966488L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 2259552954681966488L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 275254164365652720L, container = 4518137094473097045L, user = true)
    class e implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2431541081582125136L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 8040957009553039149L)
        public e(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = 3491187804474347635L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(32809655489832920L, this, editable);
                }
                ld.this.ca(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 32809655489832920L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -1734380030054442400L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-76129848003339711L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -76129848003339711L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 1672343814893898000L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(1410254381452526095L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 1410254381452526095L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 275317450211161601L, container = 4518137094473097045L, user = true)
    class f implements DialogInterface.OnShowListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 105576756806380551L)
        public f() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        @ey(method = -25301166104215848L)
        public void onShow(DialogInterface dialogInterface) {
            try {
                if (DW) {
                    iy.tp(1783640495785088799L, this, dialogInterface);
                }
                ld.this.ca((AlertDialog) dialogInterface);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1783640495785088799L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 275380736060733776L, container = 4518137094473097045L, user = true)
    class g implements ed.f {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 4321812074364895716L)
        final /* synthetic */ String DW;

        @dy(field = -2321967875624135176L)
        final /* synthetic */ Activity j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -1128698013756462861L)
        public g(Activity activity, String str) {
            this.j6 = activity;
            this.DW = str;
        }

        @Override // abcd.ed.f
        @ey(method = -4425856156776310329L)
        public void j6(boolean z, String str) {
            try {
                if (Hw) {
                    iy.EQ(-6301221483677559675L, this, new Boolean(z), str);
                }
                if (z) {
                    MessageBox.gW(this.j6, new ld(ld.this.AL, this.DW, str, null));
                    return;
                }
                MessageBox.BT(this.j6, "Create keystore", "Failed to create keystore file " + str);
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, -6301221483677559675L, this, new Boolean(z), str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ld.class);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ey(method = -7937264548008602916L)
    public /* synthetic */ ld(String str, String str2, String str3, a aVar) {
        this(str, str2, str3);
        try {
            if (w9) {
                iy.J0(-5553121834155633612L, null, str, str2, str3, aVar);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.a8(th, -5553121834155633612L, null, str, str2, str3, aVar);
            }
            throw th;
        }
    }

    @ey(method = 6726713543896544784L)
    private EditText I(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(4473098694391518668L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.exportapkKeystoreFile);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 4473098694391518668L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2916478725766900605L)
    public String Mz(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(2534346003423630797L, this, alertDialog);
            }
            return I(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 2534346003423630797L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 109508426829733232L)
    public void Sf(Activity activity, String str, String str2) {
        try {
            if (w9) {
                iy.we(-7290312324950855872L, this, activity, str, str2);
            }
            MessageBox.gW(activity, new ed(str2, "appkey", "", new g(activity, str)));
        } catch (Throwable th) {
            if (hK) {
                iy.U2(th, -7290312324950855872L, this, activity, str, str2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5859736509948213984L)
    public void ef(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(2128688099187769296L, this, alertDialog);
            }
            InputMethodManager inputMethodManager = (InputMethodManager) alertDialog.getContext().getSystemService("input_method");
            inputMethodManager.hideSoftInputFromWindow(g3(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(I(alertDialog).getWindowToken(), 0);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 2128688099187769296L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2486626551369405375L)
    private EditText g3(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(-1761200616027796605L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.exportapkFile);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -1761200616027796605L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2113376607681099084L)
    public String vJ(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(792772347225384800L, this, alertDialog);
            }
            return g3(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 792772347225384800L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 8015687732796562304L)
    public void x9(String str, String str2) {
        try {
            if (w9) {
                iy.EQ(4771908176910514920L, this, str, str2);
            }
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("ExportAPKDialog", 0).edit();
            editorEdit.putString("DefaultKeyStore", str2);
            editorEdit.putString("DefaultAPKDir", FileSystem.getParent(str));
            editorEdit.commit();
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, 4771908176910514920L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 340203784419912784L)
    public Dialog Hw(Activity activity) {
        try {
            if (w9) {
                iy.tp(-2405816802693573780L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.exportapk, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("Export signed APK").setView(viewInflate).setCancelable(true).setPositiveButton("Export", new c()).setNeutralButton("Create keystore", new b(activity)).setNegativeButton("Cancel", new a());
            AlertDialog alertDialogCreate = builder.create();
            TextView textView = (TextView) viewInflate.findViewById(q.exportapkFile);
            textView.setText(this.zh);
            textView.addTextChangedListener(new d(alertDialogCreate));
            EditText editText = (EditText) viewInflate.findViewById(q.exportapkKeystoreFile);
            editText.setText(this.k2);
            editText.addTextChangedListener(new e(alertDialogCreate));
            alertDialogCreate.setOnShowListener(new f());
            return alertDialogCreate;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -2405816802693573780L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = 79586093315472705L)
    public void ca(AlertDialog alertDialog) {
        try {
            if (w9) {
                iy.tp(200007312684874959L, this, alertDialog);
            }
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                button.setEnabled(FileSystem.exists(Mz(alertDialog)) && FileSystem.vJ(vJ(alertDialog)));
            }
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 200007312684874959L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -3215078050561682305L)
    private ld(String str, String str2, String str3) {
        try {
            if (w9) {
                iy.we(3466111084542111291L, null, str, str2, str3);
            }
            this.zh = str2;
            this.k2 = str3;
            this.AL = str;
        } catch (Throwable th) {
            if (hK) {
                iy.U2(th, 3466111084542111291L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = -14519582070333941L)
    public ld(String str) {
        try {
            if (w9) {
                iy.tp(3828419465604789783L, null, str);
            }
            SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences("ExportAPKDialog", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(sharedPreferences.getString("DefaultAPKDir", FileSystem.vy() + "/AppProjects"));
            sb.append("/");
            sb.append(AndroidProjectSupport.br(ServiceContainer.getProjectService().getCurrentAppHome()));
            this.zh = sb.toString();
            this.k2 = sharedPreferences.getString("DefaultKeyStore", FileSystem.vy() + "/AppProjects/publish.keystore");
            this.AL = str;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 3828419465604789783L, null, str);
            }
            throw th;
        }
    }
}
