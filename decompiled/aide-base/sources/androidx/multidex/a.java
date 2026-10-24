package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class a {
    private static final Set<File> j6 = new HashSet();
    private static final boolean DW = J0(System.getProperty("java.vm.version"));

    /* renamed from: androidx.multidex.a$a, reason: collision with other inner class name */
    private static final class C0033a {
        private static final int DW = 4;
        private final InterfaceC0034a j6;

        /* renamed from: androidx.multidex.a$a$a, reason: collision with other inner class name */
        private interface InterfaceC0034a {
            Object j6(File file, DexFile dexFile);
        }

        /* renamed from: androidx.multidex.a$a$b */
        private static class b implements InterfaceC0034a {
            private final Constructor<?> j6;

            b(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.j6 = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.a.C0033a.InterfaceC0034a
            public Object j6(File file, DexFile dexFile) {
                return this.j6.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* renamed from: androidx.multidex.a$a$c */
        private static class c implements InterfaceC0034a {
            private final Constructor<?> j6;

            c(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.j6 = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.a.C0033a.InterfaceC0034a
            public Object j6(File file, DexFile dexFile) {
                return this.j6.newInstance(file, file, dexFile);
            }
        }

        /* renamed from: androidx.multidex.a$a$d */
        private static class d implements InterfaceC0034a {
            private final Constructor<?> j6;

            d(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.j6 = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.a.C0033a.InterfaceC0034a
            public Object j6(File file, DexFile dexFile) {
                return this.j6.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private C0033a() throws ClassNotFoundException {
            InterfaceC0034a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.j6 = dVar;
        }

        private Object[] DW(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = list.get(i);
                objArr[i] = this.j6.j6(file, DexFile.loadDex(file.getPath(), FH(file), 0));
            }
            return objArr;
        }

        private static String FH(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - DW) + ".dex").getPath();
        }

        static void j6(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            Object obj = a.VH(classLoader, "pathList").get(classLoader);
            Object[] objArrDW = new C0033a().DW(list);
            try {
                a.Zo(obj, "dexElements", objArrDW);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                a.Zo(obj, "pathElements", objArrDW);
            }
        }
    }

    private static final class b {
        private static Object[] DW(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) a.gn(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }

        static void j6(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
            IOException[] iOExceptionArr;
            Object obj = a.VH(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            a.Zo(obj, "dexElements", DW(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field fieldVH = a.VH(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldVH.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldVH.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }
    }

    private static final class c {
        static void j6(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            int size = list.size();
            Field fieldVH = a.VH(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) fieldVH.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int iPreviousIndex = listIterator.previousIndex();
                strArr[iPreviousIndex] = absolutePath;
                fileArr[iPreviousIndex] = next;
                zipFileArr[iPreviousIndex] = new ZipFile(next);
                dexFileArr[iPreviousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            fieldVH.set(classLoader, sb.toString());
            a.Zo(classLoader, "mPaths", strArr);
            a.Zo(classLoader, "mFiles", fileArr);
            a.Zo(classLoader, "mZips", zipFileArr);
            a.Zo(classLoader, "mDexs", dexFileArr);
        }
    }

    public static void EQ(Context context) {
        Log.i("MultiDex", "Installing application");
        if (DW) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        if (Build.VERSION.SDK_INT < 4) {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
        }
        try {
            ApplicationInfo applicationInfoU7 = u7(context);
            if (applicationInfoU7 == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                v5(context, new File(applicationInfoU7.sourceDir), new File(applicationInfoU7.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e) {
            Log.e("MultiDex", "MultiDex installation failure", e);
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    private static void Hw(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : fileArrListFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    static boolean J0(String str) throws NumberFormatException {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int i = Integer.parseInt(matcher.group(1));
                    int i2 = Integer.parseInt(matcher.group(2));
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    private static void J8(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field VH(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Zo(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldVH = VH(obj, str);
        Object[] objArr2 = (Object[]) fieldVH.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldVH.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method gn(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static File tp(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            J8(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            J8(file2);
        }
        File file3 = new File(file2, str);
        J8(file3);
        return file3;
    }

    private static ApplicationInfo u7(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static void v5(Context context, File file, File file2, String str, String str2, boolean z) {
        synchronized (j6) {
            if (j6.contains(file)) {
                return;
            }
            j6.add(file);
            if (Build.VERSION.SDK_INT > 20) {
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                    return;
                }
                try {
                    Hw(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                File fileTp = tp(context, file2, str);
                androidx.multidex.b bVar = new androidx.multidex.b(file, fileTp);
                IOException e = null;
                try {
                    try {
                        we(classLoader, fileTp, bVar.tp(context, str2, false));
                    } catch (IOException e2) {
                        if (!z) {
                            throw e2;
                        }
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                        we(classLoader, fileTp, bVar.tp(context, str2, true));
                    }
                    try {
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        bVar.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (RuntimeException e4) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e4);
            }
        }
    }

    private static void we(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        if (list.isEmpty()) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            b.j6(classLoader, list, file);
        } else if (i >= 14) {
            C0033a.j6(classLoader, list);
        } else {
            c.j6(classLoader, list);
        }
    }
}
