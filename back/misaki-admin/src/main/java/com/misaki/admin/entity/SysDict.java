package com.misaki.admin.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableField;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableName;
    import java.io.Serializable;
    import java.math.BigDecimal;
    import java.time.LocalDateTime;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;

/**
* <p>
    * 字典表
    * </p>
*
* @author Misaki
* @since 2022-09-03
*/
    @Data
    @TableName("sys_dict")
    @ApiModel(value = "SysDict对象", description = "字典表")
    public class SysDict implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty("编号")
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty("数据值")
        @TableField("value")
    private String value;

            @ApiModelProperty("标签名")
        @TableField("label")
    private String label;

            @ApiModelProperty("类型")
        @TableField("type")
    private String type;

            @ApiModelProperty("描述")
        @TableField("description")
    private String description;

            @ApiModelProperty("排序(升序)")
        @TableField("sort")
    private BigDecimal sort;

            @ApiModelProperty("创建人")
        @TableField("create_by")
    private String createBy;

            @ApiModelProperty("创建时间")
        @TableField("create_time")
    private LocalDateTime createTime;

            @ApiModelProperty("更新人")
        @TableField("last_update_by")
    private String lastUpdateBy;

            @ApiModelProperty("更新时间")
        @TableField("last_update_time")
    private LocalDateTime lastUpdateTime;

            @ApiModelProperty("备注信息")
        @TableField("remarks")
    private String remarks;

            @ApiModelProperty("是否删除  -1:已删除  0:正常")
        @TableField("del_flag")
    private Integer delFlag;


}





