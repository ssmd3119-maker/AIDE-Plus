package abcd;

import com.probelytics.api.UserTouchAction;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a00 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Class<?> DW(String str) throws ClassNotFoundException {
        if (str.startsWith("[")) {
            return Class.forName(str.replace('/', '.'));
        }
        char c = 65535;
        int iHashCode = str.hashCode();
        if (iHashCode != 70) {
            if (iHashCode != 83) {
                if (iHashCode != 86) {
                    if (iHashCode != 90) {
                        if (iHashCode != 73) {
                            if (iHashCode != 74) {
                                switch (iHashCode) {
                                    case 66:
                                        if (str.equals("B")) {
                                            c = 4;
                                            break;
                                        }
                                        break;
                                    case 67:
                                        if (str.equals("C")) {
                                            c = 5;
                                            break;
                                        }
                                        break;
                                    case 68:
                                        if (str.equals("D")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                }
                            } else if (str.equals("J")) {
                                c = 1;
                            }
                        } else if (str.equals("I")) {
                            c = 3;
                        }
                    } else if (str.equals("Z")) {
                        c = '\b';
                    }
                } else if (str.equals("V")) {
                    c = 2;
                }
            } else if (str.equals("S")) {
                c = 7;
            }
        } else if (str.equals("F")) {
            c = 6;
        }
        switch (c) {
            case 0:
                return Double.TYPE;
            case 1:
                return Long.TYPE;
            case 2:
                return Void.TYPE;
            case 3:
                return Integer.TYPE;
            case 4:
                return Byte.TYPE;
            case 5:
                return Character.TYPE;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return Float.TYPE;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return Short.TYPE;
            case '\b':
                return Boolean.TYPE;
            default:
                if (str.startsWith("L")) {
                    return Class.forName(str.substring(1, str.length() - 1).replace('/', '.'));
                }
                throw new ClassNotFoundException();
        }
    }

    public static Field FH(String str) {
        String[] strArrSplit = str.split(" ");
        return Zo(strArrSplit[0]).getDeclaredField(strArrSplit[1]);
    }

    public static Method Hw(String str) {
        String[] strArrSplit = str.split(" ");
        return Zo(strArrSplit[0]).getDeclaredMethod(strArrSplit[1], v5(strArrSplit[2]));
    }

    private static List<String> VH(String str) {
        char cCharAt;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 < str.length() && (cCharAt = str.charAt(i2)) != ')') {
            while (cCharAt == '[') {
                i2++;
                cCharAt = str.charAt(i2);
            }
            if (cCharAt == 'F') {
                i = i2 + 1;
                arrayList.add(str.substring(i3, i));
                i3 = i;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'V' && cCharAt != 'Z' && cCharAt != 'I' && cCharAt != 'J') {
                    switch (cCharAt) {
                    }
                }
                i = i2 + 1;
                arrayList.add(str.substring(i3, i));
                i3 = i;
            } else {
                while (cCharAt != ';') {
                    i2++;
                    cCharAt = str.charAt(i2);
                }
                i = i2 + 1;
                arrayList.add(str.substring(i3, i));
                i3 = i;
            }
            i2++;
        }
        return arrayList;
    }

    public static Class<?> Zo(String str) {
        return Class.forName(str.replace('/', '.'));
    }

    public static Constructor j6(String str) {
        String[] strArrSplit = str.split(" ");
        return Zo(strArrSplit[0]).getDeclaredConstructor(v5(strArrSplit[2]));
    }

    private static Class<?>[] v5(String str) {
        List<String> listVH = VH(str);
        Class<?>[] clsArr = new Class[listVH.size()];
        for (int i = 0; i < listVH.size(); i++) {
            clsArr[i] = DW(listVH.get(i));
        }
        return clsArr;
    }
}
