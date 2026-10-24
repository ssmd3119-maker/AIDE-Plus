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

@cy(clazz = 403576135500887392L, container = 403576135500887392L, user = true)
/* loaded from: classes.dex */
public interface IBuildListener extends IInterface {

    @cy(clazz = 42054889497653200L, container = 42054889497653200L, user = true)
    public static abstract class Sub extends Binder implements IBuildListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -7701921321901117432L, container = -7701921321901117432L, user = true)
        private static class Proxy implements IBuildListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -1031733793831370127L)
            public static IBuildListener mb;

            @dy(field = -855044220557622320L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 11157291841056480L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(-4260289474826492848L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -4260289474826492848L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IBuildListener
            @ey(method = -612027008429993275L)
            public void AL(boolean z) {
                try {
                    if (jw) {
                        iy.Ws(2300038400124412545L, this, z);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IBuildListener");
                        parcelObtain.writeInt(z ? 1 : 0);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().AL(z);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 2300038400124412545L, this, new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = -2917983221238082960L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(-2871415414103916128L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2871415414103916128L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IBuildListener
            @ey(method = -2835581724469952016L)
            public void buildFailed(String str) {
                try {
                    if (jw) {
                        iy.tp(1886364467228981740L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IBuildListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().buildFailed(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1886364467228981740L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -1281339763056096300L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(60283444419976128L, null);
                }
                attachInterface(this, "com.aide.engine.service.IBuildListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 60283444419976128L, null);
                }
                throw th;
            }
        }

        @ey(method = -1834711586796520575L)
        public static IBuildListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-1672377482009189835L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IBuildListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBuildListener)) ? new Proxy(iBinder) : (IBuildListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -1672377482009189835L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -2344973580020688165L)
        public static IBuildListener dx() {
            try {
                if (WB) {
                    iy.gn(-4614471217196617509L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -4614471217196617509L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 545360397154300800L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-1429011944591335500L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1429011944591335500L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = -1927155016170008415L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(3833250558657145125L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IBuildListener");
                    AL(parcel.readInt() != 0);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IBuildListener");
                    buildFailed(parcel.readString());
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.IBuildListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, 3833250558657145125L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 2082795344799894088L)
    void AL(boolean z);

    @ey(method = -2478401584047634801L)
    void buildFailed(String str);
}
