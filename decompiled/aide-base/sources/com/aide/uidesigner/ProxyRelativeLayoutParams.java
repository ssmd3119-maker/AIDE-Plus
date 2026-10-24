package com.aide.uidesigner;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.widget.RelativeLayout;

@cy(clazz = -389194419645797985L, container = -389194419645797985L, user = true)
/* loaded from: classes.dex */
public class ProxyRelativeLayoutParams {

    @fy
    private static /* synthetic */ boolean $ON_ENTER_TOGGLE;

    @gy
    private static /* synthetic */ boolean $ON_THROW_TOGGLE;

    @dy(field = 2354254769533777571L)
    private RelativeLayout.LayoutParams params;

    static {
        iy.Zo(ProxyRelativeLayoutParams.class);
    }

    @ey(method = -47251278322976675L)
    public ProxyRelativeLayoutParams(Object obj) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(2954636932345957632L, null, obj);
            }
            this.params = (RelativeLayout.LayoutParams) obj;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2954636932345957632L, null, obj);
            }
            throw th;
        }
    }

    @ey(method = 763130719244240000L)
    public void setAbove(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(351313704835149179L, this, i);
            }
            this.params.addRule(2, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 351313704835149179L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3036171972666401205L)
    public void setAlignBaseline(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-4035279434312668752L, this, i);
            }
            this.params.addRule(4, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -4035279434312668752L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2000698893625856511L)
    public void setAlignBottom(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-1932823365356494600L, this, i);
            }
            this.params.addRule(8, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1932823365356494600L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2393691852936940737L)
    public void setAlignEnd(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(2570169126489297984L, this, i);
            }
            this.params.addRule(19, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2570169126489297984L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -413465718969860625L)
    public void setAlignLeft(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-2372962782707906524L, this, i);
            }
            this.params.addRule(5, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -2372962782707906524L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 8507620012168327335L)
    public void setAlignParentBottom(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(2969576307459771904L, this, z);
            }
            if (z) {
                this.params.addRule(12);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2969576307459771904L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -999579868225595131L)
    public void setAlignParentEnd(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(3172574055961403604L, this, z);
            }
            if (z) {
                this.params.addRule(21);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 3172574055961403604L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3400817018982328001L)
    public void setAlignParentLeft(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(3586729133284682840L, this, z);
            }
            if (z) {
                this.params.addRule(9);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 3586729133284682840L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 6277472258261692312L)
    public void setAlignParentRight(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(842196217786340003L, this, z);
            }
            if (z) {
                this.params.addRule(11);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 842196217786340003L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4035173749082707296L)
    public void setAlignParentStart(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(-1359012129573390911L, this, z);
            }
            if (z) {
                this.params.addRule(20);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1359012129573390911L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 5227326988205109147L)
    public void setAlignParentTop(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(-3738004472086642800L, this, z);
            }
            if (z) {
                this.params.addRule(10);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -3738004472086642800L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -85087209289876496L)
    public void setAlignRight(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(3167475234302662125L, this, i);
            }
            this.params.addRule(7, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 3167475234302662125L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1246819454355443560L)
    public void setAlignStart(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(2114645965581280235L, this, i);
            }
            this.params.addRule(18, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2114645965581280235L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 212887602170876685L)
    public void setAlignTop(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-200161507569705676L, this, i);
            }
            this.params.addRule(6, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -200161507569705676L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 327732970398329168L)
    public void setBelow(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-9587429901181501L, this, i);
            }
            this.params.addRule(3, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -9587429901181501L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4177415802098788920L)
    public void setCenterHorizontal(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(-1326466154422937945L, this, z);
            }
            if (z) {
                this.params.addRule(14);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1326466154422937945L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -1310804314147600733L)
    public void setCenterInParent(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(2915411688807723560L, this, z);
            }
            if (z) {
                this.params.addRule(13);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 2915411688807723560L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -6702306314011621888L)
    public void setCenterVertical(boolean z) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.Ws(-2205803525017509359L, this, z);
            }
            if (z) {
                this.params.addRule(15);
            }
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -2205803525017509359L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -899549948307550717L)
    public void setEndOf(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(730128286533663744L, this, i);
            }
            this.params.addRule(17, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 730128286533663744L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 19419956921205585L)
    public void setLeftOf(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-1215017786158701280L, this, i);
            }
            this.params.addRule(0, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1215017786158701280L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 141723279217250420L)
    public void setRightOf(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-682603269297202665L, this, i);
            }
            this.params.addRule(1, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -682603269297202665L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 376049632883681016L)
    public void setStartOf(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-491966975264983855L, this, i);
            }
            this.params.addRule(16, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -491966975264983855L, this, new Integer(i));
            }
            throw th;
        }
    }
}
