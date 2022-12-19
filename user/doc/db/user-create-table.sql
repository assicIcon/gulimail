create database mall_ums;
use mall_ums;

### 菜单 ###

# 菜单
create table menu
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    menu_id        varchar(32) unique             not null comment '菜单ID',
    parent_menu_id varchar(32)                    not null comment '父菜单ID',
    menu_name      varchar(32)                    not null comment '菜单名称',
    sort           int default 0                  not null comment '排序',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '菜单';

# 菜单功能
create table menu_function
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    function_id   varchar(32) unique             not null comment '功能ID',
    menu_id       varchar(32)                    not null comment '菜单ID',
    function_name varchar(64)                    not null comment '分组名称',
    function_type tinyint(4)                     not null comment '功能类型',
    request_path  varchar(64)                    not null comment '功能路径',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '菜单功能';

### 用户角色 ###

create table role
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    role_id        varchar(32) unique             not null comment '角色ID',
    parent_role_id varchar(32)                    not null comment '父角色ID',
    role_name      varchar(64)                    not null comment '角色名称',
    valid_status   tinyint(4)                     not null comment '有效的: 0-否; 1-是;',
    description    varchar(256)                   null comment '描述',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '角色';
create index idx_parent_role_id on role (parent_role_id) comment '父角色ID索引';

# 角色权限
create table role_permission
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    role_id     varchar(32)                    not null comment '角色ID',
    function_id varchar(32)                    not null comment '功能ID',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '角色权限';

# 部门
create table department
(
    id                    bigint unsigned auto_increment not null comment '自增ID' primary key,
    department_id         varchar(32) unique             not null comment '部门ID',
    department_manager_id varchar(32)                    not null comment '部门主管ID',
    department_name       varchar(64)                    not null comment '部门名称',
    status                tinyint(4) default 0           not null comment '状态',
    description           varchar(256)                   null comment '描述',
    create_time           datetime                       not null comment '创建时间',
    update_time           datetime                       not null comment '修改时间'
) comment '部门';

# 用户
create table user
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    user_id       varchar(32) unique             not null comment '用户ID',
    department_id varchar(32)                    not null comment '部门ID',
    username      varchar(64)                    not null comment '用户名',
    password      varchar(64)                    not null comment '密码',
    phone_number  varchar(32)                    null comment '手机号码',
    email         varchar(32)                    null comment '邮箱',
    avatar        varchar(128)                   null comment '头像',
    status        tinyint(4) default 0           not null comment '状态',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '用户';

# 用户角色
create table user_role
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    user_id     varchar(32)                    not null comment '用户ID',
    role_id     varchar(32)                    not null comment '用户角色',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '用户角色';


