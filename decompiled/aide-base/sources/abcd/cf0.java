package abcd;

import abcd.c70;
import abcd.k70;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class cf0 {

    static final class a {
        final long DW;
        final InputStream j6;

        public a(InputStream inputStream, long j) {
            this.j6 = inputStream;
            this.DW = j;
        }

        public byte[] j6() throws IOException {
            byte[] byteArray;
            try {
                if (this.DW >= 0) {
                    int i = (int) this.DW;
                    byteArray = new byte[i];
                    eg0.DW(this.j6, byteArray, 0, i);
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i2 = this.j6.read(bArr);
                        if (i2 < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                return byteArray;
            } finally {
                this.j6.close();
            }
        }
    }

    private void J0(Map<String, k70> map, BufferedReader bufferedReader) throws IOException {
        k70 aVar = null;
        boolean zContains = false;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            if (line.charAt(0) == '#') {
                if (line.startsWith("# pack-refs with:")) {
                    zContains = line.substring(17).contains(" peeled");
                }
            } else if (line.charAt(0) != '^') {
                int iIndexOf = line.indexOf(32);
                if (iIndexOf < 0) {
                    throw new j50(MessageFormat.format(JGitText.DW().unrecognizedRef, line));
                }
                a70 a70VarVJ = a70.vJ(line.substring(0, iIndexOf));
                String strSubstring = line.substring(iIndexOf + 1);
                aVar = zContains ? new c70.a(k70.a.PACKED, strSubstring, a70VarVJ) : new c70.c(k70.a.PACKED, strSubstring, a70VarVJ);
                map.put(aVar.getName(), aVar);
            } else {
                if (aVar == null) {
                    throw new j50(JGitText.DW().peeledLineBeforeRef);
                }
                c70.b bVar = new c70.b(k70.a.PACKED, aVar.getName(), aVar.DW(), a70.vJ(line.substring(1)));
                map.put(bVar.getName(), bVar);
                aVar = bVar;
            }
        }
    }

    public void DW(String str) throws IOException {
        throw new IOException(MessageFormat.format(JGitText.DW().deletingNotSupported, str));
    }

    public Collection<cf0> EQ(String str) throws IOException {
        BufferedReader bufferedReaderTp = tp(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String line = bufferedReaderTp.readLine();
                if (line == null) {
                    return arrayList;
                }
                if (!line.endsWith("/")) {
                    line = String.valueOf(line) + "/";
                }
                arrayList.add(u7(line));
            }
        } finally {
            bufferedReaderTp.close();
        }
    }

    public void FH(String str) throws IOException {
        DW("../" + str);
    }

    public void Hw(String str) throws IOException {
        DW("../logs/" + str);
    }

    public OutputStream J8(String str, j70 j70Var, String str2) throws IOException {
        throw new IOException(MessageFormat.format(JGitText.DW().writingNotSupported, str));
    }

    public void QX(Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append("P ");
            sb.append(str);
            sb.append('\n');
        }
        Ws("info/packs", r60.Hw(sb.toString()));
    }

    public abstract ue0 VH();

    public void Ws(String str, byte[] bArr) {
        OutputStream outputStreamJ8 = J8(str, null, null);
        try {
            outputStreamJ8.write(bArr);
        } finally {
            outputStreamJ8.close();
        }
    }

    public void XL(String str, a70 a70Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(41);
        a70Var.we(byteArrayOutputStream);
        byteArrayOutputStream.write(10);
        Ws("../" + str, byteArrayOutputStream.toByteArray());
    }

    public abstract Collection<String> Zo();

    public abstract a gn(String str);

    public abstract void j6();

    public BufferedReader tp(String str) {
        return new BufferedReader(new InputStreamReader(gn(str).j6, r60.Zo));
    }

    public abstract cf0 u7(String str);

    public abstract Collection<cf0> v5();

    public void we(Map<String, k70> map) {
        try {
            BufferedReader bufferedReaderTp = tp("../packed-refs");
            try {
                J0(map, bufferedReaderTp);
                bufferedReaderTp.close();
            } catch (Throwable th) {
                bufferedReaderTp.close();
                throw th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException e) {
            throw new j50(VH(), JGitText.DW().errorInPackedRefs, e);
        }
    }
}
