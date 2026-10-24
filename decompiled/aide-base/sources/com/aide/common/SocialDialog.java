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
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aide.ui.R$drawable;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.u;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 1991841546302420120L, container = 1991841546302420120L, user = true)
/* loaded from: classes.dex */
public class SocialDialog extends MessageBox {

    @gy
    private static /* synthetic */ boolean Z1;

    @fy
    private static /* synthetic */ boolean q7;

    @dy(field = 1376079892474421016L)
    private Runnable AL;

    @dy(field = 4467224011380171255L)
    private boolean cT;

    @dy(field = 852363936661789968L)
    private List<n> hK;

    @dy(field = 1313548479097149320L)
    private String k2;

    @dy(field = 852334662417406287L)
    private List<n> w9;

    @dy(field = 3167226184868558561L)
    private String zh;

    @cy(clazz = 4295557519651882841L, container = 1991841546302420120L, user = true)
    static class a implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -3940712618723345840L)
        final /* synthetic */ Activity WB;

        @dy(field = -2746299802762408725L)
        final /* synthetic */ String jw;

        @dy(field = -2738450881383012372L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -504125482918574916L)
        a(Activity activity, String str, String str2) {
            this.WB = activity;
            this.mb = str;
            this.jw = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = -2463716831905121740L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-197754020620649909L, this);
                }
                Social.tp(this.WB, this.mb, this.jw);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -197754020620649909L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4295643130497461760L, container = 1991841546302420120L, user = true)
    class b implements DialogInterface.OnCancelListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -8644858114543065L)
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @ey(method = 708384057014007616L)
        public void onCancel(DialogInterface dialogInterface) {
            try {
                if (mb) {
                    iy.tp(-5555600766420419235L, this, dialogInterface);
                }
                if (SocialDialog.this.AL != null) {
                    SocialDialog.this.AL.run();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -5555600766420419235L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4295728741347103973L, container = 1991841546302420120L, user = true)
    class c implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -178551832017218004L)
        final /* synthetic */ ListView WB;

        @dy(field = 1811465591646988851L)
        final /* synthetic */ AlertDialog jw;

        @dy(field = 3204585391259484008L)
        final /* synthetic */ Activity mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -982216834674689241L)
        c(ListView listView, Activity activity, AlertDialog alertDialog) {
            this.WB = listView;
            this.mb = activity;
            this.jw = alertDialog;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = 794596497270776320L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (qp) {
                    iy.J0(4614292038882057663L, this, adapterView, view, new Integer(i), new Long(j));
                }
                n nVar = (n) adapterView.getItemAtPosition(i);
                if (nVar.Hw) {
                    if (SocialDialog.this.hK == null || SocialDialog.this.cT) {
                        this.jw.dismiss();
                        if (SocialDialog.this.AL != null) {
                            SocialDialog.this.AL.run();
                        }
                    } else {
                        SocialDialog.this.cT = true;
                        this.WB.setAdapter((ListAdapter) new m(SocialDialog.this, this.mb, SocialDialog.this.hK));
                    }
                }
                if (nVar.FH != null) {
                    nVar.FH.run();
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, 4614292038882057663L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5452614446369734727L, container = 1991841546302420120L, user = true)
    static class d implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 1103140488818946933L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -194292205880328059L)
        d(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = -633795272693170073L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3977253694763262688L, this);
                }
                SocialDialog.dx(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3977253694763262688L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5452729631624020320L, container = 1991841546302420120L, user = true)
    static class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -4254372305809582985L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -55838367753584297L)
        e(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = 894931637828511933L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3975749081663256549L, this);
                }
                Social.FH(this.WB, "239564276138537");
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3975749081663256549L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5452844816874242619L, container = 1991841546302420120L, user = true)
    static class f implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 35811425851357893L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -155283220770288171L)
        f(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = -2197247714870508025L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3974243984370425320L, this);
                }
                Social.Hw(this.WB, "android-ide");
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3974243984370425320L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5452960002120401624L, container = 1991841546302420120L, user = true)
    static class g implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 4431344658161929440L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 162932403845797872L)
        g(Activity activity) {
            this.WB = activity;
        }

        @ey(method = 2122111808053387200L)
        private String DW() {
            try {
                if (mb) {
                    iy.gn(-1612750355503795260L, this);
                }
                try {
                    return this.WB.getPackageManager().getPackageInfo(this.WB.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    AppLog.v5(e);
                    return "(version unknown)";
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -1612750355503795260L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
        @ey(method = 2333268786616431621L)
        private String j6() {
            long j = 3509514631334873775;
            try {
                if (mb) {
                    iy.gn(3509514631334873775L, this);
                }
                String str = Build.MODEL;
                if (str != null && str.length() <= 40) {
                    j = "on my " + str;
                    return j;
                }
                return "";
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, j, this);
                }
                throw th;
            }
        }

        @Override // java.lang.Runnable
        @ey(method = -1455404792155150448L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3972738402884769001L, this);
                }
                Social.VH(this.WB, "support@appfour.com", "AIDE Feedback", "With AIDE " + DW() + " " + j6() + " (SDK " + Build.VERSION.SDK_INT + ")...\n\n[Write text here]");
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3972738402884769001L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5453075187362497335L, container = 1991841546302420120L, user = true)
    static class h implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 3674439173024293031L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 208294400990361799L)
        h(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = -7291240571069859L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-3971232337206287592L, this);
                }
                Social.v5(this.WB, "com.aide.ui", "community");
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -3971232337206287592L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5453190372600529752L, container = 1991841546302420120L, user = true)
    static class i implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 2713849401547678405L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(i.class);
        }

        @ey(method = -12725525859020747L)
        i(Activity activity) {
            this.WB = activity;
        }

        @Override // java.lang.Runnable
        @ey(method = -1794388573208594625L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1193292265881512353L, this);
                }
                SocialDialog.dx(this.WB);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1193292265881512353L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5453305557834498875L, container = 1991841546302420120L, user = true)
    static class j implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -146860716513010147L)
        final /* synthetic */ Activity WB;

        @dy(field = -3344307873775182695L)
        final /* synthetic */ String jw;

        @dy(field = 3047577874588888299L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(j.class);
        }

        @ey(method = 1009997326116615393L)
        j(Activity activity, String str, String str2) {
            this.WB = activity;
            this.mb = str;
            this.jw = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = -2172835974711648825L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-3220011334371353880L, this);
                }
                Social.v5(this.WB, this.mb, this.jw);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -3220011334371353880L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5453420743064404704L, container = 1991841546302420120L, user = true)
    static class k implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -222257406799555365L)
        final /* synthetic */ Activity WB;

        @dy(field = 795351312564546144L)
        final /* synthetic */ String jw;

        @dy(field = 808899583980609281L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(k.class);
        }

        @ey(method = 2902899048627371175L)
        k(Activity activity, String str, String str2) {
            this.WB = activity;
            this.mb = str;
            this.jw = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = 949481473298366385L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-197638279096213977L, this);
                }
                Social.gn(this.WB, this.mb, this.jw);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -197638279096213977L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5453535928290247239L, container = 1991841546302420120L, user = true)
    static class l implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = 3234851766195274512L)
        final /* synthetic */ Activity WB;

        @dy(field = -2708813867454598793L)
        final /* synthetic */ String jw;

        @dy(field = -2701991946408269500L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(l.class);
        }

        @ey(method = 2348456898535435432L)
        l(Activity activity, String str, String str2) {
            this.WB = activity;
            this.mb = str;
            this.jw = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = 563522880277341992L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(-197696391954844488L, this);
                }
                Social.u7(this.WB, this.mb, this.jw);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -197696391954844488L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1920580939227879948L, container = -1920580939227879948L, user = true)
    private class m extends ArrayAdapter<n> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(m.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -762977782197840731L)
        public m(SocialDialog socialDialog, Context context, List<n> list) {
            super(context, r.share_dialog_entry, list);
            try {
                if (j6) {
                    iy.we(-3233666482377458640L, null, socialDialog, context, list);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.U2(th, -3233666482377458640L, null, socialDialog, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = 61108183099295076L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (j6) {
                    iy.we(-2464494226770077829L, this, new Integer(i), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(getContext()).inflate(r.share_dialog_entry, viewGroup, false) : view;
                n item = getItem(i);
                ((TextView) viewInflate.findViewById(q.shareDialogEntryText)).setText(item.j6);
                ImageView imageView = (ImageView) viewInflate.findViewById(q.shareDialogEntryImage);
                if (item.DW != 0) {
                    imageView.setImageResource(item.DW);
                }
                imageView.setVisibility(item.DW == 0 ? 4 : 0);
                return viewInflate;
            } catch (Throwable th) {
                if (DW) {
                    iy.U2(th, -2464494226770077829L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(SocialDialog.class);
    }

    @ey(method = 3331726599380969868L)
    private SocialDialog(String str, String str2, List<n> list, List<n> list2, Runnable runnable) {
        try {
            if (q7) {
                iy.J8(-1131598358534696472L, null, str, str2, list, list2, runnable);
            }
            this.k2 = str;
            this.zh = str2;
            this.AL = runnable;
            this.w9 = list;
            this.hK = list2;
        } catch (Throwable th) {
            if (Z1) {
                iy.lg(th, -1131598358534696472L, null, str, str2, list, list2, runnable);
            }
            throw th;
        }
    }

    @ey(method = 4322141669626981885L)
    public static void Sf(Activity activity, String str, String str2, String str3, Runnable runnable) {
        try {
            if (q7) {
                iy.J8(-3842855386415390224L, null, activity, str, str2, str3, runnable);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new n(R$drawable.community_discourse, " Discourse", new k(activity, str2, str3)));
            arrayList.add(new n(R$drawable.community_facebook, "Facebook", new l(activity, str2, str3)));
            arrayList.add(new n(R$drawable.community_twitter, "Twitter", new a(activity, str2, str3)));
            arrayList.add(new n(0, activity.getResources().getString(u.dialog_community_continue) + " ≫"));
            MessageBox.gW(activity, new SocialDialog(str, "\"" + str2 + "\"", arrayList, null, runnable));
        } catch (Throwable th) {
            if (Z1) {
                iy.lg(th, -3842855386415390224L, null, activity, str, str2, str3, runnable);
            }
            throw th;
        }
    }

    @ey(method = -1251375818648928840L)
    public static void dx(Activity activity) {
        try {
            if (q7) {
                iy.tp(49358011740502465L, null, activity);
            }
            Social.DW(activity);
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, 49358011740502465L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = 1172942811470569456L)
    public static void ef(Activity activity, String str, String str2, String str3, String str4, Runnable runnable) throws Throwable {
        char c2;
        try {
            if (q7) {
                iy.QX(-1943874245814127263L, null, new Object[]{activity, str, str2, str3, str4, runnable});
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new n(R$drawable.community_market, activity.getResources().getString(u.dialog_community_rate), new j(activity, str3, str4)));
            arrayList.add(new n(0, activity.getResources().getString(u.dialog_community_continue) + " ≫"));
            c2 = 0;
            try {
                MessageBox.gW(activity, new SocialDialog(str, str2, arrayList, null, runnable));
            } catch (Throwable th) {
                th = th;
                if (Z1) {
                    Object[] objArr = new Object[6];
                    objArr[c2] = activity;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = str4;
                    objArr[5] = runnable;
                    iy.rN(th, -1943874245814127263L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2 = 0;
        }
    }

    @ey(method = -1286110489964023319L)
    public static void sG(Activity activity) {
        try {
            if (q7) {
                iy.tp(-1266575227871095392L, null, activity);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new n(R$drawable.community_discourse, " Discourse", new d(activity)));
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.add(new n(R$drawable.community_facebook, "Facebook", new e(activity)));
            arrayList2.add(new n(R$drawable.community_google_groups, "Google Group", new f(activity)));
            arrayList2.add(new n(R$drawable.community_email, "Email", new g(activity)));
            if (!AndroidHelper.er()) {
                arrayList2.add(new n(R$drawable.community_market, activity.getResources().getString(u.dialog_community_rate), new h(activity)));
            }
            arrayList.add(new n(0, activity.getResources().getString(u.dialog_community_more)));
            MessageBox.gW(activity, new SocialDialog(activity.getResources().getString(u.dialog_community_title), activity.getResources().getString(u.dialog_community_message), arrayList, arrayList2, null));
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, -1266575227871095392L, null, activity);
            }
            throw th;
        }
    }

    @ey(method = -4349509414719659451L)
    public static void vJ(Activity activity, String str, String str2, Runnable runnable) {
        try {
            if (q7) {
                iy.J0(1055564674100857780L, null, activity, str, str2, runnable);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new n(R$drawable.community_discourse, activity.getResources().getString(u.dialog_community_ask), new i(activity)));
            if (runnable != null) {
                arrayList.add(new n(0, activity.getResources().getString(u.trainer_skip_lesson) + " ↷", runnable, true));
            }
            arrayList.add(new n(0, activity.getResources().getString(u.dialog_community_continue) + " ≫"));
            MessageBox.gW(activity, new SocialDialog(str, str2, arrayList, null, null));
        } catch (Throwable th) {
            if (Z1) {
                iy.a8(th, 1055564674100857780L, null, activity, str, str2, runnable);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 1133240333989313256L)
    protected Dialog Hw(Activity activity) {
        try {
            if (q7) {
                iy.tp(1342505932466576631L, this, activity);
            }
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(r.share_dialog, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setView(linearLayout).setCancelable(true).setTitle(this.k2);
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setCanceledOnTouchOutside(true);
            alertDialogCreate.setOnCancelListener(new b());
            ((TextView) linearLayout.findViewById(q.shareDialogMessage)).setText(this.zh);
            ListView listView = (ListView) linearLayout.findViewById(q.shareDialogList);
            listView.setAdapter((ListAdapter) new m(this, activity, this.w9));
            listView.setOnItemClickListener(new c(listView, activity, alertDialogCreate));
            return alertDialogCreate;
        } catch (Throwable th) {
            if (Z1) {
                iy.j3(th, 1342505932466576631L, this, activity);
            }
            throw th;
        }
    }

    @cy(clazz = 3079107121431465755L, container = 3079107121431465755L, user = true)
    private static class n {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = 14503234024262487L)
        private int DW;

        @dy(field = -2824136486033556131L)
        private Runnable FH;

        @dy(field = -2511215346923541216L)
        private boolean Hw;

        @dy(field = 611777262837127248L)
        private String j6;

        static {
            iy.Zo(n.class);
        }

        @ey(method = -121672730670420976L)
        public n(int i, String str) {
            try {
                if (v5) {
                    iy.EQ(2186024998602728309L, null, new Integer(i), str);
                }
                this.DW = i;
                this.j6 = str;
                this.FH = null;
                this.Hw = true;
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 2186024998602728309L, null, new Integer(i), str);
                }
                throw th;
            }
        }

        @ey(method = -1440297190966276825L)
        public n(int i, String str, Runnable runnable) {
            try {
                if (v5) {
                    iy.we(-1792560872477880192L, null, new Integer(i), str, runnable);
                }
                this.DW = i;
                this.j6 = str;
                this.FH = runnable;
                this.Hw = false;
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, -1792560872477880192L, null, new Integer(i), str, runnable);
                }
                throw th;
            }
        }

        @ey(method = 8050462813539910400L)
        public n(int i, String str, Runnable runnable, boolean z) {
            try {
                if (v5) {
                    iy.J0(820461152477372975L, null, new Integer(i), str, runnable, new Boolean(z));
                }
                this.DW = i;
                this.j6 = str;
                this.FH = runnable;
                this.Hw = z;
            } catch (Throwable th) {
                if (Zo) {
                    iy.a8(th, 820461152477372975L, null, new Integer(i), str, runnable, new Boolean(z));
                }
                throw th;
            }
        }
    }
}
