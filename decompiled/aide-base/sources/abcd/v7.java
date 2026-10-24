package abcd;

import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.language.xml.XmlCodeModel;

@cy(clazz = -2643191981948985873L, container = -2643191981948985873L, user = true)
/* loaded from: classes.dex */
public class v7 {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 2794815634238527044L)
    private ListOf<ClassType> DW;

    @dy(field = 4555181201709287625L)
    private ListOf<Member> FH;

    @dy(field = -2746930559059784640L)
    private Model j6;

    static {
        iy.Zo(v7.class);
    }

    @ey(method = -445638848609340987L)
    public v7(Model model) {
        try {
            if (Hw) {
                iy.tp(2413796562439871675L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 2413796562439871675L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 3582816162649936773L)
    private boolean v5(FileEntry fileEntry) {
        try {
            if (Hw) {
                iy.tp(900406633898133117L, this, fileEntry);
            }
            return fileEntry.getParentDirectory().getFullNameString().startsWith("layout");
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 900406633898133117L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 622401748493462601L)
    public void DW(SyntaxTree syntaxTree, int i, int i2) {
        ClassType classType;
        try {
            if (Hw) {
                iy.we(38766037098369185L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (v5(syntaxTree.getFile())) {
                if (this.FH == null) {
                    this.FH = new ListOf<>(this.j6.entitySpace);
                    ClassType classType2 = (ClassType) this.j6.entitySpace.getRootNamespace().OW(this.j6.identifierSpace.get("android")).ca().gn(this.j6.identifierSpace.get("R"));
                    if (classType2 != null && (classType = (ClassType) classType2.iW().gn(this.j6.identifierSpace.get("attr"))) != null) {
                        MapOfInt.Iterator iteratorVH = classType.eU().VH();
                        iteratorVH.DW();
                        while (iteratorVH.hasMoreElements()) {
                            this.FH.j6((Member) iteratorVH.nextValue());
                        }
                    }
                }
                for (int i3 = 0; i3 < this.FH.EQ(); i3++) {
                    Member member = (Member) this.FH.v5(i3);
                    this.j6.codeCompleterCallback.aM(member, member.getNameString().equals("id") ? "android:id=\"@+id/" + (this.j6.identifierSpace.getString(syntaxTree.getFile().getNameIdentifier()) + syntaxTree.getIdentifierString(i2)) + "|\"" : "android:" + member.getNameString() + "=\"|\"");
                }
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 38766037098369185L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1061716227289933437L)
    public void FH(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (Hw) {
                iy.we(-2916282225489872785L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (v5(syntaxTree.getFile())) {
                if (this.DW == null) {
                    this.DW = new ListOf<>(this.j6.entitySpace);
                    Namespace namespaceOW = this.j6.entitySpace.getRootNamespace().OW(this.j6.identifierSpace.get("android")).OW(this.j6.identifierSpace.get("widget"));
                    ClassType classType = (ClassType) this.j6.entitySpace.getRootNamespace().OW(this.j6.identifierSpace.get("android")).OW(this.j6.identifierSpace.get("view")).ca().gn(this.j6.identifierSpace.get("View"));
                    MapOfInt.Iterator iteratorVH = namespaceOW.ca().VH();
                    iteratorVH.DW();
                    while (iteratorVH.hasMoreElements()) {
                        ClassType classType2 = (ClassType) iteratorVH.nextValue();
                        if (classType == null || classType2.Ej(classType)) {
                            this.DW.j6(classType2);
                        }
                    }
                }
                for (int i3 = 0; i3 < this.DW.EQ(); i3++) {
                    this.j6.codeCompleterCallback.Mr((ClassType) this.DW.v5(i3));
                }
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, -2916282225489872785L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3553222533214427376L)
    public boolean Hw(FileEntry fileEntry) {
        try {
            if (Hw) {
                iy.tp(435215787404214960L, this, fileEntry);
            }
            return fileEntry.getCodeModel() instanceof XmlCodeModel;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 435215787404214960L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 36372732450953417L)
    public void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (Hw) {
                iy.EQ(1318577243164192385L, this, syntaxTree, new Integer(i));
            }
            int identifier = syntaxTree.getIdentifier(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 2));
            if (identifier != this.j6.identifierSpace.get("layout_width") && identifier != this.j6.identifierSpace.get("layout_height")) {
                if (identifier == this.j6.identifierSpace.get("orientation")) {
                    this.j6.codeCompleterCallback.Zo("horizontal");
                    this.j6.codeCompleterCallback.Zo("vertical");
                    return;
                }
                if (identifier == this.j6.identifierSpace.get("visibility")) {
                    this.j6.codeCompleterCallback.Zo("visible");
                    this.j6.codeCompleterCallback.Zo("invisible");
                    this.j6.codeCompleterCallback.Zo("gone");
                    return;
                }
                if (identifier == this.j6.identifierSpace.get("textAllignment")) {
                    this.j6.codeCompleterCallback.Zo("inherit");
                    this.j6.codeCompleterCallback.Zo("gravity");
                    this.j6.codeCompleterCallback.Zo("textStart");
                    this.j6.codeCompleterCallback.Zo("textEnd");
                    this.j6.codeCompleterCallback.Zo("center");
                    this.j6.codeCompleterCallback.Zo("viewStart");
                    this.j6.codeCompleterCallback.Zo("viewEnd");
                    return;
                }
                if (identifier != this.j6.identifierSpace.get("gravity") && identifier != this.j6.identifierSpace.get("layout_gravity") && identifier != this.j6.identifierSpace.get("foregroundGravity")) {
                    if (identifier != this.j6.identifierSpace.get("allowSingleTap") && identifier != this.j6.identifierSpace.get("layout_centerInParent") && identifier != this.j6.identifierSpace.get("layout_centerHorizontal") && identifier != this.j6.identifierSpace.get("layout_centerVertical") && identifier != this.j6.identifierSpace.get("layout_alignParentTop") && identifier != this.j6.identifierSpace.get("layout_alignParentStart") && identifier != this.j6.identifierSpace.get("layout_alignParentRight") && identifier != this.j6.identifierSpace.get("layout_alignParentEnd") && identifier != this.j6.identifierSpace.get("layout_alignParentLeft") && identifier != this.j6.identifierSpace.get("layout_alignParentBottom") && identifier != this.j6.identifierSpace.get("isIndicator") && identifier != this.j6.identifierSpace.get("indeterminate") && identifier != this.j6.identifierSpace.get("cropToPadding") && identifier != this.j6.identifierSpace.get("baselineAlignBottom") && identifier != this.j6.identifierSpace.get("adjustViewBounds") && identifier != this.j6.identifierSpace.get("fillViewport") && identifier != this.j6.identifierSpace.get("useDefaultMargins") && identifier != this.j6.identifierSpace.get("rowOrderPreserved") && identifier != this.j6.identifierSpace.get("columnOrderPreserved") && identifier != this.j6.identifierSpace.get("stretchColumns") && identifier != this.j6.identifierSpace.get("shrinkColumns") && identifier != this.j6.identifierSpace.get("measureAllChildren") && identifier != this.j6.identifierSpace.get("measureWithLargestChild") && identifier != this.j6.identifierSpace.get("baselineAligned") && identifier != this.j6.identifierSpace.get("clipToPadding") && identifier != this.j6.identifierSpace.get("clipChildren")) {
                        if (identifier != this.j6.identifierSpace.get("ignoreGravity") && identifier != this.j6.identifierSpace.get("handle") && identifier != this.j6.identifierSpace.get("content") && identifier != this.j6.identifierSpace.get("layout_alignLeft") && identifier != this.j6.identifierSpace.get("layout_alignRight") && identifier != this.j6.identifierSpace.get("layout_alignStart") && identifier != this.j6.identifierSpace.get("layout_alignEnd") && identifier != this.j6.identifierSpace.get("layout_alignTop") && identifier != this.j6.identifierSpace.get("layout_alignBottom") && identifier != this.j6.identifierSpace.get("layout_alignBaseline") && identifier != this.j6.identifierSpace.get("layout_toStartOf") && identifier != this.j6.identifierSpace.get("layout_toLeftOf") && identifier != this.j6.identifierSpace.get("layout_toEndOf") && identifier != this.j6.identifierSpace.get("layout_toRightOf") && identifier != this.j6.identifierSpace.get("layout_above") && identifier != this.j6.identifierSpace.get("layout_below")) {
                            if (identifier != this.j6.identifierSpace.get("background") && identifier != this.j6.identifierSpace.get("src") && identifier != this.j6.identifierSpace.get("thumb") && identifier != this.j6.identifierSpace.get("track") && identifier != this.j6.identifierSpace.get("popupBackground")) {
                                if (identifier != this.j6.identifierSpace.get("prompt") && identifier != this.j6.identifierSpace.get("textOn") && identifier != this.j6.identifierSpace.get("textOff") && identifier != this.j6.identifierSpace.get("text")) {
                                    if (identifier == this.j6.identifierSpace.get("textStyle")) {
                                        this.j6.codeCompleterCallback.Zo("normal");
                                        this.j6.codeCompleterCallback.Zo("bold");
                                        this.j6.codeCompleterCallback.Zo("italic");
                                        return;
                                    }
                                    if (identifier == this.j6.identifierSpace.get("typeface")) {
                                        this.j6.codeCompleterCallback.Zo("normal");
                                        this.j6.codeCompleterCallback.Zo("sans");
                                        this.j6.codeCompleterCallback.Zo("serif");
                                        this.j6.codeCompleterCallback.Zo("monospace");
                                        return;
                                    }
                                    if (identifier == this.j6.identifierSpace.get("ellipsize")) {
                                        this.j6.codeCompleterCallback.Zo("none");
                                        this.j6.codeCompleterCallback.Zo("start");
                                        this.j6.codeCompleterCallback.Zo("middle");
                                        this.j6.codeCompleterCallback.Zo("end");
                                        this.j6.codeCompleterCallback.Zo("marquee");
                                        return;
                                    }
                                    if (identifier == this.j6.identifierSpace.get("inputType")) {
                                        this.j6.codeCompleterCallback.Zo("none");
                                        this.j6.codeCompleterCallback.Zo("text");
                                        this.j6.codeCompleterCallback.Zo("textCapCharacters");
                                        this.j6.codeCompleterCallback.Zo("textCapWords");
                                        this.j6.codeCompleterCallback.Zo("textCapSentences");
                                        this.j6.codeCompleterCallback.Zo("textAutoCorrect");
                                        this.j6.codeCompleterCallback.Zo("textAutoComplete");
                                        this.j6.codeCompleterCallback.Zo("textMultiLine");
                                        this.j6.codeCompleterCallback.Zo("textImeMultiLine");
                                        this.j6.codeCompleterCallback.Zo("textNoSuggestions");
                                        this.j6.codeCompleterCallback.Zo("textUri");
                                        this.j6.codeCompleterCallback.Zo("textEmailAddress");
                                        this.j6.codeCompleterCallback.Zo("textEmailSubject");
                                        this.j6.codeCompleterCallback.Zo("textShortMessage");
                                        this.j6.codeCompleterCallback.Zo("textLongMessage");
                                        this.j6.codeCompleterCallback.Zo("textPersonName");
                                        this.j6.codeCompleterCallback.Zo("textPostalAddress");
                                        this.j6.codeCompleterCallback.Zo("textPassword");
                                        this.j6.codeCompleterCallback.Zo("textVisiblePassword");
                                        this.j6.codeCompleterCallback.Zo("textWebEditText");
                                        this.j6.codeCompleterCallback.Zo("textFilter");
                                        this.j6.codeCompleterCallback.Zo("textPhonetic");
                                        this.j6.codeCompleterCallback.Zo("textWebEmailAddress");
                                        this.j6.codeCompleterCallback.Zo("textWebPassword");
                                        this.j6.codeCompleterCallback.Zo("number");
                                        this.j6.codeCompleterCallback.Zo("numberSigned");
                                        this.j6.codeCompleterCallback.Zo("numberDecimal");
                                        this.j6.codeCompleterCallback.Zo("numberPassword");
                                        this.j6.codeCompleterCallback.Zo("phone");
                                        this.j6.codeCompleterCallback.Zo("datetime");
                                        this.j6.codeCompleterCallback.Zo("date");
                                        this.j6.codeCompleterCallback.Zo("time");
                                        return;
                                    }
                                    return;
                                }
                                this.j6.codeCompleterCallback.Zo("@string/");
                                return;
                            }
                            this.j6.codeCompleterCallback.Zo("@drawable/");
                            return;
                        }
                        this.j6.codeCompleterCallback.Zo("@id/");
                        return;
                    }
                    this.j6.codeCompleterCallback.Zo("true");
                    this.j6.codeCompleterCallback.Zo("false");
                    return;
                }
                this.j6.codeCompleterCallback.Zo("top");
                this.j6.codeCompleterCallback.Zo("bottom");
                this.j6.codeCompleterCallback.Zo("left");
                this.j6.codeCompleterCallback.Zo("right");
                this.j6.codeCompleterCallback.Zo("center_vertical");
                this.j6.codeCompleterCallback.Zo("fill_vertical");
                this.j6.codeCompleterCallback.Zo("center_horizontal");
                this.j6.codeCompleterCallback.Zo("fill_horizontal");
                this.j6.codeCompleterCallback.Zo("center");
                this.j6.codeCompleterCallback.Zo("fill");
                this.j6.codeCompleterCallback.Zo("clip_vertical");
                this.j6.codeCompleterCallback.Zo("clip_horizontal");
                this.j6.codeCompleterCallback.Zo("start");
                this.j6.codeCompleterCallback.Zo("end");
                return;
            }
            this.j6.codeCompleterCallback.Zo("fill_parent");
            this.j6.codeCompleterCallback.Zo("match_parent");
            this.j6.codeCompleterCallback.Zo("wrap_content");
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1318577243164192385L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }
}
