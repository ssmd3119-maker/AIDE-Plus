package com.aide.licensing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.j8;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

@cy(clazz = 5040490317030669360L, container = 5040490317030669360L, user = true)
/* loaded from: classes.dex */
public class e {

    @dy(field = 2956333421720757728L)
    private static final SecureRandom DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1804855225910640183L)
    private static boolean j6;

    @cy(clazz = 3745435933143277831L, container = 5040490317030669360L, user = true)
    static class a implements Comparator<Account> {

        @fy
        private static /* synthetic */ boolean WB;

        @gy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -977117315708308476L)
        a() {
        }

        @Override // java.util.Comparator
        @ey(method = 1219894917722413947L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(Account account, Account account2) {
            try {
                if (WB) {
                    iy.EQ(7010002508793731072L, this, account, account2);
                }
                return e.DW(account.name).compareTo(e.DW(account2.name));
            } catch (Throwable th) {
                if (mb) {
                    iy.Mr(th, 7010002508793731072L, this, account, account2);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(e.class);
            if (FH) {
                iy.gn(-3457085867215190144L, null);
            }
            j6 = false;
            DW = new SecureRandom();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3457085867215190144L, null);
            }
            throw th;
        }
    }

    @ey(method = -1706174680921314584L)
    public e() {
        try {
            if (FH) {
                iy.gn(2072890154687443120L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2072890154687443120L, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -281371228977056293L)
    public static String DW(String str) {
        try {
            if (FH) {
                iy.tp(6482084520535680403L, null, str);
            }
            return str == null ? "" : str.trim().toLowerCase(Locale.US);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 6482084520535680403L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2455277064084340275L)
    public static long FH(Context context) {
        try {
            if (FH) {
                iy.tp(2241911797433139205L, null, context);
            }
            return Hw(context) | (DW.nextLong() << 32);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2241911797433139205L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -1618721687203479432L)
    public static long Hw(Context context) {
        try {
            if (FH) {
                iy.tp(788683071768376512L, null, context);
            }
            byte[] bArrV5 = v5(context);
            long j = (bArrV5[0] & 255) | ((bArrV5[1] & 255) << 8) | ((bArrV5[2] & 255) << 16) | ((255 & bArrV5[3]) << 24);
            j8.j6("Device ID long: " + Long.toHexString(j));
            return 268435455 & j;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 788683071768376512L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 627317200230993920L)
    private static String VH(Context context) {
        String simSerialNumber;
        String deviceId;
        String string = "(default)";
        try {
            if (FH) {
                iy.tp(-940928107995117036L, null, context);
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                try {
                    deviceId = telephonyManager.getDeviceId();
                } catch (Exception unused) {
                    deviceId = "(default)";
                }
                try {
                    simSerialNumber = telephonyManager.getSimSerialNumber();
                } catch (Exception unused2) {
                    simSerialNumber = "(default)";
                }
            } catch (Exception unused3) {
                simSerialNumber = "(default)";
                deviceId = simSerialNumber;
            }
            try {
                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Exception unused4) {
            }
            StringBuilder sb = new StringBuilder();
            sb.append("android id: ");
            sb.append(string);
            sb.append(";");
            sb.append("tel device id: ");
            sb.append(deviceId);
            sb.append(";");
            sb.append("tel sim serial no: ");
            sb.append(simSerialNumber);
            sb.append(";");
            sb.append("accounts: ");
            try {
                Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.google");
                Arrays.sort(accountsByType, new a());
                for (Account account : accountsByType) {
                    try {
                        sb.append(DW(account.name));
                        sb.append(",");
                    } catch (Exception unused5) {
                    }
                }
            } catch (Exception unused6) {
            }
            String string2 = sb.toString();
            j8.j6("Device ID string: " + string2);
            return string2;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -940928107995117036L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 3454045335017905469L)
    private static String Zo(Context context) {
        try {
            if (FH) {
                iy.tp(-5892646746367961779L, null, context);
            }
            return j6 ? VH(context) : gn(context);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5892646746367961779L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -7546387813303295L)
    private static String gn(Context context) {
        try {
            if (FH) {
                iy.tp(6568867120161252949L, null, context);
            }
            String string = "(default)";
            try {
                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Exception unused) {
            }
            String str = "android id: " + string + ";";
            j8.j6("Device ID string: " + str);
            return str;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 6568867120161252949L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 3036491583789169593L)
    public static boolean u7(Context context, long j) {
        try {
            if (FH) {
                iy.EQ(888274387979980029L, null, context, new Long(j));
            }
            return (4294967295L & j) == Hw(context);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 888274387979980029L, null, context, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 2408192990342247365L)
    private static byte[] v5(Context context) {
        try {
            if (FH) {
                iy.tp(-1393602165026291935L, null, context);
            }
            try {
                return MessageDigest.getInstance("SHA-256").digest(Zo(context).getBytes("UTF-8"));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1393602165026291935L, null, context);
            }
            throw th;
        }
    }
}
