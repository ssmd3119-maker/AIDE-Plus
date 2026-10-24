package abcd;

import abcd.se0;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class oe0 extends ie0 implements kd0 {
    static final se0 aM = new a();

    class a extends se0 {
        @Override // abcd.se0
        public String Hw() {
            return JGitText.DW().transportProtoGitAnon;
        }

        @Override // abcd.se0
        public Set<String> VH() {
            return Collections.singleton("git");
        }

        @Override // abcd.se0
        public Set<se0.a> Zo() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.HOST, se0.a.PATH));
        }

        @Override // abcd.se0
        public le0 gn(ue0 ue0Var, p70 p70Var, String str) {
            return new oe0(p70Var, ue0Var);
        }

        @Override // abcd.se0
        public Set<se0.a> v5() {
            return Collections.unmodifiableSet(EnumSet.of(se0.a.PORT));
        }
    }

    class b extends qc0 {
        private Socket ro;

        public b(oe0 oe0Var) throws IOException {
            super(oe0Var);
            Socket socketX9 = oe0Var.x9();
            this.ro = socketX9;
            try {
                XL(new BufferedInputStream(socketX9.getInputStream()), new vg0(this.ro.getOutputStream()));
                oe0Var.Qq("git-upload-pack", this.J0);
                Mr();
            } catch (IOException e) {
                close();
                throw new j50(this.v5, JGitText.DW().remoteHungUpUnexpectedly, e);
            }
        }

        @Override // abcd.qc0, abcd.pc0, abcd.tc0
        public void close() {
            super.close();
            Socket socket = this.ro;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.ro = null;
                    throw th;
                }
                this.ro = null;
            }
        }
    }

    class c extends rc0 {
        private Socket yS;

        public c(oe0 oe0Var) throws IOException {
            super(oe0Var);
            Socket socketX9 = oe0Var.x9();
            this.yS = socketX9;
            try {
                XL(new BufferedInputStream(socketX9.getInputStream()), new vg0(this.yS.getOutputStream()));
                oe0Var.Qq("git-receive-pack", this.J0);
                Mr();
            } catch (IOException e) {
                close();
                throw new j50(this.v5, JGitText.DW().remoteHungUpUnexpectedly, e);
            }
        }

        @Override // abcd.pc0, abcd.tc0
        public void close() {
            super.close();
            Socket socket = this.yS;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.yS = null;
                    throw th;
                }
                this.yS = null;
            }
        }
    }

    public oe0(p70 p70Var, ue0 ue0Var) {
        super(p70Var, ue0Var);
    }

    @Override // abcd.le0
    public void Hw() {
    }

    public void Qq(String str, nd0 nd0Var) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(this.DW.gn());
        sb.append((char) 0);
        sb.append("host=");
        sb.append(this.DW.v5());
        if (this.DW.u7() > 0 && this.DW.u7() != 9418) {
            sb.append(":");
            sb.append(this.DW.u7());
        }
        sb.append((char) 0);
        nd0Var.VH(sb.toString());
        nd0Var.DW();
    }

    @Override // abcd.le0
    public rd0 SI() {
        return new c(this);
    }

    @Override // abcd.le0
    public yc0 nw() {
        return new b(this);
    }

    public Socket x9() throws IOException {
        int iQX = QX() > 0 ? QX() * 1000 : 0;
        int iU7 = this.DW.u7() > 0 ? this.DW.u7() : 9418;
        Socket socket = new Socket();
        try {
            InetAddress byName = InetAddress.getByName(this.DW.v5());
            socket.bind(null);
            socket.connect(new InetSocketAddress(byName, iU7), iQX);
            return socket;
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            if (e instanceof UnknownHostException) {
                throw new j50(this.DW, JGitText.DW().unknownHost);
            }
            if (e instanceof ConnectException) {
                throw new j50(this.DW, e.getMessage());
            }
            throw new j50(this.DW, e.getMessage(), e);
        }
    }
}
