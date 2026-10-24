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

@cy(clazz = 1813073565088279956L, container = 1813073565088279956L, user = true)
/* loaded from: classes.dex */
public interface IEngineListener extends IInterface {

    @cy(clazz = 2765317766594800008L, container = 2765317766594800008L, user = true)
    public static abstract class Sub extends Binder implements IEngineListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 7893716468066564328L, container = 7893716468066564328L, user = true)
        private static class Proxy implements IEngineListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 1902130164488473116L)
            public static IEngineListener mb;

            @dy(field = -2011406384478234749L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -299655753623938233L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(589908596238702735L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 589908596238702735L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = -2459115334890528415L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(1011369205441212345L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1011369205441212345L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IEngineListener
            @ey(method = 1252327634758126129L)
            public void oa() {
                try {
                    if (jw) {
                        iy.gn(-465915289178080563L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IEngineListener");
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().oa();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -465915289178080563L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IEngineListener
            @ey(method = 2288222475555810525L)
            public void rJ() {
                try {
                    if (jw) {
                        iy.gn(-2834961462256487679L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IEngineListener");
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().rJ();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2834961462256487679L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 1845400614077115459L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(2130029441730286304L, null);
                }
                attachInterface(this, "com.aide.engine.service.IEngineListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2130029441730286304L, null);
                }
                throw th;
            }
        }

        @ey(method = -1615821241202110976L)
        public static IEngineListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-2464367143524039593L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IEngineListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEngineListener)) ? new Proxy(iBinder) : (IEngineListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -2464367143524039593L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -2624426803293220732L)
        public static IEngineListener dx() {
            try {
                if (WB) {
                    iy.gn(-5365383408952351875L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -5365383408952351875L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 1715786111105073059L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(1096550609866304808L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1096550609866304808L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 1745964094343375400L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-575229089038197825L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IEngineListener");
                    oa();
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IEngineListener");
                    rJ();
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.IEngineListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -575229089038197825L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -2509198192100126603L)
    void oa();

    @ey(method = 3735303828069913305L)
    void rJ();
}
