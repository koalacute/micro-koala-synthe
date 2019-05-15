package com.koalacute.micro.koala.synthe.enums.notify;

/**
 * 配置有效标记
 */
public enum FgConfigValidFlagEnum {

    INVALID("0", "失效"),
    VALID("1", "有效"),
    ;

    public final String code;
    public final String desc;

    FgConfigValidFlagEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
