package abcd;

/* loaded from: classes.dex */
public enum s70 {
    BARE { // from class: abcd.s70.d
        @Override // abcd.s70
        public boolean j6() {
            return false;
        }
    },
    SAFE { // from class: abcd.s70.e
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    MERGING { // from class: abcd.s70.f
        @Override // abcd.s70
        public boolean j6() {
            return false;
        }
    },
    MERGING_RESOLVED { // from class: abcd.s70.g
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    CHERRY_PICKING { // from class: abcd.s70.h
        @Override // abcd.s70
        public boolean j6() {
            return false;
        }
    },
    CHERRY_PICKING_RESOLVED { // from class: abcd.s70.i
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    REBASING { // from class: abcd.s70.j
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    REBASING_REBASING { // from class: abcd.s70.k
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    APPLY { // from class: abcd.s70.l
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    REBASING_MERGE { // from class: abcd.s70.a
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    REBASING_INTERACTIVE { // from class: abcd.s70.b
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    },
    BISECTING { // from class: abcd.s70.c
        @Override // abcd.s70
        public boolean j6() {
            return true;
        }
    };

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static s70[] valuesCustom() {
        s70[] s70VarArrValuesCustom = values();
        int length = s70VarArrValuesCustom.length;
        s70[] s70VarArr = new s70[length];
        System.arraycopy(s70VarArrValuesCustom, 0, s70VarArr, 0, length);
        return s70VarArr;
    }

    public abstract boolean j6();

    /* synthetic */ s70(s70 s70Var) {
        this();
    }
}
