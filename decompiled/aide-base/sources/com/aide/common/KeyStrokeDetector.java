package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.InputConnection;

@cy(clazz = -2626290547296404472L, container = -2626290547296404472L, user = true)
/* loaded from: classes.dex */
public class KeyStrokeDetector {

    @fy
    private static /* synthetic */ boolean J8;

    @gy
    private static /* synthetic */ boolean Ws;

    @dy(field = -3720460559953668063L)
    private boolean VH;

    @dy(field = -2007436848140662380L)
    private Context context;

    @dy(field = -5567953115656525644L)
    private boolean isSoftKeyboard;

    @dy(field = 4468261064361072583L)
    private KeyCharacterMap keyCharacterMap;

    @dy(field = 2102757878571566775L)
    private boolean leftAlt;

    @dy(field = -1914409971811083351L)
    private boolean leftCtrl;

    @dy(field = 1339590429424913444L)
    private boolean leftShift;

    @dy(field = -4570948708669963000L)
    private boolean leftShiftPhysical;

    @dy(field = 864812605871956368L)
    private boolean rightAlt;

    @dy(field = -5287266847798850560L)
    private boolean rightCtrl;

    @dy(field = 489062553661005805L)
    private boolean rightShift;

    @dy(field = 3570024579988647771L)
    private boolean rightShiftPhysical;

    @dy(field = -604333159712324053L)
    private int tp;

    @cy(clazz = 5103101706274669167L, container = 5103101706274669167L, user = true)
    public interface KeyStrokeHandler {
        @ey(method = 3132221159748576576L)
        boolean j6(KeyStroke keyStroke);
    }

    @cy(clazz = -2013099164830855395L, container = -2626290547296404472L, user = true)
    class a extends BaseInputConnection {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = 2559320439782610485L)
        final /* synthetic */ View DW;

        @dy(field = -909376290272328725L)
        final /* synthetic */ KeyStrokeHandler j6;

