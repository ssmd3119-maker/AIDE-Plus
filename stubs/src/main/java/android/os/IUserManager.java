package android.os;

import android.content.pm.UserInfo;
import java.util.List;

/** Hidden framework API, compile-time stub. */
public interface IUserManager extends IInterface {

    boolean isUserUnlocked(int userId) throws RemoteException;

    List<UserInfo> getUsers(boolean excludeDying) throws RemoteException;

    List<UserInfo> getUsers(boolean excludePartial, boolean excludeDying, boolean excludePreCreated) throws RemoteException;

    abstract class Stub extends android.os.Binder implements IUserManager {

        public static IUserManager asInterface(IBinder binder) {
            throw new RuntimeException("STUB");
        }
    }
}
