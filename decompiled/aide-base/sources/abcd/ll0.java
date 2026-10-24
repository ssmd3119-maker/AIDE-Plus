package abcd;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class ll0 {
    private static String DW(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            if (bArr[i3] >= 32 && bArr[i3] <= 126) {
                stringBuffer.append((char) bArr[i3]);
            }
        }
        return stringBuffer.toString();
    }

    public static String FH(Object obj) {
        return Hw(obj, false);
    }

    public static String Hw(Object obj, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof ai0) {
            j6("", z, (ai0) obj, stringBuffer);
        } else {
            if (!(obj instanceof mh0)) {
                return "unknown object type " + obj.toString();
            }
            j6("", z, ((mh0) obj).DW(), stringBuffer);
        }
        return stringBuffer.toString();
    }

    private static String Zo(String str, String str2, boolean z, ai0 ai0Var, String str3) {
        vi0 vi0Var = (vi0) ai0Var;
        StringBuffer stringBuffer = new StringBuffer();
        if (!vi0Var.EQ()) {
            return String.valueOf(str2) + str + " ApplicationSpecific[" + vi0Var.J8() + "] (" + new String(kq0.DW(vi0Var.Ws())) + ")" + str3;
        }
        try {
            bi0 bi0VarJ8 = bi0.J8(vi0Var.QX(16));
            stringBuffer.append(String.valueOf(str2) + str + " ApplicationSpecific[" + vi0Var.J8() + "]" + str3);
            Enumeration enumerationAM = bi0VarJ8.aM();
            while (enumerationAM.hasMoreElements()) {
                j6(String.valueOf(str2) + "    ", z, (ai0) enumerationAM.nextElement(), stringBuffer);
            }
        } catch (IOException e) {
            stringBuffer.append(e);
        }
        return stringBuffer.toString();
    }

    public static void j6(String str, boolean z, ai0 ai0Var, StringBuffer stringBuffer) {
        String property = System.getProperty("line.separator");
        if (ai0Var instanceof bi0) {
            Enumeration enumerationAM = ((bi0) ai0Var).aM();
            String str2 = String.valueOf(str) + "    ";
            stringBuffer.append(str);
            if (ai0Var instanceof oi0) {
                stringBuffer.append("BER Sequence");
            } else if (ai0Var instanceof oj0) {
                stringBuffer.append("DER Sequence");
            } else {
                stringBuffer.append("Sequence");
            }
            stringBuffer.append(property);
            while (enumerationAM.hasMoreElements()) {
                Object objNextElement = enumerationAM.nextElement();
                if (objNextElement == null || objNextElement.equals(new hj0())) {
                    stringBuffer.append(str2);
                    stringBuffer.append("NULL");
                    stringBuffer.append(property);
                } else if (objNextElement instanceof ai0) {
                    j6(str2, z, (ai0) objNextElement, stringBuffer);
                } else {
                    j6(str2, z, ((mh0) objNextElement).DW(), stringBuffer);
                }
            }
            return;
        }
        if (ai0Var instanceof tj0) {
            String str3 = String.valueOf(str) + "    ";
            stringBuffer.append(str);
            if (ai0Var instanceof si0) {
                stringBuffer.append("BER Tagged [");
            } else {
                stringBuffer.append("Tagged [");
            }
            tj0 tj0Var = (tj0) ai0Var;
            stringBuffer.append(Integer.toString(tj0Var.QX()));
            stringBuffer.append(']');
            if (!tj0Var.aM()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(property);
            if (!tj0Var.XL()) {
                j6(str3, z, tj0Var.Ws(), stringBuffer);
                return;
            }
            stringBuffer.append(str3);
            stringBuffer.append("EMPTY");
            stringBuffer.append(property);
            return;
        }
        if (ai0Var instanceof qi0) {
            Enumeration enumerationJ3 = ((di0) ai0Var).j3();
            String str4 = String.valueOf(str) + "    ";
            stringBuffer.append(str);
            stringBuffer.append("BER Set");
            stringBuffer.append(property);
            while (enumerationJ3.hasMoreElements()) {
                Object objNextElement2 = enumerationJ3.nextElement();
                if (objNextElement2 == null) {
                    stringBuffer.append(str4);
                    stringBuffer.append("NULL");
                    stringBuffer.append(property);
                } else if (objNextElement2 instanceof ai0) {
                    j6(str4, z, (ai0) objNextElement2, stringBuffer);
                } else {
                    j6(str4, z, ((mh0) objNextElement2).DW(), stringBuffer);
                }
            }
            return;
        }
        if (ai0Var instanceof qj0) {
            Enumeration enumerationJ32 = ((di0) ai0Var).j3();
            String str5 = String.valueOf(str) + "    ";
            stringBuffer.append(str);
            stringBuffer.append("DER Set");
            stringBuffer.append(property);
            while (enumerationJ32.hasMoreElements()) {
                Object objNextElement3 = enumerationJ32.nextElement();
                if (objNextElement3 == null) {
                    stringBuffer.append(str5);
                    stringBuffer.append("NULL");
                    stringBuffer.append(property);
                } else if (objNextElement3 instanceof ai0) {
                    j6(str5, z, (ai0) objNextElement3, stringBuffer);
                } else {
                    j6(str5, z, ((mh0) objNextElement3).DW(), stringBuffer);
                }
            }
            return;
        }
        if (ai0Var instanceof vh0) {
            stringBuffer.append(String.valueOf(str) + "ObjectIdentifier(" + ((vh0) ai0Var).XL() + ")" + property);
            return;
        }
        if (ai0Var instanceof yi0) {
            stringBuffer.append(String.valueOf(str) + "Boolean(" + ((yi0) ai0Var).XL() + ")" + property);
            return;
        }
        if (ai0Var instanceof sh0) {
            stringBuffer.append(String.valueOf(str) + "Integer(" + ((sh0) ai0Var).XL() + ")" + property);
            return;
        }
        if (ai0Var instanceof kj0) {
            wh0 wh0Var = (wh0) ai0Var;
            stringBuffer.append(String.valueOf(str) + "DER Octet String[" + wh0Var.Ws().length + "] ");
            if (z) {
                stringBuffer.append(v5(str, wh0Var.Ws()));
                return;
            } else {
                stringBuffer.append(property);
                return;
            }
        }
        if (ai0Var instanceof xi0) {
            xi0 xi0Var = (xi0) ai0Var;
            stringBuffer.append(String.valueOf(str) + "DER Bit String[" + xi0Var.QX().length + ", " + xi0Var.j3() + "] ");
            if (z) {
                stringBuffer.append(v5(str, xi0Var.QX()));
                return;
            } else {
                stringBuffer.append(property);
                return;
            }
        }
        if (ai0Var instanceof fj0) {
            stringBuffer.append(String.valueOf(str) + "IA5String(" + ((fj0) ai0Var).FH() + ") " + property);
            return;
        }
        if (ai0Var instanceof vj0) {
            stringBuffer.append(String.valueOf(str) + "UTF8String(" + ((vj0) ai0Var).FH() + ") " + property);
            return;
        }
        if (ai0Var instanceof nj0) {
            stringBuffer.append(String.valueOf(str) + "PrintableString(" + ((nj0) ai0Var).FH() + ") " + property);
            return;
        }
        if (ai0Var instanceof xj0) {
            stringBuffer.append(String.valueOf(str) + "VisibleString(" + ((xj0) ai0Var).FH() + ") " + property);
            return;
        }
        if (ai0Var instanceof wi0) {
            stringBuffer.append(String.valueOf(str) + "BMPString(" + ((wi0) ai0Var).FH() + ") " + property);
            return;
        }
        if (ai0Var instanceof sj0) {
            stringBuffer.append(String.valueOf(str) + "T61String(" + ((sj0) ai0Var).FH() + ") " + property);
            return;
        }
        if (ai0Var instanceof uj0) {
            stringBuffer.append(String.valueOf(str) + "UTCTime(" + ((uj0) ai0Var).XL() + ") " + property);
            return;
        }
        if (ai0Var instanceof ej0) {
            stringBuffer.append(String.valueOf(str) + "GeneralizedTime(" + ((ej0) ai0Var).XL() + ") " + property);
            return;
        }
        if (ai0Var instanceof ji0) {
            stringBuffer.append(Zo("BER", str, z, ai0Var, property));
            return;
        }
        if (ai0Var instanceof vi0) {
            stringBuffer.append(Zo("DER", str, z, ai0Var, property));
            return;
        }
        if (ai0Var instanceof zi0) {
            stringBuffer.append(String.valueOf(str) + "DER Enumerated(" + ((zi0) ai0Var).Ws() + ")" + property);
            return;
        }
        if (!(ai0Var instanceof aj0)) {
            stringBuffer.append(String.valueOf(str) + ai0Var.toString() + property);
            return;
        }
        aj0 aj0Var = (aj0) ai0Var;
        stringBuffer.append(String.valueOf(str) + "External " + property);
        StringBuilder sb = new StringBuilder(String.valueOf(str));
        sb.append("    ");
        String string = sb.toString();
        if (aj0Var.Ws() != null) {
            stringBuffer.append(String.valueOf(string) + "Direct Reference: " + aj0Var.Ws().XL() + property);
        }
        if (aj0Var.aM() != null) {
            stringBuffer.append(String.valueOf(string) + "Indirect Reference: " + aj0Var.aM().toString() + property);
        }
        if (aj0Var.J8() != null) {
            j6(string, z, aj0Var.J8(), stringBuffer);
        }
        stringBuffer.append(String.valueOf(string) + "Encoding: " + aj0Var.QX() + property);
        j6(string, z, aj0Var.XL(), stringBuffer);
    }

    private static String v5(String str, byte[] bArr) {
        String property = System.getProperty("line.separator");
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = String.valueOf(str) + "    ";
        stringBuffer.append(property);
        for (int i = 0; i < bArr.length; i += 32) {
            if (bArr.length - i > 32) {
                stringBuffer.append(str2);
                stringBuffer.append(new String(kq0.FH(bArr, i, 32)));
                stringBuffer.append("    ");
                stringBuffer.append(DW(bArr, i, 32));
                stringBuffer.append(property);
            } else {
                stringBuffer.append(str2);
                stringBuffer.append(new String(kq0.FH(bArr, i, bArr.length - i)));
                for (int length = bArr.length - i; length != 32; length++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                stringBuffer.append(DW(bArr, i, bArr.length - i));
                stringBuffer.append(property);
            }
        }
        return stringBuffer.toString();
    }
}
