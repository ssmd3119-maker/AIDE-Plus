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
import com.aide.engine.SyntaxError;

@cy(clazz = -3412754130100624640L, container = -3412754130100624640L, user = true)
/* loaded from: classes.dex */
public interface IEngineErrorListener extends IInterface {

    @cy(clazz = -2918936578881055840L, container = -2918936578881055840L, user = true)
    public static abstract class Sub extends Binder implements IEngineErrorListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -1132746736937134392L, container = -1132746736937134392L, user = true)
        private static class Proxy implements IEngineErrorListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -205071317329870935L)
            public static IEngineErrorListener mb;

            @dy(field = -3105846227888116452L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -245730147769690000L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(-7026785476429618368L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -7026785476429618368L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IEngineErrorListener
            @ey(method = 4149488014207849277L)
            public void Of() {
                try {
                    if (jw) {
                        iy.gn(-754960550111463935L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                        if (this.WB.transact(3, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Of();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -754960550111463935L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IEngineErrorListener
            @ey(method = -6560151981828953235L)
            public void Qs(String str, SyntaxError[] syntaxErrorArr, boolean z) {
                try {
                    if (jw) {
                        iy.we(5739022252632619521L, this, str, syntaxErrorArr, new Boolean(z));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeTypedArray(syntaxErrorArr, 0);
                        parcelObtain.writeInt(z ? 1 : 0);
                        if (this.WB.transact(4, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Qs(str, syntaxErrorArr, z);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 5739022252632619521L, this, str, syntaxErrorArr, new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IEngineErrorListener
            @ey(method = 3612442189242930187L)
            public void UT(String str) {
                try {
                    if (jw) {
                        iy.tp(-3590787591572377329L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().UT(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -3590787591572377329L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IEngineErrorListener
            @ey(method = 82138605853598112L)
            public void aj(String str) {
                try {
                    if (jw) {
                        iy.tp(-3395447268912923280L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(5, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().aj(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -3395447268912923280L, this, str);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 2040104003274306352L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(1233776082611862392L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1233776082611862392L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IEngineErrorListener
            @ey(method = -4434244072808485403L)
            public void eU() {
                try {
                    if (jw) {
                        iy.gn(-4806584748576452415L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().eU();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -4806584748576452415L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 476121714594498736L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(791699895359807868L, null);
                }
                attachInterface(this, "com.aide.engine.service.IEngineErrorListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 791699895359807868L, null);
                }
                throw th;
            }
        }

        @ey(method = -3192433062176415789L)
        public static IEngineErrorListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-562652590735852983L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IEngineErrorListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEngineErrorListener)) ? new Proxy(iBinder) : (IEngineErrorListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -562652590735852983L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = 4195154852558123685L)
        public static IEngineErrorListener dx() {
            try {
                if (WB) {
                    iy.gn(4908572159812587675L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 4908572159812587675L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -1625887827497593176L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-61778177497234464L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -61778177497234464L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = -2208604012883688965L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(1418778786085707305L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                    eU();
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                    UT(parcel.readString());
                    return true;
                }
                if (i == 3) {
                    parcel.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                    Of();
                    return true;
                }
                if (i == 4) {
                    parcel.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                    Qs(parcel.readString(), (SyntaxError[]) parcel.createTypedArray(SyntaxError.CREATOR), parcel.readInt() != 0);
                    return true;
                }
                if (i == 5) {
                    parcel.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                    aj(parcel.readString());
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.IEngineErrorListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, 1418778786085707305L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 2811108950773878987L)
    void Of();

    @ey(method = 5859364419497647395L)
    void Qs(String str, SyntaxError[] syntaxErrorArr, boolean z);

    @ey(method = -4866095129370359715L)
    void UT(String str);

    @ey(method = 3812700326415729120L)
    void aj(String str);

    @ey(method = -3179630341340528425L)
    void eU();
}
