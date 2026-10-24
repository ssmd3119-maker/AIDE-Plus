package com.aide.ui.activities;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.xe;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import com.aide.common.MessageBox;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.n;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.u;
import java.util.HashSet;
import java.util.Map;

@cy(clazz = 2736360516742849000L, container = 2736360516742849000L, user = true)
/* loaded from: classes.dex */
public class ShopExpertPopupActivity extends Activity {

    @gy
    private static /* synthetic */ boolean AL;

    @fy
    private static /* synthetic */ boolean zh;

    @dy(field = -930675309562200177L)
    protected View WB;

    @dy(field = 3762013480276971719L)
    private boolean fY;

    @dy(field = -4306460979491257433L)
    private Map<String, xe.q> jw;

    @dy(field = 5583605880781145664L)
    private String k2;

    @dy(field = -2119119461774766144L)
    protected AlertDialog mb;

    @dy(field = 5366976392611420992L)
    private boolean qp;

    @cy(clazz = -3849641621144310915L, container = 2736360516742849000L, user = true)
    class a extends MessageBox {

        @gy
        private static /* synthetic */ boolean AL;

        @fy
        private static /* synthetic */ boolean zh;

        @cy(clazz = 1814836171870059184L, container = 2736360516742849000L, user = true)
        /* renamed from: com.aide.ui.activities.ShopExpertPopupActivity$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnCancelListenerC0054a implements DialogInterface.OnCancelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(DialogInterfaceOnCancelListenerC0054a.class);
            }

            @ey(method = -4271473969044741656L)
            DialogInterfaceOnCancelListenerC0054a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            @ey(method = -607682528172217303L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (mb) {
                        iy.tp(-2294398261060179957L, this, dialogInterface);
                    }
                    FireBaseLogEvent.tp("Cancelled free version in expert shop.");
                    ShopExpertPopupActivity.this.setResult(-1);
                    ShopExpertPopupActivity.this.finish();
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -2294398261060179957L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1814864725867134105L, container = 2736360516742849000L, user = true)
        class b implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 7248759379741629380L)
            b() {
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 7877548614721583804L)
            public void onClick(View view) {
                try {
                    if (mb) {
                        iy.tp(2013892394173628535L, this, view);
                    }
                    FireBaseLogEvent.tp("Clicked on Free Version in expert shop.");
                    ShopExpertPopupActivity.this.mb.dismiss();
                    ShopExpertPopupActivity.this.setResult(-1);
                    ShopExpertPopupActivity.this.finish();
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 2013892394173628535L, this, view);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1814893279868272320L, container = 2736360516742849000L, user = true)
        class c implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 4703450517082210896L)
            c() {
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 19924923240006048L)
            public void onClick(View view) {
                try {
                    if (mb) {
                        iy.tp(6622063022636522272L, this, view);
                    }
                    FireBaseLogEvent.tp("Clicked on Buy in expert shop.");
                    ServiceContainer.getLicenseService().lg(ServiceContainer.gn(), ShopExpertPopupActivity.this.k2, ShopExpertPopupActivity.this.getIntent().getStringExtra("EXTRA_LINKID"));
                    ShopExpertPopupActivity.this.finish();
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 6622063022636522272L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 549962654901906301L)
        a() {
        }

        @Override // com.aide.common.MessageBox
        @ey(method = 79991885865469897L)
        protected Dialog Hw(Activity activity) {
            try {
                if (zh) {
                    iy.tp(100567841152874905L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ShopExpertPopupActivity.this.WB = LayoutInflater.from(activity).inflate(r.shop_expert_popup, (ViewGroup) null);
                builder.setView(ShopExpertPopupActivity.this.WB).setOnCancelListener(new DialogInterfaceOnCancelListenerC0054a());
                if (ShopExpertPopupActivity.this.qp) {
                    View viewFindViewById = ShopExpertPopupActivity.this.WB.findViewById(q.shopExpertPopupFreeButton);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setOnClickListener(new b());
                }
                ShopExpertPopupActivity.this.WB.findViewById(q.shopExpertPopupBuyButton).setOnClickListener(new c());
                TextView textView = (TextView) ShopExpertPopupActivity.this.WB.findViewById(q.shopExpertPopupTitle);
                ImageView imageView = (ImageView) ShopExpertPopupActivity.this.WB.findViewById(q.shopExpertPopupEntrySpecialImage);
                if (n.u7()) {
                    textView.setText(ShopExpertPopupActivity.this.getString(u.shop_expert_title_promo_upgrade, new Object[]{"33%"}));
                    imageView.setVisibility(0);
                } else if (n.gn()) {
                    textView.setText(ShopExpertPopupActivity.this.getString(u.shop_expert_title_promo, new Object[]{"33%"}));
                    imageView.setVisibility(0);
                } else {
                    textView.setText(ShopExpertPopupActivity.this.getString(u.shop_expert_title));
                }
                ShopExpertPopupActivity.this.mb = builder.create();
                ShopExpertPopupActivity.this.mb.setCancelable(true);
                ShopExpertPopupActivity.this.mb.setCanceledOnTouchOutside(false);
                return ShopExpertPopupActivity.this.mb;
            } catch (Throwable th) {
                if (AL) {
                    iy.j3(th, 100567841152874905L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3849712656935679224L, container = 2736360516742849000L, user = true)
    class b implements xe.k {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @cy(clazz = 1815046107540967513L, container = 2736360516742849000L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 3990764546327031660L)
            final /* synthetic */ Map WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -4726930269647442303L)
            a(Map map) {
                this.WB = map;
            }

