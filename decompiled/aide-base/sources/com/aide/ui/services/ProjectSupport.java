package com.aide.ui.services;

import abcd.cy;
import abcd.ey;
import com.aide.common.ValueRunnable;
import com.aide.engine.EngineSolution;
import com.aide.ui.services.TemplateService;
import com.aide.ui.trainer.c;
import java.util.List;
import java.util.Map;

@cy(clazz = 2434055081768049888L, container = 2434055081768049888L, user = true)
/* loaded from: classes.dex */
public interface ProjectSupport {
    @ey(method = -122215433691547755L)
    boolean FH(String str);

    @ey(method = -607278079318575855L)
    boolean Hw();

    @ey(method = 537170876924671725L)
    void J0(String str);

    @ey(method = 75171673346736033L)
    boolean J8();

    @ey(method = 711885281672459004L)
    void Mr();

    @ey(method = -3855762422365949095L)
    void P8(String str, String str2);

    @ey(method = 3107090299128184191L)
    void SI(String str, ValueRunnable<String> valueRunnable);

    @ey(method = -4076569627670185737L)
    void U2(String str, Map<String, List<String>> map, List<String> list);

    @ey(method = -89572583638501383L)
    TemplateService.TemplateGroup[] VH();

    @ey(method = -1995042003118525284L)
    List<c.C0094c> XL();

    @ey(method = -5146397842135118484L)
    boolean Zo(String str);

    @ey(method = -2016805262344545079L)
    boolean a8(String str);

    @ey(method = -5288941749649175219L)
    boolean aM(String str);

    @ey(method = -6884589938212162624L)
    void buildProject(boolean z);

    @ey(method = 156084179149314520L)
    void cn(List<String> list, boolean z);

    @ey(method = -4392995480420013960L)
    void ei(String str);

    @ey(method = -1452791504573236575L)
    boolean gW();

    @ey(method = -4675317699286014200L)
    int getOpenProjectNameStringId(String str);

    @ey(method = -896860556919523815L)
    List<String> getProductFlavors(String str);

    @ey(method = -2316235526157900400L)
    String getProjectAttributeHtmlString();

    @ey(method = 748519726498279008L)
    void gn();

    @ey(method = 612633494574161360L)
    boolean isPremium();

    @ey(method = -257149227687621504L)
    boolean isSupport(String str);

    @ey(method = 948523510423153896L)
    boolean j3(String str);

    @ey(method = -56333185066878475L)
    void j6();

    @ey(method = -176687902870254685L)
    boolean lg();

    @ey(method = -206697525464295080L)
    EngineSolution makeEngineSolution();

    @ey(method = 4067766284001031213L)
    void nw(String str);

    @ey(method = -1423258971871995192L)
    int rN(String str);

    @ey(method = -873900368250073785L)
    List<String> ro(String str);

    @ey(method = -525116873926616180L)
    String sh(String str);

    @ey(method = 1425979781745957992L)
    String tp(String str);

    @ey(method = -4720451001452702768L)
    boolean u7(String str);

    @ey(method = -2990496415786962984L)
    String v5(String str);

    @ey(method = 2414968100437227856L)
    boolean vy(String str);

    @ey(method = -6070849023492581405L)
    int we(String str);

    @ey(method = 91879440398078808L)
    String yS();
}
