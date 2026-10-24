package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum y3 {
    DOUBLE(0, a4.SCALAR, m4.DOUBLE),
    FLOAT(1, a4.SCALAR, m4.FLOAT),
    INT64(2, a4.SCALAR, m4.LONG),
    UINT64(3, a4.SCALAR, m4.LONG),
    INT32(4, a4.SCALAR, m4.INT),
    FIXED64(5, a4.SCALAR, m4.LONG),
    FIXED32(6, a4.SCALAR, m4.INT),
    BOOL(7, a4.SCALAR, m4.BOOLEAN),
    STRING(8, a4.SCALAR, m4.STRING),
    MESSAGE(9, a4.SCALAR, m4.MESSAGE),
    BYTES(10, a4.SCALAR, m4.BYTE_STRING),
    UINT32(11, a4.SCALAR, m4.INT),
    ENUM(12, a4.SCALAR, m4.ENUM),
    SFIXED32(13, a4.SCALAR, m4.INT),
    SFIXED64(14, a4.SCALAR, m4.LONG),
    SINT32(15, a4.SCALAR, m4.INT),
    SINT64(16, a4.SCALAR, m4.LONG),
    GROUP(17, a4.SCALAR, m4.MESSAGE),
    DOUBLE_LIST(18, a4.VECTOR, m4.DOUBLE),
    FLOAT_LIST(19, a4.VECTOR, m4.FLOAT),
    INT64_LIST(20, a4.VECTOR, m4.LONG),
    UINT64_LIST(21, a4.VECTOR, m4.LONG),
    INT32_LIST(22, a4.VECTOR, m4.INT),
    FIXED64_LIST(23, a4.VECTOR, m4.LONG),
    FIXED32_LIST(24, a4.VECTOR, m4.INT),
    BOOL_LIST(25, a4.VECTOR, m4.BOOLEAN),
    STRING_LIST(26, a4.VECTOR, m4.STRING),
    MESSAGE_LIST(27, a4.VECTOR, m4.MESSAGE),
    BYTES_LIST(28, a4.VECTOR, m4.BYTE_STRING),
    UINT32_LIST(29, a4.VECTOR, m4.INT),
    ENUM_LIST(30, a4.VECTOR, m4.ENUM),
    SFIXED32_LIST(31, a4.VECTOR, m4.INT),
    SFIXED64_LIST(32, a4.VECTOR, m4.LONG),
    SINT32_LIST(33, a4.VECTOR, m4.INT),
    SINT64_LIST(34, a4.VECTOR, m4.LONG),
    DOUBLE_LIST_PACKED(35, a4.PACKED_VECTOR, m4.DOUBLE),
    FLOAT_LIST_PACKED(36, a4.PACKED_VECTOR, m4.FLOAT),
    INT64_LIST_PACKED(37, a4.PACKED_VECTOR, m4.LONG),
    UINT64_LIST_PACKED(38, a4.PACKED_VECTOR, m4.LONG),
    INT32_LIST_PACKED(39, a4.PACKED_VECTOR, m4.INT),
    FIXED64_LIST_PACKED(40, a4.PACKED_VECTOR, m4.LONG),
    FIXED32_LIST_PACKED(41, a4.PACKED_VECTOR, m4.INT),
    BOOL_LIST_PACKED(42, a4.PACKED_VECTOR, m4.BOOLEAN),
    UINT32_LIST_PACKED(43, a4.PACKED_VECTOR, m4.INT),
    ENUM_LIST_PACKED(44, a4.PACKED_VECTOR, m4.ENUM),
    SFIXED32_LIST_PACKED(45, a4.PACKED_VECTOR, m4.INT),
    SFIXED64_LIST_PACKED(46, a4.PACKED_VECTOR, m4.LONG),
    SINT32_LIST_PACKED(47, a4.PACKED_VECTOR, m4.INT),
    SINT64_LIST_PACKED(48, a4.PACKED_VECTOR, m4.LONG),
    GROUP_LIST(49, a4.VECTOR, m4.MESSAGE),
    MAP(50, a4.MAP, m4.VOID);

    private static final y3[] TI;
    private final int WB;

    static {
        y3[] y3VarArrValues = values();
        TI = new y3[y3VarArrValues.length];
        for (y3 y3Var : y3VarArrValues) {
            TI[y3Var.WB] = y3Var;
        }
    }

    y3(int i, a4 a4Var, m4 m4Var) {
        int i2;
        this.WB = i;
        int i3 = z3.j6[a4Var.ordinal()];
        if (i3 == 1 || i3 == 2) {
            m4Var.j6();
        }
        if (a4Var == a4.SCALAR && (i2 = z3.DW[m4Var.ordinal()]) != 1 && i2 == 2) {
        }
    }

    public final int j6() {
        return this.WB;
    }
}
