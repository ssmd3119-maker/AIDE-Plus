package android.content;

import android.os.Bundle;
import android.os.RemoteException;

/** Hidden framework API, compile-time stub. */
public interface IIntentReceiver {

    void performReceive(Intent intent, int resultCode, String data, Bundle extras,
                        boolean ordered, boolean sticky, int sendingUser) throws RemoteException;

    abstract class Stub extends android.os.Binder implements IIntentReceiver {
    }
}
