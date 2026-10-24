package com.aide.ui.debugger;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.aide.common.ListAdapterBase;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.debugger.Debugger;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 3296790518352727939L, container = 3296790518352727939L, user = true)
/* loaded from: classes.dex */
public class DebugView extends LinearLayout {

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = -64744109641752525L)
    private d WB;

    @dy(field = -141039651228240960L)
    private String mb;

    @cy(clazz = -3189447614621606240L, container = 3296790518352727939L, user = true)
    class a implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -1879537697954934217L)
        final /* synthetic */ ListView WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -6252832991017295475L)
        a(ListView listView) {
            this.WB = listView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = -495482328383007849L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(-4971612561135926712L, this, adapterView, view, new Integer(i), new Long(j));
                }
                c cVar = (c) this.WB.getAdapter().getItem(i);
                if (cVar.DW != null) {
                    cVar.DW.j6();
                } else if (cVar.j6 != null) {
                    cVar.j6.j6();
                } else if (cVar.FH != null) {
                    cVar.FH.DW();
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -4971612561135926712L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3189507922447283397L, container = 3296790518352727939L, user = true)
    class b implements AdapterView.OnItemLongClickListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 378252246542803036L)
        b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        @ey(method = 534982246111566549L)
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (DW) {
                    iy.J0(-1850133580720404200L, this, adapterView, view, new Integer(i), new Long(j));
                }
                ((ClipboardManager) DebugView.this.getContext().getSystemService("clipboard")).setText(((TextView) view.findViewById(q.debuggerEntryName)).getText().toString().replace(" ", " "));
                Toast.makeText(DebugView.this.getContext(), u.view_toast_copied_to_clipboard, 0).show();
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -1850133580720404200L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 702258453584613601L, container = 702258453584613601L, user = true)
    private class d extends ListAdapterBase<c> {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -595845626104397336L)
        @hy
        final /* synthetic */ DebugView Hw;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 257970821288412981L)
        private d(DebugView debugView) {
            try {
                if (v5) {
                    iy.tp(1589054138625028192L, null, debugView);
                }
                this.Hw = debugView;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 1589054138625028192L, null, debugView);
                }
                throw th;
            }
        }

        @Override // android.widget.Adapter
        @ey(method = 1838905534557894393L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            String str;
            try {
                if (v5) {
                    iy.we(426704612673496020L, this, new Integer(i), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(this.Hw.getContext()).inflate(r.debugger_view_entry, viewGroup, false) : view;
                c cVarJ6 = j6(i);
                TextView textView = (TextView) viewInflate.findViewById(q.debuggerEntryName);
                ImageView imageView = (ImageView) viewInflate.findViewById(q.debuggerEntryImage);
                if (cVarJ6.j6 != null) {
                    String str2 = cVarJ6.j6.j6;
                    if (cVarJ6.j6.DW.length() > 0) {
                        str = str2 + " = " + cVarJ6.j6.DW;
                    } else {
                        str = str2;
                    }
                    textView.setText(str.replace(" ", " "), TextView.BufferType.SPANNABLE);
                    DebugView.FH(textView, str2.length(), str.length(), this.Hw.getResources().getColor(2131034120));
                    if (cVarJ6.j6.FH()) {
                        imageView.setImageResource(R$drawable.box_red);
                    } else if (cVarJ6.j6.Hw()) {
                        imageView.setImageResource(2131165424);
                    } else if (cVarJ6.j6.DW()) {
                        imageView.setImageResource(R$drawable.box_light_blue);
                    } else {
                        imageView.setImageResource(2131165196);
                    }
                } else if (cVarJ6.FH != null) {
                    String str3 = cVarJ6.FH.DW;
                    textView.setText(str3.replace(" ", " "), TextView.BufferType.SPANNABLE);
                    DebugView.FH(textView, str3.indexOf(41) + 1, str3.length(), this.Hw.getResources().getColor(2131034120));
                    if (cVarJ6.FH.j6()) {
                        imageView.setImageResource(R$drawable.box_pink);
                    } else {
                        imageView.setImageResource(R$drawable.box_light_pink);
                    }
                } else if (cVarJ6.DW != null) {
                    String str4 = cVarJ6.DW.DW;
                    String str5 = str4 + ":" + cVarJ6.DW.FH;
                    textView.setText(str5.replace(" ", " "), TextView.BufferType.SPANNABLE);
                    DebugView.FH(textView, str4.length(), str5.length(), this.Hw.getResources().getColor(2131034120));
                    imageView.setImageResource(R$drawable.debugger_breakpoint);
                } else if (cVarJ6.Hw != null) {
                    textView.setText(cVarJ6.Hw, TextView.BufferType.SPANNABLE);
                    DebugView.FH(textView, 0, cVarJ6.Hw.length(), this.Hw.getResources().getColor(2131034120));
                    imageView.setImageResource(R$drawable.debugger_breakpoint);
                }
                return viewInflate;
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, 426704612673496020L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -7060246291236060L)
        /* synthetic */ d(DebugView debugView, a aVar) {
            this(debugView);
            try {
                if (v5) {
                    iy.EQ(957809086877593955L, null, debugView, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 957809086877593955L, null, debugView, aVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(DebugView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -136774090079225456L)
    public DebugView(Context context) {
        super(context);
        try {
            if (jw) {
                iy.tp(861001627604447400L, null, context);
            }
            DW();
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, 861001627604447400L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -654981918627632307L)
    private void DW() {
        try {
            if (jw) {
                iy.gn(199359236841693583L, this);
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            View viewInflate = layoutInflaterFrom.inflate(r.debugger_view, (ViewGroup) null);
            removeAllViews();
            addView(viewInflate);
            ListView listView = getListView();
            listView.addHeaderView(layoutInflaterFrom.inflate(r.browser_header, (ViewGroup) null), null, false);
            d dVar = new d(this, null);
            this.WB = dVar;
            listView.setAdapter((ListAdapter) dVar);
            listView.setOnItemClickListener(new a(listView));
            listView.setOnItemLongClickListener(new b());
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 199359236841693583L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4850519686816106065L)
    public static void FH(TextView textView, int i, int i2, int i3) {
        try {
            if (jw) {
                iy.J0(-3827237572043472389L, null, textView, new Integer(i), new Integer(i2), new Integer(i3));
            }
            ((Spannable) textView.getText()).setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        } catch (Throwable th) {
            if (fY) {
                iy.a8(th, -3827237572043472389L, null, textView, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2601223615736281100L)
    private ListView getListView() {
        try {
            if (jw) {
                iy.gn(4366441087694949144L, this);
            }
            return (ListView) findViewById(q.debuggerEntryList);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, 4366441087694949144L, this);
            }
            throw th;
        }
    }

    @ey(method = -5125881601895516249L)
    public void Hw() {
        try {
            if (jw) {
                iy.gn(-2267992997611496199L, this);
            }
            ListView listView = getListView();
            TextView textView = (TextView) listView.findViewById(q.browserHeaderLabel);
            ImageView imageView = (ImageView) listView.findViewById(q.browserHeaderIcon);
            ImageView imageView2 = (ImageView) listView.findViewById(q.browserHeaderMenuButton);
            if (ServiceContainer.getDebugger().a8()) {
                if (ServiceContainer.getDebugger().QX() != null) {
                    if (ServiceContainer.getDebugger().QX().endsWith("()")) {
                        imageView.setImageResource(R$drawable.box_red);
                    } else {
                        imageView.setImageResource(2131165196);
                    }
                    textView.setText(ServiceContainer.getDebugger().QX());
                    imageView2.setVisibility(8);
                } else {
                    imageView.setImageResource(R$drawable.debugger_suspended);
                    String str = "at " + FileSystem.getName(ServiceContainer.getDebugger().tp());
                    String str2 = str + ":" + ServiceContainer.getDebugger().we();
                    textView.setText(str2, TextView.BufferType.SPANNABLE);
                    FH(textView, str.length(), str2.length(), getResources().getColor(2131034120));
                    imageView2.setVisibility(8);
                }
            } else if (ServiceContainer.getDebugger().aM()) {
                imageView.setImageResource(R$drawable.debugger_run);
                textView.setText(u.view_debugger_running);
                imageView2.setVisibility(8);
            } else if (ServiceContainer.getDebugger().U2()) {
                imageView.setImageResource(R$drawable.debugger_stopped);
                textView.setText(u.view_debugger_stopped);
                imageView2.setVisibility(8);
            } else {
                imageView.setImageResource(R$drawable.debugger_stopped);
                textView.setText(u.view_debugger_not_running);
                imageView2.setVisibility(8);
            }
            ArrayList arrayList = new ArrayList();
            if (!ServiceContainer.getDebugger().a8() || ServiceContainer.getDebugger().QX() == null) {
                List<Debugger.d> listWs = ServiceContainer.getDebugger().Ws();
                if (listWs.size() > 0) {
                    arrayList.add(new c(listWs.get(0)));
                }
                Iterator<Debugger.e> it = ServiceContainer.getDebugger().J8().iterator();
                while (it.hasNext()) {
                    arrayList.add(new c(it.next()));
                }
                for (int i = 1; i < listWs.size(); i++) {
                    arrayList.add(new c(listWs.get(i)));
                }
                Iterator<Debugger.c> it2 = ServiceContainer.getDebugger().gn().iterator();
                while (it2.hasNext()) {
                    arrayList.add(new c(it2.next()));
                }
                if (arrayList.size() == 0 && !ServiceContainer.getDebugger().aM()) {
                    arrayList.add(new c(getContext().getResources().getString(u.view_debugger_breakpoints_text)));
                }
            } else {
                Iterator<Debugger.e> it3 = ServiceContainer.getDebugger().u7().iterator();
                while (it3.hasNext()) {
                    arrayList.add(new c(it3.next()));
                }
            }
            this.WB.DW(arrayList);
            if ((this.mb == null || this.mb.equals(ServiceContainer.getDebugger().QX())) && (this.mb != null || ServiceContainer.getDebugger().QX() == null)) {
                return;
            }
            this.mb = ServiceContainer.getDebugger().QX();
            listView.setSelection(0);
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2267992997611496199L, this);
            }
            throw th;
        }
    }

    @cy(clazz = 3506681731253427192L, container = 3506681731253427192L, user = true)
    private static class c {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -4057768937929765185L)
        public Debugger.c DW;

        @dy(field = 3074579612396885585L)
        public Debugger.d FH;

        @dy(field = 2247460861468773237L)
        public String Hw;

        @dy(field = 4068614801744414784L)
        public Debugger.e j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 342695703487469319L)
        public c(String str) {
            try {
                if (v5) {
                    iy.tp(-3460996985385896896L, null, str);
                }
                this.Hw = str;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -3460996985385896896L, null, str);
                }
                throw th;
            }
        }

        @ey(method = -8146590630258916L)
        public c(Debugger.e eVar) {
            try {
                if (v5) {
                    iy.tp(-3484393909475688715L, null, eVar);
                }
                this.j6 = eVar;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -3484393909475688715L, null, eVar);
                }
                throw th;
            }
        }

        @ey(method = -140349732819721425L)
        public c(Debugger.c cVar) {
            try {
                if (v5) {
                    iy.tp(1237896186387844608L, null, cVar);
                }
                this.DW = cVar;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 1237896186387844608L, null, cVar);
                }
                throw th;
            }
        }

        @ey(method = -566664510410023437L)
        public c(Debugger.d dVar) {
            try {
                if (v5) {
                    iy.tp(788640106707373120L, null, dVar);
                }
                this.FH = dVar;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 788640106707373120L, null, dVar);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -7625239290329996205L)
    public DebugView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (jw) {
                iy.EQ(-994117764957992505L, null, context, attributeSet);
            }
            DW();
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -994117764957992505L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
