package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.aide.appwizard.AppWizardDesignActivity;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.q;
import com.aide.ui.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@cy(clazz = -20062164340700416L, container = -20062164340700416L, user = true)
/* loaded from: classes.dex */
public class k {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = 304247859432616215L, container = -20062164340700416L, user = true)
    static class a extends MessageBox {

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = 5311166005370755992L)
        final /* synthetic */ boolean AL;

        @dy(field = 17838491953310709L)
        final /* synthetic */ List k2;

        @dy(field = -1531044271585148840L)
        final /* synthetic */ ValueRunnable w9;

        @dy(field = 941772926159882196L)
        final /* synthetic */ String zh;

        @cy(clazz = -1453526942889476916L, container = -20062164340700416L, user = true)
        /* renamed from: com.aide.uidesigner.k$a$a, reason: collision with other inner class name */
        class C0102a implements ExpandableListView.OnChildClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2966255861282411859L)
            final /* synthetic */ AlertDialog WB;

            static {
                iy.Zo(C0102a.class);
            }

            @ey(method = 7657508977922004780L)
            C0102a(AlertDialog alertDialog) {
                this.WB = alertDialog;
            }

            @Override // android.widget.ExpandableListView.OnChildClickListener
            @ey(method = 3268146217971866880L)
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                try {
                    if (jw) {
                        iy.J8(6212157870653134011L, this, expandableListView, view, new Integer(i), new Integer(i2), new Long(j));
                    }
                    this.WB.dismiss();
                    b bVar = (b) ((List) a.this.k2.get(i)).get(i2);
                    HashMap map = new HashMap();
                    map.putAll(bVar.DW());
                    if (a.this.AL) {
                        if (!map.containsKey("android:layout_width")) {
                            map.put("android:layout_width", "match_parent");
                        }
                        if (!map.containsKey("android:layout_height")) {
                            map.put("android:layout_height", "match_parent");
                        }
                    } else {
                        if (!map.containsKey("android:layout_width")) {
                            map.put("android:layout_width", "wrap_content");
                        }
                        if (!map.containsKey("android:layout_height")) {
                            map.put("android:layout_height", "wrap_content");
                        }
                    }
                    a.this.w9.j6(new com.aide.uidesigner.b(bVar.v5(), map));
                    return true;
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 6212157870653134011L, this, expandableListView, view, new Integer(i), new Integer(i2), new Long(j));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1953190709444115088L)
        a(List list, String str, boolean z, ValueRunnable valueRunnable) {
            this.k2 = list;
            this.zh = str;
            this.AL = z;
            this.w9 = valueRunnable;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -182576620641636615L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(176652414157537197L, this, activity);
                }
                ExpandableListView expandableListView = new ExpandableListView(activity);
                expandableListView.setAdapter(new c(activity, this.k2));
                AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setCancelable(true).setView(expandableListView).setTitle(this.zh).create();
                expandableListView.setOnChildClickListener(new C0102a(alertDialogCreate));
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, 176652414157537197L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1145000705800443631L, container = -1145000705800443631L, user = true)
    private static class c extends BaseExpandableListAdapter {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1482647769035510607L)
        private Context DW;

        @dy(field = -2786300175773665017L)
        private List<List<b>> j6;

        @cy(clazz = -631704753078233800L, container = -1145000705800443631L, user = true)
        class a implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -1731189946622096805L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -59719119906139320L)
            a(String str) {
                this.WB = str;
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 92459229239082285L)
            public void onClick(View view) {
                try {
                    if (jw) {
                        iy.tp(4590695719850507720L, this, view);
                    }
                    ((XmlLayoutDesignActivity) c.this.DW).ef(this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 4590695719850507720L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = 371742943356320768L)
        public c(Context context, List<List<b>> list) {
            try {
                if (FH) {
                    iy.EQ(517418601242951185L, null, context, list);
                }
                this.DW = context;
                this.j6 = list;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 517418601242951185L, null, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -828874065840863255L)
        public Object getChild(int i, int i2) {
            try {
                if (FH) {
                    iy.EQ(463616179580529675L, this, new Integer(i), new Integer(i2));
                }
                return this.j6.get(i).get(i2);
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 463616179580529675L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 300402790435221888L)
        public long getChildId(int i, int i2) {
            try {
                if (!FH) {
                    return 0L;
                }
                iy.EQ(-46035662062300056L, this, new Integer(i), new Integer(i2));
                return 0L;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -46035662062300056L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -4879308050971106547L)
        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            try {
                if (FH) {
                    iy.J8(1315687063506753175L, this, new Integer(i), new Integer(i2), new Boolean(z), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(this.DW).inflate(r.designer_widgetlist_entry, viewGroup, false) : view;
                b bVar = (b) getChild(i, i2);
                View viewJ6 = bVar.j6(this.DW);
                TextView textView = (TextView) viewInflate.findViewById(q.widgetlistName);
                textView.setText(bVar.u7());
                textView.setVisibility(viewJ6 == null ? 0 : 8);
                ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(q.widgetlistPreview);
                viewGroup2.setVisibility(viewJ6 != null ? 0 : 8);
                viewGroup2.removeAllViews();
                if (viewJ6 != null) {
                    viewGroup2.addView(viewJ6, new ViewGroup.LayoutParams(-2, -2));
                }
                String strZo = bVar.Zo();
                View viewFindViewById = viewInflate.findViewById(q.widgetlistHelp);
                viewFindViewById.setVisibility(strZo == null ? 8 : 0);
                if (strZo != null) {
                    viewFindViewById.setOnClickListener(new a(strZo));
                }
                return viewInflate;
            } catch (Throwable th) {
                if (Hw) {
                    iy.lg(th, 1315687063506753175L, this, new Integer(i), new Integer(i2), new Boolean(z), view, viewGroup);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 2096719143231918144L)
        public int getChildrenCount(int i) {
            try {
                if (FH) {
                    iy.u7(-2451026119468779132L, this, i);
                }
                return this.j6.get(i).size();
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -2451026119468779132L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -215987914001864945L)
        public Object getGroup(int i) {
            try {
                if (FH) {
                    iy.u7(-982462289535532659L, this, i);
                }
                return this.j6.get(i);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -982462289535532659L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 1634656656424794345L)
        public int getGroupCount() {
            try {
                if (FH) {
                    iy.gn(-507866347691922765L, this);
                }
                return this.j6.size();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -507866347691922765L, this);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -1064965416472553792L)
        public long getGroupId(int i) {
            try {
                if (FH) {
                    iy.u7(374168018571473592L, this, i);
                }
                return i;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 374168018571473592L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -2346453747874249375L)
        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            try {
                if (FH) {
                    iy.J0(-1024242827611527013L, this, new Integer(i), new Boolean(z), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(this.DW).inflate(r.designer_widgetlist_group, viewGroup, false) : view;
                ((TextView) viewInflate.findViewById(q.widgetlistGroupName)).setText(((b) getChild(i, 0)).FH());
                return viewInflate;
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, -1024242827611527013L, this, new Integer(i), new Boolean(z), view, viewGroup);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -2602273120654889672L)
        public boolean hasStableIds() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(2954444397049671564L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2954444397049671564L, this);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -8945617988302048541L)
        public boolean isChildSelectable(int i, int i2) {
            try {
                if (!FH) {
                    return true;
                }
                iy.EQ(-8701450132750835415L, this, new Integer(i), new Integer(i2));
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -8701450132750835415L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1052119081443133424L, container = -1052119081443133424L, user = true)
    private interface d {
        @ey(method = -200495633412821845L)
        View j6(Context context);
    }

    static {
        iy.Zo(k.class);
    }

    @ey(method = -977433338678795580L)
    public k() {
        try {
            if (j6) {
                iy.gn(3187887419872258220L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 3187887419872258220L, null);
            }
            throw th;
        }
    }

    @ey(method = -3224715685112434632L)
    private static List<List<b>> DW(boolean z, boolean z2, boolean z3) {
        try {
            if (j6) {
                iy.we(1262080912810492061L, null, new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            ArrayList arrayList = new ArrayList();
            String strFH = "";
            for (b bVar : b.values()) {
                if ((!z || bVar.we()) && ((!z2 || bVar.J0()) && (!z3 || !bVar.tp()))) {
                    if (!strFH.equals(bVar.FH())) {
                        arrayList.add(new ArrayList());
                        strFH = bVar.FH();
                    }
                    ((List) arrayList.get(arrayList.size() - 1)).add(bVar);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 1262080912810492061L, null, new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            throw th;
        }
    }

    @ey(method = 217559466869269695L)
    public static void FH(Activity activity, String str, ValueRunnable<com.aide.uidesigner.b> valueRunnable) {
        try {
            if (j6) {
                iy.we(-1242669103644293584L, null, activity, str, valueRunnable);
            }
            Zo(activity, str, false, true, valueRunnable);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -1242669103644293584L, null, activity, str, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 1461233569487715205L)
    public static void Hw(Activity activity, String str, ValueRunnable<com.aide.uidesigner.b> valueRunnable) {
        try {
            if (j6) {
                iy.we(-303003421379200640L, null, activity, str, valueRunnable);
            }
            Zo(activity, str, true, false, valueRunnable);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -303003421379200640L, null, activity, str, valueRunnable);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 236443023806947320L)
    public static void VH(TextView textView, int i) {
        try {
            if (j6) {
                iy.EQ(-1614585399385888965L, null, textView, new Integer(i));
            }
            Resources.Theme theme = textView.getContext().getTheme();
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                textView.setTextAppearance(textView.getContext(), typedValue.data);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1614585399385888965L, null, textView, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6241087607261881563L)
    private static void Zo(Activity activity, String str, boolean z, boolean z2, ValueRunnable<com.aide.uidesigner.b> valueRunnable) {
        try {
            if (j6) {
                iy.J8(2320088747182935480L, null, activity, str, new Boolean(z), new Boolean(z2), valueRunnable);
            }
            MessageBox.gW(activity, new a(DW(z, z2, activity instanceof AppWizardDesignActivity), str, z2, valueRunnable));
        } catch (Throwable th) {
            if (DW) {
                iy.lg(th, 2320088747182935480L, null, activity, str, new Boolean(z), new Boolean(z2), valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -240409642474229355L)
    public static void v5(Activity activity, String str, ValueRunnable<com.aide.uidesigner.b> valueRunnable) {
        try {
            if (j6) {
                iy.we(581854770782484428L, null, activity, str, valueRunnable);
            }
            Zo(activity, str, false, false, valueRunnable);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 581854770782484428L, null, activity, str, valueRunnable);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -6184905212679667120L, container = -6184905212679667120L, user = true)
    private static final class b {

        @dy(field = 5021256307216998429L)
        public static final b AbsoluteLayout;

        @dy(field = -3565390034132107685L)
        public static final b BarButton;

        @dy(field = -1635722254708361700L)
        public static final b BarImageButton;

        @dy(field = 1848107328549875996L)
        public static final b Button;

        @dy(field = 2077041225913991879L)
        public static final b ButtonBar;

        @dy(field = 2181115617285277935L)
        public static final b ButtonSmall;

        @dy(field = -1215962884246377015L)
        public static final b CheckBox;

        @dy(field = 2973224576160684560L)
        public static final b DatePicker;

        @dy(field = -3440560782078464301L)
        public static final b DividerHorizontal;

        @dy(field = -631203216416222643L)
        public static final b DividerVertical;

        @dy(field = -502557978666170835L)
        public static final b DrawerLayout;

        @dy(field = 2370145358017489225L)
        public static final b EditText;

        @dy(field = -1628823824454914285L)
        public static final b EditTextAddress;

        @dy(field = 3433561586935856405L)
        public static final b EditTextDate;

        @dy(field = 3499191735400517360L)
        public static final b EditTextDecimal;

        @dy(field = 5245418145932044749L)
        public static final b EditTextEMail;

        @dy(field = 3260146834323272320L)
        public static final b EditTextMultiLine;

        @dy(field = 1767402876478265208L)
        public static final b EditTextNumber;

        @dy(field = 52247927954784145L)
        public static final b EditTextNumberPassword;

        @dy(field = -523083677648105728L)
        public static final b EditTextNumberSigned;

        @dy(field = 6499927485919635040L)
        public static final b EditTextPassword;

        @dy(field = -8058955801041868025L)
        public static final b EditTextPasswordName;

        @dy(field = 972150296611709172L)
        public static final b EditTextPasswordPhone;

        @dy(field = 3476159560140614336L)
        public static final b EditTextTime;

        @dy(field = 5962650237063630825L)
        public static final b ExpandableListView;

        @dy(field = 4090362758343942093L)
        public static final b FrameLayout;

        @gy
        private static /* synthetic */ boolean GK;

        @dy(field = -3074877664747185960L)
        public static final b GridLayout;

        @dy(field = -1928732812495439692L)
        public static final b HorizontalScrollView;

        @dy(field = 1931103422627254161L)
        public static final b ImageButton;

        @dy(field = -1399651168002896736L)
        public static final b ImageView;

        @dy(field = 2761457975087995183L)
        public static final b LinearLayoutH;

        @dy(field = 2762456754199001223L)
        public static final b LinearLayoutV;

        @dy(field = 3532469080732268089L)
        public static final b ListView;

        @dy(field = 1770338297665401237L)
        public static final b NumberPicker;

        @fy
        private static /* synthetic */ boolean PH;

        @dy(field = 1678469083116611424L)
        public static final b ProgressBar;

        @dy(field = -7072043927191095720L)
        public static final b ProgressBarHorizontal;

        @dy(field = 5818995366763280825L)
        public static final b ProgressBarLarge;

        @dy(field = -4055721944530885251L)
        public static final b RadioButton;

        @dy(field = 167296363756481120L)
        public static final b RadioGroup;

        @dy(field = -2851063224674903008L)
        public static final b RatingBar;

        @dy(field = 5395234979772432936L)
        public static final b RelativeLayout;

        @dy(field = -2916008345440468872L)
        public static final b ScrollView;

        @dy(field = 1352085809300603965L)
        public static final b SeekBar;

        @dy(field = 3508520744141809573L)
        public static final b Spinner;

        @dy(field = -1289210775844375680L)
        public static final b Switch;

        @dy(field = 3218749251608010512L)
        public static final b TableLayout;

        @dy(field = 2172115194955188432L)
        public static final b TableRow;

        @dy(field = -3817370675935038684L)
        public static final b TextView;

        @dy(field = 3152788067010248337L)
        public static final b TextViewLarge;

        @dy(field = 1787849978466602711L)
        public static final b TextViewMedium;

        @dy(field = 3695531521829696659L)
        public static final b TextViewSmall;

        @dy(field = 1976525417357441255L)
        public static final b TimePicker;

        @dy(field = -1695406310239654944L)
        public static final b ToggleButton;

        @dy(field = -2394793537888527552L)
        public static final b ViewPager;

        @dy(field = -1550460453006932496L)
        private static final /* synthetic */ b[] hp;

        @dy(field = -2738948046467056800L)
        private String WB;

        @dy(field = -2407001482585174571L)
        private Map<String, String> fY;

        @dy(field = -2558945345280954453L)
        private String jw;

        @dy(field = -1607516148935049045L)
        private String mb;

        @dy(field = -2531634038812566600L)
        private d qp;

        @cy(clazz = 70615866454258857L, container = -6184905212679667120L, user = true)
        static class a implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 2793700097948617200L)
            a() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = 631023396789780095L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(5454806673422441115L, this, context);
                    }
                    SeekBar seekBar = new SeekBar(context);
                    seekBar.setFocusable(false);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.addView(seekBar, new LinearLayout.LayoutParams((int) (context.getResources().getDisplayMetrics().density * 150.0f), -2));
                    return linearLayout;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 5454806673422441115L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70633449435394984L, container = -6184905212679667120L, user = true)
        /* renamed from: com.aide.uidesigner.k$b$b, reason: collision with other inner class name */
        static class C0103b implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(C0103b.class);
            }

            @ey(method = -567913480240320329L)
            C0103b() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -344915827584176000L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-2362342942256822560L, this, context);
                    }
                    TextView textView = new TextView(context);
                    textView.setText("Text");
                    return textView;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -2362342942256822560L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70651032420594405L, container = -6184905212679667120L, user = true)
        static class c implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 2750083080131580876L)
            c() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = 180422215932311685L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(5988668004585262375L, this, context);
                    }
                    TextView textView = new TextView(context);
                    textView.setText("Small Text");
                    k.VH(textView, R.attr.textAppearanceSmall);
                    return textView;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 5988668004585262375L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70668615409857120L, container = -6184905212679667120L, user = true)
        static class d implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(d.class);
            }

            @ey(method = -2621659991583990683L)
            d() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -371242215647889984L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-1834794886851089040L, this, context);
                    }
                    TextView textView = new TextView(context);
                    textView.setText("Medium Text");
                    k.VH(textView, R.attr.textAppearanceMedium);
                    return textView;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -1834794886851089040L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70686198403183129L, container = -6184905212679667120L, user = true)
        static class e implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(e.class);
            }

            @ey(method = -1405984643921882560L)
            e() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -416761613520501665L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(6523413591705954235L, this, context);
                    }
                    TextView textView = new TextView(context);
                    textView.setText("Large Text");
                    k.VH(textView, R.attr.textAppearanceLarge);
                    return textView;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 6523413591705954235L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70703781400572432L, container = -6184905212679667120L, user = true)
        static class f implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            @cy(clazz = 9219361175936381L, container = -6184905212679667120L, user = true)
            class a extends View {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                @dy(field = 436396335099889640L)
                final /* synthetic */ Context WB;

                static {
                    iy.Zo(a.class);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @ey(method = -1692820482959423596L)
                a(f fVar, Context context, Context context2) {
                    super(context);
                    this.WB = context2;
                }

                @Override // android.view.View
                @ey(method = -1463987250492089120L)
                protected void onMeasure(int i, int i2) {
                    try {
                        if (mb) {
                            iy.EQ(562512038758631169L, this, new Integer(i), new Integer(i2));
                        }
                        setMeasuredDimension((int) (this.WB.getResources().getDisplayMetrics().density * 30.0f), (int) (this.WB.getResources().getDisplayMetrics().density * 1.0f));
                    } catch (Throwable th) {
                        if (jw) {
                            iy.Mr(th, 562512038758631169L, this, new Integer(i), new Integer(i2));
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(f.class);
            }

            @ey(method = -881232515413625648L)
            f() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -644629021659866913L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-1306362575487484920L, this, context);
                    }
                    a aVar = new a(this, context, context);
                    aVar.setBackgroundDrawable(context.obtainStyledAttributes(new int[]{R.attr.dividerVertical}).getDrawable(0));
                    return aVar;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -1306362575487484920L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70721364402025029L, container = -6184905212679667120L, user = true)
        static class g implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            @cy(clazz = 9248857349345616L, container = -6184905212679667120L, user = true)
            class a extends View {

                @gy
                private static /* synthetic */ boolean jw;

                @fy
                private static /* synthetic */ boolean mb;

                @dy(field = -3027889539922957068L)
                final /* synthetic */ Context WB;

                static {
                    iy.Zo(a.class);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @ey(method = -1339682229338961771L)
                a(g gVar, Context context, Context context2) {
                    super(context);
                    this.WB = context2;
                }

                @Override // android.view.View
                @ey(method = -615240280409297928L)
                protected void onMeasure(int i, int i2) {
                    try {
                        if (mb) {
                            iy.EQ(-161412211736949840L, this, new Integer(i), new Integer(i2));
                        }
                        setMeasuredDimension((int) (this.WB.getResources().getDisplayMetrics().density * 1.0f), (int) (this.WB.getResources().getDisplayMetrics().density * 30.0f));
                    } catch (Throwable th) {
                        if (jw) {
                            iy.Mr(th, -161412211736949840L, this, new Integer(i), new Integer(i2));
                        }
                        throw th;
                    }
                }
            }

            static {
                iy.Zo(g.class);
            }

            @ey(method = -1436048862571585009L)
            g() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -610135570215103140L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(7059043434784516695L, this, context);
                    }
                    a aVar = new a(this, context, context);
                    aVar.setBackgroundDrawable(context.obtainStyledAttributes(new int[]{R.attr.dividerHorizontal}).getDrawable(0));
                    return aVar;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 7059043434784516695L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70738947407540920L, container = -6184905212679667120L, user = true)
        static class h implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(h.class);
            }

            @ey(method = 377613695416376700L)
            h() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = 341551857100036317L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-777046008166010200L, this, context);
                    }
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.ic_delete);
                    return imageView;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -777046008166010200L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70756530417120105L, container = -6184905212679667120L, user = true)
        static class i implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(i.class);
            }

            @ey(method = -2621195191831146548L)
            i() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = 120052782198073701L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(7595557533820949755L, this, context);
                    }
                    return new ProgressBar(context);
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 7595557533820949755L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70774113430762584L, container = -6184905212679667120L, user = true)
        static class j implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(j.class);
            }

            @ey(method = 2012957395475641641L)
            j() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = 205648716732092216L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-246845184886664880L, this, context);
                    }
                    return new ProgressBar(context, null, R.attr.progressBarStyleLarge);
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -246845184886664880L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7657847157696898897L, container = -6184905212679667120L, user = true)
        /* renamed from: com.aide.uidesigner.k$b$k, reason: collision with other inner class name */
        static class C0104k implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(C0104k.class);
            }

            @ey(method = 302277122415164064L)
            C0104k() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -414075622224995549L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-7314049808467641067L, this, context);
                    }
                    Button button = new Button(context);
                    button.setText("Button");
                    button.setFocusable(false);
                    return button;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -7314049808467641067L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 70651269002692932L, container = -6184905212679667120L, user = true)
        static class l implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(l.class);
            }

            @ey(method = 600679347081511980L)
            l() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -243719923107383723L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(5573954536003023424L, this, context);
                    }
                    ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
                    progressBar.setMax(100);
                    progressBar.setProgress(50);
                    return progressBar;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 5573954536003023424L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7657965895493439864L, container = -6184905212679667120L, user = true)
        static class m implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(m.class);
            }

            @ey(method = -97847652306009600L)
            m() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -224819188201948339L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(481209000875670912L, this, context);
                    }
                    Button button = new Button(context, null, R.attr.buttonStyleSmall);
                    button.setText("Small Button");
                    button.setFocusable(false);
                    return button;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 481209000875670912L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7658084633294044125L, container = -6184905212679667120L, user = true)
        static class n implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(n.class);
            }

            @ey(method = 1939258610193175947L)
            n() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -121249279961585664L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-6826149106291877907L, this, context);
                    }
                    ImageButton imageButton = new ImageButton(context);
                    imageButton.setImageResource(R.drawable.ic_menu_close_clear_cancel);
                    imageButton.setFocusable(false);
                    return imageButton;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -6826149106291877907L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7658203371098711680L, container = -6184905212679667120L, user = true)
        static class o implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(o.class);
            }

            @ey(method = -2515417131451536584L)
            o() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -259628295805041429L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(976307234766392412L, this, context);
                    }
                    Button button = new Button(context, null, R.attr.buttonBarButtonStyle);
                    button.setText("Bar Button");
                    button.setFocusable(false);
                    return button;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 976307234766392412L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7658322108907442529L, container = -6184905212679667120L, user = true)
        static class p implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(p.class);
            }

            @ey(method = 56385227347411039L)
            p() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -29589966992341728L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-6337364148158244147L, this, context);
                    }
                    ImageButton imageButton = new ImageButton(context, null, R.attr.buttonBarButtonStyle);
                    imageButton.setImageResource(R.drawable.ic_menu_close_clear_cancel);
                    imageButton.setFocusable(false);
                    return imageButton;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -6337364148158244147L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7658440846720236672L, container = -6184905212679667120L, user = true)
        static class q implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(q.class);
            }

            @ey(method = 1029279667188245924L)
            q() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -15418813240008783L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(1472289724614984512L, this, context);
                    }
                    ToggleButton toggleButton = new ToggleButton(context);
                    toggleButton.setFocusable(false);
                    return toggleButton;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 1472289724614984512L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7658559584537094109L, container = -6184905212679667120L, user = true)
        static class r implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(r.class);
            }

            @ey(method = 972547820568764232L)
            r() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = 267940597273718467L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-5847694934066739787L, this, context);
                    }
                    Switch r2 = new Switch(context);
                    r2.setFocusable(false);
                    return r2;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -5847694934066739787L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7658678322358014840L, container = -6184905212679667120L, user = true)
        static class s implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(s.class);
            }

            @ey(method = -1206646888499863188L)
            s() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = 267482857313061645L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(1969156470421447212L, this, context);
                    }
                    CheckBox checkBox = new CheckBox(context);
                    checkBox.setFocusable(false);
                    checkBox.setText("CheckBox");
                    return checkBox;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 1969156470421447212L, this, context);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 7658797060182998865L, container = -6184905212679667120L, user = true)
        static class t implements d {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(t.class);
            }

            @ey(method = 2436870557216852115L)
            t() {
            }

            @Override // com.aide.uidesigner.k.d
            @ey(method = -146293851840301996L)
            public View j6(Context context) {
                try {
                    if (j6) {
                        iy.tp(-5357141464017364827L, this, context);
                    }
                    RadioButton radioButton = new RadioButton(context);
                    radioButton.setFocusable(false);
                    radioButton.setText("RadioButton");
                    return radioButton;
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -5357141464017364827L, this, context);
                    }
                    throw th;
                }
            }
        }

        static {
            String str;
            try {
                iy.Zo(b.class);
                if (PH) {
                    str = "Advanced Layout";
                    iy.gn(1052458652427714105L, null);
                } else {
                    str = "Advanced Layout";
                }
                Button = new b("Button", 0, "Button", "Widget", new C0104k(), "Button", "android:text", "Button");
                ButtonSmall = new b("ButtonSmall", 1, "Button (small)", "Widget", new m(), "Button", "style", "?android:attr/buttonStyleSmall", "android:text", "Small Button");
                ImageButton = new b("ImageButton", 2, "ImageButton", "Widget", new n(), "ImageButton", "android:src", "@android:drawable/ic_menu_close_clear_cancel");
                BarButton = new b("BarButton", 3, "Bar Button", "Widget", new o(), "Button", "style", "?android:attr/buttonBarButtonStyle", "android:text", "Bar Button");
                BarImageButton = new b("BarImageButton", 4, "BarImageButton", "Widget", new p(), "ImageButton", "style", "?android:attr/buttonBarButtonStyle", "android:src", "@android:drawable/ic_menu_close_clear_cancel");
                ToggleButton = new b("ToggleButton", 5, "ToggleButton", "Widget", new q());
                Switch = new b("Switch", 6, "Switch", "Widget", new r());
                CheckBox = new b("CheckBox", 7, "CheckBox", "Widget", new s());
                RadioButton = new b("RadioButton", 8, "RadioButton", "Widget", new t());
                SeekBar = new b("SeekBar", 9, "SeekBar", "Widget", new a());
                TextView = new b("TextView", 10, "TextView", "View", new C0103b(), "TextView", "android:text", "Text");
                TextViewSmall = new b("TextViewSmall", 11, "TextView (small)", "View", new c(), "TextView", "android:textAppearance", "?android:attr/textAppearanceSmall", "android:text", "Small Text");
                TextViewMedium = new b("TextViewMedium", 12, "TextView (medium)", "View", new d(), "TextView", "android:textAppearance", "?android:attr/textAppearanceMedium", "android:text", "Medium Text");
                TextViewLarge = new b("TextViewLarge", 13, "TextView (large)", "View", new e(), "TextView", "android:textAppearance", "?android:attr/textAppearanceLarge", "android:text", "Large Text");
                DividerVertical = new b("DividerVertical", 14, "Vertical Divider", "View", new f(), "View", "android:background", "?android:attr/dividerVertical", "android:layout_height", "1dp", "android:layout_width", "match_parent");
                DividerHorizontal = new b("DividerHorizontal", 15, "Horizontal Divider", "View", new g(), "View", "android:background", "?android:attr/dividerHorizontal", "android:layout_width", "1dp", "android:layout_height", "match_parent");
                ImageView = new b("ImageView", 16, "ImageView", "View", new h(), "ImageView", "android:src", "@android:drawable/ic_delete");
                ProgressBar = new b("ProgressBar", 17, "ProgressBar", "View", new i());
                ProgressBarLarge = new b("ProgressBarLarge", 18, "ProgressBar (large)", "View", new j(), "ProgressBar", "style", "?android:attr/progressBarStyleLarge");
                ProgressBarHorizontal = new b("ProgressBarHorizontal", 19, "ProgressBar (horizontal)", "View", new l(), "ProgressBar", "style", "?android:attr/progressBarStyleHorizontal");
                EditText = new b("EditText", 20, "EditText", "Text Field", "EditText", "android:ems", "10");
                EditTextMultiLine = new b("EditTextMultiLine", 21, "EditText (multiline)", "Text Field", "EditText", "android:inputType", "textMultiLine", "android:ems", "10");
                EditTextPassword = new b("EditTextPassword", 22, "EditText (password)", "Text Field", "EditText", "android:inputType", "textPassword", "android:ems", "10");
                EditTextNumberPassword = new b("EditTextNumberPassword", 23, "EditText (number password)", "Text Field", "EditText", "android:inputType", "numberPassword", "android:ems", "10");
                EditTextEMail = new b("EditTextEMail", 24, "EditText (email)", "Text Field", "EditText", "android:inputType", "textEmailAddress", "android:ems", "10");
                EditTextPasswordName = new b("EditTextPasswordName", 25, "EditText (name)", "Text Field", "EditText", "android:inputType", "textPersonName", "android:ems", "10");
                EditTextPasswordPhone = new b("EditTextPasswordPhone", 26, "EditText (phone)", "Text Field", "EditText", "android:inputType", "phone", "android:ems", "10");
                EditTextAddress = new b("EditTextAddress", 27, "EditText (address)", "Text Field", "EditText", "android:inputType", "textPostalAddress", "android:ems", "10");
                EditTextTime = new b("EditTextTime", 28, "EditText (time)", "Text Field", "EditText", "android:inputType", "time", "android:ems", "10");
                EditTextDate = new b("EditTextDate", 29, "EditText (date)", "Text Field", "EditText", "android:inputType", "date", "android:ems", "10");
                EditTextNumber = new b("EditTextNumber", 30, "EditText (number)", "Text Field", "EditText", "android:inputType", "number", "android:ems", "10");
                EditTextNumberSigned = new b("EditTextNumberSigned", 31, "EditText (signed number)", "Text Field", "EditText", "android:inputType", "numberSigned", "android:ems", "10");
                EditTextDecimal = new b("EditTextDecimal", 32, "EditText (decimal)", "Text Field", "EditText", "android:inputType", "numberDecimal", "android:ems", "10");
                DatePicker = new b("DatePicker", 33, "DatePicker", "Advanced Widget");
                TimePicker = new b("TimePicker", 34, "TimePicker", "Advanced Widget");
                NumberPicker = new b("NumberPicker", 35, "NumberPicker", "Advanced Widget");
                RatingBar = new b("RatingBar", 36, "RatingBar", "Advanced Widget");
                ListView = new b("ListView", 37, "List View", "Adapter View", "ListView", new String[0]);
                ExpandableListView = new b("ExpandableListView", 38, "Expandable List View", "Adapter View", "ExpandableListView", new String[0]);
                Spinner = new b("Spinner", 39, "Spinner", "Adapter View");
                RelativeLayout = new b("RelativeLayout", 40, "RelativeLayout", "Layout");
                LinearLayoutH = new b("LinearLayoutH", 41, "LinearLayout (horizontal)", "Layout", "LinearLayout", "android:orientation", "horizontal");
                LinearLayoutV = new b("LinearLayoutV", 42, "LinearLayout (vertical)", "Layout", "LinearLayout", "android:orientation", "vertical");
                ScrollView = new b("ScrollView", 43, "ScrollView", "Scroll View");
                HorizontalScrollView = new b("HorizontalScrollView", 44, "HorizontalScrollView", "Scroll View");
                ButtonBar = new b("ButtonBar", 45, "Button Bar", "Advanced Layout", "LinearLayout", "style", "?android:attr/buttonBarStyle", "android:orientation", "horizontal");
                GridLayout = new b("GridLayout", 46, "GridLayout", "Advanced Layout", "GridLayout", "rowCount", "1", "columnCount", "1");
                String str2 = str;
                FrameLayout = new b("FrameLayout", 47, "FrameLayout", str2);
                RadioGroup = new b("RadioGroup", 48, "RadioGroup", "Advanced Layout", "RadioGroup", "android:orientation", "vertical");
                TableLayout = new b("TableLayout", 49, "TableLayout", str2);
                TableRow = new b("TableRow", 50, "TableRow", str2);
                AbsoluteLayout = new b("AbsoluteLayout", 51, "AbsoluteLayout", str2);
                DrawerLayout = new b("DrawerLayout", 52, "Drawer Layout", "App Layout", "androidx.drawerlayout.widget.DrawerLayout", new String[0]);
                b bVar = new b("ViewPager", 53, "View Pager", "App Layout", "android.support.v4.widget.ViewPager", new String[0]);
                ViewPager = bVar;
                hp = new b[]{Button, ButtonSmall, ImageButton, BarButton, BarImageButton, ToggleButton, Switch, CheckBox, RadioButton, SeekBar, TextView, TextViewSmall, TextViewMedium, TextViewLarge, DividerVertical, DividerHorizontal, ImageView, ProgressBar, ProgressBarLarge, ProgressBarHorizontal, EditText, EditTextMultiLine, EditTextPassword, EditTextNumberPassword, EditTextEMail, EditTextPasswordName, EditTextPasswordPhone, EditTextAddress, EditTextTime, EditTextDate, EditTextNumber, EditTextNumberSigned, EditTextDecimal, DatePicker, TimePicker, NumberPicker, RatingBar, ListView, ExpandableListView, Spinner, RelativeLayout, LinearLayoutH, LinearLayoutV, ScrollView, HorizontalScrollView, ButtonBar, GridLayout, FrameLayout, RadioGroup, TableLayout, TableRow, AbsoluteLayout, DrawerLayout, bVar};
            } finally {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 1916288022045311904L)
        private b(String str, int i2, String str2, String str3) {
            this(str, i2, str2, str3, str2, new String[0]);
            try {
                if (PH) {
                    iy.J0(1428047695874500508L, null, str, new Integer(i2), str2, str3);
                }
            } catch (Throwable th) {
                if (GK) {
                    iy.a8(th, 1428047695874500508L, null, str, new Integer(i2), str2, str3);
                }
                throw th;
            }
        }

        @ey(method = -867912585596864925L)
        public static b valueOf(String str) {
            try {
                if (PH) {
                    iy.tp(598594473620713273L, null, str);
                }
                return (b) Enum.valueOf(b.class, str);
            } catch (Throwable th) {
                if (GK) {
                    iy.j3(th, 598594473620713273L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 3061243171088546081L)
        public static b[] values() {
            try {
                if (PH) {
                    iy.gn(-2114157705485052513L, null);
                }
                return (b[]) hp.clone();
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, -2114157705485052513L, null);
                }
                throw th;
            }
        }

        @ey(method = 5230812122994173760L)
        public Map<String, String> DW() {
            try {
                if (PH) {
                    iy.gn(-928890903842309280L, this);
                }
                return this.fY;
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, -928890903842309280L, this);
                }
                throw th;
            }
        }

        @ey(method = 539782073674973397L)
        public String FH() {
            try {
                if (PH) {
                    iy.gn(-2407094442314658965L, this);
                }
                return this.WB;
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, -2407094442314658965L, this);
                }
                throw th;
            }
        }

        @ey(method = 4036197531846090440L)
        public boolean J0() {
            try {
                if (PH) {
                    iy.gn(1259771538640980000L, this);
                }
                if (!we()) {
                    if (!"Adapter View".equals(this.WB)) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, 1259771538640980000L, this);
                }
                throw th;
            }
        }

        @ey(method = -2893503766140386081L)
        public String Zo() {
            try {
                if (PH) {
                    iy.gn(3204632253471877725L, this);
                }
                return "android/widget/" + this.mb + ".html";
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, 3204632253471877725L, this);
                }
                throw th;
            }
        }

        @ey(method = 4546558261980830160L)
        public View j6(Context context) {
            try {
                if (PH) {
                    iy.tp(1747187872983515840L, this, context);
                }
                if (this.qp == null) {
                    return null;
                }
                try {
                    View viewJ6 = this.qp.j6(context);
                    if (viewJ6 != null) {
                        viewJ6.setClickable(false);
                    }
                    return viewJ6;
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (GK) {
                    iy.j3(th, 1747187872983515840L, this, context);
                }
                throw th;
            }
        }

        @ey(method = 4359695093420548664L)
        public boolean tp() {
            try {
                if (PH) {
                    iy.gn(1228606396870112736L, this);
                }
                return "App Layout".equals(this.WB);
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, 1228606396870112736L, this);
                }
                throw th;
            }
        }

        @ey(method = -101788913209283940L)
        public String u7() {
            try {
                if (PH) {
                    iy.gn(2572976743245809208L, this);
                }
                return this.jw;
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, 2572976743245809208L, this);
                }
                throw th;
            }
        }

        @ey(method = -3326838421229955800L)
        public String v5() {
            try {
                if (PH) {
                    iy.gn(4276496818027298656L, this);
                }
                return this.mb;
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, 4276496818027298656L, this);
                }
                throw th;
            }
        }

        @ey(method = 2065519702238733701L)
        public boolean we() {
            try {
                if (PH) {
                    iy.gn(3544590336697442511L, this);
                }
                if (!"Layout".equals(this.WB) && !"Advanced Layout".equals(this.WB) && !"Scroll View".equals(this.WB)) {
                    if (!"App Layout".equals(this.WB)) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                if (GK) {
                    iy.aM(th, 3544590336697442511L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 1834287615013392L)
        private b(String str, int i2, String str2, String str3, d dVar) {
            this(str, i2, str2, str3, dVar, str2, new String[0]);
            try {
                if (PH) {
                    iy.J8(-4951633095198963232L, null, str, new Integer(i2), str2, str3, dVar);
                }
            } catch (Throwable th) {
                if (GK) {
                    iy.lg(th, -4951633095198963232L, null, str, new Integer(i2), str2, str3, dVar);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 6809857254454648224L)
        private b(String str, int i2, String str2, String str3, String str4, String... strArr) throws Throwable {
            int i3;
            this(str, i2, str2, str3, null, str4, strArr);
            try {
                if (PH) {
                    iy.QX(5255168515719878400L, null, new Object[]{str, new Integer(i2), str2, str3, str4, strArr});
                }
                i3 = 6;
            } catch (Throwable th) {
                th = th;
                i3 = 6;
            }
            try {
            } catch (Throwable th2) {
                th = th2;
                if (GK) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = str;
                    objArr[1] = new Integer(i2);
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = str4;
                    objArr[5] = strArr;
                    iy.rN(th, 5255168515719878400L, null, objArr);
                }
                throw th;
            }
        }

        @ey(method = 1099367632333509560L)
        private b(String str, int i2, String str2, String str3, d dVar, String str4, String... strArr) {
            try {
                if (PH) {
                    iy.QX(-1851695434020806100L, null, new Object[]{str, new Integer(i2), str2, str3, dVar, str4, strArr});
                }
                this.jw = str2;
                this.mb = str4;
                this.WB = str3;
                this.qp = dVar;
                this.fY = new HashMap();
                for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                    this.fY.put(strArr[i3], strArr[i3 + 1]);
                }
            } catch (Throwable th) {
                if (GK) {
                    iy.rN(th, -1851695434020806100L, null, new Object[]{str, new Integer(i2), str2, str3, dVar, str4, strArr});
                }
                throw th;
            }
        }
    }
}
