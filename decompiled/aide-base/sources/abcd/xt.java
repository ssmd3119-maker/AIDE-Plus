package abcd;

import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class xt extends vt {
    public xt(BufferedReader bufferedReader) {
        super("failed to parse: " + j6(bufferedReader));
    }

    public static String j6(BufferedReader bufferedReader) throws IOException {
        if (bufferedReader != null) {
            try {
                bufferedReader.reset();
            } catch (IOException unused) {
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                stringBuffer.append(line);
            } catch (IOException unused2) {
            }
        }
        return stringBuffer.toString();
    }

    public xt(String str) {
        super(str);
    }
}
