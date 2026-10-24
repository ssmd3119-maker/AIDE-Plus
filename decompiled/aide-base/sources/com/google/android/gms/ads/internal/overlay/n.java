package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.mp;
import javax.annotation.Nullable;

@jg
/* loaded from: classes.dex */
public final class n extends FrameLayout implements View.OnClickListener {
    private final ImageButton WB;
    private final v mb;

    public n(Context context, o oVar, @Nullable v vVar) {
        super(context);
        this.mb = vVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.WB = imageButton;
        imageButton.setImageResource(R.drawable.btn_dialog);
        this.WB.setBackgroundColor(0);
        this.WB.setOnClickListener(this);
        ImageButton imageButton2 = this.WB;
        cw0.j6();
        int iJ6 = mp.j6(context, oVar.j6);
        cw0.j6();
        int iJ62 = mp.j6(context, 0);
        cw0.j6();
        int iJ63 = mp.j6(context, oVar.DW);
        cw0.j6();
        imageButton2.setPadding(iJ6, iJ62, iJ63, mp.j6(context, oVar.FH));
        this.WB.setContentDescription("Interstitial close button");
        cw0.j6();
        mp.j6(context, oVar.Hw);
        ImageButton imageButton3 = this.WB;
        cw0.j6();
        int iJ64 = mp.j6(context, oVar.Hw + oVar.j6 + oVar.DW);
        cw0.j6();
        addView(imageButton3, new FrameLayout.LayoutParams(iJ64, mp.j6(context, oVar.Hw + oVar.FH), 17));
    }

    public final void j6(boolean z) {
        if (z) {
            this.WB.setVisibility(8);
        } else {
            this.WB.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v vVar = this.mb;
        if (vVar != null) {
            vVar.rX();
        }
    }
}
