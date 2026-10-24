package abcd;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class nc0 implements tc0 {
    private boolean DW;
    private Writer FH;
    private Map<String, k70> j6 = Collections.emptyMap();

    @Override // abcd.tc0
    public final k70 DW(String str) {
        return this.j6.get(str);
    }

    public void EQ(Map<String, k70> map) {
        this.j6 = Collections.unmodifiableMap(map);
    }

    @Override // abcd.tc0
    public String Hw() {
        Writer writer = this.FH;
        return writer != null ? writer.toString() : "";
    }

    public void J0() throws j50 {
        if (this.DW) {
            throw new j50(JGitText.DW().onlyOneOperationCallPerConnectionIsSupported);
        }
        this.DW = true;
    }

    public void J8(Writer writer) {
        if (this.FH != null) {
            throw new IllegalStateException(JGitText.DW().writerAlreadyInitialized);
        }
        this.FH = writer;
    }

    @Override // abcd.tc0
    public final Collection<k70> Zo() {
        return this.j6.values();
    }

    @Override // abcd.tc0
    public Map<String, k70> u7() {
        return this.j6;
    }

    public Writer we() {
        if (this.FH == null) {
            J8(new StringWriter());
        }
        return this.FH;
    }
}
