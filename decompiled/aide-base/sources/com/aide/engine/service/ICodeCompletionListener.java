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

@cy(clazz = -5959362661312958605L, container = -5959362661312958605L, user = true)
/* loaded from: classes.dex */
public interface ICodeCompletionListener extends IInterface {

    @cy(clazz = 636510100397657319L, container = 636510100397657319L, user = true)
    public static abstract class Sub extends Binder implements ICodeCompletionListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 4364956681717562459L, container = 4364956681717562459L, user = true)
        private static class Proxy implements ICodeCompletionListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 1631982065026142648L)
            public static ICodeCompletionListener mb;

            @dy(field = -3459046082940213659L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 161464855926417607L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(-2614232457135053832L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -2614232457135053832L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeCompletionListener
            @ey(method = -281920030875862379L)
            public void KH() {
                try {
                    if (jw) {
                        iy.gn(7276064415114448888L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                        if (this.WB.transact(2, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().KH();
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 7276064415114448888L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.aide.engine.service.ICodeCompletionListener$Sub$Proxy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v1 */
            @Override // com.aide.engine.service.ICodeCompletionListener
            @ey(method = 737911287991044393L)
            public void UI(String str, long j, int i, int i2, int i3, SourceEntity sourceEntity, String str2) throws Throwable {
                int i4 = this;
                try {
                    if (jw) {
                        iy.QX(2679379762904078000L, i4, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), sourceEntity, str2});
                    }
                    try {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                            parcelObtain.writeString(str);
                            parcelObtain.writeLong(j);
                            parcelObtain.writeInt(i);
                            parcelObtain.writeInt(i2);
                            parcelObtain.writeInt(i3);
                            if (sourceEntity != null) {
                                parcelObtain.writeInt(1);
                                sourceEntity.writeToParcel(parcelObtain, 0);
                            } else {
                                parcelObtain.writeInt(0);
                            }
                            parcelObtain.writeString(str2);
                            try {
                                if (i4.WB.transact(4, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                                    parcelObtain2.readException();
                                    parcelObtain2.recycle();
                                    parcelObtain.recycle();
                                } else {
                                    Sub.dx().UI(str, j, i, i2, i3, sourceEntity, str2);
                                    parcelObtain2.recycle();
                                    parcelObtain.recycle();
                                }
                            } catch (Throwable th) {
                                th = th;
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fY) {
                            Object[] objArr = new Object[i4];
                            objArr[0] = str;
                            objArr[1] = new Long(j);
                            objArr[2] = new Integer(i);
                            objArr[3] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = sourceEntity;
                            objArr[6] = str2;
                            iy.rN(th, 2679379762904078000L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i4 = 7;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 106183948412491457L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(-2399800017783731968L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -2399800017783731968L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeCompletionListener
            @ey(method = -3966296240187620096L)
            public void jw(String str, long j, int i, int i2) {
                try {
                    if (jw) {
                        iy.J0(-1170139112213791671L, this, str, new Long(j), new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                        parcelObtain.writeString(str);
                        parcelObtain.writeLong(j);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().jw(str, j, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, -1170139112213791671L, this, str, new Long(j), new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeCompletionListener
            @ey(method = 2231263262757348972L)
            public void pf(List list) {
                try {
                    if (jw) {
                        iy.tp(1097041912497978175L, this, list);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                        parcelObtain.writeList(list);
                        if (this.WB.transact(3, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().pf(list);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1097041912497978175L, this, list);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = -2762524610805867397L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-103535347972648032L, null);
                }
                attachInterface(this, "com.aide.engine.service.ICodeCompletionListener");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -103535347972648032L, null);
                }
                throw th;
            }
        }

        @ey(method = -1981667394882998920L)
        public static ICodeCompletionListener asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-1509738585364517119L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.ICodeCompletionListener");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICodeCompletionListener)) ? new Proxy(iBinder) : (ICodeCompletionListener) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -1509738585364517119L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -80328516987466188L)
        public static ICodeCompletionListener dx() {
            try {
                if (WB) {
                    iy.gn(-1161397478184315953L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1161397478184315953L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = -1647301021655456565L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(326068616151350860L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 326068616151350860L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = -422489000073423360L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(194022139227402401L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1) {
                    parcel.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                    jw(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt());
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                    KH();
                    parcel2.writeNoException();
                    return true;
                }
                if (i == 3) {
                    parcel.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                    pf(parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 4) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.aide.engine.service.ICodeCompletionListener");
                    return true;
                }
                parcel.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                UI(parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? SourceEntity.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, 194022139227402401L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = -5431725267019910640L)
    void KH();

    @ey(method = -4063934693967167580L)
    void UI(String str, long j, int i, int i2, int i3, SourceEntity sourceEntity, String str2);

    @ey(method = -488276438826645615L)
    void jw(String str, long j, int i, int i2);

    @ey(method = -2248310031202146065L)
    void pf(List list);
}
