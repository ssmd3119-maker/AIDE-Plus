package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.R;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.widget.TextView;

@cy(clazz = -5375977708608822133L, container = -5375977708608822133L, user = true)
/* loaded from: classes.dex */
public class ProxyTextView {

    @fy
    private static /* synthetic */ boolean $ON_ENTER_TOGGLE = false;

    @gy
    private static /* synthetic */ boolean $ON_THROW_TOGGLE = false;

    @dy(field = -3739127714624225124L)
    public static final int INPUTTYPE_date = 20;

    @dy(field = -6671079073425115855L)
    public static final int INPUTTYPE_datetime = 4;

    @dy(field = -3720943957822606384L)
    public static final int INPUTTYPE_none = 0;

    @dy(field = -1343514920664841001L)
    public static final int INPUTTYPE_number = 2;

    @dy(field = -20087332946090712L)
    public static final int INPUTTYPE_numberDecimal = 8194;

    @dy(field = 334441524057497472L)
    public static final int INPUTTYPE_numberPassword = 18;

    @dy(field = -3079822673542379135L)
    public static final int INPUTTYPE_numberSigned = 4098;

    @dy(field = -4856672254762490000L)
    public static final int INPUTTYPE_phone = 3;

    @dy(field = -3710144148287796345L)
    public static final int INPUTTYPE_text = 1;

    @dy(field = -1400892430614461379L)
    public static final int INPUTTYPE_textAutoComplete = 65537;

    @dy(field = 581045854099528608L)
    public static final int INPUTTYPE_textAutoCorrect = 32769;

    @dy(field = -1524939953757151845L)
    public static final int INPUTTYPE_textCapCharacters = 4097;

    @dy(field = 1313782477349130325L)
    public static final int INPUTTYPE_textCapSentences = 16385;

    @dy(field = -3643407736568661408L)
    public static final int INPUTTYPE_textCapWords = 8193;

    @dy(field = 1226140216814760625L)
    public static final int INPUTTYPE_textEmailAddress = 33;

    @dy(field = 634373885773230015L)
    public static final int INPUTTYPE_textEmailSubject = 49;

    @dy(field = -6047203081020656391L)
    public static final int INPUTTYPE_textFilter = 177;

    @dy(field = -827317788247971355L)
    public static final int INPUTTYPE_textImeMultiLine = 262145;

    @dy(field = -503744835283452144L)
    public static final int INPUTTYPE_textLongMessage = 81;

    @dy(field = 2534607734011848L)
    public static final int INPUTTYPE_textMultiLine = 131073;

    @dy(field = -1445598330982267963L)
    public static final int INPUTTYPE_textNoSuggestions = 524289;

    @dy(field = 2296614499940070576L)
    public static final int INPUTTYPE_textPassword = 129;

    @dy(field = -458420944509606033L)
    public static final int INPUTTYPE_textPersonName = 97;

    @dy(field = 1883680670535161869L)
    public static final int INPUTTYPE_textPhonetic = 193;

    @dy(field = 675330638172246420L)
    public static final int INPUTTYPE_textPostalAddress = 113;

    @dy(field = -514221989526944296L)
    public static final int INPUTTYPE_textShortMessage = 65;

    @dy(field = -1573689902011343025L)
    public static final int INPUTTYPE_textUri = 17;

    @dy(field = -67977750133910980L)
    public static final int INPUTTYPE_textVisiblePassword = 145;

    @dy(field = 581883529873396400L)
    public static final int INPUTTYPE_textWebEditText = 161;

    @dy(field = -1820143355193033325L)
    public static final int INPUTTYPE_textWebEmailAddress = 209;

    @dy(field = -1023546198190035256L)
    public static final int INPUTTYPE_textWebPassword = 225;

    @dy(field = -3707507884485410819L)
    public static final int INPUTTYPE_time = 36;

    @dy(field = -2211578826084791889L)
    public static final int TEXTSTYLE_bold = 1;

    @dy(field = -5475920314197683704L)
    public static final int TEXTSTYLE_italic = 2;

    @dy(field = -5440166162427317915L)
    public static final int TEXTSTYLE_normal = 0;

    @dy(field = -6736966113393391456L)
    public static final int TYPEFACE_MONOSPACE = 3;

    @dy(field = 2432917122562277456L)
    public static final int TYPEFACE_NORMAL = 0;

