package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/** Hidden framework API, compile-time stub. */
public interface IPackageInstaller extends IInterface {

    void abandonSession(int sessionId) throws RemoteException;

    IPackageInstallerSession openSession(int sessionId) throws RemoteException;

    ParceledListSlice<PackageInstaller.SessionInfo> getMySessions(String installerPackageName, int userId) throws RemoteException;

    abstract class Stub extends android.os.Binder implements IPackageInstaller {

        public static IPackageInstaller asInterface(IBinder binder) {
            throw new UnsupportedOperationException();
        }
    }
}
