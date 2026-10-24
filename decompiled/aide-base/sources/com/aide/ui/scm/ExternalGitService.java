package com.aide.ui.scm;

import abcd.ae0;
import abcd.b10;
import abcd.c10;
import abcd.cy;
import abcd.d10;
import abcd.dy;
import abcd.e20;
import abcd.ey;
import abcd.fe0;
import abcd.fy;
import abcd.g10;
import abcd.gy;
import abcd.h10;
import abcd.h70;
import abcd.i10;
import abcd.ia0;
import abcd.iy;
import abcd.j10;
import abcd.j70;
import abcd.jc0;
import abcd.jf0;
import abcd.k70;
import abcd.ka0;
import abcd.l10;
import abcd.o10;
import abcd.og0;
import abcd.q10;
import abcd.q60;
import abcd.r10;
import abcd.s10;
import abcd.s40;
import abcd.t10;
import abcd.t70;
import abcd.t90;
import abcd.td0;
import abcd.u10;
import abcd.uc0;
import abcd.ue0;
import abcd.vc0;
import abcd.wf0;
import abcd.x10;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.aide.common.AppLog;
import com.aide.common.StreamUtilities;
import com.aide.ui.scm.IExternalGitService;
import com.aide.ui.util.FileSystem;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 7192886908953962795L, container = 7192886908953962795L, user = true)
/* loaded from: classes.dex */
public class ExternalGitService extends Service {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = -53772593773286709L)
    private a WB;

    @cy(clazz = 218151561615816303L, container = 218151561615816303L, user = true)
    private class a extends IExternalGitService.Sub {

        @gy
        private static /* synthetic */ boolean hK;

        @fy
        private static /* synthetic */ boolean w9;

        @dy(field = -442446357305965829L)
        private String AL;

        @dy(field = 835283869482499287L)
        private boolean fY;

        @dy(field = -1761195798733009439L)
        private Object jw;

        @dy(field = 3822493525408268480L)
        private String k2;

        @dy(field = -2548825239094979775L)
        private Object qp;

        @dy(field = 233618489105837840L)
        private String zh;

        @cy(clazz = 2891067306145705596L, container = 218151561615816303L, user = true)
        /* renamed from: com.aide.ui.scm.ExternalGitService$a$a, reason: collision with other inner class name */
        class C0074a extends b {

            @gy
            private static /* synthetic */ boolean VH;

            @fy
            private static /* synthetic */ boolean Zo;

            static {
                iy.Zo(C0074a.class);
            }

            @ey(method = -651902466859758912L)
            C0074a(a aVar, og0 og0Var, ExternalGitService externalGitService) {
                super(og0Var);
            }

            @Override // com.aide.ui.scm.ExternalGitService.b, abcd.og0
            @ey(method = -1356086188049318600L)
            public ia0 u7(q60 q60Var, wf0 wf0Var) {
                try {
                    if (Zo) {
                        iy.EQ(204879926245956305L, this, q60Var, wf0Var);
                    }
                    return new ia0(q60Var, new File(FileSystem.tp(), ".gitconfig"), wf0Var);
                } catch (Throwable th) {
                    if (VH) {
                        iy.Mr(th, 204879926245956305L, this, q60Var, wf0Var);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 2891131647216859255L, container = 218151561615816303L, user = true)
        class b extends vc0 {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = -3599040740992518952L)
            final /* synthetic */ IExternalGitServiceListener DW;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -6046901970368460576L)
            b(a aVar, IExternalGitServiceListener iExternalGitServiceListener) {
                this.DW = iExternalGitServiceListener;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
            @abcd.ey(method = 1785529221816793321L)
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private boolean VH(abcd.ue0 r8, abcd.uc0 r9) {
                /*
                    r7 = this;
                    boolean r0 = com.aide.ui.scm.ExternalGitService.a.b.FH     // Catch: java.lang.Throwable -> L9f
                    if (r0 == 0) goto Lc
                    r0 = 1900900086023816757(0x1a615a8e8cf58635, double:1.3069099092558746E-181)
                    abcd.iy.EQ(r0, r7, r8, r9)     // Catch: java.lang.Throwable -> L9f
                Lc:
                    boolean r0 = r9 instanceof abcd.uc0.d     // Catch: java.lang.Throwable -> L9f
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L2b
                    com.aide.ui.scm.IExternalGitServiceListener r0 = r7.DW     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L9f
                    java.lang.String r3 = r9.j6()     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L9f
                    java.lang.String r0 = r0.jB(r3)     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L9f
                    if (r0 != 0) goto L1f
                    return r2
                L1f:
                    r3 = r9
                    abcd.uc0$d r3 = (abcd.uc0.d) r3     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L9f
                    r3.FH(r0)     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L9f
                    return r1
                L26:
                    r0 = move-exception
                    com.aide.common.AppLog.v5(r0)     // Catch: java.lang.Throwable -> L9f
                    return r2
                L2b:
                    boolean r0 = r9 instanceof abcd.uc0.a     // Catch: java.lang.Throwable -> L9f
                    if (r0 == 0) goto L4c
                    com.aide.ui.scm.IExternalGitServiceListener r0 = r7.DW     // Catch: android.os.RemoteException -> L47 java.lang.Throwable -> L9f
                    java.lang.String r3 = r9.j6()     // Catch: android.os.RemoteException -> L47 java.lang.Throwable -> L9f
                    java.lang.String r0 = r0.jB(r3)     // Catch: android.os.RemoteException -> L47 java.lang.Throwable -> L9f
                    if (r0 != 0) goto L3c
                    return r2
                L3c:
                    r3 = r9
                    abcd.uc0$a r3 = (abcd.uc0.a) r3     // Catch: android.os.RemoteException -> L47 java.lang.Throwable -> L9f
                    char[] r0 = r0.toCharArray()     // Catch: android.os.RemoteException -> L47 java.lang.Throwable -> L9f
                    r3.Hw(r0)     // Catch: android.os.RemoteException -> L47 java.lang.Throwable -> L9f
                    return r1
                L47:
                    r0 = move-exception
                    com.aide.common.AppLog.v5(r0)     // Catch: java.lang.Throwable -> L9f
                    return r2
                L4c:
                    boolean r0 = r9 instanceof abcd.uc0.b     // Catch: java.lang.Throwable -> L9f
                    if (r0 == 0) goto L5f
                    com.aide.ui.scm.IExternalGitServiceListener r0 = r7.DW     // Catch: android.os.RemoteException -> L5a java.lang.Throwable -> L9f
                    java.lang.String r3 = r9.j6()     // Catch: android.os.RemoteException -> L5a java.lang.Throwable -> L9f
                    r0.iE(r3)     // Catch: android.os.RemoteException -> L5a java.lang.Throwable -> L9f
                    return r1
                L5a:
                    r0 = move-exception
                    com.aide.common.AppLog.v5(r0)     // Catch: java.lang.Throwable -> L9f
                    return r2
                L5f:
                    boolean r0 = r9 instanceof abcd.uc0.f     // Catch: java.lang.Throwable -> L9f
                    if (r0 == 0) goto L80
                    com.aide.ui.scm.IExternalGitServiceListener r0 = r7.DW     // Catch: android.os.RemoteException -> L7b java.lang.Throwable -> L9f
                    java.lang.String r3 = r9.j6()     // Catch: android.os.RemoteException -> L7b java.lang.Throwable -> L9f
                    java.lang.String r0 = r0.Lg(r3)     // Catch: android.os.RemoteException -> L7b java.lang.Throwable -> L9f
                    if (r0 != 0) goto L70
                    return r2
                L70:
                    r3 = r9
                    abcd.uc0$f r3 = (abcd.uc0.f) r3     // Catch: android.os.RemoteException -> L7b java.lang.Throwable -> L9f
                    boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: android.os.RemoteException -> L7b java.lang.Throwable -> L9f
                    r3.FH(r0)     // Catch: android.os.RemoteException -> L7b java.lang.Throwable -> L9f
                    return r1
                L7b:
                    r0 = move-exception
                    com.aide.common.AppLog.v5(r0)     // Catch: java.lang.Throwable -> L9f
                    return r2
                L80:
                    abcd.m50 r0 = new abcd.m50     // Catch: java.lang.Throwable -> L9f
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
                    r1.<init>()     // Catch: java.lang.Throwable -> L9f
                    java.lang.String r2 = "Unsupported CredentialItem: "
                    r1.append(r2)     // Catch: java.lang.Throwable -> L9f
                    java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> L9f
                    java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L9f
                    r1.append(r2)     // Catch: java.lang.Throwable -> L9f
                    java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9f
                    r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L9f
                    throw r0     // Catch: java.lang.Throwable -> L9f
                L9f:
                    r0 = move-exception
                    boolean r1 = com.aide.ui.scm.ExternalGitService.a.b.Hw
                    if (r1 == 0) goto Lb0
                    r2 = 1900900086023816757(0x1a615a8e8cf58635, double:1.3069099092558746E-181)
                    r1 = r0
                    r4 = r7
                    r5 = r8
                    r6 = r9
                    abcd.iy.Mr(r1, r2, r4, r5, r6)
                Lb0:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.scm.ExternalGitService.a.b.VH(abcd.ue0, abcd.uc0):boolean");
            }

            @ey(method = 190578604794047856L)
            private boolean gn(uc0 uc0Var) {
                try {
                    if (FH) {
                        iy.tp(-6462820985843377920L, this, uc0Var);
                    }
                    if (!(uc0Var instanceof uc0.d) && !(uc0Var instanceof uc0.a) && !(uc0Var instanceof uc0.b)) {
                        if (!(uc0Var instanceof uc0.f)) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, -6462820985843377920L, this, uc0Var);
                    }
                    throw th;
                }
            }

            @Override // abcd.vc0
            @ey(method = 5294819827702543047L)
            public boolean DW(ue0 ue0Var, uc0[] uc0VarArr) {
                try {
                    if (FH) {
                        iy.EQ(-284493352116942333L, this, ue0Var, uc0VarArr);
                    }
                    for (uc0 uc0Var : uc0VarArr) {
                        if (!VH(ue0Var, uc0Var)) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, -284493352116942333L, this, ue0Var, uc0VarArr);
                    }
                    throw th;
                }
            }

            @Override // abcd.vc0
            @ey(method = 2166379145496450508L)
            public boolean Hw() {
                try {
                    if (!FH) {
                        return true;
                    }
                    iy.gn(-3225130403363769440L, this);
                    return true;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.aM(th, -3225130403363769440L, this);
                    }
                    throw th;
                }
            }

            @Override // abcd.vc0
            @ey(method = 1342895919213038265L)
            public boolean Zo(uc0[] uc0VarArr) {
                try {
                    if (FH) {
                        iy.tp(498281066927116431L, this, uc0VarArr);
                    }
                    for (uc0 uc0Var : uc0VarArr) {
                        if (!gn(uc0Var)) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, 498281066927116431L, this, uc0VarArr);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 1684223088746220752L, container = 1684223088746220752L, user = true)
        private class c implements j70 {

            @fy
            private static /* synthetic */ boolean Hw;

            @gy
            private static /* synthetic */ boolean v5;

            @dy(field = 1411274690053532559L)
            private int DW;

            @dy(field = 1410220231680338577L)
            final /* synthetic */ a FH;

            @dy(field = -1472265803902339120L)
            private IExternalGitServiceListener j6;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -402916573104227913L)
            public c(a aVar, IExternalGitServiceListener iExternalGitServiceListener) {
                try {
                    if (Hw) {
                        iy.EQ(3846975168131848896L, null, aVar, iExternalGitServiceListener);
                    }
                    this.FH = aVar;
                    this.j6 = iExternalGitServiceListener;
                } catch (Throwable th) {
                    if (v5) {
                        iy.Mr(th, 3846975168131848896L, null, aVar, iExternalGitServiceListener);
                    }
                    throw th;
                }
            }

            @Override // abcd.j70
            @ey(method = -230718350974765420L)
            public void DW(int i) {
                try {
                    if (Hw) {
                        iy.u7(-3363808588894737864L, this, i);
                    }
                    try {
                        this.j6.Yd(i);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.j3(th, -3363808588894737864L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // abcd.j70
            @ey(method = -3277064885074235199L)
            public void FH() {
                try {
                    if (Hw) {
                        iy.gn(-881022288026859633L, this);
                    }
                    try {
                        this.j6.gy();
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.aM(th, -881022288026859633L, this);
                    }
                    throw th;
                }
            }

            @Override // abcd.j70
            @ey(method = 2842640322190560300L)
            public boolean isCancelled() {
                boolean z;
                try {
                    if (Hw) {
                        iy.gn(512414457881733336L, this);
                    }
                    synchronized (this.FH.jw) {
                        z = this.FH.fY;
                    }
                    return z;
                } catch (Throwable th) {
                    if (v5) {
                        iy.aM(th, 512414457881733336L, this);
                    }
                    throw th;
                }
            }

            @Override // abcd.j70
            @ey(method = 355522114860636048L)
            public void j6(String str, int i) {
                try {
                    if (Hw) {
                        iy.EQ(232286020199846184L, this, str, new Integer(i));
                    }
                    try {
                        this.DW = 0;
                        this.j6.d4(str, i);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.Mr(th, 232286020199846184L, this, str, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // abcd.j70
            @ey(method = -206766622331557505L)
            public void v5(int i) {
                try {
                    if (Hw) {
                        iy.u7(-365513736548571447L, this, i);
                    }
                    try {
                        int i2 = this.DW + i;
                        this.DW = i2;
                        this.j6.AJ(i2);
                    } catch (RemoteException e) {
                        AppLog.v5(e);
                    }
                } catch (Throwable th) {
                    if (v5) {
                        iy.j3(th, -365513736548571447L, this, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 8539547521240212729L)
        public a(ExternalGitService externalGitService) {
            try {
                if (w9) {
                    iy.tp(94416082361201979L, null, externalGitService);
                }
                this.jw = new Object();
                this.qp = new Object();
                this.k2 = FileSystem.vy();
                wf0.FH.we(new File(this.k2));
                og0.tp(new C0074a(this, og0.FH(), externalGitService));
            } catch (Throwable th) {
                if (hK) {
                    iy.j3(th, 94416082361201979L, null, externalGitService);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        @abcd.ey(method = 989983152234869L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void AR(com.aide.ui.scm.IExternalGitServiceListener r9, java.lang.String r10, java.lang.Throwable r11) {
            /*
                r8 = this;
                boolean r0 = com.aide.ui.scm.ExternalGitService.a.w9     // Catch: java.lang.Throwable -> L53
                if (r0 == 0) goto L10
                r1 = -2823350550109834797(0xd8d171a2284cb1d3, double:-7.038196639125766E119)
                r3 = r8
                r4 = r9
                r5 = r10
                r6 = r11
                abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L53
            L10:
                com.aide.common.AppLog.v5(r11)     // Catch: java.lang.Throwable -> L53
                if (r9 == 0) goto L52
                boolean r0 = r11 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L53
                if (r0 == 0) goto L2e
                r9.J1()     // Catch: android.os.RemoteException -> L1d java.lang.Throwable -> L53
                goto L21
            L1d:
                r0 = move-exception
                com.aide.common.AppLog.v5(r0)     // Catch: java.lang.Throwable -> L53
            L21:
                java.lang.String r0 = "Git service process killed after OOM"
                com.aide.common.AppLog.DW(r0)     // Catch: java.lang.Throwable -> L53
                int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L53
                android.os.Process.killProcess(r0)     // Catch: java.lang.Throwable -> L53
                goto L52
            L2e:
                java.lang.String r0 = r8.oy(r11)     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                if (r0 != 0) goto L36
                java.lang.String r0 = ""
            L36:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                r1.<init>()     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                r1.append(r10)     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                java.lang.String r2 = " failed: "
                r1.append(r2)     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                r1.append(r0)     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                java.lang.String r0 = r1.toString()     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                r9.qi(r0)     // Catch: android.os.RemoteException -> L4e java.lang.Throwable -> L53
                goto L52
            L4e:
                r0 = move-exception
                com.aide.common.AppLog.v5(r0)     // Catch: java.lang.Throwable -> L53
            L52:
                return
            L53:
                r0 = move-exception
                boolean r1 = com.aide.ui.scm.ExternalGitService.a.hK
                if (r1 == 0) goto L65
                r2 = -2823350550109834797(0xd8d171a2284cb1d3, double:-7.038196639125766E119)
                r1 = r0
                r4 = r8
                r5 = r9
                r6 = r10
                r7 = r11
                abcd.iy.U2(r1, r2, r4, r5, r6, r7)
            L65:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.scm.ExternalGitService.a.AR(com.aide.ui.scm.IExternalGitServiceListener, java.lang.String, java.lang.Throwable):void");
        }

        @ey(method = 249201737637270992L)
        private String BR(String str, String str2) {
            try {
                if (w9) {
                    iy.EQ(-3030471500443674740L, this, str, str2);
                }
                if (!str.endsWith(File.separator)) {
                    str = str + File.separator;
                }
                if (str2.startsWith(str)) {
                    return str2.substring(str.length());
                }
                throw new IllegalArgumentException(str2 + " not in repository " + str);
            } catch (Throwable th) {
                if (hK) {
                    iy.Mr(th, -3030471500443674740L, this, str, str2);
                }
                throw th;
            }
        }

        @ey(method = -5911203567810806897L)
        private void Bx(IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.tp(-5031592252082050695L, this, iExternalGitServiceListener);
                }
                synchronized (this.jw) {
                    if (this.fY) {
                        this.fY = false;
                        try {
                            iExternalGitServiceListener.oP();
                        } catch (RemoteException e) {
                            AppLog.v5(e);
                        }
                    }
                }
            } catch (Throwable th) {
                if (hK) {
                    iy.j3(th, -5031592252082050695L, this, iExternalGitServiceListener);
                }
                throw th;
            }
        }

        @ey(method = -536067604916695413L)
        private void CU(String str, List<ModifiedFile> list, Iterable<String> iterable, int i, Set<String> set, boolean z) {
            try {
                if (w9) {
                    iy.QX(-41812982706217887L, this, new Object[]{str, list, iterable, new Integer(i), set, new Boolean(z)});
                }
                for (String str2 : iterable) {
                    if (set == null || !set.contains(str2)) {
                        list.add(new ModifiedFile(new File(str, str2).getPath(), i));
                    }
                }
            } catch (Throwable th) {
                if (hK) {
                    iy.rN(th, -41812982706217887L, this, new Object[]{str, list, iterable, new Integer(i), set, new Boolean(z)});
                }
                throw th;
            }
        }

        @ey(method = 4227934485084843520L)
        private void Ev(String str, List<ModifiedFile> list, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.J0(-435268884573137048L, this, str, list, str2, iExternalGitServiceListener);
                }
                l10 l10VarJ0 = l10.J0(new File(str));
                try {
                    b10 b10VarJ6 = l10VarJ0.j6();
                    boolean z = false;
                    for (ModifiedFile modifiedFile : list) {
                        if (modifiedFile.v5() || modifiedFile.gn() || modifiedFile.Zo() || modifiedFile.Hw()) {
                            b10VarJ6.Hw(BR(str, modifiedFile.WB));
                            z = true;
                        }
                    }
                    if (z) {
                        b10VarJ6.call();
                    }
                    Bx(iExternalGitServiceListener);
                    h10 h10VarGn = l10VarJ0.gn();
                    h10VarGn.tp(false);
                    h10VarGn.we(str2);
                    Iterator<ModifiedFile> it = list.iterator();
                    while (it.hasNext()) {
                        h10VarGn.J0(BR(str, it.next().WB));
                    }
                    h10VarGn.call();
                } finally {
                    l10VarJ0.u7().j6();
                }
            } catch (Throwable th) {
                if (hK) {
                    iy.a8(th, -435268884573137048L, this, str, list, str2, iExternalGitServiceListener);
                }
                throw th;
            }
        }

        @ey(method = 1200868696592962333L)
        private void Lz(l10 l10Var, String str, OutputStream outputStream) {
            try {
                if (w9) {
                    iy.we(-246342915931803353L, this, l10Var, str, outputStream);
                }
                h70 h70VarU7 = l10Var.u7().BT(jf0.Zo(l10Var.u7(), str, new t90(l10Var.u7()).ca(l10Var.u7().ro("HEAD")).Eq()).tp(0), 3).u7();
                try {
                    StreamUtilities.Zo(h70VarU7, outputStream);
                } finally {
                    h70VarU7.close();
                }
            } catch (Throwable th) {
                if (hK) {
                    iy.U2(th, -246342915931803353L, this, l10Var, str, outputStream);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @abcd.ey(method = 157630105252199133L)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void aq(com.aide.ui.scm.GitConfiguration r10) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.scm.ExternalGitService.a.aq(com.aide.ui.scm.GitConfiguration):void");
        }

        @ey(method = 715188388800195016L)
        private void fY(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(-5160708306114448000L, this, str, str2, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        t70 t70VarGn = l10VarJ0.u7().gn();
                        t70VarGn.ro("remote", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "url", str2);
                        t70VarGn.ef();
                        l10VarJ0.u7().j6();
                    } catch (Throwable th) {
                        l10VarJ0.u7().j6();
                        throw th;
                    }
                } catch (Throwable th2) {
                    AR(iExternalGitServiceListener, "Git push", th2);
                }
            } catch (Throwable th3) {
                if (hK) {
                    iy.U2(th3, -5160708306114448000L, this, str, str2, iExternalGitServiceListener);
                }
                throw th3;
            }
        }

        @ey(method = -7391909976052139301L)
        private String oy(Throwable th) {
            try {
                if (w9) {
                    iy.tp(-5870866290774148151L, this, th);
                }
                return ys(th, 0, 100);
            } catch (Throwable th2) {
                if (hK) {
                    iy.j3(th2, -5870866290774148151L, this, th);
                }
                throw th2;
            }
        }

        @ey(method = -6684628740696868884L)
        private GitStatus pN(String str, l10 l10Var, x10 x10Var, Map<String, jc0> map) {
            try {
                if (w9) {
                    iy.J0(3184729617407011584L, this, str, l10Var, x10Var, map);
                }
                Set<String> setKeySet = map.keySet();
                ArrayList arrayList = new ArrayList();
                CU(str, arrayList, x10Var.j6(), 1, null, false);
                CU(str, arrayList, x10Var.DW(), 2, null, true);
                CU(str, arrayList, x10Var.FH(), 64, null, true);
                CU(str, arrayList, x10Var.Hw(), 8, setKeySet, true);
                CU(str, arrayList, x10Var.v5(), 16, null, true);
                CU(str, arrayList, x10Var.Zo(), 4, null, true);
                CU(str, arrayList, x10Var.VH(), 32, null, false);
                return new GitStatus(str, arrayList);
            } catch (Throwable th) {
                if (hK) {
                    iy.a8(th, 3184729617407011584L, this, str, l10Var, x10Var, map);
                }
                throw th;
            }
        }

        @ey(method = -761320058565789336L)
        private vc0 pO(IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.tp(238649560918221212L, this, iExternalGitServiceListener);
                }
                return new b(this, iExternalGitServiceListener);
            } catch (Throwable th) {
                if (hK) {
                    iy.j3(th, 238649560918221212L, this, iExternalGitServiceListener);
                }
                throw th;
            }
        }

        @ey(method = 863361875358160577L)
        private String ys(Throwable th, int i, int i2) {
            String strYs;
            try {
                if (w9) {
                    iy.we(-1811607765559279389L, this, th, new Integer(i), new Integer(i2));
                }
                return (i >= i2 || th.getCause() == null || (strYs = ys(th.getCause(), i + 1, i2)) == null) ? th.getMessage() : strYs;
            } catch (Throwable th2) {
                if (hK) {
                    iy.U2(th2, -1811607765559279389L, this, th, new Integer(i), new Integer(i2));
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 5788940325591814560L)
        public void Bl(GitConfiguration gitConfiguration, String str, List<ModifiedFile> list, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.J8(356976378720861840L, this, gitConfiguration, str, list, str2, iExternalGitServiceListener);
                }
                try {
                    aq(gitConfiguration);
                    Ev(str, list, str2, iExternalGitServiceListener);
                    Bx(iExternalGitServiceListener);
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git commit", th);
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.lg(th2, 356976378720861840L, this, gitConfiguration, str, list, str2, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = -388920930452635737L)
        public void Cd(GitConfiguration gitConfiguration, String str, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(-4526792649467179347L, this, gitConfiguration, str, iExternalGitServiceListener);
                }
                try {
                    aq(gitConfiguration);
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        u10 u10VarQX = l10VarJ0.QX();
                        u10VarQX.VH(pO(iExternalGitServiceListener));
                        u10 u10Var = u10VarQX;
                        u10Var.we(new c(this, iExternalGitServiceListener));
                        for (td0 td0Var : u10Var.call()) {
                            for (ae0 ae0Var : td0Var.VH()) {
                                if (ae0Var.Hw() != ae0.a.OK && ae0Var.Hw() != ae0.a.UP_TO_DATE) {
                                    throw new Exception("Messages: " + td0Var.v5() + " Status: " + ae0Var.Hw());
                                }
                            }
                        }
                        if (!gitConfiguration.fY) {
                            fe0.Hw(null);
                        }
                        l10VarJ0.u7().j6();
                        Bx(iExternalGitServiceListener);
                    } catch (Throwable th) {
                        if (!gitConfiguration.fY) {
                            fe0.Hw(null);
                        }
                        l10VarJ0.u7().j6();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (!(th2.getCause() instanceof s40)) {
                        AR(iExternalGitServiceListener, "Git push", th2);
                        return;
                    }
                    String strNV = iExternalGitServiceListener.nV("Please specifiy a valid remote repository url:");
                    if (strNV != null) {
                        fY(str, strNV, iExternalGitServiceListener);
                        Cd(gitConfiguration, str, iExternalGitServiceListener);
                    }
                }
            } catch (Throwable th3) {
                if (hK) {
                    iy.U2(th3, -4526792649467179347L, this, gitConfiguration, str, iExternalGitServiceListener);
                }
                throw th3;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = -2591649712724916723L)
        public void HE(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(6463718096382250707L, this, str, str2, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        q10 q10VarWe = l10VarJ0.we();
                        q10VarWe.VH(l10VarJ0.u7().ro(str2));
                        r10 r10VarCall = q10VarWe.call();
                        if (r10VarCall.DW() != r10.a.jw) {
                            return;
                        }
                        throw new Exception("Git merge failed: " + r10VarCall.DW().toString());
                    } finally {
                        l10VarJ0.u7().j6();
                    }
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git merge", th);
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.U2(th2, 6463718096382250707L, this, str, str2, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 1084558944550972480L)
        public void IE(GitConfiguration gitConfiguration, String str, String str2, String str3, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.J8(-1344057953651211880L, this, gitConfiguration, str, str2, str3, iExternalGitServiceListener);
                }
                try {
                    aq(gitConfiguration);
                    g10 g10VarVH = l10.VH();
                    g10VarVH.Mr(new File(str, str2));
                    g10VarVH.j3(true);
                    g10VarVH.VH(pO(iExternalGitServiceListener));
                    g10 g10Var = g10VarVH;
                    g10Var.U2(new c(this, iExternalGitServiceListener));
                    g10Var.a8(str3);
                    g10Var.call().u7().j6();
                    Bx(iExternalGitServiceListener);
                } catch (Throwable th) {
                    try {
                        AR(iExternalGitServiceListener, "Git clone", th);
                        if (gitConfiguration.fY) {
                        }
                    } finally {
                        if (!gitConfiguration.fY) {
                            fe0.Hw(null);
                        }
                    }
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.lg(th2, -1344057953651211880L, this, gitConfiguration, str, str2, str3, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = -1809470506796593179L)
        public String JT(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(-1332314365202703045L, this, str, str2, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        File fileCreateTempFile = File.createTempFile("gitcontent", ".txt", new File(FileSystem.aM()));
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            Lz(l10VarJ0, BR(str, str2), fileOutputStream);
                            fileOutputStream.close();
                            Bx(iExternalGitServiceListener);
                            return fileCreateTempFile.getPath();
                        } catch (Throwable th) {
                            fileOutputStream.close();
                            throw th;
                        }
                    } finally {
                        l10VarJ0.u7().j6();
                    }
                } catch (Throwable th2) {
                    AR(iExternalGitServiceListener, "Git get base file content", th2);
                    return null;
                }
            } catch (Throwable th3) {
                if (hK) {
                    iy.U2(th3, -1332314365202703045L, this, str, str2, iExternalGitServiceListener);
                }
                throw th3;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 297746764496311044L)
        public void MN(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(-78195313038530544L, this, str, str2, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        j10 j10VarFH = l10VarJ0.FH();
                        j10VarFH.Zo(str2);
                        j10VarFH.call();
                        l10VarJ0.u7().j6();
                    } catch (Throwable th) {
                        l10VarJ0.u7().j6();
                        throw th;
                    }
                } catch (Throwable th2) {
                    AR(iExternalGitServiceListener, "Git delete branch", th2);
                }
            } catch (Throwable th3) {
                if (hK) {
                    iy.U2(th3, -78195313038530544L, this, str, str2, iExternalGitServiceListener);
                }
                throw th3;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 2418475675450490775L)
        public List<String> cS(String str, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.EQ(3137660037247581621L, this, str, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        o10 o10VarHw = l10VarJ0.Hw();
                        o10VarHw.v5(o10.b.ALL);
                        List<k70> listCall = o10VarHw.call();
                        ArrayList arrayList = new ArrayList();
                        Iterator<k70> it = listCall.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getName());
                        }
                        return arrayList;
                    } finally {
                        l10VarJ0.u7().j6();
                    }
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git get branches", th);
                    return null;
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.Mr(th2, 3137660037247581621L, this, str, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 356869249496836227L)
        public void cancel() {
            try {
                if (w9) {
                    iy.gn(711491374064695161L, this);
                }
                synchronized (this.jw) {
                    this.fY = true;
                }
            } catch (Throwable th) {
                if (hK) {
                    iy.aM(th, 711491374064695161L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 2073006553009129401L)
        public void cz(String str, String str2, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(145944403442658639L, this, str, str2, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        c10 c10VarV5 = l10VarJ0.v5();
                        c10VarV5.J0(str2);
                        c10VarV5.call();
                        if (c10VarV5.gn().j6() == d10.a.OK) {
                            return;
                        }
                        throw new Exception("Git checkout failed: " + c10VarV5.gn().j6());
                    } finally {
                        l10VarJ0.u7().j6();
                    }
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git checkout", th);
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.U2(th2, 145944403442658639L, this, str, str2, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = -2260859316280412385L)
        public GitStatus el(String str, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.EQ(-499098385440945255L, this, str, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        x10 x10VarCall = l10VarJ0.XL().call();
                        Map<String, jc0> mapCall = l10VarJ0.aM().call();
                        Bx(iExternalGitServiceListener);
                        return pN(str, l10VarJ0, x10VarCall, mapCall);
                    } finally {
                        l10VarJ0.u7().j6();
                    }
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git status", th);
                    return null;
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.Mr(th2, -499098385440945255L, this, str, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 3296141615000024901L)
        public void of(GitConfiguration gitConfiguration, String str, String str2, List<String> list, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.J8(-115995237845493393L, this, gitConfiguration, str, str2, list, iExternalGitServiceListener);
                }
                try {
                    aq(gitConfiguration);
                    new File(str).mkdirs();
                    ka0 ka0Var = new ka0(new File(str, ".git"));
                    ka0Var.DW();
                    ka0Var.j6();
                    FileWriter fileWriter = new FileWriter(new File(str, ".gitignore"));
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        fileWriter.write(it.next() + "\n");
                    }
                    fileWriter.close();
                    GitStatus gitStatusEl = el(str, iExternalGitServiceListener);
                    if (gitStatusEl.mb.size() > 0) {
                        Ev(str, gitStatusEl.mb, str2, iExternalGitServiceListener);
                    }
                    Bx(iExternalGitServiceListener);
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git create", th);
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.lg(th2, -115995237845493393L, this, gitConfiguration, str, str2, list, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = -375335634111406488L)
        public void wN(GitConfiguration gitConfiguration, String str, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(-4590109599732858240L, this, gitConfiguration, str, iExternalGitServiceListener);
                }
                try {
                    try {
                        aq(gitConfiguration);
                        l10 l10VarJ0 = l10.J0(new File(str));
                        try {
                            s10 s10VarWs = l10VarJ0.Ws();
                            s10VarWs.VH(pO(iExternalGitServiceListener));
                            s10 s10Var = s10VarWs;
                            s10Var.EQ(new c(this, iExternalGitServiceListener));
                            t10 t10VarCall = s10Var.call();
                            if (!t10VarCall.DW()) {
                                if (t10VarCall.j6() != null && t10VarCall.j6().DW() == r10.a.qp) {
                                    throw new Exception(t10VarCall.j6().toString());
                                }
                                throw new Exception(t10VarCall.toString());
                            }
                            if (!gitConfiguration.fY) {
                                fe0.Hw(null);
                            }
                            l10VarJ0.u7().j6();
                            Bx(iExternalGitServiceListener);
                        } catch (Throwable th) {
                            if (!gitConfiguration.fY) {
                                fe0.Hw(null);
                            }
                            l10VarJ0.u7().j6();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        AR(iExternalGitServiceListener, "Git pull", th2);
                    }
                } catch (e20 unused) {
                    Bx(iExternalGitServiceListener);
                }
            } catch (Throwable th3) {
                if (hK) {
                    iy.U2(th3, -4590109599732858240L, this, gitConfiguration, str, iExternalGitServiceListener);
                }
                throw th3;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = -5115370423458892544L)
        public void wX(String str, String str2, String str3, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.J0(-4306611355448016688L, this, str, str2, str3, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        i10 i10VarDW = l10VarJ0.DW();
                        i10VarDW.gn(str2);
                        if (str3 != null) {
                            i10VarDW.u7(str3);
                            i10VarDW.tp(i10.a.TRACK);
                        }
                        i10VarDW.call();
                        c10 c10VarV5 = l10VarJ0.v5();
                        c10VarV5.J0(str2);
                        c10VarV5.call();
                        if (c10VarV5.gn().j6() == d10.a.OK) {
                            return;
                        }
                        throw new Exception("Git checkout failed: " + c10VarV5.gn().j6());
                    } finally {
                        l10VarJ0.u7().j6();
                    }
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git checkout", th);
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.a8(th2, -4306611355448016688L, this, str, str2, str3, iExternalGitServiceListener);
                }
                throw th2;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = 488182489004942667L)
        public void yj(String str, List<ModifiedFile> list, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.we(2061715301629300053L, this, str, list, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        c10 c10VarV5 = l10VarJ0.v5();
                        c10VarV5.we(true);
                        c10VarV5.J8("HEAD");
                        Iterator<ModifiedFile> it = list.iterator();
                        while (it.hasNext()) {
                            c10VarV5.v5(BR(str, it.next().WB));
                        }
                        c10VarV5.call();
                        if (c10VarV5.gn().j6() != d10.a.OK) {
                            throw new Exception("Git checkout failed: " + c10VarV5.gn().j6());
                        }
                        for (ModifiedFile modifiedFile : list) {
                            if (modifiedFile.DW() || modifiedFile.gn()) {
                                File file = new File(modifiedFile.WB);
                                if (file.exists() && !file.delete()) {
                                    throw new IOException("Could not delete " + modifiedFile.WB);
                                }
                                l10VarJ0.u7().j6();
                                Bx(iExternalGitServiceListener);
                            }
                        }
                        l10VarJ0.u7().j6();
                        Bx(iExternalGitServiceListener);
                    } catch (Throwable th) {
                        l10VarJ0.u7().j6();
                        throw th;
                    }
                } catch (Throwable th2) {
                    AR(iExternalGitServiceListener, "Git discard", th2);
                }
            } catch (Throwable th3) {
                if (hK) {
                    iy.U2(th3, 2061715301629300053L, this, str, list, iExternalGitServiceListener);
                }
                throw th3;
            }
        }

        @Override // com.aide.ui.scm.IExternalGitService
        @ey(method = -1024418188587198640L)
        public String zg(String str, IExternalGitServiceListener iExternalGitServiceListener) {
            try {
                if (w9) {
                    iy.EQ(-4279152239511659852L, this, str, iExternalGitServiceListener);
                }
                try {
                    l10 l10VarJ0 = l10.J0(new File(str));
                    try {
                        return l10VarJ0.u7().EQ();
                    } finally {
                        l10VarJ0.u7().j6();
                    }
                } catch (Throwable th) {
                    AR(iExternalGitServiceListener, "Git get branches", th);
                    return null;
                }
            } catch (Throwable th2) {
                if (hK) {
                    iy.Mr(th2, -4279152239511659852L, this, str, iExternalGitServiceListener);
                }
                throw th2;
            }
        }
    }

    @cy(clazz = 621418561516897040L, container = 621418561516897040L, user = true)
    private static class b extends og0 {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 1568478242312904272L)
        private og0 FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 24786148020526257L)
        public b(og0 og0Var) {
            try {
                if (Hw) {
                    iy.tp(1640118340055990865L, null, og0Var);
                }
                this.FH = og0Var;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 1640118340055990865L, null, og0Var);
                }
                throw th;
            }
        }

        @Override // abcd.og0
        @ey(method = 1808145153439003840L)
        public String DW() {
            try {
                if (Hw) {
                    iy.gn(-2292325475662718307L, this);
                }
                return this.FH.DW();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -2292325475662718307L, this);
                }
                throw th;
            }
        }

        @Override // abcd.og0
        @ey(method = -3555943673177371136L)
        public String Hw(String str) {
            try {
                if (Hw) {
                    iy.tp(299538557763665671L, this, str);
                }
                return this.FH.Hw(str);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 299538557763665671L, this, str);
                }
                throw th;
            }
        }

        @Override // abcd.og0
        @ey(method = 340438739387465424L)
        public String VH(String str) {
            try {
                if (Hw) {
                    iy.tp(-4502438644193470863L, this, str);
                }
                return this.FH.VH(str);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -4502438644193470863L, this, str);
                }
                throw th;
            }
        }

        @Override // abcd.og0
        @ey(method = -936766600452803871L)
        public int Zo(long j) {
            try {
                if (Hw) {
                    iy.tp(2090939972063703264L, this, new Long(j));
                }
                return this.FH.Zo(j);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 2090939972063703264L, this, new Long(j));
                }
                throw th;
            }
        }

        @Override // abcd.og0
        @ey(method = 45013022288549351L)
        public ia0 gn(q60 q60Var, wf0 wf0Var) {
            try {
                if (Hw) {
                    iy.EQ(-520125595223816560L, this, q60Var, wf0Var);
                }
                return this.FH.gn(q60Var, wf0Var);
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, -520125595223816560L, this, q60Var, wf0Var);
                }
                throw th;
            }
        }

        @Override // abcd.og0
        @ey(method = -4715546236546458771L)
        public long j6() {
            try {
                if (Hw) {
                    iy.gn(-274251529599367572L, this);
                }
                return this.FH.j6();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -274251529599367572L, this);
                }
                throw th;
            }
        }

        @Override // abcd.og0
        @ey(method = 513823653178810957L)
        public ia0 u7(q60 q60Var, wf0 wf0Var) {
            try {
                if (Hw) {
                    iy.EQ(4606991861702800800L, this, q60Var, wf0Var);
                }
                return this.FH.u7(q60Var, wf0Var);
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 4606991861702800800L, this, q60Var, wf0Var);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(ExternalGitService.class);
    }

    @ey(method = 2570301987675618048L)
    public ExternalGitService() {
        try {
            if (mb) {
                iy.gn(1185208767988179263L, null);
            }
            this.WB = new a(this);
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 1185208767988179263L, null);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    @ey(method = -59331397686004908L)
    public IBinder onBind(Intent intent) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (mb) {
                iy.tp(-1791281596160481703L, this, intent);
            }
            AppLog.VH("ExternalGitService bound - pid " + Process.myPid() + " id " + System.identityHashCode(this));
            FileSystem.P8(this);
            return this.WB;
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -1791281596160481703L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    @ey(method = -78087091549099257L)
    public void onDestroy() {
        try {
            if (mb) {
                iy.gn(-3268004321770460704L, this);
            }
            AppLog.VH("ExternalGitService shutdown - pid " + Process.myPid() + " id " + System.identityHashCode(this));
            this.WB = null;
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -3268004321770460704L, this);
            }
            throw th;
        }
    }
}
