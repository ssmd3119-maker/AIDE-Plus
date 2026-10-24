package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

@cy(clazz = 7691031996001765755L, container = 7691031996001765755L, user = true)
/* loaded from: classes.dex */
public class AIDEAnalysisProgressBar extends ProgressBar {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = 1255880610978239920L)
    private int WB;

    static {
        iy.Zo(AIDEAnalysisProgressBar.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 384130043288978145L)
    public AIDEAnalysisProgressBar(Context context) {
        super(context);
        try {
            if (mb) {
                iy.tp(474028062466098653L, null, context);
            }
            this.WB = -1;
            j6();
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, 474028062466098653L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1569132743946374460L)
    private void j6() {
        try {
            if (mb) {
                iy.gn(51042424291814627L, this);
            }
            DW();
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 51042424291814627L, this);
            }
            throw th;
        }
    }

    @ey(method = 2958384178097459733L)
    public void DW() {
        try {
            if (mb) {
                iy.gn(16854642620670384L, this);
            }
            int iSh = ServiceContainer.J0().sh();
            int iCn = ((iSh == 0 ? 0 : (ServiceContainer.J0().cn() * 100) / iSh) / 5) * 5;
            if (!ServiceContainer.J0().vJ()) {
                iCn = 0;
            }
            if (iSh < 20) {
                iCn = 0;
            }
            if (this.WB != iCn) {
                this.WB = iCn;
                if (iCn == 0) {
                    setVisibility(4);
                } else {
                    setVisibility(0);
                    setProgress(iCn);
                }
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 16854642620670384L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -71289136172674880L)
    public AIDEAnalysisProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (mb) {
                iy.EQ(-3855538972452199464L, null, context, attributeSet);
            }
            this.WB = -1;
            j6();
        } catch (Throwable th) {
            if (jw) {
                iy.Mr(th, -3855538972452199464L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 1421435263844264175L)
    public AIDEAnalysisProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (mb) {
                iy.we(1207643863204187871L, null, context, attributeSet, new Integer(i));
            }
            this.WB = -1;
            j6();
        } catch (Throwable th) {
            if (jw) {
                iy.U2(th, 1207643863204187871L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
