package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ActionTransInfo {
    public boolean j6 = false;
    public String DW = null;
    public String FH = null;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("assignToRoot:");
        stringBuffer.append(this.j6);
        stringBuffer.append(", refRuleRoot:");
        stringBuffer.append(this.DW);
        stringBuffer.append(", FOLLOW Set:");
        stringBuffer.append(this.FH);
        return stringBuffer.toString();
    }
}
