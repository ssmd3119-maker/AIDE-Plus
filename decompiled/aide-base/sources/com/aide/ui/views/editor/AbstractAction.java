package com.aide.ui.views.editor;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 294962798458478765L, container = 294962798458478765L, user = true)
/* loaded from: classes.dex */
public abstract class AbstractAction implements ActionRunnable {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(AbstractAction.class);
    }

    @ey(method = -1908981118867452340L)
    public AbstractAction() {
        try {
            if (j6) {
                iy.gn(2624935529200147452L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2624935529200147452L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.ActionRunnable
    @ey(method = -1371711330247474920L)
    public void setEnabled(boolean z) {
        try {
            if (j6) {
                iy.Ws(-58225249193089660L, this, z);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -58225249193089660L, this, new Boolean(z));
            }
            throw th;
        }
    }
}
