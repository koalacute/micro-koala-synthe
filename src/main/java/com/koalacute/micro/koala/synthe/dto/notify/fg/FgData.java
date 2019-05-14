package com.koalacute.micro.koala.synthe.dto.notify.fg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FgData {

    private FgFirst first = new FgFirst();

    private FgKeyWord1 keyword1 = new FgKeyWord1();

    private FgKeyWord2 keyword2 = new FgKeyWord2();

    private FgRemark remark = new FgRemark();

    private String sendFlag = "1";
}
