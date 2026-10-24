package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class f extends g {
    public f(List<a<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
    }
}
