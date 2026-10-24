package abcd;

import android.os.Bundle;
import com.aide.common.AndroidHelper;
import com.aide.common.AppLog;
import com.aide.ui.ServiceContainer;
import com.aide.ui.t;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import org.json.JSONObject;
import tv.ouya.console.api.Receipt;
import tv.ouya.console.api.d;
import tv.ouya.console.api.e;

@cy(clazz = -629655664712008480L, container = -629655664712008480L, user = true)
/* loaded from: classes.dex */
public class ff {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 1650124173918609985L)
    private PublicKey DW;

    @dy(field = 3013039807942392483L)
    private boolean FH;

    @dy(field = 2679960261792582685L)
    private boolean j6;

    @cy(clazz = -735155945225002005L, container = -629655664712008480L, user = true)
    class a extends tv.ouya.console.api.a<String> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -62190326986845440L)
        public a() {
        }

        @Override // tv.ouya.console.api.g
        @ey(method = 2702350828020131512L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (DW) {
                    iy.tp(1652221012711723701L, this, str);
                }
                ff.this.FH = false;
                try {
                    Iterator<Receipt> it = new d().DW(new JSONObject(str), ff.this.DW).iterator();
                    while (it.hasNext()) {
                        if (it.next().j6().equals("aide_full_30")) {
                            ServiceContainer.getLicenseService().ei(System.currentTimeMillis() + 86400000, true);
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1652221012711723701L, this, str);
                }
                throw th;
            }
        }

        @Override // tv.ouya.console.api.g
        @ey(method = -5041848986341888800L)
        public void gG(int i, String str, Bundle bundle) {
            try {
                if (DW) {
                    iy.we(-3828414837768512041L, this, new Integer(i), str, bundle);
                }
                AppLog.DW("OUYA check purchases failed: " + str);
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -3828414837768512041L, this, new Integer(i), str, bundle);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ff.class);
    }

    @ey(method = 2433643354486281216L)
    public ff() {
        try {
            if (Hw) {
                iy.gn(-7621893770759304652L, null);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -7621893770759304652L, null);
            }
            throw th;
        }
    }

    @ey(method = 2280011962701232160L)
    private boolean v5() {
        try {
            if (Hw) {
                iy.gn(3917271619589544060L, this);
            }
            try {
                InputStream inputStreamOpenRawResource = ServiceContainer.getMainActivity().getResources().openRawResource(t.ouya_key);
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                inputStreamOpenRawResource.close();
                this.DW = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
                return true;
            } catch (Exception e) {
                AppLog.Hw("Unable to read OUYA encryption key", e);
                return false;
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 3917271619589544060L, this);
            }
            throw th;
        }
    }

    @ey(method = -1586421683224859025L)
    public void FH() {
        try {
            if (Hw) {
                iy.gn(-670802435192022831L, this);
            }
            if (this.j6 && !this.FH) {
                this.FH = true;
                e.v5().u7(new a());
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -670802435192022831L, this);
            }
            throw th;
        }
    }

    @ey(method = 1873581101087728348L)
    public void Hw() {
        try {
            if (Hw) {
                iy.gn(720359701887713344L, this);
            }
            if (AndroidHelper.er() && e.v5().gn() && v5()) {
                this.j6 = true;
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 720359701887713344L, this);
            }
            throw th;
        }
    }

    @ey(method = 1461124872504514280L)
    public void Zo() {
        try {
            if (Hw) {
                iy.gn(1972400970041616540L, this);
            }
            if (this.j6) {
                e.v5().EQ();
                this.j6 = false;
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1972400970041616540L, this);
            }
            throw th;
        }
    }
}
