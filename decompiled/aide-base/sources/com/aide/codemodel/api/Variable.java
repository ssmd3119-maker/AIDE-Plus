package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;

@cy(clazz = 4224275656029071748L, container = 4224275656029071748L, user = true)
/* loaded from: classes.dex */
public class Variable {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 3713851901938575969L)
    private final int endColumn;

    @dy(field = 325330168378512384L)
    private final FileEntry fileEntry;

    @dy(field = 245918062396016769L)
    private final int identifier;

    @dy(field = -131334809796870672L)
    private final Language language;

    @dy(field = 333437733872415744L)
    private final int line;

    @dy(field = -2630605703639197800L)
    private final int startColumn;

    @dy(field = 345700282181564468L)
    private final Type type;

    static {
        iy.Zo(Variable.class);
    }

    @ey(method = 1374041756906774241L)
    public Variable(FileEntry fileEntry, Language language, int i, int i2, int i3, int i4, Type type) {
        try {
            if (gn) {
                iy.QX(-4734905015507374197L, null, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            this.fileEntry = fileEntry;
            this.language = language;
            this.line = i;
            this.startColumn = i2;
            this.endColumn = i3;
            this.identifier = i4;
            this.type = type;
        } catch (Throwable th) {
            if (u7) {
                iy.rN(th, -4734905015507374197L, null, new Object[]{fileEntry, language, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            throw th;
        }
    }

    @ey(method = -4548539866166877336L)
    public int getEndColumn() {
        try {
            if (gn) {
                iy.gn(-2608437766188686040L, this);
            }
            return this.endColumn;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -2608437766188686040L, this);
            }
            throw th;
        }
    }

    @ey(method = 3588100951411168101L)
    public FileEntry getFile() {
        try {
            if (gn) {
                iy.gn(1275283670022615469L, this);
            }
            return this.fileEntry;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1275283670022615469L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    @ey(method = 4818127582910011145L)
    public String getHTMLString() {
        long hTMLString = -863417904741332815;
        try {
            if (gn) {
                iy.gn(-863417904741332815L, this);
            }
            if (this.language.getCodeRenderer() == null) {
                return "";
            }
            hTMLString = this.language.getCodeRenderer().getHTMLString(this);
            return hTMLString;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, hTMLString, this);
            }
            throw th;
        }
    }

    @ey(method = -3254314994157649252L)
    public int getIdentifier() {
        try {
            if (gn) {
                iy.gn(2026658175971622732L, this);
            }
            return this.identifier;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 2026658175971622732L, this);
            }
            throw th;
        }
    }

    @ey(method = -2705488640932267491L)
    public Language getLanguage() {
        try {
            if (gn) {
                iy.gn(-2864716779948748475L, this);
            }
            return this.language;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -2864716779948748475L, this);
            }
            throw th;
        }
    }

    @ey(method = 3601594852444333045L)
    public int getLine() {
        try {
            if (gn) {
                iy.gn(1285085204692459005L, this);
            }
            return this.line;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1285085204692459005L, this);
            }
            throw th;
        }
    }

    @ey(method = 1635588195752774241L)
    public int getStartColumn() {
        try {
            if (gn) {
                iy.gn(1948143786988948569L, this);
            }
            return this.startColumn;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1948143786988948569L, this);
            }
            throw th;
        }
    }

    @ey(method = 3626746040327355709L)
    public Type getType() {
        try {
            if (gn) {
                iy.gn(1301566558926955893L, this);
            }
            return this.type;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1301566558926955893L, this);
            }
            throw th;
        }
    }
}
