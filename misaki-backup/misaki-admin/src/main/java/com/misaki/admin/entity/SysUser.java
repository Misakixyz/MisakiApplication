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
    * 用户管理
    * </p>
*
* @author Misaki
* @since 2022-09-03
*/
    @Data
    @TableName("sys_user")
    @ApiModel(value = "SysUser对象", description = "用户管理")
    public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty("编号")
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            @ApiModelProperty("用户名")
        @TableField("name")
    private String name;

            @ApiModelProperty("昵称")
        @TableField("nick_name")
    private String nickName;

            @ApiModelProperty("头像")
        @TableField("avatar")
    private String avatar;

            @ApiModelProperty("密码")
        @TableField("password")
    private String password;

            @ApiModelProperty("加密盐")
        @TableField("salt")
    private String salt;

            @ApiModelProperty("邮箱")
        @TableField("email")
    private String email;

            @ApiModelProperty("手机号")
        @TableField("mobile")
    private String mobile;

            @ApiModelProperty("状态  0:禁用  1:正常")
        @TableField("status")
    private Integer status;

            @ApiModelProperty("机构ID")
        @TableField("dept_id")
    private Long deptId;

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





