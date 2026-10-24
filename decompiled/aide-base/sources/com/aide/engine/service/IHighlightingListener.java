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
import com.aide.engine.FileHighlightings;

@cy(clazz = -523971930528201060L, container = -523971930528201060L, user = true)
/* loaded from: classes.dex */
public interface IHighlightingListener extends IInterface {

    @cy(clazz = -957397753231774760L, container = -957397753231774760L, user = true)
    public static abstract class Sub extends Binder implements IHighlightingListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 3942163705457141568L, container = 3942163705457141568L, user = true)
        private static class Proxy implements IHighlightingListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 1779664913814997440L)
            public static IHighlightingListener mb;

            @dy(field = -1495824422362306387L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 29365183006822557L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(3250777090605377157L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 3250777090605377157L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IHighlightingListener
            @ey(method = -2388320162283844125L)
            public void IS(FileHighlightings fileHighlightings) {
                try {
                    if (jw) {
                        iy.tp(-186412253288326429L, this, fileHighlightings);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IHighlightingListener");
                        if (fileHighlightings != null) {
                            parcelObtain.writeInt(1);
                            fileHighlightings.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().IS(fileHighlightings);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -186412253288326429L, this, fileHighlightings);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = -2315648817761525845L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(2675077546452466803L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 2675077546452466803L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.IHighlightingListener
            @ey(method = 1261223800204469472L)
            public void kQ(FileHighlightings fileHighlightings) {
                try {
                    if (jw) {
                        iy.tp(1065997172123580224L, this, fileHighlightings);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.IHighlightingListener");
                        if (fileHighlightings != null) {
                            parcelObtain.writeInt(1);
                            fileHighlightings.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().kQ(fileHighlightings);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1065997172123580224L, this, fileHighlightings);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -286226808977532384L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(1326560728146564105L, null);
                }
                attachInterface(this, "com.aide.engine.service.IHighlightingListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1326560728146564105L, null);
                }
                throw th;
            }
        }

        @ey(method = 1192194439550807573L)
        public static IHighlightingListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-819741945735097924L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.IHighlightingListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHighlightingListener)) ? new Proxy(iBinder) : (IHighlightingListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -819741945735097924L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = 545557076367726683L)
        public static IHighlightingListener dx() {
            try {
                if (WB) {
                    iy.gn(1120276946873153712L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1120276946873153712L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -2592974746000882828L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-2000415084153274839L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -2000415084153274839L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = -418288073629201659L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-764330066633289156L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.IHighlightingListener");
                    kQ(parcel.readInt() != 0 ? FileHighlightings.CREATOR.createFromParcel(parcel) : null);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.IHighlightingListener");
                    IS(parcel.readInt() != 0 ? FileHighlightings.CREATOR.createFromParcel(parcel) : null);
                    return true;
                }
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.aide.engine.service.IHighlightingListener");
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -764330066633289156L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -4075569427469953424L)
    void IS(FileHighlightings fileHighlightings);

    @ey(method = -726192917523582001L)
    void kQ(FileHighlightings fileHighlightings);
}
