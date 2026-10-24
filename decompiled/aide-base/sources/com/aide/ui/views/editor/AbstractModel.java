package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import java.io.Reader;
import java.util.Vector;

@cy(clazz = 1566531812821854615L, container = 1566531812821854615L, user = true)
/* loaded from: classes.dex */
public abstract class AbstractModel implements Model {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -5205861703241239587L)
    private Vector<m> DW;

    @dy(field = 3286947504893832567L)
    private Vector<ModelListener> modelListeners;

    static {
        iy.Zo(AbstractModel.class);
    }

    @ey(method = 2705676661541352780L)
    protected AbstractModel() {
        try {
            if (FH) {
                iy.gn(-1940832251156448216L, null);
            }
            this.modelListeners = new Vector<>();
            this.DW = new Vector<>();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1940832251156448216L, null);
            }
            throw th;
        }
    }

    @ey(method = 1885550603148405136L)
    protected void OW(SelectedRegion selectedRegion, SelectedRegion selectedRegion2) {
        try {
            if (FH) {
                iy.EQ(-1531011926099529156L, this, selectedRegion, selectedRegion2);
            }
            for (int i = 0; i < this.DW.size(); i++) {
                this.DW.elementAt(i).rN(this, selectedRegion, selectedRegion2);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1531011926099529156L, this, selectedRegion, selectedRegion2);
            }
            throw th;
        }
    }

    @ey(method = -2659111120049956835L)
    protected void XG(int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J0(-1084801988655710325L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            for (int i5 = 0; i5 < this.modelListeners.size(); i5++) {
                this.modelListeners.elementAt(i5).FH(this, i, i2, i3, i4);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -1084801988655710325L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 3379765063250883920L)
    public void XL(m mVar) {
        try {
            if (FH) {
                iy.tp(-2701702598178151760L, this, mVar);
            }
            this.DW.removeElement(mVar);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2701702598178151760L, this, mVar);
            }
            throw th;
        }
    }

    @ey(method = -2647374387096262005L)
    protected void XX(int i, int i2, int i3, char[] cArr) {
        try {
            if (FH) {
                iy.J0(-1120075562095978227L, this, new Integer(i), new Integer(i2), new Integer(i3), cArr);
            }
            for (int i4 = 0; i4 < this.modelListeners.size(); i4++) {
                this.modelListeners.elementAt(i4).Zo(this, i, i2, i3, cArr);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -1120075562095978227L, this, new Integer(i), new Integer(i2), new Integer(i3), cArr);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -1011709918485751855L)
    public void addModelListener(ModelListener modelListener) {
        try {
            if (FH) {
                iy.tp(135809270154903147L, this, modelListener);
            }
            if (this.modelListeners.contains(modelListener)) {
                return;
            }
            this.modelListeners.addElement(modelListener);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 135809270154903147L, this, modelListener);
            }
            throw th;
        }
    }

    @ey(method = -297265072102469451L)
    protected void br() {
        try {
            if (FH) {
                iy.gn(5563573155584199L, this);
            }
            for (int i = 0; i < this.DW.size(); i++) {
                this.DW.elementAt(i).Mr(this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 5563573155584199L, this);
            }
            throw th;
        }
    }

    @ey(method = -1119753573170544940L)
    public Reader getEntireDocument() {
        try {
            if (FH) {
                iy.gn(5537572141167890352L, this);
            }
            return getEntireDocument(false);
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 5537572141167890352L, this);
            }
            throw th;
        }
    }

    @ey(method = 682754473171934555L)
    public Reader getEntireDocument(boolean z) {
        try {
            if (FH) {
                iy.Ws(5249827198154366685L, this, z);
            }
            return getSelectedRegionReader(0, 0, 0, Integer.MAX_VALUE, z);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 5249827198154366685L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 5467537701621267584L)
    public Reader getSelectedRegionReader(int i, int i2, int i3, int i4, boolean z) {
        try {
            if (FH) {
                iy.J8(-5694848270465911392L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z));
            }
            return new SelectedRegionReader2(this, i, i2, i3, i4, z, System.getProperty("line.separator"));
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -5694848270465911392L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 58532597090811025L)
    public Reader getSelectedRegionReader(int i, int i2, int i3, int i4, boolean z, String str) throws Throwable {
        int i5;
        try {
            if (FH) {
                iy.QX(7210769073445213731L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), str});
            }
            i5 = 6;
            try {
                return new SelectedRegionReader(this, i, i2, i3, i4, z, str);
            } catch (Throwable th) {
                th = th;
                if (Hw) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = new Integer(i);
                    objArr[1] = new Integer(i2);
                    objArr[2] = new Integer(i3);
                    objArr[3] = new Integer(i4);
                    objArr[4] = new Boolean(z);
                    objArr[5] = str;
                    iy.rN(th, 7210769073445213731L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    @ey(method = 2909834553354068795L)
    public Reader getSelectedRegionReader(SelectedRegion selectedRegion) {
        try {
            if (FH) {
                iy.tp(3450285179285759665L, this, selectedRegion);
            }
            return getSelectedRegionReader(selectedRegion, false);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3450285179285759665L, this, selectedRegion);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = -2531365066845760559L)
    public Reader getSelectedRegionReader(SelectedRegion selectedRegion, String str) {
        try {
            if (FH) {
                iy.EQ(73590916201905727L, this, selectedRegion, str);
            }
            return new SelectedRegionReader2(this, selectedRegion.getStartColumn(), selectedRegion.getStartLine(), selectedRegion.getEndColumn(), selectedRegion.getEndLine(), false, str);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 73590916201905727L, this, selectedRegion, str);
            }
            throw th;
        }
    }

    @ey(method = 2322896246061036432L)
    public Reader getSelectedRegionReader(SelectedRegion selectedRegion, boolean z) {
        try {
            if (FH) {
                iy.EQ(1885027708993265764L, this, selectedRegion, new Boolean(z));
            }
            return getSelectedRegionReader(selectedRegion.getStartColumn(), selectedRegion.getStartLine(), selectedRegion.getEndColumn(), selectedRegion.getEndLine(), z);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1885027708993265764L, this, selectedRegion, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2459961537558058245L)
    public Reader getSelectedRegionReader(SelectedRegion selectedRegion, boolean z, String str) {
        try {
            if (FH) {
                iy.we(2293925547897467929L, this, selectedRegion, new Boolean(z), str);
            }
            return new SelectedRegionReader(this, selectedRegion.getStartColumn(), selectedRegion.getStartLine(), selectedRegion.getEndColumn(), selectedRegion.getEndLine(), z, str);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 2293925547897467929L, this, selectedRegion, new Boolean(z), str);
            }
            throw th;
        }
    }

    @ey(method = -440917883039987895L)
    protected void jJ(int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J0(-312712619351427013L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            for (int i5 = 0; i5 < this.modelListeners.size(); i5++) {
                this.modelListeners.elementAt(i5).DW(this, i, i2, i3, i4);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -312712619351427013L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -693325699505062629L)
    protected void kQ() {
        try {
            if (FH) {
                iy.gn(5900180538325225529L, this);
            }
            for (int i = 0; i < this.modelListeners.size(); i++) {
                this.modelListeners.elementAt(i).yS(this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 5900180538325225529L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 246826683777591280L)
    public void removeModelListener(ModelListener modelListener) {
        try {
            if (FH) {
                iy.tp(3369301767984234572L, this, modelListener);
            }
            this.modelListeners.removeElement(modelListener);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3369301767984234572L, this, modelListener);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.Model
    @ey(method = 1485097238024862985L)
    public void sh(m mVar) {
        try {
            if (FH) {
                iy.tp(-2163666501094445L, this, mVar);
            }
            if (this.DW.contains(mVar)) {
                return;
            }
            this.DW.addElement(mVar);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2163666501094445L, this, mVar);
            }
            throw th;
        }
    }

    @ey(method = -4069884155891298133L)
    protected void wc(int i, int i2) {
        try {
            if (FH) {
                iy.EQ(159681233771880745L, this, new Integer(i), new Integer(i2));
            }
            for (int i3 = 0; i3 < this.DW.size(); i3++) {
                this.DW.elementAt(i3).VH(this, i, i2);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 159681233771880745L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 155795949525734895L)
    protected void yO(int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J0(784750405027757653L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            for (int i5 = 0; i5 < this.DW.size(); i5++) {
                this.DW.elementAt(i5).gn(this, i, i2, i3, i4);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 784750405027757653L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }
}
