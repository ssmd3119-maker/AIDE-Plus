package com.google.android.gms.common.internal;

import abcd.vv;
import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class d {
    private final Set<Scope> DW;
    private final Set<Scope> FH;
    private final Map<com.google.android.gms.common.api.a<?>, b> Hw;
    private final String VH;
    private final String Zo;
    private final vv gn;
    private final Account j6;
    private Integer u7;
    private final View v5;

    public static final class a {
        private ArraySet<Scope> DW;
        private Map<com.google.android.gms.common.api.a<?>, b> FH;
        private String VH;
        private String Zo;
        private Account j6;
        private View v5;
        private int Hw = 0;
        private vv gn = vv.w9;

        public final d DW() {
            return new d(this.j6, this.DW, this.FH, this.Hw, this.v5, this.Zo, this.VH, this.gn);
        }

        public final a FH(Account account) {
            this.j6 = account;
            return this;
        }

        public final a Hw(String str) {
            this.VH = str;
            return this;
        }

        public final a j6(Collection<Scope> collection) {
            if (this.DW == null) {
                this.DW = new ArraySet<>();
            }
            this.DW.addAll(collection);
            return this;
        }

        public final a v5(String str) {
            this.Zo = str;
            return this;
        }
    }

    public static final class b {
        public final Set<Scope> j6;
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i, View view, String str, String str2, vv vvVar) {
        this.j6 = account;
        this.DW = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.Hw = map == null ? Collections.EMPTY_MAP : map;
        this.v5 = view;
        this.Zo = str;
        this.VH = str2;
        this.gn = vvVar;
        HashSet hashSet = new HashSet(this.DW);
        Iterator<b> it = this.Hw.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().j6);
        }
        this.FH = Collections.unmodifiableSet(hashSet);
    }

    public final Account DW() {
        Account account = this.j6;
        return account != null ? account : new Account(c.DEFAULT_ACCOUNT, "com.google");
    }

    public final Set<Scope> FH() {
        return this.FH;
    }

    @Nullable
    public final Integer Hw() {
        return this.u7;
    }

    public final Set<Scope> VH() {
        return this.DW;
    }

    @Nullable
    public final String Zo() {
        return this.Zo;
    }

    @Nullable
    public final vv gn() {
        return this.gn;
    }

    @Nullable
    public final Account j6() {
        return this.j6;
    }

    public final void u7(Integer num) {
        this.u7 = num;
    }

    @Nullable
    public final String v5() {
        return this.VH;
    }
}
