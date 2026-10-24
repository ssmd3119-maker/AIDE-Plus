# AIDE-Plus

AIDE-Plus is a modified build of AIDE, the Android IDE that runs on the
phone. This repository is a standard Gradle project (Android Gradle Plugin
8.3.0, Gradle 8.6):

| Module | What it is |
|---|---|
| `app_flavor` | The app (`io.github.zeroaicy.aide`): manifest, signing keys |
| `app_rewrite` | AIDE+ sources: classes that replace or extend AIDE's, new UI |
| `appAideBase` | AIDE's resources and the prebuilt AIDE code (`runtime/`, `provider/`) |
| `stubs` | Compile-time stubs: hidden framework APIs and the ClassReader API (not packaged) |
| `buildSrc` | Build tasks: compile stubs fix-up, dex append and signing |
| `decompiled` | Read-only decompiled source of the prebuilt AIDE code (not built) |

## Build

```sh
echo "sdk.dir=/path/to/android-sdk" > local.properties   # or set ANDROID_HOME
LC_ALL=C.UTF-8 ./gradlew assembleReleaseAidePlus
# -> app_flavor/build/outputs/aide-plus/AIDE-Plus-release.apk
```

Needs JDK 17+, the SDK platform `android-34` and build-tools `34.0.0`.
Several jars have Chinese file names, so on a desktop the JVM needs a UTF-8
locale (`LC_ALL=C.UTF-8`).

Use `assembleReleaseAidePlus` or `assembleDebugAidePlus`. The plain
`assembleRelease` apk lacks the AIDE base dex and does not run.

## In an Android IDE app (AndroidIDE and similar)

Open the repository folder as the project and run the
`assembleReleaseAidePlus` task. Aligning and signing happen inside Gradle
(apksig), so no `zipalign` or `apksigner` binaries are needed.

## How the build works

- **Prebuilt dex.** The AIDE base (`AIDE+底包-2.2.jar`) and the other jars that
  hold `classes.dex` are appended to the apk after the compiled sources, in the
  order listed in `app_flavor/build.gradle`. Sources replace base classes by
  having the same name, so the apk's own dex must come first. The apk is then
  aligned and signed again in-process (`assemble<Variant>AidePlus`).
- **Fixed resource ids.** The base dex has resource ids inlined, so the ids in
  `appAideBase/src/main/res/values/public.xml` are passed to aapt2 as stable ids.
- **Compile stubs.** The `*-api.jar` stubs have broken `InnerClasses` entries
  and mark accessors as synthetic, which javac rejects; `FixInnerClassesTask`
  (in `buildSrc`) writes corrected copies used only for compiling.
- **Runtime jars.** `assets/`, `lib/` and the remaining java resources of
  `resource.jar` and `aide-rewrite-resource.jar` are packaged as assets, native
  libraries and java resources.
