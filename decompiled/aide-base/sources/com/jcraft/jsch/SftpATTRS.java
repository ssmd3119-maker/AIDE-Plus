package com.jcraft.jsch;

import java.util.Date;

/* loaded from: classes.dex */
public class SftpATTRS {
    long DW;
    int FH;
    int Hw;
    int VH;
    int Zo;
    int v5;
    int j6 = 0;
    String[] gn = null;

    private SftpATTRS() {
    }

    static SftpATTRS DW(Buffer buffer) {
        int iU7;
        SftpATTRS sftpATTRS = new SftpATTRS();
        int iU72 = buffer.u7();
        sftpATTRS.j6 = iU72;
        if ((iU72 & 1) != 0) {
            sftpATTRS.DW = buffer.EQ();
        }
        if ((sftpATTRS.j6 & 2) != 0) {
            sftpATTRS.FH = buffer.u7();
            sftpATTRS.Hw = buffer.u7();
        }
        if ((sftpATTRS.j6 & 4) != 0) {
            sftpATTRS.v5 = buffer.u7();
        }
        if ((sftpATTRS.j6 & 8) != 0) {
            sftpATTRS.Zo = buffer.u7();
        }
        if ((sftpATTRS.j6 & 8) != 0) {
            sftpATTRS.VH = buffer.u7();
        }
        if ((sftpATTRS.j6 & Integer.MIN_VALUE) != 0 && (iU7 = buffer.u7()) > 0) {
            sftpATTRS.gn = new String[iU7 * 2];
            for (int i = 0; i < iU7; i++) {
                int i2 = i * 2;
                sftpATTRS.gn[i2] = Util.DW(buffer.QX());
                sftpATTRS.gn[i2 + 1] = Util.DW(buffer.QX());
            }
        }
        return sftpATTRS;
    }

    private boolean we(int i) {
        return (this.j6 & 4) != 0 && (this.v5 & 61440) == i;
    }

    public boolean EQ() {
        return we(40960);
    }

    public int FH() {
        return this.j6;
    }

    public int Hw() {
        return this.Hw;
    }

    int J0() {
        int length = (this.j6 & 1) != 0 ? 12 : 4;
        if ((this.j6 & 2) != 0) {
            length += 8;
        }
        if ((this.j6 & 4) != 0) {
            length += 4;
        }
        if ((this.j6 & 8) != 0) {
            length += 8;
        }
        if ((this.j6 & Integer.MIN_VALUE) != 0) {
            length += 4;
            int length2 = this.gn.length / 2;
            if (length2 > 0) {
                for (int i = 0; i < length2; i++) {
                    int i2 = i * 2;
                    length = length + 4 + this.gn[i2].length() + 4 + this.gn[i2 + 1].length();
                }
            }
        }
        return length;
    }

    public String VH() {
        StringBuffer stringBuffer = new StringBuffer(10);
        if (tp()) {
            stringBuffer.append('d');
        } else if (EQ()) {
            stringBuffer.append('l');
        } else {
            stringBuffer.append('-');
        }
        if ((this.v5 & 256) != 0) {
            stringBuffer.append('r');
        } else {
            stringBuffer.append('-');
        }
        if ((this.v5 & 128) != 0) {
            stringBuffer.append('w');
        } else {
            stringBuffer.append('-');
        }
        int i = this.v5;
        if ((i & 2048) != 0) {
            stringBuffer.append('s');
        } else if ((i & 64) != 0) {
            stringBuffer.append('x');
        } else {
            stringBuffer.append('-');
        }
        if ((this.v5 & 32) != 0) {
            stringBuffer.append('r');
        } else {
            stringBuffer.append('-');
        }
        if ((this.v5 & 16) != 0) {
            stringBuffer.append('w');
        } else {
            stringBuffer.append('-');
        }
        int i2 = this.v5;
        if ((i2 & 1024) != 0) {
            stringBuffer.append('s');
        } else if ((i2 & 8) != 0) {
            stringBuffer.append('x');
        } else {
            stringBuffer.append('-');
        }
        if ((this.v5 & 4) != 0) {
            stringBuffer.append('r');
        } else {
            stringBuffer.append('-');
        }
        if ((this.v5 & 2) != 0) {
            stringBuffer.append('w');
        } else {
            stringBuffer.append('-');
        }
        if ((this.v5 & 1) != 0) {
            stringBuffer.append('x');
        } else {
            stringBuffer.append('-');
        }
        return stringBuffer.toString();
    }

    public String Zo() {
        return new Date(this.VH * 1000).toString();
    }

    public long gn() {
        return this.DW;
    }

    void j6(Buffer buffer) {
        int length;
        buffer.a8(this.j6);
        if ((this.j6 & 1) != 0) {
            buffer.lg(this.DW);
        }
        if ((this.j6 & 2) != 0) {
            buffer.a8(this.FH);
            buffer.a8(this.Hw);
        }
        if ((this.j6 & 4) != 0) {
            buffer.a8(this.v5);
        }
        if ((this.j6 & 8) != 0) {
            buffer.a8(this.Zo);
        }
        if ((this.j6 & 8) != 0) {
            buffer.a8(this.VH);
        }
        if ((this.j6 & Integer.MIN_VALUE) == 0 || (length = this.gn.length / 2) <= 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            buffer.er(Util.aM(this.gn[i2]));
            buffer.er(Util.aM(this.gn[i2 + 1]));
        }
    }

    public String toString() {
        return String.valueOf(VH()) + " " + u7() + " " + Hw() + " " + gn() + " " + Zo();
    }

    public boolean tp() {
        return we(16384);
    }

    public int u7() {
        return this.FH;
    }

    public int v5() {
        return this.VH;
    }
}
