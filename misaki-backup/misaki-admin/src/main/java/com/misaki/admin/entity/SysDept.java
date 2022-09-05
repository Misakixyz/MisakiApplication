package com.misaki.admin.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableField;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableName;
    import java.io.Serializable;
    import java.time.LocalDateTime;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;

/**
* <p>
    * 机构管理
    * </p>
*
* @author Misaki
* @since 2022-09-03
*/
    @Data
    @TableName("sys_dept")
    @ApiModel(value = "SysDept对象", description = "机构管理")
    public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty("编号")
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty("机构名称")
        @TableField("name")
    private String name;

            @ApiModelProperty("上级机构ID,一级机构为0")
        @TableField("parent_id")
    private Long parentId;

            @ApiModelProperty("排序")
        @TableField("ordert_num")
    private Integer ordertNum;

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

            @ApiModelProperty("是否删除  -1:已删除  0:正常")
        @TableField("del_flag")
    private Integer delFlag;


}





