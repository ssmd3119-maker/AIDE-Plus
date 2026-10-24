package com.jcraft.jsch;

import com.jcraft.jsch.ConfigRepository;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class OpenSSHConfig implements ConfigRepository {
    private static final Hashtable Hw;
    private final Hashtable DW;
    private final Vector FH;

    class MyConfig implements ConfigRepository.Config {
        private Vector j6;

        MyConfig(OpenSSHConfig openSSHConfig, String str) {
            boolean z;
            Vector vector = new Vector();
            this.j6 = vector;
            vector.addElement(openSSHConfig.DW.get(""));
            byte[] bArrAM = Util.aM(str);
            if (openSSHConfig.FH.size() > 1) {
                for (int i = 1; i < openSSHConfig.FH.size(); i++) {
                    for (String str2 : ((String) openSSHConfig.FH.elementAt(i)).split("[ \t]")) {
                        String strTrim = str2.trim();
                        if (strTrim.startsWith("!")) {
                            strTrim = strTrim.substring(1).trim();
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Util.J8(Util.aM(strTrim), bArrAM)) {
                            if (!z) {
                                this.j6.addElement(openSSHConfig.DW.get((String) openSSHConfig.FH.elementAt(i)));
                            }
                        } else if (z) {
                            this.j6.addElement(openSSHConfig.DW.get((String) openSSHConfig.FH.elementAt(i)));
                        }
                    }
                }
            }
        }

        private String[] VH(String str) {
            String str2;
            Vector vector = new Vector();
            for (int i = 0; i < this.j6.size(); i++) {
                Vector vector2 = (Vector) this.j6.elementAt(i);
                for (int i2 = 0; i2 < vector2.size(); i2++) {
                    String[] strArr = (String[]) vector2.elementAt(i2);
                    if (strArr[0].equals(str) && (str2 = strArr[1]) != null) {
                        vector.remove(str2);
                        vector.addElement(str2);
                    }
                }
            }
            String[] strArr2 = new String[vector.size()];
            vector.toArray(strArr2);
            return strArr2;
        }

        private String Zo(String str) {
            if (OpenSSHConfig.Hw.get(str) != null) {
                str = (String) OpenSSHConfig.Hw.get(str);
            }
            String str2 = null;
            for (int i = 0; i < this.j6.size(); i++) {
                Vector vector = (Vector) this.j6.elementAt(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= vector.size()) {
                        break;
                    }
                    String[] strArr = (String[]) vector.elementAt(i2);
                    if (strArr[0].equals(str)) {
                        str2 = strArr[1];
                        break;
                    }
                    i2++;
                }
                if (str2 != null) {
                    break;
                }
            }
            return str2;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public int DW() {
            try {
                return Integer.parseInt(Zo("Port"));
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String[] FH(String str) {
            return VH(str);
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String Hw() {
            return Zo("User");
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String j6(String str) {
            if (!str.equals("compression.s2c") && !str.equals("compression.c2s")) {
                return Zo(str);
            }
            String strZo = Zo(str);
            return (strZo == null || strZo.equals("no")) ? "none,zlib@openssh.com,zlib" : "zlib@openssh.com,zlib,none";
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String v5() {
            return Zo("Hostname");
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        Hw = hashtable;
        hashtable.put("kex", "KexAlgorithms");
        Hw.put("server_host_key", "HostKeyAlgorithms");
        Hw.put("cipher.c2s", "Ciphers");
        Hw.put("cipher.s2c", "Ciphers");
        Hw.put("mac.c2s", "Macs");
        Hw.put("mac.s2c", "Macs");
        Hw.put("compression.s2c", "Compression");
        Hw.put("compression.c2s", "Compression");
        Hw.put("compression_level", "CompressionLevel");
        Hw.put("MaxAuthTries", "NumberOfPasswordPrompts");
    }

    @Override // com.jcraft.jsch.ConfigRepository
    public ConfigRepository.Config j6(String str) {
        return new MyConfig(this, str);
    }
}
