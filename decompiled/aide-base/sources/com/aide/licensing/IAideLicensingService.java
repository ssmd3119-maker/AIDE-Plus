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
import com.aide.licensing.IAideLicenseResultListener;

@cy(clazz = -173597126207858799L, container = -173597126207858799L, user = true)
/* loaded from: classes.dex */
public interface IAideLicensingService extends IInterface {

    @cy(clazz = 2299737887176419429L, container = 2299737887176419429L, user = true)
    public static abstract class Sub extends Binder implements IAideLicensingService {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -52803688757817099L, container = -52803688757817099L, user = true)
        private static class Proxy implements IAideLicensingService {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 3761889495917850445L)
            public static IAideLicensingService mb;

            @dy(field = -1496202259372163420L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 214791276070036352L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(7479934523988355568L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 7479934523988355568L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = -1288829665065207296L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(-2062018006717991520L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2062018006717991520L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.licensing.IAideLicensingService
            @ey(method = -3221642907797117304L)
            public void oh(IAideLicenseResultListener iAideLicenseResultListener) {
                try {
                    if (jw) {
                        iy.tp(2458534097119865916L, this, iAideLicenseResultListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.licensing.IAideLicensingService");
                        parcelObtain.writeStrongBinder(iAideLicenseResultListener != null ? iAideLicenseResultListener.asBinder() : null);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().oh(iAideLicenseResultListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 2458534097119865916L, this, iAideLicenseResultListener);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -460866598028946571L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-211999893636556831L, null);
                }
                attachInterface(this, "com.aide.licensing.IAideLicensingService");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -211999893636556831L, null);
                }
                throw th;
            }
        }

        @ey(method = -217853811274597860L)
        public static IAideLicensingService asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-1552962901620419764L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.licensing.IAideLicensingService");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAideLicensingService)) ? new Proxy(iBinder) : (IAideLicensingService) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -1552962901620419764L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -2933806307394703000L)
        public static IAideLicensingService dx() {
            try {
                if (WB) {
                    iy.gn(1200494838229144416L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1200494838229144416L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -2497652152091772599L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(3280691021500539441L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 3280691021500539441L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 1092887396046868028L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(984240657325753452L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.licensing.IAideLicensingService");
                    oh(IAideLicenseResultListener.Sub.asInterface(parcel.readStrongBinder()));
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.licensing.IAideLicensingService");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, 984240657325753452L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -2954708793999453008L)
    void oh(IAideLicenseResultListener iAideLicenseResultListener);
}
