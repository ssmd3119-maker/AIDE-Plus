package abcd;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.SoundPool;
import android.os.Handler;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.common.SocialDialog;
import com.aide.common.TextToSpeechHelper;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.TrainerCourseActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.t;
import com.aide.ui.trainer.TrainerNotificationAlarmReceiver;
import com.aide.ui.trainer.TrainerState;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = -2365206608828434332L, container = -2365206608828434332L, user = true)
/* loaded from: classes.dex */
public class mf {

    @gy
    private static /* synthetic */ boolean J0;

    @fy
    private static /* synthetic */ boolean we;

    @dy(field = 150621059386344891L)
    private Map<String, String> DW;

    @dy(field = 1168960760877514576L)
    private c.b EQ;

    @dy(field = -2309219534438200899L)
    private SoundPool FH;

    @dy(field = -1478307580787489507L)
    private int Hw;

    @dy(field = 277258979908529472L)
    private int VH;

    @dy(field = -1748325021248300160L)
    private int Zo;

    @dy(field = 3301527947850187407L)
    private int gn;

    @dy(field = -66464265375332215L)
    private TrainerState j6;

    @dy(field = 3566242511821912179L)
    private com.aide.ui.trainer.c tp;

    @dy(field = -945717536822237907L)
    private TextToSpeechHelper u7;

    @dy(field = -3074078589126474112L)
    private int v5;

    @cy(clazz = 335230034453533219L, container = -2365206608828434332L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -4076931074789163792L)
        public a() {
        }

