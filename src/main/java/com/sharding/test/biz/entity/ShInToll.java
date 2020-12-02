package com.sharding.test.biz.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author test
 * @since 2020-09-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ShInToll对象", description="扩展表")
@TableName("sh_in_toll")
public class ShInToll implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @ApiModelProperty(value = "公司id")
    private String companyId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "发票主键id")
    private String invoiceId;

    @ApiModelProperty(value = "业务ID 代码-号码")
    private String bizId;

    @ApiModelProperty(value = "标志;Y-可抵扣，N-不可抵扣")
    private String trafficFeeFlag;

    @ApiModelProperty(value = "是否删除, 0:未删除  1:已删除")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    public static final String ID = "id";

    public static final String COMPANY_ID = "company_id";

    public static final String USER_ID = "user_id";

    public static final String INVOICE_ID = "invoice_id";

    public static final String BIZ_ID = "biz_id";

    public static final String TRAFFIC_FEE_FLAG = "traffic_fee_flag";

    public static final String IS_DELETED = "is_deleted";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

}
