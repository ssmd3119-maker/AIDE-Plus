package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.Reader;

@cy(clazz = -2860579357306958496L, container = -2860579357306958496L, user = true)
/* loaded from: classes.dex */
public class SelectedRegionReader extends Reader {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = 3529359687829859504L)
    private int endColumn;

    @dy(field = 106621836159123792L)
    private int endLine;

    @dy(field = -2101006542006529287L)
    private char indent;

    @dy(field = 1592903492243448067L)
    private char[] lineSeparatorCharArray;

    @dy(field = -209342069288996800L)
    private int lineSeparatorIndex;

    @dy(field = -33415978249027341L)
    private Model model;

    @dy(field = -1565989522330427247L)
    private int startColumn;

    @dy(field = 523738323999885033L)
    private int startLine;

    static {
        iy.Zo(SelectedRegionReader.class);
    }

    @ey(method = -336306307054872585L)
    SelectedRegionReader(Model model, int i, int i2, int i3, int i4, boolean z, String str) {
        try {
            if (w9) {
                iy.QX(58416528859645440L, null, new Object[]{model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), str});
            }
            this.model = model;
            this.startColumn = i;
            this.startLine = i2;
            this.endLine = i4;
            this.endColumn = i3;
            if (i4 > model.getLineCount() - 1) {
                int lineCount = model.getLineCount() - 1;
                this.endLine = lineCount;
                this.endColumn = model.getColumnCount(lineCount);
            }
            if (this.endColumn > model.getColumnCount(this.endLine)) {
                this.endColumn = model.getColumnCount(this.endLine);
            }
            this.indent = z ? ' ' : '\t';
            this.lineSeparatorIndex = 0;
            this.lineSeparatorCharArray = str.toCharArray();
        } catch (Throwable th) {
            if (hK) {
                iy.rN(th, 58416528859645440L, null, new Object[]{model, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), str});
            }
            throw th;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    @ey(method = -136981706850093275L)
    public void close() {
        try {
            if (w9) {
                iy.gn(-1968969293903434385L, this);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -1968969293903434385L, this);
            }
            throw th;
        }
    }

    @Override // java.io.Reader
    @ey(method = 1854250374981214893L)
    public int read() {
        try {
            if (w9) {
                iy.gn(-213908543651208097L, this);
            }
            synchronized (this.model) {
                int lineCount = this.model.getLineCount();
                if (this.startLine < this.endLine && this.startLine < lineCount) {
                    if (this.startColumn < this.model.getColumnCount(this.startLine)) {
                        Model model = this.model;
                        int i = this.startColumn;
                        this.startColumn = i + 1;
                        char cCharAtColumnLine = model.charAtColumnLine(i, this.startLine);
                        if (cCharAtColumnLine != '\t') {
                            return cCharAtColumnLine;
                        }
                        return this.indent;
                    }
                    if (this.lineSeparatorIndex < this.lineSeparatorCharArray.length - 1) {
                        char[] cArr = this.lineSeparatorCharArray;
                        int i2 = this.lineSeparatorIndex;
                        this.lineSeparatorIndex = i2 + 1;
                        return cArr[i2];
                    }
                    this.lineSeparatorIndex = 0;
                    this.startColumn = 0;
                    this.startLine++;
                    return this.lineSeparatorCharArray[this.lineSeparatorCharArray.length - 1];
                }
                if (this.startLine != this.endLine || this.startLine >= lineCount) {
                    return -1;
                }
                if (this.startColumn > this.endColumn || this.startColumn > this.model.getColumnCount(this.startLine)) {
                    return -1;
                }
                if (this.startColumn < this.model.getColumnCount(this.startLine)) {
                    Model model2 = this.model;
                    int i3 = this.startColumn;
                    this.startColumn = i3 + 1;
                    char cCharAtColumnLine2 = model2.charAtColumnLine(i3, this.startLine);
                    if (cCharAtColumnLine2 != '\t') {
                        return cCharAtColumnLine2;
                    }
                    return this.indent;
                }
                if (this.lineSeparatorIndex < this.lineSeparatorCharArray.length - 1) {
                    char[] cArr2 = this.lineSeparatorCharArray;
                    int i4 = this.lineSeparatorIndex;
                    this.lineSeparatorIndex = i4 + 1;
                    return cArr2[i4];
                }
                this.lineSeparatorIndex = 0;
                this.startColumn = 0;
                this.startLine++;
                return this.lineSeparatorCharArray[this.lineSeparatorCharArray.length - 1];
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -213908543651208097L, this);
            }
            throw th;
        }
    }

    @Override // java.io.Reader
    @ey(method = 434601568616869173L)
    public int read(char[] cArr, int i, int i2) throws Throwable {
        Throwable th;
        try {
            if (w9) {
                iy.we(-22544804121713933L, this, cArr, new Integer(i), new Integer(i2));
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
                            if (!hK) {
                                throw th;
                            }
                            iy.U2(th, -22544804121713933L, this, cArr, new Integer(i), new Integer(i2));
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
