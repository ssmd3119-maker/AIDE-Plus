package groovyjarjarantlr;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PrintWriterWithSMAP extends PrintWriter {
    private int WB;
    private boolean fY;
    private Map jw;
    private boolean k2;
    private int mb;
    private boolean qp;
    private boolean zh;

    protected void DW(boolean z) {
        if (this.qp && this.zh) {
            Integer num = new Integer(this.mb);
            Integer num2 = new Integer(this.WB);
            List arrayList = (List) this.jw.get(num);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.jw.put(num, arrayList);
            }
            if (!arrayList.contains(num2)) {
                arrayList.add(num2);
            }
        }
        if (z) {
            this.WB++;
        }
        if (!this.k2) {
            this.mb++;
        }
        this.zh = false;
    }

    public void j6(int i) {
        if ((this.fY && i != 10) || i == 10) {
            DW(true);
        } else if (!Character.isWhitespace((char) i)) {
            this.zh = true;
        }
        this.fY = i == 13;
    }

    @Override // java.io.PrintWriter
    public void println() {
        DW(true);
        super.println();
        this.fY = false;
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            j6(cArr[i4]);
        }
        super.write(cArr, i, i2);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i) {
        j6(i);
        super.write(i);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            j6(str.charAt(i4));
        }
        super.write(str, i, i2);
    }
}
