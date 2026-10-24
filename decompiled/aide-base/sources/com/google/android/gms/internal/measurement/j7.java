package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class j7 {
    public static final j7 BYTES;
    public static final j7 ENUM;
    public static final j7 GROUP;
    public static final j7 MESSAGE;
    public static final j7 SFIXED32;
    public static final j7 SFIXED64;
    public static final j7 SINT32;
    public static final j7 SINT64;
    public static final j7 STRING;
    public static final j7 UINT32;
    private static final /* synthetic */ j7[] sE;
    private final o7 WB;
    private final int mb;
    public static final j7 DOUBLE = new j7("DOUBLE", 0, o7.DOUBLE, 1);
    public static final j7 FLOAT = new j7("FLOAT", 1, o7.FLOAT, 5);
    public static final j7 INT64 = new j7("INT64", 2, o7.LONG, 0);
    public static final j7 UINT64 = new j7("UINT64", 3, o7.LONG, 0);
    public static final j7 INT32 = new j7("INT32", 4, o7.INT, 0);
    public static final j7 FIXED64 = new j7("FIXED64", 5, o7.LONG, 1);
    public static final j7 FIXED32 = new j7("FIXED32", 6, o7.INT, 5);
    public static final j7 BOOL = new j7("BOOL", 7, o7.BOOLEAN, 0);

    static {
        final int i = 2;
        final int i2 = 3;
        final o7 o7Var = o7.STRING;
        final String str = "STRING";
        final int i3 = 8;
        STRING = new j7(str, i3, o7Var, i) { // from class: com.google.android.gms.internal.measurement.k7
            {
                int i4 = 8;
                int i5 = 2;
            }
        };
        final o7 o7Var2 = o7.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        GROUP = new j7(str2, i4, o7Var2, i2) { // from class: com.google.android.gms.internal.measurement.l7
            {
                int i5 = 9;
                int i6 = 3;
            }
        };
        final o7 o7Var3 = o7.MESSAGE;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        MESSAGE = new j7(str3, i5, o7Var3, i) { // from class: com.google.android.gms.internal.measurement.m7
            {
                int i6 = 10;
                int i7 = 2;
            }
        };
        final o7 o7Var4 = o7.BYTE_STRING;
        final String str4 = "BYTES";
        final int i6 = 11;
        BYTES = new j7(str4, i6, o7Var4, i) { // from class: com.google.android.gms.internal.measurement.n7
            {
                int i7 = 11;
                int i8 = 2;
            }
        };
        UINT32 = new j7("UINT32", 12, o7.INT, 0);
        ENUM = new j7("ENUM", 13, o7.ENUM, 0);
        SFIXED32 = new j7("SFIXED32", 14, o7.INT, 5);
        SFIXED64 = new j7("SFIXED64", 15, o7.LONG, 1);
        SINT32 = new j7("SINT32", 16, o7.INT, 0);
        j7 j7Var = new j7("SINT64", 17, o7.LONG, 0);
        SINT64 = j7Var;
        sE = new j7[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, j7Var};
    }

    private j7(String str, int i, o7 o7Var, int i2) {
        this.WB = o7Var;
        this.mb = i2;
    }

    public static j7[] values() {
        return (j7[]) sE.clone();
    }

    public final int DW() {
        return this.mb;
    }

    public final o7 j6() {
        return this.WB;
    }
}
