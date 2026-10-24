package com.aide.ui.browsers;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.aide.common.AppLog;
import com.aide.ui.MainActivity;
import com.aide.ui.ServiceContainer;
import com.aide.ui.p;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = 7170002691013857904L, container = 7170002691013857904L, user = true)
/* loaded from: classes.dex */
public class BrowserPager extends ViewPager {

    @dy(field = 1342456123157655344L)
    public static int GK;

    @fy
    private static /* synthetic */ boolean GT;

    @gy
    private static /* synthetic */ boolean Hl;

    @dy(field = 1120387331518436824L)
    public static int PH;

    @dy(field = -1004966466544684080L)
    public static int Yi;

    @dy(field = -4033073711209997289L)
    public static int dW;

    @dy(field = 4266119858823051908L)
    public static int hp;

    @dy(field = 2807499372353070705L)
    private List<View> xg;

    static {
        try {
            iy.Zo(BrowserPager.class);
            if (GT) {
                iy.gn(1222900965941703264L, null);
            }
            hp = 0;
            PH = 1;
            GK = 2;
            dW = 3;
            Yi = 4;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 1222900965941703264L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -279785893167583569L)
    public BrowserPager(Context context) {
        super(context);
        try {
            if (GT) {
                iy.tp(355742942197417088L, null, context);
            }
            this.xg = new ArrayList();
            aj();
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, 355742942197417088L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -2558042141610775680L)
    private void aj() {
        try {
            if (GT) {
                iy.gn(-1628167924942776000L, this);
            }
            this.xg.add(new FileBrowser(getContext()));
            this.xg.add(new ErrorBrowser(getContext()));
            this.xg.add(new SearchBrowser(getContext()));
            if (!ServiceContainer.P8.equals("com.aide.web")) {
                this.xg.add(new DebugBrowser(getContext()));
                this.xg.add(new LogCatBrowser(getContext()));
            }
            try {
                Field declaredField = getClass().getSuperclass().getDeclaredField("mTouchSlop");
                declaredField.setAccessible(true);
                declaredField.setInt(this, 10);
            } catch (Exception unused) {
            }
            setPageMargin(1);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{p.color_page_separator});
            int color = typedArrayObtainStyledAttributes.getColor(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            setPageMarginDrawable(new ColorDrawable(color));
            setAdapter(new b(this, null));
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1628167924942776000L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -725786673878900697L)
    public MainActivity getActivity() {
        try {
            if (GT) {
                iy.gn(-2973102958760902299L, this);
            }
            return (MainActivity) getContext();
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -2973102958760902299L, this);
            }
            throw th;
        }
    }

    @ey(method = -2435790409809513739L)
    private View sy(int i) {
        try {
            if (GT) {
                iy.u7(-1658269343262992145L, this, i);
            }
            return this.xg.get(i);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -1658269343262992145L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 91742134651673459L)
    public void Qq() {
        try {
            if (GT) {
                iy.gn(2673864507656753737L, this);
            }
            lp(getCurrentBrowser(), false);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 2673864507656753737L, this);
            }
            throw th;
        }
    }

