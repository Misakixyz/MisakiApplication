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
    * 角色菜单
    * </p>
*
* @author Misaki
* @since 2022-09-03
*/
    @Data
    @TableName("sys_role_menu")
    @ApiModel(value = "SysRoleMenu对象", description = "角色菜单")
    public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty("编号")
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty("角色ID")
        @TableField("role_id")
    private Long roleId;

            @ApiModelProperty("菜单ID")
        @TableField("menu_id")
    private Long menuId;

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


}





