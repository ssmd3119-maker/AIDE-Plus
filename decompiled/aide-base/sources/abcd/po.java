package abcd;

import abcd.bo;
import abcd.co;
import abcd.lj;
import abcd.no;
import abcd.oo;
import abcd.to;
import abcd.zn;
import com.probelytics.api.UserTouchAction;
import java.io.IOException;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.codehaus.groovy.tools.gse.StringSetMap;

/* loaded from: classes.dex */
public class po {
    private no.b XL;
    private no.b aM;
    private boolean j6 = true;
    private vo DW = new vo();
    private to FH = new to();
    private to Hw = new to();
    private HashMap<mo, Integer> gn = new HashMap<>();
    private HashMap<ko, Integer> v5 = new HashMap<>();
    private HashMap<fo, Integer> Zo = new HashMap<>();
    private HashMap<ho, Integer> VH = new HashMap<>();
    private HashMap<un, Integer> u7 = new HashMap<>();
    private HashMap<wn, Integer> tp = new HashMap<>();
    private HashMap<xn, Integer> EQ = new HashMap<>();
    private HashMap<dodo, Integer> we = new HashMap<>();
    private HashMap<vn, Integer> J0 = new HashMap<>();
    private HashMap<zn, Integer> J8 = new HashMap<>();
    private HashMap<Integer, ao> Ws = new HashMap<>();
    private no QX = new no();

    class a implements o<fo> {
        final /* synthetic */ qo j6;

        public a(po poVar, qo qoVar) {
            this.j6 = qoVar;
        }

        @Override // abcd.po.o
        public void DW(int i, int i2) {
            this.j6.SI(i, i2);
        }

        @Override // abcd.po.o
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public fo j6(fo foVar, qo qoVar) {
            return qoVar.VH(foVar);
        }
    }

    class b implements o<ko> {
        final /* synthetic */ qo j6;

        public b(po poVar, qo qoVar) {
            this.j6 = qoVar;
        }

        @Override // abcd.po.o
        public void DW(int i, int i2) {
            this.j6.ro(i, i2);
        }

        @Override // abcd.po.o
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public ko j6(ko koVar, qo qoVar) {
            return qoVar.u7(koVar);
        }
    }

    class c implements o<ho> {
        final /* synthetic */ qo j6;

        public c(po poVar, qo qoVar) {
            this.j6 = qoVar;
        }

        @Override // abcd.po.o
        public void DW(int i, int i2) {
            this.j6.KD(i, i2);
        }

        @Override // abcd.po.o
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public ho j6(ho hoVar, qo qoVar) {
            return qoVar.gn(hoVar);
        }
    }

    class d implements q {
        public d() {
        }

        @Override // abcd.po.q
        public int j6(int i, int i2) {
            return po.this.DW.Hw(i, i2);
        }
    }

    class e implements q {
        public e(po poVar) {
        }

        @Override // abcd.po.q
        public int j6(int i, int i2) {
            return i - i2;
        }
    }

    class f implements r<un> {
        public f(po poVar) {
        }

        @Override // abcd.po.r
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public un j6(un unVar, qo qoVar) {
            return qoVar.j6(unVar);
        }

        @Override // abcd.po.r
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void DW(no.b bVar, un unVar, int i, int i2, qo qoVar) {
            qoVar.vy(i, i2);
            unVar.u7(bVar);
        }
    }

    class g implements r<wn> {
        public g(po poVar) {
        }

        @Override // abcd.po.r
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public wn j6(wn wnVar, qo qoVar) {
            return qoVar.FH(wnVar);
        }

        @Override // abcd.po.r
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void DW(no.b bVar, wn wnVar, int i, int i2, qo qoVar) {
            qoVar.P8(i, i2);
            wnVar.DW(bVar);
        }
    }

    class h implements r<xn> {
        public h(po poVar) {
        }

        @Override // abcd.po.r
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public xn j6(xn xnVar, qo qoVar) {
            return qoVar.Hw(xnVar);
        }

        @Override // abcd.po.r
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void DW(no.b bVar, xn xnVar, int i, int i2, qo qoVar) {
            qoVar.ei(i, i2);
            xnVar.DW(bVar);
        }
    }

    class i implements r<vn> {
        public i(po poVar) {
        }

        @Override // abcd.po.r
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public vn j6(vn vnVar, qo qoVar) {
            return qoVar.DW(vnVar);
        }

