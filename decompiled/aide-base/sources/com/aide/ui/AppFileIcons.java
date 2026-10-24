package com.aide.ui;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 739089724870199160L, container = 739089724870199160L, user = true)
/* loaded from: classes.dex */
public class AppFileIcons {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(AppFileIcons.class);
    }

    @ey(method = -937595498154264144L)
    public AppFileIcons() {
        try {
            if (j6) {
                iy.gn(-3402724870379377312L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3402724870379377312L, null);
            }
            throw th;
        }
    }

    @ey(method = -4817628046592543796L)
    public static int j6(String str) {
        try {
            if (j6) {
                iy.tp(-3831686743028331456L, null, str);
            }
            String lowerCase = str.contains(".") ? str.substring(str.lastIndexOf(46) + 1).toLowerCase() : "";
            if ("java".equals(lowerCase)) {
                return R$drawable.file_type_java;
            }
            if ("xml".equals(lowerCase)) {
                return 2131165258;
            }
            return "cpp".equals(lowerCase) ? R$drawable.file_type_cpp : "c".equals(lowerCase) ? R$drawable.file_type_c : "css".equals(lowerCase) ? R$drawable.file_type_css : ("h".equals(lowerCase) || "hpp".equals(lowerCase)) ? R$drawable.file_type_h : "html".equals(lowerCase) ? R$drawable.file_type_html : "js".equals(lowerCase) ? R$drawable.file_type_js : "txt".equals(lowerCase) ? R$drawable.file_type_txt : "gradle".equals(lowerCase) ? R$drawable.project_properties : R$drawable.file_type_unknown;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3831686743028331456L, null, str);
            }
            throw th;
        }
    }
}
