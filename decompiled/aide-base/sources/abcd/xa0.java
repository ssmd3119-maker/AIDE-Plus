package abcd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class xa0 implements Iterable<b> {
    protected byte[] WB;

    abstract class a implements Iterator<b> {
        protected final b WB = j6();
        protected long mb = 0;

        public a() {
        }

        @Override // java.util.Iterator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public abstract b next();

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mb < xa0.this.Hw();
        }

        public abstract b j6();

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class b {
        long j6;

        public long j6() {
            return this.j6;
        }
    }

    public static xa0 QX(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                return aM(fileInputStream);
            } catch (IOException e) {
                IOException iOException = new IOException(MessageFormat.format(JGitText.DW().unreadablePackIndex, file.getAbsolutePath()));
                iOException.initCause(e);
                throw iOException;
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static boolean Ws(byte[] bArr) {
        byte[] bArr2 = ab0.v5;
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static xa0 aM(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        eg0.DW(inputStream, bArr, 0, 8);
        if (!Ws(bArr)) {
            return new ya0(inputStream, bArr);
        }
        int iDW = ig0.DW(bArr, 4);
        if (iDW == 2) {
            return new za0(inputStream);
        }
        throw new IOException(MessageFormat.format(JGitText.DW().unsupportedPackIndexVersion, Integer.valueOf(iDW)));
    }

    public abstract long DW(j60 j60Var);

    public abstract boolean EQ();

    public abstract long Hw();

    public boolean J8(j60 j60Var) {
        return DW(j60Var) != -1;
    }

    public abstract a70 VH(long j);

    public abstract long gn();

    @Override // java.lang.Iterable
    public abstract Iterator<b> iterator();

    public abstract void j3(Set<a70> set, h60 h60Var, int i);

    public abstract long j6(j60 j60Var);

    public final a70 v5(int i) {
        if (i >= 0) {
            return VH(i);
        }
        return VH(((i >>> 1) << 1) | (i & 1));
    }
}
