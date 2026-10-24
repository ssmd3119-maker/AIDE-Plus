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
import java.util.Map;

@cy(clazz = 1606752393208601616L, container = 1606752393208601616L, user = true)
/* loaded from: classes.dex */
public interface IRefactoringListener extends IInterface {

    @cy(clazz = 6058896094762850756L, container = 6058896094762850756L, user = true)
    public static abstract class Sub extends Binder implements IRefactoringListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -1102473383121745920L, container = -1102473383121745920L, user = true)
        private static class Proxy implements IRefactoringListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 557856653347287371L)
            public static IRefactoringListener mb;

            @dy(field = 3341512570716981968L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -4833581971097329940L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(-7158640056728647072L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -7158640056728647072L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IRefactoringListener
            @ey(method = 3714411328385176536L)
            public void Bw(String str, List list) {
                try {
                    if (jw) {
                        iy.EQ(553580164216378272L, this, str, list);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeList(list);
                        if (this.WB.transact(5, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Bw(str, list);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 553580164216378272L, this, str, list);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 1506775518952083940L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(-1572903492858035700L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1572903492858035700L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IRefactoringListener
            @ey(method = -5654082607766963643L)
            public void cl(List list) {
                try {
                    if (jw) {
                        iy.tp(1742179796362269825L, this, list);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");
                        parcelObtain.writeList(list);
                        if (this.WB.transact(4, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().cl(list);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1742179796362269825L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IRefactoringListener
            @ey(method = -4816670678697414355L)
            public void d5(String str, String str2) {
                try {
                    if (jw) {
                        iy.EQ(5021051135314615137L, this, str, str2);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().d5(str, str2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 5021051135314615137L, this, str, str2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IRefactoringListener
            @ey(method = -1393948606313856012L)
            public void j2(String str) {
                try {
                    if (jw) {
                        iy.tp(-1581275375509021236L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(3, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().j2(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -1581275375509021236L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IRefactoringListener
            @ey(method = -1775773780034920095L)
            public void tn(String str, Map map) {
                try {
                    if (jw) {
                        iy.EQ(120805907345887581L, this, str, map);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeMap(map);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().tn(str, map);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 120805907345887581L, this, str, map);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 539399822401038520L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(2107103695002231483L, null);
                }
                attachInterface(this, "com.aide.engine.service.IRefactoringListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2107103695002231483L, null);
                }
                throw th;
            }
        }

        @ey(method = 731878260153520095L)
        public static IRefactoringListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-1222898294734820928L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IRefactoringListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRefactoringListener)) ? new Proxy(iBinder) : (IRefactoringListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -1222898294734820928L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = 4673962207301324049L)
        public static IRefactoringListener dx() {
            try {
                if (WB) {
                    iy.gn(2995939148487743948L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2995939148487743948L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -2227657379231134696L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-1237220375280024497L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1237220375280024497L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 11853344208542839L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-128927002054936680L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IRefactoringListener");
                    tn(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IRefactoringListener");
                    d5(parcel.readString(), parcel.readString());
                    return true;
                }
                if (i == 3) {
                    parcel.enforceInterface("com.aide.engine.service.IRefactoringListener");
                    j2(parcel.readString());
                    return true;
                }
                if (i == 4) {
                    parcel.enforceInterface("com.aide.engine.service.IRefactoringListener");
                    cl(parcel.readArrayList(getClass().getClassLoader()));
                    return true;
                }
                if (i == 5) {
                    parcel.enforceInterface("com.aide.engine.service.IRefactoringListener");
                    Bw(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.IRefactoringListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -128927002054936680L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -2205740913142874883L)
    void Bw(String str, List list);

    @ey(method = -3797803826044189188L)
    void cl(List list);

    @ey(method = 5436566463138201216L)
    void d5(String str, String str2);

    @ey(method = -1691513147394532701L)
    void j2(String str);

    @ey(method = -557860811741827776L)
    void tn(String str, Map map);
}
