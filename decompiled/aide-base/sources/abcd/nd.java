package abcd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.aide.common.MessageBox;
import com.aide.ui.activities.CommitActivity;
import com.aide.ui.q;
import com.aide.ui.r;

@cy(clazz = 1005502431686740692L, container = 1005502431686740692L, user = true)
/* loaded from: classes.dex */
public class nd extends MessageBox {

    @fy
    private static /* synthetic */ boolean k2;

    @gy
    private static /* synthetic */ boolean zh;

    @cy(clazz = 326086491604929595L, container = 1005502431686740692L, user = true)
    class a implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 9733814400652416L)
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -503776136178890013L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(-3573197227653012369L, this, dialogInterface, new Integer(i));
                }
                nd.this.sh((AlertDialog) dialogInterface);
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, -3573197227653012369L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 326102849785386240L, container = 1005502431686740692L, user = true)
    class b implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2045362956613317767L)
        final /* synthetic */ Activity WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 186443703900466336L)
        public b(Activity activity) {
            this.WB = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -601960220253853180L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (jw) {
                    iy.EQ(-2456518380198869192L, this, dialogInterface, new Integer(i));
                }
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                nd.this.sh(alertDialog);
                ((CommitActivity) this.WB).QX(nd.this.cb(alertDialog));
            } catch (Throwable th) {
                if (fY) {
                    iy.Mr(th, -2456518380198869192L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 326119207969906179L, container = 1005502431686740692L, user = true)
    class c implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2959083666800514736L)
        final /* synthetic */ AlertDialog WB;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 6889502122627502465L)
        public c(AlertDialog alertDialog) {
            this.WB = alertDialog;
        }

        @Override // android.text.TextWatcher
        @ey(method = -2406843055279833793L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(3806265420746266800L, this, editable);
                }
                nd.this.sG(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 3806265420746266800L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 2691604077837167916L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-3617428141940603875L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -3617428141940603875L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -626349458356271560L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-7352888224605779361L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -7352888224605779361L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 326135566158489412L, container = 1005502431686740692L, user = true)
    class d implements DialogInterface.OnShowListener {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 143507720320771680L)
        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        @ey(method = 308349033742862541L)
        public void onShow(DialogInterface dialogInterface) {
            try {
                if (DW) {
                    iy.tp(-5829446943189782625L, this, dialogInterface);
                }
                nd.this.sG((AlertDialog) dialogInterface);
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -5829446943189782625L, this, dialogInterface);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(nd.class);
    }

    @ey(method = 3021586678551786360L)
    public nd() {
        try {
            if (k2) {
                iy.gn(-4938847751760937084L, null);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.aM(th, -4938847751760937084L, null);
            }
            throw th;
        }
    }

    @ey(method = -2421677187363125520L)
    private EditText dx(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(-446751284592849375L, this, alertDialog);
            }
            return (EditText) alertDialog.findViewById(q.gitcommitdatamessage);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -446751284592849375L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -1929844814493486400L)
    public void sG(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(-14707139850991089L, this, alertDialog);
            }
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                button.setEnabled(cb(alertDialog).length() != 0);
            }
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -14707139850991089L, this, alertDialog);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5599495411478456605L)
    public void sh(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(4834141387453951560L, this, alertDialog);
            }
            ((InputMethodManager) alertDialog.getContext().getSystemService("input_method")).hideSoftInputFromWindow(dx(alertDialog).getWindowToken(), 0);
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, 4834141387453951560L, this, alertDialog);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = 1171647940657283783L)
    public Dialog Hw(Activity activity) {
        try {
            if (k2) {
                iy.tp(-1971422416823227860L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.gitcommitdata, (ViewGroup) null);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("Git commit").setView(viewInflate).setCancelable(true).setPositiveButton("Commit", new b(activity)).setNegativeButton("Cancel", new a());
            AlertDialog alertDialogCreate = builder.create();
            ((EditText) viewInflate.findViewById(q.gitcommitdatamessage)).addTextChangedListener(new c(alertDialogCreate));
            alertDialogCreate.setOnShowListener(new d());
            return alertDialogCreate;
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -1971422416823227860L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = -640485694688956023L)
    public String cb(AlertDialog alertDialog) {
        try {
            if (k2) {
                iy.tp(-274808525779235932L, this, alertDialog);
            }
            return dx(alertDialog).getText().toString().trim();
        } catch (Throwable th) {
            if (zh) {
                iy.j3(th, -274808525779235932L, this, alertDialog);
            }
            throw th;
        }
    }
}
