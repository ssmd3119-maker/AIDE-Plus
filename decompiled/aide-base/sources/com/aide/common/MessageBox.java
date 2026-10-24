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
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.aide.ui.u;
import com.aide.uidesigner.ProxyTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@cy(clazz = 5024868934807443193L, container = 5024868934807443193L, user = true)
/* loaded from: classes.dex */
public abstract class MessageBox {

    @dy(field = -902259347918780657L)
    private static int WB;

    @fy
    private static /* synthetic */ boolean fY;

    @dy(field = 2365851726693433725L)
    private static Dialog jw;

    @dy(field = -3717002400078060576L)
    private static MessageBox mb;

    @gy
    private static /* synthetic */ boolean qp;

    @cy(clazz = -3957898729834816616L, container = 5024868934807443193L, user = true)
    static class a extends MessageBox {

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = 1369270118365624005L)
        final /* synthetic */ Runnable AL;

        @dy(field = 3830673913497125889L)
        final /* synthetic */ String k2;

        @dy(field = 2156838657810521712L)
        final /* synthetic */ String w9;

        @dy(field = -6528711834366058491L)
        final /* synthetic */ String zh;

        @cy(clazz = 4518161630902389525L, container = 5024868934807443193L, user = true)
        /* renamed from: com.aide.common.MessageBox$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0045a implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(DialogInterfaceOnClickListenerC0045a.class);
            }

            @ey(method = -102530347072230781L)
            DialogInterfaceOnClickListenerC0045a(a aVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 653834745199599049L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (WB) {
                        iy.EQ(718816909278993756L, this, dialogInterface, new Integer(i));
                    }
                } catch (Throwable th) {
                    if (mb) {
                        iy.Mr(th, 718816909278993756L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4518257828228626216L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 183033728281574367L)
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 338766582562489125L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(-94133498456795715L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    a.this.AL.run();
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -94133498456795715L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(a.class);
        }

        @ey(method = 400402462621025555L)
        a(String str, String str2, Runnable runnable, String str3) {
            this.k2 = str;
            this.zh = str2;
            this.AL = runnable;
            this.w9 = str3;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -864884099276615355L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(400819676430452160L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(this.k2).setCancelable(true).setPositiveButton(activity.getResources().getString(u.dialog_ok), new DialogInterfaceOnClickListenerC0045a(this));
                if (this.zh != null) {
                    builder = builder.setNegativeButton(this.zh, new b());
                }
                if (this.w9 != null) {
                    builder = builder.setTitle(this.w9);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, 400819676430452160L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 6162949721300973747L, container = 5024868934807443193L, user = true)
    static class b extends MessageBox {

        @gy
        private static /* synthetic */ boolean Q6;

        @fy
        private static /* synthetic */ boolean n5;

        @dy(field = -2693353850231107248L)
        final /* synthetic */ String AL;

        @dy(field = 1429809591845616233L)
        final /* synthetic */ boolean Z1;

        @dy(field = 253354325433175175L)
        final /* synthetic */ Runnable cT;

        @dy(field = 1308738511771289712L)
        final /* synthetic */ String hK;

        @dy(field = -1953470478576106424L)
        final /* synthetic */ ValueRunnable k2;

        @dy(field = -837502724945207760L)
        final /* synthetic */ String q7;

        @dy(field = 1823320134035422905L)
        final /* synthetic */ Runnable w9;

        @dy(field = -2341615558003123733L)
        final /* synthetic */ String zh;

        @cy(clazz = -5838321869418469980L, container = 5024868934807443193L, user = true)
        class a extends EditText {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -4501658367087980175L)
            final /* synthetic */ Activity WB;

            @dy(field = -800933408838226336L)
            final /* synthetic */ AlertDialog[] mb;

