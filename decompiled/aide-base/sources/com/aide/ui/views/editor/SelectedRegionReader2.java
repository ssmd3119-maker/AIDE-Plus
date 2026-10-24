package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.Reader;

@cy(clazz = 1215171460922875599L, container = 1215171460922875599L, user = true)
/* loaded from: classes.dex */
public class SelectedRegionReader2 extends Reader {

    @gy
    private static /* synthetic */ boolean cT;

    @fy
    private static /* synthetic */ boolean hK;

    @dy(field = 3323455104459596200L)
    private int endColumn;

    @dy(field = 2618435471901938744L)
    private int endLine;

    @dy(field = 290187455210148033L)
    private char indent;

    @dy(field = 5937247321418295515L)
    private int k2;

    @dy(field = 4587903370976954931L)
    private char[] lineSeparatorCharArray;

    @dy(field = -6311479247298608L)
    private int lineSeparatorIndex;

    @dy(field = 412333317917277219L)
    private Model model;

    @dy(field = 1328527460320608825L)
    private int startColumn;

    @dy(field = -1964389678324685183L)
    private int startLine;

    static {
        iy.Zo(SelectedRegionReader2.class);
    }

    @ey(method = -1468295511332350655L)
    SelectedRegionReader2(Model model, int i, int i2, int i3, int i4, boolean z, String str) {
        try {
            if (hK) {
                iy.QX(-51200298011060736L, null, new Object[]{model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), str});
            }
            this.model = model;
            this.startColumn = i;
            this.startLine = i2;
            if (i4 < model.getLineCount()) {
                this.endLine = i4;
                this.endColumn = i3 < model.getColumnCount(i4) ? i3 : model.getColumnCount(this.endLine) - 1;
            } else {
                int lineCount = model.getLineCount() - 1;
                this.endLine = lineCount;
                this.endColumn = model.getColumnCount(lineCount) - 1;
            }
            this.k2 = i2 == this.endLine ? this.endColumn + 1 : model.getColumnCount(i2);
            this.indent = z ? ' ' : '\t';
            this.lineSeparatorIndex = 0;
            this.lineSeparatorCharArray = str.toCharArray();
        } catch (Throwable th) {
            if (cT) {
                iy.rN(th, -51200298011060736L, null, new Object[]{model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), str});
            }
            throw th;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    @ey(method = -2850881407170820185L)
    public void close() {
        try {
            if (hK) {
                iy.gn(2043230389146606560L, this);
            }
        } catch (Throwable th) {
            if (cT) {
                iy.aM(th, 2043230389146606560L, this);
            }
            throw th;
        }
    }

    @Override // java.io.Reader
    @ey(method = -1037753150407565601L)
    public int read() {
        try {
            if (hK) {
                iy.gn(709409337973381296L, this);
            }
            if (this.startColumn < this.k2) {
                Model model = this.model;
                int i = this.startColumn;
                this.startColumn = i + 1;
                char cCharAtColumnLine = model.charAtColumnLine(i, this.startLine);
                return cCharAtColumnLine != '\t' ? cCharAtColumnLine : this.indent;
            }
            if (this.startLine == this.endLine) {
                return -1;
            }
            if (this.lineSeparatorIndex < this.lineSeparatorCharArray.length - 1) {
                char[] cArr = this.lineSeparatorCharArray;
                int i2 = this.lineSeparatorIndex;
                this.lineSeparatorIndex = i2 + 1;
                return cArr[i2];
            }
            this.lineSeparatorIndex = 0;
            this.startColumn = 0;
            int i3 = this.startLine + 1;
            this.startLine = i3;
            this.k2 = i3 == this.endLine ? this.endColumn + 1 : this.model.getColumnCount(i3);
            return this.lineSeparatorCharArray[this.lineSeparatorCharArray.length - 1];
        } catch (Throwable th) {
            if (cT) {
                iy.aM(th, 709409337973381296L, this);
            }
            throw th;
        }
    }

    @Override // java.io.Reader
    @ey(method = -731244846448698805L)
    public int read(char[] cArr, int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (hK) {
                iy.we(3839133521585640380L, this, cArr, new Integer(i), new Integer(i2));
            }
            if (cArr == null) {
                throw new NullPointerException();
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i >= 0) {
                if (i2 + i > cArr.length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = read();
                if (i3 == -1) {
                    return -1;
                }
                int i4 = i + 1;
                try {
                    cArr[i] = (char) i3;
                    int i5 = 1;
                    while (i5 < i2) {
                        int i6 = read();
                        if (i6 == -1) {
                            break;
                        }
                        int i7 = i4 + 1;
                        try {
                            cArr[i4] = (char) i6;
                            i5++;
                            i4 = i7;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i7;
                            if (!cT) {
                                throw th;
                            }
                            iy.U2(th, 3839133521585640380L, this, cArr, new Integer(i), new Integer(i2));
                            throw th;
                        }
                    }
                    return i5;
                } catch (Throwable th3) {
                    th = th3;
                    i = i4;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
