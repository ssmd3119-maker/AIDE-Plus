package com.aide.ui.views;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -2809505318810692533L, container = -2809505318810692533L, user = true)
/* loaded from: classes.dex */
public class DialogMenu implements Menu {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -1045953239845000715L)
    private Context DW;

    @dy(field = 950457616112806032L)
    private List<a> j6;

    @cy(clazz = -6288364252829554275L, container = -6288364252829554275L, user = true)
    public class a implements MenuItem {

        @gy
        private static /* synthetic */ boolean EQ;

        @fy
        private static /* synthetic */ boolean tp;

        @dy(field = -3082666963465353440L)
        private int DW;

        @dy(field = 2691183503214111300L)
        private int FH;

        @dy(field = -2609892844521091440L)
        private int Hw;

        @dy(field = 3707470737727583931L)
        private boolean VH;

        @dy(field = -1651885095145993925L)
        private SubMenu Zo;

        @dy(field = 3619213748732327984L)
        private boolean gn;

        @dy(field = -2421605643268669232L)
        private CharSequence j6;

        @dy(field = -1795238769610989632L)
        @hy
        final /* synthetic */ DialogMenu u7;

        @dy(field = -1352166923671405491L)
        private Drawable v5;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 7062075484419421865L)
        public a(DialogMenu dialogMenu, int i) {
            try {
                if (tp) {
                    iy.EQ(146308887958481112L, null, dialogMenu, new Integer(i));
                }
                this.u7 = dialogMenu;
                this.j6 = dialogMenu.j6().getResources().getString(i);
            } catch (Throwable th) {
                if (EQ) {
                    iy.Mr(th, 146308887958481112L, null, dialogMenu, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -1879608731366110193L)
        public boolean collapseActionView() {
            try {
                if (!tp) {
                    return false;
                }
                iy.gn(-205024884342355104L, this);
                return false;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -205024884342355104L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3198281354597352240L)
        public boolean expandActionView() {
            try {
                if (!tp) {
                    return false;
                }
                iy.gn(1622920215389269035L, this);
                return false;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 1622920215389269035L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 911040742691226576L)
        public ActionProvider getActionProvider() {
            try {
                if (!tp) {
                    return null;
                }
                iy.gn(-6141855384724901707L, this);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -6141855384724901707L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 2888707168140751264L)
        public View getActionView() {
            try {
                if (!tp) {
                    return null;
                }
                iy.gn(-1825431732511245935L, this);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -1825431732511245935L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -1136016802034800128L)
        public char getAlphabeticShortcut() {
            try {
                if (!tp) {
                    return (char) 0;
                }
                iy.gn(-2541166389762192855L, this);
                return (char) 0;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -2541166389762192855L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -490764579301311279L)
        public int getGroupId() {
            try {
                if (tp) {
                    iy.gn(1220676056017164152L, this);
                }
                return this.FH;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 1220676056017164152L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 2134548018938754328L)
        public Drawable getIcon() {
            try {
                if (tp) {
                    iy.gn(3210668495917274179L, this);
                }
                return this.v5;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 3210668495917274179L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -280449809325459789L)
        public Intent getIntent() {
            try {
                if (!tp) {
                    return null;
                }
                iy.gn(-2533642457974337760L, this);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -2533642457974337760L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 27310828901900907L)
        public int getItemId() {
            try {
                if (tp) {
                    iy.gn(-2232280962198742920L, this);
                }
                return this.DW;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -2232280962198742920L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 2809051363405172088L)
        public ContextMenu.ContextMenuInfo getMenuInfo() {
            try {
                if (!tp) {
                    return null;
                }
                iy.gn(3587107288865712183L, this);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 3587107288865712183L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -47575110838635720L)
        public char getNumericShortcut() {
            try {
                if (!tp) {
                    return (char) 0;
                }
                iy.gn(1569746816617188485L, this);
                return (char) 0;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 1569746816617188485L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 2059358026738291215L)
        public int getOrder() {
            try {
                if (tp) {
                    iy.gn(-2634286192081728864L, this);
                }
                return this.Hw;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -2634286192081728864L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3043068605232508704L)
        public SubMenu getSubMenu() {
            try {
                if (tp) {
                    iy.gn(-3977896503497484639L, this);
                }
                return this.Zo;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -3977896503497484639L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 2306940639698963715L)
        public CharSequence getTitle() {
            try {
                if (tp) {
                    iy.gn(-2405018827291145684L, this);
                }
                return this.j6;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -2405018827291145684L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3042014561300972064L)
        public CharSequence getTitleCondensed() {
            try {
                if (!tp) {
                    return "";
                }
                iy.gn(-4084303617243485559L, this);
                return "";
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -4084303617243485559L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -4256991232926841064L)
        public boolean hasSubMenu() {
            try {
                if (tp) {
                    iy.gn(-2385173042648059887L, this);
                }
                return this.Zo != null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -2385173042648059887L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -7336073144638147029L)
        public boolean isActionViewExpanded() {
            try {
                if (!tp) {
                    return false;
                }
                iy.gn(-4001634365971237044L, this);
                return false;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -4001634365971237044L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 380844638881506865L)
        public boolean isCheckable() {
            try {
                if (!tp) {
                    return false;
                }
                iy.gn(1258262111171184476L, this);
                return false;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 1258262111171184476L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3678912503480551560L)
        public boolean isChecked() {
            try {
                if (!tp) {
                    return false;
                }
                iy.gn(1256306867500006167L, this);
                return false;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 1256306867500006167L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3886648667607791700L)
        public boolean isEnabled() {
            try {
                if (tp) {
                    iy.gn(1452353691282325605L, this);
                }
                return this.VH;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 1452353691282325605L, this);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3798616146711478141L)
        public boolean isVisible() {
            try {
                if (tp) {
                    iy.gn(1354140237691585876L, this);
                }
                return this.gn;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 1354140237691585876L, this);
                }
                throw th;
            }
        }

        @ey(method = -413770987104014067L)
        public void j6(SubMenu subMenu) {
            try {
                if (tp) {
                    iy.tp(-1117916151339113280L, this, subMenu);
                }
                this.Zo = subMenu;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -1117916151339113280L, this, subMenu);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 2508440302797105600L)
        public MenuItem setActionProvider(ActionProvider actionProvider) {
            try {
                if (!tp) {
                    return null;
                }
                iy.tp(5537131145608082031L, this, actionProvider);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, 5537131145608082031L, this, actionProvider);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -2838616747571618001L)
        public MenuItem setActionView(View view) {
            try {
                if (!tp) {
                    return null;
                }
                iy.tp(-127163023113009120L, this, view);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -127163023113009120L, this, view);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -175099580413512145L)
        public MenuItem setAlphabeticShortcut(char c) {
            try {
                if (tp) {
                    iy.tp(51325240279536640L, this, new Character(c));
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, 51325240279536640L, this, new Character(c));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3610534669603034784L)
        public MenuItem setCheckable(boolean z) {
            try {
                if (tp) {
                    iy.Ws(-1311560505891788047L, this, z);
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -1311560505891788047L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -930635235371061171L)
        public MenuItem setChecked(boolean z) {
            try {
                if (tp) {
                    iy.Ws(-1548076967187719820L, this, z);
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -1548076967187719820L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -2331551724973353845L)
        public MenuItem setEnabled(boolean z) {
            try {
                if (tp) {
                    iy.Ws(1779669381859764792L, this, z);
                }
                this.VH = z;
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, 1779669381859764792L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 730819379116047400L)
        public MenuItem setIcon(Drawable drawable) {
            try {
                if (tp) {
                    iy.tp(-392239431959041839L, this, drawable);
                }
                this.v5 = drawable;
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -392239431959041839L, this, drawable);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -1704547970031342575L)
        public MenuItem setIntent(Intent intent) {
            try {
                if (tp) {
                    iy.tp(-1008670381923713184L, this, intent);
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -1008670381923713184L, this, intent);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -3361839550957619671L)
        public MenuItem setNumericShortcut(char c) {
            try {
                if (tp) {
                    iy.tp(-2473346990274019860L, this, new Character(c));
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -2473346990274019860L, this, new Character(c));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 3022536753707280849L)
        public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
            try {
                if (!tp) {
                    return null;
                }
                iy.tp(-3471625298872939296L, this, onActionExpandListener);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -3471625298872939296L, this, onActionExpandListener);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 541736239568155060L)
        public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            try {
                if (tp) {
                    iy.tp(243020900502263799L, this, onMenuItemClickListener);
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, 243020900502263799L, this, onMenuItemClickListener);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -3322996279632665727L)
        public MenuItem setShortcut(char c, char c2) {
            try {
                if (tp) {
                    iy.EQ(2171390373296654396L, this, new Character(c), new Character(c2));
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.Mr(th, 2171390373296654396L, this, new Character(c), new Character(c2));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -5633480481004171375L)
        public void setShowAsAction(int i) {
            try {
                if (tp) {
                    iy.u7(-1447487711139797264L, this, i);
                }
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -1447487711139797264L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 2648665265108544L)
        public MenuItem setShowAsActionFlags(int i) {
            try {
                if (!tp) {
                    return null;
                }
                iy.u7(-1640851424402441615L, this, i);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -1640851424402441615L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 183924990113460192L)
        public MenuItem setTitle(CharSequence charSequence) {
            try {
                if (tp) {
                    iy.tp(-963636502608881361L, this, charSequence);
                }
                this.j6 = charSequence.toString();
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -963636502608881361L, this, charSequence);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -3333145723329025609L)
        public MenuItem setTitleCondensed(CharSequence charSequence) {
            try {
                if (tp) {
                    iy.tp(-51831353973335020L, this, charSequence);
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -51831353973335020L, this, charSequence);
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 1822072143091357808L)
        public MenuItem setVisible(boolean z) {
            try {
                if (tp) {
                    iy.Ws(839008293146959053L, this, z);
                }
                this.gn = z;
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, 839008293146959053L, this, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -4281147773421291783L)
        public MenuItem setActionView(int i) {
            try {
                if (!tp) {
                    return null;
                }
                iy.u7(-968988640773325744L, this, i);
                return null;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -968988640773325744L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = -917207951585748585L)
        public MenuItem setIcon(int i) {
            try {
                if (tp) {
                    iy.u7(-268696238799592780L, this, i);
                }
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -268696238799592780L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.MenuItem
        @ey(method = 860820396765625044L)
        public MenuItem setTitle(int i) {
            try {
                if (tp) {
                    iy.u7(-450346138675719867L, this, i);
                }
                this.j6 = this.u7.j6().getResources().getString(i);
                return this;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, -450346138675719867L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 3281569618488136679L)
        public a(DialogMenu dialogMenu, CharSequence charSequence) {
            try {
                if (tp) {
                    iy.EQ(-686068806637669884L, null, dialogMenu, charSequence);
                }
                this.u7 = dialogMenu;
                this.j6 = charSequence.toString();
            } catch (Throwable th) {
                if (EQ) {
                    iy.Mr(th, -686068806637669884L, null, dialogMenu, charSequence);
                }
                throw th;
            }
        }

        @ey(method = -225204285923461680L)
        public a(DialogMenu dialogMenu, int i, int i2, int i3, CharSequence charSequence) {
            try {
                if (tp) {
                    iy.J8(-3151033939095433709L, null, dialogMenu, new Integer(i), new Integer(i2), new Integer(i3), charSequence);
                }
                this.u7 = dialogMenu;
                this.FH = i;
                this.DW = i2;
                this.Hw = i3;
                this.j6 = charSequence.toString();
            } catch (Throwable th) {
                if (EQ) {
                    iy.lg(th, -3151033939095433709L, null, dialogMenu, new Integer(i), new Integer(i2), new Integer(i3), charSequence);
                }
                throw th;
            }
        }

        @ey(method = 1930832891684624064L)
        public a(DialogMenu dialogMenu, int i, int i2, int i3, int i4) {
            try {
                if (tp) {
                    iy.J8(642817242701072437L, null, dialogMenu, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                this.u7 = dialogMenu;
                this.FH = i;
                this.DW = i2;
                this.Hw = i3;
                this.j6 = dialogMenu.j6().getResources().getString(i4);
            } catch (Throwable th) {
                if (EQ) {
                    iy.lg(th, 642817242701072437L, null, dialogMenu, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -4739229968711374864L, container = -4739229968711374864L, user = true)
    private class b extends DialogMenu implements SubMenu {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 2715469240519943072L)
        private a v5;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = -4530058951967493113L)
        public b(DialogMenu dialogMenu, Context context, DialogMenu dialogMenu2, a aVar) {
            super(context);
            try {
                if (Zo) {
                    iy.J0(-500565934227649145L, null, dialogMenu, context, dialogMenu2, aVar);
                }
                this.v5 = aVar;
            } catch (Throwable th) {
                if (VH) {
                    iy.a8(th, -500565934227649145L, null, dialogMenu, context, dialogMenu2, aVar);
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = 2070268512157065728L)
        public void clearHeader() {
            try {
                if (Zo) {
                    iy.gn(-3845249464623996057L, this);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, -3845249464623996057L, this);
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = -2010096307082142819L)
        public MenuItem getItem() {
            try {
                if (Zo) {
                    iy.gn(763512804648026028L, this);
                }
                return this.v5;
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 763512804648026028L, this);
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = -2764476297307304089L)
        public SubMenu setHeaderIcon(int i) {
            try {
                if (Zo) {
                    iy.u7(-2981835095295605476L, this, i);
                }
                return this;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -2981835095295605476L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = 3029511656601247360L)
        public SubMenu setHeaderTitle(int i) {
            try {
                if (Zo) {
                    iy.u7(-1014483907925872879L, this, i);
                }
                return this;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -1014483907925872879L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = 251846959060840275L)
        public SubMenu setHeaderView(View view) {
            try {
                if (Zo) {
                    iy.tp(-963468701292098976L, this, view);
                }
                return this;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -963468701292098976L, this, view);
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = 445935161938255560L)
        public SubMenu setIcon(int i) {
            try {
                if (Zo) {
                    iy.u7(700845357475794057L, this, i);
                }
                return this;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, 700845357475794057L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = -3760768818211825800L)
        public SubMenu setHeaderIcon(Drawable drawable) {
            try {
                if (Zo) {
                    iy.tp(-3913934609727954243L, this, drawable);
                }
                return this;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -3913934609727954243L, this, drawable);
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = 861845748371803120L)
        public SubMenu setHeaderTitle(CharSequence charSequence) {
            try {
                if (Zo) {
                    iy.tp(-3042020279894482021L, this, charSequence);
                }
                return this;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -3042020279894482021L, this, charSequence);
                }
                throw th;
            }
        }

        @Override // android.view.SubMenu
        @ey(method = 212647382294886639L)
        public SubMenu setIcon(Drawable drawable) {
            try {
                if (Zo) {
                    iy.tp(491887153254017664L, this, drawable);
                }
                return this;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, 491887153254017664L, this, drawable);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(DialogMenu.class);
    }

    @ey(method = 171954405492646140L)
    public DialogMenu(Context context) {
        try {
            if (FH) {
                iy.tp(-30117927948399253L, null, context);
            }
            this.j6 = new ArrayList();
            this.DW = context;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -30117927948399253L, null, context);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 1592994578137406795L)
    public MenuItem add(CharSequence charSequence) {
        try {
            if (FH) {
                iy.tp(2161974212842366511L, this, charSequence);
            }
            a aVar = new a(this, charSequence);
            this.j6.add(aVar);
            return aVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2161974212842366511L, this, charSequence);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 838737300315367524L)
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        try {
            if (FH) {
                iy.QX(-3790286692241185568L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), componentName, intentArr, intent, new Integer(i4), menuItemArr});
            }
            return 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -3790286692241185568L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), componentName, intentArr, intent, new Integer(i4), menuItemArr});
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = -219355610188336768L)
    public SubMenu addSubMenu(CharSequence charSequence) {
        try {
            if (FH) {
                iy.tp(-1342085990956929924L, this, charSequence);
            }
            a aVar = new a(this, charSequence);
            this.j6.add(aVar);
            b bVar = new b(this, this.DW, this, aVar);
            aVar.j6(bVar);
            return bVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1342085990956929924L, this, charSequence);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 1008953131436052216L)
    public void clear() {
        try {
            if (FH) {
                iy.gn(-1096778422182798080L, this);
            }
            this.j6.clear();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1096778422182798080L, this);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 1011841025638166653L)
    public void close() {
        try {
            if (FH) {
                iy.gn(-1099209306246634855L, this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1099209306246634855L, this);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 316849536087801600L)
    public MenuItem findItem(int i) {
        try {
            if (!FH) {
                return null;
            }
            iy.u7(-10281512089683780L, this, i);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -10281512089683780L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = -517950479147575845L)
    public MenuItem getItem(int i) {
        try {
            if (!FH) {
                return null;
            }
            iy.u7(542294225993115935L, this, i);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 542294225993115935L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 5111886314716985875L)
    public boolean hasVisibleItems() {
        try {
            if (!FH) {
                return true;
            }
            iy.gn(3700111349343703235L, this);
            return true;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3700111349343703235L, this);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 3408343824402082656L)
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        try {
            if (!FH) {
                return false;
            }
            iy.EQ(-3613079513397015288L, this, new Integer(i), keyEvent);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -3613079513397015288L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = 1240374185756184992L)
    public Context j6() {
        try {
            if (FH) {
                iy.gn(1835251828084666892L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1835251828084666892L, this);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = -7136648233587654435L)
    public boolean performIdentifierAction(int i, int i2) {
        try {
            if (!FH) {
                return false;
            }
            iy.EQ(-5507486108656929511L, this, new Integer(i), new Integer(i2));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -5507486108656929511L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 3174700290717491813L)
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        try {
            if (!FH) {
                return false;
            }
            iy.we(389961992503358849L, this, new Integer(i), keyEvent, new Integer(i2));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 389961992503358849L, this, new Integer(i), keyEvent, new Integer(i2));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 2182141056811400925L)
    public void removeGroup(int i) {
        try {
            if (FH) {
                iy.u7(-1185186553053691251L, this, i);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1185186553053691251L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = -258684367107550473L)
    public void removeItem(int i) {
        try {
            if (FH) {
                iy.u7(-1514779519040223385L, this, i);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1514779519040223385L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = -5560561876683381463L)
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        try {
            if (FH) {
                iy.we(-4069327885588639751L, this, new Integer(i), new Boolean(z), new Boolean(z2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -4069327885588639751L, this, new Integer(i), new Boolean(z), new Boolean(z2));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 531006388860268343L)
    public void setGroupEnabled(int i, boolean z) {
        try {
            if (FH) {
                iy.EQ(-114440534078326945L, this, new Integer(i), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -114440534078326945L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 3339025515977149560L)
    public void setGroupVisible(int i, boolean z) {
        try {
            if (FH) {
                iy.EQ(2443359318889654384L, this, new Integer(i), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2443359318889654384L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 2595193555402825875L)
    public void setQwertyMode(boolean z) {
        try {
            if (FH) {
                iy.Ws(412563950906844375L, this, z);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 412563950906844375L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = -2536097223668681920L)
    public int size() {
        try {
            if (FH) {
                iy.gn(1523087420015958952L, this);
            }
            return this.j6.size();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1523087420015958952L, this);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 5036087181371642165L)
    public MenuItem add(int i) {
        try {
            if (FH) {
                iy.u7(5441939372991173885L, this, i);
            }
            a aVar = new a(this, i);
            this.j6.add(aVar);
            return aVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 5441939372991173885L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 889424545840457840L)
    public SubMenu addSubMenu(int i) {
        try {
            if (FH) {
                iy.u7(-451304394020303856L, this, i);
            }
            a aVar = new a(this, i);
            this.j6.add(aVar);
            b bVar = new b(this, this.DW, this, aVar);
            aVar.j6(bVar);
            return bVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -451304394020303856L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = -983324300316128280L)
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        try {
            if (FH) {
                iy.J0(-716583459859228200L, this, new Integer(i), new Integer(i2), new Integer(i3), charSequence);
            }
            a aVar = new a(this, i, i2, i3, charSequence);
            this.j6.add(aVar);
            return aVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -716583459859228200L, this, new Integer(i), new Integer(i2), new Integer(i3), charSequence);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 620580768520400640L)
    public MenuItem add(int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J0(482521709998468500L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            a aVar = new a(this, i, i2, i3, i4);
            this.j6.add(aVar);
            return aVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 482521709998468500L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 1315481982237032227L)
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        try {
            if (FH) {
                iy.J0(2460569534860639527L, this, new Integer(i), new Integer(i2), new Integer(i3), charSequence);
            }
            a aVar = new a(this, i, i2, i3, charSequence);
            this.j6.add(aVar);
            b bVar = new b(this, this.DW, this, aVar);
            aVar.j6(bVar);
            return bVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 2460569534860639527L, this, new Integer(i), new Integer(i2), new Integer(i3), charSequence);
            }
            throw th;
        }
    }

    @Override // android.view.Menu
    @ey(method = 3015915090261325729L)
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J0(-2150737970764992375L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            a aVar = new a(this, i, i2, i3, i4);
            this.j6.add(aVar);
            b bVar = new b(this, this.DW, this, aVar);
            aVar.j6(bVar);
            return bVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -2150737970764992375L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }
}
