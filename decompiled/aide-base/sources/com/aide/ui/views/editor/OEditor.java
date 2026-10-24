package com.aide.ui.views.editor;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.hy;
import abcd.iy;
import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.View;
import com.aide.ui.views.editor.EditorModel;
import com.aide.ui.views.editor.UndoStack;
import java.io.IOException;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;

@cy(clazz = -7024141317244897083L, container = -7024141317244897083L, user = true)
/* loaded from: classes.dex */
public class OEditor extends OConsole {

    @gy
    private static /* synthetic */ boolean HE;

    @fy
    private static /* synthetic */ boolean uD;

    @dy(field = -3945233994630996012L)
    private InternalState RW;

    @dy(field = -3106106093426974365L)
    private float Vq;

    @dy(field = -842541237641576313L)
    private boolean cX;

    @dy(field = 5236250191966816140L)
    private p0 ir;

    @dy(field = 2276691099511097185L)
    private Hashtable<ActionType, ActionRunnable> k4;

    @dy(field = -4358561000006945476L)
    private Hashtable<ActionType, ActionRunnable> x6;

    @dy(field = 4031675545226538716L)
    private boolean ya;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 1182751901382728943L, container = 1182751901382728943L, user = true)
    public static final class ActionType {

        @fy
        private static /* synthetic */ boolean AR;

        @gy
        private static /* synthetic */ boolean TI;

        @dy(field = 527790904525749540L)
        public static final ActionType abort_chaining;

        @dy(field = -1987675308952174832L)
        public static final ActionType auto_indent;

        @dy(field = -2534089822544501876L)
        private static final /* synthetic */ ActionType[] b1;

        @dy(field = 3264085955998142168L)
        public static final ActionType comment_selection;

        @dy(field = -2386270964314919440L)
        public static final ActionType copy_selection;

        @dy(field = 795701175996947787L)
        public static final ActionType cut_selection;

        @dy(field = -1030297395808268556L)
        public static final ActionType delete_word_left;

        @dy(field = -4893499143982889383L)
        public static final ActionType delete_word_right;

        @dy(field = -4835288021589248491L)
        public static final ActionType emacs_kill_line;

        @dy(field = -4390159945551591495L)
        public static final ActionType indent_selection;

        @dy(field = -6133862470938219012L)
        public static final ActionType insert_line_break;

        @dy(field = 903261737644962047L)
        public static final ActionType insert_tab;

        @dy(field = -460901870874706040L)
        public static final ActionType move_caret_down;

        @dy(field = 148833839751216975L)
        public static final ActionType move_caret_down_select;

        @dy(field = -439866221076596041L)
        public static final ActionType move_caret_left;

        @dy(field = -13540066705792000L)
        public static final ActionType move_caret_left_select;

        @dy(field = 3297241294330354420L)
        public static final ActionType move_caret_page_down;

        @dy(field = 1801632357893091645L)
        public static final ActionType move_caret_page_down_select;

        @dy(field = -6669796182161502433L)
        public static final ActionType move_caret_page_up;

        @dy(field = 997524079282106740L)
        public static final ActionType move_caret_page_up_select;

        @dy(field = -544799943142333536L)
        public static final ActionType move_caret_right;

        @dy(field = -231279346506226131L)
        public static final ActionType move_caret_right_select;

        @dy(field = 1887034589987149856L)
        public static final ActionType move_caret_to_beginning_of_line;

        @dy(field = -701290567793271267L)
        public static final ActionType move_caret_to_beginning_of_line_select;

        @dy(field = 1907923343331564975L)
        public static final ActionType move_caret_to_beginning_of_text;

        @dy(field = 1388664615203695872L)
        public static final ActionType move_caret_to_beginning_of_text_in_line;

        @dy(field = 4930469348515266731L)
        public static final ActionType move_caret_to_beginning_of_text_in_line_select;

        @dy(field = -452528928923795200L)
        public static final ActionType move_caret_to_beginning_of_text_select;

        @dy(field = 7803774398014116L)
        public static final ActionType move_caret_to_end_of_line;

        @dy(field = -1443468812598175995L)
        public static final ActionType move_caret_to_end_of_line_select;

        @dy(field = 13974924356069079L)
        public static final ActionType move_caret_to_end_of_text;

        @dy(field = 278309671258307268L)
        public static final ActionType move_caret_to_end_of_text_select;

        @dy(field = -1695582120386717807L)
        public static final ActionType move_caret_up;

        @dy(field = 5808198084938383464L)
        public static final ActionType move_caret_up_select;

        @dy(field = 4103043902518935776L)
        public static final ActionType move_caret_word_left;

        @dy(field = -2929541364605846523L)
        public static final ActionType move_caret_word_left_select;

        @dy(field = -8630476410421642023L)
        public static final ActionType move_caret_word_right;

        @dy(field = 3042994961873450080L)
        public static final ActionType move_caret_word_right_select;

        @dy(field = 3219264168475178179L)
        public static final ActionType move_to_matching_paren_select;

        @dy(field = 3706931002328364960L)
        public static final ActionType paste_selection;

        @dy(field = -2479640800356382320L)
        public static final ActionType redo;

        @dy(field = 230449811662855740L)
        public static final ActionType remove_current_character;

        @dy(field = 4673851799150960811L)
        public static final ActionType remove_current_line;

        @dy(field = -458839458958479136L)
        public static final ActionType remove_preceding_character;

        @dy(field = -5887988459318215411L)
        public static final ActionType remove_selection;

        @dy(field = 1563847638166991640L)
        public static final ActionType select_all;

        @dy(field = -1070555168389621655L)
        public static final ActionType swap_with_clipboard;

        @dy(field = -2144896872891070092L)
        public static final ActionType toggle_overwrite_mode;

        @dy(field = -541076849506528335L)
        public static final ActionType uncomment_selection;

        @dy(field = -2480504465247255312L)
        public static final ActionType undo;

        @dy(field = -685530951104918688L)
        public static final ActionType unindent_selection;

        static {
            try {
                iy.Zo(ActionType.class);
                if (AR) {
                    iy.gn(2272324260208590841L, null);
                }
                move_caret_left = new ActionType("move_caret_left", 0);
                move_caret_right = new ActionType("move_caret_right", 1);
                move_caret_up = new ActionType("move_caret_up", 2);
                move_caret_down = new ActionType("move_caret_down", 3);
                move_caret_page_up = new ActionType("move_caret_page_up", 4);
                move_caret_page_down = new ActionType("move_caret_page_down", 5);
                move_caret_to_beginning_of_line = new ActionType("move_caret_to_beginning_of_line", 6);
                move_caret_to_beginning_of_text_in_line = new ActionType("move_caret_to_beginning_of_text_in_line", 7);
                move_caret_to_end_of_line = new ActionType("move_caret_to_end_of_line", 8);
                move_caret_to_beginning_of_text = new ActionType("move_caret_to_beginning_of_text", 9);
                move_caret_to_end_of_text = new ActionType("move_caret_to_end_of_text", 10);
                move_caret_word_left = new ActionType("move_caret_word_left", 11);
                move_caret_word_right = new ActionType("move_caret_word_right", 12);
                move_to_matching_paren_select = new ActionType("move_to_matching_paren_select", 13);
                move_caret_left_select = new ActionType("move_caret_left_select", 14);
                move_caret_right_select = new ActionType("move_caret_right_select", 15);
                move_caret_up_select = new ActionType("move_caret_up_select", 16);
                move_caret_down_select = new ActionType("move_caret_down_select", 17);
                move_caret_page_up_select = new ActionType("move_caret_page_up_select", 18);
                move_caret_page_down_select = new ActionType("move_caret_page_down_select", 19);
                move_caret_to_beginning_of_line_select = new ActionType("move_caret_to_beginning_of_line_select", 20);
                move_caret_to_beginning_of_text_in_line_select = new ActionType("move_caret_to_beginning_of_text_in_line_select", 21);
                move_caret_to_end_of_line_select = new ActionType("move_caret_to_end_of_line_select", 22);
                move_caret_to_beginning_of_text_select = new ActionType("move_caret_to_beginning_of_text_select", 23);
                move_caret_to_end_of_text_select = new ActionType("move_caret_to_end_of_text_select", 24);
                move_caret_word_left_select = new ActionType("move_caret_word_left_select", 25);
                move_caret_word_right_select = new ActionType("move_caret_word_right_select", 26);
                delete_word_left = new ActionType("delete_word_left", 27);
                delete_word_right = new ActionType("delete_word_right", 28);
                select_all = new ActionType("select_all", 29);
                paste_selection = new ActionType("paste_selection", 30);
                auto_indent = new ActionType("auto_indent", 31);
                comment_selection = new ActionType("comment_selection", 32);
                uncomment_selection = new ActionType("uncomment_selection", 33);
                insert_line_break = new ActionType("insert_line_break", 34);
                insert_tab = new ActionType("insert_tab", 35);
                remove_preceding_character = new ActionType("remove_preceding_character", 36);
                remove_current_character = new ActionType("remove_current_character", 37);
                remove_current_line = new ActionType("remove_current_line", 38);
                toggle_overwrite_mode = new ActionType("toggle_overwrite_mode", 39);
                undo = new ActionType("undo", 40);
                redo = new ActionType("redo", 41);
                cut_selection = new ActionType("cut_selection", 42);
                copy_selection = new ActionType("copy_selection", 43);
                remove_selection = new ActionType("remove_selection", 44);
                swap_with_clipboard = new ActionType("swap_with_clipboard", 45);
                indent_selection = new ActionType("indent_selection", 46);
                unindent_selection = new ActionType("unindent_selection", 47);
                emacs_kill_line = new ActionType("emacs_kill_line", 48);
                ActionType actionType = new ActionType("abort_chaining", 49);
                abort_chaining = actionType;
                b1 = new ActionType[]{move_caret_left, move_caret_right, move_caret_up, move_caret_down, move_caret_page_up, move_caret_page_down, move_caret_to_beginning_of_line, move_caret_to_beginning_of_text_in_line, move_caret_to_end_of_line, move_caret_to_beginning_of_text, move_caret_to_end_of_text, move_caret_word_left, move_caret_word_right, move_to_matching_paren_select, move_caret_left_select, move_caret_right_select, move_caret_up_select, move_caret_down_select, move_caret_page_up_select, move_caret_page_down_select, move_caret_to_beginning_of_line_select, move_caret_to_beginning_of_text_in_line_select, move_caret_to_end_of_line_select, move_caret_to_beginning_of_text_select, move_caret_to_end_of_text_select, move_caret_word_left_select, move_caret_word_right_select, delete_word_left, delete_word_right, select_all, paste_selection, auto_indent, comment_selection, uncomment_selection, insert_line_break, insert_tab, remove_preceding_character, remove_current_character, remove_current_line, toggle_overwrite_mode, undo, redo, cut_selection, copy_selection, remove_selection, swap_with_clipboard, indent_selection, unindent_selection, emacs_kill_line, actionType};
            } catch (Throwable th) {
                if (TI) {
                    iy.aM(th, 2272324260208590841L, null);
                }
                throw th;
            }
        }

        @ey(method = -140409260257061760L)
        private ActionType(String str, int i) {
            try {
                if (AR) {
                    iy.EQ(5131884628827833352L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (TI) {
                    iy.Mr(th, 5131884628827833352L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -501955753258954575L)
        public static ActionType valueOf(String str) {
            try {
                if (AR) {
                    iy.tp(-172604198952922451L, null, str);
                }
                return (ActionType) Enum.valueOf(ActionType.class, str);
            } catch (Throwable th) {
                if (TI) {
                    iy.j3(th, -172604198952922451L, null, str);
                }
                throw th;
            }
        }

        @ey(method = 1091443018602868567L)
        public static ActionType[] values() {
            try {
                if (AR) {
                    iy.gn(-628726747249784901L, null);
                }
                return (ActionType[]) b1.clone();
            } catch (Throwable th) {
                if (TI) {
                    iy.aM(th, -628726747249784901L, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @cy(clazz = 1194118763430926840L, container = 1194118763430926840L, user = true)
    private static final class InternalState {

        @dy(field = 1781873856434211840L)
        private static final /* synthetic */ InternalState[] AL;

        @dy(field = -3862988480578607376L)
        public static final InternalState BACKSPACING;

        @dy(field = 2907797594000208216L)
        public static final InternalState DELETING;

        @dy(field = -6635938882421973488L)
        public static final InternalState EMACS_KILLING_LINES;

        @dy(field = -2188944568045736095L)
        public static final InternalState INSERTING;

        @dy(field = -2112849203171193760L)
        public static final InternalState MOVING_VERTICALLY;

        @dy(field = -1903048046922062456L)
        public static final InternalState NONE;

        @dy(field = 1816942110692101500L)
        public static final InternalState OVERWRITING;

        @gy
        private static /* synthetic */ boolean hK;

        @fy
        private static /* synthetic */ boolean w9;

        static {
            try {
                iy.Zo(InternalState.class);
                if (w9) {
                    iy.gn(2031209798570877327L, null);
                }
                NONE = new InternalState("NONE", 0);
                INSERTING = new InternalState("INSERTING", 1);
                OVERWRITING = new InternalState("OVERWRITING", 2);
                DELETING = new InternalState("DELETING", 3);
                BACKSPACING = new InternalState("BACKSPACING", 4);
                MOVING_VERTICALLY = new InternalState("MOVING_VERTICALLY", 5);
                InternalState internalState = new InternalState("EMACS_KILLING_LINES", 6);
                EMACS_KILLING_LINES = internalState;
                AL = new InternalState[]{NONE, INSERTING, OVERWRITING, DELETING, BACKSPACING, MOVING_VERTICALLY, internalState};
            } catch (Throwable th) {
                if (hK) {
                    iy.aM(th, 2031209798570877327L, null);
                }
                throw th;
            }
        }

        @ey(method = -6093879215652296320L)
        private InternalState(String str, int i) {
            try {
                if (w9) {
                    iy.EQ(-4522490331972892129L, null, str, new Integer(i));
                }
            } catch (Throwable th) {
                if (hK) {
                    iy.Mr(th, -4522490331972892129L, null, str, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 877291037566201093L)
        public static InternalState valueOf(String str) {
            try {
                if (w9) {
                    iy.tp(-12119621536620501L, null, str);
                }
                return (InternalState) Enum.valueOf(InternalState.class, str);
            } catch (Throwable th) {
                if (hK) {
                    iy.j3(th, -12119621536620501L, null, str);
                }
                throw th;
            }
        }

        @ey(method = -470298083518082661L)
        public static InternalState[] values() {
            try {
                if (w9) {
                    iy.gn(-223418881024602759L, null);
                }
                return (InternalState[]) AL.clone();
            } catch (Throwable th) {
                if (hK) {
                    iy.aM(th, -223418881024602759L, null);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585112775245396820L, container = -7024141317244897083L, user = true)
    class a extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -501355449691452325L)
        a() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = -624292429023968511L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(23808424427114880L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                if (OEditor.this.getEditorModel().sg() != null) {
                    int caretColumn = OEditor.this.getCaretColumn();
                    int caretLine = OEditor.this.getCaretLine();
                    for (SelectedRegion selectedRegion : OEditor.this.getEditorModel().sg()) {
                        if (selectedRegion.j6(caretLine, caretColumn) && selectedRegion.getEndLine() == caretLine && selectedRegion.getEndColumn() != caretColumn) {
                            OEditor.this.TI(selectedRegion.getEndColumn(), caretLine);
                            return;
                        }
                    }
                }
                OEditor.this.TI(OEditor.this.getModel().getColumnCount(OEditor.this.getCaretLine()), OEditor.this.getCaretLine());
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, 23808424427114880L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585280334653446893L, container = -7024141317244897083L, user = true)
    class a0 extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(a0.class);
        }

        @ey(method = 124862024330302779L)
        a0() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = 2351074206000997155L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(4449827504659710984L, this);
                }
                OEditor.this.getEditorModel().b1();
                OEditor.this.setInternalState(InternalState.NONE);
                OEditor.this.setOverwriteMode(!OEditor.this.getOverwriteMode());
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 4449827504659710984L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585137774461665441L, container = -7024141317244897083L, user = true)
    class b extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -57301394813330759L)
        b() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = 695522731775803887L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-3142531614894363216L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                OEditor.this.TI(0, 0);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -3142531614894363216L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585305333723436992L, container = -7024141317244897083L, user = true)
    class b0 extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(b0.class);
        }

        @ey(method = -430073340995103168L)
        b0() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -1096094760765847544L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(-5811890894636854656L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                OEditor.this.uD();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -5811890894636854656L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585162773673870768L, container = -7024141317244897083L, user = true)
    class c extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -407433676693322916L)
        c() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = 723891432660862640L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-3101020282462000755L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                int lineCount = OEditor.this.getModel().getLineCount() - 1;
                OEditor.this.TI(OEditor.this.getModel().getColumnCount(lineCount), lineCount);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -3101020282462000755L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585330332789363797L, container = -7024141317244897083L, user = true)
    class c0 extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(c0.class);
        }

        @ey(method = -396008456247383400L)
        c0() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -5856481442794500480L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(-5732437030264132741L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                OEditor.this.x6();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -5732437030264132741L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585187772882012801L, container = -7024141317244897083L, user = true)
    class d extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(d.class);
        }

        @ey(method = -519361275801778563L)
        d() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = -504423415464909345L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-3059490187571980632L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                int caretColumn = OEditor.this.getCaretColumn();
                int caretLine = OEditor.this.getCaretLine();
                if (caretColumn == 0) {
                    if (caretLine == 0) {
                        return;
                    }
                    caretLine--;
                    caretColumn = OEditor.this.getModel().getColumnCount(caretLine);
                }
                if (caretColumn != 0 && caretColumn - 1 != 0) {
                    while (caretColumn > 0 && Character.isWhitespace(OEditor.this.getModel().charAtColumnLine(caretColumn, caretLine))) {
                        caretColumn--;
                    }
                    if (caretColumn != 0) {
                        boolean zIsJavaIdentifierPart = Character.isJavaIdentifierPart(OEditor.this.getModel().charAtColumnLine(caretColumn, caretLine));
                        while (caretColumn > 0) {
                            char cCharAtColumnLine = OEditor.this.getModel().charAtColumnLine(caretColumn - 1, caretLine);
                            if (zIsJavaIdentifierPart != Character.isJavaIdentifierPart(cCharAtColumnLine) || Character.isWhitespace(cCharAtColumnLine)) {
                                break;
                            } else {
                                caretColumn--;
                            }
                        }
                    }
                }
                OEditor.this.TI(caretColumn, caretLine);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -3059490187571980632L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585355331851227308L, container = -7024141317244897083L, user = true)
    class d0 extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(d0.class);
        }

        @ey(method = 576022280888479376L)
        d0() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -6323015362566688L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(-5652964403433753164L, this);
                }
                InternalState internalState = OEditor.this.getInternalState();
                OEditor.this.setInternalState(InternalState.EMACS_KILLING_LINES);
                if (OEditor.this.uC()) {
                    boolean z = false;
                    if (OEditor.this.getSelectionVisibility()) {
                        OEditor.this.setSelectionVisibility(false);
                    }
                    int caretColumn = OEditor.this.getCaretColumn();
                    int caretLine = OEditor.this.getCaretLine();
                    int lineCount = OEditor.this.getModel().getLineCount() - 1;
                    if (caretLine == lineCount && caretColumn == OEditor.this.getModel().getColumnCount(lineCount)) {
                        return;
                    }
                    String property = "\n";
                    if (caretColumn == OEditor.this.getModel().getColumnCount(caretLine)) {
                        OEditor.this.getEditorModel().Jm(caretLine, this);
                        if (System.getProperty("os.name").toUpperCase(Locale.US).indexOf("WINDOWS") == -1) {
                            property = System.getProperty("line.separator");
                        }
                        if (internalState == InternalState.EMACS_KILLING_LINES) {
                            OEditor.this.qI(property);
                            return;
                        } else {
                            OEditor.this.oT(property);
                            return;
                        }
                    }
                    if (caretColumn < OEditor.this.getModel().getColumnCount(caretLine)) {
                        int i = caretColumn;
                        while (true) {
                            if (i < OEditor.this.getModel().getColumnCount(caretLine)) {
                                if (OEditor.this.getModel().charAtColumnLine(i, caretLine) != ' ' && OEditor.this.getModel().charAtColumnLine(i, caretLine) != '\t') {
                                    z = true;
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            String str = new String(OEditor.this.getEditorModel().fN(caretColumn, caretLine, OEditor.this.getModel().getColumnCount(caretLine) - caretColumn));
                            if (internalState == InternalState.EMACS_KILLING_LINES) {
                                OEditor.this.qI(str);
                            } else {
                                OEditor.this.oT(str);
                            }
                            OEditor.this.getEditorModel().ce(caretColumn, caretLine, OEditor.this.getModel().getColumnCount(caretLine) - caretColumn, this);
                            return;
                        }
                        String str2 = new String(OEditor.this.getEditorModel().fN(caretColumn, caretLine, OEditor.this.getModel().getColumnCount(caretLine) - caretColumn));
                        if (internalState == InternalState.EMACS_KILLING_LINES) {
                            OEditor.this.qI(str2);
                        } else {
                            OEditor.this.oT(str2);
                        }
                        if (System.getProperty("os.name").toUpperCase(Locale.US).indexOf("WINDOWS") == -1) {
                            property = System.getProperty("line.separator");
                        }
                        OEditor.this.qI(property);
                        OEditor.this.getEditorModel().ce(caretColumn, caretLine, OEditor.this.getModel().getColumnCount(caretLine) - caretColumn, this);
                        OEditor.this.getEditorModel().Jm(caretLine, this);
                    }
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -5652964403433753164L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585212772086091540L, container = -7024141317244897083L, user = true)
    class e extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(e.class);
        }

        @ey(method = -156443158214393175L)
        e() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = -48392834570649577L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-3017941330224302847L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                int caretColumn = OEditor.this.getCaretColumn();
                int caretLine = OEditor.this.getCaretLine();
                if (caretColumn == OEditor.this.getModel().getColumnCount(caretLine)) {
                    if (caretLine == OEditor.this.getModel().getLineCount() - 1) {
                        return;
                    }
                    int i = caretLine + 1;
                    int i2 = 0;
                    while (i2 < OEditor.this.getModel().getColumnCount(i) && Character.isWhitespace(OEditor.this.getModel().charAtColumnLine(i2, i))) {
                        i2++;
                    }
                    OEditor.this.TI(i2, i);
                    return;
                }
                if (caretColumn != OEditor.this.getModel().getColumnCount(caretLine)) {
                    boolean zIsJavaIdentifierPart = Character.isJavaIdentifierPart(OEditor.this.getModel().charAtColumnLine(caretColumn, caretLine));
                    while (caretColumn < OEditor.this.getModel().getColumnCount(caretLine)) {
                        char cCharAtColumnLine = OEditor.this.getModel().charAtColumnLine(caretColumn, caretLine);
                        if (Character.isJavaIdentifierPart(cCharAtColumnLine) != zIsJavaIdentifierPart || Character.isWhitespace(cCharAtColumnLine)) {
                            break;
                        } else {
                            caretColumn++;
                        }
                    }
                    while (caretColumn < OEditor.this.getModel().getColumnCount(caretLine) && Character.isWhitespace(OEditor.this.getModel().charAtColumnLine(caretColumn, caretLine))) {
                        caretColumn++;
                    }
                }
                OEditor.this.TI(caretColumn, caretLine);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -3017941330224302847L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585380330909027525L, container = -7024141317244897083L, user = true)
    class e0 extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(e0.class);
        }

        @ey(method = 234584009478371356L)
        e0() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -497329153333232616L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(-5573473014145715925L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                OEditor.this.getEditorModel().b1();
                OEditor.this.getEditorModel().MP(null);
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -5573473014145715925L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585237771286106985L, container = -7024141317244897083L, user = true)
    class f extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(f.class);
        }

        @ey(method = -183825245146293504L)
        f() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -5560165408682385100L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(527949741026512608L, this);
                }
                if (OEditor.this.uC()) {
                    OEditor.this.setInternalState(InternalState.DELETING);
                    int caretColumn = OEditor.this.getCaretColumn();
                    int caretLine = OEditor.this.getCaretLine();
                    int caretColumn2 = OEditor.this.getCaretColumn();
                    int caretLine2 = OEditor.this.getCaretLine();
                    if (caretColumn2 == 0) {
                        if (caretLine2 == 0) {
                            return;
                        }
                        caretLine2--;
                        caretColumn2 = OEditor.this.getModel().getColumnCount(caretLine2);
                    }
                    if (caretColumn2 != 0 && caretColumn2 - 1 != 0) {
                        while (caretColumn2 > 0 && Character.isWhitespace(OEditor.this.getModel().charAtColumnLine(caretColumn2, caretLine2))) {
                            caretColumn2--;
                        }
                        if (caretColumn2 != 0) {
                            boolean zIsJavaIdentifierPart = Character.isJavaIdentifierPart(OEditor.this.getModel().charAtColumnLine(caretColumn2, caretLine2));
                            while (caretColumn2 > 0) {
                                char cCharAtColumnLine = OEditor.this.getModel().charAtColumnLine(caretColumn2 - 1, caretLine2);
                                if (zIsJavaIdentifierPart != Character.isJavaIdentifierPart(cCharAtColumnLine) || Character.isWhitespace(cCharAtColumnLine)) {
                                    break;
                                } else {
                                    caretColumn2--;
                                }
                            }
                        }
                    }
                    OEditor.this.getEditorModel().Bx(new SelectedRegion(caretLine2, caretColumn2, caretLine, caretColumn - 1), OEditor.this);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 527949741026512608L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665511264729404600L, container = -7024141317244897083L, user = true)
    class f0 extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(f0.class);
        }

        @ey(method = -179438218190016739L)
        f0() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = -1012779924696352477L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-204569473767422085L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                int caretColumn = OEditor.this.getCaretColumn();
                int caretLine = OEditor.this.getCaretLine();
                if (caretColumn != OEditor.this.getModel().getColumnCount(caretLine)) {
                    OEditor.this.TI(caretColumn + 1, caretLine);
                } else if (caretLine != OEditor.this.getModel().getLineCount() - 1) {
                    OEditor.this.TI(0, caretLine + 1);
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -204569473767422085L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585262770482059136L, container = -7024141317244897083L, user = true)
    class g extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(g.class);
        }

        @ey(method = -475933622460320609L)
        g() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -4451555222543862801L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(600251803537202883L, this);
                }
                if (OEditor.this.uC()) {
                    OEditor.this.setInternalState(InternalState.DELETING);
                    int caretColumn = OEditor.this.getCaretColumn();
                    int caretLine = OEditor.this.getCaretLine();
                    int caretColumn2 = OEditor.this.getCaretColumn();
                    int caretLine2 = OEditor.this.getCaretLine();
                    if (caretColumn2 == OEditor.this.getModel().getColumnCount(caretLine2)) {
                        if (caretLine2 == OEditor.this.getModel().getLineCount() - 1) {
                            return;
                        }
                        int i = caretLine2 + 1;
                        int i2 = 0;
                        while (i2 < OEditor.this.getModel().getColumnCount(i) && Character.isWhitespace(OEditor.this.getModel().charAtColumnLine(i2, i))) {
                            i2++;
                        }
                        OEditor.this.getEditorModel().Bx(new SelectedRegion(caretLine, caretColumn, i, i2 - 1), OEditor.this);
                        return;
                    }
                    if (caretColumn2 != OEditor.this.getModel().getColumnCount(caretLine2)) {
                        boolean zIsJavaIdentifierPart = Character.isJavaIdentifierPart(OEditor.this.getModel().charAtColumnLine(caretColumn2, caretLine2));
                        while (caretColumn2 < OEditor.this.getModel().getColumnCount(caretLine2)) {
                            char cCharAtColumnLine = OEditor.this.getModel().charAtColumnLine(caretColumn2, caretLine2);
                            if (Character.isJavaIdentifierPart(cCharAtColumnLine) != zIsJavaIdentifierPart || Character.isWhitespace(cCharAtColumnLine)) {
                                break;
                            } else {
                                caretColumn2++;
                            }
                        }
                        while (caretColumn2 < OEditor.this.getModel().getColumnCount(caretLine2) && Character.isWhitespace(OEditor.this.getModel().charAtColumnLine(caretColumn2, caretLine2))) {
                            caretColumn2++;
                        }
                    }
                    OEditor.this.getEditorModel().Bx(new SelectedRegion(caretLine, caretColumn, caretLine2, caretColumn2 - 1), OEditor.this);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 600251803537202883L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665555975504378317L, container = -7024141317244897083L, user = true)
    class g0 extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(g0.class);
        }

        @ey(method = 332279771567100125L)
        g0() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = 984924487694774295L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-172000347112604076L, this);
                }
                int caretLine = OEditor.this.getCaretLine();
                int caretColumn = OEditor.this.getCaretColumn();
                if (caretLine == 0) {
                    View viewFocusSearch = OEditor.this.focusSearch(33);
                    if (viewFocusSearch != null) {
                        viewFocusSearch.requestFocus();
                        return;
                    }
                    return;
                }
                if (OEditor.this.getInternalState() != InternalState.MOVING_VERTICALLY) {
                    OEditor.this.setInternalState(InternalState.MOVING_VERTICALLY);
                    OEditor.this.setIntendedColumnX(OEditor.this.jO(caretColumn, caretLine));
                }
                while (caretLine > 0) {
                    caretLine--;
                    if (!OEditor.this.n5(caretLine)) {
                        OEditor.this.TI(OEditor.this.kQ(OEditor.this.getIntendedColumnX(), caretLine), caretLine);
                        return;
                    }
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -172000347112604076L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585287769673947993L, container = -7024141317244897083L, user = true)
    class h extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(h.class);
        }

        @ey(method = 290772696809910335L)
        h() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -2145135631092192225L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(672572628505550820L, this);
                }
                OEditor.this.RW();
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 672572628505550820L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665600686283415328L, container = -7024141317244897083L, user = true)
    class h0 extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(h0.class);
        }

        @ey(method = 265546676881105920L)
        h0() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = 906642220886162824L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-139412458000128405L, this);
                }
                int caretLine = OEditor.this.getCaretLine();
                int caretColumn = OEditor.this.getCaretColumn();
                if (OEditor.this.getInternalState() != InternalState.MOVING_VERTICALLY) {
                    OEditor.this.setInternalState(InternalState.MOVING_VERTICALLY);
                    OEditor.this.setIntendedColumnX(OEditor.this.jO(caretColumn, caretLine));
                }
                while (caretLine < OEditor.this.getModel().getLineCount() - 1) {
                    caretLine++;
                    if (!OEditor.this.n5(caretLine)) {
                        OEditor.this.TI(OEditor.this.kQ(OEditor.this.getIntendedColumnX(), caretLine), caretLine);
                        return;
                    }
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -139412458000128405L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585312768861773556L, container = -7024141317244897083L, user = true)
    class i extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(i.class);
        }

        @ey(method = 304874534692556088L)
        i() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -3979142226732155700L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(744912215931556419L, this);
                }
                OEditor.this.tj();
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 744912215931556419L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665645397066515633L, container = -7024141317244897083L, user = true)
    class i0 extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(i0.class);
        }

        @ey(method = -532065451562339608L)
        i0() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = 611372807622604676L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-106805806429995072L, this);
                }
                int caretLine = OEditor.this.getCaretLine();
                int caretColumn = OEditor.this.getCaretColumn();
                if (OEditor.this.getInternalState() != InternalState.MOVING_VERTICALLY) {
                    OEditor.this.setInternalState(InternalState.MOVING_VERTICALLY);
                    OEditor.this.setIntendedColumnX(OEditor.this.jO(caretColumn, caretLine));
                }
                int i = 0;
                while (caretLine > 0 && (i < 10 || OEditor.this.n5(caretLine))) {
                    caretLine--;
                    if (!OEditor.this.n5(caretLine)) {
                        i++;
                    }
                }
                OEditor.this.TI(OEditor.this.kQ(OEditor.this.getIntendedColumnX(), caretLine), caretLine);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -106805806429995072L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585337768045535825L, container = -7024141317244897083L, user = true)
    class j extends q0 {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        static {
            iy.Zo(j.class);
        }

        @ey(method = -470210589157887927L)
        j() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.q0
        @ey(method = -189404733367484777L)
        public void DW() {
            try {
                if (VH) {
                    iy.gn(-5701729153265574705L, this);
                }
                OEditor.this.b();
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, -5701729153265574705L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665690107853679232L, container = -7024141317244897083L, user = true)
    class j0 extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(j0.class);
        }

        @ey(method = -450473044183752480L)
        j0() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = 824585382145044468L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-74180392402204077L, this);
                }
                int caretLine = OEditor.this.getCaretLine();
                int caretColumn = OEditor.this.getCaretColumn();
                if (OEditor.this.getInternalState() != InternalState.MOVING_VERTICALLY) {
                    OEditor.this.setInternalState(InternalState.MOVING_VERTICALLY);
                    OEditor.this.setIntendedColumnX(OEditor.this.jO(caretColumn, caretLine));
                }
                int i = 0;
                while (caretLine < OEditor.this.getModel().getLineCount() - 1 && (i < 10 || OEditor.this.n5(caretLine))) {
                    caretLine++;
                    if (!OEditor.this.n5(caretLine)) {
                        i++;
                    }
                }
                OEditor.this.TI(OEditor.this.kQ(OEditor.this.getIntendedColumnX(), caretLine), caretLine);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -74180392402204077L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665421843191647048L, container = -7024141317244897083L, user = true)
    class k implements com.aide.ui.views.editor.e {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(k.class);
        }

        @ey(method = 35637068862513915L)
        k() {
        }

        @Override // com.aide.ui.views.editor.e
        @ey(method = 2071674735252409320L)
        public void DW(EditorModel editorModel, List<SelectedRegion> list) {
            try {
                if (DW) {
                    iy.EQ(-3678248835393351552L, this, editorModel, list);
                }
                OEditor.this.nl(ActionType.abort_chaining).setEnabled(true);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -3678248835393351552L, this, editorModel, list);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.e
        @ey(method = -795645540091381005L)
        public void j6(EditorModel editorModel) {
            try {
                if (DW) {
                    iy.tp(-1818513108250604591L, this, editorModel);
                }
                OEditor.this.nl(ActionType.abort_chaining).setEnabled(false);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -1818513108250604591L, this, editorModel);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665734818644906125L, container = -7024141317244897083L, user = true)
    class k0 extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(k0.class);
        }

        @ey(method = -622829979925487160L)
        k0() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = -245802946082680400L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-41536215916755420L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                OEditor.this.TI(0, OEditor.this.getCaretLine());
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -41536215916755420L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -2655266564251408744L, container = -7024141317244897083L, user = true)
    class l extends AbstractEditorAction {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -3292638245215380568L)
        private m0 v5;

        static {
            iy.Zo(l.class);
        }

        @ey(method = -611577837952610157L)
        public l(m0 m0Var) {
            this.v5 = m0Var;
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -490574696886956333L)
        public void j6() {
            try {
                if (VH) {
                    iy.gn(455666440973479995L, this);
                }
                if (!OEditor.this.getSelectionVisibility()) {
                    OEditor.this.Lz(OEditor.this.getCaretColumn(), OEditor.this.getCaretLine(), true);
                }
                OEditor.this.cX = true;
                this.v5.j6();
                OEditor.this.cX = false;
                OEditor.this.sT(OEditor.this.getCaretColumn(), OEditor.this.getCaretLine());
                OEditor.this.setSelectionVisibility(true);
            } catch (Throwable th) {
                if (gn) {
                    iy.aM(th, 455666440973479995L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665779529440196312L, container = -7024141317244897083L, user = true)
    class l0 extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(l0.class);
        }

        @ey(method = -240521406154765420L)
        l0() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = 506345429466861968L)
        public void DW() {
            char cCharAtColumnLine;
            try {
                if (u7) {
                    iy.gn(-8873276973649101L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                int caretColumn = OEditor.this.getCaretColumn();
                int caretLine = OEditor.this.getCaretLine();
                if (OEditor.this.getEditorModel().sg() != null) {
                    for (SelectedRegion selectedRegion : OEditor.this.getEditorModel().sg()) {
                        if (selectedRegion.j6(caretLine, caretColumn) && selectedRegion.getStartLine() == caretLine && selectedRegion.getStartColumn() != caretColumn) {
                            OEditor.this.TI(selectedRegion.getStartColumn(), caretLine);
                            return;
                        }
                    }
                }
                EditorModel editorModel = OEditor.this.getEditorModel();
                int i = 0;
                int i2 = 0;
                while (i2 < editorModel.getColumnCount(caretLine) && ((cCharAtColumnLine = editorModel.charAtColumnLine(i2, caretLine)) == '\t' || cCharAtColumnLine == ' ')) {
                    i2++;
                }
                if (i2 != caretColumn && i2 != editorModel.getColumnCount(caretLine)) {
                    i = i2;
                }
                OEditor.this.TI(i, caretLine);
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -8873276973649101L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585159056458207979L, container = -7024141317244897083L, user = true)
    class m extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(m.class);
        }

        @ey(method = 217879607297609497L)
        m() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = 1459326064175625697L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(817270565815219680L, this);
                }
                OEditor.this.fP();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 817270565815219680L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 4750518270066861695L, container = 4750518270066861695L, user = true)
    private abstract class m0 extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 1677719422117047237L)
        @hy
        final /* synthetic */ OEditor v5;

        static {
            iy.Zo(m0.class);
        }

        @ey(method = 515513674692184368L)
        private m0(OEditor oEditor) {
            try {
                if (Zo) {
                    iy.tp(1482087938130850048L, null, oEditor);
                }
                this.v5 = oEditor;
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, 1482087938130850048L, null, oEditor);
                }
                throw th;
            }
        }

        @ey(method = -267600765710795832L)
        protected abstract void DW();

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -1070324116951694544L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(-2284437763922340600L, this);
                }
                if (this.v5.getSelectionVisibility() && !this.v5.cX) {
                    this.v5.setSelectionVisibility(false);
                }
                DW();
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, -2284437763922340600L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 127729903443900417L)
        /* synthetic */ m0(OEditor oEditor, k kVar) {
            this(oEditor);
            try {
                if (Zo) {
                    iy.EQ(-3209061721271314167L, null, oEditor, kVar);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.Mr(th, -3209061721271314167L, null, oEditor, kVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585184055607432280L, container = -7024141317244897083L, user = true)
    class n extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(n.class);
        }

        @ey(method = -152699246867116020L)
        n() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = 979984509454287792L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(889647678156540603L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                if (OEditor.this.uC()) {
                    OEditor.this.getEditorModel().b1();
                    OEditor.this.TI(OEditor.this.getFirstSelectedColumn(), OEditor.this.getFirstSelectedLine());
                    OEditor.this.k4();
                    OEditor.this.getEditorModel().b1();
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 889647678156540603L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585209054752593287L, container = -7024141317244897083L, user = true)
    class o extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(o.class);
        }

        @ey(method = 49699053962011311L)
        o() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -5984650242972138717L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(962043552955519188L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                OEditor.this.uC();
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 962043552955519188L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585234053893691000L, container = -7024141317244897083L, user = true)
    class p extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(p.class);
        }

        @ey(method = -432661475260800000L)
        p() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -597879713975497016L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(1034458190212155435L, this);
                }
                OEditor.this.d8();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 1034458190212155435L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -803903492211285444L, container = -803903492211285444L, user = true)
    private class p0 implements EditorModel.i {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 1487671854814173624L)
        @hy
        final /* synthetic */ OEditor j6;

        static {
            iy.Zo(p0.class);
        }

        @ey(method = 7455228843835019L)
        private p0(OEditor oEditor) {
            try {
                if (DW) {
                    iy.tp(93407825932287283L, null, oEditor);
                }
                this.j6 = oEditor;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 93407825932287283L, null, oEditor);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = 3691605876411350261L)
        public void DW(EditorModel editorModel, boolean z) {
            try {
                if (DW) {
                    iy.EQ(529995937255524984L, this, editorModel, new Boolean(z));
                }
                this.j6.nl(ActionType.redo).setEnabled(z);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 529995937255524984L, this, editorModel, new Boolean(z));
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = 1494861217593235800L)
        public void FH() {
            try {
                if (DW) {
                    iy.gn(-5307221917885433755L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -5307221917885433755L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = 1450117371916537600L)
        public void Hw() {
            try {
                if (DW) {
                    iy.gn(-128011818652139657L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -128011818652139657L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = -432795291049874520L)
        public void Zo() {
            try {
                if (DW) {
                    iy.gn(-1930623101992327275L, this);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -1930623101992327275L, this);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = -4543444181368066800L)
        public void j6(List<UndoStack.j> list) {
            try {
                if (DW) {
                    iy.tp(4782624687642184943L, this, list);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 4782624687642184943L, this, list);
                }
                throw th;
            }
        }

        @Override // com.aide.ui.views.editor.EditorModel.i
        @ey(method = -4869860392220929201L)
        public void v5(EditorModel editorModel, boolean z) {
            try {
                if (DW) {
                    iy.EQ(3750381803794181724L, this, editorModel, new Boolean(z));
                }
                this.j6.nl(ActionType.undo).setEnabled(z);
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 3750381803794181724L, this, editorModel, new Boolean(z));
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 5934431423377304540L)
        /* synthetic */ p0(OEditor oEditor, k kVar) {
            this(oEditor);
            try {
                if (DW) {
                    iy.EQ(-3290297447485926420L, null, oEditor, kVar);
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, -3290297447485926420L, null, oEditor, kVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585259053030725419L, container = -7024141317244897083L, user = true)
    class q extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(q.class);
        }

        @ey(method = 283393993428533468L)
        q() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -460751859401764920L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(3724119544285915485L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                if (OEditor.this.uC()) {
                    OEditor.this.zf();
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 3724119544285915485L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5994977520622366681L, container = -5994977520622366681L, user = true)
    private abstract class q0 extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        @dy(field = -1571134404521091939L)
        @hy
        final /* synthetic */ OEditor FH;

        static {
            iy.Zo(q0.class);
        }

        @ey(method = 418796548839741156L)
        private q0(OEditor oEditor) {
            try {
                if (Hw) {
                    iy.tp(-49777440452553120L, null, oEditor);
                }
                this.FH = oEditor;
            } catch (Throwable th) {
                if (v5) {
                    iy.j3(th, -49777440452553120L, null, oEditor);
                }
                throw th;
            }
        }

        @ey(method = -996809623243629416L)
        protected abstract void DW();

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = 3675050407267845216L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(-1984162627731228256L, this);
                }
                if (this.FH.getSelectionVisibility()) {
                    DW();
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, -1984162627731228256L, this);
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = 327239654556718373L)
        /* synthetic */ q0(OEditor oEditor, k kVar) {
            this(oEditor);
            try {
                if (Hw) {
                    iy.EQ(-6356651575911578139L, null, oEditor, kVar);
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.Mr(th, -6356651575911578139L, null, oEditor, kVar);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585284052163696544L, container = -7024141317244897083L, user = true)
    class r extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(r.class);
        }

        @ey(method = -3762827690671115L)
        r() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -1956780978986682499L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(3804678712274595448L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                if (OEditor.this.uC()) {
                    OEditor.this.ir();
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 3804678712274595448L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585309051292604375L, container = -7024141317244897083L, user = true)
    class s extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(s.class);
        }

        @ey(method = 311513387687901223L)
        s() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -3684885065635065765L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(3885256642720933073L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                if (OEditor.this.uC()) {
                    OEditor.this.sv();
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 3885256642720933073L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585334050417448912L, container = -7024141317244897083L, user = true)
    class t extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(t.class);
        }

        @ey(method = 89507056323740344L)
        t() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = 2911441969364585792L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(3965853335624928360L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                if (OEditor.this.uC()) {
                    OEditor.this.cX();
                }
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 3965853335624928360L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585359049538230155L, container = -7024141317244897083L, user = true)
    class u extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(u.class);
        }

        @ey(method = -12269442541423977L)
        u() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = 5827659575666152887L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(4046468790986581309L, this);
                }
                if (OEditor.this.uC()) {
                    OEditor.this.setInternalState(InternalState.INSERTING);
                    if (OEditor.this.getSelectionVisibility()) {
                        OEditor.this.getEditorModel().b1();
                        OEditor.this.k4();
                        OEditor.this.TI(OEditor.this.getFirstSelectedColumn(), OEditor.this.getFirstSelectedLine());
                        OEditor.this.setSelectionVisibility(false);
                    }
                    int caretLine = OEditor.this.getCaretLine();
                    int caretColumn = OEditor.this.getCaretColumn();
                    OEditor.this.getEditorModel().sM(caretColumn, caretLine, OEditor.this);
                    OEditor.this.iK(caretLine, caretColumn);
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 4046468790986581309L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585384048654948104L, container = -7024141317244897083L, user = true)
    class v extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(v.class);
        }

        @ey(method = 109509410289495403L)
        v() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -3498151407576521325L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(4127103008805891920L, this);
                }
                OEditor.this.qU();
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 4127103008805891920L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 2665466553958494177L, container = -7024141317244897083L, user = true)
    class w extends m0 {

        @gy
        private static /* synthetic */ boolean tp;

        @fy
        private static /* synthetic */ boolean u7;

        static {
            iy.Zo(w.class);
        }

        @ey(method = 351449917109867520L)
        w() {
            super(OEditor.this, null);
        }

        @Override // com.aide.ui.views.editor.OEditor.m0
        @ey(method = -518357536888797400L)
        public void DW() {
            try {
                if (u7) {
                    iy.gn(-237119837964582432L, this);
                }
                OEditor.this.setInternalState(InternalState.NONE);
                int caretColumn = OEditor.this.getCaretColumn();
                int caretLine = OEditor.this.getCaretLine();
                if (caretLine == 0 && caretColumn == 0) {
                    View viewFocusSearch = OEditor.this.focusSearch(33);
                    if (viewFocusSearch != null) {
                        viewFocusSearch.requestFocus();
                        return;
                    }
                    return;
                }
                if (caretColumn != 0) {
                    OEditor.this.TI(caretColumn - 1, caretLine);
                } else if (caretLine != 0) {
                    int i = caretLine - 1;
                    OEditor.this.TI(OEditor.this.getModel().getColumnCount(i), i);
                }
            } catch (Throwable th) {
                if (tp) {
                    iy.aM(th, -237119837964582432L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585205337419096832L, container = -7024141317244897083L, user = true)
    class x extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(x.class);
        }

        @ey(method = -250829544514042525L)
        x() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -4726216352105864585L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(4207755989082860193L, this);
                }
                if (OEditor.this.uC()) {
                    if (OEditor.this.getSelectionVisibility()) {
                        OEditor.this.setInternalState(InternalState.NONE);
                        OEditor.this.getEditorModel().b1();
                        OEditor.this.TI(OEditor.this.getFirstSelectedColumn(), OEditor.this.getFirstSelectedLine());
                        OEditor.this.k4();
                        OEditor.this.getEditorModel().b1();
                        return;
                    }
                    OEditor.this.setInternalState(InternalState.BACKSPACING);
                    int caretLine = OEditor.this.getCaretLine();
                    int caretColumn = OEditor.this.getCaretColumn();
                    if (caretColumn != 0) {
                        OEditor.this.getEditorModel().Pa(caretColumn - 1, caretLine, OEditor.this);
                    } else if (caretLine != 0) {
                        OEditor.this.getEditorModel().Jm(caretLine - 1, OEditor.this);
                    }
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 4207755989082860193L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585230336501276813L, container = -7024141317244897083L, user = true)
    class y extends AbstractEditorAction {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        static {
            iy.Zo(y.class);
        }

        @ey(method = -191216031823469971L)
        y() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = 4378867859772188361L)
        public void j6() {
            try {
                if (Zo) {
                    iy.gn(4288427731817486128L, this);
                }
                if (OEditor.this.uC()) {
                    if (OEditor.this.getSelectionVisibility()) {
                        OEditor.this.setInternalState(InternalState.NONE);
                        OEditor.this.getEditorModel().b1();
                        OEditor.this.TI(OEditor.this.getFirstSelectedColumn(), OEditor.this.getFirstSelectedLine());
                        OEditor.this.k4();
                        OEditor.this.getEditorModel().b1();
                        return;
                    }
                    OEditor.this.setInternalState(InternalState.DELETING);
                    int caretLine = OEditor.this.getCaretLine();
                    int caretColumn = OEditor.this.getCaretColumn();
                    if (caretColumn != OEditor.this.getEditorModel().getColumnCount(caretLine)) {
                        OEditor.this.getEditorModel().Pa(caretColumn, caretLine, OEditor.this);
                    } else if (caretLine != OEditor.this.getEditorModel().getLineCount() - 1) {
                        OEditor.this.getEditorModel().Jm(caretLine, OEditor.this);
                    }
                }
            } catch (Throwable th) {
                if (VH) {
                    iy.aM(th, 4288427731817486128L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -1585255335579393500L, container = -7024141317244897083L, user = true)
    class z extends AbstractAction {

        @fy
        private static /* synthetic */ boolean Hw;

        @gy
        private static /* synthetic */ boolean v5;

        static {
            iy.Zo(z.class);
        }

        @ey(method = 257779761251742103L)
        z() {
        }

        @Override // com.aide.ui.views.editor.ActionRunnable
        @ey(method = -1957329447019760969L)
        public void j6() {
            try {
                if (Hw) {
                    iy.gn(4369118237009769725L, this);
                }
                OEditor.this.u9();
            } catch (Throwable th) {
                if (v5) {
                    iy.aM(th, 4369118237009769725L, this);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(OEditor.class);
            if (uD) {
                iy.gn(2295472096954387232L, null);
            }
            System.getProperty("os.name").startsWith("Windows");
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 2295472096954387232L, null);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 146329304345778600L)
    public OEditor(Context context) {
        super(context);
        try {
            if (uD) {
                iy.tp(-169470605631496929L, null, context);
            }
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, -169470605631496929L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -74179821038104635L)
    private void HE() {
        try {
            if (uD) {
                iy.gn(459553439474085024L, this);
            }
            Enumeration<ActionRunnable> enumerationElements = this.k4.elements();
            while (enumerationElements.hasMoreElements()) {
                enumerationElements.nextElement().setEnabled(getSelectionVisibility());
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 459553439474085024L, this);
            }
            throw th;
        }
    }

    @ey(method = 470971523793072708L)
    private void HT() {
        try {
            if (uD) {
                iy.gn(-420696701264727309L, this);
            }
            this.x6 = new Hashtable<>();
            this.k4 = new Hashtable<>();
            this.ir = new p0(this, null);
            getEditorModel().zh(this.ir);
            getEditorModel().fY(new k());
            wE(ActionType.move_caret_left, new w());
            wE(ActionType.move_caret_right, new f0());
            wE(ActionType.move_caret_up, new g0());
            wE(ActionType.move_caret_down, new h0());
            wE(ActionType.move_caret_page_up, new i0());
            wE(ActionType.move_caret_page_down, new j0());
            wE(ActionType.move_caret_to_beginning_of_line, new k0());
            wE(ActionType.move_caret_to_beginning_of_text_in_line, new l0());
            wE(ActionType.move_caret_to_end_of_line, new a());
            wE(ActionType.move_caret_to_beginning_of_text, new b());
            wE(ActionType.move_caret_to_end_of_text, new c());
            wE(ActionType.move_caret_word_left, new d());
            wE(ActionType.move_caret_word_right, new e());
            om(ActionType.move_caret_left_select, new l((m0) nl(ActionType.move_caret_left)));
            om(ActionType.move_caret_right_select, new l((m0) nl(ActionType.move_caret_right)));
            om(ActionType.move_caret_up_select, new l((m0) nl(ActionType.move_caret_up)));
            om(ActionType.move_caret_down_select, new l((m0) nl(ActionType.move_caret_down)));
            om(ActionType.move_caret_page_up_select, new l((m0) nl(ActionType.move_caret_page_up)));
            om(ActionType.move_caret_page_down_select, new l((m0) nl(ActionType.move_caret_page_down)));
            om(ActionType.move_caret_to_beginning_of_line_select, new l((m0) nl(ActionType.move_caret_to_beginning_of_line)));
            om(ActionType.move_caret_to_beginning_of_text_in_line_select, new l((m0) nl(ActionType.move_caret_to_beginning_of_text_in_line)));
            om(ActionType.move_caret_to_end_of_line_select, new l((m0) nl(ActionType.move_caret_to_end_of_line)));
            om(ActionType.move_caret_to_beginning_of_text_select, new l((m0) nl(ActionType.move_caret_to_beginning_of_text)));
            om(ActionType.move_caret_to_end_of_text_select, new l((m0) nl(ActionType.move_caret_to_end_of_text)));
            om(ActionType.move_caret_word_left_select, new l((m0) nl(ActionType.move_caret_word_left)));
            om(ActionType.move_caret_word_right_select, new l((m0) nl(ActionType.move_caret_word_right)));
            wE(ActionType.delete_word_left, new f());
            wE(ActionType.delete_word_right, new g());
            wE(ActionType.select_all, new h());
            wE(ActionType.paste_selection, new i());
            om(ActionType.cut_selection, new j());
            om(ActionType.copy_selection, new m());
            om(ActionType.remove_selection, new n());
            om(ActionType.swap_with_clipboard, new o());
            wE(ActionType.auto_indent, new p());
            wE(ActionType.comment_selection, new q());
            wE(ActionType.uncomment_selection, new r());
            om(ActionType.indent_selection, new s());
            om(ActionType.unindent_selection, new t());
            HE();
            wE(ActionType.insert_line_break, new u());
            wE(ActionType.insert_tab, new v());
            wE(ActionType.remove_preceding_character, new x());
            wE(ActionType.remove_current_character, new y());
            wE(ActionType.remove_current_line, new z());
            wE(ActionType.toggle_overwrite_mode, new a0());
            wE(ActionType.undo, new b0());
            wE(ActionType.redo, new c0());
            nl(ActionType.undo).setEnabled(getEditorModel().BR());
            nl(ActionType.redo).setEnabled(getEditorModel().Nh());
            wE(ActionType.emacs_kill_line, new d0());
            wE(ActionType.abort_chaining, new e0());
            nl(ActionType.abort_chaining).setEnabled(false);
            setMultipleMouseClickSelects(true);
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -420696701264727309L, this);
            }
            throw th;
        }
    }

    @ey(method = -5467086949715536101L)
    private void Vq() {
        try {
            if (uD) {
                iy.gn(-5506919940554184392L, this);
            }
            Model model = getModel();
            int firstSelectedLine = getFirstSelectedLine();
            int lastSelectedLine = getLastSelectedLine();
            boolean z2 = getCaretLine() == firstSelectedLine;
            boolean z3 = getLastSelectedColumn() == -1;
            boolean z4 = lastSelectedLine == model.getLineCount() - 1;
            if (z2) {
                if (z4) {
                    Lz(model.getColumnCount(lastSelectedLine), lastSelectedLine, true);
                } else if (!z3) {
                    Lz(0, lastSelectedLine + 1, true);
                }
                sT(0, firstSelectedLine);
                TI(0, firstSelectedLine);
            } else {
                Lz(0, firstSelectedLine, true);
                if (z4) {
                    sT(model.getColumnCount(lastSelectedLine), lastSelectedLine);
                    TI(model.getColumnCount(lastSelectedLine), lastSelectedLine);
                } else if (!z3) {
                    int i2 = lastSelectedLine + 1;
                    sT(0, i2);
                    TI(0, i2);
                }
            }
            setSelectionVisibility(true);
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -5506919940554184392L, this);
            }
            throw th;
        }
    }

    @ey(method = -3851017224114500499L)
    private void ba() {
        try {
            if (uD) {
                iy.gn(-3273628727170242320L, this);
            }
            if (getSelectionVisibility()) {
                copySelectedText();
                TI(getFirstSelectedColumn(), getFirstSelectedLine());
                getEditorModel().Bx(getSelectedRegion(), this);
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -3273628727170242320L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 2675857267852210008L)
    public void cX() {
        try {
            if (uD) {
                iy.gn(4491985855273215099L, this);
            }
            getEditorModel().b1();
            int lastSelectedLine = getLastSelectedLine();
            if (getLastSelectedColumn() == -1) {
                lastSelectedLine--;
            }
            for (int firstSelectedLine = getFirstSelectedLine(); firstSelectedLine <= lastSelectedLine; firstSelectedLine++) {
                fh(firstSelectedLine, getLineIndentationCount(firstSelectedLine) - getTabSize());
            }
            getEditorModel().b1();
            Vq();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 4491985855273215099L, this);
            }
            throw th;
        }
    }

    @ey(method = -2086940450594512275L)
    private void fh(int i2, int i3) {
        int tabSize;
        int tabSize2;
        char cCharAtColumnLine;
        try {
            if (uD) {
                iy.EQ(316160746926747840L, this, new Integer(i2), new Integer(i3));
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = 0;
            while (i4 < getModel().getColumnCount(i2) && ((cCharAtColumnLine = getModel().charAtColumnLine(i4, i2)) == '\t' || cCharAtColumnLine == ' ')) {
                i4++;
            }
            getEditorModel().ce(0, i2, i4, this);
            if (getInsertTabsAsSpaces()) {
                tabSize = i3;
                tabSize2 = 0;
            } else {
                tabSize = i3 % getTabSize();
                tabSize2 = i3 / getTabSize();
            }
            char[] cArr = new char[tabSize + tabSize2];
            for (int i5 = 0; i5 < tabSize2; i5++) {
                cArr[i5] = '\t';
            }
            for (int i6 = 0; i6 < tabSize; i6++) {
                cArr[i6 + tabSize2] = ' ';
            }
            getEditorModel().QO(0, i2, cArr, this);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4695250619045529936L)
    public float getIntendedColumnX() {
        try {
            if (uD) {
                iy.gn(1751640118070341081L, this);
            }
            return this.Vq;
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 1751640118070341081L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5924206703994759141L)
    public InternalState getInternalState() {
        try {
            if (uD) {
                iy.gn(-4589530764052017560L, this);
            }
            return this.RW;
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -4589530764052017560L, this);
            }
            throw th;
        }
    }

    @ey(method = 45522785396176984L)
    private int getLineIndentationCount(int i2) {
        try {
            if (uD) {
                iy.u7(600475311532991675L, this, i2);
            }
            if (i2 < 0) {
                return 0;
            }
            int tabSize = 0;
            for (int i3 = 0; i3 < getModel().getColumnCount(i2); i3++) {
                char cCharAtColumnLine = getModel().charAtColumnLine(i3, i2);
                if (cCharAtColumnLine == '\t') {
                    tabSize = ((tabSize + getTabSize()) / getTabSize()) * getTabSize();
                } else {
                    if (cCharAtColumnLine != ' ') {
                        return tabSize;
                    }
                    tabSize++;
                }
            }
            return tabSize;
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, 600475311532991675L, this, new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5126038154574816565L)
    public void ir() {
        try {
            if (uD) {
                iy.gn(1433906574812495700L, this);
            }
            int firstSelectedLine = getFirstSelectedLine();
            int lastSelectedLine = getLastSelectedLine();
            if (!getSelectionVisibility()) {
                firstSelectedLine = getCaretLine();
                lastSelectedLine = firstSelectedLine;
            } else if (getLastSelectedColumn() == -1) {
                lastSelectedLine--;
            }
            getEditorModel().b1();
            ya(firstSelectedLine, lastSelectedLine);
            if (getCaretColumn() > getModel().getColumnCount(getCaretLine())) {
                TI(getModel().getColumnCount(getCaretLine()), getCaretLine());
            }
            getEditorModel().b1();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 1433906574812495700L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -3221363158360325416L)
    public void oT(String str) {
        try {
            if (uD) {
                iy.tp(-1579337844061100263L, this, str);
            }
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, -1579337844061100263L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1107828819856173723L)
    private void om(ActionType actionType, ActionRunnable actionRunnable) {
        try {
            if (uD) {
                iy.EQ(-1269952207080367700L, this, actionType, actionRunnable);
            }
            this.k4.put(actionType, actionRunnable);
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, -1269952207080367700L, this, actionType, actionRunnable);
            }
            throw th;
        }
    }

    @ey(method = -6223202948700555632L)
    private void pn() {
        try {
            if (uD) {
                iy.gn(296634230266445793L, this);
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager.hasText()) {
                String string = clipboardManager.getText().toString();
                int i2 = 0;
                for (int i3 = 0; i3 < string.length(); i3++) {
                    if (string.charAt(i3) == '\n') {
                        i2++;
                    }
                }
                int caretLine = getCaretLine();
                int i4 = i2 + caretLine;
                try {
                    getEditorModel().ys(getCaretColumn(), getCaretLine(), getInsertTabsAsSpaces(), getTabSize(), new StringReader(string), this);
                } catch (IOException unused) {
                }
                eN(caretLine, i4);
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 296634230266445793L, this);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 1211841006483610299L)
    public void qI(String str) {
        try {
            if (uD) {
                iy.tp(-31040856291134040L, this, str);
            }
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, -31040856291134040L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1322057154443266017L)
    public void setIntendedColumnX(float f2) {
        try {
            if (uD) {
                iy.tp(718094797800127960L, this, new Float(f2));
            }
            this.Vq = f2;
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, 718094797800127960L, this, new Float(f2));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -5134628477796030336L)
    public void setInternalState(InternalState internalState) {
        try {
            if (uD) {
                iy.tp(5586934369880274915L, this, internalState);
            }
            if (this.RW != internalState) {
                getEditorModel().b1();
                this.RW = internalState;
            }
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, 5586934369880274915L, this, internalState);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 423021260445194989L)
    public void sv() {
        try {
            if (uD) {
                iy.gn(91819729474283388L, this);
            }
            getEditorModel().b1();
            int lastSelectedLine = getLastSelectedLine();
            if (getLastSelectedColumn() == -1) {
                lastSelectedLine--;
            }
            for (int firstSelectedLine = getFirstSelectedLine(); firstSelectedLine <= lastSelectedLine; firstSelectedLine++) {
                fh(firstSelectedLine, getLineIndentationCount(firstSelectedLine) + getTabSize());
            }
            getEditorModel().b1();
            Vq();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 91819729474283388L, this);
            }
            throw th;
        }
    }

    @ey(method = -5350217640784703220L)
    private void wE(ActionType actionType, ActionRunnable actionRunnable) {
        try {
            if (uD) {
                iy.EQ(1996124050021295095L, this, actionType, actionRunnable);
            }
            this.x6.put(actionType, actionRunnable);
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, 1996124050021295095L, this, actionType, actionRunnable);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2868402634690439520L)
    public void zf() {
        try {
            if (uD) {
                iy.gn(-191440319793066115L, this);
            }
            int firstSelectedLine = getFirstSelectedLine();
            int lastSelectedLine = getLastSelectedLine();
            if (!getSelectionVisibility()) {
                firstSelectedLine = getCaretLine();
                lastSelectedLine = firstSelectedLine;
            } else if (getLastSelectedColumn() == -1) {
                lastSelectedLine--;
            }
            getEditorModel().b1();
            DY(firstSelectedLine, lastSelectedLine);
            if (getCaretColumn() > getModel().getColumnCount(getCaretLine())) {
                TI(getModel().getColumnCount(getCaretLine()), getCaretLine());
            }
            getEditorModel().b1();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -191440319793066115L, this);
            }
            throw th;
        }
    }

    @ey(method = -917062305779446515L)
    public void Ak(char c2, int i2, int i3) {
        try {
            if (uD) {
                iy.we(14235650406504700L, this, new Character(c2), new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (HE) {
                iy.U2(th, 14235650406504700L, this, new Character(c2), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -4976586801454322885L)
    public void DY(int i2, int i3) {
        try {
            if (uD) {
                iy.EQ(5816467629986461976L, this, new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, 5816467629986461976L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2267479193433002000L)
    public boolean HO() {
        try {
            if (uD) {
                iy.gn(-2463028108655624161L, this);
            }
            return getEditorModel().BR();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -2463028108655624161L, this);
            }
            throw th;
        }
    }

    @ey(method = -7322471027220260868L)
    public void N0(int i2, int i3) {
        try {
            if (uD) {
                iy.EQ(3577208457665686365L, this, new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, 3577208457665686365L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 4114764854618195040L)
    public void RW() {
        try {
            if (uD) {
                iy.gn(2569028962822256211L, this);
            }
            int lineCount = getModel().getLineCount() - 1;
            int columnCount = getModel().getColumnCount(lineCount);
            if (columnCount == 0 && lineCount == 0) {
                return;
            }
            Lz(0, 0, true);
            sT(columnCount, lineCount);
            TI(columnCount, lineCount);
            setSelectionVisibility(true);
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 2569028962822256211L, this);
            }
            throw th;
        }
    }

    @ey(method = 893418072003147475L)
    public void b() {
        try {
            if (uD) {
                iy.gn(549574547276637504L, this);
            }
            if (uC()) {
                setInternalState(InternalState.NONE);
                getEditorModel().b1();
                ba();
                getEditorModel().b1();
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 549574547276637504L, this);
            }
            throw th;
        }
    }

    @ey(method = -2682560044650042207L)
    public void d8() {
        try {
            if (uD) {
                iy.gn(-3391513026548094864L, this);
            }
            setInternalState(InternalState.NONE);
            if (uC()) {
                if (getSelectionVisibility()) {
                    getEditorModel().b1();
                    int firstSelectedLine = getFirstSelectedLine();
                    int lastSelectedLine = getLastSelectedLine();
                    if (getLastSelectedColumn() == -1) {
                        lastSelectedLine--;
                    }
                    N0(firstSelectedLine, lastSelectedLine);
                    getEditorModel().b1();
                    Vq();
                    return;
                }
                int columnCount = getEditorModel().getColumnCount(getCaretLine());
                int caretColumn = getCaretColumn();
                int columnCount2 = 0;
                N0(0, getEditorModel().getLineCount() - 1);
                int columnCount3 = caretColumn + (getEditorModel().getColumnCount(getCaretLine()) - columnCount);
                if (columnCount3 >= 0) {
                    columnCount2 = columnCount3;
                }
                if (columnCount2 > getModel().getColumnCount(getCaretLine())) {
                    columnCount2 = getModel().getColumnCount(getCaretLine());
                }
                TI(columnCount2, getCaretLine());
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -3391513026548094864L, this);
            }
            throw th;
        }
    }

    @ey(method = 3386511777501196055L)
    public void eN(int i2, int i3) {
        try {
            if (uD) {
                iy.EQ(1479543194302387740L, this, new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, 1479543194302387740L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2660278590297595428L)
    public boolean ep() {
        try {
            if (uD) {
                iy.gn(-2834836741070748483L, this);
            }
            return getEditorModel().Nh();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -2834836741070748483L, this);
            }
            throw th;
        }
    }

    @ey(method = 1835084545228448340L)
    public void fP() {
        try {
            if (uD) {
                iy.gn(-2362432507968482117L, this);
            }
            setInternalState(InternalState.NONE);
            getEditorModel().b1();
            copySelectedText();
            getEditorModel().b1();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -2362432507968482117L, this);
            }
            throw th;
        }
    }

    @ey(method = -4344566269812598585L)
    public EditorModel getEditorModel() {
        try {
            if (uD) {
                iy.gn(-4491076168033728084L, this);
            }
            return (EditorModel) getModel();
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -4491076168033728084L, this);
            }
            throw th;
        }
    }

    @ey(method = 1609053082104532525L)
    public void hx(char c2) {
        try {
            if (uD) {
                iy.tp(1266954593201272640L, this, new Character(c2));
            }
            if (uC()) {
                if (getSelectionVisibility()) {
                    getEditorModel().b1();
                    TI(getFirstSelectedColumn(), getFirstSelectedLine());
                    k4();
                    setSelectionVisibility(false);
                }
                if (getOverwriteMode()) {
                    setInternalState(InternalState.OVERWRITING);
                    int caretColumn = getCaretColumn();
                    int caretLine = getCaretLine();
                    getEditorModel().TI(caretColumn, caretLine, c2, this);
                    TI(caretColumn + 1, caretLine);
                } else {
                    setInternalState(InternalState.INSERTING);
                    getEditorModel().e9(getCaretColumn(), getCaretLine(), c2, this);
                }
                k1(c2, getCaretLine(), getCaretColumn());
                Ak(c2, getCaretLine(), getCaretColumn());
            }
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, 1266954593201272640L, this, new Character(c2));
            }
            throw th;
        }
    }

    @ey(method = 221362705640483755L)
    public void iK(int i2, int i3) {
        try {
            if (uD) {
                iy.EQ(-2285980632659812520L, this, new Integer(i2), new Integer(i3));
            }
            for (int i4 = 0; i4 < getEditorModel().getColumnCount(i2); i4++) {
                char cCharAtColumnLine = getEditorModel().charAtColumnLine(i4, i2);
                if (cCharAtColumnLine == '\t') {
                    getEditorModel().e9(i4, i2 + 1, '\t', this);
                } else if (cCharAtColumnLine != ' ') {
                    return;
                } else {
                    getEditorModel().e9(i4, i2 + 1, ' ', this);
                }
            }
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, -2285980632659812520L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3413101655054835315L)
    public void k1(char c2, int i2, int i3) {
        try {
            if (uD) {
                iy.we(-2219637691765926896L, this, new Character(c2), new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (HE) {
                iy.U2(th, -2219637691765926896L, this, new Character(c2), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -5343203343110455143L)
    public void k4() {
        try {
            if (uD) {
                iy.gn(-5392868336110183548L, this);
            }
            getEditorModel().Bx(getSelectedRegion(), this);
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -5392868336110183548L, this);
            }
            throw th;
        }
    }

    @ey(method = 302760526072448431L)
    public ActionRunnable nl(ActionType actionType) {
        try {
            if (uD) {
                iy.tp(175503590832818112L, this, actionType);
            }
            if (this.x6.containsKey(actionType)) {
                return this.x6.get(actionType);
            }
            if (this.k4.containsKey(actionType)) {
                return this.k4.get(actionType);
            }
            throw new IllegalArgumentException("Unknown editor action: " + actionType);
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, 175503590832818112L, this, actionType);
            }
            throw th;
        }
    }

    @ey(method = 857073446661144357L)
    public void qU() {
        try {
            if (uD) {
                iy.gn(-495486783251010740L, this);
            }
            if (uC()) {
                setInternalState(InternalState.INSERTING);
                int caretLine = getCaretLine();
                int caretColumn = getCaretColumn();
                if (!getInsertTabsAsSpaces()) {
                    getEditorModel().e9(caretColumn, caretLine, '\t', this);
                    return;
                }
                int tabSize = getTabSize();
                for (int i2 = 0; i2 < tabSize; i2++) {
                    getEditorModel().e9(caretColumn, caretLine, ' ', this);
                }
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -495486783251010740L, this);
            }
            throw th;
        }
    }

    @ey(method = -497993635366533600L)
    public void setEditable(boolean z2) {
        try {
            if (uD) {
                iy.Ws(2030379915215878699L, this, z2);
            }
            this.ya = z2;
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, 2030379915215878699L, this, new Boolean(z2));
            }
            throw th;
        }
    }

    @Override // com.aide.ui.views.editor.OConsole
    @ey(method = -460284404530364895L)
    public void setModel(Model model) {
        try {
            if (uD) {
                iy.tp(-31739013191968272L, this, model);
            }
            super.setModel(model);
            HT();
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, -31739013191968272L, this, model);
            }
            throw th;
        }
    }

    @ey(method = 664053488457044160L)
    public void setMultipleMouseClickSelects(boolean z2) {
        try {
            if (uD) {
                iy.Ws(-1610522089537736079L, this, z2);
            }
        } catch (Throwable th) {
            if (HE) {
                iy.j3(th, -1610522089537736079L, this, new Boolean(z2));
            }
            throw th;
        }
    }

    @ey(method = 807492461336610048L)
    public void tj() {
        try {
            if (uD) {
                iy.gn(639313292874392829L, this);
            }
            setInternalState(InternalState.NONE);
            if (uC()) {
                getEditorModel().b1();
                if (getSelectionVisibility()) {
                    getEditorModel().b1();
                    k4();
                    setSelectionVisibility(false);
                }
                pn();
                getEditorModel().b1();
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, 639313292874392829L, this);
            }
            throw th;
        }
    }

    @ey(method = -725863818871787040L)
    public void u9() {
        int i2;
        try {
            if (uD) {
                iy.gn(-1544417520886620591L, this);
            }
            setInternalState(InternalState.NONE);
            if (uC()) {
                int caretLine = getCaretLine();
                if (getSelectionVisibility()) {
                    int firstSelectedLine = getFirstSelectedLine();
                    int lastSelectedLine = getLastSelectedLine();
                    if (getLastSelectedColumn() == -1) {
                        lastSelectedLine--;
                    }
                    setSelectionVisibility(false);
                    int i3 = lastSelectedLine;
                    i2 = firstSelectedLine;
                    caretLine = i3;
                } else {
                    i2 = caretLine;
                }
                getEditorModel().b1();
                while (caretLine >= i2) {
                    int columnCount = getEditorModel().getColumnCount(caretLine);
                    if (caretLine != getEditorModel().getLineCount() - 1) {
                        TI(0, caretLine);
                        if (columnCount > 0) {
                            getEditorModel().ce(0, caretLine, columnCount, this);
                        }
                        getEditorModel().Jm(caretLine, this);
                    } else if (caretLine == 0) {
                        TI(0, 0);
                        if (columnCount > 0) {
                            getEditorModel().ce(0, caretLine, columnCount, this);
                        }
                    } else {
                        int i4 = caretLine - 1;
                        TI(0, i4);
                        if (columnCount > 0) {
                            getEditorModel().ce(0, caretLine, columnCount, this);
                        }
                        getEditorModel().Jm(i4, this);
                    }
                    caretLine--;
                }
                getEditorModel().b1();
            }
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -1544417520886620591L, this);
            }
            throw th;
        }
    }

    @ey(method = 221627558721101325L)
    public boolean uC() {
        try {
            if (uD) {
                iy.gn(-650726666214649192L, this);
            }
            if (this.ya) {
                if (getEditorModel().gG()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -650726666214649192L, this);
            }
            throw th;
        }
    }

    @ey(method = 1860174629526766095L)
    public void uD() {
        Position positionAR;
        try {
            if (uD) {
                iy.gn(-2346598066965667632L, this);
            }
            if (!uC() || (positionAR = getEditorModel().AR(this)) == null) {
                return;
            }
            TI(positionAR.getColumn(), positionAR.getLine());
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -2346598066965667632L, this);
            }
            throw th;
        }
    }

    @ey(method = 1852569308002171761L)
    public void x6() {
        Position positionAn;
        try {
            if (uD) {
                iy.gn(-2345400446556654528L, this);
            }
            if (!uC() || (positionAn = getEditorModel().An()) == null) {
                return;
            }
            TI(positionAn.getColumn(), positionAn.getLine());
        } catch (Throwable th) {
            if (HE) {
                iy.aM(th, -2345400446556654528L, this);
            }
            throw th;
        }
    }

    @ey(method = 902320697132790012L)
    public void ya(int i2, int i3) {
        try {
            if (uD) {
                iy.EQ(-165417921625960339L, this, new Integer(i2), new Integer(i3));
            }
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, -165417921625960339L, this, new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 5480098129369927539L)
    public OEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (uD) {
                iy.EQ(44764076477090084L, null, context, attributeSet);
            }
        } catch (Throwable th) {
            if (HE) {
                iy.Mr(th, 44764076477090084L, null, context, attributeSet);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = 366298065697430768L)
    public OEditor(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        try {
            if (uD) {
                iy.we(2249143508846534609L, null, context, attributeSet, new Integer(i2));
            }
        } catch (Throwable th) {
            if (HE) {
                iy.U2(th, 2249143508846534609L, null, context, attributeSet, new Integer(i2));
            }
            throw th;
        }
    }
}
