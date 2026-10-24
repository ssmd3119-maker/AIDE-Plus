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
import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.SourceEntity;
import com.aide.engine.SyntaxError;
import com.aide.engine.service.IBuildListener;
import com.aide.engine.service.ICodeCompletionListener;
import com.aide.engine.service.IEngineErrorListener;
import com.aide.engine.service.IEngineListener;
import com.aide.engine.service.IGotoSymbolListener;
import com.aide.engine.service.IHighlightingListener;
import com.aide.engine.service.INavigationListener;
import com.aide.engine.service.IOpenFileInterface;
import com.aide.engine.service.IRefactoringListener;
import com.aide.engine.service.IUsageSearcherListener;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;
import java.util.Map;

@cy(clazz = 932750836601812032L, container = 932750836601812032L, user = true)
/* loaded from: classes.dex */
public interface ICodeAnalysisEngineService extends IInterface {

    @cy(clazz = 1252074439271107008L, container = 1252074439271107008L, user = true)
    public static abstract class Sub extends Binder implements ICodeAnalysisEngineService {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        @cy(clazz = 6296192520779982984L, container = 6296192520779982984L, user = true)
        private static class Proxy implements ICodeAnalysisEngineService {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -1407406545762088249L)
            public static ICodeAnalysisEngineService mb;

            @dy(field = 3113312283852464472L)
            private IBinder WB;

            static {
                iy.Zo(Proxy.class);
            }