    @ey(method = -6975316281287985671L)
    public int getCurrentBrowser() {
        try {
            if (GT) {
                iy.gn(5999678393908928263L, this);
            }
            return getCurrentItem();
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 5999678393908928263L, this);
            }
            throw th;
        }
    }

    @ey(method = 6354984655467235463L)
    public DebugBrowser getDebugBrowser() {
        try {
            if (GT) {
                iy.gn(-1418430002030419615L, this);
            }
            if (!ServiceContainer.P8.equals("com.aide.web")) {
                return (DebugBrowser) sy(dW);
            }
            AppLog.FH("getDebugBrowser called in AIDE_WEB. This shouldn't happen");
            return null;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1418430002030419615L, this);
            }
            throw th;
        }
    }

    @ey(method = -3041212840658685840L)
    public ErrorBrowser getErrorBrowser() {
        try {
            if (GT) {
                iy.gn(1709737516502749640L, this);
            }
            return (ErrorBrowser) sy(PH);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, 1709737516502749640L, this);
            }
            throw th;
        }
    }

    @ey(method = 5676635154046278436L)
    public FileBrowser getFileBrowser() {
        try {
            if (GT) {
                iy.gn(-725548446520063408L, this);
            }
            return (FileBrowser) sy(hp);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -725548446520063408L, this);
            }
            throw th;
        }
    }

    @ey(method = 475901514342060480L)
    public LogCatBrowser getLogCatBrowser() {
        try {
            if (GT) {
                iy.gn(-1165559700885644912L, this);
            }
            if (!ServiceContainer.P8.equals("com.aide.web")) {
                return (LogCatBrowser) sy(Yi);
            }
            AppLog.FH("getLogCatBrowser called in AIDE_WEB. This shouldn't happen");
            return null;
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1165559700885644912L, this);
            }
            throw th;
        }
    }

    @ey(method = 110236454115564000L)
    public SearchBrowser getSearchBrowser() {
        try {
            if (GT) {
                iy.gn(-1500208281327859068L, this);
            }
            return (SearchBrowser) sy(GK);
        } catch (Throwable th) {
            if (Hl) {
                iy.aM(th, -1500208281327859068L, this);
            }
            throw th;
        }
    }

    @ey(method = 3559203833625151920L)
    public void lp(int i, boolean z) {
        try {
            if (GT) {
                iy.EQ(-679815051833613080L, this, new Integer(i), new Boolean(z));
            }
            if (z) {
                setCurrentItem(i);
            } else {
                setCurrentItem(i == 0 ? 1 : 0, false);
                setCurrentItem(i, false);
            }
        } catch (Throwable th) {
            if (Hl) {
                iy.Mr(th, -679815051833613080L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    @ey(method = -296216068059414432L)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (GT) {
                iy.tp(-4284037465930537920L, this, motionEvent);
            }
            if (ServiceContainer.isTrainerMode()) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, -4284037465930537920L, this, motionEvent);
            }
            throw th;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @ey(method = -1280386576990140900L)
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (GT) {
                iy.tp(1651065103633230312L, this, motionEvent);
            }
            if (ServiceContainer.isTrainerMode()) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            if (Hl) {
                iy.j3(th, 1651065103633230312L, this, motionEvent);
            }
            throw th;
        }
    }

    @cy(clazz = -260107755542295984L, container = -260107755542295984L, user = true)
    private class b extends PagerAdapter {

        @gy
        private static /* synthetic */ boolean Zo;

        @fy
        private static /* synthetic */ boolean v5;

        @dy(field = -5001588868059770820L)
        private int FH;

        @dy(field = -1507414598910408437L)
        @hy
        final /* synthetic */ BrowserPager Hw;

        @cy(clazz = -1950761363242833887L, container = -260107755542295984L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -4604547521475448236L)
            final /* synthetic */ int WB;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -3943098598640895309L)
            a(int i) {
                this.WB = i;
            }

            @Override // java.lang.Runnable
            @ey(method = -1114013618569470220L)
            public void run() {
                try {
                    if (jw) {
                        iy.gn(-3865589167580597872L, this);
                    }
                    com.aide.ui.browsers.a aVar = (com.aide.ui.browsers.a) b.this.Hw.xg.get(this.WB);
                    aVar.DW();
                    b.this.Hw.getActivity().J8(this.WB);
                    if (ServiceContainer.vJ()) {
                        return;
                    }
                    aVar.FH();
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3865589167580597872L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = -50651949307839355L)
        private b(BrowserPager browserPager) {
            try {
                if (v5) {
                    iy.tp(4696042342287706315L, null, browserPager);
                }
                this.Hw = browserPager;
                this.FH = -1;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 4696042342287706315L, null, browserPager);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -8695144923287209368L)
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            try {
                if (v5) {
                    iy.we(-694225524779723832L, this, viewGroup, new Integer(i), obj);
                }
                viewGroup.removeView((View) obj);
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, -694225524779723832L, this, viewGroup, new Integer(i), obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 3460431686211911691L)
        public void finishUpdate(ViewGroup viewGroup) {
            try {
                if (v5) {
                    iy.tp(3165488432184322335L, this, viewGroup);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, 3165488432184322335L, this, viewGroup);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 3621796592713959793L)
        public int getCount() {
            try {
                if (v5) {
                    iy.gn(-540060914813204915L, this);
                }
                return this.Hw.xg.size();
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, -540060914813204915L, this);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 1832789633911277309L)
        public int getItemPosition(Object obj) {
            try {
                if (!v5) {
                    return -2;
                }
                iy.tp(-434716997087742111L, this, obj);
                return -2;
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -434716997087742111L, this, obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -810690538209458497L)
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            try {
                if (v5) {
                    iy.EQ(1033477558014601315L, this, viewGroup, new Integer(i));
                }
                View view = (View) this.Hw.xg.get(i);
                viewGroup.addView(view, 0);
                return view;
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 1033477558014601315L, this, viewGroup, new Integer(i));
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 2403159108770575116L)
        public boolean isViewFromObject(View view, Object obj) {
            try {
                if (v5) {
                    iy.EQ(-1641633691068740860L, this, view, obj);
                }
                return view.equals(obj);
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, -1641633691068740860L, this, view, obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -3492920808078623369L)
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            try {
                if (v5) {
                    iy.EQ(878939084124644195L, this, parcelable, classLoader);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 878939084124644195L, this, parcelable, classLoader);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -261575687122720992L)
        public Parcelable saveState() {
            try {
                if (!v5) {
                    return null;
                }
                iy.gn(2596202631176272400L, this);
                return null;
            } catch (Throwable th) {
                if (Zo) {
                    iy.aM(th, 2596202631176272400L, this);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = -575952172138287360L)
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            try {
                if (v5) {
                    iy.we(-1063032299349849248L, this, viewGroup, new Integer(i), obj);
                }
                super.setPrimaryItem(viewGroup, i, obj);
                if (this.FH != i) {
                    this.FH = i;
                    this.Hw.postDelayed(new a(i), 100L);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.U2(th, -1063032299349849248L, this, viewGroup, new Integer(i), obj);
                }
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @ey(method = 1230786012698064136L)
        public void startUpdate(ViewGroup viewGroup) {
            try {
                if (v5) {
                    iy.tp(-1017585920673807800L, this, viewGroup);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.j3(th, -1017585920673807800L, this, viewGroup);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -4400148960932535616L)
        /* synthetic */ b(BrowserPager browserPager, a aVar) {
            this(browserPager);
            try {
                if (v5) {
                    iy.EQ(1579515109528033572L, null, browserPager, aVar);
                }
            } catch (Throwable th) {
                if (Zo) {
                    iy.Mr(th, 1579515109528033572L, null, browserPager, aVar);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -367374996541612476L)
    public BrowserPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (GT) {
                iy.EQ(2579250694206081797L, null, context, attributeSet);
            }
            this.xg = new ArrayList();
            aj();
        } catch (Throwable th) {
            if (Hl) {
                iy.Mr(th, 2579250694206081797L, null, context, attributeSet);
            }
            throw th;
        }
    }
}
