drop table if exists city;
drop table if exists hotel;

create table city (id int primary key auto_increment, name varchar(100), state varchar(100), country varchar(200));
create table hotel (city int, name varchar(100), address varchar(200), zip varchar(20));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001')
