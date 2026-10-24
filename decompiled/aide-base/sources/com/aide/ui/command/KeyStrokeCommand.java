package com.aide.ui.command;

import abcd.cy;
import abcd.ey;
import abcd.sf;
import com.aide.common.KeyStroke;

@cy(clazz = 817288692260098876L, container = 817288692260098876L, user = true)
/* loaded from: classes.dex */
public interface KeyStrokeCommand extends sf {
    @ey(method = 7319231280094259041L)
    KeyStroke getKeyStroke();

    @ey(method = -1564681429535879984L)
    String getName();

    @ey(method = 4000193870446975788L)
    boolean isEnabled();

    @ey(method = -2798752473949161312L)
    boolean run();
}
