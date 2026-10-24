package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
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
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.aide.ui.q;
import com.aide.ui.r;

@cy(clazz = -6420951009284476296L, container = -6420951009284476296L, user = true)
/* loaded from: classes.dex */
public class SizePickerDialog extends MessageBox {

    @gy
    private static /* synthetic */ boolean Z1;

    @fy
    private static /* synthetic */ boolean q7;

    @dy(field = -1476668194691602173L)
    private ValueRunnable<String> AL;

    @dy(field = -2059477075892605824L)
    private boolean cT;

    @dy(field = 2274064310390856345L)
    private AlertDialog hK;

    @dy(field = 526748407653482907L)
    private String k2;

    @dy(field = -72918645820836816L)
    private Runnable w9;

    @dy(field = 3030110207485413615L)
    private String zh;

    @cy(clazz = 7362269361799739625L, container = -6420951009284476296L, user = true)
    class a implements SeekBar.OnSeekBarChangeListener {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -1984496741588326603L)
        final /* synthetic */ SeekBar DW;

        @dy(field = 1755338963164682140L)
        final /* synthetic */ EditText j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1126530574117815195L)
        a(EditText editText, SeekBar seekBar) {
            this.j6 = editText;
            this.DW = seekBar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @ey(method = -2652385375895288505L)
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            try {
                if (Hw) {
                    iy.we(2585311504734508900L, this, seekBar, new Integer(i), new Boolean(z));
                }
                if (SizePickerDialog.this.cT) {
                    return;
                }
                this.j6.setText(SizePickerDialog.this.Mz(this.DW, this.j6.getText().toString()));
            } catch (Throwable th) {
                if (v5) {
                    iy.U2(th, 2585311504734508900L, this, seekBar, new Integer(i), new Boolean(z));
                }
                throw th;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @ey(method = 164368036752438480L)
        public void onStartTrackingTouch(SeekBar seekBar) {
            try {
                if (Hw) {
                    iy.tp(2017023948132460155L, this, seekBar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 2017023948132460155L, this, seekBar);
                }
                throw th;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @ey(method = 3902482114945473360L)
        public void onStopTrackingTouch(SeekBar seekBar) {
            try {
                if (Hw) {
                    iy.tp(290907118009294735L, this, seekBar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 290907118009294735L, this, seekBar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7362391223106751152L, container = -6420951009284476296L, user = true)
    class b implements TextWatcher {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 3094295364310187268L)
        final /* synthetic */ SeekBar WB;

        @dy(field = 3509861980827605307L)
        final /* synthetic */ EditText mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -165949409866520008L)
        b(SeekBar seekBar, EditText editText) {
            this.WB = seekBar;
            this.mb = editText;
        }

        @Override // android.text.TextWatcher
        @ey(method = 4568724083502597700L)
        public void afterTextChanged(Editable editable) {
            try {
                if (fY) {
                    iy.tp(-4737701181732788500L, this, editable);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -4737701181732788500L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 3764571094947455363L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (fY) {
                    iy.J0(-1233092246697293477L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.a8(th, -1233092246697293477L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -1402329216411462903L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (fY) {
                    iy.J0(107688213966559649L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                SizePickerDialog.this.cT = true;
                SizePickerDialog.this.Qq(this.WB, this.mb.getText().toString());
                SizePickerDialog.this.cT = false;
            } catch (Throwable th) {
                if (qp) {
                    iy.a8(th, 107688213966559649L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7362513084417825973L, container = -6420951009284476296L, user = true)
    class c implements View.OnClickListener {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 1616188488029180000L)
        final /* synthetic */ EditText WB;

        @dy(field = 1249698384644078985L)
        final /* synthetic */ SeekBar mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -839356479970877703L)
        c(EditText editText, SeekBar seekBar) {
            this.WB = editText;
            this.mb = seekBar;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -246993986925465240L)
        public void onClick(View view) {
            try {
                if (fY) {
                    iy.tp(665434883221780992L, this, view);
                }
                this.WB.setText(SizePickerDialog.this.x9(this.WB.getText().toString()));
                SizePickerDialog.this.Qq(this.mb, this.WB.getText().toString());
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 665434883221780992L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7362634945732964088L, container = -6420951009284476296L, user = true)
    class d implements View.OnClickListener {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -1628196228804623192L)
        final /* synthetic */ EditText WB;

        @dy(field = -1382921101560534005L)
        final /* synthetic */ SeekBar mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -87828269771173673L)
        d(EditText editText, SeekBar seekBar) {
            this.WB = editText;
            this.mb = seekBar;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 365603819147446460L)
        public void onClick(View view) {
            try {
                if (fY) {
                    iy.tp(-1338893652850240229L, this, view);
                }
                this.WB.setText(SizePickerDialog.this.g3(this.WB.getText().toString()));
                SizePickerDialog.this.Qq(this.mb, this.WB.getText().toString());
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -1338893652850240229L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7362756807052165497L, container = -6420951009284476296L, user = true)
    class e implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 3278637219004484276L)
        final /* synthetic */ Activity WB;

        @dy(field = 442438721708034627L)
        final /* synthetic */ EditText mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 1169124435930654588L)
        e(Activity activity, EditText editText) {
            this.WB = activity;
            this.mb = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -741523471882601213L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (fY) {
                    iy.EQ(1808075720639021869L, this, dialogInterface, new Integer(i));
                }
                ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                SizePickerDialog.this.w9.run();
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, 1808075720639021869L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7362878668375430200L, container = -6420951009284476296L, user = true)
    class f implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 3671622607482202299L)
        final /* synthetic */ Activity WB;

        @dy(field = -3208420878471144112L)
        final /* synthetic */ EditText mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -2008423627920103329L)
        f(SizePickerDialog sizePickerDialog, Activity activity, EditText editText) {
            this.WB = activity;
            this.mb = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -112328022838070744L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (jw) {
                    iy.EQ(3066404373044147580L, this, dialogInterface, new Integer(i));
                }
                ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, 3066404373044147580L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7363000529702758197L, container = -6420951009284476296L, user = true)
    class g implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -4221095438140623121L)
        final /* synthetic */ Activity WB;

        @dy(field = -2592835585182518400L)
        final /* synthetic */ EditText mb;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 647185501606058155L)
        g(Activity activity, EditText editText) {
            this.WB = activity;
            this.mb = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -827236492477657416L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (fY) {
                    iy.EQ(4322262938785465677L, this, dialogInterface, new Integer(i));
                }
                ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                dialogInterface.dismiss();
                SizePickerDialog.this.AL.j6(this.mb.getText().toString().trim());
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, 4322262938785465677L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 7363122391034149488L, container = -6420951009284476296L, user = true)
    class h implements TextView.OnEditorActionListener {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -1703676872248864455L)
        final /* synthetic */ Activity WB;

        @dy(field = -2776626419183872416L)
        final /* synthetic */ EditText mb;

        static {
            iy.Zo(h.class);
        }

        @ey(method = -785418069528290107L)
        h(Activity activity, EditText editText) {
            this.WB = activity;
            this.mb = editText;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        @ey(method = 570657690056460832L)
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            try {
                if (fY) {
                    iy.we(-6959638322589074139L, this, textView, new Integer(i), keyEvent);
                }
                if (i == 6) {
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    SizePickerDialog.this.hK.dismiss();
                    SizePickerDialog.this.AL.j6(this.mb.getText().toString().trim());
                }
                return false;
            } catch (Throwable th) {
                if (qp) {
                    iy.U2(th, -6959638322589074139L, this, textView, new Integer(i), keyEvent);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(SizePickerDialog.class);
    }

    @ey(method = 124806081408176160L)
    public SizePickerDialog(String str, String str2, ValueRunnable<String> valueRunnable, Runnable runnable) {
        try {
            if (q7) {
                iy.J0(3893062001227811984L, null, str, str2, valueRunnable, runnable);
            }
            this.k2 = str;
            this.zh = str2;
            this.AL = valueRunnable;
            this.w9 = runnable;
        } catch (Throwable th) {
            if (Z1) {
                iy.a8(th, 3893062001227811984L, null, str, str2, valueRunnable, runnable);
            }
            throw th;
        }
    }

    @ey(method = 854311022255287488L)
    private String I(String str) {
        try {
            if (q7) {
                iy.tp(-573741704658576779L, this, str);
            }
            if (str.length() == 0) {
                return null;
            }
            int i = 0;
            if (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-') {
                return null;
            }
            while (i < str.length() && (Character.isDigit(str.charAt(i)) || str.charAt(i) == '-')) {
                i++;
            }
            return str.substring(i, str.length());
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, -573741704658576779L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1409482166785352559L)
    public String Mz(SeekBar seekBar, String str) {
        try {
            if (q7) {
                iy.EQ(-3706177497023204184L, this, seekBar, str);
            }
            String strI = I(str);
            if (strI == null) {
                strI = "";
            }
            return seekBar.getProgress() + strI;
        } catch (Throwable th) {
            if (Z1) {
                iy.Mr(th, -3706177497023204184L, this, seekBar, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -6621029045346984135L)
    public void Qq(SeekBar seekBar, String str) {
        try {
            if (q7) {
                iy.EQ(1198041819787012080L, this, seekBar, str);
            }
            seekBar.setProgress(Math.max(0, Math.min(100, ca(str))));
        } catch (Throwable th) {
            if (Z1) {
                iy.Mr(th, 1198041819787012080L, this, seekBar, str);
            }
            throw th;
        }
    }

    @ey(method = -1112348375437288585L)
    private int ca(String str) {
        try {
            if (q7) {
                iy.tp(1495379695836042936L, this, str);
            }
            int i = 0;
            while (i < str.length() && (Character.isDigit(str.charAt(i)) || str.charAt(i) == '-')) {
                i++;
            }
            try {
                return Integer.parseInt(str.substring(0, i));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, 1495379695836042936L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1125999168538804308L)
    public String g3(String str) {
        try {
            if (q7) {
                iy.tp(173761071234035681L, this, str);
            }
            String strI = I(str);
            if (strI == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ca(str) - 1);
            sb.append(strI);
            return sb.toString();
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, 173761071234035681L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1776586152585643448L)
    public String x9(String str) {
        try {
            if (q7) {
                iy.tp(1045010856604870935L, this, str);
            }
            String strI = I(str);
            if (strI == null) {
                return str;
            }
            return (ca(str) + 1) + strI;
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, 1045010856604870935L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = -83764276660784727L)
    protected Dialog Hw(Activity activity) {
        try {
            if (q7) {
                iy.tp(312834692866214584L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.designer_sizedialog, (ViewGroup) null);
            EditText editText = (EditText) viewInflate.findViewById(q.designersizedialogEditText);
            editText.setText(this.zh);
            SeekBar seekBar = (SeekBar) viewInflate.findViewById(q.designersizedialogSeekBar);
            seekBar.setMax(100);
            Qq(seekBar, this.zh);
            seekBar.setOnSeekBarChangeListener(new a(editText, seekBar));
            editText.addTextChangedListener(new b(seekBar, editText));
            ((TextView) viewInflate.findViewById(q.designersizedialogPlusButton)).setOnClickListener(new c(editText, seekBar));
            ((TextView) viewInflate.findViewById(q.designersizedialogMinusButton)).setOnClickListener(new d(editText, seekBar));
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setView(viewInflate).setCancelable(true).setPositiveButton("Ok", new g(activity, editText)).setNegativeButton("Cancel", new f(this, activity, editText)).setNeutralButton("None", new e(activity, editText));
            if (this.k2 != null) {
                builder.setTitle(this.k2);
            }
            this.hK = builder.create();
            editText.setOnEditorActionListener(new h(activity, editText));
            this.hK.setCanceledOnTouchOutside(true);
            this.hK.getWindow().setSoftInputMode(2);
            return this.hK;
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, 312834692866214584L, this, activity);
            }
            throw th;
        }
    }
}
