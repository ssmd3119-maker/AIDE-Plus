package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import com.aide.ui.ServiceContainer;

@cy(clazz = 5327021182957118005L, container = 5327021182957118005L, user = true)
/* loaded from: classes.dex */
public class PremiumCheckBoxPreference extends CheckBoxPreference {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(PremiumCheckBoxPreference.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -298575495740768512L)
    public PremiumCheckBoxPreference(Context context) {
        super(context);
        try {
            if (WB) {
                iy.tp(1484879269228096415L, null, context);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 1484879269228096415L, null, context);
            }
            throw th;
        }
    }

    @Override // android.preference.TwoStatePreference, android.preference.Preference
    @ey(method = 1414059238356255112L)
    protected void onClick() {
        try {
            if (WB) {
                iy.gn(1497348880623971088L, this);
            }
            if (ServiceContainer.getLicenseService().gn((Activity) getContext(), getKey())) {
                super.onClick();
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 1497348880623971088L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 30022657034098025L)
    public PremiumCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (WB) {
                iy.EQ(-5504617621481714704L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, -5504617621481714704L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 2082351801016613856L)
    public PremiumCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (WB) {
                iy.we(-1087844434682185275L, null, context, attributeSet, new Integer(i));
            }
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, -1087844434682185275L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
