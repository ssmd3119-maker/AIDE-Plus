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

@cy(clazz = -966518381972176864L, container = -966518381972176864L, user = true)
/* loaded from: classes.dex */
public interface ILicenseResultListener extends IInterface {

    @cy(clazz = -2158800655084182864L, container = -2158800655084182864L, user = true)
    public static abstract class Sub extends Binder implements ILicenseResultListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -516683162060558584L, container = -516683162060558584L, user = true)
        private static class Proxy implements ILicenseResultListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -787097650047658320L)
            public static ILicenseResultListener mb;

            @dy(field = -2501176538321144145L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 7205025289452609195L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(2913681774118926924L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 2913681774118926924L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.android.vending.licensing.ILicenseResultListener
            @ey(method = -311417686047735664L)
            public void Bn(int i, String str, String str2) {
                try {
                    if (jw) {
                        iy.we(-1107854224921576623L, this, new Integer(i), str, str2);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
                        parcelObtain.writeInt(i);
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Bn(i, str, str2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, -1107854224921576623L, this, new Integer(i), str, str2);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = -2604152934726615987L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(2378441031766153200L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 2378441031766153200L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -1844195471295184735L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-1643658187290261800L, null);
                }
                attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1643658187290261800L, null);
                }
                throw th;
            }
        }

        @ey(method = -288451245175950384L)
        public static ILicenseResultListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-1874819859482863925L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicenseResultListener)) ? new Proxy(iBinder) : (ILicenseResultListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -1874819859482863925L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = 1965181067536893400L)
        public static ILicenseResultListener dx() {
            try {
                if (WB) {
                    iy.gn(4111244649398986605L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 4111244649398986605L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -3402444146217619907L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-1921090650901021320L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1921090650901021320L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 152245944983153920L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-953931718243797165L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                    Bn(parcel.readInt(), parcel.readString(), parcel.readString());
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -953931718243797165L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 465262709971733375L)
    void Bn(int i, String str, String str2);
}
