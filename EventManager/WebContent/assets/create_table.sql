drop app.Users;
drop app.Events;
drop app.Subscriptions;


create table app.Users (
	email varchar(32) primary key,
	password varchar(32) not null

);

create table app.Events  (
	id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	name varchar(32) not null,
	address varchar(128) not null,
	beginning_date timestamp not null,
	end_date timestamp not null,
	published integer default 0 not null,
	email varchar(32) references app.Users(email)
);

create table app.Subscriptions (
	email varchar(32) not null,
	first_name varchar(32) not null,
	last_name varchar(32) not null,
	company varchar(32) not null,
	event integer references app.Events(uuid)
);
