package com.aide.appwizard;

import abcd.b0;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.aide.appwizard.runtime.AppWizardActivity;
import com.aide.appwizard.runtime.a;
import com.aide.common.MessageBox;
import com.aide.common.PositionalXMLReader;
import com.aide.common.UndoManager;
import com.aide.ui.R$drawable;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import org.w3c.dom.Document;

@cy(clazz = 2913940607094183125L, container = 2913940607094183125L, user = true)
/* loaded from: classes.dex */
public class AppWizardDesignActivity extends AppWizardActivity implements UndoManager.UndoManagerListener {

    @fy
    private static /* synthetic */ boolean Cz;

    @gy
    private static /* synthetic */ boolean pN;

    @dy(field = -5352084308253688415L)
    private boolean Gj;

    @dy(field = 2620692931698923016L)
    private UndoManager fN;

    @dy(field = -2805678668597169024L)
    private com.aide.appwizard.b pO;

    @cy(clazz = -4801814684376965056L, container = 2913940607094183125L, user = true)
    class a implements b0 {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 7136825462466736972L)
        a() {
        }

        @Override // abcd.b0
        @ey(method = -3324814486123950112L)
        public boolean j6() {
            try {
                if (!DW) {
                    return false;
                }
                iy.gn(1673752280636212352L, this);
                return false;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1673752280636212352L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4801949061737521743L, container = 2913940607094183125L, user = true)
    class b implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -2234109419033829575L)
        b() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 422404864575850176L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-535812570207302256L, this, view);
                }
                AppWizardDesignActivity.this.ca(!AppWizardDesignActivity.this.Sf());
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -535812570207302256L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4802083439094015136L, container = 2913940607094183125L, user = true)
    class c implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -283979437671156387L)
        c() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 14354448739887104L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(2460680848828416799L, this, view);
                }
                AppWizardDesignActivity.this.pO.J0();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 2460680848828416799L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4802217816446445235L, container = 2913940607094183125L, user = true)
    class d implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 510327360212239080L)
        d() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 377310466869491751L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-4885714396996637904L, this, view);
                }
                AppWizardDesignActivity.this.fN.J0();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -4885714396996637904L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4802352193794812040L, container = 2913940607094183125L, user = true)
    class e implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -1932855428942483496L)
        e() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -439761975688092461L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-1888234660882102845L, this, view);
                }
                AppWizardDesignActivity.this.fN.tp();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -1888234660882102845L, this, view);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AppWizardDesignActivity.class);
    }

    @ey(method = -1945652336250590772L)
    public AppWizardDesignActivity() {
        try {
            if (Cz) {
                iy.gn(-6904562788031962339L, null);
            }
            this.pO = new com.aide.appwizard.b(this);
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, -6904562788031962339L, null);
            }
            throw th;
        }
    }

    @ey(method = 2102742534531679011L)
    private void I() {
        try {
            if (Cz) {
                iy.gn(2597880133305324571L, this);
            }
            g3();
            findViewById(q.appwizardModeButton).setOnClickListener(new b());
            findViewById(q.appwizardEditButton).setOnClickListener(new c());
            findViewById(q.appwizardUndoButton).setOnClickListener(new d());
            findViewById(q.appwizardRedoButton).setOnClickListener(new e());
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 2597880133305324571L, this);
            }
            throw th;
        }
    }

    @ey(method = -914337038102759600L)
    private void Mz(String str) {
        try {
            if (Cz) {
                iy.tp(-377184259200432992L, this, str);
            }
            FileWriter fileWriter = new FileWriter(cb());
            fileWriter.write(str);
            fileWriter.close();
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, -377184259200432992L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -796916692242759036L)
    public void ca(boolean z) {
        try {
            if (Cz) {
                iy.Ws(-596202950687543532L, this, z);
            }
            SharedPreferences.Editor editorEdit = getSharedPreferences("AppWizard", 0).edit();
            editorEdit.putBoolean("PREF_APPWIZARD_EDITMODE", z);
            editorEdit.commit();
            for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                if (fragment instanceof com.aide.appwizard.a) {
                    ((com.aide.appwizard.a) fragment).oa();
                }
            }
            g3();
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, -596202950687543532L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4106308932470283168L)
    private String cb() {
        try {
            if (Cz) {
                iy.gn(168272603472369888L, this);
            }
            return dx() + "/assets/app.xml";
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 168272603472369888L, this);
            }
            throw th;
        }
    }

    @ey(method = 1624984027671534292L)
    private void g3() {
        try {
            if (Cz) {
                iy.gn(-2205098022962184540L, this);
            }
            ImageView imageView = (ImageView) findViewById(q.appwizardModeButton);
            if (Sf()) {
                imageView.setImageResource(R$drawable.ic_menu_edit);
            } else {
                imageView.setImageResource(R$drawable.ic_menu_view);
            }
            findViewById(q.appwizardEditButtonLayout).setVisibility(Sf() ? 0 : 8);
            findViewById(q.appwizardUndoButton).setEnabled(this.fN.v5());
            findViewById(q.appwizardRedoButton).setEnabled(this.fN.Hw());
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, -2205098022962184540L, this);
            }
            throw th;
        }
    }

    @ey(method = 250922864455321960L)
    private Document vJ(String str) {
        try {
            if (Cz) {
                iy.tp(-707556527892343976L, this, str);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
            Document documentJ6 = PositionalXMLReader.j6(byteArrayInputStream);
            byteArrayInputStream.close();
            return documentJ6;
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, -707556527892343976L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.common.UndoManager.UndoManagerListener
    @ey(method = 1241085256435572541L)
    public void FH() {
        try {
            if (Cz) {
                iy.gn(264662972645095557L, this);
            }
            if (this.Gj) {
                g3();
            }
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 264662972645095557L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.common.UndoManager.UndoManagerListener
    @ey(method = -2460222866640314568L)
    public void Hw(String str, String str2, int i) {
        try {
            if (Cz) {
                iy.we(3682180538294556312L, this, str, str2, new Integer(i));
            }
            if (str.equals(cb())) {
                try {
                    Mz(str2);
                    lg().u7(vJ(str2), i);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            if (pN) {
                iy.U2(th, 3682180538294556312L, this, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.appwizard.runtime.AppWizardActivity
    @ey(method = 691631376643698848L)
    protected Fragment Mr(a.d dVar) {
        try {
            if (Cz) {
                iy.tp(6502358185241633248L, this, dVar);
            }
            return com.aide.appwizard.a.ce(dVar);
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, 6502358185241633248L, this, dVar);
            }
            throw th;
        }
    }

    @Override // com.aide.appwizard.runtime.AppWizardActivity
    @ey(method = 3098058398552670469L)
    protected Document P8() {
        try {
            if (Cz) {
                iy.gn(2461068550482008733L, this);
            }
            try {
                String strDW = com.aide.appwizard.d.DW(cb());
                this.fN.j6(cb(), strDW, 0);
                return vJ(strDW);
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 2461068550482008733L, this);
            }
            throw th;
        }
    }

    @ey(method = 1915209735107921795L)
    public boolean Sf() {
        try {
            if (Cz) {
                iy.gn(-641302897837442405L, this);
            }
            return getSharedPreferences("AppWizard", 0).getBoolean("PREF_APPWIZARD_EDITMODE", true);
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, -641302897837442405L, this);
            }
            throw th;
        }
    }

    @ey(method = -167820455908821135L)
    public String cn(int i) {
        try {
            if (Cz) {
                iy.u7(-8245276577243568135L, this, i);
            }
            String str = "fragment" + (i + 1);
            U2().FH(i).Zo(str);
            return sh(str);
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, -8245276577243568135L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3822802288254716592L)
    public String dx() {
        try {
            if (Cz) {
                iy.gn(3608242947054295088L, this);
            }
            return com.aide.appwizard.d.j6() + "/AppProjects/AppWizard";
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 3608242947054295088L, this);
            }
            throw th;
        }
    }

    @ey(method = -3399473577515648679L)
    public UndoManager ef() {
        try {
            if (Cz) {
                iy.gn(3962180854406689681L, this);
            }
            return this.fN;
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 3962180854406689681L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.appwizard.runtime.AppWizardActivity
    @ey(method = 3110427397730377004L)
    public void ei() {
        try {
            if (Cz) {
                iy.gn(-836416611662812612L, this);
            }
            super.ei();
            this.Gj = true;
            I();
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, -836416611662812612L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.appwizard.runtime.AppWizardActivity
    @ey(method = -970430955756054336L)
    protected void nw(Document document, int i) {
        try {
            if (Cz) {
                iy.EQ(29282458577692672L, this, document, new Integer(i));
            }
            try {
                String strDW = new com.aide.appwizard.c().DW(document);
                this.fN.FH(cb(), strDW, i);
                new File(cb()).getParentFile().mkdirs();
                Mz(strDW);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            if (pN) {
                iy.Mr(th, 29282458577692672L, this, document, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.appwizard.runtime.AppWizardActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @ey(method = 604787746086475155L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (Cz) {
                iy.tp(396469608976986363L, this, bundle);
            }
            Log.d(getPackageName(), "onCreate()");
            if (!FireBaseLogEvent.gn()) {
                FireBaseLogEvent.Zo(this, new a());
            }
            UndoManager undoManager = new UndoManager();
            this.fN = undoManager;
            undoManager.DW(this);
            if (bundle != null) {
                this.fN.u7(bundle);
            }
            super.onCreate(bundle);
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, 396469608976986363L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 1056534037715966656L)
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        try {
            if (Cz) {
                iy.EQ(-1250959508217015936L, this, new Integer(i), bundle);
            }
            return MessageBox.Zo(this, i);
        } catch (Throwable th) {
            if (pN) {
                iy.Mr(th, -1250959508217015936L, this, new Integer(i), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 7225347498023333343L)
    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (!Cz) {
                return true;
            }
            iy.tp(4377392057228154327L, this, menu);
            return true;
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, 4377392057228154327L, this, menu);
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @ey(method = 2647583274613300205L)
    protected void onDestroy() {
        try {
            if (Cz) {
                iy.gn(-1804378661955014315L, this);
            }
            super.onDestroy();
            if (this.fN != null) {
                this.fN.EQ(this);
            }
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, -1804378661955014315L, this);
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @ey(method = -1731010988790436612L)
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (Cz) {
                iy.tp(5908860950119534476L, this, bundle);
            }
            super.onSaveInstanceState(bundle);
            if (this.fN != null) {
                this.fN.we(bundle);
            }
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, 5908860950119534476L, this, bundle);
            }
            throw th;
        }
    }

    @ey(method = -3716057685719025900L)
    public String sG() {
        try {
            if (Cz) {
                iy.gn(4545960354605069604L, this);
            }
            return dx() + "/res";
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 4545960354605069604L, this);
            }
            throw th;
        }
    }

    @ey(method = -4650927501601125451L)
    public String sh(String str) {
        try {
            if (Cz) {
                iy.tp(-6130386242084568387L, this, str);
            }
            if (str == null) {
                return null;
            }
            return sG() + "/layout/" + str + ".xml";
        } catch (Throwable th) {
            if (pN) {
                iy.j3(th, -6130386242084568387L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.appwizard.runtime.AppWizardActivity
    @ey(method = -6095803384248157827L)
    protected int yS() {
        try {
            if (Cz) {
                iy.gn(4667213631028605525L, this);
            }
            setContentView(r.appwizard);
            return q.appwizardContentContainer;
        } catch (Throwable th) {
            if (pN) {
                iy.aM(th, 4667213631028605525L, this);
            }
            throw th;
        }
    }
}
