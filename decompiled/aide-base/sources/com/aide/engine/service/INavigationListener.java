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
import com.aide.engine.SourceEntity;

@cy(clazz = -3151542239898744064L, container = -3151542239898744064L, user = true)
/* loaded from: classes.dex */
public interface INavigationListener extends IInterface {

    @cy(clazz = 7096511077883591328L, container = 7096511077883591328L, user = true)
    public static abstract class Sub extends Binder implements INavigationListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -308244051107167000L, container = -308244051107167000L, user = true)
        private static class Proxy implements INavigationListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 3799592834513621437L)
            public static INavigationListener mb;

            @dy(field = -3302252543675751804L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -4047854087946226600L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(6690430170789546384L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 6690430170789546384L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.INavigationListener
            @ey(method = 267418839655490688L)
            public void FN(String str, long j, int i, int i2, SourceEntity sourceEntity) throws Throwable {
                try {
                    if (jw) {
                        iy.J8(305864470263577200L, this, str, new Long(j), new Integer(i), new Integer(i2), sourceEntity);
                    }
                    try {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.aide.engine.service.INavigationListener");
                            try {
                                parcelObtain.writeString(str);
                                parcelObtain.writeLong(j);
                                parcelObtain.writeInt(i);
                                parcelObtain.writeInt(i2);
                                if (sourceEntity != null) {
                                    parcelObtain.writeInt(1);
                                    sourceEntity.writeToParcel(parcelObtain, 0);
                                } else {
                                    parcelObtain.writeInt(0);
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                                parcelObtain.recycle();
                            } else {
                                Sub.dx().FN(str, j, i, i2, sourceEntity);
                                parcelObtain.recycle();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelObtain.recycle();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (fY) {
                            iy.lg(th, 305864470263577200L, this, str, new Long(j), new Integer(i), new Integer(i2), sourceEntity);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 1914714510163354472L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(-2902466081824273584L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2902466081824273584L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.INavigationListener
            @ey(method = -309128250239940045L)
            public void ct(String str, long j, int i, int i2) {
                try {
                    if (jw) {
                        iy.J0(-3241649992988355111L, this, str, new Long(j), new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.INavigationListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeLong(j);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().ct(str, j, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, -3241649992988355111L, this, str, new Long(j), new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 767356436070121285L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-424570548263080884L, null);
                }
                attachInterface(this, "com.aide.engine.service.INavigationListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -424570548263080884L, null);
                }
                throw th;
            }
        }

        @ey(method = -3344653734360992640L)
        public static INavigationListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(1983088002071073825L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.INavigationListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INavigationListener)) ? new Proxy(iBinder) : (INavigationListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 1983088002071073825L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -2725362765242472240L)
        public static INavigationListener dx() {
            try {
                if (WB) {
                    iy.gn(1307332226937797179L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1307332226937797179L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 745004881701342825L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(1333130433336380928L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1333130433336380928L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = -441132574113093600L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(79483760547617473L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.INavigationListener");
                    FN(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? SourceEntity.CREATOR.createFromParcel(parcel) : null);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.INavigationListener");
                    ct(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt());
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.INavigationListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, 79483760547617473L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 1254594262522718349L)
    void FN(String str, long j, int i, int i2, SourceEntity sourceEntity);

    @ey(method = -217814074232272664L)
    void ct(String str, long j, int i, int i2);
}
