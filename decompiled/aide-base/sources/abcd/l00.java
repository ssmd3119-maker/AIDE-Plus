package abcd;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class l00 {
    static Object DW;
    static Method FH;
    static h00 Hw = i00.j6(l00.class.getName());
    static Method j6;

    static {
        try {
            Class<?> cls = Class.forName("android.util.Base64");
            j6 = cls.getMethod("encode", byte[].class, Integer.TYPE);
            Hw.Zo(cls.getName() + " is available.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            Hw.FH("Failed to initialize use of android.util.Base64", e);
        }
        try {
            Class<?> cls2 = Class.forName("org.bouncycastle.util.encoders.Base64Encoder");
            DW = cls2.newInstance();
            FH = cls2.getMethod("encode", byte[].class, Integer.TYPE, Integer.TYPE, OutputStream.class);
            Hw.Zo(cls2.getName() + " is available.");
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e2) {
            Hw.FH("Failed to initialize use of org.bouncycastle.util.encoders.Base64Encoder", e2);
        }
        if (j6 == null && FH == null) {
            throw new IllegalStateException("No base64 encoder implementation is available.");
        }
    }

    public static String j6(byte[] bArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (j6 != null) {
                return new String((byte[]) j6.invoke(null, bArr, 2));
            }
            if (FH == null) {
                throw new IllegalStateException("No base64 encoder implementation is available.");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FH.invoke(DW, bArr, 0, Integer.valueOf(bArr.length), byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            throw new IllegalStateException(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
