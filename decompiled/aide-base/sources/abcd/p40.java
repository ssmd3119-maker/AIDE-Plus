package abcd;

import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class p40 extends j50 {
    public p40(ue0 ue0Var, Map<a70, String> map) {
        super(ue0Var, j6(map));
    }

    private static String j6(Map<a70, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(JGitText.DW().missingPrerequisiteCommits);
        for (Map.Entry<a70, String> entry : map.entrySet()) {
            sb.append("\n  ");
            sb.append(entry.getKey().BT());
            if (entry.getValue() != null) {
                sb.append(" ");
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }
}
