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
import java.util.List;

@cy(clazz = -3935863119418572320L, container = -3935863119418572320L, user = true)
/* loaded from: classes.dex */
public interface IUsageSearcherListener extends IInterface {

    @cy(clazz = -193484794479097088L, container = -193484794479097088L, user = true)
    public static abstract class Sub extends Binder implements IUsageSearcherListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -4476126400412679180L, container = -4476126400412679180L, user = true)
        private static class Proxy implements IUsageSearcherListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2554212878371736476L)
            public static IUsageSearcherListener mb;

            @dy(field = 440645001420732963L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 221330887697390567L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(-8092723588514761207L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -8092723588514761207L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IUsageSearcherListener
            @ey(method = -1575129920923192653L)
            public void Cz() {
                try {
                    if (jw) {
                        iy.gn(5114337826605890389L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Cz();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 5114337826605890389L, this);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 1683629978818992961L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(772441023226253679L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 772441023226253679L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IUsageSearcherListener
            @ey(method = -4463910579464058744L)
            public void ce(List list) {
                try {
                    if (jw) {
                        iy.tp(709124863180210800L, this, list);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");
                        parcelObtain.writeList(list);
                        if (this.WB.transact(3, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().ce(list);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 709124863180210800L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IUsageSearcherListener
            @ey(method = 2362602607421474515L)
            public void hz(String str) {
                try {
                    if (jw) {
                        iy.tp(4970186663013628353L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().hz(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 4970186663013628353L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -546656255997242661L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(2283515085181683056L, null);
                }
                attachInterface(this, "com.aide.engine.service.IUsageSearcherListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2283515085181683056L, null);
                }
                throw th;
            }
        }

        @ey(method = -1556191977264242208L)
        public static IUsageSearcherListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(2225713306650070211L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IUsageSearcherListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUsageSearcherListener)) ? new Proxy(iBinder) : (IUsageSearcherListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 2225713306650070211L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -1304746535253032716L)
        public static IUsageSearcherListener dx() {
            try {
                if (WB) {
                    iy.gn(522699944541562877L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 522699944541562877L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 1074071526248636203L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-280908494185821744L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -280908494185821744L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = -2062941165854634456L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-1228455353449614485L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IUsageSearcherListener");
                    Cz();
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IUsageSearcherListener");
                    hz(parcel.readString());
                    return true;
                }
                if (i == 3) {
                    parcel.enforceInterface("com.aide.engine.service.IUsageSearcherListener");
                    ce(parcel.readArrayList(getClass().getClassLoader()));
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.IUsageSearcherListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -1228455353449614485L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -5394039233710424445L)
    void Cz();

    @ey(method = 4701299408647828496L)
    void ce(List list);

    @ey(method = 4815941415469384675L)
    void hz(String str);
}
