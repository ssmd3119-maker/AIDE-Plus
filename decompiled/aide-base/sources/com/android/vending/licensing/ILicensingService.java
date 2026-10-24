package com.android.vending.licensing;

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
import com.android.vending.licensing.ILicenseResultListener;

@cy(clazz = 4131913043269407945L, container = 4131913043269407945L, user = true)
/* loaded from: classes.dex */
public interface ILicensingService extends IInterface {

    @cy(clazz = -523287074831529595L, container = -523287074831529595L, user = true)
    public static abstract class Sub extends Binder implements ILicensingService {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 950796445825987797L, container = 950796445825987797L, user = true)
        private static class Proxy implements ILicensingService {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -4579969848147224583L)
            public static ILicensingService mb;

            @dy(field = -804649032323297808L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -66415307568857500L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(2735950639407038599L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 2735950639407038599L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.android.vending.licensing.ILicensingService
            @ey(method = 467867295480740175L)
            public void Bu(long j, String str, ILicenseResultListener iLicenseResultListener) {
                try {
                    if (jw) {
                        iy.we(-3064570666234928224L, this, new Long(j), str, iLicenseResultListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                        parcelObtain.writeLong(j);
                        parcelObtain.writeString(str);
                        parcelObtain.writeStrongBinder(iLicenseResultListener != null ? iLicenseResultListener.asBinder() : null);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Bu(j, str, iLicenseResultListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, -3064570666234928224L, this, new Long(j), str, iLicenseResultListener);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = -1580931935414461172L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(1976967346172450505L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1976967346172450505L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -744136481609975125L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-1814264660613683604L, null);
                }
                attachInterface(this, "com.android.vending.licensing.ILicensingService");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1814264660613683604L, null);
                }
                throw th;
            }
        }

        @ey(method = 1745723709694185768L)
        public static ILicensingService asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-1860534859620897279L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) ? new Proxy(iBinder) : (ILicensingService) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -1860534859620897279L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -938172110202271296L)
        public static ILicensingService dx() {
            try {
                if (WB) {
                    iy.gn(1396102385875725675L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1396102385875725675L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 3065877839047739571L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(2277020459729407392L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2277020459729407392L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 1400057413313421408L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(742440474434070625L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                    Bu(parcel.readLong(), parcel.readString(), ILicenseResultListener.Sub.asInterface(parcel.readStrongBinder()));
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.android.vending.licensing.ILicensingService");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, 742440474434070625L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 33660586406462151L)
    void Bu(long j, String str, ILicenseResultListener iLicenseResultListener);
}