        @Override // abcd.po.r
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void DW(no.b bVar, vn vnVar, int i, int i2, qo qoVar) {
            qoVar.BT(i, i2);
            vnVar.gn(bVar);
        }
    }

    class j implements r<zn> {
        final /* synthetic */ to j6;

        public j(po poVar, to toVar) {
            this.j6 = toVar;
        }

        public zn FH(zn znVar, qo qoVar) {
            return znVar;
        }

        @Override // abcd.po.r
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void DW(no.b bVar, zn znVar, int i, int i2, qo qoVar) {
            znVar.gn(bVar);
            this.j6.VH(i, i2);
        }

        @Override // abcd.po.r
        public /* bridge */ /* synthetic */ zn j6(zn znVar, qo qoVar) {
            zn znVar2 = znVar;
            FH(znVar2, qoVar);
            return znVar2;
        }
    }

    class k implements r<dodo> {
        public k(po poVar) {
        }

        @Override // abcd.po.r
        /* renamed from: FH, reason: merged with bridge method [inline-methods] */
        public dodo j6(dodo dodoVar, qo qoVar) {
            return qoVar.Ws(dodoVar);
        }

        @Override // abcd.po.r
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void DW(no.b bVar, dodo dodoVar, int i, int i2, qo qoVar) {
            qoVar.nw(i, i2);
            dodoVar.FH(bVar);
        }
    }

    class l implements p<ko> {
        public l(po poVar) {
        }

        @Override // abcd.po.p
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(no.b bVar, ko koVar) {
            koVar.Zo(bVar);
        }
    }

    class m implements p<fo> {
        public m(po poVar) {
        }

        @Override // abcd.po.p
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(no.b bVar, fo foVar) {
            foVar.Zo(bVar);
        }
    }

    class n implements p<ho> {
        public n(po poVar) {
        }

        @Override // abcd.po.p
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(no.b bVar, ho hoVar) {
            hoVar.Zo(bVar);
        }
    }

    private interface o<T> {
        void DW(int i, int i2);

        T j6(T t, qo qoVar);
    }

    private interface p<T> {
        void j6(no.b bVar, T t);
    }

    private interface q {
        int j6(int i, int i2);
    }

    private interface r<T> {
        void DW(no.b bVar, T t, int i, int i2, qo qoVar);

        T j6(T t, qo qoVar);
    }

