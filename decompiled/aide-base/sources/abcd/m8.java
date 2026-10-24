package abcd;

import android.view.ViewGroup;

@cy(clazz = -1737683041100490159L, container = -1737683041100490159L, user = true)
/* loaded from: classes.dex */
public class m8 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 4137610608632516375L)
    private boolean DW;

    @dy(field = 1458402025162141425L)
    private ViewGroup FH;

    @dy(field = 4198629060668799169L)
    private boolean j6;

    static {
        iy.Zo(m8.class);
    }

    @ey(method = -1078142965183474865L)
    public void DW(boolean z) {
        try {
            if (Hw) {
                iy.Ws(-878021096633360439L, this, z);
            }
            this.DW = z;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -878021096633360439L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2885730539127029592L)
    public void FH() {
        try {
            if (Hw) {
                iy.gn(2716482063525462528L, this);
            }
            if (this.DW && this.j6) {
                this.FH.setVisibility(0);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2716482063525462528L, this);
            }
            throw th;
        }
    }

    @ey(method = 193679716696543920L)
    public void j6() {
        try {
            if (Hw) {
                iy.gn(-381737479327687580L, this);
            }
            this.DW = false;
            this.FH.setVisibility(8);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -381737479327687580L, this);
            }
            throw th;
        }
    }
}
