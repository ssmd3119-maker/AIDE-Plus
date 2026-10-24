package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.i2;
import abcd.iy;
import abcd.l1;
import abcd.m1;
import abcd.q2;
import abcd.s1;
import abcd.x2;
import abcd.y2;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Language;
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
import java.util.Iterator;
import java.util.List;

@cy(clazz = -787857324667714113L, container = -787857324667714113L, user = true)
/* loaded from: classes.dex */
public class Model {

    @gy
    private static /* synthetic */ boolean BT;

    @fy
    private static /* synthetic */ boolean gW;

    @dy(field = -297157345615727183L)
    private static int modelCount;

    @dy(field = 2278057609320939555L)
    public final q2 J8;

    @dy(field = 1399292846624697472L)
    public final i2 U2;

    @dy(field = -6489986180207368587L)
    public final s1 a8;

    @dy(field = 508644305467066525L)
    public final APISearcherCallback apiSearcherCallback;

    @dy(field = -3067487676089516493L)
    public final CodeCompleterCallback codeCompleterCallback;

    @dy(field = -2637505586273418511L)
    public final CodeMetricsCallback codeMetricsCallback;

    @dy(field = 925983138669546353L)
    public final DebugMetadataCallback debugMetadataCallback;

    @dy(field = 2358784863675969375L)
    public final EntitySpace entitySpace;

    @dy(field = -1232961108275137535L)
    private boolean[] er;

    @dy(field = -871232467544494295L)
    public final ErrorTable errorTable;

    @dy(field = -127068211375846125L)
    public final FileSpace fileSpace;

    @dy(field = 478934850841432559L)
    public final HighlighterCallback highlighterCallback;

    @dy(field = -3030371416500640275L)
    public final IdentifierSpace identifierSpace;

    @dy(field = 1364187937448080224L)
    public final m1 j3;

    @dy(field = 3084248353682701040L)
    private l1 lg;

    @dy(field = 3431506092116793656L)
    public final OpenFileCallback openFileCallback;

    @dy(field = 2405580724168838096L)
    private String[] rN;

    @dy(field = 934721403656943760L)
    public final RefactoringCallback refactoringCallback;

    @dy(field = 3549539265012139152L)
    public final StopCallback stopCallback;

    @dy(field = 506075858375509311L)
    public final StructureCallback structureCallback;

    @dy(field = 1351398987618136580L)
    public final SymbolSearcherCallback symbolSearcherCallback;

    @dy(field = 2409256838718354012L)
    public final SyntaxTreeSpace syntaxTreeSpace;

    @dy(field = -4075334873878460544L)
    public final TemplateEvaluatorCallback templateEvaluatorCallback;

    @dy(field = 5182978336112811972L)
    public final y2 tp;

    @dy(field = -8475768342431271280L)
    public final UsageSearcherCallback usageSearcherCallback;

