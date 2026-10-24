package abcd;

import abcd.n70;
import abcd.q60;
import abcd.ud0;
import abcd.wd0;
import com.probelytics.api.UserTouchAction;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class vd0 {
    private static /* synthetic */ int[] KD;
    private static /* synthetic */ int[] SI;
    private static /* synthetic */ int[] ro;
    private boolean BT;
    private final t90 DW;
    private pd0 EQ;
    private boolean FH = true;
    private boolean Hw;
    private int J0;
    private tg0 J8;
    private nd0 Mr;
    private eb0 P8;
    private InputStream QX;
    private jd0 U2;
    private boolean VH;
    private yg0 Ws;
    private OutputStream XL;
    private boolean Zo;
    private Map<String, k70> a8;
    private OutputStream aM;
    private boolean ei;
    private List<ud0> er;
    private Throwable gW;
    private boolean gn;
    private md0 j3;
    private final p70 j6;
    private Set<a70> lg;
    private long nw;
    private Set<String> rN;
    private xd0 tp;
    private i70 u7;
    private boolean v5;
    private boolean vy;
    private od0 we;
    private StringBuilder yS;

    class a extends d {
        public a() {
        }

        @Override // abcd.vd0.d
        public void j6(String str) throws IOException {
            vd0.this.Mr.VH(String.valueOf(str) + "\n");
        }
    }

    class b extends d {
        public b() {
        }

        @Override // abcd.vd0.d
        public void j6(String str) throws IOException {
            vd0.this.aM.write(r60.DW(String.valueOf(str) + "\n"));
        }
    }

    private static class c {
        static final q60.b<c> Zo = new a();
        final boolean DW = true;
        final boolean FH;
        final boolean Hw;
        final boolean j6;
        final boolean v5;

        class a implements q60.b<c> {
            @Override // abcd.q60.b
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public c j6(q60 q60Var) {
                return new c(q60Var);
            }
        }

        public c(q60 q60Var) {
            this.j6 = q60Var.J0("receive", "fsckobjects", false);
            this.FH = !q60Var.J0("receive", "denydeletes", false);
            this.Hw = !q60Var.J0("receive", "denynonfastforwards", false);
            this.v5 = q60Var.J0("repack", "usedeltabaseoffset", true);
        }
    }

    static abstract class d {
        public abstract void j6(String str);
    }

    public vd0(p70 p70Var) {
        this.j6 = p70Var;
        this.DW = new t90(p70Var);
        c cVar = (c) this.j6.gn().tp(c.Zo);
        this.Hw = cVar.j6;
        this.v5 = cVar.DW;
        this.Zo = cVar.FH;
        this.VH = cVar.Hw;
        this.gn = cVar.v5;
        this.tp = xd0.j6;
        this.EQ = pd0.j6;
        this.we = od0.j6;
        this.lg = new HashSet();
    }

    private void BT() throws InterruptedException, IOException {
        eb0 eb0Var = this.P8;
        if (eb0Var != null) {
            eb0Var.DW();
            this.P8 = null;
        }
    }

    public static /* synthetic */ int[] DW() {
        int[] iArr = ro;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ud0.a.valuesCustom().length];
        try {
            iArr2[ud0.a.LOCK_FAILURE.ordinal()] = 8;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ud0.a.NOT_ATTEMPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ud0.a.OK.ordinal()] = 9;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ud0.a.REJECTED_CURRENT_BRANCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ud0.a.REJECTED_MISSING_OBJECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ud0.a.REJECTED_NOCREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ud0.a.REJECTED_NODELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ud0.a.REJECTED_NONFASTFORWARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ud0.a.REJECTED_OTHER_REASON.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        ro = iArr2;
        return iArr2;
    }

    public static /* synthetic */ int[] FH() {
        int[] iArr = SI;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ud0.b.valuesCustom().length];
        try {
            iArr2[ud0.b.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ud0.b.DELETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ud0.b.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ud0.b.UPDATE_NONFASTFORWARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        SI = iArr2;
        return iArr2;
    }

    private void U2() {
        yg0 yg0Var = this.Ws;
        if (yg0Var != null) {
            yg0Var.Zo(this.J0 * 10 * 1000);
        }
        x60 x60Var = x60.j6;
        j70 ee0Var = this.vy ? new ee0(this.aM) : x60Var;
        e70 e70VarEr = this.j6.er();
        try {
            String str = "jgit receive-pack";
            if (we() != null) {
                str = "jgit receive-pack from " + we().v5();
            }
            jd0 jd0VarEQ = e70VarEr.EQ(this.QX);
            this.U2 = jd0VarEQ;
            jd0VarEQ.wc(true);
            this.U2.hz(this.ei);
            this.U2.Eq(this.ei);
            this.U2.et(this.FH ? false : true);
            this.U2.FN(QX());
            this.U2.CU(str);
            this.U2.Xa(this.nw);
            this.P8 = this.U2.I(x60Var, ee0Var);
            e70VarEr.FH();
            e70VarEr.we();
            yg0 yg0Var2 = this.Ws;
            if (yg0Var2 != null) {
                yg0Var2.Zo(this.J0 * 1000);
            }
        } catch (Throwable th) {
            e70VarEr.we();
            throw th;
        }
    }

    private void VH() {
        this.BT = this.rN.contains("report-status");
        boolean zContains = this.rN.contains("side-band-64k");
        this.vy = zContains;
        if (zContains) {
            OutputStream outputStream = this.XL;
            this.XL = new de0(1, 65520, outputStream);
            this.aM = new de0(2, 65520, outputStream);
            nd0 nd0Var = new nd0(this.XL);
            this.Mr = nd0Var;
            nd0Var.v5(false);
        }
    }

    private void Zo() throws i40, j40, q40 {
        d70<a70> d70VarJ8;
        d70<a70> d70VarQX;
        if (this.ei) {
            d70VarJ8 = this.U2.J8();
            d70VarQX = this.U2.QX();
        } else {
            d70VarJ8 = null;
            d70VarQX = null;
        }
        this.U2 = null;
        g90 g90Var = new g90(this.j6);
        g90Var.yO(false);
        if (this.ei) {
            g90Var.wc(q90.TOPO);
            if (!d70VarJ8.isEmpty()) {
                g90Var.et(q90.BOUNDARY, true);
            }
        }
        for (ud0 ud0Var : this.er) {
            if (ud0Var.Zo() == ud0.a.NOT_ATTEMPTED && ud0Var.VH() != ud0.b.DELETE) {
                g90Var.Ev(g90Var.I(ud0Var.DW()));
            }
        }
        Iterator<a70> it = this.lg.iterator();
        while (it.hasNext()) {
            o90 o90VarI = g90Var.I(it.next());
            g90Var.WB(o90VarI);
            if (this.ei && !d70VarJ8.isEmpty()) {
                o90 o90VarAj = g90Var.aj(o90VarI);
                if (o90VarAj instanceof k90) {
                    o90VarAj = ((k90) o90VarAj).Eq();
                }
                if (o90VarAj instanceof s90) {
                    g90Var.WB(o90VarAj);
                }
            }
        }
        while (true) {
            k90 k90VarG3 = g90Var.g3();
            if (k90VarG3 == null) {
                while (true) {
                    o90 o90VarJw = g90Var.jw();
                    if (o90VarJw == null) {
                        if (this.ei) {
                            Iterator<V> it2 = d70VarJ8.iterator();
                            while (it2.hasNext()) {
                                o90 o90VarI2 = g90Var.I((a70) it2.next());
                                if (!o90VarI2.lp(m90.Hw)) {
                                    throw new q40(o90VarI2, o90VarI2.aj());
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (!o90VarJw.lp(m90.Hw)) {
                        if (this.ei) {
                            if (!d70VarQX.v5(o90VarJw)) {
                                throw new q40(o90VarJw, o90VarJw.aj());
                            }
                        } else if ((o90VarJw instanceof j90) && !this.j6.aM(o90VarJw)) {
                            throw new q40(o90VarJw, "blob");
                        }
                    }
                }
            } else if (this.ei && !k90VarG3.lp(m90.Hw) && !d70VarQX.v5(k90VarG3)) {
                throw new q40(k90VarG3, "commit");
            }
        }
    }

    private void a8() throws IOException {
        int iIndexOf;
        while (true) {
            try {
                String strHw = this.j3.Hw();
                if (strHw == md0.FH) {
                    return;
                }
                if (this.er.isEmpty() && (iIndexOf = strHw.indexOf(0)) >= 0) {
                    for (String str : strHw.substring(iIndexOf + 1).split(" ")) {
                        this.rN.add(str);
                    }
                    strHw = strHw.substring(0, iIndexOf);
                }
                if (strHw.length() < 83) {
                    String str2 = JGitText.DW().errorInvalidProtocolWantedOldNewRef;
                    rN(str2);
                    throw new y40(str2);
                }
                a70 a70VarVJ = a70.vJ(strHw.substring(0, 40));
                a70 a70VarVJ2 = a70.vJ(strHw.substring(41, 81));
                String strSubstring = strHw.substring(82);
                ud0 ud0Var = new ud0(a70VarVJ, a70VarVJ2, strSubstring);
                if (strSubstring.equals("HEAD")) {
                    ud0Var.u7(ud0.a.REJECTED_CURRENT_BRANCH);
                } else {
                    ud0Var.gn(this.a8.get(ud0Var.v5()));
                }
                this.er.add(ud0Var);
            } catch (EOFException e) {
                if (!this.er.isEmpty()) {
                    throw e;
                }
                return;
            }
        }
    }

    private boolean aM() {
        return QX() || XL();
    }

    private void er(boolean z, d dVar) {
        if (this.gW != null) {
            dVar.j6("unpack error " + this.gW.getMessage());
            if (z) {
                Iterator<ud0> it = this.er.iterator();
                while (it.hasNext()) {
                    dVar.j6("ng " + it.next().v5() + " n/a (unpacker error)");
                }
                return;
            }
            return;
        }
        if (z) {
            dVar.j6("unpack ok");
        }
        for (ud0 ud0Var : this.er) {
            if (ud0Var.Zo() != ud0.a.OK) {
                StringBuilder sb = new StringBuilder();
                sb.append("ng ");
                sb.append(ud0Var.v5());
                sb.append(" ");
                switch (DW()[ud0Var.Zo().ordinal()]) {
                    case 1:
                        sb.append("server bug; ref not processed");
                        dVar.j6(sb.toString());
                        break;
                    case 2:
                        sb.append("creation prohibited");
                        dVar.j6(sb.toString());
                        break;
                    case 3:
                        sb.append("deletion prohibited");
                        dVar.j6(sb.toString());
                        break;
                    case 4:
                        sb.append("non-fast forward");
                        dVar.j6(sb.toString());
                        break;
                    case 5:
                        sb.append("branch is currently checked out");
                        dVar.j6(sb.toString());
                        break;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        if (ud0Var.j6() == null) {
                            sb.append("missing object(s)");
                        } else if (ud0Var.j6().length() == 40) {
                            sb.append("object " + ud0Var.j6() + " missing");
                        } else {
                            sb.append(ud0Var.j6());
                        }
                        dVar.j6(sb.toString());
                        break;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        if (ud0Var.j6() == null) {
                            sb.append("unspecified reason");
                        } else {
                            sb.append(ud0Var.j6());
                        }
                        dVar.j6(sb.toString());
                        break;
                    case 8:
                        sb.append("failed to lock");
                        dVar.j6(sb.toString());
                        break;
                    case 9:
                        break;
                    default:
                        dVar.j6(sb.toString());
                        break;
                }
            } else if (z) {
                dVar.j6("ok " + ud0Var.v5());
            }
        }
    }

    private void gW(ud0 ud0Var, n70.c cVar) {
        switch (j6()[cVar.ordinal()]) {
            case 1:
                ud0Var.u7(ud0.a.NOT_ATTEMPTED);
                break;
            case 2:
            case 9:
                ud0Var.u7(ud0.a.LOCK_FAILURE);
                break;
            case 3:
            case 4:
            case 5:
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                ud0Var.u7(ud0.a.OK);
                break;
            case UserTouchAction.CLICK_KIND /* 7 */:
                ud0Var.u7(ud0.a.REJECTED_NONFASTFORWARD);
                break;
            case 8:
                ud0Var.u7(ud0.a.REJECTED_CURRENT_BRANCH);
                break;
            default:
                ud0Var.tp(ud0.a.REJECTED_OTHER_REASON, cVar.name());
                break;
        }
    }

    private void gn(ud0 ud0Var) {
        try {
            n70 n70VarEf = this.j6.ef(ud0Var.v5());
            n70VarEf.gW(we());
            int i = FH()[ud0Var.VH().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                n70VarEf.rN(Ws());
                n70VarEf.lg(ud0Var.FH());
                n70VarEf.er(ud0Var.DW());
                n70VarEf.BT("push", true);
                gW(ud0Var, n70VarEf.nw(this.DW));
                return;
            }
            if (i != 4) {
                return;
            }
            if (!a70.ca().aM(ud0Var.FH())) {
                n70VarEf.lg(ud0Var.FH());
            }
            n70VarEf.rN(true);
            gW(ud0Var, n70VarEf.DW(this.DW));
        } catch (IOException e) {
            ud0Var.tp(ud0.a.REJECTED_OTHER_REASON, MessageFormat.format(JGitText.DW().lockError, e.getMessage()));
        }
    }

    private boolean j3() {
        Iterator<ud0> it = this.er.iterator();
        while (it.hasNext()) {
            if (it.next().VH() != ud0.b.DELETE) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = KD;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[n70.c.valuesCustom().length];
        try {
            iArr2[n70.c.FAST_FORWARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[n70.c.FORCED.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[n70.c.IO_FAILURE.ordinal()] = 9;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n70.c.LOCK_FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n70.c.NEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n70.c.NOT_ATTEMPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n70.c.NO_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n70.c.REJECTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[n70.c.REJECTED_CURRENT_BRANCH.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[n70.c.RENAMED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        KD = iArr2;
        return iArr2;
    }

    private List<ud0> tp(ud0.a aVar) {
        ArrayList arrayList = new ArrayList(this.er.size());
        for (ud0 ud0Var : this.er) {
            if (ud0Var.Zo() == aVar) {
                arrayList.add(ud0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [abcd.ee0, abcd.o60] */
    private void u7() {
        this.EQ.j6(this, tp(ud0.a.NOT_ATTEMPTED));
        List<ud0> listTp = tp(ud0.a.NOT_ATTEMPTED);
        x60 x60Var = x60.j6;
        if (this.vy) {
            ?? ee0Var = new ee0(this.aM);
            ee0Var.tp(250L, TimeUnit.MILLISECONDS);
            x60Var = ee0Var;
        }
        x60Var.j6(JGitText.DW().updatingReferences, listTp.size());
        for (ud0 ud0Var : listTp) {
            x60Var.v5(1);
            gn(ud0Var);
        }
        x60Var.FH();
    }

    private void vy() {
        for (ud0 ud0Var : this.er) {
            k70 k70VarHw = ud0Var.Hw();
            if (ud0Var.Zo() == ud0.a.NOT_ATTEMPTED) {
                if (ud0Var.VH() != ud0.b.DELETE || J8()) {
                    if (ud0Var.VH() == ud0.b.CREATE) {
                        if (!J0()) {
                            ud0Var.u7(ud0.a.REJECTED_NOCREATE);
                        } else if (k70VarHw != null && !Ws()) {
                            ud0Var.u7(ud0.a.REJECTED_NONFASTFORWARD);
                        } else if (k70VarHw != null) {
                            ud0Var.tp(ud0.a.REJECTED_OTHER_REASON, MessageFormat.format(JGitText.DW().refAlreadyExists, k70VarHw));
                        }
                    }
                    if (ud0Var.VH() != ud0.b.DELETE || k70VarHw == null || a70.ca().aM(ud0Var.FH()) || k70VarHw.DW().aM(ud0Var.FH())) {
                        if (ud0Var.VH() == ud0.b.UPDATE) {
                            if (k70VarHw == null) {
                                ud0Var.tp(ud0.a.REJECTED_OTHER_REASON, JGitText.DW().noSuchRef);
                            } else if (k70VarHw.DW().aM(ud0Var.FH())) {
                                try {
                                    o90 o90VarI = this.DW.I(ud0Var.FH());
                                    try {
                                        o90 o90VarI2 = this.DW.I(ud0Var.DW());
                                        if ((o90VarI instanceof k90) && (o90VarI2 instanceof k90)) {
                                            try {
                                                if (!this.DW.P8((k90) o90VarI, (k90) o90VarI2)) {
                                                    ud0Var.EQ(ud0.b.UPDATE_NONFASTFORWARD);
                                                }
                                            } catch (q40 e) {
                                                ud0Var.tp(ud0.a.REJECTED_MISSING_OBJECT, e.getMessage());
                                            } catch (IOException unused) {
                                                ud0Var.u7(ud0.a.REJECTED_OTHER_REASON);
                                            }
                                        } else {
                                            ud0Var.EQ(ud0.b.UPDATE_NONFASTFORWARD);
                                        }
                                    } catch (IOException unused2) {
                                        ud0Var.tp(ud0.a.REJECTED_MISSING_OBJECT, ud0Var.DW().BT());
                                    }
                                } catch (IOException unused3) {
                                    ud0Var.tp(ud0.a.REJECTED_MISSING_OBJECT, ud0Var.FH().BT());
                                }
                            } else {
                                ud0Var.tp(ud0.a.REJECTED_OTHER_REASON, JGitText.DW().invalidOldIdSent);
                            }
                        }
                        if (!ud0Var.v5().startsWith("refs/") || !p70.lg(ud0Var.v5())) {
                            ud0Var.tp(ud0.a.REJECTED_OTHER_REASON, JGitText.DW().funnyRefname);
                        }
                    } else {
                        ud0Var.tp(ud0.a.REJECTED_OTHER_REASON, JGitText.DW().invalidOldIdSent);
                    }
                } else {
                    ud0Var.u7(ud0.a.REJECTED_NODELETE);
                }
            }
        }
    }

    private void yS() throws InterruptedException, IOException {
        if (this.FH) {
            lg(new wd0.a(this.Mr));
            this.Mr.DW();
        } else {
            EQ();
        }
        if (this.yS != null) {
            return;
        }
        a8();
        if (this.er.isEmpty()) {
            return;
        }
        VH();
        if (j3()) {
            try {
                U2();
                if (aM()) {
                    Zo();
                }
                this.U2 = null;
                this.gW = null;
            } catch (IOException e) {
                this.gW = e;
            } catch (Error e2) {
                this.gW = e2;
            } catch (RuntimeException e3) {
                this.gW = e3;
            }
        }
        if (this.gW == null) {
            vy();
            u7();
        }
        BT();
        if (this.BT) {
            er(true, new a());
            this.Mr.j6();
        } else if (this.aM != null) {
            er(false, new b());
        }
        this.we.j6(this, tp(ud0.a.OK));
        if (this.gW != null) {
            throw new l50(this.gW);
        }
    }

    public final Map<String, k70> EQ() {
        if (this.a8 == null) {
            xd0 xd0Var = this.tp;
            Map<String, k70> mapVH = this.j6.VH();
            xd0Var.j6(mapVH);
            this.a8 = mapVH;
            k70 k70Var = mapVH.get("HEAD");
            if (k70Var != null && k70Var.gn()) {
                this.a8.remove("HEAD");
            }
            for (k70 k70Var2 : this.a8.values()) {
                if (k70Var2.DW() != null) {
                    this.lg.add(k70Var2.DW());
                }
            }
            this.lg.addAll(this.j6.Zo());
        }
        return this.a8;
    }

    public boolean J0() {
        return this.v5;
    }

    public boolean J8() {
        return this.Zo;
    }

    public void Mr(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2) throws InterruptedException, IOException {
        try {
            this.QX = inputStream;
            this.XL = outputStream;
            this.aM = outputStream2;
            if (this.J0 > 0) {
                this.J8 = new tg0(String.valueOf(Thread.currentThread().getName()) + "-Timer");
                this.Ws = new yg0(this.QX, this.J8);
                zg0 zg0Var = new zg0(this.XL, this.J8);
                this.Ws.Zo(this.J0 * 1000);
                zg0Var.FH(this.J0 * 1000);
                this.QX = this.Ws;
                this.XL = zg0Var;
            }
            this.j3 = new md0(this.QX);
            nd0 nd0Var = new nd0(this.XL);
            this.Mr = nd0Var;
            nd0Var.v5(false);
            this.rN = new HashSet();
            this.er = new ArrayList();
            yS();
            this.DW.lp();
            try {
                if (this.vy) {
                    ((de0) this.aM).j6();
                    ((de0) this.XL).j6();
                    nd0 nd0Var2 = new nd0(outputStream);
                    nd0Var2.v5(false);
                    nd0Var2.j6();
                }
                if (this.FH) {
                    if (!this.vy && this.aM != null) {
                        this.aM.flush();
                    }
                    this.XL.flush();
                }
                BT();
                this.Ws = null;
                this.QX = null;
                this.XL = null;
                this.aM = null;
                this.j3 = null;
                this.Mr = null;
                this.a8 = null;
                this.rN = null;
                this.er = null;
                tg0 tg0Var = this.J8;
                if (tg0Var != null) {
                    try {
                        tg0Var.FH();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                BT();
                this.Ws = null;
                this.QX = null;
                this.XL = null;
                this.aM = null;
                this.j3 = null;
                this.Mr = null;
                this.a8 = null;
                this.rN = null;
                this.er = null;
                tg0 tg0Var2 = this.J8;
                if (tg0Var2 != null) {
                    try {
                        tg0Var2.FH();
                    } finally {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.DW.lp();
            try {
                if (this.vy) {
                    ((de0) this.aM).j6();
                    ((de0) this.XL).j6();
                    nd0 nd0Var3 = new nd0(outputStream);
                    nd0Var3.v5(false);
                    nd0Var3.j6();
                }
                if (this.FH) {
                    if (!this.vy && this.aM != null) {
                        this.aM.flush();
                    }
                    this.XL.flush();
                }
                BT();
                this.Ws = null;
                this.QX = null;
                this.XL = null;
                this.aM = null;
                this.j3 = null;
                this.Mr = null;
                this.a8 = null;
                this.rN = null;
                this.er = null;
                tg0 tg0Var3 = this.J8;
                if (tg0Var3 != null) {
                    try {
                        tg0Var3.FH();
                    } finally {
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                BT();
                this.Ws = null;
                this.QX = null;
                this.XL = null;
                this.aM = null;
                this.j3 = null;
                this.Mr = null;
                this.a8 = null;
                this.rN = null;
                this.er = null;
                tg0 tg0Var4 = this.J8;
                if (tg0Var4 != null) {
                    try {
                        tg0Var4.FH();
                    } finally {
                    }
                }
                throw th3;
            }
        }
    }

    public boolean QX() {
        return this.Hw;
    }

    public boolean Ws() {
        return this.VH;
    }

    public boolean XL() {
        return this.ei;
    }

    public void lg(wd0 wd0Var) {
        if (this.yS != null) {
            wd0Var.we("ERR " + ((Object) this.yS));
            return;
        }
        wd0Var.gn(this.j6);
        wd0Var.FH("side-band-64k");
        wd0Var.FH("delete-refs");
        wd0Var.FH("report-status");
        if (this.gn) {
            wd0Var.FH("ofs-delta");
        }
        wd0Var.tp(EQ());
        Iterator<a70> it = this.lg.iterator();
        while (it.hasNext()) {
            wd0Var.Hw(it.next());
        }
        if (wd0Var.u7()) {
            wd0Var.v5(a70.ca(), "capabilities^{}");
        }
        wd0Var.Zo();
    }

    public void rN(String str) throws IOException {
        if (this.a8 == null) {
            if (this.yS == null) {
                this.yS = new StringBuilder();
            }
            StringBuilder sb = this.yS;
            sb.append(str);
            sb.append('\n');
            return;
        }
        try {
            if (this.aM != null) {
                this.aM.write(r60.DW("error: " + str + "\n"));
            }
        } catch (IOException unused) {
        }
    }

    public i70 we() {
        return this.u7;
    }
}
