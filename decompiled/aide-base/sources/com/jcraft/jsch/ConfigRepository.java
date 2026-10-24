package com.jcraft.jsch;

/* loaded from: classes.dex */
public interface ConfigRepository {
    public static final Config j6 = new Config() { // from class: com.jcraft.jsch.ConfigRepository.1
        @Override // com.jcraft.jsch.ConfigRepository.Config
        public int DW() {
            return -1;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String[] FH(String str) {
            return null;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String Hw() {
            return null;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String j6(String str) {
            return null;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String v5() {
            return null;
        }
    };

    public interface Config {
        int DW();

        String[] FH(String str);

        String Hw();

        String j6(String str);

        String v5();
    }

    static {
        new ConfigRepository() { // from class: com.jcraft.jsch.ConfigRepository.2
            @Override // com.jcraft.jsch.ConfigRepository
            public Config j6(String str) {
                return ConfigRepository.j6;
            }
        };
    }

    Config j6(String str);
}
