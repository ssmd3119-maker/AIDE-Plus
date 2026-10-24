package abcd;

import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class x50 implements b60 {
    private final boolean DW;
    private List<b60> j6 = null;

    public x50(boolean z) {
        this.DW = z;
    }

    public boolean DW() {
        return this.DW;
    }

    public abstract boolean FH(char c);

    public final void Hw(List<b60> list) {
        if (this.j6 != null) {
            throw new IllegalStateException(JGitText.DW().propertyIsAlreadyNonNull);
        }
        this.j6 = list;
    }

    @Override // abcd.b60
    public List<b60> j6(char c) {
        return FH(c) ? this.j6 : z50.Hw;
    }
}
