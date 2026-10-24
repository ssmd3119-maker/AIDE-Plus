package abcd;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class q60 {
    private static final String[] Hw = new String[0];
    private static final String v5 = new String();
    private final AtomicReference<c> DW;
    private final q60 FH;
    private final s50 j6;

    private static class a {
        String DW;
        String FH;
        String Hw;
        String Zo;
        String j6;
        String v5;

        private a() {
        }

        private static boolean DW(String str, String str2) {
            if (str == null && str2 == null) {
                return true;
            }
            if (str == null || str2 == null) {
                return false;
            }
            return str.equals(str2);
        }

        private static boolean j6(String str, String str2) {
            if (str == null && str2 == null) {
                return true;
            }
            if (str == null || str2 == null) {
                return false;
            }
            return ng0.j6(str, str2);
        }

        public a FH(String str) {
            a aVar = new a();
            aVar.j6 = this.j6;
            aVar.DW = this.DW;
            aVar.FH = this.FH;
            aVar.Hw = this.Hw;
            aVar.v5 = str;
            aVar.Zo = this.Zo;
            return aVar;
        }

        public boolean Hw(String str, String str2) {
            return j6(this.DW, str) && DW(this.FH, str2);
        }

        public String toString() {
            String str = this.DW;
            if (str == null) {
                return "<empty>";
            }
            StringBuilder sb = new StringBuilder(str);
            if (this.FH != null) {
                sb.append(".");
                sb.append(this.FH);
            }
            if (this.Hw != null) {
                sb.append(".");
                sb.append(this.Hw);
            }
            if (this.v5 != null) {
                sb.append("=");
                sb.append(this.v5);
            }
            return sb.toString();
        }

        public boolean v5(String str, String str2, String str3) {
            return j6(this.DW, str) && DW(this.FH, str2) && j6(this.Hw, str3);
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    public interface b<T> {
        T j6(q60 q60Var);
    }

    private static class c {
        final Map<Object, Object> DW = new ConcurrentHashMap(16, 0.75f, 1);
        final c FH;
        final List<a> j6;

        public c(List<a> list, c cVar) {
            this.j6 = list;
            this.FH = cVar;
        }
    }

    private static class d {
        private int DW;
        private final char[] j6;

        public d(String str) {
            this.j6 = str.toCharArray();
        }

        public void DW() {
            this.DW--;
        }

        public int j6() {
            try {
                char[] cArr = this.j6;
                int i = this.DW;
                this.DW = i + 1;
                return cArr[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                this.DW = this.j6.length;
                return -1;
            }
        }
    }

    public q60() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r1 = r7.j6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r1 < 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (61 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (59 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (35 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (10 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (32 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (9 != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        throw new abcd.h40(org.eclipse.jgit.JGitText.DW().badEntryDelimiter);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r7.DW();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        throw new abcd.h40(org.eclipse.jgit.JGitText.DW().unexpectedEndOfConfigFile);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String BT(abcd.q60.d r7) throws abcd.h40 {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            int r1 = r7.j6()
            if (r1 < 0) goto L83
            r2 = 61
            if (r2 != r1) goto L10
            goto L72
        L10:
            r3 = 10
            r4 = 9
            r5 = 32
            if (r5 == r1) goto L4a
            if (r4 != r1) goto L1b
            goto L4a
        L1b:
            char r2 = (char) r1
            boolean r4 = java.lang.Character.isLetterOrDigit(r2)
            if (r4 != 0) goto L46
            r4 = 45
            if (r1 != r4) goto L27
            goto L46
        L27:
            if (r3 != r1) goto L30
            r7.DW()
            r0.append(r2)
            goto L72
        L30:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r1 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r1 = r1.badEntryName
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = java.text.MessageFormat.format(r1, r2)
            r7.<init>(r0)
            throw r7
        L46:
            r0.append(r2)
            goto L5
        L4a:
            int r1 = r7.j6()
            if (r1 < 0) goto L77
            if (r2 != r1) goto L53
            goto L72
        L53:
            r6 = 59
            if (r6 == r1) goto L6f
            r6 = 35
            if (r6 == r1) goto L6f
            if (r3 != r1) goto L5e
            goto L6f
        L5e:
            if (r5 == r1) goto L4a
            if (r4 != r1) goto L63
            goto L4a
        L63:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r0 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r0 = r0.badEntryDelimiter
            r7.<init>(r0)
            throw r7
        L6f:
            r7.DW()
        L72:
            java.lang.String r7 = r0.toString()
            return r7
        L77:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r0 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r0 = r0.unexpectedEndOfConfigFile
            r7.<init>(r0)
            throw r7
        L83:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r0 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r0 = r0.unexpectedEndOfConfigFile
            r7.<init>(r0)
            goto L90
        L8f:
            throw r7
        L90:
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.q60.BT(abcd.q60$d):java.lang.String");
    }

    private c EQ() {
        q60 q60Var = this.FH;
        if (q60Var != null) {
            return q60Var.a8();
        }
        return null;
    }

    private static <T> T[] FH(T t) {
        try {
            return (T[]) ((Object[]) t.getClass().getMethod("values", new Class[0]).invoke(null, new Object[0]));
        } catch (Exception e) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().enumValuesNotAvailable, t.getClass().getName()), e);
        }
    }

    private String Mr(String str, String str2, String str3) {
        List<String> listU2 = U2(str, str2, str3);
        if (listU2 != null) {
            return listU2.get(0);
        }
        q60 q60Var = this.FH;
        if (q60Var != null) {
            return q60Var.Mr(str, str2, str3);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        r9.DW();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r0.length() <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return r0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String P8(abcd.q60.d r9, boolean r10, int r11) throws abcd.h40 {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L8:
            int r4 = r9.j6()
            if (r4 >= 0) goto L21
            int r9 = r0.length()
            if (r9 == 0) goto L15
            goto L50
        L15:
            abcd.h40 r9 = new abcd.h40
            org.eclipse.jgit.JGitText r10 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r10 = r10.unexpectedEndOfConfigFile
            r9.<init>(r10)
            throw r9
        L21:
            r5 = 10
            if (r5 != r4) goto L37
            if (r10 != 0) goto L2b
            r9.DW()
            goto L50
        L2b:
            abcd.h40 r9 = new abcd.h40
            org.eclipse.jgit.JGitText r10 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r10 = r10.newlineInQuotesNotAllowed
            r9.<init>(r10)
            throw r9
        L37:
            if (r11 != r4) goto L3a
            goto L50
        L3a:
            if (r10 != 0) goto L5d
            char r6 = (char) r4
            boolean r6 = java.lang.Character.isWhitespace(r6)
            if (r6 == 0) goto L45
            r3 = 1
            goto L8
        L45:
            r6 = 59
            if (r6 == r4) goto L4d
            r6 = 35
            if (r6 != r4) goto L5d
        L4d:
            r9.DW()
        L50:
            int r9 = r0.length()
            if (r9 <= 0) goto L5b
            java.lang.String r9 = r0.toString()
            goto L5c
        L5b:
            r9 = 0
        L5c:
            return r9
        L5d:
            if (r3 == 0) goto L6b
            int r3 = r0.length()
            if (r3 <= 0) goto L6a
            r3 = 32
            r0.append(r3)
        L6a:
            r3 = 0
        L6b:
            r6 = 34
            r7 = 92
            if (r7 != r4) goto Lcc
            int r4 = r9.j6()
            r8 = -1
            if (r4 == r8) goto Lc0
            if (r4 == r5) goto L8
            if (r4 == r6) goto Lbb
            if (r4 == r7) goto Lb6
            r6 = 98
            if (r4 == r6) goto Laf
            r6 = 110(0x6e, float:1.54E-43)
            if (r4 == r6) goto Laa
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L91
            r4 = 9
            r0.append(r4)
            goto L8
        L91:
            abcd.h40 r9 = new abcd.h40
            org.eclipse.jgit.JGitText r10 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r10 = r10.badEscape
            java.lang.Object[] r11 = new java.lang.Object[r1]
            char r0 = (char) r4
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r11[r2] = r0
            java.lang.String r10 = java.text.MessageFormat.format(r10, r11)
            r9.<init>(r10)
            throw r9
        Laa:
            r0.append(r5)
            goto L8
        Laf:
            r4 = 8
            r0.append(r4)
            goto L8
        Lb6:
            r0.append(r7)
            goto L8
        Lbb:
            r0.append(r6)
            goto L8
        Lc0:
            abcd.h40 r9 = new abcd.h40
            org.eclipse.jgit.JGitText r10 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r10 = r10.endOfFileInEscape
            r9.<init>(r10)
            throw r9
        Lcc:
            if (r6 != r4) goto Ld2
            r10 = r10 ^ 1
            goto L8
        Ld2:
            char r4 = (char) r4
            r0.append(r4)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.q60.P8(abcd.q60$d, boolean, int):java.lang.String");
    }

    private List<String> U2(String str, String str2, String str3) {
        List<String> listJ6 = null;
        for (a aVar : this.DW.get().j6) {
            if (aVar.v5(str, str2, str3)) {
                listJ6 = j6(listJ6, aVar.v5);
            }
        }
        return listJ6;
    }

    private static int VH(List<a> list, String str, String str2) {
        a aVar;
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).v5(str, str2, null)) {
                do {
                    i++;
                    if (i >= list.size()) {
                        break;
                    }
                    aVar = list.get(i);
                } while (aVar.v5(str, str2, aVar.Hw));
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String Zo(java.lang.String r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r9.length()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        Ld:
            int r5 = r9.length()
            r6 = 34
            if (r2 < r5) goto L1f
            if (r3 == 0) goto L1a
            r0.append(r6)
        L1a:
            java.lang.String r9 = r0.toString()
            return r9
        L1f:
            char r5 = r9.charAt(r2)
            r7 = 32
            r8 = 1
            if (r5 == r7) goto L6f
            r7 = 59
            if (r5 == r7) goto L65
            r7 = 92
            if (r5 == r7) goto L5f
            if (r5 == r6) goto L59
            r7 = 35
            if (r5 == r7) goto L65
            switch(r5) {
                case 8: goto L53;
                case 9: goto L4d;
                case 10: goto L3d;
                default: goto L39;
            }
        L39:
            r0.append(r5)
            goto L89
        L3d:
            if (r3 == 0) goto L43
            r0.append(r6)
            r3 = 0
        L43:
            java.lang.String r4 = "\\n\\\n"
            r0.append(r4)
            int r4 = r0.length()
            goto L89
        L4d:
            java.lang.String r5 = "\\t"
            r0.append(r5)
            goto L89
        L53:
            java.lang.String r5 = "\\b"
            r0.append(r5)
            goto L89
        L59:
            java.lang.String r5 = "\\\""
            r0.append(r5)
            goto L89
        L5f:
            java.lang.String r5 = "\\\\"
            r0.append(r5)
            goto L89
        L65:
            if (r3 != 0) goto L6b
            r0.insert(r4, r6)
            r3 = 1
        L6b:
            r0.append(r5)
            goto L89
        L6f:
            if (r3 != 0) goto L86
            int r5 = r0.length()
            if (r5 <= 0) goto L86
            int r5 = r0.length()
            int r5 = r5 - r8
            char r5 = r0.charAt(r5)
            if (r5 != r7) goto L86
            r0.insert(r4, r6)
            r3 = 1
        L86:
            r0.append(r7)
        L89:
            int r2 = r2 + 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.q60.Zo(java.lang.String):java.lang.String");
    }

    private c a8() {
        c cVar;
        c cVar2;
        do {
            cVar = this.DW.get();
            c cVarEQ = EQ();
            if (cVar.FH == cVarEQ) {
                return cVar;
            }
            cVar2 = new c(cVar.j6, cVarEQ);
        } while (!this.DW.compareAndSet(cVar, cVar2));
        return cVar2;
    }

    private c dx(c cVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(cVar.j6.size());
        boolean z = false;
        for (a aVar : cVar.j6) {
            if (aVar.Hw(str, str2)) {
                z = true;
            } else if (!z || aVar.DW != null || aVar.FH != null) {
                arrayList.add(aVar);
            }
        }
        return yS(arrayList);
    }

    private c ei(c cVar, String str, String str2, String str3, List<String> list) {
        List<a> listV5 = v5(cVar, list);
        int size = -1;
        int i = 0;
        int i2 = 0;
        while (i < listV5.size() && i2 < list.size()) {
            a aVar = listV5.get(i);
            if (aVar.v5(str, str2, str3)) {
                listV5.set(i, aVar.FH(list.get(i2)));
                i2++;
                size = i + 1;
            }
            i++;
        }
        if (i2 == list.size() && i < listV5.size()) {
            while (i < listV5.size()) {
                int i3 = i + 1;
                if (listV5.get(i).v5(str, str2, str3)) {
                    i = i3 - 1;
                    listV5.remove(i);
                } else {
                    i = i3;
                }
            }
        }
        if (i2 < list.size() && i == listV5.size()) {
            if (size < 0) {
                size = VH(listV5, str, str2);
            }
            a aVar2 = null;
            if (size < 0) {
                a aVar3 = new a(aVar2);
                aVar3.DW = str;
                aVar3.FH = str2;
                listV5.add(aVar3);
                size = listV5.size();
            }
            while (i2 < list.size()) {
                a aVar4 = new a(aVar2);
                aVar4.DW = str;
                aVar4.FH = str2;
                aVar4.Hw = str3;
                aVar4.v5 = list.get(i2);
                listV5.add(size, aVar4);
                size++;
                i2++;
            }
        }
        return yS(listV5);
    }

    private c er() {
        return new c(Collections.emptyList(), EQ());
    }

    private static List<String> j6(List<String> list, String str) {
        if (list == null) {
            return Collections.singletonList(str);
        }
        if (list.size() != 1) {
            list.add(str);
            return list;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(list.get(0));
        arrayList.add(str);
        return arrayList;
    }

    private static List<a> v5(c cVar, List<String> list) {
        ArrayList arrayList = new ArrayList(cVar.j6.size() + list.size() + 1);
        arrayList.addAll(cVar.j6);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r1 = r7.j6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r1 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (34 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r7.DW();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (32 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (9 != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        throw new abcd.h40(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.DW().badSectionEntry, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        throw new abcd.h40(org.eclipse.jgit.JGitText.DW().unexpectedEndOfConfigFile);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String vy(abcd.q60.d r7) throws abcd.h40 {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            int r1 = r7.j6()
            if (r1 < 0) goto L7d
            r2 = 93
            if (r2 != r1) goto L13
            r7.DW()
            goto L53
        L13:
            r2 = 0
            r3 = 1
            r4 = 9
            r5 = 32
            if (r5 == r1) goto L46
            if (r4 != r1) goto L1e
            goto L46
        L1e:
            char r4 = (char) r1
            boolean r5 = java.lang.Character.isLetterOrDigit(r4)
            if (r5 != 0) goto L42
            r5 = 46
            if (r5 == r1) goto L42
            r5 = 45
            if (r5 != r1) goto L2e
            goto L42
        L2e:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r1 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r1 = r1.badSectionEntry
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = java.text.MessageFormat.format(r1, r3)
            r7.<init>(r0)
            throw r7
        L42:
            r0.append(r4)
            goto L5
        L46:
            int r1 = r7.j6()
            if (r1 < 0) goto L71
            r6 = 34
            if (r6 != r1) goto L58
            r7.DW()
        L53:
            java.lang.String r7 = r0.toString()
            return r7
        L58:
            if (r5 == r1) goto L46
            if (r4 != r1) goto L5d
            goto L46
        L5d:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r1 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r1 = r1.badSectionEntry
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = java.text.MessageFormat.format(r1, r3)
            r7.<init>(r0)
            throw r7
        L71:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r0 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r0 = r0.unexpectedEndOfConfigFile
            r7.<init>(r0)
            throw r7
        L7d:
            abcd.h40 r7 = new abcd.h40
            org.eclipse.jgit.JGitText r0 = org.eclipse.jgit.JGitText.DW()
            java.lang.String r0 = r0.unexpectedEndOfConfigFile
            r7.<init>(r0)
            goto L8a
        L89:
            throw r7
        L8a:
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.q60.vy(abcd.q60$d):java.lang.String");
    }

    private c yS(List<a> list) {
        return new c(Collections.unmodifiableList(list), EQ());
    }

    public r50 DW(o50 o50Var) {
        return this.j6.DW(o50Var);
    }

    public void Hw() {
        this.DW.set(er());
    }

    public boolean J0(String str, String str2, boolean z) {
        return we(str, null, str2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Enum<?>> T J8(String str, String str2, String str3, T t) {
        return (T) Ws((Enum[]) FH(t), str, str2, str3, t);
    }

    public void KD(String str, String str2, String str3, long j) {
        String strValueOf;
        if (j >= 1073741824 && j % 1073741824 == 0) {
            strValueOf = String.valueOf(String.valueOf(j / 1073741824)) + " g";
        } else if (j >= 1048576 && j % 1048576 == 0) {
            strValueOf = String.valueOf(String.valueOf(j / 1048576)) + " m";
        } else if (j < 1024 || j % 1024 != 0) {
            strValueOf = String.valueOf(j);
        } else {
            strValueOf = String.valueOf(String.valueOf(j / 1024)) + " k";
        }
        ro(str, str2, str3, strValueOf);
    }

    public int QX(String str, String str2, int i) {
        return XL(str, null, str2, i);
    }

    public void SI(String str, String str2, String str3, int i) {
        KD(str, str2, str3, i);
    }

    public <T extends Enum<?>> T Ws(T[] tArr, String str, String str2, String str3, T t) {
        String strLg = lg(str, str2, str3);
        if (strLg == null) {
            return t;
        }
        String strReplace = strLg.replace(' ', '_');
        T t2 = null;
        T t3 = null;
        for (T t4 : tArr) {
            if (ng0.j6(t4.name(), strReplace)) {
                return t4;
            }
            if (ng0.j6(t4.name(), "TRUE")) {
                t2 = t4;
            } else if (ng0.j6(t4.name(), "FALSE")) {
                t3 = t4;
            }
        }
        if (t2 != null && t3 != null) {
            try {
                return ng0.v5(strReplace) ? t2 : t3;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str2 != null) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().enumValueNotSupported3, str, str3, strLg));
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().enumValueNotSupported2, str, str3, strLg));
    }

    public int XL(String str, String str2, String str3, int i) {
        long jJ3 = j3(str, str2, str3, i);
        if (-2147483648L > jJ3 || jJ3 > 2147483647L) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().integerValueOutOfRange, str, str3));
        }
        return (int) jJ3;
    }

    public long aM(String str, String str2, long j) {
        return j3(str, null, str2, j);
    }

    public void cb(String str, String str2, String str3) {
        cn(str, str2, str3, Collections.emptyList());
    }

    public void cn(String str, String str2, String str3, List<String> list) {
        c cVar;
        do {
            cVar = this.DW.get();
        } while (!this.DW.compareAndSet(cVar, ei(cVar, str, str2, str3, list)));
        if (gW()) {
            gn();
        }
    }

    public boolean gW() {
        return true;
    }

    public void gn() {
        this.j6.Hw(new n50());
    }

    public long j3(String str, String str2, String str3, long j) {
        String strLg = lg(str, str2, str3);
        if (strLg == null) {
            return j;
        }
        String strTrim = strLg.trim();
        if (strTrim.length() == 0) {
            return j;
        }
        char cVH = ng0.VH(strTrim.charAt(strTrim.length() - 1));
        long j2 = cVH != 'g' ? cVH != 'k' ? cVH != 'm' ? 1L : 1048576L : 1024L : 1073741824L;
        if (j2 > 1) {
            strTrim = strTrim.substring(0, strTrim.length() - 1).trim();
        }
        if (strTrim.length() == 0) {
            return j;
        }
        try {
            return j2 * Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidIntegerValue, str, str3, strLg));
        }
    }

    public String lg(String str, String str2, String str3) {
        return Mr(str, str2, str3);
    }

    public void nw(String str, String str2, String str3, boolean z) {
        ro(str, str2, str3, z ? "true" : "false");
    }

    public String[] rN(String str, String str2, String str3) {
        q60 q60Var = this.FH;
        String[] strArrRN = q60Var != null ? q60Var.rN(str, str2, str3) : Hw;
        List<String> listU2 = U2(str, str2, str3);
        if (listU2 == null) {
            return strArrRN;
        }
        String[] strArr = new String[strArrRN.length + listU2.size()];
        int length = strArrRN.length;
        System.arraycopy(strArrRN, 0, strArr, 0, length);
        Iterator<String> it = listU2.iterator();
        while (it.hasNext()) {
            strArr[length] = it.next();
            length++;
        }
        return strArr;
    }

    public void ro(String str, String str2, String str3, String str4) {
        cn(str, str2, str3, Collections.singletonList(str4));
    }

    public void sG(String str, String str2) {
        c cVar;
        do {
            cVar = this.DW.get();
        } while (!this.DW.compareAndSet(cVar, dx(cVar, str, str2)));
    }

    public String sh() {
        StringBuilder sb = new StringBuilder();
        for (a aVar : this.DW.get().j6) {
            String str = aVar.j6;
            if (str != null) {
                sb.append(str);
            }
            if (aVar.DW != null && aVar.Hw == null) {
                sb.append('[');
                sb.append(aVar.DW);
                if (aVar.FH != null) {
                    sb.append(' ');
                    String strZo = Zo(aVar.FH);
                    boolean z = strZo.startsWith("\"") && strZo.endsWith("\"");
                    if (!z) {
                        sb.append('\"');
                    }
                    sb.append(strZo);
                    if (!z) {
                        sb.append('\"');
                    }
                }
                sb.append(']');
            } else if (aVar.DW != null && aVar.Hw != null) {
                String str2 = aVar.j6;
                if (str2 == null || "".equals(str2)) {
                    sb.append('\t');
                }
                sb.append(aVar.Hw);
                if (v5 != aVar.v5) {
                    sb.append(" =");
                    if (aVar.v5 != null) {
                        sb.append(' ');
                        sb.append(Zo(aVar.v5));
                    }
                }
                if (aVar.Zo != null) {
                    sb.append(' ');
                }
            }
            String str3 = aVar.Zo;
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public <T> T tp(b<T> bVar) {
        c cVarA8 = a8();
        T t = (T) cVarA8.DW.get(bVar);
        if (t != null) {
            return t;
        }
        T tJ6 = bVar.j6(this);
        cVarA8.DW.put(bVar, tJ6);
        return tJ6;
    }

    public void u7(String str) throws h40 {
        ArrayList arrayList = new ArrayList();
        d dVar = new d(str);
        a aVar = null;
        a aVar2 = new a(aVar);
        a aVar3 = null;
        while (true) {
            int iJ6 = dVar.j6();
            if (-1 == iJ6) {
                this.DW.set(yS(arrayList));
                return;
            }
            char c2 = (char) iJ6;
            if ('\n' == c2) {
                arrayList.add(aVar2);
                if (aVar2.DW != null) {
                    aVar3 = aVar2;
                }
                aVar2 = new a(aVar);
            } else {
                String str2 = aVar2.Zo;
                if (str2 != null) {
                    aVar2.Zo = String.valueOf(str2) + c2;
                } else if (';' == c2 || '#' == c2) {
                    aVar2.Zo = String.valueOf(c2);
                } else if (aVar2.DW == null && Character.isWhitespace(c2)) {
                    if (aVar2.j6 == null) {
                        aVar2.j6 = "";
                    }
                    aVar2.j6 = String.valueOf(aVar2.j6) + c2;
                } else if ('[' == c2) {
                    aVar2.DW = vy(dVar);
                    int iJ62 = dVar.j6();
                    if (34 == iJ62) {
                        aVar2.FH = P8(dVar, true, 34);
                        iJ62 = dVar.j6();
                    }
                    if (93 != iJ62) {
                        throw new h40(JGitText.DW().badGroupHeader);
                    }
                    aVar2.Zo = "";
                } else {
                    if (aVar3 == null) {
                        throw new h40(JGitText.DW().invalidLineInConfigFile);
                    }
                    aVar2.DW = aVar3.DW;
                    aVar2.FH = aVar3.FH;
                    dVar.DW();
                    String strBT = BT(dVar);
                    aVar2.Hw = strBT;
                    if (strBT.endsWith("\n")) {
                        String str3 = aVar2.Hw;
                        aVar2.Hw = str3.substring(0, str3.length() - 1);
                        aVar2.v5 = v5;
                    } else {
                        aVar2.v5 = P8(dVar, false, -1);
                    }
                }
            }
        }
    }

    public boolean we(String str, String str2, String str3, boolean z) {
        String strMr = Mr(str, str2, str3);
        if (strMr == null) {
            return z;
        }
        if (v5 == strMr) {
            return true;
        }
        try {
            return ng0.v5(strMr);
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidBooleanValue, str, str3, strMr));
        }
    }

    public q60(q60 q60Var) {
        this.j6 = new s50();
        this.FH = q60Var;
        this.DW = new AtomicReference<>(er());
    }
}
