drop database if exists tsbp_db;
create database tsbp_db;
grant all on tsbp_db.* to tsbp_r with grant option;
set password for tsbp_r = password('12348765');

use tsbp_db;

create table core_user (
    id int unsigned primary key auto_increment,
    email varchar(255) unique,
    core_entity_id bigint unsigned
) engine=innodb;

create table core_operation (
    id int unsigned primary key,
    name varchar(255)
) engine=innodb;

create table core_operation_result (
    id int unsigned primary key,
    core_operation_id int unsigned,
    description varchar(255),
    code varchar(255),
    message varchar(255),
    foreign key (core_operation_id) references core_operation (id)
) engine=innodb;

create table core_process (
    id bigint unsigned primary key auto_increment,
    core_operation_id int unsigned,
    issued_by_id int unsigned,
    started_at datetime,
    finished_at datetime,
    core_operation_result_id int unsigned,
    remarks varchar(255),
    exception text,
    foreign key (core_operation_id) references core_operation (id),
    foreign key (issued_by_id) references core_user (id),
    foreign key (core_operation_result_id) references core_operation_result (id)
) engine=innodb;

create table core_class (
    id int unsigned primary key,
    name varchar(255)
) engine=innodb;

create table core_status (
    id int unsigned primary key,
    core_status_id int unsigned,
    name varchar(255),
    foreign key (core_status_id) references core_status (id)
) engine=innodb;

create table core_entity (
    id bigint unsigned primary key auto_increment,
    core_class_id int unsigned,
    creation_process_id bigint unsigned,
    last_core_log_id bigint unsigned,
    foreign key (core_class_id) references core_class (id),
    foreign key (creation_process_id) references core_process (id)
) engine=innodb;

create table core_event (
    id int unsigned primary key,
    core_entity_id bigint unsigned,
    description varchar(255),
    foreign key (core_entity_id) references core_entity (id)
) engine=innodb;

create table core_transition (
    id int unsigned primary key auto_increment,
    core_event_id int unsigned,
    prev_core_status_id int unsigned,
    post_core_status_id int unsigned,
    foreign key (core_event_id) references core_event (id),
    foreign key (prev_core_status_id) references core_status (id),
    foreign key (post_core_status_id) references core_status (id)
) engine=innodb;

create table core_log (
    id bigint unsigned primary key auto_increment,
    core_entity_id bigint unsigned,
    core_transition_id int unsigned,
    core_status_id int unsigned,
    issued_at datetime,
    process_id bigint unsigned,
    foreign key (core_entity_id) references core_entity (id),
    foreign key (core_transition_id) references core_transition (id),
    foreign key (core_status_id) references core_status (id),
    foreign key (process_id) references core_process (id)
) engine=innodb;

alter table core_user add foreign key (core_entity_id) references core_entity (id);

alter table core_entity add foreign key (last_core_log_id) references core_log (id);