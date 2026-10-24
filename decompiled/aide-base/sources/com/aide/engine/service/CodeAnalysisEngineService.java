package com.aide.engine.service;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.DebuggerResourceProvider;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.language.java.JavaFormatOption;
import com.aide.codemodel.language.js.JavaScriptFormatterOption;
import com.aide.common.AppLog;
import com.aide.engine.Engine;
import com.aide.engine.EngineSolution;
import com.aide.engine.EngineSolutionProject;
import com.aide.engine.FileHighlightings;
import com.aide.engine.FindResult;
import com.aide.engine.ICodeModelsFactory;
import com.aide.engine.Modification;
import com.aide.engine.OpenFile;
import com.aide.engine.SourceEntity;
import com.aide.engine.SyntaxError;
import com.aide.engine.SyntaxStyleType;
import com.aide.engine.UsageSearcherListener;
import com.aide.engine.b0;
import com.aide.engine.c0;
import com.aide.engine.d0;
import com.aide.engine.g;
import com.aide.engine.service.ICodeAnalysisEngineService;
import com.aide.engine.x;
import com.aide.engine.z;
import com.aide.ui.MainActivity;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 2006115082471780797L, container = 2006115082471780797L, user = true)
/* loaded from: classes.dex */
public class CodeAnalysisEngineService extends Service {

    @gy
    private static /* synthetic */ boolean AL;

    @fy
    private static /* synthetic */ boolean zh;

    @dy(field = -2790688513587208175L)
    private final ICodeAnalysisEngineService.Sub codeAnalysisEngineServiceSub;

    @dy(field = 77238123921954616L)
    private ICodeCompletionListener codeCompletionListener;

    @dy(field = 1489977092297266791L)
    private Engine engine;

    @dy(field = -2457135731919236875L)
    private IEngineListener engineListener;

    @dy(field = 2196964607160776880L)
    private IGotoSymbolListener gotoSymbolListener;

    @dy(field = -2277479150212039695L)
    private INavigationListener navigationListener;

    @cy(clazz = -146646964225269192L, container = 2006115082471780797L, user = true)
    class CodeAnalysisEngineServiceImpl extends ICodeAnalysisEngineService.Sub {

        @gy
        private static /* synthetic */ boolean k2;

        @fy
        private static /* synthetic */ boolean qp;

        @dy(field = 2422415368009536768L)
        private EngineSolution engineSolution;

        @cy(clazz = 1368733178601874545L, container = 2006115082471780797L, user = true)
        class a implements z {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = -8001481848080870745L)
            final /* synthetic */ IOpenFileInterface j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 8392282683455966035L)
            a(CodeAnalysisEngineServiceImpl codeAnalysisEngineServiceImpl, IOpenFileInterface iOpenFileInterface) {
                this.j6 = iOpenFileInterface;
            }

