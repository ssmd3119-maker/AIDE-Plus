package abcd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class g40 extends Exception {
    public g40(Collection<Throwable> collection) {
        super(j6(collection));
        Collections.unmodifiableList(new ArrayList(collection));
    }

    private static String j6(Collection<Throwable> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append(JGitText.DW().failureDueToOneOfTheFollowing);
        for (Throwable th : collection) {
            sb.append("  ");
            sb.append(th.getMessage());
            sb.append("\n");
        }
        return sb.toString();
    }
}
