package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.aide.common.MessageBox;
import com.aide.ui.ServiceContainer;
import com.aide.ui.activities.TrainerCourseActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import java.util.HashMap;
import java.util.List;

@cy(clazz = -465475316197143384L, container = -465475316197143384L, user = true)
/* loaded from: classes.dex */
public class fd extends MessageBox {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = -3729163413621129048L)
    private boolean AL;

    @dy(field = -1303651809497087244L)
    private String k2;

    @dy(field = 905728849216926512L)
    private boolean zh;

    @cy(clazz = 1201128321250378793L, container = -465475316197143384L, user = true)
    class a implements DialogInterface.OnCancelListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -112520333886557856L)
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @ey(method = 868672808753753157L)
        public void onCancel(DialogInterface dialogInterface) {
            try {
                if (mb) {
                    iy.tp(-8030713740123151297L, this, dialogInterface);
                }
                fd.this.cb();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -8030713740123151297L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1201187187511469312L, container = -465475316197143384L, user = true)
    class b implements ExpandableListView.OnChildClickListener {

        @fy
        private static /* synthetic */ boolean k2;

        @gy
        private static /* synthetic */ boolean zh;

        @dy(field = 4054363042112017223L)
        final /* synthetic */ c WB;

        @dy(field = -591846444748987405L)
        final /* synthetic */ List fY;

        @dy(field = -935105939362172071L)
        final /* synthetic */ Activity jw;

        @dy(field = -370488773710608388L)
        final /* synthetic */ AlertDialog mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -1405293526012801908L)
        public b(c cVar, AlertDialog alertDialog, Activity activity, List list) {
            this.WB = cVar;
            this.mb = alertDialog;
            this.jw = activity;
            this.fY = list;
        }

        @Override // android.widget.ExpandableListView.OnChildClickListener
        @ey(method = 1762722508293826605L)
        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            try {
                if (k2) {
                    iy.J8(649956900491740611L, this, expandableListView, view, new Integer(i), new Integer(i2), new Long(j));
                }
                if (!this.WB.FH(i, i2)) {
                    TemplateService.TemplateGroup templateGroup = (TemplateService.TemplateGroup) ((List) this.fY.get(i)).get(i2);
                    if (!templateGroup.Zo.gn) {
                        ServiceContainer.getLicenseService().cb(ServiceContainer.getMainActivity(), templateGroup.Zo.DW, "create_project");
                        return true;
                    }
                    fd.this.AL = false;
                    this.mb.dismiss();
                    fd.this.cb();
                    MessageBox.gW(this.jw, new gd(fd.this.k2, templateGroup, null));
                    return true;
                }
                FireBaseLogEvent.tp("Samples click");
                fd.this.AL = false;
                this.mb.dismiss();
                fd.this.cb();
                String strJ6 = this.WB.j6(i);
                if (!ServiceContainer.ca() && !ServiceContainer.ro().XL(strJ6).j3()) {
                    ServiceContainer.getLicenseService().dx(ServiceContainer.getMainActivity(), strJ6, "show_samples");
                    return true;
                }
                TrainerCourseActivity.er(this.jw, strJ6);
                return true;
            } catch (Throwable th) {
                if (zh) {
                    iy.lg(th, 649956900491740611L, this, expandableListView, view, new Integer(i), new Integer(i2), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2026413306719904496L, container = 2026413306719904496L, user = true)
    private static class c extends BaseExpandableListAdapter {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -388402737878013984L)
        private Context DW;

        @dy(field = 1323341255948861380L)
        private List<List<TemplateService.TemplateGroup>> j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 20211823486828795L)
        public c(Context context, List<List<TemplateService.TemplateGroup>> list) {
            try {
                if (FH) {
                    iy.EQ(-232176595782541683L, null, context, list);
                }
                this.DW = context;
                this.j6 = list;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -232176595782541683L, null, context, list);
                }
                throw th;
            }
        }

        @ey(method = 105767470024301760L)
        private boolean DW(int i) {
            try {
                if (FH) {
                    iy.u7(-1796781481611885296L, this, i);
                }
                c.d dVarXL = ServiceContainer.ro().XL(j6(i));
                if (dVarXL != null) {
                    if (dVarXL.Ws() > 0) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -1796781481611885296L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 4718231339956844395L)
        public boolean FH(int i, int i2) {
            try {
                if (FH) {
                    iy.EQ(1312911586431383235L, this, new Integer(i), new Integer(i2));
                }
                if (DW(i)) {
                    if (i2 == this.j6.get(i).size()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 1312911586431383235L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 794793089487503848L)
        public Object getChild(int i, int i2) {
            try {
                if (FH) {
                    iy.EQ(368494523357027872L, this, new Integer(i), new Integer(i2));
                }
                return this.j6.get(i).get(i2);
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 368494523357027872L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 701830187821444539L)
        public long getChildId(int i, int i2) {
            try {
                if (!FH) {
                    return 0L;
                }
                iy.EQ(-1408382048191777725L, this, new Integer(i), new Integer(i2));
                return 0L;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -1408382048191777725L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 6364351508466026088L)
        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) throws Throwable {
            View viewInflate;
            try {
                if (FH) {
                    iy.J8(-488028546869095920L, this, new Integer(i), new Integer(i2), new Boolean(z), view, viewGroup);
                }
                if (view == null) {
                    try {
                        viewInflate = LayoutInflater.from(this.DW).inflate(r.createproject_entry, viewGroup, false);
                    } catch (Throwable th) {
                        th = th;
                        if (Hw) {
                            iy.lg(th, -488028546869095920L, this, new Integer(i), new Integer(i2), new Boolean(z), view, viewGroup);
                        }
                        throw th;
                    }
                } else {
                    viewInflate = view;
                }
                TextView textView = (TextView) viewInflate.findViewById(q.projecttypeEntryLabel);
                TextView textView2 = (TextView) viewInflate.findViewById(q.projecttypeEntryDescription);
                ImageView imageView = (ImageView) viewInflate.findViewById(q.projecttypeEntryImage);
                if (FH(i, i2)) {
                    TemplateService.TemplateGroup templateGroup = (TemplateService.TemplateGroup) getChild(i, 0);
                    textView.setText(u.dialog_create_project_samples);
                    textView2.setVisibility(8);
                    imageView.setImageResource(templateGroup.v5);
                    float f = templateGroup.Zo.gn ? 1.0f : 0.5f;
                    imageView.setAlpha(f);
                    textView.setAlpha(f);
                    textView2.setAlpha(f);
                } else {
                    TemplateService.TemplateGroup templateGroup2 = (TemplateService.TemplateGroup) getChild(i, i2);
                    textView.setText(this.DW.getResources().getString(u.dialog_create_project_new, templateGroup2.j6));
                    textView2.setVisibility(0);
                    textView2.setText(templateGroup2.Zo.j6);
                    imageView.setImageResource(templateGroup2.v5);
                    float f2 = templateGroup2.Zo.gn ? 1.0f : 0.5f;
                    imageView.setAlpha(f2);
                    textView.setAlpha(f2);
                    textView2.setAlpha(f2);
                }
                return viewInflate;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 1000857738434594715L)
        public int getChildrenCount(int i) {
            try {
                if (FH) {
                    iy.u7(-4019972520800585109L, this, i);
                }
                return this.j6.get(i).size() + (DW(i) ? 1 : 0);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -4019972520800585109L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 1677372005865966600L)
        public Object getGroup(int i) {
            try {
                if (FH) {
                    iy.u7(253952695918904880L, this, i);
                }
                return this.j6.get(i);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 253952695918904880L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -191806811955904288L)
        public int getGroupCount() {
            try {
                if (FH) {
                    iy.gn(-3784194374910977664L, this);
                }
                return this.j6.size();
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -3784194374910977664L, this);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -1809210473980745155L)
        public long getGroupId(int i) {
            try {
                if (FH) {
                    iy.u7(828266266863184149L, this, i);
                }
                return i;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 828266266863184149L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 3385462561184511360L)
        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            try {
                if (FH) {
                    iy.J0(-65666186829364800L, this, new Integer(i), new Boolean(z), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(this.DW).inflate(2131361810, viewGroup, false) : view;
                ((TextView) viewInflate.findViewById(2131231146)).setText(((TemplateService.TemplateGroup) getChild(i, 0)).Zo.FH);
                return viewInflate;
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, -65666186829364800L, this, new Integer(i), new Boolean(z), view, viewGroup);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 894621544398910285L)
        public boolean hasStableIds() {
            try {
                if (!FH) {
                    return true;
                }
                iy.gn(2459711750389013565L, this);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 2459711750389013565L, this);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 1008571414591972456L)
        public boolean isChildSelectable(int i, int i2) {
            try {
                if (!FH) {
                    return true;
                }
                iy.EQ(-380257288707059008L, this, new Integer(i), new Integer(i2));
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -380257288707059008L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @ey(method = 327129985347280115L)
        public String j6(int i) {
            try {
                if (FH) {
                    iy.u7(-3273323525592575765L, this, i);
                }
                return this.j6.get(i).get(0).Zo.tp;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -3273323525592575765L, this, new Integer(i));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(fd.class);
    }

    @ey(method = -3463103516677419783L)
    public fd(String str, boolean z) {
        try {
            if (w9) {
                iy.EQ(-347134879684751796L, null, str, new Boolean(z));
            }
            this.AL = true;
            this.k2 = str;
            this.zh = z;
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -347134879684751796L, null, str, new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2974001686858122248L)
    public void cb() {
        try {
            if (w9) {
                iy.gn(-719671444291015088L, this);
            }
            if (this.zh) {
                HashMap map = new HashMap();
                map.put("exit", this.AL ? "cancelled" : "createContinued");
                FireBaseLogEvent.EQ("New user experience", map);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -719671444291015088L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 2888281673854544549L)
    public Dialog Hw(Activity activity) {
        try {
            if (w9) {
                iy.tp(2218568292298826557L, this, activity);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            List<List<TemplateService.TemplateGroup>> listV5 = ServiceContainer.getTemplateService().v5();
            ExpandableListView expandableListView = new ExpandableListView(activity);
            expandableListView.setCacheColorHint(0);
            c cVar = new c(activity, listV5);
            expandableListView.setAdapter(cVar);
            builder.setTitle(u.dialog_create_project_title).setView(expandableListView);
            builder.setOnCancelListener(new a());
            AlertDialog alertDialogCreate = builder.create();
            expandableListView.setOnChildClickListener(new b(cVar, alertDialogCreate, activity, listV5));
            expandableListView.expandGroup(0);
            return alertDialogCreate;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 2218568292298826557L, this, activity);
            }
            throw th;
        }
    }
}
