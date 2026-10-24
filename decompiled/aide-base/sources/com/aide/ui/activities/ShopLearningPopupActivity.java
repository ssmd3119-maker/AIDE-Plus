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
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.n;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.u;
import java.util.HashSet;
import java.util.Map;

@cy(clazz = -1644854612305552056L, container = -1644854612305552056L, user = true)
/* loaded from: classes.dex */
public class ShopLearningPopupActivity extends Activity {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = -770342233198451872L)
    private String AL;

    @dy(field = 1648890656464033024L)
    protected View WB;

    @dy(field = -3290691849602782208L)
    private boolean fY;

    @dy(field = 1459202433236499672L)
    private Map<String, xe.q> jw;

    @dy(field = 570808904931598968L)
    private String k2;

    @dy(field = -145199565606340211L)
    protected AlertDialog mb;

    @dy(field = -2906509558531944073L)
    private boolean qp;

    @dy(field = -2806950284000002567L)
    private String zh;

    @cy(clazz = -6899074879925825271L, container = -1644854612305552056L, user = true)
    class a extends MessageBox {

        @gy
        private static /* synthetic */ boolean AL;

        @fy
        private static /* synthetic */ boolean zh;

        @cy(clazz = 1022382577088585320L, container = -1644854612305552056L, user = true)
        /* renamed from: com.aide.ui.activities.ShopLearningPopupActivity$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnCancelListenerC0056a implements DialogInterface.OnCancelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(DialogInterfaceOnCancelListenerC0056a.class);
            }

            @ey(method = 7805632822606468785L)
            DialogInterfaceOnCancelListenerC0056a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            @ey(method = 310412865284262144L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (mb) {
                        iy.tp(1527083684635010635L, this, dialogInterface);
                    }
                    FireBaseLogEvent.tp("Cancelled free version in learning shop.");
                    ShopLearningPopupActivity.this.setResult(-1);
                    ShopLearningPopupActivity.this.finish();
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 1527083684635010635L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1022505447717925389L, container = -1644854612305552056L, user = true)
        class b implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 7622338494461133405L)
            b() {
            }

            @Override // android.view.View.OnClickListener
            @ey(method = -8291303271658995439L)
            public void onClick(View view) {
                try {
                    if (mb) {
                        iy.tp(-1304071724318871640L, this, view);
                    }
                    FireBaseLogEvent.tp("Clicked on Free Version in learning shop.");
                    ShopLearningPopupActivity.this.mb.dismiss();
                    ShopLearningPopupActivity.this.setResult(-1);
                    ShopLearningPopupActivity.this.finish();
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -1304071724318871640L, this, view);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1022628318351328752L, container = -1644854612305552056L, user = true)
        class c implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -817856175830964243L)
            c() {
            }

            @Override // android.view.View.OnClickListener
            @ey(method = -519895343126994003L)
            public void onClick(View view) {
                try {
                    if (mb) {
                        iy.tp(3523657904520341835L, this, view);
                    }
                    FireBaseLogEvent.tp("Clicked on Buy monthly in learning shop.");
                    ServiceContainer.getLicenseService().lg(ServiceContainer.gn(), ShopLearningPopupActivity.this.k2, ShopLearningPopupActivity.this.getIntent().getStringExtra("EXTRA_LINKID"));
                    ShopLearningPopupActivity.this.finish();
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 3523657904520341835L, this, view);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1022751188988795409L, container = -1644854612305552056L, user = true)
        class d implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 2509906451363319456L)
            d() {
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 1879769457313354656L)
            public void onClick(View view) {
                try {
                    if (mb) {
                        iy.tp(-8310610853962132112L, this, view);
                    }
                    FireBaseLogEvent.tp("Clicked on Buy yearly in learning shop.");
                    ServiceContainer.getLicenseService().lg(ServiceContainer.gn(), ShopLearningPopupActivity.this.zh, ShopLearningPopupActivity.this.getIntent().getStringExtra("EXTRA_LINKID"));
                    ShopLearningPopupActivity.this.finish();
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -8310610853962132112L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -90350759424891204L)
        a() {
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -3012497828281985069L)
        protected Dialog Hw(Activity activity) {
            try {
                if (zh) {
                    iy.tp(-513168812878931375L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ShopLearningPopupActivity.this.WB = LayoutInflater.from(activity).inflate(r.shop_learning_popup, (ViewGroup) null);
                builder.setView(ShopLearningPopupActivity.this.WB).setOnCancelListener(new DialogInterfaceOnCancelListenerC0056a());
                if (ShopLearningPopupActivity.this.qp) {
                    View viewFindViewById = ShopLearningPopupActivity.this.WB.findViewById(q.shopLearningFreeButton);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setOnClickListener(new b());
                }
                ShopLearningPopupActivity.this.WB.findViewById(q.shopLearningMonthlyButton).setOnClickListener(new c());
                ShopLearningPopupActivity.this.WB.findViewById(q.shopLearningYearlyButton).setOnClickListener(new d());
                TextView textView = (TextView) ShopLearningPopupActivity.this.WB.findViewById(q.shopLearningPopupTitle);
                ImageView imageView = (ImageView) ShopLearningPopupActivity.this.WB.findViewById(q.shopLearningSpecialYearly);
                if (n.EQ()) {
                    textView.setText(ShopLearningPopupActivity.this.getString(u.shop_learning_title_promo_upgrade, new Object[]{"20%"}));
                    imageView.setVisibility(0);
                } else {
                    textView.setText(ShopLearningPopupActivity.this.getString(u.shop_learning_title));
                }
                ShopLearningPopupActivity.this.mb = builder.create();
                ShopLearningPopupActivity.this.mb.setCancelable(true);
                ShopLearningPopupActivity.this.mb.setCanceledOnTouchOutside(false);
                return ShopLearningPopupActivity.this.mb;
            } catch (Throwable th) {
                if (AL) {
                    iy.j3(th, -513168812878931375L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -6899182996512633008L, container = -1644854612305552056L, user = true)
    class b implements xe.k {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @cy(clazz = 1022767388239156173L, container = -1644854612305552056L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2794984887840188945L)
            final /* synthetic */ Map WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -5980467125438490521L)
            a(Map map) {
                this.WB = map;
            }

            @Override // java.lang.Runnable
            @ey(method = -113970927176049669L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(731623696426836669L, this);
                    }
                    if (ShopLearningPopupActivity.this.fY) {
                        return;
                    }
                    FireBaseLogEvent.tp("LerningShopOKShown");
                    ShopLearningPopupActivity.this.jw = this.WB;
                    ShopLearningPopupActivity.this.gn();
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 731623696426836669L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1022890260827003888L, container = -1644854612305552056L, user = true)
        /* renamed from: com.aide.ui.activities.ShopLearningPopupActivity$b$b, reason: collision with other inner class name */
        class RunnableC0057b implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 685904020694112231L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(RunnableC0057b.class);
            }

            @ey(method = -405026761444396632L)
            RunnableC0057b(String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -1867954418734885983L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(734938092376181088L, this);
                    }
                    if (ShopLearningPopupActivity.this.fY) {
                        return;
                    }
                    if (ShopLearningPopupActivity.this.qp) {
                        ShopLearningPopupActivity.this.setResult(-1);
                        ShopLearningPopupActivity.this.finish();
                        return;
                    }
                    FireBaseLogEvent.tp("LearningShopErrorShown: " + this.WB);
                    ShopLearningPopupActivity.this.mb.setCanceledOnTouchOutside(true);
                    ShopLearningPopupActivity.this.u7(this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 734938092376181088L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = 268898888012732813L)
        b() {
        }

        @Override // abcd.xe.k
        @ey(method = -269189308607523792L)
        public void DW(Map<String, xe.q> map) {
            try {
                if (DW) {
                    iy.tp(2514799505022909840L, this, map);
                }
                ServiceContainer.aj(new a(map));
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 2514799505022909840L, this, map);
                }
                throw th;
            }
        }

        @Override // abcd.xe.k
        @ey(method = 1176809378636662176L)
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(6609915449000086080L, this, str);
                }
                ServiceContainer.aj(new RunnableC0057b(str));
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 6609915449000086080L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ShopLearningPopupActivity.class);
    }

    @ey(method = 1837665702480485404L)
    public ShopLearningPopupActivity() {
        try {
            if (w9) {
                iy.gn(251381527023501224L, null);
            }
            this.qp = false;
            this.k2 = ServiceContainer.XL().er();
            this.zh = ServiceContainer.XL().gW();
            this.AL = ServiceContainer.XL().yS();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 251381527023501224L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3824587139495311140L)
    public void gn() {
        try {
            if (w9) {
                iy.gn(-3574152285907112547L, this);
            }
            this.WB.findViewById(q.shopLearningProgressBar).setVisibility(8);
            TextView textView = (TextView) this.WB.findViewById(q.shopLearningMonthlyButton);
            TextView textView2 = (TextView) this.WB.findViewById(q.shopLearningYearlyButton);
            textView.setText(getString(u.shop_learning_get_for_monthly, new Object[]{this.jw.get(this.k2).FH}));
            textView2.setText(getString(u.shop_learning_get_for_yearly, new Object[]{this.jw.get(this.zh).FH, this.jw.get(this.AL).FH}));
            ((ViewGroup) this.WB.findViewById(q.shopLearningButtonsLayout)).setVisibility(0);
            if (ServiceContainer.P8.equals("com.aide.web")) {
                ((TableLayout) this.WB.findViewById(q.shopLearningFeatureTableWeb)).setVisibility(0);
            } else {
                ((TableLayout) this.WB.findViewById(q.shopLearningFeatureTable)).setVisibility(0);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -3574152285907112547L, this);
            }
            throw th;
        }
    }

    @ey(method = -4155866508563534464L)
    private void tp() {
        try {
            if (w9) {
                iy.gn(3360686955730804231L, this);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(this.zh);
            hashSet.add(this.k2);
            hashSet.add(this.AL);
            ServiceContainer.XL().BT(hashSet, new b());
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 3360686955730804231L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 568576774256598627L)
    public void u7(String str) {
        try {
            if (w9) {
                iy.tp(-857512370244588672L, this, str);
            }
            this.WB.findViewById(q.shopLearningProgressBar).setVisibility(8);
            ((ViewGroup) this.WB.findViewById(q.shopLearningButtonsLayout)).setVisibility(8);
            ((TableLayout) this.WB.findViewById(q.shopLearningFeatureTable)).setVisibility(8);
            TextView textView = (TextView) this.WB.findViewById(q.shopLearningPopupErrorMessage);
            textView.setVisibility(0);
            textView.setText(Html.fromHtml("<b>Error! Please verify that:</b><br><br>- the device is connected to the internet,<br>- the latest version of the Google Play Store is installed,<br>- you are signed in with a valid Google account.<br><br>More information about troubleshooting is available at:<br><br><a href='https://support.google.com/googleplay/digital-content/'>https://support.google.com/googleplay/digital-content/</a><br><br><em>Error details: " + str + "</em>"));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -857512370244588672L, this, str);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -733396930126353285L)
    public void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (w9) {
                iy.tp(750925099234869120L, this, bundle);
            }
            super.onCreate(bundle);
            if (ServiceContainer.vJ()) {
                finish();
                return;
            }
            FireBaseLogEvent.tp("LearningShopShownWithLinkId:" + getIntent().getStringExtra("EXTRA_LINKID"));
            tp();
            if (getIntent().getBooleanExtra("EXTRA_IS_OPTIONAL_OFFER", false)) {
                this.qp = true;
            }
            MessageBox.gW(this, new a());
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 750925099234869120L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1214533184720117912L)
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        try {
            if (w9) {
                iy.EQ(-3513975477806556353L, this, new Integer(i), bundle);
            }
            return MessageBox.Zo(this, i);
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -3513975477806556353L, this, new Integer(i), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1385150945943265501L)
    protected void onDestroy() {
        try {
            if (w9) {
                iy.gn(3826420125858720432L, this);
            }
            super.onDestroy();
            this.fY = true;
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 3826420125858720432L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    @ey(method = 594278014075415100L)
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        try {
            if (w9) {
                iy.EQ(485344467358204749L, this, new Integer(i), menuItem);
            }
            if (menuItem.getItemId() != 16908332) {
                return super.onMenuItemSelected(i, menuItem);
            }
            setResult(-1);
            finish();
            return true;
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, 485344467358204749L, this, new Integer(i), menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1964767387675926309L)
    protected void onPause() {
        try {
            if (w9) {
                iy.gn(1912252036665293000L, this);
            }
            super.onPause();
            ServiceContainer.Qq(this);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 1912252036665293000L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2138940010856557825L)
    protected void onStart() {
        try {
            if (w9) {
                iy.gn(2077508132099743200L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "shopLearningPopup");
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2077508132099743200L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -999748456836437847L)
    protected void onStop() {
        try {
            if (w9) {
                iy.gn(-2149364903973298508L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "shopLearningPopup");
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -2149364903973298508L, this);
            }
            throw th;
        }
    }
}
