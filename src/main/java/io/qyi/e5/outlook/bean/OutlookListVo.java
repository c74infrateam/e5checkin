package io.qyi.e5.outlook.bean;

import lombok.Data;

/** 
 * @program: e5
 * @description:
 * @author: 落叶随风
 * @create: 2020-12-10 16:54
 **/
@Data
public class OutlookListVo {
    private int id;
    private String clientId;
    private String clientSecret;
    private Integer cronTimeRandomStart;
    private Integer cronTimeRandomEnd;
    /*name*/
    private String name;
    /*description*/
    private String describes;
    /*next-call*/
    private Integer nextTime;
    /*status*/
    private int status;
}
