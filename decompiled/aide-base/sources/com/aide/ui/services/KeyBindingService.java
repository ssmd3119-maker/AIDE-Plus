package com.aide.ui.services;

import abcd.cg;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gg;
import abcd.gy;
import abcd.iy;
import android.content.SharedPreferences;
import com.aide.common.AppLog;
import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import com.aide.ui.command.KeyStrokeCommand;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@cy(clazz = 1379969761310196368L, container = 1379969761310196368L, user = true)
/* loaded from: classes.dex */
public class KeyBindingService {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 3055510209590855760L)
    private Map<String, KeyStroke> j6;

    static {
        iy.Zo(KeyBindingService.class);
    }

    @ey(method = 1455657469122060755L)
    public KeyBindingService() {
        try {
            if (DW) {
                iy.gn(3149001928542884067L, null);
            }
            this.j6 = new HashMap();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 3149001928542884067L, null);
            }
            throw th;
        }
    }

    @ey(method = -3358690075395431205L)
    private String DW(KeyStrokeCommand keyStrokeCommand) {
        try {
            if (DW) {
                iy.tp(2528444115235219595L, this, keyStrokeCommand);
            }
            return keyStrokeCommand instanceof cg ? ((cg) keyStrokeCommand).Zo() : keyStrokeCommand.getClass().getName();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 2528444115235219595L, this, keyStrokeCommand);
            }
            throw th;
        }
    }

    @ey(method = -3042358371263704224L)
    private void Zo() {
        try {
            if (DW) {
                iy.gn(-619641613257993356L, this);
            }
            try {
                SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("KeybindingsService_2", 0).edit();
                editorEdit.clear();
                for (Map.Entry<String, KeyStroke> entry : this.j6.entrySet()) {
                    editorEdit.putString(entry.getKey(), entry.getValue().toParse());
                }
                editorEdit.commit();
            } catch (Throwable th) {
                AppLog.v5(th);
            }
        } catch (Throwable th2) {
            if (FH) {
                iy.aM(th2, -619641613257993356L, this);
            }
            throw th2;
        }
    }

    @ey(method = 1897638705300972595L)
    public void FH() {
        KeyStroke keyStroke;
        try {
            if (DW) {
                iy.gn(1752110392064426607L, this);
            }
            try {
                for (Map.Entry<String, ?> entry : ServiceContainer.getContext().getSharedPreferences("KeybindingsService_2", 0).getAll().entrySet()) {
                    if ((entry.getValue() instanceof String) && (keyStroke = KeyStroke.parse(entry.getValue().toString())) != null) {
                        this.j6.put(entry.getKey(), keyStroke);
                    }
                }
            } catch (Throwable th) {
                AppLog.v5(th);
            }
        } catch (Throwable th2) {
            if (FH) {
                iy.aM(th2, 1752110392064426607L, this);
            }
            throw th2;
        }
    }

    @ey(method = 2523542403195093699L)
    public void Hw() {
        try {
            if (DW) {
                iy.gn(5270513457793762555L, this);
            }
            this.j6.clear();
            Zo();
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 5270513457793762555L, this);
            }
            throw th;
        }
    }

    @ey(method = 813934302513461192L)
    public List<KeyStroke> j6(KeyStrokeCommand keyStrokeCommand) {
        try {
            if (DW) {
                iy.tp(-378332460155568384L, this, keyStrokeCommand);
            }
            ArrayList arrayList = new ArrayList();
            KeyStroke keyStroke = this.j6.get(DW(keyStrokeCommand));
            if (keyStroke != null) {
                arrayList.add(keyStroke);
            } else {
                arrayList.add(keyStrokeCommand.getKeyStroke());
                if (keyStrokeCommand instanceof gg) {
                    arrayList.addAll(((gg) keyStrokeCommand).Hw());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -378332460155568384L, this, keyStrokeCommand);
            }
            throw th;
        }
    }

    @ey(method = -4830289974464855712L)
    public void v5(KeyStrokeCommand keyStrokeCommand, KeyStroke keyStroke) {
        try {
            if (DW) {
                iy.EQ(-665299666285206764L, this, keyStrokeCommand, keyStroke);
            }
            if (keyStroke == null) {
                this.j6.remove(DW(keyStrokeCommand));
            } else {
                this.j6.put(DW(keyStrokeCommand), keyStroke);
            }
            Zo();
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -665299666285206764L, this, keyStrokeCommand, keyStroke);
            }
            throw th;
        }
    }
}
