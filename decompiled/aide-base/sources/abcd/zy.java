package abcd;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.support.v7.widget.MenuPopupWindow;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.probelytics.api.AppInfo;
import com.probelytics.api.InAppProduct;
import com.probelytics.api.Market;
import com.probelytics.api.MarketReferrer;
import com.probelytics.api.UserActionWidget;
import com.probelytics.api.UserActionWindow;
import com.probelytics.api.UserInputAction;
import com.probelytics.api.UserLaunchAction;
import com.probelytics.api.UserNotification;
import com.probelytics.api.UserNotificationAction;
import com.probelytics.api.UserTouchAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class zy extends oy implements ay {
    private static zy Zo;
    private qy FH = new qy();
    private Map<Integer, String> Hw = new HashMap();
    private yy v5 = new yy();

    private zy() {
    }

    private String BT(MenuItem menuItem) {
        return jJ(menuItem.getItemId()) ? gn(menuItem.getItemId()) : Sf(menuItem.getTitle());
    }

    private boolean CU(int i) {
        if (i != -1 && i != 16908298 && i != 16909275) {
            switch (i) {
                default:
                    switch (i) {
                        case R.id.button1:
                        case R.id.button2:
                        case R.id.button3:
                            break;
                        default:
                            return !jJ(i);
                    }
                case R.id.text1:
                case R.id.text2:
                case R.id.title:
                    return true;
            }
        }
        return true;
    }

    private String Eq(int i) {
        String str = "";
        if (i == 17 || i == 0) {
            return "";
        }
        if ((i & 32) != 0) {
            str = "up";
        } else if ((i & 64) != 0) {
            str = "down";
        }
        if ((i & 2) != 0) {
            if (str.length() > 0) {
                str = str + "|";
            }
            return str + "left";
        }
        if ((i & 4) == 0) {
            return str;
        }
        if (str.length() > 0) {
            str = str + "|";
        }
        return str + "right";
    }

    private String I(UserActionWidget userActionWidget) {
        TextView textViewQq = userActionWidget.getItemView() != null ? Qq(userActionWidget.getItemView()) : Qq(userActionWidget.getView());
        if (textViewQq != null) {
            return Hw(textViewQq.getText());
        }
        return null;
    }

    private String KD(MarketReferrer marketReferrer) {
        String str;
        if (marketReferrer.isPcampaignid()) {
            return "pcampaignid";
        }
        if (marketReferrer.getSource() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(marketReferrer.getSource());
        if (marketReferrer.getMedium() != null) {
            str = "/" + marketReferrer.getMedium();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    private String Mz(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String P8(View view, int i, View view2) {
        int id = view.getId();
        int id2 = view2.getId();
        TextView textViewQq = Qq(view2);
        if (textViewQq != null) {
            if (CU(id)) {
                return Sf(textViewQq.getText());
            }
            return gn(id) + ":" + Sf(textViewQq.getText());
        }
        if (CU(id2)) {
            return gn(id) + ":" + i;
        }
        if (CU(id)) {
            return gn(id2);
        }
        return gn(id) + ":" + gn(id2);
    }

    private TextView Qq(View view) {
        if (Xa(view)) {
            TextView textView = (TextView) view;
            if (this.FH.v5(textView.getText()) != null) {
                return textView;
            }
        }
        if (!(view instanceof ViewGroup) || et(view)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            TextView textViewQq = Qq(viewGroup.getChildAt(i));
            if (textViewQq != null) {
                return textViewQq;
            }
        }
        return null;
    }

    private String SI(Market market) {
        if (market.getPackageName() == null) {
            return null;
        }
        return market.getPackageName();
    }

    private String Sf(CharSequence charSequence) {
        String strV5 = this.FH.v5(charSequence);
        return strV5 != null ? strV5 : cz.j6(charSequence);
    }

    private String XG(int i) {
        String str;
        if (i == 17) {
            return "center";
        }
        if (i == 0) {
            return "outside";
        }
        if ((i & 32) != 0) {
            str = "top|";
        } else if ((i & 64) != 0) {
            str = "bottom|";
        } else {
            str = "center|";
        }
        if ((i & 2) != 0) {
            return str + "left";
        }
        if ((i & 4) != 0) {
            return str + "right";
        }
        return str + "center";
    }

    private static int XX(UserTouchAction userTouchAction) {
        int i = 0;
        if (userTouchAction.getX1() < 0 || userTouchAction.getY1() < 0 || userTouchAction.getX1() >= userTouchAction.getWindow().getWidth() || userTouchAction.getY1() >= userTouchAction.getWindow().getHeight()) {
            return 0;
        }
        if (userTouchAction.getX1() >= 0 && userTouchAction.getX1() < userTouchAction.getWindow().getWidth() / 3) {
            i = 3;
        } else if (userTouchAction.getX1() >= userTouchAction.getWindow().getWidth() / 3 && userTouchAction.getX1() < (userTouchAction.getWindow().getWidth() * 2) / 3) {
            i = 1;
        } else if (userTouchAction.getX1() >= (userTouchAction.getWindow().getWidth() * 2) / 3 && userTouchAction.getX1() < userTouchAction.getWindow().getWidth()) {
            i = 5;
        }
        return (userTouchAction.getY1() < 0 || userTouchAction.getY1() >= userTouchAction.getWindow().getHeight() / 3) ? (userTouchAction.getY1() < userTouchAction.getWindow().getHeight() / 3 || userTouchAction.getY1() >= (userTouchAction.getWindow().getHeight() * 2) / 3) ? (userTouchAction.getY1() < (userTouchAction.getWindow().getHeight() * 2) / 3 || userTouchAction.getY1() >= userTouchAction.getWindow().getHeight()) ? i : i | 80 : i | 16 : i | 48;
    }

    private boolean Xa(View view) {
        return (view instanceof TextView) && !(view instanceof EditText) && view.isShown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <V extends View> V aj(View view, Object obj) {
        if (obj.equals(view.getTag())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            V v = (V) aj(viewGroup.getChildAt(i), obj);
            if (v != null) {
                return v;
            }
        }
        return null;
    }

    private Pair<Throwable, StackTraceElement> br(Throwable th, boolean z) {
        Pair<Throwable, StackTraceElement> pairOW;
        if (th.getCause() != null && (pairOW = OW(th.getCause())) != null) {
            return pairOW;
        }
        if (th.getStackTrace() == null || th.getStackTrace().length <= 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.getMethodName().contains("$") && (!z || ry.tp(stackTraceElement.getClassName()))) {
                return Pair.create(th, stackTraceElement);
            }
        }
        return null;
    }

    private String ca(UserActionWindow userActionWindow) {
        TextView textViewQq;
        if (userActionWindow.getType() != 1 || (textViewQq = Qq(userActionWindow.getWindowView())) == null || textViewQq.isClickable()) {
            return null;
        }
        return Hw(textViewQq.getText());
    }

    private String cb(UserLaunchAction userLaunchAction) {
        return "onLaunch " + gW(userLaunchAction.getActivity());
    }

    private String cn(UserActionWindow userActionWindow) {
        String str = this.Hw.get(Integer.valueOf(System.identityHashCode(userActionWindow.getWindowView())));
        if (str != null) {
            return str;
        }
        String strG3 = g3(userActionWindow);
        this.Hw.put(Integer.valueOf(System.identityHashCode(userActionWindow.getWindowView())), strG3);
        return strG3;
    }

    private String dx(UserNotification userNotification) {
        String strV5 = this.FH.v5(userNotification.getStringExtra("android.text"));
        if (strV5 != null) {
            return "notification:" + strV5;
        }
        String strV52 = this.FH.v5(userNotification.getStringExtra("android.title"));
        if (strV52 == null) {
            return "notification";
        }
        return "notification:" + strV52;
    }

    private String ef(UserTouchAction userTouchAction) {
        switch (userTouchAction.getKind()) {
            case 0:
                return "onTap " + XG(XX(userTouchAction)) + " in " + cn(userTouchAction.getWindow());
            case 1:
                return "onSwipe " + XG(XX(userTouchAction)) + "_" + Eq(kQ(userTouchAction)) + " in " + cn(userTouchAction.getWindow());
            case 2:
                return "onLongTap " + XG(XX(userTouchAction)) + " in " + cn(userTouchAction.getWindow());
            case 3:
                return "onItemLongPress " + ro(userTouchAction.getWidget()) + " in " + cn(userTouchAction.getWindow());
            case 4:
                return "onLongPress " + ro(userTouchAction.getWidget()) + " in " + cn(userTouchAction.getWindow());
            case 5:
                return "onMenuItemSelected " + ro(userTouchAction.getWidget()) + " in " + cn(userTouchAction.getWindow());
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return "onItemClick " + ro(userTouchAction.getWidget()) + " in " + cn(userTouchAction.getWindow());
            case UserTouchAction.CLICK_KIND /* 7 */:
                return "onClick " + ro(userTouchAction.getWidget()) + " in " + cn(userTouchAction.getWindow());
            default:
                return null;
        }
    }

    private String ei(AppInfo appInfo) {
        return appInfo.getApplicationId();
    }

    private boolean et(View view) {
        try {
            if (view instanceof RecyclerView) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            if (view instanceof ViewPager) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        try {
            if (view instanceof DrawerLayout) {
                return true;
            }
        } catch (Throwable unused3) {
        }
        try {
            if (view instanceof android.support.v7.widget.RecyclerView) {
                return true;
            }
        } catch (Throwable unused4) {
        }
        try {
            if (view instanceof ViewPager) {
                return true;
            }
        } catch (Throwable unused5) {
        }
        try {
            if (view instanceof DrawerLayout) {
                return true;
            }
        } catch (Throwable unused6) {
        }
        return view instanceof AdapterView;
    }

    private String g3(UserActionWindow userActionWindow) {
        String strV5;
        String strV52;
        int type = userActionWindow.getType();
        if (type == 0) {
            return gW(userActionWindow.getActivity());
        }
        if (type == 1) {
            TextView textViewQq = Qq(userActionWindow.getWindowView());
            if (textViewQq == null || textViewQq.isClickable() || (strV5 = this.FH.v5(textViewQq.getText())) == null) {
                return gW(userActionWindow.getActivity()) + ":dialog";
            }
            return gW(userActionWindow.getActivity()) + ":" + strV5;
        }
        if (type != 2) {
            if (type != 4) {
                if (!(userActionWindow.getContext() instanceof Service)) {
                    return "overlay_window";
                }
                return userActionWindow.getContext().getClass().getSimpleName() + ":overlay_window";
            }
            TextView textViewQq2 = Qq(userActionWindow.getWindowView());
            if (textViewQq2 == null || textViewQq2.isClickable() || (strV52 = this.FH.v5(textViewQq2.getText())) == null) {
                return "toast";
            }
            return "toast:" + strV52;
        }
        View windowView = userActionWindow.getWindowView();
        try {
            if (sy(windowView, Class.forName("android.widget.ListPopupWindow$DropDownListView")) != null) {
                return gW(userActionWindow.getActivity()) + ":menu";
            }
        } catch (Throwable unused) {
        }
        try {
            if (sy(windowView, Class.forName("android.widget.MenuPopupWindow$MenuDropDownListView")) != null) {
                return gW(userActionWindow.getActivity()) + ":menu";
            }
        } catch (Throwable unused2) {
        }
        try {
            if (sy(windowView, MenuPopupWindow.MenuDropDownListView.class) != null) {
                return gW(userActionWindow.getActivity()) + ":menu";
            }
        } catch (Throwable unused3) {
        }
        try {
            if (sy(windowView, MenuPopupWindow.MenuDropDownListView.class) != null) {
                return gW(userActionWindow.getActivity()) + ":menu";
            }
        } catch (Throwable unused4) {
        }
        try {
            if (aj(windowView, "floating_toolbar") != null) {
                return gW(userActionWindow.getActivity()) + ":floating_toolbar";
            }
        } catch (Throwable unused5) {
        }
        try {
            if (sy(windowView, Class.forName("android.widget.Editor$InsertionHandleView")) != null || sy(windowView, Class.forName("android.widget.Editor$SelectionHandleView")) != null) {
                return gW(userActionWindow.getActivity()) + ":editor_handle";
            }
        } catch (Throwable unused6) {
        }
        return gW(userActionWindow.getActivity()) + ":popup";
    }

    private String gW(Activity activity) {
        if (activity == null) {
            return null;
        }
        return activity.getClass().getSimpleName();
    }

    private boolean jJ(int i) throws Resources.NotFoundException {
        if (i == -1) {
            return false;
        }
        try {
            iy.DW().getResources().getResourceEntryName(i);
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    private static int kQ(UserTouchAction userTouchAction) {
        int iAbs = Math.abs(userTouchAction.getX1() - userTouchAction.getX2());
        int iAbs2 = Math.abs(userTouchAction.getY1() - userTouchAction.getY2());
        if (iAbs == 0 && iAbs2 == 0) {
            return 0;
        }
        int i = iAbs < iAbs2 / 2 ? 1 : userTouchAction.getX1() > userTouchAction.getX2() ? 3 : 5;
        return iAbs2 < iAbs / 2 ? i | 16 : userTouchAction.getY1() > userTouchAction.getY2() ? i | 48 : i | 80;
    }

    public static zy lp() {
        return Zo;
    }

    private String nw(InAppProduct inAppProduct) {
        return inAppProduct.getProductId();
    }

    private String ro(UserActionWidget userActionWidget) {
        return userActionWidget.getItemView() != null ? P8(userActionWidget.getView(), userActionWidget.getItemPosition(), userActionWidget.getItemView()) : vy(userActionWidget.getView());
    }

    private String sG(UserNotificationAction userNotificationAction) {
        if (UserNotificationAction.CONTENT_ACTION_NAME.equals(userNotificationAction.getName())) {
            return "onOpen " + dx(userNotificationAction.getNotification());
        }
        if (UserNotificationAction.DELETE_ACTION_NAME.equals(userNotificationAction.getName())) {
            return "onDelete " + dx(userNotificationAction.getNotification());
        }
        String strV5 = this.FH.v5(userNotificationAction.getName());
        if (strV5 == null) {
            return "onClick unknown in " + dx(userNotificationAction.getNotification());
        }
        return "onClick " + strV5 + " in " + dx(userNotificationAction.getNotification());
    }

    private String sh(UserInputAction userInputAction) {
        if (userInputAction.isBackKey()) {
            return "onBack in " + cn(userInputAction.getWindow());
        }
        return "onInput in " + cn(userInputAction.getWindow());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <V extends View> V sy(View view, Class<V> cls) {
        if (cls.isInstance(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            V v = (V) sy(viewGroup.getChildAt(i), cls);
            if (v != null) {
                return v;
            }
        }
        return null;
    }

    private static String vJ(Throwable th) {
        if (th.getCause() != null) {
            return vJ(th.getCause());
        }
        String name = th.getClass().getName();
        if (th.getStackTrace() == null || th.getStackTrace().length <= 0) {
            return name;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (ry.tp(stackTraceElement.getClassName())) {
                return name + " in " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            }
        }
        StackTraceElement stackTraceElement2 = th.getStackTrace()[0];
        return name + " in " + stackTraceElement2.getClassName() + "." + stackTraceElement2.getMethodName();
    }

    private String vy(View view) {
        int id = view.getId();
        TextView textViewQq = Qq(view);
        if (textViewQq != null) {
            return Sf(textViewQq.getText());
        }
        if (!CU(id)) {
            return gn(id);
        }
        String strV5 = this.FH.v5(view.getContentDescription());
        return strV5 != null ? strV5 : gn(id);
    }

    public static void wc() {
        if (Zo == null) {
            zy zyVar = new zy();
            Zo = zyVar;
            by.DW(zyVar);
        }
    }

    private String x9(UserNotificationAction userNotificationAction) {
        String name = userNotificationAction.getName();
        String strV5 = this.FH.v5(name);
        String stringExtra = userNotificationAction.getNotification().getStringExtra("android.text");
        String strV52 = this.FH.v5(stringExtra);
        String stringExtra2 = userNotificationAction.getNotification().getStringExtra("android.title");
        String strV53 = this.FH.v5(stringExtra2);
        if (strV52 != null) {
            if (strV5 == null) {
                return Hw(stringExtra);
            }
            return Hw(name) + " " + Hw(stringExtra);
        }
        if (strV53 == null) {
            return null;
        }
        if (strV5 == null) {
            return Hw(stringExtra2);
        }
        return Hw(name) + " " + Hw(stringExtra2);
    }

    @Override // abcd.ay
    public int DW() {
        return bz.DW;
    }

    @Override // abcd.ay
    public long EQ() {
        return System.currentTimeMillis() - j6();
    }

    @Override // abcd.ay
    public boolean FH() {
        int iMyPid = Process.myPid();
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) iy.DW().getSystemService("activity")).getRunningAppProcesses().iterator();
        while (it.hasNext()) {
            if (it.next().pid == iMyPid) {
                return !r2.processName.contains(":");
            }
        }
        return true;
    }

    @Override // abcd.ay
    public String Hw(CharSequence charSequence) {
        return this.FH.Hw(charSequence);
    }

    @Override // abcd.ay
    public String J0(Object obj) {
        if (obj instanceof UserActionWindow) {
            return ca((UserActionWindow) obj);
        }
        if (obj instanceof UserActionWidget) {
            return I((UserActionWidget) obj);
        }
        if (obj instanceof UserNotificationAction) {
            return x9((UserNotificationAction) obj);
        }
        if (obj instanceof Activity) {
            return Mz((Activity) obj);
        }
        return null;
    }

    @Override // abcd.ay
    public String J8() {
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) iy.DW().getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.processName.lastIndexOf(58) == -1) {
                        return "";
                    }
                    String str = runningAppProcessInfo.processName;
                    return str.substring(str.lastIndexOf(58) + 1);
                }
            }
        }
        return "";
    }

    @Override // abcd.ay
    public String Mr() {
        return iy.Hw();
    }

    public Pair<Throwable, StackTraceElement> OW(Throwable th) {
        Pair<Throwable, StackTraceElement> pairBr = br(th, true);
        return pairBr != null ? pairBr : br(th, false);
    }

    @Override // abcd.ay
    public String QX() {
        Rect rectJ6 = c00.j6();
        int iWidth = rectJ6.width();
        int iHeight = rectJ6.height();
        if (iHeight > iWidth) {
            iWidth = iHeight;
            iHeight = iWidth;
        }
        return iWidth + "x" + iHeight + "/" + iy.DW().getResources().getDisplayMetrics().density;
    }

    @Override // abcd.ay
    public int VH() {
        try {
            return iy.DW().getPackageManager().getPackageInfo(iy.DW().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Override // abcd.ay
    public String Ws() {
        try {
            return iy.DW().getPackageManager().getPackageInfo(iy.DW().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // abcd.ay
    public boolean XL() {
        FeatureInfo[] systemAvailableFeatures = iy.DW().getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if ("android.hardware.type.watch".equals(featureInfo.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // abcd.ay
    public String Zo(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InAppProduct) {
            return nw((InAppProduct) obj);
        }
        if (obj instanceof Market) {
            return SI((Market) obj);
        }
        if (obj instanceof MarketReferrer) {
            return KD((MarketReferrer) obj);
        }
        if (obj instanceof UserNotification) {
            return dx((UserNotification) obj);
        }
        if (obj instanceof UserNotificationAction) {
            return sG((UserNotificationAction) obj);
        }
        if (obj instanceof View) {
            return vy((View) obj);
        }
        if (obj instanceof MenuItem) {
            return BT((MenuItem) obj);
        }
        if (obj instanceof Activity) {
            return gW((Activity) obj);
        }
        if (obj instanceof UserLaunchAction) {
            return cb((UserLaunchAction) obj);
        }
        if (obj instanceof UserActionWidget) {
            return ro((UserActionWidget) obj);
        }
        if (obj instanceof UserActionWindow) {
            return cn((UserActionWindow) obj);
        }
        if (obj instanceof UserTouchAction) {
            return ef((UserTouchAction) obj);
        }
        if (obj instanceof UserInputAction) {
            return sh((UserInputAction) obj);
        }
        if (obj instanceof CharSequence) {
            return Sf((CharSequence) obj);
        }
        if (obj instanceof Thread) {
            return ((Thread) obj).getName();
        }
        if (obj instanceof Throwable) {
            return vJ((Throwable) obj);
        }
        if (obj instanceof AppInfo) {
            return ei((AppInfo) obj);
        }
        if (obj instanceof Class) {
            return "class " + ry.Hw((Class) obj);
        }
        return "Object of class " + ry.Hw(obj.getClass());
    }

    @Override // abcd.ay
    public String a8() {
        return iy.DW().getPackageName();
    }

    @Override // abcd.ay
    public boolean aM() {
        return j6() != lg();
    }

    @Override // abcd.ay
    public String gn(int i) {
        if (i == -1) {
            return "unknown";
        }
        try {
            return iy.DW().getResources().getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return "unknown";
        }
    }

    public void hz(List<String> list) {
        this.FH.J0(list);
    }

    @Override // abcd.ay
    public boolean j3() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    @Override // abcd.ay
    public long j6() {
        try {
            return iy.DW().getPackageManager().getPackageInfo(iy.DW().getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    @Override // abcd.ay
    public long lg() {
        try {
            return iy.DW().getPackageManager().getPackageInfo(iy.DW().getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    @Override // abcd.ay
    public long tp() {
        if (Build.VERSION.SDK_INT < 16) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) iy.DW().getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // abcd.ay
    public String u7() {
        ApplicationInfo applicationInfo = iy.DW().getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : iy.DW().getString(i);
    }

    @Override // abcd.ay
    public String we() {
        FeatureInfo[] systemAvailableFeatures = iy.DW().getPackageManager().getSystemAvailableFeatures();
        String str = "";
        if (systemAvailableFeatures != null) {
            ArrayList arrayList = new ArrayList();
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                String str2 = featureInfo.name;
                if (str2 != null && str2.startsWith("android.hardware.")) {
                    if (str2.startsWith("android.hardware.sensor.")) {
                        arrayList.add(str2.substring(24));
                    } else {
                        arrayList.add(str2.substring(17));
                    }
                }
            }
            Collections.sort(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                str = str + ((String) it.next()) + " ";
            }
        }
        return str;
    }

    @Override // abcd.ay
    /* renamed from: yO, reason: merged with bridge method [inline-methods] */
    public yy v5() {
        return this.v5;
    }
}
