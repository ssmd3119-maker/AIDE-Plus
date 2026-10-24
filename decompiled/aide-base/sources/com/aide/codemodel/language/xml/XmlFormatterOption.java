package com.aide.codemodel.language.xml;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.FormatOption;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@cy(clazz = -952426915378518400L, container = -952426915378518400L, user = true)
/* loaded from: classes.dex */
public final class XmlFormatterOption implements FormatOption {

    @dy(field = -1135382619490563735L)
    public static final XmlFormatterOption ADJUST_NEWLINES;

    @dy(field = -3644194584065777375L)
    public static final XmlFormatterOption ADJUST_SPACES;

    @fy
    private static /* synthetic */ boolean AL;

    @dy(field = 1575322005674070419L)
    public static final XmlFormatterOption AUTO_INSERT_CLOSING_BRACE_ONTYPE;

    @dy(field = -2054627166257050800L)
    public static final XmlFormatterOption FORMAT_ONPASTE;

    @dy(field = -865135641580699632L)
    public static final XmlFormatterOption INDENT_ONTYPE;

    @gy
    private static /* synthetic */ boolean w9;

    @dy(field = -536469393368348832L)
    private static final /* synthetic */ XmlFormatterOption[] zh;

    @dy(field = -1555401688879314255L)
    private final String WB;

    static {
        try {
            iy.Zo(XmlFormatterOption.class);
            if (AL) {
                iy.gn(2116191561145592000L, null);
            }
            ADJUST_NEWLINES = new XmlFormatterOption("ADJUST_NEWLINES", 0, "General", "Adjust lines on autoformat", "", "");
            ADJUST_SPACES = new XmlFormatterOption("ADJUST_SPACES", 1, "General", "Adjust spaces on autoformat", "", "");
            FORMAT_ONPASTE = new XmlFormatterOption("FORMAT_ONPASTE", 2, "General", "Autoformat pasted code", "", "");
            INDENT_ONTYPE = new XmlFormatterOption("INDENT_ONTYPE", 3, "General", "Adjust indentation while typing", "", "");
            XmlFormatterOption xmlFormatterOption = new XmlFormatterOption("AUTO_INSERT_CLOSING_BRACE_ONTYPE", 4, "General", "Automatically insert closing tag", "", "");
            AUTO_INSERT_CLOSING_BRACE_ONTYPE = xmlFormatterOption;
            zh = new XmlFormatterOption[]{ADJUST_NEWLINES, ADJUST_SPACES, FORMAT_ONPASTE, INDENT_ONTYPE, xmlFormatterOption};
        } catch (Throwable th) {
            if (w9) {
                iy.aM(th, 2116191561145592000L, null);
            }
            throw th;
        }
    }

    @ey(method = 164077573377214160L)
    private XmlFormatterOption(String str, int i, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            if (AL) {
                iy.QX(51127235224603272L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
            }
            try {
                this.WB = str3;
            } catch (Throwable th) {
                th = th;
                if (w9) {
                    iy.rN(th, 51127235224603272L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 1396951746949584069L)
    public static Set<XmlFormatterOption> j6(boolean z) {
        try {
            if (AL) {
                iy.Ws(5759115931838832364L, null, z);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(ADJUST_SPACES);
            hashSet.add(FORMAT_ONPASTE);
            hashSet.add(INDENT_ONTYPE);
            hashSet.add(AUTO_INSERT_CLOSING_BRACE_ONTYPE);
            return hashSet;
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 5759115931838832364L, null, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 141051885937798455L)
    public static XmlFormatterOption valueOf(String str) {
        try {
            if (AL) {
                iy.tp(474250725726121968L, null, str);
            }
            return (XmlFormatterOption) Enum.valueOf(XmlFormatterOption.class, str);
        } catch (Throwable th) {
            if (w9) {
                iy.j3(th, 474250725726121968L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1761851072917570635L)
    public static XmlFormatterOption[] values() {
        try {
            if (AL) {
                iy.gn(-2275621586940712980L, null);
            }
            return (XmlFormatterOption[]) zh.clone();
        } catch (Throwable th) {
            if (w9) {
                iy.aM(th, -2275621586940712980L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.FormatOption
    @ey(method = 755185730606088768L)
    public String getName() {
        try {
            if (AL) {
                iy.gn(-1039440780138745413L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (w9) {
                iy.aM(th, -1039440780138745413L, this);
            }
            throw th;
        }
    }
}
