package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class kp0 {
    public static boolean DW(XmlPullParser xmlPullParser, String str) {
        return FH(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean FH(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean j6(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }
}
