package com.aide.ui.activities;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import com.aide.common.AIDEHelpActivityStarter;
import com.aide.common.ProgressDialogHandler;
import com.aide.engine.SourceEntity;
import com.aide.engine.service.IGotoSymbolListener;
import com.aide.ui.AppFileIcons;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.ThemedGotoActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.util.FileSpan;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@cy(clazz = -667729815873843261L, container = -667729815873843261L, user = true)
/* loaded from: classes.dex */
public class GotoBrowserActivity extends ThemedGotoActivity {

    @dy(field = 2965950475927668947L)
    private static int fY;

    @fy
    private static /* synthetic */ boolean k2;

    @dy(field = 2954397894246891213L)
    private static CharSequence qp;

    @gy
    private static /* synthetic */ boolean zh;

    @dy(field = 2208308117521503907L)
    private ProgressDialogHandler jw;

    @cy(clazz = 3104761253864004480L, container = -667729815873843261L, user = true)
    class a extends IGotoSymbolListener.Sub {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @cy(clazz = -3645355651115015653L, container = -667729815873843261L, user = true)
        /* renamed from: com.aide.ui.activities.GotoBrowserActivity$a$a, reason: collision with other inner class name */
        class RunnableC0053a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(RunnableC0053a.class);
            }

            @ey(method = -447855666072209760L)
            RunnableC0053a() {
            }