        static {
            iy.Zo(a.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 3895445825750750583L)
        a(View view, boolean z, KeyStrokeHandler keyStrokeHandler, View view2) {
            super(view, z);
            this.j6 = keyStrokeHandler;
            this.DW = view2;
        }

        @ey(method = -3111086357523556079L)
        private void DW(CharSequence charSequence, boolean z, View view) {
            try {
                if (Hw) {
                    iy.we(-4237502881359362963L, this, charSequence, new Boolean(z), view);
                }
                if (KeyStrokeDetector.this.keyCharacterMap == null) {
                    KeyStrokeDetector.this.keyCharacterMap = KeyCharacterMap.load(0);
                }
                for (int i = 0; i < charSequence.length(); i++) {
                    char cCharAt = charSequence.charAt(i);
                    if (!z) {
                        cCharAt = (KeyStrokeDetector.this.leftShiftPhysical || KeyStrokeDetector.this.rightShiftPhysical) ? Character.toUpperCase(cCharAt) : Character.toLowerCase(cCharAt);
                    }
                    KeyEvent[] events = KeyStrokeDetector.this.keyCharacterMap.getEvents(new char[]{cCharAt});
                    if (events != null) {
                        for (KeyEvent keyEvent : events) {
                            sendKeyEvent(keyEvent);
                        }
                    }
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.U2(th, -4237502881359362963L, this, charSequence, new Boolean(z), view);
                }
                throw th;
            }
        }

        @ey(method = 4585709381860276733L)
        private KeyEvent FH(KeyEvent keyEvent) {
            try {
                if (Hw) {
                    iy.tp(4277502395895486627L, this, keyEvent);
                }
                return new KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), keyEvent.getKeyCode(), keyEvent.getRepeatCount(), keyEvent.getMetaState(), keyEvent.getDeviceId(), keyEvent.getScanCode(), keyEvent.getFlags() | 4 | 2);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 4277502395895486627L, this, keyEvent);
                }
                throw th;
            }
        }

        @ey(method = 346108518799019928L)
        private void j6(CharSequence charSequence, boolean z, KeyStrokeHandler keyStrokeHandler) {
            try {
                if (Hw) {
                    iy.we(-6934689697821520352L, this, charSequence, new Boolean(z), keyStrokeHandler);
                }
                for (int i = 0; i < charSequence.length(); i++) {
                    char cCharAt = charSequence.charAt(i);
                    if (!z) {
                        cCharAt = (KeyStrokeDetector.this.leftShiftPhysical || KeyStrokeDetector.this.rightShiftPhysical) ? Character.toUpperCase(cCharAt) : Character.toLowerCase(cCharAt);
                    }
                    if (keyStrokeHandler != null) {
                        keyStrokeHandler.j6(KeyStrokeDetector.this.j3(cCharAt));
                    }
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.U2(th, -6934689697821520352L, this, charSequence, new Boolean(z), keyStrokeHandler);
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = -3611404592854838895L)
        public boolean beginBatchEdit() {
            try {
                if (Hw) {
                    iy.gn(7265854198767076129L, this);
                }
                KeyStrokeDetector.this.we("beginBatchEdit");
                return super.beginBatchEdit();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 7265854198767076129L, this);
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = -183686372098584087L)
        public boolean commitCompletion(CompletionInfo completionInfo) {
            try {
                if (Hw) {
                    iy.tp(1224781825711550013L, this, completionInfo);
                }
                KeyStrokeDetector.this.we("commitCompletion");
                return super.commitCompletion(completionInfo);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 1224781825711550013L, this, completionInfo);
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = 5846150293253532864L)
        public boolean commitCorrection(CorrectionInfo correctionInfo) {
            try {
                if (Hw) {
                    iy.tp(5189492810442102500L, this, correctionInfo);
                }
                KeyStrokeDetector.this.we("commitCorrection");
                return super.commitCorrection(correctionInfo);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 5189492810442102500L, this, correctionInfo);
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = 1340338115677659840L)
        public boolean commitText(CharSequence charSequence, int i) {
            try {
                if (Hw) {
                    iy.EQ(-2642974788388129920L, this, charSequence, new Integer(i));
                }
                KeyStrokeDetector.this.we("commitText '" + ((Object) charSequence) + "'");
                if (Build.VERSION.SDK_INT >= 17) {
                    for (int i2 = 0; i2 < KeyStrokeDetector.this.tp; i2++) {
                        this.j6.j6(new KeyStroke(67, false, false, false));
                    }
                } else if (KeyStrokeDetector.this.tp > 0 && charSequence.length() == 1 && charSequence.charAt(0) == ' ') {
                    KeyStrokeDetector.this.tp = 0;
                    return true;
                }
                KeyStrokeDetector.this.tp = 0;
                if ("\n".equals(charSequence.toString())) {
                    DW(charSequence, KeyStrokeDetector.this.isSoftKeyboard, this.DW);
                } else {
                    j6(charSequence, KeyStrokeDetector.this.isSoftKeyboard, this.j6);
                }
                return true;
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, -2642974788388129920L, this, charSequence, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = -3253686564672011016L)
        public boolean deleteSurroundingText(int i, int i2) {
            try {
                if (Hw) {
                    iy.EQ(965797526991327320L, this, new Integer(i), new Integer(i2));
                }
                KeyStrokeDetector.this.we("deleteSurroundingText " + i + " " + i2);
                KeyStrokeDetector.this.tp = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    this.j6.j6(new KeyStroke(67, false, false, false));
                }
                return super.deleteSurroundingText(i, i2);
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 965797526991327320L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = 1156390581903602577L)
        public boolean endBatchEdit() {
            try {
                if (Hw) {
                    iy.gn(6643356991668340141L, this);
                }
                KeyStrokeDetector.this.we("endBatchEdit");
                return super.endBatchEdit();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 6643356991668340141L, this);
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = 513413195849519305L)
        public boolean finishComposingText() {
            try {
                if (Hw) {
                    iy.gn(-3270805347746250765L, this);
                }
                KeyStrokeDetector.this.we("finishComposingText");
                return super.finishComposingText();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -3270805347746250765L, this);
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = 2036361913300655008L)
        public CharSequence getTextBeforeCursor(int i, int i2) {
            try {
                if (Hw) {
                    iy.EQ(-312802086866956096L, this, new Integer(i), new Integer(i2));
                }
                if (AndroidHelper.U2(KeyStrokeDetector.this.context)) {
                    return super.getTextBeforeCursor(i, i2);
                }
                int iMin = Math.min(i, 1024);
                StringBuilder sb = new StringBuilder(iMin);
                for (int i3 = 0; i3 < iMin; i3++) {
                    sb.append(' ');
                }
                return sb;
            } finally {
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = -7502005945741205925L)
        public boolean performEditorAction(int i) {
            try {
                if (Hw) {
                    iy.u7(139026198659773467L, this, i);
                }
                KeyStrokeDetector.this.we("performEditorAction" + i);
                return super.performEditorAction(i);
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 139026198659773467L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = -2782371035571558284L)
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            try {
                if (Hw) {
                    iy.tp(908713890790193040L, this, keyEvent);
                }
                KeyStrokeDetector.this.we("sendKeyEvent " + keyEvent.getKeyCode());
                KeyStrokeDetector.this.tp = 0;
                return super.sendKeyEvent(FH(keyEvent));
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, 908713890790193040L, this, keyEvent);
                }
                throw th;
            }
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        @ey(method = -233507436939216056L)
        public boolean setComposingText(CharSequence charSequence, int i) {
            try {
                if (Hw) {
                    iy.EQ(6849258625036790620L, this, charSequence, new Integer(i));
                }
                KeyStrokeDetector.this.we("setComposingText '" + ((Object) charSequence) + "'");
                for (int i2 = 0; i2 < KeyStrokeDetector.this.tp; i2++) {
                    this.j6.j6(new KeyStroke(67, false, false, false));
                }
                KeyStrokeDetector.this.tp = charSequence.length();
                j6(charSequence, KeyStrokeDetector.this.isSoftKeyboard, this.j6);
                return true;
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, 6849258625036790620L, this, charSequence, new Integer(i));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(KeyStrokeDetector.class);
    }

    @ey(method = -43717391771087095L)
    public KeyStrokeDetector(Context context) {
        try {
            if (J8) {
                iy.tp(211847340499652800L, null, context);
            }
            this.context = context;
            boolean z = true;
            if (context.getResources().getConfiguration().keyboard != 1) {
                z = false;
            }
            this.isSoftKeyboard = z;
            we("new KeyStrokeDetector() - isSoftKeyboard: " + this.isSoftKeyboard);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 211847340499652800L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2693316646629372071L)
    private void J0(String str, int i, KeyEvent keyEvent) {
        try {
            if (J8) {
                iy.we(-3564819180313796227L, this, str, new Integer(i), keyEvent);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(i);
            sb.append("  ");
            sb.append(keyEvent.getFlags());
            sb.append(keyEvent.isAltPressed() ? " alt" : "");
            sb.append(keyEvent.isShiftPressed() ? " shift" : "");
            sb.append(" ");
            sb.append(isLeftCtrlPressed(keyEvent.getMetaState()) ? " ctrl" : "");
            we(sb.toString());
        } catch (Throwable th) {
            if (Ws) {
                iy.U2(th, -3564819180313796227L, this, str, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = 347389564348050092L)
    private boolean isLeftCtrlPressed(int i) {
        try {
            if (J8) {
                iy.u7(49014999568739136L, this, i);
            }
            return (i & 12288) != 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 49014999568739136L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3306886932270292448L)
    public KeyStroke j3(char c) {
        try {
            if (J8) {
                iy.tp(-749892910932203508L, this, new Character(c));
            }
            return new KeyStroke(-1, c, this.leftShiftPhysical | this.rightShiftPhysical | Character.isUpperCase(c), false, false);
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -749892910932203508L, this, new Character(c));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    @abcd.ey(method = -342692098111630079L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.aide.common.KeyStroke makeKeyStroke(int r9, android.view.KeyEvent r10) {
        /*
            r8 = this;
            boolean r0 = com.aide.common.KeyStrokeDetector.J8     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L11
            r0 = 3470998291504142863(0x302b768e55179a0f, double:1.1858802056698012E-76)
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> L68
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L68
            abcd.iy.EQ(r0, r8, r2, r10)     // Catch: java.lang.Throwable -> L68
        L11:
            if (r9 == 0) goto L66
            r0 = 3
            if (r9 == r0) goto L66
            r0 = 4
            if (r9 == r0) goto L66
            r0 = 113(0x71, float:1.58E-43)
            if (r9 == r0) goto L66
            r0 = 114(0x72, float:1.6E-43)
            if (r9 == r0) goto L66
            switch(r9) {
                case 57: goto L66;
                case 58: goto L66;
                case 59: goto L66;
                case 60: goto L66;
                default: goto L24;
            }     // Catch: java.lang.Throwable -> L68
        L24:
            boolean r0 = r8.leftShift     // Catch: java.lang.Throwable -> L68
            boolean r1 = r8.rightShift     // Catch: java.lang.Throwable -> L68
            r0 = r0 | r1
            boolean r1 = r10.isShiftPressed()     // Catch: java.lang.Throwable -> L68
            r5 = r0 | r1
            boolean r0 = r8.leftCtrl     // Catch: java.lang.Throwable -> L68
            boolean r1 = r8.rightCtrl     // Catch: java.lang.Throwable -> L68
            r0 = r0 | r1
            int r1 = r10.getMetaState()     // Catch: java.lang.Throwable -> L68
            boolean r1 = r8.isLeftCtrlPressed(r1)     // Catch: java.lang.Throwable -> L68
            r6 = r0 | r1
            boolean r0 = r8.leftAlt     // Catch: java.lang.Throwable -> L68
            boolean r1 = r8.rightAlt     // Catch: java.lang.Throwable -> L68
            r0 = r0 | r1
            boolean r1 = r10.isAltPressed()     // Catch: java.lang.Throwable -> L68
            r7 = r0 | r1
            r0 = 65535(0xffff, float:9.1834E-41)
            int r1 = r10.getUnicodeChar()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5b
            boolean r2 = java.lang.Character.isISOControl(r1)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L5b
            char r0 = (char) r1     // Catch: java.lang.Throwable -> L68
            r4 = r0
            goto L5e
        L5b:
            r4 = 65535(0xffff, float:9.1834E-41)
        L5e:
            com.aide.common.KeyStroke r0 = new com.aide.common.KeyStroke     // Catch: java.lang.Throwable -> L68
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L68
            return r0
        L66:
            r9 = 0
            return r9
        L68:
            r0 = move-exception
            boolean r1 = com.aide.common.KeyStrokeDetector.Ws
            if (r1 == 0) goto L7d
            r2 = 3470998291504142863(0x302b768e55179a0f, double:1.1858802056698012E-76)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r9)
            r1 = r0
            r4 = r8
            r6 = r10
            abcd.iy.Mr(r1, r2, r4, r5, r6)
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.common.KeyStrokeDetector.makeKeyStroke(int, android.view.KeyEvent):com.aide.common.KeyStroke");
    }

    @ey(method = 1084114156735046367L)
    private void onKeyStroke(KeyStroke keyStroke) {
        try {
            if (J8) {
                iy.tp(-3856832108462147115L, this, keyStroke);
            }
            we("onKeyStroke " + keyStroke.toString());
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, -3856832108462147115L, this, keyStroke);
            }
            throw th;
        }
    }

    @ey(method = -998189621382317425L)
    private void onMetaKeysDown(int i, boolean z) {
        try {
            if (J8) {
                iy.EQ(801650849126027901L, this, new Integer(i), new Boolean(z));
            }
            we("onMetaKeysDown " + i);
            boolean z2 = true;
            this.leftAlt |= i == 57;
            this.rightAlt |= i == 58;
            this.leftShift |= i == 59;
            this.rightShift |= i == 60;
            this.leftShiftPhysical |= i == 59 && !z;
            this.rightShiftPhysical |= i == 60 && !z;
            this.VH |= i == 0;
            this.leftCtrl |= i == 113;
            boolean z3 = this.rightCtrl;
            if (i != 114) {
                z2 = false;
            }
            this.rightCtrl = z3 | z2;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 801650849126027901L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 14005335356034208L)
    private void onMetaKeysUp(int i, boolean z) {
        try {
            if (J8) {
                iy.EQ(2685077797094764336L, this, new Integer(i), new Boolean(z));
            }
            we("onMetaKeysUp " + i);
            boolean z2 = true;
            this.leftAlt &= i != 57;
            this.rightAlt &= i != 58;
            this.leftShift &= i != 59;
            this.rightShift &= i != 60;
            this.leftShiftPhysical &= i != 59 || z;
            this.rightShiftPhysical &= i != 60 || z;
            this.VH &= i != 0;
            this.leftCtrl &= i != 113;
            boolean z3 = this.rightCtrl;
            if (i == 114) {
                z2 = false;
            }
            this.rightCtrl = z3 & z2;
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 2685077797094764336L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 6510326703949956160L)
    public void we(String str) {
        try {
            if (J8) {
                iy.tp(3044798538389927472L, this, str);
            }
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 3044798538389927472L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 283328999523298729L)
    public void U2() {
        try {
            if (J8) {
                iy.gn(2011926733778531907L, this);
            }
            this.tp = 0;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, 2011926733778531907L, this);
            }
            throw th;
        }
    }

    @ey(method = 2128506753671320141L)
    public InputConnection createInputConnection(View view, KeyStrokeHandler keyStrokeHandler) {
        try {
            if (J8) {
                iy.EQ(960257137080474675L, this, view, keyStrokeHandler);
            }
            return new a(view, true, keyStrokeHandler, view);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, 960257137080474675L, this, view, keyStrokeHandler);
            }
            throw th;
        }
    }

    @ey(method = 1328383884080511108L)
    public boolean isCtrl() {
        try {
            if (J8) {
                iy.gn(-3763531224502629384L, this);
            }
            if (!this.leftCtrl) {
                if (!this.rightCtrl) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Ws) {
                iy.aM(th, -3763531224502629384L, this);
            }
            throw th;
        }
    }

    @ey(method = -2872167292478842596L)
    public void onConfigChange(Context context) {
        try {
            if (J8) {
                iy.tp(1416516942134704880L, this, context);
            }
            boolean z = true;
            if (context.getResources().getConfiguration().keyboard != 1) {
                z = false;
            }
            this.isSoftKeyboard = z;
            we("KeyStrokeDetector.onConfigChange() - isSoftKeyboard: " + this.isSoftKeyboard);
            this.keyCharacterMap = null;
        } catch (Throwable th) {
            if (Ws) {
                iy.j3(th, 1416516942134704880L, this, context);
            }
            throw th;
        }
    }

    @ey(method = -108970164143730645L)
    public void onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (J8) {
                iy.EQ(-1251475993808772111L, this, new Integer(i), keyEvent);
            }
            onMetaKeysDown(i, (keyEvent.getFlags() & 2) != 0);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -1251475993808772111L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = -3028918687677930960L)
    public boolean onKeyDown(int i, KeyEvent keyEvent, KeyStrokeHandler keyStrokeHandler) throws Throwable {
        Throwable th;
        try {
            if (J8) {
                iy.we(3835102424242503428L, this, new Integer(i), keyEvent, keyStrokeHandler);
            }
            J0("onKeyDown", i, keyEvent);
            int i2 = i == 84 ? 57 : i;
            try {
                onMetaKeysDown(i2, (keyEvent.getFlags() & 2) != 0);
                KeyStroke keyStrokeMakeKeyStroke = makeKeyStroke(i2, keyEvent);
                if (keyStrokeMakeKeyStroke == null || !keyStrokeHandler.j6(keyStrokeMakeKeyStroke)) {
                    return i == 84;
                }
                onKeyStroke(keyStrokeMakeKeyStroke);
                return true;
            } catch (Throwable th2) {
                th = th2;
                i = i2;
                if (!Ws) {
                    throw th;
                }
                iy.U2(th, 3835102424242503428L, this, new Integer(i), keyEvent, keyStrokeHandler);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = -261997462410188328L)
    public void onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (J8) {
                iy.EQ(-1071927887052637632L, this, new Integer(i), keyEvent);
            }
            onMetaKeysUp(i, (keyEvent.getFlags() & 2) != 0);
        } catch (Throwable th) {
            if (Ws) {
                iy.Mr(th, -1071927887052637632L, this, new Integer(i), keyEvent);
            }
            throw th;
        }
    }

    @ey(method = -309363470825965921L)
    public boolean onKeyUp(int i, KeyEvent keyEvent, KeyStrokeHandler keyStrokeHandler) throws Throwable {
        Throwable th;
        try {
            if (J8) {
                iy.we(-62291960055867243L, this, new Integer(i), keyEvent, keyStrokeHandler);
            }
            J0("onKeyUp", i, keyEvent);
            int i2 = i == 84 ? 57 : i;
            try {
                onMetaKeysUp(i2, (keyEvent.getFlags() & 2) != 0);
                return i == 84;
            } catch (Throwable th2) {
                th = th2;
                i = i2;
                if (!Ws) {
                    throw th;
                }
                iy.U2(th, -62291960055867243L, this, new Integer(i), keyEvent, keyStrokeHandler);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
