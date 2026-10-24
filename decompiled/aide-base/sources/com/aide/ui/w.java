package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.aide.ui.util.FileSpan;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -2007863676330719029L, container = -2007863676330719029L, user = true)
/* loaded from: classes.dex */
public class w implements TextView.OnEditorActionListener, TextWatcher {

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = -2856654799166001724L)
    private MainActivity WB;

    @dy(field = -873728695165267460L)
    private c mb;

    @cy(clazz = 5684436469974629952L, container = -2007863676330719029L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2477945732303482104L)
        final /* synthetic */ EditText WB;

        @cy(clazz = 1556225812463284115L, container = -2007863676330719029L, user = true)
        /* renamed from: com.aide.ui.w$a$a, reason: collision with other inner class name */
        class RunnableC0099a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(RunnableC0099a.class);
            }

            @ey(method = 200018303172404400L)
            RunnableC0099a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -56769644176562584L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(913803073371737245L, this);
                    }
                    a.this.WB.requestFocus();
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, 913803073371737245L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 411830471950774540L)
        a(EditText editText) {
            this.WB = editText;
        }

        @Override // java.lang.Runnable
        @ey(method = -1898972765737693760L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(911452756204883580L, this);
                }
                ((InputMethodManager) w.this.WB.getSystemService("input_method")).showSoftInput(this.WB, 1);
                this.WB.postDelayed(new RunnableC0099a(), 300L);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 911452756204883580L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5684559321259543219L, container = -2007863676330719029L, user = true)
    static /* synthetic */ class b {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 4883277895701744704L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(b.class);
                if (DW) {
                    iy.gn(415275763506901420L, null);
                }
                int[] iArr = new int[c.values().length];
                j6 = iArr;
                try {
                    iArr[c.GotoLine.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[c.SearchText.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 415275763506901420L, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -611917518981659772L, container = -611917518981659772L, user = true)
    private static final class c {

        @dy(field = 979718225046031252L)
        public static final c GotoLine;

        @dy(field = 321872534947219456L)
        public static final c SearchText;

        @fy
        private static /* synthetic */ boolean fY;

        @dy(field = -1888466218662845505L)
        private static final /* synthetic */ c[] jw;

        @gy
        private static /* synthetic */ boolean qp;

        static {
            try {
                iy.Zo(c.class);
                if (fY) {
                    iy.gn(650004198289303536L, null);
                }
                SearchText = new c("SearchText", 0);
                c cVar = new c("GotoLine", 1);
                GotoLine = cVar;
                jw = new c[]{SearchText, cVar};
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 650004198289303536L, null);
                }
                throw th;
            }
        }

        @ey(method = 4835669440747304653L)
        private c(String str, int i) {
            try {
                if (fY) {
                    iy.EQ(-1610697626669369072L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, -1610697626669369072L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -589479185567369004L)
        public static c valueOf(String str) {
            try {
                if (fY) {
                    iy.tp(312068642041344164L, null, str);
                }
                return (c) Enum.valueOf(c.class, str);
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, 312068642041344164L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 1448844711171726224L)
        public static c[] values() {
            try {
                if (fY) {
                    iy.gn(-731096026613321408L, null);
                }
                return (c[]) jw.clone();
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -731096026613321408L, null);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(w.class);
    }

    @ey(method = -2677215157379655984L)
    public w(MainActivity mainActivity) {
        try {
            if (jw) {
                iy.tp(-2676664242965614655L, null, mainActivity);
            }
            this.WB = mainActivity;
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -2676664242965614655L, null, mainActivity);
            }
            throw th;
        }
    }

    @ey(method = -550558580243829861L)
    private View DW() {
        try {
            if (jw) {
                iy.gn(-1629885294752293521L, this);
            }
            return this.WB.findViewById(q.mainSearchBarNoTabs);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1629885294752293521L, this);
            }
            throw th;
        }
    }

    @ey(method = -1172976542416807328L)
    private TextView FH() {
        try {
            if (jw) {
                iy.gn(-2347757156696269632L, this);
            }
            return (TextView) this.WB.findViewById(q.mainSearchLabel);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2347757156696269632L, this);
            }
            throw th;
        }
    }

    @ey(method = 908772998941528865L)
    private EditText Hw() {
        try {
            if (jw) {
                iy.gn(-1051988327678915607L, this);
            }
            return (EditText) this.WB.findViewById(q.mainSearchBox);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1051988327678915607L, this);
            }
            throw th;
        }
    }

    @ey(method = 5624431811808888969L)
    private void gn(c cVar) {
        try {
            if (jw) {
                iy.tp(-2356194826711060039L, this, cVar);
            }
            this.mb = cVar;
            DW().setVisibility(0);
            TextView textViewFH = FH();
            int i = b.j6[cVar.ordinal()];
            if (i == 1) {
                textViewFH.setText("Line:");
            } else if (i == 2) {
                textViewFH.setText("Search:");
            }
            EditText editTextHw = Hw();
            int i2 = b.j6[cVar.ordinal()];
            if (i2 == 1) {
                editTextHw.setText(this.WB.sh().getCurrentFileSpan().DW + "");
            } else if (i2 == 2) {
                editTextHw.setText("");
            }
            editTextHw.requestFocus();
            editTextHw.selectAll();
            int i3 = b.j6[cVar.ordinal()];
            if (i3 == 1) {
                editTextHw.setImeOptions(268435456);
                editTextHw.setInputType(2);
            } else if (i3 == 2) {
                editTextHw.setImeOptions(268435461);
                editTextHw.setInputType(ProxyTextView.INPUTTYPE_textVisiblePassword);
            }
            editTextHw.setOnEditorActionListener(this);
            editTextHw.removeTextChangedListener(this);
            editTextHw.addTextChangedListener(this);
            editTextHw.postDelayed(new a(editTextHw), 100L);
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, -2356194826711060039L, this, cVar);
            }
            throw th;
        }
    }

    @ey(method = -2718220835833240407L)
    private String v5() {
        try {
            if (jw) {
                iy.gn(-3504126648477615027L, this);
            }
            return Hw().getText().toString().trim();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -3504126648477615027L, this);
            }
            throw th;
        }
    }

    @ey(method = 2749238639322843760L)
    public boolean VH() {
        try {
            if (jw) {
                iy.gn(1471703476885190928L, this);
            }
            return DW().getVisibility() == 0;
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 1471703476885190928L, this);
            }
            throw th;
        }
    }

    @ey(method = 2568776274002816388L)
    public void Zo() {
        try {
            if (jw) {
                iy.gn(-1812646537608449744L, this);
            }
            DW().setVisibility(8);
            this.WB.sh().jJ();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -1812646537608449744L, this);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    @ey(method = -6029422707782813535L)
    public void afterTextChanged(Editable editable) {
        try {
            if (jw) {
                iy.tp(4899151677048121605L, this, editable);
            }
            int i = b.j6[this.mb.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.WB.sh().AL(1, 1, v5());
            } else {
                try {
                    int i2 = Integer.parseInt(v5());
                    this.WB.sh().w9(i2, 1, i2, 1);
                } catch (NumberFormatException unused) {
                }
            }
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, 4899151677048121605L, this, editable);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    @ey(method = 918726215008488880L)
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            if (jw) {
                iy.J0(-2604237186746708576L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (fY) {
                iy.a8(th, -2604237186746708576L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    @ey(method = 324943494983601200L)
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        try {
            if (jw) {
                iy.we(-24074650895163640L, this, textView, new Integer(i), keyEvent);
            }
            if (keyEvent == null || keyEvent.getAction() == 0) {
                int i2 = b.j6[this.mb.ordinal()];
                if (i2 == 1) {
                    Zo();
                } else if (i2 == 2) {
                    AIDEEditorPager aIDEEditorPagerSh = this.WB.sh();
                    FileSpan currentFileSpan = aIDEEditorPagerSh.getCurrentFileSpan();
                    if (!aIDEEditorPagerSh.AL(currentFileSpan.DW, currentFileSpan.FH + 1, v5())) {
                        this.WB.sh().AL(1, 1, v5());
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, -24074650895163640L, this, textView, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    @ey(method = -1905098466717067648L)
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            if (jw) {
                iy.J0(6441842211837994332L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (fY) {
                iy.a8(th, 6441842211837994332L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -936290268959376592L)
    public void tp() {
        try {
            if (jw) {
                iy.gn(2176621492821851544L, this);
            }
            gn(c.SearchText);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 2176621492821851544L, this);
            }
            throw th;
        }
    }

    @ey(method = -3026653392166481647L)
    public void u7() {
        try {
            if (jw) {
                iy.gn(-4816076190168786375L, this);
            }
            gn(c.GotoLine);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -4816076190168786375L, this);
            }
            throw th;
        }
    }
}
