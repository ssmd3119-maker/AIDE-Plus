package abcd;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b80 {
    private static String FH(List<String> list, String str, String str2) {
        if (list.size() == 1) {
            return String.valueOf(str) + " " + list.get(0);
        }
        return String.valueOf(str2) + " " + ng0.Hw(list, ", ", " and ");
    }

    public String DW(String str, List<String> list) {
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("\n")) {
            sb.append("\n");
        }
        sb.append("\n");
        sb.append("Conflicts:\n");
        for (String str2 : list) {
            sb.append('\t');
            sb.append(str2);
            sb.append('\n');
        }
        return sb.toString();
    }

    public String j6(List<k70> list, k70 k70Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("Merge ");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (k70 k70Var2 : list) {
            if (k70Var2.getName().startsWith("refs/heads/")) {
                arrayList.add("'" + p70.sG(k70Var2.getName()) + "'");
            } else if (k70Var2.getName().startsWith("refs/remotes/")) {
                arrayList2.add("'" + p70.sG(k70Var2.getName()) + "'");
            } else if (k70Var2.getName().startsWith("refs/tags/")) {
                arrayList3.add("'" + p70.sG(k70Var2.getName()) + "'");
            } else if (k70Var2.getName().equals(k70Var2.DW().yS())) {
                arrayList4.add("'" + k70Var2.getName() + "'");
            } else {
                arrayList5.add(k70Var2.getName());
            }
        }
        ArrayList arrayList6 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList6.add(FH(arrayList, "branch", "branches"));
        }
        if (!arrayList2.isEmpty()) {
            arrayList6.add(FH(arrayList2, "remote-tracking branch", "remote-tracking branches"));
        }
        if (!arrayList3.isEmpty()) {
            arrayList6.add(FH(arrayList3, "tag", "tags"));
        }
        if (!arrayList4.isEmpty()) {
            arrayList6.add(FH(arrayList4, "commit", "commits"));
        }
        if (!arrayList5.isEmpty()) {
            arrayList6.add(ng0.Hw(arrayList5, ", ", " and "));
        }
        sb.append(ng0.FH(arrayList6, ", "));
        String name = k70Var.v5().getName();
        if (!name.equals("refs/heads/master")) {
            sb.append(" into " + p70.sG(name));
        }
        return sb.toString();
    }
}
