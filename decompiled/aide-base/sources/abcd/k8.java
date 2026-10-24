package abcd;

import java.io.Reader;
import java.io.Writer;

@cy(clazz = -928767759730210080L, container = -928767759730210080L, user = true)
/* loaded from: classes.dex */
public class k8 {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(k8.class);
    }

    @ey(method = 507734045696759787L)
    public k8() {
        try {
            if (j6) {
                iy.gn(2143294532172941568L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2143294532172941568L, null);
            }
            throw th;
        }
    }

    @ey(method = 583547214580837360L)
    public static void j6(Reader reader, Writer writer) {
        try {
            if (j6) {
                iy.EQ(-7490126094935077683L, null, reader, writer);
            }
            char[] cArr = new char[4096];
            while (true) {
                try {
                    try {
                        int i = reader.read(cArr);
                        if (i == -1) {
                            return;
                        } else {
                            writer.write(cArr, 0, i);
                        }
                    } finally {
                        reader.close();
                    }
                } finally {
                    writer.close();
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -7490126094935077683L, null, reader, writer);
            }
            throw th;
        }
    }
}
