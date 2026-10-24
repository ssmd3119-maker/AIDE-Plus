package com.aide.codemodel;

import abcd.cy;
import abcd.d0;
import abcd.dy;
import abcd.e0;
import abcd.ey;
import abcd.f0;
import abcd.fy;
import abcd.g0;
import abcd.gy;
import abcd.h0;
import abcd.i0;
import abcd.iy;
import abcd.j0;
import abcd.k0;
import abcd.l0;
import abcd.m0;
import abcd.n0;
import abcd.o0;
import abcd.p0;
import abcd.q0;
import abcd.q2;
import abcd.r0;
import abcd.s0;
import abcd.t0;
import abcd.u0;
import abcd.w0;
import abcd.x2;
import abcd.y2;
import com.aide.codemodel.api.BomReaderFactory;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.callback.APISearcherCallback;
import com.aide.codemodel.api.callback.CodeCompleterCallback;
import com.aide.codemodel.api.callback.CodeMetricsCallback;
import com.aide.codemodel.api.callback.DebugMetadataCallback;
import com.aide.codemodel.api.callback.HighlighterCallback;
import com.aide.codemodel.api.callback.OpenFileCallback;
import com.aide.codemodel.api.callback.RefactoringCallback;
import com.aide.codemodel.api.callback.StopCallback;
import com.aide.codemodel.api.callback.StructureCallback;
import com.aide.codemodel.api.callback.SymbolSearcherCallback;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.callback.UsageSearcherCallback;
import com.aide.codemodel.api.collections.StoreInputStream;
import com.aide.codemodel.api.collections.StoreOutputStream;
import com.probelytics.api.UserTouchAction;
import java.io.IOException;
import java.util.Hashtable;

@cy(clazz = 2279591916065987725L, container = 2279591916065987725L, user = true)
/* loaded from: classes.dex */
public class AIDEModel extends Model {

    @gy
    private static /* synthetic */ boolean Qq;

    @fy
    private static /* synthetic */ boolean x9;

    @dy(field = -3738623174474533684L)
    public final u0 I;

    @dy(field = 2002054922203194160L)
    public final w0 KD;

    @dy(field = -2103181603432428432L)
    public final s0 Mz;

    @dy(field = -261945181015493552L)
    public final f0 P8;

    @dy(field = -3039996474215004360L)
    public final i0 SI;

    @dy(field = -1974038907071992773L)
    public final h0 Sf;

    @dy(field = -1972951754647675725L)
    public final n0 ca;

    @dy(field = -1968220727163328767L)
    public final m0 cb;

    @dy(field = -4800507231993649427L)
    public final d0 cn;

    @dy(field = 976456678424548209L)
    public final l0 dx;

    @dy(field = 4888844928041436012L)
    public final j0 ef;

    @dy(field = 5660536101649447949L)
    public final r0 ei;

    @dy(field = 1191955640810761628L)
    public final g0 g3;

    @dy(field = -4795572490875058332L)
    public final q0 nw;

    @dy(field = -394079065369730279L)
    public final e0 ro;

    @dy(field = 1014321540655252480L)
    public final p0 sG;

    @dy(field = -504512118090840832L)
    public final o0 sh;

    @dy(field = 99027766062293328L)
    public final t0 vJ;

    @dy(field = -2136444450970538748L)
    public final k0 vy;

