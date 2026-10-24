package com.aide.engine.service;

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

@cy(clazz = -2035031548897634649L, container = -2035031548897634649L, user = true)
/* loaded from: classes.dex */
public interface IOpenFileInterface extends IInterface {

    @cy(clazz = 6492442858675893371L, container = 6492442858675893371L, user = true)
    public static abstract class Sub extends Binder implements IOpenFileInterface {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -809230371033444745L, container = -809230371033444745L, user = true)
        private static class Proxy implements IOpenFileInterface {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -3621168174255095936L)
            public static IOpenFileInterface mb;

            @dy(field = 2688564112450983911L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -14480104674388701L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(-6069847640756722140L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -6069847640756722140L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IOpenFileInterface
            @ey(method = 2049081957824719216L)
            public int GQ() {
                try {
                    if (jw) {
                        iy.gn(68354855023855923L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                        if (!this.WB.transact(3, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().GQ();
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 68354855023855923L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IOpenFileInterface
            @ey(method = 4389674880619663063L)
            public CharArray W3(int i) {
                try {
                    if (jw) {
                        iy.u7(-2541115332202067616L, this, i);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                        parcelObtain.writeInt(i);
                        if (!this.WB.transact(4, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().W3(i);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0 ? CharArray.CREATOR.createFromParcel(parcelObtain2) : null;
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -2541115332202067616L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 629550268082655221L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(1519646659550658720L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1519646659550658720L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IOpenFileInterface
            @ey(method = -4214871052232286303L)
            public long we() {
                try {
                    if (jw) {
                        iy.gn(-3037254234425377560L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                        if (!this.WB.transact(1, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().we();
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readLong();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3037254234425377560L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IOpenFileInterface
            @ey(method = 4921263199696861017L)
            public long yA() {
                try {
                    if (jw) {
                        iy.gn(-2263599873468995344L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                        if (!this.WB.transact(2, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().yA();
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readLong();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2263599873468995344L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -2604366256767177285L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-2366004272929090959L, null);
                }
                attachInterface(this, "com.aide.engine.service.IOpenFileInterface");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2366004272929090959L, null);
                }
                throw th;
            }
        }

        @ey(method = -2044487038147183432L)
        public static IOpenFileInterface asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(878645028592189260L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IOpenFileInterface");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenFileInterface)) ? new Proxy(iBinder) : (IOpenFileInterface) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 878645028592189260L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = 5098886621506701108L)
        public static IOpenFileInterface dx() {
            try {
                if (WB) {
                    iy.gn(2082227930365850760L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2082227930365850760L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 1553017411021510027L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-450617560726896351L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -450617560726896351L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = -984446820492543936L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-796208241111484916L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                    long jWe = we();
                    parcel2.writeNoException();
                    parcel2.writeLong(jWe);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                    long jYA = yA();
                    parcel2.writeNoException();
                    parcel2.writeLong(jYA);
                    return true;
                }
                if (i == 3) {
                    parcel.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                    int iGQ = GQ();
                    parcel2.writeNoException();
                    parcel2.writeInt(iGQ);
                    return true;
                }
                if (i != 4) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.aide.engine.service.IOpenFileInterface");
                    return true;
                }
                parcel.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                CharArray charArrayW3 = W3(parcel.readInt());
                parcel2.writeNoException();
                if (charArrayW3 != null) {
                    parcel2.writeInt(1);
                    charArrayW3.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -796208241111484916L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -583836484329363608L)
    int GQ();

    @ey(method = -493221937446820085L)
    CharArray W3(int i);

    @ey(method = -149252869116591835L)
    long we();

    @ey(method = -2922957990984396411L)
    long yA();
}
