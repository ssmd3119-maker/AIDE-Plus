package org.codehaus.groovy.tools.shell;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.fusesource.jansi.AnsiRenderWriter;

/* loaded from: classes.dex */
public class IO {
    public final OutputStream DW;
    public final OutputStream FH;
    public final PrintWriter Hw;
    public final InputStream j6;
    public final PrintWriter v5;

    public static final class Verbosity {
        public static final Verbosity DW = new Verbosity("QUIET");
        public static final Verbosity FH = new Verbosity("INFO");
        public static final Verbosity Hw = new Verbosity("VERBOSE");
        public static final Verbosity v5 = new Verbosity("DEBUG");
        public final String j6;

        private Verbosity(String str) {
            this.j6 = str;
        }

        public static Verbosity j6(String str) {
            if (DW.j6.equalsIgnoreCase(str)) {
                return DW;
            }
            if (FH.j6.equalsIgnoreCase(str)) {
                return FH;
            }
            if (Hw.j6.equalsIgnoreCase(str)) {
                return Hw;
            }
            if (v5.j6.equalsIgnoreCase(str)) {
                return v5;
            }
            throw new IllegalArgumentException("Invalid verbosity name: " + str);
        }

        public String toString() {
            return this.j6;
        }
    }

    public IO(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2) {
        this.j6 = inputStream;
        this.DW = outputStream;
        this.FH = outputStream2;
        new InputStreamReader(inputStream);
        this.Hw = new AnsiRenderWriter(outputStream, true);
        this.v5 = new AnsiRenderWriter(outputStream2, true);
    }

    public IO() {
        this(System.in, System.out, System.err);
    }
}