    static {
        iy.Zo(AIDEModel.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 3311077794997201460L)
    public AIDEModel(OpenFileCallback openFileCallback, StopCallback stopCallback, StructureCallback structureCallback, HighlighterCallback highlighterCallback, SymbolSearcherCallback symbolSearcherCallback, CodeCompleterCallback codeCompleterCallback, RefactoringCallback refactoringCallback, UsageSearcherCallback usageSearcherCallback, CodeMetricsCallback codeMetricsCallback, APISearcherCallback aPISearcherCallback, DebugMetadataCallback debugMetadataCallback, TemplateEvaluatorCallback templateEvaluatorCallback, y2 y2Var, q2 q2Var, x2 x2Var, BomReaderFactory bomReaderFactory) {
        super(structureCallback, highlighterCallback, symbolSearcherCallback, codeCompleterCallback, refactoringCallback, usageSearcherCallback, codeMetricsCallback, aPISearcherCallback, debugMetadataCallback, stopCallback, openFileCallback, templateEvaluatorCallback, y2Var, q2Var, x2Var, bomReaderFactory);
        if (x9) {
            iy.QX(3863360683362688128L, null, new Object[]{openFileCallback, stopCallback, structureCallback, highlighterCallback, symbolSearcherCallback, codeCompleterCallback, refactoringCallback, usageSearcherCallback, codeMetricsCallback, aPISearcherCallback, debugMetadataCallback, templateEvaluatorCallback, y2Var, q2Var, x2Var, bomReaderFactory});
        }
        this.vy = new k0(this);
        this.P8 = new f0(this);
        this.ei = new r0(this);
        this.nw = new q0(this);
        this.SI = new i0(this);
        this.KD = new w0(this);
        this.ro = new e0(this);
        this.cn = new d0(this);
        this.sh = new o0(this);
        this.cb = new m0(this);
        this.dx = new l0(this);
        this.sG = new p0(this);
        this.ef = new j0(this);
        this.Sf = new h0(this);
        this.vJ = new t0(this);
        this.Mz = new s0(this);
        this.g3 = new g0(this);
        this.I = new u0(this);
        this.ca = new n0(this);
    }

    @ey(method = 42167173407433120L)
    private void er(FileEntry fileEntry, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        int i9;
        try {
            if (x9) {
                iy.QX(5637667256845105171L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            }
            this.refactoringCallback.g3();
            i9 = 9;
        } catch (Throwable th) {
            th = th;
            i9 = 9;
        }
        try {
            this.refactoringCallback.nw(fileEntry, i, i2, i3, i4, "");
            this.refactoringCallback.nw(fileEntry, i5, i6, i7, i8, "");
            this.refactoringCallback.ca();
        } catch (Throwable th2) {
            th = th2;
            if (Qq) {
                Object[] objArr = new Object[i9];
                objArr[0] = fileEntry;
                objArr[1] = new Integer(i);
                objArr[2] = new Integer(i2);
                objArr[3] = new Integer(i3);
                objArr[4] = new Integer(i4);
                objArr[5] = new Integer(i5);
                objArr[6] = new Integer(i6);
                objArr[7] = new Integer(i7);
                objArr[8] = new Integer(i8);
                iy.rN(th, 5637667256845105171L, this, objArr);
            }
            throw th;
        }
    }

    @ey(method = 7915963616176754880L)
    private void yS(FileEntry fileEntry, int i, int i2, int i3, int i4, String str) throws Throwable {
        int i5 = 5;
        try {
            if (x9) {
                iy.QX(-2419398472279382199L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str});
            }
            this.refactoringCallback.g3();
            int i6 = 0;
            for (int i7 = 0; i7 < str.length(); i7++) {
                if (str.charAt(i7) == '\n') {
                    i6++;
                }
            }
            try {
                if (i6 > 0) {
                    i5 = 6;
                    this.refactoringCallback.nw(fileEntry, i, i2, i3, i4, str);
                    this.refactoringCallback.Sf(fileEntry, i, i + i6);
                } else {
                    i5 = 6;
                    this.refactoringCallback.nw(fileEntry, i, i2, i3, i4, str);
                }
                this.refactoringCallback.ca();
            } catch (Throwable th) {
                th = th;
                if (Qq) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = new Integer(i);
                    objArr[2] = new Integer(i2);
                    objArr[3] = new Integer(i3);
                    objArr[4] = new Integer(i4);
                    objArr[5] = str;
                    iy.rN(th, -2419398472279382199L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    @Override // com.aide.codemodel.api.Model
    @ey(method = -286113302555949644L)
    public void DW(boolean z) {
        try {
            if (x9) {
                iy.Ws(-8147823915921646701L, this, z);
            }
            this.openFileCallback.v5();
            super.DW(z);
            if (this.stopCallback.hz()) {
                return;
            }
            this.Sf.Zo();
        } catch (Throwable th) {
            if (Qq) {
                iy.j3(th, -8147823915921646701L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Model
    @ey(method = -236532805802532207L)
    public void FH(boolean z) {
        try {
            if (x9) {
                iy.Ws(-7276263762339462400L, this, z);
            }
            super.FH(z);
            if (this.stopCallback.hz()) {
                return;
            }
            this.P8.yS();
            if (this.stopCallback.hz()) {
                return;
            }
            this.vy.Mr();
        } catch (Throwable th) {
            if (Qq) {
                iy.j3(th, -7276263762339462400L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Model
    @ey(method = -6573193995524749600L)
    public void J0() {
        try {
            if (x9) {
                iy.gn(-654916933165171885L, this);
            }
            super.J0();
            this.P8.U2();
        } catch (Throwable th) {
            if (Qq) {
                iy.aM(th, -654916933165171885L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Model
    @ey(method = 121858541712644793L)
    public void a8(boolean z) {
        try {
            if (x9) {
                iy.Ws(-1910926696224652848L, this, z);
            }
            super.a8(z);
            if (z) {
                this.P8.rN();
            }
        } catch (Throwable th) {
            if (Qq) {
                iy.j3(th, -1910926696224652848L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Model
    @ey(method = -502031125944242648L)
    public void j6(ErrorTable.Fix fix) {
        try {
            if (x9) {
                iy.tp(190734768727981791L, this, fix);
            }
            switch (fix.j6) {
                case 0:
                    yS(fix.Hw, fix.tp, fix.EQ, fix.we, fix.J0, fix.aM);
                    return;
                case 1:
                    this.ca.gn(fix.Hw, fix.tp, fix.EQ);
                    return;
                case 2:
                    this.ef.j6(fix.Hw, (ClassType) fix.FH);
                    return;
                case 3:
                    fix.j3.getTools().a8(fix.Hw, fix.tp, fix.EQ, fix.v5, (Type) fix.FH);
                    return;
                case 4:
                    fix.j3.getTools().sh(fix.Hw, fix.tp, fix.EQ, fix.Zo, fix.v5, (Type) fix.FH);
                    return;
                case 5:
                    fix.j3.getTools().BT(fix.Hw, fix.tp, fix.EQ, fix.Zo, fix.v5, (Type) fix.FH, fix.VH, fix.gn, fix.u7);
                    return;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                default:
                    return;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    er(fix.Hw, fix.tp, fix.EQ, fix.we, fix.J0, fix.J8, fix.Ws, fix.QX, fix.XL);
                    return;
                case 8:
                    this.ca.we(fix.Hw, fix.tp, fix.EQ, fix.tp, fix.EQ);
                    return;
                case 9:
                    fix.j3.getTools().J0(fix.Hw, fix.tp, fix.EQ);
                    return;
                case 10:
                    this.sG.aM(fix.Hw, fix.tp, fix.EQ, fix.v5, (Type) fix.FH);
                    return;
                case 11:
                    this.ef.v5(fix.Hw, new Hashtable<>());
                    return;
            }
        } catch (Throwable th) {
            if (Qq) {
                iy.j3(th, 190734768727981791L, this, fix);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Model
    @ey(method = 4493231418774204701L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (x9) {
                iy.tp(-5188025578806382080L, this, storeInputStream);
            }
            super.load(storeInputStream);
            this.vy.load(storeInputStream);
            this.P8.load(storeInputStream);
            if ("END".equals(storeInputStream.readUTF())) {
            } else {
                throw new IOException("END not found");
            }
        } catch (Throwable th) {
            if (Qq) {
                iy.j3(th, -5188025578806382080L, this, storeInputStream);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.Model
    @ey(method = -958775136637121147L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (x9) {
                iy.tp(2033028285795577816L, this, storeOutputStream);
            }
            super.store(storeOutputStream);
            this.vy.store(storeOutputStream);
            this.P8.store(storeOutputStream);
            storeOutputStream.writeUTF("END");
        } catch (Throwable th) {
            if (Qq) {
                iy.j3(th, 2033028285795577816L, this, storeOutputStream);
            }
            throw th;
        }
    }
}
