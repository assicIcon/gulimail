create database mall_marketing;
use mall_marketing;

### 优惠券 ###

# 优惠券批次
create table coupon_batch
(
    id                  bigint unsigned auto_increment not null comment '自增ID' primary key,
    coupon_batch_id     varchar(32) unique             not null comment '优惠券批次ID',
    coupon_name         varchar(64)                    not null comment '优惠券名称',
    image               varchar(128)                   not null comment '优惠券图片',
    valid_status        tinyint(4) default 0           not null comment '生效状态: 0-有效; 1-无效;',
    coupon_type         varchar(16)                    not null comment '优惠券类型',
    discount            decimal(10, 2)                 not null comment '优惠券折扣',
    unit                varchar(8)                     not null comment '折扣单位',
    count               int                            not null comment '数量',
    enable_start_time   datetime                       not null comment '可领取开始时间',
    enable_end_time     datetime                       not null comment '可领取结束时间',
    available_time_type varchar(16)                    not null comment '使用时间类型',
    available_time_rule varchar(256)                   not null comment '使用时间规则',
    description         varchar(256)                   null comment '描述',
    create_time         datetime                       not null comment '创建时间',
    update_time         datetime                       not null comment '修改时间'
) comment '优惠券批次';

# 优惠券使用条件
create table coupon_use_condition
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    coupon_batch_id varchar(32)                    not null comment '优惠券批次ID',
    type            varchar(16)                    not null comment '条件类型',
    use_condition   varchar(256)                   not null comment '使用条件',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '优惠券使用条件';
create index idx_coupon_batch_id on coupon_use_condition (coupon_batch_id) comment '优惠券批次ID索引';

# 优惠券
create table coupon
(
    id                   bigint unsigned auto_increment not null comment '自增ID' primary key,
    coupon_id            varchar(32) unique             not null comment '优惠券ID',
    coupon_batch_id      varchar(32)                    not null comment '优惠券批次ID',
    status               tinyint(4) default 0           not null comment '状态: 0-未发放; 1-已发放; 2-已使用;',
    redemption_code      varchar(32)                    null comment '兑换码',
    available_start_time datetime                       null comment '可用开始时间',
    available_end_time   datetime                       null comment '可用结束时间',
    create_time          datetime                       not null comment '创建时间',
    update_time          datetime                       not null comment '修改时间'
) comment '优惠券';
create index idx_coupon_batch_id on coupon (coupon_batch_id) comment '优惠券批次ID索引';


### 首页广告位 ###

# 广告位
create table ad_space
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    ad_space_id   varchar(32) unique             not null comment '广告位ID',
    ad_space_name varchar(64)                    not null comment '广告位名称',
    valid_status  tinyint(4)                     not null comment '生效状态: 0-有效; 1-无效;',
    position      varchar(32)                    not null comment '位置',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '广告位';

# 广告
create table advertise
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    ad_id          varchar(32) unique             not null comment '广告ID',
    ad_space_id    varchar(32)                    not null comment '广告位ID',
    advertise_name varchar(64)                    not null comment '广告名称',
    image          varchar(128)                   not null comment '广告图片',
    url            varchar(128)                   not null comment '广告调整URL',
    status         tinyint(4)      default 0      not null comment '状态',
    start_time     datetime                       not null comment '开始时间',
    end_time       datetime                       not null comment '结束时间',
    exposure       bigint unsigned default 0      not null comment '广告曝光',
    click          bigint unsigned default 0      not null comment '广告点击',
    default_ad     tinyint(4)      default 0      not null comment '默认广告: 0-否; 1-是;',
    description    varchar(256)                   null comment '描述',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '广告';
create index idx_ad_space_id on advertise (ad_space_id) comment '广告位ID索引';


### 活动 ###

