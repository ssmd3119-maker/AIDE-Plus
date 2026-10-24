package abcd;

import abcd.c70;
import abcd.k70;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class sc0 extends oc0 {
    private final le0 Hw;
    private String VH;
    final Map<a70, String> Zo = new HashMap();
    private eb0 gn;
    InputStream v5;

    public sc0(le0 le0Var, InputStream inputStream) throws j50 {
        this.Hw = le0Var;
        this.v5 = new BufferedInputStream(inputStream);
        try {
            if (j3() != 2) {
                throw new j50(this.Hw.DW, JGitText.DW().notABundle);
            }
            XL();
        } catch (j50 e) {
            close();
            throw e;
        } catch (IOException e2) {
            close();
            throw new j50(this.Hw.DW, e2.getMessage(), e2);
        } catch (RuntimeException e3) {
            close();
            throw new j50(this.Hw.DW, e3.getMessage(), e3);
        }
    }

    private void Mr() {
        if (this.Zo.isEmpty()) {
            return;
        }
        t90 t90Var = new t90(this.Hw.j6);
        try {
            m90 m90VarVJ = t90Var.vJ("PREREQ");
            m90 m90VarVJ2 = t90Var.vJ("SEEN");
            HashMap map = new HashMap();
            ArrayList<o90> arrayList = new ArrayList();
            for (Map.Entry<a70, String> entry : this.Zo.entrySet()) {
                a70 key = entry.getKey();
                try {
                    k90 k90VarCa = t90Var.ca(key);
                    if (!k90VarCa.lp(m90VarVJ)) {
                        k90VarCa.x9(m90VarVJ);
                        arrayList.add(k90VarCa);
                    }
                } catch (q40 unused) {
                    map.put(key, entry.getValue());
                } catch (IOException e) {
                    throw new j50(this.Hw.DW, MessageFormat.format(JGitText.DW().cannotReadCommit, key.BT()), e);
                }
            }
            if (!map.isEmpty()) {
                throw new p40(this.Hw.DW, map);
            }
            Iterator<k70> it = this.Hw.j6.VH().values().iterator();
            while (it.hasNext()) {
                try {
                    t90Var.ef(t90Var.ca(it.next().DW()));
                } catch (IOException unused2) {
                }
            }
            int size = arrayList.size();
            while (true) {
                try {
                    k90 k90VarG3 = t90Var.g3();
                    if (k90VarG3 == null) {
                        break;
                    }
                    if (k90VarG3.lp(m90VarVJ)) {
                        k90VarG3.x9(m90VarVJ2);
                        size--;
                        if (size == 0) {
                            break;
                        }
                    }
                } catch (IOException e2) {
                    throw new j50(this.Hw.DW, JGitText.DW().cannotReadObject, e2);
                }
            }
            if (size > 0) {
                for (o90 o90Var : arrayList) {
                    if (!o90Var.lp(m90VarVJ2)) {
                        map.put(o90Var, this.Zo.get(o90Var));
                    }
                }
                throw new p40(this.Hw.DW, map);
            }
        } finally {
            t90Var.lp();
        }
    }

    private y40 QX(String str) {
        return new y40(this.Hw.DW, MessageFormat.format(JGitText.DW().duplicateAdvertisementsOf, str));
    }

    private void XL() throws IOException {
        byte[] bArr = new byte[1024];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            String strAM = aM(bArr);
            if (strAM.length() == 0) {
                EQ(linkedHashMap);
                return;
            } else if (strAM.charAt(0) == '-') {
                this.Zo.put(a70.vJ(strAM.substring(1, 41)), strAM.length() > 42 ? strAM.substring(42) : null);
            } else {
                String strSubstring = strAM.substring(41, strAM.length());
                if (((k70) linkedHashMap.put(strSubstring, new c70.c(k70.a.NETWORK, strSubstring, a70.vJ(strAM.substring(0, 40))))) != null) {
                    throw QX(strSubstring);
                }
            }
        }
    }

    private String aM(byte[] bArr) throws IOException {
        this.v5.mark(bArr.length);
        int i = this.v5.read(bArr);
        int i2 = 0;
        while (i2 < i && bArr[i2] != 10) {
            i2++;
        }
        this.v5.reset();
        eg0.VH(this.v5, i2);
        if (i2 < i && bArr[i2] == 10) {
            eg0.VH(this.v5, 1L);
        }
        return kg0.Zo(r60.Zo, bArr, 0, i2);
    }

    private int j3() throws j50 {
        if ("# v2 git bundle".equals(aM(new byte[1024]))) {
            return 2;
        }
        throw new j50(this.Hw.DW, JGitText.DW().notABundle);
    }

    @Override // abcd.yc0
    public void FH(String str) {
        this.VH = str;
    }

    @Override // abcd.yc0
    public Collection<eb0> VH() {
        eb0 eb0Var = this.gn;
        return eb0Var != null ? Collections.singleton(eb0Var) : Collections.emptyList();
    }

    @Override // abcd.oc0
    public void Ws(j70 j70Var, Collection<k70> collection, Set<a70> set) throws j50 {
        Mr();
        try {
            e70 e70VarEr = this.Hw.j6.er();
            try {
                jd0 jd0VarEQ = e70VarEr.EQ(this.v5);
                jd0VarEQ.wc(true);
                jd0VarEQ.FN(this.Hw.Mr());
                jd0VarEQ.CU(this.VH);
                this.gn = jd0VarEQ.Mz(x60.j6);
                e70VarEr.FH();
            } finally {
                e70VarEr.we();
            }
        } catch (IOException e) {
            close();
            throw new j50(this.Hw.DW, e.getMessage(), e);
        } catch (RuntimeException e2) {
            close();
            throw new j50(this.Hw.DW, e2.getMessage(), e2);
        }
    }

    @Override // abcd.tc0
    public void close() {
        InputStream inputStream = this.v5;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.v5 = null;
                throw th;
            }
            this.v5 = null;
        }
    }

    @Override // abcd.yc0
    public boolean v5() {
        return false;
    }
}
