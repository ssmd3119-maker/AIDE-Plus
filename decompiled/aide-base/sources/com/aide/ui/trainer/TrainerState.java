package com.aide.ui.trainer;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.SharedPreferences;
import com.aide.common.SerializeHelper;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.trainer.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 3699994366575563265L, container = 3699994366575563265L, user = true)
/* loaded from: classes.dex */
public class TrainerState {

    @fy
    private static /* synthetic */ boolean $ON_ENTER_TOGGLE;

    @gy
    private static /* synthetic */ boolean $ON_THROW_TOGGLE;

    @dy(field = 3725400121590656963L)
    private LessonScores lessonScores;

    @dy(field = 4929086800485510908L)
    private LessonStates lessonStates;

    @dy(field = 1840598410465080812L)
    private String locale;

    @cy(clazz = 1648975424517703620L, container = 1648975424517703620L, user = true)
    private static class LessonScores {

        @fy
        private static /* synthetic */ boolean $ON_ENTER_TOGGLE = false;

        @gy
        private static /* synthetic */ boolean $ON_THROW_TOGGLE = false;

        @dy(field = -6077974498009746488L)
        private static final String FINISHED_SETTING = "Finished";

        @dy(field = 619663359832780288L)
        private static final String PREF_SCORES_SETTINGS_NAME = "TrainerScore2";

        @dy(field = 3277439032393294440L)
        private static final String RESULTS_SETTING = "Results";

        @dy(field = -712134353904699193L)
        private static final String STARTED_SETTING = "Started";

        @dy(field = -5627453227115569899L)
        private List<LessonResult> lessonFinished;

        @dy(field = 2968253976439223985L)
        private Map<String, LessonResult> lessonResults;

        @dy(field = -4123765448684954112L)
        private Set<String> lessonStarted;

        @cy(clazz = -698068871660928057L, container = -698068871660928057L, user = true)
        private static class LessonResult implements Serializable {

            @fy
            private static /* synthetic */ boolean $ON_ENTER_TOGGLE = false;

            @gy
            private static /* synthetic */ boolean $ON_THROW_TOGGLE = false;

            @dy(field = -5973411465937020924L)
            private static final long serialVersionUID = 4523246814857132419L;

            @dy(field = 390745428063445920L)
            public float averageFailures;

            @dy(field = -173531446325992197L)
            public float averageLevel;

            @dy(field = -4936416368452019793L)
            public int exerciseCount;

            @dy(field = -1346076602502835527L)
            public String lessonId;

            @dy(field = -2649786231160953175L)
            public Date time;

            static {
                iy.Zo(LessonResult.class);
            }

