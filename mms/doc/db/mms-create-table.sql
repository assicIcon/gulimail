create database mall_mms;
use mall_mms;

### 特权 ###

### 特权信息
create table privilege
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    privilege_id   varchar(32) unique             not null comment '特权ID',
    privilege_name varchar(64)                    not null comment '特权名称',
    icon           varchar(128)                   null comment '图标',
    description    varchar(256)                   null comment '描述',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '特权信息';


### 等级 ###

### 等级信息
create table level
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    level_id      varchar(32) unique             not null comment '等级ID',
    level_name    varchar(64)                    not null comment '等级名称',
    icon          varchar(128)                   null comment '图标',
    growth_point  int                            not null comment '需要成长值',
    default_level tinyint(4) default 0           not null comment '默认等级: 0-否; 1-是;',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '等级信息';

# 等级特权
create table level_privilege
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    level_id     varchar(32)                    not null comment '等级ID',
    privilege_id varchar(32)                    not null comment '特权ID',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间',
    constraint unique (level_id, privilege_id) comment '等级ID+特权ID唯一键'
) comment '等级特权';


### 会员信息 ###

# 会员信息
create table member
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    member_id    varchar(32) unique             not null comment '会员ID',
    level_id     varchar(32)                    not null comment '等级',
    username     varchar(64)                    not null comment '用户名称',
    password     varchar(64)                    not null comment '密码',
    phone_number varchar(32)                    null comment '手机号',
    email        varchar(64)                    null comment '邮箱',
    avatar       varchar(128)                   null comment '头像',
    gender       tinyint(4) default 0           not null comment '性别: 0-女; 1-男;',
    birth_day    date                           null comment '出生日期',
    city         varchar(32)                    null comment '城市',
    status       tinyint(4) default 0           not null comment '状态',
    integration  int        default 0           not null comment '积分',
    growth_point int        default 0           not null comment '成长值',
    source_type  varchar(32)                    not null comment '用户来源',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '会员信息';
create index idx_level_id on member (level_id) comment '等级ID索引';

# 会员地址
create table member_address
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    member_id       varchar(32)                    not null comment '会员ID',
    receiver_name   varchar(32)                    not null comment '收货人名称',
    receiver_phone  varchar(32)                    not null comment '收货人手机',
    address_type    tinyint(4)                     not null comment '地址类型',
    province        varchar(32)                    not null comment '省',
    city            varchar(32)                    not null comment '城市',
    region          varchar(32)                    not null comment '区',
    street          varchar(32)                    not null comment '街道',
    address         varchar(128)                   not null comment '详细地址',
    default_address tinyint(4) default 0           not null comment '默认地址',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '会员地址';
create index idx_member_id on member_address (member_id) comment '会员ID';

# 会员收藏
create table member_favorite
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    member_id     varchar(32)                    not null comment '会员ID',
    relation_id   varchar(32)                    not null comment '收藏品关联ID',
    favorite_name varchar(64)                    not null comment '收藏名称',
    favorite_type varchar(32)                    not null comment '收藏类型',
    image         varchar(128)                   not null comment '图片',
    link          varchar(128)                   not null comment '链接',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间',
    constraint unique (member_id, relation_id) comment '会员ID+收藏品关联ID唯一键'
) comment '会员收藏';

# 会员成长值流水
create table member_growth_flow
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    member_id    varchar(32)                    not null comment '会员ID',
    growth_point int                            not null comment '成长值',
    source_type  varchar(32)                    not null comment '成长值来源',
    remark       varchar(256)                   null comment '备注',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '会员成长值流水';
create index idx_member_id on member_growth_flow (member_id) comment '会员ID';

# 会员积分流水
create table member_integration_flow
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    member_id   varchar(32)                    not null comment '会员ID',
    integration int                            not null comment '积分',
    source_type varchar(32)                    not null comment '积分来源',
    remark      varchar(256)                   null comment '备注',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '会员积分流水';
create index idx_member_id on member_integration_flow (member_id) comment '会员ID';