    static {
        try {
            iy.Zo(Model.class);
            if (gW) {
                iy.gn(237003205571965700L, null);
            }
            modelCount = 0;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 237003205571965700L, null);
            }
            throw th;
        }
    }

    @ey(method = -3184805400722893539L)
    public Model(StructureCallback structureCallback, HighlighterCallback highlighterCallback, SymbolSearcherCallback symbolSearcherCallback, CodeCompleterCallback codeCompleterCallback, RefactoringCallback refactoringCallback, UsageSearcherCallback usageSearcherCallback, CodeMetricsCallback codeMetricsCallback, APISearcherCallback aPISearcherCallback, DebugMetadataCallback debugMetadataCallback, StopCallback stopCallback, OpenFileCallback openFileCallback, TemplateEvaluatorCallback templateEvaluatorCallback, y2 y2Var, q2 q2Var, x2 x2Var, BomReaderFactory bomReaderFactory) {
        if (gW) {
            iy.QX(1815058150851763580L, null, new Object[]{structureCallback, highlighterCallback, symbolSearcherCallback, codeCompleterCallback, refactoringCallback, usageSearcherCallback, codeMetricsCallback, aPISearcherCallback, debugMetadataCallback, stopCallback, openFileCallback, templateEvaluatorCallback, y2Var, q2Var, x2Var, bomReaderFactory});
        }
        this.structureCallback = structureCallback;
        this.highlighterCallback = highlighterCallback;
        this.symbolSearcherCallback = symbolSearcherCallback;
        this.codeCompleterCallback = codeCompleterCallback;
        this.refactoringCallback = refactoringCallback;
        this.usageSearcherCallback = usageSearcherCallback;
        this.codeMetricsCallback = codeMetricsCallback;
        this.apiSearcherCallback = aPISearcherCallback;
        this.debugMetadataCallback = debugMetadataCallback;
        this.stopCallback = stopCallback;
        this.openFileCallback = openFileCallback;
        this.templateEvaluatorCallback = templateEvaluatorCallback;
        this.tp = y2Var;
        this.J8 = q2Var;
        modelCount++;
        this.identifierSpace = new IdentifierSpace();
        this.fileSpace = new FileSpace(this.identifierSpace, openFileCallback, stopCallback, bomReaderFactory);
        this.syntaxTreeSpace = new SyntaxTreeSpace(this);
        this.U2 = new i2();
        this.entitySpace = new EntitySpace(this.identifierSpace, this.fileSpace, this.syntaxTreeSpace, stopCallback);
        this.errorTable = new ErrorTable(this);
        this.j3 = new m1(this);
        this.a8 = new s1(this);
    }

    @ey(method = -152150573700677969L)
    public void DW(boolean z) {
        try {
            if (gW) {
                iy.Ws(7839533577462325173L, this, z);
            }
            this.fileSpace.update(z);
            if (this.stopCallback.hz()) {
                return;
            }
            this.syntaxTreeSpace.rN();
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 7839533577462325173L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2112481451888046235L)
    public void EQ(int i, int i2) {
        try {
            if (gW) {
                iy.EQ(156826960381140849L, this, new Integer(i), new Integer(i2));
            }
            this.fileSpace.u7(i, i2);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, 156826960381140849L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -104503266126316552L)
    public void FH(boolean z) {
        try {
            if (gW) {
                iy.Ws(8709988134405467200L, this, z);
            }
            this.entitySpace.update();
            if (this.stopCallback.hz()) {
                return;
            }
            this.entitySpace.QO();
            if (this.stopCallback.hz()) {
                return;
            }
            this.j3.g3();
            this.a8.gW();
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 8709988134405467200L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1133863808004169128L)
    public void Hw() {
        try {
            if (gW) {
                iy.gn(140549261344165952L, this);
            }
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 140549261344165952L, this);
            }
            throw th;
        }
    }

    @ey(method = -6819099348098825865L)
    public void J0() {
        try {
            if (gW) {
                iy.gn(-1887691084329117839L, this);
            }
            this.fileSpace.configure();
            this.entitySpace.kf();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -1887691084329117839L, this);
            }
            throw th;
        }
    }

    @ey(method = -999582030702460440L)
    public void J8() {
        try {
            if (gW) {
                iy.gn(1774768161856496128L, this);
            }
            this.syntaxTreeSpace.Mr();
            this.U2.FH();
            this.fileSpace.close();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1774768161856496128L, this);
            }
            throw th;
        }
    }

    @ey(method = -3776055050887955927L)
    public void Mr() {
        try {
            if (gW) {
                iy.gn(3776008435935614799L, this);
            }
            this.entitySpace.invalidateAll();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3776008435935614799L, this);
            }
            throw th;
        }
    }

    @ey(method = -1331826716585705805L)
    public void U2(l1 l1Var, String[] strArr, boolean[] zArr) {
        try {
            if (gW) {
                iy.we(-651754720024320627L, this, l1Var, strArr, zArr);
            }
            this.lg = l1Var;
            this.rN = strArr;
            this.er = zArr;
        } catch (Throwable th) {
            if (BT) {
                iy.U2(th, -651754720024320627L, this, l1Var, strArr, zArr);
            }
            throw th;
        }
    }

    @ey(method = 202873364517677413L)
    public void VH(String str) {
        try {
            if (gW) {
                iy.tp(-5737771849868104725L, this, str);
            }
            this.fileSpace.v5(str);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -5737771849868104725L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1890366122203298669L)
    public l1 Ws() {
        try {
            if (gW) {
                iy.gn(3420824051349040903L, this);
            }
            return this.lg;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3420824051349040903L, this);
            }
            throw th;
        }
    }

    @ey(method = 4806580230355370364L)
    public boolean[] XL() {
        try {
            if (gW) {
                iy.gn(3895051370148098960L, this);
            }
            return this.er;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 3895051370148098960L, this);
            }
            throw th;
        }
    }

    @ey(method = -5510653467034480400L)
    public void Zo(CodeModel codeModel, List<String> list) {
        try {
            if (gW) {
                iy.EQ(690225804178315152L, this, codeModel, list);
            }
            this.fileSpace.configureCodeModelFilePatterns(codeModel, list);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, 690225804178315152L, this, codeModel, list);
            }
            throw th;
        }
    }

    @ey(method = 302354938931103240L)
    public void a8(boolean z) {
        try {
            if (gW) {
                iy.Ws(-3652523988958257952L, this, z);
            }
            this.syntaxTreeSpace.a8();
            this.entitySpace.a5();
            if (z) {
                this.U2.createSyntaxTreeStylesList();
                for (CodeModel codeModel : this.fileSpace.getCodeModels()) {
                    codeModel.update();
                    Iterator<Language> it = codeModel.getLanguages().iterator();
                    while (it.hasNext()) {
                        it.next().shrink();
                    }
                }
                this.a8.a8();
            }
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -3652523988958257952L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2390739826820528785L)
    public String[] aM() {
        try {
            if (gW) {
                iy.gn(-2018689583198889719L, this);
            }
            return this.rN;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2018689583198889719L, this);
            }
            throw th;
        }
    }

    @ey(method = -3291956921872520560L)
    public void finalize() {
        try {
            if (gW) {
                iy.gn(-2792552407929697520L, this);
            }
            modelCount--;
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, -2792552407929697520L, this);
            }
            throw th;
        }
    }

    @ey(method = -3145090007008306125L)
    public CodeModel[] getCodeModels() {
        try {
            if (gW) {
                iy.gn(2058530673972959425L, this);
            }
            return this.fileSpace.getCodeModels();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 2058530673972959425L, this);
            }
            throw th;
        }
    }

    @ey(method = 54776476174519152L)
    public void gn(FileEntry fileEntry, int i, CodeModel codeModel, boolean z) {
        try {
            if (gW) {
                iy.J0(-3490074369668191140L, this, fileEntry, new Integer(i), codeModel, new Boolean(z));
            }
            this.fileSpace.Zo(fileEntry, i, codeModel, z);
        } catch (Throwable th) {
            if (BT) {
                iy.a8(th, -3490074369668191140L, this, fileEntry, new Integer(i), codeModel, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1126158519061204605L)
    public void j6(ErrorTable.Fix fix) {
        try {
            if (gW) {
                iy.tp(173146863858714385L, this, fix);
            }
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 173146863858714385L, this, fix);
            }
            throw th;
        }
    }

    @ey(method = -3355079578344816465L)
    public void lg() {
        try {
            if (gW) {
                iy.gn(1219994492508685245L, this);
            }
            this.entitySpace.IS();
        } catch (Throwable th) {
            if (BT) {
                iy.aM(th, 1219994492508685245L, this);
            }
            throw th;
        }
    }

    @ey(method = 5737125262547365248L)
    public void load(StoreInputStream storeInputStream) {
        try {
            if (gW) {
                iy.tp(-6809010327389246760L, this, storeInputStream);
            }
            this.fileSpace.loadEntries(storeInputStream);
            this.entitySpace.loadEntries(storeInputStream);
            this.identifierSpace.load(storeInputStream);
            this.fileSpace.load(storeInputStream);
            this.entitySpace.load(storeInputStream);
            this.errorTable.load(storeInputStream);
            this.j3.load(storeInputStream);
            this.a8.load(storeInputStream);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -6809010327389246760L, this, storeInputStream);
            }
            throw th;
        }
    }

    @ey(method = 8444089411569894456L)
    public void store(StoreOutputStream storeOutputStream) {
        try {
            if (gW) {
                iy.tp(-1212167359429543260L, this, storeOutputStream);
            }
            this.fileSpace.storeEntries(storeOutputStream);
            this.entitySpace.BR(storeOutputStream);
            this.identifierSpace.store(storeOutputStream);
            this.fileSpace.store(storeOutputStream);
            this.entitySpace.Nh(storeOutputStream);
            this.errorTable.store(storeOutputStream);
            this.j3.store(storeOutputStream);
            this.a8.store(storeOutputStream);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, -1212167359429543260L, this, storeOutputStream);
            }
            throw th;
        }
    }

    @ey(method = 1463745099766294125L)
    public void tp(CodeModel[] codeModelArr) {
        try {
            if (gW) {
                iy.tp(389027141930299275L, this, codeModelArr);
            }
            this.fileSpace.configureCodeModels(codeModelArr);
        } catch (Throwable th) {
            if (BT) {
                iy.j3(th, 389027141930299275L, this, codeModelArr);
            }
            throw th;
        }
    }

    @ey(method = -4386212683662165160L)
    public void u7(FileEntry fileEntry, CodeModel codeModel) {
        try {
            if (gW) {
                iy.EQ(-969471045406294644L, this, fileEntry, codeModel);
            }
            this.fileSpace.VH(fileEntry, codeModel);
        } catch (Throwable th) {
            if (BT) {
                iy.Mr(th, -969471045406294644L, this, fileEntry, codeModel);
            }
            throw th;
        }
    }

    @ey(method = -3386702777635319745L)
    public void v5(int i, String str, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, List<String> list3, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4) throws Throwable {
        int i2;
        try {
            if (gW) {
                iy.QX(756837817182860721L, this, new Object[]{new Integer(i), str, str2, str3, str4, str5, list, list2, list3, str6, str7, str8, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            }
            i2 = 16;
            try {
                this.fileSpace.FH(i, str, str2, str3, str4, str5, list, list2, list3, str6, str7, str8, z, z2, z3, z4);
            } catch (Throwable th) {
                th = th;
                if (BT) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = new Integer(i);
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = str4;
                    objArr[5] = str5;
                    objArr[6] = list;
                    objArr[7] = list2;
                    objArr[8] = list3;
                    objArr[9] = str6;
                    objArr[10] = str7;
                    objArr[11] = str8;
                    objArr[12] = new Boolean(z);
                    objArr[13] = new Boolean(z2);
                    objArr[14] = new Boolean(z3);
                    objArr[15] = new Boolean(z4);
                    iy.rN(th, 756837817182860721L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 16;
        }
    }

    @ey(method = -185538657795423200L)
    public void we(FileEntry fileEntry, int i, String str) {
        try {
            if (gW) {
                iy.we(-2573524592151979680L, this, fileEntry, new Integer(i), str);
            }
            this.fileSpace.tp(fileEntry, i, str);
        } catch (Throwable th) {
            if (BT) {
                iy.U2(th, -2573524592151979680L, this, fileEntry, new Integer(i), str);
            }
            throw th;
        }
    }
}
