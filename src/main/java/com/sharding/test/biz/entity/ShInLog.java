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
@ApiModel(value="ShInLog对象", description="日志")
@TableName("sh_in_log")
public class ShInLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @ApiModelProperty(value = "企业主键")
    private String companyId;

    @ApiModelProperty(value = "请求参数")
    private String reqParameter;

    @ApiModelProperty(value = "返回参数")
    private String repParameter;

    @ApiModelProperty(value = "调用类型 1 申请 2 统计 3 结果查询 4 签名")
    private Boolean type;

    @ApiModelProperty(value = "是否删除, 0:未删除  1:已删除")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建日期")
    private Date createTime;

    @ApiModelProperty(value = "修改日期")
    private Date updateTime;

    public static final String ID = "id";

    public static final String COMPANY_ID = "company_id";

    public static final String REQ_PARAMETER = "req_parameter";

    public static final String REP_PARAMETER = "rep_parameter";

    public static final String TYPE = "type";

    public static final String IS_DELETED = "is_deleted";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

}
