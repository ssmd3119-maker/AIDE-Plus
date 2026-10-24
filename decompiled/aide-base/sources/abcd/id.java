package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aide.common.MessageBox;
import com.aide.ui.MainActivity;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.services.DropboxService;
import com.aide.ui.util.FileSystem;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -2572685827865588271L, container = -2572685827865588271L, user = true)
/* loaded from: classes.dex */
public class id extends MessageBox {

    @fy
    private static /* synthetic */ boolean AL;

    @gy
    private static /* synthetic */ boolean w9;

    @dy(field = 2132731226229737151L)
    private String k2;

    @dy(field = 1004383293968893712L)
    private String zh;

    @cy(clazz = 2193179522732464832L, container = -2572685827865588271L, user = true)
    class a implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 15958383755815488L)
        public a(id idVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 367790222647019520L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (WB) {
                    iy.EQ(4977971224188064575L, this, dialogInterface, new Integer(i));
                }
                dialogInterface.cancel();
                ServiceContainer.EQ().dx();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, 4977971224188064575L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2193254100340038549L, container = -2572685827865588271L, user = true)
    class b implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -158494433620942944L)
        public b(id idVar) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 739073827971205376L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (WB) {
                    iy.EQ(-6175540661377982760L, this, dialogInterface, new Integer(i));
                }
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -6175540661377982760L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2193328677951675560L, container = -2572685827865588271L, user = true)
    class c implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 87286836406934448L)
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 781528092488854680L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(-4870320587913197581L, this, dialogInterface, new Integer(i));
                }
                ((AlertDialog) dialogInterface).dismiss();
                ServiceContainer.EQ().lp(id.this.Qq(), id.this.vJ());
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -4870320587913197581L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2193403255567375865L, container = -2572685827865588271L, user = true)
    class d implements DialogInterface.OnShowListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -67691864764718843L)
        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        @ey(method = 66569645168422633L)
        public void onShow(DialogInterface dialogInterface) {
            try {
                if (DW) {
                    iy.tp(4292483544503373907L, this, dialogInterface);
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                id.this.sy(alertDialog);
                id.this.aj(alertDialog);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 4292483544503373907L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2193477833187139464L, container = -2572685827865588271L, user = true)
    class e implements DropboxService.g {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -2783926991990666828L)
        final /* synthetic */ AlertDialog j6;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -327441958544717952L)
        public e(AlertDialog alertDialog) {
            this.j6 = alertDialog;
        }

        @Override // com.aide.ui.services.DropboxService.g
        @ey(method = -881046526459486464L)
        public void DW(vt vtVar) {
            try {
                if (FH) {
                    iy.tp(-1658754356135941064L, this, vtVar);
                }
                this.j6.cancel();
                MainActivity mainActivity = ServiceContainer.getMainActivity();
                StringBuilder sb = new StringBuilder();
                sb.append("Error: ");
                sb.append(vtVar == null ? "" : vtVar.getMessage());
                MessageBox.BT(mainActivity, "Dropbox", sb.toString());
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -1658754356135941064L, this, vtVar);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.services.DropboxService.g
        @ey(method = -4147055099230844949L)
        public void j6(List<String> list) {
            try {
                if (FH) {
                    iy.tp(659048551900456159L, this, list);
                }
                id.this.lp(this.j6, list);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 659048551900456159L, this, list);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2193552410810966357L, container = -2572685827865588271L, user = true)
    class f implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2288988316639237760L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 8215690489045480584L)
        public f(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = -786265504497768043L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(802374041035027216L, this, adapterView, view, new Integer(i), new Long(j));
                }
                String str = (String) adapterView.getItemAtPosition(i);
                if (str.equals("..")) {
                    id.this.zh = id.this.zh.substring(0, id.this.zh.lastIndexOf(47));
                    if (id.this.zh.length() == 0) {
                        id.this.zh = "/";
                    }
                } else {
                    if (id.this.zh.length() > 1) {
                        id.this.zh = id.this.zh + "/";
                    }
                    id.this.zh = id.this.zh + str;
                }
                id.this.aj(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 802374041035027216L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(id.class);
    }

    @ey(method = 183455292108575229L)
    public id(String str) {
        try {
            if (AL) {
                iy.tp(569673343454733891L, null, str);
            }
            this.k2 = str;
            this.zh = "/";
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 569673343454733891L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -6436187367016678488L)
    private String I() {
        try {
            if (AL) {
                iy.gn(-4258102697939468680L, this);
            }
            return this.k2;
        } catch (Throwable th) {
            if (w9) {
                iy.aM(th, -4258102697939468680L, this);
            }
            throw th;
        }
    }

    @ey(method = 1276020680524248720L)
    private ListView Mz(AlertDialog alertDialog) {
        try {
            if (AL) {
                iy.tp(97000907176723680L, this, alertDialog);
            }
            return (ListView) alertDialog.findViewById(q.downloadDropboxList);
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 97000907176723680L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5230940868579655520L)
    public String Qq() {
        try {
            if (AL) {
                iy.gn(1249546917014851392L, this);
            }
            return I() + "/" + Sf();
        } catch (Throwable th) {
            if (w9) {
                iy.aM(th, 1249546917014851392L, this);
            }
            throw th;
        }
    }

    @ey(method = 7867286246625661968L)
    private String Sf() {
        try {
            if (AL) {
                iy.gn(2460074230573780304L, this);
            }
            return this.zh.substring(this.zh.lastIndexOf(47) + 1);
        } catch (Throwable th) {
            if (w9) {
                iy.aM(th, 2460074230573780304L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5646019521884747908L)
    public void aj(AlertDialog alertDialog) {
        try {
            if (AL) {
                iy.tp(-596654143124371332L, this, alertDialog);
            }
            x9(alertDialog).setVisibility(0);
            Mz(alertDialog).setEnabled(false);
            alertDialog.getButton(-1).setEnabled(false);
            ServiceContainer.EQ().ei(vJ(), new e(alertDialog));
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, -596654143124371332L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -2641006212251940765L)
    private TextView ca(AlertDialog alertDialog) {
        try {
            if (AL) {
                iy.tp(-3470816445827851677L, this, alertDialog);
            }
            return (TextView) alertDialog.findViewById(q.downloadDropboxLocation);
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, -3470816445827851677L, this, alertDialog);
            }
            throw th;
        }
    }

    @ey(method = -3992933920921654800L)
    private TextView g3(AlertDialog alertDialog) {
        try {
            if (AL) {
                iy.tp(5399476808545571184L, this, alertDialog);
            }
            return (TextView) alertDialog.findViewById(q.downloadDropboxFolder);
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 5399476808545571184L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -6221678763158009915L)
    public void lp(AlertDialog alertDialog, List<String> list) {
        try {
            if (AL) {
                iy.EQ(-6060517378499113803L, this, alertDialog, list);
            }
            sy(alertDialog);
            x9(alertDialog).setVisibility(8);
            Mz(alertDialog).setEnabled(true);
            ArrayList arrayList = new ArrayList();
            if (vJ().length() > 1) {
                arrayList.add("..");
            }
            for (String str : list) {
                arrayList.add(str.substring(str.lastIndexOf(47) + 1));
            }
            Mz(alertDialog).setAdapter((ListAdapter) new ArrayAdapter(ServiceContainer.getContext(), r.downloaddropbox_entry, q.downloaddropboxEntryName, arrayList));
            Mz(alertDialog).setOnItemClickListener(new f(alertDialog));
        } catch (Throwable th) {
            if (w9) {
                iy.Mr(th, -6060517378499113803L, this, alertDialog, list);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -357747792482698860L)
    public void sy(AlertDialog alertDialog) {
        try {
            if (AL) {
                iy.tp(-357014852303339916L, this, alertDialog);
            }
            ca(alertDialog).setText("Local Folder: " + Qq());
            g3(alertDialog).setText("Dropbox Folder: " + vJ());
            Button button = alertDialog.getButton(-1);
            boolean z = true;
            if (vJ().length() <= 1 || FileSystem.exists(Qq())) {
                z = false;
            }
            button.setEnabled(z);
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, -357014852303339916L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 7877856695000671104L)
    public String vJ() {
        try {
            if (AL) {
                iy.gn(2468214204747185968L, this);
            }
            return this.zh;
        } catch (Throwable th) {
            if (w9) {
                iy.aM(th, 2468214204747185968L, this);
            }
            throw th;
        }
    }

    @ey(method = 2181299515397713725L)
    private View x9(AlertDialog alertDialog) {
        try {
            if (AL) {
                iy.tp(22896580452730621L, this, alertDialog);
            }
            return alertDialog.findViewById(q.downloadDropboxProgress);
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 22896580452730621L, this, alertDialog);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 445900606772812416L)
    public Dialog Hw(Activity activity) {
        try {
            if (AL) {
                iy.tp(1675997399528744320L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.downloaddropbox, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("Download Dropbox Folder").setView(viewInflate).setCancelable(true).setPositiveButton("Download", new c()).setNegativeButton("Cancel", new b(this)).setNeutralButton("Logout", new a(this));
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setOnShowListener(new d());
            return alertDialogCreate;
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 1675997399528744320L, this, activity);
            }
            throw th;
        }
    }
}
