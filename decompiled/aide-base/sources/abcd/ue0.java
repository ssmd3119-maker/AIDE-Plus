package abcd;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.BitSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ue0 implements Serializable {
    private String WB;
    private String fY;
    private String jw;
    private int k2;
    private String mb;
    private String qp;
    private String zh;
    private static final Pattern AL = Pattern.compile("^([a-z][a-z0-9+-]+)://(?:(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]+)(?::(\\d+))?((?:/~(?:[^\\\\/]+))?[\\\\/]))?(.+)?$");
    private static final Pattern w9 = Pattern.compile("^([\\\\/]?((?:[A-Za-z]:)?[\\\\/]?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?)))$");
    private static final Pattern hK = Pattern.compile("^(file):([\\\\/](?![\\\\/])((?:[A-Za-z]:)?[\\\\/]?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?)))$");
    private static final Pattern cT = Pattern.compile("^(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]+):((?:(?:/~(?:[^\\\\/]+))[\\\\/])?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?))$");
    private static final Pattern q7 = Pattern.compile("^(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]{2,}):([\\\\/](?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?))$");
    private static final BitSet Z1 = new BitSet(127);

    static {
        for (byte b : r60.Hw("!*'();:@&=+$,/?#[]")) {
            Z1.set(b);
        }
    }

    public ue0(String str) throws URISyntaxException {
        this.k2 = -1;
        if (ng0.DW(str)) {
            throw new URISyntaxException("The uri was empty or null", JGitText.DW().cannotParseGitURIish);
        }
        Matcher matcher = hK.matcher(str);
        if (matcher.matches()) {
            this.WB = matcher.group(1);
            String strJ6 = j6(matcher.group(2), this.WB);
            this.jw = strJ6;
            this.mb = U2(strJ6);
            return;
        }
        Matcher matcher2 = AL.matcher(str);
        if (matcher2.matches()) {
            this.WB = matcher2.group(1);
            this.fY = U2(matcher2.group(2));
            this.qp = U2(matcher2.group(3));
            this.zh = U2(matcher2.group(4));
            if (matcher2.group(5) != null) {
                this.k2 = Integer.parseInt(matcher2.group(5));
            }
            String strJ62 = j6(String.valueOf(J0(matcher2.group(6))) + J0(matcher2.group(7)), this.WB);
            this.jw = strJ62;
            this.mb = U2(strJ62);
            return;
        }
        Matcher matcher3 = cT.matcher(str);
        if (matcher3.matches()) {
            this.fY = matcher3.group(1);
            this.qp = matcher3.group(2);
            this.zh = matcher3.group(3);
            String strGroup = matcher3.group(4);
            this.jw = strGroup;
            this.mb = strGroup;
            return;
        }
        Matcher matcher4 = q7.matcher(str);
        if (matcher4.matches()) {
            this.fY = matcher4.group(1);
            this.qp = matcher4.group(2);
            this.zh = matcher4.group(3);
            String strGroup2 = matcher4.group(4);
            this.jw = strGroup2;
            this.mb = strGroup2;
            return;
        }
        Matcher matcher5 = w9.matcher(str);
        if (!matcher5.matches()) {
            throw new URISyntaxException(str, JGitText.DW().cannotParseGitURIish);
        }
        String strGroup3 = matcher5.group(1);
        this.jw = strGroup3;
        this.mb = strGroup3;
    }

    private static boolean DW(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    private static String FH(String str, boolean z, boolean z2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        try {
            for (byte b : str.getBytes("UTF-8")) {
                int i = b & 255;
                if (i <= 32 || ((z2 && i > 127) || i == 37 || (z && Z1.get(i)))) {
                    byteArrayOutputStream.write(37);
                    byte[] bArrHw = r60.Hw(String.format("%02x", Integer.valueOf(i)));
                    byteArrayOutputStream.write(bArrHw[0]);
                    byteArrayOutputStream.write(bArrHw[1]);
                } else {
                    byteArrayOutputStream.write(i);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return kg0.gn(byteArray, 0, byteArray.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private String Hw(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (EQ() != null) {
            sb.append(EQ());
            sb.append("://");
        }
        if (we() != null) {
            sb.append(FH(we(), true, z3));
            if (z && VH() != null) {
                sb.append(':');
                sb.append(FH(VH(), true, z3));
            }
        }
        if (v5() != null) {
            if (we() != null) {
                sb.append('@');
            }
            sb.append(FH(v5(), false, z3));
            if (EQ() != null && u7() > 0) {
                sb.append(':');
                sb.append(u7());
            }
        }
        if (gn() != null) {
            if (EQ() != null) {
                if (!gn().startsWith("/")) {
                    sb.append('/');
                }
            } else if (v5() != null) {
                sb.append(':');
            }
            if (EQ() == null) {
                sb.append(gn());
            } else if (z3) {
                sb.append(FH(gn(), false, z3));
            } else {
                sb.append(tp());
            }
        }
        return sb.toString();
    }

    private String J0(String str) {
        return str == null ? "" : str;
    }

    private static String U2(String str) throws URISyntaxException, UnsupportedEncodingException {
        int i;
        if (str == null) {
            return null;
        }
        if (str.indexOf(37) < 0) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArr = new byte[bytes.length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < bytes.length) {
                byte b = bytes[i2];
                if (b == 37) {
                    int i4 = i2 + 2;
                    if (i4 >= bytes.length) {
                        throw new URISyntaxException(str, JGitText.DW().cannotParseGitURIish);
                    }
                    i = i3 + 1;
                    bArr[i3] = (byte) ((kg0.rN(bytes[i2 + 1]) << 4) | kg0.rN(bytes[i4]));
                    i2 = i4;
                } else {
                    i = i3 + 1;
                    bArr[i3] = b;
                }
                i3 = i;
                i2++;
            }
            return kg0.gn(bArr, 0, i3);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private String j6(String str, String str2) {
        return (str.length() < 3 || str.charAt(0) != '/' || str.charAt(2) != ':' || ((str.charAt(1) < 'A' || str.charAt(1) > 'Z') && (str.charAt(1) < 'a' || str.charAt(1) > 'z'))) ? (str2 == null || str.length() < 2 || str.charAt(0) != '/' || str.charAt(1) != '~') ? str : str.substring(1) : str.substring(1);
    }

    public String EQ() {
        return this.WB;
    }

    public ue0 J8(String str) {
        ue0 ue0Var = new ue0(this);
        ue0Var.zh = str;
        return ue0Var;
    }

    public String Mr() {
        return Hw(true, false, false);
    }

    public ue0 QX(String str) {
        ue0 ue0Var = new ue0(this);
        ue0Var.mb = str;
        ue0Var.jw = str;
        return ue0Var;
    }

    public String VH() {
        return this.qp;
    }

    public ue0 Ws(String str) {
        ue0 ue0Var = new ue0(this);
        ue0Var.qp = str;
        return ue0Var;
    }

    public ue0 XL(int i) {
        ue0 ue0Var = new ue0(this);
        if (i <= 0) {
            i = -1;
        }
        ue0Var.k2 = i;
        return ue0Var;
    }

    public String Zo() {
        String[] strArrSplit;
        if ("".equals(gn()) || gn() == null) {
            throw new IllegalArgumentException();
        }
        String strGn = gn();
        if ("file".equals(this.WB) || w9.matcher(strGn).matches()) {
            strArrSplit = strGn.split("[\\" + File.separatorChar + "/]");
        } else {
            strArrSplit = strGn.split("/");
        }
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException();
        }
        String str = strArrSplit[strArrSplit.length - 1];
        return ".git".equals(str) ? strArrSplit[strArrSplit.length - 2] : str.endsWith(".git") ? str.substring(0, str.length() - 4) : str;
    }

    public ue0 aM(String str) {
        ue0 ue0Var = new ue0(this);
        ue0Var.WB = str;
        return ue0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ue0)) {
            return false;
        }
        ue0 ue0Var = (ue0) obj;
        return DW(EQ(), ue0Var.EQ()) && DW(we(), ue0Var.we()) && DW(VH(), ue0Var.VH()) && DW(v5(), ue0Var.v5()) && u7() == ue0Var.u7() && DW(gn(), ue0Var.gn());
    }

    public String gn() {
        return this.mb;
    }

    public int hashCode() {
        int iHashCode = EQ() != null ? 0 + EQ().hashCode() : 0;
        if (we() != null) {
            iHashCode = (iHashCode * 31) + we().hashCode();
        }
        if (VH() != null) {
            iHashCode = (iHashCode * 31) + VH().hashCode();
        }
        if (v5() != null) {
            iHashCode = (iHashCode * 31) + v5().hashCode();
        }
        if (u7() > 0) {
            iHashCode = (iHashCode * 31) + u7();
        }
        return gn() != null ? (iHashCode * 31) + gn().hashCode() : iHashCode;
    }

    public ue0 j3(String str) {
        ue0 ue0Var = new ue0(this);
        ue0Var.fY = str;
        return ue0Var;
    }

    public String toString() {
        return Hw(false, false, false);
    }

    public String tp() {
        return this.jw;
    }

    public int u7() {
        return this.k2;
    }

    public String v5() {
        return this.zh;
    }

    public String we() {
        return this.fY;
    }

    public ue0(URL url) {
        this.k2 = -1;
        this.WB = url.getProtocol();
        this.mb = url.getPath();
        try {
            this.jw = url.toURI().getRawPath();
            String userInfo = url.getUserInfo();
            if (userInfo != null) {
                int iIndexOf = userInfo.indexOf(58);
                this.fY = iIndexOf < 0 ? userInfo : userInfo.substring(0, iIndexOf);
                this.qp = iIndexOf < 0 ? null : userInfo.substring(iIndexOf + 1);
            }
            this.k2 = url.getPort();
            this.zh = url.getHost();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public ue0() {
        this.k2 = -1;
    }

    private ue0(ue0 ue0Var) {
        this.k2 = -1;
        this.WB = ue0Var.WB;
        this.jw = ue0Var.jw;
        this.mb = ue0Var.mb;
        this.fY = ue0Var.fY;
        this.qp = ue0Var.qp;
        this.k2 = ue0Var.k2;
        this.zh = ue0Var.zh;
    }
}
