package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.uidesigner.XmlLayoutDesignActivity;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -5728075795338140784L, container = -5728075795338140784L, user = true)
/* loaded from: classes.dex */
public class PropertiesDialog extends MessageBox {

    @fy
    private static /* synthetic */ boolean AL;

    @gy
    private static /* synthetic */ boolean w9;

    @dy(field = -4474188977449737717L)
    private List<b> k2;

    @dy(field = -3015550881795457128L)
    private String zh;

    @cy(clazz = 3511701246127052745L, container = -5728075795338140784L, user = true)
    class a implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2595606017162760196L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 2484594322602267099L)
        a(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = 3029969737543561421L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(3696185828202684321L, this, adapterView, view, new Integer(i), new Long(j));
                }
                this.WB.dismiss();
                ((b) PropertiesDialog.this.k2.get(i)).run();
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 3696185828202684321L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1448932935986201964L, container = -1448932935986201964L, user = true)
    public interface b {
        @ey(method = -2887701943396898080L)
        boolean DW();

        @ey(method = 3889285502009545339L)
        String FH();

        @ey(method = -2139997759310076780L)
        String getName();

        @ey(method = 947081825212865095L)
        int j6();

        @ey(method = 816893964651158856L)
        void run();
    }

    @cy(clazz = -2051543434084569271L, container = -2051543434084569271L, user = true)
    private static class c extends ArrayAdapter<b> {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        @cy(clazz = 222824875113239592L, container = -2051543434084569271L, user = true)
        class a implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -1036046461643069968L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 674246250142777521L)
            a(String str) {
                this.WB = str;
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 630976205589365376L)
            public void onClick(View view) {
                try {
                    if (jw) {
                        iy.tp(-4408689612193054751L, this, view);
                    }
                    ((XmlLayoutDesignActivity) c.this.getContext()).ef(this.WB);
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -4408689612193054751L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -8452035402067150608L)
        public c(Context context, List<b> list) {
            super(context, r.propertydialog_entry, list);
            try {
                if (j6) {
                    iy.EQ(-552356801102747168L, null, context, list);
                }
            } catch (Throwable th) {
                if (DW) {
                    iy.Mr(th, -552356801102747168L, null, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = -1281641125723598655L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (j6) {
                    iy.we(902087801372589832L, this, new Integer(i), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(getContext()).inflate(r.propertydialog_entry, viewGroup, false) : view;
                b item = getItem(i);
                ((TextView) viewInflate.findViewById(q.widgetmenuEntryName)).setText(Html.fromHtml(item.getName()));
                ((ImageView) viewInflate.findViewById(q.widgetmenuEntryImage)).setImageResource(AndroidHelper.vy(getContext(), item.j6()));
                String strFH = item.FH();
                View viewFindViewById = viewInflate.findViewById(q.widgetmenuHelpButton);
                viewFindViewById.setVisibility(strFH == null ? 8 : 0);
                if (strFH != null) {
                    viewFindViewById.setOnClickListener(new a(strFH));
                }
                return viewInflate;
            } catch (Throwable th) {
                if (DW) {
                    iy.U2(th, 902087801372589832L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(PropertiesDialog.class);
    }

    @ey(method = -38863986944008123L)
    public PropertiesDialog(String str, List<? extends b> list) {
        try {
            if (AL) {
                iy.EQ(6861621606217403563L, null, str, list);
            }
            this.zh = str;
            this.k2 = new ArrayList();
            for (b bVar : list) {
                if (bVar.DW()) {
                    this.k2.add(bVar);
                }
            }
        } catch (Throwable th) {
            if (w9) {
                iy.Mr(th, 6861621606217403563L, null, str, list);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = -732187598988876800L)
    protected Dialog Hw(Activity activity) {
        try {
            if (AL) {
                iy.tp(743108399929493893L, this, activity);
            }
            ListView listView = new ListView(activity);
            listView.setAdapter((ListAdapter) new c(activity, this.k2));
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setCancelable(true).setView(listView).setTitle(this.zh).create();
            alertDialogCreate.setCanceledOnTouchOutside(true);
            listView.setOnItemClickListener(new a(alertDialogCreate));
            return alertDialogCreate;
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 743108399929493893L, this, activity);
            }
            throw th;
        }
    }
}
