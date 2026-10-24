package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/** Hidden framework API, compile-time stub. */
public interface IPackageManager extends IInterface {

    IPackageInstaller getPackageInstaller() throws RemoteException;

    abstract class Stub extends android.os.Binder implements IPackageManager {

        public static IPackageManager asInterface(IBinder binder) {
            throw new UnsupportedOperationException();
        }
    }
}
