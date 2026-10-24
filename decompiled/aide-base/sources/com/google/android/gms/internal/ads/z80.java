package com.google.android.gms.internal.ads;

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
public class z80 {
    public static final z80 BYTES;
    public static final z80 ENUM;
    public static final z80 GROUP;
    public static final z80 MESSAGE;
    public static final z80 SFIXED32;
    public static final z80 SFIXED64;
    public static final z80 SINT32;
    public static final z80 SINT64;
    public static final z80 STRING;
    public static final z80 UINT32;
    private static final /* synthetic */ z80[] sE;
    private final e90 WB;
    private final int mb;
    public static final z80 DOUBLE = new z80("DOUBLE", 0, e90.DOUBLE, 1);
    public static final z80 FLOAT = new z80("FLOAT", 1, e90.FLOAT, 5);
    public static final z80 INT64 = new z80("INT64", 2, e90.LONG, 0);
    public static final z80 UINT64 = new z80("UINT64", 3, e90.LONG, 0);
    public static final z80 INT32 = new z80("INT32", 4, e90.INT, 0);
    public static final z80 FIXED64 = new z80("FIXED64", 5, e90.LONG, 1);
    public static final z80 FIXED32 = new z80("FIXED32", 6, e90.INT, 5);
    public static final z80 BOOL = new z80("BOOL", 7, e90.BOOLEAN, 0);

    static {
        final int i = 2;
        final int i2 = 3;
        final e90 e90Var = e90.STRING;
        final String str = "STRING";
        final int i3 = 8;
        STRING = new z80(str, i3, e90Var, i) { // from class: com.google.android.gms.internal.ads.a90
            {
                int i4 = 8;
                int i5 = 2;
            }
        };
        final e90 e90Var2 = e90.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        GROUP = new z80(str2, i4, e90Var2, i2) { // from class: com.google.android.gms.internal.ads.b90
            {
                int i5 = 9;
                int i6 = 3;
            }
        };
        final e90 e90Var3 = e90.MESSAGE;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        MESSAGE = new z80(str3, i5, e90Var3, i) { // from class: com.google.android.gms.internal.ads.c90
            {
                int i6 = 10;
                int i7 = 2;
            }
        };
        final e90 e90Var4 = e90.BYTE_STRING;
        final String str4 = "BYTES";
        final int i6 = 11;
        BYTES = new z80(str4, i6, e90Var4, i) { // from class: com.google.android.gms.internal.ads.d90
            {
                int i7 = 11;
                int i8 = 2;
            }
        };
        UINT32 = new z80("UINT32", 12, e90.INT, 0);
        ENUM = new z80("ENUM", 13, e90.ENUM, 0);
        SFIXED32 = new z80("SFIXED32", 14, e90.INT, 5);
        SFIXED64 = new z80("SFIXED64", 15, e90.LONG, 1);
        SINT32 = new z80("SINT32", 16, e90.INT, 0);
        z80 z80Var = new z80("SINT64", 17, e90.LONG, 0);
        SINT64 = z80Var;
        sE = new z80[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, z80Var};
    }

    private z80(String str, int i, e90 e90Var, int i2) {
        this.WB = e90Var;
        this.mb = i2;
    }

    public static z80[] values() {
        return (z80[]) sE.clone();
    }

    public final int DW() {
        return this.mb;
    }

    public final e90 j6() {
        return this.WB;
    }
}
