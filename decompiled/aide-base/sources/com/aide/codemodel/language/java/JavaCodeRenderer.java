package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.MethodParameterType;
import com.aide.codemodel.api.MethodParameterTypeVariable;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.ParameterType;
import com.aide.codemodel.api.ParameterizedType;
import com.aide.codemodel.api.PointerType;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.abstraction.CodeRenderer;
import com.probelytics.api.UserTouchAction;

@cy(clazz = 5794266186191966504L, container = 5794266186191966504L, user = true)
/* loaded from: classes.dex */
public class JavaCodeRenderer implements CodeRenderer {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 80675434947880624L)
    private final IdentifierSpace DW;

    @dy(field = -218261954121321480L)
    private final JavaLanguage FH;

    @dy(field = 2919481181021561379L)
    private final Model j6;

    static {
        iy.Zo(JavaCodeRenderer.class);
    }

    @ey(method = -43070082990582384L)
    public JavaCodeRenderer(Model model, JavaLanguage javaLanguage) {
        try {
            if (Hw) {
                iy.EQ(4042201272550206980L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.DW = model.identifierSpace;
            EntitySpace entitySpace = model.entitySpace;
            this.FH = javaLanguage;
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 4042201272550206980L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = 1419625494886803840L)
    private String VH(String str) {
        try {
            if (Hw) {
                iy.tp(2296967007469208952L, this, str);
            }
            while (true) {
                int iIndexOf = str.indexOf(60);
                if (iIndexOf == -1) {
                    break;
                }
                str = str.substring(0, iIndexOf) + "&lt;" + str.substring(iIndexOf + 1, str.length());
            }
            while (true) {
                int iIndexOf2 = str.indexOf(62);
                if (iIndexOf2 == -1) {
                    return str;
                }
                str = str.substring(0, iIndexOf2) + "&gt;" + str.substring(iIndexOf2 + 1, str.length());
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 2296967007469208952L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = -4308283995571905736L)
    public String getFullyQualifiedNameString(Entity entity) {
        try {
            if (Hw) {
                iy.tp(-664955517277735200L, this, entity);
            }
            if (entity.isType()) {
                switch (((Type) entity).getSemantic()) {
                    case 1:
                        return "void";
                    case 2:
                        return "null";
                    case 3:
                        return "byte";
                    case 4:
                        return "ubyte";
                    case 5:
                        return "short";
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        return "int";
                    case 9:
                        return "long";
                    case 11:
                        return "boolean";
                    case 12:
                        return "char";
                    case 13:
                        return "float";
                    case 14:
                        return "double";
                }
            }
            String str = "";
            if (entity.isArrayType()) {
                Type elementType = (Type) entity;
                while (elementType.isArrayType()) {
                    String str2 = str + "[";
                    for (int i = 1; i < ((ArrayType) elementType).jO(); i++) {
                        str2 = str2 + ",";
                    }
                    str = str2 + "]";
                    elementType = ((ArrayType) elementType).getElementType();
                }
                return elementType.getFullyQualifiedNameString() + str;
            }
            if (entity.isClassType()) {
                if (!((ClassType) entity).isToplevel()) {
                    return ((ClassType) entity).getEnclosingClassType().getFullyQualifiedNameString() + "." + ((ClassType) entity).gG();
                }
                Namespace namespace = ((ClassType) entity).getNamespace();
                if (namespace.kQ()) {
                    return ((ClassType) entity).gG();
                }
                return namespace.getFullyQualifiedNameString() + "." + ((ClassType) entity).gG();
            }
            if (entity.isMember() && ((Member) entity).Gj()) {
                return entity.getEnclosingClassType().getFullyQualifiedNameString() + "." + this.DW.getString(entity.getIdentifier());
            }
            if (entity.isMember() && ((Member) entity).e9()) {
                String fullyQualifiedNameString = entity.getEnclosingClassType().u9().getFullyQualifiedNameString();
                String str3 = ((Member) entity).pN() ? fullyQualifiedNameString + ".this" : fullyQualifiedNameString + "." + this.DW.getString(entity.getIdentifier());
                if (((Member) entity).Eq() > 0) {
                    String str4 = str3 + "<";
                    for (int i2 = 0; i2 < ((Member) entity).Eq(); i2++) {
                        str4 = str4 + ((Member) entity).Xa(i2).getNameString();
                        if (i2 < ((Member) entity).Eq() - 1) {
                            str4 = str4 + ", ";
                        }
                    }
                    str3 = str4 + ">";
                }
                String str5 = ((Member) entity).pN() ? str3 + "[" : str3 + "(";
                for (int i3 = 0; i3 < ((Member) entity).oY(); i3++) {
                    if (i3 > 0) {
                        str5 = str5 + ", ";
                    }
                    String str6 = str5 + getModifiersString(((Member) entity).FN(i3));
                    try {
                        Type typeQp = ((Member) entity).qp(i3);
                        if (i3 == ((Member) entity).oY() - 1 && ((Member) entity).Z1()) {
                            if (typeQp.isArrayType()) {
                                typeQp = ((ArrayType) typeQp).getElementType();
                            }
                            str5 = str6 + typeQp.getFullyQualifiedNameString() + " ... ";
                        } else {
                            str5 = str6 + typeQp.getFullyQualifiedNameString();
                        }
                    } catch (e4 unused) {
                        str5 = str6 + "?";
                    }
                }
                if (((Member) entity).pN()) {
                    return str5 + "]";
                }
                return str5 + ")";
            }
            if (entity.isMethodParameterType()) {
                return this.DW.getString(((MethodParameterType) entity).getIdentifier());
            }
            if (entity.isParameterType()) {
                return this.DW.getString(((ParameterType) entity).getIdentifier());
            }
            if (entity.isMethodParameterTypeVariable()) {
                return ((MethodParameterTypeVariable) entity).FN().getNameString() + "?";
            }
            if (!entity.isParameterizedType()) {
                if (entity.isPointerType()) {
                    return ((PointerType) entity).FN().getFullyQualifiedNameString() + "*";
                }
                if (!entity.isNamespace() || ((Namespace) entity).kQ()) {
                    return "";
                }
                if (((Namespace) entity).aj().kQ()) {
                    return this.DW.getString(entity.getIdentifier());
                }
                return ((Namespace) entity).aj().getFullyQualifiedNameString() + "." + this.DW.getString(entity.getIdentifier());
            }
            ClassType classType = ((ParameterizedType) entity).getClassType();
            int absoluteParametertypeCount = classType.getAbsoluteParametertypeCount() - 1;
            String str7 = "";
            boolean z = true;
            while (true) {
                int iPa = classType.Pa();
                if (z && iPa > 0) {
                    int i4 = iPa - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        String str8 = ((ParameterizedType) entity).getAbsoluteArgumentVariances()[absoluteParametertypeCount] == 1 ? "?" : (((ParameterizedType) entity).getAbsoluteArgumentVariances()[absoluteParametertypeCount] == 3 ? "? super " : ((ParameterizedType) entity).getAbsoluteArgumentVariances()[absoluteParametertypeCount] == 2 ? "? extends " : "") + ((ParameterizedType) entity).getAbsoluteArgumentTypes()[absoluteParametertypeCount].getFullyQualifiedNameString();
                        str7 = i5 < i4 ? str8 + ", " + str7 : str8 + ">" + str7;
                        absoluteParametertypeCount--;
                    }
                    str7 = "<" + str7;
                }
                String str9 = classType.gG() + str7;
                if (!classType.PT()) {
                    z = false;
                }
                ClassType enclosingClassType = classType.getEnclosingClassType();
                if (enclosingClassType == classType) {
                    if (classType.getNamespace().kQ()) {
                        return str9;
                    }
                    return classType.getNamespace().getFullyQualifiedNameString() + "." + str9;
                }
                str7 = "." + str9;
                classType = enclosingClassType;
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -664955517277735200L, this, entity);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x08ae A[Catch: e4 -> 0x08d4, all -> 0x0ab5, TRY_LEAVE, TryCatch #4 {all -> 0x0ab5, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0020, B:203:0x0aa3, B:10:0x0064, B:13:0x0090, B:15:0x00e7, B:16:0x00f8, B:19:0x0134, B:21:0x015f, B:24:0x0171, B:29:0x019d, B:30:0x01ac, B:31:0x01af, B:32:0x01be, B:81:0x03fb, B:83:0x0404, B:85:0x0411, B:87:0x0442, B:89:0x045d, B:97:0x04a8, B:90:0x046d, B:92:0x0473, B:93:0x0483, B:95:0x0489, B:96:0x0499, B:18:0x0123, B:33:0x01d9, B:35:0x01e2, B:43:0x0250, B:45:0x027b, B:48:0x028d, B:53:0x02b9, B:54:0x02c8, B:55:0x02cb, B:56:0x02dc, B:58:0x02e5, B:61:0x02f7, B:63:0x030f, B:66:0x0325, B:67:0x0334, B:69:0x035d, B:71:0x0375, B:74:0x03ae, B:77:0x03c4, B:78:0x03d3, B:36:0x01fb, B:38:0x0206, B:39:0x021d, B:41:0x0228, B:42:0x023d, B:98:0x04cb, B:101:0x04ec, B:103:0x04f6, B:104:0x0546, B:107:0x0580, B:109:0x059c, B:111:0x05b6, B:112:0x05c7, B:114:0x05d0, B:115:0x05e1, B:116:0x05f2, B:118:0x060e, B:126:0x065f, B:128:0x068a, B:119:0x061e, B:121:0x0624, B:122:0x0636, B:124:0x063c, B:125:0x064e, B:106:0x0571, B:129:0x06b8, B:131:0x06c9, B:133:0x06d3, B:135:0x072c, B:138:0x0766, B:140:0x076f, B:142:0x079c, B:144:0x07a5, B:146:0x07b9, B:148:0x07e7, B:150:0x07fb, B:151:0x0804, B:153:0x0822, B:155:0x083d, B:156:0x085d, B:159:0x086a, B:161:0x0873, B:163:0x087c, B:165:0x0882, B:166:0x0888, B:171:0x08e3, B:173:0x0903, B:174:0x0912, B:167:0x08ae, B:170:0x08d4, B:175:0x0918, B:177:0x0932, B:180:0x0948, B:181:0x0957, B:184:0x098d, B:183:0x097c, B:185:0x0990, B:187:0x09ac, B:195:0x09ff, B:197:0x0a2a, B:188:0x09be, B:190:0x09c4, B:191:0x09d6, B:193:0x09dc, B:194:0x09ee, B:141:0x0789, B:137:0x0757, B:198:0x0a5a, B:200:0x0a61, B:202:0x0a67), top: B:222:0x0009, inners: #0, #2, #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0903 A[Catch: all -> 0x0ab5, TryCatch #4 {all -> 0x0ab5, blocks: (B:3:0x0009, B:5:0x000d, B:6:0x0010, B:9:0x0020, B:203:0x0aa3, B:10:0x0064, B:13:0x0090, B:15:0x00e7, B:16:0x00f8, B:19:0x0134, B:21:0x015f, B:24:0x0171, B:29:0x019d, B:30:0x01ac, B:31:0x01af, B:32:0x01be, B:81:0x03fb, B:83:0x0404, B:85:0x0411, B:87:0x0442, B:89:0x045d, B:97:0x04a8, B:90:0x046d, B:92:0x0473, B:93:0x0483, B:95:0x0489, B:96:0x0499, B:18:0x0123, B:33:0x01d9, B:35:0x01e2, B:43:0x0250, B:45:0x027b, B:48:0x028d, B:53:0x02b9, B:54:0x02c8, B:55:0x02cb, B:56:0x02dc, B:58:0x02e5, B:61:0x02f7, B:63:0x030f, B:66:0x0325, B:67:0x0334, B:69:0x035d, B:71:0x0375, B:74:0x03ae, B:77:0x03c4, B:78:0x03d3, B:36:0x01fb, B:38:0x0206, B:39:0x021d, B:41:0x0228, B:42:0x023d, B:98:0x04cb, B:101:0x04ec, B:103:0x04f6, B:104:0x0546, B:107:0x0580, B:109:0x059c, B:111:0x05b6, B:112:0x05c7, B:114:0x05d0, B:115:0x05e1, B:116:0x05f2, B:118:0x060e, B:126:0x065f, B:128:0x068a, B:119:0x061e, B:121:0x0624, B:122:0x0636, B:124:0x063c, B:125:0x064e, B:106:0x0571, B:129:0x06b8, B:131:0x06c9, B:133:0x06d3, B:135:0x072c, B:138:0x0766, B:140:0x076f, B:142:0x079c, B:144:0x07a5, B:146:0x07b9, B:148:0x07e7, B:150:0x07fb, B:151:0x0804, B:153:0x0822, B:155:0x083d, B:156:0x085d, B:159:0x086a, B:161:0x0873, B:163:0x087c, B:165:0x0882, B:166:0x0888, B:171:0x08e3, B:173:0x0903, B:174:0x0912, B:167:0x08ae, B:170:0x08d4, B:175:0x0918, B:177:0x0932, B:180:0x0948, B:181:0x0957, B:184:0x098d, B:183:0x097c, B:185:0x0990, B:187:0x09ac, B:195:0x09ff, B:197:0x0a2a, B:188:0x09be, B:190:0x09c4, B:191:0x09d6, B:193:0x09dc, B:194:0x09ee, B:141:0x0789, B:137:0x0757, B:198:0x0a5a, B:200:0x0a61, B:202:0x0a67), top: B:222:0x0009, inners: #0, #2, #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0912 A[SYNTHETIC] */
    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @abcd.ey(method = 2872989404169835644L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getHTMLString(com.aide.codemodel.api.Entity r32) {
        /*
            Method dump skipped, instructions count: 2758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JavaCodeRenderer.getHTMLString(com.aide.codemodel.api.Entity):java.lang.String");
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = 3263601277886450764L)
    public String getHTMLString(Variable variable) {
        try {
            if (Hw) {
                iy.tp(3916908513551450228L, this, variable);
            }
            return (((variable.getLanguage().getName() + "<br>") + "<code>") + "<font color=\"#0000EE\">" + VH(getNameString(variable.getType())) + "</font>") + " " + this.j6.identifierSpace.getString(variable.getIdentifier()) + "</code>";
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 3916908513551450228L, this, variable);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = -2676807680878717680L)
    public String getModifiersString(int i) {
        try {
            if (Hw) {
                iy.u7(2650358622181070176L, this, i);
            }
            String str = "";
            if ((i & 1) != 0) {
                str = "public ";
            }
            if ((i & 4) != 0) {
                str = str + "private ";
            }
            if ((i & 8) != 0) {
                str = str + "protected ";
            }
            if ((i & 64) != 0) {
                str = str + "static ";
            }
            if ((i & 512) != 0) {
                str = str + "final ";
            }
            if ((i & 256) != 0) {
                str = str + "final ";
            }
            if ((i & 128) != 0) {
                str = str + "final ";
            }
            if ((i & 1024) != 0) {
                str = str + "volatile ";
            }
            if ((i & 4096) != 0) {
                str = str + "transient ";
            }
            if ((524288 & i) != 0) {
                str = str + "native ";
            }
            if ((i & 16384) != 0) {
                str = str + "abstract ";
            }
            if ((i & 8192) == 0) {
                return str;
            }
            return str + "strictfp ";
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 2650358622181070176L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = 1411966622836545524L)
    public String getNameString(Entity entity) {
        try {
            if (Hw) {
                iy.tp(2488060369267612348L, this, entity);
            }
            if (entity.isType()) {
                switch (((Type) entity).getSemantic()) {
                    case 1:
                        return "void";
                    case 2:
                        return "null";
                    case 3:
                        return "byte";
                    case 4:
                        return "ubyte";
                    case 5:
                        return "short";
                    case UserTouchAction.CLICK_KIND /* 7 */:
                        return "int";
                    case 9:
                        return "long";
                    case 11:
                        return "boolean";
                    case 12:
                        return "char";
                    case 13:
                        return "float";
                    case 14:
                        return "double";
                }
            }
            String str = "";
            if (entity.isArrayType()) {
                Type elementType = (Type) entity;
                while (elementType.isArrayType()) {
                    String str2 = str + "[";
                    for (int i = 1; i < ((ArrayType) elementType).jO(); i++) {
                        str2 = str2 + ",";
                    }
                    str = str2 + "]";
                    elementType = ((ArrayType) elementType).getElementType();
                }
                return elementType.getNameString() + str;
            }
            if (entity.isClassType()) {
                ClassType classType = (ClassType) entity;
                while (true) {
                    String str3 = classType.gG() + str;
                    ClassType enclosingClassType = classType.getEnclosingClassType();
                    if (enclosingClassType == classType) {
                        return str3;
                    }
                    str = "." + str3;
                    classType = enclosingClassType;
                }
            } else {
                if (entity.isMember()) {
                    return this.DW.getString(entity.getIdentifier());
                }
                if (entity.isMethodParameterType()) {
                    return this.DW.getString(entity.getIdentifier());
                }
                if (entity.isParameterType()) {
                    return this.DW.getString(entity.getIdentifier());
                }
                if (entity.isMethodParameterTypeVariable()) {
                    return ((MethodParameterTypeVariable) entity).FN().getNameString() + "?";
                }
                if (!entity.isParameterizedType()) {
                    if (!entity.isPointerType()) {
                        return entity.isNamespace() ? this.DW.getString(((Namespace) entity).getIdentifier()) : "";
                    }
                    return ((PointerType) entity).FN().getNameString() + "*";
                }
                ClassType classType2 = ((ParameterizedType) entity).getClassType();
                int absoluteParametertypeCount = classType2.getAbsoluteParametertypeCount() - 1;
                String str4 = "";
                boolean z = true;
                while (true) {
                    int iPa = classType2.Pa();
                    if (z && iPa > 0) {
                        int i2 = iPa - 1;
                        for (int i3 = i2; i3 >= 0; i3--) {
                            String str5 = ((ParameterizedType) entity).getAbsoluteArgumentVariances()[absoluteParametertypeCount] == 2 ? "? extends " : "";
                            if (((ParameterizedType) entity).getAbsoluteArgumentVariances()[absoluteParametertypeCount] == 3) {
                                str5 = "? super ";
                            }
                            String str6 = str5 + ((ParameterizedType) entity).getAbsoluteArgumentTypes()[absoluteParametertypeCount].getNameString();
                            if (((ParameterizedType) entity).getAbsoluteArgumentVariances()[absoluteParametertypeCount] == 1) {
                                str6 = "?";
                            }
                            str4 = i3 < i2 ? str6 + ", " + str4 : str6 + ">" + str4;
                            absoluteParametertypeCount--;
                        }
                        str4 = "<" + str4;
                    }
                    String str7 = classType2.gG() + str4;
                    if (!classType2.PT()) {
                        z = false;
                    }
                    ClassType enclosingClassType2 = classType2.getEnclosingClassType();
                    if (enclosingClassType2 == classType2) {
                        return str7;
                    }
                    str4 = "." + str7;
                    classType2 = enclosingClassType2;
                }
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 2488060369267612348L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = 641781420202272432L)
    public String v5(Type type) {
        try {
            if (Hw) {
                iy.tp(-329477518593518736L, this, type);
            }
            if (type == null) {
                return "null";
            }
            switch (type.getSemantic()) {
                case 1:
                    return "";
                case 2:
                default:
                    return "null";
                case 3:
                case 4:
                case 5:
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case UserTouchAction.CLICK_KIND /* 7 */:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                    return "0";
                case 11:
                    return "false";
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -329477518593518736L, this, type);
            }
            throw th;
        }
    }
}
