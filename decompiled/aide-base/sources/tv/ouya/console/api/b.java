package tv.ouya.console.api;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static final String Hw = "b";
    private Vector<String> j6 = new Vector<>();
    private SparseArray<f> DW = new SparseArray<>();
    private f FH = null;

    /* renamed from: tv.ouya.console.api.b$b, reason: collision with other inner class name */
    private class C0117b {
        public boolean DW;
        public int j6;

        private C0117b(b bVar) {
            this.j6 = -1;
            this.DW = false;
        }
    }

    class c {
        public int j6 = 0;
        public int DW = 0;

        c(b bVar) {
        }
    }

    class d {
        public int j6 = 0;
        public int DW = 0;
        public SparseBooleanArray FH = new SparseBooleanArray();

        d(b bVar) {
        }
    }

    class e {
        public int j6 = 0;
        public float DW = 0.0f;
        public float FH = 0.0f;
        public int Hw = 0;

        e(b bVar) {
        }
    }

    class f {
        public SparseArray<C0117b> j6 = new SparseArray<>();
        public SparseBooleanArray DW = new SparseBooleanArray();
        public Vector<c> FH = new Vector<>();
        public SparseArray<d> Hw = new SparseArray<>();
        public Vector<e> v5 = new Vector<>();

        f(b bVar) {
        }
    }

    b() {
    }

    private String Hw(int i) {
        return (i < 0 || i >= this.j6.size()) ? "NOT_FOUND" : this.j6.get(i);
    }

    public f DW(int i) {
        if (this.DW.get(i) != null) {
            return this.DW.get(i);
        }
        f fVar = this.FH;
        if (fVar != null) {
            int size = fVar.j6.size();
            for (int i2 = 0; i2 < size; i2++) {
                Log.i(Hw, "Using controller fallback=" + Hw(this.FH.j6.valueAt(i2).j6));
            }
        }
        return this.FH;
    }

    int FH(String str) {
        if (!this.j6.contains(str)) {
            this.j6.add(str);
        }
        return this.j6.indexOf(str);
    }

    public d j6(f fVar, int i) {
        if (fVar == null || fVar.Hw.get(i) == null) {
            return null;
        }
        return fVar.Hw.get(i);
    }

    public void v5(String str) throws JSONException {
        String str2 = "button_is_axis";
        String str3 = "axis_remap";
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("controller")) {
                JSONArray jSONArray = jSONObject.getJSONArray("controller");
                int i = 0;
                while (i < jSONArray.length()) {
                    f fVar = new f(this);
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("alias");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        C0117b c0117b = new C0117b();
                        c0117b.j6 = FH(jSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
                        FH(jSONObject3.getString("friendly_name"));
                        if (jSONObject3.has("fallback")) {
                            c0117b.DW = jSONObject3.getBoolean("fallback");
                        }
                        fVar.j6.put(c0117b.j6, c0117b);
                        this.DW.put(c0117b.j6, fVar);
                        if (c0117b.DW) {
                            this.FH = fVar;
                        }
                    }
                    if (jSONObject2.has("axis_exclude_source")) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("axis_exclude_source");
                        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                            fVar.DW.append(jSONArray3.getInt(i3), true);
                        }
                    }
                    if (jSONObject2.has(str3)) {
                        JSONArray jSONArray4 = jSONObject2.getJSONArray(str3);
                        int i4 = 0;
                        while (i4 < jSONArray4.length()) {
                            c cVar = new c(this);
                            JSONObject jSONObject4 = jSONArray4.getJSONObject(i4);
                            cVar.j6 = jSONObject4.getInt("source_axis");
                            cVar.DW = jSONObject4.getInt("destination_axis");
                            fVar.FH.add(cVar);
                            i4++;
                            jSONArray = jSONArray;
                        }
                    }
                    JSONArray jSONArray5 = jSONArray;
                    if (jSONObject2.has(str2)) {
                        JSONArray jSONArray6 = jSONObject2.getJSONArray(str2);
                        int i5 = 0;
                        while (i5 < jSONArray6.length()) {
                            e eVar = new e(this);
                            JSONObject jSONObject5 = jSONArray6.getJSONObject(i5);
                            eVar.j6 = jSONObject5.getInt("source_axis");
                            eVar.DW = (float) jSONObject5.getDouble("action_down_max");
                            eVar.FH = (float) jSONObject5.getDouble("action_down_min");
                            eVar.Hw = jSONObject5.getInt("destination_keycode");
                            fVar.v5.add(eVar);
                            i5++;
                            jSONArray6 = jSONArray6;
                            str2 = str2;
                            str3 = str3;
                        }
                    }
                    String str4 = str2;
                    String str5 = str3;
                    if (jSONObject2.has("button")) {
                        JSONArray jSONArray7 = jSONObject2.getJSONArray("button");
                        int i6 = 0;
                        while (i6 < jSONArray7.length()) {
                            d dVar = new d(this);
                            JSONObject jSONObject6 = jSONArray7.getJSONObject(i6);
                            dVar.j6 = jSONObject6.getInt("source_keycode");
                            int i7 = jSONObject6.getInt("destination_keycode");
                            if (jSONObject6.has("exclude_source")) {
                                JSONArray jSONArray8 = jSONObject6.getJSONArray("exclude_source");
                                int i8 = 0;
                                while (i8 < jSONArray8.length()) {
                                    dVar.FH.append(jSONArray8.getInt(i8), true);
                                    i8++;
                                    jSONArray7 = jSONArray7;
                                }
                            }
                            JSONArray jSONArray9 = jSONArray7;
                            dVar.DW = i7;
                            fVar.Hw.put(dVar.j6, dVar);
                            i6++;
                            jSONArray7 = jSONArray9;
                        }
                    }
                    i++;
                    jSONArray = jSONArray5;
                    str2 = str4;
                    str3 = str5;
                }
            }
        } catch (JSONException e2) {
            Log.e(Hw, "Failed to load input json: ", e2);
        }
    }
}
