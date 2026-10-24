package abcd;

import abcd.c70;
import abcd.cf0;
import abcd.k70;
import abcd.se0;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class te0 extends ge0 implements df0 {
    static final se0 Mr = new a();

    class a extends se0 {
        @Override // abcd.se0
        public String Hw() {
            return JGitText.DW().transportProtoSFTP;
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return Collections.singleton("sftp");
        }

        @Override // abcd.se0
        public Set<se0.a> Zo() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.HOST, se0.a.PATH));
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) {
            return new te0(p70Var, ue0Var);
        }

        @Override // abcd.se0
        public Set<se0.a> v5() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.USER, se0.a.PASS, se0.a.PORT));
        }
    }

    public te0(p70 p70Var, ue0 ue0Var) {
        super(p70Var, ue0Var);
    }

    @Override // abcd.le0
    public rd0 SI() {
        b bVar = new b(this.DW.gn());
        bf0 bf0Var = new bf0(this, bVar);
        bf0Var.EQ(bVar.Mr());
        return bf0Var;
    }

    @Override // abcd.le0
    public yc0 nw() {
        b bVar = new b(this.DW.gn());
        af0 af0Var = new af0(this, bVar);
        af0Var.EQ(bVar.Mr());
        return af0Var;
    }

    public ChannelSftp sy() throws j50 {
        int iQX = QX() > 0 ? QX() * 1000 : 0;
        try {
            Channel channelHw = ((fd0) x9()).Hw();
            channelHw.FH(iQX);
            return (ChannelSftp) channelHw;
        } catch (JSchException e) {
            throw new j50(this.DW, e.getMessage(), e);
        }
    }

    class b extends cf0 {
        private ChannelSftp DW;
        private final String j6;

        class a implements Comparator<String> {
            private final /* synthetic */ HashMap WB;

            public a(b bVar, HashMap map) {
                this.WB = map;
            }

            @Override // java.util.Comparator
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                return ((Integer) this.WB.get(str2)).intValue() - ((Integer) this.WB.get(str)).intValue();
            }
        }

        public b(String str) throws j50 {
            str = str.startsWith("/~") ? str.substring(1) : str;
            str = str.startsWith("~/") ? str.substring(2) : str;
            try {
                ChannelSftp channelSftpSy = te0.this.sy();
                this.DW = channelSftpSy;
                channelSftpSy.jJ(str);
                this.DW.jJ("objects");
                this.j6 = this.DW.cT();
            } catch (j50 e) {
                j6();
                throw e;
            } catch (SftpException e2) {
                throw new j50("Can't enter " + str + "/objects: " + e2.getMessage(), e2);
            }
        }

        private void U2(TreeMap<String, k70> treeMap, String str, String str2) throws IOException {
            try {
                for (ChannelSftp.LsEntry lsEntry : this.DW.mb(str)) {
                    String strDW = lsEntry.DW();
                    if (!".".equals(strDW) && !"..".equals(strDW)) {
                        String str3 = String.valueOf(str) + "/" + strDW;
                        if (lsEntry.j6().tp()) {
                            U2(treeMap, str3, String.valueOf(str2) + strDW + "/");
                        } else {
                            a8(treeMap, str3, String.valueOf(str2) + strDW);
                        }
                    }
                }
            } catch (SftpException e) {
                throw new j50("Can't ls " + this.j6 + "/" + str + ": " + e.getMessage(), e);
            }
        }

        private k70 a8(TreeMap<String, k70> treeMap, String str, String str2) throws IOException {
            try {
                BufferedReader bufferedReaderTp = tp(str);
                try {
                    String line = bufferedReaderTp.readLine();
                    if (line == null) {
                        throw new j50("Empty ref: " + str2);
                    }
                    if (!line.startsWith("ref: ")) {
                        if (a70.Mz(line)) {
                            c70.c cVar = new c70.c(aM(treeMap.get(str2)), str2, a70.vJ(line));
                            treeMap.put(cVar.getName(), cVar);
                            return cVar;
                        }
                        throw new j50("Bad ref: " + str2 + ": " + line);
                    }
                    String strSubstring = line.substring(5);
                    k70 cVar2 = treeMap.get(strSubstring);
                    if (cVar2 == null) {
                        cVar2 = a8(treeMap, "../" + strSubstring, strSubstring);
                    }
                    if (cVar2 == null) {
                        cVar2 = new c70.c(k70.a.NEW, strSubstring, null);
                    }
                    u70 u70Var = new u70(str2, cVar2);
                    treeMap.put(u70Var.getName(), u70Var);
                    return u70Var;
                } finally {
                    bufferedReaderTp.close();
                }
            } catch (FileNotFoundException unused) {
                return null;
            } catch (IOException e) {
                throw new j50("Cannot read " + this.j6 + "/" + str + ": " + e.getMessage(), e);
            }
        }

        private k70.a aM(k70 k70Var) {
            return (k70Var == null || k70Var.j6() != k70.a.PACKED) ? k70.a.LOOSE : k70.a.LOOSE_PACKED;
        }

        private void j3(String str) throws j50 {
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf <= 0) {
                return;
            }
            String strSubstring = str.substring(0, iLastIndexOf);
            try {
                this.DW.qp(strSubstring);
            } catch (SftpException e) {
                e = e;
                if (e.WB == 2) {
                    j3(strSubstring);
                    try {
                        this.DW.qp(strSubstring);
                        return;
                    } catch (SftpException e2) {
                        e = e2;
                        throw new j50("Can't mkdir " + this.j6 + "/" + strSubstring + ": " + e.getMessage(), e);
                    }
                }
                throw new j50("Can't mkdir " + this.j6 + "/" + strSubstring + ": " + e.getMessage(), e);
            }
        }

        @Override // abcd.cf0
        public void DW(String str) throws j50 {
            try {
                this.DW.n5(str);
                int iLastIndexOf = str.lastIndexOf(47);
                while (iLastIndexOf > 0) {
                    try {
                        str = str.substring(0, iLastIndexOf);
                        this.DW.Q6(str);
                        iLastIndexOf = str.lastIndexOf(47);
                    } catch (SftpException unused) {
                        return;
                    }
                }
            } catch (SftpException e) {
                if (e.WB == 2) {
                    return;
                }
                throw new j50("Can't delete " + this.j6 + "/" + str + ": " + e.getMessage(), e);
            }
        }

        @Override // abcd.cf0
        public OutputStream J8(String str, j70 j70Var, String str2) throws j50 {
            try {
                return this.DW.k2(str);
            } catch (SftpException e) {
                e = e;
                if (e.WB == 2) {
                    j3(str);
                    try {
                        return this.DW.k2(str);
                    } catch (SftpException e2) {
                        e = e2;
                        throw new j50("Can't write " + this.j6 + "/" + str + ": " + e.getMessage(), e);
                    }
                }
                throw new j50("Can't write " + this.j6 + "/" + str + ": " + e.getMessage(), e);
            }
        }

        public Map<String, k70> Mr() throws IOException {
            TreeMap<String, k70> treeMap = new TreeMap<>();
            we(treeMap);
            a8(treeMap, "../HEAD", "HEAD");
            U2(treeMap, "../refs", "refs/");
            return treeMap;
        }

        @Override // abcd.cf0
        public ue0 VH() {
            return te0.this.DW.QX(this.j6);
        }

        @Override // abcd.cf0
        public void Ws(String str, byte[] bArr) throws IOException {
            String str2 = String.valueOf(str) + ".lock";
            try {
                super.Ws(str2, bArr);
                try {
                    this.DW.Z1(str2, str);
                } catch (SftpException e) {
                    throw new j50("Can't write " + this.j6 + "/" + str + ": " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                try {
                    this.DW.n5(str2);
                } catch (SftpException unused) {
                }
                throw e2;
            }
        }

        @Override // abcd.cf0
        public Collection<String> Zo() throws j50 {
            ArrayList arrayList = new ArrayList();
            try {
                Vector<ChannelSftp.LsEntry> vectorMb = this.DW.mb("pack");
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (ChannelSftp.LsEntry lsEntry : vectorMb) {
                    map.put(lsEntry.DW(), lsEntry);
                }
                for (ChannelSftp.LsEntry lsEntry2 : vectorMb) {
                    String strDW = lsEntry2.DW();
                    if (strDW.startsWith("pack-") && strDW.endsWith(".pack")) {
                        if (map.containsKey(String.valueOf(strDW.substring(0, strDW.length() - 5)) + ".idx")) {
                            map2.put(strDW, Integer.valueOf(lsEntry2.j6().v5()));
                            arrayList.add(strDW);
                        }
                    }
                }
                Collections.sort(arrayList, new a(this, map2));
                return arrayList;
            } catch (SftpException e) {
                throw new j50("Can't ls " + this.j6 + "/pack: " + e.getMessage(), e);
            }
        }

        @Override // abcd.cf0
        public cf0.a gn(String str) throws j50, FileNotFoundException {
            try {
                return new cf0.a(this.DW.Xa(str), this.DW.fY(str).gn());
            } catch (SftpException e) {
                if (e.WB == 2) {
                    throw new FileNotFoundException(str);
                }
                throw new j50("Can't get " + this.j6 + "/" + str + ": " + e.getMessage(), e);
            }
        }

        @Override // abcd.cf0
        public void j6() {
            ChannelSftp channelSftp = this.DW;
            if (channelSftp != null) {
                try {
                    if (channelSftp.a8()) {
                        this.DW.VH();
                    }
                } finally {
                    this.DW = null;
                }
            }
        }

        @Override // abcd.cf0
        public cf0 u7(String str) {
            return te0.this.new b(this, str);
        }

        @Override // abcd.cf0
        public Collection<cf0> v5() {
            try {
                return EQ("info/alternates");
            } catch (FileNotFoundException unused) {
                return null;
            }
        }

        public b(b bVar, String str) throws j50 {
            try {
                ChannelSftp channelSftpSy = te0.this.sy();
                this.DW = channelSftpSy;
                channelSftpSy.jJ(bVar.j6);
                this.DW.jJ(str);
                this.j6 = this.DW.cT();
            } catch (j50 e) {
                j6();
                throw e;
            } catch (SftpException e2) {
                throw new j50("Can't enter " + str + " from " + bVar.j6 + ": " + e2.getMessage(), e2);
            }
        }
    }
}
