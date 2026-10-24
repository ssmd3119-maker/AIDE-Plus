package abcd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class hd0 {
    private final File DW;
    private long FH;
    private Map<String, b> Hw = Collections.emptyMap();
    private final File j6;

    class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("user.name");
        }
    }

    public static class b {
        String DW;
        int FH;
        File Hw;
        Boolean VH;
        String Zo;
        String gn;
        boolean j6;
        String v5;

        public String DW() {
            return this.DW;
        }

        public File FH() {
            return this.Hw;
        }

        public int Hw() {
            return this.FH;
        }

        public String VH() {
            return this.v5;
        }

        public String Zo() {
            return this.gn;
        }

        public boolean gn() {
            Boolean bool = this.VH;
            return bool != null && bool.booleanValue();
        }

        public void j6(b bVar) {
            if (this.DW == null) {
                this.DW = bVar.DW;
            }
            if (this.FH == 0) {
                this.FH = bVar.FH;
            }
            if (this.Hw == null) {
                this.Hw = bVar.Hw;
            }
            if (this.v5 == null) {
                this.v5 = bVar.v5;
            }
            if (this.Zo == null) {
                this.Zo = bVar.Zo;
            }
            if (this.VH == null) {
                this.VH = bVar.VH;
            }
            if (this.gn == null) {
                this.gn = bVar.gn;
            }
        }

        public String v5() {
            return this.Zo;
        }
    }

    public hd0(File file, File file2) {
        this.j6 = file;
        this.DW = file2;
    }

    public static hd0 DW(wf0 wf0Var) {
        File fileJ8 = wf0Var.J8();
        if (fileJ8 == null) {
            fileJ8 = new File(".").getAbsoluteFile();
        }
        hd0 hd0Var = new hd0(fileJ8, new File(new File(fileJ8, ".ssh"), "config"));
        hd0Var.gn();
        return hd0Var;
    }

    private static Boolean EQ(String str) {
        return ng0.j6("yes", str) ? Boolean.TRUE : Boolean.FALSE;
    }

    private static boolean FH(String str, String str2) {
        try {
            z50 z50Var = new z50(str, (Character) null);
            z50Var.j6(str2);
            return z50Var.VH();
        } catch (m40 unused) {
            return false;
        }
    }

    private static boolean Hw(String str) {
        return str.indexOf(42) >= 0 || str.indexOf(63) >= 0;
    }

    private Map<String, b> VH(InputStream inputStream) throws IOException, NumberFormatException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<b> arrayList = new ArrayList(4);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return linkedHashMap;
            }
            String strTrim = line.trim();
            if (strTrim.length() != 0 && !strTrim.startsWith("#")) {
                String[] strArrSplit = strTrim.split("[ \t]*[= \t]", 2);
                String strTrim2 = strArrSplit[0].trim();
                String strTrim3 = strArrSplit[1].trim();
                if (ng0.j6("Host", strTrim2)) {
                    arrayList.clear();
                    for (String str : strTrim3.split("[ \t]")) {
                        String strJ6 = j6(str);
                        b bVar = (b) linkedHashMap.get(strJ6);
                        if (bVar == null) {
                            bVar = new b();
                            linkedHashMap.put(strJ6, bVar);
                        }
                        arrayList.add(bVar);
                    }
                } else if (!arrayList.isEmpty()) {
                    if (ng0.j6("HostName", strTrim2)) {
                        for (b bVar2 : arrayList) {
                            if (bVar2.DW == null) {
                                bVar2.DW = j6(strTrim3);
                            }
                        }
                    } else if (ng0.j6("User", strTrim2)) {
                        for (b bVar3 : arrayList) {
                            if (bVar3.v5 == null) {
                                bVar3.v5 = j6(strTrim3);
                            }
                        }
                    } else if (ng0.j6("Port", strTrim2)) {
                        try {
                            int i = Integer.parseInt(j6(strTrim3));
                            for (b bVar4 : arrayList) {
                                if (bVar4.FH == 0) {
                                    bVar4.FH = i;
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if (ng0.j6("IdentityFile", strTrim2)) {
                        for (b bVar5 : arrayList) {
                            if (bVar5.Hw == null) {
                                bVar5.Hw = u7(j6(strTrim3));
                            }
                        }
                    } else if (ng0.j6("PreferredAuthentications", strTrim2)) {
                        for (b bVar6 : arrayList) {
                            if (bVar6.Zo == null) {
                                bVar6.Zo = Zo(j6(strTrim3));
                            }
                        }
                    } else if (ng0.j6("BatchMode", strTrim2)) {
                        for (b bVar7 : arrayList) {
                            if (bVar7.VH == null) {
                                bVar7.VH = EQ(j6(strTrim3));
                            }
                        }
                    } else if (ng0.j6("StrictHostKeyChecking", strTrim2)) {
                        String strJ62 = j6(strTrim3);
                        for (b bVar8 : arrayList) {
                            if (bVar8.gn == null) {
                                bVar8.gn = strJ62;
                            }
                        }
                    }
                }
            }
        }
    }

    private static String Zo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isSpaceChar(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    private synchronized Map<String, b> gn() {
        long jLastModified = this.DW.lastModified();
        if (jLastModified != this.FH) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.DW);
                try {
                    this.Hw = VH(fileInputStream);
                    fileInputStream.close();
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                this.Hw = Collections.emptyMap();
            } catch (IOException unused2) {
                this.Hw = Collections.emptyMap();
            }
            this.FH = jLastModified;
        }
        return this.Hw;
    }

    private static String j6(String str) {
        return (str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static String tp() {
        return (String) AccessController.doPrivileged(new a());
    }

    private File u7(String str) {
        if (str.startsWith("~/")) {
            return new File(this.j6, str.substring(2));
        }
        File file = new File(str);
        return file.isAbsolute() ? file : new File(this.j6, str);
    }

    public b v5(String str) {
        Map<String, b> mapGn = gn();
        b bVar = mapGn.get(str);
        if (bVar == null) {
            bVar = new b();
        }
        if (bVar.j6) {
            return bVar;
        }
        for (Map.Entry<String, b> entry : mapGn.entrySet()) {
            if (Hw(entry.getKey()) && FH(entry.getKey(), str)) {
                bVar.j6(entry.getValue());
            }
        }
        if (bVar.DW == null) {
            bVar.DW = str;
        }
        if (bVar.v5 == null) {
            bVar.v5 = tp();
        }
        if (bVar.FH == 0) {
            bVar.FH = 22;
        }
        bVar.j6 = true;
        return bVar;
    }
}
