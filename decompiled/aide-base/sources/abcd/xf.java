package abcd;

import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

@cy(clazz = -308329056398801275L, container = -308329056398801275L, user = true)
/* loaded from: classes.dex */
public class xf {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -212157866923620808L, container = -308329056398801275L, user = true)
    static class a implements wf {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 3495816188321078057L)
        final /* synthetic */ ByteArrayOutputStream DW;

        @dy(field = 2038639121900902400L)
        final /* synthetic */ ByteArrayOutputStream FH;

        @dy(field = 205140229873227555L)
        final /* synthetic */ vf j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1520913524168309167L)
        public a(vf vfVar, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.j6 = vfVar;
            this.DW = byteArrayOutputStream;
            this.FH = byteArrayOutputStream2;
        }

        @Override // abcd.wf
        @ey(method = 246923349937611165L)
        public int DW() {
            try {
                if (Hw) {
                    iy.gn(1794138113038964256L, this);
                }
                return this.j6.J0();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 1794138113038964256L, this);
                }
                throw th;
            }
        }

        @Override // abcd.wf
        @ey(method = 2100054865063494939L)
        public byte[] j6() {
            try {
                if (Hw) {
                    iy.gn(-4386298280030347744L, this);
                }
                return this.DW.toByteArray();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -4386298280030347744L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(xf.class);
    }

    @ey(method = -627602434637585660L)
    public xf() {
        try {
            if (j6) {
                iy.gn(4489823954854448053L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 4489823954854448053L, null);
            }
            throw th;
        }
    }

    @ey(method = -7470778747950615045L)
    public static wf j6(List<String> list, String str, Map<String, String> map, boolean z, OutputStream outputStream, byte[] bArr) {
        try {
            if (j6) {
                iy.QX(4958579833176135095L, null, new Object[]{list, str, map, new Boolean(z), outputStream, bArr});
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            vf vfVar = new vf(strArr, map, str, z);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            vfVar.QX(new uf(byteArrayOutputStream, outputStream));
            vfVar.Ws(new uf(byteArrayOutputStream2, outputStream));
            OutputStream outputStreamXL = vfVar.XL();
            if (outputStreamXL != null) {
                if (bArr != null && bArr.length != 0) {
                    try {
                        outputStreamXL.write(bArr);
                    } catch (InterruptedIOException unused) {
                    }
                    outputStreamXL.flush();
                }
                outputStreamXL.close();
            }
            try {
                vfVar.aM();
                return new a(vfVar, byteArrayOutputStream, byteArrayOutputStream2);
            } catch (InterruptedException e) {
                vfVar.J8();
                throw e;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.rN(th, 4958579833176135095L, null, new Object[]{list, str, map, new Boolean(z), outputStream, bArr});
            }
            throw th;
        }
    }
}
