package abcd;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class a60 extends x50 {
    private static final Pattern v5 = Pattern.compile("([^-][-][^-]|\\[[.:=].*?[.:=]\\])");
    private final List<a> FH;
    private final boolean Hw;

    private interface a {
        boolean j6(char c);
    }

    private static final class b implements a {
        private final char DW;
        private final char j6;

        public b(char c, char c2) {
            this.j6 = c;
            this.DW = c2;
        }

        @Override // abcd.a60.a
        public final boolean j6(char c) {
            return this.j6 <= c && c <= this.DW;
        }
    }

    private static final class c implements a {
        static final c j6 = new c();

        private c() {
        }

        @Override // abcd.a60.a
        public final boolean j6(char c) {
            return Character.isDigit(c);
        }
    }

    private static final class d implements a {
        static final d j6 = new d();

        private d() {
        }

        @Override // abcd.a60.a
        public final boolean j6(char c) {
            return Character.isLetter(c);
        }
    }

    private static final class e implements a {
        static final e j6 = new e();

        private e() {
        }

        @Override // abcd.a60.a
        public final boolean j6(char c) {
            return Character.isLowerCase(c);
        }
    }

    private static final class f implements a {
        private char j6;

        public f(char c) {
            this.j6 = c;
        }

        @Override // abcd.a60.a
        public final boolean j6(char c) {
            return this.j6 == c;
        }
    }

    private static final class g implements a {
        private static String DW = "-!\"#$%&'()*+,./:;<=>?@[\\]_`{|}~";
        static final g j6 = new g();

        private g() {
        }

        @Override // abcd.a60.a
        public boolean j6(char c) {
            return DW.indexOf(c) != -1;
        }
    }

    private static final class h implements a {
        static final h j6 = new h();

        private h() {
        }

        @Override // abcd.a60.a
        public final boolean j6(char c) {
            return Character.isUpperCase(c);
        }
    }

    private static final class i implements a {
        static final i j6 = new i();

        private i() {
        }

        @Override // abcd.a60.a
        public final boolean j6(char c) {
            return Character.isWhitespace(c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(String str, String str2) throws m40 {
        super(false);
        this.FH = new ArrayList();
        boolean zStartsWith = str.startsWith("!");
        this.Hw = zStartsWith;
        str = zStartsWith ? str.substring(1) : str;
        Matcher matcher = v5.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(0);
            if (strGroup.length() == 3 && strGroup.charAt(1) == '-') {
                this.FH.add(new b(strGroup.charAt(0), strGroup.charAt(2)));
            } else if (strGroup.equals("[:alnum:]")) {
                this.FH.add(d.j6);
                this.FH.add(c.j6);
            } else if (strGroup.equals("[:alpha:]")) {
                this.FH.add(d.j6);
            } else if (strGroup.equals("[:blank:]")) {
                this.FH.add(new f(' '));
                this.FH.add(new f('\t'));
            } else if (strGroup.equals("[:cntrl:]")) {
                this.FH.add(new b((char) 0, (char) 31));
                this.FH.add(new f((char) 127));
            } else if (strGroup.equals("[:digit:]")) {
                this.FH.add(c.j6);
            } else if (strGroup.equals("[:graph:]")) {
                this.FH.add(new b('!', '~'));
                this.FH.add(d.j6);
                this.FH.add(c.j6);
            } else if (strGroup.equals("[:lower:]")) {
                this.FH.add(e.j6);
            } else if (strGroup.equals("[:print:]")) {
                this.FH.add(new b(' ', '~'));
                this.FH.add(d.j6);
                this.FH.add(c.j6);
            } else if (strGroup.equals("[:punct:]")) {
                this.FH.add(g.j6);
            } else if (strGroup.equals("[:space:]")) {
                this.FH.add(i.j6);
            } else if (strGroup.equals("[:upper:]")) {
                this.FH.add(h.j6);
            } else if (strGroup.equals("[:xdigit:]")) {
                this.FH.add(new b('0', '9'));
                this.FH.add(new b('a', 'f'));
                this.FH.add(new b('A', 'F'));
            } else {
                if (!strGroup.equals("[:word:]")) {
                    throw new m40(String.format(MessageFormat.format(JGitText.DW().characterClassIsNotSupported, strGroup), new Object[0]), str2);
                }
                this.FH.add(new f('_'));
                this.FH.add(d.j6);
                this.FH.add(c.j6);
            }
            str = matcher.replaceFirst("");
            matcher.reset(str);
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            this.FH.add(new f(str.charAt(i2)));
        }
    }

    @Override // abcd.x50
    public final boolean FH(char c2) {
        Iterator<a> it = this.FH.iterator();
        while (it.hasNext()) {
            if (it.next().j6(c2)) {
                return !this.Hw;
            }
        }
        return this.Hw;
    }
}
