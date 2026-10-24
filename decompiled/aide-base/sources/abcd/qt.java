package abcd;

import abcd.gu;
import abcd.rt;
import abcd.st;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;

/* loaded from: classes.dex */
public class qt<SESS_T extends gu> {
    public static final String DW = tt.j6();
    protected final SESS_T j6;

    public static class b implements Serializable {
        public final String WB;
        public final long mb;

        public b(Map<String, Object> map) {
            this.WB = (String) map.get("display_name");
            this.mb = qt.VH(map, "uid");
            Map map2 = (Map) map.get("quota_info");
            qt.VH(map2, "quota");
            qt.VH(map2, "normal");
            qt.VH(map2, "shared");
        }
    }

    protected static final class c implements h {
        private final gu DW;
        private final HttpUriRequest j6;

        public c(HttpUriRequest httpUriRequest, gu guVar) {
            this.j6 = httpUriRequest;
            this.DW = guVar;
        }

        @Override // abcd.qt.h
        public f j6() throws wt, yt {
            try {
                return new f((Map) st.v5(st.FH(this.DW, this.j6, 180000)));
            } catch (wt e) {
                if (this.j6.isAborted()) {
                    throw new yt(-1L);
                }
                throw e;
            }
        }
    }

    public static final class d {
        private f DW;
        private long j6;

        private static f DW(HttpResponse httpResponse) {
            Header firstHeader;
            Object objHw;
            if (httpResponse == null || (firstHeader = httpResponse.getFirstHeader("X-Dropbox-Metadata")) == null || (objHw = eh0.Hw(firstHeader.getValue())) == null) {
                return null;
            }
            return new f((Map) objHw);
        }

        private static long j6(HttpResponse httpResponse, f fVar) {
            long contentLength = httpResponse.getEntity().getContentLength();
            if (contentLength >= 0) {
                return contentLength;
            }
            if (fVar != null) {
                return fVar.j6;
            }
            return -1L;
        }

