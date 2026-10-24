package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TableRow;
import android.widget.TextView;
import com.aide.common.ClickableBorder;
import com.aide.common.PositionalXMLReader;
import com.aide.common.UndoManager;
import com.aide.common.ValueRunnable;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.p;
import com.aide.uidesigner.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.probelytics.api.UserTouchAction;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@cy(clazz = -1505387028266607057L, container = -1505387028266607057L, user = true)
/* loaded from: classes.dex */
public abstract class l implements UndoManager.UndoManagerListener {

    @gy
    private static /* synthetic */ boolean Jl;

    @fy
    private static /* synthetic */ boolean kf;

    @dy(field = -581539772238557944L)
    private String AL;

    @dy(field = -1371330639943749312L)
    private ArrayList<Element> Q6;

    @dy(field = -299847889425476385L)
    private Context WB;

    @dy(field = 905646889509695480L)
    private boolean Z1;

    @dy(field = -2889828776746345815L)
    private UndoManager cT;

    @dy(field = -1907026830298643155L)
    private Map<String, Node> fY;

    @dy(field = 6688832344314699345L)
    private Throwable hK;

    @dy(field = -627164059570135019L)
    private ViewGroup jw;

    @dy(field = 2569888149764487672L)
    private List<f> k2;

    @dy(field = -3173533546194582164L)
    private String mb;

    @dy(field = -102076094400206760L)
    private ValueRunnable<f> n5;

    @dy(field = 1917395955943198641L)
    private boolean q7;

    @dy(field = -2982951462418673808L)
    private Map<String, Integer> qp;

    @dy(field = -543436089053332485L)
    private Document w9;

    @dy(field = -409717559839542768L)
    private j zh;

    @cy(clazz = 1578043037330491600L, container = -1505387028266607057L, user = true)
    class a extends ClickableBorder {

        @gy
        private static /* synthetic */ boolean hK;

        @fy
        private static /* synthetic */ boolean w9;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 587502832512474880L)
        a(Context context, View view) {
            super(context, view);
        }

