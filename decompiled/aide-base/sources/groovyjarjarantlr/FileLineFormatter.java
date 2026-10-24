package groovyjarjarantlr;

/* loaded from: classes.dex */
public abstract class FileLineFormatter {
    private static FileLineFormatter j6 = new DefaultFileLineFormatter();

    public static FileLineFormatter DW() {
        return j6;
    }

    public abstract String j6(String str, int i, int i2);
}
