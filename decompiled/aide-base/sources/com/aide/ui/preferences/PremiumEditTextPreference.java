package com.aide.ui.preferences;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import com.aide.ui.ServiceContainer;

@cy(clazz = 2843684356806961605L, container = 2843684356806961605L, user = true)
/* loaded from: classes.dex */
public class PremiumEditTextPreference extends EditTextPreference {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(PremiumEditTextPreference.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -522412731478259303L)
    public PremiumEditTextPreference(Context context) {
        super(context);
        try {
            if (WB) {
                iy.tp(2053614198873463168L, null, context);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.j3(th, 2053614198873463168L, null, context);
            }
            throw th;
        }
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    @ey(method = 2536873568174199771L)
    protected void onClick() {
        try {
            if (WB) {
                iy.gn(844178414244059475L, this);
            }
            if (ServiceContainer.getLicenseService().gn((Activity) getContext(), getKey())) {
                super.onClick();
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 844178414244059475L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 108712673824616280L)
    public PremiumEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (WB) {
                iy.EQ(-1140647077838907165L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.Mr(th, -1140647077838907165L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 726243278105096399L)
    public PremiumEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (WB) {
                iy.we(-2528493553406871488L, null, context, attributeSet, new Integer(i));
            }
        } catch (Throwable th) {
            if (mb) {
                iy.U2(th, -2528493553406871488L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
