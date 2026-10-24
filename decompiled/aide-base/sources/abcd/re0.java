package abcd;

import abcd.r70;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class re0 extends le0 implements kd0 {
    static final se0 j3 = new a();
    private final File aM;

    class a extends se0 {
        @Override // abcd.se0
        public boolean FH(ue0 ue0Var, p70 p70Var, String str) {
            if (ue0Var.gn() != null && ue0Var.u7() <= 0 && ue0Var.we() == null && ue0Var.VH() == null && ue0Var.v5() == null) {
                return ue0Var.EQ() == null || VH().contains(ue0Var.EQ());
            }
            return false;
        }

        @Override // abcd.se0
        public String Hw() {
            return JGitText.DW().transportProtoLocal;
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return Collections.singleton("file");
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) throws s40 {
            File fileVH = p70Var.tp().VH(new File("."), ue0Var.gn());
            if (fileVH.isFile()) {
                return new ne0(p70Var, ue0Var, fileVH);
            }
            File fileU7 = r70.a.u7(fileVH, p70Var.tp());
            if (fileU7 != null) {
                return new re0(p70Var, ue0Var, fileU7);
            }
            throw new s40(ue0Var, JGitText.DW().notFound);
        }
    }

    class b extends qc0 {
        private Thread cn;
        private Process ro;

        public b(re0 re0Var) throws j50 {
            super(re0Var);
            ug0 ug0Var = new ug0();
            J8(ug0Var);
            Process processAj = re0Var.aj(re0Var.J0());
            this.ro = processAj;
            wg0 wg0Var = new wg0(processAj.getErrorStream(), ug0Var.j6());
            this.cn = wg0Var;
            wg0Var.start();
            XL(new BufferedInputStream(this.ro.getInputStream()), new vg0(this.ro.getOutputStream()));
            Mr();
        }

        @Override // abcd.qc0, abcd.pc0, abcd.tc0
        public void close() {
            super.close();
            Process process = this.ro;
            if (process != null) {
                try {
                    process.waitFor();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.ro = null;
                    throw th;
                }
                this.ro = null;
            }
            Thread thread = this.cn;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused2) {
                } catch (Throwable th2) {
                    this.cn = null;
                    throw th2;
                }
                this.cn = null;
            }
        }
    }

    class c extends rc0 {
        private Thread gW;
        private Process yS;

        public c(re0 re0Var) throws j50 {
            super(re0Var);
            ug0 ug0Var = new ug0();
            J8(ug0Var);
            Process processAj = re0Var.aj(re0Var.we());
            this.yS = processAj;
            wg0 wg0Var = new wg0(processAj.getErrorStream(), ug0Var.j6());
            this.gW = wg0Var;
            wg0Var.start();
            XL(new BufferedInputStream(this.yS.getInputStream()), new vg0(this.yS.getOutputStream()));
            Mr();
        }

        @Override // abcd.pc0, abcd.tc0
        public void close() {
            super.close();
            Process process = this.yS;
            if (process != null) {
                try {
                    process.waitFor();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.yS = null;
                    throw th;
                }
                this.yS = null;
            }
            Thread thread = this.gW;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused2) {
                } catch (Throwable th2) {
                    this.gW = null;
                    throw th2;
                }
                this.gW = null;
            }
        }
    }

    class d extends qc0 {
        private Thread ro;

        class a extends PipedInputStream {
            public a(d dVar) {
                ((PipedInputStream) this).buffer = new byte[2952];
            }
        }

        class b extends Thread {
            private final /* synthetic */ p70 fY;
            private final /* synthetic */ PipedOutputStream jw;
            private final /* synthetic */ PipedInputStream mb;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, PipedInputStream pipedInputStream, PipedOutputStream pipedOutputStream, p70 p70Var) {
                super(str);
                this.mb = pipedInputStream;
                this.jw = pipedOutputStream;
                this.fY = p70Var;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws IOException {
                PipedOutputStream pipedOutputStream;
                try {
                    try {
                        try {
                            re0.this.sy(this.fY).j3(this.mb, this.jw, null);
                            try {
                                this.mb.close();
                            } catch (IOException unused) {
                            }
                            pipedOutputStream = this.jw;
                        } catch (IOException unused2) {
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        try {
                            this.mb.close();
                        } catch (IOException unused3) {
                        }
                        pipedOutputStream = this.jw;
                    } catch (RuntimeException e2) {
                        e2.printStackTrace();
                        try {
                            this.mb.close();
                        } catch (IOException unused4) {
                        }
                        pipedOutputStream = this.jw;
                    }
                    pipedOutputStream.close();
                    this.fY.j6();
                } catch (Throwable th) {
                    try {
                        this.mb.close();
                    } catch (IOException unused5) {
                    }
                    try {
                        this.jw.close();
                    } catch (IOException unused6) {
                    }
                    this.fY.j6();
                    throw th;
                }
            }
        }

        public d() throws j50 {
            super(re0.this);
            try {
                ka0 ka0Var = new ka0(re0.this.aM);
                try {
                    PipedInputStream pipedInputStream = new PipedInputStream();
                    PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
                    a aVar = new a(this);
                    OutputStream pipedOutputStream2 = new PipedOutputStream(aVar);
                    b bVar = new b("JGit-Upload-Pack", aVar, pipedOutputStream, ka0Var);
                    this.ro = bVar;
                    bVar.start();
                    XL(pipedInputStream, pipedOutputStream2);
                    Mr();
                } catch (IOException e) {
                    ka0Var.j6();
                    throw new j50(this.v5, JGitText.DW().cannotConnectPipes, e);
                }
            } catch (IOException unused) {
                throw new j50(this.v5, JGitText.DW().notAGitDirectory);
            }
        }

        @Override // abcd.qc0, abcd.pc0, abcd.tc0
        public void close() {
            super.close();
            Thread thread = this.ro;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.ro = null;
                    throw th;
                }
                this.ro = null;
            }
        }
    }

    class e extends rc0 {
        private Thread yS;

        class a extends Thread {
            private final /* synthetic */ p70 fY;
            private final /* synthetic */ PipedOutputStream jw;
            private final /* synthetic */ PipedInputStream mb;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, PipedInputStream pipedInputStream, PipedOutputStream pipedOutputStream, p70 p70Var) {
                super(str);
                this.mb = pipedInputStream;
                this.jw = pipedOutputStream;
                this.fY = p70Var;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws IOException {
                PipedOutputStream pipedOutputStream;
                try {
                    try {
                        try {
                            try {
                                re0.this.Qq(this.fY).Mr(this.mb, this.jw, System.err);
                                try {
                                    this.mb.close();
                                } catch (IOException unused) {
                                }
                                pipedOutputStream = this.jw;
                            } catch (IOException unused2) {
                                pipedOutputStream = this.jw;
                                pipedOutputStream.close();
                                this.fY.j6();
                            }
                        } catch (IOException unused3) {
                        }
                    } catch (IOException unused4) {
                        pipedOutputStream = this.jw;
                        pipedOutputStream.close();
                        this.fY.j6();
                    }
                } catch (IOException unused5) {
                    this.mb.close();
                    pipedOutputStream = this.jw;
                    pipedOutputStream.close();
                    this.fY.j6();
                } catch (RuntimeException unused6) {
                    this.mb.close();
                    pipedOutputStream = this.jw;
                    pipedOutputStream.close();
                    this.fY.j6();
                } catch (Throwable th) {
                    try {
                        this.mb.close();
                    } catch (IOException unused7) {
                    }
                    try {
                        this.jw.close();
                    } catch (IOException unused8) {
                    }
                    this.fY.j6();
                    throw th;
                }
                pipedOutputStream.close();
                this.fY.j6();
            }
        }

        public e() throws j50 {
            super(re0.this);
            try {
                ka0 ka0Var = new ka0(re0.this.aM);
                try {
                    PipedInputStream pipedInputStream = new PipedInputStream();
                    PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
                    PipedInputStream pipedInputStream2 = new PipedInputStream();
                    OutputStream pipedOutputStream2 = new PipedOutputStream(pipedInputStream2);
                    a aVar = new a("JGit-Receive-Pack", pipedInputStream2, pipedOutputStream, ka0Var);
                    this.yS = aVar;
                    aVar.start();
                    XL(pipedInputStream, pipedOutputStream2);
                    Mr();
                } catch (IOException e) {
                    ka0Var.j6();
                    throw new j50(this.v5, JGitText.DW().cannotConnectPipes, e);
                }
            } catch (IOException unused) {
                throw new j50(this.v5, JGitText.DW().notAGitDirectory);
            }
        }

        @Override // abcd.pc0, abcd.tc0
        public void close() {
            super.close();
            Thread thread = this.yS;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.yS = null;
                    throw th;
                }
                this.yS = null;
            }
        }
    }

    public re0(p70 p70Var, ue0 ue0Var, File file) {
        super(p70Var, ue0Var);
        this.aM = file;
    }

    @Override // abcd.le0
    public void Hw() {
    }

    public vd0 Qq(p70 p70Var) {
        return new vd0(p70Var);
    }

    @Override // abcd.le0
    public rd0 SI() {
        String strWe = we();
        return ("git-receive-pack".equals(strWe) || "git receive-pack".equals(strWe)) ? new e() : new c(this);
    }

    public Process aj(String str) throws j50 {
        try {
            ProcessBuilder processBuilderU7 = this.j6.tp().u7(str, new String[]{"."});
            processBuilderU7.directory(this.aM);
            Map<String, String> mapEnvironment = processBuilderU7.environment();
            mapEnvironment.remove("GIT_ALTERNATE_OBJECT_DIRECTORIES");
            mapEnvironment.remove("GIT_CONFIG");
            mapEnvironment.remove("GIT_CONFIG_PARAMETERS");
            mapEnvironment.remove("GIT_DIR");
            mapEnvironment.remove("GIT_WORK_TREE");
            mapEnvironment.remove("GIT_GRAFT_FILE");
            mapEnvironment.remove("GIT_INDEX_FILE");
            mapEnvironment.remove("GIT_NO_REPLACE_OBJECTS");
            return processBuilderU7.start();
        } catch (IOException e2) {
            throw new j50(this.DW, e2.getMessage(), e2);
        }
    }

    @Override // abcd.le0
    public yc0 nw() {
        String strJ0 = J0();
        return ("git-upload-pack".equals(strJ0) || "git upload-pack".equals(strJ0)) ? new d() : new b(this);
    }

    public ve0 sy(p70 p70Var) {
        return new ve0(p70Var);
    }
}
