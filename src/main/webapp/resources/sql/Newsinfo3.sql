use news;

drop table if exists newsinfo;

create table newsinfo(
	news_id int(10) auto_increment,
	news_title varchar(25) not null,
	news_summary varchar(50) not null,
	news_content varchar(255) not null,
	createDate date not null,
	author_id int(10) not null,
	topic_id int(10) not null,
	primary key (news_id),
	foreign key (topic_id) references topic(topic_id),
	foreign key (author_id) references manager(manager_id)
)
