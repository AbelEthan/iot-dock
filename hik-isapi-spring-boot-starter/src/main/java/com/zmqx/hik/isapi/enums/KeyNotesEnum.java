package com.zmqx.hik.isapi.enums;

/**
 * @ClassName: {@link KeyNotesEnum}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/11 10:34
 * @Describes 关键注释的含义枚举
 */
public enum KeyNotesEnum {
    RO("ro", "读写属性：只读", "此字段只支持获取，不支持修改"),
    WO("wo", "读写属性：只写", "此字段只支持修改，不支持获取"),
    REQ("req", "选择属性：必选", "发送给设备的请求消息中必须有此字段，设备响应消息中必须有此字段"),
    OPT("opt", "选择属性：可选", "发送给设备的请求消息中可选此字段，设备响应消息中可选此字段"),
    DEP("dep", "选择属性：依赖", "当满足特定条件时，此字段有效且必选"),
    OBJECT("object", "字段类型：对象", "object字段有若干个子字段"),
    LIST("list", "字段类型：列表", "后面的subType表示list的子项类型"),
    STRING("string", "字段类型：字符串", "后面的range表示字段的最大长度和最小长度"),
    INT("int", "字段类型：整数", "后面的range表示字段的最大值和最小值"),
    FLOAT("float", "字段类型：浮点数", "后面的range表示字段的最大值和最小值"),
    BOOL("bool", "字段类型：布尔", "取值有true和false"),
    ENUM("enum", "字段类型：枚举", "后面的subType表示枚举项是string类型还是int类型，subType后面[]中的内容为枚举选项。"),
    SUB_TYPE("subType", "字段子类型", "字段类型为list或enum时，表示每一个子对象的类型"),
    DESC("desc", "字段描述", "字段的详细描述"),

    ;

    private String code;
    private String meaning;
    private String explain;

    KeyNotesEnum(String code, String meaning, String explain) {
        this.code = code;
        this.meaning = meaning;
        this.explain = explain;
    }

    public String getCode() {
        return code;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getExplain() {
        return explain;
    }
}
