package com.google.android.gms.ads.formats;

import com.google.android.gms.internal.ads.jg;

@jg
/* loaded from: classes.dex */
public final class b {
    private final int DW;
    private final boolean FH;
    private final int Hw;
    private final boolean Zo;
    private final boolean j6;
    private final com.google.android.gms.ads.h v5;

    public static final class a {
        private com.google.android.gms.ads.h Hw;
        private boolean j6 = false;
        private int DW = -1;
        private boolean FH = false;
        private int v5 = 1;
        private boolean Zo = false;

        public final a DW(int i) {
            this.v5 = i;
            return this;
        }

        public final a FH(int i) {
            this.DW = i;
            return this;
        }

        public final a Hw(boolean z) {
            this.FH = z;
            return this;
        }

        public final a Zo(com.google.android.gms.ads.h hVar) {
            this.Hw = hVar;
            return this;
        }

        public final b j6() {
            return new b(this);
        }

        public final a v5(boolean z) {
            this.j6 = z;
            return this;
        }
    }

    private b(a aVar) {
        this.j6 = aVar.j6;
        this.DW = aVar.DW;
        this.FH = aVar.FH;
        this.Hw = aVar.v5;
        this.v5 = aVar.Hw;
        this.Zo = aVar.Zo;
    }

    public final int DW() {
        return this.DW;
    }

    public final com.google.android.gms.ads.h FH() {
        return this.v5;
    }

    public final boolean Hw() {
        return this.FH;
    }

    public final boolean Zo() {
        return this.Zo;
    }

    public final int j6() {
        return this.Hw;
    }

    public final boolean v5() {
        return this.j6;
    }
}
