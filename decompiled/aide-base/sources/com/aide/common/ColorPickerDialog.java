package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.aide.common.ColorPickerView;
import com.aide.ui.q;
import com.aide.ui.r;

@cy(clazz = 2649604467815608996L, container = 2649604467815608996L, user = true)
/* loaded from: classes.dex */
public class ColorPickerDialog extends MessageBox {

    @gy
    private static /* synthetic */ boolean Q6;

    @fy
    private static /* synthetic */ boolean n5;

    @dy(field = 1181641520470680395L)
    private int AL;

    @dy(field = 4156554880504752223L)
    private boolean Z1;

    @dy(field = 1799358653644818128L)
    private String cT;

    @dy(field = -1288152373800961056L)
    private boolean hK;

    @dy(field = 3475276076647037375L)
    private String k2;

    @dy(field = 4186264046760253065L)
    private boolean q7;

    @dy(field = -292040383428914652L)
    private f w9;

    @dy(field = 3762520996430831376L)
    private String zh;

    @cy(clazz = 3887770723241029891L, container = 2649604467815608996L, user = true)
    class a implements ColorPickerView.ColorRunnable {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = 367414222810915737L)
        final /* synthetic */ EditText j6;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -8945585938698970288L)
        a(EditText editText) {
            this.j6 = editText;
        }

        @Override // com.aide.common.ColorPickerView.ColorRunnable
        @ey(method = 3936204643325502720L)
        public void j6(int i, String str) {
            try {
                if (FH) {
                    iy.EQ(-5387899819455754440L, this, new Integer(i), str);
                }
                if (!ColorPickerDialog.this.Z1) {
                    ColorPickerDialog.this.q7 = true;
                    this.j6.setText(str);
                    ColorPickerDialog.this.q7 = false;
                }
                ColorPickerDialog.this.zh = str;
                ColorPickerDialog.this.AL = i;
            } catch (Throwable th) {
                if (Hw) {
                    iy.Mr(th, -5387899819455754440L, this, new Integer(i), str);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3887831664087072096L, container = 2649604467815608996L, user = true)
    class b implements TextWatcher {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2492522019356888224L)
        final /* synthetic */ ColorPickerView WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = -216410162005104480L)
        b(ColorPickerView colorPickerView) {
            this.WB = colorPickerView;
        }

        @Override // android.text.TextWatcher
        @ey(method = 4810235020329635935L)
        public void afterTextChanged(Editable editable) {
            try {
                if (jw) {
                    iy.tp(3638906623784591393L, this, editable);
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, 3638906623784591393L, this, editable);
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = 1187401018499193468L)
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(1830596934681658528L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, 1830596934681658528L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }

        @Override // android.text.TextWatcher
        @ey(method = -4595652138330262112L)
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                if (jw) {
                    iy.J0(-2729822879843132820L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                if (ColorPickerDialog.this.q7) {
                    return;
                }
                ColorPickerDialog.this.Z1 = true;
                this.WB.setCurrentColor(charSequence.toString());
                ColorPickerDialog.this.Z1 = false;
            } catch (Throwable th) {
                if (fY) {
                    iy.a8(th, -2729822879843132820L, this, charSequence, new Integer(i), new Integer(i2), new Integer(i3));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3887892604937177595L, container = 2649604467815608996L, user = true)
    class c implements DialogInterface.OnClickListener {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(c.class);
        }

        @ey(method = -34675339713281300L)
        c(ColorPickerDialog colorPickerDialog) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -622263015800906025L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (WB) {
                    iy.EQ(1246814708383259145L, this, dialogInterface, new Integer(i));
                }
                dialogInterface.cancel();
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, 1246814708383259145L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3887953545791346388L, container = 2649604467815608996L, user = true)
    class d implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(d.class);
        }

        @ey(method = 108360022577477760L)
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = -905120576248675129L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(2426715736920900112L, this, dialogInterface, new Integer(i));
                }
                dialogInterface.dismiss();
                ColorPickerDialog.this.w9.j6(ColorPickerDialog.this.AL, ColorPickerDialog.this.zh);
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 2426715736920900112L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 3888014486649578475L, container = 2649604467815608996L, user = true)
    class e implements DialogInterface.OnClickListener {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(e.class);
        }

        @ey(method = 81720610657529367L)
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @ey(method = 808654690366390892L)
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                if (mb) {
                    iy.EQ(64443593181810564L, this, dialogInterface, new Integer(i));
                }
                ColorPickerDialog.this.w9.j6(0, null);
            } catch (Throwable th) {
                if (jw) {
                    iy.Mr(th, 64443593181810564L, this, dialogInterface, new Integer(i));
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5004269045088717280L, container = -5004269045088717280L, user = true)
    public interface f {
        @ey(method = -448341269656853900L)
        void j6(int i, String str);
    }

    static {
        iy.Zo(ColorPickerDialog.class);
    }

    @ey(method = -1851326871120789552L)
    public ColorPickerDialog(String str, String str2, f fVar) {
        try {
            if (n5) {
                iy.we(1709014343747098864L, null, str, str2, fVar);
            }
            if (str2 == null) {
                this.k2 = "#000000";
            } else {
                this.k2 = str2;
            }
            String str3 = this.k2;
            this.zh = str3;
            this.AL = ColorPickerView.Hw(str3);
            this.w9 = fVar;
            this.hK = true;
            this.cT = str;
        } catch (Throwable th) {
            if (Q6) {
                iy.U2(th, 1709014343747098864L, null, str, str2, fVar);
            }
            throw th;
        }
    }

    @Override // com.aide.common.MessageBox
    @ey(method = -61553950938186860L)
    protected Dialog Hw(Activity activity) {
        try {
            if (n5) {
                iy.tp(324682982038763397L, this, activity);
            }
            View viewInflate = LayoutInflater.from(activity).inflate(r.colorpicker, (ViewGroup) null);
            ColorPickerView colorPickerView = (ColorPickerView) viewInflate.findViewById(q.colorpickerColorPickerView);
            EditText editText = (EditText) viewInflate.findViewById(q.colorpickerEditText);
            colorPickerView.setOnColorChangedListener(new a(editText));
            colorPickerView.setInitialColor(this.k2);
            colorPickerView.setCurrentColor(this.k2);
            editText.setText(this.k2);
            editText.addTextChangedListener(new b(colorPickerView));
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setView(viewInflate).setCancelable(true).setPositiveButton("Ok", new d()).setNegativeButton("Cancel", new c(this));
            if (this.hK) {
                builder.setNeutralButton("None", new e());
            }
            builder.setTitle(this.cT);
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.getWindow().setSoftInputMode(2);
            return alertDialogCreate;
        } catch (Throwable th) {
            if (Q6) {
                iy.j3(th, 324682982038763397L, this, activity);
            }
            throw th;
        }
    }

    @ey(method = -1244873866877288001L)
    public ColorPickerDialog(String str, int i, f fVar) {
        try {
            if (n5) {
                iy.we(1222370413163975881L, null, str, new Integer(i), fVar);
            }
            String strV5 = ColorPickerView.v5(i);
            this.k2 = strV5;
            this.zh = strV5;
            this.AL = i;
            this.w9 = fVar;
            this.cT = str;
        } catch (Throwable th) {
            if (Q6) {
                iy.U2(th, 1222370413163975881L, null, str, new Integer(i), fVar);
            }
            throw th;
        }
    }
}
