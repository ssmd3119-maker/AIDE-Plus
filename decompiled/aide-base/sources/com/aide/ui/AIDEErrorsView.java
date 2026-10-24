package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

@cy(clazz = -3446829987368125797L, container = -3446829987368125797L, user = true)
/* loaded from: classes.dex */
public class AIDEErrorsView extends LinearLayout {

    @gy
    private static /* synthetic */ boolean fY;

    @fy
    private static /* synthetic */ boolean jw;

    @dy(field = -487339987511420149L)
    private int WB;

    @dy(field = 3755298907194850125L)
    private int mb;

    @cy(clazz = 4083070115088312084L, container = -3446829987368125797L, user = true)
    class a implements View.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 447957475041226072L)
        a() {
        }

        @Override // android.view.View.OnClickListener
        @ey(method = 161094745397100093L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-2268656454580879391L, this, view);
                }
                ServiceContainer.getMainActivity().gG();
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -2268656454580879391L, this, view);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(AIDEErrorsView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -40387370052214527L)
    public AIDEErrorsView(Context context) {
        super(context);
        try {
            if (jw) {
                iy.tp(2635720707148052265L, null, context);
            }
            this.WB = -1;
            this.mb = -1;
            j6();
        } catch (Throwable th) {
            if (fY) {
                iy.j3(th, 2635720707148052265L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2493684175228112592L)
    private void j6() {
        try {
            if (jw) {
                iy.gn(-645913613514123747L, this);
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(r.errorsview, (ViewGroup) null);
            removeAllViews();
            addView(viewInflate);
            if (!AppPreferences.Qq()) {
                ((TextView) viewInflate.findViewById(q.errorsViewLabel)).setTextColor(getResources().getColor(2131034115));
            }
            viewInflate.findViewById(q.errorsViewContainer).setOnClickListener(new a());
            DW();
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -645913613514123747L, this);
            }
            throw th;
        }
    }

    @ey(method = 1514587062210835069L)
    public void DW() {
        try {
            if (jw) {
                iy.gn(-2674738090416843520L, this);
            }
            int iGW = ServiceContainer.J0().gW();
            if (this.WB == 0 && this.mb == iGW) {
                return;
            }
            this.mb = iGW;
            this.WB = 0;
            TextView textView = (TextView) findViewById(q.errorsViewLabel);
            View viewFindViewById = findViewById(q.errorsViewContainer);
            if (iGW == 0) {
                viewFindViewById.setVisibility(8);
                return;
            }
            viewFindViewById.setVisibility(0);
            textView.setText(iGW + "");
        } catch (Throwable th) {
            if (fY) {
                iy.aM(th, -2674738090416843520L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -4517915500993702104L)
    public AIDEErrorsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (jw) {
                iy.EQ(-3803708557406624720L, null, context, attributeSet);
            }
            this.WB = -1;
            this.mb = -1;
            j6();
        } catch (Throwable th) {
            if (fY) {
                iy.Mr(th, -3803708557406624720L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -610386562016127765L)
    public AIDEErrorsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (jw) {
                iy.we(-678611483890502437L, null, context, attributeSet, new Integer(i));
            }
            this.WB = -1;
            this.mb = -1;
            j6();
        } catch (Throwable th) {
            if (fY) {
                iy.U2(th, -678611483890502437L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }
}
