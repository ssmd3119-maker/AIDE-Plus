package com.aide.ui.scm;

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
import com.probelytics.api.UserTouchAction;

@cy(clazz = 271007653359529800L, container = 271007653359529800L, user = true)
/* loaded from: classes.dex */
public interface IExternalGitServiceListener extends IInterface {

    @cy(clazz = -75292738475704224L, container = -75292738475704224L, user = true)
    public static abstract class Sub extends Binder implements IExternalGitServiceListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 1769310402124146060L, container = 1769310402124146060L, user = true)
        private static class Proxy implements IExternalGitServiceListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -1975287611966469795L)
            public static IExternalGitServiceListener mb;

            @dy(field = 2605735078457432740L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = -126305190805034832L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(3657393273991967821L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 3657393273991967821L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 3666331541234062272L)
            public void AJ(int i) {
                try {
                    if (jw) {
                        iy.u7(3884279348453324489L, this, i);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(3, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().AJ(i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 3884279348453324489L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 77970837858119369L)
            public void J1() {
                try {
                    if (jw) {
                        iy.gn(9054720688640447232L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        if (this.WB.transact(6, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().J1();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 9054720688640447232L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 2243002023093406304L)
            public String Lg(String str) {
                try {
                    if (jw) {
                        iy.tp(1718325278337891977L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeString(str);
                        if (!this.WB.transact(10, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().Lg(str);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1718325278337891977L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 1901013537234193977L)
            public void Yd(int i) {
                try {
                    if (jw) {
                        iy.u7(74299071085801184L, this, i);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Yd(i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 74299071085801184L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 955421926645466160L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(376890077327611755L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 376890077327611755L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = -7972130897108915488L)
            public void d4(String str, int i) {
                try {
                    if (jw) {
                        iy.EQ(-4582302356813538255L, this, str, new Integer(i));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().d4(str, i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, -4582302356813538255L, this, str, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 1010551025583196545L)
            public void gy() {
                try {
                    if (jw) {
                        iy.gn(-6239299140722944296L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        if (this.WB.transact(4, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().gy();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -6239299140722944296L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 104818750393487403L)
            public void iE(String str) {
                try {
                    if (jw) {
                        iy.tp(-1410628556978082288L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(11, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().iE(str);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -1410628556978082288L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 4411913705829546363L)
            public String jB(String str) {
                try {
                    if (jw) {
                        iy.tp(2326452910124797440L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeString(str);
                        if (!this.WB.transact(8, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().jB(str);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 2326452910124797440L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 771771530722102475L)
            public String nV(String str) {
                try {
                    if (jw) {
                        iy.tp(1218636531025912620L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeString(str);
                        if (!this.WB.transact(9, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().nV(str);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1218636531025912620L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 454165782073168896L)
            public void oP() {
                try {
                    if (jw) {
                        iy.gn(-2562596891552475437L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        if (this.WB.transact(7, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().oP();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2562596891552475437L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitServiceListener
            @ey(method = 6488955455472510525L)
            public void qi(String str) {
                try {
                    if (jw) {
                        iy.tp(-6095350490977850336L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(5, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().qi(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -6095350490977850336L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 663755890561581928L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-863354461294087119L, null);
                }
                attachInterface(this, "com.aide.ui.scm.IExternalGitServiceListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -863354461294087119L, null);
                }
                throw th;
            }
        }

        @ey(method = 2188360753904221311L)
        public static IExternalGitServiceListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(1451392838563900000L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.ui.scm.IExternalGitServiceListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IExternalGitServiceListener)) ? new Proxy(iBinder) : (IExternalGitServiceListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, 1451392838563900000L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -4585014883417717215L)
        public static IExternalGitServiceListener dx() {
            try {
                if (WB) {
                    iy.gn(-2260755245131520544L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2260755245131520544L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -3559461189940549368L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-1930049053568823639L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1930049053568823639L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 99466071649316887L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-147276187912918080L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1598968902) {
                    parcel2.writeString("com.aide.ui.scm.IExternalGitServiceListener");
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        Yd(parcel.readInt());
                        return true;
                    case 2:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        d4(parcel.readString(), parcel.readInt());
                        return true;
                    case 3:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        AJ(parcel.readInt());
                        return true;
                    case 4:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        gy();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        qi(parcel.readString());
                        return true;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        J1();
                        return true;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        oP();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        String strJB = jB(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(strJB);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        String strNV = nV(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(strNV);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        String strLg = Lg(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(strLg);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        iE(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -147276187912918080L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 1475863024592823552L)
    void AJ(int i);

    @ey(method = 177975660941370795L)
    void J1();

    @ey(method = 340907009608171408L)
    String Lg(String str);

    @ey(method = 3750127829117563751L)
    void Yd(int i);

    @ey(method = -6229528411163754600L)
    void d4(String str, int i);

    @ey(method = 1785284431041688655L)
    void gy();

    @ey(method = -1246965855030999411L)
    void iE(String str);

    @ey(method = -4873651070044992483L)
    String jB(String str);

    @ey(method = -724205665305608447L)
    String nV(String str);

    @ey(method = 1355557133706973472L)
    void oP();

    @ey(method = 7358033522648253375L)
    void qi(String str);
}
