package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Handler;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.aide.engine.SyntaxError;
import com.aide.ui.command.MenuCommand;
import com.aide.ui.command.MenuItemCommand;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.util.FileSpan;

@cy(clazz = -583473860859722665L, container = -583473860859722665L, user = true)
/* loaded from: classes.dex */
public class QuickActionMenu {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 995749408906923615L)
    private MainActivity DW;

    @dy(field = 1001059706434660995L)
    private ActionMode FH;

    @dy(field = -970253835911781660L)
    private PopupMenu Hw;

    @dy(field = 2673557389408368568L)
    private int j6;

    @dy(field = 2848292792606770712L)
    private boolean v5;

    @cy(clazz = 459389042936997340L, container = -583473860859722665L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = 3766723754490194757L)
        final /* synthetic */ View WB;

        @cy(clazz = 3900942361871868095L, container = -583473860859722665L, user = true)
        /* renamed from: com.aide.ui.QuickActionMenu$a$a, reason: collision with other inner class name */
        class C0052a implements PopupMenu.OnMenuItemClickListener {

            @fy
            private static /* synthetic */ boolean DW;

            @gy
            private static /* synthetic */ boolean FH;

            static {
                iy.Zo(C0052a.class);
            }

            @ey(method = 181161505323929189L)
            C0052a() {
            }

            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            @ey(method = -5109163836591282028L)
            public boolean onMenuItemClick(MenuItem menuItem) {
                try {
                    if (DW) {
                        iy.tp(3458967589935625768L, this, menuItem);
                    }
                    QuickActionMenu.this.EQ(menuItem);
                    return true;
                } catch (Throwable th) {
                    if (FH) {
                        iy.j3(th, 3458967589935625768L, this, menuItem);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 51448208266139075L)
        a(View view) {
            this.WB = view;
        }

        @Override // java.lang.Runnable
        @ey(method = 1478844908117378931L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-5901700656240745913L, this);
                }
                QuickActionMenu.this.Hw = new PopupMenu(QuickActionMenu.this.DW, this.WB);
                QuickActionMenu.this.Hw.getMenuInflater().inflate(QuickActionMenu.this.j6, QuickActionMenu.this.Hw.getMenu());
                QuickActionMenu.this.J0(QuickActionMenu.this.Hw.getMenu());
                QuickActionMenu.this.Hw.setOnMenuItemClickListener(new C0052a());
                QuickActionMenu.this.Hw.show();
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, -5901700656240745913L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 459400343769608655L, container = -583473860859722665L, user = true)
    class b implements ActionMode.Callback {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 406990594316326149L)
        b() {
        }

        @Override // android.view.ActionMode.Callback
        @ey(method = -2953164364749629047L)
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            try {
                if (DW) {
                    iy.EQ(1112827251218168665L, this, actionMode, menuItem);
                }
                if (!QuickActionMenu.this.EQ(menuItem)) {
                    return true;
                }
                actionMode.finish();
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 1112827251218168665L, this, actionMode, menuItem);
                }
                throw th;
            }
        }

        @Override // android.view.ActionMode.Callback
        @ey(method = -1851556763003077900L)
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            try {
                if (DW) {
                    iy.EQ(-437453110116093412L, this, actionMode, menu);
                }
                actionMode.getMenuInflater().inflate(QuickActionMenu.this.j6, menu);
                QuickActionMenu.this.J0(menu);
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -437453110116093412L, this, actionMode, menu);
                }
                throw th;
            }
        }

        @Override // android.view.ActionMode.Callback
        @ey(method = 86371329965562391L)
        public void onDestroyActionMode(ActionMode actionMode) {
            try {
                if (DW) {
                    iy.tp(1630033092931770877L, this, actionMode);
                }
                QuickActionMenu.this.FH = null;
                QuickActionMenu.this.DW.oY(false);
                ServiceContainer.getMainActivity().sh().jJ();
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1630033092931770877L, this, actionMode);
                }
                throw th;
            }
        }

        @Override // android.view.ActionMode.Callback
        @ey(method = 565516421660168777L)
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            try {
                if (DW) {
                    iy.EQ(-693141584754825635L, this, actionMode, menu);
                }
                QuickActionMenu.this.J0(menu);
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -693141584754825635L, this, actionMode, menu);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(QuickActionMenu.class);
    }

    @ey(method = -7173067332613133468L)
    public QuickActionMenu(MainActivity mainActivity, int i) {
        try {
            if (Zo) {
                iy.EQ(5203549328229951309L, null, mainActivity, new Integer(i));
            }
            this.DW = mainActivity;
            this.j6 = i;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 5203549328229951309L, null, mainActivity, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1131019222019471785L)
    public boolean EQ(MenuItem menuItem) {
        try {
            if (Zo) {
                iy.tp(1699403057877220933L, this, menuItem);
            }
            int itemId = menuItem.getItemId();
            int iU7 = u7(itemId);
            MenuItemCommand menuItemCommandU7 = AppCommands.u7(itemId);
            if (iU7 < 0) {
                if (menuItemCommandU7 == null) {
                    return false;
                }
                FireBaseLogEvent.tp("Quick Action Menu: " + ((Object) menuItem.getTitle()));
                return menuItemCommandU7.run();
            }
            SyntaxError syntaxErrorGn = gn();
            if (syntaxErrorGn == null || syntaxErrorGn.AL == null || syntaxErrorGn.AL.length <= iU7) {
                return true;
            }
            ServiceContainer.getMainActivity().w9();
            ServiceContainer.getEngineService().j3(syntaxErrorGn, iU7);
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1699403057877220933L, this, menuItem);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3672315906798082425L)
    public boolean J0(Menu menu) {
        try {
            if (Zo) {
                iy.tp(2678924594937412665L, this, menu);
            }
            for (int i = 0; i < menu.size(); i++) {
                MenuItem item = menu.getItem(i);
                we(item);
                if (item.getSubMenu() != null) {
                    J0(item.getSubMenu());
                }
            }
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2678924594937412665L, this, menu);
            }
            throw th;
        }
    }

    @ey(method = 5171501588721899172L)
    private SyntaxError gn() {
        try {
            if (Zo) {
                iy.gn(-5209578430772988200L, this);
            }
            FileSpan currentFileSpan = ServiceContainer.getMainActivity().sh().getCurrentFileSpan();
            return ServiceContainer.J0().vy(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.FH, currentFileSpan.Hw, currentFileSpan.v5);
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -5209578430772988200L, this);
            }
            throw th;
        }
    }

    @ey(method = 567630484326148628L)
    private int u7(int i) {
        try {
            if (Zo) {
                iy.u7(229372328685032568L, this, i);
            }
            switch (i) {
                case q.editorMenuFix0 /* 2131230847 */:
                    return 0;
                case q.editorMenuFix1 /* 2131230848 */:
                    return 1;
                case q.editorMenuFix2 /* 2131230849 */:
                    return 2;
                case q.editorMenuFix3 /* 2131230850 */:
                    return 3;
                case q.editorMenuFix4 /* 2131230851 */:
                    return 4;
                case q.editorMenuFix5 /* 2131230852 */:
                    return 5;
                default:
                    return -1;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 229372328685032568L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3738585348802249921L)
    private void we(MenuItem menuItem) {
        try {
            if (Zo) {
                iy.tp(-1755407012901552465L, this, menuItem);
            }
            int itemId = menuItem.getItemId();
            int iU7 = u7(itemId);
            MenuItemCommand menuItemCommandU7 = AppCommands.u7(itemId);
            boolean z = true;
            if (itemId == 2131230846) {
                SyntaxError syntaxErrorGn = gn();
                if (syntaxErrorGn == null || syntaxErrorGn.AL == null || syntaxErrorGn.AL.length <= 0) {
                    z = false;
                }
                menuItem.setVisible(z);
                return;
            }
            if (iU7 >= 0) {
                SyntaxError syntaxErrorGn2 = gn();
                if (syntaxErrorGn2 == null || syntaxErrorGn2.AL == null || syntaxErrorGn2.AL.length <= iU7) {
                    menuItem.setVisible(false);
                    return;
                } else {
                    menuItem.setTitle(syntaxErrorGn2.AL[iU7]);
                    menuItem.setVisible(true);
                    return;
                }
            }
            if (menuItemCommandU7 != null) {
                menuItem.setEnabled(menuItemCommandU7.isEnabled());
                if (menuItemCommandU7 instanceof MenuCommand) {
                    MenuCommand menuCommand = (MenuCommand) menuItemCommandU7;
                    if (this.v5) {
                        z = false;
                    }
                    menuItem.setVisible(menuCommand.isVisible(z));
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1755407012901552465L, this, menuItem);
            }
            throw th;
        }
    }

    @ey(method = -3666512287721844489L)
    public void J8() {
        try {
            if (Zo) {
                iy.gn(1749789399746372621L, this);
            }
            if (this.FH != null) {
                this.FH.invalidate();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 1749789399746372621L, this);
            }
            throw th;
        }
    }

    @ey(method = -1236920642162706600L)
    public void QX(View view, boolean z) {
        try {
            if (Zo) {
                iy.EQ(-2252974524077968692L, this, view, new Boolean(z));
            }
            tp();
            this.v5 = z;
            if (this.Hw != null) {
                this.Hw.dismiss();
            }
            new Handler().post(new a(view));
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -2252974524077968692L, this, view, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -557698663756820544L)
    public void Ws(boolean z) {
        try {
            if (Zo) {
                iy.Ws(-1095756205709844720L, this, z);
            }
            if (this.FH == null) {
                this.v5 = z;
                this.FH = this.DW.startActionMode(new b());
                this.DW.oY(true);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1095756205709844720L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3645261631181103840L)
    public void tp() {
        try {
            if (Zo) {
                iy.gn(-2241692135330717036L, this);
            }
            if (this.FH != null) {
                this.FH.finish();
                this.FH = null;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2241692135330717036L, this);
            }
            throw th;
        }
    }
}
