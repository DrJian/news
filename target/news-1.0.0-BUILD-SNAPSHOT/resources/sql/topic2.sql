use news;

drop table if exists topic;
create table topic(
	topic_id int(10) not null auto_increment,
	topic_name varchar(20) not null,
	primary key (topic_id)
)