        @Override // java.lang.Runnable
        @ey(method = -466107981009675312L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-5523111147320894380L, this);
                }
                if (ServiceContainer.isTrainerMode()) {
                    boolean zFH = ServiceContainer.getUpdateNotifyService().FH();
                    for (c.d dVar : mf.this.tp.BT()) {
                        if (dVar.j3()) {
                            ServiceContainer.getUpdateNotifyService().v5(zFH, dVar.v5(), dVar.J0(), dVar.Zo(), dVar.Hw(), dVar.XL());
                        }
                    }
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -5523111147320894380L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 335287097447272800L, container = -2365206608828434332L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -7023533665620062667L)
        public b() {
        }

        @Override // java.lang.Runnable
        @ey(method = 914517556278422949L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(314161719946545581L, this);
                }
                mf.this.wc();
                if (AppPreferences.Ws()) {
                    mf.this.u7.Hw(mf.this.Mr().VH(), mf.this.P8().FH() + " " + mf.this.Mr().Ws());
                }
                if (AppPreferences.J8()) {
                    mf.this.FH.play(mf.this.VH, 1.0f, 1.0f, 0, 0, 1.0f);
                }
                mf.this.XX(mf.this.P8());
                mf.this.ko();
                mf.this.jJ();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 314161719946545581L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 335344160445075675L, container = -2365206608828434332L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 7025064831202291712L)
        public c() {
        }

        @Override // java.lang.Runnable
        @ey(method = 2333395367101673284L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-6638860797273879192L, this);
                }
                mf.this.FN(mf.this.cn(), false);
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -6638860797273879192L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 335401223446941844L, container = -2365206608828434332L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -7092948892121073735L)
        public d() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1384643309599097457L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(753818527539661180L, this);
                }
                mf.this.oY();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 753818527539661180L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 335458286452871307L, container = -2365206608828434332L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -438398925209731135L)
        public e() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1710267615139823103L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(754726727641932045L, this);
                }
                mf.this.oY();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 754726727641932045L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 335515349462864064L, container = -2365206608828434332L, user = true)
    class f implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 3500135992542877536L)
        public f() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1599658244264165580L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(755635411937028000L, this);
                }
                mf.this.oY();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 755635411937028000L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(mf.class);
    }

    @ey(method = -1347223287702717879L)
    public mf() {
        try {
            if (we) {
                iy.gn(-2345039700489691056L, null);
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2345039700489691056L, null);
            }
            throw th;
        }
    }

    @ey(method = -3122737051690434752L)
    private void EQ() {
        try {
            if (we) {
                iy.gn(1922938751456375721L, this);
            }
            if (this.j6.showSkipLesson(P8()) && ServiceContainer.getLicenseService().aM() && cn() != null) {
                FireBaseLogEvent.tp("Skip Lesson Dialog Shown");
                SocialDialog.vJ(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.trainer_ask_a_question, new Object[0]), ServiceContainer.KD(u.trainer_ask_a_question_message_2, new Object[0]), new c());
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 1922938751456375721L, this);
            }
            throw th;
        }
    }

    @ey(method = 296558038337548672L)
    private void J0() {
        try {
            if (we) {
                iy.gn(-799429332978034055L, this);
            }
            String strEQ = this.tp.EQ(this.j6.getCurrentLessonId());
            if (strEQ.equals(this.j6.getCurrentLessonId())) {
                return;
            }
            this.j6.startLesson(strEQ);
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -799429332978034055L, this);
            }
            throw th;
        }
    }

    @ey(method = -1308078167234676800L)
    private String KD(c.j jVar) {
        try {
            if (we) {
                iy.tp(1179895769474877807L, this, jVar);
            }
            return (FileSystem.U2() + "/Lessons/") + jVar.Zo();
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 1179895769474877807L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = 1899839647786837371L)
    private void XG() {
        try {
            if (we) {
                iy.gn(2102207193653865424L, this);
            }
            this.EQ = this.tp.P8(this.j6.getCurrentLessonId());
            this.u7 = new TextToSpeechHelper(ServiceContainer.getContext());
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 2102207193653865424L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2443599130413531024L)
    public void XX(c.j jVar) {
        try {
            if (we) {
                iy.tp(-1030311059420238803L, this, jVar);
            }
            if (ServiceContainer.getLicenseService().aM() || ServiceContainer.getLicenseService().QX()) {
                return;
            }
            TrainerNotificationAlarmReceiver.FH(ServiceContainer.getContext(), 86400000L, 4, jVar.DW().Hw(), "", ServiceContainer.KD(u.trainer_notification_title, jVar.EQ()), ServiceContainer.getContext().getResources().getString(u.trainer_notification_text, jVar.DW().XL()[0] + " " + jVar.DW().XL()[1]));
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, -1030311059420238803L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -1674650923737894032L)
    private void Xa(String str, String str2) {
        try {
            if (we) {
                iy.EQ(1182068592727685151L, this, str, str2);
            }
            this.j6.retryCurrentExercise(str2, Mr().gn());
            if (AppPreferences.J8()) {
                this.FH.play(this.Hw, 1.0f, 1.0f, 0, 0, 1.0f);
            }
            if (AppPreferences.Ws()) {
                this.u7.Hw(str, str2);
            }
            jJ();
            EQ();
        } catch (Throwable th) {
            if (J0) {
                iy.Mr(th, 1182068592727685151L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 2679829953405412080L)
    private boolean ca() {
        c.j jVarCn;
        try {
            if (we) {
                iy.gn(1476456523510844811L, this);
            }
            if (this.j6.getCurrentExercise() + 1 >= P8().j3() && (jVarCn = cn()) != null && jVarCn.J0()) {
                if (!ServiceContainer.getLicenseService().aM()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 1476456523510844811L, this);
            }
            throw th;
        }
    }

    @ey(method = 3016807329132842484L)
    private String cb(float f2) {
        try {
            if (we) {
                iy.tp(2940247466745660423L, this, new Float(f2));
            }
            int iFloor = (int) Math.floor(Math.max(0.0f, 3.0f - (1.5f * f2)));
            String str = "";
            for (int i = 0; i < iFloor; i++) {
                str = str + "★";
            }
            while (iFloor < 3) {
                str = str + "☆";
                iFloor++;
            }
            return str;
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 2940247466745660423L, this, new Float(f2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1162578644291667524L)
    public c.j cn() {
        c.h hVarVH;
        try {
            if (we) {
                iy.gn(3760770434774392189L, this);
            }
            c.h hVarP8 = P8();
            c.b bVarJ3 = j3();
            for (int i = 0; i < hVarP8.gn(); i++) {
                c.h hVarVH2 = bVarJ3.VH(i);
                if (!this.j6.isLessonInProgress(hVarVH2) && I(hVarVH2)) {
                    return hVarVH2;
                }
            }
            int iGn = hVarP8.gn();
            do {
                iGn++;
                if (iGn >= bVarJ3.u7()) {
                    for (int i2 = 0; i2 < bVarJ3.u7(); i2++) {
                        c.h hVarVH3 = bVarJ3.VH(i2);
                        if (!this.j6.isLessonInProgress(hVarVH3)) {
                            return hVarVH3;
                        }
                    }
                    for (int i3 = 0; i3 < bVarJ3.u7(); i3++) {
                        c.h hVarVH4 = bVarJ3.VH(i3);
                        if (!this.j6.isLessonFinished(hVarVH4)) {
                            return hVarVH4;
                        }
                    }
                    return null;
                }
                hVarVH = bVarJ3.VH(iGn);
            } while (this.j6.isLessonInProgress(hVarVH));
            return hVarVH;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 3760770434774392189L, this);
            }
            throw th;
        }
    }

    @ey(method = -511561323811995993L)
    private String ei() {
        try {
            if (we) {
                iy.gn(-1620885679987033152L, this);
            }
            return "com.aide.trainer." + P8().Mr().FH();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -1620885679987033152L, this);
            }
            throw th;
        }
    }

    @ey(method = -3521431924428009680L)
    private void hz() {
        try {
            if (we) {
                iy.gn(4141044826135839311L, this);
            }
            new Handler().postDelayed(new a(), 1000L);
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 4141044826135839311L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2313669220249491624L)
    public void jJ() {
        try {
            if (we) {
                iy.gn(4879168149509644479L, this);
            }
            ServiceContainer.getMainActivity().q7();
            String str = "";
            if (this.j6.getCurrentExercise() == 0) {
                str = "" + P8().FH() + " ";
            }
            String str2 = str + Mr().Ws();
            if (this.j6.showHintForCurrentExercise()) {
                str2 = str2 + " " + Mr().u7();
            }
            String str3 = str2;
            String strVy = vy();
            String currentExerciseErrorText = this.j6.showErrorForCurrentExercise() ? this.j6.getCurrentExerciseErrorText() : null;
            String strU2 = U2();
            String strA8 = a8();
            int iDW = Mr().DW();
            ServiceContainer.getMainActivity().sh().cT(strU2, strVy, ((this.j6.getCurrentExercise() + 1) * 100) / Math.max(1, P8().j3()), this.j6.getCurrentExercise() == 0 && I(P8()), str3, strA8, this.j6.getCurrentExercise() == 0 && iDW < 0 && P8().j3() > 1, "😞", currentExerciseErrorText, iDW, !Mr().XL());
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 4879168149509644479L, this);
            }
            throw th;
        }
    }

    @ey(method = -5623905883337588057L)
    private void jO() {
        try {
            if (we) {
                iy.gn(6866023715509378368L, this);
            }
            ServiceContainer.getMainActivity().sh().postDelayed(new b(), 100L);
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 6866023715509378368L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 447866184427545492L)
    public void ko() {
        try {
            if (we) {
                iy.gn(4227960403382807L, this);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < Mr().we(); i++) {
                c.g gVarEQ = Mr().EQ(i);
                String strDW = gVarEQ.DW();
                String strU2 = this.DW.containsKey(strDW) ? this.DW.get(strDW) : U2();
                ServiceContainer.getMainActivity().sh().hK(strU2, gVarEQ.j6().replace("$package_name$", ei()).replace("$project_name$", P8().Mr().Hw()), "$code_hint$", "$code_hint_1$", "$code_hint_2$", "$code_hint_3$", "$code_hint_4$", "$code_hint_5$", "$code_hint_6$", "$code_hint_7$", "$code_hint_8$", "$code_hint_9$", "$code_hint_10$");
                arrayList.add(strU2);
            }
            if (arrayList.size() > 0) {
                ServiceContainer.getProjectService().et(arrayList, false);
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 4227960403382807L, this);
            }
            throw th;
        }
    }

    @ey(method = -4986074213398411525L)
    private String nw() {
        try {
            if (we) {
                iy.gn(2691158139821545312L, this);
            }
            return P8().EQ() + "  " + cb(this.j6.calculateLessonAverageFailures(P8()));
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 2691158139821545312L, this);
            }
            throw th;
        }
    }

    @ey(method = -403358679555141280L)
    private String sh(String str) {
        try {
            if (we) {
                iy.tp(-709389080740655985L, this, str);
            }
            return this.DW.containsKey(str) ? this.DW.get(str) : "";
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, -709389080740655985L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2593235869395911180L)
    private boolean tp() {
        String str;
        String str2;
        boolean z;
        try {
            if (we) {
                iy.gn(5011993959025152841L, this);
            }
            List<String> listQq = ServiceContainer.getOpenFileService().getOpenFileModel(U2()).Qq();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<String> it = listQq.iterator();
            while (true) {
                str = "\t";
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(it.next().replace(" ", "").replace("\t", ""));
            }
            int i = 0;
            while (i < Mr().v5()) {
                c.f fVarHw = Mr().Hw(i);
                String strReplace = fVarHw.j6().replace(" ", "").replace(str, "");
                int iHw = fVarHw.Hw();
                int iV5 = fVarHw.v5();
                int iDW = fVarHw.DW();
                int i2 = 0;
                int i3 = 1;
                for (String str3 : arrayList) {
                    if (str3.length() <= 0 || i3 < iV5 || i3 > iDW) {
                        str2 = str;
                    } else {
                        if (str3.contains(strReplace)) {
                            i2++;
                        } else if (strReplace.startsWith(str3)) {
                            String strSubstring = strReplace.substring(str3.length());
                            str2 = str;
                            for (int i4 = i3; i4 < arrayList.size(); i4++) {
                                String str4 = (String) arrayList.get(i4);
                                if (str4.length() != 0) {
                                    if (!str4.startsWith(strSubstring)) {
                                        if (!strSubstring.startsWith(str4)) {
                                            break;
                                        }
                                        String strSubstring2 = strSubstring.substring(str4.length());
                                        if (strSubstring2.length() != 0) {
                                            strSubstring = strSubstring2;
                                        }
                                    }
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                            if (z) {
                                i2++;
                            }
                        }
                        str2 = str;
                    }
                    i3++;
                    str = str2;
                }
                String str5 = str;
                if ((iHw == -1 && i2 == 0) || (iHw >= 0 && i2 != iHw)) {
                    Xa(Mr().VH(), fVarHw.FH());
                    return false;
                }
                i++;
                str = str5;
            }
            return true;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 5011993959025152841L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -127671971275522112L)
    public void wc() {
        try {
            if (we) {
                iy.gn(189199352777526875L, this);
            }
            try {
                ServiceContainer.getMainActivity().e3();
                c.i iVarMr = P8().Mr();
                String strKD = KD(P8());
                this.DW = new HashMap();
                InputStream inputStreamEr = this.EQ.er(iVarMr.Zo() + ".zip");
                this.DW.putAll(ServiceContainer.getTemplateService().DW(inputStreamEr, strKD, iVarMr.Hw(), ei(), iVarMr.j6()));
                inputStreamEr.close();
                if (iVarMr.DW().length() > 0) {
                    InputStream inputStreamEr2 = this.EQ.er(iVarMr.DW() + ".zip");
                    this.DW.putAll(ServiceContainer.getTemplateService().DW(inputStreamEr2, strKD, iVarMr.Hw(), ei(), iVarMr.j6()));
                    inputStreamEr2.close();
                }
                if (iVarMr.v5().length() > 0) {
                    strKD = strKD + "/" + iVarMr.v5();
                }
                ServiceContainer.getProjectService().kQ(strKD, false);
                Iterator<String> it = iVarMr.j6().iterator();
                while (it.hasNext()) {
                    ServiceContainer.getOpenFileService().lg(this.DW.get(it.next()), false);
                }
            } catch (Exception e2) {
                if (this.DW == null) {
                    this.DW = new HashMap();
                }
                MessageBox.BT(ServiceContainer.getMainActivity(), "Lesson error", e2.toString());
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 189199352777526875L, this);
            }
            throw th;
        }
    }

    @ey(method = -2727738265491766656L)
    public String BT() {
        try {
            if (we) {
                iy.gn(-5241255350026072251L, this);
            }
            if (Sf()) {
                return ServiceContainer.KD(u.trainer_continue, new Object[0]) + " ≫";
            }
            if (Sf()) {
                return ServiceContainer.KD(u.trainer_next_lesson, new Object[0]) + " ≫";
            }
            return ServiceContainer.KD(u.trainer_next_exercise, new Object[0]) + " ≫";
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -5241255350026072251L, this);
            }
            throw th;
        }
    }

    @ey(method = 2257839866360055280L)
    public boolean CU(String str) {
        try {
            if (we) {
                iy.tp(2841799028868229661L, this, str);
            }
            if (!Sf()) {
                if (!str.equals(ServiceContainer.ro().U2())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 2841799028868229661L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 5430276616033327728L)
    public void Eq() {
        try {
            if (we) {
                iy.gn(-1908818530852739697L, this);
            }
            Xa(com.aide.ui.trainer.c.yS(), ServiceContainer.KD(u.trainer_on_no_main, new Object[0]));
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -1908818530852739697L, this);
            }
            throw th;
        }
    }

    @ey(method = 1188653457776138820L)
    public void FN(c.j jVar, boolean z) {
        try {
            if (we) {
                iy.EQ(-2041320215581811985L, this, jVar, new Boolean(z));
            }
            if (z) {
                this.j6.restartLesson(jVar);
                try {
                    FileSystem.VH(KD(jVar));
                } catch (IOException unused) {
                }
            }
            if (!ServiceContainer.isTrainerMode()) {
                ServiceContainer.getMainActivity().yS(true, null, jVar);
                return;
            }
            if (jVar.DW().equals(this.EQ)) {
                this.j6.startLesson(jVar.Zo());
            } else {
                this.j6.startLesson(jVar.Zo());
                XG();
            }
            jO();
        } catch (Throwable th) {
            if (J0) {
                iy.Mr(th, -2041320215581811985L, this, jVar, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -445334583664387027L)
    public boolean I(c.j jVar) {
        Date dateU7;
        try {
            if (we) {
                iy.tp(-1991347426511714092L, this, jVar);
            }
            if (this.j6.isLessonFinished(jVar) || (dateU7 = jVar.u7()) == null) {
                return false;
            }
            return System.currentTimeMillis() - dateU7.getTime() < 5184000000L;
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, -1991347426511714092L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -2987751269373795344L)
    public List<c.d> J8() {
        try {
            if (we) {
                iy.gn(-184215730809000565L, this);
            }
            return this.tp.BT();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -184215730809000565L, this);
            }
            throw th;
        }
    }

    @ey(method = -1914907395911667760L)
    public c.e Mr() {
        try {
            if (we) {
                iy.gn(-4139394025199534303L, this);
            }
            return P8().aM(this.j6.getCurrentExercise());
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -4139394025199534303L, this);
            }
            throw th;
        }
    }

    @ey(method = 199342580191383496L)
    public boolean Mz() {
        try {
            if (we) {
                iy.gn(2744754385154578275L, this);
            }
            return P8().Mr().j6().size() > 1;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 2744754385154578275L, this);
            }
            throw th;
        }
    }

    @ey(method = 611973763490364833L)
    public void OW(String str, String str2) {
        try {
            if (we) {
                iy.EQ(432709067178279960L, this, str, str2);
            }
            ServiceContainer.nw().QX(str, str2, sh(ServiceContainer.ro().Mr().aM()));
        } catch (Throwable th) {
            if (J0) {
                iy.Mr(th, 432709067178279960L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 3376801941239009712L)
    public c.h P8() {
        try {
            if (we) {
                iy.gn(-427051127252647107L, this);
            }
            return j3().gn(this.j6.getCurrentLessonId());
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -427051127252647107L, this);
            }
            throw th;
        }
    }

    @ey(method = 2490527214934525143L)
    public String QX() {
        try {
            if (we) {
                iy.gn(4908212220172074576L, this);
            }
            return ServiceContainer.KD(u.trainer_press_back, new Object[0]) + " ↩";
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 4908212220172074576L, this);
            }
            throw th;
        }
    }

    @ey(method = -1432026296384388945L)
    public void Qq(String str) {
        try {
            if (we) {
                iy.tp(428199064196952320L, this, str);
            }
            if (AppPreferences.Ws()) {
                this.u7.Hw(com.aide.ui.trainer.c.yS(), str);
            }
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 428199064196952320L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3941412786910785085L)
    public c.d SI() {
        try {
            if (we) {
                iy.gn(137145965352559880L, this);
            }
            return XL(this.tp.U2());
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 137145965352559880L, this);
            }
            throw th;
        }
    }

    @ey(method = -448106532188593499L)
    public boolean Sf() {
        try {
            if (we) {
                iy.gn(-8013026565454679496L, this);
            }
            if (this.EQ != null) {
                if (this.j6.getCurrentExercise() >= P8().j3() - 1) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -8013026565454679496L, this);
            }
            throw th;
        }
    }

    @ey(method = -2992471485287282388L)
    public String U2() {
        try {
            if (we) {
                iy.gn(1813501239969789611L, this);
            }
            String strSh = sh(Mr().j6());
            return strSh.length() > 0 ? strSh : sh(P8().Mr().j6().get(0));
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 1813501239969789611L, this);
            }
            throw th;
        }
    }

    @ey(method = -2134918074917166616L)
    public String Ws() {
        try {
            if (we) {
                iy.gn(-1708248429602904117L, this);
            }
            try {
                PackageManager packageManager = ServiceContainer.getContext().getPackageManager();
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(ServiceContainer.getContext().getApplicationInfo().packageName, 0);
                return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "");
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -1708248429602904117L, this);
            }
            throw th;
        }
    }

    @ey(method = 273766603898288448L)
    public c.d XL(String str) {
        try {
            if (we) {
                iy.tp(-1203560506763507463L, this, str);
            }
            return this.tp.aM(str);
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, -1203560506763507463L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 5076677256319493816L)
    public String a8() {
        try {
            if (we) {
                iy.gn(-4601583008072817411L, this);
            }
            if (Sf()) {
                return ServiceContainer.KD(u.trainer_next_lesson, new Object[0]) + " ≫";
            }
            if (!ef()) {
                return ServiceContainer.KD(u.trainer_continue, new Object[0]) + " ≫";
            }
            String strKD = ServiceContainer.KD(u.trainer_run, new Object[0]);
            if (this.j6.getCurrentExercise() == 0 && AndroidHelper.XL(ServiceContainer.getContext())) {
                strKD = strKD + " (Ctrl+E)";
            }
            return strKD + " ►";
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -4601583008072817411L, this);
            }
            throw th;
        }
    }

    @ey(method = 2745996188266946088L)
    public String aM() {
        try {
            if (we) {
                iy.gn(940941469614118917L, this);
            }
            return this.tp.j3();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 940941469614118917L, this);
            }
            throw th;
        }
    }

    @ey(method = -4605601621054637280L)
    public void aj() {
        try {
            if (we) {
                iy.gn(-1672184826102862751L, this);
            }
            this.j6.restartLesson(P8());
            jO();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -1672184826102862751L, this);
            }
            throw th;
        }
    }

    @ey(method = 246207143567285973L)
    public void aq() {
        try {
            if (we) {
                iy.gn(-2270217884116641840L, this);
            }
            SoundPool soundPool = new SoundPool(1, 3, 0);
            this.FH = soundPool;
            this.Hw = soundPool.load(ServiceContainer.getContext(), t.fail, 1);
            this.v5 = this.FH.load(ServiceContainer.getContext(), t.success_task, 1);
            this.Zo = this.FH.load(ServiceContainer.getContext(), t.success_lesson, 1);
            this.VH = this.FH.load(ServiceContainer.getContext(), 2131492869, 1);
            this.gn = this.FH.load(ServiceContainer.getContext(), t.click, 1);
            hz();
            XG();
            wc();
            if (ServiceContainer.nw().Hw(ServiceContainer.getContext())) {
                return;
            }
            if (this.j6.getCurrentExercise() == 0) {
                ko();
            }
            if (AppPreferences.Ws()) {
                this.u7.Hw(Mr().VH(), Mr().Ws());
            }
            if (AppPreferences.J8()) {
                this.FH.play(this.VH, 1.0f, 1.0f, 0, 0, 1.0f);
            }
            XX(P8());
            jJ();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2270217884116641840L, this);
            }
            throw th;
        }
    }

    @ey(method = 2265792375320247136L)
    public void br() {
        try {
            if (we) {
                iy.gn(2446007655707915577L, this);
            }
            if (!Sf()) {
                we();
                return;
            }
            this.j6.runCurrentExercise();
            ServiceContainer.getOpenFileService().KD(false, false);
            ServiceContainer.getProjectService().buildProject(false);
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 2446007655707915577L, this);
            }
            throw th;
        }
    }

    @ey(method = -2937367228446215247L)
    public boolean dx() {
        try {
            if (we) {
                iy.gn(-5088538643881548856L, this);
            }
            Iterator<c.d> it = J8().iterator();
            while (it.hasNext()) {
                if (it.next().j3()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -5088538643881548856L, this);
            }
            throw th;
        }
    }

    @ey(method = -918758149416374652L)
    public boolean ef() {
        try {
            if (we) {
                iy.gn(819639436931847903L, this);
            }
            if (!Sf()) {
                if (Mr().j3()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 819639436931847903L, this);
            }
            throw th;
        }
    }

    @ey(method = 2956180057139388288L)
    public String er() {
        try {
            if (we) {
                iy.gn(193662543770432625L, this);
            }
            if (this.EQ == null) {
                return null;
            }
            if (!Sf() && !Mr().j3()) {
                return ServiceContainer.KD(u.trainer_continue, new Object[0]);
            }
            return ServiceContainer.KD(u.trainer_run, new Object[0]);
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 193662543770432625L, this);
            }
            throw th;
        }
    }

    @ey(method = 5679441545455243563L)
    public void et() {
        try {
            if (we) {
                iy.gn(-1705638444776746968L, this);
            }
            Xa(com.aide.ui.trainer.c.yS(), ServiceContainer.KD(u.trainer_on_build_errors, new Object[0]));
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -1705638444776746968L, this);
            }
            throw th;
        }
    }

    @ey(method = -2252889710382975711L)
    public boolean g3(c.j jVar) {
        try {
            if (we) {
                iy.tp(3805459124467457280L, this, jVar);
            }
            return this.j6.isLessonInProgress(jVar);
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 3805459124467457280L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -89293746320774213L)
    public String gW() {
        try {
            if (we) {
                iy.gn(-363189396013936128L, this);
            }
            return P8().Zo() + " " + this.j6.getCurrentExercise();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -363189396013936128L, this);
            }
            throw th;
        }
    }

    @ey(method = 6167263584115208955L)
    public c.b j3() {
        try {
            if (we) {
                iy.gn(2228772296004262476L, this);
            }
            return this.EQ;
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 2228772296004262476L, this);
            }
            throw th;
        }
    }

    @ey(method = -197839054562058000L)
    public void kQ(String str) {
        try {
            if (we) {
                iy.tp(188394424288661265L, this, str);
            }
            this.j6.startLesson(this.tp.a8(str));
            J0();
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 188394424288661265L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 364771226574286785L)
    public String lg() {
        try {
            if (we) {
                iy.gn(651315505720976280L, this);
            }
            return "≪ " + ServiceContainer.KD(u.trainer_try_again, new Object[0]);
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 651315505720976280L, this);
            }
            throw th;
        }
    }

    @ey(method = 5241643224382368888L)
    public void lp() {
        try {
            if (we) {
                iy.gn(-2683701402349358475L, this);
            }
            this.j6.retryCurrentExercise(Mr().gn());
            if (AppPreferences.J8()) {
                this.FH.play(this.VH, 1.0f, 1.0f, 0, 0, 1.0f);
            }
            jJ();
            EQ();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2683701402349358475L, this);
            }
            throw th;
        }
    }

    @ey(method = 863586878412816256L)
    public void oY() {
        try {
            if (we) {
                iy.gn(3409426862746623795L, this);
            }
            if (ca()) {
                TrainerCourseActivity.rN(ServiceContainer.getMainActivity());
                return;
            }
            boolean z = true;
            if (this.j6.getCurrentExercise() + 1 >= P8().j3()) {
                c.j jVarCn = cn();
                if (jVarCn == null) {
                    TrainerCourseActivity.rN(ServiceContainer.getMainActivity());
                    return;
                } else {
                    this.j6.startLesson(jVarCn.Zo());
                    jO();
                    return;
                }
            }
            if (!Mr().j3() && !Mr().XL()) {
                z = false;
            }
            this.j6.startNextExercise();
            if (Sf()) {
                this.j6.setLessonFinished(P8());
                c.j jVarCn2 = cn();
                if (jVarCn2 != null) {
                    XX(jVarCn2);
                }
            }
            if (AppPreferences.Ws()) {
                this.u7.Hw(Mr().VH(), Mr().Ws());
            }
            if (AppPreferences.J8()) {
                if (Sf()) {
                    this.FH.play(this.Zo, 1.0f, 1.0f, 0, 0, 1.0f);
                } else if (z) {
                    this.FH.play(this.VH, 1.0f, 1.0f, 0, 0, 1.0f);
                } else {
                    this.FH.play(this.v5, 1.0f, 1.0f, 0, 0, 1.0f);
                }
            }
            ko();
            jJ();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 3409426862746623795L, this);
            }
            throw th;
        }
    }

    @ey(method = 1581233601593040987L)
    public String rN() {
        try {
            if (!we) {
                return "😞";
            }
            iy.gn(-1419473463707388100L, this);
            return "😞";
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -1419473463707388100L, this);
            }
            throw th;
        }
    }

    @ey(method = -889585328613374301L)
    public String ro(c.j jVar) {
        try {
            if (we) {
                iy.tp(2291013002263669848L, this, jVar);
            }
            return cb(this.j6.getLessonAverageFailures(jVar));
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 2291013002263669848L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -188604943517021875L)
    public void sG() {
        try {
            if (we) {
                iy.gn(-2458703979415657192L, this);
            }
            this.tp = new com.aide.ui.trainer.c();
            this.j6 = new TrainerState();
            J0();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -2458703979415657192L, this);
            }
            throw th;
        }
    }

    @ey(method = -1540021918273316928L)
    public void sy() {
        try {
            if (we) {
                iy.gn(-1144511033390155389L, this);
            }
            if (AppPreferences.J8()) {
                this.FH.play(this.v5, 1.0f, 1.0f, 0, 0, 1.0f);
            }
            if (AppPreferences.Ws()) {
                this.u7.Hw(Mr().VH(), Mr().J8());
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -1144511033390155389L, this);
            }
            throw th;
        }
    }

    @ey(method = 5967818417253599335L)
    public boolean vJ(c.j jVar) {
        try {
            if (we) {
                iy.tp(5052514771073882420L, this, jVar);
            }
            return this.j6.isLessonFinished(jVar);
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 5052514771073882420L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = 4773970799793840L)
    public String vy() {
        try {
            if (we) {
                iy.gn(182088758479582395L, this);
            }
            return (!Sf() || P8().j3() <= 1) ? P8().EQ() : nw();
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 182088758479582395L, this);
            }
            throw th;
        }
    }

    @ey(method = 6754356254295107808L)
    public void we() {
        try {
            if (we) {
                iy.gn(2765494414872263767L, this);
            }
            ServiceContainer.getOpenFileService().ei(!ef());
            if (tp()) {
                if (Mr().XL() && ServiceContainer.getMainActivity().sh().oY(U2())) {
                    Xa(com.aide.ui.trainer.c.yS(), ServiceContainer.KD(u.trainer_on_arrow_pending, new Object[0]));
                    return;
                }
                if (ef()) {
                    FireBaseLogEvent.tp("Exercise was run: " + ServiceContainer.ro().gW());
                    this.j6.runCurrentExercise();
                    ServiceContainer.getOpenFileService().KD(false, false);
                    ServiceContainer.getProjectService().buildProject(false);
                    return;
                }
                if (ca()) {
                    ServiceContainer.getLicenseService().sh(ServiceContainer.getMainActivity(), 14, u.shop_feature_lessons_and_updates, "continueToNextLessonInCourse:" + j3().v5(), false);
                    return;
                }
                if (this.j6.getCurrentExercise() + 1 >= P8().j3() && P8().J0() && !this.j6.exerciseHasRun()) {
                    MessageBox.er(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.trainer_next_lesson, new Object[0]), ServiceContainer.KD(u.trainer_next_lesson_no_changes_message, new Object[0]), new d(), null, null);
                    return;
                }
                if (this.j6.getCurrentExercise() + 1 >= P8().j3() && P8().J8() && !AndroidHelper.er() && !AndroidHelper.U2(ServiceContainer.getContext())) {
                    ServiceContainer.getMainActivity().sM(ServiceContainer.KD(u.trainer_rate_title, new Object[0]), ServiceContainer.KD(u.trainer_rate_message, new Object[0]), new e());
                    return;
                }
                if (this.j6.getCurrentExercise() + 1 < P8().j3() || !P8().Ws() || AndroidHelper.U2(ServiceContainer.getContext())) {
                    oY();
                    return;
                }
                SocialDialog.Sf(ServiceContainer.getMainActivity(), ServiceContainer.KD(u.trainer_share_title, new Object[0]), ServiceContainer.getContext().getResources().getString(u.trainer_share_message, P8().DW().rN(), Ws()), "https://play.google.com/store/apps/details?id=" + ServiceContainer.P8, new f());
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 2765494414872263767L, this);
            }
            throw th;
        }
    }

    @ey(method = 3479178446605177008L)
    public void x9() {
        try {
            if (we) {
                iy.gn(-5526928088599104513L, this);
            }
            if (AppPreferences.J8()) {
                this.FH.play(this.gn, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, -5526928088599104513L, this);
            }
            throw th;
        }
    }

    @ey(method = 235278217352539179L)
    public void yO(c.j jVar) {
        try {
            if (we) {
                iy.tp(461916871079086320L, this, jVar);
            }
            this.j6.startLesson(jVar.Zo());
        } catch (Throwable th) {
            if (J0) {
                iy.j3(th, 461916871079086320L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = 6357259659255101180L)
    public String yS() {
        try {
            if (!we) {
                return "😃";
            }
            iy.gn(4685608623446748529L, this);
            return "😃";
        } catch (Throwable th) {
            if (J0) {
                iy.aM(th, 4685608623446748529L, this);
            }
            throw th;
        }
    }
}
