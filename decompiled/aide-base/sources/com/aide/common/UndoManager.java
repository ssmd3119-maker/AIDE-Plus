package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

@cy(clazz = -1448330021796408100L, container = -1448330021796408100L, user = true)
/* loaded from: classes.dex */
public class UndoManager {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 848776193189042559L)
    private Stack<Change> DW;

    @dy(field = 2159268741301985208L)
    private List<UndoManagerListener> FH;

    @dy(field = -3741163752241171333L)
    private Stack<Change> j6;

    @cy(clazz = 3402184508602591432L, container = 3402184508602591432L, user = true)
    public interface UndoManagerListener {
        @ey(method = 1370709832249056888L)
        void FH();

        @ey(method = -2289249822756536259L)
        void Hw(String str, String str2, int i);
    }

    static {
        iy.Zo(UndoManager.class);
    }

    @ey(method = 1765006593287720008L)
    public UndoManager() {
        try {
            if (Hw) {
                iy.gn(3687910594584982755L, null);
            }
            this.j6 = new Stack<>();
            this.DW = new Stack<>();
            this.FH = new ArrayList();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 3687910594584982755L, null);
            }
            throw th;
        }
    }

    @ey(method = 113770261290318255L)
    private void VH() {
        try {
            if (Hw) {
                iy.gn(-151464885855749865L, this);
            }
            Iterator<UndoManagerListener> it = this.FH.iterator();
            while (it.hasNext()) {
                it.next().FH();
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -151464885855749865L, this);
            }
            throw th;
        }
    }

    @ey(method = -968731425726789392L)
    private void Zo(Change change) {
        try {
            if (Hw) {
                iy.tp(-3429191467663332592L, this, change);
            }
            for (UndoManagerListener undoManagerListener : this.FH) {
                undoManagerListener.FH();
                undoManagerListener.Hw(change.WB, gn(change.WB), change.jw);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -3429191467663332592L, this, change);
            }
            throw th;
        }
    }

    @ey(method = -1916791605002349257L)
    private String gn(String str) {
        try {
            if (Hw) {
                iy.tp(845527716254720367L, this, str);
            }
            for (int size = this.j6.size() - 1; size >= 0; size--) {
                if (this.j6.get(size).WB.equals(str)) {
                    str = this.j6.get(size).mb;
                    return str;
                }
            }
            return "";
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 845527716254720367L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -378257419628534160L)
    public void DW(UndoManagerListener undoManagerListener) {
        try {
            if (Hw) {
                iy.tp(1266516184012427776L, this, undoManagerListener);
            }
            this.FH.add(undoManagerListener);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1266516184012427776L, this, undoManagerListener);
            }
            throw th;
        }
    }

    @ey(method = 1737621843506915805L)
    public void EQ(UndoManagerListener undoManagerListener) {
        try {
            if (Hw) {
                iy.tp(-1185633639697176747L, this, undoManagerListener);
            }
            this.FH.remove(undoManagerListener);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -1185633639697176747L, this, undoManagerListener);
            }
            throw th;
        }
    }

    @ey(method = -4803835470698028128L)
    public void FH(String str, String str2, int i) {
        try {
            if (Hw) {
                iy.we(-1274582641144818576L, this, str, str2, new Integer(i));
            }
            if (str != null) {
                this.DW.clear();
                this.j6.push(new Change(str, str2, i));
                VH();
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -1274582641144818576L, this, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3186346714637604840L)
    public boolean Hw() {
        try {
            if (Hw) {
                iy.gn(1823030156117842840L, this);
            }
            return this.DW.size() > 0;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1823030156117842840L, this);
            }
            throw th;
        }
    }

    @ey(method = 1967761595371098780L)
    public void J0() {
        try {
            if (Hw) {
                iy.gn(-1835745965886851060L, this);
            }
            Change changePop = this.j6.pop();
            this.DW.push(changePop);
            Zo(changePop);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1835745965886851060L, this);
            }
            throw th;
        }
    }

    @ey(method = -3484264200623928197L)
    public void j6(String str, String str2, int i) {
        try {
            if (Hw) {
                iy.we(-173016216841515021L, this, str, str2, new Integer(i));
            }
            if (str == null || str2.equals(gn(str))) {
                return;
            }
            this.DW.clear();
            this.j6.push(new Change(str, str2, i));
            VH();
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -173016216841515021L, this, str, str2, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1959947158325695968L)
    public void tp() {
        try {
            if (Hw) {
                iy.gn(-1835590263964797056L, this);
            }
            Change changePop = this.DW.pop();
            this.j6.push(changePop);
            Zo(changePop);
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -1835590263964797056L, this);
            }
            throw th;
        }
    }

    @ey(method = -2670527685569877056L)
    public void u7(Bundle bundle) {
        try {
            if (Hw) {
                iy.tp(5809451549120746528L, this, bundle);
            }
            this.j6.clear();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("undo");
            if (parcelableArrayList != null) {
                this.j6.addAll(parcelableArrayList);
            }
            this.DW.clear();
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("redo");
            if (parcelableArrayList2 != null) {
                this.DW.addAll(parcelableArrayList2);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 5809451549120746528L, this, bundle);
            }
            throw th;
        }
    }

    @ey(method = 3196306196191987968L)
    public boolean v5() {
        try {
            if (Hw) {
                iy.gn(1830752858474875648L, this);
            }
            HashSet hashSet = new HashSet();
            for (int size = this.j6.size() - 1; size >= 0; size--) {
                String str = this.j6.get(size).WB;
                if (hashSet.contains(str)) {
                    return true;
                }
                hashSet.add(str);
            }
            return false;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1830752858474875648L, this);
            }
            throw th;
        }
    }

    @ey(method = -4111588612079942403L)
    public void we(Bundle bundle) {
        try {
            if (Hw) {
                iy.tp(4490399858109587205L, this, bundle);
            }
            bundle.putParcelableArrayList("undo", new ArrayList<>(this.j6));
            bundle.putParcelableArrayList("redo", new ArrayList<>(this.DW));
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 4490399858109587205L, this, bundle);
            }
            throw th;
        }
    }

    @cy(clazz = -3939864719947814112L, container = -3939864719947814112L, user = true)
    private static class Change implements Parcelable {

        @dy(field = -1852108972899249685L)
        public static final Parcelable.Creator<Change> CREATOR;

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -2900198444050481952L)
        public String WB;

        @dy(field = 2658837491522325253L)
        public int jw;

        @dy(field = -38503772974051616L)
        public String mb;

        @cy(clazz = -52892397807058845L, container = -3939864719947814112L, user = true)
        static class a implements Parcelable.Creator<Change> {

            @gy
            private static /* synthetic */ boolean DW;

            @fy
            private static /* synthetic */ boolean j6;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 1615653728076952161L)
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @ey(method = 1294720075820608647L)
            /* renamed from: DW, reason: merged with bridge method [inline-methods] */
            public Change[] newArray(int i) {
                try {
                    if (j6) {
                        iy.u7(2380064336002098645L, this, i);
                    }
                    return new Change[i];
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, 2380064336002098645L, this, new Integer(i));
                    }
                    throw th;
                }
            }

            @Override // android.os.Parcelable.Creator
            @ey(method = 3569534810449102968L)
            /* renamed from: j6, reason: merged with bridge method [inline-methods] */
            public Change createFromParcel(Parcel parcel) {
                try {
                    if (j6) {
                        iy.tp(-2185044651464009472L, this, parcel);
                    }
                    return new Change(parcel);
                } catch (Throwable th) {
                    if (DW) {
                        iy.j3(th, -2185044651464009472L, this, parcel);
                    }
                    throw th;
                }
            }
        }

        static {
            try {
                iy.Zo(Change.class);
                if (fY) {
                    iy.gn(1306105219292752593L, null);
                }
                CREATOR = new a();
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 1306105219292752593L, null);
                }
                throw th;
            }
        }

        @ey(method = 470051140639841199L)
        public Change(String str, String str2, int i) {
            try {
                if (fY) {
                    iy.we(322067234983942444L, null, str, str2, new Integer(i));
                }
                this.WB = str;
                this.mb = str2;
                this.jw = i;
            } catch (Throwable th) {
                if (qp) {
                    iy.U2(th, 322067234983942444L, null, str, str2, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable
        @ey(method = 2272687715882419935L)
        public int describeContents() {
            try {
                if (!fY) {
                    return 0;
                }
                iy.gn(-5364907973463609908L, this);
                return 0;
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -5364907973463609908L, this);
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable
        @ey(method = 1404192200456920112L)
        public void writeToParcel(Parcel parcel, int i) {
            try {
                if (fY) {
                    iy.EQ(411343048803299725L, this, parcel, new Integer(i));
                }
                parcel.writeString(this.WB);
                parcel.writeString(this.mb);
                parcel.writeInt(this.jw);
            } catch (Throwable th) {
                if (qp) {
                    iy.Mr(th, 411343048803299725L, this, parcel, new Integer(i));
                }
                throw th;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @ey(method = -206820081837883096L)
        public Change(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readInt());
            try {
                if (fY) {
                    iy.tp(-1587993151461272849L, null, parcel);
                }
            } catch (Throwable th) {
                if (qp) {
                    iy.j3(th, -1587993151461272849L, null, parcel);
                }
                throw th;
            }
        }
    }
}
