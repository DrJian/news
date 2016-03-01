drop database if exists news;
create database news;
use news;
drop table if exists manager;
create table manager(
	manager_id int(10) auto_increment not null,
	account varchar(20) not null,
	password varchar(20) not null,
	manager_name varchar(20) not null,
	primary key (manager_id)
)