            static {
                iy.Zo(a.class);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @ey(method = 2599372091480014440L)
            a(Context context, Activity activity, AlertDialog[] alertDialogArr) {
                super(context);
                this.WB = activity;
                this.mb = alertDialogArr;
            }

            @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
            @ey(method = 901225170902436924L)
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                try {
                    if (fY) {
                        iy.EQ(980333327092953015L, this, new Integer(i), keyEvent);
                    }
                    if (i == 66) {
                        return true;
                    }
                    return super.onKeyDown(i, keyEvent);
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, 980333327092953015L, this, new Integer(i), keyEvent);
                    }
                    throw th;
                }
            }

            @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
            @ey(method = -318824384747203335L)
            public boolean onKeyUp(int i, KeyEvent keyEvent) {
                try {
                    if (fY) {
                        iy.EQ(-429576779136611040L, this, new Integer(i), keyEvent);
                    }
                    if (i != 66) {
                        return super.onKeyUp(i, keyEvent);
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
                    this.mb[0].dismiss();
                    b.this.k2.j6(getText().toString().trim());
                    return true;
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, -429576779136611040L, this, new Integer(i), keyEvent);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -5838438859405707597L, container = 5024868934807443193L, user = true)
        /* renamed from: com.aide.common.MessageBox$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0046b implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -152884763706318089L)
            final /* synthetic */ Activity WB;

            @dy(field = 2488575500015681568L)
            final /* synthetic */ EditText mb;

            static {
                iy.Zo(DialogInterfaceOnClickListenerC0046b.class);
            }

            @ey(method = 261389037501055929L)
            DialogInterfaceOnClickListenerC0046b(b bVar, Activity activity, EditText editText) {
                this.WB = activity;
                this.mb = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 860380389627598280L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (jw) {
                        iy.EQ(3178669063173643000L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.cancel();
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 3178669063173643000L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -5838555849388881920L, container = 5024868934807443193L, user = true)
        class c implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 1391985920408794256L)
            final /* synthetic */ Activity WB;

            @dy(field = 19212661763701725L)
            final /* synthetic */ EditText mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -483904802810065728L)
            c(Activity activity, EditText editText) {
                this.WB = activity;
                this.mb = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 134833045889052693L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (fY) {
                        iy.EQ(4015133962374094011L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.dismiss();
                    b.this.k2.j6(this.mb.getText().toString().trim());
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, 4015133962374094011L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -5838672839367992949L, container = 5024868934807443193L, user = true)
        class d implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 1492557123294500976L)
            final /* synthetic */ Activity WB;

            @dy(field = -1909893336484226067L)
            final /* synthetic */ EditText mb;

            static {
                iy.Zo(d.class);
            }

            @ey(method = 1928577116840210100L)
            d(Activity activity, EditText editText) {
                this.WB = activity;
                this.mb = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 590645526193587861L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (fY) {
                        iy.EQ(2339734077309384375L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    b.this.w9.run();
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, 2339734077309384375L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -5838789829343040684L, container = 5024868934807443193L, user = true)
        class e implements DialogInterface.OnCancelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(e.class);
            }

            @ey(method = -169592269022248113L)
            e() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            @ey(method = -161106994163449719L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (mb) {
                        iy.tp(1990164680577781344L, this, dialogInterface);
                    }
                    if (b.this.cT != null) {
                        b.this.cT.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, 1990164680577781344L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -5838906819314025125L, container = 5024868934807443193L, user = true)
        class f implements DialogInterface.OnShowListener {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 2506156067527570080L)
            final /* synthetic */ EditText DW;

            @dy(field = 46281321723498489L)
            final /* synthetic */ Activity j6;

            static {
                iy.Zo(f.class);
            }

            @ey(method = 2635775400555157627L)
            f(b bVar, Activity activity, EditText editText) {
                this.j6 = activity;
                this.DW = editText;
            }

            @Override // android.content.DialogInterface.OnShowListener
            @ey(method = -203263860497548620L)
            public void onShow(DialogInterface dialogInterface) {
                try {
                    if (FH) {
                        iy.tp(1384233909731588091L, this, dialogInterface);
                    }
                    ((InputMethodManager) this.j6.getSystemService("input_method")).showSoftInput(this.DW, 1);
                    this.DW.selectAll();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, 1384233909731588091L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = -5839023809280946272L, container = 5024868934807443193L, user = true)
        class g implements TextView.OnEditorActionListener {

            @gy
            private static /* synthetic */ boolean k2;

            @fy
            private static /* synthetic */ boolean qp;

            @dy(field = 3372182701221077211L)
            final /* synthetic */ Activity WB;

            @dy(field = -2919063342262780152L)
            final /* synthetic */ AlertDialog[] jw;

            @dy(field = -1672703565309925960L)
            final /* synthetic */ EditText mb;

            static {
                iy.Zo(g.class);
            }

            @ey(method = 262567960138464672L)
            g(Activity activity, EditText editText, AlertDialog[] alertDialogArr) {
                this.WB = activity;
                this.mb = editText;
                this.jw = alertDialogArr;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            @ey(method = 424286445554509608L)
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                try {
                    if (qp) {
                        iy.we(-3840513526520815705L, this, textView, new Integer(i), keyEvent);
                    }
                    if (i == 6) {
                        ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                        this.jw[0].dismiss();
                        b.this.k2.j6(this.mb.getText().toString().trim());
                    }
                    return false;
                } catch (Throwable th) {
                    if (k2) {
                        iy.U2(th, -3840513526520815705L, this, textView, new Integer(i), keyEvent);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(b.class);
        }

        @ey(method = 6417870396701097576L)
        b(ValueRunnable valueRunnable, String str, String str2, Runnable runnable, String str3, Runnable runnable2, String str4, boolean z) {
            this.k2 = valueRunnable;
            this.zh = str;
            this.AL = str2;
            this.w9 = runnable;
            this.hK = str3;
            this.cT = runnable2;
            this.q7 = str4;
            this.Z1 = z;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -121111686043231815L)
        public Dialog Hw(Activity activity) {
            try {
                if (n5) {
                    iy.tp(-672624891860880960L, this, activity);
                }
                AlertDialog[] alertDialogArr = new AlertDialog[1];
                a aVar = new a(activity, activity, alertDialogArr);
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(aVar).setMessage(this.zh).setCancelable(true).setPositiveButton(activity.getResources().getString(u.dialog_ok), new c(activity, aVar)).setNegativeButton(activity.getResources().getString(u.dialog_cancel), new DialogInterfaceOnClickListenerC0046b(this, activity, aVar));
                if (this.AL != null) {
                    builder.setNeutralButton(this.AL, new d(activity, aVar));
                }
                if (this.hK != null) {
                    builder.setTitle(this.hK);
                }
                builder.setOnCancelListener(new e());
                alertDialogArr[0] = builder.create();
                alertDialogArr[0].setOnShowListener(new f(this, activity, aVar));
                aVar.setText(this.q7);
                aVar.setImeOptions(268435456);
                if (this.Z1) {
                    aVar.setInputType(ProxyTextView.INPUTTYPE_textPassword);
                } else {
                    aVar.setInputType(ProxyTextView.INPUTTYPE_textVisiblePassword);
                }
                aVar.setTypeface(Typeface.DEFAULT);
                aVar.setOnEditorActionListener(new g(activity, aVar, alertDialogArr));
                alertDialogArr[0].setCanceledOnTouchOutside(true);
                return alertDialogArr[0];
            } catch (Throwable th) {
                if (Q6) {
                    iy.j3(th, -672624891860880960L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 6163089110917039588L, container = 5024868934807443193L, user = true)
    static class c implements ValueRunnable<List<Integer>> {

        @fy
        private static /* synthetic */ boolean FH;

        @gy
        private static /* synthetic */ boolean Hw;

        @dy(field = -1867801248869806032L)
        final /* synthetic */ List DW;

        @dy(field = -1617902126865810084L)
        final /* synthetic */ ValueRunnable j6;

        static {
            iy.Zo(c.class);
        }

        @ey(method = 386207265218740497L)
        c(ValueRunnable valueRunnable, List list) {
            this.j6 = valueRunnable;
            this.DW = list;
        }

        @Override // com.aide.common.ValueRunnable
        @ey(method = -7576421390331842895L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public void j6(List<Integer> list) {
            try {
                if (FH) {
                    iy.tp(1553030859183131929L, this, list);
                }
                if (list.size() == 0) {
                    this.j6.j6(null);
                    return;
                }
                String str = "";
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (str.length() > 0) {
                        str = str + "|";
                    }
                    str = str + ((String) this.DW.get(iIntValue));
                }
                this.j6.j6(str);
            } catch (Throwable th) {
                if (Hw) {
                    iy.j3(th, 1553030859183131929L, this, list);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3957994031737887603L, container = 5024868934807443193L, user = true)
    static class d extends MessageBox {

        @fy
        private static /* synthetic */ boolean Z1;

        @gy
        private static /* synthetic */ boolean n5;

        @dy(field = -2705822232959017965L)
        final /* synthetic */ String AL;

        @dy(field = -4545935049185990127L)
        final /* synthetic */ Runnable cT;

        @dy(field = -147180733844110903L)
        final /* synthetic */ String hK;

        @dy(field = -3109437835704829527L)
        final /* synthetic */ String k2;

        @dy(field = -340651454849103696L)
        final /* synthetic */ String q7;

        @dy(field = -2843760192929113920L)
        final /* synthetic */ Runnable w9;

        @dy(field = -115180899482608704L)
        final /* synthetic */ boolean zh;

        @cy(clazz = 4518541730618480552L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -306618884722427456L)
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 728314647036685920L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(2006225127431985984L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (d.this.w9 != null) {
                        d.this.w9.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 2006225127431985984L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4518637929903224889L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 351004146022665936L)
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -1057966421903440552L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(1447334007669899869L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (d.this.cT != null) {
                        d.this.cT.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 1447334007669899869L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4518734129192032520L, container = 5024868934807443193L, user = true)
        class c implements DialogInterface.OnCancelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -471095076135206789L)
            c() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            @ey(method = -406075861921701252L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (mb) {
                        iy.tp(-6982874719391048976L, this, dialogInterface);
                    }
                    dialogInterface.dismiss();
                    if (d.this.cT != null) {
                        d.this.cT.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -6982874719391048976L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = -3119807819301761625L)
        d(String str, boolean z, String str2, Runnable runnable, String str3, Runnable runnable2, String str4) {
            this.k2 = str;
            this.zh = z;
            this.AL = str2;
            this.w9 = runnable;
            this.hK = str3;
            this.cT = runnable2;
            this.q7 = str4;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -2376518919812464035L)
        public Dialog Hw(Activity activity) {
            try {
                if (Z1) {
                    iy.tp(386175114217446220L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(this.k2).setCancelable(this.zh);
                builder.setPositiveButton(this.AL, new a());
                if (this.hK != null) {
                    builder.setNegativeButton(this.hK, new b());
                }
                builder.setOnCancelListener(new c());
                if (this.q7 != null) {
                    builder.setTitle(this.q7);
                }
                AlertDialog alertDialogCreate = builder.create();
                if (this.zh) {
                    alertDialogCreate.setCanceledOnTouchOutside(true);
                }
                return alertDialogCreate;
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 386175114217446220L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3958089333636895296L, container = 5024868934807443193L, user = true)
    static class e extends MessageBox {

        @fy
        private static /* synthetic */ boolean Z1;

        @gy
        private static /* synthetic */ boolean n5;

        @dy(field = 2339258695295420451L)
        final /* synthetic */ Runnable AL;

        @dy(field = 1162868027129320395L)
        final /* synthetic */ Runnable cT;

        @dy(field = 3010210189510445055L)
        final /* synthetic */ Runnable hK;

        @dy(field = 4081158189828950151L)
        final /* synthetic */ String k2;

        @dy(field = 290842424945807424L)
        final /* synthetic */ String q7;

        @dy(field = -936664084147187456L)
        final /* synthetic */ String w9;

        @dy(field = 2786398514532941888L)
        final /* synthetic */ String zh;

        @cy(clazz = 4518921842048929017L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 204299777985713056L)
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 414443234559120615L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(-1105875496172147304L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (e.this.hK != null) {
                        e.this.hK.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -1105875496172147304L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4519018043292181000L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 93417178776658696L)
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -79892099794367061L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(-92113997589922737L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (e.this.AL != null) {
                        e.this.AL.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -92113997589922737L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4519114244539496277L, container = 5024868934807443193L, user = true)
        class c implements DialogInterface.OnCancelListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = 139185997732003573L)
            c() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            @ey(method = 1438782853341150817L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (mb) {
                        iy.tp(-1088324711349508599L, this, dialogInterface);
                    }
                    if (e.this.cT != null) {
                        e.this.cT.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -1088324711349508599L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        @ey(method = 4055390224508474439L)
        e(String str, String str2, Runnable runnable, String str3, Runnable runnable2, Runnable runnable3, String str4) {
            this.k2 = str;
            this.zh = str2;
            this.AL = runnable;
            this.w9 = str3;
            this.hK = runnable2;
            this.cT = runnable3;
            this.q7 = str4;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = 2456860913533244495L)
        public Dialog Hw(Activity activity) {
            try {
                if (Z1) {
                    iy.tp(-2248646446936728765L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(this.k2).setCancelable(true).setPositiveButton(this.zh, new b()).setNegativeButton(this.w9, new a());
                builder.setOnCancelListener(new c());
                if (this.q7 != null) {
                    builder.setTitle(this.q7);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, -2248646446936728765L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3958184635531839695L, container = 5024868934807443193L, user = true)
    static class f extends MessageBox {

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = -1828464581841981261L)
        final /* synthetic */ String AL;

        @dy(field = -217139500585278423L)
        final /* synthetic */ KeyStroke k2;

        @dy(field = 902990038533264972L)
        final /* synthetic */ String w9;

        @dy(field = 1139217421207812208L)
        final /* synthetic */ ValueRunnable zh;

        @cy(clazz = 4519301965193734920L, container = 5024868934807443193L, user = true)
        class a implements TextView.OnEditorActionListener {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = 727063074996654256L)
            final /* synthetic */ Activity WB;

            @dy(field = 872872156232043513L)
            final /* synthetic */ KeyStrokeEditText mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 1193138050209763021L)
            a(Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            @ey(method = -993813909150269361L)
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                try {
                    if (fY) {
                        iy.we(-2495709819222243729L, this, textView, new Integer(i), keyEvent);
                    }
                    if (i == 6) {
                        ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                        f.this.zh.j6(this.mb.getKeyStroke());
                    }
                    return false;
                } catch (Throwable th) {
                    if (qp) {
                        iy.U2(th, -2495709819222243729L, this, textView, new Integer(i), keyEvent);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4519398168395494549L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -2626545707327994240L)
            final /* synthetic */ Activity WB;

            @dy(field = 3273673371679468131L)
            final /* synthetic */ KeyStrokeEditText mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 1487726621617546971L)
            b(Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 146905943471991925L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (fY) {
                        iy.EQ(25748084436690495L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.cancel();
                    f.this.zh.j6(null);
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, 25748084436690495L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4519494371601317472L, container = 5024868934807443193L, user = true)
        class c implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean fY;

            @fy
            private static /* synthetic */ boolean jw;

            @dy(field = -3954988831029866996L)
            final /* synthetic */ Activity WB;

            @dy(field = -947534754604164881L)
            final /* synthetic */ KeyStrokeEditText mb;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -1332337576138910697L)
            c(f fVar, Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -29282468281994355L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (jw) {
                        iy.EQ(51985571984134480L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.cancel();
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 51985571984134480L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4519590574811203689L, container = 5024868934807443193L, user = true)
        class d implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean fY;

            @gy
            private static /* synthetic */ boolean qp;

            @dy(field = -50886746555055888L)
            final /* synthetic */ Activity WB;

            @dy(field = -1598960801367828707L)
            final /* synthetic */ KeyStrokeEditText mb;

            static {
                iy.Zo(d.class);
            }

            @ey(method = -697440138824731239L)
            d(Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -474917893937840045L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (fY) {
                        iy.EQ(75752972867770851L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    f.this.zh.j6(this.mb.getKeyStroke());
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, 75752972867770851L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4519686778025153200L, container = 5024868934807443193L, user = true)
        class e implements DialogInterface.OnShowListener {

            @fy
            private static /* synthetic */ boolean FH;

            @gy
            private static /* synthetic */ boolean Hw;

            @dy(field = 2048355850133078500L)
            final /* synthetic */ KeyStrokeEditText DW;

            @dy(field = 3996684130194374825L)
            final /* synthetic */ Activity j6;

            static {
                iy.Zo(e.class);
            }

            @ey(method = 2011298644174371072L)
            e(f fVar, Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.j6 = activity;
                this.DW = keyStrokeEditText;
            }

            @Override // android.content.DialogInterface.OnShowListener
            @ey(method = 31190422741758280L)
            public void onShow(DialogInterface dialogInterface) {
                try {
                    if (FH) {
                        iy.tp(23183029202919651L, this, dialogInterface);
                    }
                    ((InputMethodManager) this.j6.getSystemService("input_method")).showSoftInput(this.DW, 1);
                    this.DW.selectAll();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, 23183029202919651L, this, dialogInterface);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(f.class);
        }

        @ey(method = -464795789004076383L)
        f(KeyStroke keyStroke, ValueRunnable valueRunnable, String str, String str2) {
            this.k2 = keyStroke;
            this.zh = valueRunnable;
            this.AL = str;
            this.w9 = str2;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = 2538487364002070459L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(-4965164946137233320L, this, activity);
                }
                KeyStrokeEditText keyStrokeEditText = new KeyStrokeEditText(activity);
                keyStrokeEditText.setKeyStroke(this.k2);
                keyStrokeEditText.setOnEditorActionListener(new a(activity, keyStrokeEditText));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(keyStrokeEditText).setMessage(this.AL).setCancelable(true).setPositiveButton(activity.getResources().getString(u.dialog_ok), new d(activity, keyStrokeEditText)).setNegativeButton(activity.getResources().getString(u.dialog_cancel), new c(this, activity, keyStrokeEditText)).setNeutralButton("Default", new b(activity, keyStrokeEditText));
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setOnShowListener(new e(this, activity, keyStrokeEditText));
                return alertDialogCreate;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, -4965164946137233320L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3958279937422720800L, container = 5024868934807443193L, user = true)
    static class g extends MessageBox {

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = -1432433651572329035L)
        final /* synthetic */ ValueRunnable AL;

        @dy(field = 3028732705941448765L)
        final /* synthetic */ boolean k2;

        @dy(field = 3315739999927215465L)
        final /* synthetic */ String w9;

        @dy(field = -1190970957400295671L)
        final /* synthetic */ List zh;

        @cy(clazz = 4519682100052898261L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -7632027175732812L)
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -811153367966802776L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(3437669693011932960L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    g.this.AL.j6(g.this.zh.get(i));
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 3437669693011932960L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(g.class);
        }

        @ey(method = -5093730844501790645L)
        g(boolean z, List list, ValueRunnable valueRunnable, String str) {
            this.k2 = z;
            this.zh = list;
            this.AL = valueRunnable;
            this.w9 = str;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = 1010893011337355800L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(-1758519470366775573L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(this.k2).setItems((CharSequence[]) this.zh.toArray(new CharSequence[0]), new a());
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(this.k2);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, -1758519470366775573L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3958375239309538611L, container = 5024868934807443193L, user = true)
    static class h extends MessageBox {

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = -1865370654922971735L)
        final /* synthetic */ ValueRunnable AL;

        @dy(field = 3843708164918210629L)
        final /* synthetic */ List k2;

        @dy(field = 3984073971576475393L)
        final /* synthetic */ String w9;

        @dy(field = -6682533287325437613L)
        final /* synthetic */ String zh;

        @cy(clazz = 4520062246626419040L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -15233529595183475L)
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -1268371417224799985L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(-1532858033377679073L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
                    if (checkedItemPositions != null) {
                        for (int i2 = 0; i2 < h.this.k2.size(); i2++) {
                            if (checkedItemPositions.get(i2)) {
                                h.this.AL.j6(h.this.k2.get(i2));
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -1532858033377679073L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4520158453745193961L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 262389115707171941L)
            b(h hVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -1265374264278481929L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (WB) {
                        iy.EQ(-784179588785311992L, this, dialogInterface, new Integer(i));
                    }
                } catch (Throwable th) {
                    if (mb) {
                        iy.Mr(th, -784179588785311992L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(h.class);
        }

        @ey(method = 8116035040652292936L)
        h(List list, String str, ValueRunnable valueRunnable, String str2) {
            this.k2 = list;
            this.zh = str;
            this.AL = valueRunnable;
            this.w9 = str2;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = 2304848254897192840L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(456209340131499376L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(true).setSingleChoiceItems((CharSequence[]) this.k2.toArray(new CharSequence[0]), this.k2.indexOf(this.zh), new b(this)).setPositiveButton(activity.getResources().getString(u.dialog_ok), new a());
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, 456209340131499376L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3958470541192293128L, container = 5024868934807443193L, user = true)
    static class i extends MessageBox {

        @gy
        private static /* synthetic */ boolean cT;

        @fy
        private static /* synthetic */ boolean hK;

        @dy(field = -2434806305319443328L)
        final /* synthetic */ ValueRunnable AL;

        @dy(field = -1152107920128976835L)
        final /* synthetic */ List k2;

        @dy(field = -2743689745000684184L)
        final /* synthetic */ String w9;

        @dy(field = -110085374519919708L)
        final /* synthetic */ List zh;

        @cy(clazz = 4520442404914297257L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -288550913290333240L)
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 939821529682376064L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(1704067078611090717L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    ArrayList arrayList = new ArrayList();
                    SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
                    if (checkedItemPositions != null) {
                        for (int i2 = 0; i2 < i.this.zh.size(); i2++) {
                            if (checkedItemPositions.get(i2)) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                        }
                    }
                    i.this.AL.j6(arrayList);
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 1704067078611090717L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4520538613991579824L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnMultiChoiceClickListener {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(b.class);
            }

            @ey(method = -193140971452371352L)
            b(i iVar) {
            }

            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            @ey(method = -1662625124804659683L)
            public void onClick(DialogInterface dialogInterface, int i, boolean z) {
                try {
                    if (j6) {
                        iy.we(1233984580418882220L, this, dialogInterface, new Integer(i), new Boolean(z));
                    }
                } catch (Throwable th) {
                    if (DW) {
                        iy.U2(th, 1233984580418882220L, this, dialogInterface, new Integer(i), new Boolean(z));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(i.class);
        }

        @ey(method = -803487139721104275L)
        i(List list, List list2, ValueRunnable valueRunnable, String str) {
            this.k2 = list;
            this.zh = list2;
            this.AL = valueRunnable;
            this.w9 = str;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -3537804853451679195L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(-76967748890346780L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                int size = this.k2.size();
                boolean[] zArr = new boolean[size];
                for (int i = 0; i < size; i++) {
                    zArr[i] = ((Boolean) this.k2.get(i)).booleanValue();
                }
                builder.setCancelable(true).setMultiChoiceItems((CharSequence[]) this.zh.toArray(new CharSequence[0]), zArr, new b(this)).setPositiveButton(activity.getResources().getString(u.dialog_ok), new a());
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, -76967748890346780L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3958565843070984351L, container = 5024868934807443193L, user = true)
    static class j extends MessageBox {

        @gy
        private static /* synthetic */ boolean hK;

        @fy
        private static /* synthetic */ boolean w9;

        @dy(field = -445866953976548720L)
        final /* synthetic */ String AL;

        @dy(field = -2825075644980759552L)
        final /* synthetic */ List k2;

        @dy(field = 2889050891286794940L)
        final /* synthetic */ ValueRunnable zh;

        @cy(clazz = 4520822574916532912L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = -8754046200451695L)
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = -797167275361479497L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(3066319009640289360L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    j.this.zh.j6(Integer.valueOf(i));
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 3066319009640289360L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(j.class);
        }

        @ey(method = -311045958953599601L)
        j(List list, ValueRunnable valueRunnable, String str) {
            this.k2 = list;
            this.zh = valueRunnable;
            this.AL = str;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -3021180994019088999L)
        public Dialog Hw(Activity activity) {
            try {
                if (w9) {
                    iy.tp(-2548067668697914160L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(true).setItems((CharSequence[]) this.k2.toArray(new CharSequence[0]), new a());
                if (this.AL != null) {
                    builder.setTitle(this.AL);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (hK) {
                    iy.j3(th, -2548067668697914160L, this, activity);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -3958661144945612280L, container = 5024868934807443193L, user = true)
    static class k extends MessageBox {

        @fy
        private static /* synthetic */ boolean cT;

        @gy
        private static /* synthetic */ boolean q7;

        @dy(field = 4142274710792878771L)
        final /* synthetic */ String AL;

        @dy(field = 1976087364605075148L)
        final /* synthetic */ String hK;

        @dy(field = -2449926334565788320L)
        final /* synthetic */ List k2;

        @dy(field = 1159516423046351696L)
        final /* synthetic */ Runnable w9;

        @dy(field = 1034440211150176132L)
        final /* synthetic */ ValueRunnable zh;

        @cy(clazz = 4521202756633126005L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 295814399519952288L)
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 145603909606991280L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(1186625401691336704L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    k.this.w9.run();
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 1186625401691336704L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 4521298969627423864L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 46465017703169871L)
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @ey(method = 21529186890582355L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(2127707248997716839L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    k.this.zh.j6(Integer.valueOf(i));
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 2127707248997716839L, this, dialogInterface, new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(k.class);
        }

        @ey(method = 8442672855902603616L)
        k(List list, ValueRunnable valueRunnable, String str, Runnable runnable, String str2) {
            this.k2 = list;
            this.zh = valueRunnable;
            this.AL = str;
            this.w9 = runnable;
            this.hK = str2;
        }

        @Override // com.aide.common.MessageBox
        @ey(method = -2296044638408974725L)
        public Dialog Hw(Activity activity) {
            try {
                if (cT) {
                    iy.tp(595647118095645911L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(true).setItems((CharSequence[]) this.k2.toArray(new CharSequence[0]), new b()).setPositiveButton(this.AL, new a());
                if (this.hK != null) {
                    builder.setTitle(this.hK);
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                return alertDialogCreate;
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, 595647118095645911L, this, activity);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(MessageBox.class);
            if (fY) {
                iy.gn(2645945776233719512L, null);
            }
            WB = 123456;
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 2645945776233719512L, null);
            }
            throw th;
        }
    }

    @ey(method = -68984221935676329L)
    public MessageBox() {
        try {
            if (fY) {
                iy.gn(3092900090037729216L, null);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 3092900090037729216L, null);
            }
            throw th;
        }
    }

    @ey(method = 3343915879014951045L)
    public static void BT(Activity activity, String str, String str2) {
        try {
            if (fY) {
                iy.we(-698948115640071760L, null, activity, str, str2);
            }
            vy(activity, str, str2, null, null);
        } catch (Throwable th) {
            if (qp) {
                iy.U2(th, -698948115640071760L, null, activity, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 561543518076574032L)
    public static void EQ(Activity activity, String str, String str2, KeyStroke keyStroke, ValueRunnable<KeyStroke> valueRunnable) {
        try {
            if (fY) {
                iy.J8(-3503017673943808509L, null, activity, str, str2, keyStroke, valueRunnable);
            }
            gW(activity, new f(keyStroke, valueRunnable, str2, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -3503017673943808509L, null, activity, str, str2, keyStroke, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -1837416764125363883L)
    public static void J0(Activity activity, String str, List<String> list, List<String> list2, String str2, ValueRunnable<String> valueRunnable) {
        try {
            if (fY) {
                iy.QX(180520758049932960L, null, new Object[]{activity, str, list, list2, str2, valueRunnable});
            }
            ArrayList arrayList = new ArrayList();
            List arrayList2 = str2 == null ? new ArrayList() : Arrays.asList(str2.split("\\|"));
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(arrayList2.contains(it.next())));
            }
            we(activity, str, list2, arrayList, new c(valueRunnable, list));
        } catch (Throwable th) {
            if (qp) {
                iy.rN(th, 180520758049932960L, null, new Object[]{activity, str, list, list2, str2, valueRunnable});
            }
            throw th;
        }
    }

    @ey(method = -1638140963074913828L)
    public static void J8(Activity activity, String str, String str2, ValueRunnable<String> valueRunnable) {
        try {
            if (fY) {
                iy.J0(-69390917322171561L, null, activity, str, str2, valueRunnable);
            }
            U2(activity, str, str2, null, "", true, valueRunnable, null, null);
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, -69390917322171561L, null, activity, str, str2, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 1189294901341037736L)
    public static void KD(Activity activity, String str, String str2, boolean z, String str3, Runnable runnable, String str4, Runnable runnable2) throws Throwable {
        int i2;
        try {
            if (fY) {
                iy.QX(1055828477187536269L, null, new Object[]{activity, str, str2, new Boolean(z), str3, runnable, str4, runnable2});
            }
            i2 = 8;
        } catch (Throwable th) {
            th = th;
            i2 = 8;
        }
        try {
            gW(activity, new d(str2, z, str3, runnable, str4, runnable2, str));
        } catch (Throwable th2) {
            th = th2;
            if (qp) {
                Object[] objArr = new Object[i2];
                objArr[0] = activity;
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = new Boolean(z);
                objArr[4] = str3;
                objArr[5] = runnable;
                objArr[6] = str4;
                objArr[7] = runnable2;
                iy.rN(th, 1055828477187536269L, null, objArr);
            }
            throw th;
        }
    }

    @ey(method = 5911326403260571941L)
    public static void Mr(Activity activity, String str, String str2, String str3, String str4, ValueRunnable<String> valueRunnable, Runnable runnable) throws Throwable {
        int i2;
        try {
            if (fY) {
                iy.QX(168187044948249936L, null, new Object[]{activity, str, str2, str3, str4, valueRunnable, runnable});
            }
            i2 = 7;
        } catch (Throwable th) {
            th = th;
            i2 = 7;
        }
        try {
            U2(activity, str, str2, str3, str4, false, valueRunnable, null, runnable);
        } catch (Throwable th2) {
            th = th2;
            if (qp) {
                Object[] objArr = new Object[i2];
                objArr[0] = activity;
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = str3;
                objArr[4] = str4;
                objArr[5] = valueRunnable;
                objArr[6] = runnable;
                iy.rN(th, 168187044948249936L, null, objArr);
            }
            throw th;
        }
    }

    @ey(method = 7811129277306122139L)
    public static void P8(Activity activity, String str, Throwable th) {
        try {
            if (fY) {
                iy.we(3130417175904377728L, null, activity, str, th);
            }
            BT(activity, str, th.getMessage());
        } catch (Throwable th2) {
            if (qp) {
                iy.U2(th2, 3130417175904377728L, null, activity, str, th);
            }
            throw th2;
        }
    }

    @ey(method = -2645716499461502976L)
    public static void QX(Activity activity, String str, List<String> list, String str2, ValueRunnable<String> valueRunnable) {
        try {
            if (fY) {
                iy.J8(-3760047611910473927L, null, activity, str, list, str2, valueRunnable);
            }
            gW(activity, new h(list, str2, valueRunnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -3760047611910473927L, null, activity, str, list, str2, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -2506856648704293672L)
    public static void SI(Activity activity, String str, String str2, boolean z, Runnable runnable, Runnable runnable2) throws Throwable {
        int i2;
        try {
            if (fY) {
                iy.QX(5105403798688451025L, null, new Object[]{activity, str, str2, new Boolean(z), runnable, runnable2});
            }
            i2 = 6;
            try {
                KD(activity, str, str2, z, activity.getResources().getString(u.dialog_ok), runnable, null, runnable2);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = new Boolean(z);
                    objArr[4] = runnable;
                    objArr[5] = runnable2;
                    iy.rN(th, 5105403798688451025L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 6;
        }
    }

    @ey(method = -1566426823076169451L)
    private static void U2(Activity activity, String str, String str2, String str3, String str4, boolean z, ValueRunnable<String> valueRunnable, Runnable runnable, Runnable runnable2) throws Throwable {
        int i2;
        try {
            if (fY) {
                iy.QX(3054568361754767520L, null, new Object[]{activity, str, str2, str3, str4, new Boolean(z), valueRunnable, runnable, runnable2});
            }
            i2 = 9;
            try {
                gW(activity, new b(valueRunnable, str2, str3, runnable2, str, runnable, str4, z));
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = str4;
                    objArr[5] = new Boolean(z);
                    objArr[6] = valueRunnable;
                    objArr[7] = runnable;
                    objArr[8] = runnable2;
                    iy.rN(th, 3054568361754767520L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 9;
        }
    }

    @ey(method = 644383161833065479L)
    public static void VH(Activity activity, String str, List<String> list, ValueRunnable<String> valueRunnable) {
        try {
            if (fY) {
                iy.J0(-148070399176192040L, null, activity, str, list, valueRunnable);
            }
            gn(activity, str, list, true, valueRunnable);
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, -148070399176192040L, null, activity, str, list, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -2491714159410861875L)
    public static void Ws(Activity activity, String str, String str2, ValueRunnable<String> valueRunnable, Runnable runnable) {
        try {
            if (fY) {
                iy.J8(906927055807916440L, null, activity, str, str2, valueRunnable, runnable);
            }
            U2(activity, str, str2, null, "", true, valueRunnable, runnable, null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 906927055807916440L, null, activity, str, str2, valueRunnable, runnable);
            }
            throw th;
        }
    }

    @ey(method = 47542479352606348L)
    public static void XL(Activity activity, int i2, int i3, String str, ValueRunnable<String> valueRunnable) {
        try {
            if (fY) {
                iy.J8(151762829408225239L, null, activity, new Integer(i2), new Integer(i3), str, valueRunnable);
            }
            U2(activity, activity.getResources().getString(i2), activity.getResources().getString(i3), null, str, false, valueRunnable, null, null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 151762829408225239L, null, activity, new Integer(i2), new Integer(i3), str, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 3749389328480235776L)
    public static Dialog Zo(Activity activity, int i2) {
        try {
            if (fY) {
                iy.EQ(2506262724897775411L, null, activity, new Integer(i2));
            }
            if (mb == null || i2 != WB) {
                return null;
            }
            Dialog dialogHw = mb.Hw(activity);
            jw = dialogHw;
            mb = null;
            return dialogHw;
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, 2506262724897775411L, null, activity, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5838149377740180180L)
    public static void a8(Activity activity, int i2, int i3, Runnable runnable, Runnable runnable2) {
        try {
            if (fY) {
                iy.J8(-1503547478896582951L, null, activity, new Integer(i2), new Integer(i3), runnable, runnable2);
            }
            yS(activity, activity.getResources().getString(i2), activity.getResources().getString(i3), activity.getResources().getString(u.dialog_yes), runnable, activity.getResources().getString(u.dialog_no), runnable2, null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -1503547478896582951L, null, activity, new Integer(i2), new Integer(i3), runnable, runnable2);
            }
            throw th;
        }
    }

    @ey(method = -5100645768597054232L)
    public static void aM(Activity activity, String str, String str2, String str3, ValueRunnable<String> valueRunnable) {
        try {
            if (fY) {
                iy.J8(-4588375171618658035L, null, activity, str, str2, str3, valueRunnable);
            }
            U2(activity, str, str2, null, str3, false, valueRunnable, null, null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -4588375171618658035L, null, activity, str, str2, str3, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 595998817527044448L)
    public static void ei(Activity activity, String str, String str2, Runnable runnable) {
        try {
            if (fY) {
                iy.J0(-904460221399655865L, null, activity, str, str2, runnable);
            }
            nw(activity, str, str2, runnable, null);
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, -904460221399655865L, null, activity, str, str2, runnable);
            }
            throw th;
        }
    }

    @ey(method = 408104555774484455L)
    public static void er(Activity activity, String str, String str2, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        try {
            if (fY) {
                iy.QX(-462102440538914400L, null, new Object[]{activity, str, str2, runnable, runnable2, runnable3});
            }
            yS(activity, str, str2, activity.getResources().getString(u.dialog_yes), runnable, activity.getResources().getString(u.dialog_no), runnable2, runnable3);
        } catch (Throwable th) {
            if (qp) {
                iy.rN(th, -462102440538914400L, null, new Object[]{activity, str, str2, runnable, runnable2, runnable3});
            }
            throw th;
        }
    }

    @ey(method = -3883324325689152896L)
    public static void gW(Activity activity, MessageBox messageBox) {
        try {
            if (fY) {
                iy.EQ(1351077689876059017L, null, activity, messageBox);
            }
            mb = messageBox;
            if (jw == null || !jw.isShowing()) {
                activity.removeDialog(WB);
                activity.showDialog(WB);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, 1351077689876059017L, null, activity, messageBox);
            }
            throw th;
        }
    }

    @ey(method = 1784540900011794756L)
    private static void gn(Activity activity, String str, List<String> list, boolean z, ValueRunnable<String> valueRunnable) {
        try {
            if (fY) {
                iy.J8(402897956292350155L, null, activity, str, list, new Boolean(z), valueRunnable);
            }
            gW(activity, new g(z, list, valueRunnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 402897956292350155L, null, activity, str, list, new Boolean(z), valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = -1362516939658505397L)
    public static void j3(Activity activity, String str, String str2, String str3, ValueRunnable<String> valueRunnable, Runnable runnable) throws Throwable {
        int i2;
        try {
            if (fY) {
                iy.QX(-2288868229835334720L, null, new Object[]{activity, str, str2, str3, valueRunnable, runnable});
            }
            i2 = 6;
            try {
                U2(activity, str, str2, null, str3, false, valueRunnable, runnable, null);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = valueRunnable;
                    objArr[5] = runnable;
                    iy.rN(th, -2288868229835334720L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 6;
        }
    }

    @ey(method = -438266126925518752L)
    public static void lg(Activity activity, int i2, int i3, List<String> list, Runnable runnable, Runnable runnable2) throws Throwable {
        int i4;
        try {
            if (fY) {
                iy.QX(4308149308601165769L, null, new Object[]{activity, new Integer(i2), new Integer(i3), list, runnable, runnable2});
            }
            Iterator<String> it = list.iterator();
            String str = "\n";
            while (it.hasNext()) {
                String str2 = str + "\n";
                str = str2 + it.next();
            }
            i4 = 6;
            try {
                yS(activity, activity.getResources().getString(i2), activity.getResources().getString(i3) + str, activity.getResources().getString(u.dialog_no), runnable2, activity.getResources().getString(u.dialog_yes), runnable, null);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i4];
                    objArr[0] = activity;
                    objArr[1] = new Integer(i2);
                    objArr[2] = new Integer(i3);
                    objArr[3] = list;
                    objArr[4] = runnable;
                    objArr[5] = runnable2;
                    iy.rN(th, 4308149308601165769L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i4 = 6;
        }
    }

    @ey(method = -747105767102146245L)
    public static void nw(Activity activity, String str, String str2, Runnable runnable, Runnable runnable2) {
        try {
            if (fY) {
                iy.J8(2472989728482213624L, null, activity, str, str2, runnable, runnable2);
            }
            SI(activity, str, str2, true, runnable, runnable2);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 2472989728482213624L, null, activity, str, str2, runnable, runnable2);
            }
            throw th;
        }
    }

    @ey(method = -4029405619039475272L)
    public static void rN(Activity activity, String str, String str2, Runnable runnable, Runnable runnable2) {
        try {
            if (fY) {
                iy.J8(-2371412091065305893L, null, activity, str, str2, runnable, runnable2);
            }
            er(activity, str, str2, runnable, runnable2, null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -2371412091065305893L, null, activity, str, str2, runnable, runnable2);
            }
            throw th;
        }
    }

    @ey(method = 236120766311045056L)
    public static void tp(Activity activity, String str, List<String> list, String str2, ValueRunnable<Integer> valueRunnable, Runnable runnable) {
        try {
            if (fY) {
                iy.QX(-2909215533603728327L, null, new Object[]{activity, str, list, str2, valueRunnable, runnable});
            }
            gW(activity, new k(list, valueRunnable, str2, runnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.rN(th, -2909215533603728327L, null, new Object[]{activity, str, list, str2, valueRunnable, runnable});
            }
            throw th;
        }
    }

    @ey(method = 275230826407298301L)
    public static void u7(Activity activity, String str, List<String> list, ValueRunnable<Integer> valueRunnable) {
        try {
            if (fY) {
                iy.J0(3990082611457703920L, null, activity, str, list, valueRunnable);
            }
            gW(activity, new j(list, valueRunnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, 3990082611457703920L, null, activity, str, list, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 1676513858757769515L)
    public static void v5() {
        try {
            if (fY) {
                iy.gn(-1930894419615225120L, null);
            }
            if (jw != null) {
                jw.dismiss();
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -1930894419615225120L, null);
            }
            throw th;
        }
    }

    @ey(method = 532183942647000072L)
    public static void vy(Activity activity, String str, String str2, String str3, Runnable runnable) {
        try {
            if (fY) {
                iy.J8(-272934343473094215L, null, activity, str, str2, str3, runnable);
            }
            gW(activity, new a(str2, str3, runnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -272934343473094215L, null, activity, str, str2, str3, runnable);
            }
            throw th;
        }
    }

    @ey(method = 197454798652248660L)
    public static void we(Activity activity, String str, List<String> list, List<Boolean> list2, ValueRunnable<List<Integer>> valueRunnable) {
        try {
            if (fY) {
                iy.J8(2946678106909654611L, null, activity, str, list, list2, valueRunnable);
            }
            gW(activity, new i(list2, list, valueRunnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 2946678106909654611L, null, activity, str, list, list2, valueRunnable);
            }
            throw th;
        }
    }

    @ey(method = 1674966191273497083L)
    public static void yS(Activity activity, String str, String str2, String str3, Runnable runnable, String str4, Runnable runnable2, Runnable runnable3) throws Throwable {
        int i2;
        try {
            if (fY) {
                iy.QX(-7872005745516604032L, null, new Object[]{activity, str, str2, str3, runnable, str4, runnable2, runnable3});
            }
            i2 = 8;
            try {
                gW(activity, new e(str2, str3, runnable, str4, runnable2, runnable3, str));
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = runnable;
                    objArr[5] = str4;
                    objArr[6] = runnable2;
                    objArr[7] = runnable3;
                    iy.rN(th, -7872005745516604032L, null, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 8;
        }
    }

    @ey(method = -2282499318135624764L)
    protected abstract Dialog Hw(Activity activity);
}