        @Override // com.aide.common.ClickableBorder
        @ey(method = 3403041409525994265L)
        protected void Hw() {
            try {
                if (w9) {
                    iy.gn(3208516725554976792L, this);
                }
                if (!l.this.q7 || l.this.ca()) {
                    return;
                }
                l.this.br();
            } catch (Throwable th) {
                if (hK) {
                    iy.aM(th, 3208516725554976792L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1578126810207181311L, container = -1505387028266607057L, user = true)
    class b extends BaseExpandableListAdapter {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 27328104565695896L)
        b() {
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 982916760897295677L)
        public Object getChild(int i, int i2) {
            try {
                if (!DW) {
                    return null;
                }
                iy.EQ(3812158390644098649L, this, new Integer(i), new Integer(i2));
                return null;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 3812158390644098649L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -2455592382232554624L)
        public long getChildId(int i, int i2) {
            try {
                if (!DW) {
                    return 0L;
                }
                iy.EQ(156678578588808L, this, new Integer(i), new Integer(i2));
                return 0L;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 156678578588808L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -2227456186571250175L)
        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            try {
                if (DW) {
                    iy.J8(1370934711070881999L, this, new Integer(i), new Integer(i2), new Boolean(z), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(l.this.WB).inflate(R.layout.simple_expandable_list_item_2, viewGroup, false) : view;
                TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
                StringBuilder sb = new StringBuilder();
                sb.append("Item ");
                int i3 = i2 + 1;
                sb.append(i3);
                textView.setText(sb.toString());
                ((TextView) viewInflate.findViewById(R.id.text2)).setText("Item " + i3);
                return viewInflate;
            } catch (Throwable th) {
                if (FH) {
                    iy.lg(th, 1370934711070881999L, this, new Integer(i), new Integer(i2), new Boolean(z), view, viewGroup);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -4982255037806816224L)
        public int getChildrenCount(int i) {
            try {
                if (!DW) {
                    return 2;
                }
                iy.u7(-3742943147527237168L, this, i);
                return 2;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -3742943147527237168L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -913490219873276773L)
        public Object getGroup(int i) {
            try {
                if (!DW) {
                    return null;
                }
                iy.u7(-128065633659257303L, this, i);
                return null;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -128065633659257303L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -5495115976507608203L)
        public int getGroupCount() {
            try {
                if (!DW) {
                    return 30;
                }
                iy.gn(4796115743598909483L, this);
                return 30;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 4796115743598909483L, this);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -895106342997241056L)
        public long getGroupId(int i) {
            try {
                if (DW) {
                    iy.u7(44237693808139780L, this, i);
                }
                return i;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 44237693808139780L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -3540904556454270291L)
        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            try {
                if (DW) {
                    iy.J0(5110418311299742197L, this, new Integer(i), new Boolean(z), view, viewGroup);
                }
                View viewInflate = view == null ? LayoutInflater.from(l.this.WB).inflate(R.layout.simple_expandable_list_item_1, viewGroup, false) : view;
                ((TextView) viewInflate.findViewById(R.id.text1)).setText("Group " + (i + 1));
                return viewInflate;
            } catch (Throwable th) {
                if (FH) {
                    iy.a8(th, 5110418311299742197L, this, new Integer(i), new Boolean(z), view, viewGroup);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = 4655885736357998472L)
        public boolean hasStableIds() {
            try {
                if (!DW) {
                    return true;
                }
                iy.gn(3357678628057742380L, this);
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, 3357678628057742380L, this);
                }
                throw th;
            }
        }

        @Override // android.widget.ExpandableListAdapter
        @ey(method = -35363442974433009L)
        public boolean isChildSelectable(int i, int i2) {
            try {
                if (!DW) {
                    return true;
                }
                iy.EQ(8449732978807418109L, this, new Integer(i), new Integer(i2));
                return true;
            } catch (Throwable th) {
                if (FH) {
                    iy.Mr(th, 8449732978807418109L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    @cy(clazz = 1578210583087934316L, container = -1505387028266607057L, user = true)
    static /* synthetic */ class c {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = -2151167927985882936L)
        static final /* synthetic */ int[] j6;

        static {
            try {
                iy.Zo(c.class);
                if (DW) {
                    iy.gn(-345118526422622913L, null);
                }
                int[] iArr = new int[h.c.values().length];
                j6 = iArr;
                try {
                    iArr[h.c.Bool.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    j6[h.c.ID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    j6[h.c.Int.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    j6[h.c.IntConstant.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    j6[h.c.Float.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    j6[h.c.Color.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    j6[h.c.DrawableResource.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    j6[h.c.Drawable.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    j6[h.c.Text.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    j6[h.c.EnumConstant.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    j6[h.c.TextAppearance.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    j6[h.c.Size.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    j6[h.c.TextSize.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    j6[h.c.LayoutSize.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    j6[h.c.FloatSize.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
            } catch (Throwable th) {
                if (FH) {
                    iy.aM(th, -345118526422622913L, null);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(l.class);
    }

    @ey(method = -2776909896855736923L)
    public l(ViewGroup viewGroup, String str, String str2, UndoManager undoManager) {
        try {
            if (kf) {
                iy.J0(1631316635657174407L, null, viewGroup, str, str2, undoManager);
            }
            this.fY = new HashMap();
            this.qp = new HashMap();
            this.k2 = new ArrayList();
            undoManager.DW(this);
            this.cT = undoManager;
            this.WB = viewGroup.getContext();
            this.jw = viewGroup;
            this.mb = str;
            this.zh = new j(this.WB, str2);
        } catch (Throwable th) {
            if (Jl) {
                iy.a8(th, 1631316635657174407L, null, viewGroup, str, str2, undoManager);
            }
            throw th;
        }
    }

    @ey(method = -7572876402243923316L)
    private Object BT(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(-786170089461139360L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            Drawable drawableZo = this.zh.Zo(strCb);
            if (drawableZo != null) {
                return drawableZo;
            }
            if (strCb != null) {
                if (strCb.startsWith("@android:drawable/")) {
                    try {
                        return this.WB.getResources().getDrawable(((Integer) R.drawable.class.getDeclaredField(strCb.substring(18)).get(null)).intValue());
                    } catch (Throwable unused) {
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -786170089461139360L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -3327151286448363088L)
    private void CU(Node node, String str, String str2) {
        try {
            if (kf) {
                iy.we(4096194408716705592L, this, node, str, str2);
            }
            if (node instanceof Element) {
                NamedNodeMap attributes = ((Element) node).getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Attr attr = (Attr) attributes.item(i);
                    if (str.equals(attr.getValue())) {
                        attr.setValue(str2);
                    }
                }
            }
            NodeList childNodes = node.getChildNodes();
            if (childNodes != null) {
                for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                    CU(childNodes.item(i2), str, str2);
                }
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.U2(th, 4096194408716705592L, this, node, str, str2);
            }
            throw th;
        }
    }

    @ey(method = 195872120940643432L)
    private void J0(NodeList nodeList) {
        try {
            if (kf) {
                iy.tp(-1982429001582559960L, this, nodeList);
            }
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nodeItem = nodeList.item(i);
                if (nodeItem.getNodeType() == 1) {
                    String strG3 = g3(nodeItem);
                    if (strG3 != null && !this.qp.containsKey(strG3)) {
                        this.fY.put(strG3, nodeItem);
                        this.qp.put(strG3, Integer.valueOf(this.qp.size() + 100));
                    }
                    J0(nodeItem.getChildNodes());
                }
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, -1982429001582559960L, this, nodeList);
            }
            throw th;
        }
    }

    @ey(method = 2358632434665019344L)
    private void J8(View view, boolean z) {
        try {
            if (kf) {
                iy.EQ(3670480801501579884L, this, view, new Boolean(z));
            }
            if (z) {
                int i = (int) (this.WB.getResources().getDisplayMetrics().density * 20.0f);
                view.setMinimumHeight(i);
                view.setMinimumWidth(i);
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).setClipChildren(false);
                    ((ViewGroup) view).setClipToPadding(false);
                }
                view.setFocusable(false);
                if (view.getClass() == TextView.class || view.getClass() == Button.class) {
                    ((TextView) view).setText(view.getClass().getSimpleName());
                }
            }
            if (view.getClass() == ListView.class) {
                j3((ListView) view);
            }
            if (view.getClass() == Spinner.class) {
                Mr((Spinner) view);
            }
            if (view.getClass() == ExpandableListView.class) {
                aM((ExpandableListView) view);
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 3670480801501579884L, this, view, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1839238766686407257L)
    private Integer KD(String str, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(2994647320866866795L, this, str, bVar);
            }
            if (bVar.gn == null) {
                return Integer.valueOf(((Integer) bVar.Zo.getField(str.toUpperCase()).get(null)).intValue());
            }
            for (Field field : bVar.Zo.getFields()) {
                String name = field.getName();
                if ((field.getModifiers() & 8) != 0 && name.startsWith(bVar.gn) && name.substring(bVar.gn.length()).replace("_", "").toUpperCase().equals(str.toUpperCase())) {
                    return Integer.valueOf(((Integer) field.get(null)).intValue());
                }
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 2994647320866866795L, this, str, bVar);
            }
            throw th;
        }
    }

    @ey(method = -1190108588720790984L)
    private void Mr(Spinner spinner) {
        try {
            if (kf) {
                iy.tp(1205977724896905528L, this, spinner);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 30; i++) {
                arrayList.add("Item " + i);
            }
            spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(this.WB, R.layout.simple_list_item_1, arrayList));
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 1205977724896905528L, this, spinner);
            }
            throw th;
        }
    }

    @ey(method = -1331537694209488239L)
    private Enum<?> P8(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(-3308306533277547471L, this, node, bVar);
            }
            try {
                String strCb = cb(node, bVar);
                if (strCb != null) {
                    for (Field field : bVar.Zo.getFields()) {
                        String name = field.getName();
                        if ((field.getModifiers() & 8) != 0 && name.replace("_", "").equals(strCb.toUpperCase())) {
                            return (Enum) field.get(null);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -3308306533277547471L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 2349038109322061875L)
    private Element QX(com.aide.uidesigner.b bVar) {
        try {
            if (kf) {
                iy.tp(3783036654195827823L, this, bVar);
            }
            Element elementCreateElement = this.w9.createElement(bVar.j6);
            for (Map.Entry<String, String> entry : bVar.DW.entrySet()) {
                elementCreateElement.setAttribute(entry.getKey(), entry.getValue());
            }
            return elementCreateElement;
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 3783036654195827823L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 1474581584557770820L)
    private void Qq(com.aide.uidesigner.c cVar, Node node, h.b[] bVarArr) {
        int i;
        try {
            if (kf) {
                iy.we(-4197485706801327584L, this, cVar, node, bVarArr);
            }
            for (h.b bVar : bVarArr) {
                if (cVar.j6(bVar)) {
                    Object objCn = cn(node, bVar);
                    if (this.q7 && (objCn instanceof Integer) && ((bVar == h.v5 || bVar == h.Zo) && ((Integer) objCn).intValue() >= 0 && ((Integer) objCn).intValue() < (i = (int) (this.WB.getResources().getDisplayMetrics().density * 10.0f)))) {
                        objCn = Integer.valueOf(i);
                    }
                    cVar.DW(bVar, objCn);
                }
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.U2(th, -4197485706801327584L, this, cVar, node, bVarArr);
            }
            throw th;
        }
    }

    @ey(method = 1254800953325762755L)
    private Integer SI(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(391885825669823899L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            if (strCb == null) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(strCb));
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 391885825669823899L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 2217410949801159588L)
    private Object Sf(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(-1588890119246252064L, this, node, bVar);
            }
            try {
                String str = sh(node, bVar).DW;
                if (str != null && str.startsWith("?android:attr/")) {
                    int iIntValue = ((Integer) R.attr.class.getField(str.substring(14)).get(null)).intValue();
                    switch (c.j6[bVar.v5.ordinal()]) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            TypedValue typedValue = new TypedValue();
                            if (this.WB.getTheme().resolveAttribute(iIntValue, typedValue, true)) {
                                return Integer.valueOf((int) TypedValue.complexToDimension(typedValue.data, this.WB.getResources().getDisplayMetrics()));
                            }
                            break;
                        default:
                            TypedArray typedArrayObtainStyledAttributes = this.WB.obtainStyledAttributes(new int[]{iIntValue});
                            try {
                                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                                    switch (c.j6[bVar.v5.ordinal()]) {
                                        case 1:
                                            return Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(0, false));
                                        case 2:
                                        case 3:
                                        case 4:
                                            return Integer.valueOf(typedArrayObtainStyledAttributes.getInt(0, 0));
                                        case 5:
                                            return Float.valueOf(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
                                        case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                                            return Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0));
                                        case UserTouchAction.CLICK_KIND /* 7 */:
                                        case 8:
                                            return typedArrayObtainStyledAttributes.getDrawable(0);
                                        case 9:
                                            return typedArrayObtainStyledAttributes.getString(0);
                                    }
                                }
                                typedArrayObtainStyledAttributes.recycle();
                                break;
                            } finally {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                            break;
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -1588890119246252064L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 2791533984229173216L)
    private void Xa() {
        try {
            if (kf) {
                iy.gn(3631003574466291488L, this);
            }
            this.AL = new e().DW(this.w9);
            this.cT.FH(I(), this.AL, 0);
            x9();
            XG(true);
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 3631003574466291488L, this);
            }
            throw th;
        }
    }

    @ey(method = 4427299770065563L)
    private void aM(ExpandableListView expandableListView) {
        try {
            if (kf) {
                iy.tp(-738407496630855689L, this, expandableListView);
            }
            expandableListView.setAdapter(new b());
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, -738407496630855689L, this, expandableListView);
            }
            throw th;
        }
    }

    @ey(method = -387843958894595511L)
    private com.aide.uidesigner.c aj(Node node, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        try {
            if (kf) {
                iy.EQ(2051465859622571161L, this, node, viewGroup);
            }
            try {
                Class<?> cls = Class.forName(viewGroup.getClass().getName() + "$LayoutParams");
                try {
                    layoutParams = (ViewGroup.LayoutParams) cls.getConstructor(Integer.TYPE, Integer.TYPE).newInstance(-2, -2);
                } catch (NoSuchMethodException unused) {
                    layoutParams = (ViewGroup.LayoutParams) cls.getConstructor(ViewGroup.LayoutParams.class).newInstance(new ViewGroup.LayoutParams(-1, -1));
                }
                com.aide.uidesigner.c cVar = new com.aide.uidesigner.c(layoutParams);
                String strTp = this.zh.tp(ef((Element) node));
                if (strTp != null && strTp.startsWith("?android:attr/")) {
                    try {
                        TypedArray typedArrayObtainStyledAttributes = this.WB.getTheme().obtainStyledAttributes(((Integer) R.attr.class.getField(strTp.substring(14)).get(null)).intValue(), new int[]{R.attr.layout_width, R.attr.layout_height});
                        if (typedArrayObtainStyledAttributes.hasValue(0)) {
                            layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(0, "layout_width");
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(1)) {
                            layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(1, "layout_height");
                        }
                        typedArrayObtainStyledAttributes.recycle();
                    } catch (Throwable unused2) {
                    }
                }
                Qq(cVar, node, h.VH);
                return cVar;
            } catch (Throwable unused3) {
                return new com.aide.uidesigner.c(new ViewGroup.LayoutParams(-2, -2));
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 2051465859622571161L, this, node, viewGroup);
            }
            throw th;
        }
    }

    @ey(method = 4052035051477996023L)
    private String cb(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(2322103365689831583L, this, node, bVar);
            }
            return this.zh.DW(sh(node, bVar).DW);
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 2322103365689831583L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 5725625997021570563L)
    private Object cn(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(-4411770270521347633L, this, node, bVar);
            }
            Object objSf = Sf(node, bVar);
            return objSf != null ? objSf : gW(node, bVar);
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -4411770270521347633L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 2849994407340638369L)
    private Integer dx(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(-871692604657668415L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            if (strCb != null) {
                try {
                    if (strCb.endsWith("px")) {
                        return Integer.valueOf((int) Float.parseFloat(strCb.substring(0, strCb.length() - 2)));
                    }
                    if (strCb.endsWith("dp")) {
                        return Integer.valueOf((int) (Float.parseFloat(strCb.substring(0, strCb.length() - 2)) * this.WB.getResources().getDisplayMetrics().density));
                    }
                    if (strCb.endsWith("dip")) {
                        return Integer.valueOf((int) (Float.parseFloat(strCb.substring(0, strCb.length() - 3)) * this.WB.getResources().getDisplayMetrics().density));
                    }
                    if (strCb.endsWith("sp")) {
                        return Integer.valueOf((int) (Float.parseFloat(strCb.substring(0, strCb.length() - 2)) * this.WB.getResources().getDisplayMetrics().scaledDensity));
                    }
                    if (strCb.startsWith("@android:dimen/")) {
                        return Integer.valueOf(this.WB.getResources().getDimensionPixelSize(((Integer) R.dimen.class.getDeclaredField(strCb.substring(15)).get(null)).intValue()));
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -871692604657668415L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 3682233953707219680L)
    private Float ei(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(3560116257338929320L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            if (strCb == null) {
                return null;
            }
            try {
                return Float.valueOf(Float.parseFloat(strCb));
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 3560116257338929320L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -1452673214983620672L)
    private Boolean er(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(2945072507110409360L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            if (strCb == null) {
                return null;
            }
            return Boolean.valueOf("true".equals(strCb));
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 2945072507110409360L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -275697771859501555L)
    private void et(Element element) {
        try {
            if (kf) {
                iy.tp(-1340961295036898355L, this, element);
            }
            for (h.b bVar : h.VH) {
                if (bVar != h.v5 && bVar != h.Zo && element.hasAttribute(bVar.Hw)) {
                    element.removeAttribute(bVar.Hw);
                }
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, -1340961295036898355L, this, element);
            }
            throw th;
        }
    }

    @ey(method = -5756492489242968472L)
    private Object gW(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(4620040786862887992L, this, node, bVar);
            }
            switch (c.j6[bVar.v5.ordinal()]) {
                case 1:
                    return er(node, bVar);
                case 2:
                    return nw(node, bVar);
                case 3:
                    return SI(node, bVar);
                case 4:
                    return ro(node, bVar);
                case 5:
                    return ei(node, bVar);
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    return yS(node, bVar);
                case UserTouchAction.CLICK_KIND /* 7 */:
                    return BT(node, bVar);
                case 8:
                    Integer numYS = yS(node, bVar);
                    return numYS != null ? new ColorDrawable(numYS.intValue()) : BT(node, bVar);
                case 9:
                    return sG(node, bVar);
                case 10:
                    return P8(node, bVar);
                case 11:
                    return cb(node, bVar);
                case 12:
                    return dx(node, bVar);
                case 13:
                    return vJ(node, bVar);
                case 14:
                    Integer numDx = dx(node, bVar);
                    if (numDx != null) {
                        return numDx;
                    }
                    Integer numRo = ro(node, bVar);
                    if (numRo != null) {
                        return numRo;
                    }
                    return null;
                case 15:
                    if (dx(node, bVar) != null) {
                        return new Float(r0.intValue());
                    }
                    return null;
                default:
                    return null;
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 4620040786862887992L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -716114892006096896L)
    private void j3(ListView listView) {
        try {
            if (kf) {
                iy.tp(1188289423867056316L, this, listView);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 30; i++) {
                arrayList.add("Item " + i);
            }
            listView.setAdapter((ListAdapter) new ArrayAdapter(this.WB, R.layout.simple_list_item_1, arrayList));
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 1188289423867056316L, this, listView);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    @ey(method = -3932944335989979149L)
    private View lp(Node node, String str) {
        try {
            if (kf) {
                iy.EQ(-2848339193617889109L, this, node, str);
            }
            if (str.contains(".")) {
                return null;
            }
            if ("View".equals(str)) {
                return new View(this.WB);
            }
            String strTp = this.zh.tp(ef((Element) node));
            if (strTp != null && strTp.startsWith("@android:style/")) {
                try {
                    return (View) Class.forName("android.widget." + str).getConstructor(Context.class, AttributeSet.class, Integer.TYPE).newInstance(this.WB, null, Integer.valueOf(((Integer) p.class.getField("Android_" + strTp.substring(15).replace(".", "_")).get(null)).intValue()));
                } catch (Throwable unused) {
                }
            }
            if (strTp != null && strTp.startsWith("?android:attr/")) {
                try {
                    return (View) Class.forName("android.widget." + str).getConstructor(Context.class, AttributeSet.class, Integer.TYPE).newInstance(this.WB, null, Integer.valueOf(((Integer) R.attr.class.getField(strTp.substring(14)).get(null)).intValue()));
                } catch (Throwable unused2) {
                }
            }
            try {
                return (View) Class.forName("android.widget." + str).getConstructor(Context.class).newInstance(this.WB);
            } catch (Throwable unused3) {
                return null;
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -2848339193617889109L, this, node, str);
            }
            throw th;
        }
    }

    @ey(method = -1204896639864973419L)
    private Integer nw(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(558621795955113317L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            if (strCb == null) {
                return null;
            }
            if (strCb.startsWith("@+id/")) {
                String strSubstring = strCb.substring(5);
                if (this.qp.containsKey(strSubstring)) {
                    return this.qp.get(strSubstring);
                }
            }
            if (!strCb.startsWith("@id/")) {
                return null;
            }
            String strSubstring2 = strCb.substring(4);
            if (this.qp.containsKey(strSubstring2)) {
                return this.qp.get(strSubstring2);
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 558621795955113317L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -2239219906033097855L)
    private Integer ro(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(-707427268262966531L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            if (strCb == null) {
                return null;
            }
            int iIntValue = 0;
            for (String str : strCb.split("\\|")) {
                Integer numKD = KD(str, bVar);
                if (numKD != null) {
                    iIntValue |= numKD.intValue();
                }
            }
            return Integer.valueOf(iIntValue);
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -707427268262966531L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -2713749262272935211L)
    private String sG(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(4168573446901898637L, this, node, bVar);
            }
            return cb(node, bVar);
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 4168573446901898637L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -7337775203232255687L)
    private com.aide.uidesigner.a sh(Node node, h.b bVar) {
        String strFH;
        try {
            if (kf) {
                iy.EQ(6227446785558914837L, this, node, bVar);
            }
            Node namedItem = node.getAttributes().getNamedItem(bVar.Hw);
            if (namedItem instanceof Attr) {
                return new com.aide.uidesigner.a(bVar, (Attr) namedItem);
            }
            String strEf = ef((Element) node);
            return (strEf == null || (strFH = this.zh.FH(strEf, bVar)) == null) ? new com.aide.uidesigner.a(bVar) : new com.aide.uidesigner.a(bVar, strFH);
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 6227446785558914837L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = -184321579041474925L)
    private void sy(NodeList nodeList, ViewGroup viewGroup, f fVar, int i) {
        int i2;
        com.aide.uidesigner.c cVar;
        View view;
        try {
            if (kf) {
                iy.J0(-92645014005321581L, this, nodeList, viewGroup, fVar, new Integer(i));
            }
            int i3 = 0;
            while (i3 < nodeList.getLength()) {
                Node nodeItem = nodeList.item(i3);
                if (nodeItem.getNodeType() == 1) {
                    String nodeName = nodeItem.getNodeName();
                    View viewLp = lp(nodeItem, nodeName);
                    if (viewLp != null) {
                        J8(viewLp, this.q7);
                        cVar = new com.aide.uidesigner.c(viewLp);
                        Qq(cVar, nodeItem, h.gn);
                        view = viewLp;
                    } else {
                        TextView textView = new TextView(this.WB);
                        textView.setText(nodeName);
                        int i4 = (int) (this.WB.getResources().getDisplayMetrics().density * 5.0f);
                        textView.setPadding(i4, i4, i4, i4);
                        if (this.q7) {
                            int i5 = (int) (this.WB.getResources().getDisplayMetrics().density * 20.0f);
                            textView.setMinimumHeight(i5);
                            textView.setMinimumWidth(i5);
                        }
                        cVar = new com.aide.uidesigner.c(new View(this.WB));
                        view = textView;
                    }
                    com.aide.uidesigner.c cVar2 = cVar;
                    View view2 = view;
                    com.aide.uidesigner.c cVarAj = aj(nodeItem, viewGroup);
                    boolean z = this.q7 && !(view2 instanceof TableRow) && (this.n5 == null || this.Q6.contains(nodeItem));
                    i2 = i3;
                    f fVar2 = new f(this.WB, z ? view2 : null, (Element) nodeItem, cVar2, cVarAj, fVar, i, this);
                    this.k2.add(fVar2);
                    View view3 = z ? fVar2 : view2;
                    String strG3 = g3(nodeItem);
                    if (strG3 != null) {
                        view3.setId(this.qp.get(strG3).intValue());
                    }
                    if (viewGroup != null) {
                        viewGroup.addView(view3, (ViewGroup.LayoutParams) cVarAj.j6);
                    }
                    sy(nodeItem.getChildNodes(), view2 instanceof ViewGroup ? (ViewGroup) view2 : null, fVar2, i + 1);
                } else {
                    i2 = i3;
                }
                i3 = i2 + 1;
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.a8(th, -92645014005321581L, this, nodeList, viewGroup, fVar, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -474981390786198360L)
    private Float vJ(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(6545676225613982104L, this, node, bVar);
            }
            if (dx(node, bVar) != null) {
                return Float.valueOf(r0.intValue() / this.WB.getResources().getDisplayMetrics().scaledDensity);
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 6545676225613982104L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 3292702607872674292L)
    private void wc() {
        ViewGroup viewGroup;
        try {
            if (kf) {
                iy.gn(1597500778637411328L, this);
            }
            this.jw.removeAllViews();
            if (this.Z1 || this.q7) {
                LinearLayout linearLayout = new LinearLayout(this.WB);
                linearLayout.setGravity(17);
                a aVar = new a(this.WB, linearLayout);
                aVar.setEnabled(this.q7);
                this.jw.addView(aVar, -1, -1);
                viewGroup = linearLayout;
            } else {
                viewGroup = this.jw;
            }
            Throwable e = this.hK;
            this.k2.clear();
            if (e == null) {
                try {
                    sy(this.w9.getChildNodes(), viewGroup, null, 0);
                    this.jw.invalidate();
                } catch (Exception e2) {
                    e = e2;
                }
            }
            if (e != null) {
                TextView textView = new TextView(this.WB);
                if (!e.getMessage().contains("no element")) {
                    textView.setText("Can not view the layout. " + e.getMessage());
                } else if (this.q7) {
                    textView.setText("No views have been added. Tap to add views.");
                } else {
                    textView.setText("No views have been added.");
                }
                int i = (int) (this.WB.getResources().getDisplayMetrics().density * 10.0f);
                textView.setPadding(i, i, i, i);
                textView.setTextSize(20.0f);
                viewGroup.removeAllViews();
                viewGroup.addView(textView);
            }
            XX();
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 1597500778637411328L, this);
            }
            throw th;
        }
    }

    @ey(method = -2047191329866893804L)
    private void x9() {
        try {
            if (kf) {
                iy.gn(2990794066491496496L, this);
            }
            try {
                this.hK = null;
                this.fY.clear();
                this.qp.clear();
                this.zh.aM();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.AL.getBytes());
                this.w9 = PositionalXMLReader.j6(byteArrayInputStream);
                byteArrayInputStream.close();
                J0(this.w9.getChildNodes());
            } catch (Throwable th) {
                this.hK = th;
                try {
                    this.w9 = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                } catch (ParserConfigurationException unused) {
                }
            }
            this.n5 = null;
            wc();
        } catch (Throwable th2) {
            if (Jl) {
                iy.aM(th2, 2990794066491496496L, this);
            }
            throw th2;
        }
    }

    @ey(method = 2004452076313917867L)
    private Integer yS(Node node, h.b bVar) {
        try {
            if (kf) {
                iy.EQ(1867825353421785587L, this, node, bVar);
            }
            String strCb = cb(node, bVar);
            if (strCb != null) {
                try {
                    if (strCb.charAt(0) == '#') {
                        long j = Long.parseLong(strCb.substring(1), 16);
                        if (strCb.length() == 7) {
                            j |= -16777216;
                        }
                        return Integer.valueOf((int) j);
                    }
                    if (strCb.startsWith("@android:color/")) {
                        return Integer.valueOf(this.WB.getResources().getColor(((Integer) R.color.class.getDeclaredField(strCb.substring(15)).get(null)).intValue()));
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 1867825353421785587L, this, node, bVar);
            }
            throw th;
        }
    }

    @ey(method = 123535399064671489L)
    public void EQ(Element element, com.aide.uidesigner.b bVar, Element element2, h.b bVar2, String str) {
        try {
            if (kf) {
                iy.J8(85704402556510605L, this, element, bVar, element2, bVar2, str);
            }
            FireBaseLogEvent.tp("UI Designer: Add view inside");
            Element elementQX = QX(bVar);
            element.appendChild(elementQX);
            elementQX.setAttribute(bVar2.Hw, "@id/" + str);
            element2.setAttribute("android:id", "@+id/" + str);
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.lg(th, 85704402556510605L, this, element, bVar, element2, bVar2, str);
            }
            throw th;
        }
    }

    @ey(method = -36464837982380416L)
    public void Eq(Element element, h.b bVar, String str) {
        try {
            if (kf) {
                iy.we(359852374142441440L, this, element, bVar, str);
            }
            HashMap map = new HashMap();
            map.put("attrName", bVar.Hw);
            map.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str);
            FireBaseLogEvent.EQ("UI Designer: Set attribute", map);
            if (str == null) {
                element.removeAttribute(bVar.Hw);
            } else {
                element.setAttribute(bVar.Hw, str);
            }
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.U2(th, 359852374142441440L, this, element, bVar, str);
            }
            throw th;
        }
    }

    @ey(method = -246145784623170300L)
    public void Ev() {
        try {
            if (kf) {
                iy.gn(1584304968481758160L, this);
            }
            if (Build.VERSION.SDK_INT < 24) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/xml");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(this.mb)));
                intent.putExtra("android.intent.extra.SUBJECT", "XML Layout");
                intent.putExtra("android.intent.extra.TEXT", "Attached...");
                j6(this.WB, intent);
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 1584304968481758160L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.common.UndoManager.UndoManagerListener
    @ey(method = 2066521075331317640L)
    public void FH() {
        try {
            if (kf) {
                iy.gn(-7806208215390026680L, this);
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -7806208215390026680L, this);
            }
            throw th;
        }
    }

    @ey(method = -3632952019965979425L)
    public void FN(boolean z) {
        try {
            if (kf) {
                iy.Ws(-2019710361797105481L, this, z);
            }
            this.Z1 = z;
            wc();
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, -2019710361797105481L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.common.UndoManager.UndoManagerListener
    @ey(method = 2388745010851131057L)
    public void Hw(String str, String str2, int i) {
        try {
            if (kf) {
                iy.we(-2402858916435907891L, this, str, str2, new Integer(i));
            }
            if (str.equals(I())) {
                this.AL = str2;
                x9();
                XG(false);
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.U2(th, -2402858916435907891L, this, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -64884244912654573L)
    public String I() {
        try {
            if (kf) {
                iy.gn(2911004500703773331L, this);
            }
            return this.mb;
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 2911004500703773331L, this);
            }
            throw th;
        }
    }

    @ey(method = 1019073097197664320L)
    public String Mz() {
        try {
            if (kf) {
                iy.gn(373300343918648700L, this);
            }
            return this.AL;
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 373300343918648700L, this);
            }
            throw th;
        }
    }

    @ey(method = 993005265956971251L)
    public void OW() {
        try {
            if (kf) {
                iy.gn(-2173165238428885845L, this);
            }
            this.AL = d.u7(this.mb);
            this.cT.j6(I(), this.AL, 0);
            x9();
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -2173165238428885845L, this);
            }
            throw th;
        }
    }

    @ey(method = 152056252746496448L)
    public List<String> U2() {
        try {
            if (kf) {
                iy.gn(-3095171414550849348L, this);
            }
            return new ArrayList(this.fY.keySet());
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -3095171414550849348L, this);
            }
            throw th;
        }
    }

    @ey(method = -61696926020832221L)
    public void VH(com.aide.uidesigner.b bVar) {
        try {
            if (kf) {
                iy.tp(-478422139639848033L, this, bVar);
            }
            FireBaseLogEvent.tp("UI Designer: Add view");
            this.w9.appendChild(QX(bVar));
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, -478422139639848033L, this, bVar);
            }
            throw th;
        }
    }

    @ey(method = 279779654375118715L)
    public String WB() {
        try {
            if (kf) {
                iy.gn(-323398783865823145L, this);
            }
            return this.zh.j3();
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -323398783865823145L, this);
            }
            throw th;
        }
    }

    @ey(method = 986202583476784360L)
    public void Ws() {
        try {
            if (kf) {
                iy.gn(-2179683173393117400L, this);
            }
            ((ClipboardManager) this.WB.getSystemService("clipboard")).setText(Mz());
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -2179683173393117400L, this);
            }
            throw th;
        }
    }

    @ey(method = 1005040187455634745L)
    protected abstract void XG(boolean z);

    @ey(method = -2031869269552468192L)
    public void XL(Element element) {
        try {
            if (kf) {
                iy.tp(198423730027264652L, this, element);
            }
            FireBaseLogEvent.tp("UI Designer: Delete view");
            element.getParentNode().removeChild(element);
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 198423730027264652L, this, element);
            }
            throw th;
        }
    }

    @ey(method = -255122043606374625L)
    protected abstract void XX();

    @ey(method = -4921420597633540525L)
    public void Zo(String str, Intent intent) {
        try {
            if (kf) {
                iy.EQ(7320189892474631955L, this, str, intent);
            }
            this.zh.j6(str, intent);
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 7320189892474631955L, this, str, intent);
            }
            throw th;
        }
    }

    @ey(method = 1332558148398637160L)
    public List<String> a8() {
        try {
            if (kf) {
                iy.gn(-919594369715729176L, this);
            }
            return this.zh.gn();
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -919594369715729176L, this);
            }
            throw th;
        }
    }

    @ey(method = -137580839853763328L)
    public void aq(Element element, h.b bVar, Element element2, String str) {
        try {
            if (kf) {
                iy.J0(203220119953091164L, this, element, bVar, element2, str);
            }
            element.setAttribute(bVar.Hw, "@id/" + str);
            if (element2 != null) {
                element2.setAttribute("android:id", "@+id/" + str);
            }
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.a8(th, 203220119953091164L, this, element, bVar, element2, str);
            }
            throw th;
        }
    }

    @ey(method = 6633748927545274528L)
    protected abstract void br();

    @ey(method = -2106553616214529044L)
    public boolean ca() {
        try {
            if (kf) {
                iy.gn(2910808320522541760L, this);
            }
            return this.w9.getChildNodes().getLength() > 0;
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 2910808320522541760L, this);
            }
            throw th;
        }
    }

    @ey(method = -717277504188114115L)
    public String ef(Element element) {
        try {
            if (kf) {
                iy.tp(1095777448690094949L, this, element);
            }
            Node namedItem = element.getAttributes().getNamedItem("style");
            if (namedItem instanceof Attr) {
                return ((Attr) namedItem).getValue();
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 1095777448690094949L, this, element);
            }
            throw th;
        }
    }

    @ey(method = -404080233454934435L)
    public String g3(Node node) {
        String value;
        try {
            if (kf) {
                iy.tp(-939955254136767423L, this, node);
            }
            Node namedItem = node.getAttributes().getNamedItem("android:id");
            if ((namedItem instanceof Attr) && (value = ((Attr) namedItem).getValue()) != null && value.startsWith("@+id/")) {
                return value.substring(5);
            }
            return null;
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, -939955254136767423L, this, node);
            }
            throw th;
        }
    }

    @ey(method = -817937890472759001L)
    public void gn(Element element, com.aide.uidesigner.b bVar) {
        try {
            if (kf) {
                iy.EQ(-1250100235045275625L, this, element, bVar);
            }
            FireBaseLogEvent.tp("UI Designer: Add view before");
            element.getParentNode().insertBefore(QX(bVar), element);
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -1250100235045275625L, this, element, bVar);
            }
            throw th;
        }
    }

    @ey(method = 1769038045823416519L)
    public void hz(boolean z) {
        try {
            if (kf) {
                iy.Ws(-1971767352761387761L, this, z);
            }
            this.q7 = z;
            this.n5 = null;
            wc();
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, -1971767352761387761L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -368211101885736200L)
    public void jJ() {
        try {
            if (kf) {
                iy.gn(1462666728076288560L, this);
            }
            this.AL = ((ClipboardManager) this.WB.getSystemService("clipboard")).getText().toString();
            this.cT.FH(I(), this.AL, 0);
            x9();
            XG(true);
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 1462666728076288560L, this);
            }
            throw th;
        }
    }

    @ey(method = -897746672935836445L)
    public void jO(Element element, String str) {
        try {
            if (kf) {
                iy.EQ(364601189555615295L, this, element, str);
            }
            FireBaseLogEvent.EQ("UI Designer: Set style", Collections.singletonMap("style", str));
            if (str == null) {
                element.removeAttribute("style");
            } else {
                element.setAttribute("style", str);
            }
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 364601189555615295L, this, element, str);
            }
            throw th;
        }
    }

    @ey(method = -214634772442848555L)
    public void jw(Element element, com.aide.uidesigner.b bVar) {
        try {
            if (kf) {
                iy.EQ(185637348861576165L, this, element, bVar);
            }
            FireBaseLogEvent.tp("UI Designer: Surrount with view");
            Element elementQX = QX(bVar);
            Node parentNode = element.getParentNode();
            Node nextSibling = element.getNextSibling();
            parentNode.removeChild(element);
            if (nextSibling != null) {
                parentNode.insertBefore(elementQX, nextSibling);
            } else {
                parentNode.appendChild(elementQX);
            }
            elementQX.appendChild(element);
            et(element);
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 185637348861576165L, this, element, bVar);
            }
            throw th;
        }
    }

    @ey(method = -3169507996274691885L)
    protected abstract void kQ(f fVar);

    @ey(method = 3440206023713950701L)
    public void ko(String str) {
        try {
            if (kf) {
                iy.tp(1561668179089310081L, this, str);
            }
            this.mb = str;
            this.cT.j6(str, this.AL, 0);
            x9();
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 1561668179089310081L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 5082756926607225635L)
    public List<String> lg() {
        try {
            if (kf) {
                iy.gn(-5005188807374474565L, this);
            }
            return this.zh.u7();
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -5005188807374474565L, this);
            }
            throw th;
        }
    }

    @ey(method = -868004691454167680L)
    public String mb(Element element) {
        try {
            if (kf) {
                iy.tp(752492883288729428L, this, element);
            }
            String strReplace = this.mb != null ? new File(this.mb).getName().replace("_", "") : "";
            if (strReplace.lastIndexOf(46) != -1) {
                strReplace = strReplace.substring(0, strReplace.lastIndexOf(46));
            }
            String nodeName = element.getNodeName();
            int i = 1;
            if (nodeName.lastIndexOf(46) != -1) {
                nodeName = nodeName.substring(nodeName.lastIndexOf(46) + 1);
            }
            String str = strReplace + nodeName;
            while (true) {
                if (!this.fY.containsKey(str + i)) {
                    return str + i;
                }
                i++;
            }
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 752492883288729428L, this, element);
            }
            throw th;
        }
    }

    @ey(method = 1854967783374789984L)
    public void oY(Element element, String str) {
        try {
            if (kf) {
                iy.EQ(658089865075971504L, this, element, str);
            }
            FireBaseLogEvent.EQ("UI Designer: Set view ID", Collections.singletonMap("id", str));
            if (str == null) {
                element.removeAttribute("android:id");
            } else {
                String strG3 = g3(element);
                element.setAttribute("android:id", "@+id/" + str);
                if (strG3 != null) {
                    CU(this.w9, "@id/" + strG3, "@id/" + str);
                }
            }
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 658089865075971504L, this, element, str);
            }
            throw th;
        }
    }

    @ey(method = -748624755696592685L)
    public List<com.aide.uidesigner.a> rN(com.aide.uidesigner.c cVar, com.aide.uidesigner.c cVar2, Element element) {
        try {
            if (kf) {
                iy.we(49227680475771339L, this, cVar, cVar2, element);
            }
            ArrayList<com.aide.uidesigner.a> arrayList = new ArrayList();
            for (h.b bVar : h.u7) {
                if (bVar.u7) {
                    if (cVar2.j6(bVar)) {
                        arrayList.add(sh(element, bVar));
                    }
                } else if (cVar.j6(bVar)) {
                    arrayList.add(sh(element, bVar));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (com.aide.uidesigner.a aVar : arrayList) {
                if (aVar.FH() && !aVar.Hw()) {
                    arrayList2.add(aVar);
                }
            }
            for (com.aide.uidesigner.a aVar2 : arrayList) {
                if (aVar2.Hw()) {
                    arrayList2.add(aVar2);
                }
            }
            for (com.aide.uidesigner.a aVar3 : arrayList) {
                if (!aVar3.FH()) {
                    arrayList2.add(aVar3);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            if (Jl) {
                iy.U2(th, 49227680475771339L, this, cVar, cVar2, element);
            }
            throw th;
        }
    }

    @ey(method = -5309365559491099960L)
    public void tp(Element element, com.aide.uidesigner.b bVar) {
        try {
            if (kf) {
                iy.EQ(-5771815326603690368L, this, element, bVar);
            }
            FireBaseLogEvent.tp("UI Designer: Add view inside");
            element.appendChild(QX(bVar));
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -5771815326603690368L, this, element, bVar);
            }
            throw th;
        }
    }

    @ey(method = 4925697850610418240L)
    public void u7(Element element, com.aide.uidesigner.b bVar) {
        try {
            if (kf) {
                iy.EQ(4530947507337423064L, this, element, bVar);
            }
            FireBaseLogEvent.tp("UI Designer: Add view behind");
            Element elementQX = QX(bVar);
            if (element.getNextSibling() != null) {
                element.getParentNode().insertBefore(elementQX, element.getNextSibling());
            } else {
                element.getParentNode().appendChild(elementQX);
            }
            Xa();
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, 4530947507337423064L, this, element, bVar);
            }
            throw th;
        }
    }

    @ey(method = 4543146291526903465L)
    public List<f> vy() {
        try {
            if (kf) {
                iy.gn(-4376711594671877595L, this);
            }
            return new ArrayList(this.k2);
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, -4376711594671877595L, this);
            }
            throw th;
        }
    }

    @ey(method = 1975276484514746532L)
    public boolean we() {
        try {
            if (kf) {
                iy.gn(3061999565082314400L, this);
            }
            ClipboardManager clipboardManager = (ClipboardManager) this.WB.getSystemService("clipboard");
            if (clipboardManager.hasText()) {
                return clipboardManager.getText().charAt(0) == '<';
            }
            return false;
        } catch (Throwable th) {
            if (Jl) {
                iy.aM(th, 3061999565082314400L, this);
            }
            throw th;
        }
    }

    @ey(method = -1940822032209505636L)
    public void yO(f fVar) {
        try {
            if (kf) {
                iy.tp(345722756436195840L, this, fVar);
            }
            if (this.n5 == null) {
                kQ(fVar);
                return;
            }
            this.n5.j6(fVar);
            this.n5 = null;
            wc();
        } catch (Throwable th) {
            if (Jl) {
                iy.j3(th, 345722756436195840L, this, fVar);
            }
            throw th;
        }
    }

    @ey(method = -2490810989127410188L)
    public void ye(Element element, ValueRunnable<f> valueRunnable) {
        try {
            if (kf) {
                iy.EQ(-4181333740868135040L, this, element, valueRunnable);
            }
            this.n5 = valueRunnable;
            this.Q6 = new ArrayList<>();
            NodeList childNodes = element.getParentNode().getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem instanceof Element) {
                    if (nodeItem.equals(element)) {
                        break;
                    } else {
                        this.Q6.add((Element) nodeItem);
                    }
                }
            }
            wc();
        } catch (Throwable th) {
            if (Jl) {
                iy.Mr(th, -4181333740868135040L, this, element, valueRunnable);
            }
            throw th;
        }
    }
}
