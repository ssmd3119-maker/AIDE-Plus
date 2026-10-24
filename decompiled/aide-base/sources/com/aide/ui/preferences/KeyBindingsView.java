package com.aide.ui.preferences;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.sf;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aide.common.KeyStroke;
import com.aide.common.MessageBox;
import com.aide.common.ValueRunnable;
import com.aide.ui.AppCommands;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.q;
import com.aide.ui.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 1069513486002832672L, container = 1069513486002832672L, user = true)
/* loaded from: classes.dex */
public class KeyBindingsView extends LinearLayout {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    @cy(clazz = 2128268610100856369L, container = 1069513486002832672L, user = true)
    class a implements Comparator<d> {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 403690978011141005L)
        a() {
        }

        @Override // java.util.Comparator
        @ey(method = 1780985210994649760L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            try {
                if (mb) {
                    iy.EQ(-127754313403819893L, this, dVar, dVar2);
                }
                return dVar.FH.compareTo(dVar2.FH);
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -127754313403819893L, this, dVar, dVar2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2128368484316299752L, container = 1069513486002832672L, user = true)
    class b implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 1388301382798650067L)
        final /* synthetic */ ListView WB;

        @cy(clazz = -1382248507448079691L, container = 1069513486002832672L, user = true)
        class a implements ValueRunnable<KeyStroke> {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = -4330312039608206757L)
            final /* synthetic */ d j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -671448550587315717L)
            a(d dVar) {
                this.j6 = dVar;
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 7624561770031858192L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(KeyStroke keyStroke) {
                try {
                    if (FH) {
                        iy.tp(-1042166347138510677L, this, keyStroke);
                    }
                    ServiceContainer.Mr().v5(this.j6.j6, keyStroke);
                    KeyBindingsView.this.DW();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -1042166347138510677L, this, keyStroke);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = 1598136051938048411L)
        b(ListView listView) {
            this.WB = listView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = -6057663186368965635L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(-149277141292362445L, this, adapterView, view, new Integer(i), new Long(j));
                }
                if (ServiceContainer.getLicenseService().gn((Activity) KeyBindingsView.this.getContext(), "custom_keybindings")) {
                    d dVar = (d) this.WB.getItemAtPosition(i);
                    MessageBox.EQ((Activity) KeyBindingsView.this.getContext(), "Change Keybinding", "Type key binding for \"" + dVar.FH + "\"", dVar.DW.get(0), new a(dVar));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -149277141292362445L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -85110081915062152L, container = -85110081915062152L, user = true)
    private class c extends ArrayAdapter<d> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -480498828975424323L)
        @hy
        final /* synthetic */ KeyBindingsView j6;

        static {
            iy.Zo(c.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 716251069793079569L)
        public c(KeyBindingsView keyBindingsView, Context context, List<d> list) {
            super(context, r.keybindings_entry, list);
            try {
                if (DW) {
                    iy.we(-1989058754971014735L, null, keyBindingsView, context, list);
                }
                this.j6 = keyBindingsView;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -1989058754971014735L, null, keyBindingsView, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = -1307176661615581488L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (DW) {
                    iy.we(367260434547404480L, this, new Integer(i), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(getContext()).inflate(r.keybindings_entry, viewGroup, false) : view;
                d item = getItem(i);
                ((TextView) viewInflate.findViewById(q.keybindingsEntryName)).setText(item.FH);
                ((TextView) viewInflate.findViewById(q.keybindingsEntryBinding)).setText(item.Hw + " ");
                return viewInflate;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, 367260434547404480L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3651883812178991155L, container = 3651883812178991155L, user = true)
    private class d {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 715707312962544375L)
        public List<KeyStroke> DW;

        @dy(field = 2187688768040593059L)
        public String FH;

        @dy(field = -3026987576695201860L)
        public String Hw;

        @dy(field = -3293307229160954349L)
        public KeyStrokeCommand j6;

        @dy(field = 841618432191211500L)
        @hy
        final /* synthetic */ KeyBindingsView v5;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 7814178764726125920L)
        public d(KeyBindingsView keyBindingsView, KeyStrokeCommand keyStrokeCommand) {
            try {
                if (Zo) {
                    iy.EQ(522210046249967881L, null, keyBindingsView, keyStrokeCommand);
                }
                this.v5 = keyBindingsView;
                this.j6 = keyStrokeCommand;
                this.FH = keyStrokeCommand.getName();
                List<KeyStroke> listJ6 = ServiceContainer.Mr().j6(keyStrokeCommand);
                this.DW = listJ6;
                this.Hw = "";
                for (KeyStroke keyStroke : listJ6) {
                    if (this.Hw.length() > 0) {
                        this.Hw += "\n";
                    }
                    this.Hw += keyStroke.toString();
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, 522210046249967881L, null, keyBindingsView, keyStrokeCommand);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(KeyBindingsView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 7643495293452342291L)
    public KeyBindingsView(Context context) {
        super(context);
        try {
            if (WB) {
                iy.tp(-2537849455460240208L, null, context);
            }
            j6();
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, -2537849455460240208L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1963084175977521464L)
    private void j6() {
        try {
            if (WB) {
                iy.gn(873595125408844565L, this);
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(r.keybindings, (ViewGroup) null);
            removeAllViews();
            addView(viewInflate);
            DW();
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 873595125408844565L, this);
            }
            throw th;
        }
    }

    @ey(method = -45141249600417481L)
    public void DW() {
        try {
            if (WB) {
                iy.gn(310341009200785584L, this);
            }
            ArrayList arrayList = new ArrayList();
            for (sf sfVar : AppCommands.Hw()) {
                if (sfVar instanceof KeyStrokeCommand) {
                    arrayList.add(new d(this, (KeyStrokeCommand) sfVar));
                }
            }
            Iterator<KeyStrokeCommand> it = ServiceContainer.getMainActivity().sh().getBasicEditorCommands().iterator();
            while (it.hasNext()) {
                arrayList.add(new d(this, it.next()));
            }
            Collections.sort(arrayList, new a());
            ListView listView = (ListView) findViewById(q.keybindingsList);
            listView.setAdapter((ListAdapter) new c(this, getContext(), arrayList));
            listView.setOnItemClickListener(new b(listView));
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 310341009200785584L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 8091275412421133436L)
    public KeyBindingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (WB) {
                iy.EQ(6161331857279505075L, null, context, attributeSet);
            }
            j6();
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, 6161331857279505075L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -683082135469610611L)
    public KeyBindingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (WB) {
                iy.we(-991751434785633280L, null, context, attributeSet, new Integer(i));
            }
            j6();
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, -991751434785633280L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
