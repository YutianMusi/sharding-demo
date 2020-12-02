package com.sharding.test.biz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class ShInTollRequest implements Serializable {
    @ApiModelProperty(value = "公司id")
    private String companyId;

    @ApiModelProperty(value = "发票主键id")
    private String invoiceId;

    @ApiModelProperty(value = "业务ID 代码-号码")
    private String bizId;

    @ApiModelProperty(value = "标志;Y-可抵扣，N-不可抵扣")
    private String trafficFeeFlag;

}
