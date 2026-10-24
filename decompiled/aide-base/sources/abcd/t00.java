package abcd;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.DigestOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes.dex */
public class t00 {
    static h00 gn;
    private static Pattern u7 = Pattern.compile("^META-INF/(.*)[.](SF|RSA|DSA)$");
    private boolean j6 = false;
    private q00 DW = new q00();
    Map<String, o00> FH = new HashMap();
    o00 Hw = null;
    String v5 = "testkey";
    Map<String, String> Zo = new HashMap();
    a VH = new a();

    public static class a extends Observable {
        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            super.setChanged();
            super.notifyObservers(obj);
        }
    }

    public t00() {
        this.Zo.put("aa9852bc5a53272ac8031d49b65e4b0e", "media");
        this.Zo.put("e60418c4b638f20d0721e115674ca11f", "platform");
        this.Zo.put("3e24e49741b60c215c010dc6048fca7d", "shared");
        this.Zo.put("dab2cead827ef5313f28e22b6fa8479f", "testkey");
    }

    private void FH(Map<String, v00> map, a10 a10Var) {
        int i = 1;
        for (v00 v00Var : map.values()) {
            if (this.j6) {
                return;
            }
            this.DW.DW(0, String.format("Copying zip entry %d of %d", Integer.valueOf(i), Integer.valueOf(map.size())));
            i++;
            a10Var.Hw(v00Var);
        }
    }

    private void Hw(Manifest manifest, Map<String, v00> map, a10 a10Var, long j) {
        ArrayList<String> arrayList = new ArrayList(manifest.getEntries().keySet());
        Collections.sort(arrayList);
        int i = 1;
        for (String str : arrayList) {
            if (this.j6) {
                return;
            }
            this.DW.DW(0, String.format("Copying zip entry %d of %d", Integer.valueOf(i), Integer.valueOf(arrayList.size())));
            i++;
            v00 v00Var = map.get(str);
            v00Var.rN(j);
            a10Var.Hw(v00Var);
        }
    }

    public static h00 VH() {
        if (gn == null) {
            gn = i00.j6(t00.class.getName());
        }
        return gn;
    }

    private void XL(byte[] bArr, byte[] bArr2, X509Certificate x509Certificate, OutputStream outputStream) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (bArr != null) {
            outputStream.write(bArr);
            outputStream.write(bArr2);
            return;
        }
        try {
            Method method = Class.forName("kellinwood.sigblock.SignatureBlockWriter").getMethod("writeSignatureBlock", new byte[1].getClass(), X509Certificate.class, OutputStream.class);
            if (method == null) {
                throw new IllegalStateException("writeSignatureBlock() method not found.");
            }
            method.invoke(null, bArr2, x509Certificate, outputStream);
        } catch (Exception e) {
            VH().FH(e.getMessage(), e);
            throw new IllegalStateException("Failed to invoke writeSignatureBlock(): " + e.getClass().getName() + ": " + e.getMessage());
        }
    }

    private void Zo(Manifest manifest, OutputStream outputStream) throws NoSuchAlgorithmException, IOException {
        outputStream.write("Signature-Version: 1.0\r\n".getBytes());
        outputStream.write("Created-By: 1.0 (Android SignApk)\r\n".getBytes());
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        PrintStream printStream = new PrintStream((OutputStream) new DigestOutputStream(new ByteArrayOutputStream(), messageDigest), true, "UTF-8");
        manifest.write(printStream);
        printStream.flush();
        outputStream.write(("SHA1-Digest-Manifest: " + l00.j6(messageDigest.digest()) + "\r\n\r\n").getBytes());
        for (Map.Entry<String, Attributes> entry : manifest.getEntries().entrySet()) {
            if (this.j6) {
                return;
            }
            this.DW.DW(0, "Generating signature file");
            String str = "Name: " + entry.getKey() + "\r\n";
            printStream.print(str);
            for (Map.Entry<Object, Object> entry2 : entry.getValue().entrySet()) {
                printStream.print(entry2.getKey() + ": " + entry2.getValue() + "\r\n");
            }
            printStream.print("\r\n");
            printStream.flush();
            outputStream.write(str.getBytes());
            outputStream.write(("SHA1-Digest: " + l00.j6(messageDigest.digest()) + "\r\n\r\n").getBytes());
        }
    }

    private Manifest j6(Map<String, v00> map) throws NoSuchAlgorithmException, IOException {
        Manifest manifest;
        Pattern pattern;
        Attributes attributes;
        v00 v00Var = map.get("META-INF/MANIFEST.MF");
        if (v00Var != null) {
            manifest = new Manifest();
            manifest.read(v00Var.u7());
        } else {
            manifest = null;
        }
        Manifest manifest2 = new Manifest();
        Attributes mainAttributes = manifest2.getMainAttributes();
        if (manifest != null) {
            mainAttributes.putAll(manifest.getMainAttributes());
        } else {
            mainAttributes.putValue("Manifest-Version", "1.0");
            mainAttributes.putValue("Created-By", "1.0 (Android SignApk)");
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        byte[] bArr = new byte[512];
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        boolean zJ6 = VH().j6();
        if (zJ6) {
            VH().Hw("Manifest entries:");
        }
        for (v00 v00Var2 : treeMap.values()) {
            if (this.j6) {
                break;
            }
            String strWe = v00Var2.we();
            if (zJ6) {
                VH().Hw(strWe);
            }
            if (!v00Var2.j3() && !strWe.equals("META-INF/MANIFEST.MF") && !strWe.equals("META-INF/CERT.SF") && !strWe.equals("META-INF/CERT.RSA") && ((pattern = u7) == null || !pattern.matcher(strWe).matches())) {
                this.DW.DW(0, "Generating manifest");
                InputStream inputStreamU7 = v00Var2.u7();
                while (true) {
                    int i = inputStreamU7.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                Attributes attributes2 = (manifest == null || (attributes = manifest.getAttributes(strWe)) == null) ? null : new Attributes(attributes);
                if (attributes2 == null) {
                    attributes2 = new Attributes();
                }
                attributes2.putValue("SHA1-Digest", l00.j6(messageDigest.digest()));
                manifest2.getEntries().put(strWe, attributes2);
            }
        }
        return manifest2;
    }

    private KeySpec v5(byte[] bArr, String str) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(bArr);
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance(encryptedPrivateKeyInfo.getAlgName()).generateSecret(new PBEKeySpec(str.toCharArray()));
            Cipher cipher = Cipher.getInstance(encryptedPrivateKeyInfo.getAlgName());
            cipher.init(2, secretKeyGenerateSecret, encryptedPrivateKeyInfo.getAlgParameters());
            try {
                return encryptedPrivateKeyInfo.getKeySpec(cipher);
            } catch (InvalidKeySpecException e) {
                VH().DW("signapk: Password for private key may be bad.");
                throw e;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public String DW(String str, Map<String, v00> map) throws NoSuchAlgorithmException, IOException {
        boolean zJ6 = VH().j6();
        if (!str.startsWith("auto")) {
            return str;
        }
        String str2 = null;
        for (Map.Entry<String, v00> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("META-INF/") && key.endsWith(".RSA")) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArrVH = entry.getValue().VH();
                if (bArrVH.length < 1458) {
                    break;
                }
                messageDigest.update(bArrVH, 0, 1458);
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                String string = sb.toString();
                String str3 = this.Zo.get(string);
                if (zJ6) {
                    if (str3 != null) {
                        VH().Hw(String.format("Auto-determined key=%s using md5=%s", str3, string));
                    } else {
                        VH().Hw(String.format("Auto key determination failed for md5=%s", string));
                    }
                }
                if (str3 != null) {
                    return str3;
                }
                str2 = str3;
            }
        }
        if (!str.equals("auto-testkey")) {
            if (!str.equals("auto-none")) {
                return null;
            }
            if (!zJ6) {
                return "none";
            }
            VH().Hw("Unable to determine key, returning: none");
            return "none";
        }
        if (!zJ6) {
            return "testkey";
        }
        VH().Hw("Falling back to key=" + str2);
        return "testkey";
    }

    public PrivateKey EQ(URL url, String str) {
        KeySpec keySpecV5;
        DataInputStream dataInputStream = new DataInputStream(url.openStream());
        try {
            byte[] bArrU7 = u7(dataInputStream);
            keySpecV5 = v5(bArrU7, str);
            if (keySpecV5 == null) {
                keySpecV5 = new PKCS8EncodedKeySpec(bArrU7);
            }
            return KeyFactory.getInstance("RSA").generatePrivate(keySpecV5);
        } catch (InvalidKeySpecException unused) {
            return KeyFactory.getInstance("DSA").generatePrivate(keySpecV5);
        } finally {
            dataInputStream.close();
        }
    }

    public void J0(String str) {
        if (VH().j6()) {
            VH().Hw("setKeymode: " + str);
        }
        this.v5 = str;
        if (str.startsWith("auto")) {
            this.Hw = null;
        } else {
            this.DW.j6();
            gn(this.v5);
        }
    }

    public void J8(String str, X509Certificate x509Certificate, PrivateKey privateKey, byte[] bArr) {
        this.Hw = new o00(str, x509Certificate, privateKey, bArr);
    }

    public void QX(Map<String, v00> map, OutputStream outputStream, String str) throws Throwable {
        Throwable th;
        a10 a10Var;
        boolean zJ6 = VH().j6();
        this.DW.j6();
        if (this.Hw == null) {
            if (!this.v5.startsWith("auto")) {
                throw new IllegalStateException("No keys configured for signing the file!");
            }
            String strDW = DW(this.v5, map);
            if (strDW == null) {
                throw new k00("Unable to auto-select key for signing " + new File(str).getName());
            }
            this.VH.notifyObservers(strDW);
            gn(strDW);
        }
        a10 a10Var2 = null;
        try {
            a10Var = new a10(outputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if ("none".equals(this.Hw.j6())) {
                this.DW.Hw(map.size());
                this.DW.FH(0);
                FH(map, a10Var);
                a10Var.j6();
                if (!this.j6 || str == null) {
                    return;
                }
                try {
                    new File(str).delete();
                    return;
                } catch (Throwable th3) {
                    VH().v5(th3.getClass().getName() + ":" + th3.getMessage());
                    return;
                }
            }
            int i = 0;
            for (v00 v00Var : map.values()) {
                String strWe = v00Var.we();
                if (!v00Var.j3() && !strWe.equals("META-INF/MANIFEST.MF") && !strWe.equals("META-INF/CERT.SF") && !strWe.equals("META-INF/CERT.RSA") && (u7 == null || !u7.matcher(strWe).matches())) {
                    i += 3;
                }
            }
            this.DW.Hw(i + 1);
            this.DW.FH(0);
            long time = 3600000 + this.Hw.FH().getNotBefore().getTime();
            Manifest manifestJ6 = j6(map);
            if (this.j6) {
                a10Var.j6();
                if (!this.j6 || str == null) {
                    return;
                }
                try {
                    new File(str).delete();
                    return;
                } catch (Throwable th4) {
                    VH().v5(th4.getClass().getName() + ":" + th4.getMessage());
                    return;
                }
            }
            v00 v00Var2 = new v00("META-INF/MANIFEST.MF");
            v00Var2.rN(time);
            manifestJ6.write(v00Var2.J0());
            a10Var.Hw(v00Var2);
            s00 s00Var = new s00();
            s00Var.j6(this.Hw.DW());
            v00 v00Var3 = new v00("META-INF/CERT.SF");
            v00Var3.rN(time);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Zo(manifestJ6, byteArrayOutputStream);
            if (this.j6) {
                a10Var.j6();
                if (!this.j6 || str == null) {
                    return;
                }
                try {
                    new File(str).delete();
                    return;
                } catch (Throwable th5) {
                    VH().v5(th5.getClass().getName() + ":" + th5.getMessage());
                    return;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (zJ6) {
                VH().Hw("Signature File: \n" + new String(byteArray) + "\n" + m00.j6(byteArray));
            }
            v00Var3.J0().write(byteArray);
            a10Var.Hw(v00Var3);
            s00Var.FH(byteArray);
            byte[] bArrDW = s00Var.DW();
            if (zJ6) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(byteArray);
                byte[] bArrDigest = messageDigest.digest();
                VH().Hw("Sig File SHA1: \n" + m00.j6(bArrDigest));
                VH().Hw("Signature: \n" + m00.j6(bArrDW));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, this.Hw.FH());
                byte[] bArrDoFinal = cipher.doFinal(bArrDW);
                VH().Hw("Signature Decrypted: \n" + m00.j6(bArrDoFinal));
            }
            this.DW.DW(0, "Generating signature block file");
            v00 v00Var4 = new v00("META-INF/CERT.RSA");
            v00Var4.rN(time);
            XL(this.Hw.Hw(), bArrDW, this.Hw.FH(), v00Var4.J0());
            a10Var.Hw(v00Var4);
            if (this.j6) {
                a10Var.j6();
                if (!this.j6 || str == null) {
                    return;
                }
                try {
                    new File(str).delete();
                    return;
                } catch (Throwable th6) {
                    VH().v5(th6.getClass().getName() + ":" + th6.getMessage());
                    return;
                }
            }
            Hw(manifestJ6, map, a10Var, time);
            if (this.j6) {
                a10Var.j6();
                if (!this.j6 || str == null) {
                    return;
                }
                try {
                    new File(str).delete();
                    return;
                } catch (Throwable th7) {
                    VH().v5(th7.getClass().getName() + ":" + th7.getMessage());
                    return;
                }
            }
            a10Var.j6();
            if (!this.j6 || str == null) {
                return;
            }
            try {
                new File(str).delete();
            } catch (Throwable th8) {
                VH().v5(th8.getClass().getName() + ":" + th8.getMessage());
            }
        } catch (Throwable th9) {
            th = th9;
            a10Var2 = a10Var;
            a10Var2.j6();
            if (!this.j6 || str == null) {
                throw th;
            }
            try {
                new File(str).delete();
                throw th;
            } catch (Throwable th10) {
                VH().v5(th10.getClass().getName() + ":" + th10.getMessage());
                throw th;
            }
        }
    }

    public void Ws(String str, String str2) throws Throwable {
        if (new File(str).getCanonicalFile().equals(new File(str2).getCanonicalFile())) {
            throw new IllegalArgumentException("Input and output files are the same.  Specify a different name for the output.");
        }
        this.DW.j6();
        this.DW.DW(1, "Parsing the input's central directory");
        QX(y00.v5(str).DW(), new FileOutputStream(str2), str2);
    }

    public void gn(String str) {
        o00 o00Var = this.FH.get(str);
        this.Hw = o00Var;
        if (o00Var != null) {
            return;
        }
        o00 o00Var2 = new o00();
        this.Hw = o00Var2;
        o00Var2.v5(str);
        this.FH.put(str, this.Hw);
        if ("none".equals(str)) {
            return;
        }
        this.DW.DW(1, "Loading certificate and private key");
        this.Hw.Zo(EQ(t00.class.getResource("/keys/" + str + ".pk8"), null));
        this.Hw.VH(we(t00.class.getResource("/keys/" + str + ".x509.pem")));
        URL resource = t00.class.getResource("/keys/" + str + ".sbt");
        if (resource != null) {
            this.Hw.gn(tp(resource));
        }
    }

    public byte[] tp(URL url) {
        return u7(url.openStream());
    }

    public byte[] u7(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        int i = inputStream.read(bArr);
        while (i != -1) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public X509Certificate we(URL url) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(inputStreamOpenStream);
        } finally {
            inputStreamOpenStream.close();
        }
    }
}
