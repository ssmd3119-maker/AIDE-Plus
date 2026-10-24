package android.support.v4.content;

// AIDE layouts and the manifest still use the old support library names; these
// map them to AndroidX.
public class FileProvider extends androidx.core.content.FileProvider {
    public FileProvider() {
        super();
    }
}