    @dy(field = 512618338420641024L)
    public static final int TYPEFACE_SANS = 1;

    @dy(field = -4845783690199734824L)
    public static final int TYPEFACE_SERIF = 2;

    @dy(field = 4149160874193538224L)
    private String fontFamily;

    @dy(field = 616091265205813440L)
    private int shadowColor;

    @dy(field = -542160383735676321L)
    private float shadowDx;

    @dy(field = -542180264062047188L)
    private float shadowDy;

    @dy(field = 75038886499218565L)
    private float shadowRadius;

    @dy(field = 3936653544795519039L)
    private int textStyle;

    @dy(field = 1114182159852556095L)
    private final TextView textView;

    @dy(field = -3767622177120399040L)
    private int typeface;

    static {
        iy.Zo(ProxyTextView.class);
    }

    @ey(method = 145725929527161139L)
    public ProxyTextView(Object obj) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(4721523080228235281L, null, obj);
            }
            this.textStyle = 0;
            this.typeface = 0;
            this.fontFamily = null;
            this.textView = (TextView) obj;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 4721523080228235281L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = -2322562414379709480L)
    private void updateFont() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(2804984903332667520L, this);
            }
            Typeface typefaceCreate = null;
            if (this.fontFamily != null && (typefaceCreate = Typeface.create(this.fontFamily, this.textStyle)) != null) {
                this.textView.setTypeface(typefaceCreate);
                return;
            }
            int i = this.typeface;
            if (i == 1) {
                typefaceCreate = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typefaceCreate = Typeface.SERIF;
            } else if (i == 3) {
                typefaceCreate = Typeface.MONOSPACE;
            }
            this.textView.setTypeface(typefaceCreate, this.textStyle);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 2804984903332667520L, this);
            }
            throw th;
        }
    }

    @ey(method = 2868955313219629887L)
    private void updateShadow() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(1633312049847453773L, this);
            }
            this.textView.setShadowLayer(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 1633312049847453773L, this);
            }
            throw th;
        }
    }

    @ey(method = -1884470476836826809L)
    public void setFontFamily(String str) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(1376903751989791145L, this, str);
            }
            this.fontFamily = str;
            updateFont();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 1376903751989791145L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -3696031607819609047L)
    public void setInputType(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(1552715290254418575L, this, i);
            }
            this.textView.setInputType(i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 1552715290254418575L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3721995134380688448L)
    public void setShadowColor(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-225661509693822000L, this, i);
            }
            this.shadowColor = i;
            updateShadow();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -225661509693822000L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 387586240970165831L)
    public void setShadowDx(float f) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(485594391053453937L, this, new Float(f));
            }
            this.shadowDx = f;
            updateShadow();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 485594391053453937L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = 703413929770416528L)
    public void setShadowDy(float f) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(776903302272531700L, this, new Float(f));
            }
            this.shadowDy = f;
            updateShadow();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 776903302272531700L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = -4318750521609743583L)
    public void setShadowRadius(float f) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(1152852753033808827L, this, new Float(f));
            }
            this.shadowRadius = f;
            updateShadow();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 1152852753033808827L, this, new Float(f));
            }
            throw th;
        }
    }

    @ey(method = 1622781706205963625L)
    public void setTextAppearance(String str) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(4133757139095467195L, this, str);
            }
            try {
                if (!str.startsWith("?android:attr/")) {
                    if (str.startsWith("@android:style/")) {
                        this.textView.setTextAppearance(this.textView.getContext(), ((Integer) R.style.class.getField(str.substring(15).replace(".", "_")).get(null)).intValue());
                        return;
                    }
                    return;
                }
                int iIntValue = ((Integer) R.attr.class.getField(str.substring(14)).get(null)).intValue();
                Resources.Theme theme = this.textView.getContext().getTheme();
                TypedValue typedValue = new TypedValue();
                if (theme.resolveAttribute(iIntValue, typedValue, true)) {
                    this.textView.setTextAppearance(this.textView.getContext(), typedValue.data);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 4133757139095467195L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -104907901205194419L)
    public void setTextStyle(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-2536269416424164421L, this, i);
            }
            this.textStyle = i;
            updateFont();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -2536269416424164421L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2302235756383959088L)
    public void setTypeface(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(2258561952224161920L, this, i);
            }
            this.typeface = i;
            updateFont();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2258561952224161920L, this, new Integer(i));
            }
            throw th;
        }
    }
}
