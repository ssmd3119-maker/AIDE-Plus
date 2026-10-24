package com.aide.ui.scm;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.aide.ui.p;
import com.aide.ui.q;

@cy(clazz = 44416731421310896L, container = 44416731421310896L, user = true)
/* loaded from: classes.dex */
public class ModifiedFileListEntry extends LinearLayout {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = 747486342880451449L)
    private boolean WB;

    static {
        iy.Zo(ModifiedFileListEntry.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 189780831644343736L)
    public ModifiedFileListEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (mb) {
                iy.we(-5001600418926741656L, null, context, attributeSet, new Integer(i));
            }
        } catch (Throwable th) {
            if (jw) {
                iy.U2(th, -5001600418926741656L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 582939716798982600L)
    public CheckBox getCheckBox() {
        try {
            if (mb) {
                iy.gn(-3428980609986670455L, this);
            }
            return (CheckBox) findViewById(q.modifiedFileChecked);
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -3428980609986670455L, this);
            }
            throw th;
        }
    }

    @ey(method = -676918059349602935L)
    public void j6() {
        try {
            if (mb) {
                iy.gn(-2406539537675644928L, this);
            }
            getCheckBox().toggle();
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -2406539537675644928L, this);
            }
            throw th;
        }
    }

    @ey(method = -1111435260653538411L)
    public void setChecked(boolean z) {
        try {
            if (mb) {
                iy.Ws(584271293101273680L, this, z);
            }
            getCheckBox().setChecked(z);
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, 584271293101273680L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 776598305451178816L)
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        try {
            if (mb) {
                iy.tp(-1449255381540544281L, this, onCheckedChangeListener);
            }
            getCheckBox().setOnCheckedChangeListener(onCheckedChangeListener);
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -1449255381540544281L, this, onCheckedChangeListener);
            }
            throw th;
        }
    }

    @ey(method = 5316588009648276179L)
    public void setSelectedForDiff(boolean z) {
        try {
            if (mb) {
                iy.Ws(2256362095475756180L, this, z);
            }
            this.WB = z;
            if (!z) {
                setBackgroundResource(2131034206);
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{p.color_selected_item});
            setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, 2256362095475756180L, this, new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -6761385646375208859L)
    public ModifiedFileListEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (mb) {
                iy.EQ(1859560107448818465L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, 1859560107448818465L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -7804625189564120940L)
    public ModifiedFileListEntry(Context context) {
        super(context);
        try {
            if (mb) {
                iy.tp(-4345442029832131620L, null, context);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, -4345442029832131620L, null, context);
            }
            throw th;
        }
    }
}
