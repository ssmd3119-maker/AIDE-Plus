package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

@cy(clazz = 6031411439909550105L, container = 6031411439909550105L, user = true)
/* loaded from: classes.dex */
public class ColorPickerView extends View {

    @fy
    private static /* synthetic */ boolean cT;

    @gy
    private static /* synthetic */ boolean q7;

    @dy(field = 407981745136163836L)
    private final int[] AL;

    @dy(field = -1389784302102514900L)
    private float WB;

    @dy(field = 2818015259874418149L)
    private int fY;

    @dy(field = 1384539664753234799L)
    private float hK;

    @dy(field = 3424616875214947389L)
    private int jw;

    @dy(field = 40436816686405035L)
    private ColorRunnable k2;

    @dy(field = 3424492381049205480L)
    private int mb;

    @dy(field = -2934262928006896876L)
    private int qp;

    @dy(field = -3202559736252690360L)
    private int[] w9;

    @dy(field = 1261846804011696119L)
    private Paint zh;

    @cy(clazz = -1211560021939535407L, container = -1211560021939535407L, user = true)
    public interface ColorRunnable {
        @ey(method = -3283505681334869760L)
        void j6(int i, String str);
    }

    static {
        iy.Zo(ColorPickerView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 6215510053490839816L)
    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (cT) {
                iy.EQ(-5469345578809877160L, null, context, attributeSet);
            }
            this.WB = 0.0f;
            this.mb = 0;
            this.jw = 0;
            this.AL = new int[258];
            this.w9 = new int[65536];
            FH();
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -5469345578809877160L, null, context, attributeSet);
            }
            throw th;
        }
    }

    @ey(method = 1841149493419791512L)
    private int DW(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(491561673750283944L, this, new Integer(i), new Integer(i2));
            }
            int i3 = (i2 * 256) + i;
            if (i3 < 0 || i3 >= this.w9.length) {
                return 0;
            }
            return this.w9[i3];
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, 491561673750283944L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 950309177068202304L)
    private void FH() {
        try {
            if (cT) {
                iy.gn(182006193237699600L, this);
            }
            VH();
            Context context = getContext();
            this.hK = context.getResources().getDisplayMetrics().density * (Math.min(300.0f, AndroidHelper.VH(context) - 150.0f) / 256.0f);
            Paint paint = new Paint(1);
            this.zh = paint;
            paint.setTextAlign(Paint.Align.CENTER);
            this.zh.setTextSize(12.0f);
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 182006193237699600L, this);
            }
            throw th;
        }
    }

    @ey(method = -388438240755664220L)
    public static int Hw(String str) {
        try {
            if (cT) {
                iy.tp(933181037093525580L, null, str);
            }
            if (str != null && str.length() == 9 && str.startsWith("#")) {
                return (int) Long.parseLong(str.substring(1), 16);
            }
            if (str != null && str.length() == 7 && str.startsWith("#")) {
                return ((int) Long.parseLong(str.substring(1), 16)) | (-16777216);
            }
            return -16777216;
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 933181037093525580L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1913630263746663924L)
    private void VH() {
        try {
            if (cT) {
                iy.gn(-5066467882461213740L, this);
            }
            int i = 0;
            for (float f = 0.0f; f < 256.0f; f += 6.0f) {
                this.AL[i] = Color.rgb(255, 0, (int) f);
                i++;
            }
            for (float f2 = 0.0f; f2 < 256.0f; f2 += 6.0f) {
                this.AL[i] = Color.rgb(255 - ((int) f2), 0, 255);
                i++;
            }
            for (float f3 = 0.0f; f3 < 256.0f; f3 += 6.0f) {
                this.AL[i] = Color.rgb(0, (int) f3, 255);
                i++;
            }
            for (float f4 = 0.0f; f4 < 256.0f; f4 += 6.0f) {
                this.AL[i] = Color.rgb(0, 255, 255 - ((int) f4));
                i++;
            }
            for (float f5 = 0.0f; f5 < 256.0f; f5 += 6.0f) {
                this.AL[i] = Color.rgb((int) f5, 255, 0);
                i++;
            }
            for (float f6 = 0.0f; f6 < 256.0f; f6 += 6.0f) {
                this.AL[i] = Color.rgb(255, 255 - ((int) f6), 0);
                i++;
            }
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -5066467882461213740L, this);
            }
            throw th;
        }
    }

    @ey(method = -7356749345348994000L)
    private void Zo() {
        try {
            if (cT) {
                iy.gn(6454937435900366640L, this);
            }
            int currentMainColor = getCurrentMainColor();
            int[] iArr = new int[256];
            int i = 0;
            for (int i2 = 0; i2 < 256; i2++) {
                for (int i3 = 0; i3 < 256; i3++) {
                    if (i2 == 0) {
                        this.w9[i] = Color.rgb(255 - (((255 - Color.red(currentMainColor)) * i3) / 255), 255 - (((255 - Color.green(currentMainColor)) * i3) / 255), 255 - (((255 - Color.blue(currentMainColor)) * i3) / 255));
                        iArr[i3] = this.w9[i];
                    } else {
                        int i4 = 255 - i2;
                        this.w9[i] = Color.rgb((Color.red(iArr[i3]) * i4) / 255, (Color.green(iArr[i3]) * i4) / 255, (i4 * Color.blue(iArr[i3])) / 255);
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 6454937435900366640L, this);
            }
            throw th;
        }
    }

    @ey(method = 5651372696192958541L)
    private int getCurrentMainColor() {
        try {
            if (cT) {
                iy.gn(3739337502423491297L, this);
            }
            int i = 255 - ((int) ((this.WB * 255.0f) / 360.0f));
            int i2 = 0;
            for (float f = 0.0f; f < 256.0f; f += 6.0f) {
                if (i2 == i) {
                    return Color.rgb(255, 0, (int) f);
                }
                i2++;
            }
            for (float f2 = 0.0f; f2 < 256.0f; f2 += 6.0f) {
                if (i2 == i) {
                    return Color.rgb(255 - ((int) f2), 0, 255);
                }
                i2++;
            }
            for (float f3 = 0.0f; f3 < 256.0f; f3 += 6.0f) {
                if (i2 == i) {
                    return Color.rgb(0, (int) f3, 255);
                }
                i2++;
            }
            for (float f4 = 0.0f; f4 < 256.0f; f4 += 6.0f) {
                if (i2 == i) {
                    return Color.rgb(0, 255, 255 - ((int) f4));
                }
                i2++;
            }
            for (float f5 = 0.0f; f5 < 256.0f; f5 += 6.0f) {
                if (i2 == i) {
                    return Color.rgb((int) f5, 255, 0);
                }
                i2++;
            }
            for (float f6 = 0.0f; f6 < 256.0f; f6 += 6.0f) {
                if (i2 == i) {
                    return Color.rgb(255, 255 - ((int) f6), 0);
                }
                i2++;
            }
            return -65536;
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, 3739337502423491297L, this);
            }
            throw th;
        }
    }

    @ey(method = -245868062184670864L)
    private void getCurrentXY() {
        try {
            if (cT) {
                iy.gn(-1519931797606927488L, this);
            }
            int i = 1000;
            for (int i2 = 0; i2 < 256; i2++) {
                for (int i3 = 0; i3 < 256; i3++) {
                    int iJ6 = j6(DW(i2, i3), this.fY | (-16777216));
                    if (iJ6 == 0) {
                        this.mb = i2;
                        this.jw = i3;
                        return;
                    } else {
                        if (iJ6 < i) {
                            this.mb = i2;
                            this.jw = i3;
                            i = iJ6;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (q7) {
                iy.aM(th, -1519931797606927488L, this);
            }
            throw th;
        }
    }

    @ey(method = 4904389197109677825L)
    private int j6(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(-2750701116629467739L, this, new Integer(i), new Integer(i2));
            }
            return Math.abs(Color.red(i) - Color.red(i2)) + Math.abs(Color.green(i) - Color.green(i2)) + Math.abs(Color.blue(i) - Color.blue(i2));
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, -2750701116629467739L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 428997065316154880L)
    public static String v5(int i) {
        try {
            if (cT) {
                iy.u7(-269416096820768480L, null, i);
            }
            return Color.alpha(i) == 255 ? String.format("#%06X", Integer.valueOf(16777215 & i)) : String.format("#%08X", Integer.valueOf(i & (-1)));
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -269416096820768480L, null, new Integer(i));
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 321346213262569152L)
    protected void onDraw(Canvas canvas) {
        try {
            if (cT) {
                iy.tp(-1024533184505486112L, this, canvas);
            }
            int i = 255 - ((int) ((this.WB * 255.0f) / 360.0f));
            for (int i2 = 0; i2 < 256; i2++) {
                this.zh.setStrokeWidth(this.hK * 2.0f);
                this.zh.setColor(this.AL[i2]);
                float f = i2 + 10;
                canvas.drawLine(this.hK * f, 0.0f, this.hK * f, this.hK * 40.0f, this.zh);
            }
            this.zh.setStrokeWidth(this.hK * 3.0f);
            this.zh.setColor(-16777216);
            float f2 = i + 10;
            canvas.drawLine(f2 * this.hK, 0.0f, f2 * this.hK, this.hK * 40.0f, this.zh);
            this.zh.setStyle(Paint.Style.STROKE);
            this.zh.setColor(-16777216);
            this.zh.setStrokeWidth(1.0f);
            canvas.drawRect(this.hK * 9.5f, this.hK * 0.0f, this.hK * 266.5f, this.hK * 40.0f, this.zh);
            for (int i3 = 0; i3 < 256; i3++) {
                this.zh.setShader(new LinearGradient(0.0f, this.hK * 50.0f, 0.0f, this.hK * 306.0f, new int[]{this.w9[i3], -16777216}, (float[]) null, Shader.TileMode.REPEAT));
                this.zh.setStrokeWidth(this.hK * 2.0f);
                float f3 = i3 + 10;
                canvas.drawLine(this.hK * f3, this.hK * 50.0f, f3 * this.hK, this.hK * 306.0f, this.zh);
            }
            this.zh.setShader(null);
            this.zh.setStyle(Paint.Style.STROKE);
            this.zh.setColor(-16777216);
            this.zh.setStrokeWidth(this.hK * 2.0f);
            canvas.drawCircle((this.mb + 10) * this.hK, (this.jw + 50) * this.hK, this.hK * 6.0f, this.zh);
            this.zh.setStyle(Paint.Style.STROKE);
            this.zh.setColor(-16777216);
            this.zh.setStrokeWidth(1.0f);
            canvas.drawRect(this.hK * 9.5f, this.hK * 50.0f, this.hK * 266.5f, this.hK * 306.0f, this.zh);
            this.zh.setStyle(Paint.Style.FILL);
            this.zh.setColor(this.fY | (-16777216));
            canvas.drawRect(this.hK * 9.5f, this.hK * 316.0f, this.hK * 139.0f, this.hK * 356.0f, this.zh);
            this.zh.setStyle(Paint.Style.FILL);
            this.zh.setColor(this.qp | (-16777216));
            canvas.drawRect(this.hK * 138.0f, this.hK * 316.0f, this.hK * 266.5f, this.hK * 356.0f, this.zh);
            this.zh.setStyle(Paint.Style.STROKE);
            this.zh.setColor(-16777216);
            this.zh.setStrokeWidth(1.0f);
            canvas.drawRect(this.hK * 9.5f, this.hK * 316.0f, this.hK * 266.5f, this.hK * 356.0f, this.zh);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -1024533184505486112L, this, canvas);
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = 2568471252928073283L)
    protected void onMeasure(int i, int i2) {
        try {
            if (cT) {
                iy.EQ(1386759283159679919L, this, new Integer(i), new Integer(i2));
            }
            setMeasuredDimension((int) (this.hK * 276.0f), (int) (this.hK * 366.0f));
        } catch (Throwable th) {
            if (q7) {
                iy.Mr(th, 1386759283159679919L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // android.view.View
    @ey(method = -174762066319428480L)
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (cT) {
                iy.tp(1233504134750242656L, this, motionEvent);
            }
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                return true;
            }
            float x = (motionEvent.getX() / this.hK) - 10.0f;
            if (x < 0.0f) {
                x = 0.0f;
            }
            if (x > 255.0f) {
                x = 255.0f;
            }
            float y = motionEvent.getY() / this.hK;
            if (y < 40.0f) {
                this.WB = ((255.0f - x) * 360.0f) / 255.0f;
                Zo();
            } else {
                this.mb = (int) x;
                int i = ((int) y) - 50;
                this.jw = i;
                if (i < 0) {
                    this.jw = 0;
                }
                if (this.jw > 255) {
                    this.jw = 255;
                }
            }
            int iDW = DW(this.mb, this.jw);
            int iArgb = Color.argb(Color.alpha(this.fY), Color.red(iDW), Color.green(iDW), Color.blue(iDW));
            this.fY = iArgb;
            this.k2.j6(iArgb, v5(iArgb));
            invalidate();
            return true;
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 1233504134750242656L, this, motionEvent);
            }
            throw th;
        }
    }

    @ey(method = 4184726529795194608L)
    public void setCurrentColor(String str) {
        try {
            if (cT) {
                iy.tp(-5023155625215702120L, this, str);
            }
            int iHw = Hw(str);
            this.fY = iHw;
            float[] fArr = new float[3];
            Color.colorToHSV(iHw | (-16777216), fArr);
            this.WB = fArr[0];
            Zo();
            getCurrentXY();
            invalidate();
            this.k2.j6(this.fY, v5(this.fY));
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -5023155625215702120L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 5658708841074898775L)
    public void setInitialColor(String str) {
        try {
            if (cT) {
                iy.tp(-3609550889251125357L, this, str);
            }
            this.qp = Hw(str);
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -3609550889251125357L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 1832812832364629400L)
    public void setOnColorChangedListener(ColorRunnable colorRunnable) {
        try {
            if (cT) {
                iy.tp(-1804155767827496160L, this, colorRunnable);
            }
            this.k2 = colorRunnable;
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, -1804155767827496160L, this, colorRunnable);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -1513405098296138385L)
    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (cT) {
                iy.we(971956533226271447L, null, context, attributeSet, new Integer(i));
            }
            this.WB = 0.0f;
            this.mb = 0;
            this.jw = 0;
            this.AL = new int[258];
            this.w9 = new int[65536];
            FH();
        } catch (Throwable th) {
            if (q7) {
                iy.U2(th, 971956533226271447L, null, context, attributeSet, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 95423789383468125L)
    public ColorPickerView(Context context) {
        super(context);
        try {
            if (cT) {
                iy.tp(1657503528089660801L, null, context);
            }
            this.WB = 0.0f;
            this.mb = 0;
            this.jw = 0;
            this.AL = new int[258];
            this.w9 = new int[65536];
            FH();
        } catch (Throwable th) {
            if (q7) {
                iy.j3(th, 1657503528089660801L, null, context);
            }
            throw th;
        }
    }
}
