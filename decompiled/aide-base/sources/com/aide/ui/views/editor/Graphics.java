package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

@cy(clazz = -7353299014352688448L, container = -7353299014352688448L, user = true)
/* loaded from: classes.dex */
public class Graphics {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -3299873652161921989L)
    private Paint FH;

    @dy(field = 3989908510166070084L)
    private Paint Hw;

    @dy(field = -4474959875070306480L)
    private Paint btmapPaint;

    @dy(field = -2213565451470930465L)
    private Canvas canvas;

    @dy(field = 3507393379949630652L)
    private Paint textPaint;

    static {
        iy.Zo(Graphics.class);
    }

    @ey(method = -184470696947935573L)
    public Graphics(Canvas canvas) {
        try {
            if (Zo) {
                iy.tp(-605090856915988128L, null, canvas);
            }
            this.canvas = canvas;
            Paint paint = new Paint();
            this.FH = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.Hw = new Paint(1);
            this.textPaint = new Paint(1);
            Paint paint2 = new Paint();
            this.btmapPaint = paint2;
            paint2.setFilterBitmap(true);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -605090856915988128L, null, canvas);
            }
            throw th;
        }
    }

    @ey(method = -1688885209347303536L)
    public void DW(Icon icon, float f, float f2) {
        try {
            if (Zo) {
                iy.we(-1315060682333460484L, this, icon, new Float(f), new Float(f2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -1315060682333460484L, this, icon, new Float(f), new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = -650028980657555968L)
    public void Hw(float f, float f2, float f3, float f4) {
        try {
            if (Zo) {
                iy.J0(85231327918887104L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            this.canvas.drawLine(f, f2, f3, f4, this.FH);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 85231327918887104L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            throw th;
        }
    }

    @ey(method = 3454074372076333115L)
    public void Ws(boolean z) {
        try {
            if (Zo) {
                iy.Ws(-2318619284510447015L, this, z);
            }
            this.FH.setAntiAlias(z);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2318619284510447015L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -794837121601894568L)
    public void Zo(float f, float f2, float f3, float f4) {
        try {
            if (Zo) {
                iy.J0(46722204233201740L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            this.canvas.drawRect(f, f2, f + f3, f2 + f4, this.FH);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 46722204233201740L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            throw th;
        }
    }

    @ey(method = 119812683952080405L)
    public void clipRect(w wVar) {
        try {
            if (Zo) {
                iy.tp(-211898888076645445L, this, wVar);
            }
            this.canvas.save();
            this.canvas.clipRect(wVar.j6());
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -211898888076645445L, this, wVar);
            }
            throw th;
        }
    }

    @ey(method = -2200408913594050480L)
    public void drawBitmap(Bitmap bitmap, float f, float f2, float f3) {
        try {
            if (Zo) {
                iy.J0(652176900922497600L, this, bitmap, new Float(f), new Float(f2), new Float(f3));
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.canvas.drawBitmap(bitmap, new Rect(0, 0, width, height), new RectF(f, f2, (width * f3) + f, (height * f3) + f2), this.btmapPaint);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 652176900922497600L, this, bitmap, new Float(f), new Float(f2), new Float(f3));
            }
            throw th;
        }
    }

    @ey(method = -552269127029346053L)
    public void drawRect(float f, float f2, float f3, float f4) {
        try {
            if (Zo) {
                iy.J0(122880596251106365L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            if (this.Hw.getColor() != 0) {
                this.canvas.drawRect(f, f2, f + f3, f2 + f4, this.Hw);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 122880596251106365L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4));
            }
            throw th;
        }
    }

    @ey(method = 6931311577100271501L)
    public void drawText(String str, float f, float f2) {
        try {
            if (Zo) {
                iy.we(2109645515561433155L, this, str, new Float(f), new Float(f2));
            }
            this.canvas.drawText(str, f, f2, this.textPaint);
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 2109645515561433155L, this, str, new Float(f), new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = -1653948695343659109L)
    public void drawText(char[] cArr, int i, int i2, float f, float f2) {
        try {
            if (Zo) {
                iy.J8(-1013972955537744643L, this, cArr, new Integer(i), new Integer(i2), new Float(f), new Float(f2));
            }
            this.canvas.drawText(cArr, i, i2, f, f2, this.textPaint);
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -1013972955537744643L, this, cArr, new Integer(i), new Integer(i2), new Float(f), new Float(f2));
            }
            throw th;
        }
    }

    @ey(method = 5673559600872292129L)
    public Rect getClipBounds() {
        try {
            if (Zo) {
                iy.gn(4876262564070465135L, this);
            }
            return this.canvas.getClipBounds();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 4876262564070465135L, this);
            }
            throw th;
        }
    }

    @ey(method = -1308295638484807805L)
    /* renamed from: getClipBounds, reason: collision with other method in class */
    public w m0getClipBounds() {
        try {
            if (Zo) {
                iy.gn(4280198593186125045L, this);
            }
            return new w(this.canvas.getClipBounds());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 4280198593186125045L, this);
            }
            throw th;
        }
    }

    @ey(method = -4595350801890750120L)
    public int getTextWidths(char[] cArr, int i, int i2, float[] fArr) {
        try {
            if (Zo) {
                iy.J0(1153499729721352500L, this, cArr, new Integer(i), new Integer(i2), fArr);
            }
            return this.textPaint.getTextWidths(new String(cArr, i, i2), fArr);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 1153499729721352500L, this, cArr, new Integer(i), new Integer(i2), fArr);
            }
            throw th;
        }
    }

    @ey(method = 4196321453104911096L)
    public void gn(float f, float f2, float f3) {
        try {
            if (Zo) {
                iy.we(955626142363528364L, this, new Float(f), new Float(f2), new Float(f3));
            }
            if (this.Hw.getColor() != 0) {
                this.canvas.drawCircle(f, f2, f3, this.Hw);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 955626142363528364L, this, new Float(f), new Float(f2), new Float(f3));
            }
            throw th;
        }
    }

    @ey(method = -2552030789454592656L)
    public void restoreCanvas() {
        try {
            if (Zo) {
                iy.gn(2432366999634788436L, this);
            }
            this.canvas.restore();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2432366999634788436L, this);
            }
            throw th;
        }
    }

    @ey(method = -732828966381586416L)
    public void setColor(Color color) {
        try {
            if (Zo) {
                iy.tp(959789661939208100L, this, color);
            }
            this.FH.setColor(color.j6());
            this.Hw.setColor(color.j6());
            this.textPaint.setColor(color.j6());
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 959789661939208100L, this, color);
            }
            throw th;
        }
    }

    @ey(method = -984022123941961152L)
    public void setFont(Font font) {
        try {
            if (Zo) {
                iy.tp(456265781125297260L, this, font);
            }
            this.textPaint.setTextSize(font.textSize);
            this.textPaint.setTypeface(font.typeface);
            this.textPaint.setFakeBoldText(font.isFakeBoldText);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 456265781125297260L, this, font);
            }
            throw th;
        }
    }

    @ey(method = -1311837500239079L)
    public void v5(float f, float f2, float f3, float f4, float f5) {
        try {
            if (Zo) {
                iy.J8(1733723798634145899L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5));
            }
            this.FH.setStrokeWidth(f5);
            this.canvas.drawLine(f, f2, f3, f4, this.FH);
            this.FH.setStrokeWidth(1.0f);
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 1733723798634145899L, this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5));
            }
            throw th;
        }
    }

    @ey(method = -3188259473920950533L)
    public Color we() {
        try {
            if (Zo) {
                iy.gn(2692424755444517745L, this);
            }
            return new Color(this.FH.getColor());
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2692424755444517745L, this);
            }
            throw th;
        }
    }
}
