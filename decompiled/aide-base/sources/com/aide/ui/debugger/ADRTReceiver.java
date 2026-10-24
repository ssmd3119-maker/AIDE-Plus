package com.aide.ui.debugger;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

@cy(clazz = 6932572682887363125L, container = 6932572682887363125L, user = true)
/* loaded from: classes.dex */
public class ADRTReceiver extends BroadcastReceiver {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(ADRTReceiver.class);
    }

    @ey(method = 591127507654796088L)
    public ADRTReceiver() {
        try {
            if (j6) {
                iy.gn(2023906095643802075L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2023906095643802075L, null);
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    @ey(method = 662845221944218783L)
    public void onReceive(Context context, Intent intent) {
        try {
            if (j6) {
                iy.EQ(-792867024760012752L, this, context, intent);
            }
            if (intent.getExtras() != null) {
                if ("com.adrt.LOGCAT_ENTRIES".equals(intent.getAction())) {
                    Debugger.XL(context).BT(context, intent.getStringArrayExtra("lines"));
                    return;
                }
                if ("com.adrt.CONNECT".equals(intent.getAction())) {
                    Debugger.XL(context).yS(context, intent.getExtras().getString("package"));
                    return;
                }
                if ("com.adrt.STOP".equals(intent.getAction())) {
                    Debugger.XL(context).vy(context, intent.getExtras().getString("package"));
                    return;
                }
                if ("com.adrt.BREAKPOINT_HIT".equals(intent.getAction())) {
                    String string = intent.getExtras().getString("package");
                    ArrayList<String> stringArrayList = intent.getExtras().getStringArrayList("variables");
                    ArrayList<String> stringArrayList2 = intent.getExtras().getStringArrayList("variableValues");
                    ArrayList<String> stringArrayList3 = intent.getExtras().getStringArrayList("variableKinds");
                    Debugger.XL(context).er(context, string, intent.getExtras().getStringArrayList("stackMethods"), intent.getExtras().getStringArrayList("stackLocations"), intent.getExtras().getStringArrayList("stackLocationKinds"), stringArrayList, stringArrayList2, stringArrayList3);
                    return;
                }
                if ("com.adrt.FIELDS".equals(intent.getAction())) {
                    ArrayList<String> stringArrayList4 = intent.getExtras().getStringArrayList("fields");
                    ArrayList<String> stringArrayList5 = intent.getExtras().getStringArrayList("fieldValues");
                    ArrayList<String> stringArrayList6 = intent.getExtras().getStringArrayList("fieldKinds");
                    Debugger.XL(context).gW(context, intent.getExtras().getString("package"), intent.getExtras().getString("path"), stringArrayList4, stringArrayList5, stringArrayList6);
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -792867024760012752L, this, context, intent);
            }
            throw th;
        }
    }
}
