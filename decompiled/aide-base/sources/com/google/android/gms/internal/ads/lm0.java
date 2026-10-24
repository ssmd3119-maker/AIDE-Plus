package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.zzhp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class lm0 extends DefaultHandler implements po0<km0> {
    private static final Pattern DW = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern FH = Pattern.compile("CC([1-4])=.*");
    private static final Pattern Hw = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private final XmlPullParserFactory j6;

    public lm0() {
        this(null);
    }

    private static float DW(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = DW.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    private static cn0 EQ(XmlPullParser xmlPullParser, String str, cn0 cn0Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? cn0.DW(attributeValue) : cn0Var;
    }

    private static int FH(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    private static int Hw(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    private static zzhp.zza J0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean zEquals = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95".equals(xmlPullParser.getAttributeValue(null, "schemeIdUri"));
        byte[] bArrJ6 = null;
        UUID uuidDW = null;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (bArrJ6 == null && kp0.DW(xmlPullParser, "cenc:pssh") && xmlPullParser.next() == 4) {
                bArrJ6 = Base64.decode(xmlPullParser.getText(), 0);
                uuidDW = ti0.DW(bArrJ6);
                if (uuidDW == null) {
                    Log.w("MpdParser", "Skipping malformed cenc:pssh data");
                    bArrJ6 = null;
                }
            } else if (bArrJ6 == null && zEquals && kp0.DW(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                bArrJ6 = ti0.j6(ie0.FH, Base64.decode(xmlPullParser.getText(), 0));
                uuidDW = ie0.FH;
            } else if (kp0.DW(xmlPullParser, "widevine:license")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "robustness_level");
                z = attributeValue != null && attributeValue.startsWith("HW");
            }
        } while (!kp0.j6(xmlPullParser, "ContentProtection"));
        if (bArrJ6 != null) {
            return new zzhp.zza(uuidDW, "video/mp4", bArrJ6, z);
        }
        return null;
    }

    private static String J8(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.next();
        return hp0.FH(str, xmlPullParser.getText());
    }

    private static int Mr(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iHw = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(Ws(xmlPullParser, "schemeIdUri", null)) ? Hw(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1) : -1;
        do {
            xmlPullParser.next();
        } while (!kp0.j6(xmlPullParser, "AudioChannelConfiguration"));
        return iHw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06c6 A[Catch: XmlPullParserException -> 0x09de, TryCatch #1 {XmlPullParserException -> 0x09de, blocks: (B:330:0x097b, B:342:0x09a0, B:344:0x09a6, B:346:0x09b4, B:347:0x09bb, B:339:0x0996, B:340:0x099d, B:314:0x08c4, B:316:0x08cc, B:320:0x08fc, B:321:0x0918, B:322:0x0919, B:326:0x0938, B:325:0x0932, B:282:0x07b8, B:284:0x07c0, B:285:0x07ca, B:287:0x07d0, B:289:0x07e5, B:290:0x07ee, B:292:0x07fd, B:296:0x082c, B:293:0x0815, B:295:0x0819, B:297:0x0834, B:298:0x083b, B:299:0x083c, B:147:0x0501, B:149:0x0509, B:152:0x0511, B:154:0x051d, B:156:0x0525, B:196:0x05ac, B:198:0x05b2, B:251:0x06e6, B:253:0x06fd, B:263:0x071e, B:256:0x0707, B:259:0x0711, B:250:0x06df, B:200:0x05c8, B:202:0x05ce, B:203:0x05e3, B:205:0x05e9, B:208:0x05f2, B:210:0x05f8, B:212:0x060c, B:214:0x0610, B:216:0x061e, B:245:0x06b7, B:217:0x0628, B:219:0x0638, B:221:0x0643, B:220:0x063d, B:222:0x0646, B:226:0x0655, B:229:0x0662, B:231:0x0668, B:233:0x0678, B:235:0x067c, B:237:0x068a, B:238:0x0694, B:240:0x06a5, B:242:0x06af, B:241:0x06aa, B:243:0x06b2, B:246:0x06c6, B:159:0x052f, B:162:0x0537, B:165:0x0541, B:167:0x054b, B:169:0x0553, B:172:0x055a, B:173:0x055d, B:176:0x0565, B:178:0x056d, B:181:0x0578, B:184:0x0583, B:187:0x058d, B:190:0x0598, B:192:0x05a0, B:129:0x0495, B:131:0x04a6, B:133:0x04b4, B:134:0x04c3, B:136:0x04cd, B:137:0x04d8, B:139:0x04e2, B:141:0x04e8, B:142:0x04ec, B:144:0x04f2, B:265:0x0741, B:267:0x076d, B:270:0x077d, B:272:0x0783, B:273:0x078c, B:275:0x0794, B:276:0x07a0, B:278:0x07a6, B:279:0x07b0, B:303:0x0883, B:305:0x08a1, B:307:0x08a9, B:309:0x08b0, B:310:0x08b5, B:312:0x08bb, B:349:0x09d5, B:350:0x09dd), top: B:360:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06df A[Catch: XmlPullParserException -> 0x09de, TryCatch #1 {XmlPullParserException -> 0x09de, blocks: (B:330:0x097b, B:342:0x09a0, B:344:0x09a6, B:346:0x09b4, B:347:0x09bb, B:339:0x0996, B:340:0x099d, B:314:0x08c4, B:316:0x08cc, B:320:0x08fc, B:321:0x0918, B:322:0x0919, B:326:0x0938, B:325:0x0932, B:282:0x07b8, B:284:0x07c0, B:285:0x07ca, B:287:0x07d0, B:289:0x07e5, B:290:0x07ee, B:292:0x07fd, B:296:0x082c, B:293:0x0815, B:295:0x0819, B:297:0x0834, B:298:0x083b, B:299:0x083c, B:147:0x0501, B:149:0x0509, B:152:0x0511, B:154:0x051d, B:156:0x0525, B:196:0x05ac, B:198:0x05b2, B:251:0x06e6, B:253:0x06fd, B:263:0x071e, B:256:0x0707, B:259:0x0711, B:250:0x06df, B:200:0x05c8, B:202:0x05ce, B:203:0x05e3, B:205:0x05e9, B:208:0x05f2, B:210:0x05f8, B:212:0x060c, B:214:0x0610, B:216:0x061e, B:245:0x06b7, B:217:0x0628, B:219:0x0638, B:221:0x0643, B:220:0x063d, B:222:0x0646, B:226:0x0655, B:229:0x0662, B:231:0x0668, B:233:0x0678, B:235:0x067c, B:237:0x068a, B:238:0x0694, B:240:0x06a5, B:242:0x06af, B:241:0x06aa, B:243:0x06b2, B:246:0x06c6, B:159:0x052f, B:162:0x0537, B:165:0x0541, B:167:0x054b, B:169:0x0553, B:172:0x055a, B:173:0x055d, B:176:0x0565, B:178:0x056d, B:181:0x0578, B:184:0x0583, B:187:0x058d, B:190:0x0598, B:192:0x05a0, B:129:0x0495, B:131:0x04a6, B:133:0x04b4, B:134:0x04c3, B:136:0x04cd, B:137:0x04d8, B:139:0x04e2, B:141:0x04e8, B:142:0x04ec, B:144:0x04f2, B:265:0x0741, B:267:0x076d, B:270:0x077d, B:272:0x0783, B:273:0x078c, B:275:0x0794, B:276:0x07a0, B:278:0x07a6, B:279:0x07b0, B:303:0x0883, B:305:0x08a1, B:307:0x08a9, B:309:0x08b0, B:310:0x08b5, B:312:0x08bb, B:349:0x09d5, B:350:0x09dd), top: B:360:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06fd A[Catch: XmlPullParserException -> 0x09de, TryCatch #1 {XmlPullParserException -> 0x09de, blocks: (B:330:0x097b, B:342:0x09a0, B:344:0x09a6, B:346:0x09b4, B:347:0x09bb, B:339:0x0996, B:340:0x099d, B:314:0x08c4, B:316:0x08cc, B:320:0x08fc, B:321:0x0918, B:322:0x0919, B:326:0x0938, B:325:0x0932, B:282:0x07b8, B:284:0x07c0, B:285:0x07ca, B:287:0x07d0, B:289:0x07e5, B:290:0x07ee, B:292:0x07fd, B:296:0x082c, B:293:0x0815, B:295:0x0819, B:297:0x0834, B:298:0x083b, B:299:0x083c, B:147:0x0501, B:149:0x0509, B:152:0x0511, B:154:0x051d, B:156:0x0525, B:196:0x05ac, B:198:0x05b2, B:251:0x06e6, B:253:0x06fd, B:263:0x071e, B:256:0x0707, B:259:0x0711, B:250:0x06df, B:200:0x05c8, B:202:0x05ce, B:203:0x05e3, B:205:0x05e9, B:208:0x05f2, B:210:0x05f8, B:212:0x060c, B:214:0x0610, B:216:0x061e, B:245:0x06b7, B:217:0x0628, B:219:0x0638, B:221:0x0643, B:220:0x063d, B:222:0x0646, B:226:0x0655, B:229:0x0662, B:231:0x0668, B:233:0x0678, B:235:0x067c, B:237:0x068a, B:238:0x0694, B:240:0x06a5, B:242:0x06af, B:241:0x06aa, B:243:0x06b2, B:246:0x06c6, B:159:0x052f, B:162:0x0537, B:165:0x0541, B:167:0x054b, B:169:0x0553, B:172:0x055a, B:173:0x055d, B:176:0x0565, B:178:0x056d, B:181:0x0578, B:184:0x0583, B:187:0x058d, B:190:0x0598, B:192:0x05a0, B:129:0x0495, B:131:0x04a6, B:133:0x04b4, B:134:0x04c3, B:136:0x04cd, B:137:0x04d8, B:139:0x04e2, B:141:0x04e8, B:142:0x04ec, B:144:0x04f2, B:265:0x0741, B:267:0x076d, B:270:0x077d, B:272:0x0783, B:273:0x078c, B:275:0x0794, B:276:0x07a0, B:278:0x07a6, B:279:0x07b0, B:303:0x0883, B:305:0x08a1, B:307:0x08a9, B:309:0x08b0, B:310:0x08b5, B:312:0x08bb, B:349:0x09d5, B:350:0x09dd), top: B:360:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0728 A[LOOP:5: B:116:0x0426->B:264:0x0728, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0852 A[LOOP:2: B:64:0x024a->B:300:0x0852, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0942 A[LOOP:1: B:51:0x0182->B:327:0x0942, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x08cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07c0 A[EDGE_INSN: B:367:0x07c0->B:284:0x07c0 BREAK  A[LOOP:2: B:64:0x024a->B:300:0x0852], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0509 A[EDGE_INSN: B:373:0x0509->B:149:0x0509 BREAK  A[LOOP:5: B:116:0x0426->B:264:0x0728], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.po0
    /* renamed from: QX, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.km0 j6(android.net.Uri r99, java.io.InputStream r100) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lm0.j6(android.net.Uri, java.io.InputStream):com.google.android.gms.internal.ads.km0");
    }

    private static boolean U2(String str) {
        return wo0.FH(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    private static pm0 VH(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new pm0(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return new pm0(attributeValue, j, j2);
    }

    private static String Ws(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static List<ym0> XL(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jWe = 0;
        do {
            xmlPullParser.next();
            if (kp0.DW(xmlPullParser, "S")) {
                jWe = we(xmlPullParser, "t", jWe);
                long jWe2 = we(xmlPullParser, "d", -9223372036854775807L);
                int iHw = Hw(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < iHw; i++) {
                    arrayList.add(new ym0(jWe, jWe2));
                    jWe += jWe2;
                }
            }
        } while (!kp0.j6(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    private static nm0 Zo(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strWs = Ws(xmlPullParser, "schemeIdUri", "");
        String strWs2 = Ws(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
        String strWs3 = Ws(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!kp0.j6(xmlPullParser, str));
        return new nm0(strWs, strWs2, strWs3);
    }

    private static int aM(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        ro0.Hw(i == i2);
        return i;
    }

    private final wm0 gn(XmlPullParser xmlPullParser, wm0 wm0Var) throws XmlPullParserException, IOException {
        long jWe = we(xmlPullParser, "timescale", wm0Var != null ? wm0Var.DW : 1L);
        long jWe2 = we(xmlPullParser, "presentationTimeOffset", wm0Var != null ? wm0Var.FH : 0L);
        long jWe3 = we(xmlPullParser, "duration", wm0Var != null ? wm0Var.v5 : -9223372036854775807L);
        int iHw = Hw(xmlPullParser, "startNumber", wm0Var != null ? wm0Var.Hw : 1);
        List arrayList = null;
        pm0 pm0VarJ3 = null;
        List<ym0> listXL = null;
        do {
            xmlPullParser.next();
            if (kp0.DW(xmlPullParser, "Initialization")) {
                pm0VarJ3 = j3(xmlPullParser);
            } else if (kp0.DW(xmlPullParser, "SegmentTimeline")) {
                listXL = XL(xmlPullParser);
            } else if (kp0.DW(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(VH(xmlPullParser, "media", "mediaRange"));
            }
        } while (!kp0.j6(xmlPullParser, "SegmentList"));
        if (wm0Var != null) {
            if (pm0VarJ3 == null) {
                pm0VarJ3 = wm0Var.j6;
            }
            if (listXL == null) {
                listXL = wm0Var.Zo;
            }
            if (arrayList == null) {
                arrayList = wm0Var.VH;
            }
        }
        return new wm0(pm0VarJ3, jWe, jWe2, iHw, jWe3, listXL, arrayList);
    }

    private final pm0 j3(XmlPullParser xmlPullParser) {
        return VH(xmlPullParser, "sourceURL", "range");
    }

    private final zm0 tp(XmlPullParser xmlPullParser, zm0 zm0Var) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jWe = we(xmlPullParser, "timescale", zm0Var != null ? zm0Var.DW : 1L);
        long jWe2 = we(xmlPullParser, "presentationTimeOffset", zm0Var != null ? zm0Var.FH : 0L);
        long j3 = zm0Var != null ? zm0Var.Hw : 0L;
        long j4 = zm0Var != null ? zm0Var.v5 : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j5 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            j2 = j5;
        } else {
            j = j4;
            j2 = j3;
        }
        pm0 pm0VarJ3 = zm0Var != null ? zm0Var.j6 : null;
        do {
            xmlPullParser.next();
            if (kp0.DW(xmlPullParser, "Initialization")) {
                pm0VarJ3 = j3(xmlPullParser);
            }
        } while (!kp0.j6(xmlPullParser, "SegmentBase"));
        return new zm0(pm0VarJ3, jWe, jWe2, j2, j);
    }

    private final xm0 u7(XmlPullParser xmlPullParser, xm0 xm0Var) throws XmlPullParserException, IOException {
        long jWe = we(xmlPullParser, "timescale", xm0Var != null ? xm0Var.DW : 1L);
        long jWe2 = we(xmlPullParser, "presentationTimeOffset", xm0Var != null ? xm0Var.FH : 0L);
        long jWe3 = we(xmlPullParser, "duration", xm0Var != null ? xm0Var.v5 : -9223372036854775807L);
        int iHw = Hw(xmlPullParser, "startNumber", xm0Var != null ? xm0Var.Hw : 1);
        pm0 pm0VarJ3 = null;
        cn0 cn0VarEQ = EQ(xmlPullParser, "media", xm0Var != null ? xm0Var.gn : null);
        cn0 cn0VarEQ2 = EQ(xmlPullParser, "initialization", xm0Var != null ? xm0Var.VH : null);
        List<ym0> listXL = null;
        do {
            xmlPullParser.next();
            if (kp0.DW(xmlPullParser, "Initialization")) {
                pm0VarJ3 = j3(xmlPullParser);
            } else if (kp0.DW(xmlPullParser, "SegmentTimeline")) {
                listXL = XL(xmlPullParser);
            }
        } while (!kp0.j6(xmlPullParser, "SegmentTemplate"));
        if (xm0Var != null) {
            if (pm0VarJ3 == null) {
                pm0VarJ3 = xm0Var.j6;
            }
            if (listXL == null) {
                listXL = xm0Var.Zo;
            }
        }
        return new xm0(pm0VarJ3, jWe, jWe2, iHw, jWe3, listXL, cn0VarEQ2, cn0VarEQ);
    }

    private static long v5(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : ip0.J0(attributeValue);
    }

    private static long we(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    private lm0(String str) {
        try {
            this.j6 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
