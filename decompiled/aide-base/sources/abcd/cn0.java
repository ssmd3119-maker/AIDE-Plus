package abcd;

import java.io.OutputStream;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class cn0 {
    public static di0 DW(List list) {
        nh0 nh0Var = new nh0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nh0Var.j6((mh0) it.next());
        }
        return new qi0(nh0Var);
    }

    public static List FH(hq0 hq0Var) throws tm0 {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = hq0Var.j6(null).iterator();
            while (it.hasNext()) {
                arrayList.add(((om0) it.next()).DW());
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw new tm0("error processing certs", e);
        }
    }

    public static Provider Hw(String str) throws NoSuchProviderException {
        if (str == null) {
            return null;
        }
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return provider;
        }
        throw new NoSuchProviderException("provider " + str + " not found.");
    }

    public static OutputStream Zo(OutputStream outputStream, OutputStream outputStream2) {
        return outputStream == null ? v5(outputStream2) : outputStream2 == null ? v5(outputStream) : new nq0(outputStream, outputStream2);
    }

    public static OutputStream j6(Collection collection, OutputStream outputStream) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            outputStream = Zo(outputStream, ((gn0) it.next()).v5());
        }
        return outputStream;
    }

    public static OutputStream v5(OutputStream outputStream) {
        return outputStream == null ? new fn0() : outputStream;
    }
}
