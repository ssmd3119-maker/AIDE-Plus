package com.aide.licensing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

@cy(clazz = 672372128432849152L, container = 672372128432849152L, user = true)
/* loaded from: classes.dex */
public interface IAideLicenseResultListener extends IInterface {

    @cy(clazz = -5985881983238788440L, container = -5985881983238788440L, user = true)
    public static abstract class Sub extends Binder implements IAideLicenseResultListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 751097897065273040L, container = 751097897065273040L, user = true)
        private static class Proxy implements IAideLicenseResultListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2395982443025980064L)
            public static IAideLicenseResultListener mb;

            @dy(field = 2295843943274912331L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -7548162181567425L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(6294207598877460800L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 6294207598877460800L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.licensing.IAideLicenseResultListener
            @ey(method = 240365471563008L)
            public void Ir(String str, String str2) {
                try {
                    if (jw) {
                        iy.EQ(2328196462604452517L, this, str, str2);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.licensing.IAideLicenseResultListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Ir(str, str2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 2328196462604452517L, this, str, str2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.licensing.IAideLicenseResultListener
            @ey(method = -3796475522516180679L)
            public void Sc() {
                try {
                    if (jw) {
                        iy.gn(-3336263415191374080L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.licensing.IAideLicenseResultListener");
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Sc();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3336263415191374080L, this);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 2603411948178788985L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(-2718163765906975772L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2718163765906975772L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 3229907270916858004L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-2176589666740543085L, null);
                }
                attachInterface(this, "com.aide.licensing.IAideLicenseResultListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2176589666740543085L, null);
                }
                throw th;
            }
        }

        @ey(method = 278908556411813145L)
        public static IAideLicenseResultListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(821252303183318344L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.licensing.IAideLicenseResultListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAideLicenseResultListener)) ? new Proxy(iBinder) : (IAideLicenseResultListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 821252303183318344L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -3515852313043228645L)
        public static IAideLicenseResultListener dx() {
            try {
                if (WB) {
                    iy.gn(-2618508279276696244L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2618508279276696244L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -471275626245748480L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(9885819474567175L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 9885819474567175L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 2076224545326263033L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-61049034201290112L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.licensing.IAideLicenseResultListener");
                    Ir(parcel.readString(), parcel.readString());
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.licensing.IAideLicenseResultListener");
                    Sc();
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.licensing.IAideLicenseResultListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -61049034201290112L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 149939257080212676L)
    void Ir(String str, String str2);

    @ey(method = 6128362677367520859L)
    void Sc();
}
