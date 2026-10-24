package com.google.android.gms.common.internal;

import abcd.kv;
import abcd.lv;
import abcd.mv;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface j extends IInterface {

    public static abstract class a extends lv implements j {

        /* renamed from: com.google.android.gms.common.internal.j$a$a, reason: collision with other inner class name */
        public static class C0112a extends kv implements j {
            C0112a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.j
            public final Account n5() {
                Parcel parcelDx = dx(2, sh());
                Account account = (Account) mv.DW(parcelDx, Account.CREATOR);
                parcelDx.recycle();
                return account;
            }
        }

        public static j dx(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new C0112a(iBinder);
        }
    }

    Account n5();
}
