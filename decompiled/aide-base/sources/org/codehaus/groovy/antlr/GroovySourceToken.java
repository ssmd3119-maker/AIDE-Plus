package org.codehaus.groovy.antlr;

import groovyjarjarantlr.Token;

/* loaded from: classes.dex */
public class GroovySourceToken extends Token implements SourceInfo {
    protected String fY;
    protected int jw;
    protected int k2;
    protected int qp;
    protected int zh;

    public GroovySourceToken(int i) {
        super(i);
        this.fY = "";
    }

    public void EQ(int i) {
        this.zh = i;
    }

    @Override // groovyjarjarantlr.Token
    public int FH() {
        return this.jw;
    }

    @Override // groovyjarjarantlr.Token
    public void VH(int i) {
        this.qp = i;
    }

    @Override // org.codehaus.groovy.antlr.SourceInfo
    public int XL() {
        return this.k2;
    }

    @Override // groovyjarjarantlr.Token
    public int Zo() {
        return this.qp;
    }

    @Override // groovyjarjarantlr.Token
    public void gn(int i) {
        this.jw = i;
    }

    @Override // groovyjarjarantlr.Token
    public String j6() {
        return this.fY;
    }

    @Override // org.codehaus.groovy.antlr.SourceInfo
    public int rN() {
        return this.zh;
    }

    @Override // groovyjarjarantlr.Token
    public String toString() {
        return "[\"" + j6() + "\",<" + this.WB + ">,line=" + this.jw + ",col=" + this.qp + ",lineLast=" + this.k2 + ",colLast=" + this.zh + "]";
    }

    @Override // groovyjarjarantlr.Token
    public void u7(String str) {
        this.fY = str;
    }

    public void we(int i) {
        this.k2 = i;
    }
}
