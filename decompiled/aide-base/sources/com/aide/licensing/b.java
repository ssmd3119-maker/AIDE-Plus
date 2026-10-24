package com.aide.licensing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.j8;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

@cy(clazz = 6752123745821768904L, container = 6752123745821768904L, user = true)
/* loaded from: classes.dex */
public class b {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -1499596370687585975L)
    public long DW;

    @dy(field = -2824691263209289155L)
    public String FH;

    @dy(field = 1092981816350088093L)
    public String Hw;

    @dy(field = -1854716412271189344L)
    public String VH;

    @dy(field = 585606295366607172L)
    public long Zo;

    @dy(field = -6213064132237129472L)
    public long gn;

    @dy(field = -1725827226398937792L)
    public int j6;

    @dy(field = -4459126834836677520L)
    public long u7;

    @dy(field = -1235683801542340040L)
    public String v5;

    static {
        iy.Zo(b.class);
    }

    @ey(method = -3032890657054588179L)
    public b() {
        try {
            if (tp) {
                iy.gn(-157850396626685949L, null);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, -157850396626685949L, null);
            }
            throw th;
        }
    }

    @ey(method = 244257446505949568L)
    public static b j6(String str) {
        String strSubstring;
        try {
            if (tp) {
                iy.tp(6086071211103790000L, null, str);
            }
            int iIndexOf = str.indexOf(58);
            String strSubstring2 = "";
            if (-1 == iIndexOf) {
                strSubstring = str;
            } else {
                strSubstring = str.substring(0, iIndexOf);
                if (iIndexOf < str.length()) {
                    strSubstring2 = str.substring(iIndexOf + 1);
                }
            }
            String[] strArrSplit = TextUtils.split(strSubstring, Pattern.quote("|"));
            if (strArrSplit.length < 6) {
                throw new IllegalArgumentException("Wrong number of fields.");
            }
            b bVar = new b();
            bVar.VH = strSubstring2;
            bVar.j6 = Integer.parseInt(strArrSplit[0]);
            bVar.DW = Long.parseLong(strArrSplit[1]);
            bVar.FH = strArrSplit[2];
            bVar.Hw = strArrSplit[3];
            bVar.v5 = strArrSplit[4];
            bVar.Zo = Long.parseLong(strArrSplit[5]);
            j8.j6("timestamp: " + new Date(bVar.Zo).toString());
            if (bVar.j6 == 0 || bVar.j6 == 2) {
                HashMap map = new HashMap();
                try {
                    for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI("?" + bVar.VH), "UTF-8")) {
                        map.put(nameValuePair.getName(), nameValuePair.getValue());
                    }
                    bVar.gn = Long.parseLong((String) map.get("VT"));
                    bVar.u7 = Long.parseLong((String) map.get("GT"));
                    j8.j6("validity timestamp: " + new Date(bVar.gn).toString());
                    j8.j6("grace timestamp: " + new Date(bVar.u7).toString());
                } catch (URISyntaxException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            return bVar;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 6086071211103790000L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -474852124234084405L)
    public String toString() {
        try {
            if (tp) {
                iy.gn(1705051724595363429L, this);
            }
            return TextUtils.join("|", new Object[]{Integer.valueOf(this.j6), Long.valueOf(this.DW), this.FH, this.Hw, this.v5, Long.valueOf(this.Zo)});
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1705051724595363429L, this);
            }
            throw th;
        }
    }
}
