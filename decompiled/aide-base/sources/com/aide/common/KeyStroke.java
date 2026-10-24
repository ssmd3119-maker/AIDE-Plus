package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = -664295398846055440L, container = -664295398846055440L, user = true)
/* loaded from: classes.dex */
public class KeyStroke {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 1685610015466982760L)
    private boolean isAltPressed;

    @dy(field = 945948109527955456L)
    private boolean isCtrlPressed;

    @dy(field = 2052865788647426077L)
    private boolean isShiftPressed;

    @dy(field = -248795108199589435L)
    private int keyCode;

    @dy(field = 1569918895593984708L)
    private char unicodeChar;

    static {
        iy.Zo(KeyStroke.class);
    }

    @ey(method = 3208190204664111865L)
    public KeyStroke(int i, char c, boolean z, boolean z2, boolean z3) {
        try {
            if (Zo) {
                iy.J8(-155828606081124015L, null, new Integer(i), new Character(c), new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            this.unicodeChar = c;
            this.keyCode = i;
            this.isShiftPressed = z;
            this.isCtrlPressed = z2;
            this.isAltPressed = z3;
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -155828606081124015L, null, new Integer(i), new Character(c), new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            throw th;
        }
    }

    @ey(method = -5169375836427724992L)
    private String DW() {
        try {
            if (Zo) {
                iy.gn(2792074058462256339L, this);
            }
            int i = this.keyCode;
            if (i == -1) {
                return Character.toUpperCase(this.unicodeChar) + "";
            }
            if (i == 164) {
                return "VolMute";
            }
            if (i == 24) {
                return "VolUp";
            }
            if (i == 25) {
                return "VolDown";
            }
            if (i == 61) {
                return "Tab";
            }
            if (i == 62) {
                return "Space";
            }
            if (i == 66) {
                return "Enter";
            }
            if (i == 67) {
                return "Backspace";
            }
            if (i == 92) {
                return "PgUp";
            }
            if (i == 93) {
                return "PgDown";
            }
            if (i == 122) {
                return "Home";
            }
            if (i == 123) {
                return "End";
            }
            switch (i) {
                case 19:
                    return "Up";
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    return "Down";
                case 21:
                    return "Left";
                case 22:
                    return "Right";
                default:
                    String strTrim = (KeyCharacterMap.load(0).getDisplayLabel(this.keyCode) + "").trim();
                    if (strTrim.length() > 0) {
                        return strTrim;
                    }
                    String lowerCase = KeyEvent.keyCodeToString(this.keyCode).toLowerCase();
                    if (lowerCase.startsWith("keycode_")) {
                        lowerCase = lowerCase.substring(8);
                    }
                    String strReplace = lowerCase.replace("_", " ");
                    return strReplace.substring(0, 1).toUpperCase() + strReplace.substring(1);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2792074058462256339L, this);
            }
            throw th;
        }
    }

    @ey(method = 2887470759955841612L)
    public static KeyStroke parse(String str) {
        try {
            if (Zo) {
                iy.tp(-2537502731119537559L, null, str);
            }
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != 5) {
                return null;
            }
            return new KeyStroke(Integer.parseInt(strArrSplit[0]), (char) Integer.parseInt(strArrSplit[1]), Boolean.parseBoolean(strArrSplit[2]), Boolean.parseBoolean(strArrSplit[3]), Boolean.parseBoolean(strArrSplit[4]));
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2537502731119537559L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 59546981750642520L)
    public boolean Hw() {
        try {
            if (Zo) {
                iy.gn(1957728969498150387L, this);
            }
            return this.unicodeChar != 65535;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 1957728969498150387L, this);
            }
            throw th;
        }
    }

    @ey(method = 466538884512104855L)
    public boolean equalsKeyStroke(KeyStroke keyStroke) {
        try {
            if (Zo) {
                iy.tp(-437635320464540300L, this, keyStroke);
            }
            if (this.isAltPressed != keyStroke.isAltPressed || this.isCtrlPressed != keyStroke.isCtrlPressed || this.isShiftPressed != keyStroke.isShiftPressed) {
                return false;
            }
            if (this.keyCode != -1 && this.keyCode == keyStroke.keyCode) {
                return true;
            }
            if (this.unicodeChar != 65535) {
                if (this.unicodeChar == keyStroke.unicodeChar) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -437635320464540300L, this, keyStroke);
            }
            throw th;
        }
    }

    @ey(method = -1095195720720759960L)
    public int getKeyCode() {
        try {
            if (Zo) {
                iy.gn(2685244385518823983L, this);
            }
            return this.keyCode;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2685244385518823983L, this);
            }
            throw th;
        }
    }

    @ey(method = -762356706806632000L)
    public char getUnicodeChar() {
        try {
            if (Zo) {
                iy.gn(-503879727728061657L, this);
            }
            return this.unicodeChar;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -503879727728061657L, this);
            }
            throw th;
        }
    }

    @ey(method = 2404395168611157265L)
    public String toParse() {
        try {
            if (Zo) {
                iy.gn(-808465392394113792L, this);
            }
            return this.keyCode + "," + ((int) this.unicodeChar) + "," + this.isShiftPressed + "," + this.isCtrlPressed + "," + this.isAltPressed;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -808465392394113792L, this);
            }
            throw th;
        }
    }

    @ey(method = -1628948572965685560L)
    public String toString() {
        try {
            if (Zo) {
                iy.gn(-2418983212377143529L, this);
            }
            String str = "";
            if (this.isShiftPressed) {
                str = "Shift+";
            }
            if (this.isCtrlPressed) {
                str = str + "Ctrl+";
            }
            if (this.isAltPressed) {
                str = str + "Alt+";
            }
            return str + DW();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -2418983212377143529L, this);
            }
            throw th;
        }
    }

    @ey(method = 4523599024989018384L)
    public KeyStroke(int i, boolean z, boolean z2, boolean z3) {
        try {
            if (Zo) {
                iy.J0(512710817818247784L, null, new Integer(i), new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            this.unicodeChar = (char) 65535;
            this.keyCode = i;
            this.isShiftPressed = z;
            this.isCtrlPressed = z2;
            this.isAltPressed = z3;
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 512710817818247784L, null, new Integer(i), new Boolean(z), new Boolean(z2), new Boolean(z3));
            }
            throw th;
        }
    }
}
