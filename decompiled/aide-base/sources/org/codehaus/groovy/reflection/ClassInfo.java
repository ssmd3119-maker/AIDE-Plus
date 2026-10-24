package org.codehaus.groovy.reflection;

import groovy.lang.Closure;
import groovy.lang.ExpandoMetaClass;
import groovy.lang.ExpandoMetaClassCreationHandle;
import groovy.lang.GroovySystem;
import groovy.lang.MetaClass;
import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.codehaus.groovy.reflection.stdclasses.ArrayCachedClass;
import org.codehaus.groovy.reflection.stdclasses.BigDecimalCachedClass;
import org.codehaus.groovy.reflection.stdclasses.BigIntegerCachedClass;
import org.codehaus.groovy.reflection.stdclasses.BooleanCachedClass;
import org.codehaus.groovy.reflection.stdclasses.ByteCachedClass;
import org.codehaus.groovy.reflection.stdclasses.CachedClosureClass;
import org.codehaus.groovy.reflection.stdclasses.CachedSAMClass;
import org.codehaus.groovy.reflection.stdclasses.CharacterCachedClass;
import org.codehaus.groovy.reflection.stdclasses.DoubleCachedClass;
import org.codehaus.groovy.reflection.stdclasses.FloatCachedClass;
import org.codehaus.groovy.reflection.stdclasses.IntegerCachedClass;
import org.codehaus.groovy.reflection.stdclasses.LongCachedClass;
import org.codehaus.groovy.reflection.stdclasses.NumberCachedClass;
import org.codehaus.groovy.reflection.stdclasses.ObjectCachedClass;
import org.codehaus.groovy.reflection.stdclasses.ShortCachedClass;
import org.codehaus.groovy.reflection.stdclasses.StringCachedClass;
import org.codehaus.groovy.util.LazyReference;
import org.codehaus.groovy.util.LockableObject;
import org.codehaus.groovy.util.ManagedConcurrentMap;
import org.codehaus.groovy.util.ManagedReference;
import org.codehaus.groovy.util.ReferenceBundle;

/* loaded from: classes.dex */
public class ClassInfo extends ManagedConcurrentMap.Entry<Class, ClassInfo> {
    private static final WeakReference<ThreadLocalMapHandler> J0;
    private static final ClassInfoSet we;
    private volatile int VH;
    private final LockableObject Zo;
    private MetaClass gn;
    private ManagedReference<MetaClass> u7;
    private final LazyCachedClassRef v5;
    private static final Set<ClassInfo> tp = new HashSet();
    private static ReferenceBundle EQ = ReferenceBundle.DW();

    public static class ClassInfoSet extends ManagedConcurrentMap<Class, ClassInfo> {

        static final class Segment extends ManagedConcurrentMap.Segment<Class, ClassInfo> {
            Segment(ReferenceBundle referenceBundle, int i) {
                super(referenceBundle, i);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.codehaus.groovy.util.ManagedConcurrentMap.Segment, org.codehaus.groovy.util.AbstractConcurrentMap.Segment
            /* renamed from: tp, reason: merged with bridge method [inline-methods] */
            public ClassInfo Zo(Class cls, int i, ClassInfo classInfo) {
                return new ClassInfo(this, cls, i);
            }
        }

