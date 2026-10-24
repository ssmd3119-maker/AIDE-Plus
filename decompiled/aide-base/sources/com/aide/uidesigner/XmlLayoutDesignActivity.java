package com.aide.uidesigner;

import abcd.b0;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.legacy.app.ActionBarDrawerToggle;
import com.aide.common.AIDEActivityStarter;
import com.aide.common.AIDEHelpActivityStarter;
import com.aide.common.AIDEShopActivityStarter;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.common.TextToSpeechHelper;
import com.aide.common.UndoManager;
import com.aide.common.ValueRunnable;
import com.aide.ui.R$drawable;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.p;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.s;
import com.aide.ui.t;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -2761603648942096159L, container = -2761603648942096159L, user = true)
/* loaded from: classes.dex */
public class XmlLayoutDesignActivity extends Activity {

    @fy
    private static /* synthetic */ boolean Q6;

    @gy
    private static /* synthetic */ boolean kf;

    @dy(field = 1148128536734063587L)
    private String AL;

    @dy(field = 4966722040749927987L)
    private LinearLayout WB;

    @dy(field = 2743830470480381408L)
    private SoundPool Z1;

    @dy(field = 4375633138514648325L)
    private boolean cT;

    @dy(field = -4985243385237931320L)
    private ActionBarDrawerToggle fY;

    @dy(field = -285618392490262860L)
    private boolean hK;

    @dy(field = -873838181706193039L)
    private boolean jw;

    @dy(field = 2413866931227350580L)
    private UndoManager k2;

    @dy(field = 1865376215420291139L)
    private LinearLayout mb;

    @dy(field = -3018703937080657747L)
    private int n5;

    @dy(field = 1215947056675035136L)
    private TextToSpeechHelper q7;

    @dy(field = 1166478388400933504L)
    private com.aide.uidesigner.l qp;

    @dy(field = 4840273480200028632L)
    private boolean w9;

    @dy(field = 2100281338259306461L)
    private String zh;

