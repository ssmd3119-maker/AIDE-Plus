package org.codehaus.groovy.tools;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

/* loaded from: classes.dex */
public class RootLoader extends URLClassLoader {
    private Map<String, Class> WB;

    private Class j6(String str) {
        return super.findClass(str);
    }

    @Override // java.net.URLClassLoader
    public void addURL(URL url) {
        super.addURL(url);
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    protected Class findClass(String str) throws ClassNotFoundException {
        throw new ClassNotFoundException(str);
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        URL urlFindResource = findResource(str);
        return urlFindResource == null ? super.getResource(str) : urlFindResource;
    }

    @Override // java.lang.ClassLoader
    protected synchronized Class loadClass(String str, boolean z) {
        Class clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        Class clsLoadClass = this.WB.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        try {
            clsLoadClass = j6(str);
        } catch (ClassNotFoundException unused) {
        }
        if (clsLoadClass == null) {
            clsLoadClass = super.loadClass(str, z);
        }
        if (z) {
            resolveClass(clsLoadClass);
        }
        return clsLoadClass;
    }
}
