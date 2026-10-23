# Desktop build

Builds the AIDE-Plus apk with the Android Gradle Plugin. The `build.gradle`
files next to the sources are read by AIDE on the device and stay as they are;
this build points at the same sources.

```sh
cd gradle-build
echo "sdk.dir=/path/to/android-sdk" > local.properties   # or set ANDROID_HOME
LC_ALL=C.UTF-8 ./gradlew assembleReleaseAidePlus
# -> app_flavor/build/outputs/aide-plus/AIDE-Plus-release.apk
```

Needs JDK 17+, the SDK platform `android-37.0` and build-tools `37.0.0` (Android Gradle Plugin 9.4, Gradle 9.8). Several
jars have Chinese file names, so the JVM needs a UTF-8 locale (`LC_ALL=C.UTF-8`).

What it does beyond a plain Android build:

- **Prebuilt dex.** The AIDE base (`AIDE+底包-2.2.jar`) and the other jars that
  hold `classes.dex` are appended to the apk after the compiled sources, in the
  order listed in `app_flavor/build.gradle`. Sources replace base classes by
  having the same name, so the apk's own dex must come first. The apk is then
  zipaligned and signed again (`assemble<Variant>AidePlus`).
- **Fixed resource ids.** The base dex has resource ids inlined, so the ids in
  `appAideBase/src/main/res/values/public.xml` are passed to aapt2 as stable ids.
- **Compile stubs.** The `*-api.jar` stubs have broken `InnerClasses` entries
  and mark accessors as synthetic, which javac rejects; `FixInnerClassesTask`
  (in `buildSrc`) writes corrected copies used only for compiling.
- **Runtime jars.** `assets/`, `lib/` and the remaining java resources of
  `resource.jar` and `aide-rewrite-resource.jar` are packaged as assets, native
  libraries and java resources.
