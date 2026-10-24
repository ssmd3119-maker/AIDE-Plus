package androidx.core.app;

import android.os.Bundle;
import androidx.loader.content.Loader;

/* loaded from: classes.dex */
public abstract class t {

    public interface a<D> {
        Loader<D> DW(int i, Bundle bundle);

        void FH(Loader<D> loader, D d);

        void j6(Loader<D> loader);
    }
}
