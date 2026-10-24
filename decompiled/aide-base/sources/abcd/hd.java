package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.aide.common.MessageBox;
import com.aide.ui.q;
import com.aide.ui.r;

@cy(clazz = 1036993532042931165L, container = 1036993532042931165L, user = true)
/* loaded from: classes.dex */
public abstract class hd extends MessageBox {

    @gy
    private static /* synthetic */ boolean AL;

    @fy
    private static /* synthetic */ boolean zh;

    @dy(field = 541996511108614871L)
    private AlertDialog k2;

    @cy(clazz = 2744030454584764760L, container = 1036993532042931165L, user = true)
    class a implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -19497298662471840L)
        public a(hd hdVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 697514431740438015L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (WB) {
                    iy.EQ(2060005827454490201L, this, dialogInterface, new Integer(i));
                }
                dialogInterface.dismiss();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, 2060005827454490201L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2744137600487339769L, container = 1036993532042931165L, user = true)
    class b implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 61696500764186080L)
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -314247248302305681L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(937938650939185280L, this, dialogInterface, new Integer(i));
                }
                hd.this.cn();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 937938650939185280L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2744244746393978072L, container = 1036993532042931165L, user = true)
    class c implements DialogInterface.OnDismissListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -47691615085627319L)
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @ey(method = 870526715195998315L)
        public void onDismiss(DialogInterface dialogInterface) {
            try {
                if (mb) {
                    iy.tp(-609637873835135541L, this, dialogInterface);
                }
                hd.this.Mz();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -609637873835135541L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2744351892304679669L, container = 1036993532042931165L, user = true)
    class d implements DialogInterface.OnShowListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -62912492357840377L)
        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        @ey(method = 325787052919003000L)
        public void onShow(DialogInterface dialogInterface) {
            try {
                if (DW) {
                    iy.tp(1571946128870473008L, this, dialogInterface);
                }
                hd.this.I();
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1571946128870473008L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(hd.class);
    }

    @ey(method = 2505746025241112216L)
    public hd() {
        try {
            if (zh) {
                iy.gn(4072164298204361624L, null);
            }
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 4072164298204361624L, null);
            }
            throw th;
        }
    }

    @ey(method = 661178770536766288L)
    private TextView cb(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(-33907395936756600L, this, alertDialog);
            }
            return (TextView) alertDialog.findViewById(q.progressdialogLabel);
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -33907395936756600L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = 2254871941261464476L)
    private ProgressBar sG(AlertDialog alertDialog) {
        try {
            if (zh) {
                iy.tp(-3708215645801724120L, this, alertDialog);
            }
            return (ProgressBar) alertDialog.findViewById(q.progressdialogProgress);
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -3708215645801724120L, this, alertDialog);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 3142682422207548855L)
    public Dialog Hw(Activity activity) {
        try {
            if (zh) {
                iy.tp(-1649244012632306243L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.progressdialog, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(vJ()).setView(viewInflate).setCancelable(true).setPositiveButton("Hide", new a(this));
            if (ro()) {
                builder.setNegativeButton("Cancel", new b());
            }
            AlertDialog alertDialogCreate = builder.create();
            this.k2 = alertDialogCreate;
            alertDialogCreate.setOnDismissListener(new c());
            g3();
            this.k2.setOnShowListener(new d());
            this.k2.getWindow().addFlags(128);
            return this.k2;
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -1649244012632306243L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = -6169156859712083020L)
    public void I() {
        try {
            if (zh) {
                iy.gn(4801251501855156192L, this);
            }
            if (!ca()) {
                this.k2.dismiss();
                return;
            }
            int iDx = dx();
            int iEf = ef();
            String strSf = Sf();
            if (iEf > 0 && iEf < 100) {
                strSf = strSf + " (" + iEf + "%)";
            }
            sG(this.k2).setProgress(iDx);
            sG(this.k2).setSecondaryProgress(iEf);
            cb(this.k2).setText(strSf);
            this.k2.setTitle(vJ());
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 4801251501855156192L, this);
            }
            throw th;
        }
    }

    @ey(method = -987421027844378304L)
    public abstract void Mz();

    @ey(method = -3552060126994754760L)
    public abstract String Sf();

    @ey(method = -3314190380363204580L)
    public abstract boolean ca();

    @ey(method = 2562606939046443016L)
    public abstract void cn();

    @ey(method = -6990023630759923712L)
    public abstract int dx();

    @ey(method = -3185026398340066979L)
    public abstract int ef();

    @ey(method = 3929029883450632713L)
    public abstract void g3();

    @ey(method = -3345307274379712060L)
    public abstract boolean ro();

    @ey(method = 2151145080175197632L)
    public void sh() {
        try {
            if (zh) {
                iy.gn(1335807209470220700L, this);
            }
            this.k2.dismiss();
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, 1335807209470220700L, this);
            }
            throw th;
        }
    }

    @ey(method = 589083715881062889L)
    public abstract String vJ();
}
