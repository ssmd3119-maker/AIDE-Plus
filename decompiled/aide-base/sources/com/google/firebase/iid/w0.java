package com.google.firebase.iid;

import abcd.pv;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* loaded from: classes.dex */
public final class w0 {
    w0() {
    }

    private static x0 DW(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzaw.VH(str, "|P|"), null);
        String string2 = sharedPreferences.getString(zzaw.VH(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new x0(J8(string, string2), tp(sharedPreferences, str));
    }

    private final x0 FH(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                channel.lock(0L, Long.MAX_VALUE, true);
                x0 x0VarHw = Hw(channel);
                if (channel != null) {
                    u7(null, channel);
                }
                VH(null, fileInputStream);
                return x0VarHw;
            } finally {
            }
        } finally {
        }
    }

    private static x0 Hw(FileChannel fileChannel) throws d, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new d("Invalid properties file");
        }
        try {
            return new x0(J8(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new d(e);
        }
    }

    private static KeyPair J8(String str, String str2) throws d, NoSuchAlgorithmException {
        try {
            byte[] bArrDecode = Base64.decode(str, 8);
            byte[] bArrDecode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrDecode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new d(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new d(e2);
        }
    }

    private final x0 QX(Context context, String str) throws d {
        File fileXL = XL(context, str);
        if (!fileXL.exists()) {
            return null;
        }
        try {
            return FH(fileXL);
        } catch (d | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return FH(fileXL);
            } catch (IOException e2) {
                String strValueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(strValueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new d(e2);
            }
        }
    }

    private static /* synthetic */ void VH(Throwable th, FileInputStream fileInputStream) throws IOException {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            pv.DW(th, th2);
        }
    }

    private final x0 Ws(Context context, String str) throws d, IOException {
        x0 x0VarQX;
        try {
            x0VarQX = QX(context, str);
        } catch (d e) {
            e = e;
        }
        if (x0VarQX != null) {
            Zo(context, str, x0VarQX);
            return x0VarQX;
        }
        e = null;
        try {
            x0 x0VarDW = DW(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (x0VarDW != null) {
                j6(context, str, x0VarDW, false);
                return x0VarDW;
            }
        } catch (d e2) {
            e = e2;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    private static File XL(Context context, String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            string = "com.google.InstanceId.properties";
        } else {
            try {
                String strEncodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(strEncodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(strEncodeToString);
                sb.append(".properties");
                string = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(we(context), string);
    }

    private final void Zo(Context context, String str, x0 x0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (x0Var.equals(DW(sharedPreferences, str))) {
                return;
            }
        } catch (d unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(zzaw.VH(str, "|P|"), x0Var.v5());
        editorEdit.putString(zzaw.VH(str, "|K|"), x0Var.Zo());
        editorEdit.putString(zzaw.VH(str, "cre"), String.valueOf(x0Var.DW));
        editorEdit.commit();
    }

    private static /* synthetic */ void gn(Throwable th, RandomAccessFile randomAccessFile) throws IOException {
        if (th == null) {
            randomAccessFile.close();
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th2) {
            pv.DW(th, th2);
        }
    }

    private final x0 j6(Context context, String str, x0 x0Var, boolean z) throws IOException {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to properties file");
        }
        Properties properties = new Properties();
        properties.setProperty("pub", x0Var.v5());
        properties.setProperty("pri", x0Var.Zo());
        properties.setProperty("cre", String.valueOf(x0Var.DW));
        File fileXL = XL(context, str);
        try {
            fileXL.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileXL, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0L);
                            x0 x0VarHw = Hw(channel);
                            if (channel != null) {
                                u7(null, channel);
                            }
                            gn(null, randomAccessFile);
                            return x0VarHw;
                        } catch (d | IOException e) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String strValueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 64);
                                sb.append("Tried reading key pair before writing new one, but failed with: ");
                                sb.append(strValueOf);
                                Log.d("FirebaseInstanceId", sb.toString());
                            }
                        }
                    }
                    channel.position(0L);
                    properties.store(Channels.newOutputStream(channel), (String) null);
                    if (channel != null) {
                        u7(null, channel);
                    }
                    gn(null, randomAccessFile);
                    return x0Var;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            String strValueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(strValueOf2);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    private static long tp(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzaw.VH(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private static /* synthetic */ void u7(Throwable th, FileChannel fileChannel) {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            pv.DW(th, th2);
        }
    }

    static void v5(Context context) {
        for (File file : we(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private static File we(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    final x0 EQ(Context context, String str) throws d, IOException {
        x0 x0VarWs = Ws(context, str);
        return x0VarWs != null ? x0VarWs : J0(context, str);
    }

    final x0 J0(Context context, String str) throws IOException {
        x0 x0Var = new x0(c.j6(), System.currentTimeMillis());
        x0 x0VarJ6 = j6(context, str, x0Var, true);
        if (x0VarJ6 != null && !x0VarJ6.equals(x0Var)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return x0VarJ6;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }
        Zo(context, str, x0Var);
        return x0Var;
    }
}
