package abcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class f60 {
    private final List<g60> j6;

    public enum a {
        NOT_IGNORED,
        IGNORED,
        CHECK_PARENT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public f60() {
        this.j6 = new ArrayList();
    }

    private static BufferedReader j6(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream, r60.Zo));
    }

    public List<g60> DW() {
        return Collections.unmodifiableList(this.j6);
    }

    public a FH(String str, boolean z) {
        g60 g60Var;
        if (this.j6.isEmpty()) {
            return a.CHECK_PARENT;
        }
        int size = this.j6.size();
        do {
            size--;
            if (size <= -1) {
                return a.CHECK_PARENT;
            }
            g60Var = this.j6.get(size);
        } while (!g60Var.FH(str, z));
        return g60Var.DW() ? a.IGNORED : a.NOT_IGNORED;
    }

    public void Hw(InputStream inputStream) throws IOException {
        BufferedReader bufferedReaderJ6 = j6(inputStream);
        while (true) {
            String line = bufferedReaderJ6.readLine();
            if (line == null) {
                return;
            }
            String strTrim = line.trim();
            if (strTrim.length() > 0 && !strTrim.startsWith("#")) {
                this.j6.add(new g60(strTrim));
            }
        }
    }

    public f60(List<g60> list) {
        this.j6 = list;
    }
}
