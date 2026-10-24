package com.aide.appwizard;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.aide.appwizard.runtime.a;
import com.aide.common.UndoManager;
import com.aide.common.ValueRunnable;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.uidesigner.f;
import com.aide.uidesigner.g;
import com.aide.uidesigner.k;
import com.aide.uidesigner.l;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@cy(clazz = 3221156459542216220L, container = 3221156459542216220L, user = true)
/* loaded from: classes.dex */
public class a extends Fragment {

    @fy
    private static /* synthetic */ boolean PT;

    @gy
    private static /* synthetic */ boolean b1;

    @dy(field = -1838167978046037212L)
    private l Of;

    @cy(clazz = 407057041246795255L, container = 3221156459542216220L, user = true)
    /* renamed from: com.aide.appwizard.a$a, reason: collision with other inner class name */
    class C0036a extends l {

        @fy
        private static /* synthetic */ boolean e3;

        @gy
        private static /* synthetic */ boolean sE;

        @dy(field = 5300932512817578745L)
        final /* synthetic */ int iW;

        @cy(clazz = 188198108943539952L, container = 3221156459542216220L, user = true)
        /* renamed from: com.aide.appwizard.a$a$a, reason: collision with other inner class name */
        class C0037a implements ValueRunnable<com.aide.uidesigner.b> {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(C0037a.class);
            }

            @ey(method = -112682530099466200L)
            C0037a() {
            }

            @Override // com.aide.common.ValueRunnable
            @ey(method = 162926870932330029L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public void j6(com.aide.uidesigner.b bVar) {
                try {
                    if (DW) {
                        iy.tp(-3757586843069772515L, this, bVar);
                    }
                    a.this.Of.VH(bVar);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -3757586843069772515L, this, bVar);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(C0036a.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -7407411391796022767L)
        C0036a(ViewGroup viewGroup, String str, String str2, UndoManager undoManager, int i) {
            super(viewGroup, str, str2, undoManager);
            this.iW = i;
        }

        @Override // com.aide.uidesigner.l
        @ey(method = -2889963370817112711L)
        protected void XG(boolean z) {
            try {
                if (e3) {
                    iy.Ws(-3078734283356545248L, this, z);
                }
                if (a.this.Of.I() == null) {
                    a.this.Of.ko(a.this.Jm().cn(this.iW));
                }
                a.this.qP(a.this.Of.I());
            } catch (Throwable th) {
                if (sE) {
                    iy.j3(th, -3078734283356545248L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = 352359166391011659L)
        protected void XX() {
            try {
                if (e3) {
                    iy.gn(25234295093263616L, this);
                }
            } catch (Throwable th) {
                if (sE) {
                    iy.aM(th, 25234295093263616L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = -7805295888161308280L)
        protected void br() {
            try {
                if (e3) {
                    iy.gn(5996066495496705947L, this);
                }
                k.FH(a.this.getActivity(), "Add...", new C0037a());
            } catch (Throwable th) {
                if (sE) {
                    iy.aM(th, 5996066495496705947L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.uidesigner.l
        @ey(method = 1170908639001024147L)
        protected void kQ(f fVar) {
            try {
                if (e3) {
                    iy.tp(-369730888616683920L, this, fVar);
                }
                g.Hw(a.this.getActivity(), fVar);
            } catch (Throwable th) {
                if (sE) {
                    iy.j3(th, -369730888616683920L, this, fVar);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(a.class);
    }

    @ey(method = -2328313437546071964L)
    public a() {
        try {
            if (PT) {
                iy.gn(6069127176368825400L, null);
            }
        } catch (Throwable th) {
            if (b1) {
                iy.aM(th, 6069127176368825400L, null);
            }
            throw th;
        }
    }

    @ey(method = -5140245462404003635L)
    private UndoManager Bx() {
        try {
            if (PT) {
                iy.gn(-1582183934968433225L, this);
            }
            return Jm().ef();
        } catch (Throwable th) {
            if (b1) {
                iy.aM(th, -1582183934968433225L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1660372041111928359L)
    public AppWizardDesignActivity Jm() {
        try {
            if (PT) {
                iy.gn(-3116302275194977077L, this);
            }
            return (AppWizardDesignActivity) getActivity();
        } catch (Throwable th) {
            if (b1) {
                iy.aM(th, -3116302275194977077L, this);
            }
            throw th;
        }
    }

    @ey(method = 27678770709770817L)
    public static a ce(a.d dVar) {
        try {
            if (PT) {
                iy.tp(-2955474563407001185L, null, dVar);
            }
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_SECTION_TITLE", dVar.v5());
            bundle.putString("ARG_SECTION_LAYOUT", dVar.Hw());
            bundle.putInt("ARG_SECTION_ID", dVar.FH());
            aVar.setArguments(bundle);
            return aVar;
        } catch (Throwable th) {
            if (b1) {
                iy.j3(th, -2955474563407001185L, null, dVar);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 543424208139730016L)
    public void qP(String str) {
        try {
            if (PT) {
                iy.tp(388761785571931472L, this, str);
            }
            try {
                new File(str).getParentFile().mkdirs();
                FileWriter fileWriter = new FileWriter(str);
                fileWriter.write(this.Of.Mz());
                fileWriter.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            if (b1) {
                iy.j3(th, 388761785571931472L, this, str);
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @ey(method = -67829163727794165L)
    public View lp(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            if (PT) {
                iy.we(-116450732158166131L, this, layoutInflater, viewGroup, bundle);
            }
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(r.appwizard_section, viewGroup, false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(q.appwizardSectionContainer);
            viewGroup2.setClipChildren(false);
            int i = getArguments().getInt("ARG_SECTION_ID");
            String strSG = Jm().sG();
            String strSh = Jm().sh(getArguments().getString("ARG_SECTION_LAYOUT"));
            if (Bx() != null && this.Of != null) {
                Bx().EQ(this.Of);
            }
            C0036a c0036a = new C0036a(viewGroup3, strSh, strSG, Bx(), i);
            this.Of = c0036a;
            c0036a.OW();
            this.Of.FN(false);
            oa();
            return viewGroup2;
        } catch (Throwable th) {
            if (b1) {
                iy.U2(th, -116450732158166131L, this, layoutInflater, viewGroup, bundle);
            }
            throw th;
        }
    }

    @ey(method = 4676131816385424228L)
    public void oa() {
        try {
            if (PT) {
                iy.gn(2222484243774142968L, this);
            }
            this.Of.hz(Jm().Sf());
        } catch (Throwable th) {
            if (b1) {
                iy.aM(th, 2222484243774142968L, this);
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @ey(method = 2756440027304867761L)
    public void onDestroy() {
        try {
            if (PT) {
                iy.gn(-1601302373712659197L, this);
            }
            super.onDestroy();
            if (Bx() == null || this.Of == null) {
                return;
            }
            Bx().EQ(this.Of);
        } catch (Throwable th) {
            if (b1) {
                iy.aM(th, -1601302373712659197L, this);
            }
            throw th;
        }
    }
}
