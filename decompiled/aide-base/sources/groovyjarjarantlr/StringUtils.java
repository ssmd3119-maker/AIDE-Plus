package groovyjarjarantlr;

/* loaded from: classes.dex */
public class StringUtils {
    public static String j6(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        int iLastIndexOf = str.lastIndexOf(str3);
        return (iIndexOf == -1 || iLastIndexOf == -1) ? str : str.substring(iIndexOf + 1, iLastIndexOf);
    }
}
