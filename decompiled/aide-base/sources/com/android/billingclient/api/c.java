package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class c {
    private String DW;
    private int j6;

    public static class b {
        private String DW;
        private int j6;

        public b DW(String str) {
            this.DW = str;
            return this;
        }

        public b FH(int i) {
            this.j6 = i;
            return this;
        }

        public c j6() {
            c cVar = new c();
            cVar.j6 = this.j6;
            cVar.DW = this.DW;
            return cVar;
        }

        private b() {
        }
    }

    public static b Hw() {
        return new b();
    }

    public int FH() {
        return this.j6;
    }
}
