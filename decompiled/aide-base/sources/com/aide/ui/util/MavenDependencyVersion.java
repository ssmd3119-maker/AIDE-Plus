package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.r8;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

@cy(clazz = -105196403812237749L, container = -105196403812237749L, user = true)
/* loaded from: classes.dex */
public class MavenDependencyVersion {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 3073516918283723136L)
    private String j6;

    @dy(field = -685498020374294320L)
    private r8 version;

    static {
        iy.Zo(MavenDependencyVersion.class);
    }

    @ey(method = -2130300548982931347L)
    public MavenDependencyVersion(String str) {
        try {
            if (FH) {
                iy.tp(-3671560543215849263L, null, str);
            }
            Hw(str);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3671560543215849263L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3451992004659523085L)
    private static Integer FH(StringTokenizer stringTokenizer) {
        try {
            if (FH) {
                iy.tp(658817826007753575L, null, stringTokenizer);
            }
            try {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.length() > 1 && strNextToken.startsWith("0")) {
                    throw new NumberFormatException("Number part has a leading 0: '" + strNextToken + "'");
                }
                return Integer.valueOf(strNextToken);
            } catch (NoSuchElementException unused) {
                throw new NumberFormatException("Number is invalid");
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 658817826007753575L, null, stringTokenizer);
            }
            throw th;
        }
    }

    @ey(method = 284967852756171992L)
    public static int compareTo(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(-897592819188923648L, null, str, str2);
            }
            return new MavenDependencyVersion(str).compareTo(new MavenDependencyVersion(str2));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -897592819188923648L, null, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 136551662382180600L)
    public final void Hw(String str) {
        String str2;
        try {
            if (FH) {
                iy.tp(-17947187289656408L, this, str);
            }
            this.version = new r8(str);
            int iIndexOf = str.indexOf("-");
            String strSubstring = null;
            boolean zMatches = false;
            boolean z = true;
            if (iIndexOf < 0) {
                str2 = str;
            } else {
                String strSubstring2 = str.substring(0, iIndexOf);
                strSubstring = str.substring(iIndexOf + 1);
                str2 = strSubstring2;
            }
            if (strSubstring != null) {
                try {
                    if (strSubstring.length() == 1 || !strSubstring.startsWith("0")) {
                        Integer.valueOf(strSubstring);
                    } else {
                        this.j6 = strSubstring;
                    }
                } catch (NumberFormatException unused) {
                    this.j6 = strSubstring;
                }
            }
            if (!str2.contains(".") && !str2.startsWith("0")) {
                try {
                    Integer.valueOf(str2);
                    return;
                } catch (NumberFormatException unused2) {
                    this.j6 = str;
                    return;
                }
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str2, ".");
            try {
                FH(stringTokenizer);
                if (stringTokenizer.hasMoreTokens()) {
                    FH(stringTokenizer);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    FH(stringTokenizer);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.j6 = stringTokenizer.nextToken();
                    zMatches = Pattern.compile("\\d+").matcher(this.j6).matches();
                }
                if (!str2.contains("..") && !str2.startsWith(".")) {
                    if (!str2.endsWith(".")) {
                        z = zMatches;
                    }
                }
            } catch (NumberFormatException unused3) {
            }
            if (z) {
                this.j6 = str;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -17947187289656408L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 13491013136591424L)
    public int compareTo(MavenDependencyVersion mavenDependencyVersion) {
        try {
            if (FH) {
                iy.tp(-275886467630696664L, this, mavenDependencyVersion);
            }
            return mavenDependencyVersion instanceof MavenDependencyVersion ? this.version.compareTo(mavenDependencyVersion.version) : compareTo(new MavenDependencyVersion(mavenDependencyVersion.toString()));
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -275886467630696664L, this, mavenDependencyVersion);
            }
            throw th;
        }
    }

    @ey(method = 3172033143258237279L)
    public boolean equals(Object obj) {
        try {
            if (FH) {
                iy.tp(-52999457031490305L, this, obj);
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof MavenDependencyVersion) {
                return compareTo((MavenDependencyVersion) obj) == 0;
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -52999457031490305L, this, obj);
            }
            throw th;
        }
    }

    @ey(method = -1620849833428621840L)
    public int hashCode() {
        try {
            if (FH) {
                iy.gn(2312263160157605516L, this);
            }
            return this.version.hashCode() + 11;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2312263160157605516L, this);
            }
            throw th;
        }
    }

    @ey(method = -943702706828073547L)
    public String toString() {
        try {
            if (FH) {
                iy.gn(3083817074424880961L, this);
            }
            return this.version.toString();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3083817074424880961L, this);
            }
            throw th;
        }
    }
}
