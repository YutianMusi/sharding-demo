package com.sharding.test.biz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class ShInLogRequest implements Serializable{

        private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "企业主键")
        private String companyId;

        @ApiModelProperty(value = "请求参数")
        private String reqParameter;

        @ApiModelProperty(value = "调用类型 1 申请 2 统计 3 结果查询 4 签名")
        private Boolean type;


}
