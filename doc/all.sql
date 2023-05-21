drop table if exists test;
create table test
(
    id   bigint      not null comment 'id'
        primary key,
    name varchar(50) null comment '名称',
    password varchar(50) comment '密码'
)
    comment '测试' engine = innodb charset=utf8mb4;