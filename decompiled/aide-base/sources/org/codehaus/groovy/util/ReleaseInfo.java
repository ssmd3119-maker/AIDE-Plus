package org.codehaus.groovy.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import org.codehaus.groovy.runtime.DefaultGroovyMethodsSupport;

/* loaded from: classes.dex */
public class ReleaseInfo {
    private static final Properties j6 = new Properties();

    static {
        ClassLoader classLoader = ReleaseInfo.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        URL urlFindResource = classLoader instanceof URLClassLoader ? ((URLClassLoader) classLoader).findResource("META-INF/groovy-release-info.properties") : classLoader.getResource("META-INF/groovy-release-info.properties");
        if (urlFindResource != null) {
            InputStream inputStreamOpenStream = null;
            try {
                inputStreamOpenStream = urlFindResource.openStream();
                if (inputStreamOpenStream != null) {
                    j6.load(inputStreamOpenStream);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                DefaultGroovyMethodsSupport.closeQuietly(inputStreamOpenStream);
                throw th;
            }
            DefaultGroovyMethodsSupport.closeQuietly(inputStreamOpenStream);
        }
    }
}
