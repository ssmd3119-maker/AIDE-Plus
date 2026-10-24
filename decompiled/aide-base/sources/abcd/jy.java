package abcd;

import android.graphics.Rect;
import android.util.Pair;
import com.probelytics.api.InAppProduct;
import com.probelytics.api.Market;
import com.probelytics.api.UserInputAction;
import com.probelytics.api.UserLaunchAction;
import com.probelytics.api.UserNotificationAction;
import com.probelytics.api.UserTouchAction;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class jy {
    public Map<String, hz> DW = new HashMap();
    public boolean EQ;
    public boolean FH;
    public boolean Hw;
    public ky J0;
    public Throwable J8;
    public boolean VH;
    public Pair<Throwable, StackTraceElement> Ws;
    public long Zo;
    public boolean gn;
    public String j6;
    public boolean tp;
    public boolean u7;
    public String v5;
    public boolean we;

    public jy() {
    }

    private ky DW(Market market) {
        Rect rectJ6 = c00.j6();
        int iWidth = rectJ6.width() / 10;
        int iWidth2 = rectJ6.width() / 2;
        int iHeight = rectJ6.height() / 2;
        Rect rect = new Rect(iWidth2 - iWidth, iHeight - iWidth, iWidth2 + iWidth, iWidth + iHeight);
        return new ky(rectJ6.width(), rectJ6.height(), 0, by.j6().XL(), false, false, iWidth2, iHeight, iWidth2, iHeight, new ly(rectJ6, false, market.getPackageName(), true), new ly(rect, true, "Install " + by.j6().u7(), false));
    }

    private ky FH(UserInputAction userInputAction) {
        Rect rectJ6 = c00.j6();
        Rect rectDW = c00.DW(userInputAction.getActivity());
        Rect rectV5 = c00.v5(userInputAction.getWindow());
        int iWidth = rectJ6.width();
        int iHeight = rectJ6.height();
        int iDW = by.j6().DW();
        boolean zXL = by.j6().XL();
        boolean zIsBackKey = userInputAction.isBackKey();
        boolean z = !userInputAction.isBackKey();
        ly[] lyVarArr = new ly[2];
        lyVarArr[0] = new ly(rectDW, false, by.j6().J0(userInputAction.getActivity()), true);
        lyVarArr[1] = userInputAction.getWindow().getType() != 0 ? new ly(rectV5, true, by.j6().J0(userInputAction.getWindow()), true) : null;
        return new ky(iWidth, iHeight, iDW, zXL, zIsBackKey, z, 0, 0, 0, 0, lyVarArr);
    }

    private ky Hw(UserLaunchAction userLaunchAction) {
        Rect rectJ6 = c00.j6();
        int iWidth = rectJ6.width() / 10;
        int iWidth2 = rectJ6.width() / 2;
        int iHeight = rectJ6.height() / 2;
        return new ky(rectJ6.width(), rectJ6.height(), 0, by.j6().XL(), false, false, iWidth2, iHeight, iWidth2, iHeight, new ly(new Rect(iWidth2 - iWidth, iHeight - iWidth, iWidth2 + iWidth, iWidth + iHeight), true, by.j6().J0(userLaunchAction.getActivity()), false));
    }

    private void J8(String str, hz hzVar) {
        if (this.DW.size() < 20) {
            if (nz.DW(str)) {
                this.DW.put(str, hzVar);
                return;
            }
            throw new RuntimeException("Invalid parameter name " + str);
        }
    }

    private ky Zo(UserTouchAction userTouchAction) {
        Rect rectJ6 = c00.j6();
        Rect rectDW = c00.DW(userTouchAction.getActivity());
        Rect rectV5 = c00.v5(userTouchAction.getWindow());
        Rect rectHw = c00.Hw(userTouchAction.getWidget());
        int iWidth = rectJ6.width();
        int iHeight = rectJ6.height();
        int iDW = by.j6().DW();
        boolean zXL = by.j6().XL();
        int x1 = userTouchAction.getX1() + rectV5.left;
        int y1 = userTouchAction.getY1() + rectV5.top;
        int x2 = userTouchAction.getX2() + rectV5.left;
        int y2 = userTouchAction.getY2() + rectV5.top;
        ly[] lyVarArr = new ly[3];
        lyVarArr[0] = new ly(rectDW, false, by.j6().J0(userTouchAction.getActivity()), true);
        lyVarArr[1] = userTouchAction.getWindow().getType() != 0 ? new ly(rectV5, true, by.j6().J0(userTouchAction.getWindow()), true) : null;
        lyVarArr[2] = new ly(rectHw, true, by.j6().J0(userTouchAction.getWidget()), false);
        return new ky(iWidth, iHeight, iDW, zXL, false, false, x1, y1, x2, y2, lyVarArr);
    }

    private ky j6(InAppProduct inAppProduct) {
        Rect rectJ6 = c00.j6();
        int iWidth = rectJ6.width() / 10;
        int iWidth2 = rectJ6.width() / 2;
        int iHeight = rectJ6.height() / 2;
        Rect rect = new Rect(iWidth2 - iWidth, iHeight - iWidth, iWidth2 + iWidth, iWidth + iHeight);
        return new ky(rectJ6.width(), rectJ6.height(), 0, by.j6().XL(), false, false, iWidth2, iHeight, iWidth2, iHeight, new ly(rectJ6, false, inAppProduct.getMarket().getPackageName(), true), new ly(rect, true, "Purchase " + by.j6().Zo(inAppProduct), false));
    }

    private ky v5(UserNotificationAction userNotificationAction) {
        Rect rectJ6 = c00.j6();
        Rect rect = new Rect(0, 0, rectJ6.right, rectJ6.height() / 10);
        return new ky(rectJ6.width(), rectJ6.height(), 0, by.j6().XL(), false, false, rect.width() / 2, rect.height() / 2, rect.width() / 2, rect.height() / 2, new ly(rect, true, by.j6().J0(userNotificationAction), false));
    }

    public jy EQ(boolean z) {
        this.FH = z;
        return this;
    }

    public jy J0(boolean z) {
        this.tp = true;
        return this;
    }

    public jy QX(Object obj) {
        if (obj instanceof ky) {
            this.J0 = (ky) obj;
        } else if (obj instanceof UserNotificationAction) {
            this.J0 = v5((UserNotificationAction) obj);
        } else if (obj instanceof UserTouchAction) {
            this.J0 = Zo((UserTouchAction) obj);
        } else if (obj instanceof UserInputAction) {
            this.J0 = FH((UserInputAction) obj);
        } else if (obj instanceof UserLaunchAction) {
            this.J0 = Hw((UserLaunchAction) obj);
        } else if (obj instanceof InAppProduct) {
            this.J0 = j6((InAppProduct) obj);
        } else if (obj instanceof Market) {
            this.J0 = DW((Market) obj);
        }
        return this;
    }

    public jy VH(Throwable th, boolean z) {
        this.J8 = th;
        this.VH = z;
        this.gn = true;
        this.Ws = zy.lp().OW(th);
        XL(th);
        return this;
    }

    public jy Ws(String str, Object obj) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() > 0) {
                    J8(str, hz.Hw(obj.toString()));
                }
            } else if (obj instanceof Enum) {
                J8(str, hz.Hw(obj.toString()));
            } else if (obj instanceof Integer) {
                J8(str, hz.FH(((Integer) obj).longValue()));
            } else if (obj instanceof Short) {
                J8(str, hz.FH(((Short) obj).longValue()));
            } else if (obj instanceof Byte) {
                J8(str, hz.FH(((Byte) obj).longValue()));
            } else if (obj instanceof Character) {
                J8(str, hz.FH(((Character) obj).charValue()));
            } else if (obj instanceof Long) {
                J8(str, hz.FH(((Long) obj).longValue()));
            } else if (obj instanceof Float) {
                J8(str, hz.DW(((Float) obj).doubleValue()));
            } else if (obj instanceof Double) {
                J8(str, hz.DW(((Double) obj).doubleValue()));
            } else if (obj instanceof Boolean) {
                J8(str, hz.j6(((Boolean) obj).booleanValue()));
            } else {
                String strZo = by.j6().Zo(obj);
                if (strZo != null) {
                    J8(str, hz.Hw(strZo.toString()));
                }
            }
        }
        return this;
    }

    public jy XL(Object obj) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() > 0) {
                    this.j6 = obj.toString();
                }
            } else if ((obj instanceof Enum) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Boolean)) {
                this.j6 = obj.toString();
            } else {
                String strZo = by.j6().Zo(obj);
                if (strZo != null) {
                    this.j6 = strZo.toString();
                }
            }
        }
        return this;
    }

    public void aM(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(1);
        dataOutputStream.writeBoolean(this.j6 != null);
        String str = this.j6;
        if (str != null) {
            dataOutputStream.writeUTF(str);
        }
        dataOutputStream.writeInt(this.DW.size());
        for (Map.Entry<String, hz> entry : this.DW.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            hz value = entry.getValue();
            if (value.j6 != null) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeUTF(value.j6);
            } else if (value.DW != null) {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeLong(value.DW.longValue());
            } else if (value.FH != null) {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeDouble(value.FH.doubleValue());
            } else if (value.Hw != null) {
                dataOutputStream.writeInt(3);
                dataOutputStream.writeBoolean(value.Hw.booleanValue());
            }
        }
        dataOutputStream.writeBoolean(this.EQ);
        dataOutputStream.writeBoolean(this.FH);
        dataOutputStream.writeBoolean(this.u7);
        dataOutputStream.writeBoolean(this.Hw);
        dataOutputStream.writeBoolean(this.tp);
        dataOutputStream.writeBoolean(this.v5 != null);
        String str2 = this.v5;
        if (str2 != null) {
            dataOutputStream.writeUTF(str2);
        }
        dataOutputStream.writeLong(this.Zo);
        dataOutputStream.writeBoolean(this.gn);
        dataOutputStream.writeBoolean(this.VH);
    }

    public jy gn(boolean z) {
        this.u7 = z;
        return this;
    }

    public String toString() {
        try {
            return new gz(this).j6().toString();
        } catch (JSONException unused) {
            return "invalid";
        }
    }

    public jy tp(boolean z) {
        this.Hw = z;
        return this;
    }

    public jy u7(boolean z, boolean z2) {
        this.EQ = z;
        this.we = z2;
        return this;
    }

    public jy we(long j, CharSequence charSequence) {
        this.tp = true;
        this.Zo = j;
        this.v5 = charSequence == null ? null : charSequence.toString();
        return this;
    }

    public jy(DataInputStream dataInputStream) throws IOException {
        if (dataInputStream.readInt() == 1) {
            if (dataInputStream.readBoolean()) {
                this.j6 = dataInputStream.readUTF();
            }
            int i = dataInputStream.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                String utf = dataInputStream.readUTF();
                int i3 = dataInputStream.readInt();
                if (i3 == 0) {
                    J8(utf, hz.Hw(dataInputStream.readUTF()));
                } else if (i3 == 1) {
                    J8(utf, hz.FH(dataInputStream.readLong()));
                } else if (i3 == 2) {
                    J8(utf, hz.DW(dataInputStream.readDouble()));
                } else if (i3 == 3) {
                    J8(utf, hz.j6(dataInputStream.readBoolean()));
                }
            }
            this.EQ = dataInputStream.readBoolean();
            this.FH = dataInputStream.readBoolean();
            this.u7 = dataInputStream.readBoolean();
            this.Hw = dataInputStream.readBoolean();
            this.tp = dataInputStream.readBoolean();
            if (dataInputStream.readBoolean()) {
                this.v5 = dataInputStream.readUTF();
            }
            this.Zo = dataInputStream.readLong();
            this.gn = dataInputStream.readBoolean();
            this.VH = dataInputStream.readBoolean();
            return;
        }
        throw new IOException();
    }
}
