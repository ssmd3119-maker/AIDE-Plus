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
import java.util.List;

@cy(clazz = -650186310868901893L, container = -650186310868901893L, user = true)
/* loaded from: classes.dex */
public interface IGotoSymbolListener extends IInterface {

    @cy(clazz = -3113482997274709725L, container = -3113482997274709725L, user = true)
    public static abstract class Sub extends Binder implements IGotoSymbolListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -643888408847959233L, container = -643888408847959233L, user = true)
        private static class Proxy implements IGotoSymbolListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2150109069679207845L)
            public static IGotoSymbolListener mb;

            @dy(field = -2417446358511725216L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 111498619484119724L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(3330003692273104080L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 3330003692273104080L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IGotoSymbolListener
            @ey(method = 1896903829601581752L)
            public void WB(String str) {
                try {
                    if (jw) {
                        iy.tp(1329847116551799360L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().WB(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1329847116551799360L, this, str);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = -2796069372734088828L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(1691597199840509780L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1691597199840509780L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IGotoSymbolListener
            @ey(method = -776096382883761173L)
            public void oY(SourceEntity sourceEntity) {
                try {
                    if (jw) {
                        iy.tp(254188330020171955L, this, sourceEntity);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");
                        if (sourceEntity != null) {
                            parcelObtain.writeInt(1);
                            sourceEntity.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(3, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().oY(sourceEntity);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 254188330020171955L, this, sourceEntity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IGotoSymbolListener
            @ey(method = 2262297566307829600L)
            public void qp(String str, List list) {
                try {
                    if (jw) {
                        iy.EQ(-737003469818683872L, this, str, list);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeList(list);
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().qp(str, list);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, -737003469818683872L, this, str, list);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 596106245147875728L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(1885388106895399385L, null);
                }
                attachInterface(this, "com.aide.engine.service.IGotoSymbolListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1885388106895399385L, null);
                }
                throw th;
            }
        }

        @ey(method = -3490377981715579593L)
        public static IGotoSymbolListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-2097897098667510432L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IGotoSymbolListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGotoSymbolListener)) ? new Proxy(iBinder) : (IGotoSymbolListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -2097897098667510432L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -3589190443307434771L)
        public static IGotoSymbolListener dx() {
            try {
                if (WB) {
                    iy.gn(1993927677789748456L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1993927677789748456L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 597842838436242936L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(1893979369021430977L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1893979369021430977L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 734197097425207455L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(747518924153604416L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IGotoSymbolListener");
                    WB(parcel.readString());
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IGotoSymbolListener");
                    qp(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                    return true;
                }
                if (i == 3) {
                    parcel.enforceInterface("com.aide.engine.service.IGotoSymbolListener");
                    oY(parcel.readInt() != 0 ? SourceEntity.CREATOR.createFromParcel(parcel) : null);
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.IGotoSymbolListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, 747518924153604416L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -7046321043145371444L)
    void WB(String str);

    @ey(method = 306675736950987377L)
    void oY(SourceEntity sourceEntity);

    @ey(method = -6081351828949049472L)
    void qp(String str, List list);
}
