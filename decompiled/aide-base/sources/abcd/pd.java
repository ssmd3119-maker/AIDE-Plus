package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Html;
import android.text.Spanned;
import android.widget.ScrollView;
import android.widget.TextView;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;

@cy(clazz = 1714930153382168671L, container = 1714930153382168671L, user = true)
/* loaded from: classes.dex */
public class pd extends MessageBox {

    @gy
    private static /* synthetic */ boolean AL;

    @fy
    private static /* synthetic */ boolean zh;

    @dy(field = -3007542551360420601L)
    private AlertDialog k2;

    @cy(clazz = 5124728394453010112L, container = 1714930153382168671L, user = true)
    class a implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 145488316001404743L)
        public a(pd pdVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 701854191703336936L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (WB) {
                    iy.EQ(-4346123507819751280L, this, dialogInterface, new Integer(i));
                }
                dialogInterface.dismiss();
                ServiceContainer.getProjectService().ko();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -4346123507819751280L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5124860084485846799L, container = 1714930153382168671L, user = true)
    class b implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -135191764655123660L)
        public b(pd pdVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -734790114215991427L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (WB) {
                    iy.EQ(-3211341477829096855L, this, dialogInterface, new Integer(i));
                }
                dialogInterface.dismiss();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -3211341477829096855L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(pd.class);
    }

    @ey(method = -1023183390462642816L)
    public pd() {
        try {
            if (zh) {
                iy.gn(-25279815504965840L, null);
            }
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -25279815504965840L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 213038001807726051L)
    public Dialog Hw(Activity activity) {
        try {
            if (zh) {
                iy.tp(861182796774363973L, this, activity);
            }
            Spanned spannedFromHtml = Html.fromHtml(ServiceContainer.getProjectService().ei());
            TextView textView = new TextView(activity);
            textView.setPadding((int) (activity.getResources().getDisplayMetrics().density * 10.0f), (int) (activity.getResources().getDisplayMetrics().density * 10.0f), (int) (activity.getResources().getDisplayMetrics().density * 10.0f), (int) (activity.getResources().getDisplayMetrics().density * 10.0f));
            textView.setText(spannedFromHtml);
            ScrollView scrollView = new ScrollView(activity);
            scrollView.addView(textView);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setView(scrollView).setCancelable(true).setPositiveButton(2131559895, new b(this)).setNeutralButton(u.dialog_project_properties_build_variants, new a(this));
            builder.setTitle(activity.getResources().getString(u.dialog_project_properties_title, "'" + FileSystem.getName(ServiceContainer.getProjectService().getCurrentAppHome()) + "'"));
            AlertDialog alertDialogCreate = builder.create();
            this.k2 = alertDialogCreate;
            return alertDialogCreate;
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, 861182796774363973L, this, activity);
            }
            throw th;
        }
    }
}
