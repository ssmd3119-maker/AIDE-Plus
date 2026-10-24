package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.aide.common.AndroidHelper;
import com.aide.engine.SyntaxError;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.services.OpenFileService;
import com.aide.ui.util.FileSpan;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -3968052299060732145L, container = -3968052299060732145L, user = true)
/* loaded from: classes.dex */
public class AIDEEditorPager extends ViewPager implements OpenFileService.OpenFileSupport {

    @fy
    private static /* synthetic */ boolean GT;

    @gy
    private static /* synthetic */ boolean Hl;

    @dy(field = 1942339783957629808L)
    private boolean GK;

    @dy(field = -3745113740630994609L)
    private e PH;

    @dy(field = -186450538640107392L)
    private QuickActionMenu Yi;

    @dy(field = 62378907484387941L)
    private QuickActionMenu dW;

    @dy(field = 4110765797799949155L)
    private boolean hp;

    @dy(field = -2827123451527359705L)
    private List<View> xg;

    @cy(clazz = 5818179166017709392L, container = -3968052299060732145L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 2430587531802864L)
        final /* synthetic */ int WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -80455483163278960L)
        a(int i) {
            this.WB = i;
        }

        @Override // java.lang.Runnable
        @ey(method = -1399991022045178552L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-3338197272073846300L, this);
                }
                AIDEEditorPager.this.setCurrentItem(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -3338197272073846300L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5818318377292727903L, container = -3968052299060732145L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -86789506283533125L)
        b() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1537961765766624432L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(6841922155465252773L, this);
                }
                AIDEEditorPager.this.getActivity().q7();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 6841922155465252773L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 5818457588571809708L, container = -3968052299060732145L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -256038920664948315L)
        c() {
        }

        @Override // java.lang.Runnable
        @ey(method = -1044304623399460104L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(4105475561122436400L, this);
                }
                if (ServiceContainer.vJ()) {
                    return;
                }
                AIDEEditorPager.this.PH.FH(AIDEEditorPager.this.GK);
                if (AIDEEditorPager.this.getCurrentEditor() != null) {
                    AIDEEditorPager.this.getCurrentEditor().e9(AIDEEditorPager.this.GK);
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 4105475561122436400L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -87466772743520944L, container = -87466772743520944L, user = true)
    public interface e {
        @ey(method = 6319227182567060571L)
        void FH(boolean z);

        @ey(method = 1329425424520648851L)
        void j6(boolean z);
    }

    static {
        iy.Zo(AIDEEditorPager.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 120348285738341696L)
    public AIDEEditorPager(Context context) {
        super(context);
        try {
            if (GT) {
                iy.tp(-2327530196293463352L, null, context);
            }
            this.xg = new ArrayList();
            hz();
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -2327530196293463352L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1266192317842681600L)
    private int CU(String str) {
        try {
            if (GT) {
                iy.tp(516864804174630681L, this, str);
            }
            for (int i = 0; i < this.xg.size(); i++) {
                if (et(i).getFilePath().equals(str)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, 516864804174630681L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2048619140906672037L)
    private AIDEEditor et(int i) {
        try {
            if (GT) {
                iy.u7(-508718026962789640L, this, i);
            }
            if (i < 0 || i >= this.xg.size()) {
                return null;
            }
            return (AIDEEditor) this.xg.get(i).findViewById(q.editorCodeEditor);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -508718026962789640L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2847929895977267580L)
    public MainActivity getActivity() {
        try {
            if (GT) {
                iy.gn(-4455515549936592835L, this);
            }
            return (MainActivity) getContext();
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -4455515549936592835L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2291175875694898539L)
    public AIDEEditor getCurrentEditor() {
        try {
            if (GT) {
                iy.gn(5525922798284042128L, this);
            }
            int currentItem = getCurrentItem();
            if (currentItem < 0) {
                return null;
            }
            return et(currentItem);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 5525922798284042128L, this);
            }
            throw th;
        }
    }

    @ey(method = -3739317940005358299L)
    private List<AIDEEditor> getEditors() {
        try {
            if (GT) {
                iy.gn(1110780279051436880L, this);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.xg.size(); i++) {
                arrayList.add(et(i));
            }
            return arrayList;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 1110780279051436880L, this);
            }
            throw th;
        }
    }

    @ey(method = 1670636860199870979L)
    private void hz() {
        try {
            if (GT) {
                iy.gn(-49468382738060160L, this);
            }
            try {
                Field declaredField = getClass().getSuperclass().getDeclaredField("mTouchSlop");
                declaredField.setAccessible(true);
                declaredField.setInt(this, 10);
            } catch (Exception unused) {
            }
            ServiceContainer.getOpenFileService().cn(this);
            setAdapter(new d(this, null));
            setVisible(false);
            setPageMargin(1);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{p.color_page_separator});
            int color = typedArrayObtainStyledAttributes.getColor(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            setPageMarginDrawable(new ColorDrawable(color));
            this.dW = new QuickActionMenu(ServiceContainer.getMainActivity(), s.editor_context_menu);
            this.Yi = new QuickActionMenu(ServiceContainer.getMainActivity(), s.editor_small_context_menu);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -49468382738060160L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -725214844213758433L)
    public void qp() {
        try {
            if (GT) {
                iy.gn(-5838888106998695628L, this);
            }
            postDelayed(new b(), 50L);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -5838888106998695628L, this);
            }
            throw th;
        }
    }

    @ey(method = 1119496026323642780L)
    private void setVisible(boolean z) {
        try {
            if (GT) {
                iy.Ws(681408503601796425L, this, z);
            }
            View rootView = getRootView();
            if (rootView != null) {
                View viewFindViewById = rootView.findViewById(q.mainCodePageView);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 0 : 4);
                }
                View viewFindViewById2 = rootView.findViewById(q.mainCodeEmptyView);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setVisibility(z ? 4 : 0);
                }
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, 681408503601796425L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2128032536142633687L)
    public boolean AL(int i, int i2, String str) {
        try {
            if (GT) {
                iy.we(2495713666394815992L, this, new Integer(i), new Integer(i2), str);
            }
            if (getCurrentEditor() != null) {
                return getCurrentEditor().gG(i, i2, str);
            }
            return false;
        } catch (Throwable th) {
            if (Hl) {
                iy.U2(th, 2495713666394815992L, this, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -78717592179804768L)
    public void Eq() {
        try {
            if (GT) {
                iy.gn(-5194196322130619073L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().e3();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -5194196322130619073L, this);
            }
            throw th;
        }
    }

    @ey(method = -4048055430549512368L)
    public void Ev() {
        try {
            if (GT) {
                iy.gn(186786251967279293L, this);
            }
            Iterator<AIDEEditor> it = getEditors().iterator();
            while (it.hasNext()) {
                it.next().aX();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 186786251967279293L, this);
            }
            throw th;
        }
    }

    @ey(method = 1910917216700754632L)
    public boolean FN() {
        try {
            if (GT) {
                iy.gn(1658251684764146059L, this);
            }
            if (getCurrentEditor() != null) {
                if (getCurrentEditor().ef()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 1658251684764146059L, this);
            }
            throw th;
        }
    }

    @ey(method = 1688162267346557277L)
    public void Jl() {
        try {
            if (GT) {
                iy.gn(-35821069183976632L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().XG();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -35821069183976632L, this);
            }
            throw th;
        }
    }

    @ey(method = -1441872028981390761L)
    public void OW() {
        try {
            if (GT) {
                iy.gn(2644577955547819992L, this);
            }
            Iterator<AIDEEditor> it = getEditors().iterator();
            while (it.hasNext()) {
                it.next().cT();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 2644577955547819992L, this);
            }
            throw th;
        }
    }

    @ey(method = 4176131299538349281L)
    public void Q6() {
        try {
            if (GT) {
                iy.gn(-1916459344037069000L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().ce();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1916459344037069000L, this);
            }
            throw th;
        }
    }

    @ey(method = 1233854726172499619L)
    public void WB() {
        try {
            if (GT) {
                iy.gn(1014759006384677232L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().sM();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 1014759006384677232L, this);
            }
            throw th;
        }
    }

    @ey(method = -1866738563210358912L)
    public void XG() {
        try {
            if (GT) {
                iy.gn(780224998977217513L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().Q6();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 780224998977217513L, this);
            }
            throw th;
        }
    }

    @ey(method = 1663121049652645632L)
    public void XX() {
        try {
            if (GT) {
                iy.gn(-56275003118808747L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().a8();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -56275003118808747L, this);
            }
            throw th;
        }
    }

    @ey(method = 1000929817680419748L)
    public void Xa() {
        try {
            if (GT) {
                iy.gn(-1015538955786159961L, this);
            }
            this.dW.tp();
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1015538955786159961L, this);
            }
            throw th;
        }
    }

    @ey(method = -553110940309719096L)
    public void Z1(Rect rect) {
        try {
            if (GT) {
                iy.tp(-136839033270134995L, this, rect);
            }
            this.dW.QX(ServiceContainer.getMainActivity().ca(rect), false);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -136839033270134995L, this, rect);
            }
            throw th;
        }
    }

    @ey(method = 4548485701642316931L)
    public boolean aq() {
        try {
            if (GT) {
                iy.gn(4160120989318578856L, this);
            }
            if (getCurrentEditor() == null || !this.GK) {
                return false;
            }
            return !ServiceContainer.getMainActivity().et();
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 4160120989318578856L, this);
            }
            throw th;
        }
    }

    @ey(method = -5984667537413032103L)
    public void br() {
        try {
            if (GT) {
                iy.gn(2293961989768193472L, this);
            }
            Iterator<AIDEEditor> it = getEditors().iterator();
            while (it.hasNext()) {
                it.next().q7();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 2293961989768193472L, this);
            }
            throw th;
        }
    }

    @ey(method = -7550430655442395736L)
    public void cT(String str, String str2, int i, boolean z, String str3, String str4, boolean z2, String str5, String str6, int i2, boolean z3) throws Throwable {
        boolean z4;
        boolean z5 = z2;
        try {
            if (GT) {
                iy.QX(2707615534692109569L, this, new Object[]{str, str2, new Integer(i), new Boolean(z), str3, str4, new Boolean(z5), str5, str6, new Integer(i2), new Boolean(z3)});
            }
            Eq();
            ServiceContainer.getOpenFileService().sh(str);
            for (AIDEEditor aIDEEditor : getFileEditors()) {
                if (str == null || aIDEEditor.getFilePath().equals(str)) {
                    z4 = z5;
                    aIDEEditor.An(str2, i, z, str3, str4, z2, str5, str6, i2, z3);
                } else {
                    z4 = z5;
                    try {
                        aIDEEditor.An(str2, i, z, null, null, false, null, null, -1, false);
                    } catch (Throwable th) {
                        th = th;
                        if (Hl) {
                            iy.rN(th, 2707615534692109569L, this, new Object[]{str, str2, new Integer(i), new Boolean(z), str3, str4, new Boolean(z4), str5, str6, new Integer(i2), new Boolean(z3)});
                        }
                        throw th;
                    }
                }
                z5 = z4;
            }
        } catch (Throwable th2) {
            th = th2;
            z4 = z5;
        }
    }

    @Override // com.aide.ui.services.OpenFileService.OpenFileSupport
    @ey(method = -1440085497685435233L)
    public void closeFile(String str) {
        try {
            if (GT) {
                iy.tp(-1400278428347051728L, this, str);
            }
            int iCU = CU(str);
            if (iCU >= 0) {
                et(iCU).aX();
                this.xg.remove(iCU);
                getAdapter().notifyDataSetChanged();
                if (this.xg.size() == 0) {
                    setVisible(false);
                }
                getActivity().ko(iCU);
                qp();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -1400278428347051728L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1680879514417814403L)
    public void fY() {
        try {
            if (GT) {
                iy.gn(-39506849449129540L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().sy();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -39506849449129540L, this);
            }
            throw th;
        }
    }

    @ey(method = -26214294137326336L)
    public List<KeyStrokeCommand> getBasicEditorCommands() {
        try {
            if (GT) {
                iy.gn(-3972918752254847731L, this);
            }
            return new AIDEEditor(getContext()).getBasicEditorCommands();
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -3972918752254847731L, this);
            }
            throw th;
        }
    }

    @ey(method = -261053357605716445L)
    public int getCurrentFileLineCount() {
        try {
            if (GT) {
                iy.gn(-225860294565125472L, this);
            }
            if (getCurrentEditor() != null) {
                return getCurrentEditor().getLineCount();
            }
            return 0;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -225860294565125472L, this);
            }
            throw th;
        }
    }

    @ey(method = 4053033192506603380L)
    public FileSpan getCurrentFileSpan() {
        try {
            if (GT) {
                iy.gn(4551961522323479439L, this);
            }
            AIDEEditor currentEditor = getCurrentEditor();
            return currentEditor == null ? new FileSpan(null, 0, 0, 0, 0) : new FileSpan(currentEditor.getFilePath(), currentEditor.getSelectionStartLine(), currentEditor.getSelectionStartColumn(), currentEditor.getSelectionEndLine(), currentEditor.getSelectionEndColumn());
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 4551961522323479439L, this);
            }
            throw th;
        }
    }

    @ey(method = -4484515111155649911L)
    public List<AIDEEditor> getFileEditors() {
        try {
            if (GT) {
                iy.gn(1528262923862780856L, this);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.xg.size(); i++) {
                arrayList.add(et(i));
            }
            return arrayList;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 1528262923862780856L, this);
            }
            throw th;
        }
    }

    @ey(method = -1583734359453043200L)
    public String getQuickKeys() {
        try {
            if (GT) {
                iy.gn(-1376812708265644991L, this);
            }
            if (getCurrentEditor() != null) {
                return getCurrentEditor().getQuickKeys();
            }
            return null;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1376812708265644991L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = 2962531231836415416L)
    public String getSelectionContent() {
        long selectionContent = -5289718353106690437;
        try {
            if (GT) {
                iy.gn(-5289718353106690437L, this);
            }
            if (getCurrentEditor() == null) {
                return "";
            }
            selectionContent = getCurrentEditor().getSelectionContent();
            return selectionContent;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, selectionContent, this);
            }
            throw th;
        }
    }

    @ey(method = 9206517608037629L)
    public int getTabSize() {
        try {
            if (GT) {
                iy.gn(-3885336373270508880L, this);
            }
            if (getCurrentEditor() != null) {
                return getCurrentEditor().getTabSize();
            }
            return 4;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -3885336373270508880L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.OpenFileService.OpenFileSupport
    @ey(method = 5738585635497683241L)
    public String getVisibleFile() {
        try {
            if (GT) {
                iy.gn(-24152535680889696L, this);
            }
            if (getCurrentEditor() != null) {
                return getCurrentEditor().getFilePath();
            }
            return null;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -24152535680889696L, this);
            }
            throw th;
        }
    }

    @ey(method = -2127421459102544833L)
    public void hK(String str, String str2, String... strArr) {
        try {
            if (GT) {
                iy.we(-1098722210504450208L, this, str, str2, strArr);
            }
            for (AIDEEditor aIDEEditor : getFileEditors()) {
                if (aIDEEditor.getFilePath().equals(str)) {
                    aIDEEditor.Za(str2, strArr);
                }
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.U2(th, -1098722210504450208L, this, str, str2, strArr);
            }
            throw th;
        }
    }

    @ey(method = 46407820862896155L)
    public void jJ() {
        try {
            if (GT) {
                iy.gn(-1783991656068023368L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().AE();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1783991656068023368L, this);
            }
            throw th;
        }
    }

    @ey(method = -7998443682870595267L)
    public boolean jO() {
        try {
            if (GT) {
                iy.gn(-379449575989442992L, this);
            }
            return this.GK;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -379449575989442992L, this);
            }
            throw th;
        }
    }

    @ey(method = 444025288228464840L)
    public void jw() {
        try {
            if (GT) {
                iy.gn(-1416860636590944465L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().Qq();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1416860636590944465L, this);
            }
            throw th;
        }
    }

    @ey(method = -286271893419553485L)
    public void k2() {
        try {
            if (GT) {
                iy.gn(-649726320705564440L, this);
            }
            this.dW.J8();
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -649726320705564440L, this);
            }
            throw th;
        }
    }

    @ey(method = 219401634023084965L)
    public void kQ() {
        try {
            if (GT) {
                iy.gn(312650716103187904L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().lg();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 312650716103187904L, this);
            }
            throw th;
        }
    }

    @ey(method = 4155666174452912289L)
    public void kf(int i) {
        try {
            if (GT) {
                iy.u7(-540574527668917748L, this, i);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().MP(i);
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -540574527668917748L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2322582874903460128L)
    public boolean ko() {
        try {
            if (GT) {
                iy.gn(2048632136247108465L, this);
            }
            if (getCurrentEditor() != null) {
                if (getCurrentEditor().vJ()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 2048632136247108465L, this);
            }
            throw th;
        }
    }

    @ey(method = -4614677709331040064L)
    public void mb() {
        try {
            if (GT) {
                iy.gn(3332296791282577503L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().ys();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 3332296791282577503L, this);
            }
            throw th;
        }
    }

    @ey(method = 3555460725662738125L)
    public void n5(Rect rect) {
        try {
            if (GT) {
                iy.tp(4251233344251637540L, this, rect);
            }
            this.Yi.QX(ServiceContainer.getMainActivity().ca(rect), false);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, 4251233344251637540L, this, rect);
            }
            throw th;
        }
    }

    @ey(method = -408915955303639092L)
    public boolean oY(String str) {
        try {
            if (GT) {
                iy.tp(-817482676079940175L, this, str);
            }
            if (!isInTouchMode()) {
                return false;
            }
            for (AIDEEditor aIDEEditor : getFileEditors()) {
                if (aIDEEditor.getFilePath().equals(str)) {
                    return aIDEEditor.Cz();
                }
            }
            return false;
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -817482676079940175L, this, str);
            }
            throw th;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    @ey(method = -397494426153348297L)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (GT) {
                iy.tp(-8549092096721281600L, this, motionEvent);
            }
            if (AndroidHelper.rN(motionEvent)) {
                return false;
            }
            if (motionEvent.getAction() == 0 && getCurrentEditor() != null && getCurrentEditor().Sf(motionEvent)) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -8549092096721281600L, this, motionEvent);
            }
            throw th;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @ey(method = -912574882686596080L)
    protected void onMeasure(int i, int i2) {
        try {
            if (GT) {
                iy.EQ(-1583680889294933121L, this, new Integer(i), new Integer(i2));
            }
            super.onMeasure(i, i2);
            float fWs = AndroidHelper.Ws(getContext());
            if (fWs > 0.0f) {
                boolean z = AndroidHelper.Zo(getContext()) - fWs > 100.0f && AndroidHelper.aM(ServiceContainer.getContext());
                if (this.GK != z) {
                    this.GK = z;
                    if (this.PH != null) {
                        this.PH.j6(z);
                        postDelayed(new c(), 100L);
                    }
                }
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.Mr(th, -1583680889294933121L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.OpenFileService.OpenFileSupport
    @ey(method = 1371380498586146537L)
    public OpenFileService.OpenFileModel openFile(String str) {
        try {
            if (GT) {
                iy.tp(-809262280428190280L, this, str);
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(r.editor, (ViewGroup) null);
            AIDEEditor aIDEEditor = (AIDEEditor) viewInflate.findViewById(q.editorCodeEditor);
            aIDEEditor.setIdentifierClickingEnabled(this.hp);
            OpenFileService.OpenFileModel openFileModelA5 = aIDEEditor.a5(str);
            setVisible(true);
            getActivity().J0(str);
            qp();
            this.xg.add(viewInflate);
            getAdapter().notifyDataSetChanged();
            ServiceContainer.DW().j6((ViewGroup) viewInflate.findViewById(q.editorAdView));
            return openFileModelA5;
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -809262280428190280L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 351449971089507711L)
    public void q7() {
        try {
            if (GT) {
                iy.gn(-1667600134837398976L, this);
            }
            this.dW.Ws(true);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1667600134837398976L, this);
            }
            throw th;
        }
    }

    @ey(method = 946107504056373692L)
    public void setIdentifierClickingEnabled(boolean z) {
        try {
            if (GT) {
                iy.Ws(-1421886350040106071L, this, z);
            }
            this.hp = z;
            Iterator<AIDEEditor> it = getEditors().iterator();
            while (it.hasNext()) {
                it.next().setIdentifierClickingEnabled(z);
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -1421886350040106071L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2529158314994079891L)
    public void setSoftKeyboardListener(e eVar) {
        try {
            if (GT) {
                iy.tp(511012280314397544L, this, eVar);
            }
            this.PH = eVar;
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, 511012280314397544L, this, eVar);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.OpenFileService.OpenFileSupport
    @ey(method = 3115824760554473792L)
    public void visibleFile(String str) {
        try {
            if (GT) {
                iy.tp(-1444283412869684527L, this, str);
            }
            int iCU = CU(str);
            setCurrentItem(iCU);
            postDelayed(new a(iCU), 10L);
            jJ();
            getActivity().Ev(iCU);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -1444283412869684527L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 3417371441214794279L)
    public void w9(int i, int i2, int i3, int i4) {
        try {
            if (GT) {
                iy.J0(-6141611920267008L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            AIDEEditor currentEditor = getCurrentEditor();
            if (currentEditor != null) {
                currentEditor.lp(i, i2, i3, i4);
                if (i == i3 && i2 == i4) {
                    currentEditor.cn();
                }
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.a8(th, -6141611920267008L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -362103879585549465L)
    public SyntaxError wc(int i, int i2) {
        try {
            if (GT) {
                iy.EQ(-1405419191101373240L, this, new Integer(i), new Integer(i2));
            }
            if (getCurrentEditor() != null) {
                return getCurrentEditor().Jl(i, i2);
            }
            return null;
        } catch (Throwable th) {
            if (Hl) {
                iy.Mr(th, -1405419191101373240L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4227695096229251328L)
    public void yO() {
        try {
            if (GT) {
                iy.gn(66923386446924335L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().rN();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 66923386446924335L, this);
            }
            throw th;
        }
    }

    @ey(method = -4124454039247420035L)
    public void ye() {
        try {
            if (GT) {
                iy.gn(6384961641449778976L, this);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().QO();
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 6384961641449778976L, this);
            }
            throw th;
        }
    }

    @ey(method = 37481279470857873L)
    public void zh(int i, int i2, int i3, int i4, String str) {
        try {
            if (GT) {
                iy.J8(-2445237505802021280L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            if (getCurrentEditor() != null) {
                getCurrentEditor().aj(i, i2, i3, i4, str);
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.lg(th, -2445237505802021280L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            throw th;
        }
    }

    @cy(clazz = 32783461666032959L, container = 32783461666032959L, user = true)
    private class d extends PagerAdapter {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = 1734308432541792000L)
        private int FH;

        @dy(field = 1636937435541675663L)
        @hy
        final /* synthetic */ AIDEEditorPager Hw;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -435585985877999616L)
        private d(AIDEEditorPager aIDEEditorPager) {
            try {
                if (v5) {
                    iy.tp(7764045007650786648L, null, aIDEEditorPager);
                }
                this.Hw = aIDEEditorPager;
                this.FH = -1;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 7764045007650786648L, null, aIDEEditorPager);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 180947580669192288L)
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            try {
                if (v5) {
                    iy.we(93013581847579968L, this, viewGroup, new Integer(i), obj);
                }
                viewGroup.removeView((View) obj);
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, 93013581847579968L, this, viewGroup, new Integer(i), obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 12345882910875371L)
        public void finishUpdate(ViewGroup viewGroup) {
            try {
                if (v5) {
                    iy.tp(2075053557139822105L, this, viewGroup);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 2075053557139822105L, this, viewGroup);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 3150305639815453849L)
        public int getCount() {
            try {
                if (v5) {
                    iy.gn(281679459614279595L, this);
                }
                return this.Hw.xg.size();
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 281679459614279595L, this);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 5324982504951635225L)
        public int getItemPosition(Object obj) {
            try {
                if (!v5) {
                    return -2;
                }
                iy.tp(-4792400459250777373L, this, obj);
                return -2;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -4792400459250777373L, this, obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -3234117411395396361L)
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            try {
                if (v5) {
                    iy.EQ(-5635023214831935419L, this, viewGroup, new Integer(i));
                }
                View view = (View) this.Hw.xg.get(i);
                viewGroup.addView(view, 0);
                return view;
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -5635023214831935419L, this, viewGroup, new Integer(i));
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -1599161336885820960L)
        public boolean isViewFromObject(View view, Object obj) {
            try {
                if (v5) {
                    iy.EQ(-1070268061041679192L, this, view, obj);
                }
                return view.equals(obj);
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -1070268061041679192L, this, view, obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 2100574655861808035L)
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            try {
                if (v5) {
                    iy.EQ(3015344875449318185L, this, parcelable, classLoader);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 3015344875449318185L, this, parcelable, classLoader);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -389485419121463148L)
        public Parcelable saveState() {
            try {
                if (!v5) {
                    return null;
                }
                iy.gn(1416795068786350000L, this);
                return null;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 1416795068786350000L, this);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -169537386689274492L)
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            try {
                if (v5) {
                    iy.we(-409663537831745400L, this, viewGroup, new Integer(i), obj);
                }
                super.setPrimaryItem(viewGroup, i, obj);
                if (this.FH != i) {
                    this.FH = i;
                    this.Hw.getActivity().Ev(i);
                    this.Hw.Xa();
                    this.Hw.qp();
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, -409663537831745400L, this, viewGroup, new Integer(i), obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -1731899642332452200L)
        public void startUpdate(ViewGroup viewGroup) {
            try {
                if (v5) {
                    iy.tp(-1931214750316077600L, this, viewGroup);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -1931214750316077600L, this, viewGroup);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 262142044845101148L)
        /* synthetic */ d(AIDEEditorPager aIDEEditorPager, a aVar) {
            this(aIDEEditorPager);
            try {
                if (v5) {
                    iy.EQ(-2310187377818858000L, null, aIDEEditorPager, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -2310187377818858000L, null, aIDEEditorPager, aVar);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -6317605759196150419L)
    public AIDEEditorPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (GT) {
                iy.EQ(2325282957063932451L, null, context, attributeSet);
            }
            this.xg = new ArrayList();
            hz();
        } catch (Throwable th) {
            if (Hl) {
                iy.Mr(th, 2325282957063932451L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
