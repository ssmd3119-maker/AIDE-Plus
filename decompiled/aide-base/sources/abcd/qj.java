package abcd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/* loaded from: classes.dex */
public class qj {
    private static HashSet<String> DW;
    private static boolean FH;
    private static HashSet<String> j6;

    private static HashSet<String> DW(String str) throws IOException {
        HashSet<String> hashSet = new HashSet<>();
        try {
            FileReader fileReader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    fileReader.close();
                    return hashSet;
                }
                hashSet.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error with optimize list: " + str, e);
        }
    }

    public static boolean FH(String str) {
        HashSet<String> hashSet = j6;
        if (hashSet != null) {
            return hashSet.contains(str);
        }
        if (DW != null) {
            return !r0.contains(str);
        }
        return true;
    }

    public static void j6(String str, String str2) {
        if (FH) {
            return;
        }
        if (str != null && str2 != null) {
            throw new RuntimeException("optimize and don't optimize lists  are mutually exclusive.");
        }
        if (str != null) {
            j6 = DW(str);
        }
        if (str2 != null) {
            DW = DW(str2);
        }
        FH = true;
    }
}
