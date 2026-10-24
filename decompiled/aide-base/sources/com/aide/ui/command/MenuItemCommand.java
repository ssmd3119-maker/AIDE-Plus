package com.aide.ui.command;

import abcd.cy;
import abcd.ey;
import abcd.sf;

@cy(clazz = 5048038284637807368L, container = 5048038284637807368L, user = true)
/* loaded from: classes.dex */
public interface MenuItemCommand extends sf {
    @ey(method = 4995156064883186496L)
    int getMenuItemId();

    @ey(method = 1062192022500419544L)
    boolean isEnabled();

    @ey(method = -816983463251071040L)
    boolean run();
}
