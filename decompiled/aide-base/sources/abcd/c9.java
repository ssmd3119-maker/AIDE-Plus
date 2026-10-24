package abcd;

import android.content.Context;
import android.text.Editable;
import android.text.method.CharacterPickerDialog;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import com.aide.common.KeyStroke;
import com.aide.ui.ServiceContainer;
import java.util.Arrays;
import java.util.List;

@cy(clazz = -880390309722802277L, container = -880390309722802277L, user = true)
/* loaded from: classes.dex */
public class c9 implements gg {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -3663018675801433520L)
    private KeyCharacterMap j6;

    @cy(clazz = 3257872613305185300L, container = -880390309722802277L, user = true)
    class a extends CharacterPickerDialog {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -1167186501133302217L)
        public a(Context context, View view, Editable editable, String str, boolean z) {
            super(context, view, editable, str, z);
        }

        @ey(method = -2988659104499640075L)
        private boolean j6(View view) {
            try {
                if (mb) {
                    iy.tp(-389584989884818889L, this, view);
                }
                String string = ((Button) view).getText().toString();
                if (string.length() != 1) {
                    return false;
                }
                if (c9.this.j6 == null) {
                    c9.this.j6 = KeyCharacterMap.load(0);
                }
                KeyEvent[] events = c9.this.j6.getEvents(string.toCharArray());
                if (events != null) {
                    for (KeyEvent keyEvent : events) {
                        ServiceContainer.getMainActivity().dispatchKeyEvent(keyEvent);
                    }
                }
                dismiss();
                return true;
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -389584989884818889L, this, view);
                }
                throw th;
            }
        }

        @Override // android.text.method.CharacterPickerDialog, android.view.View.OnClickListener
        @ey(method = 209353289259567465L)
        public void onClick(View view) {
            try {
                if (mb) {
                    iy.tp(-2829739581850319149L, this, view);
                }
                if (j6(view)) {
                    return;
                }
                super.onClick(view);
            } catch (Throwable th) {
                if (jw) {
                    iy.j3(th, -2829739581850319149L, this, view);
                }
                throw th;
            }
        }

        @Override // android.text.method.CharacterPickerDialog, android.widget.AdapterView.OnItemClickListener
        @ey(method = 4777707582382743568L)
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            try {
                if (mb) {
                    iy.J0(592766456430402576L, this, adapterView, view, new Integer(i), new Long(j));
                }
                if (j6(view)) {
                    return;
                }
                super.onItemClick(adapterView, view, i, j);
            } catch (Throwable th) {
                if (jw) {
                    iy.a8(th, 592766456430402576L, this, adapterView, view, new Integer(i), new Long(j));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(c9.class);
    }

    @ey(method = -703150469192021617L)
    public c9() {
        try {
            if (DW) {
                iy.gn(4672269154813816701L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 4672269154813816701L, null);
            }
            throw th;
        }
    }

    @ey(method = -5828413147599209437L)
    public void EQ(View view) {
        try {
            if (DW) {
                iy.tp(4831538094500933060L, this, view);
            }
            new a(view.getContext(), view, Editable.Factory.getInstance().newEditable(""), "(){}[]\\!@#$%&*?/:_\"'-+;,.�~=^<>|�", true).show();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 4831538094500933060L, this, view);
            }
            throw th;
        }
    }

    @Override // abcd.gg
    @ey(method = -8098297553949179577L)
    public List<KeyStroke> Hw() {
        try {
            if (DW) {
                iy.gn(1491907956253240240L, this);
            }
            return Arrays.asList(new KeyStroke(94, false, false, false), new KeyStroke(116, false, false, false));
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1491907956253240240L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -6097833291476505315L)
    public KeyStroke getKeyStroke() {
        try {
            if (DW) {
                iy.gn(5389673741244386460L, this);
            }
            return new KeyStroke(63, false, false, false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 5389673741244386460L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 577972977121916064L)
    public String getName() {
        try {
            if (!DW) {
                return "Show Character Picker";
            }
            iy.gn(1244594197982425557L, this);
            return "Show Character Picker";
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1244594197982425557L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = -2333746045103666348L)
    public boolean isEnabled() {
        try {
            if (!DW) {
                return true;
            }
            iy.gn(1988476139801352825L, this);
            return true;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1988476139801352825L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.command.KeyStrokeCommand
    @ey(method = 865240202689319832L)
    public boolean run() {
        try {
            if (DW) {
                iy.gn(-180300908867974665L, this);
            }
            EQ(ServiceContainer.getMainActivity().sh());
            return true;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -180300908867974665L, this);
            }
            throw th;
        }
    }
}
