package com.aide.ui.marketing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aide.ui.R$drawable;
import com.aide.ui.marketing.a;
import com.aide.ui.q;
import com.aide.ui.r;
import java.util.List;

@cy(clazz = -255305077619933835L, container = -255305077619933835L, user = true)
/* loaded from: classes.dex */
public class WhatsNewDialog {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -997865427726906315L, container = -997865427726906315L, user = true)
    private static class PromotedAppListAdapter extends BaseAdapter {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -3095391488788896379L)
        private Context DW;

        @dy(field = -1868322362362947221L)
        private a.C0072a j6;

        static {
            iy.Zo(PromotedAppListAdapter.class);
        }

        @ey(method = -84514163150598336L)
        public PromotedAppListAdapter(Context context) {
            try {
                if (FH) {
                    iy.tp(186003988000272072L, null, context);
                }
                this.DW = context;
                for (a.C0072a c0072a : a.j6) {
                    if (c0072a.DW.equals(context.getPackageName())) {
                        this.j6 = c0072a;
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 186003988000272072L, null, context);
                }
                throw th;
            }
        }

        @Override // android.widget.Adapter
        @ey(method = -998587396990188468L)
        public int getCount() {
            try {
                if (!FH) {
                    return 2;
                }
                iy.gn(203782999691271672L, this);
                return 2;
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 203782999691271672L, this);
                }
                throw th;
            }
        }

        @Override // android.widget.Adapter
        @ey(method = -818842149512929085L)
        public Object getItem(int i) {
            try {
                if (FH) {
                    iy.u7(-203887610944724343L, this, i);
                }
                return this.j6;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -203887610944724343L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.Adapter
        @ey(method = 1027768060609764804L)
        public long getItemId(int i) {
            try {
                if (FH) {
                    iy.u7(-284809481799784528L, this, i);
                }
                return i;
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -284809481799784528L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.Adapter
        @ey(method = 2742632277161757635L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (FH) {
                    iy.we(-2030958202756261779L, this, new Integer(i), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(this.DW).inflate(r.dialog_whatsnew_item, viewGroup, false) : view;
                if (i == 0) {
                    TextView textView = (TextView) viewInflate.findViewById(q.whatsNewItemHeader);
                    textView.setText("What's new");
                    textView.setVisibility(0);
                    ImageView imageView = (ImageView) viewInflate.findViewById(q.whatsNewItemIcon);
                    imageView.setImageResource(this.j6.j6);
                    imageView.setVisibility(0);
                    TextView textView2 = (TextView) viewInflate.findViewById(q.whatsNewItemTitle);
                    textView2.setText(this.j6.FH);
                    textView2.setVisibility(0);
                    TextView textView3 = (TextView) viewInflate.findViewById(q.whatsNewItemSubTitle);
                    textView3.setText(this.j6.Hw);
                    textView3.setVisibility(8);
                    TextView textView4 = (TextView) viewInflate.findViewById(q.whatsNewItemText);
                    List<String> listJ6 = this.j6.j6(this.DW);
                    String str = "New in " + WhatsNewDialog.FH(this.DW) + ":<br/>";
                    for (int i2 = 0; i2 < listJ6.size(); i2++) {
                        String string = listJ6.get(i2);
                        int iIndexOf = string.indexOf(58);
                        if (iIndexOf > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("<b>");
                            int i3 = iIndexOf + 1;
                            sb.append(string.substring(0, i3));
                            sb.append("</b>");
                            sb.append(string.substring(i3));
                            string = sb.toString();
                        }
                        str = str + string;
                        if (i2 < listJ6.size() - 1) {
                            str = str + "<br/>";
                        }
                    }
                    textView4.setText(Html.fromHtml(str));
                    textView4.setVisibility(0);
                } else {
                    ((TextView) viewInflate.findViewById(q.whatsNewItemHeader)).setVisibility(8);
                    ImageView imageView2 = (ImageView) viewInflate.findViewById(q.whatsNewItemIcon);
                    imageView2.setImageResource(R$drawable.backbone);
                    imageView2.setVisibility(0);
                    TextView textView5 = (TextView) viewInflate.findViewById(q.whatsNewItemTitle);
                    textView5.setText("Probelytics");
                    textView5.setVisibility(0);
                    TextView textView6 = (TextView) viewInflate.findViewById(q.whatsNewItemSubTitle);
                    textView6.setText("Realtime automatic analytics");
                    textView6.setVisibility(0);
                    ((TextView) viewInflate.findViewById(q.whatsNewItemText)).setVisibility(8);
                }
                return viewInflate;
            } catch (Throwable th) {
                if (Hw) {
                    iy.U2(th, -2030958202756261779L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4063958327321650800L, container = -4063958327321650800L, user = true)
    public static class WhatsNewDialogFragment extends DialogFragment {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -3943248633608171213L)
        private Runnable WB;

        @cy(clazz = 3017149715891750457L, container = -4063958327321650800L, user = true)
        class a implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -399065506909790220L)
            a(WhatsNewDialogFragment whatsNewDialogFragment) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 418997658436018029L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (WB) {
                        iy.EQ(2095677430494952304L, this, dialogInterface, new Integer(i));
                    }
                } catch (Throwable th) {
                    if (mb) {
                        iy.Mr(th, 2095677430494952304L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 3017202698238398824L, container = -4063958327321650800L, user = true)
        class b implements AdapterView.OnItemClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 320237211642801264L)
            b() {
            }

            private static /* synthetic */ void j6(Object obj, Intent intent) {
                ((Activity) obj).startActivity(intent);
                iy.BT(obj, intent);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            @ey(method = -3526629895958067360L)
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                try {
                    if (mb) {
                        iy.J0(1836594405037322275L, this, adapterView, view, new Integer(i), new Long(j));
                    }
                    if (i == 1) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://probelytics.com"));
                        intent.setFlags(1073741824);
                        try {
                            j6(WhatsNewDialogFragment.this.getActivity(), intent);
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.a8(th, 1836594405037322275L, this, adapterView, view, new Integer(i), new Long(j));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(WhatsNewDialogFragment.class);
        }

        @ey(method = -2419221532676970943L)
        public WhatsNewDialogFragment() {
            try {
                if (mb) {
                    iy.gn(7208584723108103456L, null);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 7208584723108103456L, null);
                }
                throw th;
            }
        }

        @ey(method = 836459496719825985L)
        public void j6(Runnable runnable) {
            try {
                if (mb) {
                    iy.tp(-815380942762689705L, this, runnable);
                }
                this.WB = runnable;
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -815380942762689705L, this, runnable);
                }
                throw th;
            }
        }

        @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
        @ey(method = -1313137041694305116L)
        public void onCancel(DialogInterface dialogInterface) {
            try {
                if (mb) {
                    iy.tp(382626563866172984L, this, dialogInterface);
                }
                super.onCancel(dialogInterface);
                if (this.WB != null) {
                    this.WB.run();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 382626563866172984L, this, dialogInterface);
                }
                throw th;
            }
        }

        @Override // android.app.DialogFragment
        @ey(method = 2344366893808544256L)
        public Dialog onCreateDialog(Bundle bundle) {
            try {
                if (mb) {
                    iy.tp(-798208688367902808L, this, bundle);
                }
                ListView listView = new ListView(getActivity());
                listView.setAdapter((ListAdapter) new PromotedAppListAdapter(getActivity()));
                AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setView(listView).create();
                alertDialogCreate.setButton(-1, getString(2131559895), new a(this));
                listView.setOnItemClickListener(new b());
                return alertDialogCreate;
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -798208688367902808L, this, bundle);
                }
                throw th;
            }
        }

        @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        @ey(method = -2191331590450867200L)
        public void onDismiss(DialogInterface dialogInterface) {
            try {
                if (mb) {
                    iy.tp(346956988329055000L, this, dialogInterface);
                }
                super.onDismiss(dialogInterface);
                if (this.WB != null) {
                    this.WB.run();
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 346956988329055000L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(WhatsNewDialog.class);
    }

    @ey(method = 2646685301669451048L)
    public WhatsNewDialog() {
        try {
            if (j6) {
                iy.gn(-525653038800917577L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -525653038800917577L, null);
            }
            throw th;
        }
    }

    @ey(method = -2947093802115670708L)
    private static int DW(Context context) {
        try {
            if (j6) {
                iy.tp(2906833643844366216L, null, context);
            }
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                return 0;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2906833643844366216L, null, context);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2221147667588553088L)
    public static String FH(Context context) {
        try {
            if (j6) {
                iy.tp(-1418512836848854824L, null, context);
            }
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1418512836848854824L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1530796899279801613L)
    public static void Hw(Activity activity, Runnable runnable) {
        try {
            if (j6) {
                iy.EQ(6088108755233122051L, null, activity, runnable);
            }
            activity.getSharedPreferences("WhatsNew", 0).edit().putInt("ShownVersion", DW(activity)).commit();
            WhatsNewDialogFragment whatsNewDialogFragment = new WhatsNewDialogFragment();
            whatsNewDialogFragment.j6(runnable);
            whatsNewDialogFragment.show(activity.getFragmentManager(), "whatsnew");
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 6088108755233122051L, null, activity, runnable);
            }
            throw th;
        }
    }

    @ey(method = 2449676807043485784L)
    public static boolean v5(Activity activity, Runnable runnable) {
        try {
            if (j6) {
                iy.EQ(289004669114347340L, null, activity, runnable);
            }
            if (activity.getSharedPreferences("WhatsNew", 0).getInt("ShownVersion", 0) == DW(activity)) {
                return false;
            }
            Hw(activity, runnable);
            return true;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 289004669114347340L, null, activity, runnable);
            }
            throw th;
        }
    }
}
