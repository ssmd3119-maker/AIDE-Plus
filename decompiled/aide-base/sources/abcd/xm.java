package abcd;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public enum xm implements kt {
    TYPE_HEADER_ITEM(0, "header_item"),
    TYPE_STRING_ID_ITEM(1, "string_id_item"),
    TYPE_TYPE_ID_ITEM(2, "type_id_item"),
    TYPE_PROTO_ID_ITEM(3, "proto_id_item"),
    TYPE_FIELD_ID_ITEM(4, "field_id_item"),
    TYPE_METHOD_ID_ITEM(5, "method_id_item"),
    TYPE_CLASS_DEF_ITEM(6, "class_def_item"),
    TYPE_MAP_LIST(4096, "map_list"),
    TYPE_TYPE_LIST(ProxyTextView.INPUTTYPE_textCapCharacters, "type_list"),
    TYPE_ANNOTATION_SET_REF_LIST(ProxyTextView.INPUTTYPE_numberSigned, "annotation_set_ref_list"),
    TYPE_ANNOTATION_SET_ITEM(4099, "annotation_set_item"),
    TYPE_CLASS_DATA_ITEM(8192, "class_data_item"),
    TYPE_CODE_ITEM(ProxyTextView.INPUTTYPE_textCapWords, "code_item"),
    TYPE_STRING_DATA_ITEM(ProxyTextView.INPUTTYPE_numberDecimal, "string_data_item"),
    TYPE_DEBUG_INFO_ITEM(8195, "debug_info_item"),
    TYPE_ANNOTATION_ITEM(8196, "annotation_item"),
    TYPE_ENCODED_ARRAY_ITEM(8197, "encoded_array_item"),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8198, "annotations_directory_item"),
    TYPE_MAP_ITEM(-1, "map_item"),
    TYPE_TYPE_ITEM(-1, "type_item"),
    TYPE_EXCEPTION_HANDLER_ITEM(-1, "exception_handler_item"),
    TYPE_ANNOTATION_SET_REF_ITEM(-1, "annotation_set_ref_item");

    private final int WB;
    private final String jw;
    private final String mb;

    xm(int i, String str) {
        this.WB = i;
        this.mb = str;
        this.jw = (str.endsWith("_item") ? str.substring(0, str.length() - 5) : str).replace('_', ' ');
    }

    public int DW() {
        return this.WB;
    }

    public String FH() {
        return this.mb;
    }

    @Override // abcd.kt
    public String Zo() {
        return this.jw;
    }
}
