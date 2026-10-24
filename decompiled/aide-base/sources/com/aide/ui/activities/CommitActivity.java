package com.aide.ui.activities;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import abcd.nd;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.aide.common.AndroidHelper;
import com.aide.common.MessageBox;
import com.aide.engine.FileHighlightings;
import com.aide.ui.AppFileIcons;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.ThemedActionbarActivity;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.q;
import com.aide.ui.r;
import com.aide.ui.s;
import com.aide.ui.scm.DiffView;
import com.aide.ui.scm.GitService;
import com.aide.ui.scm.GitStatus;
import com.aide.ui.scm.ModifiedFile;
import com.aide.ui.scm.ModifiedFileListEntry;
import com.aide.ui.services.OpenFileService;
import com.aide.ui.util.FileSystem;
import com.aide.ui.views.CodeEditTextScrollView;
import com.aide.ui.views.SplitView;
import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = -48774866763899575L, container = -48774866763899575L, user = true)
/* loaded from: classes.dex */
public class CommitActivity extends ThemedActionbarActivity implements OpenFileService.FileHighlightingsCallback {

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = 2200025663354098413L)
    private g AL;

    @dy(field = -4573602223556083713L)
    private BitSet fY;

    @dy(field = -110267484240190671L)
    private int jw;

    @dy(field = 3908301051900349051L)
    private Map<ModifiedFile, String> k2;

    @dy(field = 1860140884001339537L)
    private List<ModifiedFile> qp;

    @dy(field = 896409499289029603L)
    private String zh;

    @cy(clazz = -801280346436386600L, container = -48774866763899575L, user = true)
    class a implements AdapterView.OnItemClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 699447985686966087L)
        final /* synthetic */ ListView WB;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -6695261169581093785L)
        a(ListView listView) {
            this.WB = listView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        @ey(method = -573325990732142529L)
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (jw) {
                    iy.J0(553431604816403000L, this, adapterView, view, new Integer(i), new Long(j));
                }
                this.WB.requestFocus();
                CommitActivity.this.lg(i);
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 553431604816403000L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -801339419722986243L, container = -48774866763899575L, user = true)
    class b implements AdapterView.OnItemLongClickListener {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -4490785868572273956L)
        final /* synthetic */ ListView j6;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 2126040915678642380L)
        b(ListView listView) {
            this.j6 = listView;
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        @ey(method = -1608362703901782144L)
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            try {
                if (FH) {
                    iy.J0(-6164577527024316400L, this, adapterView, view, new Integer(i), new Long(j));
                }
                this.j6.requestFocus();
                ((ModifiedFileListEntry) view).j6();
                return true;
            } catch (Throwable th) {
                if (Hw) {
                    iy.a8(th, -6164577527024316400L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -801398493005522592L, container = -48774866763899575L, user = true)
    class c implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 3359958465570656425L)
        c() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1942978894716460704L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(1333135463998313052L, this);
                }
                List<ModifiedFile> listU2 = CommitActivity.this.U2();
                ServiceContainer.QX().BT(CommitActivity.this.zh, listU2, new f(CommitActivity.this, listU2));
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, 1333135463998313052L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -801457566283995647L, container = -48774866763899575L, user = true)
    class d implements GitService.w<String> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 5516127374396029860L)
        final /* synthetic */ ModifiedFile j6;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -6642510891406922391L)
        d(ModifiedFile modifiedFile) {
            this.j6 = modifiedFile;
        }

        @Override // com.aide.ui.scm.GitService.w
        @ey(method = 4799847964395745792L)
        public void DW() {
            try {
                if (FH) {
                    iy.gn(-148626966875294925L, this);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -148626966875294925L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.GitService.w
        @ey(method = -3351651071298587013L)
        public void FH() {
            try {
                if (FH) {
                    iy.gn(1814337969685179840L, this);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1814337969685179840L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.GitService.w
        @ey(method = -3268419513449518575L)
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void j6(String str) {
            try {
                if (FH) {
                    iy.tp(-6244482186456604032L, this, str);
                }
                CommitActivity.this.k2.put(this.j6, str);
                ModifiedFile modifiedFileXL = CommitActivity.this.XL();
                if (modifiedFileXL == null || modifiedFileXL != this.j6) {
                    return;
                }
                DiffView diffViewAM = CommitActivity.this.aM();
                if (!FileSystem.ei(str)) {
                    diffViewAM.et(str, this.j6.WB, this.j6.WB);
                    return;
                }
                if (!this.j6.VH() && !this.j6.v5()) {
                    diffViewAM.setInformationalContent("Binary files differ");
                    return;
                }
                diffViewAM.setInformationalContent("Removed binary file");
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, -6244482186456604032L, this, str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -801516639558405408L, container = -48774866763899575L, user = true)
    class e implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2968676065150230249L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -3852721186200555352L)
        e(String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = -135524352138250563L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(2166483602519889565L, this);
                }
                List<ModifiedFile> listU2 = CommitActivity.this.U2();
                ServiceContainer.QX().yS(CommitActivity.this.zh, listU2, this.WB, new f(CommitActivity.this, listU2));
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 2166483602519889565L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1252510624615490640L, container = -1252510624615490640L, user = true)
    private class f implements GitService.v {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1123253869879430496L)
        @hy
        final /* synthetic */ CommitActivity DW;

        @dy(field = 232694712276091440L)
        private List<ModifiedFile> j6;

        static {
            iy.Zo(f.class);
        }

        @ey(method = 4785286223013924837L)
        public f(CommitActivity commitActivity, List<ModifiedFile> list) {
            try {
                if (FH) {
                    iy.EQ(-3475036826855383127L, null, commitActivity, list);
                }
                this.DW = commitActivity;
                this.j6 = list;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -3475036826855383127L, null, commitActivity, list);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.GitService.w
        @ey(method = 3428729857066074000L)
        public void DW() {
            try {
                if (FH) {
                    iy.gn(1856368176842195397L, this);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, 1856368176842195397L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.GitService.w
        @ey(method = 3695286855610061117L)
        public void FH() {
            try {
                if (FH) {
                    iy.gn(-6739926192803213168L, this);
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.aM(th, -6739926192803213168L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.scm.GitService.w
        @ey(method = 1172470380798674992L)
        /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
        public void j6(Void r8) {
            try {
                if (FH) {
                    iy.tp(203290584117318357L, this, r8);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator<ModifiedFile> it = this.j6.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().WB);
                }
                for (ModifiedFile modifiedFile : this.DW.qp) {
                    if (!hashSet.contains(modifiedFile.WB)) {
                        arrayList.add(modifiedFile);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.DW.finish();
                } else {
                    this.DW.qp = arrayList;
                    this.DW.a8();
                }
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 203290584117318357L, this, r8);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -101481753451122000L, container = -101481753451122000L, user = true)
    private class g extends ArrayAdapter<ModifiedFile> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 2495732801870467424L)
        @hy
        final /* synthetic */ CommitActivity j6;

        @cy(clazz = -2184792901713797283L, container = -101481753451122000L, user = true)
        class a implements CompoundButton.OnCheckedChangeListener {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = -3981722698921806285L)
            final /* synthetic */ int j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 2670875303426445893L)
            a(int i) {
                this.j6 = i;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            @ey(method = -3259309804493606425L)
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                try {
                    if (FH) {
                        iy.EQ(1811205192841172300L, this, compoundButton, new Boolean(z));
                    }
                    g.this.j6.fY.set(this.j6, z);
                } catch (Throwable th) {
                    if (Hw) {
                        iy.Mr(th, 1811205192841172300L, this, compoundButton, new Boolean(z));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(g.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 4014173672748299424L)
        public g(CommitActivity commitActivity, Context context, List<ModifiedFile> list) {
            super(context, r.commitbrowser_modifiedfile_entry, list);
            try {
                if (DW) {
                    iy.we(3303678785540339440L, null, commitActivity, context, list);
                }
                this.j6 = commitActivity;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, 3303678785540339440L, null, commitActivity, context, list);
                }
                throw th;
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        @ey(method = -1902762099796157136L)
        public int getItemViewType(int i) {
            try {
                if (!DW) {
                    return -1;
                }
                iy.u7(-3177169133445017557L, this, i);
                return -1;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -3177169133445017557L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @ey(method = 429360526179701497L)
        public View getView(int i, View view, ViewGroup viewGroup) {
            try {
                if (DW) {
                    iy.we(-304633343366157672L, this, new Integer(i), view, viewGroup);
                }
                if (((ModifiedFileListEntry) view) != null) {
                    throw new IllegalStateException();
                }
                ModifiedFileListEntry modifiedFileListEntry = (ModifiedFileListEntry) LayoutInflater.from(getContext()).inflate(r.commitbrowser_modifiedfile_entry, viewGroup, false);
                modifiedFileListEntry.setOnCheckedChangeListener(new a(i));
                modifiedFileListEntry.setChecked(this.j6.fY.get(i));
                modifiedFileListEntry.setSelectedForDiff(i == this.j6.jw);
                ModifiedFile item = getItem(i);
                ImageView imageView = (ImageView) modifiedFileListEntry.findViewById(q.modifiedFileImage);
                if (item.FH() || item.Zo()) {
                    imageView.setImageResource(R$drawable.file_modfieid);
                } else if (item.DW() || item.gn()) {
                    imageView.setImageResource(R$drawable.file_new);
                } else if (item.VH() || item.v5()) {
                    imageView.setImageResource(R$drawable.file_removed);
                } else if (item.Hw()) {
                    imageView.setImageResource(R$drawable.file_conflict);
                }
                ((TextView) modifiedFileListEntry.findViewById(q.modifiedFileName)).setText(new File(item.WB).getName() + " (" + item.j6() + ")");
                return modifiedFileListEntry;
            } catch (Throwable th) {
                if (FH) {
                    iy.U2(th, -304633343366157672L, this, new Integer(i), view, viewGroup);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(CommitActivity.class);
    }

    @ey(method = 3162950697057141765L)
    public CommitActivity() {
        try {
            if (w9) {
                iy.gn(1344877463565618520L, null);
            }
            this.k2 = new HashMap();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 1344877463565618520L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5546979520683605221L)
    public List<ModifiedFile> U2() {
        try {
            if (w9) {
                iy.gn(-992170330850370672L, this);
            }
            ArrayList arrayList = new ArrayList();
            ListView listViewJ3 = j3();
            for (int i = 0; i < listViewJ3.getCount(); i++) {
                if (this.fY.get(i)) {
                    arrayList.add((ModifiedFile) listViewJ3.getItemAtPosition(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -992170330850370672L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 4641848345532975639L)
    public ModifiedFile XL() {
        try {
            if (w9) {
                iy.gn(2481139892125095204L, this);
            }
            if (this.jw < 0) {
                return null;
            }
            return (ModifiedFile) j3().getItemAtPosition(this.jw);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2481139892125095204L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4360025328490278369L)
    public void a8() {
        try {
            if (w9) {
                iy.gn(2162376948136733328L, this);
            }
            ListView listViewJ3 = j3();
            g gVar = new g(this, this, this.qp);
            this.AL = gVar;
            this.jw = -1;
            listViewJ3.setAdapter((ListAdapter) gVar);
            BitSet bitSet = new BitSet();
            this.fY = bitSet;
            bitSet.set(0, this.qp.size());
            lg(0);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2162376948136733328L, this);
            }
            throw th;
        }
    }

    @ey(method = -781535969160181209L)
    private void er(ModifiedFile modifiedFile) {
        try {
            if (w9) {
                iy.tp(-304809964004122200L, this, modifiedFile);
            }
            DiffView diffViewAM = aM();
            diffViewAM.jJ();
            if (!modifiedFile.v5() && !modifiedFile.VH() && FileSystem.ei(modifiedFile.WB)) {
                if (!modifiedFile.DW() && !modifiedFile.gn()) {
                    diffViewAM.setInformationalContent("Binary files differ");
                    return;
                }
                diffViewAM.setInformationalContent("New binary file");
                return;
            }
            if (!modifiedFile.DW() && !modifiedFile.gn()) {
                if (!this.k2.containsKey(modifiedFile)) {
                    diffViewAM.CU();
                    ServiceContainer.QX().nw(modifiedFile.WB, new d(modifiedFile));
                    return;
                } else {
                    if (!FileSystem.ei(this.k2.get(modifiedFile))) {
                        diffViewAM.et(this.k2.get(modifiedFile), modifiedFile.WB, modifiedFile.WB);
                        return;
                    }
                    if (!modifiedFile.VH() && !modifiedFile.v5()) {
                        diffViewAM.setInformationalContent("Modified binary file");
                        return;
                    }
                    diffViewAM.setInformationalContent("Removed binary file");
                    return;
                }
            }
            diffViewAM.et(null, modifiedFile.WB, modifiedFile.WB);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -304809964004122200L, this, modifiedFile);
            }
            throw th;
        }
    }

    @ey(method = -2682489893020576736L)
    private ListView j3() {
        try {
            if (w9) {
                iy.gn(-2113281990456422175L, this);
            }
            return (ListView) findViewById(q.modifiedFilesList);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -2113281990456422175L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2487064588927000425L)
    public void lg(int i) {
        try {
            if (w9) {
                iy.u7(1296764622072073508L, this, i);
            }
            ListView listViewJ3 = j3();
            this.jw = i;
            this.AL.notifyDataSetChanged();
            ModifiedFile modifiedFile = (ModifiedFile) listViewJ3.getItemAtPosition(i);
            er(modifiedFile);
            Mr().scrollTo(0, 0);
            View headerView = Mr().getHeaderView();
            ((TextView) headerView.findViewById(q.commitHeaderFileName)).setText(FileSystem.getName(modifiedFile.WB));
            ((TextView) headerView.findViewById(q.commitHeaderDirectoryName)).setText(FileSystem.getParent(modifiedFile.WB));
            ((ImageView) headerView.findViewById(q.commitHeaderFileIcon)).setImageResource(AppFileIcons.j6(modifiedFile.WB));
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 1296764622072073508L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -399707056122584292L)
    public static void rN(Activity activity, GitStatus gitStatus, String str) {
        try {
            if (w9) {
                iy.we(-1274326430554226181L, null, activity, gitStatus, str);
            }
            Intent intent = new Intent(activity, (Class<?>) CommitActivity.class);
            intent.putExtra("GITSTATUS", gitStatus);
            intent.putExtra("GITBRANCH", str);
            v5(activity, intent);
        } catch (Throwable th) {
            if (hK) {
                iy.U2(th, -1274326430554226181L, null, activity, gitStatus, str);
            }
            throw th;
        }
    }

    private static /* synthetic */ void v5(Object obj, Intent intent) {
        ((Activity) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = -3878273015539987105L)
    public CodeEditTextScrollView Mr() {
        try {
            if (w9) {
                iy.gn(-2266889942350166848L, this);
            }
            return (CodeEditTextScrollView) findViewById(q.commitDifferencesScrollView);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -2266889942350166848L, this);
            }
            throw th;
        }
    }

    @ey(method = -683257241680545247L)
    public void QX(String str) {
        try {
            if (w9) {
                iy.tp(-793173584264308136L, this, str);
            }
            ServiceContainer.aj(new e(str));
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -793173584264308136L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2890500387440556009L)
    public DiffView aM() {
        try {
            if (w9) {
                iy.gn(2802579302195771616L, this);
            }
            return (DiffView) findViewById(q.commitDiffView);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 2802579302195771616L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.OpenFileService.FileHighlightingsCallback
    @ey(method = 1633522703756426560L)
    public void accept(FileHighlightings fileHighlightings) {
        try {
            if (w9) {
                iy.tp(2511446171184497259L, this, fileHighlightings);
            }
            aM().Xa(fileHighlightings);
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 2511446171184497259L, this, fileHighlightings);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -1338867733697592056L)
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (w9) {
                iy.we(1524858660306079687L, this, new Integer(i), new Integer(i2), intent);
            }
            iy.v5(this, i, i2, intent);
            if (i == 1194684) {
                ServiceContainer.XL().g3(intent);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.U2(th, 1524858660306079687L, this, new Integer(i), new Integer(i2), intent);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.ThemedActionbarActivity, android.app.Activity
    @ey(method = -1080814916814235612L)
    protected void onCreate(Bundle bundle) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (w9) {
                iy.tp(-422406117937911731L, this, bundle);
            }
            super.onCreate(bundle);
            setContentView(r.commitbrowser);
            AndroidHelper.KD(findViewById(q.commitFrame));
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                String stringExtra = getIntent().getStringExtra("GITBRANCH");
                if (stringExtra.startsWith("refs/heads/")) {
                    stringExtra = stringExtra.substring(11);
                } else if (stringExtra.startsWith("refs/")) {
                    stringExtra = stringExtra.substring(5);
                }
                actionBar.setSubtitle("Branch '" + stringExtra + "'");
            }
            SplitView splitView = (SplitView) findViewById(q.commitSplitView);
            splitView.openSplit(splitView.splitHorizontalByDefault(), false);
            splitView.setSwipeEnabled(true);
            GitStatus gitStatus = (GitStatus) getIntent().getExtras().getParcelable("GITSTATUS");
            this.zh = gitStatus.WB;
            ListView listViewJ3 = j3();
            listViewJ3.setChoiceMode(1);
            listViewJ3.setOnItemClickListener(new a(listViewJ3));
            listViewJ3.setOnItemLongClickListener(new b(listViewJ3));
            ServiceContainer.getOpenFileService().FH(this);
            this.qp = gitStatus.mb;
            a8();
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -422406117937911731L, this, bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 5107533303540126515L)
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        try {
            if (w9) {
                iy.EQ(1022199586962951852L, this, new Integer(i), bundle);
            }
            return MessageBox.Zo(this, i);
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, 1022199586962951852L, this, new Integer(i), bundle);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -7060635483791566080L)
    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (w9) {
                iy.tp(-3198675749903694651L, this, menu);
            }
            getMenuInflater().inflate(s.commit_options_menu, menu);
            return true;
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -3198675749903694651L, this, menu);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 2711118586902023440L)
    protected void onDestroy() {
        try {
            if (w9) {
                iy.gn(-2677466469117353517L, this);
            }
            super.onDestroy();
            ServiceContainer.getOpenFileService().SI(this);
            Iterator<String> it = this.k2.values().iterator();
            while (it.hasNext()) {
                new File(it.next()).delete();
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -2677466469117353517L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -316362849116689221L)
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (w9) {
                iy.tp(1788518605786105744L, this, menuItem);
            }
            switch (menuItem.getItemId()) {
                case q.commitMenuCommit /* 2131230753 */:
                    if (ServiceContainer.getLicenseService().VH(ServiceContainer.gn(), "git_commit")) {
                        MessageBox.gW(this, new nd());
                    }
                    return true;
                case q.commitMenuDiscard /* 2131230754 */:
                    MessageBox.rN(this, "Git discard", "Really discard the selected changes?", new c(), null);
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, 1788518605786105744L, this, menuItem);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -2642198037502627512L)
    protected void onPause() {
        try {
            if (w9) {
                iy.gn(-33752200746373725L, this);
            }
            super.onPause();
            ServiceContainer.Qq(this);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -33752200746373725L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -741081188029750209L)
    protected void onResume() {
        try {
            if (w9) {
                iy.gn(1783445337206150100L, this);
            }
            super.onResume();
            ServiceContainer.x9(this);
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 1783445337206150100L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = -2476503859650274536L)
    protected void onStart() {
        try {
            if (w9) {
                iy.gn(112583673103187055L, this);
            }
            super.onStart();
            FireBaseLogEvent.XL(this, "Commit");
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 112583673103187055L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    @ey(method = 350423884828505712L)
    protected void onStop() {
        try {
            if (w9) {
                iy.gn(-1986428507550199485L, this);
            }
            super.onStop();
            FireBaseLogEvent.DW(this, "Commit");
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, -1986428507550199485L, this);
            }
            throw th;
        }
    }
}
