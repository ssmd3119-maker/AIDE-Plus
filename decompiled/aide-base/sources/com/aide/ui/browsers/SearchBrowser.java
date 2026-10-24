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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.aide.common.AndroidHelper;
import com.aide.common.KeyStrokeDetector;
import com.aide.engine.FindResult;
import com.aide.ui.AppCommands;
import com.aide.ui.AppFileIcons;
import com.aide.ui.GlobalKeyCommand;
import com.aide.ui.MainActivity;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.services.SearchService;
import com.aide.ui.u;
import com.aide.ui.util.FileSpan;
import com.aide.ui.util.FileSystem;
import com.aide.ui.views.CustomKeysListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 7056444447129579811L, container = 7056444447129579811L, user = true)
/* loaded from: classes.dex */
public class SearchBrowser extends LinearLayout implements com.aide.ui.browsers.a, SearchService.d {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = 3253790165379481728L)
    private KeyStrokeDetector.KeyStrokeHandler WB;

    @cy(clazz = -37988254780322812L, container = 7056444447129579811L, user = true)
    class a implements CustomKeysListView.OnKeyEventListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 5348812592242016256L)
        a() {
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = -1145743959054499344L)
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(7280889970857275944L, this, new Integer(i), keyEvent);
                }
                return ServiceContainer.getMainActivity().vJ().onKeyDown(i, keyEvent, SearchBrowser.this.WB);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 7280889970857275944L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = 5239326490030020549L)
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(-4656102942729338855L, this, new Integer(i), keyEvent);
                }
                return ServiceContainer.getMainActivity().vJ().onKeyUp(i, keyEvent, SearchBrowser.this.WB);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -4656102942729338855L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -38005517536923325L, container = 7056444447129579811L, user = true)
    class b implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 3283953730220239505L)
        final /* synthetic */ CustomKeysListView WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 3242141329793900121L)
        b(CustomKeysListView customKeysListView) {
            this.WB = customKeysListView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = 5001466677253110855L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(-2129241448782473487L, this, adapterView, view, new Integer(i), new Long(j));
                }
                d dVar = (d) this.WB.getItemAtPosition(i);
                if (dVar == null) {
                    return;
                }
                SearchBrowser.this.getActivity().aq(dVar.Hw);
                SearchBrowser.this.invalidate();
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -2129241448782473487L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4485796029203018988L, container = -4485796029203018988L, user = true)
    private class c extends ArrayAdapter<d> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -736021391081943957L)
        @hy
        final /* synthetic */ SearchBrowser j6;

        static {
            iy.Zo(c.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 1514717673117332199L)
        public c(SearchBrowser searchBrowser, Context context, List<d> list) {
            super(context, r.searchbrowser_entry, list);
            try {
                if (DW) {
                    iy.we(-1660303539601770616L, null, searchBrowser, context, list);
                }
                this.j6 = searchBrowser;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -1660303539601770616L, null, searchBrowser, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = -1563564573896834496L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate;
            try {
                if (DW) {
                    iy.we(-643008321036208052L, this, new Integer(i), view, viewGroup);
                }
                if (view == null) {
                    viewInflate = LayoutInflater.from(getContext()).inflate(r.searchbrowser_entry, viewGroup, false);
                    AndroidHelper.FH((FindResultTextView) viewInflate.findViewById(q.searchbrowserCodeLine));
                } else {
                    viewInflate = view;
                }
                d item = getItem(i);
                if (item.j6) {
                    viewInflate.findViewById(q.searchbrowserFile).setVisibility(0);
                    viewInflate.findViewById(q.searchbrowserCode).setVisibility(8);
                    ((ImageView) viewInflate.findViewById(q.searchbrowserEntryFileImage)).setImageResource(AppFileIcons.j6(item.DW));
                    ((TextView) viewInflate.findViewById(q.searchbrowserEntryFileName)).setText(item.DW);
                } else {
                    viewInflate.findViewById(q.searchbrowserFile).setVisibility(8);
                    viewInflate.findViewById(q.searchbrowserCode).setVisibility(0);
                    ((FindResultTextView) viewInflate.findViewById(q.searchbrowserCodeLine)).setContent(item.FH);
                }
                return viewInflate;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -643008321036208052L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(SearchBrowser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -2244770548639915L)
    public SearchBrowser(Context context) {
        super(context);
        try {
            if (mb) {
                iy.tp(-88089215933175055L, null, context);
            }
            this.WB = new GlobalKeyCommand(AppCommands.tp());
            Zo();
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -88089215933175055L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -1829209070600157024L)
    private void Zo() {
        try {
            if (mb) {
                iy.gn(786451878847058772L, this);
            }
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            View viewInflate = layoutInflaterFrom.inflate(r.searchbrowser, (ViewGroup) null);
            removeAllViews();
            addView(viewInflate);
            getListView().addHeaderView(layoutInflaterFrom.inflate(r.browser_header, (ViewGroup) null), null, false);
            ServiceContainer.SI().a8(this);
            VH();
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 786451878847058772L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1065915074338029825L)
    public MainActivity getActivity() {
        try {
            if (mb) {
                iy.gn(2337883170627670017L, this);
            }
            return (MainActivity) getContext();
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 2337883170627670017L, this);
            }
            throw th;
        }
    }

    @ey(method = -2325796464395595985L)
    private CustomKeysListView getListView() {
        try {
            if (mb) {
                iy.gn(-596856524298071349L, this);
            }
            return (CustomKeysListView) findViewById(q.searchbrowserList);
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -596856524298071349L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = -2434129128067318920L)
    public void DW() {
        try {
            if (mb) {
                iy.gn(-681255671560730864L, this);
            }
            requestFocus();
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -681255671560730864L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = 4624732783692933456L)
    public void FH() {
        try {
            if (mb) {
                iy.gn(2308476046075936572L, this);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 2308476046075936572L, this);
            }
            throw th;
        }
    }

    @ey(method = -2622727343871895164L)
    public void VH() {
        try {
            if (mb) {
                iy.gn(-4072646605578913152L, this);
            }
            boolean z = false;
            if (ServiceContainer.SI().Mr()) {
                findViewById(q.searchbrowserProgress).setVisibility(0);
                findViewById(q.searchbrowserResults).setVisibility(8);
                return;
            }
            CustomKeysListView listView = getListView();
            findViewById(q.searchbrowserProgress).setVisibility(8);
            findViewById(q.searchbrowserResults).setVisibility(0);
            TextView textView = (TextView) listView.findViewById(q.browserHeaderLabel);
            ImageView imageView = (ImageView) listView.findViewById(q.browserHeaderIcon);
            ((ImageView) listView.findViewById(q.browserHeaderMenuButton)).setVisibility(8);
            imageView.setImageResource(R$drawable.search);
            textView.setText(u.view_search_results);
            List<FindResult> listXL = ServiceContainer.SI().XL();
            ArrayList arrayList = new ArrayList();
            Iterator<FindResult> it = listXL.iterator();
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FindResult next = it.next();
                if (str2 != null && !next.WB.equals(str2)) {
                    z = true;
                    break;
                }
                str2 = next.WB;
            }
            for (FindResult findResult : listXL) {
                if (z && !findResult.WB.equals(str)) {
                    str = findResult.WB;
                    arrayList.add(new d(this, findResult.WB));
                }
                arrayList.add(new d(this, findResult));
            }
            listView.setOnKeyEventListener(new a());
            listView.setAdapter((ListAdapter) new c(this, getContext(), arrayList));
            listView.setOnItemClickListener(new b(listView));
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -4072646605578913152L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.SearchService.d
    @ey(method = -5552342535355766136L)
    public void j6() {
        try {
            if (mb) {
                iy.gn(5394805134780743136L, this);
            }
            VH();
            if (ServiceContainer.SI().Mr()) {
                return;
            }
            requestFocus();
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 5394805134780743136L, this);
            }
            throw th;
        }
    }

    @cy(clazz = -2121678864194200299L, container = -2121678864194200299L, user = true)
    private class d {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 1067682927484392995L)
        public String DW;

        @dy(field = -652211990250050396L)
        public FindResult FH;

        @dy(field = 1078706748794217480L)
        public FileSpan Hw;

        @dy(field = -808964688152386500L)
        public boolean j6;

        @dy(field = 557561754521389156L)
        @hy
        final /* synthetic */ SearchBrowser v5;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -4903878499151717181L)
        public d(SearchBrowser searchBrowser, FindResult findResult) {
            try {
                if (Zo) {
                    iy.EQ(-1009275565215038420L, null, searchBrowser, findResult);
                }
                this.v5 = searchBrowser;
                this.FH = findResult;
                this.Hw = new FileSpan(findResult.WB, findResult.mb, findResult.jw, findResult.mb, findResult.fY);
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, -1009275565215038420L, null, searchBrowser, findResult);
                }
                throw th;
            }
        }

        @ey(method = 94174370371684473L)
        public d(SearchBrowser searchBrowser, String str) {
            try {
                if (Zo) {
                    iy.EQ(5312621452430580652L, null, searchBrowser, str);
                }
                this.v5 = searchBrowser;
                this.j6 = true;
                this.DW = FileSystem.getName(str);
                this.Hw = new FileSpan(str, 1, 1, 1, 1);
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, 5312621452430580652L, null, searchBrowser, str);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 1174803720017840L)
    public SearchBrowser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (mb) {
                iy.EQ(-3807435117804746712L, null, context, attributeSet);
            }
            this.WB = new GlobalKeyCommand(AppCommands.tp());
            Zo();
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -3807435117804746712L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
