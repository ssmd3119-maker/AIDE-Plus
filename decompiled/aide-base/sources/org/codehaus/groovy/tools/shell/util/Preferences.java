package org.codehaus.groovy.tools.shell.util;

import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import org.codehaus.groovy.tools.shell.IO;

/* loaded from: classes.dex */
public class Preferences {
    public static IO.Verbosity DW;
    private static final java.util.prefs.Preferences j6;

    static {
        java.util.prefs.Preferences preferencesNode = java.util.prefs.Preferences.userRoot().node("/org/codehaus/groovy/tools/shell");
        j6 = preferencesNode;
        try {
            DW = IO.Verbosity.j6(preferencesNode.get("verbosity", IO.Verbosity.FH.j6));
        } catch (IllegalArgumentException unused) {
            DW = IO.Verbosity.FH;
            j6.remove("verbosity");
        }
        j6(new PreferenceChangeListener() { // from class: org.codehaus.groovy.tools.shell.util.Preferences.1
            @Override // java.util.prefs.PreferenceChangeListener
            public void preferenceChange(PreferenceChangeEvent preferenceChangeEvent) {
                if (preferenceChangeEvent.getKey().equals("verbosity")) {
                    String newValue = preferenceChangeEvent.getNewValue();
                    if (newValue == null) {
                        newValue = IO.Verbosity.FH.j6;
                    }
                    try {
                        Preferences.DW = IO.Verbosity.j6(newValue);
                    } catch (Exception unused2) {
                        preferenceChangeEvent.getNode().put(preferenceChangeEvent.getKey(), Preferences.DW.j6);
                    }
                }
            }
        });
    }

    public static void j6(PreferenceChangeListener preferenceChangeListener) {
        j6.addPreferenceChangeListener(preferenceChangeListener);
    }
}
