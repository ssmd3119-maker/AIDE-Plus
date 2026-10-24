package abcd;

import java.util.zip.Adler32;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class cz {
    private static final ThreadLocal<Adler32> j6 = new a();
    private static final ThreadLocal<CRC32> DW = new b();

    static class a extends ThreadLocal<Adler32> {
        @Override // java.lang.ThreadLocal
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Adler32 initialValue() {
            return new Adler32();
        }
    }

    static class b extends ThreadLocal<CRC32> {
        @Override // java.lang.ThreadLocal
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public CRC32 initialValue() {
            return new CRC32();
        }
    }

    public static String j6(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String string = charSequence.toString();
        int iCharAt = 0;
        for (int i = 0; i < string.length(); i++) {
            iCharAt = (iCharAt * 31) + string.charAt(i);
        }
        j6.get().reset();
        byte[] bytes = string.getBytes();
        j6.get().update(bytes, 0, bytes.length);
        long value = j6.get().getValue() * ((iCharAt * 31) + 1);
        if (string.length() < 10) {
            DW.get().reset();
            DW.get().update(bytes, 0, bytes.length);
            value = ((value * 31) + 1) * DW.get().getValue();
        }
        return "Text_" + Long.toHexString(value);
    }
}
