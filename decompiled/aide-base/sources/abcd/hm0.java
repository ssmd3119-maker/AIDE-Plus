package abcd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class hm0 extends uh0 {
    public static final vh0 AE;
    public static boolean An;
    public static final vh0 BR;
    public static final Hashtable Bx;
    public static final vh0 IS;
    public static final Hashtable Jm;
    public static final vh0 Nh;
    public static final Hashtable Pa;
    public static final vh0 Za;
    public static final vh0 a5;
    public static final Hashtable ce;
    public static final vh0 gG;
    private static final Boolean oa;
    private static final Boolean qP;
    public static final vh0 ys;
    private boolean k2;
    private bi0 qp;
    private int zh;
    public static final vh0 AL = new vh0("2.5.4.6");
    public static final vh0 w9 = new vh0("2.5.4.10");
    public static final vh0 hK = new vh0("2.5.4.11");
    public static final vh0 cT = new vh0("2.5.4.12");
    public static final vh0 q7 = new vh0("2.5.4.3");
    public static final vh0 Z1 = new vh0("2.5.4.5");
    public static final vh0 n5 = new vh0("2.5.4.9");
    public static final vh0 Q6 = new vh0("2.5.4.7");
    public static final vh0 kf = new vh0("2.5.4.8");
    public static final vh0 Jl = new vh0("2.5.4.4");
    public static final vh0 iW = new vh0("2.5.4.42");
    public static final vh0 eU = new vh0("2.5.4.43");
    public static final vh0 e3 = new vh0("2.5.4.44");
    public static final vh0 sE = new vh0("2.5.4.45");
    public static final vh0 sg = new vh0("2.5.4.15");
    public static final vh0 pO = new vh0("2.5.4.17");
    public static final vh0 fN = new vh0("2.5.4.46");
    public static final vh0 Gj = new vh0("2.5.4.65");
    public static final vh0 Cz = new vh0("1.3.6.1.5.5.7.9.1");
    public static final vh0 pN = new vh0("1.3.6.1.5.5.7.9.2");
    public static final vh0 oy = new vh0("1.3.6.1.5.5.7.9.3");
    public static final vh0 aX = new vh0("1.3.6.1.5.5.7.9.4");
    public static final vh0 e9 = new vh0("1.3.6.1.5.5.7.9.5");
    public static final vh0 QO = new vh0("1.3.36.8.3.14");
    public static final vh0 sM = new vh0("2.5.4.16");
    private im0 WB = null;
    private Vector mb = new Vector();
    private Vector jw = new Vector();
    private Vector fY = new Vector();

    static {
        new vh0("2.5.4.54");
        a5 = jm0.aq;
        ys = jm0.FN;
        IS = hl0.sG;
        gG = hl0.ef;
        Nh = hl0.I;
        BR = IS;
        AE = new vh0("0.9.2342.19200300.100.1.25");
        Za = new vh0("0.9.2342.19200300.100.1.1");
        An = false;
        Pa = new Hashtable();
        ce = new Hashtable();
        Jm = new Hashtable();
        Bx = new Hashtable();
        oa = new Boolean(true);
        qP = new Boolean(false);
        Pa.put(AL, "C");
        Pa.put(w9, "O");
        Pa.put(cT, "T");
        Pa.put(hK, "OU");
        Pa.put(q7, "CN");
        Pa.put(Q6, "L");
        Pa.put(kf, "ST");
        Pa.put(Z1, "SERIALNUMBER");
        Pa.put(IS, "E");
        Pa.put(AE, "DC");
        Pa.put(Za, "UID");
        Pa.put(n5, "STREET");
        Pa.put(Jl, "SURNAME");
        Pa.put(iW, "GIVENNAME");
        Pa.put(eU, "INITIALS");
        Pa.put(e3, "GENERATION");
        Pa.put(Nh, "unstructuredAddress");
        Pa.put(gG, "unstructuredName");
        Pa.put(sE, "UniqueIdentifier");
        Pa.put(fN, "DN");
        Pa.put(Gj, "Pseudonym");
        Pa.put(sM, "PostalAddress");
        Pa.put(QO, "NameAtBirth");
        Pa.put(aX, "CountryOfCitizenship");
        Pa.put(e9, "CountryOfResidence");
        Pa.put(oy, "Gender");
        Pa.put(pN, "PlaceOfBirth");
        Pa.put(Cz, "DateOfBirth");
        Pa.put(pO, "PostalCode");
        Pa.put(sg, "BusinessCategory");
        Pa.put(a5, "TelephoneNumber");
        Pa.put(ys, "Name");
        ce.put(AL, "C");
        ce.put(w9, "O");
        ce.put(hK, "OU");
        ce.put(q7, "CN");
        ce.put(Q6, "L");
        ce.put(kf, "ST");
        ce.put(n5, "STREET");
        ce.put(AE, "DC");
        ce.put(Za, "UID");
        Jm.put(AL, "C");
        Jm.put(w9, "O");
        Jm.put(hK, "OU");
        Jm.put(q7, "CN");
        Jm.put(Q6, "L");
        Jm.put(kf, "ST");
        Jm.put(n5, "STREET");
        Bx.put("c", AL);
        Bx.put("o", w9);
        Bx.put("t", cT);
        Bx.put("ou", hK);
        Bx.put("cn", q7);
        Bx.put("l", Q6);
        Bx.put("st", kf);
        Bx.put("sn", Z1);
        Bx.put("serialnumber", Z1);
        Bx.put("street", n5);
        Bx.put("emailaddress", BR);
        Bx.put("dc", AE);
        Bx.put("e", BR);
        Bx.put("uid", Za);
        Bx.put("surname", Jl);
        Bx.put("givenname", iW);
        Bx.put("initials", eU);
        Bx.put("generation", e3);
        Bx.put("unstructuredaddress", Nh);
        Bx.put("unstructuredname", gG);
        Bx.put("uniqueidentifier", sE);
        Bx.put("dn", fN);
        Bx.put("pseudonym", Gj);
        Bx.put("postaladdress", sM);
        Bx.put("nameofbirth", QO);
        Bx.put("countryofcitizenship", aX);
        Bx.put("countryofresidence", e9);
        Bx.put("gender", oy);
        Bx.put("placeofbirth", pN);
        Bx.put("dateofbirth", Cz);
        Bx.put("postalcode", pO);
        Bx.put("businesscategory", sg);
        Bx.put("telephonenumber", a5);
        Bx.put(AppMeasurementSdk.ConditionalUserProperty.NAME, ys);
    }

    public hm0() {
    }

    private boolean EQ(String str, String str2) {
        String strU7 = u7(str);
        String strU72 = u7(str2);
        return strU7.equals(strU72) || J0(strU7).equals(J0(strU72));
    }

    private String J0(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    private void VH(StringBuffer stringBuffer, Hashtable hashtable, vh0 vh0Var, String str) {
        String str2 = (String) hashtable.get(vh0Var);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(vh0Var.XL());
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length != length2) {
            if (stringBuffer.charAt(length) == ',' || stringBuffer.charAt(length) == '\"' || stringBuffer.charAt(length) == '\\' || stringBuffer.charAt(length) == '+' || stringBuffer.charAt(length) == '=' || stringBuffer.charAt(length) == '<' || stringBuffer.charAt(length) == '>' || stringBuffer.charAt(length) == ';') {
                stringBuffer.insert(length, "\\");
                length++;
                length2++;
            }
            length++;
        }
    }

    private String gn(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    private ai0 tp(String str) {
        try {
            return ai0.tp(kq0.j6(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    private String u7(String str) {
        String strV5 = iq0.v5(str.trim());
        if (strV5.length() <= 0 || strV5.charAt(0) != '#') {
            return strV5;
        }
        mh0 mh0VarTp = tp(strV5);
        return mh0VarTp instanceof gi0 ? iq0.v5(((gi0) mh0VarTp).FH().trim()) : strV5;
    }

    public static hm0 we(Object obj) {
        if (obj == null || (obj instanceof hm0)) {
            return (hm0) obj;
        }
        if (obj instanceof ol0) {
            return new hm0(bi0.J8(((ol0) obj).DW()));
        }
        if (obj != null) {
            return new hm0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        if (this.qp == null) {
            nh0 nh0Var = new nh0();
            nh0 nh0Var2 = new nh0();
            vh0 vh0Var = null;
            int i = 0;
            while (i != this.mb.size()) {
                nh0 nh0Var3 = new nh0();
                vh0 vh0Var2 = (vh0) this.mb.elementAt(i);
                nh0Var3.j6(vh0Var2);
                nh0Var3.j6(this.WB.j6(vh0Var2, (String) this.jw.elementAt(i)));
                if (vh0Var == null || ((Boolean) this.fY.elementAt(i)).booleanValue()) {
                    nh0Var2.j6(new oj0(nh0Var3));
                } else {
                    nh0Var.j6(new qj0(nh0Var2));
                    nh0Var2 = new nh0();
                    nh0Var2.j6(new oj0(nh0Var3));
                }
                i++;
                vh0Var = vh0Var2;
            }
            nh0Var.j6(new qj0(nh0Var2));
            this.qp = new oj0(nh0Var);
        }
        return this.qp;
    }

    public String J8(boolean z, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i = 0; i < this.mb.size(); i++) {
            if (((Boolean) this.fY.elementAt(i)).booleanValue()) {
                stringBuffer2.append('+');
                VH(stringBuffer2, hashtable, (vh0) this.mb.elementAt(i), (String) this.jw.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                VH(stringBuffer2, hashtable, (vh0) this.mb.elementAt(i), (String) this.jw.elementAt(i));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z2 = true;
        if (z) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(i2).toString());
            }
        }
        return stringBuffer.toString();
    }

    @Override // abcd.uh0
    public boolean equals(Object obj) {
        int i;
        int i2;
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hm0) && !(obj instanceof bi0)) {
            return false;
        }
        if (DW().equals(((mh0) obj).DW())) {
            return true;
        }
        try {
            hm0 hm0VarWe = we(obj);
            int size = this.mb.size();
            if (size != hm0VarWe.mb.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            int i3 = -1;
            if (this.mb.elementAt(0).equals(hm0VarWe.mb.elementAt(0))) {
                i3 = size;
                i = 0;
                i2 = 1;
            } else {
                i = size - 1;
                i2 = -1;
            }
            while (i != i3) {
                vh0 vh0Var = (vh0) this.mb.elementAt(i);
                String str = (String) this.jw.elementAt(i);
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z = false;
                        break;
                    }
                    if (!zArr[i4] && vh0Var.equals((vh0) hm0VarWe.mb.elementAt(i4)) && EQ(str, (String) hm0VarWe.jw.elementAt(i4))) {
                        zArr[i4] = true;
                        z = true;
                        break;
                    }
                    i4++;
                }
                if (!z) {
                    return false;
                }
                i += i2;
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // abcd.uh0
    public int hashCode() {
        if (this.k2) {
            return this.zh;
        }
        this.k2 = true;
        for (int i = 0; i != this.mb.size(); i++) {
            String strJ0 = J0(u7((String) this.jw.elementAt(i)));
            int iHashCode = this.zh ^ this.mb.elementAt(i).hashCode();
            this.zh = iHashCode;
            this.zh = strJ0.hashCode() ^ iHashCode;
        }
        return this.zh;
    }

    public String toString() {
        return J8(An, Pa);
    }

    public hm0(bi0 bi0Var) {
        this.qp = bi0Var;
        Enumeration enumerationAM = bi0Var.aM();
        while (enumerationAM.hasMoreElements()) {
            di0 di0VarWs = di0.Ws(((mh0) enumerationAM.nextElement()).DW());
            int i = 0;
            while (i < di0VarWs.U2()) {
                bi0 bi0VarJ8 = bi0.J8(di0VarWs.aM(i).DW());
                if (bi0VarJ8.j3() == 2) {
                    this.mb.addElement(jj0.aM(bi0VarJ8.XL(0)));
                    mh0 mh0VarXL = bi0VarJ8.XL(1);
                    if ((mh0VarXL instanceof gi0) && !(mh0VarXL instanceof wj0)) {
                        String strFH = ((gi0) mh0VarXL).FH();
                        if (strFH.length() > 0 && strFH.charAt(0) == '#') {
                            this.jw.addElement("\\" + strFH);
                        } else {
                            this.jw.addElement(strFH);
                        }
                    } else {
                        try {
                            this.jw.addElement("#" + gn(kq0.DW(mh0VarXL.DW().Zo("DER"))));
                        } catch (IOException unused) {
                            throw new IllegalArgumentException("cannot encode value");
                        }
                    }
                    this.fY.addElement(i != 0 ? oa : qP);
                    i++;
                } else {
                    throw new IllegalArgumentException("badly sized pair");
                }
            }
        }
    }
}
