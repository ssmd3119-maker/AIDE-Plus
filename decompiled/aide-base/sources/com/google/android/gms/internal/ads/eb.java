package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class eb implements to {
    private long DW;
    private final File FH;
    private final int Hw;
    private final Map<String, wb> j6;

    public eb(File file, int i) {
        this.j6 = new LinkedHashMap(16, 0.75f, true);
        this.DW = 0L;
        this.FH = file;
        this.Hw = i;
    }

    private final void DW(String str) {
        wb wbVarRemove = this.j6.remove(str);
        if (wbVarRemove != null) {
            this.DW -= wbVarRemove.j6;
        }
    }

    static int EQ(InputStream inputStream) {
        return (FH(inputStream) << 24) | FH(inputStream) | 0 | (FH(inputStream) << 8) | (FH(inputStream) << 16);
    }

    private static int FH(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private static InputStream Hw(File file) {
        return new FileInputStream(file);
    }

    static long J0(InputStream inputStream) {
        return (FH(inputStream) & 255) | 0 | ((FH(inputStream) & 255) << 8) | ((FH(inputStream) & 255) << 16) | ((FH(inputStream) & 255) << 24) | ((FH(inputStream) & 255) << 32) | ((FH(inputStream) & 255) << 40) | ((FH(inputStream) & 255) << 48) | ((255 & FH(inputStream)) << 56);
    }

    private static String J8(String str) {
        int length = str.length() / 2;
        String strValueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String strValueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    static void VH(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    private final File Ws(String str) {
        return new File(this.FH, J8(str));
    }

    static void Zo(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void gn(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        VH(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final synchronized void j6(String str) {
        boolean zDelete = Ws(str).delete();
        DW(str);
        if (!zDelete) {
            e4.j6("Could not delete cache entry for key=%s, filename=%s", str, J8(str));
        }
    }

    private static byte[] tp(vc vcVar, long j) throws IOException {
        long jJ6 = vcVar.j6();
        if (j >= 0 && j <= jJ6) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(vcVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(jJ6);
        throw new IOException(sb.toString());
    }

    private final void u7(String str, wb wbVar) {
        if (this.j6.containsKey(str)) {
            this.DW += wbVar.j6 - this.j6.get(str).j6;
        } else {
            this.DW += wbVar.j6;
        }
        this.j6.put(str, wbVar);
    }

    static String v5(vc vcVar) {
        return new String(tp(vcVar, J0(vcVar)), "UTF-8");
    }

    static List<yj0> we(vc vcVar) throws IOException {
        int iEQ = EQ(vcVar);
        if (iEQ < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(iEQ);
            throw new IOException(sb.toString());
        }
        List<yj0> listEmptyList = iEQ == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i = 0; i < iEQ; i++) {
            listEmptyList.add(new yj0(v5(vcVar).intern(), v5(vcVar).intern()));
        }
        return listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.to
    public final synchronized ab0 IS(String str) {
        wb wbVar = this.j6.get(str);
        if (wbVar == null) {
            return null;
        }
        File fileWs = Ws(str);
        try {
            vc vcVar = new vc(new BufferedInputStream(Hw(fileWs)), fileWs.length());
            try {
                wb wbVarDW = wb.DW(vcVar);
                if (!TextUtils.equals(str, wbVarDW.DW)) {
                    e4.j6("%s: key=%s, found=%s", fileWs.getAbsolutePath(), str, wbVarDW.DW);
                    DW(str);
                    return null;
                }
                byte[] bArrTp = tp(vcVar, vcVar.j6());
                ab0 ab0Var = new ab0();
                ab0Var.j6 = bArrTp;
                ab0Var.DW = wbVar.FH;
                ab0Var.FH = wbVar.Hw;
                ab0Var.Hw = wbVar.v5;
                ab0Var.v5 = wbVar.Zo;
                ab0Var.Zo = wbVar.VH;
                List<yj0> list = wbVar.gn;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (yj0 yj0Var : list) {
                    treeMap.put(yj0Var.j6(), yj0Var.DW());
                }
                ab0Var.VH = treeMap;
                ab0Var.gn = Collections.unmodifiableList(wbVar.gn);
                return ab0Var;
            } finally {
                vcVar.close();
            }
        } catch (IOException e) {
            e4.j6("%s: %s", fileWs.getAbsolutePath(), e.toString());
            j6(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.to
    public final synchronized void a5() {
        long length;
        vc vcVar;
        if (!this.FH.exists()) {
            if (!this.FH.mkdirs()) {
                e4.DW("Unable to create cache dir %s", this.FH.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = this.FH.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                length = file.length();
                vcVar = new vc(new BufferedInputStream(Hw(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                wb wbVarDW = wb.DW(vcVar);
                wbVarDW.j6 = length;
                u7(wbVarDW.DW, wbVarDW);
                vcVar.close();
            } catch (Throwable th) {
                vcVar.close();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.to
    public final synchronized void ys(String str, ab0 ab0Var) {
        long j;
        Iterator<Map.Entry<String, wb>> it;
        if (this.DW + ab0Var.j6.length >= this.Hw) {
            if (e4.DW) {
                e4.FH("Pruning old cache entries.", new Object[0]);
            }
            long j2 = this.DW;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, wb>> it2 = this.j6.entrySet().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    j = j2;
                    break;
                }
                wb value = it2.next().getValue();
                if (Ws(value.DW).delete()) {
                    j = j2;
                    it = it2;
                    this.DW -= value.j6;
                } else {
                    j = j2;
                    it = it2;
                    e4.j6("Could not delete cache entry for key=%s, filename=%s", value.DW, J8(value.DW));
                }
                it.remove();
                i++;
                if (this.DW + r6 < this.Hw * 0.9f) {
                    break;
                }
                j2 = j;
                it2 = it;
            }
            if (e4.DW) {
                e4.FH("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.DW - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        }
        File fileWs = Ws(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileWs));
            wb wbVar = new wb(str, ab0Var);
            if (!wbVar.j6(bufferedOutputStream)) {
                bufferedOutputStream.close();
                e4.j6("Failed to write header for %s", fileWs.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(ab0Var.j6);
            bufferedOutputStream.close();
            u7(str, wbVar);
        } catch (IOException unused) {
            if (fileWs.delete()) {
                return;
            }
            e4.j6("Could not clean up file %s", fileWs.getAbsolutePath());
        }
    }

    public eb(File file) {
        this(file, 5242880);
    }
}
