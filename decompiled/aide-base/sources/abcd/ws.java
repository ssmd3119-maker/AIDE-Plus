package abcd;

import java.util.Arrays;

/* loaded from: classes.dex */
public class ws extends gt implements kt {
    private Object[] mb;

    public ws(int i) {
        super(i != 0);
        try {
            this.mb = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    private Object cn(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    private String dx(String str, String str2, String str3, boolean z) {
        int length = this.mb.length;
        StringBuffer stringBuffer = new StringBuffer((length * 10) + 10);
        if (str != null) {
            stringBuffer.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0 && str2 != null) {
                stringBuffer.append(str2);
            }
            if (z) {
                stringBuffer.append(((kt) this.mb[i]).Zo());
            } else {
                stringBuffer.append(this.mb[i]);
            }
        }
        if (str3 != null) {
            stringBuffer.append(str3);
        }
        return stringBuffer.toString();
    }

    public final Object BT(int i) {
        try {
            Object obj = this.mb[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            cn(i);
            throw null;
        }
    }

    public final void KD(int i, Object obj) {
        a8();
        try {
            this.mb[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            cn(i);
            throw null;
        }
    }

    public String Zo() {
        String name = getClass().getName();
        return dx(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", true);
    }

    public String cb(String str, String str2, String str3) {
        return dx(str, str2, str3, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.mb, ((ws) obj).mb);
    }

    public int hashCode() {
        return Arrays.hashCode(this.mb);
    }

    public void ro() {
        int length = this.mb.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.mb[i2] != null) {
                i++;
            }
        }
        if (length == i) {
            return;
        }
        a8();
        Object[] objArr = new Object[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = this.mb[i4];
            if (obj != null) {
                objArr[i3] = obj;
                i3++;
            }
        }
        this.mb = objArr;
        if (i == 0) {
            Mr();
        }
    }

    public String sh(String str, String str2, String str3) {
        return dx(str, str2, str3, true);
    }

    public final int size() {
        return this.mb.length;
    }

    public String toString() {
        String name = getClass().getName();
        return dx(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", false);
    }

    public final Object vy(int i) {
        return this.mb[i];
    }
}
