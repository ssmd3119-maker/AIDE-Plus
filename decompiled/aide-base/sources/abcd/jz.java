package abcd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class jz {
    public static void DW(String str, File file, long j) throws IOException {
        if (!yz.v5()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setIfModifiedSince(j);
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[655360];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, i);
                            }
                        }
                        fileOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            file.setLastModified(httpURLConnection.getLastModified());
                            b00.j6("Probes", "Probes download took " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                            j6(httpURLConnection);
                            return;
                        }
                        if (responseCode == 304) {
                            file.delete();
                            return;
                        }
                        b00.j6("Probes", "Probes download error - response: " + responseCode + " " + httpURLConnection.getResponseMessage());
                        j6(httpURLConnection);
                        file.delete();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                file.delete();
                b00.DW("Probes", "Probes download error", e);
            }
        } catch (MalformedURLException unused) {
        }
    }

    private static void j6(HttpURLConnection httpURLConnection) {
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                b00.j6("Probes", "H " + entry.getKey() + ": " + it.next());
            }
        }
    }
}
