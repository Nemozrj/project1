drop table if exists test;
create table test
(
    id   bigint      not null comment 'id'
        primary key,
    name varchar(50) null comment '名称',
    password varchar(50) comment '密码'
)
    comment '测试' engine = innodb charset=utf8mb4;

drop table if exists demo;
create table demo
(
    id   bigint      not null comment 'id'
        primary key,
    name varchar(50) null comment '名称'
)
    comment '测试' engine = innodb charset=utf8mb4;

insert into demo (id,name) values(1, '测试')