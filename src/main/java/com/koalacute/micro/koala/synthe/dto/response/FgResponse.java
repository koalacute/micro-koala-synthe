package com.koalacute.micro.koala.synthe.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FgResponse {

    private int code;
    private String msg;
    private Object data;
}
