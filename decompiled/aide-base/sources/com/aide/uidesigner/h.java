package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.Comparator;

@cy(clazz = -175704537702267603L, container = -175704537702267603L, user = true)
/* loaded from: classes.dex */
public class h {

    @dy(field = 313867065895817588L)
    public static b DW;

    @gy
    private static /* synthetic */ boolean EQ;

    @dy(field = 940858590407185200L)
    public static b FH;

    @dy(field = 873744032949344568L)
    public static b Hw;

    @dy(field = -3517488274938762560L)
    public static b[] VH;

    @dy(field = 4120338002207388000L)
    public static b Zo;

    @dy(field = 1968849883148675347L)
    public static b[] gn;

    @dy(field = 1681543503163195875L)
    public static b j6;

    @fy
    private static /* synthetic */ boolean tp;

    @dy(field = 847557478787765165L)
    public static b[] u7;

    @dy(field = 2237326645674898423L)
    public static b v5;

    @cy(clazz = 2361452621816598336L, container = -175704537702267603L, user = true)
    static class a implements Comparator<b> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -2354856990748528233L)
        a() {
        }

        @Override // java.util.Comparator
        @ey(method = 3490068158378061936L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            try {
                if (WB) {
                    iy.EQ(-5995427104692423916L, this, bVar, bVar2);
                }
                return bVar.DW().compareTo(bVar2.DW());
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, -5995427104692423916L, this, bVar, bVar2);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = -1149471427977011408L, container = -1149471427977011408L, user = true)
    public static final class c {

        @dy(field = 955373488105720481L)
        public static final c Bool;

        @dy(field = -1298492440974870180L)
        public static final c Color;

        @dy(field = -2687710090650839985L)
        public static final c Drawable;

        @dy(field = -3146859652830196023L)
        public static final c DrawableResource;

        @dy(field = 2315077216418350160L)
        public static final c EnumConstant;

        @dy(field = -1216660688714604485L)
        public static final c Event;

        @dy(field = -1189109111234956051L)
        public static final c Float;

        @dy(field = 267820482300428288L)
        public static final c FloatSize;

        @dy(field = -1390948359384006280L)
        public static final c ID;

        @dy(field = -123629576258192004L)
        public static final c Int;

        @dy(field = -3639723532499052152L)
        public static final c IntConstant;

        @dy(field = -314634741236510832L)
        public static final c LayoutSize;

        @dy(field = 977428489058115736L)
        public static final c Size;

        @dy(field = 978552999956289472L)
        public static final c Text;

        @dy(field = -4377196815993585232L)
        public static final c TextAppearance;

        @dy(field = 2482589899852003233L)
        public static final c TextSize;

        @gy
        private static /* synthetic */ boolean e3;

        @fy
        private static /* synthetic */ boolean eU;

        @dy(field = 1812359530594179581L)
        private static final /* synthetic */ c[] iW;

        @dy(field = 2220168502004938604L)
        public Class<?> WB;

        static {
            try {
                iy.Zo(c.class);
                if (eU) {
                    iy.gn(80118439023638048L, null);
                }
                IntConstant = new c("IntConstant", 0, Integer.TYPE);
                EnumConstant = new c("EnumConstant", 1, Enum.class);
                LayoutSize = new c("LayoutSize", 2, Integer.TYPE);
                Size = new c("Size", 3, Integer.TYPE);
                FloatSize = new c("FloatSize", 4, Float.TYPE);
                TextSize = new c("TextSize", 5, Float.TYPE);
                Text = new c("Text", 6, CharSequence.class);
                Float = new c("Float", 7, Float.TYPE);
                Int = new c("Int", 8, Integer.TYPE);
                Bool = new c("Bool", 9, Boolean.TYPE);
                ID = new c("ID", 10, Integer.TYPE);
                Color = new c("Color", 11, Integer.TYPE);
                Drawable = new c("Drawable", 12, Drawable.class);
                DrawableResource = new c("DrawableResource", 13, Drawable.class);
                TextAppearance = new c("TextAppearance", 14, String.class);
                c cVar = new c("Event", 15, CharSequence.class);
                Event = cVar;
                iW = new c[]{IntConstant, EnumConstant, LayoutSize, Size, FloatSize, TextSize, Text, Float, Int, Bool, ID, Color, Drawable, DrawableResource, TextAppearance, cVar};
            } catch (Throwable th) {
                if (e3) {
                    iy.aM(th, 80118439023638048L, null);
                }
                throw th;
            }
        }

        @ey(method = -1160534526134951237L)
        private c(String str, int i, Class cls) {
            try {
                if (eU) {
                    iy.we(-561141030887734896L, null, str, new Integer(i), cls);
                }
                this.WB = cls;
            } catch (Throwable th) {
                if (e3) {
                    iy.U2(th, -561141030887734896L, null, str, new Integer(i), cls);
                }
                throw th;
            }
        }

        @ey(method = -514740899914422048L)
        public static c valueOf(String str) {
            try {
                if (eU) {
                    iy.tp(325563542140011648L, null, str);
                }
                return (c) Enum.valueOf(c.class, str);
            } catch (Throwable th) {
                if (e3) {
                    iy.j3(th, 325563542140011648L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 1942967860468163832L)
        public static c[] values() {
            try {
                if (eU) {
                    iy.gn(-1334633246407245488L, null);
                }
                return (c[]) iW.clone();
            } catch (Throwable th) {
                if (e3) {
                    iy.aM(th, -1334633246407245488L, null);
                }
                throw th;
            }
        }
    }

    static {
        String str;
        try {
            iy.Zo(h.class);
            if (tp) {
                str = "android.widget.RatingBar";
                iy.gn(-3156958742737719715L, null);
            } else {
                str = "android.widget.RatingBar";
            }
            j6 = new b("android.widget.RelativeLayout$LayoutParams", "layout_toRightOf", "ProxyRelativeLayoutParams", "setRightOf()", c.ID);
            DW = new b("android.widget.RelativeLayout$LayoutParams", "layout_toLeftOf", "ProxyRelativeLayoutParams", "setLeftOf()", c.ID);
            FH = new b("android.widget.RelativeLayout$LayoutParams", "layout_below", "ProxyRelativeLayoutParams", "setBelow()", c.ID);
            Hw = new b("android.widget.RelativeLayout$LayoutParams", "layout_above", "ProxyRelativeLayoutParams", "setAbove()", c.ID);
            v5 = new b("android.view.ViewGroup$LayoutParams", "layout_width", "width", c.LayoutSize);
            b bVar = new b("android.view.ViewGroup$LayoutParams", "layout_height", "height", c.LayoutSize);
            Zo = bVar;
            VH = new b[]{v5, bVar, new b("android.view.ViewGroup$MarginLayoutParams", "layout_margin", "ProxyMarginLayoutParams", "setMargin()", c.Size), new b("android.view.ViewGroup$MarginLayoutParams", "layout_marginLeft", "leftMargin", c.Size), new b("android.view.ViewGroup$MarginLayoutParams", "layout_marginRight", "rightMargin", c.Size), new b("android.view.ViewGroup$MarginLayoutParams", "layout_marginTop", "topMargin", c.Size), new b("android.view.ViewGroup$MarginLayoutParams", "layout_marginBottom", "bottomMargin", c.Size), new b("android.view.ViewGroup$MarginLayoutParams", "layout_marginStart", "setMarginStart()", c.Size), new b("android.view.ViewGroup$MarginLayoutParams", "layout_marginEnd", "setMarginEnd()", c.Size), new b("android.widget.LinearLayout$LayoutParams", "layout_gravity", "gravity", c.IntConstant, "android.view.Gravity", null), new b("android.widget.LinearLayout$LayoutParams", "layout_weight", "weight", c.Float), FH, Hw, j6, DW, new b("android.widget.RelativeLayout$LayoutParams", "layout_toEndOf", "ProxyRelativeLayoutParams", "setEndOf()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_toStartOf", "ProxyRelativeLayoutParams", "setStartOf()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignBaseline", "ProxyRelativeLayoutParams", "setAlignBaseline()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignBottom", "ProxyRelativeLayoutParams", "setAlignBottom()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignTop", "ProxyRelativeLayoutParams", "setAlignTop()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignEnd", "ProxyRelativeLayoutParams", "setAlignEnd()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignStart", "ProxyRelativeLayoutParams", "setAlignStart()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignRight", "ProxyRelativeLayoutParams", "setAlignRight()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignLeft", "ProxyRelativeLayoutParams", "setAlignLeft()", c.ID), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignParentBottom", "ProxyRelativeLayoutParams", "setAlignParentBottom()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignParentEnd", "ProxyRelativeLayoutParams", "setAlignParentEnd()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignParentLeft", "ProxyRelativeLayoutParams", "setAlignParentLeft()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignParentRight", "ProxyRelativeLayoutParams", "setAlignParentRight()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignParentStart", "ProxyRelativeLayoutParams", "setAlignParentStart()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_alignParentTop", "ProxyRelativeLayoutParams", "setAlignParentTop()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_centerHorizontal", "ProxyRelativeLayoutParams", "setCenterHorizontal()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_centerVertical", "ProxyRelativeLayoutParams", "setCenterVertical()", c.Bool), new b("android.widget.RelativeLayout$LayoutParams", "layout_centerInParent", "ProxyRelativeLayoutParams", "setCenterInParent()", c.Bool), new b("android.widget.GridLayout$LayoutParams", "layout_gravity", "ProxyGridLayoutParams", "setGravity()", c.IntConstant, "android.view.Gravity", null), new b("android.widget.GridLayout$LayoutParams", "layout_column", "ProxyGridLayoutParams", "setColumn()", c.Int), new b("android.widget.GridLayout$LayoutParams", "layout_columnSpan", "ProxyGridLayoutParams", "setColumnSpan()", c.Int), new b("android.widget.GridLayout$LayoutParams", "layout_row", "ProxyGridLayoutParams", "setRow()", c.Int), new b("android.widget.GridLayout$LayoutParams", "layout_rowSpan", "ProxyGridLayoutParams", "setRowSpan()", c.Int), new b("android.widget.FrameLayout$LayoutParams", "layout_gravity", "gravity", c.IntConstant, "android.view.Gravity", null), new b("android.widget.TableRow$LayoutParams", "layout_span", "span", c.Int), new b("android.widget.TableRow$LayoutParams", "layout_column", "column", c.Int), new b("android.widget.AbsoluteLayout$LayoutParams", "layout_x", "x", c.Size), new b("android.widget.AbsoluteLayout$LayoutParams", "layout_y", "y", c.Size)};
            String str2 = str;
            b[] bVarArr = {new b("android.view.View", "padding", "ProxyViewPaddings", "setPadding()", c.Size), new b("android.view.View", "paddingLeft", "ProxyViewPaddings", "setPaddingLeft()", c.Size), new b("android.view.View", "paddingRight", "ProxyViewPaddings", "setPaddingRight()", c.Size), new b("android.view.View", "paddingTop", "ProxyViewPaddings", "setPaddingTop()", c.Size), new b("android.view.View", "paddingBottom", "ProxyViewPaddings", "setPaddingBottom()", c.Size), new b("android.view.View", "paddingStart", "ProxyViewPaddings", "setPaddingStart()", c.Size), new b("android.view.View", "paddingEnd", "ProxyViewPaddings", "setPaddingEnd()", c.Size), new b("android.view.View", "alpha", "setAlpha()", c.Float), new b("android.view.View", "scaleX", "setScaleX()", c.Float), new b("android.view.View", "scaleY", "setScaleY()", c.Float), new b("android.view.View", "translationX", "setTranslationX()", c.FloatSize), new b("android.view.View", "translationY", "setTranslationY()", c.FloatSize), new b("android.view.View", "translationZ", "setTranslationZ()", c.FloatSize), new b("android.view.View", "rotation", "setRotation()", c.Float), new b("android.view.View", "rotationX", "setRotationX()", c.Float), new b("android.view.View", "rotationY", "setRotationY()", c.Float), new b("android.view.View", "elevation", "setElevation()", c.FloatSize), new b("android.view.View", "minHeight", "setMinimumHeight()", c.Size), new b("android.view.View", "minWidth", "setMinimumWidth()", c.Size), new b("android.view.View", "textAlignment", "setTextAlignment()", c.IntConstant, "android.view.View", "TEXT_ALIGNMENT"), new b("android.view.View", "visibility", "setVisibility()", c.IntConstant), new b("android.view.View", "background", "setBackgroundDrawable()", c.Drawable), new b("android.view.View", "onClick", "", c.Event), new b("android.view.ViewGroup", "clipChildren", "setClipChildren()", c.Bool), new b("android.view.ViewGroup", "clipToPadding", "setClipToPadding()", c.Bool), new b("android.widget.LinearLayout", "orientation", "setOrientation()", c.IntConstant), new b("android.widget.LinearLayout", "gravity", "setGravity()", c.IntConstant, "android.view.Gravity", null), new b("android.widget.LinearLayout", "baselineAligned", "setBaselineAligned()", c.Bool), new b("android.widget.LinearLayout", "baselineAlignedChildIndex", "setBaselineAlignedChildIndex()", c.Int), new b("android.widget.LinearLayout", "measureWithLargestChild", "setMeasureWithLargestChildEnabled()", c.Bool), new b("android.widget.LinearLayout", "weightSum", "setWeightSum()", c.Float), new b("android.widget.RelativeLayout", "gravity", "setGravity()", c.IntConstant, "android.view.Gravity", null), new b("android.widget.RelativeLayout", "ignoreGravity", "setIgnoreGravity()", c.ID), new b("android.widget.FrameLayout", "foregroundGravity", "setForegroundGravity()", c.IntConstant, "android.view.Gravity", null), new b("android.widget.FrameLayout", "measureAllChildren", "setMeasureAllChildren()", c.Bool), new b("android.widget.GridLayout", "columnCount", "setColumnCount()", c.Int), new b("android.widget.GridLayout", "rowCount", "setRowCount()", c.Int), new b("android.widget.GridLayout", "orientation", "setOrientation()", c.IntConstant), new b("android.widget.GridLayout", "columnOrderPreserved", "setColumnOrderPreserved()", c.Bool), new b("android.widget.GridLayout", "rowOrderPreserved", "setRowOrderPreserved()", c.Bool), new b("android.widget.GridLayout", "useDefaultMargins", "setUseDefaultMargins()", c.Bool), new b("android.widget.GridLayout", "alignmentMode", "setAlignmentMode()", c.IntConstant, "android.widget.GridLayout", "ALIGN"), new b("android.widget.TextView", "textAppearance", "ProxyTextView", "setTextAppearance()", c.TextAppearance), new b("android.widget.TextView", "text", "setText()", c.Text), new b("android.widget.TextView", "hint", "setHint()", c.Text), new b("android.widget.TextView", "height", "setHeight()", c.Size), new b("android.widget.TextView", "width", "setWidth()", c.Size), new b("android.widget.TextView", "maxHeight", "setMaxHeight()", c.Size), new b("android.widget.TextView", "maxWidth", "setMaxWidth()", c.Size), new b("android.widget.TextView", "ems", "setEms()", c.Int), new b("android.widget.TextView", "minEms", "setMinEms()", c.Int), new b("android.widget.TextView", "maxEms", "setMaxEms()", c.Int), new b("android.widget.TextView", "gravity", "setGravity()", c.IntConstant, "android.view.Gravity", null), new b("android.widget.TextView", "textScaleX", "setTextScaleX()", c.Float), new b("android.widget.TextView", "textScaleY", "setTextScaleY()", c.Float), new b("android.widget.TextView", "textIsSelectable", "setTextIsSelectable()", c.Bool), new b("android.widget.TextView", "singleLine", "setSingleLine()", c.Bool), new b("android.widget.TextView", "lines", "setLines()", c.Int), new b("android.widget.TextView", "minLines", "setMinLines()", c.Int), new b("android.widget.TextView", "maxLines", "setMaxLines()", c.Int), new b("android.widget.TextView", "textColor", "setTextColor()", c.Color), new b("android.widget.TextView", "textColorHighlight", "setHighlightColor()", c.Color), new b("android.widget.TextView", "textColorHint", "setHintTextColor()", c.Color), new b("android.widget.TextView", "textColorLink", "setLinkTextColor()", c.Color), new b("android.widget.TextView", "ellipsize", "setEllipsize()", c.EnumConstant, "android.text.TextUtils$TruncateAt", null), new b("android.widget.TextView", "textStyle", "ProxyTextView", "setTextStyle()", c.IntConstant, "ProxyTextView", "TEXTSTYLE"), new b("android.widget.TextView", "typeface", "ProxyTextView", "setTypeface()", c.IntConstant, "ProxyTextView", "TYPEFACE"), new b("android.widget.TextView", "inputType", "ProxyTextView", "setInputType()", c.IntConstant, "ProxyTextView", "INPUTTYPE"), new b("android.widget.TextView", "textSize", "setTextSize()", c.TextSize), new b("android.widget.TextView", "shadowColor", "ProxyTextView", "setShadowColor()", c.Color), new b("android.widget.TextView", "shadowDx", "ProxyTextView", "setShadowDx()", c.Float), new b("android.widget.TextView", "shadowDy", "ProxyTextView", "setShadowDy()", c.Float), new b("android.widget.TextView", "shadowRadius", "ProxyTextView", "setShadowRadius()", c.Float), new b("android.widget.ScrollView", "fillViewport", "setFillViewport()", c.Bool), new b("android.widget.ImageView", "src", "setImageDrawable()", c.DrawableResource), new b("android.widget.ImageView", "scaleType", "setScaleType()", c.EnumConstant, "android.widget.ImageView$ScaleType", null), new b("android.widget.ImageView", "adjustViewBounds", "setAdjustViewBounds()", c.Bool), new b("android.widget.ImageView", "baseLine", "setBaseLine()", c.Size), new b("android.widget.ImageView", "baselineAlignBottom", "setBaselineAlignBottom()", c.Bool), new b("android.widget.ImageView", "cropToPadding", "setCropToPadding()", c.Bool), new b("android.widget.ImageView", "maxHeight", "setMaxHeight()", c.Size), new b("android.widget.ImageView", "maxWidth", "setMaxWidth()", c.Size), new b("android.widget.ProgressBar", "indeterminate", "setIndeterminate()", c.Bool), new b("android.widget.ProgressBar", "indeterminateOnly", "setIndeterminate()", c.Bool), new b("android.widget.ProgressBar", "indeterminateDrawable", "setIndeterminateDrawable()", c.DrawableResource), new b("android.widget.ProgressBar", "progressDrawable", "setProgressDrawable()", c.DrawableResource), new b("android.widget.Switch", "switchMinWidth", "setSwitchMinWidth()", c.Size), new b("android.widget.Switch", "switchPadding", "setSwitchPadding()", c.Size), new b("android.widget.Switch", "textOff", "setTextOff()", c.Text), new b("android.widget.Switch", "textOn", "setTextOn()", c.Text), new b("android.widget.Switch", "thumbTextPadding", "setThumbTextPadding()", c.Size), new b("android.widget.Switch", "thumb", "setThumbDrawable()", c.Drawable), new b("android.widget.Switch", "track", "setTrackDrawable()", c.Drawable), new b("android.widget.ToggleButton", "textOff", "setTextOff()", c.Text), new b("android.widget.ToggleButton", "textOn", "setTextOn()", c.Text), new b("android.widget.Spinner", "gravity", "setGravity()", c.IntConstant, "android.view.Gravity", null), new b("android.widget.Spinner", "dropDownWidth", "setDropDownWidth()", c.Size), new b("android.widget.Spinner", "dropDownHorizontalOffset", "setDropDownHorizontalOffset()", c.Size), new b("android.widget.Spinner", "prompt", "setPrompt()", c.Text), new b("android.widget.Spinner", "dropDownVerticalOffset", "setDropDownVerticalOffset()", c.Size), new b("android.widget.Spinner", "popupBackground", "setPopupBackgroundDrawable()", c.Drawable), new b(str2, "numStars", "setNumStars()", c.Int), new b(str2, "rating", "setRating()", c.Float), new b(str2, "stepSize", "setStepSize()", c.Float), new b(str2, "isIndicator", "setIsIndicator()", c.Bool), new b("android.widget.DatePicker", "calendarViewShown", "setCalendarViewShown()", c.Bool), new b("android.widget.DatePicker", "spinnersShown", "setSpinnersShown()", c.Bool), new b("android.widget.ListView", "divider", "setDivider()", c.Drawable), new b("android.widget.ListView", "dividerHeight", "setDividerHeight()", c.Size)};
            gn = bVarArr;
            b[] bVarArr2 = new b[VH.length + bVarArr.length];
            u7 = bVarArr2;
            System.arraycopy(VH, 0, bVarArr2, 0, VH.length);
            System.arraycopy(gn, 0, u7, VH.length, gn.length);
            Arrays.sort(u7, new a());
        } finally {
        }
    }

    @ey(method = 941188983384572375L)
    public h() {
        try {
            if (tp) {
                iy.gn(1488646255117602785L, null);
            }
        } catch (Throwable th) {
            if (EQ) {
                iy.aM(th, 1488646255117602785L, null);
            }
            throw th;
        }
    }

    @cy(clazz = -1144527078399727815L, container = -1144527078399727815L, user = true)
    public static class b {

        @fy
        private static /* synthetic */ boolean EQ;

        @gy
        private static /* synthetic */ boolean we;

        @dy(field = -3182056064831713332L)
        public String DW;

        @dy(field = 2162785623446200335L)
        public Class<?> FH;

        @dy(field = -1812079879683243800L)
        public String Hw;

        @dy(field = 1979155850639641553L)
        public String VH;

        @dy(field = -1939811284749399220L)
        public Class<?> Zo;

        @dy(field = 5586429996623210588L)
        public String gn;

        @dy(field = 741063339243602061L)
        public Class<?> j6;

        @dy(field = -2867925902000428347L)
        private String tp;

        @dy(field = 4682043339325057695L)
        public boolean u7;

        @dy(field = -1539149355800790984L)
        public c v5;

        static {
            iy.Zo(b.class);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -2972526891059719665L)
        public b(String str, String str2, String str3, String str4, c cVar, String str5, String str6) throws Throwable {
            int i;
            this(str, str2, str4, cVar, str5, str6);
            try {
                if (EQ) {
                    iy.QX(-2529837223521910305L, null, new Object[]{str, str2, str3, str4, cVar, str5, str6});
                }
                i = 7;
                try {
                    this.FH = FH(str3);
                } catch (Throwable th) {
                    th = th;
                    if (we) {
                        Object[] objArr = new Object[i];
                        objArr[0] = str;
                        objArr[1] = str2;
                        objArr[2] = str3;
                        objArr[3] = str4;
                        objArr[4] = cVar;
                        objArr[5] = str5;
                        objArr[6] = str6;
                        iy.rN(th, -2529837223521910305L, null, objArr);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i = 7;
            }
        }

        @ey(method = 1321373350340167575L)
        private Class<?> FH(String str) {
            try {
                if (EQ) {
                    iy.tp(2807441923577577895L, this, str);
                }
                try {
                    if (str.contains(".")) {
                        return Class.forName(str);
                    }
                    return Class.forName(h.class.getPackage().getName() + "." + str);
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (we) {
                    iy.j3(th, 2807441923577577895L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 4783239396436624704L)
        private void j6() {
            try {
                if (EQ) {
                    iy.gn(1908403564037859264L, this);
                }
                String strSubstring = this.Hw.substring(8);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(Character.toUpperCase(strSubstring.charAt(0)));
                boolean z = false;
                for (int i = 1; i < strSubstring.length(); i++) {
                    char cCharAt = strSubstring.charAt(i);
                    if (z) {
                        stringBuffer.append(Character.toUpperCase(cCharAt));
                        z = false;
                    } else if (cCharAt == '_') {
                        stringBuffer.append(" ");
                        z = true;
                    } else {
                        if (Character.isUpperCase(cCharAt)) {
                            stringBuffer.append(" ");
                        }
                        stringBuffer.append(cCharAt);
                    }
                }
                this.tp = stringBuffer.toString();
            } catch (Throwable th) {
                if (we) {
                    iy.aM(th, 1908403564037859264L, this);
                }
                throw th;
            }
        }

        @ey(method = -3094683217244118720L)
        public String DW() {
            try {
                if (EQ) {
                    iy.gn(-251962909469139960L, this);
                }
                return this.tp;
            } catch (Throwable th) {
                if (we) {
                    iy.aM(th, -251962909469139960L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 682222625287634525L)
        public b(String str, String str2, String str3, c cVar, String str4, String str5) {
            this(str, str2, str3, cVar);
            try {
                if (EQ) {
                    iy.QX(-307260594629702727L, null, new Object[]{str, str2, str3, cVar, str4, str5});
                }
                this.Zo = FH(str4);
                this.VH = str4;
                this.gn = str5;
            } catch (Throwable th) {
                if (we) {
                    iy.rN(th, -307260594629702727L, null, new Object[]{str, str2, str3, cVar, str4, str5});
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 5566794363297176435L)
        public b(String str, String str2, String str3, String str4, c cVar) {
            this(str, str2, str4, cVar);
            try {
                if (EQ) {
                    iy.J8(698126465889819115L, null, str, str2, str3, str4, cVar);
                }
                this.FH = FH(str3);
            } catch (Throwable th) {
                if (we) {
                    iy.lg(th, 698126465889819115L, null, str, str2, str3, str4, cVar);
                }
                throw th;
            }
        }

        @ey(method = 4622144246146685377L)
        public b(String str, String str2, String str3, c cVar) {
            try {
                if (EQ) {
                    iy.J0(-4981379621115338299L, null, str, str2, str3, cVar);
                }
                Class<?> clsFH = FH(str);
                this.Zo = clsFH;
                this.j6 = clsFH;
                this.DW = str3;
                this.Hw = "android:" + str2;
                this.v5 = cVar;
                this.u7 = str2.startsWith("layout_");
                j6();
            } catch (Throwable th) {
                if (we) {
                    iy.a8(th, -4981379621115338299L, null, str, str2, str3, cVar);
                }
                throw th;
            }
        }
    }
}
