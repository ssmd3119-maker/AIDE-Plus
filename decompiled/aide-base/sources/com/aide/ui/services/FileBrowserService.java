package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.SharedPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.util.FileSystem;

@cy(clazz = -432519071079998591L, container = -432519071079998591L, user = true)
/* loaded from: classes.dex */
public class FileBrowserService {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 3428609892932182536L)
    private String DW;

    @dy(field = 3446297176434115848L)
    private a j6;

    @cy(clazz = -5804181054141825L, container = -5804181054141825L, user = true)
    public interface a {
        @ey(method = 5674359794648731104L)
        void j6();
    }

    static {
        iy.Zo(FileBrowserService.class);
    }

    @ey(method = -1352453362277732085L)
    public FileBrowserService() {
        try {
            if (FH) {
                iy.gn(-1895993439655001127L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1895993439655001127L, null);
            }
            throw th;
        }
    }

    @ey(method = -4546501733452945875L)
    public String DW() {
        try {
            if (FH) {
                iy.gn(-5558985610727753792L, this);
            }
            return FileSystem.vy() + "/AppProjects";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -5558985610727753792L, this);
            }
            throw th;
        }
    }

    @ey(method = 2091367503783075975L)
    public String FH() {
        try {
            if (FH) {
                iy.gn(-6595981980862643108L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -6595981980862643108L, this);
            }
            throw th;
        }
    }

    @ey(method = 2253867723858305928L)
    public void Hw(String str) {
        try {
            if (FH) {
                iy.tp(2003273773264976037L, this, str);
            }
            SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences("FileBrowserService", 0).edit();
            editorEdit.putString("CurrentDir", str);
            editorEdit.commit();
            v5();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2003273773264976037L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6208023418682466549L)
    public void VH(String str) {
        try {
            if (FH) {
                iy.tp(3127321551612427668L, this, str);
            }
            this.DW = str;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3127321551612427668L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -1447908148499707125L)
    public void Zo(a aVar) {
        try {
            if (FH) {
                iy.tp(-157628897145514896L, this, aVar);
            }
            this.j6 = aVar;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -157628897145514896L, this, aVar);
            }
            throw th;
        }
    }

    @ey(method = 1619418613770134825L)
    public String j6() {
        try {
            if (FH) {
                iy.gn(-7124934446534677208L, this);
            }
            String string = ServiceContainer.getContext().getSharedPreferences("FileBrowserService", 0).getString("CurrentDir", null);
            if (string != null && FileSystem.SI(string)) {
                return string;
            }
            String strDW = DW();
            FileSystem.g3(strDW);
            return strDW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -7124934446534677208L, this);
            }
            throw th;
        }
    }

    @ey(method = 910690012032294000L)
    public void v5() {
        try {
            if (FH) {
                iy.gn(-1276208078785599193L, this);
            }
            if (this.j6 != null) {
                this.j6.j6();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1276208078785599193L, this);
            }
            throw th;
        }
    }
}
