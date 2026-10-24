package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.u;
import com.aide.ui.util.FileSpan;

@cy(clazz = -4195144536276187105L, container = -4195144536276187105L, user = true)
/* loaded from: classes.dex */
public class qd extends MessageBox {

    @fy
    private static /* synthetic */ boolean k2;

    @gy
    private static /* synthetic */ boolean zh;

    @cy(clazz = 7773574978105835520L, container = -4195144536276187105L, user = true)
    class a implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -121166671183297880L)
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -39116608957793824L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(5409814189350356448L, this, dialogInterface, new Integer(i));
                }
                qd.this.cb((AlertDialog) dialogInterface);
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 5409814189350356448L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7773698686079100175L, container = -4195144536276187105L, user = true)
    class b implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 132716347870268240L)
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 788199361031435844L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(-5311007677978911035L, this, dialogInterface, new Integer(i));
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                qd.this.cb(alertDialog);
                alertDialog.dismiss();
                qd.this.dx(alertDialog);
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -5311007677978911035L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7773822394056428124L, container = -4195144536276187105L, user = true)
    class c implements View.OnKeyListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -1686857967064747724L)
        final /* synthetic */ EditText j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 3310546665834666217L)
        public c(qd qdVar, EditText editText) {
            this.j6 = editText;
        }

        @Override // android.view.View.OnKeyListener
        @ey(method = 5564003378695405L)
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.we(-1313807391005268768L, this, view, new Integer(i), keyEvent);
                }
                if (keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                this.j6.selectAll();
                this.j6.requestFocus();
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -1313807391005268768L, this, view, new Integer(i), keyEvent);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7773946102037819367L, container = -4195144536276187105L, user = true)
    class d implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -147875540223831944L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -382980933738608832L)
        public d(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = -4086048355031419351L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(65664719297758456L, this, editable);
                }
                qd.this.g3(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 65664719297758456L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -2878313488782407000L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(1412548397019409183L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 1412548397019409183L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 7355806058523226772L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(2459878153051697037L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 2459878153051697037L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7774069810023273904L, container = -4195144536276187105L, user = true)
    class e implements View.OnKeyListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -4337303608130383000L)
        final /* synthetic */ AlertDialog j6;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -4186498162883077632L)
        public e(AlertDialog alertDialog) {
            this.j6 = alertDialog;
        }

        @Override // android.view.View.OnKeyListener
        @ey(method = 99194815338936105L)
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            try {
                if (FH) {
                    iy.we(-921827847663309887L, this, view, new Integer(i), keyEvent);
                }
                if (keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                if (qd.this.sh(this.j6)) {
                    qd.this.cb(this.j6);
                    this.j6.dismiss();
                    qd.this.dx(this.j6);
                }
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.U2(th, -921827847663309887L, this, view, new Integer(i), keyEvent);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7774193518012791735L, container = -4195144536276187105L, user = true)
    class f implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -1003907563357126365L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 2476289843418723387L)
        public f(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = 462730110308670960L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(50061322609667253L, this, editable);
                }
                qd.this.g3(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 50061322609667253L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -3100372865572405975L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(952904820747629928L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 952904820747629928L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -7965356193666744657L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(1416612863109727200L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 1416612863109727200L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7774317226006372860L, container = -4195144536276187105L, user = true)
    class g implements DialogInterface.OnShowListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -435965883093269175L)
        final /* synthetic */ EditText j6;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -7404934804118892257L)
        public g(EditText editText) {
            this.j6 = editText;
        }

        @Override // android.content.DialogInterface.OnShowListener
        @ey(method = -113792467494429968L)
        public void onShow(DialogInterface dialogInterface) {
            try {
                if (FH) {
                    iy.tp(-7888023750507210080L, this, dialogInterface);
                }
                qd.this.g3((AlertDialog) dialogInterface);
                this.j6.selectAll();
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -7888023750507210080L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(qd.class);
    }

    @ey(method = -2559678563493278865L)
    public qd() {
        try {
            if (k2) {
                iy.gn(-4910576453537338584L, null);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -4910576453537338584L, null);
            }
            throw th;
        }
    }

    @ey(method = -2150265422598495135L)
    private EditText Sf(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(2846712913976042272L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.replaceWithText);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 2846712913976042272L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5573960183748699008L)
    public void cb(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(4274518944532211235L, this, alertDialog);
            }
            InputMethodManager inputMethodManager = (InputMethodManager) alertDialog.getContext().getSystemService("input_method");
            inputMethodManager.hideSoftInputFromWindow(sG(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(Sf(alertDialog).getWindowToken(), 0);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 4274518944532211235L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 640147955846519265L)
    private String ef(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(142505698703918356L, this, alertDialog);
            }
            return sG(alertDialog).getText().toString();
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 142505698703918356L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2822391206186049720L)
    private EditText sG(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(2180589482704515701L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.replaceFindText);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 2180589482704515701L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2219398116819319803L)
    public boolean sh(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(-878408223698140944L, this, alertDialog);
            }
            if (ef(alertDialog).length() != 0) {
                if (!vJ(alertDialog).equals(ef(alertDialog))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -878408223698140944L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -362242430075187200L)
    private String vJ(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(-627713647852890783L, this, alertDialog);
            }
            return Sf(alertDialog).getText().toString();
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -627713647852890783L, this, alertDialog);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 1853749979640786432L)
    public Dialog Hw(Activity activity) {
        try {
            if (k2) {
                iy.tp(1345564862924095537L, this, activity);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            String strTrim = "";
            if (currentFileSpan.DW == currentFileSpan.Hw && currentFileSpan.FH != currentFileSpan.v5) {
                strTrim = ServiceContainer.getMainActivity().sh().getSelectionContent().trim();
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.replace, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(u.command_replace_textually).setView(viewInflate).setCancelable(true).setPositiveButton(u.dialog_replace, new b()).setNegativeButton(2131559870, new a());
            AlertDialog alertDialogCreate = builder.create();
            EditText editText = (EditText) viewInflate.findViewById(q.replaceFindText);
            EditText editText2 = (EditText) viewInflate.findViewById(q.replaceWithText);
            TextView textView = (TextView) viewInflate.findViewById(q.replaceScope);
            if (currentFileSpan.DW == currentFileSpan.Hw) {
                textView.setText(u.dialog_replace_message_in_this_file);
            } else {
                textView.setText(u.dialog_replace_message_in_selected_lines);
            }
            editText.setText(strTrim);
            editText.setOnKeyListener(new c(this, editText2));
            editText.addTextChangedListener(new d(alertDialogCreate));
            editText2.setText(strTrim);
            editText2.setOnKeyListener(new e(alertDialogCreate));
            editText2.addTextChangedListener(new f(alertDialogCreate));
            alertDialogCreate.getWindow().setSoftInputMode(2);
            alertDialogCreate.setOnShowListener(new g(editText));
            return alertDialogCreate;
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 1345564862924095537L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = -363263751922773952L)
    public void dx(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(-982286731689318033L, this, alertDialog);
            }
            String strEf = ef(alertDialog);
            String strVJ = vJ(alertDialog);
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            if (currentFileSpan.DW == currentFileSpan.Hw) {
                currentFileSpan = new FileSpan(currentFileSpan.j6, 1, 1, Integer.MAX_VALUE, 1);
            }
            ServiceContainer.getEngineService().Ws(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5, strEf, strVJ);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -982286731689318033L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2592561645331515781L)
    public void g3(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(678975074223110868L, this, alertDialog);
            }
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                button.setEnabled(sh(alertDialog));
            }
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 678975074223110868L, this, alertDialog);
            }
            throw th;
        }
    }
}