            @ey(method = 73544983290837632L)
            Proxy(IBinder iBinder) {
                try {
                    if (jw) {
                        iy.tp(684544601086759625L, null, iBinder);
                    }
                    this.WB = iBinder;
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 684544601086759625L, null, iBinder);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1081054863746680128L)
            public void BT() {
                try {
                    if (jw) {
                        iy.gn(-1210484321474023223L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(6, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().BT();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1210484321474023223L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1888855725093636096L)
            public void C5(String str, String str2, int i) {
                try {
                    if (jw) {
                        iy.we(135345662403351199L, this, str, str2, new Integer(i));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(57, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().C5(str, str2, i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 135345662403351199L, this, str, str2, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -1387658348233195489L)
            public void Dt(String str, int i, int i2) {
                try {
                    if (jw) {
                        iy.we(150690458232424972L, this, str, new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(45, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Dt(str, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 150690458232424972L, this, str, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 53472867139022508L)
            public void HG(String str, int i, int i2, int i3, int i4) {
                try {
                    if (jw) {
                        iy.J8(-6355902888188834643L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        parcelObtain.writeInt(i4);
                        if (this.WB.transact(35, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().HG(str, i, i2, i3, i4);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, -6355902888188834643L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -2638208819407251279L)
            public void IM(String str, int i) {
                try {
                    if (jw) {
                        iy.EQ(-2058888655274695084L, this, str, new Integer(i));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(28, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().IM(str, i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, -2058888655274695084L, this, str, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -545008239717319737L)
            public void Jt(String str) {
                try {
                    if (jw) {
                        iy.tp(333327031313852300L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(56, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Jt(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 333327031313852300L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -1040607697599345192L)
            public void Lq(String str, String str2, int i, int i2, int i3, int i4) throws Throwable {
                Parcel parcel;
                int i5 = 5;
                try {
                    if (jw) {
                        iy.QX(-1121232600978213499L, this, new Object[]{str, str2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    }
                    try {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                            parcelObtain.writeString(str);
                            parcelObtain.writeString(str2);
                            parcelObtain.writeInt(i);
                            parcelObtain.writeInt(i2);
                            parcelObtain.writeInt(i3);
                            parcelObtain.writeInt(i4);
                            if (this.WB.transact(48, parcelObtain, null, 1) || Sub.dx() == null) {
                                parcelObtain.recycle();
                                return;
                            }
                            parcel = parcelObtain;
                            try {
                                Sub.dx().Lq(str, str2, i, i2, i3, i4);
                                parcel.recycle();
                            } catch (Throwable th) {
                                th = th;
                                parcel.recycle();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcel = parcelObtain;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fY) {
                            Object[] objArr = new Object[i5];
                            objArr[0] = str;
                            objArr[1] = str2;
                            objArr[2] = new Integer(i);
                            objArr[3] = new Integer(i2);
                            objArr[4] = new Integer(i3);
                            objArr[5] = new Integer(i4);
                            iy.rN(th, -1121232600978213499L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i5 = 6;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 642717624146948779L)
            public void N7(IEngineErrorListener iEngineErrorListener) {
                try {
                    if (jw) {
                        iy.tp(-3541075270241549384L, this, iEngineErrorListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iEngineErrorListener != null ? iEngineErrorListener.asBinder() : null);
                        if (this.WB.transact(20, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().N7(iEngineErrorListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -3541075270241549384L, this, iEngineErrorListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 3310422195923415153L)
            public void QD(String str, int i) {
                try {
                    if (jw) {
                        iy.EQ(930466079488484600L, this, str, new Integer(i));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(37, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().QD(str, i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 930466079488484600L, this, str, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -1795456505879195337L)
            public void QW() {
                try {
                    if (jw) {
                        iy.gn(2155478728713855336L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(12, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().QW();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 2155478728713855336L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1977064045115720040L)
            public void RW(IHighlightingListener iHighlightingListener) {
                try {
                    if (jw) {
                        iy.tp(1283836395842426103L, this, iHighlightingListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iHighlightingListener != null ? iHighlightingListener.asBinder() : null);
                        if (this.WB.transact(23, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().RW(iHighlightingListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 1283836395842426103L, this, iHighlightingListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 6009660054259757232L)
            public void Ss(SyntaxError syntaxError, int i) {
                try {
                    if (jw) {
                        iy.EQ(5904475770270436713L, this, syntaxError, new Integer(i));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (syntaxError != null) {
                            parcelObtain.writeInt(1);
                            syntaxError.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(34, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Ss(syntaxError, i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 5904475770270436713L, this, syntaxError, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -1195311886087127040L)
            public void TE(int i, int i2, Map map, Map map2) {
                try {
                    if (jw) {
                        iy.J0(2844100442307735L, this, new Integer(i), new Integer(i2), map, map2);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeMap(map);
                        parcelObtain.writeMap(map2);
                        if (this.WB.transact(5, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().TE(i, i2, map, map2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, 2844100442307735L, this, new Integer(i), new Integer(i2), map, map2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 2336481517746064356L)
            public void VD() {
                try {
                    if (jw) {
                        iy.gn(1827040234629430937L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(14, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().VD();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1827040234629430937L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -173964349232729088L)
            public void Vq(String str, int i, int i2, int i3, int i4) {
                try {
                    if (jw) {
                        iy.J8(5936155867197779283L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        parcelObtain.writeInt(i4);
                        if (this.WB.transact(41, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Vq(str, i, i2, i3, i4);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 5936155867197779283L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -3462408794659720936L)
            public void W(String str) {
                try {
                    if (jw) {
                        iy.tp(-5223376395329869875L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(19, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().W(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -5223376395329869875L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 8374607371514872887L)
            public List WD(String str, int i, int i2, int i3) {
                try {
                    if (jw) {
                        iy.J0(407749672925522720L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        if (!this.WB.transact(32, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().WD(str, i, i2, i3);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readArrayList(getClass().getClassLoader());
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, 407749672925522720L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1315423342256737680L)
            public void Wv(String str, int i, int i2) {
                try {
                    if (jw) {
                        iy.we(-568572185406479065L, this, str, new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(49, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Wv(str, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, -568572185406479065L, this, str, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 2631058623384350775L)
            public void XL() {
                try {
                    if (jw) {
                        iy.gn(2245514017496742848L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(13, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().XL();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 2245514017496742848L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 3673391500854919501L)
            public void Xz() {
                try {
                    if (jw) {
                        iy.gn(2977607010392579232L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(10, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().Xz();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 2977607010392579232L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 2899691075949490000L)
            public void addEngineSolutionProject(EngineSolutionProject engineSolutionProject) {
                try {
                    if (jw) {
                        iy.tp(556603230130029159L, this, engineSolutionProject);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (engineSolutionProject != null) {
                            parcelObtain.writeInt(1);
                            engineSolutionProject.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(3, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().addEngineSolutionProject(engineSolutionProject);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 556603230130029159L, this, engineSolutionProject);
                    }
                    throw th;
                }
            }

            @Override // android.os.IInterface
            @ey(method = 822161608314421248L)
            public IBinder asBinder() {
                try {
                    if (jw) {
                        iy.gn(1499541562452648183L, this);
                    }
                    return this.WB;
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 1499541562452648183L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 2243238874814378480L)
            public List be(String str, int i, int i2, int i3) {
                try {
                    if (jw) {
                        iy.J0(-95649875483903505L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        if (!this.WB.transact(31, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().be(str, i, i2, i3);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readArrayList(getClass().getClassLoader());
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, -95649875483903505L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -3075397926060040696L)
            public void bp(String str, Map map) {
                try {
                    if (jw) {
                        iy.EQ(-1714179863033972327L, this, str, map);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeMap(map);
                        if (this.WB.transact(47, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().bp(str, map);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, -1714179863033972327L, this, str, map);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1140544348067712168L)
            public void dP(String str, int i, int i2, int i3, int i4) {
                try {
                    if (jw) {
                        iy.J8(1864880884407006265L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        parcelObtain.writeInt(i4);
                        if (this.WB.transact(42, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().dP(str, i, i2, i3, i4);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 1864880884407006265L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -258968663256315887L)
            public void df(IRefactoringListener iRefactoringListener) {
                try {
                    if (jw) {
                        iy.tp(-119917612892255612L, this, iRefactoringListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iRefactoringListener != null ? iRefactoringListener.asBinder() : null);
                        if (this.WB.transact(22, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().df(iRefactoringListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -119917612892255612L, this, iRefactoringListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -2253190878542788240L)
            public void et() {
                try {
                    if (jw) {
                        iy.gn(-4269231443477407345L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(8, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().et();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -4269231443477407345L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -4434669010851874200L)
            public void ez() {
                try {
                    if (jw) {
                        iy.gn(-3440541676653776735L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(9, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().ez();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -3440541676653776735L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -44919003549901789L)
            public void fm() {
                try {
                    if (jw) {
                        iy.gn(-6577852935267767280L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(15, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().fm();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -6577852935267767280L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1805092577718597640L)
            public void hp(IBuildListener iBuildListener) {
                try {
                    if (jw) {
                        iy.tp(-2740116060184705455L, this, iBuildListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iBuildListener != null ? iBuildListener.asBinder() : null);
                        if (this.WB.transact(21, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().hp(iBuildListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -2740116060184705455L, this, iBuildListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1535940331401638592L)
            public void iQ(String str, int i, int i2) {
                try {
                    if (jw) {
                        iy.we(593943800375018951L, this, str, new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(55, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().iQ(str, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 593943800375018951L, this, str, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 110944683291746016L)
            public void jA(String str, IOpenFileInterface iOpenFileInterface) {
                try {
                    if (jw) {
                        iy.EQ(-820116123552435147L, this, str, iOpenFileInterface);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeStrongBinder(iOpenFileInterface != null ? iOpenFileInterface.asBinder() : null);
                        if (this.WB.transact(18, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().jA(str, iOpenFileInterface);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, -820116123552435147L, this, str, iOpenFileInterface);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -4873344286411803757L)
            public void jn(String str, int i) {
                try {
                    if (jw) {
                        iy.EQ(2257618028371478036L, this, str, new Integer(i));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(16, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().jn(str, i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 2257618028371478036L, this, str, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 732462088901683821L)
            public void k1(String str, int i, int i2, int i3, int i4) {
                try {
                    if (jw) {
                        iy.J8(6359107388580247980L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        parcelObtain.writeInt(i4);
                        if (this.WB.transact(36, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().k1(str, i, i2, i3, i4);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 6359107388580247980L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -2704777539295582709L)
            public void kw(String str, int i, int i2, int i3, int i4) {
                try {
                    if (jw) {
                        iy.J8(2968680819387528024L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        parcelObtain.writeInt(i4);
                        if (this.WB.transact(46, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().kw(str, i, i2, i3, i4);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 2968680819387528024L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 2496689971634072357L)
            public void ky(String str) {
                try {
                    if (jw) {
                        iy.tp(-5153016487346449920L, this, str);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        if (this.WB.transact(54, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().ky(str);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -5153016487346449920L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 704093742197838207L)
            public void lU(String str, int i, int i2) {
                try {
                    if (jw) {
                        iy.we(-1275897523939161760L, this, str, new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(33, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().lU(str, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, -1275897523939161760L, this, str, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -2422958702572094600L)
            public void lj(String str, String str2) {
                try {
                    if (jw) {
                        iy.EQ(1940864823687304593L, this, str, str2);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        if (this.WB.transact(17, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().lj(str, str2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 1940864823687304593L, this, str, str2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 4119688892188948425L)
            public void mF(String str, int i, int i2, int i3) {
                try {
                    if (jw) {
                        iy.J0(-2041436274064175120L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        if (this.WB.transact(44, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().mF(str, i, i2, i3);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, -2041436274064175120L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -498348634600261120L)
            public List mn(String str, int i, int i2, char c, int i3) {
                try {
                    if (jw) {
                        iy.J8(-4562616859551405109L, this, str, new Integer(i), new Integer(i2), new Character(c), new Integer(i3));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(c);
                        parcelObtain.writeInt(i3);
                        if (!this.WB.transact(30, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().mn(str, i, i2, c, i3);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readArrayList(getClass().getClassLoader());
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, -4562616859551405109L, this, str, new Integer(i), new Integer(i2), new Character(c), new Integer(i3));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -4750284874040723296L)
            public void oK(String str, int i, int i2) {
                try {
                    if (jw) {
                        iy.we(1994194591013995093L, this, str, new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(52, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().oK(str, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 1994194591013995093L, this, str, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 3272396540342849280L)
            public void om(String str, int i, int i2, SourceEntity sourceEntity) {
                try {
                    if (jw) {
                        iy.J0(847125185381338479L, this, str, new Integer(i), new Integer(i2), sourceEntity);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (sourceEntity != null) {
                            parcelObtain.writeInt(1);
                            sourceEntity.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(59, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().om(str, i, i2, sourceEntity);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, 847125185381338479L, this, str, new Integer(i), new Integer(i2), sourceEntity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 18175777499020800L)
            public void pQ(SourceEntity sourceEntity) {
                try {
                    if (jw) {
                        iy.tp(68102787349910065L, this, sourceEntity);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (sourceEntity != null) {
                            parcelObtain.writeInt(1);
                            sourceEntity.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(39, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().pQ(sourceEntity);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 68102787349910065L, this, sourceEntity);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 2002734780902036544L)
            public List s2(String str, int i, int i2, int i3) {
                try {
                    if (jw) {
                        iy.J0(-496287099031086121L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        if (!this.WB.transact(29, parcelObtain, parcelObtain2, 0) && Sub.dx() != null) {
                            return Sub.dx().s2(str, i, i2, i3);
                        }
                        parcelObtain2.readException();
                        return parcelObtain2.readArrayList(getClass().getClassLoader());
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, -496287099031086121L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 3653890413702060485L)
            public void sI() {
                try {
                    if (jw) {
                        iy.gn(2961565533484416572L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(7, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().sI();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, 2961565533484416572L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -2796777013986968775L)
            public void setCodeCompletionListener(ICodeCompletionListener iCodeCompletionListener) {
                try {
                    if (jw) {
                        iy.tp(-2730987909862751580L, this, iCodeCompletionListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iCodeCompletionListener != null ? iCodeCompletionListener.asBinder() : null);
                        if (this.WB.transact(26, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().setCodeCompletionListener(iCodeCompletionListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -2730987909862751580L, this, iCodeCompletionListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 2286253920877028352L)
            public void setEngineListener(IEngineListener iEngineListener) {
                try {
                    if (jw) {
                        iy.tp(-2150037510539950719L, this, iEngineListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iEngineListener != null ? iEngineListener.asBinder() : null);
                        if (this.WB.transact(1, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().setEngineListener(iEngineListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -2150037510539950719L, this, iEngineListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -4316659026684918368L)
            public void setEngineSolution(EngineSolution engineSolution) {
                try {
                    if (jw) {
                        iy.tp(-2125450544685574349L, this, engineSolution);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (engineSolution != null) {
                            parcelObtain.writeInt(1);
                            engineSolution.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(2, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().setEngineSolution(engineSolution);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -2125450544685574349L, this, engineSolution);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 244825327996794240L)
            public void setGotoSymbolListener(IGotoSymbolListener iGotoSymbolListener) {
                try {
                    if (jw) {
                        iy.tp(-916996975681765663L, this, iGotoSymbolListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iGotoSymbolListener != null ? iGotoSymbolListener.asBinder() : null);
                        if (this.WB.transact(27, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().setGotoSymbolListener(iGotoSymbolListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -916996975681765663L, this, iGotoSymbolListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -1608726732127303728L)
            public void setNavigationListener(INavigationListener iNavigationListener) {
                try {
                    if (jw) {
                        iy.tp(-748714917164874639L, this, iNavigationListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iNavigationListener != null ? iNavigationListener.asBinder() : null);
                        if (this.WB.transact(25, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().setNavigationListener(iNavigationListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, -748714917164874639L, this, iNavigationListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 1417905362494132508L)
            public void setUsageSearcherListener(IUsageSearcherListener iUsageSearcherListener) {
                try {
                    if (jw) {
                        iy.tp(901941355945655685L, this, iUsageSearcherListener);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeStrongBinder(iUsageSearcherListener != null ? iUsageSearcherListener.asBinder() : null);
                        if (this.WB.transact(24, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().setUsageSearcherListener(iUsageSearcherListener);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.j3(th, 901941355945655685L, this, iUsageSearcherListener);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -2683976374949081544L)
            public void shutdown() {
                try {
                    if (jw) {
                        iy.gn(-1529456848792363875L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(11, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().shutdown();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1529456848792363875L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 6106877148328274225L)
            public void uC(String str, int i, int i2) {
                try {
                    if (jw) {
                        iy.we(3862852893460356292L, this, str, new Integer(i), new Integer(i2));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        if (this.WB.transact(50, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().uC(str, i, i2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.U2(th, 3862852893460356292L, this, str, new Integer(i), new Integer(i2));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 5517877485416252751L)
            public void updateEngineSolution() {
                try {
                    if (jw) {
                        iy.gn(-1204207154687318608L, this);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        if (this.WB.transact(4, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().updateEngineSolution();
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.aM(th, -1204207154687318608L, this);
                    }
                    throw th;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.aide.engine.service.ICodeAnalysisEngineService$Sub$Proxy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v1 */
            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 198005852156487977L)
            public void w1(String str, int i, int i2, int i3, int i4, String str2, String str3) throws Throwable {
                Parcel parcel;
                int i5 = this;
                try {
                    if (jw) {
                        iy.QX(-210954493836301740L, i5, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2, str3});
                    }
                    try {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                            parcelObtain.writeString(str);
                            parcelObtain.writeInt(i);
                            parcelObtain.writeInt(i2);
                            parcelObtain.writeInt(i3);
                            parcelObtain.writeInt(i4);
                            parcelObtain.writeString(str2);
                            parcelObtain.writeString(str3);
                            if (i5.WB.transact(43, parcelObtain, null, 1) || Sub.dx() == null) {
                                parcelObtain.recycle();
                                return;
                            }
                            parcel = parcelObtain;
                            try {
                                Sub.dx().w1(str, i, i2, i3, i4, str2, str3);
                                parcel.recycle();
                            } catch (Throwable th) {
                                th = th;
                                parcel.recycle();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcel = parcelObtain;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fY) {
                            Object[] objArr = new Object[i5];
                            objArr[0] = str;
                            objArr[1] = new Integer(i);
                            objArr[2] = new Integer(i2);
                            objArr[3] = new Integer(i3);
                            objArr[4] = new Integer(i4);
                            objArr[5] = str2;
                            objArr[6] = str3;
                            iy.rN(th, -210954493836301740L, this, objArr);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i5 = 7;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -707406333730090569L)
            public void w2(String str, int i, int i2, boolean z) {
                try {
                    if (jw) {
                        iy.J0(-3867478530714538704L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(z ? 1 : 0);
                        if (this.WB.transact(53, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().w2(str, i, i2, z);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.a8(th, -3867478530714538704L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -5902208624884209L)
            public void wT(String str, int i) {
                try {
                    if (jw) {
                        iy.EQ(3619511973323212680L, this, str, new Integer(i));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        if (this.WB.transact(38, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().wT(str, i);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 3619511973323212680L, this, str, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -3512951385763842468L)
            public void wa(String str, String str2) {
                try {
                    if (jw) {
                        iy.EQ(-4605139450570357403L, this, str, str2);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        if (this.WB.transact(51, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().wa(str, str2);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, -4605139450570357403L, this, str, str2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = -1387142282815989476L)
            public void yu(String str, int i, int i2, int i3, int i4) {
                try {
                    if (jw) {
                        iy.J8(2252481455433221925L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeInt(i3);
                        parcelObtain.writeInt(i4);
                        if (this.WB.transact(40, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().yu(str, i, i2, i3, i4);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.lg(th, 2252481455433221925L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.service.ICodeAnalysisEngineService
            @ey(method = 719269385029675305L)
            public void yw(String str, SourceEntity sourceEntity) {
                try {
                    if (jw) {
                        iy.EQ(1215060827583516672L, this, str, sourceEntity);
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.aide.engine.service.ICodeAnalysisEngineService");
                        parcelObtain.writeString(str);
                        if (sourceEntity != null) {
                            parcelObtain.writeInt(1);
                            sourceEntity.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        if (this.WB.transact(58, parcelObtain, null, 1) || Sub.dx() == null) {
                            return;
                        }
                        Sub.dx().yw(str, sourceEntity);
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 1215060827583516672L, this, str, sourceEntity);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(Sub.class);
        }

        @ey(method = 1578294669834186889L)
        public Sub() {
            try {
                if (WB) {
                    iy.gn(-141415087251683355L, null);
                }
                attachInterface(this, "com.aide.engine.service.ICodeAnalysisEngineService");
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -141415087251683355L, null);
                }
                throw th;
            }
        }

        @ey(method = 3219079053571305444L)
        public static ICodeAnalysisEngineService asInterface(IBinder iBinder) {
            try {
                if (WB) {
                    iy.tp(-2113401475633415504L, null, iBinder);
                }
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICodeAnalysisEngineService)) ? new Proxy(iBinder) : (ICodeAnalysisEngineService) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                if (mb) {
                    iy.j3(th, -2113401475633415504L, null, iBinder);
                }
                throw th;
            }
        }

        @ey(method = -4489151205090372000L)
        public static ICodeAnalysisEngineService dx() {
            try {
                if (WB) {
                    iy.gn(2046277310881184040L, null);
                }
                return Proxy.mb;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, 2046277310881184040L, null);
                }
                throw th;
            }
        }

        @Override // android.os.IInterface
        @ey(method = 2578224511117599557L)
        public IBinder asBinder() {
            try {
                if (WB) {
                    iy.gn(-1451418351458354187L, this);
                }
                return this;
            } catch (Throwable th) {
                if (mb) {
                    iy.aM(th, -1451418351458354187L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Binder
        @ey(method = 602191533156274420L)
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (WB) {
                    iy.J0(-549069897831893568L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                if (i == 1598968902) {
                    parcel2.writeString("com.aide.engine.service.ICodeAnalysisEngineService");
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        setEngineListener(IEngineListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        setEngineSolution(parcel.readInt() != 0 ? EngineSolution.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        addEngineSolutionProject(parcel.readInt() != 0 ? EngineSolutionProject.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        updateEngineSolution();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        int i3 = parcel.readInt();
                        int i4 = parcel.readInt();
                        ClassLoader classLoader = getClass().getClassLoader();
                        TE(i3, i4, parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
                        return true;
                    case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        BT();
                        return true;
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        sI();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        et();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        ez();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        Xz();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        shutdown();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        QW();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        XL();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        VD();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        fm();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        jn(parcel.readString(), parcel.readInt());
                        return true;
                    case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        lj(parcel.readString(), parcel.readString());
                        return true;
                    case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        jA(parcel.readString(), IOpenFileInterface.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 19:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        W(parcel.readString());
                        return true;
                    case ProxyTextView.INPUTTYPE_date /* 20 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        N7(IEngineErrorListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 21:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        hp(IBuildListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 22:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        df(IRefactoringListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 23:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        RW(IHighlightingListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 24:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        setUsageSearcherListener(IUsageSearcherListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 25:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        setNavigationListener(INavigationListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 26:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        setCodeCompletionListener(ICodeCompletionListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 27:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        setGotoSymbolListener(IGotoSymbolListener.Sub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 28:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        IM(parcel.readString(), parcel.readInt());
                        return true;
                    case 29:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        List listS2 = s2(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeList(listS2);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        List listMn = mn(parcel.readString(), parcel.readInt(), parcel.readInt(), (char) parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeList(listMn);
                        return true;
                    case 31:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        List listBe = be(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeList(listBe);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        List listWD = WD(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeList(listWD);
                        return true;
                    case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        lU(parcel.readString(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 34:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        Ss(parcel.readInt() != 0 ? SyntaxError.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        return true;
                    case 35:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        HG(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case ProxyTextView.INPUTTYPE_time /* 36 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        k1(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 37:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        QD(parcel.readString(), parcel.readInt());
                        return true;
                    case 38:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        wT(parcel.readString(), parcel.readInt());
                        return true;
                    case 39:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        pQ(parcel.readInt() != 0 ? SourceEntity.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 40:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        yu(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 41:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        Vq(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 42:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        dP(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 43:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        w1(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                        return true;
                    case 44:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        mF(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 45:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        Dt(parcel.readString(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 46:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        kw(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 47:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        bp(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                        return true;
                    case 48:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        Lq(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        return true;
                    case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        Wv(parcel.readString(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 50:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        uC(parcel.readString(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 51:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        wa(parcel.readString(), parcel.readString());
                        return true;
                    case 52:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        oK(parcel.readString(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 53:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        w2(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                        return true;
                    case 54:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        ky(parcel.readString());
                        return true;
                    case 55:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        iQ(parcel.readString(), parcel.readInt(), parcel.readInt());
                        return true;
                    case 56:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        Jt(parcel.readString());
                        return true;
                    case 57:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        C5(parcel.readString(), parcel.readString(), parcel.readInt());
                        return true;
                    case 58:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        yw(parcel.readString(), parcel.readInt() != 0 ? SourceEntity.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 59:
                        parcel.enforceInterface("com.aide.engine.service.ICodeAnalysisEngineService");
                        om(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? SourceEntity.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } catch (Throwable th) {
                if (mb) {
                    iy.a8(th, -549069897831893568L, this, new Integer(i), parcel, parcel2, new Integer(i2));
                }
                throw th;
            }
        }
    }

    @ey(method = 424620879186700897L)
    void BT();

    @ey(method = 2005028739186982407L)
    void C5(String str, String str2, int i);

    @ey(method = -609671068578175844L)
    void Dt(String str, int i, int i2);

    @ey(method = -81757409872499979L)
    void HG(String str, int i, int i2, int i3, int i4);

    @ey(method = -5043158941829864700L)
    void IM(String str, int i);

    @ey(method = -464115597426103428L)
    void Jt(String str);

    @ey(method = -266265219096285699L)
    void Lq(String str, String str2, int i, int i2, int i3, int i4);

    @ey(method = -542661058232629704L)
    void N7(IEngineErrorListener iEngineErrorListener);

    @ey(method = -4572493844848807240L)
    void QD(String str, int i);

    @ey(method = 1602954360148613784L)
    void QW();

    @ey(method = 2567550585702051231L)
    void RW(IHighlightingListener iHighlightingListener);

    @ey(method = 905397250150879713L)
    void Ss(SyntaxError syntaxError, int i);

    @ey(method = 1695850872454158143L)
    void TE(int i, int i2, Map map, Map map2);

    @ey(method = 792085046932623873L)
    void VD();

    @ey(method = 224096752563356491L)
    void Vq(String str, int i, int i2, int i3, int i4);

    @ey(method = -3083630209135697403L)
    void W(String str);

    @ey(method = 2255015596384374336L)
    List WD(String str, int i, int i2, int i3);

    @ey(method = 3408646160664797855L)
    void Wv(String str, int i, int i2);

    @ey(method = 1673563720434519168L)
    void XL();

    @ey(method = 2139071640938651328L)
    void Xz();

    @ey(method = -1911821007440273185L)
    void addEngineSolutionProject(EngineSolutionProject engineSolutionProject);

    @ey(method = -3242651384819459657L)
    List be(String str, int i, int i2, int i3);

    @ey(method = 7804569818836311617L)
    void bp(String str, Map map);

    @ey(method = 425368655873958753L)
    void dP(String str, int i, int i2, int i3, int i4);

    @ey(method = -73928411223779308L)
    void df(IRefactoringListener iRefactoringListener);

    @ey(method = 1352613227748625495L)
    void et();

    @ey(method = -4312689945911029815L)
    void ez();

    @ey(method = 19286870835983920L)
    void fm();

    @ey(method = -267768082282061271L)
    void hp(IBuildListener iBuildListener);

    @ey(method = -2324829411034782577L)
    void iQ(String str, int i, int i2);

    @ey(method = 201446561178721325L)
    void jA(String str, IOpenFileInterface iOpenFileInterface);

    @ey(method = 5897820504068219780L)
    void jn(String str, int i);

    @ey(method = -1223541098953701060L)
    void k1(String str, int i, int i2, int i3, int i4);

    @ey(method = 5971975284626992872L)
    void kw(String str, int i, int i2, int i3, int i4);

    @ey(method = -6931295592626616944L)
    void ky(String str);

    @ey(method = 487785455261365504L)
    void lU(String str, int i, int i2);

    @ey(method = -3476954352951544023L)
    void lj(String str, String str2);

    @ey(method = 3882200792910596240L)
    void mF(String str, int i, int i2, int i3);

    @ey(method = 68610014848804275L)
    List mn(String str, int i, int i2, char c, int i3);

    @ey(method = 5345580472212822765L)
    void oK(String str, int i, int i2);

    @ey(method = -1983247133967950185L)
    void om(String str, int i, int i2, SourceEntity sourceEntity);

    @ey(method = -1498965424147956471L)
    void pQ(SourceEntity sourceEntity);

    @ey(method = -1467567229679165153L)
    List s2(String str, int i, int i2, int i3);

    @ey(method = 2115645289088575660L)
    void sI();

    @ey(method = 760529456971607700L)
    void setCodeCompletionListener(ICodeCompletionListener iCodeCompletionListener);

    @ey(method = 1091537961689258841L)
    void setEngineListener(IEngineListener iEngineListener);

    @ey(method = 3845467924422427611L)
    void setEngineSolution(EngineSolution engineSolution);

    @ey(method = -295089435123539463L)
    void setGotoSymbolListener(IGotoSymbolListener iGotoSymbolListener);

    @ey(method = -1427054780114765335L)
    void setNavigationListener(INavigationListener iNavigationListener);

    @ey(method = 2018960176812099597L)
    void setUsageSearcherListener(IUsageSearcherListener iUsageSearcherListener);

    @ey(method = 3236939732395669381L)
    void shutdown();

    @ey(method = 3274093199964932948L)
    void uC(String str, int i, int i2);

    @ey(method = -1461080970831705072L)
    void updateEngineSolution();

    @ey(method = -2105850509230668508L)
    void w1(String str, int i, int i2, int i3, int i4, String str2, String str3);

    @ey(method = 97110160458847488L)
    void w2(String str, int i, int i2, boolean z);

    @ey(method = 4415260582352042952L)
    void wT(String str, int i);

    @ey(method = 6404544106878368493L)
    void wa(String str, String str2);

    @ey(method = -5030934034244158131L)
    void yu(String str, int i, int i2, int i3, int i4);

    @ey(method = 925503109364798208L)
    void yw(String str, SourceEntity sourceEntity);
}
