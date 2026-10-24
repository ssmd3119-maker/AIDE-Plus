# Decompiled AIDE base

Java source of `appAideBase/runtime/AIDE+底包-2.2.jar` (the prebuilt AIDE
code), decompiled with jadx 1.5.3 from its `classes.dex`. **For reading
only: it is not part of the build.** The app is still built from the
prebuilt dex, because decompiled code of an obfuscated app does not
compile as is.

- Names are kept as obfuscated in the dex (`abcd/*`, methods like `j6`, `DW`),
  so they match the names the AIDE+ sources and stack traces use.
- 8433 classes in 5508 files (inner classes are inside their outer class).
- jadx could not decompile 37 methods and marked code in 264 files as
  possibly wrong (look for `JADX WARN` / `Code decompiled incorrectly`); see the
  list at the end.
- This is AIDE's proprietary code; keep that in mind before publishing it.

## Classes replaced at runtime

These classes exist here, but the app loads a newer version first, so the
code here for them does not run:

| Class | Replaced by |
|---|---|
| `abcd.be` | app_rewrite sources |
| `abcd.iy` | app_rewrite sources |
| `abcd.l8` | 底包修改增量包2.2.jar |
| `abcd.mf` | 底包修改增量包2.2.jar |
| `abcd.v9` | 底包修改增量包2.2.jar |
| `abcd.zb` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.api.ClassType` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.language.aidl.AidlCodeModel` | app_rewrite sources |
| `com.aide.codemodel.language.classfile.ClassFilePreProcessor` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.language.classfile.JavaBinaryCodeModel` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.language.java.JavaCodeAnalyzer$a` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.language.java.JavaCodeAnalyzer$a$a` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.language.java.JavaCompiler` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.language.java.JavaSignatureAnalyzer$a` | 底包修改增量包2.2.jar |
| `com.aide.codemodel.language.xml.XmlCodeModel` | 底包修改增量包2.2.jar |
| `com.aide.common.AppLog` | app_rewrite sources |
| `com.aide.common.KeyStrokeDetector$a` | app_rewrite sources |
| `com.aide.common.MessageBox` | 底包修改增量包2.2.jar |
| `com.aide.engine.Engine$c` | 底包修改增量包2.2.jar |
| `com.aide.engine.EngineSolutionProject` | app_rewrite sources |
| `com.aide.engine.EngineSolutionProject$a` | app_rewrite sources |
| `com.aide.engine.SyntaxStyleType` | app_rewrite sources |
| `com.aide.engine.service.CodeAnalysisEngineService` | 底包修改增量包2.2.jar |
| `com.aide.engine.service.CodeAnalysisEngineService$a` | app_rewrite sources |
| `com.aide.engine.service.CodeAnalysisEngineService$c` | app_rewrite sources |
| `com.aide.engine.service.CodeModelFactory` | app_rewrite sources |
| `com.aide.engine.service.Native` | 底包修改增量包2.2.jar |
| `com.aide.ui.AIDEApplication` | app_rewrite sources |
| `com.aide.ui.AIDEEditor` | 底包修改增量包2.2.jar |
| `com.aide.ui.AIDEEditor$t` | 底包修改增量包2.2.jar |
| `com.aide.ui.AppCommands` | app_rewrite sources |
| `com.aide.ui.MainActivity` | 底包修改增量包2.2.jar |
| `com.aide.ui.ServiceContainer` | 底包修改增量包2.2.jar |
| `com.aide.ui.ThemedActionbarActivity` | app_rewrite sources |
| `com.aide.ui.build.BuildServiceCollect` | app_rewrite sources |
| `com.aide.ui.build.OutputConsoleActivity` | 底包修改增量包2.2.jar |
| `com.aide.ui.build.android.AaptService` | app_rewrite sources |
| `com.aide.ui.build.android.AaptService$a` | app_rewrite sources |
| `com.aide.ui.build.android.AaptService$b` | app_rewrite sources |
| `com.aide.ui.build.android.AaptService$c` | app_rewrite sources |
| `com.aide.ui.build.android.AaptService$d` | app_rewrite sources |
| `com.aide.ui.build.android.AndroidProjectBuildService` | 修改增量[临时]-2.2.jar |
| `com.aide.ui.build.android.SigningService` | app_rewrite sources |
| `com.aide.ui.build.android.a` | app_rewrite sources |
| `com.aide.ui.build.android.a$a` | app_rewrite sources |
| `com.aide.ui.build.android.a$b` | app_rewrite sources |
| `com.aide.ui.build.android.a$c` | app_rewrite sources |
| `com.aide.ui.build.android.n` | 底包修改增量包2.2.jar |
| `com.aide.ui.build.d` | 底包修改增量包2.2.jar |
| `com.aide.ui.build.packagingservice.ExternalPackagingService` | 底包修改增量包2.2.jar |
| `com.aide.ui.build.packagingservice.ExternalPackagingService$ExternalPackagingServiceWorker` | 底包修改增量包2.2.jar |
| `com.aide.ui.build.packagingservice.ExternalPackagingService$ExternalPackagingServiceWorker$Task` | 底包修改增量包2.2.jar |
| `com.aide.ui.marketing.a$a` | app_rewrite sources |
| `com.aide.ui.preferences.CompilerPreferencesFragment$c` | app_rewrite sources |
| `com.aide.ui.project.AndroidProjectSupport` | 底包修改增量包2.2.jar |
| `com.aide.ui.project.AndroidProjectSupport$b` | 底包修改增量包2.2.jar |
| `com.aide.ui.project.AndroidProjectSupport$c` | 底包修改增量包2.2.jar |
| `com.aide.ui.project.AndroidProjectSupport$d$a$a` | 底包修改增量包2.2.jar |
| `com.aide.ui.project.internal.GradleTools` | 底包修改增量包2.2.jar |
| `com.aide.ui.project.internal.MakeJavaEngineSolution` | 底包修改增量包2.2.jar |
| `com.aide.ui.services.AssetInstallationService` | app_rewrite sources |
| `com.aide.ui.services.DownloadService$DownloadMavenLibraries` | app_rewrite sources |
| `com.aide.ui.services.ErrorService` | 底包修改增量包2.2.jar |
| `com.aide.ui.services.MavenService` | app_rewrite sources |
| `com.aide.ui.services.ProjectService` | 底包修改增量包2.2.jar |
| `com.aide.ui.services.RunService` | 底包修改增量包2.2.jar |
| `com.aide.ui.trainer.c` | 底包修改增量包2.2.jar |
| `com.aide.ui.trainer.c$a` | 底包修改增量包2.2.jar |
| `com.aide.ui.util.ClassPath$Entry` | 底包修改增量包2.2.jar |
| `com.aide.ui.util.FileSystem` | 底包修改增量包2.2.jar |
| `com.aide.ui.util.PomXml` | app_rewrite sources |
| `com.aide.ui.views.CodeEditText` | 底包修改增量包2.2.jar |
| `com.aide.ui.views.CodeEditText$CodeEditTextHighlightingModel` | 底包修改增量包2.2.jar |
| `com.aide.ui.views.editor.EditorModel$a` | 底包修改增量包2.2.jar |
| `com.aide.ui.views.editor.Font` | 底包修改增量包2.2.jar |
| `com.aide.ui.views.editor.Graphics` | 底包修改增量包2.2.jar |
| `com.aide.ui.views.editor.OConsole` | 底包修改增量包2.2.jar |
| `com.aide.uidesigner.j` | 底包修改增量包2.2.jar |
| `com.google.firebase.analytics.FirebaseAnalytics` | app_rewrite sources |

## Biggest packages

| Package | Classes |
|---|---|
| `com.google` | 3107 |
| `com.aide` | 1511 |
| `org.codehaus` | 489 |
| `androidx.core` | 219 |
| `com.jcraft` | 147 |
| `android.support` | 117 |
| `tv.ouya` | 47 |
| `groovyjarjarantlr.debug` | 44 |
| `androidx.media` | 31 |
| `androidx.fragment` | 29 |
| `com.android` | 28 |
| `androidx.viewpager` | 24 |
| `androidx.browser` | 17 |
| `groovyjarjarantlr.collections` | 16 |
| `androidx.lifecycle` | 15 |

## Files with incorrectly decompiled code

- `abcd/ei.java`
- `abcd/f0.java`
- `abcd/fs.java`
- `abcd/g0.java`
- `abcd/gh0.java`
- `abcd/gi.java`
- `abcd/h0.java`
- `abcd/h10.java`
- `abcd/i0.java`
- `abcd/ih0.java`
- `abcd/ii.java`
- `abcd/iz.java`
- `abcd/j0.java`
- `abcd/j30.java`
- `abcd/jf0.java`
- `abcd/jg0.java`
- `abcd/jr.java`
- `abcd/ka0.java`
- `abcd/kg0.java`
- `abcd/m0.java`
- `abcd/m4.java`
- `abcd/mo.java`
- `abcd/n7.java`
- `abcd/nr.java`
- `abcd/o0.java`
- `abcd/o6.java`
- `abcd/p0.java`
- `abcd/p6.java`
- `abcd/py.java`
- `abcd/q60.java`
- `abcd/qe0.java`
- `abcd/qp.java`
- `abcd/qy.java`
- `abcd/qz.java`
- `abcd/r6.java`
- `abcd/rh.java`
- `abcd/rx.java`
- `abcd/s0.java`
- `abcd/sy.java`
- `abcd/t0.java`
- `abcd/t6.java`
- `abcd/ta0.java`
- `abcd/tx.java`
- `abcd/ux.java`
- `abcd/ve0.java`
- `abcd/vf.java`
- `abcd/vo.java`
- `abcd/vp.java`
- `abcd/vx.java`
- `abcd/w0.java`
- `abcd/wa0.java`
- `abcd/wx.java`
- `abcd/x5.java`
- `abcd/xe.java`
- `abcd/y5.java`
- `abcd/y6.java`
- `abcd/y7.java`
- `abcd/yh.java`
- `abcd/ym0.java`
- `abcd/yr.java`
- `abcd/z6.java`
- `androidx/core/app/d.java`
- `androidx/core/app/m.java`
- `androidx/core/app/q.java`
- `androidx/core/widget/NestedScrollView.java`
- `androidx/core/widget/d.java`
- `androidx/drawerlayout/widget/DrawerLayout.java`
- `androidx/slidingpanelayout/widget/SlidingPaneLayout.java`
- `androidx/swiperefreshlayout/widget/SwipeRefreshLayout.java`
- `androidx/viewpager/widget/ViewPager.java`
- `com/aide/codemodel/api/ClassType.java`
- `com/aide/codemodel/api/EntitySpace.java`
- `com/aide/codemodel/api/IdentifierSpace.java`
- `com/aide/codemodel/api/LexerHelper.java`
- `com/aide/codemodel/api/Member.java`
- `com/aide/codemodel/api/ParameterizedType.java`
- `com/aide/codemodel/api/SyntaxTree.java`
- `com/aide/codemodel/api/SyntaxTreeSpace.java`
- `com/aide/codemodel/api/collections/MapOfIntArrayInt.java`
- `com/aide/codemodel/language/classfile/ClassFilePreProcessor.java`
- `com/aide/codemodel/language/cpp/CppLexer.java`
- `com/aide/codemodel/language/css/CssLexer.java`
- `com/aide/codemodel/language/css/CssSyntax.java`
- `com/aide/codemodel/language/dtd/DtdLexer.java`
- `com/aide/codemodel/language/dtd/DtdParser.java`
- `com/aide/codemodel/language/dtd/DtdSyntax.java`
- `com/aide/codemodel/language/java/JSharpCommentsSyntax.java`
- `com/aide/codemodel/language/java/JavaCodeAnalyzer.java`
- `com/aide/codemodel/language/java/JavaCodeRenderer.java`
- `com/aide/codemodel/language/java/JavaCompiler.java`
- `com/aide/codemodel/language/java/JavaParser.java`
- `com/aide/codemodel/language/java/JavaSignatureAnalyzer.java`
- `com/aide/codemodel/language/java/JavaTools.java`
- `com/aide/codemodel/language/java/JavaTypeSystem.java`
- `com/aide/codemodel/language/js/JavaScriptCommentsSyntax.java`
- `com/aide/codemodel/language/js/JavaScriptParser.java`
- `com/aide/codemodel/language/js/JavaScriptSignatureAnalyzer.java`
- `com/aide/codemodel/language/xml/XmlLexer.java`
- `com/aide/codemodel/language/xml/XmlParser.java`
- `com/aide/codemodel/language/xml/XmlSyntax.java`
- `com/aide/common/KeyStrokeDetector.java`
- `com/aide/engine/Engine.java`
- `com/aide/licensing/a.java`
- `com/aide/licensing/c.java`
- `com/aide/ui/AIDEEditor.java`
- `com/aide/ui/LogCatConsole.java`
- `com/aide/ui/build/OutputConsole.java`
- `com/aide/ui/build/android/AaptService.java`
- `com/aide/ui/build/android/SigningService.java`
- `com/aide/ui/build/android/a.java`
- `com/aide/ui/build/android/d.java`
- `com/aide/ui/build/nativeexecutable/NativeProjectBuildService.java`
- `com/aide/ui/build/packagingservice/ExternalPackagingService.java`
- `com/aide/ui/build/packagingservice/IExternalPackagingService.java`
- `com/aide/ui/project/internal/MakeAndroidEngineSolution.java`
- `com/aide/ui/scm/ExternalGitService.java`
- `com/aide/ui/scm/a.java`
- `com/aide/ui/services/DownloadService.java`
- `com/aide/ui/services/DropboxService.java`
- `com/aide/ui/services/ErrorService.java`
- `com/aide/ui/services/MavenService.java`
- `com/aide/ui/services/OpenFileService.java`
- `com/aide/ui/views/editor/EditorModel.java`
- `com/aide/ui/views/editor/OConsole.java`
- `com/aide/ui/views/editor/v.java`
- `com/aide/uidesigner/XmlLayoutDesignActivity.java`
- `com/dropbox/client2/android/AuthActivity.java`
- `com/google/android/gms/ads/internal/ClientApi.java`
- `com/google/android/gms/ads/internal/c0.java`
- `com/google/android/gms/ads/internal/e.java`
- `com/google/android/gms/ads/internal/gmsg/HttpClient.java`
- `com/google/android/gms/ads/internal/gmsg/d.java`
- `com/google/android/gms/ads/internal/m1.java`
- `com/google/android/gms/ads/internal/overlay/c.java`
- `com/google/android/gms/ads/internal/u1.java`
- `com/google/android/gms/ads/internal/z0.java`
- `com/google/android/gms/auth/api/signin/GoogleSignInOptions.java`
- `com/google/android/gms/dynamite/DynamiteModule.java`
- `com/google/android/gms/internal/ads/aj0.java`
- `com/google/android/gms/internal/ads/b8.java`
- `com/google/android/gms/internal/ads/bj0.java`
- `com/google/android/gms/internal/ads/bn.java`
- `com/google/android/gms/internal/ads/c70.java`
- `com/google/android/gms/internal/ads/ci0.java`
- `com/google/android/gms/internal/ads/d70.java`
- `com/google/android/gms/internal/ads/db0.java`
- `com/google/android/gms/internal/ads/dg.java`
- `com/google/android/gms/internal/ads/dv.java`
- `com/google/android/gms/internal/ads/eb0.java`
- `com/google/android/gms/internal/ads/en0.java`
- `com/google/android/gms/internal/ads/eo0.java`
- `com/google/android/gms/internal/ads/f70.java`
- `com/google/android/gms/internal/ads/fb0.java`
- `com/google/android/gms/internal/ads/fu.java`
- `com/google/android/gms/internal/ads/g1.java`
- `com/google/android/gms/internal/ads/gf0.java`
- `com/google/android/gms/internal/ads/gj0.java`
- `com/google/android/gms/internal/ads/h50.java`
- `com/google/android/gms/internal/ads/ha.java`
- `com/google/android/gms/internal/ads/hb0.java`
- `com/google/android/gms/internal/ads/ib0.java`
- `com/google/android/gms/internal/ads/in0.java`
- `com/google/android/gms/internal/ads/jb0.java`
- `com/google/android/gms/internal/ads/jc.java`
- `com/google/android/gms/internal/ads/jl0.java`
- `com/google/android/gms/internal/ads/jq.java`
- `com/google/android/gms/internal/ads/kb0.java`
- `com/google/android/gms/internal/ads/lb0.java`
- `com/google/android/gms/internal/ads/lg0.java`
- `com/google/android/gms/internal/ads/li.java`
- `com/google/android/gms/internal/ads/lm0.java`
- `com/google/android/gms/internal/ads/ls0.java`
- `com/google/android/gms/internal/ads/mb0.java`
- `com/google/android/gms/internal/ads/nb0.java`
- `com/google/android/gms/internal/ads/ni0.java`
- `com/google/android/gms/internal/ads/nu.java`
- `com/google/android/gms/internal/ads/ob0.java`
- `com/google/android/gms/internal/ads/ol.java`
- `com/google/android/gms/internal/ads/qi.java`
- `com/google/android/gms/internal/ads/qp0.java`
- `com/google/android/gms/internal/ads/qu.java`
- `com/google/android/gms/internal/ads/qw.java`
- `com/google/android/gms/internal/ads/re0.java`
- `com/google/android/gms/internal/ads/ri0.java`
- `com/google/android/gms/internal/ads/rk0.java`
- `com/google/android/gms/internal/ads/rs0.java`
- `com/google/android/gms/internal/ads/sl0.java`
- `com/google/android/gms/internal/ads/sv.java`
- `com/google/android/gms/internal/ads/t20.java`
- `com/google/android/gms/internal/ads/t6.java`
- `com/google/android/gms/internal/ads/t60.java`
- `com/google/android/gms/internal/ads/te.java`
- `com/google/android/gms/internal/ads/th0.java`
- `com/google/android/gms/internal/ads/ti0.java`
- `com/google/android/gms/internal/ads/tu.java`
- `com/google/android/gms/internal/ads/u1.java`
- `com/google/android/gms/internal/ads/u40.java`
- `com/google/android/gms/internal/ads/ui0.java`
- `com/google/android/gms/internal/ads/v40.java`
- `com/google/android/gms/internal/ads/vh.java`
- `com/google/android/gms/internal/ads/wc.java`
- `com/google/android/gms/internal/ads/wc0.java`
- `com/google/android/gms/internal/ads/wf0.java`
- `com/google/android/gms/internal/ads/wh0.java`
- `com/google/android/gms/internal/ads/x80.java`
- `com/google/android/gms/internal/ads/xi.java`
- `com/google/android/gms/internal/ads/xl0.java`
- `com/google/android/gms/internal/ads/xo0.java`
- `com/google/android/gms/internal/ads/zg.java`
- `com/google/android/gms/internal/ads/zk.java`
- `com/google/android/gms/internal/ads/zzazc.java`
- `com/google/android/gms/internal/ads/zzbdx.java`
- `com/google/android/gms/internal/ads/zzwf.java`
- `com/google/android/gms/internal/measurement/f5.java`
- `com/google/android/gms/internal/measurement/h3.java`
- `com/google/android/gms/internal/measurement/h7.java`
- `com/google/android/gms/internal/measurement/i3.java`
- `com/google/android/gms/internal/measurement/m.java`
- `com/google/android/gms/internal/measurement/o5.java`
- `com/google/android/gms/internal/measurement/p5.java`
- `com/google/android/gms/internal/measurement/v3.java`
- `com/google/android/gms/measurement/internal/zzam.java`
- `com/google/android/gms/measurement/internal/zzao.java`
- `com/google/android/gms/measurement/internal/zzba.java`
- `com/google/android/gms/measurement/internal/zzbl.java`
- `com/google/android/gms/measurement/internal/zzda.java`
- `com/google/android/gms/measurement/internal/zzdz.java`
- `com/google/android/gms/measurement/internal/zzeb.java`
- `com/google/android/gms/measurement/internal/zzfo.java`
- `com/google/android/gms/measurement/internal/zzfy.java`
- `com/google/android/gms/measurement/internal/zzm.java`
- `com/google/android/gms/measurement/internal/zzt.java`
- `com/google/firebase/iid/a0.java`
- `com/google/firebase/iid/u.java`
- `com/google/firebase/iid/w.java`
- `com/jcraft/jsch/ChannelSession.java`
- `com/jcraft/jsch/ChannelX11.java`
- `com/jcraft/jsch/DHG1.java`
- `com/jcraft/jsch/DHG14.java`
- `com/jcraft/jsch/DHGEX.java`
- `com/jcraft/jsch/DHGEX256.java`
- `com/jcraft/jsch/KeyPair.java`
- `com/jcraft/jsch/Session.java`
- `com/jcraft/jsch/UserAuthGSSAPIWithMIC.java`
- `com/jcraft/jsch/UserAuthKeyboardInteractive.java`
- `com/jcraft/jsch/UserAuthPassword.java`
- `groovyjarjarantlr/ANTLRLexer.java`
- `groovyjarjarantlr/CSharpCodeGenerator.java`
- `groovyjarjarantlr/JavaCodeGenerator.java`
- `groovyjarjarantlr/PreservingFileWriter.java`
- `groovyjarjarantlr/PythonCodeGenerator.java`
- `groovyjarjarantlr/actions/cpp/ActionLexer.java`
- `groovyjarjarantlr/actions/csharp/ActionLexer.java`
- `groovyjarjarantlr/actions/java/ActionLexer.java`
- `groovyjarjarantlr/actions/python/ActionLexer.java`
- `groovyjarjarantlr/preprocessor/PreprocessorLexer.java`
- `org/codehaus/groovy/antlr/java/JavaLexer.java`
- `org/codehaus/groovy/antlr/parser/GroovyLexer.java`
- `org/codehaus/groovy/antlr/parser/GroovyRecognizer.java`
- `org/codehaus/groovy/antlr/treewalker/MindMapPrinter.java`
- `org/codehaus/groovy/antlr/treewalker/NodeAsHTMLPrinter.java`
- `org/codehaus/groovy/antlr/treewalker/SourceCodeTraversal.java`
- `org/codehaus/groovy/syntax/Types.java`
- `tv/ouya/console/api/f.java`
