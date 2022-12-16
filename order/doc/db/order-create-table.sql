create database mall_oms;
use mall_oms;

### 订单 ###

# 订单
create table `order`
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id       varchar(32) unique             not null comment '订单ID',
    member_id      varchar(32)                    not null comment '会员ID',
    status         tinyint(4) default 0           not null comment '订单状态',
    total_amount   decimal(10, 2)                 not null comment '总金额',
    freight_amount decimal(10, 2)                 not null comment '运费',
    pay_amount     decimal(10, 2)                 not null comment '应付金额',
    order_time     datetime                       null comment '下单时间',
    pay_time       datetime                       null comment '付款时间',
    source_type    varchar(16)                    not null comment '订单来源',
    remark         varchar(256)                   null comment '订单备注',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '订单信息';
create index idx_member_id on `order` (member_id) comment '会员ID索引';

# 订单明细
create table order_item
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id    varchar(32)                    not null comment '订单ID',
    sku_id      varchar(32)                    not null comment '产品SKU_ID',
    count       int                            not null comment '数量',
    price       decimal(10, 2)                 not null comment '单价',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '订单明细';
create index idx_sku_id on order_item (sku_id) comment '产品SKU_ID索引';
create index idx_order_id on order_item (order_id) comment '产品SKU_ID索引';

# 订单优惠
create table order_discount
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id        varchar(32)                    not null comment '订单ID',
    relation_id     varchar(32)                    not null comment '优惠关联ID',
    discount_type   varchar(16)                    not null comment '优惠类型',
    discount_amount decimal(10, 2)                 not null comment '优惠金额',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '订单优惠';
create index idx_order_id on order_discount (order_id) comment '订单ID索引';
create index idx_relation_id on order_discount (relation_id) comment '优惠关联ID索引';

# 订单明细优惠
create table order_item_discount
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id        varchar(32)                    not null comment '订单ID',
    sku_id          varchar(32)                    not null comment '产品SKU_ID',
    relation_id     varchar(32)                    not null comment '优惠关联ID',
    discount_type   varchar(16)                    not null comment '优惠类型',
    discount_amount decimal(10, 2)                 not null comment '优惠金额',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '订单明细优惠';
create index idx_order_id on order_item_discount (order_id) comment '订单ID索引';
create index idx_sku_id on order_item_discount (sku_id) comment '产品SKU_ID索引';
create index idx_relation_id on order_item_discount (relation_id) comment '优惠关联ID索引';

# 订单付款信息
create table order_payment
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id     varchar(32)                    not null comment '订单ID',
    payment_id   varchar(32)                    not null comment '付款流水ID',
    pay_amount   decimal(10, 2)                 not null comment '付款金额',
    pay_method   varchar(16)                    not null comment '付款方式',
    status       tinyint(4) default 0           not null comment '状态',
    confirm_time datetime                       not null comment '付款确认时间',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '订单付款信息';
create index idx_order_id on order_payment (order_id) comment '订单ID索引';
create index idx_payment_id on order_payment (payment_id) comment '付款流水ID索引';

# 物流商
create table logistics_provider
(
    id                      bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_provider_id   varchar(32) unique             not null comment '物流商ID',
    logistics_provider_name varchar(64)                    not null comment '物流商名称',
    level                   tinyint(4)                     not null comment '等级',
    description             varchar(256)                   null comment '描述',
    create_time             datetime                       not null comment '创建时间',
    update_time             datetime                       not null comment '修改时间'
) comment '物流商';


# 物流商联系人
create table logistics_provider_contact
(
    id                    bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_provider_id varchar(32)                    not null comment '物流商ID',
    contract_name         varchar(64)                    not null comment '联系人名称',
    phone_number          varchar(64)                    not null comment '联系人手机号码',
    sort                  int default 0                  not null comment '排序',
    create_time           datetime                       not null comment '创建时间',
    update_time           datetime                       not null comment '修改时间'
) comment '物流商联系人';
create index idx_logistics_provider_id on logistics_provider_contact (logistics_provider_id) comment '物流商ID索引';

# 订单物流信息
create table order_logistics
(
    id                     bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id               varchar(32)                    not null comment '订单ID',
    waybill_no             varchar(32)                    not null comment '物流单号',
    logistics_providers_id varchar(16)                    not null comment '物流商ID',
    status                 tinyint(4)                     not null comment '物流状态',
    province               varchar(32)                    not null comment '省',
    city                   varchar(32)                    not null comment '城市',
    region                 varchar(32)                    not null comment '地区',
    street                 varchar(32)                    not null comment '街道',
    address                varchar(256)                   not null comment '详细地址',
    collect_time           datetime                       null comment '揽收时间',
    delivery_time          datetime                       null comment '发货时间',
    confirm_receipt_time   datetime                       null comment '确认收货时间',
    create_time            datetime                       not null comment '创建时间',
    update_time            datetime                       not null comment '修改时间'
) comment '订单物流信息';
create index idx_order_id on order_logistics (order_id) comment '订单ID索引';
create index idx_waybill_no on order_logistics (waybill_no) comment '物流单号索引';
create index idx_logistics_providers_id on order_logistics (logistics_providers_id) comment '物流商ID索引';
