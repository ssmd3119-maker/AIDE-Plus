package com.aide.ui;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@cy(clazz = 2660200056573086584L, container = 2660200056573086584L, user = true)
/* loaded from: classes.dex */
public class TrainerRuntimeReceiver extends BroadcastReceiver {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(TrainerRuntimeReceiver.class);
    }

    @ey(method = -111572308473346969L)
    public TrainerRuntimeReceiver() {
        try {
            if (j6) {
                iy.gn(8111622305658884649L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 8111622305658884649L, null);
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    @ey(method = -1244326363870351424L)
    public void onReceive(Context context, Intent intent) {
        try {
            if (j6) {
                iy.EQ(1313453086310317712L, this, context, intent);
            }
            ServiceContainer.nw().we(context, intent.getLongExtra("version", -1L));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1313453086310317712L, this, context, intent);
            }
            throw th;
        }
    }
}
