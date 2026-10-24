package abcd;

import abcd.no;
import com.aide.uidesigner.ProxyTextView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class oo {
    public int Mr;
    public int U2;
    public int a8;
    public final byte[] j3;
    public final a j6 = new a(0);
    public final a DW = new a(1);
    public final a FH = new a(2);
    public final a Hw = new a(3);
    public final a v5 = new a(4);
    public final a Zo = new a(5);
    public final a VH = new a(6);
    public final a gn = new a(4096);
    public final a u7 = new a(ProxyTextView.INPUTTYPE_textCapCharacters);
    public final a tp = new a(ProxyTextView.INPUTTYPE_numberSigned);
    public final a EQ = new a(4099);
    public final a we = new a(8192);
    public final a J0 = new a(ProxyTextView.INPUTTYPE_textCapWords);
    public final a J8 = new a(ProxyTextView.INPUTTYPE_numberDecimal);
    public final a Ws = new a(8195);
    public final a QX = new a(8196);
    public final a XL = new a(8197);
    public final a aM = new a(8198);

    public static class a implements Comparable<a> {
        public final short WB;
        public int mb = 0;
        public int jw = -1;

        public a(int i) {
            this.WB = (short) i;
        }

        public boolean DW() {
            return this.mb > 0;
        }

        @Override // java.lang.Comparable
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i = this.jw;
            int i2 = aVar.jw;
            if (i != i2) {
                return i < i2 ? -1 : 1;
            }
            return 0;
        }

        public String toString() {
            return String.format("Section[type=%#x,off=%#x,size=%#x]", Short.valueOf(this.WB), Integer.valueOf(this.jw), Integer.valueOf(this.mb));
        }
    }

    public oo() {
        new ArrayList();
        this.j3 = new byte[20];
    }

    public void DW(no.b bVar, List<a> list) {
        Iterator<a> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().DW()) {
                i++;
            }
        }
        bVar.writeInt(i);
        for (a aVar : list) {
            if (aVar.DW()) {
                bVar.nw(aVar.WB);
                bVar.nw((short) 0);
                bVar.writeInt(aVar.mb);
                bVar.writeInt(aVar.jw);
            }
        }
    }

    public void j6(no.b bVar) {
        try {
            bVar.write(jj.j6(13).getBytes("UTF-8"));
            bVar.writeInt(0);
            bVar.write(this.j3);
            bVar.writeInt(this.Mr);
            bVar.writeInt(112);
            bVar.writeInt(305419896);
            bVar.writeInt(0);
            bVar.writeInt(0);
            bVar.writeInt(this.gn.jw);
            bVar.writeInt(this.DW.mb);
            bVar.writeInt(this.DW.jw);
            bVar.writeInt(this.FH.mb);
            bVar.writeInt(this.FH.jw);
            bVar.writeInt(this.Hw.mb);
            bVar.writeInt(this.Hw.jw);
            bVar.writeInt(this.v5.mb);
            bVar.writeInt(this.v5.jw);
            bVar.writeInt(this.Zo.mb);
            bVar.writeInt(this.Zo.jw);
            bVar.writeInt(this.VH.mb);
            bVar.writeInt(this.VH.jw);
            bVar.writeInt(this.U2);
            bVar.writeInt(this.a8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
