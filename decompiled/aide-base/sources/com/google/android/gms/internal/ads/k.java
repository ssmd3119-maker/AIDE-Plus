package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class k {
    private final Collection<e<?>> j6 = new ArrayList();
    private final Collection<e<String>> DW = new ArrayList();
    private final Collection<e<String>> FH = new ArrayList();

    public final void DW(e eVar) {
        this.j6.add(eVar);
    }

    public final void FH(e<String> eVar) {
        this.DW.add(eVar);
    }

    public final void Hw(e<String> eVar) {
        this.FH.add(eVar);
    }

    public final List<String> Zo() {
        List<String> listV5 = v5();
        Iterator<e<String>> it = this.FH.iterator();
        while (it.hasNext()) {
            String str = (String) cw0.v5().FH(it.next());
            if (str != null) {
                listV5.add(str);
            }
        }
        return listV5;
    }

    public final void j6(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (e<?> eVar : this.j6) {
            if (eVar.DW() == 1) {
                eVar.u7(editor, eVar.EQ(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            xp.j6("Flag Json is null.");
        }
    }

    public final List<String> v5() {
        ArrayList arrayList = new ArrayList();
        Iterator<e<String>> it = this.DW.iterator();
        while (it.hasNext()) {
            String str = (String) cw0.v5().FH(it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
