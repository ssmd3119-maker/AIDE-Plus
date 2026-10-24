package abcd;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class us extends RuntimeException {
    private StringBuffer WB;

    public us(String str) {
        this(str, null);
    }

    public static us DW(Throwable th, String str) {
        us usVar = th instanceof us ? (us) th : new us(th);
        usVar.j6(str);
        return usVar;
    }

    public void j6(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        this.WB.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        this.WB.append('\n');
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.WB);
    }

    public us(Throwable th) {
        this(null, th);
    }

    public us(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : null : str, th);
        if (th instanceof us) {
            String string = ((us) th).WB.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.WB = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.WB = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.WB);
    }
}
