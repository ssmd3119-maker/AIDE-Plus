package abcd;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public class e00 {
    public static final UUID j6 = new UUID(0, 0);

    public static String j6(UUID uuid) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        return Base64.encodeToString(byteBufferAllocate.array(), 11);
    }
}
