package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.common.KeyStroke;
import com.aide.common.KeyStrokeDetector;
import com.aide.ui.command.KeyStrokeCommand;
import com.aide.ui.firebase.FireBaseLogEvent;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 4587834483025367040L, container = 4587834483025367040L, user = true)
/* loaded from: classes.dex */
public class GlobalKeyCommand implements KeyStrokeDetector.KeyStrokeHandler {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -3553203924431490528L)
    private List<KeyStrokeCommand> j6;

    static {
        iy.Zo(GlobalKeyCommand.class);
    }

    @ey(method = -388519451424753495L)
    public GlobalKeyCommand(List<KeyStrokeCommand> list) {
        try {
            if (DW) {
                iy.tp(3618368934561872825L, null, list);
            }
            this.j6 = list;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 3618368934561872825L, null, list);
            }
            throw th;
        }
    }

    @ey(method = 4647189099733832315L)
    private KeyStrokeCommand DW(KeyStroke keyStroke) {
        try {
            if (DW) {
                iy.tp(-3704611847555669335L, this, keyStroke);
            }
            for (KeyStrokeCommand keyStrokeCommand : this.j6) {
                List<KeyStroke> listJ6 = ServiceContainer.Mr().j6(keyStrokeCommand);
                if (listJ6 != null) {
                    Iterator<KeyStroke> it = listJ6.iterator();
                    while (it.hasNext()) {
                        if (it.next().equalsKeyStroke(keyStroke)) {
                            return keyStrokeCommand;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -3704611847555669335L, this, keyStroke);
            }
            throw th;
        }
    }

    @Override // com.aide.common.KeyStrokeDetector.KeyStrokeHandler
    @ey(method = -2112772227188858181L)
    public boolean j6(KeyStroke keyStroke) {
        try {
            if (DW) {
                iy.tp(546571709163775365L, this, keyStroke);
            }
            KeyStrokeCommand keyStrokeCommandDW = DW(keyStroke);
            if (keyStrokeCommandDW == null) {
                return false;
            }
            if (!keyStrokeCommandDW.isEnabled()) {
                return true;
            }
            FireBaseLogEvent.tp("Global key command: " + keyStrokeCommandDW.getName());
            keyStrokeCommandDW.run();
            return true;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 546571709163775365L, this, keyStroke);
            }
            throw th;
        }
    }
}
