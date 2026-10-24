package org.codehaus.groovy.antlr;

/* loaded from: classes.dex */
public class LineColumn {
    private int DW;
    private int j6;

    public LineColumn(int i, int i2) {
        this.j6 = i;
        this.DW = i2;
    }

    public int DW() {
        return this.j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LineColumn.class != obj.getClass()) {
            return false;
        }
        LineColumn lineColumn = (LineColumn) obj;
        return this.DW == lineColumn.DW && this.j6 == lineColumn.j6;
    }

    public int hashCode() {
        return (this.j6 * 29) + this.DW;
    }

    public int j6() {
        return this.DW;
    }

    public String toString() {
        return "[" + this.j6 + "," + this.DW + "]";
    }
}