            @Override // java.lang.Runnable
            @ey(method = -1469787027410780785L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-1309041912870389880L, this);
                    }
                    GotoBrowserActivity.this.we(false, null, null);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -1309041912870389880L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -3645438587524209996L, container = -667729815873843261L, user = true)
        class b implements Runnable {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 5225718768665342465L)
            final /* synthetic */ List WB;

            @dy(field = -341180111377889840L)
            final /* synthetic */ String mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 1735358599125635944L)
            b(List list, String str) {
                this.WB = list;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            @ey(method = 1122107774062869825L)
            public void run() {
                try {
                    if (fY) {
                        iy.gn(-1306346713029841333L, this);
                    }
                    GotoBrowserActivity.this.we(false, this.WB, this.mb);
                } catch (Throwable th) {
                    if (qp) {
                        iy.aM(th, -1306346713029841333L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -3645521523929341045L, container = -667729815873843261L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 796951126130988339L)
            final /* synthetic */ SourceEntity WB;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 422993738008351845L)
            c(SourceEntity sourceEntity) {
                this.WB = sourceEntity;
            }

            @Override // java.lang.Runnable
            @ey(method = -2533892616933371395L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-1303651028996467696L, this);
                    }
                    GotoBrowserActivity.this.J0(this.WB.u7(), this.WB.XL(), this.WB.aM(), this.WB.XL(), this.WB.QX());
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1303651028996467696L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -396713054785761944L)
        a() {
        }

        @Override // com.aide.engine.service.IGotoSymbolListener
        @ey(method = 5309698220497313201L)
        public void WB(String str) {
            try {
                if (fY) {
                    iy.tp(-804868531923086595L, this, str);
                }
                GotoBrowserActivity.this.runOnUiThread(new RunnableC0053a());
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -804868531923086595L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IGotoSymbolListener
        @ey(method = -1952466175485904680L)
        public void oY(SourceEntity sourceEntity) {
            try {
                if (fY) {
                    iy.tp(-1674852924305127600L, this, sourceEntity);
                }
                GotoBrowserActivity.this.runOnUiThread(new c(sourceEntity));
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -1674852924305127600L, this, sourceEntity);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.IGotoSymbolListener
        @ey(method = -2736941365033543083L)
        public void qp(String str, List list) {
            try {
                if (fY) {
                    iy.EQ(-4856570968139944599L, this, str, list);
                }
                GotoBrowserActivity.this.runOnUiThread(new b(list, str));
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, -4856570968139944599L, this, str, list);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3104849988059666299L, container = -667729815873843261L, user = true)
    class b implements TextWatcher {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -66889523158409952L)
        b() {
        }

        @Override // android.text.TextWatcher
        @ey(method = 2263546112082843112L)
        public void afterTextChanged(Editable editable) {
            try {
                if (mb) {
                    iy.tp(938085558238178784L, this, editable);
                }
                GotoBrowserActivity.this.QX();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 938085558238178784L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 4671818912845994445L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (mb) {
                    iy.J0(597121357674996413L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.a8(th, 597121357674996413L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -5884923258679252593L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (mb) {
                    iy.J0(3457549426678799915L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.a8(th, 3457549426678799915L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3104938722259391412L, container = -667729815873843261L, user = true)
    class c implements CompoundButton.OnCheckedChangeListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -162525121066708816L)
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        @ey(method = 393531572825580672L)
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            try {
                if (DW) {
                    iy.EQ(3468038664918372864L, this, compoundButton, new Boolean(z));
                }
                GotoBrowserActivity.this.J8();
                GotoBrowserActivity.this.QX();
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 3468038664918372864L, this, compoundButton, new Boolean(z));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3105027456463179819L, container = -667729815873843261L, user = true)
    class d implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -307893847487690715L)
        d() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 354948049583652448L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(3923425854642707217L, this, view);
                }
                GotoBrowserActivity.this.finish();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, 3923425854642707217L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3105116190671031520L, container = -667729815873843261L, user = true)
    class e implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -4298571972590988081L)
        final /* synthetic */ ListView WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -1441080972629899160L)
        e(ListView listView) {
            this.WB = listView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = 3933440491125148023L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(2455827886502858868L, this, adapterView, view, new Integer(i), new Long(j));
                }
                GotoBrowserActivity.this.jw.v5();
                ServiceContainer.getEngineService().ro((SourceEntity) this.WB.getItemAtPosition(i));
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 2455827886502858868L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3105204924882946515L, container = -667729815873843261L, user = true)
    class f implements AdapterView.OnItemLongClickListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 3861802115343216000L)
        final /* synthetic */ ListView j6;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 2144402354520924829L)
        f(ListView listView) {
            this.j6 = listView;
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        @ey(method = 1916650393264503116L)
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (FH) {
                    iy.J0(4396708623437566956L, this, adapterView, view, new Integer(i), new Long(j));
                }
                SourceEntity sourceEntity = (SourceEntity) this.j6.getItemAtPosition(i);
                if (sourceEntity == null || sourceEntity.Ws() == null) {
                    return false;
                }
                ServiceContainer.getMainActivity().sh().Eq();
                AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), sourceEntity.Ws(), com.aide.ui.activities.a.v5().toString());
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, 4396708623437566956L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3105293659098924804L, container = -667729815873843261L, user = true)
    class g implements Comparator<SourceEntity> {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -719666142136592048L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(g.class);
        }

        @ey(method = 618163945873026525L)
        g(String str) {
            this.WB = str;
        }

        @Override // java.util.Comparator
        @ey(method = -660443805243094013L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(SourceEntity sourceEntity, SourceEntity sourceEntity2) {
            try {
                if (jw) {
                    iy.EQ(4531280680893049975L, this, sourceEntity, sourceEntity2);
                }
                boolean zStartsWith = sourceEntity.Mr().toLowerCase().startsWith(this.WB.toLowerCase());
                boolean zStartsWith2 = sourceEntity2.Mr().toLowerCase().startsWith(this.WB.toLowerCase());
                if (zStartsWith && !zStartsWith2) {
                    return -1;
                }
                if (zStartsWith || !zStartsWith2) {
                    return sourceEntity.Mr().compareTo(sourceEntity2.Mr());
                }
                return 1;
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, 4531280680893049975L, this, sourceEntity, sourceEntity2);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3105382393318966387L, container = -667729815873843261L, user = true)
    static /* synthetic */ class h {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 2779722799680255447L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(h.class);
                if (DW) {
                    iy.gn(-3117529652831659872L, null);
                }
                int[] iArr = new int[SourceEntity.b.values().length];
                j6 = iArr;
                try {
                    iArr[SourceEntity.b.Method.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[SourceEntity.b.Field.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[SourceEntity.b.Class.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[SourceEntity.b.File.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[SourceEntity.b.Package.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -3117529652831659872L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2653611534896104011L, container = -2653611534896104011L, user = true)
    private class i extends ArrayAdapter<SourceEntity> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -1004804674504002520L)
        @hy
        final /* synthetic */ GotoBrowserActivity j6;

        @cy(clazz = -4321795477812966568L, container = -2653611534896104011L, user = true)
        class a implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = -537365995129302480L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -112926501012048557L)
            a(i iVar, String str) {
                this.WB = str;
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 494833971742900416L)
            public void onClick(View view) {
                try {
                    if (mb) {
                        iy.tp(670244945818321544L, this, view);
                    }
                    ServiceContainer.getMainActivity().sh().Eq();
                    AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), this.WB, com.aide.ui.activities.a.v5().toString());
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 670244945818321544L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(i.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -1140655428716802929L)
        public i(GotoBrowserActivity gotoBrowserActivity, Context context, List<SourceEntity> list) {
            super(context, r.gotobrowser_entry, list);
            try {
                if (DW) {
                    iy.we(-362731200115586097L, null, gotoBrowserActivity, context, list);
                }
                this.j6 = gotoBrowserActivity;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -362731200115586097L, null, gotoBrowserActivity, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = 284351663703988889L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (DW) {
                    iy.we(-1355610482816193813L, this, new Integer(i), view, viewGroup);
                }
                int i2 = 0;
                View viewInflate = view == null ? LayoutInflater.from(getContext()).inflate(r.gotobrowser_entry, viewGroup, false) : view;
                SourceEntity item = getItem(i);
                ImageView imageView = (ImageView) viewInflate.findViewById(q.gotobrowserEntryImage);
                int i3 = h.j6[item.j3().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            imageView.setImageResource(2131165424);
                        } else if (i3 == 4) {
                            imageView.setImageResource(AppFileIcons.j6(item.u7()));
                        } else if (i3 != 5) {
                            imageView.setImageResource(R$drawable.browser_empty);
                        } else {
                            imageView.setImageResource(R$drawable.pakage);
                        }
                    } else if (item.er()) {
                        imageView.setImageResource(R$drawable.box_light_blue);
                    } else {
                        imageView.setImageResource(2131165196);
                    }
                } else if (item.er()) {
                    imageView.setImageResource(R$drawable.box_light_red);
                } else {
                    imageView.setImageResource(R$drawable.box_red);
                }
                ((TextView) viewInflate.findViewById(q.gotobrowserEntryName)).setText(this.j6.u7(item));
                ((TextView) viewInflate.findViewById(q.gotobrowserEntryContainerName)).setText(this.j6.gn(item));
                View viewFindViewById = viewInflate.findViewById(q.gotobrowserHelpButton);
                String strWs = item.Ws();
                if (strWs == null) {
                    i2 = 8;
                }
                viewFindViewById.setVisibility(i2);
                if (strWs != null) {
                    viewFindViewById.setOnClickListener(new a(this, strWs));
                }
                return viewInflate;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -1355610482816193813L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(GotoBrowserActivity.class);
            if (k2) {
                iy.gn(-3117529652831659872L, null);
            }
            fY = 50;
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -3117529652831659872L, null);
            }
            throw th;
        }
    }

    @ey(method = -1373049774779442183L)
    public GotoBrowserActivity() {
        try {
            if (k2) {
                iy.gn(-1065574352003609532L, null);
            }
            this.jw = new ProgressDialogHandler(this, "Analyzing...");
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -1065574352003609532L, null);
            }
            throw th;
        }
    }

    @ey(method = 53922245087624224L)
    public static void EQ(Activity activity, boolean z, int i2) {
        try {
            if (k2) {
                iy.we(2766505377015924775L, null, activity, new Boolean(z), new Integer(i2));
            }
            Intent intent = new Intent(activity, (Class<?>) GotoBrowserActivity.class);
            intent.putExtra("EXTRA_SYMBOLS", z);
            activity.startActivityForResult(intent, i2);
        } catch (Throwable th) {
            if (zh) {
                iy.U2(th, 2766505377015924775L, null, activity, new Boolean(z), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -541891891794149156L)
    public void J0(String str, int i2, int i3, int i4, int i5) {
        try {
            if (k2) {
                iy.J8(-6739619606312372215L, this, str, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            this.jw.DW();
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((EditText) findViewById(q.gotobrowserSearchBox)).getWindowToken(), 0);
            Intent intent = new Intent();
            intent.putExtra("FILEPATH", str);
            intent.putExtra("STARTLINE_EXTRA", i2);
            intent.putExtra("STARTCOLUMN_EXTRA", i3);
            intent.putExtra("ENDLINE_EXTRA", i4);
            intent.putExtra("ENDCOLUMN_EXTRA", i5);
            setResult(-1, intent);
            finish();
        } catch (Throwable th) {
            if (zh) {
                iy.lg(th, -6739619606312372215L, this, str, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2257502459156571825L)
    public void J8() {
        try {
            if (k2) {
                iy.gn(2471589248868387424L, this);
            }
            we(true, null, null);
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 2471589248868387424L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 220831444424747475L)
    public void QX() {
        try {
            if (k2) {
                iy.gn(2760982640077057004L, this);
            }
            boolean z = !((Switch) findViewById(q.gotobrowserSwitch)).isChecked();
            String strTrim = ((EditText) findViewById(q.gotobrowserSearchBox)).getText().toString().trim();
            if (z) {
                ServiceContainer.getEngineService().cb(strTrim, fY);
            } else {
                ServiceContainer.getEngineService().sh(strTrim, fY);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, 2760982640077057004L, this);
            }
            throw th;
        }
    }

    @ey(method = 2340003444621195565L)
    private void Ws(List<SourceEntity> list, String str) {
        try {
            if (k2) {
                iy.EQ(2244486950744045480L, this, list, str);
            }
            Collections.sort(list, new g(str));
        } catch (Throwable th) {
            if (zh) {
                iy.Mr(th, 2244486950744045480L, this, list, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 7110874651396888645L)
    public String gn(SourceEntity sourceEntity) {
        try {
            if (k2) {
                iy.tp(6517794786912804864L, this, sourceEntity);
            }
            return sourceEntity.j3() == SourceEntity.b.File ? sourceEntity.U2() : sourceEntity.J8();
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 6517794786912804864L, this, sourceEntity);
            }
            throw th;
        }
    }

    @ey(method = 2935191272990465601L)
    public static void tp(Intent intent) {
        try {
            if (k2) {
                iy.tp(3337005965849602700L, null, intent);
            }
            ServiceContainer.getMainActivity().aq(new FileSpan(intent.getExtras().getString("FILEPATH"), intent.getExtras().getInt("STARTLINE_EXTRA"), intent.getExtras().getInt("STARTCOLUMN_EXTRA"), intent.getExtras().getInt("ENDLINE_EXTRA"), intent.getExtras().getInt("ENDCOLUMN_EXTRA")));
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 3337005965849602700L, null, intent);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2591126029782879488L)
    public String u7(SourceEntity sourceEntity) {
        try {
            if (k2) {
                iy.tp(1786028596531637535L, this, sourceEntity);
            }
            String str = "" + sourceEntity.Mr();
            if (sourceEntity.j3() != SourceEntity.b.Method) {
                return str;
            }
            return str + "()";
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 1786028596531637535L, this, sourceEntity);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3261344824627472499L)
    public void we(boolean z, List<SourceEntity> list, String str) {
        try {
            if (k2) {
                iy.we(1325162695545548336L, this, new Boolean(z), list, str);
            }
            if (z) {
                findViewById(q.gotobrowserMessage).setVisibility(8);
                findViewById(q.gotobrowserSymbolList).setVisibility(8);
                findViewById(q.gotobrowserProgress).setVisibility(0);
                return;
            }
            if (list == null) {
                findViewById(q.gotobrowserMessage).setVisibility(0);
                findViewById(q.gotobrowserSymbolList).setVisibility(8);
                findViewById(q.gotobrowserProgress).setVisibility(8);
                ((TextView) findViewById(q.gotobrowserMessage)).setText("> " + fY + " matching items");
                return;
            }
            if (list.size() == 0) {
                findViewById(q.gotobrowserMessage).setVisibility(0);
                findViewById(q.gotobrowserSymbolList).setVisibility(8);
                findViewById(q.gotobrowserProgress).setVisibility(8);
                ((TextView) findViewById(q.gotobrowserMessage)).setText("No matching items");
                return;
            }
            findViewById(q.gotobrowserMessage).setVisibility(8);
            findViewById(q.gotobrowserSymbolList).setVisibility(0);
            findViewById(q.gotobrowserProgress).setVisibility(8);
            Ws(list, str);
            ListView listView = (ListView) findViewById(q.gotobrowserSymbolList);
            listView.setAdapter((ListAdapter) new i(this, this, list));
            listView.setOnItemClickListener(new e(listView));
            listView.setOnItemLongClickListener(new f(listView));
        } catch (Throwable th) {
            if (zh) {
                iy.U2(th, 1325162695545548336L, this, new Boolean(z), list, str);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.ThemedGotoActivity, android.app.Activity
    @ey(method = 586063925840635148L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (k2) {
                iy.tp(196325810694803243L, this, bundle);
            }
            super.onCreate(bundle);
            setContentView(r.gotobrowser);
            ServiceContainer.getEngineService().ca(new a());
            EditText editText = (EditText) findViewById(q.gotobrowserSearchBox);
            editText.addTextChangedListener(new b());
            if (qp != null) {
                editText.setText(qp);
            }
            editText.selectAll();
            Switch r0 = (Switch) findViewById(q.gotobrowserSwitch);
            boolean z = true;
            if (getIntent().getExtras().getBoolean("EXTRA_SYMBOLS", true)) {
                z = false;
            }
            r0.setChecked(z);
            r0.setOnCheckedChangeListener(new c());
            findViewById(q.gotobrowserBackground).setOnClickListener(new d());
            J8();
            QX();
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 196325810694803243L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -18491717931216936L)
    protected void onStart() {
        try {
            if (k2) {
                iy.gn(-3147261160318311015L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "Goto Browser");
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -3147261160318311015L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2333925357254539776L)
    protected void onStop() {
        try {
            if (k2) {
                iy.gn(-2588966595220279479L, this);
            }
            qp = ((EditText) findViewById(q.gotobrowserSearchBox)).getText();
            super.onStop();
            FireBaseLogEvent.DW(this, "Goto Browser");
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -2588966595220279479L, this);
            }
            throw th;
        }
    }
}
