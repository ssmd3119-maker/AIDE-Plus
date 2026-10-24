package com.aide.ui.browsers;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.aide.engine.FindResult;
import com.aide.ui.AppPreferences;

@cy(clazz = 861791236826087153L, container = 861791236826087153L, user = true)
/* loaded from: classes.dex */
public class FindResultTextView extends TextView {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(FindResultTextView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 2290490953904499525L)
    public FindResultTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (WB) {
                iy.we(-1117803328554548160L, null, context, attributeSet, new Integer(i));
            }
            DW();
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, -1117803328554548160L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2935053394939927080L)
    private void DW() {
        try {
            if (WB) {
                iy.gn(779932234851519957L, this);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 779932234851519957L, this);
            }
            throw th;
        }
    }

    @ey(method = 1038554163218819556L)
    private int j6(int i, int i2, String str, int i3, int i4) {
        try {
            if (WB) {
                iy.J8(-5657873162711850493L, this, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4));
            }
            int i5 = (i3 - i) + 1;
            int i6 = i5 == 1 ? i4 - i2 : i4;
            if (i5 < 1) {
                return 0;
            }
            return i5 > 1 ? str.length() : Math.min(str.length(), i6 - 1);
        } catch (Throwable th) {
            if (mb) {
                iy.lg(th, -5657873162711850493L, this, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 2318810371780721337L)
    public void setContent(FindResult findResult) {
        int i;
        boolean z;
        FindResult findResult2 = findResult;
        try {
            if (WB) {
                iy.tp(402399515101525760L, this, findResult2);
            }
            int i2 = findResult2.mb;
            String str = findResult2.qp;
            int i3 = 0;
            while (i3 < str.length() && Character.isWhitespace(str.charAt(i3))) {
                i3++;
            }
            String strSubstring = str.substring(i3, str.length());
            setText(strSubstring, TextView.BufferType.SPANNABLE);
            Spannable spannable = (Spannable) getText();
            spannable.setSpan(new UnderlineSpan(), j6(i2, i3, strSubstring, findResult2.mb, findResult2.jw), j6(i2, i3, strSubstring, findResult2.mb, findResult2.fY), 33);
            boolean zBT = AppPreferences.BT();
            int i4 = 0;
            while (i4 < findResult2.k2.size()) {
                FindResult.Highlighting highlighting = findResult2.k2.get(i4);
                if (highlighting.qp != null) {
                    int color = highlighting.qp.getColor(getContext(), zBT);
                    int typefaceStyle = highlighting.qp.getTypefaceStyle();
                    int i5 = typefaceStyle != 1 ? typefaceStyle != 2 ? 0 : 2 : 1;
                    z = zBT;
                    i = i4;
                    int iJ6 = j6(i2, i3, strSubstring, highlighting.WB, highlighting.mb);
                    int iJ62 = j6(i2, i3, strSubstring, highlighting.jw, highlighting.fY);
                    if (iJ6 >= 0 && iJ62 >= 0) {
                        spannable.setSpan(new ForegroundColorSpan(color), iJ6, iJ62, 33);
                        if (i5 == 1 || i5 == 2 || i5 == 3) {
                            spannable.setSpan(new StyleSpan(i5), iJ6, iJ62, 33);
                        }
                    }
                } else {
                    i = i4;
                    z = zBT;
                }
                i4 = i + 1;
                findResult2 = findResult;
                zBT = z;
            }
            if (Build.VERSION.SDK_INT >= 20) {
                setTypeface(Typeface.MONOSPACE);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 402399515101525760L, this, findResult);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 34222707048361260L)
    public FindResultTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (WB) {
                iy.EQ(-4051398043761124765L, null, context, attributeSet);
            }
            DW();
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, -4051398043761124765L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 296693781645603275L)
    public FindResultTextView(Context context) {
        super(context);
        try {
            if (WB) {
                iy.tp(84251207679510144L, null, context);
            }
            DW();
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 84251207679510144L, null, context);
            }
            throw th;
        }
    }
}
