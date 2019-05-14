package com.koalacute.micro.koala.synthe.enums.notify;

/**
 * 飞鸽发送信息响应码
 */
public enum FgResponseStatus {

    SUCCESS(200, "成功"),
    FAIL10001(10001, "缺少secret 或 token"),
    FAIL10002(10002, "缺少消息标题或内容"),
    FAIL10003(10003, "消息模板ID错误"),
    FAIL10004(10004, "secret 或 app_key 错误"),
    FAIL10005(10005, "余额不足"),
    ;

    public final int code;
    public final String desc;

    FgResponseStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 通过code查询desc
     */
    public static String getDescByCode(int code) {
        String desc = "";
        for (FgResponseStatus fgResponseStatus : FgResponseStatus.values()) {
            if (fgResponseStatus.code == code) {
                desc = fgResponseStatus.desc;
                break;
            }
        }
        return desc;
    }
}
