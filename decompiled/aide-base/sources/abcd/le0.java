package abcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class le0 {
    private static final List<WeakReference<se0>> QX = new CopyOnWriteArrayList();
    private static /* synthetic */ int[] XL;
    protected final ue0 DW;
    private boolean EQ;
    private int J0;
    private ec0 J8;
    private vc0 Ws;
    protected final p70 j6;
    private boolean tp;
    private boolean we;
    private String FH = "git-upload-pack";
    private List<yd0> Hw = Collections.emptyList();
    private he0 v5 = he0.NO_TAGS;
    private boolean Zo = true;
    private String VH = "git-receive-pack";
    private List<yd0> gn = Collections.emptyList();
    private boolean u7 = false;

    public enum a {
        FETCH,
        PUSH;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    static {
        ro(re0.j3);
        ro(ne0.j3);
        ro(me0.U2);
        ro(oe0.aM);
        ro(te0.Mr);
        ro(qe0.yS);
        ro(qe0.er);
        ro(pe0.Mr);
        cn();
        new yd0("refs/tags/*:refs/tags/*");
        new yd0("refs/heads/*:refs/heads/*");
    }

    public le0(p70 p70Var, ue0 ue0Var) {
        ke0 ke0Var = (ke0) p70Var.gn().tp(ke0.DW);
        this.j6 = p70Var;
        this.DW = ue0Var;
        this.EQ = ke0Var.j6();
        this.Ws = vc0.FH();
    }

    public static le0 BT(p70 p70Var, zd0 zd0Var, a aVar) throws u40 {
        List<ue0> listJ3 = j3(zd0Var, aVar);
        if (listJ3.isEmpty()) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().remoteConfigHasNoURIAssociated, zd0Var.Hw()));
        }
        le0 le0VarVy = vy(p70Var, listJ3.get(0), zd0Var.Hw());
        le0VarVy.DW(zd0Var);
        return le0VarVy;
    }

    private static Enumeration<URL> FH(ClassLoader classLoader) {
        try {
            return classLoader.getResources("META-INF/services/" + le0.class.getName());
        } catch (IOException unused) {
            return new Vector().elements();
        }
    }

    public static List<le0> P8(p70 p70Var, String str, a aVar) {
        zd0 zd0Var = new zd0(p70Var.gn(), str);
        if (!v5(zd0Var)) {
            return ei(p70Var, zd0Var, aVar);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(vy(p70Var, new ue0(str), null));
        return arrayList;
    }

    public static List<se0> XL() {
        ArrayList arrayList = new ArrayList(QX.size());
        for (WeakReference<se0> weakReference : QX) {
            se0 se0Var = weakReference.get();
            if (se0Var != null) {
                arrayList.add(se0Var);
            } else {
                QX.remove(weakReference);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static Collection<yd0> Zo(p70 p70Var, Collection<yd0> collection) {
        Map<String, k70> mapVH = p70Var.VH();
        HashSet hashSet = new HashSet();
        for (yd0 yd0Var : collection) {
            if (yd0Var.tp()) {
                for (k70 k70Var : mapVH.values()) {
                    if (yd0Var.Ws(k70Var)) {
                        hashSet.add(yd0Var.v5(k70Var));
                    }
                }
            } else {
                hashSet.add(yd0Var);
            }
        }
        return hashSet;
    }

    private static void cn() throws IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = le0.class.getClassLoader();
        }
        Enumeration<URL> enumerationFH = FH(contextClassLoader);
        while (enumerationFH.hasMoreElements()) {
            sh(contextClassLoader, enumerationFH.nextElement());
        }
    }

    public static List<le0> ei(p70 p70Var, zd0 zd0Var, a aVar) throws u40 {
        List<ue0> listJ3 = j3(zd0Var, aVar);
        ArrayList arrayList = new ArrayList(listJ3.size());
        Iterator<ue0> it = listJ3.iterator();
        while (it.hasNext()) {
            le0 le0VarVy = vy(p70Var, it.next(), zd0Var.Hw());
            le0VarVy.DW(zd0Var);
            arrayList.add(le0VarVy);
        }
        return arrayList;
    }

    private static void er(ClassLoader classLoader, String str) {
        try {
            for (Field field : Class.forName(str, false, classLoader).getDeclaredFields()) {
                if ((field.getModifiers() & 8) == 8 && se0.class.isAssignableFrom(field.getType())) {
                    try {
                        se0 se0Var = (se0) field.get(null);
                        if (se0Var != null) {
                            ro(se0Var);
                        }
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                    }
                }
            }
        } catch (ClassNotFoundException unused2) {
        }
    }

    public static le0 gW(p70 p70Var, String str, a aVar) {
        zd0 zd0Var = new zd0(p70Var.gn(), str);
        return v5(zd0Var) ? vy(p70Var, new ue0(str), null) : BT(p70Var, zd0Var, aVar);
    }

    private static List<ue0> j3(zd0 zd0Var, a aVar) {
        int i = j6()[aVar.ordinal()];
        if (i == 1) {
            return zd0Var.tp();
        }
        if (i != 2) {
            throw new IllegalArgumentException(aVar.toString());
        }
        List<ue0> listZo = zd0Var.Zo();
        return listZo.isEmpty() ? zd0Var.tp() : listZo;
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = XL;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[a.valuesCustom().length];
        try {
            iArr2[a.FETCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[a.PUSH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        XL = iArr2;
        return iArr2;
    }

    public static void ro(se0 se0Var) {
        QX.add(0, new WeakReference<>(se0Var));
    }

    private static void sh(ClassLoader classLoader, URL url) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else if (line.length() > 0 && !line.startsWith("#")) {
                        er(classLoader, line);
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
            bufferedReader.close();
        } catch (IOException unused3) {
        }
    }

    private static String tp(String str, Collection<yd0> collection) {
        for (yd0 yd0Var : collection) {
            if (yd0Var.J8(str)) {
                return yd0Var.tp() ? yd0Var.Hw(str).VH() : yd0Var.VH();
            }
        }
        return null;
    }

    public static Collection<ae0> u7(p70 p70Var, Collection<yd0> collection, Collection<yd0> collection2) {
        if (collection2 == null) {
            collection2 = Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (yd0 yd0Var : Zo(p70Var, collection)) {
            String strGn = yd0Var.gn();
            k70 k70VarJ8 = p70Var.J8(strGn);
            if (k70VarJ8 != null) {
                strGn = k70VarJ8.getName();
            }
            String str = strGn;
            String strVH = yd0Var.VH();
            if (strVH == null) {
                strVH = str;
            }
            if (k70VarJ8 != null && !strVH.startsWith("refs/")) {
                String name = k70VarJ8.getName();
                strVH = String.valueOf(name.substring(0, name.indexOf(47, 5) + 1)) + strVH;
            }
            String str2 = strVH;
            linkedList.add(new ae0(p70Var, str, str2, yd0Var.u7(), tp(str2, collection2), null));
        }
        return linkedList;
    }

    private static boolean v5(zd0 zd0Var) {
        return zd0Var.tp().isEmpty() && zd0Var.Zo().isEmpty();
    }

    public static le0 vy(p70 p70Var, ue0 ue0Var, String str) throws u40 {
        for (WeakReference<se0> weakReference : QX) {
            se0 se0Var = weakReference.get();
            if (se0Var == null) {
                QX.remove(weakReference);
            } else if (se0Var.FH(ue0Var, p70Var, str)) {
                return se0Var.gn(ue0Var, p70Var, str);
            }
        }
        throw new u40(MessageFormat.format(JGitText.DW().URINotSupported, ue0Var));
    }

    public static le0 yS(p70 p70Var, String str) {
        return gW(p70Var, str, a.FETCH);
    }

    public void DW(zd0 zd0Var) {
        vJ(zd0Var.EQ());
        Sf(zd0Var.VH());
        I(zd0Var.gn());
        this.Hw = zd0Var.FH();
        this.gn = zd0Var.v5();
        this.J0 = zd0Var.u7();
    }

    public vc0 EQ() {
        return this.Ws;
    }

    public abstract void Hw();

    public void I(he0 he0Var) {
        if (he0Var == null) {
            he0Var = he0.AUTO_FOLLOW;
        }
        this.v5 = he0Var;
    }

    public String J0() {
        return this.FH;
    }

    public ec0 J8() {
        if (this.J8 == null) {
            this.J8 = new ec0(this.j6);
        }
        return this.J8;
    }

    public td0 KD(j70 j70Var, Collection<ae0> collection) throws j50 {
        if (collection == null || collection.isEmpty()) {
            try {
                collection = gn(this.gn);
                if (collection.isEmpty()) {
                    throw new j50(JGitText.DW().nothingToPush);
                }
            } catch (IOException e) {
                throw new j50(MessageFormat.format(JGitText.DW().problemWithResolvingPushRefSpecsLocally, e.getMessage()), e);
            }
        }
        return new sd0(this, collection).j6(j70Var);
    }

    public boolean Mr() {
        return this.EQ;
    }

    public void Mz(boolean z) {
        this.we = z;
    }

    public int QX() {
        return this.J0;
    }

    public abstract rd0 SI();

    public void Sf(String str) {
        if (str == null || str.length() <= 0) {
            this.VH = "git-receive-pack";
        } else {
            this.VH = str;
        }
    }

    public boolean U2() {
        return this.tp;
    }

    public bd0 VH(j70 j70Var, Collection<yd0> collection) throws InterruptedException, j50 {
        if (collection == null || collection.isEmpty()) {
            if (this.Hw.isEmpty()) {
                throw new j50(JGitText.DW().nothingToFetch);
            }
            collection = this.Hw;
        } else if (!this.Hw.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection);
            Iterator<yd0> it = collection.iterator();
            while (it.hasNext()) {
                String strGn = it.next().gn();
                Iterator<yd0> it2 = this.Hw.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    yd0 next = it2.next();
                    String strGn2 = next.gn();
                    String strVH = next.VH();
                    if (strGn2.equals(strGn) && strVH != null) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
            collection = arrayList;
        }
        bd0 bd0Var = new bd0();
        new ad0(this, collection).VH(j70Var, bd0Var);
        return bd0Var;
    }

    public he0 Ws() {
        return this.v5;
    }

    public boolean a8() {
        return this.Zo;
    }

    public ue0 aM() {
        return this.DW;
    }

    public void ca(int i) {
        this.J0 = i;
    }

    public void cb(boolean z) {
        this.EQ = z;
    }

    public void dx(vc0 vc0Var) {
        this.Ws = vc0Var;
    }

    public void ef(boolean z) {
        this.Zo = z;
    }

    public void g3(boolean z) {
        this.u7 = z;
    }

    public Collection<ae0> gn(Collection<yd0> collection) {
        return u7(this.j6, collection, this.Hw);
    }

    public boolean lg() {
        return this.u7;
    }

    public abstract yc0 nw();

    public boolean rN() {
        return this.we;
    }

    public void sG(boolean z) {
        this.tp = z;
    }

    public void vJ(String str) {
        if (str == null || str.length() <= 0) {
            this.FH = "git-upload-pack";
        } else {
            this.FH = str;
        }
    }

    public String we() {
        return this.VH;
    }
}
