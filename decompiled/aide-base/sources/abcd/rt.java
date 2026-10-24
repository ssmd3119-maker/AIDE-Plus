package abcd;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* loaded from: classes.dex */
public abstract class rt {
    public abstract long DW();

    public abstract void j6(long j, long j2);

    public static class a extends HttpEntityWrapper {
        private final rt WB;
        private final long mb;

        public a(HttpEntity httpEntity, rt rtVar) {
            super(httpEntity);
            if (rtVar == null) {
                throw new IllegalArgumentException("'listener' is null");
            }
            this.WB = rtVar;
            this.mb = httpEntity.getContentLength();
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public void writeTo(OutputStream outputStream) throws IOException {
            ((HttpEntityWrapper) this).wrappedEntity.writeTo(new C0011a(outputStream));
        }

        /* renamed from: abcd.rt$a$a, reason: collision with other inner class name */
        private class C0011a extends FilterOutputStream {
            private long WB;
            private long jw;
            private long mb;

            public C0011a(OutputStream outputStream) {
                super(outputStream);
                this.WB = 0L;
                this.mb = 0L;
                this.jw = 0L;
                this.mb = a.this.WB.DW();
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                this.jw += i2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.WB > this.mb) {
                    this.WB = jCurrentTimeMillis;
                    a.this.WB.j6(this.jw, a.this.mb);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) throws IOException {
                super.write(i);
                this.jw++;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.WB > this.mb) {
                    this.WB = jCurrentTimeMillis;
                    a.this.WB.j6(this.jw, a.this.mb);
                }
            }
        }
    }
}
