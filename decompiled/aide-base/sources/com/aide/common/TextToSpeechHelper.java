package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

@cy(clazz = -6458429244909686733L, container = -6458429244909686733L, user = true)
/* loaded from: classes.dex */
public class TextToSpeechHelper {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 1701760478262126189L)
    private Map<String, a> DW;

    @dy(field = -3905745841509773325L)
    private Map<String, Map<String, String>> FH;

    @dy(field = 3445112590347992115L)
    private Context j6;

    @cy(clazz = -2944515807282030800L, container = -2944515807282030800L, user = true)
    private class a {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -2189389757736719797L)
        private String DW;

        @dy(field = 1294674476018111349L)
        private boolean FH;

        @dy(field = 1292464115215474256L)
        private Locale Hw;

        @dy(field = -2491048243253801343L)
        @hy
        final /* synthetic */ TextToSpeechHelper Zo;

        @dy(field = -2177816589074634764L)
        private TextToSpeech j6;

        @dy(field = -2483961860133187028L)
        private String v5;

        @cy(clazz = -1266471092915690825L, container = -2944515807282030800L, user = true)
        /* renamed from: com.aide.common.TextToSpeechHelper$a$a, reason: collision with other inner class name */
        class C0047a implements TextToSpeech.OnInitListener {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(C0047a.class);
            }

            @ey(method = 54321018061954500L)
            C0047a(TextToSpeechHelper textToSpeechHelper) {
            }

            @Override // android.speech.tts.TextToSpeech.OnInitListener
            @ey(method = 3267065918542404L)
            public void onInit(int i) {
                try {
                    if (DW) {
                        iy.u7(2033938504490093536L, this, i);
                    }
                    a.this.FH = true;
                    if (a.this.j6 == null) {
                        return;
                    }
                    int iIsLanguageAvailable = a.this.j6.isLanguageAvailable(a.this.Hw);
                    AppLog.DW(a.this.Hw + " TTS available: " + iIsLanguageAvailable);
                    if (iIsLanguageAvailable == -1) {
                        a.this.j6.shutdown();
                        a.this.j6 = null;
                    } else {
                        if (iIsLanguageAvailable == -2) {
                            a.this.j6.shutdown();
                            a.this.j6 = null;
                            return;
                        }
                        a.this.j6.getDefaultEngine();
                        a.this.j6.setLanguage(a.this.Hw);
                        if (a.this.DW != null) {
                            a.this.j6.speak(a.this.DW, 0, null);
                            a.this.DW = null;
                        }
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2033938504490093536L, this, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = -585832545934634169L)
        public a(TextToSpeechHelper textToSpeechHelper, String str) {
            try {
                if (VH) {
                    iy.EQ(-2833393010366731913L, null, textToSpeechHelper, str);
                }
                this.Zo = textToSpeechHelper;
                this.v5 = str;
                Locale[] availableLocales = Locale.getAvailableLocales();
                int length = availableLocales.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Locale locale = availableLocales[i];
                    if (this.v5.equals(locale.getLanguage())) {
                        this.Hw = locale;
                        break;
                    }
                    i++;
                }
                if (this.Hw != null) {
                    this.j6 = new TextToSpeech(textToSpeechHelper.j6, new C0047a(textToSpeechHelper));
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.Mr(th, -2833393010366731913L, null, textToSpeechHelper, str);
                }
                throw th;
            }
        }

        @ey(method = -48786818803620856L)
        private String VH(String str) {
            try {
                if (VH) {
                    iy.tp(1006593349999101991L, this, str);
                }
                String strReplace = str.replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "");
                Map map = (Map) this.Zo.FH.get(this.v5);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        strReplace = strReplace.replace("<b>" + ((String) entry.getKey()) + "</b>", (CharSequence) entry.getValue()).replace(" " + ((String) entry.getKey()) + " ", (CharSequence) entry.getValue());
                    }
                }
                return gn(strReplace.replace("<b>a</b>", "A").replace("<b>b</b>", "B").replace("<b>c</b>", "C").replace("<b>i</b>", "I").replace("<b>j</b>", "J").replace("<b>k</b>", "K").replace("<b>android:", "<b>").replace("<i>", "").replace("</i>", "").replace("</b>", "").replace("<b>", ""));
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 1006593349999101991L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 6076223198010291095L)
        private String gn(String str) {
            try {
                if (VH) {
                    iy.tp(-477199594274528384L, this, str);
                }
                char[] charArray = str.toCharArray();
                for (int i = 1; i < charArray.length - 1; i++) {
                    if (charArray[i] == '_' && Character.isLetterOrDigit(charArray[i - 1]) && Character.isLetterOrDigit(charArray[i + 1])) {
                        charArray[i] = ' ';
                    }
                }
                return new String(charArray);
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, -477199594274528384L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -62816912234531620L)
        public void tp(String str) {
            try {
                if (VH) {
                    iy.tp(831014455215831705L, this, str);
                }
                String strVH = VH(str);
                if (!this.FH || this.j6 == null) {
                    this.DW = strVH;
                } else {
                    this.j6.speak(strVH, 0, null);
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.j3(th, 831014455215831705L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1686615909586863748L)
        public void u7() {
            try {
                if (VH) {
                    iy.gn(84919936272638315L, this);
                }
                if (this.j6 != null) {
                    this.j6.shutdown();
                }
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 84919936272638315L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(TextToSpeechHelper.class);
    }

    @ey(method = -40794393768153120L)
    public TextToSpeechHelper(Context context) {
        String str;
        try {
            if (Hw) {
                str = "++";
                iy.tp(-4211526794694350677L, null, context);
            } else {
                str = "++";
            }
            this.j6 = context;
            this.DW = new HashMap();
            HashMap map = new HashMap();
            this.FH = map;
            map.put("en", new HashMap());
            this.FH.get("en").put("println", "printline");
            this.FH.get("en").put(";", "semicolon");
            this.FH.get("en").put("<", "less than");
            this.FH.get("en").put(">", "greater than");
            this.FH.get("en").put("< =", "less than or equal");
            this.FH.get("en").put("> =", "greater than or equal");
            this.FH.get("en").put("==", "equal equal");
            this.FH.get("en").put("!=", "not equal");
            this.FH.get("en").put("--", "minus minus");
            String str2 = str;
            this.FH.get("en").put(str2, "plus plus");
            this.FH.get("en").put("+", "plus");
            this.FH.get("en").put("-", "minus");
            this.FH.get("en").put("*", "star");
            this.FH.get("en").put("/", "slash");
            this.FH.put("de", new HashMap());
            this.FH.get("de").put("println", "printlein");
            this.FH.get("de").put(";", "Strichpunkt");
            this.FH.get("de").put("<", "kleiner als");
            this.FH.get("de").put(">", "grösser als");
            this.FH.get("de").put("< =", "kleiner gleich");
            this.FH.get("de").put("> =", "grösser gleich");
            this.FH.get("de").put("==", "gleich gleich");
            this.FH.get("de").put("!=", "ungleich");
            this.FH.get("de").put("--", "minus minus");
            this.FH.get("de").put(str2, "plus plus");
            this.FH.get("de").put("+", "plus");
            this.FH.get("de").put("-", "minus");
            this.FH.get("de").put("*", "Stern");
            this.FH.get("de").put("/", "Strich");
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -4211526794694350677L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 578919059618363927L)
    public void FH() {
        try {
            if (Hw) {
                iy.gn(-1831168755087699348L, this);
            }
            Iterator<a> it = this.DW.values().iterator();
            while (it.hasNext()) {
                it.next().u7();
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1831168755087699348L, this);
            }
            throw th;
        }
    }

    @ey(method = -30593342873977637L)
    public void Hw(String str, String str2) {
        try {
            if (Hw) {
                iy.EQ(-1401559566384212928L, this, str, str2);
            }
            if (!this.DW.containsKey(str)) {
                this.DW.put(str, new a(this, str));
            }
            this.DW.get(str).tp(str2);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -1401559566384212928L, this, str, str2);
            }
            throw th;
        }
    }
}
