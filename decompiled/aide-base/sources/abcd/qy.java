package abcd;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatPrecisionException;
import java.util.List;
import java.util.Map;
import java.util.UnknownFormatConversionException;

/* loaded from: classes.dex */
public class qy {
    private HashMap<CharSequence, String> FH;
    private static final Map<Character, String> Zo = new HashMap();
    private static final Object[] VH = {'.', "dot", ':', "colon", ';', "semicolon", '/', "slash", '&', "and", '|', "or", '!', "exclamation", '?', "question", '%', "percentage", '+', "plus", '-', "minus", '*', "start"};
    private HashMap<CharSequence, String> j6 = new HashMap<>();
    private HashMap<CharSequence, String> DW = new HashMap<>();
    private List<Pair<b, String>> Hw = new ArrayList();
    private Object v5 = new Object();

    class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (qy.this.v5) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                qy.this.Zo();
                b00.j6("String resources", "Loading strings took " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
    }

    private static class b {
        private String DW;
        private boolean FH;
        private String j6;

        private class a {
            private int DW;
            private String FH;
            private String Hw;
            private final String j6;

            public a(b bVar, String str, int i) {
                this.j6 = str;
                this.DW = i;
                if (Zo()) {
                    String strV5 = v5();
                    if (VH() == '$') {
                        j6();
                    } else if (strV5.charAt(0) == '0') {
                        DW(strV5.length());
                    } else {
                        this.Hw = strV5;
                    }
                }
                this.FH = "";
                while (this.Hw == null && ",-(+# 0<".indexOf(VH()) >= 0) {
                    this.FH += j6();
                }
                if (this.Hw == null && Zo()) {
                    this.Hw = v5();
                }
                if (VH() == '.') {
                    j6();
                    if (!Zo()) {
                        throw new IllegalFormatPrecisionException(VH());
                    }
                    v5();
                }
                if (VH() == 't' || VH() == 'T') {
                    String.valueOf(j6());
                }
                String.valueOf(j6());
            }

            private void DW(int i) {
                this.DW -= i;
            }

            private boolean Hw() {
                return this.DW == this.j6.length();
            }

            private char VH() {
                if (Hw()) {
                    throw new UnknownFormatConversionException("End of String");
                }
                return this.j6.charAt(this.DW);
            }

            private boolean Zo() {
                return !Hw() && Character.isDigit(VH());
            }

            private char j6() {
                if (Hw()) {
                    throw new UnknownFormatConversionException("End of String");
                }
                String str = this.j6;
                int i = this.DW;
                this.DW = i + 1;
                return str.charAt(i);
            }

            private String v5() {
                int i = this.DW;
                while (Zo()) {
                    j6();
                }
                return this.j6.substring(i, this.DW);
            }

            public int FH() {
                return this.DW;
            }
        }

        public b(String str) {
            int iFH = 0;
            try {
                int length = str.length();
                while (iFH < length) {
                    int iIndexOf = str.indexOf(37, iFH);
                    if (str.charAt(iFH) != '%') {
                        iIndexOf = iIndexOf == -1 ? length : iIndexOf;
                        String strSubstring = str.substring(iFH, iIndexOf);
                        if (this.j6 == null) {
                            this.j6 = strSubstring;
                        } else {
                            this.DW = strSubstring;
                        }
                        iFH = iIndexOf;
                    } else {
                        a aVar = new a(this, str, iFH + 1);
                        this.FH = true;
                        if (this.j6 == null) {
                            this.j6 = "";
                        } else {
                            this.DW = "";
                        }
                        iFH = aVar.FH();
                    }
                }
            } catch (Throwable unused) {
            }
            if (this.j6 == null) {
                this.j6 = "";
            }
            if (this.DW == null) {
                this.DW = "";
            }
        }

        public boolean DW() {
            return this.FH;
        }

        public boolean FH() {
            return this.j6.length() + this.DW.length() >= 5;
        }

        public boolean Hw(String str) {
            return str.startsWith(this.j6) && str.endsWith(this.DW);
        }

        public String j6() {
            return this.j6 + "…" + this.DW;
        }
    }

    static {
        int i = 0;
        while (true) {
            Object[] objArr = VH;
            if (i >= objArr.length) {
                return;
            }
            Zo.put((Character) objArr[i], (String) objArr[i + 1]);
            i += 2;
        }
    }

    public qy() {
        new Thread(new a()).start();
    }

