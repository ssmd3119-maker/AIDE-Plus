package abcd;

import abcd.ja0;
import abcd.r70;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ta0 extends ja0 {
    private static final b we = new b(ma0.Hw, new wa0[0]);
    private final File DW;
    private final File FH;
    private final File Hw;
    private final File Zo;
    private final q60 j6;
    private final wf0 u7;
    private final File v5;
    private final AtomicReference<b> VH = new AtomicReference<>(we);
    private final AtomicReference<a> gn = new AtomicReference<>();
    private final lb0 EQ = new lb0();
    private final AtomicReference<ja0.a[]> tp = new AtomicReference<>();

    private static final class a {
        final Collection<pa0> DW;
        final byte[] FH;
        final ma0 j6;

        public a(ma0 ma0Var, List<pa0> list, byte[] bArr) {
            this.j6 = ma0Var;
            this.DW = list;
            this.FH = bArr;
        }

        public Collection<sb0> j6() {
            return this.DW;
        }
    }

    private static final class b {
        final wa0[] DW;
        final ma0 j6;

        public b(ma0 ma0Var, wa0[] wa0VarArr) {
            this.j6 = ma0Var;
            this.DW = wa0VarArr;
        }
    }

    public ta0(q60 q60Var, File file, File[] fileArr, wf0 wf0Var) {
        this.j6 = q60Var;
        this.DW = file;
        this.FH = new File(this.DW, "info");
        this.Hw = new File(this.DW, "pack");
        this.v5 = new File(this.FH, "alternates");
        this.Zo = new File(this.FH, "cached-packs");
        this.u7 = wf0Var;
        if (fileArr != null) {
            ja0.a[] aVarArr = new ja0.a[fileArr.length];
            for (int i = 0; i < fileArr.length; i++) {
                aVarArr[i] = vJ(fileArr[i]);
            }
            this.tp.set(aVarArr);
        }
    }

    private static Map<String, wa0> I(b bVar) {
        HashMap map = new HashMap();
        for (wa0 wa0Var : bVar.DW) {
            if (wa0Var.sG()) {
                wa0Var.v5();
            } else {
                wa0 wa0Var2 = (wa0) map.put(wa0Var.SI().getName(), wa0Var);
                if (wa0Var2 != null) {
                    map.put(wa0Var2.SI().getName(), wa0Var2);
                    wa0Var.v5();
                }
            }
        }
        return map;
    }

    private void Mz(wa0 wa0Var) {
        b bVar;
        wa0[] wa0VarArr;
        do {
            bVar = this.VH.get();
            wa0[] wa0VarArr2 = bVar.DW;
            int iCb = cb(wa0VarArr2, wa0Var);
            if (iCb < 0) {
                break;
            }
            int length = wa0VarArr2.length - 1;
            wa0VarArr = new wa0[length];
            System.arraycopy(wa0VarArr2, 0, wa0VarArr, 0, iCb);
            System.arraycopy(wa0VarArr2, iCb + 1, wa0VarArr, iCb, length - iCb);
        } while (!this.VH.compareAndSet(bVar, new b(bVar.j6, wa0VarArr)));
        wa0Var.v5();
    }

    private b Qq(b bVar) {
        Map<String, wa0> mapI = I(bVar);
        ma0 ma0VarZo = ma0.Zo(this.Hw);
        Set<String> setSG = sG();
        ArrayList arrayList = new ArrayList(setSG.size() >> 2);
        boolean z = false;
        for (String str : setSG) {
            if (str.length() == 49 && str.endsWith(".idx")) {
                String str2 = String.valueOf(str.substring(0, str.length() - 4)) + ".pack";
                if (setSG.contains(str2)) {
                    wa0 wa0VarRemove = mapI.remove(str2);
                    if (wa0VarRemove != null) {
                        arrayList.add(wa0VarRemove);
                    } else {
                        arrayList.add(new wa0(new File(this.Hw, str), new File(this.Hw, str2)));
                        z = true;
                    }
                }
            }
        }
        if (!z && mapI.isEmpty() && ma0VarZo.j6(bVar.j6)) {
            bVar.j6.VH(ma0VarZo);
            return bVar;
        }
        Iterator<wa0> it = mapI.values().iterator();
        while (it.hasNext()) {
            it.next().v5();
        }
        if (arrayList.isEmpty()) {
            return new b(ma0VarZo, we.DW);
        }
        wa0[] wa0VarArr = (wa0[]) arrayList.toArray(new wa0[arrayList.size()]);
        Arrays.sort(wa0VarArr, wa0.kf);
        return new b(ma0VarZo, wa0VarArr);
    }

    private static BufferedReader Sf(File file) {
        return new BufferedReader(new FileReader(file));
    }

    private a ca(a aVar) {
        byte[] bArrFH;
        ma0 ma0VarZo = ma0.Zo(this.Zo);
        int iAM = 0;
        try {
            bArrFH = eg0.FH(this.Zo);
        } catch (FileNotFoundException unused) {
            bArrFH = new byte[0];
        }
        if (aVar != null && aVar.j6.j6(ma0VarZo) && Arrays.equals(aVar.FH, bArrFH)) {
            aVar.j6.VH(ma0VarZo);
            return aVar;
        }
        ArrayList arrayList = new ArrayList(4);
        HashSet hashSet = new HashSet();
        while (iAM < bArrFH.length) {
            if (bArrFH[iAM] == 35 || bArrFH[iAM] == 10) {
                iAM = kg0.aM(bArrFH, iAM);
            } else if (bArrFH[iAM] == 43) {
                int i = iAM + 2;
                hashSet.add(a70.g3(bArrFH, i));
                iAM = kg0.aM(bArrFH, i);
            } else {
                ArrayList arrayList2 = new ArrayList(4);
                while (iAM < bArrFH.length && bArrFH[iAM] == 80) {
                    int iAM2 = kg0.aM(bArrFH, iAM);
                    if (bArrFH[iAM2 - 1] == 10) {
                        iAM2--;
                    }
                    arrayList2.add(kg0.gn(bArrFH, iAM + 2, iAM2));
                    iAM = kg0.aM(bArrFH, iAM2);
                }
                if (!hashSet.isEmpty() && !arrayList2.isEmpty()) {
                    arrayList.add(new pa0(this, hashSet, arrayList2));
                    hashSet = new HashSet();
                }
            }
        }
        arrayList.trimToSize();
        return new a(ma0VarZo, Collections.unmodifiableList(arrayList), bArrFH);
    }

    private static int cb(wa0[] wa0VarArr, wa0 wa0Var) {
        for (int i = 0; i < wa0VarArr.length; i++) {
            if (wa0VarArr[i] == wa0Var) {
                return i;
            }
        }
        return -1;
    }

    private void dx(wa0 wa0Var) {
        b bVar;
        wa0[] wa0VarArr;
        do {
            bVar = this.VH.get();
            wa0[] wa0VarArr2 = bVar.DW;
            String name = wa0Var.SI().getName();
            for (wa0 wa0Var2 : wa0VarArr2) {
                if (wa0.kf.compare(wa0Var, wa0Var2) < 0) {
                    break;
                } else {
                    if (name.equals(wa0Var2.SI().getName())) {
                        return;
                    }
                }
            }
            wa0VarArr = new wa0[wa0VarArr2.length + 1];
            wa0VarArr[0] = wa0Var;
            System.arraycopy(wa0VarArr2, 0, wa0VarArr, 1, wa0VarArr2.length);
        } while (!this.VH.compareAndSet(bVar, new b(bVar.j6, wa0VarArr)));
    }

    private ja0.a[] ef() throws IOException {
        ArrayList arrayList = new ArrayList(4);
        BufferedReader bufferedReaderSf = Sf(this.v5);
        while (true) {
            try {
                String line = bufferedReaderSf.readLine();
                if (line == null) {
                    bufferedReaderSf.close();
                    return (ja0.a[]) arrayList.toArray(new ja0.a[arrayList.size()]);
                }
                arrayList.add(g3(line));
            } catch (Throwable th) {
                bufferedReaderSf.close();
                throw th;
            }
        }
    }

    private ja0.a g3(String str) {
        return vJ(this.u7.VH(this.DW, str));
    }

    private Set<String> sG() {
        String[] list = this.Hw.list();
        if (list == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(list.length << 1);
        for (String str : list) {
            if (str.startsWith("pack-")) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private ja0.a vJ(File file) {
        File parentFile = file.getParentFile();
        return r70.a.v5(parentFile, this.u7) ? new ja0.b((ka0) r70.DW(r70.a.FH(parentFile, this.u7))) : new ja0.a(new ta0(this.j6, file, null, this.u7));
    }

    private b x9(b bVar) {
        b bVar2;
        b bVarQq;
        synchronized (this.VH) {
            do {
                bVar2 = this.VH.get();
                if (bVar2 != bVar) {
                    return bVar2;
                }
                bVarQq = Qq(bVar2);
                if (bVarQq == bVar2) {
                    return bVarQq;
                }
            } while (!this.VH.compareAndSet(bVar2, bVarQq));
            return bVarQq;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        continue;
     */
    @Override // abcd.ja0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public abcd.f70 BT(abcd.ob0 r6, abcd.j60 r7) throws java.io.IOException {
        /*
            r5 = this;
            abcd.lb0 r0 = r5.EQ
            boolean r0 = r0.FH(r7)
            if (r0 == 0) goto L18
            java.lang.String r0 = r7.BT()
            abcd.f70 r0 = r5.vy(r6, r0, r7)
            if (r0 == 0) goto L13
            return r0
        L13:
            abcd.lb0 r0 = r5.EQ
            r0.Hw(r7)
        L18:
            java.util.concurrent.atomic.AtomicReference<abcd.ta0$b> r0 = r5.VH
            java.lang.Object r0 = r0.get()
            abcd.ta0$b r0 = (abcd.ta0.b) r0
        L20:
            abcd.wa0[] r1 = r0.DW
            int r2 = r1.length
            r3 = 0
        L24:
            if (r3 < r2) goto L28
            r6 = 0
            return r6
        L28:
            r4 = r1[r3]
            abcd.f70 r4 = r4.er(r6, r7)     // Catch: java.io.IOException -> L31 abcd.x40 -> L37
            if (r4 == 0) goto L34
            return r4
        L31:
            r5.Mz(r4)
        L34:
            int r3 = r3 + 1
            goto L24
        L37:
            abcd.ta0$b r0 = r5.x9(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ta0.BT(abcd.ob0, abcd.j60):abcd.f70");
    }

    @Override // abcd.z60
    public boolean DW() {
        return this.DW.exists();
    }

    @Override // abcd.ja0
    public q60 EQ() {
        return this.j6;
    }

    @Override // abcd.z60
    public z60 Hw() {
        return er();
    }

    @Override // abcd.ja0
    public wf0 J0() {
        return this.u7;
    }

    @Override // abcd.ja0
    public void KD(gc0 gc0Var, dc0 dc0Var, ob0 ob0Var) {
        int i;
        b bVarX9 = this.VH.get();
        loop0: while (true) {
            for (wa0 wa0Var : bVarX9.DW) {
                try {
                    qa0 qa0VarX9 = wa0Var.x9(ob0Var, dc0Var);
                    if (qa0VarX9 != null) {
                        gc0Var.vy(dc0Var, qa0VarX9);
                    }
                } catch (x40 unused) {
                    bVarX9 = x9(bVarX9);
                } catch (IOException unused2) {
                    Mz(wa0Var);
                }
            }
            break loop0;
        }
        for (ja0.a aVar : rN()) {
            aVar.j6.KD(gc0Var, dc0Var, ob0Var);
        }
    }

    @Override // abcd.ja0
    public boolean Mr(String str) {
        return gn(str).exists();
    }

    @Override // abcd.ja0
    public long QX(ob0 ob0Var, String str, j60 j60Var) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(gn(str));
            try {
                return kb0.gn(fileInputStream, j60Var, ob0Var);
            } finally {
                fileInputStream.close();
            }
        } catch (FileNotFoundException unused) {
            return -1L;
        }
    }

    @Override // abcd.ja0
    public void SI(Set<a70> set, h60 h60Var) {
        int i;
        b bVarX9;
        int size = set.size();
        b bVar = this.VH.get();
        while (true) {
            for (wa0 wa0Var : bVar.DW) {
                try {
                    wa0Var.Qq(set, h60Var, 256);
                } catch (IOException unused) {
                    Mz(wa0Var);
                }
                if (set.size() > 256) {
                    return;
                }
            }
            if (set.size() != size || (bVarX9 = x9(bVar)) == bVar || bVarX9.DW.length == 0) {
                break;
            } else {
                bVar = bVarX9;
            }
        }
        String strSubstring = h60Var.we().substring(0, 2);
        String[] list = new File(we(), strSubstring).list();
        if (list != null) {
            for (String str : list) {
                if (str.length() == 38) {
                    try {
                        a70 a70VarVJ = a70.vJ(String.valueOf(strSubstring) + str);
                        if (h60Var.J0(a70VarVJ) == 0) {
                            set.add(a70VarVJ);
                        }
                        if (set.size() > 256) {
                            return;
                        }
                    } catch (IllegalArgumentException unused2) {
                        continue;
                    }
                }
            }
        }
        for (ja0.a aVar : rN()) {
            aVar.j6.SI(set, h60Var);
            if (set.size() > 256) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        continue;
     */
    @Override // abcd.ja0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long Ws(abcd.ob0 r10, abcd.j60 r11) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<abcd.ta0$b> r0 = r9.VH
            java.lang.Object r0 = r0.get()
            abcd.ta0$b r0 = (abcd.ta0.b) r0
        L8:
            abcd.wa0[] r1 = r0.DW
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 < r2) goto L11
            r10 = -1
            return r10
        L11:
            r4 = r1[r3]
            long r4 = r4.ei(r10, r11)     // Catch: java.io.IOException -> L1e abcd.x40 -> L24
            r6 = 0
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 > 0) goto L21
            return r4
        L1e:
            r9.Mz(r4)
        L21:
            int r3 = r3 + 1
            goto Lc
        L24:
            abcd.ta0$b r0 = r9.x9(r0)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ta0.Ws(abcd.ob0, abcd.j60):long");
    }

    public void cn() {
        cg0.v5(this.DW);
        cg0.FH(this.FH);
        cg0.FH(this.Hw);
    }

    @Override // abcd.ja0
    public ja0 er() {
        return new ga0(this);
    }

    @Override // abcd.ja0
    public boolean j3(j60 j60Var) {
        if (this.EQ.FH(j60Var)) {
            return true;
        }
        for (wa0 wa0Var : this.VH.get().DW) {
            try {
            } catch (IOException unused) {
                Mz(wa0Var);
            }
            if (wa0Var.cb(j60Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // abcd.z60
    public void j6() {
        this.EQ.DW();
        b bVar = this.VH.get();
        this.VH.set(we);
        for (wa0 wa0Var : bVar.DW) {
            wa0Var.v5();
        }
        ja0.a[] aVarArr = this.tp.get();
        if (aVarArr != null) {
            this.tp.set(null);
            for (ja0.a aVar : aVarArr) {
                aVar.j6();
            }
        }
    }

    @Override // abcd.ja0
    public ja0.c lg(File file, a70 a70Var, boolean z) throws InterruptedException, IOException {
        if (this.EQ.FH(a70Var)) {
            cg0.j6(file);
            return ja0.c.EXISTS_LOOSE;
        }
        if (!z && FH(a70Var)) {
            cg0.j6(file);
            return ja0.c.EXISTS_PACKED;
        }
        File fileU7 = u7(a70Var);
        if (fileU7.exists()) {
            cg0.j6(file);
            return ja0.c.EXISTS_LOOSE;
        }
        if (file.renameTo(fileU7)) {
            fileU7.setReadOnly();
            this.EQ.j6(a70Var);
            return ja0.c.INSERTED;
        }
        cg0.FH(fileU7.getParentFile());
        if (file.renameTo(fileU7)) {
            fileU7.setReadOnly();
            this.EQ.j6(a70Var);
            return ja0.c.INSERTED;
        }
        if (z || !FH(a70Var)) {
            cg0.j6(file);
            return ja0.c.FAILURE;
        }
        cg0.j6(file);
        return ja0.c.EXISTS_PACKED;
    }

    @Override // abcd.ja0
    public wa0 nw(File file, File file2) throws IOException {
        String name = file.getName();
        String name2 = file2.getName();
        if (name.length() != 50 || !name.startsWith("pack-") || !name.endsWith(".pack")) {
            throw new IOException(MessageFormat.format(JGitText.DW().notAValidPack, file));
        }
        if (name2.length() != 49 || !name2.startsWith("pack-") || !name2.endsWith(".idx")) {
            throw new IOException(MessageFormat.format(JGitText.DW().notAValidPack, file2));
        }
        if (!name.substring(0, 45).equals(name2.substring(0, 45))) {
            throw new IOException(MessageFormat.format(JGitText.DW().packDoesNotMatchIndex, file));
        }
        wa0 wa0Var = new wa0(file2, file);
        dx(wa0Var);
        return wa0Var;
    }

    @Override // abcd.ja0
    public ja0.a[] rN() {
        ja0.a[] aVarArrEf = this.tp.get();
        if (aVarArrEf == null) {
            synchronized (this.tp) {
                aVarArrEf = this.tp.get();
                if (aVarArrEf == null) {
                    try {
                        aVarArrEf = ef();
                    } catch (IOException unused) {
                        aVarArrEf = new ja0.a[0];
                    }
                    this.tp.set(aVarArrEf);
                }
            }
        }
        return aVarArrEf;
    }

    @Override // abcd.ja0
    public boolean ro() {
        b bVar = this.VH.get();
        return bVar.j6.FH(this.Hw) && bVar != x9(bVar);
    }

    public Collection<wa0> sh() {
        b bVarX9 = this.VH.get();
        if (bVarX9 == we) {
            bVarX9 = x9(bVarX9);
        }
        return Collections.unmodifiableCollection(Arrays.asList(bVarX9.DW));
    }

    public String toString() {
        return "ObjectDirectory[" + we() + "]";
    }

    @Override // abcd.ja0
    public Collection<? extends sb0> tp() {
        a aVarCa = this.gn.get();
        if (aVarCa == null || aVarCa.j6.FH(this.Zo)) {
            aVarCa = ca(aVarCa);
        }
        Collection<sb0> collectionJ6 = aVarCa.j6();
        boolean z = false;
        for (ja0.a aVar : rN()) {
            Collection<sb0> collectionDW = aVar.DW();
            if (!collectionDW.isEmpty()) {
                if (collectionJ6.isEmpty()) {
                    collectionJ6 = collectionDW;
                } else {
                    if (!z) {
                        collectionJ6 = new ArrayList(collectionJ6);
                        z = true;
                    }
                    collectionJ6.addAll(collectionDW);
                }
            }
        }
        return collectionJ6;
    }

    @Override // abcd.ja0
    public File u7(j60 j60Var) {
        return super.u7(j60Var);
    }

    @Override // abcd.ja0
    public f70 vy(ob0 ob0Var, String str, j60 j60Var) throws IOException {
        try {
            File fileGn = gn(str);
            FileInputStream fileInputStream = new FileInputStream(fileGn);
            try {
                this.EQ.j6(j60Var);
                return kb0.we(fileInputStream, fileGn, j60Var, ob0Var);
            } finally {
                fileInputStream.close();
            }
        } catch (FileNotFoundException unused) {
            this.EQ.Hw(j60Var);
            return null;
        }
    }

    @Override // abcd.ja0
    public final File we() {
        return this.DW;
    }

    @Override // abcd.ja0
    /* renamed from: yS */
    public ua0 v5() {
        return new ua0(this, this.j6);
    }
}
