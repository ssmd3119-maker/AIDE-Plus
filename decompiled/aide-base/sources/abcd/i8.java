package abcd;

@cy(clazz = 5059716225715409792L, container = 5059716225715409792L, user = true)
/* loaded from: classes.dex */
public class i8 extends Exception {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(i8.class);
    }

    @ey(method = 3369718284792242048L)
    public i8() {
        try {
            if (WB) {
                iy.gn(-7431879781323769788L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -7431879781323769788L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 461817378800875760L)
    public i8(String str) {
        super(str);
        try {
            if (WB) {
                iy.tp(210374302213404000L, null, str);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 210374302213404000L, null, str);
            }
            throw th;
        }
    }
}
