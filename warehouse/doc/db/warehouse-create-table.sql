create database mall_wms;
use mall_wms;

# 仓库
create table warehouse
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id   varchar(32) unique             not null comment '仓库ID',
    warehouse_name varchar(64)                    not null comment '仓库名称',
    status         tinyint(4) default 0           not null comment '状态',
    province       varchar(32)                    not null comment '省',
    city           varchar(32)                    not null comment '城市',
    region         varchar(32)                    not null comment '地区',
    street         varchar(32)                    not null comment '街道',
    address        varchar(256)                   not null comment '详细地址',
    description    varchar(256)                   null comment '描述',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '仓库';

# 仓库管理员
create table warehouse_manager
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id  varchar(32)                    not null comment '仓库ID',
    contract_name varchar(64)                    not null comment '联系人名称',
    phone_number  varchar(64)                    not null comment '联系人手机号码',
    sort          int default 0                  not null comment '排序',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '仓库管理员';
create index idx_warehouse_id on warehouse_manager (warehouse_id) comment '仓库ID索引';

# 仓库库存
create table warehouse_stock
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id    varchar(32)                    not null comment '仓库ID',
    sku_id          varchar(32)                    not null comment '产品SKU_ID',
    lock_count      bigint                         not null comment '锁定数量',
    available_count bigint                         not null comment '可用数量',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '仓库库存';
create index idx_warehouse_id on warehouse_stock (warehouse_id) comment '仓库ID索引';
create index idx_sku_id on warehouse_stock (sku_id) comment '产品SKU_ID索引';

# 仓库库存明细
create table warehouse_stock_detail
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id varchar(32)                    not null comment '仓库ID',
    sku_id       varchar(32)                    not null comment '产品SKU_ID',
    relation_id  varchar(32)                    not null comment '关联ID',
    operator_id  varchar(32)                    not null comment '操作人ID',
    type         tinyint(4) default 0           not null comment '出入库类型',
    count        int                            not null comment '出入库数量',
    remark       varchar(256)                   null comment '备注',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '仓库库存明细';
create index idx_warehouse_id on warehouse_stock_detail (warehouse_id) comment '仓库ID索引';
create index idx_sku_id on warehouse_stock_detail (sku_id) comment '产品SKU_ID索引';
create index idx_relation_id on warehouse_stock_detail (relation_id) comment '关联ID索引';
create index idx_operator_id on warehouse_stock_detail (operator_id) comment '操作人ID索引';

# 供应商
create table supplier
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    supplier_id   varchar(32) unique             not null comment '供应商ID',
    supplier_name varchar(64)                    not null comment '供应商名称',
    level         tinyint(4)                     not null comment '等级',
    status        tinyint(4) default 0           not null comment '状态',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '供应商';

# 供应商联系人
create table supplier_contact
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    supplier_id   varchar(32)                    not null comment '供应商ID',
    contract_name varchar(64)                    not null comment '联系人名称',
    phone_number  varchar(64)                    not null comment '联系人手机号码',
    sort          int default 0                  not null comment '排序',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '供应商联系人';
create index idx_supplier_id on supplier_contact (supplier_id) comment '供应商ID索引';

# 采购单
create table purchase_order
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    purchase_id   varchar(32) unique             not null comment '采购ID',
    supplier_id   varchar(32)                    not null comment '供应商ID',
    creator_id    varchar(32)                    not null comment '创建人ID',
    status        tinyint(4) default 0           not null comment '状态',
    total_amount  decimal(10, 2)                 not null comment '总金额',
    purchase_time datetime                       null comment '采购时间',
    arrival_time  datetime                       null comment '到货时间',
    remark        varchar(256)                   null comment '备注',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '采购单';

# 采购单明细
create table purchase_order_item
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    purchase_id   varchar(32)                    not null comment '采购单ID',
    sku_id        varchar(32)                    not null comment '产品SKU_ID',
    price         decimal(10, 2)                 not null comment '单价',
    count         int                            not null comment '数量',
    arrival_count int default 0                  not null comment '到货数量',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '采购单明细';
create index idx_purchase_id
