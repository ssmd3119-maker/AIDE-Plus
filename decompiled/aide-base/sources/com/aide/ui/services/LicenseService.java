package com.aide.ui.services;

import abcd.c0;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.td;
import abcd.ud;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import com.aide.common.AIDEShopActivityStarter;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.licensing.IAideLicenseResultListener;
import com.aide.ui.PromoNotificationAlarmReceiver;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.trainer.TrainerNotificationAlarmReceiver;
import com.aide.ui.u;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

@cy(clazz = -5512199351607094776L, container = -5512199351607094776L, user = true)
/* loaded from: classes.dex */
public class LicenseService {

    @fy
    private static /* synthetic */ boolean EQ;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = -4096731277695067328L)
    private long DW;

    @dy(field = -1778107694123030400L)
    private long FH;

    @dy(field = 5040277543243240024L)
    private boolean Hw;

    @dy(field = 2333946689440500480L)
    private AtomicLong VH;

    @dy(field = 4810292570148432477L)
    private AtomicLong Zo;

    @dy(field = 2444638751229946760L)
    private td gn;

    @dy(field = 4765635909877695875L)
    private long j6;

    @dy(field = -2624380913457292483L)
    private AtomicBoolean tp;

    @dy(field = 56943212107263040L)
    private ud u7;

    @dy(field = -2219440165332424144L)
    private com.aide.licensing.a v5;

    @cy(clazz = -340670028351610515L, container = -5512199351607094776L, user = true)
    class a implements IAideLicenseResultListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1861723369963567905L)
        public a(LicenseService licenseService) {
        }

        @Override // com.aide.licensing.IAideLicenseResultListener
        @ey(method = 5392136163132123639L)
        public void Ir(String str, String str2) {
            try {
                if (WB) {
                    iy.EQ(-1135417361837882500L, this, str, str2);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -1135417361837882500L, this, str, str2);
                }
                throw th;
            }
        }

        @Override // com.aide.licensing.IAideLicenseResultListener
        @ey(method = 4918984930016403984L)
        public void Sc() {
            try {
                if (WB) {
                    iy.gn(382828987212136355L, this);
                }
                FireBaseLogEvent.tp("Licensed verification failed");
                ServiceContainer.getMainActivity().BT();
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 382828987212136355L, this);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -2145307891725578040L)
        public IBinder asBinder() {
            try {
                if (!WB) {
                    return null;
                }
                iy.gn(-2628529762410246661L, this);
                return null;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2628529762410246661L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -340730710315727096L, container = -5512199351607094776L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 7689186902993474541L)
        public b() {
        }

        @Override // java.lang.Runnable
        @ey(method = 649933148744091935L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1768723510169093620L, this);
                }
                SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("InAppBillingSettings", 0).edit();
                editorEdit.putBoolean("WasPrimeAtSomePoint", true);
                editorEdit.commit();
                LicenseService.this.u7();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1768723510169093620L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(LicenseService.class);
    }

    @ey(method = 1625773302131002947L)
    public LicenseService() {
        try {
            if (EQ) {
                iy.gn(4997135016184014040L, null);
            }
            this.j6 = 0L;
            this.DW = 0L;
            this.FH = 0L;
            this.Hw = false;
            this.Zo = new AtomicLong(0L);
            this.VH = new AtomicLong(0L);
            this.gn = new td();
            this.u7 = new ud();
            this.tp = new AtomicBoolean(false);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 4997135016184014040L, null);
            }
            throw th;
        }
    }

    @ey(method = -1164736582577366112L)
    private void Hw() {
        try {
            if (EQ) {
                iy.gn(-322554253526051855L, this);
            }
            ServiceContainer.XL().j3();
            ServiceContainer.gW().FH();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -322554253526051855L, this);
            }
            throw th;
        }
    }

    @ey(method = -3721792343971238200L)
    private boolean J8() {
        try {
            if (EQ) {
                iy.gn(3145210352097905517L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca()) {
                return true;
            }
            if (ServiceContainer.P8.equals("com.aide.web")) {
                try {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTimeInMillis(ServiceContainer.getContext().getPackageManager().getPackageInfo(ServiceContainer.P8, 0).firstInstallTime);
                    if (gregorianCalendar.before(new GregorianCalendar(2016, 11, 13))) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            Hw();
            return System.currentTimeMillis() < this.VH.get();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 3145210352097905517L, this);
            }
            throw th;
        }
    }

    @ey(method = -2143727912137271985L)
    private boolean Zo(Activity activity, int i, String str) {
        try {
            if (EQ) {
                iy.we(-1854435506479910424L, this, activity, new Integer(i), str);
            }
            if (Ws()) {
                return true;
            }
            cn(activity, i, str);
            return false;
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, -1854435506479910424L, this, activity, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -1586376168595155793L)
    private void a8(String str) {
        try {
            if (EQ) {
                iy.tp(-1153740540392817704L, this, str);
            }
            if (ServiceContainer.getMainActivity().XG()) {
                FireBaseLogEvent.tp(str);
                return;
            }
            FireBaseLogEvent.j3(ServiceContainer.getMainActivity());
            FireBaseLogEvent.tp(str);
            FireBaseLogEvent.FH(ServiceContainer.getMainActivity());
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -1153740540392817704L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1399727759734925336L)
    private void ef() {
        try {
            if (EQ) {
                iy.gn(435436208635078035L, this);
            }
            SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences("LicenseService", 0);
            if (sharedPreferences.getLong("first_shop_time", -1L) == -1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong("first_shop_time", jCurrentTimeMillis);
                editorEdit.commit();
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 435436208635078035L, this);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -565330052686229565L)
    public void u7() {
        try {
            if (EQ) {
                iy.gn(126753521188421888L, this);
            }
            TrainerNotificationAlarmReceiver.DW(ServiceContainer.getContext());
            PromoNotificationAlarmReceiver.DW(ServiceContainer.getContext());
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 126753521188421888L, this);
            }
            throw th;
        }
    }

    @ey(method = -803532929501008791L)
    public void BT() {
        try {
            if (EQ) {
                iy.gn(-1138790814506516744L, this);
            }
            this.j6 = 0L;
            c0.VH(ServiceContainer.getContext(), "Premium", false);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -1138790814506516744L, this);
            }
            throw th;
        }
    }

    @ey(method = -70139238744779197L)
    public void EQ() {
        try {
            if (EQ) {
                iy.gn(747801893305988400L, this);
            }
            this.gn.EQ();
            this.gn.tp();
            this.u7.EQ();
            this.u7.tp();
            if (!QX()) {
                c0.VH(ServiceContainer.getContext(), "Premium", false);
            }
            if (U2()) {
                return;
            }
            c0.VH(ServiceContainer.getContext(), "UIDesigner", false);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 747801893305988400L, this);
            }
            throw th;
        }
    }

    @ey(method = 463075239686884929L)
    public boolean FH() {
        try {
            if (EQ) {
                iy.gn(-110968290167263808L, this);
            }
            if (aM() || J8()) {
                return true;
            }
            if (Ws() && Mr()) {
                return J0();
            }
            return false;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -110968290167263808L, this);
            }
            throw th;
        }
    }

    @ey(method = 6266671238516228045L)
    public boolean J0() {
        try {
            if (EQ) {
                iy.gn(-4582521866206478684L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca() || J8()) {
                return true;
            }
            Hw();
            if (System.currentTimeMillis() < this.Zo.get()) {
                return true;
            }
            return System.currentTimeMillis() < this.FH;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -4582521866206478684L, this);
            }
            throw th;
        }
    }

    @ey(method = 4544525010972303347L)
    public void KD() {
        try {
            if (EQ) {
                iy.gn(-1838863534148358200L, this);
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -1838863534148358200L, this);
            }
            throw th;
        }
    }

    @ey(method = 3832564520519934269L)
    public boolean Mr() {
        try {
            if (EQ) {
                iy.gn(-5299563432382699920L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca() || J8()) {
                return true;
            }
            Hw();
            if (System.currentTimeMillis() < this.Zo.get()) {
                return true;
            }
            this.u7.tp();
            return System.currentTimeMillis() < this.DW;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -5299563432382699920L, this);
            }
            throw th;
        }
    }

    @ey(method = -225452503664021219L)
    public boolean Mz() {
        try {
            if (EQ) {
                iy.gn(-159770495043666572L, this);
            }
            if (g3() || vJ()) {
                return true;
            }
            if (QX() && U2()) {
                return Sf();
            }
            return false;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -159770495043666572L, this);
            }
            throw th;
        }
    }

    @ey(method = 26205626243261575L)
    public void P8(long j) {
        try {
            if (EQ) {
                iy.tp(-4949806600581638560L, this, new Long(j));
            }
            boolean z = System.currentTimeMillis() < this.j6;
            this.j6 = j;
            if (z) {
                return;
            }
            u7();
            a8("Premium license verified");
            c0.VH(ServiceContainer.getContext(), "Premium", true);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -4949806600581638560L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = -263235497197374429L)
    public boolean QX() {
        try {
            if (EQ) {
                iy.gn(-5144597395457319540L, this);
            }
            return this.gn.J0();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -5144597395457319540L, this);
            }
            throw th;
        }
    }

    @ey(method = -1832978498881423700L)
    public void SI(long j) {
        try {
            if (EQ) {
                iy.tp(-1816418135529324711L, this, new Long(j));
            }
            this.DW = j;
            a8("UI Builder license verified");
            c0.VH(ServiceContainer.getContext(), "UIDesigner", true);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -1816418135529324711L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 819065014742510725L)
    public boolean Sf() {
        try {
            if (EQ) {
                iy.gn(3127144497962780880L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca()) {
                return true;
            }
            return ServiceContainer.getContext().getSharedPreferences("InAppBillingSettings", 0).getBoolean("WasDebuggerLicensedAtSomePoint", false);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 3127144497962780880L, this);
            }
            throw th;
        }
    }

    @ey(method = -632198736759362815L)
    public boolean U2() {
        try {
            if (EQ) {
                iy.gn(59752351634626200L, this);
            }
            return this.u7.J0();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 59752351634626200L, this);
            }
            throw th;
        }
    }

    @ey(method = 3925159383724685580L)
    public boolean VH(Activity activity, String str) {
        try {
            if (EQ) {
                iy.EQ(808434900014983033L, this, activity, str);
            }
            return Zo(activity, u.shop_feature_premium, "feature_" + str);
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 808434900014983033L, this, activity, str);
            }
            throw th;
        }
    }

    @ey(method = -1929347346767192016L)
    public boolean Ws() {
        try {
            if (EQ) {
                iy.gn(64075054600324521L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca()) {
                return true;
            }
            if (ServiceContainer.P8.equals("com.aide.phonegap")) {
                if (this.v5 == null) {
                    com.aide.licensing.a aVar = new com.aide.licensing.a();
                    this.v5 = aVar;
                    aVar.EQ(ServiceContainer.getMainActivity(), false);
                }
                this.v5.we(new a(this));
                return true;
            }
            if (J8()) {
                return true;
            }
            Hw();
            if (System.currentTimeMillis() < this.Zo.get()) {
                return true;
            }
            this.gn.tp();
            return System.currentTimeMillis() < this.j6;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 64075054600324521L, this);
            }
            throw th;
        }
    }

    @ey(method = -7870123775503418517L)
    public boolean XL() {
        try {
            if (EQ) {
                iy.gn(-219774369393488192L, this);
            }
            this.gn.tp();
            return this.Hw;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -219774369393488192L, this);
            }
            throw th;
        }
    }

    @ey(method = -7088451274905857604L)
    public boolean aM() {
        try {
            if (EQ) {
                iy.gn(3603857704322702427L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca()) {
                return true;
            }
            Hw();
            return System.currentTimeMillis() < this.Zo.get();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 3603857704322702427L, this);
            }
            throw th;
        }
    }

    @ey(method = -2888877886148310568L)
    public void cb(Activity activity, String str, String str2) {
        try {
            if (EQ) {
                iy.we(-2144703421766129133L, this, activity, str, str2);
            }
            if (ServiceContainer.ca()) {
                return;
            }
            FireBaseLogEvent.EQ("Edition shown " + str, Collections.singletonMap("linkid", str2));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, str, str2)));
            intent.setFlags(1074266112);
            try {
                j6(ServiceContainer.gn(), intent);
            } catch (ActivityNotFoundException unused) {
                MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
            }
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, -2144703421766129133L, this, activity, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 1409253321544674133L)
    public void cn(Activity activity, int i, String str) {
        try {
            if (EQ) {
                iy.we(-385487729671325952L, this, activity, new Integer(i), str);
            }
            if (Ws()) {
                return;
            }
            Hw();
            ro(activity, i, str, false, false);
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, -385487729671325952L, this, activity, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 6417775453548328840L)
    public void dx(Activity activity, String str, String str2) {
        try {
            if (EQ) {
                iy.we(-3610362533331703455L, this, activity, str, str2);
            }
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, -3610362533331703455L, this, activity, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -7419522706328898032L)
    public void ei(long j, boolean z) {
        try {
            if (EQ) {
                iy.EQ(4830136333632272037L, this, new Long(j), new Boolean(z));
            }
            this.Zo.set(j);
            this.tp.set(z);
            ServiceContainer.aj(new b());
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 4830136333632272037L, this, new Long(j), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2623684174028017236L)
    public void er(Activity activity, String str, String str2) {
        try {
            if (EQ) {
                iy.we(-606448954352369625L, this, activity, str, str2);
            }
            if (ServiceContainer.ca()) {
                return;
            }
            ServiceContainer.XL().OW(str, true, str2);
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, -606448954352369625L, this, activity, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -3373122679550319668L)
    public boolean g3() {
        try {
            if (EQ) {
                iy.gn(3464804052391628955L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca()) {
                return true;
            }
            return ServiceContainer.getContext().getSharedPreferences("InAppBillingSettings", 0).getBoolean("WasPrimeAtSomePoint", false);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 3464804052391628955L, this);
            }
            throw th;
        }
    }

    @ey(method = -3095696997899613072L)
    public void gW(long j) {
        try {
            if (EQ) {
                iy.tp(-6582413399638072623L, this, new Long(j));
            }
            this.VH.set(j);
            a8("Developer license verified");
            c0.VH(ServiceContainer.getContext(), "Developer", true);
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("InAppBillingSettings", 0).edit();
            editorEdit.putBoolean("WasDeveloperLicensedAtSomePoint", true);
            editorEdit.commit();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -6582413399638072623L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 4572890211440303280L)
    public boolean gn(Activity activity, String str) {
        try {
            if (EQ) {
                iy.EQ(1338284351672724429L, this, activity, str);
            }
            return Zo(activity, u.shop_feature_premium_settings, "setting_" + str);
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 1338284351672724429L, this, activity, str);
            }
            throw th;
        }
    }

    @ey(method = -4770692882151915396L)
    public boolean j3() {
        try {
            if (EQ) {
                iy.gn(-4830149327964595461L, this);
            }
            return this.tp.get();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -4830149327964595461L, this);
            }
            throw th;
        }
    }

    @ey(method = -727126817990535088L)
    public void lg(Activity activity, String str, String str2) {
        try {
            if (EQ) {
                iy.we(177444579551092821L, this, activity, str, str2);
            }
            if (ServiceContainer.ca()) {
                return;
            }
            ServiceContainer.XL().OW(str, false, str2);
        } catch (Throwable th) {
            if (we) {
                iy.U2(th, 177444579551092821L, this, activity, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -5268108355806501648L)
    public void nw() {
        try {
            if (EQ) {
                iy.gn(2183249550071396477L, this);
            }
            this.DW = 0L;
            c0.VH(ServiceContainer.getContext(), "UIDesigner", false);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 2183249550071396477L, this);
            }
            throw th;
        }
    }

    @ey(method = -766750056252252309L)
    public void rN(Activity activity, String str) {
        try {
            if (EQ) {
                iy.EQ(-4509976496187872212L, this, activity, str);
            }
            if (Ws()) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(FireBaseLogEvent.v5(ServiceContainer.P8, "com.aide.premium.key", str)));
            intent.setFlags(1074266112);
            try {
                j6(ServiceContainer.gn(), intent);
            } catch (ActivityNotFoundException unused) {
                MessageBox.BT(ServiceContainer.gn(), "Google Play Store", "Google Play Store App could not be opened. Not installed?");
            }
            FireBaseLogEvent.EQ("Premium key market page shown", Collections.singletonMap("linkid", str));
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, -4509976496187872212L, this, activity, str);
            }
            throw th;
        }
    }

    @ey(method = -3097953899770172928L)
    public void ro(Activity activity, int i, String str, boolean z, boolean z2) {
        try {
            if (EQ) {
                iy.J8(-1122893914841510225L, this, activity, new Integer(i), str, new Boolean(z), new Boolean(z2));
            }
            ef();
            if (!AndroidHelper.U2(activity) && (ServiceContainer.P8.equals("com.aide.ui") || ServiceContainer.P8.equals("com.aide.web"))) {
                AIDEShopActivityStarter.DW(activity, i, str, z, z2);
                return;
            }
            sh(activity, i, 0, str, z2);
        } catch (Throwable th) {
            if (we) {
                iy.lg(th, -1122893914841510225L, this, activity, new Integer(i), str, new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = -1994838798360712255L)
    public void sG() {
        try {
            if (EQ) {
                iy.gn(-3208404806142114436L, this);
            }
            this.gn.aM();
            this.u7.aM();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -3208404806142114436L, this);
            }
            throw th;
        }
    }

    @ey(method = -5802514170952434960L)
    public void sh(Activity activity, int i, int i2, String str, boolean z) {
        try {
            if (EQ) {
                iy.J8(6504810879069821185L, this, activity, new Integer(i), new Integer(i2), str, new Boolean(z));
            }
            ef();
            AIDEShopActivityStarter.FH(activity, i, i2 != 0 ? ServiceContainer.getContext().getResources().getString(i2) : "", str, z);
        } catch (Throwable th) {
            if (we) {
                iy.lg(th, 6504810879069821185L, this, activity, new Integer(i), new Integer(i2), str, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3845274155866176L)
    public long tp() {
        try {
            if (EQ) {
                iy.gn(4453378525276254145L, this);
            }
            return ServiceContainer.getContext().getSharedPreferences("LicenseService", 0).getLong("first_shop_time", -1L);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 4453378525276254145L, this);
            }
            throw th;
        }
    }

    @ey(method = -749879218102705307L)
    public boolean v5(Activity activity) {
        try {
            if (EQ) {
                iy.tp(-913028588914349964L, this, activity);
            }
            if (J0()) {
                return true;
            }
            ro(activity, u.shop_feature_debugger, "debugger", false, false);
            return false;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -913028588914349964L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = -1930611432836310080L)
    public boolean vJ() {
        try {
            if (EQ) {
                iy.gn(-1467742067547199423L, this);
            }
            if (ServiceContainer.ef() || ServiceContainer.ca()) {
                return true;
            }
            if (ServiceContainer.P8.equals("com.aide.web")) {
                try {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTimeInMillis(ServiceContainer.getContext().getPackageManager().getPackageInfo(ServiceContainer.P8, 0).firstInstallTime);
                    if (gregorianCalendar.before(new GregorianCalendar(2016, 11, 13))) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return ServiceContainer.getContext().getSharedPreferences("InAppBillingSettings", 0).getBoolean("WasDeveloperLicensedAtSomePoint", false);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -1467742067547199423L, this);
            }
            throw th;
        }
    }

    @ey(method = -7595168464825791765L)
    public void vy() {
        try {
            if (EQ) {
                iy.gn(5209077328786717568L, this);
            }
            this.Hw = true;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 5209077328786717568L, this);
            }
            throw th;
        }
    }

    @ey(method = 2725652026145492720L)
    public boolean we() {
        try {
            if (EQ) {
                iy.gn(-6174224977488323027L, this);
            }
            if (!J8() && !aM() && !J0() && !Ws()) {
                if (!Mr()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -6174224977488323027L, this);
            }
            throw th;
        }
    }

    @ey(method = -2912940624764030784L)
    public void yS(long j) {
        try {
            if (EQ) {
                iy.tp(106833866093579277L, this, new Long(j));
            }
            this.FH = j;
            a8("Debugger license verified");
            c0.VH(ServiceContainer.getContext(), "Debugger", true);
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("InAppBillingSettings", 0).edit();
            editorEdit.putBoolean("WasDebuggerLicensedAtSomePoint", true);
            editorEdit.commit();
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 106833866093579277L, this, new Long(j));
            }
            throw th;
        }
    }
}
