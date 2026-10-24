package com.aide.ui.browsers;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.aide.common.AppLog;
import com.aide.common.KeyStrokeDetector;
import com.aide.common.ListAdapterBase;
import com.aide.engine.SyntaxError;
import com.aide.ui.AppCommands;
import com.aide.ui.AppFileIcons;
import com.aide.ui.GlobalKeyCommand;
import com.aide.ui.MainActivity;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.u;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;
import com.aide.ui.views.CustomKeysListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -3573611469323080621L, container = -3573611469323080621L, user = true)
/* loaded from: classes.dex */
public class ErrorBrowser extends LinearLayout implements com.aide.ui.browsers.a {

    @fy
    private static /* synthetic */ boolean fY;

    @gy
    private static /* synthetic */ boolean qp;

    @dy(field = -472192025631436583L)
    private KeyStrokeDetector.KeyStrokeHandler WB;

    @dy(field = -2874527336723958927L)
    private d jw;

    @dy(field = 493597460273850345L)
    private int mb;

    @cy(clazz = -4024347337539409660L, container = -3573611469323080621L, user = true)
    class a implements CustomKeysListView.OnKeyEventListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 6373428451239626832L)
        a() {
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = -454798477460097125L)
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(3926217246602811325L, this, new Integer(i), keyEvent);
                }
                return ServiceContainer.getMainActivity().vJ().onKeyDown(i, keyEvent, ErrorBrowser.this.WB);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 3926217246602811325L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = -3222528218622076560L)
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(-3663651159511317744L, this, new Integer(i), keyEvent);
                }
                return ServiceContainer.getMainActivity().vJ().onKeyUp(i, keyEvent, ErrorBrowser.this.WB);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -3663651159511317744L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4024409730547445325L, container = -3573611469323080621L, user = true)
    class b implements AdapterView.OnItemLongClickListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 2537440565097993243L)
        final /* synthetic */ CustomKeysListView j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 843234926256779200L)
        b(CustomKeysListView customKeysListView) {
            this.j6 = customKeysListView;
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        @ey(method = -143325572530411503L)
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (FH) {
                    iy.J0(-919305275619017712L, this, adapterView, view, new Integer(i), new Long(j));
                }
                e eVar = (e) this.j6.getItemAtPosition(i);
                if (eVar != null && !eVar.DW && !eVar.j6) {
                    ErrorBrowser.this.getActivity().aq(eVar.Zo);
                    ErrorBrowser.this.getActivity().sh().q7();
                }
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, -919305275619017712L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4024472123551417696L, container = -3573611469323080621L, user = true)
    class c implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 501662856756002823L)
        final /* synthetic */ CustomKeysListView WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 6464617680326339968L)
        c(CustomKeysListView customKeysListView) {
            this.WB = customKeysListView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = -4620599099080279359L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(-1324548636944281944L, this, adapterView, view, new Integer(i), new Long(j));
                }
                e eVar = (e) this.WB.getItemAtPosition(i);
                if (eVar == null) {
                    return;
                }
                ErrorBrowser.this.getActivity().aq(eVar.Zo);
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -1324548636944281944L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3019480761824582060L, container = -3019480761824582060L, user = true)
    private class d extends ListAdapterBase<e> {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = 443461354700253240L)
        @hy
        final /* synthetic */ ErrorBrowser Hw;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 6730747654339429588L)
        private d(ErrorBrowser errorBrowser) {
            try {
                if (v5) {
                    iy.tp(-1218643162927759923L, null, errorBrowser);
                }
                this.Hw = errorBrowser;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -1218643162927759923L, null, errorBrowser);
                }
                throw th;
            }
        }

        @Override // android.widget.Adapter
        @ey(method = 3145105329506709651L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (v5) {
                    iy.we(177476514755431671L, this, new Integer(i), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(this.Hw.getContext()).inflate(r.errorbrowser_entry, viewGroup, false) : view;
                e eVarJ6 = j6(i);
                if (eVarJ6.DW || eVarJ6.j6) {
                    viewInflate.findViewById(q.errorbrowserEntryFile).setVisibility(0);
                    viewInflate.findViewById(q.errorbrowserEntryError).setVisibility(8);
                    ImageView imageView = (ImageView) viewInflate.findViewById(q.errorbrowserEntryFileImage);
                    if (eVarJ6.j6) {
                        imageView.setImageResource(R$drawable.folder);
                    } else {
                        imageView.setImageResource(AppFileIcons.j6(eVarJ6.FH));
                    }
                    ((TextView) viewInflate.findViewById(q.errorbrowserEntryFileName)).setText(eVarJ6.FH);
                } else {
                    viewInflate.findViewById(q.errorbrowserEntryFile).setVisibility(8);
                    viewInflate.findViewById(q.errorbrowserEntryError).setVisibility(0);
                    ((ImageView) viewInflate.findViewById(q.errorbrowserEntryImage)).setImageResource(R$drawable.project_errors);
                    ((TextView) viewInflate.findViewById(q.errorbrowserEntryMessage)).setText(eVarJ6.Hw);
                }
                return viewInflate;
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, 177476514755431671L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 6222435169717999788L)
        /* synthetic */ d(ErrorBrowser errorBrowser, a aVar) {
            this(errorBrowser);
            try {
                if (v5) {
                    iy.EQ(1011462152258805995L, null, errorBrowser, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 1011462152258805995L, null, errorBrowser, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ErrorBrowser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 9600250390519068L)
    public ErrorBrowser(Context context) {
        super(context);
        try {
            if (fY) {
                iy.tp(3424679459759599248L, null, context);
            }
            this.WB = new GlobalKeyCommand(AppCommands.Zo());
            v5();
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 3424679459759599248L, null, context);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1894219429645401600L)
    public MainActivity getActivity() {
        try {
            if (fY) {
                iy.gn(4552612282792560900L, this);
            }
            return (MainActivity) getContext();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 4552612282792560900L, this);
            }
            throw th;
        }
    }

    @ey(method = -1319812579773432792L)
    private CustomKeysListView getListView() {
        try {
            if (fY) {
                iy.gn(1505233819349778960L, this);
            }
            return (CustomKeysListView) findViewById(q.errorbrowserErrorList);
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 1505233819349778960L, this);
            }
            throw th;
        }
    }

    @ey(method = 298193067468177555L)
    private void v5() {
        try {
            if (fY) {
                iy.gn(-1654310818425086997L, this);
            }
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            View viewInflate = layoutInflaterFrom.inflate(r.errorbrowser, (ViewGroup) null);
            removeAllViews();
            addView(viewInflate);
            View viewInflate2 = layoutInflaterFrom.inflate(r.browser_header, (ViewGroup) null);
            CustomKeysListView listView = getListView();
            listView.addHeaderView(viewInflate2, null, false);
            d dVar = new d(this, null);
            this.jw = dVar;
            listView.setAdapter((ListAdapter) dVar);
            listView.setOnKeyEventListener(new a());
            listView.setOnItemLongClickListener(new b(listView));
            listView.setOnItemClickListener(new c(listView));
            Zo();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -1654310818425086997L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = -2313904710852219905L)
    public void DW() {
        try {
            if (fY) {
                iy.gn(1407598841666884155L, this);
            }
            getListView().requestFocus();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 1407598841666884155L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = 2069853027581582775L)
    public void FH() {
        try {
            if (fY) {
                iy.gn(984838052989001943L, this);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 984838052989001943L, this);
            }
            throw th;
        }
    }

    @ey(method = -121865764203675888L)
    public void VH() {
        try {
            if (fY) {
                iy.gn(200084586438198996L, this);
            }
            int iGW = ServiceContainer.J0().gW();
            if (iGW >= 100 || this.mb == iGW) {
                return;
            }
            Zo();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 200084586438198996L, this);
            }
            throw th;
        }
    }

    @ey(method = -4844785366208825205L)
    public void Zo() {
        String string;
        int i;
        try {
            if (fY) {
                iy.gn(-5609258738120235717L, this);
            }
            CustomKeysListView listView = getListView();
            boolean zHasFocus = listView.hasFocus();
            int iGW = ServiceContainer.J0().gW();
            this.mb = iGW;
            if (iGW == 0) {
                string = getContext().getResources().getString(u.view_no_errors);
                i = R$drawable.project_no_errors;
            } else {
                string = iGW == 1 ? getContext().getResources().getString(u.view_one_error) : getContext().getResources().getString(u.view_errors, this.mb + "");
                i = R$drawable.project_errors;
            }
            TextView textView = (TextView) listView.findViewById(q.browserHeaderLabel);
            ImageView imageView = (ImageView) listView.findViewById(q.browserHeaderIcon);
            ImageView imageView2 = (ImageView) listView.findViewById(q.browserHeaderMenuButton);
            imageView.setImageResource(i);
            textView.setText(string);
            imageView2.setVisibility(8);
            ArrayList arrayList = new ArrayList();
            for (String str : ServiceContainer.J0().nw()) {
                List<SyntaxError> listP8 = ServiceContainer.J0().P8(str);
                if (listP8.size() > 0) {
                    arrayList.add(new e(this, str));
                    Iterator<SyntaxError> it = listP8.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new e(this, str, it.next()));
                    }
                }
            }
            this.jw.DW(arrayList);
            if (zHasFocus) {
                AppLog.DW("Focus error browser after refresh");
                DW();
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -5609258738120235717L, this);
            }
            throw th;
        }
    }

    @cy(clazz = 3101622623608377605L, container = 3101622623608377605L, user = true)
    private class e {

        @fy
        private static /* synthetic */ boolean gn;

        @gy
        private static /* synthetic */ boolean u7;

        @dy(field = 822490714299188077L)
        public boolean DW;

        @dy(field = 1479372211773196648L)
        public String FH;

        @dy(field = 2878666026526514644L)
        public String Hw;

        @dy(field = 2256132009721052769L)
        @hy
        final /* synthetic */ ErrorBrowser VH;

        @dy(field = 1491440965119663375L)
        public FileSpan Zo;

        @dy(field = -2868616196431398540L)
        public boolean j6;

        @dy(field = -3055570071235580787L)
        public SyntaxError v5;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 548772239476317312L)
        public e(ErrorBrowser errorBrowser, String str, SyntaxError syntaxError) {
            try {
                if (gn) {
                    iy.we(-2022260014338620256L, null, errorBrowser, str, syntaxError);
                }
                this.VH = errorBrowser;
                this.v5 = syntaxError;
                this.Hw = syntaxError.j6();
                this.Zo = new FileSpan(str, syntaxError.jw, syntaxError.fY, syntaxError.qp, syntaxError.k2);
            } catch (Throwable th) {
                if (u7) {
                    iy.U2(th, -2022260014338620256L, null, errorBrowser, str, syntaxError);
                }
                throw th;
            }
        }

        @ey(method = 4799936906986781475L)
        public e(ErrorBrowser errorBrowser, String str) {
            try {
                if (gn) {
                    iy.EQ(-74989874564714795L, null, errorBrowser, str);
                }
                this.VH = errorBrowser;
                boolean zKD = FileSystem.KD(str);
                this.DW = zKD;
                this.j6 = !zKD;
                this.FH = FileSystem.getName(str);
                this.Zo = new FileSpan(str, 1, 1, 1, 1);
            } catch (Throwable th) {
                if (u7) {
                    iy.Mr(th, -74989874564714795L, null, errorBrowser, str);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 4230709798665360041L)
    public ErrorBrowser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (fY) {
                iy.EQ(-1208290115923066105L, null, context, attributeSet);
            }
            this.WB = new GlobalKeyCommand(AppCommands.Zo());
            v5();
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, -1208290115923066105L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
