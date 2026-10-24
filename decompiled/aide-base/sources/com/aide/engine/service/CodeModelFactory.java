package com.aide.engine.service;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.language.aidl.AidlCodeModel;
import com.aide.codemodel.language.classfile.JavaBinaryCodeModel;
import com.aide.codemodel.language.cpp.CppCodeModel;
import com.aide.codemodel.language.css.CssCodeModel;
import com.aide.codemodel.language.dtd.DtdCodeModel;
import com.aide.codemodel.language.html.HtmlCodeModel;
import com.aide.codemodel.language.java.JavaCodeModel;
import com.aide.codemodel.language.js.JavaScriptCodeModel;
import com.aide.codemodel.language.xml.XmlCodeModel;
import com.aide.ui.util.FilePatternMatcher;
import com.aide.ui.util.FileSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

@cy(clazz = 1844187954666138120L, container = 1844187954666138120L, user = true)
/* loaded from: classes.dex */
public class CodeModelFactory {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(CodeModelFactory.class);
    }

    @ey(method = -2448616155338106051L)
    public CodeModelFactory() {
        try {
            if (j6) {
                iy.gn(-284115417327961121L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -284115417327961121L, null);
            }
            throw th;
        }
    }

    @ey(method = 1055474963669524125L)
    public static CodeModel[] create(Model model, List<String> list) {
        try {
            if (j6) {
                iy.EQ(-1403512494841941600L, null, model, list);
            }
            CodeModel[] codeModelArr = {new JavaCodeModel(model), new JavaBinaryCodeModel(model), new XmlCodeModel(model), new HtmlCodeModel(model), new CssCodeModel(model), new JavaScriptCodeModel(model), new DtdCodeModel(model), new CppCodeModel(model), new AidlCodeModel(model)};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 9; i++) {
                CodeModel codeModel = codeModelArr[i];
                if (list.contains(codeModel.getName())) {
                    arrayList.add(codeModel);
                }
            }
            return (CodeModel[]) arrayList.toArray(new CodeModel[arrayList.size()]);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1403512494841941600L, null, model, list);
            }
            throw th;
        }
    }

    @ey(method = 523242568961937792L)
    private static CodeModel[] create(List<String> list) {
        try {
            if (j6) {
                iy.tp(-500574173433893135L, null, list);
            }
            return create(null, list);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -500574173433893135L, null, list);
            }
            throw th;
        }
    }

    @ey(method = 1905734271009007381L)
    public static CodeModel findCodeModel(String str, List<String> list) {
        try {
            if (j6) {
                iy.EQ(232027168949456220L, null, str, list);
            }
            String name = FileSystem.getName(str);
            for (CodeModel codeModel : create(list)) {
                for (String str2 : Arrays.asList(codeModel.getDefaultFilePatterns())) {
                    if (FilePatternMatcher.j6() != null && FilePatternMatcher.j6().DW(name, str2)) {
                        return codeModel;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 232027168949456220L, null, str, list);
            }
            throw th;
        }
    }

    @ey(method = 1789012387478586021L)
    public static TreeMap<String, List<String>> j6(List<String> list) {
        try {
            if (j6) {
                iy.tp(856103478681690880L, null, list);
            }
            TreeMap<String, List<String>> treeMap = new TreeMap<>();
            for (CodeModel codeModel : create(list)) {
                treeMap.put(codeModel.getName(), Arrays.asList(codeModel.getDefaultFilePatterns()));
            }
            return treeMap;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 856103478681690880L, null, list);
            }
            throw th;
        }
    }
}
