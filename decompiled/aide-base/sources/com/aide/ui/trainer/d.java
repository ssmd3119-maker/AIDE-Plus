package com.aide.ui.trainer;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aide.common.AndroidHelper;
import com.aide.common.TrainerLogo;
import com.aide.common.ValueRunnable;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.trainer.c;
import com.aide.ui.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 570594214568858707L, container = 570594214568858707L, user = true)
/* loaded from: classes.dex */
public class d {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -1175094988323168544L, container = 570594214568858707L, user = true)
    static class a implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 618936239676994327L)
        final /* synthetic */ ValueRunnable WB;

        @dy(field = -3316477497311549928L)
        final /* synthetic */ c.d mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 4175265829573099505L)
        a(ValueRunnable valueRunnable, c.d dVar) {
            this.WB = valueRunnable;
            this.mb = dVar;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 47781758105842233L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(588739095509461479L, this, view);
                }
                this.WB.j6(this.mb);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 588739095509461479L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1175182649162758485L, container = 570594214568858707L, user = true)
    static class b implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -2556257532002697497L)
        final /* synthetic */ Runnable WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -94284663587045104L)
        b(Runnable runnable) {
            this.WB = runnable;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 152281594197672605L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-539198099954736712L, this, view);
                }
                this.WB.run();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -539198099954736712L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1175270309998285132L, container = 570594214568858707L, user = true)
    static class c implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -3910377587337738704L)
        final /* synthetic */ Runnable WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 13000300966753560L)
        c(Runnable runnable) {
            this.WB = runnable;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 16521227574251549L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-78260368499471349L, this, view);
                }
                this.WB.run();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -78260368499471349L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1175357970829748485L, container = 570594214568858707L, user = true)
    /* renamed from: com.aide.ui.trainer.d$d, reason: collision with other inner class name */
    static class ViewOnClickListenerC0095d implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -5683195219867779361L)
        final /* synthetic */ ValueRunnable WB;

        @dy(field = 3478323026236387784L)
        final /* synthetic */ c.d mb;

        static {
            iy.Zo(ViewOnClickListenerC0095d.class);
        }

        @ey(method = 8411896283337192685L)
        ViewOnClickListenerC0095d(ValueRunnable valueRunnable, c.d dVar) {
            this.WB = valueRunnable;
            this.mb = dVar;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -97026262837568459L)
        public void onClick(View view) {
            try {
                if (jw) {
                    iy.tp(386266748386502880L, this, view);
                }
                this.WB.j6(this.mb);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 386266748386502880L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1175445631657148544L, container = 570594214568858707L, user = true)
    static class e implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = 3271485880758312945L)
        final /* synthetic */ Runnable WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 30583545242828688L)
        e(Runnable runnable) {
            this.WB = runnable;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -129641993707097123L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-755672105915975625L, this, view);
                }
                this.WB.run();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -755672105915975625L, this, view);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1175533292480485309L, container = 570594214568858707L, user = true)
    static class f implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        @dy(field = -5592859443883344377L)
        final /* synthetic */ Runnable WB;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 91735015026048000L)
        f(Runnable runnable) {
            this.WB = runnable;
        }

        @Override // android.view.View.OnClickListener
        @ey(method = -78397579374058689L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-290158671951185392L, this, view);
                }
                this.WB.run();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -290158671951185392L, this, view);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(d.class);
    }

    @ey(method = 577273827916841475L)
    public d() {
        try {
            if (j6) {
                iy.gn(-4173775362375382995L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4173775362375382995L, null);
            }
            throw th;
        }
    }

    @ey(method = -5634598635738865407L)
    private static View DW(LinearLayout linearLayout, int i, String str, String str2) {
        try {
            if (j6) {
                iy.J0(3804521334987044463L, null, linearLayout, new Integer(i), str, str2);
            }
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(r.trainer_course_list_entry, (ViewGroup) null);
            ((ImageView) viewInflate.findViewById(q.trainerCourseListEntryLogo)).setImageDrawable(new TrainerLogo(linearLayout.getContext(), i, new String[]{str, str2}));
            linearLayout.addView(viewInflate);
            return viewInflate.findViewById(q.trainerCourseListEntryLayout);
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 3804521334987044463L, null, linearLayout, new Integer(i), str, str2);
            }
            throw th;
        }
    }

    @ey(method = 809190981797718296L)
    private static View FH(LinearLayout linearLayout, int i) {
        try {
            if (j6) {
                iy.EQ(4550296627197016628L, null, linearLayout, new Integer(i));
            }
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(r.trainer_course_list_header, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(q.trainerCourseListHeaderText)).setText(i);
            linearLayout.addView(viewInflate);
            return viewInflate;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4550296627197016628L, null, linearLayout, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -155091064259161971L)
    public static void Hw(LinearLayout linearLayout, List<c.d> list, boolean z, boolean z2, ValueRunnable<c.d> valueRunnable, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        try {
            if (j6) {
                iy.QX(29950609376509199L, null, new Object[]{linearLayout, list, new Boolean(z), new Boolean(z2), valueRunnable, runnable, runnable2, runnable3, runnable4});
            }
            linearLayout.removeAllViews();
            ArrayList arrayList = new ArrayList();
            ArrayList<c.d> arrayList2 = new ArrayList();
            for (c.d dVar : list) {
                if (dVar.j3()) {
                    arrayList.add(dVar);
                } else {
                    arrayList2.add(dVar);
                }
            }
            FH(linearLayout, u.trainer_option_learn);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                c.d dVar2 = (c.d) it.next();
                Iterator it2 = it;
                DW(linearLayout, dVar2.Hw(), dVar2.XL()[0], dVar2.XL()[1]).setOnClickListener(new a(valueRunnable, dVar2));
                if (z && (i = i + 1) >= 2) {
                    break;
                } else {
                    it = it2;
                }
            }
            if (z && arrayList.size() > 2) {
                j6(linearLayout, R$drawable.ic_menu_moreoverflow_normal_holo_light, u.trainer_option_learn_more).setOnClickListener(new b(runnable));
            } else if (runnable2 != null && arrayList2.size() > 0) {
                if (z2) {
                    j6(linearLayout, R$drawable.ic_menu_moreoverflow_normal_holo_light, u.trainer_option_learn_other).setOnClickListener(new c(runnable2));
                } else {
                    for (c.d dVar3 : arrayList2) {
                        DW(linearLayout, dVar3.Hw(), dVar3.XL()[0], dVar3.XL()[1]).setOnClickListener(new ViewOnClickListenerC0095d(valueRunnable, dVar3));
                    }
                }
            }
            if (runnable4 != null && !AndroidHelper.U2(linearLayout.getContext())) {
                FH(linearLayout, u.trainer_option_interact);
                j6(linearLayout, 2131165230, u.trainer_option_interact_gplus_community).setOnClickListener(new e(runnable4));
            }
            if (ServiceContainer.g3()) {
                return;
            }
            FH(linearLayout, u.trainer_option_code);
            j6(linearLayout, 2131165304, u.trainer_option_code_for_experts).setOnClickListener(new f(runnable3));
        } catch (Throwable th) {
            if (DW) {
                iy.rN(th, 29950609376509199L, null, new Object[]{linearLayout, list, new Boolean(z), new Boolean(z2), valueRunnable, runnable, runnable2, runnable3, runnable4});
            }
            throw th;
        }
    }

    @ey(method = 3640171327209122744L)
    private static View j6(LinearLayout linearLayout, int i, int i2) {
        try {
            if (j6) {
                iy.we(4697310258949714032L, null, linearLayout, new Integer(i), new Integer(i2));
            }
            String string = linearLayout.getResources().getString(i2);
            return DW(linearLayout, i, string.split(" ")[0], string.split(" ")[1]);
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 4697310258949714032L, null, linearLayout, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
