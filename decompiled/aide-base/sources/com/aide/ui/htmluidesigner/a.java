package com.aide.ui.htmluidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.webkit.MimeTypeMap;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@cy(clazz = -19640197679648051L, container = -19640197679648051L, user = true)
/* loaded from: classes.dex */
public class a {

    @dy(field = 1066417195150118661L)
    private static a DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 4582627220396324736L)
    private String j6;

    @cy(clazz = -644181270195840616L, container = -19640197679648051L, user = true)
    /* renamed from: com.aide.ui.htmluidesigner.a$a, reason: collision with other inner class name */
    class RunnableC0071a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(RunnableC0071a.class);
        }

        @ey(method = -8846768566602705793L)
        RunnableC0071a() {
        }

        @Override // java.lang.Runnable
        @ey(method = 1834060697066570889L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-4926918669308888064L, this);
                }
                a.this.VH();
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -4926918669308888064L, this);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(a.class);
    }

    @ey(method = 2561545722550228503L)
    private a() {
        try {
            if (FH) {
                iy.gn(2562548938193121181L, null);
            }
            new Thread(new RunnableC0071a()).start();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2562548938193121181L, null);
            }
            throw th;
        }
    }

    @ey(method = -1800482580594057900L)
    private String DW(int i, String str) {
        try {
            if (FH) {
                iy.EQ(77133291289936521L, this, new Integer(i), str);
            }
            String str2 = "HTTP/1.0 ";
            if (i == 200) {
                str2 = "HTTP/1.0 200 OK";
            } else if (i == 400) {
                str2 = "HTTP/1.0 400 Bad Request";
            } else if (i == 403) {
                str2 = "HTTP/1.0 403 Forbidden";
            } else if (i == 404) {
                str2 = "HTTP/1.0 404 Not Found";
            } else if (i == 500) {
                str2 = "HTTP/1.0 500 Internal Server Error";
            } else if (i == 501) {
                str2 = "HTTP/1.0 501 Not Implemented";
            }
            String str3 = ((str2 + "\r\n") + "Connection: close\r\n") + "Server: AIDE\r\n";
            if (str != null) {
                str3 = str3 + "Content-Type: " + FH(str) + "\r\n";
            }
            return str3 + "\r\n";
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 77133291289936521L, this, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = -269024536764346940L)
    private void EQ(DataOutputStream dataOutputStream, FileInputStream fileInputStream) {
        try {
            if (FH) {
                iy.EQ(5990458131926693265L, this, dataOutputStream, fileInputStream);
            }
            byte[] bArr = new byte[2000];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    dataOutputStream.write(bArr, 0, i);
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 5990458131926693265L, this, dataOutputStream, fileInputStream);
            }
            throw th;
        }
    }

    @ey(method = 2872672279052916555L)
    private String FH(String str) {
        try {
            if (FH) {
                iy.tp(2023734416497034560L, this, str);
            }
            String lowerCase = str.substring(str.lastIndexOf(46) + 1, str.length()).toLowerCase();
            String mimeTypeFromExtension = lowerCase.equals("zip") ? "application/x-zip-compressed" : lowerCase.equals("png") ? "image/png" : lowerCase.equals("gif") ? "image/gif" : (lowerCase.equals("jpg") || lowerCase.equals("jpeg")) ? "image/jpeg" : (lowerCase.equals("html") || lowerCase.equals("html")) ? "text/html" : lowerCase.equals("css") ? "text/css" : lowerCase.equals("js") ? "application/javascript" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2023734416497034560L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 5127662770553500965L)
    private String Hw(String str) {
        try {
            if (FH) {
                iy.tp(-1904786558047675840L, this, str);
            }
            String[] strArrSplit = str.split(" ");
            String str2 = strArrSplit.length >= 2 ? strArrSplit[1] : "";
            return str2.equals("/") ? "/index.html" : str2;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1904786558047675840L, this, str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 877908410343769797L)
    public void VH() {
        try {
            if (FH) {
                iy.gn(1900776044922573616L, this);
            }
            try {
                ServerSocket serverSocket = new ServerSocket(8099);
                while (true) {
                    try {
                        Socket socketAccept = serverSocket.accept();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));
                        v5(bufferedReader.readLine(), new DataOutputStream(socketAccept.getOutputStream()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1900776044922573616L, this);
            }
            throw th;
        }
    }

    @ey(method = 1697638672396419225L)
    private FileInputStream Zo(String str) {
        try {
            if (FH) {
                iy.tp(-411981764818408512L, this, str);
            }
            return new FileInputStream(new File(this.j6 + str));
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -411981764818408512L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1368898184748061211L)
    public static void gn(String str) {
        try {
            if (FH) {
                iy.tp(28708304688076860L, null, str);
            }
            if (DW == null) {
                DW = new a();
            }
            DW.u7(str);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 28708304688076860L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 2025503547542336448L)
    private void tp(DataOutputStream dataOutputStream, int i) {
        try {
            if (FH) {
                iy.EQ(1684752792646052243L, this, dataOutputStream, new Integer(i));
            }
            try {
                dataOutputStream.writeBytes(DW(i, null));
                dataOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1684752792646052243L, this, dataOutputStream, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -701177408857385955L)
    private void u7(String str) {
        try {
            if (FH) {
                iy.tp(-32093833494258120L, this, str);
            }
            this.j6 = str;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -32093833494258120L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 2444376474788541984L)
    private void v5(String str, DataOutputStream dataOutputStream) {
        try {
            if (FH) {
                iy.EQ(-1712625036152592851L, this, str, dataOutputStream);
            }
            if (!str.toUpperCase().startsWith("GET") && !str.toUpperCase().startsWith("HEAD")) {
                tp(dataOutputStream, 501);
                return;
            }
            String strHw = Hw(str);
            try {
                FileInputStream fileInputStreamZo = Zo(strHw);
                try {
                    dataOutputStream.writeBytes(DW(200, strHw));
                    if (str.toUpperCase().startsWith("GET")) {
                        if (FH(strHw).equals("text/html")) {
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(dataOutputStream);
                            we(outputStreamWriter, new BufferedReader(new InputStreamReader(fileInputStreamZo)), strHw, new HashSet<>());
                            fileInputStreamZo.close();
                            outputStreamWriter.close();
                        } else {
                            EQ(dataOutputStream, fileInputStreamZo);
                            fileInputStreamZo.close();
                            dataOutputStream.close();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception unused) {
                tp(dataOutputStream, 404);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1712625036152592851L, this, str, dataOutputStream);
            }
            throw th;
        }
    }

    @ey(method = -5460622060013046288L)
    private void we(Writer writer, BufferedReader bufferedReader, String str, Set<String> set) {
        try {
            if (FH) {
                iy.J0(-2043848963788211375L, this, writer, bufferedReader, str, set);
            }
            if (set.contains(str)) {
                return;
            }
            set.add(str);
            Pattern patternCompile = Pattern.compile("^\\s*<!--\\s*#include\\s+file\\s*=\\s*(?:\"|')(.*)(?:\"|')\\s*-->\\s*$");
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    writer.flush();
                    return;
                }
                Matcher matcher = patternCompile.matcher(line);
                if (matcher.matches()) {
                    try {
                        String strGroup = matcher.group(1);
                        if (!strGroup.startsWith("/")) {
                            strGroup = "/" + strGroup;
                        }
                        FileInputStream fileInputStreamZo = Zo(strGroup);
                        we(writer, new BufferedReader(new InputStreamReader(fileInputStreamZo)), strGroup, set);
                        fileInputStreamZo.close();
                    } catch (FileNotFoundException unused) {
                    }
                } else {
                    writer.write(line);
                    writer.write("\n");
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -2043848963788211375L, this, writer, bufferedReader, str, set);
            }
            throw th;
        }
    }
}
