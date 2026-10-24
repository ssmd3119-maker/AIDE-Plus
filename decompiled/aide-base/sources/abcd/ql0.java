package abcd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class ql0 implements pl0 {
    public static final vh0 BT;
    public static final vh0 KD;
    public static final vh0 P8;
    public static final vh0 SI;
    private static final Hashtable cn;
    public static final vh0 ei;
    public static final vh0 gW;
    public static final vh0 nw;
    private static final Hashtable ro;
    public static final vh0 vy;
    public static final pl0 j6 = new ql0();
    public static final vh0 DW = new vh0("2.5.4.6");
    public static final vh0 FH = new vh0("2.5.4.10");
    public static final vh0 Hw = new vh0("2.5.4.11");
    public static final vh0 v5 = new vh0("2.5.4.12");
    public static final vh0 Zo = new vh0("2.5.4.3");
    public static final vh0 VH = new vh0("2.5.4.5");
    public static final vh0 gn = new vh0("2.5.4.9");
    public static final vh0 u7 = new vh0("2.5.4.7");
    public static final vh0 tp = new vh0("2.5.4.8");
    public static final vh0 EQ = new vh0("2.5.4.4");
    public static final vh0 we = new vh0("2.5.4.42");
    public static final vh0 J0 = new vh0("2.5.4.43");
    public static final vh0 J8 = new vh0("2.5.4.44");
    public static final vh0 Ws = new vh0("2.5.4.45");
    public static final vh0 QX = new vh0("2.5.4.15");
    public static final vh0 XL = new vh0("2.5.4.17");
    public static final vh0 aM = new vh0("2.5.4.46");
    public static final vh0 j3 = new vh0("2.5.4.65");
    public static final vh0 Mr = new vh0("1.3.6.1.5.5.7.9.1");
    public static final vh0 U2 = new vh0("1.3.6.1.5.5.7.9.2");
    public static final vh0 a8 = new vh0("1.3.6.1.5.5.7.9.3");
    public static final vh0 lg = new vh0("1.3.6.1.5.5.7.9.4");
    public static final vh0 rN = new vh0("1.3.6.1.5.5.7.9.5");
    public static final vh0 er = new vh0("1.3.36.8.3.14");
    public static final vh0 yS = new vh0("2.5.4.16");

    static {
        new vh0("2.5.4.54");
        gW = jm0.aq;
        BT = jm0.FN;
        vy = hl0.sG;
        P8 = hl0.ef;
        ei = hl0.I;
        nw = vy;
        SI = new vh0("0.9.2342.19200300.100.1.25");
        KD = new vh0("0.9.2342.19200300.100.1.1");
        ro = new Hashtable();
        cn = new Hashtable();
        ro.put(DW, "C");
        ro.put(FH, "O");
        ro.put(v5, "T");
        ro.put(Hw, "OU");
        ro.put(Zo, "CN");
        ro.put(u7, "L");
        ro.put(tp, "ST");
        ro.put(VH, "SERIALNUMBER");
        ro.put(vy, "E");
        ro.put(SI, "DC");
        ro.put(KD, "UID");
        ro.put(gn, "STREET");
        ro.put(EQ, "SURNAME");
        ro.put(we, "GIVENNAME");
        ro.put(J0, "INITIALS");
        ro.put(J8, "GENERATION");
        ro.put(ei, "unstructuredAddress");
        ro.put(P8, "unstructuredName");
        ro.put(Ws, "UniqueIdentifier");
        ro.put(aM, "DN");
        ro.put(j3, "Pseudonym");
        ro.put(yS, "PostalAddress");
        ro.put(er, "NameAtBirth");
        ro.put(lg, "CountryOfCitizenship");
        ro.put(rN, "CountryOfResidence");
        ro.put(a8, "Gender");
        ro.put(U2, "PlaceOfBirth");
        ro.put(Mr, "DateOfBirth");
        ro.put(XL, "PostalCode");
        ro.put(QX, "BusinessCategory");
        ro.put(gW, "TelephoneNumber");
        ro.put(BT, "Name");
        cn.put("c", DW);
        cn.put("o", FH);
        cn.put("t", v5);
        cn.put("ou", Hw);
        cn.put("cn", Zo);
        cn.put("l", u7);
        cn.put("st", tp);
        cn.put("sn", VH);
        cn.put("serialnumber", VH);
        cn.put("street", gn);
        cn.put("emailaddress", nw);
        cn.put("dc", SI);
        cn.put("e", nw);
        cn.put("uid", KD);
        cn.put("surname", EQ);
        cn.put("givenname", we);
        cn.put("initials", J0);
        cn.put("generation", J8);
        cn.put("unstructuredaddress", ei);
        cn.put("unstructuredname", P8);
        cn.put("uniqueidentifier", Ws);
        cn.put("dn", aM);
        cn.put("pseudonym", j3);
        cn.put("postaladdress", yS);
        cn.put("nameofbirth", er);
        cn.put("countryofcitizenship", lg);
        cn.put("countryofresidence", rN);
        cn.put("gender", a8);
        cn.put("placeofbirth", U2);
        cn.put("dateofbirth", Mr);
        cn.put("postalcode", XL);
        cn.put("businesscategory", QX);
        cn.put("telephonenumber", gW);
        cn.put(AppMeasurementSdk.ConditionalUserProperty.NAME, BT);
    }

    private boolean Hw(ml0 ml0Var, ml0 ml0Var2) {
        if (ml0Var == ml0Var2) {
            return true;
        }
        return ml0Var != null && ml0Var2 != null && ml0Var.gn().equals(ml0Var2.gn()) && rl0.FH(rl0.Zo(ml0Var.u7())).equals(rl0.FH(rl0.Zo(ml0Var2.u7())));
    }

    private boolean Zo(boolean z, nl0 nl0Var, nl0[] nl0VarArr) {
        if (z) {
            for (int length = nl0VarArr.length - 1; length >= 0; length--) {
                if (nl0VarArr[length] != null && VH(nl0Var, nl0VarArr[length])) {
                    nl0VarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != nl0VarArr.length; i++) {
                if (nl0VarArr[i] != null && VH(nl0Var, nl0VarArr[i])) {
                    nl0VarArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    private int v5(mh0 mh0Var) {
        return rl0.FH(rl0.Zo(mh0Var)).hashCode();
    }

    @Override // abcd.pl0
    public String DW(ol0 ol0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        nl0[] nl0VarArrGn = ol0Var.gn();
        boolean z = true;
        for (int i = 0; i < nl0VarArrGn.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            if (nl0VarArrGn[i].tp()) {
                ml0[] ml0VarArrU7 = nl0VarArrGn[i].u7();
                boolean z2 = true;
                for (int i2 = 0; i2 != ml0VarArrU7.length; i2++) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('+');
                    }
                    rl0.j6(stringBuffer, ml0VarArrU7[i2], ro);
                }
            } else {
                rl0.j6(stringBuffer, nl0VarArrGn[i].VH(), ro);
            }
        }
        return stringBuffer.toString();
    }

    @Override // abcd.pl0
    public int FH(ol0 ol0Var) {
        nl0[] nl0VarArrGn = ol0Var.gn();
        int iHashCode = 0;
        for (int i = 0; i != nl0VarArrGn.length; i++) {
            if (nl0VarArrGn[i].tp()) {
                ml0[] ml0VarArrU7 = nl0VarArrGn[i].u7();
                for (int i2 = 0; i2 != ml0VarArrU7.length; i2++) {
                    iHashCode = (iHashCode ^ ml0VarArrU7[i2].gn().hashCode()) ^ v5(ml0VarArrU7[i2].u7());
                }
            } else {
                iHashCode = (iHashCode ^ nl0VarArrGn[i].VH().gn().hashCode()) ^ v5(nl0VarArrGn[i].VH().u7());
            }
        }
        return iHashCode;
    }

    public boolean VH(nl0 nl0Var, nl0 nl0Var2) {
        if (!nl0Var.tp()) {
            if (nl0Var2.tp()) {
                return false;
            }
            return Hw(nl0Var.VH(), nl0Var2.VH());
        }
        if (!nl0Var2.tp()) {
            return false;
        }
        ml0[] ml0VarArrU7 = nl0Var.u7();
        ml0[] ml0VarArrU72 = nl0Var2.u7();
        if (ml0VarArrU7.length != ml0VarArrU72.length) {
            return false;
        }
        for (int i = 0; i != ml0VarArrU7.length; i++) {
            if (!Hw(ml0VarArrU7[i], ml0VarArrU72[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // abcd.pl0
    public boolean j6(ol0 ol0Var, ol0 ol0Var2) {
        nl0[] nl0VarArrGn = ol0Var.gn();
        nl0[] nl0VarArrGn2 = ol0Var2.gn();
        if (nl0VarArrGn.length != nl0VarArrGn2.length) {
            return false;
        }
        boolean z = (nl0VarArrGn[0].VH() == null || nl0VarArrGn2[0].VH() == null) ? false : !nl0VarArrGn[0].VH().gn().equals(nl0VarArrGn2[0].VH().gn());
        for (int i = 0; i != nl0VarArrGn.length; i++) {
            if (!Zo(z, nl0VarArrGn[i], nl0VarArrGn2)) {
                return false;
            }
        }
        return true;
    }
}
