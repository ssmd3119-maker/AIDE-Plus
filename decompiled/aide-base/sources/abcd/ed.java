package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.util.FileSystem;
import java.math.BigInteger;
import java.util.Date;

@cy(clazz = 570958555126909067L, container = 570958555126909067L, user = true)
/* loaded from: classes.dex */
public class ed extends MessageBox {

    @gy
    private static /* synthetic */ boolean cT;

    @fy
    private static /* synthetic */ boolean hK;

    @dy(field = 3714767747166659601L)
    private String AL;

    @dy(field = 1646899450280302640L)
    private f k2;

    @dy(field = -3097312497375352368L)
    private String w9;

    @dy(field = 1663393257271961853L)
    private CharSequence zh;

    @cy(clazz = -1001190433478586060L, container = 570958555126909067L, user = true)
    class a implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -2253286754768567L)
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 1166013514265621792L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(4496062484576932245L, this, dialogInterface, new Integer(i));
                }
                ed.this.cb((AlertDialog) dialogInterface);
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 4496062484576932245L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1001231289257012165L, container = 570958555126909067L, user = true)
    class b implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -2057860666774112675L)
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -643073885385984712L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(-4430016259632820416L, this, dialogInterface, new Integer(i));
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                ed.this.cb(alertDialog);
                alertDialog.dismiss();
                ed.this.dx(alertDialog);
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -4430016259632820416L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1001272145031374976L, container = 570958555126909067L, user = true)
    class c implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3214458166590229611L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -6549398167251551180L)
        public c(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = 1222824869806364000L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(2842193290996268860L, this, editable);
                }
                ed.this.CU(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 2842193290996268860L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -2578553028620490291L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(2623127580529148979L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 2623127580529148979L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -345234445527039205L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-2238812188043829255L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -2238812188043829255L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1001313000801674493L, container = 570958555126909067L, user = true)
    class d implements DialogInterface.OnShowListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -5309792208124551L)
        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        @ey(method = -169254180579570520L)
        public void onShow(DialogInterface dialogInterface) {
            try {
                if (DW) {
                    iy.tp(1632029268654760989L, this, dialogInterface);
                }
                ed.this.CU((AlertDialog) dialogInterface);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1632029268654760989L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1001353856567910716L, container = 570958555126909067L, user = true)
    class e implements Runnable {

        @fy
        private static /* synthetic */ boolean Q6;

        @gy
        private static /* synthetic */ boolean kf;

        @dy(field = 1612823756637125249L)
        final /* synthetic */ String AL;

        @dy(field = 1617699428476221675L)
        final /* synthetic */ String WB;

        @dy(field = -1617187880646070112L)
        final /* synthetic */ String Z1;

        @dy(field = 3727264218226119663L)
        final /* synthetic */ String cT;

        @dy(field = 3181263434361540655L)
        final /* synthetic */ String fY;

        @dy(field = 94359651321860244L)
        final /* synthetic */ String hK;

        @dy(field = 1397271130564230012L)
        final /* synthetic */ String jw;

        @dy(field = -5155555506653118699L)
        final /* synthetic */ Date k2;

        @dy(field = 2114902121509741811L)
        final /* synthetic */ String mb;

        @dy(field = 2452000729552780245L)
        final /* synthetic */ String q7;

        @dy(field = 2161209834929283768L)
        final /* synthetic */ Date qp;

        @dy(field = -3251464160090141555L)
        final /* synthetic */ String w9;

        @dy(field = -1936101026843442633L)
        final /* synthetic */ BigInteger zh;

        @cy(clazz = 3172324934362683971L, container = 570958555126909067L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -138186303359097345L)
            final /* synthetic */ boolean WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 3705365440965431616L)
            public a(boolean z) {
                this.WB = z;
            }

            @Override // java.lang.Runnable
            @ey(method = 274293329890145500L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(7928225560053656088L, this);
                    }
                    ed.this.k2.j6(this.WB, e.this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 7928225560053656088L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        @ey(method = -8101933413119601007L)
        public e(String str, String str2, String str3, String str4, Date date, Date date2, BigInteger bigInteger, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.WB = str;
            this.mb = str2;
            this.jw = str3;
            this.fY = str4;
            this.qp = date;
            this.k2 = date2;
            this.zh = bigInteger;
            this.AL = str5;
            this.w9 = str6;
            this.hK = str7;
            this.cT = str8;
            this.q7 = str9;
            this.Z1 = str10;
        }

        @Override // java.lang.Runnable
        @ey(method = 1501367121222623483L)
        public void run() {
            try {
                if (Q6) {
                    iy.gn(7923873369785754519L, this);
                }
                ServiceContainer.aj(new a(ServiceContainer.j3().Hw(this.WB, this.mb, this.jw, this.fY, this.qp, this.k2, this.zh, this.AL, this.w9, this.hK, this.cT, this.q7, this.Z1)));
            } catch (Throwable th) {
                if (kf) {
                    iy.aM(th, 7923873369785754519L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2294193229046344800L, container = 2294193229046344800L, user = true)
    public interface f {
        @ey(method = -1499086120344410539L)
        void j6(boolean z, String str);
    }

    static {
        iy.Zo(ed.class);
    }

    @ey(method = -218181820258587389L)
    public ed(String str, String str2, String str3, f fVar) {
        try {
            if (hK) {
                iy.J0(-58103162200349085L, null, str, str2, str3, fVar);
            }
            this.zh = str;
            this.w9 = str2;
            this.AL = str3;
            this.k2 = fVar;
        } catch (Throwable th) {
            if (cT) {
                iy.a8(th, -58103162200349085L, null, str, str2, str3, fVar);
            }
            throw th;
        }
    }

    @ey(method = 588842031307012704L)
    private String I(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(1232354463437978600L, this, alertDialog);
            }
            return ca(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 1232354463437978600L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 2886593429845302861L)
    private EditText Mz(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(3106608217135157805L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreLocation);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 3106608217135157805L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 3366550914960961752L)
    private String OW(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-647006229061864208L, this, alertDialog);
            }
            return br(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -647006229061864208L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2970835056011249893L)
    private EditText Qq(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-3173741928503173101L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreOrganization);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -3173741928503173101L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 518173262568870417L)
    private String Sf(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-594061320860409207L, this, alertDialog);
            }
            return vJ(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -594061320860409207L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -822389887291286556L)
    private String XG(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(112449284067021700L, this, alertDialog);
            }
            return jJ(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 112449284067021700L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 5538169492134630813L)
    private EditText XX(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-3539060210161209411L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystorePassword);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -3539060210161209411L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 2769040807497675256L)
    private EditText aj(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-768590386549048032L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreOrganizationalUnit);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -768590386549048032L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -3483383981477383305L)
    private EditText br(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(2381288683859117063L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystorePassword2);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 2381288683859117063L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2385989018343730425L)
    private EditText ca(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-954561341241826065L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreName);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -954561341241826065L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 6889585926751959904L)
    public void cb(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-2921395968523535616L, this, alertDialog);
            }
            InputMethodManager inputMethodManager = (InputMethodManager) alertDialog.getContext().getSystemService("input_method");
            inputMethodManager.hideSoftInputFromWindow(yO(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(ef(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(XX(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(br(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(et(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(ca(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(aj(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(Qq(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(Mz(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(jJ(alertDialog).getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(vJ(alertDialog).getWindowToken(), 0);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -2921395968523535616L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1427299092932691195L)
    public void dx(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(1327163876020088477L, this, alertDialog);
            }
            String strKQ = kQ(alertDialog);
            BigInteger bigInteger = BigInteger.ONE;
            ServiceContainer.aj(new e(strKQ, lp(alertDialog), sG(alertDialog), lp(alertDialog), new Date(), new Date(System.currentTimeMillis() + (wc(alertDialog) * 31536000000L)), bigInteger, I(alertDialog), x9(alertDialog), sy(alertDialog), g3(alertDialog), XG(alertDialog), Sf(alertDialog)));
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 1327163876020088477L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 46347621939896660L)
    private EditText ef(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(1917094992085727348L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreAlias);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 1917094992085727348L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -1846300353548245272L)
    private EditText et(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-403346432161697728L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreValidity);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -403346432161697728L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 1313307645035191148L)
    private String g3(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(1148106482757580012L, this, alertDialog);
            }
            return Mz(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 1148106482757580012L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2253710304931857511L)
    private EditText jJ(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(533699287818600881L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreState);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 533699287818600881L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 15549895966954180L)
    private String kQ(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-5122548082567647564L, this, alertDialog);
            }
            return yO(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -5122548082567647564L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 680720132582765184L)
    private String lp(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(813534989046649408L, this, alertDialog);
            }
            return XX(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 813534989046649408L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -1051873170851904687L)
    private String sG(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(39354419913805817L, this, alertDialog);
            }
            return ef(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 39354419913805817L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 40081365516300291L)
    private String sy(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-1580144667537984053L, this, alertDialog);
            }
            return aj(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -1580144667537984053L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -1695426915671515776L)
    private EditText vJ(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(1205083892986867056L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystoreCountry);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 1205083892986867056L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 2752373511361579575L)
    private int wc(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-1700181441206012625L, this, alertDialog);
            }
            try {
                return Integer.parseInt(et(alertDialog).getText().toString().trim());
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -1700181441206012625L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -3080236751416757776L)
    private String x9(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-1316555455924435320L, this, alertDialog);
            }
            return Qq(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -1316555455924435320L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2320893560256460623L)
    private EditText yO(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(-922651158293970687L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.createkeystorePath);
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, -922651158293970687L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 386151563015636465L)
    public void CU(AlertDialog alertDialog) {
        try {
            if (hK) {
                iy.tp(2639250644443242777L, this, alertDialog);
            }
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                String strKQ = kQ(alertDialog);
                button.setEnabled(FileSystem.vJ(strKQ) && !FileSystem.exists(strKQ) && I(alertDialog).length() > 0 && wc(alertDialog) >= 20 && sG(alertDialog).length() > 0 && lp(alertDialog).length() >= 2 && lp(alertDialog).equals(OW(alertDialog)));
            }
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 2639250644443242777L, this, alertDialog);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = -2781519187215238224L)
    public Dialog Hw(Activity activity) {
        try {
            if (hK) {
                iy.tp(1979613089118669400L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.createkeystore, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("Create keystore").setView(viewInflate).setCancelable(true).setPositiveButton("Create", new b()).setNegativeButton("Cancel", new a());
            AlertDialog alertDialogCreate = builder.create();
            c cVar = new c(alertDialogCreate);
            EditText editText = (EditText) viewInflate.findViewById(q.createkeystorePath);
            editText.addTextChangedListener(cVar);
            EditText editText2 = (EditText) viewInflate.findViewById(q.createkeystoreAlias);
            editText2.addTextChangedListener(cVar);
            EditText editText3 = (EditText) viewInflate.findViewById(q.createkeystorePassword);
            editText3.addTextChangedListener(cVar);
            EditText editText4 = (EditText) viewInflate.findViewById(q.createkeystorePassword2);
            editText4.addTextChangedListener(cVar);
            ((EditText) viewInflate.findViewById(q.createkeystoreValidity)).addTextChangedListener(cVar);
            ((EditText) viewInflate.findViewById(q.createkeystoreName)).addTextChangedListener(cVar);
            ((EditText) viewInflate.findViewById(q.createkeystoreOrganizationalUnit)).addTextChangedListener(cVar);
            ((EditText) viewInflate.findViewById(q.createkeystoreOrganization)).addTextChangedListener(cVar);
            ((EditText) viewInflate.findViewById(q.createkeystoreState)).addTextChangedListener(cVar);
            ((EditText) viewInflate.findViewById(q.createkeystoreLocation)).addTextChangedListener(cVar);
            ((EditText) viewInflate.findViewById(q.createkeystoreCountry)).addTextChangedListener(cVar);
            editText.setText(this.zh);
            editText2.setText(this.w9);
            editText3.setText(this.AL);
            editText4.setText(this.AL);
            alertDialogCreate.setOnShowListener(new d());
            return alertDialogCreate;
        } catch (Throwable th) {
            if (cT) {
                iy.j3(th, 1979613089118669400L, this, activity);
            }
            throw th;
        }
    }
}
