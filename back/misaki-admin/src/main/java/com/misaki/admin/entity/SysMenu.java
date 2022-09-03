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
    * 菜单管理
    * </p>
*
* @author Misaki
* @since 2022-09-03
*/
    @Data
    @TableName("sys_menu")
    @ApiModel(value = "SysMenu对象", description = "菜单管理")
    public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty("编号")
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty("菜单名称")
        @TableField("name")
    private String name;

            @ApiModelProperty("父菜单ID,一级菜单为0")
        @TableField("parent_id")
    private Long parentId;

            @ApiModelProperty("菜单URL")
        @TableField("url")
    private String url;

            @ApiModelProperty("授权")
        @TableField("perms")
    private String perms;

            @ApiModelProperty("类型 0:目录 1:菜单 2:按钮")
        @TableField("type")
    private Integer type;

            @ApiModelProperty("菜单图标")
        @TableField("icon")
    private String icon;

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