            @Override // com.aide.engine.z
            @ey(method = -56268855222517167L)
            public void J0(OpenFile openFile) {
                try {
                    if (DW) {
                        iy.tp(-2976778759359199680L, this, openFile);
                    }
                    try {
                        openFile.FH = this.j6.yA();
                        int iGQ = this.j6.GQ();
                        openFile.length = iGQ;
                        if (openFile.charArray == null || openFile.charArray.length < iGQ) {
                            openFile.charArray = new char[(openFile.length * 5) / 4];
                        }
                        int i = 0;
                        while (true) {
                            CharArray charArrayW3 = this.j6.W3(i);
                            if (charArrayW3.mb <= 0) {
                                return;
                            }
                            char[] cArr = openFile.charArray;
                            char[] cArr2 = charArrayW3.data;
                            int i2 = charArrayW3.mb;
                            int i3 = 0;
                            while (i3 < i2) {
                                int i4 = i + 1;
                                cArr[i] = cArr2[i3];
                                i3++;
                                i = i4;
                            }
                        }
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -2976778759359199680L, this, openFile);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.z
            @ey(method = -5507542010335836201L)
            public void J8(long j) {
                try {
                    if (DW) {
                        iy.tp(1299075217137412096L, this, new Long(j));
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1299075217137412096L, this, new Long(j));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.z
            @ey(method = 306289442074944216L)
            public long we() {
                try {
                    if (DW) {
                        iy.gn(-7824690251888756319L, this);
                    }
                    try {
                        return this.j6.we();
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                        return 0L;
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -7824690251888756319L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1368844755723349264L, container = 2006115082471780797L, user = true)
        class b implements com.aide.engine.d {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = 3053033694605003688L)
            final /* synthetic */ IEngineErrorListener j6;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -2428157183199830711L)
            b(CodeAnalysisEngineServiceImpl codeAnalysisEngineServiceImpl, IEngineErrorListener iEngineErrorListener) {
                this.j6 = iEngineErrorListener;
            }

            @Override // com.aide.engine.d
            @ey(method = 6940873258528420156L)
            public void AR() {
                try {
                    if (DW) {
                        iy.gn(7542791137221281L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 7542791137221281L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 4566530290382867504L)
            public void E4() {
                try {
                    if (DW) {
                        iy.gn(-4164816785419517867L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -4164816785419517867L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = -663251386087506321L)
            public void Fd(String str, SyntaxError[] syntaxErrorArr, boolean z) {
                try {
                    if (DW) {
                        iy.we(-5274867716133228L, this, str, syntaxErrorArr, new Boolean(z));
                    }
                    try {
                        this.j6.Qs(str, syntaxErrorArr, z);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.U2(th, -5274867716133228L, this, str, syntaxErrorArr, new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 450433151253841041L)
            public void Lz(String str) {
                try {
                    if (DW) {
                        iy.tp(4693198073276141752L, this, str);
                    }
                    try {
                        this.j6.UT(str);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 4693198073276141752L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 613389407889865171L)
            public void Of() {
                try {
                    if (DW) {
                        iy.gn(-1184629493185733812L, this);
                    }
                    try {
                        this.j6.Of();
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -1184629493185733812L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 981947352946514548L)
            public void PT(String str, SyntaxError[] syntaxErrorArr) {
                try {
                    if (DW) {
                        iy.EQ(-6875411385357057075L, this, str, syntaxErrorArr);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -6875411385357057075L, this, str, syntaxErrorArr);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 3403978803595747695L)
            public void TI() {
                try {
                    if (DW) {
                        iy.gn(2798021847095310588L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 2798021847095310588L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = -1294241056527105744L)
            public void aj(String str) {
                try {
                    if (DW) {
                        iy.tp(-7724516862074803989L, this, str);
                    }
                    try {
                        this.j6.aj(str);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -7724516862074803989L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = -5549250987845925448L)
            public void b1(String str) {
                try {
                    if (DW) {
                        iy.tp(562344457924260067L, this, str);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 562344457924260067L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = -2595094061858335739L)
            public void ct() {
                try {
                    if (DW) {
                        iy.gn(2582269779767023920L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 2582269779767023920L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 1662179638177830575L)
            public void eU() {
                try {
                    if (DW) {
                        iy.gn(135863704519944336L, this);
                    }
                    try {
                        this.j6.eU();
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 135863704519944336L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 2103023947697222855L)
            public void hp() {
                try {
                    if (DW) {
                        iy.gn(-4180760513716321280L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -4180760513716321280L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = -6713456997465966389L)
            public void sT() {
                try {
                    if (DW) {
                        iy.gn(-1753758523135436268L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -1753758523135436268L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.d
            @ey(method = 1032044532845923212L)
            public void xg() {
                try {
                    if (DW) {
                        iy.gn(-778797032936704087L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, -778797032936704087L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1368956332848887277L, container = 2006115082471780797L, user = true)
        class c implements com.aide.engine.a {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = -4530656319524622224L)
            final /* synthetic */ IBuildListener j6;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 3701418920267002388L)
            c(CodeAnalysisEngineServiceImpl codeAnalysisEngineServiceImpl, IBuildListener iBuildListener) {
                this.j6 = iBuildListener;
            }

            @Override // com.aide.engine.a
            @ey(method = 3922418246167969815L)
            public void AL(boolean z) {
                try {
                    if (DW) {
                        iy.Ws(-2704888140872914048L, this, z);
                    }
                    try {
                        this.j6.AL(z);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -2704888140872914048L, this, new Boolean(z));
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.a
            @ey(method = 552211874479699347L)
            public void cT(Set<String> set, Map<String, byte[]> map) {
                try {
                    if (DW) {
                        iy.EQ(5203260692578726488L, this, set, map);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 5203260692578726488L, this, set, map);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.a
            @ey(method = -1783120922091719928L)
            public void hK(Set<String> set, Set<String> set2, Map<String, String> map) {
                try {
                    if (DW) {
                        iy.we(-890763423036739021L, this, set, set2, map);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.U2(th, -890763423036739021L, this, set, set2, map);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.a
            @ey(method = -2901379604506166601L)
            public void q7() {
                try {
                    if (DW) {
                        iy.gn(75389976675091700L, this);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 75389976675091700L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.a
            @ey(method = 1573320024123382584L)
            public void w9(IOException iOException) {
                try {
                    if (DW) {
                        iy.tp(-492438592167743455L, this, iOException);
                    }
                    try {
                        this.j6.buildFailed(iOException.getMessage());
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -492438592167743455L, this, iOException);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1369067909978488584L, container = 2006115082471780797L, user = true)
        class d implements g {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 2908820112297845760L)
            private FileHighlightings fileHighlightings = new FileHighlightings();

            @dy(field = -4754458979528282200L)
            final /* synthetic */ IHighlightingListener mIHighlightingListener;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 1476555727750866036L)
            d(CodeAnalysisEngineServiceImpl codeAnalysisEngineServiceImpl, IHighlightingListener iHighlightingListener) {
                this.mIHighlightingListener = iHighlightingListener;
            }

            @Override // com.aide.engine.g
            @ey(method = 826187638575966056L)
            public void DW(String str, int i, long j, SyntaxStyleType[] syntaxStyleTypeArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i2) {
                try {
                    if (FH) {
                        iy.QX(1830991077479530539L, this, new Object[]{str, new Integer(i), new Long(j), syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i2)});
                    }
                    try {
                        this.fileHighlightings.filePath = str;
                        this.fileHighlightings.syntaxStyleTypes = syntaxStyleTypeArr;
                        this.fileHighlightings.startLines = iArr;
                        this.fileHighlightings.startColumns = iArr2;
                        this.fileHighlightings.endLines = iArr3;
                        this.fileHighlightings.endColumns = iArr4;
                        this.fileHighlightings.size = i2;
                        this.fileHighlightings.AL = i;
                        this.mIHighlightingListener.kQ(this.fileHighlightings);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.rN(th, 1830991077479530539L, this, new Object[]{str, new Integer(i), new Long(j), syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i2)});
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.g
            @ey(method = -3783889717363823936L)
            public void j6(String str, int i, long j, SyntaxStyleType[] syntaxStyleTypeArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i2) {
                try {
                    if (FH) {
                        iy.QX(-11752068160863863L, this, new Object[]{str, new Integer(i), new Long(j), syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i2)});
                    }
                    try {
                        this.fileHighlightings.filePath = str;
                        this.fileHighlightings.syntaxStyleTypes = syntaxStyleTypeArr;
                        this.fileHighlightings.startLines = iArr;
                        this.fileHighlightings.startColumns = iArr2;
                        this.fileHighlightings.endLines = iArr3;
                        this.fileHighlightings.endColumns = iArr4;
                        this.fileHighlightings.size = i2;
                        this.mIHighlightingListener.IS(this.fileHighlightings);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (Hw) {
                        iy.rN(th, -11752068160863863L, this, new Object[]{str, new Integer(i), new Long(j), syntaxStyleTypeArr, iArr, iArr2, iArr3, iArr4, new Integer(i2)});
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1369179487112153185L, container = 2006115082471780797L, user = true)
        class e implements b0 {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = -4631362983270362797L)
            final /* synthetic */ IRefactoringListener j6;

            static {
                iy.Zo(e.class);
            }

            @ey(method = 1464378989217005852L)
            e(CodeAnalysisEngineServiceImpl codeAnalysisEngineServiceImpl, IRefactoringListener iRefactoringListener) {
                this.j6 = iRefactoringListener;
            }

            @ey(method = 4331614540620477680L)
            private void KD(String str, String str2) {
                try {
                    if (DW) {
                        iy.EQ(777719673647837424L, this, str, str2);
                    }
                    try {
                        this.j6.d5(str, str2);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 777719673647837424L, this, str, str2);
                    }
                    throw th;
                }
            }

            @ey(method = -218960772121067856L)
            private void SI(String str, Hashtable<String, String[]> hashtable) {
                try {
                    if (DW) {
                        iy.EQ(-999396956930859480L, this, str, hashtable);
                    }
                    try {
                        this.j6.tn(str, hashtable);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -999396956930859480L, this, str, hashtable);
                    }
                    throw th;
                }
            }

            @ey(method = -6319981362119260572L)
            private void cn(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(1161430629294160356L, this, list);
                    }
                    try {
                        this.j6.cl(list);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1161430629294160356L, this, list);
                    }
                    throw th;
                }
            }

            @ey(method = -865077233574801577L)
            private void ro(String str) {
                try {
                    if (DW) {
                        iy.tp(1471778178164129381L, this, str);
                    }
                    try {
                        this.j6.j2(str);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1471778178164129381L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -6387642843066385409L)
            public void BT(List<Modification> list, List<String> list2) {
                try {
                    if (DW) {
                        iy.EQ(-6361623201091391325L, this, list, list2);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -6361623201091391325L, this, list, list2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -1125636461152484608L)
            public void DW(String str) {
                try {
                    if (DW) {
                        iy.tp(-224813796722478600L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -224813796722478600L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -1083266931477390096L)
            public void EQ(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(2236044005527644440L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2236044005527644440L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -3938364013426986145L)
            public void FH(String str, String str2) {
                try {
                    if (DW) {
                        iy.EQ(-1021620700857677703L, this, str, str2);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -1021620700857677703L, this, str, str2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -261036324413683640L)
            public void Hw() {
                try {
                    if (DW) {
                        iy.gn(32405625486945792L, this);
                    }
                    ro("This feature is not available here");
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 32405625486945792L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -411250726327000560L)
            public void J0(String str) {
                try {
                    if (DW) {
                        iy.tp(-961541247748320624L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -961541247748320624L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 5286452544183771584L)
            public void J8(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(-2157362007898758528L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -2157362007898758528L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -1678554901396505517L)
            public void Mr(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(2572674148211432815L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2572674148211432815L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 4035179198447221233L)
            public void P8(List<Modification> list, List<String> list2) {
                try {
                    if (DW) {
                        iy.EQ(-2232300986086293129L, this, list, list2);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, -2232300986086293129L, this, list, list2);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -1114606694129133417L)
            public void QX(x xVar) {
                try {
                    if (DW) {
                        iy.tp(1305454893014849445L, this, xVar);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1305454893014849445L, this, xVar);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -655082107203115161L)
            public void U2(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(2730610749546697403L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2730610749546697403L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -620107352153784375L)
            public void VH(String str) {
                try {
                    if (DW) {
                        iy.tp(-2019145728281541109L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -2019145728281541109L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 5959888158295882013L)
            public void Ws(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(1072637871699824445L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1072637871699824445L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 2798275696685794080L)
            public void XL(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(-1148349215364022784L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -1148349215364022784L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 1980313002846221160L)
            public void Zo(String str) {
                try {
                    if (DW) {
                        iy.tp(2797964867605060800L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2797964867605060800L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 3043529585110028880L)
            public void a8(String str) {
                try {
                    if (DW) {
                        iy.tp(2489532538677301920L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2489532538677301920L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -1639104878519963360L)
            public void aM(String str) {
                try {
                    if (DW) {
                        iy.tp(3976384061902028712L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 3976384061902028712L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -1581303355391728964L)
            public void ei(String str, Set<? extends FormatOption> set) {
                try {
                    if (DW) {
                        iy.EQ(769921207462479492L, this, str, set);
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        Iterator<? extends FormatOption> it = set.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getName());
                        }
                        this.j6.Bw(str, arrayList);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 769921207462479492L, this, str, set);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 6112120295062224825L)
            public void er(String str) {
                try {
                    if (DW) {
                        iy.tp(-2526763825417281669L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -2526763825417281669L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 1884827272817968016L)
            public void gW(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(-3388397434528527096L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -3388397434528527096L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -2613590395659856704L)
            public void gn(String str) {
                try {
                    if (DW) {
                        iy.tp(3997220326364750328L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 3997220326364750328L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -569794569683928300L)
            public void j3(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(-3401625945134801520L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -3401625945134801520L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 217617778822252448L)
            public void j6(String str, String str2, boolean z, String str3, int i, int i2, int i3) {
                try {
                    if (DW) {
                        iy.QX(3485626700523853032L, this, new Object[]{str, str2, new Boolean(z), str3, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                    KD(str, str2);
                } catch (Throwable th) {
                    if (FH) {
                        iy.rN(th, 3485626700523853032L, this, new Object[]{str, str2, new Boolean(z), str3, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -7325123330121300207L)
            public void lg(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(-4172559964553968029L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -4172559964553968029L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 381617166114482003L)
            public void nw(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(-3220980556432924263L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -3220980556432924263L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -3611418868014037000L)
            public void rN(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(3774833698388771592L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 3774833698388771592L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 1002230522377837011L)
            public void tp(String str) {
                try {
                    if (DW) {
                        iy.tp(536651823451408665L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 536651823451408665L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 4998790232011626759L)
            public void u7(String str) {
                try {
                    if (DW) {
                        iy.tp(1860597700259012907L, this, str);
                    }
                    ro(str);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 1860597700259012907L, this, str);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -2678815177833181880L)
            public void v5(String str, Hashtable<String, String[]> hashtable) {
                try {
                    if (DW) {
                        iy.EQ(180506374297574400L, this, str, hashtable);
                    }
                    SI(str, hashtable);
                } catch (Throwable th) {
                    if (FH) {
                        iy.Mr(th, 180506374297574400L, this, str, hashtable);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -3544114258779005223L)
            public void vy(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(2892525206304938841L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2892525206304938841L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = -4623698526826818432L)
            public void we(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(812571466403949544L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 812571466403949544L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.b0
            @ey(method = 3202880211118669616L)
            public void yS(List<Modification> list) {
                try {
                    if (DW) {
                        iy.tp(2268546437156527440L, this, list);
                    }
                    cn(list);
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 2268546437156527440L, this, list);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1369291064249881080L, container = 2006115082471780797L, user = true)
        class f implements UsageSearcherListener {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            @dy(field = 3373127162712115980L)
            final /* synthetic */ IUsageSearcherListener j6;

            static {
                iy.Zo(f.class);
            }

            @ey(method = -8003461781186987440L)
            f(CodeAnalysisEngineServiceImpl codeAnalysisEngineServiceImpl, IUsageSearcherListener iUsageSearcherListener) {
                this.j6 = iUsageSearcherListener;
            }

            @Override // com.aide.engine.UsageSearcherListener
            @ey(method = 1096701192838857156L)
            public void Cz() {
                try {
                    if (DW) {
                        iy.gn(3379360972131783443L, this);
                    }
                    try {
                        this.j6.Cz();
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.aM(th, 3379360972131783443L, this);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.UsageSearcherListener
            @ey(method = -3408982857579551195L)
            public void ce(List<FindResult> list) {
                try {
                    if (DW) {
                        iy.tp(-837980756853272032L, this, list);
                    }
                    try {
                        this.j6.ce(list);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -837980756853272032L, this, list);
                    }
                    throw th;
                }
            }

            @Override // com.aide.engine.UsageSearcherListener
            @ey(method = -2255188549512340768L)
            public void hz(String str) {
                try {
                    if (DW) {
                        iy.tp(-1002211152256688605L, this, str);
                    }
                    try {
                        this.j6.hz(str);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, -1002211152256688605L, this, str);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(CodeAnalysisEngineServiceImpl.class);
        }

        @ey(method = 6758708400650603685L)
        CodeAnalysisEngineServiceImpl() {
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2659653747025197216L)
        public void BT() {
            try {
                if (qp) {
                    iy.gn(2532613262871488725L, this);
                }
                CodeAnalysisEngineService.this.engine.eQ();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 2532613262871488725L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 533019809813215600L)
        public void C5(String str, String str2, int i) {
            try {
                if (qp) {
                    iy.we(1932406343368643105L, this, str, str2, new Integer(i));
                }
                CodeAnalysisEngineService.this.engine.mn(str, str2, i);
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, 1932406343368643105L, this, str, str2, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -1973160889525794535L)
        public void Dt(String str, int i, int i2) {
            try {
                if (qp) {
                    iy.we(-857521487055932196L, this, str, new Integer(i), new Integer(i2));
                }
                CodeAnalysisEngineService.this.engine.TE(str, i, i2);
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, -857521487055932196L, this, str, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 6250295272689817632L)
        public void HG(String str, int i, int i2, int i3, int i4) {
            try {
                if (qp) {
                    iy.J8(3001318058285157585L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                CodeAnalysisEngineService.this.engine.BJ(str, i, i2, i3, i4);
            } catch (Throwable th) {
                if (k2) {
                    iy.lg(th, 3001318058285157585L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2578965656210349753L)
        public void IM(String str, int i) {
            try {
                if (qp) {
                    iy.EQ(2407986221844911920L, this, str, new Integer(i));
                }
                CodeAnalysisEngineService.this.engine.p8(str, i);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 2407986221844911920L, this, str, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1087436982640691001L)
        public void Jt(String str) {
            try {
                if (qp) {
                    iy.tp(1929088563870369100L, this, str);
                }
                CodeAnalysisEngineService.this.engine.jD(str);
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 1929088563870369100L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 137534795013640400L)
        public void Lq(String str, String str2, int i, int i2, int i3, int i4) throws Throwable {
            int i5;
            try {
                if (qp) {
                    iy.QX(-2549588419366825893L, this, new Object[]{str, str2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                }
                i5 = 6;
                try {
                    CodeAnalysisEngineService.this.engine.oC(str, str2, i, i2, i3, i4);
                } catch (Throwable th) {
                    th = th;
                    if (k2) {
                        Object[] objArr = new Object[i5];
                        objArr[0] = str;
                        objArr[1] = str2;
                        objArr[2] = new Integer(i);
                        objArr[3] = new Integer(i2);
                        objArr[4] = new Integer(i3);
                        objArr[5] = new Integer(i4);
                        iy.rN(th, -2549588419366825893L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i5 = 6;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 2293401885913703825L)
        public void N7(IEngineErrorListener iEngineErrorListener) {
            try {
                if (qp) {
                    iy.tp(-465349507841253552L, this, iEngineErrorListener);
                }
                CodeAnalysisEngineService.this.engine.j7(new b(this, iEngineErrorListener));
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -465349507841253552L, this, iEngineErrorListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1669216038829344995L)
        public void QD(String str, int i) {
            try {
                if (qp) {
                    iy.EQ(467739568899883736L, this, str, new Integer(i));
                }
                CodeAnalysisEngineService.this.engine.w2(str, i);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 467739568899883736L, this, str, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2628628540035522743L)
        public void QW() {
            try {
                if (qp) {
                    iy.gn(6681058532937384156L, this);
                }
                CodeAnalysisEngineService.this.engine.yu();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 6681058532937384156L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 620087090698699392L)
        public void RW(IHighlightingListener iHighlightingListener) {
            try {
                if (qp) {
                    iy.tp(147787971886383991L, this, iHighlightingListener);
                }
                CodeAnalysisEngineService.this.engine.dP(new d(this, iHighlightingListener));
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 147787971886383991L, this, iHighlightingListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 6099606845814914752L)
        public void Ss(SyntaxError syntaxError, int i) {
            try {
                if (qp) {
                    iy.EQ(-6845939742111090777L, this, syntaxError, new Integer(i));
                }
                CodeAnalysisEngineService.this.engine.Dm(syntaxError, i);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, -6845939742111090777L, this, syntaxError, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 554884229922864976L)
        public void TE(int i, int i2, Map map, Map map2) {
            try {
                if (qp) {
                    iy.J0(3131867493493959825L, this, new Integer(i), new Integer(i2), map, map2);
                }
                HashMap map3 = new HashMap();
                HashSet hashSet = new HashSet();
                Iterator it = ((List) map2.get("Java")).iterator();
                while (it.hasNext()) {
                    hashSet.add(JavaFormatOption.valueOf((String) it.next()));
                }
                map3.put("Java", hashSet);
                HashSet hashSet2 = new HashSet();
                Iterator it2 = ((List) map2.get("JavaScript")).iterator();
                while (it2.hasNext()) {
                    hashSet2.add(JavaScriptFormatterOption.valueOf((String) it2.next()));
                }
                map3.put("JavaScript", hashSet2);
                CodeAnalysisEngineService.this.engine.Af(false, false, false, false, i, "", new String[0], new boolean[0], i2, map, map3);
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, 3131867493493959825L, this, new Integer(i), new Integer(i2), map, map2);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 3551087752668509400L)
        public void VD() {
            try {
                if (qp) {
                    iy.gn(-5763250394886049911L, this);
                }
                CodeAnalysisEngineService.this.engine.Sg();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -5763250394886049911L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 269844161690916540L)
        public void Vq(String str, int i, int i2, int i3, int i4) {
            try {
                if (qp) {
                    iy.J8(-2695720013488019945L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                CodeAnalysisEngineService.this.engine.CN(str, i, i2, i3, i4);
            } catch (Throwable th) {
                if (k2) {
                    iy.lg(th, -2695720013488019945L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -1713881275541645328L)
        public void W(String str) {
            try {
                if (qp) {
                    iy.tp(-3874174307465330865L, this, str);
                }
                CodeAnalysisEngineService.this.engine.YM(str);
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -3874174307465330865L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -5466899016118908275L)
        public List WD(String str, int i, int i2, int i3) {
            try {
                if (qp) {
                    iy.J0(8429932329429285120L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                return CodeAnalysisEngineService.this.engine.jg(str, i, i2, i3);
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, 8429932329429285120L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 880768018197336948L)
        public void Wv(String str, int i, int i2) {
            try {
                if (qp) {
                    iy.we(-3768929342057284045L, this, str, new Integer(i), new Integer(i2));
                }
                CodeAnalysisEngineService.this.engine.oP(str, i, i2);
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, -3768929342057284045L, this, str, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -1977419576657831443L)
        public void XL() {
            try {
                if (qp) {
                    iy.gn(3385294150137803904L, this);
                }
                CodeAnalysisEngineService.this.engine.fp();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 3385294150137803904L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2350765194893623625L)
        public void Xz() {
            try {
                if (qp) {
                    iy.gn(1265780340408437144L, this);
                }
                CodeAnalysisEngineService.this.engine.jH();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 1265780340408437144L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1106969094841955828L)
        public void addEngineSolutionProject(EngineSolutionProject engineSolutionProject) {
            try {
                if (qp) {
                    iy.tp(-909387403720199437L, this, engineSolutionProject);
                }
                if (this.engineSolution != null) {
                    this.engineSolution.j6(engineSolutionProject);
                }
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -909387403720199437L, this, engineSolutionProject);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 669231655028443944L)
        public List be(String str, int i, int i2, int i3) {
            try {
                if (qp) {
                    iy.J0(-4427788847770450083L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                return CodeAnalysisEngineService.this.engine.IM(str, i, i2, i3);
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, -4427788847770450083L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2401776953631912500L)
        public void bp(String str, Map map) {
            try {
                if (qp) {
                    iy.EQ(-8181197125408362097L, this, str, map);
                }
                CodeAnalysisEngineService.this.engine.mu(str, new Hashtable<>(map));
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, -8181197125408362097L, this, str, map);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 4068537240652039500L)
        public void dP(String str, int i, int i2, int i3, int i4) {
            try {
                if (qp) {
                    iy.J8(1892076859583917371L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                CodeAnalysisEngineService.this.engine.uF(str, i, i2, i3, i4);
            } catch (Throwable th) {
                if (k2) {
                    iy.lg(th, 1892076859583917371L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -850311918983576145L)
        public void df(IRefactoringListener iRefactoringListener) {
            try {
                if (qp) {
                    iy.tp(-2015616150303500880L, this, iRefactoringListener);
                }
                CodeAnalysisEngineService.this.engine.ik(new e(this, iRefactoringListener));
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -2015616150303500880L, this, iRefactoringListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -4731022854500715904L)
        public void et() {
            try {
                if (qp) {
                    iy.gn(1389558906777775811L, this);
                }
                CodeAnalysisEngineService.this.engine.wu();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 1389558906777775811L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1059010723770228060L)
        public void ez() {
            try {
                if (qp) {
                    iy.gn(-3521789785373205465L, this);
                }
                CodeAnalysisEngineService.this.engine.TJ();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -3521789785373205465L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 6622915175411447745L)
        public void fm() {
            try {
                if (qp) {
                    iy.gn(-7554347498847132160L, this);
                }
                CodeAnalysisEngineService.this.engine.jT();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -7554347498847132160L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2472610986714225280L)
        public void hp(IBuildListener iBuildListener) {
            try {
                if (qp) {
                    iy.tp(-246458731348363705L, this, iBuildListener);
                }
                CodeAnalysisEngineService.this.engine.DV(new c(this, iBuildListener));
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -246458731348363705L, this, iBuildListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -358786095488567136L)
        public void iQ(String str, int i, int i2) {
            try {
                if (qp) {
                    iy.we(-2355074409906695025L, this, str, new Integer(i), new Integer(i2));
                }
                CodeAnalysisEngineService.this.engine.JT(str, i, i2);
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, -2355074409906695025L, this, str, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -367306093089664992L)
        public void jA(String str, IOpenFileInterface iOpenFileInterface) {
            try {
                if (qp) {
                    iy.EQ(1708632053315640085L, this, str, iOpenFileInterface);
                }
                CodeAnalysisEngineService.this.engine.d5(str, new a(this, iOpenFileInterface));
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 1708632053315640085L, this, str, iOpenFileInterface);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 7469854921446941085L)
        public void jn(String str, int i) {
            try {
                if (qp) {
                    iy.EQ(-412652903598700812L, this, str, new Integer(i));
                }
                CodeAnalysisEngineService.this.engine.ek(str, i);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, -412652903598700812L, this, str, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 25806970904166947L)
        public void k1(String str, int i, int i2, int i3, int i4) {
            try {
                if (qp) {
                    iy.J8(-6721909034962382720L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                CodeAnalysisEngineService.this.engine.Sc(str, i, i2, i3, i4);
            } catch (Throwable th) {
                if (k2) {
                    iy.lg(th, -6721909034962382720L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 556555379457996765L)
        public void kw(String str, int i, int i2, int i3, int i4) {
            try {
                if (qp) {
                    iy.J8(-349693854315041940L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                CodeAnalysisEngineService.this.engine.df(str, i, i2, i3, i4);
            } catch (Throwable th) {
                if (k2) {
                    iy.lg(th, -349693854315041940L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1841526444880857275L)
        public void ky(String str) {
            try {
                if (qp) {
                    iy.tp(1052892682371269496L, this, str);
                }
                CodeAnalysisEngineService.this.engine.n8(str);
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 1052892682371269496L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -384380007460622811L)
        public void lU(String str, int i, int i2) {
            try {
                if (qp) {
                    iy.we(-4014081268670853632L, this, str, new Integer(i), new Integer(i2));
                }
                CodeAnalysisEngineService.this.engine.NH(str, i, i2);
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, -4014081268670853632L, this, str, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2599129937749374368L)
        public void lj(String str, String str2) {
            try {
                if (qp) {
                    iy.EQ(4414749325292694159L, this, str, str2);
                }
                CodeAnalysisEngineService.this.engine.cz(str, str2);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, 4414749325292694159L, this, str, str2);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 339282607538317499L)
        public void mF(String str, int i, int i2, int i3) {
            try {
                if (qp) {
                    iy.J0(-774513095755442232L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                CodeAnalysisEngineService.this.engine.J1(str, i, i2, i3);
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, -774513095755442232L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1858249933447880872L)
        public List mn(String str, int i, int i2, char c2, int i3) {
            try {
                if (qp) {
                    iy.J8(181879571678728833L, this, str, new Integer(i), new Integer(i2), new Character(c2), new Integer(i3));
                }
                return CodeAnalysisEngineService.this.engine.NZ(str, i, i2, c2, i3);
            } catch (Throwable th) {
                if (k2) {
                    iy.lg(th, 181879571678728833L, this, str, new Integer(i), new Integer(i2), new Character(c2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2066860724583246592L)
        public void oK(String str, int i, int i2) {
            try {
                if (qp) {
                    iy.we(4434471245343996087L, this, str, new Integer(i), new Integer(i2));
                }
                CodeAnalysisEngineService.this.engine.re(str, i, i2);
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, 4434471245343996087L, this, str, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2431874711329578272L)
        public void om(String str, int i, int i2, SourceEntity sourceEntity) {
            try {
                if (qp) {
                    iy.J0(-139967444895914745L, this, str, new Integer(i), new Integer(i2), sourceEntity);
                }
                CodeAnalysisEngineService.this.engine.LA(str, i, i2, sourceEntity);
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, -139967444895914745L, this, str, new Integer(i), new Integer(i2), sourceEntity);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -809901774987104800L)
        public void pQ(SourceEntity sourceEntity) {
            try {
                if (qp) {
                    iy.tp(-594349114637322929L, this, sourceEntity);
                }
                CodeAnalysisEngineService.this.engine.fD(sourceEntity);
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -594349114637322929L, this, sourceEntity);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 120270871348076832L)
        public List s2(String str, int i, int i2, int i3) {
            try {
                if (qp) {
                    iy.J0(-1463438469645276921L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                return CodeAnalysisEngineService.this.engine.N2(str, i, i2, i3);
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, -1463438469645276921L, this, str, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -2384795873146652461L)
        public void sI() {
            try {
                if (qp) {
                    iy.gn(-198540181682560256L, this);
                }
                CodeAnalysisEngineService.this.engine.e4();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -198540181682560256L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 4512523522393982799L)
        public void setCodeCompletionListener(ICodeCompletionListener iCodeCompletionListener) {
            try {
                if (qp) {
                    iy.tp(1028347074258622216L, this, iCodeCompletionListener);
                }
                CodeAnalysisEngineService.this.codeCompletionListener = iCodeCompletionListener;
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 1028347074258622216L, this, iCodeCompletionListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 3857734404609672384L)
        public void setEngineListener(IEngineListener iEngineListener) {
            try {
                if (qp) {
                    iy.tp(534748227254919065L, this, iEngineListener);
                }
                CodeAnalysisEngineService.this.engineListener = iEngineListener;
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 534748227254919065L, this, iEngineListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -4326654580102691480L)
        public void setEngineSolution(EngineSolution engineSolution) {
            try {
                if (qp) {
                    iy.tp(-6600727250756591211L, this, engineSolution);
                }
                this.engineSolution = engineSolution;
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -6600727250756591211L, this, engineSolution);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 35047679963121264L)
        public void setGotoSymbolListener(IGotoSymbolListener iGotoSymbolListener) {
            try {
                if (qp) {
                    iy.tp(-375164281684160297L, this, iGotoSymbolListener);
                }
                CodeAnalysisEngineService.this.gotoSymbolListener = iGotoSymbolListener;
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -375164281684160297L, this, iGotoSymbolListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1328521612841721288L)
        public void setNavigationListener(INavigationListener iNavigationListener) {
            try {
                if (qp) {
                    iy.tp(-2140461918014363307L, this, iNavigationListener);
                }
                CodeAnalysisEngineService.this.navigationListener = iNavigationListener;
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, -2140461918014363307L, this, iNavigationListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 113684936402160656L)
        public void setUsageSearcherListener(IUsageSearcherListener iUsageSearcherListener) {
            try {
                if (qp) {
                    iy.tp(427626150539747215L, this, iUsageSearcherListener);
                }
                CodeAnalysisEngineService.this.engine.setUsageSearcherListener2(new f(this, iUsageSearcherListener));
            } catch (Throwable th) {
                if (k2) {
                    iy.j3(th, 427626150539747215L, this, iUsageSearcherListener);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 3207926177465649364L)
        public void shutdown() {
            try {
                if (qp) {
                    iy.gn(-4621322872456450069L, this);
                }
                CodeAnalysisEngineService.this.engine.shutdown();
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, -4621322872456450069L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 6044957718626029775L)
        public void uC(String str, int i, int i2) {
            try {
                if (qp) {
                    iy.we(-2829125880059068872L, this, str, new Integer(i), new Integer(i2));
                }
                CodeAnalysisEngineService.this.engine.rC(str, i, i2);
            } catch (Throwable th) {
                if (k2) {
                    iy.U2(th, -2829125880059068872L, this, str, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -129229409461596795L)
        public void updateEngineSolution() {
            try {
                if (qp) {
                    iy.gn(514139445212154400L, this);
                }
                if (this.engineSolution != null) {
                    CodeAnalysisEngineService.this.engine.setEngineSolution(this.engineSolution);
                }
                this.engineSolution = null;
            } catch (Throwable th) {
                if (k2) {
                    iy.aM(th, 514139445212154400L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -984366160173187417L)
        public void w1(String str, int i, int i2, int i3, int i4, String str2, String str3) throws Throwable {
            int i5;
            try {
                if (qp) {
                    iy.QX(441848536443696200L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2, str3});
                }
                i5 = 7;
                try {
                    CodeAnalysisEngineService.this.engine.UF(str, i, i2, i3, i4, str2, str3);
                } catch (Throwable th) {
                    th = th;
                    if (k2) {
                        Object[] objArr = new Object[i5];
                        objArr[0] = str;
                        objArr[1] = new Integer(i);
                        objArr[2] = new Integer(i2);
                        objArr[3] = new Integer(i3);
                        objArr[4] = new Integer(i4);
                        objArr[5] = str2;
                        objArr[6] = str3;
                        iy.rN(th, 441848536443696200L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i5 = 7;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 3285463946658131857L)
        public void w2(String str, int i, int i2, boolean z) {
            try {
                if (qp) {
                    iy.J0(3599008882176198340L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
                }
                CodeAnalysisEngineService.this.engine.tn(str, i, i2, z);
            } catch (Throwable th) {
                if (k2) {
                    iy.a8(th, 3599008882176198340L, this, str, new Integer(i), new Integer(i2), new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 3226159990069767325L)
        public void wT(String str, int i) {
            try {
                if (qp) {
                    iy.EQ(-3896733332958425520L, this, str, new Integer(i));
                }
                CodeAnalysisEngineService.this.engine.MX(str, i);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, -3896733332958425520L, this, str, new Integer(i));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1309044911195570640L)
        public void wa(String str, String str2) {
            try {
                if (qp) {
                    iy.EQ(-515927223913544547L, this, str, str2);
                }
                CodeAnalysisEngineService.this.engine.lj(str, str2);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, -515927223913544547L, this, str, str2);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = -1826260724040924600L)
        public void yu(String str, int i, int i2, int i3, int i4) {
            try {
                if (qp) {
                    iy.J8(12565130180668065L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                CodeAnalysisEngineService.this.engine.rB(str, i, i2, i3, i4);
            } catch (Throwable th) {
                if (k2) {
                    iy.lg(th, 12565130180668065L, this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.service.ICodeAnalysisEngineService
        @ey(method = 1807097437563743235L)
        public void yw(String str, SourceEntity sourceEntity) {
            try {
                if (qp) {
                    iy.EQ(-1188469882543590464L, this, str, sourceEntity);
                }
                CodeAnalysisEngineService.this.engine.zg(str, sourceEntity);
            } catch (Throwable th) {
                if (k2) {
                    iy.Mr(th, -1188469882543590464L, this, str, sourceEntity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -146439950442367959L, container = 2006115082471780797L, user = true)
    class CodeModelsFactory implements ICodeModelsFactory {

        @gy
        private static /* synthetic */ boolean DW;

        @fy
        private static /* synthetic */ boolean j6;

        static {
            iy.Zo(CodeModelsFactory.class);
        }

        @ey(method = -5157624037855400937L)
        CodeModelsFactory(CodeAnalysisEngineService codeAnalysisEngineService) {
        }

        @Override // com.aide.engine.ICodeModelsFactory
        @ey(method = -1903846545322195968L)
        public long getId() {
            try {
                if (!j6) {
                    return 0L;
                }
                iy.gn(-5604851701795683559L, this);
                return 0L;
            } catch (Throwable th) {
                if (DW) {
                    iy.aM(th, -5604851701795683559L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.ICodeModelsFactory
        @ey(method = 990886177526841060L)
        public CodeModel[] makeCodeModels(Model model, List<String> list) {
            try {
                if (j6) {
                    iy.EQ(-3464505279849240711L, this, model, list);
                }
                return CodeModelFactory.create(model, list);
            } catch (Throwable th) {
                if (DW) {
                    iy.Mr(th, -3464505279849240711L, this, model, list);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -146370945839940960L, container = 2006115082471780797L, user = true)
    class a extends DebuggerResourceProvider {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 3587681936204591544L)
        a() {
        }

        @Override // com.aide.codemodel.api.abstraction.DebuggerResourceProvider
        @ey(method = -6315075546956300225L)
        public String getHostPackageName() {
            try {
                if (Zo) {
                    iy.gn(731669566573082785L, this);
                }
                return CodeAnalysisEngineService.this.getPackageName();
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 731669566573082785L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.codemodel.api.abstraction.DebuggerResourceProvider
        @ey(method = 555879083465091925L)
        public InputStream getResourceInputStream(String str) {
            try {
                if (Zo) {
                    iy.tp(3462692199028310193L, this, str);
                }
                return CodeAnalysisEngineService.this.getAssets().open(str);
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, 3462692199028310193L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -146508955040731664L, container = 2006115082471780797L, user = true)
    class c implements com.aide.engine.c {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 4468888686078178473L)
        c() {
        }

        @Override // com.aide.engine.c
        @ey(method = 3430457549353526812L)
        public void MP(Throwable th) {
            try {
                if (DW) {
                    iy.tp(5233835764199973167L, this, th);
                }
                AppLog.v5(th);
                if (CodeAnalysisEngineService.this.engineListener != null) {
                    try {
                        CodeAnalysisEngineService.this.engineListener.rJ();
                    } catch (RemoteException unused) {
                        AppLog.v5(th);
                    }
                }
            } catch (Throwable th2) {
                if (FH) {
                    iy.j3(th2, 5233835764199973167L, this, th);
                }
                throw th2;
            }
        }

        @Override // com.aide.engine.c
        @ey(method = 3523232398162695140L)
        public void oa() {
            try {
                if (DW) {
                    iy.gn(-2147258966725242565L, this);
                }
                AppLog.FH("Engine process killed after OOM");
                if (CodeAnalysisEngineService.this.engineListener != null) {
                    try {
                        CodeAnalysisEngineService.this.engineListener.oa();
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
                Process.killProcess(Process.myPid());
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -2147258966725242565L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.c
        @ey(method = -5871885491971028448L)
        public void qP() {
            try {
                if (DW) {
                    iy.gn(-671623290527996957L, this);
                }
                AppLog.DW("Engine process killed after shutdown");
                Process.killProcess(Process.myPid());
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -671623290527996957L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -146577959635032075L, container = 2006115082471780797L, user = true)
    class d implements d0 {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 1102742593808785960L)
        private List j6 = new ArrayList();

        static {
            iy.Zo(d.class);
        }

        @ey(method = 4494935462376615451L)
        d() {
        }

        @Override // com.aide.engine.d0
        @ey(method = 53872458358039625L)
        public void E4(String str, int i, int i2, c0 c0Var) {
            try {
                if (FH) {
                    iy.J0(2975901988402468424L, this, str, new Integer(i), new Integer(i2), c0Var);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, 2975901988402468424L, this, str, new Integer(i), new Integer(i2), c0Var);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = 3742554145031851000L)
        public void Ej(List<SourceEntity> list) {
            try {
                if (FH) {
                    iy.tp(2132003361968001153L, this, list);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 2132003361968001153L, this, list);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -1802441292873346480L)
        public void FN(String str, long j, int i, int i2, SourceEntity sourceEntity) {
            try {
                if (FH) {
                    iy.J8(-4836479091461911377L, this, str, new Long(j), new Integer(i), new Integer(i2), sourceEntity);
                }
                if (CodeAnalysisEngineService.this.navigationListener != null) {
                    try {
                        CodeAnalysisEngineService.this.navigationListener.FN(str, j, i, i2, sourceEntity);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.lg(th, -4836479091461911377L, this, str, new Long(j), new Integer(i), new Integer(i2), sourceEntity);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -1150541308962787959L)
        public void Fd(String str, int i, int i2, int i3, int i4, boolean z) {
            try {
                if (FH) {
                    iy.QX(2294501651111686104L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.rN(th, 2294501651111686104L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = 843497776313486380L)
        public void GK(String str, List<SourceEntity> list) {
            try {
                if (FH) {
                    iy.EQ(4060902151443901791L, this, str, list);
                }
                if (CodeAnalysisEngineService.this.gotoSymbolListener != null) {
                    try {
                        CodeAnalysisEngineService.this.gotoSymbolListener.qp(str, list);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, 4060902151443901791L, this, str, list);
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // com.aide.engine.d0
        @ey(method = 1797757128188805399L)
        public void GT(String str, long j, int i, int i2, int i3, SourceEntity sourceEntity, List<SourceEntity> list, String str2) throws Throwable {
            char c;
            int i4 = this;
            try {
                if (FH) {
                    iy.QX(-1790766248324394600L, i4, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), sourceEntity, list, str2});
                }
                try {
                    if (CodeAnalysisEngineService.this.codeCompletionListener != null) {
                        try {
                            CodeAnalysisEngineService.this.codeCompletionListener.KH();
                            i4.j6.clear();
                            Iterator<SourceEntity> it = list.iterator();
                            while (it.hasNext()) {
                                i4.j6.add(it.next());
                                if (i4.j6.size() > 100) {
                                    CodeAnalysisEngineService.this.codeCompletionListener.pf(i4.j6);
                                    i4.j6.clear();
                                }
                            }
                            CodeAnalysisEngineService.this.codeCompletionListener.pf(i4.j6);
                            ICodeCompletionListener iCodeCompletionListener = CodeAnalysisEngineService.this.codeCompletionListener;
                            c = '\b';
                            i4 = 8;
                            try {
                                iCodeCompletionListener.UI(str, j, i, i2, i3, sourceEntity, str2);
                            } catch (RemoteException e) {
                                e = e;
                                AppLog.v5(e);
                                i4 = c;
                            }
                        } catch (RemoteException e2) {
                            e = e2;
                            c = '\b';
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (Hw) {
                        Object[] objArr = new Object[i4];
                        objArr[0] = str;
                        objArr[1] = new Long(j);
                        objArr[2] = new Integer(i);
                        objArr[3] = new Integer(i2);
                        objArr[4] = new Integer(i3);
                        objArr[5] = sourceEntity;
                        objArr[6] = list;
                        objArr[7] = str2;
                        iy.rN(th, -1790766248324394600L, this, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i4 = 8;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = 835140488616215889L)
        public void Hl(String str) {
            try {
                if (FH) {
                    iy.tp(-4952775475092630880L, this, str);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -4952775475092630880L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -2449258051907442885L)
        public void Lz(String str, long j, int i, int i2) {
            try {
                if (FH) {
                    iy.J0(-5780875097052504576L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, -5780875097052504576L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -578426629079815573L)
        public void PH(String str, long j) {
            try {
                if (FH) {
                    iy.EQ(-1494971673825324960L, this, str, new Long(j));
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -1494971673825324960L, this, str, new Long(j));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -181635874989074832L)
        public void WB(String str) {
            try {
                if (FH) {
                    iy.tp(2538734708211173263L, this, str);
                }
                if (CodeAnalysisEngineService.this.gotoSymbolListener != null) {
                    try {
                        CodeAnalysisEngineService.this.gotoSymbolListener.WB(str);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 2538734708211173263L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -2191335279027033988L)
        public void Yi(String str, long j, List<SourceEntity> list) {
            try {
                if (FH) {
                    iy.we(1351070190262892765L, this, str, new Long(j), list);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.U2(th, 1351070190262892765L, this, str, new Long(j), list);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = 1267820843568639225L)
        public void ct(String str, long j, int i, int i2) {
            try {
                if (FH) {
                    iy.J0(1158988723712934576L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                if (CodeAnalysisEngineService.this.navigationListener != null) {
                    try {
                        CodeAnalysisEngineService.this.navigationListener.ct(str, j, i, i2);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, 1158988723712934576L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = 1311357055393251144L)
        public void dW(String str) {
            try {
                if (FH) {
                    iy.tp(-2556514752406576605L, this, str);
                }
                if (CodeAnalysisEngineService.this.gotoSymbolListener != null) {
                    try {
                        CodeAnalysisEngineService.this.gotoSymbolListener.WB(str);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -2556514752406576605L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -1310669177708545980L)
        public void hp(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            try {
                if (FH) {
                    iy.QX(-8150139992756711259L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.rN(th, -8150139992756711259L, this, new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -3217395502222228983L)
        public void jw(String str, long j, int i, int i2) {
            try {
                if (FH) {
                    iy.J0(-481307404423266432L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                if (CodeAnalysisEngineService.this.codeCompletionListener != null) {
                    try {
                        CodeAnalysisEngineService.this.codeCompletionListener.jw(str, j, i, i2);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, -481307404423266432L, this, str, new Long(j), new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -737764223968015101L)
        public void oY(SourceEntity sourceEntity) {
            try {
                if (FH) {
                    iy.tp(1478153618158297680L, this, sourceEntity);
                }
                if (CodeAnalysisEngineService.this.gotoSymbolListener != null) {
                    try {
                        CodeAnalysisEngineService.this.gotoSymbolListener.oY(sourceEntity);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1478153618158297680L, this, sourceEntity);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = 1318439902999553712L)
        public void oh(String str, long j, int i, int i2, int i3, List<SourceEntity> list) {
            try {
                if (FH) {
                    iy.QX(-5047942607927358425L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), list});
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.rN(th, -5047942607927358425L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), list});
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -5490608269794857889L)
        public void pl(String str) {
            try {
                if (FH) {
                    iy.tp(3944107802062773136L, this, str);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 3944107802062773136L, this, str);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = 6693197161631024064L)
        public void qp(String str, List<SourceEntity> list) {
            try {
                if (FH) {
                    iy.EQ(-1047933509569971297L, this, str, list);
                }
                if (CodeAnalysisEngineService.this.gotoSymbolListener != null) {
                    try {
                        CodeAnalysisEngineService.this.gotoSymbolListener.qp(str, list);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -1047933509569971297L, this, str, list);
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -106524252330182505L)
        public void sT(String str, long j, int i, int i2, int[] iArr, int[] iArr2, List<SourceEntity> list) {
            try {
                if (FH) {
                    iy.QX(-1935793918265982300L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), iArr, iArr2, list});
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.rN(th, -1935793918265982300L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), iArr, iArr2, list});
                }
                throw th;
            }
        }

        @Override // com.aide.engine.d0
        @ey(method = -7895995948401764335L)
        public void xg(String str, long j, int i, int i2, int i3, List<SourceEntity> list) {
            try {
                if (FH) {
                    iy.QX(-2511369516313237944L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), list});
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.rN(th, -2511369516313237944L, this, new Object[]{str, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), list});
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(CodeAnalysisEngineService.class);
    }

    @ey(method = 1898740300811936400L)
    public CodeAnalysisEngineService() {
        try {
            if (zh) {
                iy.gn(-741790584612676469L, null);
            }
            this.codeAnalysisEngineServiceSub = new CodeAnalysisEngineServiceImpl();
            Engine engine = new Engine(new CodeModelsFactory(this));
            this.engine = engine;
            engine.Do(new c());
            this.engine.Sx(new d());
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -741790584612676469L, null);
            }
            throw th;
        }
    }

    private static /* synthetic */ void startForeground(Object obj, int i, Notification notification) {
        ((CodeAnalysisEngineService) obj).startForeground(i, notification);
        iy.P8(obj, i, notification);
    }

    @Override // android.app.Service
    @ey(method = -123071573361024288L)
    public IBinder onBind(Intent intent) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (zh) {
                iy.tp(-6021532779299917777L, this, intent);
            }
            AppLog.VH("Engine service bound - pid " + Process.myPid() + " id " + System.identityHashCode(this));
            if (Build.VERSION.RELEASE.startsWith("4.4.")) {
                PendingIntent pendingIntentSy = MainActivity.sy(this);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "engine");
                builder.setWhen(System.currentTimeMillis());
                builder.setSmallIcon(R.drawable.stat_notify_more);
                builder.setContentTitle("Code Analysis");
                builder.setContentText("Code analysis engine is active");
                builder.setContentIntent(pendingIntentSy);
                builder.setPriority(-2);
                startForeground(this, 9973, builder.build());
            }
            DebuggerResourceProvider.setDefProvider(new a());
            return this.codeAnalysisEngineServiceSub;
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -6021532779299917777L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    @ey(method = 2647892210709175551L)
    public void onCreate() {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (zh) {
                iy.gn(-1392779776942266704L, this);
            }
            super.onCreate();
            Native.j6.init(this);
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -1392779776942266704L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    @ey(method = 3897921877164039599L)
    public void onDestroy() {
        try {
            if (zh) {
                iy.gn(-3655387390142169280L, this);
            }
            AppLog.VH("Engine service destroyed - pid " + Process.myPid() + " id " + System.identityHashCode(this));
            this.engine.shutdown();
            this.engine = null;
        } catch (Throwable th) {
            if (AL) {
                iy.aM(th, -3655387390142169280L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    @ey(method = 1904294237349829323L)
    public void onTrimMemory(int i) {
        try {
            if (zh) {
                iy.u7(-1065783692561423600L, this, i);
            }
            super.onTrimMemory(i);
            AppLog.VH("onTrimMemory - level: " + i);
        } catch (Throwable th) {
            if (AL) {
                iy.j3(th, -1065783692561423600L, this, new Integer(i));
            }
            throw th;
        }
    }
}
