CREATE TABLE IF NOT EXISTS sys_user (
    id bigint(20) not null auto_increment comment '编号',
    name varchar(50) not null comment '用户名',
    nick_name varchar(150) default null comment '昵称',
    avatar varchar(150) default null comment '头像',
    password varchar(40) default null comment '密码',
    salt varchar(40) default null comment '加密盐',
    email varchar(100) default null comment '邮箱',
    mobile varchar(100) default null comment '手机号',
    status tinyint(4) default null comment '状态  0:禁用  1:正常',
    dept_id bigint(20) default null comment '机构ID',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    del_flag tinyint(4) default '0' comment '是否删除  -1:已删除  0:正常',
    primary key (id),
    unique key name(name)
)engine = InnoDB AUTO_INCREMENT=34 default CHARSET=utf8 comment='用户管理'; 

CREATE TABLE IF NOT EXISTS sys_role (
    id bigint(20) not null auto_increment comment '编号',
    name varchar(50) not null comment '角色名称',
    remark varchar(100) default null comment '备注',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    del_flag tinyint(4) default '0' comment '是否删除  -1:已删除  0:正常',
    primary key (id)
) engine = InnoDB AUTO_INCREMENT=9 default CHARSET=utf8 comment ='角色管理';

CREATE TABLE IF NOT EXISTS sys_dept(
    id bigint(20) not null auto_increment comment '编号',
    name varchar(50) not null comment '机构名称',
    parent_id bigint(20) default null comment '上级机构ID,一级机构为0',
    ordert_num int(11) default null comment '排序',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    del_flag tinyint(4) default '0' comment '是否删除  -1:已删除  0:正常',
    primary key (id)
)engine = InnoDB AUTO_INCREMENT=36 default CHARSET=utf8 comment ='机构管理';

CREATE TABLE IF NOT EXISTS sys_menu(
    id bigint(20) not null auto_increment comment '编号',
    name varchar(50) not null comment '菜单名称',
    parent_id bigint(20) default null comment '父菜单ID,一级菜单为0',
    url varchar(200) default null comment '菜单URL',
    perms varchar(500) default null comment '授权',
    type int(11) default null comment '类型 0:目录 1:菜单 2:按钮',
    icon varchar(50) default null comment '菜单图标',
    ordert_num int(11) default null comment '排序',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    del_flag tinyint(4) default '0' comment '是否删除  -1:已删除  0:正常',
    primary key (id)
)engine = InnoDB AUTO_INCREMENT=45 default CHARSET=utf8 comment ='菜单管理';

CREATE TABLE IF NOT EXISTS sys_user_role (
    id bigint(20) not null auto_increment comment '编号',
    user_id bigint(20) not null comment '用户ID',
    role_id bigint(20) not null comment '角色ID',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    primary key (id)
) engine = InnoDB AUTO_INCREMENT=76 default CHARSET=utf8 comment ='用户角色';

CREATE TABLE IF NOT EXISTS sys_role_menu (
    id bigint(20) not null auto_increment comment '编号',
    role_id bigint(20) not null comment '角色ID',
    menu_id bigint(20) not null comment '菜单ID',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    primary key (id)
) engine = InnoDB AUTO_INCREMENT=469 default CHARSET=utf8 comment ='角色菜单';

CREATE TABLE IF NOT EXISTS sys_role_dept(
    id bigint(20) not null auto_increment comment '编号',
    role_id bigint(20) not null comment '角色ID',
    dept_id bigint(20) not null comment '机构ID',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    primary key (id)
) engine = InnoDB AUTO_INCREMENT=4 default CHARSET=utf8 comment ='角色机构';

CREATE TABLE IF NOT EXISTS sys_dict(
    id bigint(20) not null auto_increment comment '编号',
    value varchar(100) not null comment '数据值',
    label varchar(100) default null comment '标签名',
    type varchar(100) default null comment '类型',
    description varchar(100) default null comment '描述',
    sort decimal(10,0) not null comment '排序(升序)',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    remarks varchar(255) default null comment '备注信息',
    del_flag tinyint(4) default '0' comment '是否删除  -1:已删除  0:正常',
    primary key (id)
)engine = InnoDB AUTO_INCREMENT=5 default CHARSET=utf8 comment ='字典表';


CREATE TABLE IF NOT EXISTS sys_config(
    id bigint(20) not null auto_increment comment '编号',
    value varchar(100) not null comment '数据值',
    label varchar(100) default null comment '标签名',
    type varchar(100) default null comment '类型',
    description varchar(100) default null comment '描述',
    sort decimal(10,0) not null comment '排序(升序)',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    remarks varchar(255) default null comment '备注信息',
    del_flag tinyint(4) default '0' comment '是否删除  -1:已删除  0:正常',
    primary key (id)
)engine = InnoDB AUTO_INCREMENT=5 default CHARSET=utf8 comment ='系统配置表';

CREATE TABLE IF NOT EXISTS sys_log(
    id bigint(20) not null auto_increment comment '编号',
    user_name varchar(50) not null comment '用户名',
    operation varchar(50) default null comment '用户操作',
    method varchar(200) default null comment '请求方法',
    params varchar(5000) default null comment '请求参数',
    time bigint(20) not null comment '请执行时长(毫秒)',
    ip varchar(64) default null comment 'IP地址',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    primary key (id)
)engine = InnoDB AUTO_INCREMENT=2798 default CHARSET=utf8 comment ='系统操作日志';

CREATE TABLE IF NOT EXISTS sys_login_log(
    id bigint(20) not null auto_increment comment '编号',
    user_name varchar(50) not null comment '用户名',
    status varchar(50) default null comment '登录状态',
    ip varchar(64) default null comment 'IP地址',
    create_by varchar(50) default null comment '创建人',
    create_time datetime default null comment '创建时间',
    last_update_by varchar(50) default null comment '更新人',
    last_update_time datetime default null comment '更新时间',
    primary key (id)
)engine = InnoDB AUTO_INCREMENT=2798 default CHARSET=utf8 comment ='系统登陆日志';





