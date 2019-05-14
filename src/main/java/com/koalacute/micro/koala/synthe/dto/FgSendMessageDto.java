package com.koalacute.micro.koala.synthe.dto;

import com.google.gson.annotations.SerializedName;
import com.koalacute.micro.koala.synthe.dto.notify.fg.FgData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 飞鸽发送信息
 */
@Setter
@Getter
@ToString
public class FgSendMessageDto {

    private String secret;

    @SerializedName("app_key")
    private String appKey;

    @SerializedName("template_id")
    private String templateId;

    private FgData data;

    private String url;
}
