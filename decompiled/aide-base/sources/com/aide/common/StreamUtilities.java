package com.aide.common;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

@cy(clazz = -711442613965315275L, container = -711442613965315275L, user = true)
/* loaded from: classes.dex */
public class StreamUtilities {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(StreamUtilities.class);
    }

    @ey(method = -1260431024680086105L)
    public StreamUtilities() {
        try {
            if (j6) {
                iy.gn(5202972984187072409L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 5202972984187072409L, null);
            }
            throw th;
        }
    }

    @ey(method = 652881135973706676L)
    public static String DW(InputStream inputStream) {
        try {
            if (j6) {
                iy.tp(370504340859600000L, null, inputStream);
            }
            return FH(new InputStreamReader(inputStream));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 370504340859600000L, null, inputStream);
            }
            throw th;
        }
    }

    @ey(method = 567927980813744445L)
    public static String FH(Reader reader) {
        try {
            if (j6) {
                iy.tp(698705286827615665L, null, reader);
            }
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[8192];
            while (true) {
                int i = bufferedReader.read(cArr, 0, 8192);
                if (i <= 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 698705286827615665L, null, reader);
            }
            throw th;
        }
    }

    @ey(method = 581736564674877491L)
    public static int Hw(InputStream inputStream, byte[] bArr) {
        try {
            if (j6) {
                iy.EQ(-7482175249959446385L, null, inputStream, bArr);
            }
            return v5(inputStream, bArr, 0, bArr.length);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -7482175249959446385L, null, inputStream, bArr);
            }
            throw th;
        }
    }

    @ey(method = -2258287253312940531L)
    public static void VH(InputStream inputStream, OutputStream outputStream, boolean z) {
        try {
            if (j6) {
                iy.we(1437261948199776069L, null, inputStream, outputStream, new Boolean(z));
            }
            byte[] bArr = new byte[4096];
            while (true) {
                try {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            outputStream.write(bArr, 0, i);
                        }
                    } finally {
                        if (z) {
                            inputStream.close();
                        }
                    }
                } finally {
                    if (z) {
                        outputStream.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 1437261948199776069L, null, inputStream, outputStream, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -394509362536118032L)
    public static void Zo(InputStream inputStream, OutputStream outputStream) {
        try {
            if (j6) {
                iy.EQ(6971637334206136032L, null, inputStream, outputStream);
            }
            VH(inputStream, outputStream, true);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 6971637334206136032L, null, inputStream, outputStream);
            }
            throw th;
        }
    }

    @ey(method = 1002080315015687160L)
    public static void gn(Reader reader, Writer writer) {
        try {
            if (j6) {
                iy.EQ(-8207949121622678776L, null, reader, writer);
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
                iy.Mr(th, -8207949121622678776L, null, reader, writer);
            }
            throw th;
        }
    }

    @ey(method = 744192396565322640L)
    public static boolean j6(InputStream inputStream, InputStream inputStream2) {
        try {
            if (j6) {
                iy.EQ(-3912056261930219600L, null, inputStream, inputStream2);
            }
            try {
                byte[] bArr = new byte[8192];
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int iHw = Hw(inputStream, bArr);
                    if (iHw != Hw(inputStream2, bArr2)) {
                        return false;
                    }
                    if (iHw == -1) {
                        return true;
                    }
                    for (int i = 0; i < iHw; i++) {
                        if (bArr[i] != bArr2[i]) {
                            return false;
                        }
                    }
                }
            } finally {
                inputStream.close();
                inputStream2.close();
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3912056261930219600L, null, inputStream, inputStream2);
            }
            throw th;
        }
    }

    @ey(method = 7711453010492327093L)
    public static int v5(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            if (j6) {
                iy.J0(2497325975796263005L, null, inputStream, bArr, new Integer(i), new Integer(i2));
            }
            int i3 = 0;
            while (i3 < i2) {
                int i4 = inputStream.read(bArr, i + i3, i2 - i3);
                if (i4 == -1) {
                    if (i3 > 0) {
                        return i3;
                    }
                    return -1;
                }
                i3 += i4;
            }
            return i3;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, 2497325975796263005L, null, inputStream, bArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
