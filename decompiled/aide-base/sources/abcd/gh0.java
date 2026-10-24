package abcd;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class gh0 {
    private ih0 j6 = new ih0(null);
    private jh0 DW = null;
    private int FH = 0;

    private Map DW(fh0 fh0Var) {
        Map mapJ6;
        return (fh0Var == null || (mapJ6 = fh0Var.j6()) == null) ? new dh0() : mapJ6;
    }

    private void Hw() throws hh0, NumberFormatException, IOException {
        jh0 jh0VarHw = this.j6.Hw();
        this.DW = jh0VarHw;
        if (jh0VarHw == null) {
            this.DW = new jh0(-1, null);
        }
    }

    private List j6(fh0 fh0Var) {
        List listDW;
        return (fh0Var == null || (listDW = fh0Var.DW()) == null) ? new bh0() : listDW;
    }

    private int u7(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }

    public void EQ(Reader reader) {
        this.j6.v5(reader);
        tp();
    }

    public int FH() {
        return this.j6.j6();
    }

    public Object VH(String str) {
        return gn(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[Catch: IOException -> 0x01d3, TryCatch #0 {IOException -> 0x01d3, blocks: (B:3:0x000d, B:65:0x01a3, B:67:0x01a7, B:72:0x01bb, B:73:0x01c6, B:13:0x0026, B:19:0x0033, B:20:0x0037, B:21:0x0059, B:22:0x005e, B:23:0x0081, B:24:0x009b, B:25:0x009f, B:32:0x00ae, B:34:0x00b4, B:35:0x00bf, B:36:0x00c3, B:37:0x00e1, B:38:0x00ff, B:39:0x010e, B:44:0x011a, B:46:0x0120, B:47:0x012c, B:49:0x0134, B:50:0x014a, B:52:0x0150, B:54:0x0155, B:55:0x0160, B:56:0x0161, B:61:0x016d, B:62:0x017d, B:63:0x0181, B:64:0x0192, B:74:0x01c7, B:75:0x01d2), top: B:80:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Zo(java.io.Reader r9, abcd.fh0 r10) throws abcd.hh0, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.gh0.Zo(java.io.Reader, abcd.fh0):java.lang.Object");
    }

    public Object gn(String str, fh0 fh0Var) throws hh0 {
        try {
            return Zo(new StringReader(str), fh0Var);
        } catch (IOException e) {
            throw new hh0(-1, 2, e);
        }
    }

    public void tp() {
        this.DW = null;
        this.FH = 0;
    }

    public Object v5(Reader reader) {
        return Zo(reader, null);
    }
}