    private <K, V> HashMap<V, K> BT(HashMap<K, V> map) {
        HashMap<V, K> map2 = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }
        return map2;
    }

    private void DW(qo qoVar, co coVar) {
        uo uoVar = new uo();
        lj.a aVar = coVar.EQ().VH;
        if (aVar.DW()) {
            co.g gVarJ0 = coVar.J0(aVar.jw);
            for (int i2 = 0; i2 < aVar.mb; i2++) {
                ao aoVarYS = gVarJ0.yS();
                int iEr = qoVar.er(aoVarYS.u7());
                if (!uoVar.DW(iEr) && aoVarYS.FH() != 0) {
                    zn znVarV5 = qoVar.v5(coVar.Ws(aoVarYS));
                    vJ(znVarV5.DW(), qoVar, coVar);
                    vJ(znVarV5.v5(), qoVar, coVar);
                    this.Ws.put(Integer.valueOf(iEr), gn(iEr, this.Ws.get(Integer.valueOf(iEr)), VH(znVarV5)));
                }
            }
        }
    }

    private void EQ() {
        if (!this.j6) {
            throw new IllegalStateException("Too many classes/methods/fields/strings. Consider using 'multiDexEnabled true' or 'minSdkVersion 21' in your build.gradle file.");
        }
    }

    private void Hw(qo qoVar, co coVar) {
        lj.a aVar = coVar.EQ().VH;
        if (aVar.DW()) {
            co.g gVarJ0 = coVar.J0(aVar.jw);
            for (int i2 = 0; i2 < aVar.mb; i2++) {
                ao aoVarYS = gVarJ0.yS();
                int iEr = qoVar.er(aoVarYS.u7());
                if (!XL(iEr)) {
                    int iDW = aoVarYS.DW();
                    FH(iEr, new ao(null, 0, iEr, aoVarYS.j6(), qoVar.er(aoVarYS.gn()), qoVar.gW(aoVarYS.Hw()), qoVar.rN(aoVarYS.Zo()), iDW != 0 ? Zo(qoVar.DW(coVar.J0(iDW).Mr())) : 0, 0, qoVar.J8(aoVarYS.VH())));
                }
            }
        }
    }

    private static <T extends Comparable<T>> HashMap<T, Integer> I(HashMap<T, Integer> map, qo qoVar, o<T> oVar) {
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            map2.put(oVar.j6(entry.getKey(), qoVar), Integer.valueOf(entry.getValue().intValue()));
        }
        List listP8 = P8(map2);
        Collections.sort(listP8);
        StringSetMap stringSetMap = (HashMap<T, Integer>) new HashMap(map.size());
        for (int i2 = 0; i2 < listP8.size(); i2++) {
            stringSetMap.put(listP8.get(i2), Integer.valueOf(i2));
            oVar.DW(((Integer) map2.get(listP8.get(i2))).intValue(), i2);
        }
        return stringSetMap;
    }

    private fo J0(fo foVar) {
        return new fo(null, foVar.DW(), foVar.v5(), foVar.FH());
    }

    private ho J8(ho hoVar) {
        return new ho(null, hoVar.DW(), hoVar.v5(), hoVar.FH());
    }

    public static void Mz(int[] iArr, q qVar) {
        g3(iArr, 0, iArr.length - 1, qVar);
    }

    private void OW(co.g gVar, qo qoVar) {
        this.aM.ro(gVar.ef());
        int iEf = gVar.ef();
        this.aM.ro(iEf);
        for (int i2 = 0; i2 < iEf; i2++) {
            this.aM.cn(qoVar.rN(gVar.Sf()));
        }
        while (true) {
            byte b2 = gVar.readByte();
            this.aM.writeByte(b2);
            if (b2 != 9) {
                switch (b2) {
                    case 0:
                        this.QX.XL().Ws.mb++;
                        return;
                    case 1:
                        this.aM.ro(gVar.ef());
                        break;
                    case 2:
                        this.aM.SI(gVar.cb());
                        break;
                    case 3:
                    case 4:
                        this.aM.ro(gVar.ef());
                        this.aM.cn(qoVar.rN(gVar.Sf()));
                        this.aM.cn(qoVar.er(gVar.Sf()));
                        if (b2 == 4) {
                            this.aM.cn(qoVar.rN(gVar.Sf()));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        this.aM.ro(gVar.ef());
                        break;
                }
            } else {
                this.aM.cn(qoVar.rN(gVar.Sf()));
            }
        }
    }

    private static <T> List<T> P8(HashMap<T, Integer> map) {
        Vector vector = new Vector(map.size());
        vector.setSize(map.size());
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            vector.set(entry.getValue().intValue(), entry.getKey());
        }
        return vector;
    }

    private mo QX(mo moVar) {
        return new mo(null, moVar.DW());
    }

    private void Qq(qo qoVar) {
        if (this.gn.size() == 0) {
            return;
        }
        HashMap map = new HashMap();
        Vector vector = new Vector(this.gn.size());
        vector.setSize(this.gn.size());
        for (Map.Entry<mo, Integer> entry : this.gn.entrySet()) {
            mo key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            mo moVarYS = qoVar.yS(key);
            map.put(moVarYS, Integer.valueOf(iIntValue));
            vector.set(iIntValue - 1, moVarYS);
        }
        this.gn = null;
        Collections.sort(vector);
        HashMap map2 = new HashMap();
        to toVar = new to();
        int i2 = 0;
        toVar.VH(0, 0);
        int i3 = 0;
        while (i3 < vector.size()) {
            mo moVar = (mo) vector.get(i3);
            i3++;
            toVar.VH(i3, ((Integer) map.get(moVar)).intValue());
            map2.put(moVar, Integer.valueOf(i3));
        }
        HashMap<mo, Integer> map3 = new HashMap<>();
        no noVar = this.QX;
        no.b bVarHw = noVar.Hw(noVar.XL().u7);
        while (i2 < vector.size()) {
            mo moVar2 = (mo) vector.get(i2);
            int iLg = bVarHw.lg();
            map3.put(moVar2, Integer.valueOf(iLg));
            i2++;
            qoVar.cb(toVar.v5(i2), iLg);
            bVarHw.KD(moVar2);
        }
        this.gn = map3;
        this.QX.we(vector.size());
    }

    private <T> HashMap<T, Integer> Sf(oo.a aVar, HashMap<T, Integer> map, r<T> rVar, qo qoVar) {
        if (map.size() == 0) {
            return map;
        }
        no.b bVarHw = this.QX.Hw(aVar);
        HashMap<T, Integer> map2 = new HashMap<>();
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            T tJ6 = rVar.j6(entry.getKey(), qoVar);
            int iLg = bVarHw.lg();
            map2.put(tJ6, Integer.valueOf(iLg));
            rVar.DW(bVarHw, tJ6, entry.getValue().intValue(), iLg, qoVar);
        }
        this.QX.we(map.size());
        return map2;
    }

    private ko Ws(ko koVar) {
        return new ko(null, koVar.v5(), koVar.FH(), koVar.DW());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void XX(oo.a aVar, HashMap<T, Integer> map, p<T> pVar) {
        no.b bVarQX = this.QX.QX(aVar);
        Iterator it = P8(map).iterator();
        while (it.hasNext()) {
            pVar.j6(bVarQX, it.next());
        }
    }

    private void aj(int i2, uo uoVar, List<Integer> list, uo uoVar2, to toVar) {
        if (uoVar.DW(i2)) {
            return;
        }
        uoVar.FH(i2);
        to.b bVarHw = toVar.Hw();
        bVarHw.FH(i2);
        while (bVarHw.j6()) {
            int iV5 = bVarHw.v5();
            if (uoVar2.DW(iV5)) {
                aj(iV5, uoVar, list, uoVar2, toVar);
            }
        }
        list.add(Integer.valueOf(i2));
    }

    private void br(to toVar, int i2, bo.a aVar, qo qoVar) {
        toVar.VH(aVar.FH(), this.XL.er() - i2);
        int iDW = aVar.DW();
        int[] iArrHw = aVar.Hw();
        int[] iArrJ6 = aVar.j6();
        if (iDW != -1) {
            this.XL.SI(-iArrHw.length);
        } else {
            this.XL.SI(iArrHw.length);
        }
        for (int i3 = 0; i3 < iArrHw.length; i3++) {
            this.XL.ro(qoVar.er(iArrHw[i3]));
            this.XL.ro(iArrJ6[i3]);
        }
        if (iDW != -1) {
            this.XL.ro(iDW);
        }
    }

    private void ca(qo qoVar) {
        to toVar = new to(this.Hw.u7());
        this.Hw.j6.DW();
        while (this.Hw.j6.j6()) {
            int iHw = this.Hw.j6.Hw();
            toVar.VH(qoVar.rN(iHw), this.Hw.j6.v5());
        }
        int[] iArrVy = vy(toVar);
        Mz(iArrVy, new e(this));
        this.Hw.FH();
        for (int i2 = 0; i2 < iArrVy.length; i2++) {
            this.Hw.VH(iArrVy[i2], i2);
            qoVar.sh(toVar.v5(iArrVy[i2]), i2);
        }
    }

    private void cb(qo qoVar) {
        this.u7 = Sf(this.QX.XL().QX, this.u7, new f(this), qoVar);
    }

    private void cn(qo qoVar) {
        this.EQ = Sf(this.QX.XL().tp, this.EQ, new h(this), qoVar);
    }

    private void dx() {
        to toVar = new to();
        this.J8 = Sf(this.QX.XL().we, this.J8, new j(this, toVar), null);
        HashMap<Integer, ao> map = new HashMap<>();
        for (Map.Entry<Integer, ao> entry : this.Ws.entrySet()) {
            Integer key = entry.getKey();
            ao value = entry.getValue();
            map.put(key, new ao(null, 0, key.intValue(), value.j6(), value.gn(), value.Hw(), value.Zo(), value.DW(), value.FH() == 0 ? 0 : toVar.v5(value.FH()), value.VH()));
        }
        this.Ws = map;
    }

    private void ef() {
        oo ooVarXL = this.QX.XL();
        this.QX.DW(ooVarXL.j6, 112, 1);
        this.QX.DW(ooVarXL.DW, this.FH.u7() * 4, this.FH.u7());
        this.QX.DW(ooVarXL.FH, this.Hw.u7() * 4, this.Hw.u7());
        this.QX.DW(ooVarXL.Hw, this.v5.size() * 12, this.v5.size());
        this.QX.DW(ooVarXL.v5, this.Zo.size() * 8, this.Zo.size());
        this.QX.DW(ooVarXL.Zo, this.VH.size() * 8, this.VH.size());
        this.QX.DW(ooVarXL.VH, this.Ws.size() * 32, this.Ws.size());
        ooVarXL.a8 = this.QX.Ws();
    }

    private static void g3(int[] iArr, int i2, int i3, q qVar) {
        if (i2 < i3) {
            int i4 = iArr[((i3 - i2) / 2) + i2];
            int i5 = i2;
            int i6 = i3;
            while (i5 <= i6) {
                while (qVar.j6(iArr[i5], i4) < 0) {
                    i5++;
                }
                while (qVar.j6(i4, iArr[i6]) < 0) {
                    i6--;
                }
                if (i5 <= i6) {
                    int i7 = iArr[i6];
                    iArr[i6] = iArr[i5];
                    iArr[i5] = i7;
                    i5++;
                    i6--;
                }
            }
            g3(iArr, i2, i6, qVar);
            g3(iArr, i5, i3, qVar);
        }
    }

    private ao gn(int i2, ao aoVar, int i3) {
        return new ao(null, 0, i2, aoVar.j6(), aoVar.gn(), aoVar.Hw(), aoVar.Zo(), aoVar.DW(), i3, aoVar.VH());
    }

    private void jJ() {
        no noVar = this.QX;
        no.b bVarQX = noVar.QX(noVar.XL().FH);
        for (int i2 : vy(this.Hw)) {
            bVarQX.writeInt(i2);
        }
    }

    private void kQ() {
        no noVar = this.QX;
        int iRN = noVar.FH(noVar.XL().J8, this.DW.VH(), this.DW.u7(), this.DW.gn()).rN();
        to toVar = new to();
        this.FH.j6.DW();
        while (this.FH.j6.j6()) {
            toVar.VH(this.FH.j6.Hw() + iRN, this.FH.j6.v5());
        }
        this.FH = toVar;
    }

    private void lp(co coVar, bo boVar, qo qoVar) {
        this.XL.Mr();
        this.XL.sh(boVar.Zo());
        this.XL.sh(boVar.FH());
        this.XL.sh(boVar.v5());
        bo.b[] bVarArrVH = boVar.VH();
        this.XL.sh(bVarArrVH.length);
        int iDW = boVar.DW();
        if (iDW != 0) {
            co.g gVarJ0 = coVar.J0(iDW);
            int iLg = this.aM.lg();
            OW(gVarJ0, qoVar);
            this.XL.writeInt(iLg);
        } else {
            this.XL.writeInt(0);
        }
        short[] sArrHw = boVar.Hw();
        so.DW(sArrHw, qoVar);
        this.XL.writeInt(sArrHw.length);
        this.XL.ei(sArrHw);
        if (bVarArrVH.length > 0) {
            if (sArrHw.length % 2 == 1) {
                this.XL.nw((short) 0);
            }
            int iEr = this.XL.er();
            this.XL.P8(bVarArrVH.length * 8);
            bo.a[] aVarArrJ6 = boVar.j6();
            int iEr2 = this.XL.er();
            this.XL.ro(aVarArrJ6.length);
            to toVar = new to();
            for (bo.a aVar : aVarArrJ6) {
                br(toVar, iEr2, aVar, qoVar);
            }
            int iEr3 = this.XL.er();
            this.XL.vy(iEr);
            for (bo.b bVar : bVarArrVH) {
                this.XL.writeInt(bVar.FH());
                this.XL.sh(bVar.DW());
                this.XL.sh(toVar.v5(bVar.j6()));
            }
            this.XL.vy(iEr3);
        }
        this.XL.j3();
    }

    private void ro(qo qoVar) {
        this.J0 = Sf(this.QX.XL().aM, this.J0, new i(this), qoVar);
    }

    private void sG(qo qoVar) {
        this.we = Sf(this.QX.XL().XL, this.we, new k(this), qoVar);
    }

    private void sh(qo qoVar) {
        this.tp = Sf(this.QX.XL().EQ, this.tp, new g(this), qoVar);
    }

    private void sy(qo qoVar) {
        int[] iArrVy = vy(this.FH);
        Mz(iArrVy, new d());
        to toVar = new to(iArrVy.length);
        for (int i2 = 0; i2 < iArrVy.length; i2++) {
            toVar.VH(iArrVy[i2], i2);
            qoVar.cn(this.FH.v5(iArrVy[i2]), i2);
        }
        this.FH = toVar;
    }

    private void tp(int i2) {
        Iterator<zn> it = this.J8.keySet().iterator();
        while (it.hasNext()) {
            for (zn.b bVar : it.next().j6()) {
                if (bVar.DW() != -1) {
                    bVar.Hw(bVar.DW() + i2);
                } else {
                    bVar.Hw(0);
                }
            }
        }
    }

    private void u7(qo qoVar) {
        HashMap<Integer, ao> map = new HashMap<>();
        for (Map.Entry<Integer, ao> entry : this.Ws.entrySet()) {
            map.put(Integer.valueOf(qoVar.er(entry.getKey().intValue())), qoVar.Zo(entry.getValue()));
        }
        this.Ws = map;
    }

    private int v5(zn.b bVar, qo qoVar, co coVar) {
        int iYS = this.XL.yS();
        lp(coVar, coVar.QX(bVar), qoVar);
        this.QX.XL().J0.mb++;
        return iYS;
    }

    private void vJ(zn.b[] bVarArr, qo qoVar, co coVar) {
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            zn.b bVar = bVarArr[i2];
            if (bVar.DW() != 0) {
                bVarArr[i2] = new zn.b(bVar.FH(), bVar.j6(), v5(bVar, qoVar, coVar));
            } else {
                bVarArr[i2] = new zn.b(bVar.FH(), bVar.j6(), -1);
            }
        }
    }

    private static int[] vy(to toVar) {
        int[] iArr = new int[toVar.u7()];
        toVar.j6.DW();
        while (toVar.j6.j6()) {
            iArr[toVar.j6.v5()] = toVar.j6.Hw();
        }
        return iArr;
    }

    private un we(un unVar) {
        return new un(null, unVar.Zo(), unVar.FH(), unVar.DW(), unVar.v5());
    }

    private void x9() {
        int i2;
        to toVar = new to();
        HashMap mapBT = BT(this.gn);
        uo uoVar = new uo();
        Iterator<Map.Entry<Integer, ao>> it = this.Ws.entrySet().iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, ao> next = it.next();
            int iIntValue = next.getKey().intValue();
            ao value = next.getValue();
            uoVar.FH(iIntValue);
            int iGn = value.gn();
            if (iGn != 0 && this.Ws.containsKey(Integer.valueOf(iGn))) {
                toVar.VH(iIntValue, iGn);
            }
            if (value.Hw() != 0) {
                short[] sArrDW = ((mo) mapBT.get(Integer.valueOf(value.Hw()))).DW();
                int length = sArrDW.length;
                while (i2 < length) {
                    short s = sArrDW[i2];
                    if (s != 0 && this.Ws.containsKey(Short.valueOf(s))) {
                        toVar.VH(iIntValue, s);
                    }
                    i2++;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        uo uoVar2 = new uo();
        uoVar.j6.DW();
        while (uoVar.j6.j6()) {
            aj(uoVar.j6.FH(), uoVar2, arrayList, uoVar, toVar);
        }
        no noVar = this.QX;
        no.b bVarQX = noVar.QX(noVar.XL().VH);
        while (i2 < arrayList.size()) {
            this.Ws.get(arrayList.get(i2)).tp(bVarQX);
            i2++;
        }
    }

    private void yO() {
        no noVar = this.QX;
        no.b bVarQX = noVar.QX(noVar.XL().DW);
        for (int i2 : vy(this.FH)) {
            bVarQX.writeInt(i2);
        }
    }

    public void FH(int i2, ao aoVar) {
        this.Ws.put(Integer.valueOf(i2), aoVar);
    }

    public void KD() {
        qo qoVar = new qo(this.FH.u7(), this.Hw.u7(), this.v5.size(), this.Zo.size(), this.VH.size());
        ef();
        sy(qoVar);
        ca(qoVar);
        this.Zo = I(this.Zo, qoVar, new a(this, qoVar));
        Qq(qoVar);
        this.v5 = I(this.v5, qoVar, new b(this, qoVar));
        this.VH = I(this.VH, qoVar, new c(this, qoVar));
        cb(qoVar);
        sh(qoVar);
        cn(qoVar);
        ro(qoVar);
        sG(qoVar);
        u7(qoVar);
        no noVar = this.QX;
        this.aM = noVar.Hw(noVar.XL().Ws);
        no noVar2 = this.QX;
        this.XL = noVar2.v5(noVar2.XL().J0);
        this.j6 = false;
    }

    public int Mr(xn xnVar) {
        Integer numValueOf = this.EQ.get(xnVar);
        if (numValueOf == null) {
            EQ();
            numValueOf = Integer.valueOf(this.EQ.size() + 1);
            this.EQ.put(xnVar, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public void SI(co coVar) {
        DW(new ro(this, coVar).EQ(), coVar);
    }

    public int U2(dodo dodoVar) {
        Integer numValueOf = this.we.get(dodoVar);
        if (numValueOf == null) {
            EQ();
            numValueOf = Integer.valueOf(this.we.size() + 1);
            this.we.put(dodoVar, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public int VH(zn znVar) {
        int size = this.J8.size() + 1;
        this.J8.put(znVar, Integer.valueOf(size));
        return size;
    }

    public void XG(OutputStream outputStream) throws IOException {
        this.QX.U2(outputStream);
    }

    public boolean XL(int i2) {
        return this.Ws.containsKey(Integer.valueOf(i2));
    }

    public int Zo(vn vnVar) {
        int size = this.J0.size() + 1;
        this.J0.put(vnVar, Integer.valueOf(size));
        return size;
    }

    public int a8(fo foVar) {
        Integer numValueOf = this.Zo.get(foVar);
        if (numValueOf == null) {
            EQ();
            fo foVarJ0 = J0(foVar);
            numValueOf = Integer.valueOf(this.Zo.size());
            this.Zo.put(foVarJ0, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public int aM(un unVar) {
        Integer numValueOf = this.u7.get(unVar);
        if (numValueOf == null) {
            EQ();
            un unVarWe = we(unVar);
            numValueOf = Integer.valueOf(this.u7.size() + 1);
            this.u7.put(unVarWe, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public void ei() throws NoSuchAlgorithmException {
        no noVar = this.QX;
        noVar.J0(noVar.XL().Ws.mb);
        no noVar2 = this.QX;
        tp(noVar2.aM(noVar2.XL().J0.mb));
        dx();
        x9();
        kQ();
        yO();
        jJ();
        XX(this.QX.XL().Hw, this.v5, new l(this));
        XX(this.QX.XL().v5, this.Zo, new m(this));
        XX(this.QX.XL().Zo, this.VH, new n(this));
        this.QX.EQ();
    }

    public int er(byte[] bArr, int i2) {
        int iJ6 = this.DW.j6(bArr, i2);
        int iV5 = this.FH.v5(iJ6);
        if (iV5 != -1) {
            return iV5;
        }
        EQ();
        int iU7 = this.FH.u7();
        this.FH.VH(iJ6, iU7);
        return iU7;
    }

    public int gW(mo moVar) {
        Integer numValueOf = this.gn.get(moVar);
        if (numValueOf == null) {
            EQ();
            mo moVarQX = QX(moVar);
            numValueOf = Integer.valueOf(this.gn.size() + 1);
            this.gn.put(moVarQX, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public int j3(wn wnVar) {
        Integer numValueOf = this.tp.get(wnVar);
        if (numValueOf == null) {
            EQ();
            numValueOf = Integer.valueOf(this.tp.size() + 1);
            this.tp.put(wnVar, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public int lg(ho hoVar) {
        Integer numValueOf = this.VH.get(hoVar);
        if (numValueOf == null) {
            EQ();
            ho hoVarJ8 = J8(hoVar);
            numValueOf = Integer.valueOf(this.VH.size());
            this.VH.put(hoVarJ8, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public void nw(co coVar) {
        Hw(new ro(this, coVar).EQ(), coVar);
    }

    public int rN(ko koVar) {
        Integer numValueOf = this.v5.get(koVar);
        if (numValueOf == null) {
            EQ();
            ko koVarWs = Ws(koVar);
            numValueOf = Integer.valueOf(this.v5.size());
            this.v5.put(koVarWs, Integer.valueOf(numValueOf.intValue()));
        }
        return numValueOf.intValue();
    }

    public int yS(int i2) {
        int iV5 = this.Hw.v5(i2);
        if (iV5 != -1) {
            return iV5;
        }
        EQ();
        int iU7 = this.Hw.u7();
        this.Hw.VH(i2, iU7);
        return iU7;
    }
}