        public ClassInfoSet(ReferenceBundle referenceBundle) {
            super(referenceBundle);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.codehaus.groovy.util.ManagedConcurrentMap, org.codehaus.groovy.util.AbstractConcurrentMapBase
        /* renamed from: u7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Segment j6(Object obj, int i) {
            ReferenceBundle referenceBundle = (ReferenceBundle) obj;
            if (referenceBundle != null) {
                return new Segment(referenceBundle, i);
            }
            throw new IllegalArgumentException("bundle must not be null ");
        }
    }

    private static class DebugRef extends ManagedReference<Class> {
        static {
            new AtomicInteger();
        }
    }

    private static class LazyCachedClassRef extends LazyReference<CachedClass> {
        private final ClassInfo k2;

        LazyCachedClassRef(ReferenceBundle referenceBundle, ClassInfo classInfo) {
            super(referenceBundle);
            this.k2 = classInfo;
        }

        @Override // org.codehaus.groovy.util.LazyReference
        /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
        public CachedClass v5() {
            return ClassInfo.u7(this.k2.Zo(), this.k2);
        }
    }

    private static class LazyClassLoaderRef extends LazyReference<ClassLoaderForClassArtifacts> {
        private final ClassInfo k2;

        LazyClassLoaderRef(ReferenceBundle referenceBundle, ClassInfo classInfo) {
            super(referenceBundle);
            this.k2 = classInfo;
        }

        @Override // org.codehaus.groovy.util.LazyReference
        /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
        public ClassLoaderForClassArtifacts v5() {
            return new ClassLoaderForClassArtifacts(this.k2.Zo());
        }
    }

    private static final class LocalMap extends HashMap<Class, ClassInfo> {
        private static final ClassInfo fY = new ClassInfo(null, null, 0);
        private final PhantomReference<Thread> WB;
        private final ClassInfo[] jw;
        private int mb;

        private ClassInfo Hw(Class cls) {
            int i = this.mb - 1;
            int i2 = 0;
            while (i2 < this.jw.length) {
                if (i < 0) {
                    i += 5;
                }
                ClassInfo classInfo = this.jw[i];
                if (cls == classInfo.Zo()) {
                    int i3 = i + 1;
                    this.mb = i3;
                    if (i3 == 5) {
                        this.mb = 0;
                    }
                    return classInfo;
                }
                i2++;
                i--;
            }
            return null;
        }

        private ClassInfo Zo(ClassInfo classInfo) {
            ClassInfo[] classInfoArr = this.jw;
            int i = this.mb;
            int i2 = i + 1;
            this.mb = i2;
            classInfoArr[i] = classInfo;
            if (i2 == 5) {
                this.mb = 0;
            }
            return classInfo;
        }

        public ClassInfo FH(Class cls) {
            ClassInfo classInfoHw = Hw(cls);
            if (classInfoHw != null) {
                return classInfoHw;
            }
            ClassInfo classInfo = (ClassInfo) super.get(cls);
            if (classInfo != null) {
                Zo(classInfo);
                return classInfo;
            }
            ClassInfo classInfo2 = (ClassInfo) ClassInfo.we.v5(cls, null);
            Zo(classInfo2);
            return classInfo2;
        }

        private LocalMap() {
            this.WB = new PhantomReference<>(Thread.currentThread(), null);
            this.jw = new ClassInfo[5];
            int i = 0;
            while (true) {
                ClassInfo[] classInfoArr = this.jw;
                if (i >= classInfoArr.length) {
                    return;
                }
                classInfoArr[i] = fY;
                i++;
            }
        }
    }

    private static class ThreadLocalMapHandler extends ThreadLocal<SoftReference<LocalMap>> {
        SoftReference<LocalMap> j6;

        private ThreadLocalMapHandler() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public SoftReference<LocalMap> initialValue() {
            return new SoftReference<>(new LocalMap(), null);
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public SoftReference<LocalMap> get() {
            SoftReference<LocalMap> softReference = this.j6;
            LocalMap localMap = softReference != null ? softReference.get() : null;
            if (localMap != null && localMap.WB.get() == Thread.currentThread()) {
                return softReference;
            }
            SoftReference<LocalMap> softReference2 = (SoftReference) super.get();
            this.j6 = softReference2;
            return softReference2;
        }
    }

    static {
        ReferenceBundle.Hw();
        we = new ClassInfoSet(EQ);
        J0 = new WeakReference<>(new ThreadLocalMapHandler(), null);
    }

    ClassInfo(ManagedConcurrentMap.Segment segment, Class cls, int i) {
        super(EQ, segment, cls, i);
        this.Zo = new LockableObject();
        MetaMethod[] metaMethodArr = CachedClass.J0;
        this.v5 = new LazyCachedClassRef(EQ, this);
        new LazyClassLoaderRef(EQ, this);
    }

    public static ClassInfo EQ(Class cls) {
        LocalMap localMapWe = we();
        return localMapWe != null ? localMapWe.FH(cls) : (ClassInfo) we.v5(cls, null);
    }

    private boolean Mr(MetaClass metaClass, MetaClassRegistry.MetaClassCreationHandle metaClassCreationHandle) {
        if (metaClass == null) {
            return false;
        }
        return !(metaClassCreationHandle instanceof ExpandoMetaClassCreationHandle) || (metaClass instanceof ExpandoMetaClass);
    }

    private MetaClass Ws() {
        MetaClass metaClassQX = QX();
        if (metaClassQX != null) {
            return metaClassQX;
        }
        MetaClass metaClassXL = XL();
        MetaClassRegistry metaClassRegistry = GroovySystem.getMetaClassRegistry();
        MetaClassRegistry.MetaClassCreationHandle metaClassCreationHandler = metaClassRegistry.getMetaClassCreationHandler();
        if (Mr(metaClassXL, metaClassCreationHandler)) {
            return metaClassXL;
        }
        MetaClass metaClassCreate = metaClassCreationHandler.create(Zo(), metaClassRegistry);
        metaClassCreate.initialize();
        if (GroovySystem.isKeepJavaMetaClasses()) {
            lg(metaClassCreate);
        } else {
            rN(metaClassCreate);
        }
        return metaClassCreate;
    }

    private void a8(ManagedReference<MetaClass> managedReference) {
        ManagedReference<MetaClass> managedReference2 = this.u7;
        if (managedReference2 != null) {
            managedReference2.v5();
        }
        this.u7 = managedReference;
    }

    private static boolean aM(Class<?> cls) {
        return CachedSAMClass.EQ(cls) != null;
    }

    private boolean j3(MetaClass metaClass) {
        return Mr(metaClass, GroovySystem.getMetaClassRegistry().getMetaClassCreationHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CachedClass u7(Class cls, ClassInfo classInfo) {
        if (cls == Object.class) {
            return new ObjectCachedClass(classInfo);
        }
        if (cls == String.class) {
            return new StringCachedClass(classInfo);
        }
        if (!Number.class.isAssignableFrom(cls) && !cls.isPrimitive()) {
            return cls.getName().charAt(0) == '[' ? new ArrayCachedClass(cls, classInfo) : cls == Boolean.class ? new BooleanCachedClass(cls, classInfo, true) : cls == Character.class ? new CharacterCachedClass(cls, classInfo, true) : Closure.class.isAssignableFrom(cls) ? new CachedClosureClass(cls, classInfo) : aM(cls) ? new CachedSAMClass(cls, classInfo) : new CachedClass(cls, classInfo);
        }
        if (cls == Number.class) {
            return new NumberCachedClass(cls, classInfo);
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return new IntegerCachedClass(cls, classInfo, cls == Integer.class);
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return new DoubleCachedClass(cls, classInfo, cls == Double.class);
        }
        if (cls == BigDecimal.class) {
            return new BigDecimalCachedClass(cls, classInfo);
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return new LongCachedClass(cls, classInfo, cls == Long.class);
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return new FloatCachedClass(cls, classInfo, cls == Float.class);
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return new ShortCachedClass(cls, classInfo, cls == Short.class);
        }
        if (cls == Boolean.TYPE) {
            return new BooleanCachedClass(cls, classInfo, false);
        }
        if (cls == Character.TYPE) {
            return new CharacterCachedClass(cls, classInfo, false);
        }
        if (cls == BigInteger.class) {
            return new BigIntegerCachedClass(cls, classInfo);
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return new ByteCachedClass(cls, classInfo, cls == Byte.class);
        }
        return new CachedClass(cls, classInfo);
    }

    private static LocalMap we() {
        ThreadLocalMapHandler threadLocalMapHandler = J0.get();
        SoftReference<LocalMap> softReference = threadLocalMapHandler != null ? threadLocalMapHandler.get() : null;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public final MetaClass J0() {
        MetaClass metaClassJ8 = J8();
        if (metaClassJ8 != null) {
            return metaClassJ8;
        }
        U2();
        try {
            return Ws();
        } finally {
            er();
        }
    }

    public MetaClass J8() {
        MetaClass metaClass = this.gn;
        if (metaClass != null) {
            return metaClass;
        }
        MetaClass metaClassXL = XL();
        if (j3(metaClassXL)) {
            return metaClassXL;
        }
        return null;
    }

    public MetaClass QX() {
        return this.gn;
    }

    public void U2() {
        this.Zo.j6();
    }

    public MetaClass XL() {
        ManagedReference<MetaClass> managedReference = this.u7;
        if (managedReference == null) {
            return null;
        }
        return managedReference.Zo();
    }

    public void er() {
        this.Zo.DW();
    }

    public void lg(MetaClass metaClass) {
        this.VH++;
        ExpandoMetaClass expandoMetaClass = this.gn;
        if (expandoMetaClass instanceof ExpandoMetaClass) {
            expandoMetaClass.inRegistry = false;
            tp.remove(this);
        }
        this.gn = metaClass;
        if (metaClass instanceof ExpandoMetaClass) {
            ((ExpandoMetaClass) metaClass).inRegistry = true;
            tp.add(this);
        }
        a8(null);
    }

    public void rN(MetaClass metaClass) {
        this.VH++;
        this.gn = null;
        a8(metaClass != null ? new ManagedReference<>(EQ, metaClass) : null);
    }

    public CachedClass tp() {
        return this.v5.FH();
    }
}
