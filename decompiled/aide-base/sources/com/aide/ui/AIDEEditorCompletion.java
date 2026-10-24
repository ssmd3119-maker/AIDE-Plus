package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aide.common.AIDEHelpActivityStarter;
import com.aide.common.AndroidHelper;
import com.aide.common.AppLog;
import com.aide.engine.SourceEntity;
import com.aide.engine.service.ICodeCompletionListener;
import com.aide.ui.views.CompletionListView;
import com.aide.ui.views.CustomKeysListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 1778539205842150985L, container = 1778539205842150985L, user = true)
/* loaded from: classes.dex */
public class AIDEEditorCompletion {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 2693471842515329200L)
    private int DW;

    @dy(field = 78590353586071168L)
    private int FH;

    @dy(field = -3574846839822133504L)
    private List<SourceEntity> Hw;

    @dy(field = 2420112092779655064L)
    private boolean VH;

    @dy(field = -540488394973828531L)
    private boolean Zo;

    @dy(field = -3314233803626850409L)
    private boolean gn;

    @dy(field = -2832650542100607144L)
    private AIDEEditor j6;

    @dy(field = -5652961553150573432L)
    private boolean u7;

    @dy(field = -4781042169339541911L)
    private String v5;

    @cy(clazz = -7057479416484808744L, container = 1778539205842150985L, user = true)
    class a extends ICodeCompletionListener.Sub {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = -2520756610768463740L)
        private List<SourceEntity> jw = new ArrayList();

        @cy(clazz = -179152154783528507L, container = 1778539205842150985L, user = true)
        /* renamed from: com.aide.ui.AIDEEditorCompletion$a$a, reason: collision with other inner class name */
        class RunnableC0051a implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(RunnableC0051a.class);
            }

            @ey(method = -224088832167665425L)
            RunnableC0051a(a aVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = 485263347431420844L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(777471123870802176L, this);
                    }
                    ServiceContainer.getMainActivity().j3();
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, 777471123870802176L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -179235748457578440L, container = 1778539205842150985L, user = true)
        class b implements Comparator<SourceEntity> {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -118065233372561680L)
            b(a aVar) {
            }

            @Override // java.util.Comparator
            @ey(method = 1020758115910731345L)
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public int compare(SourceEntity sourceEntity, SourceEntity sourceEntity2) {
                try {
                    if (WB) {
                        iy.EQ(-5702188855058932111L, this, sourceEntity, sourceEntity2);
                    }
                    return sourceEntity.Mr().toLowerCase().compareTo(sourceEntity2.Mr().toLowerCase());
                } catch (Throwable th) {
                    if (mb) {
                        iy.Mr(th, -5702188855058932111L, this, sourceEntity, sourceEntity2);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -179319342127565079L, container = 1778539205842150985L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean k2;

            @fy
            private static /* synthetic */ boolean qp;

            @dy(field = -1257298531607941215L)
            final /* synthetic */ int WB;

            @dy(field = -6684110965140354500L)
            final /* synthetic */ List jw;

            @dy(field = -1310588570267801328L)
            final /* synthetic */ int mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 3044625738836143145L)
            c(int i, int i2, List list) {
                this.WB = i;
                this.mb = i2;
                this.jw = list;
            }

            @Override // java.lang.Runnable
            @ey(method = -1013317306001530400L)
            public void run() {
                try {
                    if (qp) {
                        iy.gn(779943195361478305L, this);
                    }
                    ServiceContainer.getMainActivity().j3();
                    AIDEEditorCompletion.this.J0(this.WB, this.mb, this.jw);
                } catch (Throwable th) {
                    if (k2) {
                        iy.aM(th, 779943195361478305L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -361922537396907123L)
        a() {
        }

        @Override // com.aide.engine.service.ICodeCompletionListener
        @ey(method = 1424925237601204352L)
        public void KH() {
            try {
                if (qp) {
                    iy.gn(-1916804816764552296L, this);
                }
                this.jw = new ArrayList();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -1916804816764552296L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeCompletionListener
        @ey(method = 4911125035837846176L)
        public void UI(String str, long j, int i, int i2, int i3, SourceEntity sourceEntity, String str2) {
            try {
                if (qp) {
                    iy.QX(372754244901186504L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), sourceEntity, str2});
                }
                if (str.equals(ServiceContainer.getOpenFileService().u7()) && j == ServiceContainer.getOpenFileService().EQ()) {
                    if (this.jw.size() < 1000) {
                        Collections.sort(this.jw, new b(this));
                    }
                    List<SourceEntity> list = this.jw;
                    this.jw = null;
                    ServiceContainer.aj(new c(i, i3, list));
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.rN(th, 372754244901186504L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), sourceEntity, str2});
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeCompletionListener
        @ey(method = 167240921394471565L)
        public void jw(String str, long j, int i, int i2) {
            try {
                if (qp) {
                    iy.J0(917661025685274759L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                if (str.equals(ServiceContainer.getOpenFileService().u7())) {
                    ServiceContainer.aj(new RunnableC0051a(this));
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, 917661025685274759L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeCompletionListener
        @ey(method = 1159331326330560675L)
        public void pf(List list) {
            try {
                if (qp) {
                    iy.tp(2859758183347652895L, this, list);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SourceEntity sourceEntity = (SourceEntity) it.next();
                    if (AIDEEditorCompletion.this.gn || !sourceEntity.gW()) {
                        this.jw.add(sourceEntity);
                    }
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 2859758183347652895L, this, list);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -7057595076113416275L, container = 1778539205842150985L, user = true)
    class b implements CustomKeysListView.OnKeyEventListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -287015678729650377L)
        b() {
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = 1590846707559892500L)
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(506653901168409189L, this, new Integer(i), keyEvent);
                }
                return AIDEEditorCompletion.this.j6.br(i, keyEvent);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 506653901168409189L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.CustomKeysListView.OnKeyEventListener
        @ey(method = 515001382428456101L)
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            try {
                if (DW) {
                    iy.EQ(336091092652671776L, this, new Integer(i), keyEvent);
                }
                return AIDEEditorCompletion.this.j6.XX(i, keyEvent);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 336091092652671776L, this, new Integer(i), keyEvent);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -7057710735737960512L, container = 1778539205842150985L, user = true)
    class c implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2956704028662960352L)
        final /* synthetic */ CompletionListView WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -71089238409234192L)
        c(CompletionListView completionListView) {
            this.WB = completionListView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = 2022981893498740200L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(-181699401727077240L, this, adapterView, view, new Integer(i), new Long(j));
                }
                Object itemAtPosition = this.WB.getItemAtPosition(i);
                if (itemAtPosition instanceof SourceEntity) {
                    AIDEEditorCompletion.this.EQ();
                    SourceEntity sourceEntity = (SourceEntity) itemAtPosition;
                    if (sourceEntity.yS()) {
                        AIDEEditorCompletion.this.j6.aj(AIDEEditorCompletion.this.DW, AIDEEditorCompletion.this.FH, AIDEEditorCompletion.this.DW, AIDEEditorCompletion.this.aM(), "");
                        ServiceContainer.getMainActivity().w9();
                        ServiceContainer.getEngineService().BT(ServiceContainer.getOpenFileService().u7(), AIDEEditorCompletion.this.DW, AIDEEditorCompletion.this.FH, sourceEntity);
                    } else {
                        if (!sourceEntity.gW()) {
                            AIDEEditorCompletion.this.a8(sourceEntity.J0());
                            return;
                        }
                        AIDEEditorCompletion.this.a8(sourceEntity.J0());
                        ServiceContainer.getMainActivity().w9();
                        ServiceContainer.getEngineService().FH(ServiceContainer.getOpenFileService().u7(), sourceEntity);
                    }
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -181699401727077240L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -7057826395358441455L, container = 1778539205842150985L, user = true)
    class d implements AdapterView.OnItemLongClickListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -3131373981132855100L)
        final /* synthetic */ CompletionListView j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -159818255850713628L)
        d(AIDEEditorCompletion aIDEEditorCompletion, CompletionListView completionListView) {
            this.j6 = completionListView;
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        @ey(method = 2314983845235487112L)
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (DW) {
                    iy.J0(-281329181097114864L, this, adapterView, view, new Integer(i), new Long(j));
                }
                Object itemAtPosition = this.j6.getItemAtPosition(i);
                if (!(itemAtPosition instanceof SourceEntity)) {
                    return false;
                }
                SourceEntity sourceEntity = (SourceEntity) itemAtPosition;
                if (sourceEntity.Ws() == null) {
                    return false;
                }
                ServiceContainer.getMainActivity().sh().Eq();
                AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), sourceEntity.Ws(), com.aide.ui.activities.a.v5().toString());
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -281329181097114864L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -7057942054974859104L, container = 1778539205842150985L, user = true)
    static /* synthetic */ class e {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -2133375281210822836L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(e.class);
                if (DW) {
                    iy.gn(1303739358679615063L, null);
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
                    j6[SourceEntity.b.Variable.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[SourceEntity.b.Class.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[SourceEntity.b.Keyword.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    j6[SourceEntity.b.Package.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 1303739358679615063L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1568526089479113304L, container = -1568526089479113304L, user = true)
    private class f extends ArrayAdapter<SourceEntity> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 3065063474767672105L)
        @hy
        final /* synthetic */ AIDEEditorCompletion j6;

        @cy(clazz = 2552353373549483033L, container = -1568526089479113304L, user = true)
        class a implements View.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = 3931223091607207940L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -329941007136064816L)
            a(f fVar, String str) {
                this.WB = str;
            }

            @Override // android.view.View.OnClickListener
            @ey(method = 140172327023303768L)
            public void onClick(View view) {
                try {
                    if (mb) {
                        iy.tp(-3789380240492331280L, this, view);
                    }
                    ServiceContainer.getMainActivity().sh().Eq();
                    AIDEHelpActivityStarter.DW(ServiceContainer.getMainActivity(), this.WB, com.aide.ui.activities.a.v5().toString());
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -3789380240492331280L, this, view);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(f.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 33955199291344128L)
        public f(AIDEEditorCompletion aIDEEditorCompletion, Context context, List<SourceEntity> list) {
            super(context, r.completion_list_entry, list);
            try {
                if (DW) {
                    iy.we(-2063073478941615120L, null, aIDEEditorCompletion, context, list);
                }
                this.j6 = aIDEEditorCompletion;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -2063073478941615120L, null, aIDEEditorCompletion, context, list);
                }
                throw th;
            }
        }

        @ey(method = 2903740456553979296L)
        private void DW(TextView textView, int i, int i2, int i3) {
            try {
                if (DW) {
                    iy.J0(-3005756478013671907L, this, textView, new Integer(i), new Integer(i2), new Integer(i3));
                }
                ((Spannable) textView.getText()).setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, -3005756478013671907L, this, textView, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @ey(method = 4322290645157112875L)
        private void j6(TextView textView, int i, int i2) {
            try {
                if (DW) {
                    iy.we(-714438875286499328L, this, textView, new Integer(i), new Integer(i2));
                }
                ((Spannable) textView.getText()).setSpan(new StyleSpan(1), i, i2, 33);
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -714438875286499328L, this, textView, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = -662593737075021288L)
        public View getView(int i, View view, ViewGroup viewGroup) throws Throwable {
            View viewInflate;
            try {
                if (DW) {
                    iy.we(1669117489545004845L, this, new Integer(i), view, viewGroup);
                }
                if (view == null) {
                    try {
                        viewInflate = LayoutInflater.from(getContext()).inflate(r.completion_list_entry, viewGroup, false);
                    } catch (Throwable th) {
                        th = th;
                        if (FH) {
                            iy.U2(th, 1669117489545004845L, this, new Integer(i), view, viewGroup);
                        }
                        throw th;
                    }
                } else {
                    viewInflate = view;
                }
                SourceEntity sourceEntity = (SourceEntity) getItem(i);
                if (sourceEntity == null) {
                    ((TextView) viewInflate.findViewById(q.completionEntryName)).setText("No matches");
                    ((ImageView) viewInflate.findViewById(q.completionEntryImage)).setImageResource(R$drawable.browser_empty);
                    viewInflate.findViewById(q.completionHelpButton).setVisibility(8);
                } else {
                    TextView textView = (TextView) viewInflate.findViewById(q.completionEntryName);
                    String strMr = sourceEntity.Mr();
                    int i2 = e.j6[sourceEntity.j3().ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        String strA8 = sourceEntity.a8();
                        if (strA8 != null) {
                            String str = strMr + strA8;
                            textView.setText(str, TextView.BufferType.SPANNABLE);
                            DW(textView, strMr.length(), str.length(), this.j6.j6.getResources().getColor(2131034120));
                        } else {
                            textView.setText(strMr);
                        }
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            textView.setText(strMr);
                        } else {
                            textView.setText(strMr, TextView.BufferType.SPANNABLE);
                            j6(textView, 0, strMr.length());
                        }
                    } else if (sourceEntity.gW()) {
                        String str2 = strMr + " - " + sourceEntity.J8();
                        textView.setText(str2, TextView.BufferType.SPANNABLE);
                        DW(textView, strMr.length(), str2.length(), this.j6.j6.getResources().getColor(2131034120));
                    } else {
                        textView.setText(strMr);
                    }
                    ImageView imageView = (ImageView) viewInflate.findViewById(q.completionEntryImage);
                    int i3 = e.j6[sourceEntity.j3().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                imageView.setImageResource(2131165196);
                            } else if (i3 != 4) {
                                if (i3 != 6) {
                                    imageView.setImageResource(R$drawable.browser_empty);
                                } else {
                                    imageView.setImageResource(R$drawable.pakage);
                                }
                            } else if (sourceEntity.er()) {
                                imageView.setImageResource(R$drawable.objects_light);
                            } else {
                                imageView.setImageResource(2131165424);
                            }
                        } else if (sourceEntity.er()) {
                            imageView.setImageResource(R$drawable.box_light_blue);
                        } else {
                            imageView.setImageResource(2131165196);
                        }
                    } else if (sourceEntity.er()) {
                        imageView.setImageResource(R$drawable.box_light_red);
                    } else {
                        imageView.setImageResource(R$drawable.box_red);
                    }
                    View viewFindViewById = viewInflate.findViewById(q.completionHelpButton);
                    String strWs = sourceEntity.Ws();
                    viewFindViewById.setVisibility(strWs != null ? 0 : 8);
                    if (strWs != null) {
                        viewFindViewById.setOnClickListener(new a(this, strWs));
                    }
                }
                return viewInflate;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    static {
        iy.Zo(AIDEEditorCompletion.class);
    }

    @ey(method = 140899890186208008L)
    public AIDEEditorCompletion(AIDEEditor aIDEEditor) {
        try {
            if (tp) {
                iy.tp(7737924592516885760L, null, aIDEEditor);
            }
            this.j6 = aIDEEditor;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 7737924592516885760L, null, aIDEEditor);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 911401024282837151L)
    public void J0(int i, int i2, List<SourceEntity> list) {
        try {
            if (tp) {
                iy.we(-1897839110393905520L, this, new Integer(i), new Integer(i2), list);
            }
            if (lg() && this.DW == i && this.FH == i2) {
                return;
            }
            this.DW = i;
            this.FH = i2;
            this.Hw = list;
            if (i != this.j6.getSelectionStartLine() || aM() < this.j6.getSelectionStartColumn() || i2 > this.j6.getSelectionStartColumn()) {
                return;
            }
            if (this.u7 || !J8()) {
                vy(list, this.u7);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -1897839110393905520L, this, new Integer(i), new Integer(i2), list);
            }
            throw th;
        }
    }

    @ey(method = -1979988357863976776L)
    private boolean J8() {
        try {
            if (tp) {
                iy.gn(-1025140882620136669L, this);
            }
            String strXL = XL();
            String strQX = QX(this.Hw, strXL);
            if (strQX.length() <= strXL.length()) {
                return false;
            }
            a8(strQX);
            return true;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1025140882620136669L, this);
            }
            throw th;
        }
    }

    @ey(method = 4118886767565355753L)
    private void KD() {
        try {
            if (tp) {
                iy.gn(4300892421111798980L, this);
            }
            String strXL = XL();
            if (strXL.equals(this.v5)) {
                return;
            }
            CompletionListView completionListViewJ3 = j3(ServiceContainer.getMainActivity().I());
            Ws(completionListViewJ3, strXL);
            if (completionListViewJ3.isFocusable()) {
                completionListViewJ3.requestFocus();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 4300892421111798980L, this);
            }
            throw th;
        }
    }

    @ey(method = -3428009043176178720L)
    private List<SourceEntity> Mr(List<SourceEntity> list, String str) {
        try {
            if (tp) {
                iy.EQ(-1353444063432894261L, this, list, str);
            }
            str = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            for (SourceEntity sourceEntity : list) {
                if (sourceEntity.Mr().toLowerCase().startsWith(str)) {
                    if (!sourceEntity.yS() && !sourceEntity.gW()) {
                        arrayList.add(sourceEntity);
                    }
                    return new ArrayList();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            String str2 = str;
            if (EQ) {
                iy.Mr(th, -1353444063432894261L, this, list, str2);
            }
            throw th;
        }
    }

    @ey(method = 610487569617464139L)
    private void P8() {
        try {
            if (tp) {
                iy.gn(6599028762746136180L, this);
            }
            ServiceContainer.getEngineService().Mz(new a());
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 6599028762746136180L, this);
            }
            throw th;
        }
    }

    @ey(method = 69925958253750724L)
    private String QX(List<SourceEntity> list, String str) {
        try {
            if (tp) {
                iy.EQ(-3743865833961913855L, this, list, str);
            }
            List<SourceEntity> listMr = Mr(list, str);
            String str2 = "";
            if (listMr.size() == 0) {
                return "";
            }
            if (listMr.size() == 1) {
                return listMr.get(0).we();
            }
            while (true) {
                String strWe = listMr.get(0).we();
                if (strWe.length() <= str2.length()) {
                    return str2;
                }
                String str3 = str2 + strWe.charAt(str2.length());
                Iterator<SourceEntity> it = listMr.iterator();
                while (it.hasNext()) {
                    if (!it.next().we().startsWith(str3)) {
                        return str2;
                    }
                }
                str2 = str3;
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, -3743865833961913855L, this, list, str);
            }
            throw th;
        }
    }

    @ey(method = -1508809856848994400L)
    private boolean Ws(ListView listView, String str) {
        try {
            if (tp) {
                iy.EQ(873159587748519123L, this, listView, str);
            }
            this.v5 = str;
            boolean z = false;
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            for (SourceEntity sourceEntity : this.Hw) {
                if (sourceEntity.Mr().toLowerCase().startsWith(lowerCase)) {
                    arrayList.add(sourceEntity);
                }
            }
            if (arrayList.size() == 0) {
                z = true;
                arrayList.add(null);
            }
            if (listView.getAdapter() instanceof f) {
                f fVar = (f) listView.getAdapter();
                fVar.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fVar.add((SourceEntity) it.next());
                }
            } else {
                listView.setAdapter((ListAdapter) new f(this, this.j6.getContext(), arrayList));
            }
            return z;
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 873159587748519123L, this, listView, str);
            }
            throw th;
        }
    }

    @ey(method = -643254966247657896L)
    private String XL() {
        try {
            if (tp) {
                iy.gn(-1364246645131059725L, this);
            }
            return this.j6.vy(this.DW, this.FH, aM());
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1364246645131059725L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 3747974994862056025L)
    public void a8(String str) {
        try {
            if (tp) {
                iy.tp(-4451080642503857496L, this, str);
            }
            int iIndexOf = str.indexOf(124);
            String strReplace = str.replace("|", "");
            this.j6.getKeyStrokeDetector().U2();
            this.j6.aj(this.DW, this.FH, this.DW, aM(), strReplace);
            if (iIndexOf <= 0) {
                this.j6.n5();
            } else {
                int i = this.FH + iIndexOf;
                this.j6.lp(this.DW, i, this.DW, i);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -4451080642503857496L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2971266454539116081L)
    public int aM() {
        try {
            if (tp) {
                iy.gn(1373390264276291216L, this);
            }
            int i = this.FH;
            while (this.j6.SI(this.DW) >= i && rN(this.j6.BT(this.DW, i))) {
                i++;
            }
            return i;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1373390264276291216L, this);
            }
            throw th;
        }
    }

    @ey(method = -1002478545253268460L)
    private void ei(boolean z) {
        try {
            if (tp) {
                iy.Ws(-1591481583156129719L, this, z);
            }
            this.u7 = z;
            if (!z) {
                ServiceContainer.getMainActivity().w9();
            }
            P8();
            ServiceContainer.getEngineService().KD(ServiceContainer.getOpenFileService().u7(), this.j6.getSelectionStartLine(), this.j6.getSelectionStartColumn());
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -1591481583156129719L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -432374264741458647L)
    private boolean gn(char c2) {
        try {
            if (tp) {
                iy.tp(4097289550606552L, this, new Character(c2));
            }
            if (c2 == '<' && this.Zo) {
                return this.j6.getFilePath().toLowerCase().endsWith(".xml") || this.j6.getFilePath().toLowerCase().endsWith(".html") || this.j6.getFilePath().toLowerCase().endsWith(".htm");
            }
            if (c2 == '-' && this.Zo) {
                return this.j6.getFilePath().toLowerCase().endsWith(".css");
            }
            if (Character.isJavaIdentifierStart(c2) && this.Zo) {
                return true;
            }
            return c2 == '.' && this.VH;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 4097289550606552L, this, new Character(c2));
            }
            throw th;
        }
    }

    @ey(method = 863861010935409564L)
    private CompletionListView j3(View view) {
        try {
            if (tp) {
                iy.tp(441579163270966813L, this, view);
            }
            return (CompletionListView) view.findViewById(q.completionList);
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 441579163270966813L, this, view);
            }
            throw th;
        }
    }

    @ey(method = -2413042739635111263L)
    private boolean rN(char c2) {
        try {
            if (tp) {
                iy.tp(574497322721289668L, this, new Character(c2));
            }
            return Character.isJavaIdentifierPart(c2) || c2 == '-';
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 574497322721289668L, this, new Character(c2));
            }
            throw th;
        }
    }

    @ey(method = 1454320492785125847L)
    private boolean tp() {
        try {
            if (tp) {
                iy.gn(1964828127829413456L, this);
            }
            int selectionStartLine = this.j6.getSelectionStartLine();
            int selectionStartColumn = this.j6.getSelectionStartColumn();
            if (selectionStartColumn == 1) {
                return false;
            }
            char cBT = this.j6.BT(selectionStartLine, selectionStartColumn - 1);
            return Character.isJavaIdentifierPart(cBT) || cBT == '.';
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1964828127829413456L, this);
            }
            throw th;
        }
    }

    @ey(method = -1509278956635820656L)
    private boolean u7(char c2) {
        try {
            if (tp) {
                iy.tp(63472143629197945L, this, new Character(c2));
            }
            return !Character.isJavaIdentifierPart(c2);
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 63472143629197945L, this, new Character(c2));
            }
            throw th;
        }
    }

    @ey(method = 811612807211040375L)
    private void vy(List<SourceEntity> list, boolean z) {
        try {
            if (tp) {
                iy.EQ(1002154485141773872L, this, list, new Boolean(z));
            }
            AppLog.DW("openPopup");
            EQ();
            View viewInflate = LayoutInflater.from(this.j6.getContext()).inflate(r.completion_list, (ViewGroup) null);
            CompletionListView completionListViewJ3 = j3(viewInflate);
            boolean zWs = Ws(completionListViewJ3, XL());
            if (z && zWs) {
                return;
            }
            this.j6.getKeyStrokeDetector().U2();
            completionListViewJ3.setKeyStrokeDetector(this.j6.getKeyStrokeDetector());
            completionListViewJ3.setKeyStrokeHandler(this.j6.getKeyStrokeHandler());
            completionListViewJ3.setOnKeyEventListener(new b());
            completionListViewJ3.setOnItemClickListener(new c(completionListViewJ3));
            completionListViewJ3.setOnItemLongClickListener(new d(this, completionListViewJ3));
            float f2 = this.j6.getContext().getResources().getDisplayMetrics().density;
            Rect rect = new Rect();
            AndroidHelper.QX(this.j6.getContext(), rect);
            int i = rect.right - rect.left;
            int i2 = rect.bottom - rect.top;
            int iMin = (int) Math.min(Math.max(500.0f * f2, i / 2), i);
            int iMax = (int) Math.max(Math.min(Math.min(350.0f * f2, i2 / 2), i2 - (250.0f * f2)), f2 * 90.0f);
            this.j6.er(this.DW, iMax);
            Rect rectKD = this.j6.KD(this.DW, this.FH, this.FH);
            int i3 = rectKD.left;
            int i4 = rectKD.bottom;
            if (i3 + iMin > rect.right) {
                i3 = rect.right - iMin;
            }
            ServiceContainer.getMainActivity().QO(viewInflate, new Rect(i3, i4, iMin + i3, iMax + i4));
            if (this.j6.isInTouchMode() || this.j6.Gj()) {
                completionListViewJ3.setFocusable(false);
            } else {
                completionListViewJ3.requestFocus();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 1002154485141773872L, this, list, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 657119662353438172L)
    public void BT(boolean z) {
        try {
            if (tp) {
                iy.Ws(5836979571130542055L, this, z);
            }
            if (z || !lg() || this.j6.isInTouchMode()) {
                return;
            }
            CompletionListView completionListViewJ3 = j3(ServiceContainer.getMainActivity().I());
            completionListViewJ3.setFocusable(true);
            completionListViewJ3.requestFocus();
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 5836979571130542055L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3730846236624086320L)
    public void EQ() {
        try {
            if (tp) {
                iy.gn(1935236164486675773L, this);
            }
            if (lg()) {
                ServiceContainer.getMainActivity().aM();
                this.j6.gW();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1935236164486675773L, this);
            }
            throw th;
        }
    }

    @ey(method = 2849145773409829992L)
    public void SI() {
        try {
            if (tp) {
                iy.gn(1602086211576855413L, this);
            }
            if (tp()) {
                nw();
            } else {
                this.j6.cb();
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1602086211576855413L, this);
            }
            throw th;
        }
    }

    @ey(method = -181005328648115536L)
    public boolean U2() {
        try {
            if (tp) {
                iy.gn(38571571086806127L, this);
            }
            if (ServiceContainer.getMainActivity().I() != null) {
                if (j3(ServiceContainer.getMainActivity().I()).hasFocus()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 38571571086806127L, this);
            }
            throw th;
        }
    }

    @ey(method = 7171421963752811484L)
    public void er(int i, int i2) {
        try {
            if (tp) {
                iy.EQ(1428979700147795695L, this, new Integer(i), new Integer(i2));
            }
            if (!lg()) {
                this.Hw = null;
                return;
            }
            int iAM = aM();
            if (i == this.DW && i2 >= this.FH && i2 <= iAM) {
                KD();
                return;
            }
            this.Hw = null;
            EQ();
        } catch (Throwable th) {
            if (EQ) {
                iy.Mr(th, 1428979700147795695L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1936364803369961217L)
    public void gW() {
        try {
            if (tp) {
                iy.gn(-2766854075364593196L, this);
            }
            this.Hw = null;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -2766854075364593196L, this);
            }
            throw th;
        }
    }

    @ey(method = -3004890186297428352L)
    public boolean lg() {
        try {
            if (tp) {
                iy.gn(-1917561698186754595L, this);
            }
            return ServiceContainer.getMainActivity().I() != null;
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -1917561698186754595L, this);
            }
            throw th;
        }
    }

    @ey(method = -9257236395599875L)
    public void nw() {
        try {
            if (tp) {
                iy.gn(-792051887111398564L, this);
            }
            if (lg()) {
                J8();
            } else {
                ei(false);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -792051887111398564L, this);
            }
            throw th;
        }
    }

    @ey(method = -4155315888912783040L)
    public void we() {
        try {
            if (tp) {
                iy.gn(-434871643898493165L, this);
            }
            this.Zo = AppPreferences.DW();
            this.VH = AppPreferences.j6();
            this.gn = AppPreferences.FH();
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -434871643898493165L, this);
            }
            throw th;
        }
    }

    @ey(method = 553662959998806064L)
    public void yS(char c2, int i, int i2) {
        try {
            if (tp) {
                iy.we(-600591672365931615L, this, new Character(c2), new Integer(i), new Integer(i2));
            }
            if (!lg() && gn(c2) && u7(this.j6.BT(i, i2))) {
                ei(true);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.U2(th, -600591672365931615L, this, new Character(c2), new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
