create database mall_pms;
use mall_pms;

### 分类 ###

# 分类
create table category
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    category_id        varchar(32) unique             not null comment '分类ID',
    parent_category_id varchar(32)                    null comment '父分类ID',
    category_name      varchar(64)                    not null comment '分类名称',
    measure_unit       varchar(16)                    null comment '计量单位',
    icon               varchar(128)                   null comment '图标',
    valid_status       tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    sort               int        default 0           not null comment '排序',
    description        varchar(256)                   null comment '描述',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '分类';


### 品牌 ###

# 品牌
create table brand
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    brand_id     varchar(32) unique             not null comment '品牌ID',
    brand_name   varchar(64)                    not null comment '品牌名称',
    logo         varchar(128)                   null comment '品牌LOGO',
    valid_status tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    sort         int        default 0           not null comment '排序',
    description  varchar(256)                   null comment '介绍描述',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '品牌';

# 品牌分类关系
create table brand_category
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    brand_id    varchar(32)                    not null comment '品牌ID',
    category_id varchar(32)                    not null comment '分类ID',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间',
    constraint unique (brand_id, category_id) comment '分类ID+品牌ID唯一键'
) comment '品牌分类';


### 属性 ###

# 属性
create table attr
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    attr_id       varchar(32) unique             not null comment '属性ID',
    category_id   varchar(32)                    not null comment '分类ID',
    attr_name     varchar(64)                    not null comment '属性名称',
    icon          varchar(128)                   null comment '图标',
    optional_type tinyint(4) default 0           not null comment '可选类型: 0-不可选; 1-可选;',
    attr_type     tinyint(4) default 0           not null comment '属性类型: 0-销售属性; 1-基本属性; 2-BOTH;',
    valid_status  tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    sort          int        default 0           not null comment '排序',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '属性';
create index idx_category_id on attr (category_id) comment '分类ID索引';

# 属性可选值
create table attr_optional_value
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    attr_id     varchar(32)                    not null comment '属性ID',
    value       varchar(64)                    not null comment '值',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '属性可选值';
create index idx_attr_id on attr_optional_value (attr_id) comment '属性ID索引';

# 分组
create table `group`
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    group_id    varchar(32) unique             not null comment '分组ID',
    category_id varchar(32)                    not null comment '分类ID',
    group_name  varchar(64)                    not null comment '分组名称',
    icon        varchar(128)                   null comment '图标',
    sort        int default 0                  not null comment '排序',
    description varchar(256)                   null comment '描述',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '分组';
create index idx_category_id on `group` (category_id) comment '分类ID索引';

# 分组属性
create table group_attr
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    group_id    varchar(32)                    not null comment '分组ID',
    attr_id     varchar(32)                    not null comment '属性ID',
    sort        int default 0                  not null comment '排序',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间',
    constraint unique (group_id, attr_id) comment '分组ID+属性ID唯一索引'
) comment '分组属性';


### 产品SPU ###

# 产品SPU信息
create table product_spu
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    spu_id       varchar(32) unique             not null comment 'SPU_ID',
    brand_id     varchar(32)                    not null comment '品牌ID',
    category_id  varchar(32)                    not null comment '分类ID',
    product_name varchar(64)                    not null comment '产品名称',
    valid_status tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '产品SPU信息';

# 产品详情
create table product_spu_description
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    spu_id      varchar(32) unique             not null comment 'SPU_ID',
    description text                           not null comment '产品详情',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '产品详情';

# 产品SPU图片
create table product_spu_image
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    spu_id        varchar(32)                    not null comment 'SPU_ID',
    image_name    varchar(64)                    null comment '图片名称',
    image_url     varchar(128)                   null comment '图片地址',
    sort        int default 0                  not null comment '排序',
    default_image tinyint(4) default 0           not null comment '默认图片: 0-否; 1-是;',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '产品SPU图片';
create index idx_spu_id on product_spu_image (spu_id) comment 'SPU_ID索引';

# 产品SPU属性
create table product_spu_attr
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    spu_id      varchar(32)                    not null comment 'SPU_ID',
    attr_id     varchar(32)                    not null comment '属性ID',
    attr_name   varchar(64)                    not null comment '属性名称',
    attr_value  varchar(128)                   not null comment '属性值',
    sort        int default 0                  not null comment '排序',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '产品SPU属性';
create index idx_spu_id on product_spu_attr (spu_id) comment 'SPU_ID索引';
create index idx_attr_id on product_spu_attr (attr_id) comment '属性ID索引';


### 产品SKU ###

# 产品SKU信息
create table product_sku
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id        varchar(32) unique             not null comment 'SKU_ID',
    spu_id        varchar(32)                    not null comment 'SPU_ID',
    sku_name      varchar(64)                    not null comment '产品SKU名称',
    title         varchar(128)                   null comment '标题',
    sub_title     varchar(256)                   null comment '副标题',
    price         decimal(10, 2) default 0       not null comment '价格',
    valid_status  tinyint(4)     default 1       not null comment '生效状态: 0-无效; 1-有效;',
    default_image varchar(128)                   not null comment '默认图片',
    description   varchar(256)                   null comment 'SKU描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '产品SKU信息';
create index idx_spu_id on product_sku (spu_id) comment 'SPU_ID索引';

# 产品SKU图片
create table product_sku_image
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id      varchar(32)                    not null comment 'SKU_ID',
    image_name    varchar(64)                    null comment '图片名称',
    image_url     varchar(128)                   null comment '图片地址',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '产品SKU图片';

# 产品SKU销售属性
create table product_sku_sale_attr
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id      varchar(32)                    not null comment 'SKU_ID',
    attr_id     varchar(32)                    not null comment '属性ID',
    attr_name   varchar(64)                    not null comment '属性名称',
    attr_value  varchar(128)                   not null comment '属性值',
    sort        int default 0                  not null comment '排序',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '产品SKU销售属性';
create index idx_sku_id on product_sku_sale_attr (sku_id) comment 'SKU_ID索引';
create index idx_attr_id on product_sku_sale_attr (attr_id) comment '属性ID索引';
