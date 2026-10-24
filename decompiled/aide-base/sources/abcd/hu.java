package abcd;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class hu implements Serializable {
    public final String WB;
    public final String mb;

    public hu(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("'key' must be non-null");
        }
        if (str.contains("|")) {
            throw new IllegalArgumentException("'key' must not contain a \"|\" character: \"" + str + "\"");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("'secret' must be non-null");
        }
        this.WB = str;
        this.mb = str2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof hu) && j6((hu) obj);
    }

    public int hashCode() {
        return this.WB.hashCode() ^ (this.mb.hashCode() << 1);
    }

    public boolean j6(hu huVar) {
        return this.WB.equals(huVar.WB) && this.mb.equals(huVar.mb);
    }

    public String toString() {
        return "{key=\"" + this.WB + "\", secret=\"" + this.mb.charAt(0) + "...\"}";
    }
}
