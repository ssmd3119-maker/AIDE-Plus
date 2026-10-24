package abcd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class z50 {
    static final List<b60> Hw = Collections.emptyList();
    private static final Pattern v5 = Pattern.compile("\\[[.:=]");
    private List<b60> DW;
    private List<b60> FH;
    private List<b60> j6;

    private z50(List<b60> list) {
        this(list, list);
    }

    private static List<b60> DW(String str, Character ch) throws r40 {
        List<x50> listGn = gn(str, ch);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(c60.j6);
        for (int size = listGn.size() - 1; size >= 0; size--) {
            x50 x50Var = listGn.get(size);
            if (x50Var.DW()) {
                arrayList.add(x50Var);
                x50Var.Hw(arrayList);
            } else {
                x50Var.Hw(arrayList);
                arrayList = new ArrayList(2);
                arrayList.add(x50Var);
            }
        }
        return arrayList;
    }

    private static List<x50> FH(String str, Character ch) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '*') {
                arrayList.add(Hw(ch, true));
            } else if (cCharAt != '?') {
                arrayList.add(new y50(cCharAt));
            } else {
                arrayList.add(Hw(ch, false));
            }
        }
        return arrayList;
    }

    private static x50 Hw(Character ch, boolean z) {
        return ch != null ? new d60(ch.charValue(), z) : new e60(z);
    }

    private static int Zo(int i, String str) throws r40 {
        int i2 = i + 1;
        int i3 = i + 2;
        if (i2 >= str.length()) {
            throw new r40(i, "[", "]", str);
        }
        if (str.charAt(i2) == '!') {
            i2++;
            i3++;
        }
        Matcher matcher = v5.matcher(str);
        int i4 = -1;
        while (i4 == -1) {
            int iIndexOf = str.indexOf(93, i3);
            if (iIndexOf == -1) {
                throw new r40(i, "[", "]", str);
            }
            if (!matcher.find(i2) || matcher.start() >= iIndexOf) {
                i4 = iIndexOf;
            } else {
                String strGroup = matcher.group(0);
                String str2 = String.valueOf(strGroup.charAt(1)) + "]";
                int iStart = matcher.start();
                int iIndexOf2 = str.indexOf(str2, iStart + 2);
                if (iIndexOf2 == -1) {
                    throw new r40(iStart, strGroup, str2, str);
                }
                i3 = iIndexOf2 + 2;
                i2 = i3;
            }
        }
        return i4;
    }

    private static List<x50> gn(String str, Character ch) throws r40 {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf(91, length);
            if (iIndexOf == -1) {
                arrayList.addAll(FH(str.substring(length), ch));
                length = str.length();
            } else {
                arrayList.addAll(FH(str.substring(length, iIndexOf), ch));
                int iZo = Zo(iIndexOf, str);
                arrayList.add(new a60(str.substring(iIndexOf + 1, iZo), str));
                length = iZo + 1;
            }
        }
        return arrayList;
    }

    private void v5(char c) {
        List<b60> list = this.FH;
        list.clear();
        List<b60> list2 = null;
        for (int i = 0; i < this.DW.size(); i++) {
            List<b60> listJ6 = this.DW.get(i).j6(c);
            if (listJ6 != list2) {
                list.addAll(listJ6);
                list2 = listJ6;
            }
        }
        this.FH = this.DW;
        this.DW = list;
    }

    public boolean VH() {
        List<b60> list = this.DW;
        ListIterator<b60> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == c60.j6) {
                return true;
            }
        }
        return false;
    }

    public void j6(String str) {
        for (int i = 0; i < str.length(); i++) {
            v5(str.charAt(i));
        }
    }

    public void u7() {
        this.DW.clear();
        this.DW.addAll(this.j6);
    }

    private z50(List<b60> list, List<b60> list2) {
        this.j6 = list;
        ArrayList arrayList = new ArrayList(list2.size());
        this.DW = arrayList;
        arrayList.addAll(list2);
        this.FH = new ArrayList(list2.size());
    }

    public z50(String str, Character ch) {
        this(DW(str, ch));
    }
}