    @cy(clazz = -257359381788677516L, container = -2761603648942096159L, user = true)
    class a implements ValueRunnable<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 180968126756806660L)
        a() {
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -6137843004889815037L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(437882248377325944L, this, str);
                }
                XmlLayoutDesignActivity.this.sh(true);
                XmlLayoutDesignActivity.this.zh = com.aide.uidesigner.d.DW(XmlLayoutDesignActivity.this.AL, str);
                if (XmlLayoutDesignActivity.this.cT) {
                    XmlLayoutDesignActivity.this.cb(XmlLayoutDesignActivity.this.zh);
                }
                XmlLayoutDesignActivity.this.a8();
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 437882248377325944L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467684241249703424L, container = -2761603648942096159L, user = true)
    class b implements b0 {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -69122447410698000L)
        b() {
        }

        @Override // abcd.b0
        @ey(method = -6668640337867396735L)
        public boolean j6() {
            try {
                if (DW) {
                    iy.gn(-736952301685551735L, this);
                }
                if (XmlLayoutDesignActivity.this.getPackageName().startsWith("com.aide.designer")) {
                    return true;
                }
                return PreferenceManager.getDefaultSharedPreferences(XmlLayoutDesignActivity.this).getBoolean("send_analytics_data", true);
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -736952301685551735L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467720459875724997L, container = -2761603648942096159L, user = true)
    class c implements ActionBar.OnNavigationListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -63889774214582384L)
        c() {
        }

        @Override // android.app.ActionBar.OnNavigationListener
        @ey(method = 7734759995625000663L)
        public boolean onNavigationItemSelected(int i, long j) {
            try {
                if (DW) {
                    iy.EQ(329726655247481905L, this, new Integer(i), new Long(j));
                }
                if (!XmlLayoutDesignActivity.this.jw || i == XmlLayoutDesignActivity.this.gW()) {
                    return true;
                }
                XmlLayoutDesignActivity.this.dx(i);
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 329726655247481905L, this, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467756678505809864L, container = -2761603648942096159L, user = true)
    class d extends TranslateAnimation {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -21063141918356149L)
        final /* synthetic */ View WB;

        static {
            iy.Zo(d.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 2908372691116075895L)
        d(float f, float f2, float f3, float f4, View view) {
            super(f, f2, f3, f4);
            this.WB = view;
        }

        @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
        @ey(method = 480745020842538816L)
        protected void applyTransformation(float f, Transformation transformation) {
            try {
                if (jw) {
                    iy.EQ(-2696952967213896540L, this, new Float(f), transformation);
                }
                super.applyTransformation(f, transformation);
                this.WB.invalidate();
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, -2696952967213896540L, this, new Float(f), transformation);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467792897139958025L, container = -2761603648942096159L, user = true)
    class e implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 20740305184788508L)
        e() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -419947584690221016L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(2873650901344724160L, this, view);
                }
                Intent intent = new Intent();
                intent.putExtra("EXTRA_TRAINER_ACTION", 1);
                XmlLayoutDesignActivity.this.setResult(-1, intent);
                XmlLayoutDesignActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 2873650901344724160L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467829115778169480L, container = -2761603648942096159L, user = true)
    class f implements View.OnFocusChangeListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -1089662590474537797L)
        final /* synthetic */ TextView WB;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -8277288056691190575L)
        f(TextView textView) {
            this.WB = textView;
        }

        @Override // android.view.View.OnFocusChangeListener
        @ey(method = 3813137624418866304L)
        public void onFocusChange(View view, boolean z) {
            try {
                if (jw) {
                    iy.EQ(1656020100838463897L, this, view, new Boolean(z));
                }
                if (z) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.0f, 1, 0.5f);
                    scaleAnimation.setDuration(400);
                    scaleAnimation.setFillAfter(true);
                    this.WB.startAnimation(scaleAnimation);
                    return;
                }
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.0f, 1, 0.5f);
                scaleAnimation2.setDuration(400);
                scaleAnimation2.setFillAfter(true);
                this.WB.startAnimation(scaleAnimation2);
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, 1656020100838463897L, this, view, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467865334420444229L, container = -2761603648942096159L, user = true)
    class g implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -2281388926085435252L)
        final /* synthetic */ View WB;

        @dy(field = -1012262682198186500L)
        final /* synthetic */ TranslateAnimation mb;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 224007722768416265L)
        g(View view, TranslateAnimation translateAnimation) {
            this.WB = view;
            this.mb = translateAnimation;
        }

        @Override // java.lang.Runnable
        @ey(method = -1247581826716242836L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-2263316793570582067L, this);
                }
                XmlLayoutDesignActivity.this.vJ();
                this.WB.setVisibility(0);
                this.WB.startAnimation(this.mb);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -2263316793570582067L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467901553066782272L, container = -2761603648942096159L, user = true)
    class h implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 179148122928070400L)
        h() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = -1601064232893849185L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (mb) {
                    iy.J0(-390325241361267927L, this, adapterView, view, new Integer(i), new Long(j));
                }
                k kVar = (k) adapterView.getItemAtPosition(i);
                if (kVar.FH != null) {
                    XmlLayoutDesignActivity.this.SI(kVar.FH);
                } else if (kVar.j6 != null) {
                    XmlLayoutDesignActivity.this.KD(kVar.j6.getPath());
                } else if (kVar.DW) {
                    XmlLayoutDesignActivity.this.lg();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.a8(th, -390325241361267927L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467937771717183609L, container = -2761603648942096159L, user = true)
    class i extends com.aide.uidesigner.l {

        @fy
        private static /* synthetic */ boolean e3;

        @gy
        private static /* synthetic */ boolean sE;

        @dy(field = 2344260958433202907L)
        private boolean iW;

        @cy(clazz = 5219063129694683848L, container = -2761603648942096159L, user = true)
        class a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 719487948304339968L)
            a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 7291488717375276915L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(2601572873397869735L, this, bVar);
                    }
                    XmlLayoutDesignActivity.this.qp.VH(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2601572873397869735L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(i.class);
        }

        @ey(method = -5633277471194068096L)
        i(ViewGroup viewGroup, String str, String str2, UndoManager undoManager) {
            super(viewGroup, str, str2, undoManager);
            this.iW = true;
        }

        @Override // com.aide.uidesigner.l
        @ey(method = 1998377543781749800L)
        protected void XG(boolean z) {
            try {
                if (e3) {
                    iy.Ws(-4485791141819146916L, this, z);
                }
                XmlLayoutDesignActivity.this.invalidateOptionsMenu();
                if (XmlLayoutDesignActivity.this.hK) {
                    if (z && this.iW) {
                        this.iW = false;
                        AIDEShopActivityStarter.DW(XmlLayoutDesignActivity.this, 0, "unlock the UI designer", false, false);
                        return;
                    }
                    return;
                }
                if (XmlLayoutDesignActivity.this.zh != null) {
                    try {
                        FileWriter fileWriter = new FileWriter(XmlLayoutDesignActivity.this.zh);
                        fileWriter.write(XmlLayoutDesignActivity.this.qp.Mz());
                        fileWriter.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                if (sE) {
                    iy.j3(th, -4485791141819146916L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = -1540310193391718640L)
        protected void XX() {
            try {
                if (e3) {
                    iy.gn(-1693913222932277904L, this);
                }
                XmlLayoutDesignActivity.this.mb.invalidate();
                if (vy().size() > 0) {
                    vy().get(0).requestFocus();
                }
                XmlLayoutDesignActivity.this.g3();
            } catch (Throwable th) {
                if (sE) {
                    iy.aM(th, -1693913222932277904L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = 451429566356521753L)
        protected void br() {
            try {
                if (e3) {
                    iy.gn(-2628926384807103291L, this);
                }
                com.aide.uidesigner.k.FH(XmlLayoutDesignActivity.this, "Add...", new a());
            } catch (Throwable th) {
                if (sE) {
                    iy.aM(th, -2628926384807103291L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = -1945919083875215040L)
        protected void kQ(com.aide.uidesigner.f fVar) {
            try {
                if (e3) {
                    iy.tp(2647845330102496224L, this, fVar);
                }
                XmlLayoutDesignActivity.this.SI(fVar);
            } catch (Throwable th) {
                if (sE) {
                    iy.j3(th, 2647845330102496224L, this, fVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1467973990371648240L, container = -2761603648942096159L, user = true)
    class j implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3852048434668022160L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(j.class);
        }

        @ey(method = 78422428017134793L)
        j(String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 2559221432572693504L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(429421949172340871L, this);
                }
                new File(this.WB).delete();
                if (!XmlLayoutDesignActivity.this.zh.equals(this.WB)) {
                    XmlLayoutDesignActivity.this.g3();
                    return;
                }
                XmlLayoutDesignActivity.this.zh = com.aide.uidesigner.d.j6(XmlLayoutDesignActivity.this.AL);
                if (XmlLayoutDesignActivity.this.cT) {
                    XmlLayoutDesignActivity.this.cb(XmlLayoutDesignActivity.this.zh);
                }
                XmlLayoutDesignActivity.this.a8();
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 429421949172340871L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1672437279430558904L, container = 1672437279430558904L, user = true)
    private class l extends ArrayAdapter<k> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 1523748273384959688L)
        @hy
        final /* synthetic */ XmlLayoutDesignActivity j6;

        @cy(clazz = -2074804502853101607L, container = 1672437279430558904L, user = true)
        class a implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -1084399141721076288L)
            final /* synthetic */ k WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -126601883146453368L)
            a(k kVar) {
                this.WB = kVar;
            }

            @Override // android.view.View.OnClickListener
            @ey(method = -142484118987216372L)
            public void onClick(View view) {
                try {
                    if (jw) {
                        iy.tp(288647010193721865L, this, view);
                    }
                    l.this.j6.rN(this.WB.j6.getPath());
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 288647010193721865L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(l.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 1159378966533570068L)
        public l(XmlLayoutDesignActivity xmlLayoutDesignActivity, Context context, List<k> list) {
            super(context, r.designer_viewlist_entry, list);
            try {
                if (DW) {
                    iy.we(-31329099779967120L, null, xmlLayoutDesignActivity, context, list);
                }
                this.j6 = xmlLayoutDesignActivity;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -31329099779967120L, null, xmlLayoutDesignActivity, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = 1748395012633134525L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (DW) {
                    iy.we(445735583216114936L, this, new Integer(i), view, viewGroup);
                }
                int i2 = 0;
                View viewInflate = view == null ? LayoutInflater.from(getContext()).inflate(r.designer_viewlist_entry, viewGroup, false) : view;
                k item = getItem(i);
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(q.designerViewlistentryViewLayout);
                LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(q.designerViewlistentryFileLayout);
                if (item.FH != null) {
                    linearLayout.setVisibility(0);
                    linearLayout2.setVisibility(8);
                    linearLayout.setPadding((int) (((item.FH.getDepth() * 20) + 5) * getContext().getResources().getDisplayMetrics().density), 0, 0, 0);
                    ((TextView) viewInflate.findViewById(q.designerViewlistEntryName)).setText(item.FH.getNodeName());
                    ((ImageView) viewInflate.findViewById(q.designerViewlistEntryImage)).setImageResource(item.FH.XL() ? R$drawable.objects : R$drawable.box_blue);
                } else if (item.j6 != null) {
                    linearLayout.setVisibility(8);
                    linearLayout2.setVisibility(0);
                    linearLayout2.setPadding(0, 0, 0, 0);
                    RadioButton radioButton = (RadioButton) viewInflate.findViewById(q.designerViewlistentryFileRadioButton);
                    radioButton.setFocusable(false);
                    radioButton.setFocusableInTouchMode(false);
                    radioButton.setChecked(this.j6.zh.equals(item.j6.getPath()));
                    radioButton.setVisibility(this.j6.w9 ? 0 : 8);
                    TextView textView = (TextView) viewInflate.findViewById(q.designerViewlistentryFileName);
                    textView.setText(item.j6.getName());
                    if (this.j6.zh.equals(item.j6.getPath())) {
                        textView.setTypeface(Typeface.DEFAULT_BOLD);
                    } else {
                        textView.setTypeface(Typeface.DEFAULT);
                    }
                    ((ImageView) viewInflate.findViewById(q.designerViewlistFileImage)).setImageResource(R$drawable.file_type_xml);
                    ImageView imageView = (ImageView) viewInflate.findViewById(q.designerViewlistentryDelete);
                    if (!this.j6.w9) {
                        i2 = 8;
                    }
                    imageView.setVisibility(i2);
                    imageView.setOnClickListener(new a(item));
                } else {
                    linearLayout.setVisibility(8);
                    linearLayout2.setVisibility(0);
                    linearLayout2.setPadding(0, 0, 0, (int) (getContext().getResources().getDisplayMetrics().density * 10.0f));
                    RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(q.designerViewlistentryFileRadioButton);
                    radioButton2.setFocusable(false);
                    radioButton2.setFocusableInTouchMode(false);
                    radioButton2.setVisibility(4);
                    TextView textView2 = (TextView) viewInflate.findViewById(q.designerViewlistentryFileName);
                    textView2.setText("New layout...");
                    textView2.setTypeface(Typeface.DEFAULT);
                    ((ImageView) viewInflate.findViewById(q.designerViewlistFileImage)).setImageResource(AndroidHelper.vy(getContext(), p.icon_add));
                    ((ImageView) viewInflate.findViewById(q.designerViewlistentryDelete)).setVisibility(8);
                }
                return viewInflate;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, 445735583216114936L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(XmlLayoutDesignActivity.class);
    }

    @ey(method = 1096905073261500800L)
    public XmlLayoutDesignActivity() {
        try {
            if (Q6) {
                iy.gn(317603236017144393L, null);
            }
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 317603236017144393L, null);
            }
            throw th;
        }
    }

    private static /* synthetic */ void DW(Object obj, Intent intent) {
        ((XmlLayoutDesignActivity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = 1620170775722338785L)
    private boolean P8() {
        try {
            if (Q6) {
                iy.gn(-2086566987541327368L, this);
            }
            if (nw()) {
                return true;
            }
            return yS().getBoolean("PREF_XMLDESIGNER_EDITMODE", true);
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -2086566987541327368L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1500446066029470160L)
    public void SI(com.aide.uidesigner.f fVar) {
        try {
            if (Q6) {
                iy.tp(-2986909770819511215L, this, fVar);
            }
            com.aide.uidesigner.g.Hw(this, fVar);
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -2986909770819511215L, this, fVar);
            }
            throw th;
        }
    }

    @ey(method = 65479118531848200L)
    public static void Sf(Activity activity, String str, String str2, int i2, String[] strArr, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        try {
            if (Q6) {
                iy.QX(6674677492620172341L, null, new Object[]{activity, str, str2, new Integer(i2), strArr, str3, str4, str5, str6, str7, new Boolean(z), new Boolean(z2)});
            }
            Intent intent = new Intent(activity, (Class<?>) XmlLayoutDesignActivity.class);
            intent.putExtra("EXTRA_FILE", str2);
            intent.putExtra("EXTRA_LANGUAGE", str);
            intent.putExtra("EXTRA_LICENSED", false);
            intent.putExtra("EXTRA_STANDALONE", false);
            intent.putExtra("EXTRA_TRAINER", true);
            intent.putExtra("EXTRA_TRAINER_SOUND", z2);
            intent.putExtra("EXTRA_TRAINER_TASK", str4);
            intent.putExtra("EXTRA_TRAINER_TITILE", str5);
            intent.putExtra("EXTRA_TRAINER_BUTTON", str6);
            intent.putExtra("EXTRA_HEADER", strArr);
            intent.putExtra("EXTRA_TRAINER_LOCALE", str3);
            intent.putExtra("EXTRA_TRAINER_SPEAK", z);
            intent.putExtra("EXTRA_TRAINER_RUN_BUTTON", str7);
            activity.startActivityForResult(intent, i2);
        } catch (Throwable th) {
            if (kf) {
                iy.rN(th, 6674677492620172341L, null, new Object[]{activity, str, str2, new Integer(i2), strArr, str3, str4, str5, str6, str7, new Boolean(z), new Boolean(z2)});
            }
            throw th;
        }
    }

    @ey(method = -7771534887487600625L)
    private void U2() {
        try {
            if (Q6) {
                iy.gn(4118730363111407664L, this);
            }
            int iGW = gW();
            if (iGW != 0 && iGW != 1) {
                this.WB.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                this.qp.FN(false);
                return;
            }
            int i2 = getResources().getDisplayMetrics().heightPixels;
            int i3 = getResources().getDisplayMetrics().widthPixels;
            float f2 = getResources().getDisplayMetrics().density;
            int i4 = (int) (300.0f * f2);
            int i5 = (int) (f2 * 500.0f);
            double d2 = i3;
            Double.isNaN(d2);
            int iMin = Math.min(i4, (int) (d2 * 0.8d));
            double d3 = i2;
            Double.isNaN(d3);
            this.WB.setLayoutParams(new LinearLayout.LayoutParams(iMin, Math.min(i5, (int) (d3 * 0.8d))));
            this.qp.FN(true);
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 4118730363111407664L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4611225767320523641L)
    public void a8() {
        try {
            if (Q6) {
                iy.gn(-2557315280227105200L, this);
            }
            this.k2 = new UndoManager();
            i iVar = new i(this.WB, this.zh, this.AL, this.k2);
            this.qp = iVar;
            iVar.OW();
            this.qp.hz(P8());
            invalidateOptionsMenu();
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -2557315280227105200L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2217545679529319433L)
    public void cb(String str) {
        try {
            if (Q6) {
                iy.tp(3768646549735579200L, this, str);
            }
            SharedPreferences.Editor editorEdit = yS().edit();
            editorEdit.putString("PREF_XMLDESIGNER_FILE", str);
            editorEdit.commit();
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 3768646549735579200L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1132525172105070640L)
    public static boolean cn(Intent intent) {
        try {
            if (Q6) {
                iy.tp(982952188059374765L, null, intent);
            }
            return intent.getIntExtra("EXTRA_TRAINER_ACTION", 0) == 2;
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 982952188059374765L, null, intent);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2739815803349256684L)
    public void dx(int i2) {
        try {
            if (Q6) {
                iy.u7(322216959422449251L, this, i2);
            }
            SharedPreferences.Editor editorEdit = yS().edit();
            editorEdit.putInt("XMLDESIGNER_VIEW", i2);
            editorEdit.commit();
            recreate();
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 322216959422449251L, this, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1295442216652418380L)
    private boolean ei() {
        try {
            if (Q6) {
                iy.gn(594429352433892185L, this);
            }
            if (AndroidHelper.U2(this)) {
                if (nw()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 594429352433892185L, this);
            }
            throw th;
        }
    }

    @ey(method = 1625358447267223047L)
    private String er() {
        try {
            if (Q6) {
                iy.gn(3445881825537904200L, this);
            }
            return yS().getString("PREF_XMLDESIGNER_FILE", null);
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 3445881825537904200L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5348860367439485536L)
    public void g3() {
        try {
            if (Q6) {
                iy.gn(-4301200312177752165L, this);
            }
            ArrayList arrayList = new ArrayList();
            if (this.w9) {
                Iterator<File> it = com.aide.uidesigner.d.Hw(this.AL).iterator();
                while (it.hasNext()) {
                    arrayList.add(new k(it.next()));
                }
                arrayList.add(new k(true));
            } else {
                arrayList.add(new k(new File(this.zh)));
            }
            Iterator<com.aide.uidesigner.f> it2 = this.qp.vy().iterator();
            while (it2.hasNext()) {
                arrayList.add(new k(it2.next()));
            }
            ListView listView = (ListView) findViewById(q.designerViewList);
            l lVar = (l) listView.getAdapter();
            if (lVar == null) {
                listView.setAdapter((ListAdapter) new l(this, this, arrayList));
                return;
            }
            lVar.clear();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                lVar.add((k) it3.next());
            }
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -4301200312177752165L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3418299374238413203L)
    public int gW() {
        try {
            if (Q6) {
                iy.gn(941876135859681792L, this);
            }
            if (nw()) {
                return 2;
            }
            return yS().getInt("XMLDESIGNER_VIEW", 0);
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 941876135859681792L, this);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4185070579887678832L)
    public void lg() {
        try {
            if (Q6) {
                iy.gn(-2144504596351403857L, this);
            }
            MessageBox.aM(this, "New Layout", "File name:", com.aide.uidesigner.d.tp(this.AL), new a());
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -2144504596351403857L, this);
            }
            throw th;
        }
    }

    @ey(method = -3811695516517225743L)
    private boolean nw() {
        try {
            if (Q6) {
                iy.gn(-2204103601395761520L, this);
            }
            return getIntent().getBooleanExtra("EXTRA_TRAINER", false);
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -2204103601395761520L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -601743210400560885L)
    public void rN(String str) {
        try {
            if (Q6) {
                iy.tp(-730222573312612864L, this, str);
            }
            MessageBox.rN(this, "Delete Layout " + new File(str).getName(), "Really delete this layout?", new j(str), null);
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -730222573312612864L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3579554100091110288L)
    public static boolean ro(Intent intent) {
        try {
            if (Q6) {
                iy.tp(-7718219145977109L, null, intent);
            }
            return intent.getIntExtra("EXTRA_TRAINER_ACTION", 0) == 1;
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -7718219145977109L, null, intent);
            }
            throw th;
        }
    }

    @ey(method = 2686695251920702000L)
    public static void sG(Activity activity, String str, String str2, boolean z, boolean z2) {
        try {
            if (Q6) {
                iy.J8(-4655927776951850399L, null, activity, str, str2, new Boolean(z), new Boolean(z2));
            }
            Intent intent = new Intent(activity, (Class<?>) XmlLayoutDesignActivity.class);
            intent.putExtra("EXTRA_FILE", str2);
            intent.putExtra("EXTRA_LANGUAGE", str);
            intent.putExtra("EXTRA_LICENSED", z);
            intent.putExtra("EXTRA_STANDALONE", z2);
            intent.putExtra("EXTRA_TRAINER", false);
            j6(activity, intent);
        } catch (Throwable th) {
            if (kf) {
                iy.lg(th, -4655927776951850399L, null, activity, str, str2, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1148746375309046600L)
    public void sh(boolean z) {
        try {
            if (Q6) {
                iy.Ws(-1988525399015426011L, this, z);
            }
            SharedPreferences.Editor editorEdit = yS().edit();
            editorEdit.putBoolean("PREF_XMLDESIGNER_EDITMODE", z);
            editorEdit.commit();
            invalidateOptionsMenu();
            this.qp.hz(z);
            U2();
            this.mb.invalidate();
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -1988525399015426011L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1603590713233841349L)
    private void vy(boolean z) {
        try {
            if (Q6) {
                iy.Ws(4747711472338436256L, this, z);
            }
            Intent intent = getIntent();
            Bundle extras = intent.getExtras();
            this.hK = extras != null && extras.getBoolean("EXTRA_LICENSED", false);
            boolean z2 = extras == null || extras.getBoolean("EXTRA_STANDALONE", true);
            this.w9 = z2;
            if (!z2) {
                this.zh = extras.getString("EXTRA_FILE");
                this.AL = new File(this.zh).getParentFile().getParentFile().getPath();
                this.cT = false;
            } else if (extras != null && "android.intent.action.SEND".equals(intent.getAction()) && (extras.get("android.intent.extra.STREAM") instanceof Uri)) {
                Uri uri = (Uri) extras.get("android.intent.extra.STREAM");
                String strV5 = com.aide.uidesigner.d.v5();
                this.AL = strV5;
                this.cT = true;
                String strDW = com.aide.uidesigner.d.DW(strV5, com.aide.uidesigner.d.Zo(this, uri));
                this.zh = strDW;
                cb(strDW);
                try {
                    com.aide.uidesigner.d.EQ(getContentResolver().openInputStream(uri), new FileOutputStream(this.zh));
                } catch (IOException unused) {
                }
            } else if (extras != null && "android.intent.action.SEND".equals(intent.getAction()) && extras.getString("android.intent.extra.TEXT") != null) {
                String strV52 = com.aide.uidesigner.d.v5();
                this.AL = strV52;
                this.cT = true;
                String strFH = com.aide.uidesigner.d.FH(strV52, com.aide.uidesigner.d.tp(strV52), extras.getString("android.intent.extra.TEXT"));
                this.zh = strFH;
                cb(strFH);
            } else if (intent.getData() == null || intent.getData().getPath() == null) {
                this.AL = com.aide.uidesigner.d.v5();
                this.cT = true;
                String strEr = er();
                this.zh = strEr;
                if (strEr == null || !new File(this.zh).exists()) {
                    String strJ6 = com.aide.uidesigner.d.j6(this.AL);
                    this.zh = strJ6;
                    cb(strJ6);
                }
            } else {
                this.zh = intent.getData().getPath();
                this.AL = new File(this.zh).getParentFile().getParentFile().getPath();
                this.cT = false;
            }
            if (this.w9 && z) {
                ((DrawerLayout) findViewById(q.designerDrawer)).openDrawer(3);
            }
            a8();
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 4747711472338436256L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4960998049049120544L)
    private SharedPreferences yS() {
        try {
            if (Q6) {
                iy.gn(-4653799470037588875L, this);
            }
            return getSharedPreferences("UIDesigner", 0);
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, -4653799470037588875L, this);
            }
            throw th;
        }
    }

    @ey(method = 6466911814307301349L)
    void BT(int i2, int i3) {
        try {
            if (Q6) {
                iy.EQ(-4669300708406981136L, this, new Integer(i2), new Integer(i3));
            }
            if (!this.w9) {
                AIDEActivityStarter.DW(this, this.zh, i2, i3);
            } else if (Build.VERSION.SDK_INT < 24) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(Uri.fromFile(new File(this.zh)), "application/xml");
                    DW(this, intent);
                } catch (ActivityNotFoundException unused) {
                }
            }
        } catch (Throwable th) {
            if (kf) {
                iy.Mr(th, -4669300708406981136L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3100256022261034688L)
    protected void KD(String str) {
        try {
            if (Q6) {
                iy.tp(-278986221012046405L, this, str);
            }
            this.zh = str;
            if (this.cT) {
                cb(str);
            }
            a8();
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -278986221012046405L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1318392937339630644L)
    public void ef(String str) {
        try {
            if (Q6) {
                iy.tp(1116992656810310019L, this, str);
            }
            if (!this.w9) {
                AIDEHelpActivityStarter.DW(this, str, "");
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("http://developer.android.com/reference/" + str));
            DW(this, intent);
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 1116992656810310019L, this, str);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -3629933031033118461L)
    protected void onActivityResult(int i2, int i3, Intent intent) {
        try {
            if (Q6) {
                iy.we(-3973454068843531608L, this, new Integer(i2), new Integer(i3), intent);
            }
            iy.v5(this, i2, i3, intent);
            if (i3 == -1 && i2 == 3424345) {
                com.aide.uidesigner.i.EQ(this, intent);
            }
        } catch (Throwable th) {
            if (kf) {
                iy.U2(th, -3973454068843531608L, this, new Integer(i2), new Integer(i3), intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @ey(method = -583560794963718321L)
    public void onConfigurationChanged(Configuration configuration) {
        try {
            if (Q6) {
                iy.tp(-503973084807997920L, this, configuration);
            }
            super.onConfigurationChanged(configuration);
            if (this.fY != null) {
                this.fY.onConfigurationChanged(configuration);
            }
            U2();
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -503973084807997920L, this, configuration);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[Catch: all -> 0x025e, TryCatch #0 {all -> 0x025e, blocks: (B:3:0x000e, B:5:0x0023, B:6:0x0026, B:8:0x002f, B:9:0x0037, B:17:0x005f, B:19:0x007a, B:20:0x0083, B:22:0x0089, B:24:0x008f, B:25:0x0096, B:27:0x00ab, B:29:0x011d, B:31:0x0123, B:33:0x01cb, B:34:0x01f1, B:36:0x0205, B:39:0x024e, B:41:0x0253, B:42:0x0258, B:35:0x01fa, B:28:0x00bf, B:15:0x0054, B:16:0x005a), top: B:49:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x025e, TryCatch #0 {all -> 0x025e, blocks: (B:3:0x000e, B:5:0x0023, B:6:0x0026, B:8:0x002f, B:9:0x0037, B:17:0x005f, B:19:0x007a, B:20:0x0083, B:22:0x0089, B:24:0x008f, B:25:0x0096, B:27:0x00ab, B:29:0x011d, B:31:0x0123, B:33:0x01cb, B:34:0x01f1, B:36:0x0205, B:39:0x024e, B:41:0x0253, B:42:0x0258, B:35:0x01fa, B:28:0x00bf, B:15:0x0054, B:16:0x005a), top: B:49:0x000e }] */
    @Override // android.app.Activity
    @abcd.ey(method = -301854185837294919L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.uidesigner.XmlLayoutDesignActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    @ey(method = -1566542784329733100L)
    protected Dialog onCreateDialog(int i2, Bundle bundle) {
        try {
            if (Q6) {
                iy.EQ(1083749354085402675L, this, new Integer(i2), bundle);
            }
            return MessageBox.Zo(this, i2);
        } catch (Throwable th) {
            if (kf) {
                iy.Mr(th, 1083749354085402675L, this, new Integer(i2), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -3606881060845359559L)
    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (Q6) {
                iy.tp(1558005764010364404L, this, menu);
            }
            getMenuInflater().inflate(s.designer_options_menu, menu);
            return true;
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 1558005764010364404L, this, menu);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2636488433289278799L)
    protected void onDestroy() {
        try {
            if (Q6) {
                iy.gn(3941399178897184680L, this);
            }
            super.onDestroy();
            if (this.k2 == null || this.qp == null) {
                return;
            }
            this.k2.EQ(this.qp);
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 3941399178897184680L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    @ey(method = 1387413980016348128L)
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        try {
            if (Q6) {
                iy.EQ(579721820562543825L, this, new Integer(i2), menuItem);
            }
            if (this.fY != null && this.fY.onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (menuItem.getItemId() == 16908332) {
                finish();
            } else if (menuItem.getItemId() == q.designerMenuRun) {
                FireBaseLogEvent.tp("UI Designer Menu: Run");
                Intent intent = new Intent();
                intent.putExtra("EXTRA_TRAINER_ACTION", 2);
                setResult(-1, intent);
                finish();
            } else if (menuItem.getItemId() == q.designerMenuShowBorders) {
                FireBaseLogEvent.tp("UI Designer Menu: Edit mode");
                sh(true);
            } else if (menuItem.getItemId() == q.designerMenuHideBorders) {
                FireBaseLogEvent.tp("UI Designer Menu: Preview mode");
                sh(false);
            } else if (menuItem.getItemId() == q.designerMenuUndo) {
                FireBaseLogEvent.tp("UI Designer Menu: Undo");
                this.k2.J0();
            } else if (menuItem.getItemId() == q.designerMenuRedo) {
                FireBaseLogEvent.tp("UI Designer Menu: Redo");
                this.k2.tp();
            } else if (menuItem.getItemId() == q.designerMenuPaste) {
                FireBaseLogEvent.tp("UI Designer Menu: Paste");
                this.qp.jJ();
            } else if (menuItem.getItemId() == q.designerMenuCopy) {
                FireBaseLogEvent.tp("UI Designer Menu: Copy");
                this.qp.Ws();
            } else if (menuItem.getItemId() == q.designerMenuShare) {
                FireBaseLogEvent.tp("UI Designer Menu: Share");
                this.qp.Ev();
            }
            return false;
        } catch (Throwable th) {
            if (kf) {
                iy.Mr(th, 579721820562543825L, this, new Integer(i2), menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 499723612377335453L)
    public void onNewIntent(Intent intent) {
        try {
            if (Q6) {
                iy.tp(-2646735273978184600L, this, intent);
            }
            iy.XL(this, intent);
            super.onNewIntent(intent);
            setIntent(intent);
            if ((intent.getFlags() & 1048576) == 0) {
                vy(false);
            }
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -2646735273978184600L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1325171931558528711L)
    protected void onPostCreate(Bundle bundle) {
        try {
            if (Q6) {
                iy.tp(-3115384343603133000L, this, bundle);
            }
            super.onPostCreate(bundle);
            if (this.fY != null) {
                this.fY.syncState();
            }
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, -3115384343603133000L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -1465968206301525220L)
    public boolean onPrepareOptionsMenu(Menu menu) {
        try {
            if (Q6) {
                iy.tp(766139218176781215L, this, menu);
            }
            super.onPrepareOptionsMenu(menu);
            menu.findItem(q.designerMenuRun).setVisible(nw());
            menu.findItem(q.designerMenuRun).setTitle(getIntent().getStringExtra("EXTRA_TRAINER_RUN_BUTTON"));
            menu.findItem(q.designerMenuHideBorders).setVisible(!nw() && P8());
            menu.findItem(q.designerMenuShowBorders).setVisible((nw() || P8()) ? false : true);
            menu.findItem(q.designerMenuUndo).setEnabled(this.k2.v5());
            menu.findItem(q.designerMenuRedo).setEnabled(this.k2.Hw());
            menu.findItem(q.designerMenuPaste).setEnabled(this.qp.we());
            menu.findItem(q.designerMenuPaste).setVisible(!nw());
            menu.findItem(q.designerMenuCopy).setEnabled(!this.hK && this.qp.Mz().length() > 0);
            menu.findItem(q.designerMenuCopy).setVisible(!nw());
            menu.findItem(q.designerMenuShare).setEnabled(!this.hK && this.qp.Mz().length() > 0);
            menu.findItem(q.designerMenuShare).setVisible(nw() ? false : true);
            return true;
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 766139218176781215L, this, menu);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -248554044617252616L)
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (Q6) {
                iy.tp(1860774887918352761L, this, bundle);
            }
            super.onSaveInstanceState(bundle);
            if (this.k2 != null) {
                this.k2.we(bundle);
            }
        } catch (Throwable th) {
            if (kf) {
                iy.j3(th, 1860774887918352761L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -1879237792138112021L)
    protected void onStart() {
        try {
            if (Q6) {
                iy.gn(3376680340583093256L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "Android UI Designer");
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 3376680340583093256L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -1769010584960722785L)
    protected void onStop() {
        try {
            if (Q6) {
                iy.gn(1721432164350374988L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "Android UI Designer");
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 1721432164350374988L, this);
            }
            throw th;
        }
    }

    @ey(method = -479213952664765824L)
    protected void vJ() {
        try {
            if (Q6) {
                iy.gn(2261819999189357899L, this);
            }
            if (getIntent().getBooleanExtra("EXTRA_TRAINER_SPEAK", false)) {
                TextToSpeechHelper textToSpeechHelper = new TextToSpeechHelper(this);
                this.q7 = textToSpeechHelper;
                textToSpeechHelper.Hw(getIntent().getStringExtra("EXTRA_TRAINER_LOCALE"), getIntent().getStringExtra("EXTRA_TRAINER_TASK"));
            }
            if (getIntent().getBooleanExtra("EXTRA_TRAINER_SOUND", false)) {
                SoundPool soundPool = new SoundPool(1, 3, 0);
                this.Z1 = soundPool;
                int iLoad = soundPool.load(this, t.task, 1);
                this.n5 = iLoad;
                this.Z1.play(iLoad, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        } catch (Throwable th) {
            if (kf) {
                iy.aM(th, 2261819999189357899L, this);
            }
            throw th;
        }
    }

    @cy(clazz = -655267986816388145L, container = -655267986816388145L, user = true)
    private static class k {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -2927531815922255904L)
        public boolean DW;

        @dy(field = 181577619684888240L)
        public com.aide.uidesigner.f FH;

        @dy(field = 160377123568282023L)
        public File j6;

        static {
            iy.Zo(k.class);
        }

        @ey(method = 81815974186999143L)
        public k(File file) {
            try {
                if (Hw) {
                    iy.tp(-2575077022016584760L, null, file);
                }
                this.j6 = file;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -2575077022016584760L, null, file);
                }
                throw th;
            }
        }

        @ey(method = -238013890881052909L)
        public k(boolean z) {
            try {
                if (Hw) {
                    iy.Ws(-964021694512917180L, null, z);
                }
                this.DW = true;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -964021694512917180L, null, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 71703956017126511L)
        public k(com.aide.uidesigner.f fVar) {
            try {
                if (Hw) {
                    iy.tp(-2414617053795948336L, null, fVar);
                }
                this.FH = fVar;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -2414617053795948336L, null, fVar);
                }
                throw th;
            }
        }
    }
}
