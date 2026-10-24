package abcd;

import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@cy(clazz = 764732373277793165L, container = 764732373277793165L, user = true)
/* loaded from: classes.dex */
public class l1 {

    @gy
    private static /* synthetic */ boolean EQ;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = -2557597664009541712L)
    public boolean DW;

    @dy(field = 1626137025133199845L)
    public boolean FH;

    @dy(field = -1682940598913835755L)
    public boolean Hw;

    @dy(field = 3072130685022865851L)
    public int VH;

    @dy(field = 5028169080637948960L)
    public boolean Zo;

    @dy(field = 3235362512588295840L)
    public Map<String, Integer> gn;

    @dy(field = -3303695336006163519L)
    public String j6;

    @dy(field = 797440187277045520L)
    public Map<String, Set<? extends FormatOption>> u7;

    @dy(field = 6640866119211486591L)
    public int v5;

    static {
        iy.Zo(l1.class);
    }

    @ey(method = -1601260342112075568L)
    public l1() {
        try {
            if (tp) {
                iy.gn(1605090818776752120L, null);
            }
            this.gn = new HashMap();
            this.u7 = new HashMap();
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1605090818776752120L, null);
            }
            throw th;
        }
    }

    @ey(method = -586525334559356631L)
    public int DW(Language language) {
        try {
            if (tp) {
                iy.tp(-6722079086152351488L, this, language);
            }
            if (this.gn.containsKey(language.getName())) {
                return this.gn.get(language.getName()).intValue();
            }
            return 4;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, -6722079086152351488L, this, language);
            }
            throw th;
        }
    }

    @ey(method = -502760132302945864L)
    public Set<? extends FormatOption> j6(Language language) {
        try {
            if (tp) {
                iy.tp(414314539544980107L, this, language);
            }
            if (this.u7.containsKey(language.getName())) {
                return this.u7.get(language.getName());
            }
            Set<? extends FormatOption> formatOptionSet = language.getFormatOptionSet();
            return formatOptionSet == null ? Collections.EMPTY_SET : formatOptionSet;
        } catch (Throwable th) {
            if (EQ) {
                iy.j3(th, 414314539544980107L, this, language);
            }
            throw th;
        }
    }
}
