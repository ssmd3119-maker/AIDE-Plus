package abcd;

/* loaded from: classes.dex */
public final class zo extends ws {
    public static final zo jw = new zo(0);

    public zo(int i) {
        super(i);
    }

    public static zo sG(zo zoVar, zo zoVar2) {
        int size = zoVar.size();
        if (size != zoVar2.size()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        zo zoVar3 = new zo(size);
        for (int i = 0; i < size; i++) {
            zoVar3.Sf(i, yo.ro(zoVar.ef(i), zoVar2.ef(i)));
        }
        zoVar3.Mr();
        return zoVar3;
    }

    public void Sf(int i, yo yoVar) {
        yoVar.yS();
        KD(i, yoVar);
    }

    public yo ef(int i) {
        return (yo) BT(i);
    }
}
