package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class s0 extends RelativeLayout {
    private static final float[] mb = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable WB;

    public s0(Context context, p0 p0Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        com.google.android.gms.common.internal.p.u7(p0Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(mb, null, null));
        shapeDrawable.getPaint().setColor(p0Var.k6());
        setLayoutParams(layoutParams);
        com.google.android.gms.ads.internal.w0.VH().FH(this, shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(p0Var.OW())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(p0Var.OW());
            textView.setTextColor(p0Var.CO());
            textView.setTextSize(p0Var.MU());
            cw0.j6();
            int iJ6 = mp.j6(context, 4);
            cw0.j6();
            textView.setPadding(iJ6, 0, mp.j6(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<u0> listUE = p0Var.UE();
        if (listUE != null && listUE.size() > 1) {
            this.WB = new AnimationDrawable();
            Iterator<u0> it = listUE.iterator();
            while (it.hasNext()) {
                try {
                    this.WB.addFrame((Drawable) abcd.xu.g3(it.next().K0()), p0Var.tc());
                } catch (Exception e) {
                    xp.Hw("Error while getting drawable.", e);
                }
            }
            com.google.android.gms.ads.internal.w0.VH().FH(imageView, this.WB);
        } else if (listUE.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) abcd.xu.g3(listUE.get(0).K0()));
            } catch (Exception e2) {
                xp.Hw("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.WB;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
