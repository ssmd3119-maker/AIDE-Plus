package com.aide.ui.browsers;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.tf;
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
import com.aide.ui.AppCommands;
import com.aide.ui.AppFileIcons;
import com.aide.ui.GlobalKeyCommand;
import com.aide.ui.MainActivity;
import com.aide.ui.QuickActionMenu;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.s;
import com.aide.ui.services.FileBrowserService;
import com.aide.ui.util.FileSystem;
import com.aide.ui.views.CustomKeysListView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@cy(clazz = 5630979006676181253L, container = 5630979006676181253L, user = true)
/* loaded from: classes.dex */
public class FileBrowser extends LinearLayout implements FileBrowserService.a, com.aide.ui.browsers.a {

    @fy
    private static /* synthetic */ boolean k2;

    @gy
    private static /* synthetic */ boolean zh;

    @dy(field = 2068764923731779201L)
    private QuickActionMenu WB;

    @dy(field = -2456717333687695815L)
    protected View fY;

    @dy(field = -4817546703576642376L)
    private KeyStrokeDetector.KeyStrokeHandler jw;

    @dy(field = -1079241939401435432L)
    private QuickActionMenu mb;

    @dy(field = 2016147934576052816L)
    private g qp;

    @cy(clazz = 974127255699943912L, container = 5630979006676181253L, user = true)
    class a implements AdapterView.OnItemSelectedListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 4970772836336242920L)
        final /* synthetic */ CustomKeysListView j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -145245548818052735L)
        a(CustomKeysListView customKeysListView) {
            this.j6 = customKeysListView;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        @ey(method = 873626513395257995L)
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (FH) {
                    iy.J0(309076927363851612L, this, adapterView, view, new Integer(i), new Long(j));
                }
                FileBrowser.this.Mr((h) this.j6.getItemAtPosition(i));
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, 309076927363851612L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        @ey(method = -1002715361939203776L)
        public void onNothingSelected(AdapterView<?> adapterView) {
            try {
                if (FH) {
                    iy.tp(-600036516860059017L, this, adapterView);
                }
                FileBrowser.this.Mr(null);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -600036516860059017L, this, adapterView);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 974143495457110929L, container = 5630979006676181253L, user = true)
    class b implements CustomKeysListView.OnKeyEventListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 420296679644325120L)
        b() {
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = -1085023933026698605L)
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(-5856089965633378640L, this, new Integer(i), keyEvent);
                }
                return ServiceContainer.getMainActivity().vJ().onKeyDown(i, keyEvent, FileBrowser.this.jw);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -5856089965633378640L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = -217277351615156976L)
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(-1475147781841344589L, this, new Integer(i), keyEvent);
                }
                return ServiceContainer.getMainActivity().vJ().onKeyUp(i, keyEvent, FileBrowser.this.jw);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -1475147781841344589L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 974159735218341240L, container = 5630979006676181253L, user = true)
    class c implements AdapterView.OnItemLongClickListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -4041167819812565925L)
        final /* synthetic */ CustomKeysListView j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 74006207646434700L)
        c(CustomKeysListView customKeysListView) {
            this.j6 = customKeysListView;
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        @ey(method = -1510103773586112649L)
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (FH) {
                    iy.J0(1424469017040956483L, this, adapterView, view, new Integer(i), new Long(j));
                }
                h hVar = (h) this.j6.getItemAtPosition(i);
                if (hVar == null) {
                    return true;
                }
                FileBrowser.this.Mr(hVar);
                FileBrowser.this.XL(view, true);
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, 1424469017040956483L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 974175974983634845L, container = 5630979006676181253L, user = true)
    class d implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -3743979746965312395L)
        final /* synthetic */ CustomKeysListView WB;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -503489863761342856L)
        d(CustomKeysListView customKeysListView) {
            this.WB = customKeysListView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = 5077622207525730777L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(-1018155886055177617L, this, adapterView, view, new Integer(i), new Long(j));
                }
                h hVar = (h) this.WB.getItemAtPosition(i);
                if (hVar == null) {
                    return;
                }
                if (hVar.Hw != null) {
                    FileBrowser.this.fY = view;
                    FireBaseLogEvent.tp("Browser command: " + hVar.Hw.j6());
                    if (hVar.Hw.isVisible(false)) {
                        hVar.Hw.run();
                        return;
                    }
                    return;
                }
                if (hVar.DW) {
                    FileBrowser.this.getActivity().qp(hVar.FH);
                    return;
                }
                if (hVar.DW()) {
                    String str = hVar.FH;
                    if (str != null) {
                        ServiceContainer.getFileBrowserService().Hw(str);
                    }
                    FileBrowser.this.getListView().setSelection(0);
                    return;
                }
                String str2 = hVar.FH;
                if (str2 != null) {
                    FileBrowser.this.J8(str2);
                }
                FileBrowser.this.getListView().setSelection(0);
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -1018155886055177617L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 974192214752991744L, container = 5630979006676181253L, user = true)
    class e implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -4943421023848718040L)
        final /* synthetic */ ImageView WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 583866643944853515L)
        e(ImageView imageView) {
            this.WB = imageView;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 293067202745516384L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(95576844074624L, this, view);
                }
                ServiceContainer.getFileBrowserService().VH(null);
                FileBrowser.this.XL(this.WB, true);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 95576844074624L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 974208454526411937L, container = 5630979006676181253L, user = true)
    class f implements Comparator<String> {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -325579663024767977L)
        f() {
        }

        @Override // java.util.Comparator
        @ey(method = -174904292936851685L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            try {
                if (mb) {
                    iy.EQ(-1793199605573821267L, this, str, str2);
                }
                boolean zSI = FileSystem.SI(str);
                boolean zSI2 = FileSystem.SI(str2);
                String lowerCase = FileSystem.getName(str).toLowerCase();
                String lowerCase2 = FileSystem.getName(str2).toLowerCase();
                if (zSI && !zSI2) {
                    return -1;
                }
                if (!zSI && zSI2) {
                    return 1;
                }
                if (!zSI || !zSI2) {
                    int iLastIndexOf = lowerCase.lastIndexOf(".");
                    String strSubstring = iLastIndexOf > 0 ? lowerCase.substring(iLastIndexOf) : "";
                    int iLastIndexOf2 = lowerCase2.lastIndexOf(".");
                    int iCompareTo = strSubstring.compareTo(iLastIndexOf2 > 0 ? lowerCase2.substring(iLastIndexOf2) : "");
                    return iCompareTo != 0 ? iCompareTo : lowerCase.compareTo(lowerCase2);
                }
                boolean zWe = FileBrowser.we(lowerCase);
                boolean zWe2 = FileBrowser.we(lowerCase2);
                if (zWe && !zWe2) {
                    return 1;
                }
                if (zWe || !zWe2) {
                    return lowerCase.compareTo(lowerCase2);
                }
                return -1;
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -1793199605573821267L, this, str, str2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3980503035665525340L, container = 3980503035665525340L, user = true)
    private class g extends ListAdapterBase<h> {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -3152439378960422784L)
        @hy
        final /* synthetic */ FileBrowser Hw;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -120577119575832752L)
        private g(FileBrowser fileBrowser) {
            try {
                if (v5) {
                    iy.tp(-1681695123744951504L, null, fileBrowser);
                }
                this.Hw = fileBrowser;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -1681695123744951504L, null, fileBrowser);
                }
                throw th;
            }
        }

        @Override // android.widget.Adapter
        @ey(method = 2266415186838480639L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (v5) {
                    iy.we(907316140778872848L, this, new Integer(i), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(this.Hw.getContext()).inflate(r.filebrowser_entry, viewGroup, false) : view;
                h hVarJ6 = j6(i);
                ((TextView) viewInflate.findViewById(q.filebrowserEntryName)).setText(hVarJ6.j6);
                ((ImageView) viewInflate.findViewById(q.filebrowserEntryFileImage)).setImageResource(hVarJ6.v5);
                return viewInflate;
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, 907316140778872848L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 62432802680197548L)
        /* synthetic */ g(FileBrowser fileBrowser, a aVar) {
            this(fileBrowser);
            try {
                if (v5) {
                    iy.EQ(4262387881960271932L, null, fileBrowser, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 4262387881960271932L, null, fileBrowser, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(FileBrowser.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 14534778025046115L)
    public FileBrowser(Context context) {
        super(context);
        try {
            if (k2) {
                iy.tp(138810922410404769L, null, context);
            }
            this.WB = new QuickActionMenu(ServiceContainer.getMainActivity(), s.filebrowser_context_menu);
            this.mb = new QuickActionMenu(ServiceContainer.getMainActivity(), s.git_context_menu);
            this.jw = new GlobalKeyCommand(AppCommands.VH());
            EQ();
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 138810922410404769L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -989482440531988720L)
    private void EQ() {
        try {
            if (k2) {
                iy.gn(-1999760764677535384L, this);
            }
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            View viewInflate = layoutInflaterFrom.inflate(r.filebrowser, (ViewGroup) null);
            removeAllViews();
            addView(viewInflate);
            getListView().addHeaderView(layoutInflaterFrom.inflate(r.browser_header, (ViewGroup) null), null, false);
            ServiceContainer.getFileBrowserService().Zo(this);
            CustomKeysListView listView = getListView();
            g gVar = new g(this, null);
            this.qp = gVar;
            listView.setAdapter((ListAdapter) gVar);
            listView.setOnItemSelectedListener(new a(listView));
            listView.setOnKeyEventListener(new b());
            listView.setOnItemLongClickListener(new c(listView));
            listView.setOnItemClickListener(new d(listView));
            QX();
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -1999760764677535384L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 911074248264933952L)
    public void J8(String str) {
        try {
            if (k2) {
                iy.tp(-3109423570381883200L, this, str);
            }
            if (ServiceContainer.getProjectService().Sf(str)) {
                while (true) {
                    try {
                        List<String> listJ0 = FileSystem.J0(str);
                        if (listJ0.size() != 1 || !FileSystem.SI(listJ0.get(0))) {
                            break;
                        } else {
                            str = listJ0.get(0);
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            ServiceContainer.getFileBrowserService().Hw(str);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -3109423570381883200L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2805514445274551847L)
    public void Mr(h hVar) {
        try {
            if (k2) {
                iy.tp(3952524197357127117L, this, hVar);
            }
            String str = null;
            if (hVar != null && (hVar.DW || hVar.j6())) {
                str = hVar.FH;
            }
            ServiceContainer.getFileBrowserService().VH(str);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 3952524197357127117L, this, hVar);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 7816705123903312109L)
    public void XL(View view, boolean z) {
        try {
            if (k2) {
                iy.EQ(6106759169996863225L, this, view, new Boolean(z));
            }
            this.WB.QX(view, z);
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, 6106759169996863225L, this, view, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -805950045585860875L)
    private void aM(View view) {
        try {
            if (k2) {
                iy.tp(245134816803786105L, this, view);
            }
            this.mb.QX(view, true);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 245134816803786105L, this, view);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4376236547492012435L)
    public MainActivity getActivity() {
        try {
            if (k2) {
                iy.gn(822834133376817263L, this);
            }
            return (MainActivity) getContext();
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 822834133376817263L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1016907955190792049L)
    public CustomKeysListView getListView() {
        try {
            if (k2) {
                iy.gn(-2111039540909725115L, this);
            }
            return (CustomKeysListView) findViewById(q.filebrowserFileList);
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -2111039540909725115L, this);
            }
            throw th;
        }
    }

    @ey(method = 2705612155847635744L)
    private void j3(List<String> list) {
        try {
            if (k2) {
                iy.tp(545079867821223408L, this, list);
            }
            Collections.sort(list, new f());
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 545079867821223408L, this, list);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -627349660941032580L)
    public static boolean we(String str) {
        try {
            if (k2) {
                iy.tp(-703674388274086572L, null, str);
            }
            if (!str.startsWith(".") && !"bin".equals(str) && !"obj".equals(str) && !"build".equals(str)) {
                if (!"gradle".equals(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -703674388274086572L, null, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = -900043087228106892L)
    public void DW() {
        try {
            if (k2) {
                iy.gn(-2499864083460946020L, this);
            }
            getListView().requestFocus();
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -2499864083460946020L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.browsers.a
    @ey(method = -3017267885089753984L)
    public void FH() {
        try {
            if (k2) {
                iy.gn(4147634361030494472L, this);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 4147634361030494472L, this);
            }
            throw th;
        }
    }

    @ey(method = -4845269214579566332L)
    public void J0() {
        try {
            if (k2) {
                iy.gn(418688876998056540L, this);
            }
            Object selectedItem = getListView().getSelectedItem();
            if (selectedItem instanceof h) {
                Mr((h) selectedItem);
                XL(getListView().getSelectedView(), false);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 418688876998056540L, this);
            }
            throw th;
        }
    }

    @ey(method = 2086819251894932200L)
    public void QX() {
        try {
            if (k2) {
                iy.gn(-2227529659476872952L, this);
            }
            String strJ6 = ServiceContainer.getFileBrowserService().j6();
            ServiceContainer.getFileBrowserService().VH(null);
            CustomKeysListView listView = getListView();
            ((TextView) listView.findViewById(q.browserHeaderLabel)).setText(strJ6);
            ((ImageView) listView.findViewById(q.browserHeaderIcon)).setImageResource(R$drawable.folder_open);
            ImageView imageView = (ImageView) listView.findViewById(q.browserHeaderMenuButton);
            imageView.setOnClickListener(new e(imageView));
            ArrayList arrayList = new ArrayList();
            String parent = FileSystem.getParent(strJ6);
            if (parent != null) {
                arrayList.add(new h(this, parent, "..", false));
            }
            for (tf tfVar : AppCommands.FH()) {
                if (tfVar.isVisible(false)) {
                    arrayList.add(new h(this, tfVar));
                }
            }
            try {
                List<String> listJ0 = FileSystem.J0(strJ6);
                j3(listJ0);
                for (String str : listJ0) {
                    arrayList.add(new h(this, str, FileSystem.getName(str), FileSystem.KD(str)));
                }
            } catch (IOException e2) {
                AppLog.v5(e2);
            }
            this.qp.DW(arrayList);
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -2227529659476872952L, this);
            }
            throw th;
        }
    }

    @ey(method = 2538234820213378335L)
    public void Ws() {
        try {
            if (k2) {
                iy.gn(-783517087055499885L, this);
            }
            aM(this.fY);
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -783517087055499885L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.FileBrowserService.a
    @ey(method = -6439913485212937797L)
    public void j6() {
        try {
            if (k2) {
                iy.gn(577432211910011375L, this);
            }
            QX();
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 577432211910011375L, this);
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    @ey(method = -1240515532150784288L)
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (k2) {
                iy.EQ(1040104897247219712L, this, new Integer(i), keyEvent);
            }
            if (ServiceContainer.getMainActivity().vJ().onKeyDown(i, keyEvent, this.jw)) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, 1040104897247219712L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    @ey(method = -692206091681387751L)
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (k2) {
                iy.EQ(-652052934278676315L, this, new Integer(i), keyEvent);
            }
            if (ServiceContainer.getMainActivity().vJ().onKeyUp(i, keyEvent, this.jw)) {
                return true;
            }
            return super.onKeyUp(i, keyEvent);
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, -652052934278676315L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -11989151698207876L)
    public FileBrowser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (k2) {
                iy.EQ(2129274232320206664L, null, context, attributeSet);
            }
            this.WB = new QuickActionMenu(ServiceContainer.getMainActivity(), s.filebrowser_context_menu);
            this.mb = new QuickActionMenu(ServiceContainer.getMainActivity(), s.git_context_menu);
            this.jw = new GlobalKeyCommand(AppCommands.VH());
            EQ();
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, 2129274232320206664L, null, context, attributeSet);
            }
            throw th;
        }
    }

    @cy(clazz = -1173655237192759335L, container = -1173655237192759335L, user = true)
    private class h {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -2512171421590620000L)
        public boolean DW;

        @dy(field = -2795223587978491317L)
        public String FH;

        @dy(field = 957591483313279661L)
        public tf Hw;

        @dy(field = -1150949598421856008L)
        @hy
        final /* synthetic */ FileBrowser Zo;

        @dy(field = -2794120726679586235L)
        public String j6;

        @dy(field = 2855063803438316545L)
        public int v5;

        static {
            iy.Zo(h.class);
        }

        @ey(method = -8710999644725155271L)
        public h(FileBrowser fileBrowser, String str, String str2, boolean z) {
            try {
                if (VH) {
                    iy.J0(-1391139599401946817L, null, fileBrowser, str, str2, new Boolean(z));
                }
                this.Zo = fileBrowser;
                this.FH = str;
                this.j6 = str2;
                this.DW = z;
                if (z) {
                    this.v5 = AppFileIcons.j6(str);
                    return;
                }
                if (DW()) {
                    this.v5 = R$drawable.folder_open;
                } else if (FileBrowser.we(str2)) {
                    this.v5 = R$drawable.folder_hidden;
                } else {
                    this.v5 = R$drawable.folder;
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.a8(th, -1391139599401946817L, null, fileBrowser, str, str2, new Boolean(z));
                }
                throw th;
            }
        }

        @ey(method = 640257875353174800L)
        public boolean DW() {
            try {
                if (VH) {
                    iy.gn(166256215873474176L, this);
                }
                if (!this.DW) {
                    if (this.j6.equals("..")) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 166256215873474176L, this);
                }
                throw th;
            }
        }

        @ey(method = -2918012092919777952L)
        public boolean j6() {
            try {
                if (VH) {
                    iy.gn(-136595782536153700L, this);
                }
                if (!this.DW) {
                    if (!DW()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -136595782536153700L, this);
                }
                throw th;
            }
        }

        @ey(method = 548274873477771659L)
        public h(FileBrowser fileBrowser, tf tfVar) {
            try {
                if (VH) {
                    iy.EQ(2245128364824339345L, null, fileBrowser, tfVar);
                }
                this.Zo = fileBrowser;
                this.Hw = tfVar;
                this.v5 = tfVar.VH();
                int iJ6 = tfVar.j6();
                if (iJ6 != 0) {
                    this.j6 = fileBrowser.getContext().getResources().getString(iJ6);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, 2245128364824339345L, null, fileBrowser, tfVar);
                }
                throw th;
            }
        }
    }
}
