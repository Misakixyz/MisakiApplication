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
    * 系统登陆日志
    * </p>
*
* @author Misaki
* @since 2022-09-03
*/
    @Data
    @TableName("sys_login_log")
    @ApiModel(value = "SysLoginLog对象", description = "系统登陆日志")
    public class SysLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty("编号")
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty("用户名")
        @TableField("user_name")
    private String userName;

            @ApiModelProperty("登录状态")
        @TableField("status")
    private String status;

            @ApiModelProperty("IP地址")
        @TableField("ip")
    private String ip;

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