            @ey(method = -298272928405416963L)
            public LessonResult(String str, Date date, float f, float f2, int i) {
                try {
                    if ($ON_ENTER_TOGGLE) {
                        iy.J8(-1865966291367737228L, null, str, date, new Float(f), new Float(f2), new Integer(i));
                    }
                    this.lessonId = str;
                    this.time = date;
                    this.averageFailures = f;
                    this.averageLevel = f2;
                    this.exerciseCount = i;
                } catch (Throwable th) {
                    if ($ON_THROW_TOGGLE) {
                        iy.lg(th, -1865966291367737228L, null, str, date, new Float(f), new Float(f2), new Integer(i));
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(LessonScores.class);
        }

        @ey(method = 1382566954447905424L)
        public LessonScores() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(-4349194314048767664L, null);
                }
                SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences(PREF_SCORES_SETTINGS_NAME, 0);
                this.lessonResults = (Map) SerializeHelper.j6(sharedPreferences.getString(RESULTS_SETTING, null), new HashMap());
                this.lessonFinished = (List) SerializeHelper.j6(sharedPreferences.getString(FINISHED_SETTING, null), new ArrayList());
                this.lessonStarted = (Set) SerializeHelper.j6(sharedPreferences.getString(STARTED_SETTING, null), new HashSet());
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, -4349194314048767664L, null);
                }
                throw th;
            }
        }

        @ey(method = 1506381050017834015L)
        private void save() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(1928612023401524472L, this);
                }
                SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences(PREF_SCORES_SETTINGS_NAME, 0).edit();
                editorEdit.putString(RESULTS_SETTING, SerializeHelper.DW(this.lessonResults));
                editorEdit.putString(FINISHED_SETTING, SerializeHelper.DW(this.lessonFinished));
                editorEdit.putString(STARTED_SETTING, SerializeHelper.DW(this.lessonStarted));
                editorEdit.commit();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, 1928612023401524472L, this);
                }
                throw th;
            }
        }

        @ey(method = -3456377750754121064L)
        public float getAverageFailures(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-3771564193531797849L, this, str);
                }
                if (this.lessonResults.containsKey(str)) {
                    return this.lessonResults.get(str).averageFailures;
                }
                return 0.0f;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -3771564193531797849L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -2494907290934024880L)
        public boolean isLessonFinished(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-5408562192611049649L, this, str);
                }
                return this.lessonResults.containsKey(str);
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -5408562192611049649L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 596042570547521385L)
        public boolean isLessonStarted(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-693021204963231592L, this, str);
                }
                return this.lessonStarted.contains(str);
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -693021204963231592L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -3046644374905310465L)
        public void setLessonFinished(String str, float f, float f2, int i) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.J0(-3090782339208817064L, this, str, new Float(f), new Float(f2), new Integer(i));
                }
                LessonResult lessonResult = new LessonResult(str, new Date(), f, f2, i);
                this.lessonResults.put(str, lessonResult);
                this.lessonFinished.add(lessonResult);
                save();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.a8(th, -3090782339208817064L, this, str, new Float(f), new Float(f2), new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 1458106629928074944L)
        public void startLesson(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-1781542695152700495L, this, str);
                }
                this.lessonStarted.add(str);
                save();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -1781542695152700495L, this, str);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(TrainerState.class);
    }

    @ey(method = -768021228135102943L)
    public TrainerState() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-993261046396190080L, null);
            }
            this.locale = "en";
            this.lessonStates = new LessonStates();
            this.lessonScores = new LessonScores();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -993261046396190080L, null);
            }
            throw th;
        }
    }

    @ey(method = -189174246827832288L)
    public float calculateLessonAverageFailures(c.h hVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(5883185876938054281L, this, hVar);
            }
            return this.lessonStates.getLessonFailureCount(hVar.Zo()) / hVar.j3();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 5883185876938054281L, this, hVar);
            }
            throw th;
        }
    }

    @ey(method = 2283687745965497248L)
    public boolean exerciseHasRun() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-3034199136401342193L, this);
            }
            return this.lessonStates.currentExerciseHasRun;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -3034199136401342193L, this);
            }
            throw th;
        }
    }

    @ey(method = 4972422910381427448L)
    public int getCurrentExercise() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-3938123795359187089L, this);
            }
            return this.lessonStates.getCurrentExercise();
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -3938123795359187089L, this);
            }
            throw th;
        }
    }

    @ey(method = 2336949948617868445L)
    public String getCurrentExerciseErrorText() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-1347637635448325496L, this);
            }
            return this.lessonStates.currentExerciseErrorHtml;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -1347637635448325496L, this);
            }
            throw th;
        }
    }

    @ey(method = -6866450607675384921L)
    public String getCurrentLessonId() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-425254546807067984L, this);
            }
            return this.lessonStates.currentLessonId;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -425254546807067984L, this);
            }
            throw th;
        }
    }

    @ey(method = 2120787075763618639L)
    public float getLessonAverageFailures(c.j jVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-968627805720437336L, this, jVar);
            }
            return this.lessonScores.getAverageFailures(jVar.Zo());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -968627805720437336L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = 825911309788192433L)
    public String getLocale() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-508194193104036216L, this);
            }
            return this.locale;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -508194193104036216L, this);
            }
            throw th;
        }
    }

    @ey(method = 4371422876542761987L)
    public boolean isLessonFinished(c.j jVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-3993307272800904528L, this, jVar);
            }
            return this.lessonScores.isLessonFinished(jVar.Zo());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -3993307272800904528L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -1162929786114662967L)
    public boolean isLessonInProgress(c.j jVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(7233420837600736L, this, jVar);
            }
            return this.lessonStates.getLessonExercise(jVar.Zo()) > 0;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 7233420837600736L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = -5295908807126021616L)
    public boolean isLessonStarted(c.j jVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-1813291976360008659L, this, jVar);
            }
            return this.lessonScores.isLessonStarted(jVar.Zo());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1813291976360008659L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = 393508005588999936L)
    public void restartLesson(c.j jVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-2344353751871666565L, this, jVar);
            }
            this.lessonStates.restartLesson(jVar.Zo());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -2344353751871666565L, this, jVar);
            }
            throw th;
        }
    }

    @ey(method = 219404935573658415L)
    public void retryCurrentExercise(int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.u7(-3716188743279186464L, this, i);
            }
            this.lessonStates.retryCurrentExercise(i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -3716188743279186464L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -7140219410041534821L)
    public void runCurrentExercise() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-633984056765797392L, this);
            }
            this.lessonStates.currentExerciseHasRun = true;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -633984056765797392L, this);
            }
            throw th;
        }
    }

    @ey(method = -6847578514793287376L)
    public void setLessonFinished(c.h hVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-1415245264733922383L, this, hVar);
            }
            FireBaseLogEvent.we(hVar.Zo());
            FireBaseLogEvent.tp("Lesson finished " + hVar.Zo());
            this.lessonScores.setLessonFinished(hVar.Zo(), ((float) this.lessonStates.getLessonFailureCount(hVar.Zo())) / ((float) hVar.j3()), hVar.QX(), hVar.j3());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -1415245264733922383L, this, hVar);
            }
            throw th;
        }
    }

    @ey(method = 553617723376845732L)
    public boolean showErrorForCurrentExercise() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(2117357884820040775L, this);
            }
            return this.lessonStates.currentExerciseShowError;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, 2117357884820040775L, this);
            }
            throw th;
        }
    }

    @ey(method = -102018230280615693L)
    public boolean showHintForCurrentExercise() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-1661928983404556800L, this);
            }
            return this.lessonStates.currentExerciseShowHint;
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -1661928983404556800L, this);
            }
            throw th;
        }
    }

    @ey(method = 5137139112715351040L)
    public boolean showSkipLesson(c.h hVar) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(-3132178564415083455L, this, hVar);
            }
            return this.lessonStates.showSkipLesson(hVar.Zo());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, -3132178564415083455L, this, hVar);
            }
            throw th;
        }
    }

    @ey(method = -4056464553613769997L)
    public void startLesson(String str) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.tp(1099834661799841200L, this, str);
            }
            FireBaseLogEvent.J0(str);
            FireBaseLogEvent.tp("Lesson started " + str);
            this.lessonStates.startLesson(str);
            this.lessonScores.startLesson(str);
            FireBaseLogEvent.tp("Exercise started: " + getCurrentLessonId() + " " + getCurrentExercise());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.j3(th, 1099834661799841200L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 145725258528436552L)
    public void startNextExercise() {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.gn(-562021336063102215L, this);
            }
            this.lessonStates.startNextExercise();
            FireBaseLogEvent.tp("Exercise started: " + getCurrentLessonId() + " " + getCurrentExercise());
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.aM(th, -562021336063102215L, this);
            }
            throw th;
        }
    }

    @ey(method = 223520566530348417L)
    public void retryCurrentExercise(String str, int i) {
        try {
            if ($ON_ENTER_TOGGLE) {
                iy.EQ(-3098465758090925960L, this, str, new Integer(i));
            }
            this.lessonStates.retryCurrentExercise(str, i);
        } catch (Throwable th) {
            if ($ON_THROW_TOGGLE) {
                iy.Mr(th, -3098465758090925960L, this, str, new Integer(i));
            }
            throw th;
        }
    }

    @cy(clazz = 2847245616869302615L, container = 2847245616869302615L, user = true)
    private static class LessonStates {

        @fy
        private static /* synthetic */ boolean $ON_ENTER_TOGGLE = false;

        @gy
        private static /* synthetic */ boolean $ON_THROW_TOGGLE = false;

        @dy(field = -3831775696341595035L)
        private static final String ERROR_SETTING = "Error";

        @dy(field = 374997788577198976L)
        private static final String EXERCISES_SETTING = "Exercises";

        @dy(field = -4213917212018131200L)
        private static final String FAILURES_SETTING = "Failures";

        @dy(field = 2791287937988507825L)
        private static final String HAS_RUN_SETTING = "HAS_RUN_SETTING";

        @dy(field = -5961311523033593160L)
        private static final String LESSSON_SETTING = "Lesson";

        @dy(field = -214613255741317680L)
        private static final String PREF_STATES_SETTINGS_NAME = "TrainerState2";

        @dy(field = -1016501781929803287L)
        private static final String SHOW_ERROR_SETTING = "ShowError";

        @dy(field = -511272964089510096L)
        private static final String SHOW_HINT_SETTING = "ShowHint";

        @dy(field = -1611835219756605000L)
        private String currentExerciseErrorHtml;

        @dy(field = -22022398798993176L)
        private boolean currentExerciseHasRun;

        @dy(field = 726474568057059576L)
        private boolean currentExerciseShowError;

        @dy(field = -839775386028433575L)
        private boolean currentExerciseShowHint;

        @dy(field = -3794541099007987680L)
        private String currentLessonId;

        @dy(field = 92715794866404987L)
        private boolean currentLessonShownSkip;

        @dy(field = -1015992329444787240L)
        private Map<String, Integer> lessonExercise;

        @dy(field = 1832151968079487405L)
        private Map<String, Integer> lessonFailureCount;

        static {
            iy.Zo(LessonStates.class);
        }

        @ey(method = -23060301031582671L)
        public LessonStates() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(-2663690902768605849L, null);
                }
                SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences(PREF_STATES_SETTINGS_NAME, 0);
                this.lessonFailureCount = (Map) SerializeHelper.j6(sharedPreferences.getString(FAILURES_SETTING, null), new HashMap());
                this.lessonExercise = (Map) SerializeHelper.j6(sharedPreferences.getString(EXERCISES_SETTING, null), new HashMap());
                this.currentLessonId = sharedPreferences.getString(LESSSON_SETTING, "");
                this.currentExerciseShowHint = sharedPreferences.getBoolean(SHOW_HINT_SETTING, false);
                this.currentExerciseShowError = sharedPreferences.getBoolean(SHOW_ERROR_SETTING, false);
                this.currentExerciseHasRun = sharedPreferences.getBoolean(HAS_RUN_SETTING, false);
                this.currentExerciseErrorHtml = sharedPreferences.getString(ERROR_SETTING, null);
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, -2663690902768605849L, null);
                }
                throw th;
            }
        }

        @ey(method = -1399267221973435425L)
        private void addFailure(int i) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.u7(-717087101825330445L, this, i);
                }
                if (i > 0) {
                    this.lessonFailureCount.put(this.currentLessonId, Integer.valueOf(getLessonFailureCount(this.currentLessonId) + (6 - i)));
                }
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -717087101825330445L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2154811149112863156L)
        private void save() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(-523869007846388668L, this);
                }
                SharedPreferences.Editor editorEdit = ServiceContainer.getContext().getSharedPreferences(PREF_STATES_SETTINGS_NAME, 0).edit();
                editorEdit.putString(FAILURES_SETTING, SerializeHelper.DW(this.lessonFailureCount));
                editorEdit.putString(EXERCISES_SETTING, SerializeHelper.DW(this.lessonExercise));
                editorEdit.putString(LESSSON_SETTING, this.currentLessonId);
                editorEdit.putBoolean(SHOW_HINT_SETTING, this.currentExerciseShowHint);
                editorEdit.putBoolean(SHOW_ERROR_SETTING, this.currentExerciseShowError);
                editorEdit.putBoolean(HAS_RUN_SETTING, this.currentExerciseHasRun);
                editorEdit.putString(ERROR_SETTING, this.currentExerciseErrorHtml);
                editorEdit.commit();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, -523869007846388668L, this);
                }
                throw th;
            }
        }

        @ey(method = -4106930091447154216L)
        public int getCurrentExercise() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(4378954522730515320L, this);
                }
                return getLessonExercise(this.currentLessonId);
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, 4378954522730515320L, this);
                }
                throw th;
            }
        }

        @ey(method = 5209166929375434021L)
        public int getLessonExercise(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-2174267299323368695L, this, str);
                }
                if (this.lessonExercise.containsKey(str)) {
                    return this.lessonExercise.get(str).intValue();
                }
                return 0;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -2174267299323368695L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1410895505093474216L)
        public int getLessonFailureCount(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(237498993115640256L, this, str);
                }
                if (this.lessonFailureCount.containsKey(str)) {
                    return this.lessonFailureCount.get(str).intValue();
                }
                return 0;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, 237498993115640256L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1674279301758705760L)
        public void restartLesson(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-2623388691609159528L, this, str);
                }
                startLesson(str);
                this.lessonExercise.put(str, 0);
                this.lessonFailureCount.put(str, 0);
                save();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -2623388691609159528L, this, str);
                }
                throw th;
            }
        }

        @ey(method = 462075114980267519L)
        public void retryCurrentExercise(int i) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.u7(7511835169885747731L, this, i);
                }
                this.currentExerciseShowHint = true;
                this.currentExerciseShowError = false;
                addFailure(i);
                save();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, 7511835169885747731L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = 2769467912038501983L)
        public boolean showSkipLesson(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(-2659939948760190165L, this, str);
                }
                if (!this.lessonFailureCount.containsKey(str) || this.lessonFailureCount.get(str).intValue() <= 10 || this.currentLessonShownSkip) {
                    return false;
                }
                this.currentLessonShownSkip = true;
                return true;
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, -2659939948760190165L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -945429319348095989L)
        public void startLesson(String str) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.tp(696597681188450223L, this, str);
                }
                this.currentLessonId = str;
                this.currentExerciseShowHint = false;
                this.currentExerciseShowError = false;
                this.currentExerciseHasRun = false;
                this.currentLessonShownSkip = false;
                save();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.j3(th, 696597681188450223L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1098663444896972136L)
        public void startNextExercise() {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.gn(-4596389490054445424L, this);
                }
                this.currentExerciseShowHint = false;
                this.currentExerciseShowError = false;
                this.currentExerciseHasRun = false;
                this.lessonExercise.put(this.currentLessonId, Integer.valueOf(getCurrentExercise() + 1));
                save();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.aM(th, -4596389490054445424L, this);
                }
                throw th;
            }
        }

        @ey(method = -3562391085836745995L)
        public void retryCurrentExercise(String str, int i) {
            try {
                if ($ON_ENTER_TOGGLE) {
                    iy.EQ(-3009306943820948799L, this, str, new Integer(i));
                }
                this.currentExerciseShowError = true;
                this.currentExerciseErrorHtml = str;
                addFailure(i);
                save();
            } catch (Throwable th) {
                if ($ON_THROW_TOGGLE) {
                    iy.Mr(th, -3009306943820948799L, this, str, new Integer(i));
                }
                throw th;
            }
        }
    }
}
