package com.probelytics.api;

import abcd.by;
import android.net.Uri;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class MarketReferrer {
    private final Market market;
    private final String url;

    public MarketReferrer(Market market, String str) {
        this.market = market;
        this.url = str;
    }

    private Uri getUri() {
        return Uri.parse("http://link?" + this.url);
    }

    public String getCampaign() {
        String queryParameter;
        try {
            queryParameter = getUri().getQueryParameter("utm_campaign");
        } catch (Throwable unused) {
        }
        if ("(not set)".equals(queryParameter)) {
            return null;
        }
        return queryParameter;
    }

    public Market getMarket() {
        return this.market;
    }

    public String getMedium() {
        String queryParameter;
        try {
            queryParameter = getUri().getQueryParameter("utm_medium");
        } catch (Throwable unused) {
        }
        if ("(not set)".equals(queryParameter)) {
            return null;
        }
        return queryParameter;
    }

    public String getSource() {
        String queryParameter;
        try {
            queryParameter = getUri().getQueryParameter("utm_source");
        } catch (Throwable unused) {
        }
        if ("(not set)".equals(queryParameter)) {
            return null;
        }
        return queryParameter;
    }

    public String getTerm() {
        try {
            return getUri().getQueryParameter("utm_term");
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPcampaignid() {
        try {
            return getUri().getQueryParameter("pcampaignid") != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
