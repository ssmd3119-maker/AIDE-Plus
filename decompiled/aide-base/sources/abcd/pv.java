package abcd;

/* loaded from: classes.dex */
public final class pv {
    private static final qv j6;

    static final class a extends qv {
        @Override // abcd.qv
        public final void j6(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:4:0x0006, B:6:0x000e, B:7:0x0014, B:9:0x001e, B:10:0x0024), top: B:23:0x0006 }] */
    static {
        /*
            java.lang.Integer r0 = j6()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L14
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L2a
            r2 = 19
            if (r1 < r2) goto L14
            abcd.uv r1 = new abcd.uv     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L14:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L2a
            r1 = r1 ^ 1
            if (r1 == 0) goto L24
            abcd.tv r1 = new abcd.tv     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L24:
            abcd.pv$a r1 = new abcd.pv$a     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r1 = move-exception
            goto L2e
        L2c:
            r1 = move-exception
            r0 = 0
        L2e:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<abcd.pv$a> r3 = abcd.pv.a.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 132
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            abcd.pv$a r1 = new abcd.pv$a
            r1.<init>()
        L63:
            abcd.pv.j6 = r1
            if (r0 != 0) goto L68
            goto L6b
        L68:
            r0.intValue()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.pv.<clinit>():void");
    }

    public static void DW(Throwable th, Throwable th2) {
        j6.j6(th, th2);
    }

    private static Integer j6() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
