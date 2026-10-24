package org.codehaus.groovy.antlr;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SourceBuffer {
    private StringBuffer DW;
    private final List j6 = new ArrayList();

    public SourceBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        this.DW = stringBuffer;
        this.j6.add(stringBuffer);
    }

    public void DW(int i) {
        if (i != -1) {
            this.DW.append((char) i);
        }
        if (i == 10) {
            StringBuffer stringBuffer = new StringBuffer();
            this.DW = stringBuffer;
            this.j6.add(stringBuffer);
        }
    }

    public String j6(LineColumn lineColumn, LineColumn lineColumn2) {
        int i;
        int i2;
        if (lineColumn == null || lineColumn2 == null || lineColumn.equals(lineColumn2)) {
            return null;
        }
        if (this.j6.size() == 1 && this.DW.length() == 0) {
            return null;
        }
        int iDW = lineColumn.DW();
        int iJ6 = lineColumn.j6();
        int iDW2 = lineColumn2.DW();
        int iJ62 = lineColumn2.j6();
        if (iDW < 1) {
            iDW = 1;
        }
        if (iDW2 < 1) {
            iDW2 = 1;
        }
        if (iJ6 < 1) {
            iJ6 = 1;
        }
        if (iJ62 < 1) {
            iJ62 = 1;
        }
        if (iDW > this.j6.size()) {
            iDW = this.j6.size();
        }
        if (iDW2 > this.j6.size()) {
            iDW2 = this.j6.size();
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = iDW - 1;
        for (int i4 = i3; i4 < iDW2; i4++) {
            String string = ((StringBuffer) this.j6.get(i4)).toString();
            if (iDW == iDW2) {
                if (iJ6 > string.length()) {
                    iJ6 = string.length();
                }
                if (iJ6 < 1) {
                    iJ6 = 1;
                }
                if (iJ62 > string.length()) {
                    iJ62 = string.length() + 1;
                }
                if (iJ62 < 1) {
                    iJ62 = 1;
                }
                string = string.substring(iJ6 - 1, iJ62 - 1);
            } else {
                if (i4 == i3 && iJ6 - 1 < string.length()) {
                    string = string.substring(i2);
                }
                if (i4 == iDW2 - 1 && iJ62 - 1 < string.length()) {
                    string = string.substring(0, i);
                }
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}
