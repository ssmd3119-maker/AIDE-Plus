package org.codehaus.groovy.control;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.codehaus.groovy.control.customizers.CompilationCustomizer;
import org.codehaus.groovy.control.io.NullWriter;

/* loaded from: classes.dex */
public class CompilerConfiguration {
    private static final String[] VH = {"1.4", "1.5", "1.6", "1.7", "1.8"};
    public static final CompilerConfiguration gn;
    private File DW;
    private LinkedList<String> FH;
    private boolean Hw;
    private List<CompilationCustomizer> Zo;
    private PrintWriter j6;
    private Map<String, Boolean> v5;

    static {
        v5();
        gn = new CompilerConfiguration();
    }

    public CompilerConfiguration() {
        String property;
        String property2;
        new LinkedHashSet();
        this.Zo = new LinkedList();
        Mr(1);
        String property3 = null;
        EQ(null);
        QX(null);
        Zo("");
        boolean z = false;
        j3(false);
        VH(false);
        aM(10);
        J0(null);
        we(false);
        u7(100);
        try {
            property = System.getProperty("groovy.target.bytecode", null);
        } catch (Exception unused) {
            property = null;
        }
        if (property != null) {
            Ws(property);
        } else {
            Ws(v5());
        }
        try {
            property2 = System.getProperty("groovy.default.scriptExtension");
        } catch (Exception unused2) {
            property2 = null;
        }
        if (property2 != null) {
            gn(property2);
        } else {
            gn(".groovy");
        }
        try {
            property3 = System.getProperty("file.encoding", "US-ASCII");
        } catch (Exception unused3) {
        }
        try {
            property3 = System.getProperty("groovy.source.encoding", property3);
        } catch (Exception unused4) {
        }
        J8(property3);
        try {
            EQ(new PrintWriter(System.err));
        } catch (Exception unused5) {
        }
        try {
            String property4 = System.getProperty("groovy.target.directory");
            if (property4 != null) {
                XL(property4);
            }
        } catch (Exception unused6) {
        }
        try {
            z = Boolean.getBoolean("groovy.target.indy");
        } catch (Exception unused7) {
        }
        boolean z2 = (gn == null || !Boolean.TRUE.equals(gn.FH().get("indy"))) ? z : true;
        HashMap map = new HashMap(3);
        if (z2) {
            map.put("indy", Boolean.TRUE);
        }
        tp(map);
    }

    private static String v5() throws ClassNotFoundException {
        try {
            Class.forName("java.lang.annotation.Annotation");
            return "1.5";
        } catch (Exception unused) {
            return "1.4";
        }
    }

    public boolean DW() {
        return this.Hw;
    }

    public void EQ(PrintWriter printWriter) {
        if (printWriter == null) {
            new PrintWriter(NullWriter.WB);
        } else {
            this.j6 = printWriter;
        }
    }

    public Map<String, Boolean> FH() {
        return this.v5;
    }

    public File Hw() {
        return this.DW;
    }

    public void J0(String str) {
    }

    public void J8(String str) {
    }

    public void Mr(int i) {
        if (i >= 0) {
        }
    }

    public void QX(File file) {
        this.DW = file;
    }

    public void VH(boolean z) {
        this.Hw = z;
    }

    public void Ws(String str) {
        for (String str2 : VH) {
            str2.equals(str);
        }
    }

    public void XL(String str) {
        if (str == null || str.length() <= 0) {
            this.DW = null;
        } else {
            this.DW = new File(str);
        }
    }

    public void Zo(String str) {
        this.FH = new LinkedList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(str, File.pathSeparator);
        while (stringTokenizer.hasMoreTokens()) {
            this.FH.add(stringTokenizer.nextToken());
        }
    }

    public void aM(int i) {
    }

    public void gn(String str) {
    }

    public void j3(boolean z) {
    }

    public List<CompilationCustomizer> j6() {
        return this.Zo;
    }

    public void tp(Map<String, Boolean> map) {
        if (map == null) {
            throw new IllegalArgumentException("provided option map must not be null");
        }
        this.v5 = map;
    }

    public void u7(int i) {
        Math.max(0, i);
    }

    public void we(boolean z) {
    }
}