        private d(HttpResponse httpResponse) throws xt {
            String value;
            this.j6 = -1L;
            this.DW = null;
            f fVarDW = DW(httpResponse);
            this.DW = fVarDW;
            if (fVarDW == null) {
                throw new xt("Error parsing metadata.");
            }
            long jJ6 = j6(httpResponse, fVarDW);
            this.j6 = jJ6;
            if (jJ6 == -1) {
                throw new xt("Error determining file size.");
            }
            Header firstHeader = httpResponse.getFirstHeader("Content-Type");
            if (firstHeader == null || (value = firstHeader.getValue()) == null) {
                return;
            }
            String[] strArrSplit = value.split(";");
            if (strArrSplit.length > 0) {
                strArrSplit[0].trim();
            }
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("=");
                if (strArrSplit2.length > 1) {
                    strArrSplit2[1].trim();
                }
            }
        }
    }

    public static class e extends FilterInputStream {
        private final HttpUriRequest WB;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HttpUriRequest httpUriRequest, HttpResponse httpResponse) throws vt {
            super(null);
            HttpEntity entity = httpResponse.getEntity();
            if (entity == null) {
                throw new vt("Didn't get entity from HttpResponse");
            }
            try {
                ((FilterInputStream) this).in = entity.getContent();
                this.WB = httpUriRequest;
                new d(httpResponse);
            } catch (IOException e) {
                throw new wt(e);
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws UnsupportedOperationException {
            this.WB.abort();
        }
    }

    public static final class g {
        public final HttpResponse j6;

        public g(HttpUriRequest httpUriRequest, HttpResponse httpResponse) {
            this.j6 = httpResponse;
        }
    }

    public interface h {
        f j6();
    }

    public qt(SESS_T sess_t) {
        if (sess_t == null) {
            throw new IllegalArgumentException("Session must not be null.");
        }
        this.j6 = sess_t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [abcd.rt$a] */
    private h J8(String str, InputStream inputStream, long j, boolean z, String str2, rt rtVar) throws cu {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("path is null or empty.");
        }
        DW();
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        String str3 = "/files_put/" + this.j6.Zo() + str;
        if (str2 == null) {
            str2 = "";
        }
        HttpPut httpPut = new HttpPut(st.j6(this.j6.v5(), 1, str3, new String[]{"overwrite", String.valueOf(z), "parent_rev", str2, "locale", this.j6.u7().toString()}));
        this.j6.gn(httpPut);
        InputStreamEntity inputStreamEntity = new InputStreamEntity(inputStream, j);
        inputStreamEntity.setContentEncoding("application/octet-stream");
        inputStreamEntity.setChunked(false);
        if (rtVar != null) {
            inputStreamEntity = new rt.a(inputStreamEntity, rtVar);
        }
        httpPut.setEntity(inputStreamEntity);
        return new c(httpPut, this.j6);
    }

    public static long VH(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (obj instanceof String) {
                return Long.parseLong((String) obj, 16);
            }
        }
        return 0L;
    }

    public static boolean Zo(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public void DW() throws cu {
        if (!this.j6.FH()) {
            throw new cu();
        }
    }

    public f EQ(String str, InputStream inputStream, long j, rt rtVar) {
        return we(str, inputStream, j, rtVar).j6();
    }

    public f FH(String str) throws cu {
        DW();
        return new f((Map) st.Zo(st.a.POST, this.j6.VH(), "/fileops/create_folder", 1, new String[]{"root", this.j6.Zo().toString(), "path", str, "locale", this.j6.u7().toString()}, this.j6));
    }

    public void Hw(String str) throws cu {
        DW();
        st.Zo(st.a.POST, this.j6.VH(), "/fileops/delete", 1, new String[]{"root", this.j6.Zo().toString(), "path", str, "locale", this.j6.u7().toString()}, this.j6);
    }

    public h J0(String str, InputStream inputStream, long j, String str2, rt rtVar) {
        return J8(str, inputStream, j, false, str2, rtVar);
    }

    public SESS_T gn() {
        return this.j6;
    }

    public b j6() throws cu {
        DW();
        return new b((Map) st.Zo(st.a.GET, this.j6.VH(), "/account/info", 1, new String[]{"locale", this.j6.u7().toString()}, this.j6));
    }

    public f tp(String str, InputStream inputStream, long j, String str2, rt rtVar) {
        return J0(str, inputStream, j, str2, rtVar).j6();
    }

    public f u7(String str, int i, String str2, boolean z, String str3) throws cu {
        DW();
        if (i <= 0) {
            i = 25000;
        }
        return new f((Map) st.Zo(st.a.GET, this.j6.VH(), "/metadata/" + this.j6.Zo() + str, 1, new String[]{"file_limit", String.valueOf(i), "hash", str2, "list", String.valueOf(z), "rev", str3, "locale", this.j6.u7().toString()}, this.j6));
    }

    public e v5(String str, String str2) throws cu {
        DW();
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        HttpGet httpGet = new HttpGet(st.j6(this.j6.v5(), 1, "/files/" + this.j6.Zo() + str, new String[]{"rev", str2, "locale", this.j6.u7().toString()}));
        this.j6.gn(httpGet);
        return new e(httpGet, st.DW(this.j6, httpGet));
    }

    public h we(String str, InputStream inputStream, long j, rt rtVar) {
        return J8(str, inputStream, j, true, null, rtVar);
    }

    public static class f {
        public boolean DW;
        public String FH;
        public String Hw;
        public List<f> Zo;
        public long j6;
        public boolean v5;

        public f(Map<String, Object> map) {
            this.j6 = qt.VH(map, "bytes");
            this.DW = qt.Zo(map, "is_dir");
            this.FH = (String) map.get("path");
            this.Hw = (String) map.get("rev");
            qt.Zo(map, "thumb_exists");
            this.v5 = qt.Zo(map, "is_deleted");
            Object obj = map.get("contents");
            if (obj == null || !(obj instanceof bh0)) {
                this.Zo = null;
                return;
            }
            this.Zo = new ArrayList();
            Iterator it = ((bh0) obj).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map) {
                    this.Zo.add(new f((Map) next));
                }
            }
        }

        public String j6() {
            int iLastIndexOf = this.FH.lastIndexOf(47);
            String str = this.FH;
            return str.substring(iLastIndexOf + 1, str.length());
        }

        public f() {
        }
    }
}
