package org.codehaus.groovy.antlr;

import groovyjarjarantlr.CharScanner;
import groovyjarjarantlr.Token;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public class UnicodeEscapingReader extends Reader {
    private final Reader WB;
    private int fY;
    private int k2;
    private final SourceBuffer qp;
    private boolean jw = false;
    private int zh = 0;
    private int AL = 0;
    private CharScanner mb = new DummyLexer();

    private static class DummyLexer extends CharScanner {
        private final Token EQ;

        private DummyLexer() {
            this.EQ = new Token();
        }

        @Override // groovyjarjarantlr.CharScanner
        public int Zo() {
            return 0;
        }

        @Override // groovyjarjarantlr.CharScanner
        public int gn() {
            return 0;
        }

        @Override // groovyjarjarantlr.TokenStream
        public Token j6() {
            return this.EQ;
        }
    }

    public UnicodeEscapingReader(Reader reader, SourceBuffer sourceBuffer) {
        this.WB = reader;
        this.qp = sourceBuffer;
    }

    private void Hw(int i) {
        SourceBuffer sourceBuffer = this.qp;
        if (sourceBuffer != null) {
            sourceBuffer.DW(i);
        }
    }

    private void j6(int i) throws IOException {
        if (i < 48 || i > 57) {
            if (i < 97 || i > 102) {
                if (i < 65 || i > 70) {
                    this.jw = true;
                    this.fY = i;
                    throw new IOException("Did not find four digit hex character code. line: " + this.mb.gn() + " col:" + this.mb.Zo());
                }
            }
        }
    }

    public int DW() {
        return this.AL;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.WB.close();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2 && (i4 = read()) != -1) {
            cArr[i + i3] = (char) i4;
            i3++;
        }
        if (i3 == 0 && i4 == -1) {
            return -1;
        }
        return i3;
    }

    public void setLexer(CharScanner charScanner) {
        this.mb = charScanner;
    }

    @Override // java.io.Reader
    public int read() throws IOException, NumberFormatException {
        int i;
        if (this.jw) {
            this.jw = false;
            Hw(this.fY);
            return this.fY;
        }
        if (this.k2 != this.mb.gn()) {
            this.AL = 0;
            this.k2 = this.mb.gn();
        }
        int i2 = this.WB.read();
        if (i2 != 92) {
            Hw(i2);
            return i2;
        }
        int i3 = this.WB.read();
        if (i3 != 117) {
            this.jw = true;
            this.fY = i3;
            Hw(92);
            return 92;
        }
        int i4 = 0;
        do {
            i4++;
            i = this.WB.read();
        } while (i == 117);
        j6(i);
        StringBuilder sb = new StringBuilder();
        sb.append((char) i);
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = this.WB.read();
            j6(i6);
            sb.append((char) i6);
        }
        int i7 = Integer.parseInt(sb.toString(), 16);
        Hw(i7);
        int i8 = i4 + 4;
        this.zh += i8;
        this.AL += i8;
        return i7;
    }
}
