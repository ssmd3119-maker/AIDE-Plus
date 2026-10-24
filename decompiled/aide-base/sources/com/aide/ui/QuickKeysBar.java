package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aide.common.AndroidHelper;

@cy(clazz = -1995725694195156355L, container = -1995725694195156355L, user = true)
/* loaded from: classes.dex */
public class QuickKeysBar {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 691657283612899184L)
    private View DW;

    @dy(field = 3030609248821693084L)
    private String FH;

    @dy(field = -2990837279321786944L)
    private boolean Hw;

    @dy(field = -1727286895245966352L)
    private MainActivity j6;

    @dy(field = -5821078094900747817L)
    private KeyCharacterMap v5;

    @cy(clazz = -3321717559155843120L, container = -1995725694195156355L, user = true)
    class a implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -412059079870910205L)
        a() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 167817285647501440L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-367554349056618400L, this, view);
                }
                QuickKeysBar.this.VH(true);
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -367554349056618400L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3321818874080567079L, container = -1995725694195156355L, user = true)
    class b implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -13582862158219200L)
        b() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 112905155472187311L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(403719945311459589L, this, view);
                }
                QuickKeysBar.this.VH(false);
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 403719945311459589L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3321920189001227744L, container = -1995725694195156355L, user = true)
    class c implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -716372053886805133L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 106632023893023783L)
        c(String str) {
            this.WB = str;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -49571530281477080L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(-3095388791369639936L, this, view);
                }
                if (QuickKeysBar.this.v5 == null) {
                    QuickKeysBar.this.v5 = KeyCharacterMap.load(-1);
                }
                KeyEvent[] events = QuickKeysBar.this.v5.getEvents(this.WB.toCharArray());
                if (events != null) {
                    for (KeyEvent keyEvent : events) {
                        QuickKeysBar.this.j6.dispatchKeyEvent(keyEvent);
                    }
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, -3095388791369639936L, this, view);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(QuickKeysBar.class);
    }

    @ey(method = -2692284383468335852L)
    public QuickKeysBar(MainActivity mainActivity) {
        try {
            if (Zo) {
                iy.tp(-1405509376429968439L, null, mainActivity);
            }
            this.FH = "";
            this.j6 = mainActivity;
            this.DW = LayoutInflater.from(mainActivity).inflate(r.quickkeysbar, (ViewGroup) mainActivity.findViewById(q.mainQuickKeyBarContainer));
            VH(AndroidHelper.VH(mainActivity) >= 360.0f && AndroidHelper.j3(mainActivity));
            this.DW.findViewById(q.quickKeyBarOpenButton).setOnClickListener(new a());
            this.DW.findViewById(q.quickKeyBarCloseButton).setOnClickListener(new b());
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1405509376429968439L, null, mainActivity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1256956778787942960L)
    public void VH(boolean z) {
        try {
            if (Zo) {
                iy.Ws(358316072962785888L, this, z);
            }
            this.Hw = z;
            if (z) {
                this.DW.findViewById(q.quickKeyBarOpenButtonContainer).setVisibility(8);
                this.DW.findViewById(q.quickKeyBarKeysContainer).setVisibility(0);
            } else {
                this.DW.findViewById(q.quickKeyBarOpenButtonContainer).setVisibility(0);
                this.DW.findViewById(q.quickKeyBarKeysContainer).setVisibility(8);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 358316072962785888L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1011781276573301416L)
    public void Zo(boolean z) {
        try {
            if (Zo) {
                iy.Ws(1122274774010560960L, this, z);
            }
            if (this.DW != null) {
                this.DW.findViewById(q.quickKeyBar).setVisibility(z ? 0 : 8);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1122274774010560960L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1379416225353201240L)
    public void gn(String str) {
        float f;
        float f2;
        try {
            if (Zo) {
                iy.tp(-69825710447242304L, this, str);
            }
            if (this.DW == null || str == null || this.FH.equals(str)) {
                return;
            }
            this.FH = str;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.j6);
            if (AndroidHelper.VH(this.j6) >= 400.0f) {
                f = 60.0f;
                f2 = this.j6.getResources().getDisplayMetrics().density;
            } else {
                f = 30.0f;
                f2 = this.j6.getResources().getDisplayMetrics().density;
            }
            int i = (int) (f2 * f);
            int i2 = (int) (this.j6.getResources().getDisplayMetrics().density * 40.0f);
            ViewGroup viewGroup = (ViewGroup) this.DW.findViewById(q.quickKeyBarList);
            viewGroup.removeAllViews();
            for (String str2 : str.split(" ")) {
                String strReplace = str2.replace("s", " ");
                TextView textView = (TextView) layoutInflaterFrom.inflate(r.quickkeysbar_key, (ViewGroup) null);
                if (strReplace.trim().length() == 0) {
                    textView.setText("⇥");
                } else {
                    textView.setText(strReplace);
                }
                viewGroup.addView(textView, new LinearLayout.LayoutParams(i, i2));
                textView.setOnClickListener(new c(strReplace));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -69825710447242304L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3217162193105389408L)
    public int v5() {
        try {
            if (Zo) {
                iy.gn(36864782005627680L, this);
            }
            if (this.Hw) {
                return (int) (this.j6.getResources().getDisplayMetrics().density * 40.0f);
            }
            return 0;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 36864782005627680L, this);
            }
            throw th;
        }
    }
}
