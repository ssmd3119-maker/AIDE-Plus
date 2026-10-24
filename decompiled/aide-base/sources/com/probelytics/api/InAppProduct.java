package com.probelytics.api;

import abcd.by;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class InAppProduct {
    private final String currencyCode;
    private final boolean isSubscription;
    private final Market market;
    private final long priceInMicros;
    private final String productId;

    public InAppProduct(Market market, String str, boolean z, long j, String str2) {
        this.productId = str;
        this.priceInMicros = j;
        this.currencyCode = str2;
        this.market = market;
        this.isSubscription = z;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Market getMarket() {
        return this.market;
    }

    public double getPrice() {
        double d = this.priceInMicros;
        Double.isNaN(d);
        return d / 1000.0d;
    }

    public long getPriceInMicros() {
        return this.priceInMicros;
    }

    public String getProductId() {
        return this.productId;
    }

    public boolean isSubscription() {
        return this.isSubscription;
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
