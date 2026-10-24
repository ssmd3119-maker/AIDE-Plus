package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.aide.common.StreamUtilities;
import com.aide.uidesigner.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = -2341159662179110476L, container = -2341159662179110476L, user = true)
/* loaded from: classes.dex */
public class j {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -2313419217899783721L)
    private Context DW;

    @dy(field = 272427746456845840L)
    private Map<Integer, SortedMap<String, Map<String, String>>> FH;

    @dy(field = -3889294460707513160L)
    private Map<Integer, Map<String, String>> Hw;

    @dy(field = 71648584948631592L)
    private File j6;

    @dy(field = -1662954438517709584L)
    private Map<Integer, Map<String, String>> v5;

    static {
        iy.Zo(j.class);
    }

    @ey(method = 11951520940392180L)
    public j(Context context, String str) {
        try {
            File file = null;
            if (Zo) {
                iy.EQ(4773085457347827576L, null, context, str);
            }
            this.DW = context;
            if (str != null) {
                file = new File(str);
            }
            this.j6 = file;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 4773085457347827576L, null, context, str);
            }
            throw th;
        }
    }

    @ey(method = -3417635586407792211L)
    private String EQ(String str, Set<String> set) {
        try {
            if (Zo) {
                iy.EQ(3377306536535367352L, this, str, set);
            }
            if (set.contains(str)) {
                return null;
            }
            set.add(str);
            for (int i = Build.VERSION.SDK_INT; i >= 0; i--) {
                String str2 = this.Hw.get(Integer.valueOf(i)).get(str);
                if (str2 != null && str2.length() > 0) {
                    return EQ(str2, set);
                }
            }
            if (str.startsWith("android:")) {
                return "@android:style/" + str.substring(8);
            }
            return "@style/" + str;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3377306536535367352L, this, str, set);
            }
            throw th;
        }
    }

    @ey(method = 2940030531097341120L)
    private String Hw(String str, h.b bVar, Set<String> set) {
        try {
            if (Zo) {
                iy.we(288562152658887735L, this, str, bVar, set);
            }
            if (set.contains(str)) {
                return null;
            }
            set.add(str);
            for (int i = Build.VERSION.SDK_INT; i >= 0; i--) {
                Map<String, String> map = this.FH.get(Integer.valueOf(i)).get(str);
                if (map != null) {
                    String str2 = map.get(bVar.Hw);
                    return str2 != null ? str2 : Hw(this.Hw.get(Integer.valueOf(i)).get(str), bVar, set);
                }
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 288562152658887735L, this, str, bVar, set);
            }
            throw th;
        }
    }

    @ey(method = -1502715607947303653L)
    private Drawable J0(File file) {
        try {
            if (Zo) {
                iy.tp(2415039162400772100L, this, file);
            }
            if (file != null) {
                try {
                    if (file.isFile()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        int i = 1;
                        options.inJustDecodeBounds = true;
                        FileInputStream fileInputStream = new FileInputStream(file);
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                        fileInputStream.close();
                        int i2 = options.outWidth;
                        int i3 = options.outHeight;
                        float f = i2 / i3;
                        while (true) {
                            if (i2 / 2 < 500 && i3 / 2 < 500) {
                                break;
                            }
                            i2 /= 2;
                            i3 /= 2;
                            i *= 2;
                        }
                        if (i3 > 500) {
                        }
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i;
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                        fileInputStream2.close();
                        if (bitmapDecodeStream == null) {
                            return null;
                        }
                        return new BitmapDrawable(this.DW.getResources(), bitmapDecodeStream);
                    }
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2415039162400772100L, this, file);
            }
            throw th;
        }
    }

    @ey(method = 4886328763528574124L)
    private Drawable J8(File file) {
        try {
            if (Zo) {
                iy.tp(2147445038147466575L, this, file);
            }
            if (file != null) {
                try {
                    if (file.isFile()) {
                        return NinePatchDrawable.createFromStream(new FileInputStream(file), null);
                    }
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2147445038147466575L, this, file);
            }
            throw th;
        }
    }

    @ey(method = -1950695247865460151L)
    private void QX(Document document, int i) {
        try {
            if (Zo) {
                iy.EQ(-2103476170765493804L, this, document, new Integer(i));
            }
            NodeList elementsByTagName = document.getElementsByTagName("style");
            for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                Node nodeItem = elementsByTagName.item(i2);
                Node namedItem = nodeItem.getAttributes().getNamedItem(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (namedItem instanceof Attr) {
                    String value = ((Attr) namedItem).getValue();
                    String value2 = "";
                    if (value.contains(".")) {
                        value2 = value.substring(0, value.lastIndexOf(46));
                    } else {
                        Node namedItem2 = nodeItem.getAttributes().getNamedItem("parent");
                        if (namedItem2 instanceof Attr) {
                            value2 = ((Attr) namedItem2).getValue();
                        }
                    }
                    this.Hw.get(Integer.valueOf(i)).put(value, value2);
                    HashMap map = new HashMap();
                    this.FH.get(Integer.valueOf(i)).put(value, map);
                    NodeList childNodes = nodeItem.getChildNodes();
                    for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                        Node nodeItem2 = childNodes.item(i3);
                        if (nodeItem2.getNodeName().equals("item")) {
                            Node namedItem3 = nodeItem2.getAttributes().getNamedItem(AppMeasurementSdk.ConditionalUserProperty.NAME);
                            if (namedItem3 instanceof Attr) {
                                map.put(((Attr) namedItem3).getValue(), nodeItem2.getTextContent());
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -2103476170765493804L, this, document, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 538982813216511408L)
    private String VH(String str) {
        try {
            if (Zo) {
                iy.tp(-331129711600998867L, this, str);
            }
            if (str != null && str.startsWith("@")) {
                for (int i = Build.VERSION.SDK_INT; i >= 0; i--) {
                    String str2 = this.v5.get(Integer.valueOf(i)).get(str);
                    if (str2 != null) {
                        return str2;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -331129711600998867L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1798642545906150400L)
    private void Ws(int i, File file) {
        try {
            if (Zo) {
                iy.EQ(-5079277408722106139L, this, new Integer(i), file);
            }
            try {
                for (File file2 : file.listFiles()) {
                    if (file2.getName().toLowerCase().endsWith(".xml")) {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream);
                        fileInputStream.close();
                        QX(document, i);
                        XL(document, i, "string");
                        XL(document, i, "color");
                        XL(document, i, "dimen");
                        XL(document, i, "bool");
                        XL(document, i, "integer");
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -5079277408722106139L, this, new Integer(i), file);
            }
            throw th;
        }
    }

    @ey(method = -1331072957459363333L)
    private void XL(Document document, int i, String str) {
        try {
            if (Zo) {
                iy.we(-2627607510775105464L, this, document, new Integer(i), str);
            }
            NodeList elementsByTagName = document.getElementsByTagName(str);
            for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                Node nodeItem = elementsByTagName.item(i2);
                Node namedItem = nodeItem.getAttributes().getNamedItem(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (namedItem instanceof Attr) {
                    String value = ((Attr) namedItem).getValue();
                    String textContent = nodeItem.getTextContent();
                    this.v5.get(Integer.valueOf(i)).put("@" + str + "/" + value, textContent);
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -2627607510775105464L, this, document, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -1231753995400535600L)
    private String v5(String str) {
        try {
            if (Zo) {
                iy.tp(-980958430477487L, this, str);
            }
            String strSubstring = null;
            if (str != null && str.startsWith("?attr/")) {
                strSubstring = str.substring(6);
            } else if (str != null && str.startsWith("?")) {
                strSubstring = str.substring(1);
            }
            if (strSubstring != null) {
                for (int i = Build.VERSION.SDK_INT; i >= 0; i--) {
                    for (Map<String, String> map : this.FH.get(Integer.valueOf(i)).values()) {
                        if (map.containsKey(strSubstring)) {
                            return map.get(strSubstring);
                        }
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -980958430477487L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1346814380227330365L)
    private String we() {
        try {
            if (Zo) {
                iy.gn(3531206633130907192L, this);
            }
            int i = this.DW.getResources().getDisplayMetrics().densityDpi;
            return i != 120 ? i != 160 ? i != 240 ? i != 320 ? "" : "xhdpi" : "hdpi" : "mdpi" : "ldpi";
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 3531206633130907192L, this);
            }
            throw th;
        }
    }

    @ey(method = 3444449331447529272L)
    public String DW(String str) {
        try {
            if (Zo) {
                iy.tp(-53679099470038239L, this, str);
            }
            return VH(v5(str));
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -53679099470038239L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3310811023604775000L)
    public String FH(String str, h.b bVar) {
        try {
            if (Zo) {
                iy.EQ(2339235564565318731L, this, str, bVar);
            }
            if (str.startsWith("@style/")) {
                return Hw(str.substring(7), bVar, new HashSet());
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 2339235564565318731L, this, str, bVar);
            }
            throw th;
        }
    }

    @ey(method = -6844170534098288665L)
    public Drawable Zo(String str) {
        String strSubstring = str;
        try {
            if (Zo) {
                iy.tp(2580745687899587392L, this, strSubstring);
            }
            if (this.j6 == null || strSubstring == null || !strSubstring.startsWith("@drawable/")) {
                return null;
            }
            strSubstring = strSubstring.substring(10);
            Drawable drawableJ0 = J0(new File(new File(this.j6, "drawable-" + we()), strSubstring + ".png"));
            if (drawableJ0 != null) {
                return drawableJ0;
            }
            Drawable drawableJ02 = J0(new File(new File(this.j6, "drawable-" + we()), strSubstring + ".jpg"));
            if (drawableJ02 != null) {
                return drawableJ02;
            }
            Drawable drawableJ8 = J8(new File(new File(this.j6, "drawable-" + we()), strSubstring + ".9.png"));
            if (drawableJ8 != null) {
                return drawableJ8;
            }
            Drawable drawableJ03 = J0(new File(new File(this.j6, "drawable"), strSubstring + ".png"));
            if (drawableJ03 != null) {
                return drawableJ03;
            }
            Drawable drawableJ04 = J0(new File(new File(this.j6, "drawable"), strSubstring + ".jpg"));
            if (drawableJ04 != null) {
                return drawableJ04;
            }
            Drawable drawableJ82 = J8(new File(new File(this.j6, "drawable"), strSubstring + ".9.png"));
            if (drawableJ82 != null) {
                return drawableJ82;
            }
            int i = 5;
            String[] strArr = {"xxhpdi", "xhdpi", "hdpi", "mdpi", "ldpi"};
            int i2 = 0;
            while (i2 < i) {
                String str2 = strArr[i2];
                String[] strArr2 = strArr;
                Drawable drawableJ05 = J0(new File(new File(this.j6, "drawable-" + str2), strSubstring + ".png"));
                if (drawableJ05 != null) {
                    return drawableJ05;
                }
                i2++;
                strArr = strArr2;
                i = 5;
            }
            String[] strArr3 = new String[i];
            strArr3[0] = "xxhpdi";
            strArr3[1] = "xhdpi";
            strArr3[2] = "hdpi";
            strArr3[3] = "mdpi";
            strArr3[4] = "ldpi";
            for (int i3 = 0; i3 < 5; i3++) {
                String str3 = strArr3[i3];
                Drawable drawableJ06 = J0(new File(new File(this.j6, "drawable-" + str3), strSubstring + ".jpg"));
                if (drawableJ06 != null) {
                    return drawableJ06;
                }
            }
            String[] strArr4 = {"xxhpdi", "xhdpi", "hdpi", "mdpi", "ldpi"};
            for (int i4 = 0; i4 < 5; i4++) {
                String str4 = strArr4[i4];
                Drawable drawableJ83 = J8(new File(new File(this.j6, "drawable-" + str4), strSubstring + ".9.png"));
                if (drawableJ83 != null) {
                    return drawableJ83;
                }
            }
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2580745687899587392L, this, strSubstring);
            }
            throw th;
        }
    }

    @ey(method = 1985338321854493188L)
    public void aM() {
        try {
            if (Zo) {
                iy.gn(-1974903361536095415L, this);
            }
            this.v5 = new HashMap();
            this.FH = new HashMap();
            this.Hw = new HashMap();
            for (int i = 0; i < 30; i++) {
                this.FH.put(Integer.valueOf(i), new TreeMap());
                this.Hw.put(Integer.valueOf(i), new HashMap());
                this.v5.put(Integer.valueOf(i), new HashMap());
            }
            if (this.j6 != null) {
                Ws(0, new File(this.j6, "values"));
                for (int i2 = 1; i2 < 30; i2++) {
                    Ws(i2, new File(this.j6, "values-v" + i2));
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1974903361536095415L, this);
            }
            throw th;
        }
    }

    @ey(method = 1970171860118558400L)
    public List<String> gn() {
        try {
            if (Zo) {
                iy.gn(-5717161722900690025L, this);
            }
            HashSet hashSet = new HashSet();
            if (this.j6 != null) {
                for (File file : this.j6.listFiles()) {
                    if (file.isDirectory() && file.getName().startsWith("drawable")) {
                        for (File file2 : file.listFiles()) {
                            String name = file2.getName();
                            if (name.toLowerCase().endsWith(".png") || name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".xml")) {
                                hashSet.add("@drawable/" + name.substring(0, name.length() - 4));
                            }
                        }
                    }
                }
            }
            return new ArrayList(hashSet);
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -5717161722900690025L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = -174479729066732415L)
    public String j3() {
        long j = -109065846718888472;
        try {
            if (Zo) {
                iy.gn(-109065846718888472L, this);
            }
            for (int i = 1; i < 1000; i++) {
                if (Zo("@drawable/image_" + i) == null) {
                    j = "image_" + i;
                    return j;
                }
            }
            return "image";
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, j, this);
            }
            throw th;
        }
    }

    @ey(method = 5883809418674533577L)
    public void j6(String str, Intent intent) {
        try {
            if (Zo) {
                iy.EQ(844861961774078976L, this, str, intent);
            }
            try {
                File file = new File(this.j6, "drawable");
                file.mkdirs();
                StreamUtilities.Zo(this.DW.getContentResolver().openInputStream(intent.getData()), new FileOutputStream(new File(file, str + ".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 844861961774078976L, this, str, intent);
            }
            throw th;
        }
    }

    @ey(method = 2823040379627957565L)
    public String tp(String str) {
        try {
            if (Zo) {
                iy.tp(-3321948413568660276L, this, str);
            }
            if (str == null) {
                return null;
            }
            return str.startsWith("@style/") ? EQ(str.substring(7), new HashSet()) : str;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3321948413568660276L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -4709822362123886091L)
    public List<String> u7() {
        try {
            if (Zo) {
                iy.gn(-226113434057994372L, this);
            }
            HashSet hashSet = new HashSet();
            Iterator<SortedMap<String, Map<String, String>>> it = this.FH.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().keySet().iterator();
                while (it2.hasNext()) {
                    hashSet.add("@style/" + it2.next());
                }
            }
            return new ArrayList(hashSet);
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -226113434057994372L, this);
            }
            throw th;
        }
    }
}
