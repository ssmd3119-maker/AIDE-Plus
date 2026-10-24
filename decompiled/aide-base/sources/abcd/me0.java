package abcd;

import abcd.c70;
import abcd.cf0;
import abcd.k70;
import abcd.se0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class me0 extends dd0 implements df0 {
    static final se0 U2 = new a();
    private final String Mr;
    private final mc0 aM;
    private final String j3;

    class a extends se0 {
        @Override // abcd.se0
        public String Hw() {
            return "Amazon S3";
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return Collections.singleton("amazon-s3");
        }

        @Override // abcd.se0
        public Set<se0.a> Zo() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.USER, se0.a.HOST, se0.a.PATH));
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) {
            return new me0(p70Var, ue0Var);
        }

        @Override // abcd.se0
        public Set<se0.a> v5() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.PASS));
        }
    }

    class b extends cf0 {
        private final String DW;
        private final String j6;

        public b(String str, String str2) {
            this.j6 = str;
            this.DW = str2;
        }

        private void Mr(TreeMap<String, k70> treeMap) throws j50 {
            try {
                Iterator<String> it = me0.this.aM.Ws(me0.this.j3, a8("../refs")).iterator();
                while (it.hasNext()) {
                    U2(treeMap, "refs/" + it.next());
                }
            } catch (IOException e) {
                throw new j50(VH(), JGitText.DW().cannotListRefs, e);
            }
        }

        private k70 U2(TreeMap<String, k70> treeMap, String str) throws IOException {
            String str2 = "../" + str;
            try {
                BufferedReader bufferedReaderTp = tp(str2);
                try {
                    String line = bufferedReaderTp.readLine();
                    if (line == null) {
                        throw new j50(VH(), MessageFormat.format(JGitText.DW().transportExceptionEmptyRef, str));
                    }
                    if (!line.startsWith("ref: ")) {
                        if (!a70.Mz(line)) {
                            throw new j50(VH(), MessageFormat.format(JGitText.DW().transportExceptionBadRef, str, line));
                        }
                        c70.c cVar = new c70.c(aM(treeMap.get(str)), str, a70.vJ(line));
                        treeMap.put(cVar.getName(), cVar);
                        return cVar;
                    }
                    String strSubstring = line.substring(5);
                    k70 cVar2 = treeMap.get(strSubstring);
                    if (cVar2 == null) {
                        cVar2 = U2(treeMap, strSubstring);
                    }
                    if (cVar2 == null) {
                        cVar2 = new c70.c(k70.a.NEW, strSubstring, null);
                    }
                    u70 u70Var = new u70(str, cVar2);
                    treeMap.put(u70Var.getName(), u70Var);
                    return u70Var;
                } finally {
                    bufferedReaderTp.close();
                }
            } catch (FileNotFoundException unused) {
                return null;
            } catch (IOException e) {
                throw new j50(VH(), MessageFormat.format(JGitText.DW().transportExceptionReadRef, str2), e);
            }
        }

        private String a8(String str) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            String strSubstring = this.DW;
            while (str.startsWith("../")) {
                strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(47));
                str = str.substring(3);
            }
            return String.valueOf(strSubstring) + "/" + str;
        }

        private k70.a aM(k70 k70Var) {
            return (k70Var == null || k70Var.j6() != k70.a.PACKED) ? k70.a.LOOSE : k70.a.LOOSE_PACKED;
        }

        @Override // abcd.cf0
        public void DW(String str) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
            me0.this.aM.tp(me0.this.j3, a8(str));
        }

        @Override // abcd.cf0
        public OutputStream J8(String str, j70 j70Var, String str2) {
            return me0.this.aM.gn(me0.this.j3, a8(str), j70Var, str2);
        }

        @Override // abcd.cf0
        public ue0 VH() {
            return new ue0().aM("amazon-s3").J8(this.j6).QX("/" + this.DW);
        }

        @Override // abcd.cf0
        public void Ws(String str, byte[] bArr) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
            me0.this.aM.U2(me0.this.j3, a8(str), bArr);
        }

        @Override // abcd.cf0
        public Collection<String> Zo() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(me0.this.aM.Ws(me0.this.j3, a8("pack")));
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("pack-") && str.endsWith(".pack")) {
                    if (hashSet.contains(String.valueOf(str.substring(0, str.length() - 5)) + ".idx")) {
                        arrayList.add(str);
                    }
                }
            }
            return arrayList;
        }

        @Override // abcd.cf0
        public cf0.a gn(String str) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
            URLConnection uRLConnectionWe = me0.this.aM.we(me0.this.j3, a8(str));
            InputStream inputStream = uRLConnectionWe.getInputStream();
            InputStream inputStreamU7 = me0.this.aM.u7(uRLConnectionWe);
            int contentLength = uRLConnectionWe.getContentLength();
            if (inputStream != inputStreamU7) {
                contentLength = -1;
            }
            return new cf0.a(inputStreamU7, contentLength);
        }

        public Map<String, k70> j3() throws IOException {
            TreeMap<String, k70> treeMap = new TreeMap<>();
            we(treeMap);
            Mr(treeMap);
            U2(treeMap, "HEAD");
            return treeMap;
        }

        @Override // abcd.cf0
        public void j6() {
        }

        @Override // abcd.cf0
        public cf0 u7(String str) {
            return me0.this.new b(this.j6, a8(str));
        }

        @Override // abcd.cf0
        public Collection<cf0> v5() {
            try {
                return EQ("info/alternates");
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
    }

    public me0(p70 p70Var, ue0 ue0Var) {
        super(p70Var, ue0Var);
        this.aM = new mc0(sy());
        this.j3 = ue0Var.v5();
        String strGn = ue0Var.gn();
        strGn = strGn.startsWith("/") ? strGn.substring(1) : strGn;
        this.Mr = strGn.endsWith("/") ? strGn.substring(0, strGn.length() - 1) : strGn;
    }

    private static Properties aj(File file) throws u40 {
        try {
            return mc0.Mr(file);
        } catch (IOException e) {
            throw new u40(MessageFormat.format(JGitText.DW().cannotReadFile, file), e);
        }
    }

    private Properties sy() {
        if (this.j6.u7() != null) {
            File file = new File(this.j6.u7(), this.DW.we());
            if (file.isFile()) {
                return aj(file);
            }
        }
        File file2 = new File(this.j6.tp().J8(), this.DW.we());
        if (file2.isFile()) {
            return aj(file2);
        }
        Properties properties = new Properties();
        properties.setProperty("accesskey", this.DW.we());
        properties.setProperty("secretkey", this.DW.VH());
        return properties;
    }

    @Override // abcd.le0
    public void Hw() {
    }

    @Override // abcd.le0
    public rd0 SI() {
        b bVar = new b(this.j3, String.valueOf(this.Mr) + "/objects");
        bf0 bf0Var = new bf0(this, bVar);
        bf0Var.EQ(bVar.j3());
        return bf0Var;
    }

    @Override // abcd.le0
    public yc0 nw() {
        b bVar = new b(this.j3, String.valueOf(this.Mr) + "/objects");
        af0 af0Var = new af0(this, bVar);
        af0Var.EQ(bVar.j3());
        return af0Var;
    }
}
