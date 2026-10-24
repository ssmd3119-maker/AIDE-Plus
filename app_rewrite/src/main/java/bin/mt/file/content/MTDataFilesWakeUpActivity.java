package bin.mt.file.content;

import android.app.Activity;
import android.os.Bundle;

/**
 * Started by MT Manager to wake the app process before it opens
 * {@link MTDataFilesProvider}; finishes right away.
 */
public class MTDataFilesWakeUpActivity extends Activity {

    @Override
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
    }
}
