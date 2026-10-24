package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class ze0 {
    static final ze0 j6 = new a(null);

    private static class a extends ze0 {
        private a() {
        }

        @Override // abcd.ze0
        public OutputStream DW(OutputStream outputStream) {
            return outputStream;
        }

        @Override // abcd.ze0
        public void Hw(HttpURLConnection httpURLConnection, String str) {
        }

        @Override // abcd.ze0
        public InputStream j6(InputStream inputStream) {
            return inputStream;
        }

        @Override // abcd.ze0
        public void v5(HttpURLConnection httpURLConnection, String str) throws IOException {
            Zo(httpURLConnection, str, "", "");
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    static class b extends ze0 {
        private static byte[] Zo = {-92, 11, -56, 52, -42, -107, -13, 19};
        private static int v5 = 5000;
        private final String DW;
        private final SecretKey FH;
        private final PBEParameterSpec Hw = new PBEParameterSpec(Zo, v5);

        public b(String str, String str2) {
            this.DW = str;
            this.FH = SecretKeyFactory.getInstance(str).generateSecret(new PBEKeySpec(str2.toCharArray(), Zo, v5, 32));
        }

        @Override // abcd.ze0
        public OutputStream DW(OutputStream outputStream) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
            try {
                Cipher cipher = Cipher.getInstance(this.DW);
                cipher.init(1, this.FH, this.Hw);
                return new CipherOutputStream(outputStream, cipher);
            } catch (InvalidAlgorithmParameterException e) {
                throw FH(e);
            } catch (InvalidKeyException e2) {
                throw FH(e2);
            } catch (NoSuchAlgorithmException e3) {
                throw FH(e3);
            } catch (NoSuchPaddingException e4) {
                throw FH(e4);
            }
        }

        @Override // abcd.ze0
        public void Hw(HttpURLConnection httpURLConnection, String str) {
            httpURLConnection.setRequestProperty(String.valueOf(str) + "jets3t-crypto-ver", "2");
            httpURLConnection.setRequestProperty(String.valueOf(str) + "jets3t-crypto-alg", this.DW);
        }

        @Override // abcd.ze0
        public InputStream j6(InputStream inputStream) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
            try {
                Cipher cipher = Cipher.getInstance(this.DW);
                cipher.init(2, this.FH, this.Hw);
                return new CipherInputStream(inputStream, cipher);
            } catch (InvalidAlgorithmParameterException e) {
                throw FH(e);
            } catch (InvalidKeyException e2) {
                throw FH(e2);
            } catch (NoSuchAlgorithmException e3) {
                throw FH(e3);
            } catch (NoSuchPaddingException e4) {
                throw FH(e4);
            }
        }

        @Override // abcd.ze0
        public void v5(HttpURLConnection httpURLConnection, String str) throws IOException {
            Zo(httpURLConnection, str, "2", this.DW);
        }
    }

    public abstract OutputStream DW(OutputStream outputStream);

    public IOException FH(Throwable th) {
        IOException iOException = new IOException(MessageFormat.format(JGitText.DW().encryptionError, th.getMessage()));
        iOException.initCause(th);
        return iOException;
    }

    public abstract void Hw(HttpURLConnection httpURLConnection, String str);

    public void Zo(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        String headerField = httpURLConnection.getHeaderField(String.valueOf(str) + "jets3t-crypto-ver");
        if (headerField == null) {
            headerField = "";
        }
        if (!str2.equals(headerField)) {
            throw new IOException(MessageFormat.format(JGitText.DW().unsupportedEncryptionVersion, headerField));
        }
        String headerField2 = httpURLConnection.getHeaderField(String.valueOf(str) + "jets3t-crypto-alg");
        String str4 = headerField2 != null ? headerField2 : "";
        if (str3.equals(str4)) {
            return;
        }
        throw new IOException(String.valueOf(JGitText.DW().unsupportedEncryptionAlgorithm) + str4);
    }

    public abstract InputStream j6(InputStream inputStream);

    public abstract void v5(HttpURLConnection httpURLConnection, String str);
}
