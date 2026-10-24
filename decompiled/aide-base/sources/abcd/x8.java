package abcd;

import com.aide.common.NonOverwritingFileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

@cy(clazz = 923036074386573539L, container = 923036074386573539L, user = true)
/* loaded from: classes.dex */
public class x8 {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(x8.class);
    }

    @ey(method = 970294778747237920L)
    public x8() {
        try {
            if (j6) {
                iy.gn(-4224916339600595499L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4224916339600595499L, null);
            }
            throw th;
        }
    }

    @ey(method = 3222301651637280849L)
    public static String DW(String str) {
        try {
            if (j6) {
                iy.tp(1517005023151267440L, null, str);
            }
            return str + "/raw/wearable_app.apk";
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1517005023151267440L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 966582391377794139L)
    public static boolean j6(String str, String str2, String str3, String str4) {
        try {
            if (j6) {
                iy.J0(-437176524350347264L, null, str, str2, str3, str4);
            }
            String str5 = (((("<wearableApp package=\"" + str2 + "\">\n") + "\t<versionCode>" + str3 + "</versionCode>\n") + "\t<versionName>" + str4 + "</versionName>\n") + "\t<rawPathResId>wearable_app</rawPathResId>\n") + "</wearableApp>";
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new NonOverwritingFileOutputStream(str + "/xml/wearable_app_desc.xml"));
                outputStreamWriter.write(str5);
                outputStreamWriter.close();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, -437176524350347264L, null, str, str2, str3, str4);
            }
            throw th;
        }
    }
}
