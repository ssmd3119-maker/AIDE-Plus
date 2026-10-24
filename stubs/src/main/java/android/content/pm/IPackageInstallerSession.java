package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;

/** Hidden framework API, compile-time stub. */
public interface IPackageInstallerSession extends IInterface {

    abstract class Stub extends android.os.Binder implements IPackageInstallerSession {

        public static IPackageInstallerSession asInterface(IBinder binder) {
            throw new UnsupportedOperationException();
        }
    }
}
