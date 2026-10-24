package com.google.android.gms.dynamite;

import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class DynamiteModule {

    @GuardedBy("DynamiteModule.class")
    private static Boolean DW = null;

    @GuardedBy("DynamiteModule.class")
    private static f FH = null;

    @GuardedBy("DynamiteModule.class")
    private static h Hw = null;

    @GuardedBy("DynamiteModule.class")
    private static int Zo = -1;

    @GuardedBy("DynamiteModule.class")
    private static String v5;
    private final Context j6;
    private static final ThreadLocal<c> VH = new ThreadLocal<>();
    private static final b.a gn = new com.google.android.gms.dynamite.a();
    public static final b u7 = new com.google.android.gms.dynamite.b();
    public static final b tp = new com.google.android.gms.dynamite.c();
    public static final b EQ = new com.google.android.gms.dynamite.d();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, com.google.android.gms.dynamite.a aVar) {
            this(str);
        }

        /* synthetic */ a(String str, Throwable th, com.google.android.gms.dynamite.a aVar) {
            this(str, th);
        }
    }

    public interface b {

        public interface a {
            int DW(Context context, String str, boolean z);

            int j6(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0114b {
            public int j6 = 0;
            public int DW = 0;
            public int FH = 0;
        }

        C0114b j6(Context context, String str, a aVar);
    }

    private static class c {
        public Cursor j6;

        private c() {
        }

        /* synthetic */ c(com.google.android.gms.dynamite.a aVar) {
            this();
        }
    }

    private static class d implements b.a {
        private final int j6;

        public d(int i, int i2) {
            this.j6 = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int DW(Context context, String str, boolean z) {
            return 0;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int j6(Context context, String str) {
            return this.j6;
        }
    }

    private DynamiteModule(Context context) {
        p.u7(context);
        this.j6 = context;
    }

    private static int EQ(Context context, String str, boolean z) {
        f fVarQX = QX(context);
        if (fVarQX == null) {
            return 0;
        }
        try {
            if (fVarQX.cv() >= 2) {
                return fVarQX.Sp(xu.sy(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return fVarQX.UQ(xu.sy(context), str, z);
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    public static int FH(Context context, String str) {
        return Zo(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.dynamite.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int J0(android.content.Context r8, java.lang.String r9, boolean r10) throws java.lang.Throwable {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r10 == 0) goto La
            java.lang.String r8 = "api_force_staging"
            goto Lc
        La:
            java.lang.String r8 = "api"
        Lc:
            int r10 = r8.length()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.append(r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.append(r9)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r8 == 0) goto L83
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r9 == 0) goto L83
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r9 <= 0) goto L7c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.dynamite.DynamiteModule.v5 = r1     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L79
            if (r1 < 0) goto L67
            int r1 = r8.getInt(r1)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.dynamite.DynamiteModule.Zo = r1     // Catch: java.lang.Throwable -> L79
        L67:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L79
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = com.google.android.gms.dynamite.DynamiteModule.VH     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.c) r10     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r10 == 0) goto L7c
            android.database.Cursor r1 = r10.j6     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r1 != 0) goto L7c
            r10.j6 = r8     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            goto L7d
        L79:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
        L7c:
            r0 = r8
        L7d:
            if (r0 == 0) goto L82
            r0.close()
        L82:
            return r9
        L83:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            throw r9     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
        L92:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto Lae
        L96:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L9f
        L9b:
            r8 = move-exception
            goto Lae
        L9d:
            r8 = move-exception
            r9 = r0
        L9f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> Lac
            if (r10 == 0) goto La4
            throw r8     // Catch: java.lang.Throwable -> Lac
        La4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> Lac
            throw r10     // Catch: java.lang.Throwable -> Lac
        Lac:
            r8 = move-exception
            r0 = r9
        Lae:
            if (r0 == 0) goto Lb3
            r0.close()
        Lb3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.J0(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule J8(Context context, String str, int i) throws a {
        h hVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            hVar = Hw;
        }
        com.google.android.gms.dynamite.a aVar = null;
        if (hVar == null) {
            throw new a("DynamiteLoaderV2 was not cached.", aVar);
        }
        c cVar = VH.get();
        if (cVar == null || cVar.j6 == null) {
            throw new a("No result cursor", aVar);
        }
        Context contextVH = VH(context.getApplicationContext(), str, i, cVar.j6, hVar);
        if (contextVH != null) {
            return new DynamiteModule(contextVH);
        }
        throw new a("Failed to get module context", aVar);
    }

    private static f QX(Context context) {
        f gVar;
        synchronized (DynamiteModule.class) {
            if (FH != null) {
                return FH;
            }
            if (com.google.android.gms.common.c.VH().gn(context) != 0) {
                return null;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    gVar = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new g(iBinder);
                }
                if (gVar != null) {
                    FH = gVar;
                    return gVar;
                }
            } catch (Exception e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    private static Context VH(Context context, String str, int i, Cursor cursor, h hVar) {
        wu wuVarS4;
        try {
            xu.sy(null);
            if (tp().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                wuVarS4 = hVar.tR(xu.sy(context), str, i, xu.sy(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                wuVarS4 = hVar.S4(xu.sy(context), str, i, xu.sy(cursor));
            }
            return (Context) xu.g3(wuVarS4);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.toString());
            Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(strValueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    private static DynamiteModule Ws(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static int Zo(Context context, String str, boolean z) {
        Class<?> clsLoadClass;
        Field declaredField;
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool2 = DW;
                if (bool2 == null) {
                    try {
                        clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        declaredField = clsLoadClass.getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String strValueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(strValueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool2 = Boolean.FALSE;
                    }
                    synchronized (clsLoadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    u7(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int iJ0 = J0(context, str, z);
                                if (v5 != null && !v5.isEmpty()) {
                                    e eVar = new e(v5, ClassLoader.getSystemClassLoader());
                                    u7(eVar);
                                    declaredField.set(null, eVar);
                                    DW = Boolean.TRUE;
                                    return iJ0;
                                }
                                return iJ0;
                            } catch (a unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        bool2 = bool;
                        DW = bool2;
                    }
                }
                if (!bool2.booleanValue()) {
                    return EQ(context, str, z);
                }
                try {
                    return J0(context, str, z);
                } catch (a e2) {
                    String strValueOf2 = String.valueOf(e2.getMessage());
                    Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
                    return 0;
                }
            }
        } catch (Throwable th) {
            com.google.android.gms.common.util.g.j6(context, th);
            throw th;
        }
    }

    private static DynamiteModule gn(Context context, String str, int i) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = DW;
            }
            if (bool != null) {
                return bool.booleanValue() ? J8(context, str, i) : we(context, str, i);
            }
            throw new a("Failed to determine which loading route to use.", (com.google.android.gms.dynamite.a) null);
        } catch (Throwable th) {
            com.google.android.gms.common.util.g.j6(context, th);
            throw th;
        }
    }

    public static int j6(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    private static Boolean tp() {
        Boolean boolValueOf;
        synchronized (DynamiteModule.class) {
            boolValueOf = Boolean.valueOf(Zo >= 2);
        }
        return boolValueOf;
    }

    @GuardedBy("DynamiteModule.class")
    private static void u7(ClassLoader classLoader) throws a {
        h iVar;
        com.google.android.gms.dynamite.a aVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new i(iBinder);
            }
            Hw = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new a("Failed to instantiate dynamite loader", e, aVar);
        }
    }

    public static DynamiteModule v5(Context context, b bVar, String str) {
        c cVar = VH.get();
        com.google.android.gms.dynamite.a aVar = null;
        c cVar2 = new c(aVar);
        VH.set(cVar2);
        try {
            b.C0114b c0114bJ6 = bVar.j6(context, str, gn);
            int i = c0114bJ6.j6;
            int i2 = c0114bJ6.DW;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            if (c0114bJ6.FH == 0 || ((c0114bJ6.FH == -1 && c0114bJ6.j6 == 0) || (c0114bJ6.FH == 1 && c0114bJ6.DW == 0))) {
                int i3 = c0114bJ6.j6;
                int i4 = c0114bJ6.DW;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new a(sb2.toString(), aVar);
            }
            if (c0114bJ6.FH == -1) {
                DynamiteModule dynamiteModuleWs = Ws(context, str);
                Cursor cursor = cVar2.j6;
                if (cursor != null) {
                    cursor.close();
                }
                VH.set(cVar);
                return dynamiteModuleWs;
            }
            if (c0114bJ6.FH != 1) {
                int i5 = c0114bJ6.FH;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new a(sb3.toString(), aVar);
            }
            try {
                DynamiteModule dynamiteModuleGn = gn(context, str, c0114bJ6.DW);
                Cursor cursor2 = cVar2.j6;
                if (cursor2 != null) {
                    cursor2.close();
                }
                VH.set(cVar);
                return dynamiteModuleGn;
            } catch (a e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                if (c0114bJ6.j6 == 0 || bVar.j6(context, str, new d(c0114bJ6.j6, 0)).FH != -1) {
                    throw new a("Remote load failed. No local fallback found.", e, aVar);
                }
                DynamiteModule dynamiteModuleWs2 = Ws(context, str);
                Cursor cursor3 = cVar2.j6;
                if (cursor3 != null) {
                    cursor3.close();
                }
                VH.set(cVar);
                return dynamiteModuleWs2;
            }
        } catch (Throwable th) {
            Cursor cursor4 = cVar2.j6;
            if (cursor4 != null) {
                cursor4.close();
            }
            VH.set(cVar);
            throw th;
        }
    }

    private static DynamiteModule we(Context context, String str, int i) throws a {
        wu wuVarEd;
        String str2 = "Failed to load remote module.";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        f fVarQX = QX(context);
        com.google.android.gms.dynamite.a aVar = null;
        if (fVarQX == null) {
            throw new a("Failed to create IDynamiteLoader.", aVar);
        }
        try {
            if (fVarQX.cv() >= 2) {
                wuVarEd = fVarQX.pB(xu.sy(context), str, i);
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                wuVarEd = fVarQX.Ed(xu.sy(context), str, i);
            }
            if (xu.g3(wuVarEd) != null) {
                return new DynamiteModule((Context) xu.g3(wuVarEd));
            }
            throw new a(str2, aVar);
        } catch (RemoteException e) {
            throw new a(str2, e, aVar);
        }
    }

    public final Context DW() {
        return this.j6;
    }

    public final IBinder Hw(String str) throws a {
        try {
            return (IBinder) this.j6.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String strValueOf = String.valueOf(str);
            throw new a(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }
}
