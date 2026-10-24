package abcd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class dz {

    static class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return (int) Math.signum(bVar.Hw - bVar2.Hw);
        }
    }

    public static class b {
        public String DW;
        public jy FH;
        public long Hw;
        public String j6;

        public b(String str, String str2, jy jyVar, long j) {
            this.j6 = str;
            this.DW = str2;
            this.FH = jyVar;
            this.Hw = j;
        }
    }

    public static List<b> DW() {
        return FH(null);
    }

    private static List<b> FH(String str) {
        b bVarJ6;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = v5().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.getName().endsWith(".ser") && ((str == null || file.getName().startsWith(str)) && (bVarJ6 = j6(file)) != null && (str == null || bVarJ6.DW.equals(str)))) {
                    arrayList.add(bVarJ6);
                }
            }
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    private static File Hw(b bVar) {
        return new File(v5(), bVar.DW + "_" + bVar.Hw + ".ser");
    }

    private static void VH(b bVar, File file) {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeUTF(bVar.j6);
            dataOutputStream.writeUTF(bVar.DW);
            dataOutputStream.writeLong(bVar.Hw);
            bVar.FH.aM(dataOutputStream);
        } finally {
            dataOutputStream.close();
        }
    }

    public static b Zo(String str, String str2, jy jyVar, long j) {
        if (jyVar.we) {
            List<b> listFH = FH(str2);
            if (listFH.size() >= 100) {
                Iterator<b> it = listFH.subList(0, (listFH.size() - 100) + 1).iterator();
                while (it.hasNext()) {
                    Hw(it.next()).delete();
                }
            }
        } else {
            List<b> listFH2 = FH(str2);
            Iterator<b> it2 = listFH2.iterator();
            while (it2.hasNext()) {
                if (it2.next().Hw > j) {
                    return null;
                }
            }
            Iterator<b> it3 = listFH2.iterator();
            while (it3.hasNext()) {
                Hw(it3.next()).delete();
            }
        }
        if (jyVar.EQ) {
            try {
                b bVar = new b(str, str2, jyVar, j);
                VH(bVar, Hw(bVar));
                return j6(Hw(bVar));
            } catch (Throwable th) {
                b00.VH("Property error", th);
            }
        }
        return null;
    }

    private static b j6(File file) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                return new b(dataInputStream.readUTF(), dataInputStream.readUTF(), new jy(dataInputStream), dataInputStream.readLong());
            } finally {
                dataInputStream.close();
            }
        } catch (Throwable th) {
            b00.VH("Property error", th);
            return null;
        }
    }

    private static File v5() {
        return d00.v5(iy.DW(), "properties");
    }
}
