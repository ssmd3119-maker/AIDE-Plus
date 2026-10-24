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
import com.aide.ui.scm.IExternalGitServiceListener;
import com.probelytics.api.UserTouchAction;
import java.util.List;

@cy(clazz = -3289300689184181248L, container = -3289300689184181248L, user = true)
/* loaded from: classes.dex */
public interface IExternalGitService extends IInterface {

    @cy(clazz = -92320889473643040L, container = -92320889473643040L, user = true)
    public static abstract class Sub extends Binder implements IExternalGitService {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = -2389402995206386800L, container = -2389402995206386800L, user = true)
        private static class Proxy implements IExternalGitService {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = 2568995726341853540L)
            public static IExternalGitService mb;

            @dy(field = -2312851552959990945L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 38070869662587483L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(7649806317760715019L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 7649806317760715019L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = 3248068969645957680L)
            public void Bl(GitConfiguration gitConfiguration, String str, List<ModifiedFile> list, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.J8(-6149407163406511400L, this, gitConfiguration, str, list, str2, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        if (gitConfiguration != null) {
                            parcelObtain.writeInt(1);
                            gitConfiguration.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        parcelObtain.writeString(str);
                        parcelObtain.writeTypedList(list);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(6, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().Bl(gitConfiguration, str, list, str2, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, -6149407163406511400L, this, gitConfiguration, str, list, str2, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -975106165460335091L)
            public void Cd(GitConfiguration gitConfiguration, String str, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.we(339097764690690233L, this, gitConfiguration, str, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        if (gitConfiguration != null) {
                            parcelObtain.writeInt(1);
                            gitConfiguration.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        parcelObtain.writeString(str);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(4, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().Cd(gitConfiguration, str, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 339097764690690233L, this, gitConfiguration, str, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -2577002191322722905L)
            public void HE(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.we(-6551050206396694749L, this, str, str2, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(13, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().HE(str, str2, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, -6551050206396694749L, this, str, str2, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -1304555658830415576L)
            public void IE(GitConfiguration gitConfiguration, String str, String str2, String str3, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.J8(451734090950425536L, this, gitConfiguration, str, str2, str3, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        if (gitConfiguration != null) {
                            parcelObtain.writeInt(1);
                            gitConfiguration.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeString(str3);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(1, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().IE(gitConfiguration, str, str2, str3, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 451734090950425536L, this, gitConfiguration, str, str2, str3, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -749150668582516093L)
            public String JT(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.we(4264474588894135359L, this, str, str2, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (!this.WB.transact(8, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().JT(str, str2, iExternalGitServiceListener);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 4264474588894135359L, this, str, str2, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -731555501591008680L)
            public void MN(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.we(303983472959727848L, this, str, str2, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(14, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().MN(str, str2, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 303983472959727848L, this, str, str2, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 568813924485905517L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(-3648047990704426287L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3648047990704426287L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -3900999530318109915L)
            public List<String> cS(String str, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.EQ(1814645037757693665L, this, str, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (!this.WB.transact(10, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().cS(str, iExternalGitServiceListener);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.createStringArrayList();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 1814645037757693665L, this, str, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = 2176902323237025313L)
            public void cancel() {
                try {
                    if (jw) {
                        iy.gn(862614032023307533L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        if (this.WB.transact(15, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().cancel();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 862614032023307533L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -1959386449490710305L)
            public void cz(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.we(2354652673308857915L, this, str, str2, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(11, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().cz(str, str2, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 2354652673308857915L, this, str, str2, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = 1643801893365046937L)
            public GitStatus el(String str, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.EQ(-1809365635902785955L, this, str, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (!this.WB.transact(5, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().el(str, iExternalGitServiceListener);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0 ? GitStatus.CREATOR.createFromParcel(parcelObtain2) : null;
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, -1809365635902785955L, this, str, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = 907746355328607735L)
            public void of(GitConfiguration gitConfiguration, String str, String str2, List<String> list, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.J8(2639055885049139339L, this, gitConfiguration, str, str2, list, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        if (gitConfiguration != null) {
                            parcelObtain.writeInt(1);
                            gitConfiguration.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeStringList(list);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(2, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().of(gitConfiguration, str, str2, list, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 2639055885049139339L, this, gitConfiguration, str, str2, list, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -959563003649174660L)
            public void wN(GitConfiguration gitConfiguration, String str, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.we(319902406830217908L, this, gitConfiguration, str, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        if (gitConfiguration != null) {
                            parcelObtain.writeInt(1);
                            gitConfiguration.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        parcelObtain.writeString(str);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(3, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().wN(gitConfiguration, str, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 319902406830217908L, this, gitConfiguration, str, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = -6668198295154216236L)
            public void wX(String str, String str2, String str3, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.J0(3120820564058405052L, this, str, str2, str3, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeString(str3);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(12, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().wX(str, str2, str3, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, 3120820564058405052L, this, str, str2, str3, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = 819729935401472465L)
            public void yj(String str, List<ModifiedFile> list, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.we(-976418872392589067L, this, str, list, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeTypedList(list);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (this.WB.transact(7, parcelObtain, parcelObtain2, 0) || Sub.dx() == null) {
                            parcelObtain2.readException();
                        } else {
                            Sub.dx().yj(str, list, iExternalGitServiceListener);
                        }
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, -976418872392589067L, this, str, list, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.ui.scm.IExternalGitService
            @ey(method = 44652222642869856L)
            public String zg(String str, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (jw) {
                        iy.EQ(6066178735860375888L, this, str, iExternalGitServiceListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeStrongBinder(iExternalGitServiceListener != null ? iExternalGitServiceListener.asBinder() : null);
                        if (!this.WB.transact(9, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().zg(str, iExternalGitServiceListener);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 6066178735860375888L, this, str, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 601599386225941285L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-1351505026707989059L, null);
                }
                attachInterface(this, "com.aide.ui.scm.IExternalGitService");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1351505026707989059L, null);
                }
                throw th;
            }
        }

        @ey(method = 1970586248073904160L)
        public static IExternalGitService asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-278794636847752284L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.ui.scm.IExternalGitService");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IExternalGitService)) ? new Proxy(iBinder) : (IExternalGitService) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -278794636847752284L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = 4666963352471865720L)
        public static IExternalGitService dx() {
            try {
                if (WB) {
                    iy.gn(-3548900355238437024L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -3548900355238437024L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 1220933624005315545L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(1406788449176987749L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 1406788449176987749L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 170327050009506400L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-225619656116507084L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1598968902) {
                    parcel2.writeString("com.aide.ui.scm.IExternalGitService");
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        IE(parcel.readInt() != 0 ? GitConfiguration.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        of(parcel.readInt() != 0 ? GitConfiguration.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        wN(parcel.readInt() != 0 ? GitConfiguration.CREATOR.createFromParcel(parcel) : null, parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        Cd(parcel.readInt() != 0 ? GitConfiguration.CREATOR.createFromParcel(parcel) : null, parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        GitStatus gitStatusEl = el(parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (gitStatusEl != null) {
                            parcel2.writeInt(1);
                            gitStatusEl.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        Bl(parcel.readInt() != 0 ? GitConfiguration.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createTypedArrayList(ModifiedFile.CREATOR), parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        yj(parcel.readString(), parcel.createTypedArrayList(ModifiedFile.CREATOR), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        String strJT = JT(parcel.readString(), parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeString(strJT);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        String strZg = zg(parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeString(strZg);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        List<String> listCS = cS(parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeStringList(listCS);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        cz(parcel.readString(), parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        wX(parcel.readString(), parcel.readString(), parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        HE(parcel.readString(), parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        MN(parcel.readString(), parcel.readString(), IExternalGitServiceListener.Sub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        cancel();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -225619656116507084L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 6873839109583601184L)
    void Bl(GitConfiguration gitConfiguration, String str, List<ModifiedFile> list, String str2, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = 434104117631027415L)
    void Cd(GitConfiguration gitConfiguration, String str, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -6201317756672944507L)
    void HE(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -4645099607554982816L)
    void IE(GitConfiguration gitConfiguration, String str, String str2, String str3, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = 355378541389021605L)
    String JT(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -937363183473978252L)
    void MN(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -2555885116782656217L)
    List<String> cS(String str, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -1013216783082053245L)
    void cancel();

    @ey(method = 216151520902554057L)
    void cz(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -3153634784062699985L)
    GitStatus el(String str, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -2662716962336988123L)
    void of(GitConfiguration gitConfiguration, String str, String str2, List<String> list, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = 414163490444359808L)
    void wN(GitConfiguration gitConfiguration, String str, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = 6210650005721154216L)
    void wX(String str, String str2, String str3, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = 2699703980419356531L)
    void yj(String str, List<ModifiedFile> list, IExternalGitServiceListener iExternalGitServiceListener);

    @ey(method = -87878951498112728L)
    String zg(String str, IExternalGitServiceListener iExternalGitServiceListener);
}