            @Override // java.lang.Runnable
            @ey(method = -53301859524500776L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-1453401522910802091L, this);
                    }
                    if (ShopExpertPopupActivity.this.fY) {
                        return;
                    }
                    FireBaseLogEvent.tp("ExpertShopOKShown");
                    ShopExpertPopupActivity.this.jw = this.WB;
                    ShopExpertPopupActivity.this.VH();
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1453401522910802091L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1815074663496550080L, container = 2736360516742849000L, user = true)
        /* renamed from: com.aide.ui.activities.ShopExpertPopupActivity$b$b, reason: collision with other inner class name */
        class RunnableC0055b implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 994491257483125976L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(RunnableC0055b.class);
            }

            @ey(method = -6706375432461840696L)
            RunnableC0055b(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -716300338700315784L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-1450362515632573248L, this);
                    }
                    if (ShopExpertPopupActivity.this.fY) {
                        return;
                    }
                    if (ShopExpertPopupActivity.this.qp) {
                        ShopExpertPopupActivity.this.setResult(-1);
                        ShopExpertPopupActivity.this.finish();
                        return;
                    }
                    FireBaseLogEvent.tp("ExpertShopErrorShown: " + this.WB);
                    ShopExpertPopupActivity.this.mb.setCanceledOnTouchOutside(true);
                    ShopExpertPopupActivity.this.gn(this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1450362515632573248L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = -216915559169107835L)
        b() {
        }

        @Override // abcd.xe.k
        @ey(method = 135950792778106161L)
        public void DW(Map<String, xe.q> map) {
            try {
                if (DW) {
                    iy.tp(-1159454709208675320L, this, map);
                }
                ServiceContainer.aj(new a(map));
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -1159454709208675320L, this, map);
                }
                throw th;
            }
        }

        @Override // abcd.xe.k
        @ey(method = -1185802182548147339L)
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(-6336900020542800440L, this, str);
                }
                ServiceContainer.aj(new RunnableC0055b(str));
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -6336900020542800440L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ShopExpertPopupActivity.class);
    }

    @ey(method = -129086298942583419L)
    public ShopExpertPopupActivity() {
        try {
            if (zh) {
                iy.gn(-12569262285979784L, null);
            }
            this.qp = false;
            this.k2 = ServiceContainer.XL().lg();
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -12569262285979784L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4173175540750186213L)
    public void VH() {
        try {
            if (zh) {
                iy.gn(1782624898899905565L, this);
            }
            this.WB.findViewById(q.shopExpertProgressBar).setVisibility(8);
            TextView textView = (TextView) this.WB.findViewById(q.shopExpertPopupBuyButton);
            if (u7()) {
                textView.setText(getString(u.shop_expert_upgrade_for, new Object[]{this.jw.get(this.k2).FH}));
                ((TextView) this.WB.findViewById(q.shopExpertPopupFreeButton)).setText("No thanks");
            } else {
                textView.setText(getString(u.shop_expert_get_for, new Object[]{this.jw.get(this.k2).FH}));
            }
            ((ViewGroup) this.WB.findViewById(q.shopExpertButtonsLayout)).setVisibility(0);
            if (ServiceContainer.P8.equals("com.aide.web")) {
                ((TableLayout) this.WB.findViewById(q.shopExpertFeatureTableWeb)).setVisibility(0);
                return;
            }
            if (!u7()) {
                if (getIntent().getBooleanExtra("EXTRA_HILIGHT_ADS", false)) {
                    ((TableLayout) this.WB.findViewById(q.shopExpertFeatureTableNoAds)).setVisibility(0);
                    return;
                } else {
                    ((TableLayout) this.WB.findViewById(q.shopExpertFeatureTable)).setVisibility(0);
                    return;
                }
            }
            ((TableLayout) this.WB.findViewById(q.shopExpertFeatureTableUpgrade)).setVisibility(0);
            if (ServiceContainer.getLicenseService().QX()) {
                ((ImageView) this.WB.findViewById(q.shopExpertFeatureTableUpgradeCurrentPremiumImage)).setImageResource(R$drawable.project_no_errors);
            }
            if (ServiceContainer.getLicenseService().U2()) {
                ((ImageView) this.WB.findViewById(q.shopExpertFeatureTableUpgradeCurrentUIDesignerImage)).setImageResource(R$drawable.project_no_errors);
            }
            if (ServiceContainer.getLicenseService().J0()) {
                ((ImageView) this.WB.findViewById(q.shopExpertFeatureTableUpgradeCurrentDebuggerImage)).setImageResource(R$drawable.project_no_errors);
            }
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 1782624898899905565L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2404079508397978944L)
    public void gn(String str) {
        try {
            if (zh) {
                iy.tp(256298635944194048L, this, str);
            }
            this.WB.findViewById(q.shopExpertProgressBar).setVisibility(8);
            ((ViewGroup) this.WB.findViewById(q.shopExpertButtonsLayout)).setVisibility(8);
            ((TableLayout) this.WB.findViewById(q.shopExpertFeatureTable)).setVisibility(8);
            TextView textView = (TextView) this.WB.findViewById(q.shopExpertPopupErrorMessage);
            textView.setVisibility(0);
            textView.setText(Html.fromHtml("<b>Error! Please verify that:</b><br><br>- the device is connected to the internet,<br>- the latest version of the Google Play Store is installed,<br>- you are signed in with a valid Google account.<br><br>More information about troubleshooting is available at:<br><br><a href='https://support.google.com/googleplay/digital-content/'>https://support.google.com/googleplay/digital-content/</a><br><br><em>Error details: " + str + "</em>"));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, 256298635944194048L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1042469363296919745L)
    private void tp() {
        try {
            if (zh) {
                iy.gn(-243475566083236273L, this);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(this.k2);
            ServiceContainer.XL().BT(hashSet, new b());
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -243475566083236273L, this);
            }
            throw th;
        }
    }

    @ey(method = 2311541783669101599L)
    private boolean u7() {
        try {
            if (zh) {
                iy.gn(3076552904736541895L, this);
            }
            if (ServiceContainer.P8.equals("com.aide.ui")) {
                if (!ServiceContainer.getLicenseService().QX() && !ServiceContainer.getLicenseService().U2()) {
                    if (ServiceContainer.getLicenseService().J0()) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 3076552904736541895L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 810024627640558400L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (zh) {
                iy.tp(-718495689195481568L, this, bundle);
            }
            super.onCreate(bundle);
            if (ServiceContainer.vJ()) {
                finish();
                return;
            }
            FireBaseLogEvent.tp("ExpertShopShownWithLinkId:" + getIntent().getStringExtra("EXTRA_LINKID"));
            tp();
            if (getIntent().getBooleanExtra("EXTRA_IS_OPTIONAL_OFFER", false)) {
                this.qp = true;
            }
            MessageBox.gW(this, new a());
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -718495689195481568L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 6524253363815638935L)
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        try {
            if (zh) {
                iy.EQ(3988417443836372775L, this, new Integer(i), bundle);
            }
            return MessageBox.Zo(this, i);
        } catch (Throwable th) {
            if (AL) {
                iy.Mr(th, 3988417443836372775L, this, new Integer(i), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 142296625807106320L)
    protected void onDestroy() {
        try {
            if (zh) {
                iy.gn(1117204988007819368L, this);
            }
            super.onDestroy();
            this.fY = true;
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 1117204988007819368L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    @ey(method = 1252873426736360725L)
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        try {
            if (zh) {
                iy.EQ(-177088230442008179L, this, new Integer(i), menuItem);
            }
            if (menuItem.getItemId() != 16908332) {
                return super.onMenuItemSelected(i, menuItem);
            }
            setResult(-1);
            finish();
            return true;
        } catch (Throwable th) {
            if (AL) {
                iy.Mr(th, -177088230442008179L, this, new Integer(i), menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -622836588755920568L)
    protected void onPause() {
        try {
            if (zh) {
                iy.gn(247105287845344736L, this);
            }
            super.onPause();
            ServiceContainer.Qq(this);
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 247105287845344736L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -452860382737980480L)
    protected void onStart() {
        try {
            if (zh) {
                iy.gn(400708521823072968L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "ShopExpertPopup");
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 400708521823072968L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -2996306333913190684L)
    protected void onStop() {
        try {
            if (zh) {
                iy.gn(-2265750987231910844L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "ShopExpertPopup");
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -2265750987231910844L, this);
            }
            throw th;
        }
    }
}