    private void EQ(Resources resources, int i, List<String> list) throws Resources.NotFoundException {
        XmlResourceParser layout = resources.getLayout(i);
        for (int eventType = layout.getEventType(); eventType != 1; eventType = layout.next()) {
            if (eventType == 2) {
                for (int i2 = 0; i2 < layout.getAttributeCount(); i2++) {
                    if ("text".equals(layout.getAttributeName(i2))) {
                        String attributeValue = layout.getAttributeValue(i2);
                        if (!attributeValue.startsWith("@")) {
                            list.add(attributeValue);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String FH(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -354563693(0xffffffffeaddc993, float:-1.3406226E26)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 618612823(0x24df4857, float:9.683338E-17)
            if (r0 == r1) goto L20
            r1 = 1236929197(0x49ba0aad, float:1524053.6)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "action_bar_up_description"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L34
            r0 = 0
            goto L35
        L20:
            java.lang.String r0 = "floating_toolbar_open_overflow_description"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L2a:
            java.lang.String r0 = "abc_action_menu_overflow_description"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L34
            r0 = 2
            goto L35
        L34:
            r0 = -1
        L35:
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L3c
            if (r0 == r2) goto L3c
            return r5
        L3c:
            java.lang.String r5 = "more"
            return r5
        L3f:
            java.lang.String r5 = "up"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.qy.FH(java.lang.String):java.lang.String");
    }

    private void VH(Resources resources, int i, List<String> list) throws Resources.NotFoundException {
        XmlResourceParser xml = resources.getXml(i);
        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 2) {
                for (int i2 = 0; i2 < xml.getAttributeCount(); i2++) {
                    if ("title".equals(xml.getAttributeName(i2))) {
                        String attributeValue = xml.getAttributeValue(i2);
                        if (!attributeValue.startsWith("@")) {
                            list.add(attributeValue);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void Zo() {
        HashMap<CharSequence, String> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        tp("res.dat.jet", arrayList3, arrayList4, arrayList7, arrayList5, arrayList6, arrayList2);
        Resources resources = iy.DW().getResources();
        for (Integer num : arrayList3) {
            try {
                String strFH = FH(resources.getResourceEntryName(num.intValue()));
                String string = resources.getString(num.intValue());
                b bVar = new b(string);
                if (bVar.DW()) {
                    if (bVar.FH()) {
                        arrayList.add(Pair.create(bVar, strFH));
                    }
                } else if (!map.containsKey(string) || ((String) map.get(string)).length() > strFH.length()) {
                    map.put(string, strFH);
                }
            } catch (Throwable unused) {
            }
        }
        for (Integer num2 : arrayList4) {
            try {
                String resourceEntryName = resources.getResourceEntryName(num2.intValue());
                String[] stringArray = resources.getStringArray(num2.intValue());
                for (int i = 0; i < stringArray.length; i++) {
                    String str = stringArray[i];
                    String str2 = resourceEntryName + ":" + i;
                    if (!map.containsKey(str) || ((String) map.get(str)).length() > str2.length()) {
                        map.put(str, str2);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        for (Integer num3 : arrayList7) {
            try {
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                gn(resources, num3.intValue(), arrayList8, arrayList9);
                for (Pair<String, String> pair : arrayList8) {
                    map.put((CharSequence) pair.second, pair.first);
                }
                for (String str3 : arrayList9) {
                    if (!map.containsKey(str3)) {
                        map.put(str3, we(str3));
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        for (Integer num4 : arrayList5) {
            try {
                ArrayList arrayList10 = new ArrayList();
                VH(resources, num4.intValue(), arrayList10);
                for (String str4 : arrayList10) {
                    if (!map.containsKey(str4)) {
                        map.put(str4, we(str4));
                    }
                }
            } catch (Throwable unused4) {
            }
        }
        for (Integer num5 : arrayList6) {
            try {
                ArrayList arrayList11 = new ArrayList();
                EQ(resources, num5.intValue(), arrayList11);
                for (String str5 : arrayList11) {
                    if (!map.containsKey(str5)) {
                        map.put(str5, we(str5));
                    }
                }
            } catch (Throwable unused5) {
            }
        }
        for (String str6 : arrayList2) {
            if (!map.containsKey(str6)) {
                map.put(str6, we(str6));
            }
        }
        ArrayList arrayList12 = new ArrayList();
        u7("android.R$string", arrayList12);
        u7("com.android.internal.R$string", arrayList12);
        for (Integer num6 : arrayList12) {
            try {
                String strFH2 = FH(resources.getResourceEntryName(num6.intValue()));
                String string2 = resources.getString(num6.intValue());
                b bVar2 = new b(string2);
                if (bVar2.DW()) {
                    if (bVar2.FH()) {
                        arrayList.add(Pair.create(bVar2, strFH2));
                    }
                } else if (!map.containsKey(string2)) {
                    map.put(string2, strFH2);
                }
            } catch (Throwable unused6) {
            }
        }
        this.j6 = map;
        HashMap<CharSequence, String> map2 = new HashMap<>();
        this.FH = map2;
        map2.putAll(this.j6);
        this.FH.putAll(this.DW);
        ArrayList arrayList13 = new ArrayList();
        this.Hw = arrayList13;
        arrayList13.addAll(arrayList);
    }

    private void gn(Resources resources, int i, List<Pair<String, String>> list, List<String> list2) throws Resources.NotFoundException {
        XmlResourceParser xml = resources.getXml(i);
        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 2) {
                String string = null;
                String attributeValue = null;
                String attributeValue2 = null;
                for (int i2 = 0; i2 < xml.getAttributeCount(); i2++) {
                    if ("key".equals(xml.getAttributeName(i2))) {
                        attributeValue = xml.getAttributeValue(i2);
                    } else if ("title".equals(xml.getAttributeName(i2))) {
                        attributeValue2 = xml.getAttributeValue(i2);
                        if (!attributeValue2.startsWith("@")) {
                            list2.add(attributeValue2);
                        }
                    } else {
                        String attributeValue3 = xml.getAttributeValue(i2);
                        if (!attributeValue3.startsWith("@")) {
                            list2.add(attributeValue3);
                        }
                    }
                }
                if (attributeValue != null && attributeValue2 != null) {
                    if (attributeValue2.startsWith("@")) {
                        try {
                            string = resources.getString(Integer.parseInt(attributeValue2.substring(1)));
                        } catch (Throwable unused) {
                        }
                    } else {
                        string = attributeValue2;
                    }
                    list.add(new Pair<>(attributeValue, string));
                }
            }
        }
    }

    private void tp(String str, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<Integer> list5, List<String> list6) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(iy.DW().getClassLoader().getResourceAsStream(str)));
            int i = dataInputStream.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                list.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int i3 = dataInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                list2.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int i5 = dataInputStream.readInt();
            for (int i6 = 0; i6 < i5; i6++) {
                list3.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int i7 = dataInputStream.readInt();
            for (int i8 = 0; i8 < i7; i8++) {
                list4.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int i9 = dataInputStream.readInt();
            for (int i10 = 0; i10 < i9; i10++) {
                list5.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int i11 = dataInputStream.readInt();
            for (int i12 = 0; i12 < i11; i12++) {
                list6.add(dataInputStream.readUTF());
            }
            dataInputStream.close();
        } catch (Throwable unused) {
        }
    }

    private void u7(String str, List<Integer> list) {
        Integer num;
        try {
            for (Field field : Class.forName(str).getDeclaredFields()) {
                try {
                    if ((field.getModifiers() & 8) != 0 && field.getType() == Integer.TYPE && (num = (Integer) field.get(null)) != null) {
                        list.add(num);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public String Hw(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        HashMap<CharSequence, String> map = this.FH;
        if (map == null) {
            b00.j6("String resources", "getAnonymousText() before loading strings");
            synchronized (this.v5) {
                if (this.FH == null) {
                    return null;
                }
                return Hw(charSequence);
            }
        }
        if (map.get(charSequence) != null) {
            return charSequence.toString();
        }
        String string = charSequence.toString();
        for (Pair<b, String> pair : this.Hw) {
            if (((b) pair.first).Hw(string)) {
                return ((b) pair.first).j6();
            }
        }
        return cz.j6(charSequence);
    }

    public void J0(List<String> list) {
        HashMap<CharSequence, String> map = new HashMap<>();
        for (String str : list) {
            if (!map.containsKey(str)) {
                map.put(str, we(str));
            }
        }
        this.DW = map;
        synchronized (this.v5) {
            if (this.FH != null) {
                HashMap<CharSequence, String> map2 = new HashMap<>();
                this.FH = map2;
                map2.putAll(this.j6);
                this.FH.putAll(this.DW);
            }
        }
    }

    public String v5(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            HashMap<CharSequence, String> map = this.FH;
            if (map == null) {
                b00.j6("String resources", "getResourceName() before loading strings");
                synchronized (this.v5) {
                    if (this.FH == null) {
                        return null;
                    }
                    return v5(charSequence);
                }
            }
            String str = map.get(charSequence);
            if (str != null) {
                return str;
            }
            String string = charSequence.toString();
            for (Pair<b, String> pair : this.Hw) {
                if (((b) pair.first).Hw(string)) {
                    return (String) pair.second;
                }
            }
        }
        return null;
    }

    public String we(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) != ' ') {
                stringBuffer.append(' ');
            }
        }
        String strTrim = stringBuffer.toString().trim();
        if (strTrim.length() > 0) {
            return strTrim.replace(' ', '_');
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            String str2 = Zo.get(Character.valueOf(str.charAt(i2)));
            if (str2 != null) {
                stringBuffer2.append(str2);
            }
        }
        return stringBuffer2.length() > 0 ? stringBuffer2.toString() : "chars";
    }
}
