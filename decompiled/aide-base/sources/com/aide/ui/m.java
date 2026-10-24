package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

@cy(clazz = -4716673154304342080L, container = -4716673154304342080L, user = true)
/* loaded from: classes.dex */
public class m {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = -3168204921541507024L)
    private Activity DW;

    @dy(field = 885063300650214400L)
    private int FH;

    @dy(field = -592614160844375331L)
    private boolean j6;

    @cy(clazz = -1926217090178499573L, container = -4716673154304342080L, user = true)
    class a implements Animation.AnimationListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 3127199871102412729L)
        final /* synthetic */ View j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -4510351529607817883L)
        a(m mVar, View view) {
            this.j6 = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        @ey(method = 4909249266232637619L)
        public void onAnimationEnd(Animation animation) {
            try {
                if (DW) {
                    iy.tp(-2096774293128379227L, this, animation);
                }
                this.j6.setVisibility(8);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -2096774293128379227L, this, animation);
                }
                throw th;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        @ey(method = 5264970898005224163L)
        public void onAnimationRepeat(Animation animation) {
            try {
                if (DW) {
                    iy.tp(6157552769907693207L, this, animation);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 6157552769907693207L, this, animation);
                }
                throw th;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        @ey(method = -167251094262227280L)
        public void onAnimationStart(Animation animation) {
            try {
                if (DW) {
                    iy.tp(5729828160704637600L, this, animation);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 5729828160704637600L, this, animation);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(m.class);
    }

    @ey(method = -35908125772814008L)
    public m(Activity activity, int i) {
        try {
            if (Hw) {
                iy.EQ(-421287799826278401L, null, activity, new Integer(i));
            }
            this.j6 = false;
            this.DW = activity;
            this.FH = i;
            j6().setVisibility(8);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, -421287799826278401L, null, activity, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -500308310504539232L)
    private View j6() {
        try {
            if (Hw) {
                iy.gn(-1084710385753499573L, this);
            }
            return this.DW.findViewById(this.FH);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1084710385753499573L, this);
            }
            throw th;
        }
    }

    @ey(method = -6946722918344176432L)
    public void DW(View.OnClickListener onClickListener) {
        try {
            if (Hw) {
                iy.tp(-1395212869700332009L, this, onClickListener);
            }
            j6().setOnClickListener(onClickListener);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -1395212869700332009L, this, onClickListener);
            }
            throw th;
        }
    }

    @ey(method = 1196191013953050765L)
    public void FH(boolean z) {
        try {
            if (Hw) {
                iy.Ws(1175867164342060352L, this, z);
            }
            View viewJ6 = j6();
            if (z != this.j6) {
                this.j6 = z;
                if (z) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.DW.getResources().getDisplayMetrics().density * 60.0f, 0.0f);
                    translateAnimation.setDuration(300L);
                    viewJ6.startAnimation(translateAnimation);
                    viewJ6.setVisibility(0);
                    return;
                }
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.DW.getResources().getDisplayMetrics().density * 60.0f);
                translateAnimation2.setDuration(300L);
                translateAnimation2.setAnimationListener(new a(this, viewJ6));
                viewJ6.startAnimation(translateAnimation2);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1175867164342060352L, this, new Boolean(z));
            }
            throw th;
        }
    }
